package org.apache.commons.lang3.time;

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
import org.apache.commons.lang3.Validate;

public class FastDateFormatTest {

    // Constants for testing
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final Locale EN_US = Locale.US;
    private static final Locale FR_FR = Locale.FRANCE;

    @Test
    public void testGetInstance_NoArgs() {
        FastDateFormat format = FastDateFormat.getInstance();
        assertNotNull(format);
        assertEquals(getDefaultPattern(), format.getPattern());
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
        assertEquals(Locale.getDefault(), format.getLocale());
        assertFalse(format.getTimeZoneOverridesCalendar());
        // getLocaleForced() is not a public method, removed assertions for it
    }

    @Test
    public void testGetInstance_StringPattern() {
        String pattern = "yyyy-MM-dd";
        FastDateFormat format = FastDateFormat.getInstance(pattern);
        assertNotNull(format);
        assertEquals(pattern, format.getPattern());
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
        assertEquals(Locale.getDefault(), format.getLocale());
        assertFalse(format.getTimeZoneOverridesCalendar());
        // getLocaleForced() is not a public method, removed assertions for it
    }

    @Test
    public void testGetInstance_StringPatternTimeZone() {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        FastDateFormat format = FastDateFormat.getInstance(pattern, GMT);
        assertNotNull(format);
        assertEquals(pattern, format.getPattern());
        assertEquals(GMT, format.getTimeZone());
        assertEquals(Locale.getDefault(), format.getLocale());
        assertTrue(format.getTimeZoneOverridesCalendar());
        // getLocaleForced() is not a public method, removed assertions for it
    }

    @Test
    public void testGetInstance_StringPatternLocale() {
        String pattern = "MM/dd/yyyy";
        FastDateFormat format = FastDateFormat.getInstance(pattern, FR_FR);
        assertNotNull(format);
        assertEquals(pattern, format.getPattern());
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
        assertEquals(FR_FR, format.getLocale());
        assertFalse(format.getTimeZoneOverridesCalendar());
        // getLocaleForced() is not a public method, removed assertions for it
    }

    @Test
    public void testGetInstance_StringPatternTimeZoneLocale() {
        String pattern = "dd.MM.yyyy";
        FastDateFormat format = FastDateFormat.getInstance(pattern, GMT, FR_FR);
        assertNotNull(format);
        assertEquals(pattern, format.getPattern());
        assertEquals(GMT, format.getTimeZone());
        assertEquals(FR_FR, format.getLocale());
        assertTrue(format.getTimeZoneOverridesCalendar());
        // getLocaleForced() is not a public method, removed assertions for it
    }

    @Test
    public void testGetInstance_CachedInstance() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertSame(format1, format2);

        FastDateFormat format3 = FastDateFormat.getInstance("yyyy-MM-dd", GMT);
        FastDateFormat format4 = FastDateFormat.getInstance("yyyy-MM-dd", GMT);
        assertSame(format3, format4);

        FastDateFormat format5 = FastDateFormat.getInstance("yyyy-MM-dd", FR_FR);
        FastDateFormat format6 = FastDateFormat.getInstance("yyyy-MM-dd", FR_FR);
        assertSame(format5, format6);

        FastDateFormat format7 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, FR_FR);
        FastDateFormat format8 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, FR_FR);
        assertSame(format7, format8);
    }

    @Test
    public void testGetInstance_DifferentInstances() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat format2 = FastDateFormat.getInstance("MM-dd-yyyy");
        assertNotEquals(format1, format2); // Use assertNotEquals for objects

        FastDateFormat format3 = FastDateFormat.getInstance("yyyy-MM-dd", GMT);
        FastDateFormat format4 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST"));
        assertNotEquals(format3, format4);

        FastDateFormat format5 = FastDateFormat.getInstance("yyyy-MM-dd", FR_FR);
        FastDateFormat format6 = FastDateFormat.getInstance("yyyy-MM-dd", EN_US);
        assertNotEquals(format5, format6);

        FastDateFormat format7 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, FR_FR);
        FastDateFormat format8 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, EN_US);
        assertNotEquals(format7, format8);

        FastDateFormat format9 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, FR_FR);
        FastDateFormat format10 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST"), FR_FR);
        assertNotEquals(format9, format10);
    }

    @Test
    public void testGetDateInstance_Style() {
        FastDateFormat format = FastDateFormat.getDateInstance(DateFormat.FULL);
        assertNotNull(format);
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
        assertEquals(Locale.getDefault(), format.getLocale());
    }

    @Test
    public void testGetDateInstance_StyleLocale() {
        FastDateFormat format = FastDateFormat.getDateInstance(DateFormat.LONG, FR_FR);
        assertNotNull(format);
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
        assertEquals(FR_FR, format.getLocale());
    }

    @Test
    public void testGetDateInstance_StyleTimeZone() {
        FastDateFormat format = FastDateFormat.getDateInstance(DateFormat.MEDIUM, GMT);
        assertNotNull(format);
        assertEquals(GMT, format.getTimeZone());
        assertEquals(Locale.getDefault(), format.getLocale());
        assertTrue(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetDateInstance_StyleTimeZoneLocale() {
        FastDateFormat format = FastDateFormat.getDateInstance(DateFormat.SHORT, GMT, FR_FR);
        assertNotNull(format);
        assertEquals(GMT, format.getTimeZone());
        assertEquals(FR_FR, format.getLocale());
        assertTrue(format.getTimeZoneOverridesCalendar());
        // getLocaleForced() is not a public method, removed assertions for it
    }

    @Test
    public void testGetTimeInstance_Style() {
        FastDateFormat format = FastDateFormat.getTimeInstance(DateFormat.FULL);
        assertNotNull(format);
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
        assertEquals(Locale.getDefault(), format.getLocale());
    }

    @Test
    public void testGetTimeInstance_StyleLocale() {
        FastDateFormat format = FastDateFormat.getTimeInstance(DateFormat.LONG, FR_FR);
        assertNotNull(format);
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
        assertEquals(FR_FR, format.getLocale());
    }

    @Test
    public void testGetTimeInstance_StyleTimeZone() {
        FastDateFormat format = FastDateFormat.getTimeInstance(DateFormat.MEDIUM, GMT);
        assertNotNull(format);
        assertEquals(GMT, format.getTimeZone());
        assertEquals(Locale.getDefault(), format.getLocale());
        assertTrue(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetTimeInstance_StyleTimeZoneLocale() {
        FastDateFormat format = FastDateFormat.getTimeInstance(DateFormat.SHORT, GMT, FR_FR);
        assertNotNull(format);
        assertEquals(GMT, format.getTimeZone());
        assertEquals(FR_FR, format.getLocale());
        assertTrue(format.getTimeZoneOverridesCalendar());
        // getLocaleForced() is not a public method, removed assertions for it
    }

    @Test
    public void testGetDateTimeInstance_Styles() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.LONG);
        assertNotNull(format);
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
        assertEquals(Locale.getDefault(), format.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_StylesLocale() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, FR_FR);
        assertNotNull(format);
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
        assertEquals(FR_FR, format.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_StylesTimeZone() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM, GMT);
        assertNotNull(format);
        assertEquals(GMT, format.getTimeZone());
        assertEquals(Locale.getDefault(), format.getLocale());
        assertTrue(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetDateTimeInstance_StylesTimeZoneLocale() {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, GMT, FR_FR);
        assertNotNull(format);
        assertEquals(GMT, format.getTimeZone());
        assertEquals(FR_FR, format.getLocale());
        assertTrue(format.getTimeZoneOverridesCalendar());
        // getLocaleForced() is not a public method, removed assertions for it
    }

    @Test
    public void testFormat_Date() {
        Date date = new Date(1234567890123L); // A specific date
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS z");
        String formatted = formatter.format(date);
        assertEquals("1973-11-29 21:33:09.123 GMT", formatted);
    }

    @Test
    public void testFormat_Date_LongPattern() {
        Date date = new Date(1234567890123L); // A specific date
        FastDateFormat formatter = FastDateFormat.getInstance("EEEE, MMMM dd, yyyy 'at' hh:mm:ss a zzz");
        String formatted = formatter.format(date);
        assertEquals("Thursday, November 29, 1973 at 09:33:09 PM GMT", formatted);
    }
    
    @Test
    public void testFormat_Calendar() {
        Calendar cal = Calendar.getInstance(GMT);
        cal.set(2023, Calendar.OCTOBER, 26, 14, 30, 15); // Month is 0-indexed
        cal.set(Calendar.MILLISECOND, 500);
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy/MM/dd HH:mm:ss.SSS");
        String formatted = formatter.format(cal);
        assertEquals("2023/10/26 14:30:15.500", formatted);
    }

    @Test
    public void testFormat_Calendar_TimeZoneOverride() {
        Calendar cal = Calendar.getInstance(); // Default timezone
        cal.set(2023, Calendar.OCTOBER, 26, 14, 30, 15);
        cal.set(Calendar.MILLISECOND, 500);

        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss z", GMT, EN_US); // Forced GMT
        String formatted = formatter.format(cal);
        assertEquals("2023-10-26 06:30:15 GMT", formatted);
    }

    @Test
    public void testFormat_LongMillis() {
        FastDateFormat formatter = FastDateFormat.getInstance("SSS");
        String formatted = formatter.format(123L);
        assertEquals("123", formatted);
    }

    @Test
    public void testFormat_LongMillis_Padded() {
        FastDateFormat formatter = FastDateFormat.getInstance("000");
        String formatted = formatter.format(123L);
        assertEquals("123", formatted);
        formatted = formatter.format(23L);
        assertEquals("023", formatted);
        formatted = formatter.format(3L);
        assertEquals("003", formatted);
    }

    @Test
    public void testFormat_WithLiteralChars() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy '년' MM '월' dd '일'");
        Date date = new Date(1678886400000L); // March 15, 2023
        String formatted = formatter.format(date);
        assertEquals("2023 년 03 월 15 일", formatted);
    }

    @Test
    public void testFormat_TimeZone_RFC822_Z() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZ");
        Calendar cal = new GregorianCalendar(GMT);
        cal.setTimeInMillis(0); // Epoch
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.OCTOBER); // Month is 0-indexed
        cal.set(Calendar.DAY_OF_MONTH, 26);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        
        assertEquals("2023-10-26T10:30:00+0000", formatter.format(cal));

        TimeZone nyTimeZone = TimeZone.getTimeZone("America/New_York");
        cal.setTimeZone(nyTimeZone);
        assertEquals("2023-10-26T06:30:00-0400", formatter.format(cal)); // EDT is UTC-4
    }

    @Test
    public void testFormat_TimeZone_ISO8601_ZZ() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZZ");
        Calendar cal = new GregorianCalendar(GMT);
        cal.setTimeInMillis(0); // Epoch
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 26);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        assertEquals("2023-10-26T10:30:00+00:00", formatter.format(cal));

        TimeZone nyTimeZone = TimeZone.getTimeZone("America/New_York");
        cal.setTimeZone(nyTimeZone);
        assertEquals("2023-10-26T06:30:00-04:00", formatter.format(cal)); // EDT is UTC-4:00
    }

    @Test
    public void testFormat_LiteralSingleQuote() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy 'It''s' MM-dd");
        Date date = new Date(1234567890123L);
        assertEquals("1973 It's 11-29", formatter.format(date));
    }

    @Test
    public void testFormat_TwoDigitYear_EdgeCases() {
        FastDateFormat formatter = FastDateFormat.getInstance("yy");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.YEAR, 2000);
        assertEquals("00", formatter.format(cal));

        cal.set(Calendar.YEAR, 1999);
        assertEquals("99", formatter.format(cal));

        cal.set(Calendar.YEAR, 2009);
        assertEquals("09", formatter.format(cal));
        
        cal.set(Calendar.YEAR, 2049);
        assertEquals("49", formatter.format(cal));

        cal.set(Calendar.YEAR, 2050);
        assertEquals("50", formatter.format(cal));
    }

    @Test
    public void testFormat_TwoDigitYear_Around1900() {
        FastDateFormat formatter = FastDateFormat.getInstance("yy");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.YEAR, 1899);
        assertEquals("99", formatter.format(cal));

        cal.set(Calendar.YEAR, 1900);
        assertEquals("00", formatter.format(cal));

        cal.set(Calendar.YEAR, 1999);
        assertEquals("99", formatter.format(cal));
    }

    @Test
    public void testFormat_ThreeDigitYear() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyy");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.YEAR, 100);
        assertEquals("100", formatter.format(cal));

        cal.set(Calendar.YEAR, 999);
        assertEquals("999", formatter.format(cal));

        cal.set(Calendar.YEAR, 1000);
        assertEquals("1000", formatter.format(cal));
    }

    @Test
    public void testFormat_FourDigitYear() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.YEAR, 10000); 
        assertEquals("10000", formatter.format(cal));
    }

    @Test
    public void testFormat_Month_Text() {
        FastDateFormat formatter = FastDateFormat.getInstance("MMMM");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.MONTH, Calendar.JANUARY);
        assertEquals("January", formatter.format(cal));
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        assertEquals("December", formatter.format(cal));
    }

    @Test
    public void testFormat_Month_ShortText() {
        FastDateFormat formatter = FastDateFormat.getInstance("MMM");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.MONTH, Calendar.JANUARY);
        assertEquals("Jan", formatter.format(cal));
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        assertEquals("Dec", formatter.format(cal));
    }

    @Test
    public void testFormat_Month_TwoDigitNumber() {
        FastDateFormat formatter = FastDateFormat.getInstance("MM");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.MONTH, Calendar.JANUARY);
        assertEquals("01", formatter.format(cal));
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        assertEquals("12", formatter.format(cal));
    }

    @Test
    public void testFormat_Month_UnpaddedNumber() {
        FastDateFormat formatter = FastDateFormat.getInstance("M");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.MONTH, Calendar.JANUARY);
        assertEquals("1", formatter.format(cal));
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        assertEquals("12", formatter.format(cal));
    }
    
    @Test
    public void testFormat_DayOfWeek_Text() {
        FastDateFormat formatter = FastDateFormat.getInstance("EEEE");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        assertEquals("Sunday", formatter.format(cal));
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        assertEquals("Saturday", formatter.format(cal));
    }

    @Test
    public void testFormat_DayOfWeek_ShortText() {
        FastDateFormat formatter = FastDateFormat.getInstance("EEE");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        assertEquals("Sun", formatter.format(cal));
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        assertEquals("Sat", formatter.format(cal));
    }

    @Test
    public void testFormat_AMPM() {
        FastDateFormat formatter = FastDateFormat.getInstance("a");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.AM_PM, Calendar.AM);
        assertEquals("AM", formatter.format(cal));
        cal.set(Calendar.AM_PM, Calendar.PM);
        assertEquals("PM", formatter.format(cal));
    }
    
    @Test
    public void testFormat_Hour12() {
        FastDateFormat formatter = FastDateFormat.getInstance("h");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.HOUR, 0); // Midnight
        assertEquals("12", formatter.format(cal));
        cal.set(Calendar.HOUR, 11); // Noon
        assertEquals("11", formatter.format(cal));
        cal.set(Calendar.HOUR, 12); // Noon + 1 hr
        assertEquals("12", formatter.format(cal));
        cal.set(Calendar.HOUR, 23); // Midnight + 11 hr
        assertEquals("11", formatter.format(cal));
    }

    @Test
    public void testFormat_Hour24() {
        FastDateFormat formatter = FastDateFormat.getInstance("H");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.HOUR_OF_DAY, 0); // Midnight
        assertEquals("0", formatter.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 11); // Morning
        assertEquals("11", formatter.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 12); // Noon
        assertEquals("12", formatter.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 23); // Evening
        assertEquals("23", formatter.format(cal));
    }

    @Test
    public void testFormat_Hour24_k() {
        FastDateFormat formatter = FastDateFormat.getInstance("k");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.HOUR_OF_DAY, 0); // Midnight
        assertEquals("24", formatter.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 11); // Morning
        assertEquals("11", formatter.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 12); // Noon
        assertEquals("12", formatter.format(cal));
        cal.set(Calendar.HOUR_OF_DAY, 23); // Evening
        assertEquals("23", formatter.format(cal));
    }
    
    @Test
    public void testFormat_Minute() {
        FastDateFormat formatter = FastDateFormat.getInstance("m");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.MINUTE, 0);
        assertEquals("0", formatter.format(cal));
        cal.set(Calendar.MINUTE, 59);
        assertEquals("59", formatter.format(cal));
    }

    @Test
    public void testFormat_Second() {
        FastDateFormat formatter = FastDateFormat.getInstance("s");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.SECOND, 0);
        assertEquals("0", formatter.format(cal));
        cal.set(Calendar.SECOND, 59);
        assertEquals("59", formatter.format(cal));
    }

    @Test
    public void testFormat_Millisecond() {
        FastDateFormat formatter = FastDateFormat.getInstance("S");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.MILLISECOND, 0);
        assertEquals("0", formatter.format(cal));
        cal.set(Calendar.MILLISECOND, 999);
        assertEquals("999", formatter.format(cal));
    }
    
    @Test
    public void testFormat_Millisecond_Padded() {
        FastDateFormat formatter = FastDateFormat.getInstance("SSS");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.MILLISECOND, 0);
        assertEquals("000", formatter.format(cal));
        cal.set(Calendar.MILLISECOND, 5);
        assertEquals("005", formatter.format(cal));
        cal.set(Calendar.MILLISECOND, 50);
        assertEquals("050", formatter.format(cal));
        cal.set(Calendar.MILLISECOND, 500);
        assertEquals("500", formatter.format(cal));
    }

    @Test
    public void testFormat_DayOfYear() {
        FastDateFormat formatter = FastDateFormat.getInstance("D");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.DAY_OF_YEAR, 1);
        assertEquals("1", formatter.format(cal));
        cal.set(Calendar.DAY_OF_YEAR, 365);
        assertEquals("365", formatter.format(cal));
    }
    
    @Test
    public void testFormat_DayOfWeekInMonth() {
        FastDateFormat formatter = FastDateFormat.getInstance("F");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
        assertEquals("1", formatter.format(cal));
        cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4);
        assertEquals("4", formatter.format(cal));
    }

    @Test
    public void testFormat_WeekOfYear() {
        FastDateFormat formatter = FastDateFormat.getInstance("w");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.WEEK_OF_YEAR, 1);
        assertEquals("1", formatter.format(cal));
        cal.set(Calendar.WEEK_OF_YEAR, 52);
        assertEquals("52", formatter.format(cal));
    }

    @Test
    public void testFormat_WeekOfMonth() {
        FastDateFormat formatter = FastDateFormat.getInstance("W");
        Calendar cal = new GregorianCalendar(GMT);

        cal.set(Calendar.WEEK_OF_MONTH, 1);
        assertEquals("1", formatter.format(cal));
        cal.set(Calendar.WEEK_OF_MONTH, 4);
        assertEquals("4", formatter.format(cal));
    }

    @Test
    public void testFormat_TimeZoneLongName() {
        FastDateFormat formatter = FastDateFormat.getInstance("z");
        Calendar cal = new GregorianCalendar(GMT);
        cal.set(Calendar.DST_OFFSET, 0); // Ensure no DST for this test

        TimeZone defaultTZ = TimeZone.getDefault();
        if (!defaultTZ.equals(GMT)) {
            cal.setTimeZone(defaultTZ);
            assertFalse(formatter.format(cal).isEmpty());
        } else {
            assertEquals("GMT", formatter.format(cal));
        }
    }

    @Test
    public void testFormat_TimeZoneShortName() {
        FastDateFormat formatter = FastDateFormat.getInstance("z");
        Calendar cal = new GregorianCalendar(GMT);
        cal.set(Calendar.DST_OFFSET, 0);

        assertEquals("GMT", formatter.format(cal));

        TimeZone nyTimeZone = TimeZone.getTimeZone("America/New_York");
        cal.setTimeZone(nyTimeZone);
        cal.set(Calendar.DAY_OF_MONTH, 1); // A date to check DST
        cal.set(Calendar.MONTH, Calendar.JANUARY); // January (EST)
        assertEquals("EST", formatter.format(cal));

        cal.set(Calendar.MONTH, Calendar.JULY); // July (EDT)
        assertEquals("EDT", formatter.format(cal));
    }

    @Test
    public void testFormat_TimeZoneLongName_Forced() {
        FastDateFormat formatter = FastDateFormat.getInstance("z", GMT, EN_US); // Forced GMT
        Calendar cal = new GregorianCalendar(); // Use default timezone for calendar
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 26);
        
        assertEquals("GMT", formatter.format(cal));
    }

    @Test
    public void testFormat_TimeZoneShortName_Forced() {
        FastDateFormat formatter = FastDateFormat.getInstance("z", GMT, EN_US); // Forced GMT
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 26);

        assertEquals("GMT", formatter.format(cal));
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
        String pattern = "yyyy.MM.dd";
        FastDateFormat formatter = FastDateFormat.getInstance(pattern);
        assertEquals(pattern, formatter.getPattern());
    }

    @Test
    public void testGetTimeZone() {
        TimeZone timeZone = TimeZone.getTimeZone("PST");
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", timeZone);
        assertEquals(timeZone, formatter.getTimeZone());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar() {
        FastDateFormat formatterWithOverride = FastDateFormat.getInstance("yyyy-MM-dd", GMT);
        assertTrue(formatterWithOverride.getTimeZoneOverridesCalendar());

        FastDateFormat formatterWithoutOverride = FastDateFormat.getInstance("yyyy-MM-dd");
        assertFalse(formatterWithoutOverride.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetLocale() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", FR_FR);
        assertEquals(FR_FR, formatter.getLocale());
    }

    // getLocaleForced() is not a public method, removed the test for it.
    // assertNotEquals for objects is available in JUnit 4.12+ as assertNotSame or is used in this way: assertFalse(!a.equals(b))
    // For primitives like int, assertNotEquals is available.

    @Test
    public void testGetMaxLengthEstimate() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS Z");
        assertTrue(formatter.getMaxLengthEstimate() >= 22);

        FastDateFormat longMonthFormatter = FastDateFormat.getInstance("MMMM");
        assertTrue(longMonthFormatter.getMaxLengthEstimate() >= 9);
    }

    @Test
    public void testEquals() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals(f1, f2);

        FastDateFormat f3 = FastDateFormat.getInstance("yyyy-MM-dd", GMT);
        FastDateFormat f4 = FastDateFormat.getInstance("yyyy-MM-dd", GMT);
        assertEquals(f3, f4);

        FastDateFormat f5 = FastDateFormat.getInstance("yyyy-MM-dd", FR_FR);
        FastDateFormat f6 = FastDateFormat.getInstance("yyyy-MM-dd", FR_FR);
        assertEquals(f5, f6);

        FastDateFormat f7 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, FR_FR);
        FastDateFormat f8 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, FR_FR);
        assertEquals(f7, f8);

        // Different patterns
        assertNotEquals(f1, f3);

        // Different timezones
        assertNotEquals(f3, FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST")));

        // Different locales
        assertNotEquals(f5, FastDateFormat.getInstance("yyyy-MM-dd", EN_US));

        // Different timezones and locales
        assertNotEquals(f7, FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST"), FR_FR));
        assertNotEquals(f7, FastDateFormat.getInstance("yyyy-MM-dd", GMT, EN_US));
    }

    @Test
    public void testHashCode() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals(f1.hashCode(), f2.hashCode());

        FastDateFormat f3 = FastDateFormat.getInstance("yyyy-MM-dd", GMT);
        FastDateFormat f4 = FastDateFormat.getInstance("yyyy-MM-dd", GMT);
        assertEquals(f3.hashCode(), f4.hashCode());

        FastDateFormat f5 = FastDateFormat.getInstance("yyyy-MM-dd", FR_FR);
        FastDateFormat f6 = FastDateFormat.getInstance("yyyy-MM-dd", FR_FR);
        assertEquals(f5.hashCode(), f6.hashCode());

        FastDateFormat f7 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, FR_FR);
        FastDateFormat f8 = FastDateFormat.getInstance("yyyy-MM-dd", GMT, FR_FR);
        assertEquals(f7.hashCode(), f8.hashCode());

        // Different patterns
        assertNotEquals(f1.hashCode(), f3.hashCode());

        // Different timezones
        assertNotEquals(f3.hashCode(), FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST")).hashCode());

        // Different locales
        assertNotEquals(f5.hashCode(), FastDateFormat.getInstance("yyyy-MM-dd", EN_US).hashCode());

        // Different timezones and locales
        assertNotEquals(f7.hashCode(), FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST"), FR_FR).hashCode());
        assertNotEquals(f7.hashCode(), FastDateFormat.getInstance("yyyy-MM-dd", GMT, EN_US).hashCode());
    }

    @Test
    public void testToString() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("FastDateFormat[yyyy-MM-dd]", formatter.toString());
    }

    // Helper method to get default pattern for testing
    private String getDefaultPattern() {
        return new SimpleDateFormat().toPattern();
    }
}
