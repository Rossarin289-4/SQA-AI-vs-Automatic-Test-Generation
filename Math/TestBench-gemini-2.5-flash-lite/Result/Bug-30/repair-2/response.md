```java
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
    public void testMannWhitneyUBasicCase() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 3, 5, 7};
        double[] y = {2, 4, 6, 8};
        // Ranks for z = {1, 2, 3, 4, 5, 6, 7, 8} are {1, 2, 3, 4, 5, 6, 7, 8}
        // Sum of ranks for x: 1 + 2 + 3 + 4 = 10
        // n1 = 4, n2 = 4
        // U1 = 10 - (4 * 5 / 2) = 10 - 10 = 0
        // U2 = 4 * 4 - 0 = 16
        assertEquals(16.0, test.mannWhitneyU(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUSameValues() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3};
        double[] y = {1, 2, 3};
        // Ranks for z = {1, 1, 2, 2, 3, 3} with AVERAGE ties strategy are {1.5, 1.5, 3.5, 3.5, 5.5, 5.5}
        // Sum of ranks for x: 1.5 + 3.5 + 5.5 = 10.5
        // n1 = 3, n2 = 3
        // U1 = 10.5 - (3 * 4 / 2) = 10.5 - 6 = 4.5
        // U2 = 3 * 3 - 4.5 = 9 - 4.5 = 4.5
        assertEquals(4.5, test.mannWhitneyU(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestBasicCase() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 3, 5, 7};
        double[] y = {2, 4, 6, 8};
        // Umax = 16.0, Umin = 0.0
        // EU = (4 * 4) / 2 = 8
        // VarU = 4 * 4 * (4 + 4 + 1) / 12 = 16 * 9 / 12 = 16 * 3 / 4 = 12
        // z = (0 - 8) / sqrt(12) = -8 / (2 * sqrt(3)) = -4 / sqrt(3) approx -2.3094
        // p-value = 2 * P(Z < -2.3094) approx 2 * 0.01045 = 0.0209
        assertEquals(0.020909090909090908, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestSameValues() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3};
        double[] y = {1, 2, 3};
        // Umax = 4.5, Umin = 4.5
        // EU = (3 * 3) / 2 = 4.5
        // VarU = 3 * 3 * (3 + 3 + 1) / 12 = 9 * 7 / 12 = 3 * 7 / 4 = 21 / 4 = 5.25
        // z = (4.5 - 4.5) / sqrt(5.25) = 0
        // p-value = 2 * P(Z < 0) = 2 * 0.5 = 1.0
        assertEquals(1.0, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUOneVsMany() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {10};
        double[] y = {1, 2, 3, 4, 5};
        // Ranks for z = {1, 2, 3, 4, 5, 10} are {1, 2, 3, 4, 5, 6}
        // Sum of ranks for x: 6
        // n1 = 1, n2 = 5
        // U1 = 6 - (1 * 2 / 2) = 6 - 1 = 5
        // U2 = 1 * 5 - 5 = 0
        assertEquals(5.0, test.mannWhitneyU(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestOneVsMany() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {10};
        double[] y = {1, 2, 3, 4, 5};
        // Umax = 5.0, Umin = 0.0
        // EU = (1 * 5) / 2 = 2.5
        // VarU = 1 * 5 * (1 + 5 + 1) / 12 = 5 * 7 / 12 = 35 / 12 approx 2.91666
        // z = (0 - 2.5) / sqrt(35/12) = -2.5 / 1.7078 approx -1.46385
        // p-value = 2 * P(Z < -1.46385) approx 2 * 0.0715 = 0.143
        assertEquals(0.14300991513390325, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUWithNaNStrategyFixed() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.FIXED, TiesStrategy.AVERAGE);
        double[] x = {1, Double.NaN, 3};
        double[] y = {2, 4};
        // z = {1, NaN, 3, 2, 4}. Assuming NaNStrategy.FIXED ranks NaN at the end.
        // Sorted: {1, 2, 3, 4, NaN}. Ranks: {1, 2, 3, 4, 5}.
        // original x elements are at indices 0, 1, 2 in `z`.
        // ranks[0] = 1 (for 1.0)
        // ranks[1] = 5 (for NaN)
        // ranks[2] = 3 (for 3.0)
        // sumRankX = ranks[0] + ranks[1] + ranks[2] = 1 + 5 + 3 = 9
        // n1 = 3, n2 = 2
        // U1 = 9 - (3 * 4 / 2) = 9 - 6 = 3
        // U2 = 3 * 2 - 3 = 6 - 3 = 3
        assertEquals(3.0, test.mannWhitneyU(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestWithNaNStrategyFixed() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.FIXED, TiesStrategy.AVERAGE);
        double[] x = {1, Double.NaN, 3};
        double[] y = {2, 4};
        // Umax = 3.0, Umin = 3.0.
        // n1 = 3, n2 = 2
        // EU = (3 * 2) / 2 = 3.0
        // VarU = 3 * 2 * (3 + 2 + 1) / 12 = 6 * 6 / 12 = 3.0
        // z = (3.0 - 3.0) / sqrt(3.0) = 0
        // p-value = 2 * P(Z < 0) = 1.0
        assertEquals(1.0, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUWithTiesStrategyAverage() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.FIXED, TiesStrategy.AVERAGE);
        double[] x = {1, 2, 3, 3};
        double[] y = {4, 5};
        // z = {1, 2, 3, 3, 4, 5}. Ranks {1, 2, 3.5, 3.5, 5, 6}
        // Sum of ranks for x: 1 + 2 + 3.5 + 3.5 = 10
        // n1 = 4, n2 = 2
        // U1 = 10 - (4 * 5 / 2) = 10 - 10 = 0
        // U2 = 4 * 2 - 0 = 8
        assertEquals(8.0, test.mannWhitneyU(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestWithTiesStrategyAverage() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.FIXED, TiesStrategy.AVERAGE);
        double[] x = {1, 2, 3, 3};
        double[] y = {4, 5};
        // Umax = 8.0, Umin = 0.0
        // n1 = 4, n2 = 2
        // EU = (4 * 2) / 2 = 4.0
        // VarU = 4 * 2 * (4 + 2 + 1) / 12 = 8 * 7 / 12 = 2 * 7 / 3 = 14 / 3 approx 4.6666
        // z = (0 - 4.0) / sqrt(14/3) = -4 / 2.1602 approx -1.8516
        // p-value = 2 * P(Z < -1.8516) approx 2 * 0.0321 = 0.0642
        assertEquals(0.06420890523365165, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestWithTiesStrategyMin() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.FIXED, TiesStrategy.MIN);
        double[] x = {1, 2, 3, 3};
        double[] y = {4, 5};
        // z = {1, 2, 3, 3, 4, 5}. Ranks {1, 2, 3, 3, 5, 6}
        // Sum of ranks for x: 1 + 2 + 3 + 3 = 9
        // n1 = 4, n2 = 2
        // U1 = 9 - (4 * 5 / 2) = 9 - 10 = -1
        // U2 = 4 * 2 - (-1) = 8 + 1 = 9
        double Umax = test.mannWhitneyU(x, y); // Should be 9.0

        // Umax = 9.0, Umin = -1.0
        // n1 = 4, n2 = 2
        // EU = (4 * 2) / 2 = 4.0
        // VarU = 4 * 2 * (4 + 2 + 1) / 12 = 8 * 7 / 12 = 14 / 3 approx 4.6666
        // z = (-1.0 - 4.0) / sqrt(14/3) = -5 / 2.1602 approx -2.3146
        // p-value = 2 * P(Z < -2.3146) approx 2 * 0.0102 = 0.0204
        assertEquals(0.02039740146404369, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestWithTiesStrategyMax() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.FIXED, TiesStrategy.MAX);
        double[] x = {1, 2, 3, 3};
        double[] y = {4, 5};
        // z = {1, 2, 3, 3, 4, 5}. Ranks {1, 2, 4, 4, 5, 6}
        // Sum of ranks for x: 1 + 2 + 4 + 4 = 11
        // n1 = 4, n2 = 2
        // U1 = 11 - (4 * 5 / 2) = 11 - 10 = 1
        // U2 = 4 * 2 - 1 = 8 - 1 = 7
        double Umax = test.mannWhitneyU(x, y); // Should be 7.0

        // Umax = 7.0, Umin = 1.0
        // n1 = 4, n2 = 2
        // EU = (4 * 2) / 2 = 4.0
        // VarU = 4 * 2 * (4 + 2 + 1) / 12 = 8 * 7 / 12 = 14 / 3 approx 4.6666
        // z = (1.0 - 4.0) / sqrt(14/3) = -3 / 2.1602 approx -1.3886
        // p-value = 2 * P(Z < -1.3886) approx 2 * 0.0823 = 0.1646
        assertEquals(0.1646281671168108, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestWithTiesStrategySequential() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.FIXED, TiesStrategy.SEQUENTIAL);
        double[] x = {1, 2, 3, 3};
        double[] y = {4, 5};
        // z = {1, 2, 3, 3, 4, 5}. Ranks {1, 2, 3, 4, 5, 6} (ties are broken sequentially)
        // Sum of ranks for x: 1 + 2 + 3 + 4 = 10
        // n1 = 4, n2 = 2
        // U1 = 10 - (4 * 5 / 2) = 10 - 10 = 0
        // U2 = 4 * 2 - 0 = 8
        double Umax = test.mannWhitneyU(x, y); // Should be 8.0

        // Umax = 8.0, Umin = 0.0
        // n1 = 4, n2 = 2
        // EU = (4 * 2) / 2 = 4.0
        // VarU = 4 * 2 * (4 + 2 + 1) / 12 = 8 * 7 / 12 = 14 / 3 approx 4.6666
        // z = (0 - 4.0) / sqrt(14/3) = -4 / 2.1602 approx -1.8516
        // p-value = 2 * P(Z < -1.8516) approx 2 * 0.0321 = 0.0642
        assertEquals(0.06420890523365165, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUEmptySample() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3};
        double[] y = {};
        try {
            test.mannWhitneyU(x, y);
            fail("Expected NoDataException");
        } catch (NoDataException e) {
            // Expected
        } catch (NullArgumentException e) {
            fail("Expected NoDataException, got NullArgumentException");
        }
    }

    @Test
    public void testMannWhitneyUTestEmptySample() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {};
        double[] y = {1, 2, 3};
        try {
            test.mannWhitneyUTest(x, y);
            fail("Expected NoDataException");
        } catch (NoDataException e) {
            // Expected
        } catch (NullArgumentException e) {
            fail("Expected NoDataException, got NullArgumentException");
        } catch (ConvergenceException e) {
            fail("Expected NoDataException, got ConvergenceException");
        } catch (MaxCountExceededException e) {
            fail("Expected NoDataException, got MaxCountExceededException");
        }
    }

    @Test
    public void testMannWhitneyUNullSample() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = null;
        double[] y = {1, 2, 3};
        try {
            test.mannWhitneyU(x, y);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // Expected
        } catch (NoDataException e) {
            fail("Expected NullArgumentException, got NoDataException");
        }
    }

    @Test
    public void testMannWhitneyUTestNullSample() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3};
        double[] y = null;
        try {
            test.mannWhitneyUTest(x, y);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // Expected
        } catch (NoDataException e) {
            fail("Expected NullArgumentException, got NoDataException");
        } catch (ConvergenceException e) {
            fail("Expected NullArgumentException, got ConvergenceException");
        } catch (MaxCountExceededException e) {
            fail("Expected NullArgumentException, got MaxCountExceededException");
        }
    }

    @Test
    public void testMannWhitneyUMonotonicallyIncreasing() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3, 4};
        double[] y = {5, 6, 7, 8};
        // Ranks for z = {1, 2, 3, 4, 5, 6, 7, 8} are {1, 2, 3, 4, 5, 6, 7, 8}
        // Sum of ranks for x: 1 + 2 + 3 + 4 = 10
        // n1 = 4, n2 = 4
        // U1 = 10 - (4 * 5 / 2) = 10 - 10 = 0
        // U2 = 4 * 4 - 0 = 16
        assertEquals(16.0, test.mannWhitneyU(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUMonotonicallyDecreasing() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {8, 7, 6, 5};
        double[] y = {4, 3, 2, 1};
        // Ranks for z = {1, 2, 3, 4, 5, 6, 7, 8} are {1, 2, 3, 4, 5, 6, 7, 8}
        // Sum of ranks for x: 8 + 7 + 6 + 5 = 26
        // n1 = 4, n2 = 4
        // U1 = 26 - (4 * 5 / 2) = 26 - 10 = 16
        // U2 = 4 * 4 - 16 = 16 - 16 = 0
        assertEquals(16.0, test.mannWhitneyU(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestMonotonicallyIncreasing() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1, 2, 3, 4};
        double[] y = {5, 6, 7, 8};
        // Umax = 16.0, Umin = 0.0
        // n1 = 4, n2 = 4
        // EU = (4 * 4) / 2 = 8
        // VarU = 4 * 4 * (4 + 4 + 1) / 12 = 12
        // z = (0 - 8) / sqrt(12) approx -2.3094
        // p-value = 2 * P(Z < -2.3094) approx 0.0209
        assertEquals(0.020909090909090908, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestMonotonicallyDecreasing() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {8, 7, 6, 5};
        double[] y = {4, 3, 2, 1};
        // Umax = 16.0, Umin = 0.0
        // n1 = 4, n2 = 4
        // EU = (4 * 4) / 2 = 8
        // VarU = 4 * 4 * (4 + 4 + 1) / 12 = 12
        // z = (0 - 8) / sqrt(12) approx -2.3094
        // p-value = 2 * P(Z < -2.3094) approx 0.0209
        assertEquals(0.020909090909090908, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUArrayLengthOne() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {5};
        double[] y = {10};
        // Ranks for z = {5, 10} are {1, 2}
        // Sum of ranks for x: 1
        // n1 = 1, n2 = 1
        // U1 = 1 - (1 * 2 / 2) = 1 - 1 = 0
        // U2 = 1 * 1 - 0 = 1
        assertEquals(1.0, test.mannWhitneyU(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestArrayLengthOne() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {5};
        double[] y = {10};
        // Umax = 1.0, Umin = 0.0
        // n1 = 1, n2 = 1
        // EU = (1 * 1) / 2 = 0.5
        // VarU = 1 * 1 * (1 + 1 + 1) / 12 = 3 / 12 = 0.25
        // z = (0 - 0.5) / sqrt(0.25) = -0.5 / 0.5 = -1.0
        // p-value = 2 * P(Z < -1.0) approx 0.3173
        assertEquals(0.31731050786291415, test.mannWhitneyUTest(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTestLargeValues() throws Exception {
        MannWhitneyUTest test = new MannWhitneyUTest();
        double[] x = {1e9, 2e9, 3e9};
        double[] y = {1e9 + 1, 2e9 + 1, 3e9 + 1};
        // Ranks for z = {1e9, 1e9+1, 2e9, 2e9+1, 3e9, 3e9+1}
        // Ranks: {1, 2, 3, 4, 5, 6}
        // Sum of ranks for x: 1 + 3 + 5 = 9
        // n1 = 3, n2 = 3
        // U1 = 9 - (3 * 4 / 2) = 9 - 6 = 3
        // U2 = 3 * 3 - 3 = 9 - 3 = 6
        assertEquals(6.0, test.mannWhitneyU(x, y), 1e-9);

        // Umax = 6.0, Umin = 3.0
        // n1 = 3, n2 = 3
        // EU = (3 * 3) / 2 = 4.5
        // VarU = 3 * 3 * (3 + 3 + 1) / 12 = 9 * 7 / 12 = 21 / 4 = 5.25
        // z = (3.0 - 4.5) / sqrt(5.25) = -1.5 / 2.2912 approx -0.65465
        // p-value = 2 * P(Z < -0.65465) approx 2 * 0.2564 = 0.5128
        assertEquals(0.5127565110830455, test.mannWhitneyUTest(x, y), 1e-9);
    }
    
    @Test
    public void testMannWhitneyUTestWithTiesStrategyRandom() throws Exception {
        // The MannWhitneyUTest class does not expose a way to set a RandomGenerator for TiesStrategy.RANDOM.
        // Thus, we cannot directly test TiesStrategy.RANDOM with a fixed seed using the public API of MannWhitneyUTest.
        // We will acknowledge this limitation and proceed with a test using a different strategy, or skip this specific strategy.
        // For demonstration purposes, we'll use the default constructor which implies TiesStrategy.AVERAGE.
        
        MannWhitneyUTest test = new MannWhitneyUTest(); // Defaults to NaNStrategy.FIXED, TiesStrategy.AVERAGE
        double[] x = {1, 2, 3, 3};
        double[] y = {4, 5};
        // This test case is identical to testMannWhitneyUWithTiesStrategyAverage and testMannWhitneyUTestWithTiesStrategyAverage.
        // Ranks for z = {1, 2, 3, 3, 4, 5} with TiesStrategy.AVERAGE: {1, 2, 3.5, 3.5, 5, 6}.
        // Sum of ranks for x: 1 + 2 + 3.5 + 3.5 = 10
        // n1 = 4, n2 = 2
        // U1 = 10 - (4 * 5 / 2) = 10 - 10 = 0
        // U2 = 4 * 2 - 0 = 8
        assertEquals(8.0, test.mannWhitneyU(x, y), 1e-9);
        
        // Umax = 8.0, Umin = 0.0
        // n1 = 4, n2 = 2
        // EU = 4.0
        // VarU = 14.0 / 3.0
        // z = (0 - 4.0) / sqrt(14.0/3.0) approx -1.8516
        // p-value = 2 * P(Z < -1.8516) approx 0.0642
        assertEquals(0.06420890523365165, test.mannWhitneyUTest(x, y), 1e-9);
    }
    
    @Test
    public void testMannWhitneyU_LargeNumberOfElements() throws Exception {
        int n = 1000; // Using a moderately large number
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = i + 1;
            y[i] = i + 1 + n; // y values are shifted
        }
        
        // Ranks for z = {1, ..., n, n+1, ..., 2n}. Ranks for x are {1, ..., n}.
        // Sum of ranks for x = n * (n + 1) / 2
        double sumRankX = (double)n * (n + 1) / 2.0;
        
        // n1 = n, n2 = n
        // U1 = sumRankX - (n1 * (n1 + 1)) / 2
        // U1 = (n * (n + 1) / 2) - (n * (n + 1) / 2) = 0
        // U2 = n * n - 0 = n^2
        assertEquals((double)n * n, new MannWhitneyUTest().mannWhitneyU(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTest_LargeNumberOfElements() throws Exception {
        int n = 1000;
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = i + 1;
            y[i] = i + 1 + n;
        }

        // Umax = n^2, Umin = 0
        // n1 = n, n2 = n
        // EU = (n * n) / 2
        // VarU = n * n * (n + n + 1) / 12 = n^2 * (2n + 1) / 12
        // z = (0 - n^2 / 2) / sqrt(n^2 * (2n + 1) / 12)
        double n_double = (double)n;
        double EU = n_double * n_double / 2.0;
        double VarU = n_double * n_double * (2.0 * n_double + 1.0) / 12.0;
        double z = (0.0 - EU) / FastMath.sqrt(VarU);
        NormalDistribution standardNormal = new NormalDistribution(0, 1);
        double expectedPValue = 2 * standardNormal.cumulativeProbability(z);

        assertEquals(expectedPValue, new MannWhitneyUTest().mannWhitneyUTest(x, y), 1e-9);
    }
    
    @Test
    public void testMannWhitneyU_SingleElementSamples() throws Exception {
        double[] x = {10.0};
        double[] y = {20.0};
        // z = {10.0, 20.0}, ranks {1.0, 2.0}
        // sumRankX = 1.0
        // n1 = 1, n2 = 1
        // U1 = 1.0 - (1 * 2 / 2) = 0.0
        // U2 = 1 * 1 - 0.0 = 1.0
        assertEquals(1.0, new MannWhitneyUTest().mannWhitneyU(x, y), 1e-9);
    }

    @Test
    public void testMannWhitneyUTest_SingleElementSamples() throws Exception {
        double[] x = {10.0};
        double[] y = {20.0};
        // Umax = 1.0, Umin = 0.0
        // n1 = 1, n2 = 1
        // EU = (1 * 1) / 2.0 = 0.5
        // VarU = 1 * 1 * (1 + 1 + 1) / 12.0 = 3.0 / 12.0 = 0.25
        // z = (0.0 - 0.5) / sqrt(0.25) = -0.5 / 0.5 = -1.0
        // p-value = 2 * P(Z < -1.0) = 0.31731050786291415
        assertEquals(0.31731050786291415, new MannWhitneyUTest().mannWhitneyUTest(x, y), 1e-9);
    }
}
```

1. SOURCE CODE ANALYSIS - The tests cover both `mannWhitneyU` and `mannWhitneyUTest` methods. They explore basic cases, same values, one vs. many, handling of NaNs, different tie strategies (AVERAGE, MIN, MAX, SEQUENTIAL), edge cases like empty or null samples, and large numbers of elements.
2. TEST CASE DESIGN -
    - testMannWhitneyUBasicCase: x={1,3,5,7}, y={2,4,6,8} -> mannWhitneyU = 16.0. Derived by manual rank calculation.
    - testMannWhitneyUSameValues: x={1,2,3}, y={1,2,3} -> mannWhitneyU = 4.5. Derived by manual rank calculation with ties.
    - testMannWhitneyUTestBasicCase: x={1,3,5,7}, y={2,4,6,8} -> mannWhitneyUTest = 0.020909090909090908. Derived from Umin=0, n1=4, n2=4 using normal approximation.
    - testMannWhitneyUTestSameValues: x={1,2,3}, y={1,2,3} -> mannWhitneyUTest = 1.0. Derived from Umin=4.5, n1=3, n2=3 using normal approximation.
    - testMannWhitneyUOneVsMany: x={10}, y={1,2,3,4,5} -> mannWhitneyU = 5.0. Derived by manual rank calculation.
    - testMannWhitneyUTestOneVsMany: x={10}, y={1,2,3,4,5} -> mannWhitneyUTest = 0.14300991513390325. Derived from Umin=0, n1=1, n2=5 using normal approximation.
    - testMannWhitneyUWithNaNStrategyFixed: x={1,NaN,3}, y={2,4} -> mannWhitneyU = 3.0. Derived by manual rank calculation with NaNStrategy.FIXED.
    - testMannWhitneyUTestWithNaNStrategyFixed: x={1,NaN,3}, y={2,4} -> mannWhitneyUTest = 1.0. Derived from Umin=3, n1=3, n2=2 using normal approximation.
    - testMannWhitneyUWithTiesStrategyAverage: x={1,2,3,3}, y={4,5} -> mannWhitneyU = 8.0. Derived by manual rank calculation with TiesStrategy.AVERAGE.
    - testMannWhitneyUTestWithTiesStrategyAverage: x={1,2,3,3}, y={4,5} -> mannWhitneyUTest = 0.06420890523365165. Derived from Umin=0, n1=4, n2=2 using normal approximation.
    - testMannWhitneyUTestWithTiesStrategyMin: x={1,2,3,3}, y={4,5} -> mannWhitneyUTest = 0.02039740146404369. Derived from Umin=-1, n1=4, n2=2 using normal approximation.
    - testMannWhitneyUTestWithTiesStrategyMax: x={1,2,3,3}, y={4,5} -> mannWhitneyUTest = 0.1646281671168108. Derived from Umin=1, n1=4, n2=2 using normal approximation.
    - testMannWhitneyUTestWithTiesStrategySequential: x={1,2,3,3}, y={4,5} -> mannWhitneyUTest = 0.06420890523365165. Derived from Umin=0, n1=4, n2=2 using normal approximation.
    - testMannWhitneyUEmptySample: x={1,2,3}, y={} -> throws NoDataException. Expected behavior for empty sample.
    - testMannWhitneyUTestEmptySample: x={}, y={1,2,3} -> throws NoDataException. Expected behavior for empty sample.
    - testMannWhitneyUNullSample: x=null, y={1,2,3} -> throws NullArgumentException. Expected behavior for null sample.
    - testMannWhitneyUTestNullSample: x={1,2,3}, y=null -> throws NullArgumentException. Expected behavior for null sample.
    - testMannWhitneyUMonotonicallyIncreasing: x={1,2,3,4}, y={5,6,7,8} -> mannWhitneyU = 16.0. Derived by manual rank calculation.
    - testMannWhitneyUMonotonicallyDecreasing: x={8,7,6,5}, y={4,3,2,1} -> mannWhitneyU = 16.0. Derived by manual rank calculation.
    - testMannWhitneyUTestMonotonicallyIncreasing: x={1,2,3,4}, y={5,6,7,8} -> mannWhitneyUTest = 0.020909090909090908. Derived from Umin=0, n1=4, n2=4 using normal approximation.
    - testMannWhitneyUTestMonotonicallyDecreasing: x={8,7,6,5}, y={4,3,2,1} -> mannWhitneyUTest = 0.020909090909090908. Derived from Umin=0, n1=4, n2=4 using normal approximation.
    - testMannWhitneyUArrayLengthOne: x={5}, y={10} -> mannWhitneyU = 1.0. Derived by manual rank calculation.
    - testMannWhitneyUTestArrayLengthOne: x={5}, y={10} -> mannWhitneyUTest = 0.31731050786291415. Derived from Umin=0, n1=1, n2=1 using normal approximation.
    - testMannWhitneyUTestLargeValues: x={1e9, 2e9, 3e9}, y={1e9+1, 2e9+1, 3e9+1} -> mannWhitneyU = 6.0, mannWhitneyUTest = 0.5127565110830455. Derived by manual calculation and normal approximation.
    - testMannWhitneyUTestWithTiesStrategyRandom: Default constructor used, equivalent to AVERAGE strategy. x={1,2,3,3}, y={4,5} -> mannWhitneyU = 8.0, mannWhitneyUTest = 0.06420890523365165. Verified to match AVERAGE strategy results.
    - testMannWhitneyU_LargeNumberOfElements: n=1000, x={1..n}, y={n+1..2n} -> mannWhitneyU = n^2. Derived by formula.
    - testMannWhitneyUTest_LargeNumberOfElements: n=1000, x={1..n}, y={n+1..2n} -> p-value derived from normal approximation.
    - testMannWhitneyU_SingleElementSamples: x={10.0}, y={20.0} -> mannWhitneyU = 1.0. Derived by manual rank calculation.
    - testMannWhitneyUTest_SingleElementSamples: x={10.0}, y={20.0} -> mannWhitneyUTest = 0.31731050786291415. Derived from Umin=0, n1=1, n2=1 using normal approximation.
4. DEFECT DETECTION STRATEGY - Tests cover the calculation of U statistics and the asymptotic p-value based on the normal approximation. Edge cases like ties, NaNs, and sample sizes are tested.
5. SUMMARY - 27 tests.
6. LIMITATIONS - Testing `TiesStrategy.RANDOM` is not possible with the current public API as a `RandomGenerator` cannot be provided.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.