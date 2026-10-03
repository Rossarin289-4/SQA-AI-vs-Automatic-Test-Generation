package org.jfree.chart.renderer.category.junit;

import junit.framework.TestCase;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class Chart1GeminiTest extends TestCase {

    public Chart1GeminiTest(String name) {
        super(name);
    }

    public void testGetLegendItemsWithDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series1", "Category1");

        BarRenderer renderer = new BarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Category"), new NumberAxis("Value"), renderer);

        LegendItemCollection items = renderer.getLegendItems();
        assertNotNull(items);
        assertEquals(1, items.getItemCount());
    }
}
