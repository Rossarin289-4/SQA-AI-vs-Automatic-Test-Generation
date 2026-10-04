package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;

public class BrentSolverTest {
    @Test
    public void testReturnsInitialWhenItIsRoot() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x);
        assertEquals(0.0, solver.solve(-1.0, 1.0, 0.0), 0.0);
    }

    @Test
    public void testReturnsInitialWithinFunctionAccuracy() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x - 1.0e-7);
        assertEquals(0.0, solver.solve(-1.0, 1.0, 0.0), 0.0);
    }

    @Test
    public void testReturnsLowerEndpointWhenItIsRoot() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x);
        assertEquals(0.0, solver.solve(-1.0, 2.0, 0.5), 0.0);
    }

    @Test
    public void testReturnsUpperEndpointWhenItIsRoot() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x - 2.0);
        assertEquals(0.0, solver.solve(-1.0, 2.0, 0.5), 0.0);
    }

    @Test
    public void testInitialAndLowerEndpointBracketRoot() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x - 1.0);
        assertEquals(1.0, solver.solve(0.0, 4.0, 2.0), 1.0e-6);
    }

    @Test
    public void testInitialAndUpperEndpointBracketRoot() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x - 3.0);
        assertEquals(3.0, solver.solve(0.0, 4.0, 2.0), 1.0e-6);
    }

    @Test
    public void testEndpointsBracketRoot() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x - 1.0);
        assertEquals(1.0, solver.solve(0.0, 2.0, 0.0), 1.0e-6);
    }

    @Test
    public void testInitialOutsideIntervalThrows() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x);
        try {
            solver.solve(0.0, 2.0, 3.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testInitialAtLowerBoundIsAllowed() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x - 1.0);
        assertEquals(1.0, solver.solve(0.0, 2.0, 0.0), 1.0e-6);
    }

    @Test
    public void testInitialAtUpperBoundIsAllowed() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x - 1.0);
        assertEquals(1.0, solver.solve(0.0, 2.0, 2.0), 1.0e-6);
    }

    @Test
    public void testSameSignValuesDoNotThrow() throws Exception {
        BrentSolver solver = new BrentSolver(x -> 1.0);
        assertEquals(0.0, solver.solve(-1.0, 1.0, 0.0), 0.0);
    }

    @Test
    public void testInvalidInitialDoesNotEvaluateFunction() throws Exception {
        BrentSolver solver = new BrentSolver(x -> {
            throw new FunctionEvaluationException(x);
        });
        try {
            solver.solve(0.0, 1.0, 2.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(0.0, solver.solve(0.0, 1.0, 0.0), 0.0);
        } catch (FunctionEvaluationException expected) {
            fail("function should not be evaluated for an invalid initial point");
        }
    }

    @Test
    public void testInitialRootResultCanBeReadBack() throws Exception {
        BrentSolver solver = new BrentSolver(x -> x - 2.0);
        double root = solver.solve(0.0, 4.0, 2.0);
        assertEquals(root, solver.getResult(), 0.0);
    }
}
