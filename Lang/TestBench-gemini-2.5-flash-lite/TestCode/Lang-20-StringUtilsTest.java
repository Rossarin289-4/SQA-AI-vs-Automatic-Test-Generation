package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class StringUtilsTest {

    // Test methods for StringUtils class

    @Test
    public void testIsEmpty_null() {
        assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    public void testIsEmpty_empty() {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void testIsEmpty_notEmpty() {
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("bob"));
    }

    @Test
    public void testIsNotEmpty_null() {
        assertFalse(StringUtils.isNotEmpty(null));
    }

    @Test
    public void testIsNotEmpty_empty() {
        assertFalse(StringUtils.isNotEmpty(""));
    }

    @Test
    public void testIsNotEmpty_notEmpty() {
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("bob"));
    }

    @Test
    public void testIsBlank_null() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    public void testIsBlank_empty() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    public void testIsBlank_whitespace() {
        assertTrue(StringUtils.isBlank(" "));
        assertTrue(StringUtils.isBlank("\t\n\r\f"));
    }

    @Test
    public void testIsBlank_notBlank() {
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank(" bob "));
    }

    @Test
    public void testIsNotBlank_null() {
        assertFalse(StringUtils.isNotBlank(null));
    }

    @Test
    public void testIsNotBlank_empty() {
        assertFalse(StringUtils.isNotBlank(""));
    }

    @Test
    public void testIsNotBlank_whitespace() {
        assertFalse(StringUtils.isNotBlank(" "));
        assertFalse(StringUtils.isNotBlank("\t\n\r\f"));
    }

    @Test
    public void testIsNotBlank_notBlank() {
        assertTrue(StringUtils.isNotBlank("bob"));
        assertTrue(StringUtils.isNotBlank(" bob "));
    }

    @Test
    public void testTrim_null() {
        assertNull(StringUtils.trim(null));
    }

    @Test
    public void testTrim_empty() {
        assertEquals("", StringUtils.trim(""));
    }

    @Test
    public void testTrim_whitespaceOnly() {
        assertEquals("", StringUtils.trim("   "));
    }

    @Test
    public void testTrim_normal() {
        assertEquals("abc", StringUtils.trim("abc"));
    }

    @Test
    public void testTrim_leadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.trim("    abc    "));
    }

    @Test
    public void testTrimToNull_null() {
        assertNull(StringUtils.trimToNull(null));
    }

    @Test
    public void testTrimToNull_empty() {
        assertNull(StringUtils.trimToNull(""));
    }

    @Test
    public void testTrimToNull_whitespaceOnly() {
        assertNull(StringUtils.trimToNull("     "));
    }

    @Test
    public void testTrimToNull_normal() {
        assertEquals("abc", StringUtils.trimToNull("abc"));
    }

    @Test
    public void testTrimToNull_leadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.trimToNull("    abc    "));
    }

    @Test
    public void testTrimToEmpty_null() {
        assertEquals("", StringUtils.trimToEmpty(null));
    }

    @Test
    public void testTrimToEmpty_empty() {
        assertEquals("", StringUtils.trimToEmpty(""));
    }

    @Test
    public void testTrimToEmpty_whitespaceOnly() {
        assertEquals("", StringUtils.trimToEmpty("     "));
    }

    @Test
    public void testTrimToEmpty_normal() {
        assertEquals("abc", StringUtils.trimToEmpty("abc"));
    }

    @Test
    public void testTrimToEmpty_leadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.trimToEmpty("    abc    "));
    }

    @Test
    public void testStrip_null() {
        assertNull(StringUtils.strip(null));
    }

    @Test
    public void testStrip_empty() {
        assertEquals("", StringUtils.strip(""));
    }

    @Test
    public void testStrip_whitespaceOnly() {
        assertEquals("", StringUtils.strip("   "));
    }

    @Test
    public void testStrip_normal() {
        assertEquals("abc", StringUtils.strip("abc"));
    }

    @Test
    public void testStrip_leadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.strip("  abc  "));
    }

    @Test
    public void testStrip_internalWhitespace() {
        assertEquals("ab c", StringUtils.strip(" ab c "));
    }

    @Test
    public void testStripToNull_null() {
        assertNull(StringUtils.stripToNull(null));
    }

    @Test
    public void testStripToNull_empty() {
        assertNull(StringUtils.stripToNull(""));
    }

    @Test
    public void testStripToNull_whitespaceOnly() {
        assertNull(StringUtils.stripToNull("   "));
    }

    @Test
    public void testStripToNull_normal() {
        assertEquals("abc", StringUtils.stripToNull("abc"));
    }

    @Test
    public void testStripToNull_leadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.stripToNull("  abc  "));
    }

    @Test
    public void testStripToNull_internalWhitespace() {
        assertEquals("ab c", StringUtils.stripToNull(" ab c "));
    }

    @Test
    public void testStripToEmpty_null() {
        assertEquals("", StringUtils.stripToEmpty(null));
    }

    @Test
    public void testStripToEmpty_empty() {
        assertEquals("", StringUtils.stripToEmpty(""));
    }

    @Test
    public void testStripToEmpty_whitespaceOnly() {
        assertEquals("", StringUtils.stripToEmpty("   "));
    }

    @Test
    public void testStripToEmpty_normal() {
        assertEquals("abc", StringUtils.stripToEmpty("abc"));
    }

    @Test
    public void testStripToEmpty_leadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));
    }

    @Test
    public void testStripToEmpty_internalWhitespace() {
        assertEquals("ab c", StringUtils.stripToEmpty(" ab c "));
    }

    @Test
    public void testStrip_withChars_nullStr() {
        assertNull(StringUtils.strip(null, "abc"));
    }

    @Test
    public void testStrip_withChars_emptyStr() {
        assertEquals("", StringUtils.strip("", "abc"));
    }

    @Test
    public void testStrip_withChars_nullStripChars_normal() {
        assertEquals("abc", StringUtils.strip("abc", null));
    }

    @Test
    public void testStrip_withChars_nullStripChars_leadingSpace() {
        assertEquals("abc", StringUtils.strip("  abc", null));
    }

    @Test
    public void testStrip_withChars_nullStripChars_trailingSpace() {
        assertEquals("abc", StringUtils.strip("abc  ", null));
    }

    @Test
    public void testStrip_withChars_nullStripChars_leadingAndTrailingSpace() {
        assertEquals("abc", StringUtils.strip("  abc  ", null));
    }

    @Test
    public void testStrip_withChars_emptyStripChars() {
        assertEquals("abc", StringUtils.strip("abc", ""));
    }

    @Test
    public void testStrip_withChars_customStripChars_noMatchStart() {
        assertEquals("  abc", StringUtils.strip("  abc", "xyz"));
    }

    @Test
    public void testStrip_withChars_customStripChars_noMatchEnd() {
        assertEquals("abc  ", StringUtils.strip("abc  ", "xyz"));
    }

    @Test
    public void testStrip_withChars_customStripChars_matchStart() {
        assertEquals("abc  ", StringUtils.strip("xyzabc  ", "xyz"));
    }

    @Test
    public void testStrip_withChars_customStripChars_matchEnd() {
        assertEquals("  abc", StringUtils.strip("  abcxyz", "xyz"));
    }

    @Test
    public void testStrip_withChars_customStripChars_matchBoth() {
        assertEquals("abc", StringUtils.strip("xyzabcxyz", "xyz"));
    }

    @Test
    public void testStripStart_nullStr() {
        assertNull(StringUtils.stripStart(null, "abc"));
    }

    @Test
    public void testStripStart_emptyStr() {
        assertEquals("", StringUtils.stripStart("", "abc"));
    }

    @Test
    public void testStripStart_nullStripChars_normal() {
        assertEquals("abc", StringUtils.stripStart("abc", null));
    }

    @Test
    public void testStripStart_nullStripChars_leadingSpace() {
        assertEquals("abc", StringUtils.stripStart("  abc", null));
    }

    @Test
    public void testStripStart_nullStripChars_trailingSpace() {
        assertEquals("abc  ", StringUtils.stripStart("abc  ", null));
    }

    @Test
    public void testStripStart_nullStripChars_leadingAndTrailingSpace() {
        assertEquals("abc ", StringUtils.stripStart(" abc ", null));
    }

    @Test
    public void testStripStart_emptyStripChars() {
        assertEquals("abc", StringUtils.stripStart("abc", ""));
    }

    @Test
    public void testStripStart_customStripChars_noMatch() {
        assertEquals("yxabc  ", StringUtils.stripStart("yxabc  ", "xyz"));
    }

    @Test
    public void testStripStart_customStripChars_matchPrefix() {
        assertEquals("abc  ", StringUtils.stripStart("xyzabc  ", "xyz"));
    }

    @Test
    public void testStripEnd_nullStr() {
        assertNull(StringUtils.stripEnd(null, "abc"));
    }

    @Test
    public void testStripEnd_emptyStr() {
        assertEquals("", StringUtils.stripEnd("", "abc"));
    }

    @Test
    public void testStripEnd_nullStripChars_normal() {
        assertEquals("abc", StringUtils.stripEnd("abc", null));
    }

    @Test
    public void testStripEnd_nullStripChars_leadingSpace() {
        assertEquals("  abc", StringUtils.stripEnd("  abc", null));
    }

    @Test
    public void testStripEnd_nullStripChars_trailingSpace() {
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
    }

    @Test
    public void testStripEnd_nullStripChars_leadingAndTrailingSpace() {
        assertEquals(" abc", StringUtils.stripEnd(" abc ", null));
    }

    @Test
    public void testStripEnd_emptyStripChars() {
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
    }

    @Test
    public void testStripEnd_customStripChars_noMatch() {
        assertEquals("  abcyx", StringUtils.stripEnd("  abcyx", "xyz"));
    }

    @Test
    public void testStripEnd_customStripChars_matchSuffix() {
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
    }

    @Test
    public void testStripEnd_customStripChars_decimalPoint() {
        assertEquals("12", StringUtils.stripEnd("120.00", ".0"));
    }

    @Test
    public void testStripAll_nullArray() {
        assertNull(StringUtils.stripAll((String[]) null));
    }

    @Test
    public void testStripAll_emptyArray() {
        String[] result = StringUtils.stripAll(new String[]{});
        assertEquals(0, result.length);
        assertSame(ArrayUtils.EMPTY_STRING_ARRAY, result);
    }

    @Test
    public void testStripAll_withNullEntries() {
        String[] input = {"abc", null, "  def  "};
        String[] expected = {"abc", null, "def"};
        assertArrayEquals(expected, StringUtils.stripAll(input));
    }

    @Test
    public void testStripAll_withStripChars_nullArray() {
        assertNull(StringUtils.stripAll((String[]) null, "xyz"));
    }

    @Test
    public void testStripAll_withStripChars_emptyArray() {
        String[] result = StringUtils.stripAll(new String[]{}, "xyz");
        assertEquals(0, result.length);
        assertSame(ArrayUtils.EMPTY_STRING_ARRAY, result);
    }

    @Test
    public void testStripAll_withStripChars_withNullEntries() {
        String[] input = {"yabcz", null, "xyzabcxyz"};
        String[] expected = {"abc", null, "abc"};
        assertArrayEquals(expected, StringUtils.stripAll(input, "xyz"));
    }

    @Test
    public void testStripAll_withStripChars_nullStripChars() {
        String[] input = {" abc ", "def"};
        String[] expected = {"abc", "def"};
        assertArrayEquals(expected, StringUtils.stripAll(input, null));
    }

    @Test
    public void testEquals_nulls() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEquals_oneNull() {
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEquals_identical() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEquals_different() {
        assertFalse(StringUtils.equals("abc", "ABC"));
        assertFalse(StringUtils.equals("abc", "ab"));
        assertFalse(StringUtils.equals("ab", "abc"));
    }

    @Test
    public void testEqualsIgnoreCase_nulls() {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
    }

    @Test
    public void testEqualsIgnoreCase_oneNull() {
        assertFalse(StringUtils.equalsIgnoreCase(null, "abc"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", null));
    }

    @Test
    public void testEqualsIgnoreCase_identical() {
        assertTrue(StringUtils.equalsIgnoreCase("abc", "abc"));
    }

    @Test
    public void testEqualsIgnoreCase_caseDifference() {
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
        assertTrue(StringUtils.equalsIgnoreCase("ABC", "abc"));
        assertTrue(StringUtils.equalsIgnoreCase("AbC", "aBc"));
    }

    @Test
    public void testEqualsIgnoreCase_different() {
        assertFalse(StringUtils.equalsIgnoreCase("abc", "ab"));
        assertFalse(StringUtils.equalsIgnoreCase("ab", "abc"));
    }



    @Test
    public void testIndexOf_charFound() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", 'a'));
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b'));
    }




    @Test
    public void testIndexOf_withStartPosition_charFound() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', 0));
        assertEquals(5, StringUtils.indexOf("aabaabaa", 'b', 3));
    }


    @Test
    public void testIndexOf_withStartPosition_negativeStart() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', -1));
    }



    @Test
    public void testIndexOf_CharSequence_emptySeqAndSearchSeq() {
        assertEquals(0, StringUtils.indexOf("", ""));
    }

    @Test
    public void testIndexOf_CharSequence_emptySeq() {
        assertEquals(-1, StringUtils.indexOf("", "a"));
    }

    @Test
    public void testIndexOf_CharSequence_found() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", "a"));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b"));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
    }

    @Test
    public void testIndexOf_CharSequence_emptySearchSeq() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", ""));
    }



    @Test
    public void testIndexOf_CharSequence_withStartPosition_emptySeq() {
        assertEquals(-1, StringUtils.indexOf("", "a", 0));
    }

    @Test
    public void testIndexOf_CharSequence_withStartPosition_emptySearchSeq() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", "", 2));
    }

    @Test
    public void testIndexOf_CharSequence_withStartPosition_found() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", "a", 0));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b", 0));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab", 0));
        assertEquals(5, StringUtils.indexOf("aabaabaa", "b", 3));
    }


    @Test
    public void testIndexOf_CharSequence_withStartPosition_negativeStart() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b", -1));
    }

    @Test
    public void testIndexOf_CharSequence_withStartPosition_startBeyondLength() {
        assertEquals(3, StringUtils.indexOf("abc", "", 9));
    }




    @Test
    public void testOrdinalIndexOf_emptySearchStr() {
        assertEquals(0, StringUtils.ordinalIndexOf("abc", "", 1));
        assertEquals(0, StringUtils.ordinalIndexOf("abc", "", 2));
    }

    @Test
    public void testOrdinalIndexOf_found() {
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        assertEquals(2, StringUtils.ordinalIndexOf("aabaabaa", "b", 1));
        assertEquals(5, StringUtils.ordinalIndexOf("aabaabaa", "b", 2));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "ab", 1));
        assertEquals(4, StringUtils.ordinalIndexOf("aabaabaa", "ab", 2));
    }




    @Test
    public void testIndexOfIgnoreCase_emptySearchStr() {
        assertEquals(0, StringUtils.indexOfIgnoreCase("abc", ""));
    }

    @Test
    public void testIndexOfIgnoreCase_found() {
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "A"));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B"));
        assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB"));
    }




    @Test
    public void testIndexOfIgnoreCase_withStartPosition_emptySearchStr() {
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "", 2));
    }

    @Test
    public void testIndexOfIgnoreCase_withStartPosition_found() {
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "A", 0));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 0));
        assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 0));
        assertEquals(5, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 3));
    }


    @Test
    public void testIndexOfIgnoreCase_withStartPosition_negativeStart() {
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B", -1));
    }

    @Test
    public void testIndexOfIgnoreCase_withStartPosition_startBeyondLength() {
        assertEquals(3, StringUtils.indexOfIgnoreCase("abc", "", 9));
    }



    @Test
    public void testLastIndexOf_charFound() {
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a'));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b'));
    }




    @Test
    public void testLastIndexOf_withStartPosition_charFound() {
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 8));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", 'b', 4));
        assertEquals(0, StringUtils.lastIndexOf("aabaabaa", 'a', 0));
    }

    @Test
    public void testLastIndexOf_withStartPosition_charNotFound() {
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', 0));
    }

    @Test
    public void testLastIndexOf_withStartPosition_startBeyondLength() {
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 9));
    }

    @Test
    public void testLastIndexOf_withStartPosition_negativeStart() {
        assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', -1));
    }



    @Test
    public void testLastIndexOf_CharSequence_found() {
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a"));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b"));
        assertEquals(4, StringUtils.lastIndexOf("aabaabaa", "ab"));
    }

    @Test
    public void testLastIndexOf_CharSequence_emptySearchSeq() {
        assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
    }









    @Test
    public void testLastIndexOfIgnoreCase_emptySearchStr() {
        assertEquals(3, StringUtils.lastIndexOfIgnoreCase("abc", ""));
    }

    @Test
    public void testLastIndexOfIgnoreCase_found() {
        assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A"));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B"));
        assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB"));
    }




    @Test
    public void testLastIndexOfIgnoreCase_withStartPosition_emptySearchStr() {
        assertEquals(8, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "", 8));
    }

    @Test
    public void testLastIndexOfIgnoreCase_withStartPosition_found() {
        assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 8));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 8));
        assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB", 8));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 9));
        assertEquals(0, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 0));
    }

    @Test
    public void testLastIndexOfIgnoreCase_withStartPosition_notFound() {
        assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 0));
    }


    @Test
    public void testContains_nullSeq() {
        assertFalse(StringUtils.contains(null, 'a'));
    }

    @Test
    public void testContains_emptySeq() {
        assertFalse(StringUtils.contains("", 'a'));
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
    public void testContains_CharSequence_nullSeq() {
        assertFalse(StringUtils.contains(null, "a"));
    }

    @Test
    public void testContains_CharSequence_nullSearchSeq() {
        assertFalse(StringUtils.contains("abc", null));
    }

    @Test
    public void testContains_CharSequence_emptySearchSeq() {
        assertTrue(StringUtils.contains("abc", ""));
        assertTrue(StringUtils.contains("", ""));
    }

    @Test
    public void testContains_CharSequence_found() {
        assertTrue(StringUtils.contains("abc", "a"));
        assertTrue(StringUtils.contains("abc", "b"));
    }

    @Test
    public void testContains_CharSequence_notFound() {
        assertFalse(StringUtils.contains("abc", "z"));
    }

    @Test
    public void testContainsIgnoreCase_nullSeq() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
    }

    @Test
    public void testContainsIgnoreCase_nullSearchSeq() {
        assertFalse(StringUtils.containsIgnoreCase("abc", null));
    }

    @Test
    public void testContainsIgnoreCase_emptySearchSeq() {
        assertTrue(StringUtils.containsIgnoreCase("abc", ""));
        assertTrue(StringUtils.containsIgnoreCase("", ""));
    }

    @Test
    public void testContainsIgnoreCase_found() {
        assertTrue(StringUtils.containsIgnoreCase("abc", "a"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
    }

    @Test
    public void testContainsIgnoreCase_notFound() {
        assertFalse(StringUtils.containsIgnoreCase("abc", "z"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "Z"));
    }

    @Test
    public void testContainsWhitespace_nullSeq() {
        assertFalse(StringUtils.containsWhitespace(null));
    }

    @Test
    public void testContainsWhitespace_emptySeq() {
        assertFalse(StringUtils.containsWhitespace(""));
    }

    @Test
    public void testContainsWhitespace_noWhitespace() {
        assertFalse(StringUtils.containsWhitespace("abc"));
    }

    @Test
    public void testContainsWhitespace_hasWhitespace() {
        assertTrue(StringUtils.containsWhitespace("abc "));
        assertTrue(StringUtils.containsWhitespace(" abc"));
        assertTrue(StringUtils.containsWhitespace(" ab c "));
        assertTrue(StringUtils.containsWhitespace("\t\n"));
    }





    @Test
    public void testIndexOfAny_charsFound() {
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", 'z', 'a'));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", 'b', 'y'));
    }






    @Test
    public void testIndexOfAny_CharSequence_found() {
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", "za"));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", "by"));
    }


    @Test
    public void testContainsAny_nullCs() {
        assertFalse(StringUtils.containsAny(null, 'a'));
    }

    @Test
    public void testContainsAny_emptyCs() {
        assertFalse(StringUtils.containsAny("", 'a'));
    }

    @Test
    public void testContainsAny_nullSearchChars() {
        assertFalse(StringUtils.containsAny("abc", (char[]) null));
    }

    @Test
    public void testContainsAny_emptySearchChars() {
        assertFalse(StringUtils.containsAny("abc", new char[]{}));
    }

    @Test
    public void testContainsAny_charsFound() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", 'z', 'a'));
        assertTrue(StringUtils.containsAny("zzabyycdxx", 'b', 'y'));
    }

    @Test
    public void testContainsAny_charsNotFound() {
        assertFalse(StringUtils.containsAny("aba", 'z'));
    }

    @Test
    public void testContainsAny_CharSequence_nullCs() {
        assertFalse(StringUtils.containsAny(null, "za"));
    }

    @Test
    public void testContainsAny_CharSequence_emptyCs() {
        assertFalse(StringUtils.containsAny("", "za"));
    }

    @Test
    public void testContainsAny_CharSequence_nullSearchChars() {
        assertFalse(StringUtils.containsAny("abc", (CharSequence) null));
    }

    @Test
    public void testContainsAny_CharSequence_emptySearchChars() {
        assertFalse(StringUtils.containsAny("abc", ""));
    }

    @Test
    public void testContainsAny_CharSequence_found() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
        assertTrue(StringUtils.containsAny("zzabyycdxx", "by"));
    }

    @Test
    public void testContainsAny_CharSequence_notFound() {
        assertFalse(StringUtils.containsAny("aba", "z"));
    }





    @Test
    public void testIndexOfAnyBut_charsFound() {
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", 'z', 'a'));
        assertEquals(0, StringUtils.indexOfAnyBut("aba", 'z'));
    }






    @Test
    public void testIndexOfAnyBut_CharSequence_found() {
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
        assertEquals(0, StringUtils.indexOfAnyBut("aba", "z"));
    }


    @Test
    public void testContainsOnly_nullCs() {
        assertFalse(StringUtils.containsOnly(null, 'a'));
    }

    @Test
    public void testContainsOnly_nullValid() {
        assertFalse(StringUtils.containsOnly("abc", (char[]) null));
    }

    @Test
    public void testContainsOnly_emptyCs() {
        assertTrue(StringUtils.containsOnly("", 'a'));
    }

    @Test
    public void testContainsOnly_emptyValid() {
        assertFalse(StringUtils.containsOnly("ab", new char[]{}));
    }

    @Test
    public void testContainsOnly_true() {
        assertTrue(StringUtils.containsOnly("abab", 'a', 'b', 'c'));
    }

    @Test
    public void testContainsOnly_false() {
        assertFalse(StringUtils.containsOnly("ab1", 'a', 'b', 'c'));
        assertFalse(StringUtils.containsOnly("abz", 'a', 'b', 'c'));
    }

    @Test
    public void testContainsOnly_CharSequence_nullCs() {
        assertFalse(StringUtils.containsOnly(null, "abc"));
    }


    @Test
    public void testContainsOnly_CharSequence_emptyValidChars() {
        assertFalse(StringUtils.containsOnly("ab", ""));
    }

    @Test
    public void testContainsOnly_CharSequence_true() {
        assertTrue(StringUtils.containsOnly("abab", "abc"));
    }

    @Test
    public void testContainsOnly_CharSequence_false() {
        assertFalse(StringUtils.containsOnly("ab1", "abc"));
        assertFalse(StringUtils.containsOnly("abz", "abc"));
    }

    @Test
    public void testContainsNone_nullCs() {
        assertTrue(StringUtils.containsNone(null, 'a'));
    }

    @Test
    public void testContainsNone_nullSearchChars() {
        assertTrue(StringUtils.containsNone("abc", (char[]) null));
    }

    @Test
    public void testContainsNone_emptyCs() {
        assertTrue(StringUtils.containsNone("", 'a'));
    }

    @Test
    public void testContainsNone_emptySearchChars() {
        assertTrue(StringUtils.containsNone("ab", new char[]{}));
    }

    @Test
    public void testContainsNone_true() {
        assertTrue(StringUtils.containsNone("abab", 'x', 'y', 'z'));
        assertTrue(StringUtils.containsNone("ab1", 'x', 'y', 'z'));
    }

    @Test
    public void testContainsNone_false() {
        assertFalse(StringUtils.containsNone("abz", 'x', 'y', 'z'));
    }

    @Test
    public void testContainsNone_CharSequence_nullCs() {
        assertTrue(StringUtils.containsNone(null, "xyz"));
    }


    @Test
    public void testContainsNone_CharSequence_emptyInvalidChars() {
        assertTrue(StringUtils.containsNone("ab", ""));
    }

    @Test
    public void testContainsNone_CharSequence_true() {
        assertTrue(StringUtils.containsNone("abab", "xyz"));
        assertTrue(StringUtils.containsNone("ab1", "xyz"));
    }

    @Test
    public void testContainsNone_CharSequence_false() {
        assertFalse(StringUtils.containsNone("abz", "xyz"));
    }




    @Test
    public void testIndexOfAny_CharSequenceArray_found() {
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", "ab", "cd"));
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", "cd", "ab"));
        assertEquals(1, StringUtils.indexOfAny("zzabyycdxx", "zab", "aby"));
    }


    @Test
    public void testIndexOfAny_CharSequenceArray_emptySearchString() {
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", ""));
        assertEquals(0, StringUtils.indexOfAny("", ""));
    }

    @Test
    public void testIndexOfAny_CharSequenceArray_emptyStr() {
        assertEquals(-1, StringUtils.indexOfAny("", "a"));
    }




    @Test
    public void testLastIndexOfAny_CharSequenceArray_found() {
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", "ab", "cd"));
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", "cd", "ab"));
    }


    @Test
    public void testLastIndexOfAny_CharSequenceArray_emptySearchString() {
        assertEquals(10, StringUtils.lastIndexOfAny("zzabyycdxx", "mn", ""));
    }

    @Test
    public void testSubstring_nullStr() {
        assertNull(StringUtils.substring(null, 0));
    }

    @Test
    public void testSubstring_emptyStr() {
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
        assertEquals("abc", StringUtils.substring("abc", -4));
    }

    @Test
    public void testSubstring_startNegativeAndBeyondLength() {
        assertEquals("", StringUtils.substring("abc", -4, 0));
    }

    @Test
    public void testSubstring_startAndEnd_nullStr() {
        assertNull(StringUtils.substring(null, 0, 2));
    }

    @Test
    public void testSubstring_startAndEnd_emptyStr() {
        assertEquals("", StringUtils.substring("", 0, 0));
    }

    @Test
    public void testSubstring_startAndEnd_normal() {
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
    }

    @Test
    public void testSubstring_startAndEnd_endBeforeStart() {
        assertEquals("", StringUtils.substring("abc", 2, 0));
    }

    @Test
    public void testSubstring_startAndEnd_endBeyondLength() {
        assertEquals("c", StringUtils.substring("abc", 2, 4));
    }

    @Test
    public void testSubstring_startAndEnd_endBeyondLengthAndStartBeyondLength() {
        assertEquals("", StringUtils.substring("abc", 4, 6));
    }

    @Test
    public void testSubstring_startAndEnd_startEqualsEnd() {
        assertEquals("", StringUtils.substring("abc", 2, 2));
    }

    @Test
    public void testSubstring_startAndEnd_negativeStartAndEnd() {
        assertEquals("b", StringUtils.substring("abc", -2, -1));
    }

    @Test
    public void testSubstring_startAndEnd_negativeStartAndPositiveEnd() {
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }

    @Test
    public void testLeft_nullStr() {
        assertNull(StringUtils.left(null, 2));
    }

    @Test
    public void testLeft_negativeLen() {
        assertEquals("", StringUtils.left("abc", -1));
    }

    @Test
    public void testLeft_emptyStr() {
        assertEquals("", StringUtils.left("", 2));
    }

    @Test
    public void testLeft_lenZero() {
        assertEquals("", StringUtils.left("abc", 0));
    }

    @Test
    public void testLeft_lenSufficient() {
        assertEquals("ab", StringUtils.left("abc", 2));
    }

    @Test
    public void testLeft_lenTooLarge() {
        assertEquals("abc", StringUtils.left("abc", 4));
    }

    @Test
    public void testRight_nullStr() {
        assertNull(StringUtils.right(null, 2));
    }

    @Test
    public void testRight_negativeLen() {
        assertEquals("", StringUtils.right("abc", -1));
    }

    @Test
    public void testRight_emptyStr() {
        assertEquals("", StringUtils.right("", 2));
    }

    @Test
    public void testRight_lenZero() {
        assertEquals("", StringUtils.right("abc", 0));
    }

    @Test
    public void testRight_lenSufficient() {
        assertEquals("bc", StringUtils.right("abc", 2));
    }

    @Test
    public void testRight_lenTooLarge() {
        assertEquals("abc", StringUtils.right("abc", 4));
    }

    @Test
    public void testMid_nullStr() {
        assertNull(StringUtils.mid(null, 0, 2));
    }

    @Test
    public void testMid_negativeLen() {
        assertEquals("", StringUtils.mid("abc", 0, -1));
    }

    @Test
    public void testMid_posBeyondLength() {
        assertEquals("", StringUtils.mid("abc", 4, 2));
    }

    @Test
    public void testMid_emptyStr() {
        assertEquals("", StringUtils.mid("", 0, 0));
    }

    @Test
    public void testMid_normal() {
        assertEquals("ab", StringUtils.mid("abc", 0, 2));
    }

    @Test
    public void testMid_lenTooLarge() {
        assertEquals("abc", StringUtils.mid("abc", 0, 4));
    }

    @Test
    public void testMid_normalWithOffset() {
        assertEquals("c", StringUtils.mid("abc", 2, 4));
    }

    @Test
    public void testMid_normalWithOffsetAndLenTooLarge() {
        assertEquals("c", StringUtils.mid("abc", 2, 4));
    }

    @Test
    public void testMid_normalWithOffsetAndLengthZero() {
        assertEquals("", StringUtils.mid("abc", 4, 2));
    }

    @Test
    public void testMid_negativePos() {
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
    }

    @Test
    public void testSubstringBefore_nullStr() {
        assertNull(StringUtils.substringBefore(null, "a"));
    }

    @Test
    public void testSubstringBefore_emptyStr() {
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
    public void testSubstringBefore_separatorFound() {
        assertEquals("", StringUtils.substringBefore("abc", "a"));
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        assertEquals("ab", StringUtils.substringBefore("abc", "c"));
    }

    @Test
    public void testSubstringAfter_nullStr() {
        assertNull(StringUtils.substringAfter(null, "a"));
    }

    @Test
    public void testSubstringAfter_emptyStr() {
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
    public void testSubstringAfter_separatorFound() {
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        assertEquals("", StringUtils.substringAfter("abc", "c"));
    }

    @Test
    public void testSubstringBeforeLast_nullStr() {
        assertNull(StringUtils.substringBeforeLast(null, "a"));
    }

    @Test
    public void testSubstringBeforeLast_emptyStr() {
        assertEquals("", StringUtils.substringBeforeLast("", "a"));
    }

    @Test
    public void testSubstringBeforeLast_emptySeparator() {
        assertEquals("abc", StringUtils.substringBeforeLast("abc", ""));
    }

    @Test
    public void testSubstringBeforeLast_nullSeparator() {
        assertEquals("abc", StringUtils.substringBeforeLast("abc", null));
    }

    @Test
    public void testSubstringBeforeLast_separatorNotFound() {
        assertEquals("a", StringUtils.substringBeforeLast("a", "z"));
    }

    @Test
    public void testSubstringBeforeLast_separatorFound() {
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
        assertEquals("ab", StringUtils.substringBeforeLast("abc", "c"));
        assertEquals("", StringUtils.substringBeforeLast("a", "a"));
    }

    @Test
    public void testSubstringAfterLast_nullStr() {
        assertNull(StringUtils.substringAfterLast(null, "a"));
    }

    @Test
    public void testSubstringAfterLast_emptyStr() {
        assertEquals("", StringUtils.substringAfterLast("", "a"));
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
    public void testSubstringAfterLast_separatorFoundAtEnd() {
        assertEquals("", StringUtils.substringAfterLast("abc", "c"));
        assertEquals("", StringUtils.substringAfterLast("a", "a"));
    }

    @Test
    public void testSubstringAfterLast_separatorFoundMiddle() {
        assertEquals("bc", StringUtils.substringAfterLast("abc", "a"));
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
    }

    @Test
    public void testSubstringBetween_nullStr() {
        assertNull(StringUtils.substringBetween(null, "tag"));
    }

    @Test
    public void testSubstringBetween_nullTag() {
        assertNull(StringUtils.substringBetween("tagabctag", null));
    }

    @Test
    public void testSubstringBetween_emptyTag() {
        assertEquals("", StringUtils.substringBetween("tagabctag", ""));
    }

    @Test
    public void testSubstringBetween_emptyStr() {
        assertEquals("", StringUtils.substringBetween("", ""));
        assertNull(StringUtils.substringBetween("", "tag"));
    }

    @Test
    public void testSubstringBetween_found() {
        assertEquals("abc", StringUtils.substringBetween("tagabctag", "tag"));
    }

    @Test
    public void testSubstringBetween_notFound() {
        assertNull(StringUtils.substringBetween("abc", "tag"));
    }

    @Test
    public void testSubstringBetween_openAndClose_nullStr() {
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
    public void testSubstringBetween_openAndClose_emptyOpenAndClose() {
        assertEquals("", StringUtils.substringBetween("", "", ""));
    }

    @Test
    public void testSubstringBetween_openAndClose_emptyOpenAndNonEmptyClose() {
        assertNull(StringUtils.substringBetween("", "", "]"));
    }

    @Test
    public void testSubstringBetween_openAndClose_emptyStr() {
        assertNull(StringUtils.substringBetween("", "[", "]"));
    }

    @Test
    public void testSubstringBetween_openAndClose_emptyOpenAndNormalClose() {
        assertEquals("", StringUtils.substringBetween("yabcz", "", ""));
    }

    @Test
    public void testSubstringBetween_openAndClose_found() {
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertEquals("abc", StringUtils.substringBetween("yabcz", "y", "z"));
    }

    @Test
    public void testSubstringBetween_openAndClose_foundMultiple() {
        assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));
    }

    @Test
    public void testSubstringBetween_openAndClose_notFound() {
        assertNull(StringUtils.substringBetween("abc", "a", "d"));
    }

    @Test
    public void testSubstringsBetween_nullStr() {
        assertNull(StringUtils.substringsBetween(null, "[", "]"));
    }

    @Test
    public void testSubstringsBetween_nullOpen() {
        assertNull(StringUtils.substringsBetween("[a][b][c]", null, "]"));
    }

    @Test
    public void testSubstringsBetween_nullClose() {
        assertNull(StringUtils.substringsBetween("[a][b][c]", "[", null));
    }

    @Test
    public void testSubstringsBetween_emptyOpen() {
        assertNull(StringUtils.substringsBetween("[a][b][c]", "", "]"));
    }

    @Test
    public void testSubstringsBetween_emptyClose() {
        assertNull(StringUtils.substringsBetween("[a][b][c]", "[", ""));
    }

    @Test
    public void testSubstringsBetween_emptyStr() {
        assertArrayEquals(new String[]{}, StringUtils.substringsBetween("", "[", "]"));
    }

    @Test
    public void testSubstringsBetween_noMatch() {
        assertNull(StringUtils.substringsBetween("abc", "[", "]"));
    }

    @Test
    public void testSubstringsBetween_found() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.substringsBetween("[a][b][c]", "[", "]"));
    }

    @Test
    public void testSubstringsBetween_overlappingSeparators() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.substringsBetween("a[b]c[d]e[f]g", "[", "]"));
    }

    @Test
    public void testSubstringsBetween_adjacentSeparators() {
        assertArrayEquals(new String[]{"", "b", ""}, StringUtils.substringsBetween("a[]b[c][]d", "[", "]"));
    }

    @Test
    public void testSplit_nullStr() {
        assertNull(StringUtils.split(null));
    }

    @Test
    public void testSplit_emptyStr() {
        assertArrayEquals(new String[]{}, StringUtils.split(""));
    }

    @Test
    public void testSplit_normal() {
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc def"));
    }

    @Test
    public void testSplit_multipleSpaces() {
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc  def"));
    }

    @Test
    public void testSplit_leadingAndTrailingSpaces() {
        assertArrayEquals(new String[]{"abc"}, StringUtils.split(" abc "));
    }

    @Test
    public void testSplit_withSeparatorChar_normal() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a.b.c", '.'));
    }

    @Test
    public void testSplit_withSeparatorChar_multipleSeparators() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a..b.c", '.'));
    }

    @Test
    public void testSplit_withSeparatorChar_noSeparator() {
        assertArrayEquals(new String[]{"a:b:c"}, StringUtils.split("a:b:c", '.'));
    }

    @Test
    public void testSplit_withSeparatorChar_spaceSeparator() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a b c", ' '));
    }

    @Test
    public void testSplit_withSeparatorString_nullSeparator_normal() {
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc def", null));
    }

    @Test
    public void testSplit_withSeparatorString_nullSeparator_multipleSpaces() {
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.split("abc   def", null));
    }

    @Test
    public void testSplit_withSeparatorString_normal() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":"));
    }

    @Test
    public void testSplit_withSeparatorString_normalWithMultipleSeparators() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab--cd--ef", "--"));
    }

    @Test
    public void testSplit_withSeparatorStringAndMax_zeroMax() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":", 0));
    }

    @Test
    public void testSplit_withSeparatorStringAndMax_negativeMax() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":", -1));
    }

    @Test
    public void testSplit_withSeparatorStringAndMax_limitReached() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.split("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplit_withSeparatorStringAndMax_limitNotReached() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.split("ab:cd:ef", ":", 5));
    }

    @Test
    public void testSplit_withSeparatorStringAndMax_leadingSpaces() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.split("ab   de fg", null, 0));
    }

    @Test
    public void testSplitByWholeSeparator_nullStr() {
        assertNull(StringUtils.splitByWholeSeparator(null, ":"));
    }

    @Test
    public void testSplitByWholeSeparator_emptyStr() {
        assertArrayEquals(new String[]{}, StringUtils.splitByWholeSeparator("", ":"));
    }

    @Test
    public void testSplitByWholeSeparator_nullSeparator() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparator("ab de fg", null));
    }

    @Test
    public void testSplitByWholeSeparator_emptySeparator() {
        assertArrayEquals(new String[]{"ab de fg"}, StringUtils.splitByWholeSeparator("ab de fg", ""));
    }

    @Test
    public void testSplitByWholeSeparator_normal() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparator_multiCharSeparator() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-"));
    }

    @Test
    public void testSplitByWholeSeparator_withMax_zeroMax() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 0));
    }

    @Test
    public void testSplitByWholeSeparator_withMax_limitReached() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitByWholeSeparator_withMax_limitNotReached() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 5));
    }

    @Test
    public void testSplitByWholeSeparator_withMax_nullSeparator() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparator("ab de fg", null, 0));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_nullStr() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_emptyStr() {
        assertArrayEquals(new String[]{}, StringUtils.splitByWholeSeparatorPreserveAllTokens("", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_nullSeparator() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_normal() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_adjacentSeparators() {
        assertArrayEquals(new String[]{"ab", "", "cd", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab::cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_leadingSeparator() {
        assertArrayEquals(new String[]{"", "cd", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens(":cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_trailingSeparator() {
        assertArrayEquals(new String[]{"ab", "cd", ""}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_multipleAdjacentSeparators() {
        assertArrayEquals(new String[]{"ab", "", "", "cd", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:::cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_withMax_zeroMax() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":", 0));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_withMax_limitReached() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_withMax_adjacentSeparators() {
        assertArrayEquals(new String[]{"ab", "", "cd:ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab::cd:ef", ":", 3));
    }

    @Test
    public void testSplitPreserveAllTokens_nullStr() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
    }

    @Test
    public void testSplitPreserveAllTokens_emptyStr() {
        assertArrayEquals(new String[]{}, StringUtils.splitPreserveAllTokens(""));
    }

    @Test
    public void testSplitPreserveAllTokens_normal() {
        assertArrayEquals(new String[]{"abc", "def"}, StringUtils.splitPreserveAllTokens("abc def"));
    }

    @Test
    public void testSplitPreserveAllTokens_adjacentSpaces() {
        assertArrayEquals(new String[]{"abc", "", "def"}, StringUtils.splitPreserveAllTokens("abc  def"));
    }

    @Test
    public void testSplitPreserveAllTokens_leadingAndTrailingSpaces() {
        assertArrayEquals(new String[]{"", "abc", ""}, StringUtils.splitPreserveAllTokens(" abc "));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorChar_normal() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.splitPreserveAllTokens("a.b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorChar_adjacentSeparators() {
        assertArrayEquals(new String[]{"a", "", "b", "c"}, StringUtils.splitPreserveAllTokens("a..b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorChar_trailingSeparator() {
        assertArrayEquals(new String[]{"a", "b", "c", ""}, StringUtils.splitPreserveAllTokens("a.b.c.", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorChar_leadingSeparator() {
        assertArrayEquals(new String[]{"", "b", "c"}, StringUtils.splitPreserveAllTokens(".b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorChar_multipleLeadingSeparators() {
        assertArrayEquals(new String[]{"", "", "b", "c"}, StringUtils.splitPreserveAllTokens("..b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorString_normal() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitPreserveAllTokens("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorString_adjacentSeparators() {
        assertArrayEquals(new String[]{"ab", "", "cd", "ef"}, StringUtils.splitPreserveAllTokens("ab::cd:ef", ":"));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorString_trailingSeparator() {
        assertArrayEquals(new String[]{"ab", "cd", "ef", ""}, StringUtils.splitPreserveAllTokens("ab:cd:ef:", ":"));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorString_leadingSeparator() {
        assertArrayEquals(new String[]{"", "cd", "ef"}, StringUtils.splitPreserveAllTokens(":cd:ef", ":"));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorString_multipleLeadingSeparators() {
        assertArrayEquals(new String[]{"", "", "cd", "ef"}, StringUtils.splitPreserveAllTokens("::cd:ef", ":"));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorStringAndMax_zeroMax() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 0));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorStringAndMax_limitReached() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorStringAndMax_adjacentSeparators() {
        assertArrayEquals(new String[]{"ab", "", "cd:ef"}, StringUtils.splitPreserveAllTokens("ab::cd:ef", ":", 3));
    }

    @Test
    public void testSplitPreserveAllTokens_withSeparatorStringAndMax_multipleAdjacentSeparators() {
        assertArrayEquals(new String[]{"ab", "", "", "de fg"}, StringUtils.splitPreserveAllTokens("ab   de fg", null, 4));
    }

    @Test
    public void testSplitByCharacterType_nullStr() {
        assertNull(StringUtils.splitByCharacterType(null));
    }

    @Test
    public void testSplitByCharacterType_emptyStr() {
        assertArrayEquals(new String[]{}, StringUtils.splitByCharacterType(""));
    }

    @Test
    public void testSplitByCharacterType_normal() {
        assertArrayEquals(new String[]{"ab", " ", "de", " ", "fg"}, StringUtils.splitByCharacterType("ab de fg"));
    }

    @Test
    public void testSplitByCharacterType_multipleSpaces() {
        assertArrayEquals(new String[]{"ab", "   ", "de", " ", "fg"}, StringUtils.splitByCharacterType("ab   de fg"));
    }

    @Test
    public void testSplitByCharacterType_withPunctuation() {
        assertArrayEquals(new String[]{"ab", ":", "cd", ":", "ef"}, StringUtils.splitByCharacterType("ab:cd:ef"));
    }

    @Test
    public void testSplitByCharacterType_withNumber() {
        assertArrayEquals(new String[]{"number", "5"}, StringUtils.splitByCharacterType("number5"));
    }

    @Test
    public void testSplitByCharacterType_camelCaseSplit() {
        assertArrayEquals(new String[]{"foo", "B", "ar"}, StringUtils.splitByCharacterType("fooBar"));
    }

    @Test
    public void testSplitByCharacterType_mixed() {
        assertArrayEquals(new String[]{"foo", "200", "B", "ar"}, StringUtils.splitByCharacterType("foo200Bar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_nullStr() {
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_emptyStr() {
        assertArrayEquals(new String[]{}, StringUtils.splitByCharacterTypeCamelCase(""));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_normal() {
        assertArrayEquals(new String[]{"ab", " ", "de", " ", "fg"}, StringUtils.splitByCharacterTypeCamelCase("ab de fg"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_multipleSpaces() {
        assertArrayEquals(new String[]{"ab", "   ", "de", " ", "fg"}, StringUtils.splitByCharacterTypeCamelCase("ab   de fg"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_withPunctuation() {
        assertArrayEquals(new String[]{"ab", ":", "cd", ":", "ef"}, StringUtils.splitByCharacterTypeCamelCase("ab:cd:ef"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_withNumber() {
        assertArrayEquals(new String[]{"number", "5"}, StringUtils.splitByCharacterTypeCamelCase("number5"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_camelCaseSplit() {
        assertArrayEquals(new String[]{"foo", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("fooBar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_mixed() {
        assertArrayEquals(new String[]{"foo", "200", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("foo200Bar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCase_uppercaseSequence() {
        assertArrayEquals(new String[]{"ASF", "Rules"}, StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    @Test
    public void testJoin_varargs_null() {
        assertNull(StringUtils.join((Object[]) null));
    }

    @Test
    public void testJoin_varargs_empty() {
        assertEquals("", StringUtils.join());
    }

    @Test
    public void testJoin_varargs_singleElement() {
        assertEquals("a", StringUtils.join((Object[]) new String[]{"a"}));
    }

    @Test
    public void testJoin_varargs_multipleElements() {
        assertEquals("abc", StringUtils.join("a", "b", "c"));
    }

    @Test
    public void testJoin_varargs_withNullsAndEmpty() {
        assertEquals("a", StringUtils.join(null, "", "a"));
    }

    @Test
    public void testJoin_withSeparatorChar_nullArray() {
        assertNull(StringUtils.join((Object[]) null, ';'));
    }

    @Test
    public void testJoin_withSeparatorChar_emptyArray() {
        assertEquals("", StringUtils.join(new Object[0], ';'));
    }

    @Test
    public void testJoin_withSeparatorChar_singleElement() {
        assertEquals("a", StringUtils.join((Object[]) new String[]{"a"}, ';'));
    }

    @Test
    public void testJoin_withSeparatorChar_multipleElements() {
        assertEquals("a;b;c", StringUtils.join(new Object[]{"a", "b", "c"}, ';'));
    }

    @Test
    public void testJoin_withSeparatorChar_withNullsAndEmpty() {
        assertEquals(";;a", StringUtils.join(new Object[]{null, "", "a"}, ';'));
    }

    @Test
    public void testJoin_withSeparatorCharAndRange_nullArray() {
        assertNull(StringUtils.join((Object[]) null, ';', 0, 0));
    }

    @Test
    public void testJoin_withSeparatorCharAndRange_emptyRange() {
        assertEquals("", StringUtils.join(new Object[]{"a", "b"}, ';', 1, 1));
    }

    @Test
    public void testJoin_withSeparatorCharAndRange_normal() {
        assertEquals("b;c", StringUtils.join(new Object[]{"a", "b", "c"}, ';', 1, 3));
    }

    @Test
    public void testJoin_withSeparatorString_nullArray() {
        assertNull(StringUtils.join((Object[]) null, "--"));
    }

    @Test
    public void testJoin_withSeparatorString_emptyArray() {
        assertEquals("", StringUtils.join(new Object[0], "--"));
    }

    @Test
    public void testJoin_withSeparatorString_singleElement() {
        assertEquals("a", StringUtils.join((Object[]) new String[]{"a"}, "--"));
    }

    @Test
    public void testJoin_withSeparatorString_multipleElements() {
        assertEquals("a--b--c", StringUtils.join(new Object[]{"a", "b", "c"}, "--"));
    }

    @Test
    public void testJoin_withSeparatorString_nullSeparator() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, null));
    }

    @Test
    public void testJoin_withSeparatorString_emptySeparator() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, ""));
    }

    @Test
    public void testJoin_withSeparatorString_withNullsAndEmpty() {
        assertEquals(",,a", StringUtils.join(new Object[]{null, "", "a"}, ','));
    }

    @Test
    public void testJoin_withSeparatorStringAndRange_nullArray() {
        assertNull(StringUtils.join((Object[]) null, "--", 0, 0));
    }

    @Test
    public void testJoin_withSeparatorStringAndRange_emptyRange() {
        assertEquals("", StringUtils.join(new Object[]{"a", "b"}, "--", 1, 1));
    }

    @Test
    public void testJoin_withSeparatorStringAndRange_normal() {
        assertEquals("b--c", StringUtils.join(new Object[]{"a", "b", "c"}, "--", 1, 3));
    }

    @Test
    public void testJoin_withSeparatorStringAndRange_nullSeparator() {
        assertEquals("bc", StringUtils.join(new Object[]{"a", "b", "c"}, null, 1, 3));
    }

    @Test
    public void testJoin_withSeparatorStringAndRange_emptySeparator() {
        assertEquals("bc", StringUtils.join(new Object[]{"a", "b", "c"}, "", 1, 3));
    }

    @Test
    public void testJoin_iterator_null() {
        assertNull(StringUtils.join((Iterator<?>) null, ';'));
    }

    @Test
    public void testJoin_iterator_empty() {
        assertEquals("", StringUtils.join(Arrays.asList().iterator(), ';'));
    }

    @Test
    public void testJoin_iterator_singleElement() {
        assertEquals("a", StringUtils.join(Arrays.asList("a").iterator(), ';'));
    }

    @Test
    public void testJoin_iterator_multipleElements() {
        assertEquals("a;b;c", StringUtils.join(Arrays.asList("a", "b", "c").iterator(), ';'));
    }

    @Test
    public void testJoin_iterator_withNullsAndEmpty() {
        assertEquals(";;a", StringUtils.join(Arrays.asList(null, "", "a").iterator(), ';'));
    }

    @Test
    public void testJoin_iteratorAndSeparatorString_nullIterator() {
        assertNull(StringUtils.join((Iterator<?>) null, "--"));
    }

    @Test
    public void testJoin_iteratorAndSeparatorString_nullSeparator() {
        assertEquals("abc", StringUtils.join(Arrays.asList("a", "b", "c").iterator(), null));
    }

    @Test
    public void testJoin_iteratorAndSeparatorString_emptySeparator() {
        assertEquals("abc", StringUtils.join(Arrays.asList("a", "b", "c").iterator(), ""));
    }

    @Test
    public void testJoin_iteratorAndSeparatorString_multipleElements() {
        assertEquals("a--b--c", StringUtils.join(Arrays.asList("a", "b", "c").iterator(), "--"));
    }

    @Test
    public void testJoin_iterable_null() {
        assertNull(StringUtils.join((Iterable<?>) null, ';'));
    }

    @Test
    public void testJoin_iterable_empty() {
        assertEquals("", StringUtils.join(new ArrayList<String>(), ';'));
    }

    @Test
    public void testJoin_iterable_singleElement() {
        assertEquals("a", StringUtils.join(Arrays.asList("a"), ';'));
    }

    @Test
    public void testJoin_iterable_multipleElements() {
        assertEquals("a;b;c", StringUtils.join(Arrays.asList("a", "b", "c"), ';'));
    }

    @Test
    public void testJoin_iterableAndSeparatorString_nullIterable() {
        assertNull(StringUtils.join((Iterable<?>) null, "--"));
    }

    @Test
    public void testJoin_iterableAndSeparatorString_nullSeparator() {
        assertEquals("abc", StringUtils.join(Arrays.asList("a", "b", "c"), null));
    }

    @Test
    public void testJoin_iterableAndSeparatorString_emptySeparator() {
        assertEquals("abc", StringUtils.join(Arrays.asList("a", "b", "c"), ""));
    }

    @Test
    public void testJoin_iterableAndSeparatorString_multipleElements() {
        assertEquals("a--b--c", StringUtils.join(Arrays.asList("a", "b", "c"), "--"));
    }

    @Test
    public void testDeleteWhitespace_nullStr() {
        assertNull(StringUtils.deleteWhitespace(null));
    }

    @Test
    public void testDeleteWhitespace_emptyStr() {
        assertEquals("", StringUtils.deleteWhitespace(""));
    }

    @Test
    public void testDeleteWhitespace_noWhitespace() {
        assertEquals("abc", StringUtils.deleteWhitespace("abc"));
    }

    @Test
    public void testDeleteWhitespace_withWhitespace() {
        assertEquals("abc", StringUtils.deleteWhitespace("   ab  c  "));
    }

    @Test
    public void testRemoveStart_nullStr() {
        assertNull(StringUtils.removeStart(null, "www."));
    }

    @Test
    public void testRemoveStart_emptyStr() {
        assertEquals("", StringUtils.removeStart("", "www."));
    }

    @Test
    public void testRemoveStart_nullRemove() {
        assertEquals("abc", StringUtils.removeStart("abc", null));
    }

    @Test
    public void testRemoveStart_emptyRemove() {
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }

    @Test
    public void testRemoveStart_match() {
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
    public void testRemoveStartIgnoreCase_nullStr() {
        assertNull(StringUtils.removeStartIgnoreCase(null, "www."));
    }

    @Test
    public void testRemoveStartIgnoreCase_emptyStr() {
        assertEquals("", StringUtils.removeStartIgnoreCase("", "www."));
    }

    @Test
    public void testRemoveStartIgnoreCase_nullRemove() {
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", null));
    }

    @Test
    public void testRemoveStartIgnoreCase_emptyRemove() {
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", ""));
    }

    @Test
    public void testRemoveStartIgnoreCase_matchCaseInsensitive() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."));
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("WWW.domain.com", "www."));
    }

    @Test
    public void testRemoveStartIgnoreCase_noMatch() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("domain.com", "www."));
    }

    @Test
    public void testRemoveEnd_nullStr() {
        assertNull(StringUtils.removeEnd(null, ".com"));
    }

    @Test
    public void testRemoveEnd_emptyStr() {
        assertEquals("", StringUtils.removeEnd("", ".com"));
    }

    @Test
    public void testRemoveEnd_nullRemove() {
        assertEquals("abc", StringUtils.removeEnd("abc", null));
    }

    @Test
    public void testRemoveEnd_emptyRemove() {
        assertEquals("abc", StringUtils.removeEnd("abc", ""));
    }

    @Test
    public void testRemoveEnd_match() {
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
    public void testRemoveEnd_suffixTooLong() {
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", ".com."));
    }

    @Test
    public void testRemoveEndIgnoreCase_nullStr() {
        assertNull(StringUtils.removeEndIgnoreCase(null, ".com"));
    }

    @Test
    public void testRemoveEndIgnoreCase_emptyStr() {
        assertEquals("", StringUtils.removeEndIgnoreCase("", ".com"));
    }

    @Test
    public void testRemoveEndIgnoreCase_nullRemove() {
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", null));
    }

    @Test
    public void testRemoveEndIgnoreCase_emptyRemove() {
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", ""));
    }

    @Test
    public void testRemoveEndIgnoreCase_matchCaseInsensitive() {
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"));
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"));
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
    public void testRemove_nullStr() {
        assertNull(StringUtils.remove(null, "a"));
    }

    @Test
    public void testRemove_emptyStr() {
        assertEquals("", StringUtils.remove("", "a"));
    }

    @Test
    public void testRemove_nullRemove() {
        assertEquals("abc", StringUtils.remove("abc", null));
    }

    @Test
    public void testRemove_emptyRemove() {
        assertEquals("abc", StringUtils.remove("abc", ""));
    }

    @Test
    public void testRemove_match() {
        assertEquals("qd", StringUtils.remove("queued", "ue"));
    }

    @Test
    public void testRemove_noMatch() {
        assertEquals("queued", StringUtils.remove("queued", "zz"));
    }

    @Test
    public void testRemove_multipleMatches() {
        assertEquals("abc", StringUtils.remove("ababab", "ab"));
    }

    @Test
    public void testRemove_char_nullStr() {
        assertNull(StringUtils.remove(null, 'a'));
    }

    @Test
    public void testRemove_char_emptyStr() {
        assertEquals("", StringUtils.remove("", 'a'));
    }

    @Test
    public void testRemove_char_match() {
        assertEquals("qeed", StringUtils.remove("queued", 'u'));
    }

    @Test
    public void testRemove_char_noMatch() {
        assertEquals("queued", StringUtils.remove("queued", 'z'));
    }

    @Test
    public void testRemove_char_multipleMatches() {
        assertEquals("qeed", StringUtils.remove("quuued", 'u'));
    }

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
        assertEquals("abc", StringUtils.replaceOnce("abc", null, "z"));
    }

    @Test
    public void testReplaceOnce_nullReplacement() {
        assertEquals("aba", StringUtils.replaceOnce("aba", "a", null));
    }

    @Test
    public void testReplaceOnce_emptySearchString() {
        assertEquals("abc", StringUtils.replaceOnce("abc", "", "z"));
    }

    @Test
    public void testReplaceOnce_match() {
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
    }

    @Test
    public void testReplaceOnce_noMatch() {
        assertEquals("abc", StringUtils.replaceOnce("abc", "d", "z"));
    }

    @Test
    public void testReplaceOnce_multipleMatches() {
        assertEquals("zba", StringUtils.replaceOnce("abaa", "a", "z"));
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
        assertEquals("abc", StringUtils.replace("abc", null, "z"));
    }

    @Test
    public void testReplace_nullReplacement() {
        assertEquals("aba", StringUtils.replace("aba", "a", null));
    }

    @Test
    public void testReplace_emptySearchString() {
        assertEquals("abc", StringUtils.replace("abc", "", "z"));
    }

    @Test
    public void testReplace_match() {
        assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
    }

    @Test
    public void testReplace_noMatch() {
        assertEquals("abc", StringUtils.replace("abc", "d", "z"));
    }

    @Test
    public void testReplace_multipleMatches() {
        assertEquals("zbzbz", StringUtils.replace("ababab", "ab", "z"));
    }

    @Test
    public void testReplace_withEmptyReplacement() {
        assertEquals("b", StringUtils.replace("aba", "a", ""));
    }

    @Test
    public void testReplace_withMax_zeroMax() {
        assertEquals("abaa", StringUtils.replace("abaa", "a", "z", 0));
    }

    @Test
    public void testReplace_withMax_oneMax() {
        assertEquals("zbaa", StringUtils.replace("abaa", "a", "z", 1));
    }

    @Test
    public void testReplace_withMax_twoMax() {
        assertEquals("zbza", StringUtils.replace("abaa", "a", "z", 2));
    }

    @Test
    public void testReplace_withMax_negativeMax() {
        assertEquals("zbzbz", StringUtils.replace("ababab", "ab", "z", -1));
    }

    @Test
    public void testReplace_withMax_replacementNull() {
        assertEquals("abaa", StringUtils.replace("abaa", "a", null, -1));
    }

    @Test
    public void testReplace_withMax_searchStringEmpty() {
        assertEquals("abaa", StringUtils.replace("abaa", "", "z", -1));
    }

    @Test
    public void testReplaceEach_nullText() {
        assertNull(StringUtils.replaceEach(null, new String[]{"a"}, new String[]{"z"}));
    }

    @Test
    public void testReplaceEach_emptyText() {
        assertEquals("", StringUtils.replaceEach("", new String[]{"a"}, new String[]{"z"}));
    }

    @Test
    public void testReplaceEach_nullSearchList() {
        assertEquals("aba", StringUtils.replaceEach("aba", null, new String[]{"z"}));
    }

    @Test
    public void testReplaceEach_nullReplacementList() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{"a"}, null));
    }

    @Test
    public void testReplaceEach_emptySearchList() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[0], new String[]{"z"}));
    }

    @Test
    public void testReplaceEach_emptyReplacementList() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{"a"}, new String[0]));
    }

    @Test
    public void testReplaceEach_noMatch() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{"x"}, new String[]{"z"}));
    }

    @Test
    public void testReplaceEach_singleMatch() {
        assertEquals("zba", StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{"z"}));
    }

    @Test
    public void testReplaceEach_multipleMatches() {
        assertEquals("zbzbz", StringUtils.replaceEach("ababab", new String[]{"ab"}, new String[]{"z"}));
    }


    @Test
    public void testReplaceEach_multipleReplacements_withRepeat_false() {
        assertEquals("dcte", StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}));
    }

    @Test
    public void testReplaceEach_multipleReplacements_withRepeat_true() {
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}));
    }

    @Test
    public void testReplaceEach_nullInLists() {
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{null}, new String[]{"z"}));
        assertEquals("aba", StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{null}));
    }

    @Test
    public void testReplaceChars_nullStr() {
        assertNull(StringUtils.replaceChars(null, 'a', 'z'));
    }

    @Test
    public void testReplaceChars_emptyStr() {
        assertEquals("", StringUtils.replaceChars("", 'a', 'z'));
    }

    @Test
    public void testReplaceChars_match() {
        assertEquals("aycya", StringUtils.replaceChars("abcba", 'b', 'y'));
    }

    @Test
    public void testReplaceChars_noMatch() {
        assertEquals("abcba", StringUtils.replaceChars("abcba", 'z', 'y'));
    }

    @Test
    public void testReplaceChars_multipleSearchAndReplace_equalLength() {
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
    }

    @Test
    public void testReplaceChars_multipleSearchAndReplace_shorterReplace() {
        assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
    }

    @Test
    public void testReplaceChars_multipleSearchAndReplace_longerReplace() {
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yzx"));
    }

    @Test
    public void testReplaceChars_multipleSearchAndReplace_emptyReplace() {
        assertEquals("aa", StringUtils.replaceChars("abcba", "bc", ""));
    }

    @Test
    public void testReplaceChars_multipleSearchAndReplace_nullReplace() {
        assertEquals("aa", StringUtils.replaceChars("abcba", "bc", null));
    }

    @Test
    public void testReplaceChars_multipleSearchAndReplace_emptySearch() {
        assertEquals("abcba", StringUtils.replaceChars("abcba", "", "yz"));
    }

    @Test
    public void testReplaceChars_multipleSearchAndReplace_nullSearch() {
        assertEquals("abcba", StringUtils.replaceChars("abcba", null, "yz"));
    }

    @Test
    public void testOverlay_nullStr() {
        assertNull(StringUtils.overlay(null, "abc", 2, 4));
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
    public void testOverlay_emptyOverlay_swap() {
        assertEquals("abef", StringUtils.overlay("abcdef", "", 4, 2));
    }

    @Test
    public void testOverlay_normal() {
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
    }

    @Test
    public void testOverlay_normal_swap() {
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2));
    }

    @Test
    public void testOverlay_negativeStart() {
        assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4));
    }

    @Test
    public void testOverlay_endBeyondLength() {
        assertEquals("abzzzz", StringUtils.overlay("abcdef", "zzzz", 2, 8));
    }

    @Test
    public void testOverlay_negativeStartAndEnd() {
        assertEquals("zzzzabcdef", StringUtils.overlay("abcdef", "zzzz", -2, -3));
    }

    @Test
    public void testOverlay_startAndEndBeyondLength() {
        assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 8, 10));
    }

    @Test
    public void testChomp_nullStr() {
        assertNull(StringUtils.chomp(null));
    }

    @Test
    public void testChomp_emptyStr() {
        assertEquals("", StringUtils.chomp(""));
    }

    @Test
    public void testChomp_singleLF() {
        assertEquals("", StringUtils.chomp("\n"));
    }

    @Test
    public void testChomp_singleCR() {
        assertEquals("", StringUtils.chomp("\r"));
    }

    @Test
    public void testChomp_CRLF() {
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
    }

    @Test
    public void testChomp_LF() {
        assertEquals("abc", StringUtils.chomp("abc\n"));
    }

    @Test
    public void testChomp_CR() {
        assertEquals("abc ", StringUtils.chomp("abc \r"));
    }

    @Test
    public void testChomp_multipleNewlines() {
        assertEquals("abc\r\n", StringUtils.chomp("abc\r\n\r\n"));
    }

    @Test
    public void testChomp_newlineMixedWithText() {
        assertEquals("abc\n\rabc", StringUtils.chomp("abc\n\rabc"));
    }

    @Test
    public void testChomp_withSeparator_nullStr() {
        assertNull(StringUtils.chomp(null, "bar"));
    }

    @Test
    public void testChomp_withSeparator_emptyStr() {
        assertEquals("", StringUtils.chomp("", "bar"));
    }

    @Test
    public void testChomp_withSeparator_nullSeparator() {
        assertEquals("foo", StringUtils.chomp("foo", null));
    }

    @Test
    public void testChomp_withSeparator_emptySeparator() {
        assertEquals("foo", StringUtils.chomp("foo", ""));
    }

    @Test
    public void testChomp_withSeparator_match() {
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
    }

    @Test
    public void testChomp_withSeparator_noMatch() {
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
    }

    @Test
    public void testChomp_withSeparator_separatorIsWholeString() {
        assertEquals("", StringUtils.chomp("foo", "foo"));
    }

    @Test
    public void testChomp_withSeparator_separatorNotAtEnd() {
        assertEquals("foo ", StringUtils.chomp("foo ", "foo"));
    }

    @Test
    public void testChomp_withSeparator_separatorLongerThanString() {
        assertEquals("foo", StringUtils.chomp("foo", "foooo"));
    }

    @Test
    public void testChop_nullStr() {
        assertNull(StringUtils.chop(null));
    }

    @Test
    public void testChop_emptyStr() {
        assertEquals("", StringUtils.chop(""));
    }

    @Test
    public void testChop_singleChar() {
        assertEquals("", StringUtils.chop("a"));
    }

    @Test
    public void testChop_singleCR() {
        assertEquals("", StringUtils.chop("\r"));
    }

    @Test
    public void testChop_singleLF() {
        assertEquals("", StringUtils.chop("\n"));
    }

    @Test
    public void testChop_CRLF() {
        assertEquals("", StringUtils.chop("\r\n"));
    }

    @Test
    public void testChop_normal() {
        assertEquals("ab", StringUtils.chop("abc"));
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
    public void testChop_CRLFInMiddle() {
        assertEquals("abc\nab", StringUtils.chop("abc\nabc"));
    }

    @Test
    public void testRepeat_nullStr() {
        assertNull(StringUtils.repeat(null, 2));
    }

    @Test
    public void testRepeat_negativeRepeat() {
        assertEquals("", StringUtils.repeat("abc", -2));
    }

    @Test
    public void testRepeat_zeroRepeat() {
        assertEquals("", StringUtils.repeat("abc", 0));
    }

    @Test
    public void testRepeat_emptyStr() {
        assertEquals("", StringUtils.repeat("", 2));
    }

    @Test
    public void testRepeat_repeatOne() {
        assertEquals("abc", StringUtils.repeat("abc", 1));
    }

    @Test
    public void testRepeat_normal() {
        assertEquals("aaa", StringUtils.repeat("a", 3));
        assertEquals("abab", StringUtils.repeat("ab", 2));
    }

    @Test
    public void testRepeat_withSeparator_nullStr() {
        assertNull(StringUtils.repeat(null, "x", 2));
    }

    @Test
    public void testRepeat_withSeparator_nullSeparator() {
        assertNull(StringUtils.repeat(null, null, 2));
    }

    @Test
    public void testRepeat_withSeparator_nullSeparator_nonNullStr() {
        assertEquals("xx", StringUtils.repeat("x", null, 2));
    }

    @Test
    public void testRepeat_withSeparator_emptySeparator() {
        assertEquals("", StringUtils.repeat("", "", 3));
    }

    @Test
    public void testRepeat_withSeparator_emptyStr() {
        assertEquals("xxx", StringUtils.repeat("", "x", 3));
    }

    @Test
    public void testRepeat_withSeparator_normal() {
        assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }

    @Test
    public void testRepeat_withSeparator_zeroRepeat() {
        assertEquals("", StringUtils.repeat("?", ", ", 0));
    }

    @Test
    public void testRepeat_withSeparator_negativeRepeat() {
        assertEquals("?", StringUtils.repeat("?", ", ", -2));
    }

    @Test
    public void testRepeat_char_zeroRepeat() {
        assertEquals("", StringUtils.repeat('e', 0));
    }

    @Test
    public void testRepeat_char_negativeRepeat() {
        assertEquals("", StringUtils.repeat('e', -2));
    }

    @Test
    public void testRepeat_char_normal() {
        assertEquals("eee", StringUtils.repeat('e', 3));
    }

    @Test
    public void testRightPad_nullStr() {
        assertNull(StringUtils.rightPad(null, 3));
    }

    @Test
    public void testRightPad_sizeTooSmall() {
        assertEquals("bat", StringUtils.rightPad("bat", 3));
        assertEquals("bat", StringUtils.rightPad("bat", 1));
    }

    @Test
    public void testRightPad_sizeNegative() {
        assertEquals("bat", StringUtils.rightPad("bat", -1));
    }

    @Test
    public void testRightPad_emptyStr() {
        assertEquals("   ", StringUtils.rightPad("", 3));
    }

    @Test
    public void testRightPad_normal() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
    }

    @Test
    public void testRightPad_char_nullStr() {
        assertNull(StringUtils.rightPad(null, 3, 'z'));
    }

    @Test
    public void testRightPad_char_sizeTooSmall() {
        assertEquals("bat", StringUtils.rightPad("bat", 3, 'z'));
        assertEquals("bat", StringUtils.rightPad("bat", 1, 'z'));
    }

    @Test
    public void testRightPad_char_sizeNegative() {
        assertEquals("bat", StringUtils.rightPad("bat", -1, 'z'));
    }

    @Test
    public void testRightPad_char_emptyStr() {
        assertEquals("zzz", StringUtils.rightPad("", 3, 'z'));
    }

    @Test
    public void testRightPad_char_normal() {
        assertEquals("batzz", StringUtils.rightPad("bat", 5, 'z'));
    }

    @Test
    public void testRightPad_string_nullStr() {
        assertNull(StringUtils.rightPad(null, 3, "yz"));
    }

    @Test
    public void testRightPad_string_sizeTooSmall() {
        assertEquals("bat", StringUtils.rightPad("bat", 3, "yz"));
        assertEquals("bat", StringUtils.rightPad("bat", 1, "yz"));
    }

    @Test
    public void testRightPad_string_sizeNegative() {
        assertEquals("bat", StringUtils.rightPad("bat", -1, "yz"));
    }

    @Test
    public void testRightPad_string_emptyStr() {
        assertEquals("zzz", StringUtils.rightPad("", 3, "z"));
    }

    @Test
    public void testRightPad_string_normal() {
        assertEquals("batyz", StringUtils.rightPad("bat", 5, "yz"));
    }

    @Test
    public void testRightPad_string_padStrRepeated() {
        assertEquals("batyzyzy", StringUtils.rightPad("bat", 8, "yz"));
    }

    @Test
    public void testRightPad_string_nullPadStr() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, null));
    }

    @Test
    public void testRightPad_string_emptyPadStr() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, ""));
    }

    @Test
    public void testLeftPad_nullStr() {
        assertNull(StringUtils.leftPad(null, 3));
    }

    @Test
    public void testLeftPad_sizeTooSmall() {
        assertEquals("bat", StringUtils.leftPad("bat", 3));
        assertEquals("bat", StringUtils.leftPad("bat", 1));
    }

    @Test
    public void testLeftPad_sizeNegative() {
        assertEquals("bat", StringUtils.leftPad("bat", -1));
    }

    @Test
    public void testLeftPad_emptyStr() {
        assertEquals("   ", StringUtils.leftPad("", 3));
    }

    @Test
    public void testLeftPad_normal() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5));
    }

    @Test
    public void testLeftPad_char_nullStr() {
        assertNull(StringUtils.leftPad(null, 3, 'z'));
    }

    @Test
    public void testLeftPad_char_sizeTooSmall() {
        assertEquals("bat", StringUtils.leftPad("bat", 3, 'z'));
        assertEquals("bat", StringUtils.leftPad("bat", 1, 'z'));
    }

    @Test
    public void testLeftPad_char_sizeNegative() {
        assertEquals("bat", StringUtils.leftPad("bat", -1, 'z'));
    }

    @Test
    public void testLeftPad_char_emptyStr() {
        assertEquals("zzz", StringUtils.leftPad("", 3, 'z'));
    }

    @Test
    public void testLeftPad_char_normal() {
        assertEquals("zzbat", StringUtils.leftPad("bat", 5, 'z'));
    }

    @Test
    public void testLeftPad_string_nullStr() {
        assertNull(StringUtils.leftPad(null, 3, "yz"));
    }

    @Test
    public void testLeftPad_string_sizeTooSmall() {
        assertEquals("bat", StringUtils.leftPad("bat", 3, "yz"));
        assertEquals("bat", StringUtils.leftPad("bat", 1, "yz"));
    }

    @Test
    public void testLeftPad_string_sizeNegative() {
        assertEquals("bat", StringUtils.leftPad("bat", -1, "yz"));
    }

    @Test
    public void testLeftPad_string_emptyStr() {
        assertEquals("zzz", StringUtils.leftPad("", 3, "z"));
    }

    @Test
    public void testLeftPad_string_normal() {
        assertEquals("yzbat", StringUtils.leftPad("bat", 5, "yz"));
    }

    @Test
    public void testLeftPad_string_padStrRepeated() {
        assertEquals("yzyzybat", StringUtils.leftPad("bat", 8, "yz"));
    }

    @Test
    public void testLeftPad_string_nullPadStr() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5, null));
    }

    @Test
    public void testLeftPad_string_emptyPadStr() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5, ""));
    }

    @Test
    public void testLength_null() {
        assertEquals(0, StringUtils.length(null));
    }

    @Test
    public void testLength_empty() {
        assertEquals(0, StringUtils.length(""));
    }

    @Test
    public void testLength_normal() {
        assertEquals(3, StringUtils.length("abc"));
    }

    @Test
    public void testCenter_nullStr() {
        assertNull(StringUtils.center(null, 5));
    }

    @Test
    public void testCenter_negativeSize() {
        assertEquals("ab", StringUtils.center("ab", -1));
    }

    @Test
    public void testCenter_sizeTooSmall() {
        assertEquals("ab", StringUtils.center("ab", 2));
    }

    @Test
    public void testCenter_emptyStr() {
        assertEquals("    ", StringUtils.center("", 4));
    }

    @Test
    public void testCenter_normal() {
        assertEquals(" ab ", StringUtils.center("ab", 4));
    }

    @Test
    public void testCenter_oddPadding() {
        assertEquals(" a  ", StringUtils.center("a", 4));
    }

    @Test
    public void testCenter_char_nullStr() {
        assertNull(StringUtils.center(null, 4, ' '));
    }

    @Test
    public void testCenter_char_negativeSize() {
        assertEquals("ab", StringUtils.center("ab", -1, ' '));
    }

    @Test
    public void testCenter_char_sizeTooSmall() {
        assertEquals("ab", StringUtils.center("ab", 2, ' '));
    }

    @Test
    public void testCenter_char_emptyStr() {
        assertEquals("    ", StringUtils.center("", 4, ' '));
    }

    @Test
    public void testCenter_char_normal() {
        assertEquals(" ab", StringUtils.center("ab", 4, ' '));
    }

    @Test
    public void testCenter_char_oddPadding() {
        assertEquals(" a  ", StringUtils.center("a", 4, ' '));
    }

    @Test
    public void testCenter_char_customPadChar() {
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
    }

    @Test
    public void testCenter_string_nullStr() {
        assertNull(StringUtils.center(null, 4, "yz"));
    }

    @Test
    public void testCenter_string_negativeSize() {
        assertEquals("ab", StringUtils.center("ab", -1, "yz"));
    }

    @Test
    public void testCenter_string_sizeTooSmall() {
        assertEquals("ab", StringUtils.center("ab", 2, "yz"));
    }

    @Test
    public void testCenter_string_emptyStr() {
        assertEquals("    ", StringUtils.center("", 4, " "));
    }

    @Test
    public void testCenter_string_normal() {
        assertEquals(" ab", StringUtils.center("ab", 4, " "));
    }

    @Test
    public void testCenter_string_customPadStr() {
        assertEquals("yayz", StringUtils.center("a", 4, "yz"));
    }

    @Test
    public void testCenter_string_nullPadStr() {
        assertEquals("  abc  ", StringUtils.center("abc", 7, null));
    }

    @Test
    public void testCenter_string_emptyPadStr() {
        assertEquals("  abc  ", StringUtils.center("abc", 7, ""));
    }

    @Test
    public void testUpperCase_nullStr() {
        assertNull(StringUtils.upperCase(null));
    }

    @Test
    public void testUpperCase_emptyStr() {
        assertEquals("", StringUtils.upperCase(""));
    }

    @Test
    public void testUpperCase_normal() {
        assertEquals("ABC", StringUtils.upperCase("aBc"));
    }

    @Test
    public void testUpperCase_withLocale_nullStr() {
        assertNull(StringUtils.upperCase(null, Locale.ENGLISH));
    }

    @Test
    public void testUpperCase_withLocale_normal() {
        assertEquals("ABC", StringUtils.upperCase("aBc", Locale.ENGLISH));
    }

    @Test
    public void testLowerCase_nullStr() {
        assertNull(StringUtils.lowerCase(null));
    }

    @Test
    public void testLowerCase_emptyStr() {
        assertEquals("", StringUtils.lowerCase(""));
    }

    @Test
    public void testLowerCase_normal() {
        assertEquals("abc", StringUtils.lowerCase("aBc"));
    }

    @Test
    public void testLowerCase_withLocale_nullStr() {
        assertNull(StringUtils.lowerCase(null, Locale.ENGLISH));
    }

    @Test
    public void testLowerCase_withLocale_normal() {
        assertEquals("abc", StringUtils.lowerCase("aBc", Locale.ENGLISH));
    }

    @Test
    public void testCapitalize_nullStr() {
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    public void testCapitalize_emptyStr() {
        assertEquals("", StringUtils.capitalize(""));
    }

    @Test
    public void testCapitalize_normal() {
        assertEquals("Cat", StringUtils.capitalize("cat"));
    }

    @Test
    public void testCapitalize_alreadyCapitalized() {
        assertEquals("CAt", StringUtils.capitalize("CAt"));
    }

    @Test
    public void testUncapitalize_nullStr() {
        assertNull(StringUtils.uncapitalize(null));
    }

    @Test
    public void testUncapitalize_emptyStr() {
        assertEquals("", StringUtils.uncapitalize(""));
    }

    @Test
    public void testUncapitalize_normal() {
        assertEquals("cat", StringUtils.uncapitalize("Cat"));
    }

    @Test
    public void testUncapitalize_alreadyUncapitalized() {
        assertEquals("cAT", StringUtils.uncapitalize("cAT"));
    }

    @Test
    public void testSwapCase_nullStr() {
        assertNull(StringUtils.swapCase(null));
    }

    @Test
    public void testSwapCase_emptyStr() {
        assertEquals("", StringUtils.swapCase(""));
    }

    @Test
    public void testSwapCase_normal() {
        assertEquals("tHE DOG HAS A bone", StringUtils.swapCase("The dog has a BONE"));
    }

    @Test
    public void testSwapCase_mixedCase() {
        assertEquals("hELLo wORLd", StringUtils.swapCase("Hello World"));
    }

    @Test
    public void testCountMatches_nullStr() {
        assertEquals(0, StringUtils.countMatches(null, "a"));
    }

    @Test
    public void testCountMatches_emptyStr() {
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
    public void testCountMatches_foundOnce() {
        assertEquals(1, StringUtils.countMatches("abba", "ab"));
    }

    @Test
    public void testCountMatches_foundMultiple() {
        assertEquals(2, StringUtils.countMatches("ababab", "ab"));
    }

    @Test
    public void testCountMatches_notFound() {
        assertEquals(0, StringUtils.countMatches("abba", "xxx"));
    }

    @Test
    public void testIsAlpha_null() {
        assertFalse(StringUtils.isAlpha(null));
    }

    @Test
    public void testIsAlpha_empty() {
        assertFalse(StringUtils.isAlpha(""));
    }

    @Test
    public void testIsAlpha_spaces() {
        assertFalse(StringUtils.isAlpha("  "));
    }

    @Test
    public void testIsAlpha_onlyLetters() {
        assertTrue(StringUtils.isAlpha("abc"));
        assertTrue(StringUtils.isAlpha("Abc"));
        assertTrue(StringUtils.isAlpha("ABC"));
    }

    @Test
    public void testIsAlpha_withDigit() {
        assertFalse(StringUtils.isAlpha("ab2c"));
    }

    @Test
    public void testIsAlpha_withSymbol() {
        assertFalse(StringUtils.isAlpha("ab-c"));
    }

    @Test
    public void testIsAlphaSpace_null() {
        assertFalse(StringUtils.isAlphaSpace(null));
    }

    @Test
    public void testIsAlphaSpace_empty() {
        assertTrue(StringUtils.isAlphaSpace(""));
    }

    @Test
    public void testIsAlphaSpace_spacesOnly() {
        assertTrue(StringUtils.isAlphaSpace("  "));
    }

    @Test
    public void testIsAlphaSpace_onlyLetters() {
        assertTrue(StringUtils.isAlphaSpace("abc"));
        assertTrue(StringUtils.isAlphaSpace("Abc"));
    }

    @Test
    public void testIsAlphaSpace_lettersAndSpace() {
        assertTrue(StringUtils.isAlphaSpace("ab c"));
    }

    @Test
    public void testIsAlphaSpace_withDigit() {
        assertFalse(StringUtils.isAlphaSpace("ab2c"));
    }

    @Test
    public void testIsAlphaSpace_withSymbol() {
        assertFalse(StringUtils.isAlphaSpace("ab-c"));
    }

    @Test
    public void testIsAlphanumeric_null() {
        assertFalse(StringUtils.isAlphanumeric(null));
    }

    @Test
    public void testIsAlphanumeric_empty() {
        assertFalse(StringUtils.isAlphanumeric(""));
    }

    @Test
    public void testIsAlphanumeric_spaces() {
        assertFalse(StringUtils.isAlphanumeric("  "));
    }

    @Test
    public void testIsAlphanumeric_onlyLetters() {
        assertTrue(StringUtils.isAlphanumeric("abc"));
    }

    @Test
    public void testIsAlphanumeric_onlyDigits() {
        assertTrue(StringUtils.isAlphanumeric("123"));
    }

    @Test
    public void testIsAlphanumeric_mixedLettersAndDigits() {
        assertTrue(StringUtils.isAlphanumeric("ab2c"));
    }

    @Test
    public void testIsAlphanumeric_withSpace() {
        assertFalse(StringUtils.isAlphanumeric("ab c"));
    }

    @Test
    public void testIsAlphanumeric_withSymbol() {
        assertFalse(StringUtils.isAlphanumeric("ab-c"));
    }

    @Test
    public void testIsAlphanumericSpace_null() {
        assertFalse(StringUtils.isAlphanumericSpace(null));
    }

    @Test
    public void testIsAlphanumericSpace_empty() {
        assertTrue(StringUtils.isAlphanumericSpace(""));
    }

    @Test
    public void testIsAlphanumericSpace_spacesOnly() {
        assertTrue(StringUtils.isAlphanumericSpace("  "));
    }

    @Test
    public void testIsAlphanumericSpace_onlyLetters() {
        assertTrue(StringUtils.isAlphanumericSpace("abc"));
    }

    @Test
    public void testIsAlphanumericSpace_onlyDigits() {
        assertTrue(StringUtils.isAlphanumericSpace("123"));
    }

    @Test
    public void testIsAlphanumericSpace_mixedLettersDigitsAndSpace() {
        assertTrue(StringUtils.isAlphanumericSpace("ab c 123"));
    }

    @Test
    public void testIsAlphanumericSpace_withSymbol() {
        assertFalse(StringUtils.isAlphanumericSpace("ab-c"));
    }

    @Test
    public void testIsAsciiPrintable_null() {
        assertFalse(StringUtils.isAsciiPrintable(null));
    }

    @Test
    public void testIsAsciiPrintable_empty() {
        assertTrue(StringUtils.isAsciiPrintable(""));
    }

    @Test
    public void testIsAsciiPrintable_space() {
        assertTrue(StringUtils.isAsciiPrintable(" "));
    }

    @Test
    public void testIsAsciiPrintable_lettersAndDigits() {
        assertTrue(StringUtils.isAsciiPrintable("Ceki"));
        assertTrue(StringUtils.isAsciiPrintable("ab2c"));
    }

    @Test
    public void testIsAsciiPrintable_symbols() {
        assertTrue(StringUtils.isAsciiPrintable("!ab-c~"));
    }

    @Test
    public void testIsAsciiPrintable_controlChar() {
        assertFalse(StringUtils.isAsciiPrintable("\u007f"));
    }

    @Test
    public void testIsAsciiPrintable_nonAscii() {
        assertFalse(StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc"));
    }

    @Test
    public void testIsNumeric_null() {
        assertFalse(StringUtils.isNumeric(null));
    }

    @Test
    public void testIsNumeric_empty() {
        assertFalse(StringUtils.isNumeric(""));
    }

    @Test
    public void testIsNumeric_spaces() {
        assertFalse(StringUtils.isNumeric("  "));
    }

    @Test
    public void testIsNumeric_onlyDigits() {
        assertTrue(StringUtils.isNumeric("123"));
    }

    @Test
    public void testIsNumeric_withSpace() {
        assertFalse(StringUtils.isNumeric("12 3"));
    }

    @Test
    public void testIsNumeric_withLetters() {
        assertFalse(StringUtils.isNumeric("ab2c"));
    }

    @Test
    public void testIsNumeric_withSymbol() {
        assertFalse(StringUtils.isNumeric("12-3"));
    }

    @Test
    public void testIsNumeric_withDecimalPoint() {
        assertFalse(StringUtils.isNumeric("12.3"));
    }

    @Test
    public void testIsNumericSpace_null() {
        assertFalse(StringUtils.isNumericSpace(null));
    }

    @Test
    public void testIsNumericSpace_empty() {
        assertTrue(StringUtils.isNumericSpace(""));
    }

    @Test
    public void testIsNumericSpace_spacesOnly() {
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
    public void testIsNumericSpace_withLetters() {
        assertFalse(StringUtils.isNumericSpace("ab2c"));
    }

    @Test
    public void testIsNumericSpace_withSymbol() {
        assertFalse(StringUtils.isNumericSpace("12-3"));
    }

    @Test
    public void testIsNumericSpace_withDecimalPoint() {
        assertFalse(StringUtils.isNumericSpace("12.3"));
    }

    @Test
    public void testIsWhitespace_null() {
        assertFalse(StringUtils.isWhitespace(null));
    }

    @Test
    public void testIsWhitespace_empty() {
        assertTrue(StringUtils.isWhitespace(""));
    }

    @Test
    public void testIsWhitespace_spacesOnly() {
        assertTrue(StringUtils.isWhitespace("  "));
        assertTrue(StringUtils.isWhitespace("\t\n\r\f\u000b"));
    }

    @Test
    public void testIsWhitespace_notWhitespace() {
        assertFalse(StringUtils.isWhitespace("abc"));
        assertFalse(StringUtils.isWhitespace("ab2c"));
        assertFalse(StringUtils.isWhitespace("ab-c"));
    }

    @Test
    public void testIsAllLowerCase_null() {
        assertFalse(StringUtils.isAllLowerCase(null));
    }

    @Test
    public void testIsAllLowerCase_empty() {
        assertFalse(StringUtils.isAllLowerCase(""));
    }

    @Test
    public void testIsAllLowerCase_spaces() {
        assertFalse(StringUtils.isAllLowerCase("  "));
    }

    @Test
    public void testIsAllLowerCase_allLowerCase() {
        assertTrue(StringUtils.isAllLowerCase("abc"));
    }

    @Test
    public void testIsAllLowerCase_mixedCase() {
        assertFalse(StringUtils.isAllLowerCase("abC"));
    }

    @Test
    public void testIsAllUpperCase_null() {
        assertFalse(StringUtils.isAllUpperCase(null));
    }

    @Test
    public void testIsAllUpperCase_empty() {
        assertFalse(StringUtils.isAllUpperCase(""));
    }

    @Test
    public void testIsAllUpperCase_spaces() {
        assertFalse(StringUtils.isAllUpperCase("  "));
    }

    @Test
    public void testIsAllUpperCase_allUpperCase() {
        assertTrue(StringUtils.isAllUpperCase("ABC"));
    }

    @Test
    public void testIsAllUpperCase_mixedCase() {
        assertFalse(StringUtils.isAllUpperCase("aBC"));
    }

    @Test
    public void testDefaultString_null() {
        assertEquals("", StringUtils.defaultString(null));
    }

    @Test
    public void testDefaultString_empty() {
        assertEquals("", StringUtils.defaultString(""));
    }

    @Test
    public void testDefaultString_normal() {
        assertEquals("bat", StringUtils.defaultString("bat"));
    }

    @Test
    public void testDefaultString_withDefault_null() {
        assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
    }

    @Test
    public void testDefaultString_withDefault_empty() {
        assertEquals("", StringUtils.defaultString("", "NULL"));
    }

    @Test
    public void testDefaultString_withDefault_normal() {
        assertEquals("bat", StringUtils.defaultString("bat", "NULL"));
    }

    @Test
    public void testDefaultIfBlank_null() {
        assertEquals("NULL", StringUtils.defaultIfBlank(null, "NULL"));
    }

    @Test
    public void testDefaultIfBlank_empty() {
        assertEquals("NULL", StringUtils.defaultIfBlank("", "NULL"));
    }

    @Test
    public void testDefaultIfBlank_whitespace() {
        assertEquals("NULL", StringUtils.defaultIfBlank(" ", "NULL"));
    }

    @Test
    public void testDefaultIfBlank_normal() {
        assertEquals("bat", StringUtils.defaultIfBlank("bat", "NULL"));
    }

    @Test
    public void testDefaultIfBlank_nullDefault() {
        assertNull(StringUtils.defaultIfBlank("", null));
    }

    @Test
    public void testDefaultIfEmpty_null() {
        assertEquals("NULL", StringUtils.defaultIfEmpty(null, "NULL"));
    }

    @Test
    public void testDefaultIfEmpty_empty() {
        assertEquals("NULL", StringUtils.defaultIfEmpty("", "NULL"));
    }

    @Test
    public void testDefaultIfEmpty_normal() {
        assertEquals("bat", StringUtils.defaultIfEmpty("bat", "NULL"));
    }

    @Test
    public void testDefaultIfEmpty_nullDefault() {
        assertNull(StringUtils.defaultIfEmpty("", null));
    }

    @Test
    public void testReverse_nullStr() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testReverse_emptyStr() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testReverse_normal() {
        assertEquals("tab", StringUtils.reverse("bat"));
    }

    @Test
    public void testReverseDelimited_nullStr() {
        assertNull(StringUtils.reverseDelimited(null, '.'));
    }

    @Test
    public void testReverseDelimited_emptyStr() {
        assertEquals("", StringUtils.reverseDelimited("", '.'));
    }

    @Test
    public void testReverseDelimited_noDelimiter() {
        assertEquals("a.b.c", StringUtils.reverseDelimited("a.b.c", 'x'));
    }

    @Test
    public void testReverseDelimited_normal() {
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    @Test
    public void testAbbreviate_nullStr() {
        assertNull(StringUtils.abbreviate(null, 6));
    }

    @Test
    public void testAbbreviate_emptyStr() {
        assertEquals("", StringUtils.abbreviate("", 4));
    }

    @Test
    public void testAbbreviate_maxWidthTooSmall() {
        try {
            StringUtils.abbreviate("abcdefg", 3);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testAbbreviate_lengthSufficient() {
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 8));
    }

    @Test
    public void testAbbreviate_normal() {
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
    }

    @Test
    public void testAbbreviate_offsetZero() {
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 0, 10));
    }

    @Test
    public void testAbbreviate_offsetPositive() {
        assertEquals("...fghi...", StringUtils.abbreviate("abcdefghijklmno", 5, 10));
        assertEquals("...ghij...", StringUtils.abbreviate("abcdefghijklmno", 6, 10));
    }

    @Test
    public void testAbbreviate_offsetNegative() {
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", -1, 10));
    }

    @Test
    public void testAbbreviate_offsetLarge() {
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 8, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 10, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 12, 10));
    }

    @Test
    public void testAbbreviate_maxWidthTooSmallWithOffset() {
        try {
            StringUtils.abbreviate("abcdefghij", 0, 3);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testAbbreviateMiddle_nullStr() {
        assertNull(StringUtils.abbreviateMiddle(null, ".", 0));
    }

    @Test
    public void testAbbreviateMiddle_nullMiddle() {
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", null, 0));
    }

    @Test
    public void testAbbreviateMiddle_emptyMiddle() {
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", "", 0));
    }

    @Test
    public void testAbbreviateMiddle_lengthTooSmallForMiddle() {
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 0));
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 2));
    }

    @Test
    public void testAbbreviateMiddle_lengthSufficient() {
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 3));
    }

    @Test
    public void testAbbreviateMiddle_normal() {
        assertEquals("ab.f", StringUtils.abbreviateMiddle("abcdef", ".", 4));
    }

    @Test
    public void testAbbreviateMiddle_evenPadding() {
        assertEquals("ab..f", StringUtils.abbreviateMiddle("abcdef", "..", 5));
    }

    @Test
    public void testAbbreviateMiddle_oddPadding() {
        assertEquals("a..f", StringUtils.abbreviateMiddle("abcdef", "..", 4));
    }

    @Test
    public void testDifference_nulls() {
        assertNull(StringUtils.difference(null, null));
    }

    @Test
    public void testDifference_emptyStrings() {
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
    public void testDifference_identical() {
        assertEquals("", StringUtils.difference("abc", "abc"));
    }

    @Test
    public void testDifference_prefixMatch() {
        assertEquals("xyz", StringUtils.difference("ab", "abxyz"));
        assertEquals("xyz", StringUtils.difference("abcde", "abxyz"));
    }

    @Test
    public void testDifference_noPrefixMatch() {
        assertEquals("xyz", StringUtils.difference("abcde", "xyz"));
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
    public void testIndexOfDifference_firstEmpty() {
        assertEquals(0, StringUtils.indexOfDifference("", "abc"));
    }

    @Test
    public void testIndexOfDifference_secondEmpty() {
        assertEquals(0, StringUtils.indexOfDifference("abc", ""));
    }


    @Test
    public void testIndexOfDifference_prefixMatch() {
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));
        assertEquals(2, StringUtils.indexOfDifference("abcde", "abxyz"));
    }

    @Test
    public void testIndexOfDifference_noPrefixMatch() {
        assertEquals(0, StringUtils.indexOfDifference("abcde", "xyz"));
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
    public void testIndexOfDifference_multipleStrings_someNull() {
        assertEquals(0, StringUtils.indexOfDifference("", null));
        assertEquals(0, StringUtils.indexOfDifference(null, ""));
    }


    @Test
    public void testIndexOfDifference_multipleStrings_prefixMatch() {
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));
    }

    @Test
    public void testIndexOfDifference_multipleStrings_noPrefixMatch() {
        assertEquals(0, StringUtils.indexOfDifference("abcde", "xyz"));
        assertEquals(0, StringUtils.indexOfDifference("xyz", "abcde"));
    }

    @Test
    public void testIndexOfDifference_multipleStrings_varyingLengths() {
        assertEquals(3, StringUtils.indexOfDifference("abc", "abcd"));
        assertEquals(3, StringUtils.indexOfDifference("abcd", "abc"));
    }

    @Test
    public void testIndexOfDifference_multipleStrings_mixedContent() {
        assertEquals(7, StringUtils.indexOfDifference("i am a machine", "i am a robot"));
    }

    @Test
    public void testGetCommonPrefix_nullArray() {
        assertEquals("", StringUtils.getCommonPrefix(null));
    }

    @Test
    public void testGetCommonPrefix_emptyArray() {
        assertEquals("", StringUtils.getCommonPrefix(new String[0]));
    }

    @Test
    public void testGetCommonPrefix_singleString() {
        assertEquals("abc", StringUtils.getCommonPrefix("abc"));
    }

    @Test
    public void testGetCommonPrefix_allNull() {
        assertEquals("", StringUtils.getCommonPrefix(null, null));
    }

    @Test
    public void testGetCommonPrefix_someNull() {
        assertEquals("", StringUtils.getCommonPrefix("", null));
        assertEquals("", StringUtils.getCommonPrefix(null, ""));
    }

    @Test
    public void testGetCommonPrefix_allEmpty() {
        assertEquals("", StringUtils.getCommonPrefix("", ""));
    }

    @Test
    public void testGetCommonPrefix_identical() {
        assertEquals("abc", StringUtils.getCommonPrefix("abc", "abc"));
    }

    @Test
    public void testGetCommonPrefix_prefixMatch() {
        assertEquals("ab", StringUtils.getCommonPrefix("ab", "abxyz"));
        assertEquals("ab", StringUtils.getCommonPrefix("abcde", "abxyz"));
    }

    @Test
    public void testGetCommonPrefix_noPrefixMatch() {
        assertEquals("", StringUtils.getCommonPrefix("abcde", "xyz"));
        assertEquals("", StringUtils.getCommonPrefix("xyz", "abcde"));
    }

    @Test
    public void testGetCommonPrefix_mixedContent() {
        assertEquals("i am a ", StringUtils.getCommonPrefix("i am a machine", "i am a robot"));
    }

    @Test
    public void testGetLevenshteinDistance_nulls() {
        try {
            StringUtils.getLevenshteinDistance(null, null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetLevenshteinDistance_oneNull() {
        try {
            StringUtils.getLevenshteinDistance(null, "a");
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException expected) {
        }
        try {
            StringUtils.getLevenshteinDistance("a", null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetLevenshteinDistance_emptyStrings() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
    }

    @Test
    public void testGetLevenshteinDistance_firstEmpty() {
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
    }

    @Test
    public void testGetLevenshteinDistance_secondEmpty() {
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
    }

    @Test
    public void testGetLevenshteinDistance_equalLengthDifferentStrings() {
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
        assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo"));
    }

    @Test
    public void testGetLevenshteinDistance_differentLengthStrings() {
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
    }

    @Test
    public void testGetLevenshteinDistance_completelyDifferent() {
        assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz"));
    }

    @Test
    public void testGetLevenshteinDistance_thresholdExactMatch() {
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo", 7));
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo", 10));
    }

    @Test
    public void testGetLevenshteinDistance_thresholdTooSmall() {
        assertEquals(-1, StringUtils.getLevenshteinDistance("elephant", "hippo", 6));
    }

    @Test
    public void testGetLevenshteinDistance_thresholdZero_emptyStrings() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", "", 0));
    }

    @Test
    public void testGetLevenshteinDistance_thresholdZero_nonEmptyStrings() {
        assertEquals(-1, StringUtils.getLevenshteinDistance("a", "b", 0));
    }

    @Test
    public void testGetLevenshteinDistance_thresholdNegative() {
        try {
            StringUtils.getLevenshteinDistance("a", "b", -1);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testStartsWith_nullStr() {
        assertFalse(StringUtils.startsWith(null, "abc"));
    }

    @Test
    public void testStartsWith_nullPrefix() {
        assertFalse(StringUtils.startsWith("abc", null));
    }

    @Test
    public void testStartsWith_nulls() {
        assertTrue(StringUtils.startsWith(null, null));
    }

    @Test
    public void testStartsWith_emptyPrefix() {
        assertTrue(StringUtils.startsWith("abc", ""));
        assertTrue(StringUtils.startsWith("", ""));
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
    public void testStartsWith_prefixLongerThanString() {
        assertFalse(StringUtils.startsWith("abc", "abcd"));
    }

    @Test
    public void testStartsWith_caseSensitive() {
        assertFalse(StringUtils.startsWith("ABCDEF", "abc"));
    }

    @Test
    public void testStartsWithIgnoreCase_nullStr() {
        assertFalse(StringUtils.startsWithIgnoreCase(null, "abc"));
    }

    @Test
    public void testStartsWithIgnoreCase_nullPrefix() {
        assertFalse(StringUtils.startsWithIgnoreCase("abc", null));
    }

    @Test
    public void testStartsWithIgnoreCase_nulls() {
        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
    }

    @Test
    public void testStartsWithIgnoreCase_emptyPrefix() {
        assertTrue(StringUtils.startsWithIgnoreCase("abc", ""));
        assertTrue(StringUtils.startsWithIgnoreCase("", ""));
    }

    @Test
    public void testStartsWithIgnoreCase_match() {
        assertTrue(StringUtils.startsWithIgnoreCase("abcdef", "abc"));
        assertTrue(StringUtils.startsWithIgnoreCase("ABCDEF", "abc"));
        assertTrue(StringUtils.startsWithIgnoreCase("AbCdEf", "aBc"));
    }

    @Test
    public void testStartsWithIgnoreCase_noMatch() {
        assertFalse(StringUtils.startsWithIgnoreCase("abcdef", "abd"));
    }

    @Test
    public void testStartsWithIgnoreCase_prefixLongerThanString() {
        assertFalse(StringUtils.startsWithIgnoreCase("abc", "abcd"));
    }

    @Test
    public void testStartsWithAny_nullString() {
        assertFalse(StringUtils.startsWithAny(null, "abc"));
    }

    @Test
    public void testStartsWithAny_nullSearchStrings() {
        assertFalse(StringUtils.startsWithAny("abcxyz", null));
    }

    @Test
    public void testStartsWithAny_emptySearchStrings() {
        assertFalse(StringUtils.startsWithAny("abcxyz", new CharSequence[0]));
    }

    @Test
    public void testStartsWithAny_emptyPrefixInSearchStrings() {
        assertFalse(StringUtils.startsWithAny("abcxyz", ""));
    }

    @Test
    public void testStartsWithAny_match() {
        assertTrue(StringUtils.startsWithAny("abcxyz", "abc"));
        assertTrue(StringUtils.startsWithAny("abcxyz", null, "xyz", "abc"));
    }

    @Test
    public void testStartsWithAny_noMatch() {
        assertFalse(StringUtils.startsWithAny("abcxyz", "def"));
        assertFalse(StringUtils.startsWithAny("abcxyz", "abx"));
    }

    @Test
    public void testEndsWith_nullStr() {
        assertFalse(StringUtils.endsWith(null, "def"));
    }

    @Test
    public void testEndsWith_nullSuffix() {
        assertFalse(StringUtils.endsWith("abcdef", null));
    }

    @Test
    public void testEndsWith_nulls() {
        assertTrue(StringUtils.endsWith(null, null));
    }

    @Test
    public void testEndsWith_emptySuffix() {
        assertTrue(StringUtils.endsWith("abcdef", ""));
        assertTrue(StringUtils.endsWith("", ""));
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
    public void testEndsWith_suffixLongerThanString() {
        assertFalse(StringUtils.endsWith("abc", "abcdef"));
    }

    @Test
    public void testEndsWith_caseSensitive() {
        assertFalse(StringUtils.endsWith("ABCDEF", "def"));
        assertFalse(StringUtils.endsWith("ABCDEF", "cde"));
    }

    @Test
    public void testEndsWithIgnoreCase_nullStr() {
        assertFalse(StringUtils.endsWithIgnoreCase(null, "def"));
    }

    @Test
    public void testEndsWithIgnoreCase_nullSuffix() {
        assertFalse(StringUtils.endsWithIgnoreCase("abcdef", null));
    }

    @Test
    public void testEndsWithIgnoreCase_nulls() {
        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
    }

    @Test
    public void testEndsWithIgnoreCase_emptySuffix() {
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", ""));
        assertTrue(StringUtils.endsWithIgnoreCase("", ""));
    }

    @Test
    public void testEndsWithIgnoreCase_match() {
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "def"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "DEF"));
    }

    @Test
    public void testEndsWithIgnoreCase_noMatch() {
        assertFalse(StringUtils.endsWithIgnoreCase("abcdef", "deg"));
    }

    @Test
    public void testEndsWithIgnoreCase_suffixLongerThanString() {
        assertFalse(StringUtils.endsWithIgnoreCase("abc", "abcdef"));
    }

    @Test
    public void testEndsWithAny_nullString() {
        assertFalse(StringUtils.endsWithAny(null, "abc"));
    }

    @Test
    public void testEndsWithAny_nullSearchStrings() {
        assertFalse(StringUtils.endsWithAny("abcxyz", null));
    }

    @Test
    public void testEndsWithAny_emptySearchStrings() {
        assertFalse(StringUtils.endsWithAny("abcxyz", new CharSequence[0]));
    }

    @Test
    public void testEndsWithAny_emptySuffixInSearchStrings() {
        assertTrue(StringUtils.endsWithAny("abcxyz", ""));
    }

    @Test
    public void testEndsWithAny_match() {
        assertTrue(StringUtils.endsWithAny("abcxyz", "xyz"));
        assertTrue(StringUtils.endsWithAny("abcxyz", null, "abc", "xyz"));
    }

    @Test
    public void testEndsWithAny_noMatch() {
        assertFalse(StringUtils.endsWithAny("abcxyz", "def"));
        assertFalse(StringUtils.endsWithAny("abcxyz", "abx"));
    }

    @Test
    public void testNormalizeSpace_nullStr() {
        assertNull(StringUtils.normalizeSpace(null));
    }

    @Test
    public void testNormalizeSpace_emptyStr() {
        assertEquals("", StringUtils.normalizeSpace(""));
    }

    @Test
    public void testNormalizeSpace_noWhitespace() {
        assertEquals("abc", StringUtils.normalizeSpace("abc"));
    }

    @Test
    public void testNormalizeSpace_leadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.normalizeSpace("  abc  "));
    }

    @Test
    public void testNormalizeSpace_internalWhitespace() {
        assertEquals("abc def", StringUtils.normalizeSpace("abc def"));
        assertEquals("abc def", StringUtils.normalizeSpace("abc   def"));
        assertEquals("abc def ghi", StringUtils.normalizeSpace("abc \t def\n ghi"));
    }

    @Test
    public void testNormalizeSpace_onlyWhitespace() {
        assertEquals(" ", StringUtils.normalizeSpace("   "));
    }

    // --- Need to add more test cases for other methods ---

    // Helper method to simulate CharUtils.CR and CharUtils.LF for testing purposes
    private static class CharUtils {
        public static final char CR = '\r';
        public static final char LF = '\n';
    }
}




