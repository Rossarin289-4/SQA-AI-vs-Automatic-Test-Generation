#!/bin/zsh

PROJECT_ROOT="/Users/fangfang/Documents/SQA_Project_2026"
cd "$PROJECT_ROOT"

export PERL5LIB="$HOME/perl5/lib/perl5:${PERL5LIB:-}"
export JAVA_HOME="/opt/homebrew/opt/openjdk@11/libexec/openjdk.jdk/Contents/Home"
export PATH="/opt/homebrew/bin:$JAVA_HOME/bin:$PATH"

LOCK_DIR="automation/state/lang_auto_controller.lock"
PID_FILE="$LOCK_DIR/pid"
LOG_DIR="automation/state/logs"
TIMESTAMP=$(date "+%Y%m%d_%H%M%S")
LOG_FILE="$LOG_DIR/lang_auto_controller_${TIMESTAMP}.log"

mkdir -p "$LOG_DIR"

if [ -d "$LOCK_DIR" ]; then
    if [ -f "$PID_FILE" ]; then
        OLD_PID=$(cat "$PID_FILE" 2>/dev/null)
        if [ -n "$OLD_PID" ] && kill -0 "$OLD_PID" 2>/dev/null; then
            echo "[INFO] Auto Controller is already running."
            echo "[INFO] PID: $OLD_PID"
            echo "[INFO] Existing lock: $LOCK_DIR"
        else
            echo "[INFO] Removing stale controller lock."
            rmdir "$LOCK_DIR" 2>/dev/null
        fi
    else
        echo "[INFO] Removing stale controller lock."
        rmdir "$LOCK_DIR" 2>/dev/null
    fi
fi

if [ ! -d "$LOCK_DIR" ]; then
    mkdir "$LOCK_DIR" 2>/dev/null
fi

if [ -d "$LOCK_DIR" ] && [ ! -f "$PID_FILE" ]; then
    echo "$$" > "$PID_FILE"
fi

if [ -f "$PID_FILE" ]; then
    CURRENT_PID=$(cat "$PID_FILE" 2>/dev/null)
    if [ "$CURRENT_PID" != "$$" ]; then
        if kill -0 "$CURRENT_PID" 2>/dev/null; then
            echo "[INFO] Another Auto Controller is active: PID $CURRENT_PID"
        else
            echo "$$" > "$PID_FILE"
        fi
    fi
fi

cleanup_controller() {
    if [ -f "$PID_FILE" ]; then
        LOCK_PID=$(cat "$PID_FILE" 2>/dev/null)
        if [ "$LOCK_PID" = "$$" ]; then
            rm -f "$PID_FILE"
            rmdir "$LOCK_DIR" 2>/dev/null
        fi
    fi
}

trap cleanup_controller EXIT INT TERM

{
    echo "======================================================================"
    echo "LANG AUTO CONTROLLER"
    echo "======================================================================"
    echo "Started : $(date)"
    echo "PID     : $$"
    echo "Project : $PROJECT_ROOT"
    echo

    echo "--- Environment ---"
    java -version
    echo
    ant -version
    echo

    echo "--- Runner syntax check ---"
    if zsh -n ./run_all.sh; then
        echo "[PASS] run_all.sh syntax OK"
    else
        echo "[FAIL] run_all.sh syntax check failed"
    fi

    echo
    echo "--- Existing DONE statuses ---"
    echo "Lang-1:"
    grep -E "Lang,1,(SA|BPSO)," automation/state/master_results.csv 2>/dev/null || true
    echo "Lang-3:"
    grep -E "Lang,3,(SA|BPSO)," automation/state/master_results.csv 2>/dev/null || true
    echo "Lang-4:"
    grep -E "Lang,4,(SA|BPSO)," automation/state/master_results.csv 2>/dev/null || true
    echo "Lang-5:"
    grep -E "Lang,5,(SA|BPSO)," automation/state/master_results.csv 2>/dev/null || true
    echo "Lang-6:"
    grep -E "Lang,6,(SA|BPSO)," automation/state/master_results.csv 2>/dev/null || true
    echo "Lang-7:"
    grep -E "Lang,7,(SA|BPSO)," automation/state/master_results.csv 2>/dev/null || true

    echo
    echo "======================================================================"
    echo "STARTING CANONICAL LANG RUNNER"
    echo "======================================================================"
    echo "Command: ./run_all.sh --dataset Lang"
    echo

    ./run_all.sh --dataset Lang

    RUNNER_RC=$?

    echo
    echo "======================================================================"
    echo "RUNNER FINISHED"
    echo "======================================================================"
    echo "Return code: $RUNNER_RC"
    echo "Finished: $(date)"

    echo
    echo "--- Final Lang status summary ---"
    if [ -f automation/state/master_results.csv ]; then
        python3 -c '
import csv
from collections import Counter

p = "automation/state/master_results.csv"
rows = list(csv.DictReader(open(p)))

lang = [r for r in rows if r.get("project") == "Lang"]

print("Lang rows:", len(lang))
print("Status counts:")
for k,v in sorted(Counter(r.get("status","") for r in lang).items()):
    print(" ", k, "=", v)

print()
print("DONE algorithm rows:")
for r in lang:
    if r.get("method") in ("SA","BPSO") and r.get("status") == "DONE":
        print(" ", r.get("bug_id"), r.get("method"), "FDR=", r.get("fdr_percent"))
'
    else
        echo "[WARN] master_results.csv not found"
    fi

    echo
    echo "======================================================================"
    echo "LANG AUTO CONTROLLER COMPLETE"
    echo "======================================================================"
} > "$LOG_FILE" 2>&1

echo "[INFO] Controller log: $LOG_FILE"
