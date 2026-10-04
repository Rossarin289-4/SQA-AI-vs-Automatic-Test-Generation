package org.apache.commons.math.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.ChiSquaredDistribution;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.DistributionFactory;

public class ChiSquareTestImplTest {
    @Test
    public void testChiSquareWithoutRescaling() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        assertEquals(0.6, test.chiSquare(new double[] {10, 20}, new long[] {12, 18}), 1e-12);
    }

    @Test
    public void testChiSquareRescalesExpectedCounts() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        assertEquals(0.7, test.chiSquare(new double[] {10, 20}, new long[] {14, 21}), 1e-12);
    }

    @Test
    public void testChiSquareRescaleThresholdDoesNotRescaleAtBoundary() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        assertEquals(0.0, test.chiSquare(new double[] {1, 1}, new long[] {1, 1}), 1e-12);
    }

    @Test
    public void testChiSquareRejectsLengthBelowMinimum() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        try {
            test.chiSquare(new double[] {1}, new long[] {1});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testChiSquareRejectsMismatchedLengths() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        try {
            test.chiSquare(new double[] {1, 1}, new long[] {1});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testChiSquareRejectsZeroExpectedCount() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        try {
            test.chiSquare(new double[] {0, 1}, new long[] {0, 1});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testChiSquareRejectsNegativeObservedCount() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        try {
            test.chiSquare(new double[] {1, 1}, new long[] {-1, 1});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testChiSquareAcceptsZeroObservedCount() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        assertEquals(2.0, test.chiSquare(new double[] {1, 1}, new long[] {0, 2}), 1e-12);
    }

    @Test
    public void testChiSquareTestSetsDegreesOfFreedomAndReturnsPValue() throws Exception {
        ChiSquaredDistributionImpl distribution = new ChiSquaredDistributionImpl(1.0);
        ChiSquareTestImpl test = new ChiSquareTestImpl(distribution);
        double result = test.chiSquareTest(new double[] {10, 20}, new long[] {10, 20});
        assertEquals(1.0, distribution.getDegreesOfFreedom(), 0.0);
        assertEquals(1.0, result, 1e-12);
    }

    @Test
    public void testChiSquareDataSetsComparisonEqualTotals() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        assertEquals(6.666666666666667, test.chiSquareDataSetsComparison(
                new long[] {10, 20}, new long[] {20, 10}), 1e-12);
    }

    @Test
    public void testChiSquareDataSetsComparisonUnequalTotals() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        assertEquals(0.0, test.chiSquareDataSetsComparison(
                new long[] {10, 20}, new long[] {20, 40}), 1e-12);
    }

    @Test
    public void testChiSquareDataSetsComparisonRejectsLengthBelowMinimum() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        try {
            test.chiSquareDataSetsComparison(new long[] {1}, new long[] {1});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testChiSquareDataSetsComparisonRejectsMismatchedLengths() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        try {
            test.chiSquareDataSetsComparison(new long[] {1, 1}, new long[] {1});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testChiSquareDataSetsComparisonRejectsAllZeroSample() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        try {
            test.chiSquareDataSetsComparison(new long[] {0, 0}, new long[] {1, 1});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testChiSquareDataSetsComparisonRejectsBinZeroInBothSamples() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        try {
            test.chiSquareDataSetsComparison(new long[] {0, 1}, new long[] {0, 2});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testChiSquareDataSetsComparisonRejectsNegativeCount() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        try {
            test.chiSquareDataSetsComparison(new long[] {-1, 2}, new long[] {1, 2});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testChiSquareTestDataSetsComparisonSetsDegreesOfFreedom() throws Exception {
        ChiSquaredDistributionImpl distribution = new ChiSquaredDistributionImpl(1.0);
        ChiSquareTestImpl test = new ChiSquareTestImpl(distribution);
        double result = test.chiSquareTestDataSetsComparison(
                new long[] {10, 20}, new long[] {20, 10});
        assertEquals(1.0, distribution.getDegreesOfFreedom(), 0.0);
        assertTrue(result >= 0.0 && result <= 1.0);
    }

    @Test
    public void testSetDistributionUsesSuppliedDistribution() throws Exception {
        ChiSquaredDistributionImpl distribution = new ChiSquaredDistributionImpl(2.0);
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        test.setDistribution(distribution);
        test.chiSquareTest(new double[] {1, 1, 1}, new long[] {1, 1, 1});
        assertEquals(2.0, distribution.getDegreesOfFreedom(), 0.0);
    }
}
