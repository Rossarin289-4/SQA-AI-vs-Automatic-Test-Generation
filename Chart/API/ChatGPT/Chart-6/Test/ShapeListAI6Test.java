package org.jfree.chart.util;

import java.awt.Rectangle;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeListAI6Test {

    @Test
    public void testGetAndSetShape() {
        ShapeList list = new ShapeList();
        Rectangle rect = new Rectangle(0, 0, 10, 10);
        list.setShape(0, rect);
        assertEquals(rect, list.getShape(0));
    }

    @Test
    public void testEqualsAndHashCode() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        Rectangle rect = new Rectangle(1, 2, 3, 4);

        list1.setShape(0, rect);
        list2.setShape(0, rect);

        assertTrue(list1.equals(list2));
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        ShapeList list = new ShapeList();
        Rectangle rect = new Rectangle(5, 5, 5, 5);
        list.setShape(0, rect);

        ShapeList clone = (ShapeList) list.clone();
        assertTrue(list.equals(clone));
        assertNotSame(list, clone);
    }
}
