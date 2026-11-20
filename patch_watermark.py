#!/usr/bin/env python3
"""Standalone watermark patcher (same logic as the watermark step in apply_patch.py).

usage:  python patch_watermark.py path/to/ext1605_20_client.jar

Writes  <jar name>_watermarked.jar  next to the original. The original is never modified.
Safe to run on an already-watermarked jar: an older "+ uhm8-hub-mod vNNN" tag is replaced, never appended to.
"""
import os, re, struct, sys, zipfile

WATERMARK_NEW = "Minecraft Alpha v1.0.16.05_20 Cypress + uhm8-hub-mod v20261119"
_WM = re.compile(rb"Minecraft Alpha v1\.0\.16\.05_20 Cypress(?: \+ uhm8-hub-mod v[0-9.]+)?")


def apply_watermark(class_bytes):
    """Rewrite the title string inside CONSTANT_Utf8 entries. Returns (bytes, changed)."""
    new_utf8 = WATERMARK_NEW.encode("utf-8")
    if len(class_bytes) < 10 or class_bytes[:4] != b"\xca\xfe\xba\xbe":
        return class_bytes, False
    cp_count = struct.unpack(">H", class_bytes[8:10])[0]
    pos, idx, modified = 10, 1, False
    out = bytearray(class_bytes[:10])
    while idx < cp_count:
        tag = class_bytes[pos]
        out.append(tag)
        pos += 1
        if tag == 1:  # CONSTANT_Utf8
            length = struct.unpack(">H", class_bytes[pos:pos + 2])[0]
            pos += 2
            raw = class_bytes[pos:pos + length]
            pos += length
            new_raw = _WM.sub(new_utf8, raw)
            if new_raw != raw:
                modified = True
            out.extend(struct.pack(">H", len(new_raw)))
            out.extend(new_raw)
        elif tag in (7, 8, 16, 19, 20):
            out.extend(class_bytes[pos:pos + 2]); pos += 2
        elif tag in (3, 4, 9, 10, 11, 12, 17, 18):
            out.extend(class_bytes[pos:pos + 4]); pos += 4
        elif tag in (5, 6):
            out.extend(class_bytes[pos:pos + 8]); pos += 8; idx += 1
        elif tag == 15:
            out.extend(class_bytes[pos:pos + 3]); pos += 3
        else:
            return class_bytes, False
        idx += 1
    out.extend(class_bytes[pos:])
    return bytes(out), modified


if __name__ == "__main__":
    if len(sys.argv) != 2:
        sys.exit(__doc__)
    src = sys.argv[1]
    base, ext = os.path.splitext(os.path.abspath(src))
    dst = base + "_watermarked" + ext
    count = 0
    with zipfile.ZipFile(src) as zin, zipfile.ZipFile(dst, "w") as zout:
        for info in zin.infolist():
            data = zin.read(info.filename)
            if info.filename.endswith(".class"):
                data, changed = apply_watermark(data)
                if changed:
                    count += 1
                    print("  watermark", info.filename)
            zout.writestr(info, data)
    print(f"Done. Watermark applied to {count} class(es) -> {dst}")
