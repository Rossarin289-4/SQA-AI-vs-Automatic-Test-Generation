#!/bin/zsh

PROJECT_ROOT="${PROJECT_ROOT:-/Users/fangfang/Documents/SQA_Project_2026}"
MIN_FREE_GB="${MIN_FREE_GB:-20}"

AVAILABLE_KB=$(df -Pk "$PROJECT_ROOT" | awk 'NR==2 {print $4}')
AVAILABLE_GB=$((AVAILABLE_KB / 1024 / 1024))

echo "============================================================"
echo "RESOURCE GUARD"
echo "============================================================"
echo "Project root : $PROJECT_ROOT"
echo "Free disk    : ${AVAILABLE_GB} GB"
echo "Minimum      : ${MIN_FREE_GB} GB"

if [ "$AVAILABLE_GB" -lt "$MIN_FREE_GB" ]; then
    echo
    echo "[STOP] Disk space below safety threshold."
    echo "[STOP] No new experiment should start."
    exit 2
fi

echo
echo "[PASS] Disk space is sufficient."
echo "============================================================"
