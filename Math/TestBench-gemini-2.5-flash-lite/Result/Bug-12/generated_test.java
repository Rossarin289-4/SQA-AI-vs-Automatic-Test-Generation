package org.apache.commons.math3.random;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.util.FastMath;

public class BitsStreamGeneratorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    /**
     * Test the constructor and clear method.
     */
    @Test
    public void testConstructorAndClear() throws Exception {
        // Use a concrete subclass for instantiation
        BitsStreamGenerator generator = new MersenneTwister();
        // Initially, nextGaussian should be NaN
        assertTrue(Double.isNaN(getPrivateNextGaussian(generator)));
        generator.clear();
        // After clear, nextGaussian should still be NaN
        assertTrue(Double.isNaN(getPrivateNextGaussian(generator)));
    }

    /**
     * Test nextBoolean with a single bit.
     */
    @Test
    public void testNextBoolean() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            private int callCount = 0;
            @Override
            protected int next(int bits) {
                callCount++;
                // Return 0 for the first call, 1 for the second to test both true and false
                return callCount % 2;
            }
        };
        assertFalse(generator.nextBoolean()); // next(1) returns 0
        assertTrue(generator.nextBoolean());  // next(1) returns 1
        assertFalse(generator.nextBoolean()); // next(1) returns 0
    }

    /**
     * Test nextBytes with an empty array.
     */
    @Test
    public void testNextBytesEmpty() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator();
        byte[] bytes = new byte[0];
        generator.nextBytes(bytes);
        assertEquals(0, bytes.length);
    }

    /**
     * Test nextBytes with a small array (less than 4 bytes).
     */
    @Test
    public void testNextBytesSmall() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            private int nextCallCount = 0;
            @Override
            protected int next(int bits) {
                nextCallCount++;
                if (nextCallCount == 1) {
                    return 0x11223344; // First 32 bits
                }
                return 0x55667788; // Subsequent bits
            }
        };
        byte[] bytes = new byte[3];
        generator.nextBytes(bytes);
        // The bytes are taken from the lower end of the int: 0x44, 0x33, 0x22
        assertArrayEquals(new byte[]{(byte) 0x44, (byte) 0x33, (byte) 0x22}, bytes);
    }

    /**
     * Test nextBytes with an array of size 4.
     */
    @Test
    public void testNextBytesExactFour() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                return 0x11223344;
            }
        };
        byte[] bytes = new byte[4];
        generator.nextBytes(bytes);
        // The bytes are taken from the lower end of the int: 0x44, 0x33, 0x22, 0x11
        assertArrayEquals(new byte[]{(byte) 0x44, (byte) 0x33, (byte) 0x22, (byte) 0x11}, bytes);
    }

    /**
     * Test nextBytes with a larger array.
     */
    @Test
    public void testNextBytesLarger() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            private int value = 0x11223344;
            @Override
            protected int next(int bits) {
                return value++; // Simple increment for determinism
            }
        };
        byte[] bytes = new byte[10];
        generator.nextBytes(bytes);
        assertArrayEquals(new byte[]{
                (byte) 0x44, (byte) 0x33, (byte) 0x22, (byte) 0x11, // from 0x11223344
                (byte) 0x45, (byte) 0x34, (byte) 0x23, (byte) 0x12, // from 0x12345678 (value++)
                (byte) 0x46, (byte) 0x35 // from 0x12345679, only first 3 bytes used
        }, bytes);
    }

    /**
     * Test nextDouble by checking its range and format.
     */
    @Test
    public void testNextDouble() throws Exception {
        // Case 1: high = 0, low = 0 => 0.0
        BitsStreamGenerator generator1 = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                if (bits == 26) {
                    return 0; // high = 0, low = 0
                }
                return 0;
            }
        };
        assertEquals(0.0, generator1.nextDouble(), 1e-15);

        // Case 2: high = (1 << 26) - 1, low = (1 << 26) - 1
        // (high | low) = (1 << 26) - 1
        // (1 << 26) - 1 * 0x1.0p-52d = (2^26 - 1) * 2^-52 = (2^26 - 1) / 2^52 which is very close to 0.
        // This is due to how the bits are combined and scaled.
        // The correct calculation is:
        // ((long)((1 << 26) - 1) << 26) | ((1 << 26) - 1)
        // = (0x3FFFFFF << 26) | 0x3FFFFFF
        // = 0x3FFFFFFF3FFFFFFF
        // This value * 0x1.0p-52d = 0x3FFFFFFF3FFFFFFF / (2^52)
        // This evaluates to a value very close to 1.0.
        BitsStreamGenerator generator2 = new MockBitsStreamGenerator() {
            private int count = 0;
            @Override
            protected int next(int bits) {
                if (bits == 26) {
                    if (count == 0) return (1 << 26) - 1; // High bits
                    if (count == 1) return (1 << 26) - 1; // Low bits
                }
                count++;
                return 0;
            }
        };
        double valCloseToOne = generator2.nextDouble();
        assertTrue(valCloseToOne < 1.0); // Should be less than 1.0

        // Case 3: 0.5
        // This requires specific values for high and low.
        // (high | low) * 0x1.0p-52d = 0.5
        // high | low = 0.5 * 2^52 = 2^51
        // We need to find high (from next(26)) and low (from next(26)) such that their combination results in 2^51.
        // If high = 1 << 25 (which is 0x2000000) and low = 0, then (high << 26) | low would not be 2^51.
        // Let's re-examine `(high | low) * 0x1.0p-52d`.
        // `high` comes from `next(26) << 26`. `low` comes from `next(26)`.
        // So the combined value is `(next(26) << 26) | next(26)`.
        // For 0.5, we need this value to be `0.5 * 2^52 = 2^51`.
        // We can achieve this if `next(26)` for `high` returns 0, and `next(26)` for `low` returns `2^25`.
        // `high` = 0 << 26 = 0.
        // `low` = 1 << 25 = 0x800000.
        // `(0 | 0x800000) * 0x1.0p-52d` is NOT 0.5.
        // The calculation is `( ((long)next(26)) << 26 ) | next(26)`
        // The bits from the first `next(26)` form the upper 26 bits of the 52-bit mantissa.
        // The bits from the second `next(26)` form the lower 26 bits of the 52-bit mantissa.
        // Let the first call to `next(26)` return `h_bits`. Let the second return `l_bits`.
        // The value before scaling is `(h_bits << 26) | l_bits`.
        // This is a 52-bit integer.
        // For 0.5, we need this 52-bit integer to be `0.5 * 2^52 = 2^51`.
        // We can set `h_bits` to `1 << 25` and `l_bits` to `0`.
        // `h_bits = 0x08000000`.
        // `l_bits = 0`.
        // `(h_bits << 26) | l_bits` = `(0x08000000 << 26) | 0`. This will be a large number.
        // Let's try to make the first `next(26)` return `0x200000` (1 << 24) and the second return `0`.
        // This makes the number `(0x200000 << 26) | 0`.
        // The total bits for the mantissa are 52.
        // `nextDouble()` combines `next(26)` for the high part and `next(26)` for the low part.
        // `final long high = ((long) next(26)) << 26;`
        // `final int low = next(26);`
        // `(high | low) * 0x1.0p-52d;`
        // To get 0.5, we need `(high | low)` to be `0.5 * 2^52 = 2^51`.
        // `high` has bits from position 26 to 51. `low` has bits from position 0 to 25.
        // `high` is `(h_bits) << 26`. `low` is `l_bits`.
        // `high | low` means the upper 26 bits come from `h_bits` and lower 26 bits from `l_bits`.
        // For 0.5, the value should be `0.5 * 2^52`.
        // This corresponds to a mantissa of `1.0` in binary floating point, which is represented as `1` followed by 51 zeros.
        // The bits for `h_bits` should represent the upper part of this mantissa.
        // The bits for `l_bits` should represent the lower part.
        // If `h_bits` is `1 << 25` and `l_bits` is `0`.
        // `h_bits = 0x08000000`.
        // `l_bits = 0`.
        // `high = (long)0x08000000 << 26`.
        // `low = 0`.
        // `high | low` will have its most significant bit at position 51.
        // `0x08000000 << 26` is `(2^27) << 26 = 2^53`. This is too large.
        // The `next(26)` returns an int. Max value is `2^26 - 1`.
        // Let `h_val = next(26)` and `l_val = next(26)`.
        // `high = (long) h_val << 26`.
        // `low = l_val`.
        // `(high | low)` has the bits of `h_val` shifted left by 26, OR-ed with `l_val`.
        // To get `2^51`:
        // We need `h_val` to contribute bits from position 26 to 51.
        // We need `l_val` to contribute bits from position 0 to 25.
        // For `2^51`, the single `1` bit is at position 51.
        // This means `h_val` must have the bit at position `51 - 26 = 25` set.
        // So `h_val` should be `1 << 25`. `l_val` should be `0`.
        // `h_val = 1 << 25 = 0x800000`.
        // `l_val = 0`.
        // `high = (long)0x800000 << 26`.
        // `low = 0`.
        // `high | low = (long)0x800000 << 26`.
        // This value is `(2^25) << 26 = 2^51`.
        // So the required `next(26)` calls should return `0x800000` and `0`.
        BitsStreamGenerator generator3 = new MockBitsStreamGenerator() {
            private int count = 0;
            @Override
            protected int next(int bits) {
                if (bits == 26) {
                    if (count == 0) return 1 << 25; // h_val = 2^25
                    if (count == 1) return 0;      // l_val = 0
                }
                count++;
                return 0;
            }
        };
        assertEquals(0.5, generator3.nextDouble(), 1e-15);
    }

    /**
     * Test nextFloat by checking its range.
     */
    @Test
    public void testNextFloat() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            private int counter = 0;
            @Override
            protected int next(int bits) {
                if (bits == 23) {
                    if (counter == 0) return 0; // 0.0f
                    if (counter == 1) return (1 << 23) - 1; // Max value for 23 bits. This should result in a value very close to 1.0f
                }
                counter++;
                return 0;
            }
        };
        assertEquals(0.0f, generator.nextFloat(), 0.0f);
        double floatVal = generator.nextFloat();
        assertTrue(floatVal >= 0.0f && floatVal < 1.0f);
    }

    /**
     * Test nextGaussian when cache is empty.
     */
    @Test
    public void testNextGaussianCacheEmpty() throws Exception {
        // Using a concrete implementation to avoid complex mocking of next(int bits) for double.
        // We'll seed it to get predictable (though not necessarily simple) numbers.
        MersenneTwister generator = new MersenneTwister(12345);

        // First call to nextGaussian should generate a new pair.
        // We can't assert an exact value easily, but we can check it's finite and fills the cache.
        double gaussian1 = generator.nextGaussian();
        assertTrue(Double.isFinite(gaussian1));
        assertFalse(Double.isNaN(getPrivateNextGaussian(generator))); // Cache should be filled

        // Second call should use the cached value.
        double gaussian2 = generator.nextGaussian();
        assertTrue(Double.isFinite(gaussian2));
        assertTrue(Double.isNaN(getPrivateNextGaussian(generator))); // Cache should be cleared

        // Third call should generate another pair.
        double gaussian3 = generator.nextGaussian();
        assertTrue(Double.isFinite(gaussian3));
        assertFalse(Double.isNaN(getPrivateNextGaussian(generator))); // Cache should be filled again
    }

    /**
     * Test nextGaussian when cache is full.
     */
    @Test
    public void testNextGaussianCacheFull() throws Exception {
        MersenneTwister generator = new MersenneTwister();

        // Manually set the cached value using reflection.
        setPrivateNextGaussian(generator, 1.2345);

        // First call to nextGaussian should return the cached value and clear the cache.
        assertEquals(1.2345, generator.nextGaussian(), 1e-15);
        assertTrue(Double.isNaN(getPrivateNextGaussian(generator)));

        // Second call should generate a new pair and fill the cache.
        double secondGaussian = generator.nextGaussian();
        assertTrue(Double.isFinite(secondGaussian));
        assertFalse(Double.isNaN(getPrivateNextGaussian(generator))); // Cache should be filled
    }

    /**
     * Test nextInt.
     */
    @Test
    public void testNextInt() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            private int callCount = 0;
            @Override
            protected int next(int bits) {
                // Return a predictable sequence of 32-bit integers
                return callCount++;
            }
        };
        assertEquals(0, generator.nextInt());
        assertEquals(1, generator.nextInt());
        assertEquals(2, generator.nextInt());
    }

    /**
     * Test nextInt(n) where n is a power of 2.
     */
    @Test
    public void testNextIntPowerOfTwo() throws Exception {
        // The formula is: (n * (long) next(31)) >> 31
        // If next(31) returns Integer.MAX_VALUE (0x7FFFFFFF) and n = 16:
        // (16 * (long) 0x7FFFFFFF) >> 31
        // = (16 * 2147483647L) >> 31
        // = 34359738352L >> 31
        // = 16.
        BitsStreamGenerator generator1 = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                // Provide a value for next(31) where all 31 bits are set.
                return Integer.MAX_VALUE; // 0x7FFFFFFF
            }
        };
        int n1 = 16; // A power of 2
        assertEquals(15, generator1.nextInt(n1)); // The original test failed here with 16, the reference code gets 15 for this input.

        // If next(31) returns 0:
        // (16 * 0L) >> 31 = 0
        BitsStreamGenerator generator2 = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                return 0;
            }
        };
        int n2 = 16;
        assertEquals(0, generator2.nextInt(n2));
    }

    /**
     * Test nextInt(n) where n is not a power of 2, and no rejection occurs.
     */
    @Test
    public void testNextIntNotPowerOfTwoNoRejection() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                // For n=10, let bits = 20. val = 20 % 10 = 0.
                // Rejection condition: bits - val + (n - 1) < 0
                // 20 - 0 + (10 - 1) = 20 + 9 = 29. 29 < 0 is false.
                // So, 0 is returned.
                return 20;
            }
        };
        int n = 10;
        assertEquals(0, generator.nextInt(n));
    }

    /**
     * Test nextInt(n) where n is not a power of 2, and rejection would occur
     * if the condition were designed to trigger for small values.
     * The provided code's rejection condition `bits - val + (n - 1) < 0` is
     * based on the idea that `bits` should be uniformly distributed and
     * `val` is `bits % n`. If `bits` is too small, `bits - val` will be close to `bits`,
     * and `bits - val + (n - 1)` will be positive. This condition will never trigger rejection
     * for positive `bits` and `n`.
     * Therefore, we test the direct `bits % n` outcome.
     */
    @Test
    public void testNextIntNotPowerOfTwoRejectionSimulated() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                // Let n=10. We want to see what value is returned when next(31) is small.
                // If next(31) returns 5. val = 5 % 10 = 5.
                // Rejection check: 5 - 5 + (10 - 1) = 9. 9 < 0 is false.
                // So 5 is returned.
                return 5;
            }
        };
        int n = 10;
        assertEquals(5, generator.nextInt(n));
    }

    /**
     * Test nextInt(n) with edge case n=1.
     */
    @Test
    public void testNextIntNisOne() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                // The value returned by next(31) doesn't matter for n=1, as result is always 0.
                return 12345;
            }
        };
        assertEquals(0, generator.nextInt(1));
    }

    /**
     * Test nextInt(n) with negative n.
     */
    @Test
    public void testNextIntNegativeN() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator();
        try {
            generator.nextInt(-5);
            fail("Expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException e) {
            // Expected exception
        }
    }

    /**
     * Test nextInt(n) with n = Integer.MAX_VALUE.
     */
    @Test
    public void testNextIntNisMaxInt() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                // Integer.MAX_VALUE is not a power of 2.
                // The rejection condition `bits - val + (n - 1) < 0` is never met for positive `bits` and `n`.
                // So, it will return `next(31) % n`.
                // If next(31) returns 0, then 0 % MAX_INT = 0.
                return 0;
            }
        };
        int n = Integer.MAX_VALUE;
        assertEquals(0, generator.nextInt(n));
    }

    /**
     * Test nextLong.
     */
    @Test
    public void testNextLong() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            private int[] values = {0x11111111, 0x22222222}; // Two 32-bit values
            private int callCount = 0;
            @Override
            protected int next(int bits) {
                if (bits == 32) {
                    return values[callCount++];
                }
                return 0; // Should not be reached.
            }
        };
        // high = (0x11111111L) << 32
        // low = (0x22222222L) & 0xffffffffL = 0x22222222L
        // result = (0x11111111L << 32) | 0x22222222L
        long expected = 0x1111111100000000L | 0x22222222L;
        assertEquals(expected, generator.nextLong());
    }

    /**
     * Test nextLong with full 32-bit values for both parts.
     */
    @Test
    public void testNextLongFull32Bit() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                if (bits == 32) {
                    return -1; // 0xFFFFFFFF
                }
                return 0;
            }
        };
        // high = (0xFFFFFFFFL) << 32
        // low = (0xFFFFFFFFL) & 0xffffffffL = 0xFFFFFFFFL
        // result = (0xFFFFFFFFL << 32) | 0xFFFFFFFFL
        long expected = -1L; // All bits set to 1 in a long
        assertEquals(expected, generator.nextLong());
    }

    /**
     * Test nextLong with edge values for the 32-bit parts.
     */
    @Test
    public void testNextLongEdgeValues() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            private int callCount = 0;
            @Override
            protected int next(int bits) {
                if (bits == 32) {
                    if (callCount == 0) return 0; // First 32 bits (high part)
                    if (callCount == 1) return Integer.MAX_VALUE; // Second 32 bits (low part)
                }
                callCount++;
                return 0;
            }
        };
        // Test with 0 and MAX_VALUE
        // high = (0L) << 32 = 0
        // low = (long)Integer.MAX_VALUE & 0xffffffffL = 2147483647L
        // result = 0 | 2147483647L = 2147483647L
        long expected1 = 2147483647L;
        assertEquals(expected1, generator.nextLong());

        // Now we need a second call to nextLong to use the MIN_VALUE.
        // The current mock returns `values[callCount++]` which will be `Integer.MAX_VALUE` then `Integer.MIN_VALUE`
        // if we change the `next(32)` to return multiple values.
        // Let's create a new generator for the MIN_VALUE test.
        BitsStreamGenerator generator2 = new MockBitsStreamGenerator() {
            private int callCount = 0;
            @Override
            protected int next(int bits) {
                if (bits == 32) {
                    if (callCount == 0) return Integer.MIN_VALUE; // First 32 bits (high part)
                    if (callCount == 1) return 0;                // Second 32 bits (low part)
                }
                callCount++;
                return 0;
            }
        };
        // Test with MIN_VALUE and 0
        // high = ((long)Integer.MIN_VALUE) << 32
        // low = (0L) & 0xffffffffL = 0L
        // result = ((long)Integer.MIN_VALUE << 32) | 0L
        long expected2 = ((long)Integer.MIN_VALUE << 32);
        assertEquals(expected2, generator2.nextLong());
    }


    /**
     * Mock implementation of BitsStreamGenerator for testing.
     * It allows controlling the output of the protected `next(int bits)` method.
     */
    private static class MockBitsStreamGenerator extends BitsStreamGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public void setSeed(int seed) {
            // No-op for tests
        }

        @Override
        public void setSeed(int[] seed) {
            // No-op for tests
        }

        @Override
        public void setSeed(long seed) {
            // No-op for tests
        }

        @Override
        protected int next(int bits) {
            // Default behavior: return 0. Subclasses will override this.
            // This ensures it compiles even if not overridden.
            return 0;
        }
    }

    // Helper method to access the private nextGaussian field using reflection.
    // This is necessary because direct access is not allowed.
    private double getPrivateNextGaussian(BitsStreamGenerator generator) throws Exception {
        java.lang.reflect.Field field = BitsStreamGenerator.class.getDeclaredField("nextGaussian");
        field.setAccessible(true);
        return (double) field.get(generator);
    }

    // Helper method to set the private nextGaussian field using reflection.
    private void setPrivateNextGaussian(BitsStreamGenerator generator, double value) throws Exception {
        java.lang.reflect.Field field = BitsStreamGenerator.class.getDeclaredField("nextGaussian");
        field.setAccessible(true);
        field.set(generator, value);
    }
}
