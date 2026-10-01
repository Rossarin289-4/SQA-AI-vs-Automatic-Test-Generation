package org.joda.time;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDateTimeZoneTime8 {

    @Test
    public void testForOffsetHoursMinutesAllowsPositiveHoursWithNegativeMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, -30);

        assertEquals(
                "Offset should represent +4:30 when hours are +5 and minutes are -30",
                4 * 60 * 60 * 1000 + 30 * 60 * 1000,
                zone.getOffset(0)
        );

        assertEquals("GMT+04:30", zone.getID());
    }
}
