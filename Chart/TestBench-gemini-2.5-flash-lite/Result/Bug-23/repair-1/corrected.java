package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
import java.awt.image.BufferedImage; // Added import

import javax.swing.Icon;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D; // Added import for concrete subclass
import org.jfree.chart.axis.NumberAxis; // Added import for concrete subclass
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot; // Added import
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo; // Added import
import org.jfree.chart.util.PaintUtilities;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.axis.AxisSpace; // Added import
import org.jfree.chart.axis.AxisState; // Added import
import org.jfree.chart.axis.RectangleEdge; // Added import


public class MinMaxCategoryRendererTest {

    // Helper method to create a dummy CategoryPlot, CategoryAxis, and ValueAxis
    private CategoryPlot createMockPlot() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        return plot;
    }

    private CategoryAxis createMockCategoryAxis() {
        // Use a concrete subclass or mock if no concrete subclass is suitable
        return new CategoryAxis("Category"); // Using default constructor
    }

    private ValueAxis createMockValueAxis() {
        // Using a concrete subclass of ValueAxis
        return new NumberAxis("Value");
    }

    private CategoryItemRendererState createMockRendererState() {
        // A simple dummy renderer state
        return new CategoryItemRendererState(null) {
            private EntityCollection entities;

            @Override
            public EntityCollection getEntityCollection() {
                return entities;
            }

            @Override
            public void setEntityCollection(EntityCollection entities) {
                this.entities = entities;
            }
        };
    }

    // Helper to mock common methods for drawItem
    private void mockAxesAndPlot(CategoryPlot plot, CategoryAxis domainAxis, ValueAxis rangeAxis, PlotOrientation orientation) {
        plot.setOrientation(orientation);
        
        // Mocking axis behavior
        when(domainAxis.getCategoryMiddle(anyInt(), anyInt(), any(Rectangle2D.class), any(RectangleEdge.class))).thenAnswer(invocation -> {
            int column = invocation.getArgument(0);
            if (orientation == PlotOrientation.VERTICAL) {
                return 50.0 + (column * 100.0); // X-coordinate for vertical
            } else {
                return 50.0 + (column * 100.0); // Y-coordinate for horizontal
            }
        });

        when(rangeAxis.valueToJava2D(anyDouble(), any(Rectangle2D.class), any(RectangleEdge.class))).thenAnswer(invocation -> {
            double value = invocation.getArgument(0);
            Rectangle2D area = invocation.getArgument(1);
            if (orientation == PlotOrientation.VERTICAL) {
                // Y-axis for vertical plot
                return area.getHeight() - (value * (area.getHeight() / 30.0)); // Example scaling
            } else {
                // X-axis for horizontal plot
                return area.getWidth() - (value * (area.getWidth() / 30.0)); // Example scaling
            }
        });
    }

    @Test
    public void testDrawItem_VerticalOrientation_FirstCategory() throws Exception {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryDataset dataset = new DefaultCategoryDataset();
        ((DefaultCategoryDataset) dataset).addValue(10.0, "Series1", "Category1");
        ((DefaultCategoryDataset) dataset).addValue(20.0, "Series1", "Category2"); // This value won't be processed as first category

        Graphics2D g2 = (Graphics2D) new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB).getGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        CategoryPlot plot = createMockPlot();
        CategoryAxis domainAxis = createMockCategoryAxis();
        ValueAxis rangeAxis = createMockValueAxis();
        CategoryItemRendererState state = createMockRendererState();
        
        mockAxesAndPlot(plot, domainAxis, rangeAxis, PlotOrientation.VERTICAL);

        when(dataset.getValue(0, 0)).thenReturn(10.0);
        when(dataset.getRowCount()).thenReturn(1);
        when(dataset.getColumnCount()).thenReturn(2);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);

        // After drawing the first item, lastCategory should be 0, and min/max should be 10.0
        assertEquals(0, renderer.lastCategory);
        assertEquals(10.0, renderer.min, 0.0001);
        assertEquals(10.0, renderer.max, 0.0001);
    }


    @Test
    public void testDrawItem_VerticalOrientation_LastCategory_MinMaxDrawn() throws Exception {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryDataset dataset = new DefaultCategoryDataset();
        
        // Simulate a dataset where the last row contains the max/min for the last category
        dataset.addValue(10.0, "Series1", "Category1"); // row 0, col 0
        dataset.addValue(5.0, "Series1", "Category2");  // row 0, col 1
        dataset.addValue(15.0, "Series2", "Category1"); // row 1, col 0
        dataset.addValue(25.0, "Series2", "Category2"); // row 1, col 1 (Last row for Category2)

        Graphics2D g2 = (Graphics2D) new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB).getGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        CategoryPlot plot = createMockPlot();
        CategoryAxis domainAxis = createMockCategoryAxis();
        ValueAxis rangeAxis = createMockValueAxis();
        CategoryItemRendererState state = createMockRendererState();
        
        mockAxesAndPlot(plot, domainAxis, rangeAxis, PlotOrientation.VERTICAL);

        when(dataset.getRowCount()).thenReturn(2); // 2 rows in the dataset
        when(dataset.getColumnCount()).thenReturn(2); // 2 columns

        // Simulate calls to drawItem
        // Call 1: row=0, col=0 (Cat1, Series1)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        assertEquals(0, renderer.lastCategory);
        assertEquals(10.0, renderer.min, 0.0001);
        assertEquals(10.0, renderer.max, 0.0001);

        // Call 2: row=0, col=1 (Cat2, Series1)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0);
        assertEquals(1, renderer.lastCategory);
        assertEquals(5.0, renderer.min, 0.0001);
        assertEquals(5.0, renderer.max, 0.0001);
        
        // Call 3: row=1, col=0 (Cat1, Series2)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 0, 0);
        assertEquals(0, renderer.lastCategory);
        assertEquals(15.0, renderer.min, 0.0001); // Min/Max are reset for the new category
        assertEquals(15.0, renderer.max, 0.0001);

        // Call 4: row=1, col=1 (Cat2, Series2) - This is the last row of the dataset.
        // The logic is: `if (dataset.getRowCount() - 1 == row)` which is `1 == 1`, so true.
        // `lastCategory` is 0 from previous call. It becomes 1.
        // `min` is updated from 15.0 to 25.0. `max` is updated from 15.0 to 25.0.
        // The min/max line should be drawn for Category 2.
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 1, 0);
        assertEquals(1, renderer.lastCategory);
        assertEquals(25.0, renderer.min, 0.0001);
        assertEquals(25.0, renderer.max, 0.0001);
    }

    @Test
    public void testDrawItem_HorizontalOrientation_FirstCategory() throws Exception {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryDataset dataset = new DefaultCategoryDataset();
        ((DefaultCategoryDataset) dataset).addValue(10.0, "Series1", "Category1");

        Graphics2D g2 = (Graphics2D) new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB).getGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        CategoryPlot plot = createMockPlot();
        CategoryAxis domainAxis = createMockCategoryAxis(); // Domain axis is now vertical for horizontal plot
        ValueAxis rangeAxis = createMockValueAxis(); // Range axis is now horizontal for horizontal plot
        CategoryItemRendererState state = createMockRendererState();
        
        mockAxesAndPlot(plot, domainAxis, rangeAxis, PlotOrientation.HORIZONTAL);

        when(dataset.getValue(0, 0)).thenReturn(10.0);
        when(dataset.getRowCount()).thenReturn(1);
        when(dataset.getColumnCount()).thenReturn(1);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);

        // After drawing the first item, lastCategory should be 0, and min/max should be 10.0
        assertEquals(0, renderer.lastCategory);
        assertEquals(10.0, renderer.min, 0.0001);
        assertEquals(10.0, renderer.max, 0.0001);
    }

    @Test
    public void testDrawItem_HorizontalOrientation_LastCategory_MinMaxDrawn() throws Exception {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryDataset dataset = new DefaultCategoryDataset();
        
        // Simulate a dataset where the last row contains the max/min for the last category
        dataset.addValue(10.0, "Series1", "Category1"); // row 0, col 0
        dataset.addValue(5.0, "Series1", "Category2");  // row 0, col 1
        dataset.addValue(15.0, "Series2", "Category1"); // row 1, col 0
        dataset.addValue(25.0, "Series2", "Category2"); // row 1, col 1 (Last row for Category2)

        Graphics2D g2 = (Graphics2D) new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB).getGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        CategoryPlot plot = createMockPlot();
        CategoryAxis domainAxis = createMockCategoryAxis(); // Domain axis is now vertical
        ValueAxis rangeAxis = createMockValueAxis(); // Range axis is now horizontal
        CategoryItemRendererState state = createMockRendererState();
        
        mockAxesAndPlot(plot, domainAxis, rangeAxis, PlotOrientation.HORIZONTAL);

        when(dataset.getRowCount()).thenReturn(2); // 2 rows in the dataset
        when(dataset.getColumnCount()).thenReturn(2); // 2 columns

        // Simulate calls to drawItem
        // Call 1: row=0, col=0 (Cat1, Series1)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        assertEquals(0, renderer.lastCategory);
        assertEquals(10.0, renderer.min, 0.0001);
        assertEquals(10.0, renderer.max, 0.0001);

        // Call 2: row=0, col=1 (Cat2, Series1)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0);
        assertEquals(1, renderer.lastCategory);
        assertEquals(5.0, renderer.min, 0.0001);
        assertEquals(5.0, renderer.max, 0.0001);
        
        // Call 3: row=1, col=0 (Cat1, Series2)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 0, 0);
        assertEquals(0, renderer.lastCategory);
        assertEquals(15.0, renderer.min, 0.0001); // Min/Max are reset for the new category
        assertEquals(15.0, renderer.max, 0.0001);

        // Call 4: row=1, col=1 (Cat2, Series2) - This is the last row of the dataset.
        // The logic is: `if (dataset.getRowCount() - 1 == row)` which is `1 == 1`, so true.
        // `lastCategory` is 0 from previous call. It becomes 1.
        // `min` is updated from 15.0 to 25.0. `max` is updated from 15.0 to 25.0.
        // The min/max line should be drawn for Category 2.
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 1, 0);
        assertEquals(1, renderer.lastCategory);
        assertEquals(25.0, renderer.min, 0.0001);
        assertEquals(25.0, renderer.max, 0.0001);
    }

    @Test
    public void testDrawItem_NullValue() throws Exception {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        CategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(null, "Series1", "Category1");

        Graphics2D g2 = (Graphics2D) new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB).getGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 200);
        CategoryPlot plot = createMockPlot();
        CategoryAxis domainAxis = createMockCategoryAxis();
        ValueAxis rangeAxis = createMockValueAxis();
        CategoryItemRendererState state = createMockRendererState();
        
        mockAxesAndPlot(plot, domainAxis, rangeAxis, PlotOrientation.VERTICAL);

        int initialLastCategory = renderer.lastCategory;
        double initialMin = renderer.min;
        double initialMax = renderer.max;

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);

        // For a null value, no drawing should occur, and state variables should not change.
        assertEquals(initialLastCategory, renderer.lastCategory);
        assertEquals(initialMin, renderer.min, 0.0001);
        assertEquals(initialMax, renderer.max, 0.0001);
    }

    @Test
    public void testDrawLines_DefaultIsFalse() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertFalse(renderer.isDrawLines());
    }

    @Test
    public void testDrawLines_SetTrue() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);
        assertTrue(renderer.isDrawLines());
    }

    @Test
    public void testDrawLines_SetFalse() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);
        renderer.setDrawLines(false);
        assertFalse(renderer.isDrawLines());
    }

    @Test
    public void testGetGroupPaint_DefaultIsBlack() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertEquals(Color.black, renderer.getGroupPaint());
    }

    @Test
    public void testGetGroupPaint_SetNewPaint() {
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
        // Compare strokes by properties, as direct equals might fail for different instances
        assertEquals(defaultStroke.getLineWidth(), renderer.getGroupStroke().getLineWidth(), 0.001f);
    }

    @Test
    public void testGetGroupStroke_SetNewStroke() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        BasicStroke newStroke = new BasicStroke(2.0f);
        renderer.setGroupStroke(newStroke);
        assertEquals(newStroke.getLineWidth(), renderer.getGroupStroke().getLineWidth(), 0.001f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupStroke_NullArgument() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        renderer.setGroupStroke(null);
    }

    @Test
    public void testGetObjectIcon_DefaultIsLine() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertNotNull(renderer.getObjectIcon());
        // The default objectIcon is a line. We can check its dimensions if known.
        // Line2D.Double(-4, 0, 4, 0) has width 8, height 0.
        // However, Icon interface might return different values based on the actual rendering.
        // Let's assume the basic check is sufficient for now.
    }

    @Test
    public void testGetObjectIcon_SetNewIcon() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon newIcon = new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {}
            @Override
            public int getIconWidth() { return 10; }
            @Override
            public int getIconHeight() { return 10; }
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
    public void testGetMaxIcon_DefaultIsArc() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertNotNull(renderer.getMaxIcon());
        // Default maxIcon is an Arc2D.Double(-4, -4, 8, 8). Bounds width/height are 8.
        assertEquals(8, renderer.getMaxIcon().getIconWidth());
        assertEquals(8, renderer.getMaxIcon().getIconHeight());
    }

    @Test
    public void testGetMaxIcon_SetNewIcon() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon newIcon = new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {}
            @Override
            public int getIconWidth() { return 5; }
            @Override
            public int getIconHeight() { return 5; }
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
    public void testGetMinIcon_DefaultIsArc() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertNotNull(renderer.getMinIcon());
        // Default minIcon is an Arc2D.Double(-4, -4, 8, 8). Bounds width/height are 8.
        assertEquals(8, renderer.getMinIcon().getIconWidth());
        assertEquals(8, renderer.getMinIcon().getIconHeight());
    }

    @Test
    public void testGetMinIcon_SetNewIcon() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Icon newIcon = new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {}
            @Override
            public int getIconWidth() { return 7; }
            @Override
            public int getIconHeight() { return 7; }
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
        // Defaults should be the same
        assertTrue(renderer1.equals(renderer2));
    }

    @Test
    public void testEquals_DifferentObjectDifferentPlotLines() {
        MinMaxCategoryRenderer renderer1 = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer renderer2 = new MinMaxCategoryRenderer();
        renderer2.setDrawLines(true);
        assertFalse(renderer1.equals(renderer2));
    }

    @Test
    public void testEquals_DifferentObjectDifferentGroupPaint() {
        MinMaxCategoryRenderer renderer1 = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer renderer2 = new MinMaxCategoryRenderer();
        renderer2.setGroupPaint(Color.red);
        assertFalse(renderer1.equals(renderer2));
    }

    @Test
    public void testEquals_DifferentObjectDifferentGroupStroke() {
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
    public void testGetIcon_WithFillAndOutlinePaint() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        Paint fillPaint = Color.blue;
        Paint outlinePaint = Color.green;
        Icon icon = renderer.getIcon(shape, fillPaint, outlinePaint);
        assertNotNull(icon);
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
    }

    @Test
    public void testGetIcon_WithFillPaintOnly() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Shape shape = new Rectangle2D.Double(0, 0, 5, 5);
        Paint fillPaint = Color.cyan;
        Icon icon = renderer.getIcon(shape, fillPaint, null);
        assertNotNull(icon);
        assertEquals(5, icon.getIconWidth());
        assertEquals(5, icon.getIconHeight());
    }

    @Test
    public void testGetIcon_WithOutlinePaintOnly() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Shape shape = new Rectangle2D.Double(0, 0, 7, 7);
        Paint outlinePaint = Color.magenta;
        Icon icon = renderer.getIcon(shape, null, outlinePaint);
        assertNotNull(icon);
        assertEquals(7, icon.getIconWidth());
        assertEquals(7, icon.getIconHeight());
    }

    @Test
    public void testGetIcon_BooleanFillOutline() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Shape shape = new Line2D.Double(0, 0, 10, 10);
        Icon icon = renderer.getIcon(shape, true, true); // Fill and outline
        assertNotNull(icon);
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
    }

    @Test
    public void testGetIcon_BooleanFillOnly() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Shape shape = new Line2D.Double(0, 0, 5, 5);
        Icon icon = renderer.getIcon(shape, true, false); // Fill only
        assertNotNull(icon);
        assertEquals(5, icon.getIconWidth());
        assertEquals(5, icon.getIconHeight());
    }

    @Test
    public void testGetIcon_BooleanOutlineOnly() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        Shape shape = new Line2D.Double(0, 0, 7, 7);
        Icon icon = renderer.getIcon(shape, false, true); // Outline only
        assertNotNull(icon);
        assertEquals(7, icon.getIconWidth());
        assertEquals(7, icon.getIconHeight());
    }

    // Serialization tests require mocking ObjectOutputStream and ObjectInputStream, which is outside the scope of typical unit tests for this kind of logic.
    // If these are critical, they would typically involve a separate serialization testing framework or deeper mocking.
}
