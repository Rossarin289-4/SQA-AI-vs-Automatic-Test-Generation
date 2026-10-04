package org.apache.commons.math3.random;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.util.FastMath;

public class BitsStreamGeneratorTest {
    @Test
    public void testNextBooleanRepeatableFromSeed() throws Exception {
        MersenneTwister first = new MersenneTwister(42);
        MersenneTwister second = new MersenneTwister(42);
        assertEquals(first.nextBoolean(), second.nextBoolean());
    }

    @Test
    public void testNextBytesEmptyArray() throws Exception {
        MersenneTwister random = new MersenneTwister(7);
        byte[] bytes = new byte[0];
        random.nextBytes(bytes);
        assertEquals(0, bytes.length);
    }

    @Test
    public void testNextBytesLengthsBelowWordSize() throws Exception {
        for (int length = 1; length <= 3; length++) {
            MersenneTwister random = new MersenneTwister(9);
            byte[] bytes = new byte[length];
            random.nextBytes(bytes);
            assertEquals(length, bytes.length);
        }
    }

    @Test
    public void testNextBytesExactlyWordSize() throws Exception {
        MersenneTwister random = new MersenneTwister(11);
        byte[] bytes = new byte[4];
        random.nextBytes(bytes);
        assertEquals(4, bytes.length);
    }

    @Test
    public void testNextBytesAcrossWordBoundary() throws Exception {
        MersenneTwister random = new MersenneTwister(13);
        byte[] bytes = new byte[5];
        random.nextBytes(bytes);
        assertEquals(5, bytes.length);
    }

    @Test
    public void testNextDoubleInUnitInterval() throws Exception {
        MersenneTwister random = new MersenneTwister(17);
        double value = random.nextDouble();
        assertTrue(value >= 0.0 && value < 1.0);
    }

    @Test
    public void testNextDoubleRepeatableFromSeed() throws Exception {
        MersenneTwister first = new MersenneTwister(19);
        MersenneTwister second = new MersenneTwister(19);
        assertEquals(first.nextDouble(), second.nextDouble(), 0.0);
    }

    @Test
    public void testNextFloatInUnitInterval() throws Exception {
        MersenneTwister random = new MersenneTwister(23);
        float value = random.nextFloat();
        assertTrue(value >= 0.0f && value < 1.0f);
    }

    @Test
    public void testNextFloatRepeatableFromSeed() throws Exception {
        MersenneTwister first = new MersenneTwister(29);
        MersenneTwister second = new MersenneTwister(29);
        assertEquals(first.nextFloat(), second.nextFloat(), 0.0f);
    }

    @Test
    public void testGaussianPairAndCachedSecondValue() throws Exception {
        MersenneTwister first = new MersenneTwister(31);
        MersenneTwister second = new MersenneTwister(31);
        double x = first.nextDouble();
        double y = first.nextDouble();
        double alpha = 2 * FastMath.PI * x;
        double radius = FastMath.sqrt(-2 * FastMath.log(y));
        double expectedFirst = radius * FastMath.cos(alpha);
        double expectedSecond = radius * FastMath.sin(alpha);
        assertEquals(expectedFirst, second.nextGaussian(), 1e-12);
        assertEquals(expectedSecond, second.nextGaussian(), 1e-12);
    }

    @Test
    public void testClearDiscardsCachedGaussian() throws Exception {
        MersenneTwister first = new MersenneTwister(37);
        MersenneTwister second = new MersenneTwister(37);
        first.nextGaussian();
        first.clear();
        assertEquals(second.nextGaussian(), first.nextGaussian(), 0.0);
    }

    @Test
    public void testNextIntRepeatableFromSeed() throws Exception {
        MersenneTwister first = new MersenneTwister(41);
        MersenneTwister second = new MersenneTwister(41);
        assertEquals(first.nextInt(), second.nextInt());
    }

    @Test
    public void testNextLongRepeatableFromSeed() throws Exception {
        MersenneTwister first = new MersenneTwister(43);
        MersenneTwister second = new MersenneTwister(43);
        assertEquals(first.nextLong(), second.nextLong());
    }

    @Test
    public void testNextLongCombinesTwoIntDraws() throws Exception {
        MersenneTwister combined = new MersenneTwister(47);
        MersenneTwister pieces = new MersenneTwister(47);
        long high = ((long) pieces.nextInt()) << 32;
        long low = ((long) pieces.nextInt()) & 0xffffffffL;
        assertEquals(high | low, combined.nextLong());
    }

    @Test
    public void testNextIntPowerOfTwoBounds() throws Exception {
        MersenneTwister random = new MersenneTwister(53);
        int value = random.nextInt(8);
        assertTrue(value >= 0 && value < 8);
    }

    @Test
    public void testNextIntNonPowerOfTwoBounds() throws Exception {
        MersenneTwister random = new MersenneTwister(59);
        int value = random.nextInt(7);
        assertTrue(value >= 0 && value < 7);
    }

    @Test
    public void testNextIntLargestPositiveBound() throws Exception {
        MersenneTwister random = new MersenneTwister(61);
        int value = random.nextInt(Integer.MAX_VALUE);
        assertTrue(value >= 0 && value < Integer.MAX_VALUE);
    }

    @Test
    public void testNextIntRejectsZeroBound() throws Exception {
        MersenneTwister random = new MersenneTwister(67);
        try {
            random.nextInt(0);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
        }
    }

    @Test
    public void testNextIntRejectsNegativeBound() throws Exception {
        MersenneTwister random = new MersenneTwister(71);
        try {
            random.nextInt(-1);
            fail("expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
        }
    }
}
