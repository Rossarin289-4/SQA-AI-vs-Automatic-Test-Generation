package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.util.Localizable;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;

public class ContinuedFractionTest {

    private static final double GOLDEN_RATIO = (1.0 + FastMath.sqrt(5.0)) / 2.0;
    private static final double DEFAULT_EPSILON = 10e-9;
    private static final int DEFAULT_MAX_ITERATIONS = Integer.MAX_VALUE;
    private static final double SMALL_THRESHOLD = 1e-50;

    // A concrete implementation for the golden ratio continued fraction: 1 + 1/(1 + 1/(1 + ...))
    private static class GoldenRatioContinuedFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            return 1.0;
        }

        @Override
        protected double getB(int n, double x) {
            return 1.0;
        }
    }

    // A concrete implementation for a fraction that might lead to divergence or specific exceptions.
    private static class ProblematicContinuedFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 1) return 0.0; // To potentially cause dN = 0 + 0 * dPrev = 0
            return 1.0;
        }

        @Override
        protected double getB(int n, double x) {
            if (n == 1) return 0.0; // To potentially cause dN = 0 + 0 * dPrev = 0
            return 1.0;
        }
    }

    // Another example: 3 + 1/(5 + 1/(7 + ...)) related to pi approximation
    private static class PiContinuedFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 0) return 3.0;
            return 2.0 * n + 1.0;
        }

        @Override
        protected double getB(int n, double x) {
            return 1.0;
        }
    }

    // Concrete class to test NaN divergence
    private static class NaNProducingFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 1) return Double.NaN;
            return 1.0;
        }

        @Override
        protected double getB(int n, double x) {
            return 1.0;
        }
    }

    // Concrete class to test Infinity divergence
    private static class InfiniteProducingFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 1) return Double.POSITIVE_INFINITY;
            return 1.0;
        }

        @Override
        protected double getB(int n, double x) {
            return 1.0;
        }
    }

    // Concrete class to test zero A0
    private static class ZeroA0Fraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 0) return 0.0;
            return 1.0;
        }
        @Override
        protected double getB(int n, double x) {
            return 1.0;
        }
    }

    // Concrete class to test nearly zero A0
    private static class NearlyZeroA0Fraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 0) return 1e-60; // Very small positive number
            return 1.0;
        }
        @Override
        protected double getB(int n, double x) {
            return 1.0;
        }
    }

    // Concrete class to test cN near zero
    private static class PrecisionCheckFraction2 extends ContinuedFraction {
        private int callCount = 0;
        @Override
        protected double getA(int n, double x) {
            if (n == 0) return 1.0;
            if (n == 1) return 1.0;
            return 1.0;
        }
        @Override
        protected double getB(int n, double x) {
            if (n == 1 && callCount == 0) {
                callCount++;
                return -1.0; // This can lead to cN = 0.0
            }
            return 1.0;
        }
    }

    // Concrete class for small coefficients
    private static class SmallCoeffsFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 0) return 1e-10;
            return 1.0;
        }
        @Override
        protected double getB(int n, double x) {
            if (n == 1) return 1e-10;
            return 1.0;
        }
    }

    // Concrete class for large coefficients
    private static class LargeCoeffsFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 0) return 1e10;
            return 1.0;
        }
        @Override
        protected double getB(int n, double x) {
            if (n == 1) return 1e10;
            return 1.0;
        }
    }


    @Test
    public void testEvaluateGoldenRatioDefault() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        assertEquals(GOLDEN_RATIO, cf.evaluate(0.0), DEFAULT_EPSILON);
    }

    @Test
    public void testEvaluateGoldenRatioWithEpsilon() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 1e-12;
        assertEquals(GOLDEN_RATIO, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluateGoldenRatioWithMaxIterations() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        int maxIterations = 100;
        assertEquals(GOLDEN_RATIO, cf.evaluate(0.0, maxIterations), DEFAULT_EPSILON);
    }

    @Test
    public void testEvaluateGoldenRatioWithEpsilonAndMaxIterations() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 1e-15;
        int maxIterations = 1000;
        assertEquals(GOLDEN_RATIO, cf.evaluate(0.0, epsilon, maxIterations), epsilon);
    }

    @Test
    public void testEvaluateGoldenRatioLowMaxIterations() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        int maxIterations = 2;
        try {
            cf.evaluate(0.0, DEFAULT_EPSILON, maxIterations);
            fail("Expected MaxCountExceededException");
        } catch (MaxCountExceededException e) {
            // ok
        }
    }

    @Test
    public void testEvaluateGoldenRatioSmallEpsilon() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 1e-15;
        assertEquals(GOLDEN_RATIO, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluateGoldenRatioLargeEpsilon() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 0.1;
        assertEquals(1.6, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluatePiApproximation() throws Exception {
        ContinuedFraction cf = new PiContinuedFraction();
        double epsilon = 1e-9;
        double result = cf.evaluate(0.0, epsilon);
        assertTrue(Double.isFinite(result));
    }

    @Test
    public void testEvaluatePiApproximationLowMaxIterations() throws Exception {
        ContinuedFraction cf = new PiContinuedFraction();
        int maxIterations = 1;
        try {
            cf.evaluate(0.0, DEFAULT_EPSILON, maxIterations);
            fail("Expected MaxCountExceededException");
        } catch (MaxCountExceededException e) {
            // ok
        }
    }

    @Test
    public void testEvaluateProblematicFractionZeroDivisor() throws Exception {
        ContinuedFraction cf = new ProblematicContinuedFraction();
        assertEquals(1.0, cf.evaluate(0.0), DEFAULT_EPSILON);
    }

    @Test
    public void testEvaluateProblematicFractionWithSmallEpsilon() throws Exception {
        ContinuedFraction cf = new ProblematicContinuedFraction();
        double epsilon = 1e-15;
        assertEquals(1.0, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluateWithVerySmallEpsilon() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 1e-15;
        assertEquals(GOLDEN_RATIO, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluateWithVeryLargeEpsilon() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 0.5;
        assertEquals(1.5, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluateMaxIterationsZero() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        int maxIterations = 0;
        try {
            cf.evaluate(0.0, DEFAULT_EPSILON, maxIterations);
            fail("Expected MaxCountExceededException");
        } catch (MaxCountExceededException e) {
            // ok
        }
    }

    @Test
    public void testEvaluateMaxIterationsOne() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        int maxIterations = 1;
        assertEquals(1.0, cf.evaluate(0.0, DEFAULT_EPSILON, maxIterations), DEFAULT_EPSILON);
    }

    @Test
    public void testEvaluateMaxIterationsTwo() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        int maxIterations = 2;
        assertEquals(2.0, cf.evaluate(0.0, DEFAULT_EPSILON, maxIterations), DEFAULT_EPSILON);
    }

    @Test
    public void testEvaluateNaNInput() throws Exception {
        try {
            new NaNProducingFraction().evaluate(0.0);
            fail("Expected ConvergenceException for NaN");
        } catch (ConvergenceException e) {
            assertEquals(LocalizedFormats.CONTINUED_FRACTION_NAN_DIVERGENCE, e.getTopic());
            assertEquals(0.0, (Double) e.getArguments()[0], 0.0);
        }
    }

    @Test
    public void testEvaluateInfiniteInput() throws Exception {
        try {
            new InfiniteProducingFraction().evaluate(0.0);
            fail("Expected ConvergenceException for Infinity");
        } catch (ConvergenceException e) {
            assertEquals(LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE, e.getTopic());
            assertEquals(0.0, (Double) e.getArguments()[0], 0.0);
        }
    }

    @Test
    public void testEvaluateWithZeroA0() throws Exception {
        ContinuedFraction cf = new ZeroA0Fraction();
        assertEquals(0.6180339887, cf.evaluate(0.0, 1e-9), 1e-9); // Approximately phi - 1
    }

    @Test
    public void testEvaluateWithNearlyZeroA0() throws Exception {
        ContinuedFraction cf = new NearlyZeroA0Fraction();
        assertEquals(0.6180339887, cf.evaluate(0.0, 1e-9), 1e-9); // Approximately phi - 1
    }

    @Test
    public void testEvaluateWithEpsilonCloseToOne() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 1e-15;
        assertEquals(GOLDEN_RATIO, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluateWithEpsilonExactlyOne() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 1.0;
        assertEquals(1.5, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluateWithEpsilonGreaterThanOne() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 2.0;
        assertEquals(2.0, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluatePrecisionEquals() throws Exception {
        ContinuedFraction cf = new PrecisionCheckFraction2();
        double result = cf.evaluate(0.0, DEFAULT_EPSILON);
        assertTrue(Double.isFinite(result));
    }

    @Test
    public void testEvaluateWithEpsilonJustAboveDelta() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 0.04000000000000001;
        assertEquals(1.6, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluateWithEpsilonJustBelowDelta() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = 0.03999999999999999;
        assertEquals(1.625, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluateMaxIterationsLargeValue() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        int maxIterations = 10000;
        assertEquals(GOLDEN_RATIO, cf.evaluate(0.0, DEFAULT_EPSILON, maxIterations), DEFAULT_EPSILON);
    }

    @Test
    public void testEvaluateWithEpsilonNearDefault() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        double epsilon = DEFAULT_EPSILON;
        assertEquals(GOLDEN_RATIO, cf.evaluate(0.0, epsilon), epsilon);
    }

    @Test
    public void testEvaluateWithSmallA0SmallB1() throws Exception {
        ContinuedFraction cf = new SmallCoeffsFraction();
        assertEquals(1.6180339887e-10, cf.evaluate(0.0, DEFAULT_EPSILON), DEFAULT_EPSILON * 1e-10);
    }

    @Test
    public void testEvaluateWithLargeA0LargeB1() throws Exception {
        ContinuedFraction cf = new LargeCoeffsFraction();
        assertEquals(1.6180339887e10, cf.evaluate(0.0, DEFAULT_EPSILON), DEFAULT_EPSILON * 1e10);
    }

    @Test
    public void testEvaluateMaxIterationsIntegerMaxValue() throws Exception {
        ContinuedFraction cf = new GoldenRatioContinuedFraction();
        assertEquals(GOLDEN_RATIO, cf.evaluate(0.0, DEFAULT_EPSILON, Integer.MAX_VALUE), DEFAULT_EPSILON);
    }

    @Test
    public void testEvaluateConvergenceExceptionWithSpecificX() throws Exception {
        // Test that the exception message includes the evaluation point x.
        double x = 5.0;
        // Test for NaN divergence
        try {
            new NaNProducingFraction().evaluate(x, DEFAULT_EPSILON, 100);
            fail("Expected ConvergenceException for NaN");
        } catch (ConvergenceException e) {
            assertEquals(LocalizedFormats.CONTINUED_FRACTION_NAN_DIVERGENCE, e.getTopic());
            assertEquals(x, (Double) e.getArguments()[0], 0.0);
        }

        // Test for Infinity divergence
        try {
            new InfiniteProducingFraction().evaluate(x, DEFAULT_EPSILON, 100);
            fail("Expected ConvergenceException for Infinity");
        } catch (ConvergenceException e) {
            assertEquals(LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE, e.getTopic());
            assertEquals(x, (Double) e.getArguments()[0], 0.0);
        }
    }
}
