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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCloneNullShape() throws Exception {
        assertNull(ShapeUtilities.clone(null));
    }

    @Test
    public void testCloneLine2D() throws Exception {
        Line2D line = new Line2D.Double(1, 2, 3, 4);
        Shape clonedLine = ShapeUtilities.clone(line);
        assertNotNull(clonedLine);
        assertTrue(clonedLine instanceof Line2D);
        assertNotSame(line, clonedLine);
        assertEquals(line.getP1(), ((Line2D) clonedLine).getP1());
        assertEquals(line.getP2(), ((Line2D) clonedLine).getP2());
    }

    @Test
    public void testCloneRectangle2D() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(1, 2, 3, 4);
        Shape clonedRect = ShapeUtilities.clone(rect);
        assertNotNull(clonedRect);
        assertTrue(clonedRect instanceof Rectangle2D);
        assertNotSame(rect, clonedRect);
        assertEquals(rect, clonedRect);
    }

    @Test
    public void testCloneEllipse2D() throws Exception {
        Ellipse2D ellipse = new Ellipse2D.Double(1, 2, 3, 4);
        Shape clonedEllipse = ShapeUtilities.clone(ellipse);
        assertNotNull(clonedEllipse);
        assertTrue(clonedEllipse instanceof Ellipse2D);
        assertNotSame(ellipse, clonedEllipse);
        assertEquals(ellipse.getFrame(), ((Ellipse2D) clonedEllipse).getFrame());
    }

    @Test
    public void testCloneArc2D() throws Exception {
        Arc2D arc = new Arc2D.Double(1, 2, 3, 4, 90, 90, Arc2D.CHORD);
        Shape clonedArc = ShapeUtilities.clone(arc);
        assertNotNull(clonedArc);
        assertTrue(clonedArc instanceof Arc2D);
        assertNotSame(arc, clonedArc);
        assertEquals(arc.getFrame(), ((Arc2D) clonedArc).getFrame());
        assertEquals(arc.getAngleStart(), ((Arc2D) clonedArc).getAngleStart(), 0.001);
        assertEquals(arc.getAngleExtent(), ((Arc2D) clonedArc).getAngleExtent(), 0.001);
        assertEquals(arc.getArcType(), ((Arc2D) clonedArc).getArcType());
    }

    @Test
    public void testCloneGeneralPath() throws Exception {
        GeneralPath path = new GeneralPath();
        path.moveTo(1, 1);
        path.lineTo(2, 2);
        Shape clonedPath = ShapeUtilities.clone(path);
        assertNotNull(clonedPath);
        assertTrue(clonedPath instanceof GeneralPath);
        assertNotSame(path, clonedPath);
        assertTrue(ShapeUtilities.equal((GeneralPath) clonedPath, path));
    }

    @Test
    public void testEqualNullShapes() throws Exception {
        assertTrue(ShapeUtilities.equal((Shape) null, (Shape) null));
    }

    @Test
    public void testEqualOneNullShape() throws Exception {
        Line2D line = new Line2D.Double(1, 1, 2, 2);
        assertFalse(ShapeUtilities.equal(line, null));
        assertFalse(ShapeUtilities.equal(null, line));
    }

    @Test
    public void testEqualSameLine2D() throws Exception {
        Line2D l1 = new Line2D.Double(1, 2, 3, 4);
        Line2D l2 = new Line2D.Double(1, 2, 3, 4);
        assertTrue(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualDifferentLine2D() throws Exception {
        Line2D l1 = new Line2D.Double(1, 2, 3, 4);
        Line2D l2 = new Line2D.Double(1, 2, 3, 5);
        assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualSameEllipse2D() throws Exception {
        Ellipse2D e1 = new Ellipse2D.Double(1, 2, 3, 4);
        Ellipse2D e2 = new Ellipse2D.Double(1, 2, 3, 4);
        assertTrue(ShapeUtilities.equal(e1, e2));
    }

    @Test
    public void testEqualDifferentEllipse2D() throws Exception {
        Ellipse2D e1 = new Ellipse2D.Double(1, 2, 3, 4);
        Ellipse2D e2 = new Ellipse2D.Double(1, 2, 3, 5);
        assertFalse(ShapeUtilities.equal(e1, e2));
    }

    @Test
    public void testEqualSameArc2D() throws Exception {
        Arc2D a1 = new Arc2D.Double(1, 2, 3, 4, 90, 90, Arc2D.CHORD);
        Arc2D a2 = new Arc2D.Double(1, 2, 3, 4, 90, 90, Arc2D.CHORD);
        assertTrue(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualDifferentArc2DFrame() throws Exception {
        Arc2D a1 = new Arc2D.Double(1, 2, 3, 4, 90, 90, Arc2D.CHORD);
        Arc2D a2 = new Arc2D.Double(1, 2, 3, 5, 90, 90, Arc2D.CHORD);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualDifferentArc2DStartAngle() throws Exception {
        Arc2D a1 = new Arc2D.Double(1, 2, 3, 4, 90, 90, Arc2D.CHORD);
        Arc2D a2 = new Arc2D.Double(1, 2, 3, 4, 89, 90, Arc2D.CHORD);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualDifferentArc2DExtent() throws Exception {
        Arc2D a1 = new Arc2D.Double(1, 2, 3, 4, 90, 90, Arc2D.CHORD);
        Arc2D a2 = new Arc2D.Double(1, 2, 3, 4, 90, 89, Arc2D.CHORD);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualDifferentArc2DType() throws Exception {
        Arc2D a1 = new Arc2D.Double(1, 2, 3, 4, 90, 90, Arc2D.CHORD);
        Arc2D a2 = new Arc2D.Double(1, 2, 3, 4, 90, 90, Arc2D.PIE);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualSamePolygon() throws Exception {
        Polygon p1 = new Polygon(new int[]{0, 1, 0}, new int[]{0, 0, 1}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 0}, new int[]{0, 0, 1}, 3);
        assertTrue(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualDifferentPolygonPoints() throws Exception {
        Polygon p1 = new Polygon(new int[]{0, 1, 0}, new int[]{0, 0, 1}, 3);
        Polygon p2 = new Polygon(new int[]{0, 2, 0}, new int[]{0, 0, 1}, 3);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualDifferentPolygonNPoints() throws Exception {
        Polygon p1 = new Polygon(new int[]{0, 1, 0}, new int[]{0, 0, 1}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 0, 1}, new int[]{0, 0, 1, 1}, 4);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualSameGeneralPath() throws Exception {
        GeneralPath p1 = new GeneralPath();
        p1.moveTo(0, 0);
        p1.lineTo(1, 1);
        GeneralPath p2 = new GeneralPath();
        p2.moveTo(0, 0);
        p2.lineTo(1, 1);
        assertTrue(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualDifferentGeneralPathWindingRule() throws Exception {
        GeneralPath p1 = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        p1.moveTo(0, 0);
        p1.lineTo(1, 1);
        GeneralPath p2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        p2.moveTo(0, 0);
        p2.lineTo(1, 1);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualDifferentGeneralPathSegments() throws Exception {
        GeneralPath p1 = new GeneralPath();
        p1.moveTo(0, 0);
        p1.lineTo(1, 1);
        GeneralPath p2 = new GeneralPath();
        p2.moveTo(0, 0);
        p2.curveTo(1, 1, 2, 2, 3, 3);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testCreateTranslatedShape() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape translatedRect = ShapeUtilities.createTranslatedShape(rect, 5, 5);
        // The createTransformedShape method returns a Shape, not necessarily a Rectangle2D.
        // We check its bounds.
        assertEquals(5.0, translatedRect.getBounds2D().getX(), 0.001);
        assertEquals(5.0, translatedRect.getBounds2D().getY(), 0.001);
        assertEquals(10.0, translatedRect.getBounds2D().getWidth(), 0.001);
        assertEquals(10.0, translatedRect.getBounds2D().getHeight(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeNull() throws Exception {
        ShapeUtilities.createTranslatedShape(null, 1, 1);
    }

    @Test
    public void testCreateTranslatedShapeWithAnchor() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape translatedRect = ShapeUtilities.createTranslatedShape(rect, RectangleAnchor.TOP_LEFT, 5, 5);
        // Similar to the above, check the bounds.
        assertEquals(5.0, translatedRect.getBounds2D().getX(), 0.001);
        assertEquals(5.0, translatedRect.getBounds2D().getY(), 0.001);
        assertEquals(10.0, translatedRect.getBounds2D().getWidth(), 0.001);
        assertEquals(10.0, translatedRect.getBounds2D().getHeight(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeWithAnchorNullShape() throws Exception {
        ShapeUtilities.createTranslatedShape(null, RectangleAnchor.TOP_LEFT, 5, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeWithAnchorNullAnchor() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        ShapeUtilities.createTranslatedShape(rect, null, 5, 5);
    }

    @Test
    public void testRotateShape() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape rotatedRect = ShapeUtilities.rotateShape(rect, Math.PI / 2, 5, 5);
        assertNotNull(rotatedRect);
        // Check that the shape has been transformed.
        // A simple check is that its bounds are different.
        // For a 10x10 rectangle rotated 90 degrees around its center (5,5),
        // the bounds should be the same. However, a non-zero angle should change bounds.
        // Let's use a slightly different angle for testing.
        Shape rotatedRect2 = ShapeUtilities.rotateShape(rect, Math.PI / 4, 5, 5);
        assertFalse(rect.getBounds2D().equals(rotatedRect2.getBounds2D()));
    }

    @Test
    public void testRotateShapeNull() throws Exception {
        assertNull(ShapeUtilities.rotateShape(null, Math.PI / 2, 5, 5));
    }

    @Test
    public void testCreateDiagonalCross() throws Exception {
        Shape cross = ShapeUtilities.createDiagonalCross(10, 2);
        assertTrue(cross instanceof GeneralPath);
        assertFalse(cross.getBounds2D().isEmpty());
    }

    @Test
    public void testCreateRegularCross() throws Exception {
        Shape cross = ShapeUtilities.createRegularCross(10, 2);
        assertTrue(cross instanceof GeneralPath);
        assertFalse(cross.getBounds2D().isEmpty());
    }

    @Test
    public void testCreateDiamond() throws Exception {
        Shape diamond = ShapeUtilities.createDiamond(10);
        assertTrue(diamond instanceof GeneralPath);
        assertFalse(diamond.getBounds2D().isEmpty());
        PathIterator pi = diamond.getPathIterator(null);
        double[] coords = new double[6];
        pi.currentSegment(coords); // moveTo (0, -10)
        assertEquals(0.0, coords[0], 0.001);
        assertEquals(-10.0, coords[1], 0.001);
        pi.next();
        pi.currentSegment(coords); // lineTo (10, 0)
        assertEquals(10.0, coords[0], 0.001);
        assertEquals(0.0, coords[1], 0.001);
        pi.next();
        pi.currentSegment(coords); // lineTo (0, 10)
        assertEquals(0.0, coords[0], 0.001);
        assertEquals(10.0, coords[1], 0.001);
    }

    @Test
    public void testCreateUpTriangle() throws Exception {
        Shape triangle = ShapeUtilities.createUpTriangle(10);
        assertTrue(triangle instanceof GeneralPath);
        assertFalse(triangle.getBounds2D().isEmpty());
        PathIterator pi = triangle.getPathIterator(null);
        double[] coords = new double[6];
        pi.currentSegment(coords); // moveTo (0, -10)
        assertEquals(0.0, coords[0], 0.001);
        assertEquals(-10.0, coords[1], 0.001);
        pi.next();
        pi.currentSegment(coords); // lineTo (10, 10)
        assertEquals(10.0, coords[0], 0.001);
        assertEquals(10.0, coords[1], 0.001);
    }

    @Test
    public void testCreateDownTriangle() throws Exception {
        Shape triangle = ShapeUtilities.createDownTriangle(10);
        assertTrue(triangle instanceof GeneralPath);
        assertFalse(triangle.getBounds2D().isEmpty());
        PathIterator pi = triangle.getPathIterator(null);
        double[] coords = new double[6];
        pi.currentSegment(coords); // moveTo (0, 10)
        assertEquals(0.0, coords[0], 0.001);
        assertEquals(10.0, coords[1], 0.001);
        pi.next();
        pi.currentSegment(coords); // lineTo (10, -10)
        assertEquals(10.0, coords[0], 0.001);
        assertEquals(-10.0, coords[1], 0.001);
    }

    @Test
    public void testCreateLineRegionHorizontal() throws Exception {
        Line2D line = new Line2D.Double(0, 0, 10, 0);
        Shape region = ShapeUtilities.createLineRegion(line, 2);
        assertTrue(region instanceof GeneralPath);
        Rectangle2D bounds = region.getBounds2D();
        // The calculation for dx and dy depends on Math.atan and Math.sin/cos.
        // For horizontal line, theta = 0, dx = 0, dy = width.
        // moveTo(x1 - dx, y1 + dy) -> (0, 2)
        // lineTo(x1 + dx, y1 - dy) -> (0, -2)
        // lineTo(x2 + dx, y2 - dy) -> (10, -2)
        // lineTo(x2 - dx, y2 + dy) -> (10, 2)
        // The resulting shape is a rectangle from (0, -2) to (10, 2).
        assertEquals(0.0, bounds.getMinX(), 0.001);
        assertEquals(-2.0, bounds.getMinY(), 0.001);
        assertEquals(10.0, bounds.getMaxX(), 0.001);
        assertEquals(2.0, bounds.getMaxY(), 0.001);
    }

    @Test
    public void testCreateLineRegionVertical() throws Exception {
        Line2D line = new Line2D.Double(0, 0, 0, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 2);
        assertTrue(region instanceof GeneralPath);
        // For vertical line, x2-x1 is 0. It enters the else block.
        // moveTo(x1 - width / 2.0f, y1) -> (-1, 0)
        // lineTo(x1 + width / 2.0f, y1) -> (1, 0)
        // lineTo(x2 + width / 2.0f, y2) -> (1, 10)
        // lineTo(x2 - width / 2.0f, y2) -> (-1, 10)
        // The resulting shape is a rectangle from (-1, 0) to (1, 10).
        Rectangle2D bounds = region.getBounds2D();
        assertEquals(-1.0, bounds.getMinX(), 0.001);
        assertEquals(0.0, bounds.getMinY(), 0.001);
        assertEquals(1.0, bounds.getMaxX(), 0.001);
        assertEquals(10.0, bounds.getMaxY(), 0.001);
    }

    @Test
    public void testCreateLineRegionDiagonal() throws Exception {
        Line2D line = new Line2D.Double(0, 0, 10, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 2);
        assertTrue(region instanceof GeneralPath);
        assertFalse(region.getBounds2D().isEmpty());
    }

    @Test
    public void testGetPointInRectangleCenter() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(5, 5, rect);
        assertEquals(5, p.getX(), 0.001);
        assertEquals(5, p.getY(), 0.001);
    }

    @Test
    public void testGetPointInRectangleOutsideXMin() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(-5, 5, rect);
        assertEquals(0, p.getX(), 0.001);
        assertEquals(5, p.getY(), 0.001);
    }

    @Test
    public void testGetPointInRectangleOutsideXMax() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(15, 5, rect);
        assertEquals(10, p.getX(), 0.001);
        assertEquals(5, p.getY(), 0.001);
    }

    @Test
    public void testGetPointInRectangleOutsideYMin() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(5, -5, rect);
        assertEquals(5, p.getX(), 0.001);
        assertEquals(0, p.getY(), 0.001);
    }

    @Test
    public void testGetPointInRectangleOutsideYMax() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(5, 15, rect);
        assertEquals(5, p.getX(), 0.001);
        assertEquals(10, p.getY(), 0.001);
    }

    @Test
    public void testGetPointInRectangleCorner() throws Exception {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(10, 10, rect);
        assertEquals(10, p.getX(), 0.001);
        assertEquals(10, p.getY(), 0.001);
    }

    @Test
    public void testContainsTrue() throws Exception {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(2, 2, 5, 5);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContainsFalse() throws Exception {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(5, 5, 10, 10);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContainsZeroWidthHeight() throws Exception {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(5, 5, 0, 0);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testIntersectsTrue() throws Exception {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(5, 5, 10, 10);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersectsFalse() throws Exception {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(11, 11, 5, 5);
        assertFalse(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersectsTouchingEdge() throws Exception {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 5, 5, 5);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersectsContained() throws Exception {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(2, 2, 5, 5);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }
}
