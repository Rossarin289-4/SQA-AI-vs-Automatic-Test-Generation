# Chart-1 BPSO pilot

`chart-1-candidates.csv` contains **one original Defects4J trigger test** solely to check the selection pipeline. It is not a BPSO-generated test and cannot support a comparative outcome. Add independently prepared JUnit candidate methods and labels before the research run. The `labels` column is a semicolon-separated surrogate for selecting diverse test scenarios; it is not measured coverage.

Run from the repository root:

```bash
python3 Chart/BPSO/Code/select_tests.py --candidates Chart/BPSO/Configuration/chart-1-candidates.csv --output Chart/BPSO/Result_Round1/Chart-1/selection.json
```

Repeat with `--seed 20260929` and `--output Chart/BPSO/Result_Round2/Chart-1/selection.json`. Record actual Defects4J buggy/fixed executions separately; never use this pilot selection as a fault detection or coverage result.
