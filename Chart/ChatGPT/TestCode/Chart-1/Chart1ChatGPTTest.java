package org.jfree.chart.renderer.category.junit;

import junit.framework.TestCase;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Chart1ChatGPTTest extends TestCase {
    public void testLegendItemsAreCreatedForNonNullDataset() {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(1.0, "S1", "C1");
        JFreeChart chart = ChartFactory.createBarChart("T", "C", "V", d, PlotOrientation.VERTICAL, true, false, false);
        assertEquals(1, chart.getCategoryPlot().getRenderer().getLegendItems().getItemCount());
    }
}
