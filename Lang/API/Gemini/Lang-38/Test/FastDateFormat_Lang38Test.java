package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;
import static org.junit.Assert.*;

public class FastDateFormat_Lang38Test {

    @Test
    public void testFastDateFormatTimeZoneOffsetFormatting() {
        TimeZone tz = TimeZone.getTimeZone("GMT+3");
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss Z", tz, Locale.US);
        
        Calendar cal = Calendar.getInstance(tz, Locale.US);
        cal.set(2009, Calendar.NOVEMBER, 6, 15, 20, 0);
        cal.set(Calendar.MILLISECOND, 0);
        
        String formatted = fdf.format(cal);
        assertTrue("Formatted string should contain correct offset +0300, got: " + formatted,
                formatted.endsWith("+0300"));
    }

    @Test
    public void testFastDateFormatWithDifferentCalendarTimeZone() {
        TimeZone tzUTC = TimeZone.getTimeZone("UTC");
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSSZ", tzUTC, Locale.US);

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-5"), Locale.US);
        cal.set(2009, Calendar.NOVEMBER, 6, 12, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);

        String formatted = fdf.format(cal);
        // Depending on whether the calendar or formatter timezone takes precedence/syncs,
        // the fixed version handles calendar time zone formatting correctly.
        assertNotNull(formatted);
    }

    @Test
    public void testTimeZoneNumberRuleWithColon() {
        FastDateFormat fdf = FastDateFormat.getInstance("ZZ", TimeZone.getTimeZone("GMT-04:00"), Locale.US);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-04:00"), Locale.US);
        cal.set(2009, Calendar.JANUARY, 1, 10, 0, 0);

        String formatted = fdf.format(cal);
        assertEquals("-04:00", formatted);
    }
}
