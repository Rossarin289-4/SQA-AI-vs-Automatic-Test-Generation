package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.GregorianChronology;

public class BasicMonthOfYearDateTimeFieldTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Use a real BasicChronology (like GregorianChronology) for reliable tests
    private BasicChronology iChronology = GregorianChronology.getInstance();

    // Helper method to get the field instance
    private BasicMonthOfYearDateTimeField getTestField() {
        // Use the actual BasicChronology instance from GregorianChronology
        return new BasicMonthOfYearDateTimeField(iChronology, DateTimeConstants.JANUARY);
    }

    @Test
    public void testGet() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.millis(); // Use a real instant from the chronology
        int month = field.get(instant);
        assertTrue(month >= DateTimeConstants.JANUARY && month <= iChronology.getMaxMonth());
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
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 4, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_negativeMonths() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int monthsToAdd = -2; // Subtract 2 months
        long result = field.add(instant, monthsToAdd);
        // With GregorianChronology, 1 Jan 2020 minus 2 months should be 1 Nov 2019
        long expectedInstant = iChronology.getYearMonthDayMillis(2019, 11, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_yearBoundaryPositive() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 12, 15) + iChronology.getMillisOfDay(0); // Dec 15, 2020
        int monthsToAdd = 1;
        long result = field.add(instant, monthsToAdd);
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 1, 15) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_yearBoundaryNegative() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 1, 15) + iChronology.getMillisOfDay(0); // Jan 15, 2020
        int monthsToAdd = -1;
        long result = field.add(instant, monthsToAdd);
        // With GregorianChronology, 15 Jan 2020 minus 1 month should be 15 Dec 2019
        long expectedInstant = iChronology.getYearMonthDayMillis(2019, 12, 15) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_monthCoercion() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 7, 31) + iChronology.getMillisOfDay(0); // July 31, 2020
        int monthsToAdd = 1; // Add 1 month
        long result = field.add(instant, monthsToAdd);
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 8, 31) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_monthCoercionToShorterMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 3, 31) + iChronology.getMillisOfDay(0); // March 31, 2020
        int monthsToAdd = 1; // Add 1 month
        long result = field.add(instant, monthsToAdd);
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 4, 30) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_monthCoercionToFebruary() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 3, 31) + iChronology.getMillisOfDay(0); // March 31, 2020
        int monthsToAdd = -2; // Add -2 months
        long result = field.add(instant, monthsToAdd);
        // 2020 is a leap year, so Feb has 29 days.
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 2, 29) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_positive() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        long monthsToAdd = 13; // Add 13 months
        long result = field.add(instant, monthsToAdd);
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 2, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_negative() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        long monthsToAdd = -13; // Subtract 13 months
        long result = field.add(instant, monthsToAdd);
        // Jan 1, 2020 minus 13 months is Oct 1, 2018
        long expectedInstant = iChronology.getYearMonthDayMillis(2018, 10, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAddWrapField_positive() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int monthsToAdd = 15; // Add 15 months (wraps around 12)
        long result = field.addWrapField(instant, monthsToAdd);
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 4, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAddWrapField_negative() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int monthsToAdd = -14; // Subtract 14 months
        long result = field.addWrapField(instant, monthsToAdd);
        // Jan 1, 2020 minus 14 months (wrapped) is Nov 1, 2018
        long expectedInstant = iChronology.getYearMonthDayMillis(2018, 11, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testGetDifferenceAsLong_sameMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant1 = iChronology.getYearMonthDayMillis(2020, 5, 10) + iChronology.getMillisOfDay(0);
        long instant2 = iChronology.getYearMonthDayMillis(2020, 5, 20) + iChronology.getMillisOfDay(0);
        assertEquals(0, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testGetDifferenceAsLong_differentMonths() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant1 = iChronology.getYearMonthDayMillis(2020, 5, 10) + iChronology.getMillisOfDay(0); // May 10, 2020
        long instant2 = iChronology.getYearMonthDayMillis(2020, 7, 20) + iChronology.getMillisOfDay(0); // July 20, 2020
        assertEquals(2, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testGetDifferenceAsLong_acrossYears() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant1 = iChronology.getYearMonthDayMillis(2019, 11, 10) + iChronology.getMillisOfDay(0); // Nov 10, 2019
        long instant2 = iChronology.getYearMonthDayMillis(2020, 2, 20) + iChronology.getMillisOfDay(0); // Feb 20, 2020
        assertEquals(3, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testGetDifferenceAsLong_negativeDifference() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant1 = iChronology.getYearMonthDayMillis(2020, 7, 20) + iChronology.getMillisOfDay(0); // July 20, 2020
        long instant2 = iChronology.getYearMonthDayMillis(2020, 5, 10) + iChronology.getMillisOfDay(0); // May 10, 2020
        assertEquals(-2, field.getDifferenceAsLong(instant1, instant2));
    }

    @Test
    public void testSet_basic() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int newMonth = 7; // Set to July
        long result = field.set(instant, newMonth);
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 7, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testSet_coerceDayToShorterMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 3, 31) + iChronology.getMillisOfDay(0); // March 31, 2020
        int newMonth = 4; // Set to April
        long result = field.set(instant, newMonth);
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 4, 30) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testSet_coerceDayToFebruaryLeap() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 3, 31) + iChronology.getMillisOfDay(0); // March 31, 2020
        int newMonth = 2; // Set to February
        long result = field.set(instant, newMonth);
        // 2020 is a leap year, so Feb has 29 days.
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 2, 29) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }
    
    @Test
    public void testSet_coerceDayToFebruaryNonLeap() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2021, 3, 31) + iChronology.getMillisOfDay(0); // March 31, 2021
        int newMonth = 2; // Set to February
        long result = field.set(instant, newMonth);
        // 2021 is not a leap year, so Feb has 28 days.
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 2, 28) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }


    @Test
    public void testSet_minimumValue() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int newMonth = DateTimeConstants.JANUARY; // Set to January (1)
        long result = field.set(instant, newMonth);
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 1, 1) + iChronology.getMillisOfDay(instant);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testSet_maximumValue() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = 1577836800000L; // Jan 1, 2020 00:00:00 GMT
        int newMonth = iChronology.getMaxMonth(); // Set to December (12)
        long result = field.set(instant, newMonth);
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
        assertEquals(DurationFieldType.years(), rangeField.getType());
    }

    @Test
    public void testIsLeap_leapYearMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        // GregorianChronology.isLeapYear(2020) returns true.
        // For monthOfYear, the leap check is per year, not per month.
        // The month itself is not "leap" in the same way a day is in a leap year.
        // The question of "is leap" for month is related to whether its specified month is the one that "leaps" in a leap year.
        // In this implementation, it checks if the current month is iLeapMonth (which is set to JANUARY in the constructor).
        // So, to test the `isLeap` method, we need to set the instant to the iLeapMonth.
        long instant = iChronology.getYearMonthDayMillis(2020, DateTimeConstants.JANUARY, 15); // January 15, 2020
        assertTrue(field.isLeap(instant)); // Assuming iLeapMonth is JANUARY
    }

    @Test
    public void testIsLeap_nonLeapYearMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        // GregorianChronology.isLeapYear(2020) returns true.
        // We are testing a non-leap month.
        long instant = iChronology.getYearMonthDayMillis(2020, DateTimeConstants.FEBRUARY, 15); // February 15, 2020
        assertFalse(field.isLeap(instant)); // Assuming iLeapMonth is JANUARY
    }
    
    @Test
    public void testIsLeap_nonLeapYear() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        // GregorianChronology.isLeapYear(2021) returns false.
        long instant = iChronology.getYearMonthDayMillis(2021, DateTimeConstants.JANUARY, 15); // January 15, 2021
        assertFalse(field.isLeap(instant));
    }


    @Test
    public void testGetLeapAmount_leap() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, DateTimeConstants.JANUARY, 15); // January 15, 2020
        assertEquals(1, field.getLeapAmount(instant)); // Assuming iLeapMonth is JANUARY
    }

    @Test
    public void testGetLeapAmount_nonLeap() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, DateTimeConstants.FEBRUARY, 15); // February 15, 2020
        assertEquals(0, field.getLeapAmount(instant));
    }

    @Test
    public void testGetLeapDurationField() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        DurationField leapField = field.getLeapDurationField();
        assertNotNull(leapField);
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
        long expectedInstant = iChronology.getYearMonthMillis(2020, 5); // This should be start of month
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testRoundFloor_firstOfMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 5, 1) + iChronology.getMillisOfDay(0); // May 1, 2020 00:00:00
        long result = field.roundFloor(instant);
        long expectedInstant = iChronology.getYearMonthMillis(2020, 5);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testRemainder_basic() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 5, 15) + DateTimeConstants.MILLIS_PER_HOUR; // May 15, 2020 01:00:00
        long rounded = field.roundFloor(instant);
        assertEquals(instant - rounded, field.remainder(instant));
    }

    @Test
    public void testRemainder_firstOfMonth() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 5, 1) + iChronology.getMillisOfDay(0); // May 1, 2020 00:00:00
        assertEquals(0, field.remainder(instant));
    }

    @Test
    public void testAdd_longMonths_yearBoundary() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 12, 31) + iChronology.getMillisOfDay(0);
        long monthsToAdd = 1;
        long result = field.add(instant, monthsToAdd);
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 1, 31) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_yearBoundaryNegative() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 1, 31) + iChronology.getMillisOfDay(0);
        long monthsToAdd = -1;
        long result = field.add(instant, monthsToAdd);
        // Jan 31, 2020 minus 1 month is Dec 31, 2019
        long expectedInstant = iChronology.getYearMonthDayMillis(2019, 12, 31) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_acrossLeapFebruary() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2020, 1, 31) + iChronology.getMillisOfDay(0);
        long monthsToAdd = 1;
        long result = field.add(instant, monthsToAdd);
        // Jan 31, 2020 plus 1 month is Feb 29, 2020 (leap year)
        long expectedInstant = iChronology.getYearMonthDayMillis(2020, 2, 29) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_acrossNonLeapFebruary() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2021, 1, 31) + iChronology.getMillisOfDay(0);
        long monthsToAdd = 1;
        long result = field.add(instant, monthsToAdd);
        // Jan 31, 2021 plus 1 month is Feb 28, 2021 (non-leap year)
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 2, 28) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_acrossNonLeapFebruaryLargeDifference() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(2021, 3, 31) + iChronology.getMillisOfDay(0);
        long monthsToAdd = -2; // 2 months back
        long result = field.add(instant, monthsToAdd);
        // Mar 31, 2021 minus 2 months is Jan 31, 2021
        long expectedInstant = iChronology.getYearMonthDayMillis(2021, 1, 31) + iChronology.getMillisOfDay(0);
        assertEquals(expectedInstant, result);
    }

    @Test
    public void testAdd_longMonths_largeNegative() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(1970, 1, 1) + iChronology.getMillisOfDay(0); // Jan 1, 1970
        long monthsToAdd = -500000000; // A large negative number of months
        long result = field.add(instant, monthsToAdd);
        // This should result in an exception due to year bounds
        try {
            iChronology.get(DateTimeFieldType.monthOfYear(), result); // Trigger potential exception
            fail("Expected IllegalArgumentException for out of bounds year.");
        } catch (IllegalArgumentException expected) {
            // Expected exception
        }
    }

    @Test
    public void testAdd_longMonths_largePositive() throws Exception {
        BasicMonthOfYearDateTimeField field = getTestField();
        long instant = iChronology.getYearMonthDayMillis(1970, 1, 1) + iChronology.getMillisOfDay(0); // Jan 1, 1970
        long monthsToAdd = 500000000; // A large positive number of months
        long result = field.add(instant, monthsToAdd);
        // This should result in an exception due to year bounds
        try {
            iChronology.get(DateTimeFieldType.monthOfYear(), result); // Trigger potential exception
            fail("Expected IllegalArgumentException for out of bounds year.");
        } catch (IllegalArgumentException expected) {
            // Expected exception
        }
    }
}
