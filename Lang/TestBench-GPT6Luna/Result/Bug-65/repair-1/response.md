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
import java.util.GregorianCalendar;

public class DateUtilsTest {
    @Test
    public void testSameDayIgnoresTime() throws Exception {
        Calendar a = new GregorianCalendar(2020, Calendar.JUNE, 15, 1, 0);
        Calendar b = new GregorianCalendar(2020, Calendar.JUNE, 15, 23, 59);
        assertTrue(DateUtils.isSameDay(a.getTime(), b.getTime()));
    }

    @Test
    public void testSameDayAcrossMidnight() throws Exception {
        Calendar a = new GregorianCalendar(2020, Calendar.JUNE, 15, 23, 59);
        Calendar b = new GregorianCalendar(2020, Calendar.JUNE, 16, 0, 0);
        assertFalse(DateUtils.isSameDay(a.getTime(), b.getTime()));
    }

    @Test
    public void testSameInstantEqualDates() throws Exception {
        assertTrue(DateUtils.isSameInstant(new Date(123456789L), new Date(123456789L)));
    }

    @Test
    public void testSameInstantDiffersByOneMillisecond() throws Exception {
        assertFalse(DateUtils.isSameInstant(new Date(123456789L), new Date(123456790L)));
    }

    @Test
    public void testSameLocalTimeSameCalendarFields() throws Exception {
        Calendar a = new GregorianCalendar(2020, Calendar.JUNE, 15, 13, 20, 30);
        Calendar b = new GregorianCalendar(2020, Calendar.JUNE, 15, 13, 20, 30);
        a.set(Calendar.MILLISECOND, 123);
        b.set(Calendar.MILLISECOND, 123);
        assertTrue(DateUtils.isSameLocalTime(a, b));
    }

    @Test
    public void testSameLocalTimeDifferentMillisecond() throws Exception {
        Calendar a = new GregorianCalendar(2020, Calendar.JUNE, 15, 13, 20, 30);
        Calendar b = new GregorianCalendar(2020, Calendar.JUNE, 15, 13, 20, 30);
        a.set(Calendar.MILLISECOND, 123);
        b.set(Calendar.MILLISECOND, 124);
        assertFalse(DateUtils.isSameLocalTime(a, b));
    }

    @Test
    public void testParseUsesLaterPatternAfterPartialMatch() throws Exception {
        Date parsed = DateUtils.parseDate("2020-06-15", new String[] {"yyyy/MM/dd", "yyyy-MM-dd"});
        Calendar expected = new GregorianCalendar(2020, Calendar.JUNE, 15);
        assertEquals(expected.getTime(), parsed);
    }

    @Test
    public void testParseRejectsTrailingCharacters() throws Exception {
        try {
            DateUtils.parseDate("2020-06-15x", new String[] {"yyyy-MM-dd"});
            fail("expected ParseException");
        } catch (ParseException expected) { }
    }

    @Test
    public void testAddYearsCarriesLeapDay() throws Exception {
        Calendar start = new GregorianCalendar(2020, Calendar.FEBRUARY, 29, 12, 0);
        Calendar expected = new GregorianCalendar(2021, Calendar.FEBRUARY, 28, 12, 0);
        assertEquals(expected.getTime(), DateUtils.addYears(start.getTime(), 1));
    }

    @Test
    public void testAddMonthsCarriesEndOfMonth() throws Exception {
        Calendar start = new GregorianCalendar(2020, Calendar.JANUARY, 31, 12, 0);
        Calendar expected = new GregorianCalendar(2020, Calendar.FEBRUARY, 29, 12, 0);
        assertEquals(expected.getTime(), DateUtils.addMonths(start.getTime(), 1));
    }

    @Test
    public void testAddWeeksSupportsNegativeAmount() throws Exception {
        Calendar start = new GregorianCalendar(2020, Calendar.JUNE, 15, 12, 0);
        Calendar expected = new GregorianCalendar(2020, Calendar.JUNE, 8, 12, 0);
        assertEquals(expected.getTime(), DateUtils.addWeeks(start.getTime(), -1));
    }

    @Test
    public void testAddDaysAcrossMonthBoundary() throws Exception {
        Calendar start = new GregorianCalendar(2020, Calendar.JANUARY, 31, 12, 0);
        Calendar expected = new GregorianCalendar(2020, Calendar.FEBRUARY, 1, 12, 0);
        assertEquals(expected.getTime(), DateUtils.addDays(start.getTime(), 1));
    }

    @Test
    public void testAddHoursAcrossDayBoundary() throws Exception {
        Calendar start = new GregorianCalendar(2020, Calendar.JUNE, 15, 23, 0);
        Calendar expected = new GregorianCalendar(2020, Calendar.JUNE, 16, 1, 0);
        assertEquals(expected.getTime(), DateUtils.addHours(start.getTime(), 2));
    }

    @Test
    public void testAddMinutesAcrossHourBoundary() throws Exception {
        Calendar start = new GregorianCalendar(2020, Calendar.JUNE, 15, 10, 59);
        Calendar expected = new GregorianCalendar(2020, Calendar.JUNE, 15, 11, 1);
        assertEquals(expected.getTime(), DateUtils.addMinutes(start.getTime(), 2));
    }

    @Test
    public void testAddSecondsAcrossMinuteBoundary() throws Exception {
        Calendar start = new GregorianCalendar(2020, Calendar.JUNE, 15, 10, 20, 59);
        Calendar expected = new GregorianCalendar(2020, Calendar.JUNE, 15, 10, 21, 1);
        assertEquals(expected.getTime(), DateUtils.addSeconds(start.getTime(), 2));
    }

    @Test
    public void testAddMillisecondsAcrossSecondBoundary() throws Exception {
        Date start = new Date(1234L);
        assertEquals(new Date(1235L), DateUtils.addMilliseconds(start, 1));
    }

    @Test
    public void testAddUsesRequestedCalendarField() throws Exception {
        Date start = new Date(0L);
        assertEquals(new Date(2000L), DateUtils.add(start, Calendar.SECOND, 2));
    }

    @Test
    public void testRoundAtMillisecondFieldLeavesInputTime() throws Exception {
        Date value = new Date(1234L);
        assertEquals(value, DateUtils.round(value, Calendar.MILLISECOND));
    }

    @Test
    public void testRoundSecondsAtHalfSecondBoundaryRoundsUp() throws Exception {
        Calendar value = new GregorianCalendar(2020, Calendar.JUNE, 15, 10, 20, 30);
        value.set(Calendar.MILLISECOND, 500);
        Calendar expected = new GregorianCalendar(2020, Calendar.JUNE, 15, 10, 21, 0);
        assertEquals(expected.getTime(), DateUtils.round(value.getTime(), Calendar.MINUTE));
    }

    @Test
    public void testTruncateToHourDropsSmallerFields() throws Exception {
        Calendar value = new GregorianCalendar(2020, Calendar.JUNE, 15, 10, 20, 30);
        value.set(Calendar.MILLISECOND, 456);
        Calendar expected = new GregorianCalendar(2020, Calendar.JUNE, 15, 10, 0, 0);
        assertEquals(expected.getTime(), DateUtils.truncate(value.getTime(), Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testIteratorWeekSundayIncludesSevenDays() throws Exception {
        Calendar focus = new GregorianCalendar(2020, Calendar.JUNE, 17, 12, 0);
        Iterator days = DateUtils.iterator(focus.getTime(), DateUtils.RANGE_WEEK_SUNDAY);
        Calendar first = (Calendar) days.next();
        assertEquals(new GregorianCalendar(2020, Calendar.JUNE, 14).getTime(), first.getTime());
        int count = 1;
        while (days.hasNext()) {
            days.next();
            count++;
        }
        assertEquals(7, count);
    }

    @Test
    public void testIteratorMonthSundaySpansWholeAlignedMonth() throws Exception {
        Calendar focus = new GregorianCalendar(2020, Calendar.JUNE, 15);
        Iterator days = DateUtils.iterator(focus.getTime(), DateUtils.RANGE_MONTH_SUNDAY);
        Calendar first = (Calendar) days.next();
        assertEquals(new GregorianCalendar(2020, Calendar.MAY, 31).getTime(), first.getTime());
        int count = 1;
        while (days.hasNext()) {
            days.next();
            count++;
        }
        assertEquals(35, count);
    }

    @Test
    public void testIteratorRejectsInvalidRangeStyle() throws Exception {
        try {
            DateUtils.iterator(new Date(0L), 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }
}
```