package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BrentSolverTest {
    @Test
    public void testLinearRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(new UnivariateRealFunction() {
            public double value(double x) { return x - 2.0; }
        }, 0.0, 4.0);
        assertEquals(2.0, root, 1e-6);
    }

    @Test
    public void testRootAtLowerEndpoint() throws Exception {
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(new UnivariateRealFunction() {
            public double value(double x) { return x; }
        }, 0.0, 4.0);
        assertEquals(0.0, root, 0.0);
    }

    @Test
    public void testRootAtUpperEndpoint() throws Exception {
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(new UnivariateRealFunction() {
            public double value(double x) { return x - 4.0; }
        }, 0.0, 4.0);
        assertEquals(4.0, root, 0.0);
    }

    @Test
    public void testNonlinearRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(new UnivariateRealFunction() {
            public double value(double x) { return x * x - 2.0; }
        }, 0.0, 2.0);
        assertEquals(Math.sqrt(2.0), root, 1e-6);
    }

    @Test
    public void testRootAtLowerEndpointWithPositiveEndpointProduct() throws Exception {
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(new UnivariateRealFunction() {
            public double value(double x) { return x * (x - 2.0); }
        }, 0.0, 3.0);
        assertEquals(0.0, root, 0.0);
    }

    @Test
    public void testRootAtUpperEndpointWithPositiveEndpointProduct() throws Exception {
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(new UnivariateRealFunction() {
            public double value(double x) { return (x - 1.0) * (x - 3.0); }
        }, 0.0, 3.0);
        assertEquals(3.0, root, 0.0);
    }

    @Test
    public void testNearZeroAtLowerEndpoint() throws Exception {
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(new UnivariateRealFunction() {
            public double value(double x) { return x - 0.0000005; }
        }, 0.0, 1.0);
        assertEquals(0.0000005, root, 0.0);
    }

    @Test
    public void testNearZeroAtUpperEndpoint() throws Exception {
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(new UnivariateRealFunction() {
            public double value(double x) { return x - 0.9999995; }
        }, 0.0, 1.0);
        assertEquals(0.9999995, root, 0.0);
    }

    @Test
    public void testRejectsSameSignEndpointValues() throws Exception {
        BrentSolver solver = new BrentSolver();
        try {
            solver.solve(new UnivariateRealFunction() {
                public double value(double x) { return x * x + 1.0; }
            }, -1.0, 1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRejectsReversedInterval() throws Exception {
        BrentSolver solver = new BrentSolver();
        try {
            solver.solve(new UnivariateRealFunction() {
                public double value(double x) { return x; }
            }, 1.0, -1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRejectsZeroWidthInterval() throws Exception {
        BrentSolver solver = new BrentSolver();
        try {
            solver.solve(new UnivariateRealFunction() {
                public double value(double x) { return x; }
            }, 1.0, 1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSolverResultRecordsComputedRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        double root = solver.solve(new UnivariateRealFunction() {
            public double value(double x) { return x - 3.0; }
        }, 0.0, 6.0);
        assertEquals(root, solver.getResult(), 0.0);
    }

    @Test
    public void testFunctionEvaluationFailureIsPropagated() throws Exception {
        BrentSolver solver = new BrentSolver();
        try {
            solver.solve(new UnivariateRealFunction() {
                public double value(double x) throws FunctionEvaluationException {
                    throw new FunctionEvaluationException(x);
                }
            }, 0.0, 2.0);
            fail("expected FunctionEvaluationException");
        } catch (FunctionEvaluationException expected) {
            assertEquals(0.0, expected.getArgument()[0], 0.0);
        }
    }
}
