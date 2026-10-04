```java
package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.Region.Location;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

public class SubLineTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSegmentsForFiniteEndpoints() throws Exception {
        SubLine s = new SubLine(new Vector2D(0, 0), new Vector2D(3, 0));
        List<org.apache.commons.math3.geometry.euclidean.twod.Segment> segments = s.getSegments();
        assertEquals(1, segments.size());
        assertEquals(0.0, segments.get(0).getStart().getX(), 1e-12);
        assertEquals(3.0, segments.get(0).getEnd().getX(), 1e-12);
    }

    @Test
    public void testSegmentsForReversedEndpoints() throws Exception {
        SubLine s = new SubLine(new Vector2D(3, 0), new Vector2D(0, 0));
        List<org.apache.commons.math3.geometry.euclidean.twod.Segment> segments = s.getSegments();
        assertEquals(1, segments.size());
        assertEquals(3.0, segments.get(0).getStart().getX(), 1e-12);
        assertEquals(0.0, segments.get(0).getEnd().getX(), 1e-12);
    }

    @Test
    public void testSegmentsForWholeLine() throws Exception {
        SubLine s = new SubLine(new Line(new Vector2D(0, 0), new Vector2D(1, 0)),
                                new IntervalsSet());
        List<org.apache.commons.math3.geometry.euclidean.twod.Segment> segments = s.getSegments();
        assertEquals(1, segments.size());
        assertTrue(Double.isInfinite(segments.get(0).getStart().getX()));
        assertTrue(Double.isInfinite(segments.get(0).getEnd().getX()));
    }

    @Test
    public void testSegmentsForEmptyRegion() throws Exception {
        SubLine s = new SubLine(new Line(new Vector2D(0, 0), new Vector2D(1, 0)),
                                new IntervalsSet(1, 0));
        assertEquals(0, s.getSegments().size());
    }

    @Test
    public void testIntersectionAtInteriorWithEndpointsIncluded() throws Exception {
        SubLine a = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        SubLine b = new SubLine(new Vector2D(2, -2), new Vector2D(2, 2));
        Vector2D p = a.intersection(b, true);
        assertNotNull(p);
        assertEquals(2.0, p.getX(), 1e-12);
        assertEquals(0.0, p.getY(), 1e-12);
    }

    @Test
    public void testIntersectionAtInteriorWithEndpointsExcluded() throws Exception {
        SubLine a = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        SubLine b = new SubLine(new Vector2D(2, -2), new Vector2D(2, 2));
        Vector2D p = a.intersection(b, false);
        assertNotNull(p);
        assertEquals(2.0, p.getX(), 1e-12);
    }

    @Test
    public void testIntersectionAtEndpointIncluded() throws Exception {
        SubLine a = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        SubLine b = new SubLine(new Vector2D(2, -1), new Vector2D(2, 1));
        assertEquals(new Vector2D(2, 0), a.intersection(b, true));
    }

    @Test
    public void testIntersectionAtEndpointExcluded() throws Exception {
        SubLine a = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        SubLine b = new SubLine(new Vector2D(2, -1), new Vector2D(2, 1));
        assertNull(a.intersection(b, false));
    }

    @Test
    public void testIntersectionOutsideFirstSegment() throws Exception {
        SubLine a = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        SubLine b = new SubLine(new Vector2D(2, -1), new Vector2D(2, 1));
        assertNull(a.intersection(b, true));
    }

    @Test
    public void testIntersectionOfParallelLines() throws Exception {
        SubLine a = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        SubLine b = new SubLine(new Vector2D(0, 1), new Vector2D(2, 1));
        assertNull(a.intersection(b, true));
    }

    @Test
    public void testSideCrossingLine() throws Exception {
        SubLine s = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        Line cut = new Line(new Vector2D(2, -1), new Vector2D(2, 1));
        assertEquals(Side.BOTH, s.side(cut));
    }

    @Test
    public void testSideParallelLineOnHyperplane() throws Exception {
        SubLine s = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        Line same = new Line(new Vector2D(1, 0), new Vector2D(3, 0));
        assertEquals(Side.HYPER, s.side(same));
    }

    @Test
    public void testSideParallelLineAbove() throws Exception {
        SubLine s = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        Line above = new Line(new Vector2D(0, 1), new Vector2D(4, 1));
        assertEquals(Side.PLUS, s.side(above));
    }

    @Test
    public void testSideParallelLineBelow() throws Exception {
        SubLine s = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        Line below = new Line(new Vector2D(0, -1), new Vector2D(4, -1));
        assertEquals(Side.MINUS, s.side(below));
    }

    @Test
    public void testSplitCrossingLineReturnsBothParts() throws Exception {
        SubLine s = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        Line cut = new Line(new Vector2D(2, -1), new Vector2D(2, 1));
        assertNotNull(s.split(cut).getPlus());
        assertNotNull(s.split(cut).getMinus());
    }

    @Test
    public void testSplitParallelLineAbove() throws Exception {
        SubLine s = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        Line above = new Line(new Vector2D(0, 1), new Vector2D(4, 1));
        assertNotNull(s.split(above).getPlus());
        assertNull(s.split(above).getMinus());
    }

    @Test
    public void testSplitParallelLineBelow() throws Exception {
        SubLine s = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        Line below = new Line(new Vector2D(0, -1), new Vector2D(4, -1));
        assertNull(s.split(below).getPlus());
        assertNotNull(s.split(below).getMinus());
    }

    @Test
    public void testSplitCrossingPartsRetainLineSegments() throws Exception {
        SubLine s = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        Line cut = new Line(new Vector2D(2, -1), new Vector2D(2, 1));
        List<org.apache.commons.math3.geometry.euclidean.twod.Segment> plus =
            ((SubLine) s.split(cut).getPlus()).getSegments();
        List<org.apache.commons.math3.geometry.euclidean.twod.Segment> minus =
            ((SubLine) s.split(cut).getMinus()).getSegments();
        assertEquals(1, plus.size());
        assertEquals(1, minus.size());
        assertEquals(2.0, plus.get(0).getStart().getX(), 1e-12);
        assertEquals(2.0, minus.get(0).getEnd().getX(), 1e-12);
    }
}
```