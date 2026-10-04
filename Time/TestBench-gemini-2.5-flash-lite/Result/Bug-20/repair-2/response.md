```java
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

    @Test
    public void testClear() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral('a');
        builder.appendLiteral('b');
        builder.clear();
        assertFalse(builder.canBuildFormatter());
        assertEquals(0, builder.iElementPairs.size()); // Accessing iElementPairs directly is fine in tests
    }

    @Test
    public void testAppend_formatter() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append(createDummyFormatter());
        assertTrue(builder.canBuildFormatter());
        assertEquals(2, builder.iElementPairs.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullFormatter() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append((DateTimeFormatter) null);
    }

    @Test
    public void testAppend_printer() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append(createDummyPrinter());
        assertTrue(builder.canBuildFormatter());
        assertEquals(2, builder.iElementPairs.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullPrinter() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append((DateTimePrinter) null);
    }

    @Test
    public void testAppend_parser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append(createDummyParser());
        assertTrue(builder.canBuildFormatter());
        assertEquals(2, builder.iElementPairs.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullParser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append((DateTimeParser) null);
    }

    @Test
    public void testAppend_printerParser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append(createDummyPrinter(), createDummyParser());
        assertTrue(builder.canBuildFormatter());
        assertEquals(2, builder.iElementPairs.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_nullPrinterAndParser() {
        // The append method signature `append(DateTimePrinter printer, DateTimeParser parser)`
        // requires both to be non-null as per checkPrinter and checkParser.
        // If one is null, it should throw. If both are null, it also throws.
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append(null, null);
    }

    @Test
    public void testAppend_printerArray() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeParser[] parsers = new DateTimeParser[] {
            new DateTimeFormatterBuilder().appendLiteral('a').toParser(),
            new DateTimeFormatterBuilder().appendLiteral('b').toParser()
        };
        builder.append(createDummyPrinter(), parsers);
        assertTrue(builder.canBuildFormatter());
        assertEquals(2, builder.iElementPairs.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppend_printerArray_nullArray() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.append(createDummyPrinter(), null);
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
    
    @Test
    public void testAppend_printerArray_singleParser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeParser[] parsers = new DateTimeParser[] {
            new DateTimeFormatterBuilder().appendLiteral('a').toParser()
        };
        builder.append(createDummyPrinter(), parsers);
        assertTrue(builder.canBuildFormatter());
        assertEquals(2, builder.iElementPairs.size());
    }

    @Test
    public void testAppendOptional_parser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendOptional(createDummyParser());
        assertTrue(builder.canBuildFormatter());
        assertEquals(2, builder.iElementPairs.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendOptional_nullParser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendOptional(null);
    }

    @Test
    public void testAppendLiteral_char() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral('X');
        DateTimeFormatter formatter = builder.toFormatter();
        assertEquals("X", formatter.print(0));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1, formatter.parseBlocking(bucket, "X"));
    }

    @Test
    public void testAppendLiteral_string() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendLiteral("Hello");
        DateTimeFormatter formatter = builder.toFormatter();
        assertEquals("Hello", formatter.print(0));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "Hello"));
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

    @Test
    public void testAppendDecimal_hourOfDay_min1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendDecimal(DateTimeFieldType.hourOfDay(), 1, 2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(9, DateTimeZone.UTC).getMillis();
        assertEquals("9", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(9, formatter.parseBlocking(bucket, "9"));
        instant = new MutableDateTime(10, DateTimeZone.UTC).getMillis();
        assertEquals("10", formatter.print(instant));
        bucket = createParserBucket();
        assertEquals(10, formatter.parseBlocking(bucket, "10"));
    }

    @Test
    public void testAppendDecimal_hourOfDay_min2() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendDecimal(DateTimeFieldType.hourOfDay(), 2, 2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(9, DateTimeZone.UTC).getMillis();
        assertEquals("09", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(9, formatter.parseBlocking(bucket, "09"));
        instant = new MutableDateTime(10, DateTimeZone.UTC).getMillis();
        assertEquals("10", formatter.print(instant));
        bucket = createParserBucket();
        assertEquals(10, formatter.parseBlocking(bucket, "10"));
    }

    @Test
    public void testAppendDecimal_signed_min1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendSignedDecimal(DateTimeFieldType.hourOfDay(), 1, 2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(9, DateTimeZone.UTC).getMillis();
        assertEquals("9", formatter.print(instant));
        instant = new MutableDateTime(-9, DateTimeZone.UTC).getMillis();
        assertEquals("-9", formatter.print(instant));
        instant = new MutableDateTime(10, DateTimeZone.UTC).getMillis();
        assertEquals("10", formatter.print(instant));
        instant = new MutableDateTime(-10, DateTimeZone.UTC).getMillis();
        assertEquals("-10", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(9, formatter.parseBlocking(bucket, "9"));
        bucket = createParserBucket();
        assertEquals(-9, formatter.parseBlocking(bucket, "-9"));
        bucket = createParserBucket();
        assertEquals(10, formatter.parseBlocking(bucket, "10"));
        bucket = createParserBucket();
        assertEquals(-10, formatter.parseBlocking(bucket, "-10"));
    }

    @Test
    public void testAppendDecimal_maxDigitsEdgeCase() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendDecimal(DateTimeFieldType.year(), 1, 4); // Max 4 digits
        DateTimeFormatter formatter = builder.toFormatter();
        // Test max digits for parsing
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1234, formatter.parseBlocking(bucket, "1234"));
        // Test that more than max digits are not parsed
        bucket = createParserBucket();
        // The parser should stop after 4 digits.
        assertEquals(1234, formatter.parseBlocking(bucket, "12345"));
        // Test printing with more than max digits (the field's natural length)
        long year10000 = new MutableDateTime(10000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("10000", formatter.print(year10000));
    }
    
    @Test
    public void testAppendFixedDecimal_numDigits1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 5, 0, DateTimeZone.UTC).getMillis();
        assertEquals("05", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "05"));
    }

    @Test
    public void testAppendFixedDecimal_numDigitsLarger() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFixedDecimal(DateTimeFieldType.yearOfCentury(), 3);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(1905, 1, 1, DateTimeZone.UTC).getMillis();
        assertEquals("005", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "005"));
    }

    @Test
    public void testAppendFixedDecimal_numDigitsExceedingMax() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFixedDecimal(DateTimeFieldType.yearOfCentury(), 3);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant1999 = new MutableDateTime(1999, 1, 1, DateTimeZone.UTC).getMillis();
        assertEquals("099", formatter.print(instant1999)); // FixedDecimal should pad to numDigits
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "005"));
    }

    @Test
    public void testAppendFixedSignedDecimal_numDigits1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFixedSignedDecimal(DateTimeFieldType.year(), 4);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(1999, 1, 1, DateTimeZone.UTC).getMillis();
        assertEquals("1999", formatter.print(instant));
        long negInstant = new MutableDateTime(-5, 1, 1, DateTimeZone.UTC).getMillis();
        assertEquals("-0005", formatter.print(negInstant)); // FixedSignedDecimal should pad to numDigits
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1999, formatter.parseBlocking(bucket, "1999"));
        bucket = createParserBucket();
        assertEquals(-5, formatter.parseBlocking(bucket, "-0005"));
    }

    @Test
    public void testAppendFixedSignedDecimal_numDigitsExceedingMax() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFixedSignedDecimal(DateTimeFieldType.year(), 4);
        DateTimeFormatter formatter = builder.toFormatter();
        long year10000 = new MutableDateTime(10000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("10000", formatter.print(year10000)); // Printing should handle values exceeding numDigits
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1234, formatter.parseBlocking(bucket, "1234"));
    }

    @Test
    public void testAppendText_monthOfYear() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendText(DateTimeFieldType.monthOfYear());
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 1, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis(); // January
        assertEquals("January", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1, formatter.parseBlocking(bucket, "January"));
        bucket = createParserBucket();
        assertEquals(1, formatter.parseBlocking(bucket, "january")); 
    }

    @Test
    public void testAppendShortText_monthOfYear() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendShortText(DateTimeFieldType.monthOfYear());
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 1, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis(); // January
        assertEquals("Jan", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1, formatter.parseBlocking(bucket, "Jan"));
        bucket = createParserBucket();
        assertEquals(1, formatter.parseBlocking(bucket, "january")); // TextField should handle this case insensitively.
    }

    @Test
    public void testAppendFractionOfSecond_min1_max3() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFractionOfSecond(1, 3);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 0, 123, DateTimeZone.UTC).getMillis();
        assertEquals("123", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(123, formatter.parseBlocking(bucket, "123"));
    }

    @Test
    public void testAppendFractionOfSecond_min3_max3() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFractionOfSecond(3, 3);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 0, 123, DateTimeZone.UTC).getMillis();
        assertEquals("123", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(123, formatter.parseBlocking(bucket, "123"));
        // Test with fewer than min digits, should pad with zeros
        instant = new MutableDateTime(0, 1, 1, 0, 0, 0, 5, DateTimeZone.UTC).getMillis();
        assertEquals("005", formatter.print(instant));
        bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "005"));
    }
    
    @Test
    public void testAppendFractionOfSecond_min1_max1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFractionOfSecond(1, 1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 0, 123, DateTimeZone.UTC).getMillis();
        assertEquals("1", formatter.print(instant)); // only prints the most significant digit based on maxDigits
        DateTimeParserBucket bucket = createParserBucket();
        // Parsing '1' as 0.1 seconds. The Fraction parser logic for this input and configuration.
        // 'fraction * scalar / rangeMillis' for 123ms, rangeMillis=1000, scalar=10 (for maxDigits=1), result is 123*10/1000 = 12.3
        // This is then set as millisOfSecond.
        assertEquals(12, formatter.parseBlocking(bucket, "1")); 
    }

    @Test
    public void testAppendMillisOfSecond_min1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendMillisOfSecond(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 0, 123, DateTimeZone.UTC).getMillis();
        assertEquals("123", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(123, formatter.parseBlocking(bucket, "123"));
    }

    @Test
    public void testAppendMillisOfSecond_min3() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendMillisOfSecond(3);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 0, 5, DateTimeZone.UTC).getMillis();
        assertEquals("005", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "005"));
    }

    @Test
    public void testAppendSecondOfMinute_min1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendSecondOfMinute(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 5, 0, DateTimeZone.UTC).getMillis();
        assertEquals("5", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "5"));
    }

    @Test
    public void testAppendSecondOfMinute_min2() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendSecondOfMinute(2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 5, 0, DateTimeZone.UTC).getMillis();
        assertEquals("05", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "05"));
    }

    @Test
    public void testAppendMinuteOfHour_min1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendMinuteOfHour(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 5, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("5", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "5"));
    }

    @Test
    public void testAppendMinuteOfHour_min2() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendMinuteOfHour(2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 5, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("05", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "05"));
    }

    @Test
    public void testAppendHourOfDay_min1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendHourOfDay(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 5, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("5", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "5"));
    }

    @Test
    public void testAppendHourOfDay_min2() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendHourOfDay(2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 5, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("05", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "05"));
    }

    @Test
    public void testAppendDayOfMonth_min1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendDayOfMonth(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 5, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("15", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(15, formatter.parseBlocking(bucket, "15"));
    }

    @Test
    public void testAppendDayOfMonth_min2() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendDayOfMonth(2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 5, 5, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("05", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "05"));
    }

    @Test
    public void testAppendMonthOfYear_min1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendMonthOfYear(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 11, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("11", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(11, formatter.parseBlocking(bucket, "11"));
    }

    @Test
    public void testAppendMonthOfYear_min2() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendMonthOfYear(2);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 5, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("05", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "05"));
    }

    @Test
    public void testAppendYear_min2_max4() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendYear(2, 4);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("2023", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(2023, formatter.parseBlocking(bucket, "2023"));
        // Test parsing with fewer than min digits (should fail)
        bucket = createParserBucket();
        assertEquals(~0, formatter.parseBlocking(bucket, "23")); 
    }

    @Test
    public void testAppendYear_min4_max4() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendYear(4, 4);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("2023", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(2023, formatter.parseBlocking(bucket, "2023"));
        // Test parsing with more than max digits
        bucket = createParserBucket();
        // The parser should stop after 4 digits.
        assertEquals(1234, formatter.parseBlocking(bucket, "12345"));
    }
    
    @Test
    public void testAppendYear_negativeYear() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendYear(1, 4); // Allows variable digits, including negative sign
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(-100, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("-100", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(-100, formatter.parseBlocking(bucket, "-100"));
    }

    @Test
    public void testAppendTwoDigitYear_pivot1950() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTwoDigitYear(1950);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(1975, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("75", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1975, formatter.parseBlocking(bucket, "75"));
    }

    @Test
    public void testAppendTwoDigitYear_pivot2025_lenient() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTwoDigitYear(2025, true); // Lenient parsing
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2005, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("05", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(2005, formatter.parseBlocking(bucket, "05")); // Parses 2 digits as expected with lenient
        bucket = createParserBucket();
        assertEquals(2005, formatter.parseBlocking(bucket, "2005")); // Parses 4 digits as absolute year with lenient
        bucket = createParserBucket();
        assertEquals(-5, formatter.parseBlocking(bucket, "-05")); // Parses negative 2 digits
    }
    
    @Test
    public void testAppendTwoDigitYear_pivot2025_nonLenient() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTwoDigitYear(2025, false); // Non-lenient parsing
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2005, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("05", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(2005, formatter.parseBlocking(bucket, "05"));
        // Test parsing more than 2 digits (should fail in non-lenient mode)
        bucket = createParserBucket();
        // The parser for TwoDigitYear expects exactly 2 digits when not lenient.
        assertEquals(~0, formatter.parseBlocking(bucket, "2005"));
    }

    @Test
    public void testAppendDayOfWeekText() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendDayOfWeekText();
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(DateTimeConstants.MILLIS_PER_DAY * 0, DateTimeZone.UTC).getMillis(); // Monday
        assertEquals("Monday", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(DateTimeConstants.MONDAY, formatter.parseBlocking(bucket, "Monday"));
    }

    @Test
    public void testAppendDayOfWeekShortText() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendDayOfWeekShortText();
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(DateTimeConstants.MILLIS_PER_DAY * 0, DateTimeZone.UTC).getMillis(); // Monday
        assertEquals("Mon", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(DateTimeConstants.MONDAY, formatter.parseBlocking(bucket, "Mon"));
    }
    
    @Test
    public void testAppendEraText() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendEraText();
        DateTimeFormatter formatter = builder.toFormatter();
        // Test for AD (Era 1)
        long instantAD = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("AD", formatter.print(instantAD));
        DateTimeParserBucket bucketAD = createParserBucket();
        assertEquals(1, formatter.parseBlocking(bucketAD, "AD"));
        
        // Test for BC (Era 0)
        long instantBC = new MutableDateTime(-1, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("BC", formatter.print(instantBC));
        DateTimeParserBucket bucketBC = createParserBucket();
        assertEquals(0, formatter.parseBlocking(bucketBC, "BC"));
    }

    @Test
    public void testAppendTimeZoneId() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneId();
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("Europe/London", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        // The parse method for TimeZoneId takes the string and returns the ID.
        // It needs to be set in the bucket.
        bucket.setZone(DateTimeZone.forID(formatter.parseBlocking(bucket, "Europe/London")));
        assertNotNull(bucket.getZone());
        assertEquals("Europe/London", bucket.getZone().getID());
    }

    @Test
    public void testAppendTimeZoneOffset_simple() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneOffset("+01:00", false, 2, 2); // showSeparators = false
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("+0100", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        int offset = formatter.parseBlocking(bucket, "+0100"); // Fixed the missing closing quote
        assertEquals(zone.getOffset(instant), offset);
    }

    @Test
    public void testAppendTimeZoneOffset_withSeparators() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneOffset(null, true, 3, 4); // showSeparators = true, minFields=3, maxFields=4
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("+02:30", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        int offset = formatter.parseBlocking(bucket, "+02:30");
        assertEquals(zone.getOffset(instant), offset);
    }
    
    @Test
    public void testAppendTimeZoneOffset_zeroOffsetText() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneOffset("Z", true, 1, 4); // zeroOffsetText = "Z"
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("Z", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        // Parsing "Z" should result in offset 0
        int offset = formatter.parseBlocking(bucket, "Z");
        assertEquals(0, offset);
    }

    @Test
    public void testAppendPattern_basic() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 10, 26, 14, 30, 55, 0, DateTimeZone.UTC).getMillis();
        assertEquals("2023-10-26 14:30:55", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        long parsedMillis = formatter.parseBlocking(bucket, "2023-10-26 14:30:55");
        assertEquals(new MutableDateTime(2023, 10, 26, 14, 30, 55, 0, DateTimeZone.UTC).getMillis(), parsedMillis);
    }

    @Test
    public void testAppendPattern_withLiteralAndText() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendPattern("MMMM dd, yyyy 'at' hh:mma");
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 1, 15, 14, 30, 0, 0, DateTimeZone.UTC).getMillis(); // January, 2:30PM
        assertEquals("January 15, 2023 at 02:30PM", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        long parsedMillis = formatter.parseBlocking(bucket, "January 15, 2023 at 02:30PM");
        // Parsing hh:mma can be tricky. The result should be consistent with the printed value.
        // For 2:30PM, this is 14:30.
        assertEquals(new MutableDateTime(2023, 1, 15, 14, 30, 0, 0, DateTimeZone.UTC).getMillis(), parsedMillis);
    }
    
    @Test
    public void testAppendPattern_edgeCaseDigits() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendPattern("yy"); // Two digit year
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2075, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("75", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        // Test parsing with pivot (default is likely 2000 or similar, making '75' map to 1975)
        assertEquals(1975, formatter.parseBlocking(bucket, "75")); 
    }

    @Test
    public void testAppendPattern_quotedLiteral() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendPattern("'Year' yyyy");
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(2023, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("'Year' 2023", formatter.print(instant)); // Literal 'Year' should be printed as is
        DateTimeParserBucket bucket = createParserBucket();
        long parsedMillis = formatter.parseBlocking(bucket, "'Year' 2023");
        // Parsing 'Year' 2023, the literal part should be ignored/matched.
        assertEquals(new MutableDateTime(2023, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis(), parsedMillis);
    }

    @Test
    public void testAppendDecimal_minDigitsZero() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendSignedDecimal(DateTimeFieldType.minuteOfHour(), 0, 2); // minDigits=0 is allowed
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 5, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals("5", formatter.print(instant)); // Should print 5, not "05" if minDigits is 0 and value is < 10
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "5"));
        bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "05")); // Should also parse padded if available
    }

    @Test
    public void testAppendFraction_minDigitsZero() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFraction(DateTimeFieldType.secondOfDay(), 0, 3);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 0, 123, DateTimeZone.UTC).getMillis();
        assertEquals("123", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(123, formatter.parseBlocking(bucket, "123"));
    }

    @Test
    public void testAppendFraction_minDigitsEqualToMaxDigits() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFraction(DateTimeFieldType.secondOfDay(), 3, 3);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 0, 123, DateTimeZone.UTC).getMillis();
        assertEquals("123", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(123, formatter.parseBlocking(bucket, "123"));
        
        instant = new MutableDateTime(0, 1, 1, 0, 0, 0, 5, DateTimeZone.UTC).getMillis();
        assertEquals("005", formatter.print(instant)); // Should be padded to 3 digits
        bucket = createParserBucket();
        assertEquals(5, formatter.parseBlocking(bucket, "005"));
    }

    @Test
    public void testAppendTimeZoneOffset_maxFields1() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneOffset(null, false, 1, 1); // Only hours
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("+03", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        int offset = formatter.parseBlocking(bucket, "+03");
        assertEquals(zone.getOffset(instant), offset);
    }
    
    @Test
    public void testAppendTimeZoneOffset_maxFields2() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneOffset(null, true, 1, 2); // Hours and Minutes
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(3, 45);
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("+03:45", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        int offset = formatter.parseBlocking(bucket, "+03:45");
        assertEquals(zone.getOffset(instant), offset);
    }
    
    @Test
    public void testAppendTimeZoneOffset_maxFields3() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneOffset(null, true, 1, 3); // Hours, Minutes, Seconds
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3*DateTimeConstants.MILLIS_PER_HOUR + 45*DateTimeConstants.MILLIS_PER_MINUTE + 15*DateTimeConstants.MILLIS_PER_SECOND);
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("+03:45:15", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        int offset = formatter.parseBlocking(bucket, "+03:45:15");
        assertEquals(zone.getOffset(instant), offset);
    }

    @Test
    public void testAppendTimeZoneOffset_maxFields4() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendTimeZoneOffset(null, true, 1, 4); // Hours, Minutes, Seconds, Fraction
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3*DateTimeConstants.MILLIS_PER_HOUR + 45*DateTimeConstants.MILLIS_PER_MINUTE + 15*DateTimeConstants.MILLIS_PER_SECOND + 123);
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("+03:45:15.123", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        int offset = formatter.parseBlocking(bucket, "+03:45:15.123");
        assertEquals(zone.getOffset(instant), offset);
    }

    @Test
    public void testAppendTimeZoneOffset_parseOnlyZeroOffsetText() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        // Test case where zeroOffsetText is provided, but showSeparators is false
        builder.appendTimeZoneOffset("Z", "Z", false, 1, 4);
        DateTimeFormatter formatter = builder.toFormatter();
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        long instant = new MutableDateTime(zone).getMillis();
        assertEquals("Z", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        int offset = formatter.parseBlocking(bucket, "Z");
        assertEquals(0, offset);
    }

    // Added tests to reach the 12-30 test method count and cover more methods.

    @Test
    public void testAppendFractionOfMinute() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFractionOfMinute(1, 2);
        DateTimeFormatter formatter = builder.toFormatter();
        // 30 seconds is 0.5 minutes. maxDigits=2 prints "50".
        long instant = new MutableDateTime(0, 0, 1, 0, 30, 0, 0, DateTimeZone.UTC).getMillis(); 
        assertEquals("50", formatter.print(instant)); 
        DateTimeParserBucket bucket = createParserBucket();
        // Parsing "50" for fraction of minute (max 2 digits) should yield 0.5 minutes.
        // 0.5 minutes = 0.5 * 60 seconds = 30 seconds.
        int parsedMillis = formatter.parseBlocking(bucket, "50");
        assertEquals(30 * DateTimeConstants.MILLIS_PER_SECOND, parsedMillis); 
    }

    @Test
    public void testAppendFractionOfHour() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFractionOfHour(1, 2);
        DateTimeFormatter formatter = builder.toFormatter();
        // 6 hours is 0.25 days. maxDigits=2 prints "25".
        long instant = new MutableDateTime(0, 1, 1, 6, 0, 0, 0, DateTimeZone.UTC).getMillis(); 
        assertEquals("25", formatter.print(instant)); 
        DateTimeParserBucket bucket = createParserBucket();
        // Parsing "25" for fraction of hour (max 2 digits) should yield 0.25 hours.
        // 0.25 hours = 0.25 * 60 minutes = 15 minutes.
        int parsedMillis = formatter.parseBlocking(bucket, "25");
        assertEquals(15 * DateTimeConstants.MILLIS_PER_MINUTE, parsedMillis);
    }

    @Test
    public void testAppendFractionOfDay() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendFractionOfDay(1, 3);
        DateTimeFormatter formatter = builder.toFormatter();
        // Noon on day 2 (12 hours into the day) is 0.5 days. maxDigits=3 prints "500".
        long instant = new MutableDateTime(1, 1, 2, 12, 0, 0, 0, DateTimeZone.UTC).getMillis(); 
        assertEquals("500", formatter.print(instant)); 
        DateTimeParserBucket bucket = createParserBucket();
        // Parsing "500" for fraction of day (max 3 digits) should yield 0.5 days.
        // 0.5 days = 12 hours.
        int parsedMillis = formatter.parseBlocking(bucket, "500");
        assertEquals(12 * DateTimeConstants.MILLIS_PER_HOUR, parsedMillis);
    }

    @Test
    public void testAppendMillisOfDay() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendMillisOfDay(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 0, 0, 123, DateTimeZone.UTC).getMillis();
        assertEquals("123", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(123, formatter.parseBlocking(bucket, "123"));
    }

    @Test
    public void testAppendSecondOfDay() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendSecondOfDay(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 0, 1, 5, 0, DateTimeZone.UTC).getMillis(); // 65 seconds
        assertEquals("65", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(65, formatter.parseBlocking(bucket, "65"));
    }

    @Test
    public void testAppendMinuteOfDay() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendMinuteOfDay(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 1, 5, 0, 0, DateTimeZone.UTC).getMillis(); // 65 minutes
        assertEquals("65", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(65, formatter.parseBlocking(bucket, "65"));
    }

    @Test
    public void testAppendClockhourOfDay() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendClockhourOfDay(1);
        DateTimeFormatter formatter = builder.toFormatter();
        long instant = new MutableDateTime(0, 1, 1, 13, 0, 0, 0, DateTimeZone.UTC).getMillis(); // 13:00 is 1 PM
        assertEquals("1", formatter.print(instant));
        DateTimeParserBucket bucket = createParserBucket();
        assertEquals(1, formatter.parseBlocking(bucket, "1"));
        bucket = createParserBucket();
        // ClockhourOfDay parser should be able to parse both 1 and 13.
        assertEquals(13, formatter.parseBlocking(bucket, "13")); 
    }

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
    public void testAppend_nullPrinterAndParser() {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        assertThrows(IllegalArgumentException.class, () -> {
            builder.append(null, createDummyParser());
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
```