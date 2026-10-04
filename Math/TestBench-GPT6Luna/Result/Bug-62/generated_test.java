package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.random.RandomGenerator;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.util.FastMath;

public class MultiStartUnivariateRealOptimizerTest {
    @Test
    public void testConstructorAndEvaluationDefaults() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        assertEquals(0, multi.getMaxEvaluations());
        assertEquals(0, multi.getEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsDelegatesAndReadsBack() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        multi.setMaxEvaluations(17);
        assertEquals(17, multi.getMaxEvaluations());
        assertEquals(17, optimizer.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsAtZero() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        multi.setMaxEvaluations(0);
        assertEquals(0, multi.getMaxEvaluations());
        assertEquals(0, optimizer.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsAtMaximumInteger() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        multi.setMaxEvaluations(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, multi.getMaxEvaluations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsAtMinimumInteger() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        multi.setMaxEvaluations(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, multi.getMaxEvaluations());
        assertEquals(Integer.MIN_VALUE, optimizer.getMaxEvaluations());
    }

    @Test
    public void testCheckerDelegation() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        ConvergenceChecker<UnivariateRealPointValuePair> checker = null;
        multi.setConvergenceChecker(checker);
        assertSame(checker, multi.getConvergenceChecker());
    }

    @Test
    public void testGetOptimaBeforeOptimizeThrows() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        try {
            multi.getOptima();
            fail("expected MathIllegalStateException");
        } catch (MathIllegalStateException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testSingleStartReturnsAndStoresOptimum() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        UnivariateRealPointValuePair result = multi.optimize(f, GoalType.MINIMIZE, 0, 10, 3);
        assertEquals(3.0, result.getPoint(), 0.0);
        assertEquals(3.0, result.getValue(), 0.0);
        assertEquals(1, multi.getEvaluations());
        assertEquals(1, multi.getOptima().length);
    }

    @Test
    public void testOptimizeConvenienceUsesMidpoint() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        UnivariateRealPointValuePair result = multi.optimize(f, GoalType.MINIMIZE, 2, 8);
        assertEquals(5.0, result.getPoint(), 0.0);
        assertEquals(5.0, result.getValue(), 0.0);
    }

    @Test
    public void testOptimaArrayIsDefensiveCopy() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        multi.optimize(f, GoalType.MINIMIZE, 0, 10, 4);
        UnivariateRealPointValuePair[] first = multi.getOptima();
        first[0] = null;
        assertEquals(4.0, multi.getOptima()[0].getPoint(), 0.0);
    }

    @Test
    public void testMinimizeSortsBestFirstAcrossStarts() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(
                optimizer, 3, new SequenceRandom(0.0, 0.5));
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        UnivariateRealPointValuePair result = multi.optimize(f, GoalType.MINIMIZE, 0, 10, 8);
        assertEquals(0.0, result.getPoint(), 0.0);
        UnivariateRealPointValuePair[] optima = multi.getOptima();
        assertEquals(0.0, optima[0].getPoint(), 0.0);
        assertEquals(5.0, optima[1].getPoint(), 0.0);
        assertEquals(8.0, optima[2].getPoint(), 0.0);
    }

    @Test
    public void testMaximizeSortsBestFirstAcrossStarts() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(
                optimizer, 3, new SequenceRandom(0.0, 0.5));
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        UnivariateRealPointValuePair result = multi.optimize(f, GoalType.MAXIMIZE, 0, 10, 2);
        assertEquals(5.0, result.getPoint(), 0.0);
        UnivariateRealPointValuePair[] optima = multi.getOptima();
        assertEquals(5.0, optima[0].getPoint(), 0.0);
        assertEquals(2.0, optima[1].getPoint(), 0.0);
        assertEquals(0.0, optima[2].getPoint(), 0.0);
    }

    @Test
    public void testFunctionEvaluationFailureLeavesNullAfterSuccessfulOptimum() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        optimizer.failAt = 5.0;
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(
                optimizer, 2, new SequenceRandom(0.5));
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        multi.optimize(f, GoalType.MINIMIZE, 0, 10, 2);
        UnivariateRealPointValuePair[] optima = multi.getOptima();
        assertEquals(2.0, optima[0].getPoint(), 0.0);
        assertNull(optima[1]);
    }

    @Test
    public void testConvergenceFailureLeavesNullAfterSuccessfulOptimum() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        optimizer.convergeAt = 5.0;
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(
                optimizer, 2, new SequenceRandom(0.5));
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        multi.optimize(f, GoalType.MINIMIZE, 0, 10, 2);
        UnivariateRealPointValuePair[] optima = multi.getOptima();
        assertEquals(2.0, optima[0].getPoint(), 0.0);
        assertNull(optima[1]);
    }

    @Test
    public void testAllFailuresThrowConvergenceException() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        optimizer.failEveryTime = true;
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(
                optimizer, 2, new SequenceRandom(0.5));
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        try {
            multi.optimize(f, GoalType.MINIMIZE, 0, 10, 2);
            fail("expected ConvergenceException");
        } catch (ConvergenceException expected) {
            assertEquals(2, multi.getEvaluations());
            assertEquals(2, multi.getOptima().length);
            assertNull(multi.getOptima()[0]);
        }
    }

    @Test
    public void testOneStartDoesNotUseRandomGenerator() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> multi =
            new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(optimizer, 1, null);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        assertEquals(7.0, multi.optimize(f, GoalType.MINIMIZE, 0, 10, 7).getPoint(), 0.0);
    }

    private static class TestOptimizer implements BaseUnivariateRealOptimizer<UnivariateRealFunction> {
        private int maxEvaluations;
        private int evaluations;
        private double failAt = Double.NaN;
        private double convergeAt = Double.NaN;
        private boolean failEveryTime;

        public void setConvergenceChecker(ConvergenceChecker<UnivariateRealPointValuePair> checker) { }
        public ConvergenceChecker<UnivariateRealPointValuePair> getConvergenceChecker() { return null; }
        public int getMaxEvaluations() { return maxEvaluations; }
        public int getEvaluations() { return evaluations; }
        public void setMaxEvaluations(int value) { maxEvaluations = value; }

        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                     double min, double max)
            throws FunctionEvaluationException {
            return optimize(f, goal, min, max, min + 0.5 * (max - min));
        }

        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal,
                                                     double min, double max, double start)
            throws FunctionEvaluationException {
            evaluations = 1;
            if (failEveryTime || start == failAt) {
                throw new FunctionEvaluationException(start);
            }
            if (start == convergeAt) {
                throw new ConvergenceException();
            }
            return new UnivariateRealPointValuePair(start, f.value(start));
        }
    }

    private static class SequenceRandom implements RandomGenerator {
        private final double[] values;
        private int index;

        SequenceRandom(double... values) { this.values = values; }
        public void setSeed(int seed) { }
        public void setSeed(int[] seed) { }
        public void setSeed(long seed) { }
        public void nextBytes(byte[] bytes) { }
        public int nextInt() { return 0; }
        public int nextInt(int n) { return 0; }
        public long nextLong() { return 0; }
        public boolean nextBoolean() { return false; }
        public float nextFloat() { return 0; }
        public double nextDouble() { return values[index++]; }
        public double nextGaussian() { return 0; }
    }
}
