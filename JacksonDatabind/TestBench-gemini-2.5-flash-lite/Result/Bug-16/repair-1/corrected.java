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
        assertFalse(map.add(ann2));
        assertEquals(1, map.size());
        assertSame(ann1, map.get(TestAnnotation.class)); // Should still be the first instance
    }

    @Test
    public void testAddAnnotationWithDifferentValueReturnsTrue() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnnotation ann1 = new TestAnnotationImpl("value1");
        map.add(ann1);
        TestAnnotation ann2 = new TestAnnotationImpl("value2"); // Different value
        assertTrue(map.add(ann2));
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
        assertFalse(map.addIfNotPresent(ann2));
        assertEquals(1, map.size());
        assertSame(ann1, map.get(TestAnnotation.class));
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
        assertSame(secondary, merged); // Reference implementation returns secondary if primary is empty
    }

    @Test
    public void testMergeWithSecondaryEmpty() throws Exception {
        AnnotationMap primary = new AnnotationMap();
        primary.add(new TestAnnotationImpl("value1"));
        AnnotationMap secondary = new AnnotationMap();
        AnnotationMap merged = AnnotationMap.merge(primary, secondary);
        assertNotNull(merged);
        assertEquals(1, merged.size());
        assertSame(primary, merged); // Reference implementation returns primary if secondary is empty
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
