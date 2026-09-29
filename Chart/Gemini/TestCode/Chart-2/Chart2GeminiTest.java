package org.jfree.data.general.junit;

import junit.framework.TestCase;
import org.jfree.data.Range;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYIntervalSeries;
import org.jfree.data.xy.XYIntervalSeriesCollection;

public class Chart2GeminiTest extends TestCase {

    public Chart2GeminiTest(String name) {
        super(name);
    }

    public void testIterateDomainBoundsInvertedInterval() {
        XYIntervalSeries series = new XYIntervalSeries("S1");
        // x, xLow, xHigh, y, yLow, yHigh
        // xLow (10.0) > xHigh (2.0)
        series.add(5.0, 10.0, 2.0, 5.0, 10.0, 2.0);

        XYIntervalSeriesCollection dataset = new XYIntervalSeriesCollection();
        dataset.addSeries(series);

        Range range = DatasetUtilities.iterateDomainBounds(dataset);
        assertNotNull(range);
        assertEquals(2.0, range.getLowerBound(), 0.000001);
        assertEquals(10.0, range.getUpperBound(), 0.000001);
    }
}
