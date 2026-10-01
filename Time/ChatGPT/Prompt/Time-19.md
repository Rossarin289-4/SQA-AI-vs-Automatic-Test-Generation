You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-19
Buggy version: Time-19b
Fixed version: Time-19f

Generate ONE JUnit 4 test case intended to detect the behavioral change in:

src/main/java/org/joda/time/DateTimeZone.java

Production-code change:

The old implementation of convertLocalToUTC contains this condition:

if (offsetLocal >= 0) {
offsetLocal = offset;
}

The new implementation changes it to:

if (offsetLocal > 0) {
offsetLocal = offset;
}

The important behavioral difference is the boundary case where offsetLocal is exactly zero.

Requirements:

1. Generate ONE complete JUnit 4 test class.
2. Compatible with Joda-Time 2.0 and the Defects4J Time project.
3. Do not modify production code.
4. Do not use Defects4J trigger tests.
5. Directly target the changed >= 0 to > 0 condition.
6. The test must exercise DateTimeZone.convertLocalToUTC().
7. Specifically target a case where offsetLocal can be exactly zero and the result depends on the changed condition.
8. The test must meaningfully distinguish Time-19b from Time-19f.
9. Use meaningful assertions on the returned UTC instant.
10. Do not use APIs that do not exist in Joda-Time 2.0.
11. Return only ONE complete Java test class with package, imports, and one test method.
12. Do not provide alternative tests.
13. The test must be designed from the production-code diff before execution and must not be adjusted after seeing test results.
