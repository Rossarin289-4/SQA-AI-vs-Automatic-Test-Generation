package org.joda.time.chrono;

import static org.junit.Assert.fail;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.junit.Test;

public class TestGJChronologyTime6 {

    @Test
    public void testCutoverYearZeroIsRejected() {
        long cutoverMillis = new LocalDate(0, 1, 1)
                .toDateTimeAtStartOfDay(DateTimeZone.UTC)
                .getMillis();

        try {
            GJChronology.getInstance(DateTimeZone.UTC, cutoverMillis);
            fail("A GJChronology cutover date with year 0 must be rejected");
        } catch (IllegalArgumentException expected) {
            // Expected behavior.
        }
    }
}
