package org.jfree.chart.plot.junit;

import junit.framework.TestCase;
import org.jfree.chart.plot.CategoryPlot;

public class Chart19GeminiTest extends TestCase {

    public Chart19GeminiTest(String name) {
        super(name);
    }

    public void testGetDomainAxisIndexNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.getDomainAxisIndex(null);
            fail("getDomainAxisIndex(null) should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected behavior in fixed version
        }
    }

    public void testGetRangeAxisIndexNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.getRangeAxisIndex(null);
            fail("getRangeAxisIndex(null) should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected behavior in fixed version
        }
    }
}
