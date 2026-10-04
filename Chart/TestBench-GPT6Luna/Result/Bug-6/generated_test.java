package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Shape;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ShapeListTest {
    @Test
    public void testEmptyListSizeAndMissingShape() throws Exception {
        ShapeList list = new ShapeList();
        assertEquals(0, list.size());
        assertNull(list.getShape(0));
    }

    @Test
    public void testSetAndGetShapeAtZero() throws Exception {
        ShapeList list = new ShapeList();
        Shape shape = new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4);
        list.setShape(0, shape);
        assertSame(shape, list.getShape(0));
    }

    @Test
    public void testSetExpandsToLastIndex() throws Exception {
        ShapeList list = new ShapeList();
        Shape shape = new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4);
        list.setShape(7, shape);
        assertEquals(8, list.size());
        assertSame(shape, list.getShape(7));
    }

    @Test
    public void testSetExpandsBeyondInitialCapacity() throws Exception {
        ShapeList list = new ShapeList();
        Shape shape = new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4);
        list.setShape(8, shape);
        assertEquals(9, list.size());
        assertSame(shape, list.getShape(8));
    }

    @Test
    public void testSetOverwritesExistingShape() throws Exception {
        ShapeList list = new ShapeList();
        Shape first = new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4);
        Shape second = new java.awt.geom.Rectangle2D.Double(5, 6, 7, 8);
        list.setShape(0, first);
        list.setShape(0, second);
        assertSame(second, list.getShape(0));
        assertEquals(1, list.size());
    }

    @Test
    public void testSetNullAtIndex() throws Exception {
        ShapeList list = new ShapeList();
        Shape shape = new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4);
        list.setShape(0, shape);
        list.setShape(0, null);
        assertNull(list.getShape(0));
        assertEquals(1, list.size());
    }

    @Test
    public void testEqualsSelf() throws Exception {
        ShapeList list = new ShapeList();
        assertTrue(list.equals(list));
    }

    @Test
    public void testEqualsNull() throws Exception {
        ShapeList list = new ShapeList();
        assertFalse(list.equals(null));
    }

    @Test
    public void testEqualsDifferentType() throws Exception {
        ShapeList list = new ShapeList();
        assertFalse(list.equals("other"));
    }

    @Test
    public void testEqualsEmptyLists() throws Exception {
        assertTrue(new ShapeList().equals(new ShapeList()));
    }

    @Test
    public void testEqualsMatchingShapes() throws Exception {
        ShapeList first = new ShapeList();
        ShapeList second = new ShapeList();
        first.setShape(0, new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4));
        second.setShape(0, new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4));
        assertTrue(first.equals(second));
    }

    @Test
    public void testEqualsDifferentShapeGeometry() throws Exception {
        ShapeList first = new ShapeList();
        ShapeList second = new ShapeList();
        first.setShape(0, new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4));
        second.setShape(0, new java.awt.geom.Rectangle2D.Double(1, 2, 3, 5));
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsNullAndNonNullShape() throws Exception {
        ShapeList first = new ShapeList();
        ShapeList second = new ShapeList();
        first.setShape(0, null);
        second.setShape(0, new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4));
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsNullShapesAtSameIndex() throws Exception {
        ShapeList first = new ShapeList();
        ShapeList second = new ShapeList();
        first.setShape(0, null);
        second.setShape(0, null);
        assertTrue(first.equals(second));
    }

    @Test
    public void testCloneHasSameContents() throws Exception {
        ShapeList original = new ShapeList();
        Shape shape = new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4);
        original.setShape(0, shape);
        ShapeList copy = (ShapeList) original.clone();
        assertTrue(original.equals(copy));
        assertSame(shape, copy.getShape(0));
    }

    @Test
    public void testCloneCanBeChangedIndependently() throws Exception {
        ShapeList original = new ShapeList();
        Shape shape = new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4);
        original.setShape(0, shape);
        ShapeList copy = (ShapeList) original.clone();
        copy.setShape(0, null);
        assertSame(shape, original.getShape(0));
        assertNull(copy.getShape(0));
    }

    @Test
    public void testHashCodeConsistentForSameObject() throws Exception {
        ShapeList list = new ShapeList();
        list.setShape(0, new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4));
        assertEquals(list.hashCode(), list.hashCode());
    }

    @Test
    public void testClearRemovesShapes() throws Exception {
        ShapeList list = new ShapeList();
        list.setShape(0, new java.awt.geom.Rectangle2D.Double(1, 2, 3, 4));
        list.clear();
        assertEquals(0, list.size());
        assertNull(list.getShape(0));
    }
}
