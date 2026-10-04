package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.Icon;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.util.PaintUtilities;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.data.category.CategoryDataset;

public class MinMaxCategoryRendererTest {
    @Test
    public void testDefaultDrawLinesIsFalse() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        assertFalse(r.isDrawLines());
    }

    @Test
    public void testEnableDrawLines() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        r.setDrawLines(true);
        assertTrue(r.isDrawLines());
    }

    @Test
    public void testDisableDrawLines() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        r.setDrawLines(true);
        r.setDrawLines(false);
        assertFalse(r.isDrawLines());
    }

    @Test
    public void testDefaultGroupPaint() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        assertEquals(Color.black, r.getGroupPaint());
    }

    @Test
    public void testSetGroupPaint() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        Paint paint = Color.red;
        r.setGroupPaint(paint);
        assertSame(paint, r.getGroupPaint());
    }

    @Test
    public void testNullGroupPaintRejected() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        try {
            r.setGroupPaint(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(Color.black, r.getGroupPaint());
    }

    @Test
    public void testDefaultGroupStroke() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        assertEquals(new BasicStroke(1.0f), r.getGroupStroke());
    }

    @Test
    public void testSetGroupStroke() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        r.setGroupStroke(stroke);
        assertSame(stroke, r.getGroupStroke());
    }

    @Test
    public void testNullGroupStrokeRejected() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        try {
            r.setGroupStroke(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertEquals(new BasicStroke(1.0f), r.getGroupStroke());
    }

    @Test
    public void testDefaultObjectIconDimensions() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        assertEquals(8, r.getObjectIcon().getIconWidth());
        assertEquals(0, r.getObjectIcon().getIconHeight());
    }

    @Test
    public void testSetObjectIcon() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        Icon icon = r.getMinIcon();
        r.setObjectIcon(icon);
        assertSame(icon, r.getObjectIcon());
    }

    @Test
    public void testNullObjectIconRejected() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        Icon original = r.getObjectIcon();
        try {
            r.setObjectIcon(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertSame(original, r.getObjectIcon());
    }

    @Test
    public void testDefaultMinIconDimensions() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        assertEquals(8, r.getMinIcon().getIconWidth());
        assertEquals(8, r.getMinIcon().getIconHeight());
    }

    @Test
    public void testSetMinIcon() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        Icon icon = r.getObjectIcon();
        r.setMinIcon(icon);
        assertSame(icon, r.getMinIcon());
    }

    @Test
    public void testNullMinIconRejected() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        Icon original = r.getMinIcon();
        try {
            r.setMinIcon(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertSame(original, r.getMinIcon());
    }

    @Test
    public void testDefaultMaxIconDimensions() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        assertEquals(8, r.getMaxIcon().getIconWidth());
        assertEquals(8, r.getMaxIcon().getIconHeight());
    }

    @Test
    public void testSetMaxIcon() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        Icon icon = r.getObjectIcon();
        r.setMaxIcon(icon);
        assertSame(icon, r.getMaxIcon());
    }

    @Test
    public void testNullMaxIconRejected() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        Icon original = r.getMaxIcon();
        try {
            r.setMaxIcon(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
        assertSame(original, r.getMaxIcon());
    }

    @Test
    public void testEqualsSelf() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        assertTrue(r.equals(r));
    }

    @Test
    public void testEqualsNullIsFalse() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        assertFalse(r.equals(null));
    }

    @Test
    public void testEqualsDifferentTypeIsFalse() throws Exception {
        MinMaxCategoryRenderer r = new MinMaxCategoryRenderer();
        assertFalse(r.equals("renderer"));
    }

    @Test
    public void testSeparateDefaultRenderersAreEqual() throws Exception {
        MinMaxCategoryRenderer first = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer second = new MinMaxCategoryRenderer();
        assertTrue(first.equals(second));
    }

    @Test
    public void testChangedDrawLinesMakesRenderersUnequal() throws Exception {
        MinMaxCategoryRenderer first = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer second = new MinMaxCategoryRenderer();
        second.setDrawLines(true);
        assertFalse(first.equals(second));
    }

    @Test
    public void testChangedGroupPaintMakesRenderersUnequal() throws Exception {
        MinMaxCategoryRenderer first = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer second = new MinMaxCategoryRenderer();
        second.setGroupPaint(Color.red);
        assertFalse(first.equals(second));
    }

    @Test
    public void testChangedGroupStrokeMakesRenderersUnequal() throws Exception {
        MinMaxCategoryRenderer first = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer second = new MinMaxCategoryRenderer();
        second.setGroupStroke(new BasicStroke(2.0f));
        assertFalse(first.equals(second));
    }
}
