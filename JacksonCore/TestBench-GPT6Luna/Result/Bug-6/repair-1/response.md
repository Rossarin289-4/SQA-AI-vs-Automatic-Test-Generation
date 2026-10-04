```java
package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.io.NumberInput;

public class JsonPointerTest {
    @Test
    public void testCompileNullIsEmptyPointer() throws Exception {
        JsonPointer p = JsonPointer.compile(null);
        assertEquals("", p.toString());
        assertTrue(p.matches());
        assertEquals("", p.getMatchingProperty());
        assertEquals(-1, p.getMatchingIndex());
    }

    @Test
    public void testCompileEmptyIsEmptyPointer() throws Exception {
        JsonPointer p = JsonPointer.compile("");
        assertEquals("", p.toString());
        assertTrue(p.matches());
        assertNull(p.tail());
    }

    @Test
    public void testCompileRequiresLeadingSlash() throws Exception {
        try {
            JsonPointer.compile("a");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCompileOneSegment() throws Exception {
        JsonPointer p = JsonPointer.compile("/name");
        assertEquals("/name", p.toString());
        assertFalse(p.matches());
        assertEquals("name", p.getMatchingProperty());
        assertEquals(-1, p.getMatchingIndex());
        assertTrue(p.mayMatchProperty());
        assertFalse(p.mayMatchElement());
        assertTrue(p.tail().matches());
    }

    @Test
    public void testCompileMultipleSegmentsAndTail() throws Exception {
        JsonPointer p = JsonPointer.compile("/a/b");
        assertEquals("a", p.getMatchingProperty());
        assertEquals("/b", p.tail().toString());
        assertEquals("b", p.tail().getMatchingProperty());
        assertTrue(p.tail().tail().matches());
    }

    @Test
    public void testEscapedTildeAndSlash() throws Exception {
        JsonPointer p = JsonPointer.compile("/a~0b~1c");
        assertEquals("a~b/c", p.getMatchingProperty());
        assertEquals("/a~0b~1c", p.toString());
    }

    @Test
    public void testUnknownEscapeRetainsTilde() throws Exception {
        JsonPointer p = JsonPointer.compile("/a~2b");
        assertEquals("a~2b", p.getMatchingProperty());
    }

    @Test
    public void testTrailingTildeRetained() throws Exception {
        JsonPointer p = JsonPointer.compile("/a~");
        assertEquals("a~", p.getMatchingProperty());
    }

    @Test
    public void testEmptySegmentAndTrailingSlash() throws Exception {
        JsonPointer p = JsonPointer.compile("//");
        assertEquals("", p.getMatchingProperty());
        assertEquals("/", p.tail().toString());
        assertEquals("", p.tail().getMatchingProperty());
        assertTrue(p.tail().tail().matches());
    }

    @Test
    public void testValueOfAliasesCompile() throws Exception {
        assertEquals(JsonPointer.compile("/x/y"), JsonPointer.valueOf("/x/y"));
        assertEquals("", JsonPointer.valueOf(null).toString());
    }

    @Test
    public void testIndexZeroAndMatchingElement() throws Exception {
        JsonPointer p = JsonPointer.compile("/0");
        assertEquals(0, p.getMatchingIndex());
        assertTrue(p.mayMatchElement());
        assertSame(p.tail(), p.matchElement(0));
        assertNull(p.matchElement(-1));
        assertNull(p.matchElement(1));
    }

    @Test
    public void testLargestIntIndexAndFirstOverflowingIndex() throws Exception {
        JsonPointer fits = JsonPointer.compile("/2147483647");
        JsonPointer over = JsonPointer.compile("/2147483648");
        assertEquals(Integer.MAX_VALUE, fits.getMatchingIndex());
        assertEquals(-1, over.getMatchingIndex());
        assertFalse(over.mayMatchElement());
    }

    @Test
    public void testTenDigitIndexLimitAndBeyond() throws Exception {
        JsonPointer fits = JsonPointer.compile("/999999999");
        JsonPointer tooLarge = JsonPointer.compile("/9999999999");
        assertEquals(999999999, fits.getMatchingIndex());
        assertEquals(-1, tooLarge.getMatchingIndex());
    }

    @Test
    public void testIndexFormattingBoundaries() throws Exception {
        assertEquals(-1, JsonPointer.compile("/00").getMatchingIndex());
        assertEquals(-1, JsonPointer.compile("/01").getMatchingIndex());
        assertEquals(-1, JsonPointer.compile("/-1").getMatchingIndex());
        assertEquals(-1, JsonPointer.compile("/+1").getMatchingIndex());
    }

    @Test
    public void testMatchPropertyRequiresNonterminalSegment() throws Exception {
        JsonPointer p = JsonPointer.compile("/a/b");
        assertSame(p.tail(), p.matchProperty("a"));
        assertNull(p.matchProperty("A"));
        assertNull(JsonPointer.compile("/a").matchProperty("a"));
    }

    @Test
    public void testMatchElementRejectsNegativeAndMismatchedIndices() throws Exception {
        JsonPointer p = JsonPointer.compile("/2/x");
        assertSame(p.tail(), p.matchElement(2));
        assertNull(p.matchElement(1));
        assertNull(p.matchElement(-2));
    }

    @Test
    public void testEqualsHashCodeAndStringRepresentation() throws Exception {
        JsonPointer p = JsonPointer.compile("/a~1b");
        JsonPointer same = JsonPointer.valueOf("/a~1b");
        assertEquals("/a~1b", p.toString());
        assertEquals(p, same);
        assertEquals(p.hashCode(), same.hashCode());
        assertFalse(p.equals(JsonPointer.compile("/a/b")));
        assertFalse(p.equals(null));
        assertFalse(p.equals("pointer"));
    }
}
```