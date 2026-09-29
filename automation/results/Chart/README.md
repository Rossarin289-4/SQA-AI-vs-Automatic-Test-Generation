# Chart AI Test Execution Summary

## Project Status

- Project: Chart
- Expected bugs: 26
- Recorded bugs: 1
- Status: PARTIAL

## Defect Detection Criterion

A generated test is classified as defect-detecting when the test FAILS on the buggy version and PASSES on the fixed version.

## Method Summary

| Method | Tested Bugs | Total Tests | Defect-Detecting Tests | FDR |
|---|---:|---:|---:|---:|
| ChatGPT | 1 | 2 | 2 | 100.00% |
| Gemini | 1 | 6 | 4 | 66.67% |

## Bug-Level Results

| Bug | Method | Total Tests | Defect-Detecting Tests | FDR | Status |
|---|---|---:|---:|---:|---|
| Chart-1 | ChatGPT | 2 | 2 | 100.00% | COMPLETED |
| Chart-1 | Gemini | 6 | 4 | 66.67% | COMPLETED |

## Notes

FDR is calculated within the generated test suite evaluated for each method. It does not represent the overall defect detection capability of the method beyond the tested cases.
