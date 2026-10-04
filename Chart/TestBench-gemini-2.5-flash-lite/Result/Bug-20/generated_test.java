package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Paint;
import java.awt.Stroke;
import org.jfree.chart.event.MarkerChangeEvent;

public class ValueMarkerTest {

    // Test for the constructor ValueMarker(double value)
    @Test
    public void testConstructorWithValue() throws Exception {
        double value = 10.5;
        ValueMarker marker = new ValueMarker(value);
        assertEquals(value, marker.getValue(), 0.0000001);
        // Default values for other attributes are inherited from Marker superclass
        // assertNull(marker.getPaint()); // This would require a concrete implementation of Paint
        // assertNull(marker.getStroke()); // This would require a concrete implementation of Stroke
    }

    // Test for the constructor ValueMarker(double value, Paint paint, Stroke stroke)
    @Test
    public void testConstructorWithValuePaintStroke() throws Exception {
        double value = 20.0;
        Paint paint = new java.awt.Color(0, 0, 0); // Simple concrete Paint
        Stroke stroke = new java.awt.BasicStroke(1.0f); // Simple concrete Stroke
        ValueMarker marker = new ValueMarker(value, paint, stroke);
        assertEquals(value, marker.getValue(), 0.0000001);
        assertEquals(paint, marker.getPaint());
        assertEquals(stroke, marker.getStroke());
    }

    // Test for the constructor ValueMarker(double value, Paint paint, Stroke stroke, Paint outlinePaint, Stroke outlineStroke, float alpha)
    @Test
    public void testConstructorWithAllParameters() throws Exception {
        double value = 30.5;
        Paint paint = java.awt.Color.RED;
        Stroke stroke = new java.awt.BasicStroke(2.0f);
        Paint outlinePaint = java.awt.Color.BLUE;
        Stroke outlineStroke = new java.awt.BasicStroke(3.0f);
        float alpha = 0.8f;
        ValueMarker marker = new ValueMarker(value, paint, stroke, outlinePaint, outlineStroke, alpha);
        assertEquals(value, marker.getValue(), 0.0000001);
        assertEquals(paint, marker.getPaint());
        assertEquals(stroke, marker.getStroke());
        assertEquals(outlinePaint, marker.getOutlinePaint());
        assertEquals(outlineStroke, marker.getOutlineStroke());
        assertEquals(alpha, marker.getAlpha(), 0.0000001f);
    }

    // Test for getValue() with a positive value
    @Test
    public void testGetValuePositive() throws Exception {
        double value = 15.75;
        ValueMarker marker = new ValueMarker(value);
        assertEquals(value, marker.getValue(), 0.0000001);
    }

    // Test for getValue() with a negative value
    @Test
    public void testGetValueNegative() throws Exception {
        double value = -5.25;
        ValueMarker marker = new ValueMarker(value);
        assertEquals(value, marker.getValue(), 0.0000001);
    }

    // Test for getValue() with zero
    @Test
    public void testGetValueZero() throws Exception {
        double value = 0.0;
        ValueMarker marker = new ValueMarker(value);
        assertEquals(value, marker.getValue(), 0.0000001);
    }

    // Test for getValue() with a large positive double value
    @Test
    public void testGetValueLargePositive() throws Exception {
        double value = 1.7976931348623157E308; // Double.MAX_VALUE
        ValueMarker marker = new ValueMarker(value);
        assertEquals(value, marker.getValue(), 0.0000001);
    }

    // Test for getValue() with a small positive double value (closest to zero)
    @Test
    public void testGetValueSmallPositive() throws Exception {
        double value = Double.MIN_NORMAL;
        ValueMarker marker = new ValueMarker(value);
        assertEquals(value, marker.getValue(), 0.0000001);
    }

    // Test for getValue() with a large negative double value
    @Test
    public void testGetValueLargeNegative() throws Exception {
        double value = -1.7976931348623157E308; // -Double.MAX_VALUE
        ValueMarker marker = new ValueMarker(value);
        assertEquals(value, marker.getValue(), 0.0000001);
    }

    // Test for getValue() with a small negative double value (closest to zero)
    @Test
    public void testGetValueSmallNegative() throws Exception {
        double value = -Double.MIN_NORMAL;
        ValueMarker marker = new ValueMarker(value);
        assertEquals(value, marker.getValue(), 0.0000001);
    }


    // Test for setValue(double value)
    @Test
    public void testSetValue() throws Exception {
        ValueMarker marker = new ValueMarker(5.0);
        double newValue = 15.0;
        marker.setValue(newValue);
        assertEquals(newValue, marker.getValue(), 0.0000001);
    }

    // Test setValue with a negative value
    @Test
    public void testSetValueNegative() throws Exception {
        ValueMarker marker = new ValueMarker(5.0);
        double newValue = -15.0;
        marker.setValue(newValue);
        assertEquals(newValue, marker.getValue(), 0.0000001);
    }

    // Test setValue with zero
    @Test
    public void testSetValueZero() throws Exception {
        ValueMarker marker = new ValueMarker(5.0);
        double newValue = 0.0;
        marker.setValue(newValue);
        assertEquals(newValue, marker.getValue(), 0.0000001);
    }
    
    // Test setValue with Double.POSITIVE_INFINITY
    @Test
    public void testSetValuePositiveInfinity() throws Exception {
        ValueMarker marker = new ValueMarker(5.0);
        double newValue = Double.POSITIVE_INFINITY;
        marker.setValue(newValue);
        assertEquals(newValue, marker.getValue(), 0.0000001);
    }

    // Test setValue with Double.NEGATIVE_INFINITY
    @Test
    public void testSetValueNegativeInfinity() throws Exception {
        ValueMarker marker = new ValueMarker(5.0);
        double newValue = Double.NEGATIVE_INFINITY;
        marker.setValue(newValue);
        assertEquals(newValue, marker.getValue(), 0.0000001);
    }

    // Test setValue with Double.NaN
    @Test
    public void testSetValueNaN() throws Exception {
        ValueMarker marker = new ValueMarker(5.0);
        double newValue = Double.NaN;
        marker.setValue(newValue);
        assertTrue(Double.isNaN(marker.getValue()));
    }

    // Test equals() with itself
    @Test
    public void testEqualsWithSelf() throws Exception {
        ValueMarker marker = new ValueMarker(1.0);
        assertTrue(marker.equals(marker));
    }

    // Test equals() with another marker with the same value
    @Test
    public void testEqualsWithSameValue() throws Exception {
        ValueMarker marker1 = new ValueMarker(2.5);
        ValueMarker marker2 = new ValueMarker(2.5);
        assertTrue(marker1.equals(marker2));
        assertTrue(marker2.equals(marker1));
    }

    // Test equals() with another marker with a different value
    @Test
    public void testEqualsWithDifferentValue() throws Exception {
        ValueMarker marker1 = new ValueMarker(2.5);
        ValueMarker marker2 = new ValueMarker(3.5);
        assertFalse(marker1.equals(marker2));
        assertFalse(marker2.equals(marker1));
    }

    // Test equals() with a different type of object
    @Test
    public void testEqualsWithDifferentType() throws Exception {
        ValueMarker marker = new ValueMarker(1.0);
        Object obj = new Object();
        assertFalse(marker.equals(obj));
    }

    // Test equals() with null
    @Test
    public void testEqualsWithNull() throws Exception {
        ValueMarker marker = new ValueMarker(1.0);
        assertFalse(marker.equals(null));
    }

    // Test equals() with a Marker that has different superclass attributes
    @Test
    public void testEqualsWithDifferentSuperAttributes() throws Exception {
        ValueMarker marker1 = new ValueMarker(5.0, java.awt.Color.RED, new java.awt.BasicStroke(1.0f));
        ValueMarker marker2 = new ValueMarker(5.0, java.awt.Color.BLUE, new java.awt.BasicStroke(1.0f));
        assertFalse(marker1.equals(marker2));
    }

    // Test that modifying marker attributes (from superclass) affects equals
    @Test
    public void testEqualsAfterSuperAttributeChange() throws Exception {
        ValueMarker marker1 = new ValueMarker(5.0);
        ValueMarker marker2 = new ValueMarker(5.0);
        marker1.setPaint(java.awt.Color.RED);
        assertFalse(marker1.equals(marker2));
    }
    
    // Test with the maximum possible double value for value
    @Test
    public void testValueMarkerMaxDouble() throws Exception {
        double value = Double.MAX_VALUE;
        ValueMarker marker = new ValueMarker(value);
        assertEquals(value, marker.getValue(), 0.0000001);
    }

    // Test with the minimum possible double value for value
    @Test
    public void testValueMarkerMinDouble() throws Exception {
        double value = -Double.MAX_VALUE;
        ValueMarker marker = new ValueMarker(value);
        assertEquals(value, marker.getValue(), 0.0000001);
    }
}
