package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordUtilsLang419Test {

    @Test
    public void testLowerGreaterThanLengthWithNoUpperLimit() {
        String result = WordUtils.abbreviate("abcde", 10, -1, "...");

        assertEquals("abcde", result);
    }

    @Test
    public void testLowerGreaterThanLengthAndUpperGreaterThanLength() {
        String result = WordUtils.abbreviate("hello", 12, 20, "...");

        assertEquals("hello", result);
    }

    @Test
    public void testLowerGreaterThanLengthAndUpperBelowLower() {
        String result = WordUtils.abbreviate("hello", 10, 2, "...");

        assertEquals("hello", result);
    }

    @Test
    public void testLowerEqualToStringLength() {
        String result = WordUtils.abbreviate("hello", 5, -1, "...");

        assertEquals("hello", result);
    }

    @Test
    public void testNormalAbbreviationStillWorks() {
        String result = WordUtils.abbreviate(
                "alpha beta gamma", 6, 12, "...");

        assertEquals("alpha...", result);
    }
}
