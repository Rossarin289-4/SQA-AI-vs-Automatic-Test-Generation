package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testWrapNullInput() {
        assertNull(WordUtils.wrap(null, 5));
    }

    @Test
    public void testWrapEmptyInput() {
        assertEquals("", WordUtils.wrap("", 5));
    }

    @Test
    public void testWrapShortString() {
        assertEquals("abc", WordUtils.wrap("abc", 5));
    }

    @Test
    public void testWrapExactLength() {
        assertEquals("abc", WordUtils.wrap("abc", 3));
    }

    @Test
    public void testWrapWithSpace() {
        assertEquals("abc def", WordUtils.wrap("abc def", 7));
    }

    @Test
    public void testWrapWithSpaceAndBreak() {
        assertEquals("abc\ndef", WordUtils.wrap("abc def", 5));
    }

    @Test
    public void testWrapWithLongWordNoBreak() {
        assertEquals("abcdef", WordUtils.wrap("abcdef", 3, null, false));
    }

    @Test
    public void testWrapWithLongWordAndBreak() {
        assertEquals("abc\ndef", WordUtils.wrap("abcdef", 3, null, true));
    }

    @Test
    public void testWrapWithMultipleSpaces() {
        assertEquals("abc def ghi", WordUtils.wrap("abc  def   ghi", 10));
    }

    @Test
    public void testWrapWithLeadingSpace() {
        assertEquals("abc def", WordUtils.wrap(" abc def", 5));
    }

    @Test
    public void testWrapWithTrailingSpace() {
        assertEquals("abc def ", WordUtils.wrap("abc def ", 5));
    }

    @Test
    public void testWrapWithNewLineString() {
        assertEquals("abc<br>def", WordUtils.wrap("abc def", 5, "<br>", false));
    }

    @Test
    public void testWrapWithNewLineStringAndLongWord() {
        assertEquals("abc<br>def", WordUtils.wrap("abcdef", 3, "<br>", true));
    }

    @Test
    public void testWrapZeroLength() {
        assertEquals("abc", WordUtils.wrap("abc", 0));
    }

    @Test
    public void testWrapNegativeLength() {
        assertEquals("abc", WordUtils.wrap("abc", -5));
    }

    @Test
    public void testCapitalizeNull() {
        assertNull(WordUtils.capitalize(null));
    }

    @Test
    public void testCapitalizeEmpty() {
        assertEquals("", WordUtils.capitalize(""));
    }

    @Test
    public void testCapitalizeSimple() {
        assertEquals("I Am Fine", WordUtils.capitalize("i am fine"));
    }

    @Test
    public void testCapitalizeWithDelimiters() {
        assertEquals("I aM.Fine", WordUtils.capitalize("i aM.fine", new char[]{'.'}));
    }

    @Test
    public void testCapitalizeFullyNull() {
        assertNull(WordUtils.capitalizeFully(null));
    }

    @Test
    public void testCapitalizeFullyEmpty() {
        assertEquals("", WordUtils.capitalizeFully(""));
    }

    @Test
    public void testCapitalizeFullySimple() {
        assertEquals("I Am Fine", WordUtils.capitalizeFully("i am FINE"));
    }

    @Test
    public void testCapitalizeFullyWithDelimiters() {
        assertEquals("I am.Fine", WordUtils.capitalizeFully("i aM.fine", new char[]{'.'}));
    }

    @Test
    public void testUncapitalizeNull() {
        assertNull(WordUtils.uncapitalize(null));
    }

    @Test
    public void testUncapitalizeEmpty() {
        assertEquals("", WordUtils.uncapitalize(""));
    }

    @Test
    public void testUncapitalizeSimple() {
        assertEquals("i am fINE", WordUtils.uncapitalize("I Am FINE"));
    }

    @Test
    public void testUncapitalizeWithDelimiters() {
        assertEquals("i AM.fINE", WordUtils.uncapitalize("I AM.FINE", new char[]{'.'}));
    }

    @Test
    public void testSwapCaseNull() {
        assertNull(WordUtils.swapCase(null));
    }

    @Test
    public void testSwapCaseEmpty() {
        assertEquals("", WordUtils.swapCase(""));
    }

    @Test
    public void testSwapCaseSimple() {
        assertEquals("tHE dOG HAS A bone", WordUtils.swapCase("The dog has a BONE"));
    }

    @Test
    public void testSwapCaseMixed() {
        assertEquals("tHe dOg HaS a BoNe", WordUtils.swapCase("ThE dOg hAS A bONE"));
    }

    @Test
    public void testInitialsNull() {
        assertNull(WordUtils.initials(null));
    }

    @Test
    public void testInitialsEmpty() {
        assertEquals("", WordUtils.initials(""));
    }

    @Test
    public void testInitialsSimple() {
        assertEquals("BJL", WordUtils.initials("Ben John Lee"));
    }

    @Test
    public void testInitialsWithPunctuation() {
        assertEquals("BJ", WordUtils.initials("Ben J.Lee"));
    }

    @Test
    public void testInitialsWithDelimiters() {
        assertEquals("BJL", WordUtils.initials("Ben J.Lee", new char[]{' ', '.'}));
    }

    @Test
    public void testInitialsEmptyDelimiters() {
        assertEquals("", WordUtils.initials("abc", new char[]{}));
    }

    @Test
    public void testAbbreviateNull() {
        assertNull(WordUtils.abbreviate(null, 0, 10, "..."));
    }

    @Test
    public void testAbbreviateEmpty() {
        assertEquals("", WordUtils.abbreviate("", 0, 10, "..."));
    }

    @Test
    public void testAbbreviateNoAbbreviationNeeded() {
        assertEquals("abcdef", WordUtils.abbreviate("abcdef", 0, 10, "..."));
    }

    @Test
    public void testAbbreviateWithSpaceWithinLowerLimit() {
        assertEquals("abc...", WordUtils.abbreviate("abc def", 5, 10, "..."));
    }

    @Test
    public void testAbbreviateWithSpaceOutsideLowerLimitButWithinUpper() {
        assertEquals("abc def...", WordUtils.abbreviate("abc def ghi", 5, 10, "..."));
    }

    @Test
    public void testAbbreviateWithSpaceOutsideUpperLimit() {
        assertEquals("abcdef...", WordUtils.abbreviate("abcdef ghij", 0, 6, "..."));
    }

    @Test
    public void testAbbreviateWithLongWordNoSpace() {
        assertEquals("abcdef...", WordUtils.abbreviate("abcdefghijkl", 0, 6, "..."));
    }

    @Test
    public void testAbbreviateWithUpperLimitLowerThanLower() {
        assertEquals("abc...", WordUtils.abbreviate("abc def", 5, 3, "..."));
    }

    @Test
    public void testAbbreviateWithAppendNull() {
        assertEquals("abc", WordUtils.abbreviate("abc def", 5, 10, null));
    }

    @Test
    public void testAbbreviateWithAppendEmpty() {
        assertEquals("abc", WordUtils.abbreviate("abc def", 5, 10, ""));
    }

    @Test
    public void testAbbreviateAtExactLowerLimitWithSpace() {
        assertEquals("abc def", WordUtils.abbreviate("abc def ghi", 7, 10, "..."));
    }

    @Test
    public void testAbbreviateAtExactUpperLimit() {
        assertEquals("abcdef", WordUtils.abbreviate("abcdefghijkl", 0, 6, "..."));
    }

    @Test
    public void testAbbreviateWithLowerLimitEqualToLength() {
        assertEquals("abcdef", WordUtils.abbreviate("abcdef", 6, 10, "..."));
    }
}
