package org.apache.commons.lang.time;

import org.junit.Test;
import java.util.Calendar;
import java.util.TimeZone;
import static org.junit.Assert.assertEquals;

public class DurationFormatUtilsIndependentTest {

    @Test
    public void testFormatPeriodAcrossFebruary() {
        // January 15, 2008 to February 15, 2008 (Leap year February has 29 days)
        Calendar start = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        start.set(2008, Calendar.JANUARY, 15, 0, 0, 0);
        start.set(Calendar.MILLISECOND, 0);

        Calendar end = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        end.set(2008, Calendar.FEBRUARY, 15, 0, 0, 0);
        end.set(Calendar.MILLISECOND, 0);

        String result = DurationFormatUtils.formatPeriod(
                start.getTimeInMillis(), 
                end.getTimeInMillis(), 
                "M' months 'd' days'", 
                false, 
                TimeZone.getTimeZone("GMT")
        );
        
        // Expected: 1 month, 0 days
        assertEquals("1 months 0 days", result);
    }

    @Test
    public void testFormatPeriodAcrossShortMonth() {
        // March 30 to May 30 spanning April (30 days)
        Calendar start = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        start.set(2007, Calendar.MARCH, 30, 0, 0, 0);
        start.set(Calendar.MILLISECOND, 0);

        Calendar end = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        end.set(2007, Calendar.MAY, 30, 0, 0, 0);
        end.set(Calendar.MILLISECOND, 0);

        String result = DurationFormatUtils.formatPeriod(
                start.getTimeInMillis(), 
                end.getTimeInMillis(), 
                "M' months 'd' days'", 
                false, 
                TimeZone.getTimeZone("GMT")
        );
        
        assertEquals("2 months 0 days", result);
    }

    @Test
    public void testFormatPeriodDaysAndMonthsCalculation() {
        // January 14 to March 10
        Calendar start = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        start.set(2007, Calendar.JANUARY, 14, 0, 0, 0);
        start.set(Calendar.MILLISECOND, 0);

        Calendar end = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        end.set(2007, Calendar.MARCH, 10, 0, 0, 0);
        end.set(Calendar.MILLISECOND, 0);

        String result = DurationFormatUtils.formatPeriod(
                start.getTimeInMillis(), 
                end.getTimeInMillis(), 
                "M' months 'd' days'", 
                false, 
                TimeZone.getTimeZone("GMT")
        );

        // Jan 14 to Feb 14 (1 month) + Feb 14 to Mar 10 (24 days in Feb, since Feb 2007 has 28 days: (28-14)+10 = 24)
        // With buggy hardcoded 31-day adjustment, the day calculation gets skewed.
        assertEquals("1 months 24 days", result);
    }
}
