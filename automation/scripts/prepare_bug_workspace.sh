#!/bin/zsh

set -u

PROJECT_ROOT="/Users/fangfang/Documents/SQA_Project_2026"
D4J="/Users/fangfang/Documents/SQA_Project/defects4j/framework/bin/defects4j"

PROJECT="${1:-}"
BUG="${2:-}"

if [[ -z "$PROJECT" || -z "$BUG" ]]; then
    echo "Usage:"
    echo "  $0 <project> <bug>"
    exit 2
fi

BUGGY="$PROJECT_ROOT/workspaces/${PROJECT}-${BUG}-buggy"
FIXED="$PROJECT_ROOT/workspaces/${PROJECT}-${BUG}-fixed"

echo "Preparing $PROJECT-$BUG"
echo "Buggy: $BUGGY"
echo "Fixed: $FIXED"

if [[ ! -d "$BUGGY" ]]; then
    echo
    echo "=== Checkout BUGGY ==="

    "$D4J" checkout \
        -p "$PROJECT" \
        -v "${BUG}b" \
        -w "$BUGGY"
else
    echo "BUGGY workspace already exists."
fi

if [[ ! -d "$FIXED" ]]; then
    echo
    echo "=== Checkout FIXED ==="

    "$D4J" checkout \
        -p "$PROJECT" \
        -v "${BUG}f" \
        -w "$FIXED"
else
    echo "FIXED workspace already exists."
fi

echo
echo "=== Workspace status ==="

if [[ -d "$BUGGY" ]]; then
    echo "BUGGY: READY"
else
    echo "BUGGY: MISSING"
fi

if [[ -d "$FIXED" ]]; then
    echo "FIXED: READY"
else
    echo "FIXED: MISSING"
fi
