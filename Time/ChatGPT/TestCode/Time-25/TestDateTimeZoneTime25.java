package org.joda.time;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDateTimeZoneTime25 {

    @Test
    public void testConvertLocalToUTCAtMoscowAutumnOverlap() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Moscow");

        long localMillis = new DateTime(
                2007, 10, 28, 2, 30, 0, 0, DateTimeZone.UTC).getMillis();

        long expected = localMillis - 4 * DateTimeConstants.MILLIS_PER_HOUR;

        assertEquals(expected, zone.convertLocalToUTC(localMillis, false));
    }
}
