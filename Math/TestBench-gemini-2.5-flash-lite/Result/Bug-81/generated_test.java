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

    @Test
    public void testConstructorWithSymmetricMatrix() throws Exception {
        // 3x3 symmetric matrix
        double[][] data = { { 1.0, 2.0, 3.0 }, { 2.0, 4.0, 5.0 }, { 3.0, 5.0, 6.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        assertNotNull(eigenDecomposition);
    }

    @Test
    public void testConstructorWithTridiagonalMatrix() throws Exception {
        // Simple tridiagonal matrix
        double[] main = { 1.0, 2.0, 3.0 };
        double[] secondary = { 0.5, 0.5 };
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        assertNotNull(eigenDecomposition);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testConstructorWithNonSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 }, { 7.0, 8.0, 9.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
    }

    @Test
    public void testGetVForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        RealMatrix v = eigenDecomposition.getV();
        assertNotNull(v);
        assertEquals(2, v.getRowDimension());
        assertEquals(2, v.getColumnDimension());
    }

    @Test
    public void testGetDForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        RealMatrix d = eigenDecomposition.getD();
        assertNotNull(d);
        assertEquals(2, d.getRowDimension());
        assertEquals(2, d.getColumnDimension());
        // The isDiagonal() method is not available in the RealMatrix interface in the provided API outline.
        // We'll check manually if it's a diagonal matrix.
        assertTrue(d.getEntry(0, 1) == 0.0);
        assertTrue(d.getEntry(1, 0) == 0.0);
    }

    @Test
    public void testGetVTForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        RealMatrix vt = eigenDecomposition.getVT();
        assertNotNull(vt);
        assertEquals(2, vt.getRowDimension());
        assertEquals(2, vt.getColumnDimension());
    }

    @Test
    public void testGetRealEigenvaluesForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        assertNotNull(eigenvalues);
        assertEquals(2, eigenvalues.length);
    }

    @Test
    public void testGetRealEigenvalueForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double eigenvalue = eigenDecomposition.getRealEigenvalue(0);
        // Expected value computed manually for a 2x2 matrix with eigenvalues 3 and -1
        // The implementation sorts them in descending order.
        assertEquals(3.0, eigenvalue, 1e-9);
    }

    @Test
    public void testGetImagEigenvaluesForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getImagEigenvalues();
        assertNotNull(eigenvalues);
        assertEquals(2, eigenvalues.length);
        // For symmetric matrices, imaginary eigenvalues should be zero
        assertEquals(0.0, eigenvalues[0], 1e-9);
        assertEquals(0.0, eigenvalues[1], 1e-9);
    }

    @Test
    public void testGetImagEigenvalueForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double eigenvalue = eigenDecomposition.getImagEigenvalue(0);
        assertEquals(0.0, eigenvalue, 1e-9);
    }

    @Test
    public void testGetEigenvectorForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        RealVector eigenvector = eigenDecomposition.getEigenvector(0);
        assertNotNull(eigenvector);
        assertEquals(2, eigenvector.getDimension());
    }

    @Test
    public void testGetDeterminantForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        // For A = [[1, 2], [2, 1]], determinant is 1*1 - 2*2 = -3
        assertEquals(-3.0, eigenDecomposition.getDeterminant(), 1e-9);
    }

    @Test
    public void testGetSolverForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = eigenDecomposition.getSolver();
        assertNotNull(solver);
    }

    @Test
    public void testSolverSolve1DArrayForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } }; // Eigenvalues: 3, -1
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = eigenDecomposition.getSolver();
        double[] b = { 1.0, 1.0 };
        double[] x = solver.solve(b);
        // A * x = b => x = A^-1 * b
        // A^-1 = 1/(-3) * [[1, -2], [-2, 1]] = [[-1/3, 2/3], [2/3, -1/3]]
        // x = [[-1/3, 2/3], [2/3, -1/3]] * [1, 1] = [-1/3 + 2/3, 2/3 - 1/3] = [1/3, 1/3]
        assertNotNull(x);
        assertEquals(1.0 / 3.0, x[0], 1e-9);
        assertEquals(1.0 / 3.0, x[1], 1e-9);
    }

    @Test
    public void testSolverSolve1DArrayForSingularMatrix() throws Exception {
        double[][] data = { { 1.0, 0.0 }, { 0.0, 0.0 } }; // Eigenvalue: 0
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = eigenDecomposition.getSolver();
        assertTrue(!solver.isNonSingular());
        try {
            solver.solve(new double[]{1.0, 1.0});
            fail("SingularMatrixException should have been thrown.");
        } catch (SingularMatrixException e) {
            // Expected
        }
    }

    @Test
    public void testSolverSolveRealVectorForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } }; // Eigenvalues: 3, -1
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = eigenDecomposition.getSolver();
        RealVector b = new ArrayRealVector(new double[]{1.0, 1.0});
        RealVector x = solver.solve(b);
        assertNotNull(x);
        assertEquals(1.0 / 3.0, x.getEntry(0), 1e-9);
        assertEquals(1.0 / 3.0, x.getEntry(1), 1e-9);
    }

    @Test
    public void testSolverSolveRealMatrixForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } }; // Eigenvalues: 3, -1
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = eigenDecomposition.getSolver();
        double[][] bData = { {1.0}, {1.0} };
        RealMatrix b = MatrixUtils.createRealMatrix(bData);
        RealMatrix x = solver.solve(b);
        assertNotNull(x);
        assertEquals(1.0 / 3.0, x.getEntry(0, 0), 1e-9);
        assertEquals(1.0 / 3.0, x.getEntry(1, 0), 1e-9);
    }

    @Test
    public void testSolverIsNonSingularForNonSingularMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } }; // Eigenvalues: 3, -1
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = eigenDecomposition.getSolver();
        assertTrue(solver.isNonSingular());
    }

    @Test
    public void testSolverGetInverseForSymmetricMatrix() throws Exception {
        double[][] data = { { 1.0, 2.0 }, { 2.0, 1.0 } }; // Eigenvalues: 3, -1
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = eigenDecomposition.getSolver();
        RealMatrix inverse = solver.getInverse();
        assertNotNull(inverse);
        // Expected inverse: [[-1/3, 2/3], [2/3, -1/3]]
        assertEquals(-1.0 / 3.0, inverse.getEntry(0, 0), 1e-9);
        assertEquals(2.0 / 3.0, inverse.getEntry(0, 1), 1e-9);
        assertEquals(2.0 / 3.0, inverse.getEntry(1, 0), 1e-9);
        assertEquals(-1.0 / 3.0, inverse.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testSolverGetInverseForSingularMatrix() throws Exception {
        double[][] data = { { 1.0, 0.0 }, { 0.0, 0.0 } }; // Eigenvalue: 0
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        DecompositionSolver solver = eigenDecomposition.getSolver();
        assertTrue(!solver.isNonSingular());
        try {
            solver.getInverse();
            fail("SingularMatrixException should have been thrown.");
        } catch (SingularMatrixException e) {
            // Expected
        }
    }

    @Test
    public void testEigenDecompositionWithSingleElementMatrix() throws Exception {
        double[][] data = { { 5.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        assertEquals(5.0, eigenDecomposition.getRealEigenvalue(0), 1e-9);
        assertEquals(1, eigenDecomposition.getRealEigenvalues().length);
    }

    @Test
    public void testEigenDecompositionWithTwoByTwoMatrix() throws Exception {
        double[][] data = { { 2.0, 1.0 }, { 1.0, 2.0 } }; // Eigenvalues: 3, 1
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues); // Sort to compare consistently
        assertEquals(1.0, eigenvalues[0], 1e-9);
        assertEquals(3.0, eigenvalues[1], 1e-9);
    }

    @Test
    public void testEigenDecompositionWithThreeByThreeMatrix() throws Exception {
        double[][] data = { { 2.0, 1.0, 0.0 }, { 1.0, 2.0, 1.0 }, { 0.0, 1.0, 2.0 } }; // Eigenvalues: approx 3.414, 2.0, 0.586
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues); // Sort to compare consistently
        assertEquals(2.0 - Math.sqrt(2.0), eigenvalues[0], 1e-9);
        assertEquals(2.0, eigenvalues[1], 1e-9);
        assertEquals(2.0 + Math.sqrt(2.0), eigenvalues[2], 1e-9);
    }

    @Test
    public void testGetDeterminantForIdentityMatrix() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealIdentityMatrix(3);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        assertEquals(1.0, eigenDecomposition.getDeterminant(), 1e-9);
    }

    @Test
    public void testGetDeterminantForZeroMatrix() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        assertEquals(0.0, eigenDecomposition.getDeterminant(), 1e-9);
    }

    @Test
    public void testEigenDecompositionWithLargeValues() throws Exception {
        double[][] data = { { 1e10, 1e5 }, { 1e5, 1e10 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        // Eigenvalues are approximately 1e10 + 1e5 and 1e10 - 1e5
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues);
        assertEquals(1e10 - 1e5, eigenvalues[0], 1e10 * 1e-9); // Use relative tolerance for large numbers
        assertEquals(1e10 + 1e5, eigenvalues[1], 1e10 * 1e-9);
    }

    @Test
    public void testEigenDecompositionWithSmallValues() throws Exception {
        double[][] data = { { 1e-10, 1e-15 }, { 1e-15, 1e-10 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        // Eigenvalues are approximately 1e-10 + 1e-15 and 1e-10 - 1e-15
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues);
        assertEquals(1e-10 - 1e-15, eigenvalues[0], 1e-10 * 1e-9); // Use relative tolerance for small numbers
        assertEquals(1e-10 + 1e-15, eigenvalues[1], 1e-10 * 1e-9);
    }

    @Test
    public void testEigenDecompositionWithDiagonalMatrix() throws Exception {
        double[][] data = { { 1.0, 0.0, 0.0 }, { 0.0, 2.0, 0.0 }, { 0.0, 0.0, 3.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues);
        assertEquals(1.0, eigenvalues[0], 1e-9);
        assertEquals(2.0, eigenvalues[1], 1e-9);
        assertEquals(3.0, eigenvalues[2], 1e-9);
    }

    @Test
    public void testEigenDecompositionWithNegativeValues() throws Exception {
        double[][] data = { { -1.0, -2.0 }, { -2.0, -1.0 } }; // Eigenvalues: 1, -3
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues);
        assertEquals(-3.0, eigenvalues[0], 1e-9);
        assertEquals(1.0, eigenvalues[1], 1e-9);
    }

    @Test
    public void testEigenDecompositionWithZeroValues() throws Exception {
        double[][] data = { { 0.0, 0.0 }, { 0.0, 0.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        assertEquals(0.0, eigenvalues[0], 1e-9);
        assertEquals(0.0, eigenvalues[1], 1e-9);
    }

    @Test
    public void testEigenDecompositionWithOneRowBlock() throws Exception {
        double[] main = { 5.0 };
        double[] secondary = {};
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        assertEquals(5.0, eigenDecomposition.getRealEigenvalue(0), 1e-9);
    }

    @Test
    public void testEigenDecompositionWithTwoRowBlock() throws Exception {
        double[] main = { 2.0, 3.0 };
        double[] secondary = { 1.0 }; // Eigenvalues of [[2, 1], [1, 3]] are approx 3.618, 1.382
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues);
        // Characteristic polynomial: lambda^2 - (2+3)lambda + (2*3 - 1*1) = lambda^2 - 5lambda + 5 = 0
        // Roots: (5 +/- sqrt(25 - 20))/2 = (5 +/- sqrt(5))/2
        // (5 - sqrt(5))/2 approx 1.381966
        // (5 + sqrt(5))/2 approx 3.618034
        assertEquals((5.0 - Math.sqrt(5.0)) / 2.0, eigenvalues[0], 1e-9);
        assertEquals((5.0 + Math.sqrt(5.0)) / 2.0, eigenvalues[1], 1e-9);
    }

    @Test
    public void testEigenDecompositionWithThreeRowBlock() throws Exception {
        double[] main = { 1.0, 2.0, 3.0 };
        double[] secondary = { 0.5, 0.5 }; // Eigenvalues of [[1, 0.5, 0], [0.5, 2, 0.5], [0, 0.5, 3]]
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(main, secondary, MathUtils.SAFE_MIN);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        // Characteristic polynomial:
        // lambda^3 - (1+2+3)lambda^2 + (1*2 + 1*3 + 2*3 - 0.5^2 - 0.5^2)lambda + (3*0.5^2 + 1*0.5^2 - 1*2*3)
        // lambda^3 - 6lambda^2 + (2 + 3 + 6 - 0.25 - 0.25)lambda + (0.75 + 0.25 - 6) = 0
        // lambda^3 - 6lambda^2 + 10.5lambda - 5 = 0
        // Roots are approximately: 3.4452, 2.0000, 0.5548
        Arrays.sort(eigenvalues);
        assertEquals(0.554831417, eigenvalues[0], 1e-8);
        assertEquals(2.0, eigenvalues[1], 1e-9);
        assertEquals(3.445168583, eigenvalues[2], 1e-8);
    }

    @Test
    public void testEigenDecompositionWithSplitToleranceEdgeCase() {
        double[][] data = { { 1.0, 1e-9 }, { 1e-9, 1.0 } }; // Secondary diagonal very small
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        // Using a split tolerance that is smaller than the secondary diagonal value.
        // This should prevent premature splitting.
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, 1e-10);
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues);
        // Characteristic polynomial: lambda^2 - 2lambda + (1 - 1e-18) = 0
        // Roots: (2 +/- sqrt(4 - 4(1 - 1e-18)))/2 = (2 +/- sqrt(4e-18))/2 = (2 +/- 2e-9)/2 = 1 +/- 1e-9
        assertEquals(1.0 - 1e-9, eigenvalues[0], 1e-15);
        assertEquals(1.0 + 1e-9, eigenvalues[1], 1e-15);
    }

    @Test
    public void testEigenDecompositionWithSplitToleranceZero() {
        double[][] data = { { 1.0, 0.0 }, { 0.0, 2.0 } }; // Diagonal matrix
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        EigenDecompositionImpl eigenDecomposition = new EigenDecompositionImpl(matrix, 0.0); // Zero split tolerance
        double[] eigenvalues = eigenDecomposition.getRealEigenvalues();
        Arrays.sort(eigenvalues);
        assertEquals(1.0, eigenvalues[0], 1e-9);
        assertEquals(2.0, eigenvalues[1], 1e-9);
    }

}
