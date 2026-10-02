package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextBufferAI1Test {

    @Test
    public void testEmptyAndGetCurrentSegment() {
        TextBuffer textBuffer = new TextBuffer(null);
        char[] segment = textBuffer.emptyAndGetCurrentSegment();
        assertNotNull(segment);
        assertEquals(0, textBuffer.getCurrentSegmentSize());
    }

    @Test
    public void testResetWithSharedAndUnshare() {
        TextBuffer textBuffer = new TextBuffer(null);
        char[] shared = new char[] {'h', 'e', 'l', 'l', 'o'};
        textBuffer.resetWithShared(shared, 0, 5);
        
        char[] current = textBuffer.getCurrentSegment();
        assertNotNull(current);
        assertEquals(5, textBuffer.getCurrentSegmentSize());
    }

    @Test
    public void testSetCurrentLength() {
        TextBuffer textBuffer = new TextBuffer(null);
        textBuffer.emptyAndGetCurrentSegment();
        textBuffer.setCurrentLength(10);
        assertEquals(10, textBuffer.getCurrentSegmentSize());
    }
}
