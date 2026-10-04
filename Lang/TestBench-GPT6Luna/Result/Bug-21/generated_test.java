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
    private static Calendar utcCalendar(int year, int month, int day, int hour, int minute, int second, int milli) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        c.clear();
        c.set(year, month, day, hour, minute, second);
        c.set(Calendar.MILLISECOND, milli);
        return c;
    }

    @Test
    public void testSameDayIgnoresTime() throws Exception {
        Date a = utcCalendar(2020, Calendar.JANUARY, 2, 1, 0, 0, 0).getTime();
        Date b = utcCalendar(2020, Calendar.JANUARY, 2, 23, 59, 59, 999).getTime();
        assertTrue(DateUtils.isSameDay(a, b));
    }

    @Test
    public void testSameDayDifferentDate() throws Exception {
        Date a = utcCalendar(2020, Calendar.JANUARY, 2, 12, 0, 0, 0).getTime();
        Date b = utcCalendar(2020, Calendar.JANUARY, 3, 12, 0, 0, 0).getTime();
        assertFalse(DateUtils.isSameDay(a, b));
    }

    @Test
    public void testSameInstant() throws Exception {
        Date a = new Date(123456789L);
        Date b = new Date(123456789L);
        assertTrue(DateUtils.isSameInstant(a, b));
        assertFalse(DateUtils.isSameInstant(a, new Date(123456790L)));
    }

    @Test
    public void testSameLocalTimeAndDifferentMillis() throws Exception {
        Calendar a = utcCalendar(2020, Calendar.JANUARY, 2, 3, 4, 5, 6);
        Calendar b = utcCalendar(2020, Calendar.JANUARY, 2, 3, 4, 5, 6);
        assertTrue(DateUtils.isSameLocalTime(a, b));
        b.set(Calendar.MILLISECOND, 7);
        assertFalse(DateUtils.isSameLocalTime(a, b));
    }

    @Test
    public void testParseDateExactInput() throws Exception {
        Date parsed = DateUtils.parseDate("2020-02-03", "yyyy-MM-dd");
        assertEquals(utcCalendar(2020, Calendar.FEBRUARY, 3, 0, 0, 0, 0).getTime(), parsed);
    }

    @Test
    public void testParseDateRejectsTrailingText() throws Exception {
        try {
            DateUtils.parseDate("2020-02-03x", "yyyy-MM-dd");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(-1, expected.getErrorOffset());
        }
    }

    @Test
    public void testStrictParsingRejectsInvalidDay() throws Exception {
        try {
            DateUtils.parseDateStrictly("2020-02-30", "yyyy-MM-dd");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(-1, expected.getErrorOffset());
        }
    }

    @Test
    public void testLenientParsingNormalizesInvalidDay() throws Exception {
        Date result = DateUtils.parseDate("2020-02-30", "yyyy-MM-dd");
        assertEquals(utcCalendar(2020, Calendar.MARCH, 1, 0, 0, 0, 0).getTime(), result);
    }

    @Test
    public void testAddMonthsAcrossYearBoundary() throws Exception {
        Date input = utcCalendar(2020, Calendar.DECEMBER, 15, 9, 8, 7, 6).getTime();
        assertEquals(utcCalendar(2021, Calendar.JANUARY, 15, 9, 8, 7, 6).getTime(),
                DateUtils.addMonths(input, 1));
    }

    @Test
    public void testAddMillisecondsPositiveAndNegative() throws Exception {
        Date input = new Date(0L);
        assertEquals(new Date(1L), DateUtils.addMilliseconds(input, 1));
        assertEquals(new Date(-1L), DateUtils.addMilliseconds(input, -1));
    }

    @Test
    public void testSetHoursValidEdgeValues() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 5, 6, 7, 8).getTime();
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 0, 6, 7, 8).getTime(),
                DateUtils.setHours(input, 0));
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 23, 6, 7, 8).getTime(),
                DateUtils.setHours(input, 23));
    }

    @Test
    public void testSetHoursRejectsFirstInvalidValue() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 5, 6, 7, 8).getTime();
        try {
            DateUtils.setHours(input, 24);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testToCalendarPreservesInstant() throws Exception {
        Date input = new Date(987654321L);
        assertEquals(input.getTime(), DateUtils.toCalendar(input).getTimeInMillis());
    }

    @Test
    public void testRoundHourUpAtThirtyMinutes() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 3, 30, 0, 0).getTime();
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 4, 0, 0, 0).getTime(),
                DateUtils.round(input, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testRoundHourDownBelowThirtyMinutes() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 3, 29, 59, 999).getTime();
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 3, 0, 0, 0).getTime(),
                DateUtils.round(input, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testTruncateToMinute() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 3, 4, 5, 6).getTime();
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 3, 4, 0, 0).getTime(),
                DateUtils.truncate(input, Calendar.MINUTE));
    }

    @Test
    public void testCeilingToHour() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 3, 0, 0, 1).getTime();
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 4, 0, 0, 0).getTime(),
                DateUtils.ceiling(input, Calendar.HOUR_OF_DAY));
    }

    @Test
    public void testIteratorWeekStartsSunday() throws Exception {
        Date focus = utcCalendar(2020, Calendar.JANUARY, 8, 12, 0, 0, 0).getTime();
        Iterator<Calendar> it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_SUNDAY);
        Calendar first = it.next();
        assertEquals(5, first.get(Calendar.DAY_OF_MONTH));
        int count = 1;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorMonthSundayBounds() throws Exception {
        Date focus = utcCalendar(2020, Calendar.FEBRUARY, 10, 0, 0, 0, 0).getTime();
        Iterator<Calendar> it = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_SUNDAY);
        Calendar first = it.next();
        assertEquals(26, first.get(Calendar.DAY_OF_MONTH));
        assertEquals(Calendar.JANUARY, first.get(Calendar.MONTH));
    }

    @Test
    public void testFragmentMillisecondsAndSeconds() throws Exception {
        Date value = utcCalendar(2020, Calendar.JANUARY, 6, 7, 15, 10, 538).getTime();
        assertEquals(538L, DateUtils.getFragmentInMilliseconds(value, Calendar.SECOND));
        assertEquals(10L, DateUtils.getFragmentInSeconds(value, Calendar.MINUTE));
    }

    @Test
    public void testFragmentMinutesHoursAndDays() throws Exception {
        Date value = utcCalendar(2020, Calendar.JANUARY, 6, 7, 15, 10, 538).getTime();
        assertEquals(15L, DateUtils.getFragmentInMinutes(value, Calendar.HOUR_OF_DAY));
        assertEquals(151L, DateUtils.getFragmentInHours(value, Calendar.MONTH));
        assertEquals(6L, DateUtils.getFragmentInDays(value, Calendar.MONTH));
    }

    @Test
    public void testTruncatedComparisonsAtHourPrecision() throws Exception {
        Calendar a = utcCalendar(2020, Calendar.JANUARY, 2, 3, 1, 0, 0);
        Calendar b = utcCalendar(2020, Calendar.JANUARY, 2, 3, 59, 59, 999);
        Calendar c = utcCalendar(2020, Calendar.JANUARY, 2, 4, 0, 0, 0);
        assertTrue(DateUtils.truncatedEquals(a, b, Calendar.HOUR_OF_DAY));
        assertEquals(0, DateUtils.truncatedCompareTo(a, b, Calendar.HOUR_OF_DAY));
        assertTrue(DateUtils.truncatedCompareTo(a, c, Calendar.HOUR_OF_DAY) < 0);
    }

    @Test
    public void testDateIteratorRemoveUnsupported() throws Exception {
        Iterator<Calendar> it = DateUtils.iterator(
                utcCalendar(2020, Calendar.JANUARY, 8, 0, 0, 0, 0),
                DateUtils.RANGE_WEEK_SUNDAY);
        try {
            it.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertTrue(it.hasNext());
        }
    }

    @Test
    public void testAddYearsAcrossLeapDay() throws Exception {
        Date input = utcCalendar(2020, Calendar.FEBRUARY, 29, 10, 11, 12, 13).getTime();
        assertEquals(utcCalendar(2021, Calendar.FEBRUARY, 28, 10, 11, 12, 13).getTime(),
                DateUtils.addYears(input, 1));
    }

    @Test
    public void testAddWeeksAcrossMonthBoundary() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 29, 0, 0, 0, 0).getTime();
        assertEquals(utcCalendar(2020, Calendar.FEBRUARY, 5, 0, 0, 0, 0).getTime(),
                DateUtils.addWeeks(input, 1));
    }

    @Test
    public void testAddDaysAcrossYearBoundary() throws Exception {
        Date input = utcCalendar(2020, Calendar.DECEMBER, 31, 23, 0, 0, 0).getTime();
        assertEquals(utcCalendar(2021, Calendar.JANUARY, 1, 23, 0, 0, 0).getTime(),
                DateUtils.addDays(input, 1));
    }

    @Test
    public void testAddHoursAcrossMidnight() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 23, 30, 0, 0).getTime();
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 3, 0, 30, 0, 0).getTime(),
                DateUtils.addHours(input, 1));
    }

    @Test
    public void testAddMinutesAcrossHour() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 3, 59, 0, 0).getTime();
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 4, 0, 0, 0).getTime(),
                DateUtils.addMinutes(input, 1));
    }

    @Test
    public void testAddSecondsAcrossMinute() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 3, 4, 59, 0).getTime();
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 3, 5, 0, 0).getTime(),
                DateUtils.addSeconds(input, 1));
    }

    @Test
    public void testSetYearsAndMonths() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 15, 10, 11, 12, 13).getTime();
        assertEquals(utcCalendar(2021, Calendar.JANUARY, 15, 10, 11, 12, 13).getTime(),
                DateUtils.setYears(input, 2021));
        assertEquals(utcCalendar(2020, Calendar.FEBRUARY, 15, 10, 11, 12, 13).getTime(),
                DateUtils.setMonths(input, Calendar.FEBRUARY));
    }

    @Test
    public void testSetDaysAtMonthEdges() throws Exception {
        Date input = utcCalendar(2020, Calendar.FEBRUARY, 10, 10, 11, 12, 13).getTime();
        assertEquals(utcCalendar(2020, Calendar.FEBRUARY, 1, 10, 11, 12, 13).getTime(),
                DateUtils.setDays(input, 1));
        assertEquals(utcCalendar(2020, Calendar.FEBRUARY, 29, 10, 11, 12, 13).getTime(),
                DateUtils.setDays(input, 29));
    }

    @Test
    public void testSetMinutesAndSeconds() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 3, 4, 5, 6).getTime();
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 3, 59, 5, 6).getTime(),
                DateUtils.setMinutes(input, 59));
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 3, 4, 59, 6).getTime(),
                DateUtils.setSeconds(input, 59));
    }

    @Test
    public void testSetMillisecondsAtLimits() throws Exception {
        Date input = utcCalendar(2020, Calendar.JANUARY, 2, 3, 4, 5, 6).getTime();
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 3, 4, 5, 0).getTime(),
                DateUtils.setMilliseconds(input, 0));
        assertEquals(utcCalendar(2020, Calendar.JANUARY, 2, 3, 4, 5, 999).getTime(),
                DateUtils.setMilliseconds(input, 999));
    }
}
