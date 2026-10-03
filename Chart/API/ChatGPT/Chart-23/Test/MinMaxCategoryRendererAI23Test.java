package org.jfree.chart.renderer.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.BasicStroke;
import java.awt.Color;

import org.junit.Test;

public class MinMaxCategoryRendererAI23Test {

    @Test
    public void testDefaultConstructorAndGetters() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertFalse(renderer.isDrawLines());
    }

    @Test
    public void testEquals() {
        MinMaxCategoryRenderer r1 = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer r2 = new MinMaxCategoryRenderer();

        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));

        r1.setDrawLines(true);
        assertFalse(r1.equals(r2));

        r2.setDrawLines(true);
        assertTrue(r1.equals(r2));

        r1.setGroupPaint(Color.red);
        assertFalse(r1.equals(r2));

        r2.setGroupPaint(Color.red);
        assertTrue(r1.equals(r2));

        r1.setGroupStroke(new BasicStroke(2.0f));
        assertFalse(r1.equals(r2));

        r2.setGroupStroke(new BasicStroke(2.0f));
        assertTrue(r1.equals(r2));
    }

    @Test
    public void testEqualsWithNullAndDifferentClass() {
        MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
        assertFalse(renderer.equals(null));
        assertFalse(renderer.equals("Some String"));
    }
}
