package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class RandomStringUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testRandom_zeroLength() throws Exception {
        assertEquals("", RandomStringUtils.random(0));
    }

    @Test
    public void testRandom_negativeLength() throws Exception {
        try {
            RandomStringUtils.random(-1);
            fail("Expected IllegalArgumentException for negative length.");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testRandom_defaultChars_length1() throws Exception {
        String s = RandomStringUtils.random(1);
        assertEquals(1, s.length());
    }

    @Test
    public void testRandom_defaultChars_length10() throws Exception {
        String s = RandomStringUtils.random(10);
        assertEquals(10, s.length());
    }

    @Test
    public void testRandomAscii_zeroLength() throws Exception {
        assertEquals("", RandomStringUtils.randomAscii(0));
    }

    @Test
    public void testRandomAscii_negativeLength() throws Exception {
        try {
            RandomStringUtils.randomAscii(-1);
            fail("Expected IllegalArgumentException for negative length.");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testRandomAscii_length10() throws Exception {
        String s = RandomStringUtils.randomAscii(10);
        assertEquals(10, s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            assertTrue("Character out of ASCII range: " + (int) c, c >= 32 && c <= 126);
        }
    }

    @Test
    public void testRandomAlphabetic_zeroLength() throws Exception {
        assertEquals("", RandomStringUtils.randomAlphabetic(0));
    }

    @Test
    public void testRandomAlphabetic_negativeLength() throws Exception {
        try {
            RandomStringUtils.randomAlphabetic(-1);
            fail("Expected IllegalArgumentException for negative length.");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testRandomAlphabetic_length10() throws Exception {
        String s = RandomStringUtils.randomAlphabetic(10);
        assertEquals(10, s.length());
        for (int i = 0; i < s.length(); i++) {
            assertTrue("Character is not a letter: " + s.charAt(i), Character.isLetter(s.charAt(i)));
        }
    }

    @Test
    public void testRandomAlphanumeric_zeroLength() throws Exception {
        assertEquals("", RandomStringUtils.randomAlphanumeric(0));
    }

    @Test
    public void testRandomAlphanumeric_negativeLength() throws Exception {
        try {
            RandomStringUtils.randomAlphanumeric(-1);
            fail("Expected IllegalArgumentException for negative length.");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testRandomAlphanumeric_length10() throws Exception {
        String s = RandomStringUtils.randomAlphanumeric(10);
        assertEquals(10, s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            assertTrue("Character is not a letter or digit: " + c, Character.isLetterOrDigit(c));
        }
    }

    @Test
    public void testRandomNumeric_zeroLength() throws Exception {
        assertEquals("", RandomStringUtils.randomNumeric(0));
    }

    @Test
    public void testRandomNumeric_negativeLength() throws Exception {
        try {
            RandomStringUtils.randomNumeric(-1);
            fail("Expected IllegalArgumentException for negative length.");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testRandomNumeric_length10() throws Exception {
        String s = RandomStringUtils.randomNumeric(10);
        assertEquals(10, s.length());
        for (int i = 0; i < s.length(); i++) {
            assertTrue("Character is not a digit: " + s.charAt(i), Character.isDigit(s.charAt(i)));
        }
    }
    
    @Test
    public void testRandom_specificRange_lettersOnly_length10() throws Exception {
        String s = RandomStringUtils.random(10, 97, 123, true, false); // a-z
        assertEquals(10, s.length());
        for (char c : s.toCharArray()) {
            assertTrue("Character not in range 'a'-'z': " + c, c >= 'a' && c <= 'z');
        }
    }

    @Test
    public void testRandom_specificRange_numbersOnly_length10() throws Exception {
        String s = RandomStringUtils.random(10, 48, 58, false, true); // 0-9
        assertEquals(10, s.length());
        for (char c : s.toCharArray()) {
            assertTrue("Character not in range '0'-'9': " + c, c >= '0' && c <= '9');
        }
    }

    @Test
    public void testRandom_specificRange_lettersAndNumbers_length10() throws Exception {
        String s = RandomStringUtils.random(10, 48, 123, true, true); // 0-9, A-Z, a-z
        assertEquals(10, s.length());
        for (char c : s.toCharArray()) {
            assertTrue("Character not alphanumeric: " + c, Character.isLetterOrDigit(c));
        }
    }
    
    @Test
    public void testRandom_specificRange_noLettersOrNumbers_length10() throws Exception {
        // This range includes printable ASCII characters excluding letters and digits
        String s = RandomStringUtils.random(10, 33, 48, false, false); // !"#$%&'()*+,-./
        assertEquals(10, s.length());
        for (char c : s.toCharArray()) {
            assertTrue("Character unexpectedly a letter or digit: " + c, !Character.isLetterOrDigit(c));
        }
    }

    @Test
    public void testRandom_customChars_length10() throws Exception {
        String s = RandomStringUtils.random(10, new char[]{'a', 'b', 'c'});
        assertEquals(10, s.length());
        for (char c : s.toCharArray()) {
            assertTrue("Character not in custom set: " + c, c == 'a' || c == 'b' || c == 'c');
        }
    }
    
    @Test
    public void testRandom_customCharsString_length10() throws Exception {
        String s = RandomStringUtils.random(10, "xyz");
        assertEquals(10, s.length());
        for (char c : s.toCharArray()) {
            assertTrue("Character not in custom set: " + c, c == 'x' || c == 'y' || c == 'z');
        }
    }

    @Test
    public void testRandom_customCharsString_nullString() throws Exception {
        String s = RandomStringUtils.random(10, (String) null);
        assertEquals(10, s.length());
    }

    @Test
    public void testRandom_customCharsArray_nullArray() throws Exception {
        String s = RandomStringUtils.random(10, (char[]) null);
        assertEquals(10, s.length());
    }

    @Test
    public void testRandom_emptyCharsArray() throws Exception {
        try {
            RandomStringUtils.random(10, new char[0]);
            fail("Expected IllegalArgumentException for empty char array.");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }
    
    @Test
    public void testRandom_emptyCharsString() throws Exception {
        try {
            RandomStringUtils.random(10, "");
            fail("Expected IllegalArgumentException for empty char string.");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testRandom_SurrogateRanges_HighSurrogateLowSurrogate() throws Exception {
        // Test a case that might involve surrogate pairs.
        // This is more of a smoke test to ensure it doesn't crash.
        // The exact characters are hard to predict due to randomness.
        // If the underlying random generator picks a high surrogate, it should be followed by a low surrogate.
        // If it picks a low surrogate, it should be preceded by a high surrogate.
        // We check for length and that the result is a String.
        String s = RandomStringUtils.random(20, 0, 65536, false, false); // full unicode range
        assertEquals(20, s.length());
        // Check that no private high surrogates are directly inserted.
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            assertFalse("Private high surrogate found: " + (int)c, c >= 56192 && c <= 56319);
        }
    }
}
