package org.jfree.chart.renderer.junit;

import java.awt.Color;
import junit.framework.TestCase;
import org.jfree.chart.renderer.GrayPaintScale;

public class Chart24ChatGPTTest extends TestCase {
    public void testValuesOutsideBoundsAreClamped() {
        GrayPaintScale s = new GrayPaintScale(0.0, 100.0);
        assertEquals(Color.BLACK, s.getPaint(-50.0));
        assertEquals(Color.WHITE, s.getPaint(150.0));
    }
}
