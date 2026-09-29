# Chart / BPSO

This directory contains the reproducible BPSO workflow for the independently
prepared Chart-1 candidate tests. An experiment is only complete when Defects4J
produces `summary.json` with `status: "verified"` for both rounds.

## Inputs

- Selector: `Code/BPSOTestSelector.java`
- Candidate metadata: `Configuration/chart-1-candidates.csv`
- Candidate tests: `Test/Chart-1/org/jfree/chart/renderer/category/junit/Chart1BPSOCandidateTest.java`
- Runner: `../../scripts/run_chart_bpso.py`

The scenario labels are a selection proxy. They are not coverage measurements.
Coverage, timings, and fault detection are recorded only from the actual
Defects4J buggy and fixed executions.

## Run in Ubuntu/WSL

Run from the repository root after `defects4j`, `java`, `javac`, and `python3`
are available on `PATH`:

```bash
python3 scripts/run_chart_bpso.py --rounds 2
```

The runner compiles the selector, checks out and compiles `Chart-1b` and
`Chart-1f`, installs the selected tests, runs each test on both versions, then
collects selected-suite coverage. It writes seeds, commands, durations, test
outcomes, coverage data, and the fault-detection decision to
`Result_Round<N>/Chart-1/summary.json`.

Round 1 uses seed `20260928`; round 2 uses `20260929`. The runner sets
`Chart-1` to `verified` in `Chart/bug-index.csv` only if both rounds finish
without an error.

Files under `target/` and `Test/Chart-1/bpso_result.json` are retained as pilot
material. They are not research evidence unless the same measurements appear in
the Defects4J logs created by this runner.
