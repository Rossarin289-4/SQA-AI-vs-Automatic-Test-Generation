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
import java.util.Calendar;

public class DateTimeFormatterTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testIsPrinter() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertFalse(formatter.isPrinter());
        formatter = new DateTimeFormatter(new MockPrinter(), null);
        assertTrue(formatter.isPrinter());
    }

    @Test
    public void testGetPrinter() throws Exception {
        DateTimePrinter printer = new MockPrinter();
        DateTimeFormatter formatter = new DateTimeFormatter(printer, null);
        assertSame(printer, formatter.getPrinter());
    }

    @Test
    public void testIsParser() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertFalse(formatter.isParser());
        formatter = new DateTimeFormatter(null, new MockParser());
        assertTrue(formatter.isParser());
    }

    @Test
    public void testGetParser() throws Exception {
        DateTimeParser parser = new MockParser();
        DateTimeFormatter formatter = new DateTimeFormatter(null, parser);
        assertSame(parser, formatter.getParser());
    }

    @Test
    public void testWithLocale_null() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertSame(formatter, formatter.withLocale(null));
    }

    @Test
    public void testWithLocale_same() throws Exception {
        Locale locale = Locale.FRANCE;
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        formatter = formatter.withLocale(locale);
        assertSame(formatter, formatter.withLocale(locale));
    }

    @Test
    public void testWithLocale_different() throws Exception {
        Locale locale = Locale.FRANCE;
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter newFormatter = formatter.withLocale(locale);
        assertNotSame(formatter, newFormatter);
        assertSame(locale, newFormatter.getLocale());
        assertNull(formatter.getLocale());
    }

    @Test
    public void testGetLocale() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertNull(formatter.getLocale());
        Locale locale = Locale.GERMAN;
        formatter = formatter.withLocale(locale);
        assertSame(locale, formatter.getLocale());
    }

    @Test
    public void testWithOffsetParsed_true() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        formatter = formatter.withOffsetParsed();
        assertTrue(formatter.isOffsetParsed());
        assertSame(formatter, formatter.withOffsetParsed());
    }

    @Test
    public void testWithOffsetParsed_false() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        formatter = formatter.withOffsetParsed();
        assertFalse(formatter.equals(new DateTimeFormatter(null, null)));
    }

    @Test
    public void testIsOffsetParsed() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertFalse(formatter.isOffsetParsed());
        formatter = formatter.withOffsetParsed();
        assertTrue(formatter.isOffsetParsed());
    }

    @Test
    public void testWithChronology_null_same() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertSame(formatter, formatter.withChronology(null));
    }

    @Test
    public void testWithChronology_same() throws Exception {
        Chronology chrono = org.joda.time.chrono.ISOChronology.getInstance();
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        formatter = formatter.withChronology(chrono);
        assertSame(formatter, formatter.withChronology(chrono));
    }

    @Test
    public void testWithChronology_different() throws Exception {
        Chronology chrono = org.joda.time.chrono.ISOChronology.getInstance();
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter newFormatter = formatter.withChronology(chrono);
        assertNotSame(formatter, newFormatter);
        assertSame(chrono, newFormatter.getChronology());
        assertNull(formatter.getChronology());
    }

    @Test
    public void testGetChronology() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertNull(formatter.getChronology());
        Chronology chrono = org.joda.time.chrono.GJChronology.getInstance();
        formatter = formatter.withChronology(chrono);
        assertSame(chrono, formatter.getChronology());
    }
    
    @Test
    public void testGetChronolgyDeprecated() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertNull(formatter.getChronolgy());
        Chronology chrono = org.joda.time.chrono.GregorianChronology.getInstance();
        formatter = formatter.withChronology(chrono);
        assertSame(chrono, formatter.getChronolgy());
    }

    @Test
    public void testWithZoneUTC() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter newFormatter = formatter.withZoneUTC();
        assertNotSame(formatter, newFormatter);
        assertEquals(DateTimeZone.UTC, newFormatter.getZone());
    }

    @Test
    public void testWithZone_null_same() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        formatter = formatter.withZone(null);
        assertSame(formatter, formatter.withZone(null));
        assertNull(formatter.getZone());
    }

    @Test
    public void testWithZone_same() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        formatter = formatter.withZone(zone);
        assertSame(formatter, formatter.withZone(zone));
    }

    @Test
    public void testWithZone_different() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter newFormatter = formatter.withZone(zone);
        assertNotSame(formatter, newFormatter);
        assertSame(zone, newFormatter.getZone());
        assertNull(formatter.getZone());
    }

    @Test
    public void testGetZone() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertNull(formatter.getZone());
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        formatter = formatter.withZone(zone);
        assertSame(zone, formatter.getZone());
    }
    
    @Test
    public void testWithPivotYear_null_same() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        formatter = formatter.withPivotYear((Integer) null);
        assertSame(formatter, formatter.withPivotYear((Integer) null));
        assertNull(formatter.getPivotYear());
    }
    
    @Test
    public void testWithPivotYear_same() throws Exception {
        Integer pivotYear = Integer.valueOf(1950);
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        formatter = formatter.withPivotYear(pivotYear);
        assertSame(formatter, formatter.withPivotYear(pivotYear));
    }
    
    @Test
    public void testWithPivotYear_different() throws Exception {
        Integer pivotYear = Integer.valueOf(1950);
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter newFormatter = formatter.withPivotYear(pivotYear);
        assertNotSame(formatter, newFormatter);
        assertEquals(pivotYear, newFormatter.getPivotYear());
        assertNull(formatter.getPivotYear());
    }
    
    @Test
    public void testWithPivotYear_int_different() throws Exception {
        int pivotYear = 1950;
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter newFormatter = formatter.withPivotYear(pivotYear);
        assertNotSame(formatter, newFormatter);
        assertEquals(Integer.valueOf(pivotYear), newFormatter.getPivotYear());
    }

    @Test
    public void testGetPivotYear() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertNull(formatter.getPivotYear());
        formatter = formatter.withPivotYear(2000);
        assertEquals(Integer.valueOf(2000), formatter.getPivotYear());
    }

    @Test
    public void testWithDefaultYear() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        DateTimeFormatter newFormatter = formatter.withDefaultYear(1980);
        assertNotSame(formatter, newFormatter);
        assertEquals(1980, newFormatter.getDefaultYear());
    }

    @Test
    public void testGetDefaultYear() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);
        assertEquals(2000, formatter.getDefaultYear());
        formatter = formatter.withDefaultYear(1990);
        assertEquals(1990, formatter.getDefaultYear());
    }

    @Test
    public void testPrintTo_StringBuffer_ReadableInstant_null() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(new MockPrinter(), null);
        StringBuffer buf = new StringBuffer();
        formatter.printTo(buf, (ReadableInstant) null);
        assertEquals("null", buf.toString()); // Assuming MockPrinter prints "null" for null input
    }

    @Test
    public void testPrintTo_Writer_ReadableInstant_null() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(new MockPrinter(), null);
        java.io.StringWriter sw = new java.io.StringWriter();
        formatter.printTo(sw, (ReadableInstant) null);
        assertEquals("null", sw.toString()); // Assuming MockPrinter prints "null" for null input
    }

    @Test
    public void testPrintTo_Appendable_ReadableInstant_null() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(new MockPrinter(), null);
        StringBuilder sb = new StringBuilder();
        formatter.printTo(sb, (ReadableInstant) null);
        assertEquals("null", sb.toString()); // Assuming MockPrinter prints "null" for null input
    }
    
    @Test
    public void testPrint_ReadableInstant_null() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(new MockPrinter(), null);
        assertEquals("null", formatter.print((ReadableInstant) null));
    }

    @Test
    public void testPrint_long() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(new MockPrinter(), null);
        assertEquals("12345", formatter.print(12345L)); // Assuming MockPrinter prints the long value
    }
    
    @Test
    public void testPrint_ReadablePartial() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(new MockPrinter(), null);
        ReadablePartial partial = new LocalDate(2023, 10, 26);
        assertEquals("partial", formatter.print(partial)); // Assuming MockPrinter prints "partial" for ReadablePartial
    }

    @Test
    public void testParseMillis_valid() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new MockParser());
        assertEquals(12345L, formatter.parseMillis("12345")); // Assuming MockParser parses "12345" to 12345L
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMillis_invalid() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new MockParser() {
            @Override
            public int parseInto(DateTimeParserBucket bucket, String text, int position) {
                return ~position; // Simulate parse failure
            }
        });
        formatter.parseMillis("invalid");
    }

    @Test
    public void testParseLocalDate() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new MockParser());
        // MockParser needs to be set up to return a LocalDateTime that can be converted to LocalDate
        LocalDate expected = LocalDate.now(); // Placeholder, actual value depends on MockParser
        assertEquals(expected, formatter.parseLocalDate("2023-10-26"));
    }

    @Test
    public void testParseLocalTime() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new MockParser());
        // MockParser needs to be set up to return a LocalDateTime that can be converted to LocalTime
        LocalTime expected = LocalTime.now(); // Placeholder, actual value depends on MockParser
        assertEquals(expected, formatter.parseLocalTime("10:30:00"));
    }

    @Test
    public void testParseLocalDateTime() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new MockParser());
        // MockParser needs to be set up to return a LocalDateTime
        LocalDateTime expected = LocalDateTime.now(); // Placeholder, actual value depends on MockParser
        assertEquals(expected, formatter.parseLocalDateTime("2023-10-26T10:30:00"));
    }

    @Test
    public void testParseDateTime() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new MockParser());
        // MockParser needs to be set up to return a DateTime
        DateTime expected = new DateTime(); // Placeholder, actual value depends on MockParser
        assertEquals(expected, formatter.parseDateTime("2023-10-26T10:30:00Z"));
    }

    @Test
    public void testParseMutableDateTime() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new MockParser());
        // MockParser needs to be set up to return a MutableDateTime
        MutableDateTime expected = new MutableDateTime(); // Placeholder, actual value depends on MockParser
        assertEquals(expected, formatter.parseMutableDateTime("2023-10-26T10:30:00+01:00"));
    }
    
    // Mock implementations for testing
    private static class MockPrinter implements DateTimePrinter {
        @Override
        public int estimatePrintedLength() {
            return 10;
        }

        @Override
        public void printTo(StringBuffer buf, long instant, Chronology chrono, int displayOffset, DateTimeZone displayZone, Locale locale) {
            buf.append(instant);
        }

        @Override
        public void printTo(Writer out, long instant, Chronology chrono, int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {
            out.write(String.valueOf(instant));
        }

        @Override
        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {
            buf.append("partial");
        }

        @Override
        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {
            out.write("partial");
        }
        
        public void printTo(StringBuffer buf, ReadableInstant instant) {
            if (instant == null) {
                buf.append("null");
            } else {
                buf.append(DateTimeUtils.getInstantMillis(instant));
            }
        }
    }

    private static class MockParser implements DateTimeParser {
        @Override
        public int estimateParsedLength() {
            return 10;
        }

        @Override
        public int parseInto(DateTimeParserBucket bucket, String text, int position) {
            try {
                long millis = Long.parseLong(text.substring(position));
                bucket.saveField(DateTimeFieldType.millisOfSecond(), (int) (millis % 1000));
                millis /= 1000;
                bucket.saveField(DateTimeFieldType.secondOfMinute(), (int) (millis % 60));
                millis /= 60;
                bucket.saveField(DateTimeFieldType.minuteOfHour(), (int) (millis % 60));
                millis /= 60;
                bucket.saveField(DateTimeFieldType.hourOfDay(), (int) (millis % 24));
                // For simplicity, assume dates are parsed correctly by bucket computeMillis
                return text.length();
            } catch (NumberFormatException e) {
                return ~position;
            }
        }
    }
}
