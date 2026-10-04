```java
package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;

public class ShapeUtilitiesTest {
    @Test
    public void testCloneNull() throws Exception {
        assertNull(ShapeUtilities.clone(null));
    }

    @Test
    public void testCloneRectangle() throws Exception {
        Shape source = new Rectangle2D.Double(1, 2, 3, 4);
        Shape copy = ShapeUtilities.clone(source);
        assertNotNull(copy);
        assertTrue(ShapeUtilities.equal(source, copy));
        assertNotSame(source, copy);
    }

    @Test
    public void testEqualShapeNullCases() throws Exception {
        assertTrue(ShapeUtilities.equal((Shape) null, (Shape) null));
        assertFalse(ShapeUtilities.equal(new Rectangle2D.Double(0, 0, 1, 1), null));
        assertFalse(ShapeUtilities.equal(null, new Rectangle2D.Double(0, 0, 1, 1)));
    }

    @Test
    public void testEqualLines() throws Exception {
        assertTrue(ShapeUtilities.equal((Shape) new Line2D.Double(0, 1, 2, 3),
                (Shape) new Line2D.Double(0, 1, 2, 3)));
        assertFalse(ShapeUtilities.equal((Shape) new Line2D.Double(0, 1, 2, 3),
                (Shape) new Line2D.Double(0, 1, 2, 4)));
    }

    @Test
    public void testEqualEllipsesAndRectangles() throws Exception {
        assertTrue(ShapeUtilities.equal((Shape) new Ellipse2D.Double(1, 2, 3, 4),
                (Shape) new Ellipse2D.Double(1, 2, 3, 4)));
        assertFalse(ShapeUtilities.equal((Shape) new Ellipse2D.Double(1, 2, 3, 4),
                (Shape) new Ellipse2D.Double(1, 2, 3, 5)));
        assertTrue(ShapeUtilities.equal((Shape) new Rectangle2D.Double(1, 2, 3, 4),
                (Shape) new Rectangle2D.Double(1, 2, 3, 4)));
    }

    @Test
    public void testEqualArcs() throws Exception {
        Arc2D a = new Arc2D.Double(0, 0, 10, 8, 10, 20, Arc2D.OPEN);
        Arc2D b = new Arc2D.Double(0, 0, 10, 8, 10, 20, Arc2D.OPEN);
        assertTrue(ShapeUtilities.equal((Shape) a, (Shape) b));
        assertFalse(ShapeUtilities.equal((Shape) a,
                new Arc2D.Double(0, 0, 10, 8, 11, 20, Arc2D.OPEN)));
        assertFalse(ShapeUtilities.equal((Shape) a,
                new Arc2D.Double(0, 0, 10, 8, 10, 20, Arc2D.CHORD)));
    }

    @Test
    public void testEqualPolygons() throws Exception {
        Polygon a = new Polygon(new int[] {0, 2, 0}, new int[] {0, 0, 2}, 3);
        Polygon b = new Polygon(new int[] {0, 2, 0}, new int[] {0, 0, 2}, 3);
        assertTrue(ShapeUtilities.equal((Shape) a, (Shape) b));
        assertFalse(ShapeUtilities.equal((Shape) a,
                new Polygon(new int[] {0, 3, 0}, new int[] {0, 0, 2}, 3)));
    }

    @Test
    public void testEqualGeneralPaths() throws Exception {
        GeneralPath a = new GeneralPath();
        a.moveTo(0, 0);
        a.lineTo(2, 0);
        a.closePath();
        GeneralPath b = new GeneralPath();
        b.moveTo(0, 0);
        b.lineTo(2, 0);
        b.closePath();
        assertTrue(ShapeUtilities.equal((Shape) a, (Shape) b));

        GeneralPath c = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        c.moveTo(0, 0);
        c.lineTo(2, 0);
        c.closePath();
        assertFalse(ShapeUtilities.equal((Shape) a, (Shape) c));
    }

    @Test
    public void testCreateTranslatedShape() throws Exception {
        Shape moved = ShapeUtilities.createTranslatedShape(
                new Rectangle2D.Double(1, 2, 3, 4), 5, -2);
        assertTrue(ShapeUtilities.equal((Shape) new Rectangle2D.Double(6, 0, 3, 4), moved));
    }

    @Test
    public void testTranslatedShapeRejectsNull() throws Exception {
        try {
            ShapeUtilities.createTranslatedShape(null, 1, 2);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRotateShapeAndNull() throws Exception {
        Shape rotated = ShapeUtilities.rotateShape(
                new Rectangle2D.Double(0, 0, 2, 1), Math.PI / 2, 0, 0);
        Rectangle2D bounds = rotated.getBounds2D();
        assertEquals(-1.0, bounds.getMinX(), 1e-9);
        assertEquals(2.0, bounds.getMaxY(), 1e-9);
        assertNull(ShapeUtilities.rotateShape(null, 1, 0, 0));
    }

    @Test
    public void testDrawRotatedShapeRestoresTransform() throws Exception {
        java.awt.image.BufferedImage image =
                new java.awt.image.BufferedImage(10, 10, java.awt.image.BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        AffineTransform before = g.getTransform();
        ShapeUtilities.drawRotatedShape(g, new Rectangle2D.Double(0, 0, 2, 2),
                Math.PI / 2, 1, 1);
        assertEquals(before, g.getTransform());
        g.dispose();
    }

    @Test
    public void testCreateDiagonalCrossHasExpectedBounds() throws Exception {
        Rectangle2D bounds = ShapeUtilities.createDiagonalCross(2, 1).getBounds2D();
        assertEquals(-3.0, bounds.getMinX(), 1e-6);
        assertEquals(3.0, bounds.getMaxX(), 1e-6);
        assertEquals(-3.0, bounds.getMinY(), 1e-6);
        assertEquals(3.0, bounds.getMaxY(), 1e-6);
    }

    @Test
    public void testCreateRegularCrossBounds() throws Exception {
        Rectangle2D bounds = ShapeUtilities.createRegularCross(3, 1).getBounds2D();
        assertEquals(-3.0, bounds.getMinX(), 1e-6);
        assertEquals(3.0, bounds.getMaxX(), 1e-6);
        assertEquals(-3.0, bounds.getMinY(), 1e-6);
        assertEquals(3.0, bounds.getMaxY(), 1e-6);
    }

    @Test
    public void testCreateDiamondBounds() throws Exception {
        Rectangle2D bounds = ShapeUtilities.createDiamond(2).getBounds2D();
        assertEquals(-2.0, bounds.getMinX(), 1e-6);
        assertEquals(2.0, bounds.getMaxX(), 1e-6);
        assertEquals(-2.0, bounds.getMinY(), 1e-6);
        assertEquals(2.0, bounds.getMaxY(), 1e-6);
    }

    @Test
    public void testCreateUpTriangleBounds() throws Exception {
        Rectangle2D bounds = ShapeUtilities.createUpTriangle(2).getBounds2D();
        assertEquals(-2.0, bounds.getMinY(), 1e-6);
        assertEquals(2.0, bounds.getMaxY(), 1e-6);
        assertEquals(-2.0, bounds.getMinX(), 1e-6);
        assertEquals(2.0, bounds.getMaxX(), 1e-6);
    }

    @Test
    public void testCreateDownTriangleBounds() throws Exception {
        Rectangle2D bounds = ShapeUtilities.createDownTriangle(2).getBounds2D();
        assertEquals(-2.0, bounds.getMinY(), 1e-6);
        assertEquals(2.0, bounds.getMaxY(), 1e-6);
        assertEquals(-2.0, bounds.getMinX(), 1e-6);
        assertEquals(2.0, bounds.getMaxX(), 1e-6);
    }

    @Test
    public void testCreateLineRegionHorizontalAndVertical() throws Exception {
        Rectangle2D horizontal = ShapeUtilities.createLineRegion(
                new Line2D.Double(0, 0, 4, 0), 2).getBounds2D();
        assertEquals(0.0, horizontal.getMinX(), 1e-6);
        assertEquals(4.0, horizontal.getMaxX(), 1e-6);
        assertEquals(-2.0, horizontal.getMinY(), 1e-6);
        assertEquals(2.0, horizontal.getMaxY(), 1e-6);

        Rectangle2D vertical = ShapeUtilities.createLineRegion(
                new Line2D.Double(1, 0, 1, 4), 2).getBounds2D();
        assertEquals(0.0, vertical.getMinX(), 1e-6);
        assertEquals(2.0, vertical.getMaxX(), 1e-6);
        assertEquals(0.0, vertical.getMinY(), 1e-6);
        assertEquals(4.0, vertical.getMaxY(), 1e-6);
    }

    @Test
    public void testGetPointInRectangleClampsEachCoordinate() throws Exception {
        Rectangle2D area = new Rectangle2D.Double(1, 2, 3, 4);
        assertEquals(new Point2D.Double(1, 4),
                ShapeUtilities.getPointInRectangle(-1, 4, area));
        assertEquals(new Point2D.Double(4, 6),
                ShapeUtilities.getPointInRectangle(9, 9, area));
        assertEquals(new Point2D.Double(2, 3),
                ShapeUtilities.getPointInRectangle(2, 3, area));
    }

    @Test
    public void testContainsInclusiveEdgesAndZeroSize() throws Exception {
        Rectangle2D outer = new Rectangle2D.Double(0, 0, 10, 10);
        assertTrue(ShapeUtilities.contains(outer, new Rectangle2D.Double(10, 10, 0, 0)));
        assertTrue(ShapeUtilities.contains(outer, new Rectangle2D.Double(2, 2, 0, 0)));
        assertFalse(ShapeUtilities.contains(outer, new Rectangle2D.Double(10, 10, 1, 0)));
        assertFalse(ShapeUtilities.contains(outer, new Rectangle2D.Double(-1, 0, 1, 1)));
    }

    @Test
    public void testIntersectsInclusiveEdgesAndDisjointRectangles() throws Exception {
        Rectangle2D outer = new Rectangle2D.Double(0, 0, 10, 10);
        assertTrue(ShapeUtilities.intersects(outer, new Rectangle2D.Double(10, 2, 1, 1)));
        assertTrue(ShapeUtilities.intersects(outer, new Rectangle2D.Double(10, 2, 0, 0)));
        assertFalse(ShapeUtilities.intersects(outer, new Rectangle2D.Double(11, 2, 1, 1)));
        assertFalse(ShapeUtilities.intersects(outer, new Rectangle2D.Double(2, 11, 1, 1)));
    }
}
```