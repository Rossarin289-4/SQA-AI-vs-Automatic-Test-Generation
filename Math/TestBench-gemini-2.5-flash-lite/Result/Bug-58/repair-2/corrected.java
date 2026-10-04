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
import org.apache.commons.math.optimization.MultivariateVectorialOptimizer;

public class GaussianFitterTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    /**
     * A dummy optimizer that does not perform any optimization.
     * It is used here to test the ParameterGuesser class.
     */
    private static class DummyOptimizer implements DifferentiableMultivariateVectorialOptimizer {
        public double[] optimize(ParametricUnivariateRealFunction f, boolean h, double[] initialGuess, double[] target, double[] weights) {
            return initialGuess;
        }
        public void setMaxIterations(int maxIterations) {}
        public int getMaxIterations() { return 0; }
        public int getIterations() { return 0; }
        public void setMaxEvaluations(int maxEvaluations) {}
        public int getMaxEvaluations() { return 0; }
        public double[] getPoint() { return null; }
        public double[] getSolutionValues() { return null; }
        public double[] getTarget() { return null; }
        public double[] getWeights() { return null; }
        public double getCost() { return 0; }
        public double getRMS() { return 0; }
        public double computeNorm(double[] params) { return 0; }
        public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.PointVectorValuePair> checker) {}
        public org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.PointVectorValuePair> getConvergenceChecker() { return null; }
    }

    @Test
    public void testFitSimpleGaussian() throws Exception {
        GaussianFitter fitter = new GaussianFitter(new DummyOptimizer());
        fitter.addObservedPoint(0, 1.0);
        fitter.addObservedPoint(1, 2.0);
        fitter.addObservedPoint(2, 1.0);

        double[] params = fitter.fit();
        assertEquals(1.0, params[0], 1e-9); // Norm
        assertEquals(1.0, params[1], 1e-9); // Mean
        assertEquals(0.5, params[2], 1e-9); // Sigma
    }

    @Test
    public void testFitWithInitialGuess() throws Exception {
        GaussianFitter fitter = new GaussianFitter(new DummyOptimizer());
        fitter.addObservedPoint(-1, 0.5);
        fitter.addObservedPoint(0, 1.0);
        fitter.addObservedPoint(1, 0.5);

        double[] initialGuess = { 0.9, 0.1, 0.6 };
        double[] params = fitter.fit(initialGuess);
        assertEquals(1.0, params[0], 1e-9); // Norm
        assertEquals(0.0, params[1], 1e-9); // Mean
        // The sigma calculation in ParameterGuesser involves some approximations, so we use a reasonable tolerance.
        assertEquals(1.0986, params[2], 1e-4); // Sigma derived from FWHM approximation
    }

    @Test
    public void testFitAsymmetricGaussian() throws Exception {
        GaussianFitter fitter = new GaussianFitter(new DummyOptimizer());
        fitter.addObservedPoint(-2, 0.1);
        fitter.addObservedPoint(-1, 0.5);
        fitter.addObservedPoint(0, 1.0);
        fitter.addObservedPoint(1, 0.5);
        fitter.addObservedPoint(2, 0.1);

        double[] params = fitter.fit();
        assertEquals(1.0, params[0], 1e-9);
        assertEquals(0.0, params[1], 1e-9);
        assertEquals(1.0986, params[2], 1e-4);
    }

    @Test
    public void testFitWithMorePoints() throws Exception {
        GaussianFitter fitter = new GaussianFitter(new DummyOptimizer());
        fitter.addObservedPoint(-3, 0.01);
        fitter.addObservedPoint(-2, 0.1);
        fitter.addObservedPoint(-1, 0.5);
        fitter.addObservedPoint(0, 1.0);
        fitter.addObservedPoint(1, 0.5);
        fitter.addObservedPoint(2, 0.1);
        fitter.addObservedPoint(3, 0.01);

        double[] params = fitter.fit();
        assertEquals(1.0, params[0], 1e-9);
        assertEquals(0.0, params[1], 1e-9);
        assertEquals(1.1547, params[2], 1e-4); // sigma calculation result
    }

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
    public void testParameterGuesserInterpolateXAtYException() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1, 0, 0.1),
            new WeightedObservedPoint(1, 1, 0.5),
            new WeightedObservedPoint(1, 2, 0.1)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        try {
            // Calling getInterpolationPointsForY with a value that's out of range for interpolation.
            // The minimum y is 0.1 and maximum is 0.5.
            // We are looking for a Y value that is outside of the y-values of any two adjacent points.
            // For example, searching for y=0.05, which is below the minimum y-value of any point.
            // The method getInterpolationPointsForY iterates through points and if no interval contains the y,
            // it throws OutOfRangeException.
            // The specific call should trigger this:
            guesser.getInterpolationPointsForY(points, 1, -1, 0.05); // Value below min Y
            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            // Check the bounds reported in the exception.
            // The minY and maxY are computed by iterating through all points.
            assertEquals(0.1, e.getLo().doubleValue(), 1e-9);
            assertEquals(0.5, e.getHi().doubleValue(), 1e-9);
        } catch (ZeroException e) {
            fail("Expected OutOfRangeException, but got ZeroException");
        }
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
    public void testTooFewObservationsInGuesser() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1, 0, 1),
            new WeightedObservedPoint(1, 1, 2)
        };
        try {
            new GaussianFitter.ParameterGuesser(points);
            fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            // The constructor is `throw new NumberIsTooSmallException(observations.length, 3, true);`
            assertEquals(2, e.getArgument()); // actual number of observations
            assertEquals(3, e.getLowerBound()); // required minimum number of observations
        }
    }

    @Test
    public void testFitMethodWithNoObservations() {
        GaussianFitter fitter = new GaussianFitter(new DummyOptimizer());
        try {
            fitter.fit();
            fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            assertEquals(0, e.getArgument());
            assertEquals(3, e.getLowerBound());
        }
    }

    @Test
    public void testFitMethodWithInsufficientObservations() {
        GaussianFitter fitter = new GaussianFitter(new DummyOptimizer());
        fitter.addObservedPoint(1, 2);
        fitter.addObservedPoint(3, 4);
        try {
            fitter.fit();
            fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            assertEquals(2, e.getArgument());
            assertEquals(3, e.getLowerBound());
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
    @Test
    public void testParameterGuesserComparatorSortOrder() {
        Comparator<WeightedObservedPoint> comparator = new GaussianFitter.ParameterGuesser(new WeightedObservedPoint[3]).createWeightedObservedPointComparator();

        WeightedObservedPoint p1 = new WeightedObservedPoint(1, 1.0, 10.0);
        WeightedObservedPoint p2 = new WeightedObservedPoint(1, 1.0, 5.0); // Same X, smaller Y
        WeightedObservedPoint p3 = new WeightedObservedPoint(1, 2.0, 5.0); // Larger X

        assertTrue(comparator.compare(p1, p2) > 0); // p1 should come after p2 if only comparing Y
        assertTrue(comparator.compare(p2, p1) < 0); // p2 should come before p1 if only comparing Y

        assertTrue(comparator.compare(p2, p3) < 0); // p2 should come before p3
        assertTrue(comparator.compare(p3, p2) > 0); // p3 should come after p2

        WeightedObservedPoint p4 = new WeightedObservedPoint(1, 1.0, 10.0); // Same as p1
        assertEquals(0, comparator.compare(p1, p4));
    }

    // Added test for interpolation when y is exactly one of the point's y values
    @Test
    public void testInterpolateXAtYExactMatch() throws Exception {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1, 0, 0.1),
            new WeightedObservedPoint(1, 1, 0.5),
            new WeightedObservedPoint(1, 2, 0.1)
        };
        // Making ParameterGuesser visible to call its methods.
        // Since we cannot access private methods directly, we test behavior indirectly.
        // The `interpolateXAtY` method's behavior when `y` matches a point's `y` is implicitly tested
        // by how `getInterpolationPointsForY` operates and how `interpolateXAtY` uses its results.
        // For this specific test, we can simulate the scenario by manually constructing the points that `interpolateXAtY` would receive.

        // Simulate a call to interpolateXAtY where one of the points has y == target y
        // This is handled inside getInterpolationPointsForY and then interpolateXAtY
        // If pointA.getY() == y, it returns pointA.getX().
        // Let's construct a scenario where this might happen.

        // This test will indirectly check the behavior of interpolateXAtY, specifically the part:
        // if (pointA.getY() == y) { return pointA.getX(); }
        // if (pointB.getY() == y) { return pointB.getX(); }
        // We can test this by providing points such that the target y matches one of the bounds.
        // The method `getInterpolationPointsForY` is responsible for finding these points.

        // Let's use the existing test framework to indirectly test this.
        // When y = 0.1, it should find the point with y=0.1 and return its x.
        // The search for interpolation points needs to be carefully done.
        // Consider points sorted by X: (0, 0.1), (1, 0.5), (2, 0.1)
        // If we search for y = 0.1:
        // For the pair (0, 0.1) and (1, 0.5), y=0.1 is between 0.1 and 0.5.
        // So `isBetween(0.1, 0.1, 0.5)` is true.
        // `getInterpolationPointsForY` will return {(0, 0.1), (1, 0.5)}.
        // Then `interpolateXAtY` will be called with these two points.
        // Inside `interpolateXAtY`, `pointA` is (0, 0.1) and `pointB` is (1, 0.5).
        // Since `pointA.getY() == y` (0.1 == 0.1), it should return `pointA.getX()` which is 0.
        // The test below will simulate this by calling `getInterpolationPointsForY` and then checking the resulting points.

        WeightedObservedPoint[] interpolationPoints = guesser.getInterpolationPointsForY(points, 1, -1, 0.1);
        assertEquals(0.1, interpolationPoints[0].getY(), 1e-9); // The first point returned by getInterpolationPointsForY
        assertEquals(0.0, interpolationPoints[0].getX(), 1e-9); // Its X value

        WeightedObservedPoint[] interpolationPoints2 = guesser.getInterpolationPointsForY(points, 1, 1, 0.1);
        assertEquals(0.1, interpolationPoints2[0].getY(), 1e-9); // The first point returned by getInterpolationPointsForY
        assertEquals(0.0, interpolationPoints2[0].getX(), 1e-9); // Its X value
    }
}
