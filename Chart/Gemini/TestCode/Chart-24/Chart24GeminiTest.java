package org.jfree.chart.renderer.junit;

import java.awt.Color;
import java.awt.Paint;
import junit.framework.TestCase;
import org.jfree.chart.renderer.GrayPaintScale;

public class Chart24GeminiTest extends TestCase {

    public Chart24GeminiTest(String name) {
        super(name);
    }

    public void testGetPaintBelowLowerBound() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 100.0);
        try {
            Paint p = scale.getPaint(-10.0);
            assertEquals(new Color(0, 0, 0), p);
        } catch (IllegalArgumentException e) {
            fail("getPaint(-10.0) threw IllegalArgumentException: " + e.getMessage());
        }
    }
}
