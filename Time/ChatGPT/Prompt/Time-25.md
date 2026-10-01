You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-25
Buggy version: Time-25b
Fixed version: Time-25f

Generate ONE JUnit 4 test case intended to detect the behavioral change in:

src/main/java/org/joda/time/DateTimeZone.java

Production-code change:

Time-25 changes DateTimeZone.convertLocalToUTC().

The fixed version removes the branch that handles a positive local offset using previousTransition() before calculating the UTC instant.

The test must directly exercise convertLocalToUTC() around a time-zone transition where the removed previousTransition branch matters.

Requirements:

1. Generate ONE complete JUnit 4 test class.
2. Compatible with Joda-Time 2.0 and Defects4J Time-25.
3. Do not modify production code.
4. Do not use Defects4J trigger tests.
5. Directly target DateTimeZone.convertLocalToUTC().
6. Use a real time zone with a relevant transition.
7. The test must specifically exercise the behavior affected by the removed previousTransition branch.
8. Use public APIs available in Joda-Time 2.0.
9. Do not use APIs introduced after Joda-Time 2.0.
10. The test must produce an observable result that can differ between Time-25b and Time-25f.
11. Keep the test deterministic.
12. Return only ONE complete Java test class.
13. Include package declaration, imports, and exactly one test method.
14. Do not provide alternative tests.
15. Do not use the known Defects4J trigger test as input.
16. Do not adjust the test after seeing execution results.
17. Design the test from the production-code diff, not from the trigger test.
