# Hub Door fix for Extension 16.05 R4

The Hub Door in Cypress / Extension 16.05 R4 is broken in the stock client: the item exists but the block doesn't, and a new hub never finishes loading. This patches `ext1605_20_client.jar` so it works. The hub is now a maze, and its doors can connect to other game instances on the same computer.

Singleplayer only. The server jar doesn't need anything.

DO NOT BUILD THE CYPRESS JAR FROM THE SOURCE CODE PROVIDED HERE, IT IS ONLY FOR DEVELOPMENT AND HAS NOT BEEN VERIFIED AND COULD BE BROKEN. The patcher will *only* accept the official Cypress jar from the wiki, download it here:
https://archive.org/download/ext1605_20_client/ext1605_20_client.jar


## Install

Easiest: grab `ext1605_20_client_hubfix.jar` from Releases and use it instead of the original.

Or patch your own jar (your original is never touched, a new `ext1605_20_client_hubfix.jar` is written next to it):

The patcher also applies a watermark — the title bar will read:
```
Minecraft Alpha v1.0.16.05_20 Cypress + uhm8-hub-mod v20261118.1
```
so you can tell the patched client from the stock one.

```bash
python3 apply_patch.py path/to/ext1605_20_client.jar
```

## Two instances in Prism Launcher
1. Create two Alpha a1.0.16 instances (e.g. "Alpha A" and "Alpha B"). Each gets its own game folder and `saves/`.
2. In both: Edit Instance > Version > Replace Minecraft.jar > pick `ext1605_20_client_hubfix.jar`.
3. In each instance start a world once (that registers the instance with the local hub registry).
   They do not need to be running at the same time; the other instance only needs to have started a world before.

The patcher only runs on the exact build it was made for and refuses anything else.

## Getting to the hub

1. Open the console (`` ` `` key) and run:
   ```
   sv_cheats 1
   bind 25 +mc_creatmenu
   ```
   Key 25 is P. Press it in game to open the Palette.
2. Items tab, take **Hub Door**.
3. Place it like a normal door and walk in. You'll see "Joining Hub".

If `sv_cheats` doesn't work, hold Pause + Scroll Lock + Insert, press F12 and toggle "Enable cheats".

## In the hub

You land in the middle of a 102x102 block maze with 3-wide hallways.

- The door in the start room takes you back to the world you came from.
- Doors in dead ends (with a little pond beside them) take you to another instance's world. You arrive in a snapshot copy of it, with a Hub Door 2 blocks east of you to get back.
- If no other instance is registered yet, those doors open the world picker (World1, World2...) like before.

Instances find each other through a folder in `<java.io.tmpdir>/cypress-hub-<user>/`. Override it with env var `CYPRESS_HUB_DIR` or the JVM argument `-Dcypress.hub.dir=/some/folder`. Both instances must use the same folder, and each must have started a world once.

## Heads up

- Inventory doesn't carry between worlds or the hub. Each world has its own player save.
- The hub is saved in `saves/hubmaze` (delete it to regenerate). The old flat hub (`saves/hub`) is no longer used.
- Visits are snapshots: the other world is copied to your `saves/visit_<instance name>/`, so the host's world is never touched and your changes there are replaced on the next visit.
- Hub Door is block ID 194. Don't load a world with Hub Doors in it on the unpatched jar.
- Not live: you can't see the other player. No diagonal hallways or ladder bubbles yet. Not tested in the real game, only headlessly.

## Repo

- `apply_patch.py` — patcher: replaces classes from `classes/` into the target jar, adds new classes, applies the watermark.
- `classes/` — patch data: `manifest.json` (orig/patched SHA-256 per class), `added.txt` (new classes), patched class files.
- `source/` — the patcher and hub source (client: `HubMaze`, `HubNet`, `Patcher`, `N`, `HubDoorS`; server: `HubServer`, `HubDoorS`).
- `work/jars/` — the working jars (official client + server).
- `work/releases/` — built patched jars.
- `work/handoff/` — handoff summaries per session.
- `reference/source/` — decompiled (not deobfuscated) client and server source, from the wiki. **Archived in `reference/archive/` (superseded).**
- `reference/decompiled/` — **new decompile pipeline output.** See below.

## Decompilation + class-deobfuscation pipeline

The old `reference/source/` trees came from a pre-made wiki dump and used a *different* class naming scheme (`ext/ClassNNN`), so they did not line up with the actual bytecode. The new pipeline below produces a **deterministic, reproducible** deobfuscation of any jar in `work/jars/`:

- **decompile** — Vineflower 1.12.0 (runs on JDK 21; the repo's default `java` is JDK 8, so the script uses `JAVA21`).
- **class-level deobfuscation** — a hand-rolled ASM `ClassRemapper` (`tools/decompile/RemapJar.java`) renames every obfuscated class to `x/ClassNNN` in a stable order (sorted by original name). Packages under `net/minecraft/**`, `com/jcraft/**`, `paulscode/**`, `org/lwglx/**` keep their names. Inner classes keep their `$N` suffix.
- **output** — `reference/decompiled/<label>/` with `raw/` (obfuscated decompile), `deobf/` (renamed decompile), and `_mapping.txt` (obf → new name, one line per class).

```bash
# alpha 1.0.16.02 (the actual runtime the hub code targets)
tools/decompile/decompile.sh alpha-1.0.16.02 work/jars/a1.0.16_02.jar

# the Cypress client jar (the one the patcher consumes)
tools/decompile/decompile.sh cypress-client work/jars/ext1605_20_client.jar

# the Cypress server jar
tools/decompile/decompile.sh cypress-server work/jars/ext1605_20_server.jar
```

All three are already built. The cypress-client tree is large (~400 MB because it embeds `sounddata/`); the useful source is under `deobf/x/`, `deobf/net/`, `deobf/ext1605/`, etc. The alpha tree is the one to read when working on hub code — its class names line up with what `source/` references.

## Outline/Roadmap for the future

- Getting world generation code working and rebuilding the hub dimension — maze done, adding missing blocks still open.
- Getting networking working at least locally (doors between local instances work via snapshots; live play still open).
- Finally creating a headless server runnable by anyone and making the final build with networking fully functional like in the original.

## What changed (5 classes replaced, 5 added)
* `ExtBlocks`: Hub Door block (ID 194) registered.  `BlockHubDoor`: drops itself, routes through HubNet, cooldown.
* `HubWorld`: save folder `hubmaze`, spawn in the start cell, no endless spawn search.
* Hub chunk generator: calls `HubMaze.fill` (blocks, door/torch metadata, precomputed block light).
* `Minecraft.startWorld`: registers the instance.  New: `HubMaze`, `HubNet` (+ inner classes). Source in `source/`.

## Server-side patch (in progress: Stage 1 of roadmap)
The dedicated server jar gets the same hub: `HubServer` (redirects), `HubMaze.fill` origin support, `HubDoorS`
(BlockDoor), chunk provider dispatch via `-Dcypress.hubserver=true`. Source in `source/HubServer.java`.
