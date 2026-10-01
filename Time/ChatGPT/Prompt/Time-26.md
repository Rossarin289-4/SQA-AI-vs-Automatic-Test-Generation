You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-26
Buggy version: Time-26b
Fixed version: Time-26f

Generate ONE JUnit 4 test case intended to detect the behavioral change in:

src/main/java/org/joda/time/DateTimeZone.java
src/main/java/org/joda/time/chrono/ZonedChronology.java
src/main/java/org/joda/time/field/LenientDateTimeField.java

Production-code change:

Time-26 removes the three-argument overload:

DateTimeZone.convertLocalToUTC(long instantLocal, boolean strict, long originalInstantUTC)

and changes internal callers in ZonedChronology and LenientDateTimeField to use:

convertLocalToUTC(long instantLocal, boolean strict)

The test must exercise the affected conversion path through a PUBLIC API rather than calling the removed three-argument method directly.

Requirements:

1. Generate ONE complete JUnit 4 test class.
2. Compatible with Joda-Time 2.0 and Defects4J Time-26.
3. Do not modify production code.
4. Do not use Defects4J trigger tests.
5. Do not call the removed three-argument convertLocalToUTC method.
6. Exercise the behavior through ZonedChronology or LenientDateTimeField using a public Joda-Time API.
7. Use a real time zone with an overlap or transition where local-to-UTC conversion behavior matters.
8. The test must produce an observable result that differs between Time-26b and Time-26f.
9. Use only APIs available in Joda-Time 2.0.
10. Keep the test simple and deterministic.
11. Do not use reflection.
12. Return only ONE complete Java test class.
13. Include package declaration, imports, and exactly one test method.
14. Do not provide alternative tests.
15. Do not use the known Defects4J trigger test as input.
16. Do not adjust the test after seeing execution results.
17. Design the test from the Time-26 production-code diff.
18. The test should verify a concrete observable date/time value, not merely that an object can be constructed.
