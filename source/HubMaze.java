import java.util.*;

/**
 * Procedural "Hub" maze for Cypress / Extension 16.05 R4.
 * Pure Java, no game classes: the patched chunk generator hands us the raw arrays.
 *
 * Layout (all deterministic, the same on every machine):
 *   - W x H cells. Each cell is a 3x3 room; walls are 2 blocks thick, so the pitch is 5.
 *   - y=0 tile floor, y=1..3 open hallway (3 wide, 3 tall), y=4 ceiling.
 *   - Dimension Wall walls, green/blue tile floor, torches high on walls,
 *     green glass windows with a "greenscreen" block behind them, green pillars at some junctions.
 *   - Hub Doors in dead ends (with a small pond beside them) and one "home" door in the start cell.
 *   - Origin: world position of the maze start cell center. Default (0,0) means the maze
 *     starts at the calculated offset; setOrigin(ox, oz) shifts the whole maze so the start cell
 *     center is at world (0,0).
 */
public final class HubMaze {
    // block ids of this build
    public static final int WALL = 96, TILE_A = 146, TILE_B = 98, GLASS = 127, GREEN = 111,
                            TORCH = 50, DOOR = 194, WATER = 9;
    public static final int W = 20, H = 20, P = 5;
    public static final long SEED = 16050L;
    public static final int SX = W * P + 2, SZ = H * P + 2, SY = 6;   // extent in blocks

    // passages: east[i][j] joins (i,j)-(i+1,j); south[i][j] joins (i,j)-(i,j+1)
    private static final boolean[][] east = new boolean[W][H], south = new boolean[W][H];
    private static final byte[] blk = new byte[SX * SZ * SY];
    private static final byte[] met = new byte[SX * SZ * SY];
    private static final byte[] lgt = new byte[SX * SZ * SY];
    /** doors: {x, z, side(0=N,1=E,2=S,3=W), kind}; kind 1 = home, 2.. = instance doors */
    public static final List<int[]> DOORS = new ArrayList<int[]>();
    private static final Map<Long, Integer> doorKind = new HashMap<Long, Integer>();
    public static final int START_I = W / 2, START_J = H / 2;

    // origin: world offset so that start cell center is at (originX + startX(), originZ + startZ())
    private static int originX = 0, originZ = 0;

    // ------------------------------------------------------------------ helpers
    private static int idx(int x, int z, int y) { return (x * SZ + z) * SY + y; }
    private static long key(int x, int z) { return (((long) x) << 32) ^ (z & 0xffffffffL); }
    private static int hash(int a, int b, int c) {
        long h = SEED * 0x9E3779B97F4A7C15L + a * 0xC2B2AE3D27D4EB4FL + b * 0x165667B19E3779F9L + c * 0x27D4EB2F165667C5L;
        h ^= (h >>> 29); h *= 0xBF58476D1CE4E5B9L; h ^= (h >>> 32);
        return (int) (h & 0x7fffffff);
    }
    private static boolean passage(int i, int j, int side) {          // 0=N 1=E 2=S 3=W
        switch (side) {
            case 0: return j > 0 && south[i][j - 1];
            case 1: return i < W - 1 && east[i][j];
            case 2: return j < H - 1 && south[i][j];
            default: return i > 0 && east[i - 1][j];
        }
    }
    private static int passages(int i, int j) {
        int n = 0; for (int s = 0; s < 4; s++) if (passage(i, j, s)) n++; return n;
    }
    private static void set(int x, int z, int y, int id) { blk[idx(x, z, y)] = (byte) id; }
    private static void setMeta(int x, int z, int y, int m) { met[idx(x, z, y)] = (byte) m; }

    // ------------------------------------------------------------------ build
    private static void build() {
        carve();
        baseBlocks();
        torches();
        doors();
        light();
    }

    /** recursive backtracker + a few extra openings so there are real intersections */
    private static void carve() {
        Random r = new Random(SEED);
        boolean[][] seen = new boolean[W][H];
        int[] stack = new int[W * H]; int sp = 0;
        stack[sp++] = START_I * H + START_J; seen[START_I][START_J] = true;
        int[] di = {0, 1, 0, -1}, dj = {-1, 0, 1, 0};
        while (sp > 0) {
            int cur = stack[sp - 1], i = cur / H, j = cur % H;
            int[] order = {0, 1, 2, 3};
            for (int k = 3; k > 0; k--) { int q = r.nextInt(k + 1); int t = order[k]; order[k] = order[q]; order[q] = t; }
            boolean moved = false;
            for (int s : order) {
                int ni = i + di[s], nj = j + dj[s];
                if (ni < 0 || nj < 0 || ni >= W || nj >= H || seen[ni][nj]) continue;
                if (s == 0) south[i][j - 1] = true; else if (s == 2) south[i][j] = true;
                else if (s == 1) east[i][j] = true; else east[i - 1][j] = true;
                seen[ni][nj] = true; stack[sp++] = ni * H + nj; moved = true; break;
            }
            if (!moved) sp--;
        }
        for (int i = 0; i < W; i++) for (int j = 0; j < H; j++) {   // braid: ~7% extra openings
            if (i < W - 1 && !east[i][j] && r.nextInt(100) < 7) east[i][j] = true;
            if (j < H - 1 && !south[i][j] && r.nextInt(100) < 7) south[i][j] = true;
        }
    }

    private static boolean isInterior(int t) { return t >= 2; }

    private static void baseBlocks() {
        for (int x = 0; x < SX; x++) for (int z = 0; z < SZ; z++) {
            boolean outer = x < 2 || z < 2 || x >= W * P || z >= H * P;     // outermost wall pair
            int ci = Math.min(x / P, W - 1), cj = Math.min(z / P, H - 1);
            int tx = x - (x / P) * P, tz = z - (z / P) * P;
            // floor + ceiling
            boolean open;                                  // is this column open at y=1..3 ?
            if (outer) open = false;
            else if (isInterior(tx) && isInterior(tz)) open = true;
            else if (isInterior(tx) && !isInterior(tz)) open = passage(ci, cj, 0);     // wall pair north of cell (ci,cj)
            else if (!isInterior(tx) && isInterior(tz)) open = passage(ci, cj, 3);     // wall pair west of cell (ci,cj)
            else open = false;                             // junction post
            set(x, z, 0, open ? (((x + z) & 1) == 0 ? TILE_A : TILE_B) : WALL);
            set(x, z, 4, WALL);
            for (int y = 1; y <= 3; y++) {
                int id;
                if (open) id = 0;
                else if (outer) id = GREEN;
                else if (!isInterior(tx) && !isInterior(tz)) id = (hash(ci, cj, 7) % 3 == 0) ? GREEN : WALL;   // junction pillar
                else id = WALL;
                set(x, z, y, id);
            }
            // windows: on the centre column of closed walls, with a greenscreen block behind
            if (!open && !outer) {
                if (isInterior(tx) && !isInterior(tz) && tx == 3) windowAt(x, z, tz, hash(ci, cj, 11));  // N wall pair of cell
                if (!isInterior(tx) && isInterior(tz) && tz == 3) windowAt(x, z, tx, hash(ci, cj, 13));  // W wall pair of cell
            }
        }
    }

    /** t = 0 or 1 = layer inside the wall pair; pick which side gets the window */
    private static void windowAt(int x, int z, int t, int h) {
        if (h % 100 >= 40) return;                    // ~40% of walls have a window
        int windowLayer = (h / 100) % 2;
        set(x, z, 2, t == windowLayer ? GLASS : GREEN);
    }

    private static void torches() {
        for (int i = 0; i < W; i++) for (int j = 0; j < H; j++) {
            int start = hash(i, j, 3) % 4;
            for (int k = 0; k < 4; k++) {
                int s = (start + k) % 4;
                if (passage(i, j, s)) continue;       // wall on this side?
                int x, z, m;
                switch (s) {
                    case 0:  x = i * P + 3; z = j * P + 2; m = 3; break;   // attached to block at z-1
                    case 1:  x = i * P + 4; z = j * P + 3; m = 2; break;   // attached to block at x+1
                    case 2:  x = i * P + 3; z = j * P + 4; m = 4; break;   // attached to block at z+1
                    default: x = i * P + 2; z = j * P + 3; m = 1; break;   // attached to block at x-1
                }
                set(x, z, 3, TORCH); setMeta(x, z, 3, m);
                break;
            }
        }
    }

    private static final int[] DOOR_META = {1, 2, 3, 0};    // closed-door slab on the OUTER face of the wall cell: N,E,S,W

    private static void addDoor(int i, int j, int wallSide, int kind) {
        int x, z;                                          // wall cell adjacent to the room, centre of the side
        switch (wallSide) {
            case 0:  x = i * P + 3; z = j * P + 1; break;
            case 1:  x = i * P + 5; z = j * P + 3; break;
            case 2:  x = i * P + 3; z = j * P + 5; break;
            default: x = i * P + 1; z = j * P + 3; break;
        }
        int m = DOOR_META[wallSide];
        set(x, z, 1, DOOR); setMeta(x, z, 1, m);
        set(x, z, 2, DOOR); setMeta(x, z, 2, m | 8);
        DOORS.add(new int[]{x, z, wallSide, kind});
        doorKind.put(key(x, z), kind);
        if (kind >= 2) {                                   // pond beside the doorway
            int ax = (wallSide == 0 || wallSide == 2) ? 2 : 0, az = (wallSide == 1 || wallSide == 3) ? 2 : 0;
            int px = i * P + 3, pz = j * P + 3;
            int fx = px + (wallSide == 1 ? 1 : wallSide == 3 ? -1 : 0), fz = pz + (wallSide == 2 ? 1 : wallSide == 0 ? -1 : 0);
            if (wallSide == 0 || wallSide == 2) { set(fx - 1, fz, 0, WATER); set(fx + 1, fz, 0, WATER); }
            else                                { set(fx, fz - 1, 0, WATER); set(fx, fz + 1, 0, WATER); }
        }
    }

    private static void doors() {
        // home door: first closed side of the start cell
        for (int s : new int[]{3, 0, 1, 2}) if (!passage(START_I, START_J, s)) { addDoor(START_I, START_J, s, 1); break; }
        // instance doors: dead ends (not the start cell), every other one, max 14
        int kind = 2, seenDead = 0;
        for (int i = 0; i < W && kind < 16; i++) for (int j = 0; j < H && kind < 16; j++) {
            if ((i == START_I && j == START_J) || passages(i, j) != 1) continue;
            if ((seenDead++ & 1) != 0) continue;
            int open = -1; for (int s = 0; s < 4; s++) if (passage(i, j, s)) open = s;
            addDoor(i, j, (open + 2) & 3, kind++);
        }
    }

    // block light: multi-source flood fill from the torches (14), 1 per step through non-opaque blocks
    private static boolean opaque(int id) { return id == WALL || id == GREEN || id == TILE_A || id == TILE_B; }
    private static void light() {
        int[] q = new int[SX * SZ * SY]; int head = 0, tail = 0;
        for (int x = 0; x < SX; x++) for (int z = 0; z < SZ; z++) for (int y = 0; y < SY; y++)
            if ((blk[idx(x, z, y)] & 0xff) == TORCH) { lgt[idx(x, z, y)] = 14; q[tail++] = idx(x, z, y); }
        int[] dx = {1, -1, 0, 0, 0, 0}, dz = {0, 0, 1, -1, 0, 0}, dy = {0, 0, 0, 0, 1, -1};
        while (head < tail) {
            int c = q[head++]; int y = c % SY, z = (c / SY) % SZ, x = c / (SY * SZ); int L = lgt[c];
            if (L <= 1) continue;
            for (int d = 0; d < 6; d++) {
                int nx = x + dx[d], nz = z + dz[d], ny = y + dy[d];
                if (nx < 0 || nz < 0 || ny < 0 || nx >= SX || nz >= SZ || ny >= SY) continue;
                int n = idx(nx, nz, ny);
                if (opaque(blk[n] & 0xff) || lgt[n] >= L - 1) continue;
                lgt[n] = (byte) (L - 1); q[tail++] = n;
            }
        }
    }

    // ------------------------------------------------------------------ public api
    public static int blockAt(int x, int y, int z) {
        if (y < 0 || y > 4) return (y >= 0 && y < SY) ? 0 : 0;
        if (x < 0 || z < 0 || x >= SX || z >= SZ) return GREEN;
        return blk[idx(x, z, y)] & 0xff;
    }
    public static int metaAt(int x, int y, int z) {
        if (x < 0 || z < 0 || x >= SX || z >= SZ || y < 0 || y >= SY) return 0;
        return met[idx(x, z, y)];
    }
    public static int lightAt(int x, int y, int z) {
        if (x < 0 || z < 0 || x >= SX || z >= SZ || y < 0 || y >= SY) return 0;
        return lgt[idx(x, z, y)];
    }
    public static int startX() { return originX + START_I * P + 3; }
    public static int startZ() { return originZ + START_J * P + 3; }
    /**
     * Set the world origin offset so that the start cell center lands at world (ox, oz).
     * Call before the first chunk is generated (e.g. from the hub-world setup).
     */
    public static void setOrigin(int ox, int oz) { originX = ox; originZ = oz; }
    /** 0 = no door here, 1 = home door, 2.. = instance door number + 2 */
    public static int doorKindAt(int x, int z) { Integer k = doorKind.get(key(x, z)); return k == null ? 0 : k; }
    public static int doorCount() { return DOORS.size(); }

    /**
     * Called by the patched chunk generator for every new chunk.
     * Index layout is the game's: (x << 11) | (z << 7) | y. Nibble arrays: two values per byte, low nibble first.
     */
    public static void fill(byte[] blocks, byte[] meta, byte[] blockLight, int cx, int cz) {
        for (int lx = 0; lx < 16; lx++) for (int lz = 0; lz < 16; lz++) {
            int x = cx * 16 + lx, z = cz * 16 + lz;
            for (int y = 0; y < 8; y++) {
                int i = (lx << 11) | (lz << 7) | y;
                int id = blockAt(x, y, z);
                blocks[i] = (byte) id;
                int m = metaAt(x, y, z) & 15, l = lightAt(x, y, z) & 15;
                int h = i >> 1, sh = (i & 1) == 0 ? 0 : 4, mask = 0xf << sh;
                meta[h] = (byte) ((meta[h] & ~mask) | (m << sh));
                blockLight[h] = (byte) ((blockLight[h] & ~mask) | (l << sh));
            }
        }
    }

    static { build(); }   // must stay last: all static fields above are initialised first
}
