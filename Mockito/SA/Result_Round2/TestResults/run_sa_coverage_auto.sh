#!/usr/bin/env bash

set -u

ROOT="/mnt/c/Users/User/SQA-AI-vs-Automatic-Test-Generation"
SEL="$ROOT/Mockito/SA/Result_Round2/sa_selection.csv"
SRC="$ROOT/Mockito/SA/Configuration/modified-sources.csv"
OUTDIR="$ROOT/Mockito/SA/Result_Round2/TestResults"
OUT="$OUTDIR/sa_coverage_results.csv"
D4J="$HOME/defects4j/framework/bin/defects4j"

COB_JAR="$HOME/defects4j/framework/projects/Mockito/lib/cobertura-2.0.3.jar"
COB_LIB="$HOME/defects4j/framework/projects/lib/cobertura-2.0.3-lib/*"
JUNIT="$HOME/defects4j/framework/projects/lib/junit-4.12-hamcrest-1.3.jar"
MOCKITO_LIB="$HOME/defects4j/framework/projects/Mockito/lib/*"
BYTE_BUDDY="$HOME/defects4j/framework/projects/Mockito/byte-buddy/byte-buddy-0.6.8.jar"
D4J_LIB="$HOME/defects4j/framework/lib/*"

mkdir -p "$OUTDIR"

if [ ! -f "$OUT" ]; then
    echo "bug_id,test_target,buggy_line,buggy_branch,fixed_line,fixed_branch,line_delta,branch_delta,status" > "$OUT"
fi

get_targets() {
    local bug="$1"
    awk -F',' -v b="$bug" 'NR>1 && $1==b {print $2}' "$SRC"
}

get_existing_status() {
    local bug="$1"
    awk -F',' -v b="$bug" 'NR>1 && $1==b && $9=="OK" {print $9}' "$OUT" | tail -1
}

calc_coverage() {
    local xml="$1"
    shift
    local targets=("$@")

    python3 - "$xml" "${targets[@]}" <<'PY'
import sys
import xml.etree.ElementTree as ET
import re

xml = sys.argv[1]
targets = sys.argv[2:]

tree = ET.parse(xml)
root = tree.getroot()

target_set = set(t.replace('.', '/') + '.java' for t in targets)

covered_lines = 0
total_lines = 0
covered_branches = 0
total_branches = 0
found = 0

for cls in root.iter('class'):
    filename = cls.attrib.get('filename', '')
    if filename not in target_set:
        continue

    found += 1

    lines = cls.find('lines')
    if lines is not None:
        for line in lines.findall('line'):
            total_lines += 1
            if int(line.attrib.get('hits', '0')) > 0:
                covered_lines += 1

            if line.attrib.get('branch', 'false') == 'true':
                cc = line.attrib.get('condition-coverage', '')
                m = re.search(r'\((\d+)\s*/\s*(\d+)\)', cc)
                if m:
                    covered_branches += int(m.group(1))
                    total_branches += int(m.group(2))

line = 100.0 * covered_lines / total_lines if total_lines else 0.0
branch = 100.0 * covered_branches / total_branches if total_branches else 0.0

print(f"{line:.2f},{branch:.2f},{found},{covered_lines},{total_lines},{covered_branches},{total_branches}")
PY
}

run_one() {
    local bug="$1"
    local target="$2"
    local version="$3"

    local work="/tmp/Mockito-${bug}${version}"
    local ser="$work/cobertura-mockito.ser"
    local inst="$work/cobertura-instrumented"
    local classes="$work/.classes_instrumented"
    local report="$work/coverage-report"
    local log="/tmp/sa_coverage_${bug}${version}.log"
    rm -rf "$work"

    echo "============================================================"
    echo "Mockito-${bug}${version}"
    echo "Target: $target"
    echo "============================================================"

    "$D4J" checkout -p Mockito -v "${bug}${version}" -w "$work" > "$log" 2>&1 || {
        echo "CHECKOUT_ERROR"
        return 10
    }

    # Old Mockito buildSrc test calls GitHub API and can fail.
    if [ -f "$work/buildSrc/src/test/groovy/org/mockito/release/notes/improvements/GitHubTicketFetcherTest.groovy" ]; then
        mv "$work/buildSrc/src/test/groovy/org/mockito/release/notes/improvements/GitHubTicketFetcherTest.groovy" \
           "$work/buildSrc/src/test/groovy/org/mockito/release/notes/improvements/GitHubTicketFetcherTest.groovy.disabled"
    fi

    cd "$work" || return 11

    /home/user/defects4j/framework/bin/defects4j compile >> "$log" 2>&1 || {
        echo "COMPILE_ERROR"
        return 12
    }

    rm -rf "$inst" "$classes" "$report"
    mkdir -p "$classes"

    java -cp "$COB_JAR:$COB_LIB" \
        net.sourceforge.cobertura.instrument.Main \
        --basedir "$work" \
        --destination "$inst" \
        --datafile "$ser" \
        --auxClasspath "$work/build/classes/java/main:$BYTE_BUDDY" \
        build/classes/java/main >> "$log" 2>&1 || {
        echo "INSTRUMENT_ERROR"
        return 13
    }

    cp -r "$inst"/* "$classes"/

    local test_class="${target%%::*}"
    local test_method="${target##*::}"

    # Run only the selected JUnit method through a tiny JUnit launcher.
    cat > "$work/SelectedMethodRunner.java" <<'JAVA'
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

public class SelectedMethodRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
            Request.method(Class.forName(args[0]), args[1]).getRunner().getDescription().getClass()
        );
    }
}
JAVA

    # Use JUnit's internal Request via a small launcher generated with reflection.
    cat > "$work/SelectedMethodRunner.java" <<'JAVA'
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

public class SelectedMethodRunner {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName(args[0]);
        Request request = Request.method(clazz, args[1]);
        JUnitCore core = new JUnitCore();
        Result result = core.run(request);
        System.exit(result.wasSuccessful() ? 0 : 1);
    }
}
JAVA

    javac -cp "$classes:build/classes/java/test:build/classes/java/main:$JUNIT:$MOCKITO_LIB:$BYTE_BUDDY:$D4J_LIB" \
        "$work/SelectedMethodRunner.java" >> "$log" 2>&1 || {
        echo "RUNNER_COMPILE_ERROR"
        return 14
    }

    set +e
    java -Dnet.sourceforge.cobertura.datafile="$ser" \
        -cp "$work:$classes:build/classes/java/test:build/classes/java/main:$JUNIT:$MOCKITO_LIB:$BYTE_BUDDY:$D4J_LIB" \
        SelectedMethodRunner "$test_class" "$test_method" >> "$log" 2>&1
    local test_rc=$?
    set -e

    # Coverage report is still useful even when buggy version fails.
    mkdir -p "$report"

    java -cp "$COB_JAR:$COB_LIB" \
        net.sourceforge.cobertura.reporting.Main \
        --datafile "$ser" \
        --destination "$report" \
        --format xml >> "$log" 2>&1 || {
        echo "REPORT_ERROR"
        return 15
    }

    local cov
    cov=$(calc_coverage "$report/coverage.xml" "$@") || {
        echo "COVERAGE_PARSE_ERROR"
        return 16
    }

    echo "$cov"
    echo "TEST_RC=$test_rc"
    return 0
}

# Read selections and process every bug.
tail -n +2 "$SEL" | while IFS=',' read -r bug target fitness seed iterations temperature cooling; do

    # Resume: skip completed rows.
    existing=$(get_existing_status "$bug")
    if [ -n "$existing" ]; then
        echo "SKIP Mockito-$bug: already recorded ($existing)"
        continue
    fi

    mapfile -t targets < <(get_targets "$bug")

    if [ "${#targets[@]}" -eq 0 ]; then
        echo "$bug,\"$target\",,,,,,,NO_MODIFIED_SOURCE" >> "$OUT"
        continue
    fi

    echo
    echo "################ BUG $bug ################"
    printf 'Modified sources:\n'
    printf '  %s\n' "${targets[@]}"

    buggy=$(run_one "$bug" "$target" "b" "${targets[@]}" 2>&1)
    buggy_status=$?

    if [ "$buggy_status" -ne 0 ]; then
        echo "$bug,\"$target\",,,,,,,BUGGY_${buggy}" >> "$OUT"
        continue
    fi

    fixed=$(run_one "$bug" "$target" "f" "${targets[@]}" 2>&1)
    fixed_status=$?

    if [ "$fixed_status" -ne 0 ]; then
        echo "$bug,\"$target\",,,,,,,FIXED_${fixed}" >> "$OUT"
        continue
    fi

    buggy_cov=$(printf '%s\n' "$buggy" | grep -E '^[0-9]+\.[0-9]+,[0-9]+\.[0-9]+,' | tail -1)
    fixed_cov=$(printf '%s\n' "$fixed" | grep -E '^[0-9]+\.[0-9]+,[0-9]+\.[0-9]+,' | tail -1)

    if [ -z "$buggy_cov" ] || [ -z "$fixed_cov" ]; then
        echo "$bug,\"$target\",,,,,,,COVERAGE_MISSING" >> "$OUT"
        continue
    fi

    buggy_line=$(echo "$buggy_cov" | cut -d',' -f1)
    buggy_branch=$(echo "$buggy_cov" | cut -d',' -f2)
    fixed_line=$(echo "$fixed_cov" | cut -d',' -f1)
    fixed_branch=$(echo "$fixed_cov" | cut -d',' -f2)

    line_delta=$(awk -v f="$fixed_line" -v b="$buggy_line" 'BEGIN {printf "%.2f", f-b}')
    branch_delta=$(awk -v f="$fixed_branch" -v b="$buggy_branch" 'BEGIN {printf "%.2f", f-b}')

    echo "$bug,\"$target\",$buggy_line,$buggy_branch,$fixed_line,$fixed_branch,$line_delta,$branch_delta,OK" >> "$OUT"

    rm -rf "/tmp/Mockito-${bug}b" "/tmp/Mockito-${bug}f"

done

echo
echo "============================================================"
echo "DONE"
echo "Results:"
echo "$OUT"
echo "============================================================"
