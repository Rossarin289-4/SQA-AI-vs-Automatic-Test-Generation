package org.jfree.data.time;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class WeekAI8Test {

    @Test
    public void testWeekIntIntConstructorAndGetters() {
        Week week = new Week(15, 2023);
        assertEquals(15, week.getWeek());
        assertEquals(2023, week.getYearValue());
        assertEquals(new Year(2023), week.getYear());
        assertEquals(2023 * 53L + 15, week.getSerialIndex());
        assertEquals("Week 15, 2023", week.toString());
    }

    @Test
    public void testWeekIntYearConstructor() {
        Year year = new Year(2010);
        Week week = new Week(1, year);
        assertEquals(1, week.getWeek());
        assertEquals(2010, week.getYearValue());
        assertEquals(year, week.getYear());
    }

    @Test
    public void testPreviousAndNextNormal() {
        Week week = new Week(25, 2020);
        Week prev = (Week) week.previous();
        Week next = (Week) week.next();

        assertNotNull(prev);
        assertEquals(24, prev.getWeek());
        assertEquals(2020, prev.getYearValue());

        assertNotNull(next);
        assertEquals(26, next.getWeek());
        assertEquals(2020, next.getYearValue());
    }

    @Test
    public void testPreviousYearBoundary() {
        Week week1 = new Week(1, 1900);
        assertNull(week1.previous());

        Week week2 = new Week(1, 2020);
        Week prev = (Week) week2.previous();
        assertNotNull(prev);
        assertEquals(2019, prev.getYearValue());
        // Week 1 of any year has previous in the preceding year
        assertTrue(prev.getWeek() == 52 || prev.getWeek() == 53);
    }

    @Test
    public void testNextYearBoundary() {
        Week weekEnd = new Week(53, 9999);
        assertNull(weekEnd.next());

        Week week52 = new Week(52, 2021);
        RegularTimePeriod next = week52.next();
        assertNotNull(next);
        Week nextWeek = (Week) next;
        if (nextWeek.getYearValue() == 2021) {
            assertEquals(53, nextWeek.getWeek());
        } else {
            assertEquals(2022, nextWeek.getYearValue());
            assertEquals(1, nextWeek.getWeek());
        }
    }

    @Test
    public void testEqualsAndHashCode() {
        Week w1 = new Week(10, 2005);
        Week w2 = new Week(10, 2005);
        Week w3 = new Week(11, 2005);
        Week w4 = new Week(10, 2006);

        assertTrue(w1.equals(w1));
        assertTrue(w1.equals(w2));
        assertEquals(w1.hashCode(), w2.hashCode());

        assertFalse(w1.equals(w3));
        assertFalse(w1.equals(w4));
        assertFalse(w1.equals(null));
        assertFalse(w1.equals("Week 10, 2005"));
    }

    @Test
    public void testCompareTo() {
        Week w1 = new Week(10, 2005);
        Week w2 = new Week(10, 2005);
        Week w3 = new Week(11, 2005);
        Week w4 = new Week(9, 2005);
        Week w5 = new Week(10, 2006);
        Week w6 = new Week(10, 2004);

        assertEquals(0, w1.compareTo(w2));
        assertTrue(w1.compareTo(w3) < 0);
        assertTrue(w1.compareTo(w4) > 0);
        assertTrue(w1.compareTo(w5) < 0);
        assertTrue(w1.compareTo(w6) > 0);
        assertTrue(w1.compareTo(new Object()) > 0);
    }

    @Test
    public void testParseWeekValidFormats() {
        Week w1 = Week.parseWeek("2020-W10");
        assertNotNull(w1);
        assertEquals(10, w1.getWeek());
        assertEquals(2020, w1.getYearValue());

        Week w2 = Week.parseWeek("W12-2021");
        assertNotNull(w2);
        assertEquals(12, w2.getWeek());
        assertEquals(2021, w2.getYearValue());

        assertNull(Week.parseWeek(null));
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekInvalidNoSeparator() {
        Week.parseWeek("2020W10");
    }

    @Test(expected = TimePeriodFormatException.class)
    public void testParseWeekInvalidWeekNumber() {
        Week.parseWeek("2020-W99");
    }

    @Test
    public void testDateConstructorWithTimeZoneAndLocale() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.UK);
        cal.clear();
        cal.set(2023, Calendar.JUNE, 15, 12, 0, 0);
        Date date = cal.getTime();

        Week week = new Week(date, TimeZone.getTimeZone("UTC"), Locale.UK);
        assertTrue(week.getWeek() >= 1 && week.getWeek() <= 53);
        assertEquals(2023, week.getYearValue());

        long first = week.getFirstMillisecond(cal);
        long last = week.getLastMillisecond(cal);
        assertTrue(first < last);
        assertEquals(first, week.getFirstMillisecond());
        assertEquals(last, week.getLastMillisecond());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullDateConstructor() {
        new Week(null, TimeZone.getTimeZone("UTC"), Locale.UK);
    }
}
