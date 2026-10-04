package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;

public class MultivariateNormalDistributionTest {

    /** Helper to calculate the expected density value for a given input. */
    private double calculateExpectedDensity(final double[] means, final double[][] covariances, final double[] values) {
        final int dim = means.length;
        final RealMatrix covMatrix = new Array2DRowRealMatrix(covariances);
        final EigenDecomposition covMatDec = new EigenDecomposition(covMatrix);
        final double det = covMatDec.getDeterminant();
        final RealMatrix invCov = covMatDec.getSolver().getInverse();

        // Calculate the exponent term
        final double[] centered = new double[dim];
        for (int i = 0; i < dim; i++) {
            centered[i] = values[i] - means[i];
        }
        final double[] preMultiplied = invCov.preMultiply(centered);
        double sum = 0;
        for (int i = 0; i < dim; i++) {
            sum += preMultiplied[i] * centered[i];
        }
        final double exponentTerm = FastMath.exp(-0.5 * sum);

        // Calculate the full density
        return FastMath.pow(2 * FastMath.PI, -0.5 * dim) *
               FastMath.pow(det, -0.5) *
               exponentTerm;
    }

    @Test
    public void testConstructorWithValidInputs() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        final RandomGenerator rng = new Well19937c();
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(rng, means, covariances);
        assertNotNull(dist);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testConstructorMismatchedMeansCovariancesRows() {
        final double[] means = {0.0};
        final double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        new MultivariateNormalDistribution(means, covariances);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testConstructorMismatchedCovariancesColumns() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{1.0}, {0.0}};
        new MultivariateNormalDistribution(means, covariances);
    }

    @Test(expected = SingularMatrixException.class)
    public void testConstructorSingularCovarianceMatrix() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{1.0, 1.0}, {1.0, 1.0}};
        new MultivariateNormalDistribution(means, covariances);
    }
    
    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testConstructorNonPositiveDefiniteMatrix() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{1.0, 0.0}, {0.0, -1.0}};
        new MultivariateNormalDistribution(means, covariances);
    }

    @Test
    public void testGetMeans() {
        final double[] means = {1.0, 2.0};
        final double[][] covariances = {{1.0, 0.5}, {0.5, 2.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertArrayEquals(means, dist.getMeans(), 0.0);
    }

    @Test
    public void testGetCovariances() {
        final double[] means = {0.0};
        final double[][] covariances = {{4.0}};
        final RealMatrix expectedCovariances = new Array2DRowRealMatrix(covariances);
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertEquals(expectedCovariances, dist.getCovariances());
    }

    @Test
    public void testDensity1D() {
        final double[] means = {0.0};
        final double[][] covariances = {{1.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        final double x = 0.0;
        final double expectedDensity = 1.0 / FastMath.sqrt(2 * FastMath.PI);
        assertEquals(expectedDensity, dist.density(new double[]{x}), 1e-9);
    }
    
    @Test
    public void testDensity2D() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        final double[] vals = {0.0, 0.0};
        final double expectedDensity = 1.0 / (2 * FastMath.PI);
        assertEquals(expectedDensity, dist.density(vals), 1e-9);
    }

    @Test
    public void testDensity2DWithCorrelation() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{1.0, 0.5}, {0.5, 1.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        final double[] vals = {0.0, 0.0};
        final double det = 1.0 - 0.5 * 0.5; // 0.75
        final double expectedDensity = 1.0 / (2 * FastMath.PI * FastMath.sqrt(det));
        assertEquals(expectedDensity, dist.density(vals), 1e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testDensityMismatchedDimension() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        dist.density(new double[]{1.0});
    }

    @Test
    public void testGetStandardDeviations() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{4.0, 0.0}, {0.0, 9.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertArrayEquals(new double[]{2.0, 3.0}, dist.getStandardDeviations(), 1e-9);
    }

    @Test
    public void testSample() {
        final double[] means = {1.0, 2.0};
        final double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        final double[] sample = dist.sample();
        assertEquals(2, sample.length);
        // For a standard normal distribution centered at 0 with std dev 1, 99.7% of values are within [-3, 3].
        // With means and covariances, it's more complex, but we can still check for gross errors.
        assertTrue(sample[0] > -10.0 && sample[0] < 10.0);
        assertTrue(sample[1] > -10.0 && sample[1] < 10.0);
    }
    
    @Test
    public void testSampleWithDifferentRNG() {
        final double[] means = {0.0};
        final double[][] covariances = {{1.0}};
        final RandomGenerator rng1 = new Well19937c(1234);
        final RandomGenerator rng2 = new Well19937c(5678);
        final MultivariateNormalDistribution dist1 = new MultivariateNormalDistribution(rng1, means, covariances);
        final MultivariateNormalDistribution dist2 = new MultivariateNormalDistribution(rng2, means, covariances);
        
        double[] sample1 = dist1.sample();
        double[] sample2 = dist2.sample();
        
        // Samples should be different due to different RNG seeds
        assertNotEquals(sample1[0], sample2[0], 1e-9);
    }
    
    @Test
    public void testSampleSameRNGSeed() {
        final double[] means = {0.0};
        final double[][] covariances = {{1.0}};
        final RandomGenerator rng = new Well19937c(1234);
        // Create two distributions using the same RNG instance. They should produce the same sequence.
        final MultivariateNormalDistribution dist1 = new MultivariateNormalDistribution(rng, means, covariances);
        final MultivariateNormalDistribution dist2 = new MultivariateNormalDistribution(rng, means, covariances);
        
        double[] sample1 = dist1.sample();
        double[] sample2 = dist2.sample();
        
        assertEquals(sample1[0], sample2[0], 1e-9);
    }

    @Test
    public void testMultivariateNormalDistribution1DIdentityCovariance() {
        final double[] means = {5.0};
        final double[][] covariances = {{1.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertEquals(1, dist.getDimension());
        assertEquals(5.0, dist.getMeans()[0], 1e-9);
        assertEquals(1.0, dist.getCovariances().getEntry(0, 0), 1e-9);
        assertEquals(1.0, dist.getStandardDeviations()[0], 1e-9);
    }

    @Test
    public void testMultivariateNormalDistribution2DIdentityCovariance() {
        final double[] means = {2.0, 3.0};
        final double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertEquals(2, dist.getDimension());
        assertArrayEquals(means, dist.getMeans(), 0.0);
        assertEquals(1.0, dist.getCovariances().getEntry(0, 0), 1e-9);
        assertEquals(0.0, dist.getCovariances().getEntry(0, 1), 1e-9);
        assertEquals(0.0, dist.getCovariances().getEntry(1, 0), 1e-9);
        assertEquals(1.0, dist.getCovariances().getEntry(1, 1), 1e-9);
        assertArrayEquals(new double[]{1.0, 1.0}, dist.getStandardDeviations(), 1e-9);
    }
    
    @Test
    public void testMultivariateNormalDistribution3DIdentityCovariance() {
        final double[] means = {1.0, 2.0, 3.0};
        final double[][] covariances = {{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertEquals(3, dist.getDimension());
        assertArrayEquals(means, dist.getMeans(), 0.0);
        assertArrayEquals(new double[]{1.0, 1.0, 1.0}, dist.getStandardDeviations(), 1e-9);
    }

    @Test
    public void testMultivariateNormalDistribution2DDiagonalCovariance() {
        final double[] means = {1.0, 1.0};
        final double[][] covariances = {{2.0, 0.0}, {0.0, 3.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertEquals(2, dist.getDimension());
        assertArrayEquals(means, dist.getMeans(), 0.0);
        assertArrayEquals(new double[]{FastMath.sqrt(2.0), FastMath.sqrt(3.0)}, dist.getStandardDeviations(), 1e-9);
    }

    @Test
    public void testMultivariateNormalDistribution2DNonDiagonalCovariance() {
        final double[] means = {1.0, 1.0};
        final double[][] covariances = {{2.0, 1.0}, {1.0, 3.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        assertEquals(2, dist.getDimension());
        assertArrayEquals(means, dist.getMeans(), 0.0);
        assertArrayEquals(new double[]{FastMath.sqrt(2.0), FastMath.sqrt(3.0)}, dist.getStandardDeviations(), 1e-9);
    }
    
    @Test
    public void testDensity1DWithOffsetAndScale() {
        final double[] means = {1.0};
        final double[][] covariances = {{4.0}}; // Std dev = 2
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        
        final double x = 3.0; // This is 1 std dev away from the mean (3.0 - 1.0 = 2.0)
        final double[] vals = {x};
        
        // Derive expected value using the formula
        double expectedDensity = calculateExpectedDensity(means, covariances, vals);
        
        assertEquals(expectedDensity, dist.density(vals), 1e-9);
    }

    @Test
    public void testDensity2DWithOffsetAndScale() {
        final double[] means = {1.0, 2.0};
        final double[][] covariances = {{4.0, 0.0}, {0.0, 9.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        
        final double[] vals = {1.0, 2.0}; // Mean values
        
        double expectedDensity = calculateExpectedDensity(means, covariances, vals);
        
        assertEquals(expectedDensity, dist.density(vals), 1e-9);
    }
    
    @Test
    public void testDensity2DWithCorrelationAndOffset() {
        final double[] means = {1.0, 1.0};
        final double[][] covariances = {{1.0, 0.5}, {0.5, 1.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        
        final double[] vals = {1.0, 1.0}; // Mean values
        
        double expectedDensity = calculateExpectedDensity(means, covariances, vals);
        
        assertEquals(expectedDensity, dist.density(vals), 1e-9);
    }

    @Test
    public void testLargeValues() {
        final double[] means = {1e10, 1e10};
        final double[][] covariances = {{1e10, 0.0}, {0.0, 1e10}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        
        final double[] vals = {1e10, 1e10};
        double expectedDensity = calculateExpectedDensity(means, covariances, vals);
        
        assertEquals(expectedDensity, dist.density(vals), 1e-9);
    }
    
    @Test
    public void testVerySmallValues() {
        final double[] means = {1e-10, 1e-10};
        final double[][] covariances = {{1e-10, 0.0}, {0.0, 1e-10}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        
        final double[] vals = {1e-10, 1e-10};
        double expectedDensity = calculateExpectedDensity(means, covariances, vals);
        
        assertEquals(expectedDensity, dist.density(vals), 1e-9);
    }
    
    @Test
    public void testMaxDoubleValuesInMeans() {
        final double[] means = {Double.MAX_VALUE, Double.MAX_VALUE};
        final double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        try {
            final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
            final double[] vals = {Double.MAX_VALUE, Double.MAX_VALUE};
            double expectedDensity = calculateExpectedDensity(means, covariances, vals);
            assertEquals(expectedDensity, dist.density(vals), 1e-9);
        } catch (Exception e) {
            // If exceptions are expected due to extreme values, catch them.
            fail("Constructor or density calculation failed with MAX_VALUE means: " + e.getMessage());
        }
    }
    
    @Test
    public void testMinDoubleValuesInMeans() {
        final double[] means = {Double.MIN_VALUE, Double.MIN_VALUE};
        final double[][] covariances = {{1.0, 0.0}, {0.0, 1.0}};
        try {
            final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
            final double[] vals = {Double.MIN_VALUE, Double.MIN_VALUE};
            double expectedDensity = calculateExpectedDensity(means, covariances, vals);
            assertEquals(expectedDensity, dist.density(vals), 1e-9);
        } catch (Exception e) {
            fail("Constructor or density calculation failed with MIN_VALUE means: " + e.getMessage());
        }
    }
    
    @Test
    public void testVerySmallCovarianceValues() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{1e-10, 0.0}, {0.0, 1e-10}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        
        final double[] vals = {0.0, 0.0};
        double expectedDensity = calculateExpectedDensity(means, covariances, vals);
        
        assertEquals(expectedDensity, dist.density(vals), 1e-9);
    }
    
    @Test
    public void testVeryLargeCovarianceValues() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{1e10, 0.0}, {0.0, 1e10}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        
        final double[] vals = {0.0, 0.0};
        double expectedDensity = calculateExpectedDensity(means, covariances, vals);
        
        assertEquals(expectedDensity, dist.density(vals), 1e-9);
    }
    
    @Test
    public void testCovarianceWithLargeOffDiagonal() {
        final double[] means = {0.0, 0.0};
        final double[][] covariances = {{2.0, 1.9}, {1.9, 2.0}};
        final MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, covariances);
        
        final double[] vals = {0.0, 0.0};
        double expectedDensity = calculateExpectedDensity(means, covariances, vals);
        
        assertEquals(expectedDensity, dist.density(vals), 1e-9);
    }
}
