```java
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

    //-----------------------------------------------------------------------
    @Test
    public void testIsSameDay_Date_True() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH, 28);
        cal.set(Calendar.HOUR_OF_DAY, 13);
        cal.set(Calendar.MINUTE, 45);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date1 = cal.getTime();

        cal.set(Calendar.HOUR_OF_DAY, 6);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 1);
        cal.set(Calendar.MILLISECOND, 1);
        Date date2 = cal.getTime();
        
        assertTrue(DateUtils.isSameDay(date1, date2));
    }

    @Test
    public void testIsSameDay_Date_False() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2002);
        cal1.set(Calendar.MONTH, Calendar.MARCH);
        cal1.set(Calendar.DAY_OF_MONTH, 28);
        cal1.set(Calendar.HOUR_OF_DAY, 13);
        cal1.set(Calendar.MINUTE, 45);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MILLISECOND, 0);
        Date date1 = cal1.getTime();

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, 2002);
        cal2.set(Calendar.MONTH, Calendar.MARCH);
        cal2.set(Calendar.DAY_OF_MONTH, 12);
        cal2.set(Calendar.HOUR_OF_DAY, 13);
        cal2.set(Calendar.MINUTE, 45);
        cal2.set(Calendar.SECOND, 0);
        cal2.set(Calendar.MILLISECOND, 0);
        Date date2 = cal2.getTime();
        
        assertFalse(DateUtils.isSameDay(date1, date2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_Null1() {
        Date date2 = new Date();
        DateUtils.isSameDay(null, date2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Date_Null2() {
        Date date1 = new Date();
        DateUtils.isSameDay(date1, null);
    }

    @Test
    public void testIsSameDay_Calendar_True() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2002);
        cal1.set(Calendar.MONTH, Calendar.MARCH);
        cal1.set(Calendar.DAY_OF_YEAR, 87);
        cal1.set(Calendar.HOUR_OF_DAY, 13);
        cal1.set(Calendar.MINUTE, 45);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, 2002);
        cal2.set(Calendar.MONTH, Calendar.MARCH);
        cal2.set(Calendar.DAY_OF_YEAR, 87);
        cal2.set(Calendar.HOUR_OF_DAY, 6);
        cal2.set(Calendar.MINUTE, 0);
        cal2.set(Calendar.SECOND, 1);
        cal2.set(Calendar.MILLISECOND, 1);
        
        assertTrue(DateUtils.isSameDay(cal1, cal2));
    }

    @Test
    public void testIsSameDay_Calendar_False() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2002);
        cal1.set(Calendar.MONTH, Calendar.MARCH);
        cal1.set(Calendar.DAY_OF_YEAR, 87);
        cal1.set(Calendar.HOUR_OF_DAY, 13);
        cal1.set(Calendar.MINUTE, 45);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, 2002);
        cal2.set(Calendar.MONTH, Calendar.MARCH);
        cal2.set(Calendar.DAY_OF_YEAR, 75);
        cal2.set(Calendar.HOUR_OF_DAY, 13);
        cal2.set(Calendar.MINUTE, 45);
        cal2.set(Calendar.SECOND, 0);
        cal2.set(Calendar.MILLISECOND, 0);
        
        assertFalse(DateUtils.isSameDay(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_Null1() {
        Calendar cal2 = Calendar.getInstance();
        DateUtils.isSameDay(null, cal2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendar_Null2() {
        Calendar cal1 = Calendar.getInstance();
        DateUtils.isSameDay(cal1, null);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsSameInstant_Date_True() {
        Date date1 = new Date(1000000L);
        Date date2 = new Date(1000000L);
        assertTrue(DateUtils.isSameInstant(date1, date2));
    }

    @Test
    public void testIsSameInstant_Date_False() {
        Date date1 = new Date(1000000L);
        Date date2 = new Date(1000001L);
        assertFalse(DateUtils.isSameInstant(date1, date2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_Null1() {
        Date date2 = new Date();
        DateUtils.isSameInstant(null, date2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Date_Null2() {
        Date date1 = new Date();
        DateUtils.isSameInstant(date1, null);
    }

    @Test
    public void testIsSameInstant_Calendar_True() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(1000000L);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTimeInMillis(1000000L);
        assertTrue(DateUtils.isSameInstant(cal1, cal2));
    }

    @Test
    public void testIsSameInstant_Calendar_False() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(1000000L);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTimeInMillis(1000001L);
        assertFalse(DateUtils.isSameInstant(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_Null1() {
        Calendar cal2 = Calendar.getInstance();
        DateUtils.isSameInstant(null, cal2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_Null2() {
        Calendar cal1 = Calendar.getInstance();
        DateUtils.isSameInstant(cal1, null);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsSameLocalTime_True() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2002);
        cal1.set(Calendar.MONTH, Calendar.MARCH);
        cal1.set(Calendar.DAY_OF_YEAR, 87);
        cal1.set(Calendar.HOUR_OF_DAY, 13);
        cal1.set(Calendar.MINUTE, 45);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, 2002);
        cal2.set(Calendar.MONTH, Calendar.MARCH);
        cal2.set(Calendar.DAY_OF_YEAR, 87);
        cal2.set(Calendar.HOUR_OF_DAY, 13);
        cal2.set(Calendar.MINUTE, 45);
        cal2.set(Calendar.SECOND, 0);
        cal2.set(Calendar.MILLISECOND, 0);
        
        assertTrue(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_False() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2002);
        cal1.set(Calendar.MONTH, Calendar.MARCH);
        cal1.set(Calendar.DAY_OF_YEAR, 87);
        cal1.set(Calendar.HOUR_OF_DAY, 13);
        cal1.set(Calendar.MINUTE, 45);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, 2002);
        cal2.set(Calendar.MONTH, Calendar.MARCH);
        cal2.set(Calendar.DAY_OF_YEAR, 87);
        cal2.set(Calendar.HOUR_OF_DAY, 14);
        cal2.set(Calendar.MINUTE, 45);
        cal2.set(Calendar.SECOND, 0);
        cal2.set(Calendar.MILLISECOND, 0);
        
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Null1() {
        Calendar cal2 = Calendar.getInstance();
        DateUtils.isSameLocalTime(null, cal2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Null2() {
        Calendar cal1 = Calendar.getInstance();
        DateUtils.isSameLocalTime(cal1, null);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testParseDate_Valid() throws ParseException {
        String str = "28/03/2002";
        String[] patterns = {"dd/MM/yyyy"};
        Date expected = new Date();
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        expected.setTime(cal.getTimeInMillis());
        
        assertEquals(expected, DateUtils.parseDate(str, patterns));
    }

    @Test
    public void testParseDate_MultiplePatterns() throws ParseException {
        String str = "2002-03-28";
        String[] patterns = {"dd/MM/yyyy", "yyyy-MM-dd"};
        Date expected = new Date();
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        expected.setTime(cal.getTimeInMillis());
        
        assertEquals(expected, DateUtils.parseDate(str, patterns));
    }

    @Test(expected = ParseException.class)
    public void testParseDate_Invalid() throws ParseException {
        String str = "invalid date";
        String[] patterns = {"dd/MM/yyyy"};
        DateUtils.parseDate(str, patterns);
    }

    @Test(expected = ParseException.class)
    public void testParseDate_Incomplete() throws ParseException {
        String str = "28/03/200"; // Incomplete year
        String[] patterns = {"dd/MM/yyyy"};
        DateUtils.parseDate(str, patterns);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullString() throws ParseException {
        String[] patterns = {"dd/MM/yyyy"};
        DateUtils.parseDate(null, patterns);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullPatterns() throws ParseException {
        String str = "28/03/2002";
        DateUtils.parseDate(str, null);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testAddYears() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addYears(date, 1);
        cal.add(Calendar.YEAR, 1);
        assertEquals(cal.getTime(), result);
    }

    @Test
    public void testAddYears_Negative() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addYears(date, -1);
        cal.add(Calendar.YEAR, -1);
        assertEquals(cal.getTime(), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddYears_NullDate() {
        DateUtils.addYears(null, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testAddMonths() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addMonths(date, 1);
        cal.add(Calendar.MONTH, 1);
        assertEquals(cal.getTime(), result);
    }

    @Test
    public void testAddMonths_Negative() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addMonths(date, -1);
        cal.add(Calendar.MONTH, -1);
        assertEquals(cal.getTime(), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMonths_NullDate() {
        DateUtils.addMonths(null, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testAddWeeks() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addWeeks(date, 1);
        cal.add(Calendar.WEEK_OF_YEAR, 1);
        assertEquals(cal.getTime(), result);
    }

    @Test
    public void testAddWeeks_Negative() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addWeeks(date, -1);
        cal.add(Calendar.WEEK_OF_YEAR, -1);
        assertEquals(cal.getTime(), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddWeeks_NullDate() {
        DateUtils.addWeeks(null, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testAddDays() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addDays(date, 1);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        assertEquals(cal.getTime(), result);
    }

    @Test
    public void testAddDays_Negative() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addDays(date, -1);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        assertEquals(cal.getTime(), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDays_NullDate() {
        DateUtils.addDays(null, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testAddHours() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addHours(date, 1);
        cal.add(Calendar.HOUR_OF_DAY, 1);
        assertEquals(cal.getTime(), result);
    }

    @Test
    public void testAddHours_Negative() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addHours(date, -1);
        cal.add(Calendar.HOUR_OF_DAY, -1);
        assertEquals(cal.getTime(), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddHours_NullDate() {
        DateUtils.addHours(null, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testAddMinutes() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addMinutes(date, 1);
        cal.add(Calendar.MINUTE, 1);
        assertEquals(cal.getTime(), result);
    }

    @Test
    public void testAddMinutes_Negative() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addMinutes(date, -1);
        cal.add(Calendar.MINUTE, -1);
        assertEquals(cal.getTime(), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMinutes_NullDate() {
        DateUtils.addMinutes(null, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testAddSeconds() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addSeconds(date, 1);
        cal.add(Calendar.SECOND, 1);
        assertEquals(cal.getTime(), result);
    }

    @Test
    public void testAddSeconds_Negative() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.addSeconds(date, -1);
        cal.add(Calendar.SECOND, -1);
        assertEquals(cal.getTime(), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddSeconds_NullDate() {
        DateUtils.addSeconds(null, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testAddMilliseconds() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 100);
        Date date = cal.getTime();

        Date result = DateUtils.addMilliseconds(date, 500);
        cal.add(Calendar.MILLISECOND, 500);
        assertEquals(cal.getTime(), result);
    }

    @Test
    public void testAddMilliseconds_Negative() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 100);
        Date date = cal.getTime();

        Date result = DateUtils.addMilliseconds(date, -500);
        cal.add(Calendar.MILLISECOND, -500);
        assertEquals(cal.getTime(), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMilliseconds_NullDate() {
        DateUtils.addMilliseconds(null, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_Calendar_YEAR() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();

        Date result = DateUtils.add(date, Calendar.YEAR, 1);
        cal.add(Calendar.YEAR, 1);
        assertEquals(cal.getTime(), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullDate() {
        DateUtils.add(null, Calendar.YEAR, 1);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testRoundDate_Month() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.APRIL, 1, 0, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.round(date, Calendar.MONTH));
    }
    
    @Test
    public void testRoundDate_SEMI_MONTH_FirstHalf() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 10, 13, 45, 0); // Day 10 is in the first half
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 1, 0, 0, 0); // Rounds down to the 1st
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.round(date, DateUtils.SEMI_MONTH));
    }

    @Test
    public void testRoundDate_SEMI_MONTH_SecondHalf() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 20, 13, 45, 0); // Day 20 is in the second half
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.APRIL, 1, 0, 0, 0); // Rounds up to the 1st of next month
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.round(date, DateUtils.SEMI_MONTH));
    }

    @Test
    public void testRoundDate_Hour() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 28, 14, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.round(date, Calendar.HOUR_OF_DAY));
    }
    
    @Test
    public void testRoundDate_Minute() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 30);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 28, 13, 46, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.round(date, Calendar.MINUTE));
    }

    @Test
    public void testRoundDate_Second() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 30);
        cal.set(Calendar.MILLISECOND, 500);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 28, 13, 45, 31);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.round(date, Calendar.SECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundDate_NullDate() {
        DateUtils.round((Date) null, Calendar.MONTH);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testRoundCalendar_Month() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 123);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.APRIL, 1, 0, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertEquals(expectedCal, DateUtils.round(cal, Calendar.MONTH));
    }
    
    @Test
    public void testRoundCalendar_SEMI_MONTH_FirstHalf() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 10, 13, 45, 0); // Day 10 is in the first half
        cal.set(Calendar.MILLISECOND, 0);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 1, 0, 0, 0); // Rounds down to the 1st
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertEquals(expectedCal, DateUtils.round(cal, DateUtils.SEMI_MONTH));
    }

    @Test
    public void testRoundCalendar_SEMI_MONTH_SecondHalf() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 20, 13, 45, 0); // Day 20 is in the second half
        cal.set(Calendar.MILLISECOND, 0);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.APRIL, 1, 0, 0, 0); // Rounds up to the 1st of next month
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertEquals(expectedCal, DateUtils.round(cal, DateUtils.SEMI_MONTH));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundCalendar_NullDate() {
        DateUtils.round((Calendar) null, Calendar.MONTH);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testRoundObject_Date() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.APRIL, 1, 0, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.round(date, Calendar.MONTH));
    }

    @Test
    public void testRoundObject_Calendar() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 123);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.APRIL, 1, 0, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertEquals(expectedCal.getTime(), DateUtils.round(cal, Calendar.MONTH));
    }
    
    @Test(expected = ClassCastException.class)
    public void testRoundObject_String() {
        DateUtils.round("invalid date", Calendar.MONTH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundObject_Null() {
        DateUtils.round(null, Calendar.MONTH);
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void testTruncateDate_Month() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 1, 0, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.truncate(date, Calendar.MONTH));
    }
    
    @Test
    public void testTruncateDate_SEMI_MONTH_FirstHalf() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 10, 13, 45, 0); // Day 10 is in the first half
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 1, 0, 0, 0); // Truncates to the 1st
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.truncate(date, DateUtils.SEMI_MONTH));
    }
    
    @Test
    public void testTruncateDate_SEMI_MONTH_SecondHalf() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 20, 13, 45, 0); // Day 20 is in the second half
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 16, 0, 0, 0); // Truncates to the 16th (start of second half)
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.truncate(date, DateUtils.SEMI_MONTH));
    }

    @Test
    public void testTruncateDate_Hour() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 28, 13, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.truncate(date, Calendar.HOUR_OF_DAY));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateDate_NullDate() {
        DateUtils.truncate((Date) null, Calendar.MONTH);
    }
    
    //-----------------------------------------------------------------------
    @Test
    public void testTruncateCalendar_Month() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 123);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 1, 0, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertEquals(expectedCal, DateUtils.truncate(cal, Calendar.MONTH));
    }
    
    @Test
    public void testTruncateCalendar_SEMI_MONTH_FirstHalf() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 10, 13, 45, 0); // Day 10 is in the first half
        cal.set(Calendar.MILLISECOND, 0);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 1, 0, 0, 0); // Truncates to the 1st
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertEquals(expectedCal, DateUtils.truncate(cal, DateUtils.SEMI_MONTH));
    }
    
    @Test
    public void testTruncateCalendar_SEMI_MONTH_SecondHalf() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 20, 13, 45, 0); // Day 20 is in the second half
        cal.set(Calendar.MILLISECOND, 0);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 16, 0, 0, 0); // Truncates to the 16th (start of second half)
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertEquals(expectedCal, DateUtils.truncate(cal, DateUtils.SEMI_MONTH));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateCalendar_NullDate() {
        DateUtils.truncate((Calendar) null, Calendar.MONTH);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testTruncateObject_Date() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 123);
        Date date = cal.getTime();
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 1, 0, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.truncate(date, Calendar.MONTH));
    }

    @Test
    public void testTruncateObject_Calendar() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 123);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 1, 0, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertEquals(expectedCal.getTime(), DateUtils.truncate(cal, Calendar.MONTH));
    }
    
    @Test(expected = ClassCastException.class)
    public void testTruncateObject_String() {
        DateUtils.truncate("invalid date", Calendar.MONTH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateObject_Null() {
        DateUtils.truncate(null, Calendar.MONTH);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIterator_Date_RangeMonthSunday() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.JULY, 4, 13, 45, 0); // Thursday, July 4, 2002
        cal.set(Calendar.MILLISECOND, 0);
        Date focus = cal.getTime();
        
        Iterator iterator = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_SUNDAY);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.JUNE, 30, 0, 0, 0); // Sunday, June 30, 2002
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        
        expectedCal.set(2002, Calendar.JULY, 1, 0, 0, 0); // Monday, July 1, 2002
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());

        // ... continue until Saturday, August 3, 2002
        // The loop below will iterate through the days, skipping the first two.
        // We need to advance iterator.next() a total of 31 times to get to Aug 3.
        // The first two calls to next() are already made. So, 29 more calls are needed.
        for (int i = 0; i < 29; i++) { 
            iterator.next();
        }

        expectedCal.set(2002, Calendar.AUGUST, 3, 0, 0, 0); // Saturday, August 3, 2002
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterator_Date_RangeWeekMonday() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.JULY, 4, 13, 45, 0); // Thursday, July 4, 2002
        cal.set(Calendar.MILLISECOND, 0);
        Date focus = cal.getTime();
        
        Iterator iterator = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_MONDAY);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.JULY, 1, 0, 0, 0); // Monday, July 1, 2002
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        
        expectedCal.set(2002, Calendar.JULY, 2, 0, 0, 0); // Tuesday, July 2, 2002
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        
        // ... advance to Sunday, July 7, 2002
        // We've already called next() twice, so we need 5 more calls to reach Sunday.
        for (int i = 0; i < 5; i++) {
            iterator.next();
        }
        
        expectedCal.set(2002, Calendar.JULY, 7, 0, 0, 0); // Sunday, July 7, 2002
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        assertFalse(iterator.hasNext());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Date_NullFocus() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_MONTH_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Date_InvalidRangeStyle() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.JULY, 4, 13, 45, 0);
        Date focus = cal.getTime();
        DateUtils.iterator(focus, 99); // Invalid range style
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIterator_Calendar_RangeWeekRelative() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.JULY, 4, 13, 45, 0); // Thursday, July 4, 2002
        cal.set(Calendar.MILLISECOND, 0);
        
        Iterator iterator = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_RELATIVE);
        
        // Start of the week relative to Thursday: Thursday itself
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.JULY, 4, 0, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        
        expectedCal.set(2002, Calendar.JULY, 5, 0, 0, 0); // Friday, July 5, 2002
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        
        // ... advance to Wednesday, July 10, 2002 (end of week relative)
        // We've already called next() twice, so we need 7 more calls.
        for (int i = 0; i < 7; i++) {
            iterator.next();
        }
        
        expectedCal.set(2002, Calendar.JULY, 10, 0, 0, 0); // Wednesday, July 10, 2002
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterator_Calendar_RangeWeekCenter() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.JULY, 4, 13, 45, 0); // Thursday, July 4, 2002
        cal.set(Calendar.MILLISECOND, 0);
        
        Iterator iterator = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_CENTER);
        
        // Start of the week centered around Thursday: Monday (Thursday - 3 days)
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.JULY, 1, 0, 0, 0); // Monday, July 1, 2002
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        
        expectedCal.set(2002, Calendar.JULY, 2, 0, 0, 0); // Tuesday, July 2, 2002
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        
        // ... advance to Sunday, July 7, 2002 (end of week centered)
        // We've already called next() twice, so we need 5 more calls.
        for (int i = 0; i < 5; i++) {
            iterator.next();
        }
        
        expectedCal.set(2002, Calendar.JULY, 7, 0, 0, 0); // Sunday, July 7, 2002
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
        assertFalse(iterator.hasNext());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Calendar_NullFocus() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_MONTH_MONDAY);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIterator_Object_Date() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.JULY, 4, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date focus = cal.getTime();
        
        Iterator iterator = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_SUNDAY);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.JUNE, 30, 0, 0, 0); // Sunday, June 30, 2002
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
    }

    @Test
    public void testIterator_Object_Calendar() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.JULY, 4, 13, 45, 0);
        cal.set(Calendar.MILLISECOND, 0);
        
        Iterator iterator = DateUtils.iterator(cal, DateUtils.RANGE_MONTH_MONDAY);
        
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.JULY, 1, 0, 0, 0); // Monday, July 1, 2002
        expectedCal.set(Calendar.MILLISECOND, 0);
        
        assertTrue(iterator.hasNext());
        assertEquals(expectedCal.getTime(), ((Calendar) iterator.next()).getTime());
    }

    @Test(expected = ClassCastException.class)
    public void testIterator_Object_String() {
        DateUtils.iterator("invalid date", DateUtils.RANGE_MONTH_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Object_Null() {
        DateUtils.iterator(null, DateUtils.RANGE_MONTH_SUNDAY);
    }

    //-----------------------------------------------------------------------
    // Test for DateIterator inner class - not directly public API, but used by public methods.
    // Testing the public iterator() methods above covers its functionality.

    //-----------------------------------------------------------------------
    // Test for fix for LANG-59 within modify method
    @Test
    public void testModify_LANG59_RoundSeconds() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 30); // 30 seconds
        cal.set(Calendar.MILLISECOND, 500); // 500 milliseconds
        Date date = cal.getTime();
        
        // Expecting rounding up to the next minute
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 28, 13, 46, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.round(date, Calendar.SECOND));
    }
    
    @Test
    public void testModify_LANG59_TruncateSeconds() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 30); // 30 seconds
        cal.set(Calendar.MILLISECOND, 499); // 499 milliseconds
        Date date = cal.getTime();
        
        // Expecting truncation of milliseconds
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 28, 13, 45, 30);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.truncate(date, Calendar.SECOND));
    }

    @Test
    public void testModify_LANG59_RoundMinutes() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 30); // 45 minutes
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        // Expecting rounding up to the next hour
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 28, 14, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.round(date, Calendar.MINUTE));
    }
    
    @Test
    public void testModify_LANG59_TruncateMinutes() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 30); // 45 minutes
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        // Expecting truncation of seconds and milliseconds
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 28, 13, 45, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.truncate(date, Calendar.MINUTE));
    }

    @Test
    public void testModify_LANG59_RoundHours() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 30); // 13 hours
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        // Expecting rounding up to the next hour
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 28, 14, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.round(date, Calendar.HOUR_OF_DAY));
    }
    
    @Test
    public void testModify_LANG59_TruncateHours() {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 28, 13, 45, 30); // 13 hours
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        
        // Expecting truncation of minutes, seconds, and milliseconds
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.set(2002, Calendar.MARCH, 28, 13, 0, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        Date expected = expectedCal.getTime();
        
        assertEquals(expected, DateUtils.truncate(date, Calendar.HOUR_OF_DAY));
    }
}
```