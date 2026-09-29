package org.jfree.data.general.junit;

import java.util.Arrays;
import java.util.List;

import org.jfree.data.general.DatasetGroup;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.Range;
import org.jfree.data.event.DatasetChangeListener;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.xy.XYIntervalSeries;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.event.DatasetChangeListener;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DatasetUtilitiesChart2Test {

    private static final double EPSILON = 0.000000001;


    @Test
    public void testIntervalXYDomainIncludesMainXBelowInterval() {

        XYIntervalSeries series = new XYIntervalSeries("S1");

        series.add(
                -12.0,
                -4.0,
                3.0,
                1.0,
                0.0,
                2.0
        );

        XYIntervalSeriesCollection dataset =
                new XYIntervalSeriesCollection();

        dataset.addSeries(series);

        Range range =
                DatasetUtilities.iterateDomainBounds(dataset, true);

        assertEquals(
                -12.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                3.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    @Test
    public void testIntervalXYDomainIncludesMainXAboveInterval() {

        XYIntervalSeries series = new XYIntervalSeries("S1");

        series.add(
                15.0,
                -3.0,
                6.0,
                2.0,
                1.0,
                4.0
        );

        XYIntervalSeriesCollection dataset =
                new XYIntervalSeriesCollection();

        dataset.addSeries(series);

        Range range =
                DatasetUtilities.iterateDomainBounds(dataset, true);

        assertEquals(
                -3.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                15.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    @Test
    public void testIntervalXYDomainStartValueCanDetermineMaximum() {

        XYIntervalSeries series = new XYIntervalSeries("S1");

        series.add(
                0.0,
                8.0,
                2.0,
                1.0,
                0.0,
                1.0
        );

        XYIntervalSeriesCollection dataset =
                new XYIntervalSeriesCollection();

        dataset.addSeries(series);

        Range range =
                DatasetUtilities.iterateDomainBounds(dataset, true);

        assertEquals(
                0.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                8.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    @Test
    public void testIntervalXYDomainEndValueCanDetermineMinimum() {

        XYIntervalSeries series = new XYIntervalSeries("S1");

        series.add(
                0.0,
                4.0,
                -7.0,
                1.0,
                0.0,
                1.0
        );

        XYIntervalSeriesCollection dataset =
                new XYIntervalSeriesCollection();

        dataset.addSeries(series);

        Range range =
                DatasetUtilities.iterateDomainBounds(dataset, true);

        assertEquals(
                -7.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                4.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    @Test
    public void testIntervalXYDomainIgnoresNaNMainX() {

        XYIntervalSeries series = new XYIntervalSeries("S1");

        series.add(
                Double.NaN,
                -5.0,
                7.0,
                0.0,
                -1.0,
                1.0
        );

        XYIntervalSeriesCollection dataset =
                new XYIntervalSeriesCollection();

        dataset.addSeries(series);

        Range range =
                DatasetUtilities.iterateDomainBounds(dataset, true);

        assertEquals(
                -5.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                7.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    @Test
    public void testIntervalXYDomainIgnoresNaNIntervalValues() {

        XYIntervalSeries series = new XYIntervalSeries("S1");

        series.add(
                4.0,
                Double.NaN,
                Double.NaN,
                0.0,
                -1.0,
                1.0
        );

        XYIntervalSeriesCollection dataset =
                new XYIntervalSeriesCollection();

        dataset.addSeries(series);

        Range range =
                DatasetUtilities.iterateDomainBounds(dataset, true);

        assertEquals(
                4.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                4.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    @Test
    public void testIntervalCategoryRangeIncludesMainYOutsideInterval() {

        TestIntervalCategoryDataset dataset =
                new TestIntervalCategoryDataset(
                        11.0,
                        2.0,
                        5.0
                );

        Range range =
                DatasetUtilities.iterateRangeBounds(dataset, true);

        assertEquals(
                2.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                11.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    @Test
    public void testIntervalCategoryRangeIncludesMainYBelowInterval() {

        TestIntervalCategoryDataset dataset =
                new TestIntervalCategoryDataset(
                        -9.0,
                        -3.0,
                        4.0
                );

        Range range =
                DatasetUtilities.iterateRangeBounds(dataset, true);

        assertEquals(
                -9.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                4.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    @Test
    public void testIntervalCategoryRangeStartCanDetermineMaximum() {

        TestIntervalCategoryDataset dataset =
                new TestIntervalCategoryDataset(
                        0.0,
                        9.0,
                        3.0
                );

        Range range =
                DatasetUtilities.iterateRangeBounds(dataset, true);

        assertEquals(
                0.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                9.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    @Test
    public void testIntervalCategoryRangeEndCanDetermineMinimum() {

        TestIntervalCategoryDataset dataset =
                new TestIntervalCategoryDataset(
                        0.0,
                        6.0,
                        -8.0
                );

        Range range =
                DatasetUtilities.iterateRangeBounds(dataset, true);

        assertEquals(
                -8.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                6.0,
                range.getUpperBound(),
                EPSILON
        );
    }

    @Test
    public void testIntervalCategoryRangeIgnoresNaNMainY() {

        TestIntervalCategoryDataset dataset =
                new TestIntervalCategoryDataset(
                        Double.NaN,
                        -2.0,
                        5.0
                );

        Range range =
                DatasetUtilities.iterateRangeBounds(dataset, true);

        assertEquals(
                -2.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                5.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    @Test
    public void testIntervalCategoryRangeIgnoresNaNIntervalValues() {

        TestIntervalCategoryDataset dataset =
                new TestIntervalCategoryDataset(
                        3.0,
                        Double.NaN,
                        Double.NaN
                );

        Range range =
                DatasetUtilities.iterateRangeBounds(dataset, true);

        assertEquals(
                3.0,
                range.getLowerBound(),
                EPSILON
        );

        assertEquals(
                3.0,
                range.getUpperBound(),
                EPSILON
        );
    }


    private static class TestIntervalCategoryDataset
            implements IntervalCategoryDataset {

        private final Number value;
        private final Number startValue;
        private final Number endValue;

        private DatasetGroup group;


        TestIntervalCategoryDataset(
                Number value,
                Number startValue,
                Number endValue) {

            this.value = value;
            this.startValue = startValue;
            this.endValue = endValue;
        }


        public int getRowCount() {
            return 1;
        }


        public int getColumnCount() {
            return 1;
        }


        public Number getValue(
                int row,
                int column) {

            return value;
        }


        public Number getValue(
                Comparable rowKey,
                Comparable columnKey) {

            return value;
        }


        public Comparable getRowKey(int row) {
            return "R1";
        }


        public List getRowKeys() {
            return Arrays.asList("R1");
        }


        public int getRowIndex(Comparable key) {

            return "R1".equals(key) ? 0 : -1;
        }


        public Comparable getColumnKey(int column) {
            return "C1";
        }


        public List getColumnKeys() {
            return Arrays.asList("C1");
        }


        public int getColumnIndex(Comparable key) {

            return "C1".equals(key) ? 0 : -1;
        }


        public Number getStartValue(
                int row,
                int column) {

            return startValue;
        }


        public Number getStartValue(
                Comparable rowKey,
                Comparable columnKey) {

            return startValue;
        }


        public Number getEndValue(
                int row,
                int column) {

            return endValue;
        }


        public Number getEndValue(
                Comparable rowKey,
                Comparable columnKey) {

            return endValue;
        }

        public DatasetGroup getGroup() {
            return null;
        }

        public void setGroup(DatasetGroup group) {
        }

        public void addChangeListener(DatasetChangeListener listener) {
        }

        public void removeChangeListener(DatasetChangeListener listener) {
        }
    }
}