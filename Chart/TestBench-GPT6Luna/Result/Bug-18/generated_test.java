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
    @Test
    public void testAddValuesAndLookups() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("a", 10.0);
        values.addValue("b", 20.0);
        assertEquals(2, values.getItemCount());
        assertEquals(0, values.getIndex("a"));
        assertEquals(1, values.getIndex("b"));
        assertEquals(-1, values.getIndex("missing"));
        assertEquals("a", values.getKey(0));
        assertEquals(Double.valueOf(20.0), values.getValue(1));
        assertEquals(Double.valueOf(10.0), values.getValue("a"));
    }

    @Test
    public void testSetExistingAndNullValue() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.setValue("a", 1.0);
        values.setValue("a", (Number) null);
        assertEquals(1, values.getItemCount());
        assertNull(values.getValue("a"));
    }

    @Test
    public void testKeysAreReturnedAsSeparateList() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("a", 1.0);
        List keys = values.getKeys();
        keys.clear();
        assertEquals(1, values.getItemCount());
        assertEquals("a", values.getKey(0));
    }

    @Test
    public void testInsertAtBeginningAndEnd() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("b", 2.0);
        values.insertValue(0, "a", 1.0);
        values.insertValue(2, "c", 3.0);
        assertEquals(Arrays.asList(new Comparable[] {"a", "b", "c"}),
                values.getKeys());
        assertEquals(2, values.getIndex("c"));
        assertEquals(Double.valueOf(3.0), values.getValue("c"));
    }

    @Test
    public void testInsertExistingKeyMovesIt() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("a", 1.0);
        values.addValue("b", 2.0);
        values.addValue("c", 3.0);
        values.insertValue(0, "c", 30.0);
        assertEquals(Arrays.asList(new Comparable[] {"c", "a", "b"}),
                values.getKeys());
        assertEquals(0, values.getIndex("c"));
        assertEquals(Double.valueOf(30.0), values.getValue("c"));
    }

    @Test
    public void testInsertExistingKeyAtItsPositionUpdatesValue() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("a", 1.0);
        values.addValue("b", 2.0);
        values.insertValue(1, "b", 9.0);
        assertEquals(Arrays.asList(new Comparable[] {"a", "b"}), values.getKeys());
        assertEquals(Double.valueOf(9.0), values.getValue(1));
    }

    @Test
    public void testInsertRejectsPositionOutsideInclusiveBounds() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("a", 1.0);
        try {
            values.insertValue(-1, "b", 2.0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        try {
            values.insertValue(2, "b", 2.0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(1, values.getItemCount());
        assertEquals("a", values.getKey(0));
    }

    @Test
    public void testRemoveByIndexRebuildsIndexes() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("a", 1.0);
        values.addValue("b", 2.0);
        values.addValue("c", 3.0);
        values.removeValue(0);
        assertEquals(2, values.getItemCount());
        assertEquals(0, values.getIndex("b"));
        assertEquals(1, values.getIndex("c"));
        assertEquals("b", values.getKey(0));
    }

    @Test
    public void testClearEmptiesCollection() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("a", 1.0);
        values.clear();
        assertEquals(0, values.getItemCount());
        assertEquals(-1, values.getIndex("a"));
        assertEquals(0, values.getKeys().size());
    }

    @Test
    public void testSortByKeysAscending() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("c", 3.0);
        values.addValue("a", 1.0);
        values.addValue("b", 2.0);
        values.sortByKeys(SortOrder.ASCENDING);
        assertEquals(Arrays.asList(new Comparable[] {"a", "b", "c"}),
                values.getKeys());
        assertEquals(Double.valueOf(3.0), values.getValue("c"));
    }

    @Test
    public void testSortByKeysDescending() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("a", 1.0);
        values.addValue("c", 3.0);
        values.addValue("b", 2.0);
        values.sortByKeys(SortOrder.DESCENDING);
        assertEquals(Arrays.asList(new Comparable[] {"c", "b", "a"}),
                values.getKeys());
    }

    @Test
    public void testSortByValuesAscendingAndNullLast() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("high", 8.0);
        values.addValue("null", (Number) null);
        values.addValue("low", 2.0);
        values.sortByValues(SortOrder.ASCENDING);
        assertEquals(Arrays.asList(new Comparable[] {"low", "high", "null"}),
                values.getKeys());
        assertEquals(Double.valueOf(2.0), values.getValue(0));
        assertNull(values.getValue(2));
    }

    @Test
    public void testSortByValuesDescendingKeepsNullLast() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("low", 2.0);
        values.addValue("null", (Number) null);
        values.addValue("high", 8.0);
        values.sortByValues(SortOrder.DESCENDING);
        assertEquals(Arrays.asList(new Comparable[] {"high", "low", "null"}),
                values.getKeys());
        assertNull(values.getValue(2));
    }

    @Test
    public void testEqualsAndHashCodeForSameContents() throws Exception {
        DefaultKeyedValues first = new DefaultKeyedValues();
        DefaultKeyedValues second = new DefaultKeyedValues();
        first.addValue("a", 1.0);
        second.addValue("a", 1.0);
        assertTrue(first.equals(second));
        assertEquals(first.hashCode(), second.hashCode());
        assertFalse(first.equals(null));
    }

    @Test
    public void testEqualsChecksKeyOrderAndValue() throws Exception {
        DefaultKeyedValues first = new DefaultKeyedValues();
        DefaultKeyedValues second = new DefaultKeyedValues();
        first.addValue("a", 1.0);
        first.addValue("b", 2.0);
        second.addValue("b", 2.0);
        second.addValue("a", 1.0);
        assertFalse(first.equals(second));
        second.clear();
        second.addValue("a", 9.0);
        second.addValue("b", 2.0);
        assertFalse(first.equals(second));
    }

    @Test
    public void testCloneHasIndependentCollections() throws Exception {
        DefaultKeyedValues original = new DefaultKeyedValues();
        original.addValue("a", 1.0);
        DefaultKeyedValues copy = (DefaultKeyedValues) original.clone();
        copy.setValue("a", 2.0);
        copy.addValue("b", 3.0);
        assertEquals(Double.valueOf(1.0), original.getValue("a"));
        assertEquals(1, original.getItemCount());
        assertEquals(Double.valueOf(2.0), copy.getValue("a"));
    }

    @Test
    public void testNullKeyIsRejectedBySetAndLookup() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        try {
            values.setValue(null, 1.0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        try {
            values.getIndex(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(0, values.getItemCount());
    }

    @Test
    public void testUnknownKeyValueLookupThrows() throws Exception {
        DefaultKeyedValues values = new DefaultKeyedValues();
        values.addValue("a", 1.0);
        try {
            values.getValue("missing");
            fail("expected UnknownKeyException");
        }
        catch (UnknownKeyException expected) { }
        assertEquals(1, values.getItemCount());
    }

    @Test
    public void testTwoDimensionalRowAndColumnBoundaries() throws Exception {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(10, "r", "c");
        assertEquals(1, table.getRowCount());
        assertEquals(1, table.getColumnCount());
        assertEquals("r", table.getRowKey(0));
        assertEquals(0, table.getRowIndex("r"));
        assertEquals("c", table.getColumnKey(0));
        assertEquals(0, table.getColumnIndex("c"));
    }

    @Test
    public void testTwoDimensionalInsertionOrderKeysAndMissingIndexes() throws Exception {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1, "z", "last");
        table.addValue(2, "a", "first");
        assertEquals(Arrays.asList(new Comparable[] {"z", "a"}), table.getRowKeys());
        assertEquals(Arrays.asList(new Comparable[] {"last", "first"}),
                table.getColumnKeys());
        assertEquals(-1, table.getRowIndex("missing"));
        assertEquals(-1, table.getColumnIndex("missing"));
    }

    @Test
    public void testSortedRowsInsertedAtComparablePosition() throws Exception {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D(true);
        table.addValue(1, "b", "x");
        table.addValue(2, "a", "x");
        table.addValue(3, "c", "x");
        assertEquals(Arrays.asList(new Comparable[] {"a", "b", "c"}),
                table.getRowKeys());
        assertEquals(0, table.getRowIndex("a"));
        assertEquals(2, table.getRowIndex("c"));
    }

    @Test
    public void testReturnedTwoDimensionalKeyListsAreUnmodifiable() throws Exception {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1, "r", "c");
        try {
            table.getRowKeys().clear();
            fail("expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException expected) { }
        try {
            table.getColumnKeys().clear();
            fail("expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException expected) { }
        assertEquals(1, table.getRowCount());
        assertEquals(1, table.getColumnCount());
    }

    @Test
    public void testRemoveRowByIndexKeepsOtherRow() throws Exception {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1, "a", "x");
        table.addValue(2, "b", "x");
        table.removeRow(0);
        assertEquals(1, table.getRowCount());
        assertEquals("b", table.getRowKey(0));
        assertEquals(0, table.getRowIndex("b"));
    }

    @Test
    public void testRemoveLastRowProducesEmptyRowKeys() throws Exception {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1, "r", "c");
        table.removeRow(0);
        assertEquals(0, table.getRowCount());
        assertEquals(1, table.getColumnCount());
        assertEquals("c", table.getColumnKey(0));
    }

    @Test
    public void testRemoveColumnByIndexRemovesColumnFromRows() throws Exception {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1, "r1", "a");
        table.addValue(2, "r1", "b");
        table.addValue(3, "r2", "a");
        table.removeColumn(0);
        assertEquals(2, table.getColumnCount());
        assertEquals("b", table.getColumnKey(0));
        assertEquals(1, table.getColumnIndex("b"));
        assertEquals(Double.valueOf(2), table.getValue("r1", "b"));
    }

    @Test
    public void testRemoveColumnLastIndex() throws Exception {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1, "r", "a");
        table.addValue(2, "r", "b");
        table.removeColumn(1);
        assertEquals(1, table.getColumnCount());
        assertEquals("a", table.getColumnKey(0));
    }
}
