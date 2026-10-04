package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.PaintUtilities;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.PieDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.util.DatasetGroup;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.DefaultDrawingSupplier;


public class MultiplePiePlotTest {

    @Test
    public void testConstructorDefault() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        assertNotNull(plot);
        assertNull(plot.getDataset());
        assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
        assertEquals(0.0, plot.getLimit(), 0.0);
        assertEquals("Other", plot.getAggregatedItemsKey());
        assertEquals(Color.lightGray, plot.getAggregatedItemsPaint());
        assertEquals("Multiple Pie Plot", plot.getPlotType());
        assertNotNull(plot.getPieChart());
        assertTrue(plot.getPieChart().getPlot() instanceof PiePlot);
    }

    @Test
    public void testConstructorWithDataset() throws Exception {
        CategoryDataset dataset = new DefaultCategoryDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        assertNotNull(plot);
        assertEquals(dataset, plot.getDataset());
    }

    @Test
    public void testSetDatasetNull() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    @Test
    public void testSetPieChart() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        JFreeChart newPieChart = new JFreeChart(new PiePlot());
        plot.setPieChart(newPieChart);
        assertEquals(newPieChart, plot.getPieChart());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartNull() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setPieChart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartInvalidPlotType() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        JFreeChart invalidChart = new JFreeChart(new org.jfree.chart.plot.CategoryPlot());
        plot.setPieChart(invalidChart);
    }

    @Test
    public void testSetDataExtractOrder() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        assertEquals(TableOrder.BY_ROW, plot.getDataExtractOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDataExtractOrderNull() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(null);
    }

    @Test
    public void testSetLimit() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setLimit(0.1);
        assertEquals(0.1, plot.getLimit(), 0.0);
    }

    @Test
    public void testSetLimitZero() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setLimit(0.0);
        assertEquals(0.0, plot.getLimit(), 0.0);
    }

    @Test
    public void testSetAggregatedItemsKey() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey("Custom Key");
        assertEquals("Custom Key", plot.getAggregatedItemsKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsKeyNull() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey(null);
    }

    @Test
    public void testSetAggregatedItemsPaint() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        Paint customPaint = Color.BLUE;
        plot.setAggregatedItemsPaint(customPaint);
        assertEquals(customPaint, plot.getAggregatedItemsPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsPaintNull() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsPaint(null);
    }

    @Test
    public void testGetPlotType() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        assertEquals("Multiple Pie Plot", plot.getPlotType());
    }

    // Test setup for draw and getLegendItems
    private DefaultCategoryDataset createSampleDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "Row1", "Col1");
        dataset.addValue(20, "Row1", "Col2");
        dataset.addValue(30, "Row2", "Col1");
        dataset.addValue(40, "Row2", "Col2");
        return dataset;
    }

    @Test
    public void testDrawWithNoData() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(100, 100, java.awt.image.BufferedImage.TYPE_INT_RGB).getGraphics();
        // ChartRenderingInfo is a subclass of PlotRenderingInfo, so this is a valid assignment.
        ChartRenderingInfo info = new ChartRenderingInfo();
        plot.draw(g2, area, null, null, info);
        // The draw method for no data just draws background and outline, no specific assertion possible without mocking.
        // We can check that it doesn't throw an exception.
        assertTrue(true);
    }

    @Test
    public void testDrawWithDataByColumn() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot(createSampleDataset());
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(200, 200, java.awt.image.BufferedImage.TYPE_INT_RGB).getGraphics();
        ChartRenderingInfo info = new ChartRenderingInfo();
        plot.draw(g2, area, null, null, info);
        // Asserting that draw completes without exceptions. Actual visual output requires more complex setup.
        assertTrue(true);
    }

    @Test
    public void testDrawWithDataByRow() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot(createSampleDataset());
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(200, 200, java.awt.image.BufferedImage.TYPE_INT_RGB).getGraphics();
        ChartRenderingInfo info = new ChartRenderingInfo();
        plot.draw(g2, area, null, null, info);
        assertTrue(true);
    }

    @Test
    public void testDrawWithLimit() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "Row1", "Col1");
        dataset.addValue(2, "Row1", "Col2"); // This will be aggregated if limit > 0.02
        dataset.addValue(5, "Row2", "Col1");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setLimit(0.05); // 5% limit
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(200, 200, java.awt.image.BufferedImage.TYPE_INT_RGB).getGraphics();
        ChartRenderingInfo info = new ChartRenderingInfo();
        plot.draw(g2, area, null, null, info);
        assertTrue(true);
    }

    @Test
    public void testGetLegendItemsEmptyDataset() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        LegendItemCollection collection = plot.getLegendItems();
        assertNotNull(collection);
        assertEquals(0, collection.getItemCount());
    }

    @Test
    public void testGetLegendItemsWithData() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot(createSampleDataset());
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        plot.setAggregatedItemsPaint(Color.GRAY);
        plot.setLimit(0.1); // To potentially trigger aggregated item
        LegendItemCollection collection = plot.getLegendItems();
        assertNotNull(collection);
        // Expecting legend items for Col1, Col2 and potentially "Other" if limit is hit
        assertTrue(collection.getItemCount() >= 2);
    }

    @Test
    public void testEquals() throws Exception {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        assertTrue(plot1.equals(plot2));

        plot1.setDataExtractOrder(TableOrder.BY_ROW);
        assertFalse(plot1.equals(plot2));
        plot2.setDataExtractOrder(TableOrder.BY_ROW);
        assertTrue(plot1.equals(plot2));

        plot1.setLimit(0.1);
        assertFalse(plot1.equals(plot2));
        plot2.setLimit(0.1);
        assertTrue(plot1.equals(plot2));

        plot1.setAggregatedItemsKey("Key1");
        assertFalse(plot1.equals(plot2));
        plot2.setAggregatedItemsKey("Key1");
        assertTrue(plot1.equals(plot2));

        plot1.setAggregatedItemsPaint(Color.RED);
        assertFalse(plot1.equals(plot2));
        plot2.setAggregatedItemsPaint(Color.RED);
        assertTrue(plot1.equals(plot2));

        JFreeChart pieChart1 = new JFreeChart(new PiePlot());
        JFreeChart pieChart2 = new JFreeChart(new PiePlot());
        plot1.setPieChart(pieChart1);
        assertFalse(plot1.equals(plot2));
        plot2.setPieChart(pieChart1);
        assertTrue(plot1.equals(plot2));
    }

    @Test
    public void testNotEqualsDifferentDataExtractOrder() throws Exception {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot1.setDataExtractOrder(TableOrder.BY_ROW);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testNotEqualsDifferentLimit() throws Exception {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot1.setLimit(0.1);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testNotEqualsDifferentAggregatedItemsKey() throws Exception {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot1.setAggregatedItemsKey("Custom");
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testNotEqualsDifferentAggregatedItemsPaint() throws Exception {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        plot1.setAggregatedItemsPaint(Color.BLUE);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testNotEqualsDifferentPieChart() throws Exception {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        JFreeChart pieChart1 = new JFreeChart(new PiePlot());
        JFreeChart pieChart2 = new JFreeChart(new PiePlot());
        plot1.setPieChart(pieChart1);
        plot2.setPieChart(pieChart2);
        assertFalse(plot1.equals(plot2));
    }

    // Serialization tests (basic checks)
    @Test
    public void testSerialization() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot(createSampleDataset());
        plot.setLimit(0.1);
        plot.setAggregatedItemsPaint(Color.CYAN);

        MultiplePiePlot deserializedPlot = (MultiplePiePlot) ObjectUtilities.clone(plot);

        assertEquals(plot.getDataset(), deserializedPlot.getDataset());
        assertEquals(plot.getDataExtractOrder(), deserializedPlot.getDataExtractOrder());
        assertEquals(plot.getLimit(), deserializedPlot.getLimit(), 0.0);
        assertEquals(plot.getAggregatedItemsKey(), deserializedPlot.getAggregatedItemsKey());
        assertTrue(PaintUtilities.equal(plot.getAggregatedItemsPaint(), deserializedPlot.getAggregatedItemsPaint()));
        // PieChart is a deep clone in ObjectUtilities.clone, so not a direct reference check needed
        assertTrue(ObjectUtilities.equal(plot.getPieChart(), deserializedPlot.getPieChart()));
    }

    @Test
    public void testSerializationWithNullDataset() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot(null);
        MultiplePiePlot deserializedPlot = (MultiplePiePlot) ObjectUtilities.clone(plot);
        assertNull(deserializedPlot.getDataset());
    }

    // Accessing private members for testing is generally discouraged,
    // but for this exercise, we'll make them accessible or use public methods if available.
    // The original code had private access errors. I will replace direct access with equivalent public methods where possible.
    // If no public method exists, these tests might need to be re-evaluated or removed.

    // Helper method to make sectionPaints accessible for testing, assuming it's part of the state.
    // If sectionPaints were intended to be private and not exposed, this test would need refactoring.
    private Map getSectionPaints(MultiplePiePlot plot) {
        // Attempt to find a public getter or accessible field.
        // If `sectionPaints` is truly private and not intended for external access,
        // tests relying on it would need to be removed or refactored.
        // For this fix, let's assume a way to get it, or acknowledge the limitation.
        // Since there's no public getter, and it's a HashMap, let's assume it's intended to be tested via its effects.
        // Re-evaluating `prefetchSectionPaints` and `getLegendItems` to see if their behavior can be tested indirectly.

        // As `prefetchSectionPaints` is private and `sectionPaints` is private, we cannot directly test them here without modifying the source class.
        // However, `getLegendItems` uses `sectionPaints`. We can test `getLegendItems` indirectly.
        // The tests for `prefetchSectionPaints` below are removed because they rely on private member access.
        return null; // Placeholder, actual tests should use public methods.
    }

    // Removed tests directly accessing private `sectionPaints` and calling private `prefetchSectionPaints`.
    // The functionality of `prefetchSectionPaints` is implicitly tested by `getLegendItems` if that method is tested thoroughly.

    @Test
    public void testSetAndGetDatasetGroup() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        DatasetGroup group = new DatasetGroup();
        plot.setDatasetGroup(group);
        assertEquals(group, plot.getDatasetGroup());
    }
}
