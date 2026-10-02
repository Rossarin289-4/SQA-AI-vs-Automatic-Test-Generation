package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for {@link XYPlot}.
 */
public class XYPlotAI14Test {

    @Test
    public void testDefaultConstructor() {
        XYPlot plot = new XYPlot();
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        Assert.assertNull(plot.getDataset());
        Assert.assertNull(plot.getDomainAxis());
        Assert.assertNull(plot.getRangeAxis());
        Assert.assertNull(plot.getRenderer());
        Assert.assertEquals(1, plot.getDomainAxisCount());
        Assert.assertEquals(1, plot.getRangeAxisCount());
        Assert.assertEquals(0, plot.getSeriesCount());
        Assert.assertTrue(plot.isDomainZoomable());
        Assert.assertTrue(plot.isRangeZoomable());
    }

    @Test
    public void testCustomConstructorAndAxisLocationEdge() {
        NumberAxis domainAxis = new NumberAxis("X");
        NumberAxis rangeAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new StandardXYItemRenderer();
        DefaultTableXYDataset dataset = new DefaultTableXYDataset();

        XYPlot plot = new XYPlot(dataset, domainAxis, rangeAxis, renderer);

        Assert.assertSame(dataset, plot.getDataset());
        Assert.assertSame(domainAxis, plot.getDomainAxis());
        Assert.assertSame(rangeAxis, plot.getRangeAxis());
        Assert.assertSame(renderer, plot.getRenderer());
        Assert.assertSame(plot, domainAxis.getPlot());
        Assert.assertSame(plot, rangeAxis.getPlot());
        Assert.assertSame(plot, renderer.getPlot());

        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
        Assert.assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(RectangleEdge.LEFT, plot.getDomainAxisEdge());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNull() {
        XYPlot plot = new XYPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void testAxisOffsetGetterSetter() {
        XYPlot plot = new XYPlot();
        RectangleInsets insets = new RectangleInsets(5.0, 5.0, 5.0, 5.0);
        plot.setAxisOffset(insets);
        Assert.assertEquals(insets, plot.getAxisOffset());
    }

    @Test
    public void testCrosshairProperties() {
        XYPlot plot = new XYPlot();

        Assert.assertFalse(plot.isDomainCrosshairVisible());
        plot.setDomainCrosshairVisible(true);
        Assert.assertTrue(plot.isDomainCrosshairVisible());

        plot.setDomainCrosshairValue(15.5);
        Assert.assertEquals(15.5, plot.getDomainCrosshairValue(), 0.0001);

        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainCrosshairStroke(stroke);
        Assert.assertEquals(stroke, plot.getDomainCrosshairStroke());

        Paint paint = Color.red;
        plot.setDomainCrosshairPaint(paint);
        Assert.assertEquals(paint, plot.getDomainCrosshairPaint());

        Assert.assertFalse(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(true);
        Assert.assertTrue(plot.isRangeCrosshairVisible());

        plot.setRangeCrosshairValue(25.5);
        Assert.assertEquals(25.5, plot.getRangeCrosshairValue(), 0.0001);

        plot.setRangeCrosshairStroke(stroke);
        Assert.assertEquals(stroke, plot.getRangeCrosshairStroke());

        plot.setRangeCrosshairPaint(paint);
        Assert.assertEquals(paint, plot.getRangeCrosshairPaint());

        plot.setDomainCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isDomainCrosshairLockedOnData());

        plot.setRangeCrosshairLockedOnData(false);
        Assert.assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testFixedAxisSpace() {
        XYPlot plot = new XYPlot();
        Assert.assertNull(plot.getFixedDomainAxisSpace());
        Assert.assertNull(plot.getFixedRangeAxisSpace());

        AxisSpace domainSpace = new AxisSpace();
        domainSpace.setTop(10.0);
        plot.setFixedDomainAxisSpace(domainSpace);
        Assert.assertEquals(domainSpace, plot.getFixedDomainAxisSpace());

        AxisSpace rangeSpace = new AxisSpace();
        rangeSpace.setLeft(20.0);
        plot.setFixedRangeAxisSpace(rangeSpace);
        Assert.assertEquals(rangeSpace, plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testFixedLegendItems() {
        XYPlot plot = new XYPlot();
        Assert.assertNull(plot.getFixedLegendItems());

        LegendItemCollection collection = new LegendItemCollection();
        plot.setFixedLegendItems(collection);
        Assert.assertSame(collection, plot.getFixedLegendItems());
        Assert.assertSame(collection, plot.getLegendItems());

        plot.setFixedLegendItems(null);
        Assert.assertNull(plot.getFixedLegendItems());
    }

    @Test
    public void testDomainAndRangeAxisManagement() {
        XYPlot plot = new XYPlot();
        NumberAxis domain1 = new NumberAxis("Domain 1");
        NumberAxis domain2 = new NumberAxis("Domain 2");
        plot.setDomainAxes(new ValueAxis[] {domain1, domain2});

        Assert.assertEquals(2, plot.getDomainAxisCount());
        Assert.assertSame(domain1, plot.getDomainAxis(0));
        Assert.assertSame(domain2, plot.getDomainAxis(1));

        NumberAxis range1 = new NumberAxis("Range 1");
        NumberAxis range2 = new NumberAxis("Range 2");
        plot.setRangeAxes(new ValueAxis[] {range1, range2});

        Assert.assertEquals(2, plot.getRangeAxisCount());
        Assert.assertSame(range1, plot.getRangeAxis(0));
        Assert.assertSame(range2, plot.getRangeAxis(1));
    }

    @Test
    public void testEqualsAndCloning() throws CloneNotSupportedException {
        NumberAxis domainAxis1 = new NumberAxis("X");
        NumberAxis rangeAxis1 = new NumberAxis("Y");
        XYPlot plot1 = new XYPlot(null, domainAxis1, rangeAxis1, new StandardXYItemRenderer());

        NumberAxis domainAxis2 = new NumberAxis("X");
        NumberAxis rangeAxis2 = new NumberAxis("Y");
        XYPlot plot2 = new XYPlot(null, domainAxis2, rangeAxis2, new StandardXYItemRenderer());

        Assert.assertEquals(plot1, plot2);

        XYPlot clonedPlot = (XYPlot) plot1.clone();
        Assert.assertNotSame(plot1, clonedPlot);
        Assert.assertEquals(plot1, clonedPlot);
        Assert.assertEquals(clonedPlot, plot1);
        Assert.assertNotSame(plot1.getDomainAxis(), clonedPlot.getDomainAxis());
        Assert.assertNotSame(plot1.getRangeAxis(), clonedPlot.getRangeAxis());
    }

    @Test
    public void testSerialization() throws Exception {
        NumberAxis domainAxis = new NumberAxis("X");
        NumberAxis rangeAxis = new NumberAxis("Y");
        XYPlot plot1 = new XYPlot(null, domainAxis, rangeAxis, new StandardXYItemRenderer());

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(plot1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        XYPlot plot2 = (XYPlot) in.readObject();
        in.close();

        Assert.assertEquals(plot1, plot2);
        Assert.assertNotNull(plot2.getDomainAxis());
        Assert.assertNotNull(plot2.getRangeAxis());
    }
}
