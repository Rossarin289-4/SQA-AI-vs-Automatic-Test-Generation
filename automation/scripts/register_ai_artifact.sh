#!/bin/zsh

set -u

PROJECT="${1:-}"
BUG="${2:-}"
METHOD="${3:-}"
GENERATED_TEST="${4:-}"
RAW_OUTPUT="${5:-}"
PROMPT="${6:-}"
GENERATION_SECONDS="${7:-}"

if [[ -z "$PROJECT" ||
      -z "$BUG" ||
      -z "$METHOD" ||
      -z "$GENERATED_TEST" ||
      -z "$RAW_OUTPUT" ||
      -z "$PROMPT" ||
      -z "$GENERATION_SECONDS" ]]; then

    echo "Usage:"
    echo "  $0 <project> <bug> <method> <generated_test> <raw_output> <prompt> <generation_seconds>"
    exit 2
fi

ROOT="$(cd "$(dirname "$0")/../.." && pwd)"

ARTIFACT_DIR="$ROOT/automation/runs/$PROJECT/Bug-$BUG/$METHOD"

mkdir -p "$ARTIFACT_DIR"

cp "$GENERATED_TEST" \
   "$ARTIFACT_DIR/generated_test.java"

cp "$RAW_OUTPUT" \
   "$ARTIFACT_DIR/raw_output.txt"

cp "$PROMPT" \
   "$ARTIFACT_DIR/prompt.txt"

printf '%s\n' "$GENERATION_SECONDS" \
    > "$ARTIFACT_DIR/generation_seconds.txt"

python3 \
    "$ROOT/automation/scripts/check_generated_artifact.py" \
    --artifact-dir "$ARTIFACT_DIR" \
    --method "$METHOD"

if [[ $? -ne 0 ]]; then
    echo "ERROR: artifact validation failed."
    exit 1
fi

echo "Registered:"
echo "  $ARTIFACT_DIR"
