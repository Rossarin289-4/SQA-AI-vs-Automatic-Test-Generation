package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.Validate;

public class FastDatePrinterTest {
    @Test
    public void testFormatObjectDateAndExistingBuffer() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd",
                TimeZone.getTimeZone("UTC"), Locale.US);
        StringBuffer buffer = new StringBuffer("x");
        StringBuffer result = printer.format((Object) new Date(0L), buffer,
                new FieldPosition(0));
        assertSame(buffer, result);
        assertEquals("x1970-01-01", result.toString());
    }

    @Test
    public void testFormatObjectLongAtEpoch() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("1970-01-01",
                printer.format((Object) Long.valueOf(0L), new StringBuffer(),
                        new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatObjectCalendar() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd",
                TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"),
                Locale.US);
        calendar.setTimeInMillis(0L);
        assertEquals("1970-01-01",
                printer.format((Object) calendar, new StringBuffer(),
                        new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatObjectRejectsUnsupportedObject() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        try {
            printer.format((Object) "date", new StringBuffer(),
                    new FieldPosition(0));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("1970", printer.format(0L));
        }
    }

    @Test
    public void testFormatObjectRejectsNull() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        try {
            printer.format((Object) null, new StringBuffer(),
                    new FieldPosition(0));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("yyyy", printer.getPattern());
        }
    }

    @Test
    public void testGetPattern() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("yyyy-MM-dd", printer.getPattern());
    }

    @Test
    public void testGetTimeZone() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("GMT+05:30");
        FastDatePrinter printer = new FastDatePrinter("yyyy",
                zone, Locale.US);
        assertSame(zone, printer.getTimeZone());
    }

    @Test
    public void testGetLocale() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("UTC"), Locale.FRANCE);
        assertSame(Locale.FRANCE, printer.getLocale());
    }

    @Test
    public void testLengthEstimateForPattern() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy-MM-dd",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals(10, printer.getMaxLengthEstimate());
    }

    @Test
    public void testLengthEstimateForEmptyPattern() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals(0, printer.getMaxLengthEstimate());
    }

    @Test
    public void testEqualsAndHashCodeForEqualPrinters() throws Exception {
        FastDatePrinter first = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        FastDatePrinter second = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testEqualsRejectsDifferentPatterns() throws Exception {
        FastDatePrinter first = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        FastDatePrinter second = new FastDatePrinter("yy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsRejectsDifferentTimeZones() throws Exception {
        FastDatePrinter first = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        FastDatePrinter second = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("GMT+01:00"), Locale.US);
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsRejectsDifferentLocalesAndNull() throws Exception {
        FastDatePrinter first = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        FastDatePrinter second = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("UTC"), Locale.FRANCE);
        assertFalse(first.equals(second));
        assertFalse(first.equals(null));
    }

    @Test
    public void testToString() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("FastDatePrinter[yyyy,en_US,UTC]", printer.toString());
    }

    @Test
    public void testQuotedLiteralFormatting() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("'day:' d",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("day: 1", printer.format(0L));
    }

    @Test
    public void testEscapedQuoteLiteralFormatting() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("''yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("'1970", printer.format(0L));
    }

    @Test
    public void testTwoDigitMonthAndDayAtSingleDigitBoundary() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("MM/dd",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("01/01", printer.format(0L));
    }

    @Test
    public void testTwoDigitMonthAndDayAtTwoDigitBoundary() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("MM/dd",
                TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = new GregorianCalendar(
                TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2000, Calendar.DECEMBER, 31);
        assertEquals("12/31", printer.format(calendar));
    }

    @Test
    public void testTwoDigitYearTruncatesToLastTwoDigits() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("yy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = new GregorianCalendar(
                TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2005, Calendar.JANUARY, 1);
        assertEquals("05", printer.format(calendar));
    }

    @Test
    public void testPaddedHourAtZeroAndTwentyThree() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("HH",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("00", printer.format(0L));
        Calendar calendar = new GregorianCalendar(
                TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 1, 23, 0, 0);
        assertEquals("23", printer.format(calendar));
    }

    @Test
    public void testTwelveHourPatternMapsMidnightAndNoon() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("hh a",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("12 AM", printer.format(0L));
        Calendar calendar = new GregorianCalendar(
                TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 1, 12, 0, 0);
        assertEquals("12 PM", printer.format(calendar));
    }

    @Test
    public void testTwentyFourHourPatternMapsMidnightToTwentyFour() throws Exception {
        FastDatePrinter printer = new FastDatePrinter("kk",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("24", printer.format(0L));
        Calendar calendar = new GregorianCalendar(
                TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(1970, Calendar.JANUARY, 1, 23, 0, 0);
        assertEquals("23", printer.format(calendar));
    }

    @Test
    public void testTimeZoneNumericFormsAtUtc() throws Exception {
        FastDatePrinter compact = new FastDatePrinter("Z",
                TimeZone.getTimeZone("UTC"), Locale.US);
        FastDatePrinter colon = new FastDatePrinter("ZZ",
                TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("+0000", compact.format(0L));
        assertEquals("+00:00", colon.format(0L));
    }

    @Test
    public void testTimeZoneNumericFormsAtPositiveHalfHour() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("GMT+05:30");
        FastDatePrinter compact = new FastDatePrinter("Z", zone, Locale.US);
        FastDatePrinter colon = new FastDatePrinter("ZZ", zone, Locale.US);
        assertEquals("+0530", compact.format(0L));
        assertEquals("+05:30", colon.format(0L));
    }
}
