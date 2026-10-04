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
    public void testDiagonalEigenvaluesAreDescending() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, -3, 5 }, new double[] { 0, 0 }, 0);
        assertArrayEquals(new double[] { 5, 2, -3 }, e.getRealEigenvalues(), 0);
    }

    @Test
    public void testOneByOneEigenvalue() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { -4 }, new double[0], 0);
        assertEquals(-4, e.getRealEigenvalue(0), 0);
    }

    @Test
    public void testTwoByTwoEigenvalues() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, 2 }, new double[] { 1 }, 0);
        assertArrayEquals(new double[] { 3, 1 }, e.getRealEigenvalues(), 1e-12);
    }

    @Test
    public void testTwoByTwoWithNegativeDiagonal() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { -2, -2 }, new double[] { 1 }, 0);
        assertArrayEquals(new double[] { -1, -3 }, e.getRealEigenvalues(), 1e-12);
    }

    @Test
    public void testTwoByTwoSplitAtZeroSecondary() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 7, -2 }, new double[] { 0 }, 0);
        assertArrayEquals(new double[] { 7, -2 }, e.getRealEigenvalues(), 0);
    }

    @Test
    public void testTwoByTwoNotSplitAtPositiveSecondary() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, 2 }, new double[] { 1 }, 0);
        assertEquals(3, e.getRealEigenvalue(0), 1e-12);
        assertEquals(1, e.getRealEigenvalue(1), 1e-12);
    }

    @Test
    public void testThreeByThreeEigenvalues() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, 2, 2 }, new double[] { 1, 1 }, 0);
        assertArrayEquals(new double[] { 2 + Math.sqrt(2), 2, 2 - Math.sqrt(2) },
                e.getRealEigenvalues(), 1e-10);
    }

    @Test
    public void testThreeByThreeSplitIntoSingleRows() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 6, -1, 3 }, new double[] { 0, 0 }, 0);
        assertArrayEquals(new double[] { 6, 3, -1 }, e.getRealEigenvalues(), 0);
    }

    @Test
    public void testImaginaryEigenvaluesAreZero() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, 2 }, new double[] { 1 }, 0);
        assertArrayEquals(new double[] { 0, 0 }, e.getImagEigenvalues(), 0);
        assertEquals(0, e.getImagEigenvalue(0), 0);
        assertEquals(0, e.getImagEigenvalue(1), 0);
    }

    @Test
    public void testDeterminantOfTwoByTwo() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, 2 }, new double[] { 1 }, 0);
        assertEquals(3, e.getDeterminant(), 1e-12);
    }

    @Test
    public void testDeterminantOfDiagonalWithNegativeValues() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, -3, 5 }, new double[] { 0, 0 }, 0);
        assertEquals(-30, e.getDeterminant(), 0);
    }

    @Test
    public void testDiagonalMatrixD() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, -3 }, new double[] { 0 }, 0);
        RealMatrix d = e.getD();
        assertEquals(2, d.getEntry(0, 0), 0);
        assertEquals(-3, d.getEntry(1, 1), 0);
        assertEquals(0, d.getEntry(0, 1), 0);
        assertEquals(0, d.getEntry(1, 0), 0);
    }

    @Test
    public void testVectorAndTransposeMatricesForDiagonalInput() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, 5 }, new double[] { 0 }, 0);
        RealMatrix v = e.getV();
        RealMatrix vt = e.getVT();
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                assertEquals(v.getEntry(i, j), vt.getEntry(j, i), 0);
            }
        }
        assertEquals(1, v.getEntry(0, 0) * v.getEntry(0, 0)
                + v.getEntry(1, 0) * v.getEntry(1, 0), 1e-12);
    }

    @Test
    public void testEigenvectorHasUnitNorm() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, 2 }, new double[] { 1 }, 0);
        RealVector v = e.getEigenvector(0);
        assertEquals(1, v.getNorm(), 1e-12);
    }

    @Test
    public void testSolverReportsNonsingularForNonzeroEigenvalues() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, 3 }, new double[] { 0 }, 0);
        assertTrue(e.getSolver().isNonSingular());
    }

    @Test
    public void testSolverReportsSingularForZeroEigenvalue() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 0, 3 }, new double[] { 0 }, 0);
        assertFalse(e.getSolver().isNonSingular());
    }

    @Test
    public void testSolveDiagonalSystem() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, 4 }, new double[] { 0 }, 0);
        double[] solution = e.getSolver().solve(new double[] { 6, 8 });
        assertEquals(2, solution.length);
        assertEquals(3, solution[0] + solution[1], 1e-12);
        assertEquals(5, 2 * solution[0] + 4 * solution[1], 1e-12);
    }

    @Test
    public void testInverseOfDiagonalMatrix() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 2, 4 }, new double[] { 0 }, 0);
        RealMatrix inverse = e.getSolver().getInverse();
        assertEquals(0.5, inverse.getEntry(0, 0) + inverse.getEntry(0, 1), 1e-12);
        assertEquals(0.25, inverse.getEntry(1, 0) + inverse.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testEigenvalueIndexPastEndThrows() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 1 }, new double[0], 0);
        try {
            e.getRealEigenvalue(1);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) { }
    }

    @Test
    public void testEigenvectorIndexPastEndThrows() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 1 }, new double[0], 0);
        try {
            e.getEigenvector(1);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) { }
    }

    @Test
    public void testSolveSingularMatrixThrows() throws Exception {
        EigenDecompositionImpl e = new EigenDecompositionImpl(
                new double[] { 0 }, new double[0], 0);
        try {
            e.getSolver().solve(new double[] { 1 });
            fail("expected SingularMatrixException");
        } catch (SingularMatrixException expected) { }
    }
}
