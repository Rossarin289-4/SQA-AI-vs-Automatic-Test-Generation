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
    public void testPatternAccessor() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("yyyy-MM-dd", parser.getPattern());
    }

    @Test
    public void testTimeZoneAccessor() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("GMT+02:00");
        FastDateParser parser = new FastDateParser("yyyy", zone, Locale.US);
        assertSame(zone, parser.getTimeZone());
    }

    @Test
    public void testLocaleAccessor() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        assertSame(Locale.US, parser.getLocale());
    }

    @Test
    public void testEqualsMatchingValues() throws Exception {
        FastDateParser first = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateParser second = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        assertTrue(first.equals(second));
    }

    @Test
    public void testEqualsDifferentPattern() throws Exception {
        FastDateParser first = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateParser second = new FastDateParser("yy", TimeZone.getTimeZone("UTC"), Locale.US);
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsNull() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        assertFalse(parser.equals(null));
    }

    @Test
    public void testHashCodeMatchesEqualParser() throws Exception {
        FastDateParser first = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateParser second = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("FastDateParser[yyyy,en_US,UTC]", parser.toString());
    }

    @Test
    public void testParseFixedWidthFields() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.FEBRUARY, 29);
        assertEquals(calendar.getTime(), parser.parse("2020-02-29"));
    }

    @Test
    public void testParseMonthAndDayEdges() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2021, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("2021-01-01"));
    }

    @Test
    public void testParseHourModuloTwentyFour() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals(calendar.getTime(), parser.parse("2020-01-01 24"));
    }

    @Test
    public void testParseTwelveHourField() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd hh a", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JANUARY, 1, 15, 0, 0);
        assertEquals(calendar.getTime(), parser.parse("2020-01-01 03 PM"));
    }

    @Test
    public void testParseTextMonthCaseInsensitive() throws Exception {
        FastDateParser parser = new FastDateParser("MMMM d yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JANUARY, 2);
        assertEquals(calendar.getTime(), parser.parse("January 2 2020"));
    }

    @Test
    public void testParsePositionOffsetAndTrailingText() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        ParsePosition position = new ParsePosition(2);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("xx2020-01-01tail", position));
        assertEquals(12, position.getIndex());
    }

    @Test
    public void testParsePositionNonmatchingInput() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        ParsePosition position = new ParsePosition(0);
        assertNull(parser.parse("no date", position));
        assertEquals(0, position.getIndex());
    }

    @Test
    public void testParseObjectReturnsParsedDate() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JUNE, 15);
        assertEquals(calendar.getTime(), parser.parseObject("2020-06-15"));
    }

    @Test
    public void testParseUnmatchedInputThrowsParseException() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        try {
            parser.parse("not a date");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(0, expected.getErrorOffset());
        }
    }

    @Test
    public void testQuotedLiteralParsing() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy'year'MM", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("2020year01"));
    }

    @Test
    public void testQuotedRegexMetacharacterIsLiteral() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy'.'MM", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("2020.01"));
    }

    @Test
    public void testParseLiteralYearField() throws Exception {
        FastDateParser parser = new FastDateParser("yyyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("02020-01-01"));
    }

    @Test
    public void testParseNegativeInputDoesNotMatchNumericField() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        ParsePosition position = new ParsePosition(0);
        assertNull(parser.parse("-1", position));
        assertEquals(0, position.getIndex());
    }

    @Test
    public void testParseNumericMaximumIntegerField() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(Calendar.YEAR, 2147483647);
        assertEquals(calendar.getTime(), parser.parse("2147483647"));
    }

    @Test
    public void testParseNumericValueOverIntegerMaximumThrows() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        try {
            parser.parse("2147483648");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
            assertEquals(NumberFormatException.class, expected.getClass());
        }
    }

    @Test
    public void testQuotedLiteralWithApostrophe() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy''MM", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("2020'01"));
    }

    @Test
    public void testNumericPatternNextNumberIsFixedWidth() throws Exception {
        FastDateParser parser = new FastDateParser("Mdd", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals(new Date(0L), parser.parse("101"));
    }

    @Test
    public void testQuotedNumericLiteralAllowsVariableWidthPreviousField() throws Exception {
        FastDateParser parser = new FastDateParser("M'1'", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("11"));
    }

    @Test
    public void testParseZoneOffsetPositiveBoundary() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd Z", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+23:59"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("2020-01-01 +23:59"));
    }

    @Test
    public void testParseZoneOffsetNegativeBoundary() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd Z", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT-23:59"), Locale.US);
        calendar.clear();
        calendar.set(2020, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("2020-01-01 -23:59"));
    }

    @Test
    public void testParsePositionWithEndIndex() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        ParsePosition position = new ParsePosition(4);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(Calendar.YEAR, 2020);
        assertEquals(calendar.getTime(), parser.parse("xxxx2020", position));
        assertEquals(8, position.getIndex());
    }

    @Test
    public void testParseObjectWithParsePosition() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        ParsePosition position = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(Calendar.YEAR, 2020);
        assertEquals(calendar.getTime(), parser.parseObject("2020tail", position));
        assertEquals(4, position.getIndex());
    }
}
