#!/bin/zsh

set -u

PROJECT_ROOT="/Users/fangfang/Documents/SQA_Project_2026"

PROJECT="${1:-Lang}"

STATE_DIR="$PROJECT_ROOT/automation/state"

echo "============================================================"
echo "EXPERIMENT STATE"
echo "============================================================"
echo "Project: $PROJECT"
echo

if [[ ! -d "$STATE_DIR" ]]; then
    echo "No state directory."
    exit 0
fi

FOUND=0

for file in "$STATE_DIR"/*.json(N); do
    FOUND=1
    echo "--- $(basename "$file") ---"
    cat "$file"
    echo
done

if [[ "$FOUND" -eq 0 ]]; then
    echo "No state files found."
fi

echo "============================================================"
