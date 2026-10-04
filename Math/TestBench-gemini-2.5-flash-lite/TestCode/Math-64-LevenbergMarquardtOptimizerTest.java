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

    // Mock implementation of a DifferentiableMultivariateVectorialFunction for testing

    @Test
    public void testDefaultConstructor() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(1000, optimizer.getMaxIterations());
        // The 'checker' field is protected in AbstractLeastSquaresOptimizer, so it's accessible here.
        assertNull(optimizer.checker);
    }

    @Test
    public void testSetInitialStepBoundFactor() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(50.0);
        optimizer.setInitialStepBoundFactor(0.1);
        optimizer.setInitialStepBoundFactor(100.0);
        // No public getter for initialStepBoundFactor.
    }

    @Test
    public void testSetCostRelativeTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(1.0e-12);
        optimizer.setCostRelativeTolerance(0.0);
        optimizer.setCostRelativeTolerance(1.0);
        // No public getter for costRelativeTolerance.
    }

    @Test
    public void testSetParRelativeTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setParRelativeTolerance(1.0e-12);
        optimizer.setParRelativeTolerance(0.0);
        optimizer.setParRelativeTolerance(1.0);
        // No public getter for parRelativeTolerance.
    }

    @Test
    public void testSetOrthoTolerance() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(1.0e-12);
        optimizer.setOrthoTolerance(0.0);
        optimizer.setOrthoTolerance(1.0);
        // No public getter for orthoTolerance.
    }

    @Test
    public void testSetQRRankingThreshold() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setQRRankingThreshold(1.0e-15);
        optimizer.setQRRankingThreshold(0.0);
        optimizer.setQRRankingThreshold(MathUtils.SAFE_MIN);
        // No public getter for qrRankingThreshold.
    }


















}


