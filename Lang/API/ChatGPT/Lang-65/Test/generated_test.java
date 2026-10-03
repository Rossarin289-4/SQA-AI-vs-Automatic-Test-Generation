package org.apache.commons.lang.time;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

public class DateUtilsLang65Test {

    private static final TimeZone NEW_YORK =
            TimeZone.getTimeZone("America/New_York");

    private static final TimeZone UTC =
            TimeZone.getTimeZone("GMT");

    private Date createDate(TimeZone timeZone, int year, int month, int day,
            int hour, int minute, int second, int millisecond,
            boolean daylightTime) {

        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);

        if (daylightTime) {
            calendar.set(Calendar.DST_OFFSET, 60 * 60 * 1000);
        }

        return calendar.getTime();
    }

    @Test
    public void testTruncateHourPreservesDstOccurrence() {
        Date input = createDate(
                NEW_YORK,
                2005,
                Calendar.OCTOBER,
                30,
                1,
                37,
                42,
                125,
                true);

        long expectedMillis =
                input.getTime()
                - (37L * DateUtils.MILLIS_PER_MINUTE)
                - (42L * DateUtils.MILLIS_PER_SECOND)
                - 125L;

        Date result = DateUtils.truncate(input, Calendar.HOUR_OF_DAY);

        assertEquals(expectedMillis, result.getTime());
    }

    @Test
    public void testTruncateMinuteDuringDstOverlap() {
        Date input = createDate(
                NEW_YORK,
                2005,
                Calendar.OCTOBER,
                30,
                1,
                37,
                42,
                125,
                true);

        long expectedMillis =
                input.getTime()
                - (42L * DateUtils.MILLIS_PER_SECOND)
                - 125L;

        Date result = DateUtils.truncate(input, Calendar.MINUTE);

        assertEquals(expectedMillis, result.getTime());
    }

    @Test
    public void testTruncateHourInUtc() {
        Date input = createDate(
                UTC,
                2020,
                Calendar.JUNE,
                15,
                14,
                27,
                35,
                456,
                false);

        long expectedMillis =
                input.getTime()
                - (27L * DateUtils.MILLIS_PER_MINUTE)
                - (35L * DateUtils.MILLIS_PER_SECOND)
                - 456L;

        Date result = DateUtils.truncate(input, Calendar.HOUR_OF_DAY);

        assertEquals(expectedMillis, result.getTime());
    }

    @Test
    public void testTruncateAlreadyAlignedHourLeavesInstantUnchanged() {
        Date input = createDate(
                UTC,
                2020,
                Calendar.JUNE,
                15,
                14,
                0,
                0,
                0,
                false);

        Date result = DateUtils.truncate(input, Calendar.HOUR_OF_DAY);

        assertEquals(input.getTime(), result.getTime());
    }
}
