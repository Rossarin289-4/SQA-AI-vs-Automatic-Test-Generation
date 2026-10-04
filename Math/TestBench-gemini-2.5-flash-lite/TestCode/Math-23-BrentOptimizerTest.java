package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;

public class BrentOptimizerTest {

    private static final double DEFAULT_RELATIVE_THRESHOLD = 1e-9;
    private static final double DEFAULT_ABSOLUTE_THRESHOLD = 1e-9;

    // A simple quadratic function for testing.
    // f(x) = (x - 2)^2
    // Minimum at x = 2, f(2) = 0

    // A function with a minimum at the boundary.
    // f(x) = x
    // Minimum at x = 0, f(0) = 0

    // A function with a minimum outside the initial interval.
    // f(x) = (x - 10)^2
    // Minimum at x = 10, f(10) = 0

    // A function with multiple local minima.
    // f(x) = cos(x)
    // Minima at pi, 3pi, 5pi, ...










    @Test
    public void testInverseQuadraticFunctionMinimization() throws Exception {
        // f(x) = 1 / (x - 2)^2
        // Minimum at x = 2, f(2) = Infinity (not attainable)
        // For interval [0, 1.99], minimum is at x=1.99
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        UnivariatePointValuePair result = optimizer.optimize(100, x -> 1.0 / ((x - 2.0) * (x - 2.0)), GoalType.MINIMIZE, 0, 1.99, 1);
        assertEquals(1.99, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(1.0 / ((1.99 - 2.0) * (1.99 - 2.0)), result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }

    @Test
    public void testInverseQuadraticFunctionMinimizationSecondInterval() throws Exception {
        // For interval [2.01, 5], minimum is at x=2.01
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        UnivariatePointValuePair result = optimizer.optimize(100, x -> 1.0 / ((x - 2.0) * (x - 2.0)), GoalType.MINIMIZE, 2.01, 5, 3);
        assertEquals(2.01, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(1.0 / ((2.01 - 2.0) * (2.01 - 2.0)), result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
    }








    @Test
    public void testFunctionWithSymmetry() throws Exception {
        // f(x) = x^4 - 4x^2. Minima at x = +/- sqrt(2).
        // In [0, 3], minimum is at x = sqrt(2)
        BrentOptimizer optimizer = new BrentOptimizer(DEFAULT_RELATIVE_THRESHOLD, DEFAULT_ABSOLUTE_THRESHOLD);
        UnivariatePointValuePair result = optimizer.optimize(100, x -> FastMath.pow(x, 4) - 4 * FastMath.pow(x, 2), GoalType.MINIMIZE, 0, 3, 1);
        double expectedPoint = FastMath.sqrt(2.0);
        double expectedValue = FastMath.pow(expectedPoint, 4) - 4 * FastMath.pow(expectedPoint, 2);
        assertEquals(expectedPoint, result.getPoint(), DEFAULT_ABSOLUTE_THRESHOLD);
        assertEquals(expectedValue, result.getValue(), DEFAULT_ABSOLUTE_THRESHOLD);
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

}


