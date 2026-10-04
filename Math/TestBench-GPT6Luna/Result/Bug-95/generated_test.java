package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathException;
import org.apache.commons.math.special.Beta;

public class FDistributionImplTest {
    @Test
    public void testConstructorStoresDegreesOfFreedom() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(4.0, 8.0);
        assertEquals(4.0, distribution.getNumeratorDegreesOfFreedom(), 0.0);
        assertEquals(8.0, distribution.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testNumeratorSetterUpdatesValue() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(2.0, 5.0);
        distribution.setNumeratorDegreesOfFreedom(7.0);
        assertEquals(7.0, distribution.getNumeratorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testDenominatorSetterUpdatesValue() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(2.0, 5.0);
        distribution.setDenominatorDegreesOfFreedom(9.0);
        assertEquals(9.0, distribution.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testZeroNumeratorDegreesRejected() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(2.0, 5.0);
        try {
            distribution.setNumeratorDegreesOfFreedom(0.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(2.0, distribution.getNumeratorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testNegativeNumeratorDegreesRejected() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(2.0, 5.0);
        try {
            distribution.setNumeratorDegreesOfFreedom(-1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(2.0, distribution.getNumeratorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testSmallPositiveNumeratorDegreesAccepted() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(2.0, 5.0);
        distribution.setNumeratorDegreesOfFreedom(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, distribution.getNumeratorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testZeroDenominatorDegreesRejected() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(2.0, 5.0);
        try {
            distribution.setDenominatorDegreesOfFreedom(0.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(5.0, distribution.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testNegativeDenominatorDegreesRejected() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(2.0, 5.0);
        try {
            distribution.setDenominatorDegreesOfFreedom(-1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(5.0, distribution.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testSmallPositiveDenominatorDegreesAccepted() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(2.0, 5.0);
        distribution.setDenominatorDegreesOfFreedom(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, distribution.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test
    public void testCdfAtNegativeInputIsZero() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(4.0, 8.0);
        assertEquals(0.0, distribution.cumulativeProbability(-1.0), 0.0);
    }

    @Test
    public void testCdfAtZeroIsZero() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(4.0, 8.0);
        assertEquals(0.0, distribution.cumulativeProbability(0.0), 0.0);
    }

    @Test
    public void testCdfMatchesRegularizedBetaForPositiveInput() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(4.0, 8.0);
        double expected = Beta.regularizedBeta((4.0 * 1.5) / (8.0 + 4.0 * 1.5),
                0.5 * 4.0, 0.5 * 8.0);
        assertEquals(expected, distribution.cumulativeProbability(1.5), 1e-14);
    }

    @Test
    public void testCdfUsesUpdatedDegreesOfFreedom() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(2.0, 5.0);
        distribution.setNumeratorDegreesOfFreedom(6.0);
        distribution.setDenominatorDegreesOfFreedom(10.0);
        double expected = Beta.regularizedBeta((6.0 * 2.0) / (10.0 + 6.0 * 2.0),
                0.5 * 6.0, 0.5 * 10.0);
        assertEquals(expected, distribution.cumulativeProbability(2.0), 1e-14);
    }

    @Test
    public void testInverseAtZeroIsZero() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(4.0, 8.0);
        assertEquals(0.0, distribution.inverseCumulativeProbability(0.0), 0.0);
    }

    @Test
    public void testInverseAtOneIsPositiveInfinity() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(4.0, 8.0);
        assertEquals(Double.POSITIVE_INFINITY,
                distribution.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseAtInteriorProbabilityInvertsCdf() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(4.0, 8.0);
        double x = distribution.inverseCumulativeProbability(0.5);
        assertEquals(0.5, distribution.cumulativeProbability(x), 1e-7);
    }

    @Test
    public void testInverseRejectsProbabilityAboveOne() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(4.0, 8.0);
        try {
            distribution.inverseCumulativeProbability(1.1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testInverseRejectsNegativeProbability() throws Exception {
        FDistributionImpl distribution = new FDistributionImpl(4.0, 8.0);
        try {
            distribution.inverseCumulativeProbability(-0.1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }
}
