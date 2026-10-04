```java
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

public class ZoneInfoCompilerTest {
    @Test
    public void testVerboseDefaultsToFalse() throws Exception {
        assertFalse(ZoneInfoCompiler.verbose());
    }

    @Test
    public void testParseDataFileAcceptsCommentAndBlankLines() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new java.io.StringReader("# note\n\n")));
        assertTrue(compiler.compile(null, null).isEmpty());
    }

    @Test
    public void testCompileWithNoSourcesIsEmpty() throws Exception {
        assertTrue(new ZoneInfoCompiler().compile(null, null).isEmpty());
    }

    @Test
    public void testParseDataFileBuildsFixedZone() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(
                new java.io.StringReader("Zone Test/One 1:00 - TST\n")));
        Map<String, DateTimeZone> zones = compiler.compile(null, null);
        assertEquals(1, zones.size());
        assertEquals("Test/One", zones.get("Test/One").getID());
        assertEquals(3600000, zones.get("Test/One").getOffset(0));
    }

    @Test
    public void testFixedZoneWithZeroOffset() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(
                new java.io.StringReader("Zone Test/Zero 0 - Z\n")));
        DateTimeZone zone = compiler.compile(null, null).get("Test/Zero");
        assertEquals(0, zone.getOffset(0));
        assertEquals("Test/Zero", zone.getID());
    }

    @Test
    public void testZoneContinuationChangesOffsetAfterCutover() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new java.io.StringReader(
                "Zone Test/Chain 0 - A 2000 Jan 1 0\n"
              + "  1:00 - B\n")));
        DateTimeZone zone = compiler.compile(null, null).get("Test/Chain");
        long before = new DateTime(1999, 1, 1, 0, 0,
                ISOChronology.getInstanceUTC()).getMillis();
        long after = new DateTime(2001, 1, 1, 0, 0,
                ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(0, zone.getOffset(before));
        assertEquals(3600000, zone.getOffset(after));
    }

    @Test
    public void testLinkAddsAliasForCompiledZone() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new java.io.StringReader(
                "Zone Test/Base 0 - BASE\nLink Test/Base Test/Alias\n")));
        Map<String, DateTimeZone> zones = compiler.compile(null, null);
        assertEquals(2, zones.size());
        assertSame(zones.get("Test/Base"), zones.get("Test/Alias"));
    }

    @Test
    public void testRuleSetProvidesDaylightSavings() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new java.io.StringReader(
                "Rule R 2000 only - Mar 1 0:00 1:00 D\n"
              + "Zone Test/Rule 0 R R%s\n")));
        DateTimeZone zone = compiler.compile(null, null).get("Test/Rule");
        long instant = new DateTime(2000, 6, 1, 0, 0,
                ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(3600000, zone.getOffset(instant));
    }

    @Test
    public void testCompileRejectsNonexistentSource() throws Exception {
        try {
            new ZoneInfoCompiler().compile(null, new File[] {new File("no-such-zone-file")});
            fail("expected IOException");
        } catch (IOException expected) {
        }
        assertTrue(true);
    }

    @Test
    public void testParseDataFileIgnoresUnknownDirectiveWithoutAddingZone() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new java.io.StringReader("Other data\n")));
        assertTrue(compiler.compile(null, null).isEmpty());
    }

    @Test
    public void testToStringShowsDefaultDateTimeOfYear() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date = new ZoneInfoCompiler.DateTimeOfYear();
        String text = date.toString();
        assertTrue(text.contains("MonthOfYear: 1"));
        assertTrue(text.contains("DayOfMonth: 1"));
        assertTrue(text.contains("MillisOfDay: 0"));
    }

    @Test
    public void testToStringShowsParsedDateTimeOfYear() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Mar 15 2:30"));
        String text = date.toString();
        assertTrue(text.contains("MonthOfYear: 3"));
        assertTrue(text.contains("DayOfMonth: 15"));
        assertTrue(text.contains("MillisOfDay: 9000000"));
    }

    @Test
    public void testToStringShowsLastWeekdayRule() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Oct lastSun 0:00"));
        String text = date.toString();
        assertTrue(text.contains("MonthOfYear: 10"));
        assertTrue(text.contains("DayOfMonth: -1"));
        assertTrue(text.contains("DayOfWeek: 7"));
        assertTrue(text.contains("AdvanceDayOfWeek: false"));
    }

    @Test
    public void testToStringShowsAtOrAfterRule() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Mar Sun>=8 0:00"));
        String text = date.toString();
        assertTrue(text.contains("DayOfMonth: 8"));
        assertTrue(text.contains("DayOfWeek: 7"));
        assertTrue(text.contains("AdvanceDayOfWeek: true"));
    }

    @Test
    public void testToStringShowsAtOrBeforeRule() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Oct Sun<=25 0:00"));
        String text = date.toString();
        assertTrue(text.contains("DayOfMonth: 25"));
        assertTrue(text.contains("DayOfWeek: 7"));
        assertTrue(text.contains("AdvanceDayOfWeek: false"));
    }

    @Test
    public void testToStringParsesNegativeTime() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Mar 1 -1:30"));
        assertTrue(date.toString().contains("MillisOfDay: -5400000"));
    }

    @Test
    public void testToStringMapsStandardTimeSuffix() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Mar 1 2:00s"));
        assertTrue(date.toString().contains("ZoneChar: s"));
    }

    @Test
    public void testToStringMapsUtcSuffix() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Mar 1 2:00g"));
        assertTrue(date.toString().contains("ZoneChar: u"));
    }

    @Test
    public void testToStringDefaultsUnknownSuffixToWallTime() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Mar 1 2:00x"));
        assertTrue(date.toString().contains("ZoneChar: w"));
    }

    @Test
    public void testToStringAdvancesDateAtTwentyFourHundred() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Jan 31 24:00"));
        String text = date.toString();
        assertTrue(text.contains("MonthOfYear: 2"));
        assertTrue(text.contains("DayOfMonth: 1"));
        assertTrue(text.contains("AdvanceDayOfWeek: true"));
        assertTrue(text.contains("MillisOfDay: 0"));
    }

    @Test
    public void testToStringParsesYearEndTwentyFourHundred() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Dec 31 24:00"));
        String text = date.toString();
        assertTrue(text.contains("MonthOfYear: 1"));
        assertTrue(text.contains("DayOfMonth: 1"));
    }

    @Test
    public void testParseDataFileStripsTrailingComment() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(
                new java.io.StringReader("Zone Test/Comment 0 - C # ignored\n")));
        Map<String, DateTimeZone> zones = compiler.compile(null, null);
        assertEquals(1, zones.size());
        assertEquals("Test/Comment", zones.get("Test/Comment").getID());
    }

    @Test
    public void testDateTimeOfYearAddCutoverBuildsFollowingOffset() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Jan 1 0"));
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        builder.setStandardOffset(0);
        builder.setFixedSavings("A", 0);
        date.addCutover(builder, 2000);
        builder.setStandardOffset(3600000);
        builder.setFixedSavings("B", 0);
        DateTimeZone zone = builder.toDateTimeZone("Test/Cutover", true);
        long before = new DateTime(1999, 1, 1, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        long after = new DateTime(2001, 1, 1, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(0, zone.getOffset(before));
        assertEquals(3600000, zone.getOffset(after));
    }

    @Test
    public void testDateTimeOfYearAddRecurringBuildsSeasonalOffset() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear start =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Mar 1 0"));
        ZoneInfoCompiler.DateTimeOfYear end =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Oct 1 0"));
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        builder.setStandardOffset(0);
        start.addRecurring(builder, "DST", 3600000, 2000, 2000);
        end.addRecurring(builder, "STD", 0, 2000, 2000);
        DateTimeZone zone = builder.toDateTimeZone("Test/Recurring", true);
        long winter = new DateTime(2000, 1, 15, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        long summer = new DateTime(2000, 6, 15, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(0, zone.getOffset(winter));
        assertEquals(3600000, zone.getOffset(summer));
    }

    @Test
    public void testDateTimeOfYearAddRecurringSupportsSingleYearBounds() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Jan 1 0"));
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        builder.setStandardOffset(0);
        date.addRecurring(builder, "D", 3600000, 2000, 2000);
        date.addRecurring(builder, "S", 0, 2000, 2000);
        DateTimeZone zone = builder.toDateTimeZone("Test/SingleYear", true);
        long inside = new DateTime(2000, 6, 1, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        long outside = new DateTime(2001, 6, 1, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(0, zone.getOffset(inside));
        assertEquals(0, zone.getOffset(outside));
    }

    @Test
    public void testDateTimeOfYearAddRecurringUsesUtcMode() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Mar 1 0u"));
        String text = date.toString();
        assertTrue(text.contains("ZoneChar: u"));
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        builder.setStandardOffset(0);
        date.addRecurring(builder, "D", 3600000, 2000, 2000);
        date.addRecurring(builder, "S", 0, 2000, 2000);
        assertNotNull(builder.toDateTimeZone("Test/UtcMode", true));
    }

    @Test
    public void testDateTimeOfYearAddCutoverAtYearBoundary() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Dec 31 24:00"));
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        builder.setStandardOffset(0);
        builder.setFixedSavings("A", 0);
        date.addCutover(builder, 2000);
        builder.setStandardOffset(3600000);
        builder.setFixedSavings("B", 0);
        DateTimeZone zone = builder.toDateTimeZone("Test/YearBoundary", true);
        long before = new DateTime(2000, 12, 31, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        long after = new DateTime(2001, 1, 2, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(0, zone.getOffset(before));
        assertEquals(3600000, zone.getOffset(after));
    }

    @Test
    public void testDateTimeOfYearAddRecurringNegativeSavings() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Jun 1 0"));
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        builder.setStandardOffset(0);
        date.addRecurring(builder, "NEG", -3600000, 2000, 2000);
        DateTimeZone zone = builder.toDateTimeZone("Test/NegativeSavings", true);
        long instant = new DateTime(2000, 7, 1, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(-3600000, zone.getOffset(instant));
    }

    @Test
    public void testDateTimeOfYearAddCutoverAtEpochYear() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Jan 1 0"));
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        builder.setStandardOffset(0);
        builder.setFixedSavings("A", 0);
        date.addCutover(builder, 0);
        builder.setStandardOffset(3600000);
        builder.setFixedSavings("B", 0);
        DateTimeZone zone = builder.toDateTimeZone("Test/EpochCutover", true);
        long after = new DateTime(1, 6, 1, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(3600000, zone.getOffset(after));
    }

    @Test
    public void testDateTimeOfYearAddRecurringWithOpenEndedYears() throws Exception {
        ZoneInfoCompiler.DateTimeOfYear date =
                new ZoneInfoCompiler.DateTimeOfYear(new StringTokenizer("Jan 1 0"));
        DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
        builder.setStandardOffset(0);
        date.addRecurring(builder, "D", 3600000, Integer.MIN_VALUE, Integer.MAX_VALUE);
        date.addRecurring(builder, "S", 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        DateTimeZone zone = builder.toDateTimeZone("Test/OpenYears", true);
        long instant = new DateTime(2050, 6, 1, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(0, zone.getOffset(instant));
    }

    @Test
    public void testBuildDateTimeZoneForFixedZoneAndAlias() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new java.io.StringReader(
                "Zone Test/Built 1:00 - B\n")));
        DateTimeZone zone = compiler.compile(null, null).get("Test/Built");
        assertEquals("Test/Built", zone.getID());
        assertEquals(3600000, zone.getOffset(0));
    }

    @Test
    public void testBuildDateTimeZoneWithChainedZoneSections() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new java.io.StringReader(
                "Zone Test/BuiltChain 0 - A 2000 Jan 1 0\n"
              + "  1:00 - B\n")));
        DateTimeZone zone = compiler.compile(null, null).get("Test/BuiltChain");
        long before = new DateTime(1999, 1, 1, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        long after = new DateTime(2001, 1, 1, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(0, zone.getOffset(before));
        assertEquals(3600000, zone.getOffset(after));
    }

    @Test
    public void testBuildDateTimeZoneWithRuleMap() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new java.io.StringReader(
                "Rule R 2000 only - Mar 1 0 1:00 D\n"
              + "Zone Test/BuiltRule 0 R R%s\n")));
        Map<String, DateTimeZone> zones = compiler.compile(null, null);
        DateTimeZone zone = zones.get("Test/BuiltRule");
        long summer = new DateTime(2000, 6, 1, 0, 0, ISOChronology.getInstanceUTC()).getMillis();
        assertEquals(3600000, zone.getOffset(summer));
    }
}
```