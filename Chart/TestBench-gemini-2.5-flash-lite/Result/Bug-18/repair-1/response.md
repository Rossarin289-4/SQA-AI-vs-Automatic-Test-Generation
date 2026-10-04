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
            dkv.getValue(null);
            fail("Expected IllegalArgumentException for null key");
        } catch (IllegalArgumentException e) {
            // expected
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
    
    // Tests for methods that belong to DefaultKeyedValues2D but are accessible via DefaultKeyedValues
    // (This class seems to implement both DefaultKeyedValues and DefaultKeyedValues2D interfaces implicitly or by inheritance)
    // The provided source code indicates DefaultKeyedValues implements KeyedValues, and DefaultKeyedValues2D implements KeyedValues2D.
    // The tests below are for methods that are declared in DefaultKeyedValues2D, not DefaultKeyedValues.
    // Since the target class is DefaultKeyedValues and not DefaultKeyedValues2D, these tests are likely incorrect in this context.
    // However, if the intent was to test a class that somehow bridges these, we keep them but note the potential issue.
    // Based on the provided source, DefaultKeyedValues does NOT directly offer getRowCount(), getColumnCount(), etc.
    // It seems the previous answer might have been for DefaultKeyedValues2D.
    // I will remove the tests that try to call methods from DefaultKeyedValues2D on DefaultKeyedValues.

    // The following tests were for DefaultKeyedValues2D and are removed because the class under test is DefaultKeyedValues.
    /*
    @Test
    public void testGetRowCount() { ... }
    @Test
    public void testGetColumnCount() { ... }
    @Test
    public void testGetValueByIndex2D() { ... }
    @Test
    public void testGetValueByIndex2DWhenMissing() { ... }
    @Test
    public void testGetRowKey() { ... }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetRowKeyOutOfBounds() { ... }
    @Test
    public void testGetRowIndex() { ... }
    @Test
    public void testGetRowIndexWithNullKey() { ... }
    @Test
    public void testGetColumnKey() { ... }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetColumnKeyOutOfBounds() { ... }
    @Test
    public void testGetColumnIndex() { ... }
    @Test
    public void testGetColumnIndexWithNullKey() { ... }
    @Test
    public void testGetValueByKey2D() { ... }
    @Test
    public void testGetValueByKey2DWhenMissingRowKey() { ... }
    @Test
    public void testGetValueByKey2DWhenMissingColumnKey() { ... }
    @Test
    public void testGetValueByKey2DWithNullRowKey() { ... }
    @Test
    public void testGetValueByKey2DWithNullColumnKey() { ... }
    @Test
    public void testAddValue2D() { ... }
    @Test
    public void testSetValue2D() { ... }
    @Test
    public void testSetValueUpdatesExisting() { ... }
    @Test
    public void testSetValueAddsNewRow() { ... }
    @Test
    public void testSetValueAddsNewColumn() { ... }
    @Test
    public void testRemoveValueByKey2D() { ... }
    @Test
    public void testRemoveValueByKey2DRemovesRowIfEmpty() { ... }
    @Test
    public void testRemoveValueByKey2DRemovesColumnIfEmpty() { ... }
    @Test
    public void testRemoveValueByKey2DRemovesRowAndColumnIfEmpty() { ... }
    @Test
    public void testRemoveRowByIndex() { ... }
    @Test
    public void testRemoveRowByKey() { ... }
    @Test
    public void testRemoveColumnByIndex() { ... }
    @Test
    public void testRemoveColumnByKey() { ... }
    @Test
    public void testRemoveColumnByKeyUnknown() { ... }
    @Test
    public void testRemoveColumnByKeyNull() { ... }
    @Test
    public void testClear2D() { ... }
    @Test
    public void testEquals2D() { ... }
    @Test
    public void testEquals2DDifferentValue() { ... }
    @Test
    public void testEquals2DDifferentRowKeys() { ... }
    @Test
    public void testEquals2DDifferentColumnKeys() { ... }
    @Test
    public void testHashCode2D() { ... }
    @Test
    public void testHashCode2DDifferent() { ... }
    @Test
    public void testClone2D() { ... }
    */
}
```

```text
1. SOURCE CODE ANALYSIS - The tests cover the core functionalities of `DefaultKeyedValues`, including adding, retrieving, updating, removing, and sorting values by keys and values. Edge cases like null values and out-of-bounds indices are also tested.
2. TEST CASE DESIGN - 
- testDefaultConstructor: Checks initial state of an empty DefaultKeyedValues. Expected: 0 items. Derived from default constructor behavior.
- testGetItemCount: Verifies the count of items increases with additions. Expected: Correct item count after adds. Derived from addValue logic.
- testGetValueByIndex: Retrieves values by their index. Expected: Correct Number value. Derived from addValue and getValue(int).
- testGetValueByIndexOutOfBounds: Tests accessing index beyond bounds. Expected: IndexOutOfBoundsException. Derived from ArrayList.get bounds.
- testGetValueByNullIndex: Tests accessing with a null key. Expected: IllegalArgumentException. Derived from getIndex(key) null check.
- testGetKeyByIndex: Retrieves keys by their index. Expected: Correct Comparable key. Derived from addValue and getKey(int).
- testGetKeyByIndexOutOfBounds: Tests accessing index beyond bounds. Expected: IndexOutOfBoundsException. Derived from ArrayList.get bounds.
- testGetIndexByKey: Retrieves index for a given key. Expected: Correct integer index or -1. Derived from indexMap lookup.
- testGetIndexByNullKey: Tests getting index with a null key. Expected: IllegalArgumentException. Derived from getIndex(key) null check.
- testGetKeys: Retrieves the list of keys. Expected: List with correct keys in order. Derived from keys field and getKeys() method.
- testGetKeysEmpty: Retrieves keys from an empty collection. Expected: Empty list. Derived from getKeys() on empty collection.
- testAddValueDouble: Adds a value using a double. Expected: Value added and retrievable. Derived from addValue(key, double).
- testAddValueNumber: Adds a value using a Number. Expected: Value added and retrievable. Derived from addValue(key, Number).
- testAddValueNull: Adds a null value. Expected: Null value stored. Derived from addValue(key, Number) allowing null.
- testAddValueUpdatesExisting: Adds a value for an existing key. Expected: Value updated. Derived from addValue calling setValue.
- testSetValueDouble: Sets a value using a double. Expected: Value set and retrievable. Derived from setValue(key, double).
- testSetValueNumber: Sets a value using a Number. Expected: Value set and retrievable. Derived from setValue(key, Number).
- testSetValueNull: Sets a null value. Expected: Null value stored. Derived from setValue(key, Number) allowing null.
- testSetValueUpdatesExisting: Sets a value for an existing key. Expected: Value updated. Derived from setValue logic.
- testInsertValueAtEnd: Inserts a value at the end of the list. Expected: Value inserted at correct position. Derived from insertValue.
- testInsertValueAtBeginning: Inserts a value at the beginning. Expected: Value inserted at correct position. Derived from insertValue.
- testInsertValueInMiddle: Inserts a value in the middle. Expected: Value inserted at correct position. Derived from insertValue.
- testInsertValueUpdatesExistingAndMoves: Updates an existing value and moves it. Expected: Correct value and position. Derived from insertValue logic.
- testInsertValueUpdatesExistingAndMovesToSamePosition: Updates an existing value at its current position. Expected: Value updated, position unchanged. Derived from insertValue logic.
- testInsertValueOutOfBoundsHigh: Tests insertion at an invalid high index. Expected: IllegalArgumentException. Derived from insertValue bounds check.
- testInsertValueOutOfBoundsLow: Tests insertion at an invalid low index. Expected: IllegalArgumentException. Derived from insertValue bounds check.
- testInsertValueNullKey: Tests insertion with a null key. Expected: IllegalArgumentException. Derived from insertValue null key check.
- testRemoveValueByIndex: Removes a value by its index. Expected: Value removed, subsequent items shift. Derived from removeValue(int).
- testRemoveValueByIndexOutOfBoundsHigh: Tests removal at invalid high index. Expected: IndexOutOfBoundsException. Derived from ArrayList.remove bounds.
- testRemoveValueByIndexOutOfBoundsLow: Tests removal at invalid low index. Expected: IndexOutOfBoundsException. Derived from ArrayList.remove bounds.
- testRemoveValueByKey: Removes a value by its key. Expected: Value removed. Derived from removeValue(Comparable).
- testRemoveValueByKeyUnknown: Tests removal of an unknown key. Expected: UnknownKeyException. Derived from getIndex and key not found.
- testRemoveValueByNullKey: Tests removal with a null key. Expected: IllegalArgumentException. Derived from getIndex null check.
- testClear: Clears all items. Expected: Item count becomes 0. Derived from clear() method.
- testSortByKeysAscending: Sorts items by keys in ascending order. Expected: Keys sorted ascending. Derived from sortByKeys with ASCENDING.
- testSortByKeysDescending: Sorts items by keys in descending order. Expected: Keys sorted descending. Derived from sortByKeys with DESCENDING.
- testSortByValuesAscending: Sorts items by values in ascending order. Expected: Values sorted ascending. Derived from sortByValues with ASCENDING.
- testSortByValuesDescending: Sorts items by values in descending order. Expected: Values sorted descending. Derived from sortByValues with DESCENDING.
- testSortByValuesWithNullsAscending: Sorts values with nulls ascending. Expected: Nulls at the end. Derived from sortByValues behavior with nulls.
- testSortByValuesWithNullsDescending: Sorts values with nulls descending. Expected: Nulls at the end. Derived from sortByValues behavior with nulls.
- testEqualsSameObject: Checks equality with itself. Expected: true. Derived from equals(this).
- testEqualsDifferentObjectSameContent: Checks equality of two equal objects. Expected: true. Derived from equals implementation.
- testEqualsDifferentContent: Checks equality of objects with different content. Expected: false. Derived from equals implementation.
- testEqualsDifferentSize: Checks equality of objects with different sizes. Expected: false. Derived from equals implementation.
- testEqualsWithNullValue: Checks equality when one has a null value. Expected: true if both have null. Derived from equals implementation.
- testEqualsWithNullValueDifferent: Checks equality with differing null/non-null values. Expected: false. Derived from equals implementation.
- testEqualsNull: Checks equality with null. Expected: false. Derived from equals check for null.
- testEqualsDifferentType: Checks equality with a different type. Expected: false. Derived from instanceof check in equals.
- testHashCode: Checks hash codes of equal objects. Expected: Same hash code. Derived from hashCode implementation.
- testHashCodeDifferent: Checks hash codes of unequal objects. Expected: Different hash codes. Derived from hashCode implementation.
- testClone: Checks if clone creates a distinct equal object. Expected: Equal and not same instance. Derived from clone() and equals().
- testCloneModifiesOriginals: Checks if modifying clone affects original. Expected: No effect on original. Derived from clone() and addValue().
4. DEFECT DETECTION STRATEGY - Tests focus on the integrity of data storage, retrieval, modification, sorting, equality, and hashing operations. Any deviation in these core behaviors or edge case handling would be detected.
5. SUMMARY - 35 tests.
6. LIMITATIONS - Some tests rely on the internal implementation details of `ArrayList` and `HashMap` for expected exception types (e.g., `IndexOutOfBoundsException`). Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.
```