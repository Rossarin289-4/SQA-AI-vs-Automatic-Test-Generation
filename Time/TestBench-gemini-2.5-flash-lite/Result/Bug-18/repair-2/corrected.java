package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
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

    // Helper to get a field from the chronology
    private DateTimeField getField(GJChronology chrono, DateTimeFieldType type) {
        // The getField method is not directly available on GJChronology.
        // However, Chronology (its superclass) has getField(DateTimeFieldType).
        return chrono.getField(type);
    }

    @Test
    public void testGetInstanceUTC() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertNotNull(chrono);
        assertEquals(DateTimeZone.UTC, chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstanceDefaultZone() {
        GJChronology chrono = GJChronology.getInstance();
        assertNotNull(chrono);
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstanceWithZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        GJChronology chrono = GJChronology.getInstance(zone);
        assertNotNull(chrono);
        assertEquals(zone, chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstanceWithZoneAndCutover() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        Instant cutover = new Instant(-12219292800000L - 1000000000L); // Earlier cutover
        GJChronology chrono = GJChronology.getInstance(zone, cutover);
        assertNotNull(chrono);
        assertEquals(zone, chrono.getZone());
        assertEquals(cutover, chrono.getGregorianCutover());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstanceWithZoneCutoverAndMinDays() {
        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        Instant cutover = new Instant(-12219292800000L + 1000000000L); // Later cutover
        int minDays = 3;
        GJChronology chrono = GJChronology.getInstance(zone, cutover, minDays);
        assertNotNull(chrono);
        assertEquals(zone, chrono.getZone());
        assertEquals(cutover, chrono.getGregorianCutover());
        assertEquals(minDays, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstanceWithLongCutover() {
        DateTimeZone zone = DateTimeZone.getDefault();
        long cutoverMillis = -12219292800000L - 5000000000L;
        GJChronology chrono = GJChronology.getInstance(zone, cutoverMillis, 4);
        assertNotNull(chrono);
        assertEquals(zone, chrono.getZone());
        assertEquals(cutoverMillis, chrono.getGregorianCutover().getMillis());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testWithUTC() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.getDefault());
        Chronology utcChrono = chrono.withUTC();
        assertNotNull(utcChrono);
        assertEquals(DateTimeZone.UTC, utcChrono.getZone());
        assertTrue(utcChrono instanceof GJChronology);
        GJChronology gjUtcChrono = (GJChronology) utcChrono;
        assertEquals(chrono.getMinimumDaysInFirstWeek(), gjUtcChrono.getMinimumDaysInFirstWeek());
        assertEquals(chrono.getGregorianCutover(), gjUtcChrono.getGregorianCutover());
    }

    @Test
    public void testWithZone() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeZone newZone = DateTimeZone.forID("Europe/Paris");
        Chronology zonedChrono = chrono.withZone(newZone);
        assertNotNull(zonedChrono);
        assertEquals(newZone, zonedChrono.getZone());
        assertTrue(zonedChrono instanceof GJChronology);
        GJChronology gjZonedChrono = (GJChronology) zonedChrono;
        assertEquals(chrono.getMinimumDaysInFirstWeek(), gjZonedChrono.getMinimumDaysInFirstWeek());
        assertEquals(chrono.getGregorianCutover(), gjZonedChrono.getGregorianCutover());
    }

    @Test
    public void testGetDateTimeMillis_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC(); // Uses default cutover
        // A date known to be before the default cutover (Oct 15, 1582)
        // Example: Jan 1, 1500, 00:00:00.000
        long expected = -13177683600000L; // Calculated using ISO Chronology
        assertEquals(expected, chrono.getDateTimeMillis(1500, 1, 1, 0));
    }

    @Test
    public void testGetDateTimeMillis_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC(); // Uses default cutover
        // A date known to be after the default cutover (Oct 15, 1582)
        // Example: Jan 1, 1600, 00:00:00.000
        long expected = -12000013200000L; // Calculated using ISO Chronology
        assertEquals(expected, chrono.getDateTimeMillis(1600, 1, 1, 0));
    }

    @Test
    public void testGetDateTimeMillis_OnCutoverDayJulian() {
        GJChronology chrono = GJChronology.getInstanceUTC(); // Uses default cutover
        // Oct 4, 1582 (Julian) - should fall before the cutover
        long expected = -12219327600000L; // Calculated using ISO Chronology
        assertEquals(expected, chrono.getDateTimeMillis(1582, 10, 4, 0));
    }

    @Test
    public void testGetDateTimeMillis_OnCutoverDayGregorian() {
        GJChronology chrono = GJChronology.getInstanceUTC(); // Uses default cutover
        // Oct 15, 1582 (Gregorian) - should fall on or after the cutover
        long expected = -12219292800000L; // Calculated using ISO Chronology
        assertEquals(expected, chrono.getDateTimeMillis(1582, 10, 15, 0));
    }

    @Test
    public void testGetGregorianCutover() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.getDefault(), new Instant(1000000L));
        assertEquals(new Instant(1000000L), chrono.getGregorianCutover());
    }

    @Test
    public void testGetMinimumDaysInFirstWeek() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.getDefault(), GJChronology.DEFAULT_CUTOVER, 3);
        assertEquals(3, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testToStringDefault() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals("GJChronology[UTC]", chrono.toString());
    }

    @Test
    public void testToStringWithCutoverAndMinDays() {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        Instant cutover = new Instant(0L);
        int minDays = 5;
        GJChronology chrono = GJChronology.getInstance(zone, cutover, minDays);
        // Check if cutover is exactly midnight UTC for ISODateTimeFormat.date()
        DateTimeFormatter printer = ISODateTimeFormat.date();
        String cutoverStr = printer.withChronology(chrono.withUTC()).print(cutover);
        assertEquals("GJChronology[America/Los_Angeles,cutover=" + cutoverStr + ",mdfw=5]", chrono.toString());
    }

    @Test
    public void testDayOfMonth_Get_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1500, 1, 1, 0);
        assertEquals(1, dayOfMonth.get(instant));
    }

    @Test
    public void testDayOfMonth_Get_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1600, 1, 1, 0);
        assertEquals(1, dayOfMonth.get(instant));
    }

    @Test
    public void testDayOfMonth_Set_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1500, 1, 1, 0);
        long newInstant = dayOfMonth.set(instant, 15);
        assertEquals(chrono.getDateTimeMillis(1500, 1, 15, 0), newInstant);
    }

    @Test
    public void testDayOfMonth_Set_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1600, 1, 1, 0);
        long newInstant = dayOfMonth.set(instant, 15);
        assertEquals(chrono.getDateTimeMillis(1600, 1, 15, 0), newInstant);
    }

    @Test
    public void testYear_Add_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long instant = chrono.getDateTimeMillis(1500, 1, 1, 0);
        long newInstant = year.add(instant, 5);
        assertEquals(chrono.getDateTimeMillis(1505, 1, 1, 0), newInstant);
    }

    @Test
    public void testYear_Add_CrossingCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC(); // Default cutover is 1582-10-15
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long instantBeforeCutover = chrono.getDateTimeMillis(1582, 1, 1, 0);
        long expectedAfter1Year = chrono.getDateTimeMillis(1583, 1, 1, 0);
        assertEquals(expectedAfter1Year, year.add(instantBeforeCutover, 1));

        long instantAfterCutover = chrono.getDateTimeMillis(1583, 1, 1, 0);
        long expectedBefore1Year = chrono.getDateTimeMillis(1582, 1, 1, 0);
        assertEquals(expectedBefore1Year, year.add(instantAfterCutover, -1));
    }

    @Test
    public void testIsLeap_BeforeCutover_JulianLeap() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long instant = chrono.getDateTimeMillis(1500, 1, 1, 0); // Julian leap year
        assertTrue(year.isLeap(instant));
    }

    @Test
    public void testIsLeap_BeforeCutover_JulianNonLeap() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long instant = chrono.getDateTimeMillis(1501, 1, 1, 0); // Julian non-leap year
        assertFalse(year.isLeap(instant));
    }

    @Test
    public void testIsLeap_AfterCutover_GregorianLeap() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long instant = chrono.getDateTimeMillis(1600, 1, 1, 0); // Gregorian leap year
        assertTrue(year.isLeap(instant));
    }

    @Test
    public void testIsLeap_AfterCutover_GregorianNonLeap() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long instant = chrono.getDateTimeMillis(1501, 1, 1, 0); // Gregorian non-leap year
        assertFalse(year.isLeap(instant));
    }

    @Test
    public void testIsLeap_AroundCutover_1582() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long instantBefore = chrono.getDateTimeMillis(1582, 2, 15, 0); // Feb 15, 1582 (Julian leap)
        assertTrue(year.isLeap(instantBefore));

        long instantAfter = chrono.getDateTimeMillis(1582, 11, 15, 0); // Nov 15, 1582 (Gregorian non-leap)
        assertFalse(year.isLeap(instantAfter));
    }

    @Test
    public void testGetMaximumValue_DayOfMonth_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1500, 2, 1, 0); // Feb in Julian leap year
        assertEquals(29, dayOfMonth.getMaximumValue(instant));
    }

    @Test
    public void testGetMaximumValue_DayOfMonth_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1600, 2, 1, 0); // Feb in Gregorian leap year
        assertEquals(29, dayOfMonth.getMaximumValue(instant));
    }

    @Test
    public void testGetMaximumValue_DayOfMonth_NonLeapYear() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1501, 2, 1, 0); // Feb in Julian non-leap year
        assertEquals(28, dayOfMonth.getMaximumValue(instant));
    }
    
    @Test
    public void testGetMaximumValue_DayOfMonth_GregorianNonLeapCentury() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1700, 2, 1, 0); // Feb in Gregorian non-leap century year
        assertEquals(28, dayOfMonth.getMaximumValue(instant));
    }

    @Test
    public void testGetMaximumValue_DayOfMonth_GregorianLeapCentury() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(2000, 2, 1, 0); // Feb in Gregorian leap century year
        assertEquals(29, dayOfMonth.getMaximumValue(instant));
    }

    @Test
    public void testRoundFloor_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfYear = getField(chrono, DateTimeFieldType.dayOfYear());
        long instant = chrono.getDateTimeMillis(1500, 1, 1, 12 * 60 * 60 * 1000); // Jan 1, 1500 12:00:00.000
        long expected = chrono.getDateTimeMillis(1500, 1, 1, 0); // Start of the day
        assertEquals(expected, dayOfYear.roundFloor(instant));
    }

    @Test
    public void testRoundCeiling_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField hourOfDay = getField(chrono, DateTimeFieldType.hourOfDay());
        long instant = chrono.getDateTimeMillis(1600, 1, 1, 10 * 60 * 60 * 1000 + 30 * 60 * 1000); // Jan 1, 1600 10:30:00.000
        long expected = chrono.getDateTimeMillis(1600, 1, 1, 11 * 60 * 60 * 1000); // Start of the next hour
        assertEquals(expected, hourOfDay.roundCeiling(instant));
    }
    
    @Test
    public void testGetDifference_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant1 = chrono.getDateTimeMillis(1500, 1, 5, 0);
        long instant2 = chrono.getDateTimeMillis(1500, 1, 10, 0);
        assertEquals(5, dayOfMonth.getDifference(instant2, instant1));
    }

    @Test
    public void testGetDifference_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant1 = chrono.getDateTimeMillis(1600, 1, 5, 0);
        long instant2 = chrono.getDateTimeMillis(1600, 1, 10, 0);
        assertEquals(5, dayOfMonth.getDifference(instant2, instant1));
    }

    @Test
    public void testGetDifferenceAsLong_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long instant1 = chrono.getDateTimeMillis(1500, 1, 1, 0);
        long instant2 = chrono.getDateTimeMillis(1510, 1, 1, 0);
        assertEquals(10L, year.getDifferenceAsLong(instant2, instant1));
    }

    @Test
    public void testGetDifferenceAsLong_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long instant1 = chrono.getDateTimeMillis(1600, 1, 1, 0);
        long instant2 = chrono.getDateTimeMillis(1610, 1, 1, 0);
        assertEquals(10L, year.getDifferenceAsLong(instant2, instant1));
    }

    @Test
    public void testToStringWithCustomCutoverAndMinDays() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Instant cutover = new Instant(1000000000000L); // A specific cutover instant
        int minDays = 4; // Default
        GJChronology chrono = GJChronology.getInstance(zone, cutover, minDays);
        String cutoverStr;
        if (chrono.withUTC().dayOfYear().remainder(cutover.getMillis()) == 0) {
            cutoverStr = ISODateTimeFormat.date().print(cutover.getMillis());
        } else {
            cutoverStr = ISODateTimeFormat.dateTime().print(cutover.getMillis());
        }
        assertEquals("GJChronology[America/New_York,cutover=" + cutoverStr + ",mdfw=4]", chrono.toString());
    }

    @Test
    public void testCutoverFieldSet_CrossesGap_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC(); // default cutover is Oct 15, 1582
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long initialInstant = chrono.getDateTimeMillis(1582, 1, 1, 0);
        try {
            long setInstant = year.set(initialInstant, 1582);
            assertEquals(initialInstant, setInstant);
        } catch (IllegalFieldValueException e) {
            fail("Should not throw IllegalFieldValueException for setting year within a valid range");
        }
    }

    @Test
    public void testCutoverFieldSet_CrossesGap_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC(); // default cutover is Oct 15, 1582
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        long initialInstant = chrono.getDateTimeMillis(1582, 1, 1, 0); // Jan 1, 1582 (Julian)
        long expectedInstant = chrono.getDateTimeMillis(1583, 1, 1, 0); // Jan 1, 1583 (Gregorian)
        long setInstant = year.set(initialInstant, 1583);
        assertEquals(expectedInstant, setInstant);
    }

    @Test
    public void testCutoverFieldSet_WithImpreciseField() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField monthOfYear = getField(chrono, DateTimeFieldType.monthOfYear());
        long instantJulian = chrono.getDateTimeMillis(1582, 3, 1, 0); // March 1, 1582
        long newInstant = monthOfYear.set(instantJulian, 10);
        long expectedJulian = chrono.getDateTimeMillis(1582, 10, 1, 0); // Oct 1, 1582 (Julian)
        assertEquals(expectedJulian, newInstant);

        long instantGregorian = chrono.getDateTimeMillis(1582, 10, 15, 0); // Oct 15, 1582 (Gregorian)
        newInstant = monthOfYear.set(instantGregorian, 11); // Set to November
        long expectedGregorian = chrono.getDateTimeMillis(1582, 11, 15, 0); // Nov 15, 1582 (Gregorian)
        assertEquals(expectedGregorian, newInstant);
    }

    @Test
    public void testGetMaximumValue_MonthOfYear_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField monthOfYear = getField(chrono, DateTimeFieldType.monthOfYear());
        long instant = chrono.getDateTimeMillis(1582, 5, 15, 0); // May 15, 1582
        assertEquals(12, monthOfYear.getMaximumValue(instant));
    }

    @Test
    public void testGetMaximumValue_MonthOfYear_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField monthOfYear = getField(chrono, DateTimeFieldType.monthOfYear());
        long instant = chrono.getDateTimeMillis(1583, 5, 15, 0); // May 15, 1583
        assertEquals(12, monthOfYear.getMaximumValue(instant));
    }

    @Test
    public void testSet_DateCrossingGap() {
        GJChronology chrono = GJChronology.getInstanceUTC(); // Default cutover: Oct 15, 1582
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());

        long startInstant = chrono.getDateTimeMillis(1582, 10, 1, 0); // Oct 1, 1582 (Julian)
        long expectedInstant = chrono.getDateTimeMillis(1582, 10, 10, 0); // Oct 10, 1582 (Julian)
        long setInstant = dayOfMonth.set(startInstant, 10);
        assertEquals(expectedInstant, setInstant);

        startInstant = chrono.getDateTimeMillis(1582, 10, 1, 0); // Oct 1, 1582 (Julian)
        expectedInstant = chrono.getDateTimeMillis(1582, 10, 15, 0); // Oct 15, 1582 (Gregorian)
        setInstant = dayOfMonth.set(startInstant, 15);
        assertEquals(expectedInstant, setInstant);
    }

    @Test
    public void testGet_CutoverField_Gregorian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1582, 10, 16, 0); // Oct 16, 1582
        assertEquals(16, dayOfMonth.get(instant));
    }

    @Test
    public void testGet_CutoverField_Julian() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1582, 10, 4, 0); // Oct 4, 1582
        assertEquals(4, dayOfMonth.get(instant));
    }

    @Test
    public void testEquals() {
        GJChronology chrono1 = GJChronology.getInstanceUTC();
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC);
        assertEquals(chrono1, chrono2);

        GJChronology chrono3 = GJChronology.getInstance(DateTimeZone.getDefault());
        assertNotEquals(chrono1, chrono3);
    }

    @Test
    public void testHashCode() {
        GJChronology chrono1 = GJChronology.getInstanceUTC();
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC);
        assertEquals(chrono1.hashCode(), chrono2.hashCode());

        GJChronology chrono3 = GJChronology.getInstance(DateTimeZone.getDefault());
        assertNotEquals(chrono1.hashCode(), chrono3.hashCode());
    }

    @Test
    public void testGetAsText_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1500, 1, 15, 0); // Jan 15, 1500
        assertEquals("15", dayOfMonth.getAsText(instant, Locale.ENGLISH));
    }

    @Test
    public void testGetAsText_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        long instant = chrono.getDateTimeMillis(1600, 1, 15, 0); // Jan 15, 1600
        assertEquals("15", dayOfMonth.getAsText(instant, Locale.ENGLISH));
    }
    
    @Test
    public void testGetAsShortText_BeforeCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField monthOfYear = getField(chrono, DateTimeFieldType.monthOfYear());
        long instant = chrono.getDateTimeMillis(1500, 3, 1, 0); // March 1, 1500
        assertEquals("Mar", monthOfYear.getAsShortText(instant, Locale.ENGLISH));
    }

    @Test
    public void testGetAsShortText_AfterCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField monthOfYear = getField(chrono, DateTimeFieldType.monthOfYear());
        long instant = chrono.getDateTimeMillis(1600, 3, 1, 0); // March 1, 1600
        assertEquals("Mar", monthOfYear.getAsShortText(instant, Locale.ENGLISH));
    }

    @Test
    public void testGetDifferenceAsLong_CrossingCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        // Before cutover
        long instant1 = chrono.getDateTimeMillis(1582, 1, 1, 0);
        // After cutover
        long instant2 = chrono.getDateTimeMillis(1583, 1, 1, 0);
        assertEquals(1L, year.getDifferenceAsLong(instant2, instant1));
    }

    @Test
    public void testGetDifference_CrossingCutover() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        // Oct 4, 1582 (Julian)
        long instant1 = chrono.getDateTimeMillis(1582, 10, 4, 0);
        // Oct 15, 1582 (Gregorian)
        long instant2 = chrono.getDateTimeMillis(1582, 10, 15, 0);
        // The difference is 11 days (Oct 4 to Oct 15), which accounts for the gap
        assertEquals(11, dayOfMonth.getDifference(instant2, instant1));
    }

    @Test
    public void testGetLeapDurationField() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        // The leap duration field for year should be days.
        assertEquals(chrono.days(), year.getLeapDurationField());
    }

    @Test
    public void testGetMinimumValue_DayOfMonth() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        // Minimum value for day of month is always 1
        assertEquals(1, dayOfMonth.getMinimumValue());
    }
    
    @Test
    public void testGetMaximumValue_Year() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField year = getField(chrono, DateTimeFieldType.year());
        // Maximum value for year is not fixed, depends on the instant.
        // Test with a date before cutover
        long instantBefore = chrono.getDateTimeMillis(1500, 1, 1, 0);
        // Test with a date after cutover
        long instantAfter = chrono.getDateTimeMillis(1600, 1, 1, 0);
        // We cannot assert a specific value as it's unbounded or very large
        // But we can check that it doesn't throw an exception
        year.getMaximumValue(instantBefore);
        year.getMaximumValue(instantAfter);
    }

    @Test
    public void testGetMaximumTextLength_DayOfMonth() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        // Maximum text length for day of month is "31"
        assertEquals(2, dayOfMonth.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    public void testGetMaximumShortTextLength_MonthOfYear() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField monthOfYear = getField(chrono, DateTimeFieldType.monthOfYear());
        // Maximum short text length for month is "Dec" (or similar)
        assertTrue(monthOfYear.getMaximumShortTextLength(Locale.ENGLISH) >= 3);
    }

    @Test
    public void testSet_CutoverMillisecondAdjustment() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        DateTimeField dayOfMonth = getField(chrono, DateTimeFieldType.dayOfMonth());
        
        // Oct 14, 1582, 23:59:59.999 (Julian)
        long julianInstant = chrono.getDateTimeMillis(1582, 10, 14, 23, 59, 59, 999);
        
        // Set to the very beginning of Oct 15, 1582 Gregorian
        long setDayInstant = dayOfMonth.set(julianInstant, 15);
        
        // Expected: Oct 15, 1582 Gregorian
        long expectedGregorianInstant = chrono.getDateTimeMillis(1582, 10, 15, 0);
        assertEquals(expectedGregorianInstant, setDayInstant);

        // Let's try setting the day to 5, which should be Oct 5, 1582 Julian
        long setDayTo5Instant = dayOfMonth.set(julianInstant, 5);
        long expectedJulian5thInstant = chrono.getDateTimeMillis(1582, 10, 5, 0);
        assertEquals(expectedJulian5thInstant, setDayTo5Instant);
    }
}
