import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;

/**
 * Local stand-in for the Hub server.
 * Every running game instance registers itself in a small shared folder. A dead-end Hub Door visits the
 * world of another registered instance; the "home" door returns to the world you came from.
 *
 * Visits always load a PRIVATE SNAPSHOT of the other world (copied into this instance's own saves folder
 * as visit_<name>), never the live folder. That avoids the game's session.lock and can't corrupt the host.
 */
public final class HubNet {
    public static final String HUB_SAVE = "hubmaze";

    static volatile File mySaves;
    static volatile String home;            // last real world played in this instance, e.g. "World1"
    static volatile boolean visitFlag;

    // ------------------------------------------------------------------ registry
    static File dir() {
        String o = System.getProperty("cypress.hub.dir");
        if (o == null || o.isEmpty()) o = System.getenv("CYPRESS_HUB_DIR");
        if (o == null || o.isEmpty())
            o = new File(System.getProperty("java.io.tmpdir"), "cypress-hub-" + System.getProperty("user.name", "user")).getPath();
        File d = new File(o); d.mkdirs(); return d;
    }

    static String idOf(File saves) {
        return Integer.toHexString(saves.getAbsoluteFile().toString().hashCode());
    }

    /** nicest human name for an instance: nearest ancestor that isn't .minecraft / minecraft / saves */
    static String nameOf(File saves) {
        File f = saves.getAbsoluteFile();
        while (f != null) {
            String n = f.getName();
            if (!n.isEmpty() && !n.equalsIgnoreCase("saves") && !n.equalsIgnoreCase(".minecraft") && !n.equalsIgnoreCase("minecraft")) return n;
            f = f.getParentFile();
        }
        return "instance";
    }

    static String safe(String s) { return s.replaceAll("[^A-Za-z0-9_-]", "_"); }

    /** called by the patched Minecraft.startWorld(String) */
    public static void onStartWorld(File saves, String world) {
        try {
            mySaves = saves;
            if (world != null && !world.startsWith("visit_") && !world.equals(HUB_SAVE)) home = world;
            register();
        } catch (Throwable t) { /* never break the game */ }
    }

    static void register() throws IOException {
        if (mySaves == null) return;
        Properties p = new Properties();
        p.setProperty("name", nameOf(mySaves));
        p.setProperty("saves", mySaves.getAbsoluteFile().getPath());
        if (home != null) p.setProperty("world", home);
        p.setProperty("time", Long.toString(System.currentTimeMillis()));
        File f = new File(dir(), idOf(mySaves) + ".properties");
        try (OutputStream o = new FileOutputStream(f)) { p.store(o, "Cypress hub peer"); }
    }

    public static final class Peer {
        public String id, name, world; public File saves;
        public String toString() { return name + " (" + world + ")"; }
    }

    /** other registered instances that have a loadable world, sorted by name/id */
    public static List<Peer> peers() {
        List<Peer> out = new ArrayList<Peer>();
        File[] fs = dir().listFiles();
        if (fs == null || mySaves == null) return out;
        String me = idOf(mySaves);
        for (File f : fs) {
            if (!f.getName().endsWith(".properties")) continue;
            String id = f.getName().substring(0, f.getName().length() - 11);
            if (id.equals(me)) continue;
            try (InputStream in = new FileInputStream(f)) {
                Properties p = new Properties(); p.load(in);
                Peer peer = new Peer();
                peer.id = id; peer.name = p.getProperty("name", id);
                peer.saves = new File(p.getProperty("saves", ""));
                peer.world = p.getProperty("world");
                if (peer.world == null || !new File(new File(peer.saves, peer.world), "level.dat").isFile()) continue;
                out.add(peer);
            } catch (Throwable t) { /* skip broken entries */ }
        }
        Collections.sort(out, new Comparator<Peer>() {
            public int compare(Peer a, Peer b) { int c = a.name.compareToIgnoreCase(b.name); return c != 0 ? c : a.id.compareTo(b.id); }
        });
        return out;
    }

    // ------------------------------------------------------------------ routing (called when a hub door is touched)
    /** @return the world folder name to load, or null to fall back to the world picker */
    public static String route(int x, int z) {
        try {
            int kind = HubMaze.doorKindAt(x, z);
            if (kind == 1) return (home != null && mySaves != null && new File(new File(mySaves, home), "level.dat").isFile()) ? home : null;
            if (kind >= 2) {
                List<Peer> ps = peers();
                if (ps.isEmpty()) return null;
                return prepareVisit(ps.get((kind - 2) % ps.size()));
            }
        } catch (Throwable t) { t.printStackTrace(); }
        return null;
    }

    public static boolean consumeVisitFlag() { boolean v = visitFlag; visitFlag = false; return v; }

    /** copy the peer's world into our own saves as visit_<name>, strip the host's player, return the folder name */
    static String prepareVisit(Peer p) {
        try {
            String name = "visit_" + safe(p.name);
            File src = new File(p.saves, p.world), dst = new File(mySaves, name);
            deleteTree(dst);
            copyTree(src.toPath(), dst.toPath());
            stripPlayer(new File(dst, "level.dat"));
            visitFlag = true;
            return name;
        } catch (Throwable t) { t.printStackTrace(); return null; }
    }

    static void deleteTree(File f) {
        if (!f.exists()) return;
        File[] kids = f.listFiles();
        if (kids != null) for (File k : kids) deleteTree(k);
        f.delete();
    }

    static void copyTree(final Path src, final Path dst) throws IOException {
        Files.walkFileTree(src, new SimpleFileVisitor<Path>() {
            public FileVisitResult preVisitDirectory(Path d, java.nio.file.attribute.BasicFileAttributes a) throws IOException {
                Files.createDirectories(dst.resolve(src.relativize(d).toString())); return FileVisitResult.CONTINUE;
            }
            public FileVisitResult visitFile(Path f, java.nio.file.attribute.BasicFileAttributes a) throws IOException {
                if (f.getFileName().toString().equals("session.lock")) return FileVisitResult.CONTINUE;
                try { Files.copy(f, dst.resolve(src.relativize(f).toString()), StandardCopyOption.REPLACE_EXISTING); }
                catch (NoSuchFileException e) { /* file vanished while the host saved: skip */ }
                return FileVisitResult.CONTINUE;
            }
        });
    }

    /** places a Hub Door two blocks from where the visitor appeared (best effort, via reflection on the game's world) */
    public static void placeReturnDoor(Object world, double px, double py, double pz, String setter, int doorId) {
        try {
            int x = (int) Math.floor(px) + 2, z = (int) Math.floor(pz), y = (int) Math.floor(py - 1.62 + 0.1);
            java.lang.reflect.Method m = world.getClass().getMethod(setter, int.class, int.class, int.class, int.class, int.class);
            m.invoke(world, x, y + 1, z, doorId, 8 | 1);
            m.invoke(world, x, y, z, doorId, 1);
        } catch (Throwable t) { t.printStackTrace(); }
    }

    // ------------------------------------------------------------------ tiny NBT editor (gzip, big endian)
    static void stripPlayer(File levelDat) throws IOException {
        Object[] root;
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new FileInputStream(levelDat))))) {
            int type = in.readByte(); if (type != 10) throw new IOException("level.dat root is not a compound");
            String name = in.readUTF();
            root = new Object[]{name, readPayload(in, 10)};
        }
        @SuppressWarnings("unchecked") Map<String, Object[]> top = (Map<String, Object[]>) root[1];
        top.remove("Player");
        Object[] data = top.get("Data");
        if (data != null) { @SuppressWarnings("unchecked") Map<String, Object[]> d = (Map<String, Object[]>) data[1]; d.remove("Player"); }
        try (DataOutputStream out = new DataOutputStream(new GZIPOutputStream(new FileOutputStream(levelDat)))) {
            out.writeByte(10); out.writeUTF((String) root[0]); writePayload(out, 10, top);
        }
    }

    /** compound = LinkedHashMap<String, Object[]{Integer type, Object value}> ; list = Object[]{Integer elemType, List} */
    static Object readPayload(DataInputStream in, int type) throws IOException {
        switch (type) {
            case 1: return in.readByte();
            case 2: return in.readShort();
            case 3: return in.readInt();
            case 4: return in.readLong();
            case 5: return in.readFloat();
            case 6: return in.readDouble();
            case 7: { byte[] b = new byte[in.readInt()]; in.readFully(b); return b; }
            case 8: return in.readUTF();
            case 9: {
                int et = in.readByte(), n = in.readInt(); List<Object> l = new ArrayList<Object>();
                for (int i = 0; i < n; i++) l.add(readPayload(in, et));
                return new Object[]{et, l};
            }
            case 10: {
                Map<String, Object[]> m = new LinkedHashMap<String, Object[]>();
                while (true) {
                    int t = in.readByte(); if (t == 0) break;
                    String k = in.readUTF(); m.put(k, new Object[]{t, readPayload(in, t)});
                }
                return m;
            }
            default: throw new IOException("bad NBT tag " + type);
        }
    }

    @SuppressWarnings("unchecked")
    static void writePayload(DataOutputStream out, int type, Object v) throws IOException {
        switch (type) {
            case 1: out.writeByte((Byte) v); break;
            case 2: out.writeShort((Short) v); break;
            case 3: out.writeInt((Integer) v); break;
            case 4: out.writeLong((Long) v); break;
            case 5: out.writeFloat((Float) v); break;
            case 6: out.writeDouble((Double) v); break;
            case 7: out.writeInt(((byte[]) v).length); out.write((byte[]) v); break;
            case 8: out.writeUTF((String) v); break;
            case 9: { Object[] a = (Object[]) v; List<Object> l = (List<Object>) a[1]; out.writeByte((Integer) a[0]); out.writeInt(l.size());
                      for (Object o : l) writePayload(out, (Integer) a[0], o); break; }
            case 10: { Map<String, Object[]> m = (Map<String, Object[]>) v;
                       for (Map.Entry<String, Object[]> e : m.entrySet()) { out.writeByte((Integer) e.getValue()[0]); out.writeUTF(e.getKey()); writePayload(out, (Integer) e.getValue()[0], e.getValue()[1]); }
                       out.writeByte(0); break; }
            default: throw new IOException("bad NBT tag " + type);
        }
    }
}
