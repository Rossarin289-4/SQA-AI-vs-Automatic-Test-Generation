package com.google.gson.internal.bind.util;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;

public class ISO8601UtilsAI5Test {

    @Test
    public void testFormatDefault() {
        Date date = new Date(0L); // 1970-01-01 00:00:00 UTC
        String formatted = ISO8601Utils.format(date);
        Assert.assertEquals("1970-01-01T00:00:00Z", formatted);
    }

    @Test
    public void testFormatWithMillis() {
        Date date = new Date(123L);
        String formatted = ISO8601Utils.format(date, true);
        Assert.assertEquals("1970-01-01T00:00:00.123Z", formatted);
    }

    @Test
    public void testFormatWithCustomTimeZone() {
        Date date = new Date(0L);
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        String formatted = ISO8601Utils.format(date, false, tz);
        Assert.assertEquals("1970-01-01T02:00:00+02:00", formatted);
    }

    @Test
    public void testParseBasicDate() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("1970-01-01", pos);
        Assert.assertNotNull(date);
        Assert.assertEquals(10, pos.getIndex());
    }

    @Test
    public void testParseCompleteWithMillisAndZ() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2020-05-15T12:34:56.789Z", pos);
        Assert.assertNotNull(date);
        Assert.assertEquals(24, pos.getIndex());
    }

    @Test
    public void testParseWithOffset() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2020-05-15T12:34:56+03:00", pos);
        Assert.assertNotNull(date);
        Assert.assertEquals(25, pos.getIndex());
    }

    @Test
    public void testParseOneDigitFraction() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2020-05-15T12:34:56.5Z", pos);
        Assert.assertNotNull(date);
    }

    @Test
    public void testParseTwoDigitFraction() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        Date date = ISO8601Utils.parse("2020-05-15T12:34:56.55Z", pos);
        Assert.assertNotNull(date);
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidFormatThrowsParseException() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        ISO8601Utils.parse("invalid-date", pos);
    }

    @Test(expected = ParseException.class)
    public void testParseMissingTimeZoneThrowsParseException() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        ISO8601Utils.parse("2020-05-15T12:34:56", pos);
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidTimeZoneThrowsParseException() throws ParseException {
        ParsePosition pos = new ParsePosition(0);
        ISO8601Utils.parse("2020-05-15T12:34:56X", pos);
    }
}
