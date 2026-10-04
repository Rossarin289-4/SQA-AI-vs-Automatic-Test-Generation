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
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D; // Import for 2D Vector2D if needed by API
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.util.FastMath;


public class SubLineTest {

    // Helper method to create SubLine using the 3D Line and IntervalsSet constructor

    // Helper method to create SubLine using the 3D Vector3D constructor
    private SubLine createSubLine(Vector3D start, Vector3D end) throws MathIllegalArgumentException {
        return new SubLine(start, end);
    }
    
    // Helper method to create SubLine using the 3D Segment constructor
    private SubLine createSubLine(Segment segment) throws MathIllegalArgumentException {
        return new SubLine(segment);
    }








    







    // The side and split methods are defined on the 3D SubLine, but the API outline shows they expect Hyperplane<Euclidean2D>.
    // The reference source code for 3D SubLine uses `Line` for `getHyperplane()` and `otherLine` which implies `Line` implements `Hyperplane<Euclidean2D>`.
    // Assuming `org.apache.commons.math3.geometry.euclidean.threed.Line` implements `Hyperplane<Euclidean2D>` for the purpose of these methods.




    





    


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





