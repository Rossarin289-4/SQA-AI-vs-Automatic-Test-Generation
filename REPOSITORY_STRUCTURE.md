# Repository Structure

This repository uses two compatible layers.

## Team-compatible layer

    algorithms/
    ai-tests/
    results/
    projects/

These directories follow the repository organization used by the
team repository.

## Experiment automation layer

    automation/
        datasets/
        scripts/
        runs/
        state/

The automation layer is the canonical source of experiment metadata,
generated artifacts, execution results, checkpoints, and aggregate
results.

## Important rule

Do not delete or move the automation directory when integrating
this repository with the team repository.

The compatibility layer is intentionally separated from the
automation layer so that repository integration does not invalidate
previous experiment results.

## Methods

    ChatGPT
    Gemini
    Simulated Annealing (SA)
    Binary Particle Swarm Optimization (BPSO)

## Dataset

    Apache Commons Lang / Defects4J

The current automation supports multiple Lang defects and is designed
to continue processing remaining defects without rerunning completed
experiments.

## TestBench layer (added 2026-10-03)

    testbench/                 the TestBench application (Java/Spring Boot): SA and BPSO written from scratch,
                               the AI prompt pipeline, the Defects4J evaluation (buggy/fixed, coverage,
                               fix_test_suite repair, patch-line diagnostic) and the web UI
    testbench/prompts/         Master Prompt versions (v1-v14), Repair_Prompt.md, CHANGELOG.md
    testbench/docs/            CHECKLIST.md (assignment items), COMPATIBILITY.md (algorithm revision notes)
    testbench/scripts/export_team_layout.py
                               writes TestBench runs into <Project>/<Method>/{Code,Configuration,Result,Test,TestCode}
                               and master_results.csv (rows of TestBench methods only; the team's rows are kept)

Methods produced by TestBench have their own folder names so that nothing of the team's own results is overwritten:
TestBench-SA, TestBench-BPSO (algorithms written in testbench/src) and TestBench-<AI display name>. Rows in master_results.csv from TestBench have the same
columns as the team's rows; FDR = detected tests / evaluated tests x 100 on the repaired suite, coverage on
buggy and fixed from `defects4j coverage` over classes.modified.

The automation directory is untouched, as required above.
