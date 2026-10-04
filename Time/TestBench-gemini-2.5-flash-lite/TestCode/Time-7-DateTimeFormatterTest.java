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
import org.joda.time.chrono.ISOChronology;
import org.joda.time.DateTimeFieldType;

public class DateTimeFormatterTest {

    // Helper method to create a dummy printer and parser for testing configurations.
    private static DateTimeFormatter createFormatter() {
        DateTimePrinter printer = new DateTimePrinter() {
            @Override
            public int estimatePrintedLength() { return 16; }

            @Override
            public void printTo(StringBuffer buf, long instant, Chronology chrono, int displayOffset, DateTimeZone displayZone, Locale locale) {
                buf.append("PRINTED_INSTANT");
            }
            @Override
            public void printTo(Writer out, long instant, Chronology chrono, int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {
                out.write("PRINTED_INSTANT");
            }
            @Override
            public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {
                buf.append("PRINTED_PARTIAL");
            }
            @Override
            public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {
                out.write("PRINTED_PARTIAL");
            }
        };
        DateTimeParser parser = new DateTimeParser() {
            @Override
            public int estimateParsedLength() { return 16; }

            @Override
            public int parseInto(DateTimeParserBucket bucket, String text, int position) {
                if (text.substring(position).startsWith("PARSE_ME")) {
                    bucket.saveField(DateTimeFieldType.year(), 2023);
                    bucket.saveField(DateTimeFieldType.monthOfYear(), 10);
                    bucket.saveField(DateTimeFieldType.dayOfMonth(), 26);
                    return position + 8;
                }
                return ~position; // Indicate parse failure
            }
        };
        return new DateTimeFormatter(printer, parser);
    }

    @Test
    public void testIsPrinter_whenPrinterExists() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        assertTrue("Formatter should report it is a printer", formatter.isPrinter());
    }

    @Test
    public void testGetPrinter_returnsCorrectPrinter() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        assertNotNull("Printer should not be null", formatter.getPrinter());
    }

    @Test
    public void testIsParser_whenParserExists() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        assertTrue("Formatter should report it is a parser", formatter.isParser());
    }

    @Test
    public void testGetParser_returnsCorrectParser() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        assertNotNull("Parser should not be null", formatter.getParser());
    }

    @Test
    public void testWithLocale_returnsNewInstance() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        Locale originalLocale = Locale.getDefault();
        Locale newLocale = Locale.FRANCE;
        DateTimeFormatter newFormatter = formatter.withLocale(newLocale);
        assertNotSame("withLocale should return a new instance", formatter, newFormatter);
        assertEquals("Locale should be set correctly", newLocale, newFormatter.getLocale());
        Locale.setDefault(originalLocale); // Restore default locale
    }

    @Test
    public void testWithLocale_whenSameLocale() throws Exception {
        DateTimeFormatter formatter = createFormatter().withLocale(Locale.CANADA);
        DateTimeFormatter newFormatter = formatter.withLocale(Locale.CANADA);
        assertSame("withLocale with same locale should return the same instance", formatter, newFormatter);
    }
    
    @Test
    public void testGetLocale_whenNotSet() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(createFormatter().getPrinter(), createFormatter().getParser()); // Constructor without locale
        assertNull("Locale should be null when not explicitly set", formatter.getLocale());
    }

    @Test
    public void testWithOffsetParsed_returnsNewInstance() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        DateTimeFormatter newFormatter = formatter.withOffsetParsed();
        assertNotSame("withOffsetParsed should return a new instance", formatter, newFormatter);
        assertTrue("Offset parsed flag should be true", newFormatter.isOffsetParsed());
    }

    @Test
    public void testWithOffsetParsed_whenAlreadySet() throws Exception {
        DateTimeFormatter formatter = createFormatter().withOffsetParsed();
        DateTimeFormatter newFormatter = formatter.withOffsetParsed();
        assertSame("withOffsetParsed when already true should return the same instance", formatter, newFormatter);
    }

    @Test
    public void testIsOffsetParsed_whenNotSet() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        assertFalse("Offset parsed flag should be false by default", formatter.isOffsetParsed());
    }

    @Test
    public void testWithChronology_returnsNewInstance() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeFormatter newFormatter = formatter.withChronology(chrono);
        assertNotSame("withChronology should return a new instance", formatter, newFormatter);
        assertEquals("Chronology should be set correctly", chrono, newFormatter.getChronology());
    }

    @Test
    public void testWithChronology_whenSameChronology() throws Exception {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeFormatter formatter = createFormatter().withChronology(chrono);
        DateTimeFormatter newFormatter = formatter.withChronology(chrono);
        assertSame("withChronology with same chronology should return the same instance", formatter, newFormatter);
    }
    
    @Test
    public void testGetChronology_whenNotSet() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(createFormatter().getPrinter(), createFormatter().getParser()); // Constructor without chrono
        assertNull("Chronology should be null when not explicitly set", formatter.getChronology());
    }

    @Test
    public void testWithZoneUTC_returnsNewInstance() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        DateTimeFormatter newFormatter = formatter.withZoneUTC();
        assertNotSame("withZoneUTC should return a new instance", formatter, newFormatter);
        assertEquals("Zone should be UTC", DateTimeZone.UTC, newFormatter.getZone());
    }

    @Test
    public void testWithZone_returnsNewInstance() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        DateTimeFormatter newFormatter = formatter.withZone(zone);
        assertNotSame("withZone should return a new instance", formatter, newFormatter);
        assertEquals("Zone should be set correctly", zone, newFormatter.getZone());
    }
    
    @Test
    public void testWithZone_whenSameZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        DateTimeFormatter formatter = createFormatter().withZone(zone);
        DateTimeFormatter newFormatter = formatter.withZone(zone);
        assertSame("withZone with same zone should return the same instance", formatter, newFormatter);
    }

    @Test
    public void getZone_whenNotSet() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(createFormatter().getPrinter(), createFormatter().getParser()); // Constructor without zone
        assertNull("Zone should be null when not explicitly set", formatter.getZone());
    }

    @Test
    public void testWithPivotYear_returnsNewInstance() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        Integer pivotYear = 1980;
        DateTimeFormatter newFormatter = formatter.withPivotYear(pivotYear);
        assertNotSame("withPivotYear(Integer) should return a new instance", formatter, newFormatter);
        assertEquals("Pivot year should be set correctly", pivotYear, newFormatter.getPivotYear());
    }

    @Test
    public void testWithPivotYear_int_returnsNewInstance() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        int pivotYear = 1980;
        DateTimeFormatter newFormatter = formatter.withPivotYear(pivotYear);
        assertNotSame("withPivotYear(int) should return a new instance", formatter, newFormatter);
        assertEquals("Pivot year should be set correctly", Integer.valueOf(pivotYear), newFormatter.getPivotYear());
    }

    @Test
    public void testWithPivotYear_whenSamePivotYear() throws Exception {
        DateTimeFormatter formatter = createFormatter().withPivotYear(1980);
        DateTimeFormatter newFormatter = formatter.withPivotYear(1980);
        assertSame("withPivotYear with same pivot year should return the same instance", formatter, newFormatter);
    }

    @Test
    public void getPivotYear_whenNotSet() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(createFormatter().getPrinter(), createFormatter().getParser()); // Constructor without pivot year
        assertNull("Pivot year should be null when not explicitly set", formatter.getPivotYear());
    }

    @Test
    public void testWithDefaultYear_returnsNewInstance() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        int defaultYear = 2020;
        DateTimeFormatter newFormatter = formatter.withDefaultYear(defaultYear);
        assertNotSame("withDefaultYear should return a new instance", formatter, newFormatter);
        assertEquals("Default year should be set correctly", defaultYear, newFormatter.getDefaultYear());
    }

    @Test
    public void testWithDefaultYear_whenSameDefaultYear() throws Exception {
        DateTimeFormatter formatter = createFormatter().withDefaultYear(2020);
        DateTimeFormatter newFormatter = formatter.withDefaultYear(2020);
        // FIX: Changed assertSame to assertNotSame because the reference code *always*
        // creates a new instance, even if the value is the same.
        assertNotSame("withDefaultYear with same default year should return a new instance", formatter, newFormatter);
    }
    
    @Test
    public void getDefaultYear_whenDefault() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(createFormatter().getPrinter(), createFormatter().getParser()); // Constructor without default year
        assertEquals("Default year should be 2000 by default", 2000, formatter.getDefaultYear());
    }
    
    @Test
    public void testPrint_ReadableInstant_delegatesToPrinter() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        java.util.Date date = new java.util.Date(1678886400000L); // March 15, 2023 12:00:00 AM GMT
        String result = formatter.print((ReadableInstant) new Instant(date.getTime()));
        assertEquals("print(ReadableInstant) should delegate to printer", "PRINTED_INSTANT", result);
    }

    @Test
    public void testPrint_long_delegatesToPrinter() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        String result = formatter.print(1678886400000L); // March 15, 2023 12:00:00 AM GMT
        assertEquals("print(long) should delegate to printer", "PRINTED_INSTANT", result);
    }

    @Test
    public void testPrint_ReadablePartial_delegatesToPrinter() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        ReadablePartial partial = new LocalDate(2023, 10, 26);
        String result = formatter.print(partial);
        assertEquals("print(ReadablePartial) should delegate to printer", "PRINTED_PARTIAL", result);
    }

    @Test
    public void testParseMillis_successfulParse() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        long parsedMillis = formatter.parseMillis("PARSE_ME");
        Chronology iso = ISOChronology.getInstance();
        // Use DateTime constructor that accepts year, month, day for easier creation
        long expectedMillis = new DateTime(2023, 10, 26, 0, 0, 0, 0, iso).getMillis();
        assertEquals("parseMillis should return correct milliseconds", expectedMillis, parsedMillis);
    }

    @Test
    public void testParseMillis_parseFailure() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        try {
            formatter.parseMillis("INVALID_TEXT");
            fail("Should throw IllegalArgumentException for invalid text");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testParseLocalDate_successfulParse() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        LocalDate parsedDate = formatter.parseLocalDate("PARSE_ME");
        assertEquals("parseLocalDate should return correct date", new LocalDate(2023, 10, 26), parsedDate);
    }

    @Test
    public void testParseLocalDate_parseFailure() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        try {
            formatter.parseLocalDate("INVALID_TEXT");
            fail("Should throw IllegalArgumentException for invalid text");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
    
    @Test
    public void testParseLocalTime_successfulParse() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        LocalTime parsedTime = formatter.parseLocalTime("PARSE_ME");
        assertEquals("parseLocalTime should return default time when not parsed", LocalTime.MIDNIGHT, parsedTime);
    }

    @Test
    public void testParseLocalTime_parseFailure() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        try {
            formatter.parseLocalTime("INVALID_TEXT");
            fail("Should throw IllegalArgumentException for invalid text");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testParseLocalDateTime_successfulParse() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        LocalDateTime parsedDateTime = formatter.parseLocalDateTime("PARSE_ME");
        assertEquals("parseLocalDateTime should return correct date and time", new LocalDateTime(2023, 10, 26, 0, 0, 0, 0), parsedDateTime);
    }
    
    @Test
    public void testParseLocalDateTime_parseFailure() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        try {
            formatter.parseLocalDateTime("INVALID_TEXT");
            fail("Should throw IllegalArgumentException for invalid text");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testParseDateTime_successfulParse_withDefaultZone() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        DateTime parsedDateTime = formatter.parseDateTime("PARSE_ME");
        Chronology iso = ISOChronology.getInstance();
        DateTime expectedDateTime = new DateTime(2023, 10, 26, 0, 0, 0, 0, iso);
        assertEquals("parseDateTime should return correct DateTime with default zone", expectedDateTime, parsedDateTime);
    }

    @Test
    public void testParseDateTime_successfulParse_withSpecifiedZone() throws Exception {
        DateTimeZone londonZone = DateTimeZone.forID("Europe/London");
        DateTimeFormatter formatter = createFormatter().withZone(londonZone);
        DateTime parsedDateTime = formatter.parseDateTime("PARSE_ME");
        Chronology isoLondon = ISOChronology.getInstance(londonZone);
        DateTime expectedDateTime = new DateTime(2023, 10, 26, 0, 0, 0, 0, isoLondon);
        assertEquals("parseDateTime should return correct DateTime with specified zone", expectedDateTime, parsedDateTime);
    }

    @Test
    public void testParseDateTime_parseFailure() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        try {
            formatter.parseDateTime("INVALID_TEXT");
            fail("Should throw IllegalArgumentException for invalid text");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testParseMutableDateTime_successfulParse_withDefaultZone() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        MutableDateTime parsedDateTime = formatter.parseMutableDateTime("PARSE_ME");
        Chronology iso = ISOChronology.getInstance();
        MutableDateTime expectedDateTime = new MutableDateTime(2023, 10, 26, 0, 0, 0, 0, iso);
        assertEquals("parseMutableDateTime should return correct MutableDateTime with default zone", expectedDateTime, parsedDateTime);
    }

    @Test
    public void testParseMutableDateTime_successfulParse_withSpecifiedZone() throws Exception {
        DateTimeZone parisZone = DateTimeZone.forID("Europe/Paris");
        DateTimeFormatter formatter = createFormatter().withZone(parisZone);
        MutableDateTime parsedDateTime = formatter.parseMutableDateTime("PARSE_ME");
        Chronology isoParis = ISOChronology.getInstance(parisZone);
        MutableDateTime expectedDateTime = new MutableDateTime(2023, 10, 26, 0, 0, 0, 0, isoParis);
        assertEquals("parseMutableDateTime should return correct MutableDateTime with specified zone", expectedDateTime, parsedDateTime);
    }
    
    @Test
    public void testParseMutableDateTime_parseFailure() throws Exception {
        DateTimeFormatter formatter = createFormatter();
        try {
            formatter.parseMutableDateTime("INVALID_TEXT");
            fail("Should throw IllegalArgumentException for invalid text");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
