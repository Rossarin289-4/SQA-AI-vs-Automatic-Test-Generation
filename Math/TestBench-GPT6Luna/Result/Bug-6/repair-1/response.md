```java
package org.apache.commons.math3.optim;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer;
import org.apache.commons.math3.util.FastMath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.univariate.BracketFinder;
import org.apache.commons.math3.optim.univariate.BrentOptimizer;
import org.apache.commons.math3.optim.univariate.UnivariatePointValuePair;
import org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker;
import org.apache.commons.math3.optim.univariate.SearchInterval;
import org.apache.commons.math3.optim.univariate.UnivariateObjectiveFunction;
import java.util.Comparator;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer;
import org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer;

public class BaseOptimizerTest {
    @Test
    public void testIdentityPreconditionerCopiesValues() throws Exception {
        NonLinearConjugateGradientOptimizer.IdentityPreconditioner p =
            new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] input = {2, -3};
        double[] result = p.precondition(new double[] {9, 8}, input);
        assertArrayEquals(new double[] {2, -3}, result, 0);
        result[0] = 100;
        assertEquals(2, input[0], 0);
    }

    @Test
    public void testBracketingStepStoresZero() throws Exception {
        NonLinearConjugateGradientOptimizer.BracketingStep step =
            new NonLinearConjugateGradientOptimizer.BracketingStep(0);
        assertEquals(0, step.getBracketingStep(), 0);
    }

    @Test
    public void testBracketingStepStoresNegativeValue() throws Exception {
        NonLinearConjugateGradientOptimizer.BracketingStep step =
            new NonLinearConjugateGradientOptimizer.BracketingStep(-2);
        assertEquals(-2, step.getBracketingStep(), 0);
    }

    @Test
    public void testBracketingStepStoresPositiveValue() throws Exception {
        NonLinearConjugateGradientOptimizer.BracketingStep step =
            new NonLinearConjugateGradientOptimizer.BracketingStep(3);
        assertEquals(3, step.getBracketingStep(), 0);
    }

    @Test
    public void testSigmaDefensiveCopyOnInputAndOutput() throws Exception {
        double[] source = {1, 2};
        CMAESOptimizer.Sigma sigma = new CMAESOptimizer.Sigma(source);
        source[0] = 7;
        double[] returned = sigma.getSigma();
        assertArrayEquals(new double[] {1, 2}, returned, 0);
        returned[1] = 9;
        assertArrayEquals(new double[] {1, 2}, sigma.getSigma(), 0);
    }

    @Test
    public void testSigmaAcceptsZero() throws Exception {
        CMAESOptimizer.Sigma sigma = new CMAESOptimizer.Sigma(new double[] {0});
        assertArrayEquals(new double[] {0}, sigma.getSigma(), 0);
    }

    @Test
    public void testSigmaRejectsNegativeValue() throws Exception {
        try {
            new CMAESOptimizer.Sigma(new double[] {-1});
            fail("expected NotPositiveException");
        } catch (NotPositiveException expected) {
        }
    }

    @Test
    public void testPopulationSizeOne() throws Exception {
        assertEquals(1, new CMAESOptimizer.PopulationSize(1).getPopulationSize());
    }

    @Test
    public void testPopulationSizeRejectsZero() throws Exception {
        try {
            new CMAESOptimizer.PopulationSize(0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
        }
    }

    @Test
    public void testPopulationSizeRejectsNegative() throws Exception {
        try {
            new CMAESOptimizer.PopulationSize(-1);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
        }
    }

    @Test
    public void testCmaesStatisticsHistoriesStartEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(1, 0, false, 0, 0, null, true, null);
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testPowellAcceptsRelativeThresholdAtMinimum() throws Exception {
        PowellOptimizer optimizer = new PowellOptimizer(2 * Math.ulp(1d), 1);
        assertNotNull(optimizer);
    }

    @Test
    public void testPowellRejectsRelativeThresholdBelowMinimum() throws Exception {
        try {
            new PowellOptimizer(Math.ulp(1d), 1);
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) {
        }
    }

    @Test
    public void testPowellRejectsZeroAbsoluteThreshold() throws Exception {
        try {
            new PowellOptimizer(1e-8, 0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
        }
    }

    @Test
    public void testPowellRejectsNegativeAbsoluteThreshold() throws Exception {
        try {
            new PowellOptimizer(1e-8, -1);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
        }
    }

    @Test
    public void testSimplexOptimizerConstructionWithThresholds() throws Exception {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-8, 1e-8);
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxIterations());
    }

    @Test
    public void testNonlinearConjugateGradientDefaultLimits() throws Exception {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES, null);
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxIterations());
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testGaussNewtonConstructionInitialCounts() throws Exception {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true, null);
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testLevenbergMarquardtConstructionInitialCounts() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
        assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testOptimizerGettersReturnConfiguredChecker() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new ConvergenceChecker<PointValuePair>() {
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                return false;
            }
        };
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE, checker);
        assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testMaxEvalCallbackThrowsAtTheLimit() throws Exception {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES, null);
        try {
            optimizer.optimize(new MaxEval(1), new MaxIter(1));
            fail("expected TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expected) {
            assertEquals(1, optimizer.getEvaluations());
        }
    }

    @Test
    public void testOptimizationResetCountsAcrossCalls() throws Exception {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES, null);
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxIterations());
        try {
            optimizer.optimize(new MaxEval(1), new MaxIter(1));
            fail("expected TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expected) {
            assertEquals(1, optimizer.getEvaluations());
            assertEquals(1, optimizer.getIterations());
        }
    }

    @Test
    public void testCmaesEmptyStatisticsAreMutable() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(1, 0, false, 0, 0, null, true, null);
        optimizer.getStatisticsFitnessHistory().add(2.0);
        assertEquals(1, optimizer.getStatisticsFitnessHistory().size());
        assertEquals(2.0, optimizer.getStatisticsFitnessHistory().get(0), 0);
    }

    @Test
    public void testSimplexOptimizationRequiresSimplex() throws Exception {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-8, 1e-8);
        try {
            optimizer.optimize(new MaxEval(1));
            fail("expected NullArgumentException");
        } catch (NullArgumentException expected) {
            assertEquals(0, optimizer.getEvaluations());
        }
    }

    @Test
    public void testPowellOptimizeHasEvaluationLimit() throws Exception {
        PowellOptimizer optimizer = new PowellOptimizer(1e-8, 1e-8);
        try {
            optimizer.optimize(new MaxEval(1));
            fail("expected exception");
        } catch (NullArgumentException expected) {
            assertEquals(0, optimizer.getEvaluations());
        } catch (TooManyEvaluationsException expected) {
            assertEquals(1, optimizer.getEvaluations());
        }
    }

    @Test
    public void testCmaesOptimizationNeedsInitialState() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(1, 0, false, 0, 0, null, true, null);
        try {
            optimizer.optimize(new MaxEval(1), new MaxIter(1));
            fail("expected exception");
        } catch (NullArgumentException expected) {
            assertEquals(0, optimizer.getEvaluations());
        } catch (NullPointerException expected) {
            assertEquals(0, optimizer.getEvaluations());
        }
    }

    @Test
    public void testLevenbergMarquardtCanOptimizeWithZeroDimensionsNotApplicable() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxIterations());
    }
}
```