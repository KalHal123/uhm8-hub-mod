# Hub Door fix for Extension 16.05 R4

The Hub Door in Cypress / Extension 16.05 R4 is broken in the stock client: the item exists but the block doesn't, and a new hub never finishes loading. This patches `ext1605_20_client.jar` so it works.

Singleplayer only. The server jar doesn't need anything.

DO NOT BUILD THE CYPRESS JAR FROM THE SOURCE CODE PROVIDED HERE, IT IS ONLY FOR DEVELOPMENT AND HAS NOT BEEN VERIFIED AND COULD BE BROKEN. The patcher will *only* accept the official Cypress jar from the wiki, download it here:
https://archive.org/download/ext1605_20_client/ext1605_20_client.jar


## Install

Easiest: grab `ext1605_20_client_hubfix.jar` from Releases and use it instead of the original.

Or patch your own jar (your original is never touched, a new `ext1605_20_client_hubfix.jar` is written next to it):

```
python apply_patch.py path/to/ext1605_20_client.jar
```

No Python? `./apply_patch.sh path/to/ext1605_20_client.jar` does the same thing (needs `unzip`, `zip`, `awk`).

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

You land on a flat floor with four Hub Doors around you. Walk into one to pick a world (World1, World2...). Picking an empty slot makes a new world. Cancel sends you back.

## Heads up

- Inventory doesn't carry between worlds or the hub. Each world has its own player save.
- The hub is one shared save (`saves/hub`), same hub from every world.
- Hub Door is block ID 194. Don't load a world with Hub Doors in it on the unpatched jar.
- The hub is just a flat plane for now. Work in progress.

## Repo

- `classes/` patched classes
- `source/` the patcher source
- `ext1605_r4-source-code/` decompiled (not deobfuscated) client and server source, from the wiki

## Outline/Roadmap for the future

- getting the world generation code working and rebuilding the hub dimension + adding missing blocks
- getting the networking working at least locally
- finnaly creating a headless server runable by anyone and making the final build with networking fully functional like in the original

