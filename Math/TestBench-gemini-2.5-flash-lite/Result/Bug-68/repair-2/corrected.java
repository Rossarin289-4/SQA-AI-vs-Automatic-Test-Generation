package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialFunction;

public class LevenbergMarquardtOptimizerTest {

    @Test
    public void testDefaultConstructor() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(1000, optimizer.getMaxIterations());
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetInitialStepBoundFactor() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(200.0);
        // Private field, cannot assert directly.
    }

    @Test
    public void testSetCostRelativeTolerance() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(1.0e-12);
        // Private field, cannot assert directly.
    }

    @Test
    public void testSetParRelativeTolerance() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(1.0e-12);
        // Private field, cannot assert directly.
    }

    @Test
    public void testSetOrthoTolerance() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(1.0e-12);
        // Private field, cannot assert directly.
    }

    @Test
    public void testSetMaxIterations() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(500);
        assertEquals(500, optimizer.getMaxIterations());
    }

    // Mock function for testing optimization
    private static class MockVectorialDifferentiableFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            if (point.length < 2) {
                throw new IllegalArgumentException("Point must have at least 2 dimensions for this mock function.");
            }
            return new double[]{point[0] * point[0] + point[1] * point[1]};
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            if (point.length < 2) {
                throw new IllegalArgumentException("Point must have at least 2 dimensions for this mock function.");
            }
            return new double[][]{{2 * point[0], 2 * point[1]}};
        }
    }

    @Test
    public void testOptimizeSimpleParabola() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {1.0, 1.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(0.0, finalPoint[0], 1e-10);
        assertEquals(0.0, finalPoint[1], 1e-10);
    }

    // Another mock function for testing more complex scenarios
    private static class MockQuadraticFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            return new double[]{
                point[0] * point[0] + point[1] * point[1] - 1.0,
                point[0] + point[1] - 1.0
            };
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            return new double[][]{
                {2 * point[0], 2 * point[1]},
                {1.0, 1.0}
            };
        }
    }

    @Test
    public void testOptimizeQuadratic() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1000);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockQuadraticFunction();
        double[] target = {0.0, 0.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.5, 0.5}; // Point on the line x+y=1

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(0.5, finalPoint[0], 1e-10);
        assertEquals(0.5, finalPoint[1], 1e-10);
    }

    // Test with a function that might lead to rank deficiency
    private static class MockRankDeficientFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            // Overdetermined system with dependent equations
            return new double[]{
                point[0] + point[1] - 2.0,
                point[0] - point[1],
                2 * point[0] + 2 * point[1] - 4.0 // Dependent on the first equation
            };
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            return new double[][]{
                {1.0, 1.0},
                {1.0, -1.0},
                {2.0, 2.0} // Dependent on the first row
            };
        }
    }

    @Test
    public void testOptimizeRankDeficient() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1000);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockRankDeficientFunction();
        double[] target = {0.0, 0.0, 0.0};
        double[] weights = {1.0, 1.0, 1.0};
        double[] startPoint = {1.0, 1.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(1.0, finalPoint[0], 1e-10);
        assertEquals(1.0, finalPoint[1], 1e-10);
    }

    @Test
    public void testOptimizeQuadraticDifferentStartPoint() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1000);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockQuadraticFunction();
        double[] target = {0.0, 0.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {2.0, -1.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(0.5, finalPoint[0], 1e-10);
        assertEquals(0.5, finalPoint[1], 1e-10);
    }
    
    @Test
    public void testOptimizeSimpleParabolaDifferentStartPoint() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {-2.0, 3.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(0.0, finalPoint[0], 1e-10);
        assertEquals(0.0, finalPoint[1], 1e-10);
    }

    // Mock function for testing a case where convergence might be slow
    private static class MockSlowConvergenceFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            return new double[]{point[0] - 1.0};
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            return new double[][]{{0.1}};
        }
    }

    @Test
    public void testOptimizeSlowConvergence() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1000);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockSlowConvergenceFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {5.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(1.0, finalPoint[0], 1e-10);
    }
    
    @Test
    public void testOptimizeLargeStepRequired() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1000);
        optimizer.setInitialStepBoundFactor(1000.0);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {10.0, 10.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(0.0, finalPoint[0], 1e-10);
        assertEquals(0.0, finalPoint[1], 1e-10);
    }

    @Test
    public void testConvergenceCheckerNull() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setConvergenceChecker(null);
        assertTrue(optimizer.getConvergenceChecker() == null);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {1.0, 1.0};

        optimizer.optimize(f, target, weights, startPoint);
    }

    @Test
    public void testVerySmallTolerances() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(2000);
        optimizer.setCostRelativeTolerance(1e-15);
        optimizer.setParRelativeTolerance(1e-15);
        optimizer.setOrthoTolerance(1e-15);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {1.0, 1.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(0.0, finalPoint[0], 1e-10);
        assertEquals(0.0, finalPoint[1], 1e-10);
    }
    
    @Test
    public void testVeryLargeTolerances() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);
        optimizer.setCostRelativeTolerance(1.0);
        optimizer.setParRelativeTolerance(1.0);
        optimizer.setOrthoTolerance(1.0);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {1.0, 1.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertTrue(Math.abs(finalPoint[0]) < 0.1); 
        assertTrue(Math.abs(finalPoint[1]) < 0.1);
    }

    // Test for a scenario that might cause an exception due to function evaluation
    private static class MockBadFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            if (point.length == 0 || point[0] < 0) { // Added check for empty point
                throw new FunctionEvaluationException(point, "Input cannot be negative");
            }
            return new double[]{Math.sqrt(point[0])};
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            if (point.length == 0 || point[0] < 0) { // Added check for empty point
                throw new FunctionEvaluationException(point, "Input cannot be negative");
            }
            if (point[0] == 0) {
                 return new double[][]{{Double.POSITIVE_INFINITY}};
            }
            return new double[][]{{0.5 / Math.sqrt(point[0])}};
        }
    }

    @Test
    public void testOptimizeWithBadInput() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockBadFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {-1.0};

        try {
            optimizer.optimize(f, target, weights, startPoint);
            fail("Expected FunctionEvaluationException");
        } catch (FunctionEvaluationException expected) {
            // Expected exception
        }
    }
    
    @Test
    public void testOptimizeSimpleParabolaZeroStart() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {0.0, 0.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(0.0, finalPoint[0], 1e-10);
        assertEquals(0.0, finalPoint[1], 1e-10);
    }

    // Test case with only one parameter
    private static class MockSingleParamFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            return new double[]{point[0] * point[0] - 4.0};
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            return new double[][]{{2 * point[0]}};
        }
    }

    @Test
    public void testOptimizeSingleParameter() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockSingleParamFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {3.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(2.0, finalPoint[0], 1e-10);
    }
    
    // Test with a function that has a flat region
    private static class MockFlatRegionFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            if (point.length == 0) { // Added check for empty point
                throw new FunctionEvaluationException(point, "Point cannot be empty.");
            }
            if (Math.abs(point[0]) < 0.1) {
                return new double[]{0.0};
            }
            return new double[]{point[0] * point[0] - 0.01};
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
             if (point.length == 0) { // Added check for empty point
                throw new FunctionEvaluationException(point, "Point cannot be empty.");
            }
            if (Math.abs(point[0]) < 0.1) {
                return new double[][]{{0.0}};
            }
            return new double[][]{{2 * point[0]}};
        }
    }

    @Test
    public void testOptimizeFlatRegion() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1000);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockFlatRegionFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {2.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertTrue(Math.abs(finalPoint[0]) < 0.1); 
    }

    @Test
    public void testNegativeInitialStepBoundFactor() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(-100.0);
    }

    @Test
    public void testZeroCostRelativeTolerance() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(0.0);
    }
    
    @Test
    public void testZeroParRelativeTolerance() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(0.0);
    }

    @Test
    public void testZeroOrthoTolerance() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(0.0);
    }

    // Test a function that has its minimum far away and requires many steps
    private static class MockFarMinimumFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            return new double[]{point[0] - 1000.0};
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            return new double[][]{{1.0}};
        }
    }

    @Test
    public void testOptimizeFarMinimum() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(5000);
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockFarMinimumFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {0.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(1000.0, finalPoint[0], 1e-10);
    }
}
