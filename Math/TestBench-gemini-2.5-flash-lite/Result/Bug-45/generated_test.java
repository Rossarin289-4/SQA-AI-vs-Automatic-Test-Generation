package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;

public class OpenMapRealMatrixTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorBasic() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 4);
        assertEquals(3, matrix.getRowDimension());
        assertEquals(4, matrix.getColumnDimension());
    }

    @Test
    public void testConstructorLargeDimensions() {
        try {
            new OpenMapRealMatrix(Integer.MAX_VALUE, Integer.MAX_VALUE);
            fail("Expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException e) {
            // The constructor checks for lRow * lCol >= Integer.MAX_VALUE.
            // For Integer.MAX_VALUE * Integer.MAX_VALUE, this condition is true.
            // The specific value of wrong is not directly accessible, but the check is against MAX_VALUE.
            assertEquals(Integer.MAX_VALUE, e.getMax());
        }
    }

    @Test
    public void testConstructorCopy() {
        OpenMapRealMatrix original = new OpenMapRealMatrix(2, 2);
        original.setEntry(0, 0, 1.0);
        original.setEntry(1, 1, 2.0);
        OpenMapRealMatrix copy = new OpenMapRealMatrix(original);
        assertEquals(2, copy.getRowDimension());
        assertEquals(2, copy.getColumnDimension());
        assertEquals(1.0, copy.getEntry(0, 0), 1e-9);
        assertEquals(2.0, copy.getEntry(1, 1), 1e-9);
        // Ensure it's a deep copy
        copy.setEntry(0, 0, 3.0);
        assertEquals(3.0, copy.getEntry(0, 0), 1e-9);
        assertEquals(1.0, original.getEntry(0, 0), 1e-9);
    }

    @Test
    public void testCopy() {
        OpenMapRealMatrix original = new OpenMapRealMatrix(2, 2);
        original.setEntry(0, 0, 1.0);
        original.setEntry(1, 1, 2.0);
        OpenMapRealMatrix copy = original.copy();
        assertEquals(2, copy.getRowDimension());
        assertEquals(2, copy.getColumnDimension());
        assertEquals(1.0, copy.getEntry(0, 0), 1e-9);
        assertEquals(2.0, copy.getEntry(1, 1), 1e-9);
        // Ensure it's a deep copy
        copy.setEntry(0, 0, 3.0);
        assertEquals(3.0, copy.getEntry(0, 0), 1e-9);
        assertEquals(1.0, original.getEntry(0, 0), 1e-9);
    }

    @Test
    public void testCreateMatrix() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        RealMatrix newMatrix = matrix.createMatrix(2, 2);
        assertTrue(newMatrix instanceof OpenMapRealMatrix);
        assertEquals(2, newMatrix.getRowDimension());
        assertEquals(2, newMatrix.getColumnDimension());
    }

    @Test
    public void testGetColumnDimension() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(5, 10);
        assertEquals(10, matrix.getColumnDimension());
    }

    @Test
    public void testGetRowDimension() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(7, 3);
        assertEquals(7, matrix.getRowDimension());
    }

    @Test
    public void testGetEntryBasic() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(0, 1, 5.5);
        assertEquals(0.0, matrix.getEntry(0, 0), 1e-9);
        assertEquals(5.5, matrix.getEntry(0, 1), 1e-9);
        assertEquals(0.0, matrix.getEntry(1, 0), 1e-9);
        assertEquals(0.0, matrix.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testGetEntryOutOfBound() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        try {
            matrix.getEntry(2, 0);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
        try {
            matrix.getEntry(0, 2);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
    }

    @Test
    public void testSetEntryBasic() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(1, 0, -3.14);
        assertEquals(-3.14, matrix.getEntry(1, 0), 1e-9);
    }

    @Test
    public void testSetEntryToZero() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(0, 0, 1.0);
        assertEquals(1.0, matrix.getEntry(0, 0), 1e-9);
        matrix.setEntry(0, 0, 0.0);
        assertEquals(0.0, matrix.getEntry(0, 0), 1e-9);
        // Internally, the entry should be removed from the map.
        // This is hard to test directly without accessing private members,
        // but setting to zero and then verifying getEntry returns 0.0 is sufficient.
    }

    @Test
    public void testSetEntryOutOfBound() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        try {
            matrix.setEntry(2, 0, 1.0);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
        try {
            matrix.setEntry(0, 2, 1.0);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
    }

    @Test
    public void testAddToEntryBasic() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(0, 0, 1.0);
        matrix.addToEntry(0, 0, 2.5);
        assertEquals(3.5, matrix.getEntry(0, 0), 1e-9);
    }

    @Test
    public void testAddToEntryToZero() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(0, 0, 1.0);
        matrix.addToEntry(0, 0, -1.0);
        assertEquals(0.0, matrix.getEntry(0, 0), 1e-9);
    }

    @Test
    public void testAddToEntryNonExistent() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.addToEntry(1, 1, 5.0);
        assertEquals(5.0, matrix.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testAddToEntryOutOfBound() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        try {
            matrix.addToEntry(2, 0, 1.0);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
        try {
            matrix.addToEntry(0, 2, 1.0);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
    }

    @Test
    public void testMultiplyEntryBasic() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(0, 0, 4.0);
        matrix.multiplyEntry(0, 0, 0.5);
        assertEquals(2.0, matrix.getEntry(0, 0), 1e-9);
    }

    @Test
    public void testMultiplyEntryToZero() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(0, 0, 4.0);
        matrix.multiplyEntry(0, 0, 0.0);
        assertEquals(0.0, matrix.getEntry(0, 0), 1e-9);
    }

    @Test
    public void testMultiplyEntryNonExistent() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.multiplyEntry(1, 1, 5.0); // Multiplying a non-existent (zero) entry by 5.0 should result in 0.0
        assertEquals(0.0, matrix.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMultiplyEntryOutOfBound() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        try {
            matrix.multiplyEntry(2, 0, 1.0);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
        try {
            matrix.multiplyEntry(0, 2, 1.0);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
    }

    @Test
    public void testAddBasic() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 1.0);
        m1.setEntry(1, 1, 2.0);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m2.setEntry(0, 1, 3.0);
        m2.setEntry(1, 0, 4.0);

        OpenMapRealMatrix result = m1.add(m2);
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(3.0, result.getEntry(0, 1), 1e-9);
        assertEquals(4.0, result.getEntry(1, 0), 1e-9);
        assertEquals(2.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testAddZeroMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 1.0);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2); // zero matrix
        OpenMapRealMatrix result = m1.add(m2);
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(0.0, result.getEntry(0, 1), 1e-9);
    }

    @Test
    public void testAddDimensionMismatch() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(3, 2);
        try {
            m1.add(m2);
            fail("Expected DimensionMismatchException");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected
            // The exception message indicates the dimensions that were compared.
            // For 2x2 add 3x2, the check is for rows: 2 != 3.
            // The error message from MatrixUtils.checkAdditionCompatible is typically:
            // "matrix dimensions mismatch. Got {0}x{1} but expected {2}x{3}"
            // Since we cannot directly access the exception message content easily or reliably,
            // we focus on catching the correct exception type.
        }
    }

    @Test
    public void testSubtractBasic() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 5.0);
        m1.setEntry(1, 1, 6.0);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m2.setEntry(0, 1, 3.0);
        m2.setEntry(1, 0, 4.0);

        OpenMapRealMatrix result = m1.subtract(m2);
        assertEquals(5.0, result.getEntry(0, 0), 1e-9);
        assertEquals(-3.0, result.getEntry(0, 1), 1e-9);
        assertEquals(-4.0, result.getEntry(1, 0), 1e-9);
        assertEquals(6.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testSubtractZeroMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 1.0);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2); // zero matrix
        OpenMapRealMatrix result = m1.subtract(m2);
        assertEquals(1.0, result.getEntry(0, 0), 1e-9);
        assertEquals(0.0, result.getEntry(0, 1), 1e-9);
    }

    @Test
    public void testSubtractDimensionMismatch() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 3);
        try {
            m1.subtract(m2);
            fail("Expected DimensionMismatchException");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected
            // For 2x2 subtract 2x3, the check is for columns: 2 != 3.
        }
    }

    @Test
    public void testMultiplyBasic() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 1.0);
        m1.setEntry(0, 1, 2.0);
        m1.setEntry(1, 0, 3.0);
        m1.setEntry(1, 1, 4.0);

        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m2.setEntry(0, 0, 5.0);
        m2.setEntry(0, 1, 6.0);
        m2.setEntry(1, 0, 7.0);
        m2.setEntry(1, 1, 8.0);

        OpenMapRealMatrix result = m1.multiply(m2);
        // (1*5 + 2*7) = 19, (1*6 + 2*8) = 22
        // (3*5 + 4*7) = 43, (3*6 + 4*8) = 50
        assertEquals(19.0, result.getEntry(0, 0), 1e-9);
        assertEquals(22.0, result.getEntry(0, 1), 1e-9);
        assertEquals(43.0, result.getEntry(1, 0), 1e-9);
        assertEquals(50.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMultiplyWithZeroMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 1.0);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2); // zero matrix
        OpenMapRealMatrix result = m1.multiply(m2);
        assertEquals(0.0, result.getEntry(0, 0), 1e-9);
        assertEquals(0.0, result.getEntry(0, 1), 1e-9);
        assertEquals(0.0, result.getEntry(1, 0), 1e-9);
        assertEquals(0.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMultiplyNonSquare() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 3);
        m1.setEntry(0, 0, 1.0); m1.setEntry(0, 1, 2.0); m1.setEntry(0, 2, 3.0);
        m1.setEntry(1, 0, 4.0); m1.setEntry(1, 1, 5.0); m1.setEntry(1, 2, 6.0);

        OpenMapRealMatrix m2 = new OpenMapRealMatrix(3, 2);
        m2.setEntry(0, 0, 7.0); m2.setEntry(0, 1, 8.0);
        m2.setEntry(1, 0, 9.0); m2.setEntry(1, 1, 10.0);
        m2.setEntry(2, 0, 11.0); m2.setEntry(2, 1, 12.0);

        OpenMapRealMatrix result = m1.multiply(m2);
        // (1*7 + 2*9 + 3*11) = 7 + 18 + 33 = 58
        // (1*8 + 2*10 + 3*12) = 8 + 20 + 36 = 64
        // (4*7 + 5*9 + 6*11) = 28 + 45 + 66 = 139
        // (4*8 + 5*10 + 6*12) = 32 + 50 + 72 = 154
        assertEquals(58.0, result.getEntry(0, 0), 1e-9);
        assertEquals(64.0, result.getEntry(0, 1), 1e-9);
        assertEquals(139.0, result.getEntry(1, 0), 1e-9);
        assertEquals(154.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMultiplyDimensionMismatch() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(3, 2);
        try {
            m1.multiply(m2);
            fail("Expected MatrixDimensionMismatchException");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected
            // For 2x2 multiply 3x2, the check is for columns of m1 vs rows of m2: 2 != 3.
        }
    }

    @Test
    public void testMultiplyWithDifferentSparseStructure() {
        // This test case was failing in the previous submission.
        // The original expectation was that result.getEntry(0,0) should be 0.0.
        // Let's trace the multiplication:
        // m1 = [[2.0, 0.0], [0.0, 0.0]] (rows=2, cols=2)
        // m2 = [[0.0, 0.0], [0.0, 3.0]] (rows=2, cols=2)
        // result[0][0] = m1[0][0]*m2[0][0] + m1[0][1]*m2[1][0] = 2.0*0.0 + 0.0*0.0 = 0.0
        // result[0][1] = m1[0][0]*m2[0][1] + m1[0][1]*m2[1][1] = 2.0*0.0 + 0.0*3.0 = 0.0
        // result[1][0] = m1[1][0]*m2[0][0] + m1[1][1]*m2[1][0] = 0.0*0.0 + 0.0*0.0 = 0.0
        // result[1][1] = m1[1][0]*m2[0][1] + m1[1][1]*m2[1][1] = 0.0*0.0 + 0.0*3.0 = 0.0
        // The expected result for multiply(OpenMapRealMatrix) is indeed a zero matrix in this case.
        // The previous assertion was assertEquals(6.0, result.getEntry(1, 1), 1e-9); which was correct.
        // The error was in expecting 0.0 for entry (1,1). Let's re-evaluate the trace for result.getEntry(1,1):
        // result[1][1] = m1[1][0] * m2[0][1] + m1[1][1] * m2[1][1]
        // m1 has entry at (0,0) with value 2.0.
        // m2 has entry at (1,1) with value 3.0.
        // The calculation for `result.getEntry(1,1)` is `getEntry(1, 0) * m2.getEntry(0, 1) + getEntry(1, 1) * m2.getEntry(1, 1)`.
        // `getEntry(1, 0)` is 0.0. `m2.getEntry(0, 1)` is 0.0.
        // `getEntry(1, 1)` is 0.0. `m2.getEntry(1, 1)` is 3.0.
        // So, `0.0 * 0.0 + 0.0 * 3.0 = 0.0`.
        //
        // The `multiply(OpenMapRealMatrix m)` method iterates through `entries` of `this` matrix (m1).
        // For m1, only `entries.containsKey(computeKey(0,0))` is true.
        // So, the outer loop runs for `iterator.key() = 0` (which maps to row 0, col 0).
        // `i = 0`, `k = 0`.
        // Inner loop `for (int j = 0; j < outCols; ++j)` (outCols = 2)
        // j = 0: `rightKey = m.computeKey(k, j)` -> `m.computeKey(0, 0)`. `m.entries.containsKey(rightKey)` is false.
        // j = 1: `rightKey = m.computeKey(k, j)` -> `m.computeKey(0, 1)`. `m.entries.containsKey(rightKey)` is false.
        //
        // This means the logic inside the inner loop for `m.entries.containsKey(rightKey)` is never entered for this specific m1.
        // The method `OpenMapRealMatrix.multiply(OpenMapRealMatrix m)` iterates over the non-zero entries of `this` matrix (`entries`).
        // For each non-zero entry `(i, k)` in `this` matrix, it iterates over the columns `j` of `m`.
        // It computes the `rightKey = m.computeKey(k, j)`. If `m.entries.containsKey(rightKey)`, it updates the output matrix.
        //
        // In this specific case:
        // m1: only entry at (0,0) is 2.0. So `i=0, k=0`.
        // m2: only entry at (1,1) is 3.0.
        //
        // When `i=0, k=0`:
        //   j=0: `rightKey = m2.computeKey(0,0)`. `m2.entries.containsKey(rightKey)` is false.
        //   j=1: `rightKey = m2.computeKey(0,1)`. `m2.entries.containsKey(rightKey)` is false.
        //
        // This implies that the multiplication `m1 * m2` where `m1 = [[2,0],[0,0]]` and `m2 = [[0,0],[0,3]]`
        // should result in a zero matrix because the loop that updates `out.entries` is never entered.
        //
        // Let's re-examine the original failure: `testMultiplyWithDifferentSparseStructure: java.lang.AssertionError: expected:<6.0> but was:<0.0>`
        // This means the test was expecting 6.0, but got 0.0. The previous correction tried to make it pass 0.0.
        //
        // The implementation of `multiply(OpenMapRealMatrix m)`:
        // for (OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext();) { // iterates through m1's entries
        //     iterator.advance();
        //     final double value = iterator.value(); // value from m1
        //     final int key      = iterator.key();
        //     final int i        = key / columns; // row of m1
        //     final int k        = key % columns; // col of m1
        //     for (int j = 0; j < outCols; ++j) { // iterate through columns of m2
        //         final int rightKey = m.computeKey(k, j); // compute key in m2
        //         if (m.entries.containsKey(rightKey)) { // if m2 has entry at (k,j)
        //             // ... update output matrix ...
        //         }
        //     }
        // }
        //
        // With m1 = [[2.0, 0.0], [0.0, 0.0]] (rows=2, cols=2)
        // With m2 = [[0.0, 0.0], [0.0, 3.0]] (rows=2, cols=2)
        //
        // `entries` of `m1` has only one element: key=computeKey(0,0)=0, value=2.0.
        // The iterator yields i=0, k=0.
        // The inner loop: `for (int j = 0; j < 2; ++j)`
        //   `j = 0`: `rightKey = m2.computeKey(0, 0)`. `m2.entries.containsKey(rightKey)` is false.
        //   `j = 1`: `rightKey = m2.computeKey(0, 1)`. `m2.entries.containsKey(rightKey)` is false.
        //
        // So, the `if (m.entries.containsKey(rightKey))` condition is never met.
        // The `out.entries` is never modified. Since `out` is initialized as `new OpenMapRealMatrix(rows, outCols)`,
        // all its entries are implicitly 0.0.
        //
        // Therefore, `result.getEntry(1,1)` is indeed 0.0.
        // The previous failure message was `expected:<6.0> but was:<0.0>`.
        // This means the test was expecting 6.0, but the code produced 0.0.
        //
        // Let's re-read the `multiply` method carefully.
        // It uses `getEntry(row, col)` for `m` when `m` is not `OpenMapRealMatrix`.
        // But when `m` IS `OpenMapRealMatrix`, it directly accesses `m.entries.get(rightKey)`.
        //
        // `public OpenMapRealMatrix multiply(OpenMapRealMatrix m)`
        // Inside:
        // `final int rightKey = m.computeKey(k, j);`
        // `if (m.entries.containsKey(rightKey)) {`
        //   `final int outKey = out.computeKey(i, j);`
        //   `final double outValue = out.entries.get(outKey) + value * m.entries.get(rightKey);`
        //   `if (outValue == 0.0) { out.entries.remove(outKey); } else { out.entries.put(outKey, outValue); }`
        // `}`
        //
        // This logic seems correct for sparse multiplication.
        // For the given inputs:
        // m1 (this): (0,0)=2.0
        // m2 (m): (1,1)=3.0
        //
        // The outer loop for m1 iterates with i=0, k=0.
        // The inner loop for j iterates:
        // j=0: rightKey = m2.computeKey(0,0) = 0. m2.entries does NOT contain 0.
        // j=1: rightKey = m2.computeKey(0,1) = 1. m2.entries does NOT contain 1.
        //
        // So no entry is ever added to `out`. `out` remains a zero matrix.
        // `result.getEntry(1,1)` must be 0.0.
        //
        // The previous error `expected:<6.0> but was:<0.0>` indicates the test was wrong.
        // The code produced 0.0, which is correct for this multiplication.
        // The test should expect 0.0.
        //
        // Let's redefine m1 and m2 to make the expected result non-zero.
        // m1 = [[0, 2], [0, 0]] (rows=2, cols=2)
        // m2 = [[0, 0], [3, 0]] (rows=2, cols=2)
        // Result = m1 * m2
        // result[0][0] = m1[0][0]*m2[0][0] + m1[0][1]*m2[1][0] = 0*0 + 2*3 = 6.0
        // result[0][1] = m1[0][0]*m2[0][1] + m1[0][1]*m2[1][1] = 0*0 + 2*0 = 0.0
        // result[1][0] = m1[1][0]*m2[0][0] + m1[1][1]*m2[1][0] = 0*0 + 0*3 = 0.0
        // result[1][1] = m1[1][0]*m2[0][1] + m1[1][1]*m2[1][1] = 0*0 + 0*0 = 0.0
        // Expected result: [[6.0, 0.0], [0.0, 0.0]]
        //
        // Let's adjust the test to match this.
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 1, 2.0); // m1 = [[0, 2], [0, 0]]

        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m2.setEntry(1, 0, 3.0); // m2 = [[0, 0], [3, 0]]

        OpenMapRealMatrix result = m1.multiply(m2);
        // Expected: result[0][0] = 0*0 + 2*3 = 6.0
        // Expected: result[0][1] = 0*0 + 2*0 = 0.0
        // Expected: result[1][0] = 0*0 + 0*3 = 0.0
        // Expected: result[1][1] = 0*0 + 0*0 = 0.0
        assertEquals(6.0, result.getEntry(0, 0), 1e-9);
        assertEquals(0.0, result.getEntry(0, 1), 1e-9);
        assertEquals(0.0, result.getEntry(1, 0), 1e-9);
        assertEquals(0.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testMultiplyWithNonOpenMapRealMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 1.0);
        m1.setEntry(1, 1, 1.0);

        // Using BlockRealMatrix for testing the multiply(RealMatrix m) overload
        BlockRealMatrix m2 = new BlockRealMatrix(2, 2);
        m2.setEntry(0, 1, 2.0);
        m2.setEntry(1, 0, 3.0);

        RealMatrix result = m1.multiply(m2); // Calls the RealMatrix overload
        // m1 = [[1.0, 0.0], [0.0, 1.0]]
        // m2 = [[0.0, 2.0], [3.0, 0.0]]
        // result[0][0] = 1*0 + 0*3 = 0.0
        // result[0][1] = 1*2 + 0*0 = 2.0
        // result[1][0] = 0*0 + 1*3 = 3.0
        // result[1][1] = 0*2 + 1*0 = 0.0
        assertEquals(0.0, result.getEntry(0, 0), 1e-9);
        assertEquals(2.0, result.getEntry(0, 1), 1e-9);
        assertEquals(3.0, result.getEntry(1, 0), 1e-9);
        assertEquals(0.0, result.getEntry(1, 1), 1e-9);
    }
}
