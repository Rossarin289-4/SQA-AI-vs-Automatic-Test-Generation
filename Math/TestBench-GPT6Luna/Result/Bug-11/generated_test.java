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
    @Test
    public void testMeansAreReturnedAndCopied() throws Exception {
        double[] means = {2.0, -3.0};
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(means, new double[][] {{1.0, 0.0}, {0.0, 4.0}});
        means[0] = 99.0;
        assertArrayEquals(new double[] {2.0, -3.0}, d.getMeans(), 0.0);
        double[] result = d.getMeans();
        result[1] = 99.0;
        assertArrayEquals(new double[] {2.0, -3.0}, d.getMeans(), 0.0);
    }

    @Test
    public void testCovariancesAreReturnedAsCopy() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new double[] {0.0, 0.0},
                new double[][] {{2.0, 0.5}, {0.5, 3.0}});
        RealMatrix first = d.getCovariances();
        assertEquals(2.0, first.getEntry(0, 0), 0.0);
        assertEquals(0.5, first.getEntry(0, 1), 0.0);
        first.setEntry(0, 0, 77.0);
        assertEquals(2.0, d.getCovariances().getEntry(0, 0), 0.0);
    }

    @Test
    public void testStandardDeviationsForDiagonalCovariance() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new double[] {0.0, 0.0},
                new double[][] {{4.0, 0.0}, {0.0, 9.0}});
        assertArrayEquals(new double[] {2.0, 3.0}, d.getStandardDeviations(), 0.0);
    }

    @Test
    public void testStandardDeviationsForPositiveDiagonalEntries() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new double[] {0.0, 0.0},
                new double[][] {{1.0, 0.0}, {0.0, 4.0}});
        assertArrayEquals(new double[] {1.0, 2.0}, d.getStandardDeviations(), 0.0);
    }

    @Test
    public void testDensityAtMeanForOneDimension() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new double[] {0.0}, new double[][] {{4.0}});
        assertEquals(1.0 / (2.0 * Math.sqrt(2.0 * Math.PI)), d.density(new double[] {0.0}), 1e-12);
    }

    @Test
    public void testDensityAtOneStandardDeviation() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new double[] {0.0}, new double[][] {{4.0}});
        double expected = Math.exp(-0.5) / (2.0 * Math.sqrt(2.0 * Math.PI));
        assertEquals(expected, d.density(new double[] {2.0}), 1e-12);
    }

    @Test
    public void testDensityIsSymmetricAroundMean() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new double[] {3.0}, new double[][] {{2.0}});
        assertEquals(d.density(new double[] {2.0}), d.density(new double[] {4.0}), 1e-14);
    }

    @Test
    public void testDensityForIndependentTwoDimensions() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new double[] {0.0, 0.0},
                new double[][] {{1.0, 0.0}, {0.0, 4.0}});
        double expected = Math.exp(-0.5) / (4.0 * Math.PI);
        assertEquals(expected, d.density(new double[] {1.0, 0.0}), 1e-12);
    }

    @Test
    public void testDensityRejectsOneValueForTwoDimensions() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new double[] {0.0, 0.0},
                new double[][] {{1.0, 0.0}, {0.0, 1.0}});
        try {
            d.density(new double[] {1.0});
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            assertEquals(2, expected.getDimension());
        }
    }

    @Test
    public void testDensityRejectsThreeValuesForTwoDimensions() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new double[] {0.0, 0.0},
                new double[][] {{1.0, 0.0}, {0.0, 1.0}});
        try {
            d.density(new double[] {1.0, 2.0, 3.0});
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            assertEquals(2, expected.getDimension());
        }
    }

    @Test
    public void testRejectsCovarianceWithWrongNumberOfRows() throws Exception {
        try {
            new MultivariateNormalDistribution(new double[] {0.0, 0.0},
                new double[][] {{1.0, 0.0}});
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            assertEquals(2, expected.getDimension());
        }
    }

    @Test
    public void testRejectsCovarianceRowWithWrongLength() throws Exception {
        try {
            new MultivariateNormalDistribution(new double[] {0.0, 0.0},
                new double[][] {{1.0, 0.0}, {0.0}});
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            assertEquals(2, expected.getDimension());
        }
    }

    @Test
    public void testSingularCovarianceConstructionCompletes() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new double[] {0.0, 0.0},
                new double[][] {{1.0, 1.0}, {1.0, 1.0}});
        assertArrayEquals(new double[] {0.0, 0.0}, d.getMeans(), 0.0);
    }

    @Test
    public void testRejectsNegativeVariance() throws Exception {
        try {
            new MultivariateNormalDistribution(new double[] {0.0}, new double[][] {{-1.0}});
            fail("expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException expected) {
            assertEquals(0, expected.getRow());
            assertEquals(0.0, expected.getThreshold(), 0.0);
        }
    }

    @Test
    public void testSampleHasConfiguredDimensionAndFiniteValues() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new Well19937c(123L), new double[] {2.0, -1.0},
                new double[][] {{1.0, 0.0}, {0.0, 4.0}});
        double[] sample = d.sample();
        assertEquals(2, sample.length);
        assertFalse(Double.isNaN(sample[0]));
        assertFalse(Double.isInfinite(sample[0]));
        assertFalse(Double.isNaN(sample[1]));
        assertFalse(Double.isInfinite(sample[1]));
    }

    @Test
    public void testSampleUsesConfiguredMeanForPositiveCovariance() throws Exception {
        MultivariateNormalDistribution d =
            new MultivariateNormalDistribution(new Well19937c(123L), new double[] {2.0, -1.0},
                new double[][] {{1.0, 0.0}, {0.0, 4.0}});
        double[] sample = d.sample();
        assertEquals(2, sample.length);
        assertEquals(2.0, d.getMeans()[0], 0.0);
        assertEquals(-1.0, d.getMeans()[1], 0.0);
    }
}
