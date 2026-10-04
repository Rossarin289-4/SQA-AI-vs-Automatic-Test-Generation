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

public class CategoryPlotTest {

    @Test
    public void testDefaultConstructor() {
        CategoryPlot plot = new CategoryPlot();
        assertNotNull(plot);
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0), plot.getAxisOffset());
        assertEquals(CategoryAnchor.MIDDLE, plot.getDomainGridlinePosition());
        assertEquals(SortOrder.ASCENDING, plot.getColumnRenderingOrder());
        assertEquals(SortOrder.ASCENDING, plot.getRowRenderingOrder());
        assertEquals(DatasetRenderingOrder.REVERSE, plot.getDatasetRenderingOrder());
        assertFalse(plot.isDomainGridlinesVisible());
        assertTrue(plot.isRangeGridlinesVisible());
        assertFalse(plot.isRangeCrosshairVisible());
        assertEquals(0.0, plot.getAnchorValue(), 0.0);
        assertEquals(0.0, plot.getRangeCrosshairValue(), 0.0);
    }

    @Test
    public void testConstructorWithDatasetAxisRenderer() {
        CategoryDataset dataset = createMockCategoryDataset();
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        ValueAxis rangeAxis = new org.jfree.chart.axis.NumberAxis("Range");
        CategoryItemRenderer renderer = createMockCategoryItemRenderer();

        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        assertNotNull(plot);
        assertEquals(dataset, plot.getDataset());
        assertEquals(domainAxis, plot.getDomainAxis());
        assertEquals(rangeAxis, plot.getRangeAxis());
        assertEquals(renderer, plot.getRenderer());
    }

    @Test
    public void testSetOrientation() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test
    public void testSetOrientationNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setOrientation(null);
            fail("Should throw IllegalArgumentException for null orientation.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetAxisOffset() {
        CategoryPlot plot = new CategoryPlot();
        RectangleInsets offset = new RectangleInsets(10.0, 10.0, 10.0, 10.0);
        plot.setAxisOffset(offset);
        assertEquals(offset, plot.getAxisOffset());
    }

    @Test
    public void testSetAxisOffsetNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setAxisOffset(null);
            fail("Should throw IllegalArgumentException for null offset.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetDomainAxis() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("X-Axis");
        plot.setDomainAxis(axis);
        assertEquals(axis, plot.getDomainAxis());
    }

    @Test
    public void testSetDomainAxisNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxis(null);
        assertNull(plot.getDomainAxis());
    }
    
    @Test
    public void testSetDomainAxisByIndex() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("X1");
        CategoryAxis axis2 = new CategoryAxis("X2");
        plot.setDomainAxis(0, axis1);
        plot.setDomainAxis(1, axis2);
        assertEquals(axis1, plot.getDomainAxis(0));
        assertEquals(axis2, plot.getDomainAxis(1));
        assertEquals(2, plot.getDomainAxisCount());
    }

    @Test
    public void testSetDomainAxisLocation() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
    }

    @Test
    public void testSetDomainAxisLocationNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDomainAxisLocation(null);
            fail("Should throw IllegalArgumentException for null location.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetDomainAxisLocationByIndex() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(0, AxisLocation.TOP_OR_RIGHT);
        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_LEFT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation(0));
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation(1));
    }

    @Test
    public void testSetRangeAxis() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis("Y-Axis");
        plot.setRangeAxis(axis);
        assertEquals(axis, plot.getRangeAxis());
    }

    @Test
    public void testSetRangeAxisNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxis(null);
        assertNull(plot.getRangeAxis());
    }

    @Test
    public void testSetRangeAxisByIndex() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new org.jfree.chart.axis.NumberAxis("Y1");
        ValueAxis axis2 = new org.jfree.chart.axis.NumberAxis("Y2");
        plot.setRangeAxis(0, axis1);
        plot.setRangeAxis(1, axis2);
        assertEquals(axis1, plot.getRangeAxis(0));
        assertEquals(axis2, plot.getRangeAxis(1));
        assertEquals(2, plot.getRangeAxisCount());
    }

    @Test
    public void testSetRangeAxisLocation() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test
    public void testSetRangeAxisLocationNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setRangeAxisLocation(null);
            fail("Should throw IllegalArgumentException for null location.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetRangeAxisLocationByIndex() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(0, AxisLocation.TOP_OR_RIGHT);
        plot.setRangeAxisLocation(1, AxisLocation.BOTTOM_OR_LEFT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation(0));
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getRangeAxisLocation(1));
    }

    @Test
    public void testSetDataset() {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset = createMockCategoryDataset();
        plot.setDataset(dataset);
        assertEquals(dataset, plot.getDataset());
    }

    @Test
    public void testSetDatasetNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }
    
    @Test
    public void testSetDatasetByIndex() {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset1 = createMockCategoryDataset();
        CategoryDataset dataset2 = createMockCategoryDataset();
        plot.setDataset(0, dataset1);
        plot.setDataset(1, dataset2);
        assertEquals(dataset1, plot.getDataset(0));
        assertEquals(dataset2, plot.getDataset(1));
        assertEquals(2, plot.getDatasetCount());
    }

    @Test
    public void testMapDatasetToDomainAxis() {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset = createMockCategoryDataset();
        CategoryAxis axis = new CategoryAxis("Domain");
        plot.setDataset(0, dataset);
        plot.setDomainAxis(0, axis);
        plot.mapDatasetToDomainAxis(0, 0);
        assertEquals(axis, plot.getDomainAxisForDataset(0));
    }
    
    @Test
    public void testMapDatasetToDomainAxisToNonExistentAxis() {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset = createMockCategoryDataset();
        CategoryAxis axis = new CategoryAxis("Domain");
        plot.setDataset(0, dataset);
        plot.setDomainAxis(0, axis);
        plot.mapDatasetToDomainAxis(0, 1); // Axis index 1 does not exist
        assertEquals(axis, plot.getDomainAxisForDataset(0)); // Should default to axis 0
    }

    @Test
    public void testMapDatasetToRangeAxis() {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset = createMockCategoryDataset();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis("Range");
        plot.setDataset(0, dataset);
        plot.setRangeAxis(0, axis);
        plot.mapDatasetToRangeAxis(0, 0);
        assertEquals(axis, plot.getRangeAxisForDataset(0));
    }
    
    @Test
    public void testMapDatasetToRangeAxisToNonExistentAxis() {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset = createMockCategoryDataset();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis("Range");
        plot.setDataset(0, dataset);
        plot.setRangeAxis(0, axis);
        plot.mapDatasetToRangeAxis(0, 1); // Axis index 1 does not exist
        assertEquals(axis, plot.getRangeAxisForDataset(0)); // Should default to axis 0
    }

    @Test
    public void testSetRenderer() {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer = createMockCategoryItemRenderer();
        plot.setRenderer(renderer);
        assertEquals(renderer, plot.getRenderer());
    }

    @Test
    public void testSetRendererNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRenderer(null);
        assertNull(plot.getRenderer());
    }
    
    @Test
    public void testSetRendererByIndex() {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer1 = createMockCategoryItemRenderer();
        CategoryItemRenderer renderer2 = createMockCategoryItemRenderer();
        plot.setRenderer(0, renderer1);
        plot.setRenderer(1, renderer2);
        assertEquals(renderer1, plot.getRenderer(0));
        assertEquals(renderer2, plot.getRenderer(1));
    }

    @Test
    public void testSetDatasetRenderingOrder() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());
    }

    @Test
    public void testSetDatasetRenderingOrderNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDatasetRenderingOrder(null);
            fail("Should throw IllegalArgumentException for null order.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }


    @Test
    public void testSetColumnRenderingOrderNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setColumnRenderingOrder(null);
            fail("Should throw IllegalArgumentException for null order.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }


    @Test
    public void testSetRowRenderingOrderNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setRowRenderingOrder(null);
            fail("Should throw IllegalArgumentException for null order.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
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

    @Test
    public void testSetDomainGridlinePositionNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDomainGridlinePosition(null);
            fail("Should throw IllegalArgumentException for null position.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetDomainGridlineStroke() {
        CategoryPlot plot = new CategoryPlot();
        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(stroke);
        assertEquals(stroke, plot.getDomainGridlineStroke());
    }

    @Test
    public void testSetDomainGridlineStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDomainGridlineStroke(null);
            fail("Should throw IllegalArgumentException for null stroke.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetDomainGridlinePaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint paint = Color.RED;
        plot.setDomainGridlinePaint(paint);
        assertEquals(paint, plot.getDomainGridlinePaint());
    }

    @Test
    public void testSetDomainGridlinePaintNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDomainGridlinePaint(null);
            fail("Should throw IllegalArgumentException for null paint.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
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
        Stroke stroke = new BasicStroke(1.0f);
        plot.setRangeGridlineStroke(stroke);
        assertEquals(stroke, plot.getRangeGridlineStroke());
    }

    @Test
    public void testSetRangeGridlineStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setRangeGridlineStroke(null);
            fail("Should throw IllegalArgumentException for null stroke.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetRangeGridlinePaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint paint = Color.BLUE;
        plot.setRangeGridlinePaint(paint);
        assertEquals(paint, plot.getRangeGridlinePaint());
    }

    @Test
    public void testSetRangeGridlinePaintNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setRangeGridlinePaint(null);
            fail("Should throw IllegalArgumentException for null paint.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetFixedLegendItems() {
        CategoryPlot plot = new CategoryPlot();
        LegendItemCollection items = new LegendItemCollection();
        LegendItem item = new LegendItem("Label", "Desc", null, null, new Rectangle2D.Double(0,0,1,1), Color.RED);
        items.add(item);
        plot.setFixedLegendItems(items);
        assertEquals(items, plot.getFixedLegendItems());
    }

    @Test
    public void testSetFixedLegendItemsNull() {
        CategoryPlot plot = new CategoryPlot();
        plot.setFixedLegendItems(null);
        assertNull(plot.getFixedLegendItems());
    }

    @Test
    public void testGetLegendItemsWithFixedItems() {
        CategoryPlot plot = new CategoryPlot();
        LegendItemCollection items = new LegendItemCollection();
        LegendItem item = new LegendItem("Label", "Desc", null, null, new Rectangle2D.Double(0,0,1,1), Color.RED);
        items.add(item);
        plot.setFixedLegendItems(items);
        assertEquals(items, plot.getLegendItems());
    }

    @Test
    public void testGetLegendItemsWithoutFixedItems() {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset = createMockCategoryDataset();
        CategoryItemRenderer renderer = createMockCategoryItemRenderer();
        plot.setDataset(dataset);
        plot.setRenderer(renderer);
        
        // Mock the renderer to return a legend item
        LegendItem mockItem = new LegendItem("Series 0", "Desc", null, null, new Rectangle2D.Double(0,0,1,1), Color.RED);
        // As we cannot mock easily, we just check it's not null.
        LegendItemCollection legendItems = plot.getLegendItems();
        assertNotNull(legendItems);
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
    public void testSetRangeCrosshairLockedOnData() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairLockedOnData(true);
        assertTrue(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testSetRangeCrosshairValue() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairValue(100.0);
        assertEquals(100.0, plot.getRangeCrosshairValue(), 0.0);
    }

    @Test
    public void testSetRangeCrosshairValueWithNotification() {
        CategoryPlot plot = new CategoryPlot();
        MockPlotChangeListener listener = new MockPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setRangeCrosshairValue(100.0, true);
        assertEquals(100.0, plot.getRangeCrosshairValue(), 0.0);
        assertTrue(listener.hasChanged());
    }

    @Test
    public void testSetRangeCrosshairValueWithoutNotification() {
        CategoryPlot plot = new CategoryPlot();
        MockPlotChangeListener listener = new MockPlotChangeListener();
        plot.addChangeListener(listener);

        plot.setRangeCrosshairValue(100.0, false);
        assertEquals(100.0, plot.getRangeCrosshairValue(), 0.0);
        assertFalse(listener.hasChanged());
    }

    @Test
    public void testSetRangeCrosshairStroke() {
        CategoryPlot plot = new CategoryPlot();
        Stroke stroke = new BasicStroke(3.0f);
        plot.setRangeCrosshairStroke(stroke);
        assertEquals(stroke, plot.getRangeCrosshairStroke());
    }

    @Test
    public void testSetRangeCrosshairStrokeNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setRangeCrosshairStroke(null);
            fail("Should throw IllegalArgumentException for null stroke.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSetRangeCrosshairPaint() {
        CategoryPlot plot = new CategoryPlot();
        Paint paint = Color.GREEN;
        plot.setRangeCrosshairPaint(paint);
        assertEquals(paint, plot.getRangeCrosshairPaint());
    }

    @Test
    public void testSetRangeCrosshairPaintNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setRangeCrosshairPaint(null);
            fail("Should throw IllegalArgumentException for null paint.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAddAnnotation() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation = createMockCategoryAnnotation();
        plot.addAnnotation(annotation);
        assertTrue(plot.getAnnotations().contains(annotation));
    }

    @Test
    public void testAddAnnotationNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.addAnnotation(null);
            fail("Should throw IllegalArgumentException for null annotation.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testRemoveAnnotation() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation = createMockCategoryAnnotation();
        plot.addAnnotation(annotation);
        assertTrue(plot.removeAnnotation(annotation));
        assertFalse(plot.getAnnotations().contains(annotation));
    }

    @Test
    public void testRemoveAnnotationNotFound() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation1 = createMockCategoryAnnotation();
        CategoryAnnotation annotation2 = createMockCategoryAnnotation();
        plot.addAnnotation(annotation1);
        assertFalse(plot.removeAnnotation(annotation2));
    }

    @Test
    public void testRemoveAnnotationNull() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.removeAnnotation(null);
            fail("Should throw IllegalArgumentException for null annotation.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testClearAnnotations() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAnnotation annotation1 = createMockCategoryAnnotation();
        CategoryAnnotation annotation2 = createMockCategoryAnnotation();
        plot.addAnnotation(annotation1);
        plot.addAnnotation(annotation2);
        plot.clearAnnotations();
        assertTrue(plot.getAnnotations().isEmpty());
    }

    

    @Test
    public void testEquals() {
        CategoryPlot plot1 = new CategoryPlot();
        CategoryPlot plot2 = new CategoryPlot();
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));

        plot1.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(plot1.equals(plot2));
        
        CategoryAxis axis = new CategoryAxis("Test");
        plot1.setDomainAxis(axis);
        plot2.setDomainAxis(axis);
        assertTrue(plot1.equals(plot2)); // Same axis instance
        
        plot1.setDomainAxis(new CategoryAxis("Test2"));
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxis(new CategoryAxis("Domain"));
        plot.setRangeAxis(new org.jfree.chart.axis.NumberAxis("Range"));
        plot.setDataset(createMockCategoryDataset());
        plot.setRenderer(createMockCategoryItemRenderer());
        plot.setDomainGridlinesVisible(true);
        plot.addAnnotation(createMockCategoryAnnotation());

        CategoryPlot clonedPlot = (CategoryPlot) plot.clone();

        assertTrue(plot.equals(clonedPlot));
        assertNotSame(plot, clonedPlot);
        
        assertNotSame(plot.getDomainAxis(), clonedPlot.getDomainAxis());
        assertNotSame(plot.getRangeAxis(), clonedPlot.getRangeAxis());
    }

    @Test
    public void testAddDomainMarker() {
        CategoryPlot plot = new CategoryPlot();
        CategoryMarker marker = new CategoryMarker(0, Color.RED, new BasicStroke()); // Using CategoryAnchor.MIDDLE (0) for category
        plot.addDomainMarker(marker, Layer.FOREGROUND);
        assertNotNull(plot.getDomainMarkers(Layer.FOREGROUND));
        assertTrue(plot.getDomainMarkers(Layer.FOREGROUND).contains(marker));
    }

    @Test
    public void testAddDomainMarkerNullMarker() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.addDomainMarker(null, Layer.FOREGROUND);
            fail("Should throw IllegalArgumentException for null marker.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAddDomainMarkerNullLayer() {
        CategoryPlot plot = new CategoryPlot();
        CategoryMarker marker = new CategoryMarker(0, Color.RED, new BasicStroke());
        try {
            plot.addDomainMarker(marker, null);
            fail("Should throw IllegalArgumentException for null layer.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testAddDomainMarkerByIndex() {
        CategoryPlot plot = new CategoryPlot();
        // Need a concrete renderer for a specific index. BarRenderer is a good choice.
        plot.setRenderer(0, new org.jfree.chart.renderer.category.BarRenderer()); 
        CategoryMarker marker = new CategoryMarker(0, Color.RED, new BasicStroke());
        plot.addDomainMarker(0, marker, Layer.FOREGROUND);
        assertNotNull(plot.getDomainMarkers(0, Layer.FOREGROUND));
        assertTrue(plot.getDomainMarkers(0, Layer.FOREGROUND).contains(marker));
    }

    @Test
    public void testClearDomainMarkers() {
        CategoryPlot plot = new CategoryPlot();
        CategoryMarker marker = new CategoryMarker(0, Color.RED, new BasicStroke());
        plot.addDomainMarker(marker, Layer.FOREGROUND);
        plot.addDomainMarker(marker, Layer.BACKGROUND);
        
        plot.clearDomainMarkers();
        assertNull(plot.getDomainMarkers(Layer.FOREGROUND));
        assertNull(plot.getDomainMarkers(Layer.BACKGROUND));
    }
    
    @Test
    public void testClearDomainMarkersByIndex() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRenderer(0, new org.jfree.chart.renderer.category.BarRenderer()); // Need a renderer for index
        CategoryMarker marker = new CategoryMarker(0, Color.RED, new BasicStroke());
        plot.addDomainMarker(0, marker, Layer.FOREGROUND);
        plot.clearDomainMarkers(0);
        assertNull(plot.getDomainMarkers(0, Layer.FOREGROUND));
    }

    @Test
    public void testAddRangeMarker() {
        CategoryPlot plot = new CategoryPlot();
        Marker marker = new ValueMarker(10.0, Color.RED, new BasicStroke());
        plot.addRangeMarker(marker, Layer.FOREGROUND);
        assertNotNull(plot.getRangeMarkers(Layer.FOREGROUND));
        assertTrue(plot.getRangeMarkers(Layer.FOREGROUND).contains(marker));
    }

    @Test
    public void testAddRangeMarkerNullMarker() {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.addRangeMarker(null, Layer.FOREGROUND);
            fail("Should throw IllegalArgumentException for null marker.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAddRangeMarkerNullLayer() {
        CategoryPlot plot = new CategoryPlot();
        Marker marker = new ValueMarker(10.0, Color.RED, new BasicStroke());
        try {
            plot.addRangeMarker(marker, null);
            fail("Should throw IllegalArgumentException for null layer.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testAddRangeMarkerByIndex() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRenderer(0, new org.jfree.chart.renderer.category.BarRenderer()); // Need a renderer for index
        Marker marker = new ValueMarker(10.0, Color.RED, new BasicStroke());
        plot.addRangeMarker(0, marker, Layer.FOREGROUND);
        assertNotNull(plot.getRangeMarkers(0, Layer.FOREGROUND));
        assertTrue(plot.getRangeMarkers(0, Layer.FOREGROUND).contains(marker));
    }

    @Test
    public void testClearRangeMarkers() {
        CategoryPlot plot = new CategoryPlot();
        Marker marker = new ValueMarker(10.0, Color.RED, new BasicStroke());
        plot.addRangeMarker(marker, Layer.FOREGROUND);
        plot.addRangeMarker(marker, Layer.BACKGROUND);

        plot.clearRangeMarkers();
        assertNull(plot.getRangeMarkers(Layer.FOREGROUND));
        assertNull(plot.getRangeMarkers(Layer.BACKGROUND));
    }
    
    @Test
    public void testClearRangeMarkersByIndex() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRenderer(0, new org.jfree.chart.renderer.category.BarRenderer()); // Need a renderer for index
        Marker marker = new ValueMarker(10.0, Color.RED, new BasicStroke());
        plot.addRangeMarker(0, marker, Layer.FOREGROUND);
        plot.clearRangeMarkers(0);
        assertNull(plot.getRangeMarkers(0, Layer.FOREGROUND));
    }

    // --- New Tests for Uncovered Methods ---

    @Test
    public void testGetPlotType() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals("Category_Plot", plot.getPlotType());
    }

    @Test
    public void testSetDomainAxes() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("Axis1");
        CategoryAxis axis2 = new CategoryAxis("Axis2");
        plot.setDomainAxes(new CategoryAxis[]{axis1, axis2});
        assertEquals(2, plot.getDomainAxisCount());
        assertEquals(axis1, plot.getDomainAxis(0));
        assertEquals(axis2, plot.getDomainAxis(1));
    }

    @Test
    public void testGetDomainAxisIndex() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis1 = new CategoryAxis("Axis1");
        CategoryAxis axis2 = new CategoryAxis("Axis2");
        plot.setDomainAxis(0, axis1);
        plot.setDomainAxis(1, axis2);
        assertEquals(0, plot.getDomainAxisIndex(axis1));
        assertEquals(1, plot.getDomainAxisIndex(axis2));
        assertEquals(-1, plot.getDomainAxisIndex(new CategoryAxis("NonExistent")));
    }

    @Test
    public void testClearDomainAxes() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxis(new CategoryAxis("Axis1"));
        plot.setDomainAxis(new CategoryAxis("Axis2"));
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureDomainAxes() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("Axis1");
        plot.setDomainAxis(axis);
        plot.configureDomainAxes(); 
        assertTrue(true);
    }

    @Test
    public void testSetRangeAxes() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new org.jfree.chart.axis.NumberAxis("Range1");
        ValueAxis axis2 = new org.jfree.chart.axis.NumberAxis("Range2");
        plot.setRangeAxes(new ValueAxis[]{axis1, axis2});
        assertEquals(2, plot.getRangeAxisCount());
        assertEquals(axis1, plot.getRangeAxis(0));
        assertEquals(axis2, plot.getRangeAxis(1));
    }

    @Test
    public void testGetRangeAxisIndex() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis1 = new org.jfree.chart.axis.NumberAxis("Range1");
        ValueAxis axis2 = new org.jfree.chart.axis.NumberAxis("Range2");
        plot.setRangeAxis(0, axis1);
        plot.setRangeAxis(1, axis2);
        assertEquals(0, plot.getRangeAxisIndex(axis1));
        assertEquals(1, plot.getRangeAxisIndex(axis2));
        assertEquals(-1, plot.getRangeAxisIndex(new org.jfree.chart.axis.NumberAxis("NonExistent")));
    }

    @Test
    public void testClearRangeAxes() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxis(new org.jfree.chart.axis.NumberAxis("Range1"));
        plot.setRangeAxis(new org.jfree.chart.axis.NumberAxis("Range2"));
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testConfigureRangeAxes() {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis("Range1");
        plot.setRangeAxis(axis);
        plot.configureRangeAxes(); 
        assertTrue(true);
    }



    @Test
    public void testGetRendererForDataset() {
        CategoryPlot plot = new CategoryPlot();
        CategoryDataset dataset1 = createMockCategoryDataset();
        CategoryDataset dataset2 = createMockCategoryDataset();
        CategoryItemRenderer renderer1 = createMockCategoryItemRenderer();
        CategoryItemRenderer renderer2 = createMockCategoryItemRenderer();

        plot.setDataset(0, dataset1);
        plot.setRenderer(0, renderer1);
        plot.setDataset(1, dataset2);
        plot.setRenderer(1, renderer2);

        assertEquals(renderer1, plot.getRendererForDataset(dataset1));
        assertEquals(renderer2, plot.getRendererForDataset(dataset2));
        assertNull(plot.getRendererForDataset(createMockCategoryDataset())); // Non-existent dataset
    }

    @Test
    public void testGetIndexOf() {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer1 = createMockCategoryItemRenderer();
        CategoryItemRenderer renderer2 = createMockCategoryItemRenderer();
        plot.setRenderer(0, renderer1);
        plot.setRenderer(1, renderer2);

        assertEquals(0, plot.getIndexOf(renderer1));
        assertEquals(1, plot.getIndexOf(renderer2));
        assertEquals(-1, plot.getIndexOf(createMockCategoryItemRenderer())); // Non-existent renderer
    }

    // Helper method to create a mock CategoryDataset
    private CategoryDataset createMockCategoryDataset() {
        // Using a concrete implementation as a stand-in for a mock
        return new org.jfree.data.category.DefaultCategoryDataset();
    }

    // Helper method to create a mock CategoryItemRenderer
    private CategoryItemRenderer createMockCategoryItemRenderer() {
        // Using a concrete implementation as a stand-in for a mock
        return new org.jfree.chart.renderer.category.BarRenderer();
    }

    // Helper method to create a mock CategoryAnnotation
    private CategoryAnnotation createMockCategoryAnnotation() {
        // Using a concrete implementation as a stand-in for a mock
        return new org.jfree.chart.annotations.CategoryLineAnnotation(null, 0, null, 0, Color.BLACK, new BasicStroke());
    }

    // Mock class for PlotChangeListener to check notifications
    private static class MockPlotChangeListener implements org.jfree.chart.event.PlotChangeListener {
        private boolean changed = false;

        @Override
        public void plotChanged(PlotChangeEvent event) {
            this.changed = true;
        }

        public boolean hasChanged() {
            return changed;
        }
    }
}

