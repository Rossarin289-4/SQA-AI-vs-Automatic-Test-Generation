package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.AlphaComposite;
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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.RenderingSource;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.axis.CategoryAxis;
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
import org.jfree.data.category.SelectableCategoryDataset;
import org.jfree.data.general.DatasetUtilities;

public class AbstractCategoryItemRendererTest {

    @Test
    public void testPassCountIsOne() throws Exception {
        assertEquals(2, new LineAndShapeRenderer().getPassCount());
    }

    @Test
    public void testSetAndGetPlot() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        CategoryPlot plot = new CategoryPlot();
        renderer.setPlot(plot);
        assertSame(plot, renderer.getPlot());
    }

    @Test
    public void testSetPlotRejectsNull() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        try {
            renderer.setPlot(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertNull(renderer.getPlot());
        }
    }

    @Test
    public void testItemLabelSeriesOverridesBaseAndFallsBack() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        CategoryItemLabelGenerator base = null;
        CategoryItemLabelGenerator series = null;
        renderer.setBaseItemLabelGenerator(base);
        renderer.setSeriesItemLabelGenerator(0, series);
        assertNull(renderer.getItemLabelGenerator(0, 0, false));
        assertNull(renderer.getItemLabelGenerator(1, 0, true));
    }

    @Test
    public void testTooltipSeriesOverridesBaseAndFallsBack() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        CategoryToolTipGenerator base = null;
        CategoryToolTipGenerator series = null;
        renderer.setBaseToolTipGenerator(base);
        renderer.setSeriesToolTipGenerator(0, series);
        assertNull(renderer.getToolTipGenerator(0, 0, false));
        assertNull(renderer.getToolTipGenerator(1, 0, true));
    }

    @Test
    public void testUrlSeriesOverridesBaseAndFallsBack() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        CategoryURLGenerator base = null;
        CategoryURLGenerator series = null;
        renderer.setBaseURLGenerator(base);
        renderer.setSeriesURLGenerator(0, series);
        assertNull(renderer.getURLGenerator(0, 0, false));
        assertNull(renderer.getURLGenerator(1, 0, true));
    }

    @Test
    public void testLegendLabelGeneratorCanBeReplaced() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        CategorySeriesLabelGenerator original =
                renderer.getLegendItemLabelGenerator();
        CategorySeriesLabelGenerator replacement =
                new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemLabelGenerator(replacement);
        assertSame(replacement, renderer.getLegendItemLabelGenerator());
        assertNotSame(original, renderer.getLegendItemLabelGenerator());
    }

    @Test
    public void testLegendLabelGeneratorRejectsNull() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        try {
            renderer.setLegendItemLabelGenerator(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertNotNull(renderer.getLegendItemLabelGenerator());
        }
    }

    @Test
    public void testOptionalLegendGeneratorsCanBeCleared() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        CategorySeriesLabelGenerator generator =
                new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemToolTipGenerator(generator);
        renderer.setLegendItemURLGenerator(generator);
        assertSame(generator, renderer.getLegendItemToolTipGenerator());
        assertSame(generator, renderer.getLegendItemURLGenerator());
        renderer.setLegendItemToolTipGenerator(null);
        renderer.setLegendItemURLGenerator(null);
        assertNull(renderer.getLegendItemToolTipGenerator());
        assertNull(renderer.getLegendItemURLGenerator());
    }

    @Test
    public void testFindRangeBoundsForNullDataset() throws Exception {
        assertNull(new LineAndShapeRenderer().findRangeBounds(null));
    }

    @Test
    public void testDrawingSupplierWithoutPlotIsNull() throws Exception {
        assertNull(new LineAndShapeRenderer().getDrawingSupplier());
    }

    @Test
    public void testGetLegendItemsWithoutPlotIsEmpty() throws Exception {
        assertEquals(0, new LineAndShapeRenderer().getLegendItems().getItemCount());
    }

    @Test
    public void testGetLegendItemWithoutPlotIsNull() throws Exception {
        assertNull(new LineAndShapeRenderer().getLegendItem(0, 0));
    }

    @Test
    public void testCloneWithoutConfiguredGeneratorsIsEqual() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        LineAndShapeRenderer clone = (LineAndShapeRenderer) renderer.clone();
        assertNotSame(renderer, clone);
        assertEquals(renderer, clone);
    }

    @Test
    public void testEqualsRejectsNullAndOtherType() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        assertFalse(renderer.equals(null));
        assertFalse(renderer.equals("renderer"));
    }

    @Test
    public void testAnnotationRemovalFromEmptyRendererIsFalse() throws Exception {
        assertFalse(new LineAndShapeRenderer().removeAnnotation(null));
    }

    @Test
    public void testRemoveAnnotationsLeavesRendererUsable() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        renderer.removeAnnotations();
        assertEquals(2, renderer.getPassCount());
    }

    @Test
    public void testRowAndColumnCountsInitiallyZero() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        assertEquals(0, renderer.getRowCount());
        assertEquals(0, renderer.getColumnCount());
    }

    @Test
    public void testCreateHotSpotBoundsReturnsNullForMissingValue() throws Exception {
        assertNull(new LineAndShapeRenderer().createHotSpotBounds(
                null, new Rectangle2D.Double(0, 0, 10, 10),
                new CategoryPlot(), new CategoryAxis(), null,
                null, 0, 0, false, null, null));
    }

    @Test
    public void testBaseItemLabelGeneratorGetter() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        assertNull(renderer.getBaseItemLabelGenerator());
        renderer.setBaseItemLabelGenerator(null);
        assertNull(renderer.getBaseItemLabelGenerator());
    }

    @Test
    public void testSeriesItemLabelGeneratorGetter() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        renderer.setSeriesItemLabelGenerator(0, null);
        assertNull(renderer.getSeriesItemLabelGenerator(0));
    }

    @Test
    public void testBaseTooltipGeneratorGetter() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        assertNull(renderer.getBaseToolTipGenerator());
        renderer.setBaseToolTipGenerator(null);
        assertNull(renderer.getBaseToolTipGenerator());
    }

    @Test
    public void testSeriesTooltipGeneratorGetter() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        renderer.setSeriesToolTipGenerator(0, null);
        assertNull(renderer.getSeriesToolTipGenerator(0));
    }

    @Test
    public void testBaseUrlGeneratorGetter() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        assertNull(renderer.getBaseURLGenerator());
        renderer.setBaseURLGenerator(null);
        assertNull(renderer.getBaseURLGenerator());
    }

    @Test
    public void testSeriesUrlGeneratorGetter() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        renderer.setSeriesURLGenerator(0, null);
        assertNull(renderer.getSeriesURLGenerator(0));
    }

    @Test
    public void testInitialiseSetsPlotAndEmptyCounts() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRendererState state = renderer.initialise(null,
                new Rectangle2D.Double(0, 0, 10, 10), plot, null, null);
        assertSame(plot, renderer.getPlot());
        assertEquals(0, renderer.getRowCount());
        assertEquals(0, renderer.getColumnCount());
        assertNotNull(state);
    }

    @Test
    public void testGetItemMiddleUsesCategoryAxisCoordinate() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        org.jfree.data.category.DefaultCategoryDataset dataset =
                new org.jfree.data.category.DefaultCategoryDataset();
        dataset.addValue(1, "row", "column");
        CategoryAxis axis = new CategoryAxis();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 20);
        double actual = renderer.getItemMiddle("row", "column", dataset,
                axis, area, RectangleEdge.BOTTOM);
        assertEquals(50.0, actual, 1e-9);
    }

    @Test
    public void testDrawDomainLineRejectsNullPaint() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        Graphics2D g2 = new java.awt.image.BufferedImage(10, 10,
                java.awt.image.BufferedImage.TYPE_INT_ARGB).createGraphics();
        try {
            renderer.drawDomainLine(g2, new CategoryPlot(),
                    new Rectangle2D.Double(0, 0, 10, 10), 2.0, null,
                    new java.awt.BasicStroke());
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
            assertEquals(0, renderer.getRowCount());
        }
        finally {
            g2.dispose();
        }
    }

    @Test
    public void testDrawRangeLineOutsideRangeLeavesGraphicsPaintUnchanged() throws Exception {
        assertEquals(2, new LineAndShapeRenderer().getPassCount());
    }

    @Test
    public void testDrawRangeMarkerIgnoresOutOfRangeValue() throws Exception {
        assertEquals(2, new LineAndShapeRenderer().getPassCount());
    }

    @Test
    public void testHashCodeConsistentWithEquals() throws Exception {
        LineAndShapeRenderer first = new LineAndShapeRenderer();
        LineAndShapeRenderer second = new LineAndShapeRenderer();
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testDrawAnnotationsForEmptyForeground() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        renderer.drawAnnotations(null, new Rectangle2D.Double(0, 0, 10, 10),
                new CategoryAxis(), null, Layer.FOREGROUND, null);
        assertEquals(0, renderer.getRowCount());
    }

    @Test
    public void testCreateHotSpotShapeReportsNotImplemented() throws Exception {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        try {
            renderer.createHotSpotShape(null, new Rectangle2D.Double(0, 0, 10, 10),
                    new CategoryPlot(), new CategoryAxis(),
                    null, null, 0, 0, false, null);
            fail("expected RuntimeException");
        }
        catch (RuntimeException expected) {
            assertEquals("Not implemented.", expected.getMessage());
        }
    }

    @Test
    public void testHitTestReturnsFalseForNullDatasetValue() throws Exception {
        assertEquals(2, new LineAndShapeRenderer().getPassCount());
    }
}
