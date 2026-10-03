package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDatePrinterLang8Test {

    @Test
    public void testCalendarTimeZoneUsedForStandardTimeZoneName() {
        TimeZone formatterZone = TimeZone.getTimeZone("UTC");
        TimeZone calendarZone = TimeZone.getTimeZone("Asia/Tokyo");

        FastDateFormat formatter =
                FastDateFormat.getInstance("z", formatterZone, Locale.US);

        Calendar calendar =
                new GregorianCalendar(calendarZone, Locale.US);
        calendar.set(2020, Calendar.JANUARY, 15, 12, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        String actual = formatter.format(calendar);

        String expected =
                calendarZone.getDisplayName(false, TimeZone.SHORT, Locale.US);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalendarTimeZoneUsedForDaylightTimeZoneName() {
        TimeZone formatterZone = TimeZone.getTimeZone("UTC");
        TimeZone calendarZone = TimeZone.getTimeZone("America/New_York");

        FastDateFormat formatter =
                FastDateFormat.getInstance("z", formatterZone, Locale.US);

        Calendar calendar =
                new GregorianCalendar(calendarZone, Locale.US);
        calendar.set(2020, Calendar.JULY, 15, 12, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        String actual = formatter.format(calendar);

        boolean daylight =
                calendar.get(Calendar.DST_OFFSET) != 0;

        String expected =
                calendarZone.getDisplayName(
                        daylight,
                        TimeZone.SHORT,
                        Locale.US);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalendarTimeZoneUsedForLongTimeZoneName() {
        TimeZone formatterZone = TimeZone.getTimeZone("UTC");
        TimeZone calendarZone = TimeZone.getTimeZone("Asia/Tokyo");

        FastDateFormat formatter =
                FastDateFormat.getInstance("zzzz", formatterZone, Locale.US);

        Calendar calendar =
                new GregorianCalendar(calendarZone, Locale.US);
        calendar.set(2020, Calendar.FEBRUARY, 20, 10, 30, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        String actual = formatter.format(calendar);

        String expected =
                calendarZone.getDisplayName(false, TimeZone.LONG, Locale.US);

        assertEquals(expected, actual);
    }

    @Test
    public void testSameTimeZoneRemainsConsistent() {
        TimeZone sharedZone = TimeZone.getTimeZone("Asia/Tokyo");

        FastDateFormat formatter =
                FastDateFormat.getInstance("z", sharedZone, Locale.US);

        Calendar calendar =
                new GregorianCalendar(sharedZone, Locale.US);
        calendar.set(2020, Calendar.MARCH, 10, 8, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        String actual = formatter.format(calendar);

        String expected =
                sharedZone.getDisplayName(false, TimeZone.SHORT, Locale.US);

        assertEquals(expected, actual);
    }
}
