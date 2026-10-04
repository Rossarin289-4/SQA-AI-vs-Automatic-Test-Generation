package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;

public class BrentOptimizerTest {
    @Test
    public void testRejectsRelativeThresholdBelowMinimum() throws Exception {
        try {
            new BrentOptimizer(FastMath.ulp(1.0), 1.0);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) { }
    }

    @Test
    public void testAcceptsMinimumRelativeThreshold() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(2 * FastMath.ulp(1.0), 1.0);
        assertNotNull(optimizer);
    }

    @Test
    public void testRejectsZeroAbsoluteThreshold() throws Exception {
        try {
            new BrentOptimizer(1e-8, 0.0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) { }
    }

    @Test
    public void testRejectsNegativeAbsoluteThreshold() throws Exception {
        try {
            new BrentOptimizer(1e-8, -1.0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) { }
    }

    @Test
    public void testAcceptsPositiveAbsoluteThreshold() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1.0);
        assertNotNull(optimizer);
    }

    @Test
    public void testMinimizesQuadratic() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-10);
        UnivariatePointValuePair result = optimizer.optimize(
            100, new org.apache.commons.math3.analysis.UnivariateFunction() {
                public double value(double x) { return (x - 2.0) * (x - 2.0); }
            }, GoalType.MINIMIZE, -5.0, 8.0, 0.0);
        assertEquals(2.0, result.getPoint(), 1e-5);
        assertEquals(0.0, result.getValue(), 1e-9);
    }

    @Test
    public void testMaximizesQuadratic() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-10);
        UnivariatePointValuePair result = optimizer.optimize(
            100, new org.apache.commons.math3.analysis.UnivariateFunction() {
                public double value(double x) { return -((x - 1.0) * (x - 1.0)); }
            }, GoalType.MAXIMIZE, -4.0, 6.0, 0.0);
        assertEquals(1.0, result.getPoint(), 1e-5);
        assertEquals(0.0, result.getValue(), 1e-9);
    }

    @Test
    public void testMinimizesWithDescendingBounds() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-10);
        UnivariatePointValuePair result = optimizer.optimize(
            100, new org.apache.commons.math3.analysis.UnivariateFunction() {
                public double value(double x) { return (x + 1.0) * (x + 1.0); }
            }, GoalType.MINIMIZE, 5.0, -4.0, 2.0);
        assertEquals(-1.0, result.getPoint(), 1e-5);
        assertEquals(0.0, result.getValue(), 1e-9);
    }

    @Test
    public void testMinimumAtLowerEndpoint() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-10);
        UnivariatePointValuePair result = optimizer.optimize(
            100, new org.apache.commons.math3.analysis.UnivariateFunction() {
                public double value(double x) { return x; }
            }, GoalType.MINIMIZE, 0.0, 5.0, 2.0);
        assertEquals(0.0, result.getPoint(), 1e-5);
        assertEquals(0.0, result.getValue(), 1e-9);
    }

    @Test
    public void testMaximumAtUpperEndpoint() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-10);
        UnivariatePointValuePair result = optimizer.optimize(
            100, new org.apache.commons.math3.analysis.UnivariateFunction() {
                public double value(double x) { return x; }
            }, GoalType.MAXIMIZE, -2.0, 4.0, 0.0);
        assertEquals(4.0, result.getPoint(), 1e-5);
        assertEquals(4.0, result.getValue(), 1e-9);
    }

    @Test
    public void testCheckerCanStopAtFirstIterationForMinimization() throws Exception {
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                public boolean converged(int iteration, UnivariatePointValuePair previous,
                                         UnivariatePointValuePair current) {
                    return true;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-10, checker);
        UnivariatePointValuePair result = optimizer.optimize(
            100, new org.apache.commons.math3.analysis.UnivariateFunction() {
                public double value(double x) { return (x - 2.0) * (x - 2.0); }
            }, GoalType.MINIMIZE, -5.0, 8.0, 0.0);
        assertTrue(result.getValue() <= 4.0);
    }

    @Test
    public void testCheckerCanStopAtFirstIterationForMaximization() throws Exception {
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                public boolean converged(int iteration, UnivariatePointValuePair previous,
                                         UnivariatePointValuePair current) {
                    return true;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-10, checker);
        UnivariatePointValuePair result = optimizer.optimize(
            100, new org.apache.commons.math3.analysis.UnivariateFunction() {
                public double value(double x) { return -((x - 1.0) * (x - 1.0)); }
            }, GoalType.MAXIMIZE, -4.0, 6.0, 0.0);
        assertTrue(result.getValue() >= -1.0);
    }
}
