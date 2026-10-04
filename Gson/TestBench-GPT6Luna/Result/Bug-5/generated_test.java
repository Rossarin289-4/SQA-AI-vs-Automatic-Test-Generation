package com.google.gson.internal.bind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.*;

public class ISO8601UtilsTest {
    @Test
    public void testFormatEpoch() throws Exception {
        assertEquals("1970-01-01T00:00:00Z", ISO8601Utils.format(new Date(0L)));
    }

    @Test
    public void testFormatNegativeOneMillisecond() throws Exception {
        assertEquals("1969-12-31T23:59:59Z", ISO8601Utils.format(new Date(-1L)));
    }

    @Test
    public void testParseDateOnly() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01", pos);
        assertEquals(new Date(0L), result);
        assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParseCompactDateOnly() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("19700101", pos);
        assertEquals(new Date(0L), result);
        assertEquals(8, pos.getIndex());
    }

    @Test
    public void testParseUtcTime() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T00:00:00Z", pos);
        assertEquals(new Date(0L), result);
        assertEquals(20, pos.getIndex());
    }

    @Test
    public void testParseTimeWithoutSeconds() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T00:00Z", pos);
        assertEquals(new Date(0L), result);
        assertEquals(17, pos.getIndex());
    }

    @Test
    public void testParseCompactTime() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T000000Z", pos);
        assertEquals(new Date(0L), result);
        assertEquals(18, pos.getIndex());
    }

    @Test
    public void testParseFractionOneDigit() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T00:00:00.1Z", pos);
        assertEquals(new Date(100L), result);
        assertEquals(22, pos.getIndex());
    }

    @Test
    public void testParseFractionTwoDigits() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T00:00:00.12Z", pos);
        assertEquals(new Date(120L), result);
        assertEquals(23, pos.getIndex());
    }

    @Test
    public void testParseFractionThreeDigits() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T00:00:00.123Z", pos);
        assertEquals(new Date(123L), result);
        assertEquals(24, pos.getIndex());
    }

    @Test
    public void testParsePositiveTimezone() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T01:00:00+01:00", pos);
        assertEquals(new Date(0L), result);
        assertEquals(25, pos.getIndex());
    }

    @Test
    public void testParseNegativeTimezone() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1969-12-31T23:00:00-01:00", pos);
        assertEquals(new Date(0L), result);
        assertEquals(25, pos.getIndex());
    }

    @Test
    public void testParseTimezoneWithoutColon() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T01:00:00+0100", pos);
        assertEquals(new Date(0L), result);
        assertEquals(24, pos.getIndex());
    }

    @Test
    public void testParseTimezoneHourOnly() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T01:00:00+01", pos);
        assertEquals(new Date(0L), result);
        assertEquals(24, pos.getIndex());
    }

    @Test
    public void testParseLeapSecondIsTruncated() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T00:00:60Z", pos);
        assertEquals(new Date(59000L), result);
        assertEquals(20, pos.getIndex());
    }

    @Test
    public void testParseTrailingTextAdvancesPositionThroughZone() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date result = ISO8601Utils.parse("1970-01-01T00:00:00Zx", pos);
        assertEquals(new Date(0L), result);
        assertEquals(20, pos.getIndex());
    }

    @Test
    public void testParseStartingAtNonzeroPosition() throws Exception {
        ParsePosition pos = new ParsePosition(2);
        Date result = ISO8601Utils.parse("xx1970-01-01", pos);
        assertEquals(new Date(0L), result);
        assertEquals(12, pos.getIndex());
    }

    @Test
    public void testParseInvalidDayThrowsParseException() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse("1970-02-30T00:00:00Z", pos);
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(20, expected.getErrorOffset());
        }
    }

    @Test
    public void testParseInvalidTimezoneThrowsParseException() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse("1970-01-01T00:00:00Q", pos);
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(0, expected.getErrorOffset());
        }
    }

    @Test
    public void testParseMissingTimezoneThrowsParseException() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        try {
            ISO8601Utils.parse("1970-01-01T00:00:00", pos);
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(0, expected.getErrorOffset());
        }
    }
}
