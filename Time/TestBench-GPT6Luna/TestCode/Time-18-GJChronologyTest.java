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
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class GJChronologyTest {
    @Test
    public void testDefaultChronologyZone() throws Exception {
        assertSame(DateTimeZone.UTC, GJChronology.getInstanceUTC().getZone());
    }

    @Test
    public void testDefaultCutover() throws Exception {
        assertEquals(-12219292800000L, GJChronology.getInstanceUTC().getGregorianCutover().getMillis());
    }

    @Test
    public void testDefaultMinimumDays() throws Exception {
        assertEquals(4, GJChronology.getInstanceUTC().getMinimumDaysInFirstWeek());
    }

    @Test
    public void testUtcFactoryReusesInstance() throws Exception {
        assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstanceUTC());
    }

    @Test
    public void testExplicitDefaultCutoverReusesDefault() throws Exception {
        GJChronology chronology = GJChronology.getInstance(DateTimeZone.UTC, -12219292800000L, 4);
        assertEquals(GJChronology.getInstanceUTC(), chronology);
    }

    @Test
    public void testWithUtcReturnsSameInstance() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        assertSame(chronology, chronology.withUTC());
    }

    @Test
    public void testWithSameZoneReturnsSameInstance() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        assertSame(chronology, chronology.withZone(DateTimeZone.UTC));
    }

    @Test
    public void testCustomCutoverIsPreserved() throws Exception {
        long cutover = 0L;
        GJChronology chronology = GJChronology.getInstance(DateTimeZone.UTC, cutover, 4);
        assertEquals(cutover, chronology.getGregorianCutover().getMillis());
    }

    @Test
    public void testCustomMinimumDaysIsPreserved() throws Exception {
        GJChronology chronology = GJChronology.getInstance(DateTimeZone.UTC, -12219292800000L, 1);
        assertEquals(1, chronology.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGregorianDateAfterDefaultCutover() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        long instant = chronology.getDateTimeMillis(1582, 10, 15, 0);
        assertEquals(1582, chronology.year().get(instant));
        assertEquals(10, chronology.monthOfYear().get(instant));
        assertEquals(15, chronology.dayOfMonth().get(instant));
    }

    @Test
    public void testJulianDateBeforeDefaultCutover() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        long instant = chronology.getDateTimeMillis(1582, 10, 4, 0);
        assertEquals(1582, chronology.year().get(instant));
        assertEquals(10, chronology.monthOfYear().get(instant));
        assertEquals(4, chronology.dayOfMonth().get(instant));
    }

    @Test
    public void testCutoverGapDateThrows() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        try {
            chronology.getDateTimeMillis(1582, 10, 10, 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCutoverGapDateWithTimeThrows() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        try {
            chronology.getDateTimeMillis(1582, 10, 10, 12, 0, 0, 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testEqualFactoriesHaveEqualHashCodes() throws Exception {
        GJChronology first = GJChronology.getInstanceUTC();
        GJChronology second = GJChronology.getInstance(DateTimeZone.UTC, -12219292800000L, 4);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testDifferentMinimumDaysAreNotEqual() throws Exception {
        GJChronology first = GJChronology.getInstance(DateTimeZone.UTC, -12219292800000L, 4);
        GJChronology second = GJChronology.getInstance(DateTimeZone.UTC, -12219292800000L, 1);
        assertFalse(first.equals(second));
    }

    @Test
    public void testYearFieldCutoverSideGetAndSet() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        DateTimeField year = chronology.year();
        long before = chronology.getDateTimeMillis(1582, 10, 4, 0);
        long after = chronology.getDateTimeMillis(1582, 10, 15, 0);
        assertEquals(1582, year.get(before));
        assertEquals(1582, year.get(after));
        assertEquals(1581, year.get(year.set(after, 1581)));
    }

    @Test
    public void testYearFieldAddAcrossCutover() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        DateTimeField year = chronology.year();
        long instant = chronology.getDateTimeMillis(1581, 10, 4, 0);
        long result = year.add(instant, 1);
        assertEquals(1582, year.get(result));
    }

    @Test
    public void testYearDifferenceWithinSameSide() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        DateTimeField year = chronology.year();
        long start = chronology.getDateTimeMillis(1583, 10, 15, 0);
        long end = chronology.getDateTimeMillis(1584, 10, 15, 0);
        assertEquals(1, year.getDifference(end, start));
        assertEquals(1L, year.getDifferenceAsLong(end, start));
    }

    @Test
    public void testYearFieldLimits() throws Exception {
        DateTimeField year = GJChronology.getInstanceUTC().year();
        assertEquals(-292269055, year.getMinimumValue());
        assertEquals(Integer.MAX_VALUE, year.getMaximumValue());
    }

    @Test
    public void testMonthLeapAndLeapAmount() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        DateTimeField month = chronology.monthOfYear();
        long julianLeap = chronology.getDateTimeMillis(1500, 2, 15, 0);
        long gregorianCommon = chronology.getDateTimeMillis(1700, 2, 15, 0);
        assertTrue(month.isLeap(julianLeap));
        assertEquals(1, month.getLeapAmount(julianLeap));
        assertFalse(month.isLeap(gregorianCommon));
        assertEquals(0, month.getLeapAmount(gregorianCommon));
    }

    @Test
    public void testDayOfMonthRoundingAtGregorianDay() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        DateTimeField day = chronology.dayOfMonth();
        long instant = chronology.getDateTimeMillis(1582, 10, 15, 1234);
        assertEquals(chronology.getDateTimeMillis(1582, 10, 15, 0), day.roundFloor(instant));
        assertEquals(chronology.getDateTimeMillis(1582, 10, 16, 0), day.roundCeiling(instant));
    }

    @Test
    public void testDayOfMonthCutoverLimits() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        DateTimeField day = chronology.dayOfMonth();
        long instant = chronology.getDateTimeMillis(1582, 10, 15, 0);
        assertEquals(15, day.getMinimumValue(instant));
        assertEquals(31, day.getMaximumValue(instant));
    }

    @Test
    public void testFieldTextAndTextLengths() throws Exception {
        GJChronology chronology = GJChronology.getInstanceUTC();
        DateTimeField month = chronology.monthOfYear();
        long instant = chronology.getDateTimeMillis(2000, 1, 1, 0);
        assertEquals("January", month.getAsText(instant, Locale.ENGLISH));
        assertEquals("Jan", month.getAsShortText(instant, Locale.ENGLISH));
        assertTrue(month.getMaximumTextLength(Locale.ENGLISH) >= 7);
        assertTrue(month.getMaximumShortTextLength(Locale.ENGLISH) >= 3);
    }

    @Test
    public void testDayDurationFieldsExposePositiveDurations() throws Exception {
        Chronology chronology = GJChronology.getInstanceUTC();
        assertEquals(86400000L, chronology.days().getUnitMillis());
        assertEquals(604800000L, chronology.weeks().getUnitMillis());
    }

    @Test
    public void testChronologyStringForDefaultUtc() throws Exception {
        assertEquals("GJChronology[UTC]", GJChronology.getInstanceUTC().toString());
    }
}
