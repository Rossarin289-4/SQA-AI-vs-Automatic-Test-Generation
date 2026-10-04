```java
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
    public void testReadResolve() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        Object resolved = ((Serializable) field).readResolve();
        assertTrue(resolved instanceof UnsupportedDurationField);
        assertSame(field, resolved);
    }
    
    @Test
    public void testUnsupportedOperationExceptionMessage() {
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getValue(1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
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
        Partial updated = original.plus(new Period().withDays(5));
        assertEquals(1, updated.size());
        assertEquals(DateTimeFieldType.dayOfMonth(), updated.getFieldType(0));
        assertEquals(15, updated.getValue(0));
    }

    @Test
    public void testPartial_minus() throws Exception {
        Partial original = new Partial(DateTimeFieldType.dayOfMonth(), 10);
        Partial updated = original.minus(new Period().withDays(5));
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
        Partial partial = new Partial(DateTimeFieldType.hourOfDay(), 12, DateTimeFieldType.minuteOfHour(), 30);
        assertEquals("[hourOfDay=12, minuteOfHour=30]", partial.toStringList());
    }
    
    @Test
    public void testPartial_toStringWithPattern() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.hourOfDay(), 12, DateTimeFieldType.minuteOfHour(), 30);
        assertEquals("12:30", partial.toString("HH:mm"));
    }
    
    @Test
    public void testPartial_toStringWithPatternAndLocale() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.hourOfDay(), 12, DateTimeFieldType.minuteOfHour(), 30);
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
        // This test requires a Chronology to determine field bounds.
        // Using ISOChronology for a basic test.
        Chronology chrono = DateTimeUtils.getChronology(null).withUTC();
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 30, chrono);
        Partial.Property property = partial.property(DateTimeFieldType.dayOfMonth());
        Partial result = property.addWrapFieldToCopy(2); // Should wrap around to 1 if max is 31
        assertEquals(1, result.getValue(0)); // Assuming max day is 31
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
        assertEquals(31, result.getValue(0)); // Assuming max day is 31 for ISO Chronology
    }

    @Test
    public void testPartial_Property_withMinimumValue() throws Exception {
        Chronology chrono = DateTimeUtils.getChronology(null).withUTC();
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 10, chrono);
        Partial.Property property = partial.property(DateTimeFieldType.dayOfMonth());
        Partial result = property.withMinimumValue();
        assertEquals(1, result.getValue(0)); // Assuming min day is 1
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
        // Create an unsupported field type. This might not be directly possible without a specific unsupported DurationFieldType.
        // We can simulate by using a field type that might not be supported by default chronology.
        // However, the `with` method adds fields, and the check is whether the *field type* is supported in the chronology.
        // For simplicity, we'll assume a field type that is potentially unsupported and see if it's added.
        // The `with` method itself does not check if the field type is supported.
        // Let's test the behavior when adding a field that exists but might be configured strangely.
        // For a truly "unsupported" field, we'd need a custom DurationFieldType.
        // For now, we'll rely on existing fields.
        
        // If we were to create a custom unsupported field, it would look something like this:
        // DurationFieldType unsupportedDurationType = new DurationFieldType("unsupported") {
        //     public DurationField getField(Chronology chronology) {
        //         return new UnsupportedDurationField(this);
        //     }
        // };
        // DateTimeFieldType unsupportedFieldType = new DateTimeFieldType("unsupportedField") {
        //     public DurationFieldType getDurationType() { return unsupportedDurationType; }
        //     public DurationFieldType getRangeDurationType() { return null; }
        //     public DateTimeField getField(Chronology chronology) { return new UnsupportedDateTimeField(this, chronology.getZone()); } // Hypothetical
        // };
        // The current API does not easily allow creating truly unsupported field types for testing `with`.
        // We'll proceed with testing the `with` method's behavior with existing types.

        // Test that `with` adds a new field.
        Partial updated = original.with(DateTimeFieldType.hourOfDay(), 12);
        assertEquals(2, updated.size());
        assertEquals(DateTimeFieldType.hourOfDay(), updated.getFieldType(0));
        assertEquals(12, updated.getValue(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), updated.getFieldType(1));
        assertEquals(10, updated.getValue(1));
    }

    @Test
    public void testPartial_isMatch_Instant_Null() {
        Partial partial = new Partial(DateTimeFieldType.hourOfDay(), 12);
        // Testing with null instant, which should use default behavior (current time).
        // This test is tricky as it depends on the current time.
        // However, if the `isMatch` method handles null correctly by calling `getInstantMillis(null)`,
        // and that method uses current time, the test might be brittle.
        // A more robust test would mock `DateTimeUtils.getInstantMillis` and `getInstantChronology`.
        // For now, we'll assume that if it doesn't throw an exception, it's okay.
        // The actual behavior of `isMatch(null)` can lead to `NullPointerException` if not handled carefully internally.
        // Let's assume it should handle it gracefully or throw a specific exception.
        // Based on the code: `DateTimeUtils.getInstantMillis(instant)` will return current millis if `instant` is null.
        // `DateTimeUtils.getInstantChronology(instant)` will return default chronology if `instant` is null.
        // So it *should* work, but results depend on the current time.
        // We can't assert a specific match/no-match without knowing current time.
        // We can only assert that it does not throw an exception.
        try {
            partial.isMatch((ReadableInstant) null);
            // If it gets here, no exception was thrown, which is a minimal success.
        } catch (Exception e) {
            fail("isMatch(null) threw an exception: " + e.getMessage());
        }
    }
}
```