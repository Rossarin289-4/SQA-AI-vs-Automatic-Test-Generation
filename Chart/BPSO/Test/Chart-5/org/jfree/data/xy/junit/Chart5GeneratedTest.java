package org.jfree.data.xy.junit;

import junit.framework.TestCase;
import org.jfree.data.xy.XYSeries;

/** Regression scenario generated for Defects4J Chart-5. */
public final class Chart5GeneratedTest extends TestCase {
    public void testAddOrUpdatePreservesDuplicateXValuesWhenAllowed() {
        XYSeries series = new XYSeries("Series", true, true);
        series.addOrUpdate(1.0, 1.0);
        series.addOrUpdate(1.0, 2.0);

        assertEquals(new Double(1.0), series.getY(0));
        assertEquals(new Double(2.0), series.getY(1));
        assertEquals(2, series.getItemCount());
    }
}
