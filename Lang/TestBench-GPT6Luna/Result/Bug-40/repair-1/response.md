```java
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class StringUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testWhitespaceSplittingAndPreservation() throws Exception {
        assertArrayEquals(new String[] {"a", "b"},
                StringUtils.split(" a  b "));
        assertArrayEquals(new String[] {"", "a", "", "b", ""},
                StringUtils.splitPreserveAllTokens(" a  b "));
    }

    @Test
    public void testWholeSeparatorSplitting() throws Exception {
        assertArrayEquals(new String[] {"a", "b", "c"},
                StringUtils.splitByWholeSeparator("a--b----c", "--"));
        assertArrayEquals(new String[] {"a", "", "b", "", "c"},
                StringUtils.splitByWholeSeparatorPreserveAllTokens("a--b----c", "--"));
    }

    @Test
    public void testCharacterTypeSplitting() throws Exception {
        assertArrayEquals(new String[] {"foo", "B", "ar", "200"},
                StringUtils.splitByCharacterType("fooBar200"));
        assertArrayEquals(new String[] {"foo", "Bar", "200"},
                StringUtils.splitByCharacterTypeCamelCase("fooBar200"));
    }

    @Test
    public void testStringJoin() throws Exception {
        assertEquals("a,,b", StringUtils.join(new Object[] {"a", null, "b"}));
    }

    @Test
    public void testWhitespaceDeletion() throws Exception {
        assertEquals("abc", StringUtils.deleteWhitespace(" a\tb\nc "));
    }

    @Test
    public void testRemoveStartVariants() throws Exception {
        assertEquals("abc", StringUtils.removeStart("abcabc", "abc"));
        assertEquals("abc", StringUtils.removeStartIgnoreCase("ABCabc", "abc"));
    }

    @Test
    public void testRemoveEndVariants() throws Exception {
        assertEquals("abc", StringUtils.removeEnd("abcxyz", "xyz"));
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abcXYZ", "xyz"));
    }

    @Test
    public void testRemoveAllOccurrences() throws Exception {
        assertEquals("qd", StringUtils.remove("queued", "ue"));
    }

    @Test
    public void testReplaceOnce() throws Exception {
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
    }

    @Test
    public void testReplaceAll() throws Exception {
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
    }

    @Test
    public void testReplaceEachDoesNotRepeat() throws Exception {
        assertEquals("dcte", StringUtils.replaceEach(
                "abcde", new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test
    public void testReplaceEachRepeatedly() throws Exception {
        assertEquals("tcte", StringUtils.replaceEachRepeatedly(
                "abcde", new String[] {"ab", "d"}, new String[] {"d", "t"}));
    }

    @Test
    public void testReplaceCharacters() throws Exception {
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
    }

    @Test
    public void testOverlayIndexBoundaries() throws Exception {
        assertEquals("zzabcdef", StringUtils.overlay("abcdef", "zz", -1, -2));
        assertEquals("abcdefzz", StringUtils.overlay("abcdef", "zz", 7, 9));
    }

    @Test
    public void testChompAndChopNewlines() throws Exception {
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
        assertEquals("abc", StringUtils.chop("abc\r\n"));
    }

    @Test
    public void testRepeatAndPadding() throws Exception {
        assertEquals("ababab", StringUtils.repeat("ab", 3));
        assertEquals("  bat", StringUtils.leftPad("bat", 5));
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
    }

    @Test
    public void testEmptyAndBlankBoundaries() throws Exception {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isBlank(" \t"));
        assertFalse(StringUtils.isBlank(" \u00a0"));
        assertTrue(StringUtils.isNotBlank("x"));
    }

    @Test
    public void testTrimAndStripCharacterRules() throws Exception {
        assertEquals("x", StringUtils.trim("\u0001x\u0001"));
        assertEquals("\u00a0x\u00a0", StringUtils.trim("\u00a0x\u00a0"));
        assertEquals("x", StringUtils.strip("\u2003x\u2003"));
        assertEquals("\u00a0x\u00a0", StringUtils.strip("\u00a0x\u00a0"));
    }

    @Test
    public void testTrimAndStripNullConversions() throws Exception {
        assertNull(StringUtils.trimToNull(" \t"));
        assertEquals("", StringUtils.trimToEmpty(null));
        assertNull(StringUtils.stripToNull(" \t"));
        assertEquals("", StringUtils.stripToEmpty(null));
    }

    @Test
    public void testStripStartEndAndCustomCharacters() throws Exception {
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xy"));
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xy"));
        assertEquals("abc", StringUtils.strip("xyabcxy", "xy"));
        assertEquals("", StringUtils.strip("xxx", "x"));
    }

    @Test
    public void testStripAllArrayAndNullEntry() throws Exception {
        assertArrayEquals(new String[] {"a", null, ""},
                StringUtils.stripAll(new String[] {" a ", null, " \t"}));
    }

    @Test
    public void testCaseSensitiveAndInsensitiveEquality() throws Exception {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals("a", "A"));
        assertTrue(StringUtils.equalsIgnoreCase("Lang", "lANG"));
        assertFalse(StringUtils.equalsIgnoreCase(null, ""));
    }

    @Test
    public void testCharacterSearchOrdinalsAndLastIndex() throws Exception {
        assertEquals(0, StringUtils.indexOf("ababa", 'a'));
        assertEquals(4, StringUtils.ordinalIndexOf("ababa", "a", 3));
        assertEquals(-1, StringUtils.ordinalIndexOf("ababa", "a", 4));
        assertEquals(4, StringUtils.lastIndexOf("ababa", 'a'));
        assertTrue(StringUtils.contains("abc", 'b'));
        assertFalse(StringUtils.contains("", 'a'));
    }

    @Test
    public void testCaseInsensitiveContainment() throws Exception {
        assertTrue(StringUtils.containsIgnoreCase("AbCd", "bc"));
        assertTrue(StringUtils.containsIgnoreCase("abc", ""));
        assertFalse(StringUtils.containsIgnoreCase("abc", "abcd"));
        assertFalse(StringUtils.containsIgnoreCase(null, ""));
    }

    @Test
    public void testCharacterSetSearchBoundaries() throws Exception {
        assertEquals(1, StringUtils.indexOfAny("abc", new char[] {'c', 'b'}));
        assertTrue(StringUtils.containsAny("abc", new char[] {'c'}));
        assertFalse(StringUtils.containsAny("abc", new char[0]));
        assertEquals(2, StringUtils.indexOfAnyBut("aab", new char[] {'a'}));
    }

    @Test
    public void testContainsOnlyAndContainsNone() throws Exception {
        assertTrue(StringUtils.containsOnly("", new char[0]));
        assertTrue(StringUtils.containsOnly("aba", new char[] {'a', 'b'}));
        assertFalse(StringUtils.containsOnly("abc", new char[] {'a', 'b'}));
        assertFalse(StringUtils.containsOnly("a", (char[]) null));
        assertTrue(StringUtils.containsNone("abc", new char[] {'x', 'y'}));
        assertFalse(StringUtils.containsNone("abc", new char[] {'c'}));
    }

    @Test
    public void testLastIndexOfAnyIgnoresNullEntries() throws Exception {
        assertEquals(4, StringUtils.lastIndexOfAny(
                "ababa", new String[] {null, "a", "ba"}));
        assertEquals(-1, StringUtils.lastIndexOfAny(
                "abc", new String[] {null, "z"}));
    }

    @Test
    public void testSubstringStartLimits() throws Exception {
        assertEquals("abc", StringUtils.substring("abc", -5));
        assertEquals("", StringUtils.substring("abc", 3));
        assertEquals("", StringUtils.substring("abc", 4));
        assertNull(StringUtils.substring(null, 0));
    }

    @Test
    public void testLeftRightAndMidLimits() throws Exception {
        assertEquals("", StringUtils.left("abc", 0));
        assertEquals("abc", StringUtils.left("abc", 3));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("", StringUtils.right("abc", -1));
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
        assertEquals("", StringUtils.mid("abc", 4, 1));
    }

    @Test
    public void testSubstringRelativeToSeparator() throws Exception {
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("abc", StringUtils.substringBefore("abc", null));
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("abc", StringUtils.substringAfter("abc", ""));
        assertEquals("abc", StringUtils.substringBeforeLast("abcabc", "abc"));
        assertEquals("bc", StringUtils.substringAfterLast("abcabc", "abc"));
    }

    @Test
    public void testSubstringBetweenAndMultipleMatches() throws Exception {
        assertEquals("b", StringUtils.substringBetween("[b]", "[", "]"));
        assertNull(StringUtils.substringBetween("[b", "[", "]"));
        assertArrayEquals(new String[] {"a", "b"},
                StringUtils.substringsBetween("[a][b]", "[", "]"));
        assertNull(StringUtils.substringsBetween("[a", "[", "]"));
    }
}
```