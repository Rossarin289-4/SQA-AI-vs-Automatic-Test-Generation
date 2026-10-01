You are helping with an SQA experiment using Defects4J.

Project: Joda-Time (Time)
Bug: Time-18
Buggy version: Time-18b
Fixed version: Time-18f

Generate ONE JUnit 4 test case intended to detect the behavioral change in:

src/main/java/org/joda/time/chrono/GJChronology.java

Production-code change:

The old implementation tried to create the date using the Gregorian chronology:

try {
    instant = iGregorianChronology.getDateTimeMillis(
        year, monthOfYear, dayOfMonth,
        hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
} catch (IllegalFieldValueException ex) {
    if (monthOfYear != 2 || dayOfMonth != 29) {
        throw ex;
    }

    instant = iGregorianChronology.getDateTimeMillis(
        year, monthOfYear, 28,
        hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);

    if (instant >= iCutoverMillis) {
        throw ex;
    }
}

if (instant < iCutoverMillis) {
    instant = iJulianChronology.getDateTimeMillis(
        year, monthOfYear, dayOfMonth,
        hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
}

The new implementation removes the special catch block completely:

instant = iGregorianChronology.getDateTimeMillis(
    year, monthOfYear, dayOfMonth,
    hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);

if (instant < iCutoverMillis) {
    instant = iJulianChronology.getDateTimeMillis(
        year, monthOfYear, dayOfMonth,
        hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
}

The important behavioral change concerns February 29 for dates before the Gregorian/Julian cutover. The old implementation had special handling that could allow a February 29 date to be evaluated as a Julian date when the corresponding Gregorian date was invalid but the instant was before the cutover. The new implementation no longer has that special handling.

Requirements:
1. Compatible with Joda-Time Time-18 and JUnit 4.
2. Do not modify production code.
3. Do not use Defects4J trigger tests.
4. The test must meaningfully distinguish Time-18b from Time-18f.
5. Specifically target February 29 behavior around the Gregorian/Julian cutover.
6. Use GJChronology directly or through an appropriate Joda-Time public API.
7. Include meaningful assertions about whether the date is accepted or rejected.
8. Design the test directly from the production-code change.
9. Return only ONE complete Java test class with package, imports, and one test method.
10. Do not provide alternative tests.
