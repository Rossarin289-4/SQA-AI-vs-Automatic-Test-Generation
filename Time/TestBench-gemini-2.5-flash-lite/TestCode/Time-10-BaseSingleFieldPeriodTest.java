package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.Minutes;
import org.joda.time.Weeks;
import org.joda.time.Days;
import org.joda.time.Years;
import org.joda.time.Months;
import org.joda.time.Hours;
import org.joda.time.Seconds;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import java.util.Locale;
import java.util.Map;

public class BaseSingleFieldPeriodTest {

    // Test for getFieldType()
    @Test
    public void testGetFieldType_minutes() throws Exception {
        Minutes minutes = Minutes.minutes(5);
        assertEquals(DurationFieldType.minutes(), minutes.getFieldType());
    }

    @Test
    public void testGetFieldType_hours() throws Exception {
        Hours hours = Hours.hours(5);
        assertEquals(DurationFieldType.hours(), hours.getFieldType());
    }

    // Test for getPeriodType()
    @Test
    public void testGetPeriodType_minutes() throws Exception {
        Minutes minutes = Minutes.minutes(5);
        assertEquals(PeriodType.minutes(), minutes.getPeriodType());
    }

    @Test
    public void testGetPeriodType_hours() throws Exception {
        Hours hours = Hours.hours(5);
        assertEquals(PeriodType.hours(), hours.getPeriodType());
    }

    // Test for size()
    @Test
    public void testSize_singleField() throws Exception {
        Minutes minutes = Minutes.minutes(10);
        assertEquals(1, minutes.size());
    }

    // Test for getValue(int)
    @Test
    public void testGetValue_indexZero() throws Exception {
        Minutes minutes = Minutes.minutes(15);
        assertEquals(15, minutes.getValue(0));
    }

    @Test
    public void testGetValue_indexOutOfBounds() throws Exception {
        Minutes minutes = Minutes.minutes(20);
        try {
            minutes.getValue(1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    // Test for get(DurationFieldType)
    @Test
    public void testGet_supportedField() throws Exception {
        Minutes minutes = Minutes.minutes(25);
        assertEquals(25, minutes.get(DurationFieldType.minutes()));
    }

    @Test
    public void testGet_unsupportedField() throws Exception {
        Minutes minutes = Minutes.minutes(30);
        assertEquals(0, minutes.get(DurationFieldType.hours()));
    }

    @Test
    public void testGet_nullField() throws Exception {
        Minutes minutes = Minutes.minutes(35);
        assertEquals(0, minutes.get(null));
    }

    // Test for isSupported(DurationFieldType)
    @Test
    public void testIsSupported_supportedField() throws Exception {
        Minutes minutes = Minutes.minutes(40);
        assertTrue(minutes.isSupported(DurationFieldType.minutes()));
    }

    @Test
    public void testIsSupported_unsupportedField() throws Exception {
        Minutes minutes = Minutes.minutes(45);
        assertFalse(minutes.isSupported(DurationFieldType.hours()));
    }

    @Test
    public void testIsSupported_nullField() throws Exception {
        Minutes minutes = Minutes.minutes(50);
        assertFalse(minutes.isSupported(null));
    }

    // Test for toPeriod()
    @Test
    public void testToPeriod() throws Exception {
        Minutes minutes = Minutes.minutes(55);
        Period period = minutes.toPeriod();
        assertEquals(PeriodType.standard(), period.getPeriodType());
        assertEquals(0, period.getHours());
        assertEquals(55, period.getMinutes());
        assertEquals(0, period.getSeconds());
        assertEquals(0, period.getMillis());
    }

    // Test for toMutablePeriod()
    @Test
    public void testToMutablePeriod() throws Exception {
        Minutes minutes = Minutes.minutes(60);
        MutablePeriod mPeriod = minutes.toMutablePeriod();
        assertEquals(PeriodType.standard(), mPeriod.getPeriodType());
        assertEquals(0, mPeriod.getHours());
        assertEquals(60, mPeriod.getMinutes());
        assertEquals(0, mPeriod.getSeconds());
        assertEquals(0, mPeriod.getMillis());
    }

    // Test for equals(Object)
    @Test
    public void testEquals_sameObject() throws Exception {
        Minutes minutes = Minutes.minutes(65);
        assertTrue(minutes.equals(minutes));
    }

    @Test
    public void testEquals_null() throws Exception {
        Minutes minutes = Minutes.minutes(70);
        assertFalse(minutes.equals(null));
    }

    @Test
    public void testEquals_differentClass() throws Exception {
        Minutes minutes = Minutes.minutes(75);
        Hours hours = Hours.hours(75);
        assertFalse(minutes.equals(hours));
    }

    @Test
    public void testEquals_differentValue() throws Exception {
        Minutes minutes1 = Minutes.minutes(80);
        Minutes minutes2 = Minutes.minutes(85);
        assertFalse(minutes1.equals(minutes2));
    }

    @Test
    public void testEquals_sameValueSameType() throws Exception {
        Minutes minutes1 = Minutes.minutes(90);
        Minutes minutes2 = Minutes.minutes(90);
        assertTrue(minutes1.equals(minutes2));
    }
    
    @Test
    public void testEquals_differentPeriodType() throws Exception {
        Minutes minutes1 = Minutes.minutes(100);
        MutablePeriod period = new MutablePeriod();
        period.setHours(100); // Same value, different PeriodType
        assertFalse(minutes1.equals(period));
    }

    // Test for hashCode()
    @Test
    public void testHashCode() throws Exception {
        Minutes minutes1 = Minutes.minutes(100);
        Minutes minutes2 = Minutes.minutes(100);
        assertEquals(minutes1.hashCode(), minutes2.hashCode());
        
        Minutes minutes3 = Minutes.minutes(105);
        assertFalse(minutes1.hashCode() == minutes3.hashCode());
    }

    // Test for compareTo(BaseSingleFieldPeriod other)
    @Test
    public void testCompareTo_equal() throws Exception {
        Minutes minutes1 = Minutes.minutes(110);
        Minutes minutes2 = Minutes.minutes(110);
        assertEquals(0, minutes1.compareTo(minutes2));
    }

    @Test
    public void testCompareTo_greater() throws Exception {
        Minutes minutes1 = Minutes.minutes(115);
        Minutes minutes2 = Minutes.minutes(110);
        assertEquals(1, minutes1.compareTo(minutes2));
    }

    @Test
    public void testCompareTo_less() throws Exception {
        Minutes minutes1 = Minutes.minutes(110);
        Minutes minutes2 = Minutes.minutes(115);
        assertEquals(-1, minutes1.compareTo(minutes2));
    }

    @Test
    public void testCompareTo_differentClass() throws Exception {
        Minutes minutes = Minutes.minutes(120);
        Hours hours = Hours.hours(120);
        try {
            minutes.compareTo(hours);
            fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }
    
    @Test
    public void testCompareTo_nullOther() throws Exception {
        Minutes minutes = Minutes.minutes(125);
        try {
            // The method signature is BaseSingleFieldPeriod other, so a null is expected to throw NPE.
            minutes.compareTo(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    // Test for static method between(ReadableInstant, ReadableInstant, DurationFieldType)
    @Test
    public void testStaticBetweenInstantField_simple() throws Exception {
        DateTime start = new DateTime(2023, 10, 26, 10, 0, 0, 0);
        DateTime end = new DateTime(2023, 10, 26, 12, 30, 0, 0);
        assertEquals(2, BaseSingleFieldPeriod.between(start, end, DurationFieldType.hours()));
    }

    @Test
    public void testStaticBetweenInstantField_negativeDifference() throws Exception {
        DateTime start = new DateTime(2023, 10, 26, 12, 30, 0, 0);
        DateTime end = new DateTime(2023, 10, 26, 10, 0, 0, 0);
        assertEquals(-2, BaseSingleFieldPeriod.between(start, end, DurationFieldType.hours()));
    }

    @Test
    public void testStaticBetweenInstantField_zeroDifference() throws Exception {
        DateTime start = new DateTime(2023, 10, 26, 10, 0, 0, 0);
        DateTime end = new DateTime(2023, 10, 26, 10, 0, 0, 0);
        assertEquals(0, BaseSingleFieldPeriod.between(start, end, DurationFieldType.hours()));
    }

    @Test
    public void testStaticBetweenInstantField_nullStart() throws Exception {
        DateTime end = new DateTime(2023, 10, 26, 12, 30, 0, 0);
        try {
            BaseSingleFieldPeriod.between(null, end, DurationFieldType.hours());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testStaticBetweenInstantField_nullEnd() throws Exception {
        DateTime start = new DateTime(2023, 10, 26, 10, 0, 0, 0);
        try {
            BaseSingleFieldPeriod.between(start, null, DurationFieldType.hours());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testStaticBetweenInstantField_minutes() throws Exception {
        DateTime start = new DateTime(2023, 10, 26, 10, 15, 0, 0);
        DateTime end = new DateTime(2023, 10, 26, 11, 45, 0, 0);
        assertEquals(90, BaseSingleFieldPeriod.between(start, end, DurationFieldType.minutes()));
    }

    @Test
    public void testStaticBetweenInstantField_seconds() throws Exception {
        DateTime start = new DateTime(2023, 10, 26, 10, 0, 30, 0);
        DateTime end = new DateTime(2023, 10, 26, 10, 1, 15, 0);
        assertEquals(45, BaseSingleFieldPeriod.between(start, end, DurationFieldType.seconds()));
    }
    
    // Test for static method between(ReadablePartial, ReadablePartial, ReadablePeriod)
    @Test
    public void testStaticBetweenPartial_simple() throws Exception {
        // Using Minutes as a simple ReadablePeriod zero instance
        MockReadablePartial start = new MockReadablePartial(new int[]{10, 30}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()});
        MockReadablePartial end = new MockReadablePartial(new int[]{12, 00}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()});
        assertEquals(90, BaseSingleFieldPeriod.between(start, end, Minutes.minutes(0)));
    }

    @Test
    public void testStaticBetweenPartial_negativeDifference() throws Exception {
        MockReadablePartial start = new MockReadablePartial(new int[]{12, 00}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()});
        MockReadablePartial end = new MockReadablePartial(new int[]{10, 30}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()});
        assertEquals(-90, BaseSingleFieldPeriod.between(start, end, Minutes.minutes(0)));
    }

    @Test
    public void testStaticBetweenPartial_zeroDifference() throws Exception {
        MockReadablePartial start = new MockReadablePartial(new int[]{10, 30}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()});
        MockReadablePartial end = new MockReadablePartial(new int[]{10, 30}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()});
        assertEquals(0, BaseSingleFieldPeriod.between(start, end, Minutes.minutes(0)));
    }

    @Test
    public void testStaticBetweenPartial_nullStart() throws Exception {
        MockReadablePartial end = new MockReadablePartial(new int[]{12, 00}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()});
        try {
            BaseSingleFieldPeriod.between(null, end, Minutes.minutes(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testStaticBetweenPartial_nullEnd() throws Exception {
        MockReadablePartial start = new MockReadablePartial(new int[]{10, 30}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()});
        try {
            BaseSingleFieldPeriod.between(start, null, Minutes.minutes(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testStaticBetweenPartial_differentSize() throws Exception {
        MockReadablePartial start = new MockReadablePartial(new int[]{10}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay()});
        MockReadablePartial end = new MockReadablePartial(new int[]{12, 00}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()});
        try {
            BaseSingleFieldPeriod.between(start, end, Minutes.minutes(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testStaticBetweenPartial_differentFieldType() throws Exception {
        MockReadablePartial start = new MockReadablePartial(new int[]{10, 30}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()});
        MockReadablePartial end = new MockReadablePartial(new int[]{12, 00}, new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfWeek()}); // Different field
        try {
            BaseSingleFieldPeriod.between(start, end, Minutes.minutes(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
    
    // Test for static method standardPeriodIn(ReadablePeriod, long)
    @Test
    public void testStaticStandardPeriodIn_simple() throws Exception {
        MutablePeriod period = new MutablePeriod();
        period.setHours(2);
        // Use getField(ISOChronology.getInstanceUTC()) to get the correct DurationField
        long millisPerHour = DurationFieldType.hours().getField(ISOChronology.getInstanceUTC()).getUnitMillis();
        assertEquals(2, BaseSingleFieldPeriod.standardPeriodIn(period, millisPerHour));
    }
    
    @Test
    public void testStaticStandardPeriodIn_zeroPeriod() throws Exception {
        MutablePeriod period = new MutablePeriod();
        long millisPerUnit = 1000; // seconds
        assertEquals(0, BaseSingleFieldPeriod.standardPeriodIn(period, millisPerUnit));
    }
    
    @Test
    public void testStaticStandardPeriodIn_nullPeriod() throws Exception {
        long millisPerUnit = 1000; // seconds
        assertEquals(0, BaseSingleFieldPeriod.standardPeriodIn(null, millisPerUnit));
    }
    
    @Test
    public void testStaticStandardPeriodIn_multipleFields() throws Exception {
        MutablePeriod period = new MutablePeriod();
        period.setDays(1);
        period.setHours(2);
        period.setMinutes(30);
        
        long totalMillis = (1L * DurationFieldType.days().getField(ISOChronology.getInstanceUTC()).getUnitMillis()) +
                           (2L * DurationFieldType.hours().getField(ISOChronology.getInstanceUTC()).getUnitMillis()) +
                           (30L * DurationFieldType.minutes().getField(ISOChronology.getInstanceUTC()).getUnitMillis());
        
        assertEquals(FieldUtils.safeToInt(totalMillis / 1000), BaseSingleFieldPeriod.standardPeriodIn(period, 1000));
    }

    @Test
    public void testStaticStandardPeriodIn_impreciseField() throws Exception {
        MutablePeriod period = new MutablePeriod();
        period.setYears(1); // Years are imprecise
        
        long millisPerUnit = 1000; // seconds
        try {
            BaseSingleFieldPeriod.standardPeriodIn(period, millisPerUnit);
            fail("Expected IllegalArgumentException for imprecise field (years)");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("is not precise"));
        }
    }
    
    // The original test for overflow was incorrect because FieldUtils.safeToInt
    // itself throws ArithmeticException if the value overflows.
    // Testing for that specific exception is correct.
    @Test
    public void testStaticStandardPeriodIn_overflow() throws Exception {
        MutablePeriod period = new MutablePeriod();
        period.setHours(Integer.MAX_VALUE); // Set a value that will likely cause overflow
        long millisPerHour = DurationFieldType.hours().getField(ISOChronology.getInstanceUTC()).getUnitMillis();
        
        // Calculate expected duration in milliseconds
        long durationMillis = FieldUtils.safeMultiply(millisPerHour, Integer.MAX_VALUE);
        
        // The division result might still be within long range, but converting to int might overflow.
        // FieldUtils.safeToInt throws ArithmeticException on overflow.
        try {
            BaseSingleFieldPeriod.standardPeriodIn(period, millisPerHour);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException expected) {
            // This exception is expected when the result of division/conversion exceeds Integer.MAX_VALUE
        }
    }

    // Mock classes for testing static methods

    private static class MockReadablePartial implements ReadablePartial {
        private final int[] values;
        private final DateTimeFieldType[] fieldTypes;
        
        MockReadablePartial(int[] values, DateTimeFieldType[] fieldTypes) {
            this.values = values;
            this.fieldTypes = fieldTypes;
        }
        
        @Override public int size() { return values.length; }
        @Override public DateTimeFieldType getFieldType(int index) { return fieldTypes[index]; }
        @Override public DateTimeField getField(int index) { return null; } // Not needed for this test
        @Override public int getValue(int index) { return values[index]; }
        @Override public Chronology getChronology() { return ISOChronology.getInstanceUTC(); }
        @Override public int get(DateTimeFieldType field) { 
            for (int i = 0; i < fieldTypes.length; i++) {
                if (fieldTypes[i].equals(field)) {
                    return values[i];
                }
            }
            return 0; // Not found
        }
        @Override public boolean isSupported(DateTimeFieldType field) { 
             for (DateTimeFieldType ft : fieldTypes) {
                if (ft.equals(field)) {
                    return true;
                }
            }
            return false;
        }
        @Override public DateTime toDateTime(ReadableInstant baseInstant) { return null; } // Not needed for this test
        @Override public boolean equals(Object partial) { return false; } // Not needed for this test
        @Override public int hashCode() { return 0; } // Not needed for this test
        @Override public String toString() { return null; } // Not needed for this test
        @Override public int compareTo(ReadablePartial other) { return 0; } // Not needed for this test
    }
}
