package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class StringUtilTest {
    @Test
    public void testJoinEmptyCollection() throws Exception {
        Collection strings = Arrays.asList();
        assertEquals("", StringUtil.join(strings, ","));
    }

    @Test
    public void testJoinSingleAndMultipleStrings() throws Exception {
        assertEquals("one", StringUtil.join(Arrays.asList("one"), ","));
        assertEquals("one,two,three", StringUtil.join(Arrays.asList("one", "two", "three"), ","));
    }

    @Test
    public void testPaddingZeroAndCachedBoundary() throws Exception {
        assertEquals("", StringUtil.padding(0));
        assertEquals("                    ", StringUtil.padding(20));
    }

    @Test
    public void testPaddingFirstWidthBeyondCachedArray() throws Exception {
        assertEquals("                     ", StringUtil.padding(21));
    }

    @Test
    public void testPaddingNegativeWidthThrows() throws Exception {
        try {
            StringUtil.padding(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testBlankNullEmptyAndWhitespace() throws Exception {
        assertTrue(StringUtil.isBlank(null));
        assertTrue(StringUtil.isBlank(""));
        assertTrue(StringUtil.isBlank(" \t\n"));
    }

    @Test
    public void testBlankRejectsNonWhitespace() throws Exception {
        assertFalse(StringUtil.isBlank(" a "));
    }

    @Test
    public void testNumericNullEmptyDigitsAndNonDigit() throws Exception {
        assertFalse(StringUtil.isNumeric(null));
        assertFalse(StringUtil.isNumeric(""));
        assertTrue(StringUtil.isNumeric("0123"));
        assertFalse(StringUtil.isNumeric("12a"));
    }

    @Test
    public void testNumericUsesUnicodeDigits() throws Exception {
        assertTrue(StringUtil.isNumeric("\u0661\u0662"));
    }

    @Test
    public void testHtmlWhitespaceDefinition() throws Exception {
        assertTrue(StringUtil.isWhitespace(' '));
        assertTrue(StringUtil.isWhitespace('\r'));
        assertFalse(StringUtil.isWhitespace(160));
    }

    @Test
    public void testActuallyWhitespaceIncludesNonbreakingSpace() throws Exception {
        assertTrue(StringUtil.isActuallyWhitespace(160));
        assertFalse(StringUtil.isActuallyWhitespace('x'));
    }

    @Test
    public void testInvisibleCharacterSet() throws Exception {
        assertTrue(StringUtil.isInvisibleChar(8203));
        assertTrue(StringUtil.isInvisibleChar(173));
        assertFalse(StringUtil.isInvisibleChar('x'));
    }

    @Test
    public void testNormaliseWhitespaceCollapsesAndTrimsNothing() throws Exception {
        assertEquals(" a b ", StringUtil.normaliseWhitespace(" \ta\nb "));
    }

    @Test
    public void testNormaliseWhitespaceDropsInvisibleCharacters() throws Exception {
        assertEquals("ab", StringUtil.normaliseWhitespace("a\u200Bb"));
    }

    @Test
    public void testAppendNormalisedWhitespaceStripsLeadingWhitespace() throws Exception {
        StringBuilder accum = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(accum, " \ta b ", true);
        assertEquals("a b ", accum.toString());
    }

    @Test
    public void testAppendNormalisedWhitespaceKeepsLeadingWhitespace() throws Exception {
        StringBuilder accum = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(accum, " \ta", false);
        assertEquals(" a", accum.toString());
    }

    @Test
    public void testInFindsMatchingAndRejectsMissingValue() throws Exception {
        assertTrue(StringUtil.in("b", "a", "b", "c"));
        assertFalse(StringUtil.in("z", "a", "b", "c"));
    }

    @Test
    public void testInSortedFindsFirstAndLastAndRejectsMissingValue() throws Exception {
        String[] values = {"a", "b", "c"};
        assertTrue(StringUtil.inSorted("a", values));
        assertTrue(StringUtil.inSorted("c", values));
        assertFalse(StringUtil.inSorted("z", values));
    }

    @Test
    public void testResolveRelativeUrl() throws Exception {
        URL base = new URL("http://example.com/a/b");
        assertEquals(new URL("http://example.com/a/c"), StringUtil.resolve(base, "c"));
    }

    @Test
    public void testResolveQueryRelativeUrl() throws Exception {
        URL base = new URL("http://example.com/a/b");
        assertEquals(new URL("http://example.com/a/b?q=1"), StringUtil.resolve(base, "?q=1"));
    }

    @Test
    public void testResolveDotRelativeUrlFromRootBase() throws Exception {
        URL base = new URL("http://example.com");
        assertEquals(new URL("http://example.com/a"), StringUtil.resolve(base, "./a"));
    }

    @Test
    public void testStringBuilderIsClearedBeforeReuse() throws Exception {
        StringBuilder builder = StringUtil.stringBuilder();
        builder.append("text");
        assertEquals("", StringUtil.stringBuilder().toString());
    }
}
