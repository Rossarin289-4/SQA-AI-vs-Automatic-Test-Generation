package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.util.MathUtils;

public class EigenDecompositionImplTest {
    @Test
    public void testDiagonalEigenvaluesAndDeterminant() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {3, -2, 0}, new double[] {0, 0}, 0);
        assertArrayEquals(new double[] {3, 0, -2}, eig.getRealEigenvalues(), 0);
        assertEquals(3, eig.getRealEigenvalue(0), 0);
        assertEquals(0, eig.getDeterminant(), 0);
    }

    @Test
    public void testEigenvalueArraysAreCopies() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {4, 1}, new double[] {0}, 0);
        double[] values = eig.getRealEigenvalues();
        values[0] = 99;
        assertEquals(4, eig.getRealEigenvalue(0), 0);
    }

    @Test
    public void testTwoByTwoEigenvalues() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {2, 2}, new double[] {1}, 0);
        assertEquals(3, eig.getRealEigenvalue(0), 1e-12);
        assertEquals(1, eig.getRealEigenvalue(1), 1e-12);
    }

    @Test
    public void testImaginaryEigenvaluesAreZero() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {5, -1}, new double[] {0}, 0);
        assertArrayEquals(new double[] {0, 0}, eig.getImagEigenvalues(), 0);
        assertEquals(0, eig.getImagEigenvalue(1), 0);
    }

    @Test
    public void testEigenvalueIndexZero() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {7}, new double[0], 0);
        assertEquals(7, eig.getRealEigenvalue(0), 0);
    }

    @Test
    public void testEigenvalueLastIndex() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {7, -4}, new double[] {0}, 0);
        assertEquals(-4, eig.getRealEigenvalue(1), 0);
    }

    @Test
    public void testEigenvalueIndexPastEndThrows() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {7}, new double[0], 0);
        try {
            eig.getRealEigenvalue(1);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) { }
    }

    @Test
    public void testDContainsEigenvaluesOnDiagonal() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {3, 1}, new double[] {0}, 0);
        RealMatrix d = eig.getD();
        assertEquals(3, d.getEntry(0, 0), 0);
        assertEquals(1, d.getEntry(1, 1), 0);
        assertEquals(0, d.getEntry(0, 1), 0);
    }

    @Test
    public void testVAndVTForDiagonalMatrix() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {3, 1}, new double[] {0}, 0);
        RealMatrix v = eig.getV();
        RealMatrix vt = eig.getVT();
        assertEquals(2, v.getRowDimension());
        assertEquals(2, v.getColumnDimension());
        assertEquals(v.getEntry(0, 1), vt.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testEigenvectorHasUnitNorm() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {3}, new double[0], 0);
        RealVector vector = eig.getEigenvector(0);
        assertEquals(1, vector.getNorm(), 1e-12);
    }

    @Test
    public void testEigenvectorOutOfRangeThrows() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {3}, new double[0], 0);
        try {
            eig.getEigenvector(1);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) { }
    }

    @Test
    public void testDeterminantOfNonSingularDiagonalMatrix() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {3, -2}, new double[] {0}, 0);
        assertEquals(-6, eig.getDeterminant(), 0);
    }

    @Test
    public void testSolverRecognizesNonSingularMatrix() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {4, 2}, new double[] {0}, 0);
        assertTrue(eig.getSolver().isNonSingular());
    }

    @Test
    public void testSolverRecognizesSingularMatrix() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {4, 0}, new double[] {0}, 0);
        assertFalse(eig.getSolver().isNonSingular());
    }

    @Test
    public void testSolveDiagonalSystem() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {4}, new double[0], 0);
        assertArrayEquals(new double[] {2}, eig.getSolver().solve(new double[] {8}), 1e-12);
    }

    @Test
    public void testSolveWrongLengthThrows() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {4, 2}, new double[] {0}, 0);
        try {
            eig.getSolver().solve(new double[] {8});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSolveSingularSystemThrows() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {4, 0}, new double[] {0}, 0);
        try {
            eig.getSolver().solve(new double[] {8, 6});
            fail("expected SingularMatrixException");
        } catch (SingularMatrixException expected) { }
    }

    @Test
    public void testInverseOfDiagonalMatrix() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {4}, new double[0], 0);
        RealMatrix inverse = eig.getSolver().getInverse();
        assertEquals(0.25, inverse.getEntry(0, 0), 1e-12);
    }

    @Test
    public void testInverseOfSingularMatrixThrows() throws Exception {
        EigenDecompositionImpl eig = new EigenDecompositionImpl(
                new double[] {4, 0}, new double[] {0}, 0);
        try {
            eig.getSolver().getInverse();
            fail("expected SingularMatrixException");
        } catch (SingularMatrixException expected) { }
    }
}
