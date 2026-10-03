package org.jfree.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KeyedObjects2DAI22Test {

    @Test
    public void testInitialState() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        assertEquals(0, ko2d.getRowCount());
        assertEquals(0, ko2d.getColumnCount());
        assertNotNull(ko2d.getRowKeys());
        assertNotNull(ko2d.getColumnKeys());
    }

    @Test
    public void testRemoveRowByIndex() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.removeRow(0);
        assertEquals(0, ko2d.getRowCount());
    }

    @Test
    public void testRemoveColumnByIndex() {
        KeyedObjects2D ko2d = new KeyedObjects2D();
        ko2d.removeColumn(0);
        assertEquals(0, ko2d.getColumnCount());
    }
}
