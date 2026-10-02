package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Test;

public class CategoryPlotAI14Test {

    @Test
    public void testDefaultConstructor() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertFalse(plot.isDomainZoomable());
        assertTrue(plot.isRangeZoomable());
        assertNull(plot.getDomainAxis());
        assertNull(plot.getRangeAxis());
        assertNull(plot.getRenderer());
        assertFalse(plot.getDrawSharedDomainAxis());
        assertEquals(0.0, plot.getAnchorValue(), 0.0001);
        assertEquals(0, plot.getWeight());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNullThrowsException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(null);
    }

    @Test
    public void testSetOrientation() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNullThrowsException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void testSetAxisOffset() {
        CategoryPlot plot = new CategoryPlot();
        RectangleInsets insets = new RectangleInsets(5.0, 5.0, 5.0, 5.0);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    @Test
    public void testDomainAxisManagement() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("Domain 1");
        CategoryAxis axis2 = new CategoryAxis("Domain 2");

        plot.setDomainAxis(0, axis1);
        plot.setDomainAxis(1, axis2);

        assertEquals(2, plot.getDomainAxisCount());
        assertEquals(axis1, plot.getDomainAxis(0));
        assertEquals(axis2, plot.getDomainAxis(1));
        assertEquals(0, plot.getDomainAxisIndex(axis1));
        assertEquals(1, plot.getDomainAxisIndex(axis2));

        CategoryAxis unassignedAxis = new CategoryAxis("Unassigned");
        assertEquals(-1, plot.getDomainAxisIndex(unassignedAxis));

        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
        assertNull(plot.getDomainAxis(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisIndexNullThrowsException() {
        CategoryPlot plot = new CategoryPlot();
        plot.getDomainAxisIndex(null);
    }

    @Test
    public void testDomainAxisLocation() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());

        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());

        // Index 1 defaults to the opposite of index 0
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation(1));

        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getDomainAxisLocation(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocationZeroNullThrowsException() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(0, null);
    }

    @Test
    public void testWeightAndFixedAxisSpace() {
        CategoryPlot plot = new CategoryPlot();
        plot.setWeight(3);
        assertEquals(3, plot.getWeight());

        AxisSpace domainSpace = new AxisSpace();
        domainSpace.setTop(10.0);
        plot.setFixedDomainAxisSpace(domainSpace);
        assertEquals(domainSpace, plot.getFixedDomainAxisSpace());

        AxisSpace rangeSpace = new AxisSpace();
        rangeSpace.setLeft(15.0);
        plot.setFixedRangeAxisSpace(rangeSpace);
        assertEquals(rangeSpace, plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testDrawSharedDomainAxisAndAnchorValue() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDrawSharedDomainAxis(true);
        assertTrue(plot.getDrawSharedDomainAxis());

        plot.setAnchorValue(12.5);
        assertEquals(12.5, plot.getAnchorValue(), 0.0001);
    }

    @Test
    public void testGetCategoriesWithDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");

        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Categories"),
                new NumberAxis("Values"), new BarRenderer());

        List categories = plot.getCategories();
        assertNotNull(categories);
        assertEquals(Arrays.asList("C1", "C2"), categories);
    }

    @Test
    public void testEqualsAndClone() throws CloneNotSupportedException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R1", "C1");
        CategoryAxis domainAxis = new CategoryAxis("X");
        ValueAxis rangeAxis = new NumberAxis("Y");
        CategoryItemRenderer renderer = new BarRenderer();

        CategoryPlot plot1 = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        CategoryPlot plot2 = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);

        assertTrue(plot1.equals(plot1));
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));

        CategoryPlot clone = (CategoryPlot) plot1.clone();
        assertNotSame(plot1, clone);
        assertTrue(plot1.equals(clone));
        assertNotSame(plot1.getDomainAxis(), clone.getDomainAxis());
        assertNotSame(plot1.getRangeAxis(), clone.getRangeAxis());
    }
}
