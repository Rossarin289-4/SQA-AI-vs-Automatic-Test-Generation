#!/bin/zsh

set -u

PROJECT_ROOT="/Users/fangfang/Documents/SQA_Project_2026"

PROJECT="${1:-}"
BUG="${2:-}"
METHOD="${3:-}"

if [[ -z "$PROJECT" || -z "$BUG" || -z "$METHOD" ]]; then
    echo "Usage:"
    echo "  $0 <project> <bug> <method>"
    echo
    echo "Example:"
    echo "  $0 Lang 5 ChatGPT"
    exit 2
fi

RESULT_DIR="$PROJECT_ROOT/automation/runs/${PROJECT}/Bug-${BUG}/${METHOD}"

mkdir -p "$RESULT_DIR"

cat > "$RESULT_DIR/status" <<STATUS
PENDING
STATUS

echo "============================================================"
echo "INITIALIZE EXPERIMENT"
echo "============================================================"
echo "Project : $PROJECT"
echo "Bug     : $BUG"
echo "Method  : $METHOD"
echo "Result  : $RESULT_DIR"
echo
echo "Status  : PENDING"
echo "============================================================"
