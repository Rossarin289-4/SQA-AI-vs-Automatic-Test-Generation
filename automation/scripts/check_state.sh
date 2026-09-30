#!/bin/zsh

set -u

PROJECT_ROOT="$(cd "$(dirname "$0")/../.." && pwd)"

STATE_FILE="$PROJECT_ROOT/automation/state/Lang-3.json"

if [[ ! -f "$STATE_FILE" ]]; then
    echo "ERROR: State file not found:"
    echo "$STATE_FILE"
    exit 1
fi

echo "=============================================="
echo "CURRENT EXPERIMENT STATE"
echo "=============================================="

cat "$STATE_FILE"

echo
echo "=============================================="
echo "EXPECTED STATES"
echo "=============================================="

echo "PENDING"
echo "GENERATING"
echo "COMPILED"
echo "EXECUTING_BUGGY"
echo "EXECUTING_FIXED"
echo "EVALUATING"
echo "DONE"
echo "FAILED"
echo "SKIPPED"
