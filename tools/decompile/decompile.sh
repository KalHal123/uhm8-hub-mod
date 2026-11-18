#!/bin/bash
# Decompile + class-deobfuscate an obfuscated jar into clean, readable source.
#
# usage: decompile.sh <label> <in.jar>
#   label: e.g. cypress-client | cypress-server | alpha-1.0.16.02
#
# Produces reference/decompiled/<label>/ with:
#   raw/        Vineflower decompile with original obfuscated names
#   deobf/      Vineflower decompile after ASM class-level remap (ClassNNN names)
#   _mapping.txt deterministic obf->new class-name map
#
# Packages under net/minecraft/**, com/jcraft/**, paulscode/**, org/lwjgl/** keep
# their names; every other class is renamed to x/ClassNNN (inner classes keep $).
set -euo pipefail

JAVA21="${JAVA21:-/usr/lib/jvm/java-21-openjdk-amd64/bin/java}"
JAVAC="${JAVAC:-/usr/lib/jvm/java-21-openjdk-amd64/bin/javac}"
ROOT="$(cd "$(dirname "$0")/../.." && pwd)"
VINEFLOWER="$ROOT/work/jars/vineflower-1.12.0.jar"
LABEL="${1:?need label (e.g. cypress-client)}"
JAR="${2:?need jar path}"

OUT="$ROOT/reference/decompiled/$LABEL"
RAW="$OUT/raw"
DEOBF="$OUT/deobf"
TMP="$(mktemp -d)"
# don't trap now, keep for debugging
trap 'echo "[DEBUG] cleaning up $TMP"; rm -rf "$TMP"' EXIT

echo "[1/3] decompile with vineflower -> $RAW"
"$JAVA21" -jar "$VINEFLOWER" "$JAR" "$RAW" >/dev/null 2>&1 || true

echo "[2/3] deterministic class-rename mapping -> $OUT/_mapping.txt"
python3 "$ROOT/tools/decompile/genmap.py" "$JAR" "$OUT/_mapping.txt"

echo "[3/3] ASM remap jar + vineflower -> $DEOBF"
mkdir -p "$TMP/classes"
if ! "$JAVAC" --add-exports java.base/jdk.internal.org.objectweb.asm=ALL-UNNAMED \
        --add-exports java.base/jdk.internal.org.objectweb.asm.commons=ALL-UNNAMED \
        -d "$TMP/classes" "$ROOT/tools/decompile/RemapJar.java"; then
    echo "ERROR: javac failed for RemapJar"
    exit 1
fi
if ! "$JAVA21" --add-exports java.base/jdk.internal.org.objectweb.asm=ALL-UNNAMED \
        --add-exports java.base/jdk.internal.org.objectweb.asm.commons=ALL-UNNAMED \
        -cp "$TMP/classes" RemapJar \
        "$JAR" "$TMP/remapped.jar" "$OUT/_mapping.txt" >/dev/null; then
    echo "ERROR: RemapJar failed"
    exit 1
fi
if [ ! -f "$TMP/remapped.jar" ]; then
    echo "ERROR: remapped jar not created"
    exit 1
fi
if ! "$JAVA21" -jar "$VINEFLOWER" "$TMP/remapped.jar" "$DEOBF" >/dev/null 2>&1; then
    echo "ERROR: vineflower failed on remapped jar"
    exit 1
fi

echo "done: $OUT ($(find "$DEOBF" -name '*.java' | wc -l) deobfuscated sources)"
ls -la "$OUT/_mapping.txt"

echo "done: $OUT ($(find "$DEOBF" -name '*.java' | wc -l) deobfuscated sources)"
ls -la "$OUT/_mapping.txt"