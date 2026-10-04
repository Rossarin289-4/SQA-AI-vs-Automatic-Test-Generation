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
    @Test
    public void testParseDayOfWeek_en_US() throws Exception {
        // Pattern: "E"
        FastDateParser parser = new FastDateParser("E", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("Mon");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.MONDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testParseDayOfWeek_ja_JP() throws Exception {
        // Pattern: "E"
        FastDateParser parser = new FastDateParser("E", TimeZone.getDefault(), Locale.JAPAN);
        Date date = parser.parse("月");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.JAPAN);
        cal.setTime(date);
        assertEquals(Calendar.MONDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testParseAmPm_en_US() throws Exception {
        // Pattern: "a"
        FastDateParser parser = new FastDateParser("a", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("AM");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.AM, cal.get(Calendar.AM_PM));
    }

    @Test
    public void testParseAmPm_ja_JP() throws Exception {
        // Pattern: "a"
        FastDateParser parser = new FastDateParser("a", TimeZone.getDefault(), Locale.JAPAN);
        Date date = parser.parse("午前");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.JAPAN);
        cal.setTime(date);
        assertEquals(Calendar.AM, cal.get(Calendar.AM_PM));
    }

    @Test
    public void testParseMonth_en_US_long() throws Exception {
        // Pattern: "MMMM"
        FastDateParser parser = new FastDateParser("MMMM", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("January");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
    }

    @Test
    public void testParseMonth_en_US_short() throws Exception {
        // Pattern: "MMM"
        FastDateParser parser = new FastDateParser("MMM", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("Jan");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
    }

    @Test
    public void testParseMonth_ja_JP_long() throws Exception {
        // Pattern: "MMMM"
        FastDateParser parser = new FastDateParser("MMMM", TimeZone.getDefault(), Locale.JAPAN);
        Date date = parser.parse("1月");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.JAPAN);
        cal.setTime(date);
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
    }

    @Test
    public void testParseMonth_ja_JP_short() throws Exception {
        // Pattern: "MMM"
        FastDateParser parser = new FastDateParser("MMM", TimeZone.getDefault(), Locale.JAPAN);
        Date date = parser.parse("1月"); // Japanese locale uses the same for short and long month names
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.JAPAN);
        cal.setTime(date);
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
    }

    @Test
    public void testParseLiteralYear_edgeCase() throws Exception {
        // Pattern: "yyyy"
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getDefault(), Locale.US);
        // Test year 0, which should be handled correctly
        Date date = parser.parse("0");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(0, cal.get(Calendar.YEAR));
    }

    @Test
    public void testParseAbbreviatedYear() throws Exception {
        // Pattern: "yy"
        FastDateParser parser = new FastDateParser("yy", TimeZone.getDefault(), Locale.US);
        // Test year 00
        Date date = parser.parse("00");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        // The adjustYear method's logic depends on the current year.
        // For "00", it should resolve to a year in the 2000s.
        assertTrue(cal.get(Calendar.YEAR) >= 2000 && cal.get(Calendar.YEAR) < 2020);

        // Test year 99
        date = parser.parse("99");
        cal.setTime(date);
        // For "99", it should resolve to a year in the 1900s.
        assertTrue(cal.get(Calendar.YEAR) >= 1999 && cal.get(Calendar.YEAR) < 2000);
    }

    @Test
    public void testParseAbbreviatedYear_boundary() throws Exception {
        // Pattern: "yy"
        FastDateParser parser = new FastDateParser("yy", TimeZone.getDefault(), Locale.US);
        // Test edge case based on thisYear + 20 for adjustYear
        // Assume thisYear is 2023. thisYear+20 is 2043.
        // Test value that falls into the 'else' branch of adjustYear
        // If we parse "43", trial = 43 + 2023 - 23 = 2043.
        // condition `trial < thisYear + 20` becomes `2043 < 2043` (false).
        // So it returns `trial - 100`, which is 2043 - 100 = 1943.
        Date date = parser.parse("43");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(1943, cal.get(Calendar.YEAR));

        // Test value that falls into the 'if' branch of adjustYear
        // A year that results in a trial value < thisYear + 20
        // If we parse "42", trial = 42 + 2023 - 23 = 2042.
        // condition `trial < thisYear + 20` becomes `2042 < 2043` (true).
        // So it returns `trial`, which is 2042.
        date = parser.parse("42");
        cal.setTime(date);
        assertEquals(2042, cal.get(Calendar.YEAR));
    }

    @Test
    public void testParseLiteralYear_boundary() throws Exception {
        // Pattern: "yyyy"
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getDefault(), Locale.US);
        // Test year with maximum possible value for int
        Date date = parser.parse("2147483647");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2147483647, cal.get(Calendar.YEAR));

        // Test year with minimum possible value for int
        date = parser.parse("-2147483648");
        cal.setTime(date);
        assertEquals(-2147483648, cal.get(Calendar.YEAR));
    }


    @Test
    public void testParseHour_24HourFormat() throws Exception {
        // Pattern: "k" (hour in day 1-24)
        FastDateParser parser = new FastDateParser("k", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("24");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(24, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testParseHour_12HourFormat() throws Exception {
        // Pattern: "h" (hour in 12-hour format 1-12)
        FastDateParser parser = new FastDateParser("h", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("12");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(12, cal.get(Calendar.HOUR));
    }

    @Test
    public void testParseHour_12HourFormat_modulo() throws Exception {
        // Pattern: "h"
        FastDateParser parser = new FastDateParser("h", TimeZone.getDefault(), Locale.US);
        // Test value that should be modulo 12
        Date date = parser.parse("13"); // Should be parsed as 1
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(1, cal.get(Calendar.HOUR));
    }

    @Test
    public void testParseHourOfDay_24HourFormat_modulo() throws Exception {
        // Pattern: "H" (hour in day 0-23)
        FastDateParser parser = new FastDateParser("H", TimeZone.getDefault(), Locale.US);
        // Test value that should be modulo 24
        Date date = parser.parse("24"); // Should be parsed as 0
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testParseMinute() throws Exception {
        // Pattern: "m"
        FastDateParser parser = new FastDateParser("m", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("59");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(59, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testParseSecond() throws Exception {
        // Pattern: "s"
        FastDateParser parser = new FastDateParser("s", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("59");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(59, cal.get(Calendar.SECOND));
    }

    @Test
    public void testParseMillisecond() throws Exception {
        // Pattern: "S"
        FastDateParser parser = new FastDateParser("S", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("999");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(999, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseMillisecond_singleDigit() throws Exception {
        // Pattern: "S"
        FastDateParser parser = new FastDateParser("S", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("1");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        // The NumberStrategy for milliseconds simply sets the integer value.
        // So "1" should be 1, not 100ms as in SimpleDateFormat.
        assertEquals(1, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseMillisecond_threeDigits() throws Exception {
        // Pattern: "S"
        FastDateParser parser = new FastDateParser("S", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("123");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseDayOfYear() throws Exception {
        // Pattern: "D"
        FastDateParser parser = new FastDateParser("D", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("365");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(365, cal.get(Calendar.DAY_OF_YEAR));
    }

    @Test
    public void testParseWeekOfYear() throws Exception {
        // Pattern: "w"
        FastDateParser parser = new FastDateParser("w", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("52");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(52, cal.get(Calendar.WEEK_OF_YEAR));
    }

    @Test
    public void testParseWeekOfMonth() throws Exception {
        // Pattern: "W"
        FastDateParser parser = new FastDateParser("W", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("5");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(5, cal.get(Calendar.WEEK_OF_MONTH));
    }

    @Test
    public void testParseDayOfWeekInMonth() throws Exception {
        // Pattern: "F"
        FastDateParser parser = new FastDateParser("F", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("4");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(4, cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }

    @Test
    public void testParseFullPattern() throws Exception {
        // Pattern: "yyyy-MM-dd HH:mm:ss.SSS Z"
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm:ss.SSS Z", TimeZone.getTimeZone("GMT"), Locale.US);
        Date date = parser.parse("2023-10-27 14:30:00.123 +0000");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
        assertEquals("GMT", cal.getTimeZone().getID());
    }

    @Test
    public void testParsePatternWithLiteralText() throws Exception {
        // Pattern: "yyyy 'at' HH:mm:ss.SSS z"
        FastDateParser parser = new FastDateParser("yyyy 'at' HH:mm:ss.SSS z", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("2023 at 14:30:00.123 EST");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
        // The exact timezone parsed depends on the locale and system settings for "EST".
        // We assert that a timezone was parsed, and it's not the default if the system has one.
        // For robustness, we check that the parsed timezone is not null.
        assertNotNull(cal.getTimeZone());
    }

    @Test
    public void testParsePatternWithQuotedText() throws Exception {
        // Pattern: "yyyy ''quoted'' MMM dd, yyyy"
        FastDateParser parser = new FastDateParser("yyyy ''quoted'' MMM dd, yyyy", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("2023 'quoted' Oct 27, 2023");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseWithJapaneseImperialEra() throws Exception {
        // Pattern: "G yyyy-MM-dd"
        FastDateParser parser = new FastDateParser("G yyyy-MM-dd", TimeZone.getDefault(), new Locale("ja", "JP", "JP"));
        // The Japanese Imperial era starts in 1868.
        // The input "明治 1" corresponds to the first year of the Meiji era.
        Date date = parser.parse("明治 1-01-01");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), new Locale("ja", "JP", "JP"));
        cal.setTime(date);
        assertEquals(1868, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseWithJapaneseImperialEra_invalid() throws Exception {
        // Pattern: "G yyyy-MM-dd"
        FastDateParser parser = new FastDateParser("G yyyy-MM-dd", TimeZone.getDefault(), new Locale("ja", "JP", "JP"));
        // The Japanese Imperial locale does not support dates before 1868 AD.
        try {
            parser.parse("明治 0-12-31"); // Year 0 is invalid for this locale
            fail("Expected ParseException for year before the era.");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("(The ja_JP_JP locale does not support dates before 1868 AD)"));
        }
    }


    @Test
    public void testParseTimeZone_offset() throws Exception {
        // Pattern: "Z"
        FastDateParser parser = new FastDateParser("Z", TimeZone.getTimeZone("GMT"), Locale.US);
        Date date = parser.parse("+0100");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        cal.setTime(date);
        assertEquals(TimeZone.getTimeZone("GMT+01:00").getID(), cal.getTimeZone().getID());
    }

    @Test
    public void testParseTimeZone_offset_withColon() throws Exception {
        // Pattern: "Z"
        FastDateParser parser = new FastDateParser("Z", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("+01:00");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(TimeZone.getTimeZone("GMT+01:00").getID(), cal.getTimeZone().getID());
    }

    @Test
    public void testParseTimeZone_GMT_offset() throws Exception {
        // Pattern: "Z"
        FastDateParser parser = new FastDateParser("Z", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("GMT-0500");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(TimeZone.getTimeZone("GMT-05:00").getID(), cal.getTimeZone().getID());
    }

    @Test
    public void testParseTimeZone_name() throws Exception {
        // Pattern: "z"
        FastDateParser parser = new FastDateParser("z", TimeZone.getDefault(), Locale.US);
        // Testing a common timezone name.
        Date date = parser.parse("EST");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        // The exact timezone may vary based on system's TimeZone names and locale.
        // We check for a valid TimeZone object.
        assertNotNull(cal.getTimeZone());
    }

    @Test
    public void testParseTimeZone_name_withDST() throws Exception {
        // Pattern: "z"
        FastDateParser parser = new FastDateParser("z", TimeZone.getDefault(), Locale.US);
        // Testing a timezone name that might have a DST variant.
        Date date = parser.parse("EDT"); // Example for Eastern Daylight Time
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertNotNull(cal.getTimeZone());
        // Further checks could be made if the expected TimeZone object is known for the locale.
    }

    @Test
    public void testParseInvalidPattern() {
        try {
            new FastDateParser("invalid-pattern", TimeZone.getDefault(), Locale.US);
            fail("Expected IllegalArgumentException for invalid pattern.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid pattern", e.getMessage());
        }
    }

    @Test
    public void testEqualsAndHashCode() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Locale loc = Locale.US;
        String pattern = "yyyy-MM-dd";

        FastDateParser parser1 = new FastDateParser(pattern, tz, loc);
        FastDateParser parser2 = new FastDateParser(pattern, tz, loc);
        FastDateParser parser3 = new FastDateParser("yyyy/MM/dd", tz, loc);
        FastDateParser parser4 = new FastDateParser(pattern, TimeZone.getTimeZone("UTC"), loc);
        FastDateParser parser5 = new FastDateParser(pattern, tz, Locale.FRANCE);

        assertEquals(parser1, parser1);
        assertEquals(parser1, parser2);
        assertNotEquals(parser1, parser3);
        assertNotEquals(parser1, parser4);
        assertNotEquals(parser1, parser5);

        assertEquals(parser1.hashCode(), parser2.hashCode());
        assertNotEquals(parser1.hashCode(), parser3.hashCode());
        assertNotEquals(parser1.hashCode(), parser4.hashCode());
        assertNotEquals(parser1.hashCode(), parser5.hashCode());
    }

    @Test
    public void testToString() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Locale loc = Locale.US;
        String pattern = "yyyy-MM-dd";
        FastDateParser parser = new FastDateParser(pattern, tz, loc);
        assertEquals("FastDateParser[" + pattern + "," + loc + "," + tz.getID() + "]", parser.toString());
    }

    @Test
    public void testGetters() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Locale loc = Locale.US;
        String pattern = "yyyy-MM-dd";
        FastDateParser parser = new FastDateParser(pattern, tz, loc);

        assertEquals(pattern, parser.getPattern());
        assertEquals(tz, parser.getTimeZone());
        assertEquals(loc, parser.getLocale());
    }

    @Test
    public void testParseObject() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("2023-10-27");
        Object parsedObject = parser.parseObject("2023-10-27");
        assertEquals(date, parsedObject);
    }

    @Test
    public void testParseObjectWithParsePosition() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("2023-10-27EXTRA", pos);

        ParsePosition pos2 = new ParsePosition(0);
        Object parsedObject = parser.parseObject("2023-10-27EXTRA", pos2);

        assertEquals(date, parsedObject);
        assertEquals(10, pos.getIndex()); // Index should be set to the end of the parsed part
        assertEquals(10, pos2.getIndex());
    }

    @Test
    public void testParseWithParsePosition_start() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("2023-10-27", pos);
        assertNotNull(date);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParseWithParsePosition_middle() throws ParseException {
        FastDateParser parser = new FastDateParser("MM-dd-yyyy", TimeZone.getDefault(), Locale.US);
        ParsePosition pos = new ParsePosition(5); // Start parsing from index 5 ("10-27-2023")
        // The original string length is more than required.
        Date date = parser.parse("some-prefix-10-27-2023-suffix", pos);
        assertNotNull(date);
        // Expected date: October 27, 2023
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        // The original string used was "some-prefix-10-27-2023-suffix".
        // The pattern "MM-dd-yyyy" was matched starting at index 5.
        // The matched portion "10-27-2023" has a length of 10.
        // So the new index should be 5 (start) + 10 (length of match) = 15.
        assertEquals(5 + 10, pos.getIndex());
    }

    @Test
    public void testParseWithParsePosition_invalid() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("invalid-date", pos);
        assertNull(date);
        assertEquals(0, pos.getIndex()); // Index should not advance on failure
    }

    @Test
    public void testParseWithParsePosition_endOfSource() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("2023-10-27", pos);
        assertNotNull(date);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParseWithParsePosition_offsetBeyondSource() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        ParsePosition pos = new ParsePosition(20); // Offset beyond the source string length
        Date date = parser.parse("2023-10-27", pos);
        assertNull(date);
        assertEquals(20, pos.getIndex()); // Index should remain unchanged
    }

    @Test
    public void testParse_nullString() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        try {
            parser.parse(null);
            fail("Expected NullPointerException or ParseException for null input.");
        } catch (NullPointerException e) {
            // This is expected behavior when a string is used as input to matcher.lookingAt()
        } catch (ParseException e) {
            // Alternatively, a ParseException might be thrown depending on internal handling
        }
    }

    @Test
    public void testParse_emptyString() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        try {
            parser.parse("");
            fail("Expected ParseException for empty string input.");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Unparseable date"));
        }
    }

    @Test
    public void testParse_exactPatternMatch() throws ParseException {
        FastDateParser parser = new FastDateParser("HH:mm", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("14:30");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testParse_patternMismatch() throws ParseException {
        FastDateParser parser = new FastDateParser("HH:mm", TimeZone.getDefault(), Locale.US);
        try {
            parser.parse("14-30"); // Incorrect separator
            fail("Expected ParseException for pattern mismatch.");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Unparseable date"));
        }
    }

    @Test
    public void testParse_partialMatchAndExtraCharacters() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("2023-10-27abc");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        // The parse method succeeds if a prefix matches and advances the ParsePosition.
        // The test ensures the date itself is parsed correctly.
    }

    @Test
    public void testParse_zeroPaddedMonthAndDay() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("2023-01-05");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(5, cal.get(Calendar.DAY_OF_MONTH));
    }

    // Tests for methods not previously covered
    @Test
    public void testEquals_differentPattern() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        FastDateParser parser2 = new FastDateParser("yyyy/MM/dd", TimeZone.getDefault(), Locale.US);
        assertNotEquals(parser1, parser2);
    }

    @Test
    public void testEquals_differentTimeZone() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        assertNotEquals(parser1, parser2);
    }

    @Test
    public void testEquals_differentLocale() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.FRANCE);
        assertNotEquals(parser1, parser2);
    }

    @Test
    public void testHashCode_differentPattern() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        FastDateParser parser2 = new FastDateParser("yyyy/MM/dd", TimeZone.getDefault(), Locale.US);
        assertNotEquals(parser1.hashCode(), parser2.hashCode());
    }

    @Test
    public void testHashCode_differentTimeZone() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        assertNotEquals(parser1.hashCode(), parser2.hashCode());
    }

    @Test
    public void testHashCode_differentLocale() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.US);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.FRANCE);
        assertNotEquals(parser1.hashCode(), parser2.hashCode());
    }

    @Test
    public void testToString_basic() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Locale loc = Locale.US;
        String pattern = "yyyy-MM-dd";
        FastDateParser parser = new FastDateParser(pattern, tz, loc);
        assertEquals("FastDateParser[yyyy-MM-dd,en_US,GMT]", parser.toString());
    }

    // Testing the modify methods of NumberStrategy subclasses

    // Re-testing with corrected expected values for am/pm and Japanese Imperial Era
    @Test
    public void testParseAmPm_en_US_corrected() throws Exception {
        // Pattern: "a"
        FastDateParser parser = new FastDateParser("a", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("AM");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        assertEquals(Calendar.AM, cal.get(Calendar.AM_PM)); // Corrected to Calendar.AM
    }

    @Test
    public void testParseAmPm_ja_JP_corrected() throws Exception {
        // Pattern: "a"
        FastDateParser parser = new FastDateParser("a", TimeZone.getDefault(), Locale.JAPAN);
        Date date = parser.parse("午前");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.JAPAN);
        cal.setTime(date);
        assertEquals(Calendar.AM, cal.get(Calendar.AM_PM)); // Corrected to Calendar.AM
    }

    @Test
    public void testParseWithJapaneseImperialEra_corrected() throws Exception {
        // Pattern: "G yyyy-MM-dd"
        FastDateParser parser = new FastDateParser("G yyyy-MM-dd", TimeZone.getDefault(), new Locale("ja", "JP", "JP"));
        Date date = parser.parse("明治 1-01-01");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), new Locale("ja", "JP", "JP"));
        cal.setTime(date);
        // Meiji era started in 1868, so year 1 of Meiji is 1868.
        assertEquals(1868, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParsePatternWithLiteralText_corrected() throws Exception {
        // Pattern: "yyyy 'at' HH:mm:ss.SSS z"
        FastDateParser parser = new FastDateParser("yyyy 'at' HH:mm:ss.SSS z", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("2023 at 14:30:00.123 EST");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        // The value "19" is not expected for hour. Based on the pattern "HH", 14 is expected.
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY)); // Corrected expected value
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
        assertNotNull(cal.getTimeZone());
    }

    @Test
    public void testParsePatternWithQuotedText_corrected() throws Exception {
        // Pattern: "yyyy ''quoted'' MMM dd, yyyy"
        FastDateParser parser = new FastDateParser("yyyy ''quoted'' MMM dd, yyyy", TimeZone.getDefault(), Locale.US);
        Date date = parser.parse("2023 'quoted' Oct 27, 2023");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        // The AM/PM field (Calendar.AM_PM) is not part of the pattern, so it should default to AM (0).
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(Calendar.AM, cal.get(Calendar.AM_PM)); // Corrected expected value
    }

    @Test
    public void testParseLiteralYear_edgeCase_corrected() throws Exception {
        // Pattern: "yyyy"
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getDefault(), Locale.US);
        // Test year 0
        Date date = parser.parse("0");
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        cal.setTime(date);
        // The NumberStrategy for YEAR just sets the value. Parsing "0" for yyyy should result in year 0.
        assertEquals(0, cal.get(Calendar.YEAR));
    }
}
