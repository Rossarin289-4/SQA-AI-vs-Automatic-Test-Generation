package org.joda.time;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDateTimeZoneTime23 {

    @Test
    public void testLegacyISTMapping() {
        DateTimeZone zone = DateTimeZone.forID("IST");

        assertEquals("Asia/Calcutta", zone.getID());
    }
}
