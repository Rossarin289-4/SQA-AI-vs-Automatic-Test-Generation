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
            new BrentOptimizer(Math.nextAfter(2 * Math.ulp(1d), 0d), 1d);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) {
            assertTrue(expected.getBoundIsAllowed());
        }
    }

    @Test
    public void testAcceptsMinimumRelativeThreshold() throws Exception {
        new BrentOptimizer(2 * Math.ulp(1d), 1d);
    }

    @Test
    public void testRejectsZeroRelativeThreshold() throws Exception {
        try {
            new BrentOptimizer(0d, 1d);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) {
            assertTrue(expected.getBoundIsAllowed());
        }
    }

    @Test
    public void testRejectsNegativeRelativeThreshold() throws Exception {
        try {
            new BrentOptimizer(-1d, 1d);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) {
            assertTrue(expected.getBoundIsAllowed());
        }
    }

    @Test
    public void testZeroAbsoluteThresholdIsStored() throws Exception {
        assertNotNull(new BrentOptimizer(1e-8, 0d));
    }

    @Test
    public void testNegativeAbsoluteThresholdIsStored() throws Exception {
        assertNotNull(new BrentOptimizer(1e-8, -1d));
    }

    @Test
    public void testAllowsPositiveAbsoluteThreshold() throws Exception {
        assertNotNull(new BrentOptimizer(1e-8, Math.nextUp(0d)));
    }
}
