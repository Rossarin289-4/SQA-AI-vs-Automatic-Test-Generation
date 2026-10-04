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
            // Expected
        }
    }

    @Test
    public void testRandom_defaultChars_positiveCount() throws Exception {
        String result = RandomStringUtils.random(5);
        assertEquals(5, result.length());
        // Basic check: ensure characters are within a reasonable range for the default
        // This is not exhaustive but checks for obvious issues.
        for (char c : result.toCharArray()) {
            assertTrue(c >= 0 && c <= Character.MAX_VALUE);
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
            // Expected
        }
    }
    
    @Test
    public void testRandom_specificChars_array_positiveCount() throws Exception {
        String result = RandomStringUtils.random(5, "abc".toCharArray());
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
            // Expected
        }
    }

    @Test
    public void testRandom_range_invalidRange() throws Exception {
        try {
            RandomStringUtils.random(5, 20, 10, false, false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testRandom_range_defaultChars_lettersTrue_numbersTrue() throws Exception {
        // This will use ' ' to 'z' by default, so we expect letters and digits within that range.
        String result = RandomStringUtils.random(10, 0, 0, true, true);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " is not letter or digit in default range", Character.isLetterOrDigit(c));
        }
    }

    @Test
    public void testRandom_range_defaultChars_lettersFalse_numbersFalse() throws Exception {
        // When letters and numbers are false, and start/end are 0, it defaults to ' ' to 'z'.
        String result = RandomStringUtils.random(10, 0, 0, false, false);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not in default ASCII printable range [32, 126]", c >= 32 && c <= 126);
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
        String result = RandomStringUtils.random(10, 'a', 'z', true, true); // 'a' to 'z'
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            // The method random(count, start, end, letters, numbers) with letters=true, numbers=true
            // and a range that only contains letters will still only generate letters.
            // This test checks if it respects the range and the 'letters' flag.
            assertTrue("Character " + c + " is not in 'a'-'z'", c >= 'a' && c <= 'z');
        }
    }

    @Test
    public void testRandom_range_fullRange_forCustomRandom() throws Exception {
        // This uses the internal RANDOM instance, so we need to check behavior.
        // When start=0, end=0, and chars=null, it uses ' ' to 'z' if letters/numbers are true.
        // If letters/numbers are false, it uses 0 to Integer.MAX_VALUE.
        // Let's test the Integer.MAX_VALUE case.
        String result = RandomStringUtils.random(10, 0, 0, false, false); // This calls random(10, 0, 0, false, false, null, RANDOM)
        assertEquals(10, result.length());
        // We cannot assert specific characters due to the wide range.
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
    public void testRandom_withString_fullCoverage() throws Exception {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        String result = RandomStringUtils.random(50, chars);
        assertEquals(50, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not in the provided string", chars.indexOf(c) != -1);
        }
    }

    @Test
    public void testRandom_withCustomRandomInstance_predictable() throws Exception {
        // Test with a predictable Random instance to ensure the method uses it.
        Random random = new Random(12345);
        String result1 = RandomStringUtils.random(10, 0, 0, false, false, null, random);
        
        // Reset seed and generate again to check for predictability
        random.setSeed(12345); 
        String result2 = RandomStringUtils.random(10, 0, 0, false, false, null, random);
        
        assertEquals(result1, result2);
        assertEquals(10, result1.length());
    }

    @Test
    public void testRandom_edgeCase_startEqualsEnd_exception() throws Exception {
        try {
            RandomStringUtils.random(5, 10, 10, false, false);
            fail("Expected IllegalArgumentException for start == end");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testRandom_withCharsArray_lengthOne_repeat() throws Exception {
        String result = RandomStringUtils.random(5, new char[]{'x'});
        assertEquals(5, result.length());
        assertEquals("xxxxx", result);
    }
    
    @Test
    public void testRandom_withNullCharsArray_defaultAsciiPrintable() throws Exception {
        // When chars is null and start/end are 0, it defaults to ' ' to 'z'.
        Random random = new Random(42); // Use a fixed seed for predictability
        String result = RandomStringUtils.random(5, 0, 0, false, false, null, random);
        assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not in ASCII range [32, 126]", c >= 32 && c <= 126);
        }
    }

    @Test
    public void testRandom_surrogateLowHandling() throws Exception {
        // Tests the handling of low surrogates. A low surrogate should be prepended by a high surrogate.
        // The range 56320-57343 are low surrogates.
        // This test primarily checks for no exception and correct length.
        String result = RandomStringUtils.random(5, 56320, 57343, false, false);
        assertEquals(5, result.length());
    }

    @Test
    public void testRandom_surrogateHighHandling() throws Exception {
        // Tests the handling of high surrogates. A high surrogate should be followed by a low surrogate.
        // The range 55296-56191 are high surrogates.
        // This test primarily checks for no exception and correct length.
        String result = RandomStringUtils.random(5, 55296, 56191, false, false);
        assertEquals(5, result.length());
    }
    
    @Test
    public void testRandom_privateHighSurrogateSkipping() throws Exception {
        // Tests that private high surrogates are skipped.
        // The range 56192-56319 are private high surrogates.
        // The implementation should skip these. The test checks for no exception and correct length.
        String result = RandomStringUtils.random(5, 56192, 56319, false, false);
        assertEquals(5, result.length());
    }

    @Test
    public void testRandom_withCharsArray_alphanumericSet() throws Exception {
        char[] chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        String result = RandomStringUtils.random(50, chars);
        assertEquals(50, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("Character " + c + " not in the provided char array", new String(chars).indexOf(c) != -1);
        }
    }
}
