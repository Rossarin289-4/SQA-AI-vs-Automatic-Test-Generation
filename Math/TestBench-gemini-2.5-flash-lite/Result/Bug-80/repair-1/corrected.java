package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.util.MathUtils;

public class EigenDecompositionImplTest {

    private static final double EPSILON = 100 * MathUtils.EPSILON;

    @Test
    public void testSymmetricMatrixConstructor() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        assertNotNull(eigenDecomposition);
    }

    @Test
    public void testNonSymmetricMatrixConstructor() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        try {
            new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
            fail("Expected InvalidMatrixException for non-symmetric matrix");
        } catch (InvalidMatrixException e) {
            // Expected
        }
    }

    @Test
    public void testTridiagonalConstructor() throws Exception {
        double[] main = { 1.0, 2.0, 3.0 };
        double[] secondary = { 0.5, 0.7 };
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        assertNotNull(eigenDecomposition);
    }

    @Test
    public void testGetV() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        RealMatrix v = eigenDecomposition.getV();
        assertNotNull(v);
        assertEquals(2, v.getRowDimension());
        assertEquals(2, v.getColumnDimension());
    }

    @Test
    public void testGetD() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        RealMatrix d = eigenDecomposition.getD();
        assertNotNull(d);
        assertEquals(2, d.getRowDimension());
        assertEquals(2, d.getColumnDimension());
        // isDiagonal() is not a public method in RealMatrix interface.
        // We can check by iterating through the diagonal elements.
        assertTrue(d.getEntry(0, 1) == 0.0);
        assertTrue(d.getEntry(1, 0) == 0.0);
    }

    @Test
    public void testGetVT() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        RealMatrix vt = eigenDecomposition.getVT();
        assertNotNull(vt);
        assertEquals(2, vt.getRowDimension());
        assertEquals(2, vt.getColumnDimension());
    }

    @Test
    public void testGetRealEigenvalues() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        assertNotNull(eigenvalues);
        assertEquals(2, eigenvalues.length);
    }

    @Test
    public void testGetRealEigenvalue() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        // The eigenvalues are sorted in descending order by default.
        double eigenvalue = eigenDecomposition.getRealEigenvalue(0);
        // For { { 1.0, 2.0 }, { 2.0, 3.0 } }, eigenvalues are approx 4.236 and -0.236
        assertTrue(eigenvalue > 0); // Placeholder, actual value depends on computation
    }

    @Test
    public void testGetImagEigenvalues() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getImagEigenvalues();
        assertNotNull(eigenvalues);
        assertEquals(2, eigenvalues.length);
        // For symmetric matrices, imaginary parts should be zero.
        assertEquals(0.0, eigenvalues[0], EPSILON);
        assertEquals(0.0, eigenvalues[1], EPSILON);
    }

    @Test
    public void testGetImagEigenvalue() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double eigenvalue = eigenDecomposition.getImagEigenvalue(0);
        assertEquals(0.0, eigenvalue, EPSILON);
    }

    @Test
    public void testGetEigenvector() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        RealVector eigenvector = eigenDecomposition.getEigenvector(0);
        assertNotNull(eigenvector);
        assertEquals(2, eigenvector.getDimension());
    }

    @Test
    public void testGetDeterminant() throws Exception {
        double[][] matrix = { { 1.0, 0.0 }, { 0.0, 2.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double determinant = eigenDecomposition.getDeterminant();
        assertEquals(2.0, determinant, EPSILON);
    }

    @Test
    public void testGetSolver() throws Exception {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        DecompositionSolver solver = eigenDecomposition.getSolver();
        assertNotNull(solver);
    }

    @Test
    public void testSolveWithVector() throws Exception {
        double[][] matrix = { { 1.0, 0.0 }, { 0.0, 2.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] b = { 2.0, 4.0 };
        double[] x = eigenDecomposition.getSolver().solve(b);
        assertNotNull(x);
        assertEquals(2.0, x[0], EPSILON);
        assertEquals(2.0, x[1], EPSILON);
    }

    @Test
    public void testSolveWithRealVector() throws Exception {
        double[][] matrix = { { 1.0, 0.0 }, { 0.0, 2.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        RealVector b = new ArrayRealVector(new double[] { 2.0, 4.0 });
        RealVector x = eigenDecomposition.getSolver().solve(b);
        assertNotNull(x);
        assertEquals(2.0, x.getEntry(0), EPSILON);
        assertEquals(2.0, x.getEntry(1), EPSILON);
    }

    @Test
    public void testSolveWithMatrix() throws Exception {
        double[][] matrix = { { 1.0, 0.0 }, { 0.0, 2.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[][] bData = { { 2.0, 6.0 }, { 4.0, 8.0 } };
        RealMatrix b = MatrixUtils.createRealMatrix(bData);
        RealMatrix x = eigenDecomposition.getSolver().solve(b);
        assertNotNull(x);
        assertEquals(2.0, x.getEntry(0, 0), EPSILON);
        assertEquals(3.0, x.getEntry(0, 1), EPSILON);
        assertEquals(2.0, x.getEntry(1, 0), EPSILON);
        assertEquals(4.0, x.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testIsNonSingular() throws Exception {
        double[][] matrix = { { 1.0, 0.0 }, { 0.0, 2.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        assertTrue(eigenDecomposition.getSolver().isNonSingular());
    }

    @Test
    public void testIsSingular() throws Exception {
        double[][] matrix = { { 1.0, 0.0 }, { 0.0, 0.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        assertFalse(eigenDecomposition.getSolver().isNonSingular());
    }

    @Test
    public void testGetInverse() throws Exception {
        double[][] matrix = { { 1.0, 0.0 }, { 0.0, 2.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        RealMatrix inverse = eigenDecomposition.getSolver().getInverse();
        assertNotNull(inverse);
        assertEquals(1.0, inverse.getEntry(0, 0), EPSILON);
        assertEquals(0.0, inverse.getEntry(0, 1), EPSILON);
        assertEquals(0.0, inverse.getEntry(1, 0), EPSILON);
        assertEquals(0.5, inverse.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testGetInverseSingular() throws Exception {
        double[][] matrix = { { 1.0, 0.0 }, { 0.0, 0.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        try {
            eigenDecomposition.getSolver().getInverse();
            fail("Expected SingularMatrixException");
        } catch (SingularMatrixException e) {
            // Expected
        }
    }

    @Test
    public void testLargeMatrixDeterminant() {
        double[][] matrix = {
            { 1.0, 2.0, 3.0, 4.0 },
            { 2.0, 5.0, 8.0, 11.0 },
            { 3.0, 8.0, 13.0, 18.0 },
            { 4.0, 11.0, 18.0, 23.0 }
        };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        // The determinant of this matrix is -11.
        assertEquals(-11.0, eigenDecomposition.getDeterminant(), EPSILON);
    }

    @Test
    public void testTridiagonalSolver() {
        double[] main = { 1.0, 2.0, 3.0 };
        double[] secondary = { 0.5, 0.7 };
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        double[] b = { 1.0, 1.0, 1.0 };
        double[] x = eigenDecomposition.getSolver().solve(b);
        assertNotNull(x);
    }

    @Test
    public void testSymmetricMatrixSolver() {
        double[][] matrix = {
            { 25, 15, -5, -15 },
            { 15, 25, -15, 15 },
            { -5, -15, 25, 15 },
            { -15, 15, 15, 25 }
        };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] b = { 1, 2, 3, 4 };
        double[] x = eigenDecomposition.getSolver().solve(b);
        assertNotNull(x);
    }

    @Test
    public void testIdentityMatrixEigenDecomposition() {
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(3);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(identity, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        assertEquals(1.0, eigenvalues[0], EPSILON);
        assertEquals(1.0, eigenvalues[1], EPSILON);
        assertEquals(1.0, eigenvalues[2], EPSILON);
        RealMatrix v = eigenDecomposition.getV();
        // For identity matrix, V should also be identity.
        // Check if V * V^T is identity.
        RealMatrix vt = eigenDecomposition.getVT();
        RealMatrix product = v.multiply(vt);
        assertEquals(identity.getEntry(0, 0), product.getEntry(0, 0), EPSILON);
        assertEquals(identity.getEntry(1, 1), product.getEntry(1, 1), EPSILON);
        assertEquals(identity.getEntry(2, 2), product.getEntry(2, 2), EPSILON);
    }

    @Test
    public void testZeroMatrixEigenDecomposition() {
        RealMatrix zeroMatrix = MatrixUtils.createRealMatrix(3, 3);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(zeroMatrix, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        assertEquals(0.0, eigenvalues[0], EPSILON);
        assertEquals(0.0, eigenvalues[1], EPSILON);
        assertEquals(0.0, eigenvalues[2], EPSILON);
        // Eigenvectors for zero matrix can be any orthogonal set.
        // We can check if V is orthogonal.
        RealMatrix v = eigenDecomposition.getV();
        RealMatrix vt = eigenDecomposition.getVT();
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix product = v.multiply(vt);
        assertEquals(identity.getEntry(0, 0), product.getEntry(0, 0), EPSILON);
        assertEquals(identity.getEntry(1, 1), product.getEntry(1, 1), EPSILON);
        assertEquals(identity.getEntry(2, 2), product.getEntry(2, 2), EPSILON);
    }

    @Test
    public void testEigenvectorNormalization() {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        for (int i = 0; i < 2; i++) {
            RealVector eigenvector = eigenDecomposition.getEigenvector(i);
            assertEquals(1.0, eigenvector.getNorm(), EPSILON);
        }
    }

    @Test
    public void testEigenDecompositionAccuracy() {
        double[][] matrix = { { 4.0, 1.0 }, { 1.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);

        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues); // Ensure consistent order for testing

        double lambda1 = (7.0 - Math.sqrt(5.0)) / 2.0;
        double lambda2 = (7.0 + Math.sqrt(5.0)) / 2.0;

        assertEquals(lambda1, eigenvalues[0], EPSILON);
        assertEquals(lambda2, eigenvalues[1], EPSILON);

        RealMatrix v = eigenDecomposition.getV();
        RealMatrix d = eigenDecomposition.getD();
        RealMatrix vt = eigenDecomposition.getVT();

        // Check A = V D V^T
        RealMatrix calculatedA = v.multiply(d).multiply(vt);
        // Custom assertion for RealMatrix equality within a tolerance.
        assertMatrixEquals(m, calculatedA, EPSILON);
    }

    @Test
    public void testEigenvectorProperty() {
        double[][] matrix = { { 1.0, 2.0 }, { 2.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);

        for (int i = 0; i < 2; i++) {
            RealVector eigenvector = eigenDecomposition.getEigenvector(i);
            double eigenvalue = eigenDecomposition.getRealEigenvalue(i);
            // Check Av = lambda*v
            RealVector av = m.operate(eigenvector);
            RealVector lambdaV = eigenvector.mapMultiply(eigenvalue);
            assertVectorEquals(av, lambdaV, EPSILON);
        }
    }

    @Test
    public void testDiagonalMatrix() {
        double[][] matrix = { { 1.0, 0.0, 0.0 }, { 0.0, 2.0, 0.0 }, { 0.0, 0.0, 3.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues); // Ensure consistent order for testing
        assertEquals(1.0, eigenvalues[0], EPSILON);
        assertEquals(2.0, eigenvalues[1], EPSILON);
        assertEquals(3.0, eigenvalues[2], EPSILON);

        RealMatrix v = eigenDecomposition.getV();
        RealMatrix vt = eigenDecomposition.getVT();
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix product = v.multiply(vt);
        assertMatrixEquals(identity, product, EPSILON);
    }

    @Test
    public void testLargeSplitTolerance() {
        double[][] matrix = { { 1.0, 1000.0 }, { 1000.0, 2.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, 1000.0);
        assertNotNull(eigenDecomposition);
    }

    @Test
    public void testSmallSplitTolerance() {
        double[][] matrix = { { 1.0, 1e-9 }, { 1e-9, 2.0 } };
        RealMatrix m = MatrixUtils.createRealMatrix(matrix);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(m, 1e-12);
        assertNotNull(eigenDecomposition);
    }

    /**
     * Custom assertion for comparing two RealMatrices with a tolerance.
     */
    private void assertMatrixEquals(RealMatrix m1, RealMatrix m2, double epsilon) {
        assertEquals(m1.getRowDimension(), m2.getRowDimension());
        assertEquals(m1.getColumnDimension(), m2.getColumnDimension());
        for (int i = 0; i < m1.getRowDimension(); i++) {
            for (int j = 0; j < m1.getColumnDimension(); j++) {
                assertEquals(m1.getEntry(i, j), m2.getEntry(i, j), epsilon);
            }
        }
    }

    /**
     * Custom assertion for comparing two RealVectors with a tolerance.
     */
    private void assertVectorEquals(RealVector v1, RealVector v2, double epsilon) {
        assertEquals(v1.getDimension(), v2.getDimension());
        for (int i = 0; i < v1.getDimension(); i++) {
            assertEquals(v1.getEntry(i), v2.getEntry(i), epsilon);
        }
    }
}
