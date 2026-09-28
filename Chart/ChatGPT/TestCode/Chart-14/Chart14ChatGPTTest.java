package org.jfree.chart.plot.junit;

import junit.framework.TestCase;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;

public class Chart14ChatGPTTest extends TestCase {
    public void testRemovingAbsentBackgroundMarkersReturnsFalse() {
        ValueMarker m = new ValueMarker(1.0);
        assertFalse(new CategoryPlot().removeDomainMarker(1, m, org.jfree.ui.Layer.BACKGROUND));
        assertFalse(new XYPlot().removeRangeMarker(1, m, org.jfree.ui.Layer.BACKGROUND));
    }
}
