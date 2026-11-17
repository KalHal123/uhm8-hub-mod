#!/bin/sh
# Applies the Hub Door fix to ext1605_20_client.jar (Cypress / Extension 16.05 R4).
#
# usage:  ./apply_patch.sh path/to/ext1605_20_client.jar
#
# Writes  ext1605_20_client_hubfix.jar  next to the original. The original is never modified.
# The script refuses to run on a jar whose 3 target classes differ from the build it was made for.
#
# Needs: unzip, zip, awk, and one of sha256sum / shasum / openssl  (plain POSIX sh, no bashisms)

set -eu

die() { printf '%s\n' "$*" >&2; exit 1; }
short() { printf '%.20s...' "$1"; }

[ $# -eq 1 ] || die "usage: $0 path/to/ext1605_20_client.jar"

for t in unzip zip awk; do
  command -v "$t" >/dev/null 2>&1 || die "ERROR: '$t' is required but not installed."
done
if command -v sha256sum >/dev/null 2>&1; then
  sha() { sha256sum | cut -d' ' -f1; }
elif command -v shasum >/dev/null 2>&1; then
  sha() { shasum -a 256 | cut -d' ' -f1; }
elif command -v openssl >/dev/null 2>&1; then
  sha() { openssl dgst -sha256 | awk '{print $NF}'; }
else
  die "ERROR: need sha256sum, shasum or openssl to verify the jar."
fi

here=$(cd "$(dirname "$0")" && pwd)
manifest="$here/classes/manifest.json"
[ -f "$manifest" ] || die "ERROR: $manifest not found."
[ -f "$1" ] || die "ERROR: $1 not found."

src="$(cd "$(dirname "$1")" && pwd)/$(basename "$1")"
dst="$(dirname "$src")/ext1605_20_client_hubfix.jar"

tmp=$(mktemp -d "${TMPDIR:-/tmp}/hubfix.XXXXXX")
trap 'rm -rf "$tmp"' EXIT INT TERM

# Flatten manifest.json into "class orig patched" lines (order-independent, no jq needed).
tr -d '\r' < "$manifest" | awk '
  { s = s $0 " " }
  END {
    n = 0
    while (match(s, /"[^"]*"/)) { tok[n++] = substr(s, RSTART + 1, RLENGTH - 2); s = substr(s, RSTART + RLENGTH) }
    m = 0
    for (i = 0; i < n; i++) {
      if (tok[i] == "orig")         { orig[cur] = tok[++i] }
      else if (tok[i] == "patched") { pat[cur]  = tok[++i] }
      else                          { cur = tok[i]; order[++m] = cur }
    }
    for (j = 1; j <= m; j++) print order[j], orig[order[j]], pat[order[j]]
  }' > "$tmp/manifest.txt"
[ -s "$tmp/manifest.txt" ] || die "ERROR: could not read $manifest."

unzip -Z1 "$src" > "$tmp/names.txt" 2>/dev/null || die "ERROR: $src is not a valid jar/zip."

# Verify every target class before touching anything.
while read -r cls orig patched; do
  grep -Fxq -- "$cls" "$tmp/names.txt" ||
    die "ERROR: $(short "$cls") not found - this is not the jar the patch was made for."
  h=$(unzip -p "$src" "$cls" | sha)
  [ "$h" != "$patched" ] || die "This jar is already patched."
  [ "$h" = "$orig" ] || die "ERROR: $(short "$cls") differs from the expected build. Refusing to patch."
done < "$tmp/manifest.txt"

echo "Jar verified. Writing $dst"
cp -f "$src" "$dst"

# Replace the target entries in the copy, in place (original entry order is kept).
while read -r cls orig patched; do
  [ -f "$here/classes/$cls" ] || { rm -f "$dst"; die "ERROR: patched class file classes/$(short "$cls") is missing."; }
  ( cd "$here/classes" && zip -q "$dst" "$cls" ) || { rm -f "$dst"; die "ERROR: failed to write $(short "$cls") into the jar."; }
  echo "  replaced $(short "$cls")"
done < "$tmp/manifest.txt"

echo "Done. Back up your original jar, then use the new one."
