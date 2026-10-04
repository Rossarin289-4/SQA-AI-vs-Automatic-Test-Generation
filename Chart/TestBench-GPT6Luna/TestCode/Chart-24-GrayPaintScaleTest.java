package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;
import java.awt.Paint;
import java.io.Serializable;
import org.jfree.chart.util.PublicCloneable;

public class GrayPaintScaleTest {

    @Test
    public void testDefaultBounds() throws Exception {
        GrayPaintScale scale = new GrayPaintScale();
        assertEquals(0.0, scale.getLowerBound(), 0.0);
        assertEquals(1.0, scale.getUpperBound(), 0.0);
    }

    @Test
    public void testCustomBounds() throws Exception {
        GrayPaintScale scale = new GrayPaintScale(-2.0, 6.0);
        assertEquals(-2.0, scale.getLowerBound(), 0.0);
        assertEquals(6.0, scale.getUpperBound(), 0.0);
    }

    @Test
    public void testEqualBoundsRejected() throws Exception {
        try {
            new GrayPaintScale(2.0, 2.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testReversedBoundsRejected() throws Exception {
        try {
            new GrayPaintScale(3.0, 2.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testPaintAtLowerBound() throws Exception {
        Paint paint = new GrayPaintScale(0.0, 10.0).getPaint(0.0);
        assertEquals(new Color(0, 0, 0), paint);
    }

    @Test
    public void testPaintBelowLowerBoundClampsToBlack() throws Exception {
        Paint paint = new GrayPaintScale(0.0, 10.0).getPaint(-1.0);
        assertEquals(new Color(0, 0, 0), paint);
    }

    @Test
    public void testPaintAtUpperBound() throws Exception {
        Paint paint = new GrayPaintScale(0.0, 10.0).getPaint(10.0);
        assertEquals(new Color(255, 255, 255), paint);
    }

    @Test
    public void testPaintAboveUpperBoundClampsToWhite() throws Exception {
        Paint paint = new GrayPaintScale(0.0, 10.0).getPaint(11.0);
        assertEquals(new Color(255, 255, 255), paint);
    }

    @Test
    public void testPaintMidpoint() throws Exception {
        Paint paint = new GrayPaintScale(0.0, 10.0).getPaint(5.0);
        assertEquals(new Color(127, 127, 127), paint);
    }

    @Test
    public void testPaintQuarterPoint() throws Exception {
        Paint paint = new GrayPaintScale(0.0, 8.0).getPaint(2.0);
        assertEquals(new Color(63, 63, 63), paint);
    }

    @Test
    public void testPaintWithNegativeRange() throws Exception {
        Paint paint = new GrayPaintScale(-4.0, 4.0).getPaint(0.0);
        assertEquals(new Color(127, 127, 127), paint);
    }

    @Test
    public void testPaintUsesConfiguredRange() throws Exception {
        Paint paint = new GrayPaintScale(2.0, 6.0).getPaint(3.0);
        assertEquals(new Color(63, 63, 63), paint);
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        GrayPaintScale scale = new GrayPaintScale();
        assertTrue(scale.equals(scale));
    }

    @Test
    public void testEqualsMatchingBounds() throws Exception {
        GrayPaintScale first = new GrayPaintScale(-1.0, 3.0);
        GrayPaintScale second = new GrayPaintScale(-1.0, 3.0);
        assertTrue(first.equals(second));
    }

    @Test
    public void testEqualsDifferentLowerBound() throws Exception {
        GrayPaintScale first = new GrayPaintScale(0.0, 3.0);
        GrayPaintScale second = new GrayPaintScale(1.0, 3.0);
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsDifferentUpperBound() throws Exception {
        GrayPaintScale first = new GrayPaintScale(0.0, 3.0);
        GrayPaintScale second = new GrayPaintScale(0.0, 4.0);
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsNull() throws Exception {
        assertFalse(new GrayPaintScale().equals(null));
    }

    @Test
    public void testEqualsDifferentType() throws Exception {
        assertFalse(new GrayPaintScale().equals("scale"));
    }

    @Test
    public void testClonePreservesBoundsAndEquality() throws Exception {
        GrayPaintScale original = new GrayPaintScale(-2.0, 7.0);
        GrayPaintScale copy = (GrayPaintScale) original.clone();
        assertEquals(-2.0, copy.getLowerBound(), 0.0);
        assertEquals(7.0, copy.getUpperBound(), 0.0);
        assertTrue(original.equals(copy));
    }

    @Test
    public void testClonePaintBehavior() throws Exception {
        GrayPaintScale original = new GrayPaintScale(0.0, 4.0);
        GrayPaintScale copy = (GrayPaintScale) original.clone();
        assertEquals(new Color(127, 127, 127), copy.getPaint(2.0));
    }
}
