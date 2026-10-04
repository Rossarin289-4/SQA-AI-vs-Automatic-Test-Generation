package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.MultivariateOptimizer;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.MathArrays;

public class CMAESOptimizerTest {

    private static final double[] START_POINT = new double[]{0.0, 0.0};
    private static final double[] START_POINT_3D = new double[]{0.0, 0.0, 0.0};
    private static final double[] START_POINT_DIM_MISMATCH = new double[]{0.0};
    private static final double[] START_POINT_LARGE_DIM = new double[100];

    // A simple quadratic function for testing.
    private static class SimpleQuadraticFunction implements MultivariateFunction {
        @Override
        public double value(double[] point) {
            double sum = 0;
            for (double x : point) {
                sum += x * x;
            }
            return sum;
        }
    }

    // Mocking the call to computeObjectiveValue
    private MultivariateFunction objectiveFunction;
    private CMAESOptimizer optimizerInstance; // To hold the instance for accessing protected methods

    // Helper method to set the objective function for doOptimize
    private void setObjectiveFunction(MultivariateFunction func) {
        this.objectiveFunction = func;
    }

    // Override the protected method for testing purposes
    private class TestCMAESOptimizer extends CMAESOptimizer {
        public TestCMAESOptimizer(int lambda, double[] inputSigma, int maxIterations, double stopFitness, boolean isActiveCMA, int diagonalOnly, int checkFeasableCount, RandomGenerator random, boolean generateStatistics, ConvergenceChecker<PointValuePair> checker) {
            super(lambda, inputSigma, maxIterations, stopFitness, isActiveCMA, diagonalOnly, checkFeasableCount, random, generateStatistics, checker);
            optimizerInstance = this; // Store instance for access
        }

        @Override
        protected double computeObjectiveValue(double[] point) {
            return objectiveFunction.value(point);
        }

        @Override
        public PointValuePair optimize(int maxEval, MultivariateFunction f, GoalType goalType, double[] point) throws TooManyEvaluationsException, DimensionMismatchException {
            setObjectiveFunction(f);
            return super.optimize(maxEval, f, goalType, point);
        }

        // Needed to call doOptimize directly
        public PointValuePair doOptimizeInternal() throws TooManyEvaluationsException {
            return super.doOptimize();
        }
    }


    @Test
    public void testDefaultConstructor() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertNotNull(optimizer);
        assertEquals(0, optimizer.DEFAULT_CHECKFEASABLECOUNT);
        assertEquals(0, optimizer.DEFAULT_STOPFITNESS, 1e-9);
        assertTrue(optimizer.DEFAULT_ISACTIVECMA);
        assertEquals(30000, optimizer.DEFAULT_MAXITERATIONS);
        assertEquals(0, optimizer.DEFAULT_DIAGONALONLY);
        assertNotNull(optimizer.DEFAULT_RANDOMGENERATOR);
    }












































    @Test
    public void testRandomGeneratorNextGaussian() {
        RandomGenerator rg = new MersenneTwister(123);
        double val1 = rg.nextGaussian();
        double val2 = rg.nextGaussian();
        assertNotEquals(val1, val2, 1e-9);
        assertTrue(val1 > -3.0 && val1 < 3.0);
        assertTrue(val2 > -3.0 && val2 < 3.0);
    }

    @Test
    public void testRandomGeneratorNextDouble() {
        RandomGenerator rg = new MersenneTwister(123);
        double val1 = rg.nextDouble();
        double val2 = rg.nextDouble();
        assertTrue(val1 >= 0.0 && val1 < 1.0);
        assertTrue(val2 >= 0.0 && val2 < 1.0);
        assertNotEquals(val1, val2, 1e-9);
    }

    @Test
    public void testRandomGeneratorNextInt() {
        RandomGenerator rg = new MersenneTwister(123);
        int val1 = rg.nextInt(100);
        int val2 = rg.nextInt(100);
        assertTrue(val1 >= 0 && val1 < 100);
        assertTrue(val2 >= 0 && val2 < 100);
        assertNotEquals(val1, val2);
    }

    @Test
    public void testRandomGeneratorNextIntUnlimited() {
        RandomGenerator rg = new MersenneTwister(123);
        int val1 = rg.nextInt();
        int val2 = rg.nextInt();
        assertNotEquals(val1, val2);
    }




    @Test
    public void testGetStatistics() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 100, 0, true, 0, 0, new MersenneTwister(123), true);
        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }





}




