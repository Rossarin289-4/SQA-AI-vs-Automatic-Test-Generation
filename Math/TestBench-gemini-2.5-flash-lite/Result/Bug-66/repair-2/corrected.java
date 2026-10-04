package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;

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

        UnivariateRealFunction negF = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return - (x * x * x - 2 * x + 1);
            }
        };
        double expected = -Math.sqrt(2.0 / 3.0);
        double result = optimizer.optimize(negF, GoalType.MINIMIZE, -2, -0.5, -1.0);
        assertEquals(expected, result, 1e-9);
    }

    @Test
    public void testInterval() throws Exception {
        UnivariateRealFunction f = new DummyFunction();
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-11);
        optimizer.setRelativeAccuracy(1e-9);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, 1.0, 10.0, 5.0);
        assertEquals(1.0, result, 1e-11);
    }

    @Test
    public void testIntervalWithMaximum() throws Exception {
        DummyFunction negF = new DummyFunction();
        negF.negate(true);
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(1e-11);
        optimizer.setRelativeAccuracy(1e-9);

        double result = optimizer.optimize(negF, GoalType.MINIMIZE, -10.0, -1.0, -5.0);
        assertEquals(-1.0, result, 1e-11);
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
                return x * x;
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setMaximalIterationCount(1);
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
        optimizer.setRelativeAccuracy(1e-15);
        optimizer.setAbsoluteAccuracy(1e-12);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, -5, 5, 0);
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
        optimizer.setAbsoluteAccuracy(1e-15);
        optimizer.setRelativeAccuracy(1e-12);

        double result = optimizer.optimize(f, GoalType.MINIMIZE, -5, 5, 0);
        assertEquals(1.23456789, result, 1e-12 * Math.abs(1.23456789));
    }

    @Test
    public void testNotStrictlyPositiveEpsilon() {
        UnivariateRealFunction f = new DummyFunction();
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setRelativeAccuracy(0);

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
        optimizer.setAbsoluteAccuracy(0);

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

        try {
            optimizer.optimize(f, GoalType.MINIMIZE, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 0);
            fail("Should not accept infinite bounds directly for optimization method.");
        } catch (IllegalArgumentException e) {
            // Expected behavior for infinite bounds in optimize(f, goal, min, max)
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

        assertEquals(0.0, optimizer.getResult(), 1e-11);
        assertEquals(0.0, optimizer.getFunctionValue(), 1e-11);
    }

    @Test
    public void testOptimizerStateWhenNoResultComputed() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
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

        optimizer.clearResult();
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
            assertEquals(0.0, e.getArgument()[0], 0);
        } catch (Exception e) {
            fail("Caught wrong exception: " + e.getClass().getName());
        }
    }
}
