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
        assertEquals(Locale.US, instance._locale);
        assertNull(instance._timezone); // Default is UTC, but not explicitly set here
        assertNull(instance._lenient);
        assertFalse(instance.isColonIncludedInTimeZone());
    }

    @Test
    public void testWithTimeZoneUTC() {
        StdDateFormat df = StdDateFormat.instance;
        StdDateFormat newDf = df.withTimeZone(TimeZone.getTimeZone("UTC"));
        assertNotNull(newDf);
        assertEquals("UTC", newDf.getTimeZone().getID());
        assertSame(df, newDf); // Should return same instance if no change
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
        
        StdDateFormat newDf = df.withTimeZone(null);
        assertNotNull(newDf);
        assertEquals("UTC", newDf.getTimeZone().getID());
        assertNotSame(df, newDf);
    }

    @Test
    public void testWithLocaleUS() {
        StdDateFormat df = StdDateFormat.instance;
        StdDateFormat newDf = df.withLocale(Locale.US);
        assertNotNull(newDf);
        assertSame(df, newDf); // Should return same instance if no change
    }

    @Test
    public void testWithLocaleSpecific() {
        StdDateFormat df = StdDateFormat.instance;
        Locale fr = Locale.FRANCE;
        StdDateFormat newDf = df.withLocale(fr);
        assertNotNull(newDf);
        assertEquals(fr, newDf.withLocale(fr)._locale);
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

        StdDateFormat newDf = df.withLenient(null);
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
        StdDateFormat df = StdDateFormat.instance;
        TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
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
        assertEquals(0, pos.getErrorIndex());
        
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
    public void testParseValidISO8601WithZ() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "2023-10-27T10:30:00.123Z";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(0, pos.getErrorIndex());
        
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
        assertEquals(0, pos.getErrorIndex());
        
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
        assertEquals(0, pos.getErrorIndex());
        
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
        long timestamp = System.currentTimeMillis();
        String dateStr = String.valueOf(timestamp);
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(timestamp, parsedDate.getTime());
        assertEquals(0, pos.getErrorIndex());
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
        assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testParseInvalidDate() {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "invalid date string";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNull(parsedDate);
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
        
        assertEquals("-0499", result.toString()); // 500 BC corresponds to year 499 BCE
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
        String dateStr = "2023-10-27T10:30:00.123456789+0100";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(0, pos.getErrorIndex());

        // Verify the parsed date value. With fractional seconds beyond milliseconds,
        // the behavior is to truncate or round. Jackson typically truncates.
        // 2023-10-27T10:30:00.123+0100 should be the effective time.
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
    public void testParseAsISO8601_TooLongFraction() {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "2023-10-27T10:30:00.1234567890+0100"; // 10 digits
        ParsePosition pos = new ParsePosition(0);
        try {
            df.parse(dateStr, pos);
            fail("Expected ParseException for too long fractional seconds");
        } catch (ParseException e) {
            // Expected exception
            assertTrue(e.getMessage().contains("invalid fractional seconds"));
            assertTrue(e.getMessage().contains("at most 9 digits"));
        }
    }

    @Test
    public void testParseAsISO8601_SecondsOptionalColon() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "2023-10-27T10:30:05.123+0100"; // With seconds
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(0, pos.getErrorIndex());
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(parsedDate);
        assertEquals(5, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }
    
    @Test
    public void testParseAsISO8601_SecondsNoColon() throws ParseException {
        StdDateFormat df = StdDateFormat.instance;
        String dateStr = "2023-10-27T10:30"; // Missing seconds
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(0, pos.getErrorIndex());
        
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.setTime(parsedDate);
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
        assertEquals(0, pos.getErrorIndex());
        
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
        StdDateFormat df = StdDateFormat.instance.withTimeZone(TimeZone.getTimeZone("EST"));
        String dateStr = "Fri, 27 Oct 2023 10:30:00 EST";
        ParsePosition pos = new ParsePosition(0);
        Date parsedDate = df.parse(dateStr, pos);
        assertNotNull(parsedDate);
        assertEquals(0, pos.getErrorIndex());

        // EST is UTC-5. 10:30 EST should be 15:30 UTC.
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
