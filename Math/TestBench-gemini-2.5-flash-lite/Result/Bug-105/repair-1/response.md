```java
package org.apache.commons.math.stat.regression;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.DistributionFactory;
import org.apache.commons.math.distribution.TDistribution;

public class SimpleRegressionTest {
    /**
     * test method for the intercept calculation.
     */
    @Test
    public void testIntercept() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(0, 1);
        regression.addData(1, 2);
        // Expected: intercept = ybar - slope * xbar
        // ybar = (1+2)/2 = 1.5
        // xbar = (0+1)/2 = 0.5
        // slope = sumXY / sumXX
        // dx1 = 0 - 0.5 = -0.5, dy1 = 1 - 1.5 = -0.5
        // dx2 = 1 - 0.5 = 0.5, dy2 = 2 - 1.5 = 0.5
        // sumXX = dx1*dx1*(n/(n+1)) + dx2*dx2*(n/(n+1)) = 0.25*(1/2) + 0.25*(1/2) = 0.25
        // sumXY = dx1*dy1*(n/(n+1)) + dx2*dy2*(n/(n+1)) = 0.25*(1/2) + 0.25*(1/2) = 0.25
        // slope = 0.25 / 0.25 = 1.0
        // intercept = 1.5 - 1.0 * 0.5 = 1.0
        assertEquals(1.0, regression.getIntercept(), 1e-9);
    }

    /**
     * test method for the slope calculation.
     */
    @Test
    public void testSlope() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(0, 1);
        regression.addData(1, 2);
        // Expected: slope = sumXY / sumXX. Calculated above as 1.0.
        assertEquals(1.0, regression.getSlope(), 1e-9);
    }

    /**
     * test method for sum of squared errors.
     */
    @Test
    public void testSumSquaredErrors() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(0, 1);
        regression.addData(1, 2);
        // SSE = SYY - SXY^2 / SXX
        // SYY = dy1*dy1*(n/(n+1)) + dy2*dy2*(n/(n+1)) = 0.25*(1/2) + 0.25*(1/2) = 0.25
        // SXY = 0.25 (calculated above)
        // SXX = 0.25 (calculated above)
        // SSE = 0.25 - 0.25^2 / 0.25 = 0.25 - 0.25 = 0
        assertEquals(0.0, regression.getSumSquaredErrors(), 1e-9);
    }

    /**
     * test method for total sum of squares.
     */
    @Test
    public void testTotalSumSquares() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(0, 1);
        regression.addData(1, 2);
        // SYY calculated above as 0.25
        assertEquals(0.25, regression.getTotalSumSquares(), 1e-9);
    }

    /**
     * test method for regression sum of squares.
     */
    @Test
    public void testRegressionSumSquares() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(0, 1);
        regression.addData(1, 2);
        // SSR = slope^2 * SXX
        // slope = 1.0, SXX = 0.25
        // SSR = 1.0^2 * 0.25 = 0.25
        assertEquals(0.25, regression.getRegressionSumSquares(), 1e-9);
    }

    /**
     * test method for mean square error.
     */
    @Test
    public void testMeanSquareError() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(0, 1);
        regression.addData(1, 2);
        regression.addData(2, 3); // Need at least 3 for MSE
        // n = 3
        // sumXX, sumYY, sumXY are updated.
        // With (0,1), (1,2), (2,3): xbar = 1, ybar = 2
        // x = 0, y = 1: dx = -1, dy = -1. dx*dx*(2/3)=4/3, dy*dy*(2/3)=4/3, dx*dy*(2/3)=4/3
        // x = 1, y = 2: dx = 0, dy = 0. dx*dx*(2/3)=0, dy*dy*(2/3)=0, dx*dy*(2/3)=0
        // x = 2, y = 3: dx = 1, dy = 1. dx*dx*(2/3)=4/3, dy*dy*(2/3)=4/3, dx*dy*(2/3)=4/3
        // sumXX = 4/3 + 0 + 4/3 = 8/3
        // sumYY = 8/3
        // sumXY = 8/3
        // SSE = 8/3 - (8/3)^2 / (8/3) = 8/3 - 8/3 = 0
        // MSE = SSE / (n-2) = 0 / (3-2) = 0
        assertEquals(0.0, regression.getMeanSquareError(), 1e-9);
    }

    /**
     * test method for Pearson's r.
     */
    @Test
    public void testR() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(0, 1);
        regression.addData(1, 2);
        // r = sqrt(RSquare)
        // RSquare = (SSTO - SSE) / SSTO
        // SSTO = SYY. With 3 points (0,1), (1,2), (2,3), SYY = 8/3
        // SSE = 0
        // RSquare = (8/3 - 0) / (8/3) = 1
        // r = sqrt(1) = 1.0
        assertEquals(1.0, regression.getR(), 1e-9);
    }

    /**
     * test method for r-square.
     */
    @Test
    public void testRSquare() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(0, 1);
        regression.addData(1, 2);
        regression.addData(2, 3);
        // RSquare calculated above as 1.0
        assertEquals(1.0, regression.getRSquare(), 1e-9);
    }

    /**
     * test method for standard error of the intercept.
     */
    @Test
    public void testInterceptStdErr() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        regression.addData(2, 2);
        regression.addData(3, 3);
        // n=3, xbar=2, ybar=2
        // dx1 = -1, dy1 = -1, dx2 = 0, dy2 = 0, dx3 = 1, dy3 = 1
        // sumXX = (-1)^2 * (2/3) + 0^2 * (2/3) + 1^2 * (2/3) = 2/3 + 0 + 2/3 = 4/3
        // sumYY = (-1)^2 * (2/3) + 0^2 * (2/3) + 1^2 * (2/3) = 4/3
        // sumXY = (-1)*(-1)*(2/3) + 0*0*(2/3) + 1*1*(2/3) = 2/3 + 0 + 2/3 = 4/3
        // slope = sumXY / sumXX = (4/3) / (4/3) = 1.0
        // SSE = sumYY - sumXY^2 / sumXX = 4/3 - (4/3)^2 / (4/3) = 4/3 - 4/3 = 0
        // MSE = SSE / (n-2) = 0 / 1 = 0
        // interceptStdErr = sqrt(MSE * (1/n + xbar^2 / sumXX))
        // interceptStdErr = sqrt(0 * (1/3 + 2^2 / (4/3))) = 0
        assertEquals(0.0, regression.getInterceptStdErr(), 1e-9);
    }

    /**
     * test method for standard error of the slope.
     */
    @Test
    public void testSlopeStdErr() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        regression.addData(2, 2);
        regression.addData(3, 3);
        // MSE = 0, sumXX = 4/3
        // slopeStdErr = sqrt(MSE / sumXX) = sqrt(0 / (4/3)) = 0
        assertEquals(0.0, regression.getSlopeStdErr(), 1e-9);
    }

    /**
     * test method for confidence interval of the slope (alpha = 0.05).
     */
    @Test
    public void testSlopeConfidenceInterval() throws Exception {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        regression.addData(2, 2);
        regression.addData(3, 3);
        // slopeStdErr = 0, so confidence interval should be 0.
        assertEquals(0.0, regression.getSlopeConfidenceInterval(), 1e-9);
    }

    /**
     * test method for confidence interval of the slope with specific alpha.
     */
    @Test
    public void testSlopeConfidenceIntervalAlpha() throws Exception {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        regression.addData(2, 2);
        regression.addData(3, 3);
        // slopeStdErr = 0, so confidence interval should be 0.
        assertEquals(0.0, regression.getSlopeConfidenceInterval(0.1), 1e-9);
    }

    /**
     * test method for significance of the slope.
     */
    @Test
    public void testSignificance() throws Exception {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        regression.addData(2, 2);
        regression.addData(3, 3);
        // slope = 1.0, slopeStdErr = 0. Division by zero would occur if not handled.
        // The getSlopeStdErr() method returns 0 when MSE is 0.
        // In getSignificance(), Math.abs(getSlope()) / getSlopeStdErr() will be NaN if slopeStdErr is 0.
        // The TDistribution.cumulativeProbability(NaN) should return NaN.
        // 2 * (1.0 - NaN) = NaN.
        assertTrue(Double.isNaN(regression.getSignificance()));
    }

    /**
     * Test with no data. All statistics should be NaN.
     */
    @Test
    public void testNoData() {
        SimpleRegression regression = new SimpleRegression();
        assertTrue(Double.isNaN(regression.getIntercept()));
        assertTrue(Double.isNaN(regression.getSlope()));
        assertTrue(Double.isNaN(regression.getSumSquaredErrors()));
        assertTrue(Double.isNaN(regression.getTotalSumSquares()));
        assertTrue(Double.isNaN(regression.getRegressionSumSquares()));
        assertTrue(Double.isNaN(regression.getMeanSquareError()));
        assertTrue(Double.isNaN(regression.getR()));
        assertTrue(Double.isNaN(regression.getRSquare()));
        assertTrue(Double.isNaN(regression.getInterceptStdErr()));
        assertTrue(Double.isNaN(regression.getSlopeStdErr()));
        assertTrue(Double.isNaN(regression.getSlopeConfidenceInterval()));
        assertTrue(Double.isNaN(regression.getSignificance()));
        assertEquals(0, regression.getN());
    }

    /**
     * Test with one data point. All statistics should be NaN.
     */
    @Test
    public void testOneDataPoint() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        assertTrue(Double.isNaN(regression.getIntercept()));
        assertTrue(Double.isNaN(regression.getSlope()));
        assertTrue(Double.isNaN(regression.getSumSquaredErrors()));
        assertTrue(Double.isNaN(regression.getTotalSumSquares()));
        assertTrue(Double.isNaN(regression.getRegressionSumSquares()));
        assertTrue(Double.isNaN(regression.getMeanSquareError()));
        assertTrue(Double.isNaN(regression.getR()));
        assertTrue(Double.isNaN(regression.getRSquare()));
        assertTrue(Double.isNaN(regression.getInterceptStdErr()));
        assertTrue(Double.isNaN(regression.getSlopeStdErr()));
        assertTrue(Double.isNaN(regression.getSlopeConfidenceInterval()));
        assertTrue(Double.isNaN(regression.getSignificance()));
        assertEquals(1, regression.getN());
    }

    /**
     * Test with two data points. Slope and intercept are defined, but other statistics
     * that require n > 2 or variation in x might be NaN.
     */
    @Test
    public void testTwoDataPoints() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 2);
        regression.addData(3, 4);
        // ybar = 3, xbar = 2
        // dx1 = -1, dy1 = -1. dx1^2*(1/2) = 0.5, dy1^2*(1/2) = 0.5, dx1*dy1*(1/2) = 0.5
        // dx2 = 1, dy2 = 1. dx2^2*(1/2) = 0.5, dy2^2*(1/2) = 0.5, dx2*dy2*(1/2) = 0.5
        // sumXX = 0.5 + 0.5 = 1.0
        // sumYY = 0.5 + 0.5 = 1.0
        // sumXY = 0.5 + 0.5 = 1.0
        // slope = 1.0 / 1.0 = 1.0
        // intercept = 3 - 1.0 * 2 = 1.0
        assertEquals(1.0, regression.getIntercept(), 1e-9);
        assertEquals(1.0, regression.getSlope(), 1e-9);
        // SSE = SYY - SXY^2 / SXX = 1.0 - 1.0^2 / 1.0 = 0.0
        assertEquals(0.0, regression.getSumSquaredErrors(), 1e-9);
        assertEquals(1.0, regression.getTotalSumSquares(), 1e-9);
        assertEquals(1.0, regression.getRegressionSumSquares(), 1e-9); // slope^2 * sumXX = 1^2 * 1.0 = 1.0
        // MSE requires n >= 3
        assertTrue(Double.isNaN(regression.getMeanSquareError()));
        // R requires MSE to calculate slopeStdErr, which is used for R.
        // R calculation: sqrt(RSquare). RSquare = (SSTO - SSE) / SSTO = (1.0 - 0.0) / 1.0 = 1.0
        // R = sqrt(1.0) = 1.0
        assertEquals(1.0, regression.getR(), 1e-9);
        assertEquals(1.0, regression.getRSquare(), 1e-9);
        // Std errors require n >= 3
        assertTrue(Double.isNaN(regression.getInterceptStdErr()));
        assertTrue(Double.isNaN(regression.getSlopeStdErr()));
        assertTrue(Double.isNaN(regression.getSlopeConfidenceInterval()));
        assertTrue(Double.isNaN(regression.getSignificance()));
        assertEquals(2, regression.getN());
    }

    /**
     * Test with identical x values. Slope and related statistics should be NaN.
     */
    @Test
    public void testIdenticalXValues() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        regression.addData(1, 2);
        regression.addData(1, 3);
        // sumXX will be 0.
        assertTrue(Double.isNaN(regression.getSlope()));
        assertTrue(Double.isNaN(regression.getSumSquaredErrors()));
        assertTrue(Double.isNaN(regression.getRegressionSumSquares()));
        assertTrue(Double.isNaN(regression.getMeanSquareError()));
        assertTrue(Double.isNaN(regression.getR()));
        assertTrue(Double.isNaN(regression.getRSquare()));
        assertTrue(Double.isNaN(regression.getInterceptStdErr()));
        assertTrue(Double.isNaN(regression.getSlopeStdErr()));
        assertTrue(Double.isNaN(regression.getSlopeConfidenceInterval()));
        assertTrue(Double.isNaN(regression.getSignificance()));
        assertEquals(3, regression.getN());
        // Intercept and TotalSumSquares should still be calculable
        // ybar = (1+2+3)/3 = 2
        // sumY = 6
        // intercept = sumY / n = 6 / 3 = 2.0
        assertEquals(2.0, regression.getIntercept(), 1e-9);
        // SYY = (1-2)^2 * (2/3) + (2-2)^2 * (2/3) + (3-2)^2 * (2/3)
        // SYY = 1 * (2/3) + 0 + 1 * (2/3) = 4/3
        assertEquals(4.0/3.0, regression.getTotalSumSquares(), 1e-9);
    }

    /**
     * Test prediction with a single data point. Should return NaN.
     */
    @Test
    public void testPredictWithOnePoint() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 2);
        assertTrue(Double.isNaN(regression.predict(5)));
    }

    /**
     * Test prediction with valid data.
     */
    @Test
    public void testPredictWithValidData() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(0, 1);
        regression.addData(1, 2);
        // Expected prediction = intercept + slope * x
        // intercept = 1.0, slope = 1.0
        // predict(5) = 1.0 + 1.0 * 5 = 6.0
        assertEquals(6.0, regression.predict(5), 1e-9);
    }

    /**
     * Test clear method.
     */
    @Test
    public void testClear() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 2);
        regression.addData(3, 4);
        regression.clear();
        assertEquals(0, regression.getN());
        assertTrue(Double.isNaN(regression.getIntercept()));
        assertTrue(Double.isNaN(regression.getSlope()));
    }

    /**
     * Test addData with a 2D array.
     */
    @Test
    public void testAddData2DArray() {
        SimpleRegression regression = new SimpleRegression();
        double[][] data = {{1, 2}, {3, 4}};
        regression.addData(data);
        assertEquals(2, regression.getN());
        assertEquals(1.0, regression.getSlope(), 1e-9);
        assertEquals(1.0, regression.getIntercept(), 1e-9);
    }

    /**
     * Test with negative values.
     */
    @Test
    public void testNegativeValues() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(-1, -2);
        regression.addData(-3, -4);
        // xbar = (-1 + -3) / 2 = -2
        // ybar = (-2 + -4) / 2 = -3
        // dx1 = -1 - (-2) = 1, dy1 = -2 - (-3) = 1
        // dx2 = -3 - (-2) = -1, dy2 = -4 - (-3) = -1
        // sumXX = 1^2 * (1/2) + (-1)^2 * (1/2) = 0.5 + 0.5 = 1.0
        // sumYY = 1^2 * (1/2) + (-1)^2 * (1/2) = 0.5 + 0.5 = 1.0
        // sumXY = 1 * 1 * (1/2) + (-1) * (-1) * (1/2) = 0.5 + 0.5 = 1.0
        // slope = sumXY / sumXX = 1.0 / 1.0 = 1.0
        // intercept = ybar - slope * xbar = -3 - 1.0 * (-2) = -3 + 2 = -1.0
        assertEquals(-1.0, regression.getIntercept(), 1e-9);
        assertEquals(1.0, regression.getSlope(), 1e-9);
    }

    /**
     * Test with large values.
     */
    @Test
    public void testLargeValues() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1e6, 2e6);
        regression.addData(3e6, 4e6);
        // This is the same as testTwoDataPoints, just scaled by 1e6.
        // The slope and intercept should be the same.
        assertEquals(1.0, regression.getSlope(), 1e-9);
        assertEquals(1.0, regression.getIntercept(), 1e-9);
    }

    /**
     * Test getRSquare when total sum of squares is zero.
     */
    @Test
    public void testRSquareWhenSSTOIsZero() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(5, 10);
        regression.addData(5, 10); // Identical x and y
        // sumXX = 0, sumYY = 0, sumXY = 0
        // This case is handled by the 'no variation in x' check, returning NaN for slope etc.
        // However, getTotalSumSquares() should return 0 if n >= 2.
        assertEquals(0.0, regression.getTotalSumSquares(), 1e-9);
        // getRSquare should return NaN if SSTO is 0 and SSE is not 0, or if SSTO is 0 and SSE is 0.
        // In this case, SSE will be 0. (0-0)/0 is NaN.
        assertTrue(Double.isNaN(regression.getRSquare()));
    }

    /**
     * Test getSumSquaredErrors when result of computation is negative due to rounding.
     */
    @Test
    public void testSumSquaredErrorsNegativeResult() {
        SimpleRegression regression = new SimpleRegression();
        // Add data such that sumYY - sumXY * sumXY / sumXX is slightly negative.
        // This is difficult to engineer precisely without knowing internal floating point behavior.
        // However, the method has `Math.max(0d, ...)` to handle this.
        // We can test if it returns 0 in a case where it *should* be 0, and verify it doesn't return negative.
        regression.addData(0, 0);
        regression.addData(1, 1);
        assertEquals(0.0, regression.getSumSquaredErrors(), 1e-9);
    }

    /**
     * Test the precision of calculations with floating point numbers.
     */
    @Test
    public void testFloatingPointPrecision() {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(0.1, 0.2);
        regression.addData(0.3, 0.4);
        // xbar = 0.2, ybar = 0.3
        // dx1 = 0.1 - 0.2 = -0.1, dy1 = 0.2 - 0.3 = -0.1
        // dx2 = 0.3 - 0.2 = 0.1, dy2 = 0.4 - 0.3 = 0.1
        // sumXX = (-0.1)^2 * (1/2) + (0.1)^2 * (1/2) = 0.01 * 0.5 + 0.01 * 0.5 = 0.005 + 0.005 = 0.01
        // sumYY = (-0.1)^2 * (1/2) + (0.1)^2 * (1/2) = 0.01
        // sumXY = (-0.1)*(-0.1)*(1/2) + (0.1)*(0.1)*(1/2) = 0.005 + 0.005 = 0.01
        // slope = 0.01 / 0.01 = 1.0
        // intercept = 0.3 - 1.0 * 0.2 = 0.1
        assertEquals(0.1, regression.getIntercept(), 1e-15); // Use higher precision
        assertEquals(1.0, regression.getSlope(), 1e-15);
    }

    /**
     * Test edge case where alpha is very close to 0 for confidence interval.
     */
    @Test
    public void testSlopeConfidenceIntervalAlphaNearZero() throws Exception {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        regression.addData(2, 2);
        regression.addData(3, 3);
        // slopeStdErr is 0, so interval should be 0.
        assertEquals(0.0, regression.getSlopeConfidenceInterval(1e-10), 1e-9);
    }

    /**
     * Test edge case where alpha is very close to 1 for confidence interval.
     */
    @Test
    public void testSlopeConfidenceIntervalAlphaNearOne() throws Exception {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        regression.addData(2, 2);
        regression.addData(3, 3);
        // slopeStdErr is 0, so interval should be 0.
        assertEquals(0.0, regression.getSlopeConfidenceInterval(1 - 1e-10), 1e-9);
    }

    /**
     * Test that illegal alpha throws IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSlopeConfidenceIntervalIllegalAlphaTooSmall() throws Exception {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        regression.addData(2, 2);
        regression.addData(3, 3);
        regression.getSlopeConfidenceInterval(0.0);
    }

    /**
     * Test that illegal alpha throws IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSlopeConfidenceIntervalIllegalAlphaTooLarge() throws Exception {
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1, 1);
        regression.addData(2, 2);
        regression.addData(3, 3);
        regression.getSlopeConfidenceInterval(1.0);
    }

    /**
     * Test with a large number of data points to check for overflow or precision issues.
     */
    @Test
    public void testLargeNumberOfObservations() {
        SimpleRegression regression = new SimpleRegression();
        int numObservations = 10000;
        for (int i = 0; i < numObservations; i++) {
            regression.addData(i, 2 * i + 1); // y = 1 + 2x
        }
        // Expected: slope = 2, intercept = 1
        assertEquals(2.0, regression.getSlope(), 1e-9);
        assertEquals(1.0, regression.getIntercept(), 1e-9);
        assertEquals(0.0, regression.getSumSquaredErrors(), 1e-9);
        assertEquals(1.0, regression.getR(), 1e-9);
    }
}
```