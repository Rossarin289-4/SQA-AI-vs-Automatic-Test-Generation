package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CategoryPlotAI19Test {

    @Test
    public void testConstructorAndDefaults() {
        CategoryPlot plot = new CategoryPlot();
        assertNotNull(plot);
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test
    public void testEquals() {
        CategoryPlot plot1 = new CategoryPlot();
        CategoryPlot plot2 = new CategoryPlot();
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));

        plot1.setWeight(2);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        CategoryPlot plot = new CategoryPlot();
        CategoryPlot clone = (CategoryPlot) plot.clone();
        assertNotNull(clone);
        assertTrue(plot.equals(clone));
    }
}
