package org.jfree.data.general;

import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.function.Function2D;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.Assert;
import org.junit.Test;

public class DatasetUtilitiesAI2Test {

    private static final double EPSILON = 0.0000001;

    @Test
    public void testCalculatePieDatasetTotal() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.5);
        dataset.setValue("B", 20.0);
        dataset.setValue("C", -5.0); // negative values should be ignored
        dataset.setValue("D", null); // null values should be ignored

        double total = DatasetUtilities.calculatePieDatasetTotal(dataset);
        Assert.assertEquals(30.5, total, EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculatePieDatasetTotalNull() {
        DatasetUtilities.calculatePieDatasetTotal(null);
    }

    @Test
    public void testCreatePieDatasetForRowAndColumn() {
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        categoryDataset.addValue(1.0, "R1", "C1");
        categoryDataset.addValue(2.0, "R1", "C2");
        categoryDataset.addValue(3.0, "R2", "C1");
        categoryDataset.addValue(4.0, "R2", "C2");

        PieDataset rowPie = DatasetUtilities.createPieDatasetForRow(categoryDataset, "R1");
        Assert.assertEquals(2, rowPie.getItemCount());
        Assert.assertEquals(1.0, rowPie.getValue("C1").doubleValue(), EPSILON);
        Assert.assertEquals(2.0, rowPie.getValue("C2").doubleValue(), EPSILON);

        PieDataset colPie = DatasetUtilities.createPieDatasetForColumn(categoryDataset, 1);
        Assert.assertEquals(2, colPie.getItemCount());
        Assert.assertEquals(2.0, colPie.getValue("R1").doubleValue(), EPSILON);
        Assert.assertEquals(4.0, colPie.getValue("R2").doubleValue(), EPSILON);
    }

    @Test
    public void testCreateConsolidatedPieDataset() {
        DefaultPieDataset source = new DefaultPieDataset();
        source.setValue("A", 1.0);
        source.setValue("B", 1.0);
        source.setValue("C", 8.0);

        // Total is 10.0. A and B are 10% each (< 15%). Both should be aggregated into "Other".
        PieDataset consolidated = DatasetUtilities.createConsolidatedPieDataset(source, "Other", 0.15, 2);
        Assert.assertEquals(2, consolidated.getItemCount());
        Assert.assertEquals(8.0, consolidated.getValue("C").doubleValue(), EPSILON);
        Assert.assertEquals(2.0, consolidated.getValue("Other").doubleValue(), EPSILON);
    }

    @Test
    public void testCreateCategoryDatasetFromArrays() {
        double[][] data = new double[][] {
            {10.0, 20.0, 30.0},
            {40.0, 50.0, 60.0}
        };
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("Row", "Col", data);

        Assert.assertEquals(2, dataset.getRowCount());
        Assert.assertEquals(3, dataset.getColumnCount());
        Assert.assertEquals("Row1", dataset.getRowKey(0));
        Assert.assertEquals("Col2", dataset.getColumnKey(1));
        Assert.assertEquals(50.0, dataset.getValue("Row2", "Col2").doubleValue(), EPSILON);
    }

    @Test
    public void testSampleFunction2D() {
        Function2D linear = new Function2D() {
            @Override
            public double getValue(double x) {
                return 2.0 * x + 1.0;
            }
        };

        XYDataset dataset = DatasetUtilities.sampleFunction2D(linear, 0.0, 10.0, 3, "Linear");
        Assert.assertEquals(1, dataset.getSeriesCount());
        Assert.assertEquals(3, dataset.getItemCount(0));

        Assert.assertEquals(0.0, dataset.getXValue(0, 0), EPSILON);
        Assert.assertEquals(1.0, dataset.getYValue(0, 0), EPSILON);

        Assert.assertEquals(5.0, dataset.getXValue(0, 1), EPSILON);
        Assert.assertEquals(11.0, dataset.getYValue(0, 1), EPSILON);

        Assert.assertEquals(10.0, dataset.getXValue(0, 2), EPSILON);
        Assert.assertEquals(21.0, dataset.getYValue(0, 2), EPSILON);
    }

    @Test
    public void testIsEmptyOrNull() {
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull((PieDataset) null));
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull(pieDataset));
        pieDataset.setValue("A", 0.0);
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull(pieDataset));
        pieDataset.setValue("B", 5.0);
        Assert.assertFalse(DatasetUtilities.isEmptyOrNull(pieDataset));

        Assert.assertTrue(DatasetUtilities.isEmptyOrNull((CategoryDataset) null));
        DefaultCategoryDataset catDataset = new DefaultCategoryDataset();
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull(catDataset));
        catDataset.addValue(null, "R1", "C1");
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull(catDataset));
        catDataset.addValue(1.0, "R1", "C2");
        Assert.assertFalse(DatasetUtilities.isEmptyOrNull(catDataset));

        Assert.assertTrue(DatasetUtilities.isEmptyOrNull((XYDataset) null));
        XYSeriesCollection xyDataset = new XYSeriesCollection();
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull(xyDataset));
        XYSeries series = new XYSeries("S1");
        xyDataset.addSeries(series);
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull(xyDataset));
        series.add(1.0, 2.0);
        Assert.assertFalse(DatasetUtilities.isEmptyOrNull(xyDataset));
    }

    @Test
    public void testFindDomainAndRangeBoundsXY() {
        XYSeries series = new XYSeries("S1");
        series.add(1.0, 10.0);
        series.add(5.0, 2.0);
        series.add(3.0, 8.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        dataset.setIntervalWidth(0.0);

        Range domainRange = DatasetUtilities.findDomainBounds(dataset, false);
        Assert.assertEquals(1.0, domainRange.getLowerBound(), EPSILON);
        Assert.assertEquals(5.0, domainRange.getUpperBound(), EPSILON);

        Number minX = DatasetUtilities.findMinimumDomainValue(dataset);
        Number maxX = DatasetUtilities.findMaximumDomainValue(dataset);
        Assert.assertEquals(1.0, minX.doubleValue(), EPSILON);
        Assert.assertEquals(5.0, maxX.doubleValue(), EPSILON);

        Number minY = DatasetUtilities.findMinimumRangeValue(dataset);
        Number maxY = DatasetUtilities.findMaximumRangeValue(dataset);
        Assert.assertEquals(2.0, minY.doubleValue(), EPSILON);
        Assert.assertEquals(10.0, maxY.doubleValue(), EPSILON);
    }

    @Test
    public void testFindStackedRangeBoundsCategoryDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R1", "C1");
        dataset.addValue(-2.0, "R2", "C1");
        dataset.addValue(10.0, "R1", "C2");
        dataset.addValue(4.0, "R2", "C2");

        Range stackedRange = DatasetUtilities.findStackedRangeBounds(dataset);
        // C1 stack: pos=5.0, neg=-2.0; C2 stack: pos=14.0, neg=0.0
        Assert.assertEquals(-2.0, stackedRange.getLowerBound(), EPSILON);
        Assert.assertEquals(14.0, stackedRange.getUpperBound(), EPSILON);

        Number minStacked = DatasetUtilities.findMinimumStackedRangeValue(dataset);
        Number maxStacked = DatasetUtilities.findMaximumStackedRangeValue(dataset);
        Assert.assertEquals(-2.0, minStacked.doubleValue(), EPSILON);
        Assert.assertEquals(14.0, maxStacked.doubleValue(), EPSILON);
    }

    @Test
    public void testFindCumulativeRangeBoundsCategoryDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(20.0, "R1", "C2");
        dataset.addValue(-5.0, "R1", "C3");

        // R1 running totals: C1=10, C2=30, C3=25. Initial min/max are 0.0.
        Range cumulativeRange = DatasetUtilities.findCumulativeRangeBounds(dataset);
        Assert.assertEquals(0.0, cumulativeRange.getLowerBound(), EPSILON);
        Assert.assertEquals(30.0, cumulativeRange.getUpperBound(), EPSILON);
    }

    @Test
    public void testCalculateStackTotalTableXY() {
        DefaultTableXYDataset tableXY = new DefaultTableXYDataset();
        XYSeries s1 = new XYSeries("S1", true, false);
        s1.add(1.0, 5.0);
        s1.add(2.0, 10.0);
        tableXY.addSeries(s1);

        XYSeries s2 = new XYSeries("S2", true, false);
        s2.add(1.0, 3.0);
        s2.add(2.0, 7.0);
        tableXY.addSeries(s2);

        double total0 = DatasetUtilities.calculateStackTotal(tableXY, 0);
        double total1 = DatasetUtilities.calculateStackTotal(tableXY, 1);
        Assert.assertEquals(8.0, total0, EPSILON);
        Assert.assertEquals(17.0, total1, EPSILON);

        Range stackedXYRange = DatasetUtilities.findStackedRangeBounds(tableXY);
        Assert.assertEquals(0.0, stackedXYRange.getLowerBound(), EPSILON);
        Assert.assertEquals(17.0, stackedXYRange.getUpperBound(), EPSILON);
    }
}
