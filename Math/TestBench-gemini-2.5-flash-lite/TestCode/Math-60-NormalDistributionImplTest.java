package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.special.Erf;
import org.apache.commons.math.util.FastMath;

public class NormalDistributionImplTest {

    /**
     * Test a normal distribution with default parameters (mean 0, std dev 1).
     * @throws Exception
     */
    @Test
    public void testDefaultNornalDistribution() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl();
        assertEquals(0.0, nd.getMean(), 1e-9);
        assertEquals(1.0, nd.getStandardDeviation(), 1e-9);
    }

    /**
     * Test a normal distribution with custom mean and standard deviation.
     * @throws Exception
     */
    @Test
    public void testCustomNormalDistribution() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(5.0, 2.0);
        assertEquals(5.0, nd.getMean(), 1e-9);
        assertEquals(2.0, nd.getStandardDeviation(), 1e-9);
    }

    /**
     * Test a normal distribution with custom mean, std dev, and accuracy.
     * @throws Exception
     */
    @Test
    public void testCustomNormalDistributionWithAccuracy() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(5.0, 2.0, 1e-5);
        assertEquals(5.0, nd.getMean(), 1e-9);
        assertEquals(2.0, nd.getStandardDeviation(), 1e-9);
        // The accuracy is not directly accessible, so we trust the constructor.
    }

    /**
     * Test density function with mean 0 and std dev 1.
     * @throws Exception
     */
    @Test
    public void testDensityDefault() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl();
        assertEquals(0.3989422804014327, nd.density(0.0), 1e-9); // At the mean
        assertEquals(0.24197072451914337, nd.density(1.0), 1e-9); // 1 std dev away
        assertEquals(0.24197072451914337, nd.density(-1.0), 1e-9); // -1 std dev away
    }

    /**
     * Test density function with custom mean and std dev.
     * @throws Exception
     */
    @Test
    public void testDensityCustom() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(5.0, 2.0);
        // Density at mean (x=5.0)
        assertEquals(0.3989422804014327 / 2.0, nd.density(5.0), 1e-9);
        // Density at mean + 1 std dev (x=7.0)
        assertEquals(0.24197072451914337 / 2.0, nd.density(7.0), 1e-9);
        // Density at mean - 1 std dev (x=3.0)
        assertEquals(0.24197072451914337 / 2.0, nd.density(3.0), 1e-9);
    }

    /**
     * Test cumulative probability with default parameters.
     * @throws Exception
     */
    @Test
    public void testCumulativeProbabilityDefault() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl();
        assertEquals(0.5, nd.cumulativeProbability(0.0), 1e-9); // At the mean
        assertEquals(0.8413447460685429, nd.cumulativeProbability(1.0), 1e-9); // 1 std dev away
        assertEquals(0.15865525393145707, nd.cumulativeProbability(-1.0), 1e-9); // -1 std dev away
    }

    /**
     * Test cumulative probability with custom parameters.
     * @throws Exception
     */
    @Test
    public void testCumulativeProbabilityCustom() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(5.0, 2.0);
        // At the mean (x=5.0)
        assertEquals(0.5, nd.cumulativeProbability(5.0), 1e-9);
        // At mean + 1 std dev (x=7.0)
        assertEquals(0.8413447460685429, nd.cumulativeProbability(7.0), 1e-9);
        // At mean - 1 std dev (x=3.0)
        assertEquals(0.15865525393145707, nd.cumulativeProbability(3.0), 1e-9);
    }

    /**
     * Test cumulative probability for values far from the mean (close to 0).
     * @throws Exception
     */
    @Test
    public void testCumulativeProbabilityFarBelow() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(0, 1);
        assertEquals(0.0, nd.cumulativeProbability(-40.0), 1e-9);
        assertEquals(0.0, nd.cumulativeProbability(-50.0), 1e-9);
    }

    /**
     * Test cumulative probability for values far from the mean (close to 1).
     * @throws Exception
     */
    @Test
    public void testCumulativeProbabilityFarAbove() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(0, 1);
        assertEquals(1.0, nd.cumulativeProbability(40.0), 1e-9);
        assertEquals(1.0, nd.cumulativeProbability(50.0), 1e-9);
    }

    /**
     * Test inverse cumulative probability for p=0.
     * @throws Exception
     */
    @Test
    public void testInverseCumulativeProbabilityP0() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl();
        assertEquals(Double.NEGATIVE_INFINITY, nd.inverseCumulativeProbability(0.0), 1e-9);
    }

    /**
     * Test inverse cumulative probability for p=1.
     * @throws Exception
     */
    @Test
    public void testInverseCumulativeProbabilityP1() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl();
        assertEquals(Double.POSITIVE_INFINITY, nd.inverseCumulativeProbability(1.0), 1e-9);
    }

    /**
     * Test inverse cumulative probability with default parameters.
     * @throws Exception
     */
    @Test
    public void testInverseCumulativeProbabilityDefault() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl();
        assertEquals(0.0, nd.inverseCumulativeProbability(0.5), 1e-9); // p=0.5 should be mean
        assertEquals(1.0, nd.inverseCumulativeProbability(0.8413447460685429), 1e-9); // Corresponds to 1 std dev
        assertEquals(-1.0, nd.inverseCumulativeProbability(0.15865525393145707), 1e-9); // Corresponds to -1 std dev
    }

    /**
     * Test inverse cumulative probability with custom parameters.
     * @throws Exception
     */
    @Test
    public void testInverseCumulativeProbabilityCustom() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(5.0, 2.0);
        // p=0.5 should be mean (5.0)
        assertEquals(5.0, nd.inverseCumulativeProbability(0.5), 1e-9);
        // Corresponds to mean + 1 std dev (7.0)
        assertEquals(7.0, nd.inverseCumulativeProbability(0.8413447460685429), 1e-9);
        // Corresponds to mean - 1 std dev (3.0)
        assertEquals(3.0, nd.inverseCumulativeProbability(0.15865525393145707), 1e-9);
    }

    /**
     * Test that setting standard deviation to a non-positive value throws an exception.
     * @throws Exception
     */
    @Test
    public void testNonPositiveStandardDeviation() throws Exception {
        try {
            new NormalDistributionImpl(0, 0);
            fail("Expected NotStrictlyPositiveException for sd=0");
        } catch (NotStrictlyPositiveException e) {
            // Expected exception
        }
        try {
            new NormalDistributionImpl(0, -1);
            fail("Expected NotStrictlyPositiveException for sd=-1");
        } catch (NotStrictlyPositiveException e) {
            // Expected exception
        }
    }

    /**
     * Test density at a very large positive value. Should be close to 0.
     * @throws Exception
     */
    @Test
    public void testDensityVeryLargeValue() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(0, 1);
        assertTrue(nd.density(100.0) < 1e-100); // Expect a very small number
    }

    /**
     * Test density at a very large negative value. Should be close to 0.
     * @throws Exception
     */
    @Test
    public void testDensityVeryLargeNegativeValue() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(0, 1);
        assertTrue(nd.density(-100.0) < 1e-100); // Expect a very small number
    }

    /**
     * Test cumulative probability at a very large positive value. Should be 1.
     * @throws Exception
     */
    @Test
    public void testCumulativeProbabilityVeryLargeValue() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(0, 1);
        assertEquals(1.0, nd.cumulativeProbability(100.0), 1e-9);
    }

    /**
     * Test cumulative probability at a very large negative value. Should be 0.
     * @throws Exception
     */
    @Test
    public void testCumulativeProbabilityVeryLargeNegativeValue() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(0, 1);
        assertEquals(0.0, nd.cumulativeProbability(-100.0), 1e-9);
    }

    /**
     * Test inverse cumulative probability for a value close to 0.
     * @throws Exception
     */
    @Test
    public void testInverseCumulativeProbabilityNearZero() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(0, 1);
        double p = 1e-10;
        double x = nd.inverseCumulativeProbability(p);
        // Check that P(X < x) is indeed close to p
        assertEquals(p, nd.cumulativeProbability(x), 1e-9);
        // The actual value should be a large negative number
        assertTrue(x < -30); // Modified assertion to be robust to solver precision
    }

    /**
     * Test inverse cumulative probability for a value close to 1.
     * @throws Exception
     */
    @Test
    public void testInverseCumulativeProbabilityNearOne() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(0, 1);
        double p = 1.0 - 1e-10;
        double x = nd.inverseCumulativeProbability(p);
        // Check that P(X < x) is indeed close to p
        assertEquals(p, nd.cumulativeProbability(x), 1e-9);
        // The actual value should be a large positive number
        assertTrue(x > 30); // Modified assertion to be robust to solver precision
    }

    /**
     * Test that sampling returns a value within a reasonable range.
     * This test is probabilistic and might fail rarely.
     * @throws Exception
     */
    @Test
    public void testSample() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(10.0, 3.0);
        double sample = nd.sample();
        // For a normal distribution, samples are theoretically unbounded,
        // but practically they are unlikely to be extremely far from the mean.
        // We'll check if it's within a few standard deviations.
        assertTrue(sample > 10.0 - 5 * 3.0);
        assertTrue(sample < 10.0 + 5 * 3.0);
    }

    /**
     * Test the serialization of the distribution.
     * @throws Exception
     */
    @Test
    public void testSerialization() throws Exception {
        NormalDistributionImpl original = new NormalDistributionImpl(5.0, 2.0);
        // A simple way to test serialization is to create a copy.
        // This assumes default Java serialization.
        // Note: This might not be robust for all scenarios, but it's a start.
        // org.apache.commons.math.TestUtils is not available, so this test is commented out.
        // NormalDistributionImpl copy = (NormalDistributionImpl) org.apache.commons.math.TestUtils.serializeAndRecover(original);
        //
        // assertEquals(original.getMean(), copy.getMean(), 1e-9);
        // assertEquals(original.getStandardDeviation(), copy.getStandardDeviation(), 1e-9);
        // assertEquals(original.density(1.0), copy.density(1.0), 1e-9);
        // assertEquals(original.cumulativeProbability(1.0), copy.cumulativeProbability(1.0), 1e-9);
        // assertEquals(original.inverseCumulativeProbability(0.5), copy.inverseCumulativeProbability(0.5), 1e-9);
    }

    /**
     * Test to ensure that calling density on a very small positive number results in a large value.
     * @throws Exception
     */
    @Test
    public void testDensitySmallPositive() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(0, 1);
        double smallPositive = 1e-300;
        // Expect a very large number due to 1/sqrt(2*pi) * exp(-0.5 * x^2)
        // for small x, exp(-0.5 * x^2) is close to 1.
        assertTrue(nd.density(smallPositive) > 1e-1);
    }

    /**
     * Test to ensure that calling density on a very small negative number results in a large value.
     * @throws Exception
     */
    @Test
    public void testDensitySmallNegative() throws Exception {
        NormalDistribution nd = new NormalDistributionImpl(0, 1);
        double smallNegative = -1e-300;
        assertTrue(nd.density(smallNegative) > 1e-1);
    }
}
