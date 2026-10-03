package org.apache.commons.lang.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateFormatLang50Test {

    @Test
    public void testDefaultLocaleChangeForShortDate() {
        Locale originalLocale = Locale.getDefault();

        try {
            Locale firstLocale = Locale.US;
            Locale secondLocale = Locale.GERMANY;

            Locale.setDefault(firstLocale);

            FastDateFormat first =
                    FastDateFormat.getDateInstance(FastDateFormat.SHORT);

            String expectedFirstPattern =
                    ((java.text.SimpleDateFormat)
                            DateFormat.getDateInstance(FastDateFormat.SHORT, first))
                            .toPattern();

            assertEquals(expectedFirstPattern, first.getPattern());

            Locale.setDefault(secondLocale);

            FastDateFormat second =
                    FastDateFormat.getDateInstance(FastDateFormat.SHORT);

            String expectedSecondPattern =
                    ((java.text.SimpleDateFormat)
                            DateFormat.getDateInstance(FastDateFormat.SHORT, second))
                            .toPattern();

            assertEquals(expectedSecondPattern, second.getPattern());

        } finally {
            Locale.setDefault(originalLocale);
        }
    }

    @Test
    public void testDefaultLocaleChangeForMediumDate() {
        Locale originalLocale = Locale.getDefault();

        try {
            Locale firstLocale = Locale.US;
            Locale secondLocale = Locale.GERMANY;

            Locale.setDefault(firstLocale);

            FastDateFormat first =
                    FastDateFormat.getDateInstance(FastDateFormat.MEDIUM);

            String expectedFirstPattern =
                    ((java.text.SimpleDateFormat)
                            DateFormat.getDateInstance(FastDateFormat.MEDIUM, first))
                            .toPattern();

            assertEquals(expectedFirstPattern, first.getPattern());

            Locale.setDefault(secondLocale);

            FastDateFormat second =
                    FastDateFormat.getDateInstance(FastDateFormat.MEDIUM);

            String expectedSecondPattern =
                    ((java.text.SimpleDateFormat)
                            DateFormat.getDateInstance(FastDateFormat.MEDIUM, second))
                            .toPattern();

            assertEquals(expectedSecondPattern, second.getPattern());

        } finally {
            Locale.setDefault(originalLocale);
        }
    }

    @Test
    public void testDefaultLocaleChangeWithTimeZone() {
        Locale originalLocale = Locale.getDefault();

        try {
            Locale firstLocale = Locale.US;
            Locale secondLocale = Locale.GERMANY;
            TimeZone timeZone = TimeZone.getTimeZone("GMT+02:00");

            Locale.setDefault(firstLocale);

            FastDateFormat first =
                    FastDateFormat.getDateInstance(
                            FastDateFormat.LONG,
                            timeZone);

            String expectedFirstPattern =
                    ((java.text.SimpleDateFormat)
                            DateFormat.getDateInstance(FastDateFormat.LONG, first))
                            .toPattern();

            assertEquals(expectedFirstPattern, first.getPattern());
            assertEquals(timeZone, first.getTimeZone());

            Locale.setDefault(secondLocale);

            FastDateFormat second =
                    FastDateFormat.getDateInstance(
                            FastDateFormat.LONG,
                            timeZone);

            String expectedSecondPattern =
                    ((java.text.SimpleDateFormat)
                            DateFormat.getDateInstance(FastDateFormat.LONG, second))
                            .toPattern();

            assertEquals(expectedSecondPattern, second.getPattern());
            assertEquals(timeZone, second.getTimeZone());

        } finally {
            Locale.setDefault(originalLocale);
        }
    }

    @Test
    public void testExplicitLocaleIsNotAffectedByDefaultLocaleChange() {
        Locale originalLocale = Locale.getDefault();

        try {
            Locale.setDefault(Locale.US);

            FastDateFormat formatter =
                    FastDateFormat.getDateInstance(
                            FastDateFormat.MEDIUM,
                            Locale.FRANCE);

            String expectedPattern =
                    ((java.text.SimpleDateFormat)
                            DateFormat.getDateInstance(
                                    FastDateFormat.MEDIUM,
                                    Locale.FRANCE))
                            .toPattern();

            Locale.setDefault(Locale.JAPAN);

            FastDateFormat sameLocaleFormatter =
                    FastDateFormat.getDateInstance(
                            FastDateFormat.MEDIUM,
                            Locale.FRANCE);

            assertNotNull(formatter);
            assertEquals(expectedPattern, formatter.getPattern());
            assertEquals(expectedPattern, sameLocaleFormatter.getPattern());
            assertSame(formatter, sameLocaleFormatter);

        } finally {
            Locale.setDefault(originalLocale);
        }
    }

    @Test
    public void testSameDefaultLocaleCanReuseFormatter() {
        Locale originalLocale = Locale.getDefault();

        try {
            Locale.setDefault(Locale.CANADA);

            FastDateFormat first =
                    FastDateFormat.getDateInstance(FastDateFormat.SHORT);

            FastDateFormat second =
                    FastDateFormat.getDateInstance(FastDateFormat.SHORT);

            String expectedPattern =
                    ((java.text.SimpleDateFormat)
                            DateFormat.getDateInstance(
                                    FastDateFormat.SHORT,
                                    Locale.CANADA))
                            .toPattern();

            assertEquals(expectedPattern, first.getPattern());
            assertEquals(expectedPattern, second.getPattern());
            assertSame(first, second);

        } finally {
            Locale.setDefault(originalLocale);
        }
    }
}
