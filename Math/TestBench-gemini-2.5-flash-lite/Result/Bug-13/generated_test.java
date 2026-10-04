package org.apache.commons.math3.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction;
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.optimization.OptimizationData;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.Target;
import org.apache.commons.math3.optimization.Weight;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.analysis.MultivariateVectorFunction; // Added import for MultivariateVectorFunction

public class AbstractLeastSquaresOptimizerTest {

    /**
     * Test for the getJacobianEvaluations method.
     * This method should return the number of times the Jacobian was evaluated.
     * We expect it to be 0 initially and incremented during optimization.
     */

    /**
     * Test for the getChiSquare method.
     * Should return the square of the cost.
     */
    @Test
    public void testChiSquare() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        // The cost field is deprecated and should be set using `setCost()`.
        optimizer.setCost(5.0);
        assertEquals(25.0, optimizer.getChiSquare(), 1e-9);

        optimizer.setCost(0.0);
        assertEquals(0.0, optimizer.getChiSquare(), 1e-9);

        optimizer.setCost(-3.0);
        assertEquals(9.0, optimizer.getChiSquare(), 1e-9);
    }

    /**
     * Test for getWeightSquareRoot when the weight matrix is diagonal.
     */

    /**
     * Test for getWeightSquareRoot when the weight matrix is not diagonal.
     */

    /**
     * Test getCovariances with a singular matrix.
     */

    /**
     * Test computeCovariances with a non-singular Jacobian.
     */

    /**
     * Test guessParametersErrors with sufficient degrees of freedom.
     */

    /**
     * Test guessParametersErrors with insufficient degrees of freedom.
     * Should throw NumberIsTooSmallException.
     */

    /**
     * Test computeSigma with a non-singular Jacobian.
     */

    /**
     * Test computeSigma with a singular Jacobian.
     * Should throw SingularMatrixException.
     */

    /**
     * Test optimize with simple linear function.
     */

    /**
     * Test optimization with a non-linear function.
     */

    /**
     * Test `updateJacobian`. This method is deprecated and calls `computeWeightedJacobian`.
     */

    /**
     * Test computeWeightedJacobian with a simple function.
     */

    /**
     * Test computeWeightedJacobian with different weights.
     */

    /**
     * Test `updateResidualsAndCost`.
     */

    /**
     * Test computeCost with residuals.
     */

    /**
     * Test getRMS with some values.
     */

    /**
     * Test computeResiduals.
     */

    /**
     * Test computeResiduals with dimension mismatch.
     */

    /**
     * Test `computeObjectiveValue` implicitly by checking the `objective` field.
     */
    @Test
    public void testComputeObjectiveValue() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0], x[1].multiply(2.0)};
            }
        };
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {3.0, 4.0}; // Objective value at {3, 4} should be {3, 8}

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        // `updateResidualsAndCost` calls `computeObjectiveValue`.
        optimizer.updateResidualsAndCost();

        assertArrayEquals(new double[]{3.0, 8.0}, optimizer.objective, 1e-9);
    }

    /**
     * Test constructors of concrete subclasses.
     */
    @Test
    public void testGaussNewtonOptimizerConstructors() {
        // Test default constructor.
        GaussNewtonOptimizer optimizer1 = new GaussNewtonOptimizer();
        assertNotNull(optimizer1);
        // Default checker is SimpleVectorValueChecker.

        // Test constructor with checker.
        ConvergenceChecker<PointVectorValuePair> checker = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
        GaussNewtonOptimizer optimizer2 = new GaussNewtonOptimizer(checker);
        assertNotNull(optimizer2);
        // Assuming convergenceChecker is a protected field in BaseAbstractMultivariateVectorOptimizer

        // Test constructor with useLU.
        GaussNewtonOptimizer optimizer3 = new GaussNewtonOptimizer(true);
        assertNotNull(optimizer3);
        // `useLU` is protected in `GaussNewtonOptimizer`.

        // Test constructor with useLU and checker.
        GaussNewtonOptimizer optimizer4 = new GaussNewtonOptimizer(false, checker);
        assertNotNull(optimizer4);
        // `useLU` is protected in `GaussNewtonOptimizer`.
        // Assuming convergenceChecker is a protected field in BaseAbstractMultivariateVectorOptimizer
    }

    /**
     * Test LevenbergMarquardtOptimizer constructors.
     */
    @Test
    public void testLevenbergMarquardtOptimizerConstructors() {
        LevenbergMarquardtOptimizer optimizer1 = new LevenbergMarquardtOptimizer();
        assertNotNull(optimizer1);

        ConvergenceChecker<PointVectorValuePair> checker = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
        LevenbergMarquardtOptimizer optimizer2 = new LevenbergMarquardtOptimizer(checker);
        assertNotNull(optimizer2);
        // Assuming convergenceChecker is a protected field in BaseAbstractMultivariateVectorOptimizer

        double initialStepBoundFactor = 1.0;
        double costRelativeTolerance = 1e-3;
        double parRelativeTolerance = 1e-3;
        double orthoTolerance = 1e-10;
        double threshold = 1e-14;
        LevenbergMarquardtOptimizer optimizer3 = new LevenbergMarquardtOptimizer(initialStepBoundFactor, checker, costRelativeTolerance, parRelativeTolerance, orthoTolerance, threshold);
        assertNotNull(optimizer3);

        LevenbergMarquardtOptimizer optimizer4 = new LevenbergMarquardtOptimizer(costRelativeTolerance, parRelativeTolerance, orthoTolerance);
        assertNotNull(optimizer4);

        LevenbergMarquardtOptimizer optimizer5 = new LevenbergMarquardtOptimizer(initialStepBoundFactor, costRelativeTolerance, parRelativeTolerance, orthoTolerance, threshold);
        assertNotNull(optimizer5);
    }

    /**
     * Test setup method - checking initialization of weightMatrixSqrt.
     */
    @Test
    public void testSetUpWeightMatrixSqrtInitialization() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[] weightsArray = {4.0}; // Diagonal weight matrix
        
        optimizer.optimize(1, // Minimal evaluations to trigger setUp
                           new MultivariateDifferentiableVectorFunction() {
                               @Override
                               public DerivativeStructure[] value(DerivativeStructure[] x) {
                                   return new DerivativeStructure[]{x[0]};
                               }
                           },
                           new Target(new double[]{1.0}),
                           new Weight(weightsArray),
                           new InitialGuess(new double[]{0.0}));

        RealMatrix sqrtW = optimizer.getWeightSquareRoot();
        double[][] expectedData = {{2.0}};
        RealMatrix expectedMatrix = MatrixUtils.createRealMatrix(expectedData);
        assertTrue(expectedMatrix.subtract(sqrtW).getNorm() < 1e-9);
    }

    /**
     * Test setup method - checking initialization of jF.
     * `jF` is a private field, so we test it indirectly by calling a method that uses it.
     * `computeWeightedJacobian` uses `jF`.
     */
    @Test
    public void testSetUpJFInitialization() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        // Function f(x) = x^2. Jacobian J = [2x].
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0].multiply(x[0])};
            }
        };
        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {1.0};

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        // Call computeWeightedJacobian to test if jF was set correctly.
        // At startPoint {1.0}, J = [2.0]. W_sqrt = I. Weighted Jacobian = [2.0].
        RealMatrix weightedJacobian = optimizer.computeWeightedJacobian(startPoint);
        assertEquals(1, weightedJacobian.getRowDimension());
        assertEquals(1, weightedJacobian.getColumnDimension());
        assertEquals(2.0, weightedJacobian.getEntry(0, 0), 1e-9);
    }
}





