package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.util.Rotation;
import org.jfree.data.general.DefaultPieDataset;
import org.junit.Assert;
import org.junit.Test;

public class PiePlotAI15Test {

    @Test
    public void testDefaultConstructorAndProperties() {
        PiePlot plot = new PiePlot();
        Assert.assertNull(plot.getDataset());
        Assert.assertEquals(0, plot.getPieIndex());
        Assert.assertEquals(PiePlot.DEFAULT_INTERIOR_GAP, plot.getInteriorGap(), 0.00001);
        Assert.assertTrue(plot.isCircular());
        Assert.assertEquals(PiePlot.DEFAULT_START_ANGLE, plot.getStartAngle(), 0.00001);
        Assert.assertEquals(Rotation.CLOCKWISE, plot.getDirection());
        Assert.assertFalse(plot.getIgnoreNullValues());
        Assert.assertFalse(plot.getIgnoreZeroValues());
        Assert.assertEquals("Pie Plot", plot.getPlotType());
    }

    @Test
    public void testSetDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Section A", 10.0);
        dataset.setValue("Section B", 20.0);

        PiePlot plot = new PiePlot();
        plot.setDataset(dataset);
        Assert.assertSame(dataset, plot.getDataset());

        plot.setDataset(null);
        Assert.assertNull(plot.getDataset());
    }

    @Test
    public void testSetInteriorGapValid() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(0.15);
        Assert.assertEquals(0.15, plot.getInteriorGap(), 0.00001);
        plot.setInteriorGap(0.0);
        Assert.assertEquals(0.0, plot.getInteriorGap(), 0.00001);
        plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP);
        Assert.assertEquals(PiePlot.MAX_INTERIOR_GAP, plot.getInteriorGap(), 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGapTooHigh() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP + 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGapNegative() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(-0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDirectionNull() {
        PiePlot plot = new PiePlot();
        plot.setDirection(null);
    }

    @Test
    public void testSetDirectionValid() {
        PiePlot plot = new PiePlot();
        plot.setDirection(Rotation.ANTICLOCKWISE);
        Assert.assertEquals(Rotation.ANTICLOCKWISE, plot.getDirection());
    }

    @Test
    public void testGetLegendItems() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Item 1", 15.0);
        dataset.setValue("Item 2", 0.0);
        dataset.setValue("Item 3", null);

        PiePlot plot = new PiePlot(dataset);
        plot.setIgnoreZeroValues(false);
        plot.setIgnoreNullValues(false);
        LegendItemCollection items = plot.getLegendItems();
        Assert.assertEquals(3, items.getItemCount());

        plot.setIgnoreZeroValues(true);
        items = plot.getLegendItems();
        Assert.assertEquals(2, items.getItemCount());

        plot.setIgnoreNullValues(true);
        items = plot.getLegendItems();
        Assert.assertEquals(1, items.getItemCount());

        plot.setDataset(null);
        LegendItemCollection nullItems = plot.getLegendItems();
        Assert.assertNotNull(nullItems);
        Assert.assertEquals(0, nullItems.getItemCount());
    }

    @Test
    public void testEqualsAndHashCode() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        Assert.assertTrue(plot1.equals(plot2));
        Assert.assertTrue(plot2.equals(plot1));

        plot1.setStartAngle(45.0);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setStartAngle(45.0);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setCircular(false);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setCircular(false);
        Assert.assertTrue(plot1.equals(plot2));

        plot1.setInteriorGap(0.2);
        Assert.assertFalse(plot1.equals(plot2));
        plot2.setInteriorGap(0.2);
        Assert.assertTrue(plot1.equals(plot2));
    }

    @Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Key 1", 50.0);
        PiePlot plot1 = new PiePlot(dataset);
        plot1.setPieIndex(2);
        plot1.setStartAngle(180.0);

        PiePlot plot2 = (PiePlot) plot1.clone();
        Assert.assertNotSame(plot1, plot2);
        Assert.assertSame(plot1.getClass(), plot2.getClass());
        Assert.assertEquals(plot1, plot2);
        Assert.assertEquals(plot1.getPieIndex(), plot2.getPieIndex());
        Assert.assertEquals(plot1.getStartAngle(), plot2.getStartAngle(), 0.00001);
    }

    @Test
    public void testSerialization() throws Exception {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Key A", 100.0);
        PiePlot plot1 = new PiePlot(dataset);
        plot1.setStartAngle(120.0);
        plot1.setDirection(Rotation.ANTICLOCKWISE);
        plot1.setCircular(false);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(plot1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        PiePlot plot2 = (PiePlot) in.readObject();
        in.close();

        Assert.assertEquals(plot1, plot2);
        Assert.assertEquals(plot1.getStartAngle(), plot2.getStartAngle(), 0.00001);
        Assert.assertEquals(plot1.getDirection(), plot2.getDirection());
        Assert.assertEquals(plot1.isCircular(), plot2.isCircular());
    }

    @Test
    public void testGetArcBounds() {
        PiePlot plot = new PiePlot();
        Rectangle2D unexploded = new Rectangle2D.Double(10, 10, 100, 100);
        Rectangle2D exploded = new Rectangle2D.Double(5, 5, 110, 110);

        Rectangle2D boundsUnexploded = plot.getArcBounds(unexploded, exploded, 0.0, 90.0, 0.0);
        Assert.assertEquals(unexploded, boundsUnexploded);

        Rectangle2D boundsExploded = plot.getArcBounds(unexploded, exploded, 0.0, 90.0, 1.0);
        Assert.assertNotNull(boundsExploded);
        Assert.assertEquals(unexploded.getWidth(), boundsExploded.getWidth(), 0.00001);
        Assert.assertEquals(unexploded.getHeight(), boundsExploded.getHeight(), 0.00001);
    }
}
