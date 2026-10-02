package org.jfree.data.category;

import org.jfree.data.UnknownKeyException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DefaultIntervalCategoryDatasetAI16Test {

    @Test
    public void testCreationWithDoubleArrays() {
        double[][] starts = new double[][] {{1.0, 2.0}, {3.0, 4.0}};
        double[][] ends = new double[][] {{1.5, 2.5}, {3.5, 4.5}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);

        Assert.assertEquals(2, dataset.getSeriesCount());
        Assert.assertEquals(2, dataset.getCategoryCount());
        Assert.assertEquals(2, dataset.getRowCount());
        Assert.assertEquals(2, dataset.getColumnCount());

        Assert.assertEquals(Double.valueOf(1.0), dataset.getStartValue(0, 0));
        Assert.assertEquals(Double.valueOf(1.5), dataset.getEndValue(0, 0));
        Assert.assertEquals(Double.valueOf(1.5), dataset.getValue(0, 0));

        Assert.assertEquals(Double.valueOf(4.0), dataset.getStartValue(1, 1));
        Assert.assertEquals(Double.valueOf(4.5), dataset.getEndValue(1, 1));
        Assert.assertEquals(Double.valueOf(4.5), dataset.getValue(1, 1));
    }

    @Test
    public void testCustomKeysAndValueByKeys() {
        Comparable[] seriesKeys = new Comparable[] {"S1", "S2"};
        Comparable[] categoryKeys = new Comparable[] {"C1", "C2", "C3"};
        Number[][] starts = new Number[][] {
            {1, 2, 3},
            {4, 5, 6}
        };
        Number[][] ends = new Number[][] {
            {10, 20, 30},
            {40, 50, 60}
        };

        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                seriesKeys, categoryKeys, starts, ends);

        Assert.assertEquals("S1", dataset.getSeriesKey(0));
        Assert.assertEquals("S2", dataset.getRowKey(1));
        Assert.assertEquals("C1", dataset.getColumnKey(0));
        Assert.assertEquals(0, dataset.getSeriesIndex("S1"));
        Assert.assertEquals(1, dataset.getRowIndex("S2"));
        Assert.assertEquals(1, dataset.getColumnIndex("C2"));
        Assert.assertEquals(2, dataset.getCategoryIndex("C3"));

        Assert.assertEquals(2, dataset.getStartValue("S1", "C2"));
        Assert.assertEquals(20, dataset.getEndValue("S1", "C2"));
        Assert.assertEquals(20, dataset.getValue("S1", "C2"));

        List rowKeys = dataset.getRowKeys();
        Assert.assertEquals(Arrays.asList(seriesKeys), rowKeys);

        List colKeys = dataset.getColumnKeys();
        Assert.assertEquals(Arrays.asList(categoryKeys), colKeys);
    }

    @Test
    public void testSetStartAndEndValues() {
        Number[][] starts = new Number[][] {{1.0, 2.0}};
        Number[][] ends = new Number[][] {{10.0, 20.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new String[] {"Series 1"}, starts, ends);

        dataset.setStartValue(0, "Category 1", 5.0);
        dataset.setEndValue(0, "Category 1", 15.0);

        Assert.assertEquals(5.0, dataset.getStartValue(0, 0));
        Assert.assertEquals(15.0, dataset.getEndValue(0, 0));
        Assert.assertEquals(15.0, dataset.getValue(0, 0));
    }

    @Test
    public void testSetSeriesKeysAndCategoryKeys() {
        Number[][] starts = new Number[][] {{1, 2}, {3, 4}};
        Number[][] ends = new Number[][] {{5, 6}, {7, 8}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);

        dataset.setSeriesKeys(new Comparable[] {"NewS1", "NewS2"});
        dataset.setCategoryKeys(new Comparable[] {"NewC1", "NewC2"});

        Assert.assertEquals("NewS1", dataset.getSeriesKey(0));
        Assert.assertEquals("NewC2", dataset.getColumnKey(1));
        Assert.assertEquals(1, dataset.getCategoryIndex("NewC2"));
    }

    @Test
    public void testEmptyDataset() {
        Number[][] starts = new Number[0][0];
        Number[][] ends = new Number[0][0];
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);

        Assert.assertEquals(0, dataset.getSeriesCount());
        Assert.assertEquals(0, dataset.getCategoryCount());
        Assert.assertEquals(0, dataset.getRowCount());
        Assert.assertEquals(0, dataset.getColumnCount());
        Assert.assertTrue(dataset.getRowKeys().isEmpty());
        Assert.assertTrue(dataset.getColumnKeys().isEmpty());
    }

    @Test
    public void testEqualsAndClone() throws CloneNotSupportedException {
        Number[][] starts = new Number[][] {{1, 2}};
        Number[][] ends = new Number[][] {{3, 4}};
        DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(starts, ends);
        DefaultIntervalCategoryDataset d2 = new DefaultIntervalCategoryDataset(
                new Number[][] {{1, 2}}, new Number[][] {{3, 4}});

        Assert.assertEquals(d1, d1);
        Assert.assertEquals(d1, d2);
        Assert.assertFalse(d1.equals(null));
        Assert.assertFalse(d1.equals("different object"));

        DefaultIntervalCategoryDataset clone = (DefaultIntervalCategoryDataset) d1.clone();
        Assert.assertEquals(d1, clone);
        Assert.assertNotSame(d1, clone);

        clone.setStartValue(0, "Category 1", 99);
        Assert.assertFalse(d1.equals(clone));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMismatchedSeriesCountThrowsException() {
        Number[][] starts = new Number[][] {{1, 2}, {3, 4}};
        Number[][] ends = new Number[][] {{5, 6}};
        new DefaultIntervalCategoryDataset(starts, ends);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMismatchedCategoryCountThrowsException() {
        Number[][] starts = new Number[][] {{1, 2}};
        Number[][] ends = new Number[][] {{1, 2, 3}};
        new DefaultIntervalCategoryDataset(starts, ends);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueWithUnknownSeriesKeyThrowsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getValue("NoSuchSeries", "Category 1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueWithUnknownCategoryKeyThrowsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getValue("Series 1", "NoSuchCategory");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueOutOfRangeIndexThrowsException() {
        Number[][] starts = new Number[][] {{1}};
        Number[][] ends = new Number[][] {{2}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.getStartValue(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeysNullElementThrowsException() {
        Number[][] starts = new Number[][] {{1, 2}};
        Number[][] ends = new Number[][] {{3, 4}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        dataset.setCategoryKeys(new Comparable[] {"Cat 1", null});
    }
}
