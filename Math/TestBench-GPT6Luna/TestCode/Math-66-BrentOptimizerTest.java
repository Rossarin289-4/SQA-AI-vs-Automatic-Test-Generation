package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;

public class BrentOptimizerTest {
    @Test
    public void testMinimizeQuadratic() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(new UnivariateRealFunction() {
            public double value(double x) { return (x - 2) * (x - 2) + 3; }
        }, GoalType.MINIMIZE, -5, 8, 1);
        assertEquals(2.0, result, 1e-5);
        assertEquals(3.0, optimizer.getFunctionValue(), 1e-9);
    }

    @Test
    public void testMaximizeQuadratic() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(new UnivariateRealFunction() {
            public double value(double x) { return -((x - 2) * (x - 2)) + 3; }
        }, GoalType.MAXIMIZE, -5, 8, 1);
        assertEquals(2.0, result, 1e-5);
        assertEquals(3.0, optimizer.getFunctionValue(), 1e-9);
    }

    @Test
    public void testMinimumAtLeftEndpoint() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(new UnivariateRealFunction() {
            public double value(double x) { return x; }
        }, GoalType.MINIMIZE, 0, 10, 2);
        assertEquals(0.0, result, 1e-8);
    }

    @Test
    public void testMinimumAtRightEndpoint() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(new UnivariateRealFunction() {
            public double value(double x) { return -x; }
        }, GoalType.MINIMIZE, 0, 10, 8);
        assertEquals(10.0, result, 1e-7);
    }

    @Test
    public void testReversedBounds() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(new UnivariateRealFunction() {
            public double value(double x) { return (x - 3) * (x - 3); }
        }, GoalType.MINIMIZE, 8, -4, 1);
        assertEquals(3.0, result, 1e-5);
    }

    @Test
    public void testMinimumWithStartAtMinimum() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(new UnivariateRealFunction() {
            public double value(double x) { return x * x + 1; }
        }, GoalType.MINIMIZE, -4, 4, 0);
        assertEquals(0.0, result, 1e-8);
        assertEquals(1.0, optimizer.getFunctionValue(), 1e-9);
    }

    @Test
    public void testConstantFunction() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(new UnivariateRealFunction() {
            public double value(double x) { return 7; }
        }, GoalType.MINIMIZE, -2, 5, 1);
        assertEquals(5.0, result, 1e-7);
        assertEquals(7.0, optimizer.getFunctionValue(), 0.0);
    }

    @Test
    public void testMinimizeAsymmetricFunction() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(new UnivariateRealFunction() {
            public double value(double x) {
                double y = x - 1;
                return y * y * y * y + y * y;
            }
        }, GoalType.MINIMIZE, -4, 6, 3);
        assertEquals(1.0, result, 1e-5);
        assertEquals(0.0, optimizer.getFunctionValue(), 1e-9);
    }

    @Test
    public void testMaximizeOnReversedBounds() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(new UnivariateRealFunction() {
            public double value(double x) { return 5 - (x + 1) * (x + 1); }
        }, GoalType.MAXIMIZE, 6, -7, 2);
        assertEquals(-1.0, result, 1e-5);
        assertEquals(5.0, optimizer.getFunctionValue(), 1e-9);
    }

    @Test
    public void testRejectsZeroRelativeAccuracy() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setRelativeAccuracy(0);
        try {
            optimizer.optimize(new UnivariateRealFunction() {
                public double value(double x) { return x * x; }
            }, GoalType.MINIMIZE, -1, 1, 0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            assertEquals(0, optimizer.getEvaluations());
        }
    }

    @Test
    public void testRejectsNegativeRelativeAccuracy() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setRelativeAccuracy(-1);
        try {
            optimizer.optimize(new UnivariateRealFunction() {
                public double value(double x) { return x * x; }
            }, GoalType.MINIMIZE, -1, 1, 0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            assertEquals(0, optimizer.getEvaluations());
        }
    }

    @Test
    public void testRejectsZeroAbsoluteAccuracy() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(0);
        try {
            optimizer.optimize(new UnivariateRealFunction() {
                public double value(double x) { return x * x; }
            }, GoalType.MINIMIZE, -1, 1, 0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            assertEquals(0, optimizer.getEvaluations());
        }
    }

    @Test
    public void testRejectsNegativeAbsoluteAccuracy() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(-1);
        try {
            optimizer.optimize(new UnivariateRealFunction() {
                public double value(double x) { return x * x; }
            }, GoalType.MINIMIZE, -1, 1, 0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            assertEquals(0, optimizer.getEvaluations());
        }
    }
}
