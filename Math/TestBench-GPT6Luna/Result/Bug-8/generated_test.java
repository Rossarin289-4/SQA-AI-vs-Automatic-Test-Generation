package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.Pair;

public class DiscreteDistributionTest {
    @Test
    public void testSamplesAreNormalized() throws Exception {
        List<Pair<String, Double>> input = new ArrayList<Pair<String, Double>>();
        input.add(new Pair<String, Double>("a", 2.0));
        input.add(new Pair<String, Double>("b", 6.0));
        DiscreteDistribution<String> d = new DiscreteDistribution<String>(input);

        List<Pair<String, Double>> samples = d.getSamples();
        assertEquals(2, samples.size());
        assertEquals("a", samples.get(0).getKey());
        assertEquals(0.25, samples.get(0).getValue(), 1e-12);
        assertEquals("b", samples.get(1).getKey());
        assertEquals(0.75, samples.get(1).getValue(), 1e-12);
    }

    @Test
    public void testZeroProbabilityEntryIsPreserved() throws Exception {
        List<Pair<String, Double>> input = new ArrayList<Pair<String, Double>>();
        input.add(new Pair<String, Double>("a", 0.0));
        input.add(new Pair<String, Double>("b", 1.0));
        DiscreteDistribution<String> d = new DiscreteDistribution<String>(input);

        List<Pair<String, Double>> samples = d.getSamples();
        assertEquals(2, samples.size());
        assertEquals("a", samples.get(0).getKey());
        assertEquals(0.0, samples.get(0).getValue(), 0.0);
        assertEquals("b", samples.get(1).getKey());
        assertEquals(1.0, samples.get(1).getValue(), 0.0);
    }

    @Test
    public void testDuplicateKeysRemainSeparateInSamples() throws Exception {
        List<Pair<String, Double>> input = new ArrayList<Pair<String, Double>>();
        input.add(new Pair<String, Double>("x", 1.0));
        input.add(new Pair<String, Double>("x", 3.0));
        DiscreteDistribution<String> d = new DiscreteDistribution<String>(input);

        List<Pair<String, Double>> samples = d.getSamples();
        assertEquals(2, samples.size());
        assertEquals("x", samples.get(0).getKey());
        assertEquals(0.25, samples.get(0).getValue(), 1e-12);
        assertEquals("x", samples.get(1).getKey());
        assertEquals(0.75, samples.get(1).getValue(), 1e-12);
    }

    @Test
    public void testNullKeyIsPreserved() throws Exception {
        List<Pair<String, Double>> input = new ArrayList<Pair<String, Double>>();
        input.add(new Pair<String, Double>(null, 2.0));
        input.add(new Pair<String, Double>("x", 2.0));
        DiscreteDistribution<String> d = new DiscreteDistribution<String>(input);

        List<Pair<String, Double>> samples = d.getSamples();
        assertEquals(2, samples.size());
        assertNull(samples.get(0).getKey());
        assertEquals(0.5, samples.get(0).getValue(), 1e-12);
        assertEquals("x", samples.get(1).getKey());
        assertEquals(0.5, samples.get(1).getValue(), 1e-12);
    }

    @Test
    public void testNegativeProbabilityRejected() throws Exception {
        List<Pair<String, Double>> input = new ArrayList<Pair<String, Double>>();
        input.add(new Pair<String, Double>("x", -1.0));
        try {
            new DiscreteDistribution<String>(input);
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) {
            assertEquals(NotPositiveException.class, expected.getClass());
        }
    }

    @Test
    public void testZeroTotalProbabilityRejected() throws Exception {
        List<Pair<String, Double>> input = new ArrayList<Pair<String, Double>>();
        input.add(new Pair<String, Double>("x", 0.0));
        try {
            new DiscreteDistribution<String>(input);
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) {
            assertEquals(MathArithmeticException.class, expected.getClass());
        }
    }

    @Test
    public void testInfiniteProbabilityRejected() throws Exception {
        List<Pair<String, Double>> input = new ArrayList<Pair<String, Double>>();
        input.add(new Pair<String, Double>("x", Double.POSITIVE_INFINITY));
        try {
            new DiscreteDistribution<String>(input);
            fail("expected MathIllegalArgumentException");
        } catch (MathIllegalArgumentException expected) {
            assertEquals(MathIllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testReseedingRepeatsSampleSequence() throws Exception {
        List<Pair<String, Double>> input = new ArrayList<Pair<String, Double>>();
        input.add(new Pair<String, Double>("a", 1.0));
        input.add(new Pair<String, Double>("b", 2.0));
        input.add(new Pair<String, Double>("c", 3.0));
        DiscreteDistribution<String> d = new DiscreteDistribution<String>(input);

        d.reseedRandomGenerator(12345L);
        Object[] first = d.sample(20);
        d.reseedRandomGenerator(12345L);
        Object[] second = d.sample(20);
        assertArrayEquals(first, second);
    }

    @Test
    public void testReseedingWithDifferentSeedsProducesValidSamples() throws Exception {
        List<Pair<String, Double>> input = new ArrayList<Pair<String, Double>>();
        input.add(new Pair<String, Double>("a", 1.0));
        input.add(new Pair<String, Double>("b", 1.0));
        DiscreteDistribution<String> d = new DiscreteDistribution<String>(input);

        d.reseedRandomGenerator(1L);
        Object[] result = d.sample(10);
        assertEquals(10, result.length);
        for (Object value : result) {
            assertTrue("a".equals(value) || "b".equals(value));
        }
    }

    @Test
    public void testSingleEntrySampleAlwaysReturnsItsValue() throws Exception {
        List<Pair<String, Double>> input = new ArrayList<Pair<String, Double>>();
        input.add(new Pair<String, Double>("only", 5.0));
        DiscreteDistribution<String> d = new DiscreteDistribution<String>(input);

        assertEquals("only", d.sample());
        assertArrayEquals(new Object[] {"only", "only", "only"}, d.sample(3));
    }

    @Test
    public void testSampleArrayHasRequestedSize() throws Exception {
        List<Pair<Integer, Double>> input = new ArrayList<Pair<Integer, Double>>();
        input.add(new Pair<Integer, Double>(10, 1.0));
        input.add(new Pair<Integer, Double>(20, 1.0));
        DiscreteDistribution<Integer> d = new DiscreteDistribution<Integer>(input);

        assertEquals(1, d.sample(1).length);
        assertEquals(4, d.sample(4).length);
    }

    @Test
    public void testZeroSampleSizeRejected() throws Exception {
        List<Pair<Integer, Double>> input = new ArrayList<Pair<Integer, Double>>();
        input.add(new Pair<Integer, Double>(1, 1.0));
        DiscreteDistribution<Integer> d = new DiscreteDistribution<Integer>(input);

        try {
            d.sample(0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            assertEquals(NotStrictlyPositiveException.class, expected.getClass());
        }
    }

    @Test
    public void testNegativeSampleSizeRejected() throws Exception {
        List<Pair<Integer, Double>> input = new ArrayList<Pair<Integer, Double>>();
        input.add(new Pair<Integer, Double>(1, 1.0));
        DiscreteDistribution<Integer> d = new DiscreteDistribution<Integer>(input);

        try {
            d.sample(-1);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            assertEquals(NotStrictlyPositiveException.class, expected.getClass());
        }
    }
}
