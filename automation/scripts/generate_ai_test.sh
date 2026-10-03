#!/bin/zsh
set -u

PROJECT="${1:-}"
BUG="${2:-}"
METHOD="${3:-}"

ROOT="$(cd "$(dirname "$0")/../.." && pwd)"
D4J="/Users/fangfang/Documents/SQA_Project/defects4j/framework/bin/defects4j"
MODEL="gemini-3.5-flash-lite"

if [[ -z "$PROJECT" || -z "$BUG" || -z "$METHOD" ]]; then
    echo "Usage:"
    echo "  $0 <project> <bug> Gemini"
    exit 2
fi

if [[ "$PROJECT" != "Lang" && "$PROJECT" != "JacksonDatabind" ]]; then
    echo "ERROR: unsupported project: $PROJECT"
    echo "Supported projects: Lang, JacksonDatabind"
    exit 2
fi

if [[ "$METHOD" != "Gemini" ]]; then
    echo "ERROR: AI generator currently supports Gemini only."
    exit 2
fi

if [[ -z "${GEMINI_API_KEY:-}" ]]; then
    echo "ERROR: GEMINI_API_KEY is not set."
    echo "Set it with:"
    echo "  export GEMINI_API_KEY='YOUR_KEY'"
    exit 2
fi

ARTIFACT_DIR="$ROOT/automation/runs/$PROJECT/Bug-$BUG/$METHOD"
BUGGY_DIR="$ROOT/workspaces/$PROJECT-$BUG-buggy"
FIXED_DIR="$ROOT/workspaces/$PROJECT-$BUG-fixed"

mkdir -p "$ARTIFACT_DIR"

echo ""
echo "============================================================"
echo "AI TEST GENERATION"
echo "============================================================"
echo "Project : $PROJECT"
echo "Bug     : $BUG"
echo "Method  : $METHOD"
echo "Model   : $MODEL"
echo "Artifact: $ARTIFACT_DIR"
echo "============================================================"

###############################################################################
# 1. Get experiment context.
###############################################################################

CONTEXT_JSON="$(
    python3 "$ROOT/automation/scripts/bug_context.py" \
        "$PROJECT" "$BUG" --json
)"

CONTEXT_RC=$?

if [[ $CONTEXT_RC -ne 0 ]]; then
    echo "WARNING: bug_context.py returned validation status $CONTEXT_RC."
    echo "WARNING: Continuing because context JSON was successfully generated."
fi

###############################################################################
# 2. Checkout buggy/fixed versions if workspaces do not already exist.
###############################################################################

if [[ ! -d "$BUGGY_DIR" ]]; then
    echo ""
    echo "CHECKOUT BUGGY"
    "$D4J" checkout -p "$PROJECT" -v "${BUG}b" -w "$BUGGY_DIR"

    if [[ $? -ne 0 ]]; then
        echo "ERROR: buggy checkout failed."
        printf '%s\n' "PENDING_ARTIFACT" > "$ARTIFACT_DIR/status"
        exit 3
    fi
fi

if [[ ! -d "$FIXED_DIR" ]]; then
    echo ""
    echo "CHECKOUT FIXED"
    "$D4J" checkout -p "$PROJECT" -v "${BUG}f" -w "$FIXED_DIR"

    if [[ $? -ne 0 ]]; then
        echo "ERROR: fixed checkout failed."
        printf '%s\n' "PENDING_ARTIFACT" > "$ARTIFACT_DIR/status"
        exit 3
    fi
fi

###############################################################################
# 3. Build AI prompt and call Gemini.
###############################################################################

export ROOT BUG PROJECT METHOD MODEL ARTIFACT_DIR BUGGY_DIR FIXED_DIR CONTEXT_JSON

python3 - <<'PY'
import json
import os
import re
import time
from pathlib import Path

from google import genai
from google.genai import types

root = Path(os.environ["ROOT"])
bug = os.environ["BUG"]
project = os.environ["PROJECT"]
method = os.environ["METHOD"]
model = os.environ["MODEL"]
artifact_dir = Path(os.environ["ARTIFACT_DIR"])
buggy_dir = Path(os.environ["BUGGY_DIR"])
fixed_dir = Path(os.environ["FIXED_DIR"])
context = json.loads(os.environ["CONTEXT_JSON"])

modified_source = context.get("modified_source", "").strip()

if not modified_source:
    print("ERROR: modified_source missing from bug context.")
    raise SystemExit(3)

source_rel = modified_source.replace(".", "/")
if not source_rel.endswith(".java"):
    source_rel += ".java"

def locate(base):
    for prefix in ("src/main/java", "src/java"):
        p = base / prefix / source_rel
        if p.is_file():
            return p

    matches = list(base.rglob(Path(source_rel).name))
    return matches[0] if matches else None

buggy_source = locate(buggy_dir)
fixed_source = locate(fixed_dir)

if buggy_source is None or fixed_source is None:
    print("ERROR: modified source could not be located.")
    print("BUGGY:", buggy_source)
    print("FIXED:", fixed_source)
    raise SystemExit(3)

def read_source(path):
    text = path.read_text(encoding="utf-8", errors="ignore")

    # Keep prompts manageable while retaining the beginning and end
    # of large production classes.
    limit = 30000
    if len(text) <= limit:
        return text

    half = limit // 2
    return (
        text[:half]
        + "\n\n[... SOURCE TRUNCATED FOR PROMPT ...]\n\n"
        + text[-half:]
    )

buggy_text = read_source(buggy_source)
fixed_text = read_source(fixed_source)

# Determine actual modified production method.
import subprocess

method_result = subprocess.run(
    [
        "python3",
        str(root / "automation/scripts/find_modified_methods.py"),
        str(buggy_source),
        str(fixed_source),
    ],
    capture_output=True,
    text=True,
)

target_method = ""

if method_result.returncode == 0:
    try:
        data = eval(method_result.stdout.strip(), {"__builtins__": {}}, {})
        methods = data.get("methods", [])
        if methods:
            target_method = methods[0]
    except Exception:
        target_method = ""

if not target_method:
    target_method = "the modified production method"

trigger_test = context.get("trigger_test", "")
bug_report = context.get("bug_report", "")
fixed_revision = context.get("fixed_revision", "")
test_framework = context.get("test_framework", "JUnit 4.12")

prompt = f"""
You are an expert in Software Quality Assurance, Java testing,
JUnit 4.12, and Defects4J.

Your task is to independently design a JUnit 4.12 test suite that
detects the real defect in ONE Defects4J bug.

============================================================
EXPERIMENT INFORMATION
============================================================

Project:
{project}

Defect:
{project}-{bug}

Bug report:
{bug_report}

Fixed revision:
{fixed_revision}

Modified production source:
{modified_source}

Actual modified production method:
{target_method}

Testing framework:
{test_framework}

Buggy workspace:
{buggy_dir}

Fixed workspace:
{fixed_dir}

The Defects4J trigger test is:
{trigger_test}

IMPORTANT:
The trigger test is ground-truth information only.
DO NOT copy the trigger test.
DO NOT reproduce the trigger test implementation.
DO NOT copy exact trigger inputs or expected values.
Design independent defect-oriented tests.

============================================================
SOURCE CODE ANALYSIS
============================================================

Analyze the defect by comparing the BUGGY and FIXED production
implementations below.

---------------- BUGGY SOURCE ----------------

{buggy_text}

---------------- FIXED SOURCE ----------------

{fixed_text}

Identify:
1. The behavior that differs.
2. The likely root cause visible from the source.
3. The specific behavior that a generated test should distinguish
   between the buggy and fixed versions.
4. Boundary cases, representative cases, and regression cases that
   are independently designed.

Do not assume that the trigger test is the only way to expose
the defect.

============================================================
TEST CASE DESIGN
============================================================

Design independent tests specifically for the defect.

Requirements:
- Focus on the modified production behavior.
- Prefer multiple complementary tests.
- Avoid duplicate semantic tests.
- Do not copy the original trigger test.
- Do not copy exact original trigger inputs.
- Use inputs that are independently derived from the source-level
  defect.
- Each test must have a clear expected behavior.
- Tests must be valid on both buggy and fixed versions.
- Tests should distinguish buggy behavior from corrected behavior
  whenever possible.

============================================================
JUNIT 4.12 TEST CODE
============================================================

Generate one complete Java test class.

Requirements:
- JUnit 4.12 syntax.
- Include package declaration.
- Include org.junit.Test.
- Use standard JUnit assertions.
- Every test method must have a unique name.
- The class must compile against the supplied Defects4J version.
- Do not modify production code.
- Do not modify developer tests.
- Do not invoke the original Defects4J trigger test.
- Do not use reflection to bypass the normal API.
- The generated class must directly test the modified behavior.

Return the complete Java class inside ONE ```java code block.

============================================================
DEFECT DETECTION STRATEGY
============================================================

Explain how each generated test is expected to behave:

BUGGY VERSION:
- expected result

FIXED VERSION:
- expected result

A test is considered defect-detecting when it fails on the buggy
version and passes on the fixed version.

============================================================
SUMMARY
============================================================

Summarize:
- root cause
- targeted behavior
- number of generated tests
- why the tests are independent from the original trigger test

============================================================
LIMITATIONS
============================================================

State any limitations or uncertainty caused by the available
source information.

FINAL OUTPUT REQUIREMENT:
The final answer MUST contain the six sections above and one
complete JUnit 4.12 Java class in a ```java code block.
"""

prompt_path = artifact_dir / "prompt.txt"
raw_path = artifact_dir / "raw_output.txt"
generated_path = artifact_dir / "generated_test.java"
generation_time_path = artifact_dir / "generation_seconds.txt"

prompt_path.write_text(prompt.strip() + "\n", encoding="utf-8")

client = genai.Client(api_key=os.environ["GEMINI_API_KEY"])

start = time.perf_counter()

try:
    response = client.models.generate_content(
        model=model,
        contents=prompt,
        config=types.GenerateContentConfig(
            temperature=0.2,
            max_output_tokens=8192,
        ),
    )
except Exception as exc:
    elapsed = time.perf_counter() - start
    generation_time_path.write_text(f"{elapsed:.6f}\n", encoding="utf-8")
    print("ERROR: Gemini API request failed.")
    print(str(exc))
    raise SystemExit(4)

elapsed = time.perf_counter() - start
generation_time_path.write_text(f"{elapsed:.6f}\n", encoding="utf-8")

raw = response.text or ""
raw_path.write_text(raw, encoding="utf-8")

if not raw.strip():
    print("ERROR: Gemini returned empty text.")
    raise SystemExit(4)

###############################################################################
# Extract the Java code block containing the generated JUnit test.
###############################################################################

blocks = re.findall(
    r"```(?:java|Java)?\s*\n(.*?)```",
    raw,
    flags=re.DOTALL,
)

candidates = []

for block in blocks:
    score = 0

    if re.search(r"\bpackage\s+[\w.]+\s*;", block):
        score += 3

    if "org.junit.Test" in block:
        score += 3

    if "@Test" in block:
        score += 3

    if "class " in block:
        score += 1

    candidates.append((score, block.strip()))

if not candidates:
    print("ERROR: no Java code block found in Gemini response.")
    raise SystemExit(5)

candidates.sort(key=lambda x: x[0], reverse=True)

score, java_code = candidates[0]

if score < 6:
    print("ERROR: extracted block does not look like a JUnit test.")
    raise SystemExit(5)

generated_path.write_text(java_code + "\n", encoding="utf-8")

print("")
print("============================================================")
print("GEMINI GENERATION COMPLETE")
print("============================================================")
print("Model          :", model)
print("Generation sec :", f"{elapsed:.6f}")
print("Prompt         :", prompt_path)
print("Raw output     :", raw_path)
print("Generated test :", generated_path)
print("============================================================")
PY

RC=$?

if [[ $RC -ne 0 ]]; then
    printf '%s\n' "PENDING_ARTIFACT" > "$ARTIFACT_DIR/status"
    exit $RC
fi

###############################################################################
# 4. Validate artifact.
###############################################################################

python3 "$ROOT/automation/scripts/check_generated_artifact.py" \
    --artifact-dir "$ARTIFACT_DIR" \
    --method "$METHOD"

CHECK_RC=$?

if [[ $CHECK_RC -ne 0 ]]; then
    echo "ERROR: generated AI artifact validation failed."
    printf '%s\n' "PENDING_ARTIFACT" > "$ARTIFACT_DIR/status"
    exit 5
fi

printf '%s\n' "GENERATED" > "$ARTIFACT_DIR/status"

echo ""
echo "============================================================"
echo "ARTIFACT READY"
echo "============================================================"
echo "$ARTIFACT_DIR"
echo "============================================================"
