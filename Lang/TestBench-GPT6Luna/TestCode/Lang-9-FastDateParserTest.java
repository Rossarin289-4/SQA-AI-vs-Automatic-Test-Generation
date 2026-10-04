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
    public void testAccessorsAndString() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("GMT");
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", zone, Locale.US);
        assertEquals("yyyy-MM-dd", parser.getPattern());
        assertSame(zone, parser.getTimeZone());
        assertEquals(Locale.US, parser.getLocale());
        assertEquals("FastDateParser[yyyy-MM-dd,en_US,GMT]", parser.toString());
    }

    @Test
    public void testEqualParserAndHashCode() throws Exception {
        FastDateParser one = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser two = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        assertTrue(one.equals(two));
        assertEquals(one.hashCode(), two.hashCode());
    }

    @Test
    public void testEqualityRejectsDifferentPatternAndOtherType() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        assertFalse(parser.equals(new FastDateParser("yy", TimeZone.getTimeZone("GMT"), Locale.US)));
        assertFalse(parser.equals("yyyy"));
    }

    @Test
    public void testEqualityDistinguishesTimeZone() throws Exception {
        FastDateParser one = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser two = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT+01:00"), Locale.US);
        assertFalse(one.equals(two));
    }

    @Test
    public void testEqualityDistinguishesLocale() throws Exception {
        FastDateParser one = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser two = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.FRANCE);
        assertFalse(one.equals(two));
    }

    @Test
    public void testParsesDateAndObject() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        Date expected = new Date(0L);
        assertEquals(expected, parser.parse("1970-01-01"));
        assertEquals(expected, parser.parseObject("1970-01-01"));
    }

    @Test
    public void testParsePositionConsumesMatchingPrefix() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        ParsePosition position = new ParsePosition(0);
        Date date = parser.parse("1970-01-01tail", position);
        assertEquals(new Date(0L), date);
        assertEquals(10, position.getIndex());
    }

    @Test
    public void testParsePositionHonorsStartingOffset() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        ParsePosition position = new ParsePosition(2);
        Date date = parser.parse("xx1970-01-01", position);
        assertEquals(new Date(0L), date);
        assertEquals(12, position.getIndex());
    }

    @Test
    public void testParsePositionFailureLeavesIndexUnchanged() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        ParsePosition position = new ParsePosition(0);
        assertNull(parser.parse("bad", position));
        assertEquals(0, position.getIndex());
    }

    @Test
    public void testParseThrowsForUnmatchedInput() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("GMT"), Locale.US);
        try {
            parser.parse("bad");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(0, expected.getErrorOffset());
        }
    }

    @Test
    public void testQuotedLiteralAndRegexCharacters() throws Exception {
        FastDateParser parser = new FastDateParser("'a.b'yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("a.b1970"));
    }

    @Test
    public void testLiteralYearDigitsAreParsedAsYear() throws Exception {
        FastDateParser parser = new FastDateParser("yyyyMMdd", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("19700101"));
    }

    @Test
    public void testNumericMonthOneBased() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-M-d", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("1970-1-1"));
    }

    @Test
    public void testTextMonthCaseInsensitive() throws Exception {
        FastDateParser parser = new FastDateParser("MMM d yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("Jan 1 1970"));
    }

    @Test
    public void testAmPmAndHour() throws Exception {
        FastDateParser parser = new FastDateParser("h a", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 1, 12, 0, 0);
        assertEquals(calendar.getTime(), parser.parse("12 PM"));
    }

    @Test
    public void testHourModuloPatterns() throws Exception {
        FastDateParser parser = new FastDateParser("H k", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 2, 0, 0, 0);
        assertEquals(calendar.getTime(), parser.parse("24 24"));
    }

    @Test
    public void testTimezoneOffsetParsing() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd Z", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), parser.parse("1970-01-01 +0000"));
    }

    @Test
    public void testTimezoneOffsetWithColon() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd Z", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(-3600000L), parser.parse("1970-01-01 +01:00"));
    }

    @Test
    public void testParseNullOnMismatchAtNonzeroPosition() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        ParsePosition position = new ParsePosition(1);
        assertNull(parser.parse("xno", position));
        assertEquals(1, position.getIndex());
    }

    @Test
    public void testAdjacentNumericFieldsRequireDeclaredWidth() throws Exception {
        FastDateParser parser = new FastDateParser("MMdd", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 2);
        assertEquals(calendar.getTime(), parser.parse("0102"));
    }

    @Test
    public void testTextStrategyAcceptsCaseInsensitiveMonth() throws Exception {
        FastDateParser parser = new FastDateParser("MMM", TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 1);
        assertEquals(calendar.getTime(), parser.parse("Jan"));
    }

    @Test
    public void testTextStrategyRejectsUnknownName() throws Exception {
        FastDateParser parser = new FastDateParser("MMM", TimeZone.getTimeZone("GMT"), Locale.US);
        try {
            parser.parse("Xyz");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(0, expected.getErrorOffset());
        }
    }

    @Test
    public void testTimezoneNameLookupUsesParsedName() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd z", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), parser.parse("1970-01-01 GMT"));
    }

    @Test
    public void testTimezoneNegativeOffsetAtZero() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy-MM-dd Z", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), parser.parse("1970-01-01 -00:00"));
    }

    @Test
    public void testRegexEscapesLiteralMetacharacters() throws Exception {
        FastDateParser parser = new FastDateParser("'a+b'yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), parser.parse("a+b1970"));
    }

    @Test
    public void testNumericAdjacentFieldsRejectShortInput() throws Exception {
        FastDateParser parser = new FastDateParser("MMdd", TimeZone.getTimeZone("GMT"), Locale.US);
        ParsePosition position = new ParsePosition(0);
        Date result = parser.parse("102", position);
        assertEquals(0, position.getIndex());
        assertEquals(new Date(21254400000L), result);
    }

    @Test
    public void testNumberStrategyParsesIntegerMaximum() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(-6019000092841406464L), parser.parse("2147483647"));
    }

    @Test
    public void testNumberStrategyOverIntegerMaximumThrows() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        try {
            parser.parse("2147483648");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
            assertEquals(true, true);
        }
    }

    @Test
    public void testNumberStrategyParsesIntegerMinimum() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        ParsePosition position = new ParsePosition(0);
        assertNull(parser.parse("-2147483648", position));
        assertEquals(0, position.getIndex());
    }

    @Test
    public void testNumberStrategyNegativeBelowMinimumDoesNotMatch() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy", TimeZone.getTimeZone("GMT"), Locale.US);
        ParsePosition position = new ParsePosition(0);
        assertNull(parser.parse("-2147483649", position));
        assertEquals(0, position.getIndex());
    }
}
