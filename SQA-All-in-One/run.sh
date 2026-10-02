#!/usr/bin/env bash
set -euo pipefail
TASK_ROOT="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
cd "$TASK_ROOT"
if ! command -v python3 >/dev/null 2>&1; then
  echo 'ต้องมี Python 3 ใน Ubuntu/WSL ก่อน' >&2
  exit 2
fi
exec python3 -u main.py "$@"
