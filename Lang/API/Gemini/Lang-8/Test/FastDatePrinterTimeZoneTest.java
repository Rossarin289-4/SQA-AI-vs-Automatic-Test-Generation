package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDatePrinterTimeZoneTest {

    @Test
    public void testCalendarTimeZoneRespectedCustomPattern() {
        TimeZone printerTz = TimeZone.getTimeZone("UTC");
        TimeZone calendarTz = TimeZone.getTimeZone("America/New_York");

        FastDatePrinter printer = new FastDatePrinter("z", printerTz, Locale.US);

        Calendar cal = Calendar.getInstance(calendarTz, Locale.US);
        cal.set(2013, Calendar.JANUARY, 15, 12, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);

        String result = printer.format(cal);
        
        // In buggy version, printer uses UTC (printerTz), ignoring calendar's timezone.
        // In fixed version, calendar's timezone (America/New_York) is respected.
        assertEquals("EST", result);
    }

    @Test
    public void testDifferentTimeZoneNameLongFormat() {
        TimeZone printerTz = TimeZone.getTimeZone("GMT");
        TimeZone calendarTz = TimeZone.getTimeZone("Pacific/Honolulu");

        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd z", printerTz, Locale.US);

        Calendar cal = Calendar.getInstance(calendarTz, Locale.US);
        cal.set(2013, Calendar.JUNE, 15, 12, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);

        String result = printer.format(cal);

        // The fixed version should reflect Honolulu standard/daylight name (HST or HDT),
        // whereas the buggy version would output GMT.
        assertEquals("2013-06-15 Hawaii-Aleutian Standard Time", result);
    }

    @Test
    public void testMultipleCalendarsWithDifferentTimeZones() {
        TimeZone printerTz = TimeZone.getTimeZone("UTC");
        FastDatePrinter printer = new FastDatePrinter("z", printerTz, Locale.US);

        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("GMT+2"), Locale.US);
        cal1.set(2013, Calendar.JANUARY, 15, 12, 0, 0);

        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("GMT-5"), Locale.US);
        cal2.set(2013, Calendar.JANUARY, 15, 12, 0, 0);

        String result1 = printer.format(cal1);
        String result2 = printer.format(cal2);

        // Buggy version returns UTC for both because it locks onto printerTz.
        // Fixed version dynamically queries each calendar's timezone.
        assertEquals("GMT+02:00", result1);
        assertEquals("GMT-05:00", result2);
    }
}
