package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordUtilsTest {
    @Test
    public void testWrapNullAndEmpty() throws Exception {
        assertEquals(null, WordUtils.wrap(null, 3));
        assertEquals("", WordUtils.wrap("", 3));
    }

    @Test
    public void testWrapBelowMinimumLength() throws Exception {
        assertEquals("ab", WordUtils.wrap("ab", 0));
    }

    @Test
    public void testWrapAtExactLength() throws Exception {
        assertEquals("one", WordUtils.wrap("one", 3));
    }

    @Test
    public void testWrapAtLastAvailableSpace() throws Exception {
        assertEquals("ab\ncd", WordUtils.wrap("ab cd", 3));
    }

    @Test
    public void testWrapPreservesLongWordByDefault() throws Exception {
        assertEquals("abcdef", WordUtils.wrap("abcdef", 3));
    }

    @Test
    public void testWrapStripsLeadingSpaceWhenContinuing() throws Exception {
        assertEquals("ab\n cd", WordUtils.wrap("ab  cd", 3));
    }

    @Test
    public void testCapitalizeWhitespaceSeparatedWords() throws Exception {
        assertEquals("I Am FINE", WordUtils.capitalize("i am FINE"));
    }

    @Test
    public void testCapitalizeNullAndEmpty() throws Exception {
        assertEquals(null, WordUtils.capitalize(null));
        assertEquals("", WordUtils.capitalize(""));
    }

    @Test
    public void testCapitalizeFullyLowercasesRemainder() throws Exception {
        assertEquals("I Am Fine", WordUtils.capitalizeFully("i aM FINE"));
    }

    @Test
    public void testCapitalizeFullyNullAndEmpty() throws Exception {
        assertEquals(null, WordUtils.capitalizeFully(null));
        assertEquals("", WordUtils.capitalizeFully(""));
    }

    @Test
    public void testUncapitalizeWhitespaceSeparatedWords() throws Exception {
        assertEquals("i am fINE", WordUtils.uncapitalize("I Am FINE"));
    }

    @Test
    public void testUncapitalizeNullAndEmpty() throws Exception {
        assertEquals(null, WordUtils.uncapitalize(null));
        assertEquals("", WordUtils.uncapitalize(""));
    }

    @Test
    public void testSwapCaseByWordPosition() throws Exception {
        assertEquals("tHE DOG HAS A bone", WordUtils.swapCase("The dog has a BONE"));
    }

    @Test
    public void testSwapCaseNullAndEmpty() throws Exception {
        assertEquals(null, WordUtils.swapCase(null));
        assertEquals("", WordUtils.swapCase(""));
    }

    @Test
    public void testInitialsFromWhitespaceSeparatedWords() throws Exception {
        assertEquals("BJL", WordUtils.initials("Ben John Lee"));
    }

    @Test
    public void testInitialsNullAndEmpty() throws Exception {
        assertEquals(null, WordUtils.initials(null));
        assertEquals("", WordUtils.initials(""));
    }

    @Test
    public void testAbbreviateNullAndEmpty() throws Exception {
        assertEquals(null, WordUtils.abbreviate(null, 2, 4, "..."));
        assertEquals("", WordUtils.abbreviate("", 2, 4, "..."));
    }

    @Test
    public void testAbbreviateAtLowerLimitSpace() throws Exception {
        assertEquals("one...", WordUtils.abbreviate("one two", 3, 6, "..."));
    }

    @Test
    public void testAbbreviateSpaceAfterUpperLimit() throws Exception {
        assertEquals("on...", WordUtils.abbreviate("one two", 2, 2, "..."));
    }

    @Test
    public void testAbbreviateNoSpaceAndNoTruncation() throws Exception {
        assertEquals("abc", WordUtils.abbreviate("abc", 2, -1, "..."));
    }

    @Test
    public void testAbbreviateNoSpaceAndUpperLimitTruncates() throws Exception {
        assertEquals("ab...", WordUtils.abbreviate("abc", 1, 2, "..."));
    }
}
