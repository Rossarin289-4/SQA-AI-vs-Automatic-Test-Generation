# Chart-1 BPSO candidates

`chart-1-candidates.csv` maps independently prepared test methods to scenario
labels. The labels are a surrogate objective that lets BPSO prefer a diverse,
small selection; they must never be reported as coverage.

The IDs in the CSV must exactly match the public `test*` methods in
`Test/Chart-1/org/jfree/chart/renderer/category/junit/Chart1BPSOCandidateTest.java`.
The runner validates that relationship before it starts.

Run the two reproducible rounds from the repository root:

```bash
python3 scripts/run_chart_bpso.py --rounds 2
```

The runner stores the actual Defects4J buggy/fixed execution, coverage, and
timing logs in `Result_Round<N>/Chart-1/`.
