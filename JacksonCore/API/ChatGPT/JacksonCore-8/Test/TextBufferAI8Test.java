package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextBufferAI8Test {

    @Test
    public void testResetWithEmptyAndSize() {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithEmpty();
        assertEquals(0, buffer.size());
        assertEquals(0, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testSetCurrentAndReturnEmpty() {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithEmpty();
        String result = buffer.setCurrentAndReturn(0);
        assertEquals("", result);
    }

    @Test
    public void testExpandCurrentSegmentWithMinSize() {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithEmpty();
        char[] seg = buffer.expandCurrentSegment(2000);
        assertNotNull(seg);
        assertTrue(seg.length >= 2000);
    }
}
