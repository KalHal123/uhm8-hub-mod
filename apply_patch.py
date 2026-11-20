#!/usr/bin/env python3
"""Applies the Hub Door + Hub Dimension patch (and the version watermark) to ext1605_20_client.jar.

usage:  python apply_patch.py path/to/ext1605_20_client.jar

Writes  ext1605_20_client_hubfix.jar  next to the original. The original is never modified.
The script refuses to run on a jar whose target classes differ from the build it was made for.
"""
import hashlib, json, os, sys, zipfile

here = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, here)
from patch_watermark import apply_watermark, WATERMARK_NEW

cdir = os.path.join(here, "classes")
manifest = json.load(open(os.path.join(cdir, "manifest.json")))
added = [l.strip() for l in open(os.path.join(cdir, "added.txt")) if l.strip()]

if len(sys.argv) != 2:
    sys.exit(__doc__)
src = sys.argv[1]
dst = os.path.join(os.path.dirname(os.path.abspath(src)), "ext1605_20_client_hubfix.jar")

with zipfile.ZipFile(src) as zin:
    names = set(zin.namelist())
    for cls, h in manifest.items():
        if cls not in names:
            sys.exit(f"ERROR: {cls[:20]}... not found - this is not the jar the patch was made for.")
        digest = hashlib.sha256(zin.read(cls)).hexdigest()
        if digest == h["patched"]:
            sys.exit("This jar is already patched.")
        if digest != h["orig"]:
            sys.exit(f"ERROR: {cls[:20]}... differs from the expected build. Refusing to patch.")
    print("Jar verified. Writing", dst)
    marked = 0
    with zipfile.ZipFile(dst, "w") as zout:
        for info in zin.infolist():
            data = open(os.path.join(cdir, info.filename), "rb").read() if info.filename in manifest else zin.read(info.filename)
            if info.filename.endswith(".class"):
                data, changed = apply_watermark(data)
                if changed:
                    marked += 1
                    print("  watermark ", info.filename[:40])
            zi = zipfile.ZipInfo(info.filename, info.date_time)
            zi.compress_type = zipfile.ZIP_DEFLATED if info.filename in manifest else info.compress_type
            zi.external_attr = info.external_attr
            if info.filename in manifest:
                print("  replaced  ", info.filename[:20] + "...")
                zout.writestr(zi, data)
            else:
                zout.writestr(info, data)
        for f in added:
            zi = zipfile.ZipInfo(f, (2026, 1, 1, 0, 0, 0))
            zi.compress_type = zipfile.ZIP_DEFLATED
            zout.writestr(zi, open(os.path.join(cdir, f), "rb").read())
            print("  added     ", f)
print(f"Done. Version string: {WATERMARK_NEW}")
print("Back up your original jar, then use the new one.")
