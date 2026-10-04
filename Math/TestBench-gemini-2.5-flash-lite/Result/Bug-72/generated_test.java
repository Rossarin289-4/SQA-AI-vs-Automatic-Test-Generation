package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BrentSolverTest {
    /**
     * Test whether the default constructor works.
     */
    @Test
    public void testDefaultConstructor() {
        BrentSolver solver = new BrentSolver();
        assertEquals(100, solver.getMaximalIterationCount());
        // Use the default function value accuracy for comparison
        assertEquals(1.0E-6, solver.getAbsoluteAccuracy(), 1.0E-15);
        assertEquals(1.0E-6, solver.getRelativeAccuracy(), 1.0E-15);
        assertEquals(1.0E-6, solver.getFunctionValueAccuracy(), 1.0E-15);
    }

    /**
     * Test setting custom parameters using set methods after default construction.
     */
    @Test
    public void testSettersForCustomParameters() {
        BrentSolver solver = new BrentSolver();
        solver.setMaximalIterationCount(10);
        solver.setAbsoluteAccuracy(1e-5);
        solver.setRelativeAccuracy(1e-5);
        solver.setFunctionValueAccuracy(1e-5);
        assertEquals(10, solver.getMaximalIterationCount());
        assertEquals(1e-5, solver.getAbsoluteAccuracy(), 1e-15);
        assertEquals(1e-5, solver.getRelativeAccuracy(), 1e-15);
        assertEquals(1e-5, solver.getFunctionValueAccuracy(), 1e-15);
    }

    /**
     * Test a simple function with a known root.
     */
    @Test
    public void testSolveSimpleFunction() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -10;
        double max = 10;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // The function value accuracy is 1E-6 by default, so the result should be within this tolerance.
        assertEquals(0.0, solver.solve(f, min, max), 1e-6);
    }

    /**
     * Test a quadratic function with a known root.
     */
    @Test
    public void testSolveQuadraticFunction() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -10;
        double max = 10;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4;
            }
        };
        // The function values at endpoints are f(-10) = 96 and f(10) = 96. They have the same sign.
        // The method `solve(f, min, max)` should throw an IllegalArgumentException in this case.
        try {
            solver.solve(f, min, max);
            fail("IllegalArgumentException expected for non-bracketing interval");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    /**
     * Test a function where one endpoint is the root.
     */
    @Test
    public void testSolveEndpointRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = 0;
        double max = 10;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        assertEquals(0.0, solver.solve(f, min, max), 1e-6);
    }

    /**
     * Test a function where the other endpoint is the root.
     */
    @Test
    public void testSolveOtherEndpointRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -10;
        double max = 0;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        assertEquals(0.0, solver.solve(f, min, max), 1e-6);
    }

    /**
     * Test for non-bracketing interval.
     */
    @Test
    public void testNonBracketing() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = 1;
        double max = 10;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1; // Always positive
            }
        };
        try {
            solver.solve(f, min, max);
            fail("IllegalArgumentException expected for non-bracketing interval");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    /**
     * Test with a maximum iteration count exceeded.
     */
    @Test
    public void testMaxIterationsExceeded() throws Exception {
        BrentSolver solver = new BrentSolver();
        solver.setMaximalIterationCount(1); // Very low iteration count
        double min = -10;
        double max = 10;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        try {
            solver.solve(f, min, max);
            fail("MaxIterationsExceededException expected");
        } catch (MaxIterationsExceededException e) {
            // Expected exception
            assertEquals(1, e.getMaxIterations());
        }
    }

    /**
     * Test with a function that has a root at initial guess.
     */
    @Test
    public void testSolveWithInitialGuessAsRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -10;
        double max = 10;
        double initial = 0;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        assertEquals(0.0, solver.solve(f, min, max, initial), 1e-6);
    }

    /**
     * Test with a function where initial guess is not a root but close to it.
     */
    @Test
    public void testSolveWithInitialGuessCloseToRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -10;
        double max = 10;
        double initial = 1e-7;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        assertEquals(0.0, solver.solve(f, min, max, initial), 1e-6);
    }

    /**
     * Test with a function where the initial guess is in the left bracket.
     */
    @Test
    public void testSolveWithInitialGuessInLeftBracket() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -10;
        double max = 10;
        double initial = -5;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        assertEquals(0.0, solver.solve(f, min, max, initial), 1e-6);
    }

    /**
     * Test with a function where the initial guess is in the right bracket.
     */
    @Test
    public void testSolveWithInitialGuessInRightBracket() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -10;
        double max = 10;
        double initial = 5;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        assertEquals(0.0, solver.solve(f, min, max, initial), 1e-6);
    }

    /**
     * Test for illegal argument exception when initial guess is outside interval.
     */
    @Test
    public void testSolveInitialGuessOutsideInterval() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -10;
        double max = 10;
        double initial = 11;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        try {
            solver.solve(f, min, max, initial);
            fail("IllegalArgumentException expected for initial guess outside interval");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    /**
     * Test a cubic function: x^3 - 2x - 5. Root is around 2.09455148.
     */
    @Test
    public void testSolveCubicFunction() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = 0;
        double max = 3;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 2 * x - 5;
            }
        };
        // The expected value is derived from running the solver with the given parameters.
        // The default accuracy is 1e-6, but for this specific function, a slightly higher precision is expected.
        assertEquals(2.09455148, solver.solve(f, min, max), 1e-8);
    }

    /**
     * Test a function with a root at zero, with interval around it.
     */
    @Test
    public void testSolveRootAtZeroIntervalAroundZero() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -1;
        double max = 1;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        assertEquals(0.0, solver.solve(f, min, max), 1e-6);
    }

    /**
     * Test a function with a root near the edge of precision.
     */
    @Test
    public void testSolveNearPrecision() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = 0;
        double max = 1e-7;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // The root is 0. The interval is [0, 1e-7]. The solver should find a value very close to 0.
        // The default function value accuracy is 1E-6.
        assertEquals(0.0, solver.solve(f, min, max), 1e-6);
    }

    /**
     * Test a function with a negative root.
     */
    @Test
    public void testSolveNegativeRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -3;
        double max = -1;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x + 2;
            }
        };
        assertEquals(-2.0, solver.solve(f, min, max), 1e-6);
    }

    /**
     * Test a function with large values.
     */
    @Test
    public void testSolveLargeValues() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = 1e10;
        double max = 2e10;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.5e10;
            }
        };
        // The expected value is 1.5e10. The tolerance needs to be relative to the magnitude of the numbers.
        // For large numbers, a larger absolute tolerance might be acceptable.
        // The default relativeAccuracy is 1e-6. So the result should be within 1.5e10 * 1e-6 = 1.5e4.
        assertEquals(1.5e10, solver.solve(f, min, max), 1.5e4);
    }

    /**
     * Test a function with very small values.
     */
    @Test
    public void testSolveSmallValues() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -1e-10;
        double max = 1e-10;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // The root is 0. The interval is [-1e-10, 1e-10]. The function value accuracy is 1e-6.
        // The result should be very close to 0.
        assertEquals(0.0, solver.solve(f, min, max), 1e-6);
    }

    /**
     * Test to ensure the `solve(f, min, max, initial)` method handles cases where `initial` is `min`.
     */
    @Test
    public void testSolveInitialAtMin() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // When initial is min, and yMin is not zero, the algorithm should proceed.
        // For f(x) = x, if initial = -10, yInitial = -10. yMin = -10. yMax = 10.
        // The condition yInitial * yMin < 0 is false.
        // The condition yInitial * yMax < 0 is true. It will call solve(f, initial, yInitial, max, yMax, initial, yInitial)
        // which is solve(f, -10, -10, 10, 10, -10, -10)
        assertEquals(0.0, solver.solve(f, -10, 10, -10), 1e-6);
    }

    /**
     * Test to ensure the `solve(f, min, max, initial)` method handles cases where `initial` is `max`.
     */
    @Test
    public void testSolveInitialAtMax() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // When initial is max, and yMax is not zero, the algorithm should proceed.
        // For f(x) = x, if initial = 10, yInitial = 10. yMin = -10. yMax = 10.
        // The condition yInitial * yMin < 0 is true. It will call solve(f, min, yMin, initial, yInitial, min, yMin)
        // which is solve(f, -10, -10, 10, 10, -10, -10)
        assertEquals(0.0, solver.solve(f, -10, 10, 10), 1e-6);
    }


    /**
     * Test to ensure the `solve(f, min, max, initial)` method handles cases where `yMin` is zero.
     */
    @Test
    public void testSolveMinIsRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // yMin is zero. The method should return min.
        assertEquals(0.0, solver.solve(f, 0.0, 10.0, 5.0), 1e-6);
    }

    /**
     * Test to ensure the `solve(f, min, max, initial)` method handles cases where `yMax` is zero.
     */
    @Test
    public void testSolveMaxIsRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // yMax is zero. The method should return max.
        assertEquals(0.0, solver.solve(f, -10.0, 0.0, -5.0), 1e-6);
    }

    /**
     * Test case where initial is exactly on the root.
     */
    @Test
    public void testInitialIsRootExact() throws Exception {
        BrentSolver solver = new BrentSolver();
        double initial = 2.0;
        double min = -10.0;
        double max = 10.0;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        assertEquals(initial, solver.solve(f, min, max, initial), 1e-6);
    }

    /**
     * Test case where the interval is very small.
     */
    @Test
    public void testSmallInterval() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = 1.0;
        double max = 1.0 + 1e-10;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        // The root is 1.0. The interval is very small.
        // The default absolute accuracy is 1e-6.
        assertEquals(1.0, solver.solve(f, min, max), 1e-6);
    }

    /**
     * Test that a function that is always positive doesn't cause an issue with
     * `solve(f, min, max, initial)` when the initial value has the same sign as endpoints.
     */
    @Test
    public void testPositiveFunctionWithInitial() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = 1;
        double max = 10;
        double initial = 5;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1; // Always positive
            }
        };
        // yMin = 2, yMax = 101, yInitial = 26. All positive.
        // This should throw an IllegalArgumentException because the signs are not different.
        try {
            solver.solve(f, min, max, initial);
            fail("IllegalArgumentException expected for non-bracketing interval");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    /**
     * Test with a function where the initial guess is very close to an endpoint,
     * and the other endpoint is the root.
     */
    @Test
    public void testSolveWithInitialGuessCloseToEndpointNearRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -10;
        double max = 0;
        double initial = -1e-7; // Close to 0, which is the root.
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        assertEquals(0.0, solver.solve(f, min, max, initial), 1e-6);
    }

    /**
     * Test with a function where the initial guess is very close to an endpoint,
     * and the other endpoint is the root (reversed interval).
     */
    @Test
    public void testSolveWithInitialGuessCloseToEndpointNearRootReversed() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = 0;
        double max = 10;
        double initial = 1e-7; // Close to 0, which is the root.
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        assertEquals(0.0, solver.solve(f, min, max, initial), 1e-6);
    }

    /**
     * Test with a function whose root is at the boundary of double precision.
     */
    @Test
    public void testSolveBoundaryDoublePrecision() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = 0;
        double max = Double.MAX_VALUE;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // The root is 0. The interval is [0, Double.MAX_VALUE].
        assertEquals(0.0, solver.solve(f, min, max), 1e-6);
    }

    /**
     * Test with a function whose root is at the boundary of double precision (negative).
     */
    @Test
    public void testSolveBoundaryDoublePrecisionNegative() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = -Double.MAX_VALUE;
        double max = 0;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // The root is 0. The interval is [-Double.MAX_VALUE, 0].
        assertEquals(0.0, solver.solve(f, min, max), 1e-6);
    }

    /**
     * Test a case where interpolation might be tricky: function values are very close.
     */
    @Test
    public void testCloseFunctionValues() throws Exception {
        BrentSolver solver = new BrentSolver();
        double min = 0;
        double max = 1e-7;
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                // A very flat function near zero.
                return x * 1e-10;
            }
        };
        assertEquals(0.0, solver.solve(f, min, max), 1e-15);
    }
}
