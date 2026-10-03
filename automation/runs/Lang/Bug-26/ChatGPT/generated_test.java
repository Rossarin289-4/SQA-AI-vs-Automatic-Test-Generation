package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateFormatLang26Test {

    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");

    private static Date createBoundaryDate() {
        Calendar calendar = new GregorianCalendar(UTC);
        calendar.clear();
        calendar.set(2011, Calendar.JANUARY, 2, 12, 0, 0);
        return calendar.getTime();
    }

    private static String formatWithReference(
            String pattern, Date date, TimeZone timeZone, Locale locale) {

        SimpleDateFormat reference =
                new SimpleDateFormat(pattern, locale);
        reference.setTimeZone(timeZone);
        return reference.format(date);
    }

    @Test
    public void testFormatDateUsesConfiguredLocaleForWeekFields() {
        Locale originalDefault = Locale.getDefault();

        try {
            Locale.setDefault(Locale.US);

            Locale formatterLocale = Locale.GERMANY;
            String pattern = "YYYY-'W'ww EEEE";
            Date date = createBoundaryDate();

            FastDateFormat format =
                    FastDateFormat.getInstance(
                            pattern, UTC, formatterLocale);

            String expected =
                    formatWithReference(
                            pattern, date, UTC, formatterLocale);

            assertEquals(expected, format.format(date));
        } finally {
            Locale.setDefault(originalDefault);
        }
    }

    @Test
    public void testFormatDateDoesNotDependOnOppositeDefaultLocale() {
        Locale originalDefault = Locale.getDefault();

        try {
            Locale.setDefault(Locale.GERMANY);

            Locale formatterLocale = Locale.US;
            String pattern = "YYYY-'W'ww EEEE";
            Date date = createBoundaryDate();

            FastDateFormat format =
                    FastDateFormat.getInstance(
                            pattern, UTC, formatterLocale);

            String expected =
                    formatWithReference(
                            pattern, date, UTC, formatterLocale);

            assertEquals(expected, format.format(date));
        } finally {
            Locale.setDefault(originalDefault);
        }
    }
}
