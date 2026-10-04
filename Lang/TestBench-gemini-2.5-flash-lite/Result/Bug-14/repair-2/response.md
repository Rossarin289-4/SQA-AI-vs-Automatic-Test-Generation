```java
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
    public void testIsEmptyNull() {
        assertTrue(StringUtils.isEmpty((CharSequence) null));
    }

    @Test
    public void testIsEmptyEmpty() {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void testIsEmptyNotEmpty() {
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("bob"));
    }

    @Test
    public void testIsNotEmptyNull() {
        assertFalse(StringUtils.isNotEmpty((CharSequence) null));
    }

    @Test
    public void testIsNotEmptyEmpty() {
        assertFalse(StringUtils.isNotEmpty(""));
    }

    @Test
    public void testIsNotEmptyNotEmpty() {
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("bob"));
    }

    @Test
    public void testIsBlankNull() {
        assertTrue(StringUtils.isBlank((CharSequence) null));
    }

    @Test
    public void testIsBlankEmpty() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    public void testIsBlankWhitespace() {
        assertTrue(StringUtils.isBlank(" "));
        assertTrue(StringUtils.isBlank("\t"));
        assertTrue(StringUtils.isBlank("\n"));
        assertTrue(StringUtils.isBlank("\r"));
        assertTrue(StringUtils.isBlank(" \t\n\r "));
    }

    @Test
    public void testIsBlankNotBlank() {
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank(" bob "));
    }

    @Test
    public void testIsNotBlankNull() {
        assertFalse(StringUtils.isNotBlank((CharSequence) null));
    }

    @Test
    public void testIsNotBlankEmpty() {
        assertFalse(StringUtils.isNotBlank(""));
    }

    @Test
    public void testIsNotBlankWhitespace() {
        assertFalse(StringUtils.isNotBlank(" "));
        assertFalse(StringUtils.isNotBlank("\t"));
        assertFalse(StringUtils.isNotBlank("\n"));
        assertFalse(StringUtils.isNotBlank("\r"));
        assertFalse(StringUtils.isNotBlank(" \t\n\r "));
    }

    @Test
    public void testIsNotBlankNotBlank() {
        assertTrue(StringUtils.isNotBlank("bob"));
        assertTrue(StringUtils.isNotBlank(" bob "));
    }

    @Test
    public void testTrimNull() {
        assertNull(StringUtils.trim(null));
    }

    @Test
    public void testTrimEmpty() {
        assertEquals("", StringUtils.trim(""));
    }

    @Test
    public void testTrimWhitespace() {
        assertEquals("", StringUtils.trim("   "));
    }

    @Test
    public void testTrimNormal() {
        assertEquals("abc", StringUtils.trim("abc"));
    }

    @Test
    public void testTrimLeadingAndTrailing() {
        assertEquals("abc", StringUtils.trim("    abc    "));
    }

    @Test
    public void testTrimToNullNull() {
        assertNull(StringUtils.trimToNull(null));
    }

    @Test
    public void testTrimToNullEmpty() {
        assertNull(StringUtils.trimToNull(""));
    }

    @Test
    public void testTrimToNullWhitespace() {
        assertNull(StringUtils.trimToNull("     "));
    }

    @Test
    public void testTrimToNullNormal() {
        assertEquals("abc", StringUtils.trimToNull("abc"));
    }

    @Test
    public void testTrimToNullLeadingAndTrailing() {
        assertEquals("abc", StringUtils.trimToNull("    abc    "));
    }

    @Test
    public void testTrimToEmptyNull() {
        assertEquals("", StringUtils.trimToEmpty(null));
    }

    @Test
    public void testTrimToEmptyEmpty() {
        assertEquals("", StringUtils.trimToEmpty(""));
    }

    @Test
    public void testTrimToEmptyWhitespace() {
        assertEquals("", StringUtils.trimToEmpty("     "));
    }

    @Test
    public void testTrimToEmptyNormal() {
        assertEquals("abc", StringUtils.trimToEmpty("abc"));
    }

    @Test
    public void testTrimToEmptyLeadingAndTrailing() {
        assertEquals("abc", StringUtils.trimToEmpty("    abc    "));
    }

    @Test
    public void testStripNull() {
        assertNull(StringUtils.strip(null));
    }

    @Test
    public void testStripEmpty() {
        assertEquals("", StringUtils.strip(""));
    }

    @Test
    public void testStripWhitespace() {
        assertEquals("", StringUtils.strip("   "));
    }

    @Test
    public void testStripNormal() {
        assertEquals("abc", StringUtils.strip("abc"));
    }

    @Test
    public void testStripLeadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.strip("  abc  "));
    }

    @Test
    public void testStripStartAndEndSpecificChars() {
        assertEquals("abc", StringUtils.strip("xyzabcxyz", "xyz"));
    }

    @Test
    public void testStripStartSpecificChars() {
        assertEquals("abcxyz", StringUtils.stripStart("xyzabcxyz", "xyz"));
    }

    @Test
    public void testStripEndSpecificChars() {
        assertEquals("xyzabc", StringUtils.stripEnd("xyzabcxyz", "xyz"));
    }

    @Test
    public void testStripToNullNull() {
        assertNull(StringUtils.stripToNull(null));
    }

    @Test
    public void testStripToNullEmpty() {
        assertNull(StringUtils.stripToNull(""));
    }

    @Test
    public void testStripToNullWhitespace() {
        assertNull(StringUtils.stripToNull("   "));
    }

    @Test
    public void testStripToNullNormal() {
        assertEquals("abc", StringUtils.stripToNull("abc"));
    }

    @Test
    public void testStripToNullLeadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.stripToNull("  abc  "));
    }

    @Test
    public void testStripToNullSpecificChars() {
        assertNull(StringUtils.stripToNull("xyz", "xyz"));
        assertEquals("abc", StringUtils.stripToNull("xyzabcxyz", "xyz"));
    }

    @Test
    public void testStripToEmptyNull() {
        assertEquals("", StringUtils.stripToEmpty(null));
    }

    @Test
    public void testStripToEmptyEmpty() {
        assertEquals("", StringUtils.stripToEmpty(""));
    }

    @Test
    public void testStripToEmptyWhitespace() {
        assertEquals("", StringUtils.stripToEmpty("   "));
    }

    @Test
    public void testStripToEmptyNormal() {
        assertEquals("abc", StringUtils.stripToEmpty("abc"));
    }

    @Test
    public void testStripToEmptyLeadingAndTrailingWhitespace() {
        assertEquals("abc", StringUtils.stripToEmpty("  abc  "));
    }

    @Test
    public void testStripStartNull() {
        assertNull(StringUtils.stripStart(null, null));
    }

    @Test
    public void testStripStartEmpty() {
        assertEquals("", StringUtils.stripStart("", null));
    }

    @Test
    public void testStripStartWhitespace() {
        assertEquals("", StringUtils.stripStart("   ", null));
    }

    @Test
    public void testStripStartNormal() {
        assertEquals("abc", StringUtils.stripStart("abc", null));
    }

    @Test
    public void testStripStartLeadingWhitespace() {
        assertEquals("abc", StringUtils.stripStart("  abc", null));
    }

    @Test
    public void testStripStartTrailingWhitespace() {
        assertEquals("  abc  ", StringUtils.stripStart("  abc  ", "xyz"));
    }

    @Test
    public void testStripStartSpecificChars() {
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xyz"));
    }

    @Test
    public void testStripEndNull() {
        assertNull(StringUtils.stripEnd(null, null));
    }

    @Test
    public void testStripEndEmpty() {
        assertEquals("", StringUtils.stripEnd("", null));
    }

    @Test
    public void testStripEndWhitespace() {
        assertEquals("abc", StringUtils.stripEnd("abc   ", null));
    }

    @Test
    public void testStripEndNormal() {
        assertEquals("abc", StringUtils.stripEnd("abc", null));
    }

    @Test
    public void testStripEndLeadingWhitespace() {
        assertEquals("  abc", StringUtils.stripEnd("  abc", "xyz"));
    }

    @Test
    public void testStripEndTrailingWhitespace() {
        assertEquals(" abc ", StringUtils.stripEnd(" abc ", null));
    }

    @Test
    public void testStripEndSpecificChars() {
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
    }

    @Test
    public void testStripEndDecimal() {
        assertEquals("12", StringUtils.stripEnd("120.00", ".0"));
    }

    @Test
    public void testStripAllNullArray() {
        assertNull(StringUtils.stripAll((String[]) null));
    }

    @Test
    public void testStripAllEmptyArray() {
        assertArrayEquals(new String[0], StringUtils.stripAll());
    }

    @Test
    public void testStripAllNormalArray() {
        assertArrayEquals(new String[]{"abc", "abc"}, StringUtils.stripAll("abc", "  abc"));
    }

    @Test
    public void testStripAllWithNullEntry() {
        assertArrayEquals(new String[]{"abc", null}, StringUtils.stripAll("abc  ", null));
    }

    @Test
    public void testStripAllWithSpecificChars() {
        assertArrayEquals(new String[]{"abc  ", null}, StringUtils.stripAll(new String[]{"abc  ", null}, "yz"));
    }

    @Test
    public void testStripAllWithSpecificCharsAndNull() {
        assertArrayEquals(new String[]{"abc", null}, StringUtils.stripAll(new String[]{"yabcz", null}, "yz"));
    }

    @Test
    public void testStripAccentsNull() {
        assertNull(StringUtils.stripAccents(null));
    }

    @Test
    public void testStripAccentsEmpty() {
        assertEquals("", StringUtils.stripAccents(""));
    }

    @Test
    public void testStripAccentsNoAccents() {
        assertEquals("control", StringUtils.stripAccents("control"));
    }

    @Test
    public void testStripAccentsWithAccents() {
        assertEquals("eclair", StringUtils.stripAccents("éclair"));
        assertEquals("resume", StringUtils.stripAccents("résumé"));
        assertEquals("cafe", StringUtils.stripAccents("café"));
    }

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
    public void testEqualsSame() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEqualsDifferent() {
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

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
    public void testEqualsIgnoreCaseSame() {
        assertTrue(StringUtils.equalsIgnoreCase("abc", "abc"));
    }

    @Test
    public void testEqualsIgnoreCaseDifferentCase() {
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    @Test
    public void testIndexOfCharNull() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf(null, 'a'));
    }

    @Test
    public void testIndexOfEmpty() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("", 'a'));
    }

    @Test
    public void testIndexOfFound() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", 'a'));
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b'));
    }

    @Test
    public void testIndexOfNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("aabaabaa", 'z'));
    }

    @Test
    public void testIndexOfCharStartPosNull() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf(null, 'a', 0));
    }

    @Test
    public void testIndexOfEmptyStartPos() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("", 'a', 0));
    }

    @Test
    public void testIndexOfFoundStartPos() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', 0));
        assertEquals(5, StringUtils.indexOf("aabaabaa", 'b', 3));
    }

    @Test
    public void testIndexOfNotFoundStartPos() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("aabaabaa", 'b', 9));
    }

    @Test
    public void testIndexOfStartPosNegative() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', -1));
    }

    @Test
    public void testIndexOfCharSequenceNullSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf(null, "a"));
    }

    @Test
    public void testIndexOfCharSequenceNullSearchSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("aabaabaa", null));
    }

    @Test
    public void testIndexOfCharSequenceEmptySeq() {
        assertEquals(0, StringUtils.indexOf("", ""));
    }

    @Test
    public void testIndexOfCharSequenceEmptySearchSeq() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", ""));
    }

    @Test
    public void testIndexOfCharSequenceFound() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", "a"));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b"));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
    }

    @Test
    public void testIndexOfCharSequenceNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("aabaabaa", "z"));
    }

    @Test
    public void testIndexOfCharSequenceStartPosNullSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf(null, "a", 0));
    }

    @Test
    public void testIndexOfCharSequenceNullSearchSeqStartPos() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("aabaabaa", null, 0));
    }

    @Test
    public void testIndexOfCharSequenceEmptySeqStartPos() {
        assertEquals(0, StringUtils.indexOf("", "", 0));
    }

    @Test
    public void testIndexOfCharSequenceEmptySearchSeqStartPos() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", "", 2));
        assertEquals(3, StringUtils.indexOf("abc", "", 9));
    }

    @Test
    public void testIndexOfCharSequenceFoundStartPos() {
        assertEquals(0, StringUtils.indexOf("aabaabaa", "a", 0));
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b", 0));
        assertEquals(1, StringUtils.indexOf("aabaabaa", "ab", 0));
        assertEquals(5, StringUtils.indexOf("aabaabaa", "b", 3));
    }

    @Test
    public void testIndexOfCharSequenceNotFoundStartPos() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOf("aabaabaa", "b", 9));
    }

    @Test
    public void testIndexOfCharSequenceStartPosNegative() {
        assertEquals(2, StringUtils.indexOf("aabaabaa", "b", -1));
    }

    @Test
    public void testOrdinalIndexOfNullSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf(null, "a", 1));
    }

    @Test
    public void testOrdinalIndexOfNullSearchSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("aabaabaa", null, 1));
    }

    @Test
    public void testOrdinalIndexOfZeroOrdinal() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("aabaabaa", "a", 0));
    }

    @Test
    public void testOrdinalIndexOfEmptySearchSeq() {
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", 1));
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", 2));
    }

    @Test
    public void testOrdinalIndexOfFound() {
        assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        assertEquals(2, StringUtils.ordinalIndexOf("aabaabaa", "b", 1));
        assertEquals(5, StringUtils.ordinalIndexOf("aabaabaa", "b", 2));
        assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "ab", 1));
        assertEquals(4, StringUtils.ordinalIndexOf("aabaabaa", "ab", 2));
    }

    @Test
    public void testOrdinalIndexOfNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.ordinalIndexOf("aabaabaa", "z", 1));
    }

    @Test
    public void testIndexOfIgnoreCaseNullSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfIgnoreCase(null, "a"));
    }

    @Test
    public void testIndexOfIgnoreCaseNullSearchSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfIgnoreCase("aabaabaa", null));
    }

    @Test
    public void testIndexOfIgnoreCaseEmptySeq() {
        assertEquals(0, StringUtils.indexOfIgnoreCase("", ""));
    }

    @Test
    public void testIndexOfIgnoreCaseEmptySearchSeq() {
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", ""));
    }

    @Test
    public void testIndexOfIgnoreCaseFound() {
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "A"));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B"));
        assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "Ab"));
    }

    @Test
    public void testIndexOfIgnoreCaseNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfIgnoreCase("aabaabaa", "Z"));
    }

    @Test
    public void testIndexOfIgnoreCaseStartPosNullSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfIgnoreCase(null, "a", 0));
    }

    @Test
    public void testIndexOfIgnoreCaseNullSearchSeqStartPos() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfIgnoreCase("aabaabaa", null, 0));
    }

    @Test
    public void testIndexOfIgnoreCaseEmptySeqStartPos() {
        assertEquals(0, StringUtils.indexOfIgnoreCase("", "", 0));
    }

    @Test
    public void testIndexOfIgnoreCaseEmptySearchSeqStartPos() {
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "", 2));
        assertEquals(3, StringUtils.indexOfIgnoreCase("abc", "", 9));
    }

    @Test
    public void testIndexOfIgnoreCaseFoundStartPos() {
        assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "A", 0));
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 0));
        assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "Ab", 0));
        assertEquals(5, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 3));
    }

    @Test
    public void testIndexOfIgnoreCaseNotFoundStartPos() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfIgnoreCase("aabaabaa", "B", 9));
    }

    @Test
    public void testIndexOfIgnoreCaseStartPosNegative() {
        assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B", -1));
    }

    @Test
    public void testLastIndexOfCharNull() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf(null, 'a'));
    }

    @Test
    public void testLastIndexOfEmpty() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf("", 'a'));
    }

    @Test
    public void testLastIndexOfFound() {
        assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a'));
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b'));
    }

    @Test
    public void testLastIndexOfNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf("aabaabaa", 'z'));
    }

    @Test
    public void testLastIndexOfCharStartPosNull() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf(null, 'a', 8));
    }

    @Test
    public void testLastIndexOfEmptyStartPos() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf("", 'a', 8));
    }

    @Test
    public void testLastIndexOfFoundStartPos() {
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 8));
        assertEquals(2, StringUtils.lastIndexOf("aabaabaa", 'b', 4));
    }

    @Test
    public void testLastIndexOfNotFoundStartPos() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf("aabaabaa", 'b', 0));
    }

    @Test
    public void testLastIndexOfStartPosGreater() {
        assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 9));
    }

    @Test
    public void testLastIndexOfStartPosNegative() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOf("aabaabaa", 'b', -1));
    }

    @Test
    public void testLastIndexOfCharStartPosZero() {
        assertEquals(0, StringUtils.lastIndexOf("aabaabaa", 'a', 0));
    }

    @Test
    public void testLastOrdinalIndexOfNullSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastOrdinalIndexOf(null, "a", 1));
    }

    @Test
    public void testLastOrdinalIndexOfNullSearchSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastOrdinalIndexOf("aabaabaa", null, 1));
    }

    @Test
    public void testLastOrdinalIndexOfZeroOrdinal() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 0));
    }

    @Test
    public void testLastOrdinalIndexOfEmptySearchSeq() {
        assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1));
        assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 2));
    }

    @Test
    public void testLastOrdinalIndexOfFound() {
        assertEquals(7, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1));
        assertEquals(6, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2));
        assertEquals(5, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 1));
        assertEquals(2, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 2));
        assertEquals(4, StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 1));
        assertEquals(1, StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 2));
    }

    @Test
    public void testLastOrdinalIndexOfNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastOrdinalIndexOf("aabaabaa", "z", 1));
    }

    @Test
    public void testLastIndexOfIgnoreCaseNullSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfIgnoreCase(null, "a"));
    }

    @Test
    public void testLastIndexOfIgnoreCaseNullSearchSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfIgnoreCase("aabaabaa", null));
    }

    @Test
    public void testLastIndexOfIgnoreCaseEmptySearchSeq() {
        assertEquals(8, StringUtils.lastIndexOfIgnoreCase("aabaabaa", ""));
    }

    @Test
    public void testLastIndexOfIgnoreCaseFound() {
        assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A"));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B"));
        assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "Ab"));
    }

    @Test
    public void testLastIndexOfIgnoreCaseNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "Z"));
    }

    @Test
    public void testLastIndexOfIgnoreCaseStartPosNullSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfIgnoreCase(null, "a", 8));
    }

    @Test
    public void testLastIndexOfIgnoreCaseNullSearchSeqStartPos() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfIgnoreCase("aabaabaa", null, 8));
    }

    @Test
    public void testLastIndexOfIgnoreCaseEmptySearchSeqStartPos() {
        assertEquals(8, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "", 8));
    }

    @Test
    public void testLastIndexOfIgnoreCaseFoundStartPos() {
        assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 8));
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 8));
        assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "Ab", 8));
    }

    @Test
    public void testLastIndexOfIgnoreCaseNotFoundStartPos() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 0));
    }

    @Test
    public void testLastIndexOfIgnoreCaseStartPosGreater() {
        assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 9));
    }

    @Test
    public void testLastIndexOfIgnoreCaseStartPosNegative() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1));
    }

    @Test
    public void testLastIndexOfIgnoreCaseStartPosZero() {
        assertEquals(0, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 0));
    }

    @Test
    public void testContainsCharNull() {
        assertFalse(StringUtils.contains(null, 'a'));
    }

    @Test
    public void testContainsEmpty() {
        assertFalse(StringUtils.contains("", 'a'));
    }

    @Test
    public void testContainsFound() {
        assertTrue(StringUtils.contains("abc", 'a'));
    }

    @Test
    public void testContainsNotFound() {
        assertFalse(StringUtils.contains("abc", 'z'));
    }

    @Test
    public void testContainsCharSequenceNullSeq() {
        assertFalse(StringUtils.contains(null, "a"));
    }

    @Test
    public void testContainsCharSequenceNullSearchSeq() {
        assertFalse(StringUtils.contains("abc", null));
    }

    @Test
    public void testContainsCharSequenceEmptySeq() {
        assertTrue(StringUtils.contains("", ""));
    }

    @Test
    public void testContainsCharSequenceEmptySearchSeq() {
        assertTrue(StringUtils.contains("abc", ""));
    }

    @Test
    public void testContainsCharSequenceFound() {
        assertTrue(StringUtils.contains("abc", "a"));
    }

    @Test
    public void testContainsCharSequenceNotFound() {
        assertFalse(StringUtils.contains("abc", "z"));
    }

    @Test
    public void testContainsIgnoreCaseNullSeq() {
        assertFalse(StringUtils.containsIgnoreCase(null, "a"));
    }

    @Test
    public void testContainsIgnoreCaseNullSearchSeq() {
        assertFalse(StringUtils.containsIgnoreCase("abc", null));
    }

    @Test
    public void testContainsIgnoreCaseEmptySeq() {
        assertTrue(StringUtils.containsIgnoreCase("", ""));
    }

    @Test
    public void testContainsIgnoreCaseEmptySearchSeq() {
        assertTrue(StringUtils.containsIgnoreCase("abc", ""));
    }

    @Test
    public void testContainsIgnoreCaseFound() {
        assertTrue(StringUtils.containsIgnoreCase("abc", "a"));
        assertTrue(StringUtils.containsIgnoreCase("abc", "A"));
    }

    @Test
    public void testContainsIgnoreCaseNotFound() {
        assertFalse(StringUtils.containsIgnoreCase("abc", "z"));
        assertFalse(StringUtils.containsIgnoreCase("abc", "Z"));
    }

    @Test
    public void testContainsWhitespaceNull() {
        assertFalse(StringUtils.containsWhitespace(null));
    }

    @Test
    public void testContainsWhitespaceEmpty() {
        assertFalse(StringUtils.containsWhitespace(""));
    }

    @Test
    public void testContainsWhitespaceTrue() {
        assertTrue(StringUtils.containsWhitespace(" "));
        assertTrue(StringUtils.containsWhitespace("\t"));
        assertTrue(StringUtils.containsWhitespace("a b"));
    }

    @Test
    public void testContainsWhitespaceFalse() {
        assertFalse(StringUtils.containsWhitespace("abc"));
    }

    @Test
    public void testIndexOfAnyNullSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny(null, 'a', 'b'));
    }

    @Test
    public void testIndexOfAnyEmptySeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("", 'a', 'b'));
    }

    @Test
    public void testIndexOfAnyNullSearchChars() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("abc", (char[]) null));
    }

    @Test
    public void testIndexOfAnyEmptySearchChars() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("abc", new char[0]));
    }

    @Test
    public void testIndexOfAnyFound() {
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", 'z', 'a'));
        assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", 'b', 'y'));
    }

    @Test
    public void testIndexOfAnyNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("aba", 'z'));
    }

    @Test
    public void testContainsAnyNullSeq() {
        assertFalse(StringUtils.containsAny(null, 'a', 'b'));
    }

    @Test
    public void testContainsAnyEmptySeq() {
        assertFalse(StringUtils.containsAny("", 'a', 'b'));
    }

    @Test
    public void testContainsAnyNullSearchChars() {
        assertFalse(StringUtils.containsAny("abc", (char[]) null));
    }

    @Test
    public void testContainsAnyEmptySearchChars() {
        assertFalse(StringUtils.containsAny("abc", new char[0]));
    }

    @Test
    public void testContainsAnyFound() {
        assertTrue(StringUtils.containsAny("zzabyycdxx", 'z', 'a'));
        assertTrue(StringUtils.containsAny("zzabyycdxx", 'b', 'y'));
    }

    @Test
    public void testContainsAnyNotFound() {
        assertFalse(StringUtils.containsAny("aba", 'z'));
    }

    @Test
    public void testIndexOfAnyButNullSeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAnyBut(null, 'z', 'a'));
    }

    @Test
    public void testIndexOfAnyButEmptySeq() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAnyBut("", 'z', 'a'));
    }

    @Test
    public void testIndexOfAnyButNullSearchChars() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAnyBut("abc", (char[]) null));
    }

    @Test
    public void testIndexOfAnyButEmptySearchChars() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAnyBut("abc", new char[0]));
    }

    @Test
    public void testIndexOfAnyButFound() {
        assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", 'z', 'a'));
        assertEquals(0, StringUtils.indexOfAnyBut("aba", 'z'));
    }

    @Test
    public void testIndexOfAnyButNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAnyBut("aba", 'a', 'b'));
    }

    @Test
    public void testContainsOnlyNullSeq() {
        assertFalse(StringUtils.containsOnly(null, 'a', 'b'));
    }

    @Test
    public void testContainsOnlyNullValid() {
        assertFalse(StringUtils.containsOnly("abc", (char[]) null));
    }

    @Test
    public void testContainsOnlyEmptySeq() {
        assertTrue(StringUtils.containsOnly("", 'a', 'b'));
    }

    @Test
    public void testContainsOnlyEmptyValid() {
        assertFalse(StringUtils.containsOnly("ab", new char[0]));
    }

    @Test
    public void testContainsOnlyValid() {
        assertTrue(StringUtils.containsOnly("abab", 'a', 'b', 'c'));
    }

    @Test
    public void testContainsOnlyInvalid() {
        assertFalse(StringUtils.containsOnly("ab1", 'a', 'b', 'c'));
        assertFalse(StringUtils.containsOnly("abz", 'a', 'b', 'c'));
    }

    @Test
    public void testContainsOnlyCharSequenceNullSeq() {
        assertFalse(StringUtils.containsOnly(null, "abc"));
    }

    @Test
    public void testContainsOnlyCharSequenceNullValid() {
        assertFalse(StringUtils.containsOnly("abc", null));
    }

    @Test
    public void testContainsOnlyCharSequenceEmptySeq() {
        assertTrue(StringUtils.containsOnly("", "abc"));
    }

    @Test
    public void testContainsOnlyCharSequenceEmptyValid() {
        assertFalse(StringUtils.containsOnly("ab", ""));
    }

    @Test
    public void testContainsOnlyCharSequenceValid() {
        assertTrue(StringUtils.containsOnly("abab", "abc"));
    }

    @Test
    public void testContainsOnlyCharSequenceInvalid() {
        assertFalse(StringUtils.containsOnly("ab1", "abc"));
        assertFalse(StringUtils.containsOnly("abz", "abc"));
    }

    @Test
    public void testContainsNoneNullSeq() {
        assertTrue(StringUtils.containsNone(null, 'x', 'y', 'z'));
    }

    @Test
    public void testContainsNoneNullSearchChars() {
        assertTrue(StringUtils.containsNone("abc", (char[]) null));
    }

    @Test
    public void testContainsNoneEmptySeq() {
        assertTrue(StringUtils.containsNone("", 'x', 'y', 'z'));
    }

    @Test
    public void testContainsNoneEmptySearchChars() {
        assertTrue(StringUtils.containsNone("ab", new char[0]));
    }

    @Test
    public void testContainsNoneTrue() {
        assertTrue(StringUtils.containsNone("abab", 'x', 'y', 'z'));
        assertTrue(StringUtils.containsNone("ab1", 'x', 'y', 'z'));
    }

    @Test
    public void testContainsNoneFalse() {
        assertFalse(StringUtils.containsNone("abz", 'x', 'y', 'z'));
    }

    @Test
    public void testContainsNoneCharSequenceNullSeq() {
        assertTrue(StringUtils.containsNone(null, "xyz"));
    }

    @Test
    public void testContainsNoneCharSequenceNullInvalid() {
        assertTrue(StringUtils.containsNone("abc", null));
    }

    @Test
    public void testContainsNoneCharSequenceEmptySeq() {
        assertTrue(StringUtils.containsNone("", "xyz"));
    }

    @Test
    public void testContainsNoneCharSequenceEmptyInvalid() {
        assertTrue(StringUtils.containsNone("ab", ""));
    }

    @Test
    public void testContainsNoneCharSequenceTrue() {
        assertTrue(StringUtils.containsNone("abab", "xyz"));
        assertTrue(StringUtils.containsNone("ab1", "xyz"));
    }

    @Test
    public void testContainsNoneCharSequenceFalse() {
        assertFalse(StringUtils.containsNone("abz", "xyz"));
    }

    @Test
    public void testIndexOfAnyNullStr() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny(null, (CharSequence[]) null));
    }

    @Test
    public void testIndexOfAnyNullSearchStrs() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("abc", (CharSequence[]) null));
    }

    @Test
    public void testIndexOfAnyEmptySearchStrs() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("abc", new CharSequence[0]));
    }

    @Test
    public void testIndexOfAnyFoundFirst() {
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", "ab", "cd"));
    }

    @Test
    public void testIndexOfAnyFoundSecond() {
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", "cd", "ab"));
    }

    @Test
    public void testIndexOfAnyNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("zzabyycdxx", "mn", "op"));
    }

    @Test
    public void testIndexOfAnyFoundWithLongerPrefix() {
        assertEquals(1, StringUtils.indexOfAny("zzabyycdxx", "zab", "aby"));
    }

    @Test
    public void testIndexOfAnyEmptyStringFound() {
        assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", ""));
    }

    @Test
    public void testIndexOfAnyEmptyStringSeqEmpty() {
        assertEquals(0, StringUtils.indexOfAny("", ""));
    }

    @Test
    public void testIndexOfAnyStringEmptySeqNonEmptySearch() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfAny("", "a"));
    }

    @Test
    public void testIndexOfAnyWithNullInSearchArray() {
        assertEquals(2, StringUtils.indexOfAny("zzabyycdxx", "ab", null, "cd"));
    }

    @Test
    public void testLastIndexOfAnyNullStr() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfAny(null, (CharSequence[]) null));
    }

    @Test
    public void testLastIndexOfAnyNullSearchStrs() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfAny("abc", (CharSequence[]) null));
    }

    @Test
    public void testLastIndexOfAnyEmptySearchStrs() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfAny("abc", new CharSequence[0]));
    }

    @Test
    public void testLastIndexOfAnyFoundFirst() {
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", "ab", "cd"));
    }

    @Test
    public void testLastIndexOfAnyFoundSecond() {
        assertEquals(6, StringUtils.lastIndexOfAny("zzabyycdxx", "cd", "ab"));
    }

    @Test
    public void testLastIndexOfAnyNotFound() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.lastIndexOfAny("zzabyycdxx", "mn", "op"));
    }

    @Test
    public void testLastIndexOfAnyEmptyStringFound() {
        assertEquals(10, StringUtils.lastIndexOfAny("zzabyycdxx", "mn", ""));
    }

    @Test
    public void testSubstringNull() {
        assertNull(StringUtils.substring(null, 1));
    }

    @Test
    public void testSubstringEmpty() {
        assertEquals("", StringUtils.substring("", 1));
    }

    @Test
    public void testSubstringStartZero() {
        assertEquals("abc", StringUtils.substring("abc", 0));
    }

    @Test
    public void testSubstringStartPositive() {
        assertEquals("c", StringUtils.substring("abc", 2));
    }

    @Test
    public void testSubstringStartOutOfBounds() {
        assertEquals("", StringUtils.substring("abc", 4));
    }

    @Test
    public void testSubstringStartNegative() {
        assertEquals("bc", StringUtils.substring("abc", -2));
    }

    @Test
    public void testSubstringStartNegativeOutOfBounds() {
        assertEquals("abc", StringUtils.substring("abc", -4));
    }

    @Test
    public void testSubstringStartAndEndNull() {
        assertNull(StringUtils.substring(null, 1, 2));
    }

    @Test
    public void testSubstringStartAndEndEmpty() {
        assertEquals("", StringUtils.substring("", 0, 0));
    }

    @Test
    public void testSubstringStartAndEndNormal() {
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
    }

    @Test
    public void testSubstringStartAndEndStartGreaterThanEnd() {
        assertEquals("", StringUtils.substring("abc", 2, 0));
    }

    @Test
    public void testSubstringStartAndEndEndOutOfBounds() {
        assertEquals("c", StringUtils.substring("abc", 2, 4));
    }

    @Test
    public void testSubstringStartAndEndStartOutOfBounds() {
        assertEquals("", StringUtils.substring("abc", 4, 6));
    }

    @Test
    public void testSubstringStartAndEndSameStartAndEnd() {
        assertEquals("", StringUtils.substring("abc", 2, 2));
    }

    @Test
    public void testSubstringStartAndEndNegative() {
        assertEquals("b", StringUtils.substring("abc", -2, -1));
    }

    @Test
    public void testSubstringStartAndEndMixedSign() {
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }

    @Test
    public void testLeftNull() {
        assertNull(StringUtils.left(null, 5));
    }

    @Test
    public void testLeftNegativeLength() {
        assertEquals("", StringUtils.left("abc", -1));
    }

    @Test
    public void testLeftEmpty() {
        assertEquals("", StringUtils.left("", 3));
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
    public void testLeftInsufficientLength() {
        assertEquals("abc", StringUtils.left("abc", 4));
    }

    @Test
    public void testRightNull() {
        assertNull(StringUtils.right(null, 5));
    }

    @Test
    public void testRightNegativeLength() {
        assertEquals("", StringUtils.right("abc", -1));
    }

    @Test
    public void testRightEmpty() {
        assertEquals("", StringUtils.right("", 3));
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
    public void testRightInsufficientLength() {
        assertEquals("abc", StringUtils.right("abc", 4));
    }

    @Test
    public void testMidNull() {
        assertNull(StringUtils.mid(null, 1, 2));
    }

    @Test
    public void testMidNegativeLength() {
        assertEquals("", StringUtils.mid("abc", 1, -1));
    }

    @Test
    public void testMidPosOutOfBounds() {
        assertEquals("", StringUtils.mid("abc", 4, 2));
    }

    @Test
    public void testMidEmpty() {
        assertEquals("", StringUtils.mid("", 0, 0));
    }

    @Test
    public void testMidNormal() {
        assertEquals("ab", StringUtils.mid("abc", 0, 2));
    }

    @Test
    public void testMidNormalEnd() {
        assertEquals("c", StringUtils.mid("abc", 2, 4));
    }

    @Test
    public void testMidNegativePos() {
        assertEquals("ab", StringUtils.mid("abc", -2, 2));
    }

    @Test
    public void testSubstringBeforeNullStr() {
        assertNull(StringUtils.substringBefore(null, "a"));
    }

    @Test
    public void testSubstringBeforeEmptyStr() {
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
    public void testSubstringBeforeSeparatorNotFound() {
        assertEquals("abc", StringUtils.substringBefore("abc", "d"));
    }

    @Test
    public void testSubstringBeforeSeparatorAtStart() {
        assertEquals("", StringUtils.substringBefore("abc", "a"));
    }

    @Test
    public void testSubstringBeforeSeparatorInMiddle() {
        assertEquals("a", StringUtils.substringBefore("abcba", "b"));
    }

    @Test
    public void testSubstringBeforeSeparatorAtEnd() {
        assertEquals("ab", StringUtils.substringBefore("abc", "c"));
    }

    @Test
    public void testSubstringAfterNullStr() {
        assertNull(StringUtils.substringAfter(null, "a"));
    }

    @Test
    public void testSubstringAfterEmptyStr() {
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
    public void testSubstringAfterSeparatorNotFound() {
        assertEquals("", StringUtils.substringAfter("abc", "d"));
    }

    @Test
    public void testSubstringAfterSeparatorAtStart() {
        assertEquals("bc", StringUtils.substringAfter("abc", "a"));
    }

    @Test
    public void testSubstringAfterSeparatorInMiddle() {
        assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
    }

    @Test
    public void testSubstringAfterSeparatorAtEnd() {
        assertEquals("", StringUtils.substringAfter("abc", "c"));
    }

    @Test
    public void testSubstringBeforeLastNullStr() {
        assertNull(StringUtils.substringBeforeLast(null, "a"));
    }

    @Test
    public void testSubstringBeforeLastEmptyStr() {
        assertEquals("", StringUtils.substringBeforeLast("", "a"));
    }

    @Test
    public void testSubstringBeforeLastNullSeparator() {
        assertEquals("a", StringUtils.substringBeforeLast("a", null));
    }

    @Test
    public void testSubstringBeforeLastEmptySeparator() {
        assertEquals("a", StringUtils.substringBeforeLast("a", ""));
    }

    @Test
    public void testSubstringBeforeLastSeparatorNotFound() {
        assertEquals("a", StringUtils.substringBeforeLast("a", "z"));
    }

    @Test
    public void testSubstringBeforeLastSeparatorAtStart() {
        assertEquals("", StringUtils.substringBeforeLast("a", "a"));
    }

    @Test
    public void testSubstringBeforeLastSeparatorInMiddle() {
        assertEquals("abc", StringUtils.substringBeforeLast("abcba", "b"));
    }

    @Test
    public void testSubstringBeforeLastSeparatorAtEnd() {
        assertEquals("ab", StringUtils.substringBeforeLast("abc", "c"));
    }

    @Test
    public void testSubstringAfterLastNullStr() {
        assertNull(StringUtils.substringAfterLast(null, "a"));
    }

    @Test
    public void testSubstringAfterLastEmptyStr() {
        assertEquals("", StringUtils.substringAfterLast("", "a"));
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
    public void testSubstringAfterLastSeparatorNotFound() {
        assertEquals("", StringUtils.substringAfterLast("a", "z"));
    }

    @Test
    public void testSubstringAfterLastSeparatorAtStart() {
        assertEquals("bc", StringUtils.substringAfterLast("abc", "a"));
    }

    @Test
    public void testSubstringAfterLastSeparatorInMiddle() {
        assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
    }

    @Test
    public void testSubstringAfterLastSeparatorAtEnd() {
        assertEquals("", StringUtils.substringAfterLast("abc", "c"));
    }

    @Test
    public void testSubstringBetweenNullStr() {
        assertNull(StringUtils.substringBetween(null, "tag"));
    }

    @Test
    public void testSubstringBetweenNullTag() {
        assertNull(StringUtils.substringBetween("tagabctag", null));
    }

    @Test
    public void testSubstringBetweenEmptyStrAndTag() {
        assertEquals("", StringUtils.substringBetween("", ""));
    }

    @Test
    public void testSubstringBetweenEmptyStr() {
        assertEquals(null, StringUtils.substringBetween("", "tag"));
    }

    @Test
    public void testSubstringBetweenEmptyTag() {
        assertEquals("", StringUtils.substringBetween("tagabctag", ""));
    }

    @Test
    public void testSubstringBetweenTagFound() {
        assertEquals("abc", StringUtils.substringBetween("tagabctag", "tag"));
    }

    @Test
    public void testSubstringBetweenTagNotFound() {
        assertEquals(null, StringUtils.substringBetween("abc", "tag"));
    }

    @Test
    public void testSubstringBetweenOpenCloseNull() {
        assertNull(StringUtils.substringBetween(null, "open", "close"));
    }

    @Test
    public void testSubstringBetweenOpenNull() {
        assertNull(StringUtils.substringBetween("str", null, "close"));
    }

    @Test
    public void testSubstringBetweenCloseNull() {
        assertNull(StringUtils.substringBetween("str", "open", null));
    }

    @Test
    public void testSubstringBetweenEmptyStrEmptyOpenAndClose() {
        assertEquals("", StringUtils.substringBetween("", "", ""));
    }

    @Test
    public void testSubstringBetweenEmptyStrNonEmptyClose() {
        assertEquals(null, StringUtils.substringBetween("", "", "]"));
    }

    @Test
    public void testSubstringBetweenEmptyStrNonEmptyOpen() {
        assertEquals(null, StringUtils.substringBetween("", "[", "]"));
    }

    @Test
    public void testSubstringBetweenEmptyOpenAndClose() {
        assertEquals("", StringUtils.substringBetween("yabcz", "", ""));
    }

    @Test
    public void testSubstringBetweenOpenAndCloseFound() {
        assertEquals("abc", StringUtils.substringBetween("yabcz", "y", "z"));
    }

    @Test
    public void testSubstringBetweenOpenAndCloseMultipleOccurrences() {
        assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));
    }

    @Test
    public void testSubstringBetweenOpenNotFound() {
        assertEquals(null, StringUtils.substringBetween("abc", "x", "z"));
    }

    @Test
    public void testSubstringBetweenCloseNotFound() {
        assertEquals(null, StringUtils.substringBetween("abc", "a", "z"));
    }

    @Test
    public void testSubstringsBetweenNullStr() {
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
    public void testSubstringsBetweenEmptyStr() {
        assertArrayEquals(new String[0], StringUtils.substringsBetween("", "[", "]"));
    }

    @Test
    public void testSubstringsBetweenNoMatches() {
        assertNull(StringUtils.substringsBetween("abc", "[", "]"));
    }

    @Test
    public void testSubstringsBetweenMultipleMatches() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.substringsBetween("[a][b][c]", "[", "]"));
    }

    @Test
    public void testSubstringsBetweenAdjacentMatches() {
        assertArrayEquals(new String[]{"a", "", "c"}, StringUtils.substringsBetween("[a][] [c]", "[", "]"));
    }

    @Test
    public void testSplitNull() {
        assertNull(StringUtils.split(null));
    }

    @Test
    public void testSplitEmpty() {
        assertArrayEquals(new String[0], StringUtils.split(""));
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
    public void testSplitByWholeSeparatorNullStr() {
        assertNull(StringUtils.splitByWholeSeparator(null, "a"));
    }

    @Test
    public void testSplitByWholeSeparatorEmptyStr() {
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparator("", "a"));
    }

    @Test
    public void testSplitByWholeSeparatorNullSeparator() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparator("ab de fg", null));
    }

    @Test
    public void testSplitByWholeSeparatorEmptySeparator() {
        assertNull(StringUtils.splitByWholeSeparator("ab de fg", ""));
    }

    @Test
    public void testSplitByWholeSeparatorNormal() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorMultipleChars() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-"));
    }

    @Test
    public void testSplitByWholeSeparatorMaxZero() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 0));
    }

    @Test
    public void testSplitByWholeSeparatorMaxOne() {
        assertArrayEquals(new String[]{"ab:cd:ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 1));
    }

    @Test
    public void testSplitByWholeSeparatorMaxTwo() {
        assertArrayEquals(new String[]{"ab", "cd:ef"}, StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 2));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveNullStr() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens(null, "a"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveEmptyStr() {
        assertArrayEquals(new String[0], StringUtils.splitByWholeSeparatorPreserveAllTokens("", "a"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveNullSeparator() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveEmptySeparator() {
        assertNull(StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", ""));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveMultipleWhitespace() {
        assertArrayEquals(new String[]{"ab", "", "", "de", "fg"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveNormal() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveAdjacent() {
        assertArrayEquals(new String[]{"ab", "", "cd", "", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens("ab::cd::ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveStartSeparator() {
        assertArrayEquals(new String[]{"", "cd", "ef"}, StringUtils.splitByWholeSeparatorPreserveAllTokens(":cd:ef", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveEndSeparator() {
        assertArrayEquals(new String[]{"cd", "ef", ""}, StringUtils.splitByWholeSeparatorPreserveAllTokens("cd:ef:", ":"));
    }

    @Test
    public void testSplitByWholeSeparatorPreserveStartAndEndSeparator() {
        assertArrayEquals(new String[]{"", "cd", "ef", ""}, StringUtils.splitByWholeSeparatorPreserveAllTokens(":cd:ef:", ":"));
    }

    @Test
    public void testSplitPreserveAllTokensNull() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
    }

    @Test
    public void testSplitPreserveAllTokensEmpty() {
        assertArrayEquals(new String[0], StringUtils.splitPreserveAllTokens(""));
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
    public void testSplitPreserveAllTokensLeadingTrailingWhitespace() {
        assertArrayEquals(new String[]{"", "abc", ""}, StringUtils.splitPreserveAllTokens(" abc "));
    }

    @Test
    public void testSplitPreserveAllTokensCharSeparatorNull() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.splitPreserveAllTokens("a.b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokensCharSeparatorDouble() {
        assertArrayEquals(new String[]{"a", "", "b", "c"}, StringUtils.splitPreserveAllTokens("a..b.c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokensCharSeparatorNotFound() {
        assertArrayEquals(new String[]{"a:b:c"}, StringUtils.splitPreserveAllTokens("a:b:c", '.'));
    }

    @Test
    public void testSplitPreserveAllTokensCharSeparatorWithSpace() {
        assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.splitPreserveAllTokens("a b c", ' '));
    }

    @Test
    public void testSplitPreserveAllTokensCharSeparatorWithSpaceTrailing() {
        assertArrayEquals(new String[]{"a", "b", "c", ""}, StringUtils.splitPreserveAllTokens("a b c ", ' '));
    }

    @Test
    public void testSplitPreserveAllTokensCharSeparatorWithSpaceTrailingDouble() {
        assertArrayEquals(new String[]{"a", "b", "c", "", ""}, StringUtils.splitPreserveAllTokens("a b c  ", ' '));
    }

    @Test
    public void testSplitPreserveAllTokensCharSeparatorWithSpaceLeading() {
        assertArrayEquals(new String[]{"", "a", "b", "c"}, StringUtils.splitPreserveAllTokens(" a b c", ' '));
    }

    @Test
    public void testSplitPreserveAllTokensCharSeparatorWithSpaceLeadingDouble() {
        assertArrayEquals(new String[]{"", "", "a", "b", "c"}, StringUtils.splitPreserveAllTokens("  a b c", ' '));
    }

    @Test
    public void testSplitPreserveAllTokensCharSeparatorWithSpaceLeadingAndTrailing() {
        assertArrayEquals(new String[]{"", "a", "b", "c", ""}, StringUtils.splitPreserveAllTokens(" a b c ", ' '));
    }

    @Test
    public void testSplitPreserveAllTokensMaxNullSeparator() {
        assertArrayEquals(new String[]{"ab", "de", "fg"}, StringUtils.splitPreserveAllTokens(null, null, 0));
    }

    @Test
    public void testSplitPreserveAllTokensMaxCharSeparator() {
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringUtils.splitPreserveAllTokens("ab:cd:ef", ':', 0));
    }

    @Test
    public void testSplitPreserveAllTokensMaxWithLimit() {
        assertArrayEquals(new String[]{"ab", "", "cd:ef"}, StringUtils.splitPreserveAllTokens("ab::cd:ef", ':', 3));
    }

    @Test
    public void testSplitByCharacterTypeNull() {
        assertNull(StringUtils.splitByCharacterType(null));
    }

    @Test
    public void testSplitByCharacterTypeEmpty() {
        assertArrayEquals(new String[0], StringUtils.splitByCharacterType(""));
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
    public void testSplitByCharacterTypeColon() {
        assertArrayEquals(new String[]{"ab", ":", "cd", ":", "ef"}, StringUtils.splitByCharacterType("ab:cd:ef"));
    }

    @Test
    public void testSplitByCharacterTypeNumber() {
        assertArrayEquals(new String[]{"number", "5"}, StringUtils.splitByCharacterType("number5"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseStartLower() {
        assertArrayEquals(new String[]{"foo", "B", "ar"}, StringUtils.splitByCharacterType("fooBar"));
    }

    @Test
    public void testSplitByCharacterTypeNumberAndLetters() {
        assertArrayEquals(new String[]{"foo", "200", "B", "ar"}, StringUtils.splitByCharacterType("foo200Bar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseStartUpper() {
        assertArrayEquals(new String[]{"ASFRules"}, StringUtils.splitByCharacterType("ASFRules"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseNull() {
        assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseEmpty() {
        assertArrayEquals(new String[0], StringUtils.splitByCharacterTypeCamelCase(""));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseSimple() {
        assertArrayEquals(new String[]{"ab", " ", "de", " ", "fg"}, StringUtils.splitByCharacterTypeCamelCase("ab de fg"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseMultipleSpaces() {
        assertArrayEquals(new String[]{"ab", "   ", "de", " ", "fg"}, StringUtils.splitByCharacterTypeCamelCase("ab   de fg"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseColon() {
        assertArrayEquals(new String[]{"ab", ":", "cd", ":", "ef"}, StringUtils.splitByCharacterTypeCamelCase("ab:cd:ef"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseNumber() {
        assertArrayEquals(new String[]{"number", "5"}, StringUtils.splitByCharacterTypeCamelCase("number5"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseStartLower() {
        assertArrayEquals(new String[]{"foo", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("fooBar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseNumberAndLetters() {
        assertArrayEquals(new String[]{"foo", "200", "Bar"}, StringUtils.splitByCharacterTypeCamelCase("foo200Bar"));
    }

    @Test
    public void testSplitByCharacterTypeCamelCaseStartUpper() {
        assertArrayEquals(new String[]{"ASF", "Rules"}, StringUtils.splitByCharacterTypeCamelCase("ASFRules"));
    }

    @Test
    public void testJoinNullArray() {
        assertNull(StringUtils.join((Object[]) null));
    }

    @Test
    public void testJoinEmptyArray() {
        assertEquals("", StringUtils.join(new Object[0]));
    }

    @Test
    public void testJoinSingleNullElement() {
        assertEquals("", StringUtils.join(new Object[]{null}));
    }

    @Test
    public void testJoinMultipleElements() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}));
    }

    @Test
    public void testJoinWithNullAndEmptyElements() {
        assertEquals("a", StringUtils.join(new Object[]{null, "", "a"}));
    }

    @Test
    public void testJoinWithSeparatorCharNullArray() {
        assertNull(StringUtils.join((Object[]) null, ';'));
    }

    @Test
    public void testJoinWithSeparatorCharEmptyArray() {
        assertEquals("", StringUtils.join(new Object[0], ';'));
    }

    @Test
    public void testJoinWithSeparatorCharSingleNullElement() {
        assertEquals("", StringUtils.join(new Object[]{null}, ';'));
    }

    @Test
    public void testJoinWithSeparatorCharMultipleElements() {
        assertEquals("a;b;c", StringUtils.join(new Object[]{"a", "b", "c"}, ';'));
    }

    @Test
    public void testJoinWithSeparatorCharNullSeparator() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, null));
    }

    @Test
    public void testJoinWithSeparatorCharWithNullAndEmptyElements() {
        assertEquals(";;a", StringUtils.join(new Object[]{null, "", "a"}, ';'));
    }

    @Test
    public void testJoinWithSeparatorStringNullArray() {
        assertNull(StringUtils.join((Object[]) null, "--"));
    }

    @Test
    public void testJoinWithSeparatorStringEmptyArray() {
        assertEquals("", StringUtils.join(new Object[0], "--"));
    }

    @Test
    public void testJoinWithSeparatorStringSingleNullElement() {
        assertEquals("", StringUtils.join(new Object[]{null}, "--"));
    }

    @Test
    public void testJoinWithSeparatorStringMultipleElements() {
        assertEquals("a--b--c", StringUtils.join(new Object[]{"a", "b", "c"}, "--"));
    }

    @Test
    public void testJoinWithSeparatorStringNullSeparator() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, null));
    }

    @Test
    public void testJoinWithSeparatorStringEmptySeparator() {
        assertEquals("abc", StringUtils.join(new Object[]{"a", "b", "c"}, ""));
    }

    @Test
    public void testJoinWithSeparatorStringWithNullAndEmptyElements() {
        assertEquals(",,a", StringUtils.join(new Object[]{null, "", "a"}, ','));
    }

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

    @Test
    public void testRemoveStartNull() {
        assertNull(StringUtils.removeStart(null, "www."));
    }

    @Test
    public void testRemoveStartEmpty() {
        assertEquals("", StringUtils.removeStart("", "www."));
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
    }

    @Test
    public void testRemoveStartNotFoundPartialMatch() {
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveStartIgnoreCaseNull() {
        assertNull(StringUtils.removeStartIgnoreCase(null, "www."));
    }

    @Test
    public void testRemoveStartIgnoreCaseEmpty() {
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
    public void testRemoveStartIgnoreCaseFoundCaseInsensitive() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."));
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("WWW.domain.com", "www."));
    }

    @Test
    public void testRemoveStartIgnoreCaseNotFound() {
        assertEquals("domain.com", StringUtils.removeStartIgnoreCase("domain.com", "www."));
    }

    @Test
    public void testRemoveStartIgnoreCaseNotFoundPartialMatch() {
        assertEquals("www.domain.com", StringUtils.removeStartIgnoreCase("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveEndNull() {
        assertNull(StringUtils.removeEnd(null, ".com"));
    }

    @Test
    public void testRemoveEndEmpty() {
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
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", ".com."));
    }

    @Test
    public void testRemoveEndNotFoundPartialMatch() {
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveEndIgnoreCaseNull() {
        assertNull(StringUtils.removeEndIgnoreCase(null, ".com"));
    }

    @Test
    public void testRemoveEndIgnoreCaseEmpty() {
        assertEquals("", StringUtils.removeEndIgnoreCase("", ".com"));
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
    public void testRemoveEndIgnoreCaseFoundCaseInsensitive() {
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"));
        assertEquals("www.domain", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"));
    }

    @Test
    public void testRemoveEndIgnoreCaseNotFound() {
        assertEquals("www.domain.com", StringUtils.removeEndIgnoreCase("www.domain.com", ".com."));
    }

    @Test
    public void testRemoveEndIgnoreCaseNotFoundPartialMatch() {
        assertEquals("www.domain.com", StringUtils.removeEndIgnoreCase("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveNull() {
        assertNull(StringUtils.remove(null, "a"));
    }

    @Test
    public void testRemoveEmpty() {
        assertEquals("", StringUtils.remove("", "a"));
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
    public void testRemoveMultipleOccurrences() {
        assertEquals("b", StringUtils.remove("ababab", "ab"));
    }

    @Test
    public void testRemoveCharNull() {
        assertNull(StringUtils.remove(null, 'a'));
    }

    @Test
    public void testRemoveCharEmpty() {
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

    @Test
    public void testReplaceOnceNullText() {
        assertNull(StringUtils.replaceOnce(null, "a", "b"));
    }

    @Test
    public void testReplaceOnceEmptyText() {
        assertEquals("", StringUtils.replaceOnce("", "a", "b"));
    }

    @Test
    public void testReplaceOnceNullSearchString() {
        assertEquals("any", StringUtils.replaceOnce("any", null, "b"));
    }

    @Test
    public void testReplaceOnceNullReplacement() {
        assertEquals("aba", StringUtils.replaceOnce("aba", "a", null));
    }

    @Test
    public void testReplaceOnceEmptySearchString() {
        assertEquals("any", StringUtils.replaceOnce("any", "", "b"));
    }

    @Test
    public void testReplaceOnceFoundAndReplaced() {
        assertEquals("zba", StringUtils.replaceOnce("aba", "a", "z"));
    }

    @Test
    public void testReplaceOnceNotFound() {
        assertEquals("aba", StringUtils.replaceOnce("aba", "x", "y"));
    }

    @Test
    public void testReplaceOnceEmptyReplacement() {
        assertEquals("b", StringUtils.replaceOnce("aba", "a", ""));
    }

    @Test
    public void testReplaceNullText() {
        assertNull(StringUtils.replace(null, "a", "b"));
    }

    @Test
    public void testReplaceEmptyText() {
        assertEquals("", StringUtils.replace("", "a", "b"));
    }

    @Test
    public void testReplaceNullSearchString() {
        assertEquals("any", StringUtils.replace("any", null, "b"));
    }

    @Test
    public void testReplaceNullReplacement() {
        assertEquals("aba", StringUtils.replace("aba", "a", null));
    }

    @Test
    public void testReplaceEmptySearchString() {
        assertEquals("any", StringUtils.replace("any", "", "b"));
    }

    @Test
    public void testReplaceFoundAndReplaced() {
        assertEquals("zbzb", StringUtils.replace("abab", "a", "z"));
    }

    @Test
    public void testReplaceNotFound() {
        assertEquals("aba", StringUtils.replace("aba", "x", "y"));
    }

    @Test
    public void testReplaceEmptyReplacement() {
        assertEquals("b", StringUtils.replace("aba", "a", ""));
    }

    @Test
    public void testReplaceAllOccurrences() {
        assertEquals("zbzb", StringUtils.replace("abab", "a", "z"));
    }

    @Test
    public void testReplaceWithMaxZero() {
        assertEquals("abaa", StringUtils.replace("abaa", "a", "z", 0));
    }

    @Test
    public void testReplaceWithMaxOne() {
        assertEquals("zbaa", StringUtils.replace("abaa", "a", "z", 1));
    }

    @Test
    public void testReplaceWithMaxTwo() {
        assertEquals("zbza", StringUtils.replace("abaa", "a", "z", 2));
    }

    @Test
    public void testReplaceWithMaxNegativeOne() {
        assertEquals("zbzb", StringUtils.replace("abaa", "a", "z", -1));
    }

    @Test
    public void testReplaceEachNullText() {
        assertNull(StringUtils.replaceEach(null, new String[]{"a"}, new String[]{"b"}));
    }

    @Test
    public void testReplaceEachEmptyText() {
        assertEquals("", StringUtils.replaceEach("", new String[]{"a"}, new String[]{"b"}));
    }

    @Test
    public void testReplaceEachNullSearchList() {
        assertEquals("abc", StringUtils.replaceEach("abc", null, new String[]{"b"}));
    }

    @Test
    public void testReplaceEachNullReplacementList() {
        assertEquals("abc", StringUtils.replaceEach("abc", new String[]{"a"}, null));
    }

    @Test
    public void testReplaceEachEmptySearchList() {
        assertEquals("abc", StringUtils.replaceEach("abc", new String[0], new String[0]));
    }

    @Test
    public void testReplaceEachNullInLists() {
        assertEquals("abc", StringUtils.replaceEach("abc", new String[]{null}, new String[]{"a"}));
        assertEquals("abc", StringUtils.replaceEach("abc", new String[]{"a"}, new String[]{null}));
    }

    @Test
    public void testReplaceEachSimple() {
        assertEquals("wcte", StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}));
    }

    @Test
    public void testReplaceEachRepeatedlySimple() {
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}));
    }

    @Test
    public void testReplaceEachRepeatedlyCycle() {
        assertEquals("tcte", StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}));
    }

    @Test(expected = IllegalStateException.class)
    public void testReplaceEachRepeatedlyInfiniteLoop() {
        StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceEachMismatchedLengths() {
        StringUtils.replaceEach("abc", new String[]{"a"}, new String[]{"b", "c"});
    }

    @Test
    public void testReplaceCharsNullStr() {
        assertNull(StringUtils.replaceChars(null, 'a', 'b'));
    }

    @Test
    public void testReplaceCharsEmptyStr() {
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
    public void testReplaceCharsNullSearch() {
        assertEquals("abc", StringUtils.replaceChars("abc", null, "yz"));
    }

    @Test
    public void testReplaceCharsEmptySearch() {
        assertEquals("abc", StringUtils.replaceChars("abc", "", "yz"));
    }

    @Test
    public void testReplaceCharsNullReplace() {
        assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
    }

    @Test
    public void testReplaceCharsEmptyReplace() {
        assertEquals("ac", StringUtils.replaceChars("abc", "b", ""));
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
    public void testReplaceCharsNormal() {
        assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
    }

    @Test
    public void testOverlayNullStr() {
        assertNull(StringUtils.overlay(null, "zzzz", 2, 4));
    }

    @Test
    public void testOverlayEmptyStr() {
        assertEquals("abc", StringUtils.overlay("", "abc", 0, 0));
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
    public void testOverlayStartGreaterThanEnd() {
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2));
    }

    @Test
    public void testOverlayNormal() {
        assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
    }

    @Test
    public void testOverlayNegativeStart() {
        assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4));
    }

    @Test
    public void testOverlayEndOutOfBounds() {
        assertEquals("abzzzz", StringUtils.overlay("abcdef", "zzzz", 2, 8));
    }

    @Test
    public void testOverlayNegativeStartAndEnd() {
        assertEquals("zzzzabcdef", StringUtils.overlay("abcdef", "zzzz", -2, -3));
    }

    @Test
    public void testOverlayBothOutOfBounds() {
        assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 8, 10));
    }

    @Test
    public void testChompNull() {
        assertNull(StringUtils.chomp(null));
    }

    @Test
    public void testChompEmpty() {
        assertEquals("", StringUtils.chomp(""));
    }

    @Test
    public void testChompSingleCharReturnEmptyCr() {
        assertEquals("", StringUtils.chomp("\r"));
    }

    @Test
    public void testChompSingleCharReturnEmptyLf() {
        assertEquals("", StringUtils.chomp("\n"));
    }

    @Test
    public void testChompSingleCharReturnEmptyCrLf() {
        assertEquals("", StringUtils.chomp("\r\n"));
    }

    @Test
    public void testChompSingleCharReturnUnchanged() {
        assertEquals("a", StringUtils.chomp("a"));
    }

    @Test
    public void testChompEndsWithCr() {
        assertEquals("abc ", StringUtils.chomp("abc \r"));
    }

    @Test
    public void testChompEndsWithLf() {
        assertEquals("abc", StringUtils.chomp("abc\n"));
    }

    @Test
    public void testChompEndsWithCrLf() {
        assertEquals("abc", StringUtils.chomp("abc\r\n"));
    }

    @Test
    public void testChompEndsWithMultipleNewlines() {
        assertEquals("abc\r\n", StringUtils.chomp("abc\r\n\r\n"));
    }

    @Test
    public void testChompEndsWithNewlineAndOtherChars() {
        assertEquals("abc\n\rabc", StringUtils.chomp("abc\n\rabc"));
    }

    @Test
    public void testChompWithSeparatorNullStr() {
        assertNull(StringUtils.chomp(null, "bar"));
    }

    @Test
    public void testChompWithSeparatorEmptyStr() {
        assertEquals("", StringUtils.chomp("", "bar"));
    }

    @Test
    public void testChompWithSeparatorNullSeparator() {
        assertEquals("foo", StringUtils.chomp("foo", null));
    }

    @Test
    public void testChompWithSeparatorEmptySeparator() {
        assertEquals("foo", StringUtils.chomp("foo", ""));
    }

    @Test
    public void testChompWithSeparatorFound() {
        assertEquals("foo", StringUtils.chomp("foobar", "bar"));
    }

    @Test
    public void testChompWithSeparatorNotFound() {
        assertEquals("foobar", StringUtils.chomp("foobar", "baz"));
    }

    @Test
    public void testChompWithSeparatorFullMatch() {
        assertEquals("", StringUtils.chomp("foo", "foo"));
    }

    @Test
    public void testChompWithSeparatorPartialMatch() {
        assertEquals("foo ", StringUtils.chomp("foo ", "foo"));
        assertEquals(" ", StringUtils.chomp(" foo", "foo"));
    }

    @Test
    public void testChompWithSeparatorSeparatorTooLong() {
        assertEquals("foo", StringUtils.chomp("foo", "foooo"));
    }

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
    public void testChopTwoCharsCrLf() {
        assertEquals("", StringUtils.chop("\r\n"));
    }

    @Test
    public void testChopTwoCharsLfCr() {
        assertEquals("\r", StringUtils.chop("\r\n")); // LF is removed, CR remains
    }

    @Test
    public void testChopTwoCharsLf() {
        assertEquals("", StringUtils.chop("\n"));
    }

    @Test
    public void testChopTwoCharsCr() {
        assertEquals("", StringUtils.chop("\r"));
    }

    @Test
    public void testChopNormal() {
        assertEquals("ab", StringUtils.chop("abc"));
    }

    @Test
    public void testChopEndsWithCr() {
        assertEquals("abc ", StringUtils.chop("abc \r"));
    }

    @Test
    public void testChopEndsWithLf() {
        assertEquals("abc", StringUtils.chop("abc\n"));
    }

    @Test
    public void testChopEndsWithCrLf() {
        assertEquals("abc", StringUtils.chop("abc\r\n"));
    }

    @Test
    public void testChopEndsWithNewlineAndOtherChars() {
        assertEquals("abc\nab", StringUtils.chop("abc\nabc"));
    }

    @Test
    public void testRepeatNull() {
        assertNull(StringUtils.repeat(null, 2));
    }

    @Test
    public void testRepeatZeroTimes() {
        assertEquals("", StringUtils.repeat("abc", 0));
    }

    @Test
    public void testRepeatEmptyStringZeroTimes() {
        assertEquals("", StringUtils.repeat("", 0));
    }

    @Test
    public void testRepeatEmptyStringPositiveTimes() {
        assertEquals("", StringUtils.repeat("", 2));
    }

    @Test
    public void testRepeatPositiveTimes() {
        assertEquals("aaa", StringUtils.repeat("a", 3));
    }

    @Test
    public void testRepeatStringPositiveTimes() {
        assertEquals("abab", StringUtils.repeat("ab", 2));
    }

    @Test
    public void testRepeatNegativeTimes() {
        assertEquals("", StringUtils.repeat("a", -2));
    }

    @Test
    public void testRepeatStringWithSeparatorNullStr() {
        assertNull(StringUtils.repeat(null, null, 2));
    }

    @Test
    public void testRepeatStringWithSeparatorNullStrAndSeparator() {
        assertNull(StringUtils.repeat(null, "x", 2));
    }

    @Test
    public void testRepeatStringWithSeparatorEmptyStrAndNullSeparator() {
        assertEquals("", StringUtils.repeat("", null, 0));
    }

    @Test
    public void testRepeatStringWithSeparatorEmptyStrAndEmptySeparator() {
        assertEquals("", StringUtils.repeat("", "", 2));
    }

    @Test
    public void testRepeatStringWithSeparatorEmptyStr() {
        assertEquals("xxx", StringUtils.repeat("", "x", 3));
    }

    @Test
    public void testRepeatStringWithSeparatorNormal() {
        assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }

    @Test
    public void testRepeatCharZeroTimes() {
        assertEquals("", StringUtils.repeat('e', 0));
    }

    @Test
    public void testRepeatCharPositiveTimes() {
        assertEquals("eee", StringUtils.repeat('e', 3));
    }

    @Test
    public void testRepeatCharNegativeTimes() {
        assertEquals("", StringUtils.repeat('e', -2));
    }

    @Test
    public void testRightPadNull() {
        assertNull(StringUtils.rightPad(null, 3));
    }

    @Test
    public void testRightPadEmpty() {
        assertEquals("   ", StringUtils.rightPad("", 3));
    }

    @Test
    public void testRightPadNoPaddingNeeded() {
        assertEquals("bat", StringUtils.rightPad("bat", 3));
    }

    @Test
    public void testRightPadSufficientPadding() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5));
    }

    @Test
    public void testRightPadLengthOne() {
        assertEquals("bat", StringUtils.rightPad("bat", 1));
    }

    @Test
    public void testRightPadNegativeLength() {
        assertEquals("bat", StringUtils.rightPad("bat", -1));
    }

    @Test
    public void testRightPadWithCharNull() {
        assertNull(StringUtils.rightPad(null, 3, 'z'));
    }

    @Test
    public void testRightPadWithCharEmpty() {
        assertEquals("zzz", StringUtils.rightPad("", 3, 'z'));
    }

    @Test
    public void testRightPadWithCharNoPaddingNeeded() {
        assertEquals("bat", StringUtils.rightPad("bat", 3, 'z'));
    }

    @Test
    public void testRightPadWithCharSufficientPadding() {
        assertEquals("batzz", StringUtils.rightPad("bat", 5, 'z'));
    }

    @Test
    public void testRightPadWithCharLengthOne() {
        assertEquals("bat", StringUtils.rightPad("bat", 1, 'z'));
    }

    @Test
    public void testRightPadWithCharNegativeLength() {
        assertEquals("bat", StringUtils.rightPad("bat", -1, 'z'));
    }

    @Test
    public void testRightPadWithStringNull() {
        assertNull(StringUtils.rightPad(null, 3, "yz"));
    }

    @Test
    public void testRightPadWithStringEmpty() {
        assertEquals("zzz", StringUtils.rightPad("", 3, "yz"));
    }

    @Test
    public void testRightPadWithStringNoPaddingNeeded() {
        assertEquals("bat", StringUtils.rightPad("bat", 3, "yz"));
    }

    @Test
    public void testRightPadWithStringSufficientPadding() {
        assertEquals("batyz", StringUtils.rightPad("bat", 5, "yz"));
    }

    @Test
    public void testRightPadWithStringPaddingRepeats() {
        assertEquals("batyzyzy", StringUtils.rightPad("bat", 8, "yz"));
    }

    @Test
    public void testRightPadWithStringLengthOne() {
        assertEquals("bat", StringUtils.rightPad("bat", 1, "yz"));
    }

    @Test
    public void testRightPadWithStringNegativeLength() {
        assertEquals("bat", StringUtils.rightPad("bat", -1, "yz"));
    }

    @Test
    public void testRightPadWithStringNullPadStr() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, null));
    }

    @Test
    public void testRightPadWithStringEmptyPadStr() {
        assertEquals("bat  ", StringUtils.rightPad("bat", 5, ""));
    }

    @Test
    public void testLeftPadNull() {
        assertNull(StringUtils.leftPad(null, 3));
    }

    @Test
    public void testLeftPadEmpty() {
        assertEquals("   ", StringUtils.leftPad("", 3));
    }

    @Test
    public void testLeftPadNoPaddingNeeded() {
        assertEquals("bat", StringUtils.leftPad("bat", 3));
    }

    @Test
    public void testLeftPadSufficientPadding() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5));
    }

    @Test
    public void testLeftPadLengthOne() {
        assertEquals("bat", StringUtils.leftPad("bat", 1));
    }

    @Test
    public void testLeftPadNegativeLength() {
        assertEquals("bat", StringUtils.leftPad("bat", -1));
    }

    @Test
    public void testLeftPadWithCharNull() {
        assertNull(StringUtils.leftPad(null, 3, 'z'));
    }

    @Test
    public void testLeftPadWithCharEmpty() {
        assertEquals("zzz", StringUtils.leftPad("", 3, 'z'));
    }

    @Test
    public void testLeftPadWithCharNoPaddingNeeded() {
        assertEquals("bat", StringUtils.leftPad("bat", 3, 'z'));
    }

    @Test
    public void testLeftPadWithCharSufficientPadding() {
        assertEquals("zzbat", StringUtils.leftPad("bat", 5, 'z'));
    }

    @Test
    public void testLeftPadWithCharLengthOne() {
        assertEquals("bat", StringUtils.leftPad("bat", 1, 'z'));
    }

    @Test
    public void testLeftPadWithCharNegativeLength() {
        assertEquals("bat", StringUtils.leftPad("bat", -1, 'z'));
    }

    @Test
    public void testLeftPadWithStringNull() {
        assertNull(StringUtils.leftPad(null, 3, "yz"));
    }

    @Test
    public void testLeftPadWithStringEmpty() {
        assertEquals("   ", StringUtils.leftPad("", 3, "yz"));
    }

    @Test
    public void testLeftPadWithStringNoPaddingNeeded() {
        assertEquals("bat", StringUtils.leftPad("bat", 3, "yz"));
    }

    @Test
    public void testLeftPadWithStringSufficientPadding() {
        assertEquals("yzyzbat", StringUtils.leftPad("bat", 7, "yz"));
    }

    @Test
    public void testLeftPadWithStringPaddingRepeats() {
        assertEquals("yzyzybat", StringUtils.leftPad("bat", 8, "yz"));
    }

    @Test
    public void testLeftPadWithStringLengthOne() {
        assertEquals("bat", StringUtils.leftPad("bat", 1, "yz"));
    }

    @Test
    public void testLeftPadWithStringNegativeLength() {
        assertEquals("bat", StringUtils.leftPad("bat", -1, "yz"));
    }

    @Test
    public void testLeftPadWithStringNullPadStr() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5, null));
    }

    @Test
    public void testLeftPadWithStringEmptyPadStr() {
        assertEquals("  bat", StringUtils.leftPad("bat", 5, ""));
    }

    @Test
    public void testLengthNull() {
        assertEquals(0, StringUtils.length(null));
    }

    @Test
    public void testLengthEmpty() {
        assertEquals(0, StringUtils.length(""));
    }

    @Test
    public void testLengthNormal() {
        assertEquals(3, StringUtils.length("abc"));
    }

    @Test
    public void testCenterNull() {
        assertNull(StringUtils.center(null, 5));
    }

    @Test
    public void testCenterNegativeSize() {
        assertEquals("ab", StringUtils.center("ab", -1));
    }

    @Test
    public void testCenterEmpty() {
        assertEquals("    ", StringUtils.center("", 4));
    }

    @Test
    public void testCenterSizeLessThanLength() {
        assertEquals("ab", StringUtils.center("ab", 1));
    }

    @Test
    public void testCenterSizeEqualsLength() {
        assertEquals("abcd", StringUtils.center("abcd", 2));
    }

    @Test
    public void testCenterOddPadding() {
        assertEquals(" a  ", StringUtils.center("a", 4));
    }

    @Test
    public void testCenterEvenPadding() {
        assertEquals(" ab ", StringUtils.center("ab", 4));
    }

    @Test
    public void testCenterWithCharNull() {
        assertNull(StringUtils.center(null, 4, ' '));
    }

    @Test
    public void testCenterWithCharNegativeSize() {
        assertEquals("ab", StringUtils.center("ab", -1, ' '));
    }

    @Test
    public void testCenterWithCharEmpty() {
        assertEquals("    ", StringUtils.center("", 4, ' '));
    }

    @Test
    public void testCenterWithCharSizeLessThanLength() {
        assertEquals("ab", StringUtils.center("ab", 1, ' '));
    }

    @Test
    public void testCenterWithCharSizeEqualsLength() {
        assertEquals("abcd", StringUtils.center("abcd", 2, ' '));
    }

    @Test
    public void testCenterWithCharOddPadding() {
        assertEquals(" a  ", StringUtils.center("a", 4, ' '));
    }

    @Test
    public void testCenterWithCharEvenPadding() {
        assertEquals(" ab ", StringUtils.center("ab", 4, ' '));
    }

    @Test
    public void testCenterWithCharDifferentPadChar() {
        assertEquals("yayy", StringUtils.center("a", 4, 'y'));
    }

    @Test
    public void testCenterWithStringNull() {
        assertNull(StringUtils.center(null, 4, "yz"));
    }

    @Test
    public void testCenterWithStringNegativeSize() {
        assertEquals("ab", StringUtils.center("ab", -1, "yz"));
    }

    @Test
    public void testCenterWithStringEmpty() {
        assertEquals("    ", StringUtils.center("", 4, "yz"));
    }

    @Test
    public void testCenterWithStringSizeLessThanLength() {
        assertEquals("ab", StringUtils.center("ab", 1, "yz"));
    }

    @Test
    public void testCenterWithStringSizeEqualsLength() {
        assertEquals("abcd", StringUtils.center("abcd", 2, "yz"));
    }

    @Test
    public void testCenterWithStringOddPadding() {
        assertEquals("yayz", StringUtils.center("a", 4, "yz"));
    }

    @Test
    public void testCenterWithStringEvenPadding() {
        assertEquals("yzab", StringUtils.center("ab", 4, "yz"));
    }

    @Test
    public void testCenterWithStringNullPadStr() {
        assertEquals("  abc  ", StringUtils.center("abc", 7, null));
    }

    @Test
    public void testCenterWithStringEmptyPadStr() {
        assertEquals("  abc  ", StringUtils.center("abc", 7, ""));
    }

    @Test
    public void testUpperCaseNull() {
        assertNull(StringUtils.upperCase(null));
    }

    @Test
    public void testUpperCaseEmpty() {
        assertEquals("", StringUtils.upperCase(""));
    }

    @Test
    public void testUpperCaseNormal() {
        assertEquals("ABC", StringUtils.upperCase("aBc"));
    }

    @Test
    public void testUpperCaseWithLocaleNull() {
        assertNull(StringUtils.upperCase(null, Locale.ENGLISH));
    }

    @Test
    public void testUpperCaseWithLocaleEmpty() {
        assertEquals("", StringUtils.upperCase("", Locale.ENGLISH));
    }

    @Test
    public void testUpperCaseWithLocaleNormal() {
        assertEquals("ABC", StringUtils.upperCase("aBc", Locale.ENGLISH));
    }

    @Test
    public void testLowerCaseNull() {
        assertNull(StringUtils.lowerCase(null));
    }

    @Test
    public void testLowerCaseEmpty() {
        assertEquals("", StringUtils.lowerCase(""));
    }

    @Test
    public void testLowerCaseNormal() {
        assertEquals("abc", StringUtils.lowerCase("aBc"));
    }

    @Test
    public void testLowerCaseWithLocaleNull() {
        assertNull(StringUtils.lowerCase(null, Locale.ENGLISH));
    }

    @Test
    public void testLowerCaseWithLocaleEmpty() {
        assertEquals("", StringUtils.lowerCase("", Locale.ENGLISH));
    }

    @Test
    public void testLowerCaseWithLocaleNormal() {
        assertEquals("abc", StringUtils.lowerCase("aBc", Locale.ENGLISH));
    }

    @Test
    public void testCapitalizeNull() {
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    public void testCapitalizeEmpty() {
        assertEquals("", StringUtils.capitalize(""));
    }

    @Test
    public void testCapitalizeNormal() {
        assertEquals("Cat", StringUtils.capitalize("cat"));
    }

    @Test
    public void testCapitalizeAlreadyCapitalized() {
        assertEquals("CAt", StringUtils.capitalize("CAt"));
    }

    @Test
    public void testUncapitalizeNull() {
        assertNull(StringUtils.uncapitalize(null));
    }

    @Test
    public void testUncapitalizeEmpty() {
        assertEquals("", StringUtils.uncapitalize(""));
    }

    @Test
    public void testUncapitalizeNormal() {
        assertEquals("cat", StringUtils.uncapitalize("Cat"));
    }

    @Test
    public void testUncapitalizeAlreadyUncapitalized() {
        assertEquals("cAT", StringUtils.uncapitalize("cAT"));
    }

    @Test
    public void testSwapCaseNull() {
        assertNull(StringUtils.swapCase(null));
    }

    @Test
    public void testSwapCaseEmpty() {
        assertEquals("", StringUtils.swapCase(""));
    }

    @Test
    public void testSwapCaseNormal() {
        assertEquals("tHE DOG HAS A bone", StringUtils.swapCase("The dog has a BONE"));
    }

    @Test
    public void testSwapCaseMixedCase() {
        assertEquals("tHe", StringUtils.swapCase("ThE"));
    }

    @Test
    public void testCountMatchesNullStr() {
        assertEquals(0, StringUtils.countMatches(null, "a"));
    }

    @Test
    public void testCountMatchesEmptyStr() {
        assertEquals(0, StringUtils.countMatches("", "a"));
    }

    @Test
    public void testCountMatchesNullSub() {
        assertEquals(0, StringUtils.countMatches("abc", null));
    }

    @Test
    public void testCountMatchesEmptySub() {
        assertEquals(0, StringUtils.countMatches("abc", ""));
    }

    @Test
    public void testCountMatchesFoundSingle() {
        assertEquals(2, StringUtils.countMatches("abba", "a"));
    }

    @Test
    public void testCountMatchesFoundMultiple() {
        assertEquals(1, StringUtils.countMatches("abba", "ab"));
    }

    @Test
    public void testCountMatchesNotFound() {
        assertEquals(0, StringUtils.countMatches("abba", "xxx"));
    }

    @Test
    public void testCountMatchesOverlapping() {
        assertEquals(3, StringUtils.countMatches("aaaaa", "aa"));
    }

    @Test
    public void testIsAlphaNull() {
        assertFalse(StringUtils.isAlpha((CharSequence) null));
    }

    @Test
    public void testIsAlphaEmpty() {
        assertFalse(StringUtils.isAlpha(""));
    }

    @Test
    public void testIsAlphaWhitespace() {
        assertFalse(StringUtils.isAlpha("  "));
    }

    @Test
    public void testIsAlphaTrue() {
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

    @Test
    public void testIsAlphaSpaceNull() {
        assertFalse(StringUtils.isAlphaSpace(null));
    }

    @Test
    public void testIsAlphaSpaceEmpty() {
        assertTrue(StringUtils.isAlphaSpace(""));
    }

    @Test
    public void testIsAlphaSpaceWhitespace() {
        assertTrue(StringUtils.isAlphaSpace("  "));
    }

    @Test
    public void testIsAlphaSpaceTrue() {
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

    @Test
    public void testIsAlphanumericNull() {
        assertFalse(StringUtils.isAlphanumeric(null));
    }

    @Test
    public void testIsAlphanumericEmpty() {
        assertFalse(StringUtils.isAlphanumeric(""));
    }

    @Test
    public void testIsAlphanumericWhitespace() {
        assertFalse(StringUtils.isAlphanumeric("  "));
    }

    @Test
    public void testIsAlphanumericTrue() {
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

    @Test
    public void testIsAlphanumericSpaceNull() {
        assertFalse(StringUtils.isAlphanumericSpace(null));
    }

    @Test
    public void testIsAlphanumericSpaceEmpty() {
        assertTrue(StringUtils.isAlphanumericSpace(""));
    }

    @Test
    public void testIsAlphanumericSpaceWhitespace() {
        assertTrue(StringUtils.isAlphanumericSpace("  "));
    }

    @Test
    public void testIsAlphanumericSpaceTrue() {
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
    public void testIsAsciiPrintableAlphanumeric() {
        assertTrue(StringUtils.isAsciiPrintable("Ceki"));
        assertTrue(StringUtils.isAsciiPrintable("ab2c"));
    }

    @Test
    public void testIsAsciiPrintableSymbols() {
        assertTrue(StringUtils.isAsciiPrintable("!ab-c~"));
    }

    @Test
    public void testIsAsciiPrintableExtendedAscii() {
        assertTrue(StringUtils.isAsciiPrintable("\u0020")); // space
        assertTrue(StringUtils.isAsciiPrintable("\u0021")); // !
        assertTrue(StringUtils.isAsciiPrintable("\u007e")); // ~
    }

    @Test
    public void testIsAsciiPrintableNonPrintable() {
        assertFalse(StringUtils.isAsciiPrintable("\u007f")); // DEL
    }

    @Test
    public void testIsAsciiPrintableUnicode() {
        assertFalse(StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc"));
    }

    @Test
    public void testIsNumericNull() {
        assertFalse(StringUtils.isNumeric(null));
    }

    @Test
    public void testIsNumericEmpty() {
        assertFalse(StringUtils.isNumeric(""));
    }

    @Test
    public void testIsNumericWhitespace() {
        assertFalse(StringUtils.isNumeric("  "));
    }

    @Test
    public void testIsNumericTrue() {
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
    public void testIsNumericWithDecimal() {
        assertFalse(StringUtils.isNumeric("12.3"));
    }

    @Test
    public void testIsNumericSpaceNull() {
        assertFalse(StringUtils.isNumericSpace(null));
    }

    @Test
    public void testIsNumericSpaceEmpty() {
        assertTrue(StringUtils.isNumericSpace(""));
    }

    @Test
    public void testIsNumericSpaceWhitespace() {
        assertTrue(StringUtils.isNumericSpace("  "));
    }

    @Test
    public void testIsNumericSpaceTrue() {
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
    public void testIsNumericSpaceWithDecimal() {
        assertFalse(StringUtils.isNumericSpace("12.3"));
    }

    @Test
    public void testIsWhitespaceNull() {
        assertFalse(StringUtils.isWhitespace(null));
    }

    @Test
    public void testIsWhitespaceEmpty() {
        assertTrue(StringUtils.isWhitespace(""));
    }

    @Test
    public void testIsWhitespaceTrue() {
        assertTrue(StringUtils.isWhitespace("  "));
        assertTrue(StringUtils.isWhitespace("\t"));
        assertTrue(StringUtils.isWhitespace("\n"));
        assertTrue(StringUtils.isWhitespace("\r"));
        assertTrue(StringUtils.isWhitespace(" \t\n\r "));
    }

    @Test
    public void testIsWhitespaceFalse() {
        assertFalse(StringUtils.isWhitespace("abc"));
    }

    @Test
    public void testIsAllLowerCaseNull() {
        assertFalse(StringUtils.isAllLowerCase(null));
    }

    @Test
    public void testIsAllLowerCaseEmpty() {
        assertFalse(StringUtils.isAllLowerCase(""));
    }

    @Test
    public void testIsAllLowerCaseWhitespace() {
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

    @Test
    public void testIsAllUpperCaseNull() {
        assertFalse(StringUtils.isAllUpperCase(null));
    }

    @Test
    public void testIsAllUpperCaseEmpty() {
        assertFalse(StringUtils.isAllUpperCase(""));
    }

    @Test
    public void testIsAllUpperCaseWhitespace() {
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

    @Test
    public void testDefaultStringNull() {
        assertEquals("", StringUtils.defaultString(null));
    }

    @Test
    public void testDefaultStringEmpty() {
        assertEquals("", StringUtils.defaultString(""));
    }

    @Test
    public void testDefaultStringNormal() {
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
    public void testDefaultStringWithDefaultNormal() {
        assertEquals("bat", StringUtils.defaultString("bat", "NULL"));
    }

    @Test
    public void testDefaultIfBlankNull() {
        assertEquals("NULL", StringUtils.defaultIfBlank(null, "NULL"));
    }

    @Test
    public void testDefaultIfBlankEmpty() {
        assertEquals("NULL", StringUtils.defaultIfBlank("", "NULL"));
    }

    @Test
    public void testDefaultIfBlankWhitespace() {
        assertEquals("NULL", StringUtils.defaultIfBlank(" ", "NULL"));
    }

    @Test
    public void testDefaultIfBlankNormal() {
        assertEquals("bat", StringUtils.defaultIfBlank("bat", "NULL"));
    }

    @Test
    public void testDefaultIfBlankEmptyDefault() {
        assertNull(StringUtils.defaultIfBlank("", null));
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
    public void testDefaultIfEmptyWhitespace() {
        assertEquals(" ", StringUtils.defaultIfEmpty(" ", "NULL"));
    }

    @Test
    public void testDefaultIfEmptyNormal() {
        assertEquals("bat", StringUtils.defaultIfEmpty("bat", "NULL"));
    }

    @Test
    public void testDefaultIfEmptyEmptyDefault() {
        assertNull(StringUtils.defaultIfEmpty("", null));
    }

    @Test
    public void testReverseNull() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testReverseEmpty() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testReverseNormal() {
        assertEquals("tab", StringUtils.reverse("bat"));
    }

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
    public void testReverseDelimitedNormal() {
        assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
    }

    @Test
    public void testAbbreviateNull() {
        assertNull(StringUtils.abbreviate(null, 10));
    }

    @Test
    public void testAbbreviateEmpty() {
        assertEquals("", StringUtils.abbreviate("", 4));
    }

    @Test
    public void testAbbreviateShortString() {
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 8));
    }

    @Test
    public void testAbbreviateNormal() {
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
    }

    @Test
    public void testAbbreviateShortMaxWidth() {
        assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateMaxWidthTooSmall() {
        StringUtils.abbreviate("abcdefg", 3);
    }

    @Test
    public void testAbbreviateWithOffsetNull() {
        assertNull(StringUtils.abbreviate(null, -1, 10));
    }

    @Test
    public void testAbbreviateWithOffsetEmpty() {
        assertEquals("", StringUtils.abbreviate("", 0, 4));
    }

    @Test
    public void testAbbreviateWithOffsetNegativeOffset() {
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", -1, 10));
    }

    @Test
    public void testAbbreviateWithOffsetZeroOffset() {
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 0, 10));
    }

    @Test
    public void testAbbreviateWithOffsetSmallOffset() {
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 1, 10));
        assertEquals("abcdefg...", StringUtils.abbreviate("abcdefghijklmno", 4, 10));
    }

    @Test
    public void testAbbreviateWithOffsetMiddle() {
        assertEquals("...fghi...", StringUtils.abbreviate("abcdefghijklmno", 5, 10));
    }

    @Test
    public void testAbbreviateWithOffsetEnd() {
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 8, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 10, 10));
        assertEquals("...ijklmno", StringUtils.abbreviate("abcdefghijklmno", 12, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateWithOffsetMaxWidthTooSmall() {
        StringUtils.abbreviate("abcdefghij", 0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbbreviateWithOffsetMaxWidthTooSmallForOffset() {
        StringUtils.abbreviate("abcdefghij", 5, 6);
    }

    @Test
    public void testAbbreviateMiddleNullStr() {
        assertNull(StringUtils.abbreviateMiddle(null, ".", 0));
    }

    @Test
    public void testAbbreviateMiddleNullMiddle() {
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", null, 0));
    }

    @Test
    public void testAbbreviateMiddleZeroLength() {
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 0));
    }

    @Test
    public void testAbbreviateMiddleLengthSufficient() {
        assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 3));
    }

    @Test
    public void testAbbreviateMiddleNormal() {
        assertEquals("ab.f", StringUtils.abbreviateMiddle("abcdef", ".", 4));
    }

    @Test
    public void testAbbreviateMiddleLengthShorterThanMiddle() {
        assertEquals("abcdef", StringUtils.abbreviateMiddle("abcdef", "...", 2));
    }

    @Test
    public void testDifferenceNull1() {
        assertEquals("abc", StringUtils.difference(null, "abc"));
    }

    @Test
    public void testDifferenceNull2() {
        assertEquals("abc", StringUtils.difference("abc", null));
    }

    @Test
    public void testDifferenceBothNull() {
        assertNull(StringUtils.difference(null, null));
    }

    @Test
    public void testDifferenceEmpty() {
        assertEquals("", StringUtils.difference("", ""));
    }

    @Test
    public void testDifferenceEmpty1() {
        assertEquals("abc", StringUtils.difference("", "abc"));
    }

    @Test
    public void testDifferenceEmpty2() {
        assertEquals("", StringUtils.difference("abc", ""));
    }

    @Test
    public void testDifferenceSame() {
        assertEquals("", StringUtils.difference("abc", "abc"));
    }

    @Test
    public void testDifferenceSuffixDifferent() {
        assertEquals("xyz", StringUtils.difference("ab", "abxyz"));
    }

    @Test
    public void testDifferenceMiddleDifferent() {
        assertEquals("xyz", StringUtils.difference("abcde", "abxyz"));
    }

    @Test
    public void testDifferencePrefixDifferent() {
        assertEquals("xyz", StringUtils.difference("abcde", "xyz"));
    }

    @Test
    public void testIndexOfDifferenceNull1() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference(null, null));
    }

    @Test
    public void testIndexOfDifferenceEmpty() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference("", ""));
    }

    @Test
    public void testIndexOfDifferenceEmpty1() {
        assertEquals(0, StringUtils.indexOfDifference("", "abc"));
    }

    @Test
    public void testIndexOfDifferenceEmpty2() {
        assertEquals(0, StringUtils.indexOfDifference("abc", ""));
    }

    @Test
    public void testIndexOfDifferenceSame() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference("abc", "abc"));
    }

    @Test
    public void testIndexOfDifferenceSuffixDifferent() {
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));
    }

    @Test
    public void testIndexOfDifferenceMiddleDifferent() {
        assertEquals(2, StringUtils.indexOfDifference("abcde", "abxyz"));
    }

    @Test
    public void testIndexOfDifferencePrefixDifferent() {
        assertEquals(0, StringUtils.indexOfDifference("abcde", "xyz"));
    }

    @Test
    public void testIndexOfDifferenceOrder() {
        assertEquals(0, StringUtils.indexOfDifference("xyz", "abcde"));
    }

    @Test
    public void testIndexOfDifferenceArrayNull() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference((CharSequence[]) null));
    }

    @Test
    public void testIndexOfDifferenceArrayEmpty() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference(new CharSequence[0]));
    }

    @Test
    public void testIndexOfDifferenceArraySingle() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference(new CharSequence[]{"abc"}));
    }

    @Test
    public void testIndexOfDifferenceArrayAllNull() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference(null, null));
    }

    @Test
    public void testIndexOfDifferenceArrayAllEmpty() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference("", ""));
    }

    @Test
    public void testIndexOfDifferenceArrayEmptyAndNull() {
        assertEquals(0, StringUtils.indexOfDifference("", null));
        assertEquals(0, StringUtils.indexOfDifference(null, ""));
    }

    @Test
    public void testIndexOfDifferenceArrayMixedNullAndEmpty() {
        assertEquals(0, StringUtils.indexOfDifference(null, "", "abc"));
        assertEquals(0, StringUtils.indexOfDifference("abc", null, ""));
    }

    @Test
    public void testIndexOfDifferenceArrayMixedNullAndNonNull() {
        assertEquals(0, StringUtils.indexOfDifference("abc", null, null));
        assertEquals(0, StringUtils.indexOfDifference(null, null, "abc"));
    }

    @Test
    public void testIndexOfDifferenceArrayAllSame() {
        assertEquals(StringUtils.INDEX_NOT_FOUND, StringUtils.indexOfDifference("abc", "abc"));
    }

    @Test
    public void testIndexOfDifferenceArrayPartialMatch() {
        assertEquals(1, StringUtils.indexOfDifference("abc", "a"));
    }

    @Test
    public void testIndexOfDifferenceArrayPrefixDifferent() {
        assertEquals(2, StringUtils.indexOfDifference("ab", "abxyz"));
        assertEquals(2, StringUtils.indexOfDifference("abcde", "abxyz"));
    }

    @Test
    public void testIndexOfDifferenceArrayFirstDifferent() {
        assertEquals(0, StringUtils.indexOfDifference("abcde", "xyz"));
        assertEquals(0, StringUtils.indexOfDifference("xyz", "abcde"));
    }

    @Test
    public void testIndexOfDifferenceArrayMultipleStrings() {
        assertEquals(7, StringUtils.indexOfDifference("i am a machine", "i am a robot"));
        assertEquals(0, StringUtils.indexOfDifference("abc", "abd", "abe"));
        assertEquals(2, StringUtils.indexOfDifference("abc", "abd", "ab"));
    }

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
        assertEquals("abc", StringUtils.getCommonPrefix("abc"));
    }

    @Test
    public void testGetCommonPrefixAllNull() {
        assertEquals("", StringUtils.getCommonPrefix(null, null));
    }

    @Test
    public void testGetCommonPrefixAllEmpty() {
        assertEquals("", StringUtils.getCommonPrefix("", ""));
    }

    @Test
    public void testGetCommonPrefixEmptyAndNull() {
        assertEquals("", StringUtils.getCommonPrefix("", null));
        assertEquals("", StringUtils.getCommonPrefix(null, ""));
    }

    @Test
    public void testGetCommonPrefixAllSame() {
        assertEquals("abc", StringUtils.getCommonPrefix("abc", "abc"));
    }

    @Test
    public void testGetCommonPrefixPartialMatch() {
        assertEquals("a", StringUtils.getCommonPrefix("abc", "a"));
    }

    @Test
    public void testGetCommonPrefixSuffixDifferent() {
        assertEquals("ab", StringUtils.getCommonPrefix("ab", "abxyz"));
        assertEquals("ab", StringUtils.getCommonPrefix("abcde", "abxyz"));
    }

    @Test
    public void testGetCommonPrefixPrefixDifferent() {
        assertEquals("", StringUtils.getCommonPrefix("abcde", "xyz"));
        assertEquals("", StringUtils.getCommonPrefix("xyz", "abcde"));
    }

    @Test
    public void testGetCommonPrefixMultipleStrings() {
        assertEquals("i am a ", StringUtils.getCommonPrefix("i am a machine", "i am a robot"));
        assertEquals("ab", StringUtils.getCommonPrefix("abc", "abd", "abe"));
        assertEquals("ab", StringUtils.getCommonPrefix("abc", "abd", "ab"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLevenshteinDistanceNullS() {
        StringUtils.getLevenshteinDistance(null, "t");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLevenshteinDistanceNullT() {
        StringUtils.getLevenshteinDistance("s", null);
    }

    @Test
    public void testLevenshteinDistanceEmpty() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
    }

    @Test
    public void testLevenshteinDistanceEmptyS() {
        assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
    }

    @Test
    public void testLevenshteinDistanceEmptyT() {
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
    }

    @Test
    public void testLevenshteinDistanceFrogFog() {
        assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
    }

    @Test
    public void testLevenshteinDistanceFlyAnt() {
        assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
    }

    @Test
    public void testLevenshteinDistanceElephantHippo() {
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
    }

    @Test
    public void testLevenshteinDistanceHippoElephant() {
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
    }

    @Test
    public void testLevenshteinDistanceHippoZzzzzzzz() {
        assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz"));
    }

    @Test
    public void testLevenshteinDistanceHelloHallo() {
        assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo"));
    }

    @Test
    public void testLevenshteinDistanceThresholdExactMatch() {
        assertEquals(0, StringUtils.getLevenshteinDistance("", "", 0));
    }

    @Test
    public void testLevenshteinDistanceThresholdExactMatchNonEmpty() {
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 7));
        assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 8));
    }

    @Test
    public void testLevenshteinDistanceThresholdExceeded() {
        assertEquals(-1, StringUtils.getLevenshteinDistance("aaapppp", "", 6));
    }

    @Test
    public void testLevenshteinDistanceThresholdExactMatchReverse() {
        assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo", 7));
    }

    @Test
    public void testLevenshteinDistanceThresholdExceededReverse() {
        assertEquals(-1, StringUtils.getLevenshteinDistance("elephant", "hippo", 6));
    }

    @Test
    public void testLevenshteinDistanceThresholdExactMatchShorterFirst() {
        assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant", 7));
    }

    @Test
    public void testLevenshteinDistanceThresholdExceededShorterFirst() {
        assertEquals(-1, StringUtils.getLevenshteinDistance("hippo", "elephant", 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLevenshteinDistanceThresholdNegative() {
        StringUtils.getLevenshteinDistance("a", "b", -1);
    }

    @Test
    public void testStartsWithNullSeq() {
        assertTrue(StringUtils.startsWith(null, null));
        assertFalse(StringUtils.startsWith(null, "abc"));
    }

    @Test
    public void testStartsWithNullPrefix() {
        assertFalse(StringUtils.startsWith("abcdef", null));
    }

    @Test
    public void testStartsWithEmptyPrefix() {
        assertTrue(StringUtils.startsWith("abcdef", ""));
        assertTrue(StringUtils.startsWith("", ""));
    }

    @Test
    public void testStartsWithMatch() {
        assertTrue(StringUtils.startsWith("abcdef", "abc"));
    }

    @Test
    public void testStartsWithMismatch() {
        assertFalse(StringUtils.startsWith("ABCDEF", "abc"));
    }

    @Test
    public void testStartsWithIgnoreCaseNullSeq() {
        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
        assertFalse(StringUtils.startsWithIgnoreCase(null, "abc"));
    }

    @Test
    public void testStartsWithIgnoreCaseNullPrefix() {
        assertFalse(StringUtils.startsWithIgnoreCase("abcdef", null));
    }

    @Test
    public void testStartsWithIgnoreCaseEmptyPrefix() {
        assertTrue(StringUtils.startsWithIgnoreCase("abcdef", ""));
        assertTrue(StringUtils.startsWithIgnoreCase("", ""));
    }

    @Test
    public void testStartsWithIgnoreCaseMatch() {
        assertTrue(StringUtils.startsWithIgnoreCase("abcdef", "abc"));
        assertTrue(StringUtils.startsWithIgnoreCase("ABCDEF", "abc"));
    }

    @Test
    public void testStartsWithIgnoreCaseMismatch() {
        assertFalse(StringUtils.startsWithIgnoreCase("ABCDEF", "abd"));
    }

    @Test
    public void testStartsWithAnyNullSeq() {
        assertFalse(StringUtils.startsWithAny(null, (CharSequence[]) null));
        assertFalse(StringUtils.startsWithAny(null, "abc"));
    }

    @Test
    public void testStartsWithAnyEmptySearchStrings() {
        assertFalse(StringUtils.startsWithAny("abcxyz", new CharSequence[0]));
    }

    @Test
    public void testStartsWithAnyNullSearchString() {
        assertFalse(StringUtils.startsWithAny("abcxyz", null));
    }

    @Test
    public void testStartsWithAnyEmptySearchString() {
        assertFalse(StringUtils.startsWithAny("abcxyz", ""));
    }

    @Test
    public void testStartsWithAnyMatch() {
        assertTrue(StringUtils.startsWithAny("abcxyz", "abc"));
    }

    @Test
    public void testStartsWithAnyMatchIgnoreCase() {
        assertTrue(StringUtils.startsWithAny("abcxyz", "ABC"));
    }

    @Test
    public void testStartsWithAnyMultipleSearchStrings() {
        assertTrue(StringUtils.startsWithAny("abcxyz", null, "xyz", "abc"));
    }

    @Test
    public void testStartsWithAnyNoMatch() {
        assertFalse(StringUtils.startsWithAny("abcxyz", "def", "ghi"));
    }

    @Test
    public void testEndsWithNullSeq() {
        assertTrue(StringUtils.endsWith(null, null));
        assertFalse(StringUtils.endsWith(null, "def"));
    }

    @Test
    public void testEndsWithNullSuffix() {
        assertFalse(StringUtils.endsWith("abcdef", null));
    }

    @Test
    public void testEndsWithEmptySuffix() {
        assertTrue(StringUtils.endsWith("abcdef", ""));
        assertTrue(StringUtils.endsWith("", ""));
    }

    @Test
    public void testEndsWithMatch() {
        assertTrue(StringUtils.endsWith("abcdef", "def"));
    }

    @Test
    public void testEndsWithMismatch() {
        assertFalse(StringUtils.endsWith("ABCDEF", "def"));
        assertFalse(StringUtils.endsWith("ABCDEF", "cde"));
    }

    @Test
    public void testEndsWithIgnoreCaseNullSeq() {
        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
        assertFalse(StringUtils.endsWithIgnoreCase(null, "def"));
    }

    @Test
    public void testEndsWithIgnoreCaseNullSuffix() {
        assertFalse(StringUtils.endsWithIgnoreCase("abcdef", null));
    }

    @Test
    public void testEndsWithIgnoreCaseEmptySuffix() {
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", ""));
        assertTrue(StringUtils.endsWithIgnoreCase("", ""));
    }

    @Test
    public void testEndsWithIgnoreCaseMatch() {
        assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "def"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
        assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "DEF"));
    }

    @Test
    public void testEndsWithIgnoreCaseMismatch() {
        assertFalse(StringUtils.endsWithIgnoreCase("ABCDEF", "cde"));
    }

    @Test
    public void testNormalizeSpaceNull() {
        assertNull(StringUtils.normalizeSpace(null));
    }

    @Test
    public void testNormalizeSpaceEmpty() {
        assertEquals("", StringUtils.normalizeSpace(""));
    }

    @Test
    public void testNormalizeSpaceNoChange() {
        assertEquals("abc", StringUtils.normalizeSpace("abc"));
    }

    @Test
    public void testNormalizeSpaceLeadingAndTrailing() {
        assertEquals("abc", StringUtils.normalizeSpace("  abc  "));
    }

    @Test
    public void testNormalizeSpaceInternalMultipleSpaces() {
        assertEquals("abc def", StringUtils.normalizeSpace("abc   def"));
    }

    @Test
    public void testNormalizeSpaceMixedWhitespace() {
        assertEquals("abc def", StringUtils.normalizeSpace("abc \t \n \r def"));
    }

    @Test
    public void testNormalizeSpaceOnlyWhitespace() {
        assertEquals(" ", StringUtils.normalizeSpace(" \t \n \r "));
    }

    @Test
    public void testEndsWithAnyNullSeq() {
        assertFalse(StringUtils.endsWithAny(null, (CharSequence[]) null));
        assertFalse(StringUtils.endsWithAny(null, "def"));
    }

    @Test
    public void testEndsWithAnyEmptySearchStrings() {
        assertFalse(StringUtils.endsWithAny("abcxyz", new CharSequence[0]));
    }

    @Test
    public void testEndsWithAnyNullSearchString() {
        assertFalse(StringUtils.endsWithAny("abcxyz", null));
    }

    @Test
    public void testEndsWithAnyEmptySearchString() {
        assertTrue(StringUtils.endsWithAny("abcxyz", ""));
    }

    @Test
    public void testEndsWithAnyMatch() {
        assertTrue(StringUtils.endsWithAny("abcxyz", "xyz"));
    }

    @Test
    public void testEndsWithAnyMatchIgnoreCase() {
        assertTrue(StringUtils.endsWithAny("abcXYZ", "xyz"));
    }

    @Test
    public void testEndsWithAnyMultipleSearchStrings() {
        assertTrue(StringUtils.endsWithAny("abcxyz", null, "xyz", "abc"));
    }

    @Test
    public void testEndsWithAnyNoMatch() {
        assertFalse(StringUtils.endsWithAny("abcxyz", "def", "ghi"));
    }

    @Test
    public void testToStringByteArrayCharsetNameNull() throws UnsupportedEncodingException {
        byte[] bytes = {104, 101, 108, 108, 111}; // "hello"
        assertEquals("hello", StringUtils.toString(bytes, null));
    }

    @Test
    public void testToStringByteArrayCharsetNameValid() throws UnsupportedEncodingException {
        byte[] bytes = {104, 101, 108, 108, 111}; // "hello"
        assertEquals("hello", StringUtils.toString(bytes, "UTF-8"));
    }

    @Test(expected = UnsupportedEncodingException.class)
    public void testToStringByteArrayCharsetNameInvalid() throws UnsupportedEncodingException {
        byte[] bytes = {104, 101, 108, 108, 111}; // "hello"
        StringUtils.toString(bytes, "INVALID-ENCODING");
    }
}
```