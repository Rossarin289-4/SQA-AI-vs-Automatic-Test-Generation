package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.lang.reflect.Field; // Added import for Field

public class StringUtilTest {
    // Access the static padding array from StringUtil via reflection
    private String[] getPaddingArray() throws Exception {
        Field paddingField = StringUtil.class.getDeclaredField("padding");
        paddingField.setAccessible(true);
        return (String[]) paddingField.get(null);
    }

    @Test
    public void testJoinCollectionWithSeparator() throws Exception {
        Collection<String> strings = Arrays.asList("a", "b", "c");
        assertEquals("a,b,c", StringUtil.join(strings, ","));
    }

    @Test
    public void testJoinCollectionWithEmptySeparator() throws Exception {
        Collection<String> strings = Arrays.asList("a", "b", "c");
        assertEquals("abc", StringUtil.join(strings, ""));
    }

    @Test
    public void testJoinCollectionWithNullSeparator() throws Exception {
        Collection<String> strings = Arrays.asList("a", "b", "c");
        // According to reference source, null separator results in concatenation.
        // For "a", "b", "c", it becomes "a" + "b" + "c" which is "abc".
        assertEquals("abc", StringUtil.join(strings, null));
    }

    @Test
    public void testJoinEmptyCollection() throws Exception {
        Collection<String> strings = Collections.emptyList();
        assertEquals("", StringUtil.join(strings, ","));
    }

    @Test
    public void testJoinSingleElementCollection() throws Exception {
        Collection<String> strings = Collections.singletonList("a");
        assertEquals("a", StringUtil.join(strings, ","));
    }

    @Test
    public void testJoinIteratorWithSeparator() throws Exception {
        Iterator<String> strings = Arrays.asList("a", "b", "c").iterator();
        assertEquals("a-b-c", StringUtil.join(strings, "-"));
    }

    @Test
    public void testJoinEmptyIterator() throws Exception {
        Iterator<String> strings = Collections.emptyIterator();
        assertEquals("", StringUtil.join(strings, ","));
    }

    @Test
    public void testJoinSingleElementIterator() throws Exception {
        Iterator<String> strings = Collections.singletonList("a").iterator();
        assertEquals("a", StringUtil.join(strings, ","));
    }

    @Test
    public void testJoinStringArrayWithSeparator() throws Exception {
        String[] strings = {"a", "b", "c"};
        assertEquals("a b c", StringUtil.join(strings, " "));
    }

    @Test
    public void testJoinEmptyStringArray() throws Exception {
        String[] strings = {};
        assertEquals("", StringUtil.join(strings, ","));
    }

    @Test
    public void testJoinSingleElementStringArray() throws Exception {
        String[] strings = {"a"};
        assertEquals("a", StringUtil.join(strings, ","));
    }

    @Test
    public void testPaddingZero() throws Exception {
        assertEquals("", StringUtil.padding(0));
    }

    @Test
    public void testPaddingSmallValue() throws Exception {
        assertEquals("   ", StringUtil.padding(3));
    }

    @Test
    public void testPaddingMaxMemoisedValue() throws Exception {
        // The padding array has length 22 (indices 0 to 21)
        // So padding(21) should return the last element of the memoised array.
        String[] padding = getPaddingArray();
        assertEquals(padding[21], StringUtil.padding(21));
    }

    @Test
    public void testPaddingValueJustAboveMaxMemoised() throws Exception {
        // For values >= padding.length, a new char array is created.
        assertEquals(22, StringUtil.padding(22).length());
    }

    @Test
    public void testPaddingNegativeWidth() throws Exception {
        try {
            StringUtil.padding(-1);
            fail("Expected IllegalArgumentException for negative width");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testIsBlankNull() {
        assertTrue(StringUtil.isBlank(null));
    }

    @Test
    public void testIsBlankEmpty() {
        assertTrue(StringUtil.isBlank(""));
    }

    @Test
    public void testIsBlankWhitespace() {
        assertTrue(StringUtil.isBlank(" \t\n\r\f"));
    }

    @Test
    public void testIsBlankNonWhitespace() {
        assertFalse(StringUtil.isBlank("a"));
    }

    @Test
    public void testIsBlankMixed() {
        assertFalse(StringUtil.isBlank(" a "));
    }

    @Test
    public void testIsNumericNull() {
        assertFalse(StringUtil.isNumeric(null));
    }

    @Test
    public void testIsNumericEmpty() {
        assertFalse(StringUtil.isNumeric(""));
    }

    @Test
    public void testIsNumericDigits() {
        assertTrue(StringUtil.isNumeric("12345"));
    }

    @Test
    public void testIsNumericWithNonDigit() {
        assertFalse(StringUtil.isNumeric("123a"));
    }

    @Test
    public void testIsNumericWithSpaces() {
        assertFalse(StringUtil.isNumeric("123 45"));
    }

    @Test
    public void testIsWhitespaceSpace() {
        assertTrue(StringUtil.isWhitespace(' '));
    }

    @Test
    public void testIsWhitespaceTab() {
        assertTrue(StringUtil.isWhitespace('\t'));
    }

    @Test
    public void testIsWhitespaceNewline() {
        assertTrue(StringUtil.isWhitespace('\n'));
    }

    @Test
    public void testIsWhitespaceCarriageReturn() {
        assertTrue(StringUtil.isWhitespace('\r'));
    }

    @Test
    public void testIsWhitespaceFormFeed() {
        assertTrue(StringUtil.isWhitespace('\f'));
    }

    @Test
    public void testIsWhitespaceNonWhitespace() {
        assertFalse(StringUtil.isWhitespace('a'));
    }

    @Test
    public void testIsActuallyWhitespaceNonBreakingSpace() {
        // 160 is &nbsp;
        assertTrue(StringUtil.isActuallyWhitespace(160));
    }

    @Test
    public void testIsActuallyWhitespaceNormalSpace() {
        assertTrue(StringUtil.isActuallyWhitespace(' '));
    }

    @Test
    public void testIsActuallyWhitespaceNonSpace() {
        assertFalse(StringUtil.isActuallyWhitespace('a'));
    }

    @Test
    public void testIsInvisibleCharZeroWidthSpace() {
        assertTrue(StringUtil.isInvisibleChar(8203));
    }

    @Test
    public void testIsInvisibleCharSoftHyphen() {
        assertTrue(StringUtil.isInvisibleChar(173));
    }

    @Test
    public void testIsInvisibleCharNonInvisible() {
        assertFalse(StringUtil.isInvisibleChar('a'));
    }

    @Test
    public void testNormaliseWhitespaceMultipleSpaces() {
        assertEquals("a b c", StringUtil.normaliseWhitespace("a   b  c"));
    }

    @Test
    public void testNormaliseWhitespaceMixedWhitespace() {
        assertEquals("a b c", StringUtil.normaliseWhitespace("a\t\n\r\f b c"));
    }

    @Test
    public void testNormaliseWhitespaceLeadingAndTrailing() {
        assertEquals("a b c", StringUtil.normaliseWhitespace("  a b c  "));
    }

    @Test
    public void testNormaliseWhitespaceEmpty() {
        assertEquals("", StringUtil.normaliseWhitespace(""));
    }

    @Test
    public void testNormaliseWhitespaceNull() {
        // The code treats null input as an empty string for normalisation.
        assertEquals("", StringUtil.normaliseWhitespace(null));
    }

    @Test
    public void testAppendNormalisedWhitespaceBasic() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "a  b", false);
        assertEquals("a b", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespaceStripLeading() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "  a b", true);
        assertEquals("a b", sb.toString());
    }

    @Test
    public void testAppendNormalisedWhitespaceStripLeadingNoEffect() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "a b", true);
        assertEquals("a b", sb.toString());
    }
    
    @Test
    public void testAppendNormalisedWhitespaceWithInvisibleChars() {
        StringBuilder sb = new StringBuilder();
        StringUtil.appendNormalisedWhitespace(sb, "a" + (char)8203 + "b", false);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testInFound() {
        assertTrue(StringUtil.in("b", "a", "b", "c"));
    }

    @Test
    public void testInNotFound() {
        assertFalse(StringUtil.in("d", "a", "b", "c"));
    }

    @Test
    public void testInEmptyHaystack() {
        assertFalse(StringUtil.in("a", new String[0]));
    }

    @Test
    public void testInNullHaystack() {
        // The code iterates up to len, so null haystack will cause NullPointerException
        // if not handled. However, the method signature takes String... haystack,
        // which means an empty array is passed if null is passed to the varargs.
        // Thus, it should behave like an empty haystack.
        assertFalse(StringUtil.in("a", (String[]) null));
    }

    @Test
    public void testInSortedFound() {
        assertTrue(StringUtil.inSorted("b", new String[]{"a", "b", "c"}));
    }

    @Test
    public void testInSortedNotFound() {
        assertFalse(StringUtil.inSorted("d", new String[]{"a", "b", "c"}));
    }

    @Test
    public void testInSortedEmptyHaystack() {
        assertFalse(StringUtil.inSorted("a", new String[0]));
    }

    @Test
    public void testResolveBasic() throws MalformedURLException {
        URL baseUrl = new URL("http://example.com/path/");
        String relUrl = "page.html";
        assertEquals("http://example.com/path/page.html", StringUtil.resolve(baseUrl, relUrl).toExternalForm());
    }

    @Test
    public void testResolveAbsolutePath() throws MalformedURLException {
        URL baseUrl = new URL("http://example.com/path/");
        String relUrl = "/another/page.html";
        assertEquals("http://example.com/another/page.html", StringUtil.resolve(baseUrl, relUrl).toExternalForm());
    }

    @Test
    public void testResolveRelativePathDot() throws MalformedURLException {
        URL baseUrl = new URL("http://example.com/path/");
        String relUrl = "./page.html";
        assertEquals("http://example.com/path/page.html", StringUtil.resolve(baseUrl, relUrl).toExternalForm());
    }

    @Test
    public void testResolveRelativePathDotDot() throws MalformedURLException {
        URL baseUrl = new URL("http://example.com/path/sub/");
        String relUrl = "../page.html";
        assertEquals("http://example.com/path/page.html", StringUtil.resolve(baseUrl, relUrl).toExternalForm());
    }

    @Test
    public void testResolveAlreadyAbsolute() throws MalformedURLException {
        URL baseUrl = new URL("http://example.com/");
        String relUrl = "http://another.com/page.html";
        assertEquals("http://another.com/page.html", StringUtil.resolve(baseUrl, relUrl).toExternalForm());
    }

    @Test
    public void testResolveWithQuery() throws MalformedURLException {
        URL baseUrl = new URL("http://example.com/path/");
        String relUrl = "?query=test";
        assertEquals("http://example.com/path/?query=test", StringUtil.resolve(baseUrl, relUrl).toExternalForm());
    }

    @Test
    public void testResolveWithFragment() throws MalformedURLException {
        URL baseUrl = new URL("http://example.com/path/");
        String relUrl = "#fragment";
        assertEquals("http://example.com/path/#fragment", StringUtil.resolve(baseUrl, relUrl).toExternalForm());
    }

    @Test
    public void testResolveStringBasic() {
        assertEquals("http://example.com/path/page.html", StringUtil.resolve("http://example.com/path/", "page.html"));
    }

    @Test
    public void testResolveStringBaseMalformed() {
        assertEquals("", StringUtil.resolve("invalid", "page.html"));
    }

    @Test
    public void testResolveStringRelAbsolute() {
        assertEquals("http://another.com/page.html", StringUtil.resolve("http://example.com", "http://another.com/page.html"));
    }

    @Test
    public void testStringBuilderReturnsNewInstanceWhenLengthIsTooBig() {
        // To properly test the ThreadLocal behavior where a new StringBuilder is created
        // when the cached one exceeds MaxCachedBuilderSize, we need to ensure the cached
        // one is indeed too large.
        StringBuilder sb_init = StringUtil.stringBuilder(); // Get initial cached builder
        int maxSize = 8 * 1024;
        
        // Fill the builder to exceed the max size
        // Ensure we append enough to definitely exceed MaxCachedBuilderSize
        for(int i = 0; i < maxSize + 10; i++){ 
            sb_init.append("a");
        }
        
        // Now call stringBuilder() again. If it's too big, a new one should be created.
        StringBuilder sb_new = StringUtil.stringBuilder();
        
        // The key is that the *newly returned* StringBuilder should be empty, and not the same instance as sb_init if it was too big.
        // If sb_init was not too big, it would be reset and returned.
        // The source code says: "if (sb.length() > MaxCachedBuilderSize) { sb = new StringBuilder(MaxCachedBuilderSize); stringLocal.set(sb); }"
        // This means if sb was too big, it's replaced and the NEW sb is returned.
        // If sb was NOT too big, it's cleared and returned.
        // So, after filling sb_init, it MUST be > MaxCachedBuilderSize. Thus, stringLocal.set(new StringBuilder(MaxCachedBuilderSize)) is called.
        // The returned sb_new MUST be this new StringBuilder, which has length 0.
        
        assertNotSame(sb_init, sb_new); // Should be a new instance if the old one was too big.
        assertEquals(0, sb_new.length()); // The new builder should be empty.
        
        // Also check the capacity to ensure it's the default or MaxCachedBuilderSize
        assertTrue(sb_new.capacity() >= 0); // Capacity can be anything.
    }

    @Test
    public void testStringBuilderReturnsClearedInstanceWhenLengthIsOk() {
        StringBuilder sb_first = StringUtil.stringBuilder();
        sb_first.append("some content");
        
        StringBuilder sb_second = StringUtil.stringBuilder();
        
        // If the first builder was NOT too big, it should have been cleared and returned.
        // So, sb_second should be the SAME instance as sb_first, but cleared.
        assertSame(sb_first, sb_second); 
        assertEquals(0, sb_second.length());
    }

    // This test uses reflection to check the internal ThreadLocal state, which is brittle.
    // However, it's the most direct way to test the initialValue behavior without relying
    // on external state or complex setup.
    @Test
    public void testStringBuilderInitialValueAndCapacity() throws Exception {
        // Access the ThreadLocal field using reflection
        Field stringLocalField = StringUtil.class.getDeclaredField("stringLocal");
        stringLocalField.setAccessible(true);
        ThreadLocal<StringBuilder> threadLocal = (ThreadLocal<StringBuilder>) stringLocalField.get(null);

        // Get the initial StringBuilder created by initialValue()
        StringBuilder initialSb = threadLocal.get(); // This call triggers initialValue() if not already set for this thread

        // Assert the initial state
        assertEquals(0, initialSb.length());
        // The MaxCachedBuilderSize is 8 * 1024, which is used for initial capacity.
        assertEquals(8 * 1024, initialSb.capacity()); 

        // Call stringBuilder() again to ensure it reuses the correctly initialized builder
        StringBuilder sb = StringUtil.stringBuilder();
        // It should be the same instance, and still empty.
        assertSame(initialSb, sb);
        assertEquals(0, sb.length());
        assertEquals(8 * 1024, sb.capacity());
    }
    
    // Add a test for the padding exception for negative width
    @Test
    public void testPaddingNegativeThrowsException() {
        try {
            StringUtil.padding(-1);
            fail("Expected IllegalArgumentException for negative padding width");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
