package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.util.MathUtils;

public class SingularValueDecompositionImplTest {
    @Test
    public void testDiagonalSquareDecomposition() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        assertArrayEquals(new double[] { 3.0, 2.0 }, svd.getSingularValues(), 1e-12);
        assertEquals(3.0, svd.getNorm(), 1e-12);
        assertEquals(1.5, svd.getConditionNumber(), 1e-12);
        assertEquals(2, svd.getRank());
    }

    @Test
    public void testTruncatedDecomposition() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }), 1);
        assertArrayEquals(new double[] { 3.0 }, svd.getSingularValues(), 1e-12);
        assertEquals(1, svd.getRank());
    }

    @Test
    public void testZeroMaxProducesNoSingularValues() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }), 0);
        assertEquals(0, svd.getSingularValues().length);
    }

    @Test
    public void testUHasExpectedDimensionsAndOrthonormalColumns() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        RealMatrix u = svd.getU();
        assertEquals(2, u.getRowDimension());
        assertEquals(2, u.getColumnDimension());
        RealMatrix product = u.transpose().multiply(u);
        assertEquals(1.0, product.getEntry(0, 0), 1e-12);
        assertEquals(0.0, product.getEntry(0, 1), 1e-12);
        assertEquals(1.0, product.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testUTIsTransposeOfU() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        RealMatrix u = svd.getU();
        RealMatrix ut = svd.getUT();
        assertEquals(u.getEntry(0, 1), ut.getEntry(1, 0), 1e-12);
        assertEquals(u.getEntry(1, 0), ut.getEntry(0, 1), 1e-12);
    }

    @Test
    public void testSContainsSingularValuesOnDiagonal() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        RealMatrix s = svd.getS();
        assertEquals(3.0, s.getEntry(0, 0), 1e-12);
        assertEquals(2.0, s.getEntry(1, 1), 1e-12);
        assertEquals(0.0, s.getEntry(0, 1), 1e-12);
    }

    @Test
    public void testSingularValuesArrayIsDefensiveCopy() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        double[] values = svd.getSingularValues();
        values[0] = 99.0;
        assertEquals(3.0, svd.getSingularValues()[0], 1e-12);
    }

    @Test
    public void testVHasOrthonormalColumns() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        RealMatrix v = svd.getV();
        RealMatrix product = v.transpose().multiply(v);
        assertEquals(1.0, product.getEntry(0, 0), 1e-12);
        assertEquals(0.0, product.getEntry(0, 1), 1e-12);
        assertEquals(1.0, product.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testVTIsTransposeOfV() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        RealMatrix v = svd.getV();
        RealMatrix vt = svd.getVT();
        assertEquals(v.getEntry(0, 1), vt.getEntry(1, 0), 1e-12);
        assertEquals(v.getEntry(1, 0), vt.getEntry(0, 1), 1e-12);
    }

    @Test
    public void testCovarianceForDiagonalMatrix() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        RealMatrix covariance = svd.getCovariance(2.0);
        assertEquals(1.0 / 9.0, covariance.getEntry(0, 0), 1e-12);
        assertEquals(1.0 / 4.0, covariance.getEntry(1, 1), 1e-12);
        assertEquals(0.0, covariance.getEntry(0, 1), 1e-12);
    }

    @Test
    public void testCovarianceCutoffIncludesEquality() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        RealMatrix covariance = svd.getCovariance(3.0);
        assertEquals(1.0 / 9.0, covariance.getEntry(0, 0), 1e-12);
        assertEquals(0.0, covariance.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testCovarianceRejectsCutoffAboveLargestSingularValue() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        try {
            svd.getCovariance(3.1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testTallMatrixDecompositionDimensions() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 }, { 0.0, 0.0 } }));
        assertEquals(3, svd.getU().getRowDimension());
        assertEquals(2, svd.getU().getColumnDimension());
        assertEquals(2, svd.getV().getRowDimension());
        assertEquals(2, svd.getV().getColumnDimension());
    }

    @Test
    public void testWideMatrixDecompositionDimensions() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0, 0.0 }, { 0.0, 2.0, 0.0 } }));
        assertEquals(2, svd.getU().getRowDimension());
        assertEquals(2, svd.getU().getColumnDimension());
        assertEquals(3, svd.getV().getRowDimension());
        assertEquals(2, svd.getV().getColumnDimension());
    }

    @Test
    public void testSolverSolvesDiagonalSystem() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        double[] solution = svd.getSolver().solve(new double[] { 6.0, 4.0 });
        assertArrayEquals(new double[] { 2.0, 2.0 }, solution, 1e-12);
    }

    @Test
    public void testSolverReportsSquareFullRankAsNonSingular() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        assertTrue(svd.getSolver().isNonSingular());
    }

    @Test
    public void testInverseOfDiagonalMatrix() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 } }));
        RealMatrix inverse = svd.getSolver().getInverse();
        assertEquals(1.0 / 3.0, inverse.getEntry(0, 0), 1e-12);
        assertEquals(1.0 / 2.0, inverse.getEntry(1, 1), 1e-12);
        assertEquals(0.0, inverse.getEntry(0, 1), 1e-12);
    }

    @Test
    public void testSolverForTallMatrixProducesLeastSquaresSolution() throws Exception {
        SingularValueDecompositionImpl svd =
            new SingularValueDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 3.0, 0.0 }, { 0.0, 2.0 }, { 0.0, 0.0 } }));
        double[] solution = svd.getSolver().solve(new double[] { 6.0, 4.0, 5.0 });
        assertArrayEquals(new double[] { 2.0, 2.0 }, solution, 1e-12);
    }
}
