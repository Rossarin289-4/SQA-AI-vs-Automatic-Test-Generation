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
    public void testDefaultTimeZoneIsGMT() throws Exception {
        assertEquals("GMT", StdDateFormat.getDefaultTimeZone().getID());
    }

    @Test
    public void testWithTimeZoneSetsRequestedZone() throws Exception {
        StdDateFormat format = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        assertEquals("1970-01-01T02:00:00.000+0200",
                format.format(new Date(0), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testWithNullTimeZoneUsesDefault() throws Exception {
        StdDateFormat format = new StdDateFormat().withTimeZone(null);
        assertEquals("1970-01-01T00:00:00.000+0000",
                format.format(new Date(0), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testWithSameTimeZoneReturnsSameInstance() throws Exception {
        StdDateFormat original = new StdDateFormat(TimeZone.getTimeZone("GMT"), Locale.US);
        assertSame(original, original.withTimeZone(TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testWithLocaleReturnsConfiguredLocale() throws Exception {
        StdDateFormat format = new StdDateFormat().withLocale(Locale.FRANCE);
        assertEquals(0L, format.parse("1970-01-01").getTime());
    }

    @Test
    public void testClonePreservesTimezoneForFormatting() throws Exception {
        StdDateFormat original = new StdDateFormat(TimeZone.getTimeZone("GMT+02:00"), Locale.US);
        StdDateFormat copy = original.clone();
        assertEquals("1970-01-01T02:00:00.000+0200",
                copy.format(new Date(0), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testBlueprintIsoFormatUsesGMT() throws Exception {
        assertEquals("1970-01-01T00:00:00.000+0000",
                StdDateFormat.getBlueprintISO8601Format().format(new Date(0)));
    }

    @Test
    public void testIsoFormatUsesRequestedTimezone() throws Exception {
        DateFormat format = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("GMT+02:00"));
        assertEquals("1970-01-01T02:00:00.000+0200", format.format(new Date(0)));
    }

    @Test
    public void testBlueprintRfcFormatUsesGMT() throws Exception {
        assertEquals("Thu, 01 Jan 1970 00:00:00 GMT",
                StdDateFormat.getBlueprintRFC1123Format().format(new Date(0)));
    }

    @Test
    public void testRfcFormatUsesLocaleAndTimezone() throws Exception {
        DateFormat format = StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("GMT+02:00"), Locale.US);
        assertEquals("Thu, 01 Jan 1970 02:00:00 GMT+02:00", format.format(new Date(0)));
    }

    @Test
    public void testSetTimeZoneChangesFormatting() throws Exception {
        StdDateFormat format = new StdDateFormat();
        format.setTimeZone(TimeZone.getTimeZone("GMT+01:00"));
        assertEquals("1970-01-01T01:00:00.000+0100",
                format.format(new Date(0), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testParsePlainIsoDate() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("1970-01-01").getTime());
    }

    @Test
    public void testParseIsoZuluWithoutMilliseconds() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("1970-01-01T00:00:00Z").getTime());
    }

    @Test
    public void testParseIsoOffsetWithColon() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("1970-01-01T02:00:00+02:00").getTime());
    }

    @Test
    public void testParseIsoOffsetWithoutMinutes() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("1970-01-01T02:00:00+02").getTime());
    }

    @Test
    public void testParseEpochZero() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("0").getTime());
    }

    @Test
    public void testParseNegativeEpoch() throws Exception {
        assertEquals(-1L, new StdDateFormat().parse("-1").getTime());
    }

    @Test
    public void testParseLargestPositiveLongTimestamp() throws Exception {
        assertEquals(Long.MAX_VALUE, new StdDateFormat().parse("9223372036854775807").getTime());
    }

    @Test
    public void testParseFirstPositiveTimestampOutsideLongRangeThrows() throws Exception {
        try {
            new StdDateFormat().parse("9223372036854775808");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertTrue(expected.getErrorOffset() >= 0);
        }
    }

    @Test
    public void testParseRfc1123Date() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("Thu, 01 Jan 1970 00:00:00 GMT").getTime());
    }

    @Test
    public void testParseFailureThrowsParseException() throws Exception {
        try {
            new StdDateFormat().parse("not a date");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertTrue(expected.getErrorOffset() >= 0);
        }
    }

    @Test
    public void testFormatEpochInUtc() throws Exception {
        assertEquals("1970-01-01T00:00:00.000+0000",
                new StdDateFormat().format(new Date(0), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testToStringIncludesConfiguredTimezoneAndLocale() throws Exception {
        StdDateFormat format = new StdDateFormat(TimeZone.getTimeZone("GMT+02:00"), Locale.US);
        assertTrue(format.toString().contains("GMT+02:00"));
        assertTrue(format.toString().contains("en_US"));
    }
}
