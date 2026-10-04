package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

public class HypergeometricDistributionTest {

    @Test
    public void testConstructorValid() {
        // Test a valid constructor call
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 10, 5);
        assertNotNull(dist);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorPopulationSizeTooSmall() {
        // Test populationSize <= 0
        new HypergeometricDistribution(0, 10, 5);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorNumberOfSuccessesTooSmall() {
        // Test numberOfSuccesses < 0
        new HypergeometricDistribution(100, -1, 5);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorSampleSizeTooSmall() {
        // Test sampleSize < 0
        new HypergeometricDistribution(100, 10, -1);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorNumberOfSuccessesTooLarge() {
        // Test numberOfSuccesses > populationSize
        new HypergeometricDistribution(100, 101, 5);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorSampleSizeTooLarge() {
        // Test sampleSize > populationSize
        new HypergeometricDistribution(100, 10, 101);
    }

    @Test
    public void testGetters() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 10, 5);
        assertEquals(100, dist.getPopulationSize());
        assertEquals(10, dist.getNumberOfSuccesses());
        assertEquals(5, dist.getSampleSize());
    }

    @Test
    public void testCumulativeProbabilityBasic() {
        // Example from Wikipedia: N=10, m=3, k=4. P(X <= 1) = P(X=0) + P(X=1)
        // P(X=0) = C(3,0)*C(7,4)/C(10,4) = 1 * 35 / 210 = 35/210
        // P(X=1) = C(3,1)*C(7,3)/C(10,4) = 3 * 35 / 210 = 105/210
        // P(X<=1) = 140/210 = 2/3
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 3, 4);
        assertEquals(140.0/210.0, dist.cumulativeProbability(1), 1e-9);
    }

    @Test
    public void testCumulativeProbabilityAtLowerBound() {
        HypergeometricDistribution dist = new HypergeometricDistribution(20, 5, 10);
        // Lower bound = max(0, 10 + 5 - 20) = 0
        assertEquals(0.0, dist.cumulativeProbability(-1), 1e-9);
        assertEquals(dist.probability(0), dist.cumulativeProbability(0), 1e-9); // P(X<=0) = P(X=0)
    }

    @Test
    public void testCumulativeProbabilityAtUpperBound() {
        HypergeometricDistribution dist = new HypergeometricDistribution(20, 5, 10);
        // Upper bound = min(5, 10) = 5
        assertEquals(1.0, dist.cumulativeProbability(20), 1e-9); // Value > upper bound
        // For x >= domain[1], cumulativeProbability should be 1.0.
        // Here domain[1] = 5. So cumulativeProbability(5) should be 1.0.
        assertEquals(1.0, dist.cumulativeProbability(5), 1e-9);
    }

    @Test
    public void testCumulativeProbabilityEdgeCases() {
        HypergeometricDistribution dist = new HypergeometricDistribution(50, 25, 10);
        // Lower bound: max(0, 10 + 25 - 50) = 0
        // Upper bound: min(25, 10) = 10
        assertEquals(0.0, dist.cumulativeProbability(-5), 1e-9); // Below lower bound
        // cumulativeProbability(x) for x < domain[0] is 0.0. Here domain[0] = 0.
        // Thus cumulativeProbability(0) should not be 0.0, it should be P(X=0).
        // If x == domain[0], it's P(X <= domain[0]).
        assertEquals(dist.probability(0), dist.cumulativeProbability(0), 1e-9);
        assertEquals(1.0, dist.cumulativeProbability(10), 1e-9); // At upper bound
        assertEquals(1.0, dist.cumulativeProbability(15), 1e-9); // Above upper bound
    }

    @Test
    public void testProbabilityBasic() {
        // Example from Wikipedia: N=10, m=3, k=4.
        // P(X=2) = C(3,2)*C(7,2)/C(10,4) = 3 * 21 / 210 = 63/210
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 3, 4);
        assertEquals(63.0/210.0, dist.probability(2), 1e-9);
    }

    @Test
    public void testProbabilityAtLowerBound() {
        HypergeometricDistribution dist = new HypergeometricDistribution(20, 5, 10);
        // Lower bound = max(0, 10 + 5 - 20) = 0
        assertEquals(0.0, dist.probability(-1), 1e-9); // Outside domain
        assertEquals(dist.probability(0), dist.probability(0), 1e-9);
    }

    @Test
    public void testProbabilityAtUpperBound() {
        HypergeometricDistribution dist = new HypergeometricDistribution(20, 5, 10);
        // Upper bound = min(5, 10) = 5
        assertEquals(0.0, dist.probability(6), 1e-9); // Outside domain
        assertEquals(dist.probability(5), dist.probability(5), 1e-9);
    }

    @Test
    public void testProbabilityOutsideDomain() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 3, 4);
        // Domain is [0, 3]
        assertEquals(0.0, dist.probability(-1), 1e-9);
        assertEquals(0.0, dist.probability(4), 1e-9);
    }

    @Test
    public void testUpperCumulativeProbabilityBasic() {
        // N=10, m=3, k=4. P(X >= 2) = P(X=2) + P(X=3)
        // P(X=2) = 63/210
        // P(X=3) = C(3,3)*C(7,1)/C(10,4) = 1 * 7 / 210 = 7/210
        // P(X>=2) = 70/210 = 1/3
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 3, 4);
        assertEquals(70.0/210.0, dist.upperCumulativeProbability(2), 1e-9);
    }

    @Test
    public void testUpperCumulativeProbabilityAtLowerBound() {
        HypergeometricDistribution dist = new HypergeometricDistribution(20, 5, 10);
        // Lower bound = 0
        assertEquals(1.0, dist.upperCumulativeProbability(0), 1e-9);
        assertEquals(1.0, dist.upperCumulativeProbability(-5), 1e-9); // Below lower bound
    }

    @Test
    public void testUpperCumulativeProbabilityAtUpperBound() {
        HypergeometricDistribution dist = new HypergeometricDistribution(20, 5, 10);
        // Upper bound = 5
        assertEquals(dist.probability(5), dist.upperCumulativeProbability(5), 1e-9);
        assertEquals(0.0, dist.upperCumulativeProbability(6), 1e-9); // Above upper bound
        assertEquals(0.0, dist.upperCumulativeProbability(20), 1e-9); // Far above upper bound
    }

    @Test
    public void testGetNumericalMean() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 10, 5);
        // Mean = k * m / N = 5 * 10 / 100 = 0.5
        assertEquals(0.5, dist.getNumericalMean(), 1e-9);
    }

    @Test
    public void testGetNumericalMeanZero() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 0, 5);
        // Mean = 5 * 0 / 100 = 0
        assertEquals(0.0, dist.getNumericalMean(), 1e-9);
    }

    @Test
    public void testGetNumericalVariance() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 10, 5);
        // Variance = [n * m * (N - n) * (N - m)] / [N^2 * (N - 1)]
        // n=5, m=10, N=100
        // Variance = [5 * 10 * (100 - 5) * (100 - 10)] / [100^2 * (100 - 1)]
        // Variance = [50 * 95 * 90] / [10000 * 99]
        // Variance = 427500 / 990000 = 0.43181818...
        double expectedVariance = (5.0 * 10.0 * (100.0 - 5.0) * (100.0 - 10.0)) / (100.0 * 100.0 * (100.0 - 1.0));
        assertEquals(expectedVariance, dist.getNumericalVariance(), 1e-9);
    }

    @Test
    public void testGetNumericalVarianceWhenOneParamIsZero() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 0, 5);
        // If m=0, variance should be 0
        assertEquals(0.0, dist.getNumericalVariance(), 1e-9);

        HypergeometricDistribution dist2 = new HypergeometricDistribution(100, 50, 0);
        // If n=0, variance should be 0
        assertEquals(0.0, dist2.getNumericalVariance(), 1e-9);

        HypergeometricDistribution dist3 = new HypergeometricDistribution(100, 100, 5);
        // If m=N, variance should be 0
        assertEquals(0.0, dist3.getNumericalVariance(), 1e-9);
    }

    @Test
    public void testGetSupportLowerBound() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 10, 5);
        // Lower bound = max(0, k + m - N) = max(0, 5 + 10 - 100) = max(0, -85) = 0
        assertEquals(0, dist.getSupportLowerBound());
    }

    @Test
    public void testGetSupportLowerBoundLargeN() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 90, 50);
        // Lower bound = max(0, 50 + 90 - 100) = max(0, 40) = 40
        assertEquals(40, dist.getSupportLowerBound());
    }

    @Test
    public void testGetSupportUpperBound() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 10, 5);
        // Upper bound = min(m, k) = min(10, 5) = 5
        assertEquals(5, dist.getSupportUpperBound());
    }

    @Test
    public void testGetSupportUpperBoundLargeM() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 90, 50);
        // Upper bound = min(m, k) = min(90, 50) = 50
        assertEquals(50, dist.getSupportUpperBound());
    }

    @Test
    public void testIsSupportConnected() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 10, 5);
        assertTrue(dist.isSupportConnected());
    }

    @Test
    public void testLargeParameters() {
        // Test with parameters close to integer limits, but valid
        HypergeometricDistribution dist = new HypergeometricDistribution(Integer.MAX_VALUE, Integer.MAX_VALUE - 10, Integer.MAX_VALUE - 20);
        assertNotNull(dist);
        assertEquals(Integer.MAX_VALUE, dist.getPopulationSize());
        assertEquals(Integer.MAX_VALUE - 10, dist.getNumberOfSuccesses());
        assertEquals(Integer.MAX_VALUE - 20, dist.getSampleSize());
    }

    @Test
    public void testZeroPopulation() {
        // This should throw an exception
        try {
            new HypergeometricDistribution(0, 0, 0);
            fail("Expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException e) {
            // Expected
        }
    }

    @Test
    public void testZeroSuccesses() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 0, 5);
        // If number of successes is 0, the probability of any outcome is 0, except for P(X=0) which is 1.
        assertEquals(1.0, dist.probability(0), 1e-9);
        assertEquals(0.0, dist.probability(1), 1e-9);
        assertEquals(1.0, dist.cumulativeProbability(0), 1e-9);
        assertEquals(0.0, dist.cumulativeProbability(-1), 1e-9);
        assertEquals(1.0, dist.cumulativeProbability(5), 1e-9);
    }

    @Test
    public void testZeroSampleSize() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 10, 0);
        // If sample size is 0, the probability of any outcome is 0, except for P(X=0) which is 1.
        assertEquals(1.0, dist.probability(0), 1e-9);
        assertEquals(0.0, dist.probability(1), 1e-9);
        assertEquals(1.0, dist.cumulativeProbability(0), 1e-9);
        assertEquals(0.0, dist.cumulativeProbability(-1), 1e-9);
        assertEquals(1.0, dist.cumulativeProbability(0), 1e-9);
    }

    @Test
    public void testAllSuccesses() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 100, 5);
        // If all items in the population are successes, then any sample of size k must contain k successes.
        // Thus, P(X=k) = 1, and P(X!=k) = 0.
        assertEquals(1.0, dist.probability(5), 1e-9);
        assertEquals(0.0, dist.probability(4), 1e-9);
        assertEquals(0.0, dist.probability(0), 1e-9);
        assertEquals(1.0, dist.cumulativeProbability(5), 1e-9);
        assertEquals(0.0, dist.cumulativeProbability(4), 1e-9);
    }

    @Test
    public void testAllFailures() {
        HypergeometricDistribution dist = new HypergeometricDistribution(100, 0, 5);
        // If there are no successes in the population, then any sample must contain 0 successes.
        // Thus, P(X=0) = 1, and P(X!=0) = 0.
        assertEquals(1.0, dist.probability(0), 1e-9);
        assertEquals(0.0, dist.probability(1), 1e-9);
        assertEquals(0.0, dist.probability(5), 1e-9);
        assertEquals(1.0, dist.cumulativeProbability(0), 1e-9);
        assertEquals(1.0, dist.cumulativeProbability(5), 1e-9);
    }

    @Test
    public void testSampleEqualsPopulation() {
        // If sample size equals population size, all elements are drawn.
        // The number of successes in the sample must equal the number of successes in the population.
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 3, 10);
        // Number of successes = 3, sample size = 10.
        // The only possible outcome is 3 successes.
        assertEquals(1.0, dist.probability(3), 1e-9);
        assertEquals(0.0, dist.probability(2), 1e-9);
        assertEquals(0.0, dist.probability(4), 1e-9);
        assertEquals(1.0, dist.cumulativeProbability(3), 1e-9);
        assertEquals(0.0, dist.cumulativeProbability(2), 1e-9);
    }
}
