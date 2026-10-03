package org.apache.commons.lang3.time;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

public class DateUtilsLang21Test {

    @Test
    public void testIsSameLocalTimeMidnightAndNoonAreDifferent() {
        Calendar midnight = new GregorianCalendar();
        midnight.set(2020, Calendar.MARCH, 10, 0, 15, 20);
        midnight.set(Calendar.MILLISECOND, 0);

        Calendar noon = new GregorianCalendar();
        noon.set(2020, Calendar.MARCH, 10, 12, 15, 20);
        noon.set(Calendar.MILLISECOND, 0);

        assertFalse(DateUtils.isSameLocalTime(midnight, noon));
    }

    @Test
    public void testIsSameLocalTimeMorningAndAfternoonAreDifferent() {
        Calendar morning = new GregorianCalendar();
        morning.set(2020, Calendar.JUNE, 15, 5, 30, 45);
        morning.set(Calendar.MILLISECOND, 0);

        Calendar afternoon = new GregorianCalendar();
        afternoon.set(2020, Calendar.JUNE, 15, 17, 30, 45);
        afternoon.set(Calendar.MILLISECOND, 0);

        assertFalse(DateUtils.isSameLocalTime(morning, afternoon));
    }

    @Test
    public void testIsSameLocalTimeLateMorningAndNightAreDifferent() {
        Calendar lateMorning = new GregorianCalendar();
        lateMorning.set(2020, Calendar.SEPTEMBER, 20, 11, 40, 50);
        lateMorning.set(Calendar.MILLISECOND, 0);

        Calendar night = new GregorianCalendar();
        night.set(2020, Calendar.SEPTEMBER, 20, 23, 40, 50);
        night.set(Calendar.MILLISECOND, 0);

        assertFalse(DateUtils.isSameLocalTime(lateMorning, night));
    }

    @Test
    public void testIsSameLocalTimeIdenticalLocalTimeIsEqual() {
        Calendar first = new GregorianCalendar();
        first.set(2020, Calendar.NOVEMBER, 5, 8, 25, 35);
        first.set(Calendar.MILLISECOND, 0);

        Calendar second = new GregorianCalendar();
        second.set(2020, Calendar.NOVEMBER, 5, 8, 25, 35);
        second.set(Calendar.MILLISECOND, 0);

        assertTrue(DateUtils.isSameLocalTime(first, second));
    }
}
