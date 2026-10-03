package org.jfree.data;

import org.jfree.chart.util.SortOrder;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DefaultKeyedValuesAI18Test {

    @Test
    public void testEmptyCollection() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        Assert.assertEquals(0, data.getItemCount());
        Assert.assertEquals(-1, data.getIndex("Key1"));
        Assert.assertTrue(data.getKeys().isEmpty());
    }

    @Test
    public void testAddAndGetValues() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", new Double(2.0));
        data.addValue("C", (Number) null);

        Assert.assertEquals(3, data.getItemCount());
        Assert.assertEquals("A", data.getKey(0));
        Assert.assertEquals("B", data.getKey(1));
        Assert.assertEquals("C", data.getKey(2));

        Assert.assertEquals(new Double(1.0), data.getValue(0));
        Assert.assertEquals(new Double(2.0), data.getValue("B"));
        Assert.assertNull(data.getValue(2));
        Assert.assertNull(data.getValue("C"));

        Assert.assertEquals(0, data.getIndex("A"));
        Assert.assertEquals(1, data.getIndex("B"));
        Assert.assertEquals(2, data.getIndex("C"));
    }

    @Test
    public void testSetValueUpdatesExistingKey() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 10.0);
        data.addValue("B", 20.0);

        data.setValue("A", 15.0);

        Assert.assertEquals(2, data.getItemCount());
        Assert.assertEquals(0, data.getIndex("A"));
        Assert.assertEquals(new Double(15.0), data.getValue("A"));
        Assert.assertEquals(new Double(15.0), data.getValue(0));
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueForUnknownKeyThrowsException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.getValue("NonExistent");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexNullKeyThrowsException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.getIndex(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValueNullKeyThrowsException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.setValue(null, 1.0);
    }

    @Test
    public void testInsertValue() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("C", 3.0);

        data.insertValue(1, "B", 2.0);

        Assert.assertEquals(3, data.getItemCount());
        Assert.assertEquals("A", data.getKey(0));
        Assert.assertEquals("B", data.getKey(1));
        Assert.assertEquals("C", data.getKey(2));
        Assert.assertEquals(new Double(2.0), data.getValue(1));
        Assert.assertEquals(1, data.getIndex("B"));
        Assert.assertEquals(2, data.getIndex("C"));

        // Moving existing key to new position
        data.insertValue(0, "C", 30.0);
        Assert.assertEquals(3, data.getItemCount());
        Assert.assertEquals("C", data.getKey(0));
        Assert.assertEquals("A", data.getKey(1));
        Assert.assertEquals("B", data.getKey(2));
        Assert.assertEquals(new Double(30.0), data.getValue(0));
        Assert.assertEquals(0, data.getIndex("C"));
        Assert.assertEquals(1, data.getIndex("A"));
        Assert.assertEquals(2, data.getIndex("B"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValueOutOfBoundsThrowsException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.insertValue(1, "A", 1.0);
    }

    @Test
    public void testRemoveValue() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.addValue("C", 3.0);

        data.removeValue(1); // remove "B"

        Assert.assertEquals(2, data.getItemCount());
        Assert.assertEquals("A", data.getKey(0));
        Assert.assertEquals("C", data.getKey(1));
        Assert.assertEquals(0, data.getIndex("A"));
        Assert.assertEquals(-1, data.getIndex("B"));
        Assert.assertEquals(1, data.getIndex("C"));

        data.removeValue("A");
        Assert.assertEquals(1, data.getItemCount());
        Assert.assertEquals("C", data.getKey(0));
        Assert.assertEquals(0, data.getIndex("C"));
    }

    @Test(expected = UnknownKeyException.class)
    public void testRemoveUnknownKeyThrowsException() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.removeValue("NonExistent");
    }

    @Test
    public void testClear() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);

        data.clear();

        Assert.assertEquals(0, data.getItemCount());
        Assert.assertEquals(-1, data.getIndex("A"));
        Assert.assertEquals(-1, data.getIndex("B"));
    }

    @Test
    public void testSortByKeys() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("C", 3.0);
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);

        data.sortByKeys(SortOrder.ASCENDING);

        Assert.assertEquals("A", data.getKey(0));
        Assert.assertEquals("B", data.getKey(1));
        Assert.assertEquals("C", data.getKey(2));
        Assert.assertEquals(new Double(1.0), data.getValue(0));
        Assert.assertEquals(new Double(2.0), data.getValue(1));
        Assert.assertEquals(new Double(3.0), data.getValue(2));
        Assert.assertEquals(0, data.getIndex("A"));
        Assert.assertEquals(1, data.getIndex("B"));
        Assert.assertEquals(2, data.getIndex("C"));

        data.sortByKeys(SortOrder.DESCENDING);

        Assert.assertEquals("C", data.getKey(0));
        Assert.assertEquals("B", data.getKey(1));
        Assert.assertEquals("A", data.getKey(2));
    }

    @Test
    public void testSortByValues() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 30.0);
        data.addValue("B", (Number) null);
        data.addValue("C", 10.0);
        data.addValue("D", 20.0);

        data.sortByValues(SortOrder.ASCENDING);

        // Nulls sort to the end
        Assert.assertEquals("C", data.getKey(0));
        Assert.assertEquals(new Double(10.0), data.getValue(0));
        Assert.assertEquals("D", data.getKey(1));
        Assert.assertEquals(new Double(20.0), data.getValue(1));
        Assert.assertEquals("A", data.getKey(2));
        Assert.assertEquals(new Double(30.0), data.getValue(2));
        Assert.assertEquals("B", data.getKey(3));
        Assert.assertNull(data.getValue(3));

        data.sortByValues(SortOrder.DESCENDING);

        Assert.assertEquals("A", data.getKey(0));
        Assert.assertEquals("D", data.getKey(1));
        Assert.assertEquals("C", data.getKey(2));
        Assert.assertEquals("B", data.getKey(3));
    }

    @Test
    public void testEqualsAndHashCodeAndClone() throws CloneNotSupportedException {
        DefaultKeyedValues data1 = new DefaultKeyedValues();
        data1.addValue("A", 1.0);
        data1.addValue("B", (Number) null);

        DefaultKeyedValues data2 = new DefaultKeyedValues();
        data2.addValue("A", 1.0);
        data2.addValue("B", (Number) null);

        Assert.assertEquals(data1, data2);
        Assert.assertEquals(data1.hashCode(), data2.hashCode());
        Assert.assertFalse(data1.equals(null));
        Assert.assertFalse(data1.equals("A String"));

        DefaultKeyedValues clone = (DefaultKeyedValues) data1.clone();
        Assert.assertNotSame(data1, clone);
        Assert.assertEquals(data1, clone);

        clone.setValue("A", 99.0);
        Assert.assertFalse(data1.equals(clone));
        Assert.assertEquals(new Double(1.0), data1.getValue("A"));
    }
}
