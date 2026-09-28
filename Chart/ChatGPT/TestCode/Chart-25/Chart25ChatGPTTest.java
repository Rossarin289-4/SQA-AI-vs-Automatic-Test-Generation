package org.jfree.chart.renderer.category.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import junit.framework.TestCase;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;

public class Chart25ChatGPTTest extends TestCase {
    public void testNullMeanDoesNotCrashRendering() {
        DefaultStatisticalCategoryDataset d = new DefaultStatisticalCategoryDataset();
        d.add(null, null, "R", "C");
        CategoryPlot p = new CategoryPlot(d, new CategoryAxis("C"), new NumberAxis("V"), new StatisticalBarRenderer());
        JFreeChart chart = new JFreeChart(p);
        Graphics2D g = new BufferedImage(200,100,BufferedImage.TYPE_INT_ARGB).createGraphics();
        try { chart.draw(g, new Rectangle2D.Double(0,0,200,100)); }
        catch (NullPointerException e) { fail("Null mean/stddev should be ignored"); }
        finally { g.dispose(); }
    }
}
