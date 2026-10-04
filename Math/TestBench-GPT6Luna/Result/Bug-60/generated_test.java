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
    @Test
    public void testDefaultConstructorParameters() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(0.0, d.getMean(), 0.0);
        assertEquals(1.0, d.getStandardDeviation(), 0.0);
    }

    @Test
    public void testExplicitConstructorParameters() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl(2.5, 3.0);
        assertEquals(2.5, d.getMean(), 0.0);
        assertEquals(3.0, d.getStandardDeviation(), 0.0);
    }

    @Test
    public void testCustomAccuracyConstructorParameters() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl(-4.0, 0.25, 0.01);
        assertEquals(-4.0, d.getMean(), 0.0);
        assertEquals(0.25, d.getStandardDeviation(), 0.0);
    }

    @Test
    public void testRejectsZeroStandardDeviation() throws Exception {
        try {
            new NormalDistributionImpl(0.0, 0.0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
        }
    }

    @Test
    public void testRejectsNegativeStandardDeviation() throws Exception {
        try {
            new NormalDistributionImpl(0.0, -1.0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
        }
    }

    @Test
    public void testSmallestPositiveStandardDeviationAccepted() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl(1.0, Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, d.getStandardDeviation(), 0.0);
    }

    @Test
    public void testDensityAtMeanForUnitDistribution() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(1.0 / Math.sqrt(2.0 * Math.PI), d.density(0.0), 1e-15);
    }

    @Test
    public void testDensityAtOneStandardDeviation() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(Math.exp(-0.5) / Math.sqrt(2.0 * Math.PI), d.density(1.0), 1e-15);
    }

    @Test
    public void testDensityUsesStandardDeviation() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl(2.0, 3.0);
        assertEquals(1.0 / (3.0 * Math.sqrt(2.0 * Math.PI)), d.density(2.0), 1e-15);
    }

    @Test
    public void testDensitySymmetry() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl(1.0, 2.0);
        assertEquals(d.density(-1.0), d.density(3.0), 1e-15);
    }

    @Test
    public void testCumulativeProbabilityAtMean() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl(3.0, 2.0);
        assertEquals(0.5, d.cumulativeProbability(3.0), 1e-15);
    }

    @Test
    public void testCumulativeProbabilityAtPositiveOneStandardDeviation() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(0.8413447460685429, d.cumulativeProbability(1.0), 1e-14);
    }

    @Test
    public void testCumulativeProbabilityAtNegativeOneStandardDeviation() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(0.15865525393145707, d.cumulativeProbability(-1.0), 1e-14);
    }

    @Test
    public void testCumulativeProbabilityAtFortyStandardDeviations() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(0.5 * (1.0 + Erf.erf(40.0 / Math.sqrt(2.0))),
                d.cumulativeProbability(40.0), 1e-15);
    }

    @Test
    public void testCumulativeProbabilityBeyondPositiveFortyStandardDeviations() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(1.0, d.cumulativeProbability(41.0), 0.0);
    }

    @Test
    public void testCumulativeProbabilityBeyondNegativeFortyStandardDeviations() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(0.0, d.cumulativeProbability(-41.0), 0.0);
    }

    @Test
    public void testInverseProbabilityZero() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(Double.NEGATIVE_INFINITY, d.inverseCumulativeProbability(0.0), 0.0);
    }

    @Test
    public void testInverseProbabilityOne() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(Double.POSITIVE_INFINITY, d.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseProbabilityOneHalf() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl(5.0, 2.0);
        assertEquals(5.0, d.inverseCumulativeProbability(0.5), 1e-9);
    }

    @Test
    public void testInverseProbabilityQuarter() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(-0.67448975, d.inverseCumulativeProbability(0.25), 1e-7);
    }

    @Test
    public void testInverseProbabilityThreeQuarters() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        assertEquals(0.67448975, d.inverseCumulativeProbability(0.75), 1e-7);
    }

    @Test
    public void testInverseProbabilityOutsideRange() throws Exception {
        NormalDistributionImpl d = new NormalDistributionImpl();
        try {
            d.inverseCumulativeProbability(-0.1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
