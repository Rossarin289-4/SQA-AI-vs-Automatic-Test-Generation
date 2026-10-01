package org.joda.time;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBasePeriodTime22 {

    @Test
    public void testPeriodFromDurationInitializesAllStandardFields() {
        long duration =
                1L * DateTimeConstants.MILLIS_PER_DAY
                + 2L * DateTimeConstants.MILLIS_PER_HOUR
                + 3L * DateTimeConstants.MILLIS_PER_MINUTE
                + 4L * DateTimeConstants.MILLIS_PER_SECOND
                + 5L;

        Period period = new Period(duration);

        assertEquals(1, period.getDays());
        assertEquals(2, period.getHours());
        assertEquals(3, period.getMinutes());
        assertEquals(4, period.getSeconds());
        assertEquals(5, period.getMillis());
    }
}
