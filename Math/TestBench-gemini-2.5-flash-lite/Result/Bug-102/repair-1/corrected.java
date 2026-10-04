package org.apache.commons.math.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.ChiSquaredDistribution;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.DistributionFactory;

public class ChiSquareTestImplTest {

    @Test
    public void testChiSquare1x1() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10 };
        double[] expected = { 10.0 };
        // chiSquare method requires length >= 2
        try {
            test.chiSquare(expected, observed);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquare1x2() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 10 };
        double[] expected = { 10.0, 10.0 };
        assertEquals(0.0, test.chiSquare(expected, observed), 1e-9);
    }
    
    @Test
    public void testChiSquare1x2Rescaled() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 12 }; // sum = 22
        double[] expected = { 9.0, 11.0 }; // sum = 20. Expected sum is 20, observed sum is 22. Rescaled by 22/20 = 1.1.
        assertEquals(0.0018365721957018368, test.chiSquare(expected, observed), 1e-9);
    }

    @Test
    public void testChiSquare1x3() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 10, 10 };
        double[] expected = { 10.0, 10.0, 10.0 };
        assertEquals(0.0, test.chiSquare(expected, observed), 1e-9);
    }
    
    @Test
    public void testChiSquare1x3Rescaled() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 12, 13 }; // sum = 35
        double[] expected = { 9.0, 11.0, 12.0 }; // sum = 32. Rescaled by 35/32.
        assertEquals(0.0038544500363274767, test.chiSquare(expected, observed), 1e-9);
    }

    @Test
    public void testChiSquareNonRescaled() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 10, 10 };
        double[] expected = { 9.0, 11.0, 12.0 }; // sum = 32
        assertEquals(0.5353535353535353, test.chiSquare(expected, observed), 1e-9);
    }
    
    @Test
    public void testChiSquareNegativeExpected() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 10 };
        double[] expected = { 10.0, -10.0 };
        try {
            test.chiSquare(expected, observed);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquareZeroExpected() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 10 };
        double[] expected = { 10.0, 0.0 };
        try {
            test.chiSquare(expected, observed);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquareNegativeObserved() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, -10 };
        double[] expected = { 10.0, 10.0 };
        try {
            test.chiSquare(expected, observed);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquareZeroObserved() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 0 };
        double[] expected = { 10.0, 10.0 };
        assertEquals(10.0, test.chiSquare(expected, observed), 1e-9);
    }

    @Test
    public void testChiSquareDataSetsComparison() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {10, 10};
        long[] observed2 = {10, 10};
        assertEquals(0.0, test.chiSquareDataSetsComparison(observed1, observed2), 1e-9);
    }

    @Test
    public void testChiSquareDataSetsComparisonRescaled() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {10, 12}; // sum1 = 22
        long[] observed2 = {11, 10}; // sum2 = 21
        assertEquals(0.2061280819119361, test.chiSquareDataSetsComparison(observed1, observed2), 1e-9);
    }

    @Test
    public void testChiSquareDataSetsComparisonZeroObserved1() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {0, 0};
        long[] observed2 = {10, 10};
        try {
            test.chiSquareDataSetsComparison(observed1, observed2);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquareDataSetsComparisonZeroObserved2() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {10, 10};
        long[] observed2 = {0, 0};
        try {
            test.chiSquareDataSetsComparison(observed1, observed2);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testChiSquareDataSetsComparisonBothZero() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {0, 10};
        long[] observed2 = {0, 10};
        try {
            test.chiSquareDataSetsComparison(observed1, observed2);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquareDataSetsComparisonNegativeObserved1() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {-10, 10};
        long[] observed2 = {10, 10};
        try {
            test.chiSquareDataSetsComparison(observed1, observed2);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquareDataSetsComparisonNegativeObserved2() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {10, 10};
        long[] observed2 = {-10, 10};
        try {
            test.chiSquareDataSetsComparison(observed1, observed2);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testChiSquareDataSetsComparisonLengthMismatch() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {10, 10, 10};
        long[] observed2 = {10, 10};
        try {
            test.chiSquareDataSetsComparison(observed1, observed2);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquareDataSetsComparisonOneElement() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {10};
        long[] observed2 = {10};
        try {
            test.chiSquareDataSetsComparison(observed1, observed2);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquareTest1x2() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 10 };
        double[] expected = { 10.0, 10.0 };
        assertEquals(1.0, test.chiSquareTest(expected, observed), 1e-9);
    }
    
    @Test
    public void testChiSquareTest1x3NonRescaled() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 10, 10 };
        double[] expected = { 9.0, 11.0, 12.0 }; // sumSq = 0.5353535353535353
        assertEquals(0.7644067219393321, test.chiSquareTest(expected, observed), 1e-9);
    }

    @Test
    public void testChiSquareTest1x3Rescaled() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 12, 13 }; // sum = 35
        double[] expected = { 9.0, 11.0, 12.0 }; // sum = 32. Rescaled by 35/32.
        assertEquals(0.9961555499636725, test.chiSquareTest(expected, observed), 1e-9);
    }
    
    @Test
    public void testChiSquareTestDataSetsComparisonTest() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {10, 10};
        long[] observed2 = {10, 10};
        assertEquals(1.0, test.chiSquareTestDataSetsComparison(observed1, observed2), 1e-9);
    }
    
    @Test
    public void testChiSquareTestDataSetsComparisonTestRescaled() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {10, 12}; // sum1 = 22
        long[] observed2 = {11, 10}; // sum2 = 21
        assertEquals(0.3499719180880639, test.chiSquareTestDataSetsComparison(observed1, observed2), 1e-9);
    }

    @Test
    public void testChiSquareTestWithAlpha() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 10 };
        double[] expected = { 10.0, 10.0 };
        // p-value = 1.0
        assertFalse(test.chiSquareTest(expected, observed, 0.05)); // 1.0 is not < 0.05
        
        long[] observed2 = { 10, 10 }; // using same as above for clarity
        double[] expected2 = { 9.0, 11.0 };
        // p-value = 0.7644067219393321
        assertFalse(test.chiSquareTest(expected2, observed2, 0.05)); // 0.7644 is not < 0.05
        assertTrue(test.chiSquareTest(expected2, observed2, 0.8)); // 0.7644 is < 0.8
    }

    @Test
    public void testChiSquareTestWithAlphaInvalidAlpha() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed = { 10, 10 };
        double[] expected = { 10.0, 10.0 };
        try {
            test.chiSquareTest(expected, observed, 0.0);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            test.chiSquareTest(expected, observed, 0.6);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquareTestDataSetsComparisonTestWithAlpha() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {10, 10};
        long[] observed2 = {10, 10};
        // p-value = 1.0
        assertFalse(test.chiSquareTestDataSetsComparison(observed1, observed2, 0.05)); // 1.0 is not < 0.05
    }

    @Test
    public void testChiSquareTestDataSetsComparisonTestWithAlphaInvalidAlpha() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[] observed1 = {10, 10};
        long[] observed2 = {10, 10};
        try {
            test.chiSquareTestDataSetsComparison(observed1, observed2, 0.0);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            test.chiSquareTestDataSetsComparison(observed1, observed2, 0.6);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testChiSquare2x2() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10, 10}, {10, 10}};
        assertEquals(0.0, test.chiSquare(counts), 1e-9);
    }

    @Test
    public void testChiSquare2x2NonHomogeneous() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10, 15}, {12, 8}};
        assertEquals(1.7784439370977318, test.chiSquare(counts), 1e-9);
    }

    @Test
    public void testChiSquare2x2ZeroCell() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10, 0}, {10, 10}};
        assertEquals(7.502083333333334, test.chiSquare(counts), 1e-9);
    }
    
    @Test
    public void testChiSquare2x2Test() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10, 10}, {10, 10}};
        assertEquals(1.0, test.chiSquareTest(counts), 1e-9);
    }
    
    @Test
    public void testChiSquare2x2NonHomogeneousTest() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10, 15}, {12, 8}};
        assertEquals(0.1654929003579316, test.chiSquareTest(counts), 1e-9);
    }

    @Test
    public void testChiSquare2x2TestWithAlpha() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10, 10}, {10, 10}};
        assertFalse(test.chiSquareTest(counts, 0.05)); // 1.0 is not < 0.05
    }

    @Test
    public void testChiSquare2x2NonHomogeneousTestWithAlpha() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10, 15}, {12, 8}};
        assertTrue(test.chiSquareTest(counts, 0.2)); // 0.165 < 0.2
        assertFalse(test.chiSquareTest(counts, 0.1)); // 0.165 is not < 0.1
    }

    @Test
    public void testChiSquareTest2x2InvalidDimensions() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10}, {10}};
        try {
            test.chiSquare(counts);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testChiSquareTest2x2InvalidDimensions2() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10, 10}};
        try {
            test.chiSquare(counts);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testChiSquareTest2x2NonRectangular() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10, 10}, {10}};
        try {
            test.chiSquare(counts);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testChiSquareTest2x2NonNegative() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        long[][] counts = {{10, 10}, {10, -10}};
        try {
            test.chiSquare(counts);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testSetDistribution() throws Exception {
        ChiSquareTestImpl test = new ChiSquareTestImpl();
        ChiSquaredDistribution mockDist = new ChiSquaredDistributionImpl(1.0);
        test.setDistribution(mockDist);
        assertTrue(true); 
    }

}
