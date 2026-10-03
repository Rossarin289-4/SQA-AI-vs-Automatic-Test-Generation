package org.jfree.data.general;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;
import org.junit.Test;

public class DatasetUtilitiesAI2Test {

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumStackedRangeValueNullDataset() {
        DatasetUtilities.findMaximumStackedRangeValue(null);
    }

    @Test
    public void testFindMaximumStackedRangeValueValidData() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        dataset.addValue(2.5, "Row2", "Col1");
        
        Number max = DatasetUtilities.findMaximumStackedRangeValue(dataset);
        assertNotNull(max);
        assertEquals(3.5, max.doubleValue(), 0.0001);
    }

    @Test
    public void testFindStackedRangeBoundsTableXYDataset() {
        DefaultTableXYDataset dataset = new DefaultTableXYDataset();
        XYSeries series1 = new XYSeries("Series 1", true, false);
        series1.add(1.0, 2.0);
        series1.add(2.0, 3.0);
        dataset.addSeries(series1);

        Range range = DatasetUtilities.findStackedRangeBounds(dataset);
        assertNotNull(range);
        assertEquals(0.0, range.getLowerBound(), 0.0001);
        assertEquals(3.0, range.getUpperBound(), 0.0001);
    }
}
