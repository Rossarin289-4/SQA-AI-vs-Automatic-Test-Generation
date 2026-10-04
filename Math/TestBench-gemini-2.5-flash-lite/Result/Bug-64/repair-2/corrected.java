package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.util.MathUtils;

public class LevenbergMarquardtOptimizerTest {

    // Mock implementation of a DifferentiableMultivariateVectorialFunction for testing
    private static class MockFunction implements DifferentiableMultivariateVectorialFunction {
        private final double[][] jacobian;
        private final double[] values;

        MockFunction(double[][] jacobian, double[] values) {
            this.jacobian = jacobian;
            this.values = values;
        }

        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            return values;
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            return jacobian;
        }
    }

    @Test
    public void testDefaultConstructor() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(1000, optimizer.getMaxIterations());
        // The 'checker' field is protected in AbstractLeastSquaresOptimizer, so it's accessible here.
        assertNull(optimizer.checker);
    }

    @Test
    public void testSetInitialStepBoundFactor() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(50.0);
        optimizer.setInitialStepBoundFactor(0.1);
        optimizer.setInitialStepBoundFactor(100.0);
        // No public getter for initialStepBoundFactor.
    }

    @Test
    public void testSetCostRelativeTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(1.0e-12);
        optimizer.setCostRelativeTolerance(0.0);
        optimizer.setCostRelativeTolerance(1.0);
        // No public getter for costRelativeTolerance.
    }

    @Test
    public void testSetParRelativeTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(1.0e-12);
        optimizer.setParRelativeTolerance(0.0);
        optimizer.setParRelativeTolerance(1.0);
        // No public getter for parRelativeTolerance.
    }

    @Test
    public void testSetOrthoTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(1.0e-12);
        optimizer.setOrthoTolerance(0.0);
        optimizer.setOrthoTolerance(1.0);
        // No public getter for orthoTolerance.
    }

    @Test
    public void testSetQRRankingThreshold() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setQRRankingThreshold(1.0e-15);
        optimizer.setQRRankingThreshold(0.0);
        optimizer.setQRRankingThreshold(MathUtils.SAFE_MIN);
        // No public getter for qrRankingThreshold.
    }

    private VectorialPointValuePair performOptimization(double[] startPoint, double[] target, double[][] jacobian) throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1000);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        MockFunction f = new MockFunction(jacobian, target);

        return optimizer.optimize(f, target, new double[target.length], startPoint);
    }

    @Test
    public void testSimpleLinearRegression() throws Exception {
        double[] target = {3.0, 5.0, 7.0};
        double[][] jacobian = {
            {-1.0, -1.0},
            {-2.0, -1.0},
            {-3.0, -1.0}
        };
        double[] startPoint = {0.0, 0.0}; // initial guess for a and b

        VectorialPointValuePair result = performOptimization(startPoint, target, jacobian);

        double[] optimizedPoint = result.getPoint();
        assertEquals(2.0, optimizedPoint[0], 1e-6); // Parameter 'a'
        assertEquals(1.0, optimizedPoint[1], 1e-6); // Parameter 'b'
    }

    @Test
    public void testOverdeterminedSystem() throws Exception {
        double[] target = {2.0, 3.0, 4.0, 6.0};
        double[][] jacobian = {
            {-1.0, -1.0},
            {-2.0, -1.0},
            {-3.0, -1.0},
            {-4.0, -1.0}
        };
        double[] startPoint = {0.0, 0.0}; // initial guess for a and b

        VectorialPointValuePair result = performOptimization(startPoint, target, jacobian);

        double[] optimizedPoint = result.getPoint();
        // Assert that parameters are different from the ideal {1.0, 1.0} due to noise/overdetermination.
        assertNotEquals(1.0, optimizedPoint[0], 1e-9);
        assertNotEquals(1.0, optimizedPoint[1], 1e-9);
        // The objective value is the cost (sqrt of sum of squares of residuals).
        // With {1,1} as parameters, residuals are {0,0,0,1}, sum of squares is 1, cost is 1.
        assertEquals(1.0, result.getValue()[0], 1e-6);
    }

    @Test
    public void testZeroJacobianColumn() throws Exception {
        double[] target = {5.0, 7.0, 9.0};
        double[][] jacobian = {
            {-2.0, -1.0},
            {-2.0, -1.0},
            {-2.0, -1.0}
        };
        double[] startPoint = {0.0, 0.0}; // initial guess for a and b

        VectorialPointValuePair result = performOptimization(startPoint, target, jacobian);

        double[] optimizedPoint = result.getPoint();
        // Expected parameters for y = ax + b, given (2,5), (2,7), (2,9):
        // The equation becomes 2a + b = 5, 2a + b = 7, 2a + b = 9. This is inconsistent.
        // However, if we assume the 'a' parameter is not well-determined due to identical x values,
        // and focus on 'b'. The average y is (5+7+9)/3 = 7.
        // If a=0, then b=7. The Jacobian's first column is effectively zero due to identical x.
        // If the optimizer handles it, 'b' should be close to the average y.
        assertEquals(7.0, optimizedPoint[1], 1e-6);
    }

    @Test
    public void testZeroJacobianRank() throws Exception {
        class ZeroJacobianMockFunction implements DifferentiableMultivariateVectorialFunction {
            private final double[][] jacobian = {{0.0, 0.0}, {0.0, 0.0}, {0.0, 0.0}};
            private final double[] values;

            ZeroJacobianMockFunction(double constantValue) {
                this.values = new double[]{constantValue, constantValue, constantValue};
            }

            @Override
            public double[] value(double[] point) {
                return values;
            }

            @Override
            public double[][] jacobian(double[] point) {
                return jacobian;
            }
        }

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setQRRankingThreshold(MathUtils.SAFE_MIN);
        double constantFuncValue = 10.0;
        double[] targetValues = {5.0, 7.0, 9.0};
        double[] initialPoint = {1.0, 1.0};

        VectorialPointValuePair result = optimizer.optimize(
            new ZeroJacobianMockFunction(constantFuncValue), targetValues, new double[targetValues.length], initialPoint);

        // Residuals: {5-10, 7-10, 9-10} = {-5, -3, -1}. Sum of squares: 25 + 9 + 1 = 35. Cost = sqrt(35).
        assertEquals(Math.sqrt(35.0), result.getValue()[0], 1e-6);

        // Since the jacobian is zero, the point should not change.
        double[] optimizedPoint = result.getPoint();
        assertArrayEquals(initialPoint, optimizedPoint, 1e-9);
    }

    @Test
    public void testOrthoToleranceBoundary() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(2.2204e-16); // Machine epsilon for double
        optimizer.setMaxIterations(1);

        double[] target = {1.0, 2.0};
        double[][] jacobian = {{1.0, 0.0}, {0.0, 1.0}};
        double[] startPoint = {0.0, 0.0};

        try {
            optimizer.optimize(new MockFunction(jacobian, target), target, new double[target.length], startPoint);
            fail("Expected OptimizationException");
        } catch (OptimizationException e) {
            // Check if the exception message indicates the tolerance.
            assertTrue(e.getMessage().contains("orthogonality tolerance"));
        }
    }

    @Test
    public void testCostRelativeToleranceBoundary() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(2.2204e-16); // Machine epsilon for double
        optimizer.setMaxIterations(1);

        double[] target = {0.0, 0.0};
        double[][] jacobian = {{1.0}, {1.0}};
        double[] startPoint = {0.0};

        try {
            optimizer.optimize(new MockFunction(jacobian, target), target, new double[target.length], startPoint);
            fail("Expected OptimizationException");
        } catch (OptimizationException e) {
            assertTrue(e.getMessage().contains("cost relative tolerance"));
        }
    }

    @Test
    public void testParRelativeToleranceBoundary() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(2.2204e-16); // Machine epsilon for double
        optimizer.setMaxIterations(1);

        double[] target = {0.0};
        double[][] jacobian = {{1.0}};
        double[] startPoint = {1e-20}; // Start very close to the solution.

        try {
            optimizer.optimize(new MockFunction(jacobian, target), target, new double[target.length], startPoint);
            fail("Expected OptimizationException");
        } catch (OptimizationException e) {
            assertTrue(e.getMessage().contains("parameters relative tolerance"));
        }
    }

    @Test
    public void testQRRankingThresholdBoundary() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setQRRankingThreshold(1.0e-10); // A relatively high threshold.

        double[] target = {1.0, 1.0};
        double[][] jacobian = {{1e-12, 0.0}, {0.0, 1e-12}}; // Small column norms
        double[] startPoint = {0.0, 0.0};

        // With a high threshold and small jacobian norms, rank deficiency is likely.
        // The behavior might be to return a result or throw an exception, depending on how it's handled.
        // We'll just ensure it runs without crashing and check if a result is produced.
        VectorialPointValuePair result = optimizer.optimize(new MockFunction(jacobian, target), target, new double[target.length], startPoint);
        assertNotNull(result);
    }

    @Test
    public void testMaxIterations() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1); // Force a low iteration count.

        double[] target = {1.0, 2.0, 3.0};
        double[][] jacobian = {{1.0, 0.0}, {0.0, 1.0}, {0.0, 0.0}};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(new MockFunction(jacobian, target), target, new double[target.length], startPoint);

        // The number of iterations should be 1.
        assertEquals(1, optimizer.getIterations());
    }

    @Test
    public void testLargeInitialStepBoundFactor() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(1.0e5);

        double[] target = {10.0, 20.0};
        double[][] jacobian = {{1.0, 1.0}, {1.0, 1.0}};
        double[] startPoint = {0.0, 0.0};

        VectorialPointValuePair result = performOptimization(startPoint, target, jacobian);

        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertNotNull(result.getValue());
    }

    @Test
    public void testSmallInitialStepBoundFactor() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(1e-5);

        double[] target = {10.0, 20.0};
        double[][] jacobian = {{1.0, 1.0}, {1.0, 1.0}};
        double[] startPoint = {1.0, 1.0};

        VectorialPointValuePair result = performOptimization(startPoint, target, jacobian);

        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertNotNull(result.getValue());
    }

    @Test
    public void testManyOverdeterminedPoints() throws Exception {
        double[] target = new double[100];
        double[][] jacobian = new double[100][2];
        double[] startPoint = {0.0, 0.0};

        // Create data for y = 2x + 1, with some noise.
        for (int i = 0; i < 100; i++) {
            double x = i + 1;
            target[i] = 2.0 * x + 1.0 + (Math.random() - 0.5) * 0.1;
            jacobian[i][0] = -x;
            jacobian[i][1] = -1.0;
        }

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(5000);
        optimizer.setCostRelativeTolerance(1e-12);
        optimizer.setParRelativeTolerance(1e-12);
        optimizer.setOrthoTolerance(1e-12);

        VectorialPointValuePair result = optimizer.optimize(
            new MockFunction(jacobian, target), target, new double[target.length], startPoint);

        double[] optimizedPoint = result.getPoint();
        assertEquals(2.0, optimizedPoint[0], 1e-3);
        assertEquals(1.0, optimizedPoint[1], 1e-3);
    }

    @Test
    public void testNonLinearFunction() throws Exception {
        double a = 2.0;
        double b = 0.5;
        double[] xValues = {1.0, 2.0, 3.0};
        double[] target = new double[xValues.length];
        double[][] jacobian = new double[xValues.length][2];

        for (int i = 0; i < xValues.length; i++) {
            double expVal = Math.exp(b * xValues[i]);
            target[i] = a * expVal;
            jacobian[i][0] = expVal;
            jacobian[i][1] = a * xValues[i] * expVal;
        }

        double[] startPoint = {1.0, 0.1};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(5000);
        optimizer.setCostRelativeTolerance(1e-12);
        optimizer.setParRelativeTolerance(1e-12);

        VectorialPointValuePair result = optimizer.optimize(
            new MockFunction(jacobian, target), target, new double[target.length], startPoint);

        double[] optimizedPoint = result.getPoint();
        assertEquals(a, optimizedPoint[0], 1e-6);
        assertEquals(b, optimizedPoint[1], 1e-6);
    }

    @Test
    public void testZeroTargetValues() throws Exception {
        double[] target = {0.0, 0.0, 0.0};
        double[][] jacobian = {{1.0, 1.0}, {2.0, 1.0}, {3.0, 1.0}};
        double[] startPoint = {1.0, 1.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);
        optimizer.setCostRelativeTolerance(1e-15);
        optimizer.setParRelativeTolerance(1e-15);

        VectorialPointValuePair result = optimizer.optimize(
            new MockFunction(jacobian, target), target, new double[target.length], startPoint);

        double[] optimizedPoint = result.getPoint();
        assertEquals(0.0, optimizedPoint[0], 1e-10);
        assertEquals(0.0, optimizedPoint[1], 1e-10);
        assertEquals(0.0, result.getValue()[0], 1e-10);
    }

    @Test
    public void testEarlyConvergence() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(10000);

        double[] target = {3.0, 5.0, 7.0};
        double[][] jacobian = {
            {-1.0, -1.0},
            {-2.0, -1.0},
            {-3.0, -1.0}
        };
        double[] startPoint = {2.0, 1.0}; // Start at the exact solution.

        VectorialPointValuePair result = optimizer.optimize(
            new MockFunction(jacobian, target), target, new double[target.length], startPoint);

        assertTrue(optimizer.getIterations() < 5);
        assertEquals(2.0, result.getPoint()[0], 1e-10);
        assertEquals(1.0, result.getPoint()[1], 1e-10);
        assertEquals(0.0, result.getValue()[0], 1e-10);
    }

    @Test
    public void testConstantFunction() throws Exception {
        class ConstantFunction implements DifferentiableMultivariateVectorialFunction {
            private final double constantValue;
            private final double[][] jacobian;

            ConstantFunction(double value, int cols) {
                this.constantValue = value;
                this.jacobian = new double[1][cols];
                Arrays.fill(this.jacobian[0], 0.0);
            }

            @Override
            public double[] value(double[] point) {
                return new double[]{constantValue};
            }

            @Override
            public double[][] jacobian(double[] point) {
                return jacobian;
            }
        }

        double[] target = {5.0};
        double[] startPoint = {1.0};
        ConstantFunction f = new ConstantFunction(10.0, 1);

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);

        VectorialPointValuePair result = optimizer.optimize(f, target, new double[target.length], startPoint);

        assertEquals(5.0, result.getValue()[0], 1e-10);
        assertArrayEquals(startPoint, result.getPoint(), 1e-10);
    }

    @Test
    public void testAllParametersZero() throws Exception {
        double[] target = {0.0, 0.0, 0.0};
        double[][] jacobian = {
            {1.0, 0.0},
            {0.0, 1.0},
            {1.0, 1.0}
        };
        double[] startPoint = {1.0, 1.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);
        optimizer.setCostRelativeTolerance(1e-15);
        optimizer.setParRelativeTolerance(1e-15);

        VectorialPointValuePair result = optimizer.optimize(
            new MockFunction(jacobian, target), target, new double[target.length], startPoint);

        double[] optimizedPoint = result.getPoint();
        assertEquals(0.0, optimizedPoint[0], 1e-10);
        assertEquals(0.0, optimizedPoint[1], 1e-10);
        assertEquals(0.0, result.getValue()[0], 1e-10);
    }
}
