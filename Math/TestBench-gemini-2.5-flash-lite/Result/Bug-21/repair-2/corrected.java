package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.FastMath;

public class RectangularCholeskyDecompositionTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSimpleDecomposition() throws Exception {
        double[][] data = { { 4.0, 2.0 }, { 2.0, 4.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(2, root.getRowDimension());
        assertEquals(2, root.getColumnDimension());
        assertEquals(2.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
        assertEquals(0.0, root.getEntry(0, 1), 1e-15);
        assertEquals(FastMath.sqrt(3.0), root.getEntry(1, 1), 1e-15);
        assertEquals(2, decomposition.getRank());
    }

    @Test
    public void testDecompositionWithSmallDiagonal() throws Exception {
        double[][] data = { { 4.0, 2.0, 1.0 }, { 2.0, 0.1, 0.5 }, { 1.0, 0.5, 2.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-1); // small threshold
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(3, root.getRowDimension());
        assertEquals(2, root.getColumnDimension()); // Rank is 2 due to small diagonal
        assertEquals(2.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
        assertEquals(0.5, root.getEntry(2, 0), 1e-15);
        assertEquals(0.0, root.getEntry(0, 1), 1e-15);
        assertEquals(0.04880884817015163, root.getEntry(1, 1), 1e-15);
        assertEquals(0.47469060640258616, root.getEntry(2, 1), 1e-15);
        assertEquals(2, decomposition.getRank());
    }

    @Test
    public void testDecompositionWithZeroDiagonal() throws Exception {
        double[][] data = { { 4.0, 2.0 }, { 2.0, 0.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(2, root.getRowDimension());
        assertEquals(1, root.getColumnDimension()); // Rank is 1
        assertEquals(2.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
        assertEquals(1, decomposition.getRank());
    }

    @Test
    public void testNonPositiveDefiniteExceptionSmall() throws Exception {
        double[][] data = { { 4.0, 2.0 }, { 2.0, -1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        try {
            new RectangularCholeskyDecomposition(matrix, 1e-15);
            fail("Expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException e) {
            assertEquals(-1.0, e.getArgument(), 1e-15); // This refers to the value that caused the exception.
            assertEquals(1e-15, e.getThreshold(), 1e-30); // The small threshold parameter.
        }
    }

    @Test
    public void testNonPositiveDefiniteExceptionZeroSmall() throws Exception {
        double[][] data = { { 0.0, 0.0 }, { 0.0, 0.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        try {
            new RectangularCholeskyDecomposition(matrix, 1e-15);
            fail("Expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException e) {
            assertEquals(0.0, e.getArgument(), 1e-15); // Index 0
            assertEquals(1e-15, e.getThreshold(), 1e-30);
        }
    }
    
    @Test
    public void testIdentityMatrix() throws Exception {
        double[][] data = { { 1.0, 0.0, 0.0 }, { 0.0, 1.0, 0.0 }, { 0.0, 0.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(3, root.getRowDimension());
        assertEquals(3, root.getColumnDimension());
        assertEquals(1.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 1), 1e-15);
        assertEquals(1.0, root.getEntry(2, 2), 1e-15);
        assertEquals(3, decomposition.getRank());
    }

    @Test
    public void testRankOneMatrix() throws Exception {
        double[][] data = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(2, root.getRowDimension());
        assertEquals(1, root.getColumnDimension());
        assertEquals(1.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
        assertEquals(1, decomposition.getRank());
    }

    @Test
    public void testRankDeficientMatrix() throws Exception {
        double[][] data = { { 4.0, 2.0, 2.0 }, { 2.0, 1.0, 1.0 }, { 2.0, 1.0, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(3, root.getRowDimension());
        assertEquals(1, root.getColumnDimension()); // Rank is 1
        assertEquals(2.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
        assertEquals(1.0, root.getEntry(2, 0), 1e-15);
        assertEquals(1, decomposition.getRank());
    }

    @Test
    public void testLargerMatrix() throws Exception {
        double[][] data = {
            { 25, 15, -5, -15 },
            { 15, 18,  0, -22 },
            { -5,  0, 11,  20 },
            { -15, -22, 20, 46 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(4, root.getRowDimension());
        assertEquals(4, root.getColumnDimension());
        assertEquals(5.0, root.getEntry(0, 0), 1e-15);
        assertEquals(3.0, root.getEntry(1, 0), 1e-15);
        assertEquals(-1.0, root.getEntry(2, 0), 1e-15);
        assertEquals(-3.0, root.getEntry(3, 0), 1e-15);
        assertEquals(0.0, root.getEntry(0, 1), 1e-15);
        assertEquals(3.0, root.getEntry(1, 1), 1e-15);
        assertEquals(3.0, root.getEntry(2, 1), 1e-15);
        assertEquals(-3.0, root.getEntry(3, 1), 1e-15);
        assertEquals(4, decomposition.getRank());
    }

    @Test
    public void testRootMatrixValues() throws Exception {
        double[][] data = { { 9, 3 }, { 3, 2 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(3.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
        assertEquals(0.0, root.getEntry(0, 1), 1e-15); 
        assertEquals(1.0, root.getEntry(1, 1), 1e-15);
        assertEquals(2, decomposition.getRank());
    }

    @Test
    public void testSmallThresholdEffect() throws Exception {
        double[][] data = { { 4.0, 2.0 }, { 2.0, 1e-20 } }; // second diagonal is very small
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decompositionLowThreshold = new RectangularCholeskyDecomposition(matrix, 1e-30);
        RectangularCholeskyDecomposition decompositionHighThreshold = new RectangularCholeskyDecomposition(matrix, 1e-10);

        assertEquals(2, decompositionLowThreshold.getRank());
        assertEquals(1, decompositionHighThreshold.getRank()); // Should discard the second column
    }

    @Test
    public void testMatrixWithNegativeDiagonalButPositiveDefinite() throws Exception {
        double[][] data = { { 4.0, 2.0 }, { 2.0, -1.0 } }; // This matrix is not positive semidefinite.
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        try {
            new RectangularCholeskyDecomposition(matrix, 1e-15);
            fail("Expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException e) {
            assertEquals(-1.0, e.getArgument(), 1e-15); // The problematic value (negative)
            assertEquals(1e-15, e.getThreshold(), 1e-30); // The small threshold
        }
    }

    @Test
    public void testMaximalDiagonalElementSelection() throws Exception {
        double[][] psdData = { { 1.0, 0.5, 0.2 }, { 0.5, 4.0, 0.6 }, { 0.2, 0.6, 0.8 } };
        RealMatrix psdMatrix = MatrixUtils.createRealMatrix(psdData);
        RectangularCholeskyDecomposition decompositionPSD = new RectangularCholeskyDecomposition(psdMatrix, 1e-15);
        assertEquals(3, decompositionPSD.getRank());
    }

    @Test
    public void testRootMatrixNotSquare() throws Exception {
        double[][] data = { { 1.0, 0.5, 0.25 }, { 0.5, 1.0, 0.5 }, { 0.25, 0.5, 1.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(3, root.getRowDimension());
        assertEquals(3, root.getColumnDimension()); // In this case, rank is 3
    }

    @Test
    public void testGetRank() throws Exception {
        double[][] data1 = { { 4, 2 }, { 2, 1 } }; // Rank 1
        RealMatrix matrix1 = MatrixUtils.createRealMatrix(data1);
        RectangularCholeskyDecomposition decomp1 = new RectangularCholeskyDecomposition(matrix1, 1e-15);
        assertEquals(1, decomp1.getRank());

        double[][] data2 = { { 4, 2 }, { 2, 4 } }; // Rank 2
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);
        RectangularCholeskyDecomposition decomp2 = new RectangularCholeskyDecomposition(matrix2, 1e-15);
        assertEquals(2, decomp2.getRank());
    }
    
    @Test
    public void testZeroMatrix() throws Exception {
        double[][] data = { { 0.0, 0.0 }, { 0.0, 0.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        try {
            new RectangularCholeskyDecomposition(matrix, 1e-15);
            fail("Expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException e) {
            assertEquals(0.0, e.getArgument(), 1e-15); // The problematic value (0.0)
            assertEquals(0, e.getIndex(), 1e-15); // Index 0, assuming getIndex() is accessible or similar to getRow() for this exception type
            assertEquals(1e-15, e.getThreshold(), 1e-30);
        }
    }

    @Test
    public void testSmallPositiveDiagonal() throws Exception {
        double[][] data = { { 1e-20, 0.0 }, { 0.0, 1e-20 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-30);
        assertEquals(2, decomposition.getRank());
        assertEquals(1e-10, decomposition.getRootMatrix().getEntry(0, 0), 1e-15);
        assertEquals(0.0, decomposition.getRootMatrix().getEntry(1, 0), 1e-15);
        assertEquals(0.0, decomposition.getRootMatrix().getEntry(0, 1), 1e-15);
        assertEquals(1e-10, decomposition.getRootMatrix().getEntry(1, 1), 1e-15);
    }

    @Test
    public void testThresholdBehaviorForZero() throws Exception {
        double[][] data = { { 1.0, 0.0 }, { 0.0, 0.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decompWithZeroThreshold = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RectangularCholeskyDecomposition decompWithPositiveThreshold = new RectangularCholeskyDecomposition(matrix, 1e-5);

        assertEquals(1, decompWithZeroThreshold.getRank()); // Should keep rank 1
        assertEquals(1, decompWithPositiveThreshold.getRank()); // Should still keep rank 1
    }

    @Test
    public void testRootMatrixWhenRankIsZero() throws Exception {
        double[][] nearZeroData = { { 1e-20, 0.0 }, { 0.0, 1e-20 } };
        RealMatrix nearZeroMatrix = MatrixUtils.createRealMatrix(nearZeroData);
        
        try {
            new RectangularCholeskyDecomposition(nearZeroMatrix, 1e-15);
            fail("Expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException e) {
            assertEquals(1e-20, e.getArgument(), 1e-30); // The problematic value
            assertEquals(0, e.getIndex(), 1e-15); // Index 0, assuming getIndex() is accessible or similar to getRow() for this exception type
            assertEquals(1e-15, e.getThreshold(), 1e-30);
        }
    }

    @Test
    public void testMatrixWithZeroDiagonalAndNonZeroOffDiagonal() throws Exception {
        double[][] data = { { 1.0, 0.0 }, { 0.0, 0.0 } }; // This is PSD.
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(2, root.getRowDimension());
        assertEquals(1, root.getColumnDimension());
        assertEquals(1.0, root.getEntry(0, 0), 1e-15);
        assertEquals(0.0, root.getEntry(1, 0), 1e-15);
        assertEquals(1, decomposition.getRank());
    }

    @Test
    public void testRootMatrixIsMutable() throws Exception {
        double[][] data = { { 4.0, 2.0 }, { 2.0, 4.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        
        double originalEntry = root.getEntry(0, 0);
        root.setEntry(0, 0, originalEntry + 1.0);
        
        assertEquals(originalEntry + 1.0, root.getEntry(0, 0), 1e-15);
        RealMatrix rootAgain = decomposition.getRootMatrix();
        assertEquals(originalEntry + 1.0, rootAgain.getEntry(0, 0), 1e-15);
    }

    @Test
    public void testLargeNumberInput() throws Exception {
        double[][] data = { { 1e20, 1e10 }, { 1e10, 1e20 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(2, root.getRowDimension());
        assertEquals(2, root.getColumnDimension());
        assertEquals(1e10, root.getEntry(0, 0), 1e5); // Tolerance adjustment for large numbers
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
        assertEquals(0.0, root.getEntry(0, 1), 1e-15);
        assertEquals(FastMath.sqrt(1e20 - FastMath.pow(1e10, 2) / 1e20), root.getEntry(1, 1), 1e10); // Tolerance adjustment
        assertEquals(2, decomposition.getRank());
    }

    @Test
    public void testSmallNumberInput() throws Exception {
        double[][] data = { { 1e-20, 1e-30 }, { 1e-30, 1e-20 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-40);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(2, root.getRowDimension());
        assertEquals(2, root.getColumnDimension());
        assertEquals(1e-10, root.getEntry(0, 0), 1e-15);
        assertEquals(1e-20, root.getEntry(1, 0), 1e-30);
        assertEquals(0.0, root.getEntry(0, 1), 1e-15);
        assertEquals(1e-10, root.getEntry(1, 1), 1e-15);
        assertEquals(2, decomposition.getRank());
    }

    @Test
    public void testThresholdHandlingWithVerySmallNumbers() throws Exception {
        double[][] data = { { 1e-20, 0.0 }, { 0.0, 1e-20 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        RectangularCholeskyDecomposition decompLowTol = new RectangularCholeskyDecomposition(matrix, 1e-30);
        assertEquals(2, decompLowTol.getRank());

        RectangularCholeskyDecomposition decompHighTol = new RectangularCholeskyDecomposition(matrix, 1e-15);
        assertEquals(1, decompHighTol.getRank());
    }

    @Test
    public void testNegativeSmallThreshold() throws Exception {
        double[][] data = { { 4.0, 2.0 }, { 2.0, 4.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, -1e-15);
        assertEquals(2, decomposition.getRank());
        assertEquals(2.0, decomposition.getRootMatrix().getEntry(0, 0), 1e-15);
        assertEquals(1.0, decomposition.getRootMatrix().getEntry(1, 0), 1e-15);
        assertEquals(0.0, decomposition.getRootMatrix().getEntry(0, 1), 1e-15);
        assertEquals(FastMath.sqrt(3.0), decomposition.getRootMatrix().getEntry(1, 1), 1e-15);
    }
    
    @Test
    public void testRectangularRootMatrixOutput() throws Exception {
        double[][] rankOneData = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        RealMatrix rankOneMatrix = MatrixUtils.createRealMatrix(rankOneData);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(rankOneData.length, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(2, root.getRowDimension());
        assertEquals(1, root.getColumnDimension()); // Rank is 1
        assertEquals(1.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
    }

    @Test
    public void testRankDeterminationWithTolerance() throws Exception {
        double[][] data = { { 4.0, 2.0 }, { 2.0, 1e-10 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        RectangularCholeskyDecomposition decompLowTol = new RectangularCholeskyDecomposition(matrix, 1e-15);
        assertEquals(2, decompLowTol.getRank());

        RectangularCholeskyDecomposition decompHighTol = new RectangularCholeskyDecomposition(matrix, 1e-9);
        assertEquals(1, decompHighTol.getRank());
    }
}
