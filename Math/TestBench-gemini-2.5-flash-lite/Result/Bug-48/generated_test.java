package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.util.FastMath;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.MathInternalError;

public class BaseSecantSolverTest {

    // Test case for RegulaFalsiSolver with a simple linear function.
    @Test
    public void testRegulaFalsiLinearFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Root is at x = 2.0
        assertEquals(2.0, solver.solve(100, f, 0.0, 5.0), 1e-6);
    }

    // Test case for IllinoisSolver with a simple linear function.
    @Test
    public void testIllinoisLinearFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 3.0;
            }
        };
        IllinoisSolver solver = new IllinoisSolver();
        // Root is at x = 3.0
        assertEquals(3.0, solver.solve(100, f, 0.0, 5.0), 1e-6);
    }

    // Test case for PegasusSolver with a simple linear function.
    @Test
    public void testPegasusLinearFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 4.0;
            }
        };
        PegasusSolver solver = new PegasusSolver();
        // Root is at x = 4.0
        assertEquals(4.0, solver.solve(100, f, 0.0, 5.0), 1e-6);
    }

    // Test case for RegulaFalsiSolver with a quadratic function.
    @Test
    public void testRegulaFalsiQuadraticFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Roots are at x = 2.0 and x = -2.0. Bracketing [0, 3] should find 2.0
        assertEquals(2.0, solver.solve(100, f, 0.0, 3.0), 1e-6);
    }

    // Test case for IllinoisSolver with a quadratic function.
    @Test
    public void testIllinoisQuadraticFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 9.0;
            }
        };
        IllinoisSolver solver = new IllinoisSolver();
        // Roots are at x = 3.0 and x = -3.0. Bracketing [0, 5] should find 3.0
        assertEquals(3.0, solver.solve(100, f, 0.0, 5.0), 1e-6);
    }

    // Test case for PegasusSolver with a quadratic function.
    @Test
    public void testPegasusQuadraticFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 16.0;
            }
        };
        PegasusSolver solver = new PegasusSolver();
        // Roots are at x = 4.0 and x = -4.0. Bracketing [0, 10] should find 4.0
        assertEquals(4.0, solver.solve(100, f, 0.0, 10.0), 1e-6);
    }

    // Test case with one of the bounds as the root for RegulaFalsiSolver.
    @Test
    public void testRegulaFalsiBoundaryRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Root is at x = 1.0. Providing 1.0 as min bound.
        assertEquals(1.0, solver.solve(100, f, 1.0, 5.0), 1e-6);
        // Root is at x = 5.0. Providing 5.0 as max bound.
        assertEquals(5.0, solver.solve(100, f, 0.0, 5.0), 1e-6);
    }

    // Test case with one of the bounds as the root for IllinoisSolver.
    @Test
    public void testIllinoisBoundaryRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 7.0;
            }
        };
        IllinoisSolver solver = new IllinoisSolver();
        // Root is at x = 7.0. Providing 7.0 as min bound.
        assertEquals(7.0, solver.solve(100, f, 7.0, 10.0), 1e-6);
        // Root is at x = 10.0. Providing 10.0 as max bound.
        assertEquals(10.0, solver.solve(100, f, 0.0, 10.0), 1e-6);
    }

    // Test case with one of the bounds as the root for PegasusSolver.
    @Test
    public void testPegasusBoundaryRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 8.0;
            }
        };
        PegasusSolver solver = new PegasusSolver();
        // Root is at x = 8.0. Providing 8.0 as min bound.
        assertEquals(8.0, solver.solve(100, f, 8.0, 12.0), 1e-6);
        // Root is at x = 12.0. Providing 12.0 as max bound.
        assertEquals(12.0, solver.solve(100, f, 0.0, 12.0), 1e-6);
    }

    // Test case for a cubic function.
    @Test
    public void testRegulaFalsiCubicFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - x - 1.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Root is approximately 1.3247
        assertEquals(1.324717957244746, solver.solve(100, f, 1.0, 2.0), 1e-6);
    }

    // Test case for a trigonometric function.
    @Test
    public void testIllinoisTrigonometricFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return FastMath.cos(x) - x;
            }
        };
        IllinoisSolver solver = new IllinoisSolver();
        // Root is approximately 0.739085
        assertEquals(0.7390851332151607, solver.solve(100, f, 0.0, 1.0), 1e-6);
    }

    // Test case for an exponential function.
    @Test
    public void testPegasusExponentialFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return FastMath.exp(x) - 2.0;
            }
        };
        PegasusSolver solver = new PegasusSolver();
        // Root is ln(2)
        assertEquals(FastMath.log(2.0), solver.solve(100, f, 0.0, 1.0), 1e-6);
    }

    // Test case to check AllowedSolution.LEFT_SIDE.
    @Test
    public void testRegulaFalsiLeftSide() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4.0; // Roots at -2 and 2
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Bracketing [-3, 0]. Root is -2.
        // LEFT_SIDE should return -2.
        assertEquals(-2.0, solver.solve(100, f, -3.0, 0.0, AllowedSolution.LEFT_SIDE), 1e-6);
    }

    // Test case to check AllowedSolution.RIGHT_SIDE.
    @Test
    public void testRegulaFalsiRightSide() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4.0; // Roots at -2 and 2
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Bracketing [0, 3]. Root is 2.
        // RIGHT_SIDE should return 2.
        assertEquals(2.0, solver.solve(100, f, 0.0, 3.0, AllowedSolution.RIGHT_SIDE), 1e-6);
    }

    // Test case to check AllowedSolution.BELOW_SIDE.
    @Test
    public void testRegulaFalsiBelowSide() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 5.0; // Root at 5
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Bracketing [0, 10]. Root is 5.
        // BELOW_SIDE should return 5.
        assertEquals(5.0, solver.solve(100, f, 0.0, 10.0, AllowedSolution.BELOW_SIDE), 1e-6);
    }

    // Test case to check AllowedSolution.ABOVE_SIDE.
    @Test
    public void testRegulaFalsiAboveSide() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 6.0; // Root at 6
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Bracketing [0, 10]. Root is 6.
        // ABOVE_SIDE should return 6.
        assertEquals(6.0, solver.solve(100, f, 0.0, 10.0, AllowedSolution.ABOVE_SIDE), 1e-6);
    }

    // Test case for large interval.
    @Test
    public void testRegulaFalsiLargeInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1e10;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        assertEquals(1e10, solver.solve(100, f, 0.0, 2e10), 1e10 * 1e-6);
    }

    // Test case for small interval.
    @Test
    public void testIllinoisSmallInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1e-10;
            }
        };
        IllinoisSolver solver = new IllinoisSolver();
        assertEquals(1e-10, solver.solve(100, f, 0.0, 1e-9), 1e-10 * 1e-6);
    }

    // Test case with specific accuracy settings.
    @Test
    public void testPegasusCustomAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 0.5;
            }
        };
        PegasusSolver solver = new PegasusSolver(1e-7, 1e-8); // Relative, Absolute accuracy
        assertEquals(0.5, solver.solve(100, f, 0.0, 1.0), 1e-8); // Assert against absolute accuracy
    }

    // Test case where the function value is very close to zero, but not exactly zero.
    @Test
    public void testRegulaFalsiNearZeroFunctionValue() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 1e-7; // Function is a constant close to zero
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-6, 1e-7); // Relative, Absolute, FunctionValue accuracy
        // Should converge based on function value accuracy.
        // The exact value might depend on the solver's internal steps,
        // but it should be within the bracket and close to the root.
        double result = solver.solve(100, f, 0.0, 1.0);
        assertTrue(result >= 0.0 && result <= 1.0);
    }

    // Test case with a function that has a root at a negative value.
    @Test
    public void testIllinoisNegativeRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x + 5.0;
            }
        };
        IllinoisSolver solver = new IllinoisSolver();
        assertEquals(-5.0, solver.solve(100, f, -10.0, 0.0), 1e-6);
    }

    // Test case with a function that has a root near zero.
    @Test
    public void testPegasusRootNearZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1e-7;
            }
        };
        PegasusSolver solver = new PegasusSolver();
        assertEquals(1e-7, solver.solve(100, f, -1e-6, 1e-6), 1e-7 * 1e-6);
    }

    // Test case for Regula Falsi method stuck detection.
    @Test(expected = ConvergenceException.class)
    public void testRegulaFalsiStuck() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                // This function is designed to make Regula Falsi converge slowly or get stuck.
                // A constant function can lead to this.
                return 1.0;
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // The default maxEval is usually high enough to not hit this,
        // but the internal check for x == x1 should trigger.
        // Forcing a scenario where it might get stuck.
        solver.solve(10, f, 0.0, 1.0);
    }

    // Test case for maxEval reached.
    @Test(expected = ConvergenceException.class)
    public void testMaxEvaluationReached() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 2.0; // Root at sqrt(2)
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Use a very small maxEval to ensure it's reached.
        solver.solve(1, f, 0.0, 2.0);
    }

    // Test case with different initial guesses.
    @Test
    public void testRegulaFalsiDifferentStartValues() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 9.0; // Roots at -3 and 3
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Bracketing [0, 5], start value 1.0. Should find 3.0
        assertEquals(3.0, solver.solve(100, f, 0.0, 5.0, 1.0), 1e-6);
        // Bracketing [0, 5], start value 4.0. Should find 3.0
        assertEquals(3.0, solver.solve(100, f, 0.0, 5.0, 4.0), 1e-6);
    }

    // Test case for AllowedSolution.LEFT_SIDE with negative roots.
    @Test
    public void testIllinoisLeftSideNegativeRoots() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 9.0; // Roots at -3 and 3
            }
        };
        IllinoisSolver solver = new IllinoisSolver();
        // Bracketing [-5, 0]. Root is -3.
        // LEFT_SIDE should return -3.
        assertEquals(-3.0, solver.solve(100, f, -5.0, 0.0, AllowedSolution.LEFT_SIDE), 1e-6);
    }

    // Test case for AllowedSolution.RIGHT_SIDE with negative roots.
    @Test
    public void testIllinoisRightSideNegativeRoots() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 9.0; // Roots at -3 and 3
            }
        };
        IllinoisSolver solver = new IllinoisSolver();
        // Bracketing [-4, -1]. Root is -3.
        // RIGHT_SIDE should return -3.
        assertEquals(-3.0, solver.solve(100, f, -4.0, -1.0, AllowedSolution.RIGHT_SIDE), 1e-6);
    }

    // Test with maximum absolute accuracy.
    @Test
    public void testPegasusMaxAbsoluteAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1e-5;
            }
        };
        PegasusSolver solver = new PegasusSolver(1e-10, 1e-5); // Relative, Absolute accuracy
        assertEquals(1e-5, solver.solve(100, f, 0.0, 1.0), 1e-5); // Assert against absolute accuracy
    }

    // Test with maximum relative accuracy.
    @Test
    public void testPegasusMaxRelativeAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 10.0;
            }
        };
        PegasusSolver solver = new PegasusSolver(1e-7, 1e-10); // Relative, Absolute accuracy
        assertEquals(10.0, solver.solve(100, f, 0.0, 20.0), 10.0 * 1e-7); // Assert against relative accuracy
    }

    // Test with a function that crosses zero multiple times in the interval, expecting the first root.
    @Test
    public void testRegulaFalsiMultipleRoots() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return FastMath.sin(x); // Roots at 0, PI, 2*PI, etc.
            }
        };
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        // Bracketing [2.0, 4.0], root at PI (approx 3.14159)
        assertEquals(FastMath.PI, solver.solve(100, f, 2.0, 4.0), 1e-6);
    }

    // Test with a very sensitive function near the root.
    @Test
    public void testIllinoisSensitiveFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return FastMath.pow(x - 1.0, 3); // Root at 1.0, with multiplicity 3
            }
        };
        IllinoisSolver solver = new IllinoisSolver();
        assertEquals(1.0, solver.solve(100, f, 0.0, 2.0), 1e-6);
    }

    // Test with a function that approaches zero from the negative side.
    @Test
    public void testPegasusNegativeApproach() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return -(x - 0.5); // Root at 0.5, negative slope
            }
        };
        PegasusSolver solver = new PegasusSolver();
        assertEquals(0.5, solver.solve(100, f, 0.0, 1.0), 1e-6);
    }
}
