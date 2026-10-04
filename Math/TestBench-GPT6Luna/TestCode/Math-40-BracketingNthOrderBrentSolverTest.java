package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.exception.MathInternalError;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.util.FastMath;
import org.apache.commons.math.util.Precision;

public class BracketingNthOrderBrentSolverTest {
    @Test
    public void testDefaultMaximalOrder() throws Exception {
        assertEquals(5, new BracketingNthOrderBrentSolver().getMaximalOrder());
    }

    @Test
    public void testMinimumValidMaximalOrder() throws Exception {
        assertEquals(2, new BracketingNthOrderBrentSolver(1e-6, 2).getMaximalOrder());
    }

    @Test
    public void testLargerMaximalOrder() throws Exception {
        assertEquals(6, new BracketingNthOrderBrentSolver(1e-6, 6).getMaximalOrder());
    }

    @Test
    public void testRejectsMaximalOrderBelowMinimum() throws Exception {
        try {
            new BracketingNthOrderBrentSolver(1e-6, 1);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) {
            assertEquals(2, expected.getMin().intValue());
        }
    }

    @Test
    public void testRejectsZeroMaximalOrder() throws Exception {
        try {
            new BracketingNthOrderBrentSolver(1e-6, 0);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) {
            assertEquals(2, expected.getMin().intValue());
        }
    }

    @Test
    public void testRejectsNegativeMaximalOrder() throws Exception {
        try {
            new BracketingNthOrderBrentSolver(1e-6, -1);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) {
            assertEquals(2, expected.getMin().intValue());
        }
    }

    @Test
    public void testConstructorWithRelativeAccuracy() throws Exception {
        assertEquals(3, new BracketingNthOrderBrentSolver(1e-12, 1e-6, 3).getMaximalOrder());
    }

    @Test
    public void testConstructorWithFunctionValueAccuracy() throws Exception {
        assertEquals(4, new BracketingNthOrderBrentSolver(1e-12, 1e-6, 1e-8, 4).getMaximalOrder());
    }

    @Test
    public void testSolveReturnsExactInitialRoot() throws Exception {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(20, new UnivariateFunction() {
            public double value(double x) {
                return x - 0.25;
            }
        }, 0.0, 1.0, 0.25, AllowedSolution.ANY_SIDE);
        assertEquals(0.25, root, 0.0);
    }

    @Test
    public void testSolveReturnsExactMinimumRoot() throws Exception {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(20, new UnivariateFunction() {
            public double value(double x) {
                return x;
            }
        }, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.0, root, 0.0);
    }

    @Test
    public void testSolveReturnsExactMaximumRoot() throws Exception {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(20, new UnivariateFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        }, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, root, 0.0);
    }

    @Test
    public void testSolveLinearRoot() throws Exception {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(100, new UnivariateFunction() {
            public double value(double x) {
                return x - 0.3;
            }
        }, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.3, root, 2e-6);
    }

    @Test
    public void testSolveQuadraticRoot() throws Exception {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(100, new UnivariateFunction() {
            public double value(double x) {
                return x * x - 0.25;
            }
        }, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.5, root, 2e-6);
    }

    @Test
    public void testSolveWithLeftSideSelection() throws Exception {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-10, 5);
        double root = solver.solve(100, new UnivariateFunction() {
            public double value(double x) {
                return x - 0.3;
            }
        }, 0.0, 1.0, AllowedSolution.LEFT_SIDE);
        assertTrue(root <= 0.3);
        assertEquals(0.3, root, 2e-10);
    }

    @Test
    public void testSolveWithRightSideSelection() throws Exception {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-10, 5);
        double root = solver.solve(100, new UnivariateFunction() {
            public double value(double x) {
                return x - 0.3;
            }
        }, 0.0, 1.0, AllowedSolution.RIGHT_SIDE);
        assertTrue(root >= 0.3);
        assertEquals(0.3, root, 2e-10);
    }

    @Test
    public void testSolveWithBelowSideSelection() throws Exception {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-10, 5);
        double root = solver.solve(100, new UnivariateFunction() {
            public double value(double x) {
                return x - 0.3;
            }
        }, 0.0, 1.0, AllowedSolution.BELOW_SIDE);
        assertTrue(root <= 0.3);
        assertEquals(0.3, root, 2e-10);
    }

    @Test
    public void testSolveWithAboveSideSelection() throws Exception {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-10, 5);
        double root = solver.solve(100, new UnivariateFunction() {
            public double value(double x) {
                return x - 0.3;
            }
        }, 0.0, 1.0, AllowedSolution.ABOVE_SIDE);
        assertTrue(root >= 0.3);
        assertEquals(0.3, root, 2e-10);
    }

    @Test
    public void testRejectsUnbracketedFunction() throws Exception {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        try {
            solver.solve(20, new UnivariateFunction() {
                public double value(double x) {
                    return x * x + 1.0;
                }
            }, -1.0, 1.0, AllowedSolution.ANY_SIDE);
            fail("expected NoBracketingException");
        } catch (NoBracketingException expected) {
            assertTrue(true);
        }
    }
}
