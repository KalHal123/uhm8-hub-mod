import jdk.internal.org.objectweb.asm.*;
import jdk.internal.org.objectweb.asm.commons.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import java.util.zip.*;

public class RemapJar {
    static final Map<String,String> MAP = new HashMap<>();

    public static void main(String[] args) throws Exception {
        String inJar = args[0], outJar = args[1], mapFile = args[2];
        for (String line : Files.readAllLines(Paths.get(mapFile))) {
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;
            String[] p = line.split("\\s+");
            if (p.length >= 2) MAP.put(p[0], p[1]);
        }

        Remapper remapper = new Remapper() {
            @Override public String map(String name) {
                String n = MAP.get(name);
                return n != null ? n : name;
            }
        };

        try (ZipFile in = new ZipFile(inJar); JarOutputStream out = new JarOutputStream(new FileOutputStream(outJar))) {
            Enumeration<? extends ZipEntry> e = in.entries();
            while (e.hasMoreElements()) {
                ZipEntry ent = e.nextElement();
                String name = ent.getName();
                if (name.endsWith(".class")) {
                    String internal = name.substring(0, name.length() - 6);
                    String newInternal = MAP.getOrDefault(internal, internal);
                    byte[] b = in.getInputStream(ent).readAllBytes();
                    ClassWriter cw = new ClassWriter(0);
                    ClassRemapper cm = new ClassRemapper(cw, remapper);
                    ClassReader cr = new ClassReader(b);
                    cr.accept(cm, 0);
                    byte[] outb = cw.toByteArray();
                    out.putNextEntry(new ZipEntry(newInternal + ".class"));
                    out.write(outb);
                    out.closeEntry();
                } else {
                    out.putNextEntry(new ZipEntry(name));
                    try (InputStream is = in.getInputStream(ent)) {
                        byte[] buf = new byte[8192];
                        int r; while ((r = is.read(buf)) > 0) out.write(buf, 0, r);
                    }
                    out.closeEntry();
                }
            }
        }
        System.out.println("Remapped " + inJar + " -> " + outJar);
    }
}