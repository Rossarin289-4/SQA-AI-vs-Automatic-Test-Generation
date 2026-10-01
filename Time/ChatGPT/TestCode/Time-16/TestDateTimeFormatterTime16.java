package org.joda.time.format;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

public class TestDateTimeFormatterTime16 {

    @Test
    public void testParsingDateWithoutYearUsesConfiguredDefaultYear() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendMonthOfYear(2)
                .appendLiteral('-')
                .appendDayOfMonth(2)
                .toFormatter()
                .withDefaultYear(2000);

        DateTime result = formatter.parseDateTime("02-03");

        assertEquals(2000, result.getYear());
        assertEquals(2, result.getMonthOfYear());
        assertEquals(3, result.getDayOfMonth());
    }
}
