package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Paint;
import java.awt.Stroke;
import org.jfree.chart.event.MarkerChangeEvent;

public class ValueMarkerTest {
    @Test
    public void testConstructorStoresZero() throws Exception {
        ValueMarker marker = new ValueMarker(0.0);
        assertEquals(0.0, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorStoresPositiveValue() throws Exception {
        ValueMarker marker = new ValueMarker(12.5);
        assertEquals(12.5, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorStoresNegativeValue() throws Exception {
        ValueMarker marker = new ValueMarker(-12.5);
        assertEquals(-12.5, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorStoresLargestFiniteDouble() throws Exception {
        ValueMarker marker = new ValueMarker(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorStoresSmallestFiniteDouble() throws Exception {
        ValueMarker marker = new ValueMarker(-Double.MAX_VALUE);
        assertEquals(-Double.MAX_VALUE, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorStoresPositiveInfinity() throws Exception {
        ValueMarker marker = new ValueMarker(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorStoresNegativeInfinity() throws Exception {
        ValueMarker marker = new ValueMarker(Double.NEGATIVE_INFINITY);
        assertEquals(Double.NEGATIVE_INFINITY, marker.getValue(), 0.0);
    }

    @Test
    public void testConstructorStoresNaN() throws Exception {
        ValueMarker marker = new ValueMarker(Double.NaN);
        assertTrue(Double.isNaN(marker.getValue()));
    }

    @Test
    public void testSetValueUpdatesValue() throws Exception {
        ValueMarker marker = new ValueMarker(1.0);
        marker.setValue(7.25);
        assertEquals(7.25, marker.getValue(), 0.0);
    }

    @Test
    public void testSetValueUpdatesToZero() throws Exception {
        ValueMarker marker = new ValueMarker(-1.0);
        marker.setValue(0.0);
        assertEquals(0.0, marker.getValue(), 0.0);
    }

    @Test
    public void testSetValueUpdatesToNegativeValue() throws Exception {
        ValueMarker marker = new ValueMarker(1.0);
        marker.setValue(-3.5);
        assertEquals(-3.5, marker.getValue(), 0.0);
    }

    @Test
    public void testSetValueUpdatesToLargestFiniteDouble() throws Exception {
        ValueMarker marker = new ValueMarker(0.0);
        marker.setValue(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, marker.getValue(), 0.0);
    }

    @Test
    public void testSetValueUpdatesToSmallestFiniteDouble() throws Exception {
        ValueMarker marker = new ValueMarker(0.0);
        marker.setValue(-Double.MAX_VALUE);
        assertEquals(-Double.MAX_VALUE, marker.getValue(), 0.0);
    }

    @Test
    public void testSetValueUpdatesToNaN() throws Exception {
        ValueMarker marker = new ValueMarker(0.0);
        marker.setValue(Double.NaN);
        assertTrue(Double.isNaN(marker.getValue()));
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        ValueMarker marker = new ValueMarker(4.0);
        assertTrue(marker.equals(marker));
    }

    @Test
    public void testEqualsEquivalentMarkers() throws Exception {
        ValueMarker first = new ValueMarker(4.0);
        ValueMarker second = new ValueMarker(4.0);
        assertTrue(first.equals(second));
    }

    @Test
    public void testNotEqualsDifferentValues() throws Exception {
        ValueMarker first = new ValueMarker(4.0);
        ValueMarker second = new ValueMarker(5.0);
        assertFalse(first.equals(second));
    }

    @Test
    public void testNotEqualsNull() throws Exception {
        ValueMarker marker = new ValueMarker(4.0);
        assertFalse(marker.equals(null));
    }

    @Test
    public void testNotEqualsDifferentObjectType() throws Exception {
        ValueMarker marker = new ValueMarker(4.0);
        assertFalse(marker.equals("marker"));
    }

    @Test
    public void testEqualsMarkersAtLargestFiniteValue() throws Exception {
        ValueMarker first = new ValueMarker(Double.MAX_VALUE);
        ValueMarker second = new ValueMarker(Double.MAX_VALUE);
        assertTrue(first.equals(second));
    }

    @Test
    public void testEqualsMarkersAtSmallestFiniteValue() throws Exception {
        ValueMarker first = new ValueMarker(-Double.MAX_VALUE);
        ValueMarker second = new ValueMarker(-Double.MAX_VALUE);
        assertTrue(first.equals(second));
    }

    @Test
    public void testNaNMarkersAreNotEqual() throws Exception {
        ValueMarker first = new ValueMarker(Double.NaN);
        ValueMarker second = new ValueMarker(Double.NaN);
        assertFalse(first.equals(second));
    }

    @Test
    public void testInfinityMarkersAreEqual() throws Exception {
        ValueMarker first = new ValueMarker(Double.POSITIVE_INFINITY);
        ValueMarker second = new ValueMarker(Double.POSITIVE_INFINITY);
        assertTrue(first.equals(second));
    }
}
