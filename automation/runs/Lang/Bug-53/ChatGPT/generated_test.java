package org.apache.commons.lang.time;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilsLang53Test {

    @Test
    public void testRoundToSecondWithMillisecondsAboveHalfAndSecondsBelowHalf() {
        Calendar input = Calendar.getInstance();
        input.set(2010, Calendar.JUNE, 15, 10, 20, 10);
        input.set(Calendar.MILLISECOND, 800);

        Date result = DateUtils.round(input.getTime(), Calendar.SECOND);

        Calendar expected = Calendar.getInstance();
        expected.set(2010, Calendar.JUNE, 15, 10, 20, 11);
        expected.set(Calendar.MILLISECOND, 0);

        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testRoundToSecondAtMillisecondBoundaryWithSecondsBelowHalf() {
        Calendar input = Calendar.getInstance();
        input.set(2011, Calendar.MARCH, 8, 14, 35, 12);
        input.set(Calendar.MILLISECOND, 500);

        Date result = DateUtils.round(input.getTime(), Calendar.SECOND);

        Calendar expected = Calendar.getInstance();
        expected.set(2011, Calendar.MARCH, 8, 14, 35, 13);
        expected.set(Calendar.MILLISECOND, 0);

        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testTruncateToMinuteWithSecondsAboveHalfAndMillisecondsPresent() {
        Calendar input = Calendar.getInstance();
        input.set(2012, Calendar.AUGUST, 21, 9, 40, 45);
        input.set(Calendar.MILLISECOND, 800);

        Date result = DateUtils.truncate(input.getTime(), Calendar.MINUTE);

        Calendar expected = Calendar.getInstance();
        expected.set(2012, Calendar.AUGUST, 21, 9, 40, 0);
        expected.set(Calendar.MILLISECOND, 0);

        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testTruncateToMinuteWithSecondsExactlyThirty() {
        Calendar input = Calendar.getInstance();
        input.set(2013, Calendar.FEBRUARY, 10, 16, 25, 30);
        input.set(Calendar.MILLISECOND, 750);

        Date result = DateUtils.truncate(input.getTime(), Calendar.MINUTE);

        Calendar expected = Calendar.getInstance();
        expected.set(2013, Calendar.FEBRUARY, 10, 16, 25, 0);
        expected.set(Calendar.MILLISECOND, 0);

        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testRoundToSecondWithMillisecondsBelowHalf() {
        Calendar input = Calendar.getInstance();
        input.set(2014, Calendar.SEPTEMBER, 3, 8, 15, 27);
        input.set(Calendar.MILLISECOND, 200);

        Date result = DateUtils.round(input.getTime(), Calendar.SECOND);

        Calendar expected = Calendar.getInstance();
        expected.set(2014, Calendar.SEPTEMBER, 3, 8, 15, 27);
        expected.set(Calendar.MILLISECOND, 0);

        assertEquals(expected.getTime(), result);
    }

    @Test
    public void testRoundToMinuteWithSecondsBelowHalf() {
        Calendar input = Calendar.getInstance();
        input.set(2015, Calendar.NOVEMBER, 12, 18, 42, 20);
        input.set(Calendar.MILLISECOND, 300);

        Date result = DateUtils.round(input.getTime(), Calendar.MINUTE);

        Calendar expected = Calendar.getInstance();
        expected.set(2015, Calendar.NOVEMBER, 12, 18, 42, 0);
        expected.set(Calendar.MILLISECOND, 0);

        assertEquals(expected.getTime(), result);
    }
}
