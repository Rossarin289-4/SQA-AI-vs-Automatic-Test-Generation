package org.jfree.chart.plot.junit;
import junit.framework.TestCase;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
public class Chart12GeneratedTest extends TestCase {
    public void testConstructorRegistersDatasetListener() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        assertTrue(dataset.hasListener(plot));
    }
}
