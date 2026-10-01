package org.joda.time.format;

import static org.junit.Assert.assertEquals;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Test;

public class TestDateTimeFormatterTime7 {
    @Test
    public void testDefaultYearUsesLocalInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendMonthOfYear(2)
                .appendLiteral('/')
                .appendDayOfMonth(2)
                .toFormatter()
                .withZone(zone);
        DateTime result = formatter.parseDateTime("02/03");
        assertEquals(2000, result.getYear());
        assertEquals(2, result.getMonthOfYear());
        assertEquals(3, result.getDayOfMonth());
        assertEquals(zone, result.getZone());
    }
}