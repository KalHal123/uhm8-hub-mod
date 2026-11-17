HUB DOOR FIX  -  Cypress / Minecraft Extension 16.05 R4  (ext1605_20_client.jar)
==============================================================================

INSTALL
  Option A (easiest): head to releases and use the already-patched ext1605_20_client_hubfix.jar instead of the original.
  Option B: python apply_patch.py path/to/ext1605_20_client.jar   ->  writes ext1605_20_client_hubfix.jar
  Option C (no Python): open the ORIGINAL jar with 7-Zip and drag the 3 files from classes/ into the
            jar root, overwriting. (Back up first.)
  Your original jar is never touched by the script. The server jar needs nothing (singleplayer only).

HOW TO GET TO THE HUB
  1. Open the developer console (default key: ` / ~ ), then type:
        sv_cheats 1
        bind 25 +mc_creatmenu        (25 = the P key; any LWJGL key code works)
     Press the key in-game (don't hold Left Ctrl) to open the Palette.
     Alternative to sv_cheats: hold Pause + Scroll Lock + Insert, press F12, toggle "Enable cheats".
  2. In the Palette, open the Items tab and take "Hub Door" (a grey door icon).
  3. Place it on the ground like any door, then walk into it. You'll see "Joining Hub".

INSIDE THE HUB
  * It's a flat floor with the Nexus music and sky. Four Hub Doors stand 4 blocks from where you arrive
    (north, south, east, west).
  * Walk into any of them to open the world picker (World1, World2, ...). Pick a world to travel there
    (an empty slot creates a new world). Cancel returns you to the hub.
  * The hub is ONE shared save (saves/hub), so it is the same hub from every world.
  * If you ever break the doors, they are re-placed (in empty cells) the next time the hub loads.

THINGS TO KNOW
  * Each world has its own player save, so your inventory does NOT follow you between worlds or into the hub.
  * Hub Door block ID is 194. Don't go back to the unpatched jar with Hub Doors placed in a world.

WHAT CHANGED SO FAR (as of v20261117)
  1. Block registry (ExtBlocks): the Hub Door block field was declared but never assigned, so the
     "Hub Door" item (ID 112) wrapped null and the block never existed. It is now created and registered.
  2. BlockHubDoor: drops the Hub Door item (was Iron Door); in the hub it opens the world picker; in other
     worlds it enters the hub as before; ~2s grace after arriving and ~3s re-arm so you don't bounce.
  3. HubWorld: a brand-new hub could never finish loading (its spawn search needed a solid block at y=127
     and looped forever, writing chunk files without limit). Spawn now resolves instantly at (0,1,0), the
     second spawn loop is disabled for the hub, and the four exit doors are placed.
  The hub's room generator (rooms with doors) is dead code in this build - nothing calls it - so it was
  left alone. Source of the patcher is in source/.
  The current hub world is just a flat plane made out of DBG blocks which is exactly what the code produces right now. Work in progress.

ext1605_r4-source-code/ Contains the decompiled source code to ext1605_r4 client and server jar. Downloaded from the wiki on Nov 17th 2026. Decompiled does not mean it is deobfuscated though.
