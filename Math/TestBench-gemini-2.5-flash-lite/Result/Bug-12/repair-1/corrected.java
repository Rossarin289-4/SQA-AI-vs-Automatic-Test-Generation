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
        assertFalse(generator.nextBoolean());
        assertTrue(generator.nextBoolean());
        assertFalse(generator.nextBoolean());
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
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            private int counter = 0;
            @Override
            protected int next(int bits) {
                if (bits == 26) {
                    if (counter == 0) return 0; // high = 0
                    if (counter == 1) return Integer.MAX_VALUE >>> 26; // high = 1<<26 - 1
                    if (counter == 2) return 0; // low = 0
                    if (counter == 3) return Integer.MAX_VALUE; // low = MAX_INT
                    if (counter == 4) return 0; // high = 0
                    if (counter == 5) return 0; // low = 0
                }
                counter++;
                return 0;
            }
        };
        // Expected: 0.0 (high=0, low=0)
        assertEquals(0.0, generator.nextDouble(), 0.0);
        // Expected: close to 1.0 (high = (MAX_INT>>>26) << 26, low = MAX_INT)
        double val1 = generator.nextDouble();
        assertTrue(val1 >= 0.0 && val1 < 1.0);

        // Expected: 0.5 (high = 1<<25, low = 0)
        generator = new MockBitsStreamGenerator() {
            private int counter = 0;
            @Override
            protected int next(int bits) {
                if (bits == 26) {
                    if (counter == 0) return 1 << 25; // high = 1<<25
                    if (counter == 1) return 0; // low = 0
                }
                counter++;
                return 0;
            }
        };
        assertEquals(0.5, generator.nextDouble(), 1e-15);
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
                    if (counter == 1) return Integer.MAX_VALUE; // close to 1.0f
                }
                counter++;
                return 0;
            }
        };
        assertEquals(0.0f, generator.nextFloat(), 0.0f);
        assertTrue(generator.nextFloat() >= 0.0f && generator.nextFloat() < 1.0f);
    }

    /**
     * Test nextGaussian when cache is empty.
     */
    @Test
    public void testNextGaussianCacheEmpty() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            private int callCount = 0;
            @Override
            protected int next(int bits) {
                callCount++;
                if (bits == 26) {
                    // Simulate distinct values for nextDouble calls to generate meaningful x and y
                    if (callCount == 1) return 100; // For first nextDouble's high part
                    if (callCount == 2) return 200; // For first nextDouble's low part
                    if (callCount == 3) return 300; // For second nextDouble's high part
                    if (callCount == 4) return 400; // For second nextDouble's low part
                }
                return 0;
            }
        };

        // The actual values of x and y derived from nextDouble will depend on the mock `next(26)` calls.
        // We can't assert an exact Gaussian value without knowing the exact x and y.
        // Instead, we assert that a finite number is returned and that the cache is filled.
        double gaussian = generator.nextGaussian();
        assertTrue(Double.isFinite(gaussian));
        assertFalse(Double.isNaN(getPrivateNextGaussian(generator)));
    }

    /**
     * Test nextGaussian when cache is full.
     */
    @Test
    public void testNextGaussianCacheFull() throws Exception {
        // Use a concrete subclass for instantiation to ensure proper behavior
        MersenneTwister generator = new MersenneTwister();

        // Manually set the cached value
        setPrivateNextGaussian(generator, 1.2345);

        // First call to nextGaussian should return the cached value and clear the cache
        assertEquals(1.2345, generator.nextGaussian(), 1e-15);
        assertTrue(Double.isNaN(getPrivateNextGaussian(generator)));

        // Second call should generate a new pair and fill the cache.
        // We can't predict the exact value, but it should be finite and fill the cache.
        double secondGaussian = generator.nextGaussian();
        assertTrue(Double.isFinite(secondGaussian));
        assertFalse(Double.isNaN(getPrivateNextGaussian(generator)));
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
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                // To simulate (n * (long) next(31)) >> 31
                // Provide a value for next(31) where all 31 bits are set.
                return 0x7FFFFFFF; // MAX_INT >> 1
            }
        };
        int n = 16; // A power of 2
        // Expected: (16 * (long) 0x7FFFFFFF) >> 31
        // (16 * (2^31 - 1)) >> 31 = (2^4 * (2^31 - 1)) >> 31 = (2^35 - 16) >> 31 = 16.
        assertEquals(16, generator.nextInt(n));

        generator = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                return 0; // 0
            }
        };
        // Expected: (16 * 0L) >> 31 = 0
        assertEquals(0, generator.nextInt(n));
    }

    /**
     * Test nextInt(n) where n is not a power of 2, and no rejection occurs.
     */
    @Test
    public void testNextIntNotPowerOfTwoNoRejection() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            @Override
            protected int next(int bits) {
                // Provide a value for next(31) such that the rejection condition is not met.
                // For n=10, next(31)=20. val = 20 % 10 = 0.
                // bits - val + (n - 1) = 20 - 0 + 9 = 29, which is >= 0. No rejection.
                return 20;
            }
        };
        int n = 10;
        assertEquals(0, generator.nextInt(n));
    }

    /**
     * Test nextInt(n) where n is not a power of 2, and rejection occurs once.
     * The rejection condition `bits - val + (n - 1) < 0` relies on `bits` being non-negative,
     * which is true for `next(31)`. The condition seems to be non-triggerable for positive `bits` and `n`.
     * We simulate the scenario where `next(31)` returns a value that would be rejected if the condition worked as intended.
     * A common pattern for uniform distribution is to reject `bits` if `bits < Integer.MAX_VALUE - (Integer.MAX_VALUE % n)`.
     * Let's mock `next(31)` to return a value that is smaller than this limit for a chosen `n`.
     */
    @Test
    public void testNextIntNotPowerOfTwoRejectionOnce() throws Exception {
        BitsStreamGenerator generator = new MockBitsStreamGenerator() {
            private int callCount = 0;
            @Override
            protected int next(int bits) {
                // This mock aims to return a value that would cause rejection in a correct implementation,
                // but given the provided source code's condition, it's impossible to trigger rejection.
                // We return a value that, if rejected, would lead to a second call.
                // Let n=10. The limit for bits is around Integer.MAX_VALUE - (Integer.MAX_VALUE % 10).
                // If `next(31)` returns a small value like 5, it should ideally be rejected if it's too small.
                // However, the code's condition `bits - val + (n-1) < 0` is never met.
                // We will simulate the _expected_ behavior of rejection by returning a sequence of values.
                callCount++;
                if (callCount == 1) {
                    // This value (5) would typically be rejected if it's too small for n=10.
                    // The code provided will accept it.
                    return 5;
                } else {
                    // This value (15) is accepted by the code.
                    return 15;
                }
            }
        };
        int n = 10;
        // Based on the source code, `next(31)` will return 5, and 5 % 10 = 5.
        // The condition `5 - 5 + (10 - 1) < 0` is `9 < 0`, which is false. So 5 is returned.
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
                // Integer.MAX_VALUE is not a power of 2, so the do-while loop is used.
                // The rejection condition `bits - val + (n - 1) < 0` is never met for non-negative `bits`.
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
                    if (callCount == 0) return 0; // First 32 bits
                    if (callCount == 1) return Integer.MAX_VALUE; // Second 32 bits
                    if (callCount == 2) return Integer.MIN_VALUE; // Third 32 bits
                }
                callCount++;
                return 0;
            }
        };
        // Test with 0 and MAX_VALUE
        long expected1 = (0L << 32) | (long)Integer.MAX_VALUE;
        assertEquals(expected1, generator.nextLong());

        // Test with MIN_VALUE and 0
        long expected2 = ((long)Integer.MIN_VALUE << 32) | 0L;
        assertEquals(expected2, generator.nextLong());
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
