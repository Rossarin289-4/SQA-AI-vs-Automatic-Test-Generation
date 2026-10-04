package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class StringUtilsTest {
    @Test
    public void testStripAccents() throws Exception {
        assertEquals("eclair", StringUtils.stripAccents("\u00e9clair"));
    }

    @Test
    public void testContainsIgnoreCase() throws Exception {
        assertTrue(StringUtils.containsIgnoreCase("AbCd", "BC"));
        assertFalse(StringUtils.containsIgnoreCase("AbCd", "bd"));
    }

    @Test
    public void testContainsWhitespace() throws Exception {
        assertTrue(StringUtils.containsWhitespace("ab cd"));
        assertFalse(StringUtils.containsWhitespace(""));
    }

    @Test
    public void testIndexOfAnyAndContainsAny() throws Exception {
        assertEquals(1, StringUtils.indexOfAny("zab", 'a', 'b'));
        assertTrue(StringUtils.containsAny("zab", 'b'));
        assertFalse(StringUtils.containsAny("zab", 'x'));
    }

    @Test
    public void testIndexOfAnyButAndContainsOnly() throws Exception {
        assertEquals(-1, StringUtils.indexOfAnyBut("abba", 'a', 'b'));
        assertTrue(StringUtils.containsOnly("abba", 'a', 'b'));
        assertFalse(StringUtils.containsOnly("abx", 'a', 'b'));
    }

    @Test
    public void testContainsNone() throws Exception {
        assertTrue(StringUtils.containsNone("ab", 'x', 'y'));
        assertFalse(StringUtils.containsNone("abx", 'x', 'y'));
    }

    @Test
    public void testLastIndexOfAny() throws Exception {
        assertEquals(4, StringUtils.lastIndexOfAny("ababa", "a", "b"));
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", "x", null));
    }

    @Test
    public void testSubstringIndexBoundaries() throws Exception {
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("", StringUtils.substring("abc", 3));
        assertEquals("bc", StringUtils.substring("abc", -2));
        assertEquals("", StringUtils.substring("abc", 4));
    }

    @Test
    public void testLeftRightAndMidBoundaries() throws Exception {
        assertEquals("", StringUtils.left("abc", 0));
        assertEquals("abc", StringUtils.left("abc", 3));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("", StringUtils.right("abc", 0));
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
        assertEquals("", StringUtils.mid("abc", 3, 1));
    }

    @Test
    public void testSubstringBeforeAndAfter() throws Exception {
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        assertEquals("abc", StringUtils.substringBefore("abc", "x"));
        assertEquals("", StringUtils.substringAfter("abc", "x"));
    }

    @Test
    public void testSubstringBeforeLastAndAfterLast() throws Exception {
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("abc", StringUtils.substringBeforeLast("abc", ""));
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
    }

    @Test
    public void testSubstringBetween() throws Exception {
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertEquals(null, StringUtils.substringBetween("abc", "[", "]"));
        assertArrayEquals(new String[] {"a", "b"},
                StringUtils.substringsBetween("[a][b]", "[", "]"));
    }

    @Test
    public void testSplitVariants() throws Exception {
        assertArrayEquals(new String[] {"a", "b", "c"}, StringUtils.split("a..b.c", '.'));
        assertArrayEquals(new String[] {"a", "", "b"}, StringUtils.splitPreserveAllTokens("a..b", '.'));
        assertArrayEquals(new String[] {"a", "b"}, StringUtils.splitByWholeSeparator("a--b", "--"));
        assertArrayEquals(new String[] {"a", "", "b"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("a----b", "--"));
    }

    @Test
    public void testSplitByCharacterType() throws Exception {
        assertArrayEquals(new String[] {"foo", "B", "ar"}, StringUtils.splitByCharacterType("fooBar"));
        assertArrayEquals(new String[] {"foo", "Bar"},
                StringUtils.splitByCharacterTypeCamelCase("fooBar"));
    }

    @Test
    public void testJoin() throws Exception {
        assertEquals("ab", StringUtils.join(new Object[] {"a", null, "b"}));
        assertEquals("a--b", StringUtils.join(new Object[] {"a", "b"}, "--"));
    }

    @Test
    public void testDeleteWhitespace() throws Exception {
        assertEquals("abc", StringUtils.deleteWhitespace(" a\tb c "));
        assertEquals("", StringUtils.deleteWhitespace(""));
    }

    @Test
    public void testRemoveStartEnd() throws Exception {
        assertEquals("domain", StringUtils.removeStart("www.domain", "www."));
        assertEquals("domain", StringUtils.removeStartIgnoreCase("WWW.domain", "www."));
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"));
    }

    @Test
    public void testRemoveAndReplace() throws Exception {
        assertEquals("qd", StringUtils.remove("queued", "ue"));
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
        assertEquals("zbzz", StringUtils.replace("abaa", "a", "z"));
        assertEquals("wcte", StringUtils.replaceEach("abcde",
                new String[] {"ab", "d"}, new String[] {"w", "t"}));
    }

    @Test
    public void testReplaceEachRepeatedly() throws Exception {
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde",
                new String[] {"ab", "d"}, new String[] {"d", "t"}));
        try {
            StringUtils.replaceEachRepeatedly("abcde",
                    new String[] {"ab", "d"}, new String[] {"d", "ab"});
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testReplaceChars() throws Exception {
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
    }

    @Test
    public void testOverlayBoundaries() throws Exception {
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
        assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4));
        assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 8, 10));
    }

    @Test
    public void testOrdinalSearchEdges() throws Exception {
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        assertEquals(5, StringUtils.ordinalIndexOf("aabaabaa", "b", 2));
        assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", 0));
        assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1));
    }

    @Test
    public void testIgnoreCaseSearches() throws Exception {
        assertEquals(1, StringUtils.indexOfIgnoreCase("aBcD", "BC"));
        assertEquals(3, StringUtils.lastIndexOfIgnoreCase("aBcD", "d"));
        assertTrue(StringUtils.startsWithIgnoreCase("ABC", "a"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABC", "c"));
    }

    @Test
    public void testCommonPrefixAndDifference() throws Exception {
        assertEquals("ab", StringUtils.getCommonPrefix("abc", "abx"));
        assertEquals(2, StringUtils.indexOfDifference("abc", "abx"));
        assertEquals("xyz", StringUtils.difference("abc", "abxyz"));
    }

    @Test
    public void testLevenshteinThresholdBoundary() throws Exception {
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog", 1));
        assertEquals(-1, StringUtils.getLevenshteinDistance("frog", "fog", 0));
        assertEquals(3, StringUtils.getLevenshteinDistance("", "abc", 3));
    }

    @Test
    public void testAbbreviateWidthBoundary() throws Exception {
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        try {
            StringUtils.abbreviate("abcdefg", 3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testEmptyAndNotEmptyBoundaries() throws Exception {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
    }

    @Test
    public void testBlankAndNotBlankWhitespaceEdges() throws Exception {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" \t"));
        assertFalse(StringUtils.isBlank(" a"));
        assertFalse(StringUtils.isNotBlank(" \t"));
        assertTrue(StringUtils.isNotBlank("a"));
    }

    @Test
    public void testTrimVariants() throws Exception {
        assertEquals("a", StringUtils.trim(" \ta\r "));
        assertNull(StringUtils.trim(null));
        assertNull(StringUtils.trimToNull(" \t "));
        assertEquals("a", StringUtils.trimToNull(" a "));
        assertEquals("", StringUtils.trimToEmpty(null));
    }

    @Test
    public void testStripVariantsWhitespaceAndCustomChars() throws Exception {
        assertEquals("a b", StringUtils.strip(" \ta b \n"));
        assertNull(StringUtils.stripToNull(" \t "));
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("abc", StringUtils.stripStart("xyabc", "xy"));
        assertEquals("abc", StringUtils.stripEnd("abcxy", "xy"));
    }

    @Test
    public void testStripAllEntries() throws Exception {
        assertArrayEquals(new String[] {"a", null, "b"},
                StringUtils.stripAll(new String[] {" a ", null, "\tb\t"}));
        assertNull(StringUtils.stripAll((String[]) null));
    }

    @Test
    public void testCharSequenceEquality() throws Exception {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, ""));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testIgnoreCaseEqualityNullAndCase() throws Exception {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
        assertFalse(StringUtils.equalsIgnoreCase(null, "a"));
        assertTrue(StringUtils.equalsIgnoreCase("aBc", "AbC"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", "ab"));
    }

    @Test
    public void testIndexOfCharacterEdges() throws Exception {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
        assertEquals(-1, StringUtils.indexOf("", 'a'));
        assertEquals(0, StringUtils.indexOf("aba", 'a'));
        assertEquals(2, StringUtils.indexOf("aba", 'a', 1));
        assertEquals(-1, StringUtils.indexOf("aba", 'a', 3));
    }

    @Test
    public void testLastIndexOfCharacterEdges() throws Exception {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
        assertEquals(2, StringUtils.lastIndexOf("aba", 'a'));
        assertEquals(0, StringUtils.lastIndexOf("aba", 'a', 0));
        assertEquals(-1, StringUtils.lastIndexOf("aba", 'a', -1));
    }

    @Test
    public void testContainsCharacterEdges() throws Exception {
        assertFalse(StringUtils.contains(null, 'a'));
        assertFalse(StringUtils.contains("", 'a'));
        assertTrue(StringUtils.contains("a", 'a'));
        assertFalse(StringUtils.contains("a", 'b'));
    }
}
