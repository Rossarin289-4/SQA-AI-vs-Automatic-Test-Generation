#!/usr/bin/env bash
set -u -o pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"; BASE="${1:-$HOME/SQA/projects}"; OUT="$ROOT/compile_gate.tsv"
printf 'bug\ttarget\tbuggy_rc\tfixed_rc\tstatus\n' > "$OUT"
for id in $(seq 1 16); do
  file="$ROOT/SA/Test/Closure-$id/candidates.tsv"; tail -n +2 "$file" | while IFS=$'\t' read -r cid target; do
    (cd "$BASE/Closure-${id}b" && defects4j test -t "$target" >/tmp/cb.$$ 2>&1); br=$?
    (cd "$BASE/Closure-${id}f" && defects4j test -t "$target" >/tmp/cf.$$ 2>&1); fr=$?
    status=OTHER; [[ $br -ne 0 && $fr -eq 0 ]] && status=DETECTED
    printf 'Closure-%s\t%s\t%s\t%s\t%s\n' "$id" "$target" "$br" "$fr" "$status" >> "$OUT"
  done
done
