package com.google.gson.internal.bind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.*;

public class ISO8601UtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testFormatBasicDate() throws Exception {
        Calendar calendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = calendar.getTime();
        assertEquals("2023-04-01T12:30:45Z", ISO8601Utils.format(date));
    }

    @Test
    public void testFormatDateWithMillis() throws Exception {
        Calendar calendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        calendar.set(Calendar.MILLISECOND, 123);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = calendar.getTime();
        assertEquals("2023-04-01T12:30:45.123Z", ISO8601Utils.format(date, true));
    }

    @Test
    public void testFormatDateWithOffset() throws Exception {
        Calendar calendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        TimeZone pst = TimeZone.getTimeZone("GMT-08:00"); // Pacific Standard Time
        calendar.setTimeZone(pst);
        Date date = calendar.getTime();
        // Note: The output format for timezone offsets is "yyyy-MM-ddThh:mm:ssZ|[+-]hh:mm"
        // and the reference implementation uses GMT as base for offsets.
        // For PST (GMT-8), it should be -08:00.
        // Let's verify the offset calculation for a specific time.
        // A date in PST that is 2023-04-01T12:30:45 PST is 2023-04-01T20:30:45 UTC.
        // When formatting, the TimeZone's offset from UTC is used.
        // The offset of GMT-08:00 is -8 hours * 60 minutes/hour * 60 seconds/minute * 1000 ms/second = -28,800,000 ms.
        // So, it should be -08:00.
        assertEquals("2023-04-01T12:30:45-08:00", ISO8601Utils.format(date, false, pst));
    }

    @Test
    public void testFormatDateWithOffsetAndMillis() throws Exception {
        Calendar calendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        calendar.set(Calendar.MILLISECOND, 987);
        TimeZone est = TimeZone.getTimeZone("GMT+05:30"); // Indian Standard Time, represented as GMT+05:30
        calendar.setTimeZone(est);
        Date date = calendar.getTime();
        assertEquals("2023-04-01T12:30:45.987+05:30", ISO8601Utils.format(date, true, est));
    }

    @Test
    public void testFormatDateWithZeroOffset() throws Exception {
        Calendar calendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 0, 0, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+00:00")); // Explicitly GMT with zero offset
        Date date = calendar.getTime();
        assertEquals("2023-04-01T00:00:00Z", ISO8601Utils.format(date));
    }

    @Test
    public void testParseBasicDateUTC() throws Exception {
        String dateString = "2023-04-01T12:30:45Z";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithMillisUTC() throws Exception {
        String dateString = "2023-04-01T12:30:45.123Z";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        expectedCalendar.set(Calendar.MILLISECOND, 123);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithOffsetPositive() throws Exception {
        String dateString = "2023-04-01T12:30:45+05:30";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        // Parsing with offset means the resulting date object's time is adjusted to UTC.
        // 12:30:45 in +05:30 is 07:00:45 UTC.
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 7, 0, 45);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithOffsetNegative() throws Exception {
        String dateString = "2023-04-01T12:30:45-08:00";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        // 12:30:45 in -08:00 is 20:30:45 UTC on the same day.
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 20, 30, 45);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithOffsetAndMillisNegative() throws Exception {
        String dateString = "2023-04-01T12:30:45.987-05:00";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        // 12:30:45.987 in -05:00 is 17:30:45.987 UTC.
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 17, 30, 45);
        expectedCalendar.set(Calendar.MILLISECOND, 987);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithoutTimezone() throws Exception {
        String dateString = "2023-04-01";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1);
        // The returned date's value depends on the system's default timezone.
        // We assert the index and absence of exception for this case.
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParseDateWithOnlyYearMonthDay() throws Exception {
        String dateString = "20230401";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1);
        assertEquals(expectedCalendar.getTime(), parsedDate); // Assuming default timezone for comparison
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithTimeNoSecondsOrMillis() throws Exception {
        String dateString = "2023-04-01T12:30Z";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 0);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithTimeAndSecondsNoMillis() throws Exception {
        String dateString = "2023-04-01T12:30:45Z";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithTimeNoSecondsWithOffset() throws Exception {
        String dateString = "2023-04-01T12:30+02:00";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        // 12:30 in +02:00 is 10:30 UTC
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 10, 30, 0);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithTimeAndSecondsNoMillisWithOffset() throws Exception {
        String dateString = "2023-04-01T12:30:45-03:00";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        // 12:30:45 in -03:00 is 15:30:45 UTC
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 15, 30, 45);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithMillisThreeDigits() throws Exception {
        String dateString = "2023-04-01T12:30:45.123Z";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        expectedCalendar.set(Calendar.MILLISECOND, 123);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithMillisTwoDigits() throws Exception {
        String dateString = "2023-04-01T12:30:45.12Z"; // Valid according to some specs if padded with 0
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        // The code `fraction * 10` handles 2 digits to become milliseconds.
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        expectedCalendar.set(Calendar.MILLISECOND, 120); // 12 * 10
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithMillisOneDigit() throws Exception {
        String dateString = "2023-04-01T12:30:45.1Z"; // Valid according to some specs if padded with 00
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        // The code `fraction * 100` handles 1 digit to become milliseconds.
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        expectedCalendar.set(Calendar.MILLISECOND, 100); // 1 * 100
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseDateWithMillisZeroDigits() throws Exception {
        String dateString = "2023-04-01T12:30:45.";
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for empty milliseconds fraction");
        } catch (ParseException e) {
            // Expected
        }
    }

    @Test
    public void testParseLeapSecond() throws Exception {
        // Testing the handling of leap seconds (seconds > 59 and < 63)
        String dateString = "2023-04-01T12:30:61Z"; // A leap second, should be treated as 59
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 59);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseLeapSecondUpperBoundary() throws Exception {
        // Testing the handling of leap seconds (seconds > 59 and < 63)
        String dateString = "2023-04-01T12:30:62Z"; // A leap second, should be treated as 59
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 59);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseInvalidTimezoneOffset() throws Exception {
        String dateString = "2023-04-01T12:30:45+15:00"; // Invalid offset
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for invalid timezone offset");
        } catch (ParseException e) {
            // The exception message might be "Mismatching time zone indicator: GMT+15:00 given, resolves to GMT"
            // or similar, depending on TimeZone.getTimeZone's behavior.
            // The critical part is that an exception is thrown.
            assertTrue(e.getMessage().contains("Mismatching time zone indicator"));
            assertEquals(20, pos.getIndex()); // Index where the timezone indicator starts
        }
    }

    @Test
    public void testParseInvalidTimezoneOffsetShort() throws Exception {
        String dateString = "2023-04-01T12:30:45+15"; // Invalid offset format
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for invalid short timezone offset");
        } catch (ParseException e) {
            // The code appends "00" if length is less than 5 for timezoneOffset.
            // So "+15" becomes "+1500".
            // `TimeZone.getTimeZone("GMT+1500")` might resolve to something unexpected.
            // The code checks `timezone.getID()`. If it's not matching the ID, it throws.
            // Let's check the expected parsing up to that point.
            assertTrue(e.getMessage().contains("Mismatching time zone indicator"));
            assertEquals(20, pos.getIndex()); // Index where the timezone indicator starts
        }
    }

    @Test
    public void testParseInvalidTimezoneIndicator() throws Exception {
        String dateString = "2023-04-01T12:30:45X"; // Invalid timezone indicator
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for invalid timezone indicator");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Invalid time zone indicator 'X'"));
            assertEquals(19, pos.getIndex()); // Index of 'X'
        }
    }

    @Test
    public void testParseNoTimezone() throws Exception {
        String dateString = "2023-04-01T12:30:45"; // Missing timezone
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for missing timezone");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("No time zone indicator"));
            // The offset becomes 19 when the 'T' has been processed and we are at the start of timezone.
            assertEquals(19, pos.getIndex());
        }
    }

    @Test
    public void testParseInvalidYearFormat() throws Exception {
        String dateString = "23-04-01T12:30:45Z"; // Year not 4 digits
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for invalid year format");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Invalid number"));
            assertEquals(0, pos.getIndex());
        }
    }

    @Test
    public void testParseInvalidMonthFormat() throws Exception {
        String dateString = "2023-4-01T12:30:45Z"; // Month not 2 digits
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for invalid month format");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Invalid number"));
            // The offset is 4 after parsing "2023" and 5 after parsing "-". The '4' is parsed as month.
            // The next character is '-', which is not a digit for the month.
            // The `parseInt(date, offset, offset += 2)` will try to parse "4-", which fails.
            // The offset after parsing year is 4. After checking for '-' it becomes 5.
            // The next `parseInt` call for month starts at offset 5.
            // It reads '4', then it checks for '-', finds it.
            // The current logic would parse '4' and then try to parse the next char.
            // The issue is that `parseInt` expects exactly two digits for month.
            // For "2023-4-01", offset is 5. `parseInt(date, 5, 7)` reads '4' then '-'.
            // The number format exception happens because '-' is not a digit.
            // The index when `parseInt` fails for month will be 5.
            assertEquals(5, pos.getIndex());
        }
    }

    @Test
    public void testParseInvalidDayFormat() throws Exception {
        String dateString = "2023-04-1T12:30:45Z"; // Day not 2 digits
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for invalid day format");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Invalid number"));
            // The offset after year and month is 8. After checking for '-', it's 9.
            // `parseInt` for day starts at offset 9. It reads '1', then 'T'.
            // `parseInt(date, 9, 11)` will fail on 'T'.
            assertEquals(9, pos.getIndex());
        }
    }

    @Test
    public void testParseInvalidHourFormat() throws Exception {
        String dateString = "2023-04-01T2:30:45Z"; // Hour not 2 digits
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for invalid hour format");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Invalid number"));
            // The offset after date and 'T' is 11.
            // `parseInt(date, 11, 13)` will read '2', then ':'.
            assertEquals(11, pos.getIndex());
        }
    }

    @Test
    public void testParseInvalidMinuteFormat() throws Exception {
        String dateString = "2023-04-01T12:3:45Z"; // Minute not 2 digits
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for invalid minute format");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Invalid number"));
            // The offset after hour is 14. After checking for ':', it's 15.
            // `parseInt(date, 15, 17)` will read '3', then ':'.
            assertEquals(15, pos.getIndex());
        }
    }

    @Test
    public void testParseInvalidSecondFormat() throws Exception {
        String dateString = "2023-04-01T12:30:5Z"; // Second not 2 digits
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse(dateString, pos);
            fail("Expected ParseException for invalid second format");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Invalid number"));
            // The offset after minute is 17. After checking for ':', it's 18.
            // `parseInt(date, 18, 20)` will read '5', then 'Z'.
            assertEquals(18, pos.getIndex());
        }
    }

    @Test
    public void testParseWithTimeZoneOffsetZeroColon() throws Exception {
        String dateString = "2023-04-01T12:30:45+00:00";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseWithTimeZoneOffsetZeroNoColon() throws Exception {
        String dateString = "2023-04-01T12:30:45+0000";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testFormatMaxYear() throws Exception {
        Calendar calendar = new GregorianCalendar(9999, Calendar.DECEMBER, 31, 23, 59, 59);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = calendar.getTime();
        assertEquals("9999-12-31T23:59:59Z", ISO8601Utils.format(date));
    }

    @Test
    public void testFormatMinYear() throws Exception {
        // Year 0 is problematic. GregorianCalendar(0, ...) means 1 BC.
        // Let's use a year that's clearly handled, like 1.
        Calendar calendar = new GregorianCalendar(1, Calendar.JANUARY, 1, 0, 0, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = calendar.getTime();
        // The format method should produce "0001-01-01T00:00:00Z" for year 1.
        // The original test had year 0, which results in "0000-01-01T00:00:00Z", which is year 1 BC.
        // The reference source code for `padInt` will handle year 0 correctly as "0000".
        // Let's stick to the original test's intent of minimum year formatting.
        // The current output of '0000-01-01T00:00:00Z' for GregorianCalendar(0, ...) is correct based on Java's behavior.
        // The failure was likely due to a slight difference in interpretation of the "0000" year.
        // Let's re-assert the original expected value, assuming the `padInt` handles it.
        Calendar calendarForZero = new GregorianCalendar(0, Calendar.JANUARY, 1, 0, 0, 0);
        calendarForZero.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals("0000-01-01T00:00:00Z", ISO8601Utils.format(calendarForZero.getTime()));
    }

    @Test
    public void testParseWithLongerOffset() throws Exception {
        // Test an offset that might be longer than 5 chars if it were not normalized.
        // e.g., +05:30 which has 6 chars. The code `timezoneOffset.length() >= 5 ? timezoneOffset : timezoneOffset + "00";`
        // handles this.
        String dateString = "2023-04-01T12:30:45+05:30";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 7, 0, 45); // 12:30:45 - 5:30 = 07:00:45 UTC
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testParseWithTzOffsetHHMM() throws Exception {
        // Test a timezone offset in hhmm format (without colon)
        String dateString = "2023-04-01T12:30:45+0530";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 7, 0, 45); // 12:30:45 - 5:30 = 07:00:45 UTC
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        assertEquals(dateString.length(), pos.getIndex());
    }

    @Test
    public void testFormatWithLongOffset() throws Exception {
        Calendar calendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 12, 30, 45);
        // Using a timezone with a non-standard offset that requires careful handling
        TimeZone tz = TimeZone.getTimeZone("GMT-05:00"); // Eastern Standard Time
        calendar.setTimeZone(tz);
        Date date = calendar.getTime();
        assertEquals("2023-04-01T12:30:45-05:00", ISO8601Utils.format(date, false, tz));
    }

    @Test
    public void testParseWithShortTimezoneOffset() throws Exception {
        // Test short timezone offset like +01
        String dateString = "2023-04-01T12:30:45+01";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);
        // The code appends "00" if length is < 5, so it becomes "+0100".
        // 12:30:45 in +01:00 is 11:30:45 UTC.
        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1, 11, 30, 45);
        expectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(expectedCalendar.getTime(), parsedDate);
        // The original failing assertion was `assertEquals(22, pos.getIndex());`
        // The length of "2023-04-01T12:30:45" is 19. The offset starts at index 19.
        // "+01" has length 3. So the total length of the string is 19 + 3 = 22.
        // The `pos.setIndex(offset)` where offset is the end of parsing will be 22.
        assertEquals(22, pos.getIndex());
    }

    @Test
    public void testParseDateWithoutT() throws Exception {
        String dateString = "2023-04-01"; // Date only, no T separator
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        // The code path for !hasT and date.length() <= offset means no time part.
        // It uses `new GregorianCalendar(year, month - 1, day)` and returns `calendar.getTime()`.
        // This is interpreted in the system's default timezone.
        // We expect the index to be correct.
        assertEquals(10, pos.getIndex());
        // The exact Date object's value depends on the system's default timezone, so we can't assert `getTime()` directly.
        // We assert that no exception is thrown and the index is correct.
    }

    @Test
    public void testParseDateWithYearMonthDayNoSeparator() throws Exception {
        String dateString = "20230401"; // Date without separators
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = ISO8601Utils.parse(dateString, pos);

        Calendar expectedCalendar = new GregorianCalendar(2023, Calendar.APRIL, 1); // Month is 0-indexed
        // This uses the path for no 'T' and date.length() <= offset.
        assertEquals(expectedCalendar.getTime(), parsedDate); // Assumes default timezone for comparison
        assertEquals(8, pos.getIndex());
    }
}
