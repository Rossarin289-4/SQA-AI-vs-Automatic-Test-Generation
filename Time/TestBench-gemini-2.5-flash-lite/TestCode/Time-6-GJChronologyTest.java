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
    public void testGetInstanceUTC() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(DateTimeZone.UTC, chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstanceDefaultZone() throws Exception {
        GJChronology chrono = GJChronology.getInstance();
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstanceWithZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        GJChronology chrono = GJChronology.getInstance(zone);
        assertEquals(zone, chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstanceWithZoneAndCutover() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Instant cutover = new Instant(-12219292800000L - 86400000L); // One day before default
        GJChronology chrono = GJChronology.getInstance(zone, cutover, 4);
        assertEquals(zone, chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
        assertEquals(cutover, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstanceWithZoneAndCutoverMillis() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        long cutoverMillis = GJChronology.DEFAULT_CUTOVER.getMillis() - 86400000L; // One day before default
        GJChronology chrono = GJChronology.getInstance(zone, cutoverMillis, 4);
        assertEquals(zone, chrono.getZone());
        assertEquals(4, chrono.getMinimumDaysInFirstWeek());
        assertEquals(new Instant(cutoverMillis), chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstanceWithCustomMinDaysInFirstWeek() throws Exception {
        DateTimeZone zone = DateTimeZone.UTC;
        GJChronology chrono = GJChronology.getInstance(zone, GJChronology.DEFAULT_CUTOVER, 1);
        assertEquals(zone, chrono.getZone());
        assertEquals(1, chrono.getMinimumDaysInFirstWeek());
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetZone() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.forID("Europe/Paris"));
        assertEquals(DateTimeZone.forID("Europe/Paris"), chrono.getZone());
    }


    @Test
    public void testWithZone() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.forID("Europe/London"));
        DateTimeZone newZone = DateTimeZone.forID("America/New_York");
        GJChronology newChrono = (GJChronology) chrono.withZone(newZone);
        assertEquals(newZone, newChrono.getZone());
        assertEquals(chrono.getMinimumDaysInFirstWeek(), newChrono.getMinimumDaysInFirstWeek());
        assertEquals(chrono.getGregorianCutover(), newChrono.getGregorianCutover());
        assertNotSame(chrono, newChrono);
    }

    @Test
    public void testWithZoneAlreadySet() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.forID("Europe/London"));
        GJChronology sameChrono = (GJChronology) chrono.withZone(DateTimeZone.forID("Europe/London"));
        assertSame(chrono, sameChrono);
    }

    @Test
    public void testGetGregorianCutover() throws Exception {
        Instant cutover = new Instant(-12219292800000L + 86400000L); // One day after default
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover, 4);
        assertEquals(cutover, chrono.getGregorianCutover());
    }

    @Test
    public void testGetMinimumDaysInFirstWeek() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 7);
        assertEquals(7, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testEquals() throws Exception {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.forID("Europe/London"), GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.forID("Europe/London"), GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono3 = GJChronology.getInstance(DateTimeZone.forID("America/New_York"), GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono4 = GJChronology.getInstance(DateTimeZone.forID("Europe/London"), new Instant(GJChronology.DEFAULT_CUTOVER.getMillis() - 86400000L), 4);
        GJChronology chrono5 = GJChronology.getInstance(DateTimeZone.forID("Europe/London"), GJChronology.DEFAULT_CUTOVER, 5);

        assertEquals(chrono1, chrono2);
        assertNotEquals(chrono1, chrono3);
        assertNotEquals(chrono1, chrono4);
        assertNotEquals(chrono1, chrono5);
    }

    @Test
    public void testHashCode() throws Exception {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.forID("Europe/London"), GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.forID("Europe/London"), GJChronology.DEFAULT_CUTOVER, 4);
        assertEquals(chrono1.hashCode(), chrono2.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.forID("Europe/London"), GJChronology.DEFAULT_CUTOVER, 4);
        String str = chrono.toString();
        assertTrue(str.contains("GJChronology"));
        assertTrue(str.contains("Europe/London"));
        // The default cutover is not printed in toString
        assertFalse(str.contains("cutover="));
        assertTrue(str.contains("mdfw=4"));

        GJChronology defaultChrono = GJChronology.getInstanceUTC();
        String defaultStr = defaultChrono.toString();
        assertTrue(defaultStr.contains("GJChronology"));
        assertTrue(defaultStr.contains("UTC"));
        // Default cutover is not printed in toString if it matches
        assertFalse(defaultStr.contains("cutover="));
        assertFalse(defaultStr.contains("mdfw=4")); // Default mdfw is 4, so not printed.
    }
    
    @Test
    public void testGetDateTimeMillis_simple_gregorian() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(Long.MAX_VALUE), 4); // Cutover far in future
        assertEquals(123456789L, chrono.getDateTimeMillis(1970, 1, 1, 0, 0, 0, 123));
    }

    @Test
    public void testGetDateTimeMillis_simple_julian() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(Long.MIN_VALUE), 4); // Cutover far in past
        // The actual behavior for dates before the cutover is to use Julian calendar.
        // We need to construct the expected value based on Julian calendar.
        // For 1970-01-01 00:00:00.123 in Julian calendar:
        // This is a complex calculation, but the existing code structure implies
        // that if cutover is far in past, it should correctly use Julian.
        // Let's trust the underlying JulianChronology for this.
        JulianChronology julianChrono = JulianChronology.getInstance(DateTimeZone.UTC, 4);
        assertEquals(julianChrono.getDateTimeMillis(1970, 1, 1, 0, 0, 0, 123),
                     chrono.getDateTimeMillis(1970, 1, 1, 0, 0, 0, 123));
    }

    @Test
    public void testGetDateTimeMillis_cutover_boundary_gregorian() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        assertEquals(GJChronology.DEFAULT_CUTOVER.getMillis(), chrono.getDateTimeMillis(1582, 10, 15, 0, 0, 0, 0));
    }

    @Test
    public void testGetDateTimeMillis_cutover_boundary_julian() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        // Accessing iJulianChronology is not allowed. Instead, create a JulianChronology directly.
        JulianChronology julianChrono = JulianChronology.getInstance(DateTimeZone.UTC, 4);
        long julianMillis = julianChrono.getDateTimeMillis(1582, 10, 4, 23, 59, 59, 999);
        assertEquals(julianMillis, chrono.getDateTimeMillis(1582, 10, 4, 23, 59, 59, 999));
    }

    @Test
    public void testGetDateTimeMillis_gap_exception() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        try {
            chrono.getDateTimeMillis(1582, 10, 11, 0, 0, 0, 0); // This date does not exist in the transition
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }


    
    @Test
    public void testSet_gregorian_year() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(Long.MAX_VALUE), 4);
        long originalMillis = chrono.getDateTimeMillis(1970, 1, 1, 10, 30, 0, 0);
        long newMillis = chrono.year().set(originalMillis, 2000);
        assertEquals(chrono.getDateTimeMillis(2000, 1, 1, 10, 30, 0, 0), newMillis);
    }

    @Test
    public void testSet_julian_year() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(Long.MIN_VALUE), 4);
        long originalMillis = chrono.getDateTimeMillis(1970, 1, 1, 10, 30, 0, 0);
        long newMillis = chrono.year().set(originalMillis, 1500);
        assertEquals(chrono.getDateTimeMillis(1500, 1, 1, 10, 30, 0, 0), newMillis);
    }

    @Test
    public void testSet_cutover_year_gregorian() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        long originalMillis = chrono.getDateTimeMillis(1582, 10, 15, 10, 30, 0, 0);
        long newMillis = chrono.year().set(originalMillis, 1583);
        assertEquals(chrono.getDateTimeMillis(1583, 10, 15, 10, 30, 0, 0), newMillis);
    }

    @Test
    public void testSet_cutover_year_julian() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        long originalMillis = chrono.getDateTimeMillis(1582, 10, 4, 10, 30, 0, 0);
        long newMillis = chrono.year().set(originalMillis, 1581);
        assertEquals(chrono.getDateTimeMillis(1581, 10, 4, 10, 30, 0, 0), newMillis);
    }

    @Test
    public void testSet_cutover_year_transition() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        // Try setting to a year before cutover, but result lands after cutover
        long originalMillis = chrono.getDateTimeMillis(1582, 10, 15, 10, 30, 0, 0); // After cutover
        long newMillis = chrono.year().set(originalMillis, 1581); // Should become 1581-10-04
        assertEquals(chrono.getDateTimeMillis(1581, 10, 4, 10, 30, 0, 0), newMillis);

        // Try setting to a year after cutover, but result lands before cutover
        originalMillis = chrono.getDateTimeMillis(1580, 1, 1, 10, 30, 0, 0); // Before cutover
        newMillis = chrono.year().set(originalMillis, 1582); // Should become 1582-10-15
        assertEquals(chrono.getDateTimeMillis(1582, 10, 15, 10, 30, 0, 0), newMillis);
    }

    @Test
    public void testAdd_gregorian_days() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(Long.MAX_VALUE), 4);
        long originalMillis = chrono.getDateTimeMillis(2000, 1, 1, 12, 0, 0, 0);
        long newMillis = chrono.days().add(originalMillis, 10);
        assertEquals(chrono.getDateTimeMillis(2000, 1, 11, 12, 0, 0, 0), newMillis);
    }

    @Test
    public void testAdd_julian_days() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(Long.MIN_VALUE), 4);
        long originalMillis = chrono.getDateTimeMillis(1500, 1, 1, 12, 0, 0, 0);
        long newMillis = chrono.days().add(originalMillis, 10);
        assertEquals(chrono.getDateTimeMillis(1500, 1, 11, 12, 0, 0, 0), newMillis);
    }

    @Test
    public void testAdd_cutover_crossing_days() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        long originalMillis = chrono.getDateTimeMillis(1582, 10, 4, 23, 59, 59, 999); // Before cutover
        long newMillis = chrono.days().add(originalMillis, 11); // Should land on Oct 15th
        assertEquals(chrono.getDateTimeMillis(1582, 10, 15, 0, 0, 0, 0), newMillis);
    }

    @Test
    public void testAdd_cutover_crossing_days_reverse() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        long originalMillis = chrono.getDateTimeMillis(1582, 10, 15, 0, 0, 0, 0); // After cutover
        long newMillis = chrono.days().add(originalMillis, -11); // Should land on Oct 4th
        assertEquals(chrono.getDateTimeMillis(1582, 10, 4, 23, 59, 59, 999), newMillis);
    }

    @Test
    public void testGetDifference_gregorian_days() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(Long.MAX_VALUE), 4);
        long start = chrono.getDateTimeMillis(2000, 1, 1, 12, 0, 0, 0);
        long end = chrono.getDateTimeMillis(2000, 1, 11, 12, 0, 0, 0);
        assertEquals(10, chrono.days().getDifference(end, start));
    }

    @Test
    public void testGetDifference_julian_days() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(Long.MIN_VALUE), 4);
        long start = chrono.getDateTimeMillis(1500, 1, 1, 12, 0, 0, 0);
        long end = chrono.getDateTimeMillis(1500, 1, 11, 12, 0, 0, 0);
        assertEquals(10, chrono.days().getDifference(end, start));
    }

    @Test
    public void testGetDifference_cutover_crossing_days() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        long start = chrono.getDateTimeMillis(1582, 10, 4, 23, 59, 59, 999); // Before cutover
        long end = chrono.getDateTimeMillis(1582, 10, 15, 0, 0, 0, 0); // After cutover
        assertEquals(11, chrono.days().getDifference(end, start));
    }

    @Test
    public void testGetDifference_cutover_crossing_days_reverse() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        long start = chrono.getDateTimeMillis(1582, 10, 15, 0, 0, 0, 0); // After cutover
        long end = chrono.getDateTimeMillis(1582, 10, 4, 23, 59, 59, 999); // Before cutover
        assertEquals(-11, chrono.days().getDifference(end, start));
    }




    @Test
    public void testGetMinimumValue_year() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(Long.MIN_VALUE), 4);
        // The minimum year value for GJChronology is affected by the cutover.
        // The original test was likely asserting against a different chronology or an assumption.
        // For a chronology with a very early cutover, the minimum year should be based on Julian.
        // The minimum year for Julian is -292275055.
        assertEquals(-292275055, chrono.year().getMinimumValue());
    }

    @Test
    public void testGetMaximumValue_year() throws Exception {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, new Instant(Long.MAX_VALUE), 4);
        // The maximum year value for GJChronology is affected by the cutover.
        // The original test was likely asserting against a different chronology or an assumption.
        // For a chronology with a very late cutover, the maximum year should be based on Gregorian.
        // The maximum year for Gregorian is 292278993.
        assertEquals(292278993, chrono.year().getMaximumValue());
    }

    @Test
    public void testGetMaximumValue_year_cutover_edge() throws Exception {
        // Test where the cutover might affect the maximum value for a given date part
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        // Test year before cutover
        assertEquals(1582, chrono.year().getMaximumValue(chrono.getDateTimeMillis(1582, 10, 10, 0, 0, 0, 0)));
        // Test year after cutover
        assertEquals(292278993, chrono.year().getMaximumValue(chrono.getDateTimeMillis(1582, 10, 20, 0, 0, 0, 0)));
    }

    
    @Test
    public void testEquals_different_zones() throws Exception {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.forID("Europe/London"));
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.forID("America/New_York"));
        assertNotEquals(chrono1, chrono2);
    }

    @Test
    public void testEquals_different_cutovers() throws Exception {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, new Instant(GJChronology.DEFAULT_CUTOVER.getMillis() - 10000));
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, new Instant(GJChronology.DEFAULT_CUTOVER.getMillis() + 10000));
        assertNotEquals(chrono1, chrono2);
    }
    
    @Test
    public void testEquals_different_minDaysInFirstWeek() throws Exception {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 4);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER, 5);
        assertNotEquals(chrono1, chrono2);
    }


    @Test
    public void testGet_millisOfDay() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.millisOfDay().set(0, 12345);
        assertEquals(12345, chrono.millisOfDay().get(instant));
    }

    @Test
    public void testGetAsText_hourOfDay() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.hourOfDay().set(0, 14);
        assertEquals("14", chrono.hourOfDay().getAsText(instant, Locale.ENGLISH));
    }

    
    @Test
    public void testGetDifferenceAsLong_days() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long start = chrono.dayOfYear().set(0, 1);
        long end = chrono.dayOfYear().set(0, 10);
        assertEquals(9, chrono.days().getDifferenceAsLong(end, start));
    }

    @Test
    public void testGetLeapDurationField() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        // For GJ, the leap duration field is the same as year duration field
        assertEquals(chrono.years(), chrono.year().getLeapDurationField());
    }

    @Test
    public void testGetMaximumValue_dayOfMonth_leapYear() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.year().set(0, 2000); // Leap year
        assertEquals(31, chrono.dayOfMonth().getMaximumValue(instant));
    }

    @Test
    public void testGetMaximumValue_dayOfMonth_nonLeapYear() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.year().set(0, 2001); // Non-leap year
        assertEquals(31, chrono.dayOfMonth().getMaximumValue(instant));
    }
    
    @Test
    public void testAdd_yearOfEra() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.yearOfEra().set(0, 1);
        long addedInstant = chrono.yearOfEra().add(instant, 5);
        assertEquals(6, chrono.yearOfEra().get(addedInstant));
    }

    @Test
    public void testGetAsText_era() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.era().set(0, 0); // BC
        assertEquals("BC", chrono.era().getAsText(instant, Locale.ENGLISH));
        instant = chrono.era().set(0, 1); // AD
        assertEquals("AD", chrono.era().getAsText(instant, Locale.ENGLISH));
    }

    @Test
    public void testGetAsShortText_era() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.era().set(0, 0); // BC
        assertEquals("B", chrono.era().getAsShortText(instant, Locale.ENGLISH));
        instant = chrono.era().set(0, 1); // AD
        assertEquals("A", chrono.era().getAsShortText(instant, Locale.ENGLISH));
    }

    @Test
    public void testGet_dayOfYear() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.dayOfYear().set(0, 365);
        assertEquals(365, chrono.dayOfYear().get(instant));
    }
    
    @Test
    public void testSet_millisOfSecond() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        long instant = chrono.millisOfSecond().set(0, 500);
        assertEquals(500, chrono.millisOfSecond().get(instant));
    }
    
    @Test
    public void testGetMaximumValue_hourOfHalfday() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(11, chrono.hourOfHalfday().getMaximumValue());
    }
    
    @Test
    public void testGetMaximumValue_clockhourOfHalfday() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(12, chrono.clockhourOfHalfday().getMaximumValue());
    }

    @Test
    public void testGetMaximumValue_halfdayOfDay() throws Exception {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertEquals(1, chrono.halfdayOfDay().getMaximumValue());
    }
}
