package org.jfree.chart.renderer.category.junit;

import junit.framework.TestCase;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/** Candidate scenarios for BPSO selection on Defects4J Chart-1. */
public class Chart1BPSOCandidateTest extends TestCase {

    public Chart1BPSOCandidateTest(String name) {
        super(name);
    }

    public void testEmptyDatasetHasNoLegend() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        CategoryPlot plot = new CategoryPlot();
        plot.setDataset(data);
        BarRenderer renderer = new BarRenderer();
        plot.setRenderer(renderer);
        assertEquals(0, renderer.getLegendItems().getItemCount());
    }

    public void testOneSeriesWithBarRenderer() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.addValue(7.0, "Revenue", "January");
        CategoryPlot plot = new CategoryPlot();
        plot.setDataset(data);
        BarRenderer renderer = new BarRenderer();
        plot.setRenderer(renderer);
        LegendItemCollection legend = renderer.getLegendItems();
        assertEquals(1, legend.getItemCount());
        assertEquals("Revenue", legend.get(0).getLabel());
    }

    public void testTwoSeriesWithLineRenderer() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.addValue(1.0, "North", "Q1");
        data.addValue(2.0, "South", "Q1");
        CategoryPlot plot = new CategoryPlot();
        plot.setDataset(data);
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setRenderer(renderer);
        LegendItemCollection legend = renderer.getLegendItems();
        assertEquals(2, legend.getItemCount());
        assertEquals("North", legend.get(0).getLabel());
        assertEquals("South", legend.get(1).getLabel());
    }

    public void testOneSeriesAcrossTwoCategories() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.addValue(3.0, "Visits", "Monday");
        data.addValue(4.0, "Visits", "Tuesday");
        CategoryPlot plot = new CategoryPlot();
        plot.setDataset(data);
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setRenderer(renderer);
        LegendItemCollection legend = renderer.getLegendItems();
        assertEquals(1, legend.getItemCount());
        assertEquals("Visits", legend.get(0).getLabel());
    }
}
