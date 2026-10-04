package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.Partial;
import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.joda.time.base.AbstractPartial;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadableInstant;
import org.joda.time.Period;

public class UnsupportedDurationFieldTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testGetInstance_ExistingType() throws Exception {
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type);
        assertNotNull(field1);
        assertSame(field1, field2);
    }

    @Test
    public void testGetInstance_NewType() throws Exception {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertNotNull(field);
    }

    @Test
    public void testGetType() throws Exception {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals(type, field.getType());
    }

    @Test
    public void testGetName() throws Exception {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals("hours", field.getName());
    }

    @Test
    public void testIsSupported() throws Exception {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertFalse(field.isSupported());
    }

    @Test
    public void testIsPrecise() throws Exception {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertTrue(field.isPrecise());
    }

    @Test
    public void testGetValue_Duration() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getValue(1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetValueAsLong_Duration() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getValueAsLong(1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetValue_Duration_Instant() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getValue(1000L, 0L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetValueAsLong_Duration_Instant() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getValueAsLong(1000L, 0L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetMillis_int() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getMillis(10);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetMillis_long() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getMillis(1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetMillis_int_Instant() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getMillis(10, 0L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetMillis_long_Instant() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getMillis(1000L, 0L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAdd_long_int() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.add(0L, 10);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAdd_long_long() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.add(0L, 1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetDifference_long_long() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getDifference(1000L, 500L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetDifferenceAsLong_long_long() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getDifferenceAsLong(1000L, 500L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetUnitMillis() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals(0L, field.getUnitMillis());
    }

    @Test
    public void testCompareTo() {
        DurationFieldType type1 = DurationFieldType.hours();
        DurationFieldType type2 = DurationFieldType.minutes();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);
        assertEquals(0, field1.compareTo(field2));
    }

    @Test
    public void testEquals_SameInstance() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertTrue(field.equals(field));
    }

    @Test
    public void testEquals_DifferentType() {
        DurationFieldType type1 = DurationFieldType.hours();
        DurationFieldType type2 = DurationFieldType.minutes();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);
        assertFalse(field1.equals(field2));
    }
    
    @Test
    public void testEquals_DifferentClass() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertFalse(field.equals("not a duration field"));
    }
    
    @Test
    public void testHashCode() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals("hours".hashCode(), field.hashCode());
    }

    @Test
    public void testToString() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals("UnsupportedDurationField[hours]", field.toString());
    }

    @Test
    public void testUnsupportedOperationExceptionMessage() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getValue(1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // The expected message is "UnsupportedDurationField[type] field is unsupported"
            assertEquals("UnsupportedDurationField[hours] field is unsupported", e.getMessage());
        }
    }

    // New tests for methods not previously covered
    
    @Test
    public void testPartial_EmptyConstructor() throws Exception {
        Partial partial = new Partial();
        assertEquals(0, partial.size());
        assertNotNull(partial.getChronology());
        assertEquals(0, partial.getFieldTypes().length);
        assertEquals(0, partial.getValues().length);
    }

    @Test
    public void testPartial_EmptyConstructorWithChronology() throws Exception {
        Chronology chrono = DateTimeUtils.getChronology(null).withUTC();
        Partial partial = new Partial(chrono);
        assertEquals(0, partial.size());
        assertEquals(chrono, partial.getChronology());
    }
    
    @Test
    public void testPartial_SingleFieldConstructor() throws Exception {
        DateTimeFieldType type = DateTimeFieldType.dayOfMonth();
        int value = 15;
        Partial partial = new Partial(type, value);
        assertEquals(1, partial.size());
        assertEquals(type, partial.getFieldType(0));
        assertEquals(value, partial.getValue(0));
        assertEquals(DateTimeUtils.getChronology(null).withUTC(), partial.getChronology());
    }

    @Test
    public void testPartial_SingleFieldConstructorWithChronology() throws Exception {
        DateTimeFieldType type = DateTimeFieldType.dayOfMonth();
        int value = 15;
        Chronology chrono = DateTimeUtils.getChronology(null).withUTC();
        Partial partial = new Partial(type, value, chrono);
        assertEquals(1, partial.size());
        assertEquals(type, partial.getFieldType(0));
        assertEquals(value, partial.getValue(0));
        assertEquals(chrono, partial.getChronology());
    }

    @Test
    public void testPartial_MultipleFieldsConstructor() throws Exception {
        DateTimeFieldType[] types = {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()};
        int[] values = {10, 30};
        Partial partial = new Partial(types, values);
        assertEquals(2, partial.size());
        assertEquals(types[0], partial.getFieldType(0));
        assertEquals(values[0], partial.getValue(0));
        assertEquals(types[1], partial.getFieldType(1));
        assertEquals(values[1], partial.getValue(1));
    }
    
    @Test
    public void testPartial_MultipleFieldsConstructorWithChronology() throws Exception {
        DateTimeFieldType[] types = {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()};
        int[] values = {10, 30};
        Chronology chrono = DateTimeUtils.getChronology(null).withUTC();
        Partial partial = new Partial(types, values, chrono);
        assertEquals(2, partial.size());
        assertEquals(types[0], partial.getFieldType(0));
        assertEquals(values[0], partial.getValue(0));
        assertEquals(types[1], partial.getFieldType(1));
        assertEquals(values[1], partial.getValue(1));
        assertEquals(chrono, partial.getChronology());
    }

    @Test
    public void testPartial_CopyConstructor() throws Exception {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial copy = new Partial(original);
        assertEquals(original.size(), copy.size());
        assertEquals(original.getFieldType(0), copy.getFieldType(0));
        assertEquals(original.getValue(0), copy.getValue(0));
        assertEquals(original.getChronology(), copy.getChronology());
    }

    @Test
    public void testPartial_withChronologyRetainFields() throws Exception {
        Chronology initialChrono = DateTimeUtils.getChronology(null);
        Chronology newChrono = DateTimeUtils.getChronology(null).withUTC();
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 10, initialChrono);
        Partial newPartial = partial.withChronologyRetainFields(newChrono);
        assertEquals(partial.size(), newPartial.size());
        assertEquals(partial.getFieldType(0), newPartial.getFieldType(0));
        assertEquals(partial.getValue(0), newPartial.getValue(0));
        assertEquals(newChrono, newPartial.getChronology());
    }

    @Test
    public void testPartial_withField_Existing() throws Exception {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial updated = original.with(DateTimeFieldType.dayOfMonth(), 15);
        assertEquals(1, updated.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), updated.getFieldType(0));
        assertEquals(15, updated.getValue(0));
    }

    @Test
    public void testPartial_withField_New() throws Exception {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial updated = original.with(DateTimeFieldType.hourOfDay(), 12);
        assertEquals(2, updated.size());
        // The 'with' method should insert the new field in the correct order (largest to smallest)
        // The current implementation inserts it at the beginning if it's larger.
        // Let's test based on the actual behavior of the provided code, which seems to place hourOfDay before dayOfMonth.
        assertEquals(DateTimeFieldType.hourOfDay(), updated.getFieldType(0));
        assertEquals(12, updated.getValue(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), updated.getFieldType(1));
        assertEquals(10, updated.getValue(1));
    }
    
    @Test
    public void testPartial_withoutField_Existing() throws Exception {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial updated = original.without(DateTimeFieldType.dayOfMonth());
        assertEquals(0, updated.size());
    }

    @Test
    public void testPartial_withoutField_NonExisting() throws Exception {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial updated = original.without(DateTimeFieldType.hourOfDay());
        assertEquals(1, updated.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), updated.getFieldType(0));
        assertEquals(10, updated.getValue(0));
        assertSame(original, updated);
    }

    @Test
    public void testPartial_withFieldAdded() throws Exception {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial updated = original.withFieldAdded(DurationFieldType.days(), 5);
        assertEquals(1, updated.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), updated.getFieldType(0));
        assertEquals(15, updated.getValue(0));
    }
    
    @Test
    public void testPartial_plus() throws Exception {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Period period = new Period();
        period = period.withDays(5);
        Partial updated = original.plus(period);
        assertEquals(1, updated.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), updated.getFieldType(0));
        assertEquals(15, updated.getValue(0));
    }

    @Test
    public void testPartial_minus() throws Exception {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Period period = new Period();
        period = period.withDays(5);
        Partial updated = original.minus(period);
        assertEquals(1, updated.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), updated.getFieldType(0));
        assertEquals(5, updated.getValue(0));
    }

    @Test
    public void testPartial_property() throws Exception {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial.Property property = original.property(DateTimeFieldType.dayOfMonth());
        assertNotNull(property);
        assertEquals(10, property.get());
        assertEquals(original, property.getPartial());
    }
    
    @Test
    public void testPartial_isMatch_Partial() throws Exception {
        Partial partial1 = new Partial(DateTimeFieldType.hourOfDay(), 12);
        Partial partial2 = new Partial(DateTimeFieldType.hourOfDay(), 12);
        Partial partial3 = new Partial(DateTimeFieldType.hourOfDay(), 13);
        assertTrue(partial1.isMatch(partial2));
        assertFalse(partial1.isMatch(partial3));
    }

    @Test
    public void testPartial_toStringList() throws Exception {
        Partial partial = new Partial(new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[]{12, 30});
        assertEquals("[hourOfDay=12, minuteOfHour=30]", partial.toStringList());
    }
    
    @Test
    public void testPartial_toStringWithPattern() throws Exception {
        Partial partial = new Partial(new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[]{12, 30});
        assertEquals("12:30", partial.toString("HH:mm"));
    }
    
    @Test
    public void testPartial_toStringWithPatternAndLocale() throws Exception {
        Partial partial = new Partial(new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, new int[]{12, 30});
        assertEquals("12:30", partial.toString("HH:mm", Locale.US));
    }

    @Test
    public void testPartial_Property_get() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        Partial.Property property = partial.property(DateTimeFieldType.dayOfMonth());
        assertEquals(15, property.get());
    }

    @Test
    public void testPartial_Property_addToCopy() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial.Property property = partial.property(DateTimeFieldType.dayOfMonth());
        Partial result = property.addToCopy(5);
        assertEquals(15, result.getValue(0));
    }

    @Test
    public void testPartial_Property_addWrapFieldToCopy() throws Exception {
        Chronology chrono = DateTimeUtils.getChronology(null).withUTC();
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 30, chrono);
        Partial.Property property = partial.property(DateTimeFieldType.dayOfMonth());
        Partial result = property.addWrapFieldToCopy(2); 
        // For ISO chronology, max day of month is 31. So 30 + 2 should be 1.
        assertEquals(1, result.getValue(0)); 
    }

    @Test
    public void testPartial_Property_setCopy() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial.Property property = partial.property(DateTimeFieldType.dayOfMonth());
        Partial result = property.setCopy(20);
        assertEquals(20, result.getValue(0));
    }

    @Test
    public void testPartial_Property_setCopy_String() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial.Property property = partial.property(DateTimeFieldType.dayOfMonth());
        Partial result = property.setCopy("15");
        assertEquals(15, result.getValue(0));
    }

    @Test
    public void testPartial_Property_withMaximumValue() throws Exception {
        Chronology chrono = DateTimeUtils.getChronology(null).withUTC();
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 10, chrono);
        Partial.Property property = partial.property(DateTimeFieldType.dayOfMonth());
        Partial result = property.withMaximumValue();
        // For ISO chronology, max day of month is 31.
        assertEquals(31, result.getValue(0)); 
    }

    @Test
    public void testPartial_Property_withMinimumValue() throws Exception {
        Chronology chrono = DateTimeUtils.getChronology(null).withUTC();
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 10, chrono);
        Partial.Property property = partial.property(DateTimeFieldType.dayOfMonth());
        Partial result = property.withMinimumValue();
        assertEquals(1, result.getValue(0)); 
    }
    
    @Test
    public void testGetFormatter() {
        Partial partial = new Partial(DateTimeFieldType.year(), 2023);
        assertNotNull(partial.getFormatter());
    }
    
    @Test
    public void testGetFormatter_empty() {
        Partial partial = new Partial();
        assertNull(partial.getFormatter());
    }
    
    @Test
    public void testPartial_withField_NewFieldIsUnsupported() {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        // When adding a new field that's not currently present,
        // the `with` method should insert it in the correct order.
        // For `dayOfMonth` and `hourOfDay`, `hourOfDay` is larger.
        Partial updated = original.with(DateTimeFieldType.hourOfDay(), 12);
        assertEquals(2, updated.size());
        // The `with` method should insert `hourOfDay` before `dayOfMonth`.
        assertEquals(DateTimeFieldType.hourOfDay(), updated.getFieldType(0));
        assertEquals(12, updated.getValue(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), updated.getFieldType(1));
        assertEquals(10, updated.getValue(1));
    }

    @Test
    public void testPartial_isMatch_Instant_Null() {
        Partial partial = new Partial(DateTimeFieldType.hourOfDay(), 12);
        // The isMatch(ReadableInstant) method should handle a null instant gracefully.
        // According to the javadoc for getInstantMillis, if instant is null, it defaults to "now".
        // Therefore, it should not throw an exception.
        try {
            partial.isMatch((ReadableInstant) null);
        } catch (Exception e) {
            fail("isMatch(null) threw an exception: " + e.getMessage());
        }
    }
}
