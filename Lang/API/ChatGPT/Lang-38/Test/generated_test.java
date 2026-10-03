package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateFormatLang38Test {

    @Test
    public void testFormatUnresolvedCalendarAcrossPositiveOffset() {
        TimeZone sourceZone = TimeZone.getTimeZone("GMT-05:00");
        TimeZone targetZone = TimeZone.getTimeZone("GMT+02:00");

        GregorianCalendar reference = new GregorianCalendar(sourceZone);
        reference.clear();
        reference.set(2011, GregorianCalendar.MARCH, 14, 23, 35, 42);

        long expectedMillis = reference.getTimeInMillis();

        GregorianCalendar calendar = new GregorianCalendar(sourceZone);
        calendar.clear();
        calendar.set(2011, GregorianCalendar.MARCH, 14, 23, 35, 42);

        FastDateFormat format = FastDateFormat.getInstance(
                "yyyy-MM-dd HH:mm:ss Z",
                targetZone);

        String actual = format.format(calendar);

        SimpleDateFormat expectedFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        expectedFormat.setTimeZone(targetZone);

        String expected = expectedFormat.format(new Date(expectedMillis));

        assertEquals(expected, actual);
    }

    @Test
    public void testFormatUnresolvedCalendarAcrossNegativeOffset() {
        TimeZone sourceZone = TimeZone.getTimeZone("GMT+09:00");
        TimeZone targetZone = TimeZone.getTimeZone("GMT-04:00");

        GregorianCalendar reference = new GregorianCalendar(sourceZone);
        reference.clear();
        reference.set(2012, GregorianCalendar.JULY, 8, 2, 15, 27);

        long expectedMillis = reference.getTimeInMillis();

        GregorianCalendar calendar = new GregorianCalendar(sourceZone);
        calendar.clear();
        calendar.set(2012, GregorianCalendar.JULY, 8, 2, 15, 27);

        FastDateFormat format = FastDateFormat.getInstance(
                "yyyy-MM-dd HH:mm:ss Z",
                targetZone);

        String actual = format.format(calendar);

        SimpleDateFormat expectedFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        expectedFormat.setTimeZone(targetZone);

        String expected = expectedFormat.format(new Date(expectedMillis));

        assertEquals(expected, actual);
    }

    @Test
    public void testFormatUnresolvedCalendarCrossesDateBoundary() {
        TimeZone sourceZone = TimeZone.getTimeZone("GMT-05:00");
        TimeZone targetZone = TimeZone.getTimeZone("GMT+10:00");

        GregorianCalendar reference = new GregorianCalendar(sourceZone);
        reference.clear();
        reference.set(2013, GregorianCalendar.NOVEMBER, 20, 22, 50, 10);

        long expectedMillis = reference.getTimeInMillis();

        GregorianCalendar calendar = new GregorianCalendar(sourceZone);
        calendar.clear();
        calendar.set(2013, GregorianCalendar.NOVEMBER, 20, 22, 50, 10);

        FastDateFormat format = FastDateFormat.getInstance(
                "yyyy-MM-dd HH:mm:ss Z",
                targetZone);

        String actual = format.format(calendar);

        SimpleDateFormat expectedFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        expectedFormat.setTimeZone(targetZone);

        String expected = expectedFormat.format(new Date(expectedMillis));

        assertEquals(expected, actual);
    }

    @Test
    public void testFormatAlreadyResolvedCalendar() {
        TimeZone sourceZone = TimeZone.getTimeZone("GMT+03:00");
        TimeZone targetZone = TimeZone.getTimeZone("GMT-06:00");

        GregorianCalendar calendar = new GregorianCalendar(sourceZone);
        calendar.clear();
        calendar.set(2014, GregorianCalendar.FEBRUARY, 5, 11, 20, 30);

        Date date = calendar.getTime();

        FastDateFormat format = FastDateFormat.getInstance(
                "yyyy-MM-dd HH:mm:ss Z",
                targetZone);

        String actual = format.format(calendar);

        SimpleDateFormat expectedFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        expectedFormat.setTimeZone(targetZone);

        String expected = expectedFormat.format(date);

        assertEquals(expected, actual);
    }

    @Test
    public void testFormatDateUsesSameForcedTimezone() {
        TimeZone targetZone = TimeZone.getTimeZone("GMT+05:30");

        GregorianCalendar reference = new GregorianCalendar(
                TimeZone.getTimeZone("GMT"));
        reference.clear();
        reference.set(2015, GregorianCalendar.AUGUST, 17, 6, 45, 12);

        Date date = reference.getTime();

        FastDateFormat format = FastDateFormat.getInstance(
                "yyyy-MM-dd HH:mm:ss Z",
                targetZone);

        String actual = format.format(date);

        SimpleDateFormat expectedFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        expectedFormat.setTimeZone(targetZone);

        String expected = expectedFormat.format(date);

        assertEquals(expected, actual);
    }
}
