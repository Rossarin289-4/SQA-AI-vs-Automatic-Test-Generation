package org.jfree.chart.axis.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import junit.framework.TestCase;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.ui.RectangleEdge;

public class Chart26ChatGPTTest extends TestCase {
    public void testAxisLabelDrawingAllowsRenderingInfoWithoutOwner() {
        NumberAxis a = new NumberAxis("Axis");
        Graphics2D g = new BufferedImage(200,100,BufferedImage.TYPE_INT_ARGB).createGraphics();
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        try {
            AxisState state = new AxisState(50.0);
            a.drawLabel("Axis", g, new Rectangle2D.Double(0,0,200,100), new Rectangle2D.Double(0,0,200,100), RectangleEdge.BOTTOM, state, info);
        } catch (NullPointerException e) { fail("Null ChartRenderingInfo owner should be allowed"); }
        finally { g.dispose(); }
    }
}
