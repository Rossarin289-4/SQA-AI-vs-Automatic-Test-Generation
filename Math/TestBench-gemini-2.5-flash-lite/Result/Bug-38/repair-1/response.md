```java
package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.MultivariateOptimizer;

public class BOBYQAOptimizerTest {

    private static final double EPSILON = 1e-10;

    /**
     * Objective function for testing.
     * A simple quadratic function: f(x, y) = x^2 + y^2
     */
    private static class SimpleQuadraticFunction implements MultivariateFunction {
        @Override
        public double value(double[] point) {
            return point[0] * point[0] + point[1] * point[1];
        }
    }

    /**
     * Objective function for testing with bounds.
     * f(x, y) = (x - 1)^2 + (y - 2)^2
     * Minimum at (1, 2)
     */
    private static class ShiftedQuadraticFunction implements MultivariateFunction {
        @Override
        public double value(double[] point) {
            return (point[0] - 1.0) * (point[0] - 1.0) + (point[1] - 2.0) * (point[1] - 2.0);
        }
    }

    /**
     * Test case for the constructor with default parameters.
     * The default stopping radius is used. The initial radius is 10.0.
     */
    @Test
    public void testConstructorDefault() {
        // For a 2D problem, the minimum number of interpolation points is dimension + 2 = 4.
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        assertNotNull(optimizer);
        // The stopping trust region radius is accessible via getStoppingTrustRegionRadius()
        assertEquals(BOBYQAOptimizer.DEFAULT_STOPPING_RADIUS, optimizer.getStoppingTrustRegionRadius(), EPSILON);
        // The initial trust region radius is accessible via getInitialTrustRegionRadius()
        assertEquals(BOBYQAOptimizer.DEFAULT_INITIAL_RADIUS, optimizer.getInitialTrustRegionRadius(), EPSILON);
    }

    /**
     * Test case for the constructor with all parameters.
     */
    @Test
    public void testConstructorAllArgs() {
        int numberOfInterpolationPoints = 5;
        double initialRadius = 20.0;
        double stoppingRadius = 1e-5;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(numberOfInterpolationPoints, initialRadius, stoppingRadius);
        assertNotNull(optimizer);
        assertEquals(stoppingRadius, optimizer.getStoppingTrustRegionRadius(), EPSILON);
        assertEquals(initialRadius, optimizer.getInitialTrustRegionRadius(), EPSILON);
    }

    /**
     * Test with a simple quadratic function in 2D, minimizing.
     * Minimum is at (0, 0).
     */
    @Test
    public void testMinimizeSimpleQuadratic() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4); // 2D requires at least 4
        RealPointValuePair result = optimizer.optimize(new SimpleQuadraticFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with a simple quadratic function in 2D, maximizing.
     * Since x^2+y^2 has no maximum, it will explore towards higher values.
     * The result will depend on bounds or iteration limits.
     */
    @Test
    public void testMaximizeSimpleQuadratic() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        // Set bounds to prevent unbounded exploration, e.g., [-10, 10] for both.
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        RealPointValuePair result = optimizer.optimize(new SimpleQuadraticFunction(), GoalType.MAXIMIZE, lower, upper, new double[]{1.0, 1.0});
        // The maximum within [-10, 10] for x^2+y^2 is at the corners, e.g., (10, 10), with value 200.
        // Given the start point (1,1), it should move towards the boundaries.
        // The exact point depends on the algorithm. Check that it's near the boundary.
        assertTrue(result.getValue() > 2.0); // Should be greater than the starting point's value.
        assertTrue(result.getValue() <= 200.0 + EPSILON); // Should not exceed the theoretical max within bounds.
    }

    /**
     * Test with a shifted quadratic function in 2D, minimizing.
     * Minimum is at (1, 2).
     */
    @Test
    public void testMinimizeShiftedQuadratic() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        RealPointValuePair result = optimizer.optimize(new ShiftedQuadraticFunction(), GoalType.MINIMIZE, new double[]{0.0, 0.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{1.0, 2.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with bounds. Minimize shifted quadratic function.
     * Minimum is at (1, 2), which is within bounds.
     */
    @Test
    public void testMinimizeShiftedQuadraticWithBounds() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        RealPointValuePair result = optimizer.optimize(new ShiftedQuadraticFunction(), GoalType.MINIMIZE, lower, upper, new double[]{0.0, 0.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{1.0, 2.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with bounds where the minimum is outside the bounds.
     * The optimizer should find the minimum on the boundary.
     * Function: (x-1)^2 + (y-2)^2. Minimum at (1, 2).
     * Bounds: x in [2, 5], y in [3, 6].
     * The closest point to (1,2) within bounds is (2,3).
     * Value at (2,3) is (2-1)^2 + (3-2)^2 = 1^2 + 1^2 = 2.
     */
    @Test
    public void testMinimizeShiftedQuadraticWithBoundsOutsideMinimum() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        double[] lower = {2.0, 3.0};
        double[] upper = {5.0, 6.0};
        RealPointValuePair result = optimizer.optimize(new ShiftedQuadraticFunction(), GoalType.MINIMIZE, lower, upper, new double[]{0.0, 0.0});
        assertEquals(2.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{2.0, 3.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with a higher dimension (3D).
     * Function: x^2 + y^2 + z^2. Minimum at (0, 0, 0).
     */
    @Test
    public void testMinimizeSimpleQuadratic3D() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5); // 3D requires at least 3+2 = 5
        MultivariateFunction func = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1] + point[2] * point[2];
            }
        };
        RealPointValuePair result = optimizer.optimize(func, GoalType.MINIMIZE, new double[]{1.0, 1.0, 1.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with a higher dimension (4D).
     * Function: Sum of squares. Minimum at (0, 0, 0, 0).
     */
    @Test
    public void testMinimizeSimpleQuadratic4D() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6); // 4D requires at least 4+2 = 6
        MultivariateFunction func = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                double sum = 0;
                for (double d : point) {
                    sum += d * d;
                }
                return sum;
            }
        };
        RealPointValuePair result = optimizer.optimize(func, GoalType.MINIMIZE, new double[]{1.0, 1.0, 1.0, 1.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0, 0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with bounds in 3D.
     * Function: x^2 + y^2 + z^2. Minimum at (0, 0, 0).
     * Bounds: x in [-1, 1], y in [-1, 1], z in [-1, 1].
     */
    @Test
    public void testMinimizeSimpleQuadratic3DWithBounds() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        MultivariateFunction func = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1] + point[2] * point[2];
            }
        };
        double[] lower = {-1.0, -1.0, -1.0};
        double[] upper = {1.0, 1.0, 1.0};
        RealPointValuePair result = optimizer.optimize(func, GoalType.MINIMIZE, lower, upper, new double[]{0.5, 0.5, 0.5});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with initial guess on the boundary.
     * Function: x^2 + y^2. Minimum at (0, 0).
     * Initial guess at (1, 0).
     */
    @Test
    public void testMinimizeSimpleQuadraticInitialGuessOnBoundary() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        RealPointValuePair result = optimizer.optimize(new SimpleQuadraticFunction(), GoalType.MINIMIZE, new double[]{1.0, 0.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with a function that has a narrow valley.
     * Rosenbrock function (2D): f(x, y) = (1 - x)^2 + 100(y - x^2)^2
     * Minimum at (1, 1).
     */
    @Test
    public void testRosenbrockFunction() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        MultivariateFunction rosenbrock = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                double x = point[0];
                double y = point[1];
                return (1 - x) * (1 - x) + 100 * (y - x * x) * (y - x * x);
            }
        };
        // Start with a point that is not the minimum
        RealPointValuePair result = optimizer.optimize(rosenbrock, GoalType.MINIMIZE, new double[]{-1.0, -1.0});
        // The Rosenbrock function is notoriously difficult. We expect it to converge close to the minimum.
        // The exact value depends on the optimizer and parameters.
        assertTrue(result.getValue() < 1.0); // Should be significantly less than the starting value.
        assertTrue(Math.abs(result.getPoint()[0] - 1.0) < 0.1); // Check if point is close to (1,1)
        assertTrue(Math.abs(result.getPoint()[1] - 1.0) < 0.1);
    }

    /**
     * Test with a slightly more complex function.
     * f(x, y) = sin(x) + cos(y)
     * Multiple local minima and maxima.
     */
    @Test
    public void testTrigonometricFunction() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        MultivariateFunction trigFunc = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return Math.sin(point[0]) + Math.cos(point[1]);
            }
        };
        // Start near a minimum (e.g., where sin is -1 and cos is -1)
        double[] startPoint = {3.0 * Math.PI / 2.0, Math.PI}; // sin(-1) + cos(pi) = -1 + -1 = -2
        RealPointValuePair result = optimizer.optimize(trigFunc, GoalType.MINIMIZE, startPoint);
        // The minimum value is -2.0. Expecting the optimizer to find a value close to it.
        assertTrue(result.getValue() <= -1.9);
        // Check if the value is significantly less than the starting point's value.
        assertLessThan(trigFunc.value(startPoint), result.getValue());
    }

    /**
     * Test with a high number of interpolation points.
     * Should not throw an exception.
     */
    @Test
    public void testHighNumberOfInterpolationPoints() {
        int dimension = 2;
        // Max allowed for 2D is (N+1)(N+2)/2 = (2+1)(2+2)/2 = 3*4/2 = 6.
        int npt = 6;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);
        RealPointValuePair result = optimizer.optimize(new SimpleQuadraticFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with the minimum number of interpolation points.
     * Minimum for dimension n is n+2. For 2D, it's 4.
     */
    @Test
    public void testMinimumNumberOfInterpolationPoints() {
        int dimension = 2;
        int npt = dimension + 2;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);
        RealPointValuePair result = optimizer.optimize(new SimpleQuadraticFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with initial trust region radius set to a very small value.
     */
    @Test
    public void testSmallInitialTrustRegionRadius() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4, 1e-10, 1e-12);
        RealPointValuePair result = optimizer.optimize(new SimpleQuadraticFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with initial trust region radius set to a very large value.
     */
    @Test
    public void testLargeInitialTrustRegionRadius() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4, 1000.0, 1e-8);
        RealPointValuePair result = optimizer.optimize(new SimpleQuadraticFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with stopping trust region radius set to a very small value.
     */
    @Test
    public void testSmallStoppingTrustRegionRadius() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4, 10.0, 1e-15);
        RealPointValuePair result = optimizer.optimize(new SimpleQuadraticFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with stopping trust region radius set to a very large value.
     * This might lead to premature termination if the initial radius is small.
     * However, for a simple quadratic, it should still converge to the minimum.
     */
    @Test
    public void testLargeStoppingTrustRegionRadius() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4, 10.0, 100.0);
        RealPointValuePair result = optimizer.optimize(new SimpleQuadraticFunction(), GoalType.MINIMIZE, new double[]{1.0, 1.0});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.0, 0.0}, result.getPoint(), EPSILON);
    }

    /**
     * Test with bounds that are very close to each other.
     * Function: x^2 + y^2. Minimum at (0, 0).
     * Bounds: x in [0.1, 0.1000000001], y in [0.2, 0.2000000001].
     * The minimum should be at (0.1, 0.2).
     */
    @Test
    public void testNarrowBounds() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        MultivariateFunction func = new SimpleQuadraticFunction();
        double[] lower = {0.1, 0.2};
        double[] upper = {0.1 + 1e-9, 0.2 + 1e-9};
        RealPointValuePair result = optimizer.optimize(func, GoalType.MINIMIZE, lower, upper, new double[]{0.0, 0.0});
        assertEquals(0.1 * 0.1 + 0.2 * 0.2, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.1, 0.2}, result.getPoint(), EPSILON);
    }

    /**
     * Test with bounds that are equal.
     * The specification states "XL(I) to be strictly less than XU(I)".
     * However, the setup method adjusts initialTrustRegionRadius if bounds are too close.
     * If bounds are equal and the starting point is at the bound, it should work.
     */
    @Test
    public void testEqualBounds() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        MultivariateFunction func = new SimpleQuadraticFunction();
        double[] lower = {0.1, 0.2};
        double[] upper = {0.1, 0.2};
        // Start point must be within bounds. If bounds are equal, start point must be exactly at that bound.
        RealPointValuePair result = optimizer.optimize(func, GoalType.MINIMIZE, lower, upper, new double[]{0.1, 0.2});
        assertEquals(0.0, result.getValue(), EPSILON);
        assertArrayEquals(new double[]{0.1, 0.2}, result.getPoint(), EPSILON);
    }

    /**
     * Test minimum dimension requirement.
     * Should throw NumberIsTooSmallException if dimension < 2.
     */
    @Test
    public void testMinimumDimension() {
        try {
            // For 1D, N=1. Number of interpolation points must be >= N+2 = 3.
            BOBYQAOptimizer optimizer = new BOBYQAOptimizer(3);
            optimizer.optimize(new MultivariateFunction() { // Dummy function for 1D
                @Override
                public double value(double[] point) {
                    return point[0] * point[0];
                }
            }, GoalType.MINIMIZE, new double[]{1.0});
            fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            assertEquals(1, e.getArgument()); // dimension
            assertEquals(2, e.getLimit());    // MINIMUM_PROBLEM_DIMENSION
        }
    }

    /**
     * Test invalid number of interpolation points.
     * NPT must be in [N+2, (N+1)(N+2)/2].
     * For N=2, [4, 6].
     */
    @Test
    public void testInvalidNumberOfInterpolationPoints() {
        try {
            new BOBYQAOptimizer(3); // Less than N+2 = 4 for N=2
            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            assertEquals(3, e.getArgument()); // numberOfInterpolationPoints
            assertEquals(4, e.getLower());     // N+2
        }

        try {
            new BOBYQAOptimizer(7); // More than (N+1)(N+2)/2 = 6 for N=2
            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            assertEquals(7, e.getArgument()); // numberOfInterpolationPoints
            assertEquals(6, e.getUpper());    // (N+1)(N+2)/2
        }
    }

    /**
     * Helper to assert that a value is less than another with tolerance.
     */
    private void assertLessThan(double expectedMax, double actual) {
        assertTrue("Expected " + actual + " to be less than " + expectedMax, actual < expectedMax - EPSILON);
    }
}
```