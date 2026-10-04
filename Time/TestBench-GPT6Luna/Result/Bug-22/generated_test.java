package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.field.FieldUtils;
import org.joda.time.Period;

public class BasePeriodTest {
    @Test
    public void testStandardPeriodTypeAndSize() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.standard());
        assertEquals(PeriodType.standard(), period.getPeriodType());
        assertEquals(8, period.size());
    }

    @Test
    public void testSingleFieldPeriodTypeAndSize() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.hours());
        assertEquals(PeriodType.hours(), period.getPeriodType());
        assertEquals(1, period.size());
    }

    @Test
    public void testFieldTypesAtFirstAndLastStandardIndices() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.standard());
        assertEquals(DurationFieldType.years(), period.getFieldType(0));
        assertEquals(DurationFieldType.millis(), period.getFieldType(7));
    }

    @Test
    public void testFieldTypeOfSingleFieldPeriod() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.hours());
        assertEquals(DurationFieldType.hours(), period.getFieldType(0));
    }

    @Test
    public void testFieldTypeIndexAtSizeIsInvalid() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.hours());
        try {
            period.getFieldType(1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testFieldTypeNegativeIndexIsInvalid() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.standard());
        try {
            period.getFieldType(-1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testStandardValuesAtFirstAndLastIndices() throws Exception {
        MutablePeriod period = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(1, period.getValue(0));
        assertEquals(8, period.getValue(7));
    }

    @Test
    public void testSingleFieldValue() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.hours());
        period.setHours(9);
        assertEquals(9, period.getValue(0));
    }

    @Test
    public void testValueIndexAtSizeIsInvalid() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.hours());
        try {
            period.getValue(1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testValueNegativeIndexIsInvalid() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.standard());
        try {
            period.getValue(-1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testMinimumIntFieldValue() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.years());
        period.setYears(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, period.getValue(0));
    }

    @Test
    public void testMaximumIntFieldValue() throws Exception {
        MutablePeriod period = new MutablePeriod(PeriodType.years());
        period.setYears(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, period.getValue(0));
    }

    @Test
    public void testDurationFromZeroStart() throws Exception {
        MutablePeriod period = new MutablePeriod(0, 0, 0, 0, 1, 2, 3, 4);
        assertEquals(3723004L, period.toDurationFrom(new org.joda.time.Instant(0L)).getMillis());
    }

    @Test
    public void testDurationFromNonzeroStart() throws Exception {
        MutablePeriod period = new MutablePeriod(0, 0, 0, 0, 0, 1, 0, 0);
        assertEquals(60000L, period.toDurationFrom(new org.joda.time.Instant(1000L)).getMillis());
    }

    @Test
    public void testDurationToZeroEnd() throws Exception {
        MutablePeriod period = new MutablePeriod(0, 0, 0, 0, 0, 1, 0, 0);
        assertEquals(60000L, period.toDurationTo(new org.joda.time.Instant(0L)).getMillis());
    }

    @Test
    public void testDurationToNonzeroEnd() throws Exception {
        MutablePeriod period = new MutablePeriod(0, 0, 0, 0, 1, 0, 0, 0);
        assertEquals(3600000L, period.toDurationTo(new org.joda.time.Instant(5000L)).getMillis());
    }

    @Test
    public void testDurationFromNegativePeriod() throws Exception {
        MutablePeriod period = new MutablePeriod(0, 0, 0, 0, 0, 0, -2, 0);
        assertEquals(-2000L, period.toDurationFrom(new org.joda.time.Instant(10000L)).getMillis());
    }

    @Test
    public void testDurationToNegativePeriod() throws Exception {
        MutablePeriod period = new MutablePeriod(0, 0, 0, 0, 0, 0, -2, 0);
        assertEquals(-2000L, period.toDurationTo(new org.joda.time.Instant(10000L)).getMillis());
    }
}
