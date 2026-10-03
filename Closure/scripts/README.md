# Closure runner

1. `bash scripts/prepare_closure_1_16.sh` checks out and compiles Closure-1..16 buggy/fixed.
2. `bash scripts/verify_triggers.sh` verifies only the supplied official failing-test targets.

Important: Closure in Defects4J is an historical project. Do not add a new root `pom.xml` merely to silence an IDE; that can change the experiment build. Use `defects4j compile/test` as the compile gate. Candidate expansion into new test methods must be compiled against each real checkout before results are collected.
