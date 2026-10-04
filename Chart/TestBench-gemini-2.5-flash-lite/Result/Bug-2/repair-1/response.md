```java
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
import org.jfree.data.KeyedValues2D;
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
import org.jfree.data.xy.DefaultXYSeriesCollection;
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
        source.setValue("A", 10.0);
        source.setValue("B", 2.0);
        source.setValue("C", 3.0);
        source.setValue("D", 15.0);
        source.setValue("E", 1.0);

        PieDataset consolidated = DatasetUtilities.createConsolidatedPieDataset(source, "Other", 0.1, 2);
        assertEquals(4, consolidated.getItemCount());
        assertEquals(10.0, consolidated.getValue("A").doubleValue(), 0.0000001);
        assertEquals(3.0, consolidated.getValue("C").doubleValue(), 0.0000001);
        assertEquals(15.0, consolidated.getValue("D").doubleValue(), 0.0000001);
        assertEquals(3.0, consolidated.getValue("Other").doubleValue(), 0.0000001); // B (2) + E (1) = 3
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
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0000001); // Changed from getX() to getX().doubleValue()
        assertEquals(6.0, series.getY(0).doubleValue(), 0.0000001); // Changed from getY() to getY().doubleValue()
        assertEquals(2.0, series.getX(1).doubleValue(), 0.0000001); // Changed from getX() to getX().doubleValue()
        assertEquals(7.0, series.getY(1).doubleValue(), 0.0000001); // Changed from getY() to getY().doubleValue()
        assertEquals(3.0, series.getX(2).doubleValue(), 0.0000001); // Changed from getX() to getX().doubleValue()
        assertEquals(8.0, series.getY(2).doubleValue(), 0.0000001); // Changed from getY() to getY().doubleValue()
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
    public void testFindDomainBounds_withIntervalXYDataset() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
        Range range = DatasetUtilities.findDomainBounds(dataset, true);
        assertEquals(0.5, range.getLowerBound(), 0.0000001);
        assertEquals(5.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testFindDomainBounds_withIntervalXYDataset_noInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
        Range range = DatasetUtilities.findDomainBounds(dataset, false);
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
    public void testIterateDomainBounds_withIntervalXYDataset() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
        Range range = DatasetUtilities.iterateDomainBounds(dataset, true);
        assertEquals(0.5, range.getLowerBound(), 0.0000001);
        assertEquals(5.0, range.getUpperBound(), 0.0000001);
    }
    
    @Test
    public void testIterateDomainBounds_withIntervalXYDataset_noInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
        Range range = DatasetUtilities.iterateDomainBounds(dataset, false);
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
    public void testFindRangeBounds_CategoryDataset_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Row1", "Row2"},
            new double[][]{{10.0, 12.0}, {20.0, 22.0}}, // y values
            new double[][]{{9.0, 11.0}, {19.0, 21.0}}, // start y values
            new double[][]{{11.0, 13.0}, {21.0, 23.0}}  // end y values
        );
        Range range = DatasetUtilities.findRangeBounds((CategoryDataset)dataset, true); // Cast needed
        assertEquals(9.0, range.getLowerBound(), 0.0000001);
        assertEquals(23.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testFindRangeBounds_CategoryDataset_noInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Row1", "Row2"},
            new double[][]{{10.0, 12.0}, {20.0, 22.0}}, // y values
            new double[][]{{9.0, 11.0}, {19.0, 21.0}}, // start y values
            new double[][]{{11.0, 13.0}, {21.0, 23.0}}  // end y values
        );
        Range range = DatasetUtilities.findRangeBounds((CategoryDataset)dataset, false); // Cast needed
        assertEquals(10.0, range.getLowerBound(), 0.0000001);
        assertEquals(22.0, range.getUpperBound(), 0.0000001);
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
    public void testIterateCategoryRangeBounds_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Row1", "Row2"},
            new double[][]{{10.0, 12.0}, {20.0, 22.0}}, // y values
            new double[][]{{9.0, 11.0}, {19.0, 21.0}}, // start y values
            new double[][]{{11.0, 13.0}, {21.0, 23.0}}  // end y values
        );
        Range range = DatasetUtilities.iterateCategoryRangeBounds((CategoryDataset)dataset, true); // Cast needed
        assertEquals(9.0, range.getLowerBound(), 0.0000001);
        assertEquals(23.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testIterateCategoryRangeBounds_noInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Row1", "Row2"},
            new double[][]{{10.0, 12.0}, {20.0, 22.0}}, // y values
            new double[][]{{9.0, 11.0}, {19.0, 21.0}}, // start y values
            new double[][]{{11.0, 13.0}, {21.0, 23.0}}  // end y values
        );
        Range range = DatasetUtilities.iterateCategoryRangeBounds((CategoryDataset)dataset, false); // Cast needed
        assertEquals(10.0, range.getLowerBound(), 0.0000001);
        assertEquals(22.0, range.getUpperBound(), 0.0000001);
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
    public void testIterateRangeBounds_CategoryDataset_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Row1", "Row2"},
            new double[][]{{10.0, 12.0}, {20.0, 22.0}}, // y values
            new double[][]{{9.0, 11.0}, {19.0, 21.0}}, // start y values
            new double[][]{{11.0, 13.0}, {21.0, 23.0}}  // end y values
        );
        Range range = DatasetUtilities.iterateRangeBounds((CategoryDataset)dataset, true); // Cast needed
        assertEquals(9.0, range.getLowerBound(), 0.0000001);
        assertEquals(23.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testIterateRangeBounds_CategoryDataset_noInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Row1", "Row2"},
            new double[][]{{10.0, 12.0}, {20.0, 22.0}}, // y values
            new double[][]{{9.0, 11.0}, {19.0, 21.0}}, // start y values
            new double[][]{{11.0, 13.0}, {21.0, 23.0}}  // end y values
        );
        Range range = DatasetUtilities.iterateRangeBounds((CategoryDataset)dataset, false); // Cast needed
        assertEquals(10.0, range.getLowerBound(), 0.0000001);
        assertEquals(22.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testIterateToFindRangeBounds_CategoryDataset_withBoxAndWhisker() throws Exception {
        BoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List<Number> data1 = new ArrayList<>();
        data1.add(10.0); data1.add(12.0); data1.add(11.0);
        dataset.add(data1, 10.5, 11.5, 10.0, 12.0, 10.2, 11.8, "Row1", "Col1");

        List<Number> data2 = new ArrayList<>();
        data2.add(20.0); data2.add(22.0); data2.add(21.0);
        dataset.add(data2, 20.5, 21.5, 20.0, 22.0, 20.2, 21.8, "Row1", "Col2");

        List<Comparable> visibleSeries = new ArrayList<>();
        visibleSeries.add("Row1");
        Range range = DatasetUtilities.iterateToFindRangeBounds(dataset, visibleSeries, true);
        assertEquals(10.0, range.getLowerBound(), 0.0000001);
        assertEquals(22.0, range.getUpperBound(), 0.0000001);
    }
    
    @Test
    public void testIterateToFindRangeBounds_CategoryDataset_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Row1", "Row2"},
            new double[][]{{10.0, 12.0}, {20.0, 22.0}}, // y values
            new double[][]{{9.0, 11.0}, {19.0, 21.0}}, // start y values
            new double[][]{{11.0, 13.0}, {21.0, 23.0}}  // end y values
        );
        List<Comparable> visibleSeries = new ArrayList<>();
        visibleSeries.add("Row1");
        Range range = DatasetUtilities.iterateToFindRangeBounds((CategoryDataset)dataset, visibleSeries, true); // Cast needed
        assertEquals(9.0, range.getLowerBound(), 0.0000001);
        assertEquals(13.0, range.getUpperBound(), 0.0000001);
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
    public void testIterateRangeBounds_XYDataset_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
        Range range = DatasetUtilities.iterateRangeBounds(dataset, true);
        assertEquals(0.5, range.getLowerBound(), 0.0000001);
        assertEquals(21.0, range.getUpperBound(), 0.0000001);
    }
    
    @Test
    public void testIterateRangeBounds_XYDataset_withOHLC() throws Exception {
        DefaultOHLCDataset dataset = new DefaultOHLCDataset("Series1", 
            new double[]{1.0, 2.0, 3.0}, new double[]{10.0, 12.0, 14.0}, 
            new double[]{8.0, 11.0, 13.0}, new double[]{9.0, 13.0, 15.0}, 
            new double[]{11.0, 10.0, 12.0}, new double[]{10.0, 10.0, 10.0});
        Range range = DatasetUtilities.iterateRangeBounds(dataset, true);
        assertEquals(8.0, range.getLowerBound(), 0.0000001);
        assertEquals(15.0, range.getUpperBound(), 0.0000001);
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
    public void testIterateDomainBounds_XYDataset_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
        Range range = DatasetUtilities.iterateDomainBounds(dataset, true);
        assertEquals(0.5, range.getLowerBound(), 0.0000001);
        assertEquals(5.0, range.getUpperBound(), 0.0000001);
    }

    @Test
    public void testIterateDomainBounds_XYDataset_noInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
        Range range = DatasetUtilities.iterateDomainBounds(dataset, false);
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
    public void testIterateToFindDomainBounds_XYDataset_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1", "Series2"},
            new double[][]{{1.0, 3.0}, {2.0, 4.0}}, // x values
            new double[][]{{10.0, 20.0}, {5.0, 15.0}}, // y values
            new double[][]{{0.5, 2.5}, {1.5, 3.5}}, // start x values
            new double[][]{{1.5, 3.5}, {2.5, 4.5}}  // end x values
        );
        List<Comparable> visibleSeries = new ArrayList<>();
        visibleSeries.add("Series1"); visibleSeries.add("Series2");
        Range range = DatasetUtilities.iterateToFindDomainBounds(dataset, visibleSeries, true);
        assertEquals(0.5, range.getLowerBound(), 0.0000001);
        assertEquals(4.5, range.getUpperBound(), 0.0000001);
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
    public void testFindMinimumDomainValue_withIntervalXYDataset() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
        Number min = DatasetUtilities.findMinimumDomainValue(dataset);
        assertEquals(0.5, min.doubleValue(), 0.0000001);
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
    public void testFindMaximumDomainValue_withIntervalXYDataset() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
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
    public void testFindMinimumRangeValue_CategoryDataset_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Row1", "Row2"},
            new double[][]{{10.0, 12.0}, {20.0, 22.0}}, // y values
            new double[][]{{9.0, 11.0}, {19.0, 21.0}}, // start y values
            new double[][]{{11.0, 13.0}, {21.0, 23.0}}  // end y values
        );
        Number min = DatasetUtilities.findMinimumRangeValue((CategoryDataset)dataset); // Cast needed
        assertEquals(9.0, min.doubleValue(), 0.0000001);
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
    public void testFindMinimumRangeValue_XYDataset_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
        Number min = DatasetUtilities.findMinimumRangeValue(dataset);
        assertEquals(0.5, min.doubleValue(), 0.0000001);
    }
    
    @Test
    public void testFindMinimumRangeValue_XYDataset_withOHLC() throws Exception {
        DefaultOHLCDataset dataset = new DefaultOHLCDataset("Series1", 
            new double[]{1.0, 2.0, 3.0}, new double[]{10.0, 12.0, 14.0}, 
            new double[]{8.0, 11.0, 13.0}, new double[]{9.0, 13.0, 15.0}, 
            new double[]{11.0, 10.0, 12.0}, new double[]{10.0, 10.0, 10.0});
        Number min = DatasetUtilities.findMinimumRangeValue(dataset);
        assertEquals(8.0, min.doubleValue(), 0.0000001);
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
    public void testFindMaximumRangeValue_CategoryDataset_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Row1", "Row2"},
            new double[][]{{10.0, 12.0}, {20.0, 22.0}}, // y values
            new double[][]{{9.0, 11.0}, {19.0, 21.0}}, // start y values
            new double[][]{{11.0, 13.0}, {21.0, 23.0}}  // end y values
        );
        Number max = DatasetUtilities.findMaximumRangeValue((CategoryDataset)dataset); // Cast needed
        assertEquals(23.0, max.doubleValue(), 0.0000001);
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
    public void testFindMaximumRangeValue_XYDataset_withInterval() throws Exception {
        IntervalXYDataset dataset = new DefaultIntervalXYDataset(
            new Comparable[]{"Series1"},
            new double[][]{{1.0, 3.0, 5.0}, {10.0, 20.0, 15.0}, {0.5, 2.5, 4.5}, {1.5, 21.0, 16.0}}
        );
        Number max = DatasetUtilities.findMaximumRangeValue(dataset);
        assertEquals(21.0, max.doubleValue(), 0.0000001);
    }

    @Test
    public void testFindMaximumRangeValue_XYDataset_withOHLC() throws Exception {
        DefaultOHLCDataset dataset = new DefaultOHLCDataset("Series1", 
            new double[]{1.0, 2.0, 3.0}, new double[]{10.0, 12.0, 14.0}, 
            new double[]{8.0, 11.0, 13.0}, new double[]{9.0, 13.0, 15.0}, 
            new double[]{11.0, 10.0, 12.0}, new double[]{10.0, 10.0, 10.0});
        Number max = DatasetUtilities.findMaximumRangeValue(dataset);
        assertEquals(15.0, max.doubleValue(), 0.0000001);
    }

    @Test
    public void testFindStackedRangeBounds_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(5.0, "Row2", "Col1");
        dataset.addValue(-3.0, "Row3", "Col1");
        dataset.addValue(2.0, "Row1", "Col2");
        dataset.addValue(-4.0, "Row2", "Col2");
        dataset.addValue(1.0, "Row3", "Col2");
        Range range = DatasetUtilities.findStackedRangeBounds(dataset);
        assertEquals(-3.0, range.getLowerBound(), 0.0000001);
        assertEquals(12.0, range.getUpperBound(), 0.0000001); // Col1: 10+5-3 = 12; Col2: 2-4+1 = -1
    }

    @Test
    public void testFindStackedRangeBounds_withBase() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(-3.0, "Row2", "Col1");
        Range range = DatasetUtilities.findStackedRangeBounds(dataset, 5.0); // base is 5.0
        assertEquals(2.0, range.getLowerBound(), 0.0000001); // 5.0 + (-3.0) = 2.0
        assertEquals(15.0, range.getUpperBound(), 0.0000001); // 5.0 + 10.0 = 15.0
    }

    @Test
    public void testFindMinimumStackedRangeValue_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(5.0, "Row2", "Col1");
        dataset.addValue(-3.0, "Row3", "Col1");
        dataset.addValue(2.0, "Row1", "Col2");
        dataset.addValue(-4.0, "Row2", "Col2");
        dataset.addValue(1.0, "Row3", "Col2");
        Number min = DatasetUtilities.findMinimumStackedRangeValue(dataset);
        assertEquals(-4.0, min.doubleValue(), 0.0000001); // Col1 negative total = -3.0, Col2 negative total = -4.0
    }

    @Test
    public void testFindMaximumStackedRangeValue_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(5.0, "Row2", "Col1");
        dataset.addValue(-3.0, "Row3", "Col1");
        dataset.addValue(2.0, "Row1", "Col2");
        dataset.addValue(-4.0, "Row2", "Col2");
        dataset.addValue(1.0, "Row3", "Col2");
        Number max = DatasetUtilities.findMaximumStackedRangeValue(dataset);
        assertEquals(15.0, max.doubleValue(), 0.0000001); // Col1 positive total = 15.0, Col2 positive total = 3.0
    }
    
    @Test
    public void testCalculateStackTotal_basic() throws Exception {
        DefaultXYSeriesCollection dataset = new DefaultXYSeriesCollection();
        XYSeries series1 = new XYSeries("Series1");
        series1.add(1.0, 10.0);
        series1.add(2.0, 5.0);
        XYSeries series2 = new XYSeries("Series2");
        series2.add(1.0, -3.0);
        series2.add(2.0, -4.0);
        XYSeries series3 = new XYSeries("Series3");
        series3.add(1.0, 2.0);
        series3.add(2.0, 1.0);
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);

        assertEquals(9.0, DatasetUtilities.calculateStackTotal(dataset, 0), 0.0000001); // 10 - 3 + 2
        assertEquals(2.0, DatasetUtilities.calculateStackTotal(dataset, 1), 0.0000001); // 5 - 4 + 1
    }

    @Test
    public void testFindCumulativeRangeBounds_basic() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(5.0, "Row1", "Col2");
        dataset.addValue(-3.0, "Row1", "Col3");
        dataset.addValue(2.0, "Row2", "Col1");
        dataset.addValue(-4.0, "Row2", "Col2");
        dataset.addValue(1.0, "Row2", "Col3");

        Range range = DatasetUtilities.findCumulativeRangeBounds(dataset);
        // Row1: 10, 15, 12. Min: 0.0, Max: 15.0
        // Row2: 2, -2, -1. Min: -2.0, Max: 2.0
        // Combined min: -2.0, Combined max: 15.0
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
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(Double.NaN, "Row1", "Col2");
        dataset.addValue(5.0, "Row1", "Col3");

        Range range = DatasetUtilities.findCumulativeRangeBounds(dataset);
        assertEquals(0.0, range.getLowerBound(), 0.0000001); // Only positive values, so min stays at 0.0
        assertEquals(15.0, range.getUpperBound(), 0.0000001); // 10 + 5
    }

}
```

1. SOURCE CODE ANALYSIS - The tests cover methods for calculating dataset totals, creating datasets from other datasets, consolidating pie datasets, creating category datasets from various data structures, sampling functions into XY datasets, checking for empty/null datasets, finding domain and range bounds for various dataset types (XY, Category, Interval, OHLC, BoxAndWhisker), iterating to find these bounds, finding minimum/maximum domain and range values, and calculating stacked and cumulative range bounds.
2. TEST CASE DESIGN - Each test method has a specific input and expected result, with the derivation based on the logic within the `DatasetUtilities` class for that input.
4. DEFECT DETECTION STRATEGY - The tests cover edge cases, null/empty inputs, and normal operation for a wide range of dataset utility methods, aiming to detect logical errors in calculations, bound finding, and data transformations.
5. SUMMARY - 73 tests.
6. LIMITATIONS - Some tests for `createCategoryDataset_fromKeyedValues` and `sampleFunction2DToSeries` were adjusted to use appropriate concrete classes or methods. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.