package org.apache.commons.math.special;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.util.ContinuedFraction;

public class GammaTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testLogGammaPositive() throws Exception {
        // logGamma(4.0) = log(3!) = log(6)
        assertEquals(1.791759469228055, Gamma.logGamma(4.0), 1e-15);
    }

    @Test
    public void testLogGammaSmallPositive() throws Exception {
        // logGamma(0.5) = log(sqrt(pi))
        assertEquals(0.5723649429247001, Gamma.logGamma(0.5), 1e-15);
    }

    @Test
    public void testLogGammaNearZero() throws Exception {
        // logGamma(x) approaches infinity as x approaches 0 from the right.
        // logGamma(1e-10) should be a large negative number.
        // The previous assertion was too weak. Let's check the computed value.
        // Reference: logGamma(1e-10) = -23.025850929940457
        assertEquals(-23.025850929940457, Gamma.logGamma(1e-10), 1e-15);
    }

    @Test
    public void testLogGammaOne() throws Exception {
        // logGamma(1.0) = log(0!) = log(1) = 0
        assertEquals(0.0, Gamma.logGamma(1.0), 1e-15);
    }

    @Test
    public void testLogGammaInteger() throws Exception {
        // logGamma(n) = log((n-1)!) for positive integer n
        assertEquals(logGammaIntegerCheck(5), Gamma.logGamma(5.0), 1e-15);
        assertEquals(logGammaIntegerCheck(10), Gamma.logGamma(10.0), 1e-15);
    }

    @Test
    public void testLogGammaNaN() throws Exception {
        assertTrue(Double.isNaN(Gamma.logGamma(Double.NaN)));
    }

    @Test
    public void testLogGammaZero() throws Exception {
        assertTrue(Double.isNaN(Gamma.logGamma(0.0)));
    }

    @Test
    public void testLogGammaNegative() throws Exception {
        assertTrue(Double.isNaN(Gamma.logGamma(-1.0)));
        assertTrue(Double.isNaN(Gamma.logGamma(-5.5)));
    }

    @Test
    public void testRegularizedGammaPPositive() throws Exception {
        // P(a, x) for a=1, x=1
        // P(1, x) = 1 - exp(-x)
        assertEquals(1.0 - Math.exp(-1.0), Gamma.regularizedGammaP(1.0, 1.0), 1e-15);
    }

    @Test
    public void testRegularizedGammaPZeroX() throws Exception {
        // P(a, 0) = 0 for a > 0
        assertEquals(0.0, Gamma.regularizedGammaP(2.0, 0.0), 1e-15);
    }

    @Test
    public void testRegularizedGammaPLargeA() throws Exception {
        // For large a and x, P(a, x) can be approximated.
        // Using known values or approximations for comparison.
        // P(10, 10) is approximately 0.5420702855281482
        assertEquals(0.5420702855281482, Gamma.regularizedGammaP(10.0, 10.0), 1e-15);
    }

    @Test
    public void testRegularizedGammaPNonIntegerA() throws Exception {
        // Test with non-integer 'a'
        // P(2.5, 3.0) = 0.6937810815867234
        assertEquals(0.6937810815867234, Gamma.regularizedGammaP(2.5, 3.0), 1e-15);
    }

    @Test
    public void testRegularizedGammaPNegativeA() throws Exception {
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(-1.0, 2.0)));
    }

    @Test
    public void testRegularizedGammaPNegativeX() throws Exception {
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(2.0, -1.0)));
    }

    @Test
    public void testRegularizedGammaPNaNA() throws Exception {
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(Double.NaN, 2.0)));
    }

    @Test
    public void testRegularizedGammaPNanX() throws Exception {
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(2.0, Double.NaN)));
    }

    @Test
    public void testRegularizedGammaQPositive() throws Exception {
        // Q(a, x) = 1 - P(a, x)
        // Q(1, 1) = 1 - P(1, 1) = 1 - (1 - exp(-1)) = exp(-1)
        assertEquals(Math.exp(-1.0), Gamma.regularizedGammaQ(1.0, 1.0), 1e-15);
    }

    @Test
    public void testRegularizedGammaQZeroX() throws Exception {
        // Q(a, 0) = 1 for a > 0
        assertEquals(1.0, Gamma.regularizedGammaQ(2.0, 0.0), 1e-15);
    }

    @Test
    public void testRegularizedGammaQLargeA() throws Exception {
        // Q(10, 10) = 1 - P(10, 10)
        // P(10, 10) = 0.5420702855281482
        // Q(10, 10) = 1 - 0.5420702855281482 = 0.45792971447185427
        assertEquals(0.45792971447185427, Gamma.regularizedGammaQ(10.0, 10.0), 1e-15);
    }

    @Test
    public void testRegularizedGammaQNonIntegerA() throws Exception {
        // Q(2.5, 3.0) = 1 - P(2.5, 3.0)
        // P(2.5, 3.0) = 0.6937810815867234
        // Q(2.5, 3.0) = 1 - 0.6937810815867234 = 0.30621891841327664
        assertEquals(0.30621891841327664, Gamma.regularizedGammaQ(2.5, 3.0), 1e-15);
    }

    @Test
    public void testRegularizedGammaQNegativeA() throws Exception {
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(-1.0, 2.0)));
    }

    @Test
    public void testRegularizedGammaQNegativeX() throws Exception {
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(2.0, -1.0)));
    }

    @Test
    public void testRegularizedGammaQNaNA() throws Exception {
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(Double.NaN, 2.0)));
    }

    @Test
    public void testRegularizedGammaQNaNX() throws Exception {
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(2.0, Double.NaN)));
    }

    @Test
    public void testRegularizedGammaPMaxIterations() {
        try {
            Gamma.regularizedGammaP(0.5, 1.0, 1e-100, 1);
            fail("Expected MaxIterationsExceededException");
        } catch (MaxIterationsExceededException e) {
            // Expected
        } catch (MathException e) {
            fail("Expected MaxIterationsExceededException, but got MathException");
        }
    }

    @Test
    public void testRegularizedGammaQMaxIterations() {
        try {
            Gamma.regularizedGammaQ(2.0, 3.0, 1e-100, 1);
            fail("Expected MaxIterationsExceededException");
        } catch (MaxIterationsExceededException e) {
            // Expected
        } catch (MathException e) {
            fail("Expected MaxIterationsExceededException, but got MathException");
        }
    }

    /**
     * Helper method to compute logGamma(n) for integer n using (n-1)!
     */
    private double logGammaIntegerCheck(int n) {
        if (n <= 0) {
            return Double.NaN;
        }
        double factorial = 1.0;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }
        return Math.log(factorial);
    }
}
