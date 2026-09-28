package org.jfree.data.general.junit;

import junit.framework.TestCase;
import org.jfree.data.Range;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.DefaultIntervalXYDataset;

public class Chart2ChatGPTTest extends TestCase {
    public void testDomainBoundsIncludeCentralXValue() {
        DefaultIntervalXYDataset d = new DefaultIntervalXYDataset();
        d.addSeries("S", new double[][] {{5.0}, {10.0}, {20.0}, {1.0}, {1.0}, {1.0}});
        Range r = DatasetUtilities.findDomainBounds(d, true);
        assertEquals(5.0, r.getLowerBound(), 0.0);
        assertEquals(20.0, r.getUpperBound(), 0.0);
    }
}
