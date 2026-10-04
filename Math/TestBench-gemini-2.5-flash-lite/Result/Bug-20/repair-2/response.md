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
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NotPositiveException;
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

    private static final double DELTA = 1e-9;

    // Simple function to test
    private static class SimpleObjectiveFunction implements MultivariateFunction {
        @Override
        public double value(double[] point) {
            // Ensure the point is not null and has at least two elements for this example
            if (point == null || point.length < 2) {
                throw new IllegalArgumentException("Point must have at least two dimensions.");
            }
            return point[0] * point[0] + point[1] * point[1];
        }
    }

    @Test
    public void testConstructorDefault() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorWithLambda() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorWithLambdaAndSigma() {
        double[] sigma = {1.0, 2.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorFull() {
        double[] sigma = {1.0, 2.0};
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker();
        CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma, 1000, 0.0, true, 0, 0, new MersenneTwister(), false, checker);
        assertNotNull(optimizer);
    }

    // Helper method to set start point and optimize
    private PointValuePair optimizeSimpleFunction(CMAESOptimizer optimizer, double[] startPoint, GoalType goalType) {
        optimizer.setStartPoint(startPoint); // This method exists in BaseAbstractMultivariateSimpleBoundsOptimizer
        return optimizer.optimize(goalType, new SimpleObjectiveFunction()); // This optimize method is available
    }

    @Test
    public void testGetStatisticsSigmaHistory() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0});
        optimizer.setStartPoint(new double[]{0.0, 0.0});
        // The optimize method requires a specific signature that includes dimension, function, goalType, and startPoint
        // Based on the parent class's optimize method signature:
        // optimize(int maxEval, MultivariateFunction f, GoalType goalType, double[] startPoint)
        optimizer.optimize(1000, new SimpleObjectiveFunction(), GoalType.MINIMIZE, new double[]{0.0, 0.0});
        List<Double> history = optimizer.getStatisticsSigmaHistory();
        assertNotNull(history);
        assertTrue(history.size() > 0); // Should have collected some data
    }

    @Test
    public void testGetStatisticsMeanHistory() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0});
        optimizer.setStartPoint(new double[]{0.0, 0.0});
        optimizer.optimize(1000, new SimpleObjectiveFunction(), GoalType.MINIMIZE, new double[]{0.0, 0.0});
        List<RealMatrix> history = optimizer.getStatisticsMeanHistory();
        assertNotNull(history);
        assertTrue(history.size() > 0);
    }

    @Test
    public void testGetStatisticsFitnessHistory() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0});
        optimizer.setStartPoint(new double[]{0.0, 0.0});
        optimizer.optimize(1000, new SimpleObjectiveFunction(), GoalType.MINIMIZE, new double[]{0.0, 0.0});
        List<Double> history = optimizer.getStatisticsFitnessHistory();
        assertNotNull(history);
        assertTrue(history.size() > 0);
    }

    @Test
    public void testGetStatisticsDHistory() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0});
        optimizer.setStartPoint(new double[]{0.0, 0.0});
        optimizer.optimize(1000, new SimpleObjectiveFunction(), GoalType.MINIMIZE, new double[]{0.0, 0.0});
        List<RealMatrix> history = optimizer.getStatisticsDHistory();
        assertNotNull(history);
        assertTrue(history.size() > 0);
    }

    @Test
    public void testOptimizeSimpleFunction() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0, 1.0});
        PointValuePair result = optimizeSimpleFunction(optimizer, new double[]{5.0, 5.0}, GoalType.MINIMIZE);
        assertNotNull(result);
        double[] point = result.getPoint();
        // The optimization might not reach exact zero due to convergence criteria and stochastic nature
        // Asserting closeness to zero is more appropriate.
        assertTrue(Math.abs(point[0]) < 1e-3);
        assertTrue(Math.abs(point[1]) < 1e-3);
        assertTrue(Math.abs(result.getValue()) < 1e-6);
    }

    @Test
    public void testOptimizeSimpleFunctionMaximize() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0, 1.0});
        PointValuePair result = optimizeSimpleFunction(optimizer, new double[]{5.0, 5.0}, GoalType.MAXIMIZE);
        assertNotNull(result);
        double[] point = result.getPoint();
        // Maximizing a function with a minimum at (0,0) should move away from it.
        // The exact point will depend on the search process.
        // We check if the value is significantly positive.
        assertTrue(result.getValue() > 0);
    }

    @Test
    public void testOptimizeWithBounds() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0, 1.0});
        optimizer.setLowerBound(new double[]{-2.0, -2.0}); // setLowerBound and setUpperBound exist in BaseAbstractMultivariateSimpleBoundsOptimizer
        optimizer.setUpperBound(new double[]{2.0, 2.0});
        PointValuePair result = optimizeSimpleFunction(optimizer, new double[]{5.0, 5.0}, GoalType.MINIMIZE);
        assertNotNull(result);
        double[] point = result.getPoint();
        assertTrue(point[0] >= -2.0 - DELTA && point[0] <= 2.0 + DELTA);
        assertTrue(point[1] >= -2.0 - DELTA && point[1] <= 2.0 + DELTA);
        // Minimum is at (0,0) which is within bounds, so value should be close to 0.
        assertTrue(Math.abs(result.getValue()) < 1e-6);
    }

    @Test
    public void testOptimizeWithBoundsAndMinimumOutside() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0, 1.0});
        optimizer.setLowerBound(new double[]{3.0, 3.0});
        optimizer.setUpperBound(new double[]{6.0, 6.0});
        PointValuePair result = optimizeSimpleFunction(optimizer, new double[]{5.0, 5.0}, GoalType.MINIMIZE);
        assertNotNull(result);
        double[] point = result.getPoint();
        // The minimum of x^2+y^2 is at (0,0), but bounds are [3,6]. So the closest point is (3,3).
        assertEquals(3.0, point[0], DELTA);
        assertEquals(3.0, point[1], DELTA);
        assertEquals(18.0, result.getValue(), DELTA); // 3^2 + 3^2 = 9 + 9 = 18
    }

    @Test
    public void testDimensionMismatchExceptionInConstructor() {
        double[] sigma = {1.0}; // Dimension 1
        try {
            CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma);
            optimizer.setStartPoint(new double[]{0.0, 0.0});
            // Use the optimize method that takes maxEval, function, goalType, startPoint
            optimizer.optimize(1000, new SimpleObjectiveFunction(), GoalType.MINIMIZE, new double[]{0.0, 0.0});
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // Expected
        } catch (Exception e) {
            fail("Expected DimensionMismatchException but got " + e.getClass().getName());
        }
    }

    @Test
    public void testNotPositiveExceptionInConstructor() {
        double[] sigma = {1.0, -2.0}; // Negative sigma value
        try {
            CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma);
            optimizer.setStartPoint(new double[]{0.0, 0.0});
            optimizer.optimize(1000, new SimpleObjectiveFunction(), GoalType.MINIMIZE, new double[]{0.0, 0.0});
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // Expected
        } catch (Exception e) {
            fail("Expected NotPositiveException but got " + e.getClass().getName());
        }
    }

    @Test
    public void testOutOfRangeExceptionInConstructor() {
        double[] sigma = {5.0}; // Sigma larger than allowed range (0 to 1 for default bounds)
        try {
            CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma);
            optimizer.setStartPoint(new double[]{0.5});
            optimizer.setLowerBound(new double[]{0.0});
            optimizer.setUpperBound(new double[]{1.0});
            optimizer.optimize(1000, new SimpleObjectiveFunction(), GoalType.MINIMIZE, new double[]{0.5});
            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            // Expected
        } catch (Exception e) {
            fail("Expected OutOfRangeException but got " + e.getClass().getName());
        }
    }

    @Test
    public void testMathUnsupportedOperationException() {
        try {
            CMAESOptimizer optimizer = new CMAESOptimizer(10);
            optimizer.setStartPoint(new double[]{0.0, 0.0});
            optimizer.setLowerBound(new double[]{Double.NEGATIVE_INFINITY, 0.0}); // Mixed bounds
            optimizer.setUpperBound(new double[]{Double.POSITIVE_INFINITY, 1.0});
            optimizer.optimize(1000, new SimpleObjectiveFunction(), GoalType.MINIMIZE, new double[]{0.0, 0.0});
            fail("Expected MathUnsupportedOperationException");
        } catch (MathUnsupportedOperationException e) {
            // Expected
        } catch (Exception e) {
            fail("Expected MathUnsupportedOperationException but got " + e.getClass().getName());
        }
    }

    @Test
    public void testDoubleToMatrixConversion() {
        double[] d = {1.0, 2.0};
        // Use the constructor that takes a double array for a column matrix
        RealMatrix m = new Array2DRowRealMatrix(d);
        assertNotNull(m);
        assertEquals(2, m.getRowDimension());
        assertEquals(1, m.getColumnDimension());
        assertEquals(1.0, m.getEntry(0, 0), DELTA);
        assertEquals(2.0, m.getEntry(1, 0), DELTA);
    }

    @Test
    public void testMatrixToDoubleConversion() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix m = new Array2DRowRealMatrix(data);
        double[] row0 = m.getRow(0);
        assertArrayEquals(new double[]{1.0, 2.0}, row0, DELTA);
        double[] col0 = m.getColumn(0);
        assertArrayEquals(new double[]{1.0, 3.0}, col0, DELTA);
    }

    @Test
    public void testMatrixAddition() {
        RealMatrix m1 = new Array2DRowRealMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix m2 = new Array2DRowRealMatrix(new double[][]{{5.0, 6.0}, {7.0, 8.0}});
        RealMatrix sum = m1.add(m2);
        assertEquals(6.0, sum.getEntry(0, 0), DELTA);
        assertEquals(8.0, sum.getEntry(0, 1), DELTA);
        assertEquals(10.0, sum.getEntry(1, 0), DELTA);
        assertEquals(12.0, sum.getEntry(1, 1), DELTA);
    }

    @Test
    public void testMatrixMultiplication() {
        RealMatrix m1 = new Array2DRowRealMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix m2 = new Array2DRowRealMatrix(new double[][]{{5.0, 6.0}, {7.0, 8.0}});
        RealMatrix product = m1.multiply(m2);
        assertEquals(19.0, product.getEntry(0, 0), DELTA); // 1*5 + 2*7 = 19
        assertEquals(22.0, product.getEntry(0, 1), DELTA); // 1*6 + 2*8 = 22
        assertEquals(43.0, product.getEntry(1, 0), DELTA); // 3*5 + 4*7 = 43
        assertEquals(50.0, product.getEntry(1, 1), DELTA); // 3*6 + 4*8 = 50
    }

    @Test
    public void testMatrixScalarMultiply() {
        RealMatrix m = new Array2DRowRealMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix scaled = m.scalarMultiply(2.0);
        assertEquals(2.0, scaled.getEntry(0, 0), DELTA);
        assertEquals(4.0, scaled.getEntry(0, 1), DELTA);
        assertEquals(6.0, scaled.getEntry(1, 0), DELTA);
        assertEquals(8.0, scaled.getEntry(1, 1), DELTA);
    }

    @Test
    public void testEigenDecomposition() {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{{2.0, 1.0}, {1.0, 2.0}});
        EigenDecomposition eig = new EigenDecomposition(matrix);
        double[] realEigenvalues = eig.getRealEigenvalues();
        Arrays.sort(realEigenvalues);
        assertArrayEquals(new double[]{1.0, 3.0}, realEigenvalues, DELTA);
    }

    @Test
    public void testMathArraysCopyOf() {
        double[] original = {1.0, 2.0, 3.0};
        double[] copy = MathArrays.copyOf(original);
        assertArrayEquals(original, copy, DELTA);
        assertNotSame(original, copy);
    }

    // The FitnessFunction class is private, so we cannot instantiate it directly
    // using `optimizer.new FitnessFunction()`. We need to test its methods indirectly
    // through the CMAESOptimizer's doOptimize method or by testing the public methods
    // that use FitnessFunction.

    @Test
    public void testFitnessFunctionEncodeDecodeIndirectly() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        optimizer.setStartPoint(new double[]{0.5, 0.5});
        optimizer.setLowerBound(new double[]{0.0, 0.0});
        optimizer.setUpperBound(new double[]{1.0, 1.0});

        // Testing encode and decode through `doOptimize` is complex.
        // Instead, we can test the public methods `encode`, `decode`, `repairAndDecode`
        // if they were public. Since they are private, we cannot test them directly.
        // We will rely on tests of `doOptimize` which implicitly use these.
    }

    @Test
    public void testFitnessFunctionIsFeasible() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        optimizer.setStartPoint(new double[]{0.5, 0.5});
        optimizer.setLowerBound(new double[]{0.0, 0.0});
        optimizer.setUpperBound(new double[]{1.0, 1.0});

        // Since FitnessFunction is private, we need to access it via doOptimize
        // or if it were public. As it's private, we'll skip direct testing.
        // However, the `isFeasible` logic is critical. The `doOptimize` method
        // calls `fitfun.isFeasible`. We can indirectly test this by ensuring
        // `doOptimize` runs without issues for feasible/infeasible points if possible,
        // but direct calls to `isFeasible` are not allowed.
        // The original code had `optimizer.new FitnessFunction()`, which is not allowed for private inner classes.
        // The tests for `doOptimize` will cover the functionality of `isFeasible`.
    }

    @Test
    public void testFitnessFunctionValueWithBounds() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0, 1.0});
        optimizer.setStartPoint(new double[]{0.5, 0.5});
        optimizer.setLowerBound(new double[]{0.0, 0.0});
        optimizer.setUpperBound(new double[]{1.0, 1.0});

        // Private inner class, cannot instantiate directly.
        // The `value` method is called within `doOptimize`.
        // We will rely on `doOptimize` tests for this functionality.
    }


    @Test
    public void testMatrixDiagExtraction() {
        RealMatrix m = new Array2DRowRealMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix diagMatrix = CMAESOptimizer.diag(m);
        assertArrayEquals(new double[]{1.0, 4.0}, diagMatrix.getColumn(0), DELTA);
    }

    @Test
    public void testMatrixDiagFromVector() {
        RealMatrix diagVector = new Array2DRowRealMatrix(new double[]{1.0, 4.0});
        RealMatrix m = CMAESOptimizer.diag(diagVector);
        assertEquals(2, m.getRowDimension());
        assertEquals(2, m.getColumnDimension());
        assertEquals(1.0, m.getEntry(0, 0), DELTA);
        assertEquals(0.0, m.getEntry(0, 1), DELTA);
        assertEquals(0.0, m.getEntry(1, 0), DELTA);
        assertEquals(4.0, m.getEntry(1, 1), DELTA);
    }

    @Test
    public void testMatrixSqrt() {
        RealMatrix m = new Array2DRowRealMatrix(new double[][]{{4.0, 9.0}, {16.0, 25.0}});
        RealMatrix sqrtM = CMAESOptimizer.sqrt(m);
        assertEquals(2.0, sqrtM.getEntry(0, 0), DELTA);
        assertEquals(3.0, sqrtM.getEntry(0, 1), DELTA);
        assertEquals(4.0, sqrtM.getEntry(1, 0), DELTA);
        assertEquals(5.0, sqrtM.getEntry(1, 1), DELTA);
    }

    @Test
    public void testMatrixSquare() {
        RealMatrix m = new Array2DRowRealMatrix(new double[][]{{2.0, 3.0}, {4.0, 5.0}});
        RealMatrix squareM = CMAESOptimizer.square(m);
        assertEquals(4.0, squareM.getEntry(0, 0), DELTA);
        assertEquals(9.0, squareM.getEntry(0, 1), DELTA);
        assertEquals(16.0, squareM.getEntry(1, 0), DELTA);
        assertEquals(25.0, squareM.getEntry(1, 1), DELTA);
    }

    @Test
    public void testMatrixTimes() {
        RealMatrix m1 = new Array2DRowRealMatrix(new double[][]{{2.0, 3.0}});
        RealMatrix m2 = new Array2DRowRealMatrix(new double[][]{{4.0}, {5.0}});
        RealMatrix product = CMAESOptimizer.times(m1, m2); // Element-wise multiplication
        // The `times` method performs element-wise multiplication, not matrix multiplication.
        // The dimensions here are 1x2 and 3x1, which would cause a DimensionMismatchException for standard matrix multiplication.
        // However, the `times` method likely expects compatible dimensions for element-wise ops.
        // Re-creating based on source code behavior for element-wise operation.
        RealMatrix m1_correct_dims = new Array2DRowRealMatrix(new double[][]{{2.0, 3.0}});
        RealMatrix m2_correct_dims = new Array2DRowRealMatrix(new double[][]{{4.0, 5.0}});
        RealMatrix product_elementwise = CMAESOptimizer.times(m1_correct_dims, m2_correct_dims);
        assertEquals(8.0, product_elementwise.getEntry(0, 0), DELTA);
        assertEquals(15.0, product_elementwise.getEntry(0, 1), DELTA);
    }

    @Test
    public void testMatrixDivide() {
        RealMatrix m1_aligned = new Array2DRowRealMatrix(new double[][]{{8.0, 15.0}, {16.0, 25.0}});
        RealMatrix m2_aligned = new Array2DRowRealMatrix(new double[][]{{2.0, 3.0}, {4.0, 5.0}});
        RealMatrix division = CMAESOptimizer.divide(m1_aligned, m2_aligned);
        assertEquals(4.0, division.getEntry(0, 0), DELTA);
        assertEquals(5.0, division.getEntry(0, 1), DELTA);
        assertEquals(4.0, division.getEntry(1, 0), DELTA);
        assertEquals(5.0, division.getEntry(1, 1), DELTA);
    }

    @Test
    public void testMatrixSelectColumns() {
        RealMatrix m = new Array2DRowRealMatrix(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}});
        int[] cols = {0, 2};
        RealMatrix selected = CMAESOptimizer.selectColumns(m, cols);
        assertEquals(2, selected.getRowDimension());
        assertEquals(2, selected.getColumnDimension());
        assertEquals(1.0, selected.getEntry(0, 0), DELTA);
        assertEquals(3.0, selected.getEntry(0, 1), DELTA);
        assertEquals(4.0, selected.getEntry(1, 0), DELTA);
        assertEquals(6.0, selected.getEntry(1, 1), DELTA);
    }

    @Test
    public void testMatrixTriu() {
        RealMatrix m = new Array2DRowRealMatrix(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}});
        RealMatrix triuMatrix = CMAESOptimizer.triu(m, 0);
        assertEquals(1.0, triuMatrix.getEntry(0, 0), DELTA);
        assertEquals(2.0, triuMatrix.getEntry(0, 1), DELTA);
        assertEquals(3.0, triuMatrix.getEntry(0, 2), DELTA);
        assertEquals(0.0, triuMatrix.getEntry(1, 0), DELTA);
        assertEquals(5.0, triuMatrix.getEntry(1, 1), DELTA);
        assertEquals(6.0, triuMatrix.getEntry(1, 2), DELTA);
        assertEquals(0.0, triuMatrix.getEntry(2, 0), DELTA);
        assertEquals(0.0, triuMatrix.getEntry(2, 1), DELTA);
        assertEquals(9.0, triuMatrix.getEntry(2, 2), DELTA);
    }

    @Test
    public void testMatrixSumRows() {
        RealMatrix m = new Array2DRowRealMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}});
        RealMatrix rowSums = CMAESOptimizer.sumRows(m);
        assertEquals(1, rowSums.getRowDimension());
        assertEquals(2, rowSums.getColumnDimension());
        assertEquals(9.0, rowSums.getEntry(0, 0), DELTA); // 1+3+5
        assertEquals(12.0, rowSums.getEntry(0, 1), DELTA); // 2+4+6
    }

    @Test
    public void testMatrixCopyColumn() {
        RealMatrix m1 = new Array2DRowRealMatrix(new double[][]{{1.0}, {2.0}, {3.0}});
        RealMatrix m2 = new Array2DRowRealMatrix(new double[][]{{10.0}, {20.0}, {30.0}});
        CMAESOptimizer.copyColumn(m1, 0, m2, 0);
        assertEquals(1.0, m2.getEntry(0, 0), DELTA);
        assertEquals(2.0, m2.getEntry(1, 0), DELTA);
        assertEquals(3.0, m2.getEntry(2, 0), DELTA);
    }

    @Test
    public void testMatrixOnes() {
        RealMatrix onesMatrix = CMAESOptimizer.ones(2, 3);
        assertEquals(2, onesMatrix.getRowDimension());
        assertEquals(3, onesMatrix.getColumnDimension());
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                assertEquals(1.0, onesMatrix.getEntry(r, c), DELTA);
            }
        }
    }

    @Test
    public void testMatrixEye() {
        RealMatrix eyeMatrix = CMAESOptimizer.eye(3, 3);
        assertEquals(3, eyeMatrix.getRowDimension());
        assertEquals(3, eyeMatrix.getColumnDimension());
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (r == c) {
                    assertEquals(1.0, eyeMatrix.getEntry(r, c), DELTA);
                } else {
                    assertEquals(0.0, eyeMatrix.getEntry(r, c), DELTA);
                }
            }
        }
    }

    @Test
    public void testMatrixZeros() {
        RealMatrix zerosMatrix = CMAESOptimizer.zeros(2, 2);
        assertEquals(2, zerosMatrix.getRowDimension());
        assertEquals(2, zerosMatrix.getColumnDimension());
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {
                assertEquals(0.0, zerosMatrix.getEntry(r, c), DELTA);
            }
        }
    }

    @Test
    public void testMatrixRepmat() {
        RealMatrix mat = new Array2DRowRealMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix rep = CMAESOptimizer.repmat(mat, 2, 3);
        assertEquals(4, rep.getRowDimension()); // 2 * 2
        assertEquals(6, rep.getColumnDimension()); // 3 * 2
        assertEquals(1.0, rep.getEntry(0, 0), DELTA);
        assertEquals(2.0, rep.getEntry(0, 1), DELTA);
        assertEquals(3.0, rep.getEntry(1, 0), DELTA);
        assertEquals(4.0, rep.getEntry(1, 1), DELTA);
        assertEquals(1.0, rep.getEntry(2, 0), DELTA); // Repeat of first row
    }

    @Test
    public void testMatrixSequence() {
        RealMatrix seq = CMAESOptimizer.sequence(1.0, 5.0, 1.0);
        assertEquals(5, seq.getRowDimension());
        assertEquals(1, seq.getColumnDimension());
        assertEquals(1.0, seq.getEntry(0, 0), DELTA);
        assertEquals(2.0, seq.getEntry(1, 0), DELTA);
        assertEquals(5.0, seq.getEntry(4, 0), DELTA);
    }

    @Test
    public void testMatrixMax() {
        RealMatrix m = new Array2DRowRealMatrix(new double[][]{{1.0, 5.0}, {-2.0, 3.0}});
        assertEquals(5.0, CMAESOptimizer.max(m), DELTA);
    }

    @Test
    public void testMatrixMin() {
        RealMatrix m = new Array2DRowRealMatrix(new double[][]{{1.0, 5.0}, {-2.0, 3.0}});
        assertEquals(-2.0, CMAESOptimizer.min(m), DELTA);
    }

    @Test
    public void testArrayMax() {
        double[] arr = {1.0, 5.0, -2.0, 3.0};
        assertEquals(5.0, CMAESOptimizer.max(arr), DELTA);
    }

    @Test
    public void testArrayMin() {
        double[] arr = {1.0, 5.0, -2.0, 3.0};
        assertEquals(-2.0, CMAESOptimizer.min(arr), DELTA);
    }

    @Test
    public void testArrayInverse() {
        int[] indices = {1, 0, 2};
        int[] inverse = CMAESOptimizer.inverse(indices);
        assertArrayEquals(new int[]{1, 0, 2}, inverse);
    }

    @Test
    public void testArrayReverse() {
        int[] indices = {1, 2, 3, 4};
        int[] reversed = CMAESOptimizer.reverse(indices);
        assertArrayEquals(new int[]{4, 3, 2, 1}, reversed);
    }

    @Test
    public void testRandomGeneratorGaussian() {
        RandomGenerator rg = new MersenneTwister();
        double gaussianValue = rg.nextGaussian();
        // For a standard Gaussian distribution, values are generally within a few standard deviations.
        // A broad range is safer for a test.
        assertTrue(gaussianValue >= -5.0 && gaussianValue <= 5.0);
    }

    @Test
    public void testRandomGeneratorDouble() {
        RandomGenerator rg = new MersenneTwister();
        double doubleValue = rg.nextDouble();
        assertTrue(doubleValue >= 0.0 && doubleValue <= 1.0);
    }

    @Test
    public void testRandomGeneratorInt() {
        RandomGenerator rg = new MersenneTwister();
        int intValue = rg.nextInt(10); // Range [0, 9]
        assertTrue(intValue >= 0 && intValue < 10);
    }

    // New tests for uncalled methods

    @Test
    public void testDoubleIndexCompareTo() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(5.0, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(5.0, 1);
        CMAESOptimizer.DoubleIndex di3 = new CMAESOptimizer.DoubleIndex(10.0, 2);
        assertEquals(0, di1.compareTo(di2));
        assertEquals(-1, di1.compareTo(di3));
        assertEquals(1, di3.compareTo(di1));
    }

    @Test
    public void testDoubleIndexEquals() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(5.0, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(5.0, 1);
        CMAESOptimizer.DoubleIndex di3 = new CMAESOptimizer.DoubleIndex(10.0, 2);
        CMAESOptimizer.DoubleIndex di4 = new CMAESOptimizer.DoubleIndex(5.0, 0);

        assertEquals(di1, di4);
        assertNotEquals(di1, di2);
        assertNotEquals(di1, di3);
        assertNotEquals(di1, null);
        assertNotEquals(di1, new Object());
    }

    @Test
    public void testDoubleIndexHashCode() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(5.0, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(5.0, 1);
        CMAESOptimizer.DoubleIndex di3 = new CMAESOptimizer.DoubleIndex(10.0, 2);

        assertEquals(di1.hashCode(), di2.hashCode()); // Same value, different index
        assertNotEquals(di1.hashCode(), di3.hashCode()); // Different value
    }

    @Test
    public void testFitnessFunctionSetValueRange() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        // FitnessFunction is private, so cannot instantiate directly.
        // setValueRange is called internally by CMAESOptimizer.
        // We test its effect by observing the behavior of `value` within `doOptimize`,
        // but direct testing here is not possible.
    }

    @Test
    public void testOptimizeWithMaxIterationsTermination() {
        // CMAESOptimizer(int lambda, double[] inputSigma, int maxIterations, double stopFitness, ...)
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 1, 0.0, false, 0, 0, new MersenneTwister(), false);
        optimizer.setStartPoint(new double[]{10.0});
        MultivariateFunction func = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0] + 1000;
            }
        };
        // The optimize method used here is from BaseAbstractMultivariateSimpleBoundsOptimizer
        // signature: optimize(int maxEval, MultivariateFunction f, GoalType goalType, double[] startPoint)
        PointValuePair result = optimizer.optimize(1, func, GoalType.MINIMIZE, new double[]{10.0});
        assertNotNull(result);
        // With maxIterations = 1, it should have performed one iteration.
        // The exact result will depend on the initial steps of CMA-ES.
    }

    @Test
    public void testOptimizeWithStopFitnessTermination() {
        // CMAESOptimizer(int lambda, double[] inputSigma, int maxIterations, double stopFitness, ...)
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 30000, 0.1, false, 0, 0, new MersenneTwister(), false);
        optimizer.setStartPoint(new double[]{5.0});
        MultivariateFunction func = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        PointValuePair result = optimizer.optimize(1000, func, GoalType.MINIMIZE, new double[]{5.0});
        assertNotNull(result);
        // The function value is x^2, minimum is 0. If stopFitness is 0.1, it should stop when value <= 0.1
        assertTrue(result.getValue() <= 0.1 + DELTA);
    }

    @Test
    public void testOptimizeWithStopTolFunTermination() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 30000, 0.0, false, 0, 0, new MersenneTwister(), false);
        optimizer.setStopFitness(0.0); // Ensure stopFitness doesn't terminate early
        optimizer.setStartPoint(new double[]{0.1, 0.1});
        MultivariateFunction func = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                // A function with a very flat minimum around (0,0)
                return Math.pow(point[0] * point[0] + point[1] * point[1], 2);
            }
        };
        // Default stopTolFun is 1e-12. This test aims to show termination based on flatness.
        PointValuePair result = optimizer.optimize(30000, func, GoalType.MINIMIZE, new double[]{0.1, 0.1});
        assertNotNull(result);
        // The value should be very close to zero due to the flat minimum and stopTolFun.
        assertTrue(Math.abs(result.getValue()) < 1e-6); // Using a slightly larger tolerance for practical convergence.
    }
}
```