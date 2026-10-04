package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.special.Beta;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.exception.NumberIsTooLargeException;

public class FDistributionTest {
    @Test
    public void testDegreesOfFreedom() throws Exception {
        FDistribution d = new FDistribution(3, 7);
        assertEquals(3.0, d.getNumeratorDegreesOfFreedom(), 0.0);
        assertEquals(7.0, d.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testRejectsZeroNumeratorDegreesOfFreedom() throws Exception {
        try {
            new FDistribution(0, 5);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) { }
    }

    @Test
    public void testRejectsZeroDenominatorDegreesOfFreedom() throws Exception {
        try {
            new FDistribution(3, 0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) { }
    }

    @Test
    public void testNegativeNumeratorDensityOfFreedomRejected() throws Exception {
        try {
            new FDistribution(-1, 5);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) { }
    }

    @Test
    public void testNegativeDenominatorDegreesOfFreedomRejected() throws Exception {
        try {
            new FDistribution(3, -1);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) { }
    }

    @Test
    public void testCumulativeProbabilityAtZeroAndBelow() throws Exception {
        FDistribution d = new FDistribution(3, 7);
        assertEquals(0.0, d.cumulativeProbability(0), 0.0);
        assertEquals(0.0, d.cumulativeProbability(-1), 0.0);
    }

    @Test
    public void testCumulativeProbabilityPositiveInput() throws Exception {
        FDistribution d = new FDistribution(2, 4);
        double expected = Beta.regularizedBeta(0.5, 1.0, 2.0);
        assertEquals(expected, d.cumulativeProbability(2), 1e-14);
    }

    @Test
    public void testCumulativeProbabilityImmediatelyPositive() throws Exception {
        FDistribution d = new FDistribution(2, 4);
        double x = Double.MIN_VALUE;
        double expected = Beta.regularizedBeta((2 * x) / (4 + 2 * x), 1.0, 2.0);
        assertEquals(expected, d.cumulativeProbability(x), 1e-14);
    }

    @Test
    public void testDensityAtOneForTwoDegreesOfFreedom() throws Exception {
        FDistribution d = new FDistribution(2, 2);
        assertEquals(0.25, d.density(1), 1e-14);
    }

    @Test
    public void testDensityAtZero() throws Exception {
        FDistribution d = new FDistribution(2, 2);
        assertTrue(Double.isNaN(d.density(0)));
    }

    @Test
    public void testMeanWhenDenominatorDegreesOfFreedomExceedTwo() throws Exception {
        FDistribution d = new FDistribution(3, 4);
        assertEquals(2.0, d.getNumericalMean(), 0.0);
    }

    @Test
    public void testMeanAtDenominatorDegreesOfFreedomTwoIsUndefined() throws Exception {
        FDistribution d = new FDistribution(3, 2);
        assertTrue(Double.isNaN(d.getNumericalMean()));
    }

    @Test
    public void testVarianceWhenDenominatorDegreesOfFreedomExceedFour() throws Exception {
        FDistribution d = new FDistribution(2, 6);
        assertEquals(6.75, d.getNumericalVariance(), 1e-14);
    }

    @Test
    public void testVarianceAtDenominatorDegreesOfFreedomFourIsUndefined() throws Exception {
        FDistribution d = new FDistribution(2, 4);
        assertTrue(Double.isNaN(d.getNumericalVariance()));
    }

    @Test
    public void testVarianceIsCachedValueAcrossCalls() throws Exception {
        FDistribution d = new FDistribution(2, 6);
        assertEquals(d.getNumericalVariance(), d.getNumericalVariance(), 0.0);
    }

    @Test
    public void testSupportBounds() throws Exception {
        FDistribution d = new FDistribution(2, 6);
        assertEquals(0.0, d.getSupportLowerBound(), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, d.getSupportUpperBound(), 0.0);
    }

    @Test
    public void testSupportInclusivityAndConnectedness() throws Exception {
        FDistribution d = new FDistribution(2, 6);
        assertFalse(d.isSupportLowerBoundInclusive());
        assertFalse(d.isSupportUpperBoundInclusive());
        assertTrue(d.isSupportConnected());
    }
}
