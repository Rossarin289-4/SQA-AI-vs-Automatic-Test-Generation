package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;

public class OpenMapRealMatrixTest {
    @Test
    public void testDimensions() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 3);
        assertEquals(2, matrix.getRowDimension());
        assertEquals(3, matrix.getColumnDimension());
    }

    @Test
    public void testGetMissingEntry() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 3);
        assertEquals(0.0, matrix.getEntry(1, 2), 0.0);
    }

    @Test
    public void testSetAndGetEntryAtFirstCell() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 3);
        matrix.setEntry(0, 0, 7.5);
        assertEquals(7.5, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testSetAndGetEntryAtLastCell() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 3);
        matrix.setEntry(1, 2, -4.0);
        assertEquals(-4.0, matrix.getEntry(1, 2), 0.0);
    }

    @Test
    public void testSettingZeroRemovesEntry() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(0, 1, 5.0);
        matrix.setEntry(0, 1, 0.0);
        assertEquals(0.0, matrix.getEntry(0, 1), 0.0);
    }

    @Test
    public void testSettingNegativeZeroRemovesEntry() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(1, 1);
        matrix.setEntry(0, 0, 6.0);
        matrix.setEntry(0, 0, -0.0);
        assertEquals(0.0, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testAddToEntry() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(1, 0, 3.0);
        matrix.addToEntry(1, 0, 4.5);
        assertEquals(7.5, matrix.getEntry(1, 0), 0.0);
    }

    @Test
    public void testAddToEntryCreatesValue() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(1, 1);
        matrix.addToEntry(0, 0, -2.0);
        assertEquals(-2.0, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testAddToEntryZeroRemovesValue() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(1, 1);
        matrix.setEntry(0, 0, 8.0);
        matrix.addToEntry(0, 0, -8.0);
        assertEquals(0.0, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testMultiplyEntry() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(1, 1, 3.0);
        matrix.multiplyEntry(1, 1, -2.0);
        assertEquals(-6.0, matrix.getEntry(1, 1), 0.0);
    }

    @Test
    public void testMultiplyEntryByZeroRemovesValue() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(1, 1);
        matrix.setEntry(0, 0, 9.0);
        matrix.multiplyEntry(0, 0, 0.0);
        assertEquals(0.0, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testMultiplyEntryOnMissingValue() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(1, 1);
        matrix.multiplyEntry(0, 0, 3.0);
        assertEquals(0.0, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testCopyPreservesValuesAndIsIndependent() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(0, 1, 5.0);
        OpenMapRealMatrix copy = matrix.copy();
        matrix.setEntry(0, 1, 7.0);
        assertEquals(5.0, copy.getEntry(0, 1), 0.0);
        assertEquals(7.0, matrix.getEntry(0, 1), 0.0);
    }

    @Test
    public void testCreateMatrixDimensionsAndEmptyEntries() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(1, 1);
        OpenMapRealMatrix created = matrix.createMatrix(2, 3);
        assertEquals(2, created.getRowDimension());
        assertEquals(3, created.getColumnDimension());
        assertEquals(0.0, created.getEntry(1, 2), 0.0);
    }

    @Test
    public void testAddCombinesSparseValues() throws Exception {
        OpenMapRealMatrix left = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix right = new OpenMapRealMatrix(2, 2);
        left.setEntry(0, 0, 2.0);
        left.setEntry(1, 1, 4.0);
        right.setEntry(0, 0, 3.0);
        right.setEntry(0, 1, 6.0);
        OpenMapRealMatrix sum = left.add(right);
        assertEquals(5.0, sum.getEntry(0, 0), 0.0);
        assertEquals(6.0, sum.getEntry(0, 1), 0.0);
        assertEquals(4.0, sum.getEntry(1, 1), 0.0);
    }

    @Test
    public void testAddDoesNotModifyOperands() throws Exception {
        OpenMapRealMatrix left = new OpenMapRealMatrix(1, 2);
        OpenMapRealMatrix right = new OpenMapRealMatrix(1, 2);
        left.setEntry(0, 0, 2.0);
        right.setEntry(0, 1, 3.0);
        OpenMapRealMatrix sum = left.add(right);
        assertEquals(2.0, left.getEntry(0, 0), 0.0);
        assertEquals(0.0, left.getEntry(0, 1), 0.0);
        assertEquals(3.0, sum.getEntry(0, 1), 0.0);
    }

    @Test
    public void testSubtractSparseMatrix() throws Exception {
        OpenMapRealMatrix left = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix right = new OpenMapRealMatrix(2, 2);
        left.setEntry(0, 0, 8.0);
        left.setEntry(1, 1, 3.0);
        right.setEntry(0, 0, 5.0);
        right.setEntry(0, 1, 2.0);
        OpenMapRealMatrix difference = left.subtract(right);
        assertEquals(3.0, difference.getEntry(0, 0), 0.0);
        assertEquals(-2.0, difference.getEntry(0, 1), 0.0);
        assertEquals(3.0, difference.getEntry(1, 1), 0.0);
    }

    @Test
    public void testSubtractDenseMatrix() throws Exception {
        OpenMapRealMatrix left = new OpenMapRealMatrix(1, 2);
        left.setEntry(0, 0, 6.0);
        RealMatrix right = new BlockRealMatrix(new double[][] {{2.0, 4.0}});
        RealMatrix difference = left.subtract(right);
        assertEquals(4.0, difference.getEntry(0, 0), 0.0);
        assertEquals(-4.0, difference.getEntry(0, 1), 0.0);
    }

    @Test
    public void testMultiplySparseMatrices() throws Exception {
        OpenMapRealMatrix left = new OpenMapRealMatrix(2, 3);
        OpenMapRealMatrix right = new OpenMapRealMatrix(3, 2);
        left.setEntry(0, 0, 2.0);
        left.setEntry(0, 2, 3.0);
        left.setEntry(1, 1, 4.0);
        right.setEntry(0, 1, 5.0);
        right.setEntry(1, 0, 6.0);
        right.setEntry(2, 1, 7.0);
        RealMatrix product = left.multiply(right);
        assertEquals(2, product.getRowDimension());
        assertEquals(2, product.getColumnDimension());
        assertEquals(0.0, product.getEntry(0, 0), 0.0);
        assertEquals(31.0, product.getEntry(0, 1), 0.0);
        assertEquals(24.0, product.getEntry(1, 0), 0.0);
        assertEquals(0.0, product.getEntry(1, 1), 0.0);
    }

    @Test
    public void testSparseProductCancelsToZero() throws Exception {
        OpenMapRealMatrix left = new OpenMapRealMatrix(1, 2);
        OpenMapRealMatrix right = new OpenMapRealMatrix(2, 1);
        left.setEntry(0, 0, 2.0);
        left.setEntry(0, 1, 2.0);
        right.setEntry(0, 0, 3.0);
        right.setEntry(1, 0, -3.0);
        RealMatrix product = left.multiply(right);
        assertEquals(0.0, product.getEntry(0, 0), 0.0);
    }

    @Test
    public void testMultiplyByDenseMatrix() throws Exception {
        OpenMapRealMatrix left = new OpenMapRealMatrix(2, 2);
        left.setEntry(0, 0, 2.0);
        left.setEntry(1, 1, 3.0);
        RealMatrix right = new BlockRealMatrix(new double[][] {{1.0, 4.0}, {5.0, 2.0}});
        RealMatrix product = left.multiply(right);
        assertEquals(2.0, product.getEntry(0, 0), 0.0);
        assertEquals(8.0, product.getEntry(0, 1), 0.0);
        assertEquals(15.0, product.getEntry(1, 0), 0.0);
        assertEquals(6.0, product.getEntry(1, 1), 0.0);
    }

    @Test
    public void testSingleCellSparseMultiplication() throws Exception {
        OpenMapRealMatrix left = new OpenMapRealMatrix(1, 1);
        OpenMapRealMatrix right = new OpenMapRealMatrix(1, 1);
        left.setEntry(0, 0, -3.0);
        right.setEntry(0, 0, 4.0);
        assertEquals(-12.0, left.multiply(right).getEntry(0, 0), 0.0);
    }

    @Test
    public void testConstructorAcceptsProductBelowIntegerLimit() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(46340, 46340);
        assertEquals(46340, matrix.getRowDimension());
        assertEquals(46340, matrix.getColumnDimension());
    }

    @Test
    public void testConstructorRejectsProductAtIntegerLimit() throws Exception {
        try {
            new OpenMapRealMatrix(46341, 46341);
            fail("expected NumberIsTooLargeException");
        } catch (NumberIsTooLargeException expected) {
            assertEquals(Integer.MAX_VALUE, expected.getMax().intValue());
            assertEquals(false, expected.getBoundIsAllowed());
        }
    }
}
