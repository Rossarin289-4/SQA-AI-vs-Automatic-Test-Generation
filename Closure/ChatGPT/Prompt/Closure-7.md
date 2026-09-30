# Prompt: Closure-7

Project: Defects4J Closure, Bug ID 7. Bug report reference: https://storage.googleapis.com/google-code-archive/v2/code.google.com/closure-compiler/issues/issue-841.json (reference only; its content was not supplied).

Official trigger methods available as orientation, not test cases to copy:
- `com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest::testGoogIsFunction2`
- `com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest::testTypeof3`

Create a **new** JUnit 3 `TestCase` class `com.google.javascript.jscomp.Closure7ChatGPTTest` with multiple independent test methods targeting the changed behavior of Closure-7. First inspect the actual buggy/fixed source and the original test harness in both Defects4J checkouts. Explain the input, expected output, and rationale of each new test. Use APIs that exist in this historical revision. Do not call, inherit, wrap, or rename an existing test method. Do not use the official trigger's expected result as an invented oracle.

Compile the class in both checkouts with `defects4j compile`, then run each method with `defects4j test -t ...::testXX`. Record observed FAIL/PASS, time, and coverage only after execution. If source or oracle is unavailable, say so instead of making up test code/results.
