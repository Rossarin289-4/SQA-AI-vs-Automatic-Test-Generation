You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-24
Buggy version: Time-24b
Fixed version: Time-24f

Generate ONE JUnit 4 test case intended to detect the behavioral change in:

src/main/java/org/joda/time/format/DateTimeParserBucket.java

Production-code change:

Time-24 modifies DateTimeParserBucket.computeMillis() by removing a second loop that resets fields.

The relevant change is that the fixed version no longer performs the second resetFields loop after computing/resetting parsed fields.

Requirements:

1. Generate ONE complete JUnit 4 test class.
2. Compatible with Joda-Time 2.0 and Defects4J Time-24.
3. Do not modify production code.
4. Do not use Defects4J trigger tests.
5. Directly target DateTimeParserBucket.computeMillis().
6. The test must exercise parsing/building a date-time where reset-field behavior matters.
7. The test must distinguish Time-24b from Time-24f.
8. Use only public or package-accessible APIs available in Joda-Time 2.0.
9. Avoid reflection unless absolutely necessary.
10. Do not use APIs introduced after Joda-Time 2.0.
11. The test should verify an observable date/time value affected by the removed second reset-fields loop.
12. Return only ONE complete Java test class.
13. Include package declaration, imports, and exactly one test method.
14. Do not provide alternative tests.
15. Do not use the known Defects4J trigger test as the test input.
16. Do not adjust the test after seeing execution results.
17. Design the test from the Time-24 production-code diff, not from the trigger test.
18. Keep the test simple and deterministic.
