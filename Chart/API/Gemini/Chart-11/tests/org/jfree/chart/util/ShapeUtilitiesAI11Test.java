package org.jfree.chart.util;

import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.junit.Assert;
import org.junit.Test;

public class ShapeUtilitiesAI11Test {

    @Test
    public void testEqualLine2D() {
        Line2D l1 = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Line2D l2 = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Line2D l3 = new Line2D.Double(1.0, 2.0, 3.0, 5.0);

        Assert.assertTrue(ShapeUtilities.equal(l1, l2));
        Assert.assertTrue(ShapeUtilities.equal((Line2D) null, (Line2D) null));
        Assert.assertFalse(ShapeUtilities.equal(l1, null));
        Assert.assertFalse(ShapeUtilities.equal(null, l1));
        Assert.assertFalse(ShapeUtilities.equal(l1, l3));
        Assert.assertTrue(ShapeUtilities.equal((Shape) l1, (Shape) l2));
    }

    @Test
    public void testEqualEllipse2D() {
        Ellipse2D e1 = new Ellipse2D.Double(1.0, 2.0, 10.0, 20.0);
        Ellipse2D e2 = new Ellipse2D.Double(1.0, 2.0, 10.0, 20.0);
        Ellipse2D e3 = new Ellipse2D.Double(1.0, 2.0, 10.0, 21.0);

        Assert.assertTrue(ShapeUtilities.equal(e1, e2));
        Assert.assertTrue(ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null));
        Assert.assertFalse(ShapeUtilities.equal(e1, null));
        Assert.assertFalse(ShapeUtilities.equal(null, e1));
        Assert.assertFalse(ShapeUtilities.equal(e1, e3));
        Assert.assertTrue(ShapeUtilities.equal((Shape) e1, (Shape) e2));
    }

    @Test
    public void testEqualArc2D() {
        Arc2D a1 = new Arc2D.Double(1.0, 2.0, 10.0, 20.0, 0.0, 90.0, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(1.0, 2.0, 10.0, 20.0, 0.0, 90.0, Arc2D.OPEN);
        Arc2D a3 = new Arc2D.Double(1.0, 2.0, 10.0, 20.0, 0.0, 90.0, Arc2D.CHORD);
        Arc2D a4 = new Arc2D.Double(1.0, 2.0, 10.0, 20.0, 5.0, 90.0, Arc2D.OPEN);
        Arc2D a5 = new Arc2D.Double(1.0, 2.0, 10.0, 20.0, 0.0, 95.0, Arc2D.OPEN);
        Arc2D a6 = new Arc2D.Double(2.0, 2.0, 10.0, 20.0, 0.0, 90.0, Arc2D.OPEN);

        Assert.assertTrue(ShapeUtilities.equal(a1, a2));
        Assert.assertTrue(ShapeUtilities.equal((Arc2D) null, (Arc2D) null));
        Assert.assertFalse(ShapeUtilities.equal(a1, null));
        Assert.assertFalse(ShapeUtilities.equal(null, a1));
        Assert.assertFalse(ShapeUtilities.equal(a1, a3));
        Assert.assertFalse(ShapeUtilities.equal(a1, a4));
        Assert.assertFalse(ShapeUtilities.equal(a1, a5));
        Assert.assertFalse(ShapeUtilities.equal(a1, a6));
        Assert.assertTrue(ShapeUtilities.equal((Shape) a1, (Shape) a2));
    }

    @Test
    public void testEqualPolygon() {
        Polygon p1 = new Polygon(new int[]{1, 2, 3}, new int[]{4, 5, 6}, 3);
        Polygon p2 = new Polygon(new int[]{1, 2, 3}, new int[]{4, 5, 6}, 3);
        Polygon p3 = new Polygon(new int[]{1, 2}, new int[]{4, 5}, 2);
        Polygon p4 = new Polygon(new int[]{1, 9, 3}, new int[]{4, 5, 6}, 3);
        Polygon p5 = new Polygon(new int[]{1, 2, 3}, new int[]{4, 9, 6}, 3);

        Assert.assertTrue(ShapeUtilities.equal(p1, p2));
        Assert.assertTrue(ShapeUtilities.equal((Polygon) null, (Polygon) null));
        Assert.assertFalse(ShapeUtilities.equal(p1, null));
        Assert.assertFalse(ShapeUtilities.equal(null, p1));
        Assert.assertFalse(ShapeUtilities.equal(p1, p3));
        Assert.assertFalse(ShapeUtilities.equal(p1, p4));
        Assert.assertFalse(ShapeUtilities.equal(p1, p5));
        Assert.assertTrue(ShapeUtilities.equal((Shape) p1, (Shape) p2));
    }

    @Test
    public void testEqualGeneralPath() {
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(1.0f, 2.0f);
        gp1.lineTo(3.0f, 4.0f);

        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(1.0f, 2.0f);
        gp2.lineTo(3.0f, 4.0f);

        GeneralPath gp3 = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp3.moveTo(1.0f, 2.0f);
        gp3.lineTo(3.0f, 4.0f);

        GeneralPath gp4 = new GeneralPath();
        gp4.moveTo(1.0f, 2.0f);
        gp4.lineTo(3.0f, 5.0f);

        GeneralPath gp5 = new GeneralPath();
        gp5.moveTo(1.0f, 2.0f);

        Assert.assertTrue(ShapeUtilities.equal(gp1, gp2));
        Assert.assertTrue(ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null));
        Assert.assertFalse(ShapeUtilities.equal(gp1, null));
        Assert.assertFalse(ShapeUtilities.equal(null, gp1));
        Assert.assertFalse(ShapeUtilities.equal(gp1, gp3));
        Assert.assertFalse(ShapeUtilities.equal(gp1, gp4));
        Assert.assertFalse(ShapeUtilities.equal(gp1, gp5));
        Assert.assertTrue(ShapeUtilities.equal((Shape) gp1, (Shape) gp2));
    }

    @Test
    public void testClone() {
        Line2D line = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape clonedLine = ShapeUtilities.clone(line);
        Assert.assertNotNull(clonedLine);
        Assert.assertNotSame(line, clonedLine);
        Assert.assertTrue(ShapeUtilities.equal(line, clonedLine));

        Assert.assertNull(ShapeUtilities.clone(null));
    }

    @Test
    public void testCreateTranslatedShape() {
        Rectangle2D rect = new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0);
        Shape translated = ShapeUtilities.createTranslatedShape(rect, 5.0, -10.0);
        Rectangle2D bounds = translated.getBounds2D();
        Assert.assertEquals(15.0, bounds.getX(), 1e-6);
        Assert.assertEquals(10.0, bounds.getY(), 1e-6);
        Assert.assertEquals(30.0, bounds.getWidth(), 1e-6);
        Assert.assertEquals(40.0, bounds.getHeight(), 1e-6);

        Shape anchored = ShapeUtilities.createTranslatedShape(
                rect, RectangleAnchor.CENTER, 100.0, 200.0);
        Rectangle2D anchorBounds = anchored.getBounds2D();
        Assert.assertEquals(85.0, anchorBounds.getX(), 1e-6);
        Assert.assertEquals(180.0, anchorBounds.getY(), 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeNullShape() {
        ShapeUtilities.createTranslatedShape(null, 1.0, 1.0);
    }

    @Test
    public void testRotateShape() {
        Rectangle2D rect = new Rectangle2D.Double(0.0, 0.0, 10.0, 20.0);
        Shape rotated = ShapeUtilities.rotateShape(rect, Math.PI / 2.0, 0.0f, 0.0f);
        Assert.assertNotNull(rotated);
        Assert.assertNull(ShapeUtilities.rotateShape(null, Math.PI, 0.0f, 0.0f));
    }

    @Test
    public void testPredefinedShapesCreation() {
        Assert.assertNotNull(ShapeUtilities.createDiagonalCross(5.0f, 1.0f));
        Assert.assertNotNull(ShapeUtilities.createRegularCross(5.0f, 1.0f));
        Assert.assertNotNull(ShapeUtilities.createDiamond(5.0f));
        Assert.assertNotNull(ShapeUtilities.createUpTriangle(5.0f));
        Assert.assertNotNull(ShapeUtilities.createDownTriangle(5.0f));

        Line2D line = new Line2D.Double(0.0, 0.0, 10.0, 10.0);
        Assert.assertNotNull(ShapeUtilities.createLineRegion(line, 2.0f));

        Line2D vLine = new Line2D.Double(5.0, 0.0, 5.0, 10.0);
        Assert.assertNotNull(ShapeUtilities.createLineRegion(vLine, 2.0f));
    }

    @Test
    public void testGetPointInRectangle() {
        Rectangle2D rect = new Rectangle2D.Double(10.0, 20.0, 50.0, 60.0);
        Point2D inside = ShapeUtilities.getPointInRectangle(25.0, 35.0, rect);
        Assert.assertEquals(25.0, inside.getX(), 1e-6);
        Assert.assertEquals(35.0, inside.getY(), 1e-6);

        Point2D outsideMin = ShapeUtilities.getPointInRectangle(5.0, 10.0, rect);
        Assert.assertEquals(10.0, outsideMin.getX(), 1e-6);
        Assert.assertEquals(20.0, outsideMin.getY(), 1e-6);

        Point2D outsideMax = ShapeUtilities.getPointInRectangle(100.0, 100.0, rect);
        Assert.assertEquals(60.0, outsideMax.getX(), 1e-6);
        Assert.assertEquals(80.0, outsideMax.getY(), 1e-6);
    }

    @Test
    public void testContainsAndIntersects() {
        Rectangle2D rect1 = new Rectangle2D.Double(10.0, 10.0, 20.0, 20.0);
        Rectangle2D rectInside = new Rectangle2D.Double(12.0, 12.0, 5.0, 5.0);
        Rectangle2D rectOverlap = new Rectangle2D.Double(20.0, 20.0, 20.0, 20.0);
        Rectangle2D rectOutside = new Rectangle2D.Double(40.0, 40.0, 10.0, 10.0);

        Assert.assertTrue(ShapeUtilities.contains(rect1, rectInside));
        Assert.assertFalse(ShapeUtilities.contains(rect1, rectOverlap));
        Assert.assertFalse(ShapeUtilities.contains(rect1, rectOutside));

        Assert.assertTrue(ShapeUtilities.intersects(rect1, rectInside));
        Assert.assertTrue(ShapeUtilities.intersects(rect1, rectOverlap));
        Assert.assertFalse(ShapeUtilities.intersects(rect1, rectOutside));
    }
}
