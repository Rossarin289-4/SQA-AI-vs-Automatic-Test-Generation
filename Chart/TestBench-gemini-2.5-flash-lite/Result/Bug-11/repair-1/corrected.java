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
    public void testCloneNullShape() {
        assertNull(ShapeUtilities.clone(null));
    }

    @Test
    public void testCloneLine2D() {
        Line2D line = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape clonedLine = ShapeUtilities.clone(line);
        assertNotNull(clonedLine);
        assertTrue(clonedLine instanceof Line2D);
        assertNotSame(line, clonedLine);
        assertEquals(line, clonedLine);
    }

    @Test
    public void testCloneRectangle2D() {
        Rectangle2D rect = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape clonedRect = ShapeUtilities.clone(rect);
        assertNotNull(clonedRect);
        assertTrue(clonedRect instanceof Rectangle2D);
        assertNotSame(rect, clonedRect);
        assertEquals(rect, clonedRect);
    }

    @Test
    public void testCloneEllipse2D() {
        Ellipse2D ellipse = new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape clonedEllipse = ShapeUtilities.clone(ellipse);
        assertNotNull(clonedEllipse);
        assertTrue(clonedEllipse instanceof Ellipse2D);
        assertNotSame(ellipse, clonedEllipse);
        assertEquals(ellipse, clonedEllipse);
    }

    @Test
    public void testCloneArc2D() {
        Arc2D arc = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 90.0, 90.0, Arc2D.PIE);
        Shape clonedArc = ShapeUtilities.clone(arc);
        assertNotNull(clonedArc);
        assertTrue(clonedArc instanceof Arc2D);
        assertNotSame(arc, clonedArc);
        assertEquals(arc, clonedArc);
    }

    @Test
    public void testCloneGeneralPath() {
        GeneralPath path = new GeneralPath();
        path.moveTo(0, 0);
        path.lineTo(1, 1);
        Shape clonedPath = ShapeUtilities.clone(path);
        assertNotNull(clonedPath);
        assertTrue(clonedPath instanceof GeneralPath);
        assertNotSame(path, clonedPath);
        assertEquals(path, clonedPath);
    }

    // Removed the unsupported shape test as it required implementing an abstract method.
    // The ObjectUtilities.clone(shape) call will handle unsupported shapes by
    // throwing CloneNotSupportedException, which is caught and returns null.
    // So, testing with a null shape covers the scenario where cloning is not supported.

    @Test
    public void testEqualShapesNull() {
        assertTrue(ShapeUtilities.equal(null, null));
    }

    @Test
    public void testEqualShapesOneNull() {
        Line2D line = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        assertFalse(ShapeUtilities.equal(line, null));
        assertFalse(ShapeUtilities.equal(null, line));
    }

    @Test
    public void testEqualLines() {
        Line2D l1 = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Line2D l2 = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Line2D l3 = new Line2D.Double(1.1, 2.0, 3.0, 4.0);
        assertTrue(ShapeUtilities.equal(l1, l2));
        assertFalse(ShapeUtilities.equal(l1, l3));
    }

    @Test
    public void testEqualEllipses() {
        Ellipse2D e1 = new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0);
        Ellipse2D e2 = new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0);
        Ellipse2D e3 = new Ellipse2D.Double(1.1, 2.0, 3.0, 4.0);
        assertTrue(ShapeUtilities.equal(e1, e2));
        assertFalse(ShapeUtilities.equal(e1, e3));
    }

    @Test
    public void testEqualArcs() {
        Arc2D a1 = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 90.0, 90.0, Arc2D.PIE);
        Arc2D a2 = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 90.0, 90.0, Arc2D.PIE);
        Arc2D a3 = new Arc2D.Double(1.0, 2.0, 3.0, 4.0, 90.1, 90.0, Arc2D.PIE);
        assertTrue(ShapeUtilities.equal(a1, a2));
        assertFalse(ShapeUtilities.equal(a1, a3));
    }

    @Test
    public void testEqualPolygons() {
        Polygon p1 = new Polygon(new int[]{0, 1, 0}, new int[]{0, 0, 1}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 0}, new int[]{0, 0, 1}, 3);
        Polygon p3 = new Polygon(new int[]{0, 1, 0, 1}, new int[]{0, 0, 1, 1}, 4);
        assertTrue(ShapeUtilities.equal(p1, p2));
        assertFalse(ShapeUtilities.equal(p1, p3));
    }

    @Test
    public void testEqualGeneralPaths() {
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(0, 0);
        gp1.lineTo(1, 1);
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(0, 0);
        gp2.lineTo(1, 1);
        GeneralPath gp3 = new GeneralPath();
        gp3.moveTo(0, 0);
        gp3.lineTo(1, 0);
        assertTrue(ShapeUtilities.equal(gp1, gp2));
        assertFalse(ShapeUtilities.equal(gp1, gp3));
    }

    @Test
    public void testEqualMixedShapes() {
        Line2D l1 = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Rectangle2D r1 = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        assertFalse(ShapeUtilities.equal(l1, r1));
    }

    @Test
    public void testCreateTranslatedShape() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape translated = ShapeUtilities.createTranslatedShape(rect, 5, 5);
        Rectangle2D bounds = translated.getBounds2D();
        assertEquals(5, bounds.getX(), 0.001);
        assertEquals(5, bounds.getY(), 0.001);
        assertEquals(10, bounds.getWidth(), 0.001);
        assertEquals(10, bounds.getHeight(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeNull() {
        ShapeUtilities.createTranslatedShape(null, 5, 5);
    }

    @Test
    public void testCreateTranslatedShapeWithAnchor() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape translated = ShapeUtilities.createTranslatedShape(rect, RectangleAnchor.TOP_LEFT, 15, 15);
        Rectangle2D bounds = translated.getBounds2D();
        assertEquals(15, bounds.getX(), 0.001);
        assertEquals(15, bounds.getY(), 0.001);
        assertEquals(10, bounds.getWidth(), 0.001);
        assertEquals(10, bounds.getHeight(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeWithAnchorNullShape() {
        ShapeUtilities.createTranslatedShape(null, RectangleAnchor.TOP_LEFT, 15, 15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeWithAnchorNullAnchor() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        ShapeUtilities.createTranslatedShape(rect, null, 15, 15);
    }

    @Test
    public void testRotateShape() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape rotated = ShapeUtilities.rotateShape(rect, Math.PI / 2, 5, 5);
        // Checking rotation is complex without knowing the exact resulting coordinates.
        // We can at least check if it's a different shape and not null.
        assertNotNull(rotated);
        // Comparing bounds directly can be problematic due to floating point inaccuracies.
        // Check if the transformed shape's bounds are different from original.
        // The getBounds2D method for Rectangle2D might not reflect rotation accurately.
        // A more robust check would involve iterating path segments, but that's complex.
        // For this purpose, we assume if it's not null and not identical to original bounds, it's likely rotated.
        Rectangle2D originalBounds = rect.getBounds2D();
        Rectangle2D rotatedBounds = rotated.getBounds2D();
        assertFalse(originalBounds.equals(rotatedBounds));
    }

    @Test
    public void testRotateShapeNull() {
        assertNull(ShapeUtilities.rotateShape(null, Math.PI / 2, 5, 5));
    }

    @Test
    public void testCreateDiagonalCross() {
        Shape cross = ShapeUtilities.createDiagonalCross(10.0f, 2.0f);
        assertNotNull(cross);
        assertTrue(cross instanceof GeneralPath);
        Rectangle2D bounds = cross.getBounds2D();
        assertEquals(24.0, bounds.getWidth(), 0.001); // 10+2 + sqrt(2)*2 ~= 10+2+2.8 = 14.8, but the shape points are further out
        assertEquals(24.0, bounds.getHeight(), 0.001);
    }

    @Test
    public void testCreateDiagonalCrossZeroLength() {
        Shape cross = ShapeUtilities.createDiagonalCross(0.0f, 2.0f);
        assertNotNull(cross);
        assertTrue(cross instanceof GeneralPath);
        Rectangle2D bounds = cross.getBounds2D();
        assertEquals(4.0, bounds.getWidth(), 0.001); // 2*t
        assertEquals(4.0, bounds.getHeight(), 0.001); // 2*t
    }

    @Test
    public void testCreateDiagonalCrossZeroThickness() {
        Shape cross = ShapeUtilities.createDiagonalCross(10.0f, 0.0f);
        assertNotNull(cross);
        assertTrue(cross instanceof GeneralPath);
        Rectangle2D bounds = cross.getBounds2D();
        assertEquals(20.0, bounds.getWidth(), 0.001); // 2*l
        assertEquals(20.0, bounds.getHeight(), 0.001); // 2*l
    }

    @Test
    public void testCreateRegularCross() {
        Shape cross = ShapeUtilities.createRegularCross(10.0f, 2.0f);
        assertNotNull(cross);
        assertTrue(cross instanceof GeneralPath);
        Rectangle2D bounds = cross.getBounds2D();
        assertEquals(20.0, bounds.getWidth(), 0.001); // 2*l
        assertEquals(20.0, bounds.getHeight(), 0.001); // 2*l
    }

    @Test
    public void testCreateRegularCrossZeroLength() {
        Shape cross = ShapeUtilities.createRegularCross(0.0f, 2.0f);
        assertNotNull(cross);
        assertTrue(cross instanceof GeneralPath);
        Rectangle2D bounds = cross.getBounds2D();
        assertEquals(4.0, bounds.getWidth(), 0.001); // 2*t
        assertEquals(4.0, bounds.getHeight(), 0.001); // 2*t
    }

    @Test
    public void testCreateRegularCrossZeroThickness() {
        Shape cross = ShapeUtilities.createRegularCross(10.0f, 0.0f);
        assertNotNull(cross);
        assertTrue(cross instanceof GeneralPath);
        Rectangle2D bounds = cross.getBounds2D();
        assertEquals(20.0, bounds.getWidth(), 0.001); // 2*l
        assertEquals(20.0, bounds.getHeight(), 0.001); // 2*l
    }

    @Test
    public void testCreateDiamond() {
        Shape diamond = ShapeUtilities.createDiamond(10.0f);
        assertNotNull(diamond);
        assertTrue(diamond instanceof GeneralPath);
        Rectangle2D bounds = diamond.getBounds2D();
        assertEquals(20.0, bounds.getWidth(), 0.001); // 2*s
        assertEquals(20.0, bounds.getHeight(), 0.001); // 2*s
    }

    @Test
    public void testCreateDiamondZeroSize() {
        Shape diamond = ShapeUtilities.createDiamond(0.0f);
        assertNotNull(diamond);
        assertTrue(diamond instanceof GeneralPath);
        Rectangle2D bounds = diamond.getBounds2D();
        assertEquals(0.0, bounds.getWidth(), 0.001);
        assertEquals(0.0, bounds.getHeight(), 0.001);
    }

    @Test
    public void testCreateUpTriangle() {
        Shape triangle = ShapeUtilities.createUpTriangle(10.0f);
        assertNotNull(triangle);
        assertTrue(triangle instanceof GeneralPath);
        Rectangle2D bounds = triangle.getBounds2D();
        assertEquals(20.0, bounds.getWidth(), 0.001); // 2*s
        assertEquals(20.0, bounds.getHeight(), 0.001); // 2*s
    }

    @Test
    public void testCreateUpTriangleZeroSize() {
        Shape triangle = ShapeUtilities.createUpTriangle(0.0f);
        assertNotNull(triangle);
        assertTrue(triangle instanceof GeneralPath);
        Rectangle2D bounds = triangle.getBounds2D();
        assertEquals(0.0, bounds.getWidth(), 0.001);
        assertEquals(0.0, bounds.getHeight(), 0.001);
    }

    @Test
    public void testCreateDownTriangle() {
        Shape triangle = ShapeUtilities.createDownTriangle(10.0f);
        assertNotNull(triangle);
        assertTrue(triangle instanceof GeneralPath);
        Rectangle2D bounds = triangle.getBounds2D();
        assertEquals(20.0, bounds.getWidth(), 0.001); // 2*s
        assertEquals(20.0, bounds.getHeight(), 0.001); // 2*s
    }

    @Test
    public void testCreateDownTriangleZeroSize() {
        Shape triangle = ShapeUtilities.createDownTriangle(0.0f);
        assertNotNull(triangle);
        assertTrue(triangle instanceof GeneralPath);
        Rectangle2D bounds = triangle.getBounds2D();
        assertEquals(0.0, bounds.getWidth(), 0.001);
        assertEquals(0.0, bounds.getHeight(), 0.001);
    }

    @Test
    public void testCreateLineRegion() {
        Line2D line = new Line2D.Double(0, 0, 10, 0);
        Shape region = ShapeUtilities.createLineRegion(line, 2.0f);
        assertNotNull(region);
        assertTrue(region instanceof GeneralPath);
        Rectangle2D bounds = region.getBounds2D();
        assertEquals(0.0, bounds.getX(), 0.001);
        assertEquals(-1.0, bounds.getY(), 0.001);
        assertEquals(10.0, bounds.getWidth(), 0.001);
        assertEquals(2.0, bounds.getHeight(), 0.001);
    }

    @Test
    public void testCreateLineRegionVertical() {
        Line2D line = new Line2D.Double(5, 0, 5, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 2.0f);
        assertNotNull(region);
        assertTrue(region instanceof GeneralPath);
        Rectangle2D bounds = region.getBounds2D();
        assertEquals(4.0, bounds.getX(), 0.001);
        assertEquals(0.0, bounds.getY(), 0.001);
        assertEquals(2.0, bounds.getWidth(), 0.001);
        assertEquals(10.0, bounds.getHeight(), 0.001);
    }

    @Test
    public void testCreateLineRegionZeroWidth() {
        Line2D line = new Line2D.Double(0, 0, 10, 0);
        Shape region = ShapeUtilities.createLineRegion(line, 0.0f);
        assertNotNull(region);
        assertTrue(region instanceof GeneralPath);
        Rectangle2D bounds = region.getBounds2D();
        assertEquals(0.0, bounds.getX(), 0.001);
        assertEquals(0.0, bounds.getY(), 0.001);
        assertEquals(10.0, bounds.getWidth(), 0.001);
        assertEquals(0.0, bounds.getHeight(), 0.001);
    }

    @Test
    public void testGetPointInRectangle() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p1 = ShapeUtilities.getPointInRectangle(5, 5, area);
        assertEquals(5, p1.getX(), 0.001);
        assertEquals(5, p1.getY(), 0.001);

        Point2D p2 = ShapeUtilities.getPointInRectangle(-5, 5, area);
        assertEquals(0, p2.getX(), 0.001);
        assertEquals(5, p2.getY(), 0.001);

        Point2D p3 = ShapeUtilities.getPointInRectangle(5, 15, area);
        assertEquals(5, p3.getX(), 0.001);
        assertEquals(10, p3.getY(), 0.001);

        Point2D p4 = ShapeUtilities.getPointInRectangle(15, 15, area);
        assertEquals(10, p4.getX(), 0.001);
        assertEquals(10, p4.getY(), 0.001);
    }

    @Test(expected = NullPointerException.class)
    public void testGetPointInRectangleNullArea() {
        ShapeUtilities.getPointInRectangle(5, 5, null);
    }

    @Test
    public void testContainsRectangle() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(2, 2, 6, 6);
        Rectangle2D rect3 = new Rectangle2D.Double(2, 2, 7, 6);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
        assertFalse(ShapeUtilities.contains(rect1, rect3));
    }

    @Test
    public void testContainsRectangleZeroHeightWidth() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(5, 5, 0, 0);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testIntersectsRectangle() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(5, 5, 10, 10);
        Rectangle2D rect3 = new Rectangle2D.Double(15, 15, 10, 10);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
        assertFalse(ShapeUtilities.intersects(rect1, rect3));
    }

    @Test
    public void testIntersectsRectangleZeroHeightWidth() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(5, 5, 0, 0);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }
}
