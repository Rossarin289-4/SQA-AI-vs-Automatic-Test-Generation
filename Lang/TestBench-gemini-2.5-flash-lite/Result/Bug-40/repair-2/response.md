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

    // Test methods for isEmpty, isNotEmpty, isBlank, isNotBlank
    @Test
    public void testIsEmpty_null() {
        assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    public void testIsEmpty_emptyString() {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void testIsEmpty_notEmptyString() {
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("bob"));
    }

    @Test
    public void testIsNotEmpty_null() {
        assertFalse(StringUtils.isNotEmpty(null));
    }

    @Test
    public void testIsNotEmpty_emptyString() {
        assertFalse(StringUtils.isNotEmpty(""));
    }

    @Test
    public void testIsNotEmpty_notEmptyString() {
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("bob"));
    }

    @Test
    public void testIsBlank_null() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    public void testIsBlank_emptyString() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    public void testIsBlank_whitespaceString() {
        assertTrue(StringUtils.isBlank("   "));
        assertTrue(StringUtils.isBlank("\t\n\r"));
    }

    @Test
    public void testIsBlank_nonWhitespaceString() {
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @Test
    public void testIsNotBlank_null() {
        assertFalse(StringUtils.isNotBlank(null));
    }

    @Test
    public void testIsNotBlank_emptyString() {
        assertFalse(StringUtils.isNotBlank(""));
    }

    @Test
    public void testIsNotBlank_whitespaceString() {
        assertFalse(StringUtils.isNotBlank("   "));
        assertFalse(StringUtils.isNotBlank("\t\n\r"));
    }

    @Test
    public void testIsNotBlank_nonWhitespaceString() {
        assertTrue(StringUtils.isNotBlank("bob"));
        assertTrue(StringUtils.isNotBlank("  bob  "));
    }

    // Test methods for trim, trimToNull, trimToEmpty
    @Test
    public void testTrim_null() {
        assertNull(StringUtils.trim(null));
    }

    @Test
    public void testTrim_emptyString() {
        assertEquals("", StringUtils.trim(""));
    }

    @Test
    public void testTrim_whitespaceString() {
        assertEquals("", StringUtils.trim("     "));
    }

    @Test
    public void testTrim_regularString() {
        assertEquals("abc", StringUtils.trim("abc"));
        assertEquals("abc", StringUtils.trim("    abc    "));
    }

    @Test
    public void testTrimToNull_null() {
        assertNull(StringUtils.trimToNull(null));
    }

    @Test
    public void testTrimToNull_emptyString() {
        assertNull(StringUtils.trimToNull(""));
    }

    @Test
    public void testTrimToNull_whitespaceString() {
        assertNull(StringUtils.trimToNull("     "));
    }

    @Test
    public void testTrimToNull_regularString() {
        assertEquals("abc", StringUtils.trimToNull("abc"));
        assertEquals("abc", StringUtils.trimToNull("    abc    "));
    }

    @Test
    public void testTrimToEmpty_null() {
        assertEquals("", StringUtils.trimToEmpty(null));
    }

    @Test
    public void testTrimToEmpty_emptyString() {
        assertEquals("", StringUtils.trimToEmpty(""));
    }

    @Test
    public void testTrimToEmpty_whitespaceString() {
        assertEquals("", StringUtils.trimToEmpty("     "));
    }

    @Test
    public void testTrimToEmpty_regularString() {
        assertEquals("abc", StringUtils.trimToEmpty("abc"));
        assertEquals("abc", StringUtils.trimToEmpty("    abc    "));
    }

    // Test methods for strip, stripStart, stripEnd, stripAll
    @Test
    public void testStrip_null() {
        assertNull(StringUtils.strip(null));
    }

    @Test
    public void testStrip_emptyString() {
        assertEquals("", StringUtils.strip(""));
    }

    @Test
    public void testStrip_whitespaceString() {
        assertEquals("", StringUtils.strip("   "));
    }

    @Test
    public void testStrip_regularString() {
        assertEquals("abc", StringUtils.strip("abc"));
        assertEquals("abc", StringUtils.strip("  abc"));
        assertEquals("abc", StringUtils.strip("abc  "));
        assertEquals("abc", StringUtils.strip(" abc "));
        assertEquals("ab c", StringUtils.strip(" ab c "));
    }

    @Test
    public void testStrip_withChars_null() {
        assertNull(StringUtils.strip(null, "*"));
    }

    @Test
    public void testStrip_withChars_emptyString() {
        assertEquals("", StringUtils.strip("", "*"));
    }

    @Test
    public void testStrip_withChars_emptyStripChars() {
        assertEquals("abc", StringUtils.strip("abc", ""));
    }

    @Test
    public void testStrip_withChars_regular() {
        assertEquals("abc", StringUtils.strip("abc", null));
        assertEquals("abc", StringUtils.strip("  abc", null));
        assertEquals("abc", StringUtils.strip("abc  ", null));
        assertEquals("abc", StringUtils.strip(" abc ", null));
        assertEquals("  abc", StringUtils.strip("  abcyx", "xyz"));
    }
    
    @Test
    public void testStripStart_null() {
        assertNull(StringUtils.stripStart(null, null));
    }
    
    @Test
    public void testStripStart_emptyString() {
        assertEquals("", StringUtils.stripStart("", null));
    }
    
    @Test
    public void testStripStart_emptyStripChars() {
        assertEquals("abc", StringUtils.stripStart("abc", ""));
    }
    
    @Test
    public void testStripStart_withNullStripChars() {
        assertEquals("abc", StringUtils.stripStart("abc", null));
        assertEquals("abc", StringUtils.stripStart("  abc", null));
        assertEquals("abc  ", StringUtils.stripStart("abc  ", null));
        assertEquals("abc ", StringUtils.stripStart(" abc ", null));
    }

    @Test
    public void testStripStart_withValidStripChars() {
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xyz"));
    }

    @Test
    public void testStripEnd_null() {
        assertNull(StringUtils.stripEnd(null, null));
    }

    @Test
    public void testStripEnd_emptyString() {
        assertEquals("", StringUtils.stripEnd("", null));
    }

    @Test
    public void testStripEnd_emptyStripChars() {
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
    }
    
    @Test
    public void testStripEnd_withNullStripChars() {
        assertEquals("abc", StringUtils.stripEnd("abc", null));
        assertEquals("  abc", StringUtils.stripEnd("  abc", null));
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals(" abc", StringUtils.stripEnd(" abc ", null));
    }
    
    @Test
    public void testStripEnd_withValidStripChars() {
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
    }

    @Test
    public void testStripAll_nullArray() {
        assertNull(StringUtils.stripAll(null));
    }

    @Test
    public void testStripAll_emptyArray() {
        String[] emptyArray = {};
        assertSame(emptyArray, StringUtils.stripAll(emptyArray));
    }

    @Test
    public void testStripAll_arrayWithNulls() {
        String[] input = {"abc", null, "  def  "};
        String[] expected = {"abc", null, "def"};
        assertArrayEquals(expected, StringUtils.stripAll(input));
    }

    @Test
    public void testStripAll_arrayWithStripChars_null() {
        String[] input = {"abc", null, "  def  "};
        String[] expected = {"abc", null, "def"};
        assertArrayEquals(expected, StringUtils.stripAll(input, null));
    }

    @Test
    public void testStripAll_arrayWithStripChars_valid() {
        String[] input = {"yabcz", null, "  defx"};
        String[] expected = {"abc", null, "def"};
        assertArrayEquals(expected, StringUtils.stripAll(input, "xyz"));
    }

    // Test methods for equals, equalsIgnoreCase
    @Test
    public void testEquals_bothNull() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEquals_firstNull() {
        assertFalse(StringUtils.equals(null, "abc"));
    }

    @Test
    public void testEquals_secondNull() {
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEquals_equalStrings() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEquals_differentStrings() {
        assertFalse(StringUtils.equals("abc", "ABC"));
        assertFalse(StringUtils.equals("abc", "ab"));
    }

    @Test
    public void testEqualsIgnoreCase_bothNull() {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
    }

    @Test
    public void testEqualsIgnoreCase_firstNull() {
        assertFalse(StringUtils.equalsIgnoreCase(null, "abc"));
    }

    @Test
    public void testEqualsIgnoreCase_secondNull() {
        assertFalse(StringUtils.equalsIgnoreCase("abc", null));
    }

    @Test
    public void testEqualsIgnoreCase_equalStrings() {
        assertTrue(StringUtils.equalsIgnoreCase("abc", "abc"));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    @Test
    public void testEqualsIgnoreCase_differentStrings() {
        assertFalse(StringUtils.equalsIgnoreCase("abc", "abd"));
    }

    // Test methods for indexOf, indexOfAny, indexOfAnyBut
    @Test
    public void testIndexOf_emptyString() {
        assertEquals(-1, StringUtils.indexOf("", 'a'));
    }

    @Test
    public void testIndexOf_nullString() {
        assertEquals(-1, StringUtils.indexOf(null, 'a'));
    }

    @Test
    public void testIndexOf_charFound() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", 'a'));
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b'));
    }

    @Test
    public void testIndexOf_charNotFound() {
        assertEquals(-1, StringUtils.indexOf("aabaabaa", 'z'));
    }

    @Test
    public void testIndexOf_withStartIndex_charFound() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', 0));
        assertEquals(5, StringUtils.indexOf("aabaabaa", 'b', 3));
    }

    @Test
    public void testIndexOf_withStartIndex_charNotFound() {
        assertEquals(-1, StringUtils.indexOf("aabaabaa", 'b', 9));
    }

    @Test
    public void testIndexOf_withStartIndex_negativeStart() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', -1));
    }

    @Test
    public void testIndexOf_withStartIndex_emptyString() {
        assertEquals(-1, StringUtils.indexOf("", 'a', 0));
    }

    @Test
    public void testIndexOf_withStartIndex_nullString() {
        assertEquals(-1, StringUtils.indexOf(null, 'a', 0));
    }

    @Test
    public void testIndexOf_string_emptyString() {
        assertEquals(0, StringUtils.indexOf("", ""));
    }

    @Test
    public void testIndexOf_string_nullString() {
        assertEquals(-1, StringUtils.indexOf(null, "a"));
        assertEquals(-1, StringUtils.indexOf("a", null));
    }

    @Test
    public void testIndexOf_string_found() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", "a"));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b"));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
    }

    @Test
    public void testIndexOf_string_notFound() {
        assertEquals(-1, StringUtils.indexOf("aabaabaa", "z"));
    }

    @Test
    public void testIndexOf_string_emptySearchString() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", ""));
    }
    
    @Test
    public void testOrdinalIndexOf_nullString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf(null, "a", 1));
    }

    @Test
    public void testOrdinalIndexOf_nullSearchString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("abc", null, 1));
    }

    @Test
    public void testOrdinalIndexOf_emptySearchString() {
        assertEquals(0, StringUtils.ordinalIndexOf("abc", "", 1));
    }
    
    @Test
    public void testOrdinalIndexOf_zeroOrdinal() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("abc", "a", 0));
    }

    @Test
    public void testOrdinalIndexOf_firstOccurrence() {
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
    }

    @Test
    public void testOrdinalIndexOf_secondOccurrence() {
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
    }

    @Test
    public void testOrdinalIndexOf_thirdOccurrence() {
        assertEquals(4, StringUtils.ordinalIndexOf("aabaabaa", "a", 3));
    }

    @Test
    public void testOrdinalIndexOf_fourthOccurrence() {
        assertEquals(7, StringUtils.ordinalIndexOf("aabaabaa", "a", 4));
    }

    @Test
    public void testOrdinalIndexOf_fifthOccurrenceNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("aabaabaa", "a", 5));
    }
    
    @Test
    public void testOrdinalIndexOf_stringSearch() {
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "ab", 1));
        assertEquals(4, StringUtils.ordinalIndexOf("aabaabaa", "ab", 2));
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("aabaabaa", "ab", 3));
    }

    @Test
    public void testIndexOf_stringStartIndex_nullString() {
        assertEquals(-1, StringUtils.indexOf(null, "a", 0));
        assertEquals(-1, StringUtils.indexOf("abc", null, 0));
    }

    @Test
    public void testIndexOf_stringStartIndex_emptyString() {
        assertEquals(0, StringUtils.indexOf("", "", 0));
    }

    @Test
    public void testIndexOf_stringStartIndex_found() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", "a", 0));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b", 0));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab", 0));
        assertEquals(5, StringUtils.indexOf("aabaabaa", "b", 3));
    }

    @Test
    public void testIndexOf_stringStartIndex_notFound() {
        assertEquals(-1, StringUtils.indexOf("aabaabaa", "b", 9));
    }

    @Test
    public void testIndexOf_stringStartIndex_negativeStart() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b", -1));
    }

    @Test
    public void testIndexOf_stringStartIndex_emptySearchString() {
        assertEquals(2, StringUtils.indexOf("abc", "", 2));
    }

    @Test
    public void testIndexOf_stringStartIndex_emptySearchAndStartAtEnd() {
        assertEquals(3, StringUtils.indexOf("abc", "", 3));
    }

    @Test
    public void testIndexOf_stringStartIndex_emptySearchAndStartPastEnd() {
        assertEquals(3, StringUtils.indexOf("abc", "", 9));
    }
    
    @Test
    public void testLastIndexOf_emptyString() {
        assertEquals(-1, StringUtils.lastIndexOf("", 'a'));
    }

    @Test
    public void testLastIndexOf_nullString() {
        assertEquals(-1, StringUtils.lastIndexOf(null, 'a'));
    }

    @Test
    public void testLastIndexOf_charFound() {
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a'));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b'));
    }

    @Test
    public void testLastIndexOf_charNotFound() {
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'z'));
    }

    @Test
    public void testLastIndexOf_withStartIndex_charFound() {
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 8));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", 'b', 4));
    }

    @Test
    public void testLastIndexOf_withStartIndex_charNotFound() {
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', 0));
    }
    
    @Test
    public void testLastIndexOf_withStartIndex_startBeyondLength() {
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 9));
    }

    @Test
    public void testLastIndexOf_withStartIndex_negativeStart() {
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', -1));
    }

    @Test
    public void testLastIndexOf_withStartIndex_charFoundAtZero() {
        assertEquals(0, StringUtils.lastIndexOf("aabaabaa", 'a', 0));
    }
    
    @Test
    public void testLastIndexOf_string_emptyString() {
        assertEquals(0, StringUtils.lastIndexOf("", ""));
    }

    @Test
    public void testLastIndexOf_string_nullString() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a"));
        assertEquals(-1, StringUtils.lastIndexOf("a", null));
    }

    @Test
    public void testLastIndexOf_string_found() {
        assertEquals(0, StringUtils.lastIndexOf("aabaabaa", "a"));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", "b"));
        assertEquals(1, StringUtils.lastIndexOf("aabaabaa", "ab"));
    }

    @Test
    public void testLastIndexOf_string_notFound() {
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "z"));
    }

    @Test
    public void testLastIndexOf_string_emptySearchString() {
        assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
    }
    
    @Test
    public void testLastIndexOf_stringStartIndex_nullString() {
        assertEquals(-1, StringUtils.lastIndexOf(null, "a", 0));
        assertEquals(-1, StringUtils.lastIndexOf("abc", null, 0));
    }

    @Test
    public void testLastIndexOf_stringStartIndex_found() {
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a", 8));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b", 8));
        assertEquals(4, StringUtils.lastIndexOf("aabaabaa", "ab", 8));
    }

    @Test
    public void testLastIndexOf_stringStartIndex_notFound() {
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "b", 0));
    }

    @Test
    public void testLastIndexOf_stringStartIndex_startBeyondLength() {
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b", 9));
    }

    @Test
    public void testLastIndexOf_stringStartIndex_negativeStart() {
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "b", -1));
    }

    @Test
    public void testLastIndexOf_stringStartIndex_startAtZero() {
        assertEquals(0, StringUtils.lastIndexOf("aabaabaa", "a", 0));
    }

    @Test
    public void testContains_emptyString() {
        assertFalse(StringUtils.contains("", 'a'));
    }

    @Test
    public void testContains_nullString() {
        assertFalse(StringUtils.contains(null, 'a'));
    }

    @Test
    public void testContains_charFound() {
        assertTrue(StringUtils.contains("abc", 'a'));
    }

    @Test
    public void testContains_charNotFound() {
        assertFalse(StringUtils.contains("abc", 'z'));
    }

    @Test
    public void testContains_string_nullString() {
        assertFalse(StringUtils.contains(null, "a"));
        assertFalse(StringUtils.contains("abc", null));
    }

    @Test
    public void testContains_string_emptyString() {
        assertTrue(StringUtils.contains("", ""));
    }

    @Test
    public void testContains_string_found() {
        assertTrue(StringUtils.contains("abc", "a"));
        assertTrue(StringUtils.contains("abc", ""));
    }

    @Test
    public void testContains_string_notFound() {
        assertFalse(StringUtils.contains("abc", "z"));
    }

    @Test
    public void testContainsIgnoreCase_nullString() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        assertFalse(StringUtils.containsIgnoreCase("abc", null));
    }

    @Test
    public void testContainsIgnoreCase_emptyString() {
        assertTrue(StringUtils.containsIgnoreCase("", ""));
    }

    @Test
    public void testContainsIgnoreCase_foundIgnoreCase() {
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
        assertTrue(StringUtils.containsIgnoreCase("aBc", "Ab"));
    }

    @Test
    public void testContainsIgnoreCase_foundCaseSensitive() {
        assertTrue(StringUtils.containsIgnoreCase("abc", "a"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "b"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "c"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "ab"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "bc"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "abc"));
    }
    
    @Test
    public void testContainsIgnoreCase_notFound() {
        assertFalse(StringUtils.containsIgnoreCase("abc", "z"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "ac"));
    }

    @Test
    public void testIndexOfAny_nullString() {
        assertEquals(-1, StringUtils.indexOfAny(null, new char[]{'a'}));
    }

    @Test
    public void testIndexOfAny_emptyString() {
        assertEquals(-1, StringUtils.indexOfAny("", new char[]{'a'}));
    }

    @Test
    public void testIndexOfAny_nullSearchChars() {
        assertEquals(-1, StringUtils.indexOfAny("abc", null));
    }

    @Test
    public void testIndexOfAny_emptySearchChars() {
        assertEquals(-1, StringUtils.indexOfAny("abc", new char[]{}));
    }

    @Test
    public void testIndexOfAny_charFound_first() {
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new char[]{'z', 'a'}));
    }

    @Test
    public void testIndexOfAny_charFound_middle() {
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", new char[]{'b', 'y'}));
    }

    @Test
    public void testIndexOfAny_charFound_last() {
        assertEquals(8, StringUtils.indexOfAny("zzabyycdxx", new char[]{'d', 'x'}));
    }

    @Test
    public void testIndexOfAny_charNotFound() {
        assertEquals(-1, StringUtils.indexOfAny("aba", new char[]{'z'}));
    }

    @Test
    public void testIndexOfAny_string_nullString() {
        assertEquals(-1, StringUtils.indexOfAny(null, "za"));
    }

    @Test
    public void testIndexOfAny_string_emptyString() {
        assertEquals(-1, StringUtils.indexOfAny("", "za"));
    }

    @Test
    public void testIndexOfAny_string_nullSearchChars() {
        assertEquals(-1, StringUtils.indexOfAny("abc", null));
    }

    @Test
    public void testIndexOfAny_string_emptySearchChars() {
        assertEquals(-1, StringUtils.indexOfAny("abc", ""));
    }

    @Test
    public void testIndexOfAny_string_charFound_first() {
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", "za"));
    }

    @Test
    public void testIndexOfAny_string_charFound_middle() {
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", "by"));
    }

    @Test
    public void testIndexOfAny_string_charFound_last() {
        assertEquals(8, StringUtils.indexOfAny("zzabyycdxx", "dx"));
    }

    @Test
    public void testIndexOfAny_string_charNotFound() {
        assertEquals(-1, StringUtils.indexOfAny("aba", "z"));
    }

    @Test
    public void testContainsAny_nullString() {
        assertFalse(StringUtils.containsAny(null, new char[]{'a'}));
    }

    @Test
    public void testContainsAny_emptyString() {
        assertFalse(StringUtils.containsAny("", new char[]{'a'}));
    }

    @Test
    public void testContainsAny_nullSearchChars() {
        assertFalse(StringUtils.containsAny("abc", null));
    }

    @Test
    public void testContainsAny_emptySearchChars() {
        assertFalse(StringUtils.containsAny("abc", new char[]{}));
    }

    @Test
    public void testContainsAny_charFound_first() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[]{'z', 'a'}));
    }

    @Test
    public void testContainsAny_charFound_middle() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[]{'b', 'y'}));
    }

    @Test
    public void testContainsAny_charFound_last() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[]{'d', 'x'}));
    }

    @Test
    public void testContainsAny_charNotFound() {
        assertFalse(StringUtils.containsAny("aba", new char[]{'z'}));
    }

    @Test
    public void testContainsAny_string_nullString() {
        assertFalse(StringUtils.containsAny(null, "za"));
    }

    @Test
    public void testContainsAny_string_emptyString() {
        assertFalse(StringUtils.containsAny("", "za"));
    }

    @Test
    public void testContainsAny_string_nullSearchChars() {
        assertFalse(StringUtils.containsAny("abc", null));
    }

    @Test
    public void testContainsAny_string_emptySearchChars() {
        assertFalse(StringUtils.containsAny("abc", ""));
    }

    @Test
    public void testContainsAny_string_charFound_first() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
    }

    @Test
    public void testContainsAny_string_charFound_middle() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", "by"));
    }

    @Test
    public void testContainsAny_string_charFound_last() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", "dx"));
    }

    @Test
    public void testContainsAny_string_charNotFound() {
        assertFalse(StringUtils.containsAny("aba", "z"));
    }

    @Test
    public void testIndexOfAnyBut_nullString() {
        assertEquals(-1, StringUtils.indexOfAnyBut(null, new char[]{'a'}));
    }

    @Test
    public void testIndexOfAnyBut_emptyString() {
        assertEquals(-1, StringUtils.indexOfAnyBut("", new char[]{'a'}));
    }

    @Test
    public void testIndexOfAnyBut_nullSearchChars() {
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", null));
    }

    @Test
    public void testIndexOfAnyBut_emptySearchChars() {
        assertEquals(0, StringUtils.indexOfAnyBut("abc", new char[]{}));
    }

    @Test
    public void testIndexOfAnyBut_charFound() {
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", new char[]{'z', 'a'}));
    }
    
    @Test
    public void testIndexOfAnyBut_charNotFound() {
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", new char[]{'a', 'b'}));
    }

    @Test
    public void testIndexOfAnyBut_string_nullString() {
        assertEquals(-1, StringUtils.indexOfAnyBut(null, "za"));
    }

    @Test
    public void testIndexOfAnyBut_string_emptyString() {
        assertEquals(-1, StringUtils.indexOfAnyBut("", "za"));
    }

    @Test
    public void testIndexOfAnyBut_string_nullSearchChars() {
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", null));
    }

    @Test
    public void testIndexOfAnyBut_string_emptySearchChars() {
        assertEquals(0, StringUtils.indexOfAnyBut("abc", ""));
    }

    @Test
    public void testIndexOfAnyBut_string_charFound() {
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
    }

    @Test
    public void testIndexOfAnyBut_string_charNotFound() {
        assertEquals(-1, StringUtils.indexOfAnyBut("aba", "ab"));
    }

    @Test
    public void testContainsOnly_nullString() {
        assertFalse(StringUtils.containsOnly(null, new char[]{'a'}));
    }

    @Test
    public void testContainsOnly_nullValidChars() {
        assertFalse(StringUtils.containsOnly("abc", null));
    }

    @Test
    public void testContainsOnly_emptyString() {
        assertTrue(StringUtils.containsOnly("", new char[]{'a'}));
    }

    @Test
    public void testContainsOnly_emptyValidChars() {
        assertFalse(StringUtils.containsOnly("ab", new char[]{}));
    }

    @Test
    public void testContainsOnly_allValidChars() {
        assertTrue(StringUtils.containsOnly("abab", new char[]{'a', 'b', 'c'}));
    }

    @Test
    public void testContainsOnly_containsInvalidChar() {
        assertFalse(StringUtils.containsOnly("ab1", new char[]{'a', 'b', 'c'}));
    }
    
    @Test
    public void testContainsOnly_string_nullString() {
        assertFalse(StringUtils.containsOnly(null, "abc"));
    }

    @Test
    public void testContainsOnly_string_nullValidChars() {
        assertFalse(StringUtils.containsOnly("abc", null));
    }

    @Test
    public void testContainsOnly_string_emptyString() {
        assertTrue(StringUtils.containsOnly("", "abc"));
    }

    @Test
    public void testContainsOnly_string_emptyValidChars() {
        assertFalse(StringUtils.containsOnly("ab", ""));
    }

    @Test
    public void testContainsOnly_string_allValidChars() {
        assertTrue(StringUtils.containsOnly("abab", "abc"));
    }

    @Test
    public void testContainsOnly_string_containsInvalidChar() {
        assertFalse(StringUtils.containsOnly("ab1", "abc"));
    }

    @Test
    public void testContainsNone_nullString() {
        assertTrue(StringUtils.containsNone(null, new char[]{'x', 'y', 'z'}));
    }

    @Test
    public void testContainsNone_nullInvalidChars() {
        assertTrue(StringUtils.containsNone("abc", null));
    }

    @Test
    public void testContainsNone_emptyString() {
        assertTrue(StringUtils.containsNone("", new char[]{'x', 'y', 'z'}));
    }

    @Test
    public void testContainsNone_emptyInvalidChars() {
        assertTrue(StringUtils.containsNone("abc", new char[]{}));
    }

    @Test
    public void testContainsNone_noInvalidChars() {
        assertTrue(StringUtils.containsNone("abab", new char[]{'x', 'y', 'z'}));
    }

    @Test
    public void testContainsNone_containsInvalidChar() {
        assertFalse(StringUtils.containsNone("abz", new char[]{'x', 'y', 'z'}));
    }
    
    @Test
    public void testContainsNone_string_nullString() {
        assertTrue(StringUtils.containsNone(null, "xyz"));
    }

    @Test
    public void testContainsNone_string_nullInvalidChars() {
        assertTrue(StringUtils.containsNone("abc", null));
    }

    @Test
    public void testContainsNone_string_emptyString() {
        assertTrue(StringUtils.containsNone("", "xyz"));
    }

    @Test
    public void testContainsNone_string_emptyInvalidChars() {
        assertTrue(StringUtils.containsNone("abc", ""));
    }

    @Test
    public void testContainsNone_string_noInvalidChars() {
        assertTrue(StringUtils.containsNone("abab", "xyz"));
    }

    @Test
    public void testContainsNone_string_containsInvalidChar() {
        assertFalse(StringUtils.containsNone("abz", "xyz"));
    }

    // Test methods for indexOfAny (String[]), lastIndexOfAny (String[])
    @Test
    public void testIndexOfAny_stringArray_nullString() {
        assertEquals(-1, StringUtils.indexOfAny(null, new String[]{"a", "b"}));
    }

    @Test
    public void testIndexOfAny_stringArray_nullSearchStrs() {
        assertEquals(-1, StringUtils.indexOfAny("abc", null));
    }

    @Test
    public void testIndexOfAny_stringArray_emptySearchStrs() {
        assertEquals(-1, StringUtils.indexOfAny("abc", new String[]{}));
    }

    @Test
    public void testIndexOfAny_stringArray_foundFirst() {
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", new String[]{"ab", "cd"}));
    }

    @Test
    public void testIndexOfAny_stringArray_foundSecond() {
        assertEquals(6, StringUtils.indexOfAny("zzabyycdxx", new String[]{"cd", "ab"}));
    }

    @Test
    public void testIndexOfAny_stringArray_notFound() {
        assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new String[]{"mn", "op"}));
    }

    @Test
    public void testIndexOfAny_stringArray_foundEarlier() {
        assertEquals(1, StringUtils.indexOfAny("zzabyycdxx", new String[]{"zab", "aby"}));
    }

    @Test
    public void testIndexOfAny_stringArray_emptyStringInSearch() {
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new String[]{""}));
    }

    @Test
    public void testIndexOfAny_stringArray_emptyStringTargetAndSearch() {
        assertEquals(0, StringUtils.indexOfAny("", new String[]{""}));
    }

    @Test
    public void testIndexOfAny_stringArray_emptyTargetNonEmptySearch() {
        assertEquals(-1, StringUtils.indexOfAny("", new String[]{"a"}));
    }

    @Test
    public void testLastIndexOfAny_stringArray_nullString() {
        assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[]{"a", "b"}));
    }

    @Test
    public void testLastIndexOfAny_stringArray_nullSearchStrs() {
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", null));
    }

    @Test
    public void testLastIndexOfAny_stringArray_emptySearchStrs() {
        assertEquals(-1, StringUtils.lastIndexOfAny("abc", new String[]{}));
    }
    
    @Test
    public void testLastIndexOfAny_stringArray_foundFirst() {
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"ab", "cd"}));
    }

    @Test
    public void testLastIndexOfAny_stringArray_foundSecond() {
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"cd", "ab"}));
    }

    @Test
    public void testLastIndexOfAny_stringArray_notFound() {
        assertEquals(-1, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"mn", "op"}));
    }
    
    @Test
    public void testLastIndexOfAny_stringArray_withEmptyString() {
        assertEquals(10, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"mn", ""}));
    }

    // Test methods for substring
    @Test
    public void testSubstring_nullString() {
        assertNull(StringUtils.substring(null, 0));
    }

    @Test
    public void testSubstring_emptyString() {
        assertEquals("", StringUtils.substring("", 0));
    }

    @Test
    public void testSubstring_startZero() {
        assertEquals("abc", StringUtils.substring("abc", 0));
    }

    @Test
    public void testSubstring_startPositive() {
        assertEquals("c", StringUtils.substring("abc", 2));
    }

    @Test
    public void testSubstring_startBeyondLength() {
        assertEquals("", StringUtils.substring("abc", 4));
    }

    @Test
    public void testSubstring_startNegative() {
        assertEquals("bc", StringUtils.substring("abc", -2));
    }

    @Test
    public void testSubstring_startNegativeBeyondLength() {
        assertEquals("abc", StringUtils.substring("abc", -4));
    }
    
    @Test
    public void testSubstring_startNegativeZero() {
        assertEquals("abc", StringUtils.substring("abc", -3));
    }

    @Test
    public void testSubstring_startEndNegativeZero() {
        assertEquals("", StringUtils.substring("abc", 0, 0));
    }
    
    @Test
    public void testSubstring_nullString_startEnd() {
        assertNull(StringUtils.substring(null, 0, 0));
    }

    @Test
    public void testSubstring_emptyString_startEnd() {
        assertEquals("", StringUtils.substring("", 0, 0));
    }

    @Test
    public void testSubstring_startPositiveEndPositive() {
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
    }

    @Test
    public void testSubstring_startEndSwapped() {
        assertEquals("", StringUtils.substring("abc", 2, 0));
    }

    @Test
    public void testSubstring_endBeyondLength() {
        assertEquals("c", StringUtils.substring("abc", 2, 4));
    }

    @Test
    public void testSubstring_startBeyondLength_startEnd() {
        assertEquals("", StringUtils.substring("abc", 4, 6));
    }

    @Test
    public void testSubstring_startEqualsEnd() {
        assertEquals("", StringUtils.substring("abc", 2, 2));
    }

    @Test
    public void testSubstring_startNegativeEndNegative() {
        assertEquals("b", StringUtils.substring("abc", -2, -1));
    }

    @Test
    public void testSubstring_startNegativeEndPositive() {
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }
    
    // Test methods for left, right, mid
    @Test
    public void testLeft_nullString() {
        assertNull(StringUtils.left(null, 2));
    }

    @Test
    public void testLeft_negativeLength() {
        assertEquals("", StringUtils.left("abc", -1));
    }

    @Test
    public void testLeft_emptyString() {
        assertEquals("", StringUtils.left("", 2));
    }

    @Test
    public void testLeft_zeroLength() {
        assertEquals("", StringUtils.left("abc", 0));
    }

    @Test
    public void testLeft_lengthWithinBounds() {
        assertEquals("ab", StringUtils.left("abc", 2));
    }

    @Test
    public void testLeft_lengthEqualsStringLength() {
        assertEquals("abc", StringUtils.left("abc", 3));
    }

    @Test
    public void testLeft_lengthExceedsStringLength() {
        assertEquals("abc", StringUtils.left("abc", 4));
    }

    @Test
    public void testRight_nullString() {
        assertNull(StringUtils.right(null, 2));
    }

    @Test
    public void testRight_negativeLength() {
        assertEquals("", StringUtils.right("abc", -1));
    }

    @Test
    public void testRight_emptyString() {
        assertEquals("", StringUtils.right("", 2));
    }

    @Test
    public void testRight_zeroLength() {
        assertEquals("", StringUtils.right("abc", 0));
    }

    @Test
    public void testRight_lengthWithinBounds() {
        assertEquals("bc", StringUtils.right("abc", 2));
    }

    @Test
    public void testRight_lengthEqualsStringLength() {
        assertEquals("abc", StringUtils.right("abc", 3));
    }

    @Test
    public void testRight_lengthExceedsStringLength() {
        assertEquals("abc", StringUtils.right("abc", 4));
    }

    @Test
    public void testMid_nullString() {
        assertNull(StringUtils.mid(null, 0, 2));
    }

    @Test
    public void testMid_negativeLength() {
        assertEquals("", StringUtils.mid("abc", 0, -1));
    }

    @Test
    public void testMid_posBeyondLength() {
        assertEquals("", StringUtils.mid("abc", 4, 2));
    }

    @Test
    public void testMid_emptyString() {
        assertEquals("", StringUtils.mid("", 0, 1));
    }

    @Test
    public void testMid_zeroLength() {
        assertEquals("", StringUtils.mid("abc", 0, 0));
    }

    @Test
    public void testMid_regularCase() {
        assertEquals("ab", StringUtils.mid("abc", 0, 2));
        assertEquals("abc", StringUtils.mid("abc", 0, 4));
        assertEquals("c", StringUtils.mid("abc", 2, 4));
    }

    @Test
    public void testMid_startBeyondLengthAndLength() {
        assertEquals("", StringUtils.mid("abc", 4, 2));
    }

    @Test
    public void testMid_negativePosition() {
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
    }
    
    // Test methods for substringBefore, substringAfter, substringBeforeLast, substringAfterLast
    @Test
    public void testSubstringBefore_nullString() {
        assertNull(StringUtils.substringBefore(null, "a"));
    }

    @Test
    public void testSubstringBefore_emptyString() {
        assertEquals("", StringUtils.substringBefore("", "a"));
    }

    @Test
    public void testSubstringBefore_nullSeparator() {
        assertEquals("abc", StringUtils.substringBefore("abc", null));
    }

    @Test
    public void testSubstringBefore_emptySeparator() {
        assertEquals("", StringUtils.substringBefore("abc", ""));
    }

    @Test
    public void testSubstringBefore_separatorNotFound() {
        assertEquals("abc", StringUtils.substringBefore("abc", "d"));
    }

    @Test
    public void testSubstringBefore_separatorFoundAtStart() {
        assertEquals("", StringUtils.substringBefore("abc", "a"));
    }

    @Test
    public void testSubstringBefore_separatorFoundInMiddle() {
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
    }

    @Test
    public void testSubstringBefore_separatorFoundAtEnd() {
        assertEquals("ab", StringUtils.substringBefore("abc", "c"));
    }

    @Test
    public void testSubstringAfter_nullString() {
        assertNull(StringUtils.substringAfter(null, "a"));
    }

    @Test
    public void testSubstringAfter_emptyString() {
        assertEquals("", StringUtils.substringAfter("", "a"));
    }

    @Test
    public void testSubstringAfter_nullSeparator() {
        assertEquals("", StringUtils.substringAfter("abc", null));
    }

    @Test
    public void testSubstringAfter_emptySeparator() {
        assertEquals("abc", StringUtils.substringAfter("abc", ""));
    }

    @Test
    public void testSubstringAfter_separatorNotFound() {
        assertEquals("", StringUtils.substringAfter("abc", "d"));
    }

    @Test
    public void testSubstringAfter_separatorFoundAtStart() {
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
    }

    @Test
    public void testSubstringAfter_separatorFoundInMiddle() {
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
    }

    @Test
    public void testSubstringAfter_separatorFoundAtEnd() {
        assertEquals("", StringUtils.substringAfter("abc", "c"));
    }

    @Test
    public void testSubstringBeforeLast_nullString() {
        assertNull(StringUtils.substringBeforeLast(null, "b"));
    }

    @Test
    public void testSubstringBeforeLast_emptyString() {
        assertEquals("", StringUtils.substringBeforeLast("", "b"));
    }

    @Test
    public void testSubstringBeforeLast_nullSeparator() {
        assertEquals("a", StringUtils.substringBeforeLast("a", null));
    }

    @Test
    public void testSubstringBeforeLast_emptySeparator() {
        assertEquals("a", StringUtils.substringBeforeLast("a", ""));
    }

    @Test
    public void testSubstringBeforeLast_separatorNotFound() {
        assertEquals("a", StringUtils.substringBeforeLast("a", "z"));
    }

    @Test
    public void testSubstringBeforeLast_separatorIsString() {
        assertEquals("", StringUtils.substringBeforeLast("a", "a"));
    }

    @Test
    public void testSubstringBeforeLast_separatorFound() {
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("ab", StringUtils.substringBeforeLast("abc", "c"));
    }
    
    @Test
    public void testSubstringAfterLast_nullString() {
        assertNull(StringUtils.substringAfterLast(null, "b"));
    }

    @Test
    public void testSubstringAfterLast_emptyString() {
        assertEquals("", StringUtils.substringAfterLast("", "b"));
    }

    @Test
    public void testSubstringAfterLast_emptySeparator() {
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
    }

    @Test
    public void testSubstringAfterLast_nullSeparator() {
        assertEquals("", StringUtils.substringAfterLast("abc", null));
    }

    @Test
    public void testSubstringAfterLast_separatorNotFound() {
        assertEquals("", StringUtils.substringAfterLast("a", "z"));
    }

    @Test
    public void testSubstringAfterLast_separatorIsString() {
        assertEquals("", StringUtils.substringAfterLast("a", "a"));
    }

    @Test
    public void testSubstringAfterLast_separatorFound() {
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        assertEquals("", StringUtils.substringAfterLast("abc", "c"));
    }

    // Test methods for substringBetween, substringsBetween
    @Test
    public void testSubstringBetween_nullString() {
        assertNull(StringUtils.substringBetween(null, "tag"));
    }

    @Test
    public void testSubstringBetween_nullTag() {
        assertNull(StringUtils.substringBetween("tagabctag", null));
    }

    @Test
    public void testSubstringBetween_emptyStringAndTag() {
        assertEquals("", StringUtils.substringBetween("", ""));
    }
    
    @Test
    public void testSubstringBetween_emptyStringWithTag() {
        assertNull(StringUtils.substringBetween("", "tag"));
    }

    @Test
    public void testSubstringBetween_emptyTag() {
        assertEquals("", StringUtils.substringBetween("tagabctag", ""));
    }

    @Test
    public void testSubstringBetween_matchFound() {
        assertEquals("abc", StringUtils.substringBetween("tagabctag", "tag"));
    }

    @Test
    public void testSubstringBetween_noMatch() {
        assertNull(StringUtils.substringBetween("tagabctag", "xyz"));
    }

    @Test
    public void testSubstringBetween_openAndClose_matchFound() {
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
    }

    @Test
    public void testSubstringBetween_openAndClose_nullString() {
        assertNull(StringUtils.substringBetween(null, "[", "]"));
    }

    @Test
    public void testSubstringBetween_openAndClose_nullOpen() {
        assertNull(StringUtils.substringBetween("wx[b]yz", null, "]"));
    }

    @Test
    public void testSubstringBetween_openAndClose_nullClose() {
        assertNull(StringUtils.substringBetween("wx[b]yz", "[", null));
    }

    @Test
    public void testSubstringBetween_openAndClose_emptyString() {
        assertEquals("", StringUtils.substringBetween("", "", ""));
        assertNull(StringUtils.substringBetween("", "", "]"));
        assertNull(StringUtils.substringBetween("", "[", "]"));
    }

    @Test
    public void testSubstringBetween_openAndClose_emptyOpenAndClose() {
        assertEquals("", StringUtils.substringBetween("yabcz", "", ""));
    }
    
    @Test
    public void testSubstringBetween_openAndClose_multipleMatches() {
        assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));
    }

    @Test
    public void testSubstringsBetween_nullString() {
        assertNull(StringUtils.substringsBetween(null, "[", "]"));
    }

    @Test
    public void testSubstringsBetween_nullOpen() {
        assertNull(StringUtils.substringsBetween("abc", null, "]"));
    }

    @Test
    public void testSubstringsBetween_nullClose() {
        assertNull(StringUtils.substringsBetween("abc", "[", null));
    }

    @Test
    public void testSubstringsBetween_emptyOpen() {
        assertNull(StringUtils.substringsBetween("abc", "", "]"));
    }

    @Test
    public void testSubstringsBetween_emptyClose() {
        assertNull(StringUtils.substringsBetween("abc", "[", ""));
    }

    @Test
    public void testSubstringsBetween_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.substringsBetween("", "[", "]"));
    }

    @Test
    public void testSubstringsBetween_noMatches() {
        assertNull(StringUtils.substringsBetween("abc", "[", "]"));
    }

    @Test
    public void testSubstringsBetween_singleMatch() {
        String[] expected = {"a"};
        assertArrayEquals(expected, StringUtils.substringsBetween("[a]", "[", "]"));
    }

    @Test
    public void testSubstringsBetween_multipleMatches() {
        String[] expected = {"a", "b", "c"};
        assertArrayEquals(expected, StringUtils.substringsBetween("[a][b][c]", "[", "]"));
    }

    @Test
    public void testSubstringsBetween_overlappingMatches() {
        String[] expected = {"ab", "bc"};
        assertArrayEquals(expected, StringUtils.substringsBetween("xabcybcx", "ab", "bc"));
    }

    // Test methods for split, splitByWholeSeparator, splitByWholeSeparatorPreserveAllTokens, etc.
    @Test
    public void testSplit_nullString() {
        assertNull(StringUtils.split(null));
    }

    @Test
    public void testSplit_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.split(""));
    }

    @Test
    public void testSplit_whitespaceString() {
        String[] expected = {"abc", "def"};
        assertArrayEquals(expected, StringUtils.split("abc def"));
    }

    @Test
    public void testSplit_multipleWhitespace() {
        String[] expected = {"abc", "def"};
        assertArrayEquals(expected, StringUtils.split("abc  def"));
    }

    @Test
    public void testSplit_leadingAndTrailingWhitespace() {
        String[] expected = {"abc"};
        assertArrayEquals(expected, StringUtils.split(" abc "));
    }
    
    @Test
    public void testSplit_char_nullString() {
        assertNull(StringUtils.split(null, '.'));
    }

    @Test
    public void testSplit_char_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.split("", '.'));
    }

    @Test
    public void testSplit_char_regular() {
        String[] expected = {"a", "b", "c"};
        assertArrayEquals(expected, StringUtils.split("a.b.c", '.'));
    }

    @Test
    public void testSplit_char_adjacentSeparators() {
        String[] expected = {"a", "b", "c"};
        assertArrayEquals(expected, StringUtils.split("a..b.c", '.'));
    }

    @Test
    public void testSplit_char_noSeparator() {
        String[] expected = {"a:b:c"};
        assertArrayEquals(expected, StringUtils.split("a:b:c", '.'));
    }

    @Test
    public void testSplit_char_spaceSeparator() {
        String[] expected = {"a", "b", "c"};
        assertArrayEquals(expected, StringUtils.split("a b c", ' '));
    }
    
    @Test
    public void testSplit_string_nullString() {
        assertNull(StringUtils.split(null, "."));
    }

    @Test
    public void testSplit_string_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.split("", "."));
    }

    @Test
    public void testSplit_string_nullSeparator() {
        String[] expected = {"abc", "def"};
        assertArrayEquals(expected, StringUtils.split("abc def", null));
    }

    @Test
    public void testSplit_string_spaceSeparator() {
        String[] expected = {"abc", "def"};
        assertArrayEquals(expected, StringUtils.split("abc def", " "));
    }

    @Test
    public void testSplit_string_multipleSeparators() {
        String[] expected = {"abc", "def"};
        assertArrayEquals(expected, StringUtils.split("abc  def", " "));
    }

    @Test
    public void testSplit_string_multiCharSeparator() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.split("ab:cd:ef", ":"));
    }
    
    @Test
    public void testSplit_stringMax_nullString() {
        assertNull(StringUtils.split(null, ".", 0));
    }

    @Test
    public void testSplit_stringMax_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.split("", ".", 0));
    }

    @Test
    public void testSplit_stringMax_zeroMax() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.split("ab:cd:ef", ":", 0));
    }
    
    @Test
    public void testSplit_stringMax_limitReached() {
        String[] expected = {"ab", "cd:ef"};
        assertArrayEquals(expected, StringUtils.split("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplit_stringMax_limitExceeded() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.split("ab:cd:ef", ":", 5));
    }

    @Test
    public void testSplit_stringMax_nullSeparatorZeroMax() {
        String[] expected = {"ab", "de", "fg"};
        assertArrayEquals(expected, StringUtils.split("ab de fg", null, 0));
    }

    @Test
    public void testSplit_stringMax_nullSeparatorMultipleWhitespaceZeroMax() {
        String[] expected = {"ab", "de", "fg"};
        assertArrayEquals(expected, StringUtils.split("ab   de fg", null, 0));
    }

    @Test
    public void testSplit_stringMax_nullSeparatorLimitReached() {
        String[] expected = {"ab", "  de fg"};
        assertArrayEquals(expected, StringUtils.split("ab   de fg", null, 2));
    }

    @Test
    public void testSplit_stringMax_nullSeparatorLimitExceeded() {
        String[] expected = {"ab", "", " de fg"};
        assertArrayEquals(expected, StringUtils.split("ab   de fg", null, 3));
    }
    
    @Test
    public void testSplitByWholeSeparator_nullString() {
        assertNull(StringUtils.splitByWholeSeparator(null, "."));
    }

    @Test
    public void testSplitByWholeSeparator_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("", "."));
    }

    @Test
    public void testSplitByWholeSeparator_nullSeparator() {
        String[] expected = {"ab", "de", "fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab de fg", null));
    }

    @Test
    public void testSplitByWholeSeparator_multipleWhitespace() {
        String[] expected = {"ab", "de", "fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab   de fg", null));
    }

    @Test
    public void testSplitByWholeSeparator_regularSeparator() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparator_multiCharSeparator() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-"));
    }
    
    @Test
    public void testSplitByWholeSeparator_stringMax_nullString() {
        assertNull(StringUtils.splitByWholeSeparator(null, ".", 0));
    }

    @Test
    public void testSplitByWholeSeparator_stringMax_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("", ".", 0));
    }

    @Test
    public void testSplitByWholeSeparator_stringMax_zeroMax() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 0));
    }

    @Test
    public void testSplitByWholeSeparator_stringMax_limitReached() {
        String[] expected = {"ab", "cd:ef"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitByWholeSeparator_stringMax_limitExceeded() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 5));
    }

    @Test
    public void testSplitByWholeSeparator_stringMax_nullSeparatorZeroMax() {
        String[] expected = {"ab", "de", "fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab de fg", null, 0));
    }

    @Test
    public void testSplitByWholeSeparator_stringMax_nullSeparatorMultipleWhitespaceZeroMax() {
        String[] expected = {"ab", "de", "fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab   de fg", null, 0));
    }

    @Test
    public void testSplitByWholeSeparator_stringMax_nullSeparatorLimitReached() {
        String[] expected = {"ab", "  de fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab   de fg", null, 2));
    }

    @Test
    public void testSplitByWholeSeparator_stringMax_nullSeparatorLimitExceeded() {
        String[] expected = {"ab", "", " de fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparator("ab   de fg", null, 3));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_nullString() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, "."));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("", "."));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_nullSeparator() {
        String[] expected = {"ab", "de", "fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_multipleWhitespace() {
        String[] expected = {"ab", "", "", "de", "fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_regularSeparator() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_multiCharSeparator() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-"));
    }
    
    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_stringMax_nullString() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, ".", 0));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_stringMax_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("", ".", 0));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_stringMax_zeroMax() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":", 0));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_stringMax_limitReached() {
        String[] expected = {"ab", "cd:ef"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_stringMax_limitExceeded() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":", 5));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_stringMax_nullSeparatorZeroMax() {
        String[] expected = {"ab", "de", "fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null, 0));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_stringMax_nullSeparatorMultipleWhitespaceZeroMax() {
        String[] expected = {"ab", "de", "fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null, 0));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_stringMax_nullSeparatorLimitReached() {
        String[] expected = {"ab", "  de fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null, 2));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_stringMax_nullSeparatorLimitExceeded() {
        String[] expected = {"ab", "", " de fg"};
        assertArrayEquals(expected, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null, 3));
    }

    @Test
    public void testSplitPreserveAllTokens_nullString() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
    }

    @Test
    public void testSplitPreserveAllTokens_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens(""));
    }

    @Test
    public void testSplitPreserveAllTokens_whitespaceString() {
        String[] expected = {"abc", "def"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("abc def"));
    }

    @Test
    public void testSplitPreserveAllTokens_multipleWhitespace() {
        String[] expected = {"abc", "", "def"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("abc  def"));
    }

    @Test
    public void testSplitPreserveAllTokens_leadingAndTrailingWhitespace() {
        String[] expected = {"", "abc", ""};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens(" abc "));
    }
    
    @Test
    public void testSplitPreserveAllTokens_char_nullString() {
        assertNull(StringUtils.splitPreserveAllTokens(null, '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_char_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_char_regular() {
        String[] expected = {"a", "b", "c"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("a.b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_char_adjacentSeparators() {
        String[] expected = {"a", "", "b", "c"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("a..b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_char_noSeparator() {
        String[] expected = {"a:b:c"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("a:b:c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_char_spaceSeparator() {
        String[] expected = {"a", "b", "c"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("a b c", ' '));
    }
    
    @Test
    public void testSplitPreserveAllTokens_char_trailingSeparator() {
        String[] expected = {"a", "b", "c", ""};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("a.b.c.", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_char_multipleTrailingSeparators() {
        String[] expected = {"a", "b", "c", "", ""};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("a.b.c..", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_char_multipleInternalSeparators() {
        String[] expected = {"a", "", "b", "c"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("a..b.c", '.'));
    }
    
    @Test
    public void testSplitPreserveAllTokens_string_nullString() {
        assertNull(StringUtils.splitPreserveAllTokens(null, "."));
    }

    @Test
    public void testSplitPreserveAllTokens_string_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("", "."));
    }

    @Test
    public void testSplitPreserveAllTokens_string_nullSeparator() {
        String[] expected = {"abc", "def"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("abc def", null));
    }

    @Test
    public void testSplitPreserveAllTokens_string_spaceSeparator() {
        String[] expected = {"abc", "def"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("abc def", " "));
    }

    @Test
    public void testSplitPreserveAllTokens_string_multipleSeparators() {
        String[] expected = {"abc", "", "def"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("abc  def", " "));
    }

    @Test
    public void testSplitPreserveAllTokens_string_multiCharSeparator() {
        String[] expected = {"ab", "cd", "ef"};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitPreserveAllTokens_string_trailingSeparator() {
        String[] expected = {"ab", "cd", "ef", ""};
        assertArrayEquals(expected, StringUtils.splitPreserveAllTokens("ab:cd:ef:", ":"));
    }

    @Test
    public void testSplitByCharacterType_nullString() {
        assertNull(StringUtils.splitByCharacterType(null));
    }

    @Test
    public void testSplitByCharacterType_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.splitByCharacterType(""));
    }

    @Test
    public void testSplitByCharacterType_simple() {
        String[] expected = {"ab", " ", "de", " ", "fg"};
        assertArrayEquals(expected, StringUtils.splitByCharacterType("ab de fg"));
    }

    @Test
    public void testSplitByCharacterType_multipleSpaces() {
        String[] expected = {"ab", "   ", "de", " ", "fg"};
        assertArrayEquals(expected, StringUtils.splitByCharacterType("ab   de fg"));
    }

    @Test
    public void testSplitByCharacterType_symbols() {
        String[] expected = {"ab", ":", "cd", ":", "ef"};
        assertArrayEquals(expected, StringUtils.splitByCharacterType("ab:cd:ef"));
    }

    @Test
    public void testSplitByCharacterType_numberAndLetters() {
        String[] expected = {"number", "5"};
        assertArrayEquals(expected, StringUtils.splitByCharacterType("number5"));
    }

    @Test
    public void testSplitByCharacterType_camelCaseStart() {
        String[] expected = {"foo", "B", "ar"};
        assertArrayEquals(expected, StringUtils.splitByCharacterType("fooBar"));
    }

    @Test
    public void testSplitByCharacterType_camelCaseWithNumbers() {
        String[] expected = {"foo", "200", "B", "ar"};
        assertArrayEquals(expected, StringUtils.splitByCharacterType("foo200Bar"));
    }

    @Test
    public void testSplitByCharacterType_allUppercase() {
        String[] expected = {"ASFR", "ules"};
        assertArrayEquals(expected, StringUtils.splitByCharacterType("ASFRules"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_nullString() {
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_emptyString() {
        String[] expected = {};
        assertArrayEquals(expected, StringUtils.splitByCharacterTypeCamelCase(""));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_simple() {
        String[] expected = {"ab", " ", "de", " ", "fg"};
        assertArrayEquals(expected, StringUtils.splitByCharacterTypeCamelCase("ab de fg"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_multipleSpaces() {
        String[] expected = {"ab", "   ", "de", " ", "fg"};
        assertArrayEquals(expected, StringUtils.splitByCharacterTypeCamelCase("ab   de fg"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_symbols() {
        String[] expected = {"ab", ":", "cd", ":", "ef"};
        assertArrayEquals(expected, StringUtils.splitByCharacterTypeCamelCase("ab:cd:ef"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_numberAndLetters() {
        String[] expected = {"number", "5"};
        assertArrayEquals(expected, StringUtils.splitByCharacterTypeCamelCase("number5"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_camelCaseStart() {
        String[] expected = {"foo", "Bar"};
        assertArrayEquals(expected, StringUtils.splitByCharacterTypeCamelCase("fooBar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_camelCaseWithNumbers() {
        String[] expected = {"foo", "200", "Bar"};
        assertArrayEquals(expected, StringUtils.splitByCharacterTypeCamelCase("foo200Bar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_allUppercase() {
        String[] expected = {"ASF", "Rules"};
        assertArrayEquals(expected, StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    // Test methods for join
    @Test
    public void testJoin_objectArray_nullArray() {
        assertNull(StringUtils.join((Object[]) null));
    }

    @Test
    public void testJoin_objectArray_emptyArray() {
        assertEquals("", StringUtils.join(new Object[]{}));
    }

    @Test
    public void testJoin_objectArray_nullElements() {
        assertEquals("", StringUtils.join(new Object[]{null}));
        assertEquals("", StringUtils.join(new Object[]{null, ""}));
    }

    @Test
    public void testJoin_objectArray_regular() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}));
        assertEquals("a", StringUtils.join(new Object[]{null, "", "a"}));
    }
    
    @Test
    public void testJoin_objectArrayChar_nullArray() {
        assertNull(StringUtils.join((Object[]) null, ';'));
    }

    @Test
    public void testJoin_objectArrayChar_emptyArray() {
        assertEquals("", StringUtils.join(new Object[]{}, ';'));
    }

    @Test
    public void testJoin_objectArrayChar_regular() {
        assertEquals("a;b;c", StringUtils.join(new Object[]{"a", "b", "c"}, ';'));
    }

    @Test
    public void testJoin_objectArrayChar_withNulls() {
        assertEquals(";;a", StringUtils.join(new Object[]{null, "", "a"}, ';'));
    }
    
    @Test
    public void testJoin_objectArrayCharIntInt_nullArray() {
        assertNull(StringUtils.join((Object[]) null, ';', 0, 0));
    }

    @Test
    public void testJoin_objectArrayCharIntInt_emptyRange() {
        assertEquals("", StringUtils.join(new Object[]{"a", "b"}, ';', 1, 1));
        assertEquals("", StringUtils.join(new Object[]{"a", "b"}, ';', 0, 0));
    }

    @Test
    public void testJoin_objectArrayCharIntInt_regular() {
        assertEquals("a;b", StringUtils.join(new Object[]{"a", "b", "c"}, ';', 0, 2));
        assertEquals("b;c", StringUtils.join(new Object[]{"a", "b", "c"}, ';', 1, 3));
    }

    @Test
    public void testJoin_objectArrayCharIntInt_withNulls() {
        assertEquals(";;a", StringUtils.join(new Object[]{null, "", "a", "b"}, ';', 0, 3));
    }
    
    @Test
    public void testJoin_stringSeparator_nullArray() {
        assertNull(StringUtils.join((Object[]) null, "--"));
    }

    @Test
    public void testJoin_stringSeparator_emptyArray() {
        assertEquals("", StringUtils.join(new Object[]{}, "--"));
    }

    @Test
    public void testJoin_stringSeparator_regular() {
        assertEquals("a--b--c", StringUtils.join(new Object[]{"a", "b", "c"}, "--"));
    }

    @Test
    public void testJoin_stringSeparator_nullSeparator() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, null));
    }

    @Test
    public void testJoin_stringSeparator_emptySeparator() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, ""));
    }

    @Test
    public void testJoin_stringSeparator_withNulls() {
        assertEquals(",,a", StringUtils.join(new Object[]{null, "", "a"}, ','));
    }
    
    @Test
    public void testJoin_stringSeparatorIntInt_nullArray() {
        assertNull(StringUtils.join((Object[]) null, "--", 0, 0));
    }

    @Test
    public void testJoin_stringSeparatorIntInt_emptyRange() {
        assertEquals("", StringUtils.join(new Object[]{"a", "b"}, "--", 1, 1));
        assertEquals("", StringUtils.join(new Object[]{"a", "b"}, "--", 0, 0));
    }

    @Test
    public void testJoin_stringSeparatorIntInt_regular() {
        assertEquals("a--b", StringUtils.join(new Object[]{"a", "b", "c"}, "--", 0, 2));
        assertEquals("b--c", StringUtils.join(new Object[]{"a", "b", "c"}, "--", 1, 3));
    }

    @Test
    public void testJoin_stringSeparatorIntInt_nullSeparator() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, null, 0, 3));
    }

    @Test
    public void testJoin_stringSeparatorIntInt_emptySeparator() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, "", 0, 3));
    }

    @Test
    public void testJoin_stringSeparatorIntInt_withNulls() {
        assertEquals(",,a", StringUtils.join(new Object[]{null, "", "a", "b"}, ',', 0, 3));
    }

    @Test
    public void testJoin_iteratorChar_nullIterator() {
        assertNull(StringUtils.join((Iterator<?>) null, ';'));
    }

    @Test
    public void testJoin_iteratorChar_emptyIterator() {
        assertEquals("", StringUtils.join(new ArrayList<String>().iterator(), ';'));
    }

    @Test
    public void testJoin_iteratorChar_singleElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        assertEquals("a", StringUtils.join(list.iterator(), ';'));
    }

    @Test
    public void testJoin_iteratorChar_multipleElements() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a;b;c", StringUtils.join(list.iterator(), ';'));
    }

    @Test
    public void testJoin_iteratorChar_withNulls() {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("");
        list.add("a");
        assertEquals(";;a", StringUtils.join(list.iterator(), ';'));
    }
    
    @Test
    public void testJoin_iteratorString_nullIterator() {
        assertNull(StringUtils.join((Iterator<?>) null, "--"));
    }

    @Test
    public void testJoin_iteratorString_emptyIterator() {
        assertEquals("", StringUtils.join(new ArrayList<String>().iterator(), "--"));
    }

    @Test
    public void testJoin_iteratorString_singleElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        assertEquals("a", StringUtils.join(list.iterator(), "--"));
    }

    @Test
    public void testJoin_iteratorString_multipleElements() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a--b--c", StringUtils.join(list.iterator(), "--"));
    }

    @Test
    public void testJoin_iteratorString_nullSeparator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("abc", StringUtils.join(list.iterator(), null));
    }

    @Test
    public void testJoin_iteratorString_emptySeparator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("abc", StringUtils.join(list.iterator(), ""));
    }

    @Test
    public void testJoin_iteratorString_withNulls() {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("");
        list.add("a");
        assertEquals("--a", StringUtils.join(list.iterator(), "--"));
    }

    @Test
    public void testJoin_collectionChar_nullCollection() {
        assertNull(StringUtils.join((Collection<?>) null, ';'));
    }

    @Test
    public void testJoin_collectionChar_emptyCollection() {
        assertEquals("", StringUtils.join(new ArrayList<String>(), ';'));
    }

    @Test
    public void testJoin_collectionChar_singleElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        assertEquals("a", StringUtils.join(list, ';'));
    }

    @Test
    public void testJoin_collectionChar_multipleElements() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a;b;c", StringUtils.join(list, ';'));
    }

    @Test
    public void testJoin_collectionChar_withNulls() {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("");
        list.add("a");
        assertEquals(";;a", StringUtils.join(list, ';'));
    }
    
    @Test
    public void testJoin_collectionString_nullCollection() {
        assertNull(StringUtils.join((Collection<?>) null, "--"));
    }

    @Test
    public void testJoin_collectionString_emptyCollection() {
        assertEquals("", StringUtils.join(new ArrayList<String>(), "--"));
    }

    @Test
    public void testJoin_collectionString_singleElement() {
        List<String> list = new ArrayList<>();
        list.add("a");
        assertEquals("a", StringUtils.join(list, "--"));
    }

    @Test
    public void testJoin_collectionString_multipleElements() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a--b--c", StringUtils.join(list, "--"));
    }

    @Test
    public void testJoin_collectionString_nullSeparator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("abc", StringUtils.join(list, null));
    }

    @Test
    public void testJoin_collectionString_emptySeparator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("abc", StringUtils.join(list, ""));
    }

    @Test
    public void testJoin_collectionString_withNulls() {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("");
        list.add("a");
        assertEquals("--a", StringUtils.join(list, "--"));
    }

    // Test methods for deleteWhitespace
    @Test
    public void testDeleteWhitespace_nullString() {
        assertNull(StringUtils.deleteWhitespace(null));
    }

    @Test
    public void testDeleteWhitespace_emptyString() {
        assertEquals("", StringUtils.deleteWhitespace(""));
    }

    @Test
    public void testDeleteWhitespace_noWhitespace() {
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
    }

    @Test
    public void testDeleteWhitespace_onlyWhitespace() {
        assertEquals("", StringUtils.deleteWhitespace("   \t\n\r"));
    }

    @Test
    public void testDeleteWhitespace_mixed() {
        assertEquals("abc", StringUtils.deleteWhitespace("   ab\tc\n  "));
    }

    // Test methods for remove, removeStart, removeEnd, removeStartIgnoreCase, removeEndIgnoreCase
    @Test
    public void testRemoveStart_nullString() {
        assertNull(StringUtils.removeStart(null, "www."));
    }

    @Test
    public void testRemoveStart_emptyString() {
        assertEquals("", StringUtils.removeStart("", "www."));
    }

    @Test
    public void testRemoveStart_nullRemove() {
        assertEquals("domain.com", StringUtils.removeStart("domain.com", null));
    }

    @Test
    public void testRemoveStart_emptyRemove() {
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }

    @Test
    public void testRemoveStart_matchFound() {
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
    }

    @Test
    public void testRemoveStart_noMatch() {
        assertEquals("domain.com", StringUtils.removeStart("domain.com", "www."));
    }

    @Test
    public void testRemoveStart_partialMatch() {
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));
    }
    
    @Test
    public void testRemoveStartIgnoreCase_nullString() {
        assertNull(StringUtils.removeStartIgnoreCase(null, "www."));
    }

    @Test
    public void testRemoveStartIgnoreCase_emptyString() {
        assertEquals("", StringUtils.removeStartIgnoreCase("", "www."));
    }

    @Test
    public void testRemoveStartIgnoreCase_nullRemove() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("domain.com", null));
    }

    @Test
    public void testRemoveStartIgnoreCase_emptyRemove() {
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", ""));
    }

    @Test
    public void testRemoveStartIgnoreCase_matchFoundIgnoreCase() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."));
    }

    @Test
    public void testRemoveStartIgnoreCase_matchFoundCaseSensitive() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "www."));
    }

    @Test
    public void testRemoveStartIgnoreCase_noMatch() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("domain.com", "www."));
    }

    @Test
    public void testRemoveStartIgnoreCase_partialMatch() {
        assertEquals("www.domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveEnd_nullString() {
        assertNull(StringUtils.removeEnd(null, ".com"));
    }

    @Test
    public void testRemoveEnd_emptyString() {
        assertEquals("", StringUtils.removeEnd("", ".com"));
    }

    @Test
    public void testRemoveEnd_nullRemove() {
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", null));
    }

    @Test
    public void testRemoveEnd_emptyRemove() {
        assertEquals("abc", StringUtils.removeEnd("abc", ""));
    }

    @Test
    public void testRemoveEnd_matchFound() {
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
    }

    @Test
    public void testRemoveEnd_noMatch() {
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", ".org"));
    }

    @Test
    public void testRemoveEnd_partialMatch() {
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveEnd_endsInSeparatorButNotTheOneToRemove() {
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", ".com."));
    }
    
    @Test
    public void testRemoveEndIgnoreCase_nullString() {
        assertNull(StringUtils.removeEndIgnoreCase(null, ".com"));
    }

    @Test
    public void testRemoveEndIgnoreCase_emptyString() {
        assertEquals("", StringUtils.removeEndIgnoreCase("", ".com"));
    }

    @Test
    public void testRemoveEndIgnoreCase_nullRemove() {
        assertEquals("www.domain.com", StringUtils.removeEndIgnoreCase("www.domain.com", null));
    }

    @Test
    public void testRemoveEndIgnoreCase_emptyRemove() {
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", ""));
    }

    @Test
    public void testRemoveEndIgnoreCase_matchFoundIgnoreCase() {
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"));
    }

    @Test
    public void testRemoveEndIgnoreCase_matchFoundCaseSensitive() {
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.com", ".com"));
    }

    @Test
    public void testRemoveEndIgnoreCase_noMatch() {
        assertEquals("www.domain.com", StringUtils.removeEndIgnoreCase("www.domain.com", ".org"));
    }

    @Test
    public void testRemoveEndIgnoreCase_partialMatch() {
        assertEquals("www.domain.com", StringUtils.removeEndIgnoreCase("www.domain.com", "domain"));
    }
    
    @Test
    public void testRemove_nullString() {
        assertNull(StringUtils.remove(null, "ue"));
    }

    @Test
    public void testRemove_emptyString() {
        assertEquals("", StringUtils.remove("", "ue"));
    }

    @Test
    public void testRemove_nullRemove() {
        assertEquals("queued", StringUtils.remove("queued", null));
    }

    @Test
    public void testRemove_emptyRemove() {
        assertEquals("queued", StringUtils.remove("queued", ""));
    }

    @Test
    public void testRemove_substringFound() {
        assertEquals("qd", StringUtils.remove("queued", "ue"));
    }

    @Test
    public void testRemove_substringNotFound() {
        assertEquals("queued", StringUtils.remove("queued", "zz"));
    }

    @Test
    public void testRemove_multipleOccurrences() {
        assertEquals("q", StringUtils.remove("ueueue", "ue"));
    }
    
    @Test
    public void testRemove_char_nullString() {
        assertNull(StringUtils.remove(null, 'u'));
    }

    @Test
    public void testRemove_char_emptyString() {
        assertEquals("", StringUtils.remove("", 'u'));
    }

    @Test
    public void testRemove_char_charFound() {
        assertEquals("qeed", StringUtils.remove("queued", 'u'));
    }

    @Test
    public void testRemove_char_charNotFound() {
        assertEquals("queued", StringUtils.remove("queued", 'z'));
    }

    @Test
    public void testRemove_char_multipleOccurrences() {
        assertEquals("q", StringUtils.remove("uuuuuu", 'u'));
    }

    // Test methods for replace, replaceOnce, replaceEach, replaceEachRepeatedly
    @Test
    public void testReplaceOnce_nullText() {
        assertNull(StringUtils.replaceOnce(null, "a", "z"));
    }

    @Test
    public void testReplaceOnce_emptyText() {
        assertEquals("", StringUtils.replaceOnce("", "a", "z"));
    }

    @Test
    public void testReplaceOnce_nullSearchString() {
        assertEquals("any", StringUtils.replaceOnce("any", null, "z"));
    }

    @Test
    public void testReplaceOnce_nullReplacement() {
        assertEquals("aba", StringUtils.replaceOnce("aba", "a", null));
    }

    @Test
    public void testReplaceOnce_emptySearchString() {
        assertEquals("any", StringUtils.replaceOnce("any", "", "z"));
    }

    @Test
    public void testReplaceOnce_noMatch() {
        assertEquals("aba", StringUtils.replaceOnce("aba", "z", "x"));
    }

    @Test
    public void testReplaceOnce_replaceFirst() {
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
    }

    @Test
    public void testReplaceOnce_replaceEmpty() {
        assertEquals("ba", StringUtils.replaceOnce("aba", "a", ""));
    }

    @Test
    public void testReplace_nullText() {
        assertNull(StringUtils.replace(null, "a", "z"));
    }

    @Test
    public void testReplace_emptyText() {
        assertEquals("", StringUtils.replace("", "a", "z"));
    }

    @Test
    public void testReplace_nullSearchString() {
        assertEquals("any", StringUtils.replace("any", null, "z"));
    }

    @Test
    public void testReplace_nullReplacement() {
        assertEquals("aba", StringUtils.replace("aba", "a", null));
    }

    @Test
    public void testReplace_emptySearchString() {
        assertEquals("any", StringUtils.replace("any", "", "z"));
    }

    @Test
    public void testReplace_noMatch() {
        assertEquals("aba", StringUtils.replace("aba", "z", "x"));
    }

    @Test
    public void testReplace_replaceFirst() {
        assertEquals("zba", StringUtils.replace("aba", "a", "z"));
    }

    @Test
    public void testReplace_replaceEmpty() {
        assertEquals("b", StringUtils.replace("aba", "a", ""));
    }

    @Test
    public void testReplace_replaceAll() {
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
    }

    @Test
    public void testReplace_maxZero() {
        assertEquals("abaa", StringUtils.replace("abaa", "a", "z", 0));
    }

    @Test
    public void testReplace_maxOne() {
        assertEquals("zbaa", StringUtils.replace("abaa", "a", "z", 1));
    }

    @Test
    public void testReplace_maxTwo() {
        assertEquals("zbza", StringUtils.replace("abaa", "a", "z", 2));
    }

    @Test
    public void testReplace_maxNegative() {
        assertEquals("zbzz", StringUtils.replace("abaa", "a", "z", -1));
    }
    
    @Test
    public void testReplace_maxLimitedReplacement() {
        assertEquals("abaa", StringUtils.replace("abaa", "a", null, -1));
    }

    @Test
    public void testReplace_maxLimitedEmptyReplacement() {
        assertEquals("b", StringUtils.replace("abaa", "a", "", -1));
    }
    
    @Test
    public void testReplaceEach_nullText() {
        assertNull(StringUtils.replaceEach(null, new String[]{"a"}, new String[]{"b"}));
    }

    @Test
    public void testReplaceEach_emptyText() {
        assertEquals("", StringUtils.replaceEach("", new String[]{"a"}, new String[]{"b"}));
    }

    @Test
    public void testReplaceEach_nullSearchList() {
        assertEquals("aba", StringUtils.replaceEach("aba", null, new String[]{"b"}));
    }

    @Test
    public void testReplaceEach_emptySearchList() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[0], new String[]{"b"}));
    }

    @Test
    public void testReplaceEach_nullReplacementList() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{"a"}, null));
    }

    @Test
    public void testReplaceEach_emptyReplacementList() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{"a"}, new String[0]));
    }

    @Test
    public void testReplaceEach_searchNotFound() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{"z"}, new String[]{"x"}));
    }

    @Test
    public void testReplaceEach_singleReplacement() {
        assertEquals("bba", StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{"b"}));
    }

    @Test
    public void testReplaceEach_multipleReplacements() {
        assertEquals("wcte", StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}));
    }
    
    @Test
    public void testReplaceEachRepeatedly_nullText() {
        assertNull(StringUtils.replaceEachRepeatedly(null, new String[]{"a"}, new String[]{"b"}));
    }

    @Test
    public void testReplaceEachRepeatedly_emptyText() {
        assertEquals("", StringUtils.replaceEachRepeatedly("", new String[]{"a"}, new String[]{"b"}));
    }

    @Test
    public void testReplaceEachRepeatedly_searchNotFound() {
        assertEquals("aba", StringUtils.replaceEachRepeatedly("aba", new String[]{"z"}, new String[]{"x"}));
    }

    @Test
    public void testReplaceEachRepeatedly_singleReplacement() {
        assertEquals("bbb", StringUtils.replaceEachRepeatedly("aba", new String[]{"a"}, new String[]{"b"}));
    }

    @Test
    public void testReplaceEachRepeatedly_multipleReplacementsNonRepeating() {
        assertEquals("wcte", StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}, false));
    }
    
    @Test
    public void testReplaceEachRepeatedly_multipleReplacementsRepeating() {
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, true));
    }

    // Test methods for replaceChars
    @Test
    public void testReplaceChars_nullString() {
        assertNull(StringUtils.replaceChars(null, 'b', 'y'));
    }

    @Test
    public void testReplaceChars_emptyString() {
        assertEquals("", StringUtils.replaceChars("", 'b', 'y'));
    }

    @Test
    public void testReplaceChars_charFound() {
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
    }

    @Test
    public void testReplaceChars_charNotFound() {
        assertEquals("abcba", StringUtils.replaceChars("abcba", 'z', 'y'));
    }

    @Test
    public void testReplaceChars_string_nullString() {
        assertNull(StringUtils.replaceChars(null, "bc", "yz"));
    }

    @Test
    public void testReplaceChars_string_emptyString() {
        assertEquals("", StringUtils.replaceChars("", "bc", "yz"));
    }

    @Test
    public void testReplaceChars_string_nullSearchChars() {
        assertEquals("abc", StringUtils.replaceChars("abc", null, "yz"));
    }

    @Test
    public void testReplaceChars_string_emptySearchChars() {
        assertEquals("abc", StringUtils.replaceChars("abc", "", "yz"));
    }

    @Test
    public void testReplaceChars_string_nullReplaceChars() {
        assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
    }

    @Test
    public void testReplaceChars_string_emptyReplaceChars() {
        assertEquals("ac", StringUtils.replaceChars("abc", "b", ""));
    }

    @Test
    public void testReplaceChars_string_equalLength() {
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
    }

    @Test
    public void testReplaceChars_string_shorterReplaceChars() {
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
    }

    @Test
    public void testReplaceChars_string_longerReplaceChars() {
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yzx"));
    }
    
    // Test methods for overlay
    @Test
    public void testOverlay_nullString() {
        assertNull(StringUtils.overlay(null, "zzzz", 2, 4));
    }

    @Test
    public void testOverlay_nullOverlay() {
        assertEquals("abef", StringUtils.overlay("abcdef", null, 2, 4));
    }

    @Test
    public void testOverlay_emptyOverlay() {
        assertEquals("abef", StringUtils.overlay("abcdef", "", 2, 4));
    }

    @Test
    public void testOverlay_startGreaterThanEnd() {
        assertEquals("abef", StringUtils.overlay("abcdef", "", 4, 2));
    }

    @Test
    public void testOverlay_regular() {
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2));
    }

    @Test
    public void testOverlay_startNegative() {
        assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4));
    }

    @Test
    public void testOverlay_endBeyondLength() {
        assertEquals("abzzzz", StringUtils.overlay("abcdef", "zzzz", 2, 8));
    }
    
    @Test
    public void testOverlay_startNegativeEndNegative() {
        assertEquals("zzzzabcdef", StringUtils.overlay("abcdef", "zzzz", -2, -3));
    }

    @Test
    public void testOverlay_startAndEndBeyondLength() {
        assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 8, 10));
    }
    
    // Test methods for chomp, chomp(String, String)
    @Test
    public void testChomp_nullString() {
        assertNull(StringUtils.chomp(null));
    }

    @Test
    public void testChomp_emptyString() {
        assertEquals("", StringUtils.chomp(""));
    }

    @Test
    public void testChomp_singleCharNewlineCR() {
        assertEquals("", StringUtils.chomp("\r"));
    }
    
    @Test
    public void testChomp_singleCharNewlineLF() {
        assertEquals("", StringUtils.chomp("\n"));
    }
    
    @Test
    public void testChomp_singleCharNotNewline() {
        assertEquals("a", StringUtils.chomp("a"));
    }
    
    @Test
    public void testChomp_trailingCR() {
        assertEquals("abc ", StringUtils.chomp("abc \r"));
    }

    @Test
    public void testChomp_trailingLF() {
        assertEquals("abc", StringUtils.chomp("abc\n"));
    }

    @Test
    public void testChomp_trailingCRLF() {
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
    }

    @Test
    public void testChomp_trailingMultipleNewlines() {
        assertEquals("abc\r\n", StringUtils.chomp("abc\r\n\r\n"));
    }

    @Test
    public void testChomp_trailingLFCR() {
        assertEquals("abc\n", StringUtils.chomp("abc\n\r"));
    }

    @Test
    public void testChomp_trailingNewlinesMixed() {
        assertEquals("abc\n\rabc", StringUtils.chomp("abc\n\rabc"));
    }

    @Test
    public void testChomp_trailingCRLFonly() {
        assertEquals("", StringUtils.chomp("\r\n"));
    }
    
    @Test
    public void testChomp_separator_nullString() {
        assertNull(StringUtils.chomp(null, "bar"));
    }

    @Test
    public void testChomp_separator_emptyString() {
        assertEquals("", StringUtils.chomp("", "bar"));
    }

    @Test
    public void testChomp_separator_nullSeparator() {
        assertEquals("foo", StringUtils.chomp("foo", null));
    }

    @Test
    public void testChomp_separator_emptySeparator() {
        assertEquals("foo", StringUtils.chomp("foo", ""));
    }

    @Test
    public void testChomp_separator_matchFound() {
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
    }

    @Test
    public void testChomp_separator_noMatch() {
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
    }

    @Test
    public void testChomp_separator_separatorIsString() {
        assertEquals("", StringUtils.chomp("foo", "foo"));
    }

    @Test
    public void testChomp_separator_trailingSpaceButNotSeparator() {
        assertEquals("foo ", StringUtils.chomp("foo ", "foo"));
    }

    @Test
    public void testChomp_separator_separatorLongerThanString() {
        assertEquals("foo", StringUtils.chomp("foo", "foooo"));
    }

    // Test methods for chop
    @Test
    public void testChop_nullString() {
        assertNull(StringUtils.chop(null));
    }

    @Test
    public void testChop_emptyString() {
        assertEquals("", StringUtils.chop(""));
    }

    @Test
    public void testChop_singleChar() {
        assertEquals("", StringUtils.chop("a"));
    }
    
    @Test
    public void testChop_singleCharCR() {
        assertEquals("", StringUtils.chop("\r"));
    }
    
    @Test
    public void testChop_singleCharLF() {
        assertEquals("", StringUtils.chop("\n"));
    }

    @Test
    public void testChop_trailingCR() {
        assertEquals("abc ", StringUtils.chop("abc \r"));
    }

    @Test
    public void testChop_trailingLF() {
        assertEquals("abc", StringUtils.chop("abc\n"));
    }

    @Test
    public void testChop_trailingCRLF() {
        assertEquals("abc", StringUtils.chop("abc\r\n"));
    }

    @Test
    public void testChop_regularString() {
        assertEquals("ab", StringUtils.chop("abc"));
    }

    @Test
    public void testChop_stringEndingInNewline() {
        assertEquals("abc\nab", StringUtils.chop("abc\nabc"));
    }

    @Test
    public void testChop_trailingCRLFonly() {
        assertEquals("", StringUtils.chop("\r\n"));
    }

    // Test methods for repeat
    @Test
    public void testRepeat_nullString() {
        assertNull(StringUtils.repeat(null, 2));
    }

    @Test
    public void testRepeat_zeroRepeat() {
        assertEquals("", StringUtils.repeat("", 0));
    }

    @Test
    public void testRepeat_emptyStringPositiveRepeat() {
        assertEquals("", StringUtils.repeat("", 2));
    }

    @Test
    public void testRepeat_positiveRepeat() {
        assertEquals("aaa", StringUtils.repeat("a", 3));
    }

    @Test
    public void testRepeat_stringAndRepeat() {
        assertEquals("abab", StringUtils.repeat("ab", 2));
    }

    @Test
    public void testRepeat_negativeRepeat() {
        assertEquals("", StringUtils.repeat("a", -2));
    }

    @Test
    public void testRepeat_repeatOne() {
        assertEquals("a", StringUtils.repeat("a", 1));
    }

    @Test
    public void testRepeat_emptyStringRepeatOne() {
        assertEquals("", StringUtils.repeat("", 1));
    }

    @Test
    public void testRepeat_withSeparator_nullString() {
        assertNull(StringUtils.repeat(null, "x", 2));
    }

    @Test
    public void testRepeat_withSeparator_nullSeparator() {
        assertEquals("aa", StringUtils.repeat("a", null, 2));
    }
    
    @Test
    public void testRepeat_withSeparator_zeroRepeat() {
        assertEquals("", StringUtils.repeat("", "x", 0));
        assertEquals("", StringUtils.repeat("", "", 0));
    }

    @Test
    public void testRepeat_withSeparator_emptyString() {
        assertEquals("xxx", StringUtils.repeat("", "x", 3));
    }

    @Test
    public void testRepeat_withSeparator_regular() {
        assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }
    
    @Test
    public void testRepeat_withSeparator_separatorLongerThanString() {
        assertEquals("abc--", StringUtils.repeat("abc", "--", 2));
    }

    @Test
    public void testRepeat_withSeparator_stringLongerThanSeparator() {
        assertEquals("abc--abc", StringUtils.repeat("abc", "--", 2));
    }

    // Test methods for rightPad, leftPad
    @Test
    public void testRightPad_nullString() {
        assertNull(StringUtils.rightPad(null, 3));
    }

    @Test
    public void testRightPad_sizeLessThanLength() {
        assertEquals("bat", StringUtils.rightPad("bat", 1));
        assertEquals("bat", StringUtils.rightPad("bat", -1));
    }

    @Test
    public void testRightPad_sizeEqualsLength() {
        assertEquals("bat", StringUtils.rightPad("bat", 3));
    }

    @Test
    public void testRightPad_sizeGreaterThanLength() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
    }

    @Test
    public void testRightPad_emptyString() {
        assertEquals("   ", StringUtils.rightPad("", 3));
    }
    
    @Test
    public void testRightPad_char_nullString() {
        assertNull(StringUtils.rightPad(null, 3, 'z'));
    }

    @Test
    public void testRightPad_char_sizeLessThanLength() {
        assertEquals("bat", StringUtils.rightPad("bat", 1, 'z'));
        assertEquals("bat", StringUtils.rightPad("bat", -1, 'z'));
    }

    @Test
    public void testRightPad_char_sizeEqualsLength() {
        assertEquals("bat", StringUtils.rightPad("bat", 3, 'z'));
    }

    @Test
    public void testRightPad_char_sizeGreaterThanLength() {
        assertEquals("batzz", StringUtils.rightPad("bat", 5, 'z'));
    }

    @Test
    public void testRightPad_char_emptyString() {
        assertEquals("zzz", StringUtils.rightPad("", 3, 'z'));
    }
    
    @Test
    public void testRightPad_string_nullString() {
        assertNull(StringUtils.rightPad(null, 3, "yz"));
    }

    @Test
    public void testRightPad_string_sizeLessThanLength() {
        assertEquals("bat", StringUtils.rightPad("bat", 1, "yz"));
        assertEquals("bat", StringUtils.rightPad("bat", -1, "yz"));
    }

    @Test
    public void testRightPad_string_sizeEqualsLength() {
        assertEquals("bat", StringUtils.rightPad("bat", 3, "yz"));
    }

    @Test
    public void testRightPad_string_sizeGreaterThanLength() {
        assertEquals("batyz", StringUtils.rightPad("bat", 5, "yz"));
    }

    @Test
    public void testRightPad_string_padStringRepeats() {
        assertEquals("batyzyzy", StringUtils.rightPad("bat", 8, "yz"));
    }

    @Test
    public void testRightPad_string_padStringTruncated() {
        assertEquals("baty", StringUtils.rightPad("bat", 4, "yz"));
    }
    
    @Test
    public void testRightPad_string_nullPadString() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, null));
    }

    @Test
    public void testRightPad_string_emptyPadString() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, ""));
    }

    @Test
    public void testLeftPad_nullString() {
        assertNull(StringUtils.leftPad(null, 3));
    }

    @Test
    public void testLeftPad_sizeLessThanLength() {
        assertEquals("bat", StringUtils.leftPad("bat", 1));
        assertEquals("bat", StringUtils.leftPad("bat", -1));
    }

    @Test
    public void testLeftPad_sizeEqualsLength() {
        assertEquals("bat", StringUtils.leftPad("bat", 3));
    }

    @Test
    public void testLeftPad_sizeGreaterThanLength() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5));
    }

    @Test
    public void testLeftPad_emptyString() {
        assertEquals("   ", StringUtils.leftPad("", 3));
    }
    
    @Test
    public void testLeftPad_char_nullString() {
        assertNull(StringUtils.leftPad(null, 3, 'z'));
    }

    @Test
    public void testLeftPad_char_sizeLessThanLength() {
        assertEquals("bat", StringUtils.leftPad("bat", 1, 'z'));
        assertEquals("bat", StringUtils.leftPad("bat", -1, 'z'));
    }

    @Test
    public void testLeftPad_char_sizeEqualsLength() {
        assertEquals("bat", StringUtils.leftPad("bat", 3, 'z'));
    }

    @Test
    public void testLeftPad_char_sizeGreaterThanLength() {
        assertEquals("zzbat", StringUtils.leftPad("bat", 5, 'z'));
    }

    @Test
    public void testLeftPad_char_emptyString() {
        assertEquals("zzz", StringUtils.leftPad("", 3, 'z'));
    }
    
    @Test
    public void testLeftPad_string_nullString() {
        assertNull(StringUtils.leftPad(null, 3, "yz"));
    }

    @Test
    public void testLeftPad_string_sizeLessThanLength() {
        assertEquals("bat", StringUtils.leftPad("bat", 1, "yz"));
        assertEquals("bat", StringUtils.leftPad("bat", -1, "yz"));
    }

    @Test
    public void testLeftPad_string_sizeEqualsLength() {
        assertEquals("bat", StringUtils.leftPad("bat", 3, "yz"));
    }

    @Test
    public void testLeftPad_string_sizeGreaterThanLength() {
        assertEquals("yzbat", StringUtils.leftPad("bat", 5, "yz"));
    }

    @Test
    public void testLeftPad_string_padStringRepeats() {
        assertEquals("yzyzybat", StringUtils.leftPad("bat", 8, "yz"));
    }

    @Test
    public void testLeftPad_string_padStringTruncated() {
        assertEquals("ybat", StringUtils.leftPad("bat", 4, "yz"));
    }
    
    @Test
    public void testLeftPad_string_nullPadString() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5, null));
    }

    @Test
    public void testLeftPad_string_emptyPadString() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5, ""));
    }

    @Test
    public void testLength_nullString() {
        assertEquals(0, StringUtils.length(null));
    }

    @Test
    public void testLength_emptyString() {
        assertEquals(0, StringUtils.length(""));
    }

    @Test
    public void testLength_regularString() {
        assertEquals(3, StringUtils.length("abc"));
    }

    // Test methods for center
    @Test
    public void testCenter_nullString() {
        assertNull(StringUtils.center(null, 4));
    }

    @Test
    public void testCenter_negativeSize() {
        assertEquals("ab", StringUtils.center("ab", -1));
    }

    @Test
    public void testCenter_sizeLessThanLength() {
        assertEquals("abcd", StringUtils.center("abcd", 2));
    }

    @Test
    public void testCenter_sizeEqualsLength() {
        assertEquals("ab", StringUtils.center("ab", 2));
    }

    @Test
    public void testCenter_sizeGreaterThanLengthEvenPadding() {
        assertEquals(" ab ", StringUtils.center("ab", 4));
    }

    @Test
    public void testCenter_sizeGreaterThanLengthOddPadding() {
        assertEquals(" a  ", StringUtils.center("a", 4));
    }

    @Test
    public void testCenter_emptyString() {
        assertEquals("    ", StringUtils.center("", 4));
    }
    
    @Test
    public void testCenter_char_nullString() {
        assertNull(StringUtils.center(null, 4, ' '));
    }

    @Test
    public void testCenter_char_negativeSize() {
        assertEquals("ab", StringUtils.center("ab", -1, ' '));
    }

    @Test
    public void testCenter_char_sizeLessThanLength() {
        assertEquals("abcd", StringUtils.center("abcd", 2, ' '));
    }

    @Test
    public void testCenter_char_sizeEqualsLength() {
        assertEquals("ab", StringUtils.center("ab", 2, ' '));
    }

    @Test
    public void testCenter_char_sizeGreaterThanLengthEvenPadding() {
        assertEquals(" ab ", StringUtils.center("ab", 4, ' '));
    }

    @Test
    public void testCenter_char_sizeGreaterThanLengthOddPadding() {
        assertEquals(" a  ", StringUtils.center("a", 4, ' '));
    }

    @Test
    public void testCenter_char_customPadding() {
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
    }

    @Test
    public void testCenter_char_emptyString() {
        assertEquals("    ", StringUtils.center("", 4, ' '));
    }
    
    @Test
    public void testCenter_string_nullString() {
        assertNull(StringUtils.center(null, 4, "yz"));
    }

    @Test
    public void testCenter_string_negativeSize() {
        assertEquals("ab", StringUtils.center("ab", -1, "yz"));
    }

    @Test
    public void testCenter_string_sizeLessThanLength() {
        assertEquals("abcd", StringUtils.center("abcd", 2, "yz"));
    }

    @Test
    public void testCenter_string_sizeEqualsLength() {
        assertEquals("ab", StringUtils.center("ab", 2, "yz"));
    }

    @Test
    public void testCenter_string_sizeGreaterThanLengthEvenPadding() {
        assertEquals(" yz", StringUtils.center("ab", 4, "yz"));
    }

    @Test
    public void testCenter_string_sizeGreaterThanLengthOddPadding() {
        assertEquals("yayz", StringUtils.center("a", 4, "yz"));
    }

    @Test
    public void testCenter_string_padStringRepeats() {
        assertEquals("yzyz", StringUtils.center("ab", 6, "yz"));
    }
    
    @Test
    public void testCenter_string_nullPadString() {
        assertEquals("  abc  ", StringUtils.center("abc", 7, null));
    }

    @Test
    public void testCenter_string_emptyPadString() {
        assertEquals("  abc  ", StringUtils.center("abc", 7, ""));
    }

    // Test methods for case conversion
    @Test
    public void testUpperCase_nullString() {
        assertNull(StringUtils.upperCase(null));
    }

    @Test
    public void testUpperCase_emptyString() {
        assertEquals("", StringUtils.upperCase(""));
    }

    @Test
    public void testUpperCase_regularString() {
        assertEquals("ABC", StringUtils.upperCase("aBc"));
    }
    
    @Test
    public void testUpperCase_locale_nullString() {
        assertNull(StringUtils.upperCase(null, Locale.ENGLISH));
    }

    @Test
    public void testUpperCase_locale_emptyString() {
        assertEquals("", StringUtils.upperCase("", Locale.ENGLISH));
    }

    @Test
    public void testUpperCase_locale_regularString() {
        assertEquals("ABC", StringUtils.upperCase("aBc", Locale.ENGLISH));
    }

    @Test
    public void testLowerCase_nullString() {
        assertNull(StringUtils.lowerCase(null));
    }

    @Test
    public void testLowerCase_emptyString() {
        assertEquals("", StringUtils.lowerCase(""));
    }

    @Test
    public void testLowerCase_regularString() {
        assertEquals("abc", StringUtils.lowerCase("aBc"));
    }

    @Test
    public void testLowerCase_locale_nullString() {
        assertNull(StringUtils.lowerCase(null, Locale.ENGLISH));
    }

    @Test
    public void testLowerCase_locale_emptyString() {
        assertEquals("", StringUtils.lowerCase("", Locale.ENGLISH));
    }

    @Test
    public void testLowerCase_locale_regularString() {
        assertEquals("abc", StringUtils.lowerCase("aBc", Locale.ENGLISH));
    }

    @Test
    public void testCapitalize_nullString() {
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    public void testCapitalize_emptyString() {
        assertEquals("", StringUtils.capitalize(""));
    }

    @Test
    public void testCapitalize_regularString() {
        assertEquals("Cat", StringUtils.capitalize("cat"));
    }

    @Test
    public void testCapitalize_alreadyCapitalized() {
        assertEquals("CAt", StringUtils.capitalize("CAt"));
    }

    @Test
    public void testUncapitalize_nullString() {
        assertNull(StringUtils.uncapitalize(null));
    }

    @Test
    public void testUncapitalize_emptyString() {
        assertEquals("", StringUtils.uncapitalize(""));
    }

    @Test
    public void testUncapitalize_regularString() {
        assertEquals("cat", StringUtils.uncapitalize("Cat"));
    }

    @Test
    public void testUncapitalize_alreadyUncapitalized() {
        assertEquals("cAT", StringUtils.uncapitalize("cAT"));
    }

    @Test
    public void testSwapCase_nullString() {
        assertNull(StringUtils.swapCase(null));
    }

    @Test
    public void testSwapCase_emptyString() {
        assertEquals("", StringUtils.swapCase(""));
    }

    @Test
    public void testSwapCase_mixedCase() {
        assertEquals("tHE DOG HAS A bone", StringUtils.swapCase("The dog has a BONE"));
    }

    @Test
    public void testSwapCase_allLower() {
        assertEquals("ABC", StringUtils.swapCase("abc"));
    }

    @Test
    public void testSwapCase_allUpper() {
        assertEquals("abc", StringUtils.swapCase("ABC"));
    }

    // Test methods for countMatches
    @Test
    public void testCountMatches_nullString() {
        assertEquals(0, StringUtils.countMatches(null, "a"));
    }

    @Test
    public void testCountMatches_emptyString() {
        assertEquals(0, StringUtils.countMatches("", "a"));
    }

    @Test
    public void testCountMatches_nullSub() {
        assertEquals(0, StringUtils.countMatches("abba", null));
    }

    @Test
    public void testCountMatches_emptySub() {
        assertEquals(0, StringUtils.countMatches("abba", ""));
    }

    @Test
    public void testCountMatches_singleOccurrence() {
        assertEquals(1, StringUtils.countMatches("abba", "ab"));
    }

    @Test
    public void testCountMatches_multipleOccurrences() {
        assertEquals(2, StringUtils.countMatches("abba", "a"));
    }

    @Test
    public void testCountMatches_noOccurrences() {
        assertEquals(0, StringUtils.countMatches("abba", "xxx"));
    }
    
    // Test methods for character type checks
    @Test
    public void testIsAlpha_nullString() {
        assertFalse(StringUtils.isAlpha(null));
    }

    @Test
    public void testIsAlpha_emptyString() {
        assertTrue(StringUtils.isAlpha(""));
    }

    @Test
    public void testIsAlpha_whitespaceString() {
        assertFalse(StringUtils.isAlpha("  "));
    }

    @Test
    public void testIsAlpha_onlyLetters() {
        assertTrue(StringUtils.isAlpha("abc"));
    }

    @Test
    public void testIsAlpha_lettersAndDigit() {
        assertFalse(StringUtils.isAlpha("ab2c"));
    }

    @Test
    public void testIsAlpha_lettersAndSymbol() {
        assertFalse(StringUtils.isAlpha("ab-c"));
    }

    @Test
    public void testIsAlphaSpace_nullString() {
        assertFalse(StringUtils.isAlphaSpace(null));
    }

    @Test
    public void testIsAlphaSpace_emptyString() {
        assertTrue(StringUtils.isAlphaSpace(""));
    }

    @Test
    public void testIsAlphaSpace_onlySpaces() {
        assertTrue(StringUtils.isAlphaSpace("  "));
    }

    @Test
    public void testIsAlphaSpace_onlyLetters() {
        assertTrue(StringUtils.isAlphaSpace("abc"));
    }

    @Test
    public void testIsAlphaSpace_lettersAndSpace() {
        assertTrue(StringUtils.isAlphaSpace("ab c"));
    }

    @Test
    public void testIsAlphaSpace_lettersAndDigit() {
        assertFalse(StringUtils.isAlphaSpace("ab2c"));
    }

    @Test
    public void testIsAlphaSpace_lettersAndSymbol() {
        assertFalse(StringUtils.isAlphaSpace("ab-c"));
    }

    @Test
    public void testIsAlphanumeric_nullString() {
        assertFalse(StringUtils.isAlphanumeric(null));
    }

    @Test
    public void testIsAlphanumeric_emptyString() {
        assertTrue(StringUtils.isAlphanumeric(""));
    }

    @Test
    public void testIsAlphanumeric_whitespaceString() {
        assertFalse(StringUtils.isAlphanumeric("  "));
    }

    @Test
    public void testIsAlphanumeric_onlyLetters() {
        assertTrue(StringUtils.isAlphanumeric("abc"));
    }

    @Test
    public void testIsAlphanumeric_lettersAndSpace() {
        assertFalse(StringUtils.isAlphanumeric("ab c"));
    }

    @Test
    public void testIsAlphanumeric_lettersAndDigit() {
        assertTrue(StringUtils.isAlphanumeric("ab2c"));
    }

    @Test
    public void testIsAlphanumeric_lettersAndSymbol() {
        assertFalse(StringUtils.isAlphanumeric("ab-c"));
    }

    @Test
    public void testIsAlphanumericSpace_nullString() {
        assertFalse(StringUtils.isAlphanumericSpace(null));
    }

    @Test
    public void testIsAlphanumericSpace_emptyString() {
        assertTrue(StringUtils.isAlphanumericSpace(""));
    }

    @Test
    public void testIsAlphanumericSpace_onlySpaces() {
        assertTrue(StringUtils.isAlphanumericSpace("  "));
    }

    @Test
    public void testIsAlphanumericSpace_onlyDigits() {
        assertTrue(StringUtils.isAlphanumericSpace("123"));
    }

    @Test
    public void testIsAlphanumericSpace_digitsAndSpace() {
        assertTrue(StringUtils.isAlphanumericSpace("12 3"));
    }

    @Test
    public void testIsAlphanumericSpace_digitsAndLetters() {
        assertTrue(StringUtils.isAlphanumericSpace("ab2c"));
    }

    @Test
    public void testIsAlphanumericSpace_lettersAndSymbol() {
        assertFalse(StringUtils.isAlphanumericSpace("ab-c"));
    }

    @Test
    public void testIsAsciiPrintable_nullString() {
        assertFalse(StringUtils.isAsciiPrintable(null));
    }

    @Test
    public void testIsAsciiPrintable_emptyString() {
        assertTrue(StringUtils.isAsciiPrintable(""));
    }

    @Test
    public void testIsAsciiPrintable_space() {
        assertTrue(StringUtils.isAsciiPrintable(" "));
    }

    @Test
    public void testIsAsciiPrintable_letters() {
        assertTrue(StringUtils.isAsciiPrintable("Ceki"));
    }

    @Test
    public void testIsAsciiPrintable_digitsAndSymbols() {
        assertTrue(StringUtils.isAsciiPrintable("ab2c!~"));
    }

    @Test
    public void testIsAsciiPrintable_asciiPrintableRange() {
        assertTrue(StringUtils.isAsciiPrintable("\u0020")); // Space
        assertTrue(StringUtils.isAsciiPrintable("\u007e")); // Tilde
    }

    @Test
    public void testIsAsciiPrintable_nonAsciiPrintable() {
        assertFalse(StringUtils.isAsciiPrintable("\u007f")); // DEL character
    }

    @Test
    public void testIsAsciiPrintable_nonAsciiChars() {
        assertFalse(StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc"));
    }

    @Test
    public void testIsNumeric_nullString() {
        assertFalse(StringUtils.isNumeric(null));
    }

    @Test
    public void testIsNumeric_emptyString() {
        assertTrue(StringUtils.isNumeric(""));
    }

    @Test
    public void testIsNumeric_whitespaceString() {
        assertFalse(StringUtils.isNumeric("  "));
    }

    @Test
    public void testIsNumeric_onlyDigits() {
        assertTrue(StringUtils.isNumeric("123"));
    }

    @Test
    public void testIsNumeric_digitsAndSpace() {
        assertFalse(StringUtils.isNumeric("12 3"));
    }

    @Test
    public void testIsNumeric_digitsAndLetters() {
        assertFalse(StringUtils.isNumeric("ab2c"));
    }

    @Test
    public void testIsNumeric_digitsAndSymbol() {
        assertFalse(StringUtils.isNumeric("12-3"));
    }

    @Test
    public void testIsNumeric_digitsAndDecimalPoint() {
        assertFalse(StringUtils.isNumeric("12.3"));
    }

    @Test
    public void testIsNumericSpace_nullString() {
        assertFalse(StringUtils.isNumericSpace(null));
    }

    @Test
    public void testIsNumericSpace_emptyString() {
        assertTrue(StringUtils.isNumericSpace(""));
    }

    @Test
    public void testIsNumericSpace_onlySpaces() {
        assertTrue(StringUtils.isNumericSpace("  "));
    }

    @Test
    public void testIsNumericSpace_onlyDigits() {
        assertTrue(StringUtils.isNumericSpace("123"));
    }

    @Test
    public void testIsNumericSpace_digitsAndSpace() {
        assertTrue(StringUtils.isNumericSpace("12 3"));
    }

    @Test
    public void testIsNumericSpace_digitsAndLetters() {
        assertFalse(StringUtils.isNumericSpace("ab2c"));
    }

    @Test
    public void testIsNumericSpace_digitsAndSymbol() {
        assertFalse(StringUtils.isNumericSpace("12-3"));
    }

    @Test
    public void testIsNumericSpace_digitsAndDecimalPoint() {
        assertFalse(StringUtils.isNumericSpace("12.3"));
    }

    @Test
    public void testIsWhitespace_nullString() {
        assertFalse(StringUtils.isWhitespace(null));
    }

    @Test
    public void testIsWhitespace_emptyString() {
        assertTrue(StringUtils.isWhitespace(""));
    }

    @Test
    public void testIsWhitespace_onlyWhitespace() {
        assertTrue(StringUtils.isWhitespace("  "));
        assertTrue(StringUtils.isWhitespace("\t\n\r"));
    }

    @Test
    public void testIsWhitespace_nonWhitespace() {
        assertFalse(StringUtils.isWhitespace("abc"));
    }

    @Test
    public void testIsWhitespace_mixed() {
        assertFalse(StringUtils.isWhitespace("ab2c"));
        assertFalse(StringUtils.isWhitespace("ab-c"));
    }

    @Test
    public void testIsAllLowerCase_nullString() {
        assertFalse(StringUtils.isAllLowerCase(null));
    }

    @Test
    public void testIsAllLowerCase_emptyString() {
        assertFalse(StringUtils.isAllLowerCase(""));
    }

    @Test
    public void testIsAllLowerCase_whitespaceString() {
        assertFalse(StringUtils.isAllLowerCase("  "));
    }

    @Test
    public void testIsAllLowerCase_allLower() {
        assertTrue(StringUtils.isAllLowerCase("abc"));
    }

    @Test
    public void testIsAllLowerCase_mixedCase() {
        assertFalse(StringUtils.isAllLowerCase("abC"));
    }

    @Test
    public void testIsAllUpperCase_nullString() {
        assertFalse(StringUtils.isAllUpperCase(null));
    }

    @Test
    public void testIsAllUpperCase_emptyString() {
        assertFalse(StringUtils.isAllUpperCase(""));
    }

    @Test
    public void testIsAllUpperCase_whitespaceString() {
        assertFalse(StringUtils.isAllUpperCase("  "));
    }

    @Test
    public void testIsAllUpperCase_allUpper() {
        assertTrue(StringUtils.isAllUpperCase("ABC"));
    }

    @Test
    public void testIsAllUpperCase_mixedCase() {
        assertFalse(StringUtils.isAllUpperCase("aBC"));
    }

    // Test methods for defaults
    @Test
    public void testDefaultString_nullInput() {
        assertEquals("", StringUtils.defaultString(null));
    }

    @Test
    public void testDefaultString_emptyInput() {
        assertEquals("", StringUtils.defaultString(""));
    }

    @Test
    public void testDefaultString_regularInput() {
        assertEquals("bat", StringUtils.defaultString("bat"));
    }
    
    @Test
    public void testDefaultString_withDefault_nullInput() {
        assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
    }

    @Test
    public void testDefaultString_withDefault_emptyInput() {
        assertEquals("", StringUtils.defaultString("", "NULL"));
    }

    @Test
    public void testDefaultString_withDefault_regularInput() {
        assertEquals("bat", StringUtils.defaultString("bat", "NULL"));
    }
    
    @Test
    public void testDefaultIfEmpty_nullInput() {
        assertEquals("NULL", StringUtils.defaultIfEmpty(null, "NULL"));
    }

    @Test
    public void testDefaultIfEmpty_emptyInput() {
        assertEquals("NULL", StringUtils.defaultIfEmpty("", "NULL"));
    }

    @Test
    public void testDefaultIfEmpty_regularInput() {
        assertEquals("bat", StringUtils.defaultIfEmpty("bat", "NULL"));
    }
    
    @Test
    public void testDefaultIfEmpty_emptyDefault() {
        assertNull(StringUtils.defaultIfEmpty("", null));
    }

    // Test methods for reversing
    @Test
    public void testReverse_nullString() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testReverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testReverse_regularString() {
        assertEquals("tab", StringUtils.reverse("bat"));
    }

    @Test
    public void testReverseDelimited_nullString() {
        assertNull(StringUtils.reverseDelimited(null, '.'));
    }

    @Test
    public void testReverseDelimited_emptyString() {
        assertEquals("", StringUtils.reverseDelimited("", '.'));
    }

    @Test
    public void testReverseDelimited_noSeparator() {
        assertEquals("a.b.c", StringUtils.reverseDelimited("a.b.c", 'x'));
    }

    @Test
    public void testReverseDelimited_separatorFound() {
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    // Test methods for abbreviating
    @Test
    public void testAbbreviate_nullString() {
        assertNull(StringUtils.abbreviate(null, 6));
    }

    @Test
    public void testAbbreviate_emptyString() {
        assertEquals("", StringUtils.abbreviate("", 4));
    }

    @Test
    public void testAbbreviate_shortString() {
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 8));
    }

    @Test
    public void testAbbreviate_abbreviated() {
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
    }

    @Test
    public void testAbbreviate_abbreviatedShort() {
        assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviate_maxWidthTooSmall() {
        StringUtils.abbreviate("abcdefg", 3);
    }
    
    @Test
    public void testAbbreviate_offsetAndMaxWidth_nullString() {
        assertNull(StringUtils.abbreviate(null, 0, 10));
    }

    @Test
    public void testAbbreviate_offsetAndMaxWidth_emptyString() {
        assertEquals("", StringUtils.abbreviate("", 0, 4));
    }

    @Test
    public void testAbbreviate_offsetAndMaxWidth_negativeOffset() {
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", -1, 10));
    }

    @Test
    public void testAbbreviate_offsetAndMaxWidth_offsetZero() {
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 0, 10));
    }

    @Test
    public void testAbbreviate_offsetAndMaxWidth_offsetSmall() {
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 1, 10));
    }

    @Test
    public void testAbbreviate_offsetAndMaxWidth_offsetMedium() {
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 4, 10));
    }

    @Test
    public void testAbbreviate_offsetAndMaxWidth_offsetHalfWay() {
        assertEquals("...fghi...", StringUtils.abbreviate("abcdefghijklmno", 5, 10));
    }

    @Test
    public void testAbbreviate_offsetAndMaxWidth_offsetLate() {
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 8, 10));
    }

    @Test
    public void testAbbreviate_offsetAndMaxWidth_offsetAtEnd() {
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 10, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 12, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviate_offsetAndMaxWidth_maxWidthTooSmall() {
        StringUtils.abbreviate("abcdefghij", 0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviate_offsetAndMaxWidth_maxWidthTooSmallWithOffset() {
        StringUtils.abbreviate("abcdefghij", 5, 6);
    }

    // Test methods for difference, indexOfDifference, getCommonPrefix
    @Test
    public void testDifference_bothNull() {
        assertNull(StringUtils.difference(null, null));
    }

    @Test
    public void testDifference_firstNull() {
        assertEquals("abc", StringUtils.difference(null, "abc"));
    }

    @Test
    public void testDifference_secondNull() {
        assertEquals("abc", StringUtils.difference("abc", null));
    }

    @Test
    public void testDifference_bothEmpty() {
        assertEquals("", StringUtils.difference("", ""));
    }

    @Test
    public void testDifference_firstEmpty() {
        assertEquals("abc", StringUtils.difference("", "abc"));
    }

    @Test
    public void testDifference_secondEmpty() {
        assertEquals("", StringUtils.difference("abc", ""));
    }

    @Test
    public void testDifference_identicalStrings() {
        assertEquals("", StringUtils.difference("abc", "abc"));
    }

    @Test
    public void testDifference_commonPrefix() {
        assertEquals("xyz", StringUtils.difference("ab", "abxyz"));
        assertEquals("xyz", StringUtils.difference("abcde", "abxyz"));
    }

    @Test
    public void testDifference_noCommonPrefix() {
        assertEquals("xyz", StringUtils.difference("abcde", "xyz"));
    }

    @Test
    public void testIndexOfDifference_bothNull() {
        assertEquals(-1, StringUtils.indexOfDifference(null, null));
    }

    @Test
    public void testIndexOfDifference_identicalStrings() {
        assertEquals(-1, StringUtils.indexOfDifference("abc", "abc"));
    }

    @Test
    public void testIndexOfDifference_firstNull() {
        assertEquals(0, StringUtils.indexOfDifference(null, "abc"));
    }

    @Test
    public void testIndexOfDifference_secondNull() {
        assertEquals(0, StringUtils.indexOfDifference("abc", null));
    }

    @Test
    public void testIndexOfDifference_bothEmpty() {
        assertEquals(-1, StringUtils.indexOfDifference("", ""));
    }

    @Test
    public void testIndexOfDifference_firstEmpty() {
        assertEquals(0, StringUtils.indexOfDifference("", "abc"));
    }

    @Test
    public void testIndexOfDifference_secondEmpty() {
        assertEquals(0, StringUtils.indexOfDifference("abc", ""));
    }

    @Test
    public void testIndexOfDifference_commonPrefix() {
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));
        assertEquals(2, StringUtils.indexOfDifference("abcde", "abxyz"));
    }

    @Test
    public void testIndexOfDifference_noCommonPrefix() {
        assertEquals(0, StringUtils.indexOfDifference("abcde", "xyz"));
    }

    @Test
    public void testIndexOfDifference_differentLengths() {
        assertEquals(2, StringUtils.indexOfDifference("abcde", "abxyz"));
    }

    @Test
    public void testIndexOfDifference_stringsDifferAtEnd() {
        assertEquals(2, StringUtils.indexOfDifference("abc", "abx"));
    }

    @Test
    public void testIndexOfDifference_array_nullArray() {
        assertEquals(-1, StringUtils.indexOfDifference((String[]) null));
    }

    @Test
    public void testIndexOfDifference_array_emptyArray() {
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{}));
    }

    @Test
    public void testIndexOfDifference_array_singleString() {
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{"abc"}));
    }

    @Test
    public void testIndexOfDifference_array_allNulls() {
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{null, null}));
    }

    @Test
    public void testIndexOfDifference_array_allEmpty() {
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{"", ""}));
    }

    @Test
    public void testIndexOfDifference_array_emptyAndNull() {
        assertEquals(0, StringUtils.indexOfDifference(new String[]{"", null}));
        assertEquals(0, StringUtils.indexOfDifference(new String[]{null, ""}));
    }

    @Test
    public void testIndexOfDifference_array_nullsAndString() {
        assertEquals(0, StringUtils.indexOfDifference(new String[]{"abc", null, null}));
        assertEquals(0, StringUtils.indexOfDifference(new String[]{null, null, "abc"}));
    }

    @Test
    public void testIndexOfDifference_array_emptyAndString() {
        assertEquals(0, StringUtils.indexOfDifference(new String[]{"", "abc"}));
        assertEquals(0, StringUtils.indexOfDifference(new String[]{"abc", ""}));
    }

    @Test
    public void testIndexOfDifference_array_identicalStrings() {
        assertEquals(-1, StringUtils.indexOfDifference(new String[]{"abc", "abc"}));
    }

    @Test
    public void testIndexOfDifference_array_differAtStart() {
        assertEquals(0, StringUtils.indexOfDifference(new String[]{"abc", "xyz"}));
        assertEquals(0, StringUtils.indexOfDifference(new String[]{"xyz", "abc"}));
    }

    @Test
    public void testIndexOfDifference_array_differInMiddle() {
        assertEquals(1, StringUtils.indexOfDifference(new String[]{"abc", "a"}));
    }

    @Test
    public void testIndexOfDifference_array_commonPrefixDifferentLengths() {
        assertEquals(2, StringUtils.indexOfDifference(new String[]{"ab", "abxyz"}));
        assertEquals(2, StringUtils.indexOfDifference(new String[]{"abcde", "abxyz"}));
    }

    @Test
    public void testIndexOfDifference_array_multipleStrings() {
        assertEquals(7, StringUtils.indexOfDifference(new String[]{"i am a machine", "i am a robot"}));
    }
    
    @Test
    public void testGetCommonPrefix_nullArray() {
        assertEquals("", StringUtils.getCommonPrefix(null));
    }

    @Test
    public void testGetCommonPrefix_emptyArray() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{}));
    }

    @Test
    public void testGetCommonPrefix_singleString() {
        assertEquals("abc", StringUtils.getCommonPrefix(new String[]{"abc"}));
    }

    @Test
    public void testGetCommonPrefix_allNull() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{null, null}));
    }

    @Test
    public void testGetCommonPrefix_allEmpty() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"", ""}));
    }

    @Test
    public void testGetCommonPrefix_emptyAndNull() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"", null}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{null, ""}));
    }

    @Test
    public void testGetCommonPrefix_nullsAndString() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"abc", null, null}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{null, null, "abc"}));
    }

    @Test
    public void testGetCommonPrefix_emptyAndString() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"", "abc"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"abc", ""}));
    }

    @Test
    public void testGetCommonPrefix_identicalStrings() {
        assertEquals("abc", StringUtils.getCommonPrefix(new String[]{"abc", "abc"}));
    }

    @Test
    public void testGetCommonPrefix_differAtStart() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"abc", "xyz"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"xyz", "abc"}));
    }

    @Test
    public void testGetCommonPrefix_differInMiddle() {
        assertEquals("a", StringUtils.getCommonPrefix(new String[]{"abc", "a"}));
    }

    @Test
    public void testGetCommonPrefix_commonPrefixDifferentLengths() {
        assertEquals("ab", StringUtils.getCommonPrefix(new String[]{"ab", "abxyz"}));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[]{"abcde", "abxyz"}));
    }

    @Test
    public void testGetCommonPrefix_multipleStrings() {
        assertEquals("i am a ", StringUtils.getCommonPrefix(new String[]{"i am a machine", "i am a robot"}));
    }

    // Test methods for getLevenshteinDistance
    @Test
    public void testGetLevenshteinDistance_nullFirstString() {
        try {
            StringUtils.getLevenshteinDistance(null, "abc");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetLevenshteinDistance_nullSecondString() {
        try {
            StringUtils.getLevenshteinDistance("abc", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetLevenshteinDistance_bothEmpty() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
    }

    @Test
    public void testGetLevenshteinDistance_emptyFirstString() {
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
    }

    @Test
    public void testGetLevenshteinDistance_emptySecondString() {
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
    }

    @Test
    public void testGetLevenshteinDistance_substitution() {
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo"));
    }

    @Test
    public void testGetLevenshteinDistance_multipleChanges() {
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
    }

    @Test
    public void testGetLevenshteinDistance_completelyDifferent() {
        assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz"));
    }
    
    // Test methods for startsWith, startsWithIgnoreCase, startsWithAny
    @Test
    public void testStartsWith_nullString() {
        assertTrue(StringUtils.startsWith(null, null));
    }

    @Test
    public void testStartsWith_nullPrefix() {
        assertFalse(StringUtils.startsWith("abcdef", null));
    }

    @Test
    public void testStartsWith_emptyPrefix() {
        assertTrue(StringUtils.startsWith("abcdef", ""));
        assertTrue(StringUtils.startsWith("", ""));
        assertTrue(StringUtils.startsWith(null, null)); // Special case from the doc
    }
    
    @Test
    public void testStartsWith_prefixLongerThanString() {
        assertFalse(StringUtils.startsWith("abc", "abcd"));
    }

    @Test
    public void testStartsWith_match() {
        assertTrue(StringUtils.startsWith("abcdef", "abc"));
    }

    @Test
    public void testStartsWith_noMatch() {
        assertFalse(StringUtils.startsWith("abcdef", "abd"));
    }

    @Test
    public void testStartsWith_caseSensitiveMismatch() {
        assertFalse(StringUtils.startsWith("ABCDEF", "abc"));
    }

    @Test
    public void testStartsWithIgnoreCase_nullString() {
        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
    }

    @Test
    public void testStartsWithIgnoreCase_nullPrefix() {
        assertFalse(StringUtils.startsWithIgnoreCase("abcdef", null));
    }

    @Test
    public void testStartsWithIgnoreCase_emptyPrefix() {
        assertTrue(StringUtils.startsWithIgnoreCase("abcdef", ""));
        assertTrue(StringUtils.startsWithIgnoreCase("", ""));
        assertTrue(StringUtils.startsWithIgnoreCase(null, null)); // Special case from the doc
    }
    
    @Test
    public void testStartsWithIgnoreCase_prefixLongerThanString() {
        assertFalse(StringUtils.startsWithIgnoreCase("abc", "abcd"));
    }

    @Test
    public void testStartsWithIgnoreCase_matchCaseSensitive() {
        assertTrue(StringUtils.startsWithIgnoreCase("abcdef", "abc"));
    }

    @Test
    public void testStartsWithIgnoreCase_matchIgnoreCase() {
        assertTrue(StringUtils.startsWithIgnoreCase("ABCDEF", "abc"));
    }

    @Test
    public void testStartsWithIgnoreCase_noMatch() {
        assertFalse(StringUtils.startsWithIgnoreCase("abcdef", "abd"));
    }

    @Test
    public void testStartsWithAny_nullString() {
        assertFalse(StringUtils.startsWithAny(null, new String[]{"abc"}));
    }

    @Test
    public void testStartsWithAny_nullSearchStrings() {
        assertFalse(StringUtils.startsWithAny("abcxyz", null));
    }

    @Test
    public void testStartsWithAny_emptySearchStrings() {
        assertFalse(StringUtils.startsWithAny("abcxyz", new String[]{}));
    }

    @Test
    public void testStartsWithAny_emptyPrefixInSearchStrings() {
        assertFalse(StringUtils.startsWithAny("abcxyz", new String[]{""}));
    }

    @Test
    public void testStartsWithAny_matchFound() {
        assertTrue(StringUtils.startsWithAny("abcxyz", new String[]{"abc"}));
    }

    @Test
    public void testStartsWithAny_matchFoundWithNullAndOthers() {
        assertTrue(StringUtils.startsWithAny("abcxyz", new String[]{null, "xyz", "abc"}));
    }

    @Test
    public void testStartsWithAny_noMatch() {
        assertFalse(StringUtils.startsWithAny("abcxyz", new String[]{"def", "ghi"}));
    }
    
    // Test methods for endsWith, endsWithIgnoreCase
    @Test
    public void testEndsWith_nullString() {
        assertTrue(StringUtils.endsWith(null, null));
    }

    @Test
    public void testEndsWith_nullSuffix() {
        assertFalse(StringUtils.endsWith("abcdef", null));
    }

    @Test
    public void testEndsWith_emptySuffix() {
        assertTrue(StringUtils.endsWith("abcdef", ""));
        assertTrue(StringUtils.endsWith("", ""));
        assertTrue(StringUtils.endsWith(null, null)); // Special case from the doc
    }
    
    @Test
    public void testEndsWith_suffixLongerThanString() {
        assertFalse(StringUtils.endsWith("abc", "abcd"));
    }

    @Test
    public void testEndsWith_match() {
        assertTrue(StringUtils.endsWith("abcdef", "def"));
    }

    @Test
    public void testEndsWith_noMatch() {
        assertFalse(StringUtils.endsWith("abcdef", "deg"));
    }

    @Test
    public void testEndsWith_caseSensitiveMismatch() {
        assertFalse(StringUtils.endsWith("ABCDEF", "def"));
        assertFalse(StringUtils.endsWith("ABCDEF", "cde"));
    }

    @Test
    public void testEndsWithIgnoreCase_nullString() {
        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
    }

    @Test
    public void testEndsWithIgnoreCase_nullSuffix() {
        assertFalse(StringUtils.endsWithIgnoreCase("abcdef", null));
    }

    @Test
    public void testEndsWithIgnoreCase_emptySuffix() {
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", ""));
        assertTrue(StringUtils.endsWithIgnoreCase("", ""));
        assertTrue(StringUtils.endsWithIgnoreCase(null, null)); // Special case from the doc
    }
    
    @Test
    public void testEndsWithIgnoreCase_suffixLongerThanString() {
        assertFalse(StringUtils.endsWithIgnoreCase("abc", "abcd"));
    }

    @Test
    public void testEndsWithIgnoreCase_matchCaseSensitive() {
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "def"));
    }

    @Test
    public void testEndsWithIgnoreCase_matchIgnoreCase() {
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
    }

    @Test
    public void testEndsWithIgnoreCase_noMatch() {
        assertFalse(StringUtils.endsWithIgnoreCase("abcdef", "deg"));
    }
}
```