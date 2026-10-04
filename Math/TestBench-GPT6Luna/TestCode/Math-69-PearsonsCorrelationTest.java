package org.apache.commons.math.stat.correlation;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.distribution.TDistribution;
import org.apache.commons.math.distribution.TDistributionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.stat.regression.SimpleRegression;

public class PearsonsCorrelationTest {
    @Test
    public void testCorrelationPerfectPositive() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation();
        assertEquals(1.0, correlation.correlation(
                new double[] {1, 2, 3}, new double[] {3, 5, 7}), 1e-12);
    }

    @Test
    public void testCorrelationPerfectNegative() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation();
        assertEquals(-1.0, correlation.correlation(
                new double[] {1, 2, 3}, new double[] {7, 5, 3}), 1e-12);
    }

    @Test
    public void testCorrelationWithZeroCorrelation() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation();
        assertEquals(0.0, correlation.correlation(
                new double[] {-1, 0, 1}, new double[] {1, -2, 1}), 1e-12);
    }

    @Test
    public void testCorrelationTwoObservations() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation();
        assertEquals(1.0, correlation.correlation(
                new double[] {2, 4}, new double[] {5, 9}), 1e-12);
    }

    @Test
    public void testCorrelationRejectsOneObservation() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation();
        try {
            correlation.correlation(new double[] {1}, new double[] {2});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testCorrelationRejectsDifferentLengths() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation();
        try {
            correlation.correlation(new double[] {1, 2}, new double[] {3});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testComputeCorrelationMatrixFromMatrix() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation();
        RealMatrix result = correlation.computeCorrelationMatrix(
                new BlockRealMatrix(new double[][] {
                    {1, 2}, {2, 4}, {3, 6}
                }));
        assertEquals(2, result.getRowDimension());
        assertEquals(1.0, result.getEntry(0, 0), 0.0);
        assertEquals(1.0, result.getEntry(1, 1), 0.0);
        assertEquals(1.0, result.getEntry(0, 1), 1e-12);
        assertEquals(1.0, result.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testConstructorComputesCorrelationMatrix() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation(
                new double[][] {{1, 3}, {2, 5}, {3, 7}});
        RealMatrix result = correlation.getCorrelationMatrix();
        assertEquals(1.0, result.getEntry(0, 0), 0.0);
        assertEquals(1.0, result.getEntry(0, 1), 1e-12);
        assertEquals(1.0, result.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testGetCorrelationStandardErrorsForPerfectCorrelation() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation(
                new double[][] {{1, 2}, {2, 4}, {3, 6}, {4, 8}});
        RealMatrix errors = correlation.getCorrelationStandardErrors();
        assertEquals(0.0, errors.getEntry(0, 1), 0.0);
        assertEquals(0.0, errors.getEntry(1, 0), 0.0);
        assertEquals(0.0, errors.getEntry(0, 0), 0.0);
    }

    @Test
    public void testGetCorrelationStandardErrorsForZeroCorrelation() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation(
                new double[][] {{-1, 1}, {0, -2}, {1, 1}, {2, 0}});
        RealMatrix errors = correlation.getCorrelationStandardErrors();
        assertEquals(Math.sqrt(1.0 / 2.0), errors.getEntry(0, 1), 1e-12);
    }

    @Test
    public void testGetCorrelationPValuesDiagonalAndPerfectCorrelation() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation(
                new double[][] {{1, 2}, {2, 4}, {3, 6}, {4, 8}});
        RealMatrix pValues = correlation.getCorrelationPValues();
        assertEquals(0.0, pValues.getEntry(0, 0), 0.0);
        assertEquals(0.0, pValues.getEntry(1, 1), 0.0);
        assertEquals(0.0, pValues.getEntry(0, 1), 0.0);
    }

    @Test
    public void testGetCorrelationPValuesForZeroCorrelation() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation(
                new double[][] {{-1, 1}, {0, -2}, {1, 1}, {2, 0}});
        RealMatrix pValues = correlation.getCorrelationPValues();
        assertEquals(1.0, pValues.getEntry(0, 1), 1e-12);
        assertEquals(1.0, pValues.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testCovarianceToCorrelationScalesAndMirrorsEntries() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation();
        RealMatrix result = correlation.covarianceToCorrelation(
                new BlockRealMatrix(new double[][] {{4, 3}, {3, 9}}));
        assertEquals(1.0, result.getEntry(0, 0), 0.0);
        assertEquals(1.0, result.getEntry(1, 1), 0.0);
        assertEquals(0.5, result.getEntry(0, 1), 1e-12);
        assertEquals(0.5, result.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testCovarianceToCorrelationWithNegativeCovariance() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation();
        RealMatrix result = correlation.covarianceToCorrelation(
                new BlockRealMatrix(new double[][] {{4, -6}, {-6, 9}}));
        assertEquals(-1.0, result.getEntry(0, 1), 1e-12);
        assertEquals(-1.0, result.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testCovarianceMatrixConstructorUsesObservationCount() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation(
                new BlockRealMatrix(new double[][] {{4, 2}, {2, 9}}), 5);
        assertEquals(1.0, correlation.getCorrelationMatrix().getEntry(0, 0), 0.0);
        assertEquals(Math.sqrt(1.0 - (1.0 / 3.0) * (1.0 / 3.0)),
                correlation.getCorrelationStandardErrors().getEntry(0, 1), 1e-12);
    }

    @Test
    public void testTwoVariableMatrixKeepsCorrelationSymmetric() throws Exception {
        PearsonsCorrelation correlation = new PearsonsCorrelation(
                new double[][] {{1, 1}, {2, 3}, {4, 2}, {5, 7}});
        RealMatrix result = correlation.getCorrelationMatrix();
        assertEquals(result.getEntry(0, 1), result.getEntry(1, 0), 0.0);
        assertEquals(1.0, result.getEntry(0, 0), 0.0);
    }
}
