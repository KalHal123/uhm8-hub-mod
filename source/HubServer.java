import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Server-side helper for the Hub maze.
 * Reads hub-doors.txt (host:port per line, one per door slot starting at kind 2).
 * Kind 1 is the "back" door (returns to the world the player came from).
 * A door touch makes the server kick the player with a special redirect reason:
 *   §hub§redirect§host:port
 * The patched client catches that and reconnects.
 */
public final class HubServer {
    public static volatile boolean hub = false;
    public static volatile int spawnX = 0, spawnY = 64, spawnZ = 0;
    public static volatile String[] destinations = new String[0];  // index = kind-2, so kind 2 -> destinations[0]

    /** Read hub-doors.txt from the server's working directory (one host:port per line). */
    public static void loadDoors() {
        try {
            Path p = Paths.get("hub-doors.txt");
            if (!Files.isRegularFile(p)) {
                destinations = new String[0];
                return;
            }
            List<String> lines = new ArrayList<String>();
            for (String l : Files.readAllLines(p)) {
                l = l.trim();
                if (!l.isEmpty() && !l.startsWith("#")) lines.add(l);
            }
            destinations = lines.toArray(new String[0]);
        } catch (Throwable t) {
            destinations = new String[0];
        }
    }

    /** Returns the redirect string for a door kind, or null if no destination is configured. */
    public static String redirectFor(int kind) {
        if (kind <= 1) return null;  // home door, handled separately
        int idx = kind - 2;
        if (idx < 0 || idx >= destinations.length) return null;
        String d = destinations[idx];
        if (d == null || d.isEmpty()) return null;
        return "§hub§redirect§" + d;
    }

    /** Returns true if the given block id is part of the hub maze and should be unbreakable. */
    public static boolean isHubBlock(int id) {
        return id == 96 || id == 146 || id == 98 || id == 111 || id == 127 || id == 194 || id == 50 || id == 9;
    }
}