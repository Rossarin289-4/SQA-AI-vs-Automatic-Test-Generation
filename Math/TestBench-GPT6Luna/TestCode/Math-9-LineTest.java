package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.Embedding;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

public class LineTest {
    @Test
    public void testDirectionAndOrigin() throws Exception {
        Line line = new Line(new Vector3D(2, 0, 0), new Vector3D(2, 3, 0));
        assertEquals(0.0, line.getDirection().getX(), 1e-12);
        assertEquals(1.0, line.getDirection().getY(), 1e-12);
        assertEquals(0.0, line.getDirection().getZ(), 1e-12);
        assertEquals(2.0, line.getOrigin().getX(), 1e-12);
        assertEquals(0.0, line.getOrigin().getY(), 1e-12);
        assertEquals(0.0, line.getOrigin().getZ(), 1e-12);
    }

    @Test
    public void testResetUpdatesLine() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        line.reset(new Vector3D(0, 2, 0), new Vector3D(0, 2, 4));
        assertEquals(0.0, line.getDirection().getX(), 1e-12);
        assertEquals(0.0, line.getDirection().getY(), 1e-12);
        assertEquals(1.0, line.getDirection().getZ(), 1e-12);
        assertEquals(0.0, line.getOrigin().getX(), 1e-12);
        assertEquals(2.0, line.getOrigin().getY(), 1e-12);
        assertEquals(0.0, line.getOrigin().getZ(), 1e-12);
    }

    @Test
    public void testResetRejectsEqualPoints() throws Exception {
        try {
            new Line(new Vector3D(1, 2, 3), new Vector3D(1, 2, 3));
            fail("expected MathIllegalArgumentException");
        } catch (MathIllegalArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testRevertReversesDirection() throws Exception {
        Line line = new Line(new Vector3D(1, 0, 0), new Vector3D(4, 0, 0));
        Line reversed = line.revert();
        assertEquals(-1.0, reversed.getDirection().getX(), 1e-12);
        assertEquals(0.0, reversed.getDirection().getY(), 1e-12);
        assertEquals(0.0, reversed.getOrigin().getX(), 1e-12);
    }

    @Test
    public void testAbscissa() throws Exception {
        Line line = new Line(new Vector3D(0, 2, 0), new Vector3D(0, 5, 0));
        assertEquals(6.0, line.getAbscissa(new Vector3D(0, 6, 0)), 1e-12);
        assertEquals(0.0, line.getAbscissa(new Vector3D(0, 2, 0)), 1e-12);
    }

    @Test
    public void testPointAtPositiveAndNegativeAbscissa() throws Exception {
        Line line = new Line(new Vector3D(0, 2, 0), new Vector3D(0, 5, 0));
        Vector3D positive = line.pointAt(3);
        Vector3D negative = line.pointAt(-2);
        assertEquals(0.0, positive.getX(), 1e-12);
        assertEquals(3.0, positive.getY(), 1e-12);
        assertEquals(0.0, negative.getX(), 1e-12);
        assertEquals(-2.0, negative.getY(), 1e-12);
    }

    @Test
    public void testSubspaceAndSpaceConversions() throws Exception {
        Line line = new Line(new Vector3D(1, 0, 0), new Vector3D(1, 2, 0));
        Vector1D coordinate = line.toSubSpace(new Vector3D(1, 5, 0));
        assertEquals(5.0, coordinate.getX(), 1e-12);
        Vector3D point = line.toSpace(new Vector1D(-3));
        assertEquals(1.0, point.getX(), 1e-12);
        assertEquals(-3.0, point.getY(), 1e-12);
        assertEquals(0.0, point.getZ(), 1e-12);
    }

    @Test
    public void testSimilarLinesSameAndOppositeDirection() throws Exception {
        Line line = new Line(new Vector3D(1, 0, 0), new Vector3D(4, 0, 0));
        Line same = new Line(new Vector3D(2, 0, 0), new Vector3D(6, 0, 0));
        Line opposite = new Line(new Vector3D(6, 0, 0), new Vector3D(2, 0, 0));
        assertTrue(line.isSimilarTo(same));
        assertTrue(line.isSimilarTo(opposite));
    }

    @Test
    public void testSimilarLinesMustBeCollinear() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        Line offset = new Line(new Vector3D(0, 1, 0), new Vector3D(3, 1, 0));
        assertFalse(line.isSimilarTo(offset));
    }

    @Test
    public void testContainsAndPointDistance() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        assertTrue(line.contains(new Vector3D(5, 0, 0)));
        assertFalse(line.contains(new Vector3D(0, 2, 0)));
        assertEquals(2.0, line.distance(new Vector3D(5, 2, 0)), 1e-12);
    }

    @Test
    public void testContainsStrictToleranceBoundary() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        assertFalse(line.contains(new Vector3D(0, 1.0e-10, 0)));
    }

    @Test
    public void testParallelLineDistanceAndClosestPoint() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        Line parallel = new Line(new Vector3D(0, 3, 0), new Vector3D(4, 3, 0));
        assertEquals(3.0, line.distance(parallel), 1e-12);
        Vector3D closest = line.closestPoint(parallel);
        assertEquals(0.0, closest.getX(), 1e-12);
        assertEquals(0.0, closest.getY(), 1e-12);
        assertEquals(0.0, closest.getZ(), 1e-12);
    }

    @Test
    public void testIntersectingLinesDistanceClosestPointAndIntersection() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        Line crossing = new Line(new Vector3D(1, -2, 0), new Vector3D(1, 2, 0));
        assertEquals(0.0, line.distance(crossing), 1e-12);
        Vector3D closest = line.closestPoint(crossing);
        assertEquals(1.0, closest.getX(), 1e-12);
        assertEquals(0.0, closest.getY(), 1e-12);
        assertEquals(0.0, closest.getZ(), 1e-12);
        Vector3D intersection = line.intersection(crossing);
        assertNotNull(intersection);
        assertEquals(1.0, intersection.getX(), 1e-12);
        assertEquals(0.0, intersection.getY(), 1e-12);
    }

    @Test
    public void testSkewLinesHaveNoIntersection() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(2, 0, 0));
        Line skew = new Line(new Vector3D(1, -2, 1), new Vector3D(1, 2, 1));
        assertEquals(1.0, line.distance(skew), 1e-12);
        assertNull(line.intersection(skew));
    }

    @Test
    public void testWholeLineReturnsSubLine() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        assertNotNull(line.wholeLine());
    }
}
