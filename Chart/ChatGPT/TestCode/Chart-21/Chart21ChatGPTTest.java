package org.jfree.data.statistics.junit;

import java.util.Arrays;
import junit.framework.TestCase;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;

public class Chart21ChatGPTTest extends TestCase {
    public void testReplacingExtremeItemRecalculatesRange() {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        d.add(Arrays.asList(new Number[]{1.0, 2.0, 100.0}), "R", "C");
        assertTrue(d.getRangeUpperBound(true) >= 100.0);
        d.add(Arrays.asList(new Number[]{1.0, 2.0, 3.0}), "R", "C");
        assertTrue(d.getRangeUpperBound(true) < 100.0);
    }
}
