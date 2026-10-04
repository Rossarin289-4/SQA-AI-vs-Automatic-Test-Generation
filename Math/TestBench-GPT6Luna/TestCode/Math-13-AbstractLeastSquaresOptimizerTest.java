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

public class AbstractLeastSquaresOptimizerTest {

    @Test
    public void testInitialJacobianEvaluationCount() throws Exception {
        assertEquals(0, new GaussNewtonOptimizer().getJacobianEvaluations());
    }

    @Test
    public void testConfiguredWeightSquareRoot() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {x[0], x[1]}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) {
                            return new double[][] {{1, 0}, {0, 1}};
                        }
                    };
                }
            };
        optimizer.optimize(20, f, new double[] {0, 0},
                           new double[] {4, 9}, new double[] {0, 0});
        RealMatrix root = optimizer.getWeightSquareRoot();
        assertEquals(2.0, root.getEntry(0, 0), 0.0);
        assertEquals(3.0, root.getEntry(1, 1), 0.0);
        assertEquals(0.0, root.getEntry(0, 1), 0.0);
        assertEquals(0.0, root.getEntry(1, 0), 0.0);
    }

    @Test
    public void testConfiguredIdentityWeightRoot() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {x[0]}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) { return new double[][] {{1}}; }
                    };
                }
            };
        optimizer.optimize(20, f, new double[] {0}, new double[] {1},
                           new double[] {0});
        assertEquals(1.0, optimizer.getWeightSquareRoot().getEntry(0, 0), 0.0);
    }

    @Test
    public void testCovarianceAndSigmaForTwoParameters() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {x[0], x[1]}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) {
                            return new double[][] {{1, 0}, {0, 1}};
                        }
                    };
                }
            };
        optimizer.optimize(20, f, new double[] {0, 0},
                           new double[] {1, 1}, new double[] {0, 0});
        double[][] cov = optimizer.computeCovariances(new double[] {2, 3}, 1e-14);
        assertEquals(1.0, cov[0][0], 1e-12);
        assertEquals(1.0, cov[1][1], 1e-12);
        assertEquals(0.0, cov[0][1], 1e-12);
        assertEquals(1.0, optimizer.computeSigma(new double[] {2, 3}, 1e-14)[0], 1e-12);
    }

    @Test
    public void testCovariancesForScaledSingleParameter() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {2 * x[0]}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) { return new double[][] {{2}}; }
                    };
                }
            };
        optimizer.optimize(20, f, new double[] {0}, new double[] {1},
                           new double[] {0});
        assertEquals(0.25,
                     optimizer.computeCovariances(new double[] {1}, 1e-14)[0][0],
                     1e-12);
        assertEquals(0.5, optimizer.computeSigma(new double[] {1}, 1e-14)[0], 1e-12);
    }

    @Test
    public void testChiSquareFromZeroCost() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {x[0]}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) { return new double[][] {{1}}; }
                    };
                }
            };
        optimizer.optimize(20, f, new double[] {1}, new double[] {1},
                           new double[] {1});
        assertEquals(0.0, optimizer.getChiSquare(), 0.0);
    }

    @Test
    public void testChiSquareFromNonzeroResidual() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {x[0], 0}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) {
                            return new double[][] {{1}, {0}};
                        }
                    };
                }
            };
        optimizer.optimize(20, f, new double[] {1, 3}, new double[] {1, 1},
                           new double[] {0});
        assertEquals(9.0, optimizer.getChiSquare(), 1e-12);
    }

    @Test
    public void testRmsUsesMeasurementCount() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {x[0], 0}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) {
                            return new double[][] {{1}, {0}};
                        }
                    };
                }
            };
        optimizer.optimize(20, f, new double[] {1, 3}, new double[] {1, 1},
                           new double[] {0});
        assertEquals(3.0 / Math.sqrt(2.0), optimizer.getRMS(), 1e-12);
    }

    @Test
    public void testOptimizeFitsSingleObservation() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {2 * x[0]}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) { return new double[][] {{2}}; }
                    };
                }
            };
        PointVectorValuePair result = optimizer.optimize(20, f,
            new double[] {6}, new double[] {1}, new double[] {0});
        assertEquals(3.0, result.getPoint()[0], 1e-10);
        assertEquals(6.0, result.getValue()[0], 1e-10);
    }

    @Test
    public void testOptimizeUsesNonUnitWeight() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {x[0], x[0]}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) {
                            return new double[][] {{1}, {1}};
                        }
                    };
                }
            };
        PointVectorValuePair result = optimizer.optimize(100, f,
            new double[] {2, 8}, new double[] {1, 3}, new double[] {0});
        assertEquals(6.5, result.getPoint()[0], 1e-10);
    }

    @Test
    public void testOptimizeWithMultipleParameters() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {x[0], x[1]}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) {
                            return new double[][] {{1, 0}, {0, 1}};
                        }
                    };
                }
            };
        PointVectorValuePair result = optimizer.optimize(20, f,
            new double[] {4, -2}, new double[] {1, 1}, new double[] {0, 0});
        assertEquals(4.0, result.getPoint()[0], 1e-10);
        assertEquals(-2.0, result.getPoint()[1], 1e-10);
    }

    @Test
    public void testWeightRootIsReturnedAsIndependentCopy() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {x[0]}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) { return new double[][] {{1}}; }
                    };
                }
            };
        optimizer.optimize(20, f, new double[] {0}, new double[] {9},
                           new double[] {0});
        RealMatrix first = optimizer.getWeightSquareRoot();
        first.setEntry(0, 0, 100);
        assertEquals(3.0, optimizer.getWeightSquareRoot().getEntry(0, 0), 0.0);
    }

    @Test
    public void testJacobianCountAfterCovarianceComputations() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) { return new double[] {x[0]}; }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) { return new double[][] {{1}}; }
                    };
                }
            };
        optimizer.optimize(20, f, new double[] {0}, new double[] {1},
                           new double[] {0});
        int before = optimizer.getJacobianEvaluations();
        optimizer.computeCovariances(new double[] {1}, 1e-14);
        assertEquals(before + 1, optimizer.getJacobianEvaluations());
    }

    @Test
    public void testCovarianceForRankDeficientJacobian() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer();
        DifferentiableMultivariateVectorFunction f =
            new DifferentiableMultivariateVectorFunction() {
                public double[] value(double[] x) {
                    return new double[] {x[0] + x[1], 2 * (x[0] + x[1])};
                }
                public org.apache.commons.math3.analysis.MultivariateMatrixFunction
                    jacobian() {
                    return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
                        public double[][] value(double[] x) {
                            return new double[][] {{1, 1}, {2, 2}};
                        }
                    };
                }
            };
        optimizer.optimize(20, f, new double[] {0, 0}, new double[] {1, 1},
                           new double[] {0, 0});
        double[][] covariance = optimizer.computeCovariances(new double[] {0, 0}, 0.0);
        assertEquals(2, covariance.length);
        assertEquals(2, optimizer.getJacobianEvaluations());
    }
}
