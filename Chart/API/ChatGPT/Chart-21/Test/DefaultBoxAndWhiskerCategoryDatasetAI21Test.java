package org.jfree.data.statistics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DefaultBoxAndWhiskerCategoryDatasetAI21Test {

    @Test
    public void testAddAndGetItem() {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List values = new ArrayList();
        values.add(Double.valueOf(1.0));
        values.add(Double.valueOf(2.0));
        values.add(Double.valueOf(3.0));

        dataset.add(values, "Row1", "Col1");

        BoxAndWhiskerItem item = dataset.getItem(0, 0);
        assertNotNull(item);
        assertEquals(Double.valueOf(2.0), item.getMedian());
    }

    @Test
    public void testEquals() {
        DefaultBoxAndWhiskerCategoryDataset dataset1 = new DefaultBoxAndWhiskerCategoryDataset();
        DefaultBoxAndWhiskerCategoryDataset dataset2 = new DefaultBoxAndWhiskerCategoryDataset();

        List values = new ArrayList();
        values.add(Double.valueOf(5.0));

        dataset1.add(values, "R1", "C1");
        dataset2.add(values, "R1", "C1");

        assertTrue(dataset1.equals(dataset2));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List values = new ArrayList();
        values.add(Double.valueOf(10.0));
        dataset.add(values, "R1", "C1");

        DefaultBoxAndWhiskerCategoryDataset clone = (DefaultBoxAndWhiskerCategoryDataset) dataset.clone();
        assertTrue(dataset.equals(clone));
    }
}
