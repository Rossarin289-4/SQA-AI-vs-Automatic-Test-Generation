package org.joda.time;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBaseSingleFieldPeriodTime10 {
    @Test
    public void testDaysBetweenDates() {
        LocalDate start = new LocalDate(1970, 1, 1);
        LocalDate end = new LocalDate(1970, 1, 3);
        assertEquals(2, Days.daysBetween(start, end).getDays());
    }
}