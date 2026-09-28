package org.jfree.chart.renderer.category.junit;

import java.awt.Color;
import junit.framework.TestCase;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;

public class Chart23ChatGPTTest extends TestCase {
    public void testRendererSpecificStateParticipatesInEquals() {
        MinMaxCategoryRenderer a = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer b = new MinMaxCategoryRenderer();
        assertTrue(a.equals(b));
        a.setGroupPaint(Color.RED);
        assertFalse(a.equals(b));
    }
}
