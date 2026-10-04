package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.StringUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DurationFormatUtilsTest {
    @Test
    public void testHmsZero() throws Exception {
        assertEquals("0:00:00.000", DurationFormatUtils.formatDurationHMS(0));
    }

    @Test
    public void testHmsOneMillisecond() throws Exception {
        assertEquals("0:00:00.001", DurationFormatUtils.formatDurationHMS(1));
    }

    @Test
    public void testHmsOneHourAndOneSecond() throws Exception {
        assertEquals("1:00:01.000", DurationFormatUtils.formatDurationHMS(3601000));
    }

    @Test
    public void testHmsOverOneDay() throws Exception {
        assertEquals("24:00:00.000", DurationFormatUtils.formatDurationHMS(86400000));
    }

    @Test
    public void testIsoZero() throws Exception {
        assertEquals("P0Y0M0DT0H0M0.000S", DurationFormatUtils.formatDurationISO(0));
    }

    @Test
    public void testIsoOneDayAndRemainder() throws Exception {
        assertEquals("P0Y0M1DT1H2M3.004S",
                DurationFormatUtils.formatDurationISO(90123004));
    }

    @Test
    public void testDurationPaddingAndRepeatedTokens() throws Exception {
        assertEquals("01:02:03.004",
                DurationFormatUtils.formatDuration(3723004, "HH:mm:ss.SSS"));
    }

    @Test
    public void testDurationUnpadded() throws Exception {
        assertEquals("1:2:3.004",
                DurationFormatUtils.formatDuration(3723004, "H:m:s.S", false));
    }

    @Test
    public void testDurationLiteralPatternCharacters() throws Exception {
        assertEquals("1 day 0", DurationFormatUtils.formatDuration(
                86400000L, "d' day 'H"));
    }

    @Test
    public void testDurationOnlySecondsAndMilliseconds() throws Exception {
        assertEquals("61.234",
                DurationFormatUtils.formatDuration(61234, "s.SSS"));
    }

    @Test
    public void testWordsSuppressLeadingAndTrailingZeroes() throws Exception {
        assertEquals("1 minute 2 seconds",
                DurationFormatUtils.formatDurationWords(62000, true, true));
    }

    @Test
    public void testWordsDoNotSuppressZeroes() throws Exception {
        assertEquals("0 days 0 hours 0 minutes 1 second",
                DurationFormatUtils.formatDurationWords(1000, false, false));
    }

    @Test
    public void testWordsPluralizesOneDay() throws Exception {
        assertEquals("1 day",
                DurationFormatUtils.formatDurationWords(86400000, true, true));
    }

    @Test
    public void testWordsRetainZeroSecondsWhenTrailingSuppressionOff() throws Exception {
        assertEquals("1 minute 0 seconds",
                DurationFormatUtils.formatDurationWords(60000, true, false));
    }

    @Test
    public void testPeriodBelowTwentyEightDayThresholdUsesDurationFields() throws Exception {
        assertEquals("27", DurationFormatUtils.formatPeriod(
                0, 27L * 86400000, "d"));
    }

    @Test
    public void testPeriodAtTwentyEightDayThresholdUsesCalendarFields() throws Exception {
        assertEquals("56", DurationFormatUtils.formatPeriod(
                0, 28L * 86400000, "d", false, TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testPeriodWithinSameMonth() throws Exception {
        Calendar start = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        start.clear();
        start.set(2020, Calendar.JANUARY, 1);
        Calendar end = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        end.clear();
        end.set(2020, Calendar.JANUARY, 2);
        assertEquals("1", DurationFormatUtils.formatPeriod(
                start.getTimeInMillis(), end.getTimeInMillis(), "d"));
    }

    @Test
    public void testPeriodWithHoursMinutesSecondsAndMillis() throws Exception {
        assertEquals("1:2:3.004", DurationFormatUtils.formatPeriod(
                0, 3723004, "H:m:s.S"));
    }

    @Test
    public void testPeriodIsoZeroLength() throws Exception {
        assertEquals("P0Y0M0DT0H0M0.000S", DurationFormatUtils.formatPeriodISO(0, 0));
    }

    @Test
    public void testPeriodCombinesYearsWhenYearTokenAbsent() throws Exception {
        Calendar start = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        start.clear();
        start.set(2019, Calendar.JANUARY, 1);
        Calendar end = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        end.clear();
        end.set(2020, Calendar.JANUARY, 1);
        assertEquals("365", DurationFormatUtils.formatPeriod(
                start.getTimeInMillis(), end.getTimeInMillis(), "d",
                false, TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testConstructorObjectEqualsItself() throws Exception {
        DurationFormatUtils value = new DurationFormatUtils();
        assertTrue(value.equals(value));
    }

    @Test
    public void testConstructorObjectNotEqualToNull() throws Exception {
        assertFalse(new DurationFormatUtils().equals(null));
    }

    @Test
    public void testConstructorObjectHashCodeStable() throws Exception {
        DurationFormatUtils value = new DurationFormatUtils();
        assertEquals(value.hashCode(), value.hashCode());
    }

    @Test
    public void testConstructorObjectToStringNotNull() throws Exception {
        assertNotNull(new DurationFormatUtils().toString());
    }
}
