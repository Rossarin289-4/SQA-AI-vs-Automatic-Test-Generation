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
        // The expected TimeZone object might differ in its internal representation but should be equivalent.
        // Asserting the ID is a safer bet for cross-platform compatibility.
        assertEquals("PST", cal.getTimeZone().getID());

        parser = new FastDateParser("z", TimeZone.getTimeZone("GMT"), Locale.US);
        date = parser.parse("Pacific Standard Time"); // Long name
        cal.setTime(date);
        assertEquals("PST", cal.getTimeZone().getID());
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
        // The pattern "yyyy-MM-dd" does not match "10-26" from index 5.
        // The parsePosition should remain unchanged if no match is found.
        assertNull(date); 
        assertEquals(5, pos.getIndex()); // The ParsePosition should not advance if no match is found.
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
            assertTrue(e.getMessage().contains("(The ja_JP_JP locale does not support dates before 1868 AD)"));
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
    public void testIsNextNumber() {
        FastDateParser parser = new FastDateParser("yyyyMM", TimeZone.getDefault(), Locale.ROOT);
        assertTrue(parser.isNextNumber());

        parser = new FastDateParser("MMdd", TimeZone.getDefault(), Locale.ROOT);
        assertTrue(parser.isNextNumber());
        
        parser = new FastDateParser("yyyy'text'", TimeZone.getDefault(), Locale.ROOT);
        assertFalse(parser.isNextNumber());
    }

    @Test
    public void testGetFieldWidth() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        assertEquals(4, parser.getFieldWidth()); // For "yyyy"
        
        parser = new FastDateParser("MM/dd/yyyy", TimeZone.getDefault(), Locale.ROOT);
        assertEquals(2, parser.getFieldWidth()); // For "MM"
        
        parser = new FastDateParser("d", TimeZone.getDefault(), Locale.ROOT);
        assertEquals(1, parser.getFieldWidth()); // For "d"
    }
    
    @Test
    public void testParseNullDate() {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getDefault(), Locale.ROOT);
        // The parse method expects a non-null string. Passing null should result in a NullPointerException before ParseException.
        try {
            parser.parse((String) null); 
            fail("NullPointerException expected for null string");
        } catch (NullPointerException e) {
            // Expected
        } catch (ParseException e) {
            fail("ParseException was thrown, but NullPointerException was expected.");
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
}
