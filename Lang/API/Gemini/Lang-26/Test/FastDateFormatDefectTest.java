package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateFormatDefectTest {

    @Test
    public void testFastDateFormatWithTimeZoneOverrideCalendar() {
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        TimeZone gmtPlus5 = TimeZone.getTimeZone("GMT+5");

        FastDateFormat formatter = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", gmt, Locale.US);

        Calendar cal = Calendar.getInstance(gmtPlus5);
        cal.clear();
        cal.set(2010, Calendar.JANUARY, 1, 12, 0, 0); // 12:00 PM in GMT+5

        // In GMT, this should be 07:00 AM on the same day
        String formatted = formatter.format(cal);
        assertEquals("2010-01-01 07:00:00", formatted);
    }

    @Test
    public void testFastDateFormatWithDateAndCustomTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT-5");
        FastDateFormat formatter = FastDateFormat.getInstance("HH:mm", tz, Locale.US);

        // Epoch 0 is 1970-01-01 00:00:00 UTC, which is 1969-12-31 19:00:00 in GMT-5
        Date date = new Date(0L);
        String formatted = formatter.format(date);
        assertEquals("19:00", formatted);
    }

    @Test
    public void testSequentialFormattingDifferentTimeZones() {
        TimeZone paris = TimeZone.getTimeZone("Europe/Paris");
        FastDateFormat formatter = FastDateFormat.getInstance("HH:mm", paris, Locale.US);

        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal1.clear();
        cal1.set(2020, Calendar.JUNE, 1, 10, 0, 0); // 10:00 UTC -> 12:00 Paris (Summer time CEST = UTC+2)

        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        cal2.clear();
        cal2.set(2020, Calendar.JUNE, 1, 10, 0, 0); // 10:00 EDT -> 16:00 Paris

        String result1 = formatter.format(cal1);
        String result2 = formatter.format(cal2);

        assertEquals("12:00", result1);
        assertEquals("16:00", result2);
    }
}
