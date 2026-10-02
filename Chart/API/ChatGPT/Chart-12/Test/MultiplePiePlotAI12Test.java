package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Color;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.util.TableOrder;
import org.junit.Test;

public class MultiplePiePlotAI12Test {

    @Test
    public void testDefaultConstructor() {
        MultiplePiePlot plot = new MultiplePiePlot();
        assertNotNull(plot.getPieChart());
        assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
    }

    @Test
    public void testEquals() {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        assertTrue(plot1.equals(plot2));

        plot1.setLimit(0.1);
        assertFalse(plot1.equals(plot2));

        plot2.setLimit(0.1);
        assertTrue(plot1.equals(plot2));

        plot1.setAggregatedItemsKey("OtherKey");
        assertFalse(plot1.equals(plot2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartNull() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setPieChart(null);
    }

}
