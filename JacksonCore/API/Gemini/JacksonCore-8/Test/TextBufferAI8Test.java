package com.fasterxml.jackson.core.util;

import org.junit.Assert;
import org.junit.Test;

public class TextBufferAI8Test {

    @Test
    public void testInitialState() {
        TextBuffer tb = new TextBuffer(null);
        Assert.assertEquals(0, tb.size());
        Assert.assertEquals(0, tb.getTextOffset());
        Assert.assertTrue(tb.hasTextAsCharacters());
        Assert.assertEquals("", tb.contentsAsString());
        Assert.assertEquals("", tb.toString());
    }

    @Test
    public void testResetWithEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('a');
        tb.append('b');
        Assert.assertEquals(2, tb.size());

        tb.resetWithEmpty();
        Assert.assertEquals(0, tb.size());
        Assert.assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testResetWithShared() {
        TextBuffer tb = new TextBuffer(null);
        char[] data = {'x', 'y', 'z', '1', '2', '3'};
        tb.resetWithShared(data, 1, 3);

        Assert.assertEquals(3, tb.size());
        Assert.assertEquals(1, tb.getTextOffset());
        Assert.assertTrue(tb.hasTextAsCharacters());
        Assert.assertEquals("yz1", tb.contentsAsString());
        Assert.assertArrayEquals(data, tb.getTextBuffer());
    }

    @Test
    public void testResetWithCopy() {
        TextBuffer tb = new TextBuffer(null);
        char[] data = {'h', 'e', 'l', 'l', 'o'};
        tb.resetWithCopy(data, 0, 5);

        Assert.assertEquals(5, tb.size());
        Assert.assertEquals("hello", tb.contentsAsString());
        Assert.assertNotSame(data, tb.getTextBuffer());
    }

    @Test
    public void testResetWithString() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("jackson");

        Assert.assertEquals(7, tb.size());
        Assert.assertEquals(0, tb.getTextOffset());
        Assert.assertFalse(tb.hasTextAsCharacters());
        Assert.assertEquals("jackson", tb.contentsAsString());
        Assert.assertArrayEquals(new char[]{'j', 'a', 'c', 'k', 's', 'o', 'n'}, tb.getTextBuffer());
        Assert.assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testAppendCharAndString() {
        TextBuffer tb = new TextBuffer(null);
        tb.append('A');
        tb.append("BCD", 0, 3);
        tb.append(new char[]{'E', 'F'}, 0, 2);

        Assert.assertEquals(6, tb.size());
        Assert.assertEquals("ABCDEF", tb.contentsAsString());
    }

    @Test
    public void testCurrentSegmentOperations() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.getCurrentSegment();
        Assert.assertNotNull(seg);
        Assert.assertTrue(seg.length >= TextBuffer.MIN_SEGMENT_LEN);

        seg[0] = 'H';
        seg[1] = 'i';
        tb.setCurrentLength(2);
        Assert.assertEquals(2, tb.getCurrentSegmentSize());
        Assert.assertEquals("Hi", tb.setCurrentAndReturn(2));
    }

    @Test
    public void testEmptyAndGetCurrentSegment() {
        TextBuffer tb = new TextBuffer(null);
        tb.append(new char[]{'t', 'e', 's', 't'}, 0, 4);
        char[] seg = tb.emptyAndGetCurrentSegment();
        Assert.assertNotNull(seg);
        Assert.assertEquals(0, tb.size());
        Assert.assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testFinishCurrentSegmentAndExpand() {
        TextBuffer tb = new TextBuffer(null);
        char[] first = tb.getCurrentSegment();
        tb.append('X');
        char[] second = tb.finishCurrentSegment();
        Assert.assertNotNull(second);
        Assert.assertNotSame(first, second);
        Assert.assertEquals(0, tb.getCurrentSegmentSize());

        char[] expanded = tb.expandCurrentSegment();
        Assert.assertNotNull(expanded);

        char[] minExpanded = tb.expandCurrentSegment(2000);
        Assert.assertTrue(minExpanded.length >= 2000);
    }

    @Test
    public void testReleaseBuffers() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        char[] longText = new char[1500];
        for (int i = 0; i < longText.length; i++) {
            longText[i] = 'a';
        }
        tb.append(longText, 0, longText.length);
        tb.releaseBuffers();
        Assert.assertEquals(0, tb.size());
    }
}
