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
import org.jfree.chart.axis.AxisEdge; // Added import
import org.jfree.chart.axis.RectangleEdge; // Added import


public class MinMaxCategoryRendererTest {

    // A simple EntityCollection implementation for testing purposes.
    private static class TestEntityCollection implements EntityCollection {
        private java.util.List<ChartEntity> entities = new java.util.ArrayList<>();

        @Override
        public void clear() {
            entities.clear();
        }

        @Override
        public void add(ChartEntity entity) {
            entities.add(entity);
        }

        @Override
        public void addAll(EntityCollection collection) {
            if (collection != null) {
                for (ChartEntity entity : collection) {
                    entities.add(entity);
                }
            }
        }

        @Override
        public ChartEntity getEntity(double x, double y) {
            for (ChartEntity entity : entities) {
                if (entity.getShape().contains(x, y)) {
                    return entity;
                }
            }
            return null;
        }

        @Override
        public ChartEntity getEntity(int index) {
            return entities.get(index);
        }

        @Override
        public int getEntityCount() {
            return entities.size();
        }

        @Override
        public java.util.Collection getEntities() {
            return java.util.Collections.unmodifiableCollection(entities);
        }

        @Override
        public java.util.Iterator iterator() {
            return entities.iterator();
        }
    }

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
    public void testGetGroupStroke_DefaultIsBasicStroke1() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Stroke defaultStroke = new BasicStroke(1.0f);
        Stroke returnedStroke = renderer.getGroupStroke();
        assertNotNull(returnedStroke);
        // Comparing stroke properties as direct equals may fail for different instances
        assertEquals(defaultStroke.getLineWidth(), returnedStroke.getLineWidth(), 0.001f);
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
    
    @Test
    public void testDrawItem_DoesNotThrowExceptionWithMinimalData() throws Exception {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryDataset dataset = new DefaultCategoryDataset();
        ((DefaultCategoryDataset) dataset).addValue(10.0, "Series1", "Category1");

        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = new CategoryAxis("Category");
        ValueAxis rangeAxis = new NumberAxis("Value");
        
        PlotRenderingInfo info = new PlotRenderingInfo();
        CategoryItemRendererState state = renderer.createState(info); // Use protected method
        
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_RGB).getGraphics();
        
        // Set up axes to return plausible values
        // For CategoryAxis.getCategoryMiddle
        // For ValueAxis.valueToJava2D
        // These are hard to mock without Mockito. Let's assume defaults are fine for exception testing.
        // However, the method calls them. If they throw exceptions, test will fail.
        // Let's use dummy values that won't cause issues.
        
        // Set plot orientation and edges as required by some internal calls
        plot.setDomainAxisEdge(RectangleEdge.BOTTOM);
        plot.setRangeAxisEdge(RectangleEdge.LEFT);

        // We need to provide a non-null EntityCollection to state if we want to test that path.
        TestEntityCollection entities = new TestEntityCollection();
        state.setEntityCollection(entities);

        try {
            renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
            // If no exception is thrown, the test passes.
            // We can assert that an entity might have been added if the shape was created.
            // This is difficult to assert without knowing the shape creation logic precisely.
        } catch (Exception e) {
            fail("drawItem threw an exception: " + e.getMessage());
        }
        // If the dataset has a value, and entity collection is set, an entity might be added.
        // We can't assert the exact number without inspecting the shape creation logic.
        // For now, just ensuring it doesn't crash is the primary goal for this complex method.
    }

    @Test
    public void testDrawItem_NullValue_DoesNotThrowException() throws Exception {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(null, "Series1", "Category1");

        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = new CategoryAxis("Category");
        ValueAxis rangeAxis = new NumberAxis("Value");
        
        PlotRenderingInfo info = new PlotRenderingInfo();
        CategoryItemRendererState state = renderer.createState(info);
        
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_RGB).getGraphics();
        
        plot.setDomainAxisEdge(RectangleEdge.BOTTOM);
        plot.setRangeAxisEdge(RectangleEdge.LEFT);
        
        TestEntityCollection entities = new TestEntityCollection();
        state.setEntityCollection(entities);
        
        try {
            renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        } catch (Exception e) {
            fail("drawItem threw an exception with null value: " + e.getMessage());
        }
    }
    
    @Test
    public void testDrawItem_PlotLinesTrue_HorizontalOrientation() throws Exception {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);
        CategoryDataset dataset = new DefaultCategoryDataset();
        // Two categories, two series
        ((DefaultCategoryDataset) dataset).addValue(10.0, "Series1", "Category1");
        ((DefaultCategoryDataset) dataset).addValue(20.0, "Series1", "Category2");
        ((DefaultCategoryDataset) dataset).addValue(15.0, "Series2", "Category1");
        ((DefaultCategoryDataset) dataset).addValue(25.0, "Series2", "Category2");

        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 400, 400);
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        CategoryAxis domainAxis = new CategoryAxis("Category"); // This would be vertical in horizontal plot
        ValueAxis rangeAxis = new NumberAxis("Value"); // This would be horizontal in horizontal plot
        
        PlotRenderingInfo info = new PlotRenderingInfo();
        CategoryItemRendererState state = renderer.createState(info);
        
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_RGB).getGraphics();
        
        plot.setDomainAxisEdge(RectangleEdge.RIGHT); // Example edge
        plot.setRangeAxisEdge(RectangleEdge.TOP); // Example edge

        TestEntityCollection entities = new TestEntityCollection();
        state.setEntityCollection(entities);

        // Simulate drawing the second item in the first series. This should draw a line to the previous point.
        // This test can't truly verify if a line was drawn by Graphics2D.
        // It mainly checks if the method executes without error.
        try {
            // Draw first item (row 0, column 0)
            renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
            // Draw second item (row 0, column 1)
            renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0);
        } catch (Exception e) {
            fail("drawItem threw an exception when plotLines is true: " + e.getMessage());
        }
    }

    // The serialization methods are private and not typically tested directly.
    // If they were public, tests would be needed.

}
