package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer;

public class AbstractLeastSquaresOptimizerTest {
    @Test
    public void testWeightGetWeightReturnsCopy() throws Exception {
        Weight weight = new Weight(new double[] {4, 9});
        RealMatrix matrix = weight.getWeight();
        matrix.setEntry(0, 0, 100);
        assertEquals(4.0, weight.getWeight().getEntry(0, 0), 0.0);
    }

    @Test
    public void testWeightMatrixConstructorCopiesInput() throws Exception {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][] {{4, 0}, {0, 9}});
        Weight weight = new Weight(matrix);
        matrix.setEntry(0, 0, 100);
        assertEquals(4.0, weight.getWeight().getEntry(0, 0), 0.0);
    }

    @Test
    public void testWeightMatrixMustBeSquare() throws Exception {
        try {
            new Weight(MatrixUtils.createRealMatrix(new double[][] {{1, 2}}));
            fail("expected NonSquareMatrixException");
        } catch (NonSquareMatrixException expected) {
        }
    }
}
