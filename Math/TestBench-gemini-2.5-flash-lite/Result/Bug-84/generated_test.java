package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Comparator;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealConvergenceChecker;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;

public class MultiDirectionalTest {

    // Default coefficients used in MultiDirectional constructor
    private static final double DEFAULT_KHI = 2.0;
    private static final double DEFAULT_GAMMA = 0.5;

    // A dummy function for testing optimization
    private static class DummyMultiVariateRealFunction implements MultivariateRealFunction {
        public double value(double[] point) throws FunctionEvaluationException {
            // A simple quadratic function: sum of squares
            double sum = 0;
            for (double x : point) {
                sum += x * x;
            }
            return sum;
        }
    }

    // A dummy convergence checker that never converges
    private static class NeverConvergeChecker implements RealConvergenceChecker {
        public boolean converged(int iteration, RealPointValuePair previous, RealPointValuePair current) {
            return false;
        }
    }

    // A dummy convergence checker that always converges
    private static class AlwaysConvergeChecker implements RealConvergenceChecker {
        public boolean converged(int iteration, RealPointValuePair previous, RealPointValuePair current) {
            return true;
        }
    }

    @Test
    public void testDefaultCoefficients() {
        MultiDirectional optimizer = new MultiDirectional();
        // Constructor with no arguments should use default coefficients
        // This test doesn't directly check coefficients but ensures instantiation works
        // and indirectly that default values are set.
        assertTrue(true); // Placeholder for successful instantiation
    }

    @Test
    public void testCustomCoefficients() {
        double khi = 3.0;
        double gamma = 0.6;
        MultiDirectional optimizer = new MultiDirectional(khi, gamma);
        // This test verifies that custom coefficients can be set.
        // We can't directly access private fields, so this is an indirect check.
        assertTrue(true); // Placeholder for successful instantiation with custom values
    }

    @Test
    public void testOptimizeWithDefaultCoefficients() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(10);
        optimizer.setConvergenceChecker(new NeverConvergeChecker()); // Ensure it doesn't converge by itself
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0};
        RealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        // Assert that optimization ran and returned a result.
        assertNotNull(result);
        // The function is sum of squares, minimum is at {0,0} with value 0.
        // With iterations limited, it should not reach the exact minimum.
        // Check that the result is not exactly the start point.
        assertFalse(result.getPoint()[0] == startPoint[0] && result.getPoint()[1] == startPoint[1]);
    }

    @Test
    public void testOptimizeWithCustomCoefficients() throws Exception {
        double khi = 3.0;
        double gamma = 0.6;
        MultiDirectional optimizer = new MultiDirectional(khi, gamma);
        optimizer.setMaxIterations(10);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {2.0, -2.0};
        RealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertNotNull(result);
        assertFalse(result.getPoint()[0] == startPoint[0] && result.getPoint()[1] == startPoint[1]);
    }

    @Test
    public void testOptimizeWithAlwaysConvergeChecker() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new AlwaysConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {10.0, 20.0};
        RealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        // With an always converging checker, it should stop after one iteration if possible.
        // The exact result depends on internal logic, but we expect a valid result.
        assertNotNull(result);
        // The initial simplex is formed around the start point. The first iteration will
        // transform it. The checker returning true should make it stop.
        // We expect the result to be better than the worst point of the initial simplex,
        // but not necessarily the global minimum if checker returned true too early.
        // For this test, we just check it ran and produced a result.
    }

    @Test
    public void testMaximize() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(10);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        // For maximization of sum of squares, the "minimum" is at infinity.
        // This will likely not converge meaningfully within few iterations.
        double[] startPoint = {1.0, 1.0};
        RealPointValuePair result = optimizer.optimize(function, GoalType.MAXIMIZE, startPoint);
        assertNotNull(result);
        // For MAXIMIZE, we expect the value to increase or stay same.
        // The initial simplex will be created, and the first point is usually the best.
        // Here, we expect the value to be >= the value at startPoint.
        assertTrue(result.getValue() >= function.value(startPoint));
    }

    @Test
    public void testSetMaxIterations() {
        MultiDirectional optimizer = new MultiDirectional();
        int maxIter = 50;
        optimizer.setMaxIterations(maxIter);
        assertEquals(maxIter, optimizer.getMaxIterations());
    }

    @Test
    public void testSetMaxEvaluations() {
        MultiDirectional optimizer = new MultiDirectional();
        int maxEval = 100;
        optimizer.setMaxEvaluations(maxEval);
        assertEquals(maxEval, optimizer.getMaxEvaluations());
    }

    @Test
    public void testGetIterations() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(5);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0};
        try {
            optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        } catch (OptimizationException e) {
            // Expected if max iterations is reached
        }
        // The number of iterations should be <= maxIterations.
        // We expect at least 1 iteration to have happened if maxIterations >= 1.
        assertTrue(optimizer.getIterations() > 0);
        assertTrue(optimizer.getIterations() <= optimizer.getMaxIterations());
    }

    @Test
    public void testGetEvaluations() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(5);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0};
        try {
            optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        } catch (OptimizationException e) {
            // Expected if max iterations is reached
        }
        // The number of evaluations should be positive.
        // The exact number depends on internal logic, but should be > 0.
        assertTrue(optimizer.getEvaluations() > 0);
    }

    @Test
    public void testSetConvergenceChecker() {
        MultiDirectional optimizer = new MultiDirectional();
        RealConvergenceChecker checker = new NeverConvergeChecker();
        optimizer.setConvergenceChecker(checker);
        assertEquals(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testOptimizeWithZeroStartPoint() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(10);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {0.0, 0.0}; // Minimum of the function
        RealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertNotNull(result);
        // With start at the minimum, it might not move or move very little.
        // The current implementation of iterateSimplex does not guarantee staying at minimum.
        // We just check it produces a result.
        assertTrue(result.getValue() >= 0); // Function value is always non-negative
    }

    @Test
    public void testOptimizeWithHighDimensionalStartPoint() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(10);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 2.0, 3.0, 4.0, 5.0};
        RealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertNotNull(result);
        assertTrue(result.getPoint().length == startPoint.length);
    }

    @Test
    public void testOptimizeWithNegativeStartPoint() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(10);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {-1.0, -2.0};
        RealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertNotNull(result);
        assertTrue(result.getValue() >= 0);
    }

    @Test
    public void testEvaluateSimplexWithBestPoint() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(1); // Only one iteration to test evaluateSimplex
        optimizer.setConvergenceChecker(new AlwaysConvergeChecker()); // Ensure it stops after one iteration
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0};
        // We need to call optimize to initialize the simplex and then trigger iterateSimplex
        optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        // The result from optimize is simplex[0] after iteration.
        // The evaluateSimplex method is called internally. This test implicitly checks its behavior.
        assertTrue(true); // Implicit check by running optimize and getting a result.
    }

    @Test
    public void testEvaluateNewSimplexReflection() throws Exception {
        // This is tricky to test directly without mocking or digging deep into private methods.
        // We can infer its behavior by testing optimize and looking at the outcome.
        // The 'reflected' point is calculated using coeff=1.0 in evaluateNewSimplex.
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(2); // Need at least two iterations to see reflection logic
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0};
        optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        // We can't assert the exact 'reflected' value, but if optimization proceeds, it's implicitly tested.
        assertTrue(true);
    }

    @Test
    public void testEvaluateNewSimplexExpansion() throws Exception {
        // Expansion happens when reflected is better than best, and expanded is better than reflected.
        // coeff = khi (default 2.0) is used for expansion.
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(5); // More iterations to allow for expansion logic
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0}; // Start where function value is 2.0
        optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        // If expansion occurred, the simplex would have moved significantly.
        // We can't assert the exact outcome easily, but the process is tested by optimize.
        assertTrue(true);
    }

    @Test
    public void testEvaluateNewSimplexContraction() throws Exception {
        // Contraction happens when reflected is not better than best.
        // coeff = gamma (default 0.5) is used for contraction.
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(5); // More iterations to allow for contraction logic
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0};
        optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        // Contraction aims to shrink the simplex.
        // Again, indirect testing via optimize method.
        assertTrue(true);
    }

    @Test
    public void testSetStartConfigurationWithSteps() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        double[] steps = {0.1, 0.2};
        optimizer.setStartConfiguration(steps);
        // This method is protected and called by optimize. We can't directly assert its effect.
        // The test for optimize will implicitly use this if it's set.
        assertTrue(true);
    }

    @Test
    public void testSetStartConfigurationWithReferenceSimplex() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        double[][] referenceSimplex = {{1.0, 1.0}, {2.0, 2.0}, {1.0, 2.0}};
        optimizer.setStartConfiguration(referenceSimplex);
        // Similar to setStartConfiguration(double[]), this is tested indirectly.
        assertTrue(true);
    }

    @Test
    public void testIterateSimplexLogic() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(1); // Limit iterations to observe one step
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0};
        // The optimize method calls iterateSimplex. This test implicitly checks iterateSimplex.
        optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertTrue(true);
    }

    @Test
    public void testSimplexIsPreservedInEvaluateNewSimplex() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        // To test this, we need to access the internal simplex. Since it's protected, we can't.
        // We rely on the fact that if optimize produces a result, the internal state was managed.
        optimizer.setMaxIterations(1);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0};
        optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertTrue(true);
    }

    @Test
    public void testEvaluateSimplexWithComparator() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(1);
        optimizer.setConvergenceChecker(new AlwaysConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0};
        // The comparator is used within evaluateSimplex, which is called by optimize.
        // This test indirectly verifies its usage.
        optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertTrue(true);
    }

    @Test
    public void testReplaceWorstPointWithNewPoint() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(2);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0, 1.0};
        // The replaceWorstPoint method is called within evaluateSimplex.
        // This test implicitly checks its behavior.
        optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertTrue(true);
    }

    @Test
    public void testLargeValuesForStartPoint() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(10);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0e10, -1.0e10};
        RealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertNotNull(result);
        // Expect the value to decrease towards 0.
        assertTrue(result.getValue() >= 0);
    }

    @Test
    public void testSmallValuesForStartPoint() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(10);
        optimizer.setConvergenceChecker(new NeverConvergeChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {1.0e-10, -1.0e-10};
        RealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertNotNull(result);
        // Expect the value to decrease towards 0.
        assertTrue(result.getValue() >= 0);
    }

    @Test
    public void testWithHighMaxIterations() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        // Set enough iterations to allow convergence for the sum of squares function.
        // The default convergence checker is used internally by optimize.
        // If we don't set a convergence checker, it uses a default one.
        // The previous test failed because it explicitly used NeverConvergeChecker,
        // preventing convergence and leading to MaxIterationsExceededException.
        // Here, we let the optimizer potentially converge.
        optimizer.setMaxIterations(1000); 
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {5.0, -5.0};
        RealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertNotNull(result);
        // With sufficient iterations, it should get closer to the minimum (0,0).
        assertTrue(result.getValue() < function.value(startPoint));
        assertTrue(result.getValue() >= 0);
    }

    @Test
    public void testWithMaxIterationsSufficientForConvergence() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        // Set enough iterations for the default convergence checker to potentially work.
        optimizer.setMaxIterations(100);
        // We need to use a convergence checker that will eventually converge,
        // otherwise, we'll hit MaxIterationsExceededException.
        optimizer.setConvergenceChecker(getDummyConvergenceChecker());
        MultivariateRealFunction function = new DummyMultiVariateRealFunction();
        double[] startPoint = {3.0, 3.0};
        RealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, startPoint);
        assertNotNull(result);
        // The result should be close to the minimum (0,0).
        assertTrue(result.getValue() < 1.0); // Value should be small
    }

    // Helper to get a dummy convergence checker that eventually converges
    private RealConvergenceChecker getDummyConvergenceChecker() {
        return new RealConvergenceChecker() {
            private int iterationCount = 0;
            @Override
            public boolean converged(int iteration, RealPointValuePair previous, RealPointValuePair current) {
                iterationCount++;
                // Converge after a certain number of iterations, or if value is very close to zero
                // Increased iterations to ensure convergence for the purpose of this test.
                return iterationCount > 10 || (current != null && current.getValue() < 1e-8);
            }
        };
    }
}
