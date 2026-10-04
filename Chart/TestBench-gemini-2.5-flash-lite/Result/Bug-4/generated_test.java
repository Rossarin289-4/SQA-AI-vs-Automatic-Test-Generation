package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.xy.AbstractXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.data.Range;
import org.jfree.data.xy.AbstractXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.chart.plot.PlotOrientation; // Added import

public class XYPlotTest {

    // Dummy Dataset for testing purposes

    // Dummy ValueAxis for testing purposes

    @Test
    public void testDefaultConstructor() throws Exception {
        XYPlot plot = new XYPlot();
        assertNotNull("Constructor should not return null", plot);
        assertEquals("Default orientation should be VERTICAL", PlotOrientation.VERTICAL, plot.getOrientation());
        assertEquals("Default weight should be 1", 1, plot.getWeight());
        assertNotNull("Axis offset should not be null", plot.getAxisOffset());
        assertEquals("Default dataset count should be 1", 1, plot.getDatasetCount());
        assertNull("Primary dataset should be null initially", plot.getDataset());
        assertEquals("Default renderer count should be 1", 1, plot.getRendererCount());
        assertNull("Primary renderer should be null initially", plot.getRenderer());
        assertEquals("Default domain axis count should be 1", 1, plot.getDomainAxisCount());
        assertNull("Primary domain axis should be null initially", plot.getDomainAxis());
        assertEquals("Default range axis count should be 1", 1, plot.getRangeAxisCount());
        assertNull("Primary range axis should be null initially", plot.getRangeAxis());
        assertTrue("Domain gridlines should be visible by default", plot.isDomainGridlinesVisible());
        assertTrue("Range gridlines should be visible by default", plot.isRangeGridlinesVisible());
        assertFalse("Domain minor gridlines should be invisible by default", plot.isDomainMinorGridlinesVisible());
        assertFalse("Range minor gridlines should be invisible by default", plot.isRangeMinorGridlinesVisible());
        assertFalse("Domain zero baseline should be invisible by default", plot.isDomainZeroBaselineVisible());
        assertFalse("Range zero baseline should be invisible by default", plot.isRangeZeroBaselineVisible());
        assertFalse("Domain crosshair should be invisible by default", plot.isDomainCrosshairVisible());
        assertFalse("Range crosshair should be invisible by default", plot.isRangeCrosshairVisible());
    }


    @Test
    public void testSetAndGetOrientation() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals("Orientation should be HORIZONTAL", PlotOrientation.HORIZONTAL, plot.getOrientation());
        plot.setOrientation(PlotOrientation.VERTICAL);
        assertEquals("Orientation should be VERTICAL", PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setOrientation(null);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setAxisOffset(null);
    }

















    @Test
    public void testSetAndGetDomainGridlinesVisible() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlinesVisible(false);
        assertFalse("Domain gridlines should be invisible", plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        assertTrue("Domain gridlines should be visible", plot.isDomainGridlinesVisible());
    }

    @Test
    public void testSetAndGetDomainMinorGridlinesVisible() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainMinorGridlinesVisible(true);
        assertTrue("Domain minor gridlines should be visible", plot.isDomainMinorGridlinesVisible());
        plot.setDomainMinorGridlinesVisible(false);
        assertFalse("Domain minor gridlines should be invisible", plot.isDomainMinorGridlinesVisible());
    }

    @Test
    public void testSetAndGetDomainGridlineStroke() throws Exception {
        XYPlot plot = new XYPlot();
        Stroke stroke = new java.awt.BasicStroke(2.0f);
        plot.setDomainGridlineStroke(stroke);
        assertEquals("Domain gridline stroke should be set correctly", stroke, plot.getDomainGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStrokeNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlineStroke(null);
    }

    @Test
    public void testSetAndGetDomainMinorGridlineStroke() throws Exception {
        XYPlot plot = new XYPlot();
        Stroke stroke = new java.awt.BasicStroke(1.0f);
        plot.setDomainMinorGridlineStroke(stroke);
        assertEquals("Domain minor gridline stroke should be set correctly", stroke, plot.getDomainMinorGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainMinorGridlineStrokeNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainMinorGridlineStroke(null);
    }

    @Test
    public void testSetAndGetDomainGridlinePaint() throws Exception {
        XYPlot plot = new XYPlot();
        Paint paint = Color.RED;
        plot.setDomainGridlinePaint(paint);
        assertEquals("Domain gridline paint should be set correctly", paint, plot.getDomainGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaintNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void testSetAndGetDomainMinorGridlinePaint() throws Exception {
        XYPlot plot = new XYPlot();
        Paint paint = Color.GREEN;
        plot.setDomainMinorGridlinePaint(paint);
        assertEquals("Domain minor gridline paint should be set correctly", paint, plot.getDomainMinorGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainMinorGridlinePaintNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainMinorGridlinePaint(null);
    }

    @Test
    public void testSetAndGetRangeGridlinesVisible() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeGridlinesVisible(false);
        assertFalse("Range gridlines should be invisible", plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(true);
        assertTrue("Range gridlines should be visible", plot.isRangeGridlinesVisible());
    }

    @Test
    public void testSetAndGetRangeGridlineStroke() throws Exception {
        XYPlot plot = new XYPlot();
        Stroke stroke = new java.awt.BasicStroke(3.0f);
        plot.setRangeGridlineStroke(stroke);
        assertEquals("Range gridline stroke should be set correctly", stroke, plot.getRangeGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStrokeNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeGridlineStroke(null);
    }

    @Test
    public void testSetAndGetRangeGridlinePaint() throws Exception {
        XYPlot plot = new XYPlot();
        Paint paint = Color.ORANGE;
        plot.setRangeGridlinePaint(paint);
        assertEquals("Range gridline paint should be set correctly", paint, plot.getRangeGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaintNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeGridlinePaint(null);
    }

    @Test
    public void testSetAndGetRangeMinorGridlinesVisible() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeMinorGridlinesVisible(true);
        assertTrue("Range minor gridlines should be visible", plot.isRangeMinorGridlinesVisible());
        plot.setRangeMinorGridlinesVisible(false);
        assertFalse("Range minor gridlines should be invisible", plot.isRangeMinorGridlinesVisible());
    }

    @Test
    public void testSetAndGetRangeMinorGridlineStroke() throws Exception {
        XYPlot plot = new XYPlot();
        Stroke stroke = new java.awt.BasicStroke(1.5f);
        plot.setRangeMinorGridlineStroke(stroke);
        assertEquals("Range minor gridline stroke should be set correctly", stroke, plot.getRangeMinorGridlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeMinorGridlineStrokeNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeMinorGridlineStroke(null);
    }

    @Test
    public void testSetAndGetRangeMinorGridlinePaint() throws Exception {
        XYPlot plot = new XYPlot();
        Paint paint = Color.MAGENTA;
        plot.setRangeMinorGridlinePaint(paint);
        assertEquals("Range minor gridline paint should be set correctly", paint, plot.getRangeMinorGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeMinorGridlinePaintNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeMinorGridlinePaint(null);
    }

    @Test
    public void testSetAndGetDomainZeroBaselineVisible() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainZeroBaselineVisible(true);
        assertTrue("Domain zero baseline should be visible", plot.isDomainZeroBaselineVisible());
        plot.setDomainZeroBaselineVisible(false);
        assertFalse("Domain zero baseline should be invisible", plot.isDomainZeroBaselineVisible());
    }

    @Test
    public void testSetAndGetDomainZeroBaselineStroke() throws Exception {
        XYPlot plot = new XYPlot();
        Stroke stroke = new java.awt.BasicStroke(1.0f, java.awt.BasicStroke.CAP_ROUND, java.awt.BasicStroke.JOIN_MITER);
        plot.setDomainZeroBaselineStroke(stroke);
        assertEquals("Domain zero baseline stroke should be set correctly", stroke, plot.getDomainZeroBaselineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselineStrokeNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainZeroBaselineStroke(null);
    }

    @Test
    public void testSetAndGetDomainZeroBaselinePaint() throws Exception {
        XYPlot plot = new XYPlot();
        Paint paint = Color.CYAN;
        plot.setDomainZeroBaselinePaint(paint);
        assertEquals("Domain zero baseline paint should be set correctly", paint, plot.getDomainZeroBaselinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselinePaintNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainZeroBaselinePaint(null);
    }

    @Test
    public void testSetAndGetRangeZeroBaselineVisible() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeZeroBaselineVisible(true);
        assertTrue("Range zero baseline should be visible", plot.isRangeZeroBaselineVisible());
        plot.setRangeZeroBaselineVisible(false);
        assertFalse("Range zero baseline should be invisible", plot.isRangeZeroBaselineVisible());
    }

    @Test
    public void testSetAndGetRangeZeroBaselineStroke() throws Exception {
        XYPlot plot = new XYPlot();
        Stroke stroke = new java.awt.BasicStroke(1.0f, java.awt.BasicStroke.CAP_SQUARE, java.awt.BasicStroke.JOIN_BEVEL);
        plot.setRangeZeroBaselineStroke(stroke);
        assertEquals("Range zero baseline stroke should be set correctly", stroke, plot.getRangeZeroBaselineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselineStrokeNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeZeroBaselineStroke(null);
    }

    @Test
    public void testSetAndGetRangeZeroBaselinePaint() throws Exception {
        XYPlot plot = new XYPlot();
        Paint paint = Color.PINK;
        plot.setRangeZeroBaselinePaint(paint);
        assertEquals("Range zero baseline paint should be set correctly", paint, plot.getRangeZeroBaselinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselinePaintNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeZeroBaselinePaint(null);
    }

    @Test
    public void testSetAndGetDomainCrosshairVisible() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairVisible(true);
        assertTrue("Domain crosshair should be visible", plot.isDomainCrosshairVisible());
        plot.setDomainCrosshairVisible(false);
        assertFalse("Domain crosshair should be invisible", plot.isDomainCrosshairVisible());
    }

    @Test
    public void testSetAndGetDomainCrosshairLockedOnData() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairLockedOnData(false);
        assertFalse("Domain crosshair should not lock on data", plot.isDomainCrosshairLockedOnData());
        plot.setDomainCrosshairLockedOnData(true);
        assertTrue("Domain crosshair should lock on data", plot.isDomainCrosshairLockedOnData());
    }

    @Test
    public void testSetAndGetDomainCrosshairValue() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairValue(10.5);
        assertEquals("Domain crosshair value should be 10.5", 10.5, plot.getDomainCrosshairValue(), 0.0000001);
        plot.setDomainCrosshairValue(-5.0);
        assertEquals("Domain crosshair value should be -5.0", -5.0, plot.getDomainCrosshairValue(), 0.0000001);
    }

    @Test
    public void testSetDomainCrosshairValueWithVisibility() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairVisible(true);
        // Setting value should fire event
        // We can't easily test event firing here, but the method itself is tested.
        plot.setDomainCrosshairValue(1.0);
        assertEquals(1.0, plot.getDomainCrosshairValue(), 0.0000001);

        plot.setDomainCrosshairVisible(false);
        // Setting value should NOT fire event (due to visibility flag)
        plot.setDomainCrosshairValue(2.0);
        assertEquals(2.0, plot.getDomainCrosshairValue(), 0.0000001); // Value still updates
    }

    @Test
    public void testSetAndGetDomainCrosshairStroke() throws Exception {
        XYPlot plot = new XYPlot();
        Stroke stroke = new java.awt.BasicStroke(1.0f);
        plot.setDomainCrosshairStroke(stroke);
        assertEquals("Domain crosshair stroke should be set correctly", stroke, plot.getDomainCrosshairStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairStrokeNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairStroke(null);
    }

    @Test
    public void testSetAndGetDomainCrosshairPaint() throws Exception {
        XYPlot plot = new XYPlot();
        Paint paint = Color.BLUE;
        plot.setDomainCrosshairPaint(paint);
        assertEquals("Domain crosshair paint should be set correctly", paint, plot.getDomainCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairPaintNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairPaint(null);
    }

    @Test
    public void testSetAndGetRangeCrosshairVisible() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairVisible(true);
        assertTrue("Range crosshair should be visible", plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(false);
        assertFalse("Range crosshair should be invisible", plot.isRangeCrosshairVisible());
    }

    @Test
    public void testSetAndGetRangeCrosshairLockedOnData() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse("Range crosshair should not lock on data", plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairLockedOnData(true);
        assertTrue("Range crosshair should lock on data", plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testSetAndGetRangeCrosshairValue() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairValue(25.5);
        assertEquals("Range crosshair value should be 25.5", 25.5, plot.getRangeCrosshairValue(), 0.0000001);
        plot.setRangeCrosshairValue(-10.0);
        assertEquals("Range crosshair value should be -10.0", -10.0, plot.getRangeCrosshairValue(), 0.0000001);
    }

    @Test
    public void testSetRangeCrosshairValueWithVisibility() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairVisible(true);
        // Setting value should fire event
        plot.setRangeCrosshairValue(1.0);
        assertEquals(1.0, plot.getRangeCrosshairValue(), 0.0000001);

        plot.setRangeCrosshairVisible(false);
        // Setting value should NOT fire event (due to visibility flag)
        plot.setRangeCrosshairValue(2.0);
        assertEquals(2.0, plot.getRangeCrosshairValue(), 0.0000001); // Value still updates
    }

    @Test
    public void testSetAndGetRangeCrosshairStroke() throws Exception {
        XYPlot plot = new XYPlot();
        Stroke stroke = new java.awt.BasicStroke(2.0f);
        plot.setRangeCrosshairStroke(stroke);
        assertEquals("Range crosshair stroke should be set correctly", stroke, plot.getRangeCrosshairStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStrokeNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairStroke(null);
    }

    @Test
    public void testSetAndGetRangeCrosshairPaint() throws Exception {
        XYPlot plot = new XYPlot();
        Paint paint = Color.GREEN;
        plot.setRangeCrosshairPaint(paint);
        assertEquals("Range crosshair paint should be set correctly", paint, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaintNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairPaint(null);
    }

    @Test
    public void testSetAndGetDomainAxisLocation() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals("Domain axis location should be TOP_OR_RIGHT", AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocationNullForIndex0() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainAxisLocation(0, null);
    }


    @Test
    public void testSetAndGetRangeAxisLocation() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals("Range axis location should be TOP_OR_RIGHT", AxisLocation.TOP_OR_RIGHT, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocationNullForIndex0() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeAxisLocation(0, null);
    }






    @Test
    public void testSetAndGetDatasetRenderingOrder() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals("Dataset rendering order should be FORWARD", DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.REVERSE);
        assertEquals("Dataset rendering order should be REVERSE", DatasetRenderingOrder.REVERSE, plot.getDatasetRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrderNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(null);
    }

    @Test
    public void testSetAndGetSeriesRenderingOrder() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        assertEquals("Series rendering order should be FORWARD", SeriesRenderingOrder.FORWARD, plot.getSeriesRenderingOrder());
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.REVERSE);
        assertEquals("Series rendering order should be REVERSE", SeriesRenderingOrder.REVERSE, plot.getSeriesRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesRenderingOrderNull() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setSeriesRenderingOrder(null);
    }

    @Test
    public void testSetAndGetWeight() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setWeight(5);
        assertEquals("Weight should be 5", 5, plot.getWeight());
        plot.setWeight(0);
        assertEquals("Weight should be 0", 0, plot.getWeight());
    }




    @Test
    public void testGetRangeAxisForDataset() throws Exception {
        XYPlot plot = new XYPlot();
        ValueAxis rangeAxis1 = new DummyValueAxis("Y1", new Range(0, 100), false);
        ValueAxis rangeAxis2 = new DummyValueAxis("Y2", new Range(100, 200), false);
        plot.setRangeAxis(0, rangeAxis1, false);
        plot.setRangeAxis(1, rangeAxis2, false);

        DummyXYDataset dataset1 = new DummyXYDataset();
        dataset1.addSeries("S1", List.of(new Point2D.Double(1, 1)));
        plot.setDataset(0, dataset1);

        // Test default mapping
        assertEquals("Default range axis for dataset 0 should be rangeAxis1", rangeAxis1, plot.getRangeAxisForDataset(0));

        // Test mapped mapping
        List<Integer> axes = new ArrayList<>();
        axes.add(1);
        plot.mapDatasetToRangeAxes(0, axes);
        assertEquals("Mapped range axis for dataset 0 should be rangeAxis2", rangeAxis2, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testDomainCrosshairValueBoundary() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setDomainCrosshairVisible(true);
        plot.setDomainCrosshairValue(Double.MAX_VALUE);
        assertEquals("Domain crosshair value should be MAX_VALUE", Double.MAX_VALUE, plot.getDomainCrosshairValue(), 0.0);
        plot.setDomainCrosshairValue(Double.MIN_VALUE);
        assertEquals("Domain crosshair value should be MIN_VALUE", Double.MIN_VALUE, plot.getDomainCrosshairValue(), 0.0);
        plot.setDomainCrosshairValue(Double.POSITIVE_INFINITY);
        assertEquals("Domain crosshair value should be POSITIVE_INFINITY", Double.POSITIVE_INFINITY, plot.getDomainCrosshairValue(), 0.0);
        plot.setDomainCrosshairValue(Double.NEGATIVE_INFINITY);
        assertEquals("Domain crosshair value should be NEGATIVE_INFINITY", Double.NEGATIVE_INFINITY, plot.getDomainCrosshairValue(), 0.0);
        plot.setDomainCrosshairValue(Double.NaN);
        assertTrue("Domain crosshair value should be NaN", Double.isNaN(plot.getDomainCrosshairValue()));
    }

    @Test
    public void testRangeCrosshairValueBoundary() throws Exception {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairVisible(true);
        plot.setRangeCrosshairValue(Double.MAX_VALUE);
        assertEquals("Range crosshair value should be MAX_VALUE", Double.MAX_VALUE, plot.getRangeCrosshairValue(), 0.0);
        plot.setRangeCrosshairValue(Double.MIN_VALUE);
        assertEquals("Range crosshair value should be MIN_VALUE", Double.MIN_VALUE, plot.getRangeCrosshairValue(), 0.0);
        plot.setRangeCrosshairValue(Double.POSITIVE_INFINITY);
        assertEquals("Range crosshair value should be POSITIVE_INFINITY", Double.POSITIVE_INFINITY, plot.getRangeCrosshairValue(), 0.0);
        plot.setRangeCrosshairValue(Double.NEGATIVE_INFINITY);
        assertEquals("Range crosshair value should be NEGATIVE_INFINITY", Double.NEGATIVE_INFINITY, plot.getRangeCrosshairValue(), 0.0);
        plot.setRangeCrosshairValue(Double.NaN);
        assertTrue("Range crosshair value should be NaN", Double.isNaN(plot.getRangeCrosshairValue()));
    }

    @Test
    public void testDomainAxisEdgeResolution() throws Exception {
        XYPlot plot = new XYPlot();
        // Default: VERTICAL, BOTTOM_OR_LEFT -> BOTTOM
        assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        // HORIZONTAL, BOTTOM_OR_LEFT -> LEFT
        assertEquals(RectangleEdge.LEFT, plot.getDomainAxisEdge());

        plot.setDomainAxisLocation(AxisLocation.TOP);
        // HORIZONTAL, TOP -> TOP
        assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());

        plot.setOrientation(PlotOrientation.VERTICAL);
        // VERTICAL, TOP -> TOP
        assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge());

        plot.setDomainAxisLocation(AxisLocation.RIGHT);
        // VERTICAL, RIGHT -> RIGHT
        assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge());
    }

    @Test
    public void testRangeAxisEdgeResolution() throws Exception {
        XYPlot plot = new XYPlot();
        // Default: VERTICAL, BOTTOM_OR_LEFT -> LEFT
        assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        // HORIZONTAL, BOTTOM_OR_LEFT -> BOTTOM
        assertEquals(RectangleEdge.BOTTOM, plot.getRangeAxisEdge());

        plot.setRangeAxisLocation(AxisLocation.TOP);
        // HORIZONTAL, TOP -> TOP
        assertEquals(RectangleEdge.TOP, plot.getRangeAxisEdge());

        plot.setOrientation(PlotOrientation.VERTICAL);
        // VERTICAL, TOP -> TOP
        assertEquals(RectangleEdge.TOP, plot.getRangeAxisEdge());

        plot.setRangeAxisLocation(AxisLocation.RIGHT);
        // VERTICAL, RIGHT -> RIGHT
        assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge());
    }

    @Test
    public void testDomainAxisLocationWithIndex() {
        XYPlot plot = new XYPlot();
        ValueAxis domainAxis1 = new DummyValueAxis("X1", new Range(0, 10), false);
        plot.setDomainAxis(0, domainAxis1, false);
        plot.setDomainAxis(1, new DummyValueAxis("X2", new Range(10, 20), false), false);

        plot.setDomainAxisLocation(0, AxisLocation.TOP, false);
        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM, false);

        assertEquals(AxisLocation.TOP, plot.getDomainAxisLocation(0));
        assertEquals(AxisLocation.BOTTOM, plot.getDomainAxisLocation(1));
    }

    @Test
    public void testRangeAxisLocationWithIndex() {
        XYPlot plot = new XYPlot();
        ValueAxis rangeAxis1 = new DummyValueAxis("Y1", new Range(0, 100), false);
        plot.setRangeAxis(0, rangeAxis1, false);
        plot.setRangeAxis(1, new DummyValueAxis("Y2", new Range(100, 200), false), false);

        plot.setRangeAxisLocation(0, AxisLocation.LEFT, false);
        plot.setRangeAxisLocation(1, AxisLocation.RIGHT, false);

        assertEquals(AxisLocation.LEFT, plot.getRangeAxisLocation(0));
        assertEquals(AxisLocation.RIGHT, plot.getRangeAxisLocation(1));
    }

    @Test
    public void testDomainAxisEdgeWithIndex() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxis(0, new DummyValueAxis("X1", new Range(0, 10), false), false);
        plot.setDomainAxis(1, new DummyValueAxis("X2", new Range(10, 20), false), false);

        plot.setDomainAxisLocation(0, AxisLocation.TOP, false);
        plot.setDomainAxisLocation(1, AxisLocation.BOTTOM, false);
        plot.setOrientation(PlotOrientation.VERTICAL);

        assertEquals(RectangleEdge.TOP, plot.getDomainAxisEdge(0));
        assertEquals(RectangleEdge.BOTTOM, plot.getDomainAxisEdge(1));

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.LEFT, plot.getDomainAxisEdge(0));
        assertEquals(RectangleEdge.RIGHT, plot.getDomainAxisEdge(1));
    }

    @Test
    public void testRangeAxisEdgeWithIndex() {
        XYPlot plot = new XYPlot();
        plot.setRangeAxis(0, new DummyValueAxis("Y1", new Range(0, 100), false), false);
        plot.setRangeAxis(1, new DummyValueAxis("Y2", new Range(100, 200), false), false);

        plot.setRangeAxisLocation(0, AxisLocation.LEFT, false);
        plot.setRangeAxisLocation(1, AxisLocation.RIGHT, false);
        plot.setOrientation(PlotOrientation.VERTICAL);

        assertEquals(RectangleEdge.LEFT, plot.getRangeAxisEdge(0));
        assertEquals(RectangleEdge.RIGHT, plot.getRangeAxisEdge(1));

        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(RectangleEdge.TOP, plot.getRangeAxisEdge(0));
        assertEquals(RectangleEdge.BOTTOM, plot.getRangeAxisEdge(1));
    }

    @Test
    public void testGetPlotType() {
        XYPlot plot = new XYPlot();
        assertEquals("Plot type should be XY_Plot", "XY_Plot", plot.getPlotType());
    }

    @Test
    public void testAxisOffsetCalculation() {
        XYPlot plot = new XYPlot();
        RectangleInsets insets = new RectangleInsets(5, 5, 5, 5);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    @Test
    public void testAxisOffsetWithZeroValues() {
        XYPlot plot = new XYPlot();
        RectangleInsets insets = new RectangleInsets(0, 0, 0, 0);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    @Test
    public void testDomainAxisMapping() {
        XYPlot plot = new XYPlot();
        ValueAxis domainAxis1 = new DummyValueAxis("X1", new Range(0, 10), false);
        ValueAxis domainAxis2 = new DummyValueAxis("X2", new Range(10, 20), false);
        plot.setDomainAxis(0, domainAxis1, false);
        plot.setDomainAxis(1, domainAxis2, false);

        DummyXYDataset dataset1 = new DummyXYDataset();
        dataset1.addSeries("S1", List.of(new Point2D.Double(1, 1)));
        plot.setDataset(0, dataset1);

        // Default mapping should map to axis 0
        assertEquals(domainAxis1, plot.getDomainAxisForDataset(0));

        // Map dataset 0 to axis 1
        plot.mapDatasetToDomainAxis(0, 1);
        assertEquals(domainAxis2, plot.getDomainAxisForDataset(0));

        // Map dataset 0 to axes 0 and 1
        List<Integer> axes = new ArrayList<>();
        axes.add(0);
        axes.add(1);
        plot.mapDatasetToDomainAxes(0, axes);
        assertEquals(domainAxis1, plot.getDomainAxisForDataset(0)); // First axis in list is used
    }

    @Test
    public void testRangeAxisMapping() {
        XYPlot plot = new XYPlot();
        ValueAxis rangeAxis1 = new DummyValueAxis("Y1", new Range(0, 100), false);
        ValueAxis rangeAxis2 = new DummyValueAxis("Y2", new Range(100, 200), false);
        plot.setRangeAxis(0, rangeAxis1, false);
        plot.setRangeAxis(1, rangeAxis2, false);

        DummyXYDataset dataset1 = new DummyXYDataset();
        dataset1.addSeries("S1", List.of(new Point2D.Double(1, 1)));
        plot.setDataset(0, dataset1);

        // Default mapping should map to axis 0
        assertEquals(rangeAxis1, plot.getRangeAxisForDataset(0));

        // Map dataset 0 to axis 1
        plot.mapDatasetToRangeAxis(0, 1);
        assertEquals(rangeAxis2, plot.getRangeAxisForDataset(0));

        // Map dataset 0 to axes 0 and 1
        List<Integer> axes = new ArrayList<>();
        axes.add(0);
        axes.add(1);
        plot.mapDatasetToRangeAxes(0, axes);
        assertEquals(rangeAxis1, plot.getRangeAxisForDataset(0)); // First axis in list is used
    }












































}





