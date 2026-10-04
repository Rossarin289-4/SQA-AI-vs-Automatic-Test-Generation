package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import org.joda.time.DateTimeConstants;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;
import org.joda.time.MutablePeriod; // Import for MutablePeriod

public class PeriodFormatterBuilderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testAppendLiteral() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendLiteral(" and ")
                .toFormatter();
        // When printing null, the default behavior for fields is 0.
        // A literal formatter should always print its text regardless of the period.
        assertEquals(" and ", formatter.print(null));
    }

    @Test
    public void testAppendLiteralEmpty() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendLiteral("")
                .toFormatter();
        assertEquals("", formatter.print(null));
    }

    @Test
    public void testAppendYears() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears()
                .toFormatter();
        // For null ReadablePeriod, get() will return 0 for all fields.
        // So print(null) should output "0" for years.
        assertEquals("0", formatter.print(null));
    }

    @Test
    public void testAppendYearsWithValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears()
                .toFormatter();
        // Create a mock ReadablePeriod to simulate a period with years
        ReadWritablePeriod period = new MutablePeriod();
        period.setYears(5);
        assertEquals("5", formatter.print(period));
    }

    @Test
    public void testAppendYearsWithPrefix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("y=")
                .appendYears()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setYears(10);
        assertEquals("y=10", formatter.print(period));
    }

    @Test
    public void testAppendYearsWithSuffix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears()
                .appendSuffix("y")
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setYears(15);
        assertEquals("15y", formatter.print(period));
    }

    @Test
    public void testAppendYearsWithPluralSuffix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears()
                .appendSuffix(" year", " years")
                .toFormatter();
        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setYears(1);
        assertEquals("1 year", formatter.print(period1));

        ReadWritablePeriod period5 = new MutablePeriod();
        period5.setYears(5);
        assertEquals("5 years", formatter.print(period5));
    }

    @Test
    public void testAppendYearsWithPrefixAndSuffix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("y=")
                .appendYears()
                .appendSuffix("y")
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setYears(20);
        assertEquals("y=20y", formatter.print(period));
    }

    @Test
    public void testAppendMonths() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMonths()
                .toFormatter();
        assertEquals("0", formatter.print(null));
    }

    @Test
    public void testAppendMonthsWithValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMonths()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setMonths(7);
        assertEquals("7", formatter.print(period));
    }

    @Test
    public void testAppendWeeks() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendWeeks()
                .toFormatter();
        assertEquals("0", formatter.print(null));
    }

    @Test
    public void testAppendWeeksWithValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendWeeks()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setWeeks(3);
        assertEquals("3", formatter.print(period));
    }

    @Test
    public void testAppendDays() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .toFormatter();
        assertEquals("0", formatter.print(null));
    }

    @Test
    public void testAppendDaysWithValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setDays(10);
        assertEquals("10", formatter.print(period));
    }

    @Test
    public void testAppendHours() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendHours()
                .toFormatter();
        assertEquals("0", formatter.print(null));
    }

    @Test
    public void testAppendHoursWithValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendHours()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setHours(12);
        assertEquals("12", formatter.print(period));
    }

    @Test
    public void testAppendMinutes() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMinutes()
                .toFormatter();
        assertEquals("0", formatter.print(null));
    }

    @Test
    public void testAppendMinutesWithValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMinutes()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setMinutes(45);
        assertEquals("45", formatter.print(period));
    }

    @Test
    public void testAppendSeconds() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSeconds()
                .toFormatter();
        assertEquals("0", formatter.print(null));
    }

    @Test
    public void testAppendSecondsWithValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSeconds()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setSeconds(30);
        assertEquals("30", formatter.print(period));
    }

    @Test
    public void testAppendMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMillis()
                .toFormatter();
        assertEquals("0", formatter.print(null));
    }

    @Test
    public void testAppendMillisWithValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMillis()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setMillis(500);
        assertEquals("500", formatter.print(period));
    }

    @Test
    public void testAppendSecondsWithMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithMillis()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setSeconds(10);
        period.setMillis(250);
        assertEquals("10.250", formatter.print(period));
    }

    @Test
    public void testAppendSecondsWithMillisZeroMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithMillis()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setSeconds(5);
        period.setMillis(0);
        assertEquals("5.000", formatter.print(period));
    }

    @Test
    public void testAppendSecondsWithMillisNegative() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithMillis()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setSeconds(-10);
        period.setMillis(-250); // Note: Joda-Time handles negative millis correctly with negative seconds
        assertEquals("-10.-250", formatter.print(period));
    }

    @Test
    public void testAppendSecondsWithOptionalMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithOptionalMillis()
                .toFormatter();
        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setSeconds(15);
        period1.setMillis(750);
        assertEquals("15.750", formatter.print(period1));

        ReadWritablePeriod period2 = new MutablePeriod();
        period2.setSeconds(20);
        period2.setMillis(0);
        assertEquals("20", formatter.print(period2));
    }

    @Test
    public void testAppendSecondsWithOptionalMillisZeroMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithOptionalMillis()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setSeconds(0);
        period.setMillis(123);
        assertEquals("0.123", formatter.print(period));
    }

    @Test
    public void testAppendMillis3Digit() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMillis3Digit()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setMillis(50); // Should be padded to 050
        assertEquals("050", formatter.print(period));
    }

    @Test
    public void testAppendMillis3DigitLarge() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMillis3Digit()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setMillis(1234); // Should truncate to 234, but actually handles up to 3 digits
        assertEquals("234", formatter.print(period));
    }

    @Test
    public void testAppendSeparator() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparator(" and ")
                .appendHours()
                .toFormatter();

        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setDays(2);
        period1.setHours(3);
        assertEquals("2 and 3", formatter.print(period1));

        ReadWritablePeriod period2 = new MutablePeriod();
        period2.setDays(5);
        period2.setHours(0);
        assertEquals("5", formatter.print(period2)); // Separator not printed if after field is zero

        ReadWritablePeriod period3 = new MutablePeriod();
        period3.setDays(0);
        period3.setHours(8);
        assertEquals("8", formatter.print(period3)); // Separator not printed if before field is zero
    }

    @Test
    public void testAppendSeparatorIfFieldsAfter() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparatorIfFieldsAfter(" and ")
                .appendHours()
                .toFormatter();

        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setDays(2);
        period1.setHours(3);
        assertEquals("2 and 3", formatter.print(period1));

        ReadWritablePeriod period2 = new MutablePeriod();
        period2.setDays(5);
        period2.setHours(0);
        assertEquals("5", formatter.print(period2)); // Separator not printed
    }

    @Test
    public void testAppendSeparatorIfFieldsBefore() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparatorIfFieldsBefore(" and ")
                .appendHours()
                .toFormatter();

        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setDays(2);
        period1.setHours(3);
        assertEquals("2 and 3", formatter.print(period1));

        ReadWritablePeriod period2 = new MutablePeriod();
        period2.setDays(0);
        period2.setHours(8);
        assertEquals("8", formatter.print(period2)); // Separator not printed
    }

    @Test
    public void testAppendSeparatorWithFinalText() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparator(" and ", " & ")
                .appendHours()
                .appendSeparator(" and ", " & ")
                .appendMinutes()
                .toFormatter();

        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setDays(1);
        period1.setHours(2);
        period1.setMinutes(3);
        assertEquals("1 and 2 & 3", formatter.print(period1)); // Uses final text for last separator

        ReadWritablePeriod period2 = new MutablePeriod();
        period2.setDays(4);
        period2.setHours(5);
        period2.setMinutes(0);
        assertEquals("4 and 5", formatter.print(period2)); // Uses regular text for last printed separator
    }

    @Test
    public void testMinimumPrintedDigits() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .minimumPrintedDigits(3)
                .appendSeconds()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setSeconds(5);
        assertEquals("005", formatter.print(period));
    }

    @Test
    public void testMaximumParsedDigits() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .maximumParsedDigits(2)
                .appendSeconds()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        // Parsing "123" seconds with max digits 2 should result in 12
        int result = formatter.parseInto(period, "123", 0);
        assertEquals(2, result); // Parsed position
        assertEquals(12, period.get(DurationFieldType.seconds()));
    }

    @Test
    public void testRejectSignedValues() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .rejectSignedValues(true)
                .appendSeconds()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        // Parsing "-10" should fail if rejectSignedValues is true
        int result = formatter.parseInto(period, "-10", 0);
        assertTrue(result < 0); // Indicates parsing failure
    }

    @Test
    public void testRejectSignedValuesFalse() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .rejectSignedValues(false)
                .appendSeconds()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        int result = formatter.parseInto(period, "-10", 0);
        assertEquals(3, result); // Parsed position
        assertEquals(-10, period.get(DurationFieldType.seconds()));
    }

    @Test
    public void testPrintZeroAlways() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways()
                .appendSeconds()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setSeconds(0);
        assertEquals("0", formatter.print(period));
    }

    @Test
    public void testPrintZeroAlwaysWhenZeroUnsupported() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways()
                .appendSeconds()
                .toFormatter();
        // Use a PeriodType that doesn't support seconds.
        PeriodType pt = PeriodType.minutes(); // Does not support seconds
        ReadWritablePeriod period = new MutablePeriod(pt);
        period.setSeconds(0); // This will not be set in the period
        assertEquals("0", formatter.print(period));
    }

    @Test
    public void testPrintZeroRarelyLast() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroRarelyLast()
                .appendSeconds()
                .appendSeparator(" and ")
                .appendMillis()
                .toFormatter();
        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setSeconds(10);
        period1.setMillis(500);
        assertEquals("10 and 500", formatter.print(period1));

        ReadWritablePeriod period2 = new MutablePeriod();
        period2.setSeconds(0);
        period2.setMillis(300);
        assertEquals("300", formatter.print(period2)); // Seconds (zero) not printed

        ReadWritablePeriod period3 = new MutablePeriod();
        period3.setSeconds(5);
        period3.setMillis(0);
        assertEquals("5", formatter.print(period3)); // Millis (zero) not printed

        ReadWritablePeriod period4 = new MutablePeriod();
        period4.setSeconds(0);
        period4.setMillis(0);
        assertEquals("0", formatter.print(period4)); // Last field (millis) forced to print zero
    }

    @Test
    public void testPrintZeroRarelyFirst() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroRarelyFirst()
                .appendSeconds()
                .appendSeparator(" and ")
                .appendMillis()
                .toFormatter();
        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setSeconds(10);
        period1.setMillis(500);
        assertEquals("10 and 500", formatter.print(period1));

        ReadWritablePeriod period2 = new MutablePeriod();
        period2.setSeconds(0);
        period2.setMillis(300);
        assertEquals("0 and 300", formatter.print(period2)); // Seconds (zero) printed due to printZeroRarelyFirst

        ReadWritablePeriod period3 = new MutablePeriod();
        period3.setSeconds(5);
        period3.setMillis(0);
        assertEquals("5", formatter.print(period3)); // Millis (zero) not printed

        ReadWritablePeriod period4 = new MutablePeriod();
        period4.setSeconds(0);
        period4.setMillis(0);
        assertEquals("0", formatter.print(period4)); // First field (seconds) forced to print zero
    }

    @Test
    public void testPrintZeroIfSupported() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .appendSeconds()
                .appendSeparator(" and ")
                .appendMillis()
                .toFormatter();

        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setSeconds(10);
        period1.setMillis(500);
        assertEquals("10 and 500", formatter.print(period1));

        ReadWritablePeriod period2 = new MutablePeriod();
        period2.setSeconds(0);
        period2.setMillis(300);
        assertEquals("0 and 300", formatter.print(period2)); // Seconds supported and zero, so printed.

        ReadWritablePeriod period3 = new MutablePeriod();
        period3.setSeconds(5);
        period3.setMillis(0);
        assertEquals("5", formatter.print(period3)); // Millis supported and zero, so not printed.

        // Test with a PeriodType that doesn't support seconds
        PeriodType pt = PeriodType.minutes().withSecondsRemoved().withMillisRemoved();
        ReadWritablePeriod periodWithUnsupported = new MutablePeriod(pt);
        periodWithUnsupported.setSeconds(0);
        periodWithUnsupported.setMillis(300);
        assertEquals("300", formatter.print(periodWithUnsupported));
    }

    @Test
    public void testPrintZeroNever() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroNever()
                .appendSeconds()
                .appendSeparator(" and ")
                .appendMillis()
                .toFormatter();

        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setSeconds(10);
        period1.setMillis(500);
        assertEquals("10 and 500", formatter.print(period1));

        ReadWritablePeriod period2 = new MutablePeriod();
        period2.setSeconds(0);
        period2.setMillis(300);
        assertEquals("300", formatter.print(period2)); // Seconds (zero) not printed.

        ReadWritablePeriod period3 = new MutablePeriod();
        period3.setSeconds(5);
        period3.setMillis(0);
        assertEquals("5", formatter.print(period3)); // Millis (zero) not printed.

        ReadWritablePeriod period4 = new MutablePeriod();
        period4.setSeconds(0);
        period4.setMillis(0);
        assertEquals("", formatter.print(period4)); // Both zero, and neither printed.
    }

    @Test
    public void testAppendCompositeFields() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendHours()
                .appendSeparator(":")
                .appendMinutes()
                .appendSeparator(":")
                .appendSeconds()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setHours(1);
        period.setMinutes(2);
        period.setSeconds(3);
        assertEquals("1:2:3", formatter.print(period));
    }

    @Test
    public void testAppendWithFormatter() throws Exception {
        PeriodFormatter innerFormatter = new PeriodFormatterBuilder()
                .appendHours()
                .appendMinutes()
                .toFormatter();
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendLiteral("Time: ")
                .append(innerFormatter)
                .toFormatter();

        ReadWritablePeriod period = new MutablePeriod();
        period.setHours(10);
        period.setMinutes(30);
        assertEquals("Time: 1030", formatter.print(period));
    }

    @Test
    public void testClear() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.appendLiteral("test");
        builder.clear();
        PeriodFormatter formatter = builder.toFormatter();
        // After clear, should behave like an empty formatter, printing nothing.
        assertEquals("", formatter.print(null));
    }

    @Test
    public void testBuilderReuseAfterClear() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.appendLiteral("first");
        PeriodFormatter formatter1 = builder.toFormatter();
        assertEquals("first", formatter1.print(null));

        builder.clear();
        builder.appendLiteral("second");
        PeriodFormatter formatter2 = builder.toFormatter();
        assertEquals("second", formatter2.print(null));
    }

    @Test
    public void testToPrinter() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.appendYears();
        PeriodPrinter printer = builder.toPrinter();
        assertNotNull(printer);
        ReadWritablePeriod period = new MutablePeriod();
        period.setYears(10);
        StringBuffer sb = new StringBuffer();
        printer.printTo(sb, period, Locale.getDefault());
        assertEquals("10", sb.toString());
    }

    @Test
    public void testToParser() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.appendYears();
        PeriodParser parser = builder.toParser();
        assertNotNull(parser);
        ReadWritablePeriod period = new MutablePeriod();
        int parsedPos = parser.parseInto(period, "20", 0, Locale.getDefault());
        assertEquals(2, parsedPos);
        assertEquals(20, period.get(DurationFieldType.years()));
    }

    @Test
    public void testCalculatePrintedLength() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.appendYears();
        PeriodFormatter formatter = builder.toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setYears(123);
        assertEquals(3, formatter.getPrinter().calculatePrintedLength(period, Locale.getDefault()));
    }

    @Test
    public void testPrintToStringBuffer() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.appendYears();
        PeriodFormatter formatter = builder.toFormatter();
        StringBuffer sb = new StringBuffer();
        ReadWritablePeriod period = new MutablePeriod();
        period.setYears(45);
        formatter.getPrinter().printTo(sb, period, Locale.getDefault());
        assertEquals("45", sb.toString());
    }

    @Test
    public void testPrintToWriter() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.appendYears();
        PeriodFormatter formatter = builder.toFormatter();
        java.io.StringWriter sw = new java.io.StringWriter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setYears(67);
        formatter.getPrinter().printTo(sw, period, Locale.getDefault());
        assertEquals("67", sw.toString());
    }

    @Test
    public void testParseIntoWithSeparator() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparator(" and ")
                .appendHours()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        int parsedPos = formatter.getParser().parseInto(period, "10 and 11", 0, Locale.getDefault());
        assertEquals(11, parsedPos);
        assertEquals(10, period.get(DurationFieldType.days()));
        assertEquals(11, period.get(DurationFieldType.hours()));
    }

    @Test
    public void testParseIntoWithSeparatorFailure() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparator(" and ")
                .appendHours()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        int parsedPos = formatter.getParser().parseInto(period, "10, 11", 0, Locale.getDefault());
        assertTrue(parsedPos < 0); // Expect parsing to fail
    }

    @Test
    public void testParseIntoWithOptionalSeparator() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparatorIfFieldsAfter(" and ")
                .appendHours()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        // Test with separator
        int parsedPos1 = formatter.getParser().parseInto(period, "10 and 11", 0, Locale.getDefault());
        assertEquals(11, parsedPos1);
        assertEquals(10, period.get(DurationFieldType.days()));
        assertEquals(11, period.get(DurationFieldType.hours()));

        ReadWritablePeriod period2 = new MutablePeriod();
        int parsedPos2 = formatter.getParser().parseInto(period2, "1011", 0, Locale.getDefault());
        assertEquals(4, parsedPos2);
        assertEquals(10, period2.get(DurationFieldType.days()));
        assertEquals(11, period2.get(DurationFieldType.hours()));
    }

    @Test
    public void testParseIntoWithSeparatorFailureNoSeparator() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparator(" and ") // requires separator
                .appendHours()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        // Parsing "1011" with a required separator " and " should fail.
        int parsedPos = formatter.getParser().parseInto(period, "1011", 0, Locale.getDefault());
        assertTrue(parsedPos < 0); // Expect parsing to fail
    }

    @Test
    public void testCountFieldsToPrint() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendHours()
                .appendMinutes()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setHours(1);
        period.setMinutes(30);
        // Should print two fields
        assertEquals(2, formatter.getPrinter().countFieldsToPrint(period, Integer.MAX_VALUE, Locale.getDefault()));

        ReadWritablePeriod periodZero = new MutablePeriod();
        periodZero.setHours(0);
        periodZero.setMinutes(0);
        // With default printZeroRarelyLast, zero fields are not printed unless forced.
        // Here, since there are no other fields, the last field (minutes) should be printed.
        assertEquals(1, formatter.getPrinter().countFieldsToPrint(periodZero, Integer.MAX_VALUE, Locale.getDefault()));
    }

    @Test
    public void testCountFieldsToPrintWithZeroNever() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroNever()
                .appendHours()
                .appendMinutes()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setHours(0);
        period.setMinutes(0);
        // With printZeroNever, if both are zero, nothing should be printed.
        assertEquals(0, formatter.getPrinter().countFieldsToPrint(period, Integer.MAX_VALUE, Locale.getDefault()));
    }

    @Test
    public void testAppendPrefixAndSuffixToComposite() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("Prefix:")
                .appendHours()
                .appendSuffix(":Suffix")
                .appendSeparator(" and ")
                .appendPrefix("Prefix2:")
                .appendMinutes()
                .appendSuffix(":Suffix2")
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setHours(1);
        period.setMinutes(2);
        assertEquals("Prefix:1:Suffix and Prefix2:2:Suffix2", formatter.print(period));
    }

    @Test
    public void testAppendLiteralThenField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendLiteral("Start ")
                .appendYears()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setYears(5);
        assertEquals("Start 5", formatter.print(period));
    }

    @Test
    public void testAppendFieldThenLiteral() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears()
                .appendLiteral(" End")
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setYears(5);
        assertEquals("5 End", formatter.print(period));
    }

    @Test
    public void testAppendSecondsWithMillisDecimalParsing() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithMillis()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "10.250", 0, Locale.getDefault());
        assertEquals(6, pos);
        assertEquals(10, period.get(DurationFieldType.seconds()));
        assertEquals(250, period.get(DurationFieldType.millis()));
    }

    @Test
    public void testAppendSecondsWithOptionalMillisDecimalParsing() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithOptionalMillis()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "15.750", 0, Locale.getDefault());
        assertEquals(7, pos);
        assertEquals(15, period.get(DurationFieldType.seconds()));
        assertEquals(750, period.get(DurationFieldType.millis()));

        ReadWritablePeriod period2 = new MutablePeriod();
        int pos2 = formatter.getParser().parseInto(period2, "20", 0, Locale.getDefault());
        assertEquals(2, pos2);
        assertEquals(20, period2.get(DurationFieldType.seconds()));
        assertEquals(0, period2.get(DurationFieldType.millis()));
    }

    @Test
    public void testParseWithPluralSuffix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears()
                .appendSuffix(" year", " years")
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "5 years", 0, Locale.getDefault());
        assertEquals(9, pos);
        assertEquals(5, period.get(DurationFieldType.years()));

        ReadWritablePeriod period2 = new MutablePeriod();
        int pos2 = formatter.getParser().parseInto(period2, "1 year", 0, Locale.getDefault());
        assertEquals(6, pos2);
        assertEquals(1, period2.get(DurationFieldType.years()));
    }

    @Test
    public void testParseWithPluralPrefix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("year", "years")
                .appendYears()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "5 years", 0, Locale.getDefault());
        assertEquals(9, pos);
        assertEquals(5, period.get(DurationFieldType.years()));

        ReadWritablePeriod period2 = new MutablePeriod();
        int pos2 = formatter.getParser().parseInto(period2, "1 year", 0, Locale.getDefault());
        assertEquals(6, pos2);
        assertEquals(1, period2.get(DurationFieldType.years()));
    }

    @Test
    public void testAppendSeparatorWithVariants() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparator(" and ", " & ", new String[]{"plus", "with"})
                .appendHours()
                .toFormatter();
        ReadWritablePeriod period = new MutablePeriod();
        period.setDays(1);
        period.setHours(2);

        // Test with standard separator
        int pos1 = formatter.getParser().parseInto(period, "1 and 2", 0, Locale.getDefault());
        assertEquals(7, pos1);
        assertEquals(1, period.get(DurationFieldType.days()));
        assertEquals(2, period.get(DurationFieldType.hours()));

        // Test with final separator
        ReadWritablePeriod period2 = new MutablePeriod();
        int pos2 = formatter.getParser().parseInto(period2, "1 & 2", 0, Locale.getDefault());
        assertEquals(7, pos2);
        assertEquals(1, period2.get(DurationFieldType.days()));
        assertEquals(2, period2.get(DurationFieldType.hours()));

        // Test with variant separator
        ReadWritablePeriod period3 = new MutablePeriod();
        int pos3 = formatter.getParser().parseInto(period3, "1 plus 2", 0, Locale.getDefault());
        assertEquals(10, pos3);
        assertEquals(1, period3.get(DurationFieldType.days()));
        assertEquals(2, period3.get(DurationFieldType.hours()));
    }

    @Test
    public void testAppendSeparatorWithVariantsPrinting() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparator(" and ", " & ", new String[]{"plus", "with"})
                .appendHours()
                .toFormatter();
        ReadWritablePeriod period1 = new MutablePeriod();
        period1.setDays(1);
        period1.setHours(2);
        assertEquals("1 and 2", formatter.print(period1));

        // The original test case had an issue where it expected "1 and 2" from a formatter that should use "&" as the final separator.
        // The `appendSeparator` method determines which separator to use based on whether it's the last one to be printed.
        // In this specific case, when `period1` is printed, both days and hours are present, so the last separator is effectively "and".
        // The original test's assertion `assertEquals("1 and 2", formatter2.print(period2));` with `appendSeparator(" and ", " & ")` implies that "and" is always used for the final separator.
        // Let's re-evaluate the `appendSeparator` logic. The logic in `Separator.calculatePrintedLength` and `printTo` uses `iUseBefore` and `iUseAfter` and the `countFieldsToPrint`.
        // For `period1`, both `before` and `after` fields are present. Thus, `afterCount > 1` is false, so `iFinalText` (" & ") should be used.

        PeriodFormatter formatter2 = new PeriodFormatterBuilder()
                .appendDays()
                .appendSeparator(" and ", " & ") // Without variants, only two forms
                .appendHours()
                .toFormatter();
        ReadWritablePeriod period2 = new MutablePeriod();
        period2.setDays(3);
        period2.setHours(4);
        // Since both days and hours are present, and hours is the "after" field, the `finalText` should be used.
        assertEquals("3 & 4", formatter2.print(period2));
    }
}
