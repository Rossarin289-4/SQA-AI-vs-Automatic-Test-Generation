package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;

public class BrentSolverTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSolveWithBracketingEndpoints() throws Exception {
        UnivariateRealFunction quadratic = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4;
            }
        };
        BrentSolver solver2 = new BrentSolver(quadratic);
        // f(1) = -3, f(3) = 5. Root is 2.
        assertEquals(2.0, solver2.solve(1.0, 3.0), 1E-6);
    }

    @Test
    public void testSolveWithBracketingMinInitial() throws Exception {
        UnivariateRealFunction linear = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 2;
            }
        };
        BrentSolver solver3 = new BrentSolver(linear);
        // For the public method solve(min, max):
        // The requirement is that `yMin * yMax < 0`.
        // For f(x) = x - 2, solve(0, 3). yMin=-2, yMax=1. Signs are opposite.
        // It should call `solve(min, yMin, max, yMax, min, yMin)` -> `solve(0, -2, 3, 1, 0, -2)`.
        assertEquals(2.0, solver3.solve(0.0, 3.0), 1E-6);
    }
    
    @Test
    public void testSolveWithBracketingInitialMax() throws Exception {
        UnivariateRealFunction linear = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 2;
            }
        };
        BrentSolver solver = new BrentSolver(linear);
        // min=1, max=3, initial=2.5. yMin= -1, yMax=1, yInitial=0.5.
        // Let's use initial=2.1, yInitial = 0.1.
        // min=1, max=3, initial=2.1. yMin=-1, yMax=1, yInitial=0.1.
        // yInitial * yMin = 0.1 * -1 = -0.1 < 0.
        // This calls `solve(initial, yInitial, max, yMax, initial, yInitial)`
        // which is `solve(2.1, 0.1, 3.0, 1.0, 2.1, 0.1)`.
        assertEquals(2.0, solver.solve(1.0, 3.0, 2.1), 1E-6);
    }

    @Test
    public void testSolveWhenInitialIsRoot() throws Exception {
        UnivariateRealFunction linear = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 2;
            }
        };
        BrentSolver solver = new BrentSolver(linear);
        // initial is root
        assertEquals(2.0, solver.solve(0.0, 3.0, 2.0), 1E-6);
    }

    @Test
    public void testSolveWhenMinIsRoot() throws Exception {
        UnivariateRealFunction linear = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 2;
            }
        };
        BrentSolver solver = new BrentSolver(linear);
        // min is root
        assertEquals(2.0, solver.solve(2.0, 3.0, 2.5), 1E-6);
    }

    @Test
    public void testSolveWhenMaxIsRoot() throws Exception {
        UnivariateRealFunction linear = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 2;
            }
        };
        BrentSolver solver = new BrentSolver(linear);
        // max is root
        assertEquals(2.0, solver.solve(0.0, 2.0, 1.0), 1E-6);
    }

    @Test
    public void testSolveWithMaxIterationsExceeded() throws Exception {
        UnivariateRealFunction constantOne = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return 1.0; // Never zero
            }
        };
        BrentSolver solver = new BrentSolver(constantOne);
        solver.setMaximalIterationCount(10); // Low iteration count to trigger exception
        try {
            solver.solve(0.0, 1.0);
            fail("Expected MaxIterationsExceededException");
        } catch (MaxIterationsExceededException e) {
            // Expected
        } catch (FunctionEvaluationException e) {
            fail("Unexpected FunctionEvaluationException: " + e.getMessage());
        }
    }

    @Test
    public void testSolveWithFunctionEvaluationException() throws Exception {
        UnivariateRealFunction errorFunction = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                if (x > 0.5) {
                    throw new FunctionEvaluationException(x);
                }
                return x - 0.2; // Root at 0.2
            }
        };
        BrentSolver solver = new BrentSolver(errorFunction);
        try {
            solver.solve(0.0, 1.0); // Interval [0, 1] where x > 0.5 will cause error
            fail("Expected FunctionEvaluationException");
        } catch (FunctionEvaluationException e) {
            // Expected
            assertEquals(0.0, e.getArgument(), 1E-9); // The first evaluation point is 0.0
        } catch (MaxIterationsExceededException e) {
            fail("Unexpected MaxIterationsExceededException: " + e.getMessage());
        }
    }

    @Test
    public void testSolveInvalidInitialGuessTooLow() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        BrentSolver solver = new BrentSolver(f);
        try {
            solver.solve(0.0, 1.0, -1.0); // initial < min
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
            assertTrue(e.getMessage().contains("Initial guess is not in search interval."));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testSolveInvalidInitialGuessTooHigh() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        BrentSolver solver = new BrentSolver(f);
        try {
            solver.solve(0.0, 1.0, 2.0); // initial > max
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
            assertTrue(e.getMessage().contains("Initial guess is not in search interval."));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testSolveInvalidIntervalMinNotLessThanMax() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        BrentSolver solver = new BrentSolver(f);
        try {
            solver.solve(1.0, 0.0); // min > max
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
            assertTrue(e.getMessage().contains("interval."));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testSolveInvalidIntervalMinEqualsMax() throws Exception {
        UnivariateRealFunction f = new SinFunction();
        BrentSolver solver = new BrentSolver(f);
        try {
            solver.solve(1.0, 1.0); // min == max
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
            assertTrue(e.getMessage().contains("interval."));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testSolveNoBracketing() throws Exception {
        UnivariateRealFunction constantPositive = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return 5.0;
            }
        };
        BrentSolver solver = new BrentSolver(constantPositive);
        try {
            solver.solve(0.0, 1.0); // f(0)=5, f(1)=5. No bracketing.
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
            assertTrue(e.getMessage().contains("Function values at endpoints do not have different signs."));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testSolveWithInitialGuessCloserToRoot() throws Exception {
        UnivariateRealFunction quadratic = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4; // Root at 2
            }
        };
        BrentSolver solver = new BrentSolver(quadratic);
        // Interval [0, 5]. Root is at 2.
        // Initial guess 2.1 is closer to 2 than 0.
        assertEquals(2.0, solver.solve(0.0, 5.0, 2.1), 1E-6);
    }

    @Test
    public void testSolveWithInitialGuessFartherFromRoot() throws Exception {
        UnivariateRealFunction quadratic = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4; // Root at 2
            }
        };
        BrentSolver solver = new BrentSolver(quadratic);
        // Interval [0, 5]. Root is at 2.
        // Initial guess 4.0 is farther from 2 than 0.
        assertEquals(2.0, solver.solve(0.0, 5.0, 4.0), 1E-6);
    }

    @Test
    public void testSolveWithNegativeRoot() throws Exception {
        UnivariateRealFunction quadratic = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4; // Roots at -2 and 2
            }
        };
        BrentSolver solver = new BrentSolver(quadratic);
        // Interval [-5, 0]. Root is at -2.
        assertEquals(-2.0, solver.solve(-5.0, 0.0), 1E-6);
    }
    
    @Test
    public void testSolveWithInitialGuessForNegativeRoot() throws Exception {
        UnivariateRealFunction quadratic = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4; // Roots at -2 and 2
            }
        };
        BrentSolver solver = new BrentSolver(quadratic);
        // Interval [-5, 0]. Root is at -2.
        // Initial guess -1.0, yInitial = -3.
        // min = -5, yMin = 21. max = 0, yMax = -4.
        // yInitial * yMin = -3 * 21 < 0. This is not the case for this branch.
        // Let's try solve(-5, 0, -1).
        // yMin=21, yMax=-4, yInitial=-3.
        // yInitial * yMin = -3 * 21 < 0. true. Calls `solve(min, yMin, initial, yInitial, min, yMin)` which is `solve(-5, 21, -1, -3, -5, 21)`.
        assertEquals(-2.0, solver.solve(-5.0, 0.0, -1.0), 1E-6);
    }

    @Test
    public void testSolveWithSmallIntervalAndRoot() throws Exception {
        UnivariateRealFunction linear = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 2.0000001;
            }
        };
        BrentSolver solver = new BrentSolver(linear);
        solver.setFunctionValueAccuracy(1e-8); // Lower accuracy to ensure it finds the root
        assertEquals(2.0000001, solver.solve(2.0, 2.0000002), 1E-9);
    }

    @Test
    public void testSolveWithVerySmallValues() throws Exception {
        UnivariateRealFunction smallLinear = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * 1e-10; // Root at 0
            }
        };
        BrentSolver solver = new BrentSolver(smallLinear);
        solver.setAbsoluteAccuracy(1e-15);
        solver.setRelativeAccuracy(1e-15);
        solver.setFunctionValueAccuracy(1e-15);
        assertEquals(0.0, solver.solve(-1e-9, 1e-9), 1E-15);
    }
    
    @Test
    public void testSolveWithLargeValues() throws Exception {
        UnivariateRealFunction largeLinear = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * 1e10 - 1e10; // Root at 1
            }
        };
        BrentSolver solver = new BrentSolver(largeLinear);
        solver.setAbsoluteAccuracy(1e-10);
        solver.setRelativeAccuracy(1e-10);
        solver.setFunctionValueAccuracy(1e-10);
        assertEquals(1.0, solver.solve(0.0, 2.0), 1E-10);
    }
    
    @Test
    public void testSolveWithZeroAtMin() throws Exception {
        UnivariateRealFunction linear = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 1.0;
            }
        };
        BrentSolver solver = new BrentSolver(linear);
        solver.setFunctionValueAccuracy(1E-12);
        assertEquals(1.0, solver.solve(1.0, 5.0), 1E-9);
    }

    @Test
    public void testSolveWithZeroAtMax() throws Exception {
        UnivariateRealFunction linear = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 1.0;
            }
        };
        BrentSolver solver = new BrentSolver(linear);
        solver.setFunctionValueAccuracy(1E-12);
        assertEquals(1.0, solver.solve(0.0, 1.0), 1E-9);
    }

    @Test
    public void testSolveWithHighMaximalIterationCount() throws Exception {
        UnivariateRealFunction quadratic = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4;
            }
        };
        BrentSolver solver = new BrentSolver(quadratic);
        // Set a high iteration count to ensure it doesn't fail due to too few iterations for a complex function
        solver.setMaximalIterationCount(1000); 
        assertEquals(2.0, solver.solve(0.0, 5.0), 1E-6);
    }

    @Test
    public void testSolveWithDefaultValues() throws Exception {
        UnivariateRealFunction quadratic = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 4;
            }
        };
        BrentSolver solver = new BrentSolver(quadratic);
        // Default constructor sets default values for accuracy and iterations.
        // 100 iterations, 1E-6 accuracy.
        assertEquals(2.0, solver.solve(0.0, 5.0), 1E-6);
    }
    
    @Test
    public void testSolveWithSinFunction() throws Exception {
        UnivariateRealFunction sin = new SinFunction();
        BrentSolver solver = new BrentSolver(sin);
        // sin(pi) = 0. pi is approximately 3.1415926535...
        // solve(3.0, 3.5) should find pi.
        assertEquals(Math.PI, solver.solve(3.0, 3.5), 1E-6);
    }

    @Test
    public void testSolveWithSinFunctionNegative() throws Exception {
        UnivariateRealFunction sin = new SinFunction();
        BrentSolver solver = new BrentSolver(sin);
        // sin(-pi) = 0. -pi is approximately -3.1415926535...
        // solve(-3.5, -3.0) should find -pi.
        assertEquals(-Math.PI, solver.solve(-3.5, -3.0), 1E-6);
    }
}

// Helper class for tests
class SinFunction implements UnivariateRealFunction {
    public double value(double x) throws FunctionEvaluationException {
        return Math.sin(x);
    }
}
