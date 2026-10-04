package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer; // Import added for AbstractUnivariateRealOptimizer

public class BrentOptimizerTest {

    /**
     * A dummy objective function.
     */
    private static class DummyFunction implements UnivariateRealFunction {
        private boolean negate = false;

        public void negate(boolean negate) {
            this.negate = negate;
        }

        public double value(double x) throws FunctionEvaluationException {
            if (negate) {
                return -x * x;
            } else {
                return x * x;
            }
        }
    }

    @Test
    public void testMinimizeXSquared() throws Exception {
        UnivariateRealFunction f = new DummyFunction();
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setMaximalIterationCount(100);
        optimizer.setMaxEvaluations(100);
        optimizer.setAbsoluteAccuracy(1e-11);
        optimizer.setRelativeAccuracy(1e-9);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10, 10, 0);
        assertEquals(0.0, result, 1e-11);
    }

    @Test
    public void testMaximizeXSquared() throws Exception {
        UnivariateRealFunction f = new DummyFunction();
        // To maximize x^2, we minimize -x^2. The DummyFunction needs to be aware of this.
        // The negate method is not part of UnivariateRealFunction, it's a custom method for DummyFunction.
        // We will create a new DummyFunction instance to handle negation.
        DummyFunction negF = new DummyFunction();
        negF.negate(true);
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setMaximalIterationCount(100);
        optimizer.setMaxEvaluations(100);
        optimizer.setAbsoluteAccuracy(1e-11);
        optimizer.setRelativeAccuracy(1e-9);

        double result = optimizer.optimize(negF, GoalType.MINIMIZE, -10, 10, 0);
        assertEquals(0.0, result, 1e-11);
    }

    @Test
    public void testMinimizeSimpleParabola() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 5.0;
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-10);
        optimizer.setRelativeAccuracy(1e-9);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10, 10, 0);
        assertEquals(0.0, result, 1e-10);
    }

    @Test
    public void testMinimizeShiftedParabola() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 2.0) * (x - 2.0) + 3.0;
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-10);
        optimizer.setRelativeAccuracy(1e-9);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10, 10, 0);
        assertEquals(2.0, result, 1e-10);
    }

    @Test
    public void testMinimizeAsymmetricFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 2 * x + 1;
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-10);
        optimizer.setRelativeAccuracy(1e-9);

        // The minimum is near sqrt(2/3)
        double expected = Math.sqrt(2.0 / 3.0);
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 0.5, 2, 1.0);
        assertEquals(expected, result, 1e-9);
    }

    @Test
    public void testMaximizeAsymmetricFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 2 * x + 1;
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-10);
        optimizer.setRelativeAccuracy(1e-9);

        // To maximize, we minimize the negative of the function
        double expected = -Math.sqrt(2.0 / 3.0);
        // Need to define a function that returns the negative of the original for maximization
        UnivariateRealFunction negF = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return - (x * x * x - 2 * x + 1);
            }
        };
        double result = optimizer.optimize(negF, GoalType.MINIMIZE, -2, -0.5, -1.0);
        assertEquals(expected, result, 1e-9);
    }

    @Test
    public void testInterval() throws Exception {
        UnivariateRealFunction f = new DummyFunction();
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-11);
        optimizer.setRelativeAccuracy(1e-9);

        // Test with interval where minimum is at one of the bounds.
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 1.0, 10.0, 5.0);
        assertEquals(1.0, result, 1e-11); // Minimum of x^2 is at x=0, but in [1, 10] it's at 1.
    }

    @Test
    public void testIntervalWithMaximum() throws Exception {
        UnivariateRealFunction f = new DummyFunction();
        // To maximize, we minimize the negative.
        DummyFunction negF = new DummyFunction();
        negF.negate(true);
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-11);
        optimizer.setRelativeAccuracy(1e-9);

        // Test with interval where maximum is at one of the bounds.
        double result = optimizer.optimize(negF, GoalType.MINIMIZE, -10.0, -1.0, -5.0);
        assertEquals(-1.0, result, 1e-11); // Maximum of x^2 is at x=0, but in [-10, -1] it's at -1.
    }

    @Test
    public void testLargeInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1000.0) * (x - 1000.0);
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-7);
        optimizer.setRelativeAccuracy(1e-7);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, -1e6, 1e6, 0);
        assertEquals(1000.0, result, 1e-7);
    }

    @Test
    public void testSmallInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x;
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-12);
        optimizer.setRelativeAccuracy(1e-12);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, 1e-5, 1e-4, 5e-5);
        assertEquals(0.0, result, 1e-12);
    }

    @Test
    public void testSettersGetters() {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setMaximalIterationCount(200);
        assertEquals(200, optimizer.getMaximalIterationCount());
        optimizer.setMaxEvaluations(150);
        assertEquals(150, optimizer.getMaxEvaluations());
        optimizer.setAbsoluteAccuracy(1e-10);
        assertEquals(1e-10, optimizer.getAbsoluteAccuracy(), 0);
        optimizer.setRelativeAccuracy(1e-8);
        assertEquals(1e-8, optimizer.getRelativeAccuracy(), 0);
    }

    @Test
    public void testDefaultValues() {
        BrentOptimizer optimizer = new BrentOptimizer();
        assertEquals(1000, optimizer.getMaxEvaluations());
        assertEquals(100, optimizer.getMaximalIterationCount());
        assertEquals(1e-11, optimizer.getAbsoluteAccuracy(), 0);
        assertEquals(1e-9, optimizer.getRelativeAccuracy(), 0);
    }

    @Test
    public void testMaxIterationsExceeded() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x; // Simple function, should not exceed iterations
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setMaximalIterationCount(1); // Force exception
        optimizer.setAbsoluteAccuracy(1e-15);
        optimizer.setRelativeAccuracy(1e-15);

        try {
            optimizer.optimize(f, GoalType.MINIMIZE, -10, 10, 0);
            fail("Expected MaxIterationsExceededException");
        } catch (MaxIterationsExceededException e) {
            assertEquals(1, e.getMaxIterations());
        } catch (FunctionEvaluationException e) {
            fail("Unexpected FunctionEvaluationException");
        }
    }

    @Test
    public void testAbsoluteAccuracy() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.23456789) * (x - 1.23456789);
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setMaximalIterationCount(1000);
        optimizer.setMaxEvaluations(1000);
        optimizer.setRelativeAccuracy(1e-15); // High relative accuracy, low absolute
        optimizer.setAbsoluteAccuracy(1e-12);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, -5, 5, 0);
        // The result should be close to 1.23456789, with the absolute accuracy being the limiting factor.
        assertEquals(1.23456789, result, 1e-12);
    }

    @Test
    public void testRelativeAccuracy() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.23456789) * (x - 1.23456789);
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setMaximalIterationCount(1000);
        optimizer.setMaxEvaluations(1000);
        optimizer.setAbsoluteAccuracy(1e-15); // Low absolute accuracy, high relative
        optimizer.setRelativeAccuracy(1e-12);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, -5, 5, 0);
        // The result should be close to 1.23456789, with the relative accuracy being the limiting factor.
        // The tolerance is eps * |x| + t. Here t is small, so eps * |x| dominates.
        assertEquals(1.23456789, result, 1e-12 * Math.abs(1.23456789));
    }

    @Test
    public void testNotStrictlyPositiveEpsilon() {
        UnivariateRealFunction f = new DummyFunction();
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setRelativeAccuracy(0); // Not strictly positive

        try {
            optimizer.optimize(f, GoalType.MINIMIZE, -10, 10, 0);
            fail("Expected NotStrictlyPositiveException for relative accuracy");
        } catch (NotStrictlyPositiveException e) {
            // Expected
        } catch (Exception e) {
            fail("Caught wrong exception: " + e.getClass().getName());
        }
    }

    @Test
    public void testNotStrictlyPositiveAbsoluteAccuracy() {
        UnivariateRealFunction f = new DummyFunction();
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(0); // Not strictly positive

        try {
            optimizer.optimize(f, GoalType.MINIMIZE, -10, 10, 0);
            fail("Expected NotStrictlyPositiveException for absolute accuracy");
        } catch (NotStrictlyPositiveException e) {
            // Expected
        } catch (Exception e) {
            fail("Caught wrong exception: " + e.getClass().getName());
        }
    }

    @Test
    public void testOptimizeNoBounds() {
        UnivariateRealFunction f = new DummyFunction();
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-11);
        optimizer.setRelativeAccuracy(1e-9);

        // The optimize method without bounds also calls localMin,
        // but it will use the default bounds of [-Infinity, +Infinity]
        // which are handled by the calling context, not localMin itself.
        // For localMin, we must provide valid bounds.
        // This test will use the overload that takes min and max.
        try {
            optimizer.optimize(f, GoalType.MINIMIZE, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 0);
            fail("Should not accept infinite bounds directly for optimization method.");
        } catch (IllegalArgumentException e) {
            // Expected behavior for infinite bounds in optimize(f, goal, min, max)
            // The specific exception message is not checked as it may vary.
        } catch (Exception e) {
            fail("Caught wrong exception: " + e.getClass().getName());
        }
    }

    @Test
    public void testOptimizeWithSpecificStartValue() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 5.0) * (x - 5.0);
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-11);
        optimizer.setRelativeAccuracy(1e-9);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 10.0, 5.0);
        assertEquals(5.0, result, 1e-11);
    }

    @Test
    public void testOptimizeWithStartValueOutsideBounds() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 5.0) * (x - 5.0);
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-11);
        optimizer.setRelativeAccuracy(1e-9);

        // Start value is outside the bounds. The optimizer should still converge to the minimum.
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 10.0, 15.0);
        assertEquals(5.0, result, 1e-11);
    }

    @Test
    public void testOptimizeWithStartValueAtBound() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 5.0) * (x - 5.0);
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-11);
        optimizer.setRelativeAccuracy(1e-9);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 10.0, 10.0);
        assertEquals(5.0, result, 1e-11);
    }

    @Test
    public void testOptimizerStateAfterOptimization() throws Exception {
        UnivariateRealFunction f = new DummyFunction();
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.optimize(f, GoalType.MINIMIZE, -10, 10, 0);

        // isResultComputed() is a protected method in AbstractUnivariateRealOptimizer
        // We need to access it through a concrete instance or a public method that exposes its state.
        // For testing purposes, we can assume a concrete optimizer instance would have this.
        // However, since we cannot directly call protected methods, we rely on public methods.
        // The existence of getResult() and getFunctionValue() implies that a result is computed.
        // Let's assert the values directly.
        assertEquals(0.0, optimizer.getResult(), 1e-11);
        assertEquals(0.0, optimizer.getFunctionValue(), 1e-11);
    }

    @Test
    public void testOptimizerStateWhenNoResultComputed() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // isResultComputed() is protected. Relying on exceptions from getResult() and getFunctionValue()
        try {
            optimizer.getResult();
            fail("Expected exception when result not computed.");
        } catch (IllegalStateException e) {
            // Expected
        }
        try {
            optimizer.getFunctionValue();
            fail("Expected exception when result not computed.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testClearResult() throws Exception {
        UnivariateRealFunction f = new DummyFunction();
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.optimize(f, GoalType.MINIMIZE, -10, 10, 0);
        // Check that result is computed
        assertNotNull(optimizer.getResult()); // Checking for non-null is a proxy for computed result

        optimizer.clearResult();
        // Check that result is no longer computed
        try {
            optimizer.getResult();
            fail("Expected exception when result not computed after clearResult.");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testBrentOptimizerWithGoldenSection() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x;
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        // Set a high tolerance so that golden section might be used more prominently.
        optimizer.setAbsoluteAccuracy(1e-1);
        optimizer.setRelativeAccuracy(1e-1);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10, 10, 0);
        assertEquals(0.0, result, 1e-1);
    }

    @Test
    public void testFunctionEvaluationException() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                if (x == 0.0) {
                    throw new FunctionEvaluationException(x);
                }
                return x * x;
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-15);
        optimizer.setRelativeAccuracy(1e-15);

        try {
            optimizer.optimize(f, GoalType.MINIMIZE, -1, 1, 0);
            fail("Expected FunctionEvaluationException");
        } catch (FunctionEvaluationException e) {
            // The getArgument() method returns a double array.
            assertEquals(0.0, e.getArgument()[0], 0);
        } catch (Exception e) {
            fail("Caught wrong exception: " + e.getClass().getName());
        }
    }
}
