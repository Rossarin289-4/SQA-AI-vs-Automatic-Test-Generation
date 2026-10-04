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
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2.0; }
        };
        assertEquals(2.0, solver.solve(f, 0.0, 4.0), 1e-6);
    }

    @Test
    public void testRootAtLowerEndpoint() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        assertEquals(0.0, solver.solve(f, 0.0, 4.0), 0.0);
    }

    @Test
    public void testRootAtUpperEndpoint() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 4.0; }
        };
        assertEquals(4.0, solver.solve(f, 0.0, 4.0), 0.0);
    }

    @Test
    public void testLowerEndpointWithinFunctionAccuracy() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x == 0.0 ? 5e-7 : -1.0; }
        };
        assertEquals(0.0, solver.solve(f, 0.0, 1.0), 0.0);
    }

    @Test
    public void testUpperEndpointWithinFunctionAccuracy() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x == 1.0 ? -5e-7 : 1.0; }
        };
        assertEquals(1.0, solver.solve(f, 0.0, 1.0), 0.0);
    }

    @Test
    public void testNonBracketingEndpointsThrow() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x * x + 1.0; }
        };
        try {
            solver.solve(f, -1.0, 1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testEqualIntervalEndpointsThrow() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 1.0; }
        };
        try {
            solver.solve(f, 1.0, 1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testReversedIntervalThrows() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        try {
            solver.solve(f, 1.0, -1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testResultRecordsComputedRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 3.0; }
        };
        double root = solver.solve(f, 1.0, 5.0);
        assertEquals(root, solver.getResult(), 0.0);
    }

    @Test
    public void testFunctionEvaluationFailurePropagates() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(x);
            }
        };
        try {
            solver.solve(f, 0.0, 1.0);
            fail("expected FunctionEvaluationException");
        } catch (FunctionEvaluationException expected) {
            assertEquals(0.0, expected.getArgument()[0], 0.0);
        }
    }

    @Test
    public void testNegativeRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x + 2.0; }
        };
        assertEquals(-2.0, solver.solve(f, -5.0, 1.0), 1e-6);
    }

    @Test
    public void testSymmetricCubicRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x * x * x - 8.0; }
        };
        assertEquals(2.0, solver.solve(f, 0.0, 4.0), 1e-6);
    }

    @Test
    public void testEndpointNearZeroTakesPrecedenceWhenProductPositive() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x == 0.0 ? 0.0 : 2.0; }
        };
        assertEquals(0.0, solver.solve(f, 0.0, 1.0), 0.0);
    }

    @Test
    public void testSolverCanBeReused() throws Exception {
        BrentSolver solver = new BrentSolver();
        UnivariateRealFunction first = new UnivariateRealFunction() {
            public double value(double x) { return x - 1.0; }
        };
        UnivariateRealFunction second = new UnivariateRealFunction() {
            public double value(double x) { return x - 3.0; }
        };
        solver.solve(first, 0.0, 2.0);
        assertEquals(3.0, solver.solve(second, 2.0, 4.0), 1e-6);
    }
}
