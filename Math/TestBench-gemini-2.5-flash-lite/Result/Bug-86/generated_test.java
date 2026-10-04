package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.MathRuntimeException;

public class CholeskyDecompositionImplTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorWithDefaultThresholds() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        assertNotNull(decomposition);
    }

    @Test
    public void testConstructorWithCustomThresholds() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix, 1.0e-10, 1.0e-5);
        assertNotNull(decomposition);
    }

    @Test
    public void testGetL() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        RealMatrix l = decomposition.getL();
        assertNotNull(l);
        assertEquals(3, l.getRowDimension());
        assertEquals(3, l.getColumnDimension());
    }

    @Test
    public void testGetLT() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        RealMatrix lt = decomposition.getLT();
        assertNotNull(lt);
        assertEquals(3, lt.getRowDimension());
        assertEquals(3, lt.getColumnDimension());
    }

    @Test
    public void testGetDeterminant() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        // Determinant of original matrix = 25*(18*11 - 0*0) - 15*(15*11 - 0*(-5)) + (-5)*(15*0 - 18*(-5))
        // = 25*198 - 15*165 - 5*(90)
        // = 4950 - 2475 - 450 = 2025
        assertEquals(2025.0, decomposition.getDeterminant(), 1.0e-9);
    }

    @Test
    public void testGetSolver() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        assertNotNull(solver);
        assertTrue(solver.isNonSingular());
    }

    @Test
    public void testSolveDoubleArray() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        double[] b = { 1, 2, 3 };
        double[] x = solver.solve(b);
        assertNotNull(x);
        assertEquals(3, x.length);
        // Expected values calculated by solving A*x = b
        // A = [[25, 15, -5], [15, 18, 0], [-5, 0, 11]]
        // L = [[5, 3, -1], [3, 3, 0], [-1, 0, 3]] (derived from A = L*L^T)
        // L^T = [[5, 3, -1], [3, 3, 0], [-1, 0, 3]]
        // Solve Ly = b:
        // 5*y[0] = 1 => y[0] = 0.2
        // 3*y[0] + 3*y[1] = 2 => 3*0.2 + 3*y[1] = 2 => 0.6 + 3*y[1] = 2 => 3*y[1] = 1.4 => y[1] = 1.4/3 = 0.4666666667
        // -1*y[0] + 0*y[1] + 3*y[2] = 3 => -1*0.2 + 3*y[2] = 3 => -0.2 + 3*y[2] = 3 => 3*y[2] = 3.2 => y[2] = 3.2/3 = 1.0666666667
        // Solve L^T x = y:
        // 3*x[2] = y[2] => 3*x[2] = 1.0666666667 => x[2] = 0.3555555556
        // 3*x[1] + 0*x[2] = y[1] => 3*x[1] = 0.4666666667 => x[1] = 0.1555555556
        // 5*x[0] + 3*x[1] - 1*x[2] = y[0] => 5*x[0] + 3*0.1555555556 - 1*0.3555555556 = 0.2
        // 5*x[0] + 0.4666666667 - 0.3555555556 = 0.2
        // 5*x[0] + 0.1111111111 = 0.2
        // 5*x[0] = 0.0888888889
        // x[0] = 0.01777777778
        assertEquals(0.01777777778, x[0], 1.0e-9);
        assertEquals(0.1555555556, x[1], 1.0e-9);
        assertEquals(0.3555555556, x[2], 1.0e-9);
    }

    @Test
    public void testSolveRealVector() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        RealVector b = new RealVectorImpl(new double[]{ 1, 2, 3 });
        RealVector x = solver.solve(b);
        assertNotNull(x);
        assertEquals(3, x.getDimension());
        assertEquals(0.01777777778, x.getEntry(0), 1.0e-9);
        assertEquals(0.1555555556, x.getEntry(1), 1.0e-9);
        assertEquals(0.3555555556, x.getEntry(2), 1.0e-9);
    }

    @Test
    public void testSolveRealMatrix() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        double[][] bData = { { 1, 4 }, { 2, 5 }, { 3, 6 } };
        RealMatrix b = MatrixUtils.createRealMatrix(bData);
        RealMatrix x = solver.solve(b);
        assertNotNull(x);
        assertEquals(3, x.getRowDimension());
        assertEquals(2, x.getColumnDimension());
        // Expected values are solutions to A*X = B, column by column
        // First column: same as testSolveDoubleArray
        assertEquals(0.01777777778, x.getEntry(0, 0), 1.0e-9);
        assertEquals(0.1555555556, x.getEntry(1, 0), 1.0e-9);
        assertEquals(0.3555555556, x.getEntry(2, 0), 1.0e-9);
        // Second column: solved for b = [4, 5, 6]
        // Solve Ly = b:
        // 5*y[0] = 4 => y[0] = 0.8
        // 3*y[0] + 3*y[1] = 5 => 3*0.8 + 3*y[1] = 5 => 2.4 + 3*y[1] = 5 => 3*y[1] = 2.6 => y[1] = 2.6/3 = 0.8666666667
        // -1*y[0] + 0*y[1] + 3*y[2] = 6 => -1*0.8 + 3*y[2] = 6 => -0.8 + 3*y[2] = 6 => 3*y[2] = 6.8 => y[2] = 6.8/3 = 2.2666666667
        // Solve L^T x = y:
        // 3*x[2] = y[2] => 3*x[2] = 2.2666666667 => x[2] = 0.7555555556
        // 3*x[1] + 0*x[2] = y[1] => 3*x[1] = 0.8666666667 => x[1] = 0.2888888889
        // 5*x[0] + 3*x[1] - 1*x[2] = y[0] => 5*x[0] + 3*0.2888888889 - 1*0.7555555556 = 0.8
        // 5*x[0] + 0.8666666667 - 0.7555555556 = 0.8
        // 5*x[0] + 0.1111111111 = 0.8
        // 5*x[0] = 0.6888888889
        // x[0] = 0.1377777778
        assertEquals(0.1377777778, x.getEntry(0, 1), 1.0e-9);
        assertEquals(0.2888888889, x.getEntry(1, 1), 1.0e-9);
        assertEquals(0.7555555556, x.getEntry(2, 1), 1.0e-9);
    }

    @Test
    public void testGetInverse() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        // The getInverse() method is not declared in the public API of CholeskyDecompositionImpl.
        // It is declared in the DecompositionSolver interface, which is returned by getSolver().
        // Therefore, to test getInverse, we must obtain it through the solver.
        DecompositionSolver solver = decomposition.getSolver();
        RealMatrix inverse = solver.getInverse(); // Correct way to access getInverse()
        assertNotNull(inverse);
        assertEquals(3, inverse.getRowDimension());
        assertEquals(3, inverse.getColumnDimension());
        // Verify that matrix * inverse = Identity matrix
        RealMatrix identityCheck = matrix.multiply(inverse);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    assertEquals(1.0, identityCheck.getEntry(i, j), 1.0e-9);
                } else {
                    assertEquals(0.0, identityCheck.getEntry(i, j), 1.0e-9);
                }
            }
        }
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testConstructorNonSquareMatrix() throws Exception {
        final double[][] data = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test(expected = NotSymmetricMatrixException.class)
    public void testConstructorNotSymmetricMatrix() throws Exception {
        final double[][] data = { { 1, 2 }, { 3, 4 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testConstructorNotPositiveDefiniteMatrix() throws Exception {
        final double[][] data = { { 1, 2 }, { 2, 1 } }; // Symmetric but not positive definite
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testConstructorZeroDiagonal() throws Exception {
        final double[][] data = { { 0, 1 }, { 1, 1 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        new CholeskyDecompositionImpl(matrix);
    }

    @Test
    public void testSolverIsNonSingular() throws Exception {
        final double[][] data = { { 4, 1 }, { 1, 4 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        assertTrue(solver.isNonSingular());
    }

    @Test
    public void testSolveDoubleArrayVectorLengthMismatch() throws Exception {
        final double[][] data = { { 4, 1 }, { 1, 4 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        double[] b = {1.0, 2.0, 3.0}; // Mismatched length
        try {
            solver.solve(b);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("vector length mismatch"));
        }
    }

    @Test
    public void testSolveRealVectorVectorDimensionMismatch() throws Exception {
        final double[][] data = { { 4, 1 }, { 1, 4 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        RealVector b = new RealVectorImpl(new double[]{1.0, 2.0, 3.0}); // Mismatched dimension
        try {
            solver.solve(b);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("vector length mismatch"));
        }
    }

    @Test
    public void testSolveRealMatrixRowDimensionMismatch() throws Exception {
        final double[][] data = { { 4, 1 }, { 1, 4 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        double[][] bData = { {1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0} };
        RealMatrix b = MatrixUtils.createRealMatrix(bData); // Mismatched row dimension
        try {
            solver.solve(b);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("dimensions mismatch"));
        }
    }

    @Test
    public void testGetLAndGetLTConsistency() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        RealMatrix l = decomposition.getL();
        RealMatrix lt = decomposition.getLT();
        assertTrue(l.subtract(lt.transpose()).getNorm() < 1.0e-9);
    }

    @Test
    public void testDeterminantSmallMatrix() throws Exception {
        final double[][] data = { { 4, 2 }, { 2, 4 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        assertEquals(12.0, decomposition.getDeterminant(), 1.0e-9); // 4*4 - 2*2 = 16 - 4 = 12
    }

    @Test
    public void testGetInverseIdentityMatrix() throws Exception {
        final double[][] data = { { 1, 0 }, { 0, 1 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        RealMatrix inverse = solver.getInverse();
        assertEquals(1.0, inverse.getEntry(0, 0), 1.0e-9);
        assertEquals(0.0, inverse.getEntry(0, 1), 1.0e-9);
        assertEquals(0.0, inverse.getEntry(1, 0), 1.0e-9);
        assertEquals(1.0, inverse.getEntry(1, 1), 1.0e-9);
    }

    @Test
    public void testSolveWithIdentityMatrix() throws Exception {
        final double[][] data = { { 1, 0 }, { 0, 1 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        double[] b = { 5, 7 };
        double[] x = solver.solve(b);
        assertEquals(5.0, x[0], 1.0e-9);
        assertEquals(7.0, x[1], 1.0e-9);
    }

    @Test
    public void testSolverOnDiagonalMatrix() throws Exception {
        final double[][] data = { { 4, 0, 0 }, { 0, 9, 0 }, { 0, 0, 16 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        double[] b = { 8, 27, 48 };
        double[] x = solver.solve(b);
        assertEquals(2.0, x[0], 1.0e-9);
        assertEquals(3.0, x[1], 1.0e-9);
        assertEquals(3.0, x[2], 1.0e-9);
    }

    @Test
    public void testGetDeterminantDiagonalMatrix() throws Exception {
        final double[][] data = { { 4, 0, 0 }, { 0, 9, 0 }, { 0, 0, 16 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        assertEquals(576.0, decomposition.getDeterminant(), 1.0e-9); // 4 * 9 * 16 = 576
    }

    @Test
    public void testGetInverseDiagonalMatrix() throws Exception {
        final double[][] data = { { 4, 0, 0 }, { 0, 9, 0 }, { 0, 0, 16 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        RealMatrix inverse = solver.getInverse();
        assertEquals(0.25, inverse.getEntry(0, 0), 1.0e-9); // 1/4
        assertEquals(1.0/9.0, inverse.getEntry(1, 1), 1.0e-9); // 1/9
        assertEquals(0.0625, inverse.getEntry(2, 2), 1.0e-9); // 1/16
    }

    @Test
    public void testConstructorWithSmallPositiveDiagonal() throws Exception {
        final double[][] data = { { 1e-11, 0 }, { 0, 1e-11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        // Default absolute positivity threshold is 1.0e-10. These values are below it.
        // Test with custom threshold that allows these values.
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix, 1.0e-15, 1.0e-12);
        assertNotNull(decomposition);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testConstructorWithSmallPositiveDiagonalDefaultThreshold() throws Exception {
        final double[][] data = { { 1e-11, 0 }, { 0, 1e-11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        // Default threshold is 1.0e-10, so this should throw an exception
        new CholeskyDecompositionImpl(matrix);
    }

    @Test
    public void testGetLAndGetLTWithCustomThresholds() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix, 1.0e-10, 1.0e-5);
        RealMatrix l = decomposition.getL();
        RealMatrix lt = decomposition.getLT();
        assertNotNull(l);
        assertNotNull(lt);
        assertTrue(l.subtract(lt.transpose()).getNorm() < 1.0e-9);
    }

    @Test
    public void testGetDeterminantWithCustomThresholds() throws Exception {
        final double[][] data = { { 25, 15, -5 }, { 15, 18, 0 }, { -5, 0, 11 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix, 1.0e-10, 1.0e-5);
        assertEquals(2025.0, decomposition.getDeterminant(), 1.0e-9);
    }

    @Test
    public void testSolveWithLargeValues() throws Exception {
        final double[][] data = { { 1.0e10, 1.0e5 }, { 1.0e5, 1.0e4 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        double[] b = { 1.0e10, 1.0e5 };
        double[] x = solver.solve(b);
        // A = [[1e10, 1e5], [1e5, 1e4]]
        // L = [[1e5, 1e5/1e5], [1e5/1e5, sqrt(1e4 - (1e5/1e5)^2)]] = [[1e5, 1], [1, sqrt(1e4-1)]]
        // L = [[100000, 1], [1, 99.995]]
        // Solve Ly = b
        // y[0] = 1e10 / 1e5 = 100000
        // y[1] = (1e5 - y[0]*1) / 99.995 = (100000 - 100000) / 99.995 = 0
        // Solve LTx = y
        // x[1] = y[1] / 99.995 = 0 / 99.995 = 0
        // x[0] = (y[0] - x[1]*1) / 100000 = (100000 - 0*1) / 100000 = 1
        assertEquals(1.0, x[0], 1.0e-9);
        assertEquals(0.0, x[1], 1.0e-9);
    }

    @Test
    public void testGetInverseWithLargeValues() throws Exception {
        final double[][] data = { { 1.0e10, 1.0e5 }, { 1.0e5, 1.0e4 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        RealMatrix inverse = solver.getInverse();
        // Expected inverse of [[a, b], [b, c]] is 1/(ac-b^2) * [[c, -b], [-b, a]]
        // Determinant = 1e10 * 1e4 - (1e5)^2 = 1e14 - 1e10 = 1e10 * (1e4 - 1) = 1e10 * 9999
        // Inverse = 1/(9999e10) * [[1e4, -1e5], [-1e5, 1e10]]
        double det = 9999.0e10;
        assertEquals(1e4 / det, inverse.getEntry(0, 0), 1.0e-15);
        assertEquals(-1e5 / det, inverse.getEntry(0, 1), 1.0e-15);
        assertEquals(-1e5 / det, inverse.getEntry(1, 0), 1.0e-15);
        assertEquals(1e10 / det, inverse.getEntry(1, 1), 1.0e-15);
    }

    @Test
    public void testGetDeterminantWithLargeValues() throws Exception {
        final double[][] data = { { 1.0e10, 1.0e5 }, { 1.0e5, 1.0e4 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(matrix);
        assertEquals(9999.0e10, decomposition.getDeterminant(), 1.0e-5); // 1e14 - 1e10
    }
}
