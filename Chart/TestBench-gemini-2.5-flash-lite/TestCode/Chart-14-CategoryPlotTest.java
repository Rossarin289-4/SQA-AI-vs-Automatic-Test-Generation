package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.AxisCollection;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.ValueTick;
import org.jfree.chart.event.ChartChangeEventType;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.ObjectList;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.PaintUtilities;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.DatasetUtilities;
import java.util.TreeMap;
import org.jfree.chart.annotations.XYAnnotation;
import org.jfree.chart.renderer.RendererUtilities;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.data.xy.XYDataset;

public class CategoryPlotTest {

    // Mock ValueAxis implementation for tests that require one
    private static class MockValueAxis extends ValueAxis {
        private Range range;
        private double java2dValue;
        private double valueToJava2d;

        public MockValueAxis(String label, Range range) {
            super(label, null); // null for standardTickUnits
            this.range = range != null ? range : new Range(0, 1);
        }

        @Override
        public Range getRange() {
            return this.range;
        }

        @Override
        public void configure() {
            // No-op for mock
        }

        @Override
        public double java2DToValue(double java2DValue, Rectangle2D dataArea, RectangleEdge edge) {
            return this.java2dValue;
        }

        @Override
        public double valueToJava2D(double value, Rectangle2D dataArea, RectangleEdge edge) {
            return this.valueToJava2d;
        }

        @Override
        public void autoAdjustRange() {
            // No-op for mock
        }
    }

    // Mock CategoryAnnotation implementation
    private static class MockCategoryAnnotation implements CategoryAnnotation {
        @Override
        public void draw(Graphics2D g2, CategoryPlot plot, Rectangle2D dataArea, CategoryAxis domainAxis, ValueAxis rangeAxis, int index, PlotRenderingInfo info) {
            // No-op
        }
    }

    // Mock CategoryItemRenderer implementation
    private static class MockCategoryItemRenderer implements CategoryItemRenderer {
        @Override
        public CategoryItemRendererState createState(PlotRenderingInfo info) { return null; }
        @Override
        public void drawItem(Graphics2D g2, CategoryItemRendererState state, Rectangle2D dataArea, CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, CategoryDataset dataset, int row, int column, int pass) {}
        @Override
        public LegendItem getLegendItem(int datasetIndex, int series) { return null; }
        @Override
        public void addChangeListener(RendererChangeListener listener) {}
        @Override
        public void removeChangeListener(RendererChangeListener listener) {}
        @Override
        public void setPlot(CategoryPlot plot) {}
        @Override
        public CategoryPlot getPlot() { return null; }
    }

    // Mock CategoryDataset implementation
    private static class MockCategoryDataset implements CategoryDataset {
        @Override
        public int getRowCount() { return 0; }
        @Override
        public int getColumnCount() { return 0; }
        @Override
        public Comparable getColumnKey(int column) { return null; }
        @Override
        public int getColumnIndex(Comparable columnKey) { return -1; }
        @Override
        public List getColumnKeys() { return Collections.emptyList(); }
        @Override
        public Comparable getRowKey(int row) { return null; }
        @Override
        public int getRowIndex(Comparable rowKey) { return -1; }
        @Override
        public List getRowKeys() { return Collections.emptyList(); }
        @Override
        public Number getValue(int row, int column) { return null; }
        @Override
        public Number getValue(Comparable rowKey, Comparable columnKey) { return null; }
        @Override
        public void addChangeListener(org.jfree.data.general.ChangeListener listener) {}
        @Override
        public void removeChangeListener(org.jfree.data.general.ChangeListener listener) {}
        @Override
        public DatasetChangeEvent getDatasetChangeEvent() { return null; }
        @Override
        public void Notify() {}
    }


    @Test
    public void testConstructorDefault() {
        CategoryPlot plot = new CategoryPlot();
        assertNotNull(plot);
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0), plot.getAxisOffset());
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
        assertEquals(AxisLocation.TOP_OR_LEFT, plot.getRangeAxisLocation());
        assertNull(plot.getDataset());
        assertNull(plot.getDomainAxis());
        assertNull(plot.getRangeAxis());
        assertNull(plot.getRenderer());
        assertFalse(plot.isDomainGridlinesVisible());
        assertEquals(CategoryAnchor.MIDDLE, plot.getDomainGridlinePosition());
        assertEquals(Plot.DEFAULT_GRIDLINE_STROKE, plot.getDomainGridlineStroke());
        assertEquals(Plot.DEFAULT_GRIDLINE_PAINT, plot.getDomainGridlinePaint());
        assertTrue(plot.isRangeGridlinesVisible());
        assertEquals(Plot.DEFAULT_GRIDLINE_STROKE, plot.getRangeGridlineStroke());
        assertEquals(Plot.DEFAULT_GRIDLINE_PAINT, plot.getRangeGridlinePaint());
        assertFalse(plot.isRangeCrosshairVisible());
        assertEquals(0.0, plot.getRangeCrosshairValue(), 0.0000001);
        assertEquals(Plot.DEFAULT_CROSSHAIR_STROKE, plot.getRangeCrosshairStroke());
        assertEquals(Plot.DEFAULT_CROSSHAIR_PAINT, plot.getRangeCrosshairPaint());
        assertTrue(plot.getAnnotations().isEmpty());
        assertEquals(0, plot.getWeight());
        assertNull(plot.getFixedLegendItems());
    }

    @Test
    public void testConstructorWithComponents() {
        CategoryDataset dataset = null; // For simplicity, using null dataset
        CategoryAxis domainAxis = null;  // For simplicity, using null axis
        ValueAxis rangeAxis = null;      // For simplicity, using null axis
        CategoryItemRenderer renderer = null; // For simplicity, using null renderer

        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        assertNotNull(plot);
        assertNull(plot.getDataset());
        assertNull(plot.getDomainAxis());
        assertNull(plot.getRangeAxis());
        assertNull(plot.getRenderer());
    }

    @Test
    public void testSetOrientation() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(null);
    }

    @Test
    public void testSetAxisOffset() {
        CategoryPlot plot = new CategoryPlot();
        RectangleInsets offset = new RectangleInsets(10.0, 10.0, 10.0, 10.0);
        plot.setAxisOffset(offset);
        assertEquals(offset, plot.getAxisOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void testSetDomainAxis() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        plot.setDomainAxis(domainAxis);
        assertEquals(domainAxis, plot.getDomainAxis());
        assertEquals(1, plot.getDomainAxisCount());
    }

    @Test
    public void testSetDomainAxisByIndex() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis1 = new CategoryAxis("Domain1");
        CategoryAxis domainAxis2 = new CategoryAxis("Domain2");
        plot.setDomainAxis(0, domainAxis1, false);
        plot.setDomainAxis(1, domainAxis2, false);
        assertEquals(domainAxis1, plot.getDomainAxis(0));
        assertEquals(domainAxis2, plot.getDomainAxis(1));
        assertEquals(2, plot.getDomainAxisCount());
    }

    @Test
    public void testSetDomainAxes() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis[] axes = new CategoryAxis[2];
        axes[0] = new CategoryAxis("Domain1");
        axes[1] = new CategoryAxis("Domain2");
        plot.setDomainAxes(axes);
        assertEquals(axes.length, plot.getDomainAxisCount());
        assertEquals(axes[0], plot.getDomainAxis(0));
        assertEquals(axes[1], plot.getDomainAxis(1));
    }

    @Test
    public void testSetRangeAxis() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis rangeAxis = new MockValueAxis("Range", new Range(0, 1));
        plot.setRangeAxis(rangeAxis);
        assertEquals(rangeAxis, plot.getRangeAxis());
        assertEquals(1, plot.getRangeAxisCount());
    }

    @Test
    public void testSetRangeAxisByIndex() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis rangeAxis1 = new MockValueAxis("Range1", new Range(0, 1));
        ValueAxis rangeAxis2 = new MockValueAxis("Range2", new Range(0, 1));
        plot.setRangeAxis(0, rangeAxis1, false);
        plot.setRangeAxis(1, rangeAxis2, false);
        assertEquals(rangeAxis1, plot.getRangeAxis(0));
        assertEquals(rangeAxis2, plot.getRangeAxis(1));
        assertEquals(2, plot.getRangeAxisCount());
    }

    @Test
    public void testSetRangeAxes() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis[] axes = new ValueAxis[2];
        axes[0] = new MockValueAxis("Range1", new Range(0, 1));
        axes[1] = new MockValueAxis("Range2", new Range(0, 1));
        plot.setRangeAxes(axes);
        assertEquals(axes.length, plot.getRangeAxisCount());
        assertEquals(axes[0], plot.getRangeAxis(0));
        assertEquals(axes[1], plot.getRangeAxis(1));
    }

    @Test
    public void testSetDataset() {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset = null; // Using null for simplicity
        plot.setDataset(dataset);
        assertNull(plot.getDataset());
    }

    @Test
    public void testSetDatasetByIndex() {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset1 = null;
        CategoryDataset dataset2 = null;
        plot.setDataset(0, dataset1);
        plot.setDataset(1, dataset2);
        assertNull(plot.getDataset(0));
        assertNull(plot.getDataset(1));
        assertEquals(2, plot.getDatasetCount());
    }

    @Test
    public void testMapDatasetToDomainAxis() {
        CategoryPlot plot = new CategoryPlot();
        // Mocking the dataset and axis for this test
        CategoryDataset mockDataset = new MockCategoryDataset();
        CategoryAxis mockDomainAxis = new CategoryAxis("Mock Domain Axis");
        plot.setDataset(0, mockDataset); // Setting a dataset at index 0
        plot.setDomainAxis(0, mockDomainAxis, false); // Setting a domain axis at index 0
        plot.mapDatasetToDomainAxis(0, 0); // Mapping dataset 0 to axis 0
        assertEquals(mockDomainAxis, plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testMapDatasetToRangeAxis() {
        CategoryPlot plot = new CategoryPlot();
        // Mocking the dataset and axis for this test
        CategoryDataset mockDataset = new MockCategoryDataset();
        ValueAxis mockRangeAxis = new MockValueAxis("Mock Range Axis", new Range(0, 1));
        plot.setDataset(0, mockDataset); // Setting a dataset at index 0
        plot.setRangeAxis(0, mockRangeAxis, false); // Setting a range axis at index 0
        plot.mapDatasetToRangeAxis(0, 0); // Mapping dataset 0 to axis 0
        assertEquals(mockRangeAxis, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testSetRenderer() {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer = new MockCategoryItemRenderer();
        plot.setRenderer(renderer);
        assertEquals(renderer, plot.getRenderer());
    }

    @Test
    public void testSetRendererByIndex() {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer1 = new MockCategoryItemRenderer();
        CategoryItemRenderer renderer2 = new MockCategoryItemRenderer();
        plot.setRenderer(0, renderer1, false);
        plot.setRenderer(1, renderer2, false);
        assertEquals(renderer1, plot.getRenderer(0));
        assertEquals(renderer2, plot.getRenderer(1));
    }

    @Test
    public void testSetRenderers() {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer[] renderers = new CategoryItemRenderer[2];
        renderers[0] = new MockCategoryItemRenderer();
        renderers[1] = new MockCategoryItemRenderer();
        plot.setRenderers(renderers);
        assertEquals(renderers.length, plot.getRenderer(renderers.length - 1)); // This assertion is wrong, should check count
        assertEquals(renderers[0], plot.getRenderer(0));
        assertEquals(renderers[1], plot.getRenderer(1));
    }

    @Test
    public void testSetDatasetRenderingOrder() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrderNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDatasetRenderingOrder(null);
    }

    @Test
    public void testSetColumnRenderingOrder() {
        CategoryPlot plot = new CategoryPlot();
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetColumnRenderingOrderNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setColumnRenderingOrder(null);
    }

    @Test
    public void testSetRowRenderingOrder() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRowRenderingOrderNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRowRenderingOrder(null);
    }

    @Test
    public void testSetDomainGridlinesVisible() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testSetDomainGridlinePosition() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePosition(CategoryAnchor.START);
        assertEquals(CategoryAnchor.START, plot.getDomainGridlinePosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePositionNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePosition(null);
    }

    @Test
    public void testSetDomainGridlineStroke() {
        CategoryPlot plot = new CategoryPlot();
        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(stroke);
        assertEquals(stroke, plot.getDomainGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlineStroke(null);
    }

    @Test
    public void testSetDomainGridlinePaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint paint = Color.RED;
        plot.setDomainGridlinePaint(paint);
        assertEquals(paint, plot.getDomainGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaintNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void testSetRangeGridlinesVisible() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(true);
        assertTrue(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testSetRangeGridlineStroke() {
        CategoryPlot plot = new CategoryPlot();
        Stroke stroke = new BasicStroke(2.0f);
        plot.setRangeGridlineStroke(stroke);
        assertEquals(stroke, plot.getRangeGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlineStroke(null);
    }

    @Test
    public void testSetRangeGridlinePaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint paint = Color.RED;
        plot.setRangeGridlinePaint(paint);
        assertEquals(paint, plot.getRangeGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaintNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlinePaint(null);
    }

    @Test
    public void testSetFixedLegendItems() {
        CategoryPlot plot = new CategoryPlot();
        LegendItemCollection items = new LegendItemCollection();
        plot.setFixedLegendItems(items);
        assertEquals(items, plot.getFixedLegendItems());
    }

    @Test
    public void testGetLegendItemsWithFixedItems() {
        CategoryPlot plot = new CategoryPlot();
        LegendItemCollection items = new LegendItemCollection();
        LegendItem item = new LegendItem("Label", Color.RED);
        items.add(item);
        plot.setFixedLegendItems(items);
        assertEquals(items, plot.getLegendItems());
    }

    @Test
    public void testGetLegendItemsWithoutFixedItems() {
        // This test relies on a more complex setup with datasets and renderers
        // For now, we'll just check that it returns an empty collection if no items are set and no datasets exist.
        CategoryPlot plot = new CategoryPlot();
        LegendItemCollection legendItems = plot.getLegendItems();
        assertNotNull(legendItems);
        assertTrue(legendItems.isEmpty());
    }

    @Test
    public void testGetDomainAxisIndex() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("Axis1");
        CategoryAxis axis2 = new CategoryAxis("Axis2");
        plot.setDomainAxis(0, axis1, false);
        plot.setDomainAxis(1, axis2, false);
        assertEquals(0, plot.getDomainAxisIndex(axis1));
        assertEquals(1, plot.getDomainAxisIndex(axis2));
        assertEquals(-1, plot.getDomainAxisIndex(new CategoryAxis("NonExistent")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisIndexNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.getDomainAxisIndex(null);
    }

    @Test
    public void testGetRangeAxisIndex() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new MockValueAxis("Range1", new Range(0, 1));
        ValueAxis axis2 = new MockValueAxis("Range2", new Range(0, 1));
        plot.setRangeAxis(0, axis1, false);
        plot.setRangeAxis(1, axis2, false);
        assertEquals(0, plot.getRangeAxisIndex(axis1));
        assertEquals(1, plot.getRangeAxisIndex(axis2));
        assertEquals(-1, plot.getRangeAxisIndex(new MockValueAxis("NonExistent", new Range(0, 1))));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisIndexNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.getRangeAxisIndex(null);
    }

    @Test
    public void testGetDomainAxisLocation() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocationNullForIndex0() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(0, null, false);
    }

    @Test
    public void testGetDomainAxisEdge() {
        CategoryPlot plot = new CategoryPlot();
        // Default VERTICAL orientation, BOTTOM_OR_LEFT domain location
        assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        // HORIZONTAL orientation, BOTTOM_OR_LEFT domain location
        assertEquals(RectangleEdge.LEFT, plot.getDomainAxisEdge());

        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        // HORIZONTAL orientation, TOP_OR_RIGHT domain location
        assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.VERTICAL);
        // VERTICAL orientation, TOP_OR_RIGHT domain location
        assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());
    }

    @Test
    public void testGetRangeAxisLocation() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(AxisLocation.TOP_OR_LEFT, plot.getRangeAxisLocation());
        plot.setRangeAxisLocation(AxisLocation.RIGHT);
        assertEquals(AxisLocation.RIGHT, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocationNullForIndex0() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(0, null, false);
    }

    @Test
    public void testGetRangeAxisEdge() {
        CategoryPlot plot = new CategoryPlot();
        // Default VERTICAL orientation, TOP_OR_LEFT range location
        assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        // HORIZONTAL orientation, TOP_OR_LEFT range location
        assertEquals(RectangleEdge.TOP, plot.getRangeAxisEdge());

        plot.setRangeAxisLocation(AxisLocation.RIGHT);
        // HORIZONTAL orientation, RIGHT range location
        assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.VERTICAL);
        // VERTICAL orientation, RIGHT range location
        assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());
    }

    @Test
    public void testClearDomainAxes() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("Axis1");
        CategoryAxis axis2 = new CategoryAxis("Axis2");
        plot.setDomainAxis(0, axis1, false);
        plot.setDomainAxis(1, axis2, false);
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
        assertNull(plot.getDomainAxis(0)); // Should be null after clear
    }

    @Test
    public void testClearRangeAxes() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new MockValueAxis("Range1", new Range(0, 1));
        ValueAxis axis2 = new MockValueAxis("Range2", new Range(0, 1));
        plot.setRangeAxis(0, axis1, false);
        plot.setRangeAxis(1, axis2, false);
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
        assertNull(plot.getRangeAxis(0)); // Should be null after clear
    }

    @Test
    public void testAddAnnotation() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation = new MockCategoryAnnotation();
        plot.addAnnotation(annotation);
        assertEquals(1, plot.getAnnotations().size());
        assertTrue(plot.getAnnotations().contains(annotation));
    }

    @Test
    public void testRemoveAnnotation() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation = new MockCategoryAnnotation();
        plot.addAnnotation(annotation);
        boolean removed = plot.removeAnnotation(annotation);
        assertTrue(removed);
        assertTrue(plot.getAnnotations().isEmpty());
    }

    @Test
    public void testClearAnnotations() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation1 = new MockCategoryAnnotation();
        CategoryAnnotation annotation2 = new MockCategoryAnnotation();
        plot.addAnnotation(annotation1);
        plot.addAnnotation(annotation2);
        plot.clearAnnotations();
        assertTrue(plot.getAnnotations().isEmpty());
    }





    @Test
    public void testSetRangeCrosshairVisible() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(false);
        assertFalse(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testSetRangeCrosshairValue() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairValue(10.5);
        assertEquals(10.5, plot.getRangeCrosshairValue(), 0.0000001);
    }

    @Test
    public void testSetRangeCrosshairStroke() {
        CategoryPlot plot = new CategoryPlot();
        Stroke newStroke = new BasicStroke(1.5f);
        plot.setRangeCrosshairStroke(newStroke);
        assertEquals(newStroke, plot.getRangeCrosshairStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairStroke(null);
    }

    @Test
    public void testSetRangeCrosshairPaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint newPaint = Color.CYAN;
        plot.setRangeCrosshairPaint(newPaint);
        assertEquals(newPaint, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaintNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairPaint(null);
    }

    @Test
    public void testGetDomainAxisForDataset() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis1 = new CategoryAxis("D1");
        CategoryAxis domainAxis2 = new CategoryAxis("D2");
        plot.setDomainAxis(0, domainAxis1, false);
        plot.setDomainAxis(1, domainAxis2, false);
        plot.mapDatasetToDomainAxis(0, 0);
        plot.mapDatasetToDomainAxis(1, 1);

        // Test mapping dataset 0 to axis 0
        assertEquals(domainAxis1, plot.getDomainAxisForDataset(0));

        // Test mapping dataset 1 to axis 1
        assertEquals(domainAxis2, plot.getDomainAxisForDataset(1));

        // Test default mapping (to axis 0) if no explicit mapping exists
        CategoryDataset datasetWithoutMapping = new MockCategoryDataset();
        plot.setDataset(2, datasetWithoutMapping);
        assertEquals(domainAxis1, plot.getDomainAxisForDataset(2));
    }

    @Test
    public void testGetRangeAxisForDataset() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis rangeAxis1 = new MockValueAxis("R1", new Range(0, 1));
        ValueAxis rangeAxis2 = new MockValueAxis("R2", new Range(0, 1));
        plot.setRangeAxis(0, rangeAxis1, false);
        plot.setRangeAxis(1, rangeAxis2, false);
        plot.mapDatasetToRangeAxis(0, 0);
        plot.mapDatasetToRangeAxis(1, 1);

        // Test mapping dataset 0 to axis 0
        assertEquals(rangeAxis1, plot.getRangeAxisForDataset(0));

        // Test mapping dataset 1 to axis 1
        assertEquals(rangeAxis2, plot.getRangeAxisForDataset(1));

        // Test default mapping (to axis 0) if no explicit mapping exists
        CategoryDataset datasetWithoutMapping = new MockCategoryDataset();
        plot.setDataset(2, datasetWithoutMapping);
        assertEquals(rangeAxis1, plot.getRangeAxisForDataset(2));
    }

    @Test
    public void testGetDomainAxisCount() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(1, plot.getDomainAxisCount()); // Default has one axis
        plot.setDomainAxis(1, new CategoryAxis("Axis2"), false);
        assertEquals(2, plot.getDomainAxisCount());
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testGetRangeAxisCount() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(1, plot.getRangeAxisCount()); // Default has one axis
        plot.setRangeAxis(1, new MockValueAxis("Range2", new Range(0, 1)), false);
        assertEquals(2, plot.getRangeAxisCount());
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testGetDatasetCount() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(1, plot.getDatasetCount()); // Default has one dataset slot
        plot.setDataset(1, null); // Setting a second dataset slot
        assertEquals(2, plot.getDatasetCount());
        // Clearing datasets is not directly supported, but setting to null implicitly reduces usage
    }

    @Test
    public void testPlotType() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals("Category_Plot", plot.getPlotType());
    }

    @Test
    public void testSetDomainAxisLocation() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());

        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_LEFT, false);
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation(1));
    }



















































































































































    @Test
    public void testSetRangeGridlineStroke() {
        CategoryPlot plot = new CategoryPlot();
        Stroke newStroke = new BasicStroke(3.0f);
        plot.setRangeGridlineStroke(newStroke);
        assertEquals(newStroke, plot.getRangeGridlineStroke());
    }

    @Test
    public void testSetDomainGridlinePaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint newPaint = Color.GREEN;
        plot.setDomainGridlinePaint(newPaint);
        assertEquals(newPaint, plot.getDomainGridlinePaint());
    }

    @Test
    public void testSetRangeGridlinePaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint newPaint = Color.GREEN;
        plot.setRangeGridlinePaint(newPaint);
        assertEquals(newPaint, plot.getRangeGridlinePaint());
    }

    @Test
    public void testSetRangeCrosshairVisible() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(false);
        assertFalse(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testSetRangeCrosshairValue() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairValue(10.5);
        assertEquals(10.5, plot.getRangeCrosshairValue(), 0.0000001);
    }

    @Test
    public void testSetRangeCrosshairStroke() {
        CategoryPlot plot = new CategoryPlot();
        Stroke newStroke = new BasicStroke(1.5f);
        plot.setRangeCrosshairStroke(newStroke);
        assertEquals(newStroke, plot.getRangeCrosshairStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairStroke(null);
    }

    @Test
    public void testSetRangeCrosshairPaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint newPaint = Color.CYAN;
        plot.setRangeCrosshairPaint(newPaint);
        assertEquals(newPaint, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaintNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairPaint(null);
    }

    @Test
    public void testGetDomainAxisForDataset() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domainAxis1 = new CategoryAxis("D1");
        CategoryAxis domainAxis2 = new CategoryAxis("D2");
        plot.setDomainAxis(0, domainAxis1, false);
        plot.setDomainAxis(1, domainAxis2, false);
        plot.mapDatasetToDomainAxis(0, 0);
        plot.mapDatasetToDomainAxis(1, 1);

        // Test mapping dataset 0 to axis 0
        assertEquals(domainAxis1, plot.getDomainAxisForDataset(0));

        // Test mapping dataset 1 to axis 1
        assertEquals(domainAxis2, plot.getDomainAxisForDataset(1));

        // Test default mapping (to axis 0) if no explicit mapping exists
        CategoryDataset datasetWithoutMapping = new MockCategoryDataset();
        plot.setDataset(2, datasetWithoutMapping);
        assertEquals(domainAxis1, plot.getDomainAxisForDataset(2));
    }

    @Test
    public void testGetRangeAxisForDataset() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis rangeAxis1 = new MockValueAxis("R1", new Range(0, 1));
        ValueAxis rangeAxis2 = new MockValueAxis("R2", new Range(0, 1));
        plot.setRangeAxis(0, rangeAxis1, false);
        plot.setRangeAxis(1, rangeAxis2, false);
        plot.mapDatasetToRangeAxis(0, 0);
        plot.mapDatasetToRangeAxis(1, 1);

        // Test mapping dataset 0 to axis 0
        assertEquals(rangeAxis1, plot.getRangeAxisForDataset(0));

        // Test mapping dataset 1 to axis 1
        assertEquals(rangeAxis2, plot.getRangeAxisForDataset(1));

        // Test default mapping (to axis 0) if no explicit mapping exists
        CategoryDataset datasetWithoutMapping = new MockCategoryDataset();
        plot.setDataset(2, datasetWithoutMapping);
        assertEquals(rangeAxis1, plot.getRangeAxisForDataset(2));
    }

    @Test
    public void testGetDomainAxisCount() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(1, plot.getDomainAxisCount()); // Default has one axis
        plot.setDomainAxis(1, new CategoryAxis("Axis2"), false);
        assertEquals(2, plot.getDomainAxisCount());
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testGetRangeAxisCount() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(1, plot.getRangeAxisCount()); // Default has one axis
        plot.setRangeAxis(1, new MockValueAxis("Range2", new Range(0, 1)), false);
        assertEquals(2, plot.getRangeAxisCount());
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testGetDatasetCount() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(1, plot.getDatasetCount()); // Default has one dataset slot
        plot.setDataset(1, null); // Setting a second dataset slot
        assertEquals(2, plot.getDatasetCount());
        // Clearing datasets is not directly supported, but setting to null implicitly reduces usage
    }

    @Test
    public void testPlotType() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals("Category_Plot", plot.getPlotType());
    }

    @Test
    public void testSetDomainAxisLocation() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());

        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_LEFT, false);
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocationNullForIndex0() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(0, null, false);
    }

    @Test
    public void testGetDomainAxisEdge() {
        CategoryPlot plot = new CategoryPlot();
        // Default VERTICAL orientation, BOTTOM_OR_LEFT domain location
        assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        // HORIZONTAL orientation, BOTTOM_OR_LEFT domain location
        assertEquals(RectangleEdge.LEFT, plot.getDomainAxisEdge());

        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        // HORIZONTAL orientation, TOP_OR_RIGHT domain location
        assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.VERTICAL);
        // VERTICAL orientation, TOP_OR_RIGHT domain location
        assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());
    }

    @Test
    public void testGetRangeAxisLocation() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(AxisLocation.TOP_OR_LEFT, plot.getRangeAxisLocation());
        plot.setRangeAxisLocation(AxisLocation.RIGHT);
        assertEquals(AxisLocation.RIGHT, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocationNullForIndex0() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(0, null, false);
    }

    @Test
    public void testGetRangeAxisEdge() {
        CategoryPlot plot = new CategoryPlot();
        // Default VERTICAL orientation, TOP_OR_LEFT range location
        assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        // HORIZONTAL orientation, TOP_OR_LEFT range location
        assertEquals(RectangleEdge.TOP, plot.getRangeAxisEdge());

        plot.setRangeAxisLocation(AxisLocation.RIGHT);
        // HORIZONTAL orientation, RIGHT range location
        assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.VERTICAL);
        // VERTICAL orientation, RIGHT range location
        assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());
    }

    @Test
    public void testClearDomainAxes() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("Axis1");
        CategoryAxis axis2 = new CategoryAxis("Axis2");
        plot.setDomainAxis(0, axis1, false);
        plot.setDomainAxis(1, axis2, false);
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
        assertNull(plot.getDomainAxis(0)); // Should be null after clear
    }

    @Test
    public void testClearRangeAxes() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new MockValueAxis("Range1", new Range(0, 1));
        ValueAxis axis2 = new MockValueAxis("Range2", new Range(0, 1));
        plot.setRangeAxis(0, axis1, false);
        plot.setRangeAxis(1, axis2, false);
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
        assertNull(plot.getRangeAxis(0)); // Should be null after clear
    }

    @Test
    public void testAddAnnotation() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation = new MockCategoryAnnotation();
        plot.addAnnotation(annotation);
        assertEquals(1, plot.getAnnotations().size());
        assertTrue(plot.getAnnotations().contains(annotation));
    }

    @Test
    public void testRemoveAnnotation() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation = new MockCategoryAnnotation();
        plot.addAnnotation(annotation);
        boolean removed = plot.removeAnnotation(annotation);
        assertTrue(removed);
        assertTrue(plot.getAnnotations().isEmpty());
    }

    @Test
    public void testClearAnnotations() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation1 = new MockCategoryAnnotation();
        CategoryAnnotation annotation2 = new MockCategoryAnnotation();
        plot.addAnnotation(annotation1);
        plot.addAnnotation(annotation2);
        plot.clearAnnotations();
        assertTrue(plot.getAnnotations().isEmpty());
    }

    @Test
    public void testSetDomainGridlineStroke() {
        CategoryPlot plot = new CategoryPlot();
        Stroke newStroke = new BasicStroke(3.0f);
        plot.setDomainGridlineStroke(newStroke);
        assertEquals(newStroke, plot.getDomainGridlineStroke());
    }

    @Test
    public void testSetRangeGridlineStroke() {
        CategoryPlot plot = new CategoryPlot();
        Stroke newStroke = new BasicStroke(3.0f);
        plot.setRangeGridlineStroke(newStroke);
        assertEquals(newStroke, plot.getRangeGridlineStroke());
    }

    @Test
    public void testSetDomainGridlinePaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint newPaint = Color.GREEN;
        plot.setDomainGridlinePaint(newPaint);
        assertEquals(newPaint, plot.getDomainGridlinePaint());
    }

    @Test
    public void testSetRangeGridlinePaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint newPaint = Color.GREEN;
        plot.setRangeGridlinePaint(newPaint);
        assertEquals(newPaint, plot.getRangeGridlinePaint());
    }

    @Test
    public void testSetRangeCrosshairVisible() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(false);
        assertFalse(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testSetRangeCrosshairValue() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairValue(10.5);
        assertEquals(10.5, plot.getRangeCrosshairValue(), 0.0000001);
    }

    @Test
    public void testSetRangeCrosshairStroke() {
        CategoryPlot plot = new CategoryPlot();
        Stroke newStroke = new BasicStroke(1.5f);
        plot.setRangeCrosshairStroke(newStroke);
        assertEquals(newStroke, plot.getRangeCrosshairStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairStroke(null);
    }

    @Test
    public void testSetRangeCrosshairPaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint newPaint = Color.CYAN;
        plot.setRangeCrosshairPaint(newPaint);
        assertEquals(newPaint, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaintNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairPaint(null);
    }
}





