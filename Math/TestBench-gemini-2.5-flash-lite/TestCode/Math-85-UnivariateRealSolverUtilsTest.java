package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class UnivariateRealSolverUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSolveBasic() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4;
            }
        };
        // The default solver is likely to find a root near the middle of the interval.
        // For x*x - 4, roots are at -2 and 2.
        double result = UnivariateRealSolverUtils.solve(f, 0.0, 3.0);
        // We can't assert the exact value without knowing the default solver,
        // but we can assert it's within the interval and that f(result) is close to zero.
        assertTrue(result >= 0.0 && result <= 3.0);
        // The default solver for x*x - 4 in [0, 3] will likely find the root 2.0.
        assertEquals(2.0, result, 1e-9);
        assertEquals(0, f.value(result), 1e-9);
    }

    @Test
    public void testSolveWithAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4;
            }
        };
        double accuracy = 1e-6;
        double result = UnivariateRealSolverUtils.solve(f, 0.0, 3.0, accuracy);
        assertTrue(result >= 0.0 && result <= 3.0);
        assertEquals(0, f.value(result), accuracy);
    }

    @Test
    public void testSolveNegativeInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4;
            }
        };
        double result = UnivariateRealSolverUtils.solve(f, -3.0, 0.0);
        assertTrue(result >= -3.0 && result <= 0.0);
        // The root in [-3, 0] is -2.0.
        assertEquals(-2.0, result, 1e-9);
        assertEquals(0, f.value(result), 1e-9);
    }
    
    @Test
    public void testSolveLinear() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2 * x - 6; // root at x = 3
            }
        };
        double result = UnivariateRealSolverUtils.solve(f, 0.0, 5.0);
        assertEquals(3.0, result, 1e-9);
    }

    @Test
    public void testSolvePolynomial() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x*x*x - x - 1; // root near 1.32
            }
        };
        double result = UnivariateRealSolverUtils.solve(f, 1.0, 2.0);
        assertTrue(result >= 1.0 && result <= 2.0);
        // The root of x^3 - x - 1 is approximately 1.3247.
        assertEquals(1.324717957244746, result, 1e-9);
        assertEquals(0, f.value(result), 1e-9);
    }
    
    @Test
    public void testSolveHighAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 2; // root at sqrt(2)
            }
        };
        double accuracy = 1e-12;
        double result = UnivariateRealSolverUtils.solve(f, 1.0, 2.0, accuracy);
        assertTrue(result >= 1.0 && result <= 2.0);
        assertEquals(0, f.value(result), accuracy);
    }
    
    @Test
    public void testSolveZeroCrossingAtBoundary() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1; // root at 1
            }
        };
        double result1 = UnivariateRealSolverUtils.solve(f, 1.0, 2.0);
        assertEquals(1.0, result1, 1e-9);
        double result2 = UnivariateRealSolverUtils.solve(f, 0.0, 1.0);
        assertEquals(1.0, result2, 1e-9);
    }

    @Test
    public void testSolveForConstantZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 0.0;
            }
        };
        // For a constant zero function, any value in the interval is a root.
        // The default solver might return something in the middle.
        double result = UnivariateRealSolverUtils.solve(f, -5.0, 5.0);
        assertTrue(result >= -5.0 && result <= 5.0);
        assertEquals(0.0, f.value(result), 1e-9);
    }
    
    @Test
    public void testSolveForConstantNonZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 5.0; // No root
            }
        };
        // This should throw ConvergenceException because no root will be found.
        try {
            UnivariateRealSolverUtils.solve(f, -5.0, 5.0);
            fail("Expected ConvergenceException");
        } catch (ConvergenceException e) {
            // Expected
        }
    }
    
    @Test
    public void testBracketBasic() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4; // roots at -2 and 2
            }
        };
        double[] bracket = UnivariateRealSolverUtils.bracket(f, 0.0, -5.0, 5.0);
        // Iter 1: a = -1, b = 1. fa = -3, fb = -3. fa*fb > 0.
        // Iter 2: a = -2, b = 2. fa = 0, fb = 0. fa*fb = 0. Success!
        assertEquals(-2.0, bracket[0], 1e-9);
        assertEquals(2.0, bracket[1], 1e-9);
    }

    @Test
    public void testBracketWithMaxIterations() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1; // Always positive, no root
            }
        };
        int maxIterations = 10;
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, -10.0, 10.0, maxIterations);
            fail("Expected ConvergenceException");
        } catch (ConvergenceException e) {
            // Expected
        }
    }

    @Test
    public void testBracketInitialAtBoundary() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1; // root at 1
            }
        };
        // If initial is at a boundary, it can be tricky.
        // The method expands from initial.
        double[] bracket1 = UnivariateRealSolverUtils.bracket(f, 0.0, 0.0, 5.0);
        // a = 0, b = 0. fa = -1.
        // Iter 1: a = max(-1, 0) = 0, b = min(1, 5) = 1. fb = 0. fa*fb = 0. Success.
        assertEquals(0.0, bracket1[0], 1e-9);
        assertEquals(1.0, bracket1[1], 1e-9);
        
        double[] bracket2 = UnivariateRealSolverUtils.bracket(f, 5.0, 0.0, 5.0);
        // a = 5, b = 5. fa = 4.
        // Iter 1: a = max(4, 0) = 4, b = min(6, 5) = 5. fa=3, fb=4. fa*fb > 0.
        // Iter 2: a = max(3, 0) = 3, b = min(5, 5) = 5. fa=2, fb=4. fa*fb > 0.
        // Iter 3: a = max(2, 0) = 2, b = min(5, 5) = 5. fa=1, fb=4. fa*fb > 0.
        // Iter 4: a = max(1, 0) = 1, b = min(5, 5) = 5. fa=0, fb=4. fa*fb = 0. Success.
        assertEquals(1.0, bracket2[0], 1e-9);
        assertEquals(5.0, bracket2[1], 1e-9);
    }
    
    @Test
    public void testBracketRootAtInitial() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x; // root at 0
            }
        };
        // The algorithm starts by setting a := initial -1; b := initial +1
        // Since initial is 0, a becomes -1 and b becomes 1.
        // f(-1) = -1, f(1) = 1. fa * fb = -1. Success!
        double[] bracket = UnivariateRealSolverUtils.bracket(f, 0.0, -1.0, 1.0);
        assertEquals(-1.0, bracket[0], 1e-9);
        assertEquals(1.0, bracket[1], 1e-9);
    }

    @Test
    public void testBracketLargeExpansion() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 100.0; // root at 100
            }
        };
        // The method starts expanding from initial.
        // a := initial - 1; b := initial + 1
        // If initial = 0, a = -1, b = 1. f(-1) = -101, f(1) = -99. fa*fb > 0.
        // a = max(-2, -10) = -2, b = min(2, 10) = 2. f(-2) = -102, f(2) = -98. fa*fb > 0.
        // ...
        // Eventually a will reach -10 and b will reach 10.
        // At a=-10, f(a) = -110. At b=10, f(b) = -90.
        // Since a = lowerBound and b = upperBound, the loop terminates.
        // fa * fb > 0 is still true, so it throws ConvergenceException.
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, -10.0, 10.0, 1000); 
            fail("Expected ConvergenceException");
        } catch (ConvergenceException e) {
            // Expected
        }
    }
    
    @Test
    public void testBracketWithMaxIterationsHittingBounds() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x*x - 100; // root at 10 or -10
            }
        };
        // Starting at 0.
        // Iter 1: a = -1, b = 1. fa = -99, fb = -99.
        // Iter 2: a = -2, b = 2. fa = -96, fb = -96.
        // Iter 3: a = -3, b = 3. fa = -91, fb = -91.
        // Iter 4: a = -4, b = 4. fa = -84, fb = -84.
        // Iter 5: a = -5, b = 5. fa = -75, fb = -75. numIterations = 5.
        // The loop condition is (fa * fb > 0.0) && (numIterations < maximumIterations) && ((a > lowerBound) || (b < upperBound))
        // Here, numIterations = 5, maximumIterations = 5. So numIterations < maximumIterations is false.
        // The loop terminates, and since fa * fb > 0, it throws ConvergenceException.
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, -100.0, 100.0, 5); 
            fail("Expected ConvergenceException");
        } catch (ConvergenceException e) {
            // Expected
        }
    }

    @Test
    public void testBracketUpperBoundExact() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0; // root at 2.0
            }
        };
        double[] bracket = UnivariateRealSolverUtils.bracket(f, 0.0, -5.0, 2.0);
        // a = 0, b = 0. fa = -2.
        // Iter 1: a = max(-1, -5) = -1, b = min(1, 2) = 1. fa = -3, fb = -1. fa*fb > 0.
        // Iter 2: a = max(-2, -5) = -2, b = min(2, 2) = 2. fa = -4, fb = 0. fa*fb = 0. Success.
        assertEquals(-2.0, bracket[0], 1e-9);
        assertEquals(2.0, bracket[1], 1e-9);
    }

    @Test
    public void testBracketLowerBoundExact() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x + 2.0; // root at -2.0
            }
        };
        double[] bracket = UnivariateRealSolverUtils.bracket(f, 0.0, -2.0, 5.0);
        // a = 0, b = 0. fa = 2.
        // Iter 1: a = max(-1, -2) = -1, b = min(1, 5) = 1. fa = 1, fb = 3. fa*fb > 0.
        // Iter 2: a = max(-2, -2) = -2, b = min(2, 5) = 2. fa = 0, fb = 4. fa*fb = 0. Success.
        assertEquals(-2.0, bracket[0], 1e-9);
        assertEquals(2.0, bracket[1], 1e-9);
    }

    @Test
    public void testBracketFailsWhenNoRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x*x + 1.0; // No root
            }
        };
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, -10.0, 10.0, 100); // plenty of iterations
            fail("Expected ConvergenceException");
        } catch (ConvergenceException e) {
            // Expected
        }
    }

    @Test
    public void testMidpointBasic() throws Exception {
        assertEquals(5.0, UnivariateRealSolverUtils.midpoint(0.0, 10.0), 1e-9);
    }

    @Test
    public void testMidpointNegative() throws Exception {
        assertEquals(-5.0, UnivariateRealSolverUtils.midpoint(-10.0, 0.0), 1e-9);
    }

    @Test
    public void testMidpointBothNegative() throws Exception {
        assertEquals(-7.5, UnivariateRealSolverUtils.midpoint(-5.0, -10.0), 1e-9);
    }

    @Test
    public void testMidpointSameValue() throws Exception {
        assertEquals(7.0, UnivariateRealSolverUtils.midpoint(7.0, 7.0), 1e-9);
    }

    @Test
    public void testMidpointWithZero() throws Exception {
        assertEquals(0.0, UnivariateRealSolverUtils.midpoint(-5.0, 5.0), 1e-9);
    }
    
    @Test
    public void testMidpointLargeValues() throws Exception {
        assertEquals(5000000000.0, UnivariateRealSolverUtils.midpoint(0.0, 10000000000.0), 1e-9);
    }

    @Test
    public void testMidpointSmallValues() throws Exception {
        assertEquals(0.0000000005, UnivariateRealSolverUtils.midpoint(0.0, 0.000000001), 1e-18);
    }

    @Test
    public void testMidpointOnePositiveOneNegative() throws Exception {
        assertEquals(0.0, UnivariateRealSolverUtils.midpoint(-10.0, 10.0), 1e-9);
    }

    // Tests for IllegalArgumentExceptions

    @Test
    public void testSolveNullFunction() throws Exception {
        try {
            UnivariateRealSolverUtils.solve(null, 0.0, 1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSolveInvalidInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() { public double value(double x) { return x; } };
        try {
            UnivariateRealSolverUtils.solve(f, 5.0, 0.0); // x0 > x1
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            UnivariateRealSolverUtils.solve(f, 0.0, 0.0); // x0 == x1
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSolveWithAccuracyInvalid() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() { public double value(double x) { return x; } };
        try {
            UnivariateRealSolverUtils.solve(f, 0.0, 1.0, -1.0); // negative accuracy
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBracketNullFunction() throws Exception {
        try {
            UnivariateRealSolverUtils.bracket(null, 0.0, -1.0, 1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBracketInvalidInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() { public double value(double x) { return x; } };
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, 1.0, -1.0); // lowerBound > upperBound
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, 0.0, 1.0); // initial < lowerBound
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            UnivariateRealSolverUtils.bracket(f, 1.0, 0.0, 0.0); // initial > upperBound
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            UnivariateRealSolverUtils.bracket(f, 0.5, 0.0, 0.0); // lowerBound == upperBound
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testBracketInvalidMaxIterations() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() { public double value(double x) { return x; } };
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, -1.0, 1.0, 0); // maxIterations <= 0
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            UnivariateRealSolverUtils.bracket(f, 0.0, -1.0, 1.0, -10); // maxIterations <= 0
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
}
