package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

public class DateTimeFormatterTest {
    @Test
    public void testPrinterAndParserCapabilities() throws Exception {
        DateTimePrinter printer = new DateTimePrinter() {
            public int estimatePrintedLength() { return 0; }
            public void printTo(StringBuffer buf, long instant, Chronology chrono,
                    int displayOffset, DateTimeZone displayZone, Locale locale) { }
            public void printTo(Writer out, long instant, Chronology chrono,
                    int displayOffset, DateTimeZone displayZone, Locale locale) { }
            public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) { }
            public void printTo(Writer out, ReadablePartial partial, Locale locale) { }
        };
        DateTimeParser parser = new DateTimeParser() {
            public int estimateParsedLength() { return 0; }
            public int parseInto(DateTimeParserBucket bucket, String text, int position) {
                return position;
            }
        };
        DateTimeFormatter formatter = new DateTimeFormatter(printer, parser);
        assertTrue(formatter.isPrinter());
        assertSame(printer, formatter.getPrinter());
        assertTrue(formatter.isParser());
        assertSame(parser, formatter.getParser());
    }

    @Test
    public void testCapabilitiesWhenUnavailable() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertFalse(formatter.isPrinter());
        assertNull(formatter.getPrinter());
        assertFalse(formatter.isParser());
        assertNull(formatter.getParser());
    }

    @Test
    public void testLocaleModifierPreservesOriginalAndRecognizesSameLocale() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter french = formatter.withLocale(Locale.FRENCH);
        assertSame(Locale.FRENCH, french.getLocale());
        assertNull(formatter.getLocale());
        assertSame(french, french.withLocale(Locale.FRENCH));
    }

    @Test
    public void testNullLocaleModifier() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null).withLocale(Locale.FRENCH);
        DateTimeFormatter result = formatter.withLocale(null);
        assertNull(result.getLocale());
        assertSame(result, result.withLocale(null));
    }

    @Test
    public void testOffsetParsedModifierIsIdempotent() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter offset = formatter.withOffsetParsed();
        assertTrue(offset.isOffsetParsed());
        assertFalse(formatter.isOffsetParsed());
        assertSame(offset, offset.withOffsetParsed());
    }

    @Test
    public void testChronologyModifierAndDeprecatedGetter() throws Exception {
        Chronology chronology = new DateTime(0L).getChronology();
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter changed = formatter.withChronology(chronology);
        assertSame(chronology, changed.getChronology());
        assertSame(chronology, changed.getChronolgy());
        assertNull(formatter.getChronology());
        assertSame(changed, changed.withChronology(chronology));
    }

    @Test
    public void testZoneOverrideClearsOffsetParsed() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null).withOffsetParsed();
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        DateTimeFormatter changed = formatter.withZone(zone);
        assertSame(zone, changed.getZone());
        assertFalse(changed.isOffsetParsed());
        assertTrue(formatter.isOffsetParsed());
        assertSame(changed, changed.withZone(zone));
    }

    @Test
    public void testNullZoneOverride() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null).withZone(DateTimeZone.UTC);
        DateTimeFormatter changed = formatter.withZone(null);
        assertNull(changed.getZone());
        assertSame(changed, changed.withZone(null));
    }

    @Test
    public void testUtcZoneModifier() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter utc = formatter.withZoneUTC();
        assertSame(DateTimeZone.UTC, utc.getZone());
        assertFalse(utc.isOffsetParsed());
    }

    @Test
    public void testPivotYearIntegerAndNull() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter pivot = formatter.withPivotYear(Integer.valueOf(2000));
        assertEquals(Integer.valueOf(2000), pivot.getPivotYear());
        assertNull(formatter.getPivotYear());
        assertSame(pivot, pivot.withPivotYear(Integer.valueOf(2000)));
        assertNull(pivot.withPivotYear((Integer) null).getPivotYear());
    }

    @Test
    public void testPivotYearPrimitiveBoundaryValues() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertEquals(Integer.valueOf(Integer.MIN_VALUE),
                formatter.withPivotYear(Integer.MIN_VALUE).getPivotYear());
        assertEquals(Integer.valueOf(Integer.MAX_VALUE),
                formatter.withPivotYear(Integer.MAX_VALUE).getPivotYear());
    }

    @Test
    public void testDefaultYearInitialValueAndChanges() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertEquals(2000, formatter.getDefaultYear());
        DateTimeFormatter changed = formatter.withDefaultYear(2000);
        assertEquals(2000, changed.getDefaultYear());
        assertEquals(2000, formatter.getDefaultYear());
    }

    @Test
    public void testDefaultYearIntegerEdges() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertEquals(Integer.MIN_VALUE,
                formatter.withDefaultYear(Integer.MIN_VALUE).getDefaultYear());
        assertEquals(Integer.MAX_VALUE,
                formatter.withDefaultYear(Integer.MAX_VALUE).getDefaultYear());
    }

    @Test
    public void testOffsetThenChronologyKeepsOffsetSetting() throws Exception {
        Chronology chronology = new DateTime(0L).getChronology();
        DateTimeFormatter changed = new DateTimeFormatter(null, null)
                .withOffsetParsed().withChronology(chronology);
        assertTrue(changed.isOffsetParsed());
        assertSame(chronology, changed.getChronology());
    }

    @Test
    public void testChronologyThenOffsetKeepsChronology() throws Exception {
        Chronology chronology = new DateTime(0L).getChronology();
        DateTimeFormatter changed = new DateTimeFormatter(null, null)
                .withChronology(chronology).withOffsetParsed();
        assertTrue(changed.isOffsetParsed());
        assertSame(chronology, changed.getChronology());
    }

    @Test
    public void testZoneThenChronologyKeepsBothOverrides() throws Exception {
        Chronology chronology = new DateTime(0L).getChronology();
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        DateTimeFormatter changed = new DateTimeFormatter(null, null)
                .withZone(zone).withChronology(chronology);
        assertSame(zone, changed.getZone());
        assertSame(chronology, changed.getChronology());
    }

    @Test
    public void testPivotAndDefaultYearRemainIndependent() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null)
                .withPivotYear(2050).withDefaultYear(2024);
        assertEquals(Integer.valueOf(2050), formatter.getPivotYear());
        assertEquals(2024, formatter.getDefaultYear());
    }

    @Test
    public void testPrintingWithoutPrinterThrows() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.print(0L);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertFalse(formatter.isPrinter());
    }

    @Test
    public void testParsingWithoutParserThrows() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        try {
            formatter.parseMillis("2000");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertFalse(formatter.isParser());
    }

    @Test
    public void testParseLocalDateFromPattern() throws Exception {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        LocalDate parsed = formatter.parseLocalDate("2000-02-29");
        assertEquals(new LocalDate(2000, 2, 29), parsed);
    }

    @Test
    public void testParseLocalTimeFromPattern() throws Exception {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm:ss");
        LocalTime parsed = formatter.parseLocalTime("23:59:59");
        assertEquals(new LocalTime(23, 59, 59, 0), parsed);
    }

    @Test
    public void testParseLocalDateTimeAtDayBoundary() throws Exception {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parsed = formatter.parseLocalDateTime("2000-02-29 00:00");
        assertEquals(new LocalDateTime(2000, 2, 29, 0, 0), parsed);
    }

    @Test
    public void testParseDateTimeWithOffsetParsed() throws Exception {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZZ")
                .withOffsetParsed();
        DateTime parsed = formatter.parseDateTime("2000-01-01T00:00:00+02:00");
        assertEquals(DateTimeZone.forOffsetHours(2), parsed.getZone());
        assertEquals(new DateTime(2000, 1, 1, 0, 0, 0, 0,
                DateTimeZone.forOffsetHours(2)), parsed);
    }

    @Test
    public void testParseMutableDateTimeWithZoneOverride() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm")
                .withZone(zone);
        MutableDateTime parsed = formatter.parseMutableDateTime("2000-01-01 00:00");
        assertEquals(zone, parsed.getZone());
        assertEquals(new DateTime(2000, 1, 1, 0, 0, 0, 0, zone).getMillis(),
                parsed.getMillis());
    }

    @Test
    public void testParseLocalDateRejectsTrailingText() throws Exception {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        try {
            formatter.parseLocalDate("2000-01-01x");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(new LocalDate(2000, 1, 1), formatter.parseLocalDate("2000-01-01"));
    }

    @Test
    public void testParseDateTimeRejectsInvalidDate() throws Exception {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        try {
            formatter.parseDateTime("2001-02-29");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(new LocalDate(2001, 2, 28),
                formatter.parseLocalDate("2001-02-28"));
    }
}
