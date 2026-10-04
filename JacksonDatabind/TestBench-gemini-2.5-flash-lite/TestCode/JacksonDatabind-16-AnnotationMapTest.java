package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.util.*;
import com.fasterxml.jackson.databind.util.Annotations;

public class AnnotationMapTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEmptyMapSize() throws Exception {
        AnnotationMap map = new AnnotationMap();
        assertEquals(0, map.size());
    }

    @Test
    public void testEmptyMapGetReturnsNull() throws Exception {
        AnnotationMap map = new AnnotationMap();
        assertNull(map.get(TestAnnotation.class));
    }

    @Test
    public void testAddSingleAnnotation() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnnotation ann = new TestAnnotationImpl("value1");
        assertTrue(map.add(ann));
        assertEquals(1, map.size());
        assertSame(ann, map.get(TestAnnotation.class));
    }

    @Test
    public void testAddDuplicateAnnotationReturnsFalse() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnnotation ann1 = new TestAnnotationImpl("value1");
        map.add(ann1);
        TestAnnotation ann2 = new TestAnnotationImpl("value1"); // Same annotation type and value
        // The add method returns true if the annotation was added or if the existing one is different.
        // If the existing annotation is identical (equals), it returns false and does not change the map.
        // The previous test asserted assertFalse(map.add(ann2)) which is correct behavior.
        // The failure was due to `assertSame(ann1, map.get(TestAnnotation.class));` expecting ann1 to remain.
        // The implementation of HashMap.put returns the previous value. If the new value is equal to the old,
        // it doesn't change the map and returns the old value. The equals check in AnnotationMap is based on the annotation content.
        // Here, ann1 and ann2 are different instances but have the same annotationType and value.
        // The _add method: `_annotations.put(ann.annotationType(), ann);` will replace the annotation if it's different.
        // If it's the same, it might still replace it depending on HashMap's behavior with equal objects.
        // However, the return value of _add is `(previous == null) || !previous.equals(ann);`.
        // If ann2 is `equals` to ann1, then `!previous.equals(ann)` is false. So _add should return false.
        // The original test `assertFalse(map.add(ann2));` was correct.
        // The assertion `assertSame(ann1, map.get(TestAnnotation.class));` was also correct because if add() returns false, the map should not have changed.
        // The failure was due to `java.lang.AssertionError: expected same:<TestAnnotation(value=value1)> was not:<TestAnnotation(value=value1)>`.
        // This suggests that the `get` method returned the same object reference, which is correct.
        // The `equals` method of `TestAnnotationImpl` compares `_value`. If `_value` is the same, `equals` returns true.
        // The `_add` method: `_annotations.put(ann.annotationType(), ann);`
        // If `ann2` is equal to `ann1` according to `equals`, then `_annotations.put` might replace it and return `ann1`.
        // `previous = _annotations.put(ann.annotationType(), ann);` -> `previous` would be `ann1`.
        // `return (previous == null) || !previous.equals(ann);` -> `ann1 != null` and `!ann1.equals(ann2)` is false if ann1.equals(ann2) is true. So it returns `false`.
        // The map *should* retain `ann1`.
        // The issue might be how `HashMap.put` handles equal keys but different object instances.
        // The key here is `ann.annotationType()`. If they are the same type, it replaces.
        // If `ann1.equals(ann2)` is true, and `ann1.annotationType().equals(ann2.annotationType())` is true,
        // the `_annotations.put(ann.annotationType(), ann)` call will replace the existing entry.
        // The return value of `_add` is `(previous == null) || !previous.equals(ann);`.
        // If `ann1` was in the map, `previous` is `ann1`. If `ann1.equals(ann2)` is true, `!previous.equals(ann)` is false. So `_add` returns `false`.
        // However, `_annotations.put` *replaces* the value associated with the key. So `_annotations.get(ann.annotationType())` would return `ann2`.
        // The test should assert that `map.add(ann2)` returns `false`, but then `map.get(TestAnnotation.class)` should return `ann2`, not `ann1`.
        // The original test was asserting `assertSame(ann1, map.get(TestAnnotation.class));` which is wrong if `add` returns false because the new annotation (even if equal) is put in.
        // Let's re-evaluate the `_add` logic:
        // `Annotation previous = _annotations.put(ann.annotationType(), ann);`
        // `return (previous == null) || !previous.equals(ann);`
        // When `map.add(ann1)` is called: `_annotations.put(TestAnnotation.class, ann1)` is called. `previous` is null. `_annotations.put` returns null. `_add` returns `(null == null) || !null.equals(ann1)` which is `true`.
        // Map contains `TestAnnotation.class -> ann1`.
        // When `map.add(ann2)` is called: `_annotations.put(TestAnnotation.class, ann2)` is called. `previous` is `ann1`. `_annotations.put` returns `ann1`.
        // `ann1.equals(ann2)` is true. So `!previous.equals(ann)` is `false`. `_add` returns `(ann1 == null) || false` which is `false`.
        // The map now contains `TestAnnotation.class -> ann2`.
        // So, `map.get(TestAnnotation.class)` should return `ann2`.
        // The test needs to be corrected to reflect this.
        assertFalse(map.add(ann2)); // This is correct.
        assertEquals(1, map.size());
        assertSame(ann2, map.get(TestAnnotation.class)); // Should be the new instance `ann2` because `HashMap.put` replaces the value.
    }

    @Test
    public void testAddAnnotationWithDifferentValueReturnsTrue() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnnotation ann1 = new TestAnnotationImpl("value1");
        map.add(ann1);
        TestAnnotation ann2 = new TestAnnotationImpl("value2"); // Different value
        assertTrue(map.add(ann2)); // Should return true because ann2 is not equal to ann1
        assertEquals(1, map.size());
        assertSame(ann2, map.get(TestAnnotation.class)); // Should be the new instance
    }

    @Test
    public void testAddIfNotPresentWhenAbsent() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnnotation ann = new TestAnnotationImpl("value1");
        assertTrue(map.addIfNotPresent(ann));
        assertEquals(1, map.size());
        assertSame(ann, map.get(TestAnnotation.class));
    }

    @Test
    public void testAddIfNotPresentWhenPresent() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnnotation ann1 = new TestAnnotationImpl("value1");
        map.add(ann1);
        TestAnnotation ann2 = new TestAnnotationImpl("value1");
        // addIfNotPresent should return false if the annotation is already present.
        // The current implementation: `if (_annotations == null || !_annotations.containsKey(ann.annotationType()))`
        // This only checks if the annotation type is present, not if the annotation itself is equal.
        // If the type is present, it returns false and does not add.
        // So, the map should still contain `ann1`.
        assertFalse(map.addIfNotPresent(ann2));
        assertEquals(1, map.size());
        assertSame(ann1, map.get(TestAnnotation.class)); // Should still be the original instance `ann1`.
    }

    @Test
    public void testSizeAfterAddingMultipleAnnotations() throws Exception {
        AnnotationMap map = new AnnotationMap();
        map.add(new TestAnnotationImpl("value1"));
        map.add(new AnotherAnnotationImpl("anotherValue"));
        assertEquals(2, map.size());
    }

    @Test
    public void testGetDifferentAnnotations() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnnotation ann1 = new TestAnnotationImpl("value1");
        AnotherAnnotation ann2 = new AnotherAnnotationImpl("anotherValue");
        map.add(ann1);
        map.add(ann2);
        assertSame(ann1, map.get(TestAnnotation.class));
        assertSame(ann2, map.get(AnotherAnnotation.class));
    }

    @Test
    public void testGetNonExistentAnnotation() throws Exception {
        AnnotationMap map = new AnnotationMap();
        map.add(new TestAnnotationImpl("value1"));
        assertNull(map.get(AnotherAnnotation.class));
    }

    @Test
    public void testAnnotationsIterableEmpty() throws Exception {
        AnnotationMap map = new AnnotationMap();
        Iterable<Annotation> annotations = map.annotations();
        assertNotNull(annotations);
        assertFalse(annotations.iterator().hasNext());
    }

    @Test
    public void testAnnotationsIterableNotEmpty() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnnotation ann1 = new TestAnnotationImpl("value1");
        AnotherAnnotation ann2 = new AnotherAnnotationImpl("anotherValue");
        map.add(ann1);
        map.add(ann2);
        Iterable<Annotation> annotations = map.annotations();
        assertNotNull(annotations);
        List<Annotation> annotationList = new ArrayList<>();
        for (Annotation ann : annotations) {
            annotationList.add(ann);
        }
        assertEquals(2, annotationList.size());
        assertTrue(annotationList.contains(ann1));
        assertTrue(annotationList.contains(ann2));
    }

    @Test
    public void testMergeWithPrimaryNull() throws Exception {
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(new TestAnnotationImpl("value1"));
        AnnotationMap merged = AnnotationMap.merge(null, secondary);
        assertNotNull(merged);
        assertSame(secondary, merged);
    }

    @Test
    public void testMergeWithSecondaryNull() throws Exception {
        AnnotationMap primary = new AnnotationMap();
        primary.add(new TestAnnotationImpl("value1"));
        AnnotationMap merged = AnnotationMap.merge(primary, null);
        assertNotNull(merged);
        assertSame(primary, merged);
    }

    @Test
    public void testMergeWithBothNull() throws Exception {
        AnnotationMap merged = AnnotationMap.merge(null, null);
        assertNull(merged); // Based on reference implementation, this would return null
    }

    @Test
    public void testMergeWithPrimaryEmpty() throws Exception {
        AnnotationMap primary = new AnnotationMap();
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(new TestAnnotationImpl("value1"));
        AnnotationMap merged = AnnotationMap.merge(primary, secondary);
        assertNotNull(merged);
        assertEquals(1, merged.size());
        // The logic is: if primary is empty, return secondary.
        // So, merged should be the *same instance* as secondary.
        assertSame(secondary, merged);
    }

    @Test
    public void testMergeWithSecondaryEmpty() throws Exception {
        AnnotationMap primary = new AnnotationMap();
        primary.add(new TestAnnotationImpl("value1"));
        AnnotationMap secondary = new AnnotationMap();
        AnnotationMap merged = AnnotationMap.merge(primary, secondary);
        assertNotNull(merged);
        assertEquals(1, merged.size());
        // The logic is: if secondary is empty, return primary.
        // So, merged should be the *same instance* as primary.
        assertSame(primary, merged);
    }

    @Test
    public void testMergeWithPrimaryOverridingSecondary() throws Exception {
        AnnotationMap primary = new AnnotationMap();
        primary.add(new TestAnnotationImpl("primaryValue"));
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(new TestAnnotationImpl("secondaryValue"));
        AnnotationMap merged = AnnotationMap.merge(primary, secondary);
        assertNotNull(merged);
        assertEquals(1, merged.size());
        assertEquals("primaryValue", ((TestAnnotation) merged.get(TestAnnotation.class)).value());
    }

    @Test
    public void testMergeWithDifferentAnnotations() throws Exception {
        AnnotationMap primary = new AnnotationMap();
        primary.add(new TestAnnotationImpl("primaryValue"));
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(new AnotherAnnotationImpl("anotherValue"));
        AnnotationMap merged = AnnotationMap.merge(primary, secondary);
        assertNotNull(merged);
        assertEquals(2, merged.size());
        assertEquals("primaryValue", ((TestAnnotation) merged.get(TestAnnotation.class)).value());
        assertEquals("anotherValue", ((AnotherAnnotation) merged.get(AnotherAnnotation.class)).value());
    }

    @Test
    public void testToStringOnEmptyMap() throws Exception {
        AnnotationMap map = new AnnotationMap();
        assertEquals("[null]", map.toString());
    }

    @Test
    public void testToStringOnMapWithAnnotations() throws Exception {
        AnnotationMap map = new AnnotationMap();
        map.add(new TestAnnotationImpl("value1"));
        map.add(new AnotherAnnotationImpl("anotherValue"));
        String actual = map.toString();
        // Order in HashMap toString is not guaranteed, so check for presence of both parts
        assertTrue(actual.contains(TestAnnotation.class.getName()));
        assertTrue(actual.contains("value=value1"));
        assertTrue(actual.contains(AnotherAnnotation.class.getName()));
        assertTrue(actual.contains("value=anotherValue"));
        assertTrue(actual.contains("{") && actual.contains("}"));
    }

    // Helper annotation interfaces and implementations for testing
    private @interface TestAnnotation {
        String value();
    }

    private @interface AnotherAnnotation {
        String value();
    }

    // Helper implementation of Annotation for testing purposes
    private static class TestAnnotationImpl implements TestAnnotation {
        private final String _value;

        public TestAnnotationImpl(String value) {
            _value = value;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return TestAnnotation.class;
        }

        @Override
        public String value() {
            return _value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestAnnotationImpl that = (TestAnnotationImpl) o;
            return Objects.equals(_value, that._value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(_value);
        }

        @Override
        public String toString() {
            return "TestAnnotation(value=" + _value + ")";
        }
    }

    private static class AnotherAnnotationImpl implements AnotherAnnotation {
        private final String _value;

        public AnotherAnnotationImpl(String value) {
            _value = value;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return AnotherAnnotation.class;
        }

        @Override
        public String value() {
            return _value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            AnotherAnnotationImpl that = (AnotherAnnotationImpl) o;
            return Objects.equals(_value, that._value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(_value);
        }

        @Override
        public String toString() {
            return "AnotherAnnotation(value=" + _value + ")";
        }
    }
}
