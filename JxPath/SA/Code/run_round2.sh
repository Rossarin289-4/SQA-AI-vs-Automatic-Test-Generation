#!/usr/bin/env bash
set -u

ROOT="/mnt/c/Users/User/SQA-AI-vs-Automatic-Test-Generation"
SELECT="$ROOT/JxPath/SA/Result_Round1/sa_selection.csv"
OUT="$ROOT/JxPath/SA/Result_Round2/sa_round2_results.csv"

D4J="$HOME/defects4j/framework/bin/defects4j"

cd "$ROOT" || exit 1

echo "bug_id,test_target,buggy_status,fixed_status,detection,buggy_time_ms,fixed_time_ms" > "$OUT"

tail -n +2 "$SELECT" | while IFS=',' read -r bug_id test_target fitness seed iterations temperature cooling; do
    echo "============================================================"
    echo "JxPath-${bug_id}"
    echo "Test: ${test_target}"

    B="/tmp/JxPath-${bug_id}b"
    F="/tmp/JxPath-${bug_id}f"

    rm -rf "$B" "$F"

    echo "[1/2] Checkout buggy JxPath-${bug_id}b"
    "$D4J" checkout -p JxPath -v "${bug_id}b" -w "$B" >/dev/null 2>&1

    echo "[2/2] Checkout fixed JxPath-${bug_id}f"
    "$D4J" checkout -p JxPath -v "${bug_id}f" -w "$F" >/dev/null 2>&1

    # ---------------------------------------------------------
    # Buggy
    # ---------------------------------------------------------
    cd "$B" || exit 1

    b_start=$(python3 -c "import time; print(int(time.time()*1000))")

    b_output=$("$D4J" test -t "$test_target" 2>&1)
    b_rc=$?

    b_end=$(python3 -c "import time; print(int(time.time()*1000))")
    b_time=$((b_end - b_start))

    if [ "$b_rc" -eq 0 ]; then
        b_status="PASS"
    else
        b_status="FAIL"
    fi

    # ---------------------------------------------------------
    # Fixed
    # ---------------------------------------------------------
    cd "$F" || exit 1

    f_start=$(python3 -c "import time; print(int(time.time()*1000))")

    f_output=$("$D4J" test -t "$test_target" 2>&1)
    f_rc=$?

    f_end=$(python3 -c "import time; print(int(time.time()*1000))")
    f_time=$((f_end - f_start))

    if [ "$f_rc" -eq 0 ]; then
        f_status="PASS"
    else
        f_status="FAIL"
    fi

    # Detection criterion:
    # buggy FAIL + fixed PASS
    if [ "$b_status" = "FAIL" ] && [ "$f_status" = "PASS" ]; then
        detection="YES"
    else
        detection="NO"
    fi

    echo "${bug_id},${test_target},${b_status},${f_status},${detection},${b_time},${f_time}" >> "$OUT"

    echo "Buggy : $b_status"
    echo "Fixed : $f_status"
    echo "Detect: $detection"

    cd "$ROOT" || exit 1
done

echo
echo "============================================================"
echo "SA Round 2 finished"
echo "Result: $OUT"
echo "============================================================"
