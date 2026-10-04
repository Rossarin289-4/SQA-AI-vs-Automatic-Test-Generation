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
        // Indicate not supported by returning a value that wouldn't be a normal period value
        // Assuming period values are generally non-negative or within reasonable integer limits.
        // If a field is not supported, it should have a value of 0 according to the code's logic
        // for unsupported fields when setting/adding.
        // However, to signal it's truly not supported and not just zero, we might need a different approach
        // or rely on the fact that checkAndUpdate throws an exception for non-zero values.
        // For tests checking if a field is *not* present, asserting that it's zero is appropriate.
        // If it *is* present, `getValue` will return its value.
        // If `isSupported` is false, `getValue` should conceptually return 0 if it were part of the set.
        // Let's stick to the contract of `getValue` which assumes the index is valid and supported.
        // The issue might be how the test constructs periods and checks values.

        // Re-evaluating: The `checkAndUpdate` method in `BasePeriod` handles unsupported fields by
        // throwing an `IllegalArgumentException` if the `newValue` is non-zero. If `newValue` is zero,
        // it does nothing. This implies that an unsupported field should implicitly be treated as zero.
        // So, if `isSupported` is false, the value *is* effectively zero for any operational purpose.
        // Therefore, returning 0 here is consistent with the logic in `checkAndUpdate`.
        return 0;
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
        long endMillis = 2000L; // Difference is 1000ms
        BasePeriod period = new MutablePeriod(startMillis, endMillis, type, chrono);
        assertEquals(type, period.getPeriodType());
        // The default PeriodType.standard() has 8 fields.
        // The difference of 1000ms should be represented as 1000 milliseconds if supported.
        // ISOChronology.get(this, 1000, 2000) will yield {0,0,0,0,0,0,0,1000}
        assertEquals(0, period.getValue(0)); // years
        assertEquals(0, period.getValue(1)); // months
        assertEquals(0, period.getValue(2)); // weeks
        assertEquals(0, period.getValue(3)); // days
        assertEquals(0, period.getValue(4)); // hours
        assertEquals(0, period.getValue(5)); // minutes
        assertEquals(0, period.getValue(6)); // seconds
        assertEquals(1000, period.getValue(7)); // millis
    }

    @Test
    public void testConstructor_ReadableInstant_ReadableInstant_PeriodType() throws Exception {
        ReadableInstant start = new Instant(1000L);
        ReadableInstant end = new Instant(2000L); // Difference is 1000ms
        PeriodType type = PeriodType.standard();
        BasePeriod period = new MutablePeriod(start, end, type);
        assertEquals(type, period.getPeriodType());
        // Similar to the previous test, the difference is 1000ms.
        // The chronology is derived from the instants, which are ISOChronology by default.
        assertEquals(0, period.getValue(0)); // years
        assertEquals(0, period.getValue(1)); // months
        assertEquals(0, period.getValue(2)); // weeks
        assertEquals(0, period.getValue(3)); // days
        assertEquals(0, period.getValue(4)); // hours
        assertEquals(0, period.getValue(5)); // minutes
        assertEquals(0, period.getValue(6)); // seconds
        assertEquals(1000, period.getValue(7)); // millis
    }


    @Test
    public void testConstructor_long_duration_for_time_type() throws Exception {
        // Test BasePeriod(long duration) constructor
        // This constructor explicitly sets iType to PeriodType.time() during calculation,
        // then resets to standard. The result is stored in iValues based on the time fields.
        MutablePeriod mp = new MutablePeriod(1000000L); // 1 million milliseconds
        // The expected iType should be standard, but the values should reflect time components.
        // The bug [3264409] refers to this constructor.
        // The logic:
        // iType = PeriodType.time();
        // int[] values = ISOChronology.getInstanceUTC().get(this, duration); // Gets time fields into values
        // iType = PeriodType.standard(); // Reset iType
        // iValues = new int[8]; // Standard size
        // System.arraycopy(values, 0, iValues, 4, 4); // Copies time fields to hours, minutes, seconds, millis
        // This means the iType is `standard`, but only the last 4 fields are populated.
        assertEquals(PeriodType.standard(), mp.getPeriodType());
        assertEquals(0, getValueFromPeriod(mp, DurationFieldType.years()));
        assertEquals(0, getValueFromPeriod(mp, DurationFieldType.months()));
        assertEquals(0, getValueFromPeriod(mp, DurationFieldType.weeks()));
        assertEquals(0, getValueFromPeriod(mp, DurationFieldType.days()));
        // 1,000,000 ms = 1000 seconds = 16 minutes and 40 seconds.
        assertEquals(0, getValueFromPeriod(mp, DurationFieldType.hours())); // Hours field is index 4
        assertEquals(16, getValueFromPeriod(mp, DurationFieldType.minutes())); // Minutes field is index 5
        assertEquals(40, getValueFromPeriod(mp, DurationFieldType.seconds())); // Seconds field is index 6
        assertEquals(0, getValueFromPeriod(mp, DurationFieldType.millis())); // Millis field is index 7
    }

    @Test
    public void testConstructor_ReadableInstant_ReadableDuration_PeriodType() throws Exception {
        ReadableInstant start = new Instant(1000L);
        ReadableDuration duration = new Duration(2000L);
        PeriodType type = PeriodType.standard();
        // startMillis = 1000, durationMillis = 2000, endMillis = 3000
        // Chronology is ISOChronology.getInstanceUTC() by default from Instant.
        // chrono.get(this, 1000, 3000) calculates the period.
        // Difference is 2000ms, which is 2 seconds.
        BasePeriod period = new MutablePeriod(start, duration, type);
        assertEquals(type, period.getPeriodType());
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.months()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.weeks()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.days()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(2, getValueFromPeriod(period, DurationFieldType.seconds())); // 2000 ms = 2 seconds
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testConstructor_ReadableDuration_ReadableInstant_PeriodType() throws Exception {
        ReadableDuration duration = new Duration(2000L);
        ReadableInstant end = new Instant(3000L);
        PeriodType type = PeriodType.standard();
        // endMillis = 3000, durationMillis = 2000, startMillis = 1000
        // Chronology is ISOChronology.getInstanceUTC() by default from Instant.
        // chrono.get(this, 1000, 3000) calculates the period.
        // Difference is 2000ms, which is 2 seconds.
        BasePeriod period = new MutablePeriod(duration, end, type);
        assertEquals(type, period.getPeriodType());
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.months()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.weeks()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.days()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(2, getValueFromPeriod(period, DurationFieldType.seconds())); // 2000 ms = 2 seconds
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testConstructor_long_PeriodType_Chronology() throws Exception {
        Chronology chrono = ISOChronology.getInstanceUTC();
        PeriodType type = PeriodType.time(); // Explicitly time type
        long duration = 3661000L; // 1 hour, 1 minute, 1 second
        // chrono.get(this, duration) will use the provided type and chronology.
        BasePeriod period = new MutablePeriod(duration, type, chrono);
        assertEquals(type, period.getPeriodType()); // Should be time type
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.millis()));
        // Ensure other fields are not supported or zero if not in time type
        assertFalse(period.getPeriodType().isSupported(DurationFieldType.years()));
    }

    @Test
    public void testConstructor_Object_PeriodType_Chronology_String() throws Exception {
        String periodString = "P1Y2M3W4DT5H6M7S";
        PeriodType type = PeriodType.standard();
        Chronology chrono = ISOChronology.getInstance(); // Used by ConverterManager if needed, but PeriodConverter typically parses directly
        // The `BasePeriod(Object, PeriodType, Chronology)` constructor uses `ConverterManager`.
        // The `MutablePeriod` constructor for `String` will use the `PeriodConverter`.
        // The PeriodConverter for String parses "P1Y2M3W4DT5H6M7S" correctly.
        BasePeriod period = new MutablePeriod(periodString, type, chrono);
        assertEquals(type, period.getPeriodType());
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(2, getValueFromPeriod(period, DurationFieldType.months()));
        assertEquals(3, getValueFromPeriod(period, DurationFieldType.weeks())); // 3 weeks
        assertEquals(4, getValueFromPeriod(period, DurationFieldType.days())); // 4 days
        assertEquals(5, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(6, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(7, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testConstructor_Object_PeriodType_Chronology_nullObject() throws Exception {
        PeriodType type = PeriodType.standard();
        Chronology chrono = ISOChronology.getInstance();
        // If period is null, the converter (if it handles null) or BasePeriod itself
        // should handle it. The constructor logic for null start/end instants or null period
        // often results in a zero-length period.
        // BasePeriod(Object period, PeriodType type, Chronology chrono) -> converter.setInto((ReadWritablePeriod) this, period, chrono);
        // If `period` is null, `converter.setInto` might behave differently.
        // Let's check the `MutablePeriod` constructor that takes Object.
        // If `period` is null, `ConverterManager.getInstance().getPeriodConverter(period)` will likely find a converter,
        // and that converter's `getPeriodType` might return null, and `setInto` with null `period`
        // should result in a zero period.
        // The current test expects all zeros.
        BasePeriod period = new MutablePeriod(null, type, chrono);
        assertEquals(type, period.getPeriodType());
        assertEquals(type.size(), period.size()); // Standard type has 8 fields
        for (int i = 0; i < period.size(); i++) {
            assertEquals(0, period.getValue(i)); // All fields should be zero
        }
    }

    @Test
    public void testConstructor_int_array_PeriodType() throws Exception {
        // This constructor is protected and expects internal use.
        // However, `MutablePeriod` has a public constructor that uses it.
        // The test should use `MutablePeriod` to access this constructor.
        int[] values = {10, 20, 30, 40, 50, 60, 70, 80};
        PeriodType type = PeriodType.standard();
        // The constructor `BasePeriod(int[] values, PeriodType type)` is called by `MutablePeriod(int[] values, PeriodType type)`.
        // We are testing `BasePeriod`'s logic here.
        BasePeriod period = new MutablePeriod(values, type); // Use MutablePeriod to instantiate BasePeriod
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
        BasePeriod period = new MutablePeriod(type); // Values are not relevant for getFieldType
        assertEquals(DurationFieldType.years(), period.getFieldType(0));
        assertEquals(DurationFieldType.months(), period.getFieldType(1));
        assertEquals(DurationFieldType.weeks(), period.getFieldType(2)); // Weeks is index 2
        assertEquals(DurationFieldType.days(), period.getFieldType(3));
        assertEquals(DurationFieldType.hours(), period.getFieldType(4));
        assertEquals(DurationFieldType.minutes(), period.getFieldType(5));
        assertEquals(DurationFieldType.seconds(), period.getFieldType(6));
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
        PeriodType type = PeriodType.hours(); // size() is 1
        BasePeriod period = new MutablePeriod(type);
        period.getFieldType(1); // Index 1 is out of bounds for a size 1 type.
    }

    // --- Test cases for getValue ---
    @Test
    public void testGetValue_Standard() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        assertEquals(1, period.getValue(0)); // Years is index 0
        assertEquals(2, period.getValue(1)); // Months is index 1
        assertEquals(3, period.getValue(2)); // Weeks is index 2
        assertEquals(4, period.getValue(3)); // Days is index 3
        assertEquals(5, period.getValue(4)); // Hours is index 4
        assertEquals(6, period.getValue(5)); // Minutes is index 5
        assertEquals(7, period.getValue(6)); // Seconds is index 6
        assertEquals(8, period.getValue(7)); // Millis is index 7
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_IndexOutOfBounds() throws Exception {
        PeriodType type = PeriodType.hours(); // size() is 1
        BasePeriod period = new MutablePeriod(type);
        period.getValue(1); // Index 1 is out of bounds for a size 1 type.
    }

    // --- Test cases for toDurationFrom ---
    @Test
    public void testToDurationFrom_Standard() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 0, 1, 0, 0, 0); // 1 hour
        ReadableInstant start = new Instant(1000L);
        Chronology chrono = DateTimeUtils.getInstantChronology(start); // ISOChronology.getInstanceUTC()
        long endMillis = chrono.add(period, 1000L, 1); // Add 1 hour to 1000ms
        long expectedMillis = 1000L + (1L * 60 * 60 * 1000); // 1 hour in ms
        Duration duration = period.toDurationFrom(start);
        assertEquals(expectedMillis, duration.getMillis());
    }

    @Test
    public void testToDurationFrom_ZeroPeriod() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 0); // Zero period
        ReadableInstant start = new Instant(5000L);
        Chronology chrono = DateTimeUtils.getInstantChronology(start);
        long endMillis = chrono.add(period, 5000L, 1); // Add zero period to 5000ms
        assertEquals(5000L, endMillis); // End millis should be same as start millis
        Duration duration = period.toDurationFrom(start);
        assertEquals(0L, duration.getMillis()); // Duration should be 0
    }

    @Test
    public void testToDurationFrom_WithDaysAndHours() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 1, 2, 0, 0, 0); // 1 day, 2 hours
        ReadableInstant start = new Instant(0L);
        Chronology chrono = DateTimeUtils.getInstantChronology(start);
        long endMillis = chrono.add(period, 0L, 1); // Add 1 day, 2 hours to 0ms
        long expectedMillis = (1L * 24 * 60 * 60 * 1000) + (2L * 60 * 60 * 1000); // 1 day + 2 hours in ms
        Duration duration = period.toDurationFrom(start);
        assertEquals(expectedMillis, duration.getMillis());
    }

    // --- Test cases for toDurationTo ---
    @Test
    public void testToDurationTo_Standard() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 0, 1, 0, 0, 0); // 1 hour
        ReadableInstant end = new Instant(3601000L); // 1 hour, 1 second
        Chronology chrono = DateTimeUtils.getInstantChronology(end);
        long startMillis = chrono.add(period, 3601000L, -1); // Subtract 1 hour from 3601000ms
        long expectedStartMillis = 3601000L - (1L * 60 * 60 * 1000); // 1 second
        assertEquals(expectedStartMillis, startMillis);
        Duration duration = period.toDurationTo(end);
        assertEquals(3600000L, duration.getMillis()); // Duration is 1 hour
    }

    @Test
    public void testToDurationTo_ZeroPeriod() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 0); // Zero period
        ReadableInstant end = new Instant(5000L);
        Chronology chrono = DateTimeUtils.getInstantChronology(end);
        long startMillis = chrono.add(period, 5000L, -1); // Subtract zero period from 5000ms
        assertEquals(5000L, startMillis); // Start millis should be same as end millis
        Duration duration = period.toDurationTo(end);
        assertEquals(0L, duration.getMillis()); // Duration should be 0
    }

    @Test
    public void testToDurationTo_WithDaysAndHours() throws Exception {
        BasePeriod period = new MutablePeriod(0, 0, 0, 1, 2, 0, 0, 0); // 1 day, 2 hours
        long endMillis = (1L * 24 * 60 * 60 * 1000) + (2L * 60 * 60 * 1000); // 1 day + 2 hours in ms
        ReadableInstant end = new Instant(endMillis);
        Chronology chrono = DateTimeUtils.getInstantChronology(end);
        long startMillis = chrono.add(period, endMillis, -1); // Subtract 1 day, 2 hours from endMillis
        assertEquals(0L, startMillis); // Should result in 0
        Duration duration = period.toDurationTo(end);
        assertEquals(endMillis, duration.getMillis()); // Duration should be 1 day, 2 hours
    }

    // --- Test cases for setPeriod ---
    @Test
    public void testSetPeriod_ReadablePeriod() throws Exception {
        BasePeriod period = new MutablePeriod(); // Initially zero period with standard type
        ReadablePeriod other = new Period(1, 2, 3, 4, 5, 6, 7, 8); // Another period with standard type
        period.setPeriod(other);
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testSetPeriod_null() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        period.setPeriod(null); // Should set all values to zero
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.months()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.weeks()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.days()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for setPeriod_int_... ---
    @Test
    public void testSetPeriod_int_int_int_int_int_int_int_int() throws Exception {
        BasePeriod period = new MutablePeriod(); // Standard type
        period.setPeriod(10, 20, 30, 40, 50, 60, 70, 80);
        assertEquals(10, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(20, getValueFromPeriod(period, DurationFieldType.months()));
        assertEquals(30, getValueFromPeriod(period, DurationFieldType.weeks()));
        assertEquals(40, getValueFromPeriod(period, DurationFieldType.days()));
        assertEquals(50, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(60, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(70, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(80, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for setField ---
    @Test
    public void testSetField_DurationFieldType_int() throws Exception {
        BasePeriod period = new MutablePeriod(); // Standard type
        period.setField(DurationFieldType.hours(), 12);
        assertEquals(12, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.years())); // Ensure other fields are unchanged
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetField_unsupported() throws Exception {
        BasePeriod period = new MutablePeriod(PeriodType.hours()); // Supports only hours
        // Attempt to set minutes, which is not supported by PeriodType.hours()
        period.setField(DurationFieldType.minutes(), 5);
    }

    // --- Test cases for setFieldInto ---
    @Test
    public void testSetFieldInto_int_array_DurationFieldType_int() throws Exception {
        PeriodType type = PeriodType.standard();
        int[] values = new int[type.size()]; // Initialize with zeros
        BasePeriod period = new MutablePeriod(values, type); // Use this to set iValues and iType
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
        // Attempt to add hours, which is not supported
        period.addField(DurationFieldType.hours(), 5);
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
        ReadablePeriod toMerge = new Period(0, 0, 0, 0, 5, 6, 7, 8); // This period has values for time fields
        period.mergePeriod(toMerge);
        // Merge should update values for supported fields, existing values for unsupported fields should remain.
        // Here, the period supports all fields, so merging should update all.
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(2, getValueFromPeriod(period, DurationFieldType.months()));
        assertEquals(3, getValueFromPeriod(period, DurationFieldType.weeks()));
        assertEquals(4, getValueFromPeriod(period, DurationFieldType.days()));
        assertEquals(5, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(6, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(7, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testMergePeriod_null() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        period.mergePeriod(null); // Merging null should have no effect.
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for mergePeriodInto ---
    @Test
    public void testMergePeriodInto_int_array_ReadablePeriod() throws Exception {
        PeriodType type = PeriodType.standard();
        int[] values = {1, 2, 3, 4, 0, 0, 0, 0}; // Initial values
        BasePeriod period = new MutablePeriod(values, type); // Use to get iType
        ReadablePeriod toMerge = new Period(0, 0, 0, 0, 5, 6, 7, 8); // Values to merge
        period.mergePeriodInto(values, toMerge); // Perform merge into the provided array
        // The mergePeriodInto method in BasePeriod iterates through the fields of `toMerge`
        // and uses `checkAndUpdate`. `checkAndUpdate` updates the `values` array.
        assertEquals(1, values[type.indexOf(DurationFieldType.years())]);
        assertEquals(2, values[type.indexOf(DurationFieldType.months())]);
        assertEquals(3, values[type.indexOf(DurationFieldType.weeks())]);
        assertEquals(4, values[type.indexOf(DurationFieldType.days())]);
        assertEquals(5, values[type.indexOf(DurationFieldType.hours())]);
        assertEquals(6, values[type.indexOf(DurationFieldType.minutes())]);
        assertEquals(7, values[type.indexOf(DurationFieldType.seconds())]);
        assertEquals(8, values[type.indexOf(DurationFieldType.millis())]);
    }

    // --- Test cases for addPeriod ---
    @Test
    public void testAddPeriod_ReadablePeriod() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 0, 0, 0, 0);
        ReadablePeriod toAdd = new Period(0, 0, 0, 0, 5, 6, 7, 8);
        period.addPeriod(toAdd);
        // Adding should sum the fields.
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(2, getValueFromPeriod(period, DurationFieldType.months()));
        assertEquals(3, getValueFromPeriod(period, DurationFieldType.weeks()));
        assertEquals(4, getValueFromPeriod(period, DurationFieldType.days()));
        assertEquals(5, getValueFromPeriod(period, DurationFieldType.hours()));
        assertEquals(6, getValueFromPeriod(period, DurationFieldType.minutes()));
        assertEquals(7, getValueFromPeriod(period, DurationFieldType.seconds()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    @Test
    public void testAddPeriod_null() throws Exception {
        BasePeriod period = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        period.addPeriod(null); // Adding null should have no effect.
        assertEquals(1, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(8, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for addPeriodInto ---
    @Test
    public void testAddPeriodInto_int_array_ReadablePeriod() throws Exception {
        PeriodType type = PeriodType.standard();
        int[] values = {1, 2, 3, 4, 0, 0, 0, 0}; // Initial values
        BasePeriod period = new MutablePeriod(values, type); // Use to get iType
        ReadablePeriod toAdd = new Period(0, 0, 0, 0, 5, 6, 7, 8); // Values to add
        period.addPeriodInto(values, toAdd); // Perform add into the provided array
        // The addPeriodInto method in BasePeriod iterates through the fields of `toAdd`
        // and uses `FieldUtils.safeAdd`.
        assertEquals(1, values[type.indexOf(DurationFieldType.years())]);
        assertEquals(2, values[type.indexOf(DurationFieldType.months())]);
        assertEquals(3, values[type.indexOf(DurationFieldType.weeks())]);
        assertEquals(4, values[type.indexOf(DurationFieldType.days())]);
        assertEquals(5, values[type.indexOf(DurationFieldType.hours())]);
        assertEquals(6, values[type.indexOf(DurationFieldType.minutes())]);
        assertEquals(7, values[type.indexOf(DurationFieldType.seconds())]);
        assertEquals(8, values[type.indexOf(DurationFieldType.millis())]);
    }

    // --- Test cases for setValue ---
    @Test
    public void testSetValue() throws Exception {
        BasePeriod period = new MutablePeriod(); // Standard type, all zeros
        int weekIndex = period.getPeriodType().indexOf(DurationFieldType.weeks());
        period.setValue(weekIndex, 15); // Set weeks to 15
        assertEquals(15, getValueFromPeriod(period, DurationFieldType.weeks()));
        assertEquals(0, getValueFromPeriod(period, DurationFieldType.years())); // Ensure other fields are unchanged
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValue_IndexOutOfBounds() throws Exception {
        PeriodType type = PeriodType.hours(); // size() is 1
        BasePeriod period = new MutablePeriod(type);
        period.setValue(1, 10); // Index 1 is out of bounds.
    }

    // --- Test cases for setValues ---
    @Test
    public void testSetValues() throws Exception {
        BasePeriod period = new MutablePeriod(); // Standard type, all zeros
        int[] newValues = {11, 22, 33, 44, 55, 66, 77, 88};
        period.setValues(newValues); // Set all values
        assertEquals(11, getValueFromPeriod(period, DurationFieldType.years()));
        assertEquals(88, getValueFromPeriod(period, DurationFieldType.millis()));
    }

    // --- Test cases for checkPeriodType ---
    @Test
    public void testCheckPeriodType_null() throws Exception {
        PeriodType defaultType = DateTimeUtils.getPeriodType(null); // Should return standard()
        assertEquals(PeriodType.standard(), defaultType);
        // Now test the constructor that uses checkPeriodType
        BasePeriod period = new MutablePeriod(null, defaultType); // Passing in the already resolved type
        assertEquals(defaultType, period.getPeriodType());
    }

    @Test
    public void testCheckPeriodType_valid() throws Exception {
        PeriodType type = PeriodType.yearMonthDay();
        // The constructor `BasePeriod(long startInstant, long endInstant, PeriodType type, Chronology chrono)`
        // calls checkPeriodType internally.
        BasePeriod period = new MutablePeriod(0L, 1L, type, ISOChronology.getInstanceUTC());
        assertEquals(type, period.getPeriodType());
    }
}
