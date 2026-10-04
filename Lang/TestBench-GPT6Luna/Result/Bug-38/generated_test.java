package org.apache.commons.lang3.time;

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
import org.apache.commons.lang3.Validate;

public class FastDateFormatTest {
    @Test
    public void testFormatObjectDate() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("1970-01-02", f.format(new Date(86400000L), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatObjectLong() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("HH:mm:ss", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("00:00:00", f.format(Long.valueOf(0L), new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatObjectCalendar() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        Calendar c = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        c.setTimeInMillis(0L);
        assertEquals("1970-01-01", f.format(c, new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatObjectUnsupported() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        try {
            f.format("1970", new StringBuffer(), new FieldPosition(0));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals("yyyy", f.getPattern());
    }

    @Test
    public void testParseObjectResetsPositionAndReturnsNull() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        ParsePosition pos = new ParsePosition(4);
        pos.setErrorIndex(7);
        assertNull(f.parseObject("1970", pos));
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testGetPattern() throws Exception {
        assertEquals("yyyy-MM-dd", FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US).getPattern());
    }

    @Test
    public void testGetTimeZoneAndOverrideFlagWhenForced() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("GMT+05:30");
        FastDateFormat f = FastDateFormat.getInstance("HH", zone, Locale.US);
        assertEquals(zone, f.getTimeZone());
        assertTrue(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testTimeZoneOverrideFormatting() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("HH:mm", TimeZone.getTimeZone("GMT+05:30"), Locale.US);
        Calendar c = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        c.setTimeInMillis(0L);
        assertEquals("05:30", f.format(c));
    }

    @Test
    public void testUnforcedCalendarKeepsCalendarZone() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("HH:mm", Locale.US);
        Calendar c = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"), Locale.US);
        c.setTimeInMillis(0L);
        assertEquals("02:00", f.format(c));
        assertFalse(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetLocaleWhenForced() throws Exception {
        assertEquals(Locale.US, FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US).getLocale());
    }

    @Test
    public void testMaxLengthEstimateForPattern() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals(10, f.getMaxLengthEstimate());
    }

    @Test
    public void testEqualsAndHashCodeForSameConfiguration() throws Exception {
        FastDateFormat a = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat b = FastDateFormat.getInstance("yyyy-MM-dd", TimeZone.getTimeZone("UTC"), Locale.US);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testEqualsDistinguishesPatterns() throws Exception {
        FastDateFormat a = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        FastDateFormat b = FastDateFormat.getInstance("yy", TimeZone.getTimeZone("UTC"), Locale.US);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsRejectsNullAndOtherType() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        assertFalse(f.equals(null));
        assertFalse(f.equals("yyyy"));
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("FastDateFormat[yyyy]", FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US).toString());
    }

    @Test
    public void testNoColonTimeZoneAtZeroOffset() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("Z", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("+0000", f.format(new Date(0L)));
    }

    @Test
    public void testColonTimeZoneAtPositiveOffset() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("ZZ", TimeZone.getTimeZone("GMT+05:30"), Locale.US);
        assertEquals("+05:30", f.format(new Date(0L)));
    }

    @Test
    public void testNegativeTimeZoneOffset() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("ZZ", TimeZone.getTimeZone("GMT-03:30"), Locale.US);
        assertEquals("-03:30", f.format(new Date(0L)));
    }

    @Test
    public void testQuotedLiteralsAndEscapedQuote() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("'day' d 'o''clock'", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("day 1 o'clock", f.format(new Date(0L)));
    }

    @Test
    public void testMonthTextAndNumericForms() throws Exception {
        Date date = new GregorianCalendar(2020, Calendar.JANUARY, 2, 0, 0, 0).getTime();
        FastDateFormat f = FastDateFormat.getInstance("M MM MMM MMMM", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("1 01 Jan January", f.format(date));
    }

    @Test
    public void testHourBoundaryForTwelveAndTwentyFourHourFields() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("h HH k KK", TimeZone.getTimeZone("UTC"), Locale.US);
        assertEquals("12 00 24 00", f.format(new Date(0L)));
    }

    @Test
    public void testFormatAppendsToExistingBufferAndReturnsIt() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", TimeZone.getTimeZone("UTC"), Locale.US);
        StringBuffer buffer = new StringBuffer("year=");
        StringBuffer returned = f.format(new Date(0L), buffer);
        assertSame(buffer, returned);
        assertEquals("year=1970", buffer.toString());
    }

    @Test
    public void testDateStyleFactoryReturnsPatternFormatter() throws Exception {
        FastDateFormat f = FastDateFormat.getDateInstance(FastDateFormat.SHORT, Locale.US);
        assertEquals(DateFormat.getDateInstance(DateFormat.SHORT, Locale.US).format(new Date(0L)), f.format(new Date(0L)));
    }

    @Test
    public void testTimeStyleFactoryReturnsPatternFormatter() throws Exception {
        FastDateFormat f = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, TimeZone.getTimeZone("UTC"), Locale.US);
        SimpleDateFormat reference = (SimpleDateFormat) DateFormat.getTimeInstance(DateFormat.SHORT, Locale.US);
        reference.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(reference.format(new Date(0L)), f.format(new Date(0L)));
    }

    @Test
    public void testDateTimeStyleFactoryReturnsPatternFormatter() throws Exception {
        FastDateFormat f = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, TimeZone.getTimeZone("UTC"), Locale.US);
        SimpleDateFormat reference = (SimpleDateFormat) DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.US);
        reference.setTimeZone(TimeZone.getTimeZone("UTC"));
        assertEquals(reference.format(new Date(0L)), f.format(new Date(0L)));
    }

    @Test
    public void testGetDefaultInstanceHasNonemptyPattern() throws Exception {
        FastDateFormat f = FastDateFormat.getInstance();
        assertEquals(f.getPattern().length(), f.getMaxLengthEstimate() >= 0 ? f.getPattern().length() : -1);
    }
}
