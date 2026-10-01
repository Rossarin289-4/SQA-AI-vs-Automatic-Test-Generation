package org.joda.time;

import org.junit.Test;

public class TestDateTimeZoneTime9 {
    @Test(expected = IllegalArgumentException.class)
    public void testOffsetMillisBeyondOneDayIsRejected() {
        DateTimeZone.forOffsetMillis(24 * 60 * 60 * 1000);
    }
}