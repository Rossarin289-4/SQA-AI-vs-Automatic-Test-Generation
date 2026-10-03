package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class XYPlotAI14Test {

    @Test
    public void testConstructorAndDefaults() {
        XYPlot plot = new XYPlot();
        assertNotNull(plot.getPlotType());
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test
    public void testSetOrientation() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test
    public void testCloning() throws CloneNotSupportedException {
        XYPlot plot = new XYPlot();
        XYPlot clone = (XYPlot) plot.clone();
        assertNotNull(clone);
        assertNotSame(plot, clone);
        assertEquals(plot.getOrientation(), clone.getOrientation());
    }

}
