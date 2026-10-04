package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.MathRuntimeException;

public class CholeskyDecompositionImplTest {
    @Test
    public void testLowerAndUpperFactorsForDiagonalMatrix() throws Exception {
        RealMatrix a = new RealMatrixImpl(new double[][] {
            {4.0, 0.0}, {0.0, 9.0}
        });
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(a);
        assertEquals(2.0, d.getL().getEntry(0, 0), 0.0);
        assertEquals(3.0, d.getLT().getEntry(1, 1), 0.0);
        assertEquals(0.0, d.getL().getEntry(0, 1), 0.0);
    }

    @Test
    public void testFactorsForCorrelatedMatrix() throws Exception {
        RealMatrix a = new RealMatrixImpl(new double[][] {
            {4.0, 2.0}, {2.0, 5.0}
        });
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(a);
        assertEquals(2.0, d.getL().getEntry(0, 0), 0.0);
        assertEquals(1.0, d.getL().getEntry(1, 0), 0.0);
        assertEquals(2.0, d.getL().getEntry(1, 1), 0.0);
        assertEquals(1.0, d.getLT().getEntry(0, 1), 0.0);
    }

    @Test
    public void testFactorReconstructsMatrix() throws Exception {
        RealMatrix a = new RealMatrixImpl(new double[][] {
            {4.0, 2.0}, {2.0, 5.0}
        });
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(a);
        RealMatrix product = d.getL().multiply(d.getLT());
        assertEquals(4.0, product.getEntry(0, 0), 1e-12);
        assertEquals(2.0, product.getEntry(0, 1), 1e-12);
        assertEquals(5.0, product.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testDeterminantForDiagonalMatrix() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0, 0.0}, {0.0, 9.0}}));
        assertEquals(36.0, d.getDeterminant(), 0.0);
    }

    @Test
    public void testDeterminantForCorrelatedMatrix() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0, 2.0}, {2.0, 5.0}}));
        assertEquals(16.0, d.getDeterminant(), 0.0);
    }

    @Test
    public void testSolverReportsNonsingular() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0, 2.0}, {2.0, 5.0}}));
        assertTrue(d.getSolver().isNonSingular());
    }

    @Test
    public void testSolveDiagonalSystem() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0, 0.0}, {0.0, 9.0}}));
        double[] x = d.getSolver().solve(new double[] {8.0, 18.0});
        assertEquals(2.0, x[0], 0.0);
        assertEquals(2.0, x[1], 0.0);
    }

    @Test
    public void testSolveCorrelatedSystem() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0, 2.0}, {2.0, 5.0}}));
        double[] x = d.getSolver().solve(new double[] {6.0, 7.0});
        assertEquals(1.0, x[0], 1e-12);
        assertEquals(1.0, x[1], 1e-12);
    }

    @Test
    public void testSolveSingleDimension() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0}}));
        assertEquals(3.0, d.getSolver().solve(new double[] {12.0})[0], 0.0);
    }

    @Test
    public void testSolveZeroRightHandSide() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0, 2.0}, {2.0, 5.0}}));
        double[] x = d.getSolver().solve(new double[] {0.0, 0.0});
        assertEquals(0.0, x[0], 0.0);
        assertEquals(0.0, x[1], 0.0);
    }

    @Test
    public void testSolveRejectsShortVector() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0, 0.0}, {0.0, 9.0}}));
        try {
            d.getSolver().solve(new double[] {1.0});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(1, 1);
        }
    }

    @Test
    public void testSolveRejectsLongVector() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0}}));
        try {
            d.getSolver().solve(new double[] {1.0, 2.0});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(1, 1);
        }
    }

    @Test
    public void testInverseOfDiagonalMatrix() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0, 0.0}, {0.0, 9.0}}));
        RealMatrix inverse = d.getSolver().getInverse();
        assertEquals(0.25, inverse.getEntry(0, 0), 1e-12);
        assertEquals(1.0 / 9.0, inverse.getEntry(1, 1), 1e-12);
        assertEquals(0.0, inverse.getEntry(0, 1), 0.0);
    }

    @Test
    public void testInverseOfCorrelatedMatrix() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{4.0, 2.0}, {2.0, 5.0}}));
        RealMatrix inverse = d.getSolver().getInverse();
        assertEquals(5.0 / 16.0, inverse.getEntry(0, 0), 1e-12);
        assertEquals(-2.0 / 16.0, inverse.getEntry(0, 1), 1e-12);
        assertEquals(4.0 / 16.0, inverse.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testRejectsNonsquareMatrix() throws Exception {
        try {
            new CholeskyDecompositionImpl(
                new RealMatrixImpl(new double[][] {{1.0, 0.0}}));
            fail("expected NonSquareMatrixException");
        } catch (NonSquareMatrixException expected) {
            assertEquals(1, 1);
        }
    }

    @Test
    public void testRejectsAsymmetricMatrix() throws Exception {
        try {
            new CholeskyDecompositionImpl(
                new RealMatrixImpl(new double[][] {{4.0, 1.0}, {2.0, 5.0}}));
            fail("expected NotSymmetricMatrixException");
        } catch (NotSymmetricMatrixException expected) {
            assertEquals(1, 1);
        }
    }

    @Test
    public void testAcceptsRelativeSymmetryThresholdEdge() throws Exception {
        double threshold = 1e-6;
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {
                {4.0, 1.0}, {1.0 + threshold, 5.0}
            }), threshold, 1e-10);
        assertEquals(19.0, d.getDeterminant(), 1e-12);
    }

    @Test
    public void testRejectsDifferenceAboveSymmetryThreshold() throws Exception {
        double threshold = 1e-6;
        try {
            new CholeskyDecompositionImpl(
                new RealMatrixImpl(new double[][] {
                    {4.0, 1.0}, {1.0 + 2.0 * threshold, 5.0}
                }), threshold, 1e-10);
            fail("expected NotSymmetricMatrixException");
        } catch (NotSymmetricMatrixException expected) {
            assertEquals(1, 1);
        }
    }

    @Test
    public void testRejectsDiagonalBelowPositivityThreshold() throws Exception {
        try {
            new CholeskyDecompositionImpl(
                new RealMatrixImpl(new double[][] {{0.5, 0.0}, {0.0, 2.0}}),
                1e-15, 1.0);
            fail("expected NotPositiveDefiniteMatrixException");
        } catch (NotPositiveDefiniteMatrixException expected) {
            assertEquals(1, 1);
        }
    }

    @Test
    public void testAcceptsDiagonalAtPositivityThreshold() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{1.0, 0.0}, {0.0, 2.0}}),
            1e-15, 1.0);
        assertEquals(2.0000000000000004, d.getDeterminant(), 0.0);
    }

    @Test
    public void testZeroDiagonalWithZeroThresholdIsAccepted() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{0.0}}), 1e-15, 0.0);
        assertTrue(Double.isNaN(d.getDeterminant()));
    }

    @Test
    public void testOneByOneFactorAndDeterminant() throws Exception {
        CholeskyDecompositionImpl d = new CholeskyDecompositionImpl(
            new RealMatrixImpl(new double[][] {{9.0}}));
        assertEquals(3.0, d.getL().getEntry(0, 0), 0.0);
        assertEquals(9.0, d.getDeterminant(), 0.0);
    }
}
