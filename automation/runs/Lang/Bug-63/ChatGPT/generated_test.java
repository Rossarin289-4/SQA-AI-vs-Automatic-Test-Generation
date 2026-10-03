package org.apache.commons.lang.time;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Test;

public class DurationFormatUtilsLang63Test {

    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");

    private long millis(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance(UTC);
        calendar.clear();
        calendar.set(year, month, day, 0, 0, 0);
        return calendar.getTimeInMillis();
    }

    @Test
    public void testFormatPeriodBorrowingFromFebruaryNonLeapYear() {
        long start = millis(2005, Calendar.FEBRUARY, 28);
        long end = millis(2005, Calendar.APRIL, 1);

        assertEquals("1 1",
                DurationFormatUtils.formatPeriod(start, end, "M d", true, UTC));
    }

    @Test
    public void testFormatPeriodBorrowingFromFebruaryLeapYear() {
        long start = millis(2004, Calendar.FEBRUARY, 29);
        long end = millis(2004, Calendar.APRIL, 1);

        assertEquals("1 2",
                DurationFormatUtils.formatPeriod(start, end, "M d", true, UTC));
    }

    @Test
    public void testFormatPeriodBorrowingFromThirtyDayMonth() {
        long start = millis(2005, Calendar.APRIL, 30);
        long end = millis(2005, Calendar.JUNE, 1);

        assertEquals("1 1",
                DurationFormatUtils.formatPeriod(start, end, "M d", true, UTC));
    }

    @Test
    public void testFormatPeriodBorrowingFromThirtyOneDayMonth() {
        long start = millis(2005, Calendar.JANUARY, 31);
        long end = millis(2005, Calendar.MARCH, 1);

        assertEquals("1 1",
                DurationFormatUtils.formatPeriod(start, end, "M d", true, UTC));
    }
}
