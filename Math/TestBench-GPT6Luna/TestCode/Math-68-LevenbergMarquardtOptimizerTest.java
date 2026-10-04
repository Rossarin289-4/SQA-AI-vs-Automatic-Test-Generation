package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;

public class LevenbergMarquardtOptimizerTest {
    @Test
    public void testDefaultMaxIterations() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(1000, optimizer.getMaxIterations());
    }

    @Test
    public void testSetMaxIterations() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(7);
        assertEquals(7, optimizer.getMaxIterations());
    }

    @Test
    public void testSetMaxIterationsAtOne() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1);
        assertEquals(1, optimizer.getMaxIterations());
    }

    @Test
    public void testDefaultMaxEvaluations() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluations() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxEvaluations(9);
        assertEquals(9, optimizer.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsAtOne() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxEvaluations(1);
        assertEquals(1, optimizer.getMaxEvaluations());
    }

    @Test
    public void testDefaultCheckerIsNull() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetCheckerToNull() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setConvergenceChecker(null);
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testDefaultIterationCount() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testDefaultEvaluationCount() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(0, optimizer.getEvaluations());
    }

    @Test
    public void testDefaultJacobianEvaluationCount() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(0, optimizer.getJacobianEvaluations());
    }

    @Test
    public void testSetInitialStepBoundFactorDoesNotChangeMaxIterations() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(2.0);
        assertEquals(1000, optimizer.getMaxIterations());
    }

    @Test
    public void testSetCostRelativeToleranceDoesNotChangeMaxEvaluations() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(0.5);
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
    }

    @Test
    public void testSetParRelativeToleranceDoesNotChangeIterationCount() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(0.5);
        assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testSetOrthoToleranceDoesNotChangeEvaluationCount() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(0.5);
        assertEquals(0, optimizer.getEvaluations());
    }
}
