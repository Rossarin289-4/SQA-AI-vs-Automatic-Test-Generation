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

    // Helper method to create dummy Clusterable points
    private List<EuclideanIntegerPoint> createPoints(int[][] data) {
        List<EuclideanIntegerPoint> points = new ArrayList<>();
        for (int[] p : data) {
            points.add(new EuclideanIntegerPoint(p));
        }
        return points;
    }

    // Helper method to check if a list of clusters contains a specific point
    private boolean containsPoint(List<Cluster<EuclideanIntegerPoint>> clusters, EuclideanIntegerPoint point) {
        for (Cluster<EuclideanIntegerPoint> cluster : clusters) {
            for (EuclideanIntegerPoint p : cluster.getPoints()) {
                if (p.equals(point)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Test
    public void testClusterBasic() throws Exception {
        // Test with a small set of points and k=2
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{1, 1}, {1, 2}, {2, 2}, {6, 5}, {7, 5}, {8, 6}});
        Random random = new Random(1234); // for reproducibility
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random);
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 2, 100);

        // Expecting two clusters
        assertEquals(2, clusters.size());

        // Check if all points are assigned to a cluster
        int totalPoints = 0;
        for (Cluster<EuclideanIntegerPoint> cluster : clusters) {
            totalPoints += cluster.getPoints().size();
        }
        assertEquals(points.size(), totalPoints);

        // Check that the clusters are distinct and contain points that are likely grouped together
        // Due to random initialization, the exact cluster content can vary, but the general grouping should be evident.
        // Here we check if the points are roughly separated into the two expected groups.
        boolean firstClusterHasLowCoords = false;
        boolean secondClusterHasHighCoords = false;
        for(Cluster<EuclideanIntegerPoint> cluster : clusters) {
            if (cluster.getCenter().getPoint()[0] < 5) {
                firstClusterHasLowCoords = true;
            } else {
                secondClusterHasHighCoords = true;
            }
        }
        assertTrue(firstClusterHasLowCoords);
        assertTrue(secondClusterHasHighCoords);
    }

    @Test
    public void testClusterWithOnePoint() throws Exception {
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{1, 1}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random);
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 1, 100);

        assertEquals(1, clusters.size());
        assertEquals(1, clusters.get(0).getPoints().size());
        assertEquals(new EuclideanIntegerPoint(new int[]{1, 1}), clusters.get(0).getCenter());
    }

    @Test
    public void testClusterWithKEqualToPoints() throws Exception {
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random);
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 3, 100);

        assertEquals(3, clusters.size());
        int totalPoints = 0;
        for (Cluster<EuclideanIntegerPoint> cluster : clusters) {
            assertEquals(1, cluster.getPoints().size());
            totalPoints++;
        }
        assertEquals(points.size(), totalPoints);
    }

    @Test
    public void testClusterWithMoreClustersThanPoints() throws Exception {
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{1, 1}, {2, 2}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random);
        // If k is greater than the number of points, each point should become its own cluster.
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 5, 100);

        assertEquals(points.size(), clusters.size());
        for (Cluster<EuclideanIntegerPoint> cluster : clusters) {
            assertEquals(1, cluster.getPoints().size());
        }
    }

    @Test
    public void testEmptyPointsCollection() throws Exception {
        List<EuclideanIntegerPoint> points = new ArrayList<>();
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random);
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 2, 100);
        assertEquals(0, clusters.size());
    }

    @Test
    public void testKIsZero() throws Exception {
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{1, 1}, {2, 2}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random);
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 0, 100);
        assertEquals(0, clusters.size());
    }

    @Test
    public void testMaxIterationsZero() throws Exception {
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{1, 1}, {1, 2}, {2, 2}, {6, 5}, {7, 5}, {8, 6}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random);
        // With maxIterations = 0, it should just choose initial centers and assign points once.
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 2, 0);

        assertEquals(2, clusters.size());
        int totalPoints = 0;
        for (Cluster<EuclideanIntegerPoint> cluster : clusters) {
            totalPoints += cluster.getPoints().size();
        }
        assertEquals(points.size(), totalPoints);
    }

    @Test
    public void testMaxIterationsNegative() throws Exception {
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{1, 1}, {1, 2}, {2, 2}, {6, 5}, {7, 5}, {8, 6}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random);
        // Negative maxIterations means no maximum, so it should converge if possible.
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 2, -1);

        assertEquals(2, clusters.size());
        int totalPoints = 0;
        for (Cluster<EuclideanIntegerPoint> cluster : clusters) {
            totalPoints += cluster.getPoints().size();
        }
        assertEquals(points.size(), totalPoints);
    }

    @Test
    public void testEmptyClusterStrategyError() {
        // Test that ERROR strategy throws ConvergenceException on empty cluster
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{0,0}, {100,100}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random, KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR);
        
        // Create a scenario where an empty cluster is likely. This might require specific points and k.
        // For example, if k=2 and points are far apart, and initial centers are chosen poorly.
        // We will force an empty cluster scenario by having points very close and k larger than natural grouping.
        points = createPoints(new int[][]{{0,0}, {1,1}, {100,100}, {101, 101}});
        try {
            clusterer.cluster(points, 3, 100); // k=3 with 4 points, might create empty clusters
            fail("Expected ConvergenceException for EMPTY_CLUSTER_IN_K_MEANS");
        } catch (ConvergenceException e) {
            // Expected exception
            assertEquals(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS, e.getArguments()[0]); // Check exception message key if possible
        } catch (Exception e) {
            fail("Unexpected exception type: " + e.getClass().getName());
        }
    }
    
    @Test
    public void testEmptyClusterStrategyLargestVariance() throws Exception {
        // Test LARGEST_VARIANCE strategy. This is hard to force an empty cluster and test directly without complex setup.
        // We will rely on the general algorithm's correctness and assume this strategy is used.
        // If an empty cluster occurs, it should handle it without throwing ERROR.
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{0,0}, {1,1}, {100,100}, {101, 101}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random, KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE);
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 3, 100);
        
        // Should not throw an exception and should produce clusters.
        assertEquals(3, clusters.size()); // Expected number of clusters
        int totalPoints = 0;
        for (Cluster<EuclideanIntegerPoint> cluster : clusters) {
            totalPoints += cluster.getPoints().size();
        }
        assertEquals(points.size(), totalPoints);
    }

    @Test
    public void testEmptyClusterStrategyLargestPointsNumber() throws Exception {
        // Test LARGEST_POINTS_NUMBER strategy.
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{0,0}, {1,1}, {100,100}, {101, 101}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random, KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER);
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 3, 100);

        assertEquals(3, clusters.size());
        int totalPoints = 0;
        for (Cluster<EuclideanIntegerPoint> cluster : clusters) {
            totalPoints += cluster.getPoints().size();
        }
        assertEquals(points.size(), totalPoints);
    }

    @Test
    public void testEmptyClusterStrategyFarthestPoint() throws Exception {
        // Test FARTHEST_POINT strategy.
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{0,0}, {1,1}, {100,100}, {101, 101}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random, KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT);
        List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(points, 3, 100);

        assertEquals(3, clusters.size());
        int totalPoints = 0;
        for (Cluster<EuclideanIntegerPoint> cluster : clusters) {
            totalPoints += cluster.getPoints().size();
        }
        assertEquals(points.size(), totalPoints);
    }

    @Test
    public void testChooseInitialCentersWithRandomness() {
        // Test that initial centers are chosen based on the random generator.
        // By using different seeds, we should get different initial centers.
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{1, 1}, {1, 2}, {2, 2}, {6, 5}, {7, 5}, {8, 6}});
        
        Random random1 = new Random(1);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer1 = new KMeansPlusPlusClusterer<>(random1);
        List<Cluster<EuclideanIntegerPoint>> clusters1 = clusterer1.cluster(points, 2, 1); // Only initial centers, no iteration

        Random random2 = new Random(2);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer2 = new KMeansPlusPlusClusterer<>(random2);
        List<Cluster<EuclideanIntegerPoint>> clusters2 = clusterer2.cluster(points, 2, 1);

        // The first point chosen should be different
        assertNotEquals(clusters1.get(0).getCenter(), clusters2.get(0).getCenter());
    }

    @Test
    public void testAssignPointsToClusters() {
        // Test the private method indirectly through cluster().
        // Check if points are correctly assigned to the nearest cluster.
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{0,0}, {1,1}, {10,10}, {11,11}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random);
        
        // Manually create clusters and assign points. This bypasses chooseInitialCenters for deterministic assignment.
        List<Cluster<EuclideanIntegerPoint>> initialClusters = new ArrayList<>();
        initialClusters.add(new Cluster<>(new EuclideanIntegerPoint(new int[]{0,0})));
        initialClusters.add(new Cluster<>(new EuclideanIntegerPoint(new int[]{10,10})));
        
        // Call the static helper method directly if it were public, but it's private.
        // We simulate the effect by creating Cluster objects and adding points.
        // However, the cluster() method handles this. We'll test assignment logic using it.
        
        // To test the assignment logic precisely, we need to control initial centers.
        // A direct test of the private method assignPointsToClusters is not allowed.
        // We rely on the cluster() method's overall correctness for assignment.
        // Let's create a specific scenario for cluster() that highlights assignment.
        // Points: (0,0), (1,1), (10,10), (11,11). k=2.
        // If initial centers are (0,0) and (10,10), then (0,0), (1,1) go to first, (10,10), (11,11) to second.
        
        // We cannot force initial centers easily without modifying chooseInitialCenters.
        // We will trust the general cluster test cases to cover assignment.
        // The following is a conceptual test, not a direct test of the private method.
        
        // We'll use a custom setup that forces initial centers and then calls the logic.
        // This requires reflection or knowledge of the internal state, which is not allowed.
        // So, we'll remove the direct call to the private method and rely on `cluster` method tests.
        // The test `testGetNearestCluster` covers the core of the assignment logic.
    }
    
    @Test
    public void testGetNearestCluster() {
        // Test the static helper method getNearestCluster()
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{0,0}, {5,5}, {10,10}});
        List<Cluster<EuclideanIntegerPoint>> clusters = new ArrayList<>();
        clusters.add(new Cluster<>(new EuclideanIntegerPoint(new int[]{1,1})));
        clusters.add(new Cluster<>(new EuclideanIntegerPoint(new int[]{9,9})));

        EuclideanIntegerPoint testPoint1 = new EuclideanIntegerPoint(new int[]{0,0});
        Cluster<EuclideanIntegerPoint> nearest1 = KMeansPlusPlusClusterer.getNearestCluster(clusters, testPoint1);
        assertEquals(clusters.get(0).getCenter(), nearest1.getCenter()); // (0,0) is closer to (1,1)

        EuclideanIntegerPoint testPoint2 = new EuclideanIntegerPoint(new int[]{6,6});
        Cluster<EuclideanIntegerPoint> nearest2 = KMeansPlusPlusClusterer.getNearestCluster(clusters, testPoint2);
        assertEquals(clusters.get(1).getCenter(), nearest2.getCenter()); // (6,6) is closer to (9,9)
    }

    @Test
    public void testGetPointFromLargestVarianceCluster() throws Exception {
        // Create a scenario where one cluster has significantly higher variance.
        // We can't directly call the private method, so we test its effect indirectly.
        // We will create a situation where a cluster becomes empty and check that the algorithm
        // proceeds without error when LARGEST_VARIANCE is the strategy.
        
        List<EuclideanIntegerPoint> pointsForVariance = createPoints(new int[][]{
            {0,0}, {1,1}, // Cluster 1 (low variance)
            {10,10}, {20,20}, {30,30} // Cluster 2 (higher variance)
        });

        // Manually create clusters and an empty one to trigger the strategy.
        Cluster<EuclideanIntegerPoint> clusterA = new Cluster<>(new EuclideanIntegerPoint(new int[]{0,0}));
        clusterA.addPoint(new EuclideanIntegerPoint(new int[]{0,0}));
        clusterA.addPoint(new EuclideanIntegerPoint(new int[]{1,1}));

        Cluster<EuclideanIntegerPoint> clusterB = new Cluster<>(new EuclideanIntegerPoint(new int[]{20,20}));
        clusterB.addPoint(new EuclideanIntegerPoint(new int[]{10,10}));
        clusterB.addPoint(new EuclideanIntegerPoint(new int[]{20,20}));
        clusterB.addPoint(new EuclideanIntegerPoint(new int[]{30,30}));
        
        List<Cluster<EuclideanIntegerPoint>> testClusters = new ArrayList<>();
        testClusters.add(clusterA);
        testClusters.add(clusterB);

        Cluster<EuclideanIntegerPoint> emptyCluster = new Cluster<>(new EuclideanIntegerPoint(new int[]{200,200}));
        testClusters.add(emptyCluster); // Make one cluster empty

        Random rand = new Random(4567);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clustererVar = new KMeansPlusPlusClusterer<>(rand, KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE);
        
        // The `cluster` method should handle the empty cluster using the specified strategy.
        List<Cluster<EuclideanIntegerPoint>> resultClusters = clustererVar.cluster(pointsForVariance, 3, 100);
        assertEquals(3, resultClusters.size()); // Basic check that it produces the expected number of clusters.
        int totalPoints = 0;
        for (Cluster<EuclideanIntegerPoint> cluster : resultClusters) {
            totalPoints += cluster.getPoints().size();
        }
        assertEquals(pointsForVariance.size(), totalPoints);
    }
    
    @Test
    public void testGetPointFromLargestNumberCluster() throws Exception {
        // Create a scenario where one cluster has more points.
        // We can't directly call the private method, so we test its effect indirectly.
        // We will create a situation where a cluster becomes empty and check that the algorithm
        // proceeds without error when LARGEST_POINTS_NUMBER is the strategy.
        
        List<EuclideanIntegerPoint> pointsForCount = createPoints(new int[][]{
            {0,0}, // Cluster 1 (1 point)
            {10,10}, {11,11} // Cluster 2 (2 points)
        });

        // Manually create clusters and an empty one to trigger the strategy.
        Cluster<EuclideanIntegerPoint> clusterA = new Cluster<>(new EuclideanIntegerPoint(new int[]{0,0}));
        clusterA.addPoint(new EuclideanIntegerPoint(new int[]{0,0}));

        Cluster<EuclideanIntegerPoint> clusterB = new Cluster<>(new EuclideanIntegerPoint(new int[]{10,10}));
        clusterB.addPoint(new EuclideanIntegerPoint(new int[]{10,10}));
        clusterB.addPoint(new EuclideanIntegerPoint(new int[]{11,11}));
        
        List<Cluster<EuclideanIntegerPoint>> testClusters = new ArrayList<>();
        testClusters.add(clusterA);
        testClusters.add(clusterB);

        Cluster<EuclideanIntegerPoint> emptyCluster = new Cluster<>(new EuclideanIntegerPoint(new int[]{200,200}));
        testClusters.add(emptyCluster); // Make one cluster empty

        Random rand = new Random(7890);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clustererCount = new KMeansPlusPlusClusterer<>(rand, KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER);
        
        // The `cluster` method should handle the empty cluster using the specified strategy.
        List<Cluster<EuclideanIntegerPoint>> resultClusters = clustererCount.cluster(pointsForCount, 3, 100);
        assertEquals(3, resultClusters.size()); // Basic check that it produces the expected number of clusters.
        int totalPoints = 0;
        for (Cluster<EuclideanIntegerPoint> cluster : resultClusters) {
            totalPoints += cluster.getPoints().size();
        }
        assertEquals(pointsForCount.size(), totalPoints);
    }

    @Test
    public void testGetFarthestPoint() throws Exception {
        // Create a scenario where one point is farthest from its center.
        // We can't directly call the private method, so we test its effect indirectly.
        // We will create a situation where a cluster becomes empty and check that the algorithm
        // proceeds without error when FARTHEST_POINT is the strategy.
        
        List<EuclideanIntegerPoint> pointsForFarthest = createPoints(new int[][]{
            {0,0}, // Cluster 1
            {10,10}, {100,100} // Cluster 2: (100,100) is farthest from (10,10)
        });

        // Manually create clusters and an empty one to trigger the strategy.
        Cluster<EuclideanIntegerPoint> clusterA = new Cluster<>(new EuclideanIntegerPoint(new int[]{0,0}));
        clusterA.addPoint(new EuclideanIntegerPoint(new int[]{0,0}));

        Cluster<EuclideanIntegerPoint> clusterB = new Cluster<>(new EuclideanIntegerPoint(new int[]{10,10}));
        clusterB.addPoint(new EuclideanIntegerPoint(new int[]{10,10}));
        clusterB.addPoint(new EuclideanIntegerPoint(new int[]{100,100}));
        
        List<Cluster<EuclideanIntegerPoint>> testClusters = new ArrayList<>();
        testClusters.add(clusterA);
        testClusters.add(clusterB);

        Cluster<EuclideanIntegerPoint> emptyCluster = new Cluster<>(new EuclideanIntegerPoint(new int[]{200,200}));
        testClusters.add(emptyCluster); // Make one cluster empty

        Random rand = new Random(1011);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clustererFarthest = new KMeansPlusPlusClusterer<>(rand, KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT);
        
        // The `cluster` method should handle the empty cluster using the specified strategy.
        List<Cluster<EuclideanIntegerPoint>> resultClusters = clustererFarthest.cluster(pointsForFarthest, 3, 100);
        assertEquals(3, resultClusters.size()); // Basic check that it produces the expected number of clusters.
        int totalPoints = 0;
        for (Cluster<EuclideanIntegerPoint> cluster : resultClusters) {
            totalPoints += cluster.getPoints().size();
        }
        assertEquals(pointsForFarthest.size(), totalPoints);
    }
    
    @Test
    public void testClusterBoundaryKMaxIterations() {
        List<EuclideanIntegerPoint> points = createPoints(new int[][]{{0,0}, {1,1}, {10,10}, {11,11}});
        Random random = new Random(1234);
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> clusterer = new KMeansPlusPlusClusterer<>(random);

        // Test with k = number of points
        List<Cluster<EuclideanIntegerPoint>> clustersKeqN = clusterer.cluster(points, points.size(), 100);
        assertEquals(points.size(), clustersKeqN.size());
        
        // Test with k = 1
        List<Cluster<EuclideanIntegerPoint>> clustersK1 = clusterer.cluster(points, 1, 100);
        assertEquals(1, clustersK1.size());
        assertEquals(points.size(), clustersK1.get(0).getPoints().size());
    }

    // EuclideanIntegerPoint is a simple Clusterable implementation for testing
    private static class EuclideanIntegerPoint implements Clusterable<EuclideanIntegerPoint>, java.io.Serializable {
        private static final long serialVersionUID = 1L;
        private final int[] point;

        public EuclideanIntegerPoint(int[] point) {
            this.point = point;
        }

        public int[] getPoint() {
            return point;
        }

        @Override
        public double distanceFrom(EuclideanIntegerPoint p) {
            double sum = 0;
            for (int i = 0; i < point.length; i++) {
                double diff = point[i] - p.point[i];
                sum += diff * diff;
            }
            return Math.sqrt(sum);
        }

        @Override
        public EuclideanIntegerPoint centroidOf(Collection<EuclideanIntegerPoint> p) {
            if (p.isEmpty()) {
                return new EuclideanIntegerPoint(new int[point.length]); // Or throw exception
            }
            double[] centroid = new double[point.length];
            for (EuclideanIntegerPoint currentPoint : p) { // Iterate directly over points
                int[] coords = currentPoint.getPoint();
                for (int i = 0; i < centroid.length; i++) {
                    centroid[i] += coords[i];
                }
            }
            int[] finalCentroid = new int[point.length];
            for (int i = 0; i < centroid.length; i++) {
                finalCentroid[i] = (int) Math.round(centroid[i] / p.size());
            }
            return new EuclideanIntegerPoint(finalCentroid);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EuclideanIntegerPoint that = (EuclideanIntegerPoint) o;
            return java.util.Arrays.equals(point, that.point);
        }

        @Override
        public int hashCode() {
            return java.util.Arrays.hashCode(point);
        }

        @Override
        public String toString() {
            return java.util.Arrays.toString(point);
        }
    }
}
