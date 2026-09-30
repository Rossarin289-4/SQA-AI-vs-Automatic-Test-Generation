package org.jfree.chart.axis.junit;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import junit.framework.TestCase;

/** Regression scenario generated for Defects4J Chart-4. */
public final class Chart4GeneratedTest extends TestCase {
    public void testScatterPlotAcceptsLogRangeAxisDuringAutoRange() {

    XYSeries series = new XYSeries("Series 1");
    series.add(1.0, 1.0);
    series.add(2.0, 2.0);
    series.add(3.0, 3.0);

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);

    JFreeChart chart = ChartFactory.createScatterPlot(
            "Test",
            "X",
            "Y",
            dataset,
            org.jfree.chart.plot.PlotOrientation.VERTICAL,
            true,
            false,
            false
    );

    XYPlot plot = (XYPlot) chart.getPlot();

    LogAxis axis = new LogAxis("Log(Y)");
    plot.setRangeAxis(axis);

    assertNotNull(chart);
    assertNotNull(plot);
    assertNotNull(axis);
    assertSame(axis, plot.getRangeAxis());
}
}
