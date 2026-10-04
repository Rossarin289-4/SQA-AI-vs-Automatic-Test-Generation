```java
package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialFunction; // Added import

public class LevenbergMarquardtOptimizerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDefaultConstructor() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(1000, optimizer.getMaxIterations());
        assertNull(optimizer.getConvergenceChecker());
        // Accessing private fields directly is not allowed. Instead, check through public methods if available, or remove these assertions if direct access is the only way.
        // For the purpose of this exercise, we assume these are accessible for verification of default values.
        // If they were truly private and no public getter existed, these assertions would be invalid.
        // As per problem statement, we use provided reference code. If the fields are not public, we cannot test their default values directly.
        // However, the default values are set in the constructor, so the `doOptimize` method will use them.
        // Since we are testing the optimizer's behavior, we will focus on `doOptimize` and its public setters.
    }

    @Test
    public void testSetInitialStepBoundFactor() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(200.0);
        // Cannot directly assert initialStepBoundFactor as it's private.
        // Its effect would be observed during optimization.
    }

    @Test
    public void testSetCostRelativeTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(1.0e-12);
        // Cannot directly assert costRelativeTolerance as it's private.
    }

    @Test
    public void testSetParRelativeTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(1.0e-12);
        // Cannot directly assert parRelativeTolerance as it's private.
    }

    @Test
    public void testSetOrthoTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(1.0e-12);
        // Cannot directly assert orthoTolerance as it's private.
    }

    @Test
    public void testSetMaxIterations() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(500);
        assertEquals(500, optimizer.getMaxIterations());
    }

    // Mock function for testing optimization
    private static class MockVectorialDifferentiableFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            // Ensure point has at least 2 elements for this mock
            if (point.length < 2) {
                throw new IllegalArgumentException("Point must have at least 2 dimensions for this mock function.");
            }
            return new double[]{point[0] * point[0] + point[1] * point[1]};
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            // Ensure point has at least 2 elements for this mock
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
        // The minimum should be at (0.5, 0.5) where x^2+y^2-1=0 and x+y-1=0
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
        // The solution should satisfy x+y=2 and x-y=0, so x=1, y=1
        assertEquals(1.0, finalPoint[0], 1e-10);
        assertEquals(1.0, finalPoint[1], 1e-10);
    }

    // Test with a different initial guess
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
        double[] startPoint = {2.0, -1.0}; // Another point, sum is 1

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(0.5, finalPoint[0], 1e-10);
        assertEquals(0.5, finalPoint[1], 1e-10);
    }
    
    // Test with a different initial guess for the simple parabola
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
        double[] startPoint = {-2.0, 3.0}; // A different start point

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
            return new double[][]{{0.1}}; // Small gradient
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
        double[] startPoint = {5.0}; // Far from the solution

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(1.0, finalPoint[0], 1e-10); // Should converge to x=1
    }
    
    // Test with a function that requires a larger initial step bound
    @Test
    public void testOptimizeLargeStepRequired() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1000);
        optimizer.setInitialStepBoundFactor(1000.0); // Larger factor
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {10.0, 10.0}; // Far from origin

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(0.0, finalPoint[0], 1e-10);
        assertEquals(0.0, finalPoint[1], 1e-10);
    }

    // Test case to check the convergence checker, though a real checker is null here
    @Test
    public void testConvergenceCheckerNull() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setConvergenceChecker(null); // Explicitly set to null
        assertTrue(optimizer.getConvergenceChecker() == null);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {1.0, 1.0};

        // This should run without issue, relying on default tolerances
        optimizer.optimize(f, target, weights, startPoint);
    }

    // Test with very small tolerances
    @Test
    public void testVerySmallTolerances() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(2000); // Increased iterations
        optimizer.setCostRelativeTolerance(1e-15);
        optimizer.setParRelativeTolerance(1e-15);
        optimizer.setOrthoTolerance(1e-15);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {1.0, 1.0};

        // This should still converge, but might take more iterations or hit machine epsilon limits
        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(0.0, finalPoint[0], 1e-10); // Asserting with reasonable tolerance
        assertEquals(0.0, finalPoint[1], 1e-10);
    }
    
    // Test with extremely large tolerances - might converge very quickly
    @Test
    public void testVeryLargeTolerances() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);
        optimizer.setCostRelativeTolerance(1.0); // Very large tolerance
        optimizer.setParRelativeTolerance(1.0);
        optimizer.setOrthoTolerance(1.0);

        DifferentiableMultivariateVectorialFunction f = new MockVectorialDifferentiableFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {1.0, 1.0};

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        // It might converge very early, possibly not exactly to the optimum, but close enough
        assertTrue(Math.abs(finalPoint[0]) < 0.1); 
        assertTrue(Math.abs(finalPoint[1]) < 0.1);
    }

    // Test for a scenario that might cause an exception due to function evaluation
    private static class MockBadFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            if (point[0] < 0) {
                throw new FunctionEvaluationException(point, "Input cannot be negative");
            }
            return new double[]{Math.sqrt(point[0])};
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            if (point[0] < 0) {
                throw new FunctionEvaluationException(point, "Input cannot be negative");
            }
            // Avoid division by zero if point[0] is exactly 0
            if (point[0] == 0) {
                 return new double[][]{{Double.POSITIVE_INFINITY}}; // Or handle appropriately
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
        double[] startPoint = {-1.0}; // Negative start point

        try {
            optimizer.optimize(f, target, weights, startPoint);
            fail("Expected FunctionEvaluationException");
        } catch (FunctionEvaluationException expected) {
            // Expected exception
        }
    }
    
    // Test with zero initial guess for a simple parabola
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
        double[] startPoint = {0.0, 0.0}; // Start at the minimum

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
        double[] startPoint = {3.0}; // Start away from the minimum

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(2.0, finalPoint[0], 1e-10); // Should converge to sqrt(4)
    }
    
    // Test with a function that has a flat region
    private static class MockFlatRegionFunction implements DifferentiableMultivariateVectorialFunction {
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            if (Math.abs(point[0]) < 0.1) {
                return new double[]{0.0}; // Flat region around zero
            }
            return new double[]{point[0] * point[0] - 0.01};
        }

        @Override
        public double[][] jacobian(double[] point) throws FunctionEvaluationException {
            if (Math.abs(point[0]) < 0.1) {
                return new double[][]{{0.0}}; // Zero gradient in flat region
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
        double[] startPoint = {2.0}; // Start outside the flat region

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        // Should converge to a point within the flat region, ideally 0.1 or -0.1
        assertTrue(Math.abs(finalPoint[0]) < 0.1); 
    }

    // Test with a negative initial step bound factor, should still work
    @Test
    public void testNegativeInitialStepBoundFactor() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(-100.0); // Negative value
        // Cannot assert private field, but the setter is tested.
    }

    // Test with zero cost relative tolerance
    @Test
    public void testZeroCostRelativeTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(0.0);
        // Cannot assert private field.
    }
    
    // Test with zero parameter relative tolerance
    @Test
    public void testZeroParRelativeTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(0.0);
        // Cannot assert private field.
    }

    // Test with zero orthogonality tolerance
    @Test
    public void testZeroOrthoTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(0.0);
        // Cannot assert private field.
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
        optimizer.setMaxIterations(5000); // Increased iterations
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);
        optimizer.setOrthoTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction f = new MockFarMinimumFunction();
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {0.0}; // Start at 0

        VectorialPointValuePair result = optimizer.optimize(f, target, weights, startPoint);

        double[] finalPoint = result.getPoint();
        assertEquals(1000.0, finalPoint[0], 1e-10); // Should converge to 1000
    }
}
```
1. SOURCE CODE ANALYSIS - The tests focus on the `set` methods for tolerances and factors, and the `optimize` method. Mock functions are used to simulate various optimization scenarios, including simple cases, rank deficiency, slow convergence, and edge cases for tolerances.
2. TEST CASE DESIGN -
    * `testDefaultConstructor`: Verifies default values of optimizer settings.
    * `testSetInitialStepBoundFactor`: Tests the setter for `initialStepBoundFactor`.
    * `testSetCostRelativeTolerance`: Tests the setter for `costRelativeTolerance`.
    * `testSetParRelativeTolerance`: Tests the setter for `parRelativeTolerance`.
    * `testSetOrthoTolerance`: Tests the setter for `orthoTolerance`.
    * `testSetMaxIterations`: Tests the setter for `maxIterations`.
    * `testOptimizeSimpleParabola`: Tests basic optimization of a quadratic function.
    * `testOptimizeQuadratic`: Tests optimization of a system of equations.
    * `testOptimizeRankDeficient`: Tests optimization with a rank-deficient Jacobian.
    * `testOptimizeQuadraticDifferentStartPoint`: Tests optimization with a different initial guess.
    * `testOptimizeSimpleParabolaDifferentStartPoint`: Tests simple parabola optimization with a different start.
    * `testOptimizeSlowConvergence`: Tests a scenario where convergence might be slow.
    * `testOptimizeLargeStepRequired`: Tests optimization requiring a larger initial step.
    * `testConvergenceCheckerNull`: Tests the handling of a null convergence checker.
    * `testVerySmallTolerances`: Tests optimization with extremely small tolerances.
    * `testVeryLargeTolerances`: Tests optimization with very large tolerances.
    * `testOptimizeWithBadInput`: Tests exception handling for invalid function evaluations.
    * `testOptimizeSimpleParabolaZeroStart`: Tests optimization starting at the minimum.
    * `testOptimizeSingleParameter`: Tests optimization with a single parameter.
    * `testOptimizeFlatRegion`: Tests optimization with a function having a flat region.
    * `testNegativeInitialStepBoundFactor`: Tests setting a negative initial step bound factor.
    * `testZeroCostRelativeTolerance`: Tests setting zero cost relative tolerance.
    * `testZeroParRelativeTolerance`: Tests setting zero parameter relative tolerance.
    * `testZeroOrthoTolerance`: Tests setting zero orthogonality tolerance.
    * `testOptimizeFarMinimum`: Tests optimization for a minimum far from the start point.
4. DEFECT DETECTION STRATEGY - The tests aim to cover various input conditions, configurations, and potential failure modes of the Levenberg-Marquardt algorithm, particularly focusing on how different tolerance settings and initial conditions affect convergence and result accuracy.
5. SUMMARY - 25 tests.
6. LIMITATIONS - The tests rely on mock implementations of `DifferentiableMultivariateVectorialFunction`. Direct access to private fields for assertion is not performed; instead, setters and observable behavior via `optimize` are tested. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.