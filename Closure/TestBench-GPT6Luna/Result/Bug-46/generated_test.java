package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class RecordTypeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEquivalentToSelf() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType record = new RecordTypeBuilder(registry).build();
        assertTrue(record.isEquivalentTo(record));
    }

    @Test
    public void testEquivalentEmptyRecords() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType first = new RecordTypeBuilder(registry).build();
        JSType second = new RecordTypeBuilder(registry).build();
        assertTrue(first.isEquivalentTo(second));
    }

    @Test
    public void testEmptyRecordNotEquivalentToPropertyRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType empty = new RecordTypeBuilder(registry).build();
        JSType withProperty = new RecordTypeBuilder(registry)
                .addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null)
                .build();
        assertFalse(empty.isEquivalentTo(withProperty));
    }

    @Test
    public void testEquivalentRecordsWithSameProperty() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType first = new RecordTypeBuilder(registry).addProperty("a", number, null).build();
        JSType second = new RecordTypeBuilder(registry).addProperty("a", number, null).build();
        assertTrue(first.isEquivalentTo(second));
    }

    @Test
    public void testRecordsWithDifferentPropertyNamesAreNotEquivalent() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType first = new RecordTypeBuilder(registry).addProperty("a", number, null).build();
        JSType second = new RecordTypeBuilder(registry).addProperty("b", number, null).build();
        assertFalse(first.isEquivalentTo(second));
    }

    @Test
    public void testRecordsWithDifferentPropertyTypesAreNotEquivalent() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType first = new RecordTypeBuilder(registry)
                .addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null).build();
        JSType second = new RecordTypeBuilder(registry)
                .addProperty("a", registry.getNativeType(JSTypeNative.STRING_TYPE), null).build();
        assertFalse(first.isEquivalentTo(second));
    }

    @Test
    public void testNonRecordIsNotEquivalent() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType record = new RecordTypeBuilder(registry).build();
        assertFalse(record.isEquivalentTo(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testImplicitPrototypeIsNullWithoutRegistry() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        RecordType record = new RecordTypeBuilder(registry).build().toMaybeRecordType();
        assertNull(record.getImplicitPrototype());
    }

    @Test
    public void testEmptyRecordIsSubtypeOfObject() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType record = new RecordTypeBuilder(registry).build();
        assertTrue(record.isSubtype(registry.getNativeType(JSTypeNative.OBJECT_TYPE)));
    }

    @Test
    public void testRecordIsSubtypeOfItself() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType record = new RecordTypeBuilder(registry)
                .addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null).build();
        assertTrue(record.isSubtype(record));
    }

    @Test
    public void testRecordWithExtraPropertyIsSubtypeOfSmallerRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType smaller = new RecordTypeBuilder(registry).addProperty("a", number, null).build();
        JSType larger = new RecordTypeBuilder(registry)
                .addProperty("a", number, null)
                .addProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), null)
                .build();
        assertTrue(larger.isSubtype(smaller));
    }

    @Test
    public void testRecordMissingRequiredPropertyIsNotSubtype() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType required = new RecordTypeBuilder(registry)
                .addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null).build();
        JSType empty = new RecordTypeBuilder(registry).build();
        assertFalse(empty.isSubtype(required));
    }

    @Test
    public void testRecordWithIncompatiblePropertyIsNotSubtype() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType expected = new RecordTypeBuilder(registry)
                .addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null).build();
        JSType actual = new RecordTypeBuilder(registry)
                .addProperty("a", registry.getNativeType(JSTypeNative.STRING_TYPE), null).build();
        assertFalse(actual.isSubtype(expected));
    }

    @Test
    public void testRecordIsNotSubtypeOfNumber() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType record = new RecordTypeBuilder(registry).build();
        assertFalse(record.isSubtype(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }
}
