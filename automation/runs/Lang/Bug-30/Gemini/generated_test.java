package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsIndexOfAnySupplementaryTest {

    @Test
    public void testIndexOfAny_SupplementaryCharactersBasic() {
        // Unicode supplementary character: 𠮷 (U+20BB7), represented as surrogate pair \uD842\uDFB7
        String supplementaryStr = "\uD842\uDFB7";
        char[] searchChars = new char[] { '\uD842', '\uDFB7' };
        
        int result = StringUtils.indexOfAny(supplementaryStr, searchChars);
        // The fixed version correctly processes surrogate pairs / code points,
        // whereas the buggy version handles them incorrectly or returns unexpected indices.
        assertEquals(0, result);
    }

    @Test
    public void testIndexOfAny_SupplementaryCharactersMixed() {
        // String containing BMP character followed by a supplementary character
        String text = "a\uD842\uDFB7b";
        char[] searchChars = new char[] { '\uD842', '\uDFB7' };
        
        int result = StringUtils.indexOfAny(text, searchChars);
        assertEquals(1, result);
    }

    @Test
    public void testIndexOfAny_StringSearchSupplementary() {
        String text = "hello\uD842\uDFB7world";
        String searchString = "\uD842\uDFB7";
        
        int result = StringUtils.indexOfAny(text, searchString);
        assertEquals(5, result);
    }
}
