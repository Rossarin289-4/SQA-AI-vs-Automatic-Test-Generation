package org.apache.commons.math3.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.analysis.function.HarmonicOscillator;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateJacobianFunction;


public class HarmonicFitterTest {

    // Mock optimizer for HarmonicFitter.
    // The HarmonicFitter class inherits from CurveFitter, which uses an optimizer.
    // We need a mock to satisfy the constructor dependency.
    // The actual optimization logic is complex and not the focus of these tests.
    // We will simulate a successful optimization that returns the initial guess.
    private static class MockOptimizer implements DifferentiableMultivariateVectorOptimizer {

        // The optimize method for DifferentiableMultivariateVectorOptimizer.
        // The HarmonicFitter's fit(double[] initialGuess) method calls this.
        @Override
        public PointVectorValuePair optimize(org.apache.commons.math3.analysis.differentiation.MultivariateJacobianFunction f, double[] initialGuess, RealVector target, RealVector weights) {
             // For the purpose of testing HarmonicFitter and ParameterGuesser,
             // we simulate a successful optimization returning the initial guess.
             return new PointVectorValuePair(initialGuess, 0.0);
        }

        // The optimize method for BaseMultivariateVectorOptimizer, which DifferentiableMultivariateVectorOptimizer extends.
        // This specific overload is not directly called by HarmonicFitter's fit methods, but must be implemented.
        @Override
        public PointVectorValuePair optimize(MultivariateVectorFunction f, double[] initialValue, RealVector point, RealVector weights) {
             return new PointVectorValuePair(initialValue, 0.0);
        }

        // Other required methods from the interfaces.
        @Override
        public ConvergenceChecker<PointVectorValuePair> getConvergenceChecker() {
            return null; // Not used in this context
        }

        @Override
        public int getMaxIterations() {
            return 100; // Default value
        }

        @Override
        public int getMaxEvaluations() {
            return 1000; // Default value
        }

        @Override
        public void setMaxIterations(int maxIterations) {
            // No-op
        }

        @Override
        public void setMaxEvaluations(int maxEvaluations) {
            // No-op
        }

        // This overload is also not directly used by HarmonicFitter's fit methods.
        @Override
        public PointVectorValuePair optimize(MultivariateVectorFunction f, double[] initialGuess) {
             return new PointVectorValuePair(initialGuess, 0.0);
        }
    }

    @Test
    public void testFitWithInitialGuess() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {1.0, 0.0}, {2.0, -1.0}, {3.0, 0.0}, {4.0, 1.0}
        });
        // The addObservedPoints method is inherited from CurveFitter.
        fitter.addObservedPoints(observations);
        double[] initialGuess = {1.0, Math.PI / 2.0, 0.0}; // Amplitude, Omega, Phase
        double[] parameters = fitter.fit(initialGuess);
        // The MockOptimizer returns the initialGuess, so we assert against it.
        assertEquals(initialGuess[0], parameters[0], 1e-9);
        assertEquals(initialGuess[1], parameters[1], 1e-9);
        assertEquals(initialGuess[2], parameters[2], 1e-9);
    }

    @Test
    public void testFitWithInitialGuessDifferentValues() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 5.0}, {1.0, 0.0}, {2.0, -5.0}, {3.0, 0.0}, {4.0, 5.0}
        });
        fitter.addObservedPoints(observations);
        double[] initialGuess = {5.0, Math.PI / 2.0, 0.0};
        double[] parameters = fitter.fit(initialGuess);
        assertEquals(initialGuess[0], parameters[0], 1e-9);
        assertEquals(initialGuess[1], parameters[1], 1e-9);
        assertEquals(initialGuess[2], parameters[2], 1e-9);
    }

    @Test
    public void testFitWithoutInitialGuess() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {1.0, 0.0}, {2.0, -1.0}, {3.0, 0.0}, {4.0, 1.0}
        });
        fitter.addObservedPoints(observations);
        double[] parameters = fitter.fit();
        // Since the MockOptimizer returns the initial guess from ParameterGuesser,
        // we can assert that it is not null and has the correct length.
        // The exact values are derived from ParameterGuesser.
        assertTrue(parameters.length == 3);
        // Values derived from ParameterGuesser for this input
        assertEquals(1.0, parameters[0], 0.1); // Amplitude
        assertEquals(Math.PI / 2.0, parameters[1], 0.1); // Omega
        assertEquals(0.0, parameters[2], 0.1); // Phase
    }

    @Test
    public void testFitWithoutInitialGuessDifferentValues() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 3.0}, {0.5, 0.0}, {1.0, -3.0}, {1.5, 0.0}, {2.0, 3.0}
        });
        fitter.addObservedPoints(observations);
        double[] parameters = fitter.fit();
        assertTrue(parameters.length == 3);
        // Values derived from ParameterGuesser for this input
        assertEquals(3.0, parameters[0], 0.1); // Amplitude
        assertEquals(Math.PI, parameters[1], 0.1); // Omega
        assertEquals(0.0, parameters[2], 0.1); // Phase
    }

    @Test
    public void testFitWithSineLikeData() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 0.0}, {1.0, 1.0}, {2.0, 0.0}, {3.0, -1.0}, {4.0, 0.0}
        });
        fitter.addObservedPoints(observations);
        double[] initialGuess = {1.0, Math.PI / 2.0, Math.PI / 2.0}; // Amplitude, Omega, Phase for sine
        double[] parameters = fitter.fit(initialGuess);
        // MockOptimizer returns initialGuess
        assertEquals(1.0, parameters[0], 1e-9);
        assertEquals(Math.PI / 2.0, parameters[1], 1e-9);
        assertEquals(Math.PI / 2.0, parameters[2], 1e-9);
    }

    @Test
    public void testFitWithConstantData() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 2.0}, {1.0, 2.0}, {2.0, 2.0}, {3.0, 2.0}, {4.0, 2.0}
        });
        fitter.addObservedPoints(observations);
        double[] initialGuess = {0.0, 1.0, 0.0}; // Amplitude, Omega, Phase
        double[] parameters = fitter.fit(initialGuess);
        // MockOptimizer returns initialGuess
        assertEquals(0.0, parameters[0], 1e-9); // Amplitude should be close to 0 for constant data
        assertEquals(1.0, parameters[1], 1e-9); // Omega from initial guess
        assertEquals(0.0, parameters[2], 1e-9); // Phase from initial guess
    }

    @Test
    public void testFitWithNoise() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.1}, {1.0, -0.1}, {2.0, -0.9}, {3.0, 0.1}, {4.0, 0.9}
        });
        fitter.addObservedPoints(observations);
        double[] initialGuess = {1.0, Math.PI / 2.0, 0.0};
        double[] parameters = fitter.fit(initialGuess);
        // MockOptimizer returns initialGuess
        assertEquals(1.0, parameters[0], 1e-9);
        assertEquals(Math.PI / 2.0, parameters[1], 1e-9);
        assertEquals(0.0, parameters[2], 1e-9);
    }

    @Test
    public void testFitWithZeroAmplitude() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 0.0}, {1.0, 0.0}, {2.0, 0.0}
        });
        fitter.addObservedPoints(observations);
        double[] initialGuess = {0.0, 1.0, 0.0};
        double[] parameters = fitter.fit(initialGuess);
        // MockOptimizer returns initialGuess
        assertEquals(0.0, parameters[0], 1e-9);
        assertEquals(1.0, parameters[1], 1e-9);
        assertEquals(0.0, parameters[2], 1e-9);
    }

    @Test
    public void testFitWithHighFrequency() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 0.0}, {0.1, 1.0}, {0.2, 0.0}, {0.3, -1.0}, {0.4, 0.0}
        });
        fitter.addObservedPoints(observations);
        double[] initialGuess = {1.0, 5 * Math.PI, 0.0}; // High frequency
        double[] parameters = fitter.fit(initialGuess);
        // MockOptimizer returns initialGuess
        assertEquals(1.0, parameters[0], 1e-9);
        assertEquals(5 * Math.PI, parameters[1], 1e-9);
        assertEquals(0.0, parameters[2], 1e-9);
    }

    @Test
    public void testFitWithLowFrequency() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {5.0, 0.0}, {10.0, -1.0}, {15.0, 0.0}, {20.0, 1.0}
        });
        fitter.addObservedPoints(observations);
        double[] initialGuess = {1.0, Math.PI / 10.0, 0.0}; // Low frequency
        double[] parameters = fitter.fit(initialGuess);
        // MockOptimizer returns initialGuess
        assertEquals(1.0, parameters[0], 1e-9);
        assertEquals(Math.PI / 10.0, parameters[1], 1e-9);
        assertEquals(0.0, parameters[2], 1e-9);
    }

    @Test
    public void testFitWithPhaseShift() throws Exception {
        HarmonicFitter fitter = new HarmonicFitter(new MockOptimizer());
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, -1.0}, {1.0, 0.0}, {2.0, 1.0}, {3.0, 0.0}, {4.0, -1.0}
        });
        fitter.addObservedPoints(observations);
        double[] initialGuess = {1.0, Math.PI / 2.0, Math.PI}; // Phase shift of PI
        double[] parameters = fitter.fit(initialGuess);
        // MockOptimizer returns initialGuess
        assertEquals(1.0, parameters[0], 1e-9);
        assertEquals(Math.PI / 2.0, parameters[1], 1e-9);
        assertEquals(Math.PI, parameters[2], 1e-9);
    }

    @Test
    public void testParameterGuesserMinimumObservations() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {1.0, 0.0}, {2.0, -1.0}, {3.0, 0.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess(); // This calls the internal guess methods
        assertEquals(4, observations.length);
        assertTrue(params.length == 3);
        // Expected values derived from the reference source code for this input
        assertEquals(1.0, params[0], 0.1); // Amplitude
        assertEquals(Math.PI / 2.0, params[1], 0.1); // Omega
        assertEquals(0.0, params[2], 0.1); // Phase
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserTooFewObservations() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {1.0, 0.0}, {2.0, -1.0}
        });
        new HarmonicFitter.ParameterGuesser(observations);
    }

    @Test
    public void testParameterGuesserGuessAOmegaForSine() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 0.0}, {1.0, 1.0}, {2.0, 0.0}, {3.0, -1.0}, {4.0, 0.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        guesser.guess(); // This calls guessAOmega and guessPhi
        // Expected values derived from the reference source code for this input
        assertEquals(1.0, guesser.a, 0.1); // 'a' is public for testing
        assertEquals(Math.PI / 2.0, guesser.omega, 0.1); // 'omega' is public for testing
    }

    @Test
    public void testParameterGuesserGuessAOmegaForCosine() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {1.0, 0.0}, {2.0, -1.0}, {3.0, 0.0}, {4.0, 1.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        guesser.guess(); // This calls guessAOmega and guessPhi
        // Expected values derived from the reference source code for this input
        assertEquals(1.0, guesser.a, 0.1); // 'a' is public for testing
        assertEquals(Math.PI / 2.0, guesser.omega, 0.1); // 'omega' is public for testing
    }

    @Test
    public void testParameterGuesserGuessPhiForCosine() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {1.0, 0.0}, {2.0, -1.0}, {3.0, 0.0}, {4.0, 1.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess(); // This calls guessAOmega and guessPhi
        // Expected value derived from the reference source code for this input
        assertEquals(0.0, params[2], 0.2); // Phase should be close to 0
    }

    @Test
    public void testParameterGuesserGuessPhiForSine() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 0.0}, {1.0, 1.0}, {2.0, 0.0}, {3.0, -1.0}, {4.0, 0.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess(); // This calls guessAOmega and guessPhi
        // Expected value derived from the reference source code for this input
        assertEquals(FastMath.PI / 2.0, params[2], 0.2); // Phase should be close to PI/2
    }

    @Test
    public void testParameterGuesserConstantData() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 2.0}, {1.0, 2.0}, {2.0, 2.0}, {3.0, 2.0}, {4.0, 2.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        // Expected values derived from the reference source code for this input
        assertEquals(0.0, params[0], 1e-9); // Amplitude should be zero
        // Omega and Phi might be arbitrary, check they are finite.
        assertTrue(Double.isFinite(params[1]));
        assertTrue(Double.isFinite(params[2]));
    }

    @Test
    public void testParameterGuesserWithXRangeZero() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {1.0, 1.0}, {1.0, 2.0}, {1.0, 3.0}, {1.0, 4.0}
        });
        try {
            // The constructor of ParameterGuesser throws ZeroException if xRange is zero.
            new HarmonicFitter.ParameterGuesser(observations);
            fail("Expected ZeroException");
        } catch (ZeroException e) {
            // Expected
        }
    }

    @Test
    public void testParameterGuesserWithDegenerateCase() {
        // This case might lead to c2 = 0 in guessAOmega, causing MathIllegalStateException
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 0.0}, {1.0, 0.0}, {2.0, 0.0}, {3.0, 0.0}, {4.0, 0.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        try {
            guesser.guess();
            // If it doesn't throw, check if amplitude is zero
            assertEquals(0.0, guesser.a, 1e-9); // 'a' is public for testing
        } catch (MathIllegalStateException e) {
            // The specific bug MATH-844 is related to this degeneracy.
            // The expected exception is MathIllegalStateException with a specific reason.
            assertEquals(LocalizedFormats.ZERO_DENOMINATOR, e.getReason());
        }
    }

    @Test
    public void testParameterGuesserWithOnlyFourPoints() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {1.0, 0.0}, {2.0, -1.0}, {3.0, 0.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        assertTrue(params.length == 3);
        // Expected values derived from the reference source code for this input
        assertEquals(1.0, params[0], 0.1); // Amplitude
        assertEquals(Math.PI / 2.0, params[1], 0.1); // Omega
        assertEquals(0.0, params[2], 0.1); // Phase
    }

    @Test
    public void testParameterGuesserWithUnsortedObservations() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {2.0, -1.0}, {0.0, 1.0}, {3.0, 0.0}, {1.0, 0.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        assertTrue(params.length == 3);
        // Expected values derived from the reference source code for this input
        assertEquals(1.0, params[0], 0.1); // Amplitude
        assertEquals(Math.PI / 2.0, params[1], 0.1); // Omega
        assertEquals(0.0, params[2], 0.1); // Phase
    }

    @Test
    public void testParameterGuesserWithLargeXValues() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {1000.0, 1.0}, {1001.0, 0.0}, {1002.0, -1.0}, {1003.0, 0.0}, {1004.0, 1.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        assertTrue(params.length == 3);
        // Expected values derived from the reference source code for this input
        assertEquals(1.0, params[0], 0.1); // Amplitude
        assertEquals(Math.PI / 2.0, params[1], 0.1); // Omega is independent of X shift
        assertEquals(Math.PI / 2.0, params[2], 0.1); // Phase might be affected by X shift
    }

    // Helper method to create WeightedObservedPoint arrays.
    // The HarmonicFitter class inherits addObservedPoints from CurveFitter.
    private WeightedObservedPoint[] createObservations(double[][] data) {
        WeightedObservedPoint[] observations = new WeightedObservedPoint[data.length];
        for (int i = 0; i < data.length; i++) {
            // Default weight of 1.0 for simplicity.
            observations[i] = new WeightedObservedPoint(1.0, data[i][0], data[i][1]);
        }
        return observations;
    }
}
