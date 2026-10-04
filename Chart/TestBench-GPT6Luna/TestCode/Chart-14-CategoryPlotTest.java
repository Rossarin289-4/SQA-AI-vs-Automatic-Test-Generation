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
    @Test
    public void testOrientationChanges() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test
    public void testNullOrientationRejected() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setOrientation(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test
    public void testAxisOffsetRoundTrip() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        RectangleInsets offset = new RectangleInsets(1.0, 2.0, 3.0, 4.0);
        plot.setAxisOffset(offset);
        assertSame(offset, plot.getAxisOffset());
    }

    @Test
    public void testNullAxisOffsetRejected() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setAxisOffset(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0),
                plot.getAxisOffset());
    }

    @Test
    public void testPrimaryDomainAxisRoundTrip() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis();
        plot.setDomainAxis(axis);
        assertSame(axis, plot.getDomainAxis());
        assertEquals(0, plot.getDomainAxisIndex(axis));
    }

    @Test
    public void testDomainAxisIndexRejectsNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.getDomainAxisIndex(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertEquals(1, plot.getDomainAxisCount());
    }

    @Test
    public void testDomainAxisLocationsAndEdgesFollowOrientation()
            throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
        assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge());
    }

    @Test
    public void testNullPrimaryDomainLocationRejected() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDomainAxisLocation(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertNotNull(plot.getDomainAxisLocation());
    }

    @Test
    public void testClearingDomainAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxis(new CategoryAxis());
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
        assertNull(plot.getDomainAxis());
    }

    @Test
    public void testRangeAxisRoundTripAndIndex() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        plot.setRangeAxis(axis);
        assertSame(axis, plot.getRangeAxis());
        assertEquals(0, plot.getRangeAxisIndex(axis));
    }

    @Test
    public void testRangeAxisLocationAndEdge() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation());
        assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());
    }

    @Test
    public void testNullPrimaryRangeLocationRejected() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setRangeAxisLocation(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertNotNull(plot.getRangeAxisLocation());
    }

    @Test
    public void testClearingRangeAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxis(new org.jfree.chart.axis.NumberAxis());
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
        assertNull(plot.getRangeAxis());
    }

    @Test
    public void testDatasetCountAndRetrievalAfterSet() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        org.jfree.data.category.DefaultCategoryDataset dataset =
                new org.jfree.data.category.DefaultCategoryDataset();
        dataset.addValue(2.0, "row", "col");
        plot.setDataset(dataset);
        assertSame(dataset, plot.getDataset());
        assertEquals(1, plot.getDatasetCount());
    }

    @Test
    public void testDatasetToAxisMappings() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domain0 = new CategoryAxis();
        CategoryAxis domain1 = new CategoryAxis();
        ValueAxis range0 = new org.jfree.chart.axis.NumberAxis();
        ValueAxis range1 = new org.jfree.chart.axis.NumberAxis();
        plot.setDomainAxes(new CategoryAxis[] {domain0, domain1});
        plot.setRangeAxes(new ValueAxis[] {range0, range1});
        plot.mapDatasetToDomainAxis(0, 1);
        plot.mapDatasetToRangeAxis(0, 1);
        assertSame(domain1, plot.getDomainAxisForDataset(0));
        assertSame(range1, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testRendererRoundTripAndIndex() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer =
                new org.jfree.chart.renderer.category.BarRenderer();
        plot.setRenderer(renderer);
        assertSame(renderer, plot.getRenderer());
        assertEquals(0, plot.getIndexOf(renderer));
    }

    @Test
    public void testRendererLookupUsesDatasetIdentity() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        org.jfree.data.category.DefaultCategoryDataset dataset =
                new org.jfree.data.category.DefaultCategoryDataset();
        dataset.addValue(1.0, "row", "col");
        CategoryItemRenderer renderer =
                new org.jfree.chart.renderer.category.BarRenderer();
        plot.setDataset(dataset);
        plot.setRenderer(renderer);
        assertSame(renderer, plot.getRendererForDataset(dataset));
        assertNull(plot.getRendererForDataset(
                new org.jfree.data.category.DefaultCategoryDataset()));
    }

    @Test
    public void testRenderingOrdersRoundTrip() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(DatasetRenderingOrder.FORWARD,
                plot.getDatasetRenderingOrder());
        assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());
        assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());
    }

    @Test
    public void testNullRenderingOrdersRejected() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDatasetRenderingOrder(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        try {
            plot.setColumnRenderingOrder(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        try {
            plot.setRowRenderingOrder(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertEquals(DatasetRenderingOrder.REVERSE,
                plot.getDatasetRenderingOrder());
        assertEquals(SortOrder.ASCENDING, plot.getColumnRenderingOrder());
        assertEquals(SortOrder.ASCENDING, plot.getRowRenderingOrder());
    }

    @Test
    public void testGridlineVisibilityAndAttributes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.isDomainGridlinesVisible());
        assertTrue(plot.isRangeGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(false);
        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(stroke);
        plot.setRangeGridlineStroke(stroke);
        plot.setDomainGridlinePaint(Color.RED);
        plot.setRangeGridlinePaint(Color.BLUE);
        assertTrue(plot.isDomainGridlinesVisible());
        assertFalse(plot.isRangeGridlinesVisible());
        assertSame(stroke, plot.getDomainGridlineStroke());
        assertSame(stroke, plot.getRangeGridlineStroke());
        assertEquals(Color.RED, plot.getDomainGridlinePaint());
        assertEquals(Color.BLUE, plot.getRangeGridlinePaint());
    }

    @Test
    public void testNullGridlinePositionRejected() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDomainGridlinePosition(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertEquals(CategoryAnchor.MIDDLE, plot.getDomainGridlinePosition());
    }

    @Test
    public void testGridlineStrokeAndPaintRejectNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDomainGridlineStroke(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        try {
            plot.setDomainGridlinePaint(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        try {
            plot.setRangeGridlineStroke(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        try {
            plot.setRangeGridlinePaint(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertNotNull(plot.getDomainGridlineStroke());
        assertNotNull(plot.getRangeGridlinePaint());
    }

    @Test
    public void testFixedLegendItemsOverrideAutomaticItems() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        LegendItemCollection items = new LegendItemCollection();
        plot.setFixedLegendItems(items);
        assertSame(items, plot.getFixedLegendItems());
        assertSame(items, plot.getLegendItems());
        plot.setFixedLegendItems(null);
        assertNull(plot.getFixedLegendItems());
        assertNotNull(plot.getLegendItems());
    }

    @Test
    public void testPlotTypeIsAvailable() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(new CategoryPlot().getPlotType(), plot.getPlotType());
    }

    @Test
    public void testConfigureDomainAxesWithNoAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.clearDomainAxes();
        plot.configureDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
        assertNull(plot.getDomainAxis());
    }

    @Test
    public void testConfigureDomainAxesAfterSettingSeveralAxes()
            throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis first = new CategoryAxis();
        CategoryAxis second = new CategoryAxis();
        plot.setDomainAxes(new CategoryAxis[] {first, second});
        plot.configureDomainAxes();
        assertSame(first, plot.getDomainAxis());
        assertSame(second, plot.getDomainAxis(1));
        assertEquals(2, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureDomainAxesAfterClearingAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis();
        plot.setDomainAxis(axis);
        plot.clearDomainAxes();
        plot.configureDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureRangeAxesWithNoAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.clearRangeAxes();
        plot.configureRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
        assertNull(plot.getRangeAxis());
    }

    @Test
    public void testConfigureRangeAxesAfterSettingSeveralAxes()
            throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis first = new org.jfree.chart.axis.NumberAxis();
        ValueAxis second = new org.jfree.chart.axis.NumberAxis();
        plot.setRangeAxes(new ValueAxis[] {first, second});
        plot.configureRangeAxes();
        assertSame(first, plot.getRangeAxis());
        assertSame(second, plot.getRangeAxis(1));
        assertEquals(2, plot.getRangeAxisCount());
    }

    @Test
    public void testConfigureRangeAxesAfterClearingAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        plot.setRangeAxis(axis);
        plot.clearRangeAxes();
        plot.configureRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testSetRenderersWithEmptyArray() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setRenderers(new CategoryItemRenderer[0]);
        assertNull(plot.getRenderer());
        assertEquals(0, plot.getIndexOf(null));
    }

    @Test
    public void testSetRenderersWithPrimaryAndSecondaryRenderers()
            throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer first =
                new org.jfree.chart.renderer.category.BarRenderer();
        CategoryItemRenderer second =
                new org.jfree.chart.renderer.category.BarRenderer();
        plot.setRenderers(new CategoryItemRenderer[] {first, second});
        assertSame(first, plot.getRenderer());
        assertSame(second, plot.getRenderer(1));
        assertEquals(0, plot.getIndexOf(first));
        assertEquals(1, plot.getIndexOf(second));
    }

    @Test
    public void testSetRenderersCanReplaceAnExistingRenderer()
            throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer oldRenderer =
                new org.jfree.chart.renderer.category.BarRenderer();
        CategoryItemRenderer newRenderer =
                new org.jfree.chart.renderer.category.BarRenderer();
        plot.setRenderer(oldRenderer);
        plot.setRenderers(new CategoryItemRenderer[] {newRenderer});
        assertSame(newRenderer, plot.getRenderer());
        assertEquals(-1, plot.getIndexOf(oldRenderer));
        assertEquals(0, plot.getIndexOf(newRenderer));
    }
}
