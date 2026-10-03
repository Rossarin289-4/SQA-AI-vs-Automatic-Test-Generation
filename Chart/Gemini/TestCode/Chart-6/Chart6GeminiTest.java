package org.jfree.chart.util.junit;

import java.awt.geom.Rectangle2D;
import junit.framework.TestCase;
import org.jfree.chart.util.ShapeList;

public class Chart6GeminiTest extends TestCase {

    public Chart6GeminiTest(String name) {
        super(name);
    }

    public void testEqualsWithShapes() {
        ShapeList l1 = new ShapeList();
        ShapeList l2 = new ShapeList();

        l1.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        l2.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));

        assertTrue(l1.equals(l2));
    }
}
