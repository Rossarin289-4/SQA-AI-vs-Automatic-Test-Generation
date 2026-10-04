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
    @Test
    public void testGuesserRejectsThreePoints() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 0, 1),
            new WeightedObservedPoint(1, 1, 2),
            new WeightedObservedPoint(1, 2, 3)
        };
        try {
            new HarmonicFitter.ParameterGuesser(points);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) { }
    }

    @Test
    public void testGuesserAcceptsExactlyFourPoints() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 0, 0),
            new WeightedObservedPoint(1, 1, 1),
            new WeightedObservedPoint(1, 2, 0),
            new WeightedObservedPoint(1, 3, -1)
        };
        assertEquals(3, new HarmonicFitter.ParameterGuesser(points).guess().length);
    }

    @Test
    public void testGuessReturnsThreeParameters() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 0, 1),
            new WeightedObservedPoint(1, 1, 0),
            new WeightedObservedPoint(1, 2, -1),
            new WeightedObservedPoint(1, 3, 0),
            new WeightedObservedPoint(1, 4, 1)
        };
        assertEquals(3, new HarmonicFitter.ParameterGuesser(points).guess().length);
    }

    @Test
    public void testGuessSortsUnorderedObservations() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 2, -1),
            new WeightedObservedPoint(1, 0, 1),
            new WeightedObservedPoint(1, 3, 0),
            new WeightedObservedPoint(1, 1, 0),
            new WeightedObservedPoint(1, 4, 1)
        };
        double[] sorted = new HarmonicFitter.ParameterGuesser(points).guess();

        WeightedObservedPoint[] ordered = {
            new WeightedObservedPoint(1, 0, 1),
            new WeightedObservedPoint(1, 1, 0),
            new WeightedObservedPoint(1, 2, -1),
            new WeightedObservedPoint(1, 3, 0),
            new WeightedObservedPoint(1, 4, 1)
        };
        double[] alreadySorted = new HarmonicFitter.ParameterGuesser(ordered).guess();
        assertEquals(alreadySorted[0], sorted[0], 1e-12);
        assertEquals(alreadySorted[1], sorted[1], 1e-12);
        assertEquals(alreadySorted[2], sorted[2], 1e-12);
    }

    @Test
    public void testGuessFallbackUsesRangeAndYExtrema() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 0, 0),
            new WeightedObservedPoint(1, 1, 2),
            new WeightedObservedPoint(1, 2, 0),
            new WeightedObservedPoint(1, 3, -2),
            new WeightedObservedPoint(1, 4, 0)
        };
        double[] guess = new HarmonicFitter.ParameterGuesser(points).guess();
        assertEquals(2.0, guess[0], 1e-12);
        assertEquals(2 * Math.PI / 4, guess[1], 1e-12);
    }

    @Test
    public void testGuessFallbackWithShorterRange() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 0, 0),
            new WeightedObservedPoint(1, 0.5, 2),
            new WeightedObservedPoint(1, 1, 0),
            new WeightedObservedPoint(1, 1.5, -2),
            new WeightedObservedPoint(1, 2, 0)
        };
        double[] guess = new HarmonicFitter.ParameterGuesser(points).guess();
        assertEquals(2.0, guess[0], 1e-12);
        assertEquals(2 * Math.PI / 2, guess[1], 1e-12);
    }

    @Test
    public void testGuessUsesYMaximumAmongInteriorObservations() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 0, 0),
            new WeightedObservedPoint(1, 1, 3),
            new WeightedObservedPoint(1, 2, 0),
            new WeightedObservedPoint(1, 3, -1),
            new WeightedObservedPoint(1, 4, 0)
        };
        assertEquals(2.0, new HarmonicFitter.ParameterGuesser(points).guess()[0], 1e-12);
    }

    @Test
    public void testGuessUsesYMinimumAmongInteriorObservations() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 0, 0),
            new WeightedObservedPoint(1, 1, 1),
            new WeightedObservedPoint(1, 2, 0),
            new WeightedObservedPoint(1, 3, -3),
            new WeightedObservedPoint(1, 4, 0)
        };
        assertEquals(2.0, new HarmonicFitter.ParameterGuesser(points).guess()[0], 1e-12);
    }

    @Test
    public void testGuessIsUnaffectedBySourceArrayReassignment() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 0, 0),
            new WeightedObservedPoint(1, 1, 2),
            new WeightedObservedPoint(1, 2, 0),
            new WeightedObservedPoint(1, 3, -2),
            new WeightedObservedPoint(1, 4, 0)
        };
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        points[0] = new WeightedObservedPoint(1, 100, 100);
        assertEquals(2.0, guesser.guess()[0], 1e-12);
    }

    @Test
    public void testGuessPhaseIsFiniteForFallbackSample() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 0, 0),
            new WeightedObservedPoint(1, 1, 2),
            new WeightedObservedPoint(1, 2, 0),
            new WeightedObservedPoint(1, 3, -2),
            new WeightedObservedPoint(1, 4, 0)
        };
        assertTrue(Double.isFinite(new HarmonicFitter.ParameterGuesser(points).guess()[2]));
    }

    @Test
    public void testGuessHandlesRepeatedAbscissaWithNonzeroOverallRange() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, 0, 0),
            new WeightedObservedPoint(1, 1, 2),
            new WeightedObservedPoint(1, 1, 1),
            new WeightedObservedPoint(1, 2, -2),
            new WeightedObservedPoint(1, 3, 0)
        };
        double[] guess = new HarmonicFitter.ParameterGuesser(points).guess();
        assertEquals(3, guess.length);
    }

    @Test
    public void testGuessUsesFirstAndLastAbscissaForFallbackFrequency() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1, -2, 0),
            new WeightedObservedPoint(1, -1, 2),
            new WeightedObservedPoint(1, 0, 0),
            new WeightedObservedPoint(1, 1, -2),
            new WeightedObservedPoint(1, 2, 0)
        };
        assertEquals(2 * Math.PI / 4,
                     new HarmonicFitter.ParameterGuesser(points).guess()[1], 1e-12);
    }
}
