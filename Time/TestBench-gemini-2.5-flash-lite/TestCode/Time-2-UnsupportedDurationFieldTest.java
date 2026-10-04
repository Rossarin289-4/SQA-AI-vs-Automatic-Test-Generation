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
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;

public class UnsupportedDurationFieldTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // The following helper methods access private members and are intended for testing purposes only.
    // They might need adjustment if the accessibility of these members changes.
    private void clearCache() {
        // Accessing private static field via reflection is generally not recommended in production code,
        // but is acceptable for testing private implementation details.
        try {
            java.lang.reflect.Field cacheField = UnsupportedDurationField.class.getDeclaredField("cCache");
            cacheField.setAccessible(true);
            cacheField.set(null, null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to clear cache", e);
        }
    }

    // The following helper methods access private members and are intended for testing purposes only.
    // They might need adjustment if the accessibility of these members changes.
    private UnsupportedDurationField createUnsupportedDurationField(DurationFieldType type) {
        try {
            java.lang.reflect.Constructor<UnsupportedDurationField> constructor = UnsupportedDurationField.class.getDeclaredConstructor(DurationFieldType.class);
            constructor.setAccessible(true);
            return constructor.newInstance(type);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create UnsupportedDurationField", e);
        }
    }

    @Test
    public void testGetInstance_emptyCache() throws Exception {
        clearCache(); // Ensure cache is empty
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertNotNull(field);
        assertEquals(type, field.getType());
        assertEquals(type.getName(), field.getName());
        assertFalse(field.isSupported());
        assertTrue(field.isPrecise());
        assertEquals(0L, field.getUnitMillis());
    }

    @Test
    public void testGetInstance_cacheHit() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type);
        assertNotNull(field1);
        assertNotNull(field2);
        assertSame(field1, field2); // Should be the same instance from cache
        assertEquals(type, field1.getType());
    }

    @Test
    public void testGetInstance_differentTypes() throws Exception {
        clearCache();
        DurationFieldType type1 = DurationFieldType.minutes();
        DurationFieldType type2 = DurationFieldType.seconds();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);
        assertNotNull(field1);
        assertNotNull(field2);
        assertNotSame(field1, field2);
        assertEquals(type1, field1.getType());
        assertEquals(type2, field2.getType());
    }

    @Test
    public void testGetType() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals(type, field.getType());
    }

    @Test
    public void testGetName() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.years();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals(type.getName(), field.getName());
    }

    @Test
    public void testIsSupported() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.months();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertFalse(field.isSupported());
    }

    @Test
    public void testIsPrecise() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.weeks();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertTrue(field.isPrecise());
    }

    @Test
    public void testGetValue_long() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getValue(1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }
    
    @Test
    public void testGetValueAsLong_long() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getValueAsLong(1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }
    
    @Test
    public void testGetValue_long_long() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.minutes();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getValue(1000L, 12345L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void testGetValueAsLong_long_long() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.seconds();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getValueAsLong(1000L, 12345L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void testGetMillis_int() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.millis();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getMillis(10);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void testGetMillis_long() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.seconds();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getMillis(1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }
    
    @Test
    public void testGetMillis_int_long() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.minutes();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getMillis(10, 12345L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void testGetMillis_long_long() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getMillis(1000L, 12345L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void testAdd_long_int() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.add(12345L, 10);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void testAdd_long_long() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.add(12345L, 1000L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void testGetDifference_long_long() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.minutes();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getDifference(12345L, 6789L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void testGetDifferenceAsLong_long_long() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.seconds();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        try {
            field.getDifferenceAsLong(12345L, 6789L);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertEquals(type + " field is unsupported", ex.getMessage());
        }
    }

    @Test
    public void testGetUnitMillis() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals(0L, field.getUnitMillis());
    }

    @Test
    public void testCompareTo_supportedField() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField unsupportedField = UnsupportedDurationField.getInstance(type);
        // Use a concrete Chronology to get a supported field
        DurationField supportedField = DurationFieldType.days().getField(DateTimeUtils.getChronology(null)); 
        assertEquals(1, unsupportedField.compareTo(supportedField));
    }
    
    @Test
    public void testCompareTo_unsupportedField() throws Exception {
        clearCache();
        DurationFieldType type1 = DurationFieldType.hours();
        DurationFieldType type2 = DurationFieldType.minutes();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);
        assertEquals(0, field1.compareTo(field2));
    }
    
    @Test
    public void testCompareTo_self() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals(0, field.compareTo(field));
    }

    @Test
    public void testEquals_sameInstance() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertTrue(field.equals(field));
    }

    @Test
    public void testEquals_differentInstanceSameType() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type);
        assertTrue(field1.equals(field2));
    }

    @Test
    public void testEquals_differentType() throws Exception {
        clearCache();
        DurationFieldType type1 = DurationFieldType.minutes();
        DurationFieldType type2 = DurationFieldType.seconds();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type2);
        assertFalse(field1.equals(field2));
    }

    @Test
    public void testEquals_null() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertFalse(field.equals(null));
    }

    @Test
    public void testEquals_otherType() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertFalse(field.equals("some string"));
    }

    @Test
    public void testHashCode() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.hours();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type);
        assertEquals(field1.hashCode(), field2.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        clearCache();
        DurationFieldType type = DurationFieldType.minutes();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals("UnsupportedDurationField[minutes]", field.toString());
    }
    
    
    
    // Tests for methods on Partial and its properties that are not covered by the UnsupportedDurationField
    
    @Test
    public void testPartial_size_empty() throws Exception {
        Partial partial = new Partial();
        assertEquals(0, partial.size());
    }

    @Test
    public void testPartial_getChronology() throws Exception {
        Chronology isoChrono = DateTimeUtils.getChronology(null);
        Chronology londonChrono = isoChrono.withZone(DateTimeZone.forID("Europe/London"));
        Partial partial = new Partial(londonChrono);
        // The constructor applies withUTC(), so we expect UTC chronology
        assertEquals(isoChrono.withUTC(), partial.getChronology()); 
    }

    @Test
    public void testPartial_getFieldType() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        assertEquals(DateTimeFieldType.dayOfMonth(), partial.getFieldType(0));
    }

    @Test
    public void testPartial_getFieldTypes_single() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        DateTimeFieldType[] types = partial.getFieldTypes();
        assertNotNull(types);
        assertEquals(1, types.length);
        assertEquals(DateTimeFieldType.dayOfMonth(), types[0]);
    }
    
    @Test
    public void testPartial_getFieldTypes_multiple() throws Exception {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = {2023, 10};
        Partial partial = new Partial(types, values);
        DateTimeFieldType[] resultTypes = partial.getFieldTypes();
        assertNotNull(resultTypes);
        assertEquals(2, resultTypes.length);
        assertEquals(DateTimeFieldType.year(), resultTypes[0]);
        assertEquals(DateTimeFieldType.monthOfYear(), resultTypes[1]);
    }

    @Test
    public void testPartial_getValue() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        assertEquals(15, partial.getValue(0));
    }

    @Test
    public void testPartial_getValues_single() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        int[] values = partial.getValues();
        assertNotNull(values);
        assertEquals(1, values.length);
        assertEquals(15, values[0]);
    }
    
    @Test
    public void testPartial_getValues_multiple() throws Exception {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = {2023, 10};
        Partial partial = new Partial(types, values);
        int[] resultValues = partial.getValues();
        assertNotNull(resultValues);
        assertEquals(2, resultValues.length);
        assertEquals(2023, resultValues[0]);
        assertEquals(10, resultValues[1]);
    }

    @Test
    public void testPartial_withChronologyRetainFields() throws Exception {
        Chronology isoChrono = DateTimeUtils.getChronology(null); // Default ISO chronology
        Chronology londonChrono = isoChrono.withZone(DateTimeZone.forID("Europe/London"));
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15, isoChrono); 
        Partial newPartial = partial.withChronologyRetainFields(londonChrono);
        assertEquals(londonChrono.withUTC(), newPartial.getChronology());
        assertEquals(15, newPartial.getValue(0));
    }

    @Test
    public void testPartial_with_addYear() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial newPartial = partial.with(DateTimeFieldType.year(), 2021);
        assertEquals(2021, newPartial.getValue(0));
        assertSame(partial.getChronology(), newPartial.getChronology());
    }

    @Test
    public void testPartial_with_addMonth() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.year(), 2020);
        Partial newPartial = partial.with(DateTimeFieldType.monthOfYear(), 10);
        assertEquals(2, newPartial.size());
        assertEquals(DateTimeFieldType.year(), newPartial.getFieldType(0));
        assertEquals(2020, newPartial.getValue(0));
        assertEquals(DateTimeFieldType.monthOfYear(), newPartial.getFieldType(1));
        assertEquals(10, newPartial.getValue(1));
    }
    
    @Test
    public void testPartial_without_existingField() throws Exception {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = {2023, 10};
        Partial partial = new Partial(types, values);
        Partial newPartial = partial.without(DateTimeFieldType.year());
        assertEquals(1, newPartial.size());
        assertEquals(DateTimeFieldType.monthOfYear(), newPartial.getFieldType(0));
        assertEquals(10, newPartial.getValue(0));
    }

    @Test
    public void testPartial_without_nonExistingField() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.year(), 2023);
        Partial newPartial = partial.without(DateTimeFieldType.monthOfYear());
        // If field not found, it should return the original instance
        assertSame(partial, newPartial); 
    }

    @Test
    public void testPartial_withField_existing() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.hourOfDay(), 10);
        Partial newPartial = partial.withField(DateTimeFieldType.hourOfDay(), 12);
        assertEquals(12, newPartial.getValue(0));
    }

    @Test
    public void testPartial_withFieldAdded_increaseHour() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.hourOfDay(), 10);
        Partial newPartial = partial.withFieldAdded(DurationFieldType.hours(), 2);
        assertEquals(12, newPartial.getValue(0));
    }

    @Test
    public void testPartial_withFieldAdded_wrapMonth() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 12);
        // Use standard ISO chronology for validation
        Chronology isoChrono = DateTimeUtils.getChronology(null); 
        Partial partialWithChrono = new Partial(partial.getFieldTypes(), partial.getValues(), isoChrono);
        Partial newPartial = partialWithChrono.withFieldAdded(DurationFieldType.months(), 1); // Should wrap to 1
        assertEquals(1, newPartial.getValue(0));
    }

    @Test
    public void testPartial_withFieldAddWrapped_increaseHour() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.hourOfDay(), 10);
        Partial newPartial = partial.withFieldAddWrapped(DurationFieldType.hours(), 2);
        assertEquals(12, newPartial.getValue(0));
    }

    @Test
    public void testPartial_withFieldAddWrapped_wrapMonth() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 12);
        // Use standard ISO chronology for validation
        Chronology isoChrono = DateTimeUtils.getChronology(null); 
        Partial partialWithChrono = new Partial(partial.getFieldTypes(), partial.getValues(), isoChrono);
        Partial newPartial = partialWithChrono.withFieldAddWrapped(DurationFieldType.months(), 1); // Should wrap to 1
        assertEquals(1, newPartial.getValue(0));
    }
    



    @Test
    public void testPartial_property_get() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        Partial.Property prop = partial.property(DateTimeFieldType.dayOfMonth());
        assertEquals(15, prop.get());
    }
    
    @Test
    public void testPartial_property_addToCopy() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        Partial.Property prop = partial.property(DateTimeFieldType.dayOfMonth());
        Partial newPartial = prop.addToCopy(5);
        assertEquals(20, newPartial.getValue(0));
        assertEquals(15, partial.getValue(0)); // Original remains unchanged
    }

    @Test
    public void testPartial_property_addWrapFieldToCopy() throws Exception {
        // Test with a field that has a defined range and wraps. MonthOfYear is good.
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 12);
        Partial.Property prop = partial.property(DateTimeFieldType.monthOfYear());
        // Add 1 month, should wrap to 1 (January)
        Partial newPartial = prop.addWrapFieldToCopy(1); 
        assertEquals(1, newPartial.getValue(0));
        assertEquals(12, partial.getValue(0)); // Original remains unchanged
    }
    
    @Test
    public void testPartial_property_setCopy() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        Partial.Property prop = partial.property(DateTimeFieldType.dayOfMonth());
        Partial newPartial = prop.setCopy(20);
        assertEquals(20, newPartial.getValue(0));
        assertEquals(15, partial.getValue(0)); // Original remains unchanged
    }

    @Test
    public void testPartial_property_setCopy_string() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 1);
        Partial.Property prop = partial.property(DateTimeFieldType.monthOfYear());
        Partial newPartial = prop.setCopy("10", null);
        assertEquals(10, newPartial.getValue(0));
    }

    @Test
    public void testPartial_property_withMaximumValue() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        Partial.Property prop = partial.property(DateTimeFieldType.dayOfMonth());
        // Assuming a standard calendar where max day of month is 31
        Partial newPartial = prop.withMaximumValue();
        assertEquals(31, newPartial.getValue(0));
    }

    @Test
    public void testPartial_property_withMinimumValue() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 15);
        Partial.Property prop = partial.property(DateTimeFieldType.dayOfMonth());
        Partial newPartial = prop.withMinimumValue();
        assertEquals(1, newPartial.getValue(0));
    }
    
    @Test
    public void testPartial_isMatch_partial() throws Exception {
        // Test with a non-empty partial and a matching partial
        Partial partial = new Partial(DateTimeFieldType.year(), 2023);
        Partial matchingPartial = new Partial(DateTimeFieldType.year(), 2023);
        assertTrue(partial.isMatch(matchingPartial));

        // Test with a non-matching partial
        Partial nonMatchingPartial = new Partial(DateTimeFieldType.year(), 2024);
        assertFalse(partial.isMatch(nonMatchingPartial));

        // Test with an empty partial which should match anything.
        Partial emptyPartial = new Partial();
        assertTrue(emptyPartial.isMatch(partial));
    }

    @Test
    public void testPartial_getFormatter() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.year(), 2023);
        // The formatter should not be null for a partial with fields.
        assertNotNull(partial.getFormatter());
    }
    
    @Test
    public void testPartial_getFormatter_empty() throws Exception {
        Partial partial = new Partial();
        assertNull(partial.getFormatter());
    }

    @Test
    public void testPartial_toString() throws Exception {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = {2023, 10};
        Partial partial = new Partial(types, values);
        String s = partial.toString();
        // The exact format depends on the formatter, but it should contain the values.
        assertTrue(s.contains("2023"));
        assertTrue(s.contains("10"));
    }

    @Test
    public void testPartial_toStringList() throws Exception {
        DateTimeFieldType[] types = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        int[] values = {2023, 10};
        Partial partial = new Partial(types, values);
        assertEquals("[year=2023, monthOfYear=10]", partial.toStringList());
    }
    
    @Test
    public void testPartial_toString_withPattern() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.hourOfDay(), 15);
        assertEquals("15", partial.toString("H"));
    }
    
    @Test
    public void testPartial_toString_withPatternAndLocale() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 10);
        assertEquals("Oct", partial.toString("MMM", Locale.ENGLISH));
    }
}

