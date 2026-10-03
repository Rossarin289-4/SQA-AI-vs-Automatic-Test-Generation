package org.jfree.chart.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AxisAI26Test {

    private static class ConcreteAxis extends Axis {
        public ConcreteAxis(String label) {
            super(label);
        }
    }

    @Test
    public void testEqualsAndClone() throws Exception {
        Axis a1 = new ConcreteAxis("Test Axis");
        Axis a2 = new ConcreteAxis("Test Axis");

        assertTrue(a1.equals(a2));
        assertEquals(a1, a2);

        Axis clone = (Axis) a1.clone();
        assertTrue(a1.equals(clone));

        a2.setLabel("Different Label");
        assertFalse(a1.equals(a2));
    }

    @Test
    public void testVisibilityProperties() {
        Axis axis = new ConcreteAxis("Visibility Test");
        assertTrue(axis.isVisible());

        axis.setVisible(false);
        assertFalse(axis.isVisible());

        axis.setTickMarksVisible(false);
        assertFalse(axis.isTickMarksVisible());
    }

    @Test
    public void testLabelProperties() {
        Axis axis = new ConcreteAxis("Initial");
        assertEquals("Initial", axis.getLabel());

        axis.setLabel("Updated");
        assertEquals("Updated", axis.getLabel());

        axis.setLabelAngle(1.57);
        assertEquals(1.57, axis.getLabelAngle(), 0.0001);
    }
}
