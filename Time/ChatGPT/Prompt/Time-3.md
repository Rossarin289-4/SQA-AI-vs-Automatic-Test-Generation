You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-3
Buggy version: Time-3b
Fixed version: Time-3f

Your task is to analyze the following production-code change and generate a new JUnit test that can expose the behavioral difference between the buggy and fixed versions.

Requirements:
1. Generate a complete JUnit 4 test class compatible with the Joda-Time project and Defects4J.
2. Do not modify any production code.
3. The test must be based only on the provided source-code change and your analysis.
4. Do NOT use Defects4J's official trigger test or any information about the official trigger test.
5. Do NOT use or imitate SA, BPSO, or other automatic test-generation algorithms.
6. The test must contain meaningful assertions about the expected behavior.
7. Do not modify the generated test after seeing whether it detects the bug.
8. The test should be designed to expose the behavioral difference between Time-3b and Time-3f.

Detection criterion:
- Time-3b FAIL + Time-3f PASS = DETECTED
- Time-3b PASS + Time-3f PASS = NOT_DETECTED
- Time-3b FAIL + Time-3f FAIL = NOT_DETECTED
- Compilation/execution error = ERROR

Source-code change:

MutableDateTime.java:

In the buggy version, the following methods no longer guard zero-valued additions with:

    if (amount != 0)

The affected methods include:

    add(DateTimeFieldType type, int amount)
    addYears(int years)
    addWeekyears(int weekyears)
    addMonths(int months)
    addWeeks(int weeks)
    addDays(int days)
    addHours(int hours)
    addMinutes(int minutes)
    addSeconds(int seconds)
    addMillis(int millis)

The fixed version skips the field update when the amount is zero.

The buggy version instead calls the corresponding DateTimeField.add(...) operation even when the amount is zero.

Analyze carefully what observable behavior can differ when zero is supplied to these MutableDateTime addition methods.

Then provide:

1. A brief explanation of the behavior affected by the bug.
2. A complete JUnit 4 test class.
3. The test method name clearly identified.

The test must verify observable behavior through public APIs and meaningful assertions.

Do not provide a test based on the official Defects4J trigger test.
