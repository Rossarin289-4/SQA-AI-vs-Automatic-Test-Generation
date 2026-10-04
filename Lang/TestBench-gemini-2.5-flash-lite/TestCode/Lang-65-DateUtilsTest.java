package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

public class DateUtilsTest {

    @Test
    public void testIsSameDay_SameDate() {
        Date date1 = new Date(1234567890000L);
        Date date2 = new Date(1234567890000L);
        assertTrue(DateUtils.isSameDay(date1, date2));
    }

    @Test
    public void testIsSameDay_DifferentDate() {
        Date date1 = new Date(1234567890000L);
        Date date2 = new Date(1234567890000L + DateUtils.MILLIS_PER_DAY);
        assertFalse(DateUtils.isSameDay(date1, date2));
    }

    @Test
    public void testIsSameDay_DifferentTime() {
        Date date1 = new Date(1234567890000L);
        Date date2 = new Date(1234567890000L + 1000L); // 1 second difference
        assertTrue(DateUtils.isSameDay(date1, date2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_NullDate1() {
        Date date2 = new Date();
        DateUtils.isSameDay(null, date2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_NullDate2() {
        Date date1 = new Date();
        DateUtils.isSameDay(date1, null);
    }

    @Test
    public void testIsSameInstant_SameDate() {
        Date date1 = new Date(1234567890000L);
        Date date2 = new Date(1234567890000L);
        assertTrue(DateUtils.isSameInstant(date1, date2));
    }

    @Test
    public void testIsSameInstant_DifferentDate() {
        Date date1 = new Date(1234567890000L);
        Date date2 = new Date(1234567890000L + 1000L);
        assertFalse(DateUtils.isSameInstant(date1, date2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_NullDate1() {
        Date date2 = new Date();
        DateUtils.isSameInstant(null, date2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_NullDate2() {
        Date date1 = new Date();
        DateUtils.isSameInstant(date1, null);
    }

    @Test
    public void testIsSameLocalTime_SameCalendar() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(1234567890000L);
        Calendar cal2 = (Calendar) cal1.clone();
        assertTrue(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_DifferentTime() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(1234567890000L);
        Calendar cal2 = (Calendar) cal1.clone();
        cal2.add(Calendar.SECOND, 1);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_DifferentClass() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(1234567890000L);
        // Use a Calendar with a different TimeZone to ensure it's not considered same local time
        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal2.setTimeInMillis(1234567890000L);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_NullCal1() {
        Calendar cal2 = Calendar.getInstance();
        DateUtils.isSameLocalTime(null, cal2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_NullCal2() {
        Calendar cal1 = Calendar.getInstance();
        DateUtils.isSameLocalTime(cal1, null);
    }

    @Test
    public void testParseDate_ValidDate() throws ParseException {
        String str = "2023-10-27";
        String[] patterns = {"yyyy-MM-dd"};
        // Expected: 2023-10-27 00:00:00 GMT. Note that Date.getTime() returns milliseconds since epoch.
        // 2023-10-27 is 1698364800000L.
        Date expected = new Date(1698364800000L);
        assertEquals(expected, DateUtils.parseDate(str, patterns));
    }

    @Test(expected = ParseException.class)
    public void testParseDate_InvalidDate() throws ParseException {
        String str = "2023-13-27"; // Invalid month
        String[] patterns = {"yyyy-MM-dd"};
        DateUtils.parseDate(str, patterns);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullString() throws ParseException {
        String[] patterns = {"yyyy-MM-dd"};
        DateUtils.parseDate(null, patterns);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullPatterns() throws ParseException {
        String str = "2023-10-27";
        DateUtils.parseDate(str, null);
    }

    @Test
    public void testAddYears() {
        Date date = new Date(1698364800000L); // 2023-10-27 00:00:00 GMT
        Date result = DateUtils.addYears(date, 1);
        // Expected: 2024-10-27 00:00:00 GMT
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2024, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddMonths() {
        Date date = new Date(1698364800000L); // 2023-10-27 00:00:00 GMT
        Date result = DateUtils.addMonths(date, 3);
        // Expected: 2024-01-27 00:00:00 GMT
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2024, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddWeeks() {
        Date date = new Date(1698364800000L); // 2023-10-27 (Thursday) 00:00:00 GMT
        Date result = DateUtils.addWeeks(date, 2);
        // Expected: 2023-11-10 (Friday) 00:00:00 GMT
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.NOVEMBER, cal.get(Calendar.MONTH));
        assertEquals(10, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddDays() {
        Date date = new Date(1698364800000L); // 2023-10-27 00:00:00 GMT
        Date result = DateUtils.addDays(date, 5);
        // Expected: 2023-11-01 00:00:00 GMT
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.NOVEMBER, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddHours() {
        Date date = new Date(1698364800000L); // 2023-10-27 00:00:00 GMT
        Date result = DateUtils.addHours(date, 26);
        // Expected: 2023-10-28 02:00:00 GMT
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(28, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(2, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testAddMinutes() {
        Date date = new Date(1698364800000L); // 2023-10-27 00:00:00 GMT
        Date result = DateUtils.addMinutes(date, 70);
        // Expected: 2023-10-27 01:10:00 GMT
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(1, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(10, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testAddSeconds() {
        Date date = new Date(1698364800000L); // 2023-10-27 00:00:00 GMT
        Date result = DateUtils.addSeconds(date, 125);
        // Expected: 2023-10-27 00:02:05 GMT
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(2, cal.get(Calendar.MINUTE));
        assertEquals(5, cal.get(Calendar.SECOND));
    }

    @Test
    public void testAddMilliseconds() {
        Date date = new Date(1698364800000L); // 2023-10-27 00:00:00 GMT
        Date result = DateUtils.addMilliseconds(date, 5000);
        // Expected: 2023-10-27 00:00:05 GMT
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH));
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(5, cal.get(Calendar.SECOND));
    }

    @Test
    public void testAdd() {
        Date date = new Date(1698364800000L); // 2023-10-27 00:00:00 GMT
        Date result = DateUtils.add(date, Calendar.DAY_OF_YEAR, 10);
        // Expected: 2023-11-06 00:00:00 GMT
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.NOVEMBER, cal.get(Calendar.MONTH));
        assertEquals(6, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testRound_Date_Hour() {
        // 2002-03-28 13:45:01.231
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 1);
        cal.set(Calendar.MILLISECOND, 231);
        Date date = cal.getTime();

        Date rounded = DateUtils.round(date, Calendar.HOUR_OF_DAY);

        // Expected: 2002-03-28 14:00:00.000
        Calendar roundedCal = Calendar.getInstance();
        roundedCal.setTime(rounded);
        assertEquals(2002, roundedCal.get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, roundedCal.get(Calendar.MONTH));
        assertEquals(28, roundedCal.get(Calendar.DAY_OF_MONTH));
        assertEquals(14, roundedCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, roundedCal.get(Calendar.MINUTE));
        assertEquals(0, roundedCal.get(Calendar.SECOND));
        assertEquals(0, roundedCal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testRound_Calendar_Month() {
        // 2002-03-28 13:45:01.231
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 1);
        cal.set(Calendar.MILLISECOND, 231);

        Calendar rounded = DateUtils.round(cal, Calendar.MONTH);

        // Expected: 2002-04-01 00:00:00.000
        assertEquals(2002, rounded.get(Calendar.YEAR));
        assertEquals(Calendar.APRIL, rounded.get(Calendar.MONTH));
        assertEquals(1, rounded.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, rounded.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, rounded.get(Calendar.MINUTE));
        assertEquals(0, rounded.get(Calendar.SECOND));
        assertEquals(0, rounded.get(Calendar.MILLISECOND));
    }
    
    @Test
    public void testRound_Object_SemiMonth() {
        // Date: March 1st
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 1, 10, 30, 0);
        Date date = cal.getTime();
        
        // Rounding to SEMI_MONTH on the 1st should keep it as the 1st
        Date rounded = DateUtils.round(date, DateUtils.SEMI_MONTH);
        Calendar roundedCal = Calendar.getInstance();
        roundedCal.setTime(rounded);
        assertEquals(2023, roundedCal.get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, roundedCal.get(Calendar.MONTH));
        assertEquals(1, roundedCal.get(Calendar.DATE)); // Still the 1st

        // Date: March 16th
        cal.set(2023, Calendar.MARCH, 16, 10, 30, 0);
        date = cal.getTime();
        rounded = DateUtils.round(date, DateUtils.SEMI_MONTH);
        roundedCal.setTime(rounded);
        assertEquals(2023, roundedCal.get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, roundedCal.get(Calendar.MONTH));
        assertEquals(16, roundedCal.get(Calendar.DATE)); // Rounds up to 16th

        // Date: March 17th
        cal.set(2023, Calendar.MARCH, 17, 10, 30, 0);
        date = cal.getTime();
        rounded = DateUtils.round(date, DateUtils.SEMI_MONTH);
        roundedCal.setTime(rounded);
        // Should round to April 1st, as it's past the midpoint of the month (15.5)
        assertEquals(2023, roundedCal.get(Calendar.YEAR));
        assertEquals(Calendar.APRIL, roundedCal.get(Calendar.MONTH));
        assertEquals(1, roundedCal.get(Calendar.DATE));
    }

    @Test
    public void testTruncate_Date_Hour() {
        // 2002-03-28 13:45:01.231
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 1);
        cal.set(Calendar.MILLISECOND, 231);
        Date date = cal.getTime();

        Date truncated = DateUtils.truncate(date, Calendar.HOUR_OF_DAY);

        // Expected: 2002-03-28 13:00:00.000
        Calendar truncatedCal = Calendar.getInstance();
        truncatedCal.setTime(truncated);
        assertEquals(2002, truncatedCal.get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, truncatedCal.get(Calendar.MONTH));
        assertEquals(28, truncatedCal.get(Calendar.DAY_OF_MONTH));
        assertEquals(13, truncatedCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, truncatedCal.get(Calendar.MINUTE));
        assertEquals(0, truncatedCal.get(Calendar.SECOND));
        assertEquals(0, truncatedCal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testTruncate_Calendar_Month() {
        // 2002-03-28 13:45:01.231
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 1);
        cal.set(Calendar.MILLISECOND, 231);

        Calendar truncated = DateUtils.truncate(cal, Calendar.MONTH);

        // Expected: 2002-03-01 00:00:00.000
        assertEquals(2002, truncated.get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, truncated.get(Calendar.MONTH));
        assertEquals(1, truncated.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, truncated.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, truncated.get(Calendar.MINUTE));
        assertEquals(0, truncated.get(Calendar.SECOND));
        assertEquals(0, truncated.get(Calendar.MILLISECOND));
    }

    @Test
    public void testTruncate_Object_SemiMonth() {
        // Date: March 10th
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 10, 10, 30, 0);
        Date date = cal.getTime();
        
        // Truncating to SEMI_MONTH on the 10th should keep it as the 10th
        Date truncated = DateUtils.truncate(date, DateUtils.SEMI_MONTH);
        Calendar truncatedCal = Calendar.getInstance();
        truncatedCal.setTime(truncated);
        assertEquals(2023, truncatedCal.get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, truncatedCal.get(Calendar.MONTH));
        assertEquals(10, truncatedCal.get(Calendar.DATE)); // Still the 10th

        // Date: March 16th
        cal.set(2023, Calendar.MARCH, 16, 10, 30, 0);
        date = cal.getTime();
        truncated = DateUtils.truncate(date, DateUtils.SEMI_MONTH);
        truncatedCal.setTime(truncated);
        assertEquals(2023, truncatedCal.get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, truncatedCal.get(Calendar.MONTH));
        assertEquals(16, truncatedCal.get(Calendar.DATE)); // Should stay 16th
    }

    @Test
    public void testIterator_Date_RangeMonthSunday() {
        // Focus: Thursday, July 4, 2002
        Calendar focusCal = Calendar.getInstance();
        focusCal.set(2002, Calendar.JULY, 4);
        Date focusDate = focusCal.getTime();

        Iterator iterator = DateUtils.iterator(focusDate, DateUtils.RANGE_MONTH_SUNDAY);

        // Expected start: Sunday, June 30, 2002
        Calendar startCal = Calendar.getInstance();
        startCal.set(2002, Calendar.JUNE, 30);
        
        // Expected end: Saturday, August 3, 2002
        Calendar endCal = Calendar.getInstance();
        endCal.set(2002, Calendar.AUGUST, 3);

        Calendar currentCal = (Calendar) iterator.next();
        assertEquals(startCal.getTimeInMillis(), currentCal.getTimeInMillis());

        Calendar lastCal = null;
        while (iterator.hasNext()) {
            lastCal = (Calendar) iterator.next();
        }
        assertEquals(endCal.getTimeInMillis(), lastCal.getTimeInMillis());
    }

    @Test
    public void testIterator_Calendar_RangeWeekMonday() {
        // Focus: Thursday, July 4, 2002
        Calendar focusCal = Calendar.getInstance();
        focusCal.set(2002, Calendar.JULY, 4); // Thursday

        Iterator iterator = DateUtils.iterator(focusCal, DateUtils.RANGE_WEEK_MONDAY);

        // Expected start: Monday, July 1, 2002
        Calendar startCal = Calendar.getInstance();
        startCal.set(2002, Calendar.JULY, 1);
        
        // Expected end: Sunday, July 7, 2002
        Calendar endCal = Calendar.getInstance();
        endCal.set(2002, Calendar.JULY, 7);

        Calendar currentCal = (Calendar) iterator.next();
        assertEquals(startCal.getTimeInMillis(), currentCal.getTimeInMillis());

        Calendar lastCal = null;
        while (iterator.hasNext()) {
            lastCal = (Calendar) iterator.next();
        }
        assertEquals(endCal.getTimeInMillis(), lastCal.getTimeInMillis());
    }

    @Test
    public void testIterator_Object_RangeWeekRelative() {
        // Focus: Thursday, July 4, 2002
        Calendar focusCal = Calendar.getInstance();
        focusCal.set(2002, Calendar.JULY, 4); // Thursday (DAY_OF_WEEK is 5 for Thursday if Sunday is 1)

        Iterator iterator = DateUtils.iterator(focusCal, DateUtils.RANGE_WEEK_RELATIVE);

        // Expected start: Thursday, July 4, 2002
        Calendar startCal = Calendar.getInstance();
        startCal.set(2002, Calendar.JULY, 4);
        
        // Expected end: Wednesday, July 10, 2002
        Calendar endCal = Calendar.getInstance();
        endCal.set(2002, Calendar.JULY, 10);

        Calendar currentCal = (Calendar) iterator.next();
        assertEquals(startCal.getTimeInMillis(), currentCal.getTimeInMillis());

        Calendar lastCal = null;
        while (iterator.hasNext()) {
            lastCal = (Calendar) iterator.next();
        }
        assertEquals(endCal.getTimeInMillis(), lastCal.getTimeInMillis());
    }

    @Test
    public void testIterator_Object_RangeWeekCenter() {
        // Focus: Thursday, July 4, 2002
        Calendar focusCal = Calendar.getInstance();
        focusCal.set(2002, Calendar.JULY, 4); // Thursday (DAY_OF_WEEK is 5 if Sunday is 1)

        Iterator iterator = DateUtils.iterator(focusCal, DateUtils.RANGE_WEEK_CENTER);

        // Expected start: Monday, July 1, 2002 (5 - 3 = 2, Monday)
        Calendar startCal = Calendar.getInstance();
        startCal.set(2002, Calendar.JULY, 1);
        
        // Expected end: Sunday, July 7, 2002 (5 + 3 = 8, which wraps to Sunday)
        Calendar endCal = Calendar.getInstance();
        endCal.set(2002, Calendar.JULY, 7);

        Calendar currentCal = (Calendar) iterator.next();
        assertEquals(startCal.getTimeInMillis(), currentCal.getTimeInMillis());

        Calendar lastCal = null;
        while (iterator.hasNext()) {
            lastCal = (Calendar) iterator.next();
        }
        assertEquals(endCal.getTimeInMillis(), lastCal.getTimeInMillis());
    }
    
    @Test
    public void testDateIterator_hasNext() {
        Calendar start = Calendar.getInstance();
        start.set(2023, Calendar.OCTOBER, 27);
        Calendar end = Calendar.getInstance();
        end.set(2023, Calendar.OCTOBER, 29); // Will iterate 27th, 28th
        
        DateUtils.DateIterator iterator = new DateUtils.DateIterator(start, end);
        
        assertTrue(iterator.hasNext());
        iterator.next(); // 27th
        assertTrue(iterator.hasNext());
        iterator.next(); // 28th
        assertFalse(iterator.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testDateIterator_next_empty() {
        Calendar start = Calendar.getInstance();
        start.set(2023, Calendar.OCTOBER, 27);
        Calendar end = Calendar.getInstance();
        end.set(2023, Calendar.OCTOBER, 27); // End is exclusive, so no elements
        
        DateUtils.DateIterator iterator = new DateUtils.DateIterator(start, end);
        iterator.next();
    }

    @Test
    public void testDateIterator_next_correct() {
        Calendar start = Calendar.getInstance();
        start.set(2023, Calendar.OCTOBER, 27);
        Calendar end = Calendar.getInstance();
        end.set(2023, Calendar.OCTOBER, 29); // Iterates 27th, 28th

        DateUtils.DateIterator iterator = new DateUtils.DateIterator(start, end);

        Calendar first = (Calendar) iterator.next();
        assertEquals(2023, first.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, first.get(Calendar.MONTH));
        assertEquals(27, first.get(Calendar.DAY_OF_MONTH));

        Calendar second = (Calendar) iterator.next();
        assertEquals(2023, second.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, second.get(Calendar.MONTH));
        assertEquals(28, second.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddMilliseconds_EdgeCase() {
        Date date = new Date(0); // Epoch start
        // Add a large number of milliseconds that spans days and years
        // 365 days + 1 day = 366 days. 1970 was not a leap year.
        long oneYearAndOneDayInMillis = 366L * 24 * 60 * 60 * 1000L;
        // The method signature requires int, so we need to be careful with casting.
        // However, the reference code adds this amount.
        // For the reference, the addition logic likely handles it correctly.
        // Testing with an int that fits within range.
        int amount = Integer.MAX_VALUE / 2; // A large positive int value
        Date result = DateUtils.addMilliseconds(date, amount);
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        
        // Calculate expected value precisely
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.setTime(date);
        expectedCal.add(Calendar.MILLISECOND, amount);
        
        assertEquals(expectedCal.get(Calendar.YEAR), cal.get(Calendar.YEAR));
        assertEquals(expectedCal.get(Calendar.MONTH), cal.get(Calendar.MONTH));
        assertEquals(expectedCal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(expectedCal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(expectedCal.get(Calendar.MINUTE), cal.get(Calendar.MINUTE));
        assertEquals(expectedCal.get(Calendar.SECOND), cal.get(Calendar.SECOND));
        assertEquals(expectedCal.get(Calendar.MILLISECOND), cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testAddDays_Boundary() {
        // Test adding a large number of days to ensure it handles month/year rollovers correctly.
        // Using a date before a leap year to check year boundary.
        Date date = new Date(1136073600000L); // 2005-12-31 00:00:00 GMT
        Date result = DateUtils.addDays(date, 366); // Add 366 days. 2006 is not a leap year, so this should land on Jan 1, 2007.
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        
        // Expected: 2007-01-01
        assertEquals(2007, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
    }
    
    @Test
    public void testRound_EdgeCase_EndOfDay() {
        // Test rounding to the start of the next day.
        // 2023-10-27 23:59:59.999
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 27, 23, 59, 59);
        cal.set(Calendar.MILLISECOND, 999);
        Date date = cal.getTime();

        Date rounded = DateUtils.round(date, Calendar.DATE); // Round to DATE should round up to next day

        // Expected: 2023-10-28 00:00:00.000
        Calendar roundedCal = Calendar.getInstance();
        roundedCal.setTime(rounded);
        assertEquals(2023, roundedCal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, roundedCal.get(Calendar.MONTH));
        assertEquals(28, roundedCal.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, roundedCal.get(Calendar.HOUR_OF_DAY));
    }
    
    @Test
    public void testTruncate_EdgeCase_StartOfDay() {
        // Test truncating to the start of the current day.
        // 2023-10-27 23:59:59.999
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 27, 23, 59, 59);
        cal.set(Calendar.MILLISECOND, 999);
        Date date = cal.getTime();

        Date truncated = DateUtils.truncate(date, Calendar.DATE); // Truncate to DATE should result in the start of the day

        // Expected: 2023-10-27 00:00:00.000
        Calendar truncatedCal = Calendar.getInstance();
        truncatedCal.setTime(truncated);
        assertEquals(2023, truncatedCal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, truncatedCal.get(Calendar.MONTH));
        assertEquals(27, truncatedCal.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, truncatedCal.get(Calendar.HOUR_OF_DAY));
    }
}
