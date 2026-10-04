package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;

public class BorderArrangementTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEmptyArrangementsAreEqual() throws Exception {
        assertEquals(new BorderArrangement(), new BorderArrangement());
    }

    @Test
    public void testArrangementEqualsItself() throws Exception {
        BorderArrangement arrangement = new BorderArrangement();
        assertTrue(arrangement.equals(arrangement));
    }

    @Test
    public void testArrangementNotEqualToNull() throws Exception {
        assertFalse(new BorderArrangement().equals(null));
    }

    @Test
    public void testArrangementNotEqualToDifferentType() throws Exception {
        assertFalse(new BorderArrangement().equals("other"));
    }

    @Test
    public void testAddingNullAtCenterDoesNotChangeEquality() throws Exception {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(null, null);
        assertEquals(new BorderArrangement(), arrangement);
    }

    @Test
    public void testAddingNullAtEachEdgeDoesNotChangeEquality() throws Exception {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(null, RectangleEdge.TOP);
        arrangement.add(null, RectangleEdge.BOTTOM);
        arrangement.add(null, RectangleEdge.LEFT);
        arrangement.add(null, RectangleEdge.RIGHT);
        assertEquals(new BorderArrangement(), arrangement);
    }

    @Test
    public void testClearResetsSlotsAfterRepeatedAdds() throws Exception {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(null, null);
        arrangement.add(null, RectangleEdge.TOP);
        arrangement.add(null, RectangleEdge.BOTTOM);
        arrangement.add(null, RectangleEdge.LEFT);
        arrangement.add(null, RectangleEdge.RIGHT);
        arrangement.clear();
        assertEquals(new BorderArrangement(), arrangement);
    }

    @Test
    public void testUnconstrainedArrangeOnEmptyArrangement() throws Exception {
        BorderArrangement arrangement = new BorderArrangement();
        BlockContainer container = new BlockContainer(arrangement);
        Size2D size = arrangement.arrange(container, null,
                RectangleConstraint.NONE);
        assertEquals(0.0, size.getWidth(), 0.0);
        assertEquals(0.0, size.getHeight(), 0.0);
    }

    @Test
    public void testAddingNullCenterThenClearIsIdempotent() throws Exception {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(null, null);
        arrangement.clear();
        arrangement.clear();
        assertEquals(new BorderArrangement(), arrangement);
    }

    @Test
    public void testEqualArrangementRemainsEqualAfterClear() throws Exception {
        BorderArrangement first = new BorderArrangement();
        BorderArrangement second = new BorderArrangement();
        first.clear();
        second.clear();
        assertTrue(first.equals(second));
    }

    @Test
    public void testAddingNullToOneEdgeLeavesArrangementEqual() throws Exception {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(null, RectangleEdge.LEFT);
        assertTrue(arrangement.equals(new BorderArrangement()));
    }

    @Test
    public void testAddingNullToCenterAfterClearLeavesArrangementEqual() throws Exception {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.clear();
        arrangement.add(null, null);
        assertTrue(arrangement.equals(new BorderArrangement()));
    }
}
