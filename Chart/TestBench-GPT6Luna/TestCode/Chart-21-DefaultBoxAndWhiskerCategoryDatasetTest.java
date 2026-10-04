package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.KeyedObjects2D;
import org.jfree.data.Range;
import org.jfree.data.RangeInfo;
import org.jfree.data.general.AbstractDataset;

public class DefaultBoxAndWhiskerCategoryDatasetTest {
    @Test
    public void testInitialBoundsAndEmptyDimensions() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        assertEquals(0, d.getRowCount());
        assertEquals(0, d.getColumnCount());
        assertTrue(Double.isNaN(d.getRangeLowerBound(false)));
        assertTrue(Double.isNaN(d.getRangeUpperBound(true)));
        assertEquals(0.0, d.getRangeBounds(false).getLowerBound(), 0.0);
        assertEquals(0.0, d.getRangeBounds(false).getUpperBound(), 0.0);
    }

    @Test
    public void testAddAndReadAllItemFieldsByIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        List outliers = java.util.Arrays.asList(1.0, 9.0);
        BoxAndWhiskerItem item = new BoxAndWhiskerItem(
                5.0, 5.5, 3.0, 7.0, 2.0, 8.0, 1.0, 9.0, outliers);
        d.add(item, "row", "column");

        assertSame(item, d.getItem(0, 0));
        assertEquals(5.5, d.getValue(0, 0).doubleValue(), 0.0);
        assertEquals(5.0, d.getMeanValue(0, 0).doubleValue(), 0.0);
        assertEquals(5.5, d.getMedianValue(0, 0).doubleValue(), 0.0);
        assertEquals(3.0, d.getQ1Value(0, 0).doubleValue(), 0.0);
        assertEquals(7.0, d.getQ3Value(0, 0).doubleValue(), 0.0);
        assertEquals(2.0, d.getMinRegularValue(0, 0).doubleValue(), 0.0);
        assertEquals(8.0, d.getMaxRegularValue(0, 0).doubleValue(), 0.0);
        assertEquals(1.0, d.getMinOutlier(0, 0).doubleValue(), 0.0);
        assertEquals(9.0, d.getMaxOutlier(0, 0).doubleValue(), 0.0);
        assertEquals(outliers, d.getOutliers(0, 0));
    }

    @Test
    public void testKeyLookupsAndDimensions() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        d.add(new BoxAndWhiskerItem(1, 2, 1, 3, 0, 4, -1, 5,
                java.util.Collections.EMPTY_LIST), "r1", "c1");
        d.add(new BoxAndWhiskerItem(2, 3, 2, 4, 1, 5, 0, 6,
                java.util.Collections.EMPTY_LIST), "r2", "c2");

        assertEquals(2, d.getRowCount());
        assertEquals(2, d.getColumnCount());
        assertEquals(0, d.getRowIndex("r1"));
        assertEquals(1, d.getRowIndex("r2"));
        assertEquals("r2", d.getRowKey(1));
        assertEquals(0, d.getColumnIndex("c1"));
        assertEquals(1, d.getColumnIndex("c2"));
        assertEquals("c2", d.getColumnKey(1));
        assertEquals(java.util.Arrays.asList("r1", "r2"), d.getRowKeys());
        assertEquals(java.util.Arrays.asList("c1", "c2"), d.getColumnKeys());
    }

    @Test
    public void testBoundsTrackMultipleCells() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        d.add(new BoxAndWhiskerItem(1, 1, 1, 2, 0, 3, -4, 5,
                java.util.Collections.EMPTY_LIST), "r1", "c1");
        d.add(new BoxAndWhiskerItem(2, 2, 2, 3, 1, 4, -2, 8,
                java.util.Collections.EMPTY_LIST), "r2", "c2");

        assertEquals(-4.0, d.getRangeLowerBound(false), 0.0);
        assertEquals(8.0, d.getRangeUpperBound(false), 0.0);
        assertEquals(-4.0, d.getRangeBounds(true).getLowerBound(), 0.0);
        assertEquals(8.0, d.getRangeBounds(true).getUpperBound(), 0.0);
    }

    @Test
    public void testReplacingExtremalCellRecomputesBounds() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        d.add(new BoxAndWhiskerItem(1, 1, 1, 2, 0, 3, -10, 10,
                java.util.Collections.EMPTY_LIST), "r", "c");
        d.add(new BoxAndWhiskerItem(2, 2, 2, 3, 1, 4, -2, 6,
                java.util.Collections.EMPTY_LIST), "s", "d");
        d.add(new BoxAndWhiskerItem(3, 3, 3, 4, 2, 5, 0, 4,
                java.util.Collections.EMPTY_LIST), "r", "c");

        assertEquals(-2.0, d.getRangeLowerBound(false), 0.0);
        assertEquals(6.0, d.getRangeUpperBound(false), 0.0);
    }

    @Test
    public void testItemAccessByKeysViaValueMethods() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        d.add(new BoxAndWhiskerItem(4, 5, 3, 7, 2, 8, 1, 9,
                java.util.Collections.EMPTY_LIST), "row", "col");

        assertEquals(5.0, d.getValue("row", "col").doubleValue(), 0.0);
        assertEquals(5.0, d.getMedianValue("row", "col").doubleValue(), 0.0);
        assertEquals(4.0, d.getMeanValue("row", "col").doubleValue(), 0.0);
        assertEquals(3.0, d.getQ1Value("row", "col").doubleValue(), 0.0);
        assertEquals(7.0, d.getQ3Value("row", "col").doubleValue(), 0.0);
    }

    @Test
    public void testRangeUsesExtremeNegativeAndPositiveValues() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        d.add(new BoxAndWhiskerItem(0, 0, 0, 0, 0, 0, -100, 100,
                java.util.Collections.EMPTY_LIST), "r", "c");

        assertEquals(-100.0, d.getRangeLowerBound(true), 0.0);
        assertEquals(100.0, d.getRangeUpperBound(true), 0.0);
        assertEquals(200.0, d.getRangeBounds(false).getLength(), 0.0);
    }

    @Test
    public void testEqualsIdentityAndEqualEmptyDatasets() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset a = new DefaultBoxAndWhiskerCategoryDataset();
        DefaultBoxAndWhiskerCategoryDataset b = new DefaultBoxAndWhiskerCategoryDataset();
        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
    }

    @Test
    public void testEqualsWithDifferentContentsAndOtherTypes() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset a = new DefaultBoxAndWhiskerCategoryDataset();
        DefaultBoxAndWhiskerCategoryDataset b = new DefaultBoxAndWhiskerCategoryDataset();
        a.add(new BoxAndWhiskerItem(1, 1, 1, 2, 0, 3, -1, 4,
                java.util.Collections.EMPTY_LIST), "r", "c");
        assertFalse(a.equals(b));
        assertFalse(a.equals(null));
        assertFalse(a.equals("not dataset"));
    }

    @Test
    public void testCloneHasEqualContents() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset a = new DefaultBoxAndWhiskerCategoryDataset();
        a.add(new BoxAndWhiskerItem(1, 2, 1, 3, 0, 4, -1, 5,
                java.util.Collections.EMPTY_LIST), "r", "c");
        DefaultBoxAndWhiskerCategoryDataset b =
                (DefaultBoxAndWhiskerCategoryDataset) a.clone();

        assertTrue(a.equals(b));
        assertEquals(2.0, b.getMedianValue(0, 0).doubleValue(), 0.0);
        assertEquals(-1.0, b.getRangeLowerBound(false), 0.0);
        assertEquals(5.0, b.getRangeUpperBound(false), 0.0);
    }

    @Test
    public void testRepeatedKeyUpdatesSingleCell() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        d.add(new BoxAndWhiskerItem(1, 1, 1, 2, 0, 3, -5, 6,
                java.util.Collections.EMPTY_LIST), "r", "c");
        d.add(new BoxAndWhiskerItem(2, 2, 2, 3, 1, 4, -2, 4,
                java.util.Collections.EMPTY_LIST), "r", "c");

        assertEquals(1, d.getRowCount());
        assertEquals(1, d.getColumnCount());
        assertEquals(2.0, d.getMedianValue(0, 0).doubleValue(), 0.0);
        assertEquals(-2.0, d.getRangeLowerBound(false), 0.0);
        assertEquals(4.0, d.getRangeUpperBound(false), 0.0);
    }

    @Test
    public void testBoundsIgnoreIntervalFlag() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        d.add(new BoxAndWhiskerItem(1, 2, 1, 3, 0, 4, -3, 7,
                java.util.Collections.EMPTY_LIST), "r", "c");

        assertEquals(d.getRangeLowerBound(false), d.getRangeLowerBound(true), 0.0);
        assertEquals(d.getRangeUpperBound(false), d.getRangeUpperBound(true), 0.0);
        assertEquals(d.getRangeBounds(false), d.getRangeBounds(true));
    }

    @Test
    public void testNullItemFieldRemainsNull() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset d = new DefaultBoxAndWhiskerCategoryDataset();
        BoxAndWhiskerItem item = new BoxAndWhiskerItem(
                (Number) null, (Number) null, (Number) null, (Number) null,
                (Number) null, (Number) null, (Number) null, (Number) null,
                java.util.Collections.EMPTY_LIST);
        d.add(item, "r", "c");

        assertNull(d.getMeanValue(0, 0));
        assertNull(d.getMedianValue(0, 0));
        assertNull(d.getMinOutlier(0, 0));
        assertNull(d.getMaxOutlier(0, 0));
        assertTrue(Double.isNaN(d.getRangeLowerBound(false)));
        assertTrue(Double.isNaN(d.getRangeUpperBound(false)));
    }
}
