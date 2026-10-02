from pathlib import Path
import re

ROOT = Path(__file__).resolve().parents[2]
RUNNER = ROOT / "run_all.sh"

text = RUNNER.read_text(encoding="utf-8")
original = text


def count_exact(needle):
    return text.count(needle)


def require_exact(label, needle, expected=1):
    count = count_exact(needle)

    if count != expected:
        raise RuntimeError(
            f"{label}: expected {expected} occurrence(s), found {count}"
        )


def insert_after_exact(label, needle, addition):
    global text

    require_exact(label, needle)

    text = text.replace(
        needle,
        needle + addition,
        1,
    )


def insert_before_exact(label, needle, addition):
    global text

    require_exact(label, needle)

    text = text.replace(
        needle,
        addition + needle,
        1,
    )


# ============================================================
# SAFETY: do not patch a runner that is already patched
# ============================================================

if "def checkpoint(bug, method, status):" in text:
    raise RuntimeError(
        "Runner already contains checkpoint helper. "
        "V3 patcher will not modify it."
    )

if "def resource_policy():" in text:
    raise RuntimeError(
        "Runner already contains resource helper. "
        "V3 patcher will not modify it."
    )


# ============================================================
# 1. Helper paths
# ============================================================

insert_after_exact(
    "MASTER_OUTPUT header",
    'MASTER_OUTPUT="$ROOT/automation/state/master_results.csv"\n',
    '''
CHECKPOINT_SCRIPT="$ROOT/automation/scripts/checkpoint.sh"
RESOURCE_POLICY_SCRIPT="$ROOT/automation/scripts/run_policy.sh"
BUG_COMPLETE_SCRIPT="$ROOT/automation/scripts/check_bug_complete.py"
CLEANUP_SCRIPT="$ROOT/automation/scripts/cleanup_completed_bug.py"
'''
)


# ============================================================
# 2. Export helper paths
# ============================================================

insert_after_exact(
    "MASTER_OUTPUT export",
    "export MASTER_OUTPUT\n",
    '''
export CHECKPOINT_SCRIPT
export RESOURCE_POLICY_SCRIPT
export BUG_COMPLETE_SCRIPT
export CLEANUP_SCRIPT
'''
)


# ============================================================
# 3. Python helper functions
# Insert immediately before def read_rows()
# ============================================================

helpers = '''
CHECKPOINT_SCRIPT = Path(os.environ["CHECKPOINT_SCRIPT"])
RESOURCE_POLICY_SCRIPT = Path(os.environ["RESOURCE_POLICY_SCRIPT"])
BUG_COMPLETE_SCRIPT = Path(os.environ["BUG_COMPLETE_SCRIPT"])
CLEANUP_SCRIPT = Path(os.environ["CLEANUP_SCRIPT"])


def checkpoint(bug, method, status):
    proc = subprocess.run(
        [
            "zsh",
            str(CHECKPOINT_SCRIPT),
            DATASET,
            str(bug),
            method,
            status,
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    if proc.stdout:
        print(proc.stdout.rstrip())

    return proc.returncode == 0


def resource_policy():
    proc = subprocess.run(
        [
            "zsh",
            str(RESOURCE_POLICY_SCRIPT),
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    if proc.stdout:
        print(proc.stdout.rstrip())

    return proc.returncode == 0


def bug_complete(bug):
    proc = subprocess.run(
        [
            sys.executable,
            str(BUG_COMPLETE_SCRIPT),
            "--dataset",
            DATASET,
            "--bug",
            str(bug),
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    if proc.stdout:
        print(proc.stdout.rstrip())

    return proc.returncode == 0


def cleanup_completed_bug(bug):
    proc = subprocess.run(
        [
            sys.executable,
            str(CLEANUP_SCRIPT),
            "--dataset",
            DATASET,
            "--bug",
            str(bug),
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    if proc.stdout:
        print(proc.stdout.rstrip())

    return proc.returncode == 0


'''

insert_before_exact(
    "def read_rows",
    "def read_rows():\n",
    helpers
)


# ============================================================
# 4. DONE -> checkpoint DONE
# ============================================================

insert_after_exact(
    "DONE condition",
    '    if current_status == "DONE":\n',
    '        checkpoint(bug, method, "DONE")\n'
)


# ============================================================
# 5. Pending artifact -> checkpoint pending status
# Put checkpoint immediately before PENDING print.
# ============================================================

pending_print = '            f"[PENDING] {DATASET}-{bug} {method}: {new_status}"\n'

require_exact(
    "PENDING print",
    pending_print
)

text = text.replace(
    pending_print,
    '            checkpoint(bug, method, new_status)\n\n' + pending_print,
    1,
)


# ============================================================
# 6. Invalid artifact -> checkpoint FAILED
# ============================================================

invalid_print = (
    '            f"[FAILED] {DATASET}-{bug} {method}: invalid artifact"\n'
)

require_exact(
    "invalid artifact print",
    invalid_print
)

text = text.replace(
    invalid_print,
    '            checkpoint(bug, method, "FAILED")\n\n' + invalid_print,
    1,
)


# ============================================================
# 7. Package/class failure -> checkpoint FAILED
# ============================================================

package_print = (
    '            f"[FAILED] {DATASET}-{bug} {method}: cannot determine package/class"\n'
)

require_exact(
    "package/class failure print",
    package_print
)

text = text.replace(
    package_print,
    '            checkpoint(bug, method, "FAILED")\n\n' + package_print,
    1,
)


# ============================================================
# 8. EVALUATING -> RUNNING checkpoint
# Find the first cmd = [ after EVALUATING.
# ============================================================

evaluation_anchor = '''    (artifact_dir / "status").write_text(
        "EVALUATING\\n",
        encoding="utf-8"
    )

'''

require_exact(
    "EVALUATING block",
    evaluation_anchor
)

text = text.replace(
    evaluation_anchor,
    evaluation_anchor + '    checkpoint(bug, method, "RUNNING")\n\n',
    1,
)


# ============================================================
# 9. Final status -> checkpoint
# ============================================================

final_print = '        f"[{final_status}] {DATASET}-{bug} {method}"\n'

require_exact(
    "final status print",
    final_print
)

text = text.replace(
    final_print,
    '        checkpoint(bug, method, final_status)\n\n' + final_print,
    1,
)


# ============================================================
# 10. Resource policy before bug loop
# ============================================================

resource_anchor = '''print(
    f"Active bugs: {len(active_rows)}"
)

'''

require_exact(
    "Active bugs block",
    resource_anchor
)

resource_block = '''print(
    f"Active bugs: {len(active_rows)}"
)

print()
print("============================================================")
print("RESOURCE POLICY CHECK")
print("============================================================")

if not resource_policy():
    raise RuntimeError(
        "Resource policy blocked the experiment."
    )

'''

text = text.replace(
    resource_anchor,
    resource_block,
    1,
)


# ============================================================
# 11. Completion check BEFORE workspace preparation
# ============================================================

preparation_anchor = '''    # Make sure both workspaces exist.
'''

require_exact(
    "workspace preparation comment",
    preparation_anchor
)

completion_before = '''    print()
    print("[COMPLETION CHECK] Before workspace preparation")

    if bug_complete(bug):
        print(
            f"[COMPLETE] {DATASET}-{bug}: all four methods are DONE."
        )
        print("[CLEANUP] Running safe completed-bug cleanup.")
        cleanup_completed_bug(bug)
        continue

'''

text = text.replace(
    preparation_anchor,
    completion_before + preparation_anchor,
    1,
)


# ============================================================
# 12. Completion check AFTER each bug's method loop
#
# The existing runner ends the outer bug loop immediately before:
#
# print()
# print("====")
# print("GENERATION / EVALUATION LOOP FINISHED")
#
# We add a 4-space-indented block before the unindented
# loop-finish marker, making it part of the bug loop.
# ============================================================

loop_finish = '''print()
print("============================================================")
print("GENERATION / EVALUATION LOOP FINISHED")
'''

require_exact(
    "generation loop finish marker",
    loop_finish
)

after_methods = '''    print()
    print("[COMPLETION CHECK] After method loop")

    if bug_complete(bug):
        print(
            f"[COMPLETE] {DATASET}-{bug}: all four methods are DONE."
        )
        print("[CLEANUP] Running safe completed-bug cleanup.")
        cleanup_completed_bug(bug)
    else:
        print(
            f"[RESUME] {DATASET}-{bug}: incomplete. "
            "Results and workspaces are retained."
        )

'''

text = text.replace(
    loop_finish,
    after_methods + loop_finish,
    1,
)


# ============================================================
# Final safety check
# ============================================================

required_markers = [
    "CHECKPOINT_SCRIPT=",
    "RESOURCE_POLICY_SCRIPT=",
    "BUG_COMPLETE_SCRIPT=",
    "CLEANUP_SCRIPT=",
    "def checkpoint(bug, method, status):",
    "def resource_policy():",
    "def bug_complete(bug):",
    "def cleanup_completed_bug(bug):",
    'checkpoint(bug, method, "DONE")',
    'checkpoint(bug, method, new_status)',
    'checkpoint(bug, method, "FAILED")',
    'checkpoint(bug, method, "RUNNING")',
    "checkpoint(bug, method, final_status)",
    "if not resource_policy():",
    "[COMPLETION CHECK] Before workspace preparation",
    "[COMPLETION CHECK] After method loop",
    "cleanup_completed_bug(bug)",
]

missing = [
    marker
    for marker in required_markers
    if marker not in text
]

if missing:
    raise RuntimeError(
        "V3 safety validation failed. Missing markers:\n"
        + "\n".join(missing)
    )


if text == original:
    raise RuntimeError(
        "V3 produced no runner changes."
    )


# ============================================================
# Only now write the runner.
# ============================================================

RUNNER.write_text(
    text,
    encoding="utf-8"
)

print("============================================================")
print("RUNNER V3 PATCH SUCCESS")
print("============================================================")
print(f"Runner: {RUNNER}")
print(f"Old size: {len(original)} bytes")
print(f"New size: {len(text)} bytes")
print()
print("All required integration markers were inserted.")
