package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

public class HypergeometricDistributionTest {
    @Test
    public void testConstructorRejectsNonpositivePopulation() throws Exception {
        try {
            new HypergeometricDistribution(0, 0, 0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) { }
    }

    @Test
    public void testConstructorRejectsNegativeSuccesses() throws Exception {
        try {
            new HypergeometricDistribution(5, -1, 0);
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) { }
    }

    @Test
    public void testConstructorRejectsNegativeSampleSize() throws Exception {
        try {
            new HypergeometricDistribution(5, 0, -1);
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) { }
    }

    @Test
    public void testConstructorRejectsSuccessesAbovePopulation() throws Exception {
        try {
            new HypergeometricDistribution(5, 6, 0);
            fail("expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException expected) { }
    }

    @Test
    public void testConstructorRejectsSampleAbovePopulation() throws Exception {
        try {
            new HypergeometricDistribution(5, 0, 6);
            fail("expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException expected) { }
    }

    @Test
    public void testParameterGetters() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(10, d.getPopulationSize());
        assertEquals(4, d.getNumberOfSuccesses());
        assertEquals(3, d.getSampleSize());
    }

    @Test
    public void testProbabilityOutsideSupportIsZero() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(0.0, d.probability(-1), 0.0);
        assertEquals(0.0, d.probability(4), 0.0);
    }

    @Test
    public void testProbabilityAtBothSupportEndpoints() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(5, 2, 3);
        assertEquals(0.1, d.probability(0), 1e-12);
        assertEquals(0.3, d.probability(2), 1e-12);
    }

    @Test
    public void testProbabilityInteriorValue() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(0.5, d.probability(1), 1e-12);
    }

    @Test
    public void testCumulativeProbabilityBelowSupport() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(0.0, d.cumulativeProbability(-1), 0.0);
    }

    @Test
    public void testCumulativeProbabilityAtAndAboveUpperSupport() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(1.0, d.cumulativeProbability(3), 0.0);
        assertEquals(1.0, d.cumulativeProbability(4), 0.0);
    }

    @Test
    public void testCumulativeProbabilityInterior() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(2.0 / 3.0, d.cumulativeProbability(1), 1e-12);
    }

    @Test
    public void testUpperCumulativeProbabilityAtLowerSupport() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(1.0, d.upperCumulativeProbability(0), 0.0);
    }

    @Test
    public void testUpperCumulativeProbabilityAboveSupport() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(0.0, d.upperCumulativeProbability(5), 0.0);
    }

    @Test
    public void testUpperCumulativeProbabilityInterior() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(5.0 / 6.0, d.upperCumulativeProbability(1), 1e-12);
    }

    @Test
    public void testMean() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(1.2, d.getNumericalMean(), 1e-12);
    }

    @Test
    public void testVariance() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(0.56, d.getNumericalVariance(), 1e-12);
        assertEquals(0.56, d.getNumericalVariance(), 1e-12);
    }

    @Test
    public void testSupportLowerBoundPositive() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(5, 4, 3);
        assertEquals(2, d.getSupportLowerBound());
    }

    @Test
    public void testSupportLowerBoundZero() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(0, d.getSupportLowerBound());
    }

    @Test
    public void testSupportUpperBoundUsesSmallerParameter() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertEquals(3, d.getSupportUpperBound());
    }

    @Test
    public void testSupportIsConnected() throws Exception {
        HypergeometricDistribution d = new HypergeometricDistribution(10, 4, 3);
        assertTrue(d.isSupportConnected());
    }
}
