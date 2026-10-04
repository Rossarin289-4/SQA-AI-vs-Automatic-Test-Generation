package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.math.util.MathUtils;

public class BigMatrixImplTest {
    @Test
    public void testAddition() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2"}, {"3", "4"}});
        BigMatrixImpl b = new BigMatrixImpl(new String[][] {{"5", "6"}, {"7", "8"}});
        BigMatrix result = a.add(b);
        assertEquals(new BigDecimal("6"), result.getEntry(0, 0));
        assertEquals(new BigDecimal("12"), result.getEntry(1, 1));
    }

    @Test
    public void testSubtraction() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"8", "3"}, {"2", "9"}});
        BigMatrixImpl b = new BigMatrixImpl(new String[][] {{"5", "7"}, {"4", "1"}});
        BigMatrix result = a.subtract(b);
        assertEquals(new BigDecimal("3"), result.getEntry(0, 0));
        assertEquals(new BigDecimal("8"), result.getEntry(1, 1));
    }

    @Test
    public void testScalarOperations() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"-2", "3"}});
        assertEquals(new BigDecimal("1"), a.scalarAdd(new BigDecimal("3")).getEntry(0, 0));
        assertEquals(new BigDecimal("6"), a.scalarMultiply(new BigDecimal("2")).getEntry(0, 1));
    }

    @Test
    public void testMatrixMultiplication() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2"}, {"3", "4"}});
        BigMatrixImpl b = new BigMatrixImpl(new String[][] {{"5", "6"}, {"7", "8"}});
        BigMatrix result = a.multiply(b);
        assertEquals(new BigDecimal("19"), result.getEntry(0, 0));
        assertEquals(new BigDecimal("50"), result.getEntry(1, 1));
    }

    @Test
    public void testPreMultiply() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2"}, {"3", "4"}});
        BigMatrixImpl b = new BigMatrixImpl(new String[][] {{"2", "0"}, {"0", "3"}});
        BigMatrix result = a.preMultiply(b);
        assertEquals(new BigDecimal("2"), result.getEntry(0, 0));
        assertEquals(new BigDecimal("12"), result.getEntry(1, 1));
    }

    @Test
    public void testCopyAndDataDefensiveCopy() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2"}, {"3", "4"}});
        BigMatrix copy = a.copy();
        BigDecimal[][] extracted = a.getData();
        extracted[0][0] = new BigDecimal("9");
        assertEquals(new BigDecimal("1"), a.getEntry(0, 0));
        assertEquals(new BigDecimal("4"), copy.getEntry(1, 1));
    }

    @Test
    public void testDataAsDoubleArray() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1.5", "-2"}, {"3", "4"}});
        double[][] values = a.getDataAsDoubleArray();
        assertEquals(1.5, values[0][0], 1e-12);
        assertEquals(-2.0, values[0][1], 1e-12);
    }

    @Test
    public void testDataReferenceAndSubmatrixUpdate() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2"}, {"3", "4"}});
        a.getDataRef()[0][1] = new BigDecimal("7");
        assertEquals(new BigDecimal("7"), a.getEntry(0, 1));
        a.setSubMatrix(new BigDecimal[][] {{new BigDecimal("8")}}, 1, 0);
        assertEquals(new BigDecimal("8"), a.getEntry(1, 0));
    }

    @Test
    public void testRoundingAndScaleSetters() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1"}});
        assertEquals(BigDecimal.ROUND_HALF_UP, a.getRoundingMode());
        assertEquals(64, a.getScale());
        a.setRoundingMode(BigDecimal.ROUND_DOWN);
        a.setScale(7);
        assertEquals(BigDecimal.ROUND_DOWN, a.getRoundingMode());
        assertEquals(7, a.getScale());
    }

    @Test
    public void testNorm() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"-3", "2"}, {"4", "-5"}});
        assertEquals(new BigDecimal("7"), a.getNorm());
    }

    @Test
    public void testSubmatrixByRanges() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}});
        BigMatrix sub = a.getSubMatrix(0, 1, 1, 2);
        assertEquals(2, sub.getRowDimension());
        assertEquals(new BigDecimal("3"), sub.getEntry(0, 1));
        assertEquals(new BigDecimal("5"), sub.getEntry(1, 0));
    }

    @Test
    public void testRowAndColumnAccess() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2"}, {"3", "4"}});
        assertEquals(new BigDecimal("3"), a.getRow(1)[0]);
        assertEquals(new BigDecimal("2"), a.getColumn(1)[0]);
        assertEquals(4.0, a.getRowAsDoubleArray(1)[1], 1e-12);
        assertEquals(3.0, a.getColumnAsDoubleArray(0)[1], 1e-12);
        assertEquals(new BigDecimal("2"), a.getRowMatrix(0).getEntry(0, 1));
        assertEquals(new BigDecimal("4"), a.getColumnMatrix(1).getEntry(1, 0));
    }

    @Test
    public void testEntryAccessAtLastIndex() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2"}, {"3", "4"}});
        assertEquals(new BigDecimal("4"), a.getEntry(1, 1));
        assertEquals(4.0, a.getEntryAsDouble(1, 1), 1e-12);
    }

    @Test
    public void testTranspose() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2", "3"}, {"4", "5", "6"}});
        BigMatrix t = a.transpose();
        assertEquals(3, t.getRowDimension());
        assertEquals(2, t.getColumnDimension());
        assertEquals(new BigDecimal("6"), t.getEntry(2, 1));
    }

    @Test
    public void testDeterminantAndSquareState() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"2", "1"}, {"1", "3"}});
        assertTrue(a.isSquare());
        assertFalse(a.isSingular());
        assertEquals(0, new BigDecimal("5").compareTo(a.getDeterminant()));
        assertFalse(new BigMatrixImpl(new String[][] {{"1", "2"}}).isSquare());
    }

    @Test
    public void testTrace() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"2", "1"}, {"3", "5"}});
        assertEquals(new BigDecimal("7"), a.getTrace());
    }

    @Test
    public void testOperate() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2"}, {"3", "4"}});
        BigDecimal[] result = a.operate(new BigDecimal[] {new BigDecimal("5"), new BigDecimal("6")});
        assertEquals(new BigDecimal("17"), result[0]);
        assertEquals(new BigDecimal("39"), result[1]);
    }

    @Test
    public void testSolveLinearSystem() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"2", "1"}, {"1", "3"}});
        BigDecimal[] result = a.solve(new BigDecimal[] {new BigDecimal("5"), new BigDecimal("7")});
        assertEquals(new BigDecimal("1.6000000000000000000000000000000000000000000000000000000000000000"), result[0]);
        assertEquals(new BigDecimal("1.8000000000000000000000000000000000000000000000000000000000000000"), result[1]);
    }

    @Test
    public void testLuDecomposeAndStringRepresentation() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1"}});
        a.luDecompose();
        assertEquals("BigMatrixImpl{{1}}", a.toString());
        assertEquals(1, a.hashCode() == 0 ? 0 : 1);
    }

    @Test
    public void testEqualityAndHashCode() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2"}});
        BigMatrixImpl b = new BigMatrixImpl(new String[][] {{"1", "2"}});
        BigMatrixImpl c = new BigMatrixImpl(new String[][] {{"1.0", "2"}});
        assertTrue(a.equals(b));
        assertFalse(a.equals(c));
        assertFalse(a.equals("matrix"));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testInvalidDimensions() throws Exception {
        try {
            new BigMatrixImpl(0, 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1"}});
        assertEquals(1, a.getRowDimension());
        assertEquals(1, a.getColumnDimension());
    }

    @Test
    public void testSingularDeterminant() throws Exception {
        BigMatrixImpl a = new BigMatrixImpl(new String[][] {{"1", "2"}, {"2", "4"}});
        assertTrue(a.isSingular());
        assertEquals(BigDecimal.ZERO, a.getDeterminant());
    }
}
