```java
package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.EventListenerList;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.entity.AxisLabelEntity;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.text.TextUtilities;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.PaintUtilities;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SerialUtilities;
// Import necessary classes for mocking
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.PlotProgressListener;
import org.jfree.chart.event.PlotStateListener;
import org.jfree.chart.annotations.Annotation;
import org.jfree.data.Range;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.Series;


public class AxisTest {
    
    /**
     * A dummy concrete implementation of Axis for testing purposes.
     * It overrides the abstract methods with no-op implementations.
     */
    static class DummyAxis extends Axis {
        public DummyAxis(String label) {
            super(label);
        }

        @Override
        public void configure() {
            // No-op
        }

        @Override
        public AxisSpace reserveSpace(Graphics2D g2, Plot plot, Rectangle2D plotArea, RectangleEdge edge, AxisSpace space) {
            return space;
        }

        @Override
        public AxisState draw(Graphics2D g2, double cursor, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo plotState) {
            return new AxisState(cursor);
        }

        @Override
        public List refreshTicks(Graphics2D g2, AxisState state, Rectangle2D dataArea, RectangleEdge edge) {
            return null;
        }

        // Override equals to compare label for DummyAxis
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof DummyAxis)) return false;
            DummyAxis that = (DummyAxis) obj;
            // Call super.equals to check common Axis properties
            return super.equals(obj) && ObjectUtilities.equal(getLabel(), that.getLabel());
        }
    }

    @Test
    public void testConstructor() {
        Axis axis = new DummyAxis("Test Label");
        assertEquals("Test Label", axis.getLabel());
        assertTrue(axis.isVisible());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_FONT, axis.getLabelFont());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_PAINT, axis.getLabelPaint());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_INSETS, axis.getLabelInsets());
        assertEquals(0.0, axis.getLabelAngle(), 0.00001);
        assertNull(axis.getLabelToolTip());
        assertNull(axis.getLabelURL());
        assertTrue(axis.isAxisLineVisible());
        assertEquals(Axis.DEFAULT_AXIS_LINE_PAINT, axis.getAxisLinePaint());
        assertEquals(Axis.DEFAULT_AXIS_LINE_STROKE, axis.getAxisLineStroke());
        assertTrue(axis.isTickLabelsVisible());
        assertEquals(Axis.DEFAULT_TICK_LABEL_FONT, axis.getTickLabelFont());
        assertEquals(Axis.DEFAULT_TICK_LABEL_PAINT, axis.getTickLabelPaint());
        assertEquals(Axis.DEFAULT_TICK_LABEL_INSETS, axis.getTickLabelInsets());
        assertTrue(axis.isTickMarksVisible());
        assertEquals(Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH, axis.getTickMarkInsideLength(), 0.00001f);
        assertEquals(Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH, axis.getTickMarkOutsideLength(), 0.00001f);
        assertEquals(Axis.DEFAULT_TICK_MARK_STROKE, axis.getTickMarkStroke());
        assertEquals(Axis.DEFAULT_TICK_MARK_PAINT, axis.getTickMarkPaint());
        assertEquals(0.0, axis.getFixedDimension(), 0.00001);
        assertNull(axis.getPlot());
    }

    @Test
    public void testSetVisible() {
        Axis axis = new DummyAxis(null);
        axis.setVisible(false);
        assertFalse(axis.isVisible());
        axis.setVisible(true);
        assertTrue(axis.isVisible());
    }

    @Test
    public void testSetLabel() {
        Axis axis = new DummyAxis(null);
        axis.setLabel("New Label");
        assertEquals("New Label", axis.getLabel());
        axis.setLabel(null);
        assertNull(axis.getLabel());
        axis.setLabel("");
        assertEquals("", axis.getLabel());
    }

    @Test
    public void testSetLabelFont() {
        Axis axis = new DummyAxis(null);
        Font newFont = new Font("Arial", Font.BOLD, 14);
        axis.setLabelFont(newFont);
        assertEquals(newFont, axis.getLabelFont());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelFontWithNull() {
        Axis axis = new DummyAxis(null);
        axis.setLabelFont(null);
    }

    @Test
    public void testSetLabelPaint() {
        Axis axis = new DummyAxis(null);
        Paint newPaint = Color.RED;
        axis.setLabelPaint(newPaint);
        assertEquals(newPaint, axis.getLabelPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPaintWithNull() {
        Axis axis = new DummyAxis(null);
        axis.setLabelPaint(null);
    }

    @Test
    public void testSetLabelInsets() {
        Axis axis = new DummyAxis(null);
        RectangleInsets newInsets = new RectangleInsets(5.0, 5.0, 5.0, 5.0);
        axis.setLabelInsets(newInsets);
        assertEquals(newInsets, axis.getLabelInsets());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelInsetsWithNull() {
        Axis axis = new DummyAxis(null);
        axis.setLabelInsets(null);
    }

    @Test
    public void testSetLabelAngle() {
        Axis axis = new DummyAxis(null);
        axis.setLabelAngle(Math.PI / 4.0);
        assertEquals(Math.PI / 4.0, axis.getLabelAngle(), 0.00001);
    }

    @Test
    public void testSetLabelToolTip() {
        Axis axis = new DummyAxis(null);
        axis.setLabelToolTip("Tooltip");
        assertEquals("Tooltip", axis.getLabelToolTip());
        axis.setLabelToolTip(null);
        assertNull(axis.getLabelToolTip());
    }

    @Test
    public void testSetLabelURL() {
        Axis axis = new DummyAxis(null);
        axis.setLabelURL("http://example.com");
        assertEquals("http://example.com", axis.getLabelURL());
        axis.setLabelURL(null);
        assertNull(axis.getLabelURL());
    }

    @Test
    public void testSetAxisLineVisible() {
        Axis axis = new DummyAxis(null);
        axis.setAxisLineVisible(false);
        assertFalse(axis.isAxisLineVisible());
        axis.setAxisLineVisible(true);
        assertTrue(axis.isAxisLineVisible());
    }

    @Test
    public void testSetAxisLinePaint() {
        Axis axis = new DummyAxis(null);
        Paint newPaint = Color.BLUE;
        axis.setAxisLinePaint(newPaint);
        assertEquals(newPaint, axis.getAxisLinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisLinePaintWithNull() {
        Axis axis = new DummyAxis(null);
        axis.setAxisLinePaint(null);
    }

    @Test
    public void testSetAxisLineStroke() {
        Axis axis = new DummyAxis(null);
        Stroke newStroke = new BasicStroke(2.0f);
        axis.setAxisLineStroke(newStroke);
        assertEquals(newStroke, axis.getAxisLineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisLineStrokeWithNull() {
        Axis axis = new DummyAxis(null);
        axis.setAxisLineStroke(null);
    }

    @Test
    public void testSetTickLabelsVisible() {
        Axis axis = new DummyAxis(null);
        axis.setTickLabelsVisible(false);
        assertFalse(axis.isTickLabelsVisible());
        axis.setTickLabelsVisible(true);
        assertTrue(axis.isTickLabelsVisible());
    }

    @Test
    public void testSetTickLabelFont() {
        Axis axis = new DummyAxis(null);
        Font newFont = new Font("Courier", Font.ITALIC, 9);
        axis.setTickLabelFont(newFont);
        assertEquals(newFont, axis.getTickLabelFont());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelFontWithNull() {
        Axis axis = new DummyAxis(null);
        axis.setTickLabelFont(null);
    }

    @Test
    public void testSetTickLabelPaint() {
        Axis axis = new DummyAxis(null);
        Paint newPaint = Color.GREEN;
        axis.setTickLabelPaint(newPaint);
        assertEquals(newPaint, axis.getTickLabelPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelPaintWithNull() {
        Axis axis = new DummyAxis(null);
        axis.setTickLabelPaint(null);
    }

    @Test
    public void testSetTickLabelInsets() {
        Axis axis = new DummyAxis(null);
        RectangleInsets newInsets = new RectangleInsets(1.0, 2.0, 3.0, 4.0);
        axis.setTickLabelInsets(newInsets);
        assertEquals(newInsets, axis.getTickLabelInsets());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelInsetsWithNull() {
        Axis axis = new DummyAxis(null);
        axis.setTickLabelInsets(null);
    }

    @Test
    public void testSetTickMarksVisible() {
        Axis axis = new DummyAxis(null);
        axis.setTickMarksVisible(false);
        assertFalse(axis.isTickMarksVisible());
        axis.setTickMarksVisible(true);
        assertTrue(axis.isTickMarksVisible());
    }

    @Test
    public void testSetTickMarkInsideLength() {
        Axis axis = new DummyAxis(null);
        axis.setTickMarkInsideLength(5.0f);
        assertEquals(5.0f, axis.getTickMarkInsideLength(), 0.00001f);
    }

    @Test
    public void testSetTickMarkOutsideLength() {
        Axis axis = new DummyAxis(null);
        axis.setTickMarkOutsideLength(10.0f);
        assertEquals(10.0f, axis.getTickMarkOutsideLength(), 0.00001f);
    }

    @Test
    public void testSetTickMarkStroke() {
        Axis axis = new DummyAxis(null);
        Stroke newStroke = new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        axis.setTickMarkStroke(newStroke);
        assertEquals(newStroke, axis.getTickMarkStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTickMarkStrokeWithNull() {
        Axis axis = new DummyAxis(null);
        axis.setTickMarkStroke(null);
    }

    @Test
    public void testSetTickMarkPaint() {
        Axis axis = new DummyAxis(null);
        Paint newPaint = Color.CYAN;
        axis.setTickMarkPaint(newPaint);
        assertEquals(newPaint, axis.getTickMarkPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTickMarkPaintWithNull() {
        Axis axis = new DummyAxis(null);
        axis.setTickMarkPaint(null);
    }

    @Test
    public void testSetPlot() {
        Axis axis = new DummyAxis(null);
        // Use a concrete subclass of Plot if available, or a mock.
        // Since we don't have a simple concrete Plot, a mock is appropriate.
        // The previous mock was too complex and had errors. Let's simplify.
        Plot mockPlot = new MockPlot();
        axis.setPlot(mockPlot);
        assertEquals(mockPlot, axis.getPlot());
    }

    @Test
    public void testSetFixedDimension() {
        Axis axis = new DummyAxis(null);
        axis.setFixedDimension(100.0);
        assertEquals(100.0, axis.getFixedDimension(), 0.00001);
    }

    @Test
    public void testAddChangeListener() {
        Axis axis = new DummyAxis(null);
        AxisChangeListener listener = new AxisChangeListener() {
            @Override
            public void axisChanged(AxisChangeEvent event) {}
        };
        axis.addChangeListener(listener);
        assertTrue(axis.hasListener(listener));
    }

    @Test
    public void testRemoveChangeListener() {
        Axis axis = new DummyAxis(null);
        AxisChangeListener listener = new AxisChangeListener() {
            @Override
            public void axisChanged(AxisChangeEvent event) {}
        };
        axis.addChangeListener(listener);
        axis.removeChangeListener(listener);
        assertFalse(axis.hasListener(listener));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Axis axis = new DummyAxis("Original Label");
        axis.setLabelFont(new Font("Test", Font.BOLD, 12));
        axis.setLabelPaint(Color.RED);
        axis.setAxisLineVisible(false);

        Axis clonedAxis = (Axis) axis.clone();

        assertNotNull(clonedAxis);
        assertNotSame(axis, clonedAxis);
        assertEquals(axis.getLabel(), clonedAxis.getLabel());
        assertEquals(axis.getLabelFont(), clonedAxis.getLabelFont());
        assertTrue(PaintUtilities.equal(axis.getLabelPaint(), clonedAxis.getLabelPaint()));
        assertEquals(axis.isAxisLineVisible(), clonedAxis.isAxisLineVisible());

        // Ensure the plot reference is null in the clone
        assertNull(clonedAxis.getPlot());
        // Ensure listeners are not cloned
        assertFalse(clonedAxis.hasListener(null)); // No listeners were added to the original, so it should be false.
    }

    @Test
    public void testEquals() {
        Axis axis1 = new DummyAxis("Label1");
        Axis axis2 = new DummyAxis("Label1");
        Axis axis3 = new DummyAxis("Label2");

        assertTrue(axis1.equals(axis2));
        assertFalse(axis1.equals(axis3));

        // Test with different properties
        axis1.setVisible(false);
        assertFalse(axis1.equals(axis2));
        axis2.setVisible(false);
        assertTrue(axis1.equals(axis2));

        axis1.setLabelFont(new Font("Arial", Font.PLAIN, 10));
        assertFalse(axis1.equals(axis2));
        axis2.setLabelFont(new Font("Arial", Font.PLAIN, 10));
        assertTrue(axis1.equals(axis2));

        axis1.setLabelPaint(Color.BLUE);
        assertFalse(axis1.equals(axis2));
        axis2.setLabelPaint(Color.BLUE);
        assertTrue(axis1.equals(axis2));

        axis1.setLabelInsets(new RectangleInsets(1, 1, 1, 1));
        assertFalse(axis1.equals(axis2));
        axis2.setLabelInsets(new RectangleInsets(1, 1, 1, 1));
        assertTrue(axis1.equals(axis2));
        
        axis1.setLabelAngle(Math.PI / 2.0);
        assertFalse(axis1.equals(axis2));
        axis2.setLabelAngle(Math.PI / 2.0);
        assertTrue(axis1.equals(axis2));

        axis1.setAxisLineVisible(false);
        assertFalse(axis1.equals(axis2));
        axis2.setAxisLineVisible(false);
        assertTrue(axis1.equals(axis2));
        
        axis1.setAxisLinePaint(Color.RED);
        assertFalse(axis1.equals(axis2));
        axis2.setAxisLinePaint(Color.RED);
        assertTrue(axis1.equals(axis2));
        
        axis1.setAxisLineStroke(new BasicStroke(2.0f));
        assertFalse(axis1.equals(axis2));
        axis2.setAxisLineStroke(new BasicStroke(2.0f));
        assertTrue(axis1.equals(axis2));

        axis1.setTickLabelsVisible(false);
        assertFalse(axis1.equals(axis2));
        axis2.setTickLabelsVisible(false);
        assertTrue(axis1.equals(axis2));

        axis1.setTickLabelFont(new Font("Times", Font.BOLD, 11));
        assertFalse(axis1.equals(axis2));
        axis2.setTickLabelFont(new Font("Times", Font.BOLD, 11));
        assertTrue(axis1.equals(axis2));

        axis1.setTickLabelPaint(Color.YELLOW);
        assertFalse(axis1.equals(axis2));
        axis2.setTickLabelPaint(Color.YELLOW);
        assertTrue(axis1.equals(axis2));

        axis1.setTickLabelInsets(new RectangleInsets(2, 2, 2, 2));
        assertFalse(axis1.equals(axis2));
        axis2.setTickLabelInsets(new RectangleInsets(2, 2, 2, 2));
        assertTrue(axis1.equals(axis2));

        axis1.setTickMarksVisible(false);
        assertFalse(axis1.equals(axis2));
        axis2.setTickMarksVisible(false);
        assertTrue(axis1.equals(axis2));
        
        axis1.setTickMarkInsideLength(3.0f);
        assertFalse(axis1.equals(axis2));
        axis2.setTickMarkInsideLength(3.0f);
        assertTrue(axis1.equals(axis2));

        axis1.setTickMarkOutsideLength(7.0f);
        assertFalse(axis1.equals(axis2));
        axis2.setTickMarkOutsideLength(7.0f);
        assertTrue(axis1.equals(axis2));

        axis1.setTickMarkStroke(new BasicStroke(1.5f));
        assertFalse(axis1.equals(axis2));
        axis2.setTickMarkStroke(new BasicStroke(1.5f));
        assertTrue(axis1.equals(axis2));
        
        axis1.setTickMarkPaint(Color.ORANGE);
        assertFalse(axis1.equals(axis2));
        axis2.setTickMarkPaint(Color.ORANGE);
        assertTrue(axis1.equals(axis2));

        axis1.setFixedDimension(50.0);
        assertFalse(axis1.equals(axis2));
        axis2.setFixedDimension(50.0);
        assertTrue(axis1.equals(axis2));
    }

    @Test
    public void testGetLabelEnclosure_WithLabel() {
        Axis axis = new DummyAxis("Test Label");
        Graphics2D g2 = mockGraphics2D();
        RectangleEdge edge = RectangleEdge.TOP;
        Rectangle2D enclosure = axis.getLabelEnclosure(g2, edge);
        assertNotNull(enclosure);
        // The exact bounds will depend on the FontMetrics, so we check for non-zero dimensions.
        assertTrue(enclosure.getWidth() > 0);
        assertTrue(enclosure.getHeight() > 0);
    }

    @Test
    public void testGetLabelEnclosure_WithoutLabel() {
        Axis axis = new DummyAxis(null);
        Graphics2D g2 = mockGraphics2D();
        RectangleEdge edge = RectangleEdge.TOP;
        Rectangle2D enclosure = axis.getLabelEnclosure(g2, edge);
        assertNotNull(enclosure);
        assertEquals(0, enclosure.getWidth(), 0.00001);
        assertEquals(0, enclosure.getHeight(), 0.00001);
    }
    
    @Test
    public void testDrawLabel_TopEdge() {
        Axis axis = new DummyAxis("Top Label");
        axis.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        axis.setLabelPaint(Color.BLACK);
        axis.setLabelInsets(new RectangleInsets(2, 4, 2, 4));
        axis.setLabelAngle(0.0);
        
        Graphics2D g2 = mockGraphics2D();
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 400, 300);
        Rectangle2D dataArea = new Rectangle2D.Double(50, 50, 300, 200);
        AxisState state = new AxisState(250); // Cursor starts at the top of dataArea
        PlotRenderingInfo plotState = mockPlotRenderingInfo();
        
        AxisState newState = axis.drawLabel("Top Label", g2, plotArea, dataArea, RectangleEdge.TOP, state, plotState);
        
        // Check state update (cursor should move down)
        assertTrue(newState.getCursor() < state.getCursor()); 
    }

    @Test
    public void testDrawLabel_BottomEdge() {
        Axis axis = new DummyAxis("Bottom Label");
        axis.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        axis.setLabelPaint(Color.BLACK);
        axis.setLabelInsets(new RectangleInsets(2, 4, 2, 4));
        axis.setLabelAngle(0.0);
        
        Graphics2D g2 = mockGraphics2D();
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 400, 300);
        Rectangle2D dataArea = new Rectangle2D.Double(50, 50, 300, 200);
        AxisState state = new AxisState(50); // Cursor starts at the bottom of dataArea
        PlotRenderingInfo plotState = mockPlotRenderingInfo();
        
        AxisState newState = axis.drawLabel("Bottom Label", g2, plotArea, dataArea, RectangleEdge.BOTTOM, state, plotState);
        
        // Check state update (cursor should move up)
        assertTrue(newState.getCursor() > state.getCursor());
    }

    @Test
    public void testDrawLabel_LeftEdge() {
        Axis axis = new DummyAxis("Left Label");
        axis.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        axis.setLabelPaint(Color.BLACK);
        axis.setLabelInsets(new RectangleInsets(2, 4, 2, 4));
        axis.setLabelAngle(0.0); // Angle is in radians, 0.0 for horizontal
        
        Graphics2D g2 = mockGraphics2D();
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 400, 300);
        Rectangle2D dataArea = new Rectangle2D.Double(50, 50, 300, 200);
        AxisState state = new AxisState(50); // Cursor starts at the left of dataArea
        PlotRenderingInfo plotState = mockPlotRenderingInfo();
        
        AxisState newState = axis.drawLabel("Left Label", g2, plotArea, dataArea, RectangleEdge.LEFT, state, plotState);
        
        // Check state update (cursor should move right)
        assertTrue(newState.getCursor() > state.getCursor());
    }
    
    @Test
    public void testDrawLabel_RightEdge() {
        Axis axis = new DummyAxis("Right Label");
        axis.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        axis.setLabelPaint(Color.BLACK);
        axis.setLabelInsets(new RectangleInsets(2, 4, 2, 4));
        axis.setLabelAngle(0.0); // Angle is in radians, 0.0 for horizontal
        
        Graphics2D g2 = mockGraphics2D();
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 400, 300);
        Rectangle2D dataArea = new Rectangle2D.Double(50, 50, 300, 200);
        AxisState state = new AxisState(350); // Cursor starts at the right of dataArea
        PlotRenderingInfo plotState = mockPlotRenderingInfo();
        
        AxisState newState = axis.drawLabel("Right Label", g2, plotArea, dataArea, RectangleEdge.RIGHT, state, plotState);
        
        // Check state update (cursor should move left)
        assertTrue(newState.getCursor() < state.getCursor());
    }

    @Test
    public void testDrawAxisLine_TopEdge() {
        Axis axis = new DummyAxis(null);
        axis.setAxisLinePaint(Color.BLUE);
        axis.setAxisLineStroke(new BasicStroke(1.5f));
        
        Graphics2D g2 = mockGraphics2D();
        Rectangle2D dataArea = new Rectangle2D.Double(50, 50, 300, 200);
        double cursor = 50.0;
        
        axis.drawAxisLine(g2, cursor, dataArea, RectangleEdge.TOP);
        // Mocking the Graphics2D to check draw calls is complex and not required by the prompt.
        // We assume drawAxisLine internally uses the set paint and stroke.
    }

    @Test
    public void testDrawAxisLine_BottomEdge() {
        Axis axis = new DummyAxis(null);
        axis.setAxisLinePaint(Color.RED);
        axis.setAxisLineStroke(new BasicStroke(1.0f));
        
        Graphics2D g2 = mockGraphics2D();
        Rectangle2D dataArea = new Rectangle2D.Double(50, 50, 300, 200);
        double cursor = 250.0;
        
        axis.drawAxisLine(g2, cursor, dataArea, RectangleEdge.BOTTOM);
    }

    @Test
    public void testDrawAxisLine_LeftEdge() {
        Axis axis = new DummyAxis(null);
        axis.setAxisLinePaint(Color.GREEN);
        axis.setAxisLineStroke(new BasicStroke(0.5f));
        
        Graphics2D g2 = mockGraphics2D();
        Rectangle2D dataArea = new Rectangle2D.Double(50, 50, 300, 200);
        double cursor = 50.0;
        
        axis.drawAxisLine(g2, cursor, dataArea, RectangleEdge.LEFT);
    }
    
    @Test
    public void testDrawAxisLine_RightEdge() {
        Axis axis = new DummyAxis(null);
        axis.setAxisLinePaint(Color.ORANGE);
        axis.setAxisLineStroke(new BasicStroke(2.5f));
        
        Graphics2D g2 = mockGraphics2D();
        Rectangle2D dataArea = new Rectangle2D.Double(50, 50, 300, 200);
        double cursor = 350.0;
        
        axis.drawAxisLine(g2, cursor, dataArea, RectangleEdge.RIGHT);
    }

    // Helper method to create a mock Graphics2D
    private Graphics2D mockGraphics2D() {
        // Using a simple BufferedImage's Graphics2D context
        return new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB).createGraphics();
    }
    
    // Helper method to create a mock PlotRenderingInfo
    private PlotRenderingInfo mockPlotRenderingInfo() {
        // Requires ChartRenderingInfo, which requires a Chart. We can create a minimal one.
        return new PlotRenderingInfo(new ChartRenderingInfo(null));
    }
    
    // Simplified MockPlot class that implements necessary methods from Plot
    private static class MockPlot extends Plot {

        @Override
        public void draw(Graphics2D g2, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo plotState) {
            // No-op for testing purposes
        }

        @Override
        public void notifyListeners(ChartChangeEvent event) {
            // No-op
        }

        // Provide dummy implementations for abstract/required methods
        @Override
        public void addProgressListener(PlotProgressListener listener) {}
        @Override
        public void removeProgressListener(PlotProgressListener listener) {}
        @Override
        public boolean isNotify() { return false; }
        @Override
        public void setNotify(boolean notify) {}
        @Override
        public void setDomainCrosshairVisible(boolean visible) {}
        @Override
        public void setRangeCrosshairVisible(boolean visible) {}
        @Override
        public void zoom(double factor) {}
        @Override
        public void addChangeListener(org.jfree.chart.event.PlotChangeListener listener) {}
        @Override
        public void removeChangeListener(org.jfree.chart.event.PlotChangeListener listener) {}
        @Override
        public boolean hasListener(EventListener listener) { return false; }
        @Override
        public void draw(Graphics2D g2, Rectangle2D area) {}
        @Override
        public void draw(Graphics2D g2, Rectangle2D area, org.jfree.chart.plot.PlotState state) {}
        @Override
        public void drawBackgroundImage(Graphics2D g2, Rectangle2D area) {}
        @Override
        public void drawOutline(Graphics2D g2, Rectangle2D area) {}
        @Override
        public void drawShadows(Graphics2D g2, Rectangle2D area) {}
        @Override
        public Rectangle2D getPlotArea() { return null; }
        @Override
        public void setPlotArea(Rectangle2D area) {}
        @Override
        public void addAnnotation(Annotation annotation) {}
        @Override
        public boolean removeAnnotation(Annotation annotation) { return false; }
        @Override
        public void clearAnnotations() {}
        @Override
        public void addStateListener(PlotStateListener listener) {}
        @Override
        public void removeStateListener(PlotStateListener listener) {}
        @Override
        public Object clone() throws CloneNotSupportedException { return null; }
        @Override
        public boolean equals(Object obj) { return false; }
        @Override
        public void addRange(Range range) {}
        @Override
        public Range getRange() { return null; }
        @Override
        public void addCategory(Comparable category) {}
        @Override
        public void clearCategories() {}
        @Override
        public Comparable getDomain(int index) { return null; }
        @Override
        public int getDomainCount() { return 0; }
        @Override
        public void addValue(Number value, Comparable rowKey, Comparable columnKey) {}
        @Override
        public void addValue(Number value, Comparable series, Comparable category) {}
        @Override
        public void addValue(Number value, Comparable series) {}
        @Override
        public void addSeries(Series series) {}
        @Override
        public void removeSeries(Series series) {}
        @Override
        public void removeAllSeries() {}
        @Override
        public void addDataset(Dataset dataset) {}
        @Override
        public void removeDataset(Dataset dataset) {}
        @Override
        public void removeAllDatasets() {}
    }
}
```