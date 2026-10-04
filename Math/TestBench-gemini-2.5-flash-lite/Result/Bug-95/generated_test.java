package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathException;
import org.apache.commons.math.special.Beta;

public class FDistributionImplTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructor() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        assertEquals(2.0, dist.getNumeratorDegreesOfFreedom(), 1e-15);
        assertEquals(3.0, dist.getDenominatorDegreesOfFreedom(), 1e-15);
    }

    @Test
    public void testSetNumeratorDegreesOfFreedom() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        dist.setNumeratorDegreesOfFreedom(4.0);
        assertEquals(4.0, dist.getNumeratorDegreesOfFreedom(), 1e-15);
    }

    @Test
    public void testSetDenominatorDegreesOfFreedom() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        dist.setDenominatorDegreesOfFreedom(5.0);
        assertEquals(5.0, dist.getDenominatorDegreesOfFreedom(), 1e-15);
    }

    @Test
    public void testGetNumeratorDegreesOfFreedom() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        assertEquals(2.0, dist.getNumeratorDegreesOfFreedom(), 1e-15);
    }

    @Test
    public void testGetDenominatorDegreesOfFreedom() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        assertEquals(3.0, dist.getDenominatorDegreesOfFreedom(), 1e-15);
    }

    @Test
    public void testCumulativeProbabilityBelowZero() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        assertEquals(0.0, dist.cumulativeProbability(0.0), 1e-15);
        assertEquals(0.0, dist.cumulativeProbability(-1.0), 1e-15);
    }

    @Test
    public void testCumulativeProbabilityPositiveX() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        // Value computed using R: pf(1.0, 2, 3) = 0.4033246
        assertEquals(0.4033246, dist.cumulativeProbability(1.0), 1e-7);
    }
    
    @Test
    public void testCumulativeProbabilityLargeN() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(1000.0, 1000.0);
        // For large degrees of freedom, F distribution approximates normal distribution N(1, 2/df_num + 2/df_den) = N(1, 4/1000)
        // For x=1, prob should be close to 0.5.
        // Using R: pf(1.0, 1000, 1000) = 0.4999875
        assertEquals(0.4999875, dist.cumulativeProbability(1.0), 1e-7); 
    }

    @Test
    public void testCumulativeProbabilitySmallX() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(1.0, 1.0);
        // P(X < x) = I(nx/(m+nx), n/2, m/2) = I(x/(1+x), 0.5, 0.5)
        // For x -> 0, I(0, 0.5, 0.5) = 0.
        // Using R: pf(1e-10, 1, 1) = 6.366198e-06
        assertEquals(6.366197723463602E-6, dist.cumulativeProbability(1e-10), 1e-15);
    }

    @Test
    public void testInverseCumulativeProbabilityZero() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        assertEquals(0.0, dist.inverseCumulativeProbability(0.0), 1e-15);
    }

    @Test
    public void testInverseCumulativeProbabilityOne() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        assertEquals(Double.POSITIVE_INFINITY, dist.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityMidRange() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        // Value computed using R: qf(0.5, 2, 3) = 0.8659412
        assertEquals(0.8659412, dist.inverseCumulativeProbability(0.5), 1e-7);
    }

    @Test
    public void testInverseCumulativeProbabilityLargeProbability() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        // Value computed using R: qf(0.95, 2, 3) = 3.490329
        assertEquals(3.490329, dist.inverseCumulativeProbability(0.95), 1e-6);
    }
    
    @Test
    public void testInverseCumulativeProbabilitySmallProbability() throws Exception {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        // Value computed using R: qf(0.05, 2, 3) = 0.1054569
        assertEquals(0.1054569, dist.inverseCumulativeProbability(0.05), 1e-7);
    }

    @Test
    public void testSetNumeratorDegreesOfFreedomBelowZero() {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        try {
            dist.setNumeratorDegreesOfFreedom(0.0);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
        try {
            dist.setNumeratorDegreesOfFreedom(-1.0);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
    }

    @Test
    public void testSetDenominatorDegreesOfFreedomBelowZero() {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        try {
            dist.setDenominatorDegreesOfFreedom(0.0);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
        try {
            dist.setDenominatorDegreesOfFreedom(-1.0);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
    }
    
    @Test
    public void testGetInitialDomain() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 10.0);
        // For p=0.5, initial domain is d/(d-2) if d > 2. Here d=10, so 10.0 / (10.0 - 2.0) = 1.25
        assertEquals(1.25, dist.getInitialDomain(0.5), 1e-15);
    }

    @Test
    public void testGetInitialDomainSmallDenominator() {
        FDistributionImpl dist = new FDistributionImpl(5.0, 1.5);
        // For p=0.5, initial domain is 1.0 if d <= 2. Here d=1.5, so it should be 1.0
        assertEquals(1.0, dist.getInitialDomain(0.5), 1e-15);
    }

    @Test
    public void testGetDomainLowerBound() {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        assertEquals(0.0, dist.getDomainLowerBound(0.5), 1e-15);
    }

    @Test
    public void testGetDomainUpperBound() {
        FDistributionImpl dist = new FDistributionImpl(2.0, 3.0);
        assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.5), 0.0);
    }

    @Test
    public void testLargeDenominatorDegreesOfFreedom() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(10.0, 1000.0);
        // Using R: pbeta(10/1010, 5, 500) = 0.4856825
        assertEquals(0.4856825, dist.cumulativeProbability(1.0), 1e-7);
    }

    @Test
    public void testLargeNumeratorDegreesOfFreedom() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(1000.0, 10.0);
        // Using R: pbeta(1000/1010, 500, 5) = 0.5319302
        assertEquals(0.5319302, dist.cumulativeProbability(1.0), 1e-7);
    }

    @Test
    public void testInverseCumulativeProbabilityEdgeCase() throws MathException {
        FDistributionImpl dist = new FDistributionImpl(1.0, 1.0);
        // For n=1, m=1, inverseCumulativeProbability(p) = ( (1-p)/p )^2
        // For p = 0.1, ( (1-0.1)/0.1 )^2 = (0.9/0.1)^2 = 9^2 = 81
        assertEquals(81.0, dist.inverseCumulativeProbability(0.1), 1e-15);
        // For p = 0.9, ( (1-0.9)/0.9 )^2 = (0.1/0.9)^2 = (1/9)^2 = 1/81
        assertEquals(1.0/81.0, dist.inverseCumulativeProbability(0.9), 1e-15);
    }
}
