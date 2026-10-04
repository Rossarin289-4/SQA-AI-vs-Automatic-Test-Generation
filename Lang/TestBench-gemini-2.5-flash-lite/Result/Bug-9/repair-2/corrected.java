package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FastDateParserTest {

    // Test cases for year parsing
    @Test
    public void testParseYearAbbreviated() throws Exception {
        FastDateParser parser = new FastDateParser("yy", TimeZone.getDefault(), Locale.US);
        // Assuming current year is 2023 for adjustYear calculation in reference source
        // With yy, 23 should map to 2023
        Date date = parser.parse("23");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
    }

    @Test
    public void testParseYearAbbreviatedBoundary() throws Exception {
        FastDateParser parser = new FastDateParser("yy", TimeZone.getDefault(), Locale.US);
        // Test boundary for adjustYear: 20 years after thisYear and 80 years before.
        // If thisYear is 2023, then thisYear%100 is 23. baseYear is 2000.
        // Input "43": trial = 43 + 2000 = 2043.
        // Condition: 2043 < 2023 + 20 (2043). This is false.
        // So, return trial - 100 = 2043 - 100 = 1943. This is correct.
        Date date43 = parser.parse("43");
        Calendar cal43 = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal43.setTime(date43);
        assertEquals(1943, cal43.get(Calendar.YEAR));

        // Input "42": trial = 42 + 2000 = 2042.
        // Condition: 2042 < 2043. This is true.
        // So, return trial = 2042. This is also correct.
        Date date42 = parser.parse("42");
        Calendar cal42 = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal42.setTime(date42);
        assertEquals(2042, cal42.get(Calendar.YEAR));

        // Input "00": trial = 0 + 2000 = 2000.
        // Condition: 2000 < 2043. True. Return 2000.
        Date date00 = parser.parse("00");
        Calendar cal00 = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal00.setTime(date00);
        assertEquals(2000, cal00.get(Calendar.YEAR));
    }

    @Test
    public void testParseYearLiteral() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("2023");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
    }

    @Test
    public void testParseYearLiteralBoundary() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("0000");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(0, cal.get(Calendar.YEAR));
    }

    // Test cases for month parsing
    @Test
    public void testParseMonthAsNumber() throws Exception {
        FastDateParser parser = new FastDateParser("M", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("1"); // January
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
    }

    @Test
    public void testParseMonthAsNumberBoundary() throws Exception {
        FastDateParser parser = new FastDateParser("M", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("12"); // December
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.DECEMBER, cal.get(Calendar.MONTH));
    }

    @Test
    public void testParseMonthAsText() throws Exception {
        FastDateParser parser = new FastDateParser("MMM", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("Jan"); // January
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
    }

    @Test
    public void testParseMonthAsTextBoundary() throws Exception {
        FastDateParser parser = new FastDateParser("MMMM", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("December"); // December
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.DECEMBER, cal.get(Calendar.MONTH));
    }

    // Test cases for day of week parsing
    @Test
    public void testParseDayOfWeekAsText() throws Exception {
        FastDateParser parser = new FastDateParser("E", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("Mon"); // Monday
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.MONDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testParseDayOfWeekAsTextBoundary() throws Exception {
        FastDateParser parser = new FastDateParser("EEEE", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("Sunday"); // Sunday
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.SUNDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    // Test cases for AM/PM parsing
    @Test
    public void testParseAmPm() throws Exception {
        FastDateParser parser = new FastDateParser("a", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("AM");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.AM, cal.get(Calendar.AM_PM));
    }

    @Test
    public void testParseAmPmBoundary() throws Exception {
        FastDateParser parser = new FastDateParser("a", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("PM");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.PM, cal.get(Calendar.AM_PM));
    }

    // Test cases for timezone parsing
    @Test
    public void testParseTimeZoneShort() throws Exception {
        FastDateParser parser = new FastDateParser("z", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("GMT"); // Greenwich Mean Time
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(tz.getID(), cal.getTimeZone().getID());
    }

    @Test
    public void testParseTimeZoneLong() throws Exception {
        FastDateParser parser = new FastDateParser("z", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("Greenwich Mean Time"); // GMT
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(tz.getID(), cal.getTimeZone().getID());
    }

    @Test
    public void testParseTimeZoneOffset() throws Exception {
        FastDateParser parser = new FastDateParser("Z", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("+0100");
        TimeZone tz = TimeZone.getTimeZone("GMT+01:00");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(tz.getID(), cal.getTimeZone().getID());
    }

    @Test
    public void testParseTimeZoneOffsetBoundary() throws Exception {
        FastDateParser parser = new FastDateParser("Z", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("-1200");
        TimeZone tz = TimeZone.getTimeZone("GMT-12:00");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(tz.getID(), cal.getTimeZone().getID());
    }

    // Test cases for hour, minute, second, millisecond parsing
    @Test
    public void testParseHour() throws Exception {
        FastDateParser parser = new FastDateParser("h", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("1");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(1, cal.get(Calendar.HOUR));
    }

    @Test
    public void testParseHourModulo() throws Exception {
        FastDateParser parser = new FastDateParser("h", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("13");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(1, cal.get(Calendar.HOUR)); // 13 % 12 = 1
    }

    @Test
    public void testParseHourOfDay() throws Exception {
        FastDateParser parser = new FastDateParser("k", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("1");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(1, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testParseHourOfDayModulo() throws Exception {
        FastDateParser parser = new FastDateParser("k", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("23");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(23, cal.get(Calendar.HOUR_OF_DAY)); // 23 % 24 = 23
    }

    @Test
    public void testParseMinute() throws Exception {
        FastDateParser parser = new FastDateParser("m", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("59");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(59, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testParseSecond() throws Exception {
        FastDateParser parser = new FastDateParser("s", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("59");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(59, cal.get(Calendar.SECOND));
    }

    @Test
    public void testParseMillisecond() throws Exception {
        FastDateParser parser = new FastDateParser("S", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("123");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    // Test cases for day of year, day of month, etc.
    @Test
    public void testParseDayOfYear() throws Exception {
        FastDateParser parser = new FastDateParser("D", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("365");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(365, cal.get(Calendar.DAY_OF_YEAR));
    }

    @Test
    public void testParseDayOfMonth() throws Exception {
        FastDateParser parser = new FastDateParser("d", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("31");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(31, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseDayOfWeekInMonth() throws Exception {
        FastDateParser parser = new FastDateParser("F", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("4");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(4, cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }

    @Test
    public void testParseWeekOfYear() throws Exception {
        FastDateParser parser = new FastDateParser("w", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("52");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(52, cal.get(Calendar.WEEK_OF_YEAR));
    }

    @Test
    public void testParseWeekOfMonth() throws Exception {
        FastDateParser parser = new FastDateParser("W", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("4");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(4, cal.get(Calendar.WEEK_OF_MONTH));
    }

    // Test cases for era
    @Test
    public void testParseEra() throws Exception {
        FastDateParser parser = new FastDateParser("G", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("AD"); // Assuming AD is the first era value
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        // Calendar.AD is a valid constant
        assertEquals(Calendar.AD, cal.get(Calendar.ERA));
    }

    @Test
    public void testParseEraBoundary() throws Exception {
        FastDateParser parser = new FastDateParser("G", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("BC"); // Assuming BC is the second era value
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        // Calendar.BC is a valid constant
        assertEquals(Calendar.BC, cal.get(Calendar.ERA));
    }

    // Test case for a full pattern
    @Test
    public void testParseFullPattern() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm:ss.SSS Z", TimeZone.getDefault(), Locale.US);
        String dateString = "2023-01-15 14:30:55.123 +0100";
        Date date = parser.parse(dateString);

        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);

        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(55, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
        assertEquals("GMT+01:00", cal.getTimeZone().getID());
    }

    // Test cases for literal strings and escaped quotes
    @Test
    public void testParseLiteralString() throws Exception {
        FastDateParser parser = new FastDateParser("''literal''", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("literal");
        // A pattern with only quoted text will result in a default date (epoch start).
        assertNotNull(date);
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(1970, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseEscapedQuote() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy'It''s' a 'day'", TimeZone.getDefault(), Locale.US);
        String dateString = "2023It's a day";
        Date date = parser.parse(dateString);
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
    }

    // Test with ParsePosition
    @Test
    public void testParsePartialParse() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        String dateString = "xxxx2023-01-15yyyy";
        ParsePosition pos = new ParsePosition(4); // Start parsing at index 4
        Date date = parser.parse(dateString, pos);
        assertNotNull(date);
        assertEquals(4 + "2023-01-15".length(), pos.getIndex()); // Index should be updated

        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    // Test for invalid input
    @Test
    public void testParseInvalid() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        try {
            parser.parse("invalid date string");
            fail("Expected ParseException for invalid input");
        } catch (ParseException e) {
            // Expected exception
            assertTrue(e.getMessage().contains("Unparseable date"));
        }
    }

    // Test for edge case where parsing might fail and return null
    @Test
    public void testParseNullResult() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getDefault(), Locale.US);
        ParsePosition pos = new ParsePosition(0);
        // Providing input that won't match the pattern
        Date date = parser.parse("abc", pos);
        assertNull(date);
        assertEquals(0, pos.getIndex()); // Index should not advance
    }

    // Test case for Japanese Imperial Calendar - checks for specific error message
    @Test
    public void testParseJapaneseImperialCalendar() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getDefault(), FastDateParser.JAPANESE_IMPERIAL);
        try {
            parser.parse("1800"); // Before 1868 AD
            fail("Expected ParseException for pre-1868 date in Japanese Imperial Calendar");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("(The ja_JP_JP locale does not support dates before 1868 AD)"));
        }
    }

    // Test with a pattern that includes spaces
    @Test
    public void testParseWithSpaces() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy MM dd", TimeZone.getDefault(), Locale.US);
        String dateString = "2023 02 20";
        Date date = parser.parse(dateString);
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.FEBRUARY, cal.get(Calendar.MONTH));
        assertEquals(20, cal.get(Calendar.DAY_OF_MONTH));
    }

    // Test with a pattern that includes only literals
    @Test
    public void testParseOnlyLiterals() throws Exception {
        FastDateParser parser = new FastDateParser("'Just a literal string'", TimeZone.getDefault(), Locale.US);
        String dateString = "Just a literal string";
        Date date = parser.parse(dateString);
        assertNotNull(date);
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(1970, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
    }

    // Test case for TimeZoneStrategy with a different locale
    @Test
    public void testParseTimeZoneWithDifferentLocale() throws Exception {
        FastDateParser parser = new FastDateParser("z", TimeZone.getDefault(), Locale.FRANCE);
        // In French locale, "GMT" might be displayed differently or refer to "Heure de Greenwich"
        Date date = parser.parse("Heure de Greenwich"); // French for GMT
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.FRANCE);
        cal.setTime(date);
        assertEquals(tz.getID(), cal.getTimeZone().getID());
    }

    // Test for parsing a number that exceeds the typical range for a field (e.g., year)
    @Test
    public void testParseLargeNumberForYear() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getDefault(), Locale.US);
        String largeYear = "99999";
        Date date = parser.parse(largeYear);
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(99999, cal.get(Calendar.YEAR));
    }

    // Test for parsing a number that exceeds the typical range for a field (e.g., month)
    @Test
    public void testParseLargeNumberForMonth() throws Exception {
        FastDateParser parser = new FastDateParser("M", TimeZone.getDefault(), Locale.US);
        String largeMonth = "15";
        Date date = parser.parse(largeMonth);
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.MAY, cal.get(Calendar.MONTH)); // 15 = 12 + 3, so May (index 4).
    }

    // Test with a zero value for a numeric field
    @Test
    public void testParseZeroValueNumericField() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm:ss", TimeZone.getDefault(), Locale.US);
        String dateString = "2023-01-01 00:00:00";
        Date date = parser.parse(dateString);
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
    }

    // Test with a pattern that has overlapping fields or ambiguous parsing potential (e.g. M vs MM vs MMM)
    @Test
    public void testAmbiguousMonthPattern() throws Exception {
        FastDateParser parser1 = new FastDateParser("M", TimeZone.getDefault(), Locale.US);
        Date date1 = parser1.parse("1");
        Calendar cal1 = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal1.setTime(date1);
        assertEquals(Calendar.JANUARY, cal1.get(Calendar.MONTH));

        FastDateParser parser2 = new FastDateParser("MM", TimeZone.getDefault(), Locale.US);
        Date date2 = parser2.parse("01");
        Calendar cal2 = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal2.setTime(date2);
        assertEquals(Calendar.JANUARY, cal2.get(Calendar.MONTH));

        FastDateParser parser3 = new FastDateParser("MMM", TimeZone.getDefault(), Locale.US);
        Date date3 = parser3.parse("Jan");
        Calendar cal3 = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal3.setTime(date3);
        assertEquals(Calendar.JANUARY, cal3.get(Calendar.MONTH));
    }

    // Test that equals and hashCode are consistent
    @Test
    public void testEqualsAndHashCode() throws Exception {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        FastDateParser parser3 = new FastDateParser("MM/dd/yyyy", TimeZone.getDefault(), Locale.US);
        FastDateParser parser4 = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser parser5 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.FRANCE);

        assertEquals(parser1, parser2);
        assertEquals(parser1.hashCode(), parser2.hashCode());

        assertNotEquals(parser1, parser3);
        assertNotEquals(parser1.hashCode(), parser3.hashCode());

        assertNotEquals(parser1, parser4);
        assertNotEquals(parser1.hashCode(), parser4.hashCode());

        assertNotEquals(parser1, parser5);
        assertNotEquals(parser1.hashCode(), parser5.hashCode());
    }

    // Test toString method
    @Test
    public void testToString() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals("FastDateParser[yyyy-MM-dd,en_US,GMT]", parser.toString());
    }

    // New tests for uncalled public methods

    @Test
    public void testGetPattern() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        assertEquals("yyyy-MM-dd", parser.getPattern());
    }

    @Test
    public void testGetLocale() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.FRANCE);
        assertEquals(Locale.FRANCE, parser.getLocale());
    }

    @Test
    public void testEqualsSelf() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        assertEquals(parser, parser);
    }

    @Test
    public void testParseObject() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        String dateString = "2023-10-26";
        Object obj = parser.parseObject(dateString);
        assertTrue(obj instanceof Date);
        Date date = (Date) obj;
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseObjectWithParsePosition() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        String dateString = "xxxx2023-10-26yyyy";
        ParsePosition pos = new ParsePosition(4);
        Object obj = parser.parseObject(dateString, pos);
        assertTrue(obj instanceof Date);
        assertEquals(4 + "2023-10-26".length(), pos.getIndex());
        Date date = (Date) obj;
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
    }

    // Test for KeyValue.compare (Comparator) which is used internally by TextStrategy
    @Test
    public void testIgnoreCaseComparator() throws Exception {
        // Accessing KeyValue and IGNORE_CASE_COMPARATOR requires an instance of FastDateParser
        // because they are inner classes.
        FastDateParser parser = new FastDateParser("yy", TimeZone.getDefault(), Locale.US);

        // Create KeyValue instances using the parser instance.
        // KeyValue is an inner class, so we need to use the outer class instance to create it.
        FastDateParser.KeyValue kv1 = parser.new KeyValue("Abc", 1);
        FastDateParser.KeyValue kv2 = parser.new KeyValue("abc", 2);
        FastDateParser.KeyValue kv3 = parser.new KeyValue("DEF", 3);

        // The comparator is static, so it can be accessed directly.
        assertEquals(0, FastDateParser.IGNORE_CASE_COMPARATOR.compare(kv1, kv2));
        assertTrue(FastDateParser.IGNORE_CASE_COMPARATOR.compare(kv1, kv3) < 0);
        assertTrue(FastDateParser.IGNORE_CASE_COMPARATOR.compare(kv3, kv1) > 0);
    }


    // Test for CopyQuotedStrategy via a pattern with literals
    @Test
    public void testParseLiteralPattern() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy 'Literal' MM", TimeZone.getDefault(), Locale.US);
        String dateString = "2023 Literal 10";
        Date date = parser.parse(dateString);
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
    }

    // Test for `getParsePattern()`
    @Test
    public void testGetParsePattern() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        Pattern p = parser.getParsePattern();
        assertNotNull(p);
    }

    // Test for `escapeRegex()`
    @Test
    public void testEscapeRegex() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy'.'MM", TimeZone.getDefault(), Locale.US);
        Pattern p = parser.getParsePattern();
        String regex = p.pattern();
        assertTrue(regex.contains("\\.")); // '.' should be escaped
    }
}
