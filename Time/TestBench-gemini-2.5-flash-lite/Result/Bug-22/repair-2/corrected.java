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
import org.joda.time.Instant;

public class BasePeriodTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to get period values safely using public API
    private int getValueFromPeriod(BasePeriod period, DurationFieldType fieldType) {
        PeriodType type = period.getPeriodType();
        if (type.isSupported(fieldType)) {
            return period.getValue(type.indexOf(fieldType));
        }
        return Integer.MIN_VALUE; // Indicate not supported
    }

    // --- Test cases for constructors ---

    @Test
    public void testConstructor_int_int_int_int_int_int_int_int_PeriodType() throws Exception {
        PeriodType type = PeriodType.standard();
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, type);
        assertEquals(type, period.getPeriodType());
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testConstructor_long_long_PeriodType_Chronology() throws Exception {
        Chronology chrono = ISOChronology.getInstance();
        PeriodType type = PeriodType.standard();
        long startMillis = 1000L;
        long endMillis = 2000L;
        BasePeriod period = new MutablePeriod(startMillis, endMillis, type, chrono);
        assertEquals(type, period.getPeriodType());
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.months()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.weeks()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.days()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.millis())); // 1000 ms duration
    }

    @Test
    public void testConstructor_ReadableInstant_ReadableInstant_PeriodType() throws Exception {
        ReadableInstant start = new Instant(1000L);
        ReadableInstant end = new Instant(2000L);
        PeriodType type = PeriodType.standard();
        BasePeriod period = new MutablePeriod(start, end, type);
        assertEquals(type, period.getPeriodType());
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.months()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.weeks()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.days()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testConstructor_ReadableInstant_ReadableInstant_PeriodType_nullInstants() throws Exception {
        PeriodType type = PeriodType.standard();
        BasePeriod period = new MutablePeriod(null, null, type);
        assertEquals(type, period.getPeriodType());
        assertEquals(type.size(), period.size());
        for (int i = 0; i < period.size(); i++) {
            assertEquals(0, period.getValue(i));
        }
    }

    @Test
    public void testConstructor_long_duration_for_time_type() throws Exception {
        // Test BasePeriod(long duration) constructor
        MutablePeriod mp = new MutablePeriod(1000000L); // 1 million milliseconds
        assertEquals(PeriodType.time(), mp.getPeriodType());
        assertEquals(0, getValueFromPeriod(mp, DurationFieldType.hours()));
        assertEquals(16, getValueFromPeriod(mp, DurationFieldType.minutes()));
        assertEquals(40, getValueFromPeriod(mp, DurationFieldType.seconds()));
        assertEquals(0, getValueFromPeriod(mp, DurationFieldType.millis()));
    }

    @Test
    public void testConstructor_ReadableInstant_ReadableDuration_PeriodType() throws Exception {
        ReadableInstant start = new Instant(1000L);
        ReadableDuration duration = new Duration(2000L);
        PeriodType type = PeriodType.standard();
        BasePeriod period = new MutablePeriod(start, duration, type);
        assertEquals(type, period.getPeriodType());
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(3, getValueFromPeriod(period, DurationFieldType.millis())); // 1000ms + 2000ms = 3000ms
    }

    @Test
    public void testConstructor_ReadableDuration_ReadableInstant_PeriodType() throws Exception {
        ReadableDuration duration = new Duration(2000L);
        ReadableInstant end = new Instant(3000L);
        PeriodType type = PeriodType.standard();
        BasePeriod period = new MutablePeriod(duration, end, type);
        assertEquals(type, period.getPeriodType());
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.millis())); // 3000ms - 2000ms = 1000ms
    }

    @Test
    public void testConstructor_long_PeriodType_Chronology() throws Exception {
        Chronology chrono = ISOChronology.getInstanceUTC();
        PeriodType type = PeriodType.time();
        long duration = 3661000L; // 1 hour, 1 minute, 1 second
        BasePeriod period = new MutablePeriod(duration, type, chrono);
        assertEquals(type, period.getPeriodType());
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testConstructor_Object_PeriodType_Chronology_String() throws Exception {
        String periodString = "P1Y2M3W4DT5H6M7S";
        PeriodType type = PeriodType.standard();
        Chronology chrono = ISOChronology.getInstance();
        BasePeriod period = new MutablePeriod(periodString, type, chrono);
        assertEquals(type, period.getPeriodType());
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(2, getValueFromPeriod(period, DurationFieldType.months()));
        assertEquals(3, getValueFromPeriod(period, DurationFieldType.weeks()));
        assertEquals(4, getValueFromPeriod(period, DurationFieldType.days()));
        assertEquals(5, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(6, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(7, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testConstructor_Object_PeriodType_Chronology_nullObject() throws Exception {
        PeriodType type = PeriodType.standard();
        Chronology chrono = ISOChronology.getInstance();
        BasePeriod period = new MutablePeriod(null, type, chrono);
        assertEquals(type, period.getPeriodType());
        assertEquals(type.size(), period.size());
        for (int i = 0; i < period.size(); i++) {
            assertEquals(0, period.getValue(i));
        }
    }

    @Test
    public void testConstructor_int_array_PeriodType() throws Exception {
        int[] values = {10, 20, 30, 40, 50, 60, 70, 80};
        PeriodType type = PeriodType.standard();
        BasePeriod period = new MutablePeriod(values, type);
        assertEquals(type, period.getPeriodType());
        assertEquals(10, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(80, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for getPeriodType ---
    @Test
    public void testGetPeriodType() throws Exception {
        PeriodType type = PeriodType.standard();
        BasePeriod period = new MutablePeriod(1, 0, 0, 0, 0, 0, 0, 0, type);
        assertEquals(type, period.getPeriodType());
    }

    // --- Test cases for size ---
    @Test
    public void testSize_Standard() throws Exception {
        PeriodType type = PeriodType.standard();
        BasePeriod period = new MutablePeriod(type);
        assertEquals(8, period.size());
    }

    @Test
    public void testSize_TimeOnly() throws Exception {
        PeriodType type = PeriodType.time();
        BasePeriod period = new MutablePeriod(type);
        assertEquals(4, period.size());
    }

    // --- Test cases for getFieldType ---
    @Test
    public void testGetFieldType_Standard() throws Exception {
        PeriodType type = PeriodType.standard();
        BasePeriod period = new MutablePeriod(type);
        assertEquals(DurationFieldType.years(), period.getFieldType(0));
        assertEquals(DurationFieldType.months(), period.getFieldType(1));
        assertEquals(DurationFieldType.days(), period.getFieldType(3));
        assertEquals(DurationFieldType.millis(), period.getFieldType(7));
    }

    @Test
    public void testGetFieldType_TimeOnly() throws Exception {
        PeriodType type = PeriodType.time();
        BasePeriod period = new MutablePeriod(type);
        assertEquals(DurationFieldType.hours(), period.getFieldType(0));
        assertEquals(DurationFieldType.minutes(), period.getFieldType(1));
        assertEquals(DurationFieldType.seconds(), period.getFieldType(2));
        assertEquals(DurationFieldType.millis(), period.getFieldType(3));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_IndexOutOfBounds() throws Exception {
        PeriodType type = PeriodType.hours();
        BasePeriod period = new MutablePeriod(type);
        period.getFieldType(1);
    }

    // --- Test cases for getValue ---
    @Test
    public void testGetValue_Standard() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testGetValue_TimeOnly() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, PeriodType.time()); // hours, minutes, seconds, millis
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(4, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_IndexOutOfBounds() throws Exception {
        BasePeriod period = new MutablePeriod(PeriodType.hours());
        period.getValue(1);
    }

    // --- Test cases for toDurationFrom ---
    @Test
    public void testToDurationFrom_Standard() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 0, 1, 0, 0, 0); // 1 hour
        ReadableInstant start = new Instant(1000L);
        Duration duration = period.toDurationFrom(start);
        assertEquals(3600000L, duration.getMillis());
    }

    @Test
    public void testToDurationFrom_ZeroPeriod() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 0);
        ReadableInstant start = new Instant(5000L);
        Duration duration = period.toDurationFrom(start);
        assertEquals(5000L, duration.getMillis());
    }

    @Test
    public void testToDurationFrom_WithDaysAndHours() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 1, 2, 0, 0, 0); // 1 day, 2 hours
        ReadableInstant start = new Instant(0L);
        Duration duration = period.toDurationFrom(start);
        assertEquals((1L * 24 * 60 * 60 * 1000) + (2L * 60 * 60 * 1000), duration.getMillis());
    }

    // --- Test cases for toDurationTo ---
    @Test
    public void testToDurationTo_Standard() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 0, 1, 0, 0, 0); // 1 hour
        ReadableInstant end = new Instant(3601000L);
        Duration duration = period.toDurationTo(end);
        assertEquals(3600000L, duration.getMillis());
    }

    @Test
    public void testToDurationTo_ZeroPeriod() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 0);
        ReadableInstant end = new Instant(5000L);
        Duration duration = period.toDurationTo(end);
        assertEquals(5000L, duration.getMillis());
    }

    @Test
    public void testToDurationTo_WithDaysAndHours() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 1, 2, 0, 0, 0); // 1 day, 2 hours
        ReadableInstant end = new Instant((1L * 24 * 60 * 60 * 1000) + (2L * 60 * 60 * 1000));
        Duration duration = period.toDurationTo(end);
        assertEquals((1L * 24 * 60 * 60 * 1000) + (2L * 60 * 60 * 1000), duration.getMillis());
    }

    // --- Test cases for setPeriod ---
    @Test
    public void testSetPeriod_ReadablePeriod() throws Exception {
        BasePeriod period = new MutablePeriod();
        ReadablePeriod other = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        period.setPeriod(other);
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testSetPeriod_null() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        period.setPeriod(null); // Should set all values to zero
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for setPeriod_int_... ---
    @Test
    public void testSetPeriod_int_int_int_int_int_int_int_int() throws Exception {
        BasePeriod period = new MutablePeriod();
        period.setPeriod(10, 20, 30, 40, 50, 60, 70, 80);
        assertEquals(10, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(80, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for setField ---
    @Test
    public void testSetField_DurationFieldType_int() throws Exception {
        BasePeriod period = new MutablePeriod();
        period.setField(DurationFieldType.hours(), 12);
        assertEquals(12, getValueFromPeriod(period, DurationFieldType.hours()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetField_unsupported() throws Exception {
        BasePeriod period = new MutablePeriod(PeriodType.hours()); // Supports only hours
        period.setField(DurationFieldType.minutes(), 5); // Minutes not supported
    }

    // --- Test cases for setFieldInto ---
    @Test
    public void testSetFieldInto_int_array_DurationFieldType_int() throws Exception {
        PeriodType type = PeriodType.standard();
        int[] values = new int[type.size()];
        BasePeriod period = new MutablePeriod(values, type);
        period.setFieldInto(values, DurationFieldType.minutes(), 30);
        assertEquals(30, values[type.indexOf(DurationFieldType.minutes())]);
    }

    // --- Test cases for addField ---
    @Test
    public void testAddField_DurationFieldType_int() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 0, 1, 0, 0, 0); // 1 hour
        period.addField(DurationFieldType.hours(), 2);
        assertEquals(3, getValueFromPeriod(period, DurationFieldType.hours()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddField_unsupported() throws Exception {
        BasePeriod period = new MutablePeriod(PeriodType.days()); // Supports only days
        period.addField(DurationFieldType.hours(), 5); // Hours not supported
    }

    // --- Test cases for addFieldInto ---
    @Test
    public void testAddFieldInto_int_array_DurationFieldType_int() throws Exception {
        PeriodType type = PeriodType.standard();
        int[] values = {0, 0, 0, 10, 0, 0, 0, 0}; // 10 days
        BasePeriod period = new MutablePeriod(values, type);
        period.addFieldInto(values, DurationFieldType.days(), 5);
        assertEquals(15, values[type.indexOf(DurationFieldType.days())]);
    }

    // --- Test cases for mergePeriod ---
    @Test
    public void testMergePeriod_ReadablePeriod() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 0, 0, 0, 0);
        ReadablePeriod toMerge = new Period(0, 0, 0, 0, 5, 6, 7, 8);
        period.mergePeriod(toMerge);
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testMergePeriod_null() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        period.mergePeriod(null);
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for mergePeriodInto ---
    @Test
    public void testMergePeriodInto_int_array_ReadablePeriod() throws Exception {
        PeriodType type = PeriodType.standard();
        int[] values = {1, 2, 3, 4, 0, 0, 0, 0};
        BasePeriod period = new MutablePeriod(values, type);
        ReadablePeriod toMerge = new Period(0, 0, 0, 0, 5, 6, 7, 8);
        period.mergePeriodInto(values, toMerge);
        assertEquals(5, values[type.indexOf(DurationFieldType.hours())]);
        assertEquals(8, values[type.indexOf(DurationFieldType.millis())]);
    }

    // --- Test cases for addPeriod ---
    @Test
    public void testAddPeriod_ReadablePeriod() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 0, 0, 0, 0);
        ReadablePeriod toAdd = new Period(0, 0, 0, 0, 5, 6, 7, 8);
        period.addPeriod(toAdd);
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testAddPeriod_null() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        period.addPeriod(null);
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for addPeriodInto ---
    @Test
    public void testAddPeriodInto_int_array_ReadablePeriod() throws Exception {
        PeriodType type = PeriodType.standard();
        int[] values = {1, 2, 3, 4, 0, 0, 0, 0};
        BasePeriod period = new MutablePeriod(values, type);
        ReadablePeriod toAdd = new Period(0, 0, 0, 0, 5, 6, 7, 8);
        period.addPeriodInto(values, toAdd);
        assertEquals(5, values[type.indexOf(DurationFieldType.hours())]);
        assertEquals(8, values[type.indexOf(DurationFieldType.millis())]);
    }

    // --- Test cases for setValue ---
    @Test
    public void testSetValue() throws Exception {
        BasePeriod period = new MutablePeriod();
        period.setValue(period.getPeriodType().indexOf(DurationFieldType.weeks()), 15);
        assertEquals(15, getValueFromPeriod(period, DurationFieldType.weeks()));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValue_IndexOutOfBounds() throws Exception {
        BasePeriod period = new MutablePeriod(PeriodType.hours());
        period.setValue(1, 10);
    }

    // --- Test cases for setValues ---
    @Test
    public void testSetValues() throws Exception {
        BasePeriod period = new MutablePeriod();
        int[] newValues = {11, 22, 33, 44, 55, 66, 77, 88};
        period.setValues(newValues);
        assertEquals(11, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(88, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for checkPeriodType ---
    @Test
    public void testCheckPeriodType_null() throws Exception {
        PeriodType defaultType = DateTimeUtils.getPeriodType(null);
        BasePeriod period = new MutablePeriod(null, defaultType);
        assertEquals(defaultType, period.getPeriodType());
    }

    @Test
    public void testCheckPeriodType_valid() throws Exception {
        PeriodType type = PeriodType.yearMonthDay();
        BasePeriod period = new MutablePeriod(null, type);
        assertEquals(type, period.getPeriodType());
    }
}
