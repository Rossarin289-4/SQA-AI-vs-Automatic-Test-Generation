```java
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
    public void testAccessors() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals("yyyy-MM-dd", p.getPattern());
        assertEquals(TimeZone.getTimeZone("GMT"), p.getTimeZone());
        assertEquals(Locale.US, p.getLocale());
    }

    @Test
    public void testEqualsSameConfiguration() throws Exception {
        FastDateParser a = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser b = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEqualsDifferentPattern() throws Exception {
        FastDateParser a = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser b = new FastDateParser("yyyy/MM/dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentTimeZone() throws Exception {
        FastDateParser a = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser b = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT+01:00"), Locale.US);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentLocale() throws Exception {
        FastDateParser a = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser b = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.FRANCE);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsNullAndOtherType() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertFalse(p.equals(null));
        assertFalse(p.equals("yyyy-MM-dd"));
    }

    @Test
    public void testEqualObjectsHaveEqualHashCodes() throws Exception {
        FastDateParser a = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        FastDateParser b = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals("FastDateParser[yyyy-MM-dd,en_US,GMT]", p.toString());
    }

    @Test
    public void testParseDateAtEpoch() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), p.parse("1970-01-01"));
    }

    @Test
    public void testParseObjectAtEpoch() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), p.parseObject("1970-01-01"));
    }

    @Test
    public void testParsePositionStartsAtOffsetAndStopsAfterMatch() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        ParsePosition pos = new ParsePosition(2);
        Date result = p.parse("xx1970-01-01tail", pos);
        assertEquals(new Date(0L), result);
        assertEquals(12, pos.getIndex());
    }

    @Test
    public void testParsePositionFailureLeavesIndexUnchanged() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        ParsePosition pos = new ParsePosition(0);
        assertNull(p.parse("no date", pos));
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseRejectsUnmatchedInput() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        try {
            p.parse("not a date");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(0, expected.getErrorOffset());
        }
    }

    @Test
    public void testParseNumericMonthOne() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-M-d",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), p.parse("1970-1-1"));
    }

    @Test
    public void testParseLastMonthOfYear() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        c.clear();
        c.set(1970, Calendar.DECEMBER, 1);
        assertEquals(c.getTime(), p.parse("1970-12-01"));
    }

    @Test
    public void testParseTextMonth() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MMM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), p.parse("1970-Jan-01"));
    }

    @Test
    public void testParseTextMonthCaseInsensitive() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MMM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), p.parse("1970-jAN-01"));
    }

    @Test
    public void testParseEscapedLiteralPunctuation() throws Exception {
        FastDateParser p = new FastDateParser("yyyy.MM.dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), p.parse("1970.01.01"));
    }

    @Test
    public void testParseQuotedLiteral() throws Exception {
        FastDateParser p = new FastDateParser("yyyy'X'MM",
                TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        c.clear();
        c.set(1970, Calendar.JANUARY, 1);
        assertEquals(c.getTime(), p.parse("1970X01"));
    }

    @Test
    public void testParseHourOfDayZero() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd HH",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(0L), p.parse("1970-01-01 00"));
    }

    @Test
    public void testParseHourOfDayTwentyThree() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM-dd HH",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertEquals(new Date(23L * 60L * 60L * 1000L),
                p.parse("1970-01-01 23"));
    }

    @Test
    public void testParseTwoDigitYearUsesCurrentCenturyWindow() throws Exception {
        FastDateParser p = new FastDateParser("yy-MM-dd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        Calendar now = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        int year = now.get(Calendar.YEAR);
        int candidate = 50 + year - year % 100;
        if (candidate >= year + 20) {
            candidate -= 100;
        }
        Calendar expected = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        expected.clear();
        expected.set(candidate, Calendar.JANUARY, 1);
        assertEquals(expected.getTime(), p.parse("50-01-01"));
    }

    @Test
    public void testTextMonthStrategyIsNotNumeric() throws Exception {
        FastDateParser p = new FastDateParser("MMM",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertFalse(p.isNextNumber());
    }

    @Test
    public void testNumberStrategyRecognizesFollowingNumber() throws Exception {
        FastDateParser p = new FastDateParser("yyyyMMdd",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertTrue(p.isNextNumber());
    }

    @Test
    public void testLiteralFollowingNumberIsNotNumeric() throws Exception {
        FastDateParser p = new FastDateParser("yyyy-MM",
                TimeZone.getTimeZone("GMT"), Locale.US);
        assertFalse(p.isNextNumber());
    }
}
```