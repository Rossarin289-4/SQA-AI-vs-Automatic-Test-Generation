package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import com.fasterxml.jackson.core.io.NumberInput;

public class TextBufferTest {
    @Test
    public void testEmptyBuffer() throws Exception {
        TextBuffer b = new TextBuffer(null);
        assertEquals(0, b.size());
        assertEquals("", b.contentsAsString());
        assertEquals(0, b.getTextOffset());
    }

    @Test
    public void testSharedBufferOffsetAndText() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] source = "xtext!".toCharArray();
        b.resetWithShared(source, 1, 4);
        assertEquals(4, b.size());
        assertEquals(1, b.getTextOffset());
        assertEquals("text", b.contentsAsString());
        assertSame(source, b.getTextBuffer());
    }

    @Test
    public void testSharedEmptyContent() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithShared("abc".toCharArray(), 2, 0);
        assertEquals(0, b.size());
        assertEquals("", b.contentsAsString());
        assertEquals(2, b.getTextOffset());
    }

    @Test
    public void testCopyReset() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithCopy("012345".toCharArray(), 2, 3);
        assertEquals(3, b.size());
        assertEquals("234", b.contentsAsString());
        assertEquals(0, b.getTextOffset());
    }

    @Test
    public void testResetWithStringAndCharacterAccess() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithString("word");
        assertEquals(4, b.size());
        assertFalse(b.hasTextAsCharacters());
        assertEquals("word", b.contentsAsString());
        assertEquals("word", new String(b.getTextBuffer()));
        assertTrue(b.hasTextAsCharacters());
    }

    @Test
    public void testAppendCharacter() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithEmpty();
        b.getCurrentSegment();
        b.append('Q');
        assertEquals(1, b.size());
        assertEquals("Q", b.contentsAsString());
    }

    @Test
    public void testAppendArray() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithEmpty();
        b.getCurrentSegment();
        char[] input = "abXYZ".toCharArray();
        b.append(input, 2, 3);
        assertEquals("XYZ", b.contentsAsString());
        assertEquals(3, b.size());
    }

    @Test
    public void testAppendString() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithEmpty();
        b.getCurrentSegment();
        b.append("cdef", 1, 2);
        assertEquals("de", b.contentsAsString());
        assertEquals(2, b.size());
    }

    @Test
    public void testAppendAcrossSegments() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] data = new char[1001];
        Arrays.fill(data, 'a');
        b.append(data, 0, data.length);
        assertEquals(1001, b.size());
        assertEquals(1001, b.contentsAsString().length());
        assertEquals('a', b.contentsAsString().charAt(1000));
    }

    @Test
    public void testUnshareBeforeAppend() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] source = "abc".toCharArray();
        b.resetWithShared(source, 0, source.length);
        b.append('d');
        assertEquals("abcd", b.contentsAsString());
        assertEquals("abc", new String(source));
        assertEquals(0, b.getTextOffset());
    }

    @Test
    public void testEnsureNotSharedCopiesText() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithShared("data".toCharArray(), 0, 4);
        b.ensureNotShared();
        assertEquals("data", b.contentsAsString());
        assertEquals(0, b.getTextOffset());
        assertEquals(4, b.size());
    }

    @Test
    public void testContentsArrayAndString() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithString("array");
        assertEquals("array", new String(b.contentsAsArray()));
        assertEquals("array", b.contentsAsString());
        assertEquals(5, b.size());
    }

    @Test
    public void testDecimalFromSharedSlice() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithShared("x12.50y".toCharArray(), 1, 5);
        assertEquals(new BigDecimal("12.50"), b.contentsAsDecimal());
    }

    @Test
    public void testDoubleFromAppendedText() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithString("1.25");
        assertEquals(1.25, b.contentsAsDouble(), 1e-9);
    }

    @Test
    public void testEmptyAndGetCurrentSegmentClears() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithString("old");
        char[] segment = b.emptyAndGetCurrentSegment();
        assertEquals(0, b.size());
        assertEquals("", b.contentsAsString());
        segment[0] = 'N';
        b.setCurrentLength(1);
        assertEquals("N", b.setCurrentAndReturn(1));
    }

    @Test
    public void testCurrentSegmentAndSetLength() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] segment = b.getCurrentSegment();
        segment[0] = 'a';
        segment[1] = 'b';
        b.setCurrentLength(2);
        assertEquals(2, b.getCurrentSegmentSize());
        assertEquals("ab", b.contentsAsString());
    }

    @Test
    public void testSetCurrentAndReturn() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] segment = b.getCurrentSegment();
        segment[0] = 'z';
        assertEquals("z", b.setCurrentAndReturn(1));
        assertEquals("z", b.contentsAsString());
        assertEquals(1, b.size());
    }

    @Test
    public void testFinishCurrentSegmentPreservesContents() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] first = b.getCurrentSegment();
        Arrays.fill(first, 'a');
        b.setCurrentLength(first.length);
        char[] next = b.finishCurrentSegment();
        next[0] = 'b';
        b.setCurrentLength(1);
        assertEquals(1001, b.size());
        String result = b.contentsAsString();
        assertEquals(1001, result.length());
        assertEquals('a', result.charAt(999));
        assertEquals('b', result.charAt(1000));
    }

    @Test
    public void testExpandCurrentSegmentAtLeastRequestedSize() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] original = b.getCurrentSegment();
        char[] expanded = b.expandCurrentSegment(1001);
        assertTrue(expanded.length >= 1001);
        assertEquals(original.length, 1000);
    }

    @Test
    public void testExpandCurrentSegmentPreservesContents() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] original = b.getCurrentSegment();
        original[0] = 'k';
        char[] expanded = b.expandCurrentSegment();
        assertTrue(expanded.length > original.length);
        assertEquals('k', expanded[0]);
    }

    @Test
    public void testResetWithEmptyAfterSegments() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] data = new char[1001];
        Arrays.fill(data, 'r');
        b.append(data, 0, data.length);
        b.resetWithEmpty();
        assertEquals(0, b.size());
        assertEquals("", b.contentsAsString());
        assertEquals(0, b.getTextOffset());
    }

    @Test
    public void testReleaseBuffersWithoutAllocator() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithString("gone");
        b.releaseBuffers();
        assertEquals(0, b.size());
        assertEquals("", b.contentsAsString());
    }
}
