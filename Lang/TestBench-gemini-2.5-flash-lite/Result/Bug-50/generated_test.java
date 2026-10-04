package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.commons.lang.Validate;

public class FastDateFormatTest {
    @Test
    public void testGetInstance() {
        assertNotNull(FastDateFormat.getInstance());
    }

    @Test
    public void testGetInstance_String() {
        assertNotNull(FastDateFormat.getInstance("yyyy-MM-dd"));
    }

    @Test
    public void testGetInstance_String_TimeZone() {
        assertNotNull(FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testGetInstance_String_Locale() {
        assertNotNull(FastDateFormat.getInstance("yyyy-MM-dd", Locale.US));
    }

    @Test
    public void testGetInstance_String_TimeZone_Locale() {
        assertNotNull(FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US));
    }

    @Test
    public void testGetInstance_String_TimeZone_Locale_Equals() {
        FastDateFormat d1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(d1, d2);
    }
    
    @Test
    public void testGetInstance_String_TimeZone_Locale_NotEquals() {
        FastDateFormat d1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST"), Locale.US);
        assertNotEquals(d1, d2);
    }

    @Test
    public void testGetInstance_String_TimeZone_Locale_NotEquals2() {
        FastDateFormat d1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d2 = FastDateFormat.getInstance("yyyy/MM/dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertNotEquals(d1, d2);
    }

    @Test
    public void testGetInstance_String_TimeZone_Locale_NotEquals3() {
        FastDateFormat d1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.FRANCE);
        assertNotEquals(d1, d2);
    }
    
    @Test
    public void testGetInstance_EmptyString() {
        assertNotNull(FastDateFormat.getInstance(""));
    }

    @Test
    public void testGetInstance_NullPattern() {
        try {
            FastDateFormat.getInstance(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetDateInstance_Style() {
        assertNotNull(FastDateFormat.getDateInstance(DateFormat.LONG));
    }

    @Test
    public void testGetDateInstance_Style_Locale() {
        assertNotNull(FastDateFormat.getDateInstance(DateFormat.LONG, Locale.US));
    }

    @Test
    public void testGetDateInstance_Style_TimeZone() {
        assertNotNull(FastDateFormat.getDateInstance(DateFormat.LONG, TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testGetDateInstance_Style_TimeZone_Locale() {
        assertNotNull(FastDateFormat.getDateInstance(DateFormat.LONG, TimeZone.getTimeZone("GMT"), Locale.US));
    }

    @Test
    public void testGetDateInstance_Style_TimeZone_Locale_Equals() {
        FastDateFormat d1 = FastDateFormat.getDateInstance(DateFormat.LONG, TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d2 = FastDateFormat.getDateInstance(DateFormat.LONG, TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(d1, d2);
    }
    
    @Test
    public void testGetDateInstance_Style_TimeZone_Locale_NotEquals() {
        FastDateFormat d1 = FastDateFormat.getDateInstance(DateFormat.LONG, TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d2 = FastDateFormat.getDateInstance(DateFormat.LONG, TimeZone.getTimeZone("PST"), Locale.US);
        assertNotEquals(d1, d2);
    }
    
    @Test
    public void testGetDateInstance_Style_TimeZone_Locale_NotEquals2() {
        FastDateFormat d1 = FastDateFormat.getDateInstance(DateFormat.LONG, TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d2 = FastDateFormat.getDateInstance(DateFormat.SHORT, TimeZone.getTimeZone("GMT"), Locale.US);
        assertNotEquals(d1, d2);
    }

    @Test
    public void testGetTimeInstance_Style() {
        assertNotNull(FastDateFormat.getTimeInstance(DateFormat.LONG));
    }

    @Test
    public void testGetTimeInstance_Style_Locale() {
        assertNotNull(FastDateFormat.getTimeInstance(DateFormat.LONG, Locale.US));
    }

    @Test
    public void testGetTimeInstance_Style_TimeZone() {
        assertNotNull(FastDateFormat.getTimeInstance(DateFormat.LONG, TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testGetTimeInstance_Style_TimeZone_Locale() {
        assertNotNull(FastDateFormat.getTimeInstance(DateFormat.LONG, TimeZone.getTimeZone("GMT"), Locale.US));
    }
    
    @Test
    public void testGetTimeInstance_Style_TimeZone_Locale_Equals() {
        FastDateFormat d1 = FastDateFormat.getTimeInstance(DateFormat.LONG, TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d2 = FastDateFormat.getTimeInstance(DateFormat.LONG, TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(d1, d2);
    }

    @Test
    public void testGetDateTimeInstance_DateStyle_TimeStyle() {
        assertNotNull(FastDateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG));
    }

    @Test
    public void testGetDateTimeInstance_DateStyle_TimeStyle_Locale() {
        assertNotNull(FastDateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.US));
    }

    @Test
    public void testGetDateTimeInstance_DateStyle_TimeStyle_TimeZone() {
        assertNotNull(FastDateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testGetDateTimeInstance_DateStyle_TimeStyle_TimeZone_Locale() {
        assertNotNull(FastDateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, TimeZone.getTimeZone("GMT"), Locale.US));
    }
    
    @Test
    public void testFormat_Date() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26, 10, 30, 0); // Year, Month (0-indexed), Day, Hour, Minute, Second
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        assertEquals("2023-10-26", formatter.format(date));
    }

    @Test
    public void testFormat_Calendar() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals("2023-10-26 10:30:00", formatter.format(cal));
    }
    
    @Test
    public void testFormat_Calendar_TimeZoneOverride() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 10, 30, 0); // This is 10:30 PST
        cal.setTimeZone(TimeZone.getTimeZone("PST"));
        cal.set(Calendar.MILLISECOND, 0);
        // PST is GMT-8, so 10:30 PST is 18:30 GMT
        assertEquals("2023-10-26 18:30:00", formatter.format(cal));
    }

    @Test
    public void testFormat_Long() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);
        long millis = cal.getTimeInMillis();
        assertEquals("2023-10-26", formatter.format(millis));
    }

    @Test
    public void testFormat_StringBuffer_Date() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        StringBuffer buffer = new StringBuffer();
        formatter.format(date, buffer);
        assertEquals("2023-10-26", buffer.toString());
    }

    @Test
    public void testFormat_StringBuffer_Calendar() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);
        StringBuffer buffer = new StringBuffer();
        formatter.format(cal, buffer);
        assertEquals("2023-10-26 10:30:00", buffer.toString());
    }

    @Test
    public void testFormat_StringBuffer_Long() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);
        long millis = cal.getTimeInMillis();
        StringBuffer buffer = new StringBuffer();
        formatter.format(millis, buffer);
        assertEquals("2023-10-26", buffer.toString());
    }

    @Test
    public void testFormat_Object_StringBuffer_FieldPosition() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        StringBuffer buffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(DateFormat.YEAR_FIELD);
        formatter.format(date, buffer, fieldPosition);
        assertEquals("2023-10-26 10:30:00", buffer.toString());
        assertEquals(0, fieldPosition.getBeginIndex());
        assertEquals(4, fieldPosition.getEndIndex());
    }
    
    @Test
    public void testFormat_Object_StringBuffer_FieldPosition_Month() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        StringBuffer buffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(DateFormat.MONTH_FIELD);
        formatter.format(date, buffer, fieldPosition);
        assertEquals("2023-10-26 10:30:00", buffer.toString());
        assertEquals(5, fieldPosition.getBeginIndex());
        assertEquals(7, fieldPosition.getEndIndex());
    }

    @Test
    public void testGetPattern() {
        assertEquals("yyyy-MM-dd", FastDateFormat.getInstance("yyyy-MM-dd").getPattern());
    }

    @Test
    public void testGetTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        assertEquals(tz, FastDateFormat.getInstance("yyyy-MM-dd", tz).getTimeZone());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar() {
        assertTrue(FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT")).getTimeZoneOverridesCalendar());
        assertFalse(FastDateFormat.getInstance("yyyy-MM-dd").getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetLocale() {
        assertEquals(Locale.US, FastDateFormat.getInstance("yyyy-MM-dd", Locale.US).getLocale());
    }

    @Test
    public void testGetMaxLengthEstimate() {
        FastDateFormat df = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSSZ"); // A reasonably complex pattern
        assertTrue(df.getMaxLengthEstimate() > 0); // Ensure it's a positive number
    }
    
    @Test
    public void testEquals() {
        FastDateFormat d1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d3 = FastDateFormat.getInstance("yyyy/MM/dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d4 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST"), Locale.US);
        FastDateFormat d5 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.FRANCE);

        assertEquals(d1, d1); // reflexivity
        assertEquals(d1, d2); // symmetry
        assertEquals(d2, d1); // symmetry
        assertEquals(d1, d2); // transitivity
        assertNotEquals(d1, d3);
        assertNotEquals(d1, d4);
        assertNotEquals(d1, d5);
        assertNotEquals(d1, null);
        assertNotEquals(d1, new Object());
    }

    @Test
    public void testHashCode() {
        FastDateFormat d1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat d2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(d1.hashCode(), d2.hashCode());

        FastDateFormat d3 = FastDateFormat.getInstance("yyyy/MM/dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertNotEquals(d1.hashCode(), d3.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("FastDateFormat[yyyy-MM-dd]", FastDateFormat.getInstance("yyyy-MM-dd").toString());
    }

    @Test
    public void testParseObject_Unsupported() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        assertNull(formatter.parseObject("2023-10-26", pos));
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }
    
    @Test
    public void testFormat_FieldPosition_Year() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26);
        Date date = cal.getTime();
        StringBuffer buffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(DateFormat.YEAR_FIELD);
        formatter.format(date, buffer, fieldPosition);
        assertEquals("2023-10-26", buffer.toString());
        assertEquals(0, fieldPosition.getBeginIndex());
        assertEquals(4, fieldPosition.getEndIndex());
    }

    @Test
    public void testFormat_FieldPosition_Month() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26);
        Date date = cal.getTime();
        StringBuffer buffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(DateFormat.MONTH_FIELD);
        formatter.format(date, buffer, fieldPosition);
        assertEquals("2023-10-26", buffer.toString());
        assertEquals(5, fieldPosition.getBeginIndex());
        assertEquals(7, fieldPosition.getEndIndex());
    }

    @Test
    public void testFormat_FieldPosition_Day() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26);
        Date date = cal.getTime();
        StringBuffer buffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(DateFormat.DATE_FIELD);
        formatter.format(date, buffer, fieldPosition);
        assertEquals("2023-10-26", buffer.toString());
        assertEquals(8, fieldPosition.getBeginIndex());
        assertEquals(10, fieldPosition.getEndIndex());
    }

    @Test
    public void testFormat_Pattern_WithLiterals() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy 'at' HH:mm:ss.SSS Z", TimeZone.getTimeZone("GMT"));
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        assertEquals("2023 at 10:30:00.123 GMT", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_WithEscapedLiteral() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy''MM'Test'");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26);
        Date date = cal.getTime();
        assertEquals("2023'10Test'", formatter.format(date));
    }

    @Test
    public void testFormat_Pattern_TwoDigitYear() {
        FastDateFormat formatter = FastDateFormat.getInstance("yy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26);
        Date date = cal.getTime();
        assertEquals("23-10-26", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_TwoDigitMonth() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26);
        Date date = cal.getTime();
        assertEquals("2023-10", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_UnpaddedMonth() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-M");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26);
        Date date = cal.getTime();
        assertEquals("2023-10", formatter.format(date));
        
        cal.set(2023, Calendar.JANUARY, 5);
        date = cal.getTime();
        assertEquals("2023-1", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_TwoDigitDay() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 5);
        Date date = cal.getTime();
        assertEquals("2023-10-05", formatter.format(date));
    }

    @Test
    public void testFormat_Pattern_UnpaddedDay() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-M-d");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26);
        Date date = cal.getTime();
        assertEquals("2023-10-26", formatter.format(date));

        cal.set(2023, Calendar.OCTOBER, 5);
        date = cal.getTime();
        assertEquals("2023-10-5", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_TwelveHourClock() {
        FastDateFormat formatter = FastDateFormat.getInstance("h:mm a");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26, 10, 30, 0); // AM
        Date date = cal.getTime();
        assertEquals("10:30 AM", formatter.format(date));
        
        cal.set(2023, Calendar.OCTOBER, 26, 22, 30, 0); // PM
        date = cal.getTime();
        assertEquals("10:30 PM", formatter.format(date));
        
        cal.set(2023, Calendar.OCTOBER, 26, 0, 30, 0); // Midnight
        date = cal.getTime();
        assertEquals("12:30 AM", formatter.format(date));
        
        cal.set(2023, Calendar.OCTOBER, 26, 12, 30, 0); // Noon
        date = cal.getTime();
        assertEquals("12:30 PM", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_TwentyFourHourClock() {
        FastDateFormat formatter = FastDateFormat.getInstance("H:mm");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 26, 10, 30, 0); // AM
        Date date = cal.getTime();
        assertEquals("10:30", formatter.format(date));
        
        cal.set(2023, Calendar.OCTOBER, 26, 22, 30, 0); // PM
        date = cal.getTime();
        assertEquals("22:30", formatter.format(date));
        
        cal.set(2023, Calendar.OCTOBER, 26, 0, 30, 0); // Midnight
        date = cal.getTime();
        assertEquals("0:30", formatter.format(date)); // Note: 0 is expected for midnight in H
        
        cal.set(2023, Calendar.OCTOBER, 26, 12, 30, 0); // Noon
        date = cal.getTime();
        assertEquals("12:30", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_k() { // hour in day (1..24)
        FastDateFormat formatter = FastDateFormat.getInstance("k");
        Calendar cal = Calendar.getInstance();
        
        cal.set(2023, Calendar.OCTOBER, 26, 23, 30, 0); // 11 PM
        Date date = cal.getTime();
        assertEquals("23", formatter.format(date));
        
        cal.set(2023, Calendar.OCTOBER, 26, 0, 30, 0); // Midnight
        date = cal.getTime();
        assertEquals("24", formatter.format(date));
        
        cal.set(2023, Calendar.OCTOBER, 26, 12, 30, 0); // Noon
        date = cal.getTime();
        assertEquals("12", formatter.format(date));
    }

    @Test
    public void testFormat_Pattern_K() { // hour in am/pm (0..11)
        FastDateFormat formatter = FastDateFormat.getInstance("K:a");
        Calendar cal = Calendar.getInstance();
        
        cal.set(2023, Calendar.OCTOBER, 26, 10, 30, 0); // AM
        Date date = cal.getTime();
        assertEquals("10:AM", formatter.format(date));
        
        cal.set(2023, Calendar.OCTOBER, 26, 22, 30, 0); // PM
        date = cal.getTime();
        assertEquals("10:PM", formatter.format(date));
        
        cal.set(2023, Calendar.OCTOBER, 26, 0, 30, 0); // Midnight
        date = cal.getTime();
        assertEquals("0:AM", formatter.format(date));
        
        cal.set(2023, Calendar.OCTOBER, 26, 12, 30, 0); // Noon
        date = cal.getTime();
        assertEquals("0:PM", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_Z_NoColon() {
        FastDateFormat formatter = FastDateFormat.getInstance("Z"); // RFC822 without colon
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = cal.getTime();
        assertEquals("+0000", formatter.format(date));

        cal.setTimeZone(TimeZone.getTimeZone("PST")); // GMT-8
        date = cal.getTime();
        assertEquals("-0800", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_Z_WithColon() {
        FastDateFormat formatter = FastDateFormat.getInstance("ZZ"); // ISO8601 with colon
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = cal.getTime();
        assertEquals("+00:00", formatter.format(date));

        cal.setTimeZone(TimeZone.getTimeZone("PST")); // GMT-8
        date = cal.getTime();
        assertEquals("-08:00", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_TimeZoneLongName() {
        FastDateFormat formatter = FastDateFormat.getInstance("z");
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = cal.getTime();
        assertEquals("GMT", formatter.format(date));

        cal.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles")); // PST/PDT
        date = cal.getTime();
        // Using Locale.US to ensure consistent output for test
        formatter = FastDateFormat.getInstance("z", TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
        // The exact name depends on whether DST is active.
        // For Locale.US, and current time, it's likely "Pacific Daylight Time" or "Pacific Standard Time".
        // For a fixed test, let's use a non-DST time to get a consistent result.
        // Oct 26th 2023 is within standard time for PST.
        cal.set(2023, Calendar.OCTOBER, 26); 
        assertEquals("Pacific Standard Time", formatter.format(cal.getTime()));
    }
    
    @Test
    public void testFormat_Pattern_TimeZoneShortName() {
        FastDateFormat formatter = FastDateFormat.getInstance("zz");
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = cal.getTime();
        assertEquals("GMT", formatter.format(date));

        cal.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles")); // PST/PDT
        date = cal.getTime();
        // Using Locale.US to ensure consistent output for test
        formatter = FastDateFormat.getInstance("zz", TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
        // The exact name depends on whether DST is active.
        // For Locale.US, and current time, it's likely "PDT" or "PST".
        // For a fixed test, let's use a non-DST time to get a consistent result.
        // Oct 26th 2023 is within standard time for PST.
        cal.set(2023, Calendar.OCTOBER, 26); 
        assertEquals("PST", formatter.format(cal.getTime()));
    }
    
    @Test
    public void testFormat_Pattern_Millis() {
        FastDateFormat formatter = FastDateFormat.getInstance("SSS");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        assertEquals("123", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_Millis_Padded() {
        FastDateFormat formatter = FastDateFormat.getInstance("SSS");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 5);
        Date date = cal.getTime();
        assertEquals("005", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_DayOfYear() {
        FastDateFormat formatter = FastDateFormat.getInstance("D");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1); // Day 1
        Date date = cal.getTime();
        assertEquals("1", formatter.format(date));
        
        cal = new GregorianCalendar(2023, Calendar.DECEMBER, 31); // Day 365
        date = cal.getTime();
        assertEquals("365", formatter.format(date));
        
        cal = new GregorianCalendar(2024, Calendar.DECEMBER, 31); // Leap year, Day 366
        date = cal.getTime();
        assertEquals("366", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_DayOfWeekInMonth() {
        FastDateFormat formatter = FastDateFormat.getInstance("F");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 3); // First Tuesday
        Date date = cal.getTime();
        assertEquals("1", formatter.format(date));
        
        cal = new GregorianCalendar(2023, Calendar.OCTOBER, 10); // Second Tuesday
        date = cal.getTime();
        assertEquals("2", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_WeekOfYear() {
        FastDateFormat formatter = FastDateFormat.getInstance("w");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1); // Jan 1, 2023 is a Sunday. Week 1 of 2023.
        Date date = cal.getTime();
        assertEquals("1", formatter.format(date));
        
        cal = new GregorianCalendar(2023, Calendar.DECEMBER, 31); // Dec 31, 2023 is a Sunday.
        date = cal.getTime();
        // Using ISO standard week numbering: Dec 31, 2023 is in week 52 of 2023.
        assertEquals("52", formatter.format(date));
        
        cal = new GregorianCalendar(2024, Calendar.JANUARY, 1); // Jan 1, 2024 is a Monday. Week 1 of 2024.
        date = cal.getTime();
        assertEquals("1", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_WeekOfMonth() {
        FastDateFormat formatter = FastDateFormat.getInstance("W");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 3); // Oct 3 is in the first week of October
        Date date = cal.getTime();
        assertEquals("1", formatter.format(date));
        
        cal = new GregorianCalendar(2023, Calendar.OCTOBER, 10); // Oct 10 is in the second week of October
        date = cal.getTime();
        assertEquals("2", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_Era() {
        FastDateFormat formatter = FastDateFormat.getInstance("G");
        Calendar cal = new GregorianCalendar(1, Calendar.JANUARY, 1); // AD 1
        Date date = cal.getTime();
        assertEquals("AD", formatter.format(date));
        
        cal = new GregorianCalendar(0, Calendar.JANUARY, 1); // BC 1 (year 0 is 1 BC)
        date = cal.getTime();
        assertEquals("BC", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_Weekday() {
        FastDateFormat formatter = FastDateFormat.getInstance("EEEE"); // Full weekday name
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26); // Thursday
        Date date = cal.getTime();
        assertEquals("Thursday", formatter.format(date));
        
        formatter = FastDateFormat.getInstance("EEE"); // Short weekday name
        assertEquals("Thu", formatter.format(date));
    }
    
    @Test
    public void testFormat_Pattern_MonthName() {
        FastDateFormat formatter = FastDateFormat.getInstance("MMMM"); // Full month name
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26); // October
        Date date = cal.getTime();
        assertEquals("October", formatter.format(date));
        
        formatter = FastDateFormat.getInstance("MMM"); // Short month name
        assertEquals("Oct", formatter.format(date));
    }
    
    @Test
    public void testFormat_FullPattern() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS Z");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = cal.getTime();
        assertEquals("2023-10-26 10:30:45.123 GMT", formatter.format(date));
    }
}
