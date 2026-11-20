import jdk.internal.org.objectweb.asm.*;
import jdk.internal.org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import static jdk.internal.org.objectweb.asm.Opcodes.*;

/** Patches the Cypress/Extension 16.05 client so the Hub Door actually exists. */
public class Patcher {
    static final int HUB_DOOR_BLOCK_ID = 194;           // free slot (verified at runtime)
    static final String MC = "net/minecraft/client/Minecraft";
    static ClassLoader loader;
    static String L(String c) { return "L" + c + ";"; }

    public static void main(String[] a) throws Exception {
        Path in = Paths.get(a[0]), out = Paths.get(a[1]);
        loader = new java.net.URLClassLoader(new java.net.URL[]{ new File(a[2]).toURI().toURL() }, Patcher.class.getClassLoader());
        Files.createDirectories(out);
        patchExtBlocks(in, out);
        patchHubDoor(in, out);
        patchHubWorld(in, out);
        patchHubGen(in, out);
        patchOverworldGen(in, out);
        System.out.println("patched OK -> " + out);
    }

    static ClassNode read(Path p) throws IOException {
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, ClassReader.SKIP_FRAMES);
        return cn;
    }
    static void write(ClassNode cn, Path out, String name) throws IOException {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS) {
            @Override protected String getCommonSuperClass(String t1, String t2) {
                try {
                    Class<?> c1 = Class.forName(t1.replace('/', '.'), false, loader), c2 = Class.forName(t2.replace('/', '.'), false, loader);
                    if (c1.isAssignableFrom(c2)) return t1;
                    if (c2.isAssignableFrom(c1)) return t2;
                    if (c1.isInterface() || c2.isInterface()) return "java/lang/Object";
                    do { c1 = c1.getSuperclass(); } while (!c1.isAssignableFrom(c2));
                    return c1.getName().replace('.', '/');
                } catch (Exception e) { throw new RuntimeException(e); }
            }
        };
        cn.accept(cw);
        Files.write(out.resolve(name + ".class"), cw.toByteArray());
    }

    // ---- 1. ExtBlocks registration method: actually create + register the Hub Door block ----------------
    static void patchExtBlocks(Path in, Path out) throws IOException {
        ClassNode cn = read(in.resolve(N.EXTB + ".class"));
        MethodNode clinit = null;
        for (MethodNode m : cn.methods) if (m.name.equals(N.M_EXTB_INIT)) clinit = m;
        // sanity: field must exist and must not already be assigned
        for (AbstractInsnNode i : clinit.instructions)
            if (i instanceof FieldInsnNode f && f.getOpcode() == PUTSTATIC && f.name.equals(N.F_HUBDOORBLOCK))
                throw new IllegalStateException("hub door already assigned - wrong jar version?");
        InsnList add = new InsnList();
        add.add(new TypeInsnNode(NEW, N.HD));
        add.add(new InsnNode(DUP));
        add.add(new IntInsnNode(SIPUSH, HUB_DOOR_BLOCK_ID));
        add.add(new FieldInsnNode(GETSTATIC, N.MATERIAL, N.F_IRON, L(N.MATERIAL)));
        add.add(new MethodInsnNode(INVOKESPECIAL, N.HD, "<init>", "(I" + L(N.MATERIAL) + ")V", false));
        add.add(new LdcInsnNode(5.0f));
        add.add(new MethodInsnNode(INVOKEVIRTUAL, N.BLOCK, N.M_HARD, "(F)" + L(N.BLOCK), false));
        add.add(new FieldInsnNode(GETSTATIC, N.BLOCK, N.F_SOUNDMETAL, L(N.STEPSOUND)));
        add.add(new MethodInsnNode(INVOKEVIRTUAL, N.BLOCK, N.M_STEP, "(" + L(N.STEPSOUND) + ")" + L(N.BLOCK), false));
        add.add(new LdcInsnNode("Hub Door"));
        add.add(new MethodInsnNode(INVOKEVIRTUAL, N.BLOCK, N.M_NAME, "(Ljava/lang/String;)" + L(N.BLOCK), false));
        add.add(new IntInsnNode(BIPUSH, 32));
        add.add(new MethodInsnNode(INVOKEVIRTUAL, N.BLOCK, N.M_X32, "(I)" + L(N.BLOCK), false));
        add.add(new FieldInsnNode(PUTSTATIC, N.EXTB, N.F_HUBDOORBLOCK, L(N.BLOCK)));
        int returns = 0;
        for (AbstractInsnNode i : clinit.instructions.toArray())
            if (i.getOpcode() == RETURN) { clinit.instructions.insertBefore(i, cloneList(add)); returns++; }
        if (returns != 1) System.out.println("note: <clinit> had " + returns + " returns");
        write(cn, out, N.EXTB);
    }

    static InsnList cloneList(InsnList src) {
        Map<LabelNode, LabelNode> map = new HashMap<>();
        InsnList r = new InsnList();
        for (AbstractInsnNode i : src) if (i instanceof LabelNode l) map.put(l, new LabelNode());
        for (AbstractInsnNode i : src) r.add(i.clone(map));
        return r;
    }

    // ---- 2. BlockHubDoor: nexus behaviour, cooldown, self-drop -----------------------------
    static void patchHubDoor(Path in, Path out) throws IOException {
        ClassNode cn = read(in.resolve(N.HD + ".class"));

        cn.fields.add(new FieldNode(ACC_PUBLIC | ACC_STATIC, "hubLastEntity", "Ljava/lang/Object;", null, null));
        cn.fields.add(new FieldNode(ACC_PUBLIC | ACC_STATIC, "hubLastTick", "I", null, null));

        // static boolean hubCanUse(Entity e): ignore for 2s after arriving; 3s re-arm after a use
        MethodNode can = new MethodNode(ACC_PUBLIC | ACC_STATIC, "hubCanUse", "(" + L(N.ENTITY) + ")Z", null, null);
        LabelNode no = new LabelNode(), yes = new LabelNode(), skip = new LabelNode();
        InsnList c = can.instructions;
        c.add(new VarInsnNode(ALOAD, 0)); c.add(new FieldInsnNode(GETFIELD, N.ENTITY, N.F_TICKS, "I")); c.add(new VarInsnNode(ISTORE, 1));
        c.add(new VarInsnNode(ILOAD, 1)); c.add(new IntInsnNode(BIPUSH, 40)); c.add(new JumpInsnNode(IF_ICMPLT, no));
        c.add(new VarInsnNode(ALOAD, 0)); c.add(new FieldInsnNode(GETSTATIC, N.HD, "hubLastEntity", "Ljava/lang/Object;")); c.add(new JumpInsnNode(IF_ACMPNE, yes));
        c.add(new VarInsnNode(ILOAD, 1)); c.add(new FieldInsnNode(GETSTATIC, N.HD, "hubLastTick", "I")); c.add(new InsnNode(ISUB));
        c.add(new IntInsnNode(BIPUSH, 60)); c.add(new JumpInsnNode(IF_ICMPLT, no));
        c.add(yes);
        c.add(new VarInsnNode(ALOAD, 0)); c.add(new FieldInsnNode(PUTSTATIC, N.HD, "hubLastEntity", "Ljava/lang/Object;"));
        c.add(new VarInsnNode(ILOAD, 1)); c.add(new FieldInsnNode(PUTSTATIC, N.HD, "hubLastTick", "I"));
        c.add(new InsnNode(ICONST_1)); c.add(new InsnNode(IRETURN));
        c.add(no); c.add(new InsnNode(ICONST_0)); c.add(new InsnNode(IRETURN));
        cn.methods.add(can);

        // prefix for onEntityCollidedWithBlock(World,int,int,int,Entity)
        MethodNode col = null;
        for (MethodNode m : cn.methods) if (m.name.equals(N.M_COLLIDE)) col = m;
        LabelNode orig = new LabelNode(), ret = new LabelNode();
        InsnList p = new InsnList();
        p.add(new VarInsnNode(ALOAD, 5)); p.add(new TypeInsnNode(INSTANCEOF, N.PLAYER)); p.add(new JumpInsnNode(IFEQ, orig));
        p.add(new VarInsnNode(ALOAD, 5)); p.add(new MethodInsnNode(INVOKESTATIC, N.HD, "hubCanUse", "(" + L(N.ENTITY) + ")Z", false)); p.add(new JumpInsnNode(IFEQ, ret));
        p.add(new VarInsnNode(ALOAD, 1)); p.add(new TypeInsnNode(INSTANCEOF, N.HUBWORLD)); p.add(new JumpInsnNode(IFEQ, orig));
        // inside the hub: every Hub Door opens the world picker (only if no other GUI is open)
        p.add(new FieldInsnNode(GETSTATIC, N.HOLDER, N.F_MC, L(MC)));
        p.add(new FieldInsnNode(GETFIELD, MC, N.F_CURSCREEN, L(N.GUISCREEN)));
        p.add(new JumpInsnNode(IFNONNULL, ret));
        p.add(new FieldInsnNode(GETSTATIC, N.HOLDER, N.F_MC, L(MC)));
        p.add(new TypeInsnNode(NEW, N.GSW)); p.add(new InsnNode(DUP)); p.add(new InsnNode(ACONST_NULL));
        p.add(new MethodInsnNode(INVOKESPECIAL, N.GSW, "<init>", "(" + L(N.GUISCREEN) + ")V", false));
        p.add(new MethodInsnNode(INVOKEVIRTUAL, MC, N.M_DISPLAYGUI, "(" + L(N.GUISCREEN) + ")V", false));
        p.add(ret); p.add(new InsnNode(RETURN));
        p.add(orig);
        col.instructions.insert(p);

        // idDropped: top half drops nothing, bottom half drops the Hub Door item
        MethodNode drop = new MethodNode(ACC_PUBLIC, N.M_IDDROPPED, "(ILjava/util/Random;)I", null, null);
        LabelNode bottom = new LabelNode();
        InsnList d = drop.instructions;
        d.add(new VarInsnNode(ILOAD, 1)); d.add(new IntInsnNode(BIPUSH, 8)); d.add(new InsnNode(IAND)); d.add(new JumpInsnNode(IFEQ, bottom));
        d.add(new InsnNode(ICONST_0)); d.add(new InsnNode(IRETURN));
        d.add(bottom);
        d.add(new FieldInsnNode(GETSTATIC, N.EXTI, N.F_HUBITEM, L(N.ITEM)));
        d.add(new FieldInsnNode(GETFIELD, N.ITEM, N.F_SHIFTED, "I"));
        d.add(new InsnNode(IRETURN));
        cn.methods.add(drop);

        write(cn, out, N.HD);
    }

    // ---- 3. HubWorld: make a fresh hub load (no endless spawn search) and give it exit doors ----
    static void patchHubWorld(Path in, Path out) throws IOException {
        ClassNode cn = read(in.resolve(N.HUBWORLD + ".class"));

        // (a) isValidSpawn(int,int): always accept -> World constructor's spawn search ends at once
        MethodNode spawn = null, ctor = null;
        for (MethodNode m : cn.methods) {
            if (m.name.equals(N.M_8ex3J) && m.desc.equals("(II)Z")) spawn = m;
            if (m.name.equals("<init>")) ctor = m;
        }
        spawn.instructions.clear(); spawn.tryCatchBlocks.clear(); spawn.localVariables = null;
        spawn.instructions.add(new InsnNode(ICONST_1)); spawn.instructions.add(new InsnNode(IRETURN));

        // (b) setSpawnLocation(): the base version wanders forever when nothing solid is at y=63; hub never needs it
        MethodNode noop = new MethodNode(ACC_PUBLIC, N.M_8Mhk7, "()V", null, null);
        noop.instructions.add(new InsnNode(RETURN));
        cn.methods.add(noop);

        // (c) the maze: own save folder, spawn in the start cell (no stray doors; the maze brings its own)
        for (AbstractInsnNode i : ctor.instructions.toArray())
            if (i instanceof LdcInsnNode l && "hub".equals(l.cst)) l.cst = "hubmaze";
        InsnList add = new InsnList();
        add.add(new VarInsnNode(ALOAD, 0)); add.add(new MethodInsnNode(INVOKESTATIC, "HubMaze", "startX", "()I", false));
        add.add(new FieldInsnNode(PUTFIELD, N.WORLD, N.F_SPAWNX, "I"));
        add.add(new VarInsnNode(ALOAD, 0)); add.add(new InsnNode(ICONST_1));
        add.add(new FieldInsnNode(PUTFIELD, N.WORLD, N.F_SPAWNY, "I"));
        add.add(new VarInsnNode(ALOAD, 0)); add.add(new MethodInsnNode(INVOKESTATIC, "HubMaze", "startZ", "()I", false));
        add.add(new FieldInsnNode(PUTFIELD, N.WORLD, N.F_SPAWNZ, "I"));
        for (AbstractInsnNode i : ctor.instructions.toArray())
            if (i.getOpcode() == RETURN) ctor.instructions.insertBefore(i, cloneList(add));
        write(cn, out, N.HUBWORLD);
    }

    // ---- 4. hub chunk generator: build the maze instead of the flat DEBUG floor ----
    static void patchHubGen(Path in, Path out) throws IOException {
        ClassNode cn = read(in.resolve(N.HUBGEN + ".class"));
        MethodNode m = null;
        for (MethodNode mm : cn.methods) if (mm.name.equals(N.M_GETCHUNK) && mm.desc.startsWith("(II)")) m = mm;
        AbstractInsnNode light = null;
        for (AbstractInsnNode i : m.instructions)
            if (i instanceof MethodInsnNode mi && mi.getOpcode() == INVOKEVIRTUAL && mi.name.equals(N.M_CHUNKLIGHT)) light = i;
        AbstractInsnNode before = light.getPrevious();             // the aload that loads the chunk
        InsnList add = new InsnList();
        add.add(new VarInsnNode(ALOAD, 3)); add.add(new FieldInsnNode(GETFIELD, N.CHUNK, N.CH_BLOCKS, "[B"));
        add.add(new VarInsnNode(ALOAD, 3)); add.add(new FieldInsnNode(GETFIELD, N.CHUNK, N.CH_NIB1, L(N.NIBBLE)));
        add.add(new FieldInsnNode(GETFIELD, N.NIBBLE, N.NIB_BYTES, "[B"));
        add.add(new VarInsnNode(ALOAD, 3)); add.add(new FieldInsnNode(GETFIELD, N.CHUNK, N.CH_NIB3, L(N.NIBBLE)));
        add.add(new FieldInsnNode(GETFIELD, N.NIBBLE, N.NIB_BYTES, "[B"));
        add.add(new VarInsnNode(ILOAD, 1)); add.add(new VarInsnNode(ILOAD, 2));
        add.add(new MethodInsnNode(INVOKESTATIC, "HubMaze", "fill", "([B[B[BII)V", false));
        m.instructions.insertBefore(before, add);
        write(cn, out, N.HUBGEN);
    }

    // ---- 6. overworld terrain generator: rarely place a Hub Door at the end of chunk populate ----
    static void patchOverworldGen(Path in, Path out) throws IOException {
        ClassNode cn = read(in.resolve(N.OVERGEN + ".class"));
        MethodNode m = null;
        for (MethodNode mm : cn.methods) if (mm.name.equals(N.M_POPBODY) && mm.desc.endsWith("II)V")) m = mm;
        InsnList add = new InsnList();
        add.add(new VarInsnNode(ALOAD, 0)); add.add(new FieldInsnNode(GETFIELD, N.OVERGEN, N.F_OVWORLD, L(N.WORLD)));
        add.add(new VarInsnNode(ILOAD, 2)); add.add(new VarInsnNode(ILOAD, 3));
        add.add(new VarInsnNode(ALOAD, 0)); add.add(new FieldInsnNode(GETFIELD, N.OVERGEN, N.F_OVWORLD, L(N.WORLD)));
        add.add(new FieldInsnNode(GETFIELD, N.WORLD, N.F_SEED, "J"));
        add.add(new LdcInsnNode(N.WORLD)); add.add(new LdcInsnNode(N.M_1067Q)); add.add(new LdcInsnNode(N.M_662aR));
        add.add(new MethodInsnNode(INVOKESTATIC, "HubSpawner", "maybePlace", "(Ljava/lang/Object;IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false));
        for (AbstractInsnNode i : m.instructions.toArray())
            if (i.getOpcode() == RETURN) m.instructions.insertBefore(i, cloneList(add));
        write(cn, out, N.OVERGEN);
    }

    static AbstractInsnNode ldc(int v) {
        if (v >= -1 && v <= 5) return new InsnNode(ICONST_0 + v);
        if (v >= -128 && v <= 127) return new IntInsnNode(BIPUSH, v);
        return new IntInsnNode(SIPUSH, v);
    }
}
