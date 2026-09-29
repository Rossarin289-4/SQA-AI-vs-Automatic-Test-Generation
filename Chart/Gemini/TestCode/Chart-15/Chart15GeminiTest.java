package org.jfree.chart.plot.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import junit.framework.TestCase;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;

public class Chart15GeminiTest extends TestCase {

    public Chart15GeminiTest(String name) {
        super(name);
    }

    public void testGetMaximumExplodePercentNullDataset() {
        PiePlot plot = new PiePlot(null);
        try {
            double max = plot.getMaximumExplodePercent();
            assertEquals(0.0, max, 0.000001);
        } catch (NullPointerException e) {
            fail("getMaximumExplodePercent threw NullPointerException when dataset is null");
        }
    }

    public void testInitialiseNullDataset() {
        PiePlot plot = new PiePlot(null);
        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        PlotRenderingInfo info = new PlotRenderingInfo(null);

        try {
            plot.initialise(g2, new Rectangle2D.Double(0, 0, 100, 100), plot, null, info);
        } catch (NullPointerException e) {
            fail("initialise threw NullPointerException when dataset is null");
        }
    }
}
