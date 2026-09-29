package org.jfree.data.time.junit;

import junit.framework.TestCase;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.Year;

/** Regression scenario generated for Defects4J Chart-3. */
public final class Chart3GeneratedTest extends TestCase {
    private static final double EPSILON = 0.000000001d;

    public void testCreateCopyRecalculatesMinAndMaxY() throws CloneNotSupportedException {
        TimeSeries original = new TimeSeries("S1");
        original.add(new Year(2009), 100.0);
        original.add(new Year(2010), 101.0);
        original.add(new Year(2011), 102.0);

        TimeSeries firstTwo = original.createCopy(0, 1);
        assertEquals(100.0, firstTwo.getMinY(), EPSILON);
        assertEquals(101.0, firstTwo.getMaxY(), EPSILON);

        TimeSeries lastTwo = original.createCopy(1, 2);
        assertEquals(101.0, lastTwo.getMinY(), EPSILON);
        assertEquals(102.0, lastTwo.getMaxY(), EPSILON);
    }
}
