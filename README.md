# Hub Door fix for Extension 16.05 R4

## [Video Showcase](https://kalhal123.github.io/readycypressvideo_720p30.mp4)


The Hub Door in Cypress / Extension 16.05 R4 is broken in the stock client: the item exists but the block doesn't, and a new hub never finishes loading. This patches `ext1605_20_client.jar` so it works. The hub is a maze dimension: Hub Doors rarely appear in the overworld and lead into it, and every door inside the maze opens the world picker so you can jump to any of your worlds.

Singleplayer only. The server jar doesn't need anything.

DO NOT BUILD THE CYPRESS JAR FROM THE SOURCE CODE PROVIDED HERE, IT IS ONLY FOR DEVELOPMENT AND HAS NOT BEEN VERIFIED AND COULD BE BROKEN. The patcher will *only* accept the official Cypress jar from the wiki, downlaod it [here](https://archive.org/download/ext1605_20_client/ext1605_20_client.jar)

## Install

Easiest: grab `ext1605_20_client_hubfix.jar` from Releases and use it instead of the original.

Or patch your own jar (your original is never touched, a new `ext1605_20_client_hubfix.jar` is written next to it):

The patcher also applies a watermark — the title bar will read:
```
Minecraft Alpha v1.0.16.05_20 Cypress + uhm8-hub-mod v20261119
```
so you can tell the patched client from the stock one.

```bash
python3 apply_patch.py path/to/ext1605_20_client.jar
```
 
The patcher only runs on the exact build it was made for and refuses anything else.

## Getting to the hub

**In the overworld:** Hub Doors spawn rarely, about one per 250 generated chunks, on grass, dirt, stone, sand or gravel (never on water or trees, and not in special game-mode worlds). They are see-through doors with a white X. Walk into one and you'll see "Joining Hub".

**Placing one yourself:**

1. Open the console (`` ` `` key) and run:
   ```
   sv_cheats 1
   bind 25 +mc_creatmenu
   ```
   Key 25 is P. Press it in game to open the Palette.
2. Items tab, take **Hub Door**.
3. Place it like a normal door and walk in.

If `sv_cheats` doesn't work, hold Pause + Scroll Lock + Insert, press F12 and toggle "Enable cheats". If the console key does nothing on your keyboard layout, rebind "Open console" in Options > Controls.

## In the hub

You land in the middle of a 102x102 block maze with 3-wide hallways, a tiled floor, torches and green windows. Every door in it opens the world picker (World1, World2...): one in the start room, the rest in dead ends next to little ponds. Cancel to stay in the maze. A door can't be triggered again for about 2 seconds after you arrive.

## Heads up

- Inventory doesn't carry between worlds or the hub. Each world has its own player save.
- The hub is saved in `saves/hubmaze` (delete it to regenerate).
- Overworld Hub Doors only appear in chunks genrated after the patch is installed; areas you've already explored are untouched.
- Hub Door is block ID 194. Don't load a world with Hub Doors in it on the unpatched jar.
- No multiplayer hub yet, no diagonal hallways or ladder bubbles yet. Mostly tested headlessly, not extensivly in the real game.

## Repo

- `apply_patch.py` — patcher: replaces classes from `classes/` into the target jar, adds new classes, applies the watermark. `apply_patch.sh` does the same from a shell, and `patch_watermark.py` applies only the watermark.
- `classes/` — patch data: `manifest.json` (orig/patched SHA-256 per class), `added.txt` (new classes), patched class files.
- `source/` — the patcher and hub source (client: `HubMaze`, `HubSpawner`, `Patcher`, `N`; server, in progress: `HubServer`, `HubDoorS`).

## Outline/Roadmap for the future

- Getting world generation code working and rebuilding the hub dimension — maze done, adding missing blocks still open.
- Getting networking working, starting with a dedicated hub server (in progress, see below).
- Finally creating a headless server runnable by anyone and making the final build with networking fully functional like in the original.

## What the patch contains (5 classes replaced, 2 added)
* `ExtBlocks`: Hub Door block (ID 194) registered.  `BlockHubDoor`: drops itself, cooldown after arriving, opens the world picker inside the hub.
* `HubWorld`: save folder `hubmaze`, spawn in the start cell, no endless spawn search.
* Hub chunk generator: calls `HubMaze.fill` (blocks, door/torch metadata, precomputed block light).
* Overworld terrain generator: calls `HubSpawner.maybePlace` after each chunk is populated, which rarely places a Hub Door on the surface.
* New classes: `HubMaze`, `HubSpawner`. Source in `source/`.

## Server-side patch (in progress: Stage 1 of roadmap)
The dedicated server jar gets the same hub: `HubServer` (redirects), `HubMaze.fill` origin support, `HubDoorS`
(BlockDoor), chunk provider dispatch via `-Dcypress.hubserver=true`. Source in `source/HubServer.java`.
