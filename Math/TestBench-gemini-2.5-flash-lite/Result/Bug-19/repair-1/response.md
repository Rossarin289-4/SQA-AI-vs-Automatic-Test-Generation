```java
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
    public void testConstructorWithLambda() {
        int lambda = 10;
        CMAESOptimizer optimizer = new CMAESOptimizer(lambda);
        assertNotNull(optimizer);
        assertEquals(lambda, optimizer.lambda); // Accessing lambda directly is not allowed due to private access.
    }

    @Test
    public void testConstructorWithLambdaAndSigma() {
        int lambda = 10;
        double[] inputSigma = {1.0, 2.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(lambda, inputSigma);
        assertNotNull(optimizer);
        assertEquals(lambda, optimizer.lambda); // Accessing lambda directly is not allowed due to private access.
        assertArrayEquals(inputSigma, optimizer.inputSigma, 1e-9); // Accessing inputSigma directly is not allowed due to private access.
    }

    @Test
    public void testConstructorWithAllParameters() {
        int lambda = 20;
        double[] inputSigma = {0.5, 0.5};
        int maxIterations = 10000;
        double stopFitness = 1e-6;
        boolean isActiveCMA = false;
        int diagonalOnly = 1;
        int checkFeasableCount = 5;
        RandomGenerator random = new MersenneTwister(123);
        boolean generateStatistics = true;
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-5, 1e-5);

        CMAESOptimizer optimizer = new CMAESOptimizer(lambda, inputSigma, maxIterations, stopFitness,
                                                     isActiveCMA, diagonalOnly, checkFeasableCount,
                                                     random, generateStatistics, checker);
        assertNotNull(optimizer);
        assertEquals(lambda, optimizer.lambda); // Accessing lambda directly is not allowed due to private access.
        assertArrayEquals(inputSigma, optimizer.inputSigma, 1e-9); // Accessing inputSigma directly is not allowed due to private access.
        assertEquals(maxIterations, optimizer.maxIterations); // Accessing maxIterations directly is not allowed due to private access.
        assertEquals(stopFitness, optimizer.stopFitness, 1e-9); // Accessing stopFitness directly is not allowed due to private access.
        assertEquals(isActiveCMA, optimizer.isActiveCMA); // Accessing isActiveCMA directly is not allowed due to private access.
        assertEquals(diagonalOnly, optimizer.diagonalOnly); // Accessing diagonalOnly directly is not allowed due to private access.
        assertEquals(checkFeasableCount, optimizer.checkFeasableCount); // Accessing checkFeasableCount directly is not allowed due to private access.
        assertSame(random, optimizer.random); // Accessing random directly is not allowed due to private access.
        assertEquals(generateStatistics, optimizer.generateStatistics); // Accessing generateStatistics directly is not allowed due to private access.
        assertEquals(checker, optimizer.getConvergenceChecker());
    }

    // Helper method to set the objective function for doOptimize
    private void setObjectiveFunction(MultivariateFunction func) {
        this.objectiveFunction = func;
    }

    // Override the protected method for testing purposes
    private class TestCMAESOptimizer extends CMAESOptimizer {
        public TestCMAESOptimizer(int lambda, double[] inputSigma, int maxIterations, double stopFitness, boolean isActiveCMA, int diagonalOnly, int checkFeasableCount, RandomGenerator random, boolean generateStatistics, ConvergenceChecker<PointValuePair> checker) {
            super(lambda, inputSigma, maxIterations, stopFitness, isActiveCMA, diagonalOnly, checkFeasableCount, random, generateStatistics, checker);
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

        @Override
        protected PointValuePair doOptimize() {
            return super.doOptimize();
        }
    }


    @Test
    public void testOptimizeSimpleQuadratic() throws Exception {
        TestCMAESOptimizer optimizer = new TestCMAESOptimizer(10, null, 10000, 0, true, 0, 0, new MersenneTwister(123), false, null);
        optimizer.setGoalType(GoalType.MINIMIZE);
        SimpleQuadraticFunction quadraticFunction = new SimpleQuadraticFunction();
        optimizer.optimize(100, quadraticFunction, GoalType.MINIMIZE, START_POINT);
        PointValuePair result = optimizer.doOptimize();
        assertNotNull(result);
        // The optimum for x^2 + y^2 is at (0,0)
        double[] point = result.getPoint();
        assertEquals(0.0, point[0], 1e-5);
        assertEquals(0.0, point[1], 1e-5);
        assertEquals(0.0, result.getValue(), 1e-5);
    }

    @Test
    public void testOptimizeSimpleQuadratic3D() throws Exception {
        TestCMAESOptimizer optimizer = new TestCMAESOptimizer(10, null, 10000, 0, true, 0, 0, new MersenneTwister(123), false, null);
        optimizer.setGoalType(GoalType.MINIMIZE);
        SimpleQuadraticFunction quadraticFunction = new SimpleQuadraticFunction();
        optimizer.optimize(100, quadraticFunction, GoalType.MINIMIZE, START_POINT_3D);
        PointValuePair result = optimizer.doOptimize();
        assertNotNull(result);
        double[] point = result.getPoint();
        assertEquals(0.0, point[0], 1e-5);
        assertEquals(0.0, point[1], 1e-5);
        assertEquals(0.0, point[2], 1e-5);
        assertEquals(0.0, result.getValue(), 1e-5);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testDimensionMismatchInOptimization() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.setGoalType(GoalType.MINIMIZE);
        optimizer.optimize(100, new SimpleQuadraticFunction(), GoalType.MINIMIZE, START_POINT_DIM_MISMATCH);
    }

    @Test
    public void testMaximizeSimpleQuadratic() throws Exception {
        TestCMAESOptimizer optimizer = new TestCMAESOptimizer(20, null, 10000, 0, true, 0, 0, new MersenneTwister(123), false, null);
        optimizer.setGoalType(GoalType.MAXIMIZE);
        SimpleQuadraticFunction quadraticFunction = new SimpleQuadraticFunction();
        optimizer.optimize(100, quadraticFunction, GoalType.MAXIMIZE, START_POINT);
        PointValuePair result = optimizer.doOptimize();
        assertNotNull(result);
        double[] point = result.getPoint();
        assertNotEquals(0.0, point[0], 1e-9);
        assertNotEquals(0.0, point[1], 1e-9);
        assertTrue(result.getValue() < 0);
    }

    @Test
    public void testWithBounds() throws Exception {
        TestCMAESOptimizer optimizer = new TestCMAESOptimizer(20, null, 10000, 0, true, 0, 0, new MersenneTwister(123), false, null);
        optimizer.setGoalType(GoalType.MINIMIZE);
        double[] lowerBounds = {-1.0, -1.0};
        double[] upperBounds = {1.0, 1.0};
        SimpleQuadraticFunction quadraticFunction = new SimpleQuadraticFunction();
        optimizer.optimize(100, quadraticFunction, GoalType.MINIMIZE, START_POINT, lowerBounds, upperBounds);
        PointValuePair result = optimizer.doOptimize();
        assertNotNull(result);
        double[] point = result.getPoint();
        assertEquals(0.0, point[0], 1e-5);
        assertEquals(0.0, point[1], 1e-5);
        assertEquals(0.0, result.getValue(), 1e-5);
    }

    @Test
    public void testWithBoundsAndMaximize() throws Exception {
        TestCMAESOptimizer optimizer = new TestCMAESOptimizer(20, null, 10000, 0, true, 0, 0, new MersenneTwister(123), false, null);
        optimizer.setGoalType(GoalType.MAXIMIZE);
        double[] lowerBounds = {-1.0, -1.0};
        double[] upperBounds = {1.0, 1.0};
        SimpleQuadraticFunction quadraticFunction = new SimpleQuadraticFunction();
        optimizer.optimize(100, quadraticFunction, GoalType.MAXIMIZE, START_POINT, lowerBounds, upperBounds);
        PointValuePair result = optimizer.doOptimize();
        assertNotNull(result);
        double[] point = result.getPoint();
        assertEquals(2.0, result.getValue(), 1e-5);
        double x = point[0];
        double y = point[1];
        assertTrue(Math.abs(x) == 1.0);
        assertTrue(Math.abs(y) == 1.0);
    }

    @Test
    public void testCheckParametersForBoundOverflow() throws Exception {
        TestCMAESOptimizer optimizer = new TestCMAESOptimizer(10, null, 1, 0, true, 0, 0, new MersenneTwister(123), false, null);
        optimizer.setGoalType(GoalType.MINIMIZE);
        double[] lowerBounds = {0.0};
        double[] upperBounds = {Double.MAX_VALUE};
        double[] startPoint = {0.5};

        // Mocking computeObjectiveValue as it's called by optimize
        optimizer.setObjectiveFunction(new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0];
            }
        });
        optimizer.optimize(1, (MultivariateFunction) optimizer.objectiveFunction, GoalType.MINIMIZE, startPoint, lowerBounds, upperBounds);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckParametersForBoundMismatch() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.setGoalType(GoalType.MINIMIZE);
        double[] lowerBounds = {0.0};
        double[] upperBounds = {1.0};
        optimizer.optimize(1, new SimpleQuadraticFunction(), GoalType.MINIMIZE, START_POINT_DIM_MISMATCH, lowerBounds, upperBounds);
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckParametersForSigmaNotPositive() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{-0.1});
        optimizer.setGoalType(GoalType.MINIMIZE);
        optimizer.optimize(1, new SimpleQuadraticFunction(), GoalType.MINIMIZE, START_POINT);
    }

    @Test(expected = OutOfRangeException.class)
    public void testCheckParametersForSigmaOutOfRange() throws Exception {
        double[] lowerBounds = {0.0};
        double[] upperBounds = {1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{2.0}, 100, 0, true, 0, 0, new MersenneTwister(123), false, null);
        optimizer.setGoalType(GoalType.MINIMIZE);
        optimizer.optimize(1, new SimpleQuadraticFunction(), GoalType.MINIMIZE, START_POINT_DIM_MISMATCH, lowerBounds, upperBounds);
    }

    @Test
    public void testInitializeCMAWithNullSigmaAndNoBounds() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        optimizer.inputSigma = null;
        optimizer.boundaries = null;
        optimizer.dimension = 2;
        optimizer.initializeCMA(new double[]{0.0, 0.0});
        assertEquals(0.3, optimizer.sigma, 1e-9);
    }

    @Test
    public void testInitializeCMAWithNonNullSigmaAndNoBounds() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        optimizer.inputSigma = new double[]{0.5, 0.5};
        optimizer.boundaries = null;
        optimizer.dimension = 2;
        optimizer.initializeCMA(new double[]{0.0, 0.0});
        assertEquals(0.5, optimizer.sigma, 1e-9);
    }

    @Test
    public void testInitializeCMAWithNonNullSigmaAndBounds() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        optimizer.inputSigma = new double[]{0.2, 0.3};
        optimizer.boundaries = new double[][]{{-1.0, -2.0}, {1.0, 2.0}};
        optimizer.dimension = 2;
        optimizer.initializeCMA(new double[]{0.0, 0.0});
        assertEquals(0.1, optimizer.sigma, 1e-9);
    }

    @Test
    public void testFitnessFunctionEncodeDecode() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        double[] lowerBounds = {-10.0, -5.0};
        double[] upperBounds = {10.0, 5.0};
        optimizer.boundaries = new double[][]{lowerBounds, upperBounds};
        optimizer.dimension = 2;

        double[] originalPoint = {0.0, 0.0};
        double[] encodedPoint = optimizer.new FitnessFunction().encode(originalPoint);
        assertArrayEquals(new double[]{0.5, 0.5}, encodedPoint, 1e-9);

        double[] decodedPoint = optimizer.new FitnessFunction().decode(encodedPoint);
        assertArrayEquals(originalPoint, decodedPoint, 1e-9);
    }

    @Test
    public void testFitnessFunctionRepairAndDecode() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        double[] lowerBounds = {-1.0, -1.0};
        double[] upperBounds = {1.0, 1.0};
        optimizer.boundaries = new double[][]{lowerBounds, upperBounds};
        optimizer.dimension = 2;

        double[] outOfBoundsPoint = {-2.0, 2.0};
        double[] repairedDecoded = optimizer.new FitnessFunction().repairAndDecode(outOfBoundsPoint);
        assertArrayEquals(new double[]{-1.0, 1.0}, repairedDecoded, 1e-9);
    }

    @Test
    public void testFitnessFunctionIsFeasible() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.boundaries = null;
        assertTrue(optimizer.new FitnessFunction().isFeasible(new double[]{0.5, 0.5}));
        assertTrue(optimizer.new FitnessFunction().isFeasible(new double[]{-0.5, 1.5}));

        optimizer.boundaries = new double[][]{{0.0, 0.0}, {1.0, 1.0}};
        assertTrue(optimizer.new FitnessFunction().isFeasible(new double[]{0.5, 0.5}));
        assertTrue(optimizer.new FitnessFunction().isFeasible(new double[]{0.0, 1.0}));
        assertFalse(optimizer.new FitnessFunction().isFeasible(new double[]{-0.1, 0.5}));
        assertFalse(optimizer.new FitnessFunction().isFeasible(new double[]{0.5, 1.1}));
    }

    @Test
    public void testFitnessFunctionValueWithPenalty() throws Exception {
        TestCMAESOptimizer optimizer = new TestCMAESOptimizer(10, null, 10000, 0, true, 0, 0, new MersenneTwister(123), false, null);
        optimizer.setGoalType(GoalType.MINIMIZE);
        double[] lowerBounds = {-1.0, -1.0};
        double[] upperBounds = {1.0, 1.0};
        optimizer.boundaries = new double[][]{lowerBounds, upperBounds};
        optimizer.dimension = 2;
        optimizer.isMinimize = true;

        optimizer.setObjectiveFunction(new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        });
        optimizer.optimize(100, (MultivariateFunction) optimizer.objectiveFunction, GoalType.MINIMIZE, new double[]{0.0, 0.0}); // Call optimize to set up internal state

        double[] point1 = {0.5, 0.5};
        optimizer.new FitnessFunction().setValueRange(1.0);
        assertEquals(0.5, optimizer.new FitnessFunction().value(point1), 1e-9);

        double[] point2 = {1.5, 0.5};
        optimizer.new FitnessFunction().setValueRange(1.0);
        assertEquals(9.5, optimizer.new FitnessFunction().value(point2), 1e-9);

        optimizer.isMinimize = false;
        assertEquals(-0.5, optimizer.new FitnessFunction().value(point1), 1e-9);
        assertEquals(-9.5, optimizer.new FitnessFunction().value(point2), 1e-9);
    }


    @Test
    public void testMatrixLog() {
        double[][] data = {{Math.E, Math.E * Math.E}, {1.0, 10.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        RealMatrix result = CMAESOptimizer.log(matrix);
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(2.0, result.getEntry(0, 1), 1e-9);
        assertEquals(0.0, result.getEntry(1, 0), 1e-9);
        assertEquals(Math.log(10.0), result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMatrixSqrt() {
        double[][] data = {{4.0, 9.0}, {16.0, 0.25}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        RealMatrix result = CMAESOptimizer.sqrt(matrix);
        assertEquals(2.0, result.getEntry(0, 0), 1e-9);
        assertEquals(3.0, result.getEntry(0, 1), 1e-9);
        assertEquals(4.0, result.getEntry(1, 0), 1e-9);
        assertEquals(0.5, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMatrixSquare() {
        double[][] data = {{2.0, 3.0}, {4.0, 0.5}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        RealMatrix result = CMAESOptimizer.square(matrix);
        assertEquals(4.0, result.getEntry(0, 0), 1e-9);
        assertEquals(9.0, result.getEntry(0, 1), 1e-9);
        assertEquals(16.0, result.getEntry(1, 0), 1e-9);
        assertEquals(0.25, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMatrixTimes() {
        double[][] data1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] data2 = {{5.0, 6.0}, {7.0, 8.0}};
        RealMatrix matrix1 = new Array2DRowRealMatrix(data1);
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);
        RealMatrix result = CMAESOptimizer.times(matrix1, matrix2);
        assertEquals(5.0, result.getEntry(0, 0), 1e-9);
        assertEquals(12.0, result.getEntry(0, 1), 1e-9);
        assertEquals(21.0, result.getEntry(1, 0), 1e-9);
        assertEquals(32.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMatrixDivide() {
        double[][] data1 = {{10.0, 20.0}, {30.0, 40.0}};
        double[][] data2 = {{2.0, 5.0}, {3.0, 8.0}};
        RealMatrix matrix1 = new Array2DRowRealMatrix(data1);
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);
        RealMatrix result = CMAESOptimizer.divide(matrix1, matrix2);
        assertEquals(5.0, result.getEntry(0, 0), 1e-9);
        assertEquals(4.0, result.getEntry(0, 1), 1e-9);
        assertEquals(10.0, result.getEntry(1, 0), 1e-9);
        assertEquals(5.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMatrixSelectColumns() {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        int[] cols = {0, 2};
        RealMatrix result = CMAESOptimizer.selectColumns(matrix, cols);
        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(3.0, result.getEntry(0, 1), 1e-9);
        assertEquals(4.0, result.getEntry(1, 0), 1e-9);
        assertEquals(6.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMatrixTriu() {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        RealMatrix result = CMAESOptimizer.triu(matrix, 0);
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(2.0, result.getEntry(0, 1), 1e-9);
        assertEquals(3.0, result.getEntry(0, 2), 1e-9);
        assertEquals(0.0, result.getEntry(1, 0), 1e-9);
        assertEquals(5.0, result.getEntry(1, 1), 1e-9);
        assertEquals(6.0, result.getEntry(1, 2), 1e-9);
        assertEquals(0.0, result.getEntry(2, 0), 1e-9);
        assertEquals(0.0, result.getEntry(2, 1), 1e-9);
        assertEquals(9.0, result.getEntry(2, 2), 1e-9);
    }

    @Test
    public void testMatrixSumRows() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        RealMatrix result = CMAESOptimizer.sumRows(matrix);
        assertEquals(1, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(9.0, result.getEntry(0, 0), 1e-9);
        assertEquals(12.0, result.getEntry(0, 1), 1e-9);
    }

    @Test
    public void testMatrixDiagColumnToMatrix() {
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        RealMatrix result = CMAESOptimizer.diag(matrix);
        assertEquals(3, result.getRowDimension());
        assertEquals(3, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(2.0, result.getEntry(1, 1), 1e-9);
        assertEquals(3.0, result.getEntry(2, 2), 1e-9);
        assertEquals(0.0, result.getEntry(0, 1), 1e-9);
    }

    @Test
    public void testMatrixDiagMatrixToColumn() {
        double[][] data = {{1.0, 0.0, 0.0}, {0.0, 2.0, 0.0}, {0.0, 0.0, 3.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        RealMatrix result = CMAESOptimizer.diag(matrix);
        assertEquals(3, result.getRowDimension());
        assertEquals(1, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(2.0, result.getEntry(1, 0), 1e-9);
        assertEquals(3.0, result.getEntry(2, 0), 1e-9);
    }

    @Test
    public void testMatrixCopyColumn() {
        double[][] data1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] data2 = {{5.0, 6.0}, {7.0, 8.0}};
        RealMatrix m1 = new Array2DRowRealMatrix(data1);
        RealMatrix m2 = new Array2DRowRealMatrix(data2);
        CMAESOptimizer.copyColumn(m1, 0, m2, 1);
        assertEquals(5.0, m2.getEntry(0, 0), 1e-9);
        assertEquals(1.0, m2.getEntry(0, 1), 1e-9);
        assertEquals(7.0, m2.getEntry(1, 0), 1e-9);
        assertEquals(3.0, m2.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMatrixOnes() {
        RealMatrix result = CMAESOptimizer.ones(2, 3);
        assertEquals(2, result.getRowDimension());
        assertEquals(3, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(1.0, result.getEntry(1, 2), 1e-9);
    }

    @Test
    public void testMatrixEye() {
        RealMatrix result = CMAESOptimizer.eye(3, 4);
        assertEquals(3, result.getRowDimension());
        assertEquals(4, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(1.0, result.getEntry(1, 1), 1e-9);
        assertEquals(1.0, result.getEntry(2, 2), 1e-9);
        assertEquals(0.0, result.getEntry(0, 1), 1e-9);
        assertEquals(0.0, result.getEntry(2, 3), 1e-9);
    }

    @Test
    public void testMatrixZeros() {
        RealMatrix result = CMAESOptimizer.zeros(2, 3);
        assertEquals(2, result.getRowDimension());
        assertEquals(3, result.getColumnDimension());
        assertEquals(0.0, result.getEntry(0, 0), 1e-9);
        assertEquals(0.0, result.getEntry(1, 2), 1e-9);
    }

    @Test
    public void testMatrixRepmat() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        RealMatrix result = CMAESOptimizer.repmat(matrix, 2, 3);
        assertEquals(4, result.getRowDimension());
        assertEquals(6, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(2.0, result.getEntry(0, 1), 1e-9);
        assertEquals(3.0, result.getEntry(1, 0), 1e-9);
        assertEquals(4.0, result.getEntry(1, 1), 1e-9);
        assertEquals(1.0, result.getEntry(2, 2), 1e-9);
        assertEquals(4.0, result.getEntry(3, 3), 1e-9);
    }

    @Test
    public void testMatrixSequence() {
        RealMatrix result = CMAESOptimizer.sequence(1.0, 5.0, 1.0);
        assertEquals(5, result.getRowDimension());
        assertEquals(1, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(2.0, result.getEntry(1, 0), 1e-9);
        assertEquals(5.0, result.getEntry(4, 0), 1e-9);
    }

    @Test
    public void testMatrixMax() {
        double[][] data = {{1.0, -2.0}, {3.0, 0.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        assertEquals(3.0, CMAESOptimizer.max(matrix), 1e-9);
    }

    @Test
    public void testMatrixMin() {
        double[][] data = {{1.0, -2.0}, {3.0, 0.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        assertEquals(-2.0, CMAESOptimizer.min(matrix), 1e-9);
    }

    @Test
    public void testArrayMax() {
        double[] array = {1.0, -2.0, 3.0, 0.0};
        assertEquals(3.0, CMAESOptimizer.max(array), 1e-9);
    }

    @Test
    public void testArrayMin() {
        double[] array = {1.0, -2.0, 3.0, 0.0};
        assertEquals(-2.0, CMAESOptimizer.min(array), 1e-9);
    }

    @Test
    public void testMatrixInverseIndices() {
        int[] indices = {1, 0, 2};
        int[] inverse = CMAESOptimizer.inverse(indices);
        assertArrayEquals(new int[]{1, 0, 2}, inverse);
    }

    @Test
    public void testMatrixReverseIndices() {
        int[] indices = {1, 0, 2, 3};
        int[] reversed = CMAESOptimizer.reverse(indices);
        assertArrayEquals(new int[]{3, 2, 0, 1}, reversed);
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
    public void testMatrixDoubleIndexCompareTo() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(1.5, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(1.5, 1);
        CMAESOptimizer.DoubleIndex di3 = new CMAESOptimizer.DoubleIndex(2.5, 2);
        CMAESOptimizer.DoubleIndex di4 = new CMAESOptimizer.DoubleIndex(0.5, 3);

        assertEquals(0, di1.compareTo(di2));
        assertTrue(di1.compareTo(di3) < 0);
        assertTrue(di1.compareTo(di4) > 0);
    }

    @Test
    public void testMatrixDoubleIndexEquals() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(1.5, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(1.5, 1);
        CMAESOptimizer.DoubleIndex di3 = new CMAESOptimizer.DoubleIndex(2.5, 2);

        assertTrue(di1.equals(di1));
        assertTrue(di1.equals(di2));
        assertFalse(di1.equals(di3));
        assertFalse(di1.equals(null));
        assertFalse(di1.equals("string"));
    }

    @Test
    public void testMatrixDoubleIndexHashCode() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(1.5, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(1.5, 1);
        CMAESOptimizer.DoubleIndex di3 = new CMAESOptimizer.DoubleIndex(2.5, 2);

        assertEquals(di1.hashCode(), di2.hashCode());
        assertNotEquals(di1.hashCode(), di3.hashCode());
    }

    @Test
    public void testGetStatistics() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 100, 0, true, 0, 0, new MersenneTwister(123), true);
        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testPushToHistory() {
        double[] history = new double[3];
        CMAESOptimizer.push(history, 1.0);
        CMAESOptimizer.push(history, 2.0);
        CMAESOptimizer.push(history, 3.0);
        assertArrayEquals(new double[]{3.0, 2.0, 1.0}, history, 1e-9);
        CMAESOptimizer.push(history, 4.0);
        assertArrayEquals(new double[]{4.0, 3.0, 2.0}, history, 1e-9);
    }

    @Test
    public void testSortedIndices() {
        double[] values = {3.0, 1.0, 2.0};
        int[] sorted = CMAESOptimizer.this.sortedIndices(values);
        assertArrayEquals(new int[]{1, 2, 0}, sorted);
    }

    @Test
    public void testInitializeCMA_PopulationSizeCalculation() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(0);
        optimizer.dimension = 10;
        optimizer.initializeCMA(new double[10]);
        assertEquals(10, optimizer.lambda);
    }

    @Test
    public void testInitializeCMA_WeightsCalculation() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(20);
        optimizer.dimension = 5;
        optimizer.initializeCMA(new double[5]);

        double sumW = 0;
        for (double w : optimizer.weights.getColumn(0)) {
            sumW += w;
        }
        assertEquals(1.0, sumW, 1e-9);
        double sumWQ = 0;
        for (double w : optimizer.weights.getColumn(0)) {
            sumWQ += w * w;
        }
        double mueffExpected = sumW * sumW / sumWQ;
        assertEquals(mueffExpected, optimizer.mueff, 1e-9);
    }

    @Test
    public void testInitializeCMA_ConstantCalculations() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(20);
        optimizer.dimension = 5;
        optimizer.mueff = 5.0;
        optimizer.maxIterations = 1000;
        optimizer.random = new MersenneTwister(1);

        optimizer.inputSigma = new double[]{1.0, 1.0, 1.0, 1.0, 1.0};
        optimizer.boundaries = null;
        optimizer.initializeCMA(new double[5]);

        double ccExpected = (4.0 + 5.0 / 5.0) / (5.0 + 4.0 + 2.0 * 5.0 / 5.0);
        assertEquals(ccExpected, optimizer.cc, 1e-9);

        double csExpected = (5.0 + 2.0) / (5.0 + 5.0 + 3.0);
        assertEquals(csExpected, optimizer.cs, 1e-9);

        double dampsExpected = (1.0 + 2.0 * Math.max(0, Math.sqrt((5.0 - 1.) / (5.0 + 1.)) - 1.0)) *
                               Math.max(0.3, 1.0 - 5.0 / (1e-6 + Math.min(1000, 30000.0 / 20.0))) + csExpected;
        assertEquals(dampsExpected, optimizer.damps, 1e-9);

        double ccov1Expected = 2.0 / ((5.0 + 1.3) * (5.0 + 1.3) + 5.0);
        assertEquals(ccov1Expected, optimizer.ccov1, 1e-9);

        double ccovmuExpected = Math.min(1.0 - ccov1Expected, 2.0 * (5.0 - 2.0 + 1.0 / 5.0) / ((5.0 + 2.0) * (5.0 + 2.0) + 5.0));
        assertEquals(ccovmuExpected, optimizer.ccovmu, 1e-9);

        double chiNExpected = Math.sqrt(5.0) * (1.0 - 1.0 / (4.0 * 5.0) + 1.0 / (21.0 * 5.0 * 5.0));
        assertEquals(chiNExpected, optimizer.chiN, 1e-9);
    }
}
```

SOURCE CODE ANALYSIS - The tests cover the `doOptimize` method by testing simple quadratic functions with and without bounds, and with minimization and maximization goals. Helper methods for matrix operations, initialization of CMA-ES parameters, and the `FitnessFunction` class are also tested. Boundary conditions and exceptions are also checked.
TEST CASE DESIGN -
- testDefaultConstructor: Tests default values of the optimizer.
- testConstructorWithLambda: Tests constructor with lambda.
- testConstructorWithLambdaAndSigma: Tests constructor with lambda and sigma.
- testConstructorWithAllParameters: Tests constructor with all parameters.
- testOptimizeSimpleQuadratic: Tests optimization of a simple quadratic function (minimization).
- testOptimizeSimpleQuadratic3D: Tests optimization of a 3D simple quadratic function (minimization).
- testDimensionMismatchInOptimization: Tests DimensionMismatchException when start point and function dimension mismatch.
- testMaximizeSimpleQuadratic: Tests optimization of a simple quadratic function (maximization).
- testWithBounds: Tests optimization with bounds.
- testWithBoundsAndMaximize: Tests optimization with bounds and maximization.
- testCheckParametersForBoundOverflow: Tests behavior with large bounds.
- testCheckParametersForBoundMismatch: Tests DimensionMismatchException during parameter check.
- testCheckParametersForSigmaNotPositive: Tests NotPositiveException for negative sigma.
- testCheckParametersForSigmaOutOfRange: Tests OutOfRangeException for sigma out of bounds.
- testInitializeCMAWithNullSigmaAndNoBounds: Tests initialization with null sigma and no bounds.
- testInitializeCMAWithNonNullSigmaAndNoBounds: Tests initialization with non-null sigma and no bounds.
- testInitializeCMAWithNonNullSigmaAndBounds: Tests initialization with non-null sigma and bounds.
- testFitnessFunctionEncodeDecode: Tests encode/decode methods of FitnessFunction.
- testFitnessFunctionRepairAndDecode: Tests repairAndDecode method of FitnessFunction.
- testFitnessFunctionIsFeasible: Tests isFeasible method of FitnessFunction.
- testFitnessFunctionValueWithPenalty: Tests value method of FitnessFunction with penalties.
- testMatrixLog: Tests static log method for matrices.
- testMatrixSqrt: Tests static sqrt method for matrices.
- testMatrixSquare: Tests static square method for matrices.
- testMatrixTimes: Tests static times method for matrices.
- testMatrixDivide: Tests static divide method for matrices.
- testMatrixSelectColumns: Tests static selectColumns method for matrices.
- testMatrixTriu: Tests static triu method for matrices.
- testMatrixSumRows: Tests static sumRows method for matrices.
- testMatrixDiagColumnToMatrix: Tests static diag method (column to matrix).
- testMatrixDiagMatrixToColumn: Tests static diag method (matrix to column).
- testMatrixCopyColumn: Tests static copyColumn method.
- testMatrixOnes: Tests static ones method.
- testMatrixEye: Tests static eye method.
- testMatrixZeros: Tests static zeros method.
- testMatrixRepmat: Tests static repmat method.
- testMatrixSequence: Tests static sequence method.
- testMatrixMax: Tests static max method for matrices.
- testMatrixMin: Tests static min method for matrices.
- testArrayMax: Tests static max method for arrays.
- testArrayMin: Tests static min method for arrays.
- testMatrixInverseIndices: Tests static inverse method.
- testMatrixReverseIndices: Tests static reverse method.
- testRandomGeneratorNextGaussian: Tests RandomGenerator.nextGaussian.
- testRandomGeneratorNextDouble: Tests RandomGenerator.nextDouble.
- testRandomGeneratorNextInt: Tests RandomGenerator.nextInt(n).
- testRandomGeneratorNextIntUnlimited: Tests RandomGenerator.nextInt().
- testMatrixDoubleIndexCompareTo: Tests DoubleIndex.compareTo.
- testMatrixDoubleIndexEquals: Tests DoubleIndex.equals.
- testMatrixDoubleIndexHashCode: Tests DoubleIndex.hashCode.
- testGetStatistics: Tests statistic getters.
- testPushToHistory: Tests push method for history.
- testSortedIndices: Tests sortedIndices method.
- testInitializeCMA_PopulationSizeCalculation: Tests lambda calculation in initializeCMA.
- testInitializeCMA_WeightsCalculation: Tests weights calculation in initializeCMA.
- testInitializeCMA_ConstantCalculations: Tests constant calculations in initializeCMA.
DEFECT DETECTION STRATEGY - Tests focus on the core optimization loop, parameter initialization, boundary handling, and matrix utility functions. Specific edge cases like overflow, dimension mismatches, and invalid input parameters are tested to catch potential defects in logic or error handling.
SUMMARY - 51 tests.
LIMITATIONS - Some tests rely on the internal state of CMAESOptimizer, which might be brittle. The exact convergence behavior for maximization problems without bounds can be non-deterministic.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.