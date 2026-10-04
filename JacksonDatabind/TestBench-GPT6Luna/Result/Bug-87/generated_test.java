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
    public void testDefaultTimeZoneIsUtc() throws Exception {
        assertEquals("UTC", StdDateFormat.getDefaultTimeZone().getID());
    }

    @Test
    public void testDefaultTimezoneConfiguration() throws Exception {
        StdDateFormat format = new StdDateFormat();
        assertNull(format.getTimeZone());
        assertTrue(format.isLenient());
    }

    @Test
    public void testWithSameTimezoneReturnsEquivalentFormat() throws Exception {
        StdDateFormat format = new StdDateFormat();
        StdDateFormat result = format.withTimeZone(null);
        assertEquals(StdDateFormat.getDefaultTimeZone(), result.getTimeZone());
    }

    @Test
    public void testWithDifferentTimezonePreservesRequestedTimezone() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("GMT+02:00");
        StdDateFormat format = new StdDateFormat().withTimeZone(zone);
        assertEquals(zone, format.getTimeZone());
    }

    @Test
    public void testWithSameLocaleReturnsThis() throws Exception {
        StdDateFormat format = new StdDateFormat();
        assertSame(format, format.withLocale(Locale.US));
    }

    @Test
    public void testCloneIsIndependentAndEqualOnlyByIdentity() throws Exception {
        StdDateFormat format = new StdDateFormat();
        StdDateFormat copy = format.clone();
        assertNotSame(format, copy);
        assertFalse(format.equals(copy));
        assertEquals(format, format);
    }

    @Test
    public void testIsoFormatFactoryUsesRequestedTimezone() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("GMT+02:00");
        DateFormat format = StdDateFormat.getISO8601Format(zone, Locale.US);
        assertEquals("1970-01-01T02:00:00.000+0200",
                format.format(new Date(0L)));
    }

    @Test
    public void testRfcFormatFactoryUsesRequestedTimezone() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("GMT+02:00");
        DateFormat format = StdDateFormat.getRFC1123Format(zone, Locale.US);
        assertEquals("Thu, 01 Jan 1970 02:00:00 GMT+02:00",
                format.format(new Date(0L)));
    }

    @Test
    public void testSetTimezoneAffectsFormatting() throws Exception {
        StdDateFormat format = new StdDateFormat();
        format.setTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        assertEquals("1970-01-01T02:00:00.000+0200",
                format.format(new Date(0L), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testSetLenientFalseIsRetained() throws Exception {
        StdDateFormat format = new StdDateFormat();
        format.setLenient(false);
        assertFalse(format.isLenient());
    }

    @Test
    public void testParsePositiveLongMaximum() throws Exception {
        assertEquals(Long.MAX_VALUE, new StdDateFormat().parse("9223372036854775807").getTime());
    }

    @Test
    public void testParseNegativeLongMinimum() throws Exception {
        assertEquals(Long.MIN_VALUE, new StdDateFormat().parse("-9223372036854775808").getTime());
    }

    @Test
    public void testParsePositiveLongOverflowFails() throws Exception {
        try {
            new StdDateFormat().parse("9223372036854775808");
            fail("expected ParseException");
        } catch (ParseException expected) { }
    }

    @Test
    public void testParseNegativeTimestamp() throws Exception {
        assertEquals(-1L, new StdDateFormat().parse("-1").getTime());
    }

    @Test
    public void testParseIsoZuluWithoutMillis() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("1970-01-01T00:00:00Z").getTime());
    }

    @Test
    public void testParseIsoPlainDate() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("1970-01-01").getTime());
    }

    @Test
    public void testParseIsoTimezoneColon() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("1970-01-01T02:00:00+02:00").getTime());
    }

    @Test
    public void testParseIsoTimezoneWithoutMinutes() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("1970-01-01T02:00:00+02").getTime());
    }

    @Test
    public void testParseRfc1123() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("Thu, 01 Jan 1970 00:00:00 GMT").getTime());
    }

    @Test
    public void testParsePositionTimestamp() throws Exception {
        ParsePosition position = new ParsePosition(0);
        Date result = new StdDateFormat().parse("123", position);
        assertEquals(123L, result.getTime());
        assertEquals(0, position.getIndex());
    }

    @Test
    public void testFormatUtcEpoch() throws Exception {
        StdDateFormat format = new StdDateFormat();
        assertEquals("1970-01-01T00:00:00.000+0000",
                format.format(new Date(0L), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testToStringIncludesLocale() throws Exception {
        assertTrue(new StdDateFormat().toString().contains("locale: en_US"));
    }

    @Test
    public void testHashCodeIsIdentityHash() throws Exception {
        StdDateFormat format = new StdDateFormat();
        assertEquals(System.identityHashCode(format), format.hashCode());
    }
}
