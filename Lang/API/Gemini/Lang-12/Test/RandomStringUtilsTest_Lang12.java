package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomStringUtilsTest_Lang12 {

    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithEmptyCharArray() {
        // Passing an empty character array should throw IllegalArgumentException
        RandomStringUtils.random(5, new char[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomWithEmptyStringAsChars() {
        // Passing an empty string should throw IllegalArgumentException
        RandomStringUtils.random(5, "");
    }

    @Test
    public void testRandomWithCustomCharsAndZeroBounds() {
        // When chars are provided and start=0, end=0, the fixed version sets end = chars.length
        char[] customChars = new char[]{'x', 'y', 'z'};
        String result = RandomStringUtils.random(10, 0, 0, false, false, customChars);
        assertNotNull(result);
        assertEquals(10, result.length());
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            assertTrue(c == 'x' || c == 'y' || c == 'z');
        }
    }
}
