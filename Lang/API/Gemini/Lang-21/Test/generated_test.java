package org.apache.commons.lang3.time;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

/**
 * Independent test suite for Lang-21 (DateUtils.isSameLocalTime).
 */
public class DateUtilsLang21Test {

    @Test
    public void testIsSameLocalTime_AmPmDifference() {
        Calendar calMorning = new GregorianCalendar(2020, Calendar.JANUARY, 15, 8, 30, 0);
        calMorning.set(Calendar.MILLISECOND, 500);

        Calendar calEvening = new GregorianCalendar(2020, Calendar.JANUARY, 15, 20, 30, 0);
        calEvening.set(Calendar.MILLISECOND, 500);

        // Buggy version uses Calendar.HOUR (returns true for 8:30 AM and 8:30 PM).
        // Fixed version uses Calendar.HOUR_OF_DAY (returns false).
        assertFalse("8:30 AM and 8:30 PM should not be considered the same local time",
                DateUtils.isSameLocalTime(calMorning, calEvening));
    }

    @Test
    public void testIsSameLocalTime_MidnightAndNoon() {
        Calendar calMidnight = new GregorianCalendar(2021, Calendar.JUNE, 1, 0, 0, 0);
        calMidnight.set(Calendar.MILLISECOND, 0);

        Calendar calNoon = new GregorianCalendar(2021, Calendar.JUNE, 1, 12, 0, 0);
        calNoon.set(Calendar.MILLISECOND, 0);

        assertFalse("Midnight and Noon should not be considered the same local time",
                DateUtils.isSameLocalTime(calMidnight, calNoon));
    }

    @Test
    public void testIsSameLocalTime_IdenticalTimes() {
        Calendar cal1 = new GregorianCalendar(2022, Calendar.MARCH, 10, 14, 45, 30);
        cal1.set(Calendar.MILLISECOND, 123);

        Calendar cal2 = new GregorianCalendar(2022, Calendar.MARCH, 10, 14, 45, 30);
        cal2.set(Calendar.MILLISECOND, 123);

        assertTrue("Identical local times should be considered the same local time",
                DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_NullFirstArgument() {
        Calendar cal = Calendar.getInstance();
        DateUtils.isSameLocalTime(null, cal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_NullSecondArgument() {
        Calendar cal = Calendar.getInstance();
        DateUtils.isSameLocalTime(cal, null);
    }
}
