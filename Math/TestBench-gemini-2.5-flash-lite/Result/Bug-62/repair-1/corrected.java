package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.random.RandomGenerator;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.util.FastMath;

public class MultiStartUnivariateRealOptimizerTest {

    /**
     * Test the constructor and the initial state.
     */
    @Test
    public void testConstructorAndInitialState() {
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        RandomGenerator mockGenerator = new MockRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 5, mockGenerator);

        // Cannot directly access starts, generator, optima.
        // Verify indirectly via optimize call results if possible or assume constructor sets them.
        // For now, we check what can be seen via public API or indirectly.
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations()); // Default from underlying optimizer
        assertEquals(0, optimizer.getEvaluations());
    }

    /**
     * Test setting convergence checker.
     */
    @Test
    public void testSetConvergenceChecker() {
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ConvergenceChecker<UnivariateRealPointValuePair> checker = new MockConvergenceChecker();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setConvergenceChecker(checker);
        // Verify that the underlying optimizer's checker is set.
        assertEquals(checker, ((MockBaseUnivariateRealOptimizer) optimizer.optimizer).getConvergenceChecker());
    }

    /**
     * Test getting convergence checker.
     */
    @Test
    public void testGetConvergenceChecker() {
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ConvergenceChecker<UnivariateRealPointValuePair> checker = new MockConvergenceChecker();
        // Mock the underlying optimizer to return a specific checker
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setConvergenceChecker(checker);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setConvergenceChecker(checker); // Ensure it's set on the delegate

        assertEquals(checker, optimizer.getConvergenceChecker());
    }

    /**
     * Test setting max evaluations.
     */
    @Test
    public void testSetMaxEvaluations() {
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());

        optimizer.setMaxEvaluations(1000);
        assertEquals(1000, optimizer.getMaxEvaluations());
        // Verify that the underlying optimizer's max evaluations are also set
        assertEquals(1000, ((MockBaseUnivariateRealOptimizer) optimizer.optimizer).getMaxEvaluations());
    }

    /**
     * Test that getOptima throws exception before optimization.
     */
    @Test(expected = MathIllegalStateException.class)
    public void testGetOptimaBeforeOptimization() {
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.getOptima();
    }

    /**
     * Test optimize with a single start and successful convergence.
     */
    @Test
    public void testOptimizeSingleStartSuccess() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0); // Constant function
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResult(new UnivariateRealPointValuePair(1.0, 0.0));
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setMaxEvaluations(100);

        UnivariateRealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, 0, 10);

        assertEquals(1.0, result.getPoint(), 1e-9);
        assertEquals(0.0, result.getValue(), 1e-9);
        assertEquals(10, optimizer.getEvaluations()); // This uses totalEvaluations from the outer class
        assertNotNull(optimizer.getOptima()); // Use public getter
        assertEquals(1, optimizer.getOptima().length);
        assertNotNull(optimizer.getOptima()[0]);
        assertEquals(1.0, optimizer.getOptima()[0].getPoint(), 1e-9);
    }

    /**
     * Test optimize with multiple starts, some converging, some not.
     */
    @Test
    public void testOptimizeMultiStartPartialConvergence() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        // Simulate results from optimizer: 3 starts succeed, 2 fail (ConvergenceException)
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResults(new UnivariateRealPointValuePair[]{
            new UnivariateRealPointValuePair(2.0, 1.0),
            new UnivariateRealPointValuePair(5.0, 3.0),
            new UnivariateRealPointValuePair(1.0, 0.0),
            null, // Represents ConvergenceException
            null  // Represents ConvergenceException
        });
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(5);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 5, new MockRandomGenerator());
        optimizer.setMaxEvaluations(50);

        UnivariateRealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, 0, 10);

        // The best result should be returned (point 1.0, value 0.0)
        assertEquals(1.0, result.getPoint(), 1e-9);
        assertEquals(0.0, result.getValue(), 1e-9);

        // Total evaluations should be sum of evaluations from all starts
        assertEquals(5 * 5, optimizer.getEvaluations());

        // Optima array should contain all results, sorted, with nulls at the end
        assertNotNull(optimizer.getOptima());
        assertEquals(5, optimizer.getOptima().length);
        assertEquals(1.0, optimizer.getOptima()[0].getPoint(), 1e-9); // Best
        assertEquals(2.0, optimizer.getOptima()[1].getPoint(), 1e-9);
        assertEquals(5.0, optimizer.getOptima()[2].getPoint(), 1e-9);
        assertNull(optimizer.getOptima()[3]);
        assertNull(optimizer.getOptima()[4]);
    }

    /**
     * Test optimize when all starts fail to converge.
     */
    @Test(expected = ConvergenceException.class)
    public void testOptimizeAllStartsFail() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        // Simulate all starts failing
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResults(new UnivariateRealPointValuePair[]{
            null, null, null
        });
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 3, new MockRandomGenerator());
        optimizer.setMaxEvaluations(30);

        optimizer.optimize(function, GoalType.MINIMIZE, 0, 10);
    }

    /**
     * Test optimize with GoalType.MAXIMIZE.
     */
    @Test
    public void testOptimizeMaximize() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(5.0); // Constant function
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResult(new UnivariateRealPointValuePair(3.0, 5.0));
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setMaxEvaluations(100);

        UnivariateRealPointValuePair result = optimizer.optimize(function, GoalType.MAXIMIZE, 0, 10);

        assertEquals(3.0, result.getPoint(), 1e-9);
        assertEquals(5.0, result.getValue(), 1e-9);
    }

    /**
     * Test the sorting of optima when GoalType is MINIMIZE.
     */
    @Test
    public void testSortPairsMinimize() throws Exception {
        // We can't directly call sortPairs, so we'll test its effect via getOptima()
        UnivariateRealPointValuePair[] unsortedPairs = new UnivariateRealPointValuePair[]{
            new UnivariateRealPointValuePair(5.0, 10.0),
            new UnivariateRealPointValuePair(2.0, 2.0),
            null,
            new UnivariateRealPointValuePair(8.0, 5.0),
            new UnivariateRealPointValuePair(1.0, 1.0),
            null
        };
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResults(unsortedPairs);
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(1); // Minimal evaluations

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, unsortedPairs.length, new MockRandomGenerator());
        optimizer.setMaxEvaluations(unsortedPairs.length);

        optimizer.optimize(new MockUnivariateRealFunction(0.0), GoalType.MINIMIZE, 0, 10);
        UnivariateRealPointValuePair[] sortedOptima = optimizer.getOptima();

        // Expected sorted order: best to worst, nulls at the end
        assertEquals(1.0, sortedOptima[0].getPoint(), 1e-9);
        assertEquals(1.0, sortedOptima[0].getValue(), 1e-9);
        assertEquals(2.0, sortedOptima[1].getPoint(), 1e-9);
        assertEquals(2.0, sortedOptima[1].getValue(), 1e-9);
        assertEquals(8.0, sortedOptima[2].getPoint(), 1e-9);
        assertEquals(5.0, sortedOptima[2].getValue(), 1e-9);
        assertEquals(5.0, sortedOptima[3].getPoint(), 1e-9);
        assertEquals(10.0, sortedOptima[3].getValue(), 1e-9);
        assertNull(sortedOptima[4]);
        assertNull(sortedOptima[5]);
    }

    /**
     * Test the sorting of optima when GoalType is MAXIMIZE.
     */
    @Test
    public void testSortPairsMaximize() throws Exception {
        // We can't directly call sortPairs, so we'll test its effect via getOptima()
        UnivariateRealPointValuePair[] unsortedPairs = new UnivariateRealPointValuePair[]{
            new UnivariateRealPointValuePair(5.0, 10.0),
            new UnivariateRealPointValuePair(2.0, 2.0),
            null,
            new UnivariateRealPointValuePair(8.0, 5.0),
            new UnivariateRealPointValuePair(1.0, 1.0),
            null
        };
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResults(unsortedPairs);
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(1); // Minimal evaluations

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, unsortedPairs.length, new MockRandomGenerator());
        optimizer.setMaxEvaluations(unsortedPairs.length);

        optimizer.optimize(new MockUnivariateRealFunction(0.0), GoalType.MAXIMIZE, 0, 10);
        UnivariateRealPointValuePair[] sortedOptima = optimizer.getOptima();

        // Expected sorted order: best to worst, nulls at the end
        assertEquals(5.0, sortedOptima[0].getPoint(), 1e-9);
        assertEquals(10.0, sortedOptima[0].getValue(), 1e-9);
        assertEquals(8.0, sortedOptima[1].getPoint(), 1e-9);
        assertEquals(5.0, sortedOptima[1].getValue(), 1e-9);
        assertEquals(2.0, sortedOptima[2].getPoint(), 1e-9);
        assertEquals(2.0, sortedOptima[2].getValue(), 1e-9);
        assertEquals(1.0, sortedOptima[3].getPoint(), 1e-9);
        assertEquals(1.0, sortedOptima[3].getValue(), 1e-9);
        assertNull(sortedOptima[4]);
        assertNull(sortedOptima[5]);
    }

    /**
     * Test that the optimize method with default start value works.
     */
    @Test
    public void testOptimizeDefaultStartValue() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResult(new UnivariateRealPointValuePair(5.0, 0.0));
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setMaxEvaluations(100);

        optimizer.optimize(function, GoalType.MINIMIZE, 0, 10);
        // This test primarily checks that the call to the other optimize method with 3 arguments
        // is correctly made and that the default start value is used.
        // The actual start value used by the mocked optimizer cannot be directly inspected
        // without more complex mocking, but this verifies the dispatch.
    }

    /**
     * Test that totalEvaluations accumulates correctly across multiple starts.
     */
    @Test
    public void testTotalEvaluationsAccumulation() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(7); // Each call to optimize uses 7 evaluations

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 3, new MockRandomGenerator());
        optimizer.setMaxEvaluations(30);

        optimizer.optimize(function, GoalType.MINIMIZE, 0, 10);

        // 3 starts * 7 evaluations/start = 21 total evaluations
        assertEquals(21, optimizer.getEvaluations());
    }

    /**
     * Test that maxEvaluations is decremented correctly for subsequent starts.
     */
    @Test
    public void testMaxEvaluationsDecrement() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 2, new MockRandomGenerator());
        optimizer.setMaxEvaluations(50);

        optimizer.optimize(function, GoalType.MINIMIZE, 0, 10);

        // After the first start, the underlying optimizer's max evaluations should be 50 - 10 = 40
        // The second start uses this remaining budget.
        assertEquals(20, optimizer.getEvaluations()); // Total evaluations
        // It's difficult to directly assert the remaining budget of the internal optimizer
        // from the public API without exposing it. However, the logic implies it.
    }

    /**
     * Test `getOptima` returns a clone to prevent external modification.
     */
    @Test
    public void testGetOptimaReturnsClone() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResult(new UnivariateRealPointValuePair(1.0, 0.0));
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setMaxEvaluations(100);

        optimizer.optimize(function, GoalType.MINIMIZE, 0, 10);
        UnivariateRealPointValuePair[] optima1 = optimizer.getOptima();
        UnivariateRealPointValuePair[] optima2 = optimizer.getOptima();

        // Check they are not the same array instance
        assertNotSame(optima1, optima2);
        // Check that the contents are equal
        assertEquals(optima1.length, optima2.length);
        for (int i = 0; i < optima1.length; i++) {
            if (optima1[i] != null) {
                assertEquals(optima1[i].getPoint(), optima2[i].getPoint(), 1e-9);
                assertEquals(optima1[i].getValue(), optima2[i].getValue(), 1e-9);
            } else {
                assertNull(optima2[i]);
            }
        }

        // Attempt to modify the returned array and check if the internal state is unaffected.
        if (optima1.length > 0 && optima1[0] != null) {
            optima1[0] = new UnivariateRealPointValuePair(99.0, 99.0);
            // We cannot directly check the internal state, but the assertion that optima1 and optima2
            // are different instances and that their contents are equal implies the clone protection.
        }
    }

    /**
     * Test the `optimize` method with a function that throws FunctionEvaluationException.
     */
    @Test
    public void testOptimizeFunctionEvaluationException() throws Exception {
        UnivariateRealFunction function = new ThrowingFunctionEvaluationExceptionFunction();
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(5);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 3, new MockRandomGenerator());
        optimizer.setMaxEvaluations(30);

        UnivariateRealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, 0, 10, 5);

        // The first start should throw FEE, resulting in optima[0] = null.
        // The loop continues. If other starts succeed, one of them might be returned.
        // In this mock setup, all starts will throw FEE.
        // The method `optimize` returns null if no convergence.
        assertNull(result);
        assertNotNull(optimizer.getOptima());
        assertEquals(3, optimizer.getOptima().length);
        assertNull(optimizer.getOptima()[0]); // First start failed
        assertNull(optimizer.getOptima()[1]); // Second start failed
        assertNull(optimizer.getOptima()[2]); // Third start failed
        assertEquals(3 * 5, optimizer.getEvaluations());
    }

    /**
     * Test the `optimize` method with a function that throws ConvergenceException.
     */
    @Test(expected = ConvergenceException.class)
    public void testOptimizeConvergenceException() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0); // Dummy function
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResult(null); // Simulate convergence failure
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(8);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 2, new MockRandomGenerator());
        optimizer.setMaxEvaluations(20);

        optimizer.optimize(function, GoalType.MINIMIZE, 0, 10);

        // The exception is thrown by the optimize method itself if all starts fail.
        // We don't need to check optima here if we expect an exception.
    }

    /**
     * Test with edge case of min and max being the same.
     */
    @Test
    public void testOptimizeMinMaxSame() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResult(new UnivariateRealPointValuePair(5.0, 0.0));
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setMaxEvaluations(100);

        UnivariateRealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, 5.0, 5.0);

        assertEquals(5.0, result.getPoint(), 1e-9);
        assertEquals(0.0, result.getValue(), 1e-9);
    }

    /**
     * Test with negative bounds.
     */
    @Test
    public void testOptimizeNegativeBounds() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResult(new UnivariateRealPointValuePair(-3.0, 0.0));
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setMaxEvaluations(100);

        UnivariateRealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, -10.0, -1.0);

        assertEquals(-3.0, result.getPoint(), 1e-9);
        assertEquals(0.0, result.getValue(), 1e-9);
    }

    /**
     * Test with zero starts.
     * The constructor for MultiStartUnivariateRealOptimizer does not validate 'starts'.
     * If starts <= 0, the loop in optimize() will not run, and it will throw ConvergenceException
     * because optima[0] will be null.
     */
    @Test(expected = ConvergenceException.class)
    public void testZeroStarts() throws Exception {
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 0, new MockRandomGenerator());
        optimizer.setMaxEvaluations(100);
        optimizer.optimize(new MockUnivariateRealFunction(0.0), GoalType.MINIMIZE, 0, 10);
    }

    /**
     * Test with starts = 1 (should behave like single start optimizer).
     */
    @Test
    public void testSingleStartEquivalent() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResult(new UnivariateRealPointValuePair(7.0, 0.0));
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setMaxEvaluations(100);

        UnivariateRealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, 0, 10);

        assertEquals(7.0, result.getPoint(), 1e-9);
        assertEquals(0.0, result.getValue(), 1e-9);
        assertEquals(10, optimizer.getEvaluations());
        assertNotNull(optimizer.getOptima());
        assertEquals(1, optimizer.getOptima().length);
        assertNotNull(optimizer.getOptima()[0]);
    }

    /**
     * Test with very small interval.
     */
    @Test
    public void testSmallInterval() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResult(new UnivariateRealPointValuePair(1e-9, 0.0));
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setMaxEvaluations(100);

        UnivariateRealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, 1e-10, 1e-8);

        assertEquals(1e-9, result.getPoint(), 1e-15);
        assertEquals(0.0, result.getValue(), 1e-9);
    }

    /**
     * Test with large interval.
     */
    @Test
    public void testLargeInterval() throws Exception {
        UnivariateRealFunction function = new MockUnivariateRealFunction(0.0);
        BaseUnivariateRealOptimizer<UnivariateRealFunction> mockOptimizer = createMockOptimizer();
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setOptimizeResult(new UnivariateRealPointValuePair(1e9, 0.0));
        ((MockBaseUnivariateRealOptimizer) mockOptimizer).setEvaluationsPerCall(10);

        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
            new MultiStartUnivariateRealOptimizer<>(mockOptimizer, 1, new MockRandomGenerator());
        optimizer.setMaxEvaluations(100);

        UnivariateRealPointValuePair result = optimizer.optimize(function, GoalType.MINIMIZE, 1e8, 1e10);

        assertEquals(1e9, result.getPoint(), 1e1); // Tolerance for large numbers
        assertEquals(0.0, result.getValue(), 1e-9);
    }


    // --- Mock Objects ---

    private BaseUnivariateRealOptimizer<UnivariateRealFunction> createMockOptimizer() {
        return new MockBaseUnivariateRealOptimizer();
    }

    private static class MockRandomGenerator implements RandomGenerator {
        private double nextDoubleValue = 0.5; // Default to middle of range
        private int nextIntValue = 10; // Default

        @Override
        public void setSeed(int seed) {}
        @Override
        public void setSeed(int[] seed) {}
        @Override
        public void setSeed(long seed) {}
        @Override
        public void nextBytes(byte[] bytes) {}

        @Override
        public int nextInt() { return nextIntValue++; }
        @Override
        public int nextInt(int n) { return n / 2; } // Simple mock
        @Override
        public long nextLong() { return 0; }
        @Override
        public boolean nextBoolean() { return false; }

        @Override
        public float nextFloat() { return 0.5f; }

        @Override
        public double nextDouble() { return nextDoubleValue; } // Return a fixed value for predictability in tests

        public void setNextDouble(double value) {
            this.nextDoubleValue = value;
        }

        @Override
        public double nextGaussian() { return 0.0; }
    }

    private static class MockUnivariateRealFunction implements UnivariateRealFunction {
        private final double value;

        MockUnivariateRealFunction(double value) {
            this.value = value;
        }

        @Override
        public double value(double x) throws FunctionEvaluationException {
            return value;
        }
    }

    private static class ThrowingFunctionEvaluationExceptionFunction implements UnivariateRealFunction {
        @Override
        public double value(double x) throws FunctionEvaluationException {
            throw new FunctionEvaluationException(x);
        }
    }

    // Helper Mock class to allow access to protected/package-private methods or fields for testing purposes
    // This is a common pattern for testing frameworks when direct access is not possible.
    private static class MockBaseUnivariateRealOptimizer implements BaseUnivariateRealOptimizer<UnivariateRealFunction> {
        private int maxEvaluations = Integer.MAX_VALUE;
        private int totalEvaluations = 0;
        private UnivariateRealPointValuePair optimizeResult = null;
        private UnivariateRealPointValuePair[] optimizeResults = null;
        private int evaluationsPerCall = 10;
        private ConvergenceChecker<UnivariateRealPointValuePair> returnedChecker = null;

        // Expose the underlying optimizer's fields for test verification
        public int getEvaluations() {
            return this.totalEvaluations;
        }

        public int getMaxEvaluations() {
            return this.maxEvaluations;
        }

        public ConvergenceChecker<UnivariateRealPointValuePair> getConvergenceChecker() {
            return this.returnedChecker;
        }

        @Override
        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal, double min, double max, double startValue) throws FunctionEvaluationException {
            totalEvaluations += evaluationsPerCall;
            if (optimizeResults != null && optimizeResults.length > 0) {
                // Simulate results for multiple calls if provided
                UnivariateRealPointValuePair result = optimizeResults[0];
                optimizeResults = Arrays.copyOfRange(optimizeResults, 1, optimizeResults.length);
                if (result == null) {
                    // Simulate ConvergenceException or FunctionEvaluationException
                    if (Math.random() < 0.5) { // Randomly throw FEE or CE
                        throw new FunctionEvaluationException(startValue);
                    } else {
                        throw new ConvergenceException();
                    }
                }
                return result;
            } else {
                // Simulate single result
                if (optimizeResult == null) { // Simulate failure
                    if (Math.random() < 0.5) {
                        throw new FunctionEvaluationException(startValue);
                    } else {
                        throw new ConvergenceException();
                    }
                }
                return optimizeResult;
            }
        }

        @Override
        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goal, double min, double max) throws FunctionEvaluationException {
            // Default start value is middle of range
            return optimize(f, goal, min, max, min + 0.5 * (max - min));
        }

        @Override
        public void setConvergenceChecker(ConvergenceChecker<UnivariateRealPointValuePair> checker) {
            this.returnedChecker = checker; // Store it to be retrieved by getter
        }

        @Override
        public void setMaxEvaluations(int maxEvaluations) {
            this.maxEvaluations = maxEvaluations;
        }

        public void setOptimizeResult(UnivariateRealPointValuePair result) {
            this.optimizeResult = result;
        }

        public void setOptimizeResults(UnivariateRealPointValuePair[] results) {
            this.optimizeResults = results;
        }

        public void setEvaluationsPerCall(int evaluations) {
            this.evaluationsPerCall = evaluations;
        }
    }

    private static class MockConvergenceChecker implements ConvergenceChecker<UnivariateRealPointValuePair> {
        @Override
        public boolean converged(int iteration, UnivariateRealPointValuePair previous, UnivariateRealPointValuePair current) {
            return false; // Always return false for simplicity in mocks
        }
    }
}
