package org.apache.commons.lang.time;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

public class DateUtilsCustomTest {

    @Test
    public void testTruncateToSecondWithHighMilliseconds() {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.set(2023, Calendar.MARCH, 15, 14, 28, 35);
        cal.set(Calendar.MILLISECOND, 789);

        Date truncated = DateUtils.truncate(cal, Calendar.SECOND);
        
        Calendar expected = Calendar.getInstance(TimeZone.getDefault());
        expected.set(2023, Calendar.MARCH, 15, 14, 28, 35);
        expected.set(Calendar.MILLISECOND, 0);

        assertEquals("Truncated to second with high millis should zero out milliseconds",
                expected.getTimeInMillis(), truncated.getTime());
    }

    @Test
    public void testRoundToSecondWithHighMilliseconds() {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.set(2023, Calendar.MARCH, 15, 14, 28, 35);
        cal.set(Calendar.MILLISECOND, 600);

        Date rounded = DateUtils.round(cal, Calendar.SECOND);
        
        Calendar expected = Calendar.getInstance(TimeZone.getDefault());
        expected.set(2023, Calendar.MARCH, 15, 14, 28, 36);
        expected.set(Calendar.MILLISECOND, 0);

        assertEquals("Rounded to second with high millis should round up second and zero milliseconds",
                expected.getTimeInMillis(), rounded.getTime());
    }

    @Test
    public void testTruncateToMinuteWithSecondsAndMilliseconds() {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.set(2023, Calendar.MARCH, 15, 14, 28, 45);
        cal.set(Calendar.MILLISECOND, 123);

        Date truncated = DateUtils.truncate(cal, Calendar.MINUTE);
        
        Calendar expected = Calendar.getInstance(TimeZone.getDefault());
        expected.set(2023, Calendar.MARCH, 15, 14, 28, 0);
        expected.set(Calendar.MILLISECOND, 0);

        assertEquals("Truncated to minute should zero seconds and milliseconds",
                expected.getTimeInMillis(), truncated.getTime());
    }
}
