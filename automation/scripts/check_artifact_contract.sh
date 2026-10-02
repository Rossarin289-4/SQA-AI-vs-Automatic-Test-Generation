#!/bin/zsh

set -u

METHOD="${1:-}"
BUG_ROOT="${2:-}"

if [[ -z "$METHOD" || -z "$BUG_ROOT" ]]; then
    echo "Usage:"
    echo "  $0 <method> <bug_root>"
    exit 2
fi

case "$METHOD" in
    ChatGPT|Gemini|SA|BPSO)
        ;;
    *)
        echo "ERROR: Unsupported method: $METHOD"
        exit 2
        ;;
esac

REQUIRED=(
    "generated_test.java"
)

OPTIONAL=(
    "prompt.txt"
    "raw_output.txt"
    "generation.log"
    "generation_result.json"
)

ERRORS=0

echo "=== Artifact Contract ==="
echo "Method : $METHOD"
echo "Root   : $BUG_ROOT"
echo

for file in "${REQUIRED[@]}"; do
    if [[ -f "$BUG_ROOT/$file" ]]; then
        echo "OK       $file"
    else
        echo "MISSING  $file"
        ERRORS=$((ERRORS + 1))
    fi
done

for file in "${OPTIONAL[@]}"; do
    if [[ -f "$BUG_ROOT/$file" ]]; then
        echo "FOUND    $file"
    else
        echo "OPTIONAL $file"
    fi
done

if [[ "$ERRORS" -gt 0 ]]; then
    echo
    echo "ERROR: Artifact contract failed."
    exit 1
fi

echo
echo "OK: Artifact contract passed."
exit 0
