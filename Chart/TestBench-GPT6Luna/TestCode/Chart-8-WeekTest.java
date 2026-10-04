package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class WeekTest {
    @Test
    public void testWeekAndYearValues() throws Exception {
        Week w = new Week(7, 2004);
        assertEquals(7, w.getWeek());
        assertEquals(2004, w.getYearValue());
        assertEquals(2004, w.getYear().getYear());
    }

    @Test
    public void testWeekOneBoundary() throws Exception {
        Week w = new Week(1, 2000);
        assertEquals(1, w.getWeek());
        assertEquals(2000, w.getYearValue());
    }

    @Test
    public void testWeekFiftyThreeBoundary() throws Exception {
        Week w = new Week(53, 2000);
        assertEquals(53, w.getWeek());
    }

    @Test
    public void testConstructorAllowsWeekZeroDueToRangeCondition() throws Exception {
        Week w = new Week(0, 2000);
        assertEquals(0, w.getWeek());
    }

    @Test
    public void testConstructorAllowsWeekFiftyFourDueToRangeCondition() throws Exception {
        Week w = new Week(54, 2000);
        assertEquals(54, w.getWeek());
    }

    @Test
    public void testFirstAndLastMillisecondOrdering() throws Exception {
        Week w = new Week(10, 2000);
        assertEquals(w.getFirstMillisecond() + 604799999L,
                w.getLastMillisecond());
    }

    @Test
    public void testMillisecondBoundsUsingCalendar() throws Exception {
        Week w = new Week(10, 2000);
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"),
                Locale.US);
        long first = w.getFirstMillisecond(c);
        long last = w.getLastMillisecond(c);
        assertEquals(first + 604799999L, last);
    }

    @Test
    public void testPegUpdatesMillisecondsForCalendarZone() throws Exception {
        Week w = new Week(10, 2000);
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"),
                Locale.US);
        w.peg(c);
        assertEquals(w.getFirstMillisecond(c), w.getFirstMillisecond());
        assertEquals(w.getLastMillisecond(c), w.getLastMillisecond());
    }

    @Test
    public void testPreviousWithinYear() throws Exception {
        Week w = new Week(10, 2000);
        Week prev = (Week) w.previous();
        assertEquals(9, prev.getWeek());
        assertEquals(2000, prev.getYearValue());
    }

    @Test
    public void testPreviousAtLowerLimit() throws Exception {
        assertNull(new Week(1, 1900).previous());
    }

    @Test
    public void testNextWithinYear() throws Exception {
        Week w = new Week(10, 2000);
        Week next = (Week) w.next();
        assertEquals(11, next.getWeek());
        assertEquals(2000, next.getYearValue());
    }

    @Test
    public void testNextFromWeekFiftyTwoIsWeekFiftyThree() throws Exception {
        Week w = new Week(52, 2000);
        Week next = (Week) w.next();
        assertEquals(53, next.getWeek());
        assertEquals(2000, next.getYearValue());
    }

    @Test
    public void testNextAtUpperLimit() throws Exception {
        assertNull(new Week(53, 9999).next());
    }

    @Test
    public void testSerialIndex() throws Exception {
        assertEquals(2000L * 53L + 7L, new Week(7, 2000).getSerialIndex());
    }

    @Test
    public void testStringRepresentation() throws Exception {
        assertEquals("Week 9, 2002", new Week(9, 2002).toString());
    }

    @Test
    public void testEqualityAndHashCode() throws Exception {
        Week a = new Week(12, 2001);
        Week b = new Week(12, 2001);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testEqualityRejectsDifferentWeekAndOtherObjects() throws Exception {
        Week a = new Week(12, 2001);
        assertFalse(a.equals(new Week(13, 2001)));
        assertFalse(a.equals(null));
        assertFalse(a.equals("week"));
    }

    @Test
    public void testCompareWeeksByYearAndWeek() throws Exception {
        Week a = new Week(53, 2000);
        Week b = new Week(1, 2001);
        assertTrue(a.compareTo(b) < 0);
        assertTrue(b.compareTo(a) > 0);
        assertEquals(0, a.compareTo(new Week(53, 2000)));
    }

    @Test
    public void testCompareToOtherObjectKinds() throws Exception {
        Week w = new Week(1, 2000);
        assertEquals(1, w.compareTo("other"));
        assertEquals(0, w.compareTo(new Year(2000)));
    }

    @Test
    public void testParseYearThenWeek() throws Exception {
        Week w = Week.parseWeek("2002-W09");
        assertEquals(9, w.getWeek());
        assertEquals(2002, w.getYearValue());
    }

    @Test
    public void testParseWeekThenYearWithWhitespace() throws Exception {
        Week w = Week.parseWeek(" W12 - 2001 ");
        assertEquals(12, w.getWeek());
        assertEquals(2001, w.getYearValue());
    }

    @Test
    public void testParseWeekAtRangeEdges() throws Exception {
        assertEquals(1, Week.parseWeek("2000-W1").getWeek());
        assertEquals(53, Week.parseWeek("2000-W53").getWeek());
    }

    @Test
    public void testParseNullReturnsNull() throws Exception {
        assertNull(Week.parseWeek(null));
    }

    @Test
    public void testParseRejectsWeekAboveSupportedRange() throws Exception {
        try {
            Week.parseWeek("2000-W54");
            fail("expected TimePeriodFormatException");
        }
        catch (TimePeriodFormatException expected) {
        }
    }

    @Test
    public void testParseRejectsStringWithoutSeparator() throws Exception {
        try {
            Week.parseWeek("2000");
            fail("expected TimePeriodFormatException");
        }
        catch (TimePeriodFormatException expected) {
        }
    }
}
