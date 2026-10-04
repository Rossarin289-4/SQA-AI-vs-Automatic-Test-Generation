package org.apache.commons.collections.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.Equator; // This import was missing

public class EqualPredicateTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEqualsBasicTrue() throws Exception {
        String value = "test";
        Predicate<String> predicate = EqualPredicate.equalPredicate(value);
        assertTrue(predicate.evaluate(value));
    }

    @Test
    public void testEqualsBasicFalse() throws Exception {
        String value = "test";
        Predicate<String> predicate = EqualPredicate.equalPredicate(value);
        assertFalse(predicate.evaluate("another"));
    }

    @Test
    public void testEqualsNullInput() throws Exception {
        String value = "test";
        Predicate<String> predicate = EqualPredicate.equalPredicate(value);
        assertFalse(predicate.evaluate(null));
    }
    
    @Test
    public void testEqualsNullStoredValueTrue() throws Exception {
        // The factory method EqualPredicate.equalPredicate(null) returns NullPredicate.
        // NullPredicate.evaluate(null) returns true.
        Predicate<String> predicate = EqualPredicate.equalPredicate(null);
        assertTrue(predicate.evaluate(null));
    }
    
    @Test
    public void testEqualsNullStoredValueFalse() throws Exception {
        // The factory method EqualPredicate.equalPredicate(null) returns NullPredicate.
        // NullPredicate.evaluate("test") returns false.
        Predicate<String> predicate = EqualPredicate.equalPredicate(null);
        assertFalse(predicate.evaluate("test"));
    }

    @Test
    public void testEqualsDifferentObjectTrue() throws Exception {
        String value = new String("test"); // Creates a different object instance
        Predicate<String> predicate = EqualPredicate.equalPredicate(value);
        // The default equator uses .equals(), which will return true for two strings with the same content.
        assertTrue(predicate.evaluate("test"));
    }
    
    @Test
    public void testEqualsInteger() throws Exception {
        Integer value = Integer.valueOf(100);
        Predicate<Integer> predicate = EqualPredicate.equalPredicate(value);
        assertTrue(predicate.evaluate(Integer.valueOf(100)));
    }
    
    @Test
    public void testEqualsIntegerFalse() throws Exception {
        Integer value = Integer.valueOf(100);
        Predicate<Integer> predicate = EqualPredicate.equalPredicate(value);
        assertFalse(predicate.evaluate(Integer.valueOf(200)));
    }

    @Test
    public void testEqualsLong() throws Exception {
        Long value = Long.valueOf(100L);
        Predicate<Long> predicate = EqualPredicate.equalPredicate(value);
        assertTrue(predicate.evaluate(Long.valueOf(100L)));
    }
    
    @Test
    public void testEqualsLongFalse() throws Exception {
        Long value = Long.valueOf(100L);
        Predicate<Long> predicate = EqualPredicate.equalPredicate(value);
        assertFalse(predicate.evaluate(Long.valueOf(200L)));
    }

    @Test
    public void testEqualsDouble() throws Exception {
        Double value = Double.valueOf(100.5);
        Predicate<Double> predicate = EqualPredicate.equalPredicate(value);
        assertTrue(predicate.evaluate(Double.valueOf(100.5)));
    }
    
    @Test
    public void testEqualsDoubleFalse() throws Exception {
        Double value = Double.valueOf(100.5);
        Predicate<Double> predicate = EqualPredicate.equalPredicate(value);
        assertFalse(predicate.evaluate(Double.valueOf(200.5)));
    }

    @Test
    public void testEqualsFloat() throws Exception {
        Float value = Float.valueOf(100.5f);
        Predicate<Float> predicate = EqualPredicate.equalPredicate(value);
        assertTrue(predicate.evaluate(Float.valueOf(100.5f)));
    }
    
    @Test
    public void testEqualsFloatFalse() throws Exception {
        Float value = Float.valueOf(100.5f);
        Predicate<Float> predicate = EqualPredicate.equalPredicate(value);
        assertFalse(predicate.evaluate(Float.valueOf(200.5f)));
    }

    @Test
    public void testGetValue() throws Exception {
        String value = "test";
        Predicate<String> predicate = EqualPredicate.equalPredicate(value);
        // The EqualPredicate constructor stores the value internally.
        // getValue() should return this stored value.
        assertEquals(value, ((EqualPredicate<String>) predicate).getValue());
    }
    
    @Test
    public void testGetValueNull() throws Exception {
        // When equalPredicate(null) is called, it returns NullPredicate, not EqualPredicate.
        // NullPredicate does not have a getValue() method.
        // The instruction is to test the class under test, which is EqualPredicate.
        // So, we must create an EqualPredicate explicitly if we want to test getValue().
        EqualPredicate<String> predicate = new EqualPredicate<>(null);
        assertNull(predicate.getValue());
    }

    // --- Tests using a custom Equator ---

    @Test
    public void testEqualsWithCustomEquatorTrue() throws Exception {
        String value = "test";
        // Custom Equator that behaves like String.equals()
        Equator<String> customEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                // This is a simplified custom equator for testing purposes.
                // A real custom equator might have different logic.
                return o1 != null && o1.equals(o2);
            }
            @Override
            public int hash(String o) { return o != null ? o.hashCode() : 0; }
        };
        Predicate<String> predicate = EqualPredicate.equalPredicate(value, customEquator);
        assertTrue(predicate.evaluate("test"));
    }

    @Test
    public void testEqualsWithCustomEquatorFalse() throws Exception {
        String value = "test";
        // Custom Equator that always returns false
        Equator<String> customEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                return false; // always false
            }
            @Override
            public int hash(String o) { return 0; }
        };
        Predicate<String> predicate = EqualPredicate.equalPredicate(value, customEquator);
        assertFalse(predicate.evaluate("test"));
    }
    
    @Test
    public void testEqualsWithCustomEquatorNullInput() throws Exception {
        String value = "test";
        Equator<String> customEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                return o1 != null && o1.equals(o2);
            }
            @Override
            public int hash(String o) { return o != null ? o.hashCode() : 0; }
        };
        Predicate<String> predicate = EqualPredicate.equalPredicate(value, customEquator);
        // The custom equator's equate method checks for null input.
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testEqualsWithCustomEquatorNullStoredValueTrue() throws Exception {
        // Custom Equator that considers two nulls as equal
        Equator<String> customEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                return o1 == null && o2 == null;
            }
            @Override
            public int hash(String o) { return 0; }
        };
        Predicate<String> predicate = EqualPredicate.equalPredicate(null, customEquator);
        assertTrue(predicate.evaluate(null));
    }

    @Test
    public void testEqualsWithCustomEquatorNullStoredValueFalse() throws Exception {
        Equator<String> customEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                return o1 == null && o2 == null;
            }
            @Override
            public int hash(String o) { return 0; }
        };
        Predicate<String> predicate = EqualPredicate.equalPredicate(null, customEquator);
        // Stored value is null, input is "test". Custom equator returns false.
        assertFalse(predicate.evaluate("test"));
    }

    @Test
    public void testEqualsWithCustomEquatorOnNullStoredValueAndNullInput() throws Exception {
        Equator<String> customEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                return o1 == null && o2 == null;
            }
            @Override
            public int hash(String o) { return 0; }
        };
        Predicate<String> predicate = EqualPredicate.equalPredicate(null, customEquator);
        // Custom equator returns true for null, null.
        assertTrue(predicate.evaluate(null));
    }

    // Additional tests for edge cases and specific behaviors.
    // Test with a custom equator that implements reference equality, similar to default behavior for non-nulls.
    @Test
    public void testEqualsWithReferenceEquatorTrue() throws Exception {
        Object value = new Object();
        Equator<Object> refEquator = new Equator<Object>() {
            @Override
            public boolean equate(Object o1, Object o2) {
                return o1 == o2; // Reference equality
            }
            @Override
            public int hash(Object o) { return System.identityHashCode(o); }
        };
        Predicate<Object> predicate = EqualPredicate.equalPredicate(value, refEquator);
        assertTrue(predicate.evaluate(value)); // Evaluate with the same instance
    }

    @Test
    public void testEqualsWithReferenceEquatorFalse() throws Exception {
        Object value = new Object();
        Equator<Object> refEquator = new Equator<Object>() {
            @Override
            public boolean equate(Object o1, Object o2) {
                return o1 == o2; // Reference equality
            }
            @Override
            public int hash(Object o) { return System.identityHashCode(o); }
        };
        Predicate<Object> predicate = EqualPredicate.equalPredicate(value, refEquator);
        assertFalse(predicate.evaluate(new Object())); // Evaluate with a different instance
    }

    @Test
    public void testEqualsWithReferenceEquatorOnNull() throws Exception {
        Object value = null;
        Equator<Object> refEquator = new Equator<Object>() {
            @Override
            public boolean equate(Object o1, Object o2) {
                return o1 == o2; // Reference equality
            }
            @Override
            public int hash(Object o) { return System.identityHashCode(o); }
        };
        Predicate<Object> predicate = EqualPredicate.equalPredicate(value, refEquator);
        assertTrue(predicate.evaluate(null)); // Evaluate null with null
    }

    // Test with a custom equator that always returns true (for any input).
    @Test
    public void testEqualsWithAlwaysTrueEquator() throws Exception {
        Predicate<String> predicate = EqualPredicate.equalPredicate("any", new Equator<String>() {
            @Override public boolean equate(String o1, String o2) { return true; }
            @Override public int hash(String o) { return 0; }
        });
        assertTrue(predicate.evaluate("anything"));
        assertTrue(predicate.evaluate(null));
    }

    // Test with a custom equator that checks for specific string content, ignoring case.
    @Test
    public void testEqualsWithCaseInsensitiveEquator() throws Exception {
        String value = "Test";
        Equator<String> ciEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                if (o1 == null || o2 == null) return o1 == o2;
                return o1.equalsIgnoreCase(o2);
            }
            @Override
            public int hash(String o) { return o != null ? o.toLowerCase().hashCode() : 0; }
        };
        Predicate<String> predicate = EqualPredicate.equalPredicate(value, ciEquator);
        assertTrue(predicate.evaluate("test")); // Different case, should be true
        assertTrue(predicate.evaluate("TEST")); // Different case, should be true
        assertFalse(predicate.evaluate("tesTing")); // Different content
    }

    // Test the case where the stored value is a mutable object and its state changes.
    // The predicate should still compare based on the original state of the object.
    @Test
    public void testEqualsWithMutableObjectStateChange() throws Exception {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        
        // Using the default equals which compares content for StringBuilder.
        // If the object were to be modified after being passed to equalPredicate,
        // the behavior of the predicate would depend on whether the 'equals' method
        // of the object itself is called or if the equator's logic is dependent on the object's state at the time of evaluation.
        // For default equals, it uses the object's current state.
        Predicate<StringBuilder> predicate = EqualPredicate.equalPredicate(sb1);
        
        // Initially, they are equal by content.
        assertTrue(predicate.evaluate(sb1));
        assertTrue(predicate.evaluate(sb2)); // sb2 has same content as initial sb1

        // Modify sb1. The predicate should now evaluate against the new state of sb1.
        sb1.append(" world");
        assertFalse(predicate.evaluate(sb1)); // sb1's content changed
        assertFalse(predicate.evaluate(sb2)); // sb2's content is still "hello"
    }
}
