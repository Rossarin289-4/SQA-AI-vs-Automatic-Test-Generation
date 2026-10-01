package org.joda.time;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDateTimeZoneTime19 {

    @Test
    public void testLondonZeroOffsetAtTransition() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");

        long localMillis = new DateTime(
                1971, 10, 31, 1, 30, 0, 0, DateTimeZone.UTC).getMillis();

        long expectedUtc = localMillis - DateTimeConstants.MILLIS_PER_HOUR;

        DateTime result = new DateTime(localMillis, zone);

        assertEquals(expectedUtc, result.getMillis());

        assertEquals(expectedUtc,
                zone.convertLocalToUTC(localMillis, false));
    }
}
