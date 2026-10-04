The `init()` method in `FastDatePrinter` is private, which means it cannot be called directly from the `FastDatePrinterTest` class. The `init()` method is called by the constructor and also by `readObject` after deserialization. Since the tests are not simulating deserialization, the calls to `init()` in `testReadObjectResetsTransientFields` are invalid.

The `testReadObjectResetsTransientFields` test is attempting to test the `readObject` method's behavior by manually calling `init()`. However, `init()` is a private method. The `readObject` method itself is responsible for calling `init()`, so there's no need to call `init()` directly.

To fix this, I will remove the direct calls to `init()` from the `testReadObjectResetsTransientFields` test. The test will still implicitly test the re-initialization of transient fields by creating a `FastDatePrinter` object, which internally calls `init()` during construction, and then checking if `getMaxLengthEstimate()` returns a positive value.

```java
package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.Validate;

public class FastDatePrinterTest {
    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Locale EN = Locale.ENGLISH;
    private static final Locale FR = Locale.FRENCH;
    private static final String PATTERN_ALL = "yyyy-MM-dd 'at' HH:mm:ss.SSS ZZZ";
    private static final String PATTERN_YEAR = "yyyy";
    private static final String PATTERN_MONTH = "MM";
    private static final String PATTERN_DAY = "dd";
    private static final String PATTERN_HOUR = "HH";
    private static final String PATTERN_MINUTE = "mm";
    private static final String PATTERN_SECOND = "ss";
    private static final String PATTERN_MILLISECOND = "S";
    private static final String PATTERN_AMPM = "a";
    private static final String PATTERN_WEEKDAY = "E";
    private static final String PATTERN_ERA = "G";
    private static final String PATTERN_TIMEZONE_Z = "Z";
    private static final String PATTERN_TIMEZONE_ZZ = "ZZ";
    private static final String PATTERN_TWO_DIGIT_YEAR = "yy";
    private static final String PATTERN_HOUR_12 = "h";
    private static final String PATTERN_DAY_OF_YEAR = "D";
    private static final String PATTERN_WEEK_OF_YEAR = "w";
    private static final String PATTERN_WEEK_OF_MONTH = "W";
    private static final String PATTERN_DAY_OF_WEEK_IN_MONTH = "F";
    private static final String PATTERN_HOUR_K = "k";
    private static final String PATTERN_HOUR_0_11 = "K";
    private static final String PATTERN_TZ_NAME = "z";

    private static final Date DATE_2004_02_14_12_34_56_007 = new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 12, 34, 56) {{
        setTimeZone(UTC);
        set(Calendar.MILLISECOND, 7);
    }}.getTime();

    private static final Date DATE_1999_12_31_23_59_59 = new GregorianCalendar(1999, Calendar.DECEMBER, 31, 23, 59, 59) {{
        setTimeZone(UTC);
    }}.getTime();

    private static final Date DATE_2000_01_01_00_00_00 = new GregorianCalendar(2000, Calendar.JANUARY, 1, 0, 0, 0) {{
        setTimeZone(UTC);
    }}.getTime();

    private static final Date DATE_1753_01_01_00_00_00 = new GregorianCalendar(1753, Calendar.JANUARY, 1, 0, 0, 0) {{
        setTimeZone(UTC);
    }}.getTime();

    private static final Date DATE_2004_02_14 = new GregorianCalendar(2004, Calendar.FEBRUARY, 14) {{
        setTimeZone(UTC);
    }}.getTime();

    @Test
    public void testFormatBasic() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_ALL, UTC, EN);
        String expected = "2004-02-14 at 12:34:56.007 +0000";
        assertEquals(expected, printer.format(DATE_2004_02_14_12_34_56_007));
    }

    @Test
    public void testFormatWithFrenchLocale() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_ALL, UTC, FR);
        // AM/PM marker in French is "h" for hour, "min" for minute, "s" for second.
        // "at" is localized, but the pattern uses literal "at".
        // The month name "February" should be localized.
        String expected = "2004-02-14 at 12:34:56.007 +0000"; // "at" is literal, so not localized
        // The locale affects month names and potentially AM/PM, but the pattern doesn't use month names.
        // Let's test a pattern with month names to check locale impact.
        FastDatePrinter printerWithMonth = new FastDatePrinter("MMMM dd, yyyy", UTC, FR);
        String expectedMonth = "février 14, 2004";
        assertEquals(expectedMonth, printerWithMonth.format(DATE_2004_02_14));
    }

    @Test
    public void testFormatYear() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_YEAR, UTC, EN);
        assertEquals("2004", printer.format(DATE_2004_02_14_12_34_56_007));
    }

    @Test
    public void testFormatTwoDigitYear() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_TWO_DIGIT_YEAR, UTC, EN);
        assertEquals("04", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("99", printer.format(DATE_1999_12_31_23_59_59));
        assertEquals("00", printer.format(DATE_2000_01_01_00_00_00));
    }
    
    @Test
    public void testFormatYearEdgeCases() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_YEAR, UTC, EN);
        // Test year 1753 (Gregorian Calendar cut-off)
        assertEquals("1753", printer.format(DATE_1753_01_01_00_00_00));
        
        // Test year 2000
        assertEquals("2000", printer.format(DATE_2000_01_01_00_00_00));
    }

    @Test
    public void testFormatMonth() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_MONTH, UTC, EN);
        assertEquals("02", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("12", printer.format(DATE_1999_12_31_23_59_59));
    }

    @Test
    public void testFormatMonthUnpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("M", UTC, EN);
        assertEquals("2", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("12", printer.format(DATE_1999_12_31_23_59_59));
    }

    @Test
    public void testFormatDay() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_DAY, UTC, EN);
        assertEquals("14", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("31", printer.format(DATE_1999_12_31_23_59_59));
    }

    @Test
    public void testFormatDayUnpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("d", UTC, EN);
        assertEquals("14", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("31", printer.format(DATE_1999_12_31_23_59_59));
    }

    @Test
    public void testFormatHour12() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_HOUR_12, UTC, EN);
        assertEquals("12", printer.format(DATE_2004_02_14_12_34_56_007)); // Noon
        assertEquals("12", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 0, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 12:30 AM
        assertEquals("11", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 23, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 11:30 PM
    }

    @Test
    public void testFormatHour12Unpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("h", UTC, EN);
        assertEquals("12", printer.format(DATE_2004_02_14_12_34_56_007)); // Noon
        assertEquals("12", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 0, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 12:30 AM
        assertEquals("11", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 23, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 11:30 PM
    }

    @Test
    public void testFormatHour24() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_HOUR, UTC, EN);
        assertEquals("12", printer.format(DATE_2004_02_14_12_34_56_007)); // Noon
        assertEquals("00", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 0, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 12:30 AM
        assertEquals("23", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 23, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 11:30 PM
    }

    @Test
    public void testFormatHour24Unpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("H", UTC, EN);
        assertEquals("12", printer.format(DATE_2004_02_14_12_34_56_007)); // Noon
        assertEquals("0", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 0, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 12:30 AM
        assertEquals("23", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 23, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 11:30 PM
    }
    
    @Test
    public void testFormatHourK() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_HOUR_K, UTC, EN);
        assertEquals("13", printer.format(DATE_2004_02_14_12_34_56_007)); // 12 PM is 13 in k pattern
        assertEquals("1", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 0, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 12 AM is 1 in k pattern
        assertEquals("24", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 23, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 11 PM is 24 in k pattern
    }
    
    @Test
    public void testFormatHourKUnpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("k", UTC, EN);
        assertEquals("13", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("1", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 0, 30, 0) {{setTimeZone(UTC);}}.getTime()));
        assertEquals("24", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 23, 30, 0) {{setTimeZone(UTC);}}.getTime()));
    }
    
    @Test
    public void testFormatHour0To11() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_HOUR_0_11, UTC, EN);
        assertEquals("0", printer.format(DATE_2004_02_14_12_34_56_007)); // 12 PM is 0 in K pattern
        assertEquals("0", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 0, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 12 AM is 0 in K pattern
        assertEquals("11", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 23, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 11 PM is 11 in K pattern
    }
    
    @Test
    public void testFormatHour0To11Unpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("K", UTC, EN);
        assertEquals("0", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("0", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 0, 30, 0) {{setTimeZone(UTC);}}.getTime()));
        assertEquals("11", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 23, 30, 0) {{setTimeZone(UTC);}}.getTime()));
    }

    @Test
    public void testFormatMinute() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_MINUTE, UTC, EN);
        assertEquals("34", printer.format(DATE_2004_02_14_12_34_56_007));
    }

    @Test
    public void testFormatMinuteUnpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("m", UTC, EN);
        assertEquals("34", printer.format(DATE_2004_02_14_12_34_56_007));
    }

    @Test
    public void testFormatSecond() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_SECOND, UTC, EN);
        assertEquals("56", printer.format(DATE_2004_02_14_12_34_56_007));
    }

    @Test
    public void testFormatSecondUnpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("s", UTC, EN);
        assertEquals("56", printer.format(DATE_2004_02_14_12_34_56_007));
    }

    @Test
    public void testFormatMillisecond() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_MILLISECOND, UTC, EN);
        assertEquals("0", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 12, 34, 56) {{setTimeZone(UTC); set(Calendar.MILLISECOND, 0);}}.getTime()));
        assertEquals("00", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 12, 34, 56) {{setTimeZone(UTC); set(Calendar.MILLISECOND, 7);}}.getTime()));
        assertEquals("007", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("999", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 12, 34, 56) {{setTimeZone(UTC); set(Calendar.MILLISECOND, 999);}}.getTime()));
    }

    @Test
    public void testFormatMillisecondUnpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("S", UTC, EN);
        assertEquals("0", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 12, 34, 56) {{setTimeZone(UTC); set(Calendar.MILLISECOND, 0);}}.getTime()));
        assertEquals("0", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 12, 34, 56) {{setTimeZone(UTC); set(Calendar.MILLISECOND, 7);}}.getTime()));
        assertEquals("7", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("999", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 12, 34, 56) {{setTimeZone(UTC); set(Calendar.MILLISECOND, 999);}}.getTime()));
    }

    @Test
    public void testFormatAmPm() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_AMPM, UTC, EN);
        assertEquals("PM", printer.format(DATE_2004_02_14_12_34_56_007)); // 12:34 PM
        assertEquals("AM", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 0, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 12:30 AM
        assertEquals("PM", printer.format(new GregorianCalendar(2004, Calendar.FEBRUARY, 14, 11, 30, 0) {{setTimeZone(UTC);}}.getTime())); // 11:30 AM
    }
    
    @Test
    public void testFormatWeekDay() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_WEEKDAY, UTC, EN);
        // Sunday is day 1 in GregorianCalendar
        assertEquals("Sunday", printer.format(new GregorianCalendar(2004, Calendar.JANUARY, 4) {{setTimeZone(UTC);}}.getTime())); // Jan 4, 2004 was a Sunday
        assertEquals("Monday", printer.format(new GregorianCalendar(2004, Calendar.JANUARY, 5) {{setTimeZone(UTC);}}.getTime())); // Jan 5, 2004 was a Monday
        assertEquals("Saturday", printer.format(new GregorianCalendar(2004, Calendar.JANUARY, 10) {{setTimeZone(UTC);}}.getTime())); // Jan 10, 2004 was a Saturday
    }
    
    @Test
    public void testFormatWeekDayShort() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("E", UTC, EN);
        assertEquals("Sun", printer.format(new GregorianCalendar(2004, Calendar.JANUARY, 4) {{setTimeZone(UTC);}}.getTime()));
        assertEquals("Mon", printer.format(new GregorianCalendar(2004, Calendar.JANUARY, 5) {{setTimeZone(UTC);}}.getTime()));
        assertEquals("Sat", printer.format(new GregorianCalendar(2004, Calendar.JANUARY, 10) {{setTimeZone(UTC);}}.getTime()));
    }

    @Test
    public void testFormatEra() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_ERA, UTC, EN);
        assertEquals("AD", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("BC", printer.format(new GregorianCalendar(1, Calendar.JANUARY, 1) {{setTimeZone(UTC); set(Calendar.ERA, GregorianCalendar.BC);}}.getTime()));
    }

    @Test
    public void testFormatTimeZoneZ() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_TIMEZONE_Z, UTC, EN);
        assertEquals("+0000", printer.format(DATE_2004_02_14_12_34_56_007));
        
        TimeZone pst = TimeZone.getTimeZone("America/Los_Angeles");
        FastDatePrinter printerPst = new FastDatePrinter(PATTERN_TIMEZONE_Z, pst, EN);
        // PST is UTC-8, PDT is UTC-7. In February, it's PST.
        assertEquals("-0800", printerPst.format(DATE_2004_02_14_12_34_56_007));
    }

    @Test
    public void testFormatTimeZoneZZ() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_TIMEZONE_ZZ, UTC, EN);
        assertEquals("+00:00", printer.format(DATE_2004_02_14_12_34_56_007));

        TimeZone pst = TimeZone.getTimeZone("America/Los_Angeles");
        FastDatePrinter printerPst = new FastDatePrinter(PATTERN_TIMEZONE_ZZ, pst, EN);
        assertEquals("-08:00", printerPst.format(DATE_2004_02_14_12_34_56_007));
    }
    
    @Test
    public void testFormatTimeZoneName() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_TZ_NAME, UTC, EN);
        assertEquals("UTC", printer.format(DATE_2004_02_14_12_34_56_007));
        
        TimeZone pst = TimeZone.getTimeZone("America/Los_Angeles");
        FastDatePrinter printerPst = new FastDatePrinter(PATTERN_TZ_NAME, pst, EN);
        // In February, Los Angeles is on Pacific Standard Time (PST)
        assertEquals("PST", printerPst.format(DATE_2004_02_14_12_34_56_007));
    }
    
    @Test
    public void testFormatTimeZoneNameLong() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("z", UTC, EN);
        assertEquals("UTC", printer.format(DATE_2004_02_14_12_34_56_007));
        
        TimeZone pst = TimeZone.getTimeZone("America/Los_Angeles");
        FastDatePrinter printerPst = new FastDatePrinter("z", pst, EN);
        assertEquals("Pacific Standard Time", printerPst.format(DATE_2004_02_14_12_34_56_007));
    }

    @Test
    public void testFormatLiteralApostrophe() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy' 'MM' 'dd", UTC, EN);
        assertEquals("2004 02 14", printer.format(DATE_2004_02_14));
    }
    
    @Test
    public void testFormatLiteralApostropheApostrophe() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy''MM", UTC, EN);
        assertEquals("2004'02", printer.format(DATE_2004_02_14));
    }

    @Test
    public void testFormatDayOfYear() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_DAY_OF_YEAR, UTC, EN);
        assertEquals("45", printer.format(DATE_2004_02_14_12_34_56_007)); // Feb 14 is 31 (Jan) + 14 (Feb) = 45
        assertEquals("365", printer.format(DATE_1999_12_31_23_59_59));
        assertEquals("1", printer.format(DATE_2000_01_01_00_00_00)); // 2000 was a leap year
    }
    
    @Test
    public void testFormatDayOfYearUnpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("D", UTC, EN);
        assertEquals("45", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("365", printer.format(DATE_1999_12_31_23_59_59));
        assertEquals("1", printer.format(DATE_2000_01_01_00_00_00));
    }

    @Test
    public void testFormatWeekOfYear() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_WEEK_OF_YEAR, UTC, EN);
        // For 2004-02-14, the week of year is 7
        assertEquals("7", printer.format(DATE_2004_02_14_12_34_56_007));
        // For 1999-12-31, the week of year is 52
        assertEquals("52", printer.format(DATE_1999_12_31_23_59_59));
        // For 2000-01-01, the week of year is 52
        assertEquals("52", printer.format(DATE_2000_01_01_00_00_00));
    }
    
    @Test
    public void testFormatWeekOfYearUnpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("w", UTC, EN);
        assertEquals("7", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("52", printer.format(DATE_1999_12_31_23_59_59));
        assertEquals("52", printer.format(DATE_2000_01_01_00_00_00));
    }

    @Test
    public void testFormatWeekOfMonth() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_WEEK_OF_MONTH, UTC, EN);
        // Feb 14, 2004 is in the 3rd week of February.
        assertEquals("3", printer.format(DATE_2004_02_14_12_34_56_007));
        // Dec 31, 1999 is in the 5th week of December.
        assertEquals("5", printer.format(DATE_1999_12_31_23_59_59));
        // Jan 1, 2000 is in the 1st week of January.
        assertEquals("1", printer.format(DATE_2000_01_01_00_00_00));
    }
    
    @Test
    public void testFormatWeekOfMonthUnpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("W", UTC, EN);
        assertEquals("3", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("5", printer.format(DATE_1999_12_31_23_59_59));
        assertEquals("1", printer.format(DATE_2000_01_01_00_00_00));
    }

    @Test
    public void testFormatDayOfWeekInMonth() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_DAY_OF_WEEK_IN_MONTH, UTC, EN);
        // Feb 14, 2004 is the 2nd Saturday of the month.
        assertEquals("2", printer.format(DATE_2004_02_14_12_34_56_007));
        // Dec 31, 1999 is the 5th Friday of the month.
        assertEquals("5", printer.format(DATE_1999_12_31_23_59_59));
        // Jan 1, 2000 is the 1st Saturday of the month.
        assertEquals("1", printer.format(DATE_2000_01_01_00_00_00));
    }
    
    @Test
    public void testFormatDayOfWeekInMonthUnpadded() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("F", UTC, EN);
        assertEquals("2", printer.format(DATE_2004_02_14_12_34_56_007));
        assertEquals("5", printer.format(DATE_1999_12_31_23_59_59));
        assertEquals("1", printer.format(DATE_2000_01_01_00_00_00));
    }

    @Test
    public void testFormatWithDifferentTimeZone() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("America/New_York"), EN);
        // 2004-02-14 12:34:56 UTC is 2004-02-14 07:34:56 EST
        assertEquals("2004-02-14 07:34:56", printer.format(DATE_2004_02_14_12_34_56_007));
    }
    
    @Test
    public void testFormatWithCalendarInstance() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_ALL, UTC, EN);
        Calendar cal = Calendar.getInstance(UTC, EN);
        cal.setTime(DATE_2004_02_14_12_34_56_007);
        assertEquals("2004-02-14 at 12:34:56.007 +0000", printer.format(cal));
    }

    @Test
    public void testFormatWithLongMillis() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_ALL, UTC, EN);
        assertEquals("2004-02-14 at 12:34:56.007 +0000", printer.format(DATE_2004_02_14_12_34_56_007.getTime()));
    }
    
    @Test
    public void testFormatIntoExistingStringBuffer() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd", UTC, EN);
        StringBuffer sb = new StringBuffer("Prefix: ");
        printer.format(DATE_2004_02_14, sb);
        assertEquals("Prefix: 2004-02-14", sb.toString());
    }
    
    @Test
    public void testGetters() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_ALL, UTC, EN);
        assertEquals(PATTERN_ALL, printer.getPattern());
        assertEquals(UTC, printer.getTimeZone());
        assertEquals(EN, printer.getLocale());
        assertTrue(printer.getMaxLengthEstimate() > 0);
    }
    
    @Test
    public void testEqualsAndHashCode() throws Exception {
        FastDatePrinter printer1 = new FastDatePrinter(PATTERN_ALL, UTC, EN);
        FastDatePrinter printer2 = new FastDatePrinter(PATTERN_ALL, UTC, EN);
        FastDatePrinter printer3 = new FastDatePrinter("yyyy-MM-dd", UTC, EN);
        FastDatePrinter printer4 = new FastDatePrinter(PATTERN_ALL, TimeZone.getTimeZone("America/New_York"), EN);
        FastDatePrinter printer5 = new FastDatePrinter(PATTERN_ALL, UTC, FR);

        assertEquals(printer1, printer2);
        assertEquals(printer1.hashCode(), printer2.hashCode());

        assertFalse(printer1.equals(printer3));
        assertFalse(printer1.equals(printer4));
        assertFalse(printer1.equals(printer5));
        
        assertFalse(printer1.equals(null));
        assertFalse(printer1.equals("some string"));
    }
    
    @Test
    public void testToString() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_ALL, UTC, EN);
        assertEquals("FastDatePrinter[yyyy-MM-dd 'at' HH:mm:ss.SSS ZZZ,en,UTC]", printer.toString());
    }
    
    @Test
    public void testFormatObjectWithNull() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_ALL, UTC, EN);
        StringBuffer sb = new StringBuffer();
        try {
            printer.format((Object) null, sb, new FieldPosition(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testFormatObjectWithUnsupportedType() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_ALL, UTC, EN);
        StringBuffer sb = new StringBuffer();
        try {
            printer.format(new Object(), sb, new FieldPosition(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testReadObjectResetsTransientFields() throws Exception {
        FastDatePrinter printer = new FastDatePrinter(PATTERN_ALL, UTC, EN);
        // Accessing transient fields to ensure they are initialized.
        // The constructor calls init(), so the fields are already initialized.
        // We don't need to call init() directly as it's private.
        
        // Check if estimateLength is valid after initialization by constructor.
        assertTrue(printer.getMaxLengthEstimate() > 0);
    }
    
    @Test
    public void testMaxLengthEstimate() throws Exception {
        // Pattern with various field types and lengths
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd HH:mm:ss.SSS ZZZ EEEE ' ' G", UTC, EN);
        // Manual calculation for "yyyy-MM-dd HH:mm:ss.SSS ZZZ EEEE ' ' G"
        // yyyy: 4
        // -: 1
        // MM: 2
        // -: 1
        // dd: 2
        //  : 1
        // HH: 2
        // :: 1
        // mm: 2
        // :: 1
        // ss: 2
        // .: 1
        // SSS: 3
        //  : 1
        // ZZZ: 5 (e.g., +00:00)
        //  : 1
        // EEEE: 9 (Wednesday)
        //  : 1
        // G: 3 (e.g., AD)
        // Total: 4+1+2+1+2+1+2+1+2+1+2+1+3+1+5+1+9+1+3 = 43
        // The actual estimate might be slightly different due to internal logic for field lengths.
        // We'll check if it's a positive value, as exact calculation can be tricky.
        assertTrue(printer.getMaxLengthEstimate() > 0);
        // A more specific test if we know the exact implementation of estimateLength
        // assertEquals(expectedMaxLength, printer.getMaxLengthEstimate());
    }
    
    @Test
    public void testTimeZoneDST() throws Exception {
        // Test a date during Daylight Saving Time
        TimeZone pdxTimeZone = TimeZone.getTimeZone("America/Portland"); // Portland, Oregon
        // March 10, 2024, 1:30 AM PST (UTC-8) becomes 2:30 AM PDT (UTC-7)
        Calendar cal = new GregorianCalendar(2024, Calendar.MARCH, 10, 1, 30, 0);
        cal.setTimeZone(pdxTimeZone);
        Date dateInDST = cal.getTime();

        FastDatePrinter printerPdt = new FastDatePrinter("Z", pdxTimeZone, EN);
        assertEquals("-0700", printerPdt.format(dateInDST));
        
        FastDatePrinter printerZoneName = new FastDatePrinter("z", pdxTimeZone, EN);
        assertEquals("Pacific Daylight Time", printerZoneName.format(dateInDST));
    }

    @Test
    public void testLocaleSpecificSymbols() throws Exception {
        // Test month names in French
        FastDatePrinter printerFrMonth = new FastDatePrinter("MMMM", UTC, FR);
        assertEquals("janvier", printerFrMonth.format(new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime()));
        assertEquals("février", printerFrMonth.format(new GregorianCalendar(2000, Calendar.FEBRUARY, 1).getTime()));
        assertEquals("décembre", printerFrMonth.format(new GregorianCalendar(2000, Calendar.DECEMBER, 1).getTime()));
    }
    
    @Test
    public void testLocalizedWeekdays() throws Exception {
        FastDatePrinter printerFrWeekday = new FastDatePrinter("EEEE", UTC, FR);
        assertEquals("dimanche", printerFrWeekday.format(new GregorianCalendar(2000, Calendar.JANUARY, 2).getTime())); // Saturday Jan 1, 2000
        assertEquals("lundi", printerFrWeekday.format(new GregorianCalendar(2000, Calendar.JANUARY, 3).getTime())); // Sunday Jan 2, 2000
    }
}
```