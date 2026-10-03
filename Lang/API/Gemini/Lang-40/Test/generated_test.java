package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Locale;

/**
 * Independent test suite for Lang-40 focusing on locale-independent 
 * behavior in StringUtils.containsIgnoreCase.
 */
public class StringUtilsContainsIgnoreCaseTest {

    @Test
    public void testContainsIgnoreCase_TurkishI_Invariant() {
        // Save original locale
        Locale origLocale = Locale.getDefault();
        try {
            // Force Turkish locale where 'I' and 'i' have special casing rules
            Locale.setDefault(new Locale("tr", "TR"));
            
            // "İ" (capital dotted i) and "i" (lowercase dotted i)
            // In Turkish locale, toLowerCase() / toUpperCase() behave specially.
            String str = "StRiNg";
            String searchStr = "string";
            
            boolean result = StringUtils.containsIgnoreCase(str, searchStr);
            assertTrue("Should contain ignore case even in Turkish locale", result);

            // Test specific Turkish dotted/dotless i scenario
            assertTrue(StringUtils.containsIgnoreCase("İ", "i"));
            assertTrue(StringUtils.containsIgnoreCase("i", "İ"));
            
        } finally {
            Locale.setDefault(origLocale);
        }
    }

    @Test
    public void testContainsIgnoreCase_BasicMixedCase() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("a", null));
        assertFalse(StringUtils.containsIgnoreCase("", "a"));
        assertTrue(StringUtils.containsIgnoreCase("a", ""));
        
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
        assertTrue(StringUtils.containsIgnoreCase("aBc", "BC"));
        assertTrue(StringUtils.containsIgnoreCase("12345", "234"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "d"));
    }

    @Test
    public void testContainsIgnoreCase_AccentedCharacters() {
        // Test with characters that might be affected by default locale casing rules
        String source = "CafÉ";
        String target = "café";
        assertTrue(StringUtils.containsIgnoreCase(source, target));
    }

    @Test
    public void testContainsIgnoreCase_EmptyAndWhitespace() {
        assertTrue(StringUtils.containsIgnoreCase("   ", " "));
        assertTrue(StringUtils.containsIgnoreCase("abc", ""));
        assertFalse(StringUtils.containsIgnoreCase("", "a"));
    }
}
