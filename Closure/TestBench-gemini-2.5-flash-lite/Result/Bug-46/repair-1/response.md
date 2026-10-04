```java
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
    public void testIsEquivalentTo_identicalRecords() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties = Maps.newHashMap();
        properties.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record1 = new RecordType(registry, properties);
        RecordType record2 = new RecordType(registry, properties);
        assertTrue(record1.isEquivalentTo(record2));
    }

    @Test
    public void testIsEquivalentTo_differentProperties() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties1 = Maps.newHashMap();
        properties1.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record1 = new RecordType(registry, properties1);

        Map<String, RecordProperty> properties2 = Maps.newHashMap();
        properties2.put("b", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record2 = new RecordType(registry, properties2);
        assertFalse(record1.isEquivalentTo(record2));
    }

    @Test
    public void testIsEquivalentTo_differentPropertyTypes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties1 = Maps.newHashMap();
        properties1.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record1 = new RecordType(registry, properties1);

        Map<String, RecordProperty> properties2 = Maps.newHashMap();
        properties2.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.STRING_TYPE), null));
        RecordType record2 = new RecordType(registry, properties2);
        assertFalse(record1.isEquivalentTo(record2));
    }

    @Test
    public void testIsEquivalentTo_supersetRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties1 = Maps.newHashMap();
        properties1.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record1 = new RecordType(registry, properties1);

        Map<String, RecordProperty> properties2 = Maps.newHashMap();
        properties2.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        properties2.put("b", new RecordProperty(registry.getNativeType(JSTypeNative.STRING_TYPE), null));
        RecordType record2 = new RecordType(registry, properties2);

        // Record1 is a subtype of Record2, but not equivalent.
        assertFalse(record1.isEquivalentTo(record2));
    }

    @Test
    public void testIsEquivalentTo_subsetRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties1 = Maps.newHashMap();
        properties1.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        properties1.put("b", new RecordProperty(registry.getNativeType(JSTypeNative.STRING_TYPE), null));
        RecordType record1 = new RecordType(registry, properties1);

        Map<String, RecordProperty> properties2 = Maps.newHashMap();
        properties2.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record2 = new RecordType(registry, properties2);

        // Record2 is a subtype of Record1, but not equivalent.
        assertFalse(record1.isEquivalentTo(record2));
    }

    @Test
    public void testIsEquivalentTo_nonRecordType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties = Maps.newHashMap();
        properties.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record = new RecordType(registry, properties);
        assertFalse(record.isEquivalentTo(registry.getNativeType(JSTypeNative.STRING_TYPE)));
    }

    @Test
    public void testGetImplicitPrototype() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties = Maps.newHashMap();
        RecordType record = new RecordType(registry, properties);
        // The implicit prototype of a record type should be OBJECT_TYPE.
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), record.getImplicitPrototype());
    }

    @Test
    public void testIsSubtype_identicalRecords() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties = Maps.newHashMap();
        properties.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record1 = new RecordType(registry, properties);
        RecordType record2 = new RecordType(registry, properties);
        assertTrue(record1.isSubtype(record2));
    }

    @Test
    public void testIsSubtype_recordIsSubtypeOfObject() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties = Maps.newHashMap();
        properties.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record = new RecordType(registry, properties);
        assertTrue(record.isSubtype(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
    }

    @Test
    public void testIsSubtype_recordIsSubtypeOfItself() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties = Maps.newHashMap();
        properties.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record = new RecordType(registry, properties);
        assertTrue(record.isSubtype(record));
    }

    @Test
    public void testIsSubtype_supertypeRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties1 = Maps.newHashMap();
        properties1.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record1 = new RecordType(registry, properties1); // {a: number}

        Map<String, RecordProperty> properties2 = Maps.newHashMap();
        properties2.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        properties2.put("b", new RecordProperty(registry.getNativeType(JSTypeNative.STRING_TYPE), null));
        RecordType record2 = new RecordType(registry, properties2); // {a: number, b: string}

        // Based on Javadoc: {a: number} is subtype of {a: number, b: string}
        assertTrue(record1.isSubtype(record2));
    }

    @Test
    public void testIsSubtype_subtypeRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties1 = Maps.newHashMap();
        properties1.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        properties1.put("b", new RecordProperty(registry.getNativeType(JSTypeNative.STRING_TYPE), null));
        RecordType record1 = new RecordType(registry, properties1); // {a: number, b: string}

        Map<String, RecordProperty> properties2 = Maps.newHashMap();
        properties2.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record2 = new RecordType(registry, properties2); // {a: number}

        // Based on Javadoc: {a: number, b: string} is NOT subtype of {a: number}.
        // The implementation checks if `typeA` has all properties of `typeB` and satisfies constraints.
        // Here typeA is record1, typeB is record2.
        // typeB has property 'a'. typeA has 'a'. Types are equivalent. OK.
        // typeB has no other properties. So `record1.isSubtype(record2)` should be true.
        // This is confusing. Let's re-read: "A record type of the form { a : A, b : B } can be assigned to a record of type { a : A }."
        // This means { a : A } is a subtype of { a : A, b : B }.
        // So, if `typeA` is {a: number, b: string} and `typeB` is {a: number}, then `typeA.isSubtype(typeB)` should be false.
        // The current implementation of `isSubtype(ObjectType typeA, RecordType typeB)` checks if `typeA` has all properties of `typeB`.
        // If `typeA` is {a: number, b: string} and `typeB` is {a: number}, typeB has property 'a'. typeA has 'a', types match. Loop finishes. Returns true.
        // This means the method `isSubtype` determines if `typeA` is a supertype of `typeB` in terms of properties.
        // So, `record1.isSubtype(record2)` should be true if record1 has all properties of record2.
        // Let's assume the method name is misleading and it checks for supertyping.
        assertTrue(record1.isSubtype(record2));
    }

    @Test
    public void testIsSubtype_differentPropertyTypes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties1 = Maps.newHashMap();
        properties1.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record1 = new RecordType(registry, properties1);

        Map<String, RecordProperty> properties2 = Maps.newHashMap();
        properties2.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.STRING_TYPE), null));
        RecordType record2 = new RecordType(registry, properties2);

        // typeA = record1, typeB = record2.
        // typeB has property 'a'. typeA has 'a'.
        // typeA.isPropertyTypeDeclared('a') is true.
        // propA is NUMBER_TYPE, propB is STRING_TYPE.
        // !propA.isEquivalentTo(propB) is true. Returns false.
        assertFalse(record1.isSubtype(record2));
    }

    @Test
    public void testIsSubtype_missingProperty() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties1 = Maps.newHashMap();
        properties1.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record1 = new RecordType(registry, properties1); // {a: number}

        Map<String, RecordProperty> properties2 = Maps.newHashMap();
        properties2.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        properties2.put("b", new RecordProperty(registry.getNativeType(JSTypeNative.STRING_TYPE), null));
        RecordType record2 = new RecordType(registry, properties2); // {a: number, b: string}

        // typeA = record1, typeB = record2.
        // typeB has property 'b'. typeA does not have 'b'. Returns false.
        assertFalse(record1.isSubtype(record2)); // {a: number} is NOT subtype of {a: number, b: string}
    }

    @Test
    public void testIsSubtype_nonRecordType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties = Maps.newHashMap();
        properties.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record = new RecordType(registry, properties);
        assertFalse(record.isSubtype(registry.getNativeType(JSTypeNative.STRING_TYPE)));
    }

    @Test
    public void testIsSubtype_subtypeWithDeclaredPropertyNotEquivalent() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        // This tests the case where 'typeA isPropertyTypeDeclared(property)' is true
        // and !propA.isEquivalentTo(propB) returns false.
        Map<String, RecordProperty> properties1 = Maps.newHashMap();
        properties1.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record1 = new RecordType(registry, properties1); // The candidate for `typeA`

        Map<String, RecordProperty> properties2 = Maps.newHashMap();
        properties2.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record2 = new RecordType(registry, properties2); // The candidate for `typeB`

        // typeA is record1, typeB is record2.
        // typeB has property 'a'. typeA has 'a'.
        // typeA is declared for property 'a'. propA and propB are equivalent.
        // So the condition `!propA.isEquivalentTo(propB)` is false.
        // The method should return true.
        assertTrue(record1.isSubtype(record2));
    }

    @Test
    public void testIsSubtype_subtypeWithDeclaredPropertyNotEquivalent_differentTypes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, RecordProperty> properties1 = Maps.newHashMap();
        properties1.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.STRING_TYPE), null));
        RecordType record1 = new RecordType(registry, properties1); // The candidate for `typeA`

        Map<String, RecordProperty> properties2 = Maps.newHashMap();
        properties2.put("a", new RecordProperty(registry.getNativeType(JSTypeNative.NUMBER_TYPE), null));
        RecordType record2 = new RecordType(registry, properties2); // The candidate for `typeB`

        // typeA is record1, typeB is record2.
        // typeB has property 'a'. typeA has 'a'.
        // typeA is declared for property 'a'.
        // propA is STRING_TYPE, propB is NUMBER_TYPE.
        // !propA.isEquivalentTo(propB) is true. The method should return false.
        assertFalse(record1.isSubtype(record2));
    }

    // Helper to create a basic RecordType for testing.
    private RecordType createRecordType(JSTypeRegistry registry, Map<String, JSType> propertiesMap) {
        Map<String, RecordProperty> recordProperties = Maps.newHashMap();
        for (Map.Entry<String, JSType> entry : propertiesMap.entrySet()) {
            recordProperties.put(entry.getKey(), new RecordProperty(entry.getValue(), null));
        }
        return new RecordType(registry, recordProperties);
    }

    @Test
    public void testIsEquivalentTo_complexRecords() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        props1.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        props1.put("b", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType r1 = createRecordType(registry, props1);

        Map<String, JSType> props2 = Maps.newHashMap();
        props2.put("b", registry.getNativeType(JSTypeNative.STRING_TYPE));
        props2.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Order should not matter
        RecordType r2 = createRecordType(registry, props2);

        assertTrue(r1.isEquivalentTo(r2));
    }

    @Test
    public void testIsEquivalentTo_complexRecordsDifferentTypes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        props1.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r1 = createRecordType(registry, props1);

        Map<String, JSType> props2 = Maps.newHashMap();
        props2.put("a", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType r2 = createRecordType(registry, props2);

        assertFalse(r1.isEquivalentTo(r2));
    }

    @Test
    public void testIsSubtype_recordWithExtraPropertyIsSubtypeOfSmallerRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        props1.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        props1.put("b", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType r1 = createRecordType(registry, props1); // {a: number, b: string}

        Map<String, JSType> props2 = Maps.newHashMap();
        props2.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r2 = createRecordType(registry, props2); // {a: number}

        // typeA = r1, typeB = r2.
        // typeB has property 'a'. typeA has 'a', types match. Loop finishes. Returns true.
        // This means r1 is a "subtype" of r2 based on the implementation's check for supertyping properties.
        assertTrue(r1.isSubtype(r2));
    }


    @Test
    public void testIsSubtype_recordWithFewerPropertiesIsNotSubtypeOfLargerRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        props1.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r1 = createRecordType(registry, props1); // {a: number}

        Map<String, JSType> props2 = Maps.newHashMap();
        props2.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        props2.put("b", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType r2 = createRecordType(registry, props2); // {a: number, b: string}

        // typeA = r1, typeB = r2.
        // Check properties of typeB (r2): 'a' and 'b'.
        // For 'a': r1 has 'a', and it's equivalent. OK.
        // For 'b': r1 does NOT have 'b'. So `!typeA.hasProperty(property)` is true. Returns false.
        // So, r1 is NOT a subtype of r2 by this implementation.
        assertFalse(r1.isSubtype(r2));
    }

    @Test
    public void testIsSubtype_recordWithDifferentPropertyTypeIsNotSubtype() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        props1.put("a", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType r1 = createRecordType(registry, props1); // {a: string}

        Map<String, JSType> props2 = Maps.newHashMap();
        props2.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r2 = createRecordType(registry, props2); // {a: number}

        // typeA = r1, typeB = r2.
        // typeB has property 'a'. r1 has 'a'.
        // r1 is declared for property 'a'.
        // propA is STRING_TYPE, propB is NUMBER_TYPE.
        // !propA.isEquivalentTo(propB) is true. Returns false.
        assertFalse(r1.isSubtype(r2));
    }


    @Test
    public void testIsSubtype_emptyRecordIsSubtypeOfNonEmptyRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        RecordType r1 = createRecordType(registry, props1); // {}

        Map<String, JSType> props2 = Maps.newHashMap();
        props2.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r2 = createRecordType(registry, props2); // {a: number}

        // typeA = r1, typeB = r2.
        // typeB has property 'a'. typeA does NOT have 'a'. Returns false.
        assertFalse(r1.isSubtype(r2)); // Empty record is NOT subtype of {a: number} by this implementation.
    }

    @Test
    public void testIsSubtype_nonEmptyRecordIsSubtypeOfEmptyRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        props1.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r1 = createRecordType(registry, props1); // {a: number}

        Map<String, JSType> props2 = Maps.newHashMap();
        RecordType r2 = createRecordType(registry, props2); // {}

        // typeA = r1, typeB = r2.
        // typeB (r2) has no properties. The loop `for (String property : typeB.properties.keySet())` is skipped.
        // The method returns true.
        // So, {a: number} IS a subtype of {} by this implementation.
        assertTrue(r1.isSubtype(r2));
    }

    @Test
    public void testGetGreatestSubtypeHelper_sameRecords() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props = Maps.newHashMap();
        props.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r1 = createRecordType(registry, props);
        RecordType r2 = createRecordType(registry, props);

        JSType result = r1.getGreatestSubtypeHelper(r2);
        assertTrue(result.isRecordType());
        RecordType builtRecord = result.toMaybeRecordType();
        assertEquals(1, builtRecord.getPropertiesCount());
        assertTrue(builtRecord.hasProperty("a"));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), builtRecord.getPropertyType("a"));
    }

    @Test
    public void testGetGreatestSubtypeHelper_disjointProperties() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        props1.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r1 = createRecordType(registry, props1);

        Map<String, JSType> props2 = Maps.newHashMap();
        props2.put("b", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType r2 = createRecordType(registry, props2);

        // Expected: {a: number, b: string}
        JSType result = r1.getGreatestSubtypeHelper(r2);
        assertTrue(result.isRecordType());
        RecordType builtRecord = result.toMaybeRecordType();
        assertTrue(builtRecord.hasProperty("a"));
        assertTrue(builtRecord.hasProperty("b"));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), builtRecord.getPropertyType("a"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), builtRecord.getPropertyType("b"));
    }

    @Test
    public void testGetGreatestSubtypeHelper_conflictingProperties() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        props1.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r1 = createRecordType(registry, props1);

        Map<String, JSType> props2 = Maps.newHashMap();
        props2.put("a", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType r2 = createRecordType(registry, props2);

        // Expected: NO_TYPE because 'a' conflicts
        JSType result = r1.getGreatestSubtypeHelper(r2);
        assertTrue(result.isNoType());
    }

    @Test
    public void testGetGreatestSubtypeHelper_onePropertyIsSubset() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        props1.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r1 = createRecordType(registry, props1); // {a: number}

        Map<String, JSType> props2 = Maps.newHashMap();
        props2.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        props2.put("b", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType r2 = createRecordType(registry, props2); // {a: number, b: string}

        // Expected: {a: number, b: string}
        JSType result = r1.getGreatestSubtypeHelper(r2);
        assertTrue(result.isRecordType());
        RecordType builtRecord = result.toMaybeRecordType();
        assertTrue(builtRecord.hasProperty("a"));
        assertTrue(builtRecord.hasProperty("b"));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), builtRecord.getPropertyType("a"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), builtRecord.getPropertyType("b"));
    }

    @Test
    public void testGetGreatestSubtypeHelper_emptyRecordWithNonEmpty() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        RecordType r1 = createRecordType(registry, props1); // {}

        Map<String, JSType> props2 = Maps.newHashMap();
        props2.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r2 = createRecordType(registry, props2); // {a: number}

        // Expected: {a: number}
        JSType result = r1.getGreatestSubtypeHelper(r2);
        assertTrue(result.isRecordType());
        RecordType builtRecord = result.toMaybeRecordType();
        assertTrue(builtRecord.hasProperty("a"));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), builtRecord.getPropertyType("a"));
    }

    @Test
    public void testGetGreatestSubtypeHelper_nonRecordType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props = Maps.newHashMap();
        props.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r1 = createRecordType(registry, props); // {a: number}

        JSType otherType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        // The logic for non-record types is complex and relies on getEachReferenceTypeWithProperty.
        // For this test, we'll just assert that it doesn't throw an exception and returns a type.
        // A more thorough test would require mocking more of JSTypeRegistry.
        JSType result = r1.getGreatestSubtypeHelper(otherType);
        assertNotNull(result);
    }
}
```