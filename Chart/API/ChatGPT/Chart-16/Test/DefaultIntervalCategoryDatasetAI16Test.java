package org.jfree.data.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DefaultIntervalCategoryDatasetAI16Test {

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKeyOutOfBounds() {
        double[][] starts = {{1.0, 2.0}};
        double[][] ends = {{1.5, 2.5}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getRowKey(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndexNullKey() {
        double[][] starts = {{1.0, 2.0}};
        double[][] ends = {{1.5, 2.5}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getColumnIndex(null);
    }

    @Test
    public void testDatasetCreationAndBasicProperties() {
        double[][] starts = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] ends = {{1.5, 2.5}, {3.5, 4.5}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);

        assertEquals(2, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
        assertNotNull(dataset.getRowKeys());
        assertEquals("Series 1", dataset.getRowKey(0));
        assertEquals("Category 1", dataset.getColumnKey(0));
        assertTrue(dataset.getRowKeys().size() > 0);
    }
}
