package org.jfree.chart.renderer.category.junit;

import junit.framework.TestCase;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;

public class Chart23GeminiTest extends TestCase {

    public Chart23GeminiTest(String name) {
        super(name);
    }

    public void testEquals() {
        MinMaxCategoryRenderer r1 = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer r2 = new MinMaxCategoryRenderer();

        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));
    }
}
