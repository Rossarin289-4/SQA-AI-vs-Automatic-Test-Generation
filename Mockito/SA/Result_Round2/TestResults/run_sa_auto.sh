#!/bin/bash

set -u

ROOT="/mnt/c/Users/User/SQA-AI-vs-Automatic-Test-Generation"
D4J="$HOME/defects4j/framework/bin/defects4j"
SEL="$ROOT/Mockito/SA/Result_Round2/sa_selection.csv"
OUT="$ROOT/Mockito/SA/Result_Round2/TestResults/sa_execution_results.csv"

cd "$ROOT" || exit 1

# เพิ่มผลที่รันจริงแล้วสำหรับ Mockito-8 และ Mockito-9
grep -q '^Mockito-8,' "$OUT" || \
echo 'Mockito-8,org.mockito.internal.util.reflection.GenericMetadataSupportTest::class_return_type_of____append____resolved_to_StringBuilder_and_type_arguments,PASS,PASS,NOT_DETECTED' >> "$OUT"

grep -q '^Mockito-9,' "$OUT" || \
echo 'Mockito-9,org.mockito.internal.stubbing.answers.ReturnsArgumentAtTest::should_raise_an_exception_if_index_is_not_in_allowed_range_at_creation_time,PASS,PASS,NOT_DETECTED' >> "$OUT"

# Auto: Mockito-10 ถึง Mockito-38
tail -n +2 "$SEL" | while IFS=',' read -r bug_id test_target fitness seed iterations temperature cooling_rate
do
    case "$bug_id" in
        10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38)
            ;;
        *) continue ;;
    esac

    if grep -q "^Mockito-${bug_id}," "$OUT"; then
        echo "SKIP Mockito-${bug_id} (already exists)"
        continue
    fi

    echo
    echo "========================================"
    echo "Mockito-${bug_id}"
    echo "Test: $test_target"
    echo "========================================"

    rm -rf "/tmp/Mockito-${bug_id}b" "/tmp/Mockito-${bug_id}f"

    echo "[1/4] Checkout buggy..."
    if ! "$D4J" checkout -p Mockito -v "${bug_id}b" -w "/tmp/Mockito-${bug_id}b" >/tmp/mockito_checkout_${bug_id}b.log 2>&1; then
        echo "ERROR: checkout buggy Mockito-${bug_id}"
        echo "Mockito-${bug_id},$test_target,ERROR,ERROR,ERROR" >> "$OUT"
        rm -rf "/tmp/Mockito-${bug_id}b" "/tmp/Mockito-${bug_id}f"
        continue
    fi

    echo "[2/4] Run buggy..."
    buggy_output=$(
        cd "/tmp/Mockito-${bug_id}b" && \
        "$D4J" test -t "$test_target" 2>&1
    )
    buggy_status=$?

    echo "$buggy_output" | tail -n 5

    if [ $buggy_status -eq 0 ] || echo "$buggy_output" | grep -q "Failing tests: 0"; then
        buggy_result="PASS"
    elif echo "$buggy_output" | grep -q "Failing tests:"; then
        buggy_result="FAIL"
    else
        buggy_result="ERROR"
    fi

    echo "[3/4] Checkout fixed..."
    if ! "$D4J" checkout -p Mockito -v "${bug_id}f" -w "/tmp/Mockito-${bug_id}f" >/tmp/mockito_checkout_${bug_id}f.log 2>&1; then
        echo "ERROR: checkout fixed Mockito-${bug_id}"
        echo "Mockito-${bug_id},$test_target,$buggy_result,ERROR,ERROR" >> "$OUT"
        rm -rf "/tmp/Mockito-${bug_id}b" "/tmp/Mockito-${bug_id}f"
        continue
    fi

    echo "[4/4] Run fixed..."
    fixed_output=$(
        cd "/tmp/Mockito-${bug_id}f" && \
        "$D4J" test -t "$test_target" 2>&1
    )
    fixed_status=$?

    echo "$fixed_output" | tail -n 5

    if [ $fixed_status -eq 0 ] || echo "$fixed_output" | grep -q "Failing tests: 0"; then
        fixed_result="PASS"
    elif echo "$fixed_output" | grep -q "Failing tests:"; then
        fixed_result="FAIL"
    else
        fixed_result="ERROR"
    fi

    if [ "$buggy_result" = "FAIL" ] && [ "$fixed_result" = "PASS" ]; then
        classification="DETECTED"
    elif [ "$buggy_result" = "ERROR" ] || [ "$fixed_result" = "ERROR" ]; then
        classification="ERROR"
    else
        classification="NOT_DETECTED"
    fi

    echo "RESULT: Mockito-${bug_id} $buggy_result -> $fixed_result = $classification"

    echo "Mockito-${bug_id},$test_target,$buggy_result,$fixed_result,$classification" >> "$OUT"

    # ลบ checkout เพื่อไม่ให้ /tmp เต็ม
    rm -rf "/tmp/Mockito-${bug_id}b" "/tmp/Mockito-${bug_id}f"

    echo "Saved Mockito-${bug_id}"
    echo "Current /tmp:"
    df -h /tmp | tail -n 1
done

echo
echo "========================================"
echo "AUTO EXECUTION FINISHED"
echo "========================================"

echo
echo "Results:"
cat "$OUT"
