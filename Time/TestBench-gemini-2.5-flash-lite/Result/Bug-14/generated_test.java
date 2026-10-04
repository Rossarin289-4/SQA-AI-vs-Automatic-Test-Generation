package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;
import org.joda.time.DurationFieldType; // Added import for DurationFieldType
import org.joda.time.Chronology; // Added import for Chronology
import org.joda.time.DateTimeZone; // Added import for DateTimeZone
import org.joda.time.MutableDateTime; // Added import for MutableDateTime
import org.joda.time.chrono.GregorianChronology; // Added import for GregorianChronology


public class BasicMonthOfYearDateTimeFieldTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Use a real BasicChronology (like GregorianChronology) for reliable tests
    private BasicChronology iChronology = GregorianChronology.getInstance();

    // Helper method to get the field instance
    private BasicMonthOfYearDateTimeField getTestField() {
        // The constructor requires a leapMonth parameter.
        // For GregorianChronology, the leap month logic is typically associated with February,
        // but the BasicMonthOfYearDateTimeField constructor takes the month that "leaps".
        // Let's assume it refers to the month that might be affected by leap year day additions.
        // For simplicity and based on common usage, let's use JANUARY as the leapMonth for the test field,
        // as the `isLeap` method checks against this `iLeapMonth`.
        // The actual leap year logic for days in month is handled by `iChronology.getDaysInYearMonth`.
        return new BasicMonthOfYearDateTimeField(iChronology, DateTimeConstants.JANUARY);
    }


    @Test
    public void testAdd_zeroMonths() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        long result = field.add(instant, 0);
        assertEquals(instant, result);
    }

    @Test
    public void testAdd_positiveMonths() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int monthsToAdd = 3; // Add 3 months
        long result = field.add(instant, monthsToAdd);
        // Expected: April 1, 2020 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 4, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_negativeMonths() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int monthsToAdd = -2; // Subtract 2 months
        long result = field.add(instant, monthsToAdd);
        // Expected: Nov 1, 2019 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2019, 11, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_yearBoundaryPositive() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 12, 15) + iChronology.getMillisOfDay(0); // Dec 15, 2020
        int monthsToAdd = 1;
        long result = field.add(instant, monthsToAdd);
        // Expected: Jan 15, 2021 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 1, 15) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_yearBoundaryNegative() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 1, 15) + iChronology.getMillisOfDay(0); // Jan 15, 2020
        int monthsToAdd = -1;
        long result = field.add(instant, monthsToAdd);
        // Expected: Dec 15, 2019 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2019, 12, 15) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_monthCoercion() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 7, 31) + iChronology.getMillisOfDay(0); // July 31, 2020
        int monthsToAdd = 1; // Add 1 month
        long result = field.add(instant, monthsToAdd);
        // Expected: Aug 31, 2020 00:00:00 GMT (August has 31 days)
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 8, 31) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_monthCoercionToShorterMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 3, 31) + iChronology.getMillisOfDay(0); // March 31, 2020
        int monthsToAdd = 1; // Add 1 month
        long result = field.add(instant, monthsToAdd);
        // Expected: April 30, 2020 00:00:00 GMT (April has 30 days)
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 4, 30) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_monthCoercionToFebruary() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 3, 31) + iChronology.getMillisOfDay(0); // March 31, 2020
        int monthsToAdd = -2; // Subtract 2 months
        long result = field.add(instant, monthsToAdd);
        // Expected: Feb 29, 2020 00:00:00 GMT (2020 is a leap year, Feb has 29 days)
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 2, 29) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_positive() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        long monthsToAdd = 13; // Add 13 months
        long result = field.add(instant, monthsToAdd);
        // Expected: Feb 1, 2021 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 2, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_negative() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        long monthsToAdd = -13; // Subtract 13 months
        long result = field.add(instant, monthsToAdd);
        // Expected: Oct 1, 2018 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2018, 10, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAddWrapField_positive() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int monthsToAdd = 15; // Add 15 months (wraps around 12)
        long result = field.addWrapField(instant, monthsToAdd);
        // Expected: Apr 1, 2020 00:00:00 GMT (15 months from Jan is Apr of next year)
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 4, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAddWrapField_negative() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int monthsToAdd = -14; // Subtract 14 months
        long result = field.addWrapField(instant, monthsToAdd);
        // Expected: Nov 1, 2018 00:00:00 GMT (14 months before Jan 2020 is Nov 2018)
        long expectedInstant = iChronology.getYearMonthDayMillis(2018, 11, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testGetDifferenceAsLong_sameMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant1 = iChronology.getYearMonthDayMillis(2020, 5, 10) + iChronology.getMillisOfDay(0);
        long instant2 = iChronology.getYearMonthDayMillis(2020, 5, 20) + iChronology.getMillisOfDay(0);
        // Difference in months between May and May is 0.
        assertEquals(0, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testGetDifferenceAsLong_differentMonths() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant1 = iChronology.getYearMonthDayMillis(2020, 5, 10) + iChronology.getMillisOfDay(0); // May 10, 2020
        long instant2 = iChronology.getYearMonthDayMillis(2020, 7, 20) + iChronology.getMillisOfDay(0); // July 20, 2020
        // Difference between May and July is 2 months.
        assertEquals(2, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testGetDifferenceAsLong_acrossYears() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant1 = iChronology.getYearMonthDayMillis(2019, 11, 10) + iChronology.getMillisOfDay(0); // Nov 10, 2019
        long instant2 = iChronology.getYearMonthDayMillis(2020, 2, 20) + iChronology.getMillisOfDay(0); // Feb 20, 2020
        // Nov 2019 to Feb 2020 is 3 months (Dec, Jan, Feb).
        assertEquals(3, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testGetDifferenceAsLong_negativeDifference() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant1 = iChronology.getYearMonthDayMillis(2020, 7, 20) + iChronology.getMillisOfDay(0); // July 20, 2020
        long instant2 = iChronology.getYearMonthDayMillis(2020, 5, 10) + iChronology.getMillisOfDay(0); // May 10, 2020
        // Difference between July and May is -2 months.
        assertEquals(-2, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testSet_basic() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int newMonth = 7; // Set to July
        long result = field.set(instant, newMonth);
        // Expected: July 1, 2020 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 7, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testSet_coerceDayToShorterMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 3, 31) + iChronology.getMillisOfDay(0); // March 31, 2020
        int newMonth = 4; // Set to April
        long result = field.set(instant, newMonth);
        // Expected: April 30, 2020 00:00:00 GMT (April has 30 days)
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 4, 30) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testSet_coerceDayToFebruaryLeap() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 3, 31) + iChronology.getMillisOfDay(0); // March 31, 2020
        int newMonth = 2; // Set to February
        long result = field.set(instant, newMonth);
        // Expected: Feb 29, 2020 00:00:00 GMT (2020 is a leap year)
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 2, 29) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }
    
    @Test
    public void testSet_coerceDayToFebruaryNonLeap() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2021, 3, 31) + iChronology.getMillisOfDay(0); // March 31, 2021
        int newMonth = 2; // Set to February
        long result = field.set(instant, newMonth);
        // Expected: Feb 28, 2021 00:00:00 GMT (2021 is not a leap year)
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 2, 28) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }


    @Test
    public void testSet_minimumValue() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int newMonth = DateTimeConstants.JANUARY; // Set to January (1)
        long result = field.set(instant, newMonth);
        // Expected: Jan 1, 2020 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 1, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testSet_maximumValue() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int newMonth = iChronology.getMaxMonth(); // Set to December (12)
        long result = field.set(instant, newMonth);
        // Expected: Dec 1, 2020 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 12, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testSet_invalidValueTooLow() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int newMonth = 0; // Invalid month
        try {
            field.set(instant, newMonth);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected exception
        }
    }

    @Test
    public void testSet_invalidValueTooHigh() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int newMonth = iChronology.getMaxMonth() + 1; // Invalid month
        try {
            field.set(instant, newMonth);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected exception
        }
    }

    @Test
    public void testGetRangeDurationField() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        DurationField rangeField = field.getRangeDurationField();
        assertNotNull(rangeField);
        // The range duration field for month of year is years.
        assertEquals(DurationFieldType.years(), rangeField.getType());
    }

    @Test
    public void testIsLeap_leapYearMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        // The `isLeap` method checks if the current year is a leap year AND the current month is the `iLeapMonth`.
        // In `BasicMonthOfYearDateTimeField` constructor, `iLeapMonth` is set to `leapMonth` passed in.
        // For `GregorianChronology.getInstance()`, the `monthOfYear()` field is typically created with `iLeapMonth = JANUARY`.
        // So, we test a date in January of a leap year.
        long instant = iChronology.getYearMonthDayMillis(2020, DateTimeConstants.JANUARY, 15); // January 15, 2020
        assertTrue(field.isLeap(instant)); // Assuming iLeapMonth is JANUARY
    }

    @Test
    public void testIsLeap_nonLeapYearMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        // Test a month that is not the iLeapMonth, even if it's a leap year.
        long instant = iChronology.getYearMonthDayMillis(2020, DateTimeConstants.FEBRUARY, 15); // February 15, 2020
        assertFalse(field.isLeap(instant)); // Assuming iLeapMonth is JANUARY
    }
    
    @Test
    public void testIsLeap_nonLeapYear() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        // Test a non-leap year.
        long instant = iChronology.getYearMonthDayMillis(2021, DateTimeConstants.JANUARY, 15); // January 15, 2021
        assertFalse(field.isLeap(instant)); // Year 2021 is not a leap year.
    }


    @Test
    public void testGetLeapAmount_leap() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        // Checks if the instant is a leap month. With iLeapMonth=JANUARY, this means checking if the month is January in a leap year.
        long instant = iChronology.getYearMonthDayMillis(2020, DateTimeConstants.JANUARY, 15); // January 15, 2020
        assertEquals(1, field.getLeapAmount(instant)); // Assuming iLeapMonth is JANUARY
    }

    @Test
    public void testGetLeapAmount_nonLeap() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        // Test a non-leap month in a leap year.
        long instant = iChronology.getYearMonthDayMillis(2020, DateTimeConstants.FEBRUARY, 15); // February 15, 2020
        assertEquals(0, field.getLeapAmount(instant));
    }

    @Test
    public void testGetLeapDurationField() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        DurationField leapField = field.getLeapDurationField();
        assertNotNull(leapField);
        // The leap duration field for month of year is days.
        assertEquals(DurationFieldType.days(), leapField.getType());
    }

    @Test
    public void testGetMinimumValue() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        assertEquals(DateTimeConstants.JANUARY, field.getMinimumValue());
    }

    @Test
    public void testGetMaximumValue() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        assertEquals(iChronology.getMaxMonth(), field.getMaximumValue());
    }

    @Test
    public void testRoundFloor_basic() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 5, 15) + DateTimeConstants.MILLIS_PER_HOUR; // May 15, 2020 01:00:00
        long result = field.roundFloor(instant);
        // Expected: Start of the month: May 1, 2020 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthMillis(2020, 5);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testRoundFloor_firstOfMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 5, 1) + iChronology.getMillisOfDay(0); // May 1, 2020 00:00:00
        long result = field.roundFloor(instant);
        // Expected: Start of the month: May 1, 2020 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthMillis(2020, 5);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testRemainder_basic() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 5, 15) + DateTimeConstants.MILLIS_PER_HOUR; // May 15, 2020 01:00:00
        long rounded = field.roundFloor(instant);
        // Remainder is the difference between the instant and its floor.
        assertEquals(instant - rounded, field.remainder(instant));
    }

    @Test
    public void testRemainder_firstOfMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 5, 1) + iChronology.getMillisOfDay(0); // May 1, 2020 00:00:00
        // Floor of the first instant of the month is the instant itself, so remainder is 0.
        assertEquals(0, field.remainder(instant));
    }

    @Test
    public void testAdd_longMonths_yearBoundary() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 12, 31) + iChronology.getMillisOfDay(0); // Dec 31, 2020
        long monthsToAdd = 1;
        long result = field.add(instant, monthsToAdd);
        // Expected: Jan 31, 2021 00:00:00 GMT (Jan has 31 days)
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 1, 31) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_yearBoundaryNegative() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 1, 31) + iChronology.getMillisOfDay(0); // Jan 31, 2020
        long monthsToAdd = -1;
        long result = field.add(instant, monthsToAdd);
        // Expected: Dec 31, 2019 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2019, 12, 31) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_acrossLeapFebruary() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 1, 31) + iChronology.getMillisOfDay(0); // Jan 31, 2020
        long monthsToAdd = 1;
        long result = field.add(instant, monthsToAdd);
        // Expected: Feb 29, 2020 00:00:00 GMT (2020 is a leap year)
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 2, 29) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_acrossNonLeapFebruary() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2021, 1, 31) + iChronology.getMillisOfDay(0); // Jan 31, 2021
        long monthsToAdd = 1;
        long result = field.add(instant, monthsToAdd);
        // Expected: Feb 28, 2021 00:00:00 GMT (2021 is not a leap year)
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 2, 28) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_acrossNonLeapFebruaryLargeDifference() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2021, 3, 31) + iChronology.getMillisOfDay(0); // Mar 31, 2021
        long monthsToAdd = -2; // 2 months back
        long result = field.add(instant, monthsToAdd);
        // Expected: Jan 31, 2021 00:00:00 GMT
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 1, 31) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }
    
    // Test for `get(long instant)` method
    @Test
    public void testGet_basic() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 5, 15) + DateTimeConstants.MILLIS_PER_HOUR; // May 15, 2020 01:00:00
        int month = field.get(instant);
        assertEquals(5, month); // Expected month of year is 5
    }
    
    // Test for `get(long instant)` at year boundary
    @Test
    public void testGet_yearBoundary() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 12, 31) + iChronology.getMillisOfDay(0); // Dec 31, 2020 00:00:00
        int month = field.get(instant);
        assertEquals(12, month); // Expected month of year is 12
    }
    
    // Test for `get(long instant)` at beginning of year
    @Test
    public void testGet_beginningOfYear() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 1, 1) + iChronology.getMillisOfDay(0); // Jan 1, 2020 00:00:00
        int month = field.get(instant);
        assertEquals(1, month); // Expected month of year is 1
    }
}
