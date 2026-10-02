package org.jfree.chart.util;

import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for the {@link ShapeList} class.
 */
public class ShapeListAI6Test {

    /**
     * Tests setShape and getShape methods with various indices.
     */
    @Test
    public void testSetAndGetShape() {
        ShapeList list = new ShapeList();
        Assert.assertNull(list.getShape(0));

        Rectangle2D rect0 = new Rectangle2D.Double(0.0, 0.0, 10.0, 10.0);
        Line2D line2 = new Line2D.Double(0.0, 0.0, 5.0, 5.0);

        list.setShape(0, rect0);
        list.setShape(2, line2);

        Assert.assertEquals(rect0, list.getShape(0));
        Assert.assertNull(list.getShape(1));
        Assert.assertEquals(line2, list.getShape(2));
    }

    /**
     * Tests the equals method for basic equality, symmetry, and edge cases.
     */
    @Test
    public void testEquals() {
        ShapeList l1 = new ShapeList();
        ShapeList l2 = new ShapeList();

        Assert.assertTrue(l1.equals(l1));
        Assert.assertTrue(l1.equals(l2));
        Assert.assertFalse(l1.equals(null));
        Assert.assertFalse(l1.equals("Not a ShapeList"));

        Rectangle2D rect1 = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        Rectangle2D rect2 = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);

        l1.setShape(0, rect1);
        Assert.assertFalse(l1.equals(l2));

        l2.setShape(0, rect2);
        Assert.assertTrue(l1.equals(l2));
        Assert.assertTrue(l2.equals(l1));

        l1.setShape(1, new Rectangle2D.Double(0, 0, 10, 10));
        l2.setShape(1, new Rectangle2D.Double(0, 0, 10, 10));
        Assert.assertTrue(l1.equals(l2));

        l2.setShape(1, new Rectangle2D.Double(0, 0, 20, 20));
        Assert.assertFalse(l1.equals(l2));
    }

    /**
     * Tests equals when elements differ at identical positions.
     */
    @Test
    public void testEqualsDifferentElements() {
        ShapeList l1 = new ShapeList();
        ShapeList l2 = new ShapeList();

        l1.setShape(0, new Rectangle(0, 0, 5, 5));
        l1.setShape(1, new Rectangle(1, 1, 5, 5));

        l2.setShape(0, new Rectangle(0, 0, 5, 5));
        l2.setShape(1, new Rectangle(2, 2, 5, 5));

        Assert.assertFalse(l1.equals(l2));
        Assert.assertFalse(l2.equals(l1));
    }

    /**
     * Tests hashCode consistency with equals.
     */
    @Test
    public void testHashCode() {
        ShapeList l1 = new ShapeList();
        ShapeList l2 = new ShapeList();
        Assert.assertEquals(l1.hashCode(), l2.hashCode());

        l1.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        l2.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        Assert.assertEquals(l1.hashCode(), l2.hashCode());
    }

    /**
     * Tests cloning functionality and verifies independence of the clone.
     */
    @Test
    public void testCloning() throws CloneNotSupportedException {
        ShapeList l1 = new ShapeList();
        l1.setShape(0, new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        l1.setShape(2, new Line2D.Double(1.0, 2.0, 3.0, 4.0));

        ShapeList l2 = (ShapeList) l1.clone();
        Assert.assertNotSame(l1, l2);
        Assert.assertSame(l1.getClass(), l2.getClass());
        Assert.assertEquals(l1, l2);

        l1.setShape(0, new Rectangle2D.Double(9.0, 9.0, 9.0, 9.0));
        Assert.assertFalse(l1.equals(l2));
    }

    /**
     * Tests serialization of an empty ShapeList.
     */
    @Test
    public void testSerializationEmpty() throws Exception {
        ShapeList l1 = new ShapeList();

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(l1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList l2 = (ShapeList) in.readObject();
        in.close();

        Assert.assertEquals(l1, l2);
    }

    /**
     * Tests serialization of a ShapeList containing shapes and null entries.
     */
    @Test
    public void testSerializationPopulated() throws Exception {
        ShapeList l1 = new ShapeList();
        l1.setShape(0, new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0));
        l1.setShape(1, null);
        l1.setShape(2, new Line2D.Double(1.0, 2.0, 3.0, 4.0));
        l1.setShape(4, new Rectangle2D.Double(5.0, 5.0, 15.0, 15.0));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(l1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ShapeList l2 = (ShapeList) in.readObject();
        in.close();

        Assert.assertEquals(l1, l2);
        Assert.assertEquals(new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0), l2.getShape(0));
        Assert.assertNull(l2.getShape(1));
        Assert.assertTrue(ShapeUtilities.equal(new Line2D.Double(1.0, 2.0, 3.0, 4.0), l2.getShape(2)));
        Assert.assertNull(l2.getShape(3));
        Assert.assertEquals(new Rectangle2D.Double(5.0, 5.0, 15.0, 15.0), l2.getShape(4));
    }
}
