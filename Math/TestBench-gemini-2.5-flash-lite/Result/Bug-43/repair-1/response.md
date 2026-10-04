```java
package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.apache.commons.math.util.MathUtils;
import org.apache.commons.math.util.Precision;
import org.apache.commons.math.util.FastMath;

public class SummaryStatisticsTest {
    /**
     * Calculates statistics for an empty set of data.
     *
     * @throws Exception
     */
    @Test
    public void testEmpty() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        assertEquals(0, stats.getN());
        assertEquals(Double.NaN, stats.getMax(), 0);
        assertEquals(Double.NaN, stats.getMean(), 0);
        assertEquals(Double.NaN, stats.getMin(), 0);
        assertEquals(Double.NaN, stats.getSum(), 0);
        assertEquals(Double.NaN, stats.getSumsq(), 0);
        assertEquals(Double.NaN, stats.getVariance(), 0);
        assertEquals(Double.NaN, stats.getStandardDeviation(), 0);
        assertEquals(Double.NaN, stats.getGeometricMean(), 0);
        assertEquals(Double.NaN, stats.getSumOfLogs(), 0);
        assertEquals(Double.NaN, stats.getSecondMoment(), 0);
        assertEquals(Double.NaN, stats.getPopulationVariance(), 0);
    }

    /**
     * Tests adding a single value.
     *
     * @throws Exception
     */
    @Test
    public void testAddValue() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(10.0);
        assertEquals(1, stats.getN());
        assertEquals(10.0, stats.getMax(), 0);
        assertEquals(10.0, stats.getMean(), 0);
        assertEquals(10.0, stats.getMin(), 0);
        assertEquals(10.0, stats.getSum(), 0);
        assertEquals(100.0, stats.getSumsq(), 0);
        assertEquals(0.0, stats.getVariance(), 0);
        assertEquals(0.0, stats.getStandardDeviation(), 0);
        assertEquals(Math.log(10.0), stats.getSumOfLogs(), 1e-9);
        assertEquals(Math.log(10.0), stats.getGeometricMean(), 1e-9);
        assertEquals(0.0, stats.getSecondMoment(), 0);
        assertEquals(0.0, stats.getPopulationVariance(), 0);
    }

    /**
     * Tests adding multiple values and checks statistics.
     *
     * @throws Exception
     */
    @Test
    public void testAddValues() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        stats.addValue(4.0);
        stats.addValue(5.0);

        assertEquals(5, stats.getN());
        assertEquals(5.0, stats.getMax(), 0);
        assertEquals(3.0, stats.getMean(), 0);
        assertEquals(1.0, stats.getMin(), 0);
        assertEquals(15.0, stats.getSum(), 0);
        assertEquals(55.0, stats.getSumsq(), 0);
        assertEquals(2.5, stats.getVariance(), 0);
        assertEquals(Math.sqrt(2.5), stats.getStandardDeviation(), 1e-9);
        assertEquals(Math.log(1.0) + Math.log(2.0) + Math.log(3.0) + Math.log(4.0) + Math.log(5.0), stats.getSumOfLogs(), 1e-9);
        assertEquals(Math.pow(2.0 * 3.0 * 4.0 * 5.0, 0.2), stats.getGeometricMean(), 1e-9);
        assertEquals(10.0, stats.getSecondMoment(), 0); // sum of squared deviations from mean
        assertEquals(2.0, stats.getPopulationVariance(), 0);
    }

    /**
     * Tests the `getSummary()` method.
     *
     * @throws Exception
     */
    @Test
    public void testGetSummary() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);

        StatisticalSummary summary = stats.getSummary();
        assertEquals(3, summary.getN());
        assertEquals(3.0, summary.getMean(), 0);
        assertEquals(1.0, summary.getMin(), 0);
        assertEquals(3.0, summary.getMax(), 0);
        assertEquals(6.0, summary.getSum(), 0);
        assertEquals(2.0, summary.getVariance(), 0);
    }

    /**
     * Tests resetting statistics with `clear()`.
     *
     * @throws Exception
     */
    @Test
    public void testClear() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.clear();

        assertEquals(0, stats.getN());
        assertEquals(Double.NaN, stats.getMax(), 0);
        assertEquals(Double.NaN, stats.getMean(), 0);
        assertEquals(Double.NaN, stats.getMin(), 0);
        assertEquals(Double.NaN, stats.getSum(), 0);
        assertEquals(Double.NaN, stats.getSumsq(), 0);
        assertEquals(Double.NaN, stats.getVariance(), 0);
        assertEquals(Double.NaN, stats.getStandardDeviation(), 0);
        assertEquals(Double.NaN, stats.getGeometricMean(), 0);
        assertEquals(Double.NaN, stats.getSumOfLogs(), 0);
        assertEquals(Double.NaN, stats.getSecondMoment(), 0);
        assertEquals(Double.NaN, stats.getPopulationVariance(), 0);
    }

    /**
     * Tests equality with itself.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsSelf() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        assertTrue(stats.equals(stats));
    }

    /**
     * Tests equality of two empty statistics.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsEmpty() throws Exception {
        SummaryStatistics stats1 = new SummaryStatistics();
        SummaryStatistics stats2 = new SummaryStatistics();
        assertTrue(stats1.equals(stats2));
    }

    /**
     * Tests equality of two statistics with the same values.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsSameValues() throws Exception {
        SummaryStatistics stats1 = new SummaryStatistics();
        stats1.addValue(1.0);
        stats1.addValue(2.0);
        stats1.addValue(3.0);

        SummaryStatistics stats2 = new SummaryStatistics();
        stats2.addValue(1.0);
        stats2.addValue(2.0);
        stats2.addValue(3.0);

        assertTrue(stats1.equals(stats2));
    }

    /**
     * Tests inequality when counts differ.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsDifferentN() throws Exception {
        SummaryStatistics stats1 = new SummaryStatistics();
        stats1.addValue(1.0);

        SummaryStatistics stats2 = new SummaryStatistics();
        stats2.addValue(1.0);
        stats2.addValue(2.0);

        assertFalse(stats1.equals(stats2));
    }

    /**
     * Tests inequality when max differs.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsDifferentMax() throws Exception {
        SummaryStatistics stats1 = new SummaryStatistics();
        stats1.addValue(1.0);
        stats1.addValue(3.0);

        SummaryStatistics stats2 = new SummaryStatistics();
        stats2.addValue(1.0);
        stats2.addValue(4.0);

        assertFalse(stats1.equals(stats2));
    }

    /**
     * Tests inequality when mean differs.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsDifferentMean() throws Exception {
        SummaryStatistics stats1 = new SummaryStatistics();
        stats1.addValue(1.0);
        stats1.addValue(3.0); // Mean = 2.0

        SummaryStatistics stats2 = new SummaryStatistics();
        stats2.addValue(1.0);
        stats2.addValue(4.0); // Mean = 2.5

        assertFalse(stats1.equals(stats2));
    }

    /**
     * Tests inequality when min differs.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsDifferentMin() throws Exception {
        SummaryStatistics stats1 = new SummaryStatistics();
        stats1.addValue(1.0);
        stats1.addValue(3.0);

        SummaryStatistics stats2 = new SummaryStatistics();
        stats2.addValue(2.0);
        stats2.addValue(3.0);

        assertFalse(stats1.equals(stats2));
    }

    /**
     * Tests inequality when sum differs.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsDifferentSum() throws Exception {
        SummaryStatistics stats1 = new SummaryStatistics();
        stats1.addValue(1.0);
        stats1.addValue(3.0); // Sum = 4.0

        SummaryStatistics stats2 = new SummaryStatistics();
        stats2.addValue(1.0);
        stats2.addValue(4.0); // Sum = 5.0

        assertFalse(stats1.equals(stats2));
    }

    /**
     * Tests inequality when sum of squares differs.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsDifferentSumSq() throws Exception {
        SummaryStatistics stats1 = new SummaryStatistics();
        stats1.addValue(1.0);
        stats1.addValue(2.0); // Sumsq = 1.0 + 4.0 = 5.0

        SummaryStatistics stats2 = new SummaryStatistics();
        stats2.addValue(1.0);
        stats2.addValue(3.0); // Sumsq = 1.0 + 9.0 = 10.0

        assertFalse(stats1.equals(stats2));
    }

    /**
     * Tests inequality when variance differs.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsDifferentVariance() throws Exception {
        SummaryStatistics stats1 = new SummaryStatistics();
        stats1.addValue(1.0);
        stats1.addValue(3.0); // Variance = 2.0

        SummaryStatistics stats2 = new SummaryStatistics();
        stats2.addValue(1.0);
        stats2.addValue(4.0); // Variance = 4.5

        assertFalse(stats1.equals(stats2));
    }

    /**
     * Tests equality with a different type.
     *
     * @throws Exception
     */
    @Test
    public void testEqualsDifferentType() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        assertFalse(stats.equals(new Object()));
    }

    /**
     * Tests hashCode with an empty statistic.
     *
     * @throws Exception
     */
    @Test
    public void testHashCodeEmpty() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        int expectedHashCode = 31 + MathUtils.hash(stats.getGeometricMean());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getGeometricMean());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getMax());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getMean());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getMin());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getN());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getSum());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getSumsq());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getVariance());
        assertEquals(expectedHashCode, stats.hashCode());
    }

    /**
     * Tests hashCode with values.
     *
     * @throws Exception
     */
    @Test
    public void testHashCodeWithValues() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);

        int expectedHashCode = 31 + MathUtils.hash(stats.getGeometricMean());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getGeometricMean());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getMax());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getMean());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getMin());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getN());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getSum());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getSumsq());
        expectedHashCode = expectedHashCode * 31 + MathUtils.hash(stats.getVariance());

        assertEquals(expectedHashCode, stats.hashCode());
    }

    /**
     * Tests copy constructor.
     *
     * @throws Exception
     */
    @Test
    public void testCopyConstructor() throws Exception {
        SummaryStatistics original = new SummaryStatistics();
        original.addValue(1.0);
        original.addValue(2.0);

        SummaryStatistics copy = new SummaryStatistics(original);

        assertEquals(original.getN(), copy.getN());
        assertEquals(original.getSum(), copy.getSum(), 0);
        assertEquals(original.getSumsq(), copy.getSumsq(), 0);
        assertEquals(original.getMean(), copy.getMean(), 0);
        assertEquals(original.getVariance(), copy.getVariance(), 0);
        assertEquals(original.getMax(), copy.getMax(), 0);
        assertEquals(original.getMin(), copy.getMin(), 0);
        assertEquals(original.getGeometricMean(), copy.getGeometricMean(), 0);
        assertEquals(original.getSumOfLogs(), copy.getSumOfLogs(), 0);
        assertEquals(original.getSecondMoment(), copy.getSecondMoment(), 0);
        assertEquals(original.getPopulationVariance(), copy.getPopulationVariance(), 0);

        original.addValue(3.0);
        assertNotEquals(original.getN(), copy.getN());
        assertNotEquals(original.getSum(), copy.getSum(), 0);
    }

    /**
     * Tests static copy method.
     *
     * @throws Exception
     */
    @Test
    public void testStaticCopy() throws Exception {
        SummaryStatistics source = new SummaryStatistics();
        source.addValue(1.0);
        source.addValue(2.0);

        SummaryStatistics dest = new SummaryStatistics();
        SummaryStatistics.copy(source, dest);

        assertEquals(source.getN(), dest.getN());
        assertEquals(source.getSum(), dest.getSum(), 0);
        assertEquals(source.getSumsq(), dest.getSumsq(), 0);
        assertEquals(source.getMean(), dest.getMean(), 0);
        assertEquals(source.getVariance(), dest.getVariance(), 0);
        assertEquals(source.getMax(), dest.getMax(), 0);
        assertEquals(source.getMin(), dest.getMin(), 0);
        assertEquals(source.getGeometricMean(), dest.getGeometricMean(), 0);
        assertEquals(source.getSumOfLogs(), dest.getSumOfLogs(), 0);
        assertEquals(source.getSecondMoment(), dest.getSecondMoment(), 0);
        assertEquals(source.getPopulationVariance(), dest.getPopulationVariance(), 0);

        source.addValue(3.0);
        assertNotEquals(source.getN(), dest.getN());
        assertNotEquals(source.getSum(), dest.getSum(), 0);
    }

    /**
     * Tests the toString method for an empty statistics object.
     *
     * @throws Exception
     */
    @Test
    public void testToStringEmpty() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        String expected = "SummaryStatistics:\n" +
                          "n: 0\n" +
                          "min: NaN\n" +
                          "max: NaN\n" +
                          "mean: NaN\n" +
                          "geometric mean: NaN\n" +
                          "variance: NaN\n" +
                          "sum of squares: NaN\n" +
                          "standard deviation: NaN\n" +
                          "sum of logs: NaN\n";
        assertEquals(expected, stats.toString());
    }

    /**
     * Tests the toString method for a statistics object with values.
     *
     * @throws Exception
     */
    @Test
    public void testToStringWithValues() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);

        String expected = "SummaryStatistics:\n" +
                          "n: 3\n" +
                          "min: 1.0\n" +
                          "max: 3.0\n" +
                          "mean: 2.0\n" +
                          "geometric mean: " + stats.getGeometricMean() + "\n" +
                          "variance: 2.0\n" +
                          "sum of squares: 14.0\n" +
                          "standard deviation: " + stats.getStandardDeviation() + "\n" +
                          "sum of logs: " + stats.getSumOfLogs() + "\n";
        assertEquals(expected, stats.toString());
    }

    /**
     * Tests `setSumImpl` before adding values.
     *
     * @throws Exception
     */
    @Test
    public void testSetSumImpl() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        Sum customSum = new Sum();
        stats.setSumImpl(customSum);
        stats.addValue(5.0);
        assertEquals(5.0, stats.getSum(), 0);
        assertEquals(customSum, stats.getSumImpl());
        assertEquals(1, stats.getN());
    }

    /**
     * Tests `setSumImpl` after adding values throws exception.
     *
     * @throws Exception
     */
    @Test
    public void testSetSumImplAfterAdd() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);
        Sum customSum = new Sum();
        try {
            stats.setSumImpl(customSum);
            fail("Expected MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // Expected
        }
    }

    /**
     * Tests `setSumsqImpl` before adding values.
     *
     * @throws Exception
     */
    @Test
    public void testSetSumsqImpl() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        SumOfSquares customSumSq = new SumOfSquares();
        stats.setSumsqImpl(customSumSq);
        stats.addValue(5.0);
        assertEquals(25.0, stats.getSumsq(), 0);
        assertEquals(customSumSq, stats.getSumsqImpl());
        assertEquals(1, stats.getN());
    }

    /**
     * Tests `setSumsqImpl` after adding values throws exception.
     *
     * @throws Exception
     */
    @Test
    public void testSetSumsqImplAfterAdd() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);
        SumOfSquares customSumSq = new SumOfSquares();
        try {
            stats.setSumsqImpl(customSumSq);
            fail("Expected MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // Expected
        }
    }

    /**
     * Tests `setMinImpl` before adding values.
     *
     * @throws Exception
     */
    @Test
    public void testSetMinImpl() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        Min customMin = new Min();
        stats.setMinImpl(customMin);
        stats.addValue(5.0);
        assertEquals(5.0, stats.getMin(), 0);
        assertEquals(customMin, stats.getMinImpl());
        assertEquals(1, stats.getN());
    }

    /**
     * Tests `setMinImpl` after adding values throws exception.
     *
     * @throws Exception
     */
    @Test
    public void testSetMinImplAfterAdd() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);
        Min customMin = new Min();
        try {
            stats.setMinImpl(customMin);
            fail("Expected MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // Expected
        }
    }

    /**
     * Tests `setMaxImpl` before adding values.
     *
     * @throws Exception
     */
    @Test
    public void testSetMaxImpl() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        Max customMax = new Max();
        stats.setMaxImpl(customMax);
        stats.addValue(5.0);
        assertEquals(5.0, stats.getMax(), 0);
        assertEquals(customMax, stats.getMaxImpl());
        assertEquals(1, stats.getN());
    }

    /**
     * Tests `setMaxImpl` after adding values throws exception.
     *
     * @throws Exception
     */
    @Test
    public void testSetMaxImplAfterAdd() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);
        Max customMax = new Max();
        try {
            stats.setMaxImpl(customMax);
            fail("Expected MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // Expected
        }
    }

    /**
     * Tests `setSumLogImpl` before adding values.
     *
     * @throws Exception
     */
    @Test
    public void testSetSumLogImpl() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        SumOfLogs customSumLog = new SumOfLogs();
        stats.setSumLogImpl(customSumLog);
        stats.addValue(5.0);
        assertEquals(Math.log(5.0), stats.getSumOfLogs(), 1e-9);
        assertEquals(customSumLog, stats.getSumLogImpl());
        assertEquals(1, stats.getN());
    }

    /**
     * Tests `setSumLogImpl` after adding values throws exception.
     *
     * @throws Exception
     */
    @Test
    public void testSetSumLogImplAfterAdd() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);
        SumOfLogs customSumLog = new SumOfLogs();
        try {
            stats.setSumLogImpl(customSumLog);
            fail("Expected MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // Expected
        }
    }

    /**
     * Tests `setGeoMeanImpl` before adding values.
     *
     * @throws Exception
     */
    @Test
    public void testSetGeoMeanImpl() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        GeometricMean customGeoMean = new GeometricMean();
        stats.setGeoMeanImpl(customGeoMean);
        stats.addValue(5.0);
        assertEquals(5.0, stats.getGeometricMean(), 0);
        assertEquals(customGeoMean, stats.getGeoMeanImpl());
        assertEquals(1, stats.getN());
    }

    /**
     * Tests `setGeoMeanImpl` after adding values throws exception.
     *
     * @throws Exception
     */
    @Test
    public void testSetGeoMeanImplAfterAdd() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);
        GeometricMean customGeoMean = new GeometricMean();
        try {
            stats.setGeoMeanImpl(customGeoMean);
            fail("Expected MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // Expected
        }
    }

    /**
     * Tests `setMeanImpl` before adding values.
     *
     * @throws Exception
     */
    @Test
    public void testSetMeanImpl() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        Mean customMean = new Mean();
        stats.setMeanImpl(customMean);
        stats.addValue(5.0);
        assertEquals(5.0, stats.getMean(), 0);
        assertEquals(customMean, stats.getMeanImpl());
        assertEquals(1, stats.getN());
    }

    /**
     * Tests `setMeanImpl` after adding values throws exception.
     *
     * @throws Exception
     */
    @Test
    public void testSetMeanImplAfterAdd() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);
        Mean customMean = new Mean();
        try {
            stats.setMeanImpl(customMean);
            fail("Expected MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // Expected
        }
    }

    /**
     * Tests `setVarianceImpl` before adding values.
     *
     * @throws Exception
     */
    @Test
    public void testSetVarianceImpl() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        Variance customVariance = new Variance();
        stats.setVarianceImpl(customVariance);
        stats.addValue(5.0);
        assertEquals(0.0, stats.getVariance(), 0);
        assertEquals(customVariance, stats.getVarianceImpl());
        assertEquals(1, stats.getN());
    }

    /**
     * Tests `setVarianceImpl` after adding values throws exception.
     *
     * @throws Exception
     */
    @Test
    public void testSetVarianceImplAfterAdd() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);
        Variance customVariance = new Variance();
        try {
            stats.setVarianceImpl(customVariance);
            fail("Expected MathIllegalStateException");
        } catch (MathIllegalStateException e) {
            // Expected
        }
    }

    /**
     * Tests variance for a single value.
     *
     * @throws Exception
     */
    @Test
    public void testVarianceSingleValue() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(10.0);
        assertEquals(0.0, stats.getVariance(), 0);
        assertEquals(0.0, stats.getPopulationVariance(), 0);
        assertEquals(0.0, stats.getStandardDeviation(), 0);
    }

    /**
     * Tests population variance with multiple values.
     *
     * @throws Exception
     */
    @Test
    public void testPopulationVariance() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        stats.addValue(4.0);
        stats.addValue(5.0);
        assertEquals(2.0, stats.getPopulationVariance(), 0);
    }

    /**
     * Tests standard deviation for a single value.
     *
     * @throws Exception
     */
    @Test
    public void testStandardDeviationSingleValue() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(10.0);
        assertEquals(0.0, stats.getStandardDeviation(), 0);
    }

    /**
     * Tests standard deviation with multiple values.
     *
     * @throws Exception
     */
    @Test
    public void testStandardDeviationMultipleValues() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        assertEquals(Math.sqrt(2.0), stats.getStandardDeviation(), 1e-9);
    }

    /**
     * Tests geometric mean with negative values. Should result in NaN.
     *
     * @throws Exception
     */
    @Test
    public void testGeometricMeanNegative() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(-1.0);
        assertEquals(Double.NaN, stats.getGeometricMean(), 0);
    }

    /**
     * Tests geometric mean with zero. Should result in NaN if any zero or negative.
     *
     * @throws Exception
     */
    @Test
    public void testGeometricMeanZero() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.addValue(0.0);
        assertEquals(Double.NaN, stats.getGeometricMean(), 0);
    }

    /**
     * Tests sum of logs with negative values. Should result in NaN.
     *
     * @throws Exception
     */
    @Test
    public void testSumOfLogsNegative() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(-1.0);
        assertEquals(Double.NaN, stats.getSumOfLogs(), 0);
    }

    /**
     * Tests sum of logs with zero. Should result in NaN if any zero or negative.
     *
     * @throws Exception
     */
    @Test
    public void testSumOfLogsZero() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.addValue(0.0);
        assertEquals(Double.NaN, stats.getSumOfLogs(), 0);
    }

    /**
     * Tests second moment calculation.
     *
     * @throws Exception
     */
    @Test
    public void testSecondMoment() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);
        stats.addValue(4.0);
        stats.addValue(5.0);
        assertEquals(10.0, stats.getSecondMoment(), 0);
    }

    /**
     * Tests second moment with a single value.
     *
     * @throws Exception
     */
    @Test
    public void testSecondMomentSingleValue() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(10.0);
        assertEquals(0.0, stats.getSecondMoment(), 0);
    }

    /**
     * Tests the edge case of adding NaN to statistics.
     *
     * @throws Exception
     */
    @Test
    public void testAddNaN() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(Double.NaN);
        assertEquals(1, stats.getN());
        assertEquals(Double.NaN, stats.getMax(), 0);
        assertEquals(Double.NaN, stats.getMean(), 0);
        assertEquals(Double.NaN, stats.getMin(), 0);
        assertEquals(Double.NaN, stats.getSum(), 0);
        assertEquals(Double.NaN, stats.getSumsq(), 0);
        assertEquals(Double.NaN, stats.getVariance(), 0);
        assertEquals(Double.NaN, stats.getStandardDeviation(), 0);
        assertEquals(Double.NaN, stats.getGeometricMean(), 0);
        assertEquals(Double.NaN, stats.getSumOfLogs(), 0);
        assertEquals(Double.NaN, stats.getSecondMoment(), 0);
        assertEquals(Double.NaN, stats.getPopulationVariance(), 0);
    }

    /**
     * Tests the edge case of adding infinity to statistics.
     *
     * @throws Exception
     */
    @Test
    public void testAddInfinity() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(Double.POSITIVE_INFINITY);
        assertEquals(1, stats.getN());
        assertEquals(Double.POSITIVE_INFINITY, stats.getMax(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getMean(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getMin(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getSum(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getSumsq(), 0);
        assertEquals(Double.NaN, stats.getVariance(), 0);
        assertEquals(Double.NaN, stats.getStandardDeviation(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getGeometricMean(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getSumOfLogs(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getSecondMoment(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getPopulationVariance(), 0);
    }

    /**
     * Tests the edge case of adding negative infinity to statistics.
     *
     * @throws Exception
     */
    @Test
    public void testAddNegativeInfinity() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(Double.NEGATIVE_INFINITY);
        assertEquals(1, stats.getN());
        assertEquals(Double.NEGATIVE_INFINITY, stats.getMax(), 0);
        assertEquals(Double.NEGATIVE_INFINITY, stats.getMean(), 0);
        assertEquals(Double.NEGATIVE_INFINITY, stats.getMin(), 0);
        assertEquals(Double.NEGATIVE_INFINITY, stats.getSum(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getSumsq(), 0); // (-inf)^2 is +inf
        assertEquals(Double.NaN, stats.getVariance(), 0); // Variance with infinity is NaN
        assertEquals(Double.NaN, stats.getStandardDeviation(), 0); // StdDev with infinity is NaN
        assertEquals(Double.NEGATIVE_INFINITY, stats.getGeometricMean(), 0); // GM with negative infinity is -inf
        assertEquals(Double.NEGATIVE_INFINITY, stats.getSumOfLogs(), 0); // SumOfLogs with negative infinity is -inf
        assertEquals(Double.POSITIVE_INFINITY, stats.getSecondMoment(), 0); // Second Moment with -inf is +inf
        assertEquals(Double.POSITIVE_INFINITY, stats.getPopulationVariance(), 0); // Pop Var with infinity is infinity
    }

    /**
     * Tests a large number of values to check for potential overflow issues.
     *
     * @throws Exception
     */
    @Test
    public void testLargeNumberOfValues() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        int numValues = 10000;
        double value = 1.0;
        for (int i = 0; i < numValues; i++) {
            stats.addValue(value);
        }
        assertEquals(numValues, stats.getN());
        assertEquals(value, stats.getMean(), 0);
        assertEquals(value, stats.getMax(), 0);
        assertEquals(value, stats.getMin(), 0);
        assertEquals(value * numValues, stats.getSum(), 0);
        assertEquals(value * value * numValues, stats.getSumsq(), 0);
        assertEquals(0.0, stats.getVariance(), 0);
        assertEquals(0.0, stats.getStandardDeviation(), 0);
        assertEquals(Math.log(value) * numValues, stats.getSumOfLogs(), 1e-9);
        assertEquals(value, stats.getGeometricMean(), 1e-9);
        assertEquals(0.0, stats.getSecondMoment(), 0);
        assertEquals(0.0, stats.getPopulationVariance(), 0);
    }

    /**
     * Tests with values at the boundaries of double precision.
     *
     * @throws Exception
     */
    @Test
    public void testBoundaryValues() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(Double.MAX_VALUE);
        stats.addValue(Double.MIN_VALUE); // Smallest positive normal value

        assertEquals(2, stats.getN());
        assertEquals(Double.MAX_VALUE, stats.getMax(), 0);
        assertEquals(Double.MIN_VALUE, stats.getMin(), 0);
        assertEquals(Double.MAX_VALUE, stats.getSum(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getSumsq(), 0);
        assertEquals(Double.MAX_VALUE, stats.getMean(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getVariance(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getStandardDeviation(), 0);
        assertEquals(Math.log(Double.MAX_VALUE), stats.getSumOfLogs(), 0);
        assertEquals(Double.MAX_VALUE, stats.getGeometricMean(), 1e-9);
        assertEquals(Double.POSITIVE_INFINITY, stats.getSecondMoment(), 0);
        assertEquals(Double.POSITIVE_INFINITY, stats.getPopulationVariance(), 0);
    }

    /**
     * Tests with very small positive numbers.
     *
     * @throws Exception
     */
    @Test
    public void testVerySmallPositiveNumbers() throws Exception {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1e-300);
        stats.addValue(1e-305);

        assertEquals(2, stats.getN());
        assertEquals(1e-300, stats.getMax(), 0);
        assertEquals(1e-305, stats.getMin(), 0);
        assertEquals(1e-300, stats.getSum(), 1e-310);
        // The result of (1e-300)^2 is approximately 1e-600, which is smaller than Double.MIN_VALUE,
        // so it might be rounded to 0.0. Testing with a very small epsilon.
        assertEquals(0.0, stats.getSumsq(), 1e-600);
        assertEquals(1e-300, stats.getMean(), 1e-310);
        // Variance and second moment will be very small, close to 0.
        assertEquals(0.0, stats.getVariance(), 1e-600);
        assertEquals(0.0, stats.getStandardDeviation(), 1e-300);
        assertEquals(Math.log(1e-300), stats.getSumOfLogs(), 1e-310);
        assertEquals(1e-300, stats.getGeometricMean(), 1e-310);
        assertEquals(0.0, stats.getSecondMoment(), 1e-600);
        assertEquals(0.0, stats.getPopulationVariance(), 1e-600);
    }
}
```