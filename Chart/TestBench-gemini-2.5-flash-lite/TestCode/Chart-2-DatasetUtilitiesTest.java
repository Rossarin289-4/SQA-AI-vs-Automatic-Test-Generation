package org.jfree.data.general;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.pie.DefaultPieDataset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jfree.chart.util.ArrayUtilities;
import org.jfree.data.DomainInfo;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.KeyedValues;
import org.jfree.data.Range;
import org.jfree.data.RangeInfo;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryRangeInfo;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.function.Function2D;
import org.jfree.data.statistics.BoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.BoxAndWhiskerXYDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.statistics.MultiValueCategoryDataset;
import org.jfree.data.statistics.StatisticalCategoryDataset;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.OHLCDataset;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYDomainInfo;
import org.jfree.data.xy.XYRangeInfo;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class DatasetUtilitiesTest {

    @Test
    public void testCalculatePieDatasetTotal_basic() throws Exception {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", 20.0);
        dataset.setValue("C", 30.0);
        assertEquals(60.0, DatasetUtilities.calculatePieDatasetTotal(dataset), 0.0000001);
    }

    @Test
    public void testCalculatePieDatasetTotal_withNullValues() throws Exception {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", null);
        dataset.setValue("C", 30.0);
        assertEquals(40.0, DatasetUtilities.calculatePieDatasetTotal(dataset), 0.0000001);
    }

    @Test
    public void testCalculatePieDatasetTotal_withNegativeValues() throws Exception {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", -5.0);
        dataset.setValue("C", 30.0);
        assertEquals(40.0, DatasetUtilities.calculatePieDatasetTotal(dataset), 0.0000001);
    }

    @Test
    public void testCalculatePieDatasetTotal_emptyDataset() throws Exception {
        DefaultPieDataset dataset = new DefaultPieDataset();
        assertEquals(0.0, DatasetUtilities.calculatePieDatasetTotal(dataset), 0.0000001);
    }

    @Test
    public void testCalculatePieDatasetTotal_nullDataset() {
        try {
            DatasetUtilities.calculatePieDatasetTotal(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testCreatePieDatasetForRow_byKey() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(5.0, "Row2", "Col1");
        dataset.addValue(15.0, "Row2", "Col2");

        PieDataset pieDataset = DatasetUtilities.createPieDatasetForRow(dataset, "Row1");
        assertEquals(2, pieDataset.getItemCount());
        assertEquals(10.0, pieDataset.getValue("Col1").doubleValue(), 0.0000001);
        assertEquals(20.0, pieDataset.getValue("Col2").doubleValue(), 0.0000001);
    }

    @Test
    public void testCreatePieDatasetForColumn_byKey() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(5.0, "Row2", "Col1");
        dataset.addValue(15.0, "Row2", "Col2");

        PieDataset pieDataset = DatasetUtilities.createPieDatasetForColumn(dataset, "Col1");
        assertEquals(2, pieDataset.getItemCount());
        assertEquals(10.0, pieDataset.getValue("Row1").doubleValue(), 0.0000001);
        assertEquals(5.0, pieDataset.getValue("Row2").doubleValue(), 0.0000001);
    }

    @Test
    public void testCreateConsolidatedPieDataset_basic() throws Exception {
        DefaultPieDataset source = new DefaultPieDataset();
        source.setValue("A", 10.0); // 10/31 = 0.32
        source.setValue("B", 2.0);  // 2/31 = 0.064 (less than 0.1)
        source.setValue("C", 3.0);  // 3/31 = 0.096 (less than 0.1)
        source.setValue("D", 15.0); // 15/31 = 0.48
        source.setValue("E", 1.0);  // 1/31 = 0.032 (less than 0.1)
        // Total = 31.0
        // Keys to aggregate: B, C, E. Count = 3 >= minItems (2)
        // Aggregate value = 2.0 + 3.0 + 1.0 = 6.0

        PieDataset consolidated = DatasetUtilities.createConsolidatedPieDataset(source, "Other", 0.1, 2);
        assertEquals(4, consolidated.getItemCount());
        assertEquals(10.0, consolidated.getValue("A").doubleValue(), 0.0000001);
        assertEquals(15.0, consolidated.getValue("D").doubleValue(), 0.0000001);
        assertEquals(6.0, consolidated.getValue("Other").doubleValue(), 0.0000001); // B (2) + C (3) + E (1) = 6
        // The test was expecting '3.0' for 'Other', which was the sum of C and E, but B should also be included.
        // The actual value derived from the source and logic is 6.0.
    }

    @Test
    public void testCreateConsolidatedPieDataset_minItemsNotMet() throws Exception {
        DefaultPieDataset source = new DefaultPieDataset();
        source.setValue("A", 10.0);
        source.setValue("B", 2.0); // below 10% threshold
        source.setValue("C", 3.0); // below 10% threshold

        PieDataset consolidated = DatasetUtilities.createConsolidatedPieDataset(source, "Other", 0.1, 3); // minItems = 3
        assertEquals(3, consolidated.getItemCount()); // "Other" should not be created
        assertEquals(10.0, consolidated.getValue("A").doubleValue(), 0.0000001);
        assertEquals(2.0, consolidated.getValue("B").doubleValue(), 0.0000001);
        assertEquals(3.0, consolidated.getValue("C").doubleValue(), 0.0000001);
    }
    
    @Test
    public void testCreateCategoryDataset_doubleArrayWithPrefixes() throws Exception {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("R", "C", data);
        assertEquals(2, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
        assertEquals(1.0, dataset.getValue("R1", "C1").doubleValue(), 0.0000001);
        assertEquals(2.0, dataset.getValue("R1", "C2").doubleValue(), 0.0000001);
        assertEquals(3.0, dataset.getValue("R2", "C1").doubleValue(), 0.0000001);
        assertEquals(4.0, dataset.getValue("R2", "C2").doubleValue(), 0.0000001);
    }

    @Test
    public void testCreateCategoryDataset_numberArrayWithPrefixes() throws Exception {
        Number[][] data = {{1, 2}, {3, 4}};
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("R", "C", data);
        assertEquals(2, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
        assertEquals(1.0, dataset.getValue("R1", "C1").doubleValue(), 0.0000001);
        assertEquals(2.0, dataset.getValue("R1", "C2").doubleValue(), 0.0000001);
        assertEquals(3.0, dataset.getValue("R2", "C1").doubleValue(), 0.0000001);
        assertEquals(4.0, dataset.getValue("R2", "C2").doubleValue(), 0.0000001);
    }

    @Test
    public void testCreateCategoryDataset_withKeysAndDoubleArray() throws Exception {
        Comparable[] rowKeys = {"R1", "R2"};
        Comparable[] colKeys = {"C1", "C2"};
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, colKeys, data);
        assertEquals(2, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
        assertEquals(1.0, dataset.getValue("R1", "C1").doubleValue(), 0.0000001);
        assertEquals(2.0, dataset.getValue("R1", "C2").doubleValue(), 0.0000001);
        assertEquals(3.0, dataset.getValue("R2", "C1").doubleValue(), 0.0000001);
        assertEquals(4.0, dataset.getValue("R2", "C2").doubleValue(), 0.0000001);
    }

    @Test
    public void testCreateCategoryDataset_withKeysAndDoubleArray_mismatchedRows() {
        Comparable[] rowKeys = {"R1"};
        Comparable[] colKeys = {"C1", "C2"};
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        try {
            DatasetUtilities.createCategoryDataset(rowKeys, colKeys, data);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testCreateCategoryDataset_withKeysAndDoubleArray_mismatchedCols() {
        Comparable[] rowKeys = {"R1", "R2"};
        Comparable[] colKeys = {"C1"};
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        try {
            DatasetUtilities.createCategoryDataset(rowKeys, colKeys, data);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testCreateCategoryDataset_fromKeyedValues() throws Exception {
        DefaultPieDataset rowData = new DefaultPieDataset(); // Using DefaultPieDataset as KeyedValues
        rowData.setValue("Col1", 10.0);
        rowData.setValue("Col2", 20.0);
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("Row1", rowData);
        assertEquals(1, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
        assertEquals(10.0, dataset.getValue("Row1", "Col1").doubleValue(), 0.0000001);
        assertEquals(20.0, dataset.getValue("Row1", "Col2").doubleValue(), 0.0000001);
    }
    
    @Test
    public void testSampleFunction2D_basic() throws Exception {
        Function2D func = new Function2D() {
            @Override
            public double getValue(double x) {
                return x * x;
            }
        };
        XYDataset dataset = DatasetUtilities.sampleFunction2D(func, 0.0, 10.0, 5, "Series1");
        assertEquals(1, dataset.getSeriesCount());
        assertEquals(5, dataset.getItemCount(0));
        assertEquals(0.0, dataset.getXValue(0, 0), 0.0000001);
        assertEquals(0.0, dataset.getYValue(0, 0), 0.0000001);
        assertEquals(2.5, dataset.getXValue(0, 1), 0.0000001);
        assertEquals(6.25, dataset.getYValue(0, 1), 0.0000001);
        assertEquals(10.0, dataset.getXValue(0, 4), 0.0000001);
        assertEquals(100.0, dataset.getYValue(0, 4), 0.0000001);
    }

    @Test
    public void testSampleFunction2DToSeries_basic() throws Exception {
        Function2D func = new Function2D() {
            @Override
            public double getValue(double x) {
                return x + 5;
            }
        };
        XYSeries series = DatasetUtilities.sampleFunction2DToSeries(func, 1.0, 3.0, 3, "Series1");
        assertEquals(3, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0000001); 
        assertEquals(6.0, series.getY(0).doubleValue(), 0.0000001); 
        assertEquals(2.0, series.getX(1).doubleValue(), 0.0000001); 
        assertEquals(7.0, series.getY(1).doubleValue(), 0.0000001); 
        assertEquals(3.0, series.getX(2).doubleValue(), 0.0000001); 
        assertEquals(8.0, series.getY(2).doubleValue(), 0.0000001); 
    }

    @Test
    public void testIsEmptyOrNull_PieDataset_null() {
        assertTrue(DatasetUtilities.isEmptyOrNull((PieDataset) null));
    }

    @Test
    public void testIsEmptyOrNull_PieDataset_empty() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        assertTrue(DatasetUtilities.isEmptyOrNull(dataset));
    }
    
    @Test
    public void testIsEmptyOrNull_PieDataset_withZeroValues() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 0.0);
        dataset.setValue("B", null);
        assertTrue(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_PieDataset_withPositiveValue() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        assertFalse(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_CategoryDataset_null() {
        assertTrue(DatasetUtilities.isEmptyOrNull((CategoryDataset) null));
    }

    @Test
    public void testIsEmptyOrNull_CategoryDataset_empty() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        assertTrue(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_CategoryDataset_withNullValues() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(null, "Row1", "Col1");
        assertTrue(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_CategoryDataset_withNonNullValue() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        assertFalse(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_XYDataset_null() {
        assertTrue(DatasetUtilities.isEmptyOrNull((XYDataset) null));
    }

    @Test
    public void testIsEmptyOrNull_XYDataset_empty() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        assertTrue(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_XYDataset_withEmptySeries() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(new XYSeries("Series1"));
        assertTrue(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_XYDataset_withNonEmptySeries() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Series1");
        series.add(1, 1);
        dataset.addSeries(series);
        assertFalse(DatasetUtilities.isEmptyOrNull(dataset));
    }
    
    @Test
    public void testFindDomainBounds_basic() throws Exception {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 10.0);
        series.add(3.0, 20.0);
        series.add(5.0, 15.0);
        dataset.addSeries(series);
        Range range = DatasetUtilities.findDomainBounds(dataset);
        assertEquals(1.0, range.getLowerBound(), 0.0000001);
        assertEquals(5.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testIterateDomainBounds_basic() throws Exception {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 10.0);
        series.add(3.0, 20.0);
        series.add(5.0, 15.0);
        dataset.addSeries(series);
        Range range = DatasetUtilities.iterateDomainBounds(dataset);
        assertEquals(1.0, range.getLowerBound(), 0.0000001);
        assertEquals(5.0, range.getUpperBound(), 0.0000001);
    }
    
    @Test
    public void testFindRangeBounds_CategoryDataset_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(5.0, "Row2", "Col1");
        dataset.addValue(15.0, "Row2", "Col2");
        Range range = DatasetUtilities.findRangeBounds(dataset);
        assertEquals(5.0, range.getLowerBound(), 0.0000001);
        assertEquals(20.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testIterateCategoryRangeBounds_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(5.0, "Row2", "Col1");
        dataset.addValue(15.0, "Row2", "Col2");
        Range range = DatasetUtilities.iterateCategoryRangeBounds(dataset, true);
        assertEquals(5.0, range.getLowerBound(), 0.0000001);
        assertEquals(20.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testIterateRangeBounds_CategoryDataset_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(5.0, "Row2", "Col1");
        dataset.addValue(15.0, "Row2", "Col2");
        Range range = DatasetUtilities.iterateRangeBounds(dataset);
        assertEquals(5.0, range.getLowerBound(), 0.0000001);
        assertEquals(20.0, range.getUpperBound(), 0.0000001);
    }
    
    @Test
    public void testIterateRangeBounds_XYDataset_basic() throws Exception {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 10.0);
        series.add(3.0, 20.0);
        series.add(5.0, 15.0);
        dataset.addSeries(series);
        Range range = DatasetUtilities.iterateRangeBounds(dataset);
        assertEquals(10.0, range.getLowerBound(), 0.0000001);
        assertEquals(20.0, range.getUpperBound(), 0.0000001);
    }
    
    @Test
    public void testIterateDomainBounds_XYDataset_basic() throws Exception {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 10.0);
        series.add(3.0, 20.0);
        series.add(5.0, 15.0);
        dataset.addSeries(series);
        Range range = DatasetUtilities.iterateDomainBounds(dataset);
        assertEquals(1.0, range.getLowerBound(), 0.0000001);
        assertEquals(5.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testIterateToFindDomainBounds_XYDataset_basic() throws Exception {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series1 = new XYSeries("Series1");
        series1.add(1.0, 10.0); series1.add(3.0, 20.0);
        XYSeries series2 = new XYSeries("Series2");
        series2.add(2.0, 5.0); series2.add(4.0, 15.0);
        dataset.addSeries(series1); dataset.addSeries(series2);

        List<Comparable> visibleSeries = new ArrayList<>();
        visibleSeries.add("Series1"); visibleSeries.add("Series2");
        Range range = DatasetUtilities.iterateToFindDomainBounds(dataset, visibleSeries, false);
        assertEquals(1.0, range.getLowerBound(), 0.0000001);
        assertEquals(4.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testFindMinimumDomainValue_basic() throws Exception {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 10.0);
        series.add(3.0, 20.0);
        series.add(5.0, 15.0);
        dataset.addSeries(series);
        Number min = DatasetUtilities.findMinimumDomainValue(dataset);
        assertEquals(1.0, min.doubleValue(), 0.0000001);
    }

    @Test
    public void testFindMaximumDomainValue_basic() throws Exception {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 10.0);
        series.add(3.0, 20.0);
        series.add(5.0, 15.0);
        dataset.addSeries(series);
        Number max = DatasetUtilities.findMaximumDomainValue(dataset);
        assertEquals(5.0, max.doubleValue(), 0.0000001);
    }
    
    @Test
    public void testFindMinimumRangeValue_CategoryDataset_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(5.0, "Row2", "Col1");
        dataset.addValue(15.0, "Row2", "Col2");
        Number min = DatasetUtilities.findMinimumRangeValue(dataset);
        assertEquals(5.0, min.doubleValue(), 0.0000001);
    }

    @Test
    public void testFindMinimumRangeValue_XYDataset_basic() throws Exception {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 10.0);
        series.add(3.0, 20.0);
        series.add(5.0, 15.0);
        dataset.addSeries(series);
        Number min = DatasetUtilities.findMinimumRangeValue(dataset);
        assertEquals(10.0, min.doubleValue(), 0.0000001);
    }
    
    @Test
    public void testFindMaximumRangeValue_CategoryDataset_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(5.0, "Row2", "Col1");
        dataset.addValue(15.0, "Row2", "Col2");
        Number max = DatasetUtilities.findMaximumRangeValue(dataset);
        assertEquals(20.0, max.doubleValue(), 0.0000001);
    }

    @Test
    public void testFindMaximumRangeValue_XYDataset_basic() throws Exception {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 10.0);
        series.add(3.0, 20.0);
        series.add(5.0, 15.0);
        dataset.addSeries(series);
        Number max = DatasetUtilities.findMaximumRangeValue(dataset);
        assertEquals(20.0, max.doubleValue(), 0.0000001);
    }
    
    @Test
    public void testFindStackedRangeBounds_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1"); // Col1: 10
        dataset.addValue(5.0, "Row2", "Col1");  // Col1: 5
        dataset.addValue(-3.0, "Row3", "Col1"); // Col1: -3
        dataset.addValue(2.0, "Row1", "Col2");  // Col2: 2
        dataset.addValue(-4.0, "Row2", "Col2"); // Col2: -4
        dataset.addValue(1.0, "Row3", "Col2");  // Col2: 1

        // For Col1: positive sum = 10 + 5 = 15; negative sum = -3.
        // For Col2: positive sum = 2 + 1 = 3; negative sum = -4.
        // Overall minimum = min(-3, -4) = -4.0
        // Overall maximum = max(15, 3) = 15.0
        Range range = DatasetUtilities.findStackedRangeBounds(dataset);
        assertEquals(-4.0, range.getLowerBound(), 0.0000001);
        assertEquals(15.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testFindStackedRangeBounds_withBase() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1"); // Col1: 10
        dataset.addValue(-3.0, "Row2", "Col1"); // Col1: -3
        Range range = DatasetUtilities.findStackedRangeBounds(dataset, 5.0); // base is 5.0
        // Col1: positive sum = 5.0 + 10.0 = 15.0
        // Col1: negative sum = 5.0 + (-3.0) = 2.0
        // Overall minimum = 2.0
        // Overall maximum = 15.0
        assertEquals(2.0, range.getLowerBound(), 0.0000001); 
        assertEquals(15.0, range.getUpperBound(), 0.0000001); 
    }

    @Test
    public void testFindMinimumStackedRangeValue_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1"); // Col1: 10
        dataset.addValue(5.0, "Row2", "Col1");  // Col1: 5
        dataset.addValue(-3.0, "Row3", "Col1"); // Col1: -3
        dataset.addValue(2.0, "Row1", "Col2");  // Col2: 2
        dataset.addValue(-4.0, "Row2", "Col2"); // Col2: -4
        dataset.addValue(1.0, "Row3", "Col2");  // Col2: 1

        // For Col1, negative total = -3.0
        // For Col2, negative total = -4.0
        // Minimum stacked value is -4.0.
        Number min = DatasetUtilities.findMinimumStackedRangeValue(dataset);
        assertEquals(-4.0, min.doubleValue(), 0.0000001);
    }

    @Test
    public void testFindMaximumStackedRangeValue_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1"); // Col1: 10
        dataset.addValue(5.0, "Row2", "Col1");  // Col1: 5
        dataset.addValue(-3.0, "Row3", "Col1"); // Col1: -3
        dataset.addValue(2.0, "Row1", "Col2");  // Col2: 2
        dataset.addValue(-4.0, "Row2", "Col2"); // Col2: -4
        dataset.addValue(1.0, "Row3", "Col2");  // Col2: 1

        // For Col1, positive total = 10.0 + 5.0 = 15.0
        // For Col2, positive total = 2.0 + 1.0 = 3.0
        // Maximum stacked value is 15.0.
        Number max = DatasetUtilities.findMaximumStackedRangeValue(dataset);
        assertEquals(15.0, max.doubleValue(), 0.0000001);
    }
    
    @Test
    public void testFindCumulativeRangeBounds_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1"); // Row1: 10
        dataset.addValue(5.0, "Row1", "Col2");  // Row1: 10+5=15
        dataset.addValue(-3.0, "Row1", "Col3"); // Row1: 15-3=12
        dataset.addValue(2.0, "Row2", "Col1");  // Row2: 2
        dataset.addValue(-4.0, "Row2", "Col2"); // Row2: 2-4=-2
        dataset.addValue(1.0, "Row2", "Col3");  // Row2: -2+1=-1

        // Row1 cumulative values: 10, 15, 12. Min=0, Max=15
        // Row2 cumulative values: 2, -2, -1. Min=-2, Max=2
        // Combined range min = min(0, -2) = -2.0
        // Combined range max = max(15, 2) = 15.0
        Range range = DatasetUtilities.findCumulativeRangeBounds(dataset);
        assertEquals(-2.0, range.getLowerBound(), 0.0000001);
        assertEquals(15.0, range.getUpperBound(), 0.0000001);
    }
    
    @Test
    public void testFindCumulativeRangeBounds_allNulls() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(null, "Row1", "Col1");
        dataset.addValue(null, "Row1", "Col2");
        Range range = DatasetUtilities.findCumulativeRangeBounds(dataset);
        assertNull(range);
    }
    
    @Test
    public void testFindCumulativeRangeBounds_withNaN() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1"); // Row1: 10
        dataset.addValue(Double.NaN, "Row1", "Col2"); // Row1: NaN, total remains 10
        dataset.addValue(5.0, "Row1", "Col3");  // Row1: 10+5=15

        // Row1 cumulative values: 10, 10, 15. Min=0, Max=15
        Range range = DatasetUtilities.findCumulativeRangeBounds(dataset);
        assertEquals(0.0, range.getLowerBound(), 0.0000001); 
        assertEquals(15.0, range.getUpperBound(), 0.0000001); 
    }

}
