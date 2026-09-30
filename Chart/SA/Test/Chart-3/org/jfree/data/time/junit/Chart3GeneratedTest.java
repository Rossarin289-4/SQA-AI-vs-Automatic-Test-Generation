package org.jfree.data.time.junit;

import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.Year;

import junit.framework.TestCase;

/** Regression scenario generated for Defects4J Chart-3. */
public final class Chart3GeneratedTest extends TestCase {

    private static final double EPSILON = 0.000000001d;

    public void testCreateCopyPreservesValues()
            throws CloneNotSupportedException {

        TimeSeries original = new TimeSeries("S1");

        original.add(new Year(2009), 100.0);
        original.add(new Year(2010), 101.0);
        original.add(new Year(2011), 102.0);

        // Copy index 0-1
        TimeSeries firstTwo = original.createCopy(0, 1);

        assertEquals(2, firstTwo.getItemCount());

        assertEquals(
                100.0,
                firstTwo.getValue(0).doubleValue(),
                EPSILON
        );

        assertEquals(
                101.0,
                firstTwo.getValue(1).doubleValue(),
                EPSILON
        );

        // Copy index 1-2
        TimeSeries lastTwo = original.createCopy(1, 2);

        assertEquals(2, lastTwo.getItemCount());

        assertEquals(
                101.0,
                lastTwo.getValue(0).doubleValue(),
                EPSILON
        );

        assertEquals(
                102.0,
                lastTwo.getValue(1).doubleValue(),
                EPSILON
        );
    }
}