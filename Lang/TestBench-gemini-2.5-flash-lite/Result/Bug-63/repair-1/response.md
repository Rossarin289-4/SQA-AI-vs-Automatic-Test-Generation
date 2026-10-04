```java
package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.StringUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DurationFormatUtilsTest {
    @Test
    public void testFormatDurationHMS_zero() throws Exception {
        assertEquals("0:00:00.000", DurationFormatUtils.formatDurationHMS(0));
    }

    @Test
    public void testFormatDurationHMS_milliseconds() throws Exception {
        assertEquals("0:00:00.001", DurationFormatUtils.formatDurationHMS(1));
        assertEquals("0:00:00.999", DurationFormatUtils.formatDurationHMS(999));
    }

    @Test
    public void testFormatDurationHMS_seconds() throws Exception {
        assertEquals("0:00:01.000", DurationFormatUtils.formatDurationHMS(1000));
        assertEquals("0:00:59.999", DurationFormatUtils.formatDurationHMS(59999));
        assertEquals("0:01:00.000", DurationFormatUtils.formatDurationHMS(60000));
    }

    @Test
    public void testFormatDurationHMS_minutes() throws Exception {
        assertEquals("0:01:00.000", DurationFormatUtils.formatDurationHMS(60000));
        assertEquals("0:59:59.999", DurationFormatUtils.formatDurationHMS(59 * 60000 + 59 * 1000 + 999));
        assertEquals("1:00:00.000", DurationFormatUtils.formatDurationHMS(60 * 60000));
    }

    @Test
    public void testFormatDurationHMS_hours() throws Exception {
        assertEquals("1:00:00.000", DurationFormatUtils.formatDurationHMS(60 * 60000));
        assertEquals("23:59:59.999", DurationFormatUtils.formatDurationHMS(23 * 60 * 60000 + 59 * 60000 + 59 * 1000 + 999));
        assertEquals("24:00:00.000", DurationFormatUtils.formatDurationHMS(24 * 60 * 60000));
    }

    @Test
    public void testFormatDurationHMS_large() throws Exception {
        assertEquals("240:00:00.000", DurationFormatUtils.formatDurationHMS(10 * 24 * 60 * 60000));
    }
    
    @Test
    public void testFormatDurationISO_zero() throws Exception {
        assertEquals("P0Y0M0DT0H0M0.0S", DurationFormatUtils.formatDurationISO(0));
    }

    @Test
    public void testFormatDurationISO_milliseconds() throws Exception {
        assertEquals("P0Y0M0DT0H0M0.001S", DurationFormatUtils.formatDurationISO(1));
        assertEquals("P0Y0M0DT0H0M0.999S", DurationFormatUtils.formatDurationISO(999));
    }

    @Test
    public void testFormatDurationISO_seconds() throws Exception {
        assertEquals("P0Y0M0DT0H0M1.000S", DurationFormatUtils.formatDurationISO(1000));
        assertEquals("P0Y0M0DT0H0M59.999S", DurationFormatUtils.formatDurationISO(59999));
        assertEquals("P0Y0M0DT0H1M0.000S", DurationFormatUtils.formatDurationISO(60000));
    }

    @Test
    public void testFormatDurationISO_minutes() throws Exception {
        assertEquals("P0Y0M0DT0H1M0.000S", DurationFormatUtils.formatDurationISO(60000));
        assertEquals("P0Y0M0DT0H59M59.999S", DurationFormatUtils.formatDurationISO(59 * 60000 + 59 * 1000 + 999));
        assertEquals("P0Y0M0DT1H0M0.000S", DurationFormatUtils.formatDurationISO(60 * 60000));
    }

    @Test
    public void testFormatDurationISO_hours() throws Exception {
        assertEquals("P0Y0M0DT1H0M0.000S", DurationFormatUtils.formatDurationISO(60 * 60000));
        assertEquals("P0Y0M0DT23H59M59.999S", DurationFormatUtils.formatDurationISO(23 * 60 * 60000 + 59 * 60000 + 59 * 1000 + 999));
        assertEquals("P0Y0M0DT24H0M0.000S", DurationFormatUtils.formatDurationISO(24 * 60 * 60000));
    }

    @Test
    public void testFormatDurationISO_days() throws Exception {
        assertEquals("P1D0H0M0.0S", DurationFormatUtils.formatDuration(DateUtils.MILLIS_PER_DAY, DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false));
        assertEquals("P7D0H0M0.0S", DurationFormatUtils.formatDuration(7 * DateUtils.MILLIS_PER_DAY, DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false));
    }
    
    @Test
    public void testFormatDurationISO_years() throws Exception {
        // This is a bit tricky because the format string 'PyyyyY' allows years.
        // However, formatDuration logic only uses days and lower.
        // The 'Y' token is NOT handled in formatDuration.
        // Let's test the days part correctly with the ISO format.
        assertEquals("P1Y0M0DT0H0M0.0S", DurationFormatUtils.formatDuration(365 * DateUtils.MILLIS_PER_DAY, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false));
    }


    @Test
    public void testFormatDuration_emptyFormat() throws Exception {
        assertEquals("", DurationFormatUtils.formatDuration(12345L, ""));
    }

    @Test
    public void testFormatDuration_literalText() throws Exception {
        assertEquals("Hello", DurationFormatUtils.formatDuration(0, "'Hello'"));
    }

    @Test
    public void testFormatDuration_mixedLiteralsAndTokens() throws Exception {
        assertEquals("Day: 1", DurationFormatUtils.formatDuration(DateUtils.MILLIS_PER_DAY, "Day: d"));
    }

    @Test
    public void testFormatDuration_padding() throws Exception {
        assertEquals("01:02:03.004", DurationFormatUtils.formatDuration(1 * DateUtils.MILLIS_PER_HOUR + 2 * DateUtils.MILLIS_PER_MINUTE + 3 * DateUtils.MILLIS_PER_SECOND + 4, "H:mm:ss.SSS", true));
    }

    @Test
    public void testFormatDuration_noPadding() throws Exception {
        assertEquals("1:2:3.4", DurationFormatUtils.formatDuration(1 * DateUtils.MILLIS_PER_HOUR + 2 * DateUtils.MILLIS_PER_MINUTE + 3 * DateUtils.MILLIS_PER_SECOND + 4, "H:mm:ss.SSS", false));
    }

    @Test
    public void testFormatDuration_overflowMilliseconds() throws Exception {
        // When seconds are not in the format, milliseconds should absorb seconds.
        assertEquals("1", DurationFormatUtils.formatDuration(1500, "S"));
        assertEquals("1500", DurationFormatUtils.formatDuration(1500, "SSS")); 
    }

    @Test
    public void testFormatDuration_overflowMillisecondsWithSeconds() throws Exception {
        // When seconds are in the format, milliseconds should be handled separately.
        // The 'S' token when preceded by 's' adds milliseconds to seconds if it's > 999.
        assertEquals("0:00:01.500", DurationFormatUtils.formatDuration(1500, "H:mm:ss.SSS"));
    }

    @Test
    public void testFormatDurationWords_noSuppression() throws Exception {
        assertEquals("0 days 0 hours 0 minutes 0 seconds", DurationFormatUtils.formatDurationWords(0, false, false));
        assertEquals("1 day 1 hour 1 minute 1 second", DurationFormatUtils.formatDurationWords(DateUtils.MILLIS_PER_DAY + DateUtils.MILLIS_PER_HOUR + DateUtils.MILLIS_PER_MINUTE + 1000, false, false));
    }

    @Test
    public void testFormatDurationWords_suppressLeadingZeroElements() throws Exception {
        assertEquals("1 hour 1 minute 1 second", DurationFormatUtils.formatDurationWords(DateUtils.MILLIS_PER_HOUR + DateUtils.MILLIS_PER_MINUTE + 1000, true, false));
        assertEquals("1 minute 1 second", DurationFormatUtils.formatDurationWords(DateUtils.MILLIS_PER_MINUTE + 1000, true, false));
        assertEquals("1 second", DurationFormatUtils.formatDurationWords(1000, true, false));
    }

    @Test
    public void testFormatDurationWords_suppressTrailingZeroElements() throws Exception {
        assertEquals("1 day 1 hour 1 minute", DurationFormatUtils.formatDurationWords(DateUtils.MILLIS_PER_DAY + DateUtils.MILLIS_PER_HOUR + DateUtils.MILLIS_PER_MINUTE, false, true));
        assertEquals("1 day 1 hour", DurationFormatUtils.formatDurationWords(DateUtils.MILLIS_PER_DAY + DateUtils.MILLIS_PER_HOUR, false, true));
        assertEquals("1 day", DurationFormatUtils.formatDurationWords(DateUtils.MILLIS_PER_DAY, false, true));
    }

    @Test
    public void testFormatDurationWords_suppressAllZeroElements() throws Exception {
        assertEquals("1 second", DurationFormatUtils.formatDurationWords(DateUtils.MILLIS_PER_DAY + DateUtils.MILLIS_PER_HOUR + DateUtils.MILLIS_PER_MINUTE + 1000, true, true));
    }

    @Test
    public void testFormatDurationWords_plurals() throws Exception {
        assertEquals("1 day 1 hour 1 minute 1 second", DurationFormatUtils.formatDurationWords(DateUtils.MILLIS_PER_DAY + DateUtils.MILLIS_PER_HOUR + DateUtils.MILLIS_PER_MINUTE + 1000, false, false));
        assertEquals("1 day 1 hour 1 minute 1 second", DurationFormatUtils.formatDurationWords(DateUtils.MILLIS_PER_DAY + DateUtils.MILLIS_PER_HOUR + DateUtils.MILLIS_PER_MINUTE + 1000, false, false));
        assertEquals("2 days 2 hours 2 minutes 2 seconds", DurationFormatUtils.formatDurationWords(2 * DateUtils.MILLIS_PER_DAY + 2 * DateUtils.MILLIS_PER_HOUR + 2 * DateUtils.MILLIS_PER_MINUTE + 2000, false, false));
    }
    
    @Test
    public void testFormatPeriodISO_zero() throws Exception {
        assertEquals("P0Y0M0DT0H0M0.0S", DurationFormatUtils.formatPeriodISO(0, 0));
    }

    @Test
    public void testFormatPeriodISO_sameDay() throws Exception {
        long dayMillis = DateUtils.MILLIS_PER_DAY;
        assertEquals("P0Y0M0DT0H0M0.0S", DurationFormatUtils.formatPeriodISO(0, dayMillis));
    }

    @Test
    public void testFormatPeriodISO_acrossDays() throws Exception {
        long start = 10 * DateUtils.MILLIS_PER_HOUR; // 10 AM
        long end = 12 * DateUtils.MILLIS_PER_HOUR; // 12 PM next day
        assertEquals("P0Y0M1DT2H0M0.0S", DurationFormatUtils.formatPeriod(start, start + DateUtils.MILLIS_PER_DAY + 2 * DateUtils.MILLIS_PER_HOUR, DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false, TimeZone.getTimeZone("UTC")));
    }
    
    @Test
    public void testFormatPeriod_durationLessThan28Days() throws Exception {
        // If duration is less than 28 days, it should delegate to formatDuration
        long duration = 10 * DateUtils.MILLIS_PER_DAY; // 10 days
        assertEquals("10 days", DurationFormatUtils.formatPeriod(0, duration, "d' days'"));
    }

    @Test
    public void testFormatPeriod_durationMoreThan28Days() throws Exception {
        // If duration is more than 28 days, it should use calendar logic
        long start = new Date(2023-1900, Calendar.JANUARY, 1).getTime(); // Jan 1, 2023
        long end = new Date(2023-1900, Calendar.FEBRUARY, 1).getTime(); // Feb 1, 2023
        // This is 31 days.
        assertEquals("31 days", DurationFormatUtils.formatPeriod(start, end, "d' days'", false, TimeZone.getTimeZone("UTC")));
    }
    
    @Test
    public void testFormatPeriod_handlesMonthRolloverCorrectly() throws Exception {
        // Test case for when days go negative and need to borrow from months.
        // Example: Jan 15 to March 10.
        // If we calculate days first: 1 month and 26 days.
        // If we calculate month first: 1 month and 23 days.
        // The code should handle this.
        Calendar calStart = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calStart.set(2023, Calendar.JANUARY, 15, 0, 0, 0);
        Calendar calEnd = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calEnd.set(2023, Calendar.MARCH, 10, 0, 0, 0);
        // Expected: 1 month and 23 days (Jan 15 to Feb 15 is 1 month, Feb 15 to Mar 10 is 23 days)
        assertEquals("1 months 23 days", DurationFormatUtils.formatPeriod(calStart.getTimeInMillis(), calEnd.getTimeInMillis(), "M' months 'd' days'", false, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testFormatPeriod_handlesYearRolloverCorrectly() throws Exception {
        Calendar calStart = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calStart.set(2023, Calendar.DECEMBER, 15, 0, 0, 0);
        Calendar calEnd = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calEnd.set(2024, Calendar.JANUARY, 10, 0, 0, 0);
        // Expected: 0 months, 26 days (Dec 15 to Jan 10 = 26 days)
        // The logic for months and years is complex.
        // Let's test the days component of this period.
        assertEquals("26 days", DurationFormatUtils.formatPeriod(calStart.getTimeInMillis(), calEnd.getTimeInMillis(), "d' days'", false, TimeZone.getTimeZone("UTC")));
    }
    
    @Test
    public void testFormatPeriod_noMonthsOrYearsInFormat() throws Exception {
        // Test that if M and y are not in the format string, they are accumulated into days.
        long start = new Date(2023-1900, Calendar.JANUARY, 1).getTime(); // Jan 1, 2023
        long end = new Date(2024-1900, Calendar.JANUARY, 1).getTime(); // Jan 1, 2024 (365 days)
        assertEquals("365 days", DurationFormatUtils.formatPeriod(start, end, "d' days'", false, TimeZone.getTimeZone("UTC")));
    }
    
    @Test
    public void testFormatPeriod_noDaysInFormat() throws Exception {
        // Test that if d is not in the format string, it is accumulated into hours.
        long start = new Date(2023-1900, Calendar.JANUARY, 1, 10, 0, 0).getTime(); // Jan 1, 2023, 10:00
        long end = new Date(2023-1900, Calendar.JANUARY, 2, 12, 0, 0).getTime(); // Jan 2, 2023, 12:00
        // Total duration is 26 hours.
        assertEquals("26 hours", DurationFormatUtils.formatPeriod(start, end, "H' hours'", false, TimeZone.getTimeZone("UTC")));
    }
    
    @Test
    public void testFormatPeriod_noHoursInFormat() throws Exception {
        // Test that if H is not in the format string, it is accumulated into minutes.
        long start = new Date(2023-1900, Calendar.JANUARY, 1, 10, 30, 0).getTime(); // Jan 1, 2023, 10:30
        long end = new Date(2023-1900, Calendar.JANUARY, 1, 11, 45, 0).getTime(); // Jan 1, 2023, 11:45
        // Total duration is 75 minutes.
        assertEquals("75 minutes", DurationFormatUtils.formatPeriod(start, end, "m' minutes'", false, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testFormatPeriod_noMinutesInFormat() throws Exception {
        // Test that if m is not in the format string, it is accumulated into seconds.
        long start = new Date(2023-1900, Calendar.JANUARY, 1, 10, 0, 30).getTime(); // Jan 1, 2023, 10:00:30
        long end = new Date(2023-1900, Calendar.JANUARY, 1, 10, 1, 15).getTime(); // Jan 1, 2023, 10:01:15
        // Total duration is 45 seconds.
        assertEquals("45 seconds", DurationFormatUtils.formatPeriod(start, end, "s' seconds'", false, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testFormatPeriod_noSecondsInFormat() throws Exception {
        // Test that if s is not in the format string, it is accumulated into milliseconds.
        long start = new Date(2023-1900, Calendar.JANUARY, 1, 10, 0, 0).getTime();
        long end = new Date(2023-1900, Calendar.JANUARY, 1, 10, 0, 0).getTime() + 1500; // 1.5 seconds
        // Total duration is 1500 milliseconds.
        assertEquals("1500 milliseconds", DurationFormatUtils.formatPeriod(start, end, "S' milliseconds'", false, TimeZone.getTimeZone("UTC")));
    }
}
```