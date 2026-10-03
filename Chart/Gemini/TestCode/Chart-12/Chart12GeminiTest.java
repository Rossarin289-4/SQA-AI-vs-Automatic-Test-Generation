package org.jfree.chart.plot.junit;

import junit.framework.TestCase;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.category.DefaultCategoryDataset;

public class Chart12GeminiTest extends TestCase, ChartChangeListener {

    private boolean notified = false;

    public Chart12GeminiTest(String name) {
        super(name);
    }

    public void chartChanged(ChartChangeEvent event) {
        this.notified = true;
    }

    public void testConstructorDatasetListener() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.addChangeListener(this);

        this.notified = false;
        dataset.addValue(1.0, "R1", "C1");

        // The plot should receive dataset updates and fire a chart change event
        assertTrue(this.notified);
    }
}
