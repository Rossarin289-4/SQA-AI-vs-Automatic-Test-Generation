package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.fasterxml.jackson.core.io.NumberInput;

public class StdDateFormatTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDefaultTimeZone() {
        TimeZone defaultTZ = StdDateFormat.getDefaultTimeZone();
        assertNotNull(defaultTZ);
        assertEquals("UTC", defaultTZ.getID());
    }

    @Test
    public void testInstance() {
        StdDateFormat instance = StdDateFormat.instance;
        assertNotNull(instance);
        // The default locale is US, but instance is a blueprint and might not have it explicitly set until used.
        // However, based on the constructor, it should be Locale.US
        assertEquals(Locale.US, instance._locale);
        // The instance is a blueprint, so _timezone and _lenient are null.
        assertNull(instance._timezone);
        assertNull(instance._lenient);
        assertFalse(instance.isColonIncludedInTimeZone());
    }

    @Test
    public void testWithTimeZoneUTC() {
        StdDateFormat df = StdDateFormat.instance;
        // `withTimeZone` should return 'this' if the timezone is the same or null and default is UTC.
        // Testing with an explicit UTC timezone.
        StdDateFormat newDf = df.withTimeZone(TimeZone.getTimeZone("UTC"));
        assertNotNull(newDf);
        assertEquals("UTC", newDf.getTimeZone().getID());
        // If the timezone is already set to UTC, it should return the same instance.
        // However, the instance is a singleton blueprint, so setting it to UTC *might* create a new instance
        // if it was null before. Let's check if the internal _timezone is set.
        // The `withTimeZone` method creates a new instance if the timezone is different.
        // If `_timezone` is null, it's considered different from a non-null UTC.
        assertTrue(newDf != df); // It creates a new instance if _timezone is null.
        assertEquals("UTC", newDf.getTimeZone().getID());
    }
    
    @Test
    public void testWithTimeZoneSpecific() {
        StdDateFormat df = StdDateFormat.instance;
        TimeZone ny = TimeZone.getTimeZone("America/New_York");
        StdDateFormat newDf = df.withTimeZone(ny);
        assertNotNull(newDf);
        assertEquals(ny.getID(), newDf.getTimeZone().getID());
        assertNotSame(df, newDf);
    }

    @Test
    public void testWithTimeZoneNull() {
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("America/New_York"));
        assertNotNull(df);
        assertEquals("America/New_York", df.getTimeZone().getID());
        
        StdDateFormat newDf = df.withTimeZone(null); // null should default to UTC
        assertNotNull(newDf);
        assertEquals("UTC", newDf.getTimeZone().getID());
        assertNotSame(df, newDf);
    }

    @Test
    public void testWithLocaleUS() {
        StdDateFormat df = StdDateFormat.instance;
        StdDateFormat newDf = df.withLocale(Locale.US);
        assertNotNull(newDf);
        // If locale is already US, it should return the same instance.
        // The instance is a blueprint, so _locale is US. Setting it to US should be same.
        assertSame(df, newDf); 
    }

    @Test
    public void testWithLocaleSpecific() {
        StdDateFormat df = StdDateFormat.instance;
        Locale fr = Locale.FRANCE;
        StdDateFormat newDf = df.withLocale(fr);
        assertNotNull(newDf);
        assertEquals(fr, newDf.withLocale(fr)._locale); // Access _locale directly for check
        assertNotSame(df, newDf);
    }

    @Test
    public void testWithLenientTrue() {
        StdDateFormat df = StdDateFormat.instance;
        StdDateFormat newDf = df.withLenient(Boolean.TRUE);
        assertNotNull(newDf);
        assertTrue(newDf.isLenient());
        assertNotSame(df, newDf);
    }

    @Test
    public void testWithLenientFalse() {
        StdDateFormat df = StdDateFormat.instance;
        StdDateFormat newDf = df.withLenient(Boolean.FALSE);
        assertNotNull(newDf);
        assertFalse(newDf.isLenient());
        assertNotSame(df, newDf);
    }

    @Test
    public void testWithLenientNull() {
        StdDateFormat df = StdDateFormat.instance.withLenient(Boolean.FALSE);
        assertNotNull(df);
        assertFalse(df.isLenient());

        StdDateFormat newDf = df.withLenient(null); // null should default to true
        assertNotNull(newDf);
        assertTrue(newDf.isLenient()); // Default is true
        assertNotSame(df, newDf);
    }
    
    @Test
    public void testWithColonInTimeZoneTrue() {
        StdDateFormat df = StdDateFormat.instance;
        StdDateFormat newDf = df.withColonInTimeZone(true);
        assertNotNull(newDf);
        assertTrue(newDf.isColonIncludedInTimeZone());
        assertNotSame(df, newDf);
    }

    @Test
    public void testWithColonInTimeZoneFalse() {
        StdDateFormat df = StdDateFormat.instance.withColonInTimeZone(true);
        StdDateFormat newDf = df.withColonInTimeZone(false);
        assertNotNull(newDf);
        assertFalse(newDf.isColonIncludedInTimeZone());
        assertNotSame(df, newDf);
    }

    @Test
    public void testClone() {
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("America/New_York"))
                                             .withLocale(Locale.FRANCE)
                                             .withLenient(Boolean.FALSE)
                                             .withColonInTimeZone(true);
        StdDateFormat clonedDf = df.clone();
        assertNotNull(clonedDf);
        assertNotSame(df, clonedDf);
        assertEquals(df.getTimeZone(), clonedDf.getTimeZone()); // Use getter for timezone
        assertEquals(df._locale, clonedDf._locale); // _locale is protected, access within same package
        assertEquals(df._lenient, clonedDf._lenient); // _lenient is protected, access within same package
        assertEquals(df.isColonIncludedInTimeZone(), clonedDf.isColonIncludedInTimeZone()); // Use getter
    }

    @Test
    public void testGetTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("Europe/London");
        StdDateFormat df = StdDateFormat.instance.withTimeZone(tz);
        assertEquals(tz, df.getTimeZone());
    }

    @Test
    public void testSetTimeZone() {
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("Asia/Tokyo")); // Ensure it has a timezone
        TimeZone tz = TimeZone.getTimeZone("Asia/Shanghai");
        df.setTimeZone(tz);
        assertEquals(tz, df.getTimeZone());
    }

    @Test
    public void testSetLenient() {
        StdDateFormat df = StdDateFormat.instance;
        df.setLenient(false);
        assertFalse(df.isLenient());
    }

    @Test
    public void testIsLenientDefault() {
        StdDateFormat df = StdDateFormat.instance;
        // The default _lenient is null, which means it's true in isLenient()
        assertTrue(df.isLenient());
    }

    @Test
    public void testIsColonIncludedInTimeZoneDefault() {
        StdDateFormat df = StdDateFormat.instance;
        assertFalse(df.isColonIncludedInTimeZone());
    }

    @Test
    public void testParseValidISO8601() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "2023-10-27T10:30:00.123+0100";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        // The error index should be -1 if parsing is successful up to the end.
        assertEquals(-1, pos.getErrorIndex());
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        // The parsing is done in UTC by default, so the time needs to be adjusted.
        // 10:30 +0100 is 09:30 UTC.
        assertEquals(9, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseValidISO8601WithZ() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "2023-10-27T10:30:00.123Z";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(-1, pos.getErrorIndex());
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseValidPlainDate() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "2023-10-27";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(-1, pos.getErrorIndex());
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
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
    public void testParseValidRFC1123() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "Fri, 27 Oct 2023 10:30:00 GMT";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(-1, pos.getErrorIndex());
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseTimestampLongPositive() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        long timestamp = 1678886400000L; // Some arbitrary positive timestamp
        String dateStr = String.valueOf(timestamp);
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(timestamp, parsedDate.getTime());
        assertEquals(-1, pos.getErrorIndex());
    }

    @Test
    public void testParseTimestampLongNegative() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        long timestamp = -1672531200000L; // Jan 1, 1970, 00:00:00 GMT minus some days
        String dateStr = String.valueOf(timestamp);
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(timestamp, parsedDate.getTime());
        assertEquals(-1, pos.getErrorIndex());
    }

    @Test
    public void testParseInvalidDate() {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "invalid date string";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNull(parsedDate);
        // Error index should point to where parsing failed.
        // The implementation's _parseDate calls _parseDateFromLong which can throw ParseException.
        // If it doesn't match any known format, the exception will set error index.
        // Here, `parse` will eventually throw and `pos.getErrorIndex()` will reflect it.
        // The `parse` method itself doesn't set error index on failure, but returns null.
        // The internal `_parseDate` and its callees set the `pos` in case of issues.
        // For a completely unparseable string, it often results in errorIndex > 0.
        assertTrue(pos.getErrorIndex() > 0);
    }

    @Test
    public void testFormat() {
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("UTC"));
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.OCTOBER, 27, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(Calendar.DATE);
        StringBuffer result = df.format(date, sb, fp);
        
        assertEquals(sb, result);
        // Default serialization format for UTC is +0000
        assertEquals("2023-10-27T10:30:00.123+0000", result.toString());
    }

    @Test
    public void testFormatWithColon() {
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("UTC"))
                                             .withColonInTimeZone(true);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(2023, Calendar.OCTOBER, 27, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(Calendar.DATE);
        StringBuffer result = df.format(date, sb, fp);
        
        assertEquals("2023-10-27T10:30:00.123+00:00", result.toString());
    }

    @Test
    public void testFormatBCE() {
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("UTC"));
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        cal.set(Calendar.YEAR, 1); // Year 1 BC
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(Calendar.DATE);
        StringBuffer result = df.format(date, sb, fp);
        
        // Year 1 BC (GregorianCalendar.BC, year=1) is represented as "+0000" in ISO format.
        assertEquals("+0000", result.toString());
    }
    
    @Test
    public void testFormatBCE2() {
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("UTC"));
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        cal.set(Calendar.YEAR, 500); // Year 500 BC
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(Calendar.DATE);
        StringBuffer result = df.format(date, sb, fp);
        
        // 500 BC corresponds to year 499 BCE in ISO 8601.
        assertEquals("-0499", result.toString());
    }

    @Test
    public void testFormatYearOver9999() {
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("UTC"));
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(10000, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(Calendar.DATE);
        StringBuffer result = df.format(date, sb, fp);
        
        // Years beyond 9999 are prefixed with '+' and not padded to 5 digits.
        assertEquals("+10000-01-01T00:00:00.000+0000", result.toString());
    }
    
    @Test
    public void testFormatYearOver9999WithColon() {
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("UTC"))
                                             .withColonInTimeZone(true);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.set(10000, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        StringBuffer sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(Calendar.DATE);
        StringBuffer result = df.format(date, sb, fp);
        
        assertEquals("+10000-01-01T00:00:00.000+00:00", result.toString());
    }

    @Test
    public void testToString() {
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("America/New_York"))
                                             .withLocale(Locale.FRANCE)
                                             .withLenient(Boolean.FALSE);
        String toStringOutput = df.toString();
        assertTrue(toStringOutput.startsWith("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: "));
        assertTrue(toStringOutput.contains("locale: fr_FR"));
        assertTrue(toStringOutput.contains("lenient: false"));
    }

    @Test
    public void testToPattern() {
        StdDateFormat df = StdDateFormat.instance;
        String pattern = df.toPattern();
        assertTrue(pattern.contains("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        assertTrue(pattern.contains("EEE, dd MMM yyyy HH:mm:ss zzz"));
        // Default leniency is true, so "lenient" should be in the pattern output
        assertTrue(pattern.contains("lenient")); 
        assertFalse(pattern.contains("strict"));
    }
    
    @Test
    public void testToPatternStrict() {
        StdDateFormat df = StdDateFormat.instance.withLenient(Boolean.FALSE);
        String pattern = df.toPattern();
        assertTrue(pattern.contains("strict"));
        assertFalse(pattern.contains("lenient"));
    }

    @Test
    public void testEqualsSelf() {
        StdDateFormat df = StdDateFormat.instance;
        assertTrue(df.equals(df));
    }

    @Test
    public void testEqualsDifferentInstance() {
        StdDateFormat df1 = StdDateFormat.instance;
        StdDateFormat df2 = StdDateFormat.instance.clone();
        // Based on implementation, equals is identity
        assertFalse(df1.equals(df2));
    }

    @Test
    public void testHashCodeSelf() {
        StdDateFormat df = StdDateFormat.instance;
        assertEquals(System.identityHashCode(df), df.hashCode());
    }

    @Test
    public void testParseAsISO8601_LongerFraction() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "2023-10-27T10:30:00.123456789+0100"; // Example with more than 3 decimal places for milliseconds
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(-1, pos.getErrorIndex());

        // The _parseAsISO8601 method truncates fractional seconds beyond milliseconds.
        // So, .123456789 should be treated as .123.
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH)); // October is 9
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        // 10:30 +0100 is 09:30 UTC
        assertEquals(9, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseAsISO8601_SecondsOptionalColon() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "2023-10-27T10:30:05.123+0100"; // With seconds
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(-1, pos.getErrorIndex());
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(parsedDate);
        // 10:30 +0100 is 09:30 UTC
        assertEquals(9, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(5, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }
    
    @Test
    public void testParseAsISO8601_SecondsNoColon() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "2023-10-27T10:30"; // Missing seconds and milliseconds
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(-1, pos.getErrorIndex());
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(parsedDate);
        // 10:30 +0100 is 09:30 UTC
        assertEquals(9, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseRFC1123_WithGMT() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "Fri, 27 Oct 2023 10:30:00 GMT";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(-1, pos.getErrorIndex());
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
    }
    
    @Test
    public void testParseRFC1123_WithEST() throws ParseException {
        // When parsing RFC1123, the timezone specified in the string is used,
        // not the timezone of the StdDateFormat instance unless it's explicitly set for parsing.
        // The `_formatRFC1123` is initialized with `DEFAULT_TIMEZONE` (UTC).
        // So, a date like "10:30 EST" parsed by an instance with default settings will be treated as 10:30 UTC.
        // If we want to test parsing with a specific timezone, we need to ensure the DateFormat instance used for parsing is configured.
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("EST")); // This affects formatting, not parsing directly without re-initialization
        String dateStr = "Fri, 27 Oct 2023 10:30:00 EST";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos); // The parse method uses SimpleDateFormat which respects timezone in string
        assertNotNull(parsedDate);
        assertEquals(-1, pos.getErrorIndex());

        // EST is UTC-5. 10:30 EST is 15:30 UTC.
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(9, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(15, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
    }
}
