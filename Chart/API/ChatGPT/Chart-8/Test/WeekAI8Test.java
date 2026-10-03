package org.jfree.data.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WeekAI8Test {

    @Test
    public void testConstructorAndRangeValidation() {
        Week week = new Week(5, 2023);
        assertEquals(5, week.getWeek());
        assertEquals(2023, week.getYearValue());
    }

    @Test
    public void testEqualsAndHashCode() {
        Week w1 = new Week(10, 2022);
        Week w2 = new Week(10, 2022);
        Week w3 = new Week(11, 2022);

        assertTrue(w1.equals(w2));
        assertFalse(w1.equals(w3));
        assertEquals(w1.hashCode(), w2.hashCode());
    }

    @Test
    public void testParseWeek() {
        Week parsed = Week.parseWeek("2021-W03");
        assertEquals(3, parsed.getWeek());
        assertEquals(2021, parsed.getYearValue());
    }
}
