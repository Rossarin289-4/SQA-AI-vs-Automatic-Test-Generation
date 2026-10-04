```java
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

public class GaussianFitterTest {
    @Test
    public void testGuesserRejectsNullPoints() throws Exception {
        try {
            new GaussianFitter.ParameterGuesser(null);
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testGuesserRejectsTwoPoints() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0)
        };
        try {
            new GaussianFitter.ParameterGuesser(points);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testGuesserAcceptsThreePointsAndFindsPeak() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 2.0, 1.0),
            new WeightedObservedPoint(1.0, 0.0, 2.0),
            new WeightedObservedPoint(1.0, 1.0, 4.0)
        };
        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();
        assertEquals(4.0, guess[0], 0.0);
        assertEquals(1.0, guess[1], 0.0);
        assertEquals(2.0 / (2.0 * Math.sqrt(2.0 * Math.log(2.0))), guess[2], 1e-12);
    }

    @Test
    public void testGuesserReturnsDefensiveCopies() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0),
            new WeightedObservedPoint(1.0, 2.0, 0.0)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] first = guesser.guess();
        first[0] = 99.0;
        double[] second = guesser.guess();
        assertEquals(2.0, second[0], 0.0);
        assertEquals(1.0, second[1], 0.0);
    }

    @Test
    public void testGuesserUsesFullSpanWhenHalfHeightOutsideRange() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 0.0, -2.0),
            new WeightedObservedPoint(1.0, 1.0, 0.0),
            new WeightedObservedPoint(1.0, 2.0, 4.0)
        };
        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();
        assertEquals(4.0, guess[0], 0.0);
        assertEquals(2.0, guess[1], 0.0);
        assertEquals(2.0 / Math.sqrt(2.0 * Math.log(2.0)), guess[2], 1e-12);
    }

    @Test
    public void testGuesserInterpolatesBothSidesOfPeak() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0),
            new WeightedObservedPoint(1.0, 2.0, 4.0),
            new WeightedObservedPoint(1.0, 3.0, 2.0),
            new WeightedObservedPoint(1.0, 4.0, 0.0)
        };
        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();
        assertEquals(4.0, guess[0], 0.0);
        assertEquals(2.0, guess[1], 0.0);
        assertEquals(2.0 / Math.sqrt(2.0 * Math.log(2.0)), guess[2], 1e-12);
    }

    @Test
    public void testGuesserSortsPointsBeforeProcessing() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 2.0, 0.0),
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 1.0, 4.0)
        };
        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();
        assertEquals(1.0, guess[1], 0.0);
        assertEquals(2.0 / Math.sqrt(2.0 * Math.log(2.0)), guess[2], 1e-12);
    }

    @Test
    public void testGuesserKeepsFirstPeakWhenMaximumIsTied() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 0.0, 4.0),
            new WeightedObservedPoint(1.0, 1.0, 4.0),
            new WeightedObservedPoint(1.0, 2.0, 0.0)
        };
        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();
        assertEquals(0.0, guess[1], 0.0);
    }

    @Test
    public void testGuesserUsesExactHalfHeightEndpoints() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0),
            new WeightedObservedPoint(1.0, 2.0, 4.0),
            new WeightedObservedPoint(1.0, 3.0, 2.0),
            new WeightedObservedPoint(1.0, 4.0, 0.0)
        };
        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();
        assertEquals(2.0, guess[2] * 2.0 * Math.sqrt(2.0 * Math.log(2.0)), 1e-12);
    }

    @Test
    public void testGuesserPeakAtFirstSortedPoint() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 2.0, 0.0),
            new WeightedObservedPoint(1.0, 0.0, 4.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0)
        };
        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();
        assertEquals(0.0, guess[1], 0.0);
    }

    @Test
    public void testGuesserPeakAtLastSortedPoint() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 2.0, 4.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0)
        };
        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();
        assertEquals(2.0, guess[1], 0.0);
    }

    @Test
    public void testGuesserOrdersEqualXByY() throws Exception {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 1.0, 4.0),
            new WeightedObservedPoint(1.0, 1.0, 0.0),
            new WeightedObservedPoint(1.0, 2.0, 2.0)
        };
        double[] guess = new GaussianFitter.ParameterGuesser(points).guess();
        assertEquals(4.0, guess[0], 0.0);
        assertEquals(1.0, guess[1], 0.0);
    }
}
```