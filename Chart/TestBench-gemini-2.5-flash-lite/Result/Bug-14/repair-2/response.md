```java
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
// Assuming BarRenderer and AreaRenderer are available within the scope of Chart.
// LineRenderer is not directly available in the provided source, will use AreaRenderer for demonstration.
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.axis.NumberAxis;


public class CategoryPlotTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDefaultConstructor() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertNotNull(plot);
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0), plot.getAxisOffset());
        assertEquals(1, plot.getDomainAxisCount());
        assertNull(plot.getDomainAxis(0));
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation(0));
        assertEquals(1, plot.getRangeAxisCount());
        assertNull(plot.getRangeAxis(0));
        assertEquals(AxisLocation.TOP_OR_LEFT, plot.getRangeAxisLocation(0));
        assertEquals(1, plot.getDatasetCount());
        assertNull(plot.getDataset(0));
        // The CategoryPlot class itself does not directly expose a getRendererCount() method.
        // We can check if the getter for a specific renderer index returns a non-null value
        // if a renderer was set, or if the default constructor sets one.
        // The default constructor initializes renderers with null.
        assertNull(plot.getRenderer(0)); // Default constructor sets renderer to null
        assertFalse(plot.isDomainGridlinesVisible());
        assertEquals(CategoryAnchor.MIDDLE, plot.getDomainGridlinePosition());
        assertEquals(CategoryPlot.DEFAULT_GRIDLINE_STROKE, plot.getDomainGridlineStroke());
        assertEquals(CategoryPlot.DEFAULT_GRIDLINE_PAINT, plot.getDomainGridlinePaint());
        assertTrue(plot.isRangeGridlinesVisible());
        assertEquals(CategoryPlot.DEFAULT_GRIDLINE_STROKE, plot.getRangeGridlineStroke());
        assertEquals(CategoryPlot.DEFAULT_GRIDLINE_PAINT, plot.getRangeGridlinePaint());
        assertNull(plot.getFixedLegendItems());
    }

    @Test
    public void testConstructorWithDatasetAxisRenderer() throws Exception {
        CategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        ValueAxis rangeAxis = new NumberAxis("Range");
        CategoryItemRenderer renderer = new AreaRenderer();

        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        assertNotNull(plot);
        assertEquals(dataset, plot.getDataset(0));
        assertEquals(domainAxis, plot.getDomainAxis(0));
        assertEquals(rangeAxis, plot.getRangeAxis(0));
        assertEquals(renderer, plot.getRenderer(0));
    }

    @Test
    public void testSetOrientation() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(null);
    }

    @Test
    public void testSetAxisOffset() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        RectangleInsets offset = new RectangleInsets(10, 10, 10, 10);
        plot.setAxisOffset(offset);
        assertEquals(offset, plot.getAxisOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void testSetDomainAxis() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("New Domain");
        plot.setDomainAxis(axis);
        assertEquals(axis, plot.getDomainAxis());
    }

    @Test
    public void testSetDomainAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("D1");
        CategoryAxis axis2 = new CategoryAxis("D2");
        plot.setDomainAxes(new CategoryAxis[]{axis1, axis2});
        assertEquals(2, plot.getDomainAxisCount());
        assertEquals(axis1, plot.getDomainAxis(0));
        assertEquals(axis2, plot.getDomainAxis(1));
    }

    @Test
    public void testClearDomainAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("D1");
        CategoryAxis axis2 = new CategoryAxis("D2");
        plot.setDomainAxes(new CategoryAxis[]{axis1, axis2});
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testGetDomainAxisIndex() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("D1");
        CategoryAxis axis2 = new CategoryAxis("D2");
        plot.setDomainAxis(0, axis1);
        plot.setDomainAxis(1, axis2);
        assertEquals(0, plot.getDomainAxisIndex(axis1));
        assertEquals(1, plot.getDomainAxisIndex(axis2));
        assertEquals(-1, plot.getDomainAxisIndex(new CategoryAxis("D3")));
    }

    @Test
    public void testSetDomainAxisLocation() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocationNullForIndex0() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(0, null);
    }

    @Test
    public void testGetDomainAxisEdge() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge());
    }

    @Test
    public void testSetRangeAxis() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new NumberAxis("New Range");
        plot.setRangeAxis(axis);
        assertEquals(axis, plot.getRangeAxis());
    }

    @Test
    public void testSetRangeAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new NumberAxis("R1");
        ValueAxis axis2 = new NumberAxis("R2");
        plot.setRangeAxes(new ValueAxis[]{axis1, axis2});
        assertEquals(2, plot.getRangeAxisCount());
        assertEquals(axis1, plot.getRangeAxis(0));
        assertEquals(axis2, plot.getRangeAxis(1));
    }

    @Test
    public void testClearRangeAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new NumberAxis("R1");
        ValueAxis axis2 = new NumberAxis("R2");
        plot.setRangeAxes(new ValueAxis[]{axis1, axis2});
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testGetRangeAxisIndex() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new NumberAxis("R1");
        ValueAxis axis2 = new NumberAxis("R2");
        plot.setRangeAxis(0, axis1);
        plot.setRangeAxis(1, axis2);
        assertEquals(0, plot.getRangeAxisIndex(axis1));
        assertEquals(1, plot.getRangeAxisIndex(axis2));
        assertEquals(-1, plot.getRangeAxisIndex(new NumberAxis("R3")));
    }

    @Test
    public void testSetRangeAxisLocation() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocationNullForIndex0() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(0, null);
    }

    @Test
    public void testGetRangeAxisEdge() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_LEFT);
        assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(RectangleEdge.BOTTOM, plot.getRangeAxisEdge());
    }

    @Test
    public void testSetDataset() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset = new DefaultCategoryDataset();
        plot.setDataset(dataset);
        assertEquals(dataset, plot.getDataset());
    }

    @Test
    public void testGetDatasetCount() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        // The internal datasets list is initialized with size 1 in the constructor.
        assertEquals(1, plot.getDatasetCount());
        // To test adding more datasets, we need to use setDataset which handles size.
        plot.setDataset(1, new DefaultCategoryDataset());
        assertEquals(2, plot.getDatasetCount());
    }

    @Test
    public void testMapDatasetToDomainAxis() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("A1");
        CategoryAxis axis2 = new CategoryAxis("A2");
        plot.setDomainAxis(0, axis1);
        plot.setDomainAxis(1, axis2);
        plot.mapDatasetToDomainAxis(0, 1);
        assertEquals(axis2, plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testMapDatasetToRangeAxis() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new NumberAxis("A1");
        ValueAxis axis2 = new NumberAxis("A2");
        plot.setRangeAxis(0, axis1);
        plot.setRangeAxis(1, axis2);
        plot.mapDatasetToRangeAxis(0, 1);
        assertEquals(axis2, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testSetRenderer() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer = new BarRenderer();
        plot.setRenderer(renderer);
        assertEquals(renderer, plot.getRenderer());
    }

    @Test
    public void testSetRenderers() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer1 = new BarRenderer();
        CategoryItemRenderer renderer2 = new AreaRenderer(); // Using AreaRenderer as LineRenderer is not directly available.
        plot.setRenderers(new CategoryItemRenderer[]{renderer1, renderer2});
        // CategoryPlot does not have a public getRendererCount() method.
        // We test by checking individual renderers.
        assertEquals(renderer1, plot.getRenderer(0));
        assertEquals(renderer2, plot.getRenderer(1));
    }

    @Test
    public void testGetRendererForDataset() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset1 = new DefaultCategoryDataset();
        CategoryDataset dataset2 = new DefaultCategoryDataset();
        CategoryItemRenderer renderer1 = new BarRenderer();
        CategoryItemRenderer renderer2 = new AreaRenderer(); // Using AreaRenderer

        plot.setDataset(0, dataset1);
        plot.setRenderer(0, renderer1);
        plot.setDataset(1, dataset2);
        plot.setRenderer(1, renderer2);

        assertEquals(renderer1, plot.getRendererForDataset(dataset1));
        assertEquals(renderer2, plot.getRendererForDataset(dataset2));
    }

    @Test
    public void testGetIndexOfRenderer() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer1 = new BarRenderer();
        CategoryItemRenderer renderer2 = new AreaRenderer(); // Using AreaRenderer
        plot.setRenderer(0, renderer1);
        plot.setRenderer(1, renderer2);
        assertEquals(0, plot.getIndexOf(renderer1));
        assertEquals(1, plot.getIndexOf(renderer2));
        assertEquals(-1, plot.getIndexOf(new BarRenderer())); // Use a different instance
    }

    @Test
    public void testSetDatasetRenderingOrder() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrderNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDatasetRenderingOrder(null);
    }

    @Test
    public void testSetColumnRenderingOrder() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetColumnRenderingOrderNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setColumnRenderingOrder(null);
    }

    @Test
    public void testSetRowRenderingOrder() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRowRenderingOrderNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRowRenderingOrder(null);
    }

    @Test
    public void testSetDomainGridlinesVisible() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testSetDomainGridlinePosition() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePosition(CategoryAnchor.START);
        assertEquals(CategoryAnchor.START, plot.getDomainGridlinePosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePositionNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePosition(null);
    }

    @Test
    public void testSetDomainGridlineStroke() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(stroke);
        assertEquals(stroke, plot.getDomainGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStrokeNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlineStroke(null);
    }

    @Test
    public void testSetDomainGridlinePaint() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        Paint paint = Color.RED;
        plot.setDomainGridlinePaint(paint);
        assertEquals(paint, plot.getDomainGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaintNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void testSetRangeGridlinesVisible() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(true);
        assertTrue(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testSetRangeGridlineStroke() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        Stroke stroke = new BasicStroke(3.0f);
        plot.setRangeGridlineStroke(stroke);
        assertEquals(stroke, plot.getRangeGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStrokeNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlineStroke(null);
    }

    @Test
    public void testSetRangeGridlinePaint() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        Paint paint = Color.GREEN;
        plot.setRangeGridlinePaint(paint);
        assertEquals(paint, plot.getRangeGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaintNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlinePaint(null);
    }

    @Test
    public void testSetFixedLegendItems() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        LegendItemCollection items = new LegendItemCollection();
        items.add(new LegendItem("Label", null, null, null, new Rectangle2D.Double(0,0,10,10), Color.BLACK));
        plot.setFixedLegendItems(items);
        assertEquals(items, plot.getFixedLegendItems());
    }

    @Test
    public void testGetLegendItemsWithFixedItems() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        LegendItemCollection items = new LegendItemCollection();
        items.add(new LegendItem("Label", null, null, null, new Rectangle2D.Double(0,0,10,10), Color.BLACK));
        plot.setFixedLegendItems(items);
        assertEquals(items, plot.getLegendItems());
    }

    @Test
    public void testGetLegendItemsWithoutFixedItems() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset = new DefaultCategoryDataset();
        CategoryItemRenderer renderer = new BarRenderer(); // Using a concrete renderer
        plot.setDataset(dataset);
        plot.setRenderer(renderer);

        // Add a dummy series to the dataset so getLegendItem is called
        ((DefaultCategoryDataset) dataset).addValue(1.0, "S1", "C1");

        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        // The exact number of items depends on the renderer's implementation of getLegendItem.
        // For BarRenderer, it might create one item per series.
        // We'll assert that at least one item is generated.
        assertTrue(items.getItemCount() > 0);
    }

    @Test
    public void testGetPlotType() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertEquals("Category_Plot", plot.getPlotType());
    }

    @Test
    public void testGetDomainAxisForDataset() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("A1");
        CategoryAxis axis2 = new CategoryAxis("A2");
        plot.setDomainAxis(0, axis1);
        plot.setDomainAxis(1, axis2);
        // Default mapping for dataset 0 to axis 0
        assertEquals(axis1, plot.getDomainAxisForDataset(0));
        // Explicitly map dataset 1 to axis 1
        plot.mapDatasetToDomainAxis(1, 1);
        assertEquals(axis2, plot.getDomainAxisForDataset(1));
    }

    @Test
    public void testGetRangeAxisForDataset() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new NumberAxis("A1");
        ValueAxis axis2 = new NumberAxis("A2");
        plot.setRangeAxis(0, axis1);
        plot.setRangeAxis(1, axis2);
        // Default mapping for dataset 0 to axis 0
        assertEquals(axis1, plot.getRangeAxisForDataset(0));
        // Explicitly map dataset 1 to axis 1
        plot.mapDatasetToRangeAxis(1, 1);
        assertEquals(axis2, plot.getRangeAxisForDataset(1));
    }

    // Additional tests to cover more methods and edge cases

    @Test
    public void testDomainGridlinesVisibleToggle() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testRangeGridlinesVisibleToggle() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertTrue(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(true);
        assertTrue(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testDomainAxisLocations() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(0, AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation(0));
        plot.setDomainAxisLocation(1, AxisLocation.TOP_OR_LEFT);
        assertEquals(AxisLocation.TOP_OR_LEFT, plot.getDomainAxisLocation(1));
    }

    @Test
    public void testRangeAxisLocations() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(0, AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation(0));
        plot.setRangeAxisLocation(1, AxisLocation.BOTTOM_OR_LEFT);
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getRangeAxisLocation(1));
    }

    @Test
    public void testGetDomainAxisEdgeWithIndex() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setDomainAxisLocation(0, AxisLocation.TOP_OR_LEFT);
        assertEquals(RectangleEdge.LEFT, plot.getDomainAxisEdge(0));
        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge(1));
    }

    @Test
    public void testGetRangeAxisEdgeWithIndex() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setRangeAxisLocation(0, AxisLocation.TOP_OR_LEFT);
        assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge(0));
        plot.setRangeAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(RectangleEdge.BOTTOM, plot.getRangeAxisEdge(1));
    }

    @Test
    public void testSetDomainGridlineStroke() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        BasicStroke newStroke = new BasicStroke(1.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 10.0f, new float[]{5.0f}, 0.0f);
        plot.setDomainGridlineStroke(newStroke);
        assertEquals(newStroke, plot.getDomainGridlineStroke());
    }

    @Test
    public void testSetRangeGridlineStroke() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        BasicStroke newStroke = new BasicStroke(2.5f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL, 5.0f, new float[]{10.0f}, 0.0f);
        plot.setRangeGridlineStroke(newStroke);
        assertEquals(newStroke, plot.getRangeGridlineStroke());
    }

    @Test
    public void testDomainGridlinePaint() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePaint(Color.CYAN);
        assertEquals(Color.CYAN, plot.getDomainGridlinePaint());
    }

    @Test
    public void testRangeGridlinePaint() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeGridlinePaint(Color.MAGENTA);
        assertEquals(Color.MAGENTA, plot.getRangeGridlinePaint());
    }

    @Test
    public void testSetFixedLegendItemsToNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        LegendItemCollection items = new LegendItemCollection();
        items.add(new LegendItem("Label", null, null, null, new Rectangle2D.Double(0,0,10,10), Color.BLACK));
        plot.setFixedLegendItems(items);
        assertNotNull(plot.getFixedLegendItems());
        plot.setFixedLegendItems(null);
        assertNull(plot.getFixedLegendItems());
    }
}
```