package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.RenderingSource;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.CategoryItemEntity;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.text.TextUtilities;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.GradientPaintTransformer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.ObjectList;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryDatasetSelectionState;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.SelectableCategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.chart.axis.Axis; // Added import for Axis class

public class AbstractCategoryItemRendererTest {


    private static class DummyCategoryDataset extends DefaultCategoryDataset {
    }


    private static class DummyCategoryItemLabelGenerator implements CategoryItemLabelGenerator {
        @Override
        public String generateRowLabel(CategoryDataset dataset, int row) { return "RowLabel"; }
        @Override
        public String generateColumnLabel(CategoryDataset dataset, int column) { return "ColLabel"; }
        @Override
        public String generateLabel(CategoryDataset dataset, int row, int column) { return "Label"; }
    }
    
    private static class DummyCategoryToolTipGenerator implements CategoryToolTipGenerator {
        @Override
        public String generateToolTip(CategoryDataset dataset, int row, int column) { return "Tooltip"; }
    }

    private static class DummyCategoryURLGenerator implements CategoryURLGenerator {
        @Override
        public String generateURL(CategoryDataset dataset, int series, int category) { return "URL"; }
    }

    @Test
    public void testGetPassCount() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        assertEquals(1, renderer.getPassCount());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testSetPlotWithNull() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        renderer.setPlot(null);
    }

    @Test
    public void testGetSetBaseItemLabelGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryItemLabelGenerator generator = new DummyCategoryItemLabelGenerator();
        renderer.setBaseItemLabelGenerator(generator);
        assertEquals(generator, renderer.getBaseItemLabelGenerator());
    }

    @Test
    public void testGetSetSeriesItemLabelGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryItemLabelGenerator generator = new DummyCategoryItemLabelGenerator();
        renderer.setSeriesItemLabelGenerator(0, generator);
        assertEquals(generator, renderer.getSeriesItemLabelGenerator(0));
    }

    @Test
    public void testGetItemLabelGenerator_SeriesGeneratorExists() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryItemLabelGenerator seriesGenerator = new DummyCategoryItemLabelGenerator();
        renderer.setSeriesItemLabelGenerator(0, seriesGenerator);
        assertEquals(seriesGenerator, renderer.getItemLabelGenerator(0, 0, false));
    }

    @Test
    public void testGetItemLabelGenerator_BaseGeneratorExists() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryItemLabelGenerator baseGenerator = new DummyCategoryItemLabelGenerator();
        renderer.setBaseItemLabelGenerator(baseGenerator);
        assertEquals(baseGenerator, renderer.getItemLabelGenerator(0, 0, false));
    }

    @Test
    public void testGetItemLabelGenerator_NoGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        assertNull(renderer.getItemLabelGenerator(0, 0, false));
    }

    @Test
    public void testGetSetBaseToolTipGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryToolTipGenerator generator = new DummyCategoryToolTipGenerator();
        renderer.setBaseToolTipGenerator(generator);
        assertEquals(generator, renderer.getBaseToolTipGenerator());
    }

    @Test
    public void testGetSetSeriesToolTipGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryToolTipGenerator generator = new DummyCategoryToolTipGenerator();
        renderer.setSeriesToolTipGenerator(0, generator);
        assertEquals(generator, renderer.getSeriesToolTipGenerator(0));
    }

    @Test
    public void testGetToolTipGenerator_SeriesGeneratorExists() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryToolTipGenerator seriesGenerator = new DummyCategoryToolTipGenerator();
        renderer.setSeriesToolTipGenerator(0, seriesGenerator);
        assertEquals(seriesGenerator, renderer.getToolTipGenerator(0, 0, false));
    }
    
    @Test
    public void testGetToolTipGenerator_BaseGeneratorExists() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryToolTipGenerator baseGenerator = new DummyCategoryToolTipGenerator();
        renderer.setBaseToolTipGenerator(baseGenerator);
        assertEquals(baseGenerator, renderer.getToolTipGenerator(0, 0, false));
    }

    @Test
    public void testGetToolTipGenerator_NoGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        assertNull(renderer.getToolTipGenerator(0, 0, false));
    }

    @Test
    public void testGetSetBaseURLGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryURLGenerator generator = new DummyCategoryURLGenerator();
        renderer.setBaseURLGenerator(generator);
        assertEquals(generator, renderer.getBaseURLGenerator());
    }

    @Test
    public void testGetSetSeriesURLGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryURLGenerator generator = new DummyCategoryURLGenerator();
        renderer.setSeriesURLGenerator(0, generator);
        assertEquals(generator, renderer.getSeriesURLGenerator(0));
    }

    @Test
    public void testGetURLGenerator_SeriesGeneratorExists() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryURLGenerator seriesGenerator = new DummyCategoryURLGenerator();
        renderer.setSeriesURLGenerator(0, seriesGenerator);
        assertEquals(seriesGenerator, renderer.getURLGenerator(0, 0, false));
    }

    @Test
    public void testGetURLGenerator_BaseGeneratorExists() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryURLGenerator baseGenerator = new DummyCategoryURLGenerator();
        renderer.setBaseURLGenerator(baseGenerator);
        assertEquals(baseGenerator, renderer.getURLGenerator(0, 0, false));
    }

    @Test
    public void testGetURLGenerator_NoGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        assertNull(renderer.getURLGenerator(0, 0, false));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotationWithNull() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        renderer.addAnnotation(null, Layer.FOREGROUND);
    }

    @Test
    public void testGetSetLegendItemLabelGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategorySeriesLabelGenerator generator = new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemLabelGenerator(generator);
        assertEquals(generator, renderer.getLegendItemLabelGenerator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendItemLabelGeneratorWithNull() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        renderer.setLegendItemLabelGenerator(null);
    }

    @Test
    public void testGetSetLegendItemToolTipGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategorySeriesLabelGenerator generator = new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemToolTipGenerator(generator);
        assertEquals(generator, renderer.getLegendItemToolTipGenerator());
    }

    @Test
    public void testGetSetLegendItemURLGenerator() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategorySeriesLabelGenerator generator = new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemURLGenerator(generator);
        assertEquals(generator, renderer.getLegendItemURLGenerator());
    }



    @Test
    public void testFindRangeBounds_NullDataset() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        assertNull(renderer.findRangeBounds(null));
    }

    @Test
    public void testFindRangeBounds_EmptyDataset() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryDataset dataset = new DummyCategoryDataset();
        assertNull(renderer.findRangeBounds(dataset));
    }
    
    @Test
    public void testFindRangeBounds_DatasetWithData() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        CategoryDataset dataset = new DummyCategoryDataset();
        ((DefaultCategoryDataset) dataset).addValue(10, "S1", "C1");
        ((DefaultCategoryDataset) dataset).addValue(20, "S1", "C2");
        Range range = renderer.findRangeBounds(dataset);
        assertNotNull(range);
        assertEquals(10.0, range.getLowerBound(), 0.00001);
        assertEquals(20.0, range.getUpperBound(), 0.00001);
    }




    


    

    @Test
    public void testGetLegendItem_NullPlot() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        assertNull(renderer.getLegendItem(0, 0));
    }

    @Test
    public void testEquals() {
        AbstractCategoryItemRenderer renderer1 = new LineAndShapeRenderer();
        AbstractCategoryItemRenderer renderer2 = new LineAndShapeRenderer();
        assertTrue(renderer1.equals(renderer2));
        assertTrue(renderer2.equals(renderer1));
        assertTrue(renderer1.equals(renderer1));

        renderer1.setBaseItemLabelGenerator(new DummyCategoryItemLabelGenerator());
        assertFalse(renderer1.equals(renderer2));
        
        renderer2.setBaseItemLabelGenerator(new DummyCategoryItemLabelGenerator());
        assertTrue(renderer1.equals(renderer2));
    }

    @Test
    public void testHashCode() {
        AbstractCategoryItemRenderer renderer1 = new LineAndShapeRenderer();
        AbstractCategoryItemRenderer renderer2 = new LineAndShapeRenderer();
        assertEquals(renderer1.hashCode(), renderer2.hashCode());

        renderer1.setBaseItemLabelGenerator(new DummyCategoryItemLabelGenerator());
        assertNotEquals(renderer1.hashCode(), renderer2.hashCode());
    }


    @Test
    public void testGetDrawingSupplier_NullPlot() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        assertNull(renderer.getDrawingSupplier());
    }




    


    @Test
    public void testClone() throws CloneNotSupportedException {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        renderer.setBaseItemLabelGenerator(new DummyCategoryItemLabelGenerator());
        renderer.setSeriesItemLabelGenerator(0, new DummyCategoryItemLabelGenerator());
        renderer.setBaseToolTipGenerator(new DummyCategoryToolTipGenerator());
        renderer.setSeriesToolTipGenerator(0, new DummyCategoryToolTipGenerator());
        renderer.setBaseURLGenerator(new DummyCategoryURLGenerator());
        renderer.setSeriesURLGenerator(0, new DummyCategoryURLGenerator());
        renderer.setLegendItemLabelGenerator(new StandardCategorySeriesLabelGenerator());

        Object clone = renderer.clone();
        assertTrue(clone instanceof AbstractCategoryItemRenderer);
        assertNotSame(renderer, clone);
    }
    


    @Test
    public void testGetLegendItems_EmptyPlot() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        LegendItemCollection items = renderer.getLegendItems();
        assertNotNull(items);
        assertEquals(0, items.getItemCount());
    }

    
    @Test
    public void testAddEntity_WithHotspot() {
        AbstractCategoryItemRenderer renderer = new LineAndShapeRenderer();
        EntityCollection entities = new org.jfree.chart.entity.StandardEntityCollection();
        Shape hotspot = new Ellipse2D.Double(10, 10, 20, 20);
        CategoryDataset dataset = new DummyCategoryDataset();
        ((DefaultCategoryDataset) dataset).addValue(10, "S1", "C1");
        
        renderer.addEntity(entities, hotspot, dataset, 0, 0, false);
        assertEquals(1, entities.getEntityCount());
        CategoryItemEntity entity = (CategoryItemEntity) entities.getEntity(0);
        assertEquals(dataset, entity.getDataset());
        assertEquals("S1", entity.getRowKey());
        assertEquals("C1", entity.getColumnKey());
    }





}



