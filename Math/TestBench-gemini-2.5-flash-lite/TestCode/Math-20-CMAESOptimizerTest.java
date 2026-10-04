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
    public void testFitnessFunctionSetValueRange() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        // FitnessFunction is private, so cannot instantiate directly.
        // setValueRange is called internally by CMAESOptimizer.
        // We test its effect by observing the behavior of `value` within `doOptimize`,
        // but direct testing here is not possible.
    }



}



