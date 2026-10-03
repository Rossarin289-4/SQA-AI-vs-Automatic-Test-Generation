package org.jfree.chart.renderer.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Test;

public class AbstractCategoryItemRendererAI1Test {

    private static class ConcreteCategoryItemRenderer extends AbstractCategoryItemRenderer {
        // Concrete implementation for testing inherited/protected methods
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEntityNullHotspot() {
        ConcreteCategoryItemRenderer renderer = new ConcreteCategoryItemRenderer();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        renderer.addEntity(null, null, dataset, 0, 0, false);
    }

    @Test
    public void testCreateHotSpotBoundsNullResult() {
        ConcreteCategoryItemRenderer renderer = new ConcreteCategoryItemRenderer();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");

        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);

        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");

        Rectangle2D bounds = renderer.createHotSpotBounds(g2, dataArea, plot,
                domainAxis, rangeAxis, dataset, 0, 0, false, null, null);

        assertNotNull(bounds);
        assertEquals(4.0, bounds.getWidth(), 0.001);
        assertEquals(4.0, bounds.getHeight(), 0.001);
    }

    @Test
    public void testHitTest() {
        ConcreteCategoryItemRenderer renderer = new ConcreteCategoryItemRenderer();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");

        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);

        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");

        Rectangle2D bounds = renderer.createHotSpotBounds(g2, dataArea, plot,
                domainAxis, rangeAxis, dataset, 0, 0, false, null, null);

        assertNotNull(bounds);
        double centerX = bounds.getCenterX();
        double centerY = bounds.getCenterY();

        boolean hit = renderer.hitTest(centerX, centerY, g2, dataArea, plot,
                domainAxis, rangeAxis, dataset, 0, 0, false, null);

        assertTrue(hit);
    }
}
