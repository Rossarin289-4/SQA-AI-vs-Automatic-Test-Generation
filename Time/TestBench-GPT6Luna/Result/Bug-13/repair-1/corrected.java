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
    public void testEmptyBuilderCanFormatEmptyLiteral() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().toFormatter();
        assertEquals("", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testAppendLiteralPrintingAndParsing() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendLiteral("day").toFormatter();
        assertEquals("day", formatter.print(new org.joda.time.Period()));
        assertEquals(new org.joda.time.Period(), formatter.parsePeriod("DAY"));
    }

    @Test
    public void testAppendLiteralRejectsNull() throws Exception {
        try {
            new PeriodFormatterBuilder().appendLiteral(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testMinimumPrintedDigits() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .minimumPrintedDigits(3).appendDays().toFormatter();
        assertEquals("007", formatter.print(new org.joda.time.Period(0, 0, 0, 7, 0, 0, 0, 0)));
    }

    @Test
    public void testMaximumParsedDigitsAtLimit() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .maximumParsedDigits(2).appendDays().toFormatter();
        assertEquals(12, formatter.parsePeriod("12").getDays());
    }

    @Test
    public void testMaximumParsedDigitsStopsAtLimit() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .maximumParsedDigits(2).appendDays().toFormatter();
        assertEquals(12, formatter.parsePeriod("123").getDays());
    }

    @Test
    public void testRejectSignedValues() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .rejectSignedValues(true).appendDays().toFormatter();
        try {
            formatter.parsePeriod("-2");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testPrintZeroAlwaysIncludesZeroField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendDays().toFormatter();
        assertEquals("0", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testPrintZeroNeverOmitsZeroField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroNever().appendDays().toFormatter();
        assertEquals("", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testPrintZeroIfSupportedIncludesSupportedZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported().appendDays().toFormatter();
        assertEquals("0", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testPrintZeroRarelyLastForAllZeroFields() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays().appendHours().toFormatter();
        assertEquals("0", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testPrintZeroRarelyFirstForAllZeroFields() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroRarelyFirst().appendDays().appendHours().toFormatter();
        assertEquals("0", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testPrefixAndSuffixPrinting() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendPrefix("D").appendDays().appendSuffix("d").toFormatter();
        assertEquals("D3d", formatter.print(new org.joda.time.Period(0, 0, 0, 3, 0, 0, 0, 0)));
    }

    @Test
    public void testPluralSuffixChoosesSingularForOne() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays().appendSuffix(" day", " days").toFormatter();
        assertEquals("1 day", formatter.print(new org.joda.time.Period(0, 0, 0, 1, 0, 0, 0, 0)));
    }

    @Test
    public void testPluralSuffixChoosesPluralForOtherValue() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays().appendSuffix(" day", " days").toFormatter();
        assertEquals("2 days", formatter.print(new org.joda.time.Period(0, 0, 0, 2, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendSuffixWithoutFieldFails() throws Exception {
        try {
            new PeriodFormatterBuilder().appendSuffix("d");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testSeparatorBetweenTwoPrintedFields() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays().appendSeparator(",").appendHours().toFormatter();
        assertEquals("2,3", formatter.print(new org.joda.time.Period(0, 0, 0, 2, 3, 0, 0, 0)));
    }

    @Test
    public void testSeparatorOmittedWhenAfterFieldIsZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays().appendSeparator(",").appendHours().toFormatter();
        assertEquals("2", formatter.print(new org.joda.time.Period(0, 0, 0, 2, 0, 0, 0, 0)));
    }

    @Test
    public void testFinalSeparatorText() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays().appendSeparator(",", "&")
                .appendHours().appendSeparator(",", "&")
                .appendMinutes().toFormatter();
        assertEquals("1,2&3", formatter.print(new org.joda.time.Period(0, 0, 0, 1, 2, 3, 0, 0)));
    }

    @Test
    public void testAppendMillisThreeDigits() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMillis3Digit().toFormatter();
        assertEquals("007", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 0, 0, 0, 7)));
    }

    @Test
    public void testSecondsWithMillisFormatting() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendSecondsWithMillis().toFormatter();
        assertEquals("2.003", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 0, 0, 2, 3)));
    }

    @Test
    public void testSecondsOptionalMillisOmitsZeroFraction() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroAlways().appendSecondsWithOptionalMillis().toFormatter();
        assertEquals("2", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 0, 0, 2, 0)));
    }

    @Test
    public void testParseSecondsWithFraction() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSecondsWithMillis().toFormatter();
        org.joda.time.Period parsed = formatter.parsePeriod("2.003");
        assertEquals(2, parsed.getSeconds());
        assertEquals(3, parsed.getMillis());
    }

    @Test
    public void testClearRemovesAppendedElements() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder().appendLiteral("x");
        builder.clear();
        assertEquals("", builder.toFormatter().print(new org.joda.time.Period()));
    }

    @Test
    public void testExplicitRarelyLastPrintsZeroForOnlyZeroField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroRarelyLast().appendDays().toFormatter();
        assertEquals("0", formatter.print(new org.joda.time.Period()));
    }

    @Test
    public void testAppendYearsPrintsConfiguredYear() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears().toFormatter();
        assertEquals("3", formatter.print(new org.joda.time.Period(3, 0, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendMonthsPrintsConfiguredMonth() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMonths().toFormatter();
        assertEquals("4", formatter.print(new org.joda.time.Period(0, 4, 0, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendWeeksPrintsConfiguredWeek() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendWeeks().toFormatter();
        assertEquals("5", formatter.print(new org.joda.time.Period(0, 0, 5, 0, 0, 0, 0, 0)));
    }

    @Test
    public void testAppendSecondsPrintsConfiguredSeconds() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSeconds().toFormatter();
        assertEquals("6", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 0, 0, 6, 0)));
    }

    @Test
    public void testAppendMillisPrintsConfiguredMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMillis().toFormatter();
        assertEquals("7", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 0, 0, 0, 7)));
    }

    @Test
    public void testSeparatorIfFieldsAfterAppearsForLaterField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendSeparatorIfFieldsAfter(",").appendHours().toFormatter();
        assertEquals("3", formatter.print(new org.joda.time.Period(0, 0, 0, 0, 3, 0, 0, 0)));
    }

    @Test
    public void testSeparatorIfFieldsBeforeAppearsForEarlierField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendDays().appendSeparatorIfFieldsBefore(",").appendHours().toFormatter();
        assertEquals("2,3", formatter.print(new org.joda.time.Period(0, 0, 0, 2, 3, 0, 0, 0)));
    }

    @Test
    public void testSimpleAffixLengthPrintParseAndScan() throws Exception {
        PeriodFormatterBuilder.SimpleAffix affix =
                new PeriodFormatterBuilder.SimpleAffix("d");
        StringBuffer output = new StringBuffer();
        affix.printTo(output, 9);
        assertEquals(1, affix.calculatePrintedLength(9));
        assertEquals("d", output.toString());
        assertEquals(1, affix.parse("D!", 0));
        assertEquals(1, affix.scan("12d", 0));
    }

    @Test
    public void testPluralAffixChoosesSingularOnlyForOne() throws Exception {
        PeriodFormatterBuilder.PluralAffix affix =
                new PeriodFormatterBuilder.PluralAffix("day", "days");
        StringBuffer one = new StringBuffer();
        StringBuffer other = new StringBuffer();
        affix.printTo(one, 1);
        affix.printTo(other, 2);
        assertEquals("day", one.toString());
        assertEquals("days", other.toString());
        assertEquals(4, affix.calculatePrintedLength(2));
    }

    @Test
    public void testSimpleAffixScanStopsAtNonNumber() throws Exception {
        PeriodFormatterBuilder.SimpleAffix affix =
                new PeriodFormatterBuilder.SimpleAffix("d");
        assertEquals(~0, affix.scan("x12d", 0));
    }

    @Test
    public void testPluralAffixParsingAcceptsCaseInsensitively() throws Exception {
        PeriodFormatterBuilder.PluralAffix affix =
                new PeriodFormatterBuilder.PluralAffix("day", "days");
        assertEquals(3, affix.parse("DAY!", 0));
        assertEquals(4, affix.parse("DAYS!", 0));
    }
}
