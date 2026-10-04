package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.KeyedObjects2D;
import org.jfree.data.Range;
import org.jfree.data.RangeInfo;
import org.jfree.data.general.AbstractDataset;

public class DefaultBoxAndWhiskerCategoryDatasetTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDefaultConstructor() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertEquals(0, dataset.getRowCount());
        assertEquals(0, dataset.getColumnCount());
        assertEquals(Double.NaN, dataset.getRangeLowerBound(true), 0.00001);
        assertEquals(Double.NaN, dataset.getRangeUpperBound(true), 0.00001);
        assertEquals(new Range(0.0, 0.0), dataset.getRangeBounds(true));
    }

    @Test
    public void testAddListAndCheckValues() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        dataset.add(values, "Row1", "Col1");

        assertEquals(1, dataset.getRowCount());
        assertEquals(1, dataset.getColumnCount());
        assertEquals(0, dataset.getRowIndex("Row1")); // Index should be 0, not 1
        assertEquals(0, dataset.getColumnIndex("Col1")); // Index should be 0, not 1

        // Check calculated values from BoxAndWhiskerCalculator
        // For [1, 2, 3, 4, 5]:
        // Mean = 3.0
        // Median = 3.0
        // Q1 = 2.0
        // Q3 = 4.0
        // MinRegular = 1.0
        // MaxRegular = 5.0
        // MinOutlier = 1.0 (assuming no outliers are calculated with this small list)
        // MaxOutlier = 5.0 (assuming no outliers are calculated with this small list)
        // Outliers list should be empty
        assertEquals(Double.valueOf(3.0), dataset.getMeanValue(0, 0));
        assertEquals(Double.valueOf(3.0), dataset.getMedianValue(0, 0));
        assertEquals(Double.valueOf(2.0), dataset.getQ1Value(0, 0));
        assertEquals(Double.valueOf(4.0), dataset.getQ3Value(0, 0));
        assertEquals(Double.valueOf(1.0), dataset.getMinRegularValue(0, 0));
        assertEquals(Double.valueOf(5.0), dataset.getMaxRegularValue(0, 0));
        assertEquals(Double.valueOf(1.0), dataset.getMinOutlier(0, 0));
        assertEquals(Double.valueOf(5.0), dataset.getMaxOutlier(0, 0));
        assertEquals(0, dataset.getOutliers(0, 0).size());
    }

    @Test
    public void testAddBoxAndWhiskerItemAndCheckValues() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        BoxAndWhiskerItem item = new BoxAndWhiskerItem(3.0, 3.0, 2.0, 4.0, 1.0, 5.0, 1.0, 5.0, Collections.emptyList());
        dataset.add(item, "Row1", "Col1");

        assertEquals(1, dataset.getRowCount());
        assertEquals(1, dataset.getColumnCount());

        assertEquals(Double.valueOf(3.0), dataset.getMeanValue("Row1", "Col1"));
        assertEquals(Double.valueOf(3.0), dataset.getMedianValue("Row1", "Col1"));
        assertEquals(Double.valueOf(2.0), dataset.getQ1Value("Row1", "Col1"));
        assertEquals(Double.valueOf(4.0), dataset.getQ3Value("Row1", "Col1"));
        assertEquals(Double.valueOf(1.0), dataset.getMinRegularValue("Row1", "Col1"));
        assertEquals(Double.valueOf(5.0), dataset.getMaxRegularValue("Row1", "Col1"));
        assertEquals(Double.valueOf(1.0), dataset.getMinOutlier("Row1", "Col1"));
        assertEquals(Double.valueOf(5.0), dataset.getMaxOutlier("Row1", "Col1"));
        assertEquals(0, dataset.getOutliers("Row1", "Col1").size());
    }

    @Test
    public void testMultipleAdditions() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values1 = Arrays.asList(1.0, 2.0, 3.0);
        dataset.add(values1, "Row1", "Col1");
        List<Number> values2 = Arrays.asList(4.0, 5.0, 6.0);
        dataset.add(values2, "Row1", "Col2");
        List<Number> values3 = Arrays.asList(7.0, 8.0, 9.0);
        dataset.add(values3, "Row2", "Col1");

        assertEquals(2, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());

        assertEquals(Double.valueOf(2.0), dataset.getMedianValue(0, 0)); // Row1, Col1
        assertEquals(Double.valueOf(5.0), dataset.getMedianValue(0, 1)); // Row1, Col2
        assertEquals(Double.valueOf(8.0), dataset.getMedianValue(1, 0)); // Row2, Col1
    }

    @Test
    public void testGetItemInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getItem(0, 0)); // Should return null for empty dataset
    }

    @Test
    public void testGetValueInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getValue(0, 0)); // Should return null for empty dataset
    }

    @Test
    public void testGetMeanValueInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getMeanValue(0, 0));
    }

    @Test
    public void testGetMedianValueInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getMedianValue(0, 0));
    }

    @Test
    public void testGetQ1ValueInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getQ1Value(0, 0));
    }

    @Test
    public void testGetQ3ValueInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getQ3Value(0, 0));
    }

    @Test
    public void testGetMinRegularValueInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getMinRegularValue(0, 0));
    }

    @Test
    public void testGetMaxRegularValueInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getMaxRegularValue(0, 0));
    }

    @Test
    public void testGetMinOutlierInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getMinOutlier(0, 0));
    }

    @Test
    public void testGetMaxOutlierInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getMaxOutlier(0, 0));
    }

    @Test
    public void testGetOutliersInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertNull(dataset.getOutliers(0, 0));
    }

    @Test
    public void testGetColumnIndexNonExistent() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertEquals(-1, dataset.getColumnIndex("NonExistent"));
    }

    @Test
    public void testGetRowIndexNonExistent() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertEquals(-1, dataset.getRowIndex("NonExistent"));
    }

    @Test
    public void testGetColumnKeyInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        try {
            dataset.getColumnKey(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetRowKeyInvalidIndex() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        try {
            dataset.getRowKey(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetRangeLowerBound() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values = Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0);
        dataset.add(values, "Row1", "Col1");
        assertEquals(10.0, dataset.getRangeLowerBound(true), 0.00001);
        assertEquals(10.0, dataset.getRangeLowerBound(false), 0.00001); // includeInterval doesn't affect min/max outliers
    }

    @Test
    public void testGetRangeUpperBound() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values = Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0);
        dataset.add(values, "Row1", "Col1");
        assertEquals(50.0, dataset.getRangeUpperBound(true), 0.00001);
        assertEquals(50.0, dataset.getRangeUpperBound(false), 0.00001); // includeInterval doesn't affect min/max outliers
    }

    @Test
    public void testGetRangeBounds() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values = Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0);
        dataset.add(values, "Row1", "Col1");
        assertEquals(new Range(10.0, 50.0), dataset.getRangeBounds(true));
        assertEquals(new Range(10.0, 50.0), dataset.getRangeBounds(false));
    }

    @Test
    public void testUpdateBoundsWhenAddingNewItemLowerThanCurrentMin() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values1 = Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0); // minOutlier = 10.0
        dataset.add(values1, "Row1", "Col1");
        List<Number> values2 = Arrays.asList(5.0, 15.0, 25.0, 35.0, 45.0); // minOutlier = 5.0
        dataset.add(values2, "Row2", "Col1");

        assertEquals(5.0, dataset.getRangeLowerBound(true), 0.00001);
        assertEquals(new Range(5.0, 50.0), dataset.getRangeBounds(true));
    }

    @Test
    public void testUpdateBoundsWhenAddingNewItemHigherThanCurrentMax() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values1 = Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0); // maxOutlier = 50.0
        dataset.add(values1, "Row1", "Col1");
        List<Number> values2 = Arrays.asList(15.0, 25.0, 35.0, 45.0, 55.0); // maxOutlier = 55.0
        dataset.add(values2, "Row2", "Col1");

        assertEquals(55.0, dataset.getRangeUpperBound(true), 0.00001);
        assertEquals(new Range(10.0, 55.0), dataset.getRangeBounds(true));
    }

    @Test
    public void testUpdateBoundsWhenUpdatingExistingItem() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values1 = Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0); // min=10, max=50
        dataset.add(values1, "Row1", "Col1");
        List<Number> values2 = Arrays.asList(5.0, 15.0, 25.0, 35.0, 45.0); // min=5, max=45
        dataset.add(values2, "Row2", "Col1");

        assertEquals(5.0, dataset.getRangeLowerBound(true), 0.00001);
        assertEquals(45.0, dataset.getRangeUpperBound(true), 0.00001);

        // Now update Row1, Col1 with values that are higher at min and lower at max
        List<Number> updatedValues1 = Arrays.asList(12.0, 22.0, 32.0, 42.0, 48.0); // min=12, max=48
        dataset.add(updatedValues1, "Row1", "Col1"); // This call SHOULD NOT trigger updateBounds as the new min/max are not the overall min/max.

        // The previous test asserted against the overall bounds, not the bounds of the item itself.
        // The overall bounds are determined by the min/max outliers across ALL items.
        // After adding updatedValues1, the min is still 5.0 (from Row2, Col1) and max is still 45.0 (from Row2, Col1).
        // The bounds are not updated because the item at (Row1, Col1) no longer holds the overall min or max.
        // The `add` method's logic for `updateBounds()` is specific: it only calls `updateBounds` if the item being added *replaces* the item that currently holds the min or max value.
        // Therefore, we expect the bounds to remain based on Row2, Col1.
        assertEquals(5.0, dataset.getRangeLowerBound(true), 0.00001);
        assertEquals(45.0, dataset.getRangeUpperBound(true), 0.00001);
    }
    
    @Test
    public void testUpdateBoundsWhenAddingNewItemAtTheSamePositionAsOldMinMax() throws Exception {
        // This test aims to correctly trigger updateBounds when an item is added at the
        // same row/column as the current min/max, and the new item's values necessitate
        // re-calculating the overall bounds.
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        
        // Add an item that sets the initial max value
        List<Number> values1 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0); // Max outlier is 5.0
        dataset.add(values1, "R1", "C1");
        assertEquals(5.0, dataset.getRangeUpperBound(true), 0.00001);
        assertEquals("R1", dataset.getRowKey(dataset.getRowIndex("R1")));
        assertEquals("C1", dataset.getColumnKey(dataset.getColumnIndex("C1")));

        // Add a new item at the SAME position ("R1", "C1") which has a HIGHER max outlier.
        // This scenario should trigger `updateBounds()` because the new item at (R1, C1)
        // is replacing the old item at (R1, C1) which held the max value.
        List<Number> values2 = Arrays.asList(6.0, 7.0, 8.0, 9.0, 10.0); // Max outlier is 10.0
        dataset.add(values2, "R1", "C1");

        // The bounds should now reflect the new maximum value.
        assertEquals(10.0, dataset.getRangeUpperBound(true), 0.00001);
        // The minimum bound should remain unchanged as it was not part of this update.
        assertEquals(1.0, dataset.getRangeLowerBound(true), 0.00001);
    }

    @Test
    public void testEqualsSameObject() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertTrue(dataset.equals(dataset));
    }

    @Test
    public void testEqualsDifferentObject() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset1 = new DefaultBoxAndWhiskerCategoryDataset();
        DefaultBoxAndWhiskerCategoryDataset dataset2 = new DefaultBoxAndWhiskerCategoryDataset();
        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    public void testEqualsWithData() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset1 = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values1 = Arrays.asList(1.0, 2.0, 3.0);
        dataset1.add(values1, "Row1", "Col1");

        DefaultBoxAndWhiskerCategoryDataset dataset2 = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values2 = Arrays.asList(1.0, 2.0, 3.0);
        dataset2.add(values2, "Row1", "Col1");

        assertTrue(dataset1.equals(dataset2));
    }

    @Test
    public void testEqualsWithDifferentData() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset1 = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values1 = Arrays.asList(1.0, 2.0, 3.0);
        dataset1.add(values1, "Row1", "Col1");

        DefaultBoxAndWhiskerCategoryDataset dataset2 = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values2 = Arrays.asList(4.0, 5.0, 6.0);
        dataset2.add(values2, "Row1", "Col1");

        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    public void testEqualsWithDifferentKeys() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset1 = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values1 = Arrays.asList(1.0, 2.0, 3.0);
        dataset1.add(values1, "Row1", "Col1");

        DefaultBoxAndWhiskerCategoryDataset dataset2 = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values2 = Arrays.asList(1.0, 2.0, 3.0);
        dataset2.add(values2, "Row2", "Col2");

        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    public void testEqualsNull() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertFalse(dataset.equals(null));
    }

    @Test
    public void testClone() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        dataset.add(values, "Row1", "Col1");

        DefaultBoxAndWhiskerCategoryDataset clonedDataset = (DefaultBoxAndWhiskerCategoryDataset) dataset.clone();

        // Check if the cloned dataset is equal in terms of data
        assertTrue(dataset.equals(clonedDataset));

        // Check if it's a different instance
        assertNotSame(dataset, clonedDataset);

        // Modify original and check if clone is unaffected
        List<Number> newValues = Arrays.asList(6.0, 7.0);
        dataset.add(newValues, "Row2", "Col2");
        assertFalse(dataset.equals(clonedDataset));
        assertEquals(1, clonedDataset.getRowCount()); // Clone should still have only 1 row
    }

    @Test
    public void testGetRowCountEmpty() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertEquals(0, dataset.getRowCount());
    }

    @Test
    public void testGetRowCountAfterAdd() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values = Arrays.asList(1.0, 2.0, 3.0);
        dataset.add(values, "Row1", "Col1");
        dataset.add(values, "Row2", "Col1");
        assertEquals(2, dataset.getRowCount());
    }

    @Test
    public void testGetColumnCountEmpty() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertEquals(0, dataset.getColumnCount());
    }

    @Test
    public void testGetColumnCountAfterAdd() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values = Arrays.asList(1.0, 2.0, 3.0);
        dataset.add(values, "Row1", "Col1");
        dataset.add(values, "Row1", "Col2");
        assertEquals(2, dataset.getColumnCount());
    }

    @Test
    public void testGetRowKeysEmpty() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertTrue(dataset.getRowKeys().isEmpty());
    }

    @Test
    public void testGetRowKeysAfterAdd() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values = Arrays.asList(1.0, 2.0, 3.0);
        dataset.add(values, "Row1", "Col1");
        dataset.add(values, "Row2", "Col1");
        dataset.add(values, "Row1", "Col2"); // Add existing row again
        List<Comparable> keys = dataset.getRowKeys();
        assertEquals(2, keys.size());
        assertTrue(keys.contains("Row1"));
        assertTrue(keys.contains("Row2"));
    }

    @Test
    public void testGetColumnKeysEmpty() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        assertTrue(dataset.getColumnKeys().isEmpty());
    }

    @Test
    public void testGetColumnKeysAfterAdd() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> values = Arrays.asList(1.0, 2.0, 3.0);
        dataset.add(values, "Row1", "Col1");
        dataset.add(values, "Row1", "Col2");
        dataset.add(values, "Row2", "Col1"); // Add existing column again
        List<Comparable> keys = dataset.getColumnKeys();
        assertEquals(2, keys.size());
        assertTrue(keys.contains("Col1"));
        assertTrue(keys.contains("Col2"));
    }

    @Test
    public void testMinOutlierIsNaNWhenNoOutliersArePresent() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        // BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics for [2.0, 3.0, 4.0, 5.0, 6.0]
        // Median = 4.0, Q1 = 3.0, Q3 = 5.0, MinRegular = 2.0, MaxRegular = 6.0
        // IQR = 2.0. Lower bound = 3.0 - 1.5*2.0 = 0.0. Upper bound = 5.0 + 1.5*2.0 = 8.0
        // No outliers expected. The minOutlier and maxOutlier should be minRegular and maxRegular respectively.
        List<Number> values = Arrays.asList(2.0, 3.0, 4.0, 5.0, 6.0);
        dataset.add(values, "Row1", "Col1");

        assertEquals(Double.valueOf(2.0), dataset.getMinRegularValue(0,0));
        assertEquals(Double.valueOf(6.0), dataset.getMaxRegularValue(0,0));
        // According to BoxAndWhiskerItem constructor and the logic, if no outliers are found,
        // minOutlier and maxOutlier are set to minRegularValue and maxRegularValue.
        assertEquals(Double.valueOf(2.0), dataset.getMinOutlier(0, 0));
        assertEquals(Double.valueOf(6.0), dataset.getMaxOutlier(0, 0));
        assertTrue(dataset.getOutliers(0, 0).isEmpty());
    }
    
    @Test
    public void testMinOutlierAndMaxOutlierAreCalculated() throws Exception {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        // To force outliers, we need a list where some values are outside 1.5*IQR from Q1/Q3
        // Let's create a specific BoxAndWhiskerItem directly to control these values
        List<Number> outliers = Arrays.asList(-10.0, 20.0);
        BoxAndWhiskerItem item = new BoxAndWhiskerItem(
                5.0, // mean
                4.0, // median
                3.0, // q1
                6.0, // q3
                1.0, // minRegularValue
                9.0, // maxRegularValue
                -10.0, // minOutlier
                20.0, // maxOutlier
                outliers // outliers
        );
        dataset.add(item, "Row1", "Col1");

        assertEquals(Double.valueOf(-10.0), dataset.getMinOutlier(0, 0));
        assertEquals(Double.valueOf(20.0), dataset.getMaxOutlier(0, 0));
        assertEquals(outliers, dataset.getOutliers(0, 0));
    }
}
