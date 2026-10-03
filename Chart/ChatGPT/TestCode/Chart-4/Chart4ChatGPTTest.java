package org.jfree.chart.plot.junit;

import junit.framework.TestCase;
import org.jfree.chart.plot.XYPlot;

public class Chart4ChatGPTTest extends TestCase {
    public void testGetDataRangeAllowsNullRenderer() {
        XYPlot p = new XYPlot();
        p.setRenderer(null);
        try { p.getDataRange(null); } catch (NullPointerException e) { fail("Null renderer should be ignored"); }
    }
}
