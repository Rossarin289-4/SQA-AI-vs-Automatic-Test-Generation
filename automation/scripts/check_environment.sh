#!/bin/zsh

set -u

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/../.." && pwd)"

source "$PROJECT_ROOT/automation/config/environment.sh"

echo "=============================================="
echo "SQA_PROJECT_2026 ENVIRONMENT CHECK"
echo "=============================================="

FAIL=0

check_file() {
    if [[ -f "$1" ]]; then
        echo "[PASS] FILE  $1"
    else
        echo "[FAIL] FILE  $1"
        FAIL=1
    fi
}

check_dir() {
    if [[ -d "$1" ]]; then
        echo "[PASS] DIR   $1"
    else
        echo "[FAIL] DIR   $1"
        FAIL=1
    fi
}

check_cmd() {
    if command -v "$1" >/dev/null 2>&1; then
        echo "[PASS] CMD   $1 -> $(command -v "$1")"
    else
        echo "[FAIL] CMD   $1"
        FAIL=1
    fi
}

echo
echo "----- COMMANDS -----"

check_cmd java
check_cmd javac
check_cmd git
check_cmd perl
check_cmd defects4j

echo
echo "----- WORKSPACES -----"

check_dir "$BUGGY_WORKSPACE"
check_dir "$FIXED_WORKSPACE"

echo
echo "----- GROUND TRUTH -----"

check_dir "$GROUND_TRUTH"
check_file "$GROUND_TRUTH/project.txt"
check_file "$GROUND_TRUTH/ground_truth.txt"
check_file "$GROUND_TRUTH/diff.txt"
check_file "$GROUND_TRUTH/buggy_git_head.txt"
check_file "$GROUND_TRUTH/fixed_git_head.txt"

echo
echo "----- CONFIGURATION -----"

check_file "$EXPERIMENT_CONFIG"
check_file "$PROJECT_ROOT/automation/config/test_contract.txt"
check_file "$PROJECT_ROOT/automation/config/environment.sh"

echo
echo "----- METHODS -----"

for METHOD in ChatGPT Gemini SA BPSO
do
    check_dir "$PROJECT_ROOT/Lang/$METHOD"
    check_dir "$PROJECT_ROOT/Lang/$METHOD/Result/Bug-3"
    check_dir "$PROJECT_ROOT/Lang/$METHOD/Result/Bug-3/Buggy"
    check_dir "$PROJECT_ROOT/Lang/$METHOD/Result/Bug-3/Fixed"
done

echo
echo "----- MASTER DATASET -----"

check_file "$MASTER_RESULTS"

echo
echo "----- JAVA -----"

java -version 2>&1
echo
javac -version 2>&1

echo
echo "----- DEFECTS4J -----"

defects4j version

echo
echo "----- FINAL RESULT -----"

if [[ "$FAIL" -eq 0 ]]; then
    echo "ENVIRONMENT CHECK: PASS"
    exit 0
else
    echo "ENVIRONMENT CHECK: FAIL"
    exit 1
fi
