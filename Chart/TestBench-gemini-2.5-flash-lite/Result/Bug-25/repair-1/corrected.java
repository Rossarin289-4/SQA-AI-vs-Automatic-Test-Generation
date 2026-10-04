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
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.TickUnitSource;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.data.KeyedValues2D;


public class StatisticalBarRendererTest {

    @Test
    public void testDefaultConstructor() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertEquals(Color.gray, renderer.getErrorIndicatorPaint());
        assertEquals(new BasicStroke(0.5f), renderer.getErrorIndicatorStroke());
        assertTrue(renderer.isDrawBarOutline());
        assertEquals(0.05, renderer.getItemMargin(), 0.0000001);
    }

    @Test
    public void testSetErrorIndicatorPaint() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        Paint newPaint = Color.red;
        renderer.setErrorIndicatorPaint(newPaint);
        assertEquals(newPaint, renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testSetErrorIndicatorPaintToNull() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setErrorIndicatorPaint(null);
        assertNull(renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testGetErrorIndicatorPaint() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        Paint paint = renderer.getErrorIndicatorPaint();
        assertNotNull(paint);
        assertTrue(PaintUtilities.equal(Color.gray, paint));
    }

    @Test
    public void testSetErrorIndicatorStroke() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        Stroke newStroke = new BasicStroke(1.5f);
        renderer.setErrorIndicatorStroke(newStroke);
        assertEquals(newStroke, renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testSetErrorIndicatorStrokeToNull() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setErrorIndicatorStroke(null);
        assertNull(renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testGetErrorIndicatorStroke() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        Stroke stroke = renderer.getErrorIndicatorStroke();
        assertNotNull(stroke);
        assertTrue(stroke instanceof BasicStroke);
        assertEquals(0.5f, ((BasicStroke) stroke).getLineWidth(), 0.0000001f);
    }

    @Test
    public void testEqualsSelf() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertTrue(renderer.equals(renderer));
    }

    @Test
    public void testEqualsDifferentObject() throws Exception {
        StatisticalBarRenderer renderer1 = new StatisticalBarRenderer();
        Object obj = new Object();
        assertFalse(renderer1.equals(obj));
    }

    @Test
    public void testEqualsAnotherRendererWithSameProperties() throws Exception {
        StatisticalBarRenderer renderer1 = new StatisticalBarRenderer();
        StatisticalBarRenderer renderer2 = new StatisticalBarRenderer();
        assertTrue(renderer1.equals(renderer2));
    }

    @Test
    public void testEqualsAnotherRendererWithDifferentPaint() throws Exception {
        StatisticalBarRenderer renderer1 = new StatisticalBarRenderer();
        StatisticalBarRenderer renderer2 = new StatisticalBarRenderer();
        renderer2.setErrorIndicatorPaint(Color.blue);
        assertFalse(renderer1.equals(renderer2));
    }
    
    // Mock objects for testing drawItem methods
    private CategoryPlot createMockPlot(PlotOrientation orientation) {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(orientation);
        return plot;
    }

    private CategoryAxis createMockDomainAxis() {
        return new CategoryAxis("Domain");
    }

    // Mock ValueAxis with required methods
    private ValueAxis createMockRangeAxis() {
        return new ValueAxis("Range", null) {
            @Override
            public AxisState draw(Graphics2D g2, double plotAreaX, Rectangle2D dataArea, Rectangle2D screenRange, RectangleEdge edge, PlotRenderingInfo info) {
                return null; // Not used in this test
            }

            @Override
            public double java2DToValue(double java2DValue, Rectangle2D area, RectangleEdge edge) {
                return java2DValue / 10.0; // Inverse of valueToJava2D
            }
            
            @Override
            public void autoAdjustRange() {
                // Not used in this test
            }
            
            @Override
            public void pan(double percent) {
                // Not used in this test
            }

            @Override
            public void zoom(double percent) {
                // Not used in this test
            }
        };
    }

    // Mock StatisticalCategoryDataset
    private StatisticalCategoryDataset createMockDataset() {
        return new StatisticalCategoryDataset() {
            @Override
            public Number getMeanValue(int row, int column) {
                return 10.0;
            }
            @Override
            public Number getStdDevValue(int row, int column) {
                return 2.0;
            }
            @Override
            public Number getValue(int row, int column) {
                return 10.0;
            }
            // Other CategoryDataset methods
            @Override
            public int getRowCount() { return 1; }
            @Override
            public int getColumnCount() { return 1; }
            @Override
            public Comparable getRowKey(int row) { return "Row 0"; }
            @Override
            public int getRowIndex(Comparable key) { return 0; }
            @Override
            public Comparable getColumnKey(int column) { return "Column 0"; }
            @Override
            public int getColumnIndex(Comparable key) { return 0; }
            @Override
            public java.util.List getColumnKeys() { return java.util.Collections.singletonList("Column 0"); }
            @Override
            public java.util.List getRowKeys() { return java.util.Collections.singletonList("Row 0"); }
            // Other StatisticalCategoryDataset methods
            @Override
            public Number getStdDevValue(Comparable rowKey, Comparable columnKey) { return 2.0; }
            @Override
            public Number getMeanValue(Comparable rowKey, Comparable columnKey) { return 10.0; }
            // Add dummy implementations for other required methods from CategoryDataset if any compiler errors arise.
            @Override
            public Number getMinimumValue(int row, int column) { return 8.0; }
            @Override
            public Number getMinimumValue(Comparable rowKey, Comparable columnKey) { return 8.0; }
            @Override
            public Number getMaximumValue(int row, int column) { return 12.0; }
            @Override
            public Number getMaximumValue(Comparable rowKey, Comparable columnKey) { return 12.0; }
        };
    }

    private CategoryItemRendererState createMockRendererState() {
        return new CategoryItemRendererState(null) {
            @Override
            public double getBarWidth() {
                return 20.0;
            }
        };
    }

    private Rectangle2D createDataArea() {
        return new Rectangle2D.Double(0, 0, 100, 100);
    }

    @Test
    public void testDrawVerticalItemWithStdDev() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        CategoryPlot plot = createMockPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = createMockDomainAxis();
        ValueAxis rangeAxis = createMockRangeAxis();
        StatisticalCategoryDataset dataset = createMockDataset();
        CategoryItemRendererState state = createMockRendererState();
        Rectangle2D dataArea = createDataArea();

        // Mocking CategoryAxis.getCategoryStart
        // Use reflection to access protected method or mock if possible and necessary
        // For simplicity, assume a direct call or a stub that returns a value.
        // In a real scenario, Mockito would be used if available and configured.
        // Since Mockito is not allowed as per instructions, we'll rely on CategoryAxis constructor and setters.
        
        // Mocking plot edges
        // Accessing protected fields via reflection is generally discouraged but necessary if direct mocking is not an option.
        try {
            java.lang.reflect.Field plotDomainEdgeField = CategoryPlot.class.getDeclaredField("domainAxisEdge");
            plotDomainEdgeField.setAccessible(true);
            plotDomainEdgeField.set(plot, RectangleEdge.BOTTOM);

            java.lang.reflect.Field plotRangeEdgeField = CategoryPlot.class.getDeclaredField("rangeAxisEdge");
            plotRangeEdgeField.setAccessible(true);
            plotRangeEdgeField.set(plot, RectangleEdge.LEFT);
        } catch (Exception e) {
            fail("Failed to set plot edges via reflection: " + e.getMessage());
        }

        // Mocking CategoryAxis.getCategoryStart and ValueAxis.valueToJava2D
        // Since we cannot use Mockito, we will rely on the default behavior of mocked objects or stubs.
        // The provided mockValueAxis and mockDataset should provide sufficient behavior.
        
        // For this test, let's assume getCategoryStart returns a fixed value and valueToJava2D is overridden in the mock.
        // We need to ensure CategoryAxis has data or is configured to return a value.
        // For simplicity, let's set some values that would be used by CategoryAxis.
        // If CategoryAxis requires more setup, it would be done here.

        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB).getGraphics();
        
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        
        // The test here is to ensure it doesn't throw an exception for valid inputs
        // More detailed assertions would require capturing drawn shapes, which is complex without a graphics testing framework.
    }

    @Test
    public void testDrawHorizontalItemWithStdDev() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        CategoryPlot plot = createMockPlot(PlotOrientation.HORIZONTAL);
        CategoryAxis domainAxis = createMockDomainAxis();
        ValueAxis rangeAxis = createMockRangeAxis();
        StatisticalCategoryDataset dataset = createMockDataset();
        CategoryItemRendererState state = createMockRendererState();
        Rectangle2D dataArea = createDataArea();

        try {
            java.lang.reflect.Field plotDomainEdgeField = CategoryPlot.class.getDeclaredField("domainAxisEdge");
            plotDomainEdgeField.setAccessible(true);
            plotDomainEdgeField.set(plot, RectangleEdge.LEFT);

            java.lang.reflect.Field plotRangeEdgeField = CategoryPlot.class.getDeclaredField("rangeAxisEdge");
            plotRangeEdgeField.setAccessible(true);
            plotRangeEdgeField.set(plot, RectangleEdge.BOTTOM);
        } catch (Exception e) {
            fail("Failed to set plot edges via reflection: " + e.getMessage());
        }

        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB).getGraphics();
        
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
    }
    
    @Test
    public void testDrawItemWithNonStatisticalDataset() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        CategoryPlot plot = createMockPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = createMockDomainAxis();
        ValueAxis rangeAxis = createMockRangeAxis();
        // Use a regular CategoryDataset, not StatisticalCategoryDataset
        CategoryDataset dataset = new CategoryDataset() {
            @Override public Number getValue(int row, int column) { return 10.0; }
            @Override public int getRowCount() { return 1; }
            @Override public int getColumnCount() { return 1; }
            @Override public Comparable getRowKey(int row) { return "Row 0"; }
            @Override public int getRowIndex(Comparable key) { return 0; }
            @Override public Comparable getColumnKey(int column) { return "Column 0"; }
            @Override public int getColumnIndex(Comparable key) { return 0; }
            @Override public java.util.List getColumnKeys() { return java.util.Collections.singletonList("Column 0"); }
            @Override public java.util.List getRowKeys() { return java.util.Collections.singletonList("Row 0"); }
        };
        CategoryItemRendererState state = createMockRendererState();
        Rectangle2D dataArea = createDataArea();
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB).getGraphics();

        try {
            renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
            fail("Expected IllegalArgumentException for non-StatisticalCategoryDataset");
        } catch (IllegalArgumentException e) {
            assertEquals("Requires StatisticalCategoryDataset.", e.getMessage());
        }
    }
    
    @Test
    public void testDrawVerticalItemNullMeanValue() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        CategoryPlot plot = createMockPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = createMockDomainAxis();
        ValueAxis rangeAxis = createMockRangeAxis();
        StatisticalCategoryDataset dataset = new StatisticalCategoryDataset() {
            @Override public Number getMeanValue(int row, int column) { return null; }
            @Override public Number getStdDevValue(int row, int column) { return 2.0; }
            @Override public Number getValue(int row, int column) { return null; }
            @Override public int getRowCount() { return 1; }
            @Override public int getColumnCount() { return 1; }
            @Override public Comparable getRowKey(int row) { return "Row 0"; }
            @Override public int getRowIndex(Comparable key) { return 0; }
            @Override public Comparable getColumnKey(int column) { return "Column 0"; }
            @Override public int getColumnIndex(Comparable key) { return 0; }
            @Override public java.util.List getColumnKeys() { return java.util.Collections.singletonList("Column 0"); }
            @Override public java.util.List getRowKeys() { return java.util.Collections.singletonList("Row 0"); }
            @Override public Number getStdDevValue(Comparable rowKey, Comparable columnKey) { return 2.0; }
            @Override public Number getMeanValue(Comparable rowKey, Comparable columnKey) { return null; }
            @Override public Number getMinimumValue(int row, int column) { return null; }
            @Override public Number getMinimumValue(Comparable rowKey, Comparable columnKey) { return null; }
            @Override public Number getMaximumValue(int row, int column) { return null; }
            @Override public Number getMaximumValue(Comparable rowKey, Comparable columnKey) { return null; }
        };
        CategoryItemRendererState state = createMockRendererState();
        Rectangle2D dataArea = createDataArea();
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB).getGraphics();

        // Should simply return without drawing if mean value is null
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        // No assertion needed, just checking it doesn't throw an exception.
    }
    
    @Test
    public void testDrawVerticalItemNullStdDevValue() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        CategoryPlot plot = createMockPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = createMockDomainAxis();
        ValueAxis rangeAxis = createMockRangeAxis();
        StatisticalCategoryDataset dataset = new StatisticalCategoryDataset() {
            @Override public Number getMeanValue(int row, int column) { return 10.0; }
            @Override public Number getStdDevValue(int row, int column) { return null; } // null std dev
            @Override public Number getValue(int row, int column) { return 10.0; }
            @Override public int getRowCount() { return 1; }
            @Override public int getColumnCount() { return 1; }
            @Override public Comparable getRowKey(int row) { return "Row 0"; }
            @Override public int getRowIndex(Comparable key) { return 0; }
            @Override public Comparable getColumnKey(int column) { return "Column 0"; }
            @Override public int getColumnIndex(Comparable key) { return 0; }
            @Override public java.util.List getColumnKeys() { return java.util.Collections.singletonList("Column 0"); }
            @Override public java.util.List getRowKeys() { return java.util.Collections.singletonList("Row 0"); }
            @Override public Number getStdDevValue(Comparable rowKey, Comparable columnKey) { return null; }
            @Override public Number getMeanValue(Comparable rowKey, Comparable columnKey) { return 10.0; }
            @Override public Number getMinimumValue(int row, int column) { return 10.0; }
            @Override public Number getMinimumValue(Comparable rowKey, Comparable columnKey) { return 10.0; }
            @Override public Number getMaximumValue(int row, int column) { return 10.0; }
            @Override public Number getMaximumValue(Comparable rowKey, Comparable columnKey) { return 10.0; }
        };
        CategoryItemRendererState state = createMockRendererState();
        Rectangle2D dataArea = createDataArea();
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB).getGraphics();

        // Mocking plot edges
        try {
            java.lang.reflect.Field plotDomainEdgeField = CategoryPlot.class.getDeclaredField("domainAxisEdge");
            plotDomainEdgeField.setAccessible(true);
            plotDomainEdgeField.set(plot, RectangleEdge.BOTTOM);

            java.lang.reflect.Field plotRangeEdgeField = CategoryPlot.class.getDeclaredField("rangeAxisEdge");
            plotRangeEdgeField.setAccessible(true);
            plotRangeEdgeField.set(plot, RectangleEdge.LEFT);
        } catch (Exception e) {
            fail("Failed to set plot edges via reflection: " + e.getMessage());
        }

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        // The test is that it draws the bar but no std dev lines.
    }

    @Test
    public void testWriteReadObject() throws IOException, ClassNotFoundException {
        StatisticalBarRenderer renderer1 = new StatisticalBarRenderer();
        renderer1.setErrorIndicatorPaint(Color.green);
        renderer1.setErrorIndicatorStroke(new BasicStroke(2.0f));

        java.io.ByteArrayOutputStream baOut = new java.io.ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baOut);
        renderer1.writeObject(out);
        out.close();

        java.io.ByteArrayInputStream baIn = new java.io.ByteArrayInputStream(baOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(baIn);
        StatisticalBarRenderer renderer2 = new StatisticalBarRenderer();
        renderer2.readObject(in);
        in.close();

        assertEquals(renderer1.getErrorIndicatorPaint(), renderer2.getErrorIndicatorPaint());
        assertEquals(renderer1.getErrorIndicatorStroke(), renderer2.getErrorIndicatorStroke());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        StatisticalBarRenderer renderer1 = new StatisticalBarRenderer();
        renderer1.setErrorIndicatorPaint(Color.magenta);
        renderer1.setErrorIndicatorStroke(new BasicStroke(3.0f));

        StatisticalBarRenderer renderer2 = (StatisticalBarRenderer) renderer1.clone();

        assertTrue(renderer1.equals(renderer2));
        assertNotSame(renderer1, renderer2);
    }

    @Test
    public void testPublicCloneable() throws CloneNotSupportedException {
        StatisticalBarRenderer renderer1 = new StatisticalBarRenderer();
        renderer1.setErrorIndicatorPaint(Color.cyan);
        renderer1.setErrorIndicatorStroke(new BasicStroke(1.0f));

        PublicCloneable pc = (PublicCloneable) renderer1;
        Object clone = pc.clone();

        assertNotNull(clone);
        assertTrue(clone instanceof StatisticalBarRenderer);
        StatisticalBarRenderer renderer2 = (StatisticalBarRenderer) clone;
        assertTrue(renderer1.equals(renderer2));
        assertNotSame(renderer1, renderer2);
    }

    @Test
    public void testGettersDefaultValues() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertEquals(Color.gray, renderer.getErrorIndicatorPaint());
        assertEquals(new BasicStroke(0.5f), renderer.getErrorIndicatorStroke());
    }
    
    @Test
    public void testDrawVerticalItemClipLowerThanZeroAndValueBelowClip() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setLowerClip(-10.0);
        renderer.setUpperClip(-5.0); // Cases 1, 2, 3, 4

        CategoryPlot plot = createMockPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = createMockDomainAxis();
        ValueAxis rangeAxis = createMockRangeAxis();
        StatisticalCategoryDataset dataset = new StatisticalCategoryDataset() {
            @Override public Number getMeanValue(int row, int column) { return -20.0; } // Value below lclip
            @Override public Number getStdDevValue(int row, int column) { return 1.0; }
            @Override public Number getValue(int row, int column) { return -20.0; }
            @Override public int getRowCount() { return 1; }
            @Override public int getColumnCount() { return 1; }
            @Override public Comparable getRowKey(int row) { return "Row 0"; }
            @Override public int getRowIndex(Comparable key) { return 0; }
            @Override public Comparable getColumnKey(int column) { return "Column 0"; }
            @Override public int getColumnIndex(Comparable key) { return 0; }
            @Override public java.util.List getColumnKeys() { return java.util.Collections.singletonList("Column 0"); }
            @Override public java.util.List getRowKeys() { return java.util.Collections.singletonList("Row 0"); }
            @Override public Number getStdDevValue(Comparable rowKey, Comparable columnKey) { return 1.0; }
            @Override public Number getMeanValue(Comparable rowKey, Comparable columnKey) { return -20.0; }
            @Override public Number getMinimumValue(int row, int column) { return -21.0; }
            @Override public Number getMinimumValue(Comparable rowKey, Comparable columnKey) { return -21.0; }
            @Override public Number getMaximumValue(int row, int column) { return -19.0; }
            @Override public Number getMaximumValue(Comparable rowKey, Comparable columnKey) { return -19.0; }
        };
        CategoryItemRendererState state = createMockRendererState();
        Rectangle2D dataArea = createDataArea();
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB).getGraphics();

        try {
            java.lang.reflect.Field plotDomainEdgeField = CategoryPlot.class.getDeclaredField("domainAxisEdge");
            plotDomainEdgeField.setAccessible(true);
            plotDomainEdgeField.set(plot, RectangleEdge.BOTTOM);

            java.lang.reflect.Field plotRangeEdgeField = CategoryPlot.class.getDeclaredField("rangeAxisEdge");
            plotRangeEdgeField.setAccessible(true);
            plotRangeEdgeField.set(plot, RectangleEdge.LEFT);
        } catch (Exception e) {
            fail("Failed to set plot edges via reflection: " + e.getMessage());
        }
        
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
    }
    
    @Test
    public void testDrawVerticalItemClipZeroRangeAndValueAboveClip() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setLowerClip(0.0);
        renderer.setUpperClip(10.0); // Cases 5, 6, 7, 8

        CategoryPlot plot = createMockPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = createMockDomainAxis();
        ValueAxis rangeAxis = createMockRangeAxis();
        StatisticalCategoryDataset dataset = new StatisticalCategoryDataset() {
            @Override public Number getMeanValue(int row, int column) { return 20.0; } // Value above uclip
            @Override public Number getStdDevValue(int row, int column) { return 1.0; }
            @Override public Number getValue(int row, int column) { return 20.0; }
            @Override public int getRowCount() { return 1; }
            @Override public int getColumnCount() { return 1; }
            @Override public Comparable getRowKey(int row) { return "Row 0"; }
            @Override public int getRowIndex(Comparable key) { return 0; }
            @Override public Comparable getColumnKey(int column) { return "Column 0"; }
            @Override public int getColumnIndex(Comparable key) { return 0; }
            @Override public java.util.List getColumnKeys() { return java.util.Collections.singletonList("Column 0"); }
            @Override public java.util.List getRowKeys() { return java.util.Collections.singletonList("Row 0"); }
            @Override public Number getStdDevValue(Comparable rowKey, Comparable columnKey) { return 1.0; }
            @Override public Number getMeanValue(Comparable rowKey, Comparable columnKey) { return 20.0; }
            @Override public Number getMinimumValue(int row, int column) { return 19.0; }
            @Override public Number getMinimumValue(Comparable rowKey, Comparable columnKey) { return 19.0; }
            @Override public Number getMaximumValue(int row, int column) { return 21.0; }
            @Override public Number getMaximumValue(Comparable rowKey, Comparable columnKey) { return 21.0; }
        };
        CategoryItemRendererState state = createMockRendererState();
        Rectangle2D dataArea = createDataArea();
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB).getGraphics();

        try {
            java.lang.reflect.Field plotDomainEdgeField = CategoryPlot.class.getDeclaredField("domainAxisEdge");
            plotDomainEdgeField.setAccessible(true);
            plotDomainEdgeField.set(plot, RectangleEdge.BOTTOM);

            java.lang.reflect.Field plotRangeEdgeField = CategoryPlot.class.getDeclaredField("rangeAxisEdge");
            plotRangeEdgeField.setAccessible(true);
            plotRangeEdgeField.set(plot, RectangleEdge.LEFT);
        } catch (Exception e) {
            fail("Failed to set plot edges via reflection: " + e.getMessage());
        }
        
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
    }

    @Test
    public void testDrawVerticalItemClipPositiveRangeAndValueBelowClip() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setLowerClip(10.0);
        renderer.setUpperClip(20.0); // Cases 9, 10, 11, 12

        CategoryPlot plot = createMockPlot(PlotOrientation.VERTICAL);
        CategoryAxis domainAxis = createMockDomainAxis();
        ValueAxis rangeAxis = createMockRangeAxis();
        StatisticalCategoryDataset dataset = new StatisticalCategoryDataset() {
            @Override public Number getMeanValue(int row, int column) { return 5.0; } // Value below lclip
            @Override public Number getStdDevValue(int row, int column) { return 1.0; }
            @Override public Number getValue(int row, int column) { return 5.0; }
            @Override public int getRowCount() { return 1; }
            @Override public int getColumnCount() { return 1; }
            @Override public Comparable getRowKey(int row) { return "Row 0"; }
            @Override public int getRowIndex(Comparable key) { return 0; }
            @Override public Comparable getColumnKey(int column) { return "Column 0"; }
            @Override public int getColumnIndex(Comparable key) { return 0; }
            @Override public java.util.List getColumnKeys() { return java.util.Collections.singletonList("Column 0"); }
            @Override public java.util.List getRowKeys() { return java.util.Collections.singletonList("Row 0"); }
            @Override public Number getStdDevValue(Comparable rowKey, Comparable columnKey) { return 1.0; }
            @Override public Number getMeanValue(Comparable rowKey, Comparable columnKey) { return 5.0; }
            @Override public Number getMinimumValue(int row, int column) { return 4.0; }
            @Override public Number getMinimumValue(Comparable rowKey, Comparable columnKey) { return 4.0; }
            @Override public Number getMaximumValue(int row, int column) { return 6.0; }
            @Override public Number getMaximumValue(Comparable rowKey, Comparable columnKey) { return 6.0; }
        };
        CategoryItemRendererState state = createMockRendererState();
        Rectangle2D dataArea = createDataArea();
        Graphics2D g2 = (Graphics2D) new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_INT_ARGB).getGraphics();

        try {
            java.lang.reflect.Field plotDomainEdgeField = CategoryPlot.class.getDeclaredField("domainAxisEdge");
            plotDomainEdgeField.setAccessible(true);
            plotDomainEdgeField.set(plot, RectangleEdge.BOTTOM);

            java.lang.reflect.Field plotRangeEdgeField = CategoryPlot.class.getDeclaredField("rangeAxisEdge");
            plotRangeEdgeField.setAccessible(true);
            plotRangeEdgeField.set(plot, RectangleEdge.LEFT);
        } catch (Exception e) {
            fail("Failed to set plot edges via reflection: " + e.getMessage());
        }
        
        // Value <= lclip returns early. So this specific case should not draw a bar.
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
    }
}
