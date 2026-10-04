package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.PaintUtilities;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.PieDataset;

public class MultiplePiePlotTest {

    @Test
    public void testDefaults() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        assertNull(p.getDataset());
        assertEquals(TableOrder.BY_COLUMN, p.getDataExtractOrder());
        assertEquals(0.0, p.getLimit(), 0.0);
        assertEquals("Other", p.getAggregatedItemsKey());
        assertEquals(Color.lightGray, p.getAggregatedItemsPaint());
        assertEquals("Multiple Pie Plot", p.getPlotType());
    }

    @Test
    public void testSetAndGetLimitZero() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        p.setLimit(0.0);
        assertEquals(0.0, p.getLimit(), 0.0);
    }

    @Test
    public void testSetAndGetLimitOne() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        p.setLimit(1.0);
        assertEquals(1.0, p.getLimit(), 0.0);
    }

    @Test
    public void testSetAndGetNegativeLimit() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        p.setLimit(-1.0);
        assertEquals(-1.0, p.getLimit(), 0.0);
    }

    @Test
    public void testSetAndGetKey() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        p.setAggregatedItemsKey("Small");
        assertEquals("Small", p.getAggregatedItemsKey());
    }

    @Test
    public void testNullKeyRejected() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        try {
            p.setAggregatedItemsKey(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertEquals("Other", p.getAggregatedItemsKey());
    }

    @Test
    public void testSetAndGetAggregatedPaint() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        p.setAggregatedItemsPaint(Color.blue);
        assertEquals(Color.blue, p.getAggregatedItemsPaint());
    }

    @Test
    public void testNullAggregatedPaintRejected() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        try {
            p.setAggregatedItemsPaint(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertEquals(Color.lightGray, p.getAggregatedItemsPaint());
    }

    @Test
    public void testSetDataExtractOrderByRow() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        p.setDataExtractOrder(TableOrder.BY_ROW);
        assertEquals(TableOrder.BY_ROW, p.getDataExtractOrder());
    }

    @Test
    public void testSetDataExtractOrderByColumn() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        p.setDataExtractOrder(TableOrder.BY_COLUMN);
        assertEquals(TableOrder.BY_COLUMN, p.getDataExtractOrder());
    }

    @Test
    public void testNullDataExtractOrderRejected() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        try {
            p.setDataExtractOrder(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertEquals(TableOrder.BY_COLUMN, p.getDataExtractOrder());
    }

    @Test
    public void testSetAndGetPieChart() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        JFreeChart chart = new JFreeChart(new PiePlot());
        p.setPieChart(chart);
        assertSame(chart, p.getPieChart());
    }

    @Test
    public void testNullPieChartRejected() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        JFreeChart original = p.getPieChart();
        try {
            p.setPieChart(null);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertSame(original, p.getPieChart());
    }

    @Test
    public void testNonPieChartRejected() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        JFreeChart original = p.getPieChart();
        JFreeChart other = new JFreeChart(new MultiplePiePlot());
        try {
            p.setPieChart(other);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
        assertSame(original, p.getPieChart());
    }

    @Test
    public void testNullDatasetCanBeSet() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        p.setDataset(null);
        assertNull(p.getDataset());
    }

    @Test
    public void testEqualsSelf() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        assertTrue(p.equals(p));
    }

    @Test
    public void testEqualsNull() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        assertFalse(p.equals(null));
    }

    @Test
    public void testNotEqualToOtherType() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        assertFalse(p.equals("plot"));
    }

    @Test
    public void testEqualDefaultPlots() throws Exception {
        MultiplePiePlot first = new MultiplePiePlot();
        MultiplePiePlot second = new MultiplePiePlot();
        assertTrue(first.equals(second));
    }

    @Test
    public void testDifferentLimitMakesPlotsUnequal() throws Exception {
        MultiplePiePlot first = new MultiplePiePlot();
        MultiplePiePlot second = new MultiplePiePlot();
        second.setLimit(1.0);
        assertFalse(first.equals(second));
    }

    @Test
    public void testDifferentOrderMakesPlotsUnequal() throws Exception {
        MultiplePiePlot first = new MultiplePiePlot();
        MultiplePiePlot second = new MultiplePiePlot();
        second.setDataExtractOrder(TableOrder.BY_ROW);
        assertFalse(first.equals(second));
    }

    @Test
    public void testDifferentAggregateKeyMakesPlotsUnequal() throws Exception {
        MultiplePiePlot first = new MultiplePiePlot();
        MultiplePiePlot second = new MultiplePiePlot();
        second.setAggregatedItemsKey("Small");
        assertFalse(first.equals(second));
    }

    @Test
    public void testDifferentAggregatePaintMakesPlotsUnequal() throws Exception {
        MultiplePiePlot first = new MultiplePiePlot();
        MultiplePiePlot second = new MultiplePiePlot();
        second.setAggregatedItemsPaint(Color.blue);
        assertFalse(first.equals(second));
    }

    @Test
    public void testEmptyLegendWithoutDataset() throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        assertEquals(0, p.getLegendItems().getItemCount());
    }

    @Test
    public void testPositiveLimitAddsAggregateLegendItemWithoutDataset()
            throws Exception {
        MultiplePiePlot p = new MultiplePiePlot();
        p.setLimit(0.01);
        assertEquals(0, p.getLegendItems().getItemCount());
    }
}
