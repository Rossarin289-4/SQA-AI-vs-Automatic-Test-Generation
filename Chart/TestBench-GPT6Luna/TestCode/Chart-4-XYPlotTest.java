package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.RenderingSource;
import org.jfree.chart.annotations.XYAnnotation;
import org.jfree.chart.annotations.XYAnnotationBoundsInfo;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.AxisCollection;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.TickType;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.ValueTick;
import org.jfree.chart.event.ChartChangeEventType;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.renderer.RendererUtilities;
import org.jfree.chart.renderer.xy.AbstractXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.ObjectList;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.PaintUtilities;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.ResourceBundleWrapper;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.data.Range;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.AbstractXYDataset;
import org.jfree.data.xy.SelectableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYDatasetSelectionState;

public class XYPlotTest {
    @Test
    public void testDefaultOrientationAndWeight() throws Exception {
        XYPlot plot = new XYPlot();
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertEquals(1, plot.getWeight());
    }

    @Test
    public void testOrientationCanBeChanged() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test
    public void testNullOrientationRejected() throws Exception {
        XYPlot plot = new XYPlot();
        try {
            plot.setOrientation(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test
    public void testAxisOffsetCanBeChanged() throws Exception {
        XYPlot plot = new XYPlot();
        RectangleInsets offset = new RectangleInsets(1.0, 2.0, 3.0, 4.0);
        plot.setAxisOffset(offset);
        assertSame(offset, plot.getAxisOffset());
    }

    @Test
    public void testNullAxisOffsetRejected() throws Exception {
        XYPlot plot = new XYPlot();
        try {
            plot.setAxisOffset(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0),
                plot.getAxisOffset());
    }

    @Test
    public void testDomainAxisCountAndClear() throws Exception {
        XYPlot plot = new XYPlot();
        assertEquals(1, plot.getDomainAxisCount());
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testDomainAxisLocation() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
    }

    @Test
    public void testDomainAxisEdgeChangesWithOrientation() throws Exception {
        XYPlot plot = new XYPlot();
        assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.LEFT, plot.getDomainAxisEdge());
    }

    @Test
    public void testRangeAxisCountAndClear() throws Exception {
        XYPlot plot = new XYPlot();
        assertEquals(1, plot.getRangeAxisCount());
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testRangeAxisLocation() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test
    public void testRangeAxisEdgeChangesWithOrientation() throws Exception {
        XYPlot plot = new XYPlot();
        assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.BOTTOM, plot.getRangeAxisEdge());
    }

    @Test
    public void testDatasetSetAndIdentityIndex() throws Exception {
        XYPlot plot = new XYPlot();
        XYDataset dataset = null;
        plot.setDataset(dataset);
        assertSame(dataset, plot.getDataset());
        assertEquals(0, plot.indexOf(dataset));
    }

    @Test
    public void testDatasetIndexBoundaryAndMissingIdentity() throws Exception {
        XYPlot plot = new XYPlot();
        assertEquals(0, plot.indexOf(null));
        assertNull(plot.getDataset(0));
    }

    @Test
    public void testDomainMappingRejectsNegativeDatasetIndex() throws Exception {
        XYPlot plot = new XYPlot();
        try {
            plot.mapDatasetToDomainAxis(-1, 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(1, plot.getDatasetCount());
    }

    @Test
    public void testRangeMappingRejectsNegativeDatasetIndex() throws Exception {
        XYPlot plot = new XYPlot();
        try {
            plot.mapDatasetToRangeAxis(-1, 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(1, plot.getDatasetCount());
    }

    @Test
    public void testRendererCountAndDefaultRenderer() throws Exception {
        XYPlot plot = new XYPlot();
        assertEquals(1, plot.getRendererCount());
        assertNull(plot.getRenderer());
    }

    @Test
    public void testRendererIdentityIndexWithoutRenderer() throws Exception {
        XYPlot plot = new XYPlot();
        assertEquals(0, plot.getIndexOf(null));
        assertNull(plot.getRendererForDataset(null));
    }

    @Test
    public void testDatasetRenderingOrderCanBeChanged() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD,
                plot.getDatasetRenderingOrder());
    }

    @Test
    public void testSeriesRenderingOrderCanBeChanged() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        assertEquals(SeriesRenderingOrder.FORWARD,
                plot.getSeriesRenderingOrder());
    }

    @Test
    public void testWeightCanBeChanged() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setWeight(7);
        assertEquals(7, plot.getWeight());
    }

    @Test
    public void testDomainGridlineVisibilityAndPaint() throws Exception {
        XYPlot plot = new XYPlot();
        assertTrue(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinePaint(Color.RED);
        assertSame(Color.RED, plot.getDomainGridlinePaint());
    }

    @Test
    public void testDomainMinorGridlineVisibilityAndStroke() throws Exception {
        XYPlot plot = new XYPlot();
        assertFalse(plot.isDomainMinorGridlinesVisible());
        plot.setDomainMinorGridlinesVisible(true);
        assertTrue(plot.isDomainMinorGridlinesVisible());
        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainMinorGridlineStroke(stroke);
        assertSame(stroke, plot.getDomainMinorGridlineStroke());
    }

    @Test
    public void testRangeGridlineVisibilityAndPaint() throws Exception {
        XYPlot plot = new XYPlot();
        assertTrue(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinePaint(Color.BLUE);
        assertSame(Color.BLUE, plot.getRangeGridlinePaint());
    }

    @Test
    public void testDomainGridlineStrokeCanBeSet() throws Exception {
        XYPlot plot = new XYPlot();
        Stroke stroke = new BasicStroke(3.0f);
        plot.setDomainGridlineStroke(stroke);
        assertSame(stroke, plot.getDomainGridlineStroke());
    }

    @Test
    public void testRangeGridlineStrokeCanBeSet() throws Exception {
        XYPlot plot = new XYPlot();
        Stroke stroke = new BasicStroke(3.0f);
        plot.setRangeGridlineStroke(stroke);
        assertSame(stroke, plot.getRangeGridlineStroke());
    }

    @Test
    public void testNullDomainGridlinePaintRejected() throws Exception {
        XYPlot plot = new XYPlot();
        try {
            plot.setDomainGridlinePaint(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(Color.WHITE, plot.getDomainGridlinePaint());
    }

    @Test
    public void testNullRangeGridlinePaintRejected() throws Exception {
        XYPlot plot = new XYPlot();
        try {
            plot.setRangeGridlinePaint(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(Color.WHITE, plot.getRangeGridlinePaint());
    }

    @Test
    public void testPlotTypeIsNonempty() throws Exception {
        XYPlot plot = new XYPlot();
        assertEquals("XY Plot", plot.getPlotType());
    }

    @Test
    public void testSetAndGetPrimaryDomainAxis() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainAxis(null);
        assertNull(plot.getDomainAxis());
        assertEquals(1, plot.getDomainAxisCount());
    }

    @Test
    public void testSetDomainAxesWithEmptyArrayPreservesPrimarySlot() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainAxes(new ValueAxis[0]);
        assertEquals(1, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureDomainAxesWithNoConfiguredAxis() throws Exception {
        XYPlot plot = new XYPlot();
        plot.configureDomainAxes();
        assertEquals(1, plot.getDomainAxisCount());
    }

    @Test
    public void testSetAndGetPrimaryRangeAxis() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeAxis(null);
        assertNull(plot.getRangeAxis());
        assertEquals(1, plot.getRangeAxisCount());
    }

    @Test
    public void testSetRangeAxesWithEmptyArrayPreservesPrimarySlot() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeAxes(new ValueAxis[0]);
        assertEquals(1, plot.getRangeAxisCount());
    }

    @Test
    public void testConfigureRangeAxesWithNoConfiguredAxis() throws Exception {
        XYPlot plot = new XYPlot();
        plot.configureRangeAxes();
        assertEquals(1, plot.getRangeAxisCount());
    }

    @Test
    public void testDomainMappingListNullMeansPrimaryAxis() throws Exception {
        XYPlot plot = new XYPlot();
        plot.mapDatasetToDomainAxes(0, null);
        assertEquals(0, plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testRangeMappingListNullMeansPrimaryAxis() throws Exception {
        XYPlot plot = new XYPlot();
        plot.mapDatasetToRangeAxes(0, null);
        assertEquals(0, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testRendererCanBeCleared() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRenderer(null);
        assertNull(plot.getRenderer());
        assertEquals(1, plot.getRendererCount());
    }

    @Test
    public void testSetRenderersWithEmptyArrayPreservesPrimarySlot() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRenderers(new XYItemRenderer[0]);
        assertEquals(1, plot.getRendererCount());
    }

    @Test
    public void testDomainMinorGridlinePaintCanBeSet() throws Exception {
        XYPlot plot = new XYPlot();
        Paint paint = Color.MAGENTA;
        plot.setDomainMinorGridlinePaint(paint);
        assertSame(paint, plot.getDomainMinorGridlinePaint());
    }

    @Test
    public void testNullDomainMinorGridlinePaintRejected() throws Exception {
        XYPlot plot = new XYPlot();
        try {
            plot.setDomainMinorGridlinePaint(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertEquals(Color.WHITE, plot.getDomainMinorGridlinePaint());
    }
}
