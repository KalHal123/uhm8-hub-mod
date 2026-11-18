#!/usr/bin/env python3
"""Generate a deterministic class-rename mapping for an obfuscated jar.

Usage: genmap.py <in.jar> <out.mapping>

Output lines:  <obf_internal_name> <new_internal_name>

Classes under net/minecraft/**, com/jcraft/**, paulscode/**, org/lwjgl/**, javax/**,
java/**, com/google/** keep their names.  Everything else is renamed to x/ClassNNN
(inner classes keep the $ suffix, e.g. x/Class0005$1).  The numbering is stable:
classes are sorted by their original name first, so the same jar always gives the
same mapping.
"""
import sys
import zipfile

KEEP_PREFIXES = (
    "net/minecraft/", "com/jcraft/", "paulscode/", "org/lwjgl/",
    "javax/", "java/", "com/google/", "org/intellij/", "org/jetbrains/",
)


def main():
    jar, out = sys.argv[1], sys.argv[2]
    names = []
    with zipfile.ZipFile(jar) as z:
        for n in z.namelist():
            if n.endswith(".class") and not n.startswith("META-INF/"):
                names.append(n[:-len(".class")])
    names.sort()

    mapping = {}
    counter = 0
    for n in names:
        if any(n.startswith(p) for p in KEEP_PREFIXES):
            continue
        if "$" in n:
            continue
        counter += 1
        mapping[n] = "x/Class%04d" % counter

    for n in names:
        if any(n.startswith(p) for p in KEEP_PREFIXES):
            continue
        if "$" not in n:
            continue
        parent, _, rest = n.partition("$")
        if parent in mapping:
            mapping[n] = mapping[parent] + "$" + rest
        else:
            mapping[n] = n

    with open(out, "w", encoding="utf-8") as f:
        for k in sorted(mapping):
            f.write("%s %s\n" % (k, mapping[k]))
    print("wrote %s: %d classes (%d top-level)" % (out, len(mapping), counter))


if __name__ == "__main__":
    main()