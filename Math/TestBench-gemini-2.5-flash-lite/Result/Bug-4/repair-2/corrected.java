package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.Region.Location;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line; // Import for 2D Line if needed by API but not used in 3D SubLine logic
import org.apache.commons.math3.geometry.euclidean.threed.Line; // Import for 3D Line
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D; // Import for 2D Vector2D if needed by API
import org.apache.commons.math3.geometry.partitioning.SplitSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.util.FastMath;


public class SubLineTest {

    // Helper method to create SubLine using the 3D Line and IntervalsSet constructor
    private SubLine createSubLine(Line line, IntervalsSet region) {
        // The constructor is protected in the provided source, but we assume it's accessible for testing
        // or that a public constructor or factory method is intended.
        // Since the provided code has:
        // public SubLine(final Line line, final IntervalsSet remainingRegion)
        // it should be accessible. The compiler error suggests otherwise.
        // Re-checking the prompt: The provided source is `org.apache.commons.math3.geometry.euclidean.threed.SubLine`
        // and its constructor is `public SubLine(final Line line, final IntervalsSet remainingRegion)`.
        // The issue is likely the `Line` type used in the test vs. what the `SubLine` constructor expects.
        // The compiler error "Line cannot be converted to Hyperplane<Euclidean2D>" indicates the test is trying to use a 2D Line where a 3D Line is needed for the 3D SubLine.
        // However, the prompt's API section lists `org.apache.commons.math3.geometry.euclidean.twod.Line`.
        // The referenced source code *is* the 3D SubLine.
        // This means the test should use `org.apache.commons.math3.geometry.euclidean.threed.Line`.
        return new SubLine(line, region);
    }

    // Helper method to create SubLine using the 3D Vector3D constructor
    private SubLine createSubLine(Vector3D start, Vector3D end) throws MathIllegalArgumentException {
        return new SubLine(start, end);
    }
    
    // Helper method to create SubLine using the 3D Segment constructor
    private SubLine createSubLine(Segment segment) throws MathIllegalArgumentException {
        return new SubLine(segment);
    }

    @Test
    public void testGetSegmentsEmpty() throws Exception {
        Line line = new Line(new Vector3D(1, 1, 0), new Vector3D(2, 2, 0));
        IntervalsSet region = new IntervalsSet(); // Empty region
        SubLine subLine = createSubLine(line, region);
        assertTrue(subLine.getSegments().isEmpty());
    }

    @Test
    public void testGetSegmentsSingleFiniteSegment() throws Exception {
        Vector3D start = new Vector3D(1, 1, 0);
        Vector3D end = new Vector3D(3, 3, 0);
        SubLine subLine = createSubLine(start, end);
        List<Segment> segments = subLine.getSegments();
        assertEquals(1, segments.size());
        Segment segment = segments.get(0);
        assertEquals(start, segment.getStart());
        assertEquals(end, segment.getEnd());
    }

    @Test
    public void testGetSegmentsSingleInfiniteSegmentPositive() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        IntervalsSet region = new IntervalsSet(1.0, Double.POSITIVE_INFINITY);
        SubLine subLine = createSubLine(line, region);
        List<Segment> segments = subLine.getSegments();
        assertEquals(1, segments.size());
        Segment segment = segments.get(0);
        assertEquals(line.toSpace(new Vector1D(1.0)), segment.getStart());
        // The end point should be infinite. The exact component (x, y, or z) that becomes infinite depends on the line's direction.
        // We can check if the norm is infinite.
        assertTrue(segment.getEnd().getNorm() == Double.POSITIVE_INFINITY);
    }

    @Test
    public void testGetSegmentsSingleInfiniteSegmentNegative() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        IntervalsSet region = new IntervalsSet(Double.NEGATIVE_INFINITY, 1.0);
        SubLine subLine = createSubLine(line, region);
        List<Segment> segments = subLine.getSegments();
        assertEquals(1, segments.size());
        Segment segment = segments.get(0);
        // The start point should be infinite.
        assertTrue(segment.getStart().getNorm() == Double.POSITIVE_INFINITY);
        assertEquals(line.toSpace(new Vector1D(1.0)), segment.getEnd());
    }

    @Test
    public void testGetSegmentsTwoFiniteSegments() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        IntervalsSet region = new IntervalsSet(new Interval(0, 1)).union(new IntervalsSet(new Interval(2, 3)));
        SubLine subLine = createSubLine(line, region);
        List<Segment> segments = subLine.getSegments();
        assertEquals(2, segments.size());
        Segment seg1 = segments.get(0);
        assertEquals(line.toSpace(new Vector1D(0.0)), seg1.getStart());
        assertEquals(line.toSpace(new Vector1D(1.0)), seg1.getEnd());
        Segment seg2 = segments.get(1);
        assertEquals(line.toSpace(new Vector1D(2.0)), seg2.getStart());
        assertEquals(line.toSpace(new Vector1D(3.0)), seg2.getEnd());
    }

    @Test
    public void testIntersectionNoIntersectionInfiniteLines() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0)); // Parallel

        IntervalsSet region1 = new IntervalsSet(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        IntervalsSet region2 = new IntervalsSet(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);

        SubLine subLine1 = createSubLine(line1, region1);
        SubLine subLine2 = createSubLine(line2, region2);

        assertNull(subLine1.intersection(subLine2, true));
        assertNull(subLine1.intersection(subLine2, false));
    }

    @Test
    public void testIntersectionNoIntersectionOnRange() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line, new IntervalsSet(0.0, 1.0));
        SubLine subLine2 = createSubLine(line, new IntervalsSet(2.0, 3.0)); // Disjoint ranges
        assertNull(subLine1.intersection(subLine2, true));
        assertNull(subLine1.intersection(subLine2, false));
    }

    @Test
    public void testIntersectionWithSameLine() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line, new IntervalsSet(0.0, 2.0));
        SubLine subLine2 = createSubLine(line, new IntervalsSet(1.0, 3.0));
        Vector3D intersection = subLine1.intersection(subLine2, true);
        // The intersection of overlapping intervals on the same line is the start of the overlap.
        // In this case, the overlap is [1.0, 2.0]. The intersection point should correspond to 1.0 on the line.
        assertEquals(line.toSpace(new Vector1D(1.0)), intersection);
        
        intersection = subLine1.intersection(subLine2, false);
        assertEquals(line.toSpace(new Vector1D(1.0)), intersection);
    }
    
    @Test
    public void testIntersectionAtEndpointInclude() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line, new IntervalsSet(0.0, 1.0));
        SubLine subLine2 = createSubLine(line, new IntervalsSet(1.0, 2.0));
        Vector3D intersection = subLine1.intersection(subLine2, true);
        assertEquals(line.toSpace(new Vector1D(1.0)), intersection);
    }

    @Test
    public void testIntersectionAtEndpointExclude() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line, new IntervalsSet(0.0, 1.0));
        SubLine subLine2 = createSubLine(line, new IntervalsSet(1.0, 2.0));
        Vector3D intersection = subLine1.intersection(subLine2, false);
        assertNull(intersection);
    }

    @Test
    public void testIntersectionAtInfiniteEndpointInclude() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line, new IntervalsSet(0.0, Double.POSITIVE_INFINITY));
        SubLine subLine2 = createSubLine(line, new IntervalsSet(Double.NEGATIVE_INFINITY, 0.0));
        Vector3D intersection = subLine1.intersection(subLine2, true);
        assertEquals(line.toSpace(new Vector1D(0.0)), intersection);
    }

    @Test
    public void testIntersectionAtInfiniteEndpointExclude() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line, new IntervalsSet(0.0, Double.POSITIVE_INFINITY));
        SubLine subLine2 = createSubLine(line, new IntervalsSet(Double.NEGATIVE_INFINITY, 0.0));
        Vector3D intersection = subLine1.intersection(subLine2, false);
        assertNull(intersection);
    }

    @Test
    public void testIntersectionWithDifferentLines() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0)); // Intersects at origin
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(-1.0, 1.0));
        SubLine subLine2 = createSubLine(line2, new IntervalsSet(-1.0, 1.0));
        Vector3D intersection = subLine1.intersection(subLine2, true);
        assertEquals(Vector3D.ZERO, intersection);
    }

    @Test
    public void testIntersectionWithDifferentLinesAndNonZeroIntersection() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 1, 0));
        Line line2 = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 0, 0)); // Intersects at (0.5, 0.5, 0)
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(0.0, 1.0));
        SubLine subLine2 = createSubLine(line2, new IntervalsSet(0.0, 1.0));
        Vector3D intersection = subLine1.intersection(subLine2, true);
        assertEquals(new Vector3D(0.5, 0.5, 0), intersection);
    }

    @Test
    public void testIntersectionWithDifferentLinesAndOutsideRange() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 1, 0));
        Line line2 = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 0, 0)); // Intersects at (0.5, 0.5, 0)
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(0.0, 0.25)); // Range for line1 does not include intersection
        SubLine subLine2 = createSubLine(line2, new IntervalsSet(0.0, 1.0));
        Vector3D intersection = subLine1.intersection(subLine2, true);
        assertNull(intersection);
    }

    // The side and split methods are defined on the 3D SubLine, but the API outline shows they expect Hyperplane<Euclidean2D>.
    // The reference source code for 3D SubLine uses `Line` for `getHyperplane()` and `otherLine` which implies `Line` implements `Hyperplane<Euclidean2D>`.
    // Assuming `org.apache.commons.math3.geometry.euclidean.threed.Line` implements `Hyperplane<Euclidean2D>` for the purpose of these methods.

    @Test
    public void testSideParallelAndSame() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine = createSubLine(line, new IntervalsSet(-1.0, 1.0));
        // Assuming Line implements Hyperplane<Euclidean2D>
        assertEquals(Side.HYPER, subLine.side(line));
    }

    @Test
    public void testSideParallelAndPlus() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine = createSubLine(line, new IntervalsSet(-1.0, 1.0));
        Line parallelLine = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0));
        assertEquals(Side.PLUS, subLine.side(parallelLine));
    }

    @Test
    public void testSideParallelAndMinus() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine = createSubLine(line, new IntervalsSet(-1.0, 1.0));
        Line parallelLine = new Line(new Vector3D(0, -1, 0), new Vector3D(1, -1, 0));
        assertEquals(Side.MINUS, subLine.side(parallelLine));
    }

    @Test
    public void testSideIntersectingAndPlus() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine = createSubLine(line, new IntervalsSet(-1.0, 1.0));
        Line intersectingLine = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0)); // Intersects at (0,0,0)
        assertEquals(Side.PLUS, subLine.side(intersectingLine));
    }
    
    @Test
    public void testSideIntersectingAndMinus() throws Exception {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0)).getReverse(); // Reversed line
        SubLine subLine = createSubLine(line, new IntervalsSet(-1.0, 1.0));
        Line intersectingLine = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0)); // Intersects at (0,0,0)
        assertEquals(Side.MINUS, subLine.side(intersectingLine));
    }

    @Test
    public void testSideIntersectingWithFullRange() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY));
        Line line2 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0)); // Intersects at (0,0,0)
        assertEquals(Side.HYPER, subLine1.side(line2));
    }

    @Test
    public void testSplitParallelAndPlus() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(-1.0, 1.0));
        Line line2 = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0)); // Parallel and above
        SplitSubHyperplane<Euclidean2D> split = subLine1.split(line2);
        assertNull(split.getPlus());
        assertNotNull(split.getMinus());
        assertEquals(subLine1, split.getMinus());
    }

    @Test
    public void testSplitParallelAndMinus() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0)).getReverse(); // Reversed line
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(-1.0, 1.0));
        Line line2 = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0)); // Parallel and above the reversed line
        SplitSubHyperplane<Euclidean2D> split = subLine1.split(line2);
        assertNull(split.getMinus());
        assertNotNull(split.getPlus());
        assertEquals(subLine1, split.getPlus());
    }

    @Test
    public void testSplitIntersecting() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(-2.0, 2.0));
        Line line2 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0)); // Intersects at (0,0,0)
        SplitSubHyperplane<Euclidean2D> split = subLine1.split(line2);

        assertNotNull(split.getPlus());
        assertNotNull(split.getMinus());

        SubLine plusSubLine = (SubLine) split.getPlus();
        SubLine minusSubLine = (SubLine) split.getMinus();

        Line plusHyperplane = (Line) plusSubLine.getHyperplane();
        Line minusHyperplane = (Line) minusSubLine.getHyperplane();

        // The split method returns copies of the original hyperplane, so they should be identical in orientation and parallel.
        // Comparing the full Line object might be too strict due to potential floating point differences or internal state not relevant to the split.
        // Check they are parallel and have the same orientation.
        assertTrue(plusHyperplane.isParallelTo(line1));
        assertTrue(plusHyperplane.sameOrientationAs(line1));
        assertTrue(minusHyperplane.isParallelTo(line1));
        assertTrue(minusHyperplane.sameOrientationAs(line1));

        IntervalsSet plusRegion = (IntervalsSet) plusSubLine.getRemainingRegion();
        assertEquals(1, plusRegion.asList().size());
        assertEquals(0.0, plusRegion.asList().get(0).getInf(), 1e-9);
        assertEquals(2.0, plusRegion.asList().get(0).getSup(), 1e-9);

        IntervalsSet minusRegion = (IntervalsSet) minusSubLine.getRemainingRegion();
        assertEquals(1, minusRegion.asList().size());
        assertEquals(-2.0, minusRegion.asList().get(0).getInf(), 1e-9);
        assertEquals(0.0, minusRegion.asList().get(0).getSup(), 1e-9);
    }

    @Test
    public void testSplitIntersectingWithLimitedRange() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(0.0, 1.0));
        Line line2 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0)); // Intersects at (0,0,0)
        SplitSubHyperplane<Euclidean2D> split = subLine1.split(line2);

        assertNotNull(split.getPlus());
        assertNotNull(split.getMinus());

        SubLine plusSubLine = (SubLine) split.getPlus();
        SubLine minusSubLine = (SubLine) split.getMinus();

        IntervalsSet plusRegion = (IntervalsSet) plusSubLine.getRemainingRegion();
        assertEquals(1, plusRegion.asList().size());
        assertEquals(0.0, plusRegion.asList().get(0).getInf(), 1e-9);
        assertEquals(1.0, plusRegion.asList().get(0).getSup(), 1e-9);

        IntervalsSet minusRegion = (IntervalsSet) minusSubLine.getRemainingRegion();
        assertEquals(1, minusRegion.asList().size());
        assertEquals(0.0, minusRegion.asList().get(0).getInf(), 1e-9);
        assertEquals(0.0, minusRegion.asList().get(0).getSup(), 1e-9);
    }
    
    @Test
    public void testConstructorWithSegment() throws Exception {
        Vector3D start = new Vector3D(1, 1, 0);
        Vector3D end = new Vector3D(2, 2, 0);
        Line line = new Line(start, end);
        Segment segment = new Segment(start, end, line);
        SubLine subLine = createSubLine(segment);
        List<Segment> segments = subLine.getSegments();
        assertEquals(1, segments.size());
        Segment returnedSegment = segments.get(0);
        assertEquals(start, returnedSegment.getStart());
        assertEquals(end, returnedSegment.getEnd());
    }

    @Test
    public void testConstructorWithSegmentSamePoints() throws Exception {
        Vector3D p = new Vector3D(1, 1, 0);
        // Line constructor throws MathIllegalArgumentException if points are the same.
        // The SubLine constructor that takes a Segment will indirectly call the Line constructor.
        try {
            Line line = new Line(p, p); 
            Segment segment = new Segment(p, p, line); // This line will not be reached if Line constructor throws.
            new SubLine(segment);
            fail("Should have thrown MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testIntersectionWithLineThatDoesNotIntersect() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(-1.0, 1.0));

        Line line2 = new Line(new Vector3D(0, 2, 0), new Vector3D(1, 2, 0)); // Parallel and above
        SubLine subLine2 = createSubLine(line2, new IntervalsSet(-1.0, 1.0));

        assertNull(subLine1.intersection(subLine2, true));
    }

    @Test
    public void testIntersectionWithLineThatDoesNotIntersectFalse() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(-1.0, 1.0));

        Line line2 = new Line(new Vector3D(0, 2, 0), new Vector3D(1, 2, 0)); // Parallel and above
        SubLine subLine2 = createSubLine(line2, new IntervalsSet(-1.0, 1.0));

        assertNull(subLine1.intersection(subLine2, false));
    }

    @Test
    public void testSideWithNonIntersectingLine() throws Exception {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine1 = createSubLine(line1, new IntervalsSet(-1.0, 1.0));
        Line line2 = new Line(new Vector3D(0, 2, 0), new Vector3D(1, 2, 0)); // Parallel and above
        assertEquals(Side.PLUS, subLine1.side(line2));
    }
    
    @Test
    public void testBuildIntervalSetFromDifferentPoints() throws Exception {
        Vector3D p1 = new Vector3D(1, 1, 0);
        Vector3D p2 = new Vector3D(2, 2, 0);
        try {
            SubLine subLine = new SubLine(p1, p2); // This constructor calls buildIntervalSet internally.
            List<Segment> segments = subLine.getSegments();
            assertEquals(1, segments.size());
            Segment segment = segments.get(0);
            assertEquals(p1, segment.getStart());
            assertEquals(p2, segment.getEnd());
        } catch (MathIllegalArgumentException e) {
            fail("Constructor with different points should not throw an exception.");
        }
    }
    
    @Test
    public void testConstructorThrowsExceptionForSamePoints() throws Exception {
        Vector3D p = new Vector3D(1, 2, 3);
        try {
            new SubLine(p, p);
            fail("Should have thrown MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // Expected
        }
    }
}
