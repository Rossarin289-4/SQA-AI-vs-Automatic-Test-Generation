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

public class PeriodFormatterBuilderTest {
    @Test
    public void testEmptyBuilderProducesEmptyFormatter() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().toFormatter();
        assertEquals("", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testLiteralPrintsAndParsesCaseInsensitively() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendLiteral("Ab").toFormatter();
        assertEquals("Ab", formatter.print(new org.joda.time.Period()));
        assertEquals(2, formatter.parseInto(new org.joda.time.MutablePeriod(), "aB", 0));
    }

    @Test
    public void testLiteralMismatchReturnsNegatedPosition() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendLiteral("Ab").toFormatter();
        assertEquals(~1, formatter.parseInto(new org.joda.time.MutablePeriod(), "xa", 1));
    }

    @Test
    public void testYearPrintsConfiguredValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendYears().toFormatter();
        assertEquals("12", formatter.print(new org.joda.time.Period(12, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testMinimumPrintedDigitsPadsField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().minimumPrintedDigits(3).appendYears().toFormatter();
        assertEquals("007", formatter.print(new org.joda.time.Period(7, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testMaximumParsedDigitsAllowsExactLimit() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .maximumParsedDigits(2).appendYears().toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals(2, formatter.parseInto(period, "12", 0));
        assertEquals(12, period.get(DurationFieldType.years()));
    }

    @Test
    public void testMaximumParsedDigitsStopsBeforeThirdDigit() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .maximumParsedDigits(2).appendYears().toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals(2, formatter.parseInto(period, "123", 0));
        assertEquals(12, period.get(DurationFieldType.years()));
    }

    @Test
    public void testSignedValuesAcceptedByDefault() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendYears().toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals(3, formatter.parseInto(period, "-12", 0));
        assertEquals(-12, period.get(DurationFieldType.years()));
    }

    @Test
    public void testRejectSignedValues() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .rejectSignedValues(true).appendYears().toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals(~0, formatter.parseInto(period, "-12", 0));
    }

    @Test
    public void testPrefixAndSuffixRoundTrip() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("Y").appendYears().appendSuffix("y").toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals("Y3y", formatter.print(new org.joda.time.Period(3, 0, 0, 0, 0, 0, 0, 0)));
        assertEquals(3, formatter.parseInto(period, "Y3y", 0));
        assertEquals(3, period.get(DurationFieldType.years()));
    }

    @Test
    public void testPluralSuffixSelectsPluralForNonOne() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendYears().appendSuffix(" year", " years").toFormatter();
        assertEquals("2 years", formatter.print(new org.joda.time.Period(2, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testPluralSuffixSelectsSingularForOne() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendYears().appendSuffix(" year", " years").toFormatter();
        assertEquals("1 year", formatter.print(new org.joda.time.Period(1, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testRarelyLastPrintsZeroWhenAllFieldsZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendYears().toFormatter();
        assertEquals("0", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testZeroNeverOmitsZeroField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroNever().appendYears().toFormatter();
        assertEquals("", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testPrintZeroAlwaysPrintsZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendYears().toFormatter();
        assertEquals("0", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testSecondsWithMillisPrintsFixedFraction() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendSecondsWithMillis().toFormatter();
        assertEquals("0.005", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 0, 0, 0, 5)));
    }

    @Test
    public void testOptionalMillisOmitsZeroFraction() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendSecondsWithOptionalMillis().toFormatter();
        assertEquals("2", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 0, 0, 2, 0)));
    }

    @Test
    public void testFractionParsingScalesOneDigitToMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendSecondsWithMillis().toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals(3, formatter.parseInto(period, "1.2", 0));
        assertEquals(1, period.get(DurationFieldType.seconds()));
        assertEquals(200, period.get(DurationFieldType.millis()));
    }

    @Test
    public void testSeparatorUsesFinalTextForLastPair() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendDays().appendSeparator(",", "&")
                .appendHours().toFormatter();
        assertEquals("1&2", formatter.print(new org.joda.time.Period(0, 0, 0, 1, 2, 0, 0, 0)));
    }

    @Test
    public void testSeparatorParsingConsumesSeparatorWhenBothFieldsPresent() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays().appendSeparator(",").appendHours().toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals(2, formatter.parseInto(period, "12", 0));
    }

    @Test
    public void testClearRemovesPreviouslyAppendedLiteral() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder().appendLiteral("x");
        builder.clear();
        assertEquals("", builder.toFormatter().print(new org.joda.time.Period()));
    }

    @Test
    public void testPrinterParserAvailabilityAfterLiteral() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder().appendLiteral("z");
        assertNotNull(builder.toPrinter());
        assertNotNull(builder.toParser());
        assertEquals("z", builder.toFormatter().print(new org.joda.time.Period()));
    }

    @Test
    public void testParsingIntegerMaximum() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendYears().toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals(10, formatter.parseInto(period, "2147483647", 0));
        assertEquals(Integer.MAX_VALUE, period.get(DurationFieldType.years()));
    }

    @Test
    public void testParsingIntegerOverflowThrows() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendYears().toFormatter();
        try {
            formatter.parseInto(new org.joda.time.MutablePeriod(), "2147483648", 0);
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testAppendExistingFormatter() throws Exception {
        PeriodFormatter source = new PeriodFormatterBuilder().appendLiteral("x").toFormatter();
        PeriodFormatter combined = new PeriodFormatterBuilder().append(source).toFormatter();
        assertEquals("x", combined.print(new org.joda.time.Period()));
        assertEquals(1, combined.parseInto(new org.joda.time.MutablePeriod(), "x", 0));
    }

    @Test
    public void testPrintZeroRarelyFirstKeepsInitialZeroWhenAllZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroRarelyFirst().appendYears().appendMonths().toFormatter();
        assertEquals("0", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testPrintZeroIfSupportedPrintsSupportedZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported().appendMonths().toFormatter();
        assertEquals("0", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testAppendMonthsAndWeeksPrintValues() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendMonths().appendLiteral(":").appendWeeks().toFormatter();
        assertEquals("4:2", formatter.print(new org.joda.time.Period(0, 4, 2, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendMinutesAndSecondsPrintValues() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendMinutes().appendLiteral(":").appendSeconds().toFormatter();
        assertEquals("5:6", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 0, 5, 6, 0)));
    }

    @Test
    public void testAppendMillisPrintsMillisValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendMillis().toFormatter();
        assertEquals("7", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 0, 0, 0, 7)));
    }

    @Test
    public void testAppendMillis3DigitPadsToThreeDigits() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendMillis3Digit().toFormatter();
        assertEquals("007", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 0, 0, 0, 7)));
    }

    @Test
    public void testSeparatorIfFieldsAfterPrintsBetweenFields() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendDays().appendSeparatorIfFieldsAfter(",")
                .appendHours().toFormatter();
        assertEquals("1,2", formatter.print(new org.joda.time.Period(0, 0, 0, 1, 2, 0, 0, 0)));
    }

    @Test
    public void testSeparatorIfFieldsBeforePrintsAfterEarlierField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendDays().appendSeparatorIfFieldsBefore(",")
                .appendHours().toFormatter();
        assertEquals("1,2", formatter.print(new org.joda.time.Period(0, 0, 0, 1, 2, 0, 0, 0)));
    }

    @Test
    public void testPrintToUsesSuppliedBuffer() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendYears().toFormatter();
        StringBuffer buffer = new StringBuffer();
        formatter.getPrinter().printTo(buffer,
                new org.joda.time.Period(7, 0, 0, 0, 0, 0, 0, 0), Locale.ROOT);
        assertEquals("7", buffer.toString());
    }

    @Test
    public void testCountFieldsToPrintHonorsStopAtZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendYears().toFormatter();
        assertEquals(0, formatter.getPrinter().countFieldsToPrint(
                new org.joda.time.Period(1, 0, 0, 0, 0, 0, 0, 0), 0, Locale.ROOT));
    }

    @Test
    public void testCountFieldsToPrintCountsFieldUpToLimit() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendYears().appendMonths().toFormatter();
        assertEquals(1, formatter.getPrinter().countFieldsToPrint(
                new org.joda.time.Period(1, 2, 0, 0, 0, 0, 0, 0), 1, Locale.ROOT));
    }

    @Test
    public void testParsedMaxIntegerNegativeEdge() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendYears().toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals(11, formatter.parseInto(period, "-2147483648", 0));
        assertEquals(Integer.MIN_VALUE, period.get(DurationFieldType.years()));
    }

    @Test
    public void testParseAtNonzeroPosition() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendYears().toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals(3, formatter.parseInto(period, "x12", 1));
        assertEquals(12, period.get(DurationFieldType.years()));
    }

    @Test
    public void testWriterPrintsMillisField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendMillis().toFormatter();
        java.io.StringWriter writer = new java.io.StringWriter();
        formatter.getPrinter().printTo(writer,
                new org.joda.time.Period(0, 0, 0, 0, 0, 0, 0, 8), Locale.ROOT);
        assertEquals("8", writer.toString());
    }
}
