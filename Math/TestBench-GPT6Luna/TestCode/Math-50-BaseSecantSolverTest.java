package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.util.FastMath;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.MathInternalError;

public class BaseSecantSolverTest {
    @Test
    public void testExactRootAtLowerBound() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double root = solver.solve(100, x -> x + 1.0, -1.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(-1.0, root, 0.0);
    }

    @Test
    public void testExactRootAtUpperBound() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double root = solver.solve(100, x -> x - 2.0, -1.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, 0.0);
    }

    @Test
    public void testExactInteriorRoot() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double root = solver.solve(100, x -> x - 1.0, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, root, 0.0);
    }

    @Test
    public void testLinearRootWithDefaultAccuracy() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double root = solver.solve(100, x -> x - 0.25, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.25, root, 1e-12);
    }

    @Test
    public void testIllinoisSolvesLinearFunction() throws Exception {
        IllinoisSolver solver = new IllinoisSolver();
        double root = solver.solve(100, x -> 2.0 * x - 1.0, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.5, root, 1e-12);
    }

    @Test
    public void testPegasusSolvesLinearFunction() throws Exception {
        PegasusSolver solver = new PegasusSolver();
        double root = solver.solve(100, x -> 2.0 * x - 1.0, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.5, root, 1e-12);
    }

    @Test
    public void testAllowedAnySideReturnsRoot() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-12);
        double root = solver.solve(100, x -> x - 0.3, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.3, root, 1e-9);
    }

    @Test
    public void testAllowedLeftSide() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-12);
        double root = solver.solve(100, x -> x - 0.3, 0.0, 1.0, AllowedSolution.LEFT_SIDE);
        assertTrue(root <= 0.3);
        assertEquals(0.3, root, 1e-9);
    }

    @Test
    public void testAllowedRightSide() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-12);
        double root = solver.solve(100, x -> x - 0.3, 0.0, 1.0, AllowedSolution.RIGHT_SIDE);
        assertTrue(root >= 0.3);
        assertEquals(0.3, root, 1e-9);
    }

    @Test
    public void testAllowedBelowSide() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-12);
        double root = solver.solve(100, x -> x - 0.3, 0.0, 1.0, AllowedSolution.BELOW_SIDE);
        assertTrue(root <= 0.3);
        assertEquals(0.3, root, 1e-9);
    }

    @Test
    public void testAllowedAboveSide() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver(1e-12);
        double root = solver.solve(100, x -> x - 0.3, 0.0, 1.0, AllowedSolution.ABOVE_SIDE);
        assertTrue(root >= 0.3);
        assertEquals(0.3, root, 1e-9);
    }

    @Test
    public void testDefaultIntervalStartOverload() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        double root = solver.solve(100, x -> x - 0.375, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.375, root, 1e-12);
    }
}
