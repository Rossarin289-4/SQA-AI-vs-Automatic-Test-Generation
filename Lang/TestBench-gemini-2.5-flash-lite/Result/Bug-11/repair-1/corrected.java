package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class RandomStringUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testRandom_zeroCount() throws Exception {
        assertEquals("", RandomStringUtils.random(0));
    }

    @Test
    public void testRandom_negativeCount() throws Exception {
        try {
            RandomStringUtils.random(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testRandom_defaultChars_positiveCount() throws Exception {
        String result = RandomStringUtils.random(5);
        assertEquals(5, result.length());
    }

    @Test
    public void testRandom_specificChars_zeroCount() throws Exception {
        assertEquals("", RandomStringUtils.random(0, "abc"));
    }

    @Test
    public void testRandom_specificChars_nullString() throws Exception {
        String result = RandomStringUtils.random(5, (String) null);
        assertEquals(5, result.length());
    }
    
    @Test
    public void testRandom_specificChars_emptyString() throws Exception {
        try {
            RandomStringUtils.random(5, "");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testRandom_specificChars_array_null() throws Exception {
        String result = RandomStringUtils.random(5, (char[]) null);
        assertEquals(5, result.length());
    }
    
    @Test
    public void testRandom_specificChars_array_empty() throws Exception {
        try {
            RandomStringUtils.random(5, new char[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
    
    @Test
    public void testRandom_specificChars_array_positiveCount() throws Exception {
        String result = RandomStringUtils.random(5, "abc");
        assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not in 'abc'", "abc".indexOf(c) != -1);
        }
    }

    @Test
    public void testRandom_range_zeroCount() throws Exception {
        assertEquals("", RandomStringUtils.random(0, 10, 20, false, false));
    }
    
    @Test
    public void testRandom_range_negativeCount() throws Exception {
        try {
            RandomStringUtils.random(-1, 10, 20, false, false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testRandom_range_invalidRange() throws Exception {
        try {
            RandomStringUtils.random(5, 20, 10, false, false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testRandom_range_defaultChars_lettersTrue_numbersTrue() throws Exception {
        String result = RandomStringUtils.random(10, 0, 0, true, true);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " is not letter or digit", Character.isLetterOrDigit(c));
        }
    }

    @Test
    public void testRandom_range_defaultChars_lettersFalse_numbersFalse() throws Exception {
        String result = RandomStringUtils.random(10, 0, 0, false, false);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " is not in default ASCII printable range", c >= 32 && c <= 126);
        }
    }
    
    @Test
    public void testRandom_range_specificRange_lettersTrue_numbersFalse() throws Exception {
        String result = RandomStringUtils.random(10, 'a', 'z', true, false);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " is not in 'a'-'z'", c >= 'a' && c <= 'z');
        }
    }
    
    @Test
    public void testRandom_range_specificRange_lettersFalse_numbersTrue() throws Exception {
        String result = RandomStringUtils.random(10, '0', '9', false, true);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " is not in '0'-'9'", c >= '0' && c <= '9');
        }
    }

    @Test
    public void testRandom_range_specificRange_lettersTrue_numbersTrue() throws Exception {
        String result = RandomStringUtils.random(10, 'a', 'z', true, true);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " is not in 'a'-'z' or '0'-'9'", (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
        }
    }

    @Test
    public void testRandom_range_specificRange_allChars_lettersTrue_numbersFalse() throws Exception {
        String result = RandomStringUtils.random(10, 'a', 'z' + 1, true, false); // includes 'z'
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " is not in 'a'-'z'", c >= 'a' && c <= 'z');
        }
    }

    @Test
    public void testRandom_range_specificRange_allChars_lettersFalse_numbersTrue() throws Exception {
        String result = RandomStringUtils.random(10, '0', '9' + 1, false, true); // includes '9'
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " is not in '0'-'9'", c >= '0' && c <= '9');
        }
    }
    
    @Test
    public void testRandom_range_surrogateLow() throws Exception {
        // Test that a low surrogate is handled by prepending a high surrogate
        // The method does not guarantee a specific low surrogate, but it should not crash
        // and the resulting string should have the correct length.
        // This test mainly checks for exceptions.
        String result = RandomStringUtils.random(5, 56320, 57343, false, false); // Range of low surrogates
        assertEquals(5, result.length());
    }

    @Test
    public void testRandom_range_surrogateHigh() throws Exception {
        // Test that a high surrogate is handled by appending a low surrogate
        // The method does not guarantee a specific high surrogate, but it should not crash
        // and the resulting string should have the correct length.
        // This test mainly checks for exceptions.
        String result = RandomStringUtils.random(5, 55296, 56191, false, false); // Range of high surrogates
        assertEquals(5, result.length());
    }

    @Test
    public void testRandom_range_privateHighSurrogate() throws Exception {
        // Test that private high surrogates are skipped.
        // This means the resulting string might be shorter than requested if many are generated.
        // However, the implementation adds 'count++' if it encounters one, meaning it will try again.
        // So, it should still result in the correct length. The test checks for no exception.
        String result = RandomStringUtils.random(5, 56192, 56319, false, false); // Range of private high surrogates
        assertEquals(5, result.length());
    }

    @Test
    public void testRandom_range_fullRange() throws Exception {
        // Test with the widest possible range for characters.
        // This tests the 'end = Integer.MAX_VALUE' case when letters and numbers are false.
        // This might generate characters outside the typical printable ASCII range.
        String result = RandomStringUtils.random(10, 0, 0, false, false); // Default to ' ' to 'z' if not specified
        assertEquals(10, result.length());
    }
    
    @Test
    public void testRandomAscii_zeroCount() throws Exception {
        assertEquals("", RandomStringUtils.randomAscii(0));
    }

    @Test
    public void testRandomAscii_positiveCount() throws Exception {
        String result = RandomStringUtils.randomAscii(10);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not in ASCII range [32, 126]", c >= 32 && c <= 126);
        }
    }

    @Test
    public void testRandomAlphabetic_zeroCount() throws Exception {
        assertEquals("", RandomStringUtils.randomAlphabetic(0));
    }

    @Test
    public void testRandomAlphabetic_positiveCount() throws Exception {
        String result = RandomStringUtils.randomAlphabetic(10);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not alphabetic", Character.isLetter(c));
        }
    }

    @Test
    public void testRandomAlphanumeric_zeroCount() throws Exception {
        assertEquals("", RandomStringUtils.randomAlphanumeric(0));
    }

    @Test
    public void testRandomAlphanumeric_positiveCount() throws Exception {
        String result = RandomStringUtils.randomAlphanumeric(10);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not alphanumeric", Character.isLetterOrDigit(c));
        }
    }

    @Test
    public void testRandomNumeric_zeroCount() throws Exception {
        assertEquals("", RandomStringUtils.randomNumeric(0));
    }

    @Test
    public void testRandomNumeric_positiveCount() throws Exception {
        String result = RandomStringUtils.randomNumeric(10);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not numeric", Character.isDigit(c));
        }
    }

    @Test
    public void testRandom_withCharsArray_fullCoverage() throws Exception {
        char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        String result = RandomStringUtils.random(50, chars);
        assertEquals(50, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not in the provided char array", new String(chars).indexOf(c) != -1);
        }
    }
    
    @Test
    public void testRandom_withString_fullCoverage() throws Exception {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        String result = RandomStringUtils.random(50, chars);
        assertEquals(50, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not in the provided string", chars.indexOf(c) != -1);
        }
    }

    @Test
    public void testRandom_withCustomRandomInstance() throws Exception {
        // Test with a predictable Random instance to ensure the method uses it.
        // The method signature is random(int count, int start, int end, boolean letters, boolean numbers, char[] chars, Random random)
        // To use this, we need to provide start, end, letters, numbers, and chars.
        // Let's use a simple case: count=10, start=0, end=0, letters=false, numbers=false, chars=null
        Random random = new Random(12345);
        String result1 = RandomStringUtils.random(10, 0, 0, false, false, null, random);
        random.setSeed(12345); // Reset seed for reproducibility
        String result2 = RandomStringUtils.random(10, 0, 0, false, false, null, random);
        assertEquals(result1, result2);
        assertEquals(10, result1.length());
    }

    @Test
    public void testRandom_edgeCase_startEqualsEnd() throws Exception {
        try {
            RandomStringUtils.random(5, 10, 10, false, false);
            fail("Expected IllegalArgumentException for start == end");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testRandom_withCharsArray_lengthOne() throws Exception {
        String result = RandomStringUtils.random(5, new char[]{'x'});
        assertEquals(5, result.length());
        assertEquals("xxxxx", result);
    }
    
    @Test
    public void testRandom_withNullCharsArray_defaultRange() throws Exception {
        // This should default to ASCII printable characters
        // The method is random(int count, int start, int end, boolean letters, boolean numbers, char[] chars, Random random)
        // Use RANDOM from the class itself, which is available as static.
        String result = RandomStringUtils.random(5, 0, 0, false, false, null, RandomStringUtils.RANDOM);
        assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not in ASCII range [32, 127]", c >= 32 && c < 127);
        }
    }

    @Test
    public void testRandom_withNullCharsArray_maxIntRange() throws Exception {
        // This should default to the full Integer.MAX_VALUE range
        // Use a fixed seed for predictability
        Random random = new Random(42);
        String result = RandomStringUtils.random(5, 0, 0, false, false, null, random);
        assertEquals(5, result.length());
        // We can't assert specific characters due to the large range, but we can assert length and no exceptions.
    }
}
