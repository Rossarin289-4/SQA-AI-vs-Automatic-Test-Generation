package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.fasterxml.jackson.core.io.NumberInput;

public class StdDateFormatTest {
    @Test
    public void testDefaultTimeZoneIsUtc() throws Exception {
        assertEquals("UTC", StdDateFormat.getDefaultTimeZone().getID());
    }

    @Test
    public void testDefaultConfigurationAndPattern() throws Exception {
        StdDateFormat format = new StdDateFormat();
        assertNull(format.getTimeZone());
        assertTrue(format.isLenient());
        assertFalse(format.isColonIncludedInTimeZone());
        assertEquals("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]",
                format.toPattern());
    }

    @Test
    public void testWithSameTimezoneReturnsThis() throws Exception {
        StdDateFormat format = new StdDateFormat();
        assertSame(format, format.withTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testWithTimezoneCreatesConfiguredInstance() throws Exception {
        StdDateFormat format = new StdDateFormat();
        StdDateFormat configured = format.withTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        assertNotSame(format, configured);
        assertEquals(2 * 60 * 60 * 1000, configured.getTimeZone().getRawOffset());
        assertNull(format.getTimeZone());
    }

    @Test
    public void testWithSameLocaleReturnsThis() throws Exception {
        StdDateFormat format = new StdDateFormat();
        assertSame(format, format.withLocale(Locale.US));
    }

    @Test
    public void testWithDifferentLocaleCreatesInstance() throws Exception {
        StdDateFormat format = new StdDateFormat();
        StdDateFormat configured = format.withLocale(Locale.FRANCE);
        assertNotSame(format, configured);
        assertNull(configured.getTimeZone());
    }

    @Test
    public void testWithLenientChangesAndPreservesExplicitSetting() throws Exception {
        StdDateFormat format = new StdDateFormat();
        StdDateFormat strict = format.withLenient(Boolean.FALSE);
        assertNotSame(format, strict);
        assertFalse(strict.isLenient());
        assertSame(strict, strict.withLenient(Boolean.FALSE));
    }

    @Test
    public void testWithNullLeniencyUsesDefault() throws Exception {
        StdDateFormat strict = new StdDateFormat().withLenient(Boolean.FALSE);
        StdDateFormat reset = strict.withLenient(null);
        assertTrue(reset.isLenient());
        assertNull(strict.withLenient(null).withLenient(null).toString().contains("lenient: false") ? "bad" : null);
    }

    @Test
    public void testWithColonSetting() throws Exception {
        StdDateFormat format = new StdDateFormat();
        assertSame(format, format.withColonInTimeZone(false));
        StdDateFormat colon = format.withColonInTimeZone(true);
        assertNotSame(format, colon);
        assertTrue(colon.isColonIncludedInTimeZone());
    }

    @Test
    public void testCloneHasEquivalentConfigurationButDistinctIdentity() throws Exception {
        StdDateFormat format = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("GMT+02:00"))
                .withLenient(Boolean.FALSE).withColonInTimeZone(true);
        StdDateFormat copy = format.clone();
        assertNotSame(format, copy);
        assertEquals(format.getTimeZone(), copy.getTimeZone());
        assertEquals(format.isLenient(), copy.isLenient());
        assertEquals(format.isColonIncludedInTimeZone(), copy.isColonIncludedInTimeZone());
    }

    @Test
    public void testSetTimezone() throws Exception {
        StdDateFormat format = new StdDateFormat();
        TimeZone tz = TimeZone.getTimeZone("GMT-03:00");
        format.setTimeZone(tz);
        assertSame(tz, format.getTimeZone());
    }

    @Test
    public void testSetLeniency() throws Exception {
        StdDateFormat format = new StdDateFormat();
        format.setLenient(false);
        assertFalse(format.isLenient());
        format.setLenient(true);
        assertTrue(format.isLenient());
    }

    @Test
    public void testFormatEpochInUtcWithoutColon() throws Exception {
        StdDateFormat format = new StdDateFormat();
        StringBuffer out = new StringBuffer();
        assertSame(out, format.format(new Date(0L), out, new FieldPosition(0)));
        assertEquals("1970-01-01T00:00:00.000+0000", out.toString());
    }

    @Test
    public void testFormatEpochInUtcWithColon() throws Exception {
        StdDateFormat format = new StdDateFormat().withColonInTimeZone(true);
        assertEquals("1970-01-01T00:00:00.000+00:00",
                format.format(new Date(0L), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatPositiveTimezoneOffset() throws Exception {
        StdDateFormat format = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("GMT+02:30"));
        assertEquals("1970-01-01T02:30:00.000+0230",
                format.format(new Date(0L), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testParseSignedLongTimestampEdges() throws Exception {
        StdDateFormat format = new StdDateFormat();
        assertEquals(Long.MAX_VALUE, format.parse("9223372036854775807").getTime());
        assertEquals(Long.MIN_VALUE, format.parse("-9223372036854775808").getTime());
    }

    @Test
    public void testParseTimestampOutsideLongRangeFails() throws Exception {
        try {
            new StdDateFormat().parse("9223372036854775808");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertTrue(expected.getErrorOffset() >= 0);
        }
    }

    @Test
    public void testParsePlainDate() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("1970-01-01").getTime());
    }

    @Test
    public void testParseIsoDateTimeWithMillisecondsAndUtcOffset() throws Exception {
        assertEquals(0L, new StdDateFormat().parse("1970-01-01T02:00:00+02:00").getTime());
    }

    @Test
    public void testParseIsoFractionTruncatesToMilliseconds() throws Exception {
        assertEquals(123L, new StdDateFormat().parse("1970-01-01T00:00:00.1239Z").getTime());
    }

    @Test
    public void testParseIsoAllowsNineFractionDigits() throws Exception {
        assertEquals(123L, new StdDateFormat().parse("1970-01-01T00:00:00.123456789Z").getTime());
    }

    @Test
    public void testParseIsoRejectsFractionLongerThanNineDigits() throws Exception {
        try {
            new StdDateFormat().parse("1970-01-01T00:00:00.1234567890Z");
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
    public void testParseInvalidDateThrows() throws Exception {
        try {
            new StdDateFormat().parse("not a date");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertTrue(expected.getErrorOffset() >= 0);
        }
    }

    @Test
    public void testEqualityIsIdentityBased() throws Exception {
        StdDateFormat first = new StdDateFormat();
        StdDateFormat second = new StdDateFormat();
        assertTrue(first.equals(first));
        assertFalse(first.equals(second));
        assertEquals(System.identityHashCode(first), first.hashCode());
    }

    @Test
    public void testToStringIncludesConfiguration() throws Exception {
        StdDateFormat format = new StdDateFormat().withLenient(Boolean.FALSE);
        assertTrue(format.toString().contains("lenient: false"));
    }

    @Test
    public void testStaticDateFormatFactoriesReturnUsableFormats() throws Exception {
        DateFormat iso = StdDateFormat.getISO8601Format(TimeZone.getTimeZone("UTC"), Locale.US);
        DateFormat rfc = StdDateFormat.getRFC1123Format(TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals(0L, iso.parse("1970-01-01T00:00:00.000+0000").getTime());
        assertEquals(0L, rfc.parse("Thu, 01 Jan 1970 00:00:00 GMT").getTime());
    }
}
