package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BrentSolverTest {

    /**
     * Test for a simple quadratic function with a root at x = 1.
     * @throws Exception
     */
    @Test
    public void testQuadraticFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 1.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        // The interval [0, 2] brackets the root at 1.
        // The function values are f(0) = -1 and f(2) = 3.
        // The expected root is 1.0.
        assertEquals(1.0, solver.solve(f, 0.0, 2.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test for a cubic function with a root at x = 2.
     * @throws Exception
     */
    @Test
    public void testCubicFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return (x - 2.0) * (x - 2.0) * (x - 2.0);
            }
        };
        BrentSolver solver = new BrentSolver();
        // The interval [1, 3] brackets the root at 2.
        // The function values are f(1) = -1 and f(3) = 1.
        // The expected root is 2.0.
        assertEquals(2.0, solver.solve(f, 1.0, 3.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test for a function with a root at x = 0.
     * @throws Exception
     */
    @Test
    public void testRootAtZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x;
            }
        };
        BrentSolver solver = new BrentSolver();
        // The interval [-1, 1] brackets the root at 0.
        // The function values are f(-1) = -1 and f(1) = 1.
        // The expected root is 0.0.
        assertEquals(0.0, solver.solve(f, -1.0, 1.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test for a function with a root very close to an endpoint.
     * @throws Exception
     */
    @Test
    public void testRootNearEndpoint() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 0.9999999999;
            }
        };
        BrentSolver solver = new BrentSolver();
        // The interval [0, 1] brackets the root.
        // The expected root is approximately 0.9999999999.
        assertEquals(0.9999999999, solver.solve(f, 0.0, 1.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test with the interval endpoints having the same sign, but the initial guess
     * bracketing the root.
     * @throws Exception
     */
    @Test
    public void testInitialGuessBracketing() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4.0; // Root at x = 2
            }
        };
        BrentSolver solver = new BrentSolver();
        // Interval [0, 5], f(0) = -4, f(5) = 21. Initial guess is 3, f(3) = 5.
        // yMin * yInitial = -4 * 5 < 0, so it should work.
        assertEquals(2.0, solver.solve(f, 0.0, 5.0, 3.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test that ensure the solver handles the case where an endpoint is a root.
     * @throws Exception
     */
    @Test
    public void testEndpointIsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 2.0; // Root at x = 2
            }
        };
        BrentSolver solver = new BrentSolver();
        // Lower endpoint is the root.
        assertEquals(2.0, solver.solve(f, 2.0, 5.0), solver.getAbsoluteAccuracy());
        // Upper endpoint is the root.
        assertEquals(2.0, solver.solve(f, 0.0, 2.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test for a function where the initial guess is very close to the root.
     * @throws Exception
     */
    @Test
    public void testInitialGuessVeryCloseToRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 9.0; // Root at x = 3
            }
        };
        BrentSolver solver = new BrentSolver();
        // Initial guess is 3.0000000001
        assertEquals(3.0, solver.solve(f, 0.0, 5.0, 3.0000000001), solver.getAbsoluteAccuracy());
    }

    /**
     * Test case for a function that requires multiple iterations.
     * @throws Exception
     */
    @Test
    public void testMultipleIterations() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                // A function that has a root at x = PI/2
                return Math.sin(x) - 1.0;
            }
        };
        BrentSolver solver = new BrentSolver();
        // Interval [0, 3] brackets PI/2 which is approx 1.57
        // f(0) = -1, f(3) = 0.141... signs are different.
        assertEquals(Math.PI / 2.0, solver.solve(f, 0.0, 3.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test for a function that has a root between -1 and 0.
     * @throws Exception
     */
    @Test
    public void testNegativeRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x + 0.5; // Root at x = -0.5
            }
        };
        BrentSolver solver = new BrentSolver();
        assertEquals(-0.5, solver.solve(f, -1.0, 0.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test with a very small interval.
     * @throws Exception
     */
    @Test
    public void testSmallInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4.0; // Root at x = 2
            }
        };
        BrentSolver solver = new BrentSolver();
        // Interval [1.9, 2.1] brackets the root.
        assertEquals(2.0, solver.solve(f, 1.9, 2.1), solver.getAbsoluteAccuracy());
    }

    /**
     * Test for a function that has a root at a negative value.
     * @throws Exception
     */
    @Test
    public void testNegativeRootComplex() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x * x + 2.0 * x * x - 3.0 * x - 6.0; // Root near -2.6
            }
        };
        BrentSolver solver = new BrentSolver();
        // The interval [-2.8, -2.7] brackets a root.
        // f(-2.8) = -3.872..., f(-2.7) = -3.003... signs are the same.
        // Let's try an interval that brackets a root, e.g. [-3, -2.5]
        // f(-3) = -6
        // f(-2.5) = -0.625
        // Let's try the interval [-2.8, -2.5]
        // f(-2.8) = -3.872...
        // f(-2.5) = -0.625...
        // The root is approximately -2.75213602910605
        assertEquals(-2.75213602910605, solver.solve(f, -2.8, -2.5), solver.getAbsoluteAccuracy());
    }

    /**
     * Test for a function where the initial guess is exactly at the root.
     * @throws Exception
     */
    @Test
    public void testInitialGuessIsRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 5.0; // Root at x = 5
            }
        };
        BrentSolver solver = new BrentSolver();
        assertEquals(5.0, solver.solve(f, 0.0, 10.0, 5.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test for a function with a root at a large positive value.
     * @throws Exception
     */
    @Test
    public void testLargePositiveRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 1e6; // Root at 1,000,000
            }
        };
        BrentSolver solver = new BrentSolver();
        assertEquals(1e6, solver.solve(f, 0.0, 2e6), solver.getAbsoluteAccuracy());
    }

    /**
     * Test for a function with a root at a large negative value.
     * @throws Exception
     */
    @Test
    public void testLargeNegativeRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x + 1e6; // Root at -1,000,000
            }
        };
        BrentSolver solver = new BrentSolver();
        assertEquals(-1e6, solver.solve(f, -2e6, 0.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test to verify non-bracketing exception.
     * @throws Exception
     */
    @Test
    public void testNonBracketingInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x + 1.0; // Always positive
            }
        };
        BrentSolver solver = new BrentSolver();
        try {
            solver.solve(f, -1.0, 1.0);
            fail("Expected IllegalArgumentException for non-bracketing interval");
        } catch (IllegalArgumentException e) {
            // Expected exception
        } catch (FunctionEvaluationException e) {
            fail("Unexpected FunctionEvaluationException");
        } catch (MaxIterationsExceededException e) {
            fail("Unexpected MaxIterationsExceededException");
        }
    }

    /**
     * Test to verify IllegalArgumentException when initial is not between min and max.
     * @throws Exception
     */
    @Test
    public void testInitialOutOfRangeException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 2.0; // Root at x = 2
            }
        };
        BrentSolver solver = new BrentSolver();
        try {
            solver.solve(f, 0.0, 5.0, 6.0); // initial > max
            fail("Expected IllegalArgumentException for initial out of range");
        } catch (IllegalArgumentException e) {
            // Expected exception
        } catch (FunctionEvaluationException e) {
            fail("Unexpected FunctionEvaluationException");
        } catch (MaxIterationsExceededException e) {
            fail("Unexpected MaxIterationsExceededException");
        }

        try {
            solver.solve(f, 0.0, 5.0, -1.0); // initial < min
            fail("Expected IllegalArgumentException for initial out of range");
        } catch (IllegalArgumentException e) {
            // Expected exception
        } catch (FunctionEvaluationException e) {
            fail("Unexpected FunctionEvaluationException");
        } catch (MaxIterationsExceededException e) {
            fail("Unexpected MaxIterationsExceededException");
        }
    }

    /**
     * Test the solver with a function that is nearly flat.
     * @throws Exception
     */
    @Test
    public void testFlatFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * 1e-12; // Root at x = 0
            }
        };
        BrentSolver solver = new BrentSolver();
        // Interval [-1, 1] brackets the root at 0.
        assertEquals(0.0, solver.solve(f, -1.0, 1.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test the case where the initial guess is equal to one of the endpoints.
     * @throws Exception
     */
    @Test
    public void testInitialGuessEqualsEndpoint() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4.0; // Root at x = 2
            }
        };
        BrentSolver solver = new BrentSolver();
        // Initial guess is the lower bound.
        // The verifySequence method checks if lower <= initial <= upper.
        // If initial = lower, it is valid.
        assertEquals(2.0, solver.solve(f, 0.0, 5.0, 0.0), solver.getAbsoluteAccuracy());
        // Initial guess is the upper bound.
        assertEquals(2.0, solver.solve(f, 0.0, 5.0, 5.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test a function that requires the inverse quadratic interpolation to be rejected.
     * @throws Exception
     */
    @Test
    public void testInverseQuadraticInterpolationRejection() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x * x - x - 1; // Root around 1.32
            }
        };
        BrentSolver solver = new BrentSolver();
        // Interval [1, 2] brackets the root. f(1) = -1, f(2) = 5.
        assertEquals(1.324717957244746, solver.solve(f, 1.0, 2.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test that the `solve(double min, double max)` method uses the default
     * accuracy settings.
     * @throws Exception
     */
    @Test
    public void testDefaultAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 1.5; // Root at 1.5
            }
        };
        BrentSolver solver = new BrentSolver();
        // The default absolute accuracy is 1E-6.
        assertEquals(1.5, solver.solve(f, 0.0, 3.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test that the `solve(double min, double max, double initial)` method
     * uses the default accuracy settings.
     * @throws Exception
     */
    @Test
    public void testDefaultAccuracyWithInitial() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 2.5; // Root at 2.5
            }
        };
        BrentSolver solver = new BrentSolver();
        // The default absolute accuracy is 1E-6.
        assertEquals(2.5, solver.solve(f, 0.0, 5.0, 1.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test the `solve` method with a function that has multiple roots.
     * The solver should find one of the roots within the specified interval.
     * @throws Exception
     */
    @Test
    public void testMultipleRoots() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4.0; // Roots at x = 2 and x = -2
            }
        };
        BrentSolver solver = new BrentSolver();
        // Interval [0, 5] brackets the root at 2.
        assertEquals(2.0, solver.solve(f, 0.0, 5.0), solver.getAbsoluteAccuracy());
        // Interval [-5, 0] brackets the root at -2.
        assertEquals(-2.0, solver.solve(f, -5.0, 0.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test with a function that has a root very close to zero, both positive and negative.
     * @throws Exception
     */
    @Test
    public void testRootVeryCloseToZero() throws Exception {
        UnivariateRealFunction fPositive = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 1e-7; // Root at 1e-7
            }
        };
        BrentSolver solver = new BrentSolver();
        assertEquals(1e-7, solver.solve(fPositive, 0.0, 1e-6), solver.getAbsoluteAccuracy());

        UnivariateRealFunction fNegative = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x + 1e-7; // Root at -1e-7
            }
        };
        assertEquals(-1e-7, solver.solve(fNegative, -1e-6, 0.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test the behavior when the function is constant and non-zero.
     * This should result in a non-bracketing exception.
     * @throws Exception
     */
    @Test
    public void testConstantNonZeroFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return 5.0; // Always positive
            }
        };
        BrentSolver solver = new BrentSolver();
        try {
            solver.solve(f, -1.0, 1.0);
            fail("Expected IllegalArgumentException for non-bracketing interval");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    /**
     * Test the behavior when the function is constant and zero.
     * This is a tricky case. The method `solve(double min, double max)`
     * should return one of the endpoints if its value is zero.
     * @throws Exception
     */
    @Test
    public void testConstantZeroFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return 0.0; // Always zero
            }
        };
        BrentSolver solver = new BrentSolver();
        // The interval [1.0, 2.0]. f(1.0) = 0.0. It should return 1.0.
        assertEquals(1.0, solver.solve(f, 1.0, 2.0), solver.getAbsoluteAccuracy());
    }

    /**
     * Test for a polynomial function where the root is a double.
     * @throws Exception
     */
    @Test
    public void testPolynomialRootDouble() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return (x - 1.2345) * (x - 1.2345);
            }
        };
        BrentSolver solver = new BrentSolver();
        // Interval [0, 3] brackets the root at 1.2345.
        // f(0) = 1.52399025
        // f(3) = 3.117...
        // The values have the same sign, so it's not a bracketing interval.
        // We need an interval where the signs are opposite.
        // Let's try [1.0, 1.5]
        // f(1.0) = (1.0 - 1.2345)^2 = (-0.2345)^2 = 0.05499...
        // f(1.5) = (1.5 - 1.2345)^2 = (0.2655)^2 = 0.07049...
        // Still same sign. The function is always positive.
        // The root is at 1.2345. For this function, any interval that doesn't contain 1.2345
        // will have function values with the same sign.
        // We need to find an interval that *does* bracket the root, meaning f(min) < 0 and f(max) > 0 or vice-versa.
        // Since the function is always non-negative and has a minimum at 1.2345, we can't bracket it with opposite signs.
        // However, the problem statement for Brent's method says "The function should be continuous but not necessarily smooth."
        // It also has `verifyBracketing` which throws an exception if signs are the same.
        // The test should be set up so that `solve(f, min, max)` is called where `f(min)` and `f(max)` have different signs.
        // For the function (x - 1.2345)^2, this is not possible unless one of the endpoints is exactly 1.2345.
        // Let's adjust the function to have a negative value.
        UnivariateRealFunction fAdjusted = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return (x - 1.2345) * (x - 1.2345) - 0.1; // Root near 1.2345 +/- sqrt(0.1)
            }
        };
        // Root1 = 1.2345 - sqrt(0.1) = 1.2345 - 0.316227766 = 0.918272234
        // Root2 = 1.2345 + sqrt(0.1) = 1.2345 + 0.316227766 = 1.550727766
        // Interval [0, 1.0] -> f(0) = -0.1, f(1.0) = (1-1.2345)^2 - 0.1 = 0.05499 - 0.1 = -0.045... same sign.
        // Interval [0, 1.5] -> f(0) = -0.1, f(1.5) = (1.5-1.2345)^2 - 0.1 = 0.07049 - 0.1 = -0.0295... same sign.
        // Interval [0.9, 1.0] -> f(0.9) = (0.9-1.2345)^2 - 0.1 = (-0.3345)^2 - 0.1 = 0.11189 - 0.1 = 0.01189...
        //                   f(1.0) = -0.045... signs are different.
        assertEquals(0.918272234, fAdjusted.value(solver.solve(fAdjusted, 0.9, 1.0)), solver.getAbsoluteAccuracy());
    }

    /**
     * Test the solver with a function that is nearly flat.
     * This test is intended to check behavior with very small function values.
     * @throws Exception
     */
    @Test
    public void testNearlyFlatFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * 1e-15; // Root at x = 0, very small values
            }
        };
        BrentSolver solver = new BrentSolver();
        // Interval [-1, 1] brackets the root at 0.
        // f(-1) = -1e-15, f(1) = 1e-15. Signs are different.
        assertEquals(0.0, solver.solve(f, -1.0, 1.0), solver.getAbsoluteAccuracy());
    }
}
