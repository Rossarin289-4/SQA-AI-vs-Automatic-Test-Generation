package org.jfree.chart.block;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jfree.chart.util.RectangleEdge;
import org.junit.Test;

public class BorderArrangementAI13Test {

    @Test
    public void testEquals() {
        BorderArrangement b1 = new BorderArrangement();
        BorderArrangement b2 = new BorderArrangement();
        assertTrue(b1.equals(b2));
        assertFalse(b1.equals(null));
        assertFalse(b1.equals("SomeString"));

        EmptyBlock block1 = new EmptyBlock(10.0, 10.0);
        b1.add(block1, RectangleEdge.TOP);
        assertFalse(b1.equals(b2));

        b2.add(new EmptyBlock(10.0, 10.0), RectangleEdge.TOP);
        assertTrue(b1.equals(b2));
    }

    @Test
    public void testClear() {
        BorderArrangement b = new BorderArrangement();
        EmptyBlock block = new EmptyBlock(5.0, 5.0);
        b.add(block, RectangleEdge.LEFT);
        
        BorderArrangement empty = new BorderArrangement();
        assertFalse(b.equals(empty));

        b.clear();
        assertTrue(b.equals(empty));
    }

    @Test
    public void testAddAndLayoutElements() {
        BorderArrangement b = new BorderArrangement();
        EmptyBlock center = new EmptyBlock(100.0, 100.0);
        EmptyBlock top = new EmptyBlock(100.0, 20.0);
        b.add(center, null);
        b.add(top, RectangleEdge.TOP);
        
        BorderArrangement bCopy = new BorderArrangement();
        bCopy.add(center, null);
        bCopy.add(top, RectangleEdge.TOP);
        
        assertEquals(b, bCopy);
    }
}
