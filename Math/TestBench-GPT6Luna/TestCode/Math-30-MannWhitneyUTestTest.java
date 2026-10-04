package org.apache.commons.math3.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.NaturalRanking;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.apache.commons.math3.util.FastMath;

public class MannWhitneyUTestTest {
    @Test
    public void testUFirstSampleBelowSecond() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        assertEquals(1.0, test.mannWhitneyU(new double[] {1}, new double[] {2}), 0.0);
    }

    @Test
    public void testUFirstSampleAboveSecond() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        assertEquals(1.0, test.mannWhitneyU(new double[] {2}, new double[] {1}), 0.0);
    }

    @Test
    public void testUEqualSingleObservations() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        assertEquals(0.5, test.mannWhitneyU(new double[] {3}, new double[] {3}), 0.0);
    }

    @Test
    public void testUTwoVersusTwo() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        assertEquals(4.0, test.mannWhitneyU(
                new double[] {1, 2}, new double[] {3, 4}), 0.0);
    }

    @Test
    public void testUReverseTwoVersusTwo() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        assertEquals(4.0, test.mannWhitneyU(
                new double[] {3, 4}, new double[] {1, 2}), 0.0);
    }

    @Test
    public void testUTiedValuesUseAverageRanks() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        assertEquals(3.5, test.mannWhitneyU(
                new double[] {1, 2}, new double[] {2, 3}), 0.0);
    }

    @Test
    public void testUDifferentSampleSizes() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        assertEquals(2.0, test.mannWhitneyU(
                new double[] {2, 3}, new double[] {1}), 0.0);
    }

    @Test
    public void testUZeroAndNegativeValuesRankNaturally() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        assertEquals(2.0, test.mannWhitneyU(
                new double[] {-1, 0}, new double[] {-2}), 0.0);
    }

    @Test
    public void testUNullFirstSampleThrows() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        try {
            test.mannWhitneyU(null, new double[] {1});
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) {
        }
    }

    @Test
    public void testUNullSecondSampleThrows() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        try {
            test.mannWhitneyU(new double[] {1}, null);
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) {
        }
    }

    @Test
    public void testUEmptyFirstSampleThrows() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        try {
            test.mannWhitneyU(new double[0], new double[] {1});
            fail("expected NoDataException");
        } catch (NoDataException expected) {
        }
    }

    @Test
    public void testUEmptySecondSampleThrows() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        try {
            test.mannWhitneyU(new double[] {1}, new double[0]);
            fail("expected NoDataException");
        } catch (NoDataException expected) {
        }
    }

    @Test
    public void testUTestSingleSamplesBelowAndAbove() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double expected = 2 * new NormalDistribution(0, 1).cumulativeProbability(-1.0);
        assertEquals(expected, test.mannWhitneyUTest(
                new double[] {1}, new double[] {2}), 1e-12);
    }

    @Test
    public void testUTestSingleSamplesAboveAndBelow() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double expected = 2 * new NormalDistribution(0, 1).cumulativeProbability(-1.0);
        assertEquals(expected, test.mannWhitneyUTest(
                new double[] {2}, new double[] {1}), 1e-12);
    }

    @Test
    public void testUTestIdenticalSingleValues() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double expected = 2 * new NormalDistribution(0, 1).cumulativeProbability(0.0);
        assertEquals(expected, test.mannWhitneyUTest(
                new double[] {3}, new double[] {3}), 1e-12);
    }

    @Test
    public void testUTestSeparatedTwoElementSamples() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double expected = 2 * new NormalDistribution(0, 1)
                .cumulativeProbability(-3.0 / Math.sqrt(8.0));
        assertEquals(expected, test.mannWhitneyUTest(
                new double[] {1, 2}, new double[] {3, 4}), 1e-12);
    }

    @Test
    public void testUTestPartialTie() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double expected = 2 * new NormalDistribution(0, 1)
                .cumulativeProbability(-0.5 / Math.sqrt(2.0));
        assertEquals(expected, test.mannWhitneyUTest(
                new double[] {1, 2}, new double[] {2, 3}), 1e-12);
    }

    @Test
    public void testUTestNullFirstSampleThrows() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        try {
            test.mannWhitneyUTest(null, new double[] {1});
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) {
        }
    }

    @Test
    public void testUTestNullSecondSampleThrows() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        try {
            test.mannWhitneyUTest(new double[] {1}, null);
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) {
        }
    }

    @Test
    public void testUTestEmptyFirstSampleThrows() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        try {
            test.mannWhitneyUTest(new double[0], new double[] {1});
            fail("expected NoDataException");
        } catch (NoDataException expected) {
        }
    }

    @Test
    public void testUTestEmptySecondSampleThrows() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        try {
            test.mannWhitneyUTest(new double[] {1}, new double[0]);
            fail("expected NoDataException");
        } catch (NoDataException expected) {
        }
    }
}
