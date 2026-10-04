package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import java.util.Set;
import java.util.TimeZone;

public class ZoneInfoCompilerTest {

    @Test
    public void testVerboseDefaultIsFalse() {
        assertFalse(ZoneInfoCompiler.verbose());
    }

    @Test
    public void testParseYearMinimum() {
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("minimum", 0));
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("min", 0));
    }

    @Test
    public void testParseYearMaximum() {
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("maximum", 0));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("max", 0));
    }

    @Test
    public void testParseYearOnly() {
        assertEquals(2000, ZoneInfoCompiler.parseYear("only", 2000));
    }

    @Test
    public void testParseYearNumeric() {
        assertEquals(1999, ZoneInfoCompiler.parseYear("1999", 0));
    }

    @Test
    public void testParseMonth() {
        assertEquals(1, ZoneInfoCompiler.parseMonth("1"));
        assertEquals(1, ZoneInfoCompiler.parseMonth("Jan"));
        assertEquals(12, ZoneInfoCompiler.parseMonth("12"));
        assertEquals(12, ZoneInfoCompiler.parseMonth("Dec"));
    }

    @Test
    public void testParseDayOfWeek() {
        assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("1"));
        assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("Mon"));
        assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("7"));
        assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("Sun"));
    }

    @Test
    public void testParseOptionalDash() {
        assertNull(ZoneInfoCompiler.parseOptional("-"));
    }

    @Test
    public void testParseOptionalValue() {
        assertEquals("Test", ZoneInfoCompiler.parseOptional("Test"));
    }

    @Test
    public void testParseTimePositive() throws Exception {
        assertEquals(3600000, ZoneInfoCompiler.parseTime("01:00"));
        assertEquals(3661000, ZoneInfoCompiler.parseTime("01:01:01"));
        assertEquals(3661123, ZoneInfoCompiler.parseTime("01:01:01.123"));
    }

    @Test
    public void testParseTimeNegative() throws Exception {
        assertEquals(-3600000, ZoneInfoCompiler.parseTime("-01:00"));
        assertEquals(-3661000, ZoneInfoCompiler.parseTime("-01:01:01"));
        assertEquals(-3661123, ZoneInfoCompiler.parseTime("-01:01:01.123"));
    }

    @Test
    public void testParseTimeMidnight() throws Exception {
        assertEquals(0, ZoneInfoCompiler.parseTime("00:00"));
        assertEquals(0, ZoneInfoCompiler.parseTime("00:00:00"));
        assertEquals(0, ZoneInfoCompiler.parseTime("00:00:00.000"));
    }
    
    @Test
    public void testParseTimeMax() throws Exception {
        assertEquals(86399999, ZoneInfoCompiler.parseTime("23:59:59.999"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseTimeInvalid() throws Exception {
        ZoneInfoCompiler.parseTime("invalid");
    }

    @Test
    public void testParseZoneCharStandard() {
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('s'));
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('S'));
    }

    @Test
    public void testParseZoneCharUTC() {
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('u'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('U'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('g'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('G'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('z'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('Z'));
    }

    @Test
    public void testParseZoneCharWall() {
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('w'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('W'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('x')); // default case
    }

    @Test
    public void testDateTimeOfYearWithTokenizerMonthDay() {
        // Test case for month and day
        StringTokenizer st = new StringTokenizer("1 Jan");
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);
        assertEquals(1, dt.iMonthOfYear);
        assertEquals(1, dt.iDayOfMonth);
        assertEquals(0, dt.iDayOfWeek);
        assertFalse(dt.iAdvanceDayOfWeek);
        assertEquals(0, dt.iMillisOfDay);
        assertEquals('w', dt.iZoneChar);
    }
    
    @Test
    public void testDateTimeOfYearWithTokenizerLastDayOfWeek() {
        // Test case for "last DayOfWeek"
        StringTokenizer st = new StringTokenizer("last Sun");
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);
        assertEquals(0, dt.iDayOfMonth); // 'last' implies dayOfMonth is not directly specified
        assertEquals(7, dt.iDayOfWeek);
        assertFalse(dt.iAdvanceDayOfWeek);
    }

    @Test
    public void testDateTimeOfYearWithTokenizerDayOfWeekGTE() {
        // Test case for DayOfWeek >= day
        StringTokenizer st = new StringTokenizer("Mon>=15");
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);
        assertEquals(1, dt.iDayOfWeek); // Monday
        assertEquals(15, dt.iDayOfMonth);
        assertTrue(dt.iAdvanceDayOfWeek);
    }

    @Test
    public void testDateTimeOfYearWithTokenizerDayOfWeekLTE() {
        // Test case for DayOfWeek <= day
        StringTokenizer st = new StringTokenizer("Tue<=20");
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);
        assertEquals(2, dt.iDayOfWeek); // Tuesday
        assertEquals(20, dt.iDayOfMonth);
        assertFalse(dt.iAdvanceDayOfWeek);
    }

    @Test
    public void testDateTimeOfYearWithTokenizerTime() {
        // Test case for time with milliseconds
        StringTokenizer st = new StringTokenizer("1 1 02:30:45.123");
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);
        assertEquals(7365123, dt.iMillisOfDay); // 2*3600*1000 + 30*60*1000 + 45*1000 + 123
        assertEquals('w', dt.iZoneChar);
    }
    
    @Test
    public void testDateTimeOfYearWithTokenizerZoneChar() {
        // Test case for zone character
        StringTokenizer st = new StringTokenizer("1 1 02:30:45.123 Z");
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);
        assertEquals('u', dt.iZoneChar);
    }

    @Test
    public void testDateTimeOfYearWithTokenizer2400() {
        // Test case for "24:00" which means midnight of the next day
        StringTokenizer st = new StringTokenizer("Dec last Sun 24:00");
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);
        // December + 1 day should roll over to January 1st of the next year.
        // The 'last Sun' part is tricky with 24:00.
        // The code seems to handle the day advance.
        // Let's check the expected outcome based on the code's logic.
        // If day is -1, dayOfWeek is parsed. If '24:00' is encountered, LocalDate is created and day is advanced.
        // For 'last Sun', LocalDate(2001, 12, -1).plusMonths(1) would be LocalDate(2002, 1, 1).
        // advance would be true, so month=1, day=1.
        // dayOfWeek from Sun(7) becomes (7-1+1)%7 + 1 = 1 (Monday).
        LocalDate date = new LocalDate(2001, 12, 31); // Last day of year to properly handle 'last Sun'
        date = date.plusDays(1); // This simulates the rollover from 24:00
        assertEquals(date.getMonthOfYear(), dt.iMonthOfYear);
        assertEquals(date.getDayOfMonth(), dt.iDayOfMonth);
        // The dayOfWeek calculation with 24:00 is complex. The code advances it.
        // If dayOfWeek was 7 (Sunday), advanceDayOfWeek true -> dayOfWeek becomes 1.
        // But if it's 'last Sun', the dayOfWeek should be derived from it.
        // The code: dayOfWeek = ((dayOfWeek - 1 + 1) % 7) + 1; -- this advances the dayOfWeek.
        // So if it was Sunday (7), it becomes Monday (1).
        assertEquals(1, dt.iDayOfWeek);
        assertTrue(dt.iAdvanceDayOfWeek);
        assertEquals(0, dt.iMillisOfDay); // 24:00 implies start of next day
    }
    
    @Test
    public void testDateTimeOfYearWithTokenizer2400NextDay() {
        // Test case for "24:00" with a specific date
        StringTokenizer st = new StringTokenizer("Jan 15 24:00");
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);
        // Jan 15 24:00 means Jan 16 00:00
        assertEquals(1, dt.iMonthOfYear);
        assertEquals(16, dt.iDayOfMonth); // Day advances to 16th
        assertEquals(0, dt.iDayOfWeek); // Day of week is not specified when day is specified
        assertFalse(dt.iAdvanceDayOfWeek); // Advance day of week is false when day is specified
        assertEquals(0, dt.iMillisOfDay);
    }

    @Test
    public void testDateTimeOfYearAddRecurring() {
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        // Using a valid day name and date for tokenizer
        StringTokenizer st = new StringTokenizer("1 Jan Mon");
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);
        dt.addRecurring(builder, "TestName", 3600000, 1990, 2000);
        // No assertion needed, just check if it throws exceptions.
    }

    @Test
    public void testDateTimeOfYearAddCutover() {
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        // Using a valid day name and date for tokenizer
        StringTokenizer st = new StringTokenizer("1 Jan Mon");
        ZoneInfoCompiler.DateTimeOfYear dt = new ZoneInfoCompiler.DateTimeOfYear(st);
        dt.addCutover(builder, 2000);
        // No assertion needed, just check if it throws exceptions.
    }
    
    @Test
    public void testCompileWithNoSources() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        Map<String, DateTimeZone> zones = compiler.compile(null, null);
        assertTrue(zones.isEmpty());
    }

    @Test
    public void testCompileWithEmptySources() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        File[] sources = new File[0];
        Map<String, DateTimeZone> zones = compiler.compile(null, sources);
        assertTrue(zones.isEmpty());
    }
    
    @Test
    public void testStaticHelpers() {
        assertNotNull(ZoneInfoCompiler.getStartOfYear());
        assertNotNull(ZoneInfoCompiler.getLenientISOChronology());
        assertSame(ZoneInfoCompiler.getStartOfYear(), ZoneInfoCompiler.getStartOfYear());
        assertSame(ZoneInfoCompiler.getLenientISOChronology(), ZoneInfoCompiler.getLenientISOChronology());
    }

    @Test
    public void testTestMethodWithFixedZone() {
        DateTimeZone fixedZone = DateTimeZone.forOffsetMillis(3600000);
        assertTrue(ZoneInfoCompiler.test("Europe/London", fixedZone));
    }
    
    @Test
    public void testTestMethodWithSimpleTransition() {
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        builder.setStandardOffset(0); // UTC
        // Use a valid month and day for addRecurringSavings
        builder.addRecurringSavings("DST", 3600000, 2000, 2000, 'w', 4, 1, 0, false, 0); // Apr 1st, +1hr
        // Use a valid month and day for addCutover
        builder.addCutover(2001, 'w', 10, 1, 0, false, 0); // Oct 1st, revert DST
        DateTimeZone tz = builder.toDateTimeZone("TestZone", true);
        assertTrue(ZoneInfoCompiler.test("TestZone", tz));
    }
    
    @Test
    public void testVerboseMode() {
        ZoneInfoCompiler.verbose(); // Check default
        ZoneInfoCompiler.cVerbose.set(true);
        assertTrue(ZoneInfoCompiler.verbose());
        ZoneInfoCompiler.cVerbose.set(false);
        assertFalse(ZoneInfoCompiler.verbose());
    }
}
