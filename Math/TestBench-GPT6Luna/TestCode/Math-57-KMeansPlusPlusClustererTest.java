package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.stat.descriptive.moment.Variance;

public class KMeansPlusPlusClustererTest {
    @Test
    public void testSinglePointSingleCluster() throws Exception {
        Point p = new Point(3);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(1))
                .cluster(points(p), 1, 0);
        assertEquals(1, result.size());
        assertEquals(p, result.get(0).getCenter());
        assertEquals(1, result.get(0).getPoints().size());
    }

    @Test
    public void testZeroIterationsKeepsInitialCenter() throws Exception {
        Point a = new Point(0);
        Point b = new Point(10);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(1))
                .cluster(points(a, b), 1, 0);
        assertEquals(1, result.size());
        assertTrue(result.get(0).getCenter().equals(a)
                || result.get(0).getCenter().equals(b));
        assertEquals(2, result.get(0).getPoints().size());
    }

    @Test
    public void testOneIterationReplacesCenterWithCentroid() throws Exception {
        Point a = new Point(0);
        Point b = new Point(10);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(1))
                .cluster(points(a, b), 1, 1);
        assertEquals(1, result.size());
        assertEquals(new Point(5), result.get(0).getCenter());
        assertEquals(2, result.get(0).getPoints().size());
    }

    @Test
    public void testConvergedClusterRetainsBothPoints() throws Exception {
        Point a = new Point(0);
        Point b = new Point(2);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(1))
                .cluster(points(a, b), 1, 4);
        assertEquals(1, result.size());
        assertEquals(new Point(1), result.get(0).getCenter());
        assertEquals(2, result.get(0).getPoints().size());
    }

    @Test
    public void testNegativeIterationLimitRunsToConvergence() throws Exception {
        Point a = new Point(-2);
        Point b = new Point(2);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(1))
                .cluster(points(a, b), 1, -1);
        assertEquals(1, result.size());
        assertEquals(new Point(0), result.get(0).getCenter());
        assertEquals(2, result.get(0).getPoints().size());
    }

    @Test
    public void testTwoClustersSeparateDistantPoints() throws Exception {
        Point a = new Point(0);
        Point b = new Point(100);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(7))
                .cluster(points(a, b), 2, 5);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0).getPoints().size());
        assertEquals(1, result.get(1).getPoints().size());
        assertTrue((result.get(0).getCenter().equals(a)
                    && result.get(1).getCenter().equals(b))
                || (result.get(0).getCenter().equals(b)
                    && result.get(1).getCenter().equals(a)));
    }

    @Test
    public void testThreeClustersForThreeDistinctPoints() throws Exception {
        Point a = new Point(-10);
        Point b = new Point(0);
        Point c = new Point(10);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(13))
                .cluster(points(a, b, c), 3, 2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0).getPoints().size());
        assertEquals(1, result.get(1).getPoints().size());
        assertEquals(1, result.get(2).getPoints().size());
    }

    @Test
    public void testSingleClusterWithThreePointsHasMeanCenter() throws Exception {
        Point a = new Point(0);
        Point b = new Point(3);
        Point c = new Point(6);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(4))
                .cluster(points(a, b, c), 1, 1);
        assertEquals(1, result.size());
        assertEquals(new Point(3), result.get(0).getCenter());
        assertEquals(3, result.get(0).getPoints().size());
    }

    @Test
    public void testLargestPointsStrategyHandlesEmptyCluster() throws Exception {
        Point a = new Point(0);
        Point b = new Point(0);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(2),
                        KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER)
                .cluster(points(a, b), 2, 1);
        assertEquals(2, result.size());
        assertEquals(2, result.get(0).getPoints().size()
                + result.get(1).getPoints().size());
    }

    @Test
    public void testLargestVarianceStrategyHandlesEmptyCluster() throws Exception {
        Point a = new Point(0);
        Point b = new Point(0);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(2),
                        KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE)
                .cluster(points(a, b), 2, 1);
        assertEquals(2, result.size());
        assertEquals(2, result.get(0).getPoints().size()
                + result.get(1).getPoints().size());
    }

    @Test
    public void testFarthestPointStrategyHandlesEmptyCluster() throws Exception {
        Point a = new Point(0);
        Point b = new Point(0);
        List<Cluster<Point>> result =
                new KMeansPlusPlusClusterer<Point>(new Random(2),
                        KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT)
                .cluster(points(a, b), 2, 1);
        assertEquals(2, result.size());
        assertEquals(2, result.get(0).getPoints().size()
                + result.get(1).getPoints().size());
    }

    @Test
    public void testErrorStrategyThrowsForEmptyCluster() throws Exception {
        Point a = new Point(0);
        Point b = new Point(0);
        try {
            new KMeansPlusPlusClusterer<Point>(new Random(2),
                    KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR)
                    .cluster(points(a, b), 2, 1);
            fail("expected ConvergenceException");
        } catch (ConvergenceException expected) {
            assertNotNull(expected);
        }
    }

    private static Collection<Point> points(Point... values) {
        List<Point> result = new ArrayList<Point>();
        for (Point value : values) {
            result.add(value);
        }
        return result;
    }

    private static final class Point implements Clusterable<Point> {
        private final int value;

        private Point(int value) {
            this.value = value;
        }

        public double distanceFrom(Point other) {
            return Math.abs(value - other.value);
        }

        public Point centroidOf(Collection<Point> values) {
            int sum = 0;
            for (Point point : values) {
                sum += point.value;
            }
            return new Point(sum / values.size());
        }

        public boolean equals(Object other) {
            return other instanceof Point && value == ((Point) other).value;
        }

        public int hashCode() {
            return value;
        }
    }
}
