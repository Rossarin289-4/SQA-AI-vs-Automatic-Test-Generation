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
        assertArrayEquals(new char[0], b.contentsAsArray());
    }

    @Test
    public void testSharedSliceOffsetAndText() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithShared("xabc!".toCharArray(), 1, 3);
        assertEquals(3, b.size());
        assertEquals(1, b.getTextOffset());
        assertEquals("abc", b.contentsAsString());
        assertEquals("xabc!".charAt(0), b.getTextBuffer()[0]);
    }

    @Test
    public void testSharedEmptySlice() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithShared("xyz".toCharArray(), 2, 0);
        assertEquals(0, b.size());
        assertEquals(2, b.getTextOffset());
        assertEquals("", b.contentsAsString());
    }

    @Test
    public void testCopySlice() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithCopy("!cat?".toCharArray(), 1, 3);
        assertEquals(3, b.size());
        assertEquals(0, b.getTextOffset());
        assertEquals("cat", b.contentsAsString());
        assertArrayEquals(new char[] {'c', 'a', 't'}, b.contentsAsArray());
    }

    @Test
    public void testResetWithStringAndCharacterAccess() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithString("word");
        assertEquals(4, b.size());
        assertFalse(b.hasTextAsCharacters());
        assertArrayEquals(new char[] {'w', 'o', 'r', 'd'}, b.getTextBuffer());
        assertTrue(b.hasTextAsCharacters());
    }

    @Test
    public void testAppendCharacter() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithCopy(new char[] {'a'}, 0, 1);
        b.append('b');
        assertEquals(2, b.size());
        assertEquals("ab", b.contentsAsString());
    }

    @Test
    public void testAppendCharacterArray() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithCopy(new char[] {'a'}, 0, 1);
        char[] chars = {'b', 'c', 'd'};
        b.append(chars, 1, 2);
        assertEquals("acd", b.contentsAsString());
        assertEquals(3, b.size());
    }

    @Test
    public void testAppendStringSlice() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithCopy(new char[] {'a'}, 0, 1);
        b.append("!bc?", 1, 2);
        assertEquals("abc", b.contentsAsString());
        assertEquals(3, b.size());
    }

    @Test
    public void testAppendBeyondInitialSegment() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] chars = new char[1001];
        Arrays.fill(chars, 'q');
        b.append(chars, 0, chars.length);
        assertEquals(1001, b.size());
        assertEquals(1001, b.contentsAsString().length());
        assertEquals('q', b.contentsAsString().charAt(1000));
        assertEquals('q', b.contentsAsArray()[1000]);
    }

    @Test
    public void testEnsureNotSharedPreservesContents() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithShared("!hey?".toCharArray(), 1, 3);
        b.ensureNotShared();
        assertEquals("hey", b.contentsAsString());
        assertEquals(3, b.size());
        assertEquals(0, b.getTextOffset());
    }

    @Test
    public void testAppendToSharedBuffer() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithShared("!hi?".toCharArray(), 1, 2);
        b.append('!');
        assertEquals("hi!", b.contentsAsString());
        assertEquals(3, b.size());
        assertEquals(0, b.getTextOffset());
    }

    @Test
    public void testGetCurrentSegmentAndSetLength() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] current = b.getCurrentSegment();
        current[0] = 'm';
        current[1] = 'n';
        b.setCurrentLength(2);
        assertEquals(2, b.getCurrentSegmentSize());
        assertEquals("mn", b.contentsAsString());
    }

    @Test
    public void testEmptyAndGetCurrentSegmentClearsContents() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithString("old");
        char[] current = b.emptyAndGetCurrentSegment();
        current[0] = 'n';
        b.setCurrentLength(1);
        assertEquals(1, b.size());
        assertEquals("n", b.contentsAsString());
    }

    @Test
    public void testFinishCurrentSegmentCombinesContents() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] current = b.getCurrentSegment();
        current[0] = 'a';
        b.setCurrentLength(1);
        b.finishCurrentSegment();
        char[] next = b.getCurrentSegment();
        next[0] = 'b';
        b.setCurrentLength(1);
        assertEquals(1001, b.size());
        assertEquals("a", b.contentsAsString().substring(0, 1));
        assertEquals('b', b.contentsAsString().charAt(1000));
        assertEquals(1001, b.contentsAsArray().length);
    }

    @Test
    public void testExpandCurrentSegmentMinimumAndContents() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] current = b.getCurrentSegment();
        current[0] = 'z';
        char[] expanded = b.expandCurrentSegment(1001);
        assertEquals(1001, expanded.length);
        assertEquals('z', expanded[0]);
    }

    @Test
    public void testExpandCurrentSegment() throws Exception {
        TextBuffer b = new TextBuffer(null);
        char[] current = b.getCurrentSegment();
        char[] expanded = b.expandCurrentSegment();
        assertEquals(1500, expanded.length);
        assertEquals(current[0], expanded[0]);
    }

    @Test
    public void testDecimalAndDoubleFromText() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithString("12.50");
        assertEquals(new BigDecimal("12.50"), b.contentsAsDecimal());
        assertEquals(12.5, b.contentsAsDouble(), 1e-9);
    }

    @Test
    public void testDecimalAndDoubleAfterAppending() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithCopy(new char[] {'1'}, 0, 1);
        b.append("2.25", 0, 4);
        assertEquals(new BigDecimal("12.25"), b.contentsAsDecimal());
        assertEquals(12.25, b.contentsAsDouble(), 1e-9);
    }

    @Test
    public void testResetWithEmptyAfterContents() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithString("gone");
        b.resetWithEmpty();
        assertEquals(0, b.size());
        assertEquals("", b.toString());
        assertEquals(0, b.getTextOffset());
    }

    @Test
    public void testReleaseBuffersWithoutAllocatorClears() throws Exception {
        TextBuffer b = new TextBuffer(null);
        b.resetWithString("gone");
        b.releaseBuffers();
        assertEquals(0, b.size());
        assertEquals("", b.contentsAsString());
    }
}
