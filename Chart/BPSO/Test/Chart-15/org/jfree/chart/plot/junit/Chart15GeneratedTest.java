package org.jfree.chart.plot.junit;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import junit.framework.TestCase;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
public class Chart15GeneratedTest extends TestCase {
    public void testPieChartWithNullDatasetDrawsWithoutException() {
        JFreeChart chart = ChartFactory.createPieChart3D("Test", null, true, false, false);
        BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        try { chart.draw(graphics, new Rectangle2D.Double(0, 0, 200, 100), null, null); }
        finally { graphics.dispose(); }
    }
}
