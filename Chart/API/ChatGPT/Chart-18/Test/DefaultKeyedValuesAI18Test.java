package org.jfree.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DefaultKeyedValuesAI18Test {

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexWithNullKey() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.getIndex(null);
    }

    @Test
    public void testGetItemCountAndBasicOperations() {
        DefaultKeyedValues data = new DefaultKeyedValues();
        assertEquals(0, data.getItemCount());

        data.insertValue(0, "Key1", Integer.valueOf(10));
        assertEquals(1, data.getItemCount());
        assertEquals("Key1", data.getKey(0));
        assertEquals(Integer.valueOf(10), data.getValue(0));
        assertEquals(0, data.getIndex("Key1"));

        data.removeValue(0);
        assertEquals(0, data.getItemCount());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        DefaultKeyedValues data = new DefaultKeyedValues();
        data.insertValue(0, "Key1", Integer.valueOf(5));
        
        DefaultKeyedValues clone = (DefaultKeyedValues) data.clone();
        assertNotNull(clone);
        assertEquals(data.getItemCount(), clone.getItemCount());
        assertEquals(data.getKey(0), clone.getKey(0));
        assertEquals(data.getValue(0), clone.getValue(0));
    }
}
