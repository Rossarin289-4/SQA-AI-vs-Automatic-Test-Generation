package org.jfree.chart.renderer.category;

import java.awt.geom.Rectangle2D;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Assert;
import org.junit.Test;

public class AbstractCategoryItemRendererAI1Test {

    @Test
    public void testSetAndGetPlot() {
        BarRenderer renderer = new BarRenderer();
        Assert.assertNull(renderer.getPlot());

        CategoryPlot plot = new CategoryPlot();
        renderer.setPlot(plot);
        Assert.assertSame(plot, renderer.getPlot());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPlotNullThrowsException() {
        BarRenderer renderer = new BarRenderer();
        renderer.setPlot(null);
    }

    @Test
    public void testItemLabelGeneratorHierarchy() {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        Assert.assertNull(renderer.getItemLabelGenerator(0, 0, false));

        StandardCategoryItemLabelGenerator baseGen = new StandardCategoryItemLabelGenerator();
        renderer.setBaseItemLabelGenerator(baseGen);
        Assert.assertSame(baseGen, renderer.getItemLabelGenerator(0, 0, false));
        Assert.assertSame(baseGen, renderer.getItemLabelGenerator(1, 0, false));

        StandardCategoryItemLabelGenerator series0Gen = new StandardCategoryItemLabelGenerator();
        renderer.setSeriesItemLabelGenerator(0, series0Gen);
        Assert.assertSame(series0Gen, renderer.getItemLabelGenerator(0, 0, false));
        Assert.assertSame(baseGen, renderer.getItemLabelGenerator(1, 0, false));
    }

    @Test
    public void testToolTipAndURLGenerators() {
        BarRenderer renderer = new BarRenderer();
        Assert.assertNull(renderer.getToolTipGenerator(0, 0, false));
        Assert.assertNull(renderer.getURLGenerator(0, 0, false));

        StandardCategoryToolTipGenerator baseTip = new StandardCategoryToolTipGenerator();
        renderer.setBaseToolTipGenerator(baseTip);
        Assert.assertSame(baseTip, renderer.getToolTipGenerator(0, 0, false));

        StandardCategoryToolTipGenerator seriesTip = new StandardCategoryToolTipGenerator();
        renderer.setSeriesToolTipGenerator(0, seriesTip);
        Assert.assertSame(seriesTip, renderer.getToolTipGenerator(0, 0, false));
        Assert.assertSame(baseTip, renderer.getToolTipGenerator(1, 0, false));

        StandardCategoryURLGenerator baseURL = new StandardCategoryURLGenerator();
        renderer.setBaseURLGenerator(baseURL);
        Assert.assertSame(baseURL, renderer.getURLGenerator(0, 0, false));

        StandardCategoryURLGenerator seriesURL = new StandardCategoryURLGenerator("test.html");
        renderer.setSeriesURLGenerator(0, seriesURL);
        Assert.assertSame(seriesURL, renderer.getURLGenerator(0, 0, false));
        Assert.assertSame(baseURL, renderer.getURLGenerator(1, 0, false));
    }

    @Test
    public void testAnnotationsManagement() {
        BarRenderer r1 = new BarRenderer();
        BarRenderer r2 = new BarRenderer();
        Assert.assertEquals(r1, r2);

        CategoryTextAnnotation a1 = new CategoryTextAnnotation("Annotation 1", "Cat1", 10.0);
        r1.addAnnotation(a1);
        Assert.assertFalse(r1.equals(r2));

        CategoryTextAnnotation a2 = new CategoryTextAnnotation("Annotation 2", "Cat2", 20.0);
        r1.addAnnotation(a2, Layer.BACKGROUND);

        r1.removeAnnotations();
        Assert.assertEquals(r1, r2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullAnnotationThrowsException() {
        BarRenderer renderer = new BarRenderer();
        renderer.addAnnotation(null);
    }

    @Test
    public void testInitialiseAndStateCounts() {
        BarRenderer renderer = new BarRenderer();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "S1", "C1");
        dataset.addValue(2.0, "S1", "C2");
        dataset.addValue(3.0, "S2", "C1");
        dataset.addValue(4.0, "S2", "C2");

        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Category"), new NumberAxis("Value"), renderer);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        CategoryItemRendererState state = renderer.initialise(null, new Rectangle2D.Double(0, 0, 100, 100), plot, dataset, info);

        Assert.assertNotNull(state);
        Assert.assertEquals(2, renderer.getRowCount());
        Assert.assertEquals(2, renderer.getColumnCount());
        Assert.assertEquals(2, state.getVisibleSeriesCount());
        Assert.assertEquals(0, state.getVisibleSeriesIndex(0));
        Assert.assertEquals(1, state.getVisibleSeriesIndex(1));
    }

    @Test
    public void testGetLegendItemAndLegendItems() {
        BarRenderer renderer = new BarRenderer();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series1", "Category1");
        dataset.addValue(2.0, "Series2", "Category1");

        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Category"), new NumberAxis("Value"), renderer);

        LegendItem item0 = renderer.getLegendItem(0, 0);
        Assert.assertNotNull(item0);
        Assert.assertEquals("Series1", item0.getLabel());

        LegendItemCollection collection = renderer.getLegendItems();
        Assert.assertEquals(2, collection.getItemCount());

        renderer.setSeriesVisibleInLegend(0, Boolean.FALSE);
        Assert.assertNull(renderer.getLegendItem(0, 0));
        LegendItemCollection collectionAfterHidden = renderer.getLegendItems();
        Assert.assertEquals(1, collectionAfterHidden.getItemCount());
    }

    @Test
    public void testEqualsAndCloning() throws Exception {
        BarRenderer r1 = new BarRenderer();
        BarRenderer r2 = new BarRenderer();
        Assert.assertEquals(r1, r2);

        r1.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        Assert.assertFalse(r1.equals(r2));
        r2.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        Assert.assertEquals(r1, r2);

        r1.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        Assert.assertFalse(r1.equals(r2));
        r2.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        Assert.assertEquals(r1, r2);

        BarRenderer cloned = (BarRenderer) r1.clone();
        Assert.assertEquals(r1, cloned);
        Assert.assertNotSame(r1, cloned);
    }

    @Test
    public void testGetPassCount() {
        BarRenderer renderer = new BarRenderer();
        Assert.assertEquals(1, renderer.getPassCount());
    }
}
