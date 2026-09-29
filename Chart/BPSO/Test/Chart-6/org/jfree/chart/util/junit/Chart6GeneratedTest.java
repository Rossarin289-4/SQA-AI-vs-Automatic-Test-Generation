package org.jfree.chart.util.junit;
import java.awt.geom.Rectangle2D;
import junit.framework.TestCase;
import org.jfree.chart.util.ShapeList;
public class Chart6GeneratedTest extends TestCase {
    public void testEquivalentShapesAreEqual() {
        ShapeList a = new ShapeList(); ShapeList b = new ShapeList();
        a.setShape(0, new Rectangle2D.Double(1, 2, 3, 4));
        b.setShape(0, new Rectangle2D.Double(1, 2, 3, 4));
        assertTrue(a.equals(b));
    }
}
