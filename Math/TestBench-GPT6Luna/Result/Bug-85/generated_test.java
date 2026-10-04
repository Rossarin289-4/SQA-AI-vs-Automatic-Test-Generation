package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class UnivariateRealSolverUtilsTest {
    @Test
    public void testMidpointEqualValues() throws Exception {
        assertEquals(3.0, UnivariateRealSolverUtils.midpoint(3.0, 3.0), 0.0);
    }

    @Test
    public void testMidpointOppositeValues() throws Exception {
        assertEquals(0.0, UnivariateRealSolverUtils.midpoint(-4.0, 4.0), 0.0);
    }

    @Test
    public void testMidpointUnequalValues() throws Exception {
        assertEquals(2.0, UnivariateRealSolverUtils.midpoint(1.0, 3.0), 0.0);
    }

    @Test
    public void testMidpointReversedArguments() throws Exception {
        assertEquals(2.0, UnivariateRealSolverUtils.midpoint(3.0, 1.0), 0.0);
    }

    @Test
    public void testMidpointAcrossZero() throws Exception {
        assertEquals(-1.0, UnivariateRealSolverUtils.midpoint(-3.0, 1.0), 0.0);
    }

    @Test
    public void testBracketFindsRootWithinInitialStep() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 0.5; }
        };
        double[] result = UnivariateRealSolverUtils.bracket(f, 0.0, -2.0, 2.0);
        assertArrayEquals(new double[] {-1.0, 1.0}, result, 0.0);
    }

    @Test
    public void testBracketReturnsZeroEndpoint() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        double[] result = UnivariateRealSolverUtils.bracket(f, 0.0, -2.0, 2.0);
        assertArrayEquals(new double[] {-1.0, 1.0}, result, 0.0);
    }

    @Test
    public void testBracketExpandsUntilSignChange() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2.5; }
        };
        double[] result = UnivariateRealSolverUtils.bracket(f, 0.0, -4.0, 4.0);
        assertArrayEquals(new double[] {-3.0, 3.0}, result, 0.0);
    }

    @Test
    public void testBracketClampsAtLowerBound() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x + 1.5; }
        };
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, -1.0, 2.0);
            fail("expected ConvergenceException");
        } catch (ConvergenceException expected) { }
    }

    @Test
    public void testBracketClampsAtUpperBound() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 1.5; }
        };
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, -2.0, 1.0);
            fail("expected ConvergenceException");
        } catch (ConvergenceException expected) { }
    }

    @Test
    public void testBracketRejectsNullFunction() throws Exception {
        try {
            UnivariateRealSolverUtils.bracket(null, 0.0, -1.0, 1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testBracketRejectsInitialBelowLowerBound() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        try {
            UnivariateRealSolverUtils.bracket(f, -2.0, -1.0, 1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testBracketRejectsInitialAboveUpperBound() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        try {
            UnivariateRealSolverUtils.bracket(f, 2.0, -1.0, 1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testBracketRejectsEqualBounds() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        try {
            UnivariateRealSolverUtils.bracket(f, 1.0, 1.0, 1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testBracketRejectsUnbracketedRootWithinBounds() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return 1.0; }
        };
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, -2.0, 2.0);
            fail("expected ConvergenceException");
        } catch (ConvergenceException expected) { }
    }

    @Test
    public void testBracketWithSmallMaximumIterationsFails() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2.5; }
        };
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, -4.0, 4.0, 1);
            fail("expected ConvergenceException");
        } catch (ConvergenceException expected) { }
    }

    @Test
    public void testSolveFindsLinearRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 0.5; }
        };
        assertEquals(0.5, UnivariateRealSolverUtils.solve(f, 0.0, 1.0), 1e-6);
    }

    @Test
    public void testSolveRejectsNullFunction() throws Exception {
        try {
            UnivariateRealSolverUtils.solve(null, 0.0, 1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }
}
