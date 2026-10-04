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
    public void testConstructorWithSamples() throws Exception {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.1));
        samples.add(new Pair<>("b", 0.2));
        samples.add(new Pair<>("c", 0.7));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        assertEquals(3, dist.getSamples().size());
    }

    @Test
    public void testConstructorWithRngAndSamples() throws Exception {
        RandomGenerator rng = new Well19937c();
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.1));
        samples.add(new Pair<>("b", 0.2));
        samples.add(new Pair<>("c", 0.7));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(rng, samples);
        assertEquals(3, dist.getSamples().size());
    }

    @Test
    public void testConstructorWithSamplesNormalizesProbabilities() throws Exception {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.1));
        samples.add(new Pair<>("b", 0.2));
        samples.add(new Pair<>("c", 0.7));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        List<Pair<String, Double>> normalizedSamples = dist.getSamples();
        assertEquals(0.1, normalizedSamples.get(0).getValue(), 1e-9);
        assertEquals(0.2, normalizedSamples.get(1).getValue(), 1e-9);
        assertEquals(0.7, normalizedSamples.get(2).getValue(), 1e-9);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorWithNegativeProbability() throws Exception {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", -0.1));
        new DiscreteDistribution<>(samples);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorWithZeroSumProbabilities() throws Exception {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.0));
        samples.add(new Pair<>("b", 0.0));
        new DiscreteDistribution<>(samples);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorWithInfiniteProbability() throws Exception {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", Double.POSITIVE_INFINITY));
        new DiscreteDistribution<>(samples);
    }

    @Test
    public void testGetSamples() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.5));
        samples.add(new Pair<>("b", 0.5));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        List<Pair<String, Double>> retrievedSamples = dist.getSamples();
        assertEquals(2, retrievedSamples.size());
        assertEquals("a", retrievedSamples.get(0).getKey());
        assertEquals(0.5, retrievedSamples.get(0).getValue(), 1e-9);
        assertEquals("b", retrievedSamples.get(1).getKey());
        assertEquals(0.5, retrievedSamples.get(1).getValue(), 1e-9);
    }

    @Test
    public void testProbabilityBasic() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.3));
        samples.add(new Pair<>("b", 0.7));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        assertEquals(0.3, dist.probability("a"), 1e-9);
        assertEquals(0.7, dist.probability("b"), 1e-9);
    }

    @Test
    public void testProbabilityUnknownValue() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.3));
        samples.add(new Pair<>("b", 0.7));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        assertEquals(0.0, dist.probability("c"), 1e-9);
    }

    @Test
    public void testProbabilityNullValue() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.4));
        samples.add(new Pair<>(null, 0.6));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        assertEquals(0.6, dist.probability(null), 1e-9);
    }

    @Test
    public void testProbabilityWithNullAndNonNull() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.4));
        samples.add(new Pair<>(null, 0.6));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        assertEquals(0.4, dist.probability("a"), 1e-9);
        assertEquals(0.6, dist.probability(null), 1e-9);
    }

    @Test
    public void testProbabilityMultipleOccurrences() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.2));
        samples.add(new Pair<>("b", 0.3));
        samples.add(new Pair<>("a", 0.2)); // Duplicate key "a"
        samples.add(new Pair<>("c", 0.3));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        // The constructor normalizes, so we need to check the actual probabilities
        // that result from normalization. Original sum = 0.2 + 0.3 + 0.2 + 0.3 = 1.0
        // So, effectively "a" has 0.4, "b" has 0.3, "c" has 0.3
        assertEquals(0.4, dist.probability("a"), 1e-9);
        assertEquals(0.3, dist.probability("b"), 1e-9);
        assertEquals(0.3, dist.probability("c"), 1e-9);
    }

    @Test
    public void testSampleBasic() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 1.0)); // Deterministic sample
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        assertEquals("a", dist.sample());
    }

    @Test
    public void testSampleWithMultipleValues() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.5));
        samples.add(new Pair<>("b", 0.5));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        // We can't deterministically test the output of sample() without controlling the RNG.
        // Instead, we ensure it returns one of the possible values.
        String sample = dist.sample();
        assertTrue(sample.equals("a") || sample.equals("b"));
    }

    @Test
    public void testSampleWithNull() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>(null, 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        assertNull(dist.sample());
    }

    @Test
    public void testSampleWhenProbabilitiesSumToAlmostOne() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.9999999999));
        samples.add(new Pair<>("b", 0.0000000001));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        String sample = dist.sample();
        assertTrue(sample.equals("a") || sample.equals("b"));
    }

    @Test
    public void testSampleHandlesFloatingPointInequality() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 1.0/3.0));
        samples.add(new Pair<>("b", 1.0/3.0));
        samples.add(new Pair<>("c", 1.0/3.0));
        // Ensure that the sum is exactly 1.0 after normalization
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        String sample = dist.sample();
        assertTrue(sample.equals("a") || sample.equals("b") || sample.equals("c"));
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleWithZeroSampleSize() throws Exception {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        dist.sample(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleWithNegativeSampleSize() throws Exception {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        dist.sample(-1);
    }

    @Test
    public void testSampleWithPositiveSampleSize() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 0.5));
        samples.add(new Pair<>("b", 0.5));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        Object[] samplesArray = dist.sample(5);
        assertEquals(5, samplesArray.length);
        for (Object obj : samplesArray) {
            assertTrue(obj.equals("a") || obj.equals("b"));
        }
    }

    @Test
    public void testSampleWithSingleValue() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("only", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        assertEquals("only", dist.sample());
        Object[] samplesArray = dist.sample(3);
        assertEquals(3, samplesArray.length);
        for (Object obj : samplesArray) {
            assertEquals("only", obj);
        }
    }

    @Test
    public void testGetSamplesReturnsNewList() {
        List<Pair<String, Double>> samples = new ArrayList<>();
        samples.add(new Pair<>("a", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<>(samples);
        List<Pair<String, Double>> retrievedSamples1 = dist.getSamples();
        List<Pair<String, Double>> retrievedSamples2 = dist.getSamples();
        assertNotSame(retrievedSamples1, retrievedSamples2);
        assertEquals(1, retrievedSamples1.size());
    }
}
