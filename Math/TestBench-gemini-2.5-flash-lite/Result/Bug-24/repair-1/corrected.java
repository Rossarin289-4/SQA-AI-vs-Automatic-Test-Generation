package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.analysis.UnivariateFunction; // Added import
import org.apache.commons.math3.optimization.InitialGuess; // Added import
import org.apache.commons.math3.optimization.SimpleBounds; // Added import

public class BrentOptimizerTest {

    /**
     * Test constructor with valid parameters.
     * Verifies that the constructor does not throw exceptions for valid relative and absolute thresholds.
     */
    @Test
    public void testConstructorValid() {
        try {
            new BrentOptimizer(1e-6, 1e-6, null);
        } catch (Exception e) {
            fail("Constructor threw exception for valid inputs: " + e.getMessage());
        }
    }

    /**
     * Test constructor with invalid relative threshold (too small).
     * Verifies that NumberIsTooSmallException is thrown when rel < 2 * Math.ulp(1d).
     */
    @Test
    public void testConstructorRelTooSmall() {
        try {
            new BrentOptimizer(1e-17, 1e-6, null); // 2 * Math.ulp(1d) is approximately 2.22e-16
            fail("Expected NumberIsTooSmallException for rel too small");
        } catch (NumberIsTooSmallException e) {
            // Expected exception
        } catch (Exception e) {
            fail("Constructor threw wrong exception for rel too small: " + e.getMessage());
        }
    }

    /**
     * Test constructor with invalid absolute threshold (zero).
     * Verifies that NotStrictlyPositiveException is thrown when abs <= 0.
     */
    @Test
    public void testConstructorAbsZero() {
        try {
            new BrentOptimizer(1e-6, 0, null);
            fail("Expected NotStrictlyPositiveException for abs = 0");
        } catch (NotStrictlyPositiveException e) {
            // Expected exception
        } catch (Exception e) {
            fail("Constructor threw wrong exception for abs = 0: " + e.getMessage());
        }
    }

    /**
     * Test constructor with invalid absolute threshold (negative).
     * Verifies that NotStrictlyPositiveException is thrown when abs <= 0.
     */
    @Test
    public void testConstructorAbsNegative() {
        try {
            new BrentOptimizer(1e-6, -1e-6, null);
            fail("Expected NotStrictlyPositiveException for abs < 0");
        } catch (NotStrictlyPositiveException e) {
            // Expected exception
        } catch (Exception e) {
            fail("Constructor threw wrong exception for abs < 0: " + e.getMessage());
        }
    }

    /**
     * Test the doOptimize method with a simple quadratic function (minimization).
     * Function: f(x) = x^2, Minimum at x = 0.
     * Range: [-5, 5]. Start value: 0.
     */
    @Test
    public void testOptimizeQuadraticMinimization() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return x * x;
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(-5, 5)
        );
        assertEquals(0.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    /**
     * Test the doOptimize method with a simple quadratic function (maximization).
     * Function: f(x) = -x^2, Maximum at x = 0.
     * Range: [-5, 5]. Start value: 0.
     */
    @Test
    public void testOptimizeQuadraticMaximization() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MAXIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return -x * x;
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(-5, 5)
        );
        assertEquals(0.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    /**
     * Test with a function having minimum at the boundary.
     * Function: f(x) = x. Minimum at x = -5.
     * Range: [-5, 5]. Start value: 0.
     */
    @Test
    public void testOptimizeBoundaryMin() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return x;
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(-5, 5)
        );
        assertEquals(-5.0, result.getPoint(), 1e-6);
        assertEquals(-5.0, result.getValue(), 1e-6);
    }

    /**
     * Test with a function having maximum at the boundary.
     * Function: f(x) = x. Maximum at x = 5.
     * Range: [-5, 5]. Start value: 0.
     */
    @Test
    public void testOptimizeBoundaryMax() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MAXIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return x;
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(-5, 5)
        );
        assertEquals(5.0, result.getPoint(), 1e-6);
        assertEquals(5.0, result.getValue(), 1e-6);
    }

    /**
     * Test with a more complex function (cosine).
     * Function: f(x) = cos(x). Minimum at x = PI.
     * Range: [0, 2*PI]. Start value: PI/2.
     */
    @Test
    public void testOptimizeCosineMinimization() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return FastMath.cos(x);
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(0, 2 * FastMath.PI)
        );
        assertEquals(FastMath.PI, result.getPoint(), 1e-6);
        assertEquals(-1.0, result.getValue(), 1e-6);
    }

    /**
     * Test with a function that has multiple local minima.
     * Function: f(x) = x^4 - 4x^2. Global minimum at x = sqrt(2).
     * Range: [0, 3]. Start value: 1.
     */
    @Test
    public void testOptimizeMultipleLocalMinima() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return x * x * x * x - 4 * x * x;
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(0, 3)
        );
        assertEquals(FastMath.sqrt(2.0), result.getPoint(), 1e-6);
        assertEquals(-4.0, result.getValue(), 1e-6);
    }

    /**
     * Test with a function having a very flat minimum.
     * Function: f(x) = (x - 1)^4. Minimum at x = 1.
     * Range: [0, 2]. Start value: 0.5.
     */
    @Test
    public void testOptimizeFlatMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return FastMath.pow(x - 1, 4);
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(0, 2)
        );
        assertEquals(1.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    /**
     * Test with a function that is constant.
     * Function: f(x) = 5. Any point is a minimum/maximum.
     * Range: [-10, 10]. Start value: 0.
     */
    @Test
    public void testOptimizeConstantFunction() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return 5.0;
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(-10, 10)
        );
        // The optimizer should return a point within the bounds, the exact point may vary but value should be 5.
        // The start value is 0, so it's likely to return 0 or something very close.
        assertTrue(result.getPoint() >= -10.0 && result.getPoint() <= 10.0);
        assertEquals(5.0, result.getValue(), 1e-6);
    }

    /**
     * Test with a very wide range.
     * Function: f(x) = x^2. Minimum at x = 0.
     * Range: [-1e10, 1e10]. Start value: 0.
     */
    @Test
    public void testOptimizeWideRange() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return x * x;
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(-1e10, 1e10)
        );
        assertEquals(0.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    /**
     * Test with a very narrow range.
     * Function: f(x) = (x - 1)^2. Minimum at x = 1.
     * Range: [0.999, 1.001]. Start value: 1.
     */
    @Test
    public void testOptimizeNarrowRange() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return (x - 1) * (x - 1);
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(0.999, 1.001)
        );
        assertEquals(1.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    /**
     * Test with a custom convergence checker.
     * Checks convergence based on a fixed number of iterations.
     */
    @Test
    public void testOptimizeWithCustomChecker() {
        final int maxIterations = 10;
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                private int count = 0;
                @Override
                public boolean converged(int iteration, UnivariatePointValuePair previous, UnivariatePointValuePair current) {
                    count++;
                    return count >= maxIterations;
                }
            };

        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6, checker);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return x * x;
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(-5, 5)
        );
        // The exact number of iterations may vary, but we expect it to converge.
        // We can't assert the exact point without knowing how many iterations it took.
        // We just check that it returns a valid result.
        assertEquals(0.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    /**
     * Test the 'best' method with two non-null points for minimization.
     * Expects the point with the lower value.
     */
    @Test
    public void testBestMinimization() throws Exception { // Added throws Exception
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair p1 = new UnivariatePointValuePair(1.0, 2.0);
        UnivariatePointValuePair p2 = new UnivariatePointValuePair(2.0, 1.0);
        UnivariatePointValuePair best = optimizer.best(p1, p2, true);
        assertEquals(p2.getPoint(), best.getPoint(), 1e-9);
        assertEquals(p2.getValue(), best.getValue(), 1e-9);
    }

    /**
     * Test the 'best' method with two non-null points for maximization.
     * Expects the point with the higher value.
     */
    @Test
    public void testBestMaximization() throws Exception { // Added throws Exception
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair p1 = new UnivariatePointValuePair(1.0, 2.0);
        UnivariatePointValuePair p2 = new UnivariatePointValuePair(2.0, 1.0);
        UnivariatePointValuePair best = optimizer.best(p1, p2, false);
        assertEquals(p1.getPoint(), best.getPoint(), 1e-9);
        assertEquals(p1.getValue(), best.getValue(), 1e-9);
    }

    /**
     * Test the 'best' method with the first point being null.
     */
    @Test
    public void testBestFirstNull() throws Exception { // Added throws Exception
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair p2 = new UnivariatePointValuePair(2.0, 1.0);
        UnivariatePointValuePair best = optimizer.best(null, p2, true);
        assertEquals(p2.getPoint(), best.getPoint(), 1e-9);
        assertEquals(p2.getValue(), best.getValue(), 1e-9);
    }

    /**
     * Test the 'best' method with the second point being null.
     */
    @Test
    public void testBestSecondNull() throws Exception { // Added throws Exception
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair p1 = new UnivariatePointValuePair(1.0, 2.0);
        UnivariatePointValuePair best = optimizer.best(p1, null, true);
        assertEquals(p1.getPoint(), best.getPoint(), 1e-9);
        assertEquals(p1.getValue(), best.getValue(), 1e-9);
    }

    /**
     * Test the 'best' method with both points being null.
     */
    @Test
    public void testBestBothNull() throws Exception { // Added throws Exception
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair best = optimizer.best(null, null, true);
        assertNull(best);
    }

    /**
     * Test with a function where the minimum is at the start value.
     * Function: f(x) = x^2. Minimum at x = 0.
     * Range: [-5, 5]. Start value: 0.
     */
    @Test
    public void testOptimizeStartValueIsMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return x * x;
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(-5, 5)
        );
        assertEquals(0.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    /**
     * Test the edge case where the interval [a, b] is defined with lo > hi.
     * The optimizer should handle this by swapping them internally.
     * Function: f(x) = x^2. Minimum at x = 0.
     * Range: [5, -5]. Start value: 0.
     */
    @Test
    public void testOptimizeFlippedBounds() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-6);
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return x * x;
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(5, -5) // Flipped bounds
        );
        assertEquals(0.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    /**
     * Test with a function that requires a large number of iterations.
     * Function: f(x) = (x - 0.123456789)^2. Minimum at x = 0.123456789.
     * Range: [0, 1]. Start value: 0.5.
     * Using a very small tolerance to force more iterations.
     */
    @Test
    public void testOptimizeManyIterations() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-15, 1e-15); // Very small tolerances
        UnivariatePointValuePair result = optimizer.optimize(
                GoalType.MINIMIZE,
                new UnivariateFunction() {
                    @Override
                    public double value(double x) {
                        return (x - 0.123456789) * (x - 0.123456789);
                    }
                },
                InitialGuess.DEFAULT,
                new SimpleBounds(0, 1)
        );
        assertEquals(0.123456789, result.getPoint(), 1e-15); // Assert with the tolerance used
        assertEquals(0.0, result.getValue(), 1e-15);
    }
}
