# Hub Dimension for Extension 16.05 R4  (version v20261119)

The hub is now simply a dimension: you reach it through Hub Doors that rarely appear in the overworld, you walk the
hub maze, and every door inside the maze opens the world picker so you can jump to any of your worlds.
The earlier experiment with several game instances, registries and world snapshots has been removed completely.

## Install
Use `ext1605_20_client_hubfix.jar`, or patch your own jar (the original is never touched):

    python apply_patch.py path/to/ext1605_20_client.jar      # or: ./apply_patch.sh path/to/ext1605_20_client.jar

The title string becomes: `Minecraft Alpha v1.0.16.05_20 Cypress + uhm8-hub-mod v20261119`
(the watermark step also replaces an older `+ uhm8-hub-mod vNNN` tag if the jar already has one).

## How it works in game
* **Hub Doors in the overworld:** about one per 250 newly generated chunks (a few per large exploration), placed on
  grass/dirt/stone/sand/gravel only, never on water, trees or special game-mode worlds. They only appear in chunks
  generated after installing; already explored areas stay as they are. They are see-through doors with a white X.
* **Entering:** walk into a Hub Door. You arrive in the hub maze (102x102 blocks, 3-wide hallways, tile floors, torches,
  green windows). The hub is one shared save in `saves/hubmaze` (delete it to regenerate).
* **Inside the hub:** walking into any door (one in the start room, the rest in dead ends next to little ponds) opens
  the world picker (World1, World2, ...). Cancel to stay in the maze.
* **Getting a door yourself:** console key, `sv_cheats 1`, `bind 25 +mc_creatmenu`, press P, Items tab, Hub Door.
  (German keyboard: if the console key does nothing, rebind "Open console" in Options > Controls, e.g. to F4.)
* Door block ID is 194. You can't re-trigger a door for ~2 s after arriving.

## Cleanup after the previous version
You can delete `saves/visit_*` folders and the folder `cypress-hub-<user>` in your system temp directory; nothing uses
them any more. Hub Doors placed in worlds by the old build keep working.

## Not in this version
Live multiplayer / hub server, other-instance visits, mob control in the hub. The hub has no mob spawning rules of its own.

## What changed (5 classes replaced, 2 added; all other classes byte-identical except the title string)
Block registry (Hub Door block 194 created), Hub Door block (drops itself, cooldown, picker in the hub), HubWorld (maze
save folder, spawn in start cell, no endless spawn search), hub chunk generator (`HubMaze.fill`), overworld terrain
generator (`HubSpawner.maybePlace` at the end of chunk populate). New: `HubMaze`, `HubSpawner`. Source in `source/`.
