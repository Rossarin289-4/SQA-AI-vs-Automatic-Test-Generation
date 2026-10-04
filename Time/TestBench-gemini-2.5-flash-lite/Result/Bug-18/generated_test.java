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


    





    



}



