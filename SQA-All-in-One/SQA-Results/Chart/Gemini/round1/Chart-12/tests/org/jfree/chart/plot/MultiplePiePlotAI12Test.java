package org.jfree.chart.plot;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Assert;
import org.junit.Test;

public class MultiplePiePlotAI12Test {

    @Test
    public void testConstructorAndDefaults() {
        MultiplePiePlot plot = new MultiplePiePlot();
        Assert.assertNull(plot.getDataset());
        Assert.assertNotNull(plot.getPieChart());
        Assert.assertTrue(plot.getPieChart().getPlot() instanceof PiePlot);
        Assert.assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
        Assert.assertEquals(0.0, plot.getLimit(), 0.000001);
        Assert.assertEquals("Other", plot.getAggregatedItemsKey());
        Assert.assertEquals(Color.lightGray, plot.getAggregatedItemsPaint());
        Assert.assertEquals("Multiple Pie Plot", plot.getPlotType());
    }

    @Test
    public void testSetPieChart() {
        MultiplePiePlot plot = new MultiplePiePlot();
        PiePlot subPlot = new PiePlot();
        JFreeChart chart = new JFreeChart(subPlot);
        plot.setPieChart(chart);
        Assert.assertSame(chart, plot.getPieChart());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartNull() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setPieChart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartInvalidPlot() {
        MultiplePiePlot plot = new MultiplePiePlot();
        JFreeChart chart = new JFreeChart(new FastScatterPlot());
        plot.setPieChart(chart);
    }

    @Test
    public void testGetSetDataExtractOrder() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        Assert.assertEquals(TableOrder.BY_ROW, plot.getDataExtractOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDataExtractOrderNull() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(null);
    }

    @Test
    public void testGetSetAggregatedItemsKeyAndPaint() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey("Misc");
        Assert.assertEquals("Misc", plot.getAggregatedItemsKey());

        plot.setAggregatedItemsPaint(Color.blue);
        Assert.assertEquals(Color.blue, plot.getAggregatedItemsPaint());

        plot.setLimit(0.15);
        Assert.assertEquals(0.15, plot.getLimit(), 0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsKeyNull() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsPaintNull() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsPaint(null);
    }

    @Test
    public void testEquals() {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();
        Assert.assertTrue(plot1.equals(plot2));
        Assert.assertTrue(plot2.equals(plot1));

        plot1.setDataExtractOrder(TableOrder.BY_ROW);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setDataExtractOrder(TableOrder.BY_ROW);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setLimit(0.10);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setLimit(0.10);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setAggregatedItemsKey("Grouped");
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setAggregatedItemsKey("Grouped");
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setAggregatedItemsPaint(Color.red);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setAggregatedItemsPaint(Color.red);
        Assert.assertTrue(plot1.equals(plot2));

        Assert.assertFalse(plot1.equals(null));
        Assert.assertFalse(plot1.equals("Not a Plot"));
    }

    @Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(20.0, "R1", "C2");
        MultiplePiePlot p1 = new MultiplePiePlot(dataset);
        MultiplePiePlot p2 = (MultiplePiePlot) p1.clone();

        Assert.assertNotSame(p1, p2);
        Assert.assertSame(p1.getClass(), p2.getClass());
        Assert.assertTrue(p1.equals(p2));
    }

    @Test
    public void testSerialization() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(20.0, "R2", "C1");
        MultiplePiePlot p1 = new MultiplePiePlot(dataset);
        p1.setAggregatedItemsPaint(Color.green);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(p1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        MultiplePiePlot p2 = (MultiplePiePlot) in.readObject();
        in.close();

        Assert.assertEquals(p1, p2);
        Assert.assertEquals(Color.green, p2.getAggregatedItemsPaint());
    }

    @Test
    public void testGetLegendItems() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row 1", "Col 1");
        dataset.addValue(2.0, "Row 1", "Col 2");
        dataset.addValue(3.0, "Row 2", "Col 1");
        dataset.addValue(4.0, "Row 2", "Col 2");

        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        // Default is BY_COLUMN, keys in legend should be row keys
        LegendItemCollection itemsCol = plot.getLegendItems();
        Assert.assertEquals(2, itemsCol.getItemCount());
        Assert.assertEquals("Row 1", itemsCol.get(0).getLabel());
        Assert.assertEquals("Row 2", itemsCol.get(1).getLabel());

        plot.setDataExtractOrder(TableOrder.BY_ROW);
        LegendItemCollection itemsRow = plot.getLegendItems();
        Assert.assertEquals(2, itemsRow.getItemCount());
        Assert.assertEquals("Col 1", itemsRow.get(0).getLabel());
        Assert.assertEquals("Col 2", itemsRow.get(1).getLabel());

        // With aggregation limit
        plot.setLimit(0.5);
        LegendItemCollection itemsWithLimit = plot.getLegendItems();
        Assert.assertEquals(3, itemsWithLimit.getItemCount());
        Assert.assertEquals("Other", itemsWithLimit.get(2).getLabel());
    }

    @Test
    public void testDraw() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "R1", "C1");
        dataset.addValue(20.0, "R1", "C2");
        dataset.addValue(30.0, "R2", "C1");
        dataset.addValue(40.0, "R2", "C2");

        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setLimit(0.2);

        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        ChartRenderingInfo chartInfo = new ChartRenderingInfo();
        PlotRenderingInfo info = chartInfo.getPlotInfo();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 400.0, 300.0);

        // Should execute drawing without exception for BY_COLUMN
        plot.draw(g2, area, null, null, info);

        // Switch to BY_ROW and draw again
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        plot.draw(g2, area, null, null, info);

        g2.dispose();
        Assert.assertTrue(info.getSubplotCount() > 0);
    }

    @Test
    public void testDrawEmptyDataset() {
        MultiplePiePlot plot = new MultiplePiePlot(new DefaultCategoryDataset());
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        plot.draw(g2, new Rectangle2D.Double(0, 0, 200, 200), null, null, null);
        g2.dispose();
    }
}
