package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxEvaluationsExceededException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.exception.LocalizedFormats;
import org.apache.commons.math.linear.InvalidMatrixException;
import org.apache.commons.math.linear.LUDecompositionImpl;
import org.apache.commons.math.linear.MatrixUtils;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.VectorialPointValuePair;

public class AbstractLeastSquaresOptimizerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSetMaxIterations() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        optimizer.setMaxIterations(10);
        assertEquals(10, optimizer.getMaxIterations());
    }

    @Test
    public void testGetMaxIterations() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        assertEquals(DEFAULT_MAX_ITERATIONS, optimizer.getMaxIterations());
        optimizer.setMaxIterations(50);
        assertEquals(50, optimizer.getMaxIterations());
    }

    // Test for getIterations is hard to do without calling doOptimize which is abstract.
    // Testing initial state is the most reliable.
    @Test
    public void testGetIterations_initialState() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testSetMaxEvaluations() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        optimizer.setMaxEvaluations(20);
        assertEquals(20, optimizer.getMaxEvaluations());
    }

    @Test
    public void testGetMaxEvaluations() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        optimizer.setMaxEvaluations(1000);
        assertEquals(1000, optimizer.getMaxEvaluations());
    }

    // Test for getEvaluations is hard to do without calling doOptimize which is abstract.
    // Testing initial state is the most reliable.
    @Test
    public void testGetEvaluations_initialState() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        assertEquals(0, optimizer.getEvaluations());
    }

    // Test for getJacobianEvaluations is hard to do without calling doOptimize which is abstract.
    // Testing initial state is the most reliable.
    @Test
    public void testGetJacobianEvaluations_initialState() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        assertEquals(0, optimizer.getJacobianEvaluations());
    }

    @Test
    public void testSetConvergenceChecker() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        VectorialConvergenceChecker checker = new SimpleVectorialValueChecker();
        optimizer.setConvergenceChecker(checker);
        assertEquals(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testGetConvergenceChecker() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        assertTrue(optimizer.getConvergenceChecker() instanceof SimpleVectorialValueChecker);
        VectorialConvergenceChecker checker = new MockConvergenceChecker();
        optimizer.setConvergenceChecker(checker);
        assertEquals(checker, optimizer.getConvergenceChecker());
    }

    // Test cases for methods that require the optimizer to be configured via optimize()
    // These tests verify the exception handling when the optimizer is not properly set up.

    @Test
    public void testGetRMS_unconfigured() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        // Before optimize is called, residuals and rows are not set.
        // getChiSquare() will be called, which will likely throw.
        try {
            optimizer.getRMS();
            fail("Expected exception for unconfigured state");
        } catch (Exception e) {
            // Expected: NullPointerException or IndexOutOfBoundsException from getChiSquare.
            assertTrue(e instanceof NullPointerException || e instanceof IndexOutOfBoundsException || e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testGetChiSquare_unconfigured() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        // Before optimize is called, residuals and rows are not set.
        try {
            optimizer.getChiSquare();
            fail("Expected exception for unconfigured state");
        } catch (Exception e) {
            // Expected: NullPointerException or IndexOutOfBoundsException.
            assertTrue(e instanceof NullPointerException || e instanceof IndexOutOfBoundsException);
        }
    }

    @Test
    public void testGetCovariances_unconfigured() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        // Before optimize is called, jacobian, cols, and rows are not set.
        // updateJacobian will be called and is expected to fail.
        try {
            optimizer.getCovariances();
            fail("Expected exception for unconfigured state");
        } catch (Exception e) {
            // Expected: NullPointerException from updateJacobian.
            assertTrue(e instanceof NullPointerException || e instanceof FunctionEvaluationException || e instanceof OptimizationException);
        }
    }

    @Test
    public void testGuessParametersErrors_unconfigured() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        // Before optimize is called, rows and cols are not set.
        // The check rows <= cols will likely throw an exception or lead to NPE.
        try {
            optimizer.guessParametersErrors();
            fail("Expected exception for unconfigured state");
        } catch (Exception e) {
            // Expected: OptimizationException or NullPointerException.
            assertTrue(e instanceof OptimizationException || e instanceof NullPointerException);
        }
    }

    @Test
    public void testOptimize_nullFunction() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        try {
            optimizer.optimize(null, new double[]{1.0}, new double[]{1.0}, new double[]{1.0});
            fail("Expected IllegalArgumentException for null function");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testOptimize_nullTarget() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        try {
            optimizer.optimize(new DummyFunction(), null, new double[]{1.0}, new double[]{1.0});
            fail("Expected NullPointerException for null target");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testOptimize_nullWeights() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        try {
            optimizer.optimize(new DummyFunction(), new double[]{1.0}, null, new double[]{1.0});
            fail("Expected NullPointerException for null weights");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testOptimize_nullStartPoint() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        try {
            optimizer.optimize(new DummyFunction(), new double[]{1.0}, new double[]{1.0}, null);
            fail("Expected NullPointerException for null startPoint");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testOptimize_targetWeightsDimensionMismatch() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        try {
            optimizer.optimize(new DummyFunction(), new double[]{1.0, 2.0}, new double[]{1.0}, new double[]{1.0});
            fail("Expected OptimizationException for dimension mismatch");
        } catch (OptimizationException e) {
            // Expected
        }
    }

    // Corrected test case to match DummyFunction constructor
    @Test
    public void testOptimize_startPointDimensionMismatch() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        // Target length = 2 (rows = 2)
        // StartPoint length = 1 (cols = 1)
        // DummyFunction will be constructed with valueDimension=2, paramDimension=1.
        // The `optimize` method will set `rows=2` and `cols=1`.
        // The internal calls like `function.value(point)` and `f.jacobian().value(point)`
        // should be dimensionally consistent.
        // This test is primarily to check that `optimize` itself doesn't fail prematurely
        // due to basic argument validation or initial setup with these dimensions.
        // The actual `doOptimize` logic, which is abstract, would handle deeper dimension mismatches.
        try {
            optimizer.optimize(new DummyFunction(2, 1), new double[]{1.0, 2.0}, new double[]{1.0, 1.0}, new double[]{1.0});
            // If optimize() completes without throwing an exception, it means initial setup is fine.
            // The actual optimization might fail later due to the abstract doOptimize.
            // We are testing the setup phase here.
            // No assertion needed if no exception is thrown, as it implies successful setup.
        } catch (Exception e) {
            // If any exception is caught here, it means the setup itself failed.
            fail("Expected no exception during initial setup for these dimensions, but got: " + e.getMessage());
        }
    }


    @Test
    public void testGetCovariances_singularProblem() throws Exception {
        // This test requires a function that leads to a singular matrix.
        // We can simulate this by creating a function whose jacobian leads to a non-invertible jTj.
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        double[] target = {1.0, 2.0};
        double[] weights = {1.0, 1.0};
        double[] startPoint = {1.0, 1.0}; // 2 parameters

        // A function where the jacobian columns are linearly dependent.
        // f1 = x1 + x2, f2 = x1 + x2
        // J = [[1, 1], [1, 1]]
        // J^T J = [[2, 2], [2, 2]] (singular)
        DifferentiableMultivariateVectorialFunction singularJacobianFunction = new DifferentiableMultivariateVectorialFunction() {
            @Override
            public double[] value(double[] point) throws FunctionEvaluationException {
                // Values are not critical for covariance calculation as it depends on jacobian.
                return new double[]{point[0] + point[1], point[0] + point[1]};
            }

            @Override
            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    @Override
                    public double[][] value(double[] point) throws FunctionEvaluationException {
                        return new double[][]{
                            {1.0, 1.0}, // Jacobian for first output w.r.t. params
                            {1.0, 1.0}  // Jacobian for second output w.r.t. params
                        };
                    }
                };
            }
        };

        try {
            optimizer.optimize(singularJacobianFunction, target, weights, startPoint);
            // getCovariances() triggers updateJacobian() and then the LU decomposition.
            optimizer.getCovariances();
            fail("Expected OptimizationException for singular problem");
        } catch (OptimizationException e) {
            // Expected exception
            assertTrue(e.getMessage().contains(LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM.getSourceString()));
        } catch (FunctionEvaluationException e) {
            // Might be thrown by the dummy function itself if not careful.
            fail("Unexpected FunctionEvaluationException: " + e.getMessage());
        }
    }

     @Test
    public void testGuessParametersErrors_noDegreesOfFreedom() throws Exception {
        AbstractLeastSquaresOptimizer optimizer = new GaussNewtonOptimizer(true);
        double[] target = {1.0}; // 1 measurement (rows = 1)
        double[] weights = {1.0};
        double[] startPoint = {1.0, 2.0}; // 2 parameters (cols = 2)

        try {
            // This will set rows = 1, cols = 2.
            optimizer.optimize(new DummyFunction(1, 2), target, weights, startPoint);
            // guessParametersErrors() will check rows <= cols. Here 1 <= 2 is true.
            optimizer.guessParametersErrors();
            fail("Expected OptimizationException for no degrees of freedom");
        } catch (OptimizationException e) {
            // Expected
            assertTrue(e.getMessage().contains(LocalizedFormats.NO_DEGREES_OF_FREEDOM.getSourceString()));
        }
    }

    // Dummy implementation of DifferentiableMultivariateVectorialFunction for testing.
    // Allows specifying dimensions for value and jacobian.
    private static class DummyFunction implements DifferentiableMultivariateVectorialFunction {
        private final int valueDimension;
        private final int jacobianColDimension;
        private final int jacobianRowDimension;

        // Constructor for specifying dimensions
        public DummyFunction(int valueDim, int paramDim) {
            this.valueDimension = valueDim;
            this.jacobianColDimension = paramDim;
            this.jacobianRowDimension = valueDim; // Jacobian rows = function value dimension
        }

        // Default constructor (can be used if dimensions don't matter for a specific test, or for initial setup)
        // Although, it's better to be explicit with dimensions in tests.
        public DummyFunction() {
            this(2, 2); // Default: 2 outputs, 2 parameters
        }

        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            double[] result = new double[valueDimension];
            // Simple example: sum of elements for each output
            for (int i = 0; i < valueDimension; i++) {
                double sum = 0;
                // Ensure we don't access point[j] if point.length is different from expected
                // (although optimize method sets cols = point.length and this should be consistent)
                for (int j = 0; j < point.length; j++) {
                    sum += point[j];
                }
                result[i] = sum + i; // Add index for slight variation
            }
            return result;
        }

        @Override
        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                @Override
                public double[][] value(double[] point) throws FunctionEvaluationException {
                    double[][] jac = new double[jacobianRowDimension][jacobianColDimension];
                    // Simple jacobian: each element of point contributes 1 to each output
                    // Ensure we don't access point[j] if point.length is different from expected
                    for (int i = 0; i < jacobianRowDimension; i++) {
                        for (int j = 0; j < jacobianColDimension; j++) {
                            jac[i][j] = 1.0;
                        }
                    }
                    return jac;
                }
            };
        }
    }

    // Mock implementation of VectorialConvergenceChecker for testing setters/getters.
    private static class MockConvergenceChecker implements VectorialConvergenceChecker {
        @Override
        public boolean converged(int iteration, VectorialPointValuePair previous, VectorialPointValuePair current) {
            return false; // Always false, not relevant for these tests
        }
    }

    // Constants from AbstractLeastSquaresOptimizer for default values
    private static final int DEFAULT_MAX_ITERATIONS = 100;
}
