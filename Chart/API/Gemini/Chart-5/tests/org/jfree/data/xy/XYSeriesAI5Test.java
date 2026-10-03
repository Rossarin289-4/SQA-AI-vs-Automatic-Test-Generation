package org.jfree.data.xy;

import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.junit.Assert;
import org.junit.Test;

public class XYSeriesAI5Test {

    @Test
    public void testAutoSortAscendingOrder() {
        XYSeries series = new XYSeries("Series 1", true, true);
        series.add(5.0, 50.0);
        series.add(2.0, 20.0);
        series.add(8.0, 80.0);
        series.add(1.0, 10.0);

        Assert.assertEquals(4, series.getItemCount());
        Assert.assertEquals(1.0, series.getX(0).doubleValue(), 1e-9);
        Assert.assertEquals(10.0, series.getY(0).doubleValue(), 1e-9);
        Assert.assertEquals(2.0, series.getX(1).doubleValue(), 1e-9);
        Assert.assertEquals(5.0, series.getX(2).doubleValue(), 1e-9);
        Assert.assertEquals(8.0, series.getX(3).doubleValue(), 1e-9);
    }

    @Test
    public void testUnsortedSeriesMaintainsInsertionOrder() {
        XYSeries series = new XYSeries("Unsorted", false, true);
        series.add(10.0, 1.0);
        series.add(2.0, 5.0);
        series.add(7.0, 3.0);

        Assert.assertEquals(10.0, series.getX(0).doubleValue(), 1e-9);
        Assert.assertEquals(2.0, series.getX(1).doubleValue(), 1e-9);
        Assert.assertEquals(7.0, series.getX(2).doubleValue(), 1e-9);
    }

    @Test(expected = SeriesException.class)
    public void testDisallowDuplicatesSortedThrowsException() {
        XYSeries series = new XYSeries("NoDuplicates", true, false);
        series.add(1.0, 10.0);
        series.add(1.0, 20.0);
    }

    @Test(expected = SeriesException.class)
    public void testDisallowDuplicatesUnsortedThrowsException() {
        XYSeries series = new XYSeries("NoDuplicatesUnsorted", false, false);
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);
        series.add(1.0, 30.0);
    }

    @Test
    public void testAllowDuplicateXValues() {
        XYSeries series = new XYSeries("DuplicatesAllowed", true, true);
        series.add(1.0, 10.0);
        series.add(1.0, 20.0);
        series.add(1.0, 30.0);

        Assert.assertEquals(3, series.getItemCount());
        Assert.assertEquals(10.0, series.getY(0).doubleValue(), 1e-9);
        Assert.assertEquals(20.0, series.getY(1).doubleValue(), 1e-9);
        Assert.assertEquals(30.0, series.getY(2).doubleValue(), 1e-9);
    }

    @Test
    public void testAddOrUpdate() {
        XYSeries series = new XYSeries("AddOrUpdate", true, false);
        XYDataItem initial = series.addOrUpdate(1.0, 10.0);
        Assert.assertNull(initial);

        XYDataItem overwritten = series.addOrUpdate(1.0, 20.0);
        Assert.assertNotNull(overwritten);
        Assert.assertEquals(10.0, overwritten.getY().doubleValue(), 1e-9);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(20.0, series.getY(0).doubleValue(), 1e-9);

        // Add a new item
        series.addOrUpdate(2.0, 30.0);
        Assert.assertEquals(2, series.getItemCount());
    }

    @Test
    public void testMaximumItemCount() {
        XYSeries series = new XYSeries("MaxItems", true, true);
        series.setMaximumItemCount(3);
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);
        series.add(3.0, 30.0);
        Assert.assertEquals(3, series.getItemCount());

        series.add(4.0, 40.0);
        Assert.assertEquals(3, series.getItemCount());
        Assert.assertEquals(2.0, series.getX(0).doubleValue(), 1e-9);
        Assert.assertEquals(4.0, series.getX(2).doubleValue(), 1e-9);

        // Setting a smaller maximum reduces existing items
        series.setMaximumItemCount(2);
        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(3.0, series.getX(0).doubleValue(), 1e-9);
        Assert.assertEquals(4.0, series.getX(1).doubleValue(), 1e-9);
    }

    @Test
    public void testDeleteAndClear() {
        XYSeries series = new XYSeries("Series", true, true);
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);
        series.add(3.0, 30.0);
        series.add(4.0, 40.0);

        series.delete(1, 2);
        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(1.0, series.getX(0).doubleValue(), 1e-9);
        Assert.assertEquals(4.0, series.getX(1).doubleValue(), 1e-9);

        series.clear();
        Assert.assertEquals(0, series.getItemCount());
    }

    @Test
    public void testToArrayWithNullY() {
        XYSeries series = new XYSeries("Series", false, true);
        series.add(1.0, 10.0);
        series.add(2.0, (Number) null);

        double[][] array = series.toArray();
        Assert.assertEquals(2, array.length);
        Assert.assertEquals(2, array[0].length);
        Assert.assertEquals(1.0, array[0][0], 1e-9);
        Assert.assertEquals(10.0, array[1][0], 1e-9);
        Assert.assertEquals(2.0, array[0][1], 1e-9);
        Assert.assertTrue(Double.isNaN(array[1][1]));
    }

    @Test
    public void testCloningAndIndependence() throws CloneNotSupportedException {
        XYSeries s1 = new XYSeries("Series", true, true);
        s1.add(1.0, 10.0);
        s1.add(2.0, 20.0);

        XYSeries s2 = (XYSeries) s1.clone();
        Assert.assertEquals(s1, s2);
        Assert.assertEquals(s1.hashCode(), s2.hashCode());

        s2.add(3.0, 30.0);
        Assert.assertFalse(s1.equals(s2));
        Assert.assertEquals(2, s1.getItemCount());
        Assert.assertEquals(3, s2.getItemCount());
    }

    @Test
    public void testCreateCopy() throws CloneNotSupportedException {
        XYSeries s1 = new XYSeries("Series", true, true);
        s1.add(1.0, 10.0);
        s1.add(2.0, 20.0);
        s1.add(3.0, 30.0);
        s1.add(4.0, 40.0);

        XYSeries copy = s1.createCopy(1, 2);
        Assert.assertEquals(2, copy.getItemCount());
        Assert.assertEquals(2.0, copy.getX(0).doubleValue(), 1e-9);
        Assert.assertEquals(3.0, copy.getX(1).doubleValue(), 1e-9);
    }

    @Test
    public void testSeriesChangeEventNotification() {
        XYSeries series = new XYSeries("Series");
        final int[] changeCount = new int[1];
        series.addChangeListener(new SeriesChangeListener() {
            public void seriesChanged(SeriesChangeEvent event) {
                changeCount[0]++;
            }
        });

        series.add(1.0, 10.0, true);
        Assert.assertEquals(1, changeCount[0]);

        series.add(2.0, 20.0, false);
        Assert.assertEquals(1, changeCount[0]);

        series.updateByIndex(0, 15.0);
        Assert.assertEquals(2, changeCount[0]);

        series.remove(0);
        Assert.assertEquals(3, changeCount[0]);
    }
}
