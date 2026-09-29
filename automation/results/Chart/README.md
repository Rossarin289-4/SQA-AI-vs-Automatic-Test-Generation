# Chart AI Test Execution Summary

## Project Status

- Project: Chart
- Expected bugs: 26
- Recorded bugs: 2
- Status: PARTIAL

## Defect Detection Criterion

A generated test is classified as defect-detecting when the test FAILS on the buggy version and PASSES on the fixed version.

## Method Summary

| Method | Tested Bugs | Total Tests | Defect-Detecting Tests | FDR |
|---|---:|---:|---:|---:|
| ChatGPT | 2 | 14 | 7 | 50.00% |
| Gemini | 2 | 14 | 7 | 50.00% |

## Bug-Level Results

| Bug | Method | Total Tests | Defect-Detecting Tests | FDR | Status |
|---|---|---:|---:|---:|---|
| Chart-1 | ChatGPT | 2 | 2 | 100.00% | COMPLETED |
| Chart-1 | Gemini | 6 | 4 | 66.67% | COMPLETED |
| Chart-2 | ChatGPT | 12 | 5 | 41.67% | COMPLETED |
| Chart-2 | Gemini | 8 | 3 | 37.50% | COMPLETED |

## Notes

FDR is calculated within the generated test suite evaluated for each method. It does not represent the overall defect detection capability of the method beyond the tested cases.
