package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.text.WordUtils;

public class StringUtilsTest {

    // Tests for isEmpty and isNotEmpty
    @Test
    public void testIsEmptyNull() {
        assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    public void testIsEmptyEmptyString() {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void testIsEmptyNonEmptyString() {
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("bob"));
    }

    @Test
    public void testIsNotEmptyNull() {
        assertFalse(StringUtils.isNotEmpty(null));
    }

    @Test
    public void testIsNotEmptyEmptyString() {
        assertFalse(StringUtils.isNotEmpty(""));
    }

    @Test
    public void testIsNotEmptyNonEmptyString() {
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("bob"));
    }

    // Tests for isBlank and isNotBlank
    @Test
    public void testIsBlankNull() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    public void testIsBlankEmptyString() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    public void testIsBlankWhitespaceString() {
        assertTrue(StringUtils.isBlank(" \t\n\r\f"));
    }

    @Test
    public void testIsBlankNotBlankString() {
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank(" bob "));
    }

    @Test
    public void testIsNotBlankNull() {
        assertFalse(StringUtils.isNotBlank(null));
    }

    @Test
    public void testIsNotBlankEmptyString() {
        assertFalse(StringUtils.isNotBlank(""));
    }

    @Test
    public void testIsNotBlankWhitespaceString() {
        assertFalse(StringUtils.isNotBlank(" \t\n\r\f"));
    }

    @Test
    public void testIsNotBlankNotBlankString() {
        assertTrue(StringUtils.isNotBlank("bob"));
        assertTrue(StringUtils.isNotBlank(" bob "));
    }

    // Tests for trim
    @Test
    public void testTrimNull() {
        assertNull(StringUtils.trim(null));
    }

    @Test
    public void testTrimEmptyString() {
        assertEquals("", StringUtils.trim(""));
    }

    @Test
    public void testTrimWhitespaceString() {
        assertEquals("", StringUtils.trim("   "));
    }

    @Test
    public void testTrimWithLeadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.trim("    abc    "));
    }

    @Test
    public void testTrimNoWhitespace() {
        assertEquals("abc", StringUtils.trim("abc"));
    }

    // Tests for trimToNull
    @Test
    public void testTrimToNullNull() {
        assertNull(StringUtils.trimToNull(null));
    }

    @Test
    public void testTrimToNullEmptyString() {
        assertNull(StringUtils.trimToNull(""));
    }

    @Test
    public void testTrimToNullWhitespaceString() {
        assertNull(StringUtils.trimToNull("     "));
    }

    @Test
    public void testTrimToNullNonWhitespace() {
        assertEquals("abc", StringUtils.trimToNull("  abc  "));
    }

    // Tests for trimToEmpty
    @Test
    public void testTrimToEmptyNull() {
        assertEquals("", StringUtils.trimToEmpty(null));
    }

    @Test
    public void testTrimToEmptyEmptyString() {
        assertEquals("", StringUtils.trimToEmpty(""));
    }

    @Test
    public void testTrimToEmptyWhitespaceString() {
        assertEquals("", StringUtils.trimToEmpty("     "));
    }

    @Test
    public void testTrimToEmptyNonWhitespace() {
        assertEquals("abc", StringUtils.trimToEmpty("  abc  "));
    }

    // Tests for strip
    @Test
    public void testStripNull() {
        assertNull(StringUtils.strip(null));
    }

    @Test
    public void testStripEmptyString() {
        assertEquals("", StringUtils.strip(""));
    }

    @Test
    public void testStripWhitespace() {
        assertEquals("", StringUtils.strip("   "));
    }

    @Test
    public void testStripWithSpecificChars() {
        assertEquals("abc", StringUtils.strip("xyzabcxyz", "xyz"));
    }

    @Test
    public void testStripNoMatchingChars() {
        assertEquals("abc", StringUtils.strip("abc", "xyz"));
    }

    // Tests for stripStart
    @Test
    public void testStripStartNull() {
        assertNull(StringUtils.stripStart(null, null));
    }

    @Test
    public void testStripStartEmptyString() {
        assertEquals("", StringUtils.stripStart("", null));
    }

    @Test
    public void testStripStartNullStripChars() {
        assertEquals("abc", StringUtils.stripStart("  abc", null));
    }

    @Test
    public void testStripStartEmptyStripChars() {
        assertEquals("abc", StringUtils.stripStart("abc", ""));
    }

    @Test
    public void testStripStartWithSpecificChars() {
        assertEquals("abc", StringUtils.stripStart("xyzabc", "xyz"));
    }

    // Tests for stripEnd
    @Test
    public void testStripEndNull() {
        assertNull(StringUtils.stripEnd(null, null));
    }

    @Test
    public void testStripEndEmptyString() {
        assertEquals("", StringUtils.stripEnd("", null));
    }

    @Test
    public void testStripEndNullStripChars() {
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
    }

    @Test
    public void testStripEndEmptyStripChars() {
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
    }

    @Test
    public void testStripEndWithSpecificChars() {
        assertEquals("abc", StringUtils.stripEnd("abcxyz", "xyz"));
    }

    // Tests for stripAll
    @Test
    public void testStripAllNullArray() {
        assertNull(StringUtils.stripAll(null));
    }

    @Test
    public void testStripAllEmptyArray() {
        assertEquals(0, StringUtils.stripAll(new String[0]).length);
    }

    @Test
    public void testStripAllArrayWithNullAndStrings() {
        String[] input = {"abc", "  def  ", null, "ghi"};
        String[] expected = {"abc", "def", null, "ghi"};
        assertArrayEquals(expected, StringUtils.stripAll(input));
    }

    // Tests for equals
    @Test
    public void testEqualsNullNull() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEqualsNullNonNull() {
        assertFalse(StringUtils.equals(null, "abc"));
    }

    @Test
    public void testEqualsNonNullNull() {
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEqualsSameString() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEqualsDifferentString() {
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    // Tests for equalsIgnoreCase
    @Test
    public void testEqualsIgnoreCaseNullNull() {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
    }

    @Test
    public void testEqualsIgnoreCaseNullNonNull() {
        assertFalse(StringUtils.equalsIgnoreCase(null, "abc"));
    }

    @Test
    public void testEqualsIgnoreCaseNonNullNull() {
        assertFalse(StringUtils.equalsIgnoreCase("abc", null));
    }

    @Test
    public void testEqualsIgnoreCaseSameString() {
        assertTrue(StringUtils.equalsIgnoreCase("abc", "abc"));
    }

    @Test
    public void testEqualsIgnoreCaseDifferentCase() {
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    // Tests for indexOf
    @Test
    public void testIndexOfCharNullString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf(null, 'a'));
    }

    @Test
    public void testIndexOfCharEmptyString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("", 'a'));
    }

    @Test
    public void testIndexOfCharFound() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", 'a'));
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b'));
    }

    @Test
    public void testIndexOfCharNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("aabaabaa", 'z'));
    }

    @Test
    public void testIndexOfStringNullString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf(null, "a"));
    }

    @Test
    public void testIndexOfStringNullSearchString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("aabaabaa", null));
    }

    @Test
    public void testIndexOfStringEmptySearchString() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", ""));
    }

    @Test
    public void testIndexOfStringFound() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", "a"));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b"));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
    }

    @Test
    public void testIndexOfStringNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("aabaabaa", "z"));
    }

    // Tests for lastIndexOf
    @Test
    public void testLastIndexOfCharNullString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf(null, 'a'));
    }

    @Test
    public void testLastIndexOfCharEmptyString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf("", 'a'));
    }

    @Test
    public void testLastIndexOfCharFound() {
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a'));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b'));
    }

    @Test
    public void testLastIndexOfCharNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf("aabaabaa", 'z'));
    }

    @Test
    public void testLastIndexOfStringNullString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf(null, "a"));
    }

    @Test
    public void testLastIndexOfStringNullSearchString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf("aabaabaa", null));
    }

    @Test
    public void testLastIndexOfStringEmptySearchString() {
        assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
    }

    @Test
    public void testLastIndexOfStringFound() {
        assertEquals(0, StringUtils.lastIndexOf("aabaabaa", "a"));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", "b"));
        assertEquals(1, StringUtils.lastIndexOf("aabaabaa", "ab"));
    }

    @Test
    public void testLastIndexOfStringNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf("aabaabaa", "z"));
    }

    // Tests for contains
    @Test
    public void testContainsCharNullString() {
        assertFalse(StringUtils.contains(null, 'a'));
    }

    @Test
    public void testContainsCharEmptyString() {
        assertFalse(StringUtils.contains("", 'a'));
    }

    @Test
    public void testContainsCharFound() {
        assertTrue(StringUtils.contains("abc", 'a'));
    }

    @Test
    public void testContainsCharNotFound() {
        assertFalse(StringUtils.contains("abc", 'z'));
    }

    @Test
    public void testContainsStringNullString() {
        assertFalse(StringUtils.contains(null, "a"));
    }

    @Test
    public void testContainsStringNullSearchString() {
        assertFalse(StringUtils.contains("abc", null));
    }

    @Test
    public void testContainsStringEmptySearchString() {
        assertTrue(StringUtils.contains("abc", ""));
    }

    @Test
    public void testContainsStringFound() {
        assertTrue(StringUtils.contains("abc", "a"));
    }

    @Test
    public void testContainsStringNotFound() {
        assertFalse(StringUtils.contains("abc", "z"));
    }

    // Tests for indexOfAny
    @Test
    public void testIndexOfAnyCharSequenceNull() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny(null, new char[]{'a'}));
    }

    @Test
    public void testIndexOfAnyEmptyCharSequence() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("", new char[]{'a'}));
    }


    @Test
    public void testIndexOfAnyEmptySearchChars() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("abc", new char[]{}));
    }

    @Test
    public void testIndexOfAnyFound() {
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new char[]{'z', 'a'}));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", new char[]{'b', 'y'}));
    }

    @Test
    public void testIndexOfAnyNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("aba", new char[]{'z'}));
    }

    @Test
    public void testIndexOfAnyStringEmptySearchString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("abc", ""));
    }

    @Test
    public void testIndexOfAnyStringFound() {
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", "za"));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", "by"));
    }

    @Test
    public void testIndexOfAnyStringNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("aba", "z"));
    }

    // Tests for containsAny
    @Test
    public void testContainsAnyNullCharSequence() {
        assertFalse(StringUtils.containsAny(null, new char[]{'a'}));
    }

    @Test
    public void testContainsAnyEmptyCharSequence() {
        assertFalse(StringUtils.containsAny("", new char[]{'a'}));
    }


    @Test
    public void testContainsAnyEmptySearchChars() {
        assertFalse(StringUtils.containsAny("abc", new char[]{}));
    }

    @Test
    public void testContainsAnyFound() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[]{'z', 'a'}));
        assertTrue(StringUtils.containsAny("zzabyycdxx", new char[]{'b', 'y'}));
    }

    @Test
    public void testContainsAnyNotFound() {
        assertFalse(StringUtils.containsAny("aba", new char[]{'z'}));
    }

    @Test
    public void testContainsAnyStringEmptySearchString() {
        assertFalse(StringUtils.containsAny("abc", ""));
    }

    @Test
    public void testContainsAnyStringFound() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
        assertTrue(StringUtils.containsAny("zzabyycdxx", "by"));
    }

    @Test
    public void testContainsAnyStringNotFound() {
        assertFalse(StringUtils.containsAny("aba", "z"));
    }


    // Tests for indexOfAnyBut
    @Test
    public void testIndexOfAnyButNullCharSequence() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAnyBut(null, new char[]{'a'}));
    }

    @Test
    public void testIndexOfAnyButEmptyCharSequence() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAnyBut("", new char[]{'a'}));
    }


    @Test
    public void testIndexOfAnyButEmptySearchChars() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAnyBut("abc", new char[]{}));
    }

    @Test
    public void testIndexOfAnyButFound() {
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", new char[]{'z', 'a'}));
    }

    @Test
    public void testIndexOfAnyButNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAnyBut("aba", new char[]{'a', 'b'}));
    }

    @Test
    public void testIndexOfAnyButEmptySearchString() {
        assertEquals(0, StringUtils.indexOfAnyBut("zzabyycdxx", ""));
    }

    @Test
    public void testIndexOfAnyButStringFound() {
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
    }

    @Test
    public void testIndexOfAnyButStringNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAnyBut("aba", "ab"));
    }

    // Tests for containsOnly
    @Test
    public void testContainsOnlyNullCharSequence() {
        assertFalse(StringUtils.containsOnly(null, new char[]{'a'}));
    }


    @Test
    public void testContainsOnlyEmptyCharSequence() {
        assertTrue(StringUtils.containsOnly("", new char[]{'a'}));
    }

    @Test
    public void testContainsOnlyEmptyValidChars() {
        assertFalse(StringUtils.containsOnly("ab", new char[]{}));
    }

    @Test
    public void testContainsOnlyValid() {
        assertTrue(StringUtils.containsOnly("abab", new char[]{'a', 'b', 'c'}));
    }

    @Test
    public void testContainsOnlyInvalid() {
        assertFalse(StringUtils.containsOnly("ab1", new char[]{'a', 'b', 'c'}));
    }

    @Test
    public void testContainsOnlyStringValid() {
        assertTrue(StringUtils.containsOnly("abab", "abc"));
    }

    @Test
    public void testContainsOnlyStringInvalid() {
        assertFalse(StringUtils.containsOnly("ab1", "abc"));
    }

    // Tests for containsNone
    @Test
    public void testContainsNoneNullCharSequence() {
        assertTrue(StringUtils.containsNone(null, new char[]{'a'}));
    }


    @Test
    public void testContainsNoneEmptyCharSequence() {
        assertTrue(StringUtils.containsNone("", new char[]{'a'}));
    }

    @Test
    public void testContainsNoneEmptyInvalidChars() {
        assertTrue(StringUtils.containsNone("ab", new char[]{}));
    }

    @Test
    public void testContainsNoneValid() {
        assertTrue(StringUtils.containsNone("abab", new char[]{'x', 'y', 'z'}));
    }

    @Test
    public void testContainsNoneInvalid() {
        assertFalse(StringUtils.containsNone("abz", new char[]{'x', 'y', 'z'}));
    }

    @Test
    public void testContainsNoneStringValid() {
        assertTrue(StringUtils.containsNone("abab", "xyz"));
    }

    @Test
    public void testContainsNoneStringInvalid() {
        assertFalse(StringUtils.containsNone("abz", "xyz"));
    }

    // Tests for substring
    @Test
    public void testSubstringNull() {
        assertNull(StringUtils.substring(null, 0));
    }

    @Test
    public void testSubstringEmptyString() {
        assertEquals("", StringUtils.substring("", 0));
    }

    @Test
    public void testSubstringPositiveStart() {
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("c", StringUtils.substring("abc", 2));
    }

    @Test
    public void testSubstringStartTooLarge() {
        assertEquals("", StringUtils.substring("abc", 4));
    }

    @Test
    public void testSubstringNegativeStart() {
        assertEquals("bc", StringUtils.substring("abc", -2));
    }

    @Test
    public void testSubstringNegativeStartTooSmall() {
        assertEquals("abc", StringUtils.substring("abc", -4));
    }

    @Test
    public void testSubstringWithStartAndEndNull() {
        assertNull(StringUtils.substring(null, 0, 1));
    }

    @Test
    public void testSubstringWithStartAndEndEmpty() {
        assertEquals("", StringUtils.substring("", 0, 0));
    }

    @Test
    public void testSubstringWithStartAndEndPositive() {
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
    }

    @Test
    public void testSubstringWithStartAndEndStartAfterEnd() {
        assertEquals("", StringUtils.substring("abc", 2, 0));
    }

    @Test
    public void testSubstringWithStartAndEndEndTooLarge() {
        assertEquals("c", StringUtils.substring("abc", 2, 4));
    }

    @Test
    public void testSubstringWithStartAndEndStartTooLarge() {
        assertEquals("", StringUtils.substring("abc", 4, 6));
    }

    @Test
    public void testSubstringWithStartAndEndEqualStartAndEnd() {
        assertEquals("", StringUtils.substring("abc", 2, 2));
    }

    @Test
    public void testSubstringWithStartAndEndNegative() {
        assertEquals("b", StringUtils.substring("abc", -2, -1));
    }

    @Test
    public void testSubstringWithStartAndEndMixedNegative() {
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }


    // Tests for left
    @Test
    public void testLeftNull() {
        assertNull(StringUtils.left(null, 2));
    }

    @Test
    public void testLeftNegativeLength() {
        assertEquals("", StringUtils.left("abc", -1));
    }

    @Test
    public void testLeftEmptyString() {
        assertEquals("", StringUtils.left("", 2));
    }

    @Test
    public void testLeftZeroLength() {
        assertEquals("", StringUtils.left("abc", 0));
    }

    @Test
    public void testLeftSufficientLength() {
        assertEquals("ab", StringUtils.left("abc", 2));
    }

    @Test
    public void testLeftLengthExceedsString() {
        assertEquals("abc", StringUtils.left("abc", 4));
    }

    // Tests for right
    @Test
    public void testRightNull() {
        assertNull(StringUtils.right(null, 2));
    }

    @Test
    public void testRightNegativeLength() {
        assertEquals("", StringUtils.right("abc", -1));
    }

    @Test
    public void testRightEmptyString() {
        assertEquals("", StringUtils.right("", 2));
    }

    @Test
    public void testRightZeroLength() {
        assertEquals("", StringUtils.right("abc", 0));
    }

    @Test
    public void testRightSufficientLength() {
        assertEquals("bc", StringUtils.right("abc", 2));
    }

    @Test
    public void testRightLengthExceedsString() {
        assertEquals("abc", StringUtils.right("abc", 4));
    }

    // Tests for mid
    @Test
    public void testMidNull() {
        assertNull(StringUtils.mid(null, 0, 2));
    }

    @Test
    public void testMidNegativeLength() {
        assertEquals("", StringUtils.mid("abc", 0, -1));
    }

    @Test
    public void testMidPositionTooLarge() {
        assertEquals("", StringUtils.mid("abc", 4, 2));
    }

    @Test
    public void testMidEmptyString() {
        assertEquals("", StringUtils.mid("", 0, 0));
    }

    @Test
    public void testMidZeroLength() {
        assertEquals("", StringUtils.mid("abc", 0, 0));
    }

    @Test
    public void testMidValid() {
        assertEquals("ab", StringUtils.mid("abc", 0, 2));
        assertEquals("c", StringUtils.mid("abc", 2, 4));
    }

    @Test
    public void testMidLengthExceedsString() {
        assertEquals("abc", StringUtils.mid("abc", 0, 4));
    }

    @Test
    public void testMidNegativePosition() {
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
    }

    // Tests for substringBefore
    @Test
    public void testSubstringBeforeNullString() {
        assertNull(StringUtils.substringBefore(null, "a"));
    }

    @Test
    public void testSubstringBeforeEmptyString() {
        assertEquals("", StringUtils.substringBefore("", "a"));
    }

    @Test
    public void testSubstringBeforeNullSeparator() {
        assertEquals("abc", StringUtils.substringBefore("abc", null));
    }

    @Test
    public void testSubstringBeforeEmptySeparator() {
        assertEquals("", StringUtils.substringBefore("abc", ""));
    }

    @Test
    public void testSubstringBeforeFound() {
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        assertEquals("ab", StringUtils.substringBefore("abc", "c"));
    }

    @Test
    public void testSubstringBeforeNotFound() {
        assertEquals("abc", StringUtils.substringBefore("abc", "d"));
    }

    // Tests for substringAfter
    @Test
    public void testSubstringAfterNullString() {
        assertNull(StringUtils.substringAfter(null, "a"));
    }

    @Test
    public void testSubstringAfterEmptyString() {
        assertEquals("", StringUtils.substringAfter("", "a"));
    }

    @Test
    public void testSubstringAfterNullSeparator() {
        assertEquals("", StringUtils.substringAfter("abc", null));
    }

    @Test
    public void testSubstringAfterEmptySeparator() {
        assertEquals("abc", StringUtils.substringAfter("abc", ""));
    }

    @Test
    public void testSubstringAfterFound() {
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
    }

    @Test
    public void testSubstringAfterNotFound() {
        assertEquals("", StringUtils.substringAfter("abc", "c"));
        assertEquals("", StringUtils.substringAfter("abc", "d"));
    }

    // Tests for substringBeforeLast
    @Test
    public void testSubstringBeforeLastNullString() {
        assertNull(StringUtils.substringBeforeLast(null, "b"));
    }

    @Test
    public void testSubstringBeforeLastEmptyString() {
        assertEquals("", StringUtils.substringBeforeLast("", "b"));
    }

    @Test
    public void testSubstringBeforeLastEmptySeparator() {
        assertEquals("abc", StringUtils.substringBeforeLast("abc", ""));
    }

    @Test
    public void testSubstringBeforeLastNullSeparator() {
        assertEquals("abc", StringUtils.substringBeforeLast("abc", null));
    }

    @Test
    public void testSubstringBeforeLastFound() {
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("ab", StringUtils.substringBeforeLast("abc", "c"));
        assertEquals("", StringUtils.substringBeforeLast("a", "a"));
    }

    @Test
    public void testSubstringBeforeLastNotFound() {
        assertEquals("abc", StringUtils.substringBeforeLast("abc", "d"));
    }

    // Tests for substringAfterLast
    @Test
    public void testSubstringAfterLastNullString() {
        assertNull(StringUtils.substringAfterLast(null, "b"));
    }

    @Test
    public void testSubstringAfterLastEmptyString() {
        assertEquals("", StringUtils.substringAfterLast("", "b"));
    }

    @Test
    public void testSubstringAfterLastEmptySeparator() {
        assertEquals("", StringUtils.substringAfterLast("abc", ""));
    }

    @Test
    public void testSubstringAfterLastNullSeparator() {
        assertEquals("", StringUtils.substringAfterLast("abc", null));
    }

    @Test
    public void testSubstringAfterLastFound() {
        assertEquals("bc", StringUtils.substringAfterLast("abc", "a"));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
    }

    @Test
    public void testSubstringAfterLastSeparatorAtEnd() {
        assertEquals("", StringUtils.substringAfterLast("abc", "c"));
    }

    @Test
    public void testSubstringAfterLastNotFound() {
        assertEquals("", StringUtils.substringAfterLast("abc", "d"));
    }

    // Tests for substringBetween
    @Test
    public void testSubstringBetweenNullString() {
        assertNull(StringUtils.substringBetween(null, "tag"));
    }

    @Test
    public void testSubstringBetweenNullTag() {
        assertNull(StringUtils.substringBetween("tagabctag", null));
    }

    @Test
    public void testSubstringBetweenEmptyTag() {
        assertEquals("", StringUtils.substringBetween("tagabctag", ""));
    }

    @Test
    public void testSubstringBetweenEmptyString() {
        assertNull(StringUtils.substringBetween("", "tag"));
    }

    @Test
    public void testSubstringBetweenFound() {
        assertEquals("abc", StringUtils.substringBetween("tagabctag", "tag"));
    }

    @Test
    public void testSubstringBetweenNotFound() {
        assertNull(StringUtils.substringBetween("abc", "tag"));
    }

    @Test
    public void testSubstringBetweenWithOpenAndCloseNull() {
        assertNull(StringUtils.substringBetween("abc", null, "]"));
        assertNull(StringUtils.substringBetween("abc", "[", null));
    }

    @Test
    public void testSubstringBetweenWithOpenAndCloseEmpty() {
        assertEquals("", StringUtils.substringBetween("yabcz", "", ""));
    }

    @Test
    public void testSubstringBetweenWithOpenAndCloseFound() {
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertEquals("abc", StringUtils.substringBetween("yabcz", "y", "z"));
    }

    @Test
    public void testSubstringBetweenWithOpenAndCloseNotFound() {
        assertNull(StringUtils.substringBetween("abc", "[", "]"));
    }

    @Test
    public void testSubstringBetweenMultipleMatches() {
        assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));
    }

    // Tests for substringsBetween
    @Test
    public void testSubstringsBetweenNullString() {
        assertNull(StringUtils.substringsBetween(null, "[", "]"));
    }

    @Test
    public void testSubstringsBetweenNullOpen() {
        assertNull(StringUtils.substringsBetween("abc", null, "]"));
    }

    @Test
    public void testSubstringsBetweenNullClose() {
        assertNull(StringUtils.substringsBetween("abc", "[", null));
    }

    @Test
    public void testSubstringsBetweenEmptyOpen() {
        assertNull(StringUtils.substringsBetween("abc", "", "]"));
    }

    @Test
    public void testSubstringsBetweenEmptyClose() {
        assertNull(StringUtils.substringsBetween("abc", "[", ""));
    }

    @Test
    public void testSubstringsBetweenEmptyString() {
        assertEquals(0, StringUtils.substringsBetween("", "[", "]").length);
    }

    @Test
    public void testSubstringsBetweenFound() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.substringsBetween("[a][b][c]", "[", "]"));
    }

    @Test
    public void testSubstringsBetweenNotFound() {
        assertNull(StringUtils.substringsBetween("abc", "[", "]"));
    }

    // Tests for split
    @Test
    public void testSplitNull() {
        assertNull(StringUtils.split(null));
    }

    @Test
    public void testSplitEmptyString() {
        assertEquals(0, StringUtils.split("").length);
    }

    @Test
    public void testSplitWhitespace() {
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc def"));
    }

    @Test
    public void testSplitMultipleWhitespace() {
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc  def"));
    }

    @Test
    public void testSplitLeadingAndTrailingWhitespace() {
        assertArrayEquals(new String[]{"abc"}, StringUtils.split(" abc "));
    }

    @Test
    public void testSplitWithCharSeparator() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a.b.c", '.'));
    }

    @Test
    public void testSplitWithCharSeparatorAdjacent() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a..b.c", '.'));
    }

    @Test
    public void testSplitWithCharSeparatorNoMatch() {
        assertArrayEquals(new String[]{"a:b:c"}, StringUtils.split("a:b:c", '.'));
    }

    @Test
    public void testSplitWithStringSeparator() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitWithStringSeparatorAdjacent() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab::cd:ef", ":"));
    }

    @Test
    public void testSplitWithStringSeparatorMax() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.split("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitWithStringSeparatorMaxZero() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":", 0));
    }

    // Tests for splitByWholeSeparator
    @Test
    public void testSplitByWholeSeparatorNullString() {
        assertNull(StringUtils.splitByWholeSeparator(null, ":"));
    }

    @Test
    public void testSplitByWholeSeparatorEmptyString() {
        assertEquals(0, StringUtils.splitByWholeSeparator("", ":").length);
    }

    @Test
    public void testSplitByWholeSeparatorNullSeparator() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparator("ab de fg", null));
    }

    @Test
    public void testSplitByWholeSeparatorEmptySeparator() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparator("ab de fg", ""));
    }

    @Test
    public void testSplitByWholeSeparatorFound() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":"));
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-"));
    }

    @Test
    public void testSplitByWholeSeparatorMax() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitByWholeSeparatorMaxZero() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 0));
    }

    // Tests for splitByWholeSeparatorPreserveAllTokens
    @Test
    public void testSplitByWholeSeparatorPreserveAllTokensNullString() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokensEmptyString() {
        assertEquals(0, StringUtils.splitByWholeSeparatorPreserveAllTokens("", ":").length);
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokensNullSeparator() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokensEmptySeparator() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", ""));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokensFound() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokensAdjacent() {
        assertArrayEquals(new String[]{"ab", "", "cd", "", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab::cd::ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokensMax() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokensMaxZero() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":", 0));
    }

    // Tests for splitPreserveAllTokens
    @Test
    public void testSplitPreserveAllTokensNullString() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
    }

    @Test
    public void testSplitPreserveAllTokensEmptyString() {
        assertEquals(0, StringUtils.splitPreserveAllTokens("").length);
    }

    @Test
    public void testSplitPreserveAllTokensWhitespace() {
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.splitPreserveAllTokens("abc def"));
    }

    @Test
    public void testSplitPreserveAllTokensMultipleWhitespace() {
        assertArrayEquals(new String[]{"abc", "", "def"}, StringUtils.splitPreserveAllTokens("abc  def"));
    }

    @Test
    public void testSplitPreserveAllTokensLeadingAndTrailingWhitespace() {
        assertArrayEquals(new String[]{"", "abc", ""}, StringUtils.splitPreserveAllTokens(" abc "));
    }

    @Test
    public void testSplitPreserveAllTokensWithCharSeparator() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.splitPreserveAllTokens("a.b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokensWithCharSeparatorAdjacent() {
        assertArrayEquals(new String[]{"a", "", "b", "c"}, StringUtils.splitPreserveAllTokens("a..b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokensWithStringSeparator() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitPreserveAllTokens("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitPreserveAllTokensWithStringSeparatorAdjacent() {
        assertArrayEquals(new String[]{"ab", "", "cd", "ef"}, StringUtils.splitPreserveAllTokens("ab::cd:ef", ":"));
    }

    @Test
    public void testSplitPreserveAllTokensWithStringSeparatorMax() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitPreserveAllTokensWithStringSeparatorMaxZero() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 0));
    }

    // Tests for join
    @Test
    public void testJoinObjectArrayNull() {
        assertNull(StringUtils.join((Object[]) null));
    }

    @Test
    public void testJoinObjectArrayEmpty() {
        assertEquals("", StringUtils.join(new Object[0]));
    }

    @Test
    public void testJoinObjectArraySingleNull() {
        assertEquals("", StringUtils.join(new Object[]{null}));
    }


    @Test
    public void testJoinObjectArrayWithNullAndEmpty() {
        assertEquals("a", StringUtils.join(new Object[]{null, "", "a"}));
    }

    @Test
    public void testJoinObjectArrayWithSeparatorChar() {
        assertEquals("a;b;c", StringUtils.join(new Object[]{"a", "b", "c"}, ';'));
    }

    @Test
    public void testJoinObjectArrayWithSeparatorCharAndNull() {
        assertEquals("a", StringUtils.join(new Object[]{"a", "b", "c"}, null, 0, 1)); // Joining only 'a'
    }

    @Test
    public void testJoinObjectArrayWithSeparatorString() {
        assertEquals("a--b--c", StringUtils.join(new Object[]{"a", "b", "c"}, "--"));
    }

    @Test
    public void testJoinObjectArrayWithSeparatorStringNull() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, null));
    }

    @Test
    public void testJoinObjectArrayWithSeparatorStringEmpty() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, ""));
    }

    @Test
    public void testJoinObjectArrayWithSeparatorStringAndNulls() {
        assertEquals(",,a", StringUtils.join(new Object[]{null, "", "a"}, ','));
    }

    @Test
    public void testJoinIteratorChar() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a;b;c", StringUtils.join(list.iterator(), ';'));
    }

    @Test
    public void testJoinIteratorString() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a--b--c", StringUtils.join(list.iterator(), "--"));
    }

    @Test
    public void testJoinIterableChar() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a;b;c", StringUtils.join(list, ';'));
    }

    @Test
    public void testJoinIterableString() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a--b--c", StringUtils.join(list, "--"));
    }

    // Tests for deleteWhitespace
    @Test
    public void testDeleteWhitespaceNull() {
        assertNull(StringUtils.deleteWhitespace(null));
    }

    @Test
    public void testDeleteWhitespaceEmpty() {
        assertEquals("", StringUtils.deleteWhitespace(""));
    }

    @Test
    public void testDeleteWhitespaceNoWhitespace() {
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
    }

    @Test
    public void testDeleteWhitespaceWithWhitespace() {
        assertEquals("abc", StringUtils.deleteWhitespace("   ab  c  "));
    }

    // Tests for removeStart
    @Test
    public void testRemoveStartNullString() {
        assertNull(StringUtils.removeStart(null, "abc"));
    }

    @Test
    public void testRemoveStartEmptyString() {
        assertEquals("", StringUtils.removeStart("", "abc"));
    }

    @Test
    public void testRemoveStartNullRemove() {
        assertEquals("abc", StringUtils.removeStart("abc", null));
    }

    @Test
    public void testRemoveStartEmptyRemove() {
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }

    @Test
    public void testRemoveStartFound() {
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
    }

    @Test
    public void testRemoveStartNotFound() {
        assertEquals("domain.com", StringUtils.removeStart("domain.com", "www."));
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));
    }

    // Tests for removeStartIgnoreCase
    @Test
    public void testRemoveStartIgnoreCaseNullString() {
        assertNull(StringUtils.removeStartIgnoreCase(null, "www."));
    }

    @Test
    public void testRemoveStartIgnoreCaseEmptyString() {
        assertEquals("", StringUtils.removeStartIgnoreCase("", "www."));
    }

    @Test
    public void testRemoveStartIgnoreCaseNullRemove() {
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", null));
    }

    @Test
    public void testRemoveStartIgnoreCaseEmptyRemove() {
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", ""));
    }

    @Test
    public void testRemoveStartIgnoreCaseFound() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "www."));
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."));
    }

    @Test
    public void testRemoveStartIgnoreCaseNotFound() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("domain.com", "www."));
    }

    // Tests for removeEnd
    @Test
    public void testRemoveEndNullString() {
        assertNull(StringUtils.removeEnd(null, ".com"));
    }

    @Test
    public void testRemoveEndEmptyString() {
        assertEquals("", StringUtils.removeEnd("", ".com"));
    }

    @Test
    public void testRemoveEndNullRemove() {
        assertEquals("abc", StringUtils.removeEnd("abc", null));
    }

    @Test
    public void testRemoveEndEmptyRemove() {
        assertEquals("abc", StringUtils.removeEnd("abc", ""));
    }

    @Test
    public void testRemoveEndFound() {
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
    }

    @Test
    public void testRemoveEndNotFound() {
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", ".org"));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"));
    }

    // Tests for removeEndIgnoreCase
    @Test
    public void testRemoveEndIgnoreCaseNullString() {
        assertNull(StringUtils.removeEndIgnoreCase(null, ".COM"));
    }

    @Test
    public void testRemoveEndIgnoreCaseEmptyString() {
        assertEquals("", StringUtils.removeEndIgnoreCase("", ".COM"));
    }

    @Test
    public void testRemoveEndIgnoreCaseNullRemove() {
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", null));
    }

    @Test
    public void testRemoveEndIgnoreCaseEmptyRemove() {
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", ""));
    }

    @Test
    public void testRemoveEndIgnoreCaseFound() {
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.com", ".com"));
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"));
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"));
    }

    @Test
    public void testRemoveEndIgnoreCaseNotFound() {
        assertEquals("www.domain.com", StringUtils.removeEndIgnoreCase("www.domain.com", ".org"));
    }

    // Tests for remove
    @Test
    public void testRemoveNullString() {
        assertNull(StringUtils.remove(null, "abc"));
    }

    @Test
    public void testRemoveEmptyString() {
        assertEquals("", StringUtils.remove("", "abc"));
    }

    @Test
    public void testRemoveNullRemove() {
        assertEquals("abc", StringUtils.remove("abc", null));
    }

    @Test
    public void testRemoveEmptyRemove() {
        assertEquals("abc", StringUtils.remove("abc", ""));
    }

    @Test
    public void testRemoveFound() {
        assertEquals("qd", StringUtils.remove("queued", "ue"));
    }

    @Test
    public void testRemoveNotFound() {
        assertEquals("queued", StringUtils.remove("queued", "zz"));
    }

    @Test
    public void testRemoveCharNullString() {
        assertNull(StringUtils.remove(null, 'a'));
    }

    @Test
    public void testRemoveCharEmptyString() {
        assertEquals("", StringUtils.remove("", 'a'));
    }

    @Test
    public void testRemoveCharFound() {
        assertEquals("qeed", StringUtils.remove("queued", 'u'));
    }

    @Test
    public void testRemoveCharNotFound() {
        assertEquals("queued", StringUtils.remove("queued", 'z'));
    }

    // Tests for replaceOnce
    @Test
    public void testReplaceOnceNullText() {
        assertNull(StringUtils.replaceOnce(null, "a", "z"));
    }

    @Test
    public void testReplaceOnceEmptyText() {
        assertEquals("", StringUtils.replaceOnce("", "a", "z"));
    }

    @Test
    public void testReplaceOnceNullSearch() {
        assertEquals("any", StringUtils.replaceOnce("any", null, "z"));
    }

    @Test
    public void testReplaceOnceNullReplacement() {
        assertEquals("any", StringUtils.replaceOnce("any", "a", null));
    }

    @Test
    public void testReplaceOnceEmptySearch() {
        assertEquals("any", StringUtils.replaceOnce("any", "", "z"));
    }

    @Test
    public void testReplaceOnceFoundOnce() {
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
    }

    @Test
    public void testReplaceOnceFoundMultipleButReplacedOnce() {
        assertEquals("zbaa", StringUtils.replaceOnce("abaa", "a", "z"));
    }

    @Test
    public void testReplaceOnceNotFound() {
        assertEquals("aba", StringUtils.replaceOnce("aba", "z", "x"));
    }

    @Test
    public void testReplaceOnceReplaceWithEmpty() {
        assertEquals("ba", StringUtils.replaceOnce("aba", "a", ""));
    }

    // Tests for replace
    @Test
    public void testReplaceNullText() {
        assertNull(StringUtils.replace(null, "a", "z"));
    }

    @Test
    public void testReplaceEmptyText() {
        assertEquals("", StringUtils.replace("", "a", "z"));
    }

    @Test
    public void testReplaceNullSearch() {
        assertEquals("any", StringUtils.replace("any", null, "z"));
    }

    @Test
    public void testReplaceNullReplacement() {
        assertEquals("any", StringUtils.replace("any", "a", null));
    }

    @Test
    public void testReplaceEmptySearch() {
        assertEquals("any", StringUtils.replace("any", "", "z"));
    }

    @Test
    public void testReplaceFound() {
        assertEquals("zbzbz", StringUtils.replace("ababab", "ab", "z"));
    }

    @Test
    public void testReplaceNotFound() {
        assertEquals("ababab", StringUtils.replace("ababab", "z", "x"));
    }

    @Test
    public void testReplaceAll() {
        assertEquals("zbzbz", StringUtils.replace("ababab", "ab", "z"));
    }

    @Test
    public void testReplaceNone() {
        assertEquals("ababab", StringUtils.replace("ababab", "z", "x"));
    }

    @Test
    public void testReplaceWithEmpty() {
        assertEquals("b", StringUtils.replace("aba", "a", ""));
    }

    @Test
    public void testReplaceMaxOne() {
        assertEquals("zbaa", StringUtils.replace("abaa", "a", "z", 1));
    }

    @Test
    public void testReplaceMaxTwo() {
        assertEquals("zbza", StringUtils.replace("abaa", "a", "z", 2));
    }

    @Test
    public void testReplaceMaxNegative() {
        assertEquals("zbzbz", StringUtils.replace("ababab", "ab", "z", -1));
    }

    @Test
    public void testReplaceMaxZero() {
        assertEquals("abaa", StringUtils.replace("abaa", "a", "z", 0));
    }

    // Tests for replaceEach
    @Test
    public void testReplaceEachNullText() {
        assertNull(StringUtils.replaceEach(null, new String[]{"a"}, new String[]{"z"}));
    }

    @Test
    public void testReplaceEachEmptyText() {
        assertEquals("", StringUtils.replaceEach("", new String[]{"a"}, new String[]{"z"}));
    }

    @Test
    public void testReplaceEachNullSearchList() {
        assertEquals("aba", StringUtils.replaceEach("aba", null, new String[]{"z"}));
    }

    @Test
    public void testReplaceEachNullReplacementList() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{"a"}, null));
    }

    @Test
    public void testReplaceEachEmptySearchList() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[0], new String[]{"z"}));
    }

    @Test
    public void testReplaceEachEmptyReplacementList() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{"a"}, new String[0]));
    }


    @Test
    public void testReplaceEachNoRepeat() {
        assertEquals("dcte", StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}));
    }

    // Tests for replaceEachRepeatedly
    
    // Tests for replaceChars
    @Test
    public void testReplaceCharsNullString() {
        assertNull(StringUtils.replaceChars(null, 'a', 'b'));
    }

    @Test
    public void testReplaceCharsEmptyString() {
        assertEquals("", StringUtils.replaceChars("", 'a', 'b'));
    }

    @Test
    public void testReplaceCharsFound() {
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
    }

    @Test
    public void testReplaceCharsNotFound() {
        assertEquals("abcba", StringUtils.replaceChars("abcba", 'z', 'y'));
    }

    @Test
    public void testReplaceCharsMultipleSearchAndReplace() {
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
    }

    @Test
    public void testReplaceCharsSearchLongerThanReplace() {
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
    }

    @Test
    public void testReplaceCharsReplaceLongerThanSearch() {
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yzx"));
    }

    @Test
    public void testReplaceCharsNullReplaceChars() {
        assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
    }

    @Test
    public void testReplaceCharsEmptyReplaceChars() {
        assertEquals("ac", StringUtils.replaceChars("abc", "b", ""));
    }

    @Test
    public void testReplaceCharsNullSearchChars() {
        assertEquals("abc", StringUtils.replaceChars("abc", null, "yz"));
    }

    @Test
    public void testReplaceCharsEmptySearchChars() {
        assertEquals("abc", StringUtils.replaceChars("abc", "", "yz"));
    }

    // Tests for overlay
    @Test
    public void testOverlayNullString() {
        assertNull(StringUtils.overlay(null, "zzzz", 2, 4));
    }

    @Test
    public void testOverlayNullOverlay() {
        assertEquals("abef", StringUtils.overlay("abcdef", null, 2, 4));
    }

    @Test
    public void testOverlayEmptyOverlay() {
        assertEquals("abef", StringUtils.overlay("abcdef", "", 2, 4));
    }

    @Test
    public void testOverlayStartAfterEnd() {
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2));
    }

    @Test
    public void testOverlayFound() {
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
    }

    @Test
    public void testOverlayStartNegative() {
        assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4));
    }

    @Test
    public void testOverlayEndTooLarge() {
        assertEquals("abzzzz", StringUtils.overlay("abcdef", "zzzz", 2, 8));
    }

    @Test
    public void testOverlayStartAndEndNegative() {
        assertEquals("zzzzabcdef", StringUtils.overlay("abcdef", "zzzz", -2, -3));
    }

    @Test
    public void testOverlayStartAndEndTooLarge() {
        assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 8, 10));
    }

    @Test
    public void testOverlayEmptyStringAndZeroBounds() {
        assertEquals("abc", StringUtils.overlay("", "abc", 0, 0));
    }


    // Tests for chomp
    @Test
    public void testChompNullString() {
        assertNull(StringUtils.chomp(null));
    }

    @Test
    public void testChompEmptyString() {
        assertEquals("", StringUtils.chomp(""));
    }

    @Test
    public void testChompSingleNewlineCR() {
        assertEquals("", StringUtils.chomp("\r"));
    }

    @Test
    public void testChompSingleNewlineLF() {
        assertEquals("", StringUtils.chomp("\n"));
    }

    @Test
    public void testChompNewlineCRLF() {
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
    }

    @Test
    public void testChompNewlineLF() {
        assertEquals("abc", StringUtils.chomp("abc\n"));
    }

    @Test
    public void testChompNewlineCR() {
        assertEquals("abc ", StringUtils.chomp("abc \r"));
    }

    @Test
    public void testChompMultipleNewlines() {
        assertEquals("abc\r\n", StringUtils.chomp("abc\r\n\r\n"));
    }

    @Test
    public void testChompMixedNewlines() {
        assertEquals("abc\n", StringUtils.chomp("abc\n\r"));
    }

    @Test
    public void testChompNoNewline() {
        assertEquals("abc\n\rabc", StringUtils.chomp("abc\n\rabc"));
    }

    // Tests for chomp with separator
    @Test
    public void testChompSeparatorNullString() {
        assertNull(StringUtils.chomp(null, "bar"));
    }

    @Test
    public void testChompSeparatorEmptyString() {
        assertEquals("", StringUtils.chomp("", "bar"));
    }

    @Test
    public void testChompSeparatorNullSeparator() {
        assertEquals("foo", StringUtils.chomp("foo", null));
    }

    @Test
    public void testChompSeparatorEmptySeparator() {
        assertEquals("foo", StringUtils.chomp("foo", ""));
    }

    @Test
    public void testChompSeparatorFound() {
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
    }

    @Test
    public void testChompSeparatorNotFound() {
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
    }

    @Test
    public void testChompSeparatorWholeString() {
        assertEquals("", StringUtils.chomp("foo", "foo"));
    }

    @Test
    public void testChompSeparatorWithSpace() {
        assertEquals("foo ", StringUtils.chomp("foo ", "foo"));
    }

    // Tests for chop
    @Test
    public void testChopNull() {
        assertNull(StringUtils.chop(null));
    }

    @Test
    public void testChopEmpty() {
        assertEquals("", StringUtils.chop(""));
    }

    @Test
    public void testChopSingleChar() {
        assertEquals("", StringUtils.chop("a"));
    }

    @Test
    public void testChopShortString() {
        assertEquals("ab", StringUtils.chop("abc"));
    }

    @Test
    public void testChopTrailingLF() {
        assertEquals("abc", StringUtils.chop("abc\n"));
    }

    @Test
    public void testChopTrailingCRLF() {
        assertEquals("abc", StringUtils.chop("abc\r\n"));
    }

    @Test
    public void testChopTrailingCR() {
        assertEquals("abc ", StringUtils.chop("abc \r"));
    }

    @Test
    public void testChopMixedTrailing() {
        assertEquals("abc\nab", StringUtils.chop("abc\nabc"));
    }

    @Test
    public void testChopOnlyCRLF() {
        assertEquals("", StringUtils.chop("\r\n"));
    }

    // Tests for repeat
    @Test
    public void testRepeatNullString() {
        assertNull(StringUtils.repeat(null, 2));
    }

    @Test
    public void testRepeatZeroTimes() {
        assertEquals("", StringUtils.repeat("", 0));
    }

    @Test
    public void testRepeatEmptyStringPositiveTimes() {
        assertEquals("", StringUtils.repeat("", 2));
    }

    @Test
    public void testRepeatPositiveTimes() {
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("ababab", StringUtils.repeat("ab", 3));
    }

    @Test
    public void testRepeatNegativeTimes() {
        assertEquals("", StringUtils.repeat("a", -2));
    }

    @Test
    public void testRepeatWithSeparatorNullString() {
        assertNull(StringUtils.repeat(null, null, 2));
    }

    @Test
    public void testRepeatWithSeparatorNullSeparator() {
        assertEquals("aa", StringUtils.repeat("a", null, 2));
    }

    @Test
    public void testRepeatWithSeparatorEmptyString() {
        assertEquals("xxx", StringUtils.repeat("", "x", 3));
    }

    @Test
    public void testRepeatWithSeparatorSimple() {
        assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }

    @Test
    public void testRepeatWithSeparatorNegativeRepeat() {
        assertEquals("a", StringUtils.repeat("a", ", ", -1));
    }

    // Tests for rightPad
    @Test
    public void testRightPadNull() {
        assertNull(StringUtils.rightPad(null, 3));
    }

    @Test
    public void testRightPadSizeZero() {
        assertEquals("bat", StringUtils.rightPad("bat", 0));
    }

    @Test
    public void testRightPadSizeSmallerThanString() {
        assertEquals("bat", StringUtils.rightPad("bat", 3));
        assertEquals("bat", StringUtils.rightPad("bat", 1));
    }

    @Test
    public void testRightPadSizeLargerThanString() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
    }

    @Test
    public void testRightPadSizeNegative() {
        assertEquals("bat", StringUtils.rightPad("bat", -1));
    }

    @Test
    public void testRightPadEmptyString() {
        assertEquals("   ", StringUtils.rightPad("", 3));
    }

    @Test
    public void testRightPadWithChar() {
        assertEquals("batzz", StringUtils.rightPad("bat", 5, 'z'));
    }

    @Test
    public void testRightPadWithCharPadLengthExceedsSize() {
        assertEquals("batz", StringUtils.rightPad("bat", 4, "xyz"));
    }

    @Test
    public void testRightPadWithCharPadLengthEqualsSize() {
        assertEquals("batxyz", StringUtils.rightPad("bat", 6, "xyz"));
    }

    @Test
    public void testRightPadWithCharPadLengthSmallerThanSize() {
        assertEquals("batyzyzy", StringUtils.rightPad("bat", 8, "yz"));
    }

    @Test
    public void testRightPadWithNullPadString() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, null));
    }

    @Test
    public void testRightPadWithEmptyPadString() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, ""));
    }


    // Tests for leftPad
    @Test
    public void testLeftPadNull() {
        assertNull(StringUtils.leftPad(null, 3));
    }

    @Test
    public void testLeftPadSizeZero() {
        assertEquals("bat", StringUtils.leftPad("bat", 0));
    }

    @Test
    public void testLeftPadSizeSmallerThanString() {
        assertEquals("bat", StringUtils.leftPad("bat", 3));
        assertEquals("bat", StringUtils.leftPad("bat", 1));
    }

    @Test
    public void testLeftPadSizeLargerThanString() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5));
    }

    @Test
    public void testLeftPadSizeNegative() {
        assertEquals("bat", StringUtils.leftPad("bat", -1));
    }

    @Test
    public void testLeftPadEmptyString() {
        assertEquals("   ", StringUtils.leftPad("", 3));
    }

    @Test
    public void testLeftPadWithChar() {
        assertEquals("zzbat", StringUtils.leftPad("bat", 5, 'z'));
    }

    @Test
    public void testLeftPadWithCharPadLengthExceedsSize() {
        assertEquals("zbat", StringUtils.leftPad("bat", 4, "xyz"));
    }

    @Test
    public void testLeftPadWithCharPadLengthEqualsSize() {
        assertEquals("xyzbat", StringUtils.leftPad("bat", 6, "xyz"));
    }

    @Test
    public void testLeftPadWithCharPadLengthSmallerThanSize() {
        assertEquals("yzyzybat", StringUtils.leftPad("bat", 8, "yz"));
    }

    @Test
    public void testLeftPadWithNullPadString() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5, null));
    }

    @Test
    public void testLeftPadWithEmptyPadString() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5, ""));
    }

    // Tests for center
    @Test
    public void testCenterNull() {
        assertNull(StringUtils.center(null, 4));
    }

    @Test
    public void testCenterSizeNegative() {
        assertEquals("ab", StringUtils.center("ab", -1));
    }

    @Test
    public void testCenterSizeSmallerThanString() {
        assertEquals("abcd", StringUtils.center("abcd", 2));
    }

    @Test
    public void testCenterEmptyString() {
        assertEquals("    ", StringUtils.center("", 4));
    }

    @Test
    public void testCenterWithSpacePadding() {
        assertEquals(" ab ", StringUtils.center("ab", 4));
        assertEquals(" a  ", StringUtils.center("a", 4));
    }

    @Test
    public void testCenterWithCharPadding() {
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
    }





    // Tests for upperCase
    @Test
    public void testUpperCaseNull() {
        assertNull(StringUtils.upperCase(null));
    }

    @Test
    public void testUpperCaseEmpty() {
        assertEquals("", StringUtils.upperCase(""));
    }

    @Test
    public void testUpperCaseSimple() {
        assertEquals("ABC", StringUtils.upperCase("aBc"));
    }

    @Test
    public void testUpperCaseWithLocale() {
        assertEquals("ABC", StringUtils.upperCase("aBc", Locale.ENGLISH));
    }

    // Tests for lowerCase
    @Test
    public void testLowerCaseNull() {
        assertNull(StringUtils.lowerCase(null));
    }

    @Test
    public void testLowerCaseEmpty() {
        assertEquals("", StringUtils.lowerCase(""));
    }

    @Test
    public void testLowerCaseSimple() {
        assertEquals("abc", StringUtils.lowerCase("aBc"));
    }

    @Test
    public void testLowerCaseWithLocale() {
        assertEquals("abc", StringUtils.lowerCase("aBc", Locale.ENGLISH));
    }

    // Tests for capitalize
    @Test
    public void testCapitalizeNull() {
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    public void testCapitalizeEmpty() {
        assertEquals("", StringUtils.capitalize(""));
    }

    @Test
    public void testCapitalizeSimple() {
        assertEquals("Cat", StringUtils.capitalize("cat"));
        assertEquals("CAt", StringUtils.capitalize("cAt"));
    }

    // Tests for uncapitalize
    @Test
    public void testUncapitalizeNull() {
        assertNull(StringUtils.uncapitalize(null));
    }

    @Test
    public void testUncapitalizeEmpty() {
        assertEquals("", StringUtils.uncapitalize(""));
    }

    @Test
    public void testUncapitalizeSimple() {
        assertEquals("cat", StringUtils.uncapitalize("Cat"));
        assertEquals("cAT", StringUtils.uncapitalize("CAT"));
    }

    // Tests for swapCase
    @Test
    public void testSwapCaseNull() {
        assertNull(StringUtils.swapCase(null));
    }

    @Test
    public void testSwapCaseEmpty() {
        assertEquals("", StringUtils.swapCase(""));
    }

    @Test
    public void testSwapCaseSimple() {
        assertEquals("tHE DOG HAS A bone", StringUtils.swapCase("The dog has a BONE"));
    }

    // Tests for countMatches
    @Test
    public void testCountMatchesNullString() {
        assertEquals(0, StringUtils.countMatches(null, "a"));
    }

    @Test
    public void testCountMatchesEmptyString() {
        assertEquals(0, StringUtils.countMatches("", "a"));
    }

    @Test
    public void testCountMatchesNullSub() {
        assertEquals(0, StringUtils.countMatches("abba", null));
    }

    @Test
    public void testCountMatchesEmptySub() {
        assertEquals(0, StringUtils.countMatches("abba", ""));
    }

    @Test
    public void testCountMatchesFound() {
        assertEquals(2, StringUtils.countMatches("abba", "a"));
        assertEquals(1, StringUtils.countMatches("abba", "ab"));
    }

    @Test
    public void testCountMatchesNotFound() {
        assertEquals(0, StringUtils.countMatches("abba", "xxx"));
    }

    // Tests for isAlpha
    @Test
    public void testIsAlphaNull() {
        assertFalse(StringUtils.isAlpha(null));
    }

    @Test
    public void testIsAlphaEmpty() {
        assertTrue(StringUtils.isAlpha(""));
    }

    @Test
    public void testIsAlphaSpaces() {
        assertFalse(StringUtils.isAlpha("  "));
    }

    @Test
    public void testIsAlphaOnlyLetters() {
        assertTrue(StringUtils.isAlpha("abc"));
    }

    @Test
    public void testIsAlphaWithDigit() {
        assertFalse(StringUtils.isAlpha("ab2c"));
    }

    @Test
    public void testIsAlphaWithSymbol() {
        assertFalse(StringUtils.isAlpha("ab-c"));
    }

    // Tests for isAlphaSpace
    @Test
    public void testIsAlphaSpaceNull() {
        assertFalse(StringUtils.isAlphaSpace(null));
    }

    @Test
    public void testIsAlphaSpaceEmpty() {
        assertTrue(StringUtils.isAlphaSpace(""));
    }

    @Test
    public void testIsAlphaSpaceSpaces() {
        assertTrue(StringUtils.isAlphaSpace("  "));
    }

    @Test
    public void testIsAlphaSpaceOnlyLetters() {
        assertTrue(StringUtils.isAlphaSpace("abc"));
    }

    @Test
    public void testIsAlphaSpaceWithSpace() {
        assertTrue(StringUtils.isAlphaSpace("ab c"));
    }

    @Test
    public void testIsAlphaSpaceWithDigit() {
        assertFalse(StringUtils.isAlphaSpace("ab2c"));
    }

    @Test
    public void testIsAlphaSpaceWithSymbol() {
        assertFalse(StringUtils.isAlphaSpace("ab-c"));
    }

    // Tests for isAlphanumeric
    @Test
    public void testIsAlphanumericNull() {
        assertFalse(StringUtils.isAlphanumeric(null));
    }

    @Test
    public void testIsAlphanumericEmpty() {
        assertTrue(StringUtils.isAlphanumeric(""));
    }

    @Test
    public void testIsAlphanumericSpaces() {
        assertFalse(StringUtils.isAlphanumeric("  "));
    }

    @Test
    public void testIsAlphanumericOnlyLetters() {
        assertTrue(StringUtils.isAlphanumeric("abc"));
    }

    @Test
    public void testIsAlphanumericWithSpace() {
        assertFalse(StringUtils.isAlphanumeric("ab c"));
    }

    @Test
    public void testIsAlphanumericWithDigit() {
        assertTrue(StringUtils.isAlphanumeric("ab2c"));
    }

    @Test
    public void testIsAlphanumericWithSymbol() {
        assertFalse(StringUtils.isAlphanumeric("ab-c"));
    }

    // Tests for isAlphanumericSpace
    @Test
    public void testIsAlphanumericSpaceNull() {
        assertFalse(StringUtils.isAlphanumericSpace(null));
    }

    @Test
    public void testIsAlphanumericSpaceEmpty() {
        assertTrue(StringUtils.isAlphanumericSpace(""));
    }

    @Test
    public void testIsAlphanumericSpaceSpaces() {
        assertTrue(StringUtils.isAlphanumericSpace("  "));
    }

    @Test
    public void testIsAlphanumericSpaceOnlyLetters() {
        assertTrue(StringUtils.isAlphanumericSpace("abc"));
    }

    @Test
    public void testIsAlphanumericSpaceWithSpace() {
        assertTrue(StringUtils.isAlphanumericSpace("ab c"));
    }

    @Test
    public void testIsAlphanumericSpaceWithDigit() {
        assertTrue(StringUtils.isAlphanumericSpace("ab2c"));
    }

    @Test
    public void testIsAlphanumericSpaceWithSymbol() {
        assertFalse(StringUtils.isAlphanumericSpace("ab-c"));
    }

    // Tests for isAsciiPrintable
    @Test
    public void testIsAsciiPrintableNull() {
        assertFalse(StringUtils.isAsciiPrintable(null));
    }

    @Test
    public void testIsAsciiPrintableEmpty() {
        assertTrue(StringUtils.isAsciiPrintable(""));
    }

    @Test
    public void testIsAsciiPrintableSpace() {
        assertTrue(StringUtils.isAsciiPrintable(" "));
    }

    @Test
    public void testIsAsciiPrintableLettersDigitsSymbols() {
        assertTrue(StringUtils.isAsciiPrintable("Ceki"));
        assertTrue(StringUtils.isAsciiPrintable("!ab-c~"));
    }

    @Test
    public void testIsAsciiPrintableAsciiRange() {
        assertTrue(StringUtils.isAsciiPrintable("\u0020")); // Space
        assertTrue(StringUtils.isAsciiPrintable("\u007e")); // Tilde
    }

    @Test
    public void testIsAsciiPrintableNonAsciiPrintable() {
        assertFalse(StringUtils.isAsciiPrintable("\u007f")); // DEL character
        assertFalse(StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc")); // Non-ASCII characters
    }

    // Tests for isNumeric
    @Test
    public void testIsNumericNull() {
        assertFalse(StringUtils.isNumeric(null));
    }

    @Test
    public void testIsNumericEmpty() {
        assertTrue(StringUtils.isNumeric(""));
    }

    @Test
    public void testIsNumericSpaces() {
        assertFalse(StringUtils.isNumeric("  "));
    }

    @Test
    public void testIsNumericOnlyDigits() {
        assertTrue(StringUtils.isNumeric("123"));
    }

    @Test
    public void testIsNumericWithSpace() {
        assertFalse(StringUtils.isNumeric("12 3"));
    }

    @Test
    public void testIsNumericWithLetter() {
        assertFalse(StringUtils.isNumeric("ab2c"));
    }

    @Test
    public void testIsNumericWithSymbol() {
        assertFalse(StringUtils.isNumeric("12-3"));
    }

    @Test
    public void testIsNumericWithDecimalPoint() {
        assertFalse(StringUtils.isNumeric("12.3"));
    }

    // Tests for isNumericSpace
    @Test
    public void testIsNumericSpaceNull() {
        assertFalse(StringUtils.isNumericSpace(null));
    }

    @Test
    public void testIsNumericSpaceEmpty() {
        assertTrue(StringUtils.isNumericSpace(""));
    }

    @Test
    public void testIsNumericSpaceSpaces() {
        assertTrue(StringUtils.isNumericSpace("  "));
    }

    @Test
    public void testIsNumericSpaceOnlyDigits() {
        assertTrue(StringUtils.isNumericSpace("123"));
    }

    @Test
    public void testIsNumericSpaceWithSpace() {
        assertTrue(StringUtils.isNumericSpace("12 3"));
    }

    @Test
    public void testIsNumericSpaceWithLetter() {
        assertFalse(StringUtils.isNumericSpace("ab2c"));
    }

    @Test
    public void testIsNumericSpaceWithSymbol() {
        assertFalse(StringUtils.isNumericSpace("12-3"));
    }

    @Test
    public void testIsNumericSpaceWithDecimalPoint() {
        assertFalse(StringUtils.isNumericSpace("12.3"));
    }

    // Tests for isWhitespace
    @Test
    public void testIsWhitespaceNull() {
        assertFalse(StringUtils.isWhitespace(null));
    }

    @Test
    public void testIsWhitespaceEmpty() {
        assertTrue(StringUtils.isWhitespace(""));
    }

    @Test
    public void testIsWhitespaceSpaces() {
        assertTrue(StringUtils.isWhitespace("  "));
        assertTrue(StringUtils.isWhitespace("\t\n\r\f "));
    }

    @Test
    public void testIsWhitespaceLetters() {
        assertFalse(StringUtils.isWhitespace("abc"));
    }

    @Test
    public void testIsWhitespaceAlphaNumeric() {
        assertFalse(StringUtils.isWhitespace("ab2c"));
    }

    @Test
    public void testIsWhitespaceSymbol() {
        assertFalse(StringUtils.isWhitespace("ab-c"));
    }

    // Tests for isAllLowerCase
    @Test
    public void testIsAllLowerCaseNull() {
        assertFalse(StringUtils.isAllLowerCase(null));
    }

    @Test
    public void testIsAllLowerCaseEmpty() {
        assertFalse(StringUtils.isAllLowerCase(""));
    }

    @Test
    public void testIsAllLowerCaseSpaces() {
        assertFalse(StringUtils.isAllLowerCase("  "));
    }

    @Test
    public void testIsAllLowerCaseTrue() {
        assertTrue(StringUtils.isAllLowerCase("abc"));
    }

    @Test
    public void testIsAllLowerCaseMixedCase() {
        assertFalse(StringUtils.isAllLowerCase("abC"));
    }

    // Tests for isAllUpperCase
    @Test
    public void testIsAllUpperCaseNull() {
        assertFalse(StringUtils.isAllUpperCase(null));
    }

    @Test
    public void testIsAllUpperCaseEmpty() {
        assertFalse(StringUtils.isAllUpperCase(""));
    }

    @Test
    public void testIsAllUpperCaseSpaces() {
        assertFalse(StringUtils.isAllUpperCase("  "));
    }

    @Test
    public void testIsAllUpperCaseTrue() {
        assertTrue(StringUtils.isAllUpperCase("ABC"));
    }

    @Test
    public void testIsAllUpperCaseMixedCase() {
        assertFalse(StringUtils.isAllUpperCase("aBC"));
    }

    // Tests for defaultString
    @Test
    public void testDefaultStringNull() {
        assertEquals("", StringUtils.defaultString(null));
    }

    @Test
    public void testDefaultStringEmpty() {
        assertEquals("", StringUtils.defaultString(""));
    }

    @Test
    public void testDefaultStringNonEmpty() {
        assertEquals("bat", StringUtils.defaultString("bat"));
    }

    @Test
    public void testDefaultStringWithDefaultNull() {
        assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
    }

    @Test
    public void testDefaultStringWithDefaultEmpty() {
        assertEquals("", StringUtils.defaultString("", "NULL"));
    }

    @Test
    public void testDefaultStringWithDefaultNonEmpty() {
        assertEquals("bat", StringUtils.defaultString("bat", "NULL"));
    }

    @Test
    public void testDefaultIfEmptyNull() {
        assertEquals("NULL", StringUtils.defaultIfEmpty(null, "NULL"));
    }

    @Test
    public void testDefaultIfEmptyEmpty() {
        assertEquals("NULL", StringUtils.defaultIfEmpty("", "NULL"));
    }

    @Test
    public void testDefaultIfEmptyNonEmpty() {
        assertEquals("bat", StringUtils.defaultIfEmpty("bat", "NULL"));
    }

    @Test
    public void testDefaultIfEmptyWithNullDefault() {
        assertNull(StringUtils.defaultIfEmpty("", null));
    }

    // Tests for reverse
    @Test
    public void testReverseNull() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testReverseEmpty() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testReverseSimple() {
        assertEquals("tab", StringUtils.reverse("bat"));
    }

    // Tests for reverseDelimited
    @Test
    public void testReverseDelimitedNull() {
        assertNull(StringUtils.reverseDelimited(null, '.'));
    }

    @Test
    public void testReverseDelimitedEmpty() {
        assertEquals("", StringUtils.reverseDelimited("", '.'));
    }

    @Test
    public void testReverseDelimitedNoSeparator() {
        assertEquals("a.b.c", StringUtils.reverseDelimited("a.b.c", 'x'));
    }

    @Test
    public void testReverseDelimitedWithSeparator() {
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    // Tests for abbreviate
    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateMaxWidthTooSmall() {
        StringUtils.abbreviate("abcdefg", 3);
    }

    @Test
    public void testAbbreviateShortString() {
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 8));
    }

    @Test
    public void testAbbreviateSimple() {
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
    }

    @Test
    public void testAbbreviateShortMaxWidth() {
        assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
    }

    @Test
    public void testAbbreviateWithOffset() {
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 0, 10));
    }

    @Test
    public void testAbbreviateWithOffsetAndEllipses() {
        assertEquals("...fghi...", StringUtils.abbreviate("abcdefghijklmno", 5, 10));
    }
    
    @Test
    public void testAbbreviateWithOffsetAtEnd() {
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 8, 10));
    }

    // Tests for difference
    @Test
    public void testDifferenceNullNull() {
        assertNull(StringUtils.difference(null, null));
    }

    @Test
    public void testDifferenceEmptyEmpty() {
        assertEquals("", StringUtils.difference("", ""));
    }

    @Test
    public void testDifferenceEmptyFirst() {
        assertEquals("abc", StringUtils.difference("", "abc"));
    }

    @Test
    public void testDifferenceEmptySecond() {
        assertEquals("", StringUtils.difference("abc", ""));
    }

    @Test
    public void testDifferenceSameStrings() {
        assertEquals("", StringUtils.difference("abc", "abc"));
    }

    @Test
    public void testDifferenceDifferenceAtEnd() {
        assertEquals("xyz", StringUtils.difference("ab", "abxyz"));
        assertEquals("xyz", StringUtils.difference("abcde", "abxyz"));
    }

    @Test
    public void testDifferenceDifferenceAtStart() {
        assertEquals("xyz", StringUtils.difference("abcde", "xyz"));
    }

    // Tests for indexOfDifference
    @Test
    public void testIndexOfDifferenceNullNull() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference(null, null));
    }

    @Test
    public void testIndexOfDifferenceEmptyEmpty() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference("", ""));
    }

    @Test
    public void testIndexOfDifferenceEmptyFirst() {
        assertEquals(0, StringUtils.indexOfDifference("", "abc"));
    }

    @Test
    public void testIndexOfDifferenceEmptySecond() {
        assertEquals(0, StringUtils.indexOfDifference("abc", ""));
    }

    @Test
    public void testIndexOfDifferenceSameStrings() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference("abc", "abc"));
    }

    @Test
    public void testIndexOfDifferenceDifferenceAtEnd() {
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));
        assertEquals(2, StringUtils.indexOfDifference("abcde", "abxyz"));
    }

    @Test
    public void testIndexOfDifferenceDifferenceAtStart() {
        assertEquals(0, StringUtils.indexOfDifference("abcde", "xyz"));
    }

    // Tests for getCommonPrefix
    @Test
    public void testGetCommonPrefixNullArray() {
        assertEquals("", StringUtils.getCommonPrefix(null));
    }

    @Test
    public void testGetCommonPrefixEmptyArray() {
        assertEquals("", StringUtils.getCommonPrefix(new String[0]));
    }

    @Test
    public void testGetCommonPrefixSingleString() {
        assertEquals("abc", StringUtils.getCommonPrefix(new String[]{"abc"}));
    }

    @Test
    public void testGetCommonPrefixAllNull() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{null, null}));
    }

    @Test
    public void testGetCommonPrefixEmptyStrings() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"", ""}));
    }

    @Test
    public void testGetCommonPrefixMixedNullAndEmpty() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"", null}));
    }

    @Test
    public void testGetCommonPrefixMixedNullAndNonEmpty() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"abc", null, null}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{null, null, "abc"}));
    }

    @Test
    public void testGetCommonPrefixMixedEmptyAndNonEmpty() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"", "abc"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"abc", ""}));
    }

    @Test
    public void testGetCommonPrefixIdenticalStrings() {
        assertEquals("abc", StringUtils.getCommonPrefix(new String[]{"abc", "abc"}));
    }

    @Test
    public void testGetCommonPrefixPartialMatch() {
        assertEquals("a", StringUtils.getCommonPrefix(new String[]{"abc", "a"}));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[]{"ab", "abxyz"}));
        assertEquals("ab", StringUtils.getCommonPrefix(new String[]{"abcde", "abxyz"}));
    }

    @Test
    public void testGetCommonPrefixNoCommonPrefix() {
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"abcde", "xyz"}));
        assertEquals("", StringUtils.getCommonPrefix(new String[]{"xyz", "abcde"}));
    }

    @Test
    public void testGetCommonPrefixLongerExample() {
        assertEquals("i am a ", StringUtils.getCommonPrefix(new String[]{"i am a machine", "i am a robot"}));
    }

    // Tests for getLevenshteinDistance
    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceNullFirst() {
        StringUtils.getLevenshteinDistance(null, "abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistanceNullSecond() {
        StringUtils.getLevenshteinDistance("abc", null);
    }

    @Test
    public void testGetLevenshteinDistanceEmptyEmpty() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
    }

    @Test
    public void testGetLevenshteinDistanceEmptyFirst() {
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
    }

    @Test
    public void testGetLevenshteinDistanceEmptySecond() {
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
    }

    @Test
    public void testGetLevenshteinDistanceSimple() {
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
        assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo"));
    }

    @Test
    public void testGetLevenshteinDistanceComplex() {
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
        assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz"));
    }

    // Tests for startsWith
    @Test
    public void testStartsWithNullString() {
        assertFalse(StringUtils.startsWith(null, "abc"));
    }

    @Test
    public void testStartsWithNullPrefix() {
        assertFalse(StringUtils.startsWith("abcdef", null));
    }

    @Test
    public void testStartsWithNullBoth() {
        assertTrue(StringUtils.startsWith(null, null));
    }

    @Test
    public void testStartsWithEmptyPrefix() {
        assertTrue(StringUtils.startsWith("abcdef", ""));
    }

    @Test
    public void testStartsWithFound() {
        assertTrue(StringUtils.startsWith("abcdef", "abc"));
    }

    @Test
    public void testStartsWithNotFound() {
        assertFalse(StringUtils.startsWith("ABCDEF", "abc"));
        assertFalse(StringUtils.startsWith("abcdef", "xyz"));
    }

    // Tests for startsWithIgnoreCase
    @Test
    public void testStartsWithIgnoreCaseNullString() {
        assertFalse(StringUtils.startsWithIgnoreCase(null, "abc"));
    }

    @Test
    public void testStartsWithIgnoreCaseNullPrefix() {
        assertFalse(StringUtils.startsWithIgnoreCase("abcdef", null));
    }

    @Test
    public void testStartsWithIgnoreCaseNullBoth() {
        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
    }

    @Test
    public void testStartsWithIgnoreCaseEmptyPrefix() {
        assertTrue(StringUtils.startsWithIgnoreCase("abcdef", ""));
    }

    @Test
    public void testStartsWithIgnoreCaseFoundIgnoreCase() {
        assertTrue(StringUtils.startsWithIgnoreCase("ABCDEF", "abc"));
    }

    @Test
    public void testStartsWithIgnoreCaseFoundExactCase() {
        assertTrue(StringUtils.startsWithIgnoreCase("abcdef", "abc"));
    }

    @Test
    public void testStartsWithIgnoreCaseNotFound() {
        assertFalse(StringUtils.startsWithIgnoreCase("abcdef", "xyz"));
    }

    // Tests for startsWithAny
    @Test
    public void testStartsWithAnyNullString() {
        assertFalse(StringUtils.startsWithAny(null, new String[]{"abc"}));
    }

    @Test
    public void testStartsWithAnyNullArray() {
        assertFalse(StringUtils.startsWithAny("abcxyz", null));
    }

    @Test
    public void testStartsWithAnyEmptyArray() {
        assertFalse(StringUtils.startsWithAny("abcxyz", new String[0]));
    }
    
    @Test
    public void testStartsWithAnyEmptyStringInArray() {
        assertFalse(StringUtils.startsWithAny("abcxyz", new String[]{""}));
    }

    @Test
    public void testStartsWithAnyFound() {
        assertTrue(StringUtils.startsWithAny("abcxyz", new String[]{"abc"}));
    }

    @Test
    public void testStartsWithAnyFoundWithNull() {
        assertTrue(StringUtils.startsWithAny("abcxyz", new String[]{null, "xyz", "abc"}));
    }

    @Test
    public void testStartsWithAnyNotFound() {
        assertFalse(StringUtils.startsWithAny("abcxyz", new String[]{"def", "ghi"}));
    }


    // Tests for endsWith
    @Test
    public void testEndsWithNullString() {
        assertFalse(StringUtils.endsWith(null, "def"));
    }

    @Test
    public void testEndsWithNullSuffix() {
        assertFalse(StringUtils.endsWith("abcdef", null));
    }

    @Test
    public void testEndsWithNullBoth() {
        assertTrue(StringUtils.endsWith(null, null));
    }

    @Test
    public void testEndsWithEmptySuffix() {
        assertTrue(StringUtils.endsWith("abcdef", ""));
    }

    @Test
    public void testEndsWithFound() {
        assertTrue(StringUtils.endsWith("abcdef", "def"));
    }

    @Test
    public void testEndsWithNotFound() {
        assertFalse(StringUtils.endsWith("ABCDEF", "def"));
        assertFalse(StringUtils.endsWith("abcdef", "cde"));
    }

    // Tests for endsWithIgnoreCase
    @Test
    public void testEndsWithIgnoreCaseNullString() {
        assertFalse(StringUtils.endsWithIgnoreCase(null, "def"));
    }

    @Test
    public void testEndsWithIgnoreCaseNullSuffix() {
        assertFalse(StringUtils.endsWithIgnoreCase("abcdef", null));
    }

    @Test
    public void testEndsWithIgnoreCaseNullBoth() {
        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
    }

    @Test
    public void testEndsWithIgnoreCaseEmptySuffix() {
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", ""));
    }

    @Test
    public void testEndsWithIgnoreCaseFoundIgnoreCase() {
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
    }

    @Test
    public void testEndsWithIgnoreCaseFoundExactCase() {
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "def"));
    }

    @Test
    public void testEndsWithIgnoreCaseNotFound() {
        assertFalse(StringUtils.endsWithIgnoreCase("abcdef", "cde"));
    }

    // Tests for stripToNull
    @Test
    public void testStripToNullNull() {
        assertNull(StringUtils.stripToNull(null));
    }

    @Test
    public void testStripToNullEmptyString() {
        assertNull(StringUtils.stripToNull(""));
    }

    @Test
    public void testStripToNullWhitespaceString() {
        assertNull(StringUtils.stripToNull("   "));
    }

    @Test
    public void testStripToNullNonWhitespace() {
        assertEquals("abc", StringUtils.stripToNull("  abc  "));
    }

    // Tests for stripToEmpty
    @Test
    public void testStripToEmptyNull() {
        assertEquals("", StringUtils.stripToEmpty(null));
    }

    @Test
    public void testStripToEmptyEmptyString() {
        assertEquals("", StringUtils.stripToEmpty(""));
    }

    @Test
    public void testStripToEmptyWhitespaceString() {
        assertEquals("", StringUtils.stripToEmpty("     "));
    }

    @Test
    public void testStripToEmptyNonWhitespace() {
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));
    }
    
    // Tests for stripAccents (JDK 1.6+ required)
    // Since the environment might not be JDK 1.6+, these tests might fail.
    // We are testing the reference implementation which uses reflection for compatibility.
    // We will provide inputs that are expected to work on a 1.6+ JVM.
    @Test
    public void testStripAccentsBasic() {
        assertEquals("control", StringUtils.stripAccents("control"));
        assertEquals("eclair", StringUtils.stripAccents("éclair")); // é -> e
        assertEquals("resume", StringUtils.stripAccents("résumé")); // é -> e, ú -> u
        assertEquals("naive", StringUtils.stripAccents("naïve")); // ï -> i
    }
    
    @Test
    public void testStripAccentsEmpty() {
        assertEquals("", StringUtils.stripAccents(""));
    }

    @Test
    public void testStripAccentsNull() {
        assertNull(StringUtils.stripAccents(null));
    }

    @Test
    public void testStripAccentsMultipleAccents() {
        assertEquals("cafe", StringUtils.stripAccents("café"));
        assertEquals("cafe", StringUtils.stripAccents("café")); // Test idempotency
        assertEquals("resume", StringUtils.stripAccents("résumé"));
        assertEquals("Aeiou", StringUtils.stripAccents("ÁÉÍÓÚ"));
    }
    
    // Tests for ordinalIndexOf
    @Test
    public void testOrdinalIndexOfNullString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf(null, "a", 1));
    }

    @Test
    public void testOrdinalIndexOfNullSearchString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("aabaabaa", null, 1));
    }

    @Test
    public void testOrdinalIndexOfEmptySearchString() {
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", 1));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", 2)); // Should still be 0 for empty search string
    }

    @Test
    public void testOrdinalIndexOfZeroOrdinal() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("aabaabaa", "a", 0));
    }

    @Test
    public void testOrdinalIndexOfNegativeOrdinal() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("aabaabaa", "a", -1));
    }

    @Test
    public void testOrdinalIndexOfSimpleCases() {
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        assertEquals(7, StringUtils.ordinalIndexOf("aabaabaa", "a", 3));
    }

    @Test
    public void testOrdinalIndexOfNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("aabaabaa", "z", 1));
    }

    @Test
    public void testOrdinalIndexOfMultipleOccurrences() {
        assertEquals(2, StringUtils.ordinalIndexOf("aabaabaa", "b", 1));
        assertEquals(5, StringUtils.ordinalIndexOf("aabaabaa", "b", 2));
    }
    
    // Tests for lastOrdinalIndexOf
    @Test
    public void testLastOrdinalIndexOfNullString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastOrdinalIndexOf(null, "a", 1));
    }

    @Test
    public void testLastOrdinalIndexOfNullSearchString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastOrdinalIndexOf("aabaabaa", null, 1));
    }

    @Test
    public void testLastOrdinalIndexOfEmptySearchString() {
        assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1));
        assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 2)); // Should still be length for empty search string
    }

    @Test
    public void testLastOrdinalIndexOfZeroOrdinal() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 0));
    }
    
    @Test
    public void testLastOrdinalIndexOfNegativeOrdinal() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", -1));
    }

    @Test
    public void testLastOrdinalIndexOfSimpleCases() {
        assertEquals(7, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1));
        assertEquals(6, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2));
        assertEquals(0, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 3));
    }

    @Test
    public void testLastOrdinalIndexOfNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastOrdinalIndexOf("aabaabaa", "z", 1));
    }

    @Test
    public void testLastOrdinalIndexOfMultipleOccurrences() {
        assertEquals(5, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 1));
        assertEquals(2, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 2));
    }

    // Tests for indexOfIgnoreCase
    @Test
    public void testIndexOfIgnoreCaseNullString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfIgnoreCase(null, "a"));
    }

    @Test
    public void testIndexOfIgnoreCaseNullSearchString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfIgnoreCase("aabaabaa", null));
    }

    @Test
    public void testIndexOfIgnoreCaseEmptySearchString() {
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", ""));
    }

    @Test
    public void testIndexOfIgnoreCaseFound() {
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "a"));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B")); // Case insensitive
        assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "Ab")); // Case insensitive
    }

    @Test
    public void testIndexOfIgnoreCaseNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfIgnoreCase("aabaabaa", "z"));
    }

    @Test
    public void testIndexOfIgnoreCaseWithStartPosition() {
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "b", 0));
        assertEquals(5, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 3)); // Case insensitive
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B", -1)); // Negative start position
        assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 9)); // Start position too large
    }

    @Test
    public void testIndexOfIgnoreCaseWithEmptySearchStringAndStartPosition() {
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "", 2));
        assertEquals(3, StringUtils.indexOfIgnoreCase("abc", "", 9)); // Start position > length
    }
    
    // Tests for lastIndexOfIgnoreCase
    @Test
    public void testLastIndexOfIgnoreCaseNullString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfIgnoreCase(null, "a"));
    }

    @Test
    public void testLastIndexOfIgnoreCaseNullSearchString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfIgnoreCase("aabaabaa", null));
    }

    @Test
    public void testLastIndexOfIgnoreCaseEmptySearchString() {
        assertEquals(8, StringUtils.lastIndexOfIgnoreCase("aabaabaa", ""));
    }

    @Test
    public void testLastIndexOfIgnoreCaseFound() {
        assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A")); // Case insensitive
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "b"));
        assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB")); // Case insensitive
    }

    @Test
    public void testLastIndexOfIgnoreCaseNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "z"));
    }

    @Test
    public void testLastIndexOfIgnoreCaseWithStartPosition() {
        assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 8)); // Case insensitive
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 8)); // Case insensitive
        assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB", 8)); // Case insensitive
        assertEquals(0, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 0)); // Case insensitive
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1)); // Negative start position
    }

    @Test
    public void testLastIndexOfIgnoreCaseWithEmptySearchStringAndStartPosition() {
        assertEquals(8, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "", 8));
        assertEquals(3, StringUtils.lastIndexOfIgnoreCase("abc", "", 9)); // Start position > length
        assertEquals(3, StringUtils.lastIndexOfIgnoreCase("abc", "", 3)); 
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("abc", "", -1)); // Negative start position
    }

    // Tests for stripToNull
    @Test
    public void testStripToNullNullInput() {
        assertNull(StringUtils.stripToNull(null));
    }

    @Test
    public void testStripToNullEmptyStringInput() {
        assertNull(StringUtils.stripToNull(""));
    }

    @Test
    public void testStripToNullWhitespaceStringInput() {
        assertNull(StringUtils.stripToNull("   "));
    }

    @Test
    public void testStripToNullNonWhitespaceInput() {
        assertEquals("abc", StringUtils.stripToNull("  abc  "));
    }
    
    // Tests for stripToEmpty
    @Test
    public void testStripToEmptyNullInput() {
        assertEquals("", StringUtils.stripToEmpty(null));
    }

    @Test
    public void testStripToEmptyEmptyStringInput() {
        assertEquals("", StringUtils.stripToEmpty(""));
    }

    @Test
    public void testStripToEmptyWhitespaceStringInput() {
        assertEquals("", StringUtils.stripToEmpty("     "));
    }

    @Test
    public void testStripToEmptyNonWhitespaceInput() {
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));
    }
    
    // Tests for stripAccents (requires Java 1.6+)
    // This test assumes the environment supports the necessary reflection.
    @Test
    public void testStripAccentsBasicWithAccents() {
        assertEquals("resume", StringUtils.stripAccents("résumé"));
        assertEquals("cafe", StringUtils.stripAccents("café"));
        assertEquals("naif", StringUtils.stripAccents("naïf"));
    }

    @Test
    public void testStripAccentsNoAccents() {
        assertEquals("hello", StringUtils.stripAccents("hello"));
    }

    @Test
    public void testStripAccentsEmptyString() {
        assertEquals("", StringUtils.stripAccents(""));
    }

    @Test
    public void testStripAccentsNullString() {
        assertNull(StringUtils.stripAccents(null));
    }
    
    // Tests for ordinalIndexOf







    
    // Tests for indexOfIgnoreCase






    
    // Tests for lastOrdinalIndexOf



    




    // Tests for lastIndexOfIgnoreCase







    // Tests for containsIgnoreCase
    @Test
    public void testContainsIgnoreCaseNullString() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
    }

    @Test
    public void testContainsIgnoreCaseNullSearchString() {
        assertFalse(StringUtils.containsIgnoreCase("abc", null));
    }

    @Test
    public void testContainsIgnoreCaseEmptySearchString() {
        assertTrue(StringUtils.containsIgnoreCase("abc", ""));
    }

    @Test
    public void testContainsIgnoreCaseFound() {
        assertTrue(StringUtils.containsIgnoreCase("abc", "a"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A")); // Case insensitive
        assertTrue(StringUtils.containsIgnoreCase("abcABC", "bCa")); // Case insensitive
    }

    @Test
    public void testContainsIgnoreCaseNotFound() {
        assertFalse(StringUtils.containsIgnoreCase("abc", "z"));
    }

    // Tests for lastIndexOfAny
    @Test
    public void testLastIndexOfAnyNullString() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfAny(null, new String[]{"a"}));
    }

    @Test
    public void testLastIndexOfAnyNullSearchStrs() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfAny("abc", null));
    }

    @Test
    public void testLastIndexOfAnyEmptySearchStrs() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfAny("abc", new String[0]));
    }

    @Test
    public void testLastIndexOfAnyWithNullInSearchStrs() {
        assertEquals(0, StringUtils.lastIndexOfAny("abc", new String[]{"a", null, "b"}));
    }

    @Test
    public void testLastIndexOfAnyFound() {
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"ab", "cd"}));
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"cd", "ab"}));
        assertEquals(1, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"zab", "aby"}));
    }

    @Test
    public void testLastIndexOfAnyNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"mn", "op"}));
    }

    @Test
    public void testLastIndexOfAnyEmptyStringSearch() {
        assertEquals(10, StringUtils.lastIndexOfAny("zzabyycdxx", new String[]{"", "ab"}));
    }
    
    // Tests for splitByCharacterType
    @Test
    public void testSplitByCharacterTypeNull() {
        assertNull(StringUtils.splitByCharacterType(null));
    }

    @Test
    public void testSplitByCharacterTypeEmpty() {
        assertEquals(0, StringUtils.splitByCharacterType("").length);
    }

    @Test
    public void testSplitByCharacterTypeSimple() {
        assertArrayEquals(new String[]{"ab", " ", "de", " ", "fg"}, StringUtils.splitByCharacterType("ab de fg"));
    }

    @Test
    public void testSplitByCharacterTypeMultipleSpaces() {
        assertArrayEquals(new String[]{"ab", "   ", "de", " ", "fg"}, StringUtils.splitByCharacterType("ab   de fg"));
    }

    @Test
    public void testSplitByCharacterTypeSpecialChars() {
        assertArrayEquals(new String[]{"ab", ":", "cd", ":", "ef"}, StringUtils.splitByCharacterType("ab:cd:ef"));
    }

    @Test
    public void testSplitByCharacterTypeNumbers() {
        assertArrayEquals(new String[]{"number", "5"}, StringUtils.splitByCharacterType("number5"));
    }
    
    // Tests for splitByCharacterTypeCamelCase
    @Test
    public void testSplitByCharacterTypeCamelCaseNull() {
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseEmpty() {
        assertEquals(0, StringUtils.splitByCharacterTypeCamelCase("").length);
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseSimple() {
        assertArrayEquals(new String[]{"ab", " ", "de", " ", "fg"}, StringUtils.splitByCharacterTypeCamelCase("ab de fg"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseFooBar() {
        assertArrayEquals(new String[]{"foo", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("fooBar"));
    }
    
    @Test
    public void testSplitByCharacterTypeCamelCaseASFRules() {
        assertArrayEquals(new String[]{"ASF", "Rules"}, StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }
    
    @Test
    public void testSplitByCharacterTypeCamelCaseFoo200Bar() {
        assertArrayEquals(new String[]{"foo", "200", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("foo200Bar"));
    }
}



