You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-4
Buggy version: Time-4b
Fixed version: Time-4f

Your task is to analyze the following production-code change and generate a new JUnit test that can expose the behavioral difference between the buggy and fixed versions.

Requirements:
1. Generate a complete JUnit 4 test class compatible with the Joda-Time project and Defects4J.
2. Do not modify any production code.
3. The test must be based only on the provided source-code change and your analysis.
4. Do NOT use Defects4J's official trigger test or any information about the official trigger test.
5. Do NOT use or imitate SA, BPSO, or other automatic test-generation algorithms.
6. The test must contain meaningful assertions about the expected behavior.
7. Do not modify the generated test after seeing whether it detects the bug.
8. The test should be designed to expose the behavioral difference between Time-4b and Time-4f.

Detection criterion:
- Time-4b FAIL + Time-4f PASS = DETECTED
- Time-4b PASS + Time-4f PASS = NOT_DETECTED
- Time-4b FAIL + Time-4f FAIL = NOT_DETECTED
- Compilation/execution error = ERROR

Source-code change:

Partial.java:

In the buggy version, the implementation of the method:

    with(int index, int value)

constructs the new Partial using:

    new Partial(newTypes, newValues, iChronology)

The fixed version changes this constructor call to:

    new Partial(iChronology, newTypes, newValues)

Analyze carefully why this constructor-order difference matters.

The generated test should exercise the public Partial.with(int index, int value) API and verify the expected behavior of the resulting Partial.

The test should expose a behavioral difference caused by using the wrong constructor argument order in the buggy version.

Then provide:

1. A brief explanation of the behavior affected by the bug.
2. A complete JUnit 4 test class.
3. The test method name clearly identified.

Do not provide a test based on the official Defects4J trigger test.
