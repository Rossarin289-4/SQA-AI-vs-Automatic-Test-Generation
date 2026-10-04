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
    public void testConstructorWithDoubleArrays() throws Exception {
        double[][] starts = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] ends = {{5.0, 6.0}, {7.0, 8.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        assertNotNull(dataset);
        assertEquals(2, dataset.getSeriesCount());
        assertEquals(2, dataset.getCategoryCount());
    }

    @Test
    public void testConstructorWithNumberArrays() throws Exception {
        Number[][] starts = {{1.0, 2.0}, {3.0, 4.0}};
        Number[][] ends = {{5.0, 6.0}, {7.0, 8.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        assertNotNull(dataset);
        assertEquals(2, dataset.getSeriesCount());
        assertEquals(2, dataset.getCategoryCount());
    }

    @Test
    public void testConstructorWithSeriesNames() throws Exception {
        String[] seriesNames = {"S1", "S2"};
        Number[][] starts = {{1.0, 2.0}, {3.0, 4.0}};
        Number[][] ends = {{5.0, 6.0}, {7.0, 8.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(seriesNames, starts, ends);
        assertNotNull(dataset);
        assertEquals("S1", dataset.getSeriesKey(0));
        assertEquals("S2", dataset.getSeriesKey(1));
        assertEquals(2, dataset.getSeriesCount());
        assertEquals(2, dataset.getCategoryCount());
    }

    @Test
    public void testConstructorWithSeriesAndCategoryKeys() throws Exception {
        Comparable[] seriesKeys = {"S1", "S2"};
        Comparable[] categoryKeys = {"C1", "C2"};
        Number[][] starts = {{1.0, 2.0}, {3.0, 4.0}};
        Number[][] ends = {{5.0, 6.0}, {7.0, 8.0}};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(seriesKeys, categoryKeys, starts, ends);
        assertNotNull(dataset);
        assertEquals("S1", dataset.getSeriesKey(0));
        assertEquals("C1", dataset.getColumnKey(0));
        assertEquals(2, dataset.getSeriesCount());
        assertEquals(2, dataset.getCategoryCount());
    }

    @Test
    public void testConstructorWithEmptyData() throws Exception {
        double[][] starts = {};
        double[][] ends = {};
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        assertNotNull(dataset);
        assertEquals(0, dataset.getSeriesCount());
        assertEquals(0, dataset.getCategoryCount());
    }

    @Test
    public void testConstructorWithMismatchedSeriesCount() throws Exception {
        double[][] starts = {{1.0}, {2.0, 3.0}};
        double[][] ends = {{4.0}, {5.0}};
        try {
            new DefaultIntervalCategoryDataset(starts, ends);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorWithMismatchedCategoryCount() throws Exception {
        double[][] starts = {{1.0, 2.0}, {3.0}};
        double[][] ends = {{4.0, 5.0}, {6.0}};
        try {
            new DefaultIntervalCategoryDataset(starts, ends);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testConstructorWithNullSeriesKeys() throws Exception {
        Comparable[] seriesKeys = null;
        Comparable[] categoryKeys = {"C1", "C2"};
        Number[][] starts = {{1.0, 2.0}};
        Number[][] ends = {{3.0, 4.0}};
        // The constructor handles null seriesKeys by generating them.
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(seriesKeys, categoryKeys, starts, ends);
        assertNotNull(dataset);
        assertEquals(1, dataset.getSeriesCount());
        assertEquals(2, dataset.getCategoryCount());
        assertEquals("Series 1", dataset.getSeriesKey(0)); // Default generated key
    }

    @Test
    public void testConstructorWithNullCategoryKeys() throws Exception {
        Comparable[] seriesKeys = {"S1"};
        Comparable[] categoryKeys = null;
        Number[][] starts = {{1.0, 2.0}};
        Number[][] ends = {{3.0, 4.0}};
        // The constructor handles null categoryKeys by generating them.
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(seriesKeys, categoryKeys, starts, ends);
        assertNotNull(dataset);
        assertEquals(1, dataset.getSeriesCount());
        assertEquals(2, dataset.getCategoryCount());
        assertEquals("Category 1", dataset.getColumnKey(0)); // Default generated key
    }

    @Test
    public void testGetSeriesCount() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        assertEquals(2, dataset.getSeriesCount());
    }

    @Test
    public void testGetSeriesCount_empty() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{},
                new Number[][]{}
        );
        assertEquals(0, dataset.getSeriesCount());
    }

    @Test
    public void testGetSeriesIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1", "S2"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        assertEquals(0, dataset.getSeriesIndex("S1"));
        assertEquals(1, dataset.getSeriesIndex("S2"));
        assertEquals(-1, dataset.getSeriesIndex("S3"));
    }

    @Test
    public void testGetSeriesKey() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1", "S2"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        assertEquals("S1", dataset.getSeriesKey(0));
        assertEquals("S2", dataset.getSeriesKey(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKey_invalidIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getSeriesKey(1);
    }

    @Test
    public void testSetSeriesKeys() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        Comparable[] newKeys = {"NewS1", "NewS2"};
        dataset.setSeriesKeys(newKeys);
        assertEquals("NewS1", dataset.getSeriesKey(0));
        assertEquals("NewS2", dataset.getSeriesKey(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_nullArgument() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        dataset.setSeriesKeys(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeys_mismatchedLength() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        Comparable[] newKeys = {"NewS1"};
        dataset.setSeriesKeys(newKeys);
    }

    @Test
    public void testGetCategoryCount() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0, 2.0}},
                new Number[][]{{3.0, 4.0}}
        );
        assertEquals(2, dataset.getCategoryCount());
    }

    @Test
    public void testGetCategoryCount_emptySeries() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{},
                new Number[][]{}
        );
        assertEquals(0, dataset.getCategoryCount());
    }

    @Test
    public void testGetColumnKeys() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1", "C2"},
                new Number[][]{{1.0, 2.0}},
                new Number[][]{{3.0, 4.0}}
        );
        List keys = dataset.getColumnKeys();
        assertEquals(2, keys.size());
        assertTrue(keys.contains("C1"));
        assertTrue(keys.contains("C2"));
    }
    
    @Test
    public void testGetColumnKeys_empty() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{},
                new Number[][]{{}},
                new Number[][]{{}}
        );
        List keys = dataset.getColumnKeys();
        assertEquals(0, keys.size());
    }

    @Test
    public void testSetCategoryKeys() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0, 2.0}},
                new Number[][]{{3.0, 4.0}}
        );
        Comparable[] newKeys = {"NewC1", "NewC2"};
        dataset.setCategoryKeys(newKeys);
        assertEquals("NewC1", dataset.getColumnKey(0));
        assertEquals("NewC2", dataset.getColumnKey(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_nullArgument() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0, 2.0}},
                new Number[][]{{3.0, 4.0}}
        );
        dataset.setCategoryKeys(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_mismatchedLength() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0, 2.0}},
                new Number[][]{{3.0, 4.0}}
        );
        Comparable[] newKeys = {"NewC1"};
        dataset.setCategoryKeys(newKeys);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeys_nullElement() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0, 2.0}},
                new Number[][]{{3.0, 4.0}}
        );
        Comparable[] newKeys = {"NewC1", null};
        dataset.setCategoryKeys(newKeys);
    }


    @Test
    public void testGetValue_Comparable() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        assertEquals(3.0, dataset.getValue("S1", "C1").doubleValue(), 0.00001);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValue_Comparable_unknownSeries() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getValue("S2", "C1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValue_Comparable_unknownCategory() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getValue("S1", "C2");
    }

    @Test
    public void testGetValue_int() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        assertEquals(4.0, dataset.getValue(1, 0).doubleValue(), 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_int_invalidSeriesIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getValue(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_int_invalidCategoryIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getValue(0, 1);
    }

    @Test
    public void testGetStartValue_Comparable() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        assertEquals(1.0, dataset.getStartValue("S1", "C1").doubleValue(), 0.00001);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetStartValue_Comparable_unknownSeries() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getStartValue("S2", "C1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetStartValue_Comparable_unknownCategory() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getStartValue("S1", "C2");
    }

    @Test
    public void testGetStartValue_int() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        assertEquals(2.0, dataset.getStartValue(1, 0).doubleValue(), 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_int_invalidSeriesIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getStartValue(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValue_int_invalidCategoryIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getStartValue(0, 1);
    }

    @Test
    public void testGetEndValue_Comparable() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        assertEquals(3.0, dataset.getEndValue("S1", "C1").doubleValue(), 0.00001);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetEndValue_Comparable_unknownSeries() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getEndValue("S2", "C1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetEndValue_Comparable_unknownCategory() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getEndValue("S1", "C2");
    }

    @Test
    public void testGetEndValue_int() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        assertEquals(3.0, dataset.getEndValue(0, 0).doubleValue(), 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_int_invalidSeriesIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getEndValue(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValue_int_invalidCategoryIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getEndValue(0, 1);
    }

    @Test
    public void testSetStartValue() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.setStartValue(0, "C1", 5.0);
        assertEquals(5.0, dataset.getStartValue(0, 0).doubleValue(), 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_invalidSeriesIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.setStartValue(1, "C1", 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValue_unrecognisedCategory() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.setStartValue(0, "C2", 5.0);
    }

    @Test
    public void testSetEndValue() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.setEndValue(0, "C1", 5.0);
        assertEquals(5.0, dataset.getEndValue(0, 0).doubleValue(), 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_invalidSeriesIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.setEndValue(1, "C1", 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValue_unrecognisedCategory() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.setEndValue(0, "C2", 5.0);
    }

    @Test
    public void testGetCategoryIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1", "C2"},
                new Number[][]{{1.0, 2.0}},
                new Number[][]{{3.0, 4.0}}
        );
        assertEquals(0, dataset.getCategoryIndex("C1"));
        assertEquals(1, dataset.getCategoryIndex("C2"));
        assertEquals(-1, dataset.getCategoryIndex("C3"));
    }

    @Test
    public void testGetColumnKey() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1", "C2"},
                new Number[][]{{1.0, 2.0}},
                new Number[][]{{3.0, 4.0}}
        );
        assertEquals("C1", dataset.getColumnKey(0));
        assertEquals("C2", dataset.getColumnKey(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetColumnKey_invalidIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getColumnKey(1);
    }

    @Test
    public void testGetColumnIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1", "C2"},
                new Number[][]{{1.0, 2.0}},
                new Number[][]{{3.0, 4.0}}
        );
        assertEquals(0, dataset.getColumnIndex("C1"));
        assertEquals(1, dataset.getColumnIndex("C2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndex_nullKey() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getColumnIndex(null);
    }

    @Test
    public void testGetRowIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1", "S2"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        assertEquals(0, dataset.getRowIndex("S1"));
        assertEquals(1, dataset.getRowIndex("S2"));
        assertEquals(-1, dataset.getRowIndex("S3"));
    }

    @Test
    public void testGetRowKeys() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1", "S2"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        List keys = dataset.getRowKeys();
        assertEquals(2, keys.size());
        assertTrue(keys.contains("S1"));
        assertTrue(keys.contains("S2"));
    }

    @Test
    public void testGetRowKey() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1", "S2"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        assertEquals("S1", dataset.getRowKey(0));
        assertEquals("S2", dataset.getRowKey(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKey_invalidIndex() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        dataset.getRowKey(1);
    }

    @Test
    public void testGetColumnCount() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1", "C2"},
                new Number[][]{{1.0, 2.0}},
                new Number[][]{{3.0, 4.0}}
        );
        assertEquals(2, dataset.getColumnCount());
    }
    
    @Test
    public void testGetColumnCount_empty() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{},
                new Number[][]{{}},
                new Number[][]{{}}
        );
        assertEquals(0, dataset.getColumnCount());
    }

    @Test
    public void testGetRowCount() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1", "S2"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}, {2.0}},
                new Number[][]{{3.0}, {4.0}}
        );
        assertEquals(2, dataset.getRowCount());
    }
    
    @Test
    public void testGetRowCount_empty() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{},
                new Comparable[]{"C1"},
                new Number[][]{},
                new Number[][]{}
        );
        assertEquals(0, dataset.getRowCount());
    }

    @Test
    public void testEquals_sameObject() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        assertTrue(dataset.equals(dataset));
    }

    @Test
    public void testEquals_differentObject() throws Exception {
        DefaultIntervalCategoryDataset dataset1 = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        DefaultIntervalCategoryDataset dataset2 = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        assertTrue(dataset1.equals(dataset2));
    }

    @Test
    public void testEquals_differentSeriesKeys() throws Exception {
        DefaultIntervalCategoryDataset dataset1 = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        DefaultIntervalCategoryDataset dataset2 = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S2"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    public void testEquals_differentCategoryKeys() throws Exception {
        DefaultIntervalCategoryDataset dataset1 = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        DefaultIntervalCategoryDataset dataset2 = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C2"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    public void testEquals_differentStartData() throws Exception {
        DefaultIntervalCategoryDataset dataset1 = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        DefaultIntervalCategoryDataset dataset2 = new DefaultIntervalCategoryDataset(
                new Number[][]{{2.0}},
                new Number[][]{{3.0}}
        );
        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    public void testEquals_differentEndData() throws Exception {
        DefaultIntervalCategoryDataset dataset1 = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        DefaultIntervalCategoryDataset dataset2 = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{4.0}}
        );
        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    public void testEquals_nullObject() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        assertFalse(dataset.equals(null));
    }

    @Test
    public void testEquals_wrongType() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        assertFalse(dataset.equals("string"));
    }

    @Test
    public void testClone() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        DefaultIntervalCategoryDataset clonedDataset = (DefaultIntervalCategoryDataset) dataset.clone();
        assertTrue(dataset.equals(clonedDataset));
        assertNotSame(dataset, clonedDataset);
    }

    @Test
    public void testClone_modifyingCloneDoesNotAffectOriginal() throws Exception {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(
                new Comparable[]{"S1"},
                new Comparable[]{"C1"},
                new Number[][]{{1.0}},
                new Number[][]{{3.0}}
        );
        DefaultIntervalCategoryDataset clonedDataset = (DefaultIntervalCategoryDataset) dataset.clone();
        clonedDataset.setStartValue(0, "C1", 5.0);
        assertEquals(1.0, dataset.getStartValue(0, 0).doubleValue(), 0.00001);
        assertEquals(5.0, clonedDataset.getStartValue(0, 0).doubleValue(), 0.00001);
    }
}
