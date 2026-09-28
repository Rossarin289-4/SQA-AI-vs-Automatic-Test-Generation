package org.jfree.chart.plot.junit;

import junit.framework.TestCase;
import org.jfree.chart.plot.PiePlot;

public class Chart15ChatGPTTest extends TestCase {
    public void testMaximumExplodePercentWithNullDataset() {
        PiePlot p = new PiePlot(null);
        assertEquals(0.0, p.getMaximumExplodePercent(), 0.0);
    }
}
