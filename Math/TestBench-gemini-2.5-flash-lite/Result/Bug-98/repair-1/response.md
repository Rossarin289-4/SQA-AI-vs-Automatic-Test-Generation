```java
package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.math.util.MathUtils;

public class BigMatrixImplTest {
    /**
     * Test constructor with no arguments.
     */
    @Test
    public void testConstructor() {
        BigMatrixImpl matrix = new BigMatrixImpl();
        assertNull(matrix.getDataRef());
    }

    /**
     * Test constructor with dimensions, creating an empty matrix.
     */
    @Test
    public void testConstructorDimensionsPositive() {
        int rows = 3;
        int cols = 4;
        BigMatrixImpl matrix = new BigMatrixImpl(rows, cols);
        assertEquals(rows, matrix.getRowDimension());
        assertEquals(cols, matrix.getColumnDimension());
        // Elements should be null if the matrix is newly created with dimensions only.
        // Accessing data[0][0] directly might be risky if data is null.
        // Let's check if data is initialized.
        assertNotNull(matrix.getDataRef());
        assertNotNull(matrix.getDataRef()[0]);
        assertNull(matrix.getDataRef()[0][0]);
    }

    /**
     * Test constructor with dimensions, ensuring it throws exception for non-positive dimensions.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDimensionsNonPositiveRows() {
        new BigMatrixImpl(0, 3);
    }

    /**
     * Test constructor with dimensions, ensuring it throws exception for non-positive dimensions.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDimensionsNonPositiveCols() {
        new BigMatrixImpl(3, 0);
    }

    /**
     * Test constructor with BigDecimal array, ensuring proper initialization and copy.
     */
    @Test
    public void testConstructorBigDecimalArray() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertEquals(2, matrix.getRowDimension());
        assertEquals(2, matrix.getColumnDimension());
        assertEquals(new BigDecimal("1"), matrix.getEntry(0, 0));
        assertEquals(new BigDecimal("4"), matrix.getEntry(1, 1));
        // Ensure it's a copy
        assertNotSame(data, matrix.getDataRef());
    }

    /**
     * Test constructor with BigDecimal array, ensuring it handles null input.
     */
    @Test(expected = NullPointerException.class)
    public void testConstructorBigDecimalArrayNull() {
        new BigMatrixImpl((BigDecimal[][]) null);
    }

    /**
     * Test constructor with BigDecimal array, ensuring it handles empty array.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorBigDecimalArrayEmpty() {
        new BigMatrixImpl(new BigDecimal[0][0]);
    }

    /**
     * Test constructor with BigDecimal array, ensuring it handles non-rectangular array.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorBigDecimalArrayNonRectangular() {
        BigDecimal[][] data = {{new BigDecimal("1")}, {new BigDecimal("3"), new BigDecimal("4")}};
        new BigMatrixImpl(data);
    }

    /**
     * Test constructor with double array, ensuring proper initialization and copy.
     */
    @Test
    public void testConstructorDoubleArray() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertEquals(2, matrix.getRowDimension());
        assertEquals(2, matrix.getColumnDimension());
        assertEquals(new BigDecimal("1.0"), matrix.getEntry(0, 0));
        assertEquals(new BigDecimal("4.0"), matrix.getEntry(1, 1));
        // Ensure it's a copy
        assertNotSame(data, matrix.getDataRef());
    }

    /**
     * Test constructor with double array, ensuring it handles non-rectangular array.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDoubleArrayNonRectangular() {
        double[][] data = {{1.0}, {3.0, 4.0}};
        new BigMatrixImpl(data);
    }

    /**
     * Test constructor with String array, ensuring proper initialization and copy.
     */
    @Test
    public void testConstructorStringArray() {
        String[][] data = {{"1", "2"}, {"3", "4"}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertEquals(2, matrix.getRowDimension());
        assertEquals(2, matrix.getColumnDimension());
        assertEquals(new BigDecimal("1"), matrix.getEntry(0, 0));
        assertEquals(new BigDecimal("4"), matrix.getEntry(1, 1));
        // Ensure it's a copy
        assertNotSame(data, matrix.getDataRef());
    }

    /**
     * Test constructor with String array, ensuring it handles non-rectangular array.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorStringArrayNonRectangular() {
        String[][] data = {{"1"}, {"3", "4"}};
        new BigMatrixImpl(data);
    }

    /**
     * Test constructor with BigDecimal array and copyArray flag set to false.
     */
    @Test
    public void testConstructorBigDecimalArrayNoCopy() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data, false);
        assertEquals(2, matrix.getRowDimension());
        assertEquals(2, matrix.getColumnDimension());
        assertEquals(new BigDecimal("1"), matrix.getEntry(0, 0));
        // Ensure it's a reference
        assertSame(data, matrix.getDataRef());
    }

    /**
     * Test constructor with BigDecimal array and copyArray flag set to false, ensuring null is handled.
     */
    @Test(expected = NullPointerException.class)
    public void testConstructorBigDecimalArrayNoCopyNull() {
        new BigMatrixImpl((BigDecimal[][]) null, false);
    }

    /**
     * Test constructor with BigDecimal array and copyArray flag set to false, ensuring empty is handled.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorBigDecimalArrayNoCopyEmpty() {
        new BigMatrixImpl(new BigDecimal[0][0], false);
    }

    /**
     * Test constructor with BigDecimal array and copyArray flag set to false, ensuring non-rectangular is handled.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorBigDecimalArrayNoCopyNonRectangular() {
        BigDecimal[][] data = {{new BigDecimal("1")}, {new BigDecimal("3"), new BigDecimal("4")}};
        new BigMatrixImpl(data, false);
    }

    /**
     * Test constructor with BigDecimal array for a single column vector.
     */
    @Test
    public void testConstructorBigDecimalArrayVector() {
        BigDecimal[] vec = {new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3")};
        BigMatrixImpl matrix = new BigMatrixImpl(vec);
        assertEquals(3, matrix.getRowDimension());
        assertEquals(1, matrix.getColumnDimension());
        assertEquals(new BigDecimal("1"), matrix.getEntry(0, 0));
        assertEquals(new BigDecimal("3"), matrix.getEntry(2, 0));
    }

    /**
     * Test copy method.
     */
    @Test
    public void testCopy() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigMatrix copy = matrix.copy();
        assertNotSame(matrix, copy);
        assertEquals(matrix, copy);
    }

    /**
     * Test add method with another BigMatrixImpl.
     */
    @Test
    public void testAddBigMatrixImpl() {
        BigDecimal[][] data1 = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigDecimal[][] data2 = {{new BigDecimal("5"), new BigDecimal("6")}, {new BigDecimal("7"), new BigDecimal("8")}};
        BigMatrixImpl m1 = new BigMatrixImpl(data1);
        BigMatrixImpl m2 = new BigMatrixImpl(data2);
        BigMatrix result = m1.add(m2);
        assertEquals(new BigDecimal("6"), result.getEntry(0, 0));
        assertEquals(new BigDecimal("10"), result.getEntry(1, 1));
    }

    /**
     * Test add method with a general BigMatrix.
     */
    @Test
    public void testAddBigMatrix() {
        BigDecimal[][] data1 = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigDecimal[][] data2 = {{new BigDecimal("5"), new BigDecimal("6")}, {new BigDecimal("7"), new BigDecimal("8")}};
        BigMatrixImpl m1 = new BigMatrixImpl(data1);
        BigMatrix m2 = new BigMatrixImpl(data2); // Using BigMatrixImpl as BigMatrix
        BigMatrix result = m1.add(m2);
        assertEquals(new BigDecimal("6"), result.getEntry(0, 0));
        assertEquals(new BigDecimal("10"), result.getEntry(1, 1));
    }

    /**
     * Test add method with mismatched dimensions.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddMismatchedDimensions() {
        BigDecimal[][] data1 = {{new BigDecimal("1"), new BigDecimal("2")}};
        BigDecimal[][] data2 = {{new BigDecimal("5")}, {new BigDecimal("7")}};
        BigMatrixImpl m1 = new BigMatrixImpl(data1);
        BigMatrixImpl m2 = new BigMatrixImpl(data2);
        m1.add(m2);
    }

    /**
     * Test subtract method with another BigMatrixImpl.
     */
    @Test
    public void testSubtractBigMatrixImpl() {
        BigDecimal[][] data1 = {{new BigDecimal("5"), new BigDecimal("6")}, {new BigDecimal("7"), new BigDecimal("8")}};
        BigDecimal[][] data2 = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl m1 = new BigMatrixImpl(data1);
        BigMatrixImpl m2 = new BigMatrixImpl(data2);
        BigMatrix result = m1.subtract(m2);
        assertEquals(new BigDecimal("4"), result.getEntry(0, 0));
        assertEquals(new BigDecimal("4"), result.getEntry(1, 1));
    }

    /**
     * Test subtract method with a general BigMatrix.
     */
    @Test
    public void testSubtractBigMatrix() {
        BigDecimal[][] data1 = {{new BigDecimal("5"), new BigDecimal("6")}, {new BigDecimal("7"), new BigDecimal("8")}};
        BigDecimal[][] data2 = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl m1 = new BigMatrixImpl(data1);
        BigMatrix m2 = new BigMatrixImpl(data2); // Using BigMatrixImpl as BigMatrix
        BigMatrix result = m1.subtract(m2);
        assertEquals(new BigDecimal("4"), result.getEntry(0, 0));
        assertEquals(new BigDecimal("4"), result.getEntry(1, 1));
    }

    /**
     * Test subtract method with mismatched dimensions.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtractMismatchedDimensions() {
        BigDecimal[][] data1 = {{new BigDecimal("1"), new BigDecimal("2")}};
        BigDecimal[][] data2 = {{new BigDecimal("5")}, {new BigDecimal("7")}};
        BigMatrixImpl m1 = new BigMatrixImpl(data1);
        BigMatrixImpl m2 = new BigMatrixImpl(data2);
        m1.subtract(m2);
    }

    /**
     * Test scalarAdd method.
     */
    @Test
    public void testScalarAdd() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigDecimal scalar = new BigDecimal("5");
        BigMatrix result = matrix.scalarAdd(scalar);
        assertEquals(new BigDecimal("6"), result.getEntry(0, 0));
        assertEquals(new BigDecimal("9"), result.getEntry(1, 1));
    }

    /**
     * Test scalarMultiply method.
     */
    @Test
    public void testScalarMultiply() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigDecimal scalar = new BigDecimal("5");
        BigMatrix result = matrix.scalarMultiply(scalar);
        assertEquals(new BigDecimal("5"), result.getEntry(0, 0));
        assertEquals(new BigDecimal("20"), result.getEntry(1, 1));
    }

    /**
     * Test multiply method with another BigMatrixImpl.
     */
    @Test
    public void testMultiplyBigMatrixImpl() {
        BigDecimal[][] data1 = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigDecimal[][] data2 = {{new BigDecimal("5"), new BigDecimal("6")}, {new BigDecimal("7"), new BigDecimal("8")}};
        BigMatrixImpl m1 = new BigMatrixImpl(data1);
        BigMatrixImpl m2 = new BigMatrixImpl(data2);
        BigMatrix result = m1.multiply(m2);
        assertEquals(new BigDecimal("19"), result.getEntry(0, 0)); // 1*5 + 2*7
        assertEquals(new BigDecimal("22"), result.getEntry(0, 1)); // 1*6 + 2*8
        assertEquals(new BigDecimal("43"), result.getEntry(1, 0)); // 3*5 + 4*7
        assertEquals(new BigDecimal("50"), result.getEntry(1, 1)); // 3*6 + 4*8
    }

    /**
     * Test multiply method with a general BigMatrix.
     */
    @Test
    public void testMultiplyBigMatrix() {
        BigDecimal[][] data1 = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigDecimal[][] data2 = {{new BigDecimal("5"), new BigDecimal("6")}, {new BigDecimal("7"), new BigDecimal("8")}};
        BigMatrixImpl m1 = new BigMatrixImpl(data1);
        BigMatrix m2 = new BigMatrixImpl(data2); // Using BigMatrixImpl as BigMatrix
        BigMatrix result = m1.multiply(m2);
        assertEquals(new BigDecimal("19"), result.getEntry(0, 0)); // 1*5 + 2*7
        assertEquals(new BigDecimal("22"), result.getEntry(0, 1)); // 1*6 + 2*8
        assertEquals(new BigDecimal("43"), result.getEntry(1, 0)); // 3*5 + 4*7
        assertEquals(new BigDecimal("50"), result.getEntry(1, 1)); // 3*6 + 4*8
    }

    /**
     * Test multiply method with incompatible dimensions.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyIncompatibleDimensions() {
        BigDecimal[][] data1 = {{new BigDecimal("1"), new BigDecimal("2")}}; // 1x2
        BigDecimal[][] data2 = {{new BigDecimal("5"), new BigDecimal("6")}}; // 1x2
        BigMatrixImpl m1 = new BigMatrixImpl(data1);
        BigMatrixImpl m2 = new BigMatrixImpl(data2);
        m1.multiply(m2);
    }

    /**
     * Test preMultiply method with a general BigMatrix.
     */
    @Test
    public void testPreMultiplyBigMatrix() {
        BigDecimal[][] data1 = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}}; // 2x2
        BigDecimal[][] data2 = {{new BigDecimal("5"), new BigDecimal("6")}, {new BigDecimal("7"), new BigDecimal("8")}}; // 2x2
        BigMatrixImpl m1 = new BigMatrixImpl(data1);
        BigMatrix m2 = new BigMatrixImpl(data2);
        BigMatrix result = m1.preMultiply(m2); // m2 * m1
        assertEquals(new BigDecimal("23"), result.getEntry(0, 0)); // 5*1 + 6*3
        assertEquals(new BigDecimal("34"), result.getEntry(0, 1)); // 5*2 + 6*4
        assertEquals(new BigDecimal("53"), result.getEntry(1, 0)); // 7*1 + 8*3
        assertEquals(new BigDecimal("78"), result.getEntry(1, 1)); // 7*2 + 8*4
    }

    /**
     * Test getData method.
     */
    @Test
    public void testGetData() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigDecimal[][] retrievedData = matrix.getData();
        assertNotSame(data, retrievedData); // Should be a copy
        assertEquals(data.length, retrievedData.length);
        assertEquals(data[0].length, retrievedData[0].length);
        assertEquals(data[0][0], retrievedData[0][0]);
    }

    /**
     * Test getDataAsDoubleArray method.
     */
    @Test
    public void testGetDataAsDoubleArray() {
        BigDecimal[][] data = {{new BigDecimal("1.1"), new BigDecimal("2.2")}, {new BigDecimal("3.3"), new BigDecimal("4.4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        double[][] doubleData = matrix.getDataAsDoubleArray();
        assertEquals(2, doubleData.length);
        assertEquals(2, doubleData[0].length);
        assertEquals(1.1, doubleData[0][0], 1e-9);
        assertEquals(4.4, doubleData[1][1], 1e-9);
    }

    /**
     * Test getDataRef method.
     */
    @Test
    public void testGetDataRef() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigDecimal[][] refData = matrix.getDataRef();
        assertSame(data, refData); // Should be the same reference
    }

    /**
     * Test setRoundingMode and getRoundingMode.
     */
    @Test
    public void testRoundingMode() {
        BigMatrixImpl matrix = new BigMatrixImpl();
        matrix.setRoundingMode(BigDecimal.ROUND_CEILING);
        assertEquals(BigDecimal.ROUND_CEILING, matrix.getRoundingMode());
    }

    /**
     * Test setScale and getScale.
     */
    @Test
    public void testScale() {
        BigMatrixImpl matrix = new BigMatrixImpl();
        matrix.setScale(100);
        assertEquals(100, matrix.getScale());
    }

    /**
     * Test getNorm method.
     */
    @Test
    public void testGetNorm() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("-2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        // Col 0: |1| + |3| = 4
        // Col 1: |-2| + |4| = 6
        assertEquals(new BigDecimal("6"), matrix.getNorm());
    }

    /**
     * Test getSubMatrix with row and column ranges.
     */
    @Test
    public void testGetSubMatrixRange() {
        BigDecimal[][] data = {
            {new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3")},
            {new BigDecimal("4"), new BigDecimal("5"), new BigDecimal("6")},
            {new BigDecimal("7"), new BigDecimal("8"), new BigDecimal("9")}
        };
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigMatrix sub = matrix.getSubMatrix(1, 2, 1, 2); // Rows 1-2, Cols 1-2
        assertEquals(new BigDecimal("5"), sub.getEntry(0, 0));
        assertEquals(new BigDecimal("6"), sub.getEntry(0, 1));
        assertEquals(new BigDecimal("8"), sub.getEntry(1, 0));
        assertEquals(new BigDecimal("9"), sub.getEntry(1, 1));
    }

    /**
     * Test getSubMatrix with arrays of indices.
     */
    @Test
    public void testGetSubMatrixIndices() {
        BigDecimal[][] data = {
            {new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3")},
            {new BigDecimal("4"), new BigDecimal("5"), new BigDecimal("6")},
            {new BigDecimal("7"), new BigDecimal("8"), new BigDecimal("9")}
        };
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        int[] rows = {0, 2};
        int[] cols = {1, 2};
        BigMatrix sub = matrix.getSubMatrix(rows, cols);
        assertEquals(new BigDecimal("2"), sub.getEntry(0, 0));
        assertEquals(new BigDecimal("3"), sub.getEntry(0, 1));
        assertEquals(new BigDecimal("8"), sub.getEntry(1, 0));
        assertEquals(new BigDecimal("9"), sub.getEntry(1, 1));
    }

    /**
     * Test setSubMatrix method.
     */
    @Test
    public void testSetSubMatrix() {
        BigDecimal[][] data = {
            {new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3")},
            {new BigDecimal("4"), new BigDecimal("5"), new BigDecimal("6")},
            {new BigDecimal("7"), new BigDecimal("8"), new BigDecimal("9")}
        };
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigDecimal[][] subMatrix = {{new BigDecimal("10"), new BigDecimal("11")}, {new BigDecimal("12"), new BigDecimal("13")}};
        matrix.setSubMatrix(subMatrix, 1, 1);
        assertEquals(new BigDecimal("10"), matrix.getEntry(1, 1));
        assertEquals(new BigDecimal("11"), matrix.getEntry(1, 2));
        assertEquals(new BigDecimal("12"), matrix.getEntry(2, 1));
        assertEquals(new BigDecimal("13"), matrix.getEntry(2, 2));
        assertNull(matrix.lu); // LU decomposition should be invalidated
    }

    /**
     * Test getRowMatrix method.
     */
    @Test
    public void testGetRowMatrix() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigMatrix rowMatrix = matrix.getRowMatrix(1);
        assertEquals(1, rowMatrix.getRowDimension());
        assertEquals(2, rowMatrix.getColumnDimension());
        assertEquals(new BigDecimal("3"), rowMatrix.getEntry(0, 0));
        assertEquals(new BigDecimal("4"), rowMatrix.getEntry(0, 1));
    }

    /**
     * Test getColumnMatrix method.
     */
    @Test
    public void testGetColumnMatrix() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigMatrix colMatrix = matrix.getColumnMatrix(0);
        assertEquals(2, colMatrix.getRowDimension());
        assertEquals(1, colMatrix.getColumnDimension());
        assertEquals(new BigDecimal("1"), colMatrix.getEntry(0, 0));
        assertEquals(new BigDecimal("3"), colMatrix.getEntry(1, 0));
    }

    /**
     * Test getRow method.
     */
    @Test
    public void testGetRow() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigDecimal[] row = matrix.getRow(1);
        assertEquals(2, row.length);
        assertEquals(new BigDecimal("3"), row[0]);
        assertEquals(new BigDecimal("4"), row[1]);
    }

    /**
     * Test getRowAsDoubleArray method.
     */
    @Test
    public void testGetRowAsDoubleArray() {
        BigDecimal[][] data = {{new BigDecimal("1.1"), new BigDecimal("2.2")}, {new BigDecimal("3.3"), new BigDecimal("4.4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        double[] row = matrix.getRowAsDoubleArray(0);
        assertEquals(2, row.length);
        assertEquals(1.1, row[0], 1e-9);
        assertEquals(2.2, row[1], 1e-9);
    }

    /**
     * Test getColumn method.
     */
    @Test
    public void testGetColumn() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigDecimal[] col = matrix.getColumn(0);
        assertEquals(2, col.length);
        assertEquals(new BigDecimal("1"), col[0]);
        assertEquals(new BigDecimal("3"), col[1]);
    }

    /**
     * Test getColumnAsDoubleArray method.
     */
    @Test
    public void testGetColumnAsDoubleArray() {
        BigDecimal[][] data = {{new BigDecimal("1.1"), new BigDecimal("2.2")}, {new BigDecimal("3.3"), new BigDecimal("4.4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        double[] col = matrix.getColumnAsDoubleArray(1);
        assertEquals(2, col.length);
        assertEquals(2.2, col[0], 1e-9);
        assertEquals(4.4, col[1], 1e-9);
    }

    /**
     * Test getEntry method.
     */
    @Test
    public void testGetEntry() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertEquals(new BigDecimal("4"), matrix.getEntry(1, 1));
    }

    /**
     * Test getEntry method with out of bounds index.
     */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntryOutOfBounds() {
        BigDecimal[][] data = {{new BigDecimal("1")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        matrix.getEntry(1, 0);
    }

    /**
     * Test getEntryAsDouble method.
     */
    @Test
    public void testGetEntryAsDouble() {
        BigDecimal[][] data = {{new BigDecimal("1.5"), new BigDecimal("2.5")}, {new BigDecimal("3.5"), new BigDecimal("4.5")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertEquals(4.5, matrix.getEntryAsDouble(1, 1), 1e-9);
    }

    /**
     * Test transpose method.
     */
    @Test
    public void testTranspose() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3")}, {new BigDecimal("4"), new BigDecimal("5"), new BigDecimal("6")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigMatrix transposed = matrix.transpose();
        assertEquals(3, transposed.getRowDimension());
        assertEquals(2, transposed.getColumnDimension());
        assertEquals(new BigDecimal("1"), transposed.getEntry(0, 0));
        assertEquals(new BigDecimal("4"), transposed.getEntry(1, 0));
        assertEquals(new BigDecimal("6"), transposed.getEntry(2, 1));
    }

    /**
     * Test inverse method for a simple 2x2 matrix.
     */
    @Test
    public void testInverseSimple() throws Exception {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        // Determinant is 1*4 - 2*3 = -2
        // Inverse is 1/(-2) * [[4, -2], [-3, 1]] = [[-2, 1], [1.5, -0.5]]
        BigMatrix inv = matrix.inverse();
        assertEquals(new BigDecimal("-2"), inv.getEntry(0, 0));
        assertEquals(new BigDecimal("1"), inv.getEntry(0, 1));
        assertEquals(new BigDecimal("1.5"), inv.getEntry(1, 0));
        assertEquals(new BigDecimal("-0.5"), inv.getEntry(1, 1));
    }

    /**
     * Test getDeterminant method for a square matrix.
     */
    @Test
    public void testGetDeterminantSquare() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertEquals(new BigDecimal("-2"), matrix.getDeterminant());
    }

    /**
     * Test getDeterminant method for a singular matrix.
     */
    @Test
    public void testGetDeterminantSingular() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("2"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertEquals(BigDecimal.ZERO, matrix.getDeterminant());
    }

    /**
     * Test isSquare method for a square matrix.
     */
    @Test
    public void testIsSquareTrue() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertTrue(matrix.isSquare());
    }

    /**
     * Test isSquare method for a non-square matrix.
     */
    @Test
    public void testIsSquareFalse() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3")}, {new BigDecimal("4"), new BigDecimal("5"), new BigDecimal("6")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertFalse(matrix.isSquare());
    }

    /**
     * Test isSingular method for a non-singular matrix.
     */
    @Test
    public void testIsSingularFalse() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertFalse(matrix.isSingular());
    }

    /**
     * Test isSingular method for a singular matrix.
     */
    @Test
    public void testIsSingularTrue() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("2"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertTrue(matrix.isSingular());
    }

    /**
     * Test getRowDimension method.
     */
    @Test
    public void testGetRowDimension() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertEquals(2, matrix.getRowDimension());
    }

    /**
     * Test getColumnDimension method.
     */
    @Test
    public void testGetColumnDimension() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertEquals(2, matrix.getColumnDimension());
    }

    /**
     * Test getTrace method for a square matrix.
     */
    @Test
    public void testGetTraceSquare() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertEquals(new BigDecimal("5"), matrix.getTrace());
    }

    /**
     * Test getTrace method for a non-square matrix.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTraceNonSquare() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3")}, {new BigDecimal("4"), new BigDecimal("5"), new BigDecimal("6")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        matrix.getTrace();
    }

    /**
     * Test operate method with a BigDecimal array.
     */
    @Test
    public void testOperateBigDecimalArray() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigDecimal[] vector = {new BigDecimal("5"), new BigDecimal("6")};
        BigDecimal[] result = matrix.operate(vector);
        // 1*5 + 2*6 = 17
        // 3*5 + 4*6 = 15 + 24 = 39
        assertEquals(new BigDecimal("17"), result[0]);
        assertEquals(new BigDecimal("39"), result[1]);
    }

    /**
     * Test operate method with a double array.
     */
    @Test
    public void testOperateDoubleArray() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        double[] vector = {5.0, 6.0};
        BigDecimal[] result = matrix.operate(vector);
        // 1*5 + 2*6 = 17
        // 3*5 + 4*6 = 15 + 24 = 39
        assertEquals(new BigDecimal("17"), result[0]);
        assertEquals(new BigDecimal("39"), result[1]);
    }

    /**
     * Test solve method with a BigDecimal array.
     */
    @Test
    public void testSolveBigDecimalArray() throws Exception {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigDecimal[] constants = {new BigDecimal("5"), new BigDecimal("11")}; // x + 2y = 5, 3x + 4y = 11. Solution: x=1, y=2
        BigDecimal[] solution = matrix.solve(constants);
        assertEquals(new BigDecimal("1"), solution[0]);
        assertEquals(new BigDecimal("2"), solution[1]);
    }

    /**
     * Test solve method with a double array.
     */
    @Test
    public void testSolveDoubleArray() throws Exception {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        double[] constants = {5.0, 11.0}; // x + 2y = 5, 3x + 4y = 11. Solution: x=1, y=2
        BigDecimal[] solution = matrix.solve(constants);
        assertEquals(new BigDecimal("1"), solution[0]);
        assertEquals(new BigDecimal("2"), solution[1]);
    }

    /**
     * Test solve method with a BigMatrix.
     */
    @Test
    public void testSolveBigMatrix() throws Exception {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigDecimal[][] constantsData = {{new BigDecimal("5"), new BigDecimal("1")}, {new BigDecimal("11"), new BigDecimal("7")}};
        BigMatrix constantsMatrix = new BigMatrixImpl(constantsData);
        BigMatrix solutionMatrix = matrix.solve(constantsMatrix);
        // For first column of constants: x + 2y = 5, 3x + 4y = 11 => x=1, y=2
        // For second column of constants: x + 2y = 1, 3x + 4y = 7 => x=-1, y=1
        assertEquals(new BigDecimal("1"), solutionMatrix.getEntry(0, 0));
        assertEquals(new BigDecimal("2"), solutionMatrix.getEntry(1, 0));
        assertEquals(new BigDecimal("-1"), solutionMatrix.getEntry(0, 1));
        assertEquals(new BigDecimal("1"), solutionMatrix.getEntry(1, 1));
    }

    /**
     * Test luDecompose method.
     */
    @Test
    public void testLuDecompose() throws Exception {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        matrix.luDecompose();
        assertNotNull(matrix.lu);
        assertNotNull(matrix.permutation);
        assertTrue(matrix.parity == 1 || matrix.parity == -1);
    }

    /**
     * Test luDecompose method for a singular matrix.
     */
    @Test(expected = InvalidMatrixException.class)
    public void testLuDecomposeSingular() throws Exception {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("2"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        matrix.luDecompose();
    }

    /**
     * Test toString method.
     */
    @Test
    public void testToString() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        String expected = "BigMatrixImpl{{1,2},{3,4}}";
        assertEquals(expected, matrix.toString());
    }

    /**
     * Test equals method with the same object.
     */
    @Test
    public void testEqualsSameObject() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertTrue(matrix.equals(matrix));
    }

    /**
     * Test equals method with an equal object.
     */
    @Test
    public void testEqualsEqualObject() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix1 = new BigMatrixImpl(data);
        BigMatrixImpl matrix2 = new BigMatrixImpl(data);
        assertTrue(matrix1.equals(matrix2));
    }

    /**
     * Test equals method with a non-equal object (different data).
     */
    @Test
    public void testEqualsDifferentData() {
        BigDecimal[][] data1 = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigDecimal[][] data2 = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("5")}};
        BigMatrixImpl matrix1 = new BigMatrixImpl(data1);
        BigMatrixImpl matrix2 = new BigMatrixImpl(data2);
        assertFalse(matrix1.equals(matrix2));
    }

    /**
     * Test equals method with a non-equal object (different dimensions).
     */
    @Test
    public void testEqualsDifferentDimensions() {
        BigDecimal[][] data1 = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigDecimal[][] data2 = {{new BigDecimal("1"), new BigDecimal("2")}};
        BigMatrixImpl matrix1 = new BigMatrixImpl(data1);
        BigMatrixImpl matrix2 = new BigMatrixImpl(data2);
        assertFalse(matrix1.equals(matrix2));
    }

    /**
     * Test equals method with a different type of object.
     */
    @Test
    public void testEqualsDifferentType() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        assertFalse(matrix.equals("not a matrix"));
    }

    /**
     * Test hashCode method.
     */
    @Test
    public void testHashCode() {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix1 = new BigMatrixImpl(data);
        BigMatrixImpl matrix2 = new BigMatrixImpl(data);
        assertEquals(matrix1.hashCode(), matrix2.hashCode());
    }

    /**
     * Test getLUMatrix method when LU decomposition is not yet computed.
     */
    @Test
    public void testGetLUMatrixNotComputed() throws Exception {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        BigMatrix luMatrix = matrix.getLUMatrix();
        assertNotNull(luMatrix);
        assertEquals(matrix.getRowDimension(), luMatrix.getRowDimension());
        assertEquals(matrix.getColumnDimension(), luMatrix.getColumnDimension());
        assertNotNull(matrix.lu); // LU should be computed and cached
    }

    /**
     * Test getLUMatrix method when LU decomposition is already computed.
     */
    @Test
    public void testGetLUMatrixComputed() throws Exception {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        matrix.luDecompose(); // Compute and cache LU
        // Access lu directly, which is protected. The correct way is to get its value after computation.
        BigDecimal[][] computedLU = matrix.getData(); // This might be data, not the LU matrix directly.
                                                     // The lu field is protected and contains the result of luDecompose.
                                                     // Let's access the computed lu directly since it's protected.
        BigMatrix originalLU = new BigMatrixImpl(matrix.lu); // Create a BigMatrix from the protected field

        BigMatrix luMatrix = matrix.getLUMatrix();
        assertNotNull(luMatrix);
        assertNotSame(originalLU.getData(), luMatrix.getData()); // Should return a copy
        assertEquals(new BigDecimal("1"), luMatrix.getEntry(0, 0));
        assertEquals(new BigDecimal("3"), luMatrix.getEntry(1, 0));
    }

    /**
     * Test getPermutation method.
     */
    @Test
    public void testGetPermutation() throws Exception {
        BigDecimal[][] data = {{new BigDecimal("1"), new BigDecimal("2")}, {new BigDecimal("3"), new BigDecimal("4")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        matrix.luDecompose();
        int[] permutation = matrix.getPermutation();
        assertNotNull(permutation);
        assertTrue(permutation.length == 2);
        // For this matrix, no swap should occur, so permutation should be [0, 1]
        assertEquals(0, permutation[0]);
        assertEquals(1, permutation[1]);
    }

    /**
     * Test getPermutation method after a swap.
     */
    @Test
    public void testGetPermutationWithSwap() throws Exception {
        BigDecimal[][] data = {{new BigDecimal("3"), new BigDecimal("4")}, {new BigDecimal("1"), new BigDecimal("2")}};
        BigMatrixImpl matrix = new BigMatrixImpl(data);
        matrix.luDecompose(); // Should swap rows
        int[] permutation = matrix.getPermutation();
        assertNotNull(permutation);
        assertTrue(permutation.length == 2);
        assertEquals(1, permutation[0]);
        assertEquals(0, permutation[1]);
    }
}
```