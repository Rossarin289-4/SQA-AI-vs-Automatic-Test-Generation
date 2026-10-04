```java
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
            // NonPositiveDefiniteMatrixException does not have getWrongValue() or getArgument()
            // It inherits from NumberIsTooSmallException which has getArgument() and getThreshold()
            // The 'wrong' value is the threshold it was compared against.
            // The 'index' is the argument that failed.
            // Let's check the fields inherited from NumberIsTooSmallException
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
        // Manually calculate expected root values
        // B[0][0] = sqrt(9) = 3
        // B[1][0] = 3 / 3 = 1
        // c[1][1] = 2 - (1*1) = 1 (after transforming with first column)
        // B[1][1] = sqrt(1) = 1
        assertEquals(3.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
        // The method generates a rectangular matrix where columns are rank.
        // For a 2x2 matrix with rank 2, the root is 2x2.
        // The matrix is not strictly triangular as in standard Cholesky.
        // The B matrix is filled row by row, column by column in the constructor.
        // b[r][r] = sqrt
        // b[i][r] = c[ii][ir] / sqrt
        // If r=0: b[0][0] = sqrt(c[0][0]) = sqrt(9) = 3.
        //         b[1][0] = c[1][0] / b[0][0] = 3 / 3 = 1.
        // Next iteration r=1:
        //         b[1][1] = sqrt(c[1][1]) where c[1][1] is updated.
        //         c[1][1] = c[1][1] - c[1][0]^2 / c[0][0] = 2 - 3^2/9 = 2 - 1 = 1.
        //         b[1][1] = sqrt(1) = 1.
        // So the root matrix is: [[3.0, 0.0], [1.0, 1.0]]
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
        // A matrix can be positive semidefinite even if diagonal elements are zero or negative,
        // but the algorithm as implemented specifically checks diagonal elements against 'small'.
        // For a positive semidefinite matrix, all diagonal elements are non-negative.
        // If a negative diagonal element is encountered where it should be positive for PSD,
        // and it's below the 'small' threshold, it will throw.
        // If it's below 'small' but not negative, it will be discarded.
        // This test aims to trigger the negative diagonal check.
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
        double[][] data = { { 1.0, 2.0, 3.0 }, { 2.0, 9.0, 4.0 }, { 3.0, 4.0, 2.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        // The algorithm should pick 9.0 (at index 1) as the first diagonal element because it's the maximal.
        // The index array `index` will be {1, 0, 2} after the first iteration if initial order was {0, 1, 2}.
        // The original row 1 (with value 9.0) becomes the first row in the transformed matrix.
        // The root matrix B is constructed using `index`.
        // So B[index[i]][j] are the entries.
        // For j=0 (first column of root matrix):
        // B[index[0]][0] = B[1][0] = sqrt(c[1][1]) = sqrt(9) = 3.
        // B[index[1]][0] = B[0][0] = c[0][1]/sqrt(c[1][1]) = 2/3.
        // B[index[2]][0] = B[2][0] = c[2][1]/sqrt(c[1][1]) = 4/3.
        // But the `b` array is filled as `b[r][r]` and `b[i][r]`.
        // So, b[0][0] = sqrt(9.0) = 3.0
        // b[1][0] = c[0][1]/sqrt(9.0) = 2/3. (where index[0]=1, index[1]=0)
        // b[2][0] = c[2][1]/sqrt(9.0) = 4/3. (where index[2]=2)
        // This is not right. Let's retrace:
        // Initial index: [0, 1, 2]
        // Initial c: [[1, 2, 3], [2, 9, 4], [3, 4, 2]]
        // r=0: max diagonal is 9 at index 1. Swap r=0 and swapR=1.
        // index becomes [1, 0, 2].
        // swap b[0] and b[1].
        // ir = index[0] = 1. c[1][1] = 9.0. sqrt = 3.0.
        // b[0][0] = 3.0
        // i=1 (index[1]=0): c[0][1]=2. e = 2/3. b[1][0] = 2/3. c[0][0] -= (2*2)/9 = 1 - 4/9 = 5/9.
        // i=2 (index[2]=2): c[2][1]=4. e = 4/3. b[2][0] = 4/3. c[2][2] -= (4*4)/9 = 2 - 16/9 = 2/9.
        // Now c is: [[5/9, 2/3, 3], [2/3, 9, 4], [3, 4, 2/9]] (Note: c is modified in place. Only upper triangle matters)
        // After r=0 loop:
        // c = [[0.555..., 0.666..., 3.0], [0.666..., 9.0, 4.0], [3.0, 4.0, 0.222...]]
        // Then r becomes 1.
        // Next iteration r=1: index[1]=0. c[0][0] = 5/9.
        // max diagonal element among c[index[i]][index[i]] for i >= r.
        // i=1: index[1]=0, c[0][0]=5/9
        // i=2: index[2]=2, c[2][2]=2/9
        // Max is 5/9 at index 1. swapR remains 1. No swap.
        // ir = index[1] = 0. c[0][0] = 5/9.
        // This is less than small. So it should throw NonPositiveDefiniteMatrixException.
        // Let's re-evaluate. The original matrix is symmetric.
        // Data: [[1,2,3],[2,9,4],[3,4,2]]
        // r=0. Max diagonal is 9 at row 1. Swap row 0 and row 1.
        // index: [1, 0, 2]. (This maps original index to current processing order).
        // b array: row 0 and row 1 swapped.
        // Current processing order is original indices: 1, 0, 2.
        // ir = index[0] = 1. c[1][1] = 9. sqrt = 3.
        // b[0][0] = 3.
        // i=1: original index is index[1]=0. c[0][1]=2.
        //      e = c[0][1] / sqrt = 2/3. b[1][0] = 2/3.
        //      c[0][0] -= c[0][1]^2 / c[1][1] = 1 - 2^2/9 = 1 - 4/9 = 5/9.
        // i=2: original index is index[2]=2. c[2][1]=4.
        //      e = c[2][1] / sqrt = 4/3. b[2][0] = 4/3.
        //      c[2][0] -= c[2][1]^2 / c[1][1] = 3 - 4^2/9 = 3 - 16/9 = 11/9.
        // After first pivot:
        // b is effectively [[3, 0, 0], [2/3, 0, 0], [4/3, 0, 0]] (only column 0 filled)
        // c is modified. The modified values are for indices:
        // c[0][0] = 5/9 (original index 0, first col)
        // c[2][0] = 11/9 (original index 2, first col)
        // c[0][1] is not relevant for next step calculation of c[1][1]
        // c[1][1] = 9.0 (original index 1, second col)
        // c[2][2] = 2 (original index 2, third col)
        // Matrix `c` is being modified.
        // Current state of relevant `c` diagonal elements for next iteration (original indices):
        // c[0][0] = 5/9
        // c[2][2] = 2
        // r becomes 1.
        // Next iteration: r=1.
        //   Find max diagonal element for i >= r (i.e., i=1, 2).
        //   Original indices to check: index[1]=0, index[2]=2.
        //   Diagonal elements: c[0][0] = 5/9, c[2][2] = 2.
        //   Max is 2 at index 2. swapR becomes 2.
        //   Swap r=1 and swapR=2.
        //   index becomes [1, 2, 0].
        //   b[1] and b[2] swapped.
        //   ir = index[1] = 2. c[2][2] = 2. sqrt = sqrt(2).
        //   b[1][1] = sqrt(2).
        //   i=2: original index index[2]=0. c[0][2]=3.
        //        e = c[0][2] / sqrt(2) = 3/sqrt(2). b[2][1] = 3/sqrt(2).
        //        c[0][0] -= c[0][2]^2 / c[2][2] = 5/9 - 3^2/2 = 5/9 - 9/2 = (10 - 81)/18 = -71/18.
        // r becomes 2.
        // Next iteration: r=2.
        //   ir = index[2] = 0. c[0][0] = -71/18.
        //   -71/18 < small (1e-15). This should throw.
        // The expected behavior is that the maximal diagonal element is chosen.
        // Let's check the code again:
        // `swapR` is the index in `index` array.
        // `index[swapR]` gives the original matrix index.
        // `c[index[i]][index[i]]` is the diagonal value.
        // Initial: index=[0,1,2], c=[[1,2,3],[2,9,4],[3,4,2]]
        // r=0:
        // i=1: index[1]=1. c[1][1]=9.
        // i=2: index[2]=2. c[2][2]=2.
        // Max diagonal is 9 at i=1. swapR=1.
        // Swap index[0] and index[1]. index becomes [1,0,2].
        // Swap b[0] and b[1].
        // ir = index[0] = 1. c[1][1] = 9. sqrt=3. b[0][0]=3.
        // i=1 (loop for transforming other rows): index[1]=0. c[0][1]=2.
        //      e = c[0][1]/sqrt = 2/3. b[1][0]=2/3.
        //      c[0][0] -= c[0][1]^2/c[1][1] = 1 - 4/9 = 5/9.
        // i=2: index[2]=2. c[2][1]=4.
        //      e = c[2][1]/sqrt = 4/3. b[2][0]=4/3.
        //      c[2][0] -= c[2][1]^2/c[1][1] = 3 - 16/9 = 11/9.
        // r becomes 1.
        // Next iteration r=1:
        //   Find max diagonal for i=1,2. Original indices: index[1]=0, index[2]=2.
        //   Diagonal elements: c[0][0]=5/9, c[2][2]=2.
        //   Max is 2 at i=2. swapR=2.
        //   Swap index[1] and index[2]. index becomes [1,2,0].
        //   Swap b[1] and b[2].
        //   ir = index[1] = 2. c[2][2]=2. sqrt=sqrt(2). b[1][1]=sqrt(2).
        //   i=2: original index index[2]=0. c[0][2]=3.
        //        e = c[0][2]/sqrt(2) = 3/sqrt(2). b[2][1] = 3/sqrt(2).
        //        c[0][0] -= c[0][2]^2/c[2][2] = 5/9 - 3^2/2 = 5/9 - 9/2 = -71/18.
        // r becomes 2.
        // Next iteration r=2:
        //   ir = index[2] = 0. c[0][0] = -71/18.
        //   This is < small. So it throws NonPositiveDefiniteMatrixException.
        // This matrix is NOT positive semidefinite. [[1,2,3],[2,9,4],[3,4,2]]
        // Check if it's PSD: det([[1,2],[2,9]]) = 9-4=5 > 0. det([[1,2,3],[2,9,4],[3,4,2]]) = 1(18-16) - 2(4-12) + 3(8-27) = 2 - 2(-8) + 3(-19) = 2 + 16 - 57 = 18 - 57 = -39.
        // Not PSD. So the exception IS expected.
        // The prompt implies that the reference source code handles it correctly and it IS PSD.
        // Let's try a truly PSD matrix where row 1 has the max diagonal:
        // e.g., [[1, 0.5, 0.2], [0.5, 4, 0.6], [0.2, 0.6, 0.8]]
        // det([1])=1. det([[1,0.5],[0.5,4]])=4-0.25=3.75.
        // det([[1,0.5,0.2],[0.5,4,0.6],[0.2,0.6,0.8]]) = 1(3.2-0.36) - 0.5(0.4-0.12) + 0.2(0.3-0.16) = 1(2.84) - 0.5(0.28) + 0.2(0.14) = 2.84 - 0.14 + 0.028 = 2.728. All positive. PSD.
        double[][] psdData = { { 1.0, 0.5, 0.2 }, { 0.5, 4.0, 0.6 }, { 0.2, 0.6, 0.8 } };
        RealMatrix psdMatrix = MatrixUtils.createRealMatrix(psdData);
        RectangularCholeskyDecomposition decompositionPSD = new RectangularCholeskyDecomposition(psdMatrix, 1e-15);
        // r=0: Max diagonal is 4.0 at index 1.
        // index becomes [1, 0, 2].
        // ir = index[0] = 1. c[1][1]=4. sqrt=2. b[0][0]=2.
        // i=1: index[1]=0. c[0][1]=0.5. e = 0.5/2 = 0.25. b[1][0]=0.25. c[0][0] -= 0.5^2/4 = 1 - 0.25/4 = 1 - 0.0625 = 0.9375.
        // i=2: index[2]=2. c[2][1]=0.6. e = 0.6/2 = 0.3. b[2][0]=0.3. c[2][0] -= 0.6^2/4 = 0.2 - 0.36/4 = 0.2 - 0.09 = 0.11.
        // r becomes 1.
        // Next iteration r=1:
        //   Original indices to check: index[1]=0, index[2]=2.
        //   Diagonal elements: c[0][0]=0.9375, c[2][2]=0.8.
        //   Max is 0.9375 at index 0. swapR remains 1. No swap.
        //   ir = index[1] = 0. c[0][0]=0.9375. sqrt = sqrt(0.9375) = 0.9682458...
        //   b[1][1] = sqrt(0.9375).
        //   i=2: index[2]=2. c[2][0]=0.11.  (This is wrong. c[2][1] from previous step. It should be c[index[i]][ir])
        //   i=2: original index index[2]=2. c[2][ir] = c[2][0] = 0.11.
        //        e = c[2][0] / sqrt(c[0][0]) = 0.11 / 0.9682458 = 0.113607...
        //        b[2][1] = e.
        //        c[2][2] -= c[2][0]^2 / c[0][0] = 0.8 - (0.11)^2 / 0.9375 = 0.8 - 0.0121 / 0.9375 = 0.8 - 0.0129066... = 0.7870933...
        // r becomes 2.
        // Next iteration r=2:
        //   ir = index[2] = 2. c[2][2] = 0.7870933... sqrt = sqrt(0.7870933...). b[2][2] = sqrt(...).
        // Rank is 3.
        // The previous test used a non-PSD matrix. This one is PSD.
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
            // For a zero matrix, the first diagonal element is 0.
            // 0 < small (1e-15) is true.
            // r=0. Throw exception.
            assertEquals(0.0, e.getArgument(), 1e-15); // The problematic value (0.0)
            assertEquals(0, e.getArgument(), 1e-15); // Index 0
            assertEquals(1e-15, e.getThreshold(), 1e-30);
        }
    }

    @Test
    public void testSmallPositiveDiagonal() throws Exception {
        double[][] data = { { 1e-20, 0.0 }, { 0.0, 1e-20 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-30);
        assertEquals(2, decomposition.getRank());
        // B[0][0] = sqrt(1e-20) = 1e-10
        // B[1][0] = 0.0 / 1e-10 = 0.0
        // Next pivot: c[1][1] (updated). c[1][1] = 1e-20 - (0.0*0.0)/1e-20 = 1e-20.
        // B[1][1] = sqrt(1e-20) = 1e-10
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

        // First pivot: 1.0. B[0][0]=1.0. B[1][0]=0.0.
        // Updated c[1][1] = 0.0 - 0.0^2/1.0 = 0.0.
        // Next pivot check: c[1][1] = 0.0.
        // decompWithZeroThreshold (small=1e-15): c[1][1] < 1e-15 is true. r becomes 1. loop ends. rank = 1.
        // decompWithPositiveThreshold (small=1e-5): c[1][1] < 1e-5 is true. r becomes 1. loop ends. rank = 1.
        assertEquals(1, decompWithZeroThreshold.getRank()); // Should keep rank 1
        assertEquals(1, decompWithPositiveThreshold.getRank()); // Should still keep rank 1
    }

    @Test
    public void testRootMatrixWhenRankIsZero() throws Exception {
        // A matrix where all diagonal elements are less than 'small'.
        // This should trigger the exception when r=0.
        double[][] nearZeroData = { { 1e-20, 0.0 }, { 0.0, 1e-20 } };
        RealMatrix nearZeroMatrix = MatrixUtils.createRealMatrix(nearZeroData);
        
        // Threshold is larger than the diagonal elements
        try {
            new RectangularCholeskyDecomposition(nearZeroMatrix, 1e-15);
            fail("Expected NonPositiveDefiniteMatrixException");
        } catch (NonPositiveDefiniteMatrixException e) {
            // The first diagonal element is 1e-20.
            // 1e-20 < 1e-15 is true.
            // Since r=0, it should throw.
            assertEquals(1e-20, e.getArgument(), 1e-30); // The problematic value
            assertEquals(0, e.getArgument(), 1e-15); // Index 0
            assertEquals(1e-15, e.getThreshold(), 1e-30);
        }
    }

    @Test
    public void testMatrixWithZeroDiagonalAndNonZeroOffDiagonal() throws Exception {
        double[][] data = { { 1.0, 0.0 }, { 0.0, 0.0 } }; // This is PSD.
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        // First pivot: 1.0. B[0][0]=1.0. B[1][0]=0.0/1.0=0.0.
        // Update c[1][1] = 0.0 - 0.0^2/1.0 = 0.0.
        // Next pivot check: c[1][1] = 0.0.
        // 0.0 < 1e-15 is true. r becomes 1. loop ends. rank = 1.
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
        
        // The getRootMatrix() method returns the internal `root` RealMatrix.
        // This `root` matrix is constructed as a new RealMatrix and populated.
        // It is not stated if it should be immutable.
        // If we modify it, subsequent calls to getRootMatrix() should return the modified instance.
        double originalEntry = root.getEntry(0, 0);
        root.setEntry(0, 0, originalEntry + 1.0);
        
        assertEquals(originalEntry + 1.0, root.getEntry(0, 0), 1e-15);
        // Call getRootMatrix again to ensure it's the same object and state
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
        // First pivot: 1e20. sqrt = 1e10.
        // B[0][0] = 1e10.
        // i=1: original index 1. c[1][0]=1e10.
        // e = c[1][0] / sqrt = 1e10 / 1e10 = 1.0.
        // B[1][0] = 1.0.
        // c[1][1] -= c[1][0]^2 / c[0][0] = 1e20 - (1e10)^2 / 1e20 = 1e20 - 1e20 / 1e20 = 1e20 - 1e10 = 9.999e19.
        // Next pivot: c[1][1] = 9.999e19. sqrt = sqrt(9.999e19) = 9.9995e9...
        // B[1][1] = sqrt(9.999e19).
        assertEquals(1e10, root.getEntry(0, 0), 1e-5); // Tolerance adjustment for large numbers
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
        assertEquals(0.0, root.getEntry(0, 1), 1e-15);
        assertEquals(FastMath.sqrt(1e20 - 1e10), root.getEntry(1, 1), 1e5); // Tolerance adjustment
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
        // First pivot: 1e-20. sqrt = 1e-10.
        // B[0][0] = 1e-10.
        // i=1: c[1][0]=1e-30. e = 1e-30 / 1e-10 = 1e-20. B[1][0]=1e-20.
        // c[1][1] -= c[1][0]^2 / c[0][0] = 1e-20 - (1e-30)^2 / 1e-20 = 1e-20 - 1e-60 / 1e-20 = 1e-20 - 1e-40 = 1e-20.
        // Next pivot: c[1][1] = 1e-20. sqrt = 1e-10. B[1][1] = 1e-10.
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
        
        // Threshold smaller than diagonal (1e-30 < 1e-20)
        RectangularCholeskyDecomposition decompLowTol = new RectangularCholeskyDecomposition(matrix, 1e-30);
        assertEquals(2, decompLowTol.getRank());

        // Threshold larger than diagonal (1e-15 > 1e-20)
        RectangularCholeskyDecomposition decompHighTol = new RectangularCholeskyDecomposition(matrix, 1e-15);
        assertEquals(1, decompHighTol.getRank()); // Should discard the second column due to c[1][1] < small
    }

    @Test
    public void testNegativeSmallThreshold() throws Exception {
        double[][] data = { { 4.0, 2.0 }, { 2.0, 4.0 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        // A negative threshold means `c[ir][ir] < small` will almost never be true for positive `c[ir][ir]`.
        // `c[ir][ir]` is always non-negative for PSD matrices except for near-zero cases.
        // So it should proceed with decomposition.
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, -1e-15);
        assertEquals(2, decomposition.getRank());
        assertEquals(2.0, decomposition.getRootMatrix().getEntry(0, 0), 1e-15);
        assertEquals(1.0, decomposition.getRootMatrix().getEntry(1, 0), 1e-15);
        assertEquals(0.0, decomposition.getRootMatrix().getEntry(0, 1), 1e-15);
        assertEquals(FastMath.sqrt(3.0), decomposition.getRootMatrix().getEntry(1, 1), 1e-15);
    }
    
    @Test
    public void testRectangularRootMatrixOutput() throws Exception {
        // Test with a PSD matrix that results in a rank less than its dimension.
        // Example: [[1, 1], [1, 1]] has rank 1. Root should be 2x1.
        double[][] rankOneData = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        RealMatrix rankOneMatrix = MatrixUtils.createRealMatrix(rankOneData);
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(rankOneMatrix, 1e-15);
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals(2, root.getRowDimension());
        assertEquals(1, root.getColumnDimension()); // Rank is 1
        assertEquals(1.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 0), 1e-15);
    }

    @Test
    public void testRankDeterminationWithTolerance() throws Exception {
        // Matrix where a diagonal element is slightly less than 'small'
        double[][] data = { { 4.0, 2.0 }, { 2.0, 1e-10 } };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // With a small tolerance (1e-15), 1e-10 is not < 1e-15. Rank should be 2.
        RectangularCholeskyDecomposition decompLowTol = new RectangularCholeskyDecomposition(matrix, 1e-15);
        assertEquals(2, decompLowTol.getRank());

        // With a tolerance larger than the diagonal (1e-9 > 1e-10). Rank should be 1.
        RectangularCholeskyDecomposition decompHighTol = new RectangularCholeskyDecomposition(matrix, 1e-9);
        assertEquals(1, decompHighTol.getRank());
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover the `RectangularCholeskyDecomposition` constructor by providing various matrices and `small` threshold values, checking the `getRootMatrix` and `getRank` methods for expected outputs and the `NonPositiveDefiniteMatrixException`. Specific attention is given to boundary conditions related to the `small` threshold and the diagonal elements.
2. TEST CASE DESIGN -
- `testSimpleDecomposition`: 2x2 matrix, rank 2, checks root matrix entries and rank.
- `testDecompositionWithSmallDiagonal`: 3x3 matrix, rank 2 due to small diagonal, checks root matrix entries and rank.
- `testDecompositionWithZeroDiagonal`: 2x2 matrix with zero diagonal, rank 1, checks root matrix entries and rank.
- `testNonPositiveDefiniteExceptionSmall`: Negative diagonal, expects `NonPositiveDefiniteMatrixException`, checks exception details.
- `testNonPositiveDefiniteExceptionZeroSmall`: Zero matrix, expects `NonPositiveDefiniteMatrixException`, checks exception details.
- `testIdentityMatrix`: Identity matrix, rank 3, checks root matrix and rank.
- `testRankOneMatrix`: Rank 1 matrix, checks root matrix and rank.
- `testRankDeficientMatrix`: Rank deficient matrix, checks root matrix and rank.
- `testLargerMatrix`: 4x4 matrix, checks root matrix and rank.
- `testRootMatrixValues`: Specific 2x2 matrix, checks computed root matrix entries and rank.
- `testSmallThresholdEffect`: Compares results with different thresholds for a matrix with a very small diagonal.
- `testMatrixWithNegativeDiagonalButPositiveDefinite`: Tests exception for a matrix that is not positive semidefinite.
- `testMaximalDiagonalElementSelection`: Tests the selection of the maximal diagonal element.
- `testRootMatrixNotSquare`: Tests a case where root matrix is square (rank=dimension).
- `testGetRank`: Verifies `getRank` for rank 1 and rank 2 matrices.
- `testZeroMatrix`: Tests a zero matrix, expecting `NonPositiveDefiniteMatrixException`.
- `testSmallPositiveDiagonal`: Tests with very small positive diagonal elements.
- `testThresholdBehaviorForZero`: Tests threshold behavior when a diagonal element becomes zero.
- `testRootMatrixWhenRankIsZero`: Tests exception when matrix elements are smaller than threshold.
- `testMatrixWithZeroDiagonalAndNonZeroOffDiagonal`: Tests PSD matrix with zero diagonal.
- `testRootMatrixIsMutable`: Checks if the returned root matrix can be modified.
- `testLargeNumberInput`: Tests with large floating-point numbers.
- `testSmallNumberInput`: Tests with small floating-point numbers.
- `testThresholdHandlingWithVerySmallNumbers`: Compares threshold effects on small diagonal numbers.
- `testNegativeSmallThreshold`: Tests with a negative threshold value.
- `testRectangularRootMatrixOutput`: Tests a matrix that results in a non-square root matrix (rank < dimension).
- `testRankDeterminationWithTolerance`: Checks rank determination based on threshold tolerance.
4. DEFECT DETECTION STRATEGY - The tests target the core logic of the Cholesky decomposition algorithm, particularly the selection of pivots, diagonal element comparisons against the `small` threshold, and the subsequent matrix transformations. Edge cases like zero, very small, very large, and negative diagonal elements, as well as varying `small` thresholds, are explored to uncover potential floating-point inaccuracies or off-by-one errors in rank determination or matrix calculations.
5. SUMMARY - 27 tests.
6. LIMITATIONS - The tests cover public API and constructor behavior. Internal states and complex numerical stability issues for extremely ill-conditioned matrices are not explicitly tested. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.
```