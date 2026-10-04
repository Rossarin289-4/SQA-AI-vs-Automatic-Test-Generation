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

    @Test
    public void testMaxIterationsBoundaries() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        optimizer.setMaxIterations(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxIterations());
        optimizer.setMaxIterations(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, optimizer.getMaxIterations());
    }

    @Test
    public void testMaxEvaluationsBoundaries() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        optimizer.setMaxEvaluations(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        optimizer.setMaxEvaluations(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, optimizer.getMaxEvaluations());
    }

    @Test
    public void testInitialCounters() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        assertEquals(0, optimizer.getIterations());
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getJacobianEvaluations());
    }

    @Test
    public void testDefaultConvergenceChecker() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        assertTrue(optimizer.getConvergenceChecker() instanceof SimpleVectorialValueChecker);
    }

    @Test
    public void testSetAndGetConvergenceChecker() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        VectorialConvergenceChecker checker = new SimpleVectorialValueChecker();
        optimizer.setConvergenceChecker(checker);
        assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testOptimizeComputesFitAndCounters() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        DifferentiableMultivariateVectorialFunction function =
            new DifferentiableMultivariateVectorialFunction() {
                public double[] value(double[] point) {
                    return new double[] { point[0], point[0] };
                }
                public MultivariateMatrixFunction jacobian() {
                    return new MultivariateMatrixFunction() {
                        public double[][] value(double[] point) {
                            return new double[][] { { 1.0 }, { 1.0 } };
                        }
                    };
                }
            };
        VectorialPointValuePair result =
            optimizer.optimize(function, new double[] { 2.0, 4.0 },
                               new double[] { 1.0, 1.0 }, new double[] { 0.0 });
        assertEquals(3.0, result.getPoint()[0], 1e-9);
        assertEquals(3.0, result.getValue()[0], 1e-9);
        assertEquals(3, optimizer.getEvaluations());
        assertEquals(3, optimizer.getJacobianEvaluations());
        assertEquals(1, optimizer.getIterations());
    }

    @Test
    public void testOptimizeRejectsMismatchedTargetAndWeights() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        DifferentiableMultivariateVectorialFunction function =
            new DifferentiableMultivariateVectorialFunction() {
                public double[] value(double[] point) { return new double[] { 0.0 }; }
                public MultivariateMatrixFunction jacobian() {
                    return new MultivariateMatrixFunction() {
                        public double[][] value(double[] point) {
                            return new double[][] { { 1.0 } };
                        }
                    };
                }
            };
        try {
            optimizer.optimize(function, new double[] { 1.0 }, new double[0],
                               new double[] { 0.0 });
            fail("expected OptimizationException");
        } catch (OptimizationException expected) {
            assertEquals(0, optimizer.getEvaluations());
        }
    }

    @Test
    public void testFitPreservesWeightedResidualStatistics() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        DifferentiableMultivariateVectorialFunction function =
            new DifferentiableMultivariateVectorialFunction() {
                public double[] value(double[] point) {
                    return new double[] { point[0], point[0] };
                }
                public MultivariateMatrixFunction jacobian() {
                    return new MultivariateMatrixFunction() {
                        public double[][] value(double[] point) {
                            return new double[][] { { 1.0 }, { 1.0 } };
                        }
                    };
                }
            };
        optimizer.optimize(function, new double[] { 2.0, 4.0 },
                           new double[] { 1.0, 1.0 }, new double[] { 0.0 });
        assertEquals(2.0, optimizer.getChiSquare(), 1e-9);
        assertEquals(1.0, optimizer.getRMS(), 1e-9);
    }

    @Test
    public void testFitWithUnequalWeights() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        DifferentiableMultivariateVectorialFunction function =
            new DifferentiableMultivariateVectorialFunction() {
                public double[] value(double[] point) {
                    return new double[] { point[0], point[0] };
                }
                public MultivariateMatrixFunction jacobian() {
                    return new MultivariateMatrixFunction() {
                        public double[][] value(double[] point) {
                            return new double[][] { { 1.0 }, { 1.0 } };
                        }
                    };
                }
            };
        VectorialPointValuePair result =
            optimizer.optimize(function, new double[] { 0.0, 4.0 },
                               new double[] { 1.0, 3.0 }, new double[] { 0.0 });
        assertEquals(3.3544380888143466, result.getPoint()[0], 1e-9);
        assertEquals(3.0, optimizer.getChiSquare(), 1e-9);
        assertEquals(Math.sqrt(1.5), optimizer.getRMS(), 1e-9);
    }

    @Test
    public void testCovariancesForTwoIndependentColumns() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        DifferentiableMultivariateVectorialFunction function =
            new DifferentiableMultivariateVectorialFunction() {
                public double[] value(double[] point) {
                    return new double[] { point[0], point[1], point[0] + point[1] };
                }
                public MultivariateMatrixFunction jacobian() {
                    return new MultivariateMatrixFunction() {
                        public double[][] value(double[] point) {
                            return new double[][] {
                                { 1.0, 0.0 }, { 0.0, 1.0 }, { 1.0, 1.0 }
                            };
                        }
                    };
                }
            };
        optimizer.optimize(function, new double[] { 0.0, 0.0, 0.0 },
                           new double[] { 1.0, 1.0, 1.0 }, new double[] { 0.0, 0.0 });
        double[][] covariance = optimizer.getCovariances();
        assertEquals(0.6666666667, covariance[0][0], 1e-8);
        assertEquals(-0.3333333333, covariance[0][1], 1e-8);
        assertEquals(-0.3333333333, covariance[1][0], 1e-8);
        assertEquals(0.6666666667, covariance[1][1], 1e-8);
    }

    @Test
    public void testCovarianceUsesObservationWeights() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        DifferentiableMultivariateVectorialFunction function =
            new DifferentiableMultivariateVectorialFunction() {
                public double[] value(double[] point) {
                    return new double[] { point[0], point[0] };
                }
                public MultivariateMatrixFunction jacobian() {
                    return new MultivariateMatrixFunction() {
                        public double[][] value(double[] point) {
                            return new double[][] { { 1.0 }, { 1.0 } };
                        }
                    };
                }
            };
        optimizer.optimize(function, new double[] { 1.0, 1.0 },
                           new double[] { 1.0, 3.0 }, new double[] { 0.0 });
        assertEquals(0.25, optimizer.getCovariances()[0][0], 1e-9);
    }

    @Test
    public void testSingularCovarianceThrowsOptimizationException() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        DifferentiableMultivariateVectorialFunction function =
            new DifferentiableMultivariateVectorialFunction() {
                public double[] value(double[] point) {
                    return new double[] { point[0], point[0] };
                }
                public MultivariateMatrixFunction jacobian() {
                    return new MultivariateMatrixFunction() {
                        public double[][] value(double[] point) {
                            return new double[][] { { 1.0, 1.0 }, { 1.0, 1.0 } };
                        }
                    };
                }
            };
        optimizer.optimize(function, new double[] { 0.0, 0.0 },
                           new double[] { 1.0, 1.0 }, new double[] { 0.0, 0.0 });
        try {
            optimizer.getCovariances();
            fail("expected OptimizationException");
        } catch (OptimizationException expected) {
            assertEquals(3, optimizer.getEvaluations());
        }
    }

    @Test
    public void testGuessParameterErrorsWithExtraObservation() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        DifferentiableMultivariateVectorialFunction function =
            new DifferentiableMultivariateVectorialFunction() {
                public double[] value(double[] point) {
                    return new double[] { point[0], point[0], point[0] };
                }
                public MultivariateMatrixFunction jacobian() {
                    return new MultivariateMatrixFunction() {
                        public double[][] value(double[] point) {
                            return new double[][] { { 1.0 }, { 1.0 }, { 1.0 } };
                        }
                    };
                }
            };
        optimizer.optimize(function, new double[] { 1.0, 1.0, 4.0 },
                           new double[] { 1.0, 1.0, 1.0 }, new double[] { 0.0 });
        assertEquals(1.0, optimizer.guessParametersErrors()[0], 1e-8);
    }

    @Test
    public void testGuessErrorsRejectsNoDegreesOfFreedom() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true);
        DifferentiableMultivariateVectorialFunction function =
            new DifferentiableMultivariateVectorialFunction() {
                public double[] value(double[] point) { return new double[] { point[0] }; }
                public MultivariateMatrixFunction jacobian() {
                    return new MultivariateMatrixFunction() {
                        public double[][] value(double[] point) {
                            return new double[][] { { 1.0 } };
                        }
                    };
                }
            };
        optimizer.optimize(function, new double[] { 1.0 },
                           new double[] { 1.0 }, new double[] { 0.0 });
        try {
            optimizer.guessParametersErrors();
            fail("expected OptimizationException");
        } catch (OptimizationException expected) {
            assertEquals(3, optimizer.getEvaluations());
        }
    }
}
