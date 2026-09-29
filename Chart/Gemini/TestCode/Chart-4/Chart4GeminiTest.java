package org.jfree.chart.plot.junit;

import junit.framework.TestCase;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Chart4GeminiTest extends TestCase {

    public Chart4GeminiTest(String name) {
        super(name);
    }

    public void testGetDataRangeWithNullRenderer() {
        XYSeries series = new XYSeries("S1");
        series.add(1.0, 2.0);
        series.add(3.0, 4.0);
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        XYPlot plot = new XYPlot();
        plot.setDataset(0, dataset);
        plot.setRenderer(0, null);

        try {
            plot.getDataRange(new NumberAxis("X"));
        } catch (NullPointerException e) {
            fail("getDataRange() threw NullPointerException when dataset renderer is null");
        }
    }
}
