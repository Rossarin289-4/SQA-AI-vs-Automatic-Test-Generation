package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.text.WordUtils;

public class StringUtilsTest {
    @Test
    public void testEmptyAndBlankBoundaries() throws Exception {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertTrue(StringUtils.isBlank(" \t"));
        assertFalse(StringUtils.isBlank("\u00a0"));
        assertFalse(StringUtils.isNotBlank(" "));
        assertTrue(StringUtils.isNotEmpty(" "));
    }

    @Test
    public void testTrimAndStripWhitespaceDistinction() throws Exception {
        assertEquals("x", StringUtils.trim(" \tx\t "));
        assertEquals("\u00a0x\u00a0", StringUtils.trim("\u00a0x\u00a0"));
        assertEquals("x", StringUtils.strip("\tx\t"));
        assertEquals("\u00a0x\u00a0", StringUtils.strip("\u00a0x\u00a0"));
    }

    @Test
    public void testTrimDefaults() throws Exception {
        assertNull(StringUtils.trim(null));
        assertNull(StringUtils.trimToNull(" \t"));
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("x", StringUtils.trimToNull(" x "));
    }

    @Test
    public void testStripDefaultsAndExplicitCharacters() throws Exception {
        assertNull(StringUtils.stripToNull(" \t"));
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xyz"));
        assertEquals("abc", StringUtils.strip("xyabczy", "xyz"));
    }

    @Test
    public void testStripAllArrayEntries() throws Exception {
        assertArrayEquals(new String[] {"a", null, "b"},
                StringUtils.stripAll(new String[] {" a ", null, "\tb "}));
    }

    @Test
    public void testStripAccents() throws Exception {
        assertNull(StringUtils.stripAccents(null));
    }

    @Test
    public void testEqualityAndCaseSensitivity() throws Exception {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals("a", "A"));
        assertTrue(StringUtils.equalsIgnoreCase("Lang", "lANG"));
        assertFalse(StringUtils.equalsIgnoreCase(null, ""));
    }

    @Test
    public void testIndexSearchBoundaries() throws Exception {
        assertEquals(-1, StringUtils.indexOf(null, 'x'));
        assertEquals(0, StringUtils.indexOf("aba", 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(0, StringUtils.ordinalIndexOf("ababa", "ab", 1));
        assertEquals(2, StringUtils.ordinalIndexOf("ababa", "ab", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("ababa", "ab", 0));
    }

    @Test
    public void testIgnoreCaseSearch() throws Exception {
        assertEquals(1, StringUtils.indexOfIgnoreCase("aBaB", "B"));
        assertEquals(-1, StringUtils.indexOfIgnoreCase("abc", "abcd"));
        assertEquals(3, StringUtils.lastIndexOfIgnoreCase("aBaB", "b"));
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("abc", "a", -1));
    }

    @Test
    public void testContainsAndAnyCharacterSearch() throws Exception {
        assertTrue(StringUtils.contains("abc", 'b'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.containsIgnoreCase("aBc", "BC"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "abcd"));
        assertEquals(1, StringUtils.indexOfAny("abc", new char[] {'x', 'b'}));
        assertTrue(StringUtils.containsAny("abc", new char[] {'x', 'c'}));
    }

    @Test
    public void testAnyButOnlyAndNone() throws Exception {
        assertEquals(2, StringUtils.indexOfAnyBut("aab", new char[] {'a'}));
        assertEquals(-1, StringUtils.indexOfAnyBut("aaa", new char[] {'a'}));
        assertTrue(StringUtils.containsOnly("aba", new char[] {'a', 'b'}));
        assertFalse(StringUtils.containsOnly("abc", new char[] {'a', 'b'}));
        assertTrue(StringUtils.containsNone("abc", new char[] {'x'}));
        assertFalse(StringUtils.containsNone("abc", new char[] {'b'}));
    }

    @Test
    public void testLastIndexOfAnyChoosesLatestMatch() throws Exception {
        assertEquals(3, StringUtils.lastIndexOfAny("ababa", new String[] {"ab", "ba"}));
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", new String[] {null, "z"}));
        assertEquals(3, StringUtils.lastIndexOfAny("abc", new String[] {""}));
    }

    @Test
    public void testSubstringAndLeftRightMidEdges() throws Exception {
        assertEquals("abc", StringUtils.substring("abc", -4));
        assertEquals("", StringUtils.substring("abc", 3));
        assertEquals("b", StringUtils.substring("abc", -2, -1));
        assertEquals("", StringUtils.substring("abc", 2, 2));
        assertEquals("", StringUtils.left("abc", 0));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("ab", StringUtils.mid("abc", -1, 2));
        assertEquals("", StringUtils.mid("abc", 4, 2));
    }

    @Test
    public void testSeparatorSubstrings() throws Exception {
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringBefore("abc", ""));
        assertEquals("abc", StringUtils.substringAfter("abc", ""));
    }

    @Test
    public void testDelimitedExtractionBoundaries() throws Exception {
        assertEquals("value", StringUtils.substringBetween("[value]", "[", "]"));
        assertNull(StringUtils.substringBetween("[value", "[", "]"));
        assertArrayEquals(new String[] {"a", "b"},
                StringUtils.substringsBetween("[a][b]", "[", "]"));
        assertNull(StringUtils.substringsBetween("[a", "[", "]"));
    }

    @Test
    public void testSplittingTokenPolicies() throws Exception {
        assertArrayEquals(new String[] {"a", "b"}, StringUtils.split("a  b"));
        assertArrayEquals(new String[] {"a", "", "b"},
                StringUtils.splitPreserveAllTokens("a  b"));
        assertArrayEquals(new String[] {"a", "b"},
                StringUtils.splitByWholeSeparator("a--b", "--"));
        assertArrayEquals(new String[] {"a", "", "b"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("a----b", "--"));
        assertArrayEquals(new String[] {"ab", ":", "cd"},
                StringUtils.splitByCharacterType("ab:cd"));
        assertArrayEquals(new String[] {"foo", "Bar"},
                StringUtils.splitByCharacterTypeCamelCase("fooBar"));
    }

    @Test
    public void testJoinAndWhitespaceDeletion() throws Exception {
        assertEquals("a,,b", StringUtils.join(new Object[] {"a", null, "b"}, ','));
        assertEquals("ab", StringUtils.join(new Object[] {"a", "b"}));
        assertEquals("abc", StringUtils.deleteWhitespace(" a\tb c "));
        assertNull(StringUtils.deleteWhitespace(null));
    }

    @Test
    public void testRemoveStartAndEndVariants() throws Exception {
        assertEquals("domain", StringUtils.removeStart("www.domain", "www."));
        assertEquals("domain", StringUtils.removeStartIgnoreCase("WWW.domain", "www."));
        assertEquals("www", StringUtils.removeEnd("www.com", ".com"));
        assertEquals("www", StringUtils.removeEndIgnoreCase("www.COM", ".com"));
        assertEquals("qd", StringUtils.remove("queued", "ue"));
    }

    @Test
    public void testReplaceModes() throws Exception {
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
        assertEquals("wcte", StringUtils.replaceEach("abcde",
                new String[] {"ab", "d"}, new String[] {"w", "t"}));
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde",
                new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test
    public void testReplaceCharactersAndOverlayEdges() throws Exception {
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
        assertEquals("abZZcd ef", StringUtils.overlay("abcdef", "ZZ", 2, 4));
        assertEquals("ZZcdef", StringUtils.overlay("abcdef", "ZZ", -1, 2));
        assertEquals("abcdefZZ", StringUtils.overlay("abcdef", "ZZ", 8, 10));
    }

    @Test
    public void testChompNewlineAndSeparator() throws Exception {
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc\n", StringUtils.chomp("abc\n\r"));
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
        assertEquals("foo", StringUtils.chomp("foo", ""));
    }

    @Test
    public void testRepeatAndPaddingLimitEdges() throws Exception {
        assertEquals("", StringUtils.repeat("x", 0));
        assertEquals("ababab", StringUtils.repeat("ab", 3));
        assertEquals("x   ", StringUtils.rightPad("x", 4));
        assertEquals("yxyx", StringUtils.leftPad("x", 4, "y"));
        assertEquals("x" + StringUtils.repeat("z", 8192),
                StringUtils.rightPad("x", 8193, 'z'));
    }

    @Test
    public void testCaseConversionsAndCharacterChecks() throws Exception {
        assertEquals("ABC", StringUtils.upperCase("abc", Locale.ENGLISH));
        assertEquals("abc", StringUtils.lowerCase("ABC", Locale.ENGLISH));
        assertEquals("Cat", StringUtils.capitalize("cat"));
        assertEquals("cAT", StringUtils.uncapitalize("CAT"));
        assertEquals("aBC", StringUtils.swapCase("Abc"));
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isAlpha("ab1"));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("12.3"));
        assertTrue(StringUtils.isWhitespace(" \t"));
        assertFalse(StringUtils.isAsciiPrintable("\u007f"));
    }

    @Test
    public void testDefaultsReverseAbbreviationAndDifference() throws Exception {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("fallback", StringUtils.defaultString(null, "fallback"));
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("a...", StringUtils.abbreviate("abcdef", 4));
        assertEquals("ab.f", StringUtils.abbreviateMiddle("abcdef", ".", 4));
        assertEquals("xyz", StringUtils.difference("abc", "xyz"));
        assertEquals(2, StringUtils.indexOfDifference("ab", "abcd"));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[] {"abcd", "abef"}));
    }

    @Test
    public void testLevenshteinDistanceBranches() throws Exception {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(3, StringUtils.getLevenshteinDistance("", "abc"));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
    }
}
