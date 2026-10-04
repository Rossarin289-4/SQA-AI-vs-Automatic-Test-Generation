package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.special.Gamma;
import org.apache.commons.math.util.MathUtils;
import org.apache.commons.math.util.FastMath;

public class PoissonDistributionImplTest {
    @Test
    public void testMeanPreservesConstructorValue() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(2.5);
        assertEquals(2.5, d.getMean(), 0.0);
    }

    @Test
    public void testMeanFromFullConstructor() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(7.25, 1e-9, 100);
        assertEquals(7.25, d.getMean(), 0.0);
    }

    @Test
    public void testZeroProbability() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(2.0);
        assertEquals(FastMath.exp(-2.0), d.probability(0), 1e-15);
    }

    @Test
    public void testNegativeProbabilityIsZero() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(2.0);
        assertEquals(0.0, d.probability(-1), 0.0);
    }

    @Test
    public void testMinimumIntProbabilityIsZero() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(2.0);
        assertEquals(0.0, d.probability(Integer.MIN_VALUE), 0.0);
    }

    @Test
    public void testMaximumIntProbabilityIsZero() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(2.0);
        assertEquals(0.0, d.probability(Integer.MAX_VALUE), 0.0);
    }

    @Test
    public void testPositiveProbability() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(1.0);
        assertEquals(FastMath.exp(-1.0), d.probability(1), 1e-14);
    }

    @Test
    public void testProbabilityAtTwo() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(2.0);
        assertEquals(2.0 * FastMath.exp(-2.0), d.probability(2), 1e-14);
    }

    @Test
    public void testCumulativeProbabilityBelowZero() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(2.0);
        assertEquals(0.0, d.cumulativeProbability(-1), 0.0);
    }

    @Test
    public void testCumulativeProbabilityAtMinimumInt() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(2.0);
        assertEquals(0.0, d.cumulativeProbability(Integer.MIN_VALUE), 0.0);
    }

    @Test
    public void testCumulativeProbabilityAtMaximumInt() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(2.0);
        assertEquals(1.0, d.cumulativeProbability(Integer.MAX_VALUE), 0.0);
    }

    @Test
    public void testCumulativeProbabilityAtZero() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(1.0);
        assertEquals(FastMath.exp(-1.0), d.cumulativeProbability(0), 1e-12);
    }

    @Test
    public void testCumulativeProbabilityAtOne() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(1.0);
        assertEquals(2.0 * FastMath.exp(-1.0), d.cumulativeProbability(1), 1e-12);
    }

    @Test
    public void testCumulativeProbabilityWithConfiguredConvergence() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(3.0, 1e-10, 1000);
        assertEquals(0.8152632445253689, d.cumulativeProbability(4), 1e-12);
    }

    @Test
    public void testNormalApproximationAtZero() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(1.0);
        assertEquals(0.308537538725987, d.normalApproximateProbability(0), 1e-7);
    }

    @Test
    public void testNormalApproximationAtOne() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(1.0);
        assertEquals(0.691462461274013, d.normalApproximateProbability(1), 1e-7);
    }

    @Test
    public void testNormalApproximationAtNegativeOne() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(1.0);
        assertEquals(0.06680720126885803, d.normalApproximateProbability(-1), 1e-7);
    }

    @Test
    public void testSampleIsNonnegative() throws Exception {
        PoissonDistributionImpl d = new PoissonDistributionImpl(1.0);
        int sample = d.sample();
        assertTrue(sample >= 0);
    }
}
