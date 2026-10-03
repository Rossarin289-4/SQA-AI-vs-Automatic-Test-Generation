package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextBufferAI4Test {

    @Test
    public void testResetWithEmptyAndSize() {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithEmpty();
        assertEquals(0, buffer.size());
        assertEquals(0, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testEmptyAndGetCurrentSegment() {
        TextBuffer buffer = new TextBuffer(null);
        char[] seg = buffer.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertTrue(seg.length >= TextBuffer.MIN_SEGMENT_LEN);
        assertEquals(0, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testExpandCurrentSegmentWithMinSize() {
        TextBuffer buffer = new TextBuffer(null);
        buffer.emptyAndGetCurrentSegment();
        int minSize = 5000;
        char[] expanded = buffer.expandCurrentSegment(minSize);
        assertNotNull(expanded);
        assertTrue(expanded.length >= minSize);
    }
}
