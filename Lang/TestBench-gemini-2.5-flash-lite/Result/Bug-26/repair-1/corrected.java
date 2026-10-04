package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateFormatTest {

    // Helper methods to construct objects needed for tests

    // Test for GregorianCalendar constructor error:
    // The error message indicates that GregorianCalendar(int, int, int, int, int, int, int)
    // is not available. The correct constructor for year, month, day, hour, minute, second, millisecond
    // is not directly available in the API outline for GregorianCalendar.
    // However, the source code of FastDateFormat uses GregorianCalendar(TimeZone, Locale)
    // and then sets its time. We will adapt the tests to use this approach.

    @Test
    public void testGetInstance_DefaultPattern() {
        FastDateFormat formatter = FastDateFormat.getInstance();
        assertNotNull(formatter);
        // The default pattern is determined by SimpleDateFormat()
        // which in turn depends on the default locale.
        // We can't hardcode the exact pattern without locale assumption.
        // Let's check for a known common default or rely on its existence.
        // A common default is "M/d/yy h:mm a" or "yyyy-MM-dd HH:mm:ss"
        // Based on the source code's internal logic for 'y', 'M', 'd', 'H', 'm', 's'
        // and the usage of default locale, it's hard to predict a single default.
        // For the purpose of this test, we ensure it's not null and has a pattern.
        assertTrue(formatter.getPattern() != null && !formatter.getPattern().isEmpty());
    }

    @Test
    public void testGetInstance_PatternOnly() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        assertNotNull(formatter);
        assertEquals("yyyy-MM-dd", formatter.getPattern());
    }

    @Test
    public void testGetInstance_PatternAndTimeZone() {
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", gmt);
        assertNotNull(formatter);
        assertEquals("yyyy-MM-dd", formatter.getPattern());
        assertEquals(gmt, formatter.getTimeZone());
    }

    @Test
    public void testGetInstance_PatternAndLocale() {
        Locale fr = Locale.FRENCH;
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", fr);
        assertNotNull(formatter);
        assertEquals("yyyy-MM-dd", formatter.getPattern());
        assertEquals(fr, formatter.getLocale());
    }

    @Test
    public void testGetInstance_PatternTimeZoneAndLocale() {
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        Locale fr = Locale.FRENCH;
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd", gmt, fr);
        assertNotNull(formatter);
        assertEquals("yyyy-MM-dd", formatter.getPattern());
        assertEquals(gmt, formatter.getTimeZone());
        assertEquals(fr, formatter.getLocale());
    }

    @Test
    public void testGetInstance_CachedInstance() {
        FastDateFormat formatter1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat formatter2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertSame(formatter1, formatter2);
    }

    @Test
    public void testGetInstance_DifferentInstance() {
        FastDateFormat formatter1 = FastDateFormat.getInstance("yyyy-MM-dd");
        FastDateFormat formatter2 = FastDateFormat.getInstance("MM/dd/yyyy");
        assertNotSame(formatter1, formatter2);
    }

    @Test
    public void testGetDateInstance_Full() {
        FastDateFormat formatter = FastDateFormat.getDateInstance(DateFormat.FULL);
        assertNotNull(formatter);
        // The default pattern for FULL can vary by locale.
        // We'll check for non-null and a reasonable pattern structure.
        assertTrue(formatter.getPattern().contains("yyyy"));
        assertTrue(formatter.getPattern().contains("MMMM"));
        assertTrue(formatter.getPattern().contains("d"));
    }

    @Test
    public void testGetDateInstance_Long() {
        FastDateFormat formatter = FastDateFormat.getDateInstance(DateFormat.LONG);
        assertNotNull(formatter);
        assertTrue(formatter.getPattern().contains("yyyy"));
        assertTrue(formatter.getPattern().contains("MMM"));
        assertTrue(formatter.getPattern().contains("d"));
    }

    @Test
    public void testGetDateInstance_Medium() {
        FastDateFormat formatter = FastDateFormat.getDateInstance(DateFormat.MEDIUM);
        assertNotNull(formatter);
        assertTrue(formatter.getPattern().contains("yy"));
        assertTrue(formatter.getPattern().contains("MMM"));
        assertTrue(formatter.getPattern().contains("d"));
    }

    @Test
    public void testGetDateInstance_Short() {
        FastDateFormat formatter = FastDateFormat.getDateInstance(DateFormat.SHORT);
        assertNotNull(formatter);
        assertTrue(formatter.getPattern().contains("yy"));
        assertTrue(formatter.getPattern().contains("M"));
        assertTrue(formatter.getPattern().contains("d"));
    }

    @Test
    public void testGetDateInstance_WithLocale() {
        Locale frenchLocale = Locale.FRENCH;
        FastDateFormat formatter = FastDateFormat.getDateInstance(DateFormat.LONG, frenchLocale);
        assertNotNull(formatter);
        assertEquals(frenchLocale, formatter.getLocale());
    }

    @Test
    public void testGetDateInstance_WithTimeZone() {
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        FastDateFormat formatter = FastDateFormat.getDateInstance(DateFormat.LONG, gmt);
        assertNotNull(formatter);
        assertEquals(gmt, formatter.getTimeZone());
    }

    @Test
    public void testGetDateInstance_WithTimeZoneAndLocale() {
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        Locale frenchLocale = Locale.FRENCH;
        FastDateFormat formatter = FastDateFormat.getDateInstance(DateFormat.LONG, gmt, frenchLocale);
        assertNotNull(formatter);
        assertEquals(gmt, formatter.getTimeZone());
        assertEquals(frenchLocale, formatter.getLocale());
    }

    @Test
    public void testGetTimeInstance_Full() {
        FastDateFormat formatter = FastDateFormat.getTimeInstance(DateFormat.FULL);
        assertNotNull(formatter);
        // Checking for general components of a full time pattern
        assertTrue(formatter.getPattern().contains("h") || formatter.getPattern().contains("H"));
        assertTrue(formatter.getPattern().contains("m"));
        assertTrue(formatter.getPattern().contains("s"));
        assertTrue(formatter.getPattern().contains("a") || formatter.getPattern().contains("z") || formatter.getPattern().contains("Z"));
    }

    @Test
    public void testGetTimeInstance_Long() {
        FastDateFormat formatter = FastDateFormat.getTimeInstance(DateFormat.LONG);
        assertNotNull(formatter);
        assertTrue(formatter.getPattern().contains("h") || formatter.getPattern().contains("H"));
        assertTrue(formatter.getPattern().contains("m"));
        assertTrue(formatter.getPattern().contains("s"));
    }

    @Test
    public void testGetTimeInstance_Medium() {
        FastDateFormat formatter = FastDateFormat.getTimeInstance(DateFormat.MEDIUM);
        assertNotNull(formatter);
        assertTrue(formatter.getPattern().contains("h") || formatter.getPattern().contains("H"));
        assertTrue(formatter.getPattern().contains("m"));
    }

    @Test
    public void testGetTimeInstance_Short() {
        FastDateFormat formatter = FastDateFormat.getTimeInstance(DateFormat.SHORT);
        assertNotNull(formatter);
        assertTrue(formatter.getPattern().contains("h") || formatter.getPattern().contains("H"));
        assertTrue(formatter.getPattern().contains("m"));
    }

    @Test
    public void testGetTimeInstance_WithLocale() {
        Locale germanLocale = Locale.GERMAN;
        FastDateFormat formatter = FastDateFormat.getTimeInstance(DateFormat.LONG, germanLocale);
        assertNotNull(formatter);
        assertEquals(germanLocale, formatter.getLocale());
    }

    @Test
    public void testGetTimeInstance_WithTimeZone() {
        TimeZone pst = TimeZone.getTimeZone("PST");
        FastDateFormat formatter = FastDateFormat.getTimeInstance(DateFormat.LONG, pst);
        assertNotNull(formatter);
        assertEquals(pst, formatter.getTimeZone());
    }

    @Test
    public void testGetTimeInstance_WithTimeZoneAndLocale() {
        TimeZone pst = TimeZone.getTimeZone("PST");
        Locale germanLocale = Locale.GERMAN;
        FastDateFormat formatter = FastDateFormat.getTimeInstance(DateFormat.LONG, pst, germanLocale);
        assertNotNull(formatter);
        assertEquals(pst, formatter.getTimeZone());
        assertEquals(germanLocale, formatter.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_Full_Full() {
        FastDateFormat formatter = FastDateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
        assertNotNull(formatter);
        assertTrue(formatter.getPattern().contains("yyyy"));
        assertTrue(formatter.getPattern().contains("MMMM"));
        assertTrue(formatter.getPattern().contains("d"));
        assertTrue(formatter.getPattern().contains("h") || formatter.getPattern().contains("H"));
        assertTrue(formatter.getPattern().contains("m"));
        assertTrue(formatter.getPattern().contains("s"));
        assertTrue(formatter.getPattern().contains("z") || formatter.getPattern().contains("Z"));
    }

    @Test
    public void testGetDateTimeInstance_Short_Short() {
        FastDateFormat formatter = FastDateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        assertNotNull(formatter);
        assertTrue(formatter.getPattern().contains("yy"));
        assertTrue(formatter.getPattern().contains("M"));
        assertTrue(formatter.getPattern().contains("d"));
        assertTrue(formatter.getPattern().contains("h") || formatter.getPattern().contains("H"));
        assertTrue(formatter.getPattern().contains("m"));
    }

    @Test
    public void testGetDateTimeInstance_WithLocale() {
        Locale spanishLocale = Locale.forLanguageTag("es");
        FastDateFormat formatter = FastDateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, spanishLocale);
        assertNotNull(formatter);
        assertEquals(spanishLocale, formatter.getLocale());
    }

    @Test
    public void testGetDateTimeInstance_WithTimeZone() {
        TimeZone cst = TimeZone.getTimeZone("CST");
        FastDateFormat formatter = FastDateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, cst);
        assertNotNull(formatter);
        assertEquals(cst, formatter.getTimeZone());
    }

    @Test
    public void testGetDateTimeInstance_WithTimeZoneAndLocale() {
        TimeZone cst = TimeZone.getTimeZone("CST");
        Locale spanishLocale = Locale.forLanguageTag("es");
        FastDateFormat formatter = FastDateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, cst, spanishLocale);
        assertNotNull(formatter);
        assertEquals(cst, formatter.getTimeZone());
        assertEquals(spanishLocale, formatter.getLocale());
    }

    @Test
    public void testFormat_Date() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        // Use GregorianCalendar(TimeZone, Locale) and then setTime
        Calendar cal = new GregorianCalendar(TimeZone.getDefault(), Locale.getDefault());
        cal.set(2023, Calendar.JANUARY, 25, 10, 30, 15);
        cal.set(Calendar.MILLISECOND, 0); // Ensure milliseconds are zeroed for exact comparison
        Date date = cal.getTime();
        assertEquals("2023-01-25 10:30:15", formatter.format(date));
    }

    @Test
    public void testFormat_LongMillis() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = new GregorianCalendar(TimeZone.getDefault(), Locale.getDefault());
        cal.set(2023, Calendar.FEBRUARY, 14, 21, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals("2023-02-14 21:00:00", formatter.format(cal.getTimeInMillis()));
    }

    @Test
    public void testFormat_Calendar() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = new GregorianCalendar(TimeZone.getDefault(), Locale.getDefault());
        cal.set(2024, Calendar.DECEMBER, 31, 23, 59, 59);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals("2024-12-31 23:59:59", formatter.format(cal));
    }

    @Test
    public void testFormat_Calendar_TimeZoneOverride() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("GMT"), Locale.US);
        TimeZone pst = TimeZone.getTimeZone("PST");
        // Create Calendar with default settings, then set timezone and time
        Calendar cal = new GregorianCalendar(TimeZone.getDefault(), Locale.getDefault());
        cal.setTimeZone(pst); // PST is UTC-8
        cal.set(2023, Calendar.JANUARY, 25, 10, 30, 15); // 10:30 PST
        cal.set(Calendar.MILLISECOND, 0);
        // 10:30 PST (UTC-8) is 18:30 UTC (GMT)
        assertEquals("2023-01-25 18:30:15", formatter.format(cal));
    }

    @Test
    public void testFormat_Date_TimeZoneOverride() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("GMT"), Locale.US);
        TimeZone pst = TimeZone.getTimeZone("PST");
        Calendar cal = new GregorianCalendar(TimeZone.getDefault(), Locale.getDefault());
        cal.setTimeZone(pst);
        cal.set(2023, Calendar.JANUARY, 25, 10, 30, 15);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime(); // Date object represents milliseconds since epoch, independent of timezone
        // The formatter applies its own GMT timezone.
        assertEquals("2023-01-25 18:30:15", formatter.format(date));
    }

    @Test
    public void testFormat_Milliseconds_TimeZoneOverride() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("GMT"), Locale.US);
        TimeZone pst = TimeZone.getTimeZone("PST");
        Calendar cal = new GregorianCalendar(TimeZone.getDefault(), Locale.getDefault());
        cal.setTimeZone(pst);
        cal.set(2023, Calendar.JANUARY, 25, 10, 30, 15);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals("2023-01-25 18:30:15", formatter.format(cal.getTimeInMillis()));
    }

    @Test
    public void testFormat_ToString() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("FastDateFormat[yyyy-MM-dd]", formatter.toString());
    }

    @Test
    public void testFormat_MaxLengthEstimate() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSSZ");
        // Estimate based on pattern: 4(y)+1(-)+2(M)+1(-)+2(d)+1( )+2(H)+1(:)+2(m)+1(:)+2(s)+1(. )+3(S)+1(Z) = 24
        // The internal calculation might be more precise. Let's check if it's at least the sum of lengths of pattern characters.
        assertTrue(formatter.getMaxLengthEstimate() >= "yyyy-MM-dd HH:mm:ss.SSSZ".length());
    }

    @Test
    public void testFormat_Year_yyyy() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("2023", formatter.format(cal));
    }

    @Test
    public void testFormat_Year_yy() {
        FastDateFormat formatter = FastDateFormat.getInstance("yy");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("23", formatter.format(cal));
    }

    @Test
    public void testFormat_Month_MMMM() {
        FastDateFormat formatter = FastDateFormat.getInstance("MMMM");
        Calendar cal = new GregorianCalendar(2023, Calendar.MARCH, 1); // March is month 2 (0-indexed)
        assertEquals("March", formatter.format(cal));
    }

    @Test
    public void testFormat_Month_MMM() {
        FastDateFormat formatter = FastDateFormat.getInstance("MMM");
        Calendar cal = new GregorianCalendar(2023, Calendar.APRIL, 1); // April is month 3
        assertEquals("Apr", formatter.format(cal));
    }

    @Test
    public void testFormat_Month_MM() {
        FastDateFormat formatter = FastDateFormat.getInstance("MM");
        Calendar cal = new GregorianCalendar(2023, Calendar.MAY, 1); // May is month 4
        assertEquals("05", formatter.format(cal));
    }

    @Test
    public void testFormat_DayOfMonth_dd() {
        FastDateFormat formatter = FastDateFormat.getInstance("dd");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 5);
        assertEquals("05", formatter.format(cal));
    }

    @Test
    public void testFormat_DayOfMonth_d() {
        FastDateFormat formatter = FastDateFormat.getInstance("d");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 5);
        assertEquals("5", formatter.format(cal));
    }

    @Test
    public void testFormat_Hour_HH() { // Hour in day (0..23)
        FastDateFormat formatter = FastDateFormat.getInstance("HH");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 14, 0, 0);
        assertEquals("14", formatter.format(cal));
    }

    @Test
    public void testFormat_Hour_hh() { // Hour in am/pm (1..12)
        FastDateFormat formatter = FastDateFormat.getInstance("hh");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 14, 0, 0); // 2 PM
        assertEquals("02", formatter.format(cal));
    }

    @Test
    public void testFormat_Hour_k() { // hour in day (1..24)
        FastDateFormat formatter = FastDateFormat.getInstance("k");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0); // Midnight
        assertEquals("24", formatter.format(cal));
    }

    @Test
    public void testFormat_Hour_K() { // hour in am/pm (0..11)
        FastDateFormat formatter = FastDateFormat.getInstance("K");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0); // Midnight
        assertEquals("0", formatter.format(cal));
    }

    @Test
    public void testFormat_Minute_mm() {
        FastDateFormat formatter = FastDateFormat.getInstance("mm");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 10, 7, 0);
        assertEquals("07", formatter.format(cal));
    }

    @Test
    public void testFormat_Second_ss() {
        FastDateFormat formatter = FastDateFormat.getInstance("ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 10, 30, 5);
        assertEquals("05", formatter.format(cal));
    }

    @Test
    public void testFormat_Millisecond_SSS() {
        FastDateFormat formatter = FastDateFormat.getInstance("SSS");
        // Correcting GregorianCalendar constructor call
        Calendar cal = new GregorianCalendar(TimeZone.getDefault(), Locale.getDefault());
        cal.set(2023, Calendar.JANUARY, 1, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 123);
        assertEquals("123", formatter.format(cal));
    }

    @Test
    public void testFormat_TimeZone_Z_RFC822_colon() {
        FastDateFormat formatter = FastDateFormat.getInstance("Z");
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"), Locale.US); // PST is GMT-8
        cal.set(2023, Calendar.MARCH, 10, 12, 0, 0); // PST is GMT-8, DST not active yet in March
        assertEquals("-0800", formatter.format(cal));
    }

    @Test
    public void testFormat_TimeZone_ZZ_ISO8601_colon() {
        FastDateFormat formatter = FastDateFormat.getInstance("ZZ");
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"), Locale.US); // PST is GMT-8
        cal.set(2023, Calendar.MARCH, 10, 12, 0, 0); // PST is GMT-8, DST not active yet in March
        assertEquals("-08:00", formatter.format(cal));
    }

    @Test
    public void testFormat_TimeZone_Z_RFC822_no_colon() {
        // Test with 'Z' pattern which implies no colon
        FastDateFormat formatter = FastDateFormat.getInstance("Z");
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"), Locale.US); // CET is GMT+1
        cal.set(2023, Calendar.JULY, 1, 12, 0, 0); // CET is GMT+1, DST active
        assertEquals("+0100", formatter.format(cal)); // Expected format is +HHMM
    }

    @Test
    public void testFormat_Literal_SingleQuote() {
        FastDateFormat formatter = FastDateFormat.getInstance("'Year:' yyyy");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("Year: 2023", formatter.format(cal));
    }

    @Test
    public void testFormat_Literal_DoubleQuote() {
        // '' in pattern becomes a single literal '
        FastDateFormat formatter = FastDateFormat.getInstance("''yyyy''");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("'2023'", formatter.format(cal));
    }

    @Test
    public void testFormat_Era_G() {
        FastDateFormat formatter = FastDateFormat.getInstance("G");
        Calendar cal = new GregorianCalendar(1, Calendar.JANUARY, 1); // AD (year 1)
        assertEquals("AD", formatter.format(cal));
        cal.set(-1, Calendar.JANUARY, 1); // BC (year -1)
        assertEquals("BC", formatter.format(cal));
    }

    @Test
    public void testFormat_DayOfWeek_EEE() {
        FastDateFormat formatter = FastDateFormat.getInstance("EEE");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 25); // Wednesday
        assertEquals("Wed", formatter.format(cal));
    }

    @Test
    public void testFormat_DayOfWeek_EEEE() {
        FastDateFormat formatter = FastDateFormat.getInstance("EEEE");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 25); // Wednesday
        assertEquals("Wednesday", formatter.format(cal));
    }

    @Test
    public void testFormat_DayOfYear_D() {
        FastDateFormat formatter = FastDateFormat.getInstance("D");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1);
        assertEquals("1", formatter.format(cal));
        cal.set(2023, Calendar.JANUARY, 31);
        assertEquals("31", formatter.format(cal));
        cal.set(2023, Calendar.FEBRUARY, 1);
        assertEquals("32", formatter.format(cal));
    }

    @Test
    public void testFormat_DayOfWeekInMonth_F() {
        FastDateFormat formatter = FastDateFormat.getInstance("F");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1); // 1st Sunday is Jan 1st. So Jan 4th is the first Wednesday.
        cal.set(2023, Calendar.JANUARY, 4); // Wednesday
        assertEquals("1", formatter.format(cal));
        cal.set(2023, Calendar.JANUARY, 11); // Second Wednesday
        assertEquals("2", formatter.format(cal));
    }

    @Test
    public void testFormat_WeekOfYear_w() {
        FastDateFormat formatter = FastDateFormat.getInstance("w");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1); // Sunday, Week 1
        assertEquals("1", formatter.format(cal));
        cal.set(2023, Calendar.DECEMBER, 31); // Sunday, Week 52
        assertEquals("52", formatter.format(cal));
    }

    @Test
    public void testFormat_WeekOfMonth_W() {
        FastDateFormat formatter = FastDateFormat.getInstance("W");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1); // 1st Sunday of Jan
        assertEquals("1", formatter.format(cal));
        cal.set(2023, Calendar.JANUARY, 7); // Still 1st Sunday
        assertEquals("1", formatter.format(cal));
        cal.set(2023, Calendar.JANUARY, 8); // 2nd Sunday of Jan
        assertEquals("2", formatter.format(cal));
    }

    @Test
    public void testFormat_AmPm_a() {
        FastDateFormat formatter = FastDateFormat.getInstance("a");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 10, 30, 0); // AM
        assertEquals("AM", formatter.format(cal));
        cal.set(2023, Calendar.JANUARY, 1, 22, 30, 0); // PM
        assertEquals("PM", formatter.format(cal));
    }

    @Test
    public void testFormat_TimeZoneName_z() {
        FastDateFormat formatter = FastDateFormat.getInstance("z");
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
        cal.set(2023, Calendar.JANUARY, 1); // PST
        assertEquals("PST", formatter.format(cal));
        cal.set(2023, Calendar.APRIL, 1); // PDT
        assertEquals("PDT", formatter.format(cal));
    }

    @Test
    public void testFormat_TimeZoneName_zzzz() {
        FastDateFormat formatter = FastDateFormat.getInstance("zzzz");
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
        cal.set(2023, Calendar.JANUARY, 1); // Pacific Standard Time
        assertEquals("Pacific Standard Time", formatter.format(cal));
        cal.set(2023, Calendar.APRIL, 1); // Pacific Daylight Time
        assertEquals("Pacific Daylight Time", formatter.format(cal));
    }

    @Test
    public void testFormat_ComplexPattern() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 25, 10, 30, 15);
        cal.set(Calendar.MILLISECOND, 456);
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        assertEquals("2023-01-25T10:30:15.456+0000", formatter.format(cal));
    }

    @Test
    public void testFormat_ZeroPaddingEdgeCase() {
        FastDateFormat formatter = FastDateFormat.getInstance("dd/MM/yyyy HH:mm");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 0, 0);
        assertEquals("01/01/2023 00:00", formatter.format(cal));
    }

    @Test
    public void testFormat_MaxValues() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        Calendar cal = new GregorianCalendar(2023, Calendar.DECEMBER, 31, 23, 59, 59);
        assertEquals("2023-12-31 23:59:59", formatter.format(cal));
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
    public void testGetMaxLengthEstimate_VariesWithPattern() {
        FastDateFormat formatter1 = FastDateFormat.getInstance("yyyyMMdd");
        FastDateFormat formatter2 = FastDateFormat.getInstance("yyyy-MM-dd");
        assertTrue(formatter1.getMaxLengthEstimate() < formatter2.getMaxLengthEstimate());
    }

    @Test
    public void testEquals_SamePatternTimeZoneLocale() {
        FastDateFormat formatter1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat formatter2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(formatter1, formatter2);
        assertEquals(formatter1.hashCode(), formatter2.hashCode());
    }

    @Test
    public void testEquals_DifferentPattern() {
        FastDateFormat formatter1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat formatter2 = FastDateFormat.getInstance("MM/dd/yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        assertNotEquals(formatter1, formatter2);
        assertNotEquals(formatter1.hashCode(), formatter2.hashCode());
    }

    @Test
    public void testEquals_DifferentTimeZone() {
        FastDateFormat formatter1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat formatter2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("PST"), Locale.US);
        assertNotEquals(formatter1, formatter2);
        assertNotEquals(formatter1.hashCode(), formatter2.hashCode());
    }

    @Test
    public void testEquals_DifferentLocale() {
        FastDateFormat formatter1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateFormat formatter2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.FRANCE);
        assertNotEquals(formatter1, formatter2);
        assertNotEquals(formatter1.hashCode(), formatter2.hashCode());
    }

    @Test
    public void testEquals_DifferentTimeZoneForcedFlag() {
        // getInstance(pattern, timeZone) implies mTimeZoneForced is true.
        // equals checks mTimeZoneForced.
        FastDateFormat formatter1 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"));
        FastDateFormat formatter2 = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("GMT"));
        assertEquals(formatter1, formatter2);
        assertEquals(formatter1.hashCode(), formatter2.hashCode());
    }

    @Test
    public void testTimeZoneDisplay_Standard() {
        TimeZone tz = TimeZone.getTimeZone("PST"); // Pacific Standard Time
        String name = FastDateFormat.getTimeZoneDisplay(tz, false, TimeZone.LONG, Locale.US);
        assertEquals("Pacific Standard Time", name);
    }

    @Test
    public void testTimeZoneDisplay_Daylight() {
        TimeZone tz = TimeZone.getTimeZone("PDT"); // Pacific Daylight Time
        String name = FastDateFormat.getTimeZoneDisplay(tz, true, TimeZone.LONG, Locale.US);
        assertEquals("Pacific Daylight Time", name);
    }

    @Test
    public void testTimeZoneDisplay_Short() {
        TimeZone tz = TimeZone.getTimeZone("EST"); // Eastern Standard Time
        String name = FastDateFormat.getTimeZoneDisplay(tz, false, TimeZone.SHORT, Locale.US);
        assertEquals("EST", name);
    }

    @Test
    public void testTimeZoneDisplay_Short_Daylight() {
        TimeZone tz = TimeZone.getTimeZone("EDT"); // Eastern Daylight Time
        String name = FastDateFormat.getTimeZoneDisplay(tz, true, TimeZone.SHORT, Locale.US);
        assertEquals("EDT", name);
    }

    @Test
    public void testDefaultPatternInitialization() {
        // Call getInstance without args to ensure default pattern is initialized.
        FastDateFormat formatter1 = FastDateFormat.getInstance();
        // Call again to ensure it's cached and doesn't change default pattern
        FastDateFormat formatter2 = FastDateFormat.getInstance();
        assertNotNull(formatter1);
        assertNotNull(formatter2);
        assertEquals(formatter1.getPattern(), formatter2.getPattern());
    }

    @Test
    public void testParseToken_SingleCharacterLiteral() {
        // We cannot instantiate FastDateFormat directly as it's protected.
        // We will mock its behavior by creating a minimal instance.
        // This is a workaround for testing private methods.
        FastDateFormat fdf = FastDateFormat.getInstance("''");
        int[] indexRef = {0};
        // Accessing private method parseToken directly would require reflection, which is disallowed.
        // We will test the public method which uses parseToken internally.
        // Test case for literal string:
        String pattern = "'literal'";
        FastDateFormat formatter = FastDateFormat.getInstance(pattern);
        assertEquals(pattern, formatter.getPattern());
    }

    @Test
    public void testParseToken_MultiCharacterLiteral() {
        String pattern = "'literal string'";
        FastDateFormat formatter = FastDateFormat.getInstance(pattern);
        assertEquals(pattern, formatter.getPattern());
    }

    @Test
    public void testParseToken_MixedLiteralAndPattern() {
        String pattern = "'hello'yyyyMMdd";
        FastDateFormat formatter = FastDateFormat.getInstance(pattern);
        assertEquals(pattern, formatter.getPattern());
    }

    @Test
    public void testSelectNumberRule_Unpadded() {
        FastDateFormat fdf = FastDateFormat.getInstance("M"); // Pattern for testing UnpaddedNumberField
        // To test selectNumberRule, we need to instantiate FastDateFormat directly or use a method that calls it.
        // Since selectNumberRule is protected, we'll use a workaround by calling getInstance with a pattern that requires it.
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1); // Month is 0
        // We expect "1" for the month number.
        assertEquals("1", fdf.format(cal));
    }

    @Test
    public void testSelectNumberRule_TwoDigit() {
        FastDateFormat fdf = FastDateFormat.getInstance("MM"); // Pattern for testing TwoDigitNumberField
        Calendar cal = new GregorianCalendar(2023, Calendar.FEBRUARY, 1); // Month is 1
        // We expect "02" for the month number.
        assertEquals("02", fdf.format(cal));
    }

    @Test
    public void testSelectNumberRule_Padded() {
        // Testing PaddedNumberField with 'yyyy' pattern where padding is implicit.
        // For 'yyyy', size is 4.
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy");
        Calendar cal = new GregorianCalendar(123, Calendar.JANUARY, 1); // Year 123
        assertEquals("0123", fdf.format(cal)); // Padded to 4 digits.
    }

    @Test
    public void testSelectNumberRule_PaddedWithMoreDigits() {
        // Testing PaddedNumberField with 'yyyyy' pattern where padding is explicit.
        FastDateFormat fdf = FastDateFormat.getInstance("yyyyy");
        Calendar cal = new GregorianCalendar(123, Calendar.JANUARY, 1); // Year 123
        assertEquals("00123", fdf.format(cal)); // Padded to 5 digits.
    }

    @Test
    public void testTextField_Long() {
        FastDateFormat formatter = FastDateFormat.getInstance("MMMM");
        Calendar cal = new GregorianCalendar(2023, Calendar.JULY, 1); // July is month 6
        assertEquals("July", formatter.format(cal));
    }

    @Test
    public void testTextField_Short() {
        FastDateFormat formatter = FastDateFormat.getInstance("MMM");
        Calendar cal = new GregorianCalendar(2023, Calendar.AUGUST, 1); // August is month 7
        assertEquals("Aug", formatter.format(cal));
    }

    @Test
    public void testTwelveHourField_ZeroHour() {
        FastDateFormat formatter = FastDateFormat.getInstance("hh");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0); // Midnight
        // 12-hour format for midnight is 12 AM
        assertEquals("12", formatter.format(cal));
    }

    @Test
    public void testTwentyFourHourField_ZeroHour() {
        FastDateFormat formatter = FastDateFormat.getInstance("HH");
        Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 1, 0, 0, 0); // Midnight
        // 24-hour format for midnight is 00
        assertEquals("00", formatter.format(cal));
    }

    @Test
    public void testTimeZoneNumberRule_Colon() {
        FastDateFormat formatter = FastDateFormat.getInstance("ZZ"); // ZZ implies colon
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"), Locale.US); // EST is UTC-5
        cal.set(2023, Calendar.JANUARY, 1, 12, 0, 0);
        assertEquals("-05:00", formatter.format(cal));

        cal.set(2023, Calendar.APRIL, 1, 12, 0, 0); // EDT is UTC-4
        assertEquals("-04:00", formatter.format(cal));
    }

    @Test
    public void testTimeZoneNumberRule_NoColon() {
        FastDateFormat formatter = FastDateFormat.getInstance("Z"); // Z implies no colon
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("Asia/Tokyo"), Locale.US); // JST is UTC+9
        cal.set(2023, Calendar.JANUARY, 1, 12, 0, 0);
        assertEquals("+0900", formatter.format(cal));
    }

    @Test
    public void testTimeZoneNameRule_ForcedStandard() {
        TimeZone fixedTz = TimeZone.getTimeZone("GMT");
        FastDateFormat formatter = FastDateFormat.getInstance("z", fixedTz, Locale.US);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"), Locale.US); // Use a different timezone for calendar
        cal.set(2023, Calendar.JANUARY, 1);
        // Since timezone is forced to GMT, it should display GMT regardless of calendar's timezone
        assertEquals("GMT", formatter.format(cal));
    }

    @Test
    public void testTimeZoneNameRule_ForcedDaylight() {
        TimeZone fixedTz = TimeZone.getTimeZone("GMT");
        FastDateFormat formatter = FastDateFormat.getInstance("z", fixedTz, Locale.US);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/London"), Locale.US); // London observes DST
        cal.set(2023, Calendar.APRIL, 1); // DST is active in London
        // The formatter is forced to GMT, so it should display GMT regardless of DST
        assertEquals("GMT", formatter.format(cal));
    }

    @Test
    public void testTimeZoneNameRule_NonForcedStandard() {
        FastDateFormat formatter = FastDateFormat.getInstance("z", null, Locale.US); // Non-forced
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
        cal.set(2023, Calendar.JANUARY, 1); // PST
        assertEquals("PST", formatter.format(cal));
    }

    @Test
    public void testTimeZoneNameRule_NonForcedDaylight() {
        FastDateFormat formatter = FastDateFormat.getInstance("z", null, Locale.US); // Non-forced
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
        cal.set(2023, Calendar.APRIL, 1); // PDT
        assertEquals("PDT", formatter.format(cal));
    }

    @Test
    public void testEquals_Self() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals(formatter, formatter);
    }

    @Test
    public void testEquals_Null() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        assertNotNull(formatter); // Ensure formatter is not null before comparing
        assertNotEquals(formatter, null);
    }

    @Test
    public void testEquals_DifferentClass() {
        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd");
        assertNotEquals(formatter, new SimpleDateFormat("yyyy-MM-dd"));
    }
}
