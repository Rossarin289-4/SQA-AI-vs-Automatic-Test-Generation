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
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.function.Function2D;
import org.jfree.data.statistics.BoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.BoxAndWhiskerXYDataset;
import org.jfree.data.statistics.MultiValueCategoryDataset;
import org.jfree.data.statistics.StatisticalCategoryDataset;
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
    public void testPieTotalIgnoresNullAndNegativeValues() throws Exception {
        DefaultPieDataset d = new DefaultPieDataset();
        d.setValue("positive", 4);
        d.setValue("negative", -3);
        d.setValue("zero", 0);
        d.setValue("null", (Number) null);
        assertEquals(4.0, DatasetUtilities.calculatePieDatasetTotal(d), 0.0);
    }

    @Test
    public void testPieRowProjection() throws Exception {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(2, "r", "c1");
        d.addValue(5, "r", "c2");
        PieDataset p = DatasetUtilities.createPieDatasetForRow(d, "r");
        assertEquals(2, p.getItemCount());
        assertEquals(2.0, p.getValue("c1").doubleValue(), 0.0);
        assertEquals(5.0, p.getValue("c2").doubleValue(), 0.0);
    }

    @Test
    public void testPieColumnProjection() throws Exception {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(3, "r1", "c");
        d.addValue(7, "r2", "c");
        PieDataset p = DatasetUtilities.createPieDatasetForColumn(d, "c");
        assertEquals(2, p.getItemCount());
        assertEquals(3.0, p.getValue("r1").doubleValue(), 0.0);
        assertEquals(7.0, p.getValue("r2").doubleValue(), 0.0);
    }

    @Test
    public void testConsolidatedPieDatasetThresholdAndAggregate() throws Exception {
        DefaultPieDataset d = new DefaultPieDataset();
        d.setValue("small", 1);
        d.setValue("large", 9);
        PieDataset p = DatasetUtilities.createConsolidatedPieDataset(d, "other", 0.2);
        assertEquals(1, p.getItemCount());
        assertEquals(9.0, p.getValue("large").doubleValue(), 0.0);
    }

    @Test
    public void testCreateCategoryDatasetPrefixesKeys() throws Exception {
        CategoryDataset d = DatasetUtilities.createCategoryDataset(
                "row", "col", new double[][] {{2, 4}, {6}});
        assertEquals(2, d.getRowCount());
        assertEquals(2, d.getColumnCount());
        assertEquals(2.0, d.getValue("row1", "col1").doubleValue(), 0.0);
        assertEquals(4.0, d.getValue("row1", "col2").doubleValue(), 0.0);
        assertEquals(6.0, d.getValue("row2", "col1").doubleValue(), 0.0);
        assertNull(d.getValue("row2", "col2"));
    }

    @Test
    public void testSampleFunctionToSeriesIncludesBothEndpoints() throws Exception {
        Function2D f = new Function2D() {
            public double getValue(double x) {
                return x * 2.0;
            }
        };
        XYSeries s = DatasetUtilities.sampleFunction2DToSeries(f, 1.0, 3.0, 3, "line");
        assertEquals(3, s.getItemCount());
        assertEquals(1.0, s.getX(0).doubleValue(), 0.0);
        assertEquals(2.0, s.getX(1).doubleValue(), 0.0);
        assertEquals(3.0, s.getX(2).doubleValue(), 0.0);
        assertEquals(6.0, s.getY(2).doubleValue(), 0.0);
    }

    @Test
    public void testSampleFunctionDatasetHasOneSeries() throws Exception {
        Function2D f = new Function2D() {
            public double getValue(double x) {
                return x + 1.0;
            }
        };
        XYDataset d = DatasetUtilities.sampleFunction2D(f, 0.0, 2.0, 2, "s");
        assertEquals(1, d.getSeriesCount());
        assertEquals(0.0, d.getXValue(0, 0), 0.0);
        assertEquals(2.0, d.getXValue(0, 1), 0.0);
        assertEquals(3.0, d.getYValue(0, 1), 0.0);
    }

    @Test
    public void testSampleFunctionRejectsOneSample() throws Exception {
        Function2D f = new Function2D() {
            public double getValue(double x) {
                return x;
            }
        };
        try {
            DatasetUtilities.sampleFunction2DToSeries(f, 0.0, 1.0, 1, "s");
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testPieEmptyOrNullAndPositiveValues() throws Exception {
        assertTrue(DatasetUtilities.isEmptyOrNull((PieDataset) null));
        DefaultPieDataset d = new DefaultPieDataset();
        d.setValue("negative", -1);
        d.setValue("zero", 0);
        assertTrue(DatasetUtilities.isEmptyOrNull(d));
        d.setValue("positive", 1);
        assertFalse(DatasetUtilities.isEmptyOrNull(d));
    }

    @Test
    public void testFindAndIterateDomainBounds() throws Exception {
        XYSeries s = new XYSeries("s");
        s.add(2.0, 10.0);
        s.add(5.0, 20.0);
        XYSeriesCollection d = new XYSeriesCollection(s);
        assertEquals(new Range(1.5, 5.5), DatasetUtilities.findDomainBounds(d));
        assertEquals(new Range(1.5, 5.5), DatasetUtilities.iterateDomainBounds(d));
    }

    @Test
    public void testCategoryRangeIterationSkipsNullValues() throws Exception {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(-2, "r", "c1");
        d.addValue(5, "r", "c2");
        assertEquals(new Range(-2.0, 5.0),
                DatasetUtilities.iterateCategoryRangeBounds(d, false));
        assertEquals(new Range(-2.0, 5.0), DatasetUtilities.iterateRangeBounds(d));
    }

    @Test
    public void testVisibleCategoryRangeUsesSelectedRows() throws Exception {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(-8, "hidden", "c");
        d.addValue(3, "shown", "c");
        List keys = new ArrayList();
        keys.add("shown");
        assertEquals(new Range(3.0, 3.0),
                DatasetUtilities.iterateToFindRangeBounds(d, keys, false));
    }

    @Test
    public void testVisibleDomainRangeUsesSelectedSeries() throws Exception {
        XYSeries a = new XYSeries("a");
        a.add(-10.0, 1.0);
        a.add(-5.0, 2.0);
        XYSeries b = new XYSeries("b");
        b.add(2.0, 3.0);
        b.add(6.0, 4.0);
        XYSeriesCollection d = new XYSeriesCollection();
        d.addSeries(a);
        d.addSeries(b);
        List keys = new ArrayList();
        keys.add("b");
        assertEquals(new Range(2.0, 6.0),
                DatasetUtilities.iterateToFindDomainBounds(d, keys, false));
    }

    @Test
    public void testDomainExtremaFromXYData() throws Exception {
        XYSeries s = new XYSeries("s");
        s.add(-2.0, 4.0);
        s.add(5.0, 9.0);
        XYSeriesCollection d = new XYSeriesCollection(s);
        assertEquals(-2.5, DatasetUtilities.findMinimumDomainValue(d).doubleValue(), 0.0);
        assertEquals(5.5, DatasetUtilities.findMaximumDomainValue(d).doubleValue(), 0.0);
    }

    @Test
    public void testCategoryRangeExtrema() throws Exception {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(-4, "r", "c1");
        d.addValue(8, "r", "c2");
        assertEquals(-4.0, DatasetUtilities.findMinimumRangeValue(d).doubleValue(), 0.0);
        assertEquals(8.0, DatasetUtilities.findMaximumRangeValue(d).doubleValue(), 0.0);
    }

    @Test
    public void testStackedCategoryBounds() throws Exception {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(3, "r1", "c");
        d.addValue(4, "r2", "c");
        d.addValue(-2, "r3", "c");
        assertEquals(new Range(-2.0, 7.0),
                DatasetUtilities.findStackedRangeBounds(d));
        assertEquals(-2.0,
                DatasetUtilities.findMinimumStackedRangeValue(d).doubleValue(), 0.0);
        assertEquals(7.0,
                DatasetUtilities.findMaximumStackedRangeValue(d).doubleValue(), 0.0);
    }

    @Test
    public void testCumulativeBoundsAccumulateInRowOrder() throws Exception {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(3, "r", "c1");
        d.addValue(-5, "r", "c2");
        d.addValue(4, "r", "c3");
        assertEquals(new Range(-2.0, 3.0),
                DatasetUtilities.findCumulativeRangeBounds(d));
    }
}
