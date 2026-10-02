package org.jfree.chart.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import org.junit.Test;

public class ShapeUtilitiesAI11Test {

    @Test
    public void testEqualLine2D() {
        Line2D l1 = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Line2D l2 = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Line2D l3 = new Line2D.Double(1.0, 2.0, 3.0, 5.0);

        assertTrue(ShapeUtilities.equal(l1, l2));
        assertFalse(ShapeUtilities.equal(l1, l3));
        assertTrue(ShapeUtilities.equal((Line2D) null, (Line2D) null));
        assertFalse(ShapeUtilities.equal(l1, null));
    }

    @Test
    public void testContainsRectangle2D() {
        Rectangle2D rect1 = new Rectangle2D.Double(0.0, 0.0, 10.0, 10.0);
        Rectangle2D rect2 = new Rectangle2D.Double(2.0, 2.0, 5.0, 5.0);
        Rectangle2D rect3 = new Rectangle2D.Double(5.0, 5.0, 10.0, 10.0);

        assertTrue(ShapeUtilities.contains(rect1, rect2));
        assertFalse(ShapeUtilities.contains(rect1, rect3));
    }

    @Test
    public void testIntersectsRectangle2D() {
        Rectangle2D rect1 = new Rectangle2D.Double(0.0, 0.0, 10.0, 10.0);
        Rectangle2D rect2 = new Rectangle2D.Double(5.0, 5.0, 10.0, 10.0);
        Rectangle2D rect3 = new Rectangle2D.Double(15.0, 15.0, 5.0, 5.0);

        assertTrue(ShapeUtilities.intersects(rect1, rect2));
        assertFalse(ShapeUtilities.intersects(rect1, rect3));
    }

}
