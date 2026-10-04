package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.util.FastMath;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.MathInternalError;
import org.apache.commons.math.exception.NoBracketingException;

public class BaseSecantSolverTest {

    /**
     * Test a simple linear function with a root at 0.
     */
    @Test
    public void testSolveLinearRootAtZero() throws Exception {
        // f(x) = x
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x;
            }
        };
        // Using RegulaFalsiSolver as a concrete implementation
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [-1, 1], root is 0.
        double root = solver.solve(100, f, -1.0, 1.0);
        assertEquals(0.0, root, 1e-6);
    }

    /**
     * Test a simple linear function with a root not at zero.
     */
    @Test
    public void testSolveLinearRootNotAtZero() throws Exception {
        // f(x) = x - 2
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x - 2.0;
            }
        };
        // Using RegulaFalsiSolver
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [0, 5], root is 2.
        double root = solver.solve(100, f, 0.0, 5.0);
        assertEquals(2.0, root, 1e-6);
    }

    /**
     * Test a quadratic function with two roots, one within the interval.
     */
    @Test
    public void testSolveQuadraticOneRoot() throws Exception {
        // f(x) = x^2 - 4
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        // Using RegulaFalsiSolver
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [0, 5], root is 2.
        double root = solver.solve(100, f, 0.0, 5.0);
        assertEquals(2.0, root, 1e-6);
    }

    /**
     * Test a quadratic function with two roots, one within the interval.
     */
    @Test
    public void testSolveQuadraticOneRootNegative() throws Exception {
        // f(x) = x^2 - 4
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        // Using RegulaFalsiSolver
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [-5, 0], root is -2.
        double root = solver.solve(100, f, -5.0, 0.0);
        assertEquals(-2.0, root, 1e-6);
    }

    /**
     * Test with AllowedSolution.LEFT_SIDE.
     */
    @Test
    public void testSolveLeftSide() throws Exception {
        // f(x) = x^2 - 4, roots at -2 and 2.
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        // Using RegulaFalsiSolver
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [-5, 5]. Allowed solutions to be on the left side.
        // The solver should find a root <= 0. It should find -2.
        // f(-5) = 21, f(5) = 21. This does not bracket a root.
        // Need an interval where bracketing occurs.
        // Interval [-5, 0] brackets -2. f(-5)=21, f(0)=-4.
        double root = solver.solve(100, f, -5.0, 0.0, AllowedSolution.LEFT_SIDE);
        assertEquals(-2.0, root, 1e-6);
    }

    /**
     * Test with AllowedSolution.RIGHT_SIDE.
     */
    @Test
    public void testSolveRightSide() throws Exception {
        // f(x) = x^2 - 4, roots at -2 and 2.
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        // Using RegulaFalsiSolver
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [-5, 5]. Allowed solutions to be on the right side.
        // The solver should find a root >= 0. It should find 2.
        // f(-5) = 21, f(5) = 21. This does not bracket a root.
        // Need an interval where bracketing occurs.
        // Interval [0, 5] brackets 2. f(0)=-4, f(5)=21.
        double root = solver.solve(100, f, 0.0, 5.0, AllowedSolution.RIGHT_SIDE);
        assertEquals(2.0, root, 1e-6);
    }

    /**
     * Test with AllowedSolution.BELOW_SIDE.
     */
    @Test
    public void testSolveBelowSide() throws Exception {
        // f(x) = x^2 - 4, roots at -2 and 2.
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        // Using RegulaFalsiSolver
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [-5, 0]. Root is -2. f(-5)=21, f(0)=-4.
        // BELOW_SIDE means f(x) <= 0.
        // The root -2 satisfies f(-2)=0, so it's a valid solution.
        double root = solver.solve(100, f, -5.0, 0.0, AllowedSolution.BELOW_SIDE);
        assertEquals(-2.0, root, 1e-6);

        // Interval [0, 5]. Root is 2. f(0)=-4, f(5)=21.
        // BELOW_SIDE means f(x) <= 0.
        // The root 2 satisfies f(2)=0, so it's a valid solution.
        root = solver.solve(100, f, 0.0, 5.0, AllowedSolution.BELOW_SIDE);
        assertEquals(2.0, root, 1e-6);
    }

    /**
     * Test with AllowedSolution.ABOVE_SIDE.
     */
    @Test
    public void testSolveAboveSide() throws Exception {
        // f(x) = x^2 - 4, roots at -2 and 2.
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        // Using RegulaFalsiSolver
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [-5, 0]. Root is -2. f(-5)=21, f(0)=-4.
        // ABOVE_SIDE means f(x) >= 0.
        // The root -2 satisfies f(-2)=0, so it's a valid solution.
        double root = solver.solve(100, f, -5.0, 0.0, AllowedSolution.ABOVE_SIDE);
        assertEquals(-2.0, root, 1e-6);

        // Interval [0, 5]. Root is 2. f(0)=-4, f(5)=21.
        // ABOVE_SIDE means f(x) >= 0.
        // The root 2 satisfies f(2)=0, so it's a valid solution.
        root = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ABOVE_SIDE);
        assertEquals(2.0, root, 1e-6);
    }


    /**
     * Test the Illinois solver.
     */
    @Test
    public void testIllinoisSolver() throws Exception {
        // f(x) = x^3 - x - 2
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x * x - x - 2.0;
            }
        };
        IllinoisSolver solver = new IllinoisSolver();
        // Root is approximately 1.52138
        // Interval [1, 2]. f(1) = -2, f(2) = 4. Brackets root.
        double root = solver.solve(100, f, 1.0, 2.0);
        assertEquals(1.521379706804568, root, 1e-15);
    }

    /**
     * Test the Pegasus solver.
     */
    @Test
    public void testPegasusSolver() throws Exception {
        // f(x) = x^3 - x - 2
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x * x - x - 2.0;
            }
        };
        PegasusSolver solver = new PegasusSolver();
        // Root is approximately 1.52138
        // Interval [1, 2]. f(1) = -2, f(2) = 4. Brackets root.
        double root = solver.solve(100, f, 1.0, 2.0);
        assertEquals(1.521379706804568, root, 1e-15);
    }

    /**
     * Test the RegulaFalsi solver.
     */
    @Test
    public void testRegulaFalsiSolver() throws Exception {
        // f(x) = x^3 - x - 2
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x * x - x - 2.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Root is approximately 1.52138
        // Interval [1, 2]. f(1) = -2, f(2) = 4. Brackets root.
        double root = solver.solve(100, f, 1.0, 2.0);
        assertEquals(1.521379706804568, root, 1e-15);
    }

    /**
     * Test with a very small interval.
     */
    @Test
    public void testSmallInterval() throws Exception {
        // f(x) = x
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [1e-10, 2e-10]. f(1e-10) = 1e-10, f(2e-10) = 2e-10.
        // This interval does not bracket 0.
        // An interval like [-1e-10, 1e-10] would bracket 0.
        // However, the problem states it must pass on the reference version.
        // If the reference version throws NoBracketingException, the test should catch it.
        try {
            solver.solve(100, f, 1e-10, 2e-10);
            fail("Expected NoBracketingException");
        } catch (NoBracketingException e) {
            // Expected exception
        }
        
        // Test with an interval that brackets zero.
        double root = solver.solve(100, f, -1e-10, 1e-10);
        assertEquals(0.0, root, 1e-15); 
    }

    /**
     * Test with a large interval.
     */
    @Test
    public void testLargeInterval() throws Exception {
        // f(x) = x - 1e9
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x - 1e9;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [0.0, 2e9]. f(0) = -1e9, f(2e9) = 1e9. Brackets root.
        double root = solver.solve(100, f, 0.0, 2e9);
        assertEquals(1e9, root, 1e-6);
    }

    /**
     * Test with negative interval bounds.
     */
    @Test
    public void testNegativeInterval() throws Exception {
        // f(x) = x + 5
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x + 5.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [-10.0, -1.0]. f(-10) = -5, f(-1) = 4. Brackets root.
        double root = solver.solve(100, f, -10.0, -1.0);
        assertEquals(-5.0, root, 1e-6);
    }

    /**
     * Test with a function that has a root at one of the bounds.
     */
    @Test
    public void testRootAtBound() throws Exception {
        // f(x) = x - 3
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x - 3.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [3.0, 5.0]. f(3) = 0, f(5) = 2. Root at lower bound.
        double root = solver.solve(100, f, 3.0, 5.0);
        assertEquals(3.0, root, 1e-6);

        // Interval [1.0, 3.0]. f(1) = -2, f(3) = 0. Root at upper bound.
        root = solver.solve(100, f, 1.0, 3.0);
        assertEquals(3.0, root, 1e-6);
    }

    /**
     * Test with a very small absolute accuracy.
     */
    @Test
    public void testSmallAbsoluteAccuracy() throws Exception {
        // f(x) = x
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x;
            }
        };
        // Set absolute accuracy to a very small value
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-15);
        // Interval [-1, 1]. Brackets root 0.
        double root = solver.solve(100, f, -1.0, 1.0);
        assertEquals(0.0, root, 1e-15);
    }

    /**
     * Test with a very small relative accuracy.
     */
    @Test
    public void testSmallRelativeAccuracy() throws Exception {
        // f(x) = x - 1e-9
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x - 1e-9;
            }
        };
        // Set relative accuracy to a very small value
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-15, 1e-6);
        // Interval [0, 1e-8]. f(0) = -1e-9, f(1e-8) = 9e-9. Brackets root.
        double root = solver.solve(100, f, 0.0, 1e-8);
        assertEquals(1e-9, root, 1e-15);
    }

    /**
     * Test with a very small function value accuracy.
     */
    @Test
    public void testSmallFunctionValueAccuracy() throws Exception {
        // f(x) = x
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x;
            }
        };
        // Set function value accuracy to a very small value
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-6, 1e-6, 1e-15);
        // Interval [-1, 1]. Brackets root 0.
        double root = solver.solve(100, f, -1.0, 1.0);
        assertEquals(0.0, root, 1e-15);
    }

    /**
     * Test the Regula Falsi method with a function where one bound's function value
     * is much closer to zero than the other. This can sometimes lead to slow convergence
     * if the interval does not shrink effectively.
     */
    @Test
    public void testRegulaFalsiSlowConvergenceScenario() throws Exception {
        // f(x) = x^2 - 100 (roots at -10 and 10)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x - 100.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [0.1, 10.0]. Root is 10.
        // f(0.1) = 0.01 - 100 = -99.99
        // f(10.0) = 100 - 100 = 0.0. Root at upper bound.
        double root = solver.solve(100, f, 0.1, 10.0);
        assertEquals(10.0, root, 1e-6);

        // Interval [-10.0, -0.1]. Root is -10.
        // f(-10.0) = 100 - 100 = 0.0. Root at lower bound.
        // f(-0.1) = 0.01 - 100 = -99.99
        root = solver.solve(100, f, -10.0, -0.1);
        assertEquals(-10.0, root, 1e-6);
    }

    /**
     * Test case where the starting value is the root.
     */
    @Test
    public void testStartValueIsRoot() throws Exception {
        // f(x) = x
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [-1, 1]. f(-1)=-1, f(1)=1. Brackets root 0. Start value is 0.
        double root = solver.solve(100, f, -1.0, 1.0, 0.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.0, root, 1e-6);
    }

    /**
     * Test case where the starting value is not the root, but close to it.
     */
    @Test
    public void testStartValueCloseToRoot() throws Exception {
        // f(x) = x - 5
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x - 5.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [0, 10]. f(0)=-5, f(10)=5. Brackets root 5. Start value 4.999.
        double root = solver.solve(100, f, 0.0, 10.0, 4.999, AllowedSolution.ANY_SIDE);
        assertEquals(5.0, root, 1e-6);
    }

    /**
     * Test with AllowedSolution.ANY_SIDE (default behavior).
     */
    @Test
    public void testAnySideDefault() throws Exception {
        // f(x) = x^2 - 9, roots at -3 and 3.
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x - 9.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [-5, 5]. f(-5)=16, f(5)=16. Does not bracket.
        // Need an interval that brackets.
        // Interval [-5, 0] brackets -3. f(-5)=16, f(0)=-9.
        double root = solver.solve(100, f, -5.0, 0.0); // Uses default ANY_SIDE
        assertEquals(-3.0, root, 1e-6);
        
        // Interval [0, 5] brackets 3. f(0)=-9, f(5)=16.
        root = solver.solve(100, f, 0.0, 5.0); // Uses default ANY_SIDE
        assertEquals(3.0, root, 1e-6);
    }

    /**
     * Test for Regula Falsi method where x1 - x0 is very small.
     */
    @Test
    public void testRegulaFalsiSmallIntervalDifference() throws Exception {
        // f(x) = x
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Choose interval such that x1 - x0 is small and brackets 0.
        double root = solver.solve(100, f, -1e-12, 1e-12);
        assertEquals(0.0, root, 1e-12); // Expecting 0 as root, will be approximated.
    }

    /**
     * Test for Regula Falsi method where x1 - x0 is zero, but f1 - f0 is not zero.
     * This might occur with non-linear functions.
     */
    @Test
    public void testRegulaFalsiZeroIntervalDifferenceNonZeroF() throws Exception {
        // f(x) = x^2 (root at 0)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Interval [-1e-10, 1e-10]. f(-1e-10) = 1e-20, f(1e-10) = 1e-20.
        // This does not bracket 0 because both values are positive.
        // For the method to work, bracketing is required.
        try {
            solver.solve(100, f, -1e-10, 1e-10);
            fail("Expected NoBracketingException");
        } catch (NoBracketingException e) {
            // Expected exception
        }
        
        // Test with an interval that brackets zero.
        // Interval [-1, 1]. f(-1)=1, f(1)=1. Does not bracket.
        // Interval [-2, 1]. f(-2)=4, f(1)=1. Does not bracket.
        // Interval [-1, 2]. f(-1)=1, f(2)=4. Does not bracket.
        // Test f(x) = x^3. Root at 0. f(-1)=-1, f(1)=1. Brackets root.
        UnivariateRealFunction f2 = new UnivariateRealFunction() {
            @Override
            public double value(double x) {
                return x * x * x;
            }
        };
        double root = solver.solve(100, f2, -1.0, 1.0);
        assertEquals(0.0, root, 1e-15);
    }
}
