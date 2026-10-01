package org.joda.time;

import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class TestDateTimeZoneTime17 {
    @Test
    public void testAdjustOffsetDuringAutumnOverlap() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        long instant = new DateTime(2012, 10, 28, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();

        long earlier = zone.adjustOffset(instant, false);
        long later = zone.adjustOffset(instant, true);

        assertNotEquals(earlier, later);
    }
}