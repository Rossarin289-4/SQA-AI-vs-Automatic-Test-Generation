package org.jfree.chart.util.junit;

import java.awt.geom.Rectangle2D;
import junit.framework.TestCase;
import org.jfree.chart.util.ShapeUtilities;

public class Chart11ChatGPTTest extends TestCase {
    public void testDifferentShapesAreNotEqual() {
        assertFalse(ShapeUtilities.equal(new Rectangle2D.Double(0,0,1,1), new Rectangle2D.Double(0,0,2,2)));
    }
}
