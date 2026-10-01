# Time (Joda-Time) Defects4J Benchmark

## 1. Overview

This directory contains the testing benchmark for the Joda-Time project from Defects4J.

The benchmark evaluates four test-generation approaches:

- ChatGPT
- Gemini
- Simulated Annealing (SA)
- Binary Particle Swarm Optimization (BPSO)

A total of 26 Defects4J Time bugs were evaluated:

- Time-1 to Time-20
- Time-22 to Time-27

Time-21 is not included in the evaluated bug set.

## 2. Objective

The objective is to compare AI-assisted and search-based test-generation approaches for detecting real defects in Defects4J Time.

A generated test is considered to detect a bug when:

- the test FAILS on the buggy version (b), and
- the same test PASSES on the fixed version (f).

Result categories:

| Result | Definition |
|---|---|
| DETECTED | Buggy version FAIL + Fixed version PASS |
| NOT_DETECTED | The test does not distinguish buggy and fixed versions |
| ERROR | Test compilation or execution error prevents evaluation |

## 3. Directory Structure

```text
Time/
├── BPSO/
├── ChatGPT/
├── Gemini/
├── SA/
├── README.md
└── bug-index.csv
4. Experimental Results
Approach	Bugs Evaluated	Detected	Not Detected	Error	FDR
ChatGPT	26	4	16	6	15.38%
Gemini	26	12	14	0	46.15%
SA	26	2	24	0	7.69%
BPSO	26	10	16	0	38.46%

FDR (Fault Detection Rate):

FDR = Number of detected bugs / Number of evaluated bugs × 100

5. ChatGPT

Final results:

DETECTED: 4
NOT_DETECTED: 16
ERROR: 6
FDR: 15.38%

Detected bugs:

Time-1
Time-2
Time-13
Time-17

ERROR cases:

Time-3
Time-6
Time-12
Time-14
Time-18
Time-20

Some ERROR cases were caused by compilation problems from existing old test files in the Defects4J checkout. Only offending old test files were removed; production source code and generated tests were not modified.

6. Gemini

Final results:

DETECTED: 12
NOT_DETECTED: 14
ERROR: 0
FDR: 46.15%

Detected bugs:

Time-1
Time-2
Time-8
Time-10
Time-12
Time-13
Time-15
Time-16
Time-17
Time-18
Time-20
Time-25

The complete per-bug classification is stored in:

Gemini/Result/gemini_results.csv

7. Simulated Annealing (SA)

Final Round 1 results:

Bugs evaluated: 26
Detected bugs: 2
Not detected: 24
Errors: 0
FDR: 7.69%

Detected bugs:

Time-3
Time-10

Aggregate coverage recorded for the SA experiment:

Buggy:

Line coverage: 1374 / 9128 = 15.05%
Condition coverage: 402 / 4369 = 9.20%

Fixed:

Line coverage: 1352 / 8940 = 15.12%
Condition coverage: 399 / 4359 = 9.15%
8. Binary Particle Swarm Optimization (BPSO)

BPSO was evaluated using two rounds with different random seeds.

Round 1
Bugs evaluated: 26
Selected tests: 78
Detecting tests: 15
Errors: 0
Unique detected bugs: 10
Bug detection rate: 38.46%

Detected bugs:

Time-3
Time-6
Time-8
Time-9
Time-12
Time-13
Time-15
Time-16
Time-26
Time-27
Round 2
Bugs evaluated: 26
Selected tests: 78
Detecting tests: 13
Errors: 0
Unique detected bugs: 8
Bug detection rate: 30.77%

Detected bugs:

Time-3
Time-6
Time-12
Time-13
Time-15
Time-16
Time-26
Time-27

For the overall bug-index.csv, a bug is marked DETECTED if it was detected in at least one BPSO round.

Therefore, the union of Round 1 and Round 2 contains 10 detected bugs.

Note: BPSO selected and evaluated tests individually rather than computing combined-suite coverage with a single -s execution.

9. Bug Index

bug-index.csv provides the per-bug classification for all four approaches.

Columns:

bug_id
report_id
report_url
baseline
chatgpt
gemini
sa
bpso

The baseline column is retained for benchmark metadata and has not been assigned a result in this experiment.

10. Reproducibility

For each generated test:

Run the test on the buggy version.
Record PASS, FAIL, or ERROR.
If the buggy test can be evaluated, run the same test on the fixed version.
Classify the result using the DETECTED / NOT_DETECTED / ERROR criteria.
Do not modify production code to make a generated test pass.

Generated prompts and test code are stored under the corresponding approach directories.

11. Limitations
The benchmark contains 26 Time bugs and excludes Time-21.
ChatGPT and Gemini use generated tests, while SA and BPSO use search-based test-selection procedures.
BPSO results contain two independent rounds and are reported using the union of detected bugs for the overall bug-level result.
Coverage measurement procedures are not identical across all approaches, so coverage values should be interpreted together with the experimental methodology.
The baseline column in bug-index.csv has not been evaluated in this benchmark.
12. Result Summary

ChatGPT : 4 / 26 detected
Gemini : 12 / 26 detected
SA : 2 / 26 detected
BPSO : 10 / 26 detected

All per-bug classifications are recorded in:

Time/bug-index.csv
