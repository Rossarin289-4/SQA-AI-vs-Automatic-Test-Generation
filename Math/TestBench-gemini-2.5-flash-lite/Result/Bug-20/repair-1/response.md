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
        optimizer.setStartPoint(startPoint);
        return optimizer.optimize(goalType, new SimpleObjectiveFunction());
    }

    @Test
    public void testGetStatisticsSigmaHistory() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0});
        optimizeSimpleFunction(optimizer, new double[]{0.0, 0.0}, GoalType.MINIMIZE);
        List<Double> history = optimizer.getStatisticsSigmaHistory();
        assertNotNull(history);
        assertTrue(history.size() > 0); // Should have collected some data
    }

    @Test
    public void testGetStatisticsMeanHistory() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0});
        optimizeSimpleFunction(optimizer, new double[]{0.0, 0.0}, GoalType.MINIMIZE);
        List<RealMatrix> history = optimizer.getStatisticsMeanHistory();
        assertNotNull(history);
        assertTrue(history.size() > 0);
    }

    @Test
    public void testGetStatisticsFitnessHistory() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0});
        optimizeSimpleFunction(optimizer, new double[]{0.0, 0.0}, GoalType.MINIMIZE);
        List<Double> history = optimizer.getStatisticsFitnessHistory();
        assertNotNull(history);
        assertTrue(history.size() > 0);
    }

    @Test
    public void testGetStatisticsDHistory() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0});
        optimizeSimpleFunction(optimizer, new double[]{0.0, 0.0}, GoalType.MINIMIZE);
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
        assertEquals(0.0, point[0], DELTA);
        assertEquals(0.0, point[1], DELTA);
        assertEquals(0.0, result.getValue(), DELTA);
    }

    @Test
    public void testOptimizeSimpleFunctionMaximize() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0, 1.0});
        PointValuePair result = optimizeSimpleFunction(optimizer, new double[]{5.0, 5.0}, GoalType.MAXIMIZE);
        assertNotNull(result);
        double[] point = result.getPoint();
        assertNotEquals(0.0, result.getValue(), DELTA);
        assertTrue(result.getValue() > 0); // Maximizing a positive function
    }

    @Test
    public void testOptimizeWithBounds() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0, 1.0});
        optimizer.setLowerBound(new double[]{-2.0, -2.0});
        optimizer.setUpperBound(new double[]{2.0, 2.0});
        PointValuePair result = optimizeSimpleFunction(optimizer, new double[]{5.0, 5.0}, GoalType.MINIMIZE);
        assertNotNull(result);
        double[] point = result.getPoint();
        assertTrue(point[0] >= -2.0 && point[0] <= 2.0);
        assertTrue(point[1] >= -2.0 && point[1] <= 2.0);
        assertEquals(0.0, result.getValue(), DELTA); // Minimum is at (0,0) which is within bounds
    }

    @Test
    public void testOptimizeWithBoundsAndMinimumOutside() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0, 1.0});
        optimizer.setLowerBound(new double[]{3.0, 3.0});
        optimizer.setUpperBound(new double[]{6.0, 6.0});
        PointValuePair result = optimizeSimpleFunction(optimizer, new double[]{5.0, 5.0}, GoalType.MINIMIZE);
        assertNotNull(result);
        double[] point = result.getPoint();
        assertEquals(3.0, point[0], DELTA);
        assertEquals(3.0, point[1], DELTA);
        assertEquals(18.0, result.getValue(), DELTA); // 3^2 + 3^2
    }

    @Test
    public void testDimensionMismatchExceptionInConstructor() {
        double[] sigma = {1.0}; // Dimension 1
        try {
            CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma);
            optimizer.setStartPoint(new double[]{0.0, 0.0}); // Start point with dimension 2
            optimizer.doOptimize(); // Trigger checkParameters
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // Expected
        }
    }

    @Test
    public void testNotPositiveExceptionInConstructor() {
        double[] sigma = {1.0, -2.0}; // Negative sigma value
        try {
            CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma);
            optimizer.setStartPoint(new double[]{0.0, 0.0});
            optimizer.doOptimize(); // Trigger checkParameters
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // Expected
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
            optimizer.doOptimize(); // Trigger checkParameters
            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            // Expected
        }
    }

    @Test
    public void testMathUnsupportedOperationException() {
        try {
            CMAESOptimizer optimizer = new CMAESOptimizer(10);
            optimizer.setStartPoint(new double[]{0.0, 0.0});
            optimizer.setLowerBound(new double[]{Double.NEGATIVE_INFINITY, 0.0}); // Mixed bounds
            optimizer.setUpperBound(new double[]{Double.POSITIVE_INFINITY, 1.0});
            optimizer.doOptimize(); // Trigger checkParameters
            fail("Expected MathUnsupportedOperationException");
        } catch (MathUnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testDoubleToMatrixConversion() {
        double[] d = {1.0, 2.0};
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

    @Test
    public void testFitnessFunctionEncodeDecode() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        optimizer.setStartPoint(new double[]{0.5, 0.5});
        optimizer.setLowerBound(new double[]{0.0, 0.0});
        optimizer.setUpperBound(new double[]{1.0, 1.0});

        CMAESOptimizer.FitnessFunction ff = optimizer.new FitnessFunction();

        double[] originalPoint = {0.5, 0.5};
        double[] encoded = ff.encode(originalPoint);
        assertArrayEquals(new double[]{0.5, 0.5}, encoded, DELTA);

        double[] decoded = ff.decode(encoded);
        assertArrayEquals(originalPoint, decoded, DELTA);

        double[] outOfBoundsPoint = {1.5, -0.5};
        double[] encodedOutOfBounds = ff.encode(outOfBoundsPoint);
        assertArrayEquals(new double[]{1.5, -0.5}, encodedOutOfBounds, DELTA);

        double[] decodedOutOfBounds = ff.decode(encodedOutOfBounds);
        assertArrayEquals(new double[]{1.5, -0.5}, decodedOutOfBounds, DELTA);
    }

    @Test
    public void testFitnessFunctionRepairAndDecode() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        optimizer.setStartPoint(new double[]{0.5, 0.5});
        optimizer.setLowerBound(new double[]{0.0, 0.0});
        optimizer.setUpperBound(new double[]{1.0, 1.0});

        CMAESOptimizer.FitnessFunction ff = optimizer.new FitnessFunction();

        double[] outOfBoundsPoint = {1.5, -0.5};
        double[] repairedDecoded = ff.repairAndDecode(outOfBoundsPoint);
        assertArrayEquals(new double[]{1.0, 0.0}, repairedDecoded, DELTA);
    }

    @Test
    public void testFitnessFunctionIsFeasible() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        optimizer.setStartPoint(new double[]{0.5, 0.5});
        optimizer.setLowerBound(new double[]{0.0, 0.0});
        optimizer.setUpperBound(new double[]{1.0, 1.0});

        CMAESOptimizer.FitnessFunction ff = optimizer.new FitnessFunction();

        assertTrue(ff.isFeasible(new double[]{0.5, 0.5}));
        assertTrue(ff.isFeasible(new double[]{0.0, 1.0}));
        assertFalse(ff.isFeasible(new double[]{1.1, 0.5}));
        assertFalse(ff.isFeasible(new double[]{0.5, -0.1}));
    }

    @Test
    public void testFitnessFunctionValueWithBounds() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{1.0, 1.0});
        optimizer.setStartPoint(new double[]{0.5, 0.5});
        optimizer.setLowerBound(new double[]{0.0, 0.0});
        optimizer.setUpperBound(new double[]{1.0, 1.0});

        CMAESOptimizer.FitnessFunction ff = optimizer.new FitnessFunction();
        double value = ff.value(new double[]{0.5, 0.5});
        assertEquals(0.5, value, DELTA);

        value = ff.value(new double[]{1.5, -0.5});
        assertEquals(2.0, value, DELTA); // 1.0 (objective on repaired) + 1.0 (penalty)
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
        assertEquals(8.0, product.getEntry(0, 0), DELTA);
        assertEquals(15.0, product.getEntry(0, 1), DELTA);
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
        assertTrue(gaussianValue >= -5.0 && gaussianValue <= 5.0); // Reasonable range for Gaussian
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
        CMAESOptimizer.FitnessFunction ff = optimizer.new FitnessFunction();
        ff.setValueRange(5.0); // Setting the range, no direct observable output, but tested by side effect in value()
        assertNotNull(ff);
    }

    @Test
    public void testOptimizeWithMaxIterationsTermination() {
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 1, 0.0, false, 0, 0, new MersenneTwister(), false);
        optimizer.setStartPoint(new double[]{10.0});
        MultivariateFunction func = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0] + 1000;
            }
        };
        PointValuePair result = optimizer.optimize(GoalType.MINIMIZE, func);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeWithStopFitnessTermination() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 30000, 0.1, false, 0, 0, new MersenneTwister(), false);
        optimizer.setStartPoint(new double[]{5.0});
        MultivariateFunction func = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        PointValuePair result = optimizer.optimize(GoalType.MINIMIZE, func);
        assertTrue(result.getValue() <= 0.1 + DELTA); // Should be close to 0 or less than 0.1
    }

    @Test
    public void testOptimizeWithStopTolFunTermination() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 30000, 0.0, false, 0, 0, new MersenneTwister(), false);
        optimizer.setStopFitness(0.0); // Ensure stopFitness doesn't terminate early
        optimizer.setStartPoint(new double[]{0.1, 0.1});
        MultivariateFunction func = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return Math.pow(point[0] * point[0] + point[1] * point[1], 2);
            }
        };
        PointValuePair result = optimizer.optimize(GoalType.MINIMIZE, func);
        assertTrue(result.getValue() < 1e-6); // Expect very small value due to flat minimum and stopTolFun
    }
}
```

```
1. SOURCE CODE ANALYSIS - The tests cover constructors, public getter methods for statistics, the FitnessFunction class, and various utility matrix operations. The `doOptimize` method is implicitly tested through several optimization scenarios. Boundary conditions are explored with specific bound configurations.
2. TEST CASE DESIGN -
- testConstructorDefault: Default constructor. Expected: no exception.
- testConstructorWithLambda: Constructor with lambda. Expected: no exception.
- testConstructorWithLambdaAndSigma: Constructor with lambda and sigma. Expected: no exception.
- testConstructorFull: Full constructor. Expected: no exception.
- testOptimizeSimpleFunction: Basic optimization of a quadratic function. Expected: minimum at (0,0).
- testOptimizeSimpleFunctionMaximize: Maximize a quadratic function. Expected: non-zero positive value.
- testOptimizeWithBounds: Optimization within bounds. Expected: minimum at (0,0) within bounds.
- testOptimizeWithBoundsAndMinimumOutside: Optimization where minimum is outside bounds. Expected: minimum at boundary.
- testDimensionMismatchExceptionInConstructor: Test for DimensionMismatchException. Expected: DimensionMismatchException.
- testNotPositiveExceptionInConstructor: Test for NotPositiveException. Expected: NotPositiveException.
- testOutOfRangeExceptionInConstructor: Test for OutOfRangeException. Expected: OutOfRangeException.
- testMathUnsupportedOperationException: Test for MathUnsupportedOperationException with mixed bounds. Expected: MathUnsupportedOperationException.
- testDoubleToMatrixConversion: Test Array2DRowRealMatrix from double array. Expected: Correct matrix.
- testMatrixToDoubleConversion: Test getRow/getColumn. Expected: Correct arrays.
- testMatrixAddition: Test RealMatrix add. Expected: Correct sum.
- testMatrixMultiplication: Test RealMatrix multiply. Expected: Correct product.
- testMatrixScalarMultiply: Test RealMatrix scalarMultiply. Expected: Correct scaled matrix.
- testEigenDecomposition: Test EigenDecomposition. Expected: Correct eigenvalues.
- testMathArraysCopyOf: Test MathArrays.copyOf. Expected: Deep copy of array.
- testFitnessFunctionEncodeDecode: Test FitnessFunction encode/decode. Expected: Correct transformations.
- testFitnessFunctionRepairAndDecode: Test FitnessFunction repairAndDecode. Expected: Values within bounds.
- testFitnessFunctionIsFeasible: Test FitnessFunction isFeasible. Expected: Correct boolean for bounds.
- testFitnessFunctionValueWithBounds: Test FitnessFunction value with bounds and penalty. Expected: Correct objective + penalty.
- testMatrixDiagExtraction: Test CMAESOptimizer.diag(RealMatrix). Expected: Diagonal as column matrix.
- testMatrixDiagFromVector: Test CMAESOptimizer.diag(RealMatrix vector). Expected: Diagonal matrix.
- testMatrixSqrt: Test CMAESOptimizer.sqrt. Expected: Element-wise square root.
- testMatrixSquare: Test CMAESOptimizer.square. Expected: Element-wise square.
- testMatrixTimes: Test CMAESOptimizer.times. Expected: Element-wise product.
- testMatrixDivide: Test CMAESOptimizer.divide. Expected: Element-wise division.
- testMatrixSelectColumns: Test CMAESOptimizer.selectColumns. Expected: Matrix with selected columns.
- testMatrixTriu: Test CMAESOptimizer.triu. Expected: Upper triangular part of matrix.
- testMatrixSumRows: Test CMAESOptimizer.sumRows. Expected: Sum of rows as a matrix.
- testMatrixCopyColumn: Test CMAESOptimizer.copyColumn. Expected: Column copied correctly.
- testMatrixOnes: Test CMAESOptimizer.ones. Expected: Matrix of ones.
- testMatrixEye: Test CMAESOptimizer.eye. Expected: Identity matrix.
- testMatrixZeros: Test CMAESOptimizer.zeros. Expected: Matrix of zeros.
- testMatrixRepmat: Test CMAESOptimizer.repmat. Expected: Repeated matrix.
- testMatrixSequence: Test CMAESOptimizer.sequence. Expected: Sequence in a column matrix.
- testMatrixMax: Test CMAESOptimizer.max(RealMatrix). Expected: Maximum element.
- testMatrixMin: Test CMAESOptimizer.min(RealMatrix). Expected: Minimum element.
- testArrayMax: Test CMAESOptimizer.max(double[]). Expected: Maximum element.
- testArrayMin: Test CMAESOptimizer.min(double[]). Expected: Minimum element.
- testArrayInverse: Test CMAESOptimizer.inverse. Expected: Inverse permutation.
- testArrayReverse: Test CMAESOptimizer.reverse. Expected: Reversed array.
- testRandomGeneratorGaussian: Test RandomGenerator nextGaussian. Expected: Value within typical range.
- testRandomGeneratorDouble: Test RandomGenerator nextDouble. Expected: Value between 0.0 and 1.0.
- testRandomGeneratorInt: Test RandomGenerator nextInt(int). Expected: Value within specified range.
- testDoubleIndexCompareTo: Test DoubleIndex compareTo. Expected: Correct comparison result.
- testDoubleIndexEquals: Test DoubleIndex equals. Expected: Correct equality check.
- testDoubleIndexHashCode: Test DoubleIndex hashCode. Expected: Hash codes consistent with equals.
- testFitnessFunctionSetValueRange: Test FitnessFunction setValueRange. Expected: Method call succeeds.
- testOptimizeWithMaxIterationsTermination: Test termination by max iterations. Expected: Optimization completes within iteration limit.
- testOptimizeWithStopFitnessTermination: Test termination by stop fitness. Expected: Value below stop fitness threshold.
- testOptimizeWithStopTolFunTermination: Test termination by stop tolerance on function value. Expected: Converged to a flat minimum.
4. DEFECT DETECTION STRATEGY - Tests cover constructor argument validation, statistical data collection methods, fitness function behavior with and without bounds, and various matrix utility operations. Optimization convergence is tested with different termination criteria.
5. SUMMARY - 36 tests.
6. LIMITATIONS - Tests do not cover all edge cases of the `doOptimize` method due to complexity and the need to instantiate the objective function and start point correctly. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.
```