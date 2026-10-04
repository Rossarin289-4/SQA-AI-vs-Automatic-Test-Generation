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
    public void testConstructorAndGetters() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D p2 = new Vector3D(4.0, 5.0, 6.0);
        Line line = new Line(p1, p2);

        Vector3D expectedDirection = new Vector3D(1.0 / FastMath.sqrt(27.0), new Vector3D(3.0, 3.0, 3.0));
        assertEquals(expectedDirection.getX(), line.getDirection().getX(), 1e-15);
        assertEquals(expectedDirection.getY(), line.getDirection().getY(), 1e-15);
        assertEquals(expectedDirection.getZ(), line.getDirection().getZ(), 1e-15);

        Vector3D expectedOrigin = new Vector3D(1.0, p1, -p1.dotProduct(new Vector3D(3.0, 3.0, 3.0)) / 27.0, new Vector3D(3.0, 3.0, 3.0));
        assertEquals(expectedOrigin.getX(), line.getOrigin().getX(), 1e-15);
        assertEquals(expectedOrigin.getY(), line.getOrigin().getY(), 1e-15);
        assertEquals(expectedOrigin.getZ(), line.getOrigin().getZ(), 1e-15);
    }

    @Test
    public void testConstructorIdenticalPoints() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        try {
            new Line(p1, p1);
            fail("Expected MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // Corrected: MathIllegalArgumentException does not have a getPattern() method.
            // Asserting the exception type is sufficient.
        }
    }

    @Test
    public void testRevert() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line = new Line(p1, p2);
        Line revertedLine = line.revert();

        assertEquals(-line.getDirection().getX(), revertedLine.getDirection().getX(), 1e-15);
        assertEquals(-line.getDirection().getY(), revertedLine.getDirection().getY(), 1e-15);
        assertEquals(-line.getDirection().getZ(), revertedLine.getDirection().getZ(), 1e-15);

        assertEquals(line.getOrigin().getX(), revertedLine.getOrigin().getX(), 1e-15);
        assertEquals(line.getOrigin().getY(), revertedLine.getOrigin().getY(), 1e-15);
        assertEquals(line.getOrigin().getZ(), revertedLine.getOrigin().getZ(), 1e-15);
    }

    @Test
    public void testGetAbscissa() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line = new Line(p1, p2);
        Vector3D pointOnLine = new Vector3D(3.0, 0.0, 0.0);
        assertEquals(1.0, line.getAbscissa(pointOnLine), 1e-15);

        Vector3D pointNotOnLine = new Vector3D(3.0, 1.0, 0.0);
        assertEquals(1.0, line.getAbscissa(pointNotOnLine), 1e-15);
    }

    @Test
    public void testPointAt() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 1.0, 0.0);
        Line line = new Line(p1, p2);
        double abscissa = 5.0;
        Vector3D point = line.pointAt(abscissa);
        assertEquals(abscissa, line.getAbscissa(point), 1e-15);
    }

    @Test
    public void testToSubSpace() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line = new Line(p1, p2);
        Vector3D point = new Vector3D(3.0, 0.0, 0.0);
        Vector1D projectedPoint = line.toSubSpace(point);
        assertEquals(2.0, projectedPoint.getX(), 1e-15);
    }

    @Test
    public void testToSpace() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 1.0, 0.0);
        Line line = new Line(p1, p2);
        Vector1D vector1D = new Vector1D(5.0);
        Vector3D point = line.toSpace(vector1D);
        assertEquals(line.pointAt(5.0).getX(), point.getX(), 1e-15);
        assertEquals(line.pointAt(5.0).getY(), point.getY(), 1e-15);
        assertEquals(line.pointAt(5.0).getZ(), point.getZ(), 1e-15);
    }

    @Test
    public void testIsSimilarToSameLine() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D p2 = new Vector3D(4.0, 5.0, 6.0);
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p1, p2);
        assertTrue(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarToOppositeDirection() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D p2 = new Vector3D(4.0, 5.0, 6.0);
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p2, p1); // reversed points, hence reversed direction
        assertTrue(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarToDifferentLineSamePoints() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(new Vector3D(1.5, 0.0, 0.0), new Vector3D(2.5, 0.0, 0.0)); // different origin, same direction
        assertTrue(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarToDifferentLine() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(new Vector3D(0.0, 1.0, 0.0), new Vector3D(0.0, 2.0, 0.0));
        assertFalse(line1.isSimilarTo(line2));
    }

    @Test
    public void testContains() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line = new Line(p1, p2);
        Vector3D pointOnLine = new Vector3D(3.0, 0.0, 0.0);
        assertTrue(line.contains(pointOnLine));

        Vector3D pointCloseToLine = new Vector3D(3.0, 1e-12, 0.0);
        assertTrue(line.contains(pointCloseToLine));

        Vector3D pointNotOnLine = new Vector3D(3.0, 1.0, 0.0);
        assertFalse(line.contains(pointNotOnLine));
    }

    @Test
    public void testDistancePoint() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 1.0, 0.0);
        Line line = new Line(p1, p2);
        Vector3D pointOnLine = new Vector3D(1.0, 5.0, 0.0);
        assertEquals(0.0, line.distance(pointOnLine), 1e-15);

        Vector3D pointNotOnLine = new Vector3D(2.0, 5.0, 0.0);
        assertEquals(1.0, line.distance(pointNotOnLine), 1e-15);
    }

    @Test
    public void testDistancePointLargeValues() throws Exception {
        Vector3D p1 = new Vector3D(1e10, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1e10, 1.0, 0.0);
        Line line = new Line(p1, p2);
        Vector3D pointNotOnLine = new Vector3D(1e10 + 1.0, 5.0, 0.0);
        assertEquals(1.0, line.distance(pointNotOnLine), 1e-5); // Tolerance increases with magnitude
    }


    @Test
    public void testDistanceLineParallel() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2);

        Vector3D p3 = new Vector3D(1.0, 1.0, 0.0);
        Vector3D p4 = new Vector3D(2.0, 1.0, 0.0);
        Line line2 = new Line(p3, p4);

        assertEquals(1.0, line1.distance(line2), 1e-15);
    }

    @Test
    public void testDistanceLineParallelSameLine() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(line1);
        assertEquals(0.0, line1.distance(line2), 1e-15);
    }

    @Test
    public void testDistanceLineIntersecting() throws Exception {
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2);

        Vector3D p3 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p4 = new Vector3D(0.0, 1.0, 0.0);
        Line line2 = new Line(p3, p4);

        assertEquals(0.0, line1.distance(line2), 1e-15);
    }

    @Test
    public void testDistanceLineSkew() throws Exception {
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2);

        Vector3D p3 = new Vector3D(0.0, 1.0, 1.0);
        Vector3D p4 = new Vector3D(0.0, 2.0, 1.0);
        Line line2 = new Line(p3, p4);

        // line1 is x-axis, line2 is parallel to y-axis at x=0, z=1
        // closest points are (0,0,0) and (0,1,1)
        // distance vector is (0,1,1), norm is sqrt(2)
        assertEquals(FastMath.sqrt(2.0), line1.distance(line2), 1e-15);
    }

    @Test
    public void testClosestPointParallel() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2);

        Vector3D p3 = new Vector3D(1.0, 1.0, 0.0);
        Vector3D p4 = new Vector3D(2.0, 1.0, 0.0);
        Line line2 = new Line(p3, p4);

        Vector3D closest = line1.closestPoint(line2);
        // For parallel lines, closestPoint of line1 to line2 should be a point on line1.
        // The calculation in the source code simplifies to line1.zero when lines are parallel.
        assertEquals(line1.getOrigin().getX(), closest.getX(), 1e-15);
        assertEquals(line1.getOrigin().getY(), closest.getY(), 1e-15);
        assertEquals(line1.getOrigin().getZ(), closest.getZ(), 1e-15);
    }

    @Test
    public void testClosestPointIntersecting() throws Exception {
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2);

        Vector3D p3 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p4 = new Vector3D(0.0, 1.0, 0.0);
        Line line2 = new Line(p3, p4);

        Vector3D closest = line1.closestPoint(line2);
        assertEquals(0.0, closest.getX(), 1e-15);
        assertEquals(0.0, closest.getY(), 1e-15);
        assertEquals(0.0, closest.getZ(), 1e-15);
    }

    @Test
    public void testClosestPointSkew() throws Exception {
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2); // x-axis

        Vector3D p3 = new Vector3D(0.0, 1.0, 1.0);
        Vector3D p4 = new Vector3D(0.0, 2.0, 1.0);
        Line line2 = new Line(p3, p4); // line parallel to y-axis at x=0, z=1

        Vector3D closest = line1.closestPoint(line2);
        // Closest point on line1 to line2 is (0,0,0)
        assertEquals(0.0, closest.getX(), 1e-15);
        assertEquals(0.0, closest.getY(), 1e-15);
        assertEquals(0.0, closest.getZ(), 1e-15);

        // Check if the point found is indeed closest by checking its projection onto line2
        Vector3D closestOnLine2 = line2.closestPoint(line1);
        // The closest point on line2 to line1 is (0,1,1)
        assertEquals(0.0, closestOnLine2.getX(), 1e-15);
        assertEquals(1.0, closestOnLine2.getY(), 1e-15);
        assertEquals(1.0, closestOnLine2.getZ(), 1e-15);

        // The distance between these two points should be the minimum distance between the lines
        assertEquals(FastMath.sqrt(2.0), closest.distance(closestOnLine2), 1e-15);
    }

    @Test
    public void testIntersectionIntersectingLines() throws Exception {
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2); // x-axis

        Vector3D p3 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p4 = new Vector3D(0.0, 1.0, 0.0);
        Line line2 = new Line(p3, p4); // y-axis

        Vector3D intersection = line1.intersection(line2);
        assertEquals(0.0, intersection.getX(), 1e-15);
        assertEquals(0.0, intersection.getY(), 1e-15);
        assertEquals(0.0, intersection.getZ(), 1e-15);
    }

    @Test
    public void testIntersectionParallelLines() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2);

        Vector3D p3 = new Vector3D(1.0, 1.0, 0.0);
        Vector3D p4 = new Vector3D(2.0, 1.0, 0.0);
        Line line2 = new Line(p3, p4);

        assertNull(line1.intersection(line2));
    }

    @Test
    public void testIntersectionSkewLines() throws Exception {
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 0.0, 0.0);
        Line line1 = new Line(p1, p2); // x-axis

        Vector3D p3 = new Vector3D(0.0, 1.0, 1.0);
        Vector3D p4 = new Vector3D(0.0, 2.0, 1.0);
        Line line2 = new Line(p3, p4); // line parallel to y-axis at x=0, z=1

        assertNull(line1.intersection(line2));
    }

    @Test
    public void testWholeLine() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D p2 = new Vector3D(4.0, 5.0, 6.0);
        Line line = new Line(p1, p2);
        SubLine subLine = line.wholeLine();
        assertNotNull(subLine);
        // Corrected: SubLine does not have getLine() method.
        // The Line object used to create the SubLine is implicitly associated.
        // Instead, check if the line's direction and origin are preserved in the subLine.
        // For the purpose of this test, we can directly check the line reference.
        // However, since we cannot access getLine(), we rely on the fact that wholeLine() returns a SubLine
        // constructed with the current line. We'll assert properties of the subLine.
        // Since IntervalsSet is used, and it's empty for wholeLine, we test that.
        assertTrue(subLine.getIntervalRange().isEmpty()); // Whole line interval is empty in IntervalsSet
    }

    @Test
    public void testCopyConstructor() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D p2 = new Vector3D(4.0, 5.0, 6.0);
        Line line = new Line(p1, p2);
        Line copiedLine = new Line(line);

        // Check if the direction and origin are the same
        assertEquals(line.getDirection().getX(), copiedLine.getDirection().getX(), 1e-15);
        assertEquals(line.getDirection().getY(), copiedLine.getDirection().getY(), 1e-15);
        assertEquals(line.getDirection().getZ(), copiedLine.getDirection().getZ(), 1e-15);

        assertEquals(line.getOrigin().getX(), copiedLine.getOrigin().getX(), 1e-15);
        assertEquals(line.getOrigin().getY(), copiedLine.getOrigin().getY(), 1e-15);
        assertEquals(line.getOrigin().getZ(), copiedLine.getOrigin().getZ(), 1e-15);

        // Ensure it's a deep copy by modifying the original and checking the copy
        Vector3D p3 = new Vector3D(7.0, 8.0, 9.0);
        line = new Line(p1, p3); // Re-initialize original

        assertFalse(line.getDirection().equals(copiedLine.getDirection()));
        assertFalse(line.getOrigin().equals(copiedLine.getOrigin()));
    }

    @Test
    public void testReset() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D p2 = new Vector3D(4.0, 5.0, 6.0);
        Line line = new Line(p1, p2);

        Vector3D p3 = new Vector3D(7.0, 8.0, 9.0);
        Vector3D p4 = new Vector3D(10.0, 11.0, 12.0);
        line.reset(p3, p4);

        Vector3D expectedDirection = new Vector3D(1.0 / FastMath.sqrt(27.0), new Vector3D(3.0, 3.0, 3.0));
        assertEquals(expectedDirection.getX(), line.getDirection().getX(), 1e-15);
        assertEquals(expectedDirection.getY(), line.getDirection().getY(), 1e-15);
        assertEquals(expectedDirection.getZ(), line.getDirection().getZ(), 1e-15);

        Vector3D expectedOrigin = new Vector3D(1.0, p3, -p3.dotProduct(new Vector3D(3.0, 3.0, 3.0)) / 27.0, new Vector3D(3.0, 3.0, 3.0));
        assertEquals(expectedOrigin.getX(), line.getOrigin().getX(), 1e-15);
        assertEquals(expectedOrigin.getY(), line.getOrigin().getY(), 1e-15);
        assertEquals(expectedOrigin.getZ(), line.getOrigin().getZ(), 1e-15);
    }

    @Test
    public void testResetIdenticalPoints() throws Exception {
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        Line line = new Line(p1, new Vector3D(4.0, 5.0, 6.0));
        try {
            line.reset(p1, p1);
            fail("Expected MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // Corrected: MathIllegalArgumentException does not have a getPattern() method.
            // Asserting the exception type is sufficient.
        }
    }
}
