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
        assertFalse(StringUtils.isBlank("\u00a0"));
    }

    @Test
    public void testNotEmptyAndNotBlank() throws Exception {
        assertFalse(StringUtils.isNotEmpty(null));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertFalse(StringUtils.isNotBlank(" \t"));
        assertTrue(StringUtils.isNotBlank(" x "));
    }

    @Test
    public void testTrimmingAndNullDefaults() throws Exception {
        assertNull(StringUtils.trim(null));
        assertEquals("x", StringUtils.trim("\u0001x\u001f"));
        assertNull(StringUtils.trimToNull(" \t"));
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("x", StringUtils.trimToEmpty(" x "));
    }

    @Test
    public void testWhitespaceAndCharacterStripping() throws Exception {
        assertEquals("a b", StringUtils.strip("\ta b\n"));
        assertEquals("  ab", StringUtils.stripEnd("  abxy", "xy"));
        assertEquals("ab  ", StringUtils.stripStart("xyab  ", "xy"));
        assertEquals("abc", StringUtils.strip("xyabczy", "xyz"));
    }

    @Test
    public void testStripAllArrayEntries() throws Exception {
        assertArrayEquals(new String[] {"a", null, ""}, StringUtils.stripAll(new String[] {" a ", null, "  "}));
    }

    @Test
    public void testAccentStripping() throws Exception {
        assertNull(StringUtils.stripAccents(null));
    }

    @Test
    public void testEqualityNullAndCaseBehavior() throws Exception {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals("a", "A"));
        assertTrue(StringUtils.equalsIgnoreCase("Ab", "aB"));
        assertFalse(StringUtils.equalsIgnoreCase(null, ""));
    }

    @Test
    public void testIndexSearchOrdinalsAndBoundaries() throws Exception {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(3, StringUtils.ordinalIndexOf("ababa", "ba", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("ababa", "ba", 3));
        assertEquals(5, StringUtils.indexOfIgnoreCase("aAbBaA", "A", 3));
    }

    @Test
    public void testLastIndexSearchAndEmptyOrdinal() throws Exception {
        assertEquals(3, StringUtils.lastIndexOf("ababa", 'b'));
        assertEquals(3, StringUtils.lastOrdinalIndexOf("ababa", "ba", 1));
        assertEquals(5, StringUtils.lastOrdinalIndexOf("ababa", "", 1));
        assertEquals(-1, StringUtils.lastOrdinalIndexOf("ababa", "a", 0));
    }

    @Test
    public void testContainsAndAnyCharacterSearch() throws Exception {
        assertTrue(StringUtils.contains("abc", 'b'));
        assertFalse(StringUtils.containsIgnoreCase("abc", "Z"));
        assertEquals(0, StringUtils.indexOfAny("abca", new char[] {'c', 'a'}));
        assertTrue(StringUtils.containsAny("abca", new char[] {'z', 'c'}));
        assertEquals(2, StringUtils.indexOfAnyBut("aab", new char[] {'a'}));
        assertTrue(StringUtils.containsOnly("aba", new char[] {'a', 'b'}));
        assertFalse(StringUtils.containsNone("aba", new char[] {'b'}));
    }

    @Test
    public void testLastIndexOfAnyChoosesLatestMatch() throws Exception {
        assertEquals(4, StringUtils.lastIndexOfAny("ababa", new String[] {"a", "ba", null}));
    }

    @Test
    public void testSubstringPositionsAtAndBeyondEnds() throws Exception {
        assertEquals("", StringUtils.substring("abc", 3));
        assertEquals("", StringUtils.substring("abc", 4));
        assertEquals("bc", StringUtils.substring("abc", -2));
        assertEquals("a", StringUtils.left("abc", 1));
        assertEquals("", StringUtils.right("abc", 0));
        assertEquals("a", StringUtils.mid("abc", -2, 2));
    }

    @Test
    public void testSubstringSeparatorsAndBetween() throws Exception {
        assertEquals("a", StringUtils.substringBefore("a-b-c", "-"));
        assertEquals("b-c", StringUtils.substringAfter("a-b-c", "-"));
        assertEquals("a-b", StringUtils.substringBeforeLast("a-b-c", "-"));
        assertEquals("c", StringUtils.substringAfterLast("a-b-c", "-"));
        assertEquals("x", StringUtils.substringBetween("[x]", "[", "]"));
        assertArrayEquals(new String[] {"a", "b"}, StringUtils.substringsBetween("[a][b]", "[", "]"));
    }

    @Test
    public void testSplitTokenPreservationAndWholeSeparator() throws Exception {
        assertArrayEquals(new String[] {"a", "b"}, StringUtils.split("a  b"));
        assertArrayEquals(new String[] {"a", "", "b"}, StringUtils.splitPreserveAllTokens("a..b", '.'));
        assertArrayEquals(new String[] {"a", "b"}, StringUtils.splitByWholeSeparator("a--b", "--"));
        assertArrayEquals(new String[] {"a", "", "b"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("a----b", "--"));
    }

    @Test
    public void testCharacterTypeSplitting() throws Exception {
        assertArrayEquals(new String[] {"foo", "B", "ar", "2"}, StringUtils.splitByCharacterType("fooBar2"));
        assertArrayEquals(new String[] {"foo", "Bar", "2"}, StringUtils.splitByCharacterTypeCamelCase("fooBar2"));
    }

    @Test
    public void testJoinNullEntriesAndDeleteWhitespace() throws Exception {
        assertEquals("a--b", StringUtils.join(new Object[] {"a", null, "b"}, '-'));
        assertEquals("abc", StringUtils.deleteWhitespace(" a\tb\nc "));
    }

    @Test
    public void testRemoveStartAndEndCaseOptions() throws Exception {
        assertEquals("main", StringUtils.removeStart("prefixmain", "prefix"));
        assertEquals("main", StringUtils.removeStartIgnoreCase("PREFIXmain", "prefix"));
        assertEquals("file", StringUtils.removeEnd("file.txt", ".txt"));
        assertEquals("file", StringUtils.removeEndIgnoreCase("file.TXT", ".txt"));
        assertEquals("qd", StringUtils.remove("queued", "ue"));
    }

    @Test
    public void testReplaceOnceAndAllOccurrences() throws Exception {
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
        assertEquals("abaa", StringUtils.replace("abaa", "a", "z", 0));
    }

    @Test
    public void testReplaceEachAndRepeatedReplacement() throws Exception {
        assertEquals("dcte", StringUtils.replaceEach("abcde", new String[] {"ab", "d"}, new String[] {"d", "t"}));
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde", new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test
    public void testCharacterReplacementOverlayAndChomp() throws Exception {
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
        assertEquals("abZZef", StringUtils.overlay("abcdef", "ZZ", 2, 4));
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc", StringUtils.chomp("abc"));
    }

    @Test
    public void testRepeatAndPadding() throws Exception {
        assertEquals("ababab", StringUtils.repeat("ab", 3));
        assertEquals("axyxyx", StringUtils.rightPad("a", 6, "xy"));
        assertEquals("xyxya", StringUtils.leftPad("a", 5, "xy"));
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
    }

    @Test
    public void testCaseConversionAndCharacterPredicates() throws Exception {
        assertEquals("ABC", StringUtils.upperCase("abc", Locale.ENGLISH));
        assertEquals("cAT", StringUtils.swapCase("Cat"));
        assertTrue(StringUtils.isAlpha("abc"));
        assertFalse(StringUtils.isNumeric("12.3"));
        assertTrue(StringUtils.isAsciiPrintable(" ~"));
        assertTrue(StringUtils.isWhitespace("\t "));
    }

    @Test
    public void testDefaultsAndReversing() throws Exception {
        assertEquals("fallback", StringUtils.defaultString(null, "fallback"));
        assertEquals("x", StringUtils.defaultIfEmpty("", "x"));
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    @Test
    public void testAbbreviationBoundariesAndDifference() throws Exception {
        assertEquals("a...", StringUtils.abbreviate("abcdef", 4));
        assertEquals("abcdef", StringUtils.abbreviate("abcdef", 6));
        assertEquals("ab.f", StringUtils.abbreviateMiddle("abcdef", ".", 4));
        assertEquals("xyz", StringUtils.difference("abc", "xyz"));
        assertEquals(2, StringUtils.indexOfDifference("abx", "aby"));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[] {"abc", "abz"}));
    }

    @Test
    public void testLevenshteinDistance() throws Exception {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
    }
}
