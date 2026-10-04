```java
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
    @Test
    public void testJacobianEvaluations() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(0, optimizer.getJacobianEvaluations());

        // To test the increment, we need to call optimize.
        optimizer.optimize(100,
                           new MultivariateDifferentiableVectorFunction() {
                               @Override
                               public DerivativeStructure[] value(DerivativeStructure[] x) {
                                   return new DerivativeStructure[]{x[0]};
                               }
                           },
                           new Target(new double[]{1.0}),
                           new Weight(new double[]{1.0}),
                           new InitialGuess(new double[]{0.0}));
        // The Jacobian is evaluated at least once during optimization.
        assertTrue(optimizer.getJacobianEvaluations() > 0);
    }

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
    @Test
    public void testGetWeightSquareRootDiagonal() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[] weights = {1.0, 4.0};
        RealMatrix weightMatrix = new DiagonalMatrix(weights);

        optimizer.optimize(100,
                           new MultivariateDifferentiableVectorFunction() {
                               @Override
                               public DerivativeStructure[] value(DerivativeStructure[] x) {
                                   return new DerivativeStructure[]{x[0], x[1]};
                               }
                           },
                           new Target(new double[]{1.0, 2.0}),
                           new Weight(weights),
                           new InitialGuess(new double[]{0.0, 0.0}));
        // After optimization, setUp is called, which computes weightMatrixSqrt.
        RealMatrix sqrtW = optimizer.getWeightSquareRoot();
        double[][] expectedData = {{1.0, 0.0}, {0.0, 2.0}};
        RealMatrix expectedMatrix = MatrixUtils.createRealMatrix(expectedData);
        assertTrue(expectedMatrix.subtract(sqrtW).getNorm() < 1e-9);
    }

    /**
     * Test for getWeightSquareRoot when the weight matrix is not diagonal.
     */
    @Test
    public void testGetWeightSquareRootNonDiagonal() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[] weightsArray = {2.0, 1.0, 1.0, 2.0}; // These define a 2x2 matrix: {{2.0, 1.0}, {1.0, 2.0}}
        
        optimizer.optimize(100,
                           new MultivariateDifferentiableVectorFunction() {
                               @Override
                               public DerivativeStructure[] value(DerivativeStructure[] x) {
                                   return new DerivativeStructure[]{x[0], x[1]};
                               }
                           },
                           new Target(new double[]{1.0, 2.0}),
                           new Weight(weightsArray), 
                           new InitialGuess(new double[]{0.0, 0.0}));
        
        RealMatrix sqrtW = optimizer.getWeightSquareRoot();
        double sqrt3 = FastMath.sqrt(3.0);
        double val1 = (sqrt3 + 1.0) / 2.0;
        double val2 = (sqrt3 - 1.0) / 2.0;
        double[][] expectedData = {{val1, val2}, {val2, val1}};
        RealMatrix expectedMatrix = MatrixUtils.createRealMatrix(expectedData);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(expectedMatrix.getEntry(i, j), sqrtW.getEntry(i, j), 1e-9);
            }
        }
    }

    /**
     * Test getCovariances with a singular matrix.
     */
    @Test
    public void testGetCovariancesSingular() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double threshold = 1e-14;

        // Function causing singular Jacobian: f(x, y) = [x + y, x + y]
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                DerivativeStructure res1 = x[0].add(x[1]);
                DerivativeStructure res2 = x[0].add(x[1]);
                return new DerivativeStructure[]{res1, res2};
            }
        };

        double[] target = {3.0, 3.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {1.0, 1.0};

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        // After optimization, `point` should be set.
        double[] params = optimizer.getPoint(); // Inherited from BaseAbstractMultivariateVectorOptimizer

        try {
            optimizer.computeCovariances(params, threshold); // Use computeCovariances directly
            fail("Expected SingularMatrixException for a singular Jacobian.");
        } catch (org.apache.commons.math3.linear.SingularMatrixException e) {
            // Expected exception.
        } catch (Exception e) {
            fail("Caught unexpected exception: " + e.getMessage());
        }
    }

    /**
     * Test computeCovariances with a non-singular Jacobian.
     */
    @Test
    public void testComputeCovariancesNonSingular() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double threshold = 1e-14;

        // Function: f(x, y) = [x, 2y]
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                DerivativeStructure res1 = x[0]; // f1 = x
                DerivativeStructure res2 = x[1].multiply(2.0); // f2 = 2y
                return new DerivativeStructure[]{res1, res2};
            }
        };

        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0}; // Identity weights
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));
        double[] params = optimizer.getPoint();

        double[][] covariances = optimizer.computeCovariances(params, threshold);

        // J = [[1, 0], [0, 2]], W = I. J^T W J = [[1, 0], [0, 4]]. Inverse = [[1, 0], [0, 0.25]].
        double[][] expectedCovariances = {{1.0, 0.0}, {0.0, 0.25}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(expectedCovariances[i][j], covariances[i][j], 1e-9);
            }
        }
    }

    /**
     * Test guessParametersErrors with sufficient degrees of freedom.
     */
    @Test
    public void testGuessParametersErrorsSufficientDegrees() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        // Function f(p0, p1, p2) = [p0, p1, p2, p0+p1+p2]
        // Jacobian J is 4x3. rows = 4, cols = 3. rows > cols.
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                DerivativeStructure p0 = x[0];
                DerivativeStructure p1 = x[1];
                DerivativeStructure p2 = x[2];
                DerivativeStructure[] res = new DerivativeStructure[4];
                res[0] = p0;
                res[1] = p1;
                res[2] = p2;
                res[3] = p0.add(p1).add(p2);
                return res;
            }
        };

        double[] target = {1.0, 2.0, 3.0, 6.0};
        double[] weights = {1.0, 1.0, 1.0, 1.0};
        double[] startPoint = {0.0, 0.0, 0.0};

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        double[] errors = optimizer.guessParametersErrors();

        // J^T J = [[2, 1, 1], [1, 2, 1], [1, 1, 2]]
        // Inverse of J^T J = [[0.75, -0.25, -0.25], [-0.25, 0.75, -0.25], [-0.25, -0.25, 0.75]]
        // ChiSquare = 50. rows = 4, cols = 3. degrees of freedom = 1.
        // c = sqrt(50 / 1) = sqrt(50).
        // errors[i] = sqrt(cov[i][i]) * c
        double expectedError = FastMath.sqrt(0.75 * 50.0); // sqrt(37.5)
        assertEquals(expectedError, errors[0], 1e-9);
        assertEquals(expectedError, errors[1], 1e-9);
        assertEquals(expectedError, errors[2], 1e-9);
    }

    /**
     * Test guessParametersErrors with insufficient degrees of freedom.
     * Should throw NumberIsTooSmallException.
     */
    @Test
    public void testGuessParametersErrorsInsufficientDegrees() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        // Function: f(x,y) = [x, 2y]. rows = 2, cols = 2. rows <= cols.
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0], x[1].multiply(2.0)};
            }
        };

        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        try {
            optimizer.guessParametersErrors();
            fail("Expected NumberIsTooSmallException for insufficient degrees of freedom.");
        } catch (NumberIsTooSmallException e) {
            assertEquals(LocalizedFormats.NO_DEGREES_OF_FREEDOM, e.getPattern());
            // 'rows' and 'cols' are accessible through the instance.
            assertEquals(optimizer.rows, e.getArguments()[0]);
            assertEquals(optimizer.cols, e.getArguments()[1]);
        } catch (Exception e) {
            fail("Caught unexpected exception: " + e.getMessage());
        }
    }

    /**
     * Test computeSigma with a non-singular Jacobian.
     */
    @Test
    public void testComputeSigmaNonSingular() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double covarianceSingularityThreshold = 1e-14;

        // Function: f(x, y) = [x, 2y]. Covariance = [[1, 0], [0, 0.25]].
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0], x[1].multiply(2.0)};
            }
        };

        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));
        double[] params = optimizer.getPoint();

        double[] sigma = optimizer.computeSigma(params, covarianceSingularityThreshold);

        // Expected sigma: sqrt of diagonal elements of covariance matrix.
        assertEquals(1.0, sigma[0], 1e-9); // sqrt(1.0)
        assertEquals(0.5, sigma[1], 1e-9); // sqrt(0.25)
    }

    /**
     * Test computeSigma with a singular Jacobian.
     * Should throw SingularMatrixException.
     */
    @Test
    public void testComputeSigmaSingular() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double covarianceSingularityThreshold = 1e-14;

        // Function causing singular Jacobian: f(x, y) = [x + y, x + y]
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0].add(x[1]), x[0].add(x[1])};
            }
        };

        double[] target = {3.0, 3.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {1.0, 1.0};

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));
        double[] params = optimizer.getPoint();

        try {
            optimizer.computeSigma(params, covarianceSingularityThreshold);
            fail("Expected SingularMatrixException for a singular Jacobian.");
        } catch (org.apache.commons.math3.linear.SingularMatrixException e) {
            // Expected exception.
        } catch (Exception e) {
            fail("Caught unexpected exception: " + e.getMessage());
        }
    }

    /**
     * Test optimize with simple linear function.
     */
    @Test
    public void testOptimizeLinearFunction() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        // Function: f(x, y) = [x, 2y]
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0], x[1].multiply(2.0)};
            }
        };

        double[] target = {5.0, 10.0}; // Expected optimum: x=5, y=5
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};

        PointVectorValuePair result = optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        double[] optimalPoint = result.getPoint();
        double[] optimalValue = result.getValue();

        assertEquals(5.0, optimalPoint[0], 1e-9);
        assertEquals(5.0, optimalPoint[1], 1e-9);
        assertEquals(5.0, optimalValue[0], 1e-9);
        assertEquals(10.0, optimalValue[1], 1e-9);
    }

    /**
     * Test optimization with a non-linear function.
     */
    @Test
    public void testOptimizeNonLinearFunction() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        // Function: f(x) = [x^2]
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0].multiply(x[0])}; // f(x) = x^2
            }
        };

        double[] target = {0.0};
        double[] weights = {1.0};
        double[] startPoint = {5.0};

        PointVectorValuePair result = optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        double[] optimalPoint = result.getPoint();
        double[] optimalValue = result.getValue();

        assertEquals(0.0, optimalPoint[0], 1e-9);
        assertEquals(0.0, optimalValue[0], 1e-9);
    }

    /**
     * Test `updateJacobian`. This method is deprecated and calls `computeWeightedJacobian`.
     */
    @Test
    public void testUpdateJacobian() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        // Function: f(x, y) = [x, 2y]
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0], x[1].multiply(2.0)};
            }
        };

        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.5, 0.5};

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        optimizer.updateJacobian(); // Populates `weightedResidualJacobian`

        // `weightedResidualJacobian` = -1 * (W^(1/2) * J)
        // W=I, J = [[1, 0], [0, 2]]. W^(1/2)*J = [[1, 0], [0, 2]].
        // So, `weightedResidualJacobian` should be [[-1.0, 0.0], [0.0, -2.0]].
        double[][] expectedWeightedJacobian = {{-1.0, 0.0}, {0.0, -2.0}};
        assertArrayEquals(expectedWeightedJacobian[0], optimizer.weightedResidualJacobian[0], 1e-9);
        assertArrayEquals(expectedWeightedJacobian[1], optimizer.weightedResidualJacobian[1], 1e-9);
    }

    /**
     * Test computeWeightedJacobian with a simple function.
     */
    @Test
    public void testComputeWeightedJacobian() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        // Function: f(x, y) = [x, 2y]. J = [[1, 0], [0, 2]].
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0], x[1].multiply(2.0)};
            }
        };

        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.5, 0.5};

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        RealMatrix weightedJacobian = optimizer.computeWeightedJacobian(startPoint);

        // W^(1/2) * J = I * [[1, 0], [0, 2]] = [[1, 0], [0, 2]].
        double[][] expectedData = {{1.0, 0.0}, {0.0, 2.0}};
        RealMatrix expectedMatrix = MatrixUtils.createRealMatrix(expectedData);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(expectedMatrix.getEntry(i, j), weightedJacobian.getEntry(i, j), 1e-9);
            }
        }
    }

    /**
     * Test computeWeightedJacobian with different weights.
     */
    @Test
    public void testComputeWeightedJacobianWithWeights() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        // Function: f(x, y) = [x, 2y]. J = [[1, 0], [0, 2]].
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0], x[1].multiply(2.0)};
            }
        };

        double[] target = {1.0, 2.0};
        double[] weightsArray = {4.0, 9.0}; // W = diag(4, 9), W^(1/2) = diag(2, 3)
        double[] startPoint = {0.5, 0.5};

        optimizer.optimize(100, func, new Target(target), new Weight(weightsArray), new InitialGuess(startPoint));

        RealMatrix weightedJacobian = optimizer.computeWeightedJacobian(startPoint);

        // W^(1/2) * J = [[2, 0], [0, 3]] * [[1, 0], [0, 2]] = [[2, 0], [0, 6]].
        double[][] expectedData = {{2.0, 0.0}, {0.0, 6.0}};
        RealMatrix expectedMatrix = MatrixUtils.createRealMatrix(expectedData);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(expectedMatrix.getEntry(i, j), weightedJacobian.getEntry(i, j), 1e-9);
            }
        }
    }

    /**
     * Test `updateResidualsAndCost`.
     */
    @Test
    public void testUpdateResidualsAndCost() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        // Function: f(x, y) = [x, 2y]
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0], x[1].multiply(2.0)};
            }
        };

        double[] target = {5.0, 10.0}; // Exact solution at x=5, y=5
        double[] weightsArray = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0}; // Objective value at {0,0} is {0,0}

        optimizer.optimize(100, func, new Target(target), new Weight(weightsArray), new InitialGuess(startPoint));

        // Objective value at startPoint {0,0} is {0,0}.
        // Residuals = {5, 10} - {0, 0} = {5, 10}.
        // Cost = sqrt(residuals^T * W * residuals) = sqrt([5, 10] * I * [5,10]^T) = sqrt(25+100) = sqrt(125).
        // WeightedResiduals = W^(1/2) * residuals = I * {5, 10} = {5, 10}.

        optimizer.updateResidualsAndCost();

        // Check if the fields are updated correctly.
        assertArrayEquals(new double[]{0.0, 0.0}, optimizer.objective, 1e-9);
        assertArrayEquals(new double[]{5.0, 10.0}, optimizer.weightedResiduals, 1e-9);
        assertEquals(FastMath.sqrt(125.0), optimizer.cost, 1e-9);
    }

    /**
     * Test computeCost with residuals.
     */
    @Test
    public void testComputeCost() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[] weightsArray = {4.0, 9.0}; // W = diag(4, 9)
        
        // Need to set weight matrix to be used by computeCost.
        // The `Weight` optimization data is processed in `setUp`.
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

        // Residuals {1.0, 2.0}
        // Cost = sqrt([1, 2] * [[4,0],[0,9]] * [1,2]^T) = sqrt(4*1 + 9*4) = sqrt(4+36) = sqrt(40).
        double[] residuals = {1.0, 2.0};
        double expectedCost = FastMath.sqrt(40.0);
        assertEquals(expectedCost, optimizer.computeCost(residuals), 1e-9);

        // Zero residuals.
        double[] zeroResiduals = {0.0, 0.0};
        assertEquals(0.0, optimizer.computeCost(zeroResiduals), 1e-9);

        // Negative residuals.
        double[] negResiduals = {-1.0, -2.0};
        assertEquals(expectedCost, optimizer.computeCost(negResiduals), 1e-9);
    }

    /**
     * Test getRMS with some values.
     */
    @Test
    public void testGetRMSWithValues() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0]}; // f(x) = x
            }
        };
        double[] target = {5.0};
        double[] weights = {1.0};
        double[] startPoint = {0.0};

        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        // Optimal point = 5. Objective at {0} is {0}. Residuals = {5}-{0}={5}.
        // Cost = sqrt(5^2)=5. ChiSquare = 25. rows = 1.
        // RMS = sqrt(25/1) = 5.
        assertEquals(5.0, optimizer.getRMS(), 1e-9);

        // Another case. Target = {10}, Start = {2}.
        double[] target2 = {10.0};
        double[] startPoint2 = {2.0};
        optimizer.optimize(100, func, new Target(target2), new Weight(weights), new InitialGuess(startPoint2));
        // Optimal point = 10. Objective at {2} is {2}. Residuals = {10}-{2}={8}.
        // Cost = sqrt(8^2)=8. ChiSquare = 64. rows = 1.
        // RMS = sqrt(64/1) = 8.
        assertEquals(8.0, optimizer.getRMS(), 1e-9);
    }

    /**
     * Test computeResiduals.
     */
    @Test
    public void testComputeResiduals() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[] target = {5.0, 10.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {0.0, 0.0};
        MultivariateDifferentiableVectorFunction func = new MultivariateDifferentiableVectorFunction() {
            @Override
            public DerivativeStructure[] value(DerivativeStructure[] x) {
                return new DerivativeStructure[]{x[0], x[1].multiply(2.0)};
            }
        };
        optimizer.optimize(100, func, new Target(target), new Weight(weights), new InitialGuess(startPoint));

        // Objective value at startPoint {0.0, 0.0} is {0.0, 0.0}.
        double[] objectiveValue = {0.0, 0.0};
        double[] residuals = optimizer.computeResiduals(objectiveValue);
        assertArrayEquals(new double[]{5.0, 10.0}, residuals, 1e-9);

        // Test with different objective values.
        objectiveValue = new double[]{1.0, 3.0};
        residuals = optimizer.computeResiduals(objectiveValue);
        assertArrayEquals(new double[]{4.0, 7.0}, residuals, 1e-9);
    }

    /**
     * Test computeResiduals with dimension mismatch.
     */
    @Test
    public void testComputeResidualsDimensionMismatch() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[] target = {1.0, 2.0};
        // Need to set the target for computeResiduals.
        // The `optimize` method initializes the internal state including `target`.
        optimizer.optimize(1, // Minimal evaluations to trigger setUp
                           new MultivariateDifferentiableVectorFunction() {
                               @Override
                               public DerivativeStructure[] value(DerivativeStructure[] x) {
                                   return new DerivativeStructure[]{x[0]};
                               }
                           },
                           new Target(target),
                           new Weight(new double[]{1.0}),
                           new InitialGuess(new double[]{0.0}));

        double[] objectiveValue = {1.0}; // Mismatched dimension

        try {
            optimizer.computeResiduals(objectiveValue);
            fail("Expected DimensionMismatchException.");
        } catch (DimensionMismatchException e) {
            assertEquals(2, e.getLength1());
            assertEquals(1, e.getLength2());
        } catch (Exception e) {
            fail("Caught unexpected exception: " + e.getMessage());
        }
    }

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
```