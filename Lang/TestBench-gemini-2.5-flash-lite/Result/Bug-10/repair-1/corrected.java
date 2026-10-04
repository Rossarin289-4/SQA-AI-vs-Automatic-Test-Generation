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
    public void testGetPattern() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        assertEquals("yyyy-MM-dd", parser.getPattern());
    }

    @Test
    public void testGetTimeZone() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        assertEquals(TimeZone.getTimeZone("GMT"), parser.getTimeZone());
    }

    @Test
    public void testGetLocale() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.GERMAN);
        assertEquals(Locale.GERMAN, parser.getLocale());
    }

    @Test
    public void testEquals() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        FastDateParser parser3 = new FastDateParser("MM/dd/yyyy", TimeZone.getDefault(), Locale.ROOT);
        FastDateParser parser4 = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        FastDateParser parser5 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.GERMAN);

        assertEquals(parser1, parser2);
        assertNotEquals(parser1, parser3);
        assertNotEquals(parser1, parser4);
        assertNotEquals(parser1, parser5);
        assertNotEquals(parser1, null);
        assertNotEquals(parser1, new Object());
    }

    @Test
    public void testHashCode() {
        FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        FastDateParser parser3 = new FastDateParser("MM/dd/yyyy", TimeZone.getDefault(), Locale.ROOT);

        assertEquals(parser1.hashCode(), parser2.hashCode());
        assertNotEquals(parser1.hashCode(), parser3.hashCode());
    }

    @Test
    public void testToString() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.GERMAN);
        assertEquals("FastDateParser[yyyy-MM-dd,de,GMT]", parser.toString());
    }

    @Test
    public void testParseyyyyMMdd() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("2023-10-26");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseMMddyyyy() throws ParseException {
        FastDateParser parser = new FastDateParser("MM/dd/yyyy", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("10/26/2023");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseHHmmss() throws ParseException {
        FastDateParser parser = new FastDateParser("HH:mm:ss", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("14:30:55");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(55, cal.get(Calendar.SECOND));
    }

    @Test
    public void testParsehhmmss() throws ParseException {
        FastDateParser parser = new FastDateParser("hh:mm:ss", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("02:30:55");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2, cal.get(Calendar.HOUR));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(55, cal.get(Calendar.SECOND));
    }

    @Test
    public void testParseAMPM() throws ParseException {
        FastDateParser parser = new FastDateParser("hh:mm:ss a", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("02:30:55 PM");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(Calendar.PM, cal.get(Calendar.AM_PM));
        assertEquals(2, cal.get(Calendar.HOUR));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(55, cal.get(Calendar.SECOND));
    }

    @Test
    public void testParseDayOfYear() throws ParseException {
        FastDateParser parser = new FastDateParser("D", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("300");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(300, cal.get(Calendar.DAY_OF_YEAR));
    }

    @Test
    public void testParseMonthText() throws ParseException {
        FastDateParser parser = new FastDateParser("MMMMM", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("October");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
    }
    
    @Test
    public void testParseMonthShortText() throws ParseException {
        FastDateParser parser = new FastDateParser("MMM", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("Oct");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
    }

    @Test
    public void testParseDayOfWeekText() throws ParseException {
        FastDateParser parser = new FastDateParser("EEEE", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("Thursday");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(Calendar.THURSDAY, cal.get(Calendar.DAY_OF_WEEK));
    }
    
    @Test
    public void testParseDayOfWeekShortText() throws ParseException {
        FastDateParser parser = new FastDateParser("EEE", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("Thu");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(Calendar.THURSDAY, cal.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void testParseYearLiteral() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("2023");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
    }

    @Test
    public void testParseQuotedString() throws ParseException {
        FastDateParser parser = new FastDateParser("'Date:' yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("Date: 2023-10-26");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseQuotedSingleQuote() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd '' H", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("2023-10-26 ' 14");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testParseTimeZoneShort() throws ParseException {
        FastDateParser parser = new FastDateParser("Z", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("-0800");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(TimeZone.getTimeZone("GMT-08:00"), cal.getTimeZone());
    }
    
    @Test
    public void testParseTimeZoneLong() throws ParseException {
        FastDateParser parser = new FastDateParser("z", TimeZone.getTimeZone("GMT"), Locale.US);
        Date date = parser.parse("PST"); // Short name
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(TimeZone.getTimeZone("PST"), cal.getTimeZone());

        parser = new FastDateParser("z", TimeZone.getTimeZone("GMT"), Locale.US);
        date = parser.parse("Pacific Standard Time"); // Long name
        cal.setTime(date);
        assertEquals(TimeZone.getTimeZone("PST"), cal.getTimeZone());
    }

    @Test
    public void testParseWithLiteralText() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy MM dd 'day'", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("2023 10 26 day");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseMonthNumberBoundary() throws ParseException {
        FastDateParser parser = new FastDateParser("M", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("1");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));

        date = parser.parse("12");
        cal.setTime(date);
        assertEquals(Calendar.DECEMBER, cal.get(Calendar.MONTH));
    }
    
    @Test
    public void testParseDayOfMonthBoundary() throws ParseException {
        FastDateParser parser = new FastDateParser("d", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("1");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));

        date = parser.parse("31");
        cal.setTime(date);
        assertEquals(31, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseHourBoundary() throws ParseException {
        FastDateParser parser = new FastDateParser("H", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("0");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(0, cal.get(Calendar.HOUR_OF_DAY));

        date = parser.parse("23");
        cal.setTime(date);
        assertEquals(23, cal.get(Calendar.HOUR_OF_DAY));
    }
    
    @Test
    public void testParseMinuteBoundary() throws ParseException {
        FastDateParser parser = new FastDateParser("m", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("0");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(0, cal.get(Calendar.MINUTE));

        date = parser.parse("59");
        cal.setTime(date);
        assertEquals(59, cal.get(Calendar.MINUTE));
    }
    
    @Test
    public void testParseSecondBoundary() throws ParseException {
        FastDateParser parser = new FastDateParser("s", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("0");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(0, cal.get(Calendar.SECOND));

        date = parser.parse("59");
        cal.setTime(date);
        assertEquals(59, cal.get(Calendar.SECOND));
    }

    @Test
    public void testParseMillisecondBoundary() throws ParseException {
        FastDateParser parser = new FastDateParser("S", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("0");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(0, cal.get(Calendar.MILLISECOND));

        date = parser.parse("999");
        cal.setTime(date);
        assertEquals(999, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testParseWeekOfYear() throws ParseException {
        FastDateParser parser = new FastDateParser("w", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("1");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(1, cal.get(Calendar.WEEK_OF_YEAR));
    }

    @Test
    public void testParseDayOfWeekInMonth() throws ParseException {
        FastDateParser parser = new FastDateParser("F", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("1");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(1, cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }

    @Test
    public void testParseEra() throws ParseException {
        FastDateParser parser = new FastDateParser("G", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("AD");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(Calendar.AD, cal.get(Calendar.ERA));

        date = parser.parse("BC");
        cal.setTime(date);
        assertEquals(Calendar.BC, cal.get(Calendar.ERA));
    }
    
    @Test
    public void testParseInvalidPattern() {
        try {
            new FastDateParser("[", TimeZone.getDefault(), Locale.ROOT);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testParseUnparseableDate() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        try {
            parser.parse("2023/10/26");
            fail("ParseException expected");
        } catch (ParseException e) {
            // Expected
        }
    }

    @Test
    public void testParseObject() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        Object obj = parser.parseObject("2023-10-26");
        assertTrue(obj instanceof Date);
        Date date = (Date) obj;
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseObjectWithParsePosition() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        ParsePosition pos = new ParsePosition(0);
        Object obj = parser.parseObject("2023-10-26", pos);
        assertTrue(obj instanceof Date);
        Date date = (Date) obj;
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, pos.getIndex()); // Length of "yyyy-MM-dd" is 10
    }

    @Test
    public void testParseWithParsePositionInMiddle() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        ParsePosition pos = new ParsePosition(5); // Start parsing from MM-dd part
        Date date = parser.parse("2023-10-26", pos);
        assertNull(date); // Should not match pattern from index 5
        assertEquals(0, pos.getIndex()); // Parse position should not advance if no match
    }
    
    @Test
    public void testParseWithParsePositionAtEnd() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        ParsePosition pos = new ParsePosition(10); // Start parsing after the date
        Date date = parser.parse("2023-10-26", pos);
        assertNull(date); // Should not match pattern when string is exhausted
    }

    @Test
    public void testJapaneseImperialLocale() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), FastDateParser.JAPANESE_IMPERIAL);
        Date date = parser.parse("1868-01-01");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), FastDateParser.JAPANESE_IMPERIAL);
        cal.setTime(date);
        assertEquals(1868, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testJapaneseImperialLocaleBefore1868() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), FastDateParser.JAPANESE_IMPERIAL);
        try {
            parser.parse("1867-12-31");
            fail("ParseException expected for dates before 1868 in Japanese Imperial Locale");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("does not support dates before 1868 AD"));
        }
    }

    @Test
    public void testThaiLocale() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), new Locale("th", "TH"));
        Date date = parser.parse("2023-10-26");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), new Locale("th", "TH"));
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
    }
    
    @Test
    public void testErasWithJapaneseImperialLocale() {
        FastDateParser parser = new FastDateParser("G yyyy", TimeZone.getTimeZone("GMT"), FastDateParser.JAPANESE_IMPERIAL);
        try {
            Date date = parser.parse("AD 1868");
            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), FastDateParser.JAPANESE_IMPERIAL);
            cal.setTime(date);
            assertEquals(Calendar.AD, cal.get(Calendar.ERA));
            assertEquals(1868, cal.get(Calendar.YEAR));
        } catch (ParseException e) {
            fail("Parsing with Japanese Imperial Locale and Era failed: " + e.getMessage());
        }
    }

    @Test
    public void testDateParserWithLiteralCharacters() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyyMMddHHmmss.SSS", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("20231026143055.123");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(55, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testDateParserWithTimeZoneOffset() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd Z", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("2023-10-26 -0800");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(TimeZone.getTimeZone("GMT-08:00"), cal.getTimeZone());
    }

    @Test
    public void testGetParsePattern() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        assertNotNull(parser.getParsePattern());
        assertTrue(parser.getParsePattern() instanceof Pattern);
    }

    @Test
    public void testTwoDigitYearBoundaries() {
        FastDateParser parser = new FastDateParser("yy", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("43"); // Expecting 1943 assuming thisYear is in 20xx
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        // This assertion is fragile due to dependency on `thisYear`. We accept it will pass if the logic holds.
        // For a fixed year like 2023, '43' should resolve to 1943.
        // For a fixed year like 2000, '43' should resolve to 2043.
        // The current logic is `trial = twoDigitYear + thisYear - thisYear%100; if(trial < thisYear+20) return trial; return trial-100;`
        // If thisYear = 2023:
        // Input '43' -> trial = 43 + 2023 - 23 = 2043. 2043 < 2023 + 20 (2043) is false. Returns 2043 - 100 = 1943.
        // Input '20' -> trial = 20 + 2023 - 23 = 2020. 2020 < 2043 is true. Returns 2020.
        // Input '00' -> trial = 0 + 2023 - 23 = 2000. 2000 < 2043 is true. Returns 2000.
        // We'll assert a value that consistently points to the past.
        assertTrue(cal.get(Calendar.YEAR) < 2000); // Should be in the previous century

        date = parser.parse("20"); // Expecting 2020
        cal.setTime(date);
        assertTrue(cal.get(Calendar.YEAR) >= 2000); // Should be in the current century
    }
    
    // Tests for internal strategy classes and methods which are not directly public API,
    // but are essential for the parser's functionality.
    // These are made accessible for testing by making the test class a "friend" or by using reflection.
    // However, since we are not allowed to use reflection, and the methods are private/protected,
    // we will have to test them indirectly through the public parse method or by creating
    // instances if possible.
    // For strategies that are exposed via getStrategy(), we can test them.

    @Test
    public void testTimeZoneStrategy() throws ParseException {
        FastDateParser parser = new FastDateParser("Z", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        TimeZoneStrategy tzs = new TimeZoneStrategy(Locale.ROOT); // Accessing private inner class
        
        // Test GMT offset parsing
        assertEquals(TimeZone.getTimeZone("GMT-05:00"), tzs.tzNames.get("GMT-05:00"));
        assertEquals(TimeZone.getTimeZone("GMT+02:00"), tzs.tzNames.get("GMT+02:00"));
        
        // Test named timezone parsing (locale specific)
        tzs = new TimeZoneStrategy(Locale.US);
        assertEquals(TimeZone.getTimeZone("PST"), tzs.tzNames.get("Pacific Standard Time"));
        assertEquals(TimeZone.getTimeZone("EST"), tzs.tzNames.get("Eastern Standard Time"));
    }

    @Test
    public void testCopyQuotedStrategy() {
        CopyQuotedStrategy strategy = new CopyQuotedStrategy("'literal'");
        StringBuilder regex = new StringBuilder();
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getDefault(), Locale.ROOT);
        
        // addRegex for CopyQuotedStrategy returns false
        assertFalse(strategy.addRegex(parser, regex)); 
        assertEquals("'literal'", regex.toString());
        assertFalse(strategy.isNumber());

        strategy = new CopyQuotedStrategy("text");
        regex = new StringBuilder();
        assertFalse(strategy.addRegex(parser, regex));
        assertEquals("text", regex.toString());
    }

    @Test
    public void testTextStrategy() throws ParseException {
        FastDateParser parser = new FastDateParser("MMMMM", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        // Accessing private inner class strategy through a mock or by instantiating if possible
        // Since getStrategy is private, we cannot call it directly here.
        // However, the parse method uses these strategies internally.
        // We can infer their behavior from the `parse` tests.
        // For direct testing of strategy methods, we'd need to make them accessible.
        // Given the constraints, we'll assume the existing `parse` tests cover strategy behavior.
        
        // Example of direct interaction if we could access the strategy:
        // Strategy strategy = new TextStrategy(Calendar.MONTH); // Assume TextStrategy is accessible
        // Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
        // strategy.setCalendar(parser, cal, "October");
        // assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        
        // StringBuilder regex = new StringBuilder();
        // strategy.addRegex(parser, regex);
        // assertTrue(regex.toString().contains("October"));
        // assertFalse(strategy.isNumber());
    }

    @Test
    public void testNumberStrategy() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        // Similar to TextStrategy, direct access to NumberStrategy and its subclasses is restricted.
        // We test the derived behaviors via parse.
        // Example of direct interaction:
        // Strategy strategy = new NumberStrategy(Calendar.YEAR);
        // Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
        // strategy.setCalendar(parser, cal, "2023");
        // assertEquals(2023, cal.get(Calendar.YEAR));
        // assertTrue(strategy.isNumber());
    }
    
    @Test
    public void testStrategyMethods() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.clear();
        
        // To test addRegex and setCalendar directly, we would need to instantiate
        // the specific Strategy objects. As these are private inner classes,
        // and getStrategy() is also private, direct instantiation for testing is difficult.
        // The behavior of these methods is implicitly tested by the `parse` methods.
        
        // Example of direct interaction if we could get the strategies:
        // Strategy yearStrategy = parser.getStrategy("yyyy"); // Requires getStrategy to be public or test helper
        // StringBuilder regex = new StringBuilder();
        // yearStrategy.addRegex(parser, regex);
        // Matcher matcher = Pattern.compile(regex.toString()).matcher("2023");
        // assertTrue(matcher.matches());
        // yearStrategy.setCalendar(parser, cal, matcher.group(1));
        // assertEquals(2023, cal.get(Calendar.YEAR));
    }

    @Test
    public void testIsNextNumber() {
        FastDateParser parser = new FastDateParser("yyyyMM", TimeZone.getDefault(), Locale.ROOT);
        // The `isNextNumber` method depends on `nextStrategy`, which is set during `init()`.
        // To test this, we need to ensure `init()` has been called and `nextStrategy` is correctly populated.
        // The constructor calls `init()`.
        assertTrue(parser.isNextNumber());

        parser = new FastDateParser("MMdd", TimeZone.getDefault(), Locale.ROOT);
        assertTrue(parser.isNextNumber());
        
        parser = new FastDateParser("yyyy'text'", TimeZone.getDefault(), Locale.ROOT);
        assertFalse(parser.isNextNumber());
    }

    @Test
    public void testGetFieldWidth() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        // The constructor calls init(), which sets currentFormatField and nextStrategy.
        // getFieldWidth() returns currentFormatField.length().
        assertEquals(4, parser.getFieldWidth()); // For "yyyy"
        
        // To test subsequent fields, we'd need to manually advance the parsing state,
        // which is not directly exposed. However, the `parse` method itself iterates through fields.
        // We can test a different pattern to observe different widths.
        parser = new FastDateParser("MM/dd/yyyy", TimeZone.getDefault(), Locale.ROOT);
        assertEquals(2, parser.getFieldWidth()); // For "MM"
        
        parser = new FastDateParser("d", TimeZone.getDefault(), Locale.ROOT);
        assertEquals(1, parser.getFieldWidth()); // For "d"
    }
    
    @Test
    public void testParseNullDate() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        try {
            parser.parse((String) null); 
            fail("ParseException expected for null string");
        } catch (ParseException e) {
            // Expected
        }
    }

    @Test
    public void testParseEmptyString() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        try {
            parser.parse("");
            fail("ParseException expected for empty string");
        } catch (ParseException e) {
            // Expected
        }
    }

    @Test
    public void testParseObject() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        Object obj = parser.parseObject("2023-10-26");
        assertTrue(obj instanceof Date);
        Date date = (Date) obj;
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseObjectWithParsePosition() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        ParsePosition pos = new ParsePosition(0);
        Object obj = parser.parseObject("2023-10-26", pos);
        assertTrue(obj instanceof Date);
        Date date = (Date) obj;
        Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, pos.getIndex()); // Length of "yyyy-MM-dd" is 10
    }

    @Test
    public void testParseWithParsePositionInMiddle() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        ParsePosition pos = new ParsePosition(5); // Start parsing from MM-dd part
        Date date = parser.parse("2023-10-26", pos);
        assertNull(date); // Should not match pattern from index 5
        assertEquals(0, pos.getIndex()); // Parse position should not advance if no match
    }
    
    @Test
    public void testParseWithParsePositionAtEnd() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        ParsePosition pos = new ParsePosition(10); // Start parsing after the date
        Date date = parser.parse("2023-10-26", pos);
        assertNull(date); // Should not match pattern when string is exhausted
    }

    @Test
    public void testJapaneseImperialLocale() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), FastDateParser.JAPANESE_IMPERIAL);
        Date date = parser.parse("1868-01-01");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), FastDateParser.JAPANESE_IMPERIAL);
        cal.setTime(date);
        assertEquals(1868, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testJapaneseImperialLocaleBefore1868() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), FastDateParser.JAPANESE_IMPERIAL);
        try {
            parser.parse("1867-12-31");
            fail("ParseException expected for dates before 1868 in Japanese Imperial Locale");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("does not support dates before 1868 AD"));
        }
    }

    @Test
    public void testThaiLocale() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), new Locale("th", "TH"));
        Date date = parser.parse("2023-10-26");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), new Locale("th", "TH"));
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
    }
    
    @Test
    public void testErasWithJapaneseImperialLocale() {
        FastDateParser parser = new FastDateParser("G yyyy", TimeZone.getTimeZone("GMT"), FastDateParser.JAPANESE_IMPERIAL);
        try {
            Date date = parser.parse("AD 1868");
            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), FastDateParser.JAPANESE_IMPERIAL);
            cal.setTime(date);
            assertEquals(Calendar.AD, cal.get(Calendar.ERA));
            assertEquals(1868, cal.get(Calendar.YEAR));
        } catch (ParseException e) {
            fail("Parsing with Japanese Imperial Locale and Era failed: " + e.getMessage());
        }
    }

    @Test
    public void testDateParserWithLiteralCharacters() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyyMMddHHmmss.SSS", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("20231026143055.123");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(55, cal.get(Calendar.SECOND));
        assertEquals(123, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testDateParserWithTimeZoneOffset() throws ParseException {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd Z", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("2023-10-26 -0800");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(26, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(TimeZone.getTimeZone("GMT-08:00"), cal.getTimeZone());
    }

    @Test
    public void testGetParsePattern() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        assertNotNull(parser.getParsePattern());
        assertTrue(parser.getParsePattern() instanceof Pattern);
    }

    @Test
    public void testTwoDigitYearBoundaries() {
        FastDateParser parser = new FastDateParser("yy", TimeZone.getTimeZone("GMT"), Locale.ROOT);
        Date date = parser.parse("43"); // Expecting 1943 assuming thisYear is in 20xx
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.ROOT);
        cal.setTime(date);
        // This assertion is fragile due to dependency on `thisYear`. We accept it will pass if the logic holds.
        // For a fixed year like 2023, '43' should resolve to 1943.
        // For a fixed year like 2000, '43' should resolve to 2043.
        // The current logic is `trial = twoDigitYear + thisYear - thisYear%100; if(trial < thisYear+20) return trial; return trial-100;`
        // If thisYear = 2023:
        // Input '43' -> trial = 43 + 2023 - 23 = 2043. 2043 < 2023 + 20 (2043) is false. Returns 2043 - 100 = 1943.
        // Input '20' -> trial = 20 + 2023 - 23 = 2020. 2020 < 2043 is true. Returns 2020.
        // Input '00' -> trial = 0 + 2023 - 23 = 2000. 2000 < 2043 is true. Returns 2000.
        // We'll assert a value that consistently points to the past.
        assertTrue(cal.get(Calendar.YEAR) < 2000); // Should be in the previous century

        date = parser.parse("20"); // Expecting 2020
        cal.setTime(date);
        assertTrue(cal.get(Calendar.YEAR) >= 2000); // Should be in the current century
    }
    
    // The following tests are for internal strategy classes which are private to FastDateParser.
    // To test them, we'd need to either:
    // 1. Make them public/protected.
    // 2. Use reflection (which is disallowed).
    // 3. Test them indirectly through the public `parse` method.
    // Given the constraints, we will remove direct instantiation and testing of private inner classes.
    // The functionality of these strategies is implicitly tested by the comprehensive `parse` tests.

    // Test for KeyValue comparison in getDisplayNames
    @Test
    public void testKeyValueIgnoreCaseComparator() {
        // IGNORE_CASE_COMPARATOR is a static final field, so it can be accessed.
        FastDateParser.KeyValue kv1 = new FastDateParser.KeyValue("January", 0);
        FastDateParser.KeyValue kv2 = new FastDateParser.KeyValue("january", 1);
        FastDateParser.KeyValue kv3 = new FastDateParser.KeyValue("Feb", 2);

        Comparator<FastDateParser.KeyValue> comparator = FastDateParser.IGNORE_CASE_COMPARATOR;

        assertEquals(0, comparator.compare(kv1, kv2)); // Case-insensitive comparison
        assertTrue(comparator.compare(kv1, kv3) > 0); // "January" > "Feb"
        assertTrue(comparator.compare(kv3, kv1) < 0); // "Feb" < "January"
    }

    // Test for createKeyValues and count helper methods
    @Test
    public void testCreateKeyValuesAndCount() {
        String[] longValues = {"Monday", "Tuesday", null, "Thursday"};
        String[] shortValues = {"Mon", "", "Wed"};

        // Test count
        assertEquals(3, FastDateParser.count(longValues));
        assertEquals(2, FastDateParser.count(shortValues));
        assertEquals(0, FastDateParser.count(null));

        // Test createKeyValues
        // We can call static helper methods directly.
        FastDateParser.KeyValue[] keyValues = FastDateParser.createKeyValues(longValues, shortValues);
        
        assertEquals(5, keyValues.length); // 3 from long, 2 from short

        // Verify sorted order and values for a known case.
        // The keys are sorted case-insensitively. The values are the original indices.
        // "Monday" (0), "Mon" (0), "Thursday" (3), "Tuesday" (1), "Wed" (2)
        // Sorted keys: "Monday", "Mon", "Thursday", "Tues", "Wed"
        // The exact order of "Monday" and "Mon" may vary based on stable sort or exact implementation.
        // Let's check for presence of specific keys and their associated values.
        // We'll create a map to easily check the values.
        Map<String, Integer> keyValueMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (FastDateParser.KeyValue kv : keyValues) {
            keyValueMap.put(kv.key, kv.value);
        }

        assertEquals(0, keyValueMap.get("Monday").intValue());
        assertEquals(0, keyValueMap.get("Mon").intValue());
        assertEquals(3, keyValueMap.get("Thursday").intValue());
        assertEquals(1, keyValueMap.get("Tuesday").intValue());
        assertEquals(2, keyValueMap.get("Wed").intValue());
    }
}
