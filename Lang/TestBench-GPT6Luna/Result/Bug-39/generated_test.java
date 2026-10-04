package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class StringUtilsTest {
    @Test
    public void testEmptyAndBlankBoundaries() throws Exception {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertTrue(StringUtils.isBlank(" \t"));
        assertFalse(StringUtils.isBlank("\u00a0"));
    }

    @Test
    public void testTrimVersusStrip() throws Exception {
        assertEquals("x", StringUtils.trim("\u0001x\u0001"));
        assertEquals("\u0001x\u0001", StringUtils.strip("\u0001x\u0001"));
        assertEquals("x", StringUtils.strip("\tx\n"));
    }

    @Test
    public void testStripStartAndEndCustomCharacters() throws Exception {
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xy"));
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xy"));
        assertEquals("", StringUtils.stripStart("xxx", "x"));
        assertEquals("", StringUtils.stripEnd("xxx", "x"));
    }

    @Test
    public void testStripAllNullElements() throws Exception {
        String[] result = StringUtils.stripAll(new String[] {" x ", null, "\ty"});
        assertArrayEquals(new String[] {"x", null, "y"}, result);
    }

    @Test
    public void testAccentRemoval() throws Exception {
        assertNull(StringUtils.stripAccents(null));
        assertEquals("plain", StringUtils.stripAccents("plain"));
    }

    @Test
    public void testEqualityAndCaseInsensitiveEquality() throws Exception {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals("abc", "ABC"));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
        assertFalse(StringUtils.equalsIgnoreCase(null, ""));
    }

    @Test
    public void testIndexAndOrdinalIndexBoundaries() throws Exception {
        assertEquals(0, StringUtils.indexOf("abc", 'a'));
        assertEquals(-1, StringUtils.ordinalIndexOf("abc", "a", 0));
        assertEquals(2, StringUtils.ordinalIndexOf("ababa", "a", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("ababa", "a", 4));
    }

    @Test
    public void testLastIndexAndContains() throws Exception {
        assertEquals(4, StringUtils.lastIndexOf("ababa", 'a'));
        assertTrue(StringUtils.contains("abc", 'b'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.containsIgnoreCase("AbCd", "bc"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "abcd"));
    }

    @Test
    public void testCharacterSearchBoundaries() throws Exception {
        assertEquals(0, StringUtils.indexOfAny("abc", new char[] {'a', 'c'}));
        assertEquals(-1, StringUtils.indexOfAny("abc", new char[0]));
        assertTrue(StringUtils.containsAny("abc", new char[] {'c'}));
        assertFalse(StringUtils.containsAny("abc", new char[0]));
        assertEquals(2, StringUtils.indexOfAnyBut("aab", new char[] {'a'}));
    }

    @Test
    public void testCharacterMembershipBoundaries() throws Exception {
        assertTrue(StringUtils.containsOnly("", new char[0]));
        assertFalse(StringUtils.containsOnly("a", new char[0]));
        assertTrue(StringUtils.containsOnly("abba", new char[] {'a', 'b'}));
        assertFalse(StringUtils.containsNone("abz", new char[] {'z'}));
        assertTrue(StringUtils.containsNone("ab", new char[0]));
    }

    @Test
    public void testLastIndexOfAnyWithEmptySearch() throws Exception {
        assertEquals(4, StringUtils.lastIndexOfAny("ababa", new String[] {"a", "b"}));
        assertEquals(5, StringUtils.lastIndexOfAny("ababa", new String[] {""}));
        assertEquals(-1, StringUtils.lastIndexOfAny("ababa", new String[] {null}));
    }

    @Test
    public void testSubstringStartAtAndBeyondLength() throws Exception {
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("c", StringUtils.substring("abc", -1));
        assertEquals("", StringUtils.substring("abc", 3));
        assertEquals("", StringUtils.substring("abc", 4));
    }

    @Test
    public void testLeftRightAndMidLengthEdges() throws Exception {
        assertEquals("", StringUtils.left("abc", 0));
        assertEquals("abc", StringUtils.left("abc", 3));
        assertEquals("ab", StringUtils.right("abc", 2));
        assertEquals("", StringUtils.right("abc", 0));
        assertEquals("ab", StringUtils.mid("abc", -1, 2));
        assertEquals("", StringUtils.mid("abc", 3, 1));
    }

    @Test
    public void testSubstringRelativeToSeparators() throws Exception {
        assertEquals("a", StringUtils.substringBefore("ababa", "b"));
        assertEquals("aba", StringUtils.substringAfter("ababa", "b"));
        assertEquals("aba", StringUtils.substringBeforeLast("ababa", "b"));
        assertEquals("a", StringUtils.substringAfterLast("ababa", "b"));
        assertEquals("", StringUtils.substringBefore("abc", ""));
    }

    @Test
    public void testSubstringBetweenTags() throws Exception {
        assertEquals("abc", StringUtils.substringBetween("yabcz", "y", "z"));
        assertArrayEquals(new String[] {"a", "b"}, StringUtils.substringsBetween("[a][b]", "[", "]"));
        assertNull(StringUtils.substringBetween("abc", "[", "]"));
    }

    @Test
    public void testSplitAdjacentAndWholeSeparators() throws Exception {
        assertArrayEquals(new String[] {"a::b"}, StringUtils.split("a::b"));
        assertArrayEquals(new String[] {"a", "", "b"},
                StringUtils.splitPreserveAllTokens("a::b", ':'));
        assertArrayEquals(new String[] {"a", "b"}, StringUtils.splitByWholeSeparator("a--b", "--"));
        assertArrayEquals(new String[] {"a", "", "b"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("a----b", "--"));
    }

    @Test
    public void testSplitByCharacterTypeAndCamelCase() throws Exception {
        assertArrayEquals(new String[] {"foo", "B", "ar"}, StringUtils.splitByCharacterType("fooBar"));
        assertArrayEquals(new String[] {"foo", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("fooBar"));
        assertArrayEquals(new String[] {"ASF", "Rules"},
                StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    @Test
    public void testJoinNullElements() throws Exception {
        assertEquals("ab", StringUtils.join(new Object[] {"a", null, "b"}));
        assertEquals("", StringUtils.join(new Object[0]));
    }

    @Test
    public void testDeleteWhitespaceAndRemovalCaseBehavior() throws Exception {
        assertEquals("abc", StringUtils.deleteWhitespace(" a\tb c "));
        assertEquals("domain", StringUtils.removeStart("www.domain", "www."));
        assertEquals("domain", StringUtils.removeStartIgnoreCase("WWW.domain", "www."));
        assertEquals("name.TXT", StringUtils.removeEnd("name.TXT", ".txt"));
        assertEquals("qd", StringUtils.remove("queued", "ue"));
    }

    @Test
    public void testReplaceOnceAndAll() throws Exception {
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
        assertEquals("aba", StringUtils.replace("aba", "a", "z", 0));
    }

    @Test
    public void testReplaceEachNonRepeatingAndRepeating() throws Exception {
        assertEquals("dcte", StringUtils.replaceEach("abcde",
                new String[] {"ab", "d"}, new String[] {"d", "t"}));
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde",
                new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test
    public void testReplaceCharactersAndOverlayEdges() throws Exception {
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
        assertEquals("zzcdef", StringUtils.overlay("abcdef", "zz", -1, 2));
        assertEquals("abcdefzz", StringUtils.overlay("abcdef", "zz", 8, 10));
    }

    @Test
    public void testChompChopAndRepeat() throws Exception {
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("abab", StringUtils.repeat("ab", 2));
        assertEquals("", StringUtils.repeat("a", 0));
    }

    @Test
    public void testPaddingLengthEdges() throws Exception {
        assertEquals("bat", StringUtils.rightPad("bat", 3));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
        assertEquals("bat", StringUtils.rightPad("bat", 2));
        assertEquals("   ", StringUtils.rightPad("", 3));
    }

    @Test
    public void testCaseAndCharacterPredicates() throws Exception {
        assertEquals("ABC", StringUtils.upperCase("abc", Locale.ENGLISH));
        assertEquals("abc", StringUtils.lowerCase("ABC", Locale.ENGLISH));
        assertEquals("Cat", StringUtils.capitalize("cat"));
        assertEquals("cAT", StringUtils.uncapitalize("CAT"));
        assertEquals("tHE", StringUtils.swapCase("The"));
        assertTrue(StringUtils.isAlpha("é"));
        assertFalse(StringUtils.isNumeric("12.3"));
        assertTrue(StringUtils.isAsciiPrintable("~"));
        assertFalse(StringUtils.isAsciiPrintable("\u007f"));
    }

    @Test
    public void testDefaultsReverseAndAbbreviationEdges() throws Exception {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("fallback", StringUtils.defaultIfEmpty("", "fallback"));
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
        assertEquals("a...", StringUtils.abbreviate("abcdef", 4));
        try {
            StringUtils.abbreviate("abcdef", 3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testDifferenceCommonPrefixAndDistance() throws Exception {
        assertEquals("xyz", StringUtils.difference("abc", "abxyz"));
        assertEquals(2, StringUtils.indexOfDifference("abc", "abxyz"));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[] {"abc", "abxyz"}));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(3, StringUtils.getLevenshteinDistance("", "abc"));
    }

    @Test
    public void testStartsAndEndsWithCaseRules() throws Exception {
        assertTrue(StringUtils.startsWith("abcdef", "abc"));
        assertFalse(StringUtils.startsWith("abcdef", "ABC"));
        assertTrue(StringUtils.startsWithIgnoreCase("abcdef", "ABC"));
        assertTrue(StringUtils.endsWith("abcdef", "def"));
        assertFalse(StringUtils.endsWith("abcdef", "DEF"));
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "DEF"));
        assertTrue(StringUtils.startsWithAny("abc", new String[] {null, "ab"}));
    }

    @Test
    public void testIsNotEmptyNullEmptyAndNonempty() throws Exception {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
    }

    @Test
    public void testIsNotBlankWhitespaceAndText() throws Exception {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(" \t"));
        assertTrue(StringUtils.isNotBlank(" x "));
    }

    @Test
    public void testTrimToNullBlankAndText() throws Exception {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(" \t"));
        assertEquals("x", StringUtils.trimToNull(" \tx "));
    }

    @Test
    public void testTrimToEmptyNullAndWhitespace() throws Exception {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty("  \t"));
        assertEquals("x", StringUtils.trimToEmpty(" x "));
    }

    @Test
    public void testStripToNullNullWhitespaceAndText() throws Exception {
        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull(" \t"));
        assertEquals("a b", StringUtils.stripToNull(" \ta b\n"));
    }

    @Test
    public void testStripToEmptyNullAndWhitespace() throws Exception {
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty(" \t"));
        assertEquals("a b", StringUtils.stripToEmpty(" \ta b\n"));
    }

    @Test
    public void testRemoveEndIgnoreCaseSuffixCases() throws Exception {
        assertEquals("name", StringUtils.removeEndIgnoreCase("name.TXT", ".txt"));
        assertEquals("name.txt", StringUtils.removeEndIgnoreCase("name.txt", ".pdf"));
        assertEquals("", StringUtils.removeEndIgnoreCase("x", "X"));
        assertEquals("x", StringUtils.removeEndIgnoreCase("x", ""));
    }
}
