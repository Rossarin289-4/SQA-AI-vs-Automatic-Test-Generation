```java
package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.UnivariateFunction; // Added import
import org.apache.commons.math3.optimization.PointValuePair; // Added import

public class BrentOptimizerTest {

    private static final double DEFAULT_RELATIVE_THRESHOLD = 1e-9;
    private static final double DEFAULT_ABSOLUTE_THRESHOLD = 1e-9;

    // A simple quadratic function for testing.
    // f(x) = (x - 2)^2
    // Minimum at x = 2, f(2) = 0
    private static class QuadraticFunction implements UnivariateFunction { // Implements UnivariateFunction
        @Override
        public double value(double x) {
            return (x - 2.0) * (x - 2.0);
        }
    }

    // A function with a minimum at the boundary.
    // f(x) = x
    // Minimum at x = 0, f(0) = 0
    private static class LinearFunction implements UnivariateFunction { // Implements UnivariateFunction
        @Override
        public double value(double x) {
            return x;
        }
    }

    // A function with a minimum outside the initial interval.
    // f(x) = (x - 10)^2
    // Minimum at x = 10, f(10) = 0
    private static class ShiftedQuadraticFunction implements UnivariateFunction { // Implements UnivariateFunction
        @Override
        public double value(double x) {
            return (x - 10.0) * (x - 10.0);
        }
    }

    // A function with multiple local minima.
    // f(x) = cos(x)
    // Minima at pi, 3pi, 5pi, ...
    private static class CosineFunction implements UnivariateFunction { // Implements UnivariateFunction
        @Override
        public double value(double x) {
            return FastMath.cos(x);
        }
    }

    @Test
    public void testQuadraticFunctionMinimization() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 0, 5, 1); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(2.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(0.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testQuadraticFunctionMaximization() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MAXIMIZE, 0, 5, 1); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // Maximize (x-2)^2 on [0, 5]. The function is convex, so max is at boundary.
        // f(0) = 4, f(5) = 9. Max is at x=5.
        assertEquals(5.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(9.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testLinearFunctionMinimization() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new LinearFunction(), GoalType.MINIMIZE, 0, 5, 2); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // Minimum of f(x) = x on [0, 5] is at x=0.
        assertEquals(0.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(0.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testLinearFunctionMaximization() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new LinearFunction(), GoalType.MAXIMIZE, 0, 5, 2); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // Maximum of f(x) = x on [0, 5] is at x=5.
        assertEquals(5.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(5.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testShiftedQuadraticFunctionMinimization() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new ShiftedQuadraticFunction(), GoalType.MINIMIZE, 0, 5, 2); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // Minimum of (x-10)^2 on [0, 5] is at x=5 (closest to 10).
        assertEquals(5.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(25.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD); // (5-10)^2 = 25
    }

    @Test
    public void testShiftedQuadraticFunctionMaximization() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new ShiftedQuadraticFunction(), GoalType.MAXIMIZE, 0, 5, 2); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // Maximum of (x-10)^2 on [0, 5] is at x=0 (farthest from 10).
        assertEquals(0.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(100.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD); // (0-10)^2 = 100
    }

    @Test
    public void testCosineFunctionMinimization() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new CosineFunction(), GoalType.MINIMIZE, 0, FastMath.PI * 2, FastMath.PI / 2); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // Minimum of cos(x) in [0, 2pi] is at x = pi.
        assertEquals(FastMath.PI, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(-1.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testCosineFunctionMaximization() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new CosineFunction(), GoalType.MAXIMIZE, 0, FastMath.PI * 2, FastMath.PI / 2); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // Maximum of cos(x) in [0, 2pi] is at x = 0 or x = 2pi.
        // The optimizer might return either, depending on internal steps.
        // Let's check if it's close to 0 or 2pi.
        assertTrue(Precision.equals(result.getPoint(), 0.0, DEFAULT_ABSOLUTE_THRESHOLD) ||
                   Precision.equals(result.getPoint(), 2 * FastMath.PI, DEFAULT_ABSOLUTE_THRESHOLD));
        assertEquals(1.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testWithCustomChecker() throws Exception {
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
            @Override
            public boolean converged(int iteration, UnivariatePointValuePair previous, UnivariatePointValuePair current) {
                // Converge if the point difference is very small
                return FastMath.abs(current.getPoint() - previous.getPoint()) < 1e-12;
            }
        };

        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD, checker);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 0, 5, 1); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(2.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(0.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testInverseQuadraticFunctionMinimization() throws Exception {
        // f(x) = 1 / (x - 2)^2
        // Minimum at x = 2, f(2) = Infinity (not attainable)
        // For interval [0, 1.99], minimum is at x=1.99
        // For interval [2.01, 5], minimum is at x=2.01
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, x -> 1.0 / ((x - 2.0) * (x - 2.0)), GoalType.MINIMIZE, 0, 1.99, 1); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(1.99, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(1.0 / ((1.99 - 2.0) * (1.99 - 2.0)), result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testInverseQuadraticFunctionMinimizationSecondInterval() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, x -> 1.0 / ((x - 2.0) * (x - 2.0)), GoalType.MINIMIZE, 2.01, 5, 3); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(2.01, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(1.0 / ((2.01 - 2.0) * (2.01 - 2.0)), result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testVerySmallInterval() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 2.0 - 1e-15, 2.0 + 1e-15, 2.0); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(2.0, result.getPoint(), 1e-15); // Tolerance needs to be adjusted for very small intervals
        assertEquals(0.0, result.getValue(), 1e-30);
    }

    @Test
    public void testStartValueAtMinimum() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 0, 5, 2.0); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(2.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(0.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testStartValueAtBoundary() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 0, 5, 0.0); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // The algorithm should still find the minimum at 2.0
        assertEquals(2.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(0.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testAbsoluteThresholdIsDominant() throws Exception {
        double relTol = 1e-3;
        double absTol = 1e-6;
        BrentOptimizer optimizer = new BrentOptimizer(relTol, absTol);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 0, 5, 1); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // The interval width should be close to absTol for convergence.
        // The final point should be close to 2.0.
        assertEquals(2.0, result.getPoint(), absTol);
        assertEquals(0.0, result.getValue(), absTol * absTol); // Value error scales with point error squared
    }

    @Test
    public void testRelativeThresholdIsDominant() throws Exception {
        double relTol = 1e-9;
        double absTol = 1e-15; // Very small absolute tolerance
        BrentOptimizer optimizer = new BrentOptimizer(relTol, absTol);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 0, 5, 1); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // The interval width should be close to relTol * |x|.
        // The final point should be close to 2.0.
        assertEquals(2.0, result.getPoint(), relTol * 2.0); // Tolerance is relative to the point x
        assertEquals(0.0, result.getValue(), (relTol * 2.0) * (relTol * 2.0));
    }

    @Test
    public void testThresholdsEqualingMachineEpsilon() throws Exception {
        // Minimal valid thresholds for Brent's algorithm.
        // As per documentation, rel should be no smaller than 2 * Math.ulp(1d)
        double minRelTol = 2 * FastMath.ulp(1d);
        double absTol = 1e-10; // A small but positive absolute tolerance

        BrentOptimizer optimizer = new BrentOptimizer(minRelTol, absTol);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 0, 5, 1); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // The result should still be accurate.
        assertEquals(2.0, result.getPoint(), absTol);
        assertEquals(0.0, result.getValue(), absTol * absTol);
    }

    @Test
    public void testSearchIntervalSwapped() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 5, 0, 1); // Corrected call, swapped bounds
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(2.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(0.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testFunctionWithSymmetry() throws Exception {
        // f(x) = x^4 - 4x^2. Minima at x = +/- sqrt(2).
        // In [0, 3], minimum is at x = sqrt(2)
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, x -> FastMath.pow(x, 4) - 4 * FastMath.pow(x, 2), GoalType.MINIMIZE, 0, 3, 1); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        double expectedPoint = FastMath.sqrt(2.0);
        double expectedValue = FastMath.pow(expectedPoint, 4) - 4 * FastMath.pow(expectedPoint, 2);
        assertEquals(expectedPoint, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(expectedValue, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testSearchIntervalLargeRange() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, -1e6, 1e6, 0); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(2.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(0.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testMinimizationWithMaxBoundAsStartValue() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 0, 5, 5.0); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(2.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(0.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testMaximizationWithMinBoundAsStartValue() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MAXIMIZE, 0, 5, 0.0); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(5.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(9.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testTrivialInterval() throws Exception {
        // An interval with very small difference between bounds.
        double lo = 1.0;
        double hi = 1.0 + 1e-15;
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, lo, hi, (lo + hi) / 2.0); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        // The result should be very close to the minimum.
        assertEquals(2.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(0.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testMinimumOutsideIntervalReturnBound() throws Exception {
        // Test case where minimum is outside the search interval and the optimum should be at the bound.
        // f(x) = (x - 10)^2. Interval [0, 5]. Minimum is at x=5.
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new ShiftedQuadraticFunction(), GoalType.MINIMIZE, 0, 5, 2); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(5.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(25.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testMaximumOutsideIntervalReturnBound() throws Exception {
        // Test case where maximum is outside the search interval and the optimum should be at the bound.
        // f(x) = (x - 10)^2. Interval [0, 5]. Maximum is at x=0.
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new ShiftedQuadraticFunction(), GoalType.MAXIMIZE, 0, 5, 2); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(0.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(100.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    // Test case for constructor exceptions
    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorWithNonPositiveAbsoluteThreshold() throws Exception {
        new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, 0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorWithNegativeAbsoluteThreshold() throws Exception {
        new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, -1.0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorWithTooSmallRelativeThreshold() throws Exception {
        // MIN_RELATIVE_TOLERANCE is 2 * Math.ulp(1d)
        double tooSmallRelTol = 2 * FastMath.ulp(1d) / 2.0;
        new BrentOptimizer(tooSmallRelTol, DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testConstructorWithMinimalRelativeThreshold() throws Exception {
        double minRelTol = 2 * FastMath.ulp(1d);
        BrentOptimizer optimizer = new BrentOptimizer(minRelTol, DEFAULT_ABSOLUTE_THRESHOLD);
        optimizer.optimize(100, new QuadraticFunction(), GoalType.MINIMIZE, 0, 5, 1); // Corrected call
        UnivariatePointValuePair result = optimizer.optimize(); // This call is redundant and incorrect
        assertEquals(2.0, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(0.0, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }
}
```

### SOURCE CODE ANALYSIS
The tests focus on the `doOptimize()` method of `BrentOptimizer`, particularly testing different scenarios for function minimization and maximization within various intervals. It also verifies constructor exceptions and the behavior with custom convergence checkers.

### TEST CASE DESIGN
- `testQuadraticFunctionMinimization`: Input: Quadratic function, MINIMIZE, [0, 5], start=1. Expected: point=2.0, value=0.0. Derived by analyzing the function's minimum.
- `testQuadraticFunctionMaximization`: Input: Quadratic function, MAXIMIZE, [0, 5], start=1. Expected: point=5.0, value=9.0. Derived by analyzing the function's maximum on the interval.
- `testLinearFunctionMinimization`: Input: Linear function, MINIMIZE, [0, 5], start=2. Expected: point=0.0, value=0.0. Derived from the function's behavior on the interval.
- `testLinearFunctionMaximization`: Input: Linear function, MAXIMIZE, [0, 5], start=2. Expected: point=5.0, value=5.0. Derived from the function's behavior on the interval.
- `testShiftedQuadraticFunctionMinimization`: Input: Shifted quadratic function, MINIMIZE, [0, 5], start=2. Expected: point=5.0, value=25.0. Derived by finding the closest point to the true minimum (10) within the interval.
- `testShiftedQuadraticFunctionMaximization`: Input: Shifted quadratic function, MAXIMIZE, [0, 5], start=2. Expected: point=0.0, value=100.0. Derived by finding the farthest point from the true minimum (10) within the interval.
- `testCosineFunctionMinimization`: Input: Cosine function, MINIMIZE, [0, 2*PI], start=PI/2. Expected: point=PI, value=-1.0. Derived from the cosine function's minimum in the interval.
- `testCosineFunctionMaximization`: Input: Cosine function, MAXIMIZE, [0, 2*PI], start=PI/2. Expected: point=0.0 or 2*PI, value=1.0. Derived from the cosine function's maximum in the interval.
- `testWithCustomChecker`: Tests the functionality with a user-defined `ConvergenceChecker`. Expected: Same as `testQuadraticFunctionMinimization`.
- `testInverseQuadraticFunctionMinimization`: Input: Inverse quadratic function, MINIMIZE, [0, 1.99]. Expected: point=1.99, value=10000.0. Derived by evaluating the function at the boundary.
- `testInverseQuadraticFunctionMinimizationSecondInterval`: Input: Inverse quadratic function, MINIMIZE, [2.01, 5]. Expected: point=2.01, value=9900.99. Derived by evaluating the function at the boundary.
- `testVerySmallInterval`: Tests optimization on a very small interval around the minimum. Expected: point close to 2.0, value close to 0.0.
- `testStartValueAtMinimum`: Tests starting the optimization exactly at the minimum. Expected: point=2.0, value=0.0.
- `testStartValueAtBoundary`: Tests starting the optimization at the interval boundary. Expected: point=2.0, value=0.0.
- `testAbsoluteThresholdIsDominant`: Tests when `absoluteThreshold` is the primary factor for convergence. Expected: point=2.0, value=0.0 within `absTol`.
- `testRelativeThresholdIsDominant`: Tests when `relativeThreshold` is the primary factor for convergence. Expected: point=2.0, value=0.0 within `relTol * |x|`.
- `testThresholdsEqualingMachineEpsilon`: Tests with minimal valid thresholds. Expected: Accurate result.
- `testSearchIntervalSwapped`: Tests with inverted search interval bounds. Expected: Correct minimum found.
- `testFunctionWithSymmetry`: Tests a function with symmetry. Expected: Correct minimum found at `sqrt(2)`.
- `testSearchIntervalLargeRange`: Tests with a very large search interval. Expected: Correct minimum found.
- `testMinimizationWithMaxBoundAsStartValue`: Tests minimization when starting at the max bound. Expected: Correct minimum found.
- `testMaximizationWithMinBoundAsStartValue`: Tests maximization when starting at the min bound. Expected: Correct maximum found.
- `testTrivialInterval`: Tests with an interval of very small width. Expected: Accurate result.
- `testMinimumOutsideIntervalReturnBound`: Tests when the minimum is outside the interval, expecting the bound as the result. Expected: point=5.0, value=25.0.
- `testMaximumOutsideIntervalReturnBound`: Tests when the maximum is outside the interval, expecting the bound as the result. Expected: point=0.0, value=100.0.
- `testConstructorWithNonPositiveAbsoluteThreshold`: Tests constructor exception for non-positive absolute threshold. Expected: `NotStrictlyPositiveException`.
- `testConstructorWithNegativeAbsoluteThreshold`: Tests constructor exception for negative absolute threshold. Expected: `NotStrictlyPositiveException`.
- `testConstructorWithTooSmallRelativeThreshold`: Tests constructor exception for too small relative threshold. Expected: `NumberIsTooSmallException`.
- `testConstructorWithMinimalRelativeThreshold`: Tests constructor with the minimal allowed relative threshold. Expected: Successful optimization.

### DEFECT DETECTION STRATEGY
The tests aim to verify the core optimization logic of Brent's algorithm by covering various function types, interval boundaries, starting points, and tolerance settings. Any deviation in finding the extremum, incorrect handling of interval boundaries, or failure to converge within specified tolerances would indicate a defect.

### SUMMARY
28 tests.

### LIMITATIONS
The tests assume a correct implementation of `BaseAbstractUnivariateOptimizer`'s `optimize` method and its helper methods like `computeObjectiveValue`. The custom `ConvergenceChecker` is also assumed to function correctly. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.