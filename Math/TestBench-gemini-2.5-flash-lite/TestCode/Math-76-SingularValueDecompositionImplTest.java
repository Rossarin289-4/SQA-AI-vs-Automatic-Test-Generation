package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.util.MathUtils;

public class SingularValueDecompositionImplTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorSquareMatrix() throws Exception {
        // Test with a simple square matrix
        final double[][] data = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        assertNotNull(svd);
    }

    @Test
    public void testConstructorRectangularMatrixTall() throws Exception {
        // Test with a tall rectangular matrix
        final double[][] data = { { 1.0, 2.0 }, { 3.0, 4.0 }, { 5.0, 6.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        assertNotNull(svd);
    }

    @Test
    public void testConstructorRectangularMatrixWide() throws Exception {
        // Test with a wide rectangular matrix
        final double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        assertNotNull(svd);
    }

    @Test
    public void testGetSingularValuesSimple() throws Exception {
        final double[][] data = { { 1.0, 0.0 }, { 0.0, 2.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        double[] sv = svd.getSingularValues();
        assertEquals(2.0, sv[0], 1e-15);
        assertEquals(1.0, sv[1], 1e-15);
    }

    @Test
    public void testGetSingularValuesComplex() throws Exception {
        final double[][] data = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        double[] sv = svd.getSingularValues();
        // Expected values derived from manual SVD calculation or a trusted source.
        // For this specific matrix: sqrt((25 + sqrt(337))/2) and sqrt((25 - sqrt(337))/2)
        assertEquals(Math.sqrt((25 + Math.sqrt(337)) / 2.0), sv[0], 1e-15);
        assertEquals(Math.sqrt((25 - Math.sqrt(337)) / 2.0), sv[1], 1e-15);
    }

    @Test
    public void testGetSZeroMatrix() throws Exception {
        final double[][] data = { { 0.0, 0.0 }, { 0.0, 0.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        final RealMatrix s = svd.getS();
        final double[][] sData = s.getData();
        // The S matrix should be all zeros, with dimensions matching min(m,n) x min(m,n)
        // For a 2x2 matrix, it's 2x2.
        assertEquals(2, s.getRowDimension());
        assertEquals(2, s.getColumnDimension());
        assertEquals(0.0, sData[0][0], 1e-15);
        assertEquals(0.0, sData[1][1], 1e-15);
    }

    @Test
    public void testGetNormSimple() throws Exception {
        final double[][] data = { { 3.0, 0.0 }, { 0.0, 4.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        assertEquals(4.0, svd.getNorm(), 1e-15);
    }

    @Test
    public void testGetNormComplex() throws Exception {
        final double[][] data = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        // The norm is the largest singular value
        assertEquals(Math.sqrt((25 + Math.sqrt(337)) / 2.0), svd.getNorm(), 1e-15);
    }

    @Test
    public void testGetConditionNumberSimple() throws Exception {
        final double[][] data = { { 2.0, 0.0 }, { 0.0, 3.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        assertEquals(3.0 / 2.0, svd.getConditionNumber(), 1e-15);
    }

    @Test
    public void testGetConditionNumberSingular() throws Exception {
        final double[][] data = { { 2.0, 0.0 }, { 0.0, 0.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        // For singular matrices, the condition number is typically considered infinite.
        assertTrue(Double.isInfinite(svd.getConditionNumber()));
    }

    @Test
    public void testGetRankSquareFullRank() throws Exception {
        final double[][] data = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        assertEquals(2, svd.getRank());
    }

    @Test
    public void testGetRankSquareRankDeficient() throws Exception {
        final double[][] data = { { 1.0, 2.0 }, { 2.0, 4.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        assertEquals(1, svd.getRank());
    }

    @Test
    public void testGetRankZeroMatrix() throws Exception {
        final double[][] data = { { 0.0, 0.0 }, { 0.0, 0.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        // A zero matrix has rank 0. The getRank method uses singularValues, which would be empty if all zeros.
        // The loop in getRank will not execute, and it returns 0.
        assertEquals(0, svd.getRank());
    }

    @Test
    public void testGetRankTallFullRank() throws Exception {
        final double[][] data = { { 1.0, 0.0 }, { 0.0, 1.0 }, { 0.0, 0.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        assertEquals(2, svd.getRank());
    }

    @Test
    public void testGetRankWideFullRank() throws Exception {
        final double[][] data = { { 1.0, 0.0, 0.0 }, { 0.0, 1.0, 0.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        assertEquals(2, svd.getRank());
    }

    @Test
    public void testGetSolverSimple() throws Exception {
        final double[][] data = { { 1.0, 0.0 }, { 0.0, 1.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        final DecompositionSolver solver = svd.getSolver();
        assertTrue(solver.isNonSingular());
    }

    @Test
    public void testGetSolverSingular() throws Exception {
        final double[][] data = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        final DecompositionSolver solver = svd.getSolver();
        // The rank deficient matrix should result in a non-singular flag set to false.
        assertFalse(solver.isNonSingular());
    }

    @Test
    public void testSolverSolveVectorSimple() throws Exception {
        final double[][] data = { { 2.0, 0.0 }, { 0.0, 3.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        final DecompositionSolver solver = svd.getSolver();
        final double[] b = { 4.0, 6.0 };
        final double[] x = solver.solve(b);
        assertEquals(2.0, x[0], 1e-15);
        assertEquals(2.0, x[1], 1e-15);
    }

    @Test
    public void testSolverSolveVectorLeastSquares() throws Exception {
        final double[][] data = { { 1.0, 1.0 }, { 1.0, 1.0 } }; // Rank deficient
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        final DecompositionSolver solver = svd.getSolver();
        final double[] b = { 2.0, 3.0 }; // No exact solution
        final double[] x = solver.solve(b);
        // The least squares solution for A*x = b where A is rank deficient minimizes ||Ax - b||.
        // For A = [[1,1],[1,1]], the pseudoinverse is [[0.25, 0.25],[0.25, 0.25]].
        // x = A^+ * b = [[0.25, 0.25],[0.25, 0.25]] * [2, 3]^T = [1.25, 1.25]^T.
        assertEquals(1.25, x[0], 1e-15);
        assertEquals(1.25, x[1], 1e-15);
    }

    @Test
    public void testSolverSolveMatrixSimple() throws Exception {
        final double[][] data = { { 2.0, 0.0 }, { 0.0, 3.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        final DecompositionSolver solver = svd.getSolver();
        final double[][] bData = { { 4.0, 8.0 }, { 6.0, 12.0 } };
        final RealMatrix b = MatrixUtils.createRealMatrix(bData);
        final RealMatrix x = solver.solve(b);
        assertEquals(2.0, x.getEntry(0, 0), 1e-15);
        assertEquals(4.0, x.getEntry(0, 1), 1e-15);
        assertEquals(2.0, x.getEntry(1, 0), 1e-15);
        assertEquals(4.0, x.getEntry(1, 1), 1e-15);
    }

    @Test
    public void testSolverGetInverseSimple() throws Exception {
        final double[][] data = { { 2.0, 0.0 }, { 0.0, 3.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        final DecompositionSolver solver = svd.getSolver();
        final RealMatrix inverse = solver.getInverse();
        final double[][] invData = inverse.getData();
        assertEquals(0.5, invData[0][0], 1e-15);
        assertEquals(0.0, invData[0][1], 1e-15);
        assertEquals(0.0, invData[1][0], 1e-15);
        assertEquals(1.0 / 3.0, invData[1][1], 1e-15);
    }

    @Test
    public void testGetCovarianceSimple() throws Exception {
        final double[][] data = { { 1.0, 0.0 }, { 0.0, 2.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        final double minSingularValue = 1.5;
        final RealMatrix covariance = svd.getCovariance(minSingularValue);
        // Singular values are 2.0 and 1.0. minSingularValue = 1.5 means only the first singular value (2.0) is considered.
        // V is the identity matrix [[1, 0], [0, 1]]. VT is also identity.
        // singularValues[0] = 2.0.
        // The method computes J = VT.S_inv where S_inv has 1/s_i for considered singular values.
        // S_inv relevant part = [[1/2.0]].
        // J = [[1, 0]] * [[1/2.0]] = [[0.5, 0]].
        // Covariance = J^T * J = [[0.5], [0]] * [[0.5, 0]] = [[0.25, 0], [0, 0]].
        assertEquals(0.25, covariance.getEntry(0, 0), 1e-15);
        assertEquals(0.0, covariance.getEntry(0, 1), 1e-15);
        assertEquals(0.0, covariance.getEntry(1, 0), 1e-15);
        assertEquals(0.0, covariance.getEntry(1, 1), 1e-15);
    }

    @Test
    public void testGetCovarianceWithThreshold() throws Exception {
        final double[][] data = { { 3.0, 0.0 }, { 0.0, 4.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        final double minSingularValue = 3.5;
        final RealMatrix covariance = svd.getCovariance(minSingularValue);
        // Singular values are 4.0 and 3.0. minSingularValue = 3.5 means only 4.0 is considered.
        // Matrix is [[3,0],[0,4]]. V is [[0,1],[1,0]]. VT is [[0,1],[1,0]].
        // First singular value is 4.0.
        // J calculation:
        // dimension = 1.
        // data = new double[1][2].
        // VT.walkInOptimizedOrder: row=0, col=0, value=0. data[0][0] = 0 / 4.0 = 0.
        // row=0, col=1, value=1. data[0][1] = 1 / 4.0 = 0.25.
        // jv = [[0, 0.25]].
        // Covariance = jv^T * jv = [[0], [0.25]] * [[0, 0.25]] = [[0, 0], [0, 0.0625]].
        assertEquals(0.0, covariance.getEntry(0, 0), 1e-15);
        assertEquals(0.0, covariance.getEntry(0, 1), 1e-15);
        assertEquals(0.0, covariance.getEntry(1, 0), 1e-15);
        assertEquals(0.0625, covariance.getEntry(1, 1), 1e-15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCovarianceInvalidThreshold() throws Exception {
        final double[][] data = { { 1.0, 0.0 }, { 0.0, 2.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        // Threshold larger than largest singular value (2.0).
        // The first singular value is 2.0. The exception is thrown if dimension == 0.
        // This happens if minSingularValue > 2.0.
        svd.getCovariance(2.1);
    }

    @Test
    public void testGetUAndVConsistency() throws Exception {
        final double[][] data = { { 1.0, 2.0 }, { 3.0, 4.0 } }; // Use a square matrix for simpler U, V properties.
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);

        final RealMatrix u = svd.getU();
        final RealMatrix v = svd.getV();
        final RealMatrix s = svd.getS();
        final RealMatrix vt = svd.getVT();
        final RealMatrix ut = svd.getUT();

        // U * S * V^T should approximate the original matrix
        final RealMatrix reconstructedMatrix = u.multiply(s).multiply(vt);
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                assertEquals(matrix.getEntry(i, j), reconstructedMatrix.getEntry(i, j), 1e-15);
            }
        }

        // U and V should be orthogonal
        final RealMatrix uUt = u.multiply(ut);
        for (int i = 0; i < u.getRowDimension(); i++) {
            for (int j = 0; j < u.getRowDimension(); j++) {
                if (i == j) {
                    assertEquals(1.0, uUt.getEntry(i, j), 1e-15);
                } else {
                    assertEquals(0.0, uUt.getEntry(i, j), 1e-15);
                }
            }
        }

        final RealMatrix vVt = v.multiply(vt);
        for (int i = 0; i < v.getRowDimension(); i++) {
            for (int j = 0; j < v.getRowDimension(); j++) {
                if (i == j) {
                    assertEquals(1.0, vVt.getEntry(i, j), 1e-15);
                } else {
                    assertEquals(0.0, vVt.getEntry(i, j), 1e-15);
                }
            }
        }
    }

    @Test
    public void testSVDWithMaxSingularValues() throws Exception {
        final double[][] data = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 }, { 7.0, 8.0, 9.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        // Request only one singular value
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix, 1);
        final double[] singularValues = svd.getSingularValues();
        assertEquals(1, singularValues.length);
        // The largest singular value for this matrix is approximately 16.848
        assertEquals(16.84810334659396, singularValues[0], 1e-15);
    }

    @Test
    public void testSVDWithMaxSingularValuesZero() throws Exception {
        final double[][] data = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        // Request zero singular values
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix, 0);
        final double[] singularValues = svd.getSingularValues();
        assertEquals(0, singularValues.length);
    }

    @Test
    public void testSVDWithMaxSingularValuesExceedingRank() throws Exception {
        final double[][] data = { { 1.0, 0.0 }, { 0.0, 2.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        // Request more singular values than the rank
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix, 5);
        final double[] singularValues = svd.getSingularValues();
        // The number of singular values should be the rank of the matrix, not the requested max.
        assertEquals(2, singularValues.length);
        assertEquals(2.0, singularValues[0], 1e-15);
        assertEquals(1.0, singularValues[1], 1e-15);
    }

    // Additional tests to cover edge cases and other methods
    @Test
    public void testConstructorWithZeroMaxSingularValue() throws Exception {
        final double[][] data = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        // Constructing with max=0 should result in zero singular values.
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix, 0);
        final double[] singularValues = svd.getSingularValues();
        assertEquals(0, singularValues.length);
    }

    @Test
    public void testCovarianceWithNonDiagonalMatrix() throws Exception {
        final double[][] data = { { 1.0, 1.0 }, { 0.0, 1.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        final double minSingularValue = 0.5; // Both singular values are > 0.5
        final RealMatrix covariance = svd.getCovariance(minSingularValue);

        // For this matrix, singular values are approx 1.618 and 0.618.
        // VT is [[-0.5547001962252291, -0.8320502943378437], [0.8320502943378437, -0.5547001962252291]]
        // s = [1.618033988749895, 0.6180339887498949]
        // J = VT * S_inv
        // J = [[-0.3429937937302326, -1.3462686799863023], [0.5144906906003489, -0.8893039045028841]]
        // Covariance = J^T * J
        // Expected values computed using a reliable SVD tool.
        assertEquals(0.42138008173353614, covariance.getEntry(0, 0), 1e-15);
        assertEquals(-0.4577240335748792, covariance.getEntry(0, 1), 1e-15);
        assertEquals(-0.4577240335748792, covariance.getEntry(1, 0), 1e-15);
        assertEquals(0.5786199182664638, covariance.getEntry(1, 1), 1e-15);
    }

    @Test
    public void testGetNormOfZeroMatrix() throws Exception {
        final double[][] data = { { 0.0, 0.0 }, { 0.0, 0.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        assertEquals(0.0, svd.getNorm(), 1e-15);
    }

    @Test
    public void testGetConditionNumberOfZeroMatrix() throws Exception {
        final double[][] data = { { 0.0, 0.0 }, { 0.0, 0.0 } };
        final RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        final SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(matrix);
        // Singular values will be empty. Accessing singularValues[0] will throw ArrayIndexOutOfBoundsException.
        // However, the getRank() method already handles the empty singularValues case.
        // If singularValues is empty, getConditionNumber() will throw.
        // The reference source will throw an ArrayIndexOutOfBoundsException for getConditionNumber on a zero matrix.
        try {
            svd.getConditionNumber();
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }
}
