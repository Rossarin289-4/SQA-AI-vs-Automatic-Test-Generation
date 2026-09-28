package org.jfree.chart.plot.junit;

import junit.framework.TestCase;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.category.DefaultCategoryDataset;

public class Chart12ChatGPTTest extends TestCase {
    public void testConstructorRegistersDatasetListener() {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        final boolean[] changed = {false};
        MultiplePiePlot p = new MultiplePiePlot(d);
        p.addChangeListener(new PlotChangeListener(){ public void plotChanged(PlotChangeEvent e){ changed[0]=true; }});
        d.addValue(1.0, "R", "C");
        assertTrue(changed[0]);
    }
}
