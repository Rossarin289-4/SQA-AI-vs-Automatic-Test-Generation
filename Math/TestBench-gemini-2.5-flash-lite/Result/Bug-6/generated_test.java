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

    // Mock ConvergenceChecker for testing purposes
    private static class TestConvergenceChecker implements ConvergenceChecker<PointValuePair> {
        private int maxIterations;
        private double threshold;
        private boolean checkIterations;

        TestConvergenceChecker(int maxIterations, double threshold) {
            this.maxIterations = maxIterations;
            this.threshold = threshold;
            this.checkIterations = true;
        }

        TestConvergenceChecker(double threshold) {
            this.threshold = threshold;
            this.checkIterations = false;
        }

        @Override
        public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
            if (checkIterations && iteration >= maxIterations) {
                return true;
            }
            if (previous == null || current == null) {
                return false;
            }
            double prevValue = previous.getValue();
            double currValue = current.getValue();
            return Math.abs(prevValue - currValue) < threshold;
        }
    }

    // Mock OptimizationData for testing purposes
    private static class MockOptimizationData implements OptimizationData {
        private final String name;

        MockOptimizationData(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Dummy implementation of a concrete optimizer for testing BaseOptimizer's optimize method
    private static class DummyOptimizer extends BaseOptimizer<PointValuePair> {
        private OptimizationData[] lastOptData = null;
        private boolean doOptimizeCalled = false;
        private int evaluationsIncremented = 0;
        private int iterationsIncremented = 0;
        private boolean optimizeCalled = false;

        protected DummyOptimizer(ConvergenceChecker<PointValuePair> checker) {
            super(checker);
        }

        @Override
        public PointValuePair optimize(OptimizationData... optData) throws TooManyEvaluationsException, TooManyIterationsException {
            optimizeCalled = true;
            // Need to call parseOptimizationData and reset counters as optimize() does.
            parseOptimizationData(optData);
            evaluations.resetCount();
            iterations.resetCount();
            return doOptimize();
        }

        @Override
        protected PointValuePair doOptimize() throws TooManyEvaluationsException, TooManyIterationsException {
            doOptimizeCalled = true;
            // Simulate incrementing counters within doOptimize
            // These increments are conceptual; the actual counters are managed by BaseOptimizer.
            evaluations.incrementCount();
            iterations.incrementCount();
            evaluationsIncremented++; // Track actual increments
            iterationsIncremented++; // Track actual increments
            // Return a dummy result. The actual logic of doOptimize is not tested here.
            return new PointValuePair(new double[]{1.0, 2.0}, 3.0);
        }

        @Override
        protected void parseOptimizationData(OptimizationData... optData) {
            super.parseOptimizationData(optData); // Call super to handle base class options
            this.lastOptData = optData;
        }

        public OptimizationData[] getLastOptData() {
            return lastOptData;
        }

        public boolean isDoOptimizeCalled() {
            return doOptimizeCalled;
        }

        public int getEvaluationsIncremented() {
            return evaluationsIncremented;
        }

        public int getIterationsIncremented() {
            return iterationsIncremented;
        }

        public boolean isOptimizeCalled() {
            return optimizeCalled;
        }
    }

    @Test
    public void testGetMaxEvaluationsDefault() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        // Default max evaluations should be Integer.MAX_VALUE
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
    }

    @Test
    public void testGetEvaluationsInitial() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        // Initial evaluations count should be 0
        assertEquals(0, optimizer.getEvaluations());
    }

    @Test
    public void testGetEvaluationsAfterOptimize() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        // Call optimize which internally calls doOptimize, incrementing counters.
        // optimize() then resets counters before returning.
        optimizer.optimize(new MaxEval(100));
        // After optimize() returns, counters are reset.
        assertEquals(0, optimizer.getEvaluations());
    }

    @Test
    public void testGetMaxIterationsDefault() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        // Default max iterations should be Integer.MAX_VALUE
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxIterations());
    }

    @Test
    public void testGetIterationsInitial() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        // Initial iterations count should be 0
        assertEquals(0, optimizer.getIterations());
    }


    @Test
    public void testGetConvergenceChecker() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        // The checker passed to the constructor should be returned by getConvergenceChecker()
        assertEquals(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testOptimizeWithMaxEval() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        OptimizationData[] optData = { new MaxEval(100) };
        optimizer.optimize(optData);
        assertTrue(optimizer.isDoOptimizeCalled());
        assertTrue(optimizer.getLastOptData().length > 0);
        boolean foundMaxEval = false;
        for (OptimizationData data : optimizer.getLastOptData()) {
            if (data instanceof MaxEval) {
                assertEquals(100, ((MaxEval) data).getMaxEval());
                foundMaxEval = true;
                break;
            }
        }
        assertTrue("MaxEval optimization data not found", foundMaxEval);
    }


    @Test
    public void testOptimizeWithConvergenceChecker() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new TestConvergenceChecker(10, 1e-5);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        optimizer.optimize(new MaxEval(100));
        // The checker passed to the optimizer should be used.
        assertEquals(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testOptimizeResetsCounters() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);

        // Call optimize, which internally calls doOptimize and then resets counters.
        optimizer.optimize(new MaxEval(10));
        // Counters are reset to 0 by optimize() before returning.
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testOptimizeWithMultipleData() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        // NonLinearConjugateGradientOptimizer.BracketingStep is a valid OptimizationData.
        OptimizationData[] optData = {
            new MaxEval(100),
            new NonLinearConjugateGradientOptimizer.BracketingStep(1.5)
        };
        optimizer.optimize(optData);
        assertTrue(optimizer.isDoOptimizeCalled());
        boolean foundMaxEval = false;
        for (OptimizationData data : optimizer.getLastOptData()) {
            if (data instanceof MaxEval) {
                assertEquals(100, ((MaxEval) data).getMaxEval());
                foundMaxEval = true;
                break;
            }
        }
        assertTrue("MaxEval optimization data not found", foundMaxEval);

        boolean foundBracketingStep = false;
        for (OptimizationData data : optimizer.getLastOptData()) {
            if (data instanceof NonLinearConjugateGradientOptimizer.BracketingStep) {
                assertEquals(1.5, ((NonLinearConjugateGradientOptimizer.BracketingStep) data).getBracketingStep(), 1e-9);
                foundBracketingStep = true;
                break;
            }
        }
        assertTrue(" BracketingStep optimization data not found", foundBracketingStep);
    }

    @Test
    public void testOptimizeWithoutData() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        optimizer.optimize(); // Call optimize with no arguments
        assertTrue(optimizer.isDoOptimizeCalled());
        assertNotNull(optimizer.getLastOptData());
        assertEquals(0, optimizer.getLastOptData().length);
        // Default values should be used when no OptimizationData is provided
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxIterations());
    }

    @Test
    public void testBaseOptimizerConstructor() throws Exception {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        assertNotNull(optimizer.getConvergenceChecker());
        // Default values for max evaluations and iterations are Integer.MAX_VALUE
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxIterations());
        // Initial counts are 0
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
    }





    private static class TestBaseOptimizer extends BaseOptimizer<PointValuePair> {
        private OptimizationData[] parsedData = null;

        protected TestBaseOptimizer(ConvergenceChecker<PointValuePair> checker) {
            super(checker);
        }

        @Override
        protected PointValuePair doOptimize() throws TooManyEvaluationsException, TooManyIterationsException {
            // This method is not directly tested here.
            // It's called by optimize(), and we're testing parseOptimizationData.
            // A null return is acceptable for this test context.
            return null;
        }

        @Override
        protected void parseOptimizationData(OptimizationData... optData) {
            super.parseOptimizationData(optData); // Crucial to call super to process MaxEval/MaxIter
            this.parsedData = optData;
        }

        public OptimizationData[] getParsedData() {
            return parsedData;
        }

        public int getParsedMaxEval() {
            return evaluations.getMaximalCount();
        }

        public int getParsedMaxIter() {
            return iterations.getMaximalCount();
        }
    }

    @Test
    public void testParseOptimizationDataMaxEval() {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        TestBaseOptimizer optimizer = new TestBaseOptimizer(checker);
        optimizer.parseOptimizationData(new MaxEval(150));
        // After parsing, getMaxEvaluations() should reflect the set value.
        assertEquals(150, optimizer.getMaxEvaluations());
        assertEquals(150, optimizer.getParsedMaxEval());
    }



    @Test
    public void testParseOptimizationDataOverride() {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        TestBaseOptimizer optimizer = new TestBaseOptimizer(checker);
        optimizer.parseOptimizationData(new MaxEval(100));
        assertEquals(100, optimizer.getMaxEvaluations());
        optimizer.parseOptimizationData(new MaxEval(200)); // Override
        assertEquals(200, optimizer.getMaxEvaluations());
    }

    @Test
    public void testParseOptimizationDataWithoutMaxValues() {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        TestBaseOptimizer optimizer = new TestBaseOptimizer(checker);
        optimizer.parseOptimizationData(new MockOptimizationData("dummy"));
        // When no MaxEval/MaxIter is provided, they should retain their default MAX_VALUE.
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxIterations());
    }

    @Test
    public void testGetBracketingStep() throws TooManyEvaluationsException, TooManyIterationsException {
        // Instantiate NonLinearConjugateGradientOptimizer via its public constructor.
        NonLinearConjugateGradientOptimizer optimizer = new NonLinearConjugateGradientOptimizer(
                NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES,
                new SimpleValueChecker(1e-9, 1e-9),
                new BrentSolver(),
                new NonLinearConjugateGradientOptimizer.IdentityPreconditioner()
        );
        // BracketingStep is an OptimizationData, it's used in optimize().
        // The value is stored internally by the optimizer if parsed.
        // We test the data class itself.
        NonLinearConjugateGradientOptimizer.BracketingStep stepData = new NonLinearConjugateGradientOptimizer.BracketingStep(5.0);
        assertEquals(5.0, stepData.getBracketingStep(), 1e-9);
    }

    @Test
    public void testPreconditionerIdentity() {
        NonLinearConjugateGradientOptimizer.IdentityPreconditioner preconditioner = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
        double[] variables = {1.0, 2.0};
        double[] r = {3.0, 4.0};
        double[] result = preconditioner.precondition(variables, r);
        assertArrayEquals(r, result, 1e-9);
        assertNotSame(r, result); // Should return a clone
    }

    // Tests for CMAESOptimizer statistics and constructors
    @Test
    public void testCMAESOptimizerStatisticsInitialization() {
        RandomGenerator rg = new org.apache.commons.math3.random.Well19937c(1L);
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        // Constructor requires specific values.
        CMAESOptimizer optimizer = new CMAESOptimizer(
                1000, 0, true, 0, 5, rg, true, checker);
        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testSigmaConstructorValid() {
        double[] s = {1.0, 2.0};
        CMAESOptimizer.Sigma sigma = new CMAESOptimizer.Sigma(s);
        assertArrayEquals(s, sigma.getSigma(), 1e-9);
    }

    @Test(expected = NotPositiveException.class)
    public void testSigmaConstructorInvalid() {
        double[] s = {1.0, -2.0};
        new CMAESOptimizer.Sigma(s);
    }

    @Test
    public void testPopulationSizeConstructorValid() {
        CMAESOptimizer.PopulationSize ps = new CMAESOptimizer.PopulationSize(10);
        assertEquals(10, ps.getPopulationSize());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSizeConstructorInvalid() {
        new CMAESOptimizer.PopulationSize(0);
    }

    // Tests for PowellOptimizer constructors
    @Test
    public void testPowellOptimizerConstructors() {
        ConvergenceChecker<PointValuePair> checker1 = new SimpleValueChecker(1e-9, 1e-9);
        PowellOptimizer opt1 = new PowellOptimizer(1e-3, 1e-5, checker1);
        assertNotNull(opt1);
        assertEquals(checker1, opt1.getConvergenceChecker());

        PowellOptimizer opt2 = new PowellOptimizer(1e-3, 1e-5);
        assertNotNull(opt2);
        assertNull(opt2.getConvergenceChecker());

        ConvergenceChecker<PointValuePair> checker3 = new SimpleValueChecker(1e-10, 1e-10);
        PowellOptimizer opt3 = new PowellOptimizer(1e-2, 1e-4, 1e-1, 1e-2, checker3);
        assertNotNull(opt3);
        assertEquals(checker3, opt3.getConvergenceChecker());

        PowellOptimizer opt4 = new PowellOptimizer(1e-2, 1e-4, 1e-1, 1e-2);
        assertNotNull(opt4);
        assertNull(opt4.getConvergenceChecker());
    }

    // Test for PowellOptimizer checkParameters() - cannot be directly tested via public API
    // as bounds cannot be set publicly.

    // Tests for SimplexOptimizer constructors
    @Test
    public void testSimplexOptimizerConstructors() {
        ConvergenceChecker<PointValuePair> checker1 = new SimpleValueChecker(1e-9, 1e-9);
        SimplexOptimizer opt1 = new SimplexOptimizer(checker1);
        assertNotNull(opt1);
        assertEquals(checker1, opt1.getConvergenceChecker());

        SimplexOptimizer opt2 = new SimplexOptimizer(1e-3, 1e-5);
        assertNotNull(opt2);
        assertTrue(opt2.getConvergenceChecker() instanceof SimpleValueChecker);
    }

    // Test for SimplexOptimizer checkParameters() - throws exceptions based on setup
    @Test(expected = NullArgumentException.class)
    public void testSimplexOptimizerCheckParametersNoSimplex() {
        SimplexOptimizer optimizer = new SimplexOptimizer(new SimpleValueChecker(1e-9, 1e-9));
        // Calling optimize without providing an AbstractSimplex via OptimizationData
        // will result in a NullArgumentException from checkParameters.
        optimizer.optimize(new MaxEval(10));
    }

    // Test for GaussNewtonOptimizer constructor

    // Test for LevenbergMarquardtOptimizer constructors

    @Test
    public void testBracketingStepGet() {
        NonLinearConjugateGradientOptimizer.BracketingStep stepData = new NonLinearConjugateGradientOptimizer.BracketingStep(1.23);
        assertEquals(1.23, stepData.getBracketingStep(), 1e-9);
    }

    @Test
    public void testSigmaGet() {
        double[] s = {1.0, 2.0};
        CMAESOptimizer.Sigma sigma = new CMAESOptimizer.Sigma(s);
        assertArrayEquals(s, sigma.getSigma(), 1e-9);
    }

    @Test
    public void testPopulationSizeGet() {
        CMAESOptimizer.PopulationSize ps = new CMAESOptimizer.PopulationSize(15);
        assertEquals(15, ps.getPopulationSize());
    }

    // CMAESOptimizer.DoubleIndex is an inner class, cannot be instantiated directly.
    // Its comparability is tested indirectly via the sorting mechanism.
    // Test logic is deferred to tests that indirectly use it, or omitted if not directly testable.

    // SimplexOptimizer.Comparator is an inner class. Direct testing is not feasible.
    // Logic is noted and implicitly covered by tests on SimplexOptimizer.

    @Test
    public void testGetConvergenceCheckerReturnsSetChecker() {
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-9, 1e-9);
        DummyOptimizer optimizer = new DummyOptimizer(checker);
        assertSame(checker, optimizer.getConvergenceChecker());
    }

}
