package org.jfree.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DefaultKeyedValues2DAI18Test {

    @Test
    public void testEmptyInstance() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        Assert.assertEquals(0, data.getRowCount());
        Assert.assertEquals(0, data.getColumnCount());
        Assert.assertTrue(data.getRowKeys().isEmpty());
        Assert.assertTrue(data.getColumnKeys().isEmpty());
    }

    @Test
    public void testAddAndGetValues() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.addValue(Double.valueOf(1.0), "R1", "C1");
        data.addValue(Double.valueOf(2.0), "R1", "C2");
        data.addValue(Double.valueOf(3.0), "R2", "C1");

        Assert.assertEquals(2, data.getRowCount());
        Assert.assertEquals(2, data.getColumnCount());

        Assert.assertEquals(Double.valueOf(1.0), data.getValue(0, 0));
        Assert.assertEquals(Double.valueOf(2.0), data.getValue(0, 1));
        Assert.assertEquals(Double.valueOf(3.0), data.getValue(1, 0));
        Assert.assertNull(data.getValue(1, 1));

        Assert.assertEquals(Double.valueOf(1.0), data.getValue("R1", "C1"));
        Assert.assertEquals(Double.valueOf(2.0), data.getValue("R1", "C2"));
        Assert.assertEquals(Double.valueOf(3.0), data.getValue("R2", "C1"));
        Assert.assertNull(data.getValue("R2", "C2"));

        Assert.assertEquals(0, data.getRowIndex("R1"));
        Assert.assertEquals(1, data.getRowIndex("R2"));
        Assert.assertEquals("R1", data.getRowKey(0));
        Assert.assertEquals("R2", data.getRowKey(1));

        Assert.assertEquals(0, data.getColumnIndex("C1"));
        Assert.assertEquals(1, data.getColumnIndex("C2"));
        Assert.assertEquals("C1", data.getColumnKey(0));
        Assert.assertEquals("C2", data.getColumnKey(1));
    }

    @Test
    public void testSortedRowKeys() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D(true);
        data.setValue(Double.valueOf(3.0), "R3", "C1");
        data.setValue(Double.valueOf(1.0), "R1", "C1");
        data.setValue(Double.valueOf(2.0), "R2", "C1");

        List rowKeys = data.getRowKeys();
        Assert.assertEquals(3, rowKeys.size());
        Assert.assertEquals("R1", rowKeys.get(0));
        Assert.assertEquals("R2", rowKeys.get(1));
        Assert.assertEquals("R3", rowKeys.get(2));

        Assert.assertEquals(0, data.getRowIndex("R1"));
        Assert.assertEquals(1, data.getRowIndex("R2"));
        Assert.assertEquals(2, data.getRowIndex("R3"));
    }

    @Test
    public void testRemoveValueCascade() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(Double.valueOf(10.0), "R1", "C1");
        data.setValue(Double.valueOf(20.0), "R2", "C2");

        Assert.assertEquals(2, data.getRowCount());
        Assert.assertEquals(2, data.getColumnCount());

        // Removing (R1, C1) should cause R1 and C1 to be completely removed
        data.removeValue("R1", "C1");
        Assert.assertEquals(1, data.getRowCount());
        Assert.assertEquals(1, data.getColumnCount());
        Assert.assertEquals("R2", data.getRowKey(0));
        Assert.assertEquals("C2", data.getColumnKey(0));
    }

    @Test
    public void testRemoveRowAndColumn() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(Double.valueOf(1.0), "R1", "C1");
        data.setValue(Double.valueOf(2.0), "R1", "C2");
        data.setValue(Double.valueOf(3.0), "R2", "C1");
        data.setValue(Double.valueOf(4.0), "R2", "C2");

        data.removeRow(0); // removes R1
        Assert.assertEquals(1, data.getRowCount());
        Assert.assertEquals("R2", data.getRowKey(0));
        Assert.assertEquals(Double.valueOf(3.0), data.getValue(0, 0));

        data.removeColumn("C1");
        Assert.assertEquals(1, data.getColumnCount());
        Assert.assertEquals("C2", data.getColumnKey(0));
        Assert.assertEquals(Double.valueOf(4.0), data.getValue(0, 0));

        data.removeRow("R2");
        Assert.assertEquals(0, data.getRowCount());

        data.removeColumn(0);
        Assert.assertEquals(0, data.getColumnCount());
    }

    @Test
    public void testClear() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(Double.valueOf(1.0), "R1", "C1");
        data.setValue(Double.valueOf(2.0), "R2", "C2");

        data.clear();
        Assert.assertEquals(0, data.getRowCount());
        Assert.assertEquals(0, data.getColumnCount());
        Assert.assertTrue(data.getRowKeys().isEmpty());
        Assert.assertTrue(data.getColumnKeys().isEmpty());
    }

    @Test
    public void testEqualsAndHashCode() {
        DefaultKeyedValues2D d1 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D d2 = new DefaultKeyedValues2D();

        Assert.assertTrue(d1.equals(d2));
        Assert.assertEquals(d1.hashCode(), d2.hashCode());

        d1.setValue(Double.valueOf(1.0), "R1", "C1");
        Assert.assertFalse(d1.equals(d2));

        d2.setValue(Double.valueOf(1.0), "R1", "C1");
        Assert.assertTrue(d1.equals(d2));
        Assert.assertEquals(d1.hashCode(), d2.hashCode());

        d1.setValue(null, "R1", "C2");
        d2.setValue(Double.valueOf(2.0), "R1", "C2");
        Assert.assertFalse(d1.equals(d2));
    }

    @Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultKeyedValues2D d1 = new DefaultKeyedValues2D();
        d1.setValue(Double.valueOf(1.0), "R1", "C1");

        DefaultKeyedValues2D d2 = (DefaultKeyedValues2D) d1.clone();
        Assert.assertTrue(d1.equals(d2));
        Assert.assertNotSame(d1, d2);

        d2.setValue(Double.valueOf(2.0), "R1", "C1");
        Assert.assertFalse(d1.equals(d2));
        Assert.assertEquals(Double.valueOf(1.0), d1.getValue("R1", "C1"));
        Assert.assertEquals(Double.valueOf(2.0), d2.getValue("R1", "C1"));
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueUnknownRowKey() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(Double.valueOf(1.0), "R1", "C1");
        data.getValue("UnknownRow", "C1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueUnknownColumnKey() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(Double.valueOf(1.0), "R1", "C1");
        data.getValue("R1", "UnknownColumn");
    }

    @Test(expected = UnknownKeyException.class)
    public void testRemoveUnknownColumnKey() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.setValue(Double.valueOf(1.0), "R1", "C1");
        data.removeColumn("UnknownColumn");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowIndexNullKey() {
        DefaultKeyedValues2D data = new DefaultKeyedValues2D();
        data.getRowIndex(null);
    }
}
