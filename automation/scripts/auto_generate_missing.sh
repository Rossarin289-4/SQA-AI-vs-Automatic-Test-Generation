#!/bin/zsh

PROJECT="$1"
BUG="$2"
METHOD="$3"

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
PROJECT_ROOT="$(cd "$ROOT/.." && pwd)"

ARTIFACT_DIR="$PROJECT_ROOT/automation/runs/$PROJECT/Bug-$BUG/$METHOD"
GENERATOR="$PROJECT_ROOT/automation/scripts/generate_algorithm_test.sh"

if [[ "$PROJECT" != "Lang" ]]; then
    echo "ERROR: This generator pilot currently supports Lang only."
    exit 2
fi

if [[ "$METHOD" != "SA" && "$METHOD" != "BPSO" ]]; then
    echo "ERROR: METHOD must be SA or BPSO."
    exit 2
fi

mkdir -p "$ARTIFACT_DIR"

EXPERIMENT="$ARTIFACT_DIR/experiment.json"
GENERATED="$ARTIFACT_DIR/generated_test.java"
LOG="$ARTIFACT_DIR/generation.log"
TIME_FILE="$ARTIFACT_DIR/generation_seconds.txt"

if [[ -f "$EXPERIMENT" ]] && grep -q '"status"[[:space:]]*:[[:space:]]*"DONE"' "$EXPERIMENT"; then
    printf '%s\n' "DONE" > "$ARTIFACT_DIR/status"
    echo "SKIP: canonical experiment already DONE"
    exit 0
fi

if [[ -s "$GENERATED" ]]; then
    printf '%s\n' "GENERATED" > "$ARTIFACT_DIR/status"
    echo "SKIP: generated_test.java already exists"
    exit 0
fi

printf '%s\n' "GENERATING" > "$ARTIFACT_DIR/status"

START_NS="$(python3 -c 'import time; print(time.time_ns())')"

echo "============================================================" | tee "$LOG"
echo "AUTO GENERATION" | tee -a "$LOG"
echo "PROJECT=$PROJECT BUG=$BUG METHOD=$METHOD" | tee -a "$LOG"
echo "START=$(date)" | tee -a "$LOG"
echo "============================================================" | tee -a "$LOG"

python3 - "$GENERATOR" "$PROJECT" "$BUG" "$METHOD" "$ARTIFACT_DIR" >> "$LOG" 2>&1 <<'PY'
import subprocess
import sys

generator = sys.argv[1]
project = sys.argv[2]
bug = sys.argv[3]
method = sys.argv[4]
artifact = sys.argv[5]

try:
    result = subprocess.run(
        [generator, project, bug, method, artifact],
        timeout=180
    )
    sys.exit(result.returncode)
except subprocess.TimeoutExpired:
    print("GENERATOR_TIMEOUT_AFTER_180_SECONDS")
    sys.exit(124)
PY

RC=$?

END_NS="$(python3 -c 'import time; print(time.time_ns())')"

python3 - "$START_NS" "$END_NS" > "$TIME_FILE" <<'PY'
import sys
start = int(sys.argv[1])
end = int(sys.argv[2])
print((end - start) / 1_000_000_000)
PY

echo "" | tee -a "$LOG"
echo "RETURN_CODE=$RC" | tee -a "$LOG"
echo "END=$(date)" | tee -a "$LOG"

if [[ "$RC" -eq 0 && -s "$GENERATED" ]]; then
    printf '%s\n' "AUTO_GENERIC" > "$ARTIFACT_DIR/provider_mode"
    printf '%s\n' "GENERATED" > "$ARTIFACT_DIR/status"
    echo "GENERATION SUCCESS" | tee -a "$LOG"
    exit 0
fi

printf '%s\n' "GENERATOR_FAILED" > "$ARTIFACT_DIR/status"
echo "GENERATION FAILED" | tee -a "$LOG"
exit 1
