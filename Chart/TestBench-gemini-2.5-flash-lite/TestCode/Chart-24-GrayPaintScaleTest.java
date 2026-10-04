package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;
import java.awt.Paint;
import java.io.Serializable;
import org.jfree.chart.util.PublicCloneable;

public class GrayPaintScaleTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorDefault() throws Exception {
        GrayPaintScale scale = new GrayPaintScale();
        assertEquals(0.0, scale.getLowerBound(), 1e-9);
        assertEquals(1.0, scale.getUpperBound(), 1e-9);
    }

    @Test
    public void testConstructorWithBounds() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);
        assertEquals(10.0, scale.getLowerBound(), 1e-9);
        assertEquals(20.0, scale.getUpperBound(), 1e-9);
    }

    @Test
    public void testConstructorThrowsIllegalArgumentExceptionWhenLowerNotLessThanUpper() throws Exception {
        try {
            new GrayPaintScale(1.0, 0.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorThrowsIllegalArgumentExceptionWhenLowerEqualsUpper() throws Exception {
        try {
            new GrayPaintScale(1.0, 1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testGetPaint_ValueWithinBounds() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(0.5);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        assertEquals(127, color.getRed()); // (0.5 - 0.0) / (1.0 - 0.0) * 255 = 127.5, int cast to 127
        assertEquals(127, color.getGreen());
        assertEquals(127, color.getBlue());
    }

    @Test
    public void testGetPaint_ValueAtLowerBound() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(0.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        assertEquals(0, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    public void testGetPaint_ValueAtUpperBound() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(1.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        assertEquals(255, color.getRed());
        assertEquals(255, color.getGreen());
        assertEquals(255, color.getBlue());
    }

    @Test
    public void testGetPaint_ValueBelowLowerBound() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(-1.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        assertEquals(0, color.getRed()); // Clamped to lowerBound
        assertEquals(0, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    public void testGetPaint_ValueAboveUpperBound() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(2.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        assertEquals(255, color.getRed()); // Clamped to upperBound
        assertEquals(255, color.getGreen());
        assertEquals(255, color.getBlue());
    }

    @Test
    public void testGetPaint_DifferentBounds() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);
        Paint paint = scale.getPaint(15.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        // (15.0 - 10.0) / (20.0 - 10.0) * 255 = 5.0 / 10.0 * 255 = 0.5 * 255 = 127.5 -> 127
        assertEquals(127, color.getRed());
        assertEquals(127, color.getGreen());
        assertEquals(127, color.getBlue());
    }

    @Test
    public void testGetPaint_DifferentBounds_AtLower() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);
        Paint paint = scale.getPaint(10.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        assertEquals(0, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    public void testGetPaint_DifferentBounds_AtUpper() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);
        Paint paint = scale.getPaint(20.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        assertEquals(255, color.getRed());
        assertEquals(255, color.getGreen());
        assertEquals(255, color.getBlue());
    }

    @Test
    public void testGetPaint_DifferentBounds_BelowLower() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);
        Paint paint = scale.getPaint(5.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        assertEquals(0, color.getRed()); // Clamped
        assertEquals(0, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    public void testGetPaint_DifferentBounds_AboveUpper() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);
        Paint paint = scale.getPaint(25.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        assertEquals(255, color.getRed()); // Clamped
        assertEquals(255, color.getGreen());
        assertEquals(255, color.getBlue());
    }
    
    @Test
    public void testGetPaint_ValuePreciselyMidPoint() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 2.0);
        Paint paint = scale.getPaint(1.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        // (1.0 - 0.0) / (2.0 - 0.0) * 255 = 0.5 * 255 = 127.5 -> 127
        assertEquals(127, color.getRed());
        assertEquals(127, color.getGreen());
        assertEquals(127, color.getBlue());
    }

    @Test
    public void testGetPaint_ValueSlightlyAboveMidPoint() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 2.0);
        Paint paint = scale.getPaint(1.0000001);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        // (1.0000001 - 0.0) / (2.0 - 0.0) * 255 = 0.50000005 * 255 = 127.50001275 -> 127
        assertEquals(127, color.getRed());
        assertEquals(127, color.getGreen());
        assertEquals(127, color.getBlue());
    }
    
    @Test
    public void testGetPaint_ValueSlightlyBelowMidPoint() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 2.0);
        Paint paint = scale.getPaint(0.9999999);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        // (0.9999999 - 0.0) / (2.0 - 0.0) * 255 = 0.49999995 * 255 = 127.4999875 -> 127
        assertEquals(127, color.getRed());
        assertEquals(127, color.getGreen());
        assertEquals(127, color.getBlue());
    }

    @Test
    public void testEquals_SameObject() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        assertTrue(scale.equals(scale));
    }

    @Test
    public void testEquals_DifferentObjectSameValues() throws Exception {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 1.0);
        assertTrue(scale1.equals(scale2));
    }

    @Test
    public void testEquals_DifferentLowerBound() throws Exception {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(1.0, 2.0);
        assertFalse(scale1.equals(scale2));
    }

    @Test
    public void testEquals_DifferentUpperBound() throws Exception {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 2.0);
        assertFalse(scale1.equals(scale2));
    }
    
    @Test
    public void testEquals_NullObject() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        assertFalse(scale.equals(null));
    }

    @Test
    public void testEquals_DifferentClass() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        assertFalse(scale.equals("some string"));
    }
    
    @Test
    public void testClone() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(5.0, 10.0);
        Object clonedObject = scale.clone();
        assertTrue(clonedObject instanceof GrayPaintScale);
        GrayPaintScale clonedScale = (GrayPaintScale) clonedObject;
        
        assertEquals(scale.getLowerBound(), clonedScale.getLowerBound(), 1e-9);
        assertEquals(scale.getUpperBound(), clonedScale.getUpperBound(), 1e-9);
        
        // Ensure it's a different instance
        assertNotSame(scale, clonedScale);
    }

    @Test
    public void testGetPaint_VerySmallRange() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1e-9);
        Paint paint = scale.getPaint(0.5e-9);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        // (0.5e-9 - 0.0) / (1e-9 - 0.0) * 255 = 0.5 * 255 = 127.5 -> 127
        assertEquals(127, color.getRed());
        assertEquals(127, color.getGreen());
        assertEquals(127, color.getBlue());
    }

    @Test
    public void testGetPaint_VeryLargeRange() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1e9);
        Paint paint = scale.getPaint(0.5e9);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        // (0.5e9 - 0.0) / (1e9 - 0.0) * 255 = 0.5 * 255 = 127.5 -> 127
        assertEquals(127, color.getRed());
        assertEquals(127, color.getGreen());
        assertEquals(127, color.getBlue());
    }
}
