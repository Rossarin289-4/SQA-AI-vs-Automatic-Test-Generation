package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PiePlotAI15Test {

    @Test
    public void testEqualsBasic() {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));
    }

    @Test
    public void testEqualsDifferentStartAngle() {
        PiePlot plot1 = new PiePlot();
        plot1.setStartAngle(45.0);
        PiePlot plot2 = new PiePlot();
        plot2.setStartAngle(90.0);
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testClone() throws Exception {
        PiePlot plot1 = new PiePlot();
        plot1.setStartAngle(30.0);
        PiePlot clone = (PiePlot) plot1.clone();
        assertEquals(plot1, clone);
    }
}
