package org.jfree.data.general.junit;

import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.event.DatasetChangeListener;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class DatasetUtilitiesChart2GeminiTest {

    private static final double EPSILON = 0.000000001;

    private static class CustomIntervalXYDataset implements IntervalXYDataset {

        private final double x;
        private final double startX;
        private final double endX;

        public CustomIntervalXYDataset(double x, double startX, double endX) {
            this.x = x;
            this.startX = startX;
            this.endX = endX;
        }

        @Override
        public Number getStartX(int series, int item) {
            return Double.isNaN(startX) ? null : startX;
        }

        @Override
        public Number getEndX(int series, int item) {
            return Double.isNaN(endX) ? null : endX;
        }

        @Override
        public Number getX(int series, int item) {
            return Double.isNaN(x) ? null : x;
        }

        @Override
        public double getStartXValue(int series, int item) {
            return startX;
        }

        @Override
        public double getEndXValue(int series, int item) {
            return endX;
        }

        @Override
        public double getXValue(int series, int item) {
            return x;
        }

        @Override
        public Number getY(int series, int item) {
            return 1.0;
        }

        @Override
        public double getYValue(int series, int item) {
            return 1.0;
        }

        @Override
        public Number getStartY(int series, int item) {
            return 1.0;
        }

        @Override
        public double getStartYValue(int series, int item) {
            return 1.0;
        }

        @Override
        public Number getEndY(int series, int item) {
            return 1.0;
        }

        @Override
        public double getEndYValue(int series, int item) {
            return 1.0;
        }

        @Override
        public org.jfree.data.DomainOrder getDomainOrder() {
            return org.jfree.data.DomainOrder.ASCENDING;
        }

        @Override
        public int getItemCount(int series) {
            return 1;
        }

        @Override
        public int getSeriesCount() {
            return 1;
        }

        @Override
        public Comparable getSeriesKey(int series) {
            return "Series1";
        }

        @Override
        public int indexOf(Comparable seriesKey) {
            return 0;
        }

        @Override
        public void addChangeListener(DatasetChangeListener listener) {
        }

        @Override
        public void removeChangeListener(DatasetChangeListener listener) {
        }

        @Override
        public DatasetGroup getGroup() {
            return null;
        }

        @Override
        public void setGroup(DatasetGroup group) {
        }
    }

    private static class CustomIntervalCategoryDataset
            implements IntervalCategoryDataset {

        private final double y;
        private final double startY;
        private final double endY;

        public CustomIntervalCategoryDataset(
                double y, double startY, double endY) {
            this.y = y;
            this.startY = startY;
            this.endY = endY;
        }

        @Override
        public Number getStartValue(int series, int category) {
            return Double.isNaN(startY) ? null : startY;
        }

        @Override
        public Number getStartValue(
                Comparable series, Comparable category) {
            return Double.isNaN(startY) ? null : startY;
        }

        @Override
        public Number getEndValue(int series, int category) {
            return Double.isNaN(endY) ? null : endY;
        }

        @Override
        public Number getEndValue(
                Comparable series, Comparable category) {
            return Double.isNaN(endY) ? null : endY;
        }

        @Override
        public Number getValue(int series, int category) {
            return Double.isNaN(y) ? null : y;
        }

        @Override
        public Number getValue(
                Comparable series, Comparable category) {
            return Double.isNaN(y) ? null : y;
        }

        @Override
        public int getRowIndex(Comparable key) {
            return 0;
        }

        @Override
        public Comparable getRowKey(int row) {
            return "Row0";
        }

        @Override
        public java.util.List getRowKeys() {
            return java.util.Arrays.asList("Row0");
        }

        @Override
        public int getColumnIndex(Comparable key) {
            return 0;
        }

        @Override
        public Comparable getColumnKey(int column) {
            return "Col0";
        }

        @Override
        public java.util.List getColumnKeys() {
            return java.util.Arrays.asList("Col0");
        }

        @Override
        public int getRowCount() {
            return 1;
        }

        @Override
        public int getColumnCount() {
            return 1;
        }

        @Override
        public void addChangeListener(DatasetChangeListener listener) {
        }

        @Override
        public void removeChangeListener(DatasetChangeListener listener) {
        }

        @Override
        public DatasetGroup getGroup() {
            return null;
        }

        @Override
        public void setGroup(DatasetGroup group) {
        }
    }

    @Test
    public void testIterateDomainBounds_MainXSmallerThanStart() {
        XYDataset dataset =
                new CustomIntervalXYDataset(-10.0, 2.0, 8.0);

        Range bounds = DatasetUtilities.iterateDomainBounds(dataset);

        assertNotNull(bounds);
        assertEquals(-10.0, bounds.getLowerBound(), EPSILON);
        assertEquals(8.0, bounds.getUpperBound(), EPSILON);
    }

    @Test
    public void testIterateDomainBounds_MainXLargerThanEnd() {
        XYDataset dataset =
                new CustomIntervalXYDataset(15.0, -2.0, 5.0);

        Range bounds = DatasetUtilities.iterateDomainBounds(dataset);

        assertNotNull(bounds);
        assertEquals(-2.0, bounds.getLowerBound(), EPSILON);
        assertEquals(15.0, bounds.getUpperBound(), EPSILON);
    }

    @Test
    public void testIterateDomainBounds_IntervalDeterminesBounds() {
        XYDataset dataset =
                new CustomIntervalXYDataset(0.0, -12.5, 25.5);

        Range bounds = DatasetUtilities.iterateDomainBounds(dataset);

        assertNotNull(bounds);
        assertEquals(-12.5, bounds.getLowerBound(), EPSILON);
        assertEquals(25.5, bounds.getUpperBound(), EPSILON);
    }

    @Test
    public void testIterateDomainBounds_WithNaNValues() {
        XYDataset dataset1 =
                new CustomIntervalXYDataset(Double.NaN, -5.0, 10.0);

        Range bounds1 =
                DatasetUtilities.iterateDomainBounds(dataset1);

        assertNotNull(bounds1);
        assertEquals(-5.0, bounds1.getLowerBound(), EPSILON);
        assertEquals(10.0, bounds1.getUpperBound(), EPSILON);

        XYDataset dataset2 =
                new CustomIntervalXYDataset(3.0, Double.NaN, 12.0);

        Range bounds2 =
                DatasetUtilities.iterateDomainBounds(dataset2);

        assertNotNull(bounds2);
        assertEquals(3.0, bounds2.getLowerBound(), EPSILON);
        assertEquals(12.0, bounds2.getUpperBound(), EPSILON);

        XYDataset dataset3 =
                new CustomIntervalXYDataset(
                        Double.NaN, Double.NaN, Double.NaN);

        Range bounds3 =
                DatasetUtilities.iterateDomainBounds(dataset3);

        assertNull(bounds3);
    }

    @Test
    public void testIterateRangeBounds_MainYSmallerThanStart() {
        CategoryDataset dataset =
                new CustomIntervalCategoryDataset(-15.0, 1.0, 10.0);

        Range bounds = DatasetUtilities.iterateRangeBounds(dataset);

        assertNotNull(bounds);
        assertEquals(-15.0, bounds.getLowerBound(), EPSILON);
        assertEquals(10.0, bounds.getUpperBound(), EPSILON);
    }

    @Test
    public void testIterateRangeBounds_MainYLargerThanEnd() {
        CategoryDataset dataset =
                new CustomIntervalCategoryDataset(50.0, -5.0, 20.0);

        Range bounds = DatasetUtilities.iterateRangeBounds(dataset);

        assertNotNull(bounds);
        assertEquals(-5.0, bounds.getLowerBound(), EPSILON);
        assertEquals(50.0, bounds.getUpperBound(), EPSILON);
    }

    @Test
    public void testIterateRangeBounds_IntervalDeterminesBounds() {
        CategoryDataset dataset =
                new CustomIntervalCategoryDataset(0.0, -8.0, 14.0);

        Range bounds = DatasetUtilities.iterateRangeBounds(dataset);

        assertNotNull(bounds);
        assertEquals(-8.0, bounds.getLowerBound(), EPSILON);
        assertEquals(14.0, bounds.getUpperBound(), EPSILON);
    }

    @Test
    public void testIterateRangeBounds_WithNaNValues() {
        CategoryDataset dataset1 =
                new CustomIntervalCategoryDataset(
                        Double.NaN, -2.5, 7.5);

        Range bounds1 =
                DatasetUtilities.iterateRangeBounds(dataset1);

        assertNotNull(bounds1);
        assertEquals(-2.5, bounds1.getLowerBound(), EPSILON);
        assertEquals(7.5, bounds1.getUpperBound(), EPSILON);

        CategoryDataset dataset2 =
                new CustomIntervalCategoryDataset(
                        4.0, 1.0, Double.NaN);

        Range bounds2 =
                DatasetUtilities.iterateRangeBounds(dataset2);

        assertNotNull(bounds2);
        assertEquals(1.0, bounds2.getLowerBound(), EPSILON);
        assertEquals(4.0, bounds2.getUpperBound(), EPSILON);

        CategoryDataset dataset3 =
                new CustomIntervalCategoryDataset(
                        Double.NaN, Double.NaN, Double.NaN);

        Range bounds3 =
                DatasetUtilities.iterateRangeBounds(dataset3);

        assertNull(bounds3);
    }
}
