package org.apache.commons.lang3.time;

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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testIsSameDay_Date() {
        Date date1 = new Date(1678886400000L); // March 15, 2023 12:00:00 AM GMT
        Date date2 = new Date(1678890000000L); // March 15, 2023 01:00:00 AM GMT
        Date date3 = new Date(1678972800000L); // March 16, 2023 12:00:00 AM GMT
        assertTrue(DateUtils.isSameDay(date1, date2));
        assertFalse(DateUtils.isSameDay(date1, date3));
    }

    @Test
    public void testIsSameDay_Calendar() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2023, Calendar.MARCH, 15, 2, 15, 30);
        Calendar cal3 = Calendar.getInstance();
        cal3.set(2023, Calendar.MARCH, 16, 10, 30, 0);
        assertTrue(DateUtils.isSameDay(cal1, cal2));
        assertFalse(DateUtils.isSameDay(cal1, cal3));
    }

    @Test
    public void testIsSameInstant_Date() {
        Date date1 = new Date(1678886400000L); // March 15, 2023 12:00:00 AM GMT
        Date date2 = new Date(1678886400000L); // March 15, 2023 12:00:00 AM GMT
        Date date3 = new Date(1678886400001L); // March 15, 2023 12:00:00 AM GMT + 1ms
        assertTrue(DateUtils.isSameInstant(date1, date2));
        assertFalse(DateUtils.isSameInstant(date1, date3));
    }

    @Test
    public void testIsSameInstant_Calendar() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(1678886400000L);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTimeInMillis(1678886400000L);
        Calendar cal3 = Calendar.getInstance();
        cal3.setTimeInMillis(1678886400001L);
        assertTrue(DateUtils.isSameInstant(cal1, cal2));
        assertFalse(DateUtils.isSameInstant(cal1, cal3));
    }

    @Test
    public void testIsSameLocalTime() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        cal1.set(Calendar.MILLISECOND, 123);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        cal2.set(Calendar.MILLISECOND, 123);

        Calendar cal3 = Calendar.getInstance();
        cal3.set(2023, Calendar.MARCH, 15, 10, 30, 45);
        cal3.set(Calendar.MILLISECOND, 456);

        Calendar cal4 = Calendar.getInstance();
        cal4.set(2023, Calendar.APRIL, 15, 10, 30, 45);
        cal4.set(Calendar.MILLISECOND, 123);

        assertTrue(DateUtils.isSameLocalTime(cal1, cal2));
        assertFalse(DateUtils.isSameLocalTime(cal1, cal3));
        assertFalse(DateUtils.isSameLocalTime(cal1, cal4));
    }

    @Test
    public void testParseDate() throws ParseException {
        String dateString = "2023-03-15";
        String[] patterns = {"yyyy-MM-dd", "MM/dd/yyyy"};
        Date parsedDate = DateUtils.parseDate(dateString, patterns);
        Calendar cal = Calendar.getInstance();
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test(expected = ParseException.class)
    public void testParseDate_NoMatch() throws ParseException {
        String dateString = "invalid-date";
        String[] patterns = {"yyyy-MM-dd"};
        DateUtils.parseDate(dateString, patterns);
    }

    @Test
    public void testParseDateStrictly() throws ParseException {
        String dateString = "2023/03/15";
        String[] patterns = {"yyyy/MM/dd"};
        Date parsedDate = DateUtils.parseDateStrictly(dateString, patterns);
        Calendar cal = Calendar.getInstance();
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test(expected = ParseException.class)
    public void testParseDateStrictly_LenientCase() throws ParseException {
        String dateString = "2023-02-30"; // February 30th is invalid
        String[] patterns = {"yyyy-MM-dd"};
        DateUtils.parseDateStrictly(dateString, patterns);
    }

    @Test
    public void testAddYears() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date addedDate = DateUtils.addYears(date, 2);
        cal.setTime(addedDate);
        assertEquals(2025, cal.get(Calendar.YEAR));
    }

    @Test
    public void testAddMonths() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date addedDate = DateUtils.addMonths(date, 3);
        cal.setTime(addedDate);
        assertEquals(Calendar.JUNE, cal.get(Calendar.MONTH));
    }

    @Test
    public void testAddWeeks() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date addedDate = DateUtils.addWeeks(date, 2);
        cal.setTime(addedDate);
        assertEquals(29, cal.get(Calendar.DAY_OF_MONTH)); // March 15 + 14 days = March 29
    }

    @Test
    public void testAddDays() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date addedDate = DateUtils.addDays(date, 5);
        cal.setTime(addedDate);
        assertEquals(20, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddHours() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date addedDate = DateUtils.addHours(date, 8);
        cal.setTime(addedDate);
        assertEquals(18, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testAddMinutes() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date addedDate = DateUtils.addMinutes(date, 45);
        cal.setTime(addedDate);
        assertEquals(15, cal.get(Calendar.MINUTE)); // 30 + 45 = 75, rolls over to next hour
        assertEquals(11, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testAddSeconds() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 30);
        Date date = cal.getTime();
        Date addedDate = DateUtils.addSeconds(date, 40);
        cal.setTime(addedDate);
        assertEquals(10, cal.get(Calendar.SECOND)); // 30 + 40 = 70, rolls over to next minute
        assertEquals(31, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testAddMilliseconds() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 500);
        Date date = cal.getTime();
        Date addedDate = DateUtils.addMilliseconds(date, 600);
        cal.setTime(addedDate);
        assertEquals(100, cal.get(Calendar.MILLISECOND)); // 500 + 600 = 1100, rolls over to next second
        assertEquals(1, cal.get(Calendar.SECOND));
    }

    @Test
    public void testSetYears() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date setDate = DateUtils.setYears(date, 2025);
        cal.setTime(setDate);
        assertEquals(2025, cal.get(Calendar.YEAR));
    }

    @Test
    public void testSetMonths() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date setDate = DateUtils.setMonths(date, Calendar.JUNE);
        cal.setTime(setDate);
        assertEquals(Calendar.JUNE, cal.get(Calendar.MONTH));
    }

    @Test
    public void testSetDays() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date setDate = DateUtils.setDays(date, 25);
        cal.setTime(setDate);
        assertEquals(25, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testSetHours() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date setDate = DateUtils.setHours(date, 14);
        cal.setTime(setDate);
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testSetMinutes() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        Date date = cal.getTime();
        Date setDate = DateUtils.setMinutes(date, 45);
        cal.setTime(setDate);
        assertEquals(45, cal.get(Calendar.MINUTE));
    }

    @Test
    public void testSetSeconds() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 15);
        Date date = cal.getTime();
        Date setDate = DateUtils.setSeconds(date, 50);
        cal.setTime(setDate);
        assertEquals(50, cal.get(Calendar.SECOND));
    }

    @Test
    public void testSetMilliseconds() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        Date setDate = DateUtils.setMilliseconds(date, 456);
        cal.setTime(setDate);
        assertEquals(456, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testToCalendar() {
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 AM GMT
        Calendar cal = DateUtils.toCalendar(date);
        assertEquals(1678886400000L, cal.getTimeInMillis());
    }

    @Test
    public void testRound_Date_Month() {
        Calendar cal = Calendar.getInstance();
        // Set date to March 15th, 10:30:00.000
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0); 
        cal.set(Calendar.MILLISECOND, 0); // Ensure milliseconds are zero for precise rounding
        Date date = cal.getTime();
        
        Date roundedDate = DateUtils.round(date, Calendar.MONTH);
        Calendar roundedCal = Calendar.getInstance();
        roundedCal.setTime(roundedDate);
        
        // The reference source indicates that for MONTH rounding, if the day is 1st, it stays, 
        // otherwise it rolls over to the 1st of the next month. 
        // March 15th is not the 1st, so it should round to April 1st.
        assertEquals(1, roundedCal.get(Calendar.DAY_OF_MONTH)); 
        assertEquals(Calendar.APRIL, roundedCal.get(Calendar.MONTH));
        assertEquals(2023, roundedCal.get(Calendar.YEAR));
        assertEquals(0, roundedCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, roundedCal.get(Calendar.MINUTE));
        assertEquals(0, roundedCal.get(Calendar.SECOND));
        assertEquals(0, roundedCal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testRound_Date_Hour() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0); // 10:30 AM
        Date date = cal.getTime();
        Date roundedDate = DateUtils.round(date, Calendar.HOUR_OF_DAY);
        Calendar roundedCal = Calendar.getInstance();
        roundedCal.setTime(roundedDate);
        assertEquals(11, roundedCal.get(Calendar.HOUR_OF_DAY)); // Rounded up to 11 AM
        assertEquals(0, roundedCal.get(Calendar.MINUTE));
        assertEquals(0, roundedCal.get(Calendar.SECOND));
        assertEquals(0, roundedCal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testTruncate_Date_Month() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0); // March 15th
        Date date = cal.getTime();
        Date truncatedDate = DateUtils.truncate(date, Calendar.MONTH);
        Calendar truncatedCal = Calendar.getInstance();
        truncatedCal.setTime(truncatedDate);
        assertEquals(1, truncatedCal.get(Calendar.DAY_OF_MONTH)); // Truncated to the 1st of the current month
        assertEquals(Calendar.MARCH, truncatedCal.get(Calendar.MONTH));
    }

    @Test
    public void testTruncate_Date_Hour() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0); // 10:30 AM
        Date date = cal.getTime();
        Date truncatedDate = DateUtils.truncate(date, Calendar.HOUR_OF_DAY);
        Calendar truncatedCal = Calendar.getInstance();
        truncatedCal.setTime(truncatedDate);
        assertEquals(10, truncatedCal.get(Calendar.HOUR_OF_DAY)); // Truncated to 10 AM
        assertEquals(0, truncatedCal.get(Calendar.MINUTE));
        assertEquals(0, truncatedCal.get(Calendar.SECOND));
        assertEquals(0, truncatedCal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testCeiling_Date_Month() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0); // March 15th
        Date date = cal.getTime();
        Date ceilingDate = DateUtils.ceiling(date, Calendar.MONTH);
        Calendar ceilingCal = Calendar.getInstance();
        ceilingCal.setTime(ceilingDate);
        assertEquals(1, ceilingCal.get(Calendar.DAY_OF_MONTH)); // Ceiling to the 1st of the next month
        assertEquals(Calendar.APRIL, ceilingCal.get(Calendar.MONTH));
    }

    @Test
    public void testCeiling_Date_Hour() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 0); // 10:30 AM
        Date date = cal.getTime();
        Date ceilingDate = DateUtils.ceiling(date, Calendar.HOUR_OF_DAY);
        Calendar ceilingCal = Calendar.getInstance();
        ceilingCal.setTime(ceilingDate);
        assertEquals(11, ceilingCal.get(Calendar.HOUR_OF_DAY)); // Ceiling to 11 AM
        assertEquals(0, ceilingCal.get(Calendar.MINUTE));
        assertEquals(0, ceilingCal.get(Calendar.SECOND));
        assertEquals(0, ceilingCal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testIterator_Date_RangeMonthSunday() {
        Calendar focus = Calendar.getInstance();
        // The example in the Javadoc for iterator uses "Thursday, July 4, 2002"
        // Let's use a similar structure to verify the boundaries.
        // For RANGE_MONTH_SUNDAY, starting from a date in March, it should start with the Sunday of the preceding week and end on the Saturday of the following week.
        // Let's pick March 15, 2023, which is a Wednesday.
        focus.set(2023, Calendar.MARCH, 15, 10, 30, 0); // March 15, 2023 (Wednesday)
        Iterator<Calendar> iterator = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_SUNDAY);

        // The iterator should start on the Sunday before March 1st. March 1st, 2023 was a Wednesday.
        // So, Sunday before that would be February 26th, 2023.
        Calendar firstDay = iterator.next();
        assertEquals(Calendar.FEBRUARY, firstDay.get(Calendar.MONTH));
        assertEquals(26, firstDay.get(Calendar.DAY_OF_MONTH));
        assertEquals(2023, firstDay.get(Calendar.YEAR));
        assertEquals(0, firstDay.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, firstDay.get(Calendar.MINUTE));
        assertEquals(0, firstDay.get(Calendar.SECOND));
        assertEquals(0, firstDay.get(Calendar.MILLISECOND));

        // The iterator should end on the Saturday after March 31st. March 31st, 2023 was a Friday.
        // So, Saturday after that would be April 1st, 2023.
        Calendar lastDay = null;
        while (iterator.hasNext()) {
            lastDay = iterator.next();
        }
        assertEquals(Calendar.APRIL, lastDay.get(Calendar.MONTH));
        assertEquals(1, lastDay.get(Calendar.DAY_OF_MONTH));
        assertEquals(2023, lastDay.get(Calendar.YEAR));
        assertEquals(0, lastDay.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, lastDay.get(Calendar.MINUTE));
        assertEquals(0, lastDay.get(Calendar.SECOND));
        assertEquals(0, lastDay.get(Calendar.MILLISECOND));
    }

    @Test
    public void testGetFragmentInMilliseconds() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 15);
        cal.set(Calendar.MILLISECOND, 538);
        Date date = cal.getTime();

        // Fragment: SECOND
        assertEquals(538, DateUtils.getFragmentInMilliseconds(date, Calendar.SECOND));

        // Fragment: MINUTE
        // 15 seconds * 1000 ms/sec + 538 ms
        assertEquals(15538, DateUtils.getFragmentInMilliseconds(date, Calendar.MINUTE));
    }

    @Test
    public void testGetFragmentInSeconds() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 15);
        cal.set(Calendar.MILLISECOND, 538);
        Date date = cal.getTime();

        // Fragment: MINUTE
        assertEquals(15, DateUtils.getFragmentInSeconds(date, Calendar.MINUTE));

        // Fragment: HOUR_OF_DAY
        // 30 minutes * 60 sec/min + 15 seconds
        assertEquals(1815, DateUtils.getFragmentInSeconds(date, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testGetFragmentInMinutes() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 15);
        Date date = cal.getTime();

        // Fragment: HOUR_OF_DAY
        assertEquals(30, DateUtils.getFragmentInMinutes(date, Calendar.HOUR_OF_DAY));

        // Fragment: DAY_OF_YEAR (assuming it's the 74th day of 2023 - March 15th)
        // 10 hours * 60 min/hour + 30 minutes
        assertEquals(630, DateUtils.getFragmentInMinutes(date, Calendar.DAY_OF_YEAR));
    }

    @Test
    public void testGetFragmentInHours() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 15);
        Date date = cal.getTime();

        // Fragment: DAY_OF_YEAR (March 15th is the 74th day of 2023)
        assertEquals(10, DateUtils.getFragmentInHours(date, Calendar.DAY_OF_YEAR));

        // Fragment: MONTH (March 15th)
        // The code calculates (days_in_month * MILLIS_PER_DAY) / MILLIS_PER_HOUR
        // So for March 15th, it should be: (15 * 24) = 360 hours within the month.
        // The reference code's calculation for MONTH fragment seems to be based on DAY_OF_MONTH.
        // It adds (calendar.get(Calendar.DAY_OF_MONTH) * MILLIS_PER_DAY) / millisPerUnit to result.
        // For DAY_OF_MONTH with unit HOUR_OF_DAY: (15 * 24 * 60 * 60 * 1000) / (60 * 60 * 1000) = 15 * 24 = 360
        // Then it adds (calendar.get(Calendar.HOUR_OF_DAY) * MILLIS_PER_HOUR) / millisPerUnit
        // which is (10 * MILLIS_PER_HOUR) / MILLIS_PER_HOUR = 10
        // Total: 360 + 10 = 370
        assertEquals(370, DateUtils.getFragmentInHours(date, Calendar.MONTH));
    }

    @Test
    public void testGetFragmentInDays() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.MARCH, 15, 10, 30, 15); // March 15th
        Date date = cal.getTime();

        // Fragment: MONTH
        // For Calendar.MONTH fragment and Calendar.DAY_OF_YEAR unit, it uses DAY_OF_MONTH.
        assertEquals(15, DateUtils.getFragmentInDays(date, Calendar.MONTH));

        // Fragment: YEAR (March 15th is the 74th day of 2023)
        assertEquals(74, DateUtils.getFragmentInDays(date, Calendar.YEAR));
    }

    @Test
    public void testTruncatedEquals_Calendar() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2023, Calendar.MARCH, 15, 10, 30, 0);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2023, Calendar.MARCH, 15, 12, 0, 0);

        Calendar cal3 = Calendar.getInstance();
        cal3.set(2023, Calendar.MARCH, 16, 10, 30, 0);

        assertTrue(DateUtils.truncatedEquals(cal1, cal2, Calendar.HOUR_OF_DAY)); // Same day, different hour
        assertFalse(DateUtils.truncatedEquals(cal1, cal3, Calendar.HOUR_OF_DAY)); // Different day
        
        // Test for DAY_OF_YEAR, expecting false if days differ
        assertFalse(DateUtils.truncatedEquals(cal1, cal3, Calendar.DAY_OF_YEAR)); 
        // Test for DAY_OF_YEAR, expecting true if days are the same
        assertTrue(DateUtils.truncatedEquals(cal1, cal2, Calendar.DAY_OF_YEAR)); 
    }

    @Test
    public void testTruncatedEquals_Date() {
        Date date1 = new Date(1678886400000L); // March 15, 2023 12:00:00 AM GMT
        Date date2 = new Date(1678900000000L); // March 15, 2023 ~4:00 AM GMT
        Date date3 = new Date(1678972800000L); // March 16, 2023 12:00:00 AM GMT

        assertTrue(DateUtils.truncatedEquals(date1, date2, Calendar.DAY_OF_MONTH)); // Same day, different time
        assertFalse(DateUtils.truncatedEquals(date1, date3, Calendar.DAY_OF_MONTH)); // Different day
        
        // Test for YEAR, expecting false if years differ
        assertFalse(DateUtils.truncatedEquals(date1, date3, Calendar.YEAR));
        // Test for YEAR, expecting true if years are the same
        assertTrue(DateUtils.truncatedEquals(date1, date2, Calendar.YEAR));
    }

    @Test
    public void testTruncatedCompareTo_Calendar() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2023, Calendar.MARCH, 15, 10, 30, 0);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2023, Calendar.MARCH, 15, 12, 0, 0);

        Calendar cal3 = Calendar.getInstance();
        cal3.set(2023, Calendar.MARCH, 16, 10, 30, 0);

        // Comparing by HOUR_OF_DAY, cal1 and cal2 are on the same day, so they are equal.
        assertEquals(0, DateUtils.truncatedCompareTo(cal1, cal2, Calendar.HOUR_OF_DAY)); 
        
        // Comparing by HOUR_OF_DAY, cal1 is before cal3.
        assertEquals(-1, DateUtils.truncatedCompareTo(cal1, cal3, Calendar.HOUR_OF_DAY)); 
        
        // Comparing by HOUR_OF_DAY, cal3 is after cal1.
        assertEquals(1, DateUtils.truncatedCompareTo(cal3, cal1, Calendar.HOUR_OF_DAY));
        
        // Comparing by DAY_OF_YEAR, cal1 and cal2 are on the same day, so they are equal.
        assertEquals(0, DateUtils.truncatedCompareTo(cal1, cal2, Calendar.DAY_OF_YEAR)); 
        
        // Comparing by DAY_OF_YEAR, cal1 is before cal3.
        assertEquals(-1, DateUtils.truncatedCompareTo(cal1, cal3, Calendar.DAY_OF_YEAR)); 
    }

    @Test
    public void testTruncatedCompareTo_Date() {
        Date date1 = new Date(1678886400000L); // March 15, 2023 12:00:00 AM GMT
        Date date2 = new Date(1678900000000L); // March 15, 2023 ~4:00 AM GMT
        Date date3 = new Date(1678972800000L); // March 16, 2023 12:00:00 AM GMT

        // Comparing by DAY_OF_MONTH, date1 and date2 are on the same day, so they are equal.
        assertEquals(0, DateUtils.truncatedCompareTo(date1, date2, Calendar.DAY_OF_MONTH)); 
        
        // Comparing by DAY_OF_MONTH, date1 is before date3.
        assertEquals(-1, DateUtils.truncatedCompareTo(date1, date3, Calendar.DAY_OF_MONTH)); 
        
        // Comparing by DAY_OF_MONTH, date3 is after date1.
        assertEquals(1, DateUtils.truncatedCompareTo(date3, date1, Calendar.DAY_OF_MONTH));
        
        // Comparing by YEAR, date1 and date2 are in the same year, so they are equal.
        assertEquals(0, DateUtils.truncatedCompareTo(date1, date2, Calendar.YEAR));
        
        // Comparing by YEAR, date1 is before date3.
        assertEquals(-1, DateUtils.truncatedCompareTo(date1, date3, Calendar.YEAR));
    }
}
