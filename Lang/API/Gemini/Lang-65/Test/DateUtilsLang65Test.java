package org.apache.commons.lang.time;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

public class DateUtilsLang65Test {

    @Test
    public void testTruncateToDateClearsTimeFields() {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.set(2020, Calendar.JANUARY, 15, 14, 30, 45);
        cal.set(Calendar.MILLISECOND, 888);

        Date truncated = DateUtils.truncate(cal.getTime(), Calendar.DATE);

        Calendar resultCal = Calendar.getInstance(TimeZone.getDefault());
        resultCal.setTime(truncated);

        assertEquals(2020, resultCal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, resultCal.get(Calendar.MONTH));
        assertEquals(15, resultCal.get(Calendar.DATE));
        assertEquals(0, resultCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, resultCal.get(Calendar.MINUTE));
        assertEquals(0, resultCal.get(Calendar.SECOND));
        assertEquals(0, resultCal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testTruncateToHourClearsSubMinuteAndSecondFields() {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.set(2020, Calendar.JANUARY, 15, 14, 30, 45);
        cal.set(Calendar.MILLISECOND, 888);

        Date truncated = DateUtils.truncate(cal.getTime(), Calendar.HOUR_OF_DAY);

        Calendar resultCal = Calendar.getInstance(TimeZone.getDefault());
        resultCal.setTime(truncated);

        assertEquals(2020, resultCal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, resultCal.get(Calendar.MONTH));
        assertEquals(15, resultCal.get(Calendar.DATE));
        assertEquals(14, resultCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, resultCal.get(Calendar.MINUTE));
        assertEquals(0, resultCal.get(Calendar.SECOND));
        assertEquals(0, resultCal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testTruncateToMinuteClearsSecondsAndMilliseconds() {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.set(2020, Calendar.JANUARY, 15, 14, 30, 45);
        cal.set(Calendar.MILLISECOND, 888);

        Date truncated = DateUtils.truncate(cal.getTime(), Calendar.MINUTE);

        Calendar resultCal = Calendar.getInstance(TimeZone.getDefault());
        resultCal.setTime(truncated);

        assertEquals(2020, resultCal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, resultCal.get(Calendar.MONTH));
        assertEquals(15, resultCal.get(Calendar.DATE));
        assertEquals(14, resultCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, resultCal.get(Calendar.MINUTE));
        assertEquals(0, resultCal.get(Calendar.SECOND));
        assertEquals(0, resultCal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testRoundDownToDate() {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.set(2020, Calendar.JANUARY, 15, 11, 59, 59);
        cal.set(Calendar.MILLISECOND, 999);

        Calendar result = Calendar.getInstance(TimeZone.getDefault());
        result.setTime(DateUtils.round(cal.getTime(), Calendar.DATE));

        assertEquals(2020, result.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, result.get(Calendar.MONTH));
        assertEquals(15, result.get(Calendar.DATE));
        assertEquals(0, result.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, result.get(Calendar.MINUTE));
        assertEquals(0, result.get(Calendar.SECOND));
        assertEquals(0, result.get(Calendar.MILLISECOND));
    }

    @Test
    public void testRoundUpToDate() {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.set(2020, Calendar.JANUARY, 15, 12, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);

        Calendar result = Calendar.getInstance(TimeZone.getDefault());
        result.setTime(DateUtils.round(cal.getTime(), Calendar.DATE));

        assertEquals(2020, result.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, result.get(Calendar.MONTH));
        assertEquals(16, result.get(Calendar.DATE));
        assertEquals(0, result.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, result.get(Calendar.MINUTE));
        assertEquals(0, result.get(Calendar.SECOND));
        assertEquals(0, result.get(Calendar.MILLISECOND));
    }
}
