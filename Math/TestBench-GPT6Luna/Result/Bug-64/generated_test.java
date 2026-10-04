package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.util.MathUtils;

public class LevenbergMarquardtOptimizerTest {
    @Test
    public void testDefaultConstruction() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(1000, optimizer.getMaxIterations());
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetInitialStepBoundFactorZero() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(0.0);
        assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testSetInitialStepBoundFactorOne() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(1.0);
        assertEquals(1000, optimizer.getMaxIterations());
    }

    @Test
    public void testSetInitialStepBoundFactorNegative() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(-1.0);
        assertEquals(1000, optimizer.getMaxIterations());
    }

    @Test
    public void testSetInitialStepBoundFactorLargeFinite() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(Double.MAX_VALUE);
        assertEquals(1000, optimizer.getMaxIterations());
    }

    @Test
    public void testSetCostRelativeToleranceZero() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(0.0);
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetCostRelativeTolerancePositive() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(0.25);
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetCostRelativeToleranceNegative() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(-1.0);
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetParRelativeToleranceZero() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(0.0);
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetParRelativeTolerancePositive() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(0.25);
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetParRelativeToleranceNegative() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(-1.0);
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetOrthoToleranceZero() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(0.0);
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetOrthoTolerancePositive() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(0.25);
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetOrthoToleranceNegative() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(-1.0);
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetQRRankingThresholdZero() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setQRRankingThreshold(0.0);
        assertEquals(1000, optimizer.getMaxIterations());
    }

    @Test
    public void testSetQRRankingThresholdPositive() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setQRRankingThreshold(0.25);
        assertEquals(1000, optimizer.getMaxIterations());
    }

    @Test
    public void testSetQRRankingThresholdNegative() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setQRRankingThreshold(-1.0);
        assertEquals(1000, optimizer.getMaxIterations());
    }

    @Test
    public void testSetQRRankingThresholdSafeMinimum() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setQRRankingThreshold(MathUtils.SAFE_MIN);
        assertEquals(1000, optimizer.getMaxIterations());
    }
}
