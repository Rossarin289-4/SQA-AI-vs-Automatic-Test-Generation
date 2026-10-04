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
    public void testOrientationSetAndRejectNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        try {
            plot.setOrientation(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        }
    }

    @Test
    public void testAxisOffsetSetAndRejectNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        RectangleInsets offset = new RectangleInsets(1.0, 2.0, 3.0, 4.0);
        plot.setAxisOffset(offset);
        assertSame(offset, plot.getAxisOffset());
        try {
            plot.setAxisOffset(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertSame(offset, plot.getAxisOffset());
        }
    }

    @Test
    public void testDomainAxisPrimaryAndIndexAfterSet() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("x");
        plot.setDomainAxis(axis);
        assertSame(axis, plot.getDomainAxis());
        assertEquals(0, plot.getDomainAxisIndex(axis));
        assertEquals(1, plot.getDomainAxisCount());
    }

    @Test
    public void testDomainAxesArrayAndClear() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis first = new CategoryAxis("x");
        CategoryAxis second = new CategoryAxis("x2");
        plot.setDomainAxes(new CategoryAxis[] {first, second});
        assertSame(first, plot.getDomainAxis());
        assertEquals(2, plot.getDomainAxisCount());
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
        assertEquals(-1, plot.getDomainAxisIndex(first));
    }

    @Test
    public void testDomainAxisIndexRejectsNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.getDomainAxisIndex(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(1, plot.getDomainAxisCount());
        }
    }

    @Test
    public void testDomainLocationAndEdgeFollowOrientation() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
        assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge());
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
        assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge());
    }

    @Test
    public void testDomainAxisLocationRejectsNullAtPrimaryIndex() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDomainAxisLocation(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(AxisLocation.BOTTOM_OR_LEFT,
                    plot.getDomainAxisLocation());
        }
    }

    @Test
    public void testRangeAxisSetLookupAndClear() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis("y");
        plot.setRangeAxis(axis);
        assertSame(axis, plot.getRangeAxis());
        assertEquals(0, plot.getRangeAxisIndex(axis));
        assertEquals(1, plot.getRangeAxisCount());
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
        assertEquals(-1, plot.getRangeAxisIndex(axis));
    }

    @Test
    public void testRangeAxesArrayAndNullIndexRejected() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis first = new org.jfree.chart.axis.NumberAxis("y");
        ValueAxis second = new org.jfree.chart.axis.NumberAxis("y2");
        plot.setRangeAxes(new ValueAxis[] {first, second});
        assertSame(first, plot.getRangeAxis());
        assertEquals(2, plot.getRangeAxisCount());
        assertEquals(1, plot.getRangeAxisIndex(second));
        try {
            plot.getRangeAxisIndex(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(2, plot.getRangeAxisCount());
        }
    }

    @Test
    public void testRangeLocationAndEdgeFollowOrientation() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(AxisLocation.TOP_OR_LEFT, plot.getRangeAxisLocation());
        assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge());
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.BOTTOM, plot.getRangeAxisEdge());
    }

    @Test
    public void testRangeAxisLocationRejectsNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setRangeAxisLocation(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(AxisLocation.TOP_OR_LEFT,
                    plot.getRangeAxisLocation());
        }
    }

    @Test
    public void testDatasetSetAndCount() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(1, plot.getDatasetCount());
        assertNull(plot.getDataset());
        plot.setDataset(null);
        assertNull(plot.getDataset());
        assertEquals(1, plot.getDatasetCount());
    }

    @Test
    public void testDatasetAxisMappingUsesConfiguredAxes() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis domain = new CategoryAxis("x");
        ValueAxis range = new org.jfree.chart.axis.NumberAxis("y");
        plot.setDomainAxis(1, domain);
        plot.setRangeAxis(1, range);
        plot.mapDatasetToDomainAxis(0, 1);
        plot.mapDatasetToRangeAxis(0, 1);
        assertSame(domain, plot.getDomainAxisForDataset(0));
        assertSame(range, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testRendererAssignmentAndLookupIndex() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer =
                new org.jfree.chart.renderer.category.BarRenderer();
        plot.setRenderer(renderer);
        assertSame(renderer, plot.getRenderer());
        assertEquals(0, plot.getIndexOf(renderer));
        assertSame(renderer, plot.getRendererForDataset(null));
    }

    @Test
    public void testSetRenderersAndLookupSecondaryIndex() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer first =
                new org.jfree.chart.renderer.category.BarRenderer();
        CategoryItemRenderer second =
                new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        plot.setRenderers(new CategoryItemRenderer[] {first, second});
        assertSame(first, plot.getRenderer());
        assertSame(second, plot.getRenderer(1));
        assertEquals(1, plot.getIndexOf(second));
    }

    @Test
    public void testRenderingAndSortOrderSetters() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(DatasetRenderingOrder.REVERSE,
                plot.getDatasetRenderingOrder());
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD,
                plot.getDatasetRenderingOrder());
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());
    }

    @Test
    public void testRenderingOrderSettersRejectNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDatasetRenderingOrder(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(DatasetRenderingOrder.REVERSE,
                    plot.getDatasetRenderingOrder());
        }
        try {
            plot.setColumnRenderingOrder(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(SortOrder.ASCENDING, plot.getColumnRenderingOrder());
        }
        try {
            plot.setRowRenderingOrder(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(SortOrder.ASCENDING, plot.getRowRenderingOrder());
        }
    }

    @Test
    public void testGridlineVisibilityAndProperties() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.isDomainGridlinesVisible());
        assertTrue(plot.isRangeGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(false);
        assertTrue(plot.isDomainGridlinesVisible());
        assertFalse(plot.isRangeGridlinesVisible());
        Stroke stroke = new BasicStroke(2.0f);
        Paint paint = Color.RED;
        plot.setDomainGridlineStroke(stroke);
        plot.setRangeGridlineStroke(stroke);
        plot.setDomainGridlinePaint(paint);
        plot.setRangeGridlinePaint(paint);
        assertSame(stroke, plot.getDomainGridlineStroke());
        assertSame(stroke, plot.getRangeGridlineStroke());
        assertSame(paint, plot.getDomainGridlinePaint());
        assertSame(paint, plot.getRangeGridlinePaint());
    }

    @Test
    public void testGridlineAttributeSettersRejectNull() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        try {
            plot.setDomainGridlinePosition(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(CategoryAnchor.MIDDLE,
                    plot.getDomainGridlinePosition());
        }
        try {
            plot.setDomainGridlineStroke(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertSame(CategoryPlot.DEFAULT_GRIDLINE_STROKE,
                    plot.getDomainGridlineStroke());
        }
        try {
            plot.setDomainGridlinePaint(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertSame(CategoryPlot.DEFAULT_GRIDLINE_PAINT,
                    plot.getDomainGridlinePaint());
        }
        try {
            plot.setRangeGridlineStroke(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertSame(CategoryPlot.DEFAULT_GRIDLINE_STROKE,
                    plot.getRangeGridlineStroke());
        }
        try {
            plot.setRangeGridlinePaint(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertSame(CategoryPlot.DEFAULT_GRIDLINE_PAINT,
                    plot.getRangeGridlinePaint());
        }
    }

    @Test
    public void testFixedLegendItemsTakePrecedence() throws Exception {
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
    public void testDefaultLegendCollectionIsEmptyWithoutConfiguredData() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(0, plot.getLegendItems().getItemCount());
    }

    @Test
    public void testDomainGridlinePositionCanBeChanged() throws Exception {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainGridlinePosition(CategoryAnchor.START);
        assertEquals(CategoryAnchor.START, plot.getDomainGridlinePosition());
        plot.setDomainGridlinePosition(CategoryAnchor.END);
        assertEquals(CategoryAnchor.END, plot.getDomainGridlinePosition());
    }
}
