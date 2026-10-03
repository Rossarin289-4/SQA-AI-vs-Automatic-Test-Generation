package org.jfree.data.general.junit;

import junit.framework.TestCase;
import org.jfree.data.Range;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYIntervalSeries;
import org.jfree.data.xy.XYIntervalSeriesCollection;

/** Regression scenarios generated for Defects4J Chart-2. */
public final class Chart2GeneratedTest extends TestCase {
    private static final double EPSILON = 0.000000001d;

    public void testDomainBoundsIgnoreMissingCentralXValue() {
        XYIntervalSeriesCollection dataset = new XYIntervalSeriesCollection();
        XYIntervalSeries series = new XYIntervalSeries("S1");
        series.add(1.0, Double.NaN, Double.NaN, Double.NaN, 1.5, Double.NaN);
        dataset.addSeries(series);
        assertEquals(new Range(1.0, 1.0), DatasetUtilities.iterateDomainBounds(dataset));

        series.add(1.0, 1.5, Double.NaN, Double.NaN, 1.5, Double.NaN);
        assertEquals(new Range(1.0, 1.5), DatasetUtilities.iterateDomainBounds(dataset));

        series.add(1.0, Double.NaN, 0.5, Double.NaN, 1.5, Double.NaN);
        assertEquals(new Range(0.5, 1.5), DatasetUtilities.iterateDomainBounds(dataset));
    }

    public void testRangeBoundsIgnoreMissingCentralYValue() {
        XYIntervalSeriesCollection dataset = new XYIntervalSeriesCollection();
        XYIntervalSeries series = new XYIntervalSeries("S1");
        series.add(1.0, Double.NaN, Double.NaN, 1.5, Double.NaN, Double.NaN);
        dataset.addSeries(series);
        Range range = DatasetUtilities.iterateRangeBounds(dataset);
        assertEquals(1.5, range.getLowerBound(), EPSILON);
        assertEquals(1.5, range.getUpperBound(), EPSILON);

        series.add(1.0, 1.5, Double.NaN, Double.NaN, Double.NaN, 2.5);
        range = DatasetUtilities.iterateRangeBounds(dataset);
        assertEquals(1.5, range.getLowerBound(), EPSILON);
        assertEquals(2.5, range.getUpperBound(), EPSILON);

        series.add(1.0, Double.NaN, 0.5, Double.NaN, 3.5, Double.NaN);
        range = DatasetUtilities.iterateRangeBounds(dataset);
        assertEquals(1.5, range.getLowerBound(), EPSILON);
        assertEquals(3.5, range.getUpperBound(), EPSILON);
    }
}
