package org.jfree.chart.renderer.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;

import org.junit.Test;

public class StatisticalBarRendererAI25Test {

    @Test
    public void testDefaultConstructor() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertEquals(Color.gray, renderer.getErrorIndicatorPaint());
        assertNotNull(renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testSetErrorIndicatorPaint() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setErrorIndicatorPaint(Color.red);
        assertEquals(Color.red, renderer.getErrorIndicatorPaint());
        
        renderer.setErrorIndicatorPaint(null);
        assertEquals(null, renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testEquals() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();
        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));

        r1.setErrorIndicatorPaint(Color.blue);
        assertFalse(r1.equals(r2));

        r2.setErrorIndicatorPaint(Color.blue);
        assertTrue(r1.equals(r2));
    }
}
