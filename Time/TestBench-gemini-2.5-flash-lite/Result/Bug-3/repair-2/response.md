```java
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
import org.joda.time.Duration; // Added import for Duration
import org.joda.time.Period; // Added import for Period
import org.joda.time.ReadableDuration; // Added import for ReadableDuration
import org.joda.time.ReadablePeriod; // Added import for ReadablePeriod


public class MutableDateTimeTest {

    @Test
    public void testNow() throws Exception {
        MutableDateTime now = MutableDateTime.now();
        assertNotNull(now);
        assertTrue(now.getMillis() > 0);
    }

    @Test
    public void testNowWithZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        MutableDateTime now = MutableDateTime.now(zone);
        assertNotNull(now);
        assertEquals(zone, now.getZone());
    }

    @Test
    public void testNowWithChronology() throws Exception {
        Chronology chrono = ISOChronology.getInstance(DateTimeZone.forID("America/New_York"));
        MutableDateTime now = MutableDateTime.now(chrono);
        assertNotNull(now);
        assertEquals(chrono, now.getChronology());
    }

    @Test
    public void testParseSimpleString() throws Exception {
        String isoString = "2023-10-27T10:15:30.123+01:00";
        MutableDateTime parsed = MutableDateTime.parse(isoString);
        assertNotNull(parsed);
        assertEquals(2023, parsed.getYear());
        assertEquals(10, parsed.getMonthOfYear());
        assertEquals(27, parsed.getDayOfMonth());
        assertEquals(10, parsed.getHourOfDay());
        assertEquals(15, parsed.getMinuteOfHour());
        assertEquals(30, parsed.getSecondOfMinute());
        assertEquals(123, parsed.getMillisOfSecond());
        assertEquals("+01:00", parsed.getZone().getID());
    }

    @Test
    public void testParseWithFormatter() throws Exception {
        String dateString = "27/10/2023";
        DateTimeFormatter formatter = ISODateTimeFormat.localDateParser();
        MutableDateTime parsed = MutableDateTime.parse(dateString, formatter);
        assertNotNull(parsed);
        assertEquals(2023, parsed.getYear());
        assertEquals(10, parsed.getMonthOfYear());
        assertEquals(27, parsed.getDayOfMonth());
        assertEquals(0, parsed.getHourOfDay());
        assertEquals(0, parsed.getMinuteOfHour());
        assertEquals(0, parsed.getSecondOfMinute());
        assertEquals(0, parsed.getMillisOfSecond());
    }

    @Test
    public void testDefaultConstructor() throws Exception {
        MutableDateTime mdt = new MutableDateTime();
        assertNotNull(mdt);
        assertTrue(Math.abs(System.currentTimeMillis() - mdt.getMillis()) < 1000);
    }

    @Test
    public void testConstructorWithMillis() throws Exception {
        long instant = 1698379530123L; // October 27, 2023 10:05:30.123 AM GMT
        MutableDateTime mdt = new MutableDateTime(instant);
        assertEquals(instant, mdt.getMillis());
        assertEquals(ISOChronology.getInstanceUTC(), mdt.getChronology());
    }

    @Test
    public void testConstructorWithMillisAndZone() throws Exception {
        long instant = 1698379530123L; // October 27, 2023 10:05:30.123 AM GMT
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        MutableDateTime mdt = new MutableDateTime(instant, zone);
        assertEquals(instant, mdt.getMillis());
        assertEquals(zone, mdt.getChronology().getZone());
    }

    @Test
    public void testConstructorWithMillisAndChronology() throws Exception {
        long instant = 1698379530123L; // October 27, 2023 10:05:30.123 AM GMT
        Chronology chrono = ISOChronology.getInstance(DateTimeZone.forID("Asia/Tokyo"));
        MutableDateTime mdt = new MutableDateTime(instant, chrono);
        assertEquals(instant, mdt.getMillis());
        assertEquals(chrono, mdt.getChronology());
    }

    @Test
    public void testConstructorWithObject() throws Exception {
        String dateString = "2005-01-01T12:00:00.000Z";
        MutableDateTime mdt = new MutableDateTime(dateString);
        assertEquals(1104614400000L, mdt.getMillis());
        assertEquals(ISOChronology.getInstanceUTC(), mdt.getChronology());
    }

    @Test
    public void testConstructorWithObjectAndZone() throws Exception {
        String dateString = "2005-01-01T12:00:00.000Z";
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        MutableDateTime mdt = new MutableDateTime(dateString, zone);
        assertEquals(1104614400000L, mdt.getMillis()); // UTC millis
        assertEquals(zone, mdt.getChronology().getZone());
    }

    @Test
    public void testConstructorWithObjectAndChronology() throws Exception {
        String dateString = "2005-01-01T12:00:00.000Z";
        Chronology chrono = ISOChronology.getInstance(DateTimeZone.forID("Asia/Kolkata"));
        MutableDateTime mdt = new MutableDateTime(dateString, chrono);
        assertEquals(1104614400000L, mdt.getMillis()); // UTC millis
        assertEquals(chrono, mdt.getChronology());
    }

    @Test
    public void testConstructorWithFields() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        assertEquals(ISOChronology.getInstanceUTC(), mdt.getChronology());
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay());
        assertEquals(30, mdt.getMinuteOfHour());
        assertEquals(15, mdt.getSecondOfMinute());
        assertEquals(500, mdt.getMillisOfSecond());
    }

    @Test
    public void testConstructorWithFieldsAndZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/Chicago");
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500, zone);
        assertEquals(zone, mdt.getChronology().getZone());
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay());
        assertEquals(30, mdt.getMinuteOfHour());
        assertEquals(15, mdt.getSecondOfMinute());
        assertEquals(500, mdt.getMillisOfSecond());
    }

    @Test
    public void testConstructorWithFieldsAndChronology() throws Exception {
        Chronology chrono = ISOChronology.getInstance(DateTimeZone.forID("Australia/Sydney"));
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500, chrono);
        assertEquals(chrono, mdt.getChronology());
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay());
        assertEquals(30, mdt.getMinuteOfHour());
        assertEquals(15, mdt.getSecondOfMinute());
        assertEquals(500, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetMillis() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000);
        long newMillis = 2000;
        mdt.setMillis(newMillis);
        assertEquals(newMillis, mdt.getMillis());
    }

    @Test
    public void testSetMillisWithRoundingNone() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000);
        DateTimeField roundField = ISOChronology.getInstanceUTC().minuteOfHour();
        mdt.setRounding(roundField, MutableDateTime.ROUND_NONE);
        long originalMillis = mdt.getMillis();
        long newMillis = originalMillis + 12345; // Add some seconds and millis
        mdt.setMillis(newMillis);
        assertEquals(newMillis, mdt.getMillis()); // No rounding should occur
    }

    @Test
    public void testSetMillisWithRoundingFloor() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1698380100000L); // 2023-10-27T10:15:00.000Z
        DateTimeField roundField = ISOChronology.getInstanceUTC().minuteOfHour();
        mdt.setRounding(roundField, MutableDateTime.ROUND_FLOOR);
        long newMillis = 1698380130500L; // 2023-10-27T10:15:30.500Z
        mdt.setMillis(newMillis);
        assertEquals(1698380100000L, mdt.getMillis()); // Should round down to the minute
    }

    @Test
    public void testSetMillisWithRoundingCeiling() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1698380100000L); // 2023-10-27T10:15:00.000Z
        DateTimeField roundField = ISOChronology.getInstanceUTC().minuteOfHour();
        mdt.setRounding(roundField, MutableDateTime.ROUND_CEILING);
        long newMillis = 1698380130500L; // 2023-10-27T10:15:30.500Z
        mdt.setMillis(newMillis);
        assertEquals(1698380700000L, mdt.getMillis()); // Should round up to the next minute (10:16:00)
    }

    @Test
    public void testSetMillisWithRoundingHalfFloor() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1698380100000L); // 2023-10-27T10:15:00.000Z
        DateTimeField roundField = ISOChronology.getInstanceUTC().minuteOfHour();
        mdt.setRounding(roundField, MutableDateTime.ROUND_HALF_FLOOR);
        long newMillisHalf = 1698380130000L; // 2023-10-27T10:15:30.000Z
        mdt.setMillis(newMillisHalf);
        assertEquals(1698380100000L, mdt.getMillis()); // Halfway favors floor
        long newMillisOverHalf = 1698380130500L; // 2023-10-27T10:15:30.500Z
        mdt.setMillis(newMillisOverHalf);
        assertEquals(1698380700000L, mdt.getMillis()); // Over halfway rounds up (to 10:16:00)
    }

    @Test
    public void testSetMillisWithRoundingHalfCeiling() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1698380100000L); // 2023-10-27T10:15:00.000Z
        DateTimeField roundField = ISOChronology.getInstanceUTC().minuteOfHour();
        mdt.setRounding(roundField, MutableDateTime.ROUND_HALF_CEILING);
        long newMillisHalf = 1698380130000L; // 2023-10-27T10:15:30.000Z
        mdt.setMillis(newMillisHalf);
        assertEquals(1698380700000L, mdt.getMillis()); // Halfway favors ceiling
        long newMillisUnderHalf = 1698380129500L; // 2023-10-27T10:15:29.500Z
        mdt.setMillis(newMillisUnderHalf);
        assertEquals(1698380100000L, mdt.getMillis()); // Under halfway rounds down (to 10:15:00)
    }

    @Test
    public void testSetMillisWithRoundingHalfEven() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1698380100000L); // 2023-10-27T10:15:00.000Z
        DateTimeField roundField = ISOChronology.getInstanceUTC().minuteOfHour();
        mdt.setRounding(roundField, MutableDateTime.ROUND_HALF_EVEN);
        long newMillisHalfEven = 1698380130000L; // 2023-10-27T10:15:30.000Z
        mdt.setMillis(newMillisHalfEven);
        assertEquals(1698380100000L, mdt.getMillis()); // Halfway to even minute (10:15:00)
        long newMillisHalfOdd = 1698380730000L; // 2023-10-27T10:16:30.000Z
        mdt.setMillis(newMillisHalfOdd);
        assertEquals(1698381000000L, mdt.getMillis()); // Halfway to odd minute (10:17:00)
        long newMillisOverHalf = 1698380130500L; // 2023-10-27T10:15:30.500Z
        mdt.setMillis(newMillisOverHalf);
        assertEquals(1698380700000L, mdt.getMillis()); // Over halfway rounds up (to 10:16:00)
    }

    @Test
    public void testAddMillis() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000);
        mdt.addMillis(500);
        assertEquals(1500, mdt.getMillis());
    }

    @Test
    public void testAddSeconds() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000); // 1 second is 1000 ms
        mdt.addSeconds(5);
        assertEquals(1000 + 5 * 1000, mdt.getMillis());
    }

    @Test
    public void testAddMinutes() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000); // 1 minute is 60 seconds * 1000 ms
        mdt.addMinutes(2);
        assertEquals(1000 + 2 * 60 * 1000, mdt.getMillis());
    }

    @Test
    public void testAddHours() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000); // 1 hour is 60 minutes * 60 seconds * 1000 ms
        mdt.addHours(3);
        assertEquals(1000 + 3 * 60 * 60 * 1000, mdt.getMillis());
    }

    @Test
    public void testAddDays() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000); // 1 day is 24 hours * 60 minutes * 60 seconds * 1000 ms
        mdt.addDays(1);
        assertEquals(1000 + 24 * 60 * 60 * 1000, mdt.getMillis());
    }

    @Test
    public void testAddWeeks() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000); // 1 week is 7 days
        mdt.addWeeks(1);
        assertEquals(1000 + 7 * 24 * 60 * 60 * 1000, mdt.getMillis());
    }

    @Test
    public void testAddMonths() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.addMonths(2); // Add two months
        assertEquals(2023, mdt.getYear());
        assertEquals(12, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
    }

    @Test
    public void testAddYears() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.addYears(5);
        assertEquals(2028, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
    }

    @Test
    public void testSetChronology() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1698379530123L); // Oct 27, 2023 10:05:30.123 GMT
        Chronology newChrono = ISOChronology.getInstance(DateTimeZone.forID("Europe/Berlin"));
        mdt.setChronology(newChrono);
        assertEquals(newChrono, mdt.getChronology());
        assertEquals(1698379530123L, mdt.getMillis()); // Millis should remain same initially
        assertEquals(11, mdt.getHourOfDay()); // Time should adjust to the new zone (CET is UTC+1)
        assertEquals(5, mdt.getMinuteOfHour());
        assertEquals(30, mdt.getSecondOfMinute());
        assertEquals(123, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetZone() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1698379530123L, DateTimeZone.forID("UTC")); // Oct 27, 2023 10:05:30.123 UTC
        DateTimeZone newZone = DateTimeZone.forID("America/Los_Angeles"); // PST is UTC-8
        mdt.setZone(newZone);
        assertEquals(newZone, mdt.getChronology().getZone());
        assertEquals(1698379530123L, mdt.getMillis()); // Millis should remain same
        assertEquals(2, mdt.getHourOfDay()); // 10:05:30 UTC becomes 02:05:30 PST
        assertEquals(5, mdt.getMinuteOfHour());
        assertEquals(30, mdt.getSecondOfMinute());
    }

    @Test
    public void testSetZoneRetainFields() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0, DateTimeZone.forID("UTC"));
        DateTimeZone newZone = DateTimeZone.forID("Europe/Paris"); // CET is UTC+1
        mdt.setZoneRetainFields(newZone);
        assertEquals(newZone, mdt.getChronology().getZone());
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(11, mdt.getHourOfDay()); // 10:30 UTC becomes 11:30 CET
        assertEquals(30, mdt.getMinuteOfHour());
    }

    @Test
    public void testSetField() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        DateTimeFieldType hourType = DateTimeFieldType.hourOfDay();
        mdt.set(hourType, 15);
        assertEquals(15, mdt.getHourOfDay());
    }

    @Test
    public void testSetYear() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setYear(2025);
        assertEquals(2025, mdt.getYear());
    }

    @Test
    public void testSetMonthOfYear() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setMonthOfYear(12);
        assertEquals(12, mdt.getMonthOfYear());
    }

    @Test
    public void testSetDayOfMonth() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setDayOfMonth(15);
        assertEquals(15, mdt.getDayOfMonth());
    }

    @Test
    public void testSetHourOfDay() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setHourOfDay(20);
        assertEquals(20, mdt.getHourOfDay());
    }

    @Test
    public void testSetMinuteOfHour() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setMinuteOfHour(45);
        assertEquals(45, mdt.getMinuteOfHour());
    }

    @Test
    public void testSetSecondOfMinute() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setSecondOfMinute(59);
        assertEquals(59, mdt.getSecondOfMinute());
    }

    @Test
    public void testSetMillisOfSecond() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setMillisOfSecond(999);
        assertEquals(999, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetDateFromMillis() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0); // Time is 10:30:00.000
        // Use a known instant for setting the date
        long newDateMillis = new DateTime(2024, 1, 1, 12, 0, 0, 0, ISOChronology.getInstanceUTC()).getMillis(); // Jan 1, 2024 12:00:00.000 UTC
        mdt.setDate(newDateMillis);
        assertEquals(2024, mdt.getYear());
        assertEquals(1, mdt.getMonthOfYear());
        assertEquals(1, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay()); // Time part should remain from original
        assertEquals(30, mdt.getMinuteOfHour());
        assertEquals(0, mdt.getSecondOfMinute());
        assertEquals(0, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetDateFromInstant() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0); // Time is 10:30:00.000
        ReadableInstant instant = new DateTime(2024, 1, 1, 12, 0, 0, 0, DateTimeZone.forID("Europe/London"));
        mdt.setDate(instant);
        assertEquals(2024, mdt.getYear());
        assertEquals(1, mdt.getMonthOfYear());
        assertEquals(1, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay()); // Time part should remain from original
        assertEquals(30, mdt.getMinuteOfHour());
    }

    @Test
    public void testSetDateFromFields() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0); // Time is 10:30:00.000
        mdt.setDate(2025, 5, 10);
        assertEquals(2025, mdt.getYear());
        assertEquals(5, mdt.getMonthOfYear());
        assertEquals(10, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay()); // Time part should remain from original
        assertEquals(30, mdt.getMinuteOfHour());
    }

    @Test
    public void testSetTimeFromMillis() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0); // Date is Oct 27, 2023
        long newTimeMillis = new DateTime(2000, 1, 1, 15, 45, 30, 750, DateTimeZone.UTC).getMillis(); // Time is 15:45:30.750 UTC
        mdt.setTime(newTimeMillis);
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(15, mdt.getHourOfDay());
        assertEquals(45, mdt.getMinuteOfHour());
        assertEquals(30, mdt.getSecondOfMinute());
        assertEquals(750, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetTimeFromInstant() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0); // Date is Oct 27, 2023
        ReadableInstant instant = new DateTime(2000, 1, 1, 15, 45, 30, 750, DateTimeZone.forID("America/Denver")); // Time is 15:45:30.750
        mdt.setTime(instant);
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(22, mdt.getHourOfDay()); // Denver is UTC-7. 15:45 Denver is 22:45 UTC.
        assertEquals(45, mdt.getMinuteOfHour());
        assertEquals(30, mdt.getSecondOfMinute());
        assertEquals(750, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetTimeFromFields() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0); // Date is Oct 27, 2023
        mdt.setTime(15, 45, 30, 750);
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(15, mdt.getHourOfDay());
        assertEquals(45, mdt.getMinuteOfHour());
        assertEquals(30, mdt.getSecondOfMinute());
        assertEquals(750, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetDateTime() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000); // Epoch start
        mdt.setDateTime(2023, 10, 27, 10, 30, 15, 500);
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay());
        assertEquals(30, mdt.getMinuteOfHour());
        assertEquals(15, mdt.getSecondOfMinute());
        assertEquals(500, mdt.getMillisOfSecond());
    }

    @Test
    public void testPropertyGet() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property yearProp = mdt.year();
        assertEquals(2023, yearProp.get());
    }

    @Test
    public void testPropertyAdd() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property yearProp = mdt.year();
        yearProp.add(5);
        assertEquals(2028, mdt.getYear());
    }

    @Test
    public void testPropertySet() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property monthProp = mdt.monthOfYear();
        monthProp.set(12);
        assertEquals(12, mdt.getMonthOfYear());
    }

    @Test
    public void testPropertyRoundFloor() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property secondProp = mdt.secondOfMinute();
        secondProp.roundFloor();
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay());
        assertEquals(30, mdt.getMinuteOfHour());
        assertEquals(15, mdt.getSecondOfMinute()); // Seconds should remain unchanged by roundFloor on seconds
        assertEquals(0, mdt.getMillisOfSecond()); // Millis should be zeroed
    }

    @Test
    public void testPropertyRoundCeiling() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property secondProp = mdt.secondOfMinute();
        secondProp.roundCeiling();
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay());
        assertEquals(30, mdt.getMinuteOfHour());
        assertEquals(15, mdt.getSecondOfMinute()); // Seconds should remain unchanged by roundCeiling on seconds
        assertEquals(0, mdt.getMillisOfSecond()); // Millis should be zeroed
    }

    @Test
    public void testCopy() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime copiedMdt = mdt.copy();
        assertNotNull(copiedMdt);
        assertEquals(mdt.getMillis(), copiedMdt.getMillis());
        assertNotSame(mdt, copiedMdt); // Ensure it's a different instance
    }

    @Test
    public void testClone() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime clonedMdt = (MutableDateTime) mdt.clone();
        assertNotNull(clonedMdt);
        assertEquals(mdt.getMillis(), clonedMdt.getMillis());
        assertNotSame(mdt, clonedMdt); // Ensure it's a different instance
    }

    @Test
    public void testToString() throws Exception {
        MutableDateTime mdtUtc = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500, DateTimeZone.UTC);
        assertEquals("2023-10-27T10:30:15.500Z", mdtUtc.toString());
    }

    @Test
    public void testSetRoundingWithNullField() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000);
        mdt.setRounding(null); // Disable rounding
        assertEquals(0, mdt.getRoundingMode());
        assertNull(mdt.getRoundingField());
        mdt.setMillis(2000);
        assertEquals(2000, mdt.getMillis()); // Setting should not be rounded
    }

    @Test
    public void testSetRoundingWithRoundNone() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000);
        DateTimeField roundField = ISOChronology.getInstanceUTC().minuteOfHour();
        mdt.setRounding(roundField, MutableDateTime.ROUND_NONE);
        assertEquals(MutableDateTime.ROUND_NONE, mdt.getRoundingMode());
        assertNull(mdt.getRoundingField()); // Should be null when mode is ROUND_NONE
        mdt.setMillis(2000);
        assertEquals(2000, mdt.getMillis()); // Setting should not be rounded
    }

    @Test
    public void testAddDuration() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000);
        ReadableDuration duration = new Duration(5000); // 5 seconds
        mdt.add(duration);
        assertEquals(6000, mdt.getMillis());
    }

    @Test
    public void testAddDurationScalar() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000);
        ReadableDuration duration = new Duration(2000); // 2 seconds
        mdt.add(duration, 3); // Add 3 * 2 seconds = 6 seconds
        assertEquals(7000, mdt.getMillis());
    }

    @Test
    public void testAddPeriod() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        ReadablePeriod period = new Period().withYears(1).withMonths(2).withDays(3);
        mdt.add(period);
        assertEquals(2024, mdt.getYear());
        assertEquals(12, mdt.getMonthOfYear());
        assertEquals(30, mdt.getDayOfMonth());
    }

    @Test
    public void testAddPeriodScalar() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        ReadablePeriod period = new Period().withHours(2);
        mdt.add(period, 5); // Add 5 * 2 hours = 10 hours
        assertEquals(20, mdt.getHourOfDay()); // Crosses day boundary
        assertEquals(28, mdt.getDayOfMonth());
    }

    @Test
    public void testSetWeekyear() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setWeekyear(2025);
        assertEquals(2025, mdt.getWeekyear());
    }

    @Test
    public void testAddWeekyears() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.addWeekyears(3);
        assertEquals(2026, mdt.getWeekyear());
    }

    @Test
    public void testSetWeekOfWeekyear() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setWeekOfWeekyear(5);
        assertEquals(5, mdt.getWeekOfWeekyear());
    }

    @Test
    public void testAddWeeksUnique() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.addWeeks(2);
        assertEquals(2023, mdt.getYear());
        assertEquals(11, mdt.getMonthOfYear()); // November
        assertEquals(10, mdt.getDayOfMonth()); // 27th + 14 days = Nov 10th
    }

    @Test
    public void testSetDayOfYear() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setDayOfYear(100); // 100th day of 2023
        assertEquals(2023, mdt.getYear());
        assertEquals(4, mdt.getMonthOfYear()); // April
        assertEquals(10, mdt.getDayOfMonth());
    }

    @Test
    public void testSetDayOfWeek() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0); // Friday
        mdt.setDayOfWeek(DateTimeConstants.MONDAY); // Set to Monday
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(23, mdt.getDayOfMonth()); // Oct 23rd was a Monday
    }

    @Test
    public void testPropertyHourOfDayGet() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 14, 30, 0, 0);
        assertEquals(14, mdt.hourOfDay().get());
    }

    @Test
    public void testPropertyMinuteOfDayGet() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 14, 30, 0, 0); // 14 * 60 + 30 = 870 minutes
        assertEquals(870, mdt.minuteOfDay().get());
    }

    @Test
    public void testPropertySecondOfDayGet() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 14, 30, 15, 0); // 14 * 3600 + 30 * 60 + 15 = 50400 + 1800 + 15 = 52215 seconds
        assertEquals(52215, mdt.secondOfDay().get());
    }

    @Test
    public void testPropertyMillisOfDayGet() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 14, 30, 15, 123); // 14*3600*1000 + 30*60*1000 + 15*1000 + 123 = 50400000 + 1800000 + 15000 + 123 = 52215123 ms
        assertEquals(52215123, mdt.millisOfDay().get());
    }

    @Test
    public void testPropertyMillisOfSecondGet() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 14, 30, 15, 123);
        assertEquals(123, mdt.millisOfSecond().get());
    }

    @Test
    public void testPropertyRoundHalfEven() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 30, 123); // Exactly 30 seconds
        MutableDateTime.Property secondProp = mdt.secondOfMinute();
        secondProp.roundHalfEven(); // Round to nearest second, favoring even
        assertEquals(30, mdt.getSecondOfMinute());
        assertEquals(0, mdt.getMillisOfSecond());

        // Test rounding up to an odd minute
        mdt.setDateTime(2023, 10, 27, 10, 31, 30, 123); // Exactly 30 seconds, but in minute 31 (odd)
        secondProp.roundHalfEven();
        assertEquals(32, mdt.getSecondOfMinute()); // Should round up to 32 seconds.
        assertEquals(0, mdt.getMillisOfSecond());
    }

    @Test
    public void testSetMinuteOfDay() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setMinuteOfDay(900); // 15 * 60 = 900 (so 15:00)
        assertEquals(15, mdt.getHourOfDay());
        assertEquals(0, mdt.getMinuteOfHour());
    }

    @Test
    public void testSetSecondOfDay() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setSecondOfDay(3661); // 1 hour, 1 minute, 1 second
        assertEquals(11, mdt.getHourOfDay());
        assertEquals(1, mdt.getMinuteOfHour());
        assertEquals(1, mdt.getSecondOfMinute());
    }

    @Test
    public void testSetMillisOfDay() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0);
        mdt.setMillisOfDay(3661123); // 1 hour, 1 minute, 1 second, 123 milliseconds
        assertEquals(11, mdt.getHourOfDay());
        assertEquals(1, mdt.getMinuteOfHour());
        assertEquals(1, mdt.getSecondOfMinute());
        assertEquals(123, mdt.getMillisOfSecond());
    }

    @Test
    public void testPropertySetWrapField() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property hourProp = mdt.hourOfDay();
        hourProp.addWrapField(15); // 10 + 15 = 25, which wraps around to 1
        assertEquals(1, mdt.getHourOfDay());
    }

    @Test
    public void testPropertyRoundHalfFloor() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property secondProp = mdt.secondOfMinute();
        secondProp.roundHalfFloor();
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay());
        assertEquals(30, mdt.getMinuteOfHour());
        assertEquals(16, mdt.getSecondOfMinute()); // Millis > 500, rounds up to 16
        assertEquals(0, mdt.getMillisOfSecond()); // Millis should be zeroed
    }

    @Test
    public void testPropertyRoundHalfCeiling() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property secondProp = mdt.secondOfMinute();
        secondProp.roundHalfCeiling();
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(27, mdt.getDayOfMonth());
        assertEquals(10, mdt.getHourOfDay());
        assertEquals(30, mdt.getMinuteOfHour());
        assertEquals(16, mdt.getSecondOfMinute()); // Millis > 500, rounds up to 16
        assertEquals(0, mdt.getMillisOfSecond()); // Millis should be zeroed
    }
    
    @Test
    public void testPropertySetText() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property monthProp = mdt.monthOfYear();
        monthProp.set("Dec", Locale.ENGLISH);
        assertEquals(12, mdt.getMonthOfYear());
    }

    @Test
    public void testPropertyGetAsText() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property monthProp = mdt.monthOfYear();
        assertEquals("October", monthProp.getAsText(Locale.ENGLISH));
    }

    @Test
    public void testPropertyGetAsShortText() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 15, 500);
        MutableDateTime.Property monthProp = mdt.monthOfYear();
        assertEquals("Oct", monthProp.getAsShortText(Locale.ENGLISH));
    }

    @Test
    public void testGetRoundingFieldAndMode() throws Exception {
        MutableDateTime mdt = new MutableDateTime();
        DateTimeField roundField = ISOChronology.getInstanceUTC().minuteOfHour();
        mdt.setRounding(roundField, MutableDateTime.ROUND_FLOOR);
        assertEquals(roundField, mdt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_FLOOR, mdt.getRoundingMode());
    }

    @Test
    public void testAddDurationNull() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000);
        mdt.add((ReadableDuration) null);
        assertEquals(1000, mdt.getMillis());
    }

    @Test
    public void testAddPeriodNull() throws Exception {
        MutableDateTime mdt = new MutableDateTime(1000);
        mdt.add((ReadablePeriod) null);
        assertEquals(1000, mdt.getMillis());
    }
    
    @Test
    public void testSetDayOfWeekEdgeCases() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 10, 27, 10, 30, 0, 0); // Friday
        
        // Set to the earliest possible day of week (Monday in ISO)
        mdt.setDayOfWeek(DateTimeConstants.MONDAY); 
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(23, mdt.getDayOfMonth()); // Oct 23rd was a Monday

        // Set to the latest possible day of week (Sunday in ISO)
        mdt.setDayOfWeek(DateTimeConstants.SUNDAY);
        assertEquals(2023, mdt.getYear());
        assertEquals(10, mdt.getMonthOfYear());
        assertEquals(29, mdt.getDayOfMonth()); // Oct 29th was a Sunday
    }

    @Test
    public void testAddWeeksBoundary() throws Exception {
        MutableDateTime mdt = new MutableDateTime(2023, 12, 25, 10, 30, 0, 0); // Monday, Dec 25, 2023
        mdt.addWeeks(2); // Should roll over to next year
        assertEquals(2024, mdt.getYear());
        assertEquals(1, mdt.getMonthOfYear());
        assertEquals(8, mdt.getDayOfMonth()); // Dec 25 + 14 days = Jan 8
    }
}
```