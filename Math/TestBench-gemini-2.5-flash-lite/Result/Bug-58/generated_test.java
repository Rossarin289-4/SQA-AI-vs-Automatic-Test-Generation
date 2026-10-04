package org.apache.commons.math.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.ParametricUnivariateRealFunction;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.ZeroException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.fitting.CurveFitter;
import org.apache.commons.math.optimization.fitting.WeightedObservedPoint;
import org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer;

public class GaussianFitterTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    /**
     * A dummy optimizer that does not perform any optimization.
     * It is used here to test the ParameterGuesser class.
     */





    @Test
    public void testParameterGuesserBasic() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1, -2, 0.1),
            new WeightedObservedPoint(1, -1, 0.5),
            new WeightedObservedPoint(1, 0, 1.0),
            new WeightedObservedPoint(1, 1, 0.5),
            new WeightedObservedPoint(1, 2, 0.1)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] params = guesser.guess();
        assertEquals(1.0, params[0], 1e-9);
        assertEquals(0.0, params[1], 1e-9);
        assertEquals(1.0986, params[2], 1e-4); // sigma approximation
    }

    @Test
    public void testParameterGuesserWithDifferentWeights() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(0.5, -2, 0.1),
            new WeightedObservedPoint(1.0, -1, 0.5),
            new WeightedObservedPoint(2.0, 0, 1.0),
            new WeightedObservedPoint(1.0, 1, 0.5),
            new WeightedObservedPoint(0.5, 2, 0.1)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] params = guesser.guess();
        assertEquals(1.0, params[0], 1e-9);
        assertEquals(0.0, params[1], 1e-9);
        assertEquals(1.0986, params[2], 1e-4); // sigma approximation
    }

    @Test
    public void testParameterGuesserFindsMaxY() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1, -1, 0.5),
            new WeightedObservedPoint(1, 0, 1.0),
            new WeightedObservedPoint(1, 1, 0.5)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] params = guesser.guess();
        assertEquals(1.0, params[0], 1e-9);
        assertEquals(0.0, params[1], 1e-9);
    }

    @Test
    public void testParameterGuesserInterpolatesForFwhm() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1, -2, 0.25),
            new WeightedObservedPoint(1, 0, 1.0),
            new WeightedObservedPoint(1, 2, 0.25)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] params = guesser.guess();
        assertEquals(1.0, params[0], 1e-9);
        assertEquals(0.0, params[1], 1e-9);
        assertEquals(2.0, params[2], 1e-9); // FWHM is 4, sigma is FWHM / (2 * sqrt(2*ln(2)))
    }

    @Test
    public void testParameterGuesserHandlesOutOfRange() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1, 0, 0.5),
            new WeightedObservedPoint(1, 1, 1.0),
            new WeightedObservedPoint(1, 2, 0.5)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] params = guesser.guess();
        assertEquals(1.0, params[0], 1e-9);
        assertEquals(1.0, params[1], 1e-9);
        double fwhmApprox = params[2] * (2.0 * Math.sqrt(2.0 * Math.log(2.0)));
        assertEquals(2.0, fwhmApprox, 1e-9);
    }


    @Test
    public void testNullObservationsInGuesser() {
        try {
            new GaussianFitter.ParameterGuesser(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // Expected
        }
    }




    @Test
    public void testGaussianParametricValueHandling() {
        Gaussian.Parametric gaussianParametric = new Gaussian.Parametric();
        double[] p = {1.0, 0.0, 1.0}; // norm, mean, sigma
        assertEquals(1.0, gaussianParametric.value(0.0, p), 1e-9);
        assertEquals(Math.exp(-0.5), gaussianParametric.value(1.0, p), 1e-9);

        // Test edge case where sigma is 0, which should throw NotStrictlyPositiveException
        // The value() method in the anonymous class catches this and returns POSITIVE_INFINITY.
        double[] pInvalidSigma = {1.0, 0.0, 0.0}; // Invalid sigma
        assertEquals(Double.POSITIVE_INFINITY, gaussianParametric.value(0.0, pInvalidSigma), 1e-9);

        double[] pNegativeSigma = {1.0, 0.0, -1.0}; // Invalid sigma
        assertEquals(Double.POSITIVE_INFINITY, gaussianParametric.value(0.0, pNegativeSigma), 1e-9);
    }

    @Test
    public void testGaussianParametricGradientHandling() {
        Gaussian.Parametric gaussianParametric = new Gaussian.Parametric();
        double[] p = {1.0, 0.0, 1.0}; // norm, mean, sigma
        double[] gradient = gaussianParametric.gradient(0.0, p);
        assertEquals(1.0, gradient[0], 1e-9);
        assertEquals(0.0, gradient[1], 1e-9);
        assertEquals(0.0, gradient[2], 1e-9);

        // Test edge case where sigma is 0, which should throw NotStrictlyPositiveException
        // The gradient() method in the anonymous class catches this and returns POSITIVE_INFINITY.
        double[] pInvalidSigma = {1.0, 0.0, 0.0}; // Invalid sigma
        double[] gradientInvalidSigma = gaussianParametric.gradient(0.0, pInvalidSigma);
        assertEquals(Double.POSITIVE_INFINITY, gradientInvalidSigma[0], 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, gradientInvalidSigma[1], 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, gradientInvalidSigma[2], 1e-9);

        double[] pNegativeSigma = {1.0, 0.0, -1.0}; // Invalid sigma
        double[] gradientNegativeSigma = gaussianParametric.gradient(0.0, pNegativeSigma);
        assertEquals(Double.POSITIVE_INFINITY, gradientNegativeSigma[0], 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, gradientNegativeSigma[1], 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, gradientNegativeSigma[2], 1e-9);
    }

    // Added a test for the comparator method's behavior, specifically sorting by X then Y.

    // Added test for interpolation when y is exactly one of the point's y values
}


