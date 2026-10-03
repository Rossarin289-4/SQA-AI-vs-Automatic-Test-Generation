package org.jfree.chart.util.junit;

import java.awt.geom.GeneralPath;
import junit.framework.TestCase;
import org.jfree.chart.util.ShapeUtilities;

public class Chart11GeminiTest extends TestCase {

    public Chart11GeminiTest(String name) {
        super(name);
    }

    public void testEqualGeneralPath() {
        GeneralPath p1 = new GeneralPath();
        p1.moveTo(0.0f, 0.0f);
        p1.lineTo(10.0f, 10.0f);

        GeneralPath p2 = new GeneralPath();
        p2.moveTo(0.0f, 0.0f);
        p2.lineTo(20.0f, 20.0f);

        // Different paths should not be equal
        assertFalse(ShapeUtilities.equal(p1, p2));
    }
}
