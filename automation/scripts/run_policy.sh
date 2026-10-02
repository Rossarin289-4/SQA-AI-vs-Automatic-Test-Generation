#!/bin/zsh

ROOT="/Users/fangfang/Documents/SQA_Project_2026"

export MIN_FREE_GB="${MIN_FREE_GB:-20}"
export MAX_WORKSPACE_GB="${MAX_WORKSPACE_GB:-8}"

echo "============================================================"
echo "AUTOMATION RESOURCE POLICY"
echo "============================================================"

"$ROOT/automation/scripts/resource_guard.sh"

WORKSPACE_KB=$(du -sk "$ROOT/workspaces" 2>/dev/null | awk '{print $1}')

if [ -z "$WORKSPACE_KB" ]; then
    WORKSPACE_KB=0
fi

WORKSPACE_GB=$((WORKSPACE_KB / 1024 / 1024))

echo
echo "Workspace usage : ${WORKSPACE_GB} GB"
echo "Workspace limit : ${MAX_WORKSPACE_GB} GB"

if [ "$WORKSPACE_GB" -ge "$MAX_WORKSPACE_GB" ]; then
    echo
    echo "[STOP] Workspace usage reached safety limit."
    echo "[STOP] Cleanup completed Bugs before continuing."
    exit 3
fi

echo
echo "[PASS] Automation resource policy."
echo "============================================================"
