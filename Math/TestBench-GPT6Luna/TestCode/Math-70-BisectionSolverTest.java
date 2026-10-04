package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BisectionSolverTest {
    @Test
    public void testDeprecatedSolveFindsLinearRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2.0; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(2.0, solver.solve(0.0, 4.0, 1.0), 1e-6);
    }

    @Test
    public void testDeprecatedSolveIgnoresInitialForRootOnLeft() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x + 1.0; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(-1.0, solver.solve(-4.0, 2.0, 1.5), 1e-6);
    }

    @Test
    public void testDeprecatedSolveUsesConfiguredFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 0.5; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(0.5, solver.solve(-1.0, 2.0, 0.0), 1e-6);
    }

    @Test
    public void testDeprecatedSolveWithInitialAtEndpoint() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 3.0; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(3.0, solver.solve(1.0, 5.0, 1.0), 1e-6);
    }

    @Test
    public void testDeprecatedSolveWithInitialAtOtherEndpoint() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 3.0; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(3.0, solver.solve(1.0, 5.0, 5.0), 1e-6);
    }

    @Test
    public void testDeprecatedSolveWithRootAtLowerBound() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(0.0, solver.solve(0.0, 2.0, 1.0), 1e-6);
    }

    @Test
    public void testDeprecatedSolveWithRootAtUpperBound() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2.0; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(2.0, solver.solve(0.0, 2.0, 1.0), 1e-6);
    }

    @Test
    public void testDeprecatedSolveForNegativeRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x + 2.0; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(-2.0, solver.solve(-4.0, 0.0, -1.0), 1e-6);
    }

    @Test
    public void testDeprecatedSolveForNonIntegralRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 0.25; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(0.25, solver.solve(-1.0, 1.0, 0.0), 1e-6);
    }

    @Test
    public void testDeprecatedSolveForRootInAsymmetricInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 7.0; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(7.0, solver.solve(-3.0, 17.0, 0.0), 1e-6);
    }

    @Test
    public void testDeprecatedSolveRejectsEqualEndpoints() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        try {
            solver.solve(1.0, 1.0, 1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testDeprecatedSolveRejectsReversedInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        try {
            solver.solve(2.0, -2.0, 0.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testDeprecatedSolveWithZeroInitial() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 1.0; }
        };
        BisectionSolver solver = new BisectionSolver(f);
        assertEquals(1.0, solver.solve(-2.0, 4.0, 0.0), 1e-6);
    }
}
