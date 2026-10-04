package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class KeyedObjects2DTest {
    @Test
    public void testEmptyCountsAndKeys() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
        assertEquals(Collections.emptyList(), data.getRowKeys());
        assertEquals(Collections.emptyList(), data.getColumnKeys());
    }

    @Test
    public void testAddObjectCreatesRowAndColumn() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.addObject("v", "r", "c");
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
        assertEquals("v", data.getObject(0, 0));
    }

    @Test
    public void testSetObjectUpdatesExistingCell() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("old", "r", "c");
        data.setObject("new", "r", "c");
        assertEquals("new", data.getObject("r", "c"));
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
    }

    @Test
    public void testSetObjectAddsColumnsAcrossRows() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("a", "r1", "c1");
        data.setObject("b", "r2", "c2");
        assertEquals(2, data.getColumnCount());
        assertEquals(null, data.getObject("r1", "c2"));
        assertEquals("b", data.getObject("r2", "c2"));
    }

    @Test
    public void testRowAndColumnKeysAndIndexes() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("a", "r1", "c1");
        data.setObject("b", "r2", "c2");
        assertEquals("r1", data.getRowKey(0));
        assertEquals("r2", data.getRowKey(1));
        assertEquals(1, data.getRowIndex("r2"));
        assertEquals(-1, data.getRowIndex("missing"));
        assertEquals("c1", data.getColumnKey(0));
        assertEquals("c2", data.getColumnKey(1));
        assertEquals(1, data.getColumnIndex("c2"));
        assertEquals(-1, data.getColumnIndex("missing"));
    }

    @Test
    public void testKeyListsAreUnmodifiable() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("v", "r", "c");
        try {
            data.getRowKeys().add("other");
            fail("expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException expected) {
        }
        assertEquals(1, data.getRowCount());
    }

    @Test
    public void testGetObjectByIndexesReturnsCellAndNull() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("v", "r1", "c1");
        data.setObject("w", "r2", "c2");
        assertEquals("v", data.getObject(0, 0));
        assertEquals(null, data.getObject(0, 1));
        assertEquals("w", data.getObject(1, 1));
    }

    @Test
    public void testGetObjectRejectsNullRowKey() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        try {
            data.getObject(null, "c");
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetObjectRejectsUnknownColumnKey() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("v", "r", "c");
        try {
            data.getObject("r", "missing");
            fail("expected UnknownKeyException");
        }
        catch (UnknownKeyException expected) {
        }
    }

    @Test
    public void testRemoveObjectKeepsNonemptyRowAndColumn() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("a", "r", "c1");
        data.setObject("b", "r", "c2");
        data.removeObject("r", "c1");
        assertEquals(1, data.getRowCount());
        assertEquals(1, data.getColumnCount());
        assertEquals(null, data.getObject("r", "c2"));
    }

    @Test
    public void testRemoveObjectDropsNowEmptyRowAndColumn() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("v", "r", "c");
        data.removeObject("r", "c");
        assertEquals(0, data.getRowCount());
        assertEquals(0, data.getColumnCount());
        assertEquals(-1, data.getRowIndex("r"));
        assertEquals(-1, data.getColumnIndex("c"));
    }

    @Test
    public void testRemoveObjectDropsColumnOnlyWhenAllValuesNull() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("a", "r1", "c");
        data.setObject("b", "r2", "c");
        data.removeObject("r1", "c");
        assertEquals(1, data.getRowCount());
        assertEquals(0, data.getColumnCount());
        assertEquals(-1, data.getRowIndex("r1"));
        assertEquals("r2", data.getRowKey(0));
    }

    @Test
    public void testRemoveRowByIndex() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("a", "r1", "c");
        data.setObject("b", "r2", "c");
        data.removeRow(0);
        assertEquals(1, data.getRowCount());
        assertEquals("r2", data.getRowKey(0));
        assertEquals("b", data.getObject(0, 0));
    }

    @Test
    public void testRemoveRowByKey() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("a", "r1", "c");
        data.setObject("b", "r2", "c");
        data.removeRow("r1");
        assertEquals(1, data.getRowCount());
        assertEquals(-1, data.getRowIndex("r1"));
        assertEquals("b", data.getObject("r2", "c"));
    }

    @Test
    public void testRemoveColumnByIndex() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("a", "r", "c1");
        data.setObject("b", "r", "c2");
        data.removeColumn(0);
        assertEquals(1, data.getColumnCount());
        assertEquals("c2", data.getColumnKey(0));
        assertEquals("b", data.getObject("r", "c2"));
    }

    @Test
    public void testRemoveColumnByKey() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        data.setObject("a", "r1", "c1");
        data.setObject("b", "r2", "c2");
        data.removeColumn("c1");
        assertEquals(1, data.getColumnCount());
        assertEquals(-1, data.getColumnIndex("c1"));
        assertEquals("b", data.getObject("r2", "c2"));
    }

    @Test
    public void testEqualsAcrossEquivalentTables() throws Exception {
        KeyedObjects2D a = new KeyedObjects2D();
        KeyedObjects2D b = new KeyedObjects2D();
        a.setObject("v", "r", "c");
        b.setObject("v", "r", "c");
        assertTrue(a.equals(b));
        assertTrue(a.equals(a));
    }

    @Test
    public void testEqualsDistinguishesCellValueAndColumnOrder() throws Exception {
        KeyedObjects2D a = new KeyedObjects2D();
        KeyedObjects2D b = new KeyedObjects2D();
        a.setObject("v", "r", "c1");
        a.setObject("w", "r", "c2");
        b.setObject("w", "r", "c2");
        b.setObject("v", "r", "c1");
        assertFalse(a.equals(b));
        b = new KeyedObjects2D();
        b.setObject("x", "r", "c1");
        b.setObject("w", "r", "c2");
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsNullAndDifferentType() throws Exception {
        KeyedObjects2D data = new KeyedObjects2D();
        assertFalse(data.equals(null));
        assertFalse(data.equals("not a table"));
    }

    @Test
    public void testHashCodeEqualForEquivalentTables() throws Exception {
        KeyedObjects2D a = new KeyedObjects2D();
        KeyedObjects2D b = new KeyedObjects2D();
        a.setObject("v", "r", "c");
        b.setObject("v", "r", "c");
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testCloneIsEqualAndCanBeChangedIndependently() throws Exception {
        KeyedObjects2D original = new KeyedObjects2D();
        original.setObject("v", "r", "c");
        KeyedObjects2D copy = (KeyedObjects2D) original.clone();
        assertTrue(original.equals(copy));
        copy.setObject("changed", "r", "c");
        assertEquals("v", original.getObject("r", "c"));
        assertEquals("changed", copy.getObject("r", "c"));
    }
}
