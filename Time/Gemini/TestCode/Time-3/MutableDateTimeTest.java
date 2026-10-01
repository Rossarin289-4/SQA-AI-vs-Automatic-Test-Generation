package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MutableDateTimeTest {

    @Test
    public void testAddZeroDuringDstOverlap() {
        // America/New_York DST fall-back transition on Nov 2, 2008.
        // 1225602000000L corresponds to 01:00 EDT (the first occurrence before transition).
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long first1amEDT = 1225602000000L;

        MutableDateTime mdt = new MutableDateTime(first1amEDT, zone);

        // Buggy version calls setMillis(getChronology().add(..., 0)), which normalizes/re-computes
        // the timestamp and forces it to 01:00 EST (1225605600000L).
        // Fixed version guards with `if (amount != 0)` and leaves mdt millis unchanged.
        mdt.addHours(0);

        assertEquals(first1amEDT, mdt.getMillis());
    }
}
