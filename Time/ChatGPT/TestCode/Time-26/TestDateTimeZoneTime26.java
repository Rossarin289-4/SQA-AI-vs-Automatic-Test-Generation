package org.joda.time;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDateTimeZoneTime26 {

    @Test
    public void testWithZoneRetainFieldsDuringDstOverlap() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");

        DateTime original = new DateTime(
                2007, 10, 28, 1, 30, 0, 0, DateTimeZone.UTC);

        DateTime result = original.withZoneRetainFields(zone);

        assertEquals(2007, result.getYear());
        assertEquals(10, result.getMonthOfYear());
        assertEquals(28, result.getDayOfMonth());
        assertEquals(1, result.getHourOfDay());
        assertEquals(30, result.getMinuteOfHour());
        assertEquals(zone, result.getZone());
    }
}
