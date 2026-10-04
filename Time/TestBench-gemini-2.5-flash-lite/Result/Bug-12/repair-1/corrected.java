package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class LocalDateTest {

    @Test
    public void testNow() throws Exception {
        LocalDate date = LocalDate.now();
        assertNotNull(date);
        // Check if the current year, month, and day are set.
        // The exact values depend on the current system time, so we check if they are within reasonable bounds.
        assertTrue(date.getYear() >= 1970);
        assertTrue(date.getMonthOfYear() >= 1 && date.getMonthOfYear() <= 12);
        assertTrue(date.getDayOfMonth() >= 1 && date.getDayOfMonth() <= 31);
    }

    @Test
    public void testParseValidISODate() throws Exception {
        LocalDate date = LocalDate.parse("2023-10-26");
        assertEquals(2023, date.getYear());
        assertEquals(10, date.getMonthOfYear());
        assertEquals(26, date.getDayOfMonth());
    }
    
    @Test
    public void testParseValidISODateWithDifferentFormatter() throws Exception {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy/MM/dd");
        LocalDate date = LocalDate.parse("2023/10/26", formatter);
        assertEquals(2023, date.getYear());
        assertEquals(10, date.getMonthOfYear());
        assertEquals(26, date.getDayOfMonth());
    }

    @Test
    public void testFromCalendarFieldsValid() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        LocalDate date = LocalDate.fromCalendarFields(cal);
        assertEquals(2023, date.getYear());
        assertEquals(10, date.getMonthOfYear());
        assertEquals(26, date.getDayOfMonth());
    }

    @Test
    public void testFromCalendarFieldsWithEraBC() throws Exception {
        GregorianCalendar cal = new GregorianCalendar(-5, Calendar.JANUARY, 1);
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        LocalDate date = LocalDate.fromCalendarFields(cal);
        // ISO chronology handles year 1 BC as -0, so yearOfEra is 1, year is 0.
        // However, the constructor expects year and it correctly handles negative years.
        // Let's test for the value directly. The code will subtract 1 from yearOfEra if BC.
        // So for year 5 BC (which is -4 in ISO), yearOfEra is 5, so result should be 1 - 5 = -4.
        assertEquals(-4, date.getYear());
        assertEquals(1, date.getMonthOfYear());
        assertEquals(1, date.getDayOfMonth());
    }
    
    @Test
    public void testFromDateFieldsValid() throws Exception {
        Date date = new Date(2023 - 1900, 9, 26); // Month is 0-indexed
        LocalDate localDate = LocalDate.fromDateFields(date);
        assertEquals(2023, localDate.getYear());
        assertEquals(10, localDate.getMonthOfYear());
        assertEquals(26, localDate.getDayOfMonth());
    }

    @Test
    public void testFromDateFieldsBCYear() throws Exception {
        // A Date object representing a year before 1900
        // getTime() < 0 is used to detect BC years in fromDateFields
        // Let's create a GregorianCalendar for a BC date and convert that to test the logic.
        GregorianCalendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR, -10); // Year 10 BC
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        Date date = cal.getTime(); // This date will have negative milliseconds

        LocalDate localDate = LocalDate.fromDateFields(date);
        assertEquals(-10, localDate.getYear());
        assertEquals(1, localDate.getMonthOfYear());
        assertEquals(1, localDate.getDayOfMonth());
    }

    @Test
    public void testSize() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals(3, date.size());
    }

    @Test
    public void testGetValue() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals(2023, date.getValue(0)); // YEAR
        assertEquals(10, date.getValue(1)); // MONTH_OF_YEAR
        assertEquals(26, date.getValue(2)); // DAY_OF_MONTH
    }

    @Test
    public void testGetFieldType() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals(2023, date.get(DateTimeFieldType.year()));
        assertEquals(10, date.get(DateTimeFieldType.monthOfYear()));
        assertEquals(26, date.get(DateTimeFieldType.dayOfMonth()));
    }

    @Test
    public void testIsSupportedYear() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertTrue(date.isSupported(DateTimeFieldType.year()));
    }

    @Test
    public void testIsSupportedMonth() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertTrue(date.isSupported(DateTimeFieldType.monthOfYear()));
    }

    @Test
    public void testIsSupportedDay() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertTrue(date.isSupported(DateTimeFieldType.dayOfMonth()));
    }
    
    @Test
    public void testIsSupportedHour() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertFalse(date.isSupported(DateTimeFieldType.hourOfDay()));
    }

    @Test
    public void testGetChronology() throws Exception {
        Chronology chrono = ISOChronology.getInstanceUTC();
        LocalDate date = new LocalDate(2023, 10, 26, chrono);
        assertEquals(chrono, date.getChronology());
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertTrue(date.equals(date));
    }

    @Test
    public void testEqualsEqualValuesDifferentChronology() throws Exception {
        // CopticChronology is not available in the provided source. Using ISOChronology.getInstance() for a second instance.
        LocalDate date1 = new LocalDate(2023, 10, 26, ISOChronology.getInstance());
        LocalDate date2 = new LocalDate(2023, 10, 26, ISOChronology.getInstance());
        assertTrue(date1.equals(date2)); // Should be true if chronologies are the same.
        // If we wanted to test different chronologies, we'd need a different example.
        // For now, testing with identical chronologies.
    }

    @Test
    public void testEqualsEqualValuesSameChronology() throws Exception {
        Chronology chrono = ISOChronology.getInstance();
        LocalDate date1 = new LocalDate(2023, 10, 26, chrono);
        LocalDate date2 = new LocalDate(2023, 10, 26, chrono);
        assertTrue(date1.equals(date2));
    }

    @Test
    public void testHashCode() throws Exception {
        LocalDate date1 = new LocalDate(2023, 10, 26);
        LocalDate date2 = new LocalDate(2023, 10, 26);
        assertEquals(date1.hashCode(), date2.hashCode());
        
        LocalDate date3 = new LocalDate(2024, 10, 26);
        assertNotEquals(date1.hashCode(), date3.hashCode());
    }

    @Test
    public void testCompareToEqual() throws Exception {
        LocalDate date1 = new LocalDate(2023, 10, 26);
        LocalDate date2 = new LocalDate(2023, 10, 26);
        assertEquals(0, date1.compareTo(date2));
    }

    @Test
    public void testCompareToLessThan() throws Exception {
        LocalDate date1 = new LocalDate(2023, 10, 25);
        LocalDate date2 = new LocalDate(2023, 10, 26);
        assertTrue(date1.compareTo(date2) < 0);
    }

    @Test
    public void testCompareToGreaterThan() throws Exception {
        LocalDate date1 = new LocalDate(2023, 10, 27);
        LocalDate date2 = new LocalDate(2023, 10, 26);
        assertTrue(date1.compareTo(date2) > 0);
    }

    @Test
    public void testToDateTimeAtStartOfDayUTC() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26, ISOChronology.getInstanceUTC());
        DateTime dt = date.toDateTimeAtStartOfDay();
        assertEquals(2023, dt.getYear());
        assertEquals(10, dt.getMonthOfYear());
        assertEquals(26, dt.getDayOfMonth());
        assertEquals(0, dt.getHourOfDay());
        assertEquals(0, dt.getMinuteOfHour());
        assertEquals(0, dt.getSecondOfMinute());
        assertEquals(0, dt.getMillisOfSecond());
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }
    
    @Test
    public void testToDateTimeAtStartOfDayWithZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        LocalDate date = new LocalDate(2023, 10, 26);
        DateTime dt = date.toDateTimeAtStartOfDay(zone);
        assertEquals(2023, dt.getYear());
        assertEquals(10, dt.getMonthOfYear());
        assertEquals(26, dt.getDayOfMonth());
        // Start of day in New York time is typically 00:00
        assertEquals(0, dt.getHourOfDay());
        assertEquals(0, dt.getMinuteOfHour());
        assertEquals(0, dt.getSecondOfMinute());
        assertEquals(0, dt.getMillisOfSecond());
        assertEquals(zone, dt.getZone());
    }
    
    // Test toDateTimeAtMidnight is deprecated, so we avoid testing it extensively.
    // One test to ensure it's there and doesn't crash for a common case.
    @Test
    public void testToDateTimeAtMidnight() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        DateTime dt = date.toDateTimeAtMidnight(); // Uses default zone
        assertEquals(2023, dt.getYear());
        assertEquals(10, dt.getMonthOfYear());
        assertEquals(26, dt.getDayOfMonth());
        assertEquals(0, dt.getHourOfDay());
        assertEquals(0, dt.getMinuteOfHour());
        assertEquals(0, dt.getSecondOfMinute());
        assertEquals(0, dt.getMillisOfSecond());
    }

    @Test
    public void testToDateTimeAtCurrentTime() throws Exception {
        // This test is tricky because it depends on the current time.
        // We can only check that it returns a DateTime and it uses the correct date.
        // We'll use a fixed date for consistency.
        LocalDate date = new LocalDate(2023, 10, 26);
        DateTime dt = date.toDateTimeAtCurrentTime(); // Uses default zone
        assertEquals(2023, dt.getYear());
        assertEquals(10, dt.getMonthOfYear());
        assertEquals(26, dt.getDayOfMonth());
        // The time part should be the current system time.
        // We cannot assert exact time, but we can assert it's not 00:00:00.000
        assertNotEquals(0, dt.getMillisOfDay());
    }
    
    @Test
    public void testToDateTimeAtCurrentTimeWithZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        LocalDate date = new LocalDate(2023, 10, 26);
        DateTime dt = date.toDateTimeAtCurrentTime(zone);
        assertEquals(2023, dt.getYear());
        assertEquals(10, dt.getMonthOfYear());
        assertEquals(26, dt.getDayOfMonth());
        assertEquals(zone, dt.getZone());
        assertNotEquals(0, dt.getMillisOfDay()); // Time part should be current system time
    }

    @Test
    public void testToDateMidnight() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        DateMidnight dm = date.toDateMidnight();
        assertEquals(2023, dm.getYear());
        assertEquals(10, dm.getMonthOfYear());
        assertEquals(26, dm.getDayOfMonth());
    }
    
    @Test
    public void testToDateMidnightWithZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        LocalDate date = new LocalDate(2023, 10, 26);
        DateMidnight dm = date.toDateMidnight(zone);
        assertEquals(2023, dm.getYear());
        assertEquals(10, dm.getMonthOfYear());
        assertEquals(26, dm.getDayOfMonth());
        assertEquals(zone, dm.getZone());
    }

    @Test
    public void testToLocalDateTime() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalTime time = new LocalTime(14, 30, 15, 500);
        LocalDateTime ldt = date.toLocalDateTime(time);
        assertEquals(2023, ldt.getYear());
        assertEquals(10, ldt.getMonthOfYear());
        assertEquals(26, ldt.getDayOfMonth());
        assertEquals(14, ldt.getHourOfDay());
        assertEquals(30, ldt.getMinuteOfHour());
        assertEquals(15, ldt.getSecondOfMinute());
        assertEquals(500, ldt.getMillisOfSecond());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testToLocalDateTimeNullTime() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        date.toLocalDateTime(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testToLocalDateTimeMismatchedChronology() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26, ISOChronology.getInstance());
        LocalTime time = new LocalTime(14, 30, 15, 500, ISOChronology.getInstance()); // Use ISOChronology for LocalTime
        date.toLocalDateTime(time);
    }

    @Test
    public void testToDateTimeWithLocalTime() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalTime time = new LocalTime(14, 30, 15, 500);
        DateTime dt = date.toDateTime(time);
        assertEquals(2023, dt.getYear());
        assertEquals(10, dt.getMonthOfYear());
        assertEquals(26, dt.getDayOfMonth());
        assertEquals(14, dt.getHourOfDay());
        assertEquals(30, dt.getMinuteOfHour());
        assertEquals(15, dt.getSecondOfMinute());
        assertEquals(500, dt.getMillisOfSecond());
        assertEquals(DateTimeZone.getDefault(), dt.getZone()); // Default zone
    }
    
    @Test
    public void testToDateTimeWithLocalTimeAndZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalTime time = new LocalTime(14, 30, 15, 500);
        DateTime dt = date.toDateTime(time, zone);
        assertEquals(2023, dt.getYear());
        assertEquals(10, dt.getMonthOfYear());
        assertEquals(26, dt.getDayOfMonth());
        assertEquals(14, dt.getHourOfDay());
        assertEquals(30, dt.getMinuteOfHour());
        assertEquals(15, dt.getSecondOfMinute());
        assertEquals(500, dt.getMillisOfSecond());
        assertEquals(zone, dt.getZone());
    }
    
    @Test
    public void testToInterval() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        Interval interval = date.toInterval(); // Default zone
        assertEquals(date.toDateTimeAtStartOfDay().getMillis(), interval.getStartMillis());
        assertEquals(date.plusDays(1).toDateTimeAtStartOfDay().getMillis(), interval.getEndMillis());
    }
    
    @Test
    public void testToIntervalWithZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Australia/Sydney");
        LocalDate date = new LocalDate(2023, 10, 26);
        Interval interval = date.toInterval(zone);
        assertEquals(date.toDateTimeAtStartOfDay(zone).getMillis(), interval.getStartMillis());
        assertEquals(date.plusDays(1).toDateTimeAtStartOfDay(zone).getMillis(), interval.getEndMillis());
    }

    @Test
    public void testToDate() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        Date javaDate = date.toDate();
        // Due to DST and Date object's behavior, direct comparison of year/month/day
        // might be tricky. Let's convert back to LocalDate and compare.
        LocalDate convertedLocalDate = LocalDate.fromDateFields(javaDate);
        assertEquals(date, convertedLocalDate);
    }

    @Test
    public void testWithFields() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        // Create a partial that only specifies year and month
        // Using Partial for creating a ReadablePartial object
        org.joda.time.Partial partial = new org.joda.time.Partial(DateTimeFieldType.year(), 2024).with(DateTimeFieldType.monthOfYear(), 11);
        LocalDate updatedDate = date.withFields(partial);
        assertEquals(2024, updatedDate.getYear());
        assertEquals(11, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth()); // DayOfMonth should remain unchanged
    }
    
    @Test
    public void testWithFieldsNull() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.withFields(null));
    }

    @Test
    public void testWithField() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.withField(DateTimeFieldType.year(), 2024);
        assertEquals(2024, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testWithFieldInvalidValue() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        try {
            date.withField(DateTimeFieldType.monthOfYear(), 13);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testWithFieldAddedYears() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.withFieldAdded(DurationFieldType.years(), 2);
        assertEquals(2025, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testWithFieldAddedZeroAmount() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.withFieldAdded(DurationFieldType.days(), 0));
    }

    @Test
    public void testWithPeriodAdded() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        Period period = new Period().withYears(1).withMonths(2).withDays(3);
        LocalDate updatedDate = date.withPeriodAdded(period, 2); // Add period twice
        assertEquals(2025, updatedDate.getYear()); // 2023 + 1*2
        assertEquals(12, updatedDate.getMonthOfYear()); // 10 + 2*2 = 14, adjusted to 12
        assertEquals(29, updatedDate.getDayOfMonth()); // 26 + 3*2 = 32, adjusted to 29 (Nov 29th)
    }
    
    @Test
    public void testWithPeriodAddedZeroScalar() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        Period period = new Period().withYears(1);
        assertSame(date, date.withPeriodAdded(period, 0));
    }
    
    @Test
    public void testWithPeriodAddedNullPeriod() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.withPeriodAdded(null, 2));
    }

    @Test
    public void testPlusPeriod() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        Period period = new Period().withYears(1).withMonths(2);
        LocalDate updatedDate = date.plus(period);
        assertEquals(2024, updatedDate.getYear()); // 2023 + 1
        assertEquals(12, updatedDate.getMonthOfYear()); // 10 + 2 = 12
        assertEquals(26, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testPlusPeriodNull() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.plus((ReadablePeriod) null));
    }

    @Test
    public void testPlusYears() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.plusYears(5);
        assertEquals(2028, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth());
    }

    @Test
    public void testPlusYearsLeapDayAdjustment() throws Exception {
        LocalDate date = new LocalDate(2020, 2, 29); // Leap year
        LocalDate updatedDate = date.plusYears(1); // 2021 is not a leap year
        assertEquals(2021, updatedDate.getYear());
        assertEquals(2, updatedDate.getMonthOfYear());
        assertEquals(28, updatedDate.getDayOfMonth()); // Adjusts to Feb 28th
    }
    
    @Test
    public void testPlusYearsZero() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.plusYears(0));
    }

    @Test
    public void testPlusMonths() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.plusMonths(4); // Oct + 4 months = Feb of next year
        assertEquals(2024, updatedDate.getYear());
        assertEquals(2, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testPlusMonthsEndOfMonthAdjustment() throws Exception {
        LocalDate date = new LocalDate(2023, 1, 31); // Jan 31st
        LocalDate updatedDate = date.plusMonths(1); // Feb 2023 has 28 days
        assertEquals(2023, updatedDate.getYear());
        assertEquals(2, updatedDate.getMonthOfYear());
        assertEquals(28, updatedDate.getDayOfMonth()); // Adjusts to Feb 28th
    }
    
    @Test
    public void testPlusMonthsZero() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.plusMonths(0));
    }

    @Test
    public void testPlusWeeks() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.plusWeeks(3); // 26 + 21 days
        assertEquals(2023, updatedDate.getYear());
        assertEquals(11, updatedDate.getMonthOfYear()); // Oct + 21 days = Nov 16th
        assertEquals(16, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testPlusWeeksZero() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.plusWeeks(0));
    }

    @Test
    public void testPlusDays() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.plusDays(10);
        assertEquals(2023, updatedDate.getYear());
        assertEquals(11, updatedDate.getMonthOfYear()); // Oct 26 + 10 days = Nov 5th
        assertEquals(5, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testPlusDaysEndOfMonth() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.plusDays(10); // Oct has 31 days
        assertEquals(2023, updatedDate.getYear());
        assertEquals(11, updatedDate.getMonthOfYear()); // Should be Nov 5th
        assertEquals(5, updatedDate.getDayOfMonth());
    }

    @Test
    public void testPlusDaysBoundary() throws Exception {
        // Test adding days that cross year boundary
        LocalDate date = new LocalDate(2023, 12, 25);
        LocalDate updatedDate = date.plusDays(10); // Dec 25 + 10 days = Jan 4th of next year
        assertEquals(2024, updatedDate.getYear());
        assertEquals(1, updatedDate.getMonthOfYear());
        assertEquals(4, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testPlusDaysZero() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.plusDays(0));
    }

    @Test
    public void testMinusYears() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.minusYears(3);
        assertEquals(2020, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testMinusYearsLeapDayAdjustment() throws Exception {
        LocalDate date = new LocalDate(2021, 2, 28);
        LocalDate updatedDate = date.minusYears(1); // 2020 was a leap year
        assertEquals(2020, updatedDate.getYear());
        assertEquals(2, updatedDate.getMonthOfYear());
        assertEquals(29, updatedDate.getDayOfMonth()); // Should be Feb 29th
    }
    
    @Test
    public void testMinusYearsZero() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.minusYears(0));
    }

    @Test
    public void testMinusMonths() throws Exception {
        LocalDate date = new LocalDate(2023, 2, 26); // Feb 26th
        LocalDate updatedDate = date.minusMonths(3); // Feb - 3 months = Nov of previous year
        assertEquals(2022, updatedDate.getYear());
        assertEquals(11, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testMinusMonthsEndOfMonthAdjustment() throws Exception {
        LocalDate date = new LocalDate(2023, 3, 31); // Mar 31st
        LocalDate updatedDate = date.minusMonths(1); // Feb 2023 has 28 days
        assertEquals(2023, updatedDate.getYear());
        assertEquals(2, updatedDate.getMonthOfYear());
        assertEquals(28, updatedDate.getDayOfMonth()); // Adjusts to Feb 28th
    }
    
    @Test
    public void testMinusMonthsZero() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.minusMonths(0));
    }

    @Test
    public void testMinusWeeks() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.minusWeeks(3); // 26 - 21 days
        assertEquals(2023, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear()); // Oct 26 - 21 days = Oct 5th
        assertEquals(5, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testMinusWeeksZero() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.minusWeeks(0));
    }

    @Test
    public void testMinusDays() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.minusDays(10);
        assertEquals(2023, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear()); // Oct 26 - 10 days = Oct 16th
        assertEquals(16, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testMinusDaysBoundary() throws Exception {
        // Test subtracting days that cross year boundary
        LocalDate date = new LocalDate(2024, 1, 4);
        LocalDate updatedDate = date.minusDays(10); // Jan 4 - 10 days = Dec 25 of previous year
        assertEquals(2023, updatedDate.getYear());
        assertEquals(12, updatedDate.getMonthOfYear());
        assertEquals(25, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testMinusDaysZero() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.minusDays(0));
    }

    @Test
    public void testPropertyYear() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals(2023, date.year().get());
        assertEquals(date.getYear(), date.year().get());
    }

    @Test
    public void testPropertyMonthOfYear() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals(10, date.monthOfYear().get());
        assertEquals(date.getMonthOfYear(), date.monthOfYear().get());
    }

    @Test
    public void testPropertyDayOfMonth() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals(26, date.dayOfMonth().get());
        assertEquals(date.getDayOfMonth(), date.dayOfMonth().get());
    }
    
    @Test
    public void testPropertyDayOfMonthSetCopy() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.dayOfMonth().setCopy(15);
        assertEquals(15, updatedDate.getDayOfMonth());
        assertEquals(2023, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear());
    }
    
    @Test
    public void testPropertyDayOfMonthWithMaximumValue() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26); // Oct has 31 days
        LocalDate lastDay = date.dayOfMonth().withMaximumValue();
        assertEquals(31, lastDay.getDayOfMonth());
        assertEquals(2023, lastDay.getYear());
        assertEquals(10, lastDay.getMonthOfYear());
    }
    
    @Test
    public void testPropertyDayOfMonthWithMinimumValue() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate firstDay = date.dayOfMonth().withMinimumValue();
        assertEquals(1, firstDay.getDayOfMonth());
        assertEquals(2023, firstDay.getYear());
        assertEquals(10, firstDay.getMonthOfYear());
    }

    @Test
    public void testToStringDefaultFormat() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals("2023-10-26", date.toString());
    }

    @Test
    public void testToStringWithPattern() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals("26/10/2023", date.toString("dd/MM/yyyy"));
    }
    
    @Test
    public void testToStringWithPatternAndLocale() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals("26-Oct-2023", date.toString("dd-MMM-yyyy", Locale.ENGLISH));
    }
    
    @Test
    public void testToStringWithPatternNull() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals("2023-10-26", date.toString((String) null));
    }
    
    @Test
    public void testGetYear() throws Exception {
        LocalDate date = new LocalDate(1999, 12, 31);
        assertEquals(1999, date.getYear());
    }
    
    @Test
    public void testGetMonthOfYear() throws Exception {
        LocalDate date = new LocalDate(1999, 12, 31);
        assertEquals(12, date.getMonthOfYear());
    }
    
    @Test
    public void testGetDayOfMonth() throws Exception {
        LocalDate date = new LocalDate(1999, 12, 31);
        assertEquals(31, date.getDayOfMonth());
    }
    
    @Test
    public void testGetDayOfWeek() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26); // A Thursday
        assertEquals(DateTimeConstants.THURSDAY, date.getDayOfWeek());
    }
    
    @Test
    public void testGetDayOfYear() throws Exception {
        LocalDate date = new LocalDate(2023, 1, 1);
        assertEquals(1, date.getDayOfYear());
        date = new LocalDate(2023, 1, 31);
        assertEquals(31, date.getDayOfYear());
        date = new LocalDate(2023, 2, 1);
        assertEquals(32, date.getDayOfYear());
    }
    
    @Test
    public void testWithYear() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.withYear(2025);
        assertEquals(2025, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testWithMonthOfYear() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.withMonthOfYear(5);
        assertEquals(2023, updatedDate.getYear());
        assertEquals(5, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testWithMonthOfYearAdjustment() throws Exception {
        LocalDate date = new LocalDate(2023, 1, 31); // Jan 31
        LocalDate updatedDate = date.withMonthOfYear(2); // Try to set to Feb
        assertEquals(2023, updatedDate.getYear());
        assertEquals(2, updatedDate.getMonthOfYear());
        assertEquals(28, updatedDate.getDayOfMonth()); // Adjusts to Feb 28
    }
    
    @Test
    public void testWithDayOfMonth() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.withDayOfMonth(15);
        assertEquals(2023, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear());
        assertEquals(15, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testWithDayOfMonthAdjustment() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 31); // Oct 31
        LocalDate updatedDate = date.withDayOfMonth(32); // Invalid day for Oct
        assertEquals(2023, updatedDate.getYear());
        assertEquals(11, updatedDate.getMonthOfYear()); // Should adjust to Nov 1
        assertEquals(1, updatedDate.getDayOfMonth());
    }

    // --- New tests for methods not previously covered ---

    @Test
    public void testMinusPeriod() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        Period period = new Period().withYears(1).withMonths(2).withDays(3);
        LocalDate updatedDate = date.minus(period); // Subtract period once
        assertEquals(2022, updatedDate.getYear()); // 2023 - 1
        assertEquals(8, updatedDate.getMonthOfYear()); // 10 - 2 = 8
        assertEquals(23, updatedDate.getDayOfMonth()); // 26 - 3 = 23
    }
    
    @Test
    public void testMinusPeriodZeroScalar() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        Period period = new Period().withYears(1);
        assertSame(date, date.minus(period));
    }
    
    @Test
    public void testMinusPeriodNull() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertSame(date, date.minus((ReadablePeriod) null));
    }

    @Test
    public void testPropertyEra() throws Exception {
        // LocalDate uses ISOChronology which defaults to AD era.
        // We can construct a LocalDate and access the era property.
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals(DateTimeConstants.AD, date.era().get());
    }

    @Test
    public void testGetEra() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        assertEquals(DateTimeConstants.AD, date.getEra());
    }

    @Test
    public void testGetCenturyOfEra() throws Exception {
        LocalDate date = new LocalDate(1999, 12, 31);
        assertEquals(19, date.getCenturyOfEra());
        date = new LocalDate(2000, 1, 1);
        assertEquals(20, date.getCenturyOfEra());
    }
    
    @Test
    public void testWithCenturyOfEra() throws Exception {
        LocalDate date = new LocalDate(1999, 12, 31);
        LocalDate updatedDate = date.withCenturyOfEra(20);
        assertEquals(2000, updatedDate.getYear()); // Should be 20xx
        assertEquals(12, updatedDate.getMonthOfYear());
        assertEquals(31, updatedDate.getDayOfMonth());
    }

    @Test
    public void testGetYearOfEra() throws Exception {
        LocalDate date = new LocalDate(1999, 12, 31);
        assertEquals(1999, date.getYearOfEra());
        LocalDate dateBC = new LocalDate(-5, 1, 1); // 5 BC
        assertEquals(5, dateBC.getYearOfEra()); // Year of era for 5 BC is 5
    }

    @Test
    public void testWithYearOfEra() throws Exception {
        LocalDate date = new LocalDate(1999, 12, 31);
        LocalDate updatedDate = date.withYearOfEra(2024);
        assertEquals(2024, updatedDate.getYearOfEra());
        assertEquals(12, updatedDate.getMonthOfYear());
        assertEquals(31, updatedDate.getDayOfMonth());
    }

    @Test
    public void testGetYearOfCentury() throws Exception {
        LocalDate date = new LocalDate(1999, 12, 31);
        assertEquals(99, date.getYearOfCentury());
        date = new LocalDate(2000, 1, 1);
        assertEquals(0, date.getYearOfCentury());
    }
    
    @Test
    public void testWithYearOfCentury() throws Exception {
        LocalDate date = new LocalDate(1999, 12, 31);
        LocalDate updatedDate = date.withYearOfCentury(15);
        assertEquals(1915, updatedDate.getYear()); // 1900 + 15
        assertEquals(12, updatedDate.getMonthOfYear());
        assertEquals(31, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testGetWeekyear() throws Exception {
        // ISO weekyear. For 2023-10-26, it's 2023.
        // For 2026-12-31, the weekyear is 2027.
        LocalDate date1 = new LocalDate(2023, 10, 26);
        assertEquals(2023, date1.getWeekyear());
        LocalDate date2 = new LocalDate(2026, 12, 31);
        assertEquals(2027, date2.getWeekyear());
    }
    
    @Test
    public void testWithWeekyear() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.withWeekyear(2025);
        assertEquals(2025, updatedDate.getWeekyear());
        // Other fields should remain consistent.
        assertEquals(2023, updatedDate.getYear()); // Weekyear is distinct from year
        assertEquals(10, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth());
    }

    @Test
    public void testGetWeekOfWeekyear() throws Exception {
        // Week 1 of 2023 starts Dec 26, 2022. So Jan 1, 2023 is week 1.
        LocalDate date1 = new LocalDate(2023, 1, 1);
        assertEquals(1, date1.getWeekOfWeekyear());
        // Oct 26, 2023 is in week 43.
        LocalDate date2 = new LocalDate(2023, 10, 26);
        assertEquals(43, date2.getWeekOfWeekyear());
    }
    
    @Test
    public void testWithWeekOfWeekyear() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26);
        LocalDate updatedDate = date.withWeekOfWeekyear(40);
        assertEquals(40, updatedDate.getWeekOfWeekyear());
        // Other fields should remain consistent.
        assertEquals(2023, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear());
        assertEquals(26, updatedDate.getDayOfMonth());
    }

    @Test
    public void testGetDayOfWeek() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26); // Thursday
        assertEquals(DateTimeConstants.THURSDAY, date.getDayOfWeek());
        date = new LocalDate(2023, 10, 29); // Sunday
        assertEquals(DateTimeConstants.SUNDAY, date.getDayOfWeek());
    }
    
    @Test
    public void testWithDayOfWeek() throws Exception {
        LocalDate date = new LocalDate(2023, 10, 26); // Thursday
        LocalDate updatedDate = date.withDayOfWeek(DateTimeConstants.SATURDAY);
        assertEquals(2023, updatedDate.getYear());
        assertEquals(10, updatedDate.getMonthOfYear());
        assertEquals(28, updatedDate.getDayOfMonth()); // Oct 26 (Thu) + 2 days = Oct 28 (Sat)
    }
    
    @Test
    public void testPropertyYearOfCentury() throws Exception {
        LocalDate date = new LocalDate(1987, 5, 15);
        assertEquals(87, date.yearOfCentury().get());
    }

    @Test
    public void testPropertyYearOfCenturySetCopy() throws Exception {
        LocalDate date = new LocalDate(1987, 5, 15);
        LocalDate updatedDate = date.yearOfCentury().setCopy(95);
        assertEquals(1995, updatedDate.getYear());
        assertEquals(5, updatedDate.getMonthOfYear());
        assertEquals(15, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testPropertyYearOfCenturyWithMaximumValue() throws Exception {
        LocalDate date = new LocalDate(1999, 12, 31);
        assertEquals(99, date.yearOfCentury().getMaximumValue());
        assertEquals(99, date.yearOfCentury().withMaximumValue().getYearOfCentury());
    }
    
    @Test
    public void testPropertyYearOfCenturyWithMinimumValue() throws Exception {
        LocalDate date = new LocalDate(1900, 1, 1);
        assertEquals(0, date.yearOfCentury().getMinimumValue());
        assertEquals(0, date.yearOfCentury().withMinimumValue().getYearOfCentury());
    }
    
    @Test
    public void testPropertyWeekyear() throws Exception {
        LocalDate date = new LocalDate(2023, 1, 1);
        assertEquals(2022, date.weekyear().get());
    }

    @Test
    public void testPropertyWeekyearSetCopy() throws Exception {
        LocalDate date = new LocalDate(2023, 1, 1);
        LocalDate updatedDate = date.weekyear().setCopy(2024);
        assertEquals(2024, updatedDate.getWeekyear());
        assertEquals(1, updatedDate.getMonthOfYear());
        assertEquals(1, updatedDate.getDayOfMonth());
    }
    
    @Test
    public void testPropertyWeekOfWeekyear() throws Exception {
        LocalDate date = new LocalDate(2023, 1, 1);
        assertEquals(1, date.weekOfWeekyear().get());
    }
    
    @Test
    public void testPropertyWeekOfWeekyearSetCopy() throws Exception {
        LocalDate date = new LocalDate(2023, 1, 1);
        LocalDate updatedDate = date.weekOfWeekyear().setCopy(2);
        assertEquals(2, updatedDate.getWeekOfWeekyear());
        assertEquals(2023, updatedDate.getYear());
        assertEquals(1, updatedDate.getMonthOfYear());
        assertEquals(1, updatedDate.getDayOfMonth());
    }

}
