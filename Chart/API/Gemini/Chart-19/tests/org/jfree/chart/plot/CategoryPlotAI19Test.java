package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Assert;
import org.junit.Test;

public class CategoryPlotAI19Test {

    @Test
    public void testDefaultConstructor() {
        CategoryPlot plot = new CategoryPlot();
        Assert.assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        Assert.assertNull(plot.getDomainAxis());
        Assert.assertNull(plot.getRangeAxis());
        Assert.assertNull(plot.getDataset());
        Assert.assertNull(plot.getRenderer());
        Assert.assertEquals(CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE, plot.isDomainGridlinesVisible());
        Assert.assertEquals(CategoryPlot.DEFAULT_RANGE_GRIDLINES_VISIBLE, plot.isRangeGridlinesVisible());
        Assert.assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
        Assert.assertEquals(AxisLocation.TOP_OR_LEFT, plot.getRangeAxisLocation());
        Assert.assertFalse(plot.isDomainZoomable());
        Assert.assertTrue(plot.isRangeZoomable());
    }

    @Test
    public void testParameterizedConstructorAndAxisEdges() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis domainAxis = new CategoryAxis("Categories");
        ValueAxis rangeAxis = new NumberAxis("Values");
        CategoryItemRenderer renderer = new BarRenderer();

        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);

        Assert.assertSame(dataset, plot.getDataset());
        Assert.assertSame(domainAxis, plot.getDomainAxis());
        Assert.assertSame(rangeAxis, plot.getRangeAxis());
        Assert.assertSame(renderer, plot.getRenderer());
        Assert.assertSame(plot, domainAxis.getPlot());
        Assert.assertSame(plot, rangeAxis.getPlot());
        Assert.assertSame(plot, renderer.getPlot());

        Assert.assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge());
        Assert.assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Assert.assertEquals(RectangleEdge.LEFT, plot.getDomainAxisEdge());
        Assert.assertEquals(RectangleEdge.TOP, plot.getRangeAxisEdge());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void testDomainAxesManagement() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("Axis1");
        CategoryAxis axis2 = new CategoryAxis("Axis2");

        plot.setDomainAxes(new CategoryAxis[]{axis1, axis2});
        Assert.assertEquals(2, plot.getDomainAxisCount());
        Assert.assertSame(axis1, plot.getDomainAxis(0));
        Assert.assertSame(axis2, plot.getDomainAxis(1));
        Assert.assertEquals(0, plot.getDomainAxisIndex(axis1));
        Assert.assertEquals(1, plot.getDomainAxisIndex(axis2));

        plot.clearDomainAxes();
        Assert.assertEquals(0, plot.getDomainAxisCount());
        Assert.assertNull(plot.getDomainAxis(0));
    }

    @Test
    public void testCategoriesExtraction() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, new NumberAxis("Range"), new BarRenderer());

        List categories = plot.getCategories();
        Assert.assertNotNull(categories);
        Assert.assertEquals(2, categories.size());
        Assert.assertEquals("C1", categories.get(0));
        Assert.assertEquals("C2", categories.get(1));

        List axisCategories = plot.getCategoriesForAxis(domainAxis);
        Assert.assertEquals(2, axisCategories.size());
        Assert.assertTrue(axisCategories.contains("C1"));
        Assert.assertTrue(axisCategories.contains("C2"));
    }

    @Test
    public void testGetDataRange() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(25.0, "Row1", "Col2");
        NumberAxis rangeAxis = new NumberAxis("Range");
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Domain"), rangeAxis, new BarRenderer());

        Range range = plot.getDataRange(rangeAxis);
        Assert.assertNotNull(range);
        Assert.assertEquals(0.0, range.getLowerBound(), 0.00001);
        Assert.assertEquals(25.0, range.getUpperBound(), 0.00001);

        plot.setDataset(null);
        Assert.assertNull(plot.getDataRange(rangeAxis));
    }

    @Test
    public void testZoomRangeAxes() {
        NumberAxis rangeAxis = new NumberAxis("Range");
        rangeAxis.setRange(0.0, 100.0);
        CategoryPlot plot = new CategoryPlot(null, null, rangeAxis, null);

        PlotRenderingInfo info = new PlotRenderingInfo(null);
        plot.zoomRangeAxes(0.5, info, new Point2D.Double(0, 0));
        Assert.assertEquals(50.0, rangeAxis.getRange().getLength(), 0.0001);

        plot.zoomRangeAxes(0.2, 0.8, info, new Point2D.Double(0, 0));
        Assert.assertEquals(40.0, rangeAxis.getRange().getLowerBound(), 0.0001);
        Assert.assertEquals(70.0, rangeAxis.getRange().getUpperBound(), 0.0001);
    }

    @Test
    public void testEqualsAndClone() throws CloneNotSupportedException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R1", "C1");
        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        BarRenderer renderer = new BarRenderer();

        CategoryPlot plot1 = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        plot1.setAnchorValue(12.34);
        plot1.setWeight(3);
        plot1.setFixedDomainAxisSpace(new AxisSpace());

        CategoryPlot plot2 = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        plot2.setAnchorValue(12.34);
        plot2.setWeight(3);
        plot2.setFixedDomainAxisSpace(new AxisSpace());

        Assert.assertEquals(plot1, plot2);

        CategoryPlot clone = (CategoryPlot) plot1.clone();
        Assert.assertNotSame(plot1, clone);
        Assert.assertSame(clone.getClass(), plot1.getClass());
        Assert.assertEquals(plot1, clone);

        Assert.assertNotSame(plot1.getDomainAxis(), clone.getDomainAxis());
        Assert.assertNotSame(plot1.getRangeAxis(), clone.getRangeAxis());

        clone.setWeight(5);
        Assert.assertFalse(plot1.equals(clone));
    }

    @Test
    public void testSerialization() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R", "C");
        CategoryPlot plot1 = new CategoryPlot(dataset, new CategoryAxis("X"), new NumberAxis("Y"), new LineAndShapeRenderer());
        plot1.setDomainGridlinesVisible(true);
        plot1.setDomainGridlinePosition(CategoryAnchor.START);
        plot1.setDomainGridlinePaint(Color.RED);
        plot1.setDomainGridlineStroke(new BasicStroke(1.5f));
        plot1.setAxisOffset(new RectangleInsets(2.0, 2.0, 2.0, 2.0));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(plot1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        CategoryPlot plot2 = (CategoryPlot) in.readObject();
        in.close();

        Assert.assertEquals(plot1, plot2);
    }

    @Test
    public void testDrawGridlinesAndAnnotations() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");

        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("X"), new NumberAxis("Y"), new BarRenderer());
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);

        try {
            plot.draw(g2, area, new Point2D.Double(100, 100), null, new PlotRenderingInfo(null));
        } finally {
            g2.dispose();
        }

        Assert.assertEquals("Category Plot", plot.getPlotType());
    }
}
