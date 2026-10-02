package com.fasterxml.jackson.core.util;

import org.junit.Assert;
import org.junit.Test;

public class TextBufferAI4Test {

    @Test
    public void testLifeCycleAndEmptyBuffer() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer buffer = new TextBuffer(recycler);
        
        Assert.assertEquals(0, buffer.size());
        Assert.assertEquals(0, buffer.getTextOffset());
        Assert.assertTrue(buffer.hasTextAsCharacters());
        Assert.assertEquals("", buffer.contentsAsString());
        Assert.assertEquals("", buffer.toString());
        
        buffer.releaseBuffers();
        Assert.assertEquals(0, buffer.size());
    }

    @Test
    public void testResetWithShared() {
        TextBuffer buffer = new TextBuffer(null);
        char[] shared = new char[] { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };
        
        buffer.resetWithShared(shared, 6, 5);
        Assert.assertEquals(5, buffer.size());
        Assert.assertEquals(6, buffer.getTextOffset());
        Assert.assertTrue(buffer.hasTextAsCharacters());
        Assert.assertEquals("World", buffer.contentsAsString());
        
        char[] textBuffer = buffer.getTextBuffer();
        Assert.assertSame(shared, textBuffer);
        
        buffer.releaseBuffers();
    }

    @Test
    public void testResetWithCopy() {
        TextBuffer buffer = new TextBuffer(null);
        char[] source = new char[] { 'F', 'o', 'o', 'B', 'a', 'r' };
        
        buffer.resetWithCopy(source, 3, 3);
        Assert.assertEquals(3, buffer.size());
        Assert.assertEquals(0, buffer.getTextOffset());
        Assert.assertEquals("Bar", buffer.contentsAsString());
        
        char[] textBuffer = buffer.getTextBuffer();
        Assert.assertNotSame(source, textBuffer);
    }

    @Test
    public void testResetWithString() {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithString("Jackson");
        
        Assert.assertEquals(7, buffer.size());
        Assert.assertEquals(0, buffer.getTextOffset());
        Assert.assertFalse(buffer.hasTextAsCharacters());
        Assert.assertEquals("Jackson", buffer.contentsAsString());
        
        // Accessing text buffer should convert string to array
        char[] textBuffer = buffer.getTextBuffer();
        Assert.assertNotNull(textBuffer);
        Assert.assertTrue(buffer.hasTextAsCharacters());
        Assert.assertEquals("Jackson", new String(textBuffer));
    }

    @Test
    public void testAppendCharAndString() {
        TextBuffer buffer = new TextBuffer(null);
        buffer.append('A');
        buffer.append("BC", 0, 2);
        buffer.append(new char[] { 'D', 'E' }, 0, 2);
        
        Assert.assertEquals(5, buffer.size());
        Assert.assertEquals("ABCDE", buffer.contentsAsString());
    }

    @Test
    public void testLargeAppendAndSegments() {
        TextBuffer buffer = new TextBuffer(null);
        // Append enough characters to trigger segment expansion / multiple segments
        int totalLen = TextBuffer.MIN_SEGMENT_LEN + 500;
        char[] largeData = new char[totalLen];
        for (int i = 0; i < totalLen; i++) {
            largeData[i] = (char) ('a' + (i % 26));
        }
        
        buffer.append(largeData, 0, totalLen);
        Assert.assertEquals(totalLen, buffer.size());
        Assert.assertEquals(new String(largeData), buffer.contentsAsString());
    }

    @Test
    public void testEnsureNotSharedAndUnshare() {
        TextBuffer buffer = new TextBuffer(null);
        char[] shared = new char[] { 'T', 'e', 's', 't' };
        buffer.resetWithShared(shared, 0, 4);
        
        buffer.ensureNotShared();
        Assert.assertEquals("Test", buffer.contentsAsString());
        
        // Mutating after unshare should work independently
        buffer.append('s');
        Assert.assertEquals("Tests", buffer.contentsAsString());
    }

    @Test
    public void testRawSegmentAccess() {
        TextBuffer buffer = new TextBuffer(null);
        char[] curr = buffer.emptyAndGetCurrentSegment();
        Assert.assertNotNull(curr);
        Assert.assertEquals(0, buffer.getCurrentSegmentSize());
        
        curr[0] = 'X';
        curr[1] = 'Y';
        buffer.setCurrentLength(2);
        Assert.assertEquals(2, buffer.size());
        
        char[] finished = buffer.finishCurrentSegment();
        Assert.assertNotNull(finished);
        
        char[] expanded = buffer.expandCurrentSegment();
        Assert.assertNotNull(expanded);
        
        char[] expandedMin = buffer.expandCurrentSegment(2000);
        Assert.assertTrue(expandedMin.length >= 2000);
    }
}
