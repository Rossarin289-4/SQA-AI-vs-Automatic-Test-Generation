package org.jfree.data.category.junit;

import junit.framework.TestCase;
import org.jfree.data.category.DefaultIntervalCategoryDataset;

public class Chart16ChatGPTTest extends TestCase {
    public void testEmptyDatasetAcceptsEmptyCategoryKeys() {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]);
        d.setCategoryKeys(new Comparable[0]);
        assertEquals(0, d.getCategoryCount());
    }
}
