SQA_Project_2026 - Automation Foundation
=========================================

Project:
Apache Commons Lang

Defects4J:
Lang-3

Methods:
ChatGPT
Gemini
SA
BPSO

Execution Principle:
All four generation methods must use the same evaluator.

Generation:
The generation method is the only component that differs.

Evaluation:
1. Validate generated test source.
2. Compile generated tests.
3. Execute generated tests on BUGGY.
4. Execute generated tests on FIXED.
5. Collect line coverage.
6. Collect branch coverage.
7. Calculate evaluated tests.
8. Calculate detected tests.
9. Calculate FDR.
10. Update master_results.csv.

FDR:
FDR = detected_tests / evaluated_tests * 100

evaluated_tests:
A generated JUnit test method that:
- is valid JUnit 4.12 test code
- compiles successfully
- executes successfully on BUGGY
- executes successfully on FIXED

detected_tests:
A generated test method where:
- BUGGY = FAIL
- FIXED = PASS

Runtime ERROR:
- not FAIL
- not PASS
- excluded from evaluated_tests

Compile failure:
- excluded from evaluated_tests

Original Defects4J trigger test:
- Ground Truth evidence only
- never counted as a generated test

Coverage:
BUGGY and FIXED are measured separately.
The same Defects4J coverage tool is used for all methods.

Traceability:
master_results.csv
  -> experiment.json
  -> generated_test.java
  -> prompt.txt
  -> raw_output.txt
  -> execution.txt
  -> coverage.csv
  -> projects/Lang/Bug-3/diff.txt

State:
PENDING
GENERATING
COMPILED
EXECUTING_BUGGY
EXECUTING_FIXED
EVALUATING
DONE

Failure:
A recoverable experiment may become FAILED.

Important:
- Never modify the original Ground Truth files.
- Never modify the Defects4J source manually during evaluation.
- Never count the original trigger test as generated.
- Never use different coverage tools between methods.
- Never stop the entire dataset because one experiment fails.
