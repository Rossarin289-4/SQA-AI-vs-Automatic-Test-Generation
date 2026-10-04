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
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.util.PaintUtilities;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class MinMaxCategoryRendererTest {

    // A simple EntityCollection implementation for testing purposes.

    @Test
    public void testDefaultConstructor() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertNotNull(renderer);
        assertFalse(renderer.isDrawLines());
        assertEquals(Color.black, renderer.getGroupPaint());
        assertNotNull(renderer.getGroupStroke());
        assertNotNull(renderer.getObjectIcon());
        assertNotNull(renderer.getMaxIcon());
        assertNotNull(renderer.getMinIcon());
    }

    @Test
    public void testIsDrawLines_DefaultIsFalse() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertFalse(renderer.isDrawLines());
    }

    @Test
    public void testSetDrawLines() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);
        assertTrue(renderer.isDrawLines());
        renderer.setDrawLines(false);
        assertFalse(renderer.isDrawLines());
    }

    @Test
    public void testGetGroupPaint_DefaultIsBlack() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertEquals(Color.black, renderer.getGroupPaint());
    }

    @Test
    public void testSetGroupPaint() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Paint newPaint = Color.red;
        renderer.setGroupPaint(newPaint);
        assertEquals(newPaint, renderer.getGroupPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupPaint_NullArgument() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setGroupPaint(null);
    }


    @Test
    public void testSetGroupStroke() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        BasicStroke newStroke = new BasicStroke(2.5f);
        renderer.setGroupStroke(newStroke);
        assertEquals(newStroke, renderer.getGroupStroke()); // Direct equals might work for BasicStroke
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupStroke_NullArgument() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setGroupStroke(null);
    }

    @Test
    public void testGetObjectIcon_DefaultIsNotNull() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon icon = renderer.getObjectIcon();
        assertNotNull(icon);
        // The default objectIcon is a Line2D.Double(-4, 0, 4, 0), which implies a width of 8.
        assertEquals(8, icon.getIconWidth());
        assertEquals(0, icon.getIconHeight()); // Line has no height by itself
    }

    @Test
    public void testSetObjectIcon() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon newIcon = new Icon() {
            @Override public void paintIcon(Component c, Graphics g, int x, int y) {}
            @Override public int getIconWidth() { return 10; }
            @Override public int getIconHeight() { return 10; }
        };
        renderer.setObjectIcon(newIcon);
        assertEquals(newIcon, renderer.getObjectIcon());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObjectIcon_NullArgument() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setObjectIcon(null);
    }

    @Test
    public void testGetMaxIcon_DefaultIsNotNull() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon icon = renderer.getMaxIcon();
        assertNotNull(icon);
        // Default is Arc2D.Double(-4, -4, 8, 8)
        assertEquals(8, icon.getIconWidth());
        assertEquals(8, icon.getIconHeight());
    }

    @Test
    public void testSetMaxIcon() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon newIcon = new Icon() {
            @Override public void paintIcon(Component c, Graphics g, int x, int y) {}
            @Override public int getIconWidth() { return 12; }
            @Override public int getIconHeight() { return 12; }
        };
        renderer.setMaxIcon(newIcon);
        assertEquals(newIcon, renderer.getMaxIcon());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxIcon_NullArgument() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setMaxIcon(null);
    }

    @Test
    public void testGetMinIcon_DefaultIsNotNull() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon icon = renderer.getMinIcon();
        assertNotNull(icon);
        // Default is Arc2D.Double(-4, -4, 8, 8)
        assertEquals(8, icon.getIconWidth());
        assertEquals(8, icon.getIconHeight());
    }

    @Test
    public void testSetMinIcon() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon newIcon = new Icon() {
            @Override public void paintIcon(Component c, Graphics g, int x, int y) {}
            @Override public int getIconWidth() { return 6; }
            @Override public int getIconHeight() { return 6; }
        };
        renderer.setMinIcon(newIcon);
        assertEquals(newIcon, renderer.getMinIcon());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMinIcon_NullArgument() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setMinIcon(null);
    }

    @Test
    public void testEquals_SameObject() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertTrue(renderer.equals(renderer));
    }

    @Test
    public void testEquals_DifferentObjectSameState() {
        MinMaxCategoryRenderer renderer1 = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer renderer2 = new MinMaxCategoryRenderer();
        assertTrue(renderer1.equals(renderer2));
    }

    @Test
    public void testEquals_DifferentPlotLines() {
        MinMaxCategoryRenderer renderer1 = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer renderer2 = new MinMaxCategoryRenderer();
        renderer2.setDrawLines(true);
        assertFalse(renderer1.equals(renderer2));
    }

    @Test
    public void testEquals_DifferentGroupPaint() {
        MinMaxCategoryRenderer renderer1 = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer renderer2 = new MinMaxCategoryRenderer();
        renderer2.setGroupPaint(Color.RED);
        assertFalse(renderer1.equals(renderer2));
    }

    @Test
    public void testEquals_DifferentGroupStroke() {
        MinMaxCategoryRenderer renderer1 = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer renderer2 = new MinMaxCategoryRenderer();
        renderer2.setGroupStroke(new BasicStroke(2.0f));
        assertFalse(renderer1.equals(renderer2));
    }

    @Test
    public void testEquals_DifferentClass() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertFalse(renderer.equals("not a renderer"));
    }
    

    

    // The serialization methods are private and not typically tested directly.
    // If they were public, tests would be needed.

}

