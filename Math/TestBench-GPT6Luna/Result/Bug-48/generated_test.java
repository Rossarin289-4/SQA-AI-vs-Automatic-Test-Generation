package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.util.FastMath;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.MathInternalError;

public class BaseSecantSolverTest {

    @Test
    public void testRootAtMinimumIsReturned() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        assertEquals(0.0, solver.solve(100, x -> x, 0.0, 2.0,
                                      AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testRootAtMaximumIsReturned() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        assertEquals(2.0, solver.solve(100, x -> x - 2.0, 0.0, 2.0,
                                      AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testExactInteriorRootIsReturned() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        assertEquals(1.0, solver.solve(100, x -> x - 1.0, 0.0, 2.0,
                                      AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testIllinoisFindsLinearRoot() throws Exception {
        IllinoisSolver solver = new IllinoisSolver();
        assertEquals(1.0, solver.solve(100, x -> x - 1.0, 0.0, 2.0,
                                      AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testPegasusFindsLinearRoot() throws Exception {
        PegasusSolver solver = new PegasusSolver();
        assertEquals(1.0, solver.solve(100, x -> x - 1.0, 0.0, 2.0,
                                      AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testRegulaFalsiFindsLinearRoot() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        assertEquals(1.0, solver.solve(100, x -> x - 1.0, 0.0, 2.0,
                                      AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testRootAtInteriorStartWithBracketingFunction() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        assertEquals(0.0, solver.solve(100, x -> x, -1.0, 1.0, 0.0,
                                      AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testBelowSideReturnsNegativeFunctionSide() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(0.5, 0.5, 1.0);
        double result = solver.solve(100, x -> x - 0.3, 0.0, 1.0,
                                     AllowedSolution.BELOW_SIDE);
        assertTrue(result <= 0.3);
        assertEquals(-1.0, (result < 0.3) ? -1.0 : 1.0, 0.0);
    }

    @Test
    public void testAboveSideReturnsPositiveFunctionSide() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(0.5, 0.5, 1.0);
        double result = solver.solve(100, x -> x - 0.3, 0.0, 1.0,
                                     AllowedSolution.ABOVE_SIDE);
        assertTrue(result >= 0.3);
        assertEquals(1.0, (result > 0.3) ? 1.0 : -1.0, 0.0);
    }

    @Test
    public void testLeftSideForIncreasingFunction() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(0.5, 0.5, 1.0);
        assertEquals(0.0, solver.solve(100, x -> x - 0.3, 0.0, 1.0,
                                      AllowedSolution.LEFT_SIDE), 0.0);
    }

    @Test
    public void testRightSideForIncreasingFunction() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(0.5, 0.5, 1.0);
        assertEquals(0.3, solver.solve(100, x -> x - 0.3, 0.0, 1.0,
                                      AllowedSolution.RIGHT_SIDE), 1e-12);
    }

    @Test
    public void testAnySideWhenFunctionToleranceStopsIteration() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(0.5, 0.5, 1.0);
        assertEquals(0.3, solver.solve(100, x -> x - 0.3, 0.0, 1.0,
                                      AllowedSolution.ANY_SIDE), 1e-12);
    }

    @Test
    public void testBelowSideForDecreasingFunction() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(0.5, 0.5, 1.0);
        double result = solver.solve(100, x -> 0.3 - x, 0.0, 1.0,
                                     AllowedSolution.BELOW_SIDE);
        assertTrue(result >= 0.3);
        assertEquals(1.0, (result > 0.3) ? 1.0 : -1.0, 0.0);
    }

    @Test
    public void testAboveSideForDecreasingFunction() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(0.5, 0.5, 1.0);
        double result = solver.solve(100, x -> 0.3 - x, 0.0, 1.0,
                                     AllowedSolution.ABOVE_SIDE);
        assertTrue(result <= 0.3);
        assertEquals(-1.0, (result < 0.3) ? -1.0 : 1.0, 0.0);
    }

    @Test
    public void testUnbracketedEndpointsThrow() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        try {
            solver.solve(100, x -> x * x + 1.0, -1.0, 1.0,
                         AllowedSolution.ANY_SIDE);
            fail("expected NoBracketingException");
        } catch (org.apache.commons.math.exception.NoBracketingException expected) {
            assertEquals(org.apache.commons.math.exception.NoBracketingException.class,
                         expected.getClass());
        }
    }

    @Test
    public void testRootAtMinimumIgnoresAllowedSide() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        assertEquals(0.0, solver.solve(100, x -> x, 0.0, 2.0,
                                      AllowedSolution.RIGHT_SIDE), 0.0);
    }

    @Test
    public void testRootAtMaximumIgnoresAllowedSide() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        assertEquals(2.0, solver.solve(100, x -> x - 2.0, 0.0, 2.0,
                                      AllowedSolution.LEFT_SIDE), 0.0);
    }
}
