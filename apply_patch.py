#!/usr/bin/env python3
"""Applies the Hub Door + Hub Maze patch + watermark to ext1605_20_client.jar (Cypress / Extension 16.05 R4).

usage:  python apply_patch.py path/to/ext1605_20_client.jar

Writes  ext1605_20_client_hubfix.jar  next to the original. The original is never modified.
The script refuses to run on a jar whose target classes differ from the build it was made for.
"""
import hashlib, json, os, struct, sys, zipfile

here = os.path.dirname(os.path.abspath(__file__))
cdir = os.path.join(here, "classes")
manifest = json.load(open(os.path.join(cdir, "manifest.json")))
added = [l.strip() for l in open(os.path.join(cdir, "added.txt")) if l.strip()]

# Watermark: change the title bar / watermark string displayed in game
WATERMARK_OLD = "Minecraft Alpha v1.0.16.05_20 Cypress"
WATERMARK_NEW = "Minecraft Alpha v1.0.16.05_20 Cypress + uhm8-hub-mod v20261118.1"


def modify_class_constant_pool(class_bytes, old_str, new_str):
    """Replace occurrences of old_str with new_str inside CONSTANT_Utf8 entries."""
    old_utf8 = old_str.encode("utf-8")
    new_utf8 = new_str.encode("utf-8")

    if len(class_bytes) < 10 or class_bytes[:4] != b"\xca\xfe\xba\xbe":
        return class_bytes, False

    cp_count = struct.unpack(">H", class_bytes[8:10])[0]
    pos = 10
    out = bytearray(class_bytes[:10])
    modified = False
    idx = 1

    while idx < cp_count:
        tag = class_bytes[pos]
        out.append(tag)
        pos += 1

        if tag == 1:  # CONSTANT_Utf8
            length = struct.unpack(">H", class_bytes[pos:pos + 2])[0]
            pos += 2
            raw_bytes = class_bytes[pos:pos + length]
            pos += length

            if old_utf8 in raw_bytes:
                raw_bytes = raw_bytes.replace(old_utf8, new_utf8)
                modified = True

            out.extend(struct.pack(">H", len(raw_bytes)))
            out.extend(raw_bytes)
        elif tag in (7, 8, 16, 19, 20):  # 2-byte index
            out.extend(class_bytes[pos:pos + 2])
            pos += 2
        elif tag in (3, 4, 9, 10, 11, 12, 17, 18):  # 4-byte index(es)
            out.extend(class_bytes[pos:pos + 4])
            pos += 4
        elif tag in (5, 6):  # 8-byte value
            out.extend(class_bytes[pos:pos + 8])
            pos += 8
            idx += 1
        elif tag == 15:  # CONSTANT_MethodHandle
            out.extend(class_bytes[pos:pos + 3])
            pos += 3
        else:
            return class_bytes, False
        idx += 1

    out.extend(class_bytes[pos:])
    return bytes(out), modified


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
    watermark_count = 0
    with zipfile.ZipFile(dst, "w") as zout:
        for info in zin.infolist():
            if info.filename in manifest:
                zi = zipfile.ZipInfo(info.filename, info.date_time)
                zi.compress_type = zipfile.ZIP_DEFLATED
                zi.external_attr = info.external_attr
                zout.writestr(zi, open(os.path.join(cdir, info.filename), "rb").read())
                print("  replaced", info.filename[:20] + "...")
            else:
                data = zin.read(info.filename)
                if info.filename.endswith(".class"):
                    new_data, changed = modify_class_constant_pool(data, WATERMARK_OLD, WATERMARK_NEW)
                    if changed:
                        watermark_count += 1
                        print("  watermark", info.filename[:20] + "...")
                    zout.writestr(info, new_data)
                else:
                    zout.writestr(info, data)
        for f in added:
            zi = zipfile.ZipInfo(f, (2026, 1, 1, 0, 0, 0))
            zi.compress_type = zipfile.ZIP_DEFLATED
            zout.writestr(zi, open(os.path.join(cdir, f), "rb").read())
            print("  added   ", f)
    print(f"Done. Watermark applied to {watermark_count} class(es). Back up your original jar, then use the new one.")
