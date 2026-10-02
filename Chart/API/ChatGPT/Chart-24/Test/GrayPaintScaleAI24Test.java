package org.jfree.chart.renderer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Color;
import java.awt.Paint;

import org.junit.Test;

public class GrayPaintScaleAI24Test {

    @Test
    public void testConstructorAndBounds() {
        GrayPaintScale scale = new GrayPaintScale(1.0, 5.0);
        assertEquals(1.0, scale.getLowerBound(), 0.0001);
        assertEquals(5.0, scale.getUpperBound(), 0.0001);

        GrayPaintScale defaultScale = new GrayPaintScale();
        assertEquals(0.0, defaultScale.getLowerBound(), 0.0001);
        assertEquals(1.0, defaultScale.getUpperBound(), 0.0001);
    }

    @Test
    public void testGetPaint() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 100.0);
        Paint p1 = scale.getPaint(0.0);
        assertEquals(new Color(0, 0, 0), p1);

        Paint p2 = scale.getPaint(100.0);
        assertEquals(new Color(255, 255, 255), p2);

        Paint p3 = scale.getPaint(50.0);
        assertEquals(new Color(127, 127, 127), p3);
    }

    @Test
    public void testEqualsAndClone() throws CloneNotSupportedException {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale3 = new GrayPaintScale(0.0, 2.0);

        assertTrue(scale1.equals(scale2));
        assertFalse(scale1.equals(scale3));
        assertFalse(scale1.equals(null));

        GrayPaintScale clone = (GrayPaintScale) scale1.clone();
        assertTrue(scale1.equals(clone));
    }
}
