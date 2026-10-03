package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Independent test suite for Lang-45 defect in WordUtils.abbreviate.
 */
public class WordUtilsAbbreviateTest {

    @Test
    public void testAbbreviateLowerGreaterThanLengthWithNoUpperLimit() {
        // String length is 4 ("Test"). lower = 10 exceeds length.
        // Fixed version adjusts lower to string length and returns the full string safely.
        String input = "Test";
        String result = WordUtils.abbreviate(input, 10, -1, "...");
        assertEquals("Test", result);
    }

    @Test
    public void testAbbreviateLowerGreaterThanLengthWithUpperLimit() {
        // String length is 6 ("Apache"). lower = 15, upper = 20.
        // Fixed version gracefully adjusts lower to 6.
        String input = "Apache";
        String result = WordUtils.abbreviate(input, 15, 20, "[etc]");
        assertEquals("Apache", result);
    }

    @Test
    public void testAbbreviateLowerEqualsLengthPlusOne() {
        // String length is 5 ("Hello"). lower = 6.
        String input = "Hello";
        String result = WordUtils.abbreviate(input, 6, 10, "...");
        assertEquals("Hello", result);
    }

    @Test
    public void testAbbreviateExtremelyLargeLowerLimit() {
        // String length is 3 ("Run"). lower = Integer.MAX_VALUE / 2 or similar large value.
        String input = "Run";
        String result = WordUtils.abbreviate(input, 1000, 2000, "!");
        assertEquals("Run", result);
    }
}
