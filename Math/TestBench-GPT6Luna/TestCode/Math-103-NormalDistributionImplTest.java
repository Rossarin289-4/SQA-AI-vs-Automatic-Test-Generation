package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.special.Erf;

public class NormalDistributionImplTest {
    @Test
    public void testDefaultParameters() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl();
        assertEquals(0.0, distribution.getMean(), 0.0);
        assertEquals(1.0, distribution.getStandardDeviation(), 0.0);
    }

    @Test
    public void testConstructorParameters() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(2.5, 3.0);
        assertEquals(2.5, distribution.getMean(), 0.0);
        assertEquals(3.0, distribution.getStandardDeviation(), 0.0);
    }

    @Test
    public void testSetMean() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl();
        distribution.setMean(-4.0);
        assertEquals(-4.0, distribution.getMean(), 0.0);
    }

    @Test
    public void testSetMeanToZero() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(3.0, 2.0);
        distribution.setMean(0.0);
        assertEquals(0.0, distribution.getMean(), 0.0);
    }

    @Test
    public void testSetPositiveStandardDeviation() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl();
        distribution.setStandardDeviation(2.5);
        assertEquals(2.5, distribution.getStandardDeviation(), 0.0);
    }

    @Test
    public void testRejectZeroStandardDeviation() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl();
        try {
            distribution.setStandardDeviation(0.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(1.0, distribution.getStandardDeviation(), 0.0);
    }

    @Test
    public void testRejectNegativeStandardDeviation() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl();
        try {
            distribution.setStandardDeviation(-1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(1.0, distribution.getStandardDeviation(), 0.0);
    }

    @Test
    public void testConstructorRejectsZeroStandardDeviation() throws Exception {
        try {
            new NormalDistributionImpl(1.0, 0.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCumulativeProbabilityAtMean() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(3.0, 2.0);
        assertEquals(0.5, distribution.cumulativeProbability(3.0), 1e-15);
    }

    @Test
    public void testCumulativeProbabilityOneStandardDeviationAboveMean() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(0.0, 1.0);
        assertEquals(0.8413447460685429, distribution.cumulativeProbability(1.0), 1e-12);
    }

    @Test
    public void testCumulativeProbabilityOneStandardDeviationBelowMean() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(0.0, 1.0);
        assertEquals(0.15865525393145707, distribution.cumulativeProbability(-1.0), 1e-12);
    }

    @Test
    public void testCumulativeProbabilityWithShiftedAndScaledDistribution() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(10.0, 2.0);
        assertEquals(0.8413447460685429, distribution.cumulativeProbability(12.0), 1e-12);
    }

    @Test
    public void testInverseProbabilityZero() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(2.0, 3.0);
        assertEquals(Double.NEGATIVE_INFINITY, distribution.inverseCumulativeProbability(0.0), 0.0);
    }

    @Test
    public void testInverseProbabilityOne() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(2.0, 3.0);
        assertEquals(Double.POSITIVE_INFINITY, distribution.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseProbabilityOneHalf() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(2.0, 3.0);
        assertEquals(2.0, distribution.inverseCumulativeProbability(0.5), 1e-8);
    }

    @Test
    public void testInverseProbabilityBelowHalf() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(0.0, 1.0);
        assertEquals(-1.0000002290142125,
                distribution.inverseCumulativeProbability(0.15865525393145707), 1e-12);
    }

    @Test
    public void testInverseProbabilityAboveHalf() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl(0.0, 1.0);
        assertEquals(1.0000002290142123,
                distribution.inverseCumulativeProbability(0.8413447460685429), 1e-12);
    }

    @Test
    public void testInverseProbabilityRejectsNegativeProbability() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl();
        try {
            distribution.inverseCumulativeProbability(-0.1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testInverseProbabilityRejectsProbabilityAboveOne() throws Exception {
        NormalDistributionImpl distribution = new NormalDistributionImpl();
        try {
            distribution.inverseCumulativeProbability(1.1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }
}
