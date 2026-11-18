# TASKS — recurring project chores

These are the repeated jobs you (or I) need to do at the end of a work session. Each task is copy-paste-able.

---

## TASK A — Build the patched client jar (with watermark)

**What it does:** takes the original `ext1605_20_client.jar` and writes a patched copy next to it, applying the Hub Door + Hub Maze patches, the added helper classes, **and** the watermark. The original is never modified.

**One-time check** — the original jar must be at one of:
- `work/jars/ext1605_20_client.jar`  (used in this repo)

**Command** (run from repo root):
```bash
python3 apply_patch.py work/jars/ext1605_20_client.jar
```
Windows/other Python: use `python` instead of `python3`. The shell alternative is `./apply_patch.sh <jar>` but it does **not** apply the watermark — prefer the Python one.

**Output:** `<same folder as source>/ext1605_20_client_hubfix.jar`

**Verify it worked:**
```bash
# should print the watermark string from a constant pool
python3 - <<'PY'
import zipfile, struct
p='work/jars/ext1605_20_client_hubfix.jar'
with zipfile.ZipFile(p) as z:
    for n in z.namelist():
        if not n.endswith('.class'): continue
        d=z.read(n)
        if d[:4]!=b'\xca\xfe\xba\xbe': continue
        if b'uhm8-hub-mod' in d:
            print('WATERMARK OK:', n); break
PY
```

**Publish to a release folder:**
```bash
mkdir -p work/releases/v<YYYYMMDD>
cp work/jars/ext1605_20_client_hubfix.jar \
   work/releases/v<YYYYMMDD>/ext1605_20_client_hubfix_watermark.jar
```

**If it errors:**
- `ERROR: ... differs from the expected build` → you're patching the wrong jar (must be the official `ext1605_20_client.jar`).
- `This jar is already patched.` → point it at the *original*, not the already-patched one.

---

## TASK B — Prepare the next-session handoff

**What it does:** writes a short summary of where we stopped so the next chat can pick up with no memory.

**Steps:**
1. Confirm state:
   ```bash
   cd /home/thph793/Documents/uhm8-hub-mod
   git status
   git log --oneline -3
   ```
2. Make a dated folder (format `handoff/YYYYMMDDHHMM`):
   ```bash
   mkdir -p work/handoff/$(date +%Y%m%d%H%M)
   ```
3. Create `HANDOFF.md` inside it with these sections:
   - **Status summary** — branch, latest commits, clean/dirty tree.
   - **What was done this session** — bullet list of changes.
   - **End goal** — the one-paragraph dream (hosted hub, doors to live worlds).
   - **Current jar build state** — exact paths of built jars.
   - **How to build** — point to this TASKS.md.
   - **Where I stopped (resume here)** — the next concrete steps.
   - **Files of note** — new/modified files.
4. Build the jar (TASK A) so the handoff references a real artifact.
5. Commit everything:
   ```bash
   git add -A
   git commit -m "Handoff <YYYYMMDD>: <one-line summary>"
   ```

**Tip:** Existing handoffs for reference:
- `work/handoff/202611182128/`  (original detailed handoff, has CHAT_EXPORT.md + rebuild_env.sh)
- `work/handoff/202611182231/`  (this session)

---

## TASK C — (reference) Rebuild the patcher classes

Only needed if `source/*.java` changed (HubMaze, HubNet, Patcher, etc.) and you must regenerate `classes/*.class`.
This needs JDK 21 with internal ASM exported. See `work/handoff/202611182128/rebuild_env.sh` and `HANDOFF §4`.
Not required for TASK A/B if `classes/` is already up to date.
