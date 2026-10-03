package org.jfree.chart.plot.junit;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;

import junit.framework.TestCase;
//import org.jfree.chart.util.Layer;
public class Chart14GeneratedTest extends TestCase {
    public void testRemovingUnknownMarkersReturnsFalse() {
        assertFalse(new CategoryPlot().removeDomainMarker(new CategoryMarker("C1")));
        assertFalse(new CategoryPlot().removeRangeMarker(new ValueMarker(0.5)));
        assertFalse(new XYPlot().removeDomainMarker(new ValueMarker(0.5)));
        assertFalse(new XYPlot().removeRangeMarker(new ValueMarker(0.5)));
    }
}
