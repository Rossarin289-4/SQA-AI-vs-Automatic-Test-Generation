package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.commons.lang.Validate;

public class FastDateFormatTest {
    @Test
    public void testGetInstanceUsesStableDefaultPattern() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance();
        assertEquals(new SimpleDateFormat().toPattern(), format.getPattern());
    }

    @Test
    public void testGetDateInstanceForShortStyle() throws Exception {
        FastDateFormat format = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        assertEquals(((SimpleDateFormat) DateFormat.getDateInstance(
                FastDateFormat.SHORT, Locale.getDefault())).toPattern(), format.getPattern());
    }

    @Test
    public void testGetTimeInstanceForShortStyle() throws Exception {
        FastDateFormat format = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        assertEquals(((SimpleDateFormat) DateFormat.getTimeInstance(
                FastDateFormat.SHORT, Locale.getDefault())).toPattern(), format.getPattern());
    }

    @Test
    public void testGetDateTimeInstanceForShortStyles() throws Exception {
        FastDateFormat format = FastDateFormat.getDateTimeInstance(
                FastDateFormat.SHORT, FastDateFormat.SHORT);
        assertEquals(((SimpleDateFormat) DateFormat.getDateTimeInstance(
                FastDateFormat.SHORT, FastDateFormat.SHORT, Locale.getDefault())).toPattern(),
                format.getPattern());
    }

    @Test
    public void testFormatObjectDate() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"),
                Locale.US);
        Date date = new GregorianCalendar(2000, Calendar.JANUARY, 2).getTime();
        assertEquals("2000-01-02", format.format((Object) date, new StringBuffer(),
                new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatObjectCalendarAndAppendBuffer() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("HH:mm", TimeZone.getTimeZone("UTC"),
                Locale.US);
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2000, Calendar.JANUARY, 1, 0, 5);
        StringBuffer buffer = new StringBuffer("x");
        assertSame(buffer, format.format((Object) calendar, buffer, new FieldPosition(0)));
        assertEquals("x00:05", buffer.toString());
    }

    @Test
    public void testFormatObjectLong() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"),
                Locale.US);
        assertEquals("1970-01-01", format.format((Object) Long.valueOf(0),
                new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatObjectRejectsUnsupportedInput() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"),
                Locale.US);
        try {
            format.format("not a date", new StringBuffer(), new FieldPosition(0));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testParseObjectResetsPositionAndReturnsNull() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"),
                Locale.US);
        ParsePosition position = new ParsePosition(3);
        position.setErrorIndex(4);
        assertNull(format.parseObject("2000", position));
        assertEquals(0, position.getIndex());
        assertEquals(0, position.getErrorIndex());
    }

    @Test
    public void testGetPatternAndStringForm() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM", TimeZone.getTimeZone("UTC"),
                Locale.US);
        assertEquals("yyyy-MM", format.getPattern());
        assertEquals("FastDateFormat[yyyy-MM]", format.toString());
    }

    @Test
    public void testTimeZoneAndLocaleAccessors() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("GMT+02:00");
        FastDateFormat format = FastDateFormat.getInstance("yyyy", zone, Locale.US);
        assertEquals(zone, format.getTimeZone());
        assertTrue(format.getTimeZoneOverridesCalendar());
        assertEquals(Locale.US, format.getLocale());
    }

    @Test
    public void testUnforcedTimeZoneDoesNotOverrideCalendar() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("yyyy");
        assertFalse(format.getTimeZoneOverridesCalendar());
        assertEquals("yyyy", format.getPattern());
    }

    @Test
    public void testMaximumLengthEstimateForPaddedFields() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"),
                Locale.US);
        assertEquals(10, format.getMaxLengthEstimate());
    }

    @Test
    public void testEqualsAndHashCodeForSameConfiguration() throws Exception {
        FastDateFormat first = FastDateFormat.getInstance("yyyy-MM", TimeZone.getTimeZone("UTC"),
                Locale.US);
        FastDateFormat second = FastDateFormat.getInstance("yyyy-MM", TimeZone.getTimeZone("UTC"),
                Locale.US);
        assertTrue(first.equals(second));
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testEqualsRejectsDifferentPatternAndOtherTypes() throws Exception {
        FastDateFormat first = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"),
                Locale.US);
        FastDateFormat second = FastDateFormat.getInstance("MM", TimeZone.getTimeZone("UTC"),
                Locale.US);
        assertFalse(first.equals(second));
        assertFalse(first.equals("yyyy"));
        assertFalse(first.equals(null));
    }

    @Test
    public void testEqualsIncludesForcedTimeZoneState() throws Exception {
        FastDateFormat forced = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"),
                Locale.US);
        FastDateFormat unforced = FastDateFormat.getInstance("yyyy", Locale.US);
        assertFalse(forced.equals(unforced));
    }

    @Test
    public void testFormattingNumericFieldWidthsAtBoundary() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("d|dd|ddd", TimeZone.getTimeZone("UTC"),
                Locale.US);
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2000, Calendar.JANUARY, 1);
        assertEquals("1|01|001", format.format(calendar));
        calendar.set(2000, Calendar.JANUARY, 10);
        assertEquals("10|10|010", format.format(calendar));
    }

    @Test
    public void testMonthAndYearFormattingAcrossSmallAndLargeValues() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("M|MM|yy|yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2000, Calendar.JANUARY, 1);
        assertEquals("1|01|00|2000", format.format(calendar));
        calendar.set(2000, Calendar.DECEMBER, 1);
        assertEquals("12|12|00|2000", format.format(calendar));
    }

    @Test
    public void testHourSpecialCasesAtMidnightAndNoon() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("h|hh|H|HH|k|kk|K",
                TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2000, Calendar.JANUARY, 1, 0, 0);
        assertEquals("12|12|0|00|24|24|0", format.format(calendar));
        calendar.set(2000, Calendar.JANUARY, 1, 12, 0);
        assertEquals("12|12|12|12|12|12|0", format.format(calendar));
    }

    @Test
    public void testLiteralEscapingAndQuotedPatternLetters() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("'day' '' yyyy",
                TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        calendar.clear();
        calendar.set(2000, Calendar.JANUARY, 1);
        assertEquals("day ' 2000", format.format(calendar));
    }

    @Test
    public void testTimezoneNumberFormatsPositiveAndNegativeOffsets() throws Exception {
        FastDateFormat compact = FastDateFormat.getInstance("Z", TimeZone.getTimeZone("GMT+05:30"),
                Locale.US);
        FastDateFormat colon = FastDateFormat.getInstance("ZZ", TimeZone.getTimeZone("GMT-03:30"),
                Locale.US);
        Date date = new Date(0);
        assertEquals("+0530", compact.format(date));
        assertEquals("-03:30", colon.format(date));
    }

    @Test
    public void testFormatAppendsToExistingBuffer() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"),
                Locale.US);
        StringBuffer buffer = new StringBuffer("prefix:");
        assertSame(buffer, format.format(new Date(0), buffer));
        assertEquals("prefix:1970", buffer.toString());
    }

    @Test
    public void testCalendarTimezoneIsUsedWhenFormatterZoneIsUnforced() throws Exception {
        FastDateFormat format = FastDateFormat.getInstance("HH:mm");
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"), Locale.US);
        calendar.clear();
        calendar.set(2000, Calendar.JANUARY, 1, 12, 0);
        assertEquals("12:00", format.format(calendar));
    }
}
