package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class MutableDateTimeTest {
    @Test
    public void testInitialRoundingIsDisabled() throws Exception {
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 3, 4, 5, 6,
                DateTimeZone.forID("UTC"));
        assertNull(dt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, dt.getRoundingMode());
    }

    @Test
    public void testSetRoundingFloorRoundsImmediately() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 3, 4, 5, 6, utc);
        dt.setRounding(dt.hourOfDay().getField());
        MutableDateTime expected = new MutableDateTime(2000, 1, 2, 3, 0, 0, 0, utc);
        assertEquals(expected.toString(), dt.toString());
        assertEquals(MutableDateTime.ROUND_FLOOR, dt.getRoundingMode());
    }

    @Test
    public void testSetRoundingNoneDisablesRounding() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 3, 4, 5, 6, utc);
        dt.setRounding(dt.hourOfDay().getField());
        dt.setRounding(dt.hourOfDay().getField(), MutableDateTime.ROUND_NONE);
        dt.setMillis(946782245007L);
        assertEquals(new MutableDateTime(946782245007L, utc).toString(), dt.toString());
        assertEquals(MutableDateTime.ROUND_NONE, dt.getRoundingMode());
    }

    @Test
    public void testSetMillisRoundsSubsequentValues() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 3, 4, 5, 6, utc);
        dt.setRounding(dt.hourOfDay().getField());
        dt.setMillis(946782245007L);
        assertEquals(new MutableDateTime(2000, 1, 2, 3, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetRoundingRejectsModeAboveMaximum() throws Exception {
        MutableDateTime dt = new MutableDateTime(0L, DateTimeZone.forID("UTC"));
        try {
            dt.setRounding(dt.hourOfDay().getField(), MutableDateTime.ROUND_HALF_EVEN + 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(MutableDateTime.ROUND_NONE, dt.getRoundingMode());
        }
    }

    @Test
    public void testAddLongPositiveAndNegative() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(1000L, utc);
        dt.add(250L);
        dt.add(-50L);
        assertEquals(new MutableDateTime(1200L, utc).toString(), dt.toString());
    }

    @Test
    public void testSetYearChangesYearAndPreservesOtherFields() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 2, 3, 4, 5, 6, 7, utc);
        dt.setYear(2004);
        assertEquals(new MutableDateTime(2004, 2, 3, 4, 5, 6, 7, utc).toString(),
                dt.toString());
    }

    @Test
    public void testAddMonthsAcrossYearBoundary() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 12, 15, 4, 5, 6, 7, utc);
        dt.addMonths(1);
        assertEquals(new MutableDateTime(2001, 1, 15, 4, 5, 6, 7, utc).toString(),
                dt.toString());
    }

    @Test
    public void testAddDaysAcrossMonthBoundary() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 31, 4, 5, 6, 7, utc);
        dt.addDays(1);
        assertEquals(new MutableDateTime(2000, 2, 1, 4, 5, 6, 7, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetDateKeepsTime() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 4, 5, 6, 7, utc);
        dt.setDate(2001, 3, 4);
        assertEquals(new MutableDateTime(2001, 3, 4, 4, 5, 6, 7, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetTimeKeepsDate() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 4, 5, 6, 7, utc);
        dt.setTime(8, 9, 10, 11);
        assertEquals(new MutableDateTime(2000, 1, 2, 8, 9, 10, 11, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetDateTimeReplacesAllFields() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 4, 5, 6, 7, utc);
        dt.setDateTime(2001, 3, 4, 8, 9, 10, 11);
        assertEquals(new MutableDateTime(2001, 3, 4, 8, 9, 10, 11, utc).toString(),
                dt.toString());
    }

    @Test
    public void testPropertySetChangesLinkedInstant() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 4, 5, 6, 7, utc);
        dt.monthOfYear().set(3);
        assertEquals(new MutableDateTime(2000, 3, 2, 4, 5, 6, 7, utc).toString(),
                dt.toString());
    }

    @Test
    public void testCopyIsIndependentAfterCopying() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime original = new MutableDateTime(2000, 1, 2, 4, 5, 6, 7, utc);
        MutableDateTime copy = original.copy();
        copy.addDays(1);
        assertEquals(new MutableDateTime(2000, 1, 2, 4, 5, 6, 7, utc).toString(),
                original.toString());
        assertEquals(new MutableDateTime(2000, 1, 3, 4, 5, 6, 7, utc).toString(),
                copy.toString());
    }

    @Test
    public void testSetZonePreservesMillis() throws Exception {
        MutableDateTime dt = new MutableDateTime(0L, DateTimeZone.forID("UTC"));
        dt.setZone(DateTimeZone.forOffsetHours(1));
        assertEquals(new MutableDateTime(0L, DateTimeZone.forOffsetHours(1)).toString(),
                dt.toString());
    }

    @Test
    public void testParseIsoInstant() throws Exception {
        MutableDateTime dt = MutableDateTime.parse("2000-01-02T03:04:05.006Z");
        assertEquals("2000-01-02T03:04:05.006Z", dt.toString());
    }

    @Test
    public void testSetChronologyRetainsMillis() throws Exception {
        MutableDateTime dt = new MutableDateTime(0L, DateTimeZone.forID("UTC"));
        dt.setChronology(ISOChronology.getInstance(DateTimeZone.forOffsetHours(2)));
        assertEquals(0L, dt.getMillis());
        assertEquals(DateTimeZone.forOffsetHours(2), dt.getZone());
    }

    @Test
    public void testSetZoneRetainFieldsAdjustsMillis() throws Exception {
        MutableDateTime dt = new MutableDateTime(0L, DateTimeZone.forID("UTC"));
        dt.setZoneRetainFields(DateTimeZone.forOffsetHours(1));
        assertEquals(-3600000L, dt.getMillis());
        assertEquals(DateTimeZone.forOffsetHours(1), dt.getZone());
    }

    @Test
    public void testAddYearsAcrossLeapDate() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 2, 29, 12, 0, 0, 0, utc);
        dt.addYears(1);
        assertEquals(new MutableDateTime(2001, 2, 28, 12, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetWeekyearPreservesWeekFields() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 3, 12, 0, 0, 0, utc);
        dt.setWeekyear(2001);
        assertEquals(new MutableDateTime(2001, 1, 1, 12, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testAddWeekyearsZeroIsNoChange() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 3, 12, 0, 0, 0, utc);
        String before = dt.toString();
        dt.addWeekyears(0);
        assertEquals(before, dt.toString());
    }

    @Test
    public void testSetMonthOfYearAtYearBoundary() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 15, 12, 0, 0, 0, utc);
        dt.setMonthOfYear(12);
        assertEquals(new MutableDateTime(2000, 12, 15, 12, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetWeekOfWeekyear() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 3, 12, 0, 0, 0, utc);
        dt.setWeekOfWeekyear(2);
        assertEquals(new MutableDateTime(2000, 1, 10, 12, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testAddWeeksAcrossYearBoundary() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 12, 25, 12, 0, 0, 0, utc);
        dt.addWeeks(1);
        assertEquals(new MutableDateTime(2001, 1, 1, 12, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetDayOfYearAtEndOfLeapYear() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 1, 12, 0, 0, 0, utc);
        dt.setDayOfYear(366);
        assertEquals(new MutableDateTime(2000, 12, 31, 12, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetDayOfMonthLastDay() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 2, 1, 12, 0, 0, 0, utc);
        dt.setDayOfMonth(29);
        assertEquals(new MutableDateTime(2000, 2, 29, 12, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetDayOfWeekChangesWithinWeek() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 3, 12, 0, 0, 0, utc);
        dt.setDayOfWeek(7);
        assertEquals(new MutableDateTime(2000, 1, 9, 12, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetHourAndAddHoursAcrossDay() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 0, 0, 0, 0, utc);
        dt.setHourOfDay(23);
        dt.addHours(1);
        assertEquals(new MutableDateTime(2000, 1, 3, 0, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetMinuteOfDayLastMinute() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 12, 0, 0, 0, utc);
        dt.setMinuteOfDay(1439);
        assertEquals(new MutableDateTime(2000, 1, 2, 23, 59, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetMinuteOfHourAndAddMinutes() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 12, 0, 0, 0, utc);
        dt.setMinuteOfHour(59);
        dt.addMinutes(1);
        assertEquals(new MutableDateTime(2000, 1, 2, 13, 0, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetSecondOfDayLastSecond() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 0, 0, 0, 0, utc);
        dt.setSecondOfDay(86399);
        assertEquals(new MutableDateTime(2000, 1, 2, 23, 59, 59, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetSecondOfMinuteAndAddSeconds() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 12, 0, 0, 0, utc);
        dt.setSecondOfMinute(59);
        dt.addSeconds(1);
        assertEquals(new MutableDateTime(2000, 1, 2, 12, 1, 0, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetMillisOfDayAtLastMillisecond() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 0, 0, 0, 0, utc);
        dt.setMillisOfDay(86399999);
        assertEquals(new MutableDateTime(2000, 1, 2, 23, 59, 59, 999, utc).toString(),
                dt.toString());
    }

    @Test
    public void testSetMillisOfSecondAndAddMillis() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 12, 0, 0, 0, utc);
        dt.setMillisOfSecond(999);
        dt.addMillis(1);
        assertEquals(new MutableDateTime(2000, 1, 2, 12, 0, 1, 0, utc).toString(),
                dt.toString());
    }

    @Test
    public void testPropertyByFieldType() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 3, 4, 5, 6, utc);
        assertEquals(1, dt.property(DateTimeFieldType.monthOfYear()).get());
    }

    @Test
    public void testEraPropertyAtCommonEraDate() throws Exception {
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 0, 0, 0, 0,
                DateTimeZone.forID("UTC"));
        assertEquals(1, dt.era().get());
    }

    @Test
    public void testCenturyYearAndDayProperties() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 3, 4, 5, 6, utc);
        assertEquals(20, dt.centuryOfEra().get());
        assertEquals(0, dt.yearOfCentury().get());
        assertEquals(1999, dt.yearOfEra().get());
        assertEquals(2000, dt.year().get());
        assertEquals(1999, dt.weekyear().get());
        assertEquals(52, dt.weekOfWeekyear().get());
        assertEquals(2, dt.dayOfMonth().get());
        assertEquals(2, dt.dayOfYear().get());
        assertEquals(7, dt.dayOfWeek().get());
    }

    @Test
    public void testTimePropertiesExposeConfiguredTime() throws Exception {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        MutableDateTime dt = new MutableDateTime(2000, 1, 2, 3, 4, 5, 6, utc);
        assertEquals(184, dt.minuteOfDay().get());
        assertEquals(4, dt.minuteOfHour().get());
        assertEquals(11045, dt.secondOfDay().get());
        assertEquals(5, dt.secondOfMinute().get());
        assertEquals(11045006, dt.millisOfDay().get());
        assertEquals(6, dt.millisOfSecond().get());
    }
}
