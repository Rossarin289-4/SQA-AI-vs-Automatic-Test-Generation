package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Paint;
import java.awt.Stroke;
import org.jfree.chart.event.MarkerChangeEvent;

public class ValueMarkerTest {
    @Test
    public void testConstructorPreservesZero() throws Exception {
        ValueMarker marker = new ValueMarker(0.0);
        assertEquals(0.0, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorPreservesPositiveValue() throws Exception {
        ValueMarker marker = new ValueMarker(12.5);
        assertEquals(12.5, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorPreservesNegativeValue() throws Exception {
        ValueMarker marker = new ValueMarker(-7.25);
        assertEquals(-7.25, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorPreservesSmallestPositiveDouble() throws Exception {
        ValueMarker marker = new ValueMarker(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorPreservesLargestFiniteDouble() throws Exception {
        ValueMarker marker = new ValueMarker(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorPreservesPositiveInfinity() throws Exception {
        ValueMarker marker = new ValueMarker(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorPreservesNegativeInfinity() throws Exception {
        ValueMarker marker = new ValueMarker(Double.NEGATIVE_INFINITY);
        assertEquals(Double.NEGATIVE_INFINITY, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorPreservesNaN() throws Exception {
        ValueMarker marker = new ValueMarker(Double.NaN);
        assertTrue(Double.isNaN(marker.getValue()));
    }

    @Test
    public void testSetValueUpdatesValue() throws Exception {
        ValueMarker marker = new ValueMarker(1.0);
        marker.setValue(3.5);
        assertEquals(3.5, marker.getValue(), 0.0);
    }

    @Test
    public void testSetValueUpdatesToZero() throws Exception {
        ValueMarker marker = new ValueMarker(9.0);
        marker.setValue(0.0);
        assertEquals(0.0, marker.getValue(), 0.0);
    }

    @Test
    public void testSetValueUpdatesToNegativeValue() throws Exception {
        ValueMarker marker = new ValueMarker(2.0);
        marker.setValue(-4.5);
        assertEquals(-4.5, marker.getValue(), 0.0);
    }

    @Test
    public void testSetValueUpdatesToLargestFiniteDouble() throws Exception {
        ValueMarker marker = new ValueMarker(0.0);
        marker.setValue(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, marker.getValue(), 0.0);
    }

    @Test
    public void testSetValueUpdatesToPositiveInfinity() throws Exception {
        ValueMarker marker = new ValueMarker(0.0);
        marker.setValue(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, marker.getValue(), 0.0);
    }

    @Test
    public void testSetValueUpdatesToNaN() throws Exception {
        ValueMarker marker = new ValueMarker(0.0);
        marker.setValue(Double.NaN);
        assertTrue(Double.isNaN(marker.getValue()));
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        ValueMarker marker = new ValueMarker(2.0);
        assertTrue(marker.equals(marker));
    }

    @Test
    public void testEqualsMatchingMarkers() throws Exception {
        ValueMarker first = new ValueMarker(2.0);
        ValueMarker second = new ValueMarker(2.0);
        assertTrue(first.equals(second));
    }

    @Test
    public void testEqualsDifferentValues() throws Exception {
        ValueMarker first = new ValueMarker(2.0);
        ValueMarker second = new ValueMarker(3.0);
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsNull() throws Exception {
        ValueMarker marker = new ValueMarker(2.0);
        assertFalse(marker.equals(null));
    }

    @Test
    public void testEqualsDifferentObjectType() throws Exception {
        ValueMarker marker = new ValueMarker(2.0);
        assertFalse(marker.equals("marker"));
    }

    @Test
    public void testEqualsNaNMarkers() throws Exception {
        ValueMarker first = new ValueMarker(Double.NaN);
        ValueMarker second = new ValueMarker(Double.NaN);
        assertFalse(first.equals(second));
    }
}
