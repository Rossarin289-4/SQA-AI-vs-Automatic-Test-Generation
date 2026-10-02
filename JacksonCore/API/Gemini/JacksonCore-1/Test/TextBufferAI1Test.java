package com.fasterxml.jackson.core.util;

import org.junit.Assert;
import org.junit.Test;

public class TextBufferAI1Test {

    @Test
    public void testLifeCycleAndEmpty() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        Assert.assertEquals(0, tb.size());
        Assert.assertEquals(0, tb.getTextOffset());
        Assert.assertTrue(tb.hasTextAsCharacters());

        tb.resetWithEmpty();
        Assert.assertEquals(0, tb.size());
        Assert.assertNull(tb.contentsAsString());
        
        tb.releaseBuffers();
    }

    @Test
    public void testResetWithShared() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);

        char[] data = "Hello World Shared".toCharArray();
        tb.resetWithShared(data, 6, 5);

        Assert.assertEquals(5, tb.size());
        Assert.assertEquals(6, tb.getTextOffset());
        Assert.assertTrue(tb.hasTextAsCharacters());
        Assert.assertEquals("World", tb.contentsAsString());
        Assert.assertArrayEquals(data, tb.getTextBuffer());
    }

    @Test
    public void testResetWithCopy() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);

        char[] data = "CopyThisData".toCharArray();
        tb.resetWithCopy(data, 4, 4);

        Assert.assertEquals(4, tb.size());
        Assert.assertEquals(0, tb.getTextOffset());
        Assert.assertEquals("This", tb.contentsAsString());
    }

    @Test
    public void testResetWithString() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);

        tb.resetWithString("StringValue");

        Assert.assertEquals(11, tb.size());
        Assert.assertFalse(tb.hasTextAsCharacters());
        Assert.assertEquals("StringValue", tb.contentsAsString());
        // getTextBuffer will convert String to result array and make it character-based
        char[] chars = tb.getTextBuffer();
        Assert.assertNotNull(chars);
        Assert.assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testAppendChar() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.append('b');
        tb.append('c');

        Assert.assertEquals(3, tb.size());
        Assert.assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArrayAndString() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "XYZ123".toCharArray();
        tb.append(src, 0, 3);
        tb.append("456789", 1, 3);

        Assert.assertEquals(6, tb.size());
        Assert.assertEquals("XYZ567", tb.contentsAsString());
    }

    @Test
    public void testSegmentsAndExpansion() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.getCurrentSegment();
        Assert.assertNotNull(seg);
        int initialLen = seg.length;

        tb.setCurrentLength(initialLen);
        tb.finishCurrentSegment();

        char[] nextSeg = tb.getCurrentSegment();
        Assert.assertNotNull(nextSeg);
        tb.append('Z');

        Assert.assertEquals(initialLen + 1, tb.size());
        char[] combined = tb.getTextBuffer();
        Assert.assertEquals(initialLen + 1, combined.length);
        Assert.assertEquals('Z', combined[combined.length - 1]);
    }

    @Test
    public void testExpandCurrentSegment() {
        TextBuffer tb = new TextBuffer(null);
        char[] curr = tb.getCurrentSegment();
        int oldLen = curr.length;
        char[] expanded = tb.expandCurrentSegment();
        Assert.assertTrue(expanded.length > oldLen);
    }

    @Test
    public void testEmptyAndGetCurrentSegment() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("test", 0, 4);
        char[] seg = tb.emptyAndGetCurrentSegment();
        Assert.assertNotNull(seg);
        Assert.assertEquals(0, tb.size());
    }

    @Test
    public void testEnsureNotShared() {
        TextBuffer tb = new TextBuffer(null);
        char[] data = "SharedContent".toCharArray();
        tb.resetWithShared(data, 0, data.length);
        Assert.assertEquals(data.length, tb.size());

        tb.ensureNotShared();
        tb.append('!');
        Assert.assertEquals(data.length + 1, tb.size());
        Assert.assertEquals("SharedContent!", tb.contentsAsString());
    }

    @Test
    public void testToStringAndNumberParsing() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("123.45", 0, 6);
        Assert.assertEquals("123.45", tb.toString());
        Assert.assertEquals(123.45, tb.contentsAsDouble(), 0.0001);
    }
}
