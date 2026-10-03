package org.jfree.chart.plot;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.xy.DefaultXYDataset;
import org.junit.Assert;
import org.junit.Test;

public class XYPlotAI4Test {

    @Test
    public void testDefaultConstructor() {
        XYPlot plot = new XYPlot();
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        Assert.assertNull(plot.getDomainAxis());
        Assert.assertNull(plot.getRangeAxis());
        Assert.assertNull(plot.getDataset());
        Assert.assertNull(plot.getRenderer());
        Assert.assertTrue(plot.isDomainZoomable());
        Assert.assertTrue(plot.isRangeZoomable());
        Assert.assertFalse(plot.isDomainPannable());
        Assert.assertFalse(plot.isRangePannable());
        Assert.assertFalse(plot.canSelectByPoint());
        Assert.assertTrue(plot.canSelectByRegion());
        Assert.assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0), plot.getAxisOffset());
        Assert.assertEquals(0, plot.getSeriesCount());
    }

    @Test
    public void testConstructorWithArguments() {
        DefaultXYDataset dataset = new DefaultXYDataset();
        NumberAxis domainAxis = new NumberAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        XYPlot plot = new XYPlot(dataset, domainAxis, rangeAxis, renderer);

        Assert.assertSame(dataset, plot.getDataset());
        Assert.assertSame(domainAxis, plot.getDomainAxis());
        Assert.assertSame(rangeAxis, plot.getRangeAxis());
        Assert.assertSame(renderer, plot.getRenderer());
        Assert.assertSame(plot, domainAxis.getPlot());
        Assert.assertSame(plot, rangeAxis.getPlot());
        Assert.assertSame(plot, renderer.getPlot());
    }

    @Test
    public void testSetOrientation() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        plot.setOrientation(PlotOrientation.VERTICAL);
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(null);
    }

    @Test
    public void testSetAxisOffset() {
        XYPlot plot = new XYPlot();
        RectangleInsets insets = new RectangleInsets(10.0, 5.0, 10.0, 5.0);
        plot.setAxisOffset(insets);
        Assert.assertEquals(insets, plot.getAxisOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNull() {
        XYPlot plot = new XYPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void testDomainAndRangePannable() {
        XYPlot plot = new XYPlot();
        Assert.assertFalse(plot.isDomainPannable());
        Assert.assertFalse(plot.isRangePannable());

        plot.setDomainPannable(true);
        Assert.assertTrue(plot.isDomainPannable());

        plot.setRangePannable(true);
        Assert.assertTrue(plot.isRangePannable());
    }

    @Test
    public void testZoomDomainAndRangeAxes() {
        NumberAxis domainAxis = new NumberAxis("X");
        domainAxis.setRange(0.0, 100.0);
        NumberAxis rangeAxis = new NumberAxis("Y");
        rangeAxis.setRange(0.0, 50.0);

        XYPlot plot = new XYPlot(null, domainAxis, rangeAxis, null);

        plot.zoomDomainAxes(0.5, null, null);
        Assert.assertEquals(25.0, domainAxis.getLowerBound(), 1e-6);
        Assert.assertEquals(75.0, domainAxis.getUpperBound(), 1e-6);

        plot.zoomRangeAxes(0.5, null, null);
        Assert.assertEquals(12.5, rangeAxis.getLowerBound(), 1e-6);
        Assert.assertEquals(37.5, rangeAxis.getUpperBound(), 1e-6);
    }

    @Test
    public void testCloning() throws CloneNotSupportedException {
        NumberAxis domainAxis = new NumberAxis("X");
        NumberAxis rangeAxis = new NumberAxis("Y");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        XYPlot plot1 = new XYPlot(null, domainAxis, rangeAxis, renderer);

        XYPlot plot2 = (XYPlot) plot1.clone();

        Assert.assertNotSame(plot1, plot2);
        Assert.assertSame(plot1.getClass(), plot2.getClass());
        Assert.assertEquals(plot1, plot2);

        // Verify independent axes after cloning
        Assert.assertNotSame(plot1.getDomainAxis(), plot2.getDomainAxis());
        Assert.assertNotSame(plot1.getRangeAxis(), plot2.getRangeAxis());
        Assert.assertSame(plot2, plot2.getDomainAxis().getPlot());
        Assert.assertSame(plot2, plot2.getRangeAxis().getPlot());
    }

    @Test
    public void testEquals() {
        NumberAxis domainAxis1 = new NumberAxis("X");
        NumberAxis rangeAxis1 = new NumberAxis("Y");
        XYPlot plot1 = new XYPlot(null, domainAxis1, rangeAxis1, null);

        NumberAxis domainAxis2 = new NumberAxis("X");
        NumberAxis rangeAxis2 = new NumberAxis("Y");
        XYPlot plot2 = new XYPlot(null, domainAxis2, rangeAxis2, null);

        Assert.assertEquals(plot1, plot2);
        Assert.assertEquals(plot2, plot1);

        plot2.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertFalse(plot1.equals(plot2));

        plot1.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(plot1, plot2);
    }

    @Test
    public void testSerialization() throws Exception {
        NumberAxis domainAxis = new NumberAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        XYPlot plot1 = new XYPlot(null, domainAxis, rangeAxis, null);
        plot1.setDomainPannable(true);
        plot1.setRangePannable(true);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(plot1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        XYPlot plot2 = (XYPlot) in.readObject();
        in.close();

        Assert.assertEquals(plot1, plot2);
        Assert.assertTrue(plot2.isDomainPannable());
        Assert.assertTrue(plot2.isRangePannable());
        Assert.assertNotNull(plot2.getDomainAxis());
        Assert.assertNotNull(plot2.getRangeAxis());
        Assert.assertSame(plot2, plot2.getDomainAxis().getPlot());
        Assert.assertSame(plot2, plot2.getRangeAxis().getPlot());
    }
}
