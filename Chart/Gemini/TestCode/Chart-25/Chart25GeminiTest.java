package org.jfree.chart.renderer.category.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import junit.framework.TestCase;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;

public class Chart25GeminiTest extends TestCase {

    public Chart25GeminiTest(String name) {
        super(name);
    }

    public void testDrawItemNullMeanOrStdDev() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        // เพิ่มข้อมูลที่มีค่าเป็น null
        dataset.add(null, null, "R1", "C1");

        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis(), new NumberAxis(), renderer);
        CategoryItemRendererState state = renderer.initialise(
            g2, new Rectangle2D.Double(0, 0, 100, 100), plot, dataset, null
        );

        try {
            renderer.drawItem(g2, state, new Rectangle2D.Double(0, 0, 100, 100), plot,
                    new CategoryAxis(), new NumberAxis(), dataset, 0, 0, 0);
        } catch (NullPointerException e) {
            fail("drawItem threw NullPointerException when dataset value is null");
        }
    }
}
