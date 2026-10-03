package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsContainsAnySupplementaryTest {

    @Test
    public void testContainsAnySupplementaryCharacterString() {
        // Grinning Face Emoji: U+1F600, represented by surrogate pair \uD83D\uDE00
        String supplementaryStr = "\uD83D\uDE00";
        String target = "Hello " + supplementaryStr + " World";
        
        boolean result = StringUtils.containsAny(target, supplementaryStr);
        assertTrue("Should detect supplementary character in String search", result);
    }

    @Test
    public void testContainsAnySupplementaryCharacterCharArray() {
        // Grinning Face Emoji surrogate pair: \uD83D\uDE00
        String target = "Test\uD83D\uDE00ing";
        char[] searchChars = new char[] { '\uD83D', '\uDE00' };
        
        boolean result = StringUtils.containsAny(target, searchChars);
        assertTrue("Should detect supplementary character parts or pair via char array", result);
    }

    @Test
    public void testContainsAnyIsolatedSurrogateHandling() {
        // Isolated high surrogate and low surrogate without forming the valid supplementary char
        String target = "ABC\uD83DXYZ";
        String search = "\uDE00"; // isolated low surrogate
        
        boolean result = StringUtils.containsAny(target, search);
        assertFalse("Should not match unpaired isolated surrogate halves incorrectly", result);
    }

    @Test
    public void testContainsAnyMultipleSupplementaryCharacters() {
        // Multiple emoji / supplementary characters: \uD83D\uDE00 and \uD83D\uDE01
        String target = "A\uD83D\uDE00B\uD83D\uDE01C";
        String search = "Z\uD83D\uDE01W";
        
        boolean result = StringUtils.containsAny(target, search);
        assertTrue("Should correctly match one of multiple supplementary characters", result);
    }
}
