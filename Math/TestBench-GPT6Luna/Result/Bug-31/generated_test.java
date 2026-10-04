package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

public class ContinuedFractionTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstantFractionConvergesImmediately() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? 2.0 : 0.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        assertEquals(2.0, cf.evaluate(3.0), 0.0);
    }

    @Test
    public void testFirstConvergentUsesAZeroAndBOne() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? 2.0 : 0.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        assertEquals(2.0, cf.evaluate(1.0, 1e-9, 2), 0.0);
    }

    @Test
    public void testXIsPassedToCoefficientFunctions() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? x : 0.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        assertEquals(5.0, cf.evaluate(5.0), 0.0);
    }

    @Test
    public void testFirstCoefficientZeroIsHandledAsSmall() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return 0.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        assertEquals(1e-50, cf.evaluate(0.0), 1e-65);
    }

    @Test
    public void testFirstCoefficientNegativeZeroIsHandledAsSmall() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? -0.0 : 0.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        assertEquals(1e-50, cf.evaluate(0.0), 1e-65);
    }

    @Test
    public void testReturnsValueWhenSecondTermMeetsDefaultTolerance() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) {
                if (n == 0) return 2.0;
                if (n == 1) return 3.0;
                return 0.0;
            }
            protected double getB(int n, double x) { return n == 1 ? 4.0 : 0.0; }
        };
        assertEquals(2.0 + 4.0 / 3.0, cf.evaluate(1.0), 1e-12);
    }

    @Test
    public void testEvaluateWithEpsilonOverload() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) {
                if (n == 0) return 2.0;
                if (n == 1) return 3.0;
                return 0.0;
            }
            protected double getB(int n, double x) { return n == 1 ? 4.0 : 0.0; }
        };
        assertEquals(2.0 + 4.0 / 3.0, cf.evaluate(1.0, 1e-6), 1e-12);
    }

    @Test
    public void testEvaluateWithMaxIterationsOverload() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? 2.0 : 0.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        assertEquals(2.0, cf.evaluate(1.0, 2), 0.0);
    }

    @Test
    public void testConvergenceAtTheIterationLimit() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? 2.0 : 0.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        assertEquals(2.0, cf.evaluate(1.0, 1e-6, 2), 0.0);
    }

    @Test
    public void testMaxIterationsOneThrows() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? 2.0 : 3.0; }
            protected double getB(int n, double x) { return n == 1 ? 4.0 : 0.0; }
        };
        try {
            cf.evaluate(1.0, 1e-6, 1);
            fail("expected MaxCountExceededException");
        } catch (MaxCountExceededException expected) {
            assertEquals(1, expected.getMax().intValue());
        }
    }

    @Test
    public void testZeroMaxIterationsThrows() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return 2.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        try {
            cf.evaluate(1.0, 1e-6, 0);
            fail("expected MaxCountExceededException");
        } catch (MaxCountExceededException expected) {
            assertEquals(0, expected.getMax().intValue());
        }
    }

    @Test
    public void testNegativeMaxIterationsThrows() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return 2.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        try {
            cf.evaluate(1.0, 1e-6, -1);
            fail("expected MaxCountExceededException");
        } catch (MaxCountExceededException expected) {
            assertEquals(-1, expected.getMax().intValue());
        }
    }

    @Test
    public void testZeroEpsilonRequiresExactStability() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) {
                if (n == 0) return 2.0;
                if (n == 1) return 3.0;
                return 0.0;
            }
            protected double getB(int n, double x) { return n == 1 ? 4.0 : 0.0; }
        };
        try {
            cf.evaluate(1.0, 0.0, 2);
            fail("expected MaxCountExceededException");
        } catch (MaxCountExceededException expected) {
            assertEquals(2, expected.getMax().intValue());
        }
    }

    @Test
    public void testNegativeEpsilonDoesNotAcceptConvergence() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) {
                if (n == 0) return 2.0;
                if (n == 1) return 3.0;
                return 0.0;
            }
            protected double getB(int n, double x) { return n == 1 ? 4.0 : 0.0; }
        };
        try {
            cf.evaluate(1.0, -1.0, 2);
            fail("expected MaxCountExceededException");
        } catch (MaxCountExceededException expected) {
            assertEquals(2, expected.getMax().intValue());
        }
    }

    @Test
    public void testInfiniteResultDoesNotThrowWhenConvergent() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? 1e308 : 1e308; }
            protected double getB(int n, double x) { return n == 1 ? -1e308 : 0.0; }
        };
        assertEquals(1e308, cf.evaluate(1.0, 1e-9, 2), 1e294);
    }

    @Test
    public void testNaNResultThrowsConvergenceException() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? 1.0 : Double.NaN; }
            protected double getB(int n, double x) { return 0.0; }
        };
        try {
            cf.evaluate(1.0, 1e-9, 2);
            fail("expected ConvergenceException");
        } catch (ConvergenceException expected) {
            assertEquals(1.0, 1.0, 0.0);
        }
    }

    @Test
    public void testZeroNumeratorInIterationIsProtected() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? 2.0 : 0.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        assertEquals(2.0, cf.evaluate(1.0, 2), 0.0);
    }

    @Test
    public void testSmallNonzeroInitialValueUsesZeroGuard() throws Exception {
        ContinuedFraction cf = new ContinuedFraction() {
            protected double getA(int n, double x) { return n == 0 ? 1e-51 : 0.0; }
            protected double getB(int n, double x) { return 0.0; }
        };
        assertEquals(1e-50, cf.evaluate(1.0), 1e-65);
    }
}
