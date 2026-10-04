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
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.MutableDateTime.Property;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

public class DateTimeFormatterBuilderTest {
    @Test
    public void testEmptyBuilderCannotBuildFormatter() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder();
        assertFalse(b.canBuildFormatter());
        try { b.toFormatter(); fail("expected UnsupportedOperationException"); }
        catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testLiteralBuilderSupportsBothDirections() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendLiteral('X');
        assertTrue(b.canBuildFormatter());
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
        assertEquals(1, b.toPrinter().estimatePrintedLength());
        assertEquals(1, b.toParser().estimateParsedLength());
    }

    @Test
    public void testPrinterOnlyCannotBuildParser() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTimeZoneName();
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
        assertTrue(b.canBuildFormatter());
        assertEquals(20, b.toParser().estimateParsedLength());
    }

    @Test
    public void testParserOnlyCannotBuildPrinter() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendOptional(
                new DateTimeFormatterBuilder().appendLiteral('A').toParser());
        assertFalse(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
    }

    @Test
    public void testClearResetsBuilder() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendLiteral("AB");
        assertEquals(2, b.toPrinter().estimatePrintedLength());
        b.clear();
        assertFalse(b.canBuildFormatter());
    }

    @Test
    public void testLiteralStringLengthAndEstimates() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendLiteral("ABC");
        assertEquals(3, b.toPrinter().estimatePrintedLength());
        assertEquals(3, b.toParser().estimateParsedLength());
    }

    @Test
    public void testEmptyLiteralDoesNotChangeBuilder() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendLiteral("");
        assertFalse(b.canBuildFormatter());
        b.appendLiteral('Z');
        assertEquals(1, b.toPrinter().estimatePrintedLength());
    }

    @Test
    public void testAppendLiteralRejectsNull() throws Exception {
        try { new DateTimeFormatterBuilder().appendLiteral((String) null); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        assertEquals(1, new DateTimeFormatterBuilder().appendLiteral('Q').toPrinter().estimatePrintedLength());
    }

    @Test
    public void testDecimalNormalizesMaximumAndPadsMinimum() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendDecimal(DateTimeFieldType.year(), 3, 2);
        assertEquals(3, b.toPrinter().estimatePrintedLength());
        assertEquals(3, b.toParser().estimateParsedLength());
    }

    @Test
    public void testDecimalRejectsInvalidDigitCounts() throws Exception {
        try { new DateTimeFormatterBuilder().appendDecimal(DateTimeFieldType.year(), -1, 2); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { new DateTimeFormatterBuilder().appendDecimal(DateTimeFieldType.year(), 0, 0); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        assertEquals(2, new DateTimeFormatterBuilder().appendDecimal(DateTimeFieldType.year(), 0, 2)
                .toParser().estimateParsedLength());
    }

    @Test
    public void testFixedDecimalRejectsZeroAndAcceptsOne() throws Exception {
        try { new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.year(), 0); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        assertEquals(1, new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.year(), 1)
                .toParser().estimateParsedLength());
    }

    @Test
    public void testSignedDecimalEstimateUsesMaximumDigits() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendSignedDecimal(DateTimeFieldType.year(), 1, 4);
        assertEquals(4, b.toParser().estimateParsedLength());
    }

    @Test
    public void testFixedSignedDecimalEstimate() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendFixedSignedDecimal(DateTimeFieldType.year(), 2);
        assertEquals(2, b.toParser().estimateParsedLength());
        assertEquals(2, b.toPrinter().estimatePrintedLength());
    }

    @Test
    public void testTextAndShortTextEstimates() throws Exception {
        DateTimeFormatterBuilder text = new DateTimeFormatterBuilder().appendText(DateTimeFieldType.monthOfYear());
        DateTimeFormatterBuilder shortText = new DateTimeFormatterBuilder().appendShortText(DateTimeFieldType.monthOfYear());
        assertEquals(20, text.toPrinter().estimatePrintedLength());
        assertEquals(6, shortText.toParser().estimateParsedLength());
    }

    @Test
    public void testFractionCapsMaximumDigitsAtEighteen() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendFraction(DateTimeFieldType.secondOfDay(), 0, 19);
        assertEquals(18, b.toPrinter().estimatePrintedLength());
        assertEquals(18, b.toParser().estimateParsedLength());
    }

    @Test
    public void testFractionRejectsInvalidMinimum() throws Exception {
        try { new DateTimeFormatterBuilder().appendFraction(DateTimeFieldType.secondOfDay(), -1, 2); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        assertEquals(2, new DateTimeFormatterBuilder()
                .appendFractionOfSecond(0, 2).toParser().estimateParsedLength());
    }

    @Test
    public void testConvenienceFieldBuilderEstimates() throws Exception {
        assertEquals(3, new DateTimeFormatterBuilder().appendMillisOfSecond(0).toParser().estimateParsedLength());
        assertEquals(8, new DateTimeFormatterBuilder().appendMillisOfDay(0).toParser().estimateParsedLength());
        assertEquals(2, new DateTimeFormatterBuilder().appendSecondOfMinute(0).toParser().estimateParsedLength());
        assertEquals(4, new DateTimeFormatterBuilder().appendMinuteOfDay(0).toParser().estimateParsedLength());
    }

    @Test
    public void testTwoDigitYearEstimate() throws Exception {
        assertEquals(2, new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toParser().estimateParsedLength());
        assertEquals(4, new DateTimeFormatterBuilder().appendTwoDigitYear(2000, true).toParser().estimateParsedLength());
    }

    @Test
    public void testWeekyearAndYearConvenienceBuilders() throws Exception {
        assertEquals(4, new DateTimeFormatterBuilder().appendWeekyear(1, 4).toParser().estimateParsedLength());
        assertEquals(4, new DateTimeFormatterBuilder().appendYear(1, 4).toParser().estimateParsedLength());
        assertEquals(3, new DateTimeFormatterBuilder().appendYearOfEra(1, 3).toParser().estimateParsedLength());
    }

    @Test
    public void testTextConvenienceMethodsBuildBothDirections() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendMonthOfYearText();
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
        assertEquals(20, b.toParser().estimateParsedLength());
    }

    @Test
    public void testTimeZoneIdBuildsBothDirections() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendTimeZoneId();
        assertTrue(b.canBuildPrinter());
        assertTrue(b.canBuildParser());
        assertTrue(b.toPrinter().estimatePrintedLength() > 0);
    }

    @Test
    public void testTimeZoneOffsetFieldValidation() throws Exception {
        try { new DateTimeFormatterBuilder().appendTimeZoneOffset(null, false, 0, 1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        try { new DateTimeFormatterBuilder().appendTimeZoneOffset(null, false, 2, 1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        assertEquals(4, new DateTimeFormatterBuilder().appendTimeZoneOffset(null, false, 1, 1)
                .toPrinter().estimatePrintedLength());
    }

    @Test
    public void testPatternAppendProducesFormatter() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendPattern("yyyy");
        assertTrue(b.canBuildFormatter());
        assertTrue(b.toPrinter().estimatePrintedLength() > 0);
    }

    @Test
    public void testAppendNullParserThrows() throws Exception {
        try { new DateTimeFormatterBuilder().appendOptional(null); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
        assertEquals(1, new DateTimeFormatterBuilder().appendLiteral('A').toParser().estimateParsedLength());
    }

    @Test
    public void testFormatterCanBeAppended() throws Exception {
        DateTimeFormatter f = new DateTimeFormatterBuilder().appendLiteral('A').toFormatter();
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().append(f);
        assertTrue(b.canBuildFormatter());
        assertEquals(1, b.toPrinter().estimatePrintedLength());
        assertEquals(1, b.toParser().estimateParsedLength());
    }

    @Test
    public void testCompositeEstimatesSum() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendLiteral('A').appendLiteral("BC");
        assertEquals(3, b.toPrinter().estimatePrintedLength());
        assertEquals(3, b.toParser().estimateParsedLength());
    }

    @Test
    public void testEmptyOptionalParserHasZeroEstimate() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendOptional(
                new DateTimeFormatterBuilder().appendLiteral('X').toParser());
        assertTrue(b.canBuildParser());
        assertEquals(1, b.toParser().estimateParsedLength());
    }

    @Test
    public void testMoreFractionConvenienceEstimates() throws Exception {
        assertEquals(3, new DateTimeFormatterBuilder().appendFractionOfMinute(0, 3).toParser().estimateParsedLength());
        assertEquals(4, new DateTimeFormatterBuilder().appendFractionOfHour(0, 4).toParser().estimateParsedLength());
        assertEquals(5, new DateTimeFormatterBuilder().appendFractionOfDay(0, 5).toParser().estimateParsedLength());
    }

    @Test
    public void testRemainingDecimalConvenienceEstimates() throws Exception {
        assertEquals(5, new DateTimeFormatterBuilder().appendSecondOfDay(0).toParser().estimateParsedLength());
        assertEquals(2, new DateTimeFormatterBuilder().appendMinuteOfHour(0).toParser().estimateParsedLength());
        assertEquals(2, new DateTimeFormatterBuilder().appendHourOfDay(0).toParser().estimateParsedLength());
        assertEquals(2, new DateTimeFormatterBuilder().appendClockhourOfDay(0).toParser().estimateParsedLength());
    }

    @Test
    public void testHalfdayAndCalendarFieldEstimates() throws Exception {
        assertEquals(2, new DateTimeFormatterBuilder().appendHourOfHalfday(0).toParser().estimateParsedLength());
        assertEquals(2, new DateTimeFormatterBuilder().appendClockhourOfHalfday(0).toParser().estimateParsedLength());
        assertEquals(1, new DateTimeFormatterBuilder().appendDayOfWeek(0).toParser().estimateParsedLength());
        assertEquals(2, new DateTimeFormatterBuilder().appendDayOfMonth(0).toParser().estimateParsedLength());
    }

    @Test
    public void testYearAndMonthConvenienceEstimates() throws Exception {
        assertEquals(3, new DateTimeFormatterBuilder().appendDayOfYear(0).toParser().estimateParsedLength());
        assertEquals(2, new DateTimeFormatterBuilder().appendWeekOfWeekyear(0).toParser().estimateParsedLength());
        assertEquals(2, new DateTimeFormatterBuilder().appendMonthOfYear(0).toParser().estimateParsedLength());
        assertEquals(2, new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000).toParser().estimateParsedLength());
    }

    @Test
    public void testAdditionalYearEstimates() throws Exception {
        assertEquals(3, new DateTimeFormatterBuilder().appendYearOfCentury(1, 3).toParser().estimateParsedLength());
        assertEquals(3, new DateTimeFormatterBuilder().appendCenturyOfEra(1, 3).toParser().estimateParsedLength());
    }

    @Test
    public void testTextConveniencesHaveExpectedEstimates() throws Exception {
        assertEquals(20, new DateTimeFormatterBuilder().appendHalfdayOfDayText().toParser().estimateParsedLength());
        assertEquals(20, new DateTimeFormatterBuilder().appendDayOfWeekText().toParser().estimateParsedLength());
        assertEquals(6, new DateTimeFormatterBuilder().appendDayOfWeekShortText().toParser().estimateParsedLength());
        assertEquals(6, new DateTimeFormatterBuilder().appendMonthOfYearShortText().toParser().estimateParsedLength());
        assertEquals(20, new DateTimeFormatterBuilder().appendEraText().toParser().estimateParsedLength());
    }

    @Test
    public void testShortTimeZoneNameEstimate() throws Exception {
        assertEquals(4, new DateTimeFormatterBuilder().appendTimeZoneShortName().toPrinter().estimatePrintedLength());
    }

    @Test
    public void testCompositePrintToStringBuffer() throws Exception {
        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder().appendLiteral('A').appendLiteral("BC");
        StringBuffer out = new StringBuffer();
        b.toPrinter().printTo(out, 0L, null, 0, null, Locale.US);
        assertEquals("ABC", out.toString());
    }

    @Test
    public void testParserRejectsMissingLiteralAtStart() throws Exception {
        DateTimeParser parser = new DateTimeFormatterBuilder().appendLiteral("AB").toParser();
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, null, Locale.US, null, 2000);
        assertEquals(~0, parser.parseInto(bucket, "AC", 0));
    }

    @Test
    public void testParserConsumesLiteralFromNonzeroPosition() throws Exception {
        DateTimeParser parser = new DateTimeFormatterBuilder().appendLiteral('X').toParser();
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, null, Locale.US, null, 2000);
        assertEquals(2, parser.parseInto(bucket, "aX", 1));
    }
}
