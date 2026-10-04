package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.util.FastMath;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.MathInternalError;

public class BaseSecantSolverTest {
    @Test
    public void testRootAtLowerBound() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        assertEquals(0.0, solver.solve(20, f, 0.0, 2.0, AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testRootAtUpperBound() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2.0; }
        };
        assertEquals(2.0, solver.solve(20, f, 0.0, 2.0, AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testLinearRoot() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 1.0; }
        };
        assertEquals(1.0, solver.solve(20, f, 0.0, 2.0, AllowedSolution.ANY_SIDE), 1e-12);
    }

    @Test
    public void testLinearRootFromAsymmetricBounds() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return 2.0 * x - 3.0; }
        };
        assertEquals(1.5, solver.solve(20, f, -1.0, 4.0, AllowedSolution.ANY_SIDE), 1e-12);
    }

    @Test
    public void testIllinoisSolverFindsLinearRoot() throws Exception {
        IllinoisSolver solver = new IllinoisSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 0.25; }
        };
        assertEquals(0.25, solver.solve(20, f, 0.0, 1.0, AllowedSolution.ANY_SIDE), 1e-12);
    }

    @Test
    public void testPegasusSolverFindsLinearRoot() throws Exception {
        PegasusSolver solver = new PegasusSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 0.75; }
        };
        assertEquals(0.75, solver.solve(20, f, 0.0, 1.0, AllowedSolution.ANY_SIDE), 1e-12);
    }

    @Test
    public void testExplicitStartValueDoesNotChangeExactLinearRoot() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 3.0; }
        };
        assertEquals(3.0, solver.solve(20, f, 0.0, 6.0, 5.0,
                AllowedSolution.ANY_SIDE), 1e-12);
    }

    @Test
    public void testSolveWithoutExplicitStartUsesMidpoint() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 1.0; }
        };
        assertEquals(1.0, solver.solve(20, f, 0.0, 2.0, AllowedSolution.ANY_SIDE), 1e-12);
    }

    @Test
    public void testRootAtNegativeLowerBound() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x + 2.0; }
        };
        assertEquals(-2.0, solver.solve(20, f, -2.0, 1.0, AllowedSolution.RIGHT_SIDE), 0.0);
    }

    @Test
    public void testRootAtNegativeUpperBound() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x + 1.0; }
        };
        assertEquals(-1.0, solver.solve(20, f, -3.0, -1.0, AllowedSolution.LEFT_SIDE), 0.0);
    }

    @Test
    public void testRootAtZeroRegardlessOfSide() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        assertEquals(0.0, solver.solve(20, f, -1.0, 0.0, AllowedSolution.BELOW_SIDE), 0.0);
    }

    @Test
    public void testLargeFiniteIntervalLinearRoot() throws Exception {
        RegulaFalsiSolver solver = new RegulaFalsiSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 1.0; }
        };
        assertEquals(1.0, solver.solve(20, f, -100.0, 100.0, AllowedSolution.ANY_SIDE), 1e-12);
    }
}
