#!/bin/zsh

DATASET="$1"
BUG_ID="$2"
METHOD="$3"
STATUS="$4"

ROOT="/Users/fangfang/Documents/SQA_Project_2026"

CHECKPOINT_DIR="$ROOT/automation/state/checkpoints/$DATASET/Bug-$BUG_ID/$METHOD"
CHECKPOINT_STATUS="$CHECKPOINT_DIR/status"
CHECKPOINT_CONTEXT="$CHECKPOINT_DIR/context"

mkdir -p "$CHECKPOINT_DIR"

printf '%s\n' "$STATUS" > "$CHECKPOINT_STATUS"

{
    printf 'dataset=%s\n' "$DATASET"
    printf 'bug_id=%s\n' "$BUG_ID"
    printf 'method=%s\n' "$METHOD"
    printf 'status=%s\n' "$STATUS"
    printf 'updated_at=%s\n' "$(date '+%Y-%m-%d %H:%M:%S %z')"
} > "$CHECKPOINT_CONTEXT"

echo "[CHECKPOINT] $DATASET Bug-$BUG_ID $METHOD -> $STATUS"
