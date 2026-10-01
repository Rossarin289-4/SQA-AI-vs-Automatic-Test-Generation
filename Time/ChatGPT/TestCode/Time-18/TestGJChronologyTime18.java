package org.joda.time.chrono;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTimeConstants;
import org.junit.Test;

public class TestGJChronologyTime18 {

    @Test
    public void testJulianFebruary29BeforeCutoverIsAccepted() {
        GJChronology chronology = GJChronology.getInstanceUTC();

        long instant = chronology.getDateTimeMillis(
                1500, 2, 29,
                0, 0, 0, 0);

        assertEquals(1500, chronology.getYear(instant));
        assertEquals(2, chronology.getMonthOfYear(instant));
        assertEquals(29, chronology.getDayOfMonth(instant));
        assertEquals(0, chronology.getHourOfDay(instant));
        assertEquals(0, chronology.getMinuteOfHour(instant));
        assertEquals(0, chronology.getSecondOfMinute(instant));
        assertEquals(0, chronology.getMillisOfSecond(instant));
    }
}
