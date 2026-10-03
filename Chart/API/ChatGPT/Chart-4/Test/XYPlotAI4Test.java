package org.jfree.chart.plot;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class XYPlotAI4Test {

    @Test
    public void testCanSelectByPoint() {
        XYPlot plot = new XYPlot();
        assertFalse(plot.canSelectByPoint());
    }

    @Test
    public void testCanSelectByRegion() {
        XYPlot plot = new XYPlot();
        assertTrue(plot.canSelectByRegion());
    }
}
