You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-5
Buggy version: Time-5b
Fixed version: Time-5f

Your task is to analyze the following production-code change and generate a new JUnit test that can expose the behavioral difference between the buggy and fixed versions.

Requirements:
1. Generate a complete JUnit 4 test class compatible with the Joda-Time project and Defects4J.
2. Do not modify any production code.
3. The test must be based only on the provided source-code change and your analysis.
4. Do NOT use Defects4J's official trigger test or any information about the official trigger test.
5. Do NOT use or imitate SA, BPSO, or other automatic test-generation algorithms.
6. The test must contain meaningful assertions about the expected behavior.
7. Do not modify the generated test after seeing whether it detects the bug.
8. The test should be designed to expose the behavioral difference between Time-5b and Time-5f.

Detection criterion:
- Time-5b FAIL + Time-5f PASS = DETECTED
- Time-5b PASS + Time-5f PASS = NOT_DETECTED
- Time-5b FAIL + Time-5f FAIL = NOT_DETECTED
- Compilation/execution error = ERROR

Source-code change:

File: Period.java
Method: normalizedStandard()

The buggy version changes the handling of years and months.

In the fixed version, the method first calculates the total number of months represented by the years and months:

    long totalMonths = years * 12L + months;

It then checks whether the current period supports years and months. If neither field is supported, it throws an IllegalArgumentException. If only one is supported, it also throws an IllegalArgumentException because the total months cannot be represented correctly.

The fixed implementation then normalizes the total months by converting part of the months into years:

    int years = FieldUtils.safeToInt(totalMonths / 12);
    int months = FieldUtils.safeToInt(totalMonths % 12);

The buggy version instead always performs:

    int years = FieldUtils.safeToInt(years + months / 12);
    int months = FieldUtils.safeToInt(months % 12);

and does not perform the same validation that the fixed version performs for unsupported or partially supported years/months fields.

The relevant behavioral difference concerns normalization of a Period when the supported duration fields for years and months are not both available.

Analyze the source-code change carefully and create a public-API JUnit test that exercises Period.normalizedStandard() with an appropriate Period configuration where the buggy and fixed implementations behave differently.

The test should verify the expected behavior using meaningful assertions.

Then provide:
1. A brief explanation of the behavior affected by the bug.
2. A complete JUnit 4 test class.
3. The test method name clearly identified.

Do not provide a test based on the official Defects4J trigger test.
