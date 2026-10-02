package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Color;
import java.awt.BasicStroke;

import org.junit.Test;

public class ValueMarkerAI20Test {

    @Test
    public void testConstructorAndGetValue() {
        ValueMarker marker = new ValueMarker(100.5);
        assertEquals(100.5, marker.getValue(), 0.0001);
    }

    @Test
    public void testEquals() {
        ValueMarker m1 = new ValueMarker(10.0, Color.red, new BasicStroke(1.0f));
        ValueMarker m2 = new ValueMarker(10.0, Color.red, new BasicStroke(1.0f));
        ValueMarker m3 = new ValueMarker(20.0, Color.red, new BasicStroke(1.0f));

        assertTrue(m1.equals(m2));
        assertFalse(m1.equals(m3));
        assertFalse(m1.equals(null));
    }

    @Test
    public void testSetValue() {
        ValueMarker marker = new ValueMarker(5.0);
        marker.setValue(15.0);
        assertEquals(15.0, marker.getValue(), 0.0001);
    }
}
