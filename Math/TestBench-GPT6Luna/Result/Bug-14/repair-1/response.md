```java
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
    public void testWeightSquareRootDiagonalEntries() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0, 0}),
                new Weight(new double[] {4, 9}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0], point[0]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1}, {1}}));
        RealMatrix root = optimizer.getWeightSquareRoot();
        assertEquals(2.0, root.getEntry(0, 0), 0.0);
        assertEquals(3.0, root.getEntry(1, 1), 0.0);
        assertEquals(0.0, root.getEntry(0, 1), 0.0);
    }

    @Test
    public void testWeightSquareRootReturnsIndependentCopy() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0}),
                new Weight(new double[] {16}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1}}));
        RealMatrix copy = optimizer.getWeightSquareRoot();
        copy.setEntry(0, 0, 99);
        assertEquals(4.0, optimizer.getWeightSquareRoot().getEntry(0, 0), 0.0);
    }

    @Test
    public void testWeightSquareRootForZeroDiagonalWeight() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0}),
                new Weight(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1}}));
        assertEquals(0.0, optimizer.getWeightSquareRoot().getEntry(0, 0), 0.0);
    }

    @Test
    public void testCovarianceForOneParameter() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0, 0}),
                new Weight(new double[] {1, 1}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0], 2 * point[0]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1}, {2}}));
        assertEquals(0.2, optimizer.computeCovariances(new double[] {0}, 1e-12)[0][0], 1e-12);
    }

    @Test
    public void testCovarianceForTwoIndependentParameters() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0, 0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0, 0, 0}),
                new Weight(new double[] {1, 1, 1}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0], point[1], point[0] + point[1]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1, 0}, {0, 1}, {1, 1}}));
        double[][] covariance = optimizer.computeCovariances(new double[] {0, 0}, 1e-12);
        assertEquals(2.0 / 3.0, covariance[0][0], 1e-12);
        assertEquals(-1.0 / 3.0, covariance[0][1], 1e-12);
        assertEquals(2.0 / 3.0, covariance[1][1], 1e-12);
    }

    @Test
    public void testSigmaIsSquareRootOfCovarianceDiagonal() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0, 0}),
                new Weight(new double[] {1, 1}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0], 2 * point[0]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1}, {2}}));
        assertEquals(Math.sqrt(0.2), optimizer.computeSigma(new double[] {0}, 1e-12)[0], 1e-12);
    }

    @Test
    public void testSigmaForTwoParameters() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0, 0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0, 0, 0}),
                new Weight(new double[] {1, 1, 1}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0], point[1], point[0] + point[1]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1, 0}, {0, 1}, {1, 1}}));
        double[] sigma = optimizer.computeSigma(new double[] {0, 0}, 1e-12);
        assertEquals(Math.sqrt(2.0 / 3.0), sigma[0], 1e-12);
        assertEquals(Math.sqrt(2.0 / 3.0), sigma[1], 1e-12);
    }

    @Test
    public void testDiagonalWeightAffectsCovariance() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0, 0}),
                new Weight(new double[] {4, 1}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0], point[0]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1}, {1}}));
        assertEquals(0.2, optimizer.computeCovariances(new double[] {0}, 1e-12)[0][0], 1e-12);
    }

    @Test
    public void testGetChiSquareAfterOptimization() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0, 0}),
                new Weight(new double[] {1, 1}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0], point[0]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1}, {1}}));
        assertEquals(0.0, optimizer.getChiSquare(), 0.0);
    }

    @Test
    public void testRmsAfterOptimization() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0, 0}),
                new Weight(new double[] {1, 1}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0], point[0]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1}, {1}}));
        assertEquals(0.0, optimizer.getRMS(), 0.0);
    }

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
    public void testWeightSquareRootForNonDiagonalMatrix() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        optimizer.optimize(10, new org.apache.commons.math3.optim.InitialGuess(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {0, 0}),
                new Weight(MatrixUtils.createRealMatrix(new double[][] {{4, 0}, {0, 9}})),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0], point[0]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1}, {1}}));
        RealMatrix root = optimizer.getWeightSquareRoot();
        assertEquals(2.0, root.getEntry(0, 0), 1e-12);
        assertEquals(3.0, root.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testWeightMatrixMustBeSquare() throws Exception {
        try {
            new Weight(MatrixUtils.createRealMatrix(new double[][] {{1, 2}}));
            fail("expected NonSquareMatrixException");
        } catch (NonSquareMatrixException expected) {
        }
    }

    @Test
    public void testOptimizeUsesSuppliedDiagonalWeight() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        PointVectorValuePair result = optimizer.optimize(
                10,
                new org.apache.commons.math3.optim.InitialGuess(new double[] {0}),
                new org.apache.commons.math3.optim.nonlinear.vector.Target(new double[] {2, 0}),
                new Weight(new double[] {1, 3}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunction(
                        point -> new double[] {point[0], point[0]}),
                new org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian(
                        point -> new double[][] {{1}, {1}}));
        assertEquals(0.5, result.getPoint()[0], 1e-12);
    }
}
```