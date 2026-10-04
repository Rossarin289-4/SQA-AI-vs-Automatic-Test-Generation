package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import com.fasterxml.jackson.core.io.NumberInput;

public class StdDateFormatTest {
    @Test
    public void testDefaultTimezone() throws Exception {
        assertEquals("UTC", StdDateFormat.getDefaultTimeZone().getID());
    }

    @Test
    public void testWithSameTimezoneReturnsEquivalentTimezone() throws Exception {
        StdDateFormat format = new StdDateFormat();
        StdDateFormat configured = format.withTimeZone(StdDateFormat.getDefaultTimeZone());
        assertEquals("UTC", configured.getTimeZone().getID());
    }

    @Test
    public void testWithNullTimezoneUsesDefault() throws Exception {
        StdDateFormat format = new StdDateFormat().withTimeZone(null);
        assertEquals("UTC", format.getTimeZone().getID());
    }

    @Test
    public void testWithLocaleReturnsEquivalentLocaleBehavior() throws Exception {
        StdDateFormat format = new StdDateFormat().withLocale(Locale.US);
        assertEquals(new Date(0L), format.parse("1970-01-01"));
    }

    @Test
    public void testCloneKeepsLocaleAndDefaultTimezoneBehavior() throws Exception {
        StdDateFormat clone = new StdDateFormat().clone();
        assertEquals(new Date(0L), clone.parse("1970-01-01"));
        assertNull(clone.getTimeZone());
    }

    @Test
    public void testISO8601FormatUsesRequestedTimezone() throws Exception {
        TimeZone utc = TimeZone.getTimeZone("UTC");
        DateFormat format = StdDateFormat.getISO8601Format(utc, Locale.US);
        assertEquals("1970-01-01T00:00:00.000+0000",
                format.format(new Date(0L)));
    }

    @Test
    public void testRFC1123FormatUsesRequestedTimezoneAndLocale() throws Exception {
        DateFormat format = StdDateFormat.getRFC1123Format(
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("Thu, 01 Jan 1970 00:00:00 UTC", format.format(new Date(0L)));
    }

    @Test
    public void testSetTimezoneAndGetTimezone() throws Exception {
        StdDateFormat format = new StdDateFormat();
        TimeZone zone = TimeZone.getTimeZone("GMT+02:00");
        format.setTimeZone(zone);
        assertEquals(zone, format.getTimeZone());
    }

    @Test
    public void testSetLenientFalse() throws Exception {
        StdDateFormat format = new StdDateFormat();
        format.setLenient(false);
        assertFalse(format.isLenient());
    }

    @Test
    public void testLenientDefaultsToTrue() throws Exception {
        assertTrue(new StdDateFormat().isLenient());
    }

    @Test
    public void testParsePlainDate() throws Exception {
        assertEquals(new Date(0L), new StdDateFormat().parse("1970-01-01"));
    }

    @Test
    public void testParseISOZuluTimestamp() throws Exception {
        assertEquals(new Date(0L),
                new StdDateFormat().parse("1970-01-01T00:00:00Z"));
    }

    @Test
    public void testParseISOOffsetTimestamp() throws Exception {
        assertEquals(new Date(0L),
                new StdDateFormat().parse("1970-01-01T02:00:00+02:00"));
    }

    @Test
    public void testParseRFC1123Date() throws Exception {
        assertEquals(new Date(0L),
                new StdDateFormat().parse("Thu, 01 Jan 1970 00:00:00 GMT"));
    }

    @Test
    public void testParsePositiveLongTimestampAtLongBoundary() throws Exception {
        assertEquals(new Date(Long.MAX_VALUE),
                new StdDateFormat().parse("9223372036854775807"));
    }

    @Test
    public void testParseNegativeLongTimestamp() throws Exception {
        assertEquals(new Date(Long.MIN_VALUE),
                new StdDateFormat().parse("-9223372036854775808"));
    }

    @Test
    public void testParseRejectsPositiveTimestampBeyondLongRange() throws Exception {
        try {
            new StdDateFormat().parse("9223372036854775808");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(0, expected.getErrorOffset());
        }
    }

    @Test
    public void testParseWithPositionTimestamp() throws Exception {
        ParsePosition position = new ParsePosition(0);
        Date result = new StdDateFormat().parse("1234", position);
        assertEquals(new Date(1234L), result);
        assertEquals(0, position.getIndex());
    }

    @Test
    public void testFormatEpochInUtc() throws Exception {
        StdDateFormat format = new StdDateFormat();
        StringBuffer output = format.format(new Date(0L), new StringBuffer(),
                new FieldPosition(0));
        assertEquals("1970-01-01T00:00:00.000+0000", output.toString());
    }

    @Test
    public void testFormatAppendsToExistingBuffer() throws Exception {
        StringBuffer output = new StringBuffer("x");
        new StdDateFormat().format(new Date(0L), output, new FieldPosition(0));
        assertEquals("x1970-01-01T00:00:00.000+0000", output.toString());
    }

    @Test
    public void testToStringContainsLocale() throws Exception {
        assertTrue(new StdDateFormat().toString().contains("locale: en_US"));
    }
}
