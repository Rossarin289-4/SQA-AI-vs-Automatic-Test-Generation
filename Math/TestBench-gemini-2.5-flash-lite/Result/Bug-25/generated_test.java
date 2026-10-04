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

public class HarmonicFitterTest {

    // Helper method to create WeightedObservedPoint arrays.
    private WeightedObservedPoint[] createObservations(double[][] data) {
        WeightedObservedPoint[] observations = new WeightedObservedPoint[data.length];
        for (int i = 0; i < data.length; i++) {
            // Default weight of 1.0 for simplicity.
            observations[i] = new WeightedObservedPoint(1.0, data[i][0], data[i][1]);
        }
        return observations;
    }

    @Test
    public void testParameterGuesserMinimumObservations() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {1.0, 0.0}, {2.0, -1.0}, {3.0, 0.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        assertEquals(4, observations.length);
        assertTrue(params.length == 3);
        // Values derived from tracing the reference source code.
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
    public void testParameterGuesserGuessPhiForCosine() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {1.0, 0.0}, {2.0, -1.0}, {3.0, 0.0}, {4.0, 1.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        // Phase should be close to 0 for a cosine wave starting at max.
        assertEquals(0.0, params[2], 0.2); // Phase
    }

    @Test
    public void testParameterGuesserGuessPhiForSine() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 0.0}, {1.0, 1.0}, {2.0, 0.0}, {3.0, -1.0}, {4.0, 0.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        // Phase should be close to PI/2 for a sine wave starting at 0, increasing.
        assertEquals(FastMath.PI / 2.0, params[2], 0.2); // Phase
    }

    @Test
    public void testParameterGuesserConstantData() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 2.0}, {1.0, 2.0}, {2.0, 2.0}, {3.0, 2.0}, {4.0, 2.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        // For constant data, amplitude should be 0. Omega and Phi are not well-defined but should be finite.
        assertEquals(0.0, params[0], 1e-9); // Amplitude
        assertTrue(Double.isFinite(params[1])); // Omega
        assertTrue(Double.isFinite(params[2])); // Phi
    }

    @Test
    public void testParameterGuesserWithXRangeZero() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {1.0, 1.0}, {1.0, 2.0}, {1.0, 3.0}, {1.0, 4.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        // The ZeroException is thrown in guessAOmega, which is called by guess().
        try {
            guesser.guess();
            fail("Expected ZeroException");
        } catch (ZeroException e) {
            // Expected exception caught.
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
        // Values derived from tracing the reference source code.
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
        // Values derived from tracing the reference source code after sorting.
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
        // Amplitude and Omega should be consistent. Phase is relative and might shift.
        // The calculation of phase uses atan2(-fsMean, fcMean). For this input,
        // the reference code yields a phase close to PI/2.
        assertEquals(1.0, params[0], 0.1); // Amplitude
        assertEquals(Math.PI / 2.0, params[1], 0.1); // Omega
        assertEquals(Math.PI / 2.0, params[2], 0.1); // Phase
    }

    // Additional tests to cover edge cases and ensure robustness.

    @Test
    public void testParameterGuesserOddFrequency() {
        // Example with a frequency that might be harder to guess precisely.
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 1.0}, {0.5, 0.0}, {1.0, -1.0}, {1.5, 0.0}, {2.0, 1.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        // Values derived from tracing the reference source code.
        assertEquals(1.0, params[0], 0.1); // Amplitude
        assertEquals(Math.PI, params[1], 0.1); // Omega (frequency = 1 cycle per 2 units of x)
        assertEquals(0.0, params[2], 0.2); // Phase
    }

    @Test
    public void testParameterGuesserWithHighAmplitude() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 10.0}, {1.0, 0.0}, {2.0, -10.0}, {3.0, 0.0}, {4.0, 10.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        // High amplitude should still be correctly guessed.
        assertEquals(10.0, params[0], 0.5); // Amplitude
        assertEquals(Math.PI / 2.0, params[1], 0.1); // Omega
        assertEquals(0.0, params[2], 0.2); // Phase
    }

    @Test
    public void testParameterGuesserWithLowAmplitude() {
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, 0.1}, {1.0, 0.0}, {2.0, -0.1}, {3.0, 0.0}, {4.0, 0.1}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        // Low amplitude should still be correctly guessed.
        assertEquals(0.1, params[0], 0.01); // Amplitude
        assertEquals(Math.PI / 2.0, params[1], 0.1); // Omega
        assertEquals(0.0, params[2], 0.2); // Phase
    }

    @Test
    public void testParameterGuesserWithPhaseShift() {
        // A cosine wave shifted by PI/4
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, FastMath.cos(FastMath.PI / 4.0)},
                {1.0, FastMath.cos(Math.PI / 2.0 + FastMath.PI / 4.0)},
                {2.0, FastMath.cos(Math.PI + FastMath.PI / 4.0)},
                {3.0, FastMath.cos(3.0 * Math.PI / 2.0 + FastMath.PI / 4.0)},
                {4.0, FastMath.cos(2.0 * Math.PI + FastMath.PI / 4.0)}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        // Expected phase should be close to PI/4.
        assertEquals(FastMath.PI / 4.0, params[2], 0.2); // Phase
    }

    @Test
    public void testParameterGuesserWithNegativeAmplitude() {
        // HarmonicOscillator.Parametric assumes positive amplitude in the model.
        // The guesser might still produce a negative amplitude if the data suggests it.
        WeightedObservedPoint[] observations = createObservations(new double[][]{
                {0.0, -1.0}, {1.0, 0.0}, {2.0, 1.0}, {3.0, 0.0}, {4.0, -1.0}
        });
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(observations);
        double[] params = guesser.guess();
        // The guesser may return a negative amplitude, or it might normalize it.
        // Based on the source, it can return a negative 'a' if c1/c2 is negative.
        // Here, tracing suggests it returns approximately -1.0 amplitude.
        assertEquals(-1.0, params[0], 0.1); // Amplitude
        assertEquals(Math.PI / 2.0, params[1], 0.1); // Omega
        assertEquals(FastMath.PI, params[2], 0.1); // Phase (shifted by PI for negative amplitude)
    }
}
