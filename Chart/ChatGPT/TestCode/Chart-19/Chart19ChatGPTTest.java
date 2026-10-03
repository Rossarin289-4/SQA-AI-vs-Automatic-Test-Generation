package org.jfree.chart.plot.junit;

import junit.framework.TestCase;
import org.jfree.chart.plot.CategoryPlot;

public class Chart19ChatGPTTest extends TestCase {
    public void testNullDomainAxisRejected() {
        try { new CategoryPlot().getDomainAxisIndex(null); fail("Expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }
}
