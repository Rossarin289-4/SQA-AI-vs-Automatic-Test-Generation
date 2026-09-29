package org.jfree.chart.renderer.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Test;

public class Chart1ChatGPTLegendItemsTest {

    /**
     * A renderer with a non-null dataset should generate legend items
     * for the dataset's visible series.
     */
    @Test
    public void testGetLegendItemsWithDataset() {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();

        DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        dataset.addValue(1.0, "Series1", "Category1");

        CategoryPlot plot = new CategoryPlot();
        plot.setDataset(dataset);
        plot.setRenderer(renderer);

        LegendItemCollection items = renderer.getLegendItems();

        assertNotNull(items);
        assertEquals(1, items.getItemCount());

        LegendItem item = items.get(0);

        assertNotNull(item);
        assertEquals("Series1", item.getSeriesKey());
    }

    /**
     * A renderer with no dataset should return an empty legend collection
     * rather than attempting to access the null dataset.
     */
    @Test
    public void testGetLegendItemsWithNullDataset() {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();

        CategoryPlot plot = new CategoryPlot();
        plot.setRenderer(renderer);

        LegendItemCollection items = renderer.getLegendItems();

        assertNotNull(items);
        assertTrue(items.getItemCount() == 0);
    }
}