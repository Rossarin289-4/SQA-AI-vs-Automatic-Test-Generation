#!/usr/bin/env python3

from pathlib import Path


ROOT = Path(
    "/Users/fangfang/Documents/SQA_Project_2026"
).resolve()

RUNNER = ROOT / "run_all.sh"


def replace_exact(text, old, new, label):
    count = text.count(old)

    if count != 1:
        raise RuntimeError(
            f"{label}: expected exactly 1 match, found {count}"
        )

    return text.replace(old, new, 1)


def main():
    if not RUNNER.is_file():
        print(f"[STOP] Runner not found: {RUNNER}")
        return 1

    text = RUNNER.read_text(
        encoding="utf-8"
    )

    original = text

    # ---------------------------------------------------------
    # 1. Extend Python helper section
    # ---------------------------------------------------------

    old = '''def status_file(artifact_dir):
    path = artifact_dir / "status"

    if not path.is_file():
        return None

    return path.read_text(
        encoding="utf-8"
    ).strip()


def run_method(row, method):
'''

    new = '''def status_file(artifact_dir):
    path = artifact_dir / "status"

    if not path.is_file():
        return None

    return path.read_text(
        encoding="utf-8"
    ).strip()


def checkpoint(bug, method, status):
    script = (
        ROOT
        / "automation/scripts/checkpoint.sh"
    )

    result = subprocess.run(
        [
            "zsh",
            str(script),
            DATASET,
            str(bug),
            method,
            status,
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    print(result.stdout)

    if result.returncode != 0:
        print(
            f"[WARNING] checkpoint failed: "
            f"{DATASET}-{bug} {method} -> {status}"
        )

    return result.returncode == 0


def resource_policy():
    script = (
        ROOT
        / "automation/scripts/run_policy.sh"
    )

    result = subprocess.run(
        [
            "zsh",
            str(script),
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    print(result.stdout)

    return result.returncode == 0


def bug_complete(bug):
    script = (
        ROOT
        / "automation/scripts/check_bug_complete.py"
    )

    result = subprocess.run(
        [
            sys.executable,
            str(script),
            "--dataset",
            DATASET,
            "--bug",
            str(bug),
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    print(result.stdout)

    return result.returncode == 0


def cleanup_completed_bug(bug):
    script = (
        ROOT
        / "automation/scripts/cleanup_completed_bug.py"
    )

    result = subprocess.run(
        [
            sys.executable,
            str(script),
            "--dataset",
            DATASET,
            "--bug",
            str(bug),
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    print(result.stdout)

    return result.returncode == 0


def run_method(row, method):
'''

    text = replace_exact(
        text,
        old,
        new,
        "helper section",
    )

    # ---------------------------------------------------------
    # 2. DONE checkpoint
    # ---------------------------------------------------------

    old = '''    if current_status == "DONE":
        print(
            f"[SKIP] {DATASET}-{bug} {method}: DONE"
        )
        return
'''

    new = '''    if current_status == "DONE":
        checkpoint(
            bug,
            method,
            "DONE",
        )

        print(
            f"[SKIP] {DATASET}-{bug} {method}: DONE"
        )
        return "DONE"
'''

    text = replace_exact(
        text,
        old,
        new,
        "DONE handling",
    )

    # ---------------------------------------------------------
    # 3. Missing artifact checkpoint
    # ---------------------------------------------------------

    old = '''        (artifact_dir / "status").write_text(
            new_status + "\\n",
            encoding="utf-8"
        )

        print(
            f"[PENDING] {DATASET}-{bug} {method}: {new_status}"
        )

        return
'''

    new = '''        (artifact_dir / "status").write_text(
            new_status + "\\n",
            encoding="utf-8"
        )

        checkpoint(
            bug,
            method,
            new_status,
        )

        print(
            f"[PENDING] {DATASET}-{bug} {method}: {new_status}"
        )

        return new_status
'''

    text = replace_exact(
        text,
        old,
        new,
        "missing artifact handling",
    )

    # ---------------------------------------------------------
    # 4. Artifact validation failure
    # ---------------------------------------------------------

    old = '''        if check.returncode != 0:
            (artifact_dir / "status").write_text(
                "FAILED\\n",
                encoding="utf-8"
            )

            print(
                f"[FAILED] {DATASET}-{bug} {method}: invalid artifact"
            )

            return
'''

    new = '''        if check.returncode != 0:
            (artifact_dir / "status").write_text(
                "FAILED\\n",
                encoding="utf-8"
            )

            checkpoint(
                bug,
                method,
                "FAILED",
            )

            print(
                f"[FAILED] {DATASET}-{bug} {method}: invalid artifact"
            )

            return "FAILED"
'''

    text = replace_exact(
        text,
        old,
        new,
        "artifact validation failure",
    )

    # ---------------------------------------------------------
    # 5. Package/class failure
    # ---------------------------------------------------------

    old = '''        if not package_match or not class_match:
            (artifact_dir / "status").write_text(
                "FAILED\\n",
                encoding="utf-8"
            )

            print(
                f"[FAILED] {DATASET}-{bug} {method}: cannot determine package/class"
            )

            return
'''

    new = '''        if not package_match or not class_match:
            (artifact_dir / "status").write_text(
                "FAILED\\n",
                encoding="utf-8"
            )

            checkpoint(
                bug,
                method,
                "FAILED",
            )

            print(
                f"[FAILED] {DATASET}-{bug} {method}: cannot determine package/class"
            )

            return "FAILED"
'''

    text = replace_exact(
        text,
        old,
        new,
        "package/class failure",
    )

    # ---------------------------------------------------------
    # 6. Evaluation starts -> RUNNING
    # ---------------------------------------------------------

    old = '''    (artifact_dir / "status").write_text(
        "EVALUATING\\n",
        encoding="utf-8"
    )

    cmd = [
'''

    new = '''    (artifact_dir / "status").write_text(
        "EVALUATING\\n",
        encoding="utf-8"
    )

    checkpoint(
        bug,
        method,
        "RUNNING",
    )

    cmd = [
'''

    text = replace_exact(
        text,
        old,
        new,
        "evaluation running checkpoint",
    )

    # ---------------------------------------------------------
    # 7. Evaluation final status
    # ---------------------------------------------------------

    old = '''    (
        artifact_dir / "status"
    ).write_text(
        final_status + "\\n",
        encoding="utf-8"
    )

    print(
        f"[{final_status}] {DATASET}-{bug} {method}"
    )
'''

    new = '''    (
        artifact_dir / "status"
    ).write_text(
        final_status + "\\n",
        encoding="utf-8"
    )

    checkpoint(
        bug,
        method,
        final_status,
    )

    print(
        f"[{final_status}] {DATASET}-{bug} {method}"
    )

    return final_status
'''

    text = replace_exact(
        text,
        old,
        new,
        "evaluation final status",
    )

    # ---------------------------------------------------------
    # 8. Add resource guard before each bug
    # ---------------------------------------------------------

    old = '''for index, row in enumerate(active_rows, 1):
    bug = row["bug_id"]

    print()
'''

    new = '''for index, row in enumerate(active_rows, 1):
    bug = row["bug_id"]

    print()
    print(
        f"[RESOURCE CHECK] Before {DATASET}-{bug}"
    )

    if not resource_policy():
        print()
        print(
            f"[STOP] Resource policy failed before "
            f"{DATASET}-{bug}."
        )
        print(
            "[STOP] Current run will pause safely."
        )
        break

    print()
'''

    text = replace_exact(
        text,
        old,
        new,
        "per-bug resource guard",
    )

    # ---------------------------------------------------------
    # 9. Add completed bug check before workspace preparation
    # ---------------------------------------------------------

    old = '''    # Make sure both workspaces exist.
    prepare = (
        ROOT
        / "automation/scripts/prepare_bug_workspace.sh"
    )
'''

    new = '''    # ------------------------------------------------------
    # Resume / completed bug check
    # ------------------------------------------------------

    if bug_complete(bug):
        print()
        print(
            f"[COMPLETE] {DATASET}-{bug} already has "
            "all four methods DONE."
        )

        cleanup_completed_bug(bug)

        continue

    # Make sure both workspaces exist.
    prepare = (
        ROOT
        / "automation/scripts/prepare_bug_workspace.sh"
    )
'''

    text = replace_exact(
        text,
        old,
        new,
        "pre-workspace completion check",
    )

    # ---------------------------------------------------------
    # 10. Workspace preparation failure checkpoint
    # ---------------------------------------------------------

    old = '''        if prep.returncode != 0:
            print(
                f"[FAILED] workspace preparation for {DATASET}-{bug}"
            )

            continue
'''

    new = '''        if prep.returncode != 0:
            print(
                f"[FAILED] workspace preparation for {DATASET}-{bug}"
            )

            for method in METHODS:
                artifact_dir = (
                    RESULT_ROOT
                    / f"Bug-{bug}"
                    / method
                )

                artifact_dir.mkdir(
                    parents=True,
                    exist_ok=True
                )

                (artifact_dir / "status").write_text(
                    "FAILED_WORKSPACE_PREP\\n",
                    encoding="utf-8"
                )

                checkpoint(
                    bug,
                    method,
                    "FAILED_WORKSPACE_PREP",
                )

            continue
'''

    text = replace_exact(
        text,
        old,
        new,
        "workspace preparation failure",
    )

    # ---------------------------------------------------------
    # 11. Exception checkpoint
    # ---------------------------------------------------------

    old = '''            (artifact_dir / "error.txt").write_text(
                repr(exc) + "\\n",
                encoding="utf-8"
            )

            print(
                f"[FAILED] {DATASET}-{bug} {method}: {exc}"
            )
'''

    new = '''            (artifact_dir / "error.txt").write_text(
                repr(exc) + "\\n",
                encoding="utf-8"
            )

            checkpoint(
                bug,
                method,
                "FAILED",
            )

            print(
                f"[FAILED] {DATASET}-{bug} {method}: {exc}"
            )
'''

    text = replace_exact(
        text,
        old,
        new,
        "exception checkpoint",
    )

    # ---------------------------------------------------------
    # 12. Add completion + cleanup after method loop
    # ---------------------------------------------------------

    old = '''            print(
                f"[FAILED] {DATASET}-{bug} {method}: {exc}"
            )

print()
print("============================================================")
'''

    new = '''            print(
                f"[FAILED] {DATASET}-{bug} {method}: {exc}"
            )

    print()
    print(
        f"[COMPLETION CHECK] {DATASET}-{bug}"
    )

    if bug_complete(bug):
        print(
            f"[COMPLETE] {DATASET}-{bug} "
            "all four methods are DONE."
        )

        cleanup_completed_bug(bug)
    else:
        print(
            f"[PENDING] {DATASET}-{bug} "
            "is not complete; workspace retained."
        )

print()
print("============================================================")
'''

    text = replace_exact(
        text,
        old,
        new,
        "post-method completion cleanup",
    )

    # ---------------------------------------------------------
    # Safety verification
    # ---------------------------------------------------------

    if text == original:
        raise RuntimeError(
            "Patch produced no changes."
        )

    RUNNER.write_text(
        text,
        encoding="utf-8"
    )

    print("[PASS] run_all.sh patched.")
    print()
    print("Integrated:")
    print("  - resource policy before every bug")
    print("  - checkpoint RUNNING")
    print("  - checkpoint DONE")
    print("  - checkpoint FAILED")
    print("  - resume by skipping DONE")
    print("  - completion check before workspace preparation")
    print("  - completion check after method loop")
    print("  - safe cleanup only for complete bugs")
    print()
    print(f"Runner: {RUNNER}")

    return 0


if __name__ == "__main__":
    main()
