package org.jfree.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DefaultKeyedValues2DAI18Test {

    @Test
    public void testGetRowCountAndColumnCount() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        assertEquals(0, table.getRowCount());
        assertEquals(0, table.getColumnCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowIndexNullKey() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.getRowIndex(null);
    }

    @Test(expected = UnknownKeyException.class)
    public void testRemoveColumnUnknownKey() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.removeColumn("UnknownCol");
    }

}
