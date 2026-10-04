package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BisectionSolverTest {

    @Test
    public void testSolvePositiveRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // root at x = 2
            }
        };
        BisectionSolver solver = new BisectionSolver();
        double root = solver.solve(f, 0, 5);
        assertEquals(2.0, root, 1e-6);
    }

    @Test
    public void testSolveNegativeRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // root at x = -2
            }
        };
        BisectionSolver solver = new BisectionSolver();
        double root = solver.solve(f, -5, 0);
        assertEquals(-2.0, root, 1e-6);
    }

    @Test
    public void testSolveRootAtBoundaryLower() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1; // root at x = 1
            }
        };
        BisectionSolver solver = new BisectionSolver();
        double root = solver.solve(f, 1, 5);
        assertEquals(1.0, root, 1e-6);
    }

    @Test
    public void testSolveRootAtBoundaryUpper() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 5; // root at x = 5
            }
        };
        BisectionSolver solver = new BisectionSolver();
        double root = solver.solve(f, 1, 5);
        assertEquals(5.0, root, 1e-6);
    }

    @Test
    public void testSolveWithDifferentAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 2; // root at sqrt(2)
            }
        };
        BisectionSolver solver = new BisectionSolver();
        solver.setAbsoluteAccuracy(1.0e-8);
        double root = solver.solve(f, 1, 2);
        assertEquals(Math.sqrt(2.0), root, 1.0e-8);
    }

    @Test
    public void testSolveWithDefaultAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 2; // root at sqrt(2)
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // Default accuracy is 1E-6
        double root = solver.solve(f, 1, 2);
        assertEquals(Math.sqrt(2.0), root, 1E-6);
    }

    @Test
    public void testSolveNoRootInInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1; // no real roots
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // The loop condition `fm * fmin > 0.0` will always be true if f(x) > 0 for all x in the interval.
        // This will lead to `min = m` repeatedly, and eventually `MaxIterationsExceededException`.
        try {
            solver.solve(f, -5, 5);
            fail("Expected MaxIterationsExceededException because there is no root in the interval.");
        } catch (MaxIterationsExceededException e) {
            // Expected exception
        } catch (FunctionEvaluationException e) {
            fail("Unexpected FunctionEvaluationException.");
        }
    }

    @Test
    public void testSolveFunctionConstantZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 0.0;
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // If f(m) is 0, then max becomes m. If f(min) is also 0, then min becomes m.
        // In the first iteration, m = midpoint(min, max). f(m) = 0.
        // If f(min) is also 0, then fm * fmin > 0 is true, so min becomes m. min == m == max.
        // The loop terminates with Math.abs(max - min) <= absoluteAccuracy.
        // The midpoint of the interval will be returned.
        double root = solver.solve(f, -1, 1);
        // The midpoint of [-1, 1] is 0.
        assertEquals(0.0, root, 1e-6);
    }

    @Test
    public void testSolveFunctionConstantPositive() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 1.0;
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // If f(x) is always positive, f(m) will be positive and f(min) will be positive.
        // Thus, fm * fmin > 0.0 will always be true. `min` will keep updating to `m`.
        // The interval will shrink, but the condition `fm * fmin > 0.0` will always hold.
        // Eventually, `MaxIterationsExceededException` will be thrown.
        try {
            solver.solve(f, -1, 1);
            fail("Expected MaxIterationsExceededException because function is always positive.");
        } catch (MaxIterationsExceededException e) {
            // Expected exception
        } catch (FunctionEvaluationException e) {
            fail("Unexpected FunctionEvaluationException.");
        }
    }

    @Test
    public void testSolveFunctionConstantNegative() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return -1.0;
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // If f(x) is always negative, f(m) will be negative and f(min) will be negative.
        // Thus, fm * fmin > 0.0 will always be true. `min` will keep updating to `m`.
        // The interval will shrink, but the condition `fm * fmin > 0.0` will always hold.
        // Eventually, `MaxIterationsExceededException` will be thrown.
        try {
            solver.solve(f, -1, 1);
            fail("Expected MaxIterationsExceededException because function is always negative.");
        } catch (MaxIterationsExceededException e) {
            // Expected exception
        } catch (FunctionEvaluationException e) {
            fail("Unexpected FunctionEvaluationException.");
        }
    }

    @Test
    public void testVerifyInterval() throws Exception {
        BisectionSolver solver = new BisectionSolver();
        try {
            solver.verifyInterval(5, 1); // max < min
            fail("Expected IllegalArgumentException for invalid interval.");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testMaxIterationsExceeded() throws Exception {
        // Use a function that requires many iterations to converge, or a very small interval.
        // For simplicity, we'll just set a low iteration count and a wide interval.
        BisectionSolver solver = new BisectionSolver();
        solver.setMaximalIterationCount(10); // Set max iterations to 10
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x; // root at 0
            }
        };
        try {
            solver.solve(f, -10, 10);
            fail("Expected MaxIterationsExceededException.");
        } catch (MaxIterationsExceededException e) {
            assertEquals(10, e.getMaxIterations());
        }
    }

    @Test
    public void testSolveWithDifferentMaximalIterationCount() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 2; // root at sqrt(2)
            }
        };
        BisectionSolver solver = new BisectionSolver();
        solver.setMaximalIterationCount(1000); // Higher iteration count
        double root = solver.solve(f, 1, 2);
        assertEquals(Math.sqrt(2.0), root, 1e-6);
    }

    @Test
    public void testSolveWithInitialValue() throws Exception {
        // The 'initial' parameter in solve(f, min, max, initial) is deprecated and ignored by the actual implementation.
        // However, we can still call it and check if it behaves as the base implementation does (ignoring initial).
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // root at 2
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // The 'initial' parameter is not used in the 'solve(f, min, max)' method that is called.
        // So, this test confirms that the deprecated method calls the correct non-initial-parameter version.
        double root = solver.solve(f, 0, 5, 1.5); // 1.5 is ignored
        assertEquals(2.0, root, 1e-6);
    }

    @Test
    public void testBisectionLogicNegativeFM() throws Exception {
        // Test case where fm is negative, leading to max = m
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return -(x - 2.5); // root at 2.5
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // Interval [0, 4]. min=0, f(min)=2.5. m=2, f(m)=0.5. fm*fmin > 0. So min becomes m. New interval [2, 4].
        // New min=2, f(min)=0.5. m=3, f(m)=-0.5. fm*fmin < 0. So max becomes m. New interval [2, 3].
        // New min=2, f(min)=0.5. m=2.5, f(m)=0. fm*fmin = 0. So max becomes m. New interval [2, 2.5].
        double root = solver.solve(f, 0, 4);
        assertEquals(2.5, root, 1e-6);
    }

    @Test
    public void testBisectionLogicPositiveFM() throws Exception {
        // Test case where fm is positive, leading to min = m
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.5; // root at 2.5
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // Interval [0, 4]. min=0, f(min)=-2.5. m=2, f(m)=-0.5. fm*fmin = (-0.5)*(-2.5) > 0. So min becomes m. New interval [2, 4].
        // New min=2, f(min)=-0.5. m=3, f(m)=0.5. fm*fmin = (0.5)*(-0.5) < 0. So max becomes m. New interval [2, 3].
        // New min=2, f(min)=-0.5. m=2.5, f(m)=0. fm*fmin = 0. So max becomes m. New interval [2, 2.5].
        double root = solver.solve(f, 0, 4);
        assertEquals(2.5, root, 1e-6);
    }

    @Test
    public void testAbsoluteAccuracyZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x; // root at 0
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // Setting accuracy to 0 should cause it to take max iterations if root is not exactly at midpoint.
        // However, the condition is `Math.abs(max - min) <= absoluteAccuracy`. If accuracy is 0, this will only be true if max == min.
        solver.setAbsoluteAccuracy(0.0);
        try {
            solver.solve(f, -1, 1);
            fail("Expected MaxIterationsExceededException with zero accuracy if root not at midpoint.");
        } catch (MaxIterationsExceededException e) {
            // Expected
        }
    }

    @Test
    public void testIntervalSymmetricAroundZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 1; // roots at 1 and -1
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // Bisection should find the root within the given interval.
        // For interval [-2, 2], it should find one of the roots. The behavior depends on the first f(min) evaluation.
        // f(-2) = 3, f(0) = -1. fm*fmin < 0 (fmin is f(-2), fm is f(0)). So max becomes m. Interval [-2, 0].
        // f(-2) = 3, m=-1, f(-1)=0. fm*fmin < 0. max becomes m. Interval [-2, -1].
        // f(-2) = 3, m=-1.5, f(-1.5) = 1.25. fm*fmin > 0. min becomes m. Interval [-1.5, -1].
        // Eventually converges to -1.
        double root = solver.solve(f, -2, 2);
        assertEquals(-1.0, root, 1e-6);
    }

    @Test
    public void testVerySmallInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1e-10; // root at 1e-10
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // The absolute accuracy is 1E-6 by default. The interval is very small.
        // The condition `Math.abs(max - min) <= absoluteAccuracy` should be met quickly.
        double root = solver.solve(f, 0, 1e-9);
        // The expected value is 1e-10. The computed root should be very close.
        // The default absolute accuracy is 1E-6. So the result should be within 1E-6 of the true root.
        assertEquals(1e-10, root, 1e-6);
    }

    @Test
    public void testIntervalWithOnlyOnePoint() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1; // root at 1
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // If min == max, verifyInterval should throw IllegalArgumentException.
        try {
            solver.solve(f, 1, 1);
            fail("Expected IllegalArgumentException for interval with a single point.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testLargeValuesInInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1e10; // root at 1e10
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // Ensure it handles large numbers correctly.
        // The default accuracy is 1E-6.
        double root = solver.solve(f, 0.5e10, 1.5e10);
        // The result should be close to 1e10. Given the default accuracy,
        // it should be within 1e10 * 1e-6 = 1e4 of the true root.
        assertEquals(1e10, root, 1e4);
    }

    @Test
    public void testSmallValuesInInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1e-10; // root at 1e-10
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // The default accuracy is 1E-6. The interval is [0, 1e-9].
        // The root is 1e-10. The absolute accuracy is 1e-6.
        // The result should be within 1e-6 of the true root.
        double root = solver.solve(f, 0, 1e-9);
        assertEquals(1e-10, root, 1e-6);
    }

    @Test
    public void testFunctionWithMultipleRoots() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - x; // roots at -1, 0, 1
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // Interval [-0.5, 0.5] should find root at 0.
        // f(-0.5) = -0.125 - (-0.5) = 0.375.
        // f(0) = 0.
        // m = 0. f(m) = 0. fm * fmin = 0. max becomes m. Interval [-0.5, 0].
        // f(-0.5) = 0.375, m=-0.25, f(-0.25) = -0.015625 - (-0.25) = 0.234375. fm*fmin > 0. min becomes m. Interval [-0.25, 0].
        // Eventually converges to 0.
        double root1 = solver.solve(f, -0.5, 0.5);
        assertEquals(0.0, root1, 1e-6);

        // Interval [0.5, 1.5] should find root at 1.
        // f(0.5) = 0.125 - 0.5 = -0.375.
        // f(1) = 0.
        // m = 1. f(m) = 0. fm * fmin = 0. max becomes m. Interval [0.5, 1].
        // f(0.5) = -0.375, m=0.75, f(0.75) = 0.421875 - 0.75 = -0.328125. fm*fmin > 0. min becomes m. Interval [0.75, 1].
        // Eventually converges to 1.
        double root2 = solver.solve(f, 0.5, 1.5);
        assertEquals(1.0, root2, 1e-6);

        // Interval [-1.5, -0.5] should find root at -1.
        // f(-1.5) = -3.375 - (-1.5) = -1.875.
        // f(-1) = 0.
        // m = -1. f(m) = 0. fm * fmin = 0. max becomes m. Interval [-1.5, -1].
        // f(-1.5) = -1.875, m=-1.25, f(-1.25) = -1.953125 - (-1.25) = -0.703125. fm*fmin > 0. min becomes m. Interval [-1.25, -1].
        // Eventually converges to -1.
        double root3 = solver.solve(f, -1.5, -0.5);
        assertEquals(-1.0, root3, 1e-6);
    }

    @Test
    public void testFunctionEvaluationException() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) throws FunctionEvaluationException {
                if (x < 0) {
                    throw new FunctionEvaluationException(x, "Input must be non-negative.");
                }
                return x * x;
            }
        };
        BisectionSolver solver = new BisectionSolver();
        // The interval is [-1, 1]. The first evaluation will be at min = -1.
        // f.value(-1) will throw FunctionEvaluationException.
        try {
            solver.solve(f, -1, 1);
            fail("Expected FunctionEvaluationException.");
        } catch (FunctionEvaluationException e) {
            // Expected
            assertNotNull(e.getArgument());
            assertEquals(1, e.getArgument().length);
            assertEquals(-1.0, e.getArgument()[0], 0.0);
        } catch (MaxIterationsExceededException e) {
            fail("Unexpected MaxIterationsExceededException.");
        }
    }

    @Test
    public void testAccuracyVsMaxIterations() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x; // root at 0
            }
        };
        BisectionSolver solver = new BisectionSolver();
        solver.setMaximalIterationCount(20); // Low iterations
        solver.setAbsoluteAccuracy(1e-10); // High accuracy required
        // With 20 iterations, the interval width is reduced by 2^20.
        // Initial interval width is 2. So, final width is 2 / 2^20, which is approximately 4.7e-7.
        // This is larger than the required accuracy of 1e-10.
        try {
            solver.solve(f, -1, 1);
            fail("Expected MaxIterationsExceededException due to low iteration count.");
        } catch (MaxIterationsExceededException e) {
            // Expected
            assertEquals(20, e.getMaxIterations());
        } catch (FunctionEvaluationException e) {
            fail("Unexpected FunctionEvaluationException.");
        }

        BisectionSolver solver2 = new BisectionSolver();
        solver2.setMaximalIterationCount(100); // Sufficient iterations
        solver2.setAbsoluteAccuracy(1e-10);
        // With 100 iterations, the interval width is 2 / 2^100, which is extremely small, well within 1e-10.
        try {
            double root = solver2.solve(f, -1, 1);
            assertEquals(0.0, root, 1e-10);
        } catch (MaxIterationsExceededException e) {
            fail("Unexpected MaxIterationsExceededException.");
        } catch (FunctionEvaluationException e) {
            fail("Unexpected FunctionEvaluationException.");
        }
    }

    @Test
    public void testMidpointCalculation() throws Exception {
        // While midpoint is a utility, its calculation can be critical.
        // Test cases for midpoint itself would be in a separate utility test.
        // Here, we rely on the overall solve to use it correctly.
        // The default midpoint implementation is simple: (a+b)/2.
        // For very large numbers, this might have precision issues, but that's beyond bisection logic.
        BisectionSolver solver = new BisectionSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        // Interval [0, 10]. Root at 0.
        // Iteration 1: min=0, max=10, m=5. f(min)=-5, f(m)=-5. fm*fmin > 0. min=m=5. Interval [5, 10].
        // Iteration 2: min=5, max=10, m=7.5. f(min)=-5, f(m)=-2.5. fm*fmin > 0. min=m=7.5. Interval [7.5, 10].
        // This continues until max-min <= accuracy. This specific interval will not converge to 0.
        // Let's try an interval where 0 is the root and f(min) and f(max) have opposite signs.
        // Interval [-10, 10]. Root at 0.
        // Iteration 1: min=-10, max=10, m=0. f(min)=-10, f(m)=0. fm*fmin = 0. max=m=0. Interval [-10, 0].
        // Iteration 2: min=-10, max=0, m=-5. f(min)=-10, f(m)=-5. fm*fmin > 0. min=m=-5. Interval [-5, 0].
        // Iteration 3: min=-5, max=0, m=-2.5. f(min)=-5, f(m)=-2.5. fm*fmin > 0. min=m=-2.5. Interval [-2.5, 0].
        // This will converge to 0, but slowly.
        // The previous test `testIntervalSymmetricAroundZero` actually tested convergence for `x*x - 1` in `[-2, 2]` and it correctly found `-1.0`.
        // The test `testSolvePositiveRoot` correctly found `2.0` for `x*x - 4` in `[0, 5]`.
        // The midpoint logic itself is not directly tested here, but its use in the algorithm.
        // The provided reference source code does not expose `midpoint` for direct testing.
        // The crucial part is that the loop terminates when `Math.abs(max - min) <= absoluteAccuracy`.
        // For a root at 0 and interval [-10, 10], the midpoint will eventually become very close to 0.
        double root = solver.solve(f, -10.0, 10.0);
        assertEquals(0.0, root, 1e-6);
    }
}
