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
    @Test
    public void testSameDayIgnoresTime() throws Exception {
        Calendar a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        a.clear();
        a.set(2020, Calendar.JANUARY, 2, 1, 0, 0);
        Calendar b = (Calendar) a.clone();
        b.set(Calendar.HOUR_OF_DAY, 23);
        assertTrue(DateUtils.isSameDay(a.getTime(), b.getTime()));
    }

    @Test
    public void testSameDayAcrossDates() throws Exception {
        Calendar a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        a.clear();
        a.set(2020, Calendar.JANUARY, 2);
        Calendar b = (Calendar) a.clone();
        b.add(Calendar.DATE, 1);
        assertFalse(DateUtils.isSameDay(a.getTime(), b.getTime()));
    }

    @Test
    public void testSameInstantIgnoresCalendarZone() throws Exception {
        Calendar a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        a.setTimeInMillis(123456789L);
        Calendar b = Calendar.getInstance(TimeZone.getTimeZone("GMT+02:00"));
        b.setTimeInMillis(123456789L);
        assertTrue(DateUtils.isSameInstant(a.getTime(), b.getTime()));
    }

    @Test
    public void testSameLocalTimeWithEquivalentCalendars() throws Exception {
        Calendar a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        a.clear();
        a.set(2020, Calendar.JANUARY, 2, 3, 4, 5);
        a.set(Calendar.MILLISECOND, 6);
        Calendar b = (Calendar) a.clone();
        assertTrue(DateUtils.isSameLocalTime(a, b));
    }

    @Test
    public void testParseDateUsesLaterPatternWhenFirstDoesNotMatch() throws Exception {
        Date parsed = DateUtils.parseDate("2020/01/02",
                new String[] {"yyyy-MM-dd", "yyyy/MM/dd"});
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        c.clear();
        c.set(2020, Calendar.JANUARY, 2);
        assertEquals(c.getTime(), parsed);
    }

    @Test
    public void testParseDateRejectsTrailingText() throws Exception {
        try {
            DateUtils.parseDate("2020-01-02x", new String[] {"yyyy-MM-dd"});
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals(-1, expected.getErrorOffset());
        }
    }

    @Test
    public void testAddYears() throws Exception {
        Date start = new Date(0L);
        assertEquals(DateUtils.add(start, Calendar.YEAR, 1).getTime(),
                DateUtils.addYears(start, 1).getTime());
    }

    @Test
    public void testAddMonthsPreservesOriginalDate() throws Exception {
        Date start = new Date(0L);
        Date result = DateUtils.addMonths(start, 1);
        assertEquals(0L, start.getTime());
        assertEquals(DateUtils.add(start, Calendar.MONTH, 1), result);
    }

    @Test
    public void testAddWeeks() throws Exception {
        Date start = new Date(0L);
        assertEquals(DateUtils.add(start, Calendar.WEEK_OF_YEAR, 1),
                DateUtils.addWeeks(start, 1));
    }

    @Test
    public void testAddDays() throws Exception {
        Date start = new Date(0L);
        assertEquals(86400000L, DateUtils.addDays(start, 1).getTime());
    }

    @Test
    public void testAddHours() throws Exception {
        Date start = new Date(0L);
        assertEquals(3600000L, DateUtils.addHours(start, 1).getTime());
    }

    @Test
    public void testAddMinutes() throws Exception {
        Date start = new Date(0L);
        assertEquals(60000L, DateUtils.addMinutes(start, 1).getTime());
    }

    @Test
    public void testAddSeconds() throws Exception {
        Date start = new Date(0L);
        assertEquals(1000L, DateUtils.addSeconds(start, 1).getTime());
    }

    @Test
    public void testAddMilliseconds() throws Exception {
        assertEquals(1L, DateUtils.addMilliseconds(new Date(0L), 1).getTime());
    }

    @Test
    public void testAddNegativeAmount() throws Exception {
        assertEquals(-1L, DateUtils.add(new Date(0L), Calendar.MILLISECOND, -1).getTime());
    }

    @Test
    public void testRoundDateAtBelowMinuteHalf() throws Exception {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        c.clear();
        c.set(2020, Calendar.JANUARY, 2, 3, 29, 59);
        c.set(Calendar.MILLISECOND, 999);
        assertEquals(c.getTimeInMillis() - 59999L,
                DateUtils.round(c.getTime(), Calendar.HOUR_OF_DAY).getTime());
    }

    @Test
    public void testRoundDateAtMinuteHalf() throws Exception {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        c.clear();
        c.set(2020, Calendar.JANUARY, 2, 3, 30, 0);
        assertEquals(c.getTimeInMillis() + 3600000L,
                DateUtils.round(c.getTime(), Calendar.HOUR_OF_DAY).getTime());
    }

    @Test
    public void testTruncateDateToMinute() throws Exception {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        c.clear();
        c.set(2020, Calendar.JANUARY, 2, 3, 4, 5);
        c.set(Calendar.MILLISECOND, 6);
        assertEquals(c.getTimeInMillis() - 5006L,
                DateUtils.truncate(c.getTime(), Calendar.MINUTE).getTime());
    }

    @Test
    public void testRoundAndTruncateMillisecondAreUnchanged() throws Exception {
        Date d = new Date(123456789L);
        assertEquals(d, DateUtils.round(d, Calendar.MILLISECOND));
        assertEquals(d, DateUtils.truncate(d, Calendar.MILLISECOND));
    }

    @Test
    public void testIteratorWeekSundayHasSevenDays() throws Exception {
        Calendar focus = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        focus.clear();
        focus.set(2020, Calendar.JANUARY, 8);
        Iterator it = DateUtils.iterator(focus.getTime(), DateUtils.RANGE_WEEK_SUNDAY);
        int count = 0;
        long first = -1L;
        while (it.hasNext()) {
            Calendar day = (Calendar) it.next();
            if (count == 0) {
                first = day.getTimeInMillis();
            }
            count++;
        }
        Calendar expected = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        expected.clear();
        expected.set(2020, Calendar.JANUARY, 5);
        assertEquals(expected.getTimeInMillis(), first);
        assertEquals(7, count);
    }

    @Test
    public void testIteratorMonthSundayRange() throws Exception {
        Calendar focus = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        focus.clear();
        focus.set(2020, Calendar.FEBRUARY, 10);
        Iterator it = DateUtils.iterator(focus.getTime(), DateUtils.RANGE_MONTH_SUNDAY);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(35, count);
    }

    @Test
    public void testIteratorExhaustion() throws Exception {
        Calendar focus = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        focus.clear();
        focus.set(2020, Calendar.JANUARY, 8);
        Iterator it = DateUtils.iterator(focus.getTime(), DateUtils.RANGE_WEEK_SUNDAY);
        for (int i = 0; i < 7; i++) {
            it.next();
        }
        assertFalse(it.hasNext());
        try {
            it.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
            assertFalse(it.hasNext());
        }
    }

    @Test
    public void testIteratorRemoveUnsupported() throws Exception {
        Calendar focus = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        focus.clear();
        focus.set(2020, Calendar.JANUARY, 8);
        Iterator it = DateUtils.iterator(focus.getTime(), DateUtils.RANGE_WEEK_SUNDAY);
        try {
            it.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertTrue(it.hasNext());
        }
    }
}
```