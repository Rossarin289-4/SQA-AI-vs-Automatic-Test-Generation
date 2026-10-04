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
import org.jfree.data.UnknownKeyException;
import org.jfree.chart.axis.NumberAxis; // Import for NumberAxis if needed, or create a more complete ValueAxis mock.


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
        // Use NumberAxis for a concrete implementation, or a more complete mock.
        // For simplicity, using NumberAxis and overriding necessary methods.
        NumberAxis rangeAxis = new NumberAxis("Range");
        rangeAxis.setRange(0.0, 100.0); // Set a default range
        
        // Override valueToJava2D to simulate mapping values to screen coordinates
        rangeAxis.setAxisLineVisible(false); // Avoid drawing axis lines for simplicity
        rangeAxis.setTickMarksVisible(false);
        rangeAxis.setTickLabelsVisible(false);

        return rangeAxis;
    }

    // Mock StatisticalCategoryDataset

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
    public void testWriteReadObject() throws IOException, ClassNotFoundException {
        StatisticalBarRenderer renderer1 = new StatisticalBarRenderer();
        renderer1.setErrorIndicatorPaint(Color.green);
        renderer1.setErrorIndicatorStroke(new BasicStroke(2.0f));

        java.io.ByteArrayOutputStream baOut = new java.io.ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baOut);
        // writeObject is private, need to access it via reflection or make it public if the class allows.
        // Since we cannot modify the class, we will skip testing private methods directly.
        // However, if we assume it's called by serialization, we can test by serializing/deserializing.
        // For this purpose, we will rely on the fact that readObject is called during deserialization.
        // A direct call here would be: renderer1.writeObject(out);
        
        // Mock serialization process
        java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objOut = new java.io.ObjectOutputStream(buffer);
        objOut.writeObject(renderer1);
        objOut.close();

        java.io.ByteArrayInputStream baIn = new java.io.ByteArrayInputStream(buffer.toByteArray());
        ObjectInputStream in = new ObjectInputStream(baIn);
        StatisticalBarRenderer renderer2 = (StatisticalBarRenderer) in.readObject();
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
    
    

}


