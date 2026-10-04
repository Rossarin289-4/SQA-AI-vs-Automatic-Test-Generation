package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.util.FastMath;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.MathInternalError;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.TooManyEvaluationsException;

public class BaseSecantSolverTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testRegulaFalsiDefault() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testIllinoisDefault() throws Exception {
        final IllinoisSolver solver = new IllinoisSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testPegasusDefault() throws Exception {
        final PegasusSolver solver = new PegasusSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testRegulaFalsiCustomAccuracies() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-8, 1e-10);
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-10);
    }

    @Test
    public void testIllinoisCustomAccuracies() throws Exception {
        final IllinoisSolver solver = new IllinoisSolver(1e-8, 1e-10);
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-10);
    }

    @Test
    public void testPegasusCustomAccuracies() throws Exception {
        final PegasusSolver solver = new PegasusSolver(1e-8, 1e-10);
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-10);
    }

    @Test
    public void testRegulaFalsiHighPrecision() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-15, 1e-15, 1e-15);
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-15);
    }

    @Test
    public void testIllinoisHighPrecision() throws Exception {
        final IllinoisSolver solver = new IllinoisSolver(1e-15, 1e-15, 1e-15);
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-15);
    }

    @Test
    public void testPegasusHighPrecision() throws Exception {
        final PegasusSolver solver = new PegasusSolver(1e-15, 1e-15, 1e-15);
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-15);
    }

    @Test
    public void testExactRootAtMin() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 2.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testExactRootAtMax() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testWithStartValue() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, 3.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testAllowedSolutionAnySide() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testAllowedSolutionLeftSide() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction h = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1; // Root at x = 1
            }
        };
        double result = solver.solve(100, h, 0.0, 5.0, AllowedSolution.LEFT_SIDE);
        assertTrue(result <= 1.0 + solver.getAbsoluteAccuracy());
    }

    @Test
    public void testAllowedSolutionRightSide() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1; // Root at x = 1
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.RIGHT_SIDE);
        assertTrue(result >= 1.0 - solver.getAbsoluteAccuracy());
    }

    @Test
    public void testAllowedSolutionBelowSide() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1; // Root at x = 1
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.BELOW_SIDE);
        assertTrue(f.value(result) <= 0.0 + solver.getFunctionValueAccuracy());
    }

    @Test
    public void testAllowedSolutionAboveSide() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1; // Root at x = 1
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ABOVE_SIDE);
        assertTrue(f.value(result) >= 0.0 - solver.getFunctionValueAccuracy());
    }

    @Test
    public void testLargeInterval() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        try {
            solver.solve(100, f, -1000.0, 1000.0, AllowedSolution.ANY_SIDE);
            fail("Expected NoBracketingException for non-bracketing interval.");
        } catch (final NoBracketingException e) {
            // Expected exception
        }
    }

    @Test
    public void testFunctionWithNegativeRoot() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Roots at x = 2 and x = -2
            }
        };
        double result = solver.solve(100, f, -5.0, 0.0, AllowedSolution.ANY_SIDE);
        assertEquals(-2.0, result, 1e-6);
    }

    @Test
    public void testComplexFunction() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 2 * x * x - x + 2; // Roots at x = -1, 1, 2
            }
        };
        double result = solver.solve(100, f, 0.0, 1.5, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testMaxEvalExceeded() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        try {
            solver.solve(1, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
            fail("Expected TooManyEvaluationsException for maxEval = 1.");
        } catch (final TooManyEvaluationsException e) {
            // Expected exception
        }
    }

    @Test
    public void testInitialBracketDoesNotBracketRoot() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1; // No real roots
            }
        };
        try {
            solver.solve(100, f, 1.0, 5.0, AllowedSolution.ANY_SIDE);
            fail("Expected NoBracketingException for non-bracketing interval.");
        } catch (final NoBracketingException e) {
            // Expected exception
        }
    }

    @Test
    public void testFunctionValueZeroAtStartValue() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 3; // Root at x = 3
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, 3.0, AllowedSolution.ANY_SIDE);
        assertEquals(3.0, result, 1e-6);
    }

    @Test
    public void testVerySmallAbsoluteAccuracy() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-15, 1e-15);
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - Math.PI; // Root at PI
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(Math.PI, result, 1e-15);
    }

    @Test
    public void testZeroMaxEval() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2;
            }
        };
        try {
            solver.solve(0, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
            fail("Expected TooManyEvaluationsException for maxEval = 0.");
        } catch (final TooManyEvaluationsException e) {
            // Expected exception
        }
    }

    @Test
    public void testIllinoisMethodLogic() throws Exception {
        final IllinoisSolver solver = new IllinoisSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testPegasusMethodLogic() throws Exception {
        final PegasusSolver solver = new PegasusSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testRegulaFalsiMethodLogic() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // Root at x = 2
            }
        };
        double result = solver.solve(100, f, 0.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testRootCloseToZero() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1e-7; // Root at 1e-7
            }
        };
        double result = solver.solve(100, f, -1.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(1e-7, result, 1e-10);
    }

    @Test
    public void testLargeAndSmallValuesInInterval() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1000.0; // Root at 1000
            }
        };
        double result = solver.solve(100, f, -1e9, 1e9, AllowedSolution.ANY_SIDE);
        assertEquals(1000.0, result, 1e-6);
    }

    @Test
    public void testFunctionWithExponent() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return FastMath.exp(x) - 2; // Root at ln(2)
            }
        };
        double result = solver.solve(100, f, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(FastMath.log(2.0), result, 1e-6);
    }

    @Test
    public void testFunctionWithLogarithm() throws Exception {
        final RegulaFalsiSolver solver = new RegulaFalsiSolver();
        final UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return FastMath.log(x) - 1; // Root at e
            }
        };
        double result = solver.solve(100, f, 1.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(FastMath.E, result, 1e-6);
    }
}
