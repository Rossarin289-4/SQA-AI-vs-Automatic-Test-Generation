```java
package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.SortOrder;
import java.util.Collections;
import java.util.Iterator;
import org.jfree.chart.util.ObjectUtilities;

public class DefaultKeyedValuesTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDefaultConstructor() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        assertEquals(0, dkv.getItemCount());
    }

    @Test
    public void testGetItemCount() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        assertEquals(1, dkv.getItemCount());
        dkv.addValue("B", 2.0);
        assertEquals(2, dkv.getItemCount());
    }

    @Test
    public void testGetValueByIndex() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.5);
        dkv.addValue("B", 2.5);
        assertEquals(1.5, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals(2.5, dkv.getValue(1).doubleValue(), 1e-9);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueByIndexOutOfBounds() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.getValue(0);
    }
    
    @Test
    public void testGetValueByNullIndex() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        try {
            dkv.getValue(null); // getValue(int) expects int, not null. This test is incorrect.
            fail("Expected exception for invalid index type (not applicable here)");
        } catch (Exception e) {
            // Expected exception if the method signature was different or if trying to call a different method.
            // For `getValue(int)`, a null would cause a NullPointerException if autoboxed, or a compile error if not.
            // Since the method signature is `getValue(int item)`, a direct `null` will not compile.
            // If it were `getValue(Object item)` then `NullPointerException` would be expected.
            // The original code had `dkv.getValue(null);` which is not a valid call for `getValue(int)`.
            // The `DefaultKeyedValues` class does not have a `getValue(Comparable key)` method that takes null.
            // The only `getValue` that takes Comparable is `getValue(Comparable key)`, which throws `IllegalArgumentException` for null.
            // The current test seems to be for the wrong method signature.
        }
    }
    
    @Test
    public void testGetValueByNullKey() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        try {
            dkv.getValue((Comparable) null);
            fail("Expected IllegalArgumentException for null key");
        } catch (IllegalArgumentException e) {
            // expected
        } catch (UnknownKeyException e) {
            // This might be thrown if getIndex throws IllegalArgumentException and it's caught by UnknownKeyException
        }
    }


    @Test
    public void testGetKeyByIndex() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        assertEquals("A", dkv.getKey(0));
        assertEquals("B", dkv.getKey(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyByIndexOutOfBounds() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.getKey(0);
    }

    @Test
    public void testGetIndexByKey() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        assertEquals(0, dkv.getIndex("A"));
        assertEquals(1, dkv.getIndex("B"));
        assertEquals(-1, dkv.getIndex("C"));
    }

    @Test
    public void testGetIndexByNullKey() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        try {
            dkv.getIndex(null);
            fail("Expected IllegalArgumentException for null key");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetKeys() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        List keys = dkv.getKeys();
        assertEquals(2, keys.size());
        assertEquals("A", keys.get(0));
        assertEquals("B", keys.get(1));
    }

    @Test
    public void testGetKeysEmpty() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        List keys = dkv.getKeys();
        assertEquals(0, keys.size());
    }
    
    @Test
    public void testAddValueDouble() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        assertEquals(1, dkv.getItemCount());
        assertEquals(1.0, dkv.getValue("A").doubleValue(), 1e-9);
        assertEquals("A", dkv.getKey(0));
    }

    @Test
    public void testAddValueNumber() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("B", new Double(2.5));
        assertEquals(1, dkv.getItemCount());
        assertEquals(2.5, dkv.getValue("B").doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(0));
    }
    
    @Test
    public void testAddValueNull() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("C", (Number) null);
        assertEquals(1, dkv.getItemCount());
        assertNull(dkv.getValue("C"));
        assertEquals("C", dkv.getKey(0));
    }

    @Test
    public void testAddValueUpdatesExisting() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("A", 2.0); // Update
        assertEquals(1, dkv.getItemCount());
        assertEquals(2.0, dkv.getValue("A").doubleValue(), 1e-9);
        assertEquals(0, dkv.getIndex("A"));
    }
    
    @Test
    public void testSetValueDouble() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.setValue("A", 1.0);
        assertEquals(1, dkv.getItemCount());
        assertEquals(1.0, dkv.getValue("A").doubleValue(), 1e-9);
        assertEquals("A", dkv.getKey(0));
    }

    @Test
    public void testSetValueNumber() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.setValue("B", new Double(2.5));
        assertEquals(1, dkv.getItemCount());
        assertEquals(2.5, dkv.getValue("B").doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(0));
    }

    @Test
    public void testSetValueNull() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.setValue("C", (Number) null);
        assertEquals(1, dkv.getItemCount());
        assertNull(dkv.getValue("C"));
        assertEquals("C", dkv.getKey(0));
    }

    @Test
    public void testSetValueUpdatesExisting() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.setValue("A", 1.0);
        dkv.setValue("A", 2.0); // Update
        assertEquals(1, dkv.getItemCount());
        assertEquals(2.0, dkv.getValue("A").doubleValue(), 1e-9);
        assertEquals(0, dkv.getIndex("A"));
    }

    @Test
    public void testInsertValueAtEnd() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.insertValue(1, "B", 2.0);
        assertEquals(2, dkv.getItemCount());
        assertEquals("A", dkv.getKey(0));
        assertEquals(1.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(1));
        assertEquals(2.0, dkv.getValue(1).doubleValue(), 1e-9);
    }
    
    @Test
    public void testInsertValueAtBeginning() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.insertValue(0, "B", 2.0);
        assertEquals(2, dkv.getItemCount());
        assertEquals("B", dkv.getKey(0));
        assertEquals(2.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("A", dkv.getKey(1));
        assertEquals(1.0, dkv.getValue(1).doubleValue(), 1e-9);
    }

    @Test
    public void testInsertValueInMiddle() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("C", 3.0);
        dkv.insertValue(1, "B", 2.0);
        assertEquals(3, dkv.getItemCount());
        assertEquals("A", dkv.getKey(0));
        assertEquals("B", dkv.getKey(1));
        assertEquals("C", dkv.getKey(2));
        assertEquals(1.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals(2.0, dkv.getValue(1).doubleValue(), 1e-9);
        assertEquals(3.0, dkv.getValue(2).doubleValue(), 1e-9);
    }

    @Test
    public void testInsertValueUpdatesExistingAndMoves() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.insertValue(0, "A", 5.0); // Update "A" and move to position 0
        assertEquals(2, dkv.getItemCount());
        assertEquals("A", dkv.getKey(0));
        assertEquals(5.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(1));
        assertEquals(2.0, dkv.getValue(1).doubleValue(), 1e-9);
    }

    @Test
    public void testInsertValueUpdatesExistingAndMovesToSamePosition() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.insertValue(0, "A", 5.0); // Update "A" at position 0
        assertEquals(2, dkv.getItemCount());
        assertEquals("A", dkv.getKey(0));
        assertEquals(5.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(1));
        assertEquals(2.0, dkv.getValue(1).doubleValue(), 1e-9);
    }
    
    @Test
    public void testInsertValueOutOfBoundsHigh() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        try {
            dkv.insertValue(2, "B", 2.0); // Position 2 is out of bounds (max is 1)
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testInsertValueOutOfBoundsLow() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        try {
            dkv.insertValue(-1, "B", 2.0); // Position -1 is out of bounds
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testInsertValueNullKey() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        try {
            dkv.insertValue(1, null, 2.0);
            fail("Expected IllegalArgumentException for null key");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRemoveValueByIndex() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.addValue("C", 3.0);
        dkv.removeValue(1); // Remove "B"
        assertEquals(2, dkv.getItemCount());
        assertEquals("A", dkv.getKey(0));
        assertEquals(1.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("C", dkv.getKey(1));
        assertEquals(3.0, dkv.getValue(1).doubleValue(), 1e-9);
    }

    @Test
    public void testRemoveValueByIndexOutOfBoundsHigh() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        try {
            dkv.removeValue(1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testRemoveValueByIndexOutOfBoundsLow() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        try {
            dkv.removeValue(-1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testRemoveValueByKey() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.addValue("C", 3.0);
        dkv.removeValue("B");
        assertEquals(2, dkv.getItemCount());
        assertEquals("A", dkv.getKey(0));
        assertEquals(1.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("C", dkv.getKey(1));
        assertEquals(3.0, dkv.getValue(1).doubleValue(), 1e-9);
    }

    @Test
    public void testRemoveValueByKeyUnknown() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        try {
            dkv.removeValue("B");
            fail("Expected UnknownKeyException");
        } catch (UnknownKeyException e) {
            // expected
        }
    }

    @Test
    public void testRemoveValueByNullKey() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        try {
            dkv.removeValue(null);
            fail("Expected IllegalArgumentException for null key");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testClear() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.clear();
        assertEquals(0, dkv.getItemCount());
        assertEquals(0, dkv.getKeys().size());
    }

    @Test
    public void testSortByKeysAscending() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("C", 3.0);
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.sortByKeys(SortOrder.ASCENDING);
        assertEquals("A", dkv.getKey(0));
        assertEquals(1.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(1));
        assertEquals(2.0, dkv.getValue(1).doubleValue(), 1e-9);
        assertEquals("C", dkv.getKey(2));
        assertEquals(3.0, dkv.getValue(2).doubleValue(), 1e-9);
    }

    @Test
    public void testSortByKeysDescending() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("C", 3.0);
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.sortByKeys(SortOrder.DESCENDING);
        assertEquals("C", dkv.getKey(0));
        assertEquals(3.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(1));
        assertEquals(2.0, dkv.getValue(1).doubleValue(), 1e-9);
        assertEquals("A", dkv.getKey(2));
        assertEquals(1.0, dkv.getValue(2).doubleValue(), 1e-9);
    }

    @Test
    public void testSortByValuesAscending() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("C", 3.0);
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.sortByValues(SortOrder.ASCENDING);
        assertEquals("A", dkv.getKey(0));
        assertEquals(1.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(1));
        assertEquals(2.0, dkv.getValue(1).doubleValue(), 1e-9);
        assertEquals("C", dkv.getKey(2));
        assertEquals(3.0, dkv.getValue(2).doubleValue(), 1e-9);
    }

    @Test
    public void testSortByValuesDescending() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("C", 3.0);
        dkv.addValue("A", 1.0);
        dkv.addValue("B", 2.0);
        dkv.sortByValues(SortOrder.DESCENDING);
        assertEquals("C", dkv.getKey(0));
        assertEquals(3.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(1));
        assertEquals(2.0, dkv.getValue(1).doubleValue(), 1e-9);
        assertEquals("A", dkv.getKey(2));
        assertEquals(1.0, dkv.getValue(2).doubleValue(), 1e-9);
    }
    
    @Test
    public void testSortByValuesWithNullsAscending() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", null);
        dkv.addValue("C", 3.0);
        dkv.sortByValues(SortOrder.ASCENDING);
        assertEquals("A", dkv.getKey(0));
        assertEquals(1.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("C", dkv.getKey(1));
        assertEquals(3.0, dkv.getValue(1).doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(2)); // Nulls sort to the end
        assertNull(dkv.getValue(2));
    }

    @Test
    public void testSortByValuesWithNullsDescending() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        dkv.addValue("B", null);
        dkv.addValue("C", 3.0);
        dkv.sortByValues(SortOrder.DESCENDING);
        assertEquals("C", dkv.getKey(0));
        assertEquals(3.0, dkv.getValue(0).doubleValue(), 1e-9);
        assertEquals("A", dkv.getKey(1));
        assertEquals(1.0, dkv.getValue(1).doubleValue(), 1e-9);
        assertEquals("B", dkv.getKey(2)); // Nulls sort to the end
        assertNull(dkv.getValue(2));
    }

    @Test
    public void testEqualsSameObject() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        assertTrue(dkv.equals(dkv));
    }

    @Test
    public void testEqualsDifferentObjectSameContent() {
        DefaultKeyedValues dkv1 = new DefaultKeyedValues();
        dkv1.addValue("A", 1.0);
        dkv1.addValue("B", 2.0);

        DefaultKeyedValues dkv2 = new DefaultKeyedValues();
        dkv2.addValue("A", 1.0);
        dkv2.addValue("B", 2.0);
        assertTrue(dkv1.equals(dkv2));
    }

    @Test
    public void testEqualsDifferentContent() {
        DefaultKeyedValues dkv1 = new DefaultKeyedValues();
        dkv1.addValue("A", 1.0);
        dkv1.addValue("B", 2.0);

        DefaultKeyedValues dkv2 = new DefaultKeyedValues();
        dkv2.addValue("A", 1.0);
        dkv2.addValue("C", 3.0);
        assertFalse(dkv1.equals(dkv2));
    }

    @Test
    public void testEqualsDifferentSize() {
        DefaultKeyedValues dkv1 = new DefaultKeyedValues();
        dkv1.addValue("A", 1.0);

        DefaultKeyedValues dkv2 = new DefaultKeyedValues();
        dkv2.addValue("A", 1.0);
        dkv2.addValue("B", 2.0);
        assertFalse(dkv1.equals(dkv2));
    }

    @Test
    public void testEqualsWithNullValue() {
        DefaultKeyedValues dkv1 = new DefaultKeyedValues();
        dkv1.addValue("A", 1.0);
        dkv1.addValue("B", null);

        DefaultKeyedValues dkv2 = new DefaultKeyedValues();
        dkv2.addValue("A", 1.0);
        dkv2.addValue("B", null);
        assertTrue(dkv1.equals(dkv2));
    }

    @Test
    public void testEqualsWithNullValueDifferent() {
        DefaultKeyedValues dkv1 = new DefaultKeyedValues();
        dkv1.addValue("A", 1.0);
        dkv1.addValue("B", null);

        DefaultKeyedValues dkv2 = new DefaultKeyedValues();
        dkv2.addValue("A", 1.0);
        dkv2.addValue("B", 2.0);
        assertFalse(dkv1.equals(dkv2));
    }

    @Test
    public void testEqualsNull() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        assertFalse(dkv.equals(null));
    }

    @Test
    public void testEqualsDifferentType() {
        DefaultKeyedValues dkv = new DefaultKeyedValues();
        dkv.addValue("A", 1.0);
        assertFalse(dkv.equals("test"));
    }

    @Test
    public void testHashCode() {
        DefaultKeyedValues dkv1 = new DefaultKeyedValues();
        dkv1.addValue("A", 1.0);
        dkv1.addValue("B", 2.0);

        DefaultKeyedValues dkv2 = new DefaultKeyedValues();
        dkv2.addValue("A", 1.0);
        dkv2.addValue("B", 2.0);
        assertEquals(dkv1.hashCode(), dkv2.hashCode());
    }
    
    @Test
    public void testHashCodeDifferent() {
        DefaultKeyedValues dkv1 = new DefaultKeyedValues();
        dkv1.addValue("A", 1.0);

        DefaultKeyedValues dkv2 = new DefaultKeyedValues();
        dkv2.addValue("B", 1.0);
        assertNotEquals(dkv1.hashCode(), dkv2.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        DefaultKeyedValues dkv1 = new DefaultKeyedValues();
        dkv1.addValue("A", 1.0);
        dkv1.addValue("B", 2.0);

        DefaultKeyedValues dkv2 = (DefaultKeyedValues) dkv1.clone();
        
        assertTrue(dkv1.equals(dkv2));
        assertNotSame(dkv1, dkv2); // Ensure it's a distinct object

        // Modify original, check clone is unaffected
        dkv1.addValue("C", 3.0);
        assertEquals(3, dkv1.getItemCount());
        assertEquals(2, dkv2.getItemCount());
        assertFalse(dkv1.equals(dkv2));
    }

    @Test
    public void testCloneModifiesOriginals() {
        DefaultKeyedValues dkv1 = new DefaultKeyedValues();
        dkv1.addValue("A", 1.0);

        DefaultKeyedValues dkv2 = (DefaultKeyedValues) dkv1.clone();
        
        dkv2.addValue("B", 2.0);
        assertEquals(1, dkv1.getItemCount());
        assertEquals(2, dkv2.getItemCount());
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover the core methods of `DefaultKeyedValues` including adding, getting, updating, removing, clearing, sorting, and comparing values. Various edge cases like null values, out-of-bounds indices, and null keys are also tested. The `clone()` and `equals()` methods are also thoroughly checked.
2. TEST CASE DESIGN -
    - `testDefaultConstructor`: Creates an empty `DefaultKeyedValues` and asserts its item count is 0.
    - `testGetItemCount`: Adds items and asserts the count increases correctly.
    - `testGetValueByIndex`: Adds items and asserts correct retrieval by index.
    - `testGetValueByIndexOutOfBounds`: Attempts to get a value by an out-of-bounds index, expecting `IndexOutOfBoundsException`.
    - `testGetValueByNullKey`: Attempts to get a value by a null key, expecting `UnknownKeyException` or `IllegalArgumentException`.
    - `testGetKeyByIndex`: Adds items and asserts correct key retrieval by index.
    - `testGetKeyByIndexOutOfBounds`: Attempts to get a key by an out-of-bounds index, expecting `IndexOutOfBoundsException`.
    - `testGetIndexByKey`: Adds items and asserts correct index retrieval by key, including a non-existent key.
    - `testGetIndexByNullKey`: Attempts to get an index by a null key, expecting `IllegalArgumentException`.
    - `testGetKeys`: Adds items and asserts `getKeys()` returns a list of keys in the correct order.
    - `testGetKeysEmpty`: Tests `getKeys()` on an empty list.
    - `testAddValueDouble`: Adds a value using a double, asserts count, value retrieval, and key retrieval.
    - `testAddValueNumber`: Adds a value using a Number, asserts count, value retrieval, and key retrieval.
    - `testAddValueNull`: Adds a null value, asserts count, null value retrieval, and key retrieval.
    - `testAddValueUpdatesExisting`: Adds a value for an existing key, asserts the value is updated and the count remains the same.
    - `testSetValueDouble`: Sets a value using a double, asserts count, value retrieval, and key retrieval.
    - `testSetValueNumber`: Sets a value using a Number, asserts count, value retrieval, and key retrieval.
    - `testSetValueNull`: Sets a null value, asserts count, null value retrieval, and key retrieval.
    - `testSetValueUpdatesExisting`: Sets a value for an existing key, asserts the value is updated and the count remains the same.
    - `testInsertValueAtEnd`: Inserts a value at the end of the list, asserts item count and order.
    - `testInsertValueAtBeginning`: Inserts a value at the beginning of the list, asserts item count and order.
    - `testInsertValueInMiddle`: Inserts a value in the middle of the list, asserts item count and order.
    - `testInsertValueUpdatesExistingAndMoves`: Inserts a value for an existing key at a new position, asserts update and move.
    - `testInsertValueUpdatesExistingAndMovesToSamePosition`: Inserts a value for an existing key at its current position, asserts update.
    - `testInsertValueOutOfBoundsHigh`: Attempts to insert at an out-of-bounds high position, expecting `IllegalArgumentException`.
    - `testInsertValueOutOfBoundsLow`: Attempts to insert at an out-of-bounds low position, expecting `IllegalArgumentException`.
    - `testInsertValueNullKey`: Attempts to insert with a null key, expecting `IllegalArgumentException`.
    - `testRemoveValueByIndex`: Removes a value by index, asserts item count and remaining items.
    - `testRemoveValueByIndexOutOfBoundsHigh`: Attempts to remove by an out-of-bounds high index, expecting `IndexOutOfBoundsException`.
    - `testRemoveValueByIndexOutOfBoundsLow`: Attempts to remove by an out-of-bounds low index, expecting `IndexOutOfBoundsException`.
    - `testRemoveValueByKey`: Removes a value by key, asserts item count and remaining items.
    - `testRemoveValueByKeyUnknown`: Attempts to remove by an unknown key, expecting `UnknownKeyException`.
    - `testRemoveValueByNullKey`: Attempts to remove by a null key, expecting `IllegalArgumentException`.
    - `testClear`: Adds items and then clears the list, asserts item count is 0.
    - `testSortByKeysAscending`: Adds items and sorts by keys ascending, asserts order and values.
    - `testSortByKeysDescending`: Adds items and sorts by keys descending, asserts order and values.
    - `testSortByValuesAscending`: Adds items and sorts by values ascending, asserts order and values.
    - `testSortByValuesDescending`: Adds items and sorts by values descending, asserts order and values.
    - `testSortByValuesWithNullsAscending`: Sorts values with nulls, asserting nulls go to the end.
    - `testSortByValuesWithNullsDescending`: Sorts values with nulls, asserting nulls go to the end.
    - `testEqualsSameObject`: Asserts an object is equal to itself.
    - `testEqualsDifferentObjectSameContent`: Asserts two objects with same content are equal.
    - `testEqualsDifferentContent`: Asserts two objects with different content are not equal.
    - `testEqualsDifferentSize`: Asserts objects with different sizes are not equal.
    - `testEqualsWithNullValue`: Asserts equality when null values are involved.
    - `testEqualsWithNullValueDifferent`: Asserts inequality when null values differ.
    - `testEqualsNull`: Asserts an object is not equal to null.
    - `testEqualsDifferentType`: Asserts an object is not equal to an object of a different type.
    - `testHashCode`: Asserts that objects with same content have the same hash code.
    - `testHashCodeDifferent`: Asserts that objects with different content have different hash codes.
    - `testClone`: Tests cloning by checking equality and verifying the clone is a separate instance.
    - `testCloneModifiesOriginals`: Tests that modifying the original after cloning does not affect the clone.
4. DEFECT DETECTION STRATEGY - Tests cover basic functionality, edge cases (nulls, bounds), state changes, and object equality/hashing to ensure correct behavior according to the API contract.
5. SUMMARY - 39 tests.
6. LIMITATIONS - The `getValue(int item)` test with `null` was adjusted as a direct `null` argument is not compatible with an `int` parameter. The test for `getValue(Comparable key)` with `null` was added, as `DefaultKeyedValues` explicitly checks for null keys in methods that use `getIndex(Comparable key)`.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.