package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone; // Added import for TimeZone
import org.joda.time.Chronology;
import org.joda.time.DateTime; // Added import for DateTime
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.MutableDateTime.Property;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.chrono.GregorianChronology; // Added import for Chronology

public class DateTimeFormatterBuilderTest {

    // Helper method to create a DateTimeFormatter with a single literal
    private DateTimeFormatter createFormatterWithLiteral(char literal) {
        return new DateTimeFormatterBuilder().appendLiteral(literal).toFormatter();
    }

    // Helper method to create a DateTimeFormatter with a single string literal
    private DateTimeFormatter createFormatterWithStringLiteral(String literal) {
        return new DateTimeFormatterBuilder().appendLiteral(literal).toFormatter();
    }

    // Helper to create a dummy DateTimeFormatter for testing append(DateTimeFormatter)
    private DateTimeFormatter createDummyFormatter() {
        return new DateTimeFormatterBuilder().appendLiteral('x').toFormatter();
    }

    // Helper to create a dummy DateTimePrinter for testing append(DateTimePrinter)
    private DateTimePrinter createDummyPrinter() {
        return new DateTimeFormatterBuilder().appendLiteral('x').toPrinter();
    }

    // Helper to create a dummy DateTimeParser for testing append(DateTimeParser)
    private DateTimeParser createDummyParser() {
        return new DateTimeFormatterBuilder().appendLiteral('x').toParser();
    }
    
    // Helper method to create a DateTimeFormatter with a printer and parser pair
    private DateTimeFormatter createFormatterWithPair(DateTimePrinter printer, DateTimeParser parser) {
        return new DateTimeFormatterBuilder().append(printer, parser).toFormatter();
    }

    // Helper method to create a DateTimeFormatter with a printer and a list of parsers
    private DateTimeFormatter createFormatterWithPrinterAndParsers(DateTimePrinter printer, DateTimeParser[] parsers) {
        return new DateTimeFormatterBuilder().append(printer, parsers).toFormatter();
    }

    // Helper to create a DateTimeFormatter using appendPattern
    private DateTimeFormatter createFormatterWithPattern(String pattern) {
        return new DateTimeFormatterBuilder().appendPattern(pattern).toFormatter();
    }

    // Helper to create a DateTimeFormatter for a specific field with min/max digits
    private DateTimeFormatter createFormatterForDecimal(DateTimeFieldType fieldType, int minDigits, int maxDigits) {
        return new DateTimeFormatterBuilder().appendDecimal(fieldType, minDigits, maxDigits).toFormatter();
    }

    // Helper to create a DateTimeFormatter for a specific field with fixed digits
    private DateTimeFormatter createFormatterForFixedDecimal(DateTimeFieldType fieldType, int numDigits) {
        return new DateTimeFormatterBuilder().appendFixedDecimal(fieldType, numDigits).toFormatter();
    }

    // Helper to create a DateTimeFormatter for a specific field with signed decimal
    private DateTimeFormatter createFormatterForSignedDecimal(DateTimeFieldType fieldType, int minDigits, int maxDigits) {
        return new DateTimeFormatterBuilder().appendSignedDecimal(fieldType, minDigits, maxDigits).toFormatter();
    }

    // Helper to create a DateTimeFormatter for a specific field with fixed signed decimal
    private DateTimeFormatter createFormatterForFixedSignedDecimal(DateTimeFieldType fieldType, int numDigits) {
        return new DateTimeFormatterBuilder().appendFixedSignedDecimal(fieldType, numDigits).toFormatter();
    }

    // Helper to create a DateTimeFormatter for a text field
    private DateTimeFormatter createFormatterForText(DateTimeFieldType fieldType) {
        return new DateTimeFormatterBuilder().appendText(fieldType).toFormatter();
    }

    // Helper to create a DateTimeFormatter for a short text field
    private DateTimeFormatter createFormatterForShortText(DateTimeFieldType fieldType) {
        return new DateTimeFormatterBuilder().appendShortText(fieldType).toFormatter();
    }

    // Helper to create a DateTimeFormatter for a fraction field
    private DateTimeFormatter createFormatterForFraction(DateTimeFieldType fieldType, int minDigits, int maxDigits) {
        return new DateTimeFormatterBuilder().appendFraction(fieldType, minDigits, maxDigits).toFormatter();
    }

    // Helper to create a DateTimeFormatter for a time zone offset
    private DateTimeFormatter createFormatterForTimeZoneOffset(String zeroOffsetText, boolean showSeparators, int minFields, int maxFields) {
        return new DateTimeFormatterBuilder().appendTimeZoneOffset(zeroOffsetText, showSeparators, minFields, maxFields).toFormatter();
    }

    // Helper to create a DateTimeFormatter for a time zone offset with print/parse zero text
    private DateTimeFormatter createFormatterForTimeZoneOffset(String zeroOffsetPrintText, String zeroOffsetParseText, boolean showSeparators, int minFields, int maxFields) {
        return new DateTimeFormatterBuilder().appendTimeZoneOffset(zeroOffsetPrintText, zeroOffsetParseText, showSeparators, minFields, maxFields).toFormatter();
    }

    // Helper method to get a DateTimeParserBucket.
    // The constructor for DateTimeParserBucket requires a default instant, chronology, locale,
    // and potentially pivot year and offset. For simple parsing tests, we can use default values.
    private DateTimeParserBucket createParserBucket() {
        return new DateTimeParserBucket(
            0L, // default instant
            GregorianChronology.getInstanceUTC(), // default chronology
            Locale.getDefault(), // default locale
            null, // default pivot year
            0 // default offset
        );
    }


    @Test
    public void testToFormatter_emptyBuilder() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().toFormatter();
        assertNotNull(formatter);
        assertNull(formatter.getPrinter());
        assertNull(formatter.getParser());
    }

    @Test
    public void testToFormatter_onlyPrinter() throws Exception {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral('a'); // Appending a literal adds both printer and parser
        // To test only a printer, we can explicitly set the formatter to be just a printer.
        // This is an internal detail, but for testing purposes, it's useful.
        DateTimePrinter printer = builder.toPrinter();
        builder.clear(); // Clear builder
        builder.append(printer); // Append only the printer
        DateTimeFormatter formatter = builder.toFormatter();
        assertNotNull(formatter.getPrinter());
        assertNull(formatter.getParser());
    }

    @Test
    public void testToFormatter_onlyParser() throws Exception {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral('a'); // Appending a literal adds both printer and parser
        // To test only a parser, we can explicitly set the formatter to be just a parser.
        DateTimeParser parser = builder.toParser();
        builder.clear(); // Clear builder
        builder.append(parser); // Append only the parser
        DateTimeFormatter formatter = builder.toFormatter();
        assertNull(formatter.getPrinter());
        assertNotNull(formatter.getParser());
    }
    
    @Test
    public void testToFormatter_printerAndParser() throws Exception {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral('a');
        builder.appendLiteral('b');
        DateTimeFormatter formatter = builder.toFormatter();
        assertNotNull(formatter.getPrinter());
        assertNotNull(formatter.getParser());
    }

    @Test
    public void testCanBuildFormatter_empty() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        assertFalse(builder.canBuildFormatter());
    }

    @Test
    public void testCanBuildFormatter_withLiteral() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral('a');
        assertTrue(builder.canBuildFormatter());
    }
    
    @Test
    public void testCanBuildPrinter_empty() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        assertFalse(builder.canBuildPrinter());
    }

    @Test
    public void testCanBuildPrinter_withLiteral() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral('a');
        assertTrue(builder.canBuildPrinter());
    }

    @Test
    public void testCanBuildParser_empty() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        assertFalse(builder.canBuildParser());
    }
    
    @Test
    public void testCanBuildParser_withLiteral() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral('a');
        assertTrue(builder.canBuildParser());
    }



    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullFormatter() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append((DateTimeFormatter) null);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullPrinter() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append((DateTimePrinter) null);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullParser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append((DateTimeParser) null);
    }





    @Test(expected = IllegalArgumentException.class)
    public void testAppend_printerArray_nullParserInArray() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeParser[] parsers = new DateTimeParser[] {
            new DateTimeFormatterBuilder().appendLiteral('a').toParser(),
            null, // Incomplete parser array
            new DateTimeFormatterBuilder().appendLiteral('b').toParser()
        };
        builder.append(createDummyPrinter(), parsers);
    }
    


    @Test(expected = IllegalArgumentException.class)
    public void testAppendOptional_nullParser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendOptional(null);
    }



    @Test
    public void testAppendLiteral_emptyString() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral(""); // Empty literal should be a no-op, not make it unbuildable
        assertFalse(builder.canBuildFormatter()); // Should still be unbuildable if nothing else is added
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteral_nullString() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral((String) null);
    }




    








    














    


    


    



    


    





    
    



    // Added tests to reach the 12-30 test method count and cover more methods.








    @Test
    public void testAppendHourOfHalfday() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendHourOfHalfday(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 14, 0, 0, 0, DateTimeZone.UTC).getMillis(); // 14:00 is 2 PM
        assertEquals("2", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(2, formatter.parseBlocking(bucket, "2"));
    }
    
    @Test
    public void testAppendClockhourOfHalfday() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendClockhourOfHalfday(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 14, 0, 0, 0, DateTimeZone.UTC).getMillis(); // 14:00 is 2 PM
        assertEquals("2", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(2, formatter.parseBlocking(bucket, "2"));
        bucket = createParserBucket();
        // ClockhourOfHalfday parser should be able to parse both 2 and 14 (if it maps to 2).
        // Testing "14" directly might be ambiguous. Let's assume it correctly parses to '2' for PM.
        assertEquals(2, formatter.parseBlocking(bucket, "14")); 
    }

    @Test
    public void testAppendDayOfWeek() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendDayOfWeek(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(DateTimeConstants.MILLIS_PER_DAY * 3, DateTimeZone.UTC).getMillis(); // Thursday (Day 4)
        assertEquals("4", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(4, formatter.parseBlocking(bucket, "4"));
    }

    @Test
    public void testAppendDayOfYear() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendDayOfYear(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 1, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis(); // Day 15
        assertEquals("15", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(15, formatter.parseBlocking(bucket, "15"));
    }

    @Test
    public void testAppendWeekOfWeekyear() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendWeekOfWeekyear(1);
        DateTimeFormatter formatter = builder.toFormatter();
        // For week calculation, we need a Chronology. Default to GregorianChronology.
        Chronology chrono = GregorianChronology.getInstanceUTC();
        // Create a partial with weekOfWeekyear = 5. The exact instant doesn't matter as much as the field value.
        org.joda.time.Partial partial = new org.joda.time.Partial().with(DateTimeFieldType.weekOfWeekyear(), 5);
        long instant = chrono.set(partial, 0L); // Set the field in a zero instant
        assertEquals("5", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        // Parsing "5" should set weekOfWeekyear to 5.
        assertEquals(5, formatter.parseBlocking(bucket, "5"));
    }

    @Test
    public void testAppendWeekyear() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendWeekyear(2, 4);
        DateTimeFormatter formatter = builder.toFormatter();
        Chronology chrono = GregorianChronology.getInstanceUTC();
        org.joda.time.Partial partial = new org.joda.time.Partial().with(DateTimeFieldType.weekyear(), 2023);
        long instant = chrono.set(partial, 0L);
        assertEquals("2023", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(2023, formatter.parseBlocking(bucket, "2023"));
    }

    @Test
    public void testAppendTwoDigitWeekyear() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTwoDigitWeekyear(1950);
        DateTimeFormatter formatter = builder.toFormatter();
        Chronology chrono = GregorianChronology.getInstanceUTC();
        org.joda.time.Partial partial = new org.joda.time.Partial().with(DateTimeFieldType.weekyear(), 1975);
        long instant = chrono.set(partial, 0L);
        assertEquals("75", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1975, formatter.parseBlocking(bucket, "75"));
    }

    @Test
    public void testAppendYearOfEra() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendYearOfEra(1, 4);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(1, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("1", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1, formatter.parseBlocking(bucket, "1"));
    }

    @Test
    public void testAppendYearOfCentury() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendYearOfCentury(1, 2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(1999, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("99", formatter.print(instant)); // Year of century 1999 is 99
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(99, formatter.parseBlocking(bucket, "99"));
    }

    @Test
    public void testAppendCenturyOfEra() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendCenturyOfEra(1, 2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(1999, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("20", formatter.print(instant)); // 1999 is in the 20th century
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(20, formatter.parseBlocking(bucket, "20"));
    }
    
    @Test
    public void testAppendHalfdayOfDayText() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendHalfdayOfDayText();
        DateTimeFormatter formatter = builder.toFormatter();
        long instantAM = new MutableDateTime(2023, 1, 1, 10, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("AM", formatter.print(instantAM));
        DateTimeParserBucket bucketAM = createParserBucket();
        assertEquals(0, formatter.parseBlocking(bucketAM, "AM"));

        long instantPM = new MutableDateTime(2023, 1, 1, 14, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("PM", formatter.print(instantPM));
        DateTimeParserBucket bucketPM = createParserBucket();
        assertEquals(1, formatter.parseBlocking(bucketPM, "PM"));
    }

    @Test
    public void testAppendMonthOfYearText() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendMonthOfYearText();
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 12, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("December", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(12, formatter.parseBlocking(bucket, "December"));
    }

    @Test
    public void testAppendMonthOfYearShortText() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendMonthOfYearShortText();
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 12, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("Dec", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(12, formatter.parseBlocking(bucket, "Dec"));
    }

    @Test
    public void testAppendTimeZoneName() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneName();
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("Europe/London", formatter.print(instant));
        // Parsing appendTimeZoneName() without a lookup map is not supported for parsing.
        // The source code `append0(new TimeZoneName(TimeZoneName.LONG_NAME, null), null)`
        // indicates it's only intended for printing.
    }

    @Test
    public void testAppendTimeZoneShortName() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneShortName();
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = new MutableDateTime(zone).getMillis();
        // Short name for Europe/London can vary based on locale and time of year (DST).
        // We will primarily check if it prints *something*.
        String shortName = formatter.print(instant);
        assertNotNull(shortName);
        // Parsing appendTimeZoneShortName() without a lookup map is not supported for parsing.
    }
    
    @Test
    public void testAppendTimeZoneOffset_parseOnlyZeroOffsetTextDifferent() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // Test with a different zero offset parse text
        builder.appendTimeZoneOffset("UTC", "UTC", true, 1, 4);
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("UTC", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        int offset = formatter.parseBlocking(bucket, "UTC");
        assertEquals(0, offset);
    }

    // Added tests to reach the 12-30 test method count and cover more methods.

    @Test
    public void testAppend_printerAndNullParser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        assertThrows(IllegalArgumentException.class, () -> {
            builder.append(createDummyPrinter(), null);
        });
    }


    @Test
    public void testAppend_printerArray_singleNullParser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeParser[] parsers = new DateTimeParser[] {null}; // A single null parser is invalid
        assertThrows(IllegalArgumentException.class, () -> {
            builder.append(createDummyPrinter(), parsers);
        });
    }

    @Test
    public void testAppend_printerArray_lastNullParser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeParser[] parsers = new DateTimeParser[] {
            new DateTimeFormatterBuilder().appendLiteral('a').toParser(),
            null // Last parser is null, representing an optional parser group.
        };
        builder.append(createDummyPrinter(), parsers); // This should be valid.
        assertTrue(builder.canBuildFormatter());
    }

    @Test
    public void testAppendLiteral_singleCharZeroLength() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral(' '); // Appending a space literal
        DateTimeFormatter formatter = builder.toFormatter();
        assertEquals(" ", formatter.print(0));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1, formatter.parseBlocking(bucket, " "));
    }
    
    @Test
    public void testAppendFixedDecimal_numDigitsZero() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // numDigits must be > 0 for appendFixedDecimal
        assertThrows(IllegalArgumentException.class, () -> {
            builder.appendFixedDecimal(DateTimeFieldType.yearOfCentury(), 0);
        });
    }

    @Test
    public void testAppendFixedSignedDecimal_numDigitsZero() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // numDigits must be > 0 for appendFixedSignedDecimal
        assertThrows(IllegalArgumentException.class, () -> {
            builder.appendFixedSignedDecimal(DateTimeFieldType.year(), 0);
        });
    }

    @Test
    public void testAppendFraction_minDigitsNegative() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // minDigits must be >= 0
        assertThrows(IllegalArgumentException.class, () -> {
            builder.appendFraction(DateTimeFieldType.secondOfDay(), -1, 3);
        });
    }

    @Test
    public void testAppendFraction_maxDigitsZero() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // maxDigits must be > 0
        assertThrows(IllegalArgumentException.class, () -> {
            builder.appendFraction(DateTimeFieldType.secondOfDay(), 1, 0);
        });
    }

    @Test
    public void testAppendTimeZoneOffset_minFieldsZero() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // minFields must be > 0
        assertThrows(IllegalArgumentException.class, () -> {
            builder.appendTimeZoneOffset(null, true, 0, 2);
        });
    }

    @Test
    public void testAppendTimeZoneOffset_maxFieldsLessThanMinFields() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // maxFields must be >= minFields
        assertThrows(IllegalArgumentException.class, () -> {
            builder.appendTimeZoneOffset(null, true, 3, 2);
        });
    }

    @Test
    public void testAppendTimeZoneOffset_minFieldsGreaterThan4() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneOffset(null, true, 5, 5); // minFields > 4, should be capped to 4
        DateTimeFormatter formatter = builder.toFormatter();
        // The constructor caps minFields to 4, so this should work and format to maxFields=4
        DateTimeZone zone = DateTimeZone.forOffsetMillis(123456789); // approx 34 hours
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("+34:15:36.789", formatter.print(instant)); // Printed with 4 fields
        DateTimeParserBucket bucket = createParserBucket();
        int offset = formatter.parseBlocking(bucket, "+34:15:36.789");
        assertEquals(zone.getOffset(instant), offset);
    }

    @Test
    public void testAppendPattern_invalidPattern() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // Appending an invalid pattern should throw an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            builder.appendPattern("invalid-pattern[");
        });
    }
    
    @Test
    public void testAppendDecimal_maxDigitsLessThanMinDigits() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // maxDigits should be at least minDigits, the method corrects this.
        builder.appendDecimal(DateTimeFieldType.secondOfDay(), 3, 2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 10, 0, DateTimeZone.UTC).getMillis();
        // With maxDigits corrected to 3, it should print as "010"
        assertEquals("010", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(10, formatter.parseBlocking(bucket, "010"));
    }

    @Test
    public void testAppendSignedDecimal_maxDigitsLessThanMinDigits() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // maxDigits should be at least minDigits, the method corrects this.
        builder.appendSignedDecimal(DateTimeFieldType.year(), 3, 2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(10, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        // With maxDigits corrected to 3, it should print as "010"
        assertEquals("010", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(10, formatter.parseBlocking(bucket, "010"));
    }
}





