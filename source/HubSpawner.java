import java.lang.reflect.Method;
import java.util.Random;

/**
 * Rarely places a Hub Door on the surface of a freshley populated overworld chunk.
 * Pure Java; the patched terrain generator hands over the world and the (obfuscated) method names.
 */
public final class HubSpawner {
    /** one door per ~ONE_IN chunks on average (public so tests can raise it) */
    public static volatile int oneIn = 250;
    public static final int DOOR = 194;

    private static Method getId, setBlock;
    private static Class<?> cachedFor;

    private static long mix(long seed, int cx, int cz) {
        long h = seed ^ 0x5DEECE66DL;
        h = h * 0x9E3779B97F4A7C15L + cx * 0xC2B2AE3D27D4EB4FL;
        h = h * 0x9E3779B97F4A7C15L + cz * 0x165667B19E3779F9L;
        h ^= (h >>> 31); h *= 0xBF58476D1CE4E5B9L; h ^= (h >>> 29);
        return h;
    }

    /** natural surface blocks we are willing to stand a door on */
    private static boolean solidGround(int id) { return id == 1 || id == 2 || id == 3 || id == 12 || id == 13; }

    /** called at the end of the overworld chunk populate step */
    public static void maybePlace(Object world, int cx, int cz, long seed, String worldClass, String getIdName, String setName) {
        try {
            if (world == null || !world.getClass().getName().equals(worldClass)) return;   // plain overworld only (not special game modes)
            long h = mix(seed, cx, cz);
            if (Math.floorMod(h >>> 8, (long) oneIn) != 0) return;
            if (cachedFor != world.getClass()) {
                getId = world.getClass().getMethod(getIdName, int.class, int.class, int.class);
                setBlock = world.getClass().getMethod(setName, int.class, int.class, int.class, int.class, int.class);
                cachedFor = world.getClass();
            }
            Random r = new Random(h);
            int x = cx * 16 + 3 + r.nextInt(10), z = cz * 16 + 3 + r.nextInt(10);
            int meta = r.nextInt(4);
            int y = 127;
            while (y > 1 && (Integer) getId.invoke(world, x, y, z) == 0) y--;     // topmost non-air block
            if (!solidGround((Integer) getId.invoke(world, x, y, z))) return;      // not water, trees, lava, ice...
            if ((Integer) getId.invoke(world, x, y + 1, z) != 0 || (Integer) getId.invoke(world, x, y + 2, z) != 0) return;
            setBlock.invoke(world, x, y + 2, z, DOOR, 8 | meta);                   // upper half first
            setBlock.invoke(world, x, y + 1, z, DOOR, meta);
        } catch (Throwable t) { /* never break world generation */ }
    }
}
