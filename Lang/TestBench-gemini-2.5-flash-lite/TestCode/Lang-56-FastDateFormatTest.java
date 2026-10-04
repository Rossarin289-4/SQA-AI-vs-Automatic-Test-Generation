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
    public void testGetInstance_Pattern() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        assertNotNull(formatter);
        assertEquals("yyyy-MM-dd", formatter.getPattern());
    }

    @Test
    public void testGetInstance_Pattern_TimeZone() {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", timeZone);
        assertNotNull(formatter);
        assertEquals("yyyy-MM-dd", formatter.getPattern());
        assertEquals(timeZone, formatter.getTimeZone());
    }

    @Test
    public void testGetInstance_Pattern_TimeZone_Locale() {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Locale locale = Locale.US;
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", timeZone, locale);
        assertNotNull(formatter);
        assertEquals("yyyy-MM-dd", formatter.getPattern());
        assertEquals(timeZone, formatter.getTimeZone());
        assertEquals(locale, formatter.getLocale());
    }

    @Test
    public void testGetInstance_Pattern_Locale() {
        Locale locale = Locale.US;
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", locale);
        assertNotNull(formatter);
        assertEquals("yyyy-MM-dd", formatter.getPattern());
        assertEquals(locale, formatter.getLocale());
    }

    @Test
    public void testGetInstance_Cache() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertSame(f1, f2);

        FastDateFormat f3 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"));
        FastDateFormat f4 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"));
        assertSame(f3, f4);

        FastDateFormat f5 = FastDateFormat.getInstance("yyyy-MM-dd", Locale.US);
        FastDateFormat f6 = FastDateFormat.getInstance("yyyy-MM-dd", Locale.US);
        assertSame(f5, f6);

        FastDateFormat f7 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat f8 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertSame(f7, f8);
    }
    
    @Test
    public void testGetInstance_DifferentInstances() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy/MM/dd");
        assertNotSame(f1, f2);

        FastDateFormat f3 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"));
        FastDateFormat f4 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST"));
        assertNotSame(f3, f4);

        FastDateFormat f5 = FastDateFormat.getInstance("yyyy-MM-dd", Locale.US);
        FastDateFormat f6 = FastDateFormat.getInstance("yyyy-MM-dd", Locale.FRANCE);
        assertNotSame(f5, f6);

        FastDateFormat f7 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat f8 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.FRANCE);
        assertNotSame(f7, f8);
    }

    @Test
    public void testGetInstance_NullPattern() {
        try {
            FastDateFormat.getInstance(null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetDateInstance_Style() {
        assertNotNull(FastDateFormat.getDateInstance(DateFormat.FULL));
    }

    @Test
    public void testGetDateInstance_Style_Locale() {
        assertNotNull(FastDateFormat.getDateInstance(DateFormat.LONG, Locale.US));
    }

    @Test
    public void testGetDateInstance_Style_TimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        assertNotNull(FastDateFormat.getDateInstance(DateFormat.MEDIUM, tz));
    }

    @Test
    public void testGetDateInstance_Style_TimeZone_Locale() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Locale locale = Locale.US;
        assertNotNull(FastDateFormat.getDateInstance(DateFormat.SHORT, tz, locale));
    }

    @Test
    public void testGetTimeInstance_Style() {
        assertNotNull(FastDateFormat.getTimeInstance(DateFormat.FULL));
    }

    @Test
    public void testGetTimeInstance_Style_Locale() {
        assertNotNull(FastDateFormat.getTimeInstance(DateFormat.LONG, Locale.US));
    }

    @Test
    public void testGetTimeInstance_Style_TimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        assertNotNull(FastDateFormat.getTimeInstance(DateFormat.MEDIUM, tz));
    }

    @Test
    public void testGetTimeInstance_Style_TimeZone_Locale() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Locale locale = Locale.US;
        assertNotNull(FastDateFormat.getTimeInstance(DateFormat.SHORT, tz, locale));
    }

    @Test
    public void testGetDateTimeInstance_DateStyle_TimeStyle() {
        assertNotNull(FastDateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.LONG));
    }

    @Test
    public void testGetDateTimeInstance_DateStyle_TimeStyle_Locale() {
        assertNotNull(FastDateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM, Locale.US));
    }

    @Test
    public void testGetDateTimeInstance_DateStyle_TimeStyle_TimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        assertNotNull(FastDateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, tz));
    }

    @Test
    public void testGetDateTimeInstance_DateStyle_TimeStyle_TimeZone_Locale() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Locale locale = Locale.US;
        assertNotNull(FastDateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, tz, locale));
    }

    @Test
    public void testFormat_Date() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS Z");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        assertEquals("2023-10-26 14:30:45.123 +0000", formatter.format(date));
    }
    
    @Test
    public void testFormat_Date_USLocale() {
        FastDateFormat formatter = FastDateFormat.getInstance("MM/dd/yyyy hh:mm:ss a z", Locale.US);
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 2, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        // The timezone name depends on the default locale. Using "UTC" as a fallback.
        String expectedSuffix = "AM UTC";
        if (Locale.US.equals(Locale.getDefault())) {
            expectedSuffix = "AM GMT"; // Default for US is often GMT
        }
        assertEquals("10/26/2023 02:30:45 " + expectedSuffix, formatter.format(date));
    }

    @Test
    public void testFormat_Calendar() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("2023-10-26", formatter.format(cal));
    }

    @Test
    public void testFormat_Long() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        long millis = new GregorianCalendar(2023, Calendar.OCTOBER, 26).getTimeInMillis();
        assertEquals("2023-10-26", formatter.format(millis));
    }
    
    @Test
    public void testFormat_StringBuffer_Date() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        Date date = cal.getTime();
        StringBuffer buffer = new StringBuffer();
        formatter.format(date, buffer);
        assertEquals("2023-10-26", buffer.toString());
    }

    @Test
    public void testFormat_StringBuffer_Calendar() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        StringBuffer buffer = new StringBuffer();
        formatter.format(cal, buffer);
        assertEquals("2023-10-26", buffer.toString());
    }

    @Test
    public void testFormat_StringBuffer_Long() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        long millis = new GregorianCalendar(2023, Calendar.OCTOBER, 26).getTimeInMillis();
        StringBuffer buffer = new StringBuffer();
        formatter.format(millis, buffer);
        assertEquals("2023-10-26", buffer.toString());
    }

    @Test
    public void testFormat_Object_Date() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        Date date = cal.getTime();
        StringBuffer buffer = new StringBuffer();
        formatter.format(date, buffer, new FieldPosition(0));
        assertEquals("2023-10-26", buffer.toString());
    }

    @Test
    public void testFormat_Object_Calendar() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        StringBuffer buffer = new StringBuffer();
        formatter.format(cal, buffer, new FieldPosition(0));
        assertEquals("2023-10-26", buffer.toString());
    }

    @Test
    public void testFormat_Object_Long() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        long millis = new GregorianCalendar(2023, Calendar.OCTOBER, 26).getTimeInMillis();
        StringBuffer buffer = new StringBuffer();
        formatter.format(millis, buffer, new FieldPosition(0));
        assertEquals("2023-10-26", buffer.toString());
    }

    @Test
    public void testFormat_Object_Invalid() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        try {
            formatter.format(new Object(), new StringBuffer(), new FieldPosition(0));
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testParseObject_NotSupported() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        Object result = formatter.parseObject("2023-10-26", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testGetPattern() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        assertEquals("yyyy-MM-dd HH:mm:ss", formatter.getPattern());
    }

    @Test
    public void testGetTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        assertEquals(tz, formatter.getTimeZone());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", tz);
        assertTrue(formatter.getTimeZoneOverridesCalendar());
    }
    
    @Test
    public void testGetTimeZoneOverridesCalendar_Default() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        assertFalse(formatter.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetLocale() {
        Locale locale = Locale.US;
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", locale);
        assertEquals(locale, formatter.getLocale());
    }

    @Test
    public void testGetLocale_Default() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals(Locale.getDefault(), formatter.getLocale());
    }

    @Test
    public void testGetMaxLengthEstimate() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS Z");
        // A rough estimate, actual value depends on pattern parsing.
        assertTrue(formatter.getMaxLengthEstimate() > 0); 
    }

    @Test
    public void testEquals() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(f1, f2);

        FastDateFormat f3 = FastDateFormat.getInstance("yyyy/MM/dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertFalse(f1.equals(f3));

        FastDateFormat f4 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST"), Locale.US);
        assertFalse(f1.equals(f4));

        FastDateFormat f5 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.FRANCE);
        assertFalse(f1.equals(f5));
    }

    @Test
    public void testEquals_Null() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertFalse(f1.equals(null));
    }

    @Test
    public void testEquals_DifferentClass() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertFalse(f1.equals("yyyy-MM-dd"));
    }

    @Test
    public void testHashCode() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testToString() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("FastDateFormat[yyyy-MM-dd]", formatter.toString());
    }

    @Test
    public void testFormat_SpecificDate() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy.MM.dd G 'at' HH:mm:ss.SSS Z");
        Calendar cal = new GregorianCalendar(1, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        assertEquals("0001.01.01 AD at 00:00:00.000 +0000", formatter.format(date));
    }
    
    @Test
    public void testFormat_SpecificDate_Midnight() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.DECEMBER, 31, 0, 0, 0);
        Date date = cal.getTime();
        assertEquals("2023-12-31 00:00:00", formatter.format(date));
    }

    @Test
    public void testFormat_SpecificDate_MidnightHour() {
        FastDateFormat formatter = FastDateFormat.getInstance("HH:mm:ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.DECEMBER, 31, 0, 0, 0);
        Date date = cal.getTime();
        assertEquals("00:00:00", formatter.format(date));
    }

    @Test
    public void testFormat_SpecificDate_MidnightHour12() {
        FastDateFormat formatter = FastDateFormat.getInstance("hh:mm:ss a");
        Calendar cal = new GregorianCalendar(2023, Calendar.DECEMBER, 31, 0, 0, 0);
        Date date = cal.getTime();
        assertEquals("12:00:00 AM", formatter.format(date));
    }

    @Test
    public void testFormat_SpecificDate_Midday() {
        FastDateFormat formatter = FastDateFormat.getInstance("HH:mm:ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.DECEMBER, 31, 12, 0, 0);
        Date date = cal.getTime();
        assertEquals("12:00:00", formatter.format(date));
    }
    
    @Test
    public void testFormat_SpecificDate_Midday12() {
        FastDateFormat formatter = FastDateFormat.getInstance("hh:mm:ss a");
        Calendar cal = new GregorianCalendar(2023, Calendar.DECEMBER, 31, 12, 0, 0);
        Date date = cal.getTime();
        assertEquals("12:00:00 PM", formatter.format(date));
    }

    @Test
    public void testFormat_SpecificDate_MaxValues() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.DECEMBER, 31, 23, 59, 59);
        Date date = cal.getTime();
        assertEquals("2023-12-31 23:59:59", formatter.format(date));
    }
    
    @Test
    public void testFormat_YYYY() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("2023", formatter.format(cal));
    }

    @Test
    public void testFormat_YY() {
        FastDateFormat formatter = FastDateFormat.getInstance("yy");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("23", formatter.format(cal));
        cal.set(Calendar.YEAR, 1999);
        assertEquals("99", formatter.format(cal));
    }
    
    @Test
    public void testFormat_M() {
        FastDateFormat formatter = FastDateFormat.getInstance("M");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26); // October is month 9
        assertEquals("10", formatter.format(cal));
        cal.set(Calendar.MONTH, Calendar.JANUARY); // January is month 0
        assertEquals("1", formatter.format(cal));
    }

    @Test
    public void testFormat_MM() {
        FastDateFormat formatter = FastDateFormat.getInstance("MM");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26); // October is month 9
        assertEquals("10", formatter.format(cal));
        cal.set(Calendar.MONTH, Calendar.JANUARY); // January is month 0
        assertEquals("01", formatter.format(cal));
    }

    @Test
    public void testFormat_MMM() {
        FastDateFormat formatter = FastDateFormat.getInstance("MMM");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("Oct", formatter.format(cal));
    }
    
    @Test
    public void testFormat_MMMM() {
        FastDateFormat formatter = FastDateFormat.getInstance("MMMM");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("October", formatter.format(cal));
    }
    
    @Test
    public void testFormat_d() {
        FastDateFormat formatter = FastDateFormat.getInstance("d");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("26", formatter.format(cal));
        cal.set(Calendar.DAY_OF_MONTH, 5);
        assertEquals("5", formatter.format(cal));
    }

    @Test
    public void testFormat_dd() {
        FastDateFormat formatter = FastDateFormat.getInstance("dd");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("26", formatter.format(cal));
        cal.set(Calendar.DAY_OF_MONTH, 5);
        assertEquals("05", formatter.format(cal));
    }

    @Test
    public void testFormat_E() {
        FastDateFormat formatter = FastDateFormat.getInstance("E");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26); // Thursday
        assertEquals("Thu", formatter.format(cal));
    }
    
    @Test
    public void testFormat_EEEE() {
        FastDateFormat formatter = FastDateFormat.getInstance("EEEE");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26); // Thursday
        assertEquals("Thursday", formatter.format(cal));
    }

    @Test
    public void testFormat_H() {
        FastDateFormat formatter = FastDateFormat.getInstance("H");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 0);
        assertEquals("14", formatter.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 0);
        assertEquals("0", formatter.format(cal));
    }

    @Test
    public void testFormat_HH() {
        FastDateFormat formatter = FastDateFormat.getInstance("HH");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 0);
        assertEquals("14", formatter.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 0);
        assertEquals("00", formatter.format(cal));
    }

    @Test
    public void testFormat_h() {
        FastDateFormat formatter = FastDateFormat.getInstance("h");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 0); // 2 PM
        assertEquals("2", formatter.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 0); // 12 AM
        assertEquals("12", formatter.format(cal));
    }

    @Test
    public void testFormat_hh() {
        FastDateFormat formatter = FastDateFormat.getInstance("hh");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 0); // 2 PM
        assertEquals("02", formatter.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 0); // 12 AM
        assertEquals("12", formatter.format(cal));
    }
    
    @Test
    public void testFormat_m() {
        FastDateFormat formatter = FastDateFormat.getInstance("m");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 0);
        assertEquals("30", formatter.format(cal));
        cal.set(Calendar.MINUTE, 5);
        assertEquals("5", formatter.format(cal));
    }

    @Test
    public void testFormat_mm() {
        FastDateFormat formatter = FastDateFormat.getInstance("mm");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 0);
        assertEquals("30", formatter.format(cal));
        cal.set(Calendar.MINUTE, 5);
        assertEquals("05", formatter.format(cal));
    }

    @Test
    public void testFormat_s() {
        FastDateFormat formatter = FastDateFormat.getInstance("s");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 45);
        assertEquals("45", formatter.format(cal));
        cal.set(Calendar.SECOND, 5);
        assertEquals("5", formatter.format(cal));
    }

    @Test
    public void testFormat_ss() {
        FastDateFormat formatter = FastDateFormat.getInstance("ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 45);
        assertEquals("45", formatter.format(cal));
        cal.set(Calendar.SECOND, 5);
        assertEquals("05", formatter.format(cal));
    }

    @Test
    public void testFormat_S() {
        FastDateFormat formatter = FastDateFormat.getInstance("S");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("123", formatter.format(cal));
        cal.set(Calendar.MILLISECOND, 5);
        assertEquals("5", formatter.format(cal));
    }

    @Test
    public void testFormat_SS() {
        FastDateFormat formatter = FastDateFormat.getInstance("SS");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("123", formatter.format(cal));
        cal.set(Calendar.MILLISECOND, 5);
        assertEquals("05", formatter.format(cal));
    }

    @Test
    public void testFormat_SSS() {
        FastDateFormat formatter = FastDateFormat.getInstance("SSS");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26, 14, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("123", formatter.format(cal));
        cal.set(Calendar.MILLISECOND, 5);
        assertEquals("005", formatter.format(cal));
    }
    
    @Test
    public void testFormat_Z_plus() {
        FastDateFormat formatter = FastDateFormat.getInstance("Z");
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        Calendar cal = new GregorianCalendar(tz);
        assertEquals("+0100", formatter.format(cal));
    }
    
    @Test
    public void testFormat_Z_minus() {
        FastDateFormat formatter = FastDateFormat.getInstance("Z");
        TimeZone tz = TimeZone.getTimeZone("GMT-05:00");
        Calendar cal = new GregorianCalendar(tz);
        assertEquals("-0500", formatter.format(cal));
    }

    @Test
    public void testFormat_ZZ() {
        FastDateFormat formatter = FastDateFormat.getInstance("ZZ");
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        Calendar cal = new GregorianCalendar(tz);
        assertEquals("+01:00", formatter.format(cal));
    }

    @Test
    public void testFormat_ZZZ() {
        FastDateFormat formatter = FastDateFormat.getInstance("ZZZ");
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        Calendar cal = new GregorianCalendar(tz);
        assertEquals("+01:00", formatter.format(cal));
    }
    
    @Test
    public void testFormat_ZZZZ() {
        FastDateFormat formatter = FastDateFormat.getInstance("ZZZZ");
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        Calendar cal = new GregorianCalendar(tz);
        // The exact output of ZZZZ depends on the locale and the TimeZone's display name.
        // For GMT+01:00, it's often "+01:00" or similar.
        // If "GMT+01:00" is expected, it implies a specific locale and timezone name mapping.
        // Based on the reference source, it seems to use the TimeZone's getDisplayName method.
        // For a fixed timezone like GMT+01:00, the display name may vary.
        // For this test, we'll assert a value that is generally consistent.
        // If the bug is in the display name logic, this test might still fail but would
        // indicate a difference in the display name calculation.
        assertEquals("+01:00", formatter.format(cal)); 
    }

    @Test
    public void testFormat_z() {
        FastDateFormat formatter = FastDateFormat.getInstance("z");
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Calendar cal = new GregorianCalendar(tz);
        assertEquals("GMT", formatter.format(cal));
    }

    @Test
    public void testFormat_zzzz() {
        FastDateFormat formatter = FastDateFormat.getInstance("zzzz");
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Calendar cal = new GregorianCalendar(tz);
        assertEquals("Greenwich Mean Time", formatter.format(cal));
    }
    
    @Test
    public void testFormat_escaped_single_quote() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy' 'M''d");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("2023 10'26", formatter.format(cal));
    }

    @Test
    public void testFormat_literal_string() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy 'the' MMMM 'day'");
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("2023 the October day", formatter.format(cal));
    }

    @Test
    public void testFormat_day_of_week_in_month() {
        FastDateFormat formatter = FastDateFormat.getInstance("F");
        // October 2023: 26th is the 4th Thursday.
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("4", formatter.format(cal));
    }

    @Test
    public void testFormat_week_of_year() {
        FastDateFormat formatter = FastDateFormat.getInstance("w");
        // October 26, 2023 is the 43rd week of the year.
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("43", formatter.format(cal));
    }

    @Test
    public void testFormat_week_of_month() {
        FastDateFormat formatter = FastDateFormat.getInstance("W");
        // October 26, 2023 is the 4th week of the month.
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("4", formatter.format(cal));
    }
    
    @Test
    public void testFormat_day_of_year() {
        FastDateFormat formatter = FastDateFormat.getInstance("D");
        // October 26, 2023 is the 299th day of the year.
        Calendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        assertEquals("299", formatter.format(cal));
    }
    
    @Test
    public void testFormat_year_of_era_G() {
        FastDateFormat formatter = FastDateFormat.getInstance("G");
        Calendar cal = new GregorianCalendar(1, Calendar.JANUARY, 1); // 1 AD
        assertEquals("AD", formatter.format(cal));
        cal.set(Calendar.YEAR, -1); // 1 BC
        assertEquals("BC", formatter.format(cal));
    }
}
