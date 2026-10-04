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

public class AxisTest {
    @Test
    public void testInitialVisibilityAndSetVisible() throws Exception {
        NumberAxis axis = new NumberAxis("value");
        assertTrue(axis.isVisible());
        axis.setVisible(false);
        assertFalse(axis.isVisible());
    }

    @Test
    public void testLabelNullAndReplacement() throws Exception {
        NumberAxis axis = new NumberAxis(null);
        assertNull(axis.getLabel());
        axis.setLabel("depth");
        assertEquals("depth", axis.getLabel());
        axis.setLabel(null);
        assertNull(axis.getLabel());
    }

    @Test
    public void testLabelFontAndNullRejection() throws Exception {
        NumberAxis axis = new NumberAxis();
        Font font = new Font("Serif", Font.BOLD, 14);
        axis.setLabelFont(font);
        assertEquals(font, axis.getLabelFont());
        try {
            axis.setLabelFont(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testLabelPaintAndNullRejection() throws Exception {
        NumberAxis axis = new NumberAxis();
        Paint paint = Color.blue;
        axis.setLabelPaint(paint);
        assertSame(paint, axis.getLabelPaint());
        try {
            axis.setLabelPaint(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testLabelInsetsAndNullRejection() throws Exception {
        NumberAxis axis = new NumberAxis();
        RectangleInsets insets = new RectangleInsets(1.0, 2.0, 3.0, 4.0);
        axis.setLabelInsets(insets);
        assertSame(insets, axis.getLabelInsets());
        try {
            axis.setLabelInsets(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testLabelAngleRoundTripsFiniteEdges() throws Exception {
        NumberAxis axis = new NumberAxis();
        axis.setLabelAngle(-Math.PI);
        assertEquals(-Math.PI, axis.getLabelAngle(), 0.0);
        axis.setLabelAngle(Math.PI);
        assertEquals(Math.PI, axis.getLabelAngle(), 0.0);
    }

    @Test
    public void testLabelToolTipAndUrlSupportNull() throws Exception {
        NumberAxis axis = new NumberAxis();
        assertNull(axis.getLabelToolTip());
        assertNull(axis.getLabelURL());
        axis.setLabelToolTip("hint");
        axis.setLabelURL("url");
        assertEquals("hint", axis.getLabelToolTip());
        assertEquals("url", axis.getLabelURL());
        axis.setLabelToolTip(null);
        axis.setLabelURL(null);
        assertNull(axis.getLabelToolTip());
        assertNull(axis.getLabelURL());
    }

    @Test
    public void testAxisLineVisibilityCanBeChanged() throws Exception {
        NumberAxis axis = new NumberAxis();
        assertTrue(axis.isAxisLineVisible());
        axis.setAxisLineVisible(false);
        assertFalse(axis.isAxisLineVisible());
        axis.setAxisLineVisible(true);
        assertTrue(axis.isAxisLineVisible());
    }

    @Test
    public void testAxisLinePaintAndNullRejection() throws Exception {
        NumberAxis axis = new NumberAxis();
        Paint paint = Color.green;
        axis.setAxisLinePaint(paint);
        assertSame(paint, axis.getAxisLinePaint());
        try {
            axis.setAxisLinePaint(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testAxisLineStrokeAndNullRejection() throws Exception {
        NumberAxis axis = new NumberAxis();
        Stroke stroke = new BasicStroke(2.0f);
        axis.setAxisLineStroke(stroke);
        assertSame(stroke, axis.getAxisLineStroke());
        try {
            axis.setAxisLineStroke(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testTickLabelVisibilityAndFont() throws Exception {
        NumberAxis axis = new NumberAxis();
        assertTrue(axis.isTickLabelsVisible());
        axis.setTickLabelsVisible(false);
        assertFalse(axis.isTickLabelsVisible());
        Font font = new Font("Serif", Font.PLAIN, 9);
        axis.setTickLabelFont(font);
        assertEquals(font, axis.getTickLabelFont());
        try {
            axis.setTickLabelFont(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testTickLabelPaintAndNullRejection() throws Exception {
        NumberAxis axis = new NumberAxis();
        Paint paint = Color.red;
        axis.setTickLabelPaint(paint);
        assertSame(paint, axis.getTickLabelPaint());
        try {
            axis.setTickLabelPaint(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testTickLabelInsetsAndNullRejection() throws Exception {
        NumberAxis axis = new NumberAxis();
        RectangleInsets insets = new RectangleInsets(5.0, 6.0, 7.0, 8.0);
        axis.setTickLabelInsets(insets);
        assertSame(insets, axis.getTickLabelInsets());
        try {
            axis.setTickLabelInsets(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testTickMarksVisibilityCanBeChanged() throws Exception {
        NumberAxis axis = new NumberAxis();
        assertTrue(axis.isTickMarksVisible());
        axis.setTickMarksVisible(false);
        assertFalse(axis.isTickMarksVisible());
        axis.setTickMarksVisible(true);
        assertTrue(axis.isTickMarksVisible());
    }

    @Test
    public void testTickMarkLengthsIncludingZeroAndNegative() throws Exception {
        NumberAxis axis = new NumberAxis();
        axis.setTickMarkInsideLength(0.0f);
        axis.setTickMarkOutsideLength(-1.0f);
        assertEquals(0.0f, axis.getTickMarkInsideLength(), 0.0f);
        assertEquals(-1.0f, axis.getTickMarkOutsideLength(), 0.0f);
    }

    @Test
    public void testTickMarkStrokeAndNullRejection() throws Exception {
        NumberAxis axis = new NumberAxis();
        Stroke stroke = new BasicStroke(3.0f);
        axis.setTickMarkStroke(stroke);
        assertSame(stroke, axis.getTickMarkStroke());
        try {
            axis.setTickMarkStroke(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testTickMarkPaintAndNullRejection() throws Exception {
        NumberAxis axis = new NumberAxis();
        Paint paint = Color.orange;
        axis.setTickMarkPaint(paint);
        assertSame(paint, axis.getTickMarkPaint());
        try {
            axis.setTickMarkPaint(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testPlotReferenceAndFixedDimension() throws Exception {
        NumberAxis axis = new NumberAxis();
        assertNull(axis.getPlot());
        axis.setPlot(null);
        assertNull(axis.getPlot());
        axis.setFixedDimension(0.0);
        assertEquals(0.0, axis.getFixedDimension(), 0.0);
        axis.setFixedDimension(-1.0);
        assertEquals(-1.0, axis.getFixedDimension(), 0.0);
    }

    @Test
    public void testListenerRegistrationAndRemoval() throws Exception {
        NumberAxis axis = new NumberAxis();
        AxisChangeListener listener = new AxisChangeListener() {
            public void axisChanged(AxisChangeEvent event) {
            }
        };
        assertFalse(axis.hasListener(listener));
        axis.addChangeListener(listener);
        assertTrue(axis.hasListener(listener));
        axis.removeChangeListener(listener);
        assertFalse(axis.hasListener(listener));
    }

    @Test
    public void testEqualsTracksAxisProperties() throws Exception {
        NumberAxis first = new NumberAxis("x");
        NumberAxis second = new NumberAxis("x");
        assertTrue(first.equals(second));
        assertFalse(first.equals(null));
        assertFalse(first.equals("x"));
        second.setLabelAngle(0.5);
        assertFalse(first.equals(second));
    }

    @Test
    public void testCloneHasEqualPropertiesAndNoPlot() throws Exception {
        NumberAxis axis = new NumberAxis("x");
        axis.setPlot(null);
        axis.setFixedDimension(12.0);
        NumberAxis copy = (NumberAxis) axis.clone();
        assertTrue(axis.equals(copy));
        assertNull(copy.getPlot());
        assertEquals(12.0, copy.getFixedDimension(), 0.0);
        assertFalse(copy.hasListener(new AxisChangeListener() {
            public void axisChanged(AxisChangeEvent event) {
            }
        }));
    }

    @Test
    public void testConfigureCanBeCalledWithNoPlot() throws Exception {
        NumberAxis axis = new NumberAxis("x");
        axis.configure();
        assertNull(axis.getPlot());
    }

    @Test
    public void testReserveSpaceWithConfiguredArea() throws Exception {
        NumberAxis axis = new NumberAxis("x");
        Graphics2D g2 = new java.awt.image.BufferedImage(
                120, 100, java.awt.image.BufferedImage.TYPE_INT_ARGB)
                .createGraphics();
        try {
            AxisSpace result = axis.reserveSpace(g2, null,
                    new Rectangle2D.Double(0.0, 0.0, 100.0, 80.0),
                    RectangleEdge.BOTTOM, new AxisSpace());
            assertNotNull(result);
            assertTrue(result.getBottom() >= 0.0);
        } finally {
            g2.dispose();
        }
    }

    @Test
    public void testReserveSpaceUsesExistingSpace() throws Exception {
        NumberAxis axis = new NumberAxis(null);
        Graphics2D g2 = new java.awt.image.BufferedImage(
                120, 100, java.awt.image.BufferedImage.TYPE_INT_ARGB)
                .createGraphics();
        try {
            AxisSpace space = new AxisSpace();
            space.add(7.0, RectangleEdge.BOTTOM);
            AxisSpace result = axis.reserveSpace(g2, null,
                    new Rectangle2D.Double(0.0, 0.0, 100.0, 80.0),
                    RectangleEdge.BOTTOM, space);
            assertNotNull(result);
            assertTrue(result.getBottom() >= 7.0);
        } finally {
            g2.dispose();
        }
    }

    @Test
    public void testDrawReturnsStateForConfiguredAxis() throws Exception {
        NumberAxis axis = new NumberAxis("x");
        Graphics2D g2 = new java.awt.image.BufferedImage(
                120, 100, java.awt.image.BufferedImage.TYPE_INT_ARGB)
                .createGraphics();
        try {
            Rectangle2D area = new Rectangle2D.Double(10.0, 10.0, 80.0, 60.0);
            AxisState state = axis.draw(g2, 70.0, area, area,
                    RectangleEdge.BOTTOM, null);
            assertNotNull(state);
            assertEquals(105.609375, state.getCursor(), 0.0);
        } finally {
            g2.dispose();
        }
    }

    @Test
    public void testDrawWithHiddenAxisReturnsState() throws Exception {
        NumberAxis axis = new NumberAxis("x");
        axis.setVisible(false);
        Graphics2D g2 = new java.awt.image.BufferedImage(
                120, 100, java.awt.image.BufferedImage.TYPE_INT_ARGB)
                .createGraphics();
        try {
            Rectangle2D area = new Rectangle2D.Double(10.0, 10.0, 80.0, 60.0);
            AxisState state = axis.draw(g2, 70.0, area, area,
                    RectangleEdge.BOTTOM, null);
            assertNotNull(state);
            assertEquals(70.0, state.getCursor(), 0.0);
        } finally {
            g2.dispose();
        }
    }

    @Test
    public void testRefreshTicksOnBottomEdge() throws Exception {
        NumberAxis axis = new NumberAxis("x");
        Graphics2D g2 = new java.awt.image.BufferedImage(
                120, 100, java.awt.image.BufferedImage.TYPE_INT_ARGB)
                .createGraphics();
        try {
            AxisState state = new AxisState();
            List ticks = axis.refreshTicks(g2, state,
                    new Rectangle2D.Double(0.0, 0.0, 100.0, 80.0),
                    RectangleEdge.BOTTOM);
            assertNotNull(ticks);
        } finally {
            g2.dispose();
        }
    }

    @Test
    public void testRefreshTicksOnLeftEdge() throws Exception {
        NumberAxis axis = new NumberAxis("x");
        Graphics2D g2 = new java.awt.image.BufferedImage(
                120, 100, java.awt.image.BufferedImage.TYPE_INT_ARGB)
                .createGraphics();
        try {
            AxisState state = new AxisState();
            List ticks = axis.refreshTicks(g2, state,
                    new Rectangle2D.Double(0.0, 0.0, 100.0, 80.0),
                    RectangleEdge.LEFT);
            assertNotNull(ticks);
        } finally {
            g2.dispose();
        }
    }
}
