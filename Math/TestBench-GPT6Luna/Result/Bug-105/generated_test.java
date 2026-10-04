package org.apache.commons.math.stat.regression;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.DistributionFactory;
import org.apache.commons.math.distribution.TDistribution;

public class SimpleRegressionTest {
    @Test
    public void testEmptyRegressionStatistics() throws Exception {
        SimpleRegression r = new SimpleRegression();
        assertEquals(0L, r.getN());
        assertTrue(Double.isNaN(r.getSlope()));
        assertTrue(Double.isNaN(r.getTotalSumSquares()));
    }

    @Test
    public void testSingleObservationStatistics() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(2.0, 5.0);
        assertEquals(1L, r.getN());
        assertTrue(Double.isNaN(r.getSlope()));
        assertTrue(Double.isNaN(r.getTotalSumSquares()));
    }

    @Test
    public void testTwoPointIncreasingLine() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(1.0, 3.0);
        r.addData(3.0, 7.0);
        assertEquals(2.0, r.getSlope(), 1e-12);
        assertEquals(1.0, r.getIntercept(), 1e-12);
        assertEquals(5.0, r.predict(2.0), 1e-12);
    }

    @Test
    public void testTwoPointDecreasingLine() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(1.0, 7.0);
        r.addData(3.0, 3.0);
        assertEquals(-2.0, r.getSlope(), 1e-12);
        assertEquals(9.0, r.getIntercept(), 1e-12);
        assertEquals(-1.0, r.getR(), 1e-12);
    }

    @Test
    public void testNoVariationInX() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(4.0, 1.0);
        r.addData(4.0, 3.0);
        r.addData(4.0, 5.0);
        assertTrue(Double.isNaN(r.getSlope()));
        assertTrue(Double.isNaN(r.getRSquare()));
        assertEquals(8.0, r.getTotalSumSquares(), 1e-12);
    }

    @Test
    public void testResidualAndVarianceStatistics() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 1.0);
        r.addData(1.0, 2.0);
        r.addData(2.0, 2.0);
        assertEquals(1.0 / 6.0, r.getSumSquaredErrors(), 1e-12);
        assertEquals(2.0 / 3.0, r.getTotalSumSquares(), 1e-12);
        assertEquals(1.0 / 2.0, r.getRegressionSumSquares(), 1e-12);
        assertEquals(1.0 / 6.0, r.getMeanSquareError(), 1e-12);
    }

    @Test
    public void testPerfectFitHasZeroErrorAndUnitRSquare() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 1.0);
        r.addData(1.0, 3.0);
        r.addData(2.0, 5.0);
        assertEquals(0.0, r.getSumSquaredErrors(), 1e-12);
        assertEquals(1.0, r.getRSquare(), 1e-12);
        assertEquals(1.0, r.getR(), 1e-12);
    }

    @Test
    public void testNegativeSlopeCorrelation() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 5.0);
        r.addData(1.0, 3.0);
        r.addData(2.0, 1.0);
        assertEquals(-1.0, r.getR(), 1e-12);
        assertEquals(1.0, r.getRSquare(), 1e-12);
    }

    @Test
    public void testStandardErrorsForThreePoints() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 1.0);
        r.addData(1.0, 2.0);
        r.addData(2.0, 2.0);
        assertEquals(Math.sqrt(1.0 / 12.0), r.getSlopeStdErr(), 1e-12);
        assertEquals(Math.sqrt(1.0 / 12.0), r.getInterceptStdErr(), 1e-12);
    }

    @Test
    public void testOneResidualDegreeOfFreedom() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 1.0);
        r.addData(1.0, 2.0);
        assertTrue(Double.isNaN(r.getMeanSquareError()));
        assertTrue(Double.isNaN(r.getSlopeStdErr()));
    }

    @Test
    public void testArrayInputAppendsToExistingData() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 1.0);
        r.addData(new double[][] {{1.0, 3.0}, {2.0, 5.0}});
        assertEquals(3L, r.getN());
        assertEquals(2.0, r.getSlope(), 1e-12);
        assertEquals(0.0, r.getSumSquaredErrors(), 1e-12);
    }

    @Test
    public void testClearResetsModel() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(1.0, 2.0);
        r.addData(2.0, 4.0);
        r.clear();
        assertEquals(0L, r.getN());
        assertTrue(Double.isNaN(r.getSlope()));
        assertTrue(Double.isNaN(r.getTotalSumSquares()));
    }

    @Test
    public void testAddingAfterClearStartsFreshModel() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(1.0, 100.0);
        r.addData(2.0, 200.0);
        r.clear();
        r.addData(0.0, 1.0);
        r.addData(1.0, 4.0);
        r.addData(2.0, 7.0);
        assertEquals(3L, r.getN());
        assertEquals(3.0, r.getSlope(), 1e-12);
        assertEquals(1.0, r.getIntercept(), 1e-12);
    }

    @Test
    public void testTwoObservationTotalSquares() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 2.0);
        r.addData(1.0, 6.0);
        assertEquals(8.0, r.getTotalSumSquares(), 1e-12);
        assertEquals(0.0, r.getSumSquaredErrors(), 1e-12);
    }

    @Test
    public void testInterceptAndPredictionUpdateWhenDataIsAdded() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 0.0);
        r.addData(1.0, 2.0);
        assertEquals(2.0, r.predict(1.0), 1e-12);
        r.addData(2.0, 4.0);
        assertEquals(2.0, r.predict(1.0), 1e-12);
    }

    @Test
    public void testSseIsNonnegativeForRoundoffSensitiveData() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(1.0, 2.0);
        r.addData(2.0, 4.0);
        r.addData(3.0, 6.0);
        assertEquals(0.0, r.getSumSquaredErrors(), 1e-12);
    }

    @Test
    public void testSlopeConfidenceIntervalRejectsZeroAlpha() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 1.0);
        r.addData(1.0, 2.0);
        r.addData(2.0, 4.0);
        try {
            r.getSlopeConfidenceInterval(0.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testSlopeConfidenceIntervalRejectsUnitAlpha() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 1.0);
        r.addData(1.0, 2.0);
        r.addData(2.0, 4.0);
        try {
            r.getSlopeConfidenceInterval(1.0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testConfidenceIntervalReturnsNonnegativeWidth() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 1.0);
        r.addData(1.0, 3.0);
        r.addData(2.0, 4.0);
        assertTrue(r.getSlopeConfidenceInterval(0.05) >= 0.0);
    }

    @Test
    public void testSignificanceIsWithinProbabilityRange() throws Exception {
        SimpleRegression r = new SimpleRegression();
        r.addData(0.0, 1.0);
        r.addData(1.0, 3.0);
        r.addData(2.0, 4.0);
        double significance = r.getSignificance();
        assertTrue(significance >= 0.0);
        assertTrue(significance <= 1.0);
    }
}
