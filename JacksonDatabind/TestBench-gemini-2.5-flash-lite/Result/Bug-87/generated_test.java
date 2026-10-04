package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import com.fasterxml.jackson.core.io.NumberInput;

public class StdDateFormatTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseISO8601Basic() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:00:00.123+0000";
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the string with the default settings
        // and verifying against a known date.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseISO8601WithZ() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:00:00.123Z";
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the string with 'Z' indicating UTC.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseISO8601NoTimezone() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:00:00.123";
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the string without timezone,
        // assuming default timezone (UTC).
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParsePlainDate() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27";
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the date-only string.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseRFC1123() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // RFC 1123 format
        String dateStr = "Fri, 27 Oct 2023 10:00:00 GMT";
        // Note: The default timezone is UTC. If the input string specifies GMT,
        // it should be parsed correctly.
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the RFC 1123 string.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseRFC1123WithTimeZoneOffset() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // RFC 1123 format with explicit timezone offset
        String dateStr = "Fri, 27 Oct 2023 10:00:00 +0200";
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the RFC 1123 string with offset.
        // The parsing happens relative to the DateFormat's timezone, but the
        // resulting Date object represents an instant in time.
        // For +0200, the UTC time would be 08:00:00.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale);
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(8, cal.get(Calendar.HOUR_OF_DAY)); // 10:00 - 2 hours = 8:00 UTC
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseTimestampLong() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        long timestamp = 1698374400123L; // Corresponds to 2023-10-27T10:00:00.123Z
        String dateStr = String.valueOf(timestamp);
        Date parsedDate = sdf.parse(dateStr);
        assertEquals(timestamp, parsedDate.getTime());
    }

    @Test
    public void testParseTimestampLongNegative() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        long timestamp = -1698374400123L; // Corresponds to a date in the past
        String dateStr = String.valueOf(timestamp);
        Date parsedDate = sdf.parse(dateStr);
        assertEquals(timestamp, parsedDate.getTime());
    }

    @Test
    public void testFormatISO8601() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        Calendar cal = Calendar.getInstance(sdf.getTimeZone(), sdf._locale);
        cal.set(2023, Calendar.OCTOBER, 27, 10, 0, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(0);
        // The format method uses the _formatISO8601 instance, which is created with the object's timezone and locale.
        // Since the default timezone is UTC, the output should reflect that.
        sdf.format(date, sb, fp);
        // Expected format is yyyy-MM-dd'T'HH:mm:ss.SSSZ
        // With default timezone UTC, '+0000' is expected for Z.
        assertEquals("2023-10-27T10:00:00.123+0000", sb.toString());
    }

    @Test
    public void testFormatRFC1123() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // Create a clone with GMT timezone for formatting consistency with RFC1123.
        // The StdDateFormat's `format` method uses its own _formatISO8601.
        // For RFC1123, we need to use a specific RFC1123 formatter.
        // The test should ideally use a specific RFC1123 instance created with the desired timezone.
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        DateFormat rfc1123Formatter = StdDateFormat.getRFC1123Format(gmt, Locale.US); // Use a dedicated RFC1123 formatter

        Calendar cal = Calendar.getInstance(gmt, Locale.US); // Use GMT for calendar
        cal.set(2023, Calendar.OCTOBER, 27, 10, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(0);
        rfc1123Formatter.format(date, sb, fp);

        // Expected format is EEE, dd MMM yyyy HH:mm:ss zzz
        // For the given date and GMT timezone, it should be:
        assertEquals("Fri, 27 Oct 2023 10:00:00 GMT", sb.toString());
    }

    @Test
    public void testWithTimeZone() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone nyZone = TimeZone.getTimeZone("America/New_York");
        StdDateFormat newSdf = sdf.withTimeZone(nyZone);
        assertNotSame(sdf, newSdf);
        assertEquals(nyZone, newSdf.getTimeZone());
        assertEquals(StdDateFormat.getDefaultTimeZone(), sdf.getTimeZone()); // original should be default
    }

    @Test
    public void testWithTimeZoneSame() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone defaultZone = StdDateFormat.getDefaultTimeZone();
        StdDateFormat newSdf = sdf.withTimeZone(defaultZone);
        assertSame(sdf, newSdf); // Should return the same instance if timezone is the same
    }

    @Test
    public void testWithLocale() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        Locale frLocale = Locale.FRANCE;
        StdDateFormat newSdf = sdf.withLocale(frLocale);
        assertNotSame(sdf, newSdf);
        assertEquals(frLocale, newSdf._locale);
        assertEquals(Locale.US, sdf._locale); // original should be default
    }

    @Test
    public void testWithLocaleSame() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        Locale defaultLocale = Locale.US; // Use Locale.US for consistency with the class's default
        StdDateFormat newSdf = sdf.withLocale(defaultLocale);
        assertSame(sdf, newSdf); // Should return the same instance if locale is the same
    }

    @Test
    public void testSetTimeZone() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone tokyoZone = TimeZone.getTimeZone("Asia/Tokyo");
        sdf.setTimeZone(tokyoZone);
        assertEquals(tokyoZone, sdf.getTimeZone());
    }

    @Test
    public void testSetTimeZoneDifferent() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone londonZone = TimeZone.getTimeZone("Europe/London");
        TimeZone originalTimeZone = sdf.getTimeZone();
        sdf.setTimeZone(londonZone);
        assertNotEquals(originalTimeZone, sdf.getTimeZone());
        assertEquals(londonZone, sdf.getTimeZone());
    }

    @Test
    public void testSetTimeZoneSame() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone defaultZone = StdDateFormat.getDefaultTimeZone();
        sdf.setTimeZone(defaultZone);
        assertEquals(defaultZone, sdf.getTimeZone());
    }

    @Test
    public void testSetLenientTrue() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setLenient(true);
        assertTrue(sdf.isLenient());
    }

    @Test
    public void testSetLenientFalse() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setLenient(false);
        assertFalse(sdf.isLenient());
    }

    @Test
    public void testIsLenientDefault() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // Default leniency is true
        assertTrue(sdf.isLenient());
    }

    @Test
    public void testClone() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        sdf.setLenient(false);
        StdDateFormat clonedSdf = sdf.clone();
        assertNotSame(sdf, clonedSdf);
        assertEquals(sdf.getTimeZone(), clonedSdf.getTimeZone());
        assertEquals(sdf.isLenient(), clonedSdf.isLenient());
        assertEquals(sdf._locale, clonedSdf._locale);
    }

    @Test
    public void testToString() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String defaultTzStr = "timezone: " + StdDateFormat.getDefaultTimeZone();
        String localeStr = "(locale: " + Locale.US + ")"; // Use Locale.US for consistency with the class's default
        assertTrue(sdf.toString().contains("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat"));
        assertTrue(sdf.toString().contains(defaultTzStr));
        assertTrue(sdf.toString().contains(localeStr));

        TimeZone laZone = TimeZone.getTimeZone("America/Los_Angeles");
        sdf.setTimeZone(laZone);
        String laTzStr = "timezone: " + laZone;
        assertTrue(sdf.toString().contains(laTzStr));
    }

    @Test
    public void testEquals() throws Exception {
        StdDateFormat sdf1 = new StdDateFormat();
        StdDateFormat sdf2 = new StdDateFormat();
        StdDateFormat sdf3 = sdf1.withTimeZone(TimeZone.getTimeZone("UTC")); // identical state
        StdDateFormat sdf4 = sdf1.withTimeZone(TimeZone.getTimeZone("America/New_York"));

        assertEquals(sdf1, sdf1); // reflexivity
        // The equals method is 'return (o == this);', so different instances are not equal.
        assertNotEquals(sdf1, sdf2);
        assertNotEquals(sdf1, sdf3);
        assertNotEquals(sdf1, sdf4);
    }

    @Test
    public void testHashCode() throws Exception {
        StdDateFormat sdf1 = new StdDateFormat();
        StdDateFormat sdf2 = new StdDateFormat();
        StdDateFormat sdf3 = sdf1.withTimeZone(TimeZone.getTimeZone("America/New_York"));

        // Based on the implementation: hashCode() { return System.identityHashCode(this); }
        // Two different instances will have different hash codes.
        assertEquals(System.identityHashCode(sdf1), sdf1.hashCode());
        assertEquals(System.identityHashCode(sdf2), sdf2.hashCode());
        assertNotEquals(sdf1.hashCode(), sdf2.hashCode());
        assertNotEquals(sdf1.hashCode(), sdf3.hashCode());
    }

    @Test
    public void testParseISO8601WithMillisecondsAndOffsetColon() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:00:00.123+02:00"; // Offset with colon
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the string with the default settings
        // and verifying against a known date. This format requires handling the colon.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(8, cal.get(Calendar.HOUR_OF_DAY)); // 10:00 - 2 hours = 8:00 UTC
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseISO8601WithMillisecondsAndOffsetNoColon() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:00:00.123+0200"; // Offset without colon
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the string with the default settings
        // and verifying against a known date.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(8, cal.get(Calendar.HOUR_OF_DAY)); // 10:00 - 2 hours = 8:00 UTC
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseISO8601WithMillisecondsAndShortOffset() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:00:00.123+02"; // Short offset
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the string with the default settings
        // and verifying against a known date. This requires appending "00" for minutes.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(8, cal.get(Calendar.HOUR_OF_DAY)); // 10:00 - 2 hours = 8:00 UTC
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseISO8601MissingMilliseconds() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:00:00"; // Missing milliseconds
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the string and adding default milliseconds.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND)); // Default milliseconds are 0
    }

    @Test
    public void testParseISO8601MissingSecondsAndMilliseconds() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:00"; // Missing seconds and milliseconds
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the string and adding default seconds and milliseconds.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND)); // Default seconds are 0
        assertEquals(0, cal.get(Calendar.MILLISECOND)); // Default milliseconds are 0
    }

    @Test
    public void testParseISO8601MissingTimezoneAndMilliseconds() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:00:00"; // Missing timezone and milliseconds
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the string without timezone and adding default milliseconds.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND)); // Default milliseconds are 0
    }

    @Test
    public void testParseRFC1123WithTimezoneAbbreviation() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // RFC 1123 is flexible with timezone abbreviations, let's test PST
        String dateStr = "Fri, 27 Oct 2023 02:00:00 PST"; // PST is UTC-8
        Date parsedDate = sdf.parse(dateStr);
        // Expected value derived from parsing the RFC 1123 string with PST.
        // 02:00 PST is 10:00 UTC.
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY)); // 02:00 PST is 10:00 UTC
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseRFC1123WithDifferentLocale() throws Exception {
        // The RFC1123 format string "EEE, dd MMM yyyy HH:mm:ss zzz" uses English month abbreviations (MMM) and day names (EEE).
        // Setting a different locale should not affect the parsing of these standard English abbreviations.
        StdDateFormat sdf = new StdDateFormat().withLocale(Locale.GERMAN);
        String dateStr = "Fri, 27 Oct 2023 10:00:00 GMT";
        Date parsedDate = sdf.parse(dateStr);
        Calendar cal = Calendar.getInstance(StdDateFormat.getDefaultTimeZone(), sdf._locale); // Use default timezone for assertion
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseISO8601WithTrailingCharacters() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // The parse(String) method is designed to throw ParseException if trailing characters exist.
        String dateStr = "2023-10-27T10:00:00.123Z extra";
        try {
            sdf.parse(dateStr);
            fail("Expected ParseException for trailing characters");
        } catch (ParseException e) {
            // Expected behavior: a ParseException is thrown.
        }
    }

    @Test
    public void testParseISO8601WithMissingT() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // The looksLikeISO8601 check might not catch this, but parseAsISO8601 should fail.
        String dateStr = "2023-10-2710:00:00.123Z";
        try {
            sdf.parse(dateStr);
            fail("Expected ParseException for missing 'T'");
        } catch (ParseException e) {
            // Expected behavior: a ParseException is thrown.
        }
    }

    @Test
    public void testParseISO8601WithInvalidTimeZoneOffsetFormat() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // Test parsing with an invalid timezone offset format
        String dateStr = "2023-10-27T10:00:00.123+02:000"; // Extra digit in offset
        try {
            sdf.parse(dateStr);
            fail("Expected ParseException for invalid timezone offset");
        } catch (ParseException e) {
            // Expected behavior: a ParseException is thrown.
        }
    }

    @Test
    public void testGetISO8601FormatWithTimeZone() {
        TimeZone utc = TimeZone.getTimeZone("UTC");
        DateFormat df = StdDateFormat.getISO8601Format(utc);
        assertNotNull(df);
        assertTrue(df instanceof SimpleDateFormat);
        assertEquals(utc, df.getTimeZone());
    }

    @Test
    public void testGetRFC1123FormatWithTimeZoneAndLocale() {
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        Locale us = Locale.US;
        DateFormat df = StdDateFormat.getRFC1123Format(gmt, us);
        assertNotNull(df);
        assertTrue(df instanceof SimpleDateFormat);
        assertEquals(gmt, df.getTimeZone());
        // The internal locale of SimpleDateFormat is not directly accessible via public API.
        // The construction logic confirms the locale is used.
    }
}
