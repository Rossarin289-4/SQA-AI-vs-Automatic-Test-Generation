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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testPearsonsCorrelationDefaultConstructor() {
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        assertNull(pearsons.getCorrelationMatrix());
        // nObs is private, cannot assert directly. Default constructor initializes it to 0.
    }

    @Test
    public void testPearsonsCorrelationWithMatrixConstructor() {
        double[][] data = {{1, 2}, {3, 4}, {5, 6}};
        RealMatrix matrix = new BlockRealMatrix(data);
        PearsonsCorrelation pearsons = new PearsonsCorrelation(matrix);
        assertNotNull(pearsons.getCorrelationMatrix());
        assertEquals(3, pearsons.getCorrelationMatrix().getRowDimension()); // Inferring nObs from matrix dimensions
    }

    @Test
    public void testPearsonsCorrelationWith2DArrayConstructor() {
        double[][] data = {{1, 2}, {3, 4}, {5, 6}};
        PearsonsCorrelation pearsons = new PearsonsCorrelation(data);
        assertNotNull(pearsons.getCorrelationMatrix());
        assertEquals(3, pearsons.getCorrelationMatrix().getRowDimension()); // Inferring nObs
    }

    @Test
    public void testPearsonsCorrelationWithCovarianceConstructor() {
        double[][] data = {{1, 2}, {3, 4}, {5, 6}};
        Covariance covariance = new Covariance(data);
        PearsonsCorrelation pearsons = new PearsonsCorrelation(covariance);
        assertNotNull(pearsons.getCorrelationMatrix());
        assertEquals(3, covariance.getN()); // Inferring nObs from covariance
    }

    @Test
    public void testPearsonsCorrelationWithCovarianceMatrixAndNObservationsConstructor() {
        double[][] data = {{1, 2}, {3, 4}, {5, 6}};
        Covariance covariance = new Covariance(data);
        RealMatrix covMatrix = covariance.getCovarianceMatrix();
        PearsonsCorrelation pearsons = new PearsonsCorrelation(covMatrix, 3);
        assertNotNull(pearsons.getCorrelationMatrix());
        assertEquals(3, pearsons.getCorrelationMatrix().getRowDimension()); // Inferring nObs from matrix dimensions
    }

    @Test
    public void testGetCorrelationMatrix() {
        double[][] data = {{1, 2}, {3, 4}, {5, 6}};
        RealMatrix matrix = new BlockRealMatrix(data);
        PearsonsCorrelation pearsons = new PearsonsCorrelation(matrix);
        RealMatrix corrMatrix = pearsons.getCorrelationMatrix();
        assertNotNull(corrMatrix);
        assertEquals(2, corrMatrix.getRowDimension());
        assertEquals(2, corrMatrix.getColumnDimension());
        assertEquals(1.0, corrMatrix.getEntry(0, 0), 0);
        assertEquals(1.0, corrMatrix.getEntry(1, 1), 0);
        assertEquals(1.0, corrMatrix.getEntry(0, 1), 1e-15); // Should be 1.0 for perfectly correlated
    }

    @Test
    public void testGetCorrelationStandardErrors() {
        double[][] data = {{1, 2}, {3, 4}, {5, 6}};
        PearsonsCorrelation pearsons = new PearsonsCorrelation(data);
        RealMatrix seMatrix = pearsons.getCorrelationStandardErrors();
        assertNotNull(seMatrix);
        assertEquals(2, seMatrix.getRowDimension());
        assertEquals(2, seMatrix.getColumnDimension());
        // For perfectly correlated data with n=3, SE should be 0
        assertEquals(0.0, seMatrix.getEntry(0, 0), 1e-15);
        assertEquals(0.0, seMatrix.getEntry(1, 1), 1e-15);
        assertEquals(0.0, seMatrix.getEntry(0, 1), 1e-15);
    }

    @Test
    public void testGetCorrelationPValues() throws MathException {
        double[][] data = {{1, 2}, {3, 4}, {5, 6}};
        PearsonsCorrelation pearsons = new PearsonsCorrelation(data);
        RealMatrix pValueMatrix = pearsons.getCorrelationPValues();
        assertNotNull(pValueMatrix);
        assertEquals(2, pValueMatrix.getRowDimension());
        assertEquals(2, pValueMatrix.getColumnDimension());
        // For perfectly correlated data with n=3, p-value should be 0
        assertEquals(0.0, pValueMatrix.getEntry(0, 0), 1e-15);
        assertEquals(0.0, pValueMatrix.getEntry(1, 1), 1e-15);
        assertEquals(0.0, pValueMatrix.getEntry(0, 1), 1e-15);
    }

    @Test
    public void testComputeCorrelationMatrix() {
        double[][] data = {{1, 2}, {3, 4}, {5, 6}};
        RealMatrix matrix = new BlockRealMatrix(data);
        PearsonsCorrelation pearsons = new PearsonsCorrelation(); // Use default constructor to call static-like method
        RealMatrix corrMatrix = pearsons.computeCorrelationMatrix(matrix);
        assertNotNull(corrMatrix);
        assertEquals(2, corrMatrix.getRowDimension());
        assertEquals(2, corrMatrix.getColumnDimension());
        assertEquals(1.0, corrMatrix.getEntry(0, 0), 0);
        assertEquals(1.0, corrMatrix.getEntry(1, 1), 0);
        assertEquals(1.0, corrMatrix.getEntry(0, 1), 1e-15);
    }

    @Test
    public void testComputeCorrelationMatrixFrom2DArray() {
        double[][] data = {{1, 2}, {3, 4}, {5, 6}};
        PearsonsCorrelation pearsons = new PearsonsCorrelation(); // Use default constructor to call static-like method
        RealMatrix corrMatrix = pearsons.computeCorrelationMatrix(data);
        assertNotNull(corrMatrix);
        assertEquals(2, corrMatrix.getRowDimension());
        assertEquals(2, corrMatrix.getColumnDimension());
        assertEquals(1.0, corrMatrix.getEntry(0, 0), 0);
        assertEquals(1.0, corrMatrix.getEntry(1, 1), 0);
        assertEquals(1.0, corrMatrix.getEntry(0, 1), 1e-15);
    }

    @Test
    public void testCorrelationValidInput() {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 4, 6, 8, 10};
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        assertEquals(1.0, pearsons.correlation(x, y), 1e-15);
    }

    @Test
    public void testCorrelationPerfectNegativeCorrelation() {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {-2, -4, -6, -8, -10};
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        assertEquals(-1.0, pearsons.correlation(x, y), 1e-15);
    }

    @Test
    public void testCorrelationZeroCorrelation() {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {1, -1, 1, -1, 1};
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        assertEquals(0.0, pearsons.correlation(x, y), 1e-15);
    }

    @Test
    public void testCorrelationInvalidArrayDimensionsLengthMismatch() {
        double[] x = {1, 2, 3};
        double[] y = {1, 2};
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        try {
            pearsons.correlation(x, y);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testCorrelationInvalidArrayDimensionsLengthLessThanTwo() {
        double[] x = {1};
        double[] y = {1};
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        try {
            pearsons.correlation(x, y);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testCorrelationWithConstantArray() {
        double[] x = {1, 1, 1, 1, 1};
        double[] y = {1, 2, 3, 4, 5};
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        // The SimpleRegression inside correlation() method will throw IllegalArgumentException if standard deviation is 0 for an array.
        try {
            pearsons.correlation(x, y);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testCovarianceToCorrelation() {
        double[][] covData = {{2.5, 1.0}, {1.0, 1.0}};
        RealMatrix covarianceMatrix = new BlockRealMatrix(covData);
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        RealMatrix correlationMatrix = pearsons.covarianceToCorrelation(covarianceMatrix);

        assertEquals(1.0, correlationMatrix.getEntry(0, 0), 0);
        assertEquals(1.0, correlationMatrix.getEntry(1, 1), 0);
        // r = cov(X,Y) / (s(X)s(Y)) = 1.0 / (sqrt(2.5) * sqrt(1.0)) = 1.0 / sqrt(2.5)
        assertEquals(1.0 / Math.sqrt(2.5), correlationMatrix.getEntry(0, 1), 1e-15);
        assertEquals(1.0 / Math.sqrt(2.5), correlationMatrix.getEntry(1, 0), 1e-15);
    }

    @Test
    public void testCovarianceToCorrelationWithZeroCovariance() {
        double[][] covData = {{2.5, 0.0}, {0.0, 1.0}};
        RealMatrix covarianceMatrix = new BlockRealMatrix(covData);
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        RealMatrix correlationMatrix = pearsons.covarianceToCorrelation(covarianceMatrix);

        assertEquals(1.0, correlationMatrix.getEntry(0, 0), 0);
        assertEquals(1.0, correlationMatrix.getEntry(1, 1), 0);
        assertEquals(0.0, correlationMatrix.getEntry(0, 1), 1e-15);
        assertEquals(0.0, correlationMatrix.getEntry(1, 0), 1e-15);
    }

    @Test
    public void testCovarianceToCorrelationEdgeCase() {
        // Covariance matrix with only one variable
        double[][] covData = {{2.5}};
        RealMatrix covarianceMatrix = new BlockRealMatrix(covData);
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        RealMatrix correlationMatrix = pearsons.covarianceToCorrelation(covarianceMatrix);

        assertEquals(1, correlationMatrix.getRowDimension());
        assertEquals(1, correlationMatrix.getColumnDimension());
        assertEquals(1.0, correlationMatrix.getEntry(0, 0), 0);
    }

    @Test
    public void testCovarianceToCorrelationWithZeroVariance() {
        // Covariance matrix with zero variance for one variable
        double[][] covData = {{0.0, 1.0}, {1.0, 2.0}};
        RealMatrix covarianceMatrix = new BlockRealMatrix(covData);
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        try {
            pearsons.covarianceToCorrelation(covarianceMatrix);
            fail("IllegalArgumentException expected due to division by zero variance");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testPearsonsCorrelationConstructorWithInsufficientDataRows() {
        double[][] data = {{1, 2}};
        try {
            new PearsonsCorrelation(data);
            fail("IllegalArgumentException expected for insufficient rows.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testPearsonsCorrelationConstructorWithInsufficientDataCols() {
        double[][] data = {{1}, {2}};
        try {
            new PearsonsCorrelation(data);
            fail("IllegalArgumentException expected for insufficient columns.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testPearsonsCorrelationConstructorWithSingleElementMatrix() {
        double[][] data = {{1}};
        try {
            new PearsonsCorrelation(data);
            fail("IllegalArgumentException expected for single element matrix.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testGetCorrelationMatrixWithThreeVariables() {
        double[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        PearsonsCorrelation pearsons = new PearsonsCorrelation(data);
        RealMatrix corrMatrix = pearsons.getCorrelationMatrix();
        assertEquals(1.0, corrMatrix.getEntry(0, 0), 1e-15);
        assertEquals(1.0, corrMatrix.getEntry(1, 1), 1e-15);
        assertEquals(1.0, corrMatrix.getEntry(2, 2), 1e-15);
        assertEquals(1.0, corrMatrix.getEntry(0, 1), 1e-15);
        assertEquals(1.0, corrMatrix.getEntry(1, 0), 1e-15);
        assertEquals(1.0, corrMatrix.getEntry(0, 2), 1e-15);
        assertEquals(1.0, corrMatrix.getEntry(2, 0), 1e-15);
        assertEquals(1.0, corrMatrix.getEntry(1, 2), 1e-15);
        assertEquals(1.0, corrMatrix.getEntry(2, 1), 1e-15);
    }

    @Test
    public void testGetCorrelationStandardErrorsWithThreeVariables() throws MathException {
        double[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        PearsonsCorrelation pearsons = new PearsonsCorrelation(data);
        RealMatrix seMatrix = pearsons.getCorrelationStandardErrors();
        assertEquals(0.0, seMatrix.getEntry(0, 0), 1e-15);
        assertEquals(0.0, seMatrix.getEntry(1, 1), 1e-15);
        assertEquals(0.0, seMatrix.getEntry(2, 2), 1e-15);
        assertEquals(0.0, seMatrix.getEntry(0, 1), 1e-15);
        assertEquals(0.0, seMatrix.getEntry(1, 0), 1e-15);
        assertEquals(0.0, seMatrix.getEntry(0, 2), 1e-15);
        assertEquals(0.0, seMatrix.getEntry(2, 0), 1e-15);
        assertEquals(0.0, seMatrix.getEntry(1, 2), 1e-15);
        assertEquals(0.0, seMatrix.getEntry(2, 1), 1e-15);
    }

    @Test
    public void testGetCorrelationPValuesWithThreeVariables() throws MathException {
        double[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        PearsonsCorrelation pearsons = new PearsonsCorrelation(data);
        RealMatrix pValueMatrix = pearsons.getCorrelationPValues();
        assertEquals(0.0, pValueMatrix.getEntry(0, 0), 1e-15);
        assertEquals(0.0, pValueMatrix.getEntry(1, 1), 0.0);
        assertEquals(0.0, pValueMatrix.getEntry(2, 2), 0.0);
        assertEquals(0.0, pValueMatrix.getEntry(0, 1), 0.0);
        assertEquals(0.0, pValueMatrix.getEntry(1, 0), 0.0);
        assertEquals(0.0, pValueMatrix.getEntry(0, 2), 0.0);
        assertEquals(0.0, pValueMatrix.getEntry(2, 0), 0.0);
        assertEquals(0.0, pValueMatrix.getEntry(1, 2), 0.0);
        assertEquals(0.0, pValueMatrix.getEntry(2, 1), 0.0);
    }

    @Test
    public void testCorrelationWithDifferentValues() {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 3, 4, 5, 6}; // y = x + 1
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        assertEquals(1.0, pearsons.correlation(x, y), 1e-15);
    }

    @Test
    public void testCorrelationWithDifferentValues2() {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {10, 8, 6, 4, 2}; // y = -2x + 12
        PearsonsCorrelation pearsons = new PearsonsCorrelation();
        assertEquals(-1.0, pearsons.correlation(x, y), 1e-15);
    }

    @Test
    public void testPearsonsCorrelationConstructorWithNullMatrix() {
        // The constructor PearsonsCorrelation(RealMatrix matrix) calls checkSufficientData which throws exception for null.
        try {
            new PearsonsCorrelation((RealMatrix) null);
            fail("IllegalArgumentException expected for null matrix.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testPearsonsCorrelationConstructorWithCovarianceNullMatrix() {
        // The constructor PearsonsCorrelation(Covariance covariance) checks for null covariance matrix.
        try {
            new PearsonsCorrelation((Covariance) null);
            fail("IllegalArgumentException expected for null covariance.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
}
