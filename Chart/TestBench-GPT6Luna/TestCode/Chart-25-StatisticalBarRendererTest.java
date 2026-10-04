package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.util.PaintUtilities;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.StatisticalCategoryDataset;

public class StatisticalBarRendererTest {
    @Test
    public void testDefaultErrorIndicatorPaint() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertEquals(Color.gray, renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testDefaultErrorIndicatorStroke() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertEquals(new BasicStroke(0.5f), renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testSetErrorIndicatorPaint() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setErrorIndicatorPaint(Color.red);
        assertEquals(Color.red, renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testSetNullErrorIndicatorPaint() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setErrorIndicatorPaint(null);
        assertNull(renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testSetErrorIndicatorStroke() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        renderer.setErrorIndicatorStroke(stroke);
        assertSame(stroke, renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testSetNullErrorIndicatorStroke() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setErrorIndicatorStroke(null);
        assertNull(renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testEqualsItself() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertTrue(renderer.equals(renderer));
    }

    @Test
    public void testEqualsDefaultRenderer() throws Exception {
        StatisticalBarRenderer first = new StatisticalBarRenderer();
        StatisticalBarRenderer second = new StatisticalBarRenderer();
        assertTrue(first.equals(second));
    }

    @Test
    public void testNotEqualNull() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertFalse(renderer.equals(null));
    }

    @Test
    public void testNotEqualDifferentType() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertFalse(renderer.equals("renderer"));
    }

    @Test
    public void testEqualAfterSamePaintChange() throws Exception {
        StatisticalBarRenderer first = new StatisticalBarRenderer();
        StatisticalBarRenderer second = new StatisticalBarRenderer();
        first.setErrorIndicatorPaint(Color.blue);
        second.setErrorIndicatorPaint(Color.blue);
        assertTrue(first.equals(second));
    }

    @Test
    public void testNotEqualDifferentPaint() throws Exception {
        StatisticalBarRenderer first = new StatisticalBarRenderer();
        StatisticalBarRenderer second = new StatisticalBarRenderer();
        first.setErrorIndicatorPaint(Color.red);
        second.setErrorIndicatorPaint(Color.blue);
        assertFalse(first.equals(second));
    }

    @Test
    public void testNullPaintsCompareEqual() throws Exception {
        StatisticalBarRenderer first = new StatisticalBarRenderer();
        StatisticalBarRenderer second = new StatisticalBarRenderer();
        first.setErrorIndicatorPaint(null);
        second.setErrorIndicatorPaint(null);
        assertTrue(first.equals(second));
    }

    @Test
    public void testStrokeDifferenceDoesNotAffectEquals() throws Exception {
        StatisticalBarRenderer first = new StatisticalBarRenderer();
        StatisticalBarRenderer second = new StatisticalBarRenderer();
        first.setErrorIndicatorStroke(new BasicStroke(1.0f));
        second.setErrorIndicatorStroke(new BasicStroke(3.0f));
        assertTrue(first.equals(second));
    }
}
