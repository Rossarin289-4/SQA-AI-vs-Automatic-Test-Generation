package org.jfree.chart.plot.junit;

import junit.framework.TestCase;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.util.Layer;

public class Chart14GeminiTest extends TestCase {

    public Chart14GeminiTest(String name) {
        super(name);
    }

    public void testRemoveDomainMarkerNullListCategoryPlot() {
        CategoryPlot plot = new CategoryPlot();
        CategoryMarker marker = new CategoryMarker("C1");
        
        try {
            boolean removed = plot.removeDomainMarker(0, marker, Layer.BACKGROUND);
            assertFalse(removed);
        } catch (NullPointerException e) {
            fail("removeDomainMarker threw NullPointerException when marker list was null");
        }
    }

    public void testRemoveDomainMarkerNullListXYPlot() {
        XYPlot plot = new XYPlot();
        ValueMarker marker = new ValueMarker(1.0);

        try {
            boolean removed = plot.removeDomainMarker(0, marker, Layer.BACKGROUND);
            assertFalse(removed);
        } catch (NullPointerException e) {
            fail("removeDomainMarker threw NullPointerException when marker list was null");
        }
    }
}
