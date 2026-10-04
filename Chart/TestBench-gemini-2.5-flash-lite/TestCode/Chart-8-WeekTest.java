package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class WeekTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorWithWeekAndYear() throws Exception {
        Week week = new Week(10, 2023);
        assertEquals(10, week.getWeek());
        assertEquals(2023, week.getYearValue());
    }

    @Test
    public void testConstructorWithWeekAndYearObject() throws Exception {
        Year year = new Year(2024);
        Week week = new Week(20, year);
        assertEquals(20, week.getWeek());
        assertEquals(2024, week.getYearValue());
    }

    @Test
    public void testConstructorWithDate() throws Exception {
        // A date in the middle of a week
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 15, 12, 0, 0); // Sunday, Oct 15, 2023
        Date date = cal.getTime();
        Week week = new Week(date);
        // Based on GregorianCalendar, Oct 15, 2023 falls into week 41.
        assertEquals(41, week.getWeek()); 
        assertEquals(2023, week.getYearValue());
    }

    @Test
    public void testConstructorWithDateTimeZoneAndLocale() throws Exception {
        // A date in the middle of a week, with explicit timezone and locale
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.UK);
        cal.set(2023, Calendar.OCTOBER, 15, 12, 0, 0); // Sunday, Oct 15, 2023
        Date date = cal.getTime();
        Week week = new Week(date, TimeZone.getTimeZone("GMT"), Locale.UK);
        // For GMT/UK locale, Oct 15, 2023 falls into week 41.
        assertEquals(41, week.getWeek()); 
        assertEquals(2023, week.getYearValue());
    }
    
    @Test
    public void testConstructorWithDateInFirstWeekOfNextYear() throws Exception {
        // A date that falls into the first week of the *next* year according to GregorianCalendar rules
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.DECEMBER, 31, 12, 0, 0); // Sunday, Dec 31, 2023
        Date date = cal.getTime();
        Week week = new Week(date);
        // Dec 31, 2023 is a Sunday, and according to GregorianCalendar, it's the first day of week 1 of 2024.
        assertEquals(1, week.getWeek());
        assertEquals(2024, week.getYearValue());
    }

    @Test
    public void testConstructorWithDateInLastWeekOfPreviousYear() throws Exception {
        // A date that falls into the last week of the *previous* year according to GregorianCalendar rules
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JANUARY, 1, 12, 0, 0); // Sunday, Jan 1, 2023
        Date date = cal.getTime();
        Week week = new Week(date);
        // Jan 1, 2023 is a Sunday. If the week starts on Sunday, it's week 1 of 2023.
        // However, the GregorianCalendar rule can also place the first few days of the year
        // into the last week of the previous year. For 2023, Jan 1st is in week 52 of 2022.
        assertEquals(52, week.getWeek()); 
        assertEquals(2022, week.getYearValue());
    }

    @Test
    public void testGetYear() throws Exception {
        Week week = new Week(10, 2023);
        Year year = week.getYear();
        assertEquals(2023, year.getYear());
    }

    @Test
    public void testGetWeek() throws Exception {
        Week week = new Week(10, 2023);
        assertEquals(10, week.getWeek());
    }

    @Test
    public void testGetFirstMillisecond() throws Exception {
        Week week = new Week(1, 2023); // Week 1 of 2023
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.UK);
        // Week 1 of 2023, using GMT/UK which starts week on Monday.
        // Jan 1st 2023 was a Sunday, so week 1 started on Monday, December 26th, 2022.
        cal.set(2022, Calendar.DECEMBER, 26, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        assertEquals(cal.getTimeInMillis(), week.getFirstMillisecond());
    }

    @Test
    public void testGetLastMillisecond() throws Exception {
        Week week = new Week(1, 2023); // Week 1 of 2023
        // The last millisecond of week 1 of 2023. This would be the day before week 2 starts.
        // Week 1 started Dec 26, 2022. Week 2 starts Jan 2, 2023. So it ends Jan 1, 2023 23:59:59.999
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.UK);
        cal.set(2023, Calendar.JANUARY, 1, 23, 59, 59);
        cal.set(Calendar.MILLISECOND, 999);
        assertEquals(cal.getTimeInMillis(), week.getLastMillisecond());
    }

    @Test
    public void testPeg() throws Exception {
        Week week = new Week(10, 2023);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.UK);
        cal.set(2023, Calendar.OCTOBER, 10, 12, 0, 0); // A date within week 10, Oct 10 is a Tuesday
        week.peg(cal);
        // The first millisecond should be calculated based on this calendar, starting on Monday of that week.
        Calendar expectedCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.UK);
        expectedCal.clear();
        expectedCal.set(Calendar.YEAR, 2023);
        expectedCal.set(Calendar.WEEK_OF_YEAR, 10);
        expectedCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); // First day of week for GMT/UK
        expectedCal.set(Calendar.HOUR_OF_DAY, 0);
        expectedCal.set(Calendar.MINUTE, 0);
        expectedCal.set(Calendar.SECOND, 0);
        expectedCal.set(Calendar.MILLISECOND, 0);
        assertEquals(expectedCal.getTimeInMillis(), week.getFirstMillisecond());
    }

    @Test
    public void testPrevious() throws Exception {
        Week week = new Week(10, 2023);
        RegularTimePeriod prev = week.previous();
        assertTrue(prev instanceof Week);
        Week prevWeek = (Week) prev;
        assertEquals(9, prevWeek.getWeek());
        assertEquals(2023, prevWeek.getYearValue());
    }

    @Test
    public void testPreviousOnFirstWeek() throws Exception {
        Week week = new Week(1, 2023); // Week 1 of 2023
        RegularTimePeriod prev = week.previous();
        assertTrue(prev instanceof Week);
        Week prevWeek = (Week) prev;
        // Week 1 of 2023 (using GMT/UK locale) started on Dec 26, 2022. So previous week is week 52 of 2022.
        assertEquals(52, prevWeek.getWeek());
        assertEquals(2022, prevWeek.getYearValue());
    }
    
    @Test
    public void testPreviousAtLowerLimit() throws Exception {
        Week week = new Week(1, 1900); // Week 1 of 1900, the minimum year
        RegularTimePeriod prev = week.previous();
        assertNull(prev); // Should return null
    }

    @Test
    public void testNext() throws Exception {
        Week week = new Week(10, 2023);
        RegularTimePeriod next = week.next();
        assertTrue(next instanceof Week);
        Week nextWeek = (Week) next;
        assertEquals(11, nextWeek.getWeek());
        assertEquals(2023, nextWeek.getYearValue());
    }

    @Test
    public void testNextOnWeek52() throws Exception {
        Week week = new Week(52, 2023); // Week 52 of 2023
        RegularTimePeriod next = week.next();
        assertTrue(next instanceof Week);
        Week nextWeek = (Week) next;
        // 2023 has 52 weeks in most standard calendars.
        // The code checks against `getActualMaximum(Calendar.WEEK_OF_YEAR)`.
        // For 2023, it's 52 weeks. So the next week should be week 1 of 2024.
        assertEquals(1, nextWeek.getWeek());
        assertEquals(2024, nextWeek.getYearValue());
    }
    
    @Test
    public void testNextOnWeek53() throws Exception {
        Week week = new Week(53, 2023); // Week 53 of 2023
        RegularTimePeriod next = week.next();
        assertTrue(next instanceof Week);
        Week nextWeek = (Week) next;
        // If week 53 exists in 2023 (which it does not according to common cal),
        // then the next week would be week 1 of 2024.
        // However, `next()` method's logic for week 53 implies it's the last week of the year.
        // If year 2023 does not have week 53 (which is typical), and we create `new Week(53, 2023)`
        // this might lead to an edge case. The actual behavior depends on `getActualMaximum`.
        // For 2023, getActualMaximum(Calendar.WEEK_OF_YEAR) is 52.
        // So, if week is 52, next is week 1 of 2024.
        // If we force `new Week(53, 2023)`, the `next()` method will see `this.week < 52` is false.
        // Then it checks `this.week < actualMaxWeek`. If actualMaxWeek is 52, this is false.
        // Then it checks `this.year < 9999`, which is true, so it returns `new Week(1, this.year + 1)`.
        assertEquals(1, nextWeek.getWeek());
        assertEquals(2024, nextWeek.getYearValue());
    }

    @Test
    public void testNextAtUpperLimit() throws Exception {
        Week week = new Week(53, 9999); // Week 53 of 9999, the maximum year
        RegularTimePeriod next = week.next();
        assertNull(next); // Should return null
    }

    @Test
    public void testGetSerialIndex() throws Exception {
        Week week = new Week(10, 2023);
        // Serial index is year * 53 + week
        assertEquals(2023L * 53L + 10L, week.getSerialIndex());
    }

    @Test
    public void testToString() throws Exception {
        Week week = new Week(10, 2023);
        assertEquals("Week 10, 2023", week.toString());
    }

    @Test
    public void testEqualsSameWeek() throws Exception {
        Week week1 = new Week(10, 2023);
        Week week2 = new Week(10, 2023);
        assertTrue(week1.equals(week2));
    }

    @Test
    public void testEqualsDifferentWeek() throws Exception {
        Week week1 = new Week(10, 2023);
        Week week2 = new Week(11, 2023);
        assertFalse(week1.equals(week2));
    }

    @Test
    public void testEqualsDifferentYear() throws Exception {
        Week week1 = new Week(10, 2023);
        Week week2 = new Week(10, 2024);
        assertFalse(week1.equals(week2));
    }

    @Test
    public void testEqualsDifferentObject() throws Exception {
        Week week = new Week(10, 2023);
        assertFalse(week.equals(new Object()));
    }

    @Test
    public void testEqualsNull() throws Exception {
        Week week = new Week(10, 2023);
        assertFalse(week.equals(null));
    }

    @Test
    public void testHashCode() throws Exception {
        Week week1 = new Week(10, 2023);
        Week week2 = new Week(10, 2023);
        assertEquals(week1.hashCode(), week2.hashCode());
    }

    @Test
    public void testHashCodeDifferent() throws Exception {
        Week week1 = new Week(10, 2023);
        Week week2 = new Week(11, 2023);
        assertNotEquals(week1.hashCode(), week2.hashCode());
    }

    @Test
    public void testCompareToSameWeek() throws Exception {
        Week week1 = new Week(10, 2023);
        Week week2 = new Week(10, 2023);
        assertEquals(0, week1.compareTo(week2));
    }

    @Test
    public void testCompareToBefore() throws Exception {
        Week week1 = new Week(10, 2023);
        Week week2 = new Week(11, 2023);
        assertTrue(week1.compareTo(week2) < 0);
    }

    @Test
    public void testCompareToAfter() throws Exception {
        Week week1 = new Week(11, 2023);
        Week week2 = new Week(10, 2023);
        assertTrue(week1.compareTo(week2) > 0);
    }
    
    @Test
    public void testCompareToDifferentYearBefore() throws Exception {
        Week week1 = new Week(10, 2023);
        Week week2 = new Week(10, 2024);
        assertTrue(week1.compareTo(week2) < 0);
    }

    @Test
    public void testCompareToDifferentYearAfter() throws Exception {
        Week week1 = new Week(10, 2024);
        Week week2 = new Week(10, 2023);
        assertTrue(week1.compareTo(week2) > 0);
    }

    @Test
    public void testParseWeekValidFormat1() throws Exception {
        Week week = Week.parseWeek("2023-W10");
        assertNotNull(week);
        assertEquals(2023, week.getYearValue());
        assertEquals(10, week.getWeek());
    }

    @Test
    public void testParseWeekValidFormat2() throws Exception {
        Week week = Week.parseWeek("W10-2023");
        assertNotNull(week);
        assertEquals(2023, week.getYearValue());
        assertEquals(10, week.getWeek());
    }

    @Test
    public void testParseWeekWithSpaces() throws Exception {
        Week week = Week.parseWeek(" 2023 - W10 ");
        assertNotNull(week);
        assertEquals(2023, week.getYearValue());
        assertEquals(10, week.getWeek());
    }
    
    @Test
    public void testParseWeekWithCommaSeparator() throws Exception {
        Week week = Week.parseWeek("2023,10");
        assertNotNull(week);
        assertEquals(2023, week.getYearValue());
        assertEquals(10, week.getWeek());
    }

    @Test
    public void testParseWeekWithDotSeparator() throws Exception {
        Week week = Week.parseWeek("2023.10");
        assertNotNull(week);
        assertEquals(2023, week.getYearValue());
        assertEquals(10, week.getWeek());
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekInvalidFormatMissingSeparator() throws Exception {
        Week.parseWeek("2023W10");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekInvalidFormatBadYear() throws Exception {
        Week.parseWeek("XYZ-W10");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekInvalidFormatBadWeek() throws Exception {
        Week.parseWeek("2023-WXX");
    }
    
    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekInvalidFormatWeekOutOfRangeLow() throws Exception {
        Week.parseWeek("2023-W0");
    }
    
    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekInvalidFormatWeekOutOfRangeHigh() throws Exception {
        Week.parseWeek("2023-W54");
    }

    @Test
    public void testParseWeekNullInput() throws Exception {
        assertNull(Week.parseWeek(null));
    }
    
    @Test
    public void testFirstWeekInYearConstant() throws Exception {
        assertEquals(1, Week.FIRST_WEEK_IN_YEAR);
    }

    @Test
    public void testLastWeekInYearConstant() throws Exception {
        assertEquals(53, Week.LAST_WEEK_IN_YEAR);
    }
    
    @Test
    public void testWeek1Year1900Previous() throws Exception {
        Week week = new Week(1, 1900);
        assertNull(week.previous());
    }
    
    @Test
    public void testWeek53Year9999Next() throws Exception {
        Week week = new Week(53, 9999);
        assertNull(week.next());
    }

    @Test
    public void testWeekConstructorInvalidRangeLow() {
        try {
            new Week(0, 2023);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testWeekConstructorInvalidRangeHigh() {
        try {
            new Week(54, 2023);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testWeekConstructorYearObjectInvalidRangeLow() {
        try {
            new Week(0, new Year(2023));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testWeekConstructorYearObjectInvalidRangeHigh() {
        try {
            new Week(54, new Year(2023));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
}
