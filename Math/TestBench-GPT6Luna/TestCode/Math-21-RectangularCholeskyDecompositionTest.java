package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.FastMath;

public class RectangularCholeskyDecompositionTest {
    @Test
    public void testOneByOnePositiveMatrix() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {{4.0}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.0);
        assertEquals(1, decomposition.getRank());
        assertEquals(2.0, decomposition.getRootMatrix().getEntry(0, 0), 1e-12);
    }

    @Test
    public void testIdentityMatrix() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealIdentityMatrix(2);
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.0);
        assertEquals(2, decomposition.getRank());
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(1.0, root.getEntry(0, 0), 1e-12);
        assertEquals(1.0, root.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testRankOneMatrix() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{4.0, 2.0}, {2.0, 1.0}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.0);
        assertEquals(2, decomposition.getRank());
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(2.0, root.getEntry(0, 0), 1e-12);
        assertEquals(1.0, root.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testPivotPermutesLargestDiagonalFirst() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{1.0, 0.0}, {0.0, 4.0}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.0);
        assertEquals(2, decomposition.getRank());
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(0.0, root.getEntry(0, 0), 1e-12);
        assertEquals(2.0, root.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testPivotPreservesCorrelatedMatrixReconstruction() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{1.0, 1.0}, {1.0, 4.0}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.0);
        assertEquals(2, decomposition.getRank());
        RealMatrix root = decomposition.getRootMatrix();
        RealMatrix reconstructed = root.multiply(root.transpose());
        assertEquals(1.0, reconstructed.getEntry(0, 0), 1e-12);
        assertEquals(1.0, reconstructed.getEntry(0, 1), 1e-12);
        assertEquals(4.0, reconstructed.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testThreeDimensionalRankOneMatrix() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{1.0, 2.0, 3.0},
                                {2.0, 4.0, 6.0},
                                {3.0, 6.0, 9.0}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.0);
        assertEquals(3, decomposition.getRank());
        RealMatrix reconstructed = decomposition.getRootMatrix()
                .multiply(decomposition.getRootMatrix().transpose());
        assertEquals(4.0, reconstructed.getEntry(1, 1), 1e-12);
        assertEquals(6.0, reconstructed.getEntry(1, 2), 1e-12);
        assertEquals(9.0, reconstructed.getEntry(2, 2), 1e-12);
    }

    @Test
    public void testSmallDiagonalBelowThresholdIsDiscarded() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{1.0, 0.0}, {0.0, 0.25}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.5);
        assertEquals(2, decomposition.getRank());
        assertEquals(0.0, decomposition.getRootMatrix().getEntry(1, 0), 1e-12);
    }

    @Test
    public void testDiagonalExactlyAtThresholdIsKept() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{1.0, 0.0}, {0.0, 0.5}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.5);
        assertEquals(2, decomposition.getRank());
        assertEquals(FastMath.sqrt(0.5),
                     decomposition.getRootMatrix().getEntry(1, 1), 1e-12);
    }

    @Test
    public void testZeroMatrixHasZeroRank() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{0.0, 0.0}, {0.0, 0.0}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.0);
        assertEquals(2, decomposition.getRank());
        assertEquals(2, decomposition.getRootMatrix().getColumnDimension());
    }

    @Test
    public void testNegativeFirstDiagonalThrows() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {{-1.0}});
        try {
            new RectangularCholeskyDecomposition(matrix, 0.0);
            fail("expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException expected) {
            assertEquals(0, expected.getRow());
            assertEquals(0, expected.getColumn());
        }
    }

    @Test
    public void testNegativeResidualDiagonalThrows() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{1.0, 0.0}, {0.0, -0.25}});
        try {
            new RectangularCholeskyDecomposition(matrix, 0.1);
            fail("expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException expected) {
            assertEquals(1, expected.getColumn());
        }
    }

    @Test
    public void testNegativeResidualWithinToleranceIsDiscarded() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{1.0, 0.0}, {0.0, -0.05}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.1);
        assertEquals(2, decomposition.getRank());
        assertEquals(2, decomposition.getRootMatrix().getColumnDimension());
    }

    @Test
    public void testRankZeroRootHasNoColumns() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{0.1, 0.0}, {0.0, 0.1}});
        try {
            new RectangularCholeskyDecomposition(matrix, 0.2);
            fail("expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException expected) {
            assertEquals(0, expected.getRow());
        }
    }

    @Test
    public void testRootReconstructsFullRankCorrelatedMatrix() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{4.0, 2.0}, {2.0, 2.0}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.0);
        RealMatrix root = decomposition.getRootMatrix();
        RealMatrix reconstructed = root.multiply(root.transpose());
        assertEquals(4.0, reconstructed.getEntry(0, 0), 1e-12);
        assertEquals(2.0, reconstructed.getEntry(0, 1), 1e-12);
        assertEquals(2.0, reconstructed.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testRootMatrixHasOriginalRowCount() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(
                new double[][] {{1.0, 0.0, 0.0},
                                {0.0, 1.0, 0.0},
                                {0.0, 0.0, 0.0}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.0);
        assertEquals(3, decomposition.getRootMatrix().getRowDimension());
        assertEquals(3, decomposition.getRootMatrix().getColumnDimension());
    }

    @Test
    public void testReturnedRootMatrixIsStable() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {{9.0}});
        RectangularCholeskyDecomposition decomposition =
                new RectangularCholeskyDecomposition(matrix, 0.0);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(3.0, root.getEntry(0, 0), 1e-12);
        assertEquals(1, decomposition.getRank());
        assertEquals(3.0, decomposition.getRootMatrix().getEntry(0, 0), 1e-12);
    }
}
