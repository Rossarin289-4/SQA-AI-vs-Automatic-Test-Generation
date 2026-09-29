package org.jfree.chart.renderer.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Before;
import org.junit.Test;

/**
 * Targeted tests for Chart-1 bug in AbstractCategoryItemRenderer.getLegendItems().
 */
public class Chart1GeminiLegendItemsTest {

    private BarRenderer renderer;
    private CategoryPlot plot;
    private DefaultCategoryDataset dataset;

    @Before
    public void setUp() {
        renderer = new BarRenderer();
        plot = new CategoryPlot();
        dataset = new DefaultCategoryDataset();
    }

    @Test
    public void testGetLegendItemsWithNullPlot() {
        // Renderer created without plot attached
        BarRenderer unattachedRenderer = new BarRenderer();
        LegendItemCollection legendItems = unattachedRenderer.getLegendItems();

        assertNotNull("LegendItemCollection should not be null", legendItems);
        assertEquals("Collection should be empty when plot is null", 0, legendItems.getItemCount());
    }

    @Test
    public void testGetLegendItemsWithSingleSeriesDataset() {
        dataset.addValue(10.0, "Series 1", "Category 1");
        plot.setDataset(dataset);
        plot.setRenderer(renderer);

        LegendItemCollection legendItems = renderer.getLegendItems();

        assertNotNull("LegendItemCollection should not be null", legendItems);
        assertEquals("Should return 1 legend item for a 1-series dataset", 1, legendItems.getItemCount());

        LegendItem item = legendItems.get(0);
        assertNotNull("Legend item should not be null", item);
        assertEquals("Series 1", item.getLabel());
        assertEquals(0, item.getSeriesIndex());
    }

    @Test
    public void testGetLegendItemsWithMultipleSeriesDataset() {
        dataset.addValue(10.0, "Series 1", "Category 1");
        dataset.addValue(20.0, "Series 2", "Category 1");
        dataset.addValue(30.0, "Series 3", "Category 1");
        plot.setDataset(dataset);
        plot.setRenderer(renderer);

        LegendItemCollection legendItems = renderer.getLegendItems();

        assertNotNull("LegendItemCollection should not be null", legendItems);
        assertEquals("Should return 3 legend items for a 3-series dataset", 3, legendItems.getItemCount());

        assertEquals("Series 1", legendItems.get(0).getLabel());
        assertEquals("Series 2", legendItems.get(1).getLabel());
        assertEquals("Series 3", legendItems.get(2).getLabel());
    }

    @Test
    public void testGetLegendItemDirectCall() {
        dataset.addValue(15.0, "Series 1", "Category 1");
        plot.setDataset(dataset);
        plot.setRenderer(renderer);

        LegendItem item = renderer.getLegendItem(0, 0);

        assertNotNull("Direct getLegendItem call should return non-null LegendItem", item);
        assertEquals("Series 1", item.getLabel());
        assertEquals(0, item.getSeriesIndex());
        assertEquals(0, item.getDatasetIndex());
    }

    @Test
    public void testGetLegendItemsWithSeriesHiddenInLegend() {
        dataset.addValue(10.0, "Series 1", "Category 1");
        dataset.addValue(20.0, "Series 2", "Category 1");
        dataset.addValue(30.0, "Series 3", "Category 1");
        plot.setDataset(dataset);
        plot.setRenderer(renderer);

        // Hide series index 1 from legend
        renderer.setSeriesVisibleInLegend(1, Boolean.FALSE);

        LegendItemCollection legendItems = renderer.getLegendItems();

        assertNotNull("LegendItemCollection should not be null", legendItems);
        assertEquals("Should return 2 legend items when 1 series is hidden in legend", 2, legendItems.getItemCount());

        assertEquals("Series 1", legendItems.get(0).getLabel());
        assertEquals("Series 3", legendItems.get(1).getLabel());
    }

    @Test
    public void testGetLegendItemsDescendingOrder() {
        dataset.addValue(10.0, "Series 1", "Category 1");
        dataset.addValue(20.0, "Series 2", "Category 1");
        plot.setDataset(dataset);
        plot.setRenderer(renderer);
        plot.setRowRenderingOrder(SortOrder.DESCENDING);

        LegendItemCollection legendItems = renderer.getLegendItems();

        assertNotNull("LegendItemCollection should not be null", legendItems);
        assertEquals("Should return 2 legend items", 2, legendItems.getItemCount());

        assertEquals("Series 2", legendItems.get(0).getLabel());
        assertEquals("Series 1", legendItems.get(1).getLabel());
    }
}