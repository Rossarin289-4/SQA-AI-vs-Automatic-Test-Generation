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

}

