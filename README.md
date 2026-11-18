# Hub Maze + local multi-instance hub for Extension 16.05 R4

Builds on the Hub Door fix. The hub is now the maze from the wiki/video, and doors in it connect two (or more) game
instances running on the same computer.

Singleplayer only. The server jar doesn't need anything.

DO NOT BUILD THE CYPRESS JAR FROM THE SOURCE CODE PROVIDED HERE, IT IS ONLY FOR DEVELOPMENT AND HAS NOT BEEN VERIFIED AND COULD BE BROKEN. The patcher will *only* accept the official Cypress jar from the wiki, download it here:
https://archive.org/download/ext1605_20_client/ext1605_20_client.jar

## Install
Easiest: grab `ext1605_20_client_hubfix.jar` from Releases. Or patch your own jar (original is never touched):

    python apply_patch.py path/to/ext1605_20_client.jar      # or: ./apply_patch.sh path/to/ext1605_20_client.jar

The patcher only runs on the exact build it was made for.

## Two instances in Prism Launcher
1. Create two Alpha a1.0.16 instances (e.g. "Alpha A" and "Alpha B"). Each gets its own game folder and `saves/`.
2. In both: Edit Instance > Version > Replace Minecraft.jar > pick `ext1605_20_client_hubfix.jar`.
3. In each instance start a world once (that registers the instance with the local hub registry).
   They do not need to be running at the same time; the other instance only needs to have started a world before.

## Using it
1. In a world: console key, `sv_cheats 1`, `bind 25 +mc_creatmenu`, press P, Items tab, take **Hub Door**, place it, walk in.
   (If the console key does nothing on a German keyboard, rebind "Open console" in Options > Controls, e.g. to F4.
   If `sv_cheats` doesn't work, hold Pause + Scroll Lock + Insert, press F12 and toggle "Enable cheats".)
2. You arrive in the hub maze (a 102x102 block maze, 3-wide hallways). Spawn is in the middle.
   * **Door in the start room** = home: back to the world you came from.
   * **Doors in dead ends** (with a little pond beside them) = visit the other instance's world.
   * If no other instance is registered yet, those doors open the world picker instead.
3. You arrive in a **snapshot copy** of the other instance's world at its spawn point (loading takes a moment for big worlds),
   with a Hub Door placed 2 blocks east of you to get back to the hub.

## How visits work (and why a snapshot)
Alpha worlds are locked with `session.lock`, and two processes writing one world would corrupt it. So a visit copies the
other world's last saved state into your own `saves/visit_<instance name>/` (without session.lock and without the host's
player), and you play that copy. The host's real world is never touched. Changes you make in a visit only live in your copy
and are replaced on your next visit. The host's world must have been saved to disk (Alpha autosaves; saving & quitting always does).

## Shared registry
Instances find each other through a small folder: `<java.io.tmpdir>/cypress-hub-<user>/` (one .properties file per instance).
Override with env var `CYPRESS_HUB_DIR` or JVM argument `-Dcypress.hub.dir=/some/folder` (Prism: Settings > Java > JVM arguments).
Both instances must use the same folder. The hub itself is saved in each instance's `saves/hubmaze` (delete it to regenerate).
The old flat hub (`saves/hub`) is no longer used.

## Not implemented / limits
* Not live: you cannot see the other player; each instance has its own copy of the (identical, deterministic) hub.
* Inventory does not carry between worlds. Each world has its own player save.
* Hub Door is block ID 194. Don't load a world with Hub Doors in it on the unpatched jar.
* No diagonal hallways or outdoor ladder bubbles from the wiki. Layout is a seeded perfect maze plus some loops.
* Not tested inside the real game (no display here). Tested headlessly against the game's own classes with the verifier on:
  maze generation through the real chunk generator (62,424 blocks, metadata and light all identical to the model),
  registry, routing, snapshot copy, NBT editing, loading the snapshot as a world, return-door placement.

## What changed (5 classes replaced, 5 added)
* `ExtBlocks`: Hub Door block (ID 194) registered.  `BlockHubDoor`: drops itself, routes through HubNet, cooldown.
* `HubWorld`: save folder `hubmaze`, spawn in the start cell, no endless spawn search.
* Hub chunk generator: calls `HubMaze.fill` (blocks, door/torch metadata, precomputed block light).
* `Minecraft.startWorld`: registers the instance.  New: `HubMaze`, `HubNet` (+ inner classes). Source in `source/`.

## Repo
* `classes/` patched and added classes (plus `manifest.json` / `added.txt` used by the patcher)
* `source/` Java source of the patch (`HubMaze`, `HubNet`, `Patcher`)
* `ext1605_r4-source-code/` decompiled (not deobfuscated) client and server source, from the wiki

## Outline/Roadmap for the future
* ~~getting the world generation code working and rebuilding the hub dimension~~ done (the maze). Still open: diagonal hallways, ladder bubbles, any missing blocks
* getting the networking working locally: partly done (doors between local instances via world snapshots), live play is still open
* finally creating a headless server runnable by anyone and making the final build with networking fully functional like in the original
