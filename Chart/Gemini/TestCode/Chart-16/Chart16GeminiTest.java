package org.jfree.data.category.junit;

import junit.framework.TestCase;
import org.jfree.data.category.DefaultIntervalCategoryDataset;

public class Chart16GeminiTest extends TestCase {

    public Chart16GeminiTest(String name) {
        super(name);
    }

    public void testSetCategoryKeysEmptyDataset() {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
            new double[0][0], new double[0][0]
        );
        try {
            dataset.setCategoryKeys(new String[0]);
            assertEquals(0, dataset.getCategoryCount());
        } catch (IllegalArgumentException e) {
            fail("setCategoryKeys threw unexpected IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            fail("setCategoryKeys failed on empty dataset with exception: " + e.getMessage());
        }
    }
}
