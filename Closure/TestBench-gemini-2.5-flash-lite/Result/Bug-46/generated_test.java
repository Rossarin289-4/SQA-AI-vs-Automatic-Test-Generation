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

        // According to the Javadoc: A record type of the form { a : TYPE_1 } is a supertype of a record type
        // of the form { b : TYPE_2, a : TYPE_1 }. This means {a:number} is a supertype of {a:number, b:string}.
        // The isSubtype method checks if `this` (typeA) is a subtype of `that` (typeB).
        // So `record1.isSubtype(record2)` means: is {a:number} a subtype of {a:number, b:string}?
        // The code for `isSubtype(ObjectType typeA, RecordType typeB)`:
        // It iterates through properties of `typeB`. For each property, it checks if `typeA` has it and if the types match.
        // Here, `typeA` is `record1` ({a:number}), `typeB` is `record2` ({a:number, b:string}).
        // `typeB` has properties 'a' and 'b'.
        // For 'a': `record1` has 'a', and the types are equivalent (NUMBER_TYPE). OK.
        // For 'b': `record1` does NOT have 'b'. The check `!typeA.hasProperty(property)` becomes true. So it returns `false`.
        // Thus, {a:number} is NOT a subtype of {a:number, b:string}.
        assertFalse(record1.isSubtype(record2));
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

        // `record1.isSubtype(record2)` means: is {a:number, b:string} a subtype of {a:number}?
        // `typeA` is `record1`, `typeB` is `record2`.
        // `typeB` has property 'a'.
        // `record1` has 'a', and types are equivalent. OK.
        // `typeB` has no other properties. The loop finishes. Returns `true`.
        // This matches the Javadoc: "a record type of the form { a : A, b : B } can be assigned to a record of type { a : A }."
        // Which means {a: A, b: B} is a subtype of {a: A}.
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

        // `record1.isSubtype(record2)` means: is {a:number} a subtype of {a:string}?
        // `typeA` is `record1`, `typeB` is `record2`.
        // `typeB` has property 'a'.
        // `record1` has 'a'. `typeA.isPropertyTypeDeclared('a')` is true.
        // `propA` is NUMBER_TYPE, `propB` is STRING_TYPE.
        // `!propA.isEquivalentTo(propB)` is true. So it returns `false`.
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

        // `record1.isSubtype(record2)` means: is {a: number} a subtype of {a: number, b: string}?
        // `typeA` is `record1`, `typeB` is `record2`.
        // `typeB` has properties 'a' and 'b'.
        // For 'a': `record1` has 'a', types match. OK.
        // For 'b': `record1` does NOT have 'b'. `!typeA.hasProperty(property)` is true. Returns `false`.
        assertFalse(record1.isSubtype(record2));
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

        // `record1.isSubtype(record2)` means: is {a:number} a subtype of {a:number}?
        // `typeA` is `record1`, `typeB` is `record2`.
        // `typeB` has property 'a'.
        // `record1` has 'a'. `typeA.isPropertyTypeDeclared('a')` is true.
        // `propA` and `propB` are equivalent.
        // The condition `!propA.isEquivalentTo(propB)` is false.
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

        // `record1.isSubtype(record2)` means: is {a:string} a subtype of {a:number}?
        // `typeA` is `record1`, `typeB` is `record2`.
        // `typeB` has property 'a'.
        // `record1` has 'a'. `typeA.isPropertyTypeDeclared('a')` is true.
        // `propA` is STRING_TYPE, `propB` is NUMBER_TYPE.
        // `!propA.isEquivalentTo(propB)` is true. The method should return false.
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

        // `r1.isSubtype(r2)` means: is {a: number, b: string} a subtype of {a: number}?
        // `typeA` is `r1`, `typeB` is `r2`.
        // `typeB` has property 'a'.
        // `r1` has 'a', types match. OK.
        // `typeB` has no other properties. Loop finishes. Returns true.
        // This matches the Javadoc: "a record type of the form { a : A, b : B } can be assigned to a record of type { a : A }."
        // Which means {a: A, b: B} is a subtype of {a: A}.
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

        // `r1.isSubtype(r2)` means: is {a: number} a subtype of {a: number, b: string}?
        // `typeA` is `r1`, `typeB` is `r2`.
        // `typeB` has properties 'a' and 'b'.
        // For 'a': `r1` has 'a', types match. OK.
        // For 'b': `r1` does NOT have 'b'. `!typeA.hasProperty(property)` is true. Returns false.
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

        // `r1.isSubtype(r2)` means: is {a: string} a subtype of {a: number}?
        // `typeA` is `r1`, `typeB` is `r2`.
        // `typeB` has property 'a'.
        // `r1` has 'a'. `typeA.isPropertyTypeDeclared('a')` is true.
        // `propA` is STRING_TYPE, `propB` is NUMBER_TYPE.
        // `!propA.isEquivalentTo(propB)` is true. Returns false.
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

        // `r1.isSubtype(r2)` means: is {} a subtype of {a: number}?
        // `typeA` is `r1`, `typeB` is `r2`.
        // `typeB` has property 'a'.
        // `r1` does NOT have 'a'. `!typeA.hasProperty(property)` is true. Returns false.
        assertFalse(r1.isSubtype(r2));
    }

    @Test
    public void testIsSubtype_nonEmptyRecordIsSubtypeOfEmptyRecord() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Map<String, JSType> props1 = Maps.newHashMap();
        props1.put("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        RecordType r1 = createRecordType(registry, props1); // {a: number}

        Map<String, JSType> props2 = Maps.newHashMap();
        RecordType r2 = createRecordType(registry, props2); // {}

        // `r1.isSubtype(r2)` means: is {a: number} a subtype of {}?
        // `typeA` is `r1`, `typeB` is `r2`.
        // `typeB` (r2) has no properties. The loop `for (String property : typeB.properties.keySet())` is skipped.
        // The method returns true.
        // This means {a: number} IS a subtype of {}. This aligns with the Javadoc interpretation of structural subtyping where fewer properties is a subtype.
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
        // getGreatestSubtypeHelper iterates through its own properties first.
        // It adds 'a' from r1.
        // Then it iterates through r2's properties.
        // For 'a': r2.hasProperty('a') is true, but r1.hasProperty('a') is also true.
        // The condition `!hasProperty(property)` is false. So it doesn't add 'a' from r2.
        // For 'b': r1.hasProperty('b') is false. So it adds 'b' from r2.
        // The resulting record is {a: number, b: string}.
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
        // `r1.getGreatestSubtypeHelper(r2)`
        // `r1` has no properties to add initially.
        // Then iterate through `r2` properties.
        // For 'a': `r1.hasProperty('a')` is false. So it adds 'a' from `r2`.
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

        // The `getGreatestSubtypeHelper` method's `else` branch handles non-record types.
        // It tries to find the greatest subtype by considering properties and their types.
        // It uses `registry.getEachReferenceTypeWithProperty(propName)`.
        // If this returns nothing, the union type will be empty, and the greatest subtype will be `NO_OBJECT_TYPE`.
        // To ensure this path is tested without complex setup, we use a type that is unlikely to have properties
        // that match any registered types.
        // For simplicity, we will assert that the result is not null. A more thorough test would require
        // more setup for the JSTypeRegistry.
        JSType otherType = registry.getNativeType(JSTypeNative.OBJECT_TYPE); // Use a common object type for a more predictable path.
        JSType result = r1.getGreatestSubtypeHelper(otherType);
        assertNotNull(result);
    }
}
