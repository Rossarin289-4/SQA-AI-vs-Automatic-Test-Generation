package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class LocalDateTest {
    @Test
    public void testSizeAndIndexedValues() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 29);
        assertEquals(3, d.size());
        assertEquals(2024, d.getValue(0));
        assertEquals(2, d.getValue(1));
        assertEquals(29, d.getValue(2));
    }

    @Test
    public void testIndexedValueRejectsNegativeIndex() throws Exception {
        try {
            new LocalDate(2024, 2, 29).getValue(-1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) { }
    }

    @Test
    public void testIndexedValueRejectsIndexAtSize() throws Exception {
        try {
            new LocalDate(2024, 2, 29).getValue(3);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) { }
    }

    @Test
    public void testGetAndSupportedFields() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 29);
        assertEquals(2024, d.get(DateTimeFieldType.year()));
        assertTrue(d.isSupported(DateTimeFieldType.dayOfMonth()));
        assertFalse(d.isSupported((DateTimeFieldType) null));
        assertFalse(d.isSupported(DurationFieldType.hours()));
        assertTrue(d.isSupported(DurationFieldType.days()));
    }

    @Test
    public void testGetRejectsNullField() throws Exception {
        try {
            new LocalDate(2024, 2, 29).get(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseDate() throws Exception {
        LocalDate d = LocalDate.parse("2024-02-29");
        assertEquals(2024, d.getYear());
        assertEquals(2, d.getMonthOfYear());
        assertEquals(29, d.getDayOfMonth());
    }

    @Test
    public void testCalendarFieldsTransferIncludingMonthIndex() throws Exception {
        Calendar c = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        c.clear();
        c.set(2024, Calendar.JANUARY, 31);
        LocalDate d = LocalDate.fromCalendarFields(c);
        assertEquals(new LocalDate(2024, 1, 31), d);
    }

    @Test
    public void testCalendarFieldsRejectNull() throws Exception {
        try {
            LocalDate.fromCalendarFields(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testDateFieldsTransfer() throws Exception {
        Date date = new Date(2024 - 1900, 1, 29);
        assertEquals(new LocalDate(2024, 2, 29), LocalDate.fromDateFields(date));
    }

    @Test
    public void testDateFieldsRejectNull() throws Exception {
        try {
            LocalDate.fromDateFields(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testEqualityHashAndComparison() throws Exception {
        LocalDate a = new LocalDate(2024, 2, 29);
        LocalDate same = new LocalDate(2024, 2, 29);
        LocalDate later = new LocalDate(2024, 3, 1);
        assertTrue(a.equals(same));
        assertEquals(a.hashCode(), same.hashCode());
        assertEquals(0, a.compareTo(same));
        assertTrue(a.compareTo(later) < 0);
    }

    @Test
    public void testDateFieldValues() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 29);
        assertEquals(1, d.getEra());
        assertEquals(20, d.getCenturyOfEra());
        assertEquals(2024, d.getYearOfEra());
        assertEquals(24, d.getYearOfCentury());
        assertEquals(2024, d.getYear());
        assertEquals(2, d.getMonthOfYear());
        assertEquals(60, d.getDayOfYear());
        assertEquals(29, d.getDayOfMonth());
        assertEquals(4, d.getDayOfWeek());
    }

    @Test
    public void testPlusDaysCrossesMonthAndLeapDay() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 28).plusDays(1);
        assertEquals(new LocalDate(2024, 2, 29), d);
        assertEquals(new LocalDate(2024, 3, 1), d.plusDays(1));
    }

    @Test
    public void testPlusMonthsClampsAtMonthEnd() throws Exception {
        assertEquals(new LocalDate(2023, 2, 28),
                new LocalDate(2023, 1, 31).plusMonths(1));
    }

    @Test
    public void testPlusYearsClampsLeapDay() throws Exception {
        assertEquals(new LocalDate(2023, 2, 28),
                new LocalDate(2020, 2, 29).plusYears(3));
    }

    @Test
    public void testWeekAdditionAndSubtraction() throws Exception {
        LocalDate start = new LocalDate(2024, 3, 1);
        assertEquals(new LocalDate(2024, 3, 8), start.plusWeeks(1));
        assertEquals(new LocalDate(2024, 2, 23), start.minusWeeks(1));
    }

    @Test
    public void testWithFieldAndWithFieldAdded() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 10);
        assertEquals(new LocalDate(2024, 2, 29),
                d.withField(DateTimeFieldType.dayOfMonth(), 29));
        assertEquals(new LocalDate(2024, 5, 10),
                d.withFieldAdded(DurationFieldType.months(), 3));
    }

    @Test
    public void testWithFieldAddedZeroAndNullPartialAreNoOps() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 29);
        assertEquals(d, d.withFieldAdded(DurationFieldType.days(), 0));
        assertEquals(d, d.withFields(null));
    }

    @Test
    public void testDateFieldSetters() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 29);
        assertEquals(new LocalDate(2025, 2, 28), d.withYear(2025));
        assertEquals(new LocalDate(2024, 3, 29), d.withMonthOfYear(3));
        assertEquals(new LocalDate(2024, 3, 1), d.withDayOfYear(61));
        assertEquals(new LocalDate(2024, 2, 28), d.withDayOfMonth(28));
    }

    @Test
    public void testPropertySetAndMaximum() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 10);
        assertEquals(new LocalDate(2024, 2, 29), d.dayOfMonth().withMaximumValue());
        assertEquals(new LocalDate(2024, 3, 10), d.monthOfYear().addToCopy(1));
        assertEquals(new LocalDate(2024, 2, 10), d.dayOfMonth().getLocalDate());
    }

    @Test
    public void testStringFormattingPatternAndNullPattern() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 29);
        assertEquals("2024-02-29", d.toString());
        assertEquals(d.toString(), d.toString((String) null));
        assertEquals("29/02/2024", d.toString("dd/MM/yyyy"));
    }

    @Test
    public void testStartOfDayAndMidnightConversions() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 29);
        DateTime start = d.toDateTimeAtStartOfDay(DateTimeZone.UTC);
        DateTime midnight = d.toDateTimeAtMidnight(DateTimeZone.UTC);
        assertEquals(0, start.getHourOfDay());
        assertEquals(0, start.getMinuteOfHour());
        assertEquals(start, midnight);
    }

    @Test
    public void testLocalDateTimeConversion() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 29);
        LocalDateTime result = d.toLocalDateTime(new LocalTime(12, 34));
        assertEquals(2024, result.getYear());
        assertEquals(2, result.getMonthOfYear());
        assertEquals(29, result.getDayOfMonth());
        assertEquals(12, result.getHourOfDay());
        assertEquals(34, result.getMinuteOfHour());
    }

    @Test
    public void testIntervalSpansOneDayInUtc() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 29);
        Interval interval = d.toInterval(DateTimeZone.UTC);
        assertEquals(86400000L, interval.toDurationMillis());
    }

    @Test
    public void testChronologyAndNow() throws Exception {
        LocalDate d = new LocalDate(2024, 6, 15);
        assertEquals(DateTimeZone.UTC, d.getChronology().getZone());
        assertEquals(3, LocalDate.now().size());
    }

    @Test
    public void testPeriodAdditionAndSubtraction() throws Exception {
        LocalDate d = new LocalDate(2024, 1, 31);
        assertEquals(new LocalDate(2024, 2, 29), d.withPeriodAdded(Period.months(1), 1));
        assertEquals(new LocalDate(2024, 2, 29), d.plus(Period.months(1)));
        assertEquals(new LocalDate(2023, 12, 31), d.minus(Period.months(1)));
    }

    @Test
    public void testMinusUnitsAndSignedAmounts() throws Exception {
        LocalDate d = new LocalDate(2024, 3, 1);
        assertEquals(new LocalDate(2023, 3, 1), d.minusYears(1));
        assertEquals(new LocalDate(2024, 2, 1), d.minusMonths(1));
        assertEquals(new LocalDate(2024, 2, 29), d.minusDays(1));
        assertEquals(new LocalDate(2024, 3, 2), d.minusDays(-1));
    }

    @Test
    public void testWeekFieldsAndWeekyear() throws Exception {
        LocalDate d = new LocalDate(2021, 1, 1);
        assertEquals(2020, d.getWeekyear());
        assertEquals(53, d.getWeekOfWeekyear());
    }

    @Test
    public void testWeekdaySetterAndWeekFields() throws Exception {
        LocalDate d = new LocalDate(2024, 3, 6);
        assertEquals(new LocalDate(2024, 3, 8), d.withDayOfWeek(5));
        assertEquals(2024, d.withWeekyear(2024).getWeekyear());
        assertEquals(10, d.withWeekOfWeekyear(10).getWeekOfWeekyear());
    }

    @Test
    public void testEraAndYearFieldSetters() throws Exception {
        LocalDate d = new LocalDate(2024, 6, 15);
        assertEquals(d, d.withEra(1));
        assertEquals(d, d.withCenturyOfEra(20));
        assertEquals(d, d.withYearOfEra(2024));
        assertEquals(d, d.withYearOfCentury(24));
        assertEquals(d, d.era().getLocalDate());
        assertEquals(d, d.centuryOfEra().getLocalDate());
        assertEquals(d, d.yearOfCentury().getLocalDate());
    }

    @Test
    public void testPropertyLookupAndNullFieldRejection() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 10);
        assertEquals(10, d.property(DateTimeFieldType.dayOfMonth()).get());
        try {
            d.property(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testDateTimeWithSuppliedLocalTime() throws Exception {
        LocalDate d = new LocalDate(2024, 2, 29);
        DateTime dt = d.toDateTime(new LocalTime(12, 34), DateTimeZone.UTC);
        assertEquals(2024, dt.getYear());
        assertEquals(2, dt.getMonthOfYear());
        assertEquals(29, dt.getDayOfMonth());
        assertEquals(12, dt.getHourOfDay());
        assertEquals(34, dt.getMinuteOfHour());
    }

    @Test
    public void testDateMidnightConversion() throws Exception {
        DateMidnight midnight = new LocalDate(2024, 2, 29)
                .toDateMidnight(DateTimeZone.UTC);
        assertEquals(2024, midnight.getYear());
        assertEquals(2, midnight.getMonthOfYear());
        assertEquals(29, midnight.getDayOfMonth());
    }

    @Test
    public void testDateConversionInUtc() throws Exception {
        Date date = new LocalDate(2024, 2, 29).toDate();
        Calendar c = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        c.setTime(date);
        assertEquals(2024, c.get(Calendar.YEAR));
        assertEquals(Calendar.FEBRUARY, c.get(Calendar.MONTH));
        assertEquals(29, c.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testCurrentTimeConversionWithFixedClock() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(0L);
        try {
            DateTime result = new LocalDate(1970, 1, 1)
                    .toDateTimeAtCurrentTime(DateTimeZone.UTC);
            assertEquals(1970, result.getYear());
            assertEquals(1, result.getMonthOfYear());
            assertEquals(1, result.getDayOfMonth());
            assertEquals(0, result.getHourOfDay());
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }
}
