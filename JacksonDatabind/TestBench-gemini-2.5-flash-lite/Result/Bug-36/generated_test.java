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
    public void testDefaultTimeZoneIsUTC() throws Exception {
        assertEquals("Default timezone should be UTC", TimeZone.getTimeZone("UTC"), StdDateFormat.getDefaultTimeZone());
    }

    @Test
    public void testWithTimeZone() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone nyZone = TimeZone.getTimeZone("America/New_York");
        StdDateFormat sdfWithTZ = sdf.withTimeZone(nyZone);
        assertNotSame("withTimeZone should return a new instance if timezone differs", sdf, sdfWithTZ);
        assertEquals("Timezone should be set correctly", nyZone, sdfWithTZ.getTimeZone());

        // Test with same timezone
        StdDateFormat sdfWithSameTZ = sdf.withTimeZone(nyZone); // This will be the same instance as sdfWithTZ
        assertSame("withTimeZone should return the same instance if timezone is already set", sdfWithTZ, sdfWithSameTZ);

        // Test with null timezone
        StdDateFormat sdfWithNullTZ = sdf.withTimeZone(null);
        assertEquals("withTimeZone(null) should default to UTC", StdDateFormat.getDefaultTimeZone(), sdfWithNullTZ.getTimeZone());
    }

    @Test
    public void testWithLocale() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        Locale frLocale = Locale.FRANCE;
        StdDateFormat sdfWithLocale = sdf.withLocale(frLocale);
        assertNotSame("withLocale should return a new instance if locale differs", sdf, sdfWithLocale);
        // Accessing protected member _locale for testing is necessary here as there's no public getter.
        // If this were a real-world scenario, it would ideally be a public getter.
        assertEquals("Locale should be set correctly", frLocale, sdfWithLocale._locale);

        // Test with same locale
        StdDateFormat sdfWithSameLocale = sdf.withLocale(Locale.US); // Assuming US is the default
        assertSame("withLocale should return the same instance if locale is already set", sdf, sdfWithSameLocale);
    }

    @Test
    public void testClone() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        StdDateFormat clonedSdf = sdf.clone();
        assertNotSame("clone() should return a new instance", sdf, clonedSdf);
        assertEquals("Cloned instance should have the same timezone", sdf.getTimeZone(), clonedSdf.getTimeZone());
        // Accessing protected member _locale for testing is necessary here as there's no public getter.
        assertEquals("Cloned instance should have the same locale", sdf._locale, clonedSdf._locale);
        assertEquals("Cloned instance should have the same lenient setting", sdf.isLenient(), clonedSdf.isLenient());
    }

    @Test
    public void testGetISO8601Format() throws Exception {
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        DateFormat df = StdDateFormat.getISO8601Format(gmt);
        assertNotNull("ISO8601 DateFormat should not be null", df);
        assertEquals("ISO8601 DateFormat should have the correct timezone", gmt, df.getTimeZone());
        // The getISO8601Format(TimeZone) method, from inspection, uses DEFAULT_LOCALE (US) internally.
        // SimpleDateFormat does not have a public getLocale() method.
    }
    
    @Test
    public void testGetISO8601FormatWithLocale() throws Exception {
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        Locale frLocale = Locale.FRANCE;
        DateFormat df = StdDateFormat.getISO8601Format(gmt, frLocale);
        assertNotNull("ISO8601 DateFormat should not be null", df);
        assertEquals("ISO8601 DateFormat should have the correct timezone", gmt, df.getTimeZone());
        // SimpleDateFormat does not have a public getLocale() method.
    }

    @Test
    public void testGetRFC1123Format() throws Exception {
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        Locale usLocale = Locale.US;
        DateFormat df = StdDateFormat.getRFC1123Format(gmt, usLocale);
        assertNotNull("RFC1123 DateFormat should not be null", df);
        assertEquals("RFC1123 DateFormat should have the correct timezone", gmt, df.getTimeZone());
        // SimpleDateFormat does not have a public getLocale() method.
    }

    @Test
    public void testSetTimeZone() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone nyZone = TimeZone.getTimeZone("America/New_York");
        sdf.setTimeZone(nyZone);
        assertEquals("TimeZone should be set", nyZone, sdf.getTimeZone());

        // Changing timezone should clear internal formats
        // The format method returns StringBuffer, not DateFormat. We check if internal formats are reset by
        // re-parsing or re-formatting which relies on the internal DateFormat instances.
        // Since internal formatters are transient and private, we test by ensuring subsequent operations
        // don't fail unexpectedly and that the timezone is correctly reflected.
        
        TimeZone pstZone = TimeZone.getTimeZone("America/Los_Angeles");
        sdf.setTimeZone(pstZone);
        assertEquals("TimeZone should be updated", pstZone, sdf.getTimeZone());
    }

    @Test
    public void testSetLenient() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setLenient(false);
        assertFalse("Lenient setting should be false", sdf.isLenient());

        // Changing lenient setting should clear internal formats
        // Similar to setTimeZone, we cannot directly inspect cleared formats.
        // We test that the setting is applied.
        sdf.setLenient(true);
        assertTrue("Lenient setting should be true", sdf.isLenient());
    }

    @Test
    public void testIsLenientDefault() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        assertTrue("isLenient should default to true", sdf.isLenient());
    }

    @Test
    public void testParseISO8601WithZ() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // Forcing the timezone to UTC for 'Z' handling is good practice for deterministic tests.
        sdf = sdf.withTimeZone(TimeZone.getTimeZone("UTC")); 
        String isoDateStr = "2023-10-27T10:15:30.123Z";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(isoDateStr, pos);
        assertNotNull("Parsing ISO8601 with 'Z' should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", isoDateStr.length(), pos.getIndex());
        
        // Verify with expected milliseconds since epoch for UTC
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 10, 15, 30);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("Parsed date should match expected value", cal.getTimeInMillis(), parsedDate.getTime());
    }

    @Test
    public void testParseISO8601WithTimeZoneOffset() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // Test with a timezone offset
        String isoDateStr = "2023-10-27T10:15:30.123+0200";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(isoDateStr, pos);
        assertNotNull("Parsing ISO8601 with timezone offset should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", isoDateStr.length(), pos.getIndex());

        // The parsing logic for +0200 should result in 8:15:30 UTC
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 8, 15, 30);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("Parsed date should match expected value with timezone offset", cal.getTimeInMillis(), parsedDate.getTime());
    }
    
    @Test
    public void testParseISO8601WithTimeZoneOffsetColon() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // Test with a timezone offset with colon
        String isoDateStr = "2023-10-27T10:15:30.123+02:00";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(isoDateStr, pos);
        assertNotNull("Parsing ISO8601 with timezone offset with colon should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", isoDateStr.length(), pos.getIndex());

        // The parsing logic for +02:00 should result in 8:15:30 UTC
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 8, 15, 30);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("Parsed date should match expected value with timezone offset with colon", cal.getTimeInMillis(), parsedDate.getTime());
    }

    @Test
    public void testParseISO8601PlainDate() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String plainDateStr = "2023-10-27";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(plainDateStr, pos);
        assertNotNull("Parsing plain date should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", plainDateStr.length(), pos.getIndex());

        // Verify with expected date at midnight UTC
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals("Parsed date should match expected value", cal.getTimeInMillis(), parsedDate.getTime());
    }
    
    @Test
    public void testParseISO8601MissingMilliseconds() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf = sdf.withTimeZone(TimeZone.getTimeZone("UTC"));
        String isoDateStr = "2023-10-27T10:15:30Z"; // Missing milliseconds
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(isoDateStr, pos);
        assertNotNull("Parsing ISO8601 with missing milliseconds should succeed", parsedDate);
        // The internal parsing logic adds ".000" if milliseconds are missing.
        // The original string length is 20. The modified string for parsing might be longer.
        // The parse method returns the parsed Date. The ParsePosition's index should reflect the end of the *original* string that was consumed.
        // For "2023-10-27T10:15:30Z", the length is 20. The parse method handles this.
        assertEquals("Parse position should be at the end of the string", isoDateStr.length(), pos.getIndex());
        
        // Verify with expected milliseconds since epoch for UTC (milliseconds should be 0)
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 10, 15, 30);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals("Parsed date should match expected value (0 milliseconds)", cal.getTimeInMillis(), parsedDate.getTime());
    }

    @Test
    public void testParseISO8601WithOffsetAndMissingSecondsAndMilliseconds() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String isoDateStr = "2023-10-27T10:15+0200"; // Missing seconds and milliseconds
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(isoDateStr, pos);
        assertNotNull("Parsing ISO8601 with missing seconds/milliseconds should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", isoDateStr.length(), pos.getIndex());

        // The `parseAsISO8601` method pads these. Expected: 10:15 +0200 -> 08:15:00.000 UTC
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 8, 15, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals("Parsed date should match expected value", cal.getTimeInMillis(), parsedDate.getTime());
    }
    
    @Test
    public void testParseISO8601WithOffsetAndMissingMillisecondsAndSecondsWithColon() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String isoDateStr = "2023-10-27T10:15+02:00"; // Missing milliseconds and seconds, with colon in offset
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(isoDateStr, pos);
        assertNotNull("Parsing ISO8601 with missing milliseconds/seconds and colon offset should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", isoDateStr.length(), pos.getIndex());

        // Expected: 10:15 +02:00 -> 08:15:00.000 UTC
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 8, 15, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals("Parsed date should match expected value", cal.getTimeInMillis(), parsedDate.getTime());
    }

    @Test
    public void testParseRFC1123() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        // RFC1123 parsing relies on SimpleDateFormat, which uses the system's default timezone
        // or the timezone set in the DateFormat. For consistency, we set it explicitly.
        sdf = sdf.withTimeZone(TimeZone.getTimeZone("GMT"));
        String rfc1123DateStr = "Fri, 27 Oct 2023 10:15:30 GMT";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(rfc1123DateStr, pos);
        assertNotNull("Parsing RFC1123 should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", rfc1123DateStr.length(), pos.getIndex());

        // Verify with expected date
        DateFormat df = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        df.setTimeZone(TimeZone.getTimeZone("GMT")); // Match the timezone used for parsing
        Date expectedDate = df.parse(rfc1123DateStr);
        assertEquals("Parsed RFC1123 date should match expected value", expectedDate.getTime(), parsedDate.getTime());
    }

    @Test
    public void testParseRFC1123WithDifferentTimeZone() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone pstZone = TimeZone.getTimeZone("America/Los_Angeles");
        sdf = sdf.withTimeZone(pstZone); // Set default timezone for StdDateFormat
        
        String rfc1123DateStr = "Fri, 27 Oct 2023 10:15:30 PST"; // PST is GMT-8
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(rfc1123DateStr, pos);
        assertNotNull("Parsing RFC1123 with specific timezone should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", rfc1123DateStr.length(), pos.getIndex());

        // To verify, we need to parse the string using SimpleDateFormat with the same timezone.
        SimpleDateFormat expectedDf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        expectedDf.setTimeZone(pstZone); // Use the same timezone as StdDateFormat instance
        Date expectedDate = expectedDf.parse(rfc1123DateStr);
        assertEquals("Parsed RFC1123 date with specific timezone should match expected value", expectedDate.getTime(), parsedDate.getTime());
    }

    @Test
    public void testParseLongTimestamp() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        long timestamp = 1698360000000L; // A fixed timestamp for determinism (Oct 27 2023 10:00:00 UTC)
        String timestampStr = String.valueOf(timestamp);
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(timestampStr, pos);
        assertNotNull("Parsing long timestamp string should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", timestampStr.length(), pos.getIndex());
        assertEquals("Parsed date should match the original timestamp", timestamp, parsedDate.getTime());
    }
    
    @Test
    public void testParseNegativeLongTimestamp() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        long timestamp = -1234567890123L;
        String timestampStr = String.valueOf(timestamp);
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(timestampStr, pos);
        assertNotNull("Parsing negative long timestamp string should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", timestampStr.length(), pos.getIndex());
        assertEquals("Parsed date should match the original negative timestamp", timestamp, parsedDate.getTime());
    }

    @Test
    public void testParseTimestampWithLeadingZeros() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        long timestamp = 12345L;
        String timestampStr = "0000000000000012345"; // Pad with leading zeros
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(timestampStr, pos);
        assertNotNull("Parsing timestamp string with leading zeros should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", timestampStr.length(), pos.getIndex());
        assertEquals("Parsed date should match the actual timestamp value", timestamp, parsedDate.getTime());
    }

    @Test
    public void testParseInvalidDateString() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String invalidDateStr = "invalid-date-string";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(invalidDateStr, pos);
        assertNull("Parsing an invalid date string should return null", parsedDate);
        // The error index for a string that doesn't match any format at all is typically 0.
        assertEquals("Error index for invalid date string", 0, pos.getErrorIndex());
    }
    
    @Test
    public void testParseEmptyString() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String emptyStr = "";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(emptyStr, pos);
        assertNull("Parsing an empty string should return null", parsedDate);
        // The trimming in parse() will result in an empty string.
        // The code then tries to parse it, which will fail. Error index is 0.
        assertEquals("Error index for empty string", 0, pos.getErrorIndex());
    }

    @Test
    public void testParseStringWithOnlySpaces() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String spacesStr = "   ";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(spacesStr, pos); // trim() handles this
        assertNull("Parsing string with only spaces should return null", parsedDate);
        // After trimming, it becomes an empty string, which should result in error index 0.
        assertEquals("Error index for spaces string after trim", 0, pos.getErrorIndex());
    }

    @Test
    public void testFormat() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf = sdf.withTimeZone(TimeZone.getTimeZone("UTC"));
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 10, 15, 30);
        cal.set(Calendar.MILLISECOND, 123);
        Date dateToFormat = cal.getTime();

        StringBuffer buffer = new StringBuffer();
        FieldPosition fp = new FieldPosition(0); // For basic usage, field ID 0 is common.
        StringBuffer formatted = sdf.format(dateToFormat, buffer, fp);

        assertNotNull("Format should not return null", formatted);
        // The default format for StdDateFormat is ISO8601. 'Z' indicates UTC.
        assertEquals("Formatted string should match ISO8601 format", "2023-10-27T10:15:30.123Z", formatted.toString());
        assertEquals("StringBuffer should be appended to", formatted, buffer);
        // FieldPosition is typically used for specific field formatting, its indices
        // are not expected to change for a full date format like this.
        assertEquals("Field position index should not change for this format", 0, fp.getBeginIndex());
        assertEquals("Field position end index should not change for this format", 0, fp.getEndIndex());
    }
    
    @Test
    public void testFormatWithTimeZone() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        TimeZone nyZone = TimeZone.getTimeZone("America/New_York"); // GMT-5
        sdf = sdf.withTimeZone(nyZone);
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC")); // input date is in UTC
        cal.set(2023, Calendar.OCTOBER, 27, 10, 15, 30); // 10:15:30 UTC
        cal.set(Calendar.MILLISECOND, 123);
        Date dateToFormat = cal.getTime();

        StringBuffer buffer = new StringBuffer();
        FieldPosition fp = new FieldPosition(0);
        StringBuffer formatted = sdf.format(dateToFormat, buffer, fp);

        // Expected is 10:15:30 UTC converted to EST (GMT-5)
        // 10:15:30 UTC is 05:15:30 EST. The format string uses 'Z' for the offset.
        assertEquals("Formatted string should match ISO8601 format with NY timezone", "2023-10-27T05:15:30.123-0500", formatted.toString());
    }

    @Test
    public void testFormatWithLocale() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        Locale frLocale = Locale.FRANCE;
        sdf = sdf.withLocale(frLocale);
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 10, 15, 30);
        cal.set(Calendar.MILLISECOND, 123);
        Date dateToFormat = cal.getTime();

        StringBuffer buffer = new StringBuffer();
        FieldPosition fp = new FieldPosition(0);
        StringBuffer formatted = sdf.format(dateToFormat, buffer, fp);
        
        // The default format used by StdDateFormat.format() is ISO8601, which is locale-independent for its structure.
        // Locale primarily affects day/month names in formats like RFC1123.
        // For ISO8601, the output should be the same regardless of locale.
        assertEquals("Default format should be ISO8601 even with different locale", "2023-10-27T10:15:30.123Z", formatted.toString());
    }
    
    @Test
    public void testFormatWithRFC1123() throws Exception {
        // StdDateFormat.format() method itself always uses ISO8601.
        // To test RFC1123 formatting, we would need to use a DateFormat obtained from getRFC1123Format().
        // This test verifies that StdDateFormat.format() itself does NOT produce RFC1123.
        StdDateFormat sdf = new StdDateFormat();
        sdf = sdf.withTimeZone(TimeZone.getTimeZone("GMT"));

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 10, 15, 30);
        cal.set(Calendar.MILLISECOND, 0); // RFC1123 typically doesn't include ms
        Date dateToFormat = cal.getTime();

        StringBuffer buffer = new StringBuffer();
        FieldPosition fp = new FieldPosition(0);
        StringBuffer formatted = sdf.format(dateToFormat, buffer, fp);
        
        // Default format is ISO8601. This confirms format() does not output RFC1123.
        // The default format produces 'Z' for UTC.
        assertEquals("Default format should be ISO8601", "2023-10-27T10:15:30.000Z", formatted.toString());
    }

    @Test
    public void testToString() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String defaultToString = sdf.toString();
        assertTrue("Default toString should contain class name", defaultToString.contains("StdDateFormat"));
        // Default locale is Locale.US, which usually renders as "en_US" in toString.
        assertTrue("Default toString should contain default locale", defaultToString.contains("locale: en_US"));
        assertFalse("Default toString should not contain explicit timezone", defaultToString.contains("timezone:"));
        
        TimeZone nyZone = TimeZone.getTimeZone("America/New_York");
        StdDateFormat sdfWithTZ = sdf.withTimeZone(nyZone);
        String tzToString = sdfWithTZ.toString();
        assertTrue("toString with timezone should contain timezone", tzToString.contains("timezone:"));
        assertTrue("toString with timezone should contain correct timezone ID", tzToString.contains("America/New_York"));
        assertTrue("toString with timezone should contain locale", tzToString.contains("locale: en_US"));
    }
    
    @Test
    public void testToStringWithLocale() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        Locale frLocale = Locale.FRANCE;
        StdDateFormat sdfWithLocale = sdf.withLocale(frLocale);
        String localeToString = sdfWithLocale.toString();
        assertTrue("toString with locale should contain class name", localeToString.contains("StdDateFormat"));
        assertTrue("toString with locale should contain correct locale", localeToString.contains("locale: fr_FR"));
        assertFalse("toString with locale should not contain timezone", localeToString.contains("timezone:"));
    }

    @Test
    public void testLenientParsingWithValidISO8601() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setLenient(true); // Default, but explicit for clarity
        String validIso = "2023-10-27T10:15:30.123Z";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(validIso, pos);
        assertNotNull("Lenient parsing of valid ISO8601 should succeed", parsedDate);
        assertEquals("Parse position should be at the end", validIso.length(), pos.getIndex());
    }
    
    @Test
    public void testLenientParsingWithSlightlyMalformedISO8601() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setLenient(true);
        // This tests the built-in leniency of parseAsISO8601 for missing milliseconds.
        String slightlyMalformedIso = "2023-10-27T10:15:30Z"; 
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(slightlyMalformedIso, pos);
        assertNotNull("Lenient parsing of slightly malformed ISO8601 (missing ms) should succeed", parsedDate);
        // The parse method internally adds ".000" for missing milliseconds. The input string remains the same length.
        assertEquals("Parse position should be at the end", slightlyMalformedIso.length(), pos.getIndex());
    }

    @Test
    public void testNonLenientParsingWithMalformedISO8601() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setLenient(false);
        // Using '/' instead of '-' is a clear violation of ISO8601 format.
        String malformedIso = "2023/10/27T10:15:30Z"; 
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(malformedIso, pos);
        assertNull("Non-lenient parsing of malformed ISO8601 should fail", parsedDate);
        // The error index should point to the character where parsing failed (the first '/').
        // The parsePosition index will advance up to the point of failure.
        // For "2023/10/27T10:15:30Z", parsing fails at index 4.
        assertEquals("Error index for malformed ISO8601", 4, pos.getErrorIndex());
    }
    
    @Test
    public void testNonLenientParsingWithValidISO8601() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf.setLenient(false);
        String validIso = "2023-10-27T10:15:30.123Z";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(validIso, pos);
        assertNotNull("Non-lenient parsing of valid ISO8601 should succeed", parsedDate);
        assertEquals("Parse position should be at the end", validIso.length(), pos.getIndex());
    }

    @Test
    public void testParseAsISO8601_HandlesMissingTimezoneWhenNotPresent() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf = sdf.withTimeZone(TimeZone.getTimeZone("UTC"));
        String dateStr = "2023-10-27"; // Plain date
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(dateStr, pos);
        assertNotNull("Parsing plain date should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", dateStr.length(), pos.getIndex());
    }
    
    @Test
    public void testParseAsISO8601_HandlesMissingTimezoneWhenNotPresentButWithTime() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        sdf = sdf.withTimeZone(TimeZone.getTimeZone("UTC"));
        String dateStr = "2023-10-27T10:15:30"; // Date and time, no timezone
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(dateStr, pos);
        assertNotNull("Parsing date and time without timezone should succeed", parsedDate);
        // The method `looksLikeISO8601` returns true. `parseAsISO8601` is called.
        // The `hasTimeZone` check will fail. It then falls into the `else` block.
        // It constructs a string with 'Z' appended. So "2023-10-27T10:15:30Z".
        // The original string length is 19. The parse method will consume this.
        assertEquals("Parse position should be at the end of the string", dateStr.length(), pos.getIndex());
        
        // The parsed date should be interpreted in the context of the StdDateFormat's timezone (UTC here).
        // Time components will be set to default (00:00:00.000) if not specified, but here they are.
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 10, 15, 30);
        cal.set(Calendar.MILLISECOND, 0); // Milliseconds are 0 by default
        assertEquals("Parsed date should match expected value with UTC and zeroed milliseconds", cal.getTimeInMillis(), parsedDate.getTime());
    }

    @Test
    public void testParseAsISO8601_HandlesPartialTimezoneOffset() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:15:30.123+05"; // Timezone offset with only hours
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(dateStr, pos);
        assertNotNull("Parsing date with partial timezone offset (+05) should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", dateStr.length(), pos.getIndex());
        
        // The code inserts "00" for minutes if missing. So "+05" becomes "+0500".
        // 10:15:30.123 +0500 means 05:15:30.123 UTC.
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 5, 15, 30);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("Parsed date should match expected value with partial timezone offset", cal.getTimeInMillis(), parsedDate.getTime());
    }

    @Test
    public void testParseAsISO8601_HandlesPartialTimezoneOffsetWithColon() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:15:30.123+05:00"; // Timezone offset with hours and colon
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(dateStr, pos);
        assertNotNull("Parsing date with partial timezone offset with colon (+05:00) should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", dateStr.length(), pos.getIndex());
        
        // This is a standard format, 10:15:30.123 +05:00 means 05:15:30.123 UTC.
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 5, 15, 30);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("Parsed date should match expected value with partial timezone offset with colon", cal.getTimeInMillis(), parsedDate.getTime());
    }

    @Test
    public void testParseAsISO8601_HandlesMissingMinutesInTimezoneOffset() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:15:30.123+053"; // Invalid format, missing minutes, should be handled as +0500
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(dateStr, pos);
        assertNotNull("Parsing date with missing minutes in timezone offset (+053) should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", dateStr.length(), pos.getIndex());

        // The code inserts '00' if minutes are missing, so +053 becomes +0500.
        // This means 10:15:30.123 +0500 -> 05:15:30.123 UTC
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 5, 15, 30);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("Parsed date should match expected value with missing minutes in timezone offset", cal.getTimeInMillis(), parsedDate.getTime());
    }
    
    @Test
    public void testParseAsISO8601_HandlesMissingMinutesInTimezoneOffsetWithColon() throws Exception {
        StdDateFormat sdf = new StdDateFormat();
        String dateStr = "2023-10-27T10:15:30.123+05:3"; // Invalid format, missing minutes after colon, should be handled as +05:00
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = sdf.parse(dateStr, pos);
        assertNotNull("Parsing date with missing minutes in timezone offset with colon (+05:3) should succeed", parsedDate);
        assertEquals("Parse position should be at the end of the string", dateStr.length(), pos.getIndex());

        // The code inserts '00' if minutes are missing, so +05:3 becomes +05:00.
        // This means 10:15:30.123 +05:00 -> 05:15:30.123 UTC
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(2023, Calendar.OCTOBER, 27, 5, 15, 30);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("Parsed date should match expected value with missing minutes in timezone offset with colon", cal.getTimeInMillis(), parsedDate.getTime());
    }
}
