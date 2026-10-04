package org.jfree.data.category;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import org.jfree.data.DataUtilities;
import org.jfree.data.UnknownKeyException;
import org.jfree.data.general.AbstractSeriesDataset;

public class DefaultIntervalCategoryDatasetTest {
    @Test
    public void testCountsAndGeneratedKeys() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Number[][] {{1, 2}, {3, 4}},
                new Number[][] {{5, 6}, {7, 8}});
        assertEquals(2, d.getSeriesCount());
        assertEquals(2, d.getRowCount());
        assertEquals(2, d.getCategoryCount());
        assertEquals(2, d.getColumnCount());
        assertEquals(d.getRowKey(0), d.getSeriesKey(0));
        assertEquals(d.getColumnKey(0), d.getColumnKeys().get(0));
    }

    @Test
    public void testExplicitKeysAndIndexes() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S", "T"}, new Comparable[] {"A", "B"},
                new Number[][] {{1, 2}, {3, 4}},
                new Number[][] {{5, 6}, {7, 8}});
        assertEquals(1, d.getSeriesIndex("T"));
        assertEquals(1, d.getRowIndex("T"));
        assertEquals(1, d.getCategoryIndex("B"));
        assertEquals(1, d.getColumnIndex("B"));
        assertEquals(-1, d.getSeriesIndex("missing"));
        assertEquals(-1, d.getColumnIndex("missing"));
    }

    @Test
    public void testValueAccessByIndexesAndKeys() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A", "B"},
                new Number[][] {{11, 12}}, new Number[][] {{21, 22}});
        assertEquals(Integer.valueOf(12), d.getStartValue(0, 1));
        assertEquals(Integer.valueOf(22), d.getEndValue(0, 1));
        assertEquals(Integer.valueOf(22), d.getValue(0, 1));
        assertEquals(Integer.valueOf(11), d.getStartValue("S", "A"));
        assertEquals(Integer.valueOf(21), d.getEndValue("S", "A"));
        assertEquals(Integer.valueOf(21), d.getValue("S", "A"));
    }

    @Test
    public void testNullDataCellIsPreserved() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A"},
                new Number[][] {{null}}, new Number[][] {{3}});
        assertNull(d.getStartValue(0, 0));
        assertEquals(Integer.valueOf(3), d.getEndValue(0, 0));
    }

    @Test
    public void testSetStartValueChangesSelectedCell() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A", "B"},
                new Number[][] {{1, 2}}, new Number[][] {{3, 4}});
        d.setStartValue(0, "B", 9);
        assertEquals(Integer.valueOf(9), d.getStartValue(0, 1));
        assertEquals(Integer.valueOf(1), d.getStartValue(0, 0));
    }

    @Test
    public void testSetEndValueChangesSelectedCell() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A", "B"},
                new Number[][] {{1, 2}}, new Number[][] {{3, 4}});
        d.setEndValue(0, "A", 8);
        assertEquals(Integer.valueOf(8), d.getEndValue(0, 0));
        assertEquals(Integer.valueOf(4), d.getEndValue(0, 1));
    }

    @Test
    public void testKeyListsContainKeysInOrder() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S", "T"}, new Comparable[] {"A", "B"},
                new Number[][] {{1, 2}, {3, 4}},
                new Number[][] {{5, 6}, {7, 8}});
        assertEquals(Arrays.asList("S", "T"), d.getRowKeys());
        assertEquals(Arrays.asList("A", "B"), d.getColumnKeys());
        assertEquals("T", d.getRowKey(1));
        assertEquals("B", d.getColumnKey(1));
    }

    @Test
    public void testSetKeysUpdatesKeyLookups() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A"},
                new Number[][] {{1}}, new Number[][] {{2}});
        d.setSeriesKeys(new Comparable[] {"Changed"});
        d.setCategoryKeys(new Comparable[] {"Renamed"});
        assertEquals("Changed", d.getSeriesKey(0));
        assertEquals("Renamed", d.getColumnKey(0));
        assertEquals(0, d.getSeriesIndex("Changed"));
        assertEquals(0, d.getCategoryIndex("Renamed"));
    }

    @Test
    public void testSetKeysRejectWrongLengths() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A"},
                new Number[][] {{1}}, new Number[][] {{2}});
        try {
            d.setSeriesKeys(new Comparable[] {"S", "T"});
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        try {
            d.setCategoryKeys(new Comparable[] {"A", "B"});
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(1, d.getRowCount());
        assertEquals(1, d.getColumnCount());
    }

    @Test
    public void testInvalidSeriesAndCategoryIndexes() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A"},
                new Number[][] {{1}}, new Number[][] {{2}});
        try {
            d.getStartValue(-1, 0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        try {
            d.getEndValue(0, 1);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(0, d.getSeriesIndex("S"));
        assertEquals(0, d.getCategoryIndex("A"));
    }

    @Test
    public void testUnknownKeysThrowUnknownKeyException() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A"},
                new Number[][] {{1}}, new Number[][] {{2}});
        try {
            d.getValue("missing", "A");
            fail("expected UnknownKeyException");
        }
        catch (UnknownKeyException expected) { }
        try {
            d.getStartValue("S", "missing");
            fail("expected UnknownKeyException");
        }
        catch (UnknownKeyException expected) { }
        assertEquals(Integer.valueOf(2), d.getValue("S", "A"));
    }

    @Test
    public void testNullColumnKeyIsRejected() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A"},
                new Number[][] {{1}}, new Number[][] {{2}});
        try {
            d.getColumnIndex(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(0, d.getColumnIndex("A"));
    }

    @Test
    public void testEqualityComparesDataAndKeys() throws Exception {
        DefaultIntervalCategoryDataset a = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A"},
                new Number[][] {{1}}, new Number[][] {{2}});
        DefaultIntervalCategoryDataset b = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A"},
                new Number[][] {{1}}, new Number[][] {{2}});
        DefaultIntervalCategoryDataset different = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A"},
                new Number[][] {{1}}, new Number[][] {{3}});
        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
        assertFalse(a.equals(different));
        assertFalse(a.equals(null));
    }

    @Test
    public void testCloneIsEqualAndDataIsIndependent() throws Exception {
        DefaultIntervalCategoryDataset original = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S"}, new Comparable[] {"A"},
                new Number[][] {{1}}, new Number[][] {{2}});
        DefaultIntervalCategoryDataset copy =
                (DefaultIntervalCategoryDataset) original.clone();
        assertTrue(original.equals(copy));
        copy.setStartValue(0, "A", 9);
        assertEquals(Integer.valueOf(1), original.getStartValue(0, 0));
        assertEquals(Integer.valueOf(9), copy.getStartValue(0, 0));
        assertFalse(original.equals(copy));
    }

    @Test
    public void testGeneratedKeysAndDoubleConstructor() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new double[][] {{1.0}}, new double[][] {{2.0}});
        assertEquals(1, d.getSeriesCount());
        assertEquals(1, d.getCategoryCount());
        assertEquals(1.0, d.getStartValue(0, 0).doubleValue(), 1e-9);
        assertEquals(2.0, d.getEndValue(0, 0).doubleValue(), 1e-9);
        assertNotNull(d.getSeriesKey(0));
        assertNotNull(d.getColumnKey(0));
    }

    @Test
    public void testEmptyDatasetCounts() throws Exception {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                new Number[0][], new Number[0][]);
        assertEquals(0, d.getSeriesCount());
        assertEquals(0, d.getRowCount());
        assertEquals(0, d.getCategoryCount());
        assertEquals(0, d.getColumnCount());
        assertEquals(0, d.getRowKeys().size());
        assertEquals(0, d.getColumnKeys().size());
    }
}
