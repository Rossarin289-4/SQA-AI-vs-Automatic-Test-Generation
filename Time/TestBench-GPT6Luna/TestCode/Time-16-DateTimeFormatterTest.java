package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

public class DateTimeFormatterTest {
    @Test
    public void testCapabilitiesAndNullComponents() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertFalse(formatter.isPrinter());
        assertNull(formatter.getPrinter());
        assertFalse(formatter.isParser());
        assertNull(formatter.getParser());
    }

    @Test
    public void testLocaleStateAndIdentity() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter french = formatter.withLocale(Locale.FRENCH);
        assertSame(formatter, formatter.withLocale(null));
        assertSame(french, french.withLocale(Locale.FRENCH));
        assertEquals(Locale.FRENCH, french.getLocale());
        assertNull(formatter.getLocale());
    }

    @Test
    public void testOffsetParsedStateAndIdentity() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter enabled = formatter.withOffsetParsed();
        assertTrue(enabled.isOffsetParsed());
        assertSame(enabled, enabled.withOffsetParsed());
        assertFalse(formatter.isOffsetParsed());
    }

    @Test
    public void testChronologyOverrideState() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        Chronology chronology = DateTimeUtils.getChronology(null);
        DateTimeFormatter changed = formatter.withChronology(chronology);
        assertSame(chronology, changed.getChronology());
        assertSame(chronology, changed.getChronolgy());
        assertSame(changed, changed.withChronology(chronology));
        assertNull(formatter.getChronology());
    }

    @Test
    public void testZoneOverrideAndUtc() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        DateTimeFormatter changed = formatter.withZone(zone);
        assertSame(zone, changed.getZone());
        assertSame(changed, changed.withZone(zone));
        assertNull(formatter.getZone());
        assertSame(DateTimeZone.UTC, formatter.withZoneUTC().getZone());
    }

    @Test
    public void testZoneClearsOffsetParsedState() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null).withOffsetParsed();
        DateTimeFormatter changed = formatter.withZone(DateTimeZone.UTC);
        assertFalse(changed.isOffsetParsed());
        assertSame(DateTimeZone.UTC, changed.getZone());
    }

    @Test
    public void testPivotYearIntegerStateAndIdentity() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter changed = formatter.withPivotYear(Integer.valueOf(2000));
        assertEquals(Integer.valueOf(2000), changed.getPivotYear());
        assertSame(changed, changed.withPivotYear(Integer.valueOf(2000)));
        assertNull(formatter.getPivotYear());
    }

    @Test
    public void testPivotYearIntegerBoundaries() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter minimum = formatter.withPivotYear(Integer.valueOf(Integer.MIN_VALUE));
        DateTimeFormatter maximum = formatter.withPivotYear(Integer.valueOf(Integer.MAX_VALUE));
        assertEquals(Integer.valueOf(Integer.MIN_VALUE), minimum.getPivotYear());
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), maximum.getPivotYear());
        assertNull(formatter.withPivotYear((Integer) null).getPivotYear());
    }

    @Test
    public void testPivotYearPrimitiveOverload() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertEquals(Integer.valueOf(2024), formatter.withPivotYear(2024).getPivotYear());
        assertEquals(Integer.valueOf(Integer.MIN_VALUE),
                formatter.withPivotYear(Integer.MIN_VALUE).getPivotYear());
    }

    @Test
    public void testDefaultYearDefaultAndReplacement() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertEquals(2000, formatter.getDefaultYear());
        assertEquals(1999, formatter.withDefaultYear(1999).getDefaultYear());
        assertEquals(Integer.MIN_VALUE,
                formatter.withDefaultYear(Integer.MIN_VALUE).getDefaultYear());
        assertEquals(Integer.MAX_VALUE,
                formatter.withDefaultYear(Integer.MAX_VALUE).getDefaultYear());
    }

    @Test
    public void testParseMillisRequiresParser() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.parseMillis("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testParseDateTimeRequiresParser() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.parseDateTime("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testParseMutableDateTimeRequiresParser() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.parseMutableDateTime("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testParseLocalDateRequiresParser() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.parseLocalDate("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testParseLocalTimeRequiresParser() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.parseLocalTime("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testParseLocalDateTimeRequiresParser() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.parseLocalDateTime("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testPrintRequiresPrinter() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.print(0L);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testPrintPartialRequiresPrinter() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.print((ReadablePartial) null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testParseIntoRequiresParser() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.parseInto(null, "x", 0);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }
}
