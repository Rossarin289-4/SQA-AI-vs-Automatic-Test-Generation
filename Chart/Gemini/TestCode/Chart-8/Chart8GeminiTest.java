package org.jfree.data.time.junit;

import java.util.Date;
import java.util.TimeZone;
import junit.framework.TestCase;
import org.jfree.data.time.Week;

public class Chart8GeminiTest extends TestCase {

    public Chart8GeminiTest(String name) {
        super(name);
    }

    public void testConstructorWithTimeZone() {
        // Date: 1900-01-01 00:00:00 UTC
        Date date = new Date(-2208988800000L);
        TimeZone zone = TimeZone.getTimeZone("PST");

        Week week = new Week(date, zone);
        // Under PST, this date falls into the previous week/year (1899)
        assertEquals(1899, week.getYear().getYear());
    }
}
