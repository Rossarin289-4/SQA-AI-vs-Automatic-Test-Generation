You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-8
Buggy version: Time-8b
Fixed version: Time-8f

Your task is to analyze the following production-code change and generate a JUnit 4 test case that is intended to detect the bug.

Production file:
src/main/java/org/joda/time/DateTimeZone.java

Production-code change:

In DateTimeZone.forOffsetHoursMinutes(int hoursOffset, int minutesOffset):

Buggy version:
- minutesOffset is accepted when it is between -59 and 59.
- If hoursOffset is positive and minutesOffset is negative, an IllegalArgumentException is thrown.
- When hoursOffset is negative, the calculation uses:
  minutesOffset = hoursInMinutes - Math.abs(minutesOffset)

Fixed version:
- minutesOffset must be between 0 and 59.
- The restriction preventing positive hours with negative minutes is removed.
- When hoursOffset is negative, the calculation uses:
  minutesOffset = hoursInMinutes - minutesOffset

Generate ONE JUnit 4 test case that specifically targets the behavior changed by this bug.

Requirements:
1. The test must be compatible with the Joda-Time Time-8 project and JUnit 4.
2. Do not modify production code.
3. Do not use Defects4J trigger tests.
4. The test should contain meaningful assertions related to the changed behavior.
5. The test should be designed from the production-code change, not from the known bug outcome.
6. Do not explain multiple alternative tests. Provide one concrete test case.
7. Return the complete Java test class, including package, imports, and test method.
