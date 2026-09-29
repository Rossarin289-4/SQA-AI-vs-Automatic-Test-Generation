package org.jfree.chart.util.junit;
import java.awt.geom.GeneralPath;
import junit.framework.TestCase;
import org.jfree.chart.util.ShapeUtilities;
public class Chart11GeneratedTest extends TestCase {
    public void testEquivalentGeneralPathsAreEqual() {
        GeneralPath a = new GeneralPath(); a.moveTo(1, 1); a.lineTo(2, 2);
        GeneralPath b = new GeneralPath(); b.moveTo(1, 1); b.lineTo(2, 2);
        assertTrue(ShapeUtilities.equal(a, b));
        b.lineTo(3, 3);
        assertFalse(ShapeUtilities.equal(a, b));
    }
}
