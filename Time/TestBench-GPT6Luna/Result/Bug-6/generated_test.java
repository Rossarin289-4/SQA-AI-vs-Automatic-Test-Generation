package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class GJChronologyTest {
    @Test
    public void testDefaultCutoverAndMinimumWeekDays() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        assertEquals(-12219292800000L, c.getGregorianCutover().getMillis());
        assertEquals(4, c.getMinimumDaysInFirstWeek());
        assertEquals(DateTimeZone.UTC, c.getZone());
    }

    @Test
    public void testExplicitWeekMinimumAndCache() throws Exception {
        GJChronology a = GJChronology.getInstance(DateTimeZone.UTC, -12219292800000L, 1);
        GJChronology b = GJChronology.getInstance(DateTimeZone.UTC, -12219292800000L, 1);
        assertSame(a, b);
        assertEquals(1, a.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testNullZoneUsesUtcForExplicitDefaultCutover() throws Exception {
        GJChronology c = GJChronology.getInstance(null, (ReadableInstant) null);
        assertEquals(DateTimeZone.getDefault(), c.getZone());
        assertEquals(-12219292800000L, c.getGregorianCutover().getMillis());
    }

    @Test
    public void testCutoverAtEpochIsAccepted() throws Exception {
        GJChronology c = GJChronology.getInstance(DateTimeZone.UTC, new Instant(0L), 4);
        assertEquals(0L, c.getGregorianCutover().getMillis());
        assertEquals(4, c.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGregorianDateAtCutover() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        long millis = c.getDateTimeMillis(1582, 10, 15, 0);
        assertEquals(-12219292800000L, millis);
        assertEquals(15, c.dayOfMonth().get(millis));
    }

    @Test
    public void testJulianDateBeforeCutover() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        long millis = c.getDateTimeMillis(1582, 10, 4, 0);
        assertEquals(-12219379200000L, millis);
        assertEquals(4, c.dayOfMonth().get(millis));
    }

    @Test
    public void testDateInCutoverGapRejected() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        try {
            c.getDateTimeMillis(1582, 10, 10, 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(15, c.dayOfMonth().get(c.getGregorianCutover().getMillis()));
    }

    @Test
    public void testDateTimeOverloadAtCutover() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        long millis = c.getDateTimeMillis(1582, 10, 15, 1, 2, 3, 4);
        assertEquals(-12219289076996L, millis);
        assertEquals(1, c.hourOfDay().get(millis));
    }

    @Test
    public void testLeapDayBeforeCutoverUsesJulianCalendar() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        try {
            c.getDateTimeMillis(1500, 2, 29, 0);
            fail("expected IllegalFieldValueException");
        } catch (IllegalFieldValueException expected) {
        }
        assertEquals(28, c.dayOfMonth().get(c.getDateTimeMillis(1500, 2, 28, 0)));
    }

    @Test
    public void testLeapDayAfterCutoverRejectsNonLeapYear() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        try {
            c.getDateTimeMillis(1700, 2, 29, 0);
            fail("expected IllegalFieldValueException");
        } catch (IllegalFieldValueException expected) {
        }
        assertEquals(28, c.dayOfMonth().get(c.getDateTimeMillis(1700, 2, 28, 0)));
    }

    @Test
    public void testWithUtcReturnsSameUtcChronology() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        assertSame(c, c.withUTC());
    }

    @Test
    public void testWithZoneUtcIdentityAndOffsetZone() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        assertSame(c, c.withZone(DateTimeZone.UTC));
        Chronology shifted = c.withZone(DateTimeZone.forOffsetHours(2));
        assertEquals(DateTimeZone.forOffsetHours(2), shifted.getZone());
    }

    @Test
    public void testEqualityAndHashCodeForSameConfiguration() throws Exception {
        GJChronology a = GJChronology.getInstanceUTC();
        GJChronology b = GJChronology.getInstance(DateTimeZone.UTC, -12219292800000L, 4);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals(null));
    }

    @Test
    public void testToStringDefaultConfiguration() throws Exception {
        assertEquals("GJChronology[UTC]", GJChronology.getInstanceUTC().toString());
    }

    @Test
    public void testToStringIncludesNondefaultWeekMinimum() throws Exception {
        GJChronology c = GJChronology.getInstance(DateTimeZone.UTC, -12219292800000L, 1);
        assertEquals("GJChronology[UTC,mdfw=1]", c.toString());
    }

    @Test
    public void testJulianAndGregorianEraValuesAroundCutover() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        long before = c.getDateTimeMillis(1582, 10, 4, 0);
        long after = c.getDateTimeMillis(1582, 10, 15, 0);
        assertEquals(c.era().get(before), c.era().get(after));
    }

    @Test
    public void testYearFieldSetAndAddAcrossOrdinaryDate() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        long date = c.getDateTimeMillis(1700, 6, 12, 0);
        long set = c.year().set(date, 1701);
        assertEquals(1701, c.year().get(set));
        assertEquals(1701, c.year().get(c.year().add(date, 1)));
    }

    @Test
    public void testMonthFieldSetAndDifference() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        long start = c.getDateTimeMillis(1700, 3, 12, 0);
        long end = c.monthOfYear().add(start, 5);
        assertEquals(8, c.monthOfYear().get(end));
        assertEquals(5, c.monthOfYear().getDifference(end, start));
        assertEquals(5L, c.monthOfYear().getDifferenceAsLong(end, start));
    }

    @Test
    public void testDayOfMonthRangeAndLeapStatus() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        long date = c.getDateTimeMillis(1500, 2, 28, 0);
        assertEquals(28, c.dayOfMonth().getMaximumValue(date));
        assertFalse(c.dayOfYear().isLeap(date));
        assertEquals(0, c.dayOfYear().getLeapAmount(date));
    }

    @Test
    public void testFieldRoundingAroundMidnight() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        long instant = c.getDateTimeMillis(1700, 1, 2, 1234);
        assertEquals(c.getDateTimeMillis(1700, 1, 2, 0), c.dayOfMonth().roundFloor(instant));
        assertEquals(c.getDateTimeMillis(1700, 1, 3, 0), c.dayOfMonth().roundCeiling(instant));
    }

    @Test
    public void testFieldTextMethodsReturnValues() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        long instant = c.getDateTimeMillis(1700, 1, 2, 0);
        assertEquals("2", c.dayOfMonth().getAsText(instant, Locale.ROOT));
        assertEquals("2", c.dayOfMonth().getAsShortText(instant, Locale.ROOT));
        assertEquals(2, c.dayOfMonth().get(instant));
    }

    @Test
    public void testFieldDurationAndLimits() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        assertTrue(c.dayOfMonth().getDurationField().isSupported());
        assertEquals(1, c.dayOfMonth().getMinimumValue());
        assertEquals(31, c.dayOfMonth().getMaximumValue());
        assertTrue(c.dayOfMonth().getRangeDurationField().isSupported());
    }

    @Test
    public void testDayOfMonthFieldIsNotLenient() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        assertFalse(c.dayOfMonth().isLenient());
    }

    @Test
    public void testYearFieldIsNotLenient() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        assertFalse(c.year().isLenient());
    }

    @Test
    public void testYearFieldIsNotLenientAtJulianDate() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        long before = c.getDateTimeMillis(1500, 6, 1, 0);
        assertFalse(c.year().isLenient());
        assertEquals(1500, c.year().get(before));
    }

    @Test
    public void testDayOfYearLeapDurationFieldIsNull() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        assertNull(c.dayOfYear().getLeapDurationField());
        assertEquals(1, c.dayOfYear().getLeapAmount(
                c.getDateTimeMillis(1500, 6, 1, 0)));
    }

    @Test
    public void testYearLeapDurationFieldIsSupported() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        assertTrue(c.year().getLeapDurationField().isSupported());
        assertEquals(1, c.year().getLeapAmount(
                c.getDateTimeMillis(1700, 6, 1, 0)));
    }

    @Test
    public void testMonthMaximumTextLengthCoversNumericText() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        int maximum = c.monthOfYear().getMaximumTextLength(Locale.ROOT);
        assertTrue(maximum >= c.monthOfYear().getAsText(12, Locale.ROOT).length());
    }

    @Test
    public void testMonthMaximumShortTextLengthCoversNumericText() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        int maximum = c.monthOfYear().getMaximumShortTextLength(Locale.ROOT);
        assertTrue(maximum >= c.monthOfYear().getAsShortText(12, Locale.ROOT).length());
    }

    @Test
    public void testTextLengthsArePositiveForDayOfMonth() throws Exception {
        GJChronology c = GJChronology.getInstanceUTC();
        assertTrue(c.dayOfMonth().getMaximumTextLength(Locale.ROOT) > 0);
        assertTrue(c.dayOfMonth().getMaximumShortTextLength(Locale.ROOT) > 0);
    }
}
