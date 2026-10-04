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
    public void testCloneRectangleHasSameBounds() throws Exception {
        Rectangle2D source = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape result = ShapeUtilities.clone(source);
        assertNotNull(result);
        assertEquals(source.getBounds2D(), result.getBounds2D());
        assertNotSame(source, result);
    }

    @Test
    public void testEqualLinesAndNullCases() throws Exception {
        Line2D line = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        assertTrue(ShapeUtilities.equal(line, new Line2D.Double(1.0, 2.0, 3.0, 4.0)));
        assertFalse(ShapeUtilities.equal(line, new Line2D.Double(1.0, 2.0, 3.0, 5.0)));
        assertTrue(ShapeUtilities.equal((Shape) null, (Shape) null));
        assertFalse(ShapeUtilities.equal(line, null));
    }

    @Test
    public void testEqualEllipses() throws Exception {
        assertTrue(ShapeUtilities.equal(
                new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0),
                new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0)));
        assertFalse(ShapeUtilities.equal(
                new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0),
                new Ellipse2D.Double(1.0, 2.0, 3.0, 5.0)));
    }

    @Test
    public void testEqualArcsChecksAnglesAndType() throws Exception {
        Arc2D a = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 10.0, 20.0, Arc2D.OPEN);
        Arc2D b = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 10.0, 20.0, Arc2D.OPEN);
        assertTrue(ShapeUtilities.equal(a, b));
        assertFalse(ShapeUtilities.equal(a,
                new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 11.0, 20.0, Arc2D.OPEN)));
        assertFalse(ShapeUtilities.equal(a,
                new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 10.0, 20.0, Arc2D.CHORD)));
    }

    @Test
    public void testEqualPolygonsChecksVertices() throws Exception {
        Polygon a = new Polygon(new int[] {0, 2, 0}, new int[] {0, 0, 2}, 3);
        Polygon b = new Polygon(new int[] {0, 2, 0}, new int[] {0, 0, 2}, 3);
        Polygon c = new Polygon(new int[] {0, 2, 1}, new int[] {0, 0, 2}, 3);
        assertTrue(ShapeUtilities.equal(a, b));
        assertFalse(ShapeUtilities.equal(a, c));
    }

    @Test
    public void testEqualGeneralPaths() throws Exception {
        GeneralPath a = new GeneralPath();
        a.moveTo(0.0f, 0.0f);
        a.lineTo(2.0f, 0.0f);
        a.closePath();
        GeneralPath b = new GeneralPath();
        b.moveTo(0.0f, 0.0f);
        b.lineTo(2.0f, 0.0f);
        b.closePath();
        GeneralPath c = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        c.moveTo(0.0f, 0.0f);
        c.lineTo(2.0f, 0.0f);
        c.closePath();
        assertTrue(ShapeUtilities.equal(a, b));
        assertFalse(ShapeUtilities.equal(a, c));
    }

    @Test
    public void testEqualRectanglesUsesObjectEquality() throws Exception {
        assertTrue(ShapeUtilities.equal(
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)));
        assertFalse(ShapeUtilities.equal(
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                new Rectangle2D.Double(1.0, 2.0, 3.0, 5.0)));
    }

    @Test
    public void testCreateTranslatedShape() throws Exception {
        Shape result = ShapeUtilities.createTranslatedShape(
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), 5.0, -2.0);
        assertEquals(new Rectangle2D.Double(6.0, 0.0, 3.0, 4.0), result.getBounds2D());
    }

    @Test
    public void testCreateTranslatedShapeRejectsNull() throws Exception {
        try {
            ShapeUtilities.createTranslatedShape(null, 1.0, 2.0);
            fail("expected IllegalArgumentException");
        }
        catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testRotateShapeAroundPoint() throws Exception {
        Shape result = ShapeUtilities.rotateShape(
                new Rectangle2D.Double(1.0, 0.0, 1.0, 1.0),
                Math.PI / 2.0, 0.0f, 0.0f);
        Rectangle2D bounds = result.getBounds2D();
        assertEquals(-1.0, bounds.getMinX(), 1e-9);
        assertEquals(1.0, bounds.getMinY(), 1e-9);
        assertEquals(1.0, bounds.getWidth(), 1e-9);
        assertEquals(1.0, bounds.getHeight(), 1e-9);
    }

    @Test
    public void testRotateNullReturnsNull() throws Exception {
        assertNull(ShapeUtilities.rotateShape(null, 1.0, 0.0f, 0.0f));
    }

    @Test
    public void testDrawRotatedShapeRestoresTransform() throws Exception {
        java.awt.image.BufferedImage image =
                new java.awt.image.BufferedImage(8, 8, java.awt.image.BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = image.createGraphics();
        try {
            AffineTransform before = graphics.getTransform();
            ShapeUtilities.drawRotatedShape(graphics,
                    new Rectangle2D.Double(1.0, 1.0, 2.0, 2.0), 0.5, 2.0f, 2.0f);
            assertEquals(before, graphics.getTransform());
        }
        finally {
            graphics.dispose();
        }
    }

    @Test
    public void testCreateDiagonalCrossBounds() throws Exception {
        Rectangle2D bounds = ShapeUtilities.createDiagonalCross(2.0f, 1.0f).getBounds2D();
        assertEquals(-3.0, bounds.getMinX(), 1e-6);
        assertEquals(-3.0, bounds.getMinY(), 1e-6);
        assertEquals(6.0, bounds.getWidth(), 1e-6);
        assertEquals(6.0, bounds.getHeight(), 1e-6);
    }

    @Test
    public void testCreateRegularCrossBounds() throws Exception {
        Rectangle2D bounds = ShapeUtilities.createRegularCross(2.0f, 1.0f).getBounds2D();
        assertEquals(-2.0, bounds.getMinX(), 1e-6);
        assertEquals(-2.0, bounds.getMinY(), 1e-6);
        assertEquals(4.0, bounds.getWidth(), 1e-6);
        assertEquals(4.0, bounds.getHeight(), 1e-6);
    }

    @Test
    public void testCreateDiamondBounds() throws Exception {
        Rectangle2D bounds = ShapeUtilities.createDiamond(2.0f).getBounds2D();
        assertEquals(-2.0, bounds.getMinX(), 1e-6);
        assertEquals(-2.0, bounds.getMinY(), 1e-6);
        assertEquals(4.0, bounds.getWidth(), 1e-6);
        assertEquals(4.0, bounds.getHeight(), 1e-6);
    }

    @Test
    public void testCreateUpTriangleBounds() throws Exception {
        Rectangle2D bounds = ShapeUtilities.createUpTriangle(2.0f).getBounds2D();
        assertEquals(-2.0, bounds.getMinX(), 1e-6);
        assertEquals(-2.0, bounds.getMinY(), 1e-6);
        assertEquals(4.0, bounds.getWidth(), 1e-6);
        assertEquals(4.0, bounds.getHeight(), 1e-6);
    }

    @Test
    public void testCreateDownTriangleBounds() throws Exception {
        Rectangle2D bounds = ShapeUtilities.createDownTriangle(2.0f).getBounds2D();
        assertEquals(-2.0, bounds.getMinX(), 1e-6);
        assertEquals(-2.0, bounds.getMinY(), 1e-6);
        assertEquals(4.0, bounds.getWidth(), 1e-6);
        assertEquals(4.0, bounds.getHeight(), 1e-6);
    }

    @Test
    public void testCreateLineRegionVerticalAndWidth() throws Exception {
        Shape result = ShapeUtilities.createLineRegion(
                new Line2D.Double(2.0, 1.0, 2.0, 5.0), 2.0f);
        Rectangle2D bounds = result.getBounds2D();
        assertEquals(1.0, bounds.getMinX(), 1e-6);
        assertEquals(2.0, bounds.getWidth(), 1e-6);
        assertEquals(1.0, bounds.getMinY(), 1e-6);
        assertEquals(4.0, bounds.getHeight(), 1e-6);
    }

    @Test
    public void testCreateLineRegionHorizontal() throws Exception {
        Shape result = ShapeUtilities.createLineRegion(
                new Line2D.Double(1.0, 2.0, 5.0, 2.0), 2.0f);
        Rectangle2D bounds = result.getBounds2D();
        assertEquals(1.0, bounds.getMinX(), 1e-6);
        assertEquals(5.0, bounds.getMaxX(), 1e-6);
        assertEquals(0.0, bounds.getMinY(), 1e-6);
        assertEquals(4.0, bounds.getMaxY(), 1e-6);
    }

    @Test
    public void testGetPointInRectangleClampsEachCoordinate() throws Exception {
        Rectangle2D area = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        assertEquals(new Point2D.Double(1.0, 4.0),
                ShapeUtilities.getPointInRectangle(-1.0, 4.0, area));
        assertEquals(new Point2D.Double(4.0, 6.0),
                ShapeUtilities.getPointInRectangle(8.0, 9.0, area));
        assertEquals(new Point2D.Double(2.0, 3.0),
                ShapeUtilities.getPointInRectangle(2.0, 3.0, area));
    }

    @Test
    public void testContainsInclusiveBoundsAndRejectsOutside() throws Exception {
        Rectangle2D outer = new Rectangle2D.Double(0.0, 0.0, 4.0, 4.0);
        assertTrue(ShapeUtilities.contains(outer,
                new Rectangle2D.Double(0.0, 0.0, 4.0, 4.0)));
        assertTrue(ShapeUtilities.contains(outer,
                new Rectangle2D.Double(4.0, 2.0, 0.0, 0.0)));
        assertFalse(ShapeUtilities.contains(outer,
                new Rectangle2D.Double(3.0, 3.0, 2.0, 1.0)));
    }

    @Test
    public void testIntersectsIncludesTouchingAndRejectsSeparated() throws Exception {
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 4.0, 4.0);
        assertTrue(ShapeUtilities.intersects(area,
                new Rectangle2D.Double(4.0, 1.0, 1.0, 1.0)));
        assertTrue(ShapeUtilities.intersects(area,
                new Rectangle2D.Double(4.0, 4.0, 0.0, 0.0)));
        assertFalse(ShapeUtilities.intersects(area,
                new Rectangle2D.Double(5.0, 1.0, 1.0, 1.0)));
    }
}
