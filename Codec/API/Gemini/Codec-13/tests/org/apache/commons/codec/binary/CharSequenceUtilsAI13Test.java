package org.apache.commons.codec.binary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for {@link CharSequenceUtils}.
 */
public class CharSequenceUtilsAI13Test {

    @Test
    public void testConstructor() {
        CharSequenceUtils utils = new CharSequenceUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void testRegionMatchesBothStringsCaseSensitive() {
        String cs = "Hello World";
        String substring = "World";
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 4));
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, "world", 0, 5));
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs, false, 0, substring, 0, 5));
    }

    @Test
    public void testRegionMatchesBothStringsCaseInsensitive() {
        String cs = "Hello World";
        String substring = "WORLD";
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs, true, 6, "EARTH", 0, 5));
    }

    @Test
    public void testRegionMatchesStringBuilderCaseSensitive() {
        CharSequence cs = new StringBuilder("abcdef");
        CharSequence substring = new StringBuilder("cde");
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs, false, 2, substring, 0, 3));
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs, false, 1, substring, 0, 3));
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs, false, 2, new StringBuilder("CDE"), 0, 3));
    }

    @Test
    public void testRegionMatchesStringBuilderCaseInsensitive() {
        CharSequence cs = new StringBuilder("abcdef");
        CharSequence substring = new StringBuilder("CDE");
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs, true, 2, substring, 0, 3));
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs, true, 2, new StringBuilder("CDX"), 0, 3));
    }

    @Test
    public void testRegionMatchesMixedTypesStringAndStringBuilder() {
        CharSequence cs = "TestingMixed";
        CharSequence substring = new StringBuilder("ing");
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs, false, 4, substring, 0, 3));
        Assert.assertTrue(CharSequenceUtils.regionMatches(substring, false, 0, cs, 4, 3));

        CharSequence substringUpper = new StringBuilder("ING");
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs, true, 4, substringUpper, 0, 3));
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs, false, 4, substringUpper, 0, 3));
    }

    @Test
    public void testRegionMatchesZeroOrNegativeLength() {
        CharSequence cs1 = "abc";
        CharSequence cs2 = new StringBuilder("xyz");
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, 0));
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs2, false, 0, cs1, 0, 0));
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs2, false, 0, cs1, 0, -1));
    }

    @Test
    public void testRegionMatchesFullStringEqual() {
        CharSequence cs1 = new StringBuffer("equalText");
        CharSequence cs2 = new StringBuffer("equalText");
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, cs1.length()));
    }

    @Test
    public void testRegionMatchesCharacterCaseSpecialBranch() {
        CharSequence cs1 = new StringBuilder("abc");
        CharSequence cs2 = new StringBuilder("ABC");
        Assert.assertTrue(CharSequenceUtils.regionMatches(cs1, true, 0, cs2, 0, 3));
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, 3));
    }

    @Test
    public void testRegionMatchesMismatchAfterMatchingPrefix() {
        CharSequence cs1 = new StringBuilder("abcdef");
        CharSequence cs2 = new StringBuilder("abcXef");
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, 4));
        Assert.assertFalse(CharSequenceUtils.regionMatches(cs1, true, 0, cs2, 0, 4));
    }
}
