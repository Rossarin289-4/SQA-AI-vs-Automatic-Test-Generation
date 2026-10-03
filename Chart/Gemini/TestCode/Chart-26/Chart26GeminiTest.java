package org.jfree.chart.axis.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import junit.framework.TestCase;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.PlotRenderingInfo;

public class Chart26GeminiTest extends TestCase {

    public Chart26GeminiTest(String name) {
        super(name);
    }

    public void testDrawNullOwnerInPlotState() {
        CategoryAxis axis = new CategoryAxis("Test Axis");
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        
        // PlotRenderingInfo ที่มี owner เป็น null
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        
        try {
            axis.draw(g2, 50.0, new Rectangle2D.Double(0, 0, 100, 100), new Rectangle2D.Double(0, 0, 100, 100),
                    org.jfree.chart.util.RectangleEdge.BOTTOM, plotRenderingInfo);
        } catch (NullPointerException e) {
            fail("axis.draw threw NullPointerException when PlotRenderingInfo owner is null");
        }
    }
}
