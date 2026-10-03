#!/usr/bin/env bash
set -euo pipefail
BASE="${1:-$HOME/SQA/projects}"
for id in $(seq 1 16); do
  for v in b f; do
    dir="$BASE/Closure-${id}${v}"
    if [[ ! -d "$dir" ]]; then defects4j checkout -p Closure -v "${id}${v}" -w "$dir"; fi
    (cd "$dir" && defects4j compile)
  done
done
