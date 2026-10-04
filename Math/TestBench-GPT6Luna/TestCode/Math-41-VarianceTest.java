package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.stat.descriptive.WeightedEvaluation;
import org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic;
import org.apache.commons.math.util.MathUtils;

public class VarianceTest {
    @Test
    public void testEmptyResultAndCount() throws Exception {
        Variance variance = new Variance();
        assertTrue(Double.isNaN(variance.getResult()));
        assertEquals(0L, variance.getN());
    }

    @Test
    public void testSingleIncrementHasZeroVariance() throws Exception {
        Variance variance = new Variance();
        variance.increment(7.0);
        assertEquals(0.0, variance.getResult(), 0.0);
        assertEquals(1L, variance.getN());
    }

    @Test
    public void testIncrementalSampleVariance() throws Exception {
        Variance variance = new Variance();
        variance.increment(1.0);
        variance.increment(3.0);
        assertEquals(2.0, variance.getResult(), 1e-12);
        assertEquals(2L, variance.getN());
    }

    @Test
    public void testIncrementalPopulationVariance() throws Exception {
        Variance variance = new Variance(false);
        variance.increment(1.0);
        variance.increment(3.0);
        assertEquals(1.0, variance.getResult(), 1e-12);
    }

    @Test
    public void testClearResetsCountAndResult() throws Exception {
        Variance variance = new Variance();
        variance.increment(1.0);
        variance.increment(3.0);
        variance.clear();
        assertEquals(0L, variance.getN());
        assertTrue(Double.isNaN(variance.getResult()));
    }

    @Test
    public void testEvaluateEmptyArray() throws Exception {
        assertTrue(Double.isNaN(new Variance().evaluate(new double[0])));
    }

    @Test
    public void testEvaluateSingleValueArray() throws Exception {
        assertEquals(0.0, new Variance().evaluate(new double[] { 9.0 }), 0.0);
    }

    @Test
    public void testEvaluateSampleVariance() throws Exception {
        assertEquals(2.0, new Variance().evaluate(new double[] { 1.0, 3.0 }), 1e-12);
    }

    @Test
    public void testEvaluatePopulationVarianceAfterSetter() throws Exception {
        Variance variance = new Variance();
        variance.setBiasCorrected(false);
        assertFalse(variance.isBiasCorrected());
        assertEquals(1.0, variance.evaluate(new double[] { 1.0, 3.0 }), 1e-12);
    }

    @Test
    public void testEvaluateUsesWholeRequestedSubarray() throws Exception {
        Variance variance = new Variance();
        assertEquals(2.0, variance.evaluate(new double[] { 50.0, 1.0, 3.0, 60.0 }, 1, 2), 1e-12);
    }

    @Test
    public void testExternalMomentControlsIncrementalResult() throws Exception {
        SecondMoment moment = new SecondMoment();
        Variance variance = new Variance(moment);
        variance.increment(100.0);
        assertEquals(0L, variance.getN());
        moment.increment(1.0);
        moment.increment(3.0);
        assertEquals(2.0, variance.getResult(), 1e-12);
        assertEquals(2L, variance.getN());
    }

    @Test
    public void testExternalMomentClearDoesNotClearMoment() throws Exception {
        SecondMoment moment = new SecondMoment();
        Variance variance = new Variance(moment);
        moment.increment(1.0);
        moment.increment(3.0);
        variance.clear();
        assertEquals(2L, variance.getN());
        assertEquals(2.0, variance.getResult(), 1e-12);
    }

    @Test
    public void testCopyPreservesStateAndIsIndependent() throws Exception {
        Variance original = new Variance();
        original.increment(1.0);
        original.increment(3.0);
        Variance copy = original.copy();
        original.increment(5.0);
        assertEquals(2L, copy.getN());
        assertEquals(2.0, copy.getResult(), 1e-12);
        assertEquals(3L, original.getN());
    }

    @Test
    public void testCopyPreservesPopulationSetting() throws Exception {
        Variance original = new Variance(false);
        original.increment(1.0);
        original.increment(3.0);
        Variance copy = original.copy();
        assertFalse(copy.isBiasCorrected());
        assertEquals(1.0, copy.getResult(), 1e-12);
    }

    @Test
    public void testCopyConstructorPreservesValues() throws Exception {
        Variance original = new Variance();
        original.increment(1.0);
        original.increment(3.0);
        Variance copy = new Variance(original);
        assertEquals(2L, copy.getN());
        assertEquals(2.0, copy.getResult(), 1e-12);
    }

    @Test
    public void testEvaluateResetsIncrementalState() throws Exception {
        Variance variance = new Variance();
        variance.increment(2.0);
        assertEquals(2.0, variance.evaluate(new double[] { 1.0, 3.0 }), 1e-12);
        assertEquals(0L, variance.getN());
        assertTrue(Double.isNaN(variance.getResult()));
    }
}
