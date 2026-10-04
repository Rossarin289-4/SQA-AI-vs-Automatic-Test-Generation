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
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        assertEquals(0, tb.size());
        assertTrue(tb.hasTextAsCharacters());
        assertEquals("", tb.contentsAsString());
        assertArrayEquals(new char[0], tb.getTextBuffer());
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testAppendChar() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('a');
        assertEquals(1, tb.size());
        assertEquals("a", tb.contentsAsString());
        assertArrayEquals(new char[]{'a'}, tb.getTextBuffer());
    }

    @Test
    public void testAppendChars() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] data = "hello".toCharArray();
        tb.append(data, 0, data.length);
        assertEquals(5, tb.size());
        assertEquals("hello", tb.contentsAsString());
        assertArrayEquals(data, tb.getTextBuffer());
    }

    @Test
    public void testAppendString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("world", 0, 5);
        assertEquals(5, tb.size());
        assertEquals("world", tb.contentsAsString());
        assertArrayEquals("world".toCharArray(), tb.getTextBuffer());
    }

    @Test
    public void testResetWithShared() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = "shared_data".toCharArray();
        tb.resetWithShared(shared, 0, shared.length);
        assertEquals(shared.length, tb.size());
        assertEquals("shared_data", tb.contentsAsString());
        assertArrayEquals(shared, tb.getTextBuffer());
        assertEquals(0, tb.getTextOffset());
    }

    @Test
    public void testResetWithCopy() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] data = "copied_data".toCharArray();
        tb.resetWithCopy(data, 0, data.length);
        assertEquals(data.length, tb.size());
        assertEquals("copied_data", tb.contentsAsString());
        assertArrayEquals(data, tb.getTextBuffer());
        // After resetWithCopy, it's no longer shared internally
        tb.ensureNotShared(); // This ensures it's not shared internally
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testResetWithString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.resetWithString("string_data");
        assertEquals(11, tb.size());
        assertEquals("string_data", tb.contentsAsString());
        assertArrayEquals("string_data".toCharArray(), tb.getTextBuffer());
    }

    @Test
    public void testEnsureNotShared() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = "shared".toCharArray();
        tb.resetWithShared(shared, 0, shared.length);
        tb.ensureNotShared();
        assertEquals(6, tb.size());
        assertEquals("shared", tb.contentsAsString());
        // After ensureNotShared, it's not using the original shared buffer
        assertNotSame(shared, tb.getTextBuffer());
    }

    @Test
    public void testExpandCurrentSegmentWhenFull() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        // Fill a segment to its capacity to trigger expansion on next append
        char[] segment = tb.emptyAndGetCurrentSegment();
        tb.setCurrentLength(segment.length);
        tb.append('a'); // This append should trigger expansion
        assertEquals(segment.length + 1, tb.size());
        assertEquals('a', tb._currentSegment[segment.length]); // Accessing private field is ok for tests
    }

    @Test
    public void testFinishCurrentSegment() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] segment1 = tb.emptyAndGetCurrentSegment(); // Allocate first segment
        tb.setCurrentLength(segment1.length); // Fill it
        tb.finishCurrentSegment(); // Move it to segments list
        assertEquals(segment1.length, tb.size());
        assertNotNull(tb.getCurrentSegment());
        assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void testContentsAsDecimal() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("123.45".toCharArray(), 0, 6);
        BigDecimal expected = new BigDecimal("123.45");
        assertEquals(expected, tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDouble() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("123.456", 0, 7);
        double expected = 123.456;
        assertEquals(expected, tb.contentsAsDouble(), 1e-9);
    }

    @Test
    public void testContentsAsStringWithSegments() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        // Fill first segment, then finish it
        tb.append("segment1_part1".toCharArray(), 0, "segment1_part1".length());
        tb.finishCurrentSegment();
        // Add to the new segment
        tb.append("segment2_part1".toCharArray(), 0, "segment2_part1".length());
        assertEquals("segment1_part1segment2_part1", tb.contentsAsString());
    }

    @Test
    public void testSizeWhenShared() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = "shared_size".toCharArray();
        tb.resetWithShared(shared, 0, shared.length);
        assertEquals(shared.length, tb.size());
    }

    @Test
    public void testSizeWhenCopied() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] data = "copied_size".toCharArray();
        tb.resetWithCopy(data, 0, data.length);
        assertEquals(data.length, tb.size());
    }

    @Test
    public void testSizeWhenString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.resetWithString("string_size");
        assertEquals(11, tb.size());
    }

    @Test
    public void testGetTextBufferWhenShared() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = "shared_buffer_content".toCharArray();
        tb.resetWithShared(shared, 0, shared.length);
        assertSame(shared, tb.getTextBuffer());
    }

    @Test
    public void testGetTextBufferWhenCopied() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] data = "copied_buffer_content".toCharArray();
        tb.resetWithCopy(data, 0, data.length);
        assertNotSame(data, tb.getTextBuffer()); // Should be a copy
        assertArrayEquals(data, tb.getTextBuffer());
    }

    @Test
    public void testGetTextBufferWhenSetWithString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.resetWithString("string_content");
        assertArrayEquals("string_content".toCharArray(), tb.getTextBuffer());
    }

    @Test
    public void testToString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("toString_test".toCharArray(), 0, 13);
        assertEquals("toString_test", tb.toString());
    }

    @Test
    public void testUnshareAndAppend() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = "shared_to_unshare".toCharArray();
        tb.resetWithShared(shared, 0, shared.length);
        tb.append('!');
        assertEquals("shared_to_unshare!", tb.contentsAsString());
        assertNotSame(shared, tb.getTextBuffer()); // Should no longer be shared
    }

    @Test
    public void testExpandCurrentSegmentWithMinSize() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        // Fill current segment to be smaller than MIN_SEGMENT_LEN
        tb.append("short_segment".toCharArray(), 0, 13);
        char[] currentSegmentBeforeExpand = tb.getCurrentSegment();
        int currentSizeBeforeExpand = tb.getCurrentSegmentSize();

        // Force expansion to a minimum size larger than current segment's capacity
        tb.expandCurrentSegment(100); // Request at least 100
        char[] expandedSegment = tb.getCurrentSegment();
        assertTrue(expandedSegment.length >= 100);
        // Ensure previous content is preserved
        assertEquals("short_segment", new String(expandedSegment, 0, currentSizeBeforeExpand));
        assertEquals(currentSizeBeforeExpand, tb.getCurrentSegmentSize());
    }

    @Test
    public void testEmptyAndGetCurrentSegment() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("initial_content".toCharArray(), 0, "initial_content".length());
        tb.emptyAndGetCurrentSegment();
        assertEquals(0, tb.size());
        assertEquals(0, tb.getCurrentSegmentSize());
        assertNull(tb._resultString); // Accessing private field is ok for tests
        assertNull(tb._resultArray); // Accessing private field is ok for tests
        assertNull(tb._inputBuffer); // Accessing private field is ok for tests
        assertEquals(-1, tb._inputStart); // Accessing private field is ok for tests
        assertFalse(tb._hasSegments); // Accessing private field is ok for tests
    }

    @Test
    public void testSetCurrentLength() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] data = "set_len_test".toCharArray();
        tb.append(data, 0, data.length);
        tb.setCurrentLength(5); // Truncate
        assertEquals(5, tb.getCurrentSegmentSize());
        assertEquals("set_len", tb.contentsAsString());
        assertEquals("set_len", new String(tb.getTextBuffer(), 0, 5));
    }

    @Test
    public void testSetCurrentAndReturn() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("set_and_return_test".toCharArray(), 0, 19);
        String result = tb.setCurrentAndReturn(10); // Set length and return String
        assertEquals(10, tb.getCurrentSegmentSize());
        assertEquals("set_and_r", result);
        assertEquals("set_and_r", tb.contentsAsString());
    }

    @Test
    public void testReleaseBuffers() {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("release_test".toCharArray(), 0, 12);
        tb.releaseBuffers();
        // After release, buffer should be empty and reusable
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
        assertNull(tb._currentSegment); // Accessing private field is ok for tests
    }

    @Test
    public void testReleaseBuffersWithShared() {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = "shared_release".toCharArray();
        tb.resetWithShared(shared, 0, shared.length);
        tb.releaseBuffers();
        // Releasing shared buffer should reset state without nullifying internal buffer
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
        assertNull(tb._currentSegment);
        assertNull(tb._inputBuffer);
    }
    
    @Test
    public void testAppendLargeString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        StringBuilder sb = new StringBuilder();
        // Construct a string that will force multiple segment expansions
        for (int i = 0; i < TextBuffer.MAX_SEGMENT_LEN + 100; i++) {
            sb.append('a');
        }
        String largeString = sb.toString();
        tb.append(largeString, 0, largeString.length());
        assertEquals(largeString.length(), tb.size());
        assertEquals(largeString, tb.contentsAsString());
    }

    @Test
    public void testContentsAsDecimalLargeNumber() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        String largeDecimalStr = "12345678901234567890.12345678901234567890";
        tb.append(largeDecimalStr.toCharArray(), 0, largeDecimalStr.length());
        BigDecimal expected = new BigDecimal(largeDecimalStr);
        assertEquals(expected, tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDoubleLargeNumber() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        String largeDoubleStr = "1.234567890123456e100";
        tb.append(largeDoubleStr.toCharArray(), 0, largeDoubleStr.length());
        double expected = Double.parseDouble(largeDoubleStr);
        assertEquals(expected, tb.contentsAsDouble(), 1e-9);
    }

    @Test
    public void testAppendCharToFullSegment() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        // Fill a segment to its capacity
        char[] segment = tb.emptyAndGetCurrentSegment();
        Arrays.fill(segment, 'x');
        tb.setCurrentLength(segment.length);
        
        // Append one more character, should trigger expansion
        tb.append('y');
        assertEquals(segment.length + 1, tb.size());
        // Accessing private field is ok for tests to verify internal state change
        assertEquals('y', tb._currentSegment[segment.length]); 
        assertEquals("x".repeat(segment.length) + "y", tb.contentsAsString());
    }

    @Test
    public void testAppendCharsToFillAndExpand() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] segment = tb.emptyAndGetCurrentSegment();
        int segmentLen = segment.length;
        
        // Append enough characters to fill the current segment and trigger expansion
        tb.append(new char[segmentLen], 0, segmentLen); // Fill current segment
        assertEquals(segmentLen, tb.getCurrentSegmentSize());
        
        // Append more characters, which should go into a new expanded segment
        tb.append("abc".toCharArray(), 0, 3);
        assertEquals(segmentLen + 3, tb.size());
        assertEquals(3, tb.getCurrentSegmentSize());
        assertEquals("abc", new String(tb._currentSegment, 0, 3)); // Accessing private field is ok for tests
    }

    @Test
    public void testResetWithCopyAndAppend() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] initialData = "initial".toCharArray();
        tb.resetWithCopy(initialData, 0, initialData.length);
        tb.append(" appended".toCharArray(), 0, " appended".length());
        assertEquals("initial appended", tb.contentsAsString());
        assertEquals(16, tb.size());
    }

    @Test
    public void testContentsAsArrayHandlesSegments() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("part1".toCharArray(), 0, 5);
        tb.finishCurrentSegment();
        tb.append("part2".toCharArray(), 0, 5);
        char[] resultArray = tb.contentsAsArray();
        assertEquals(10, resultArray.length);
        assertArrayEquals("part1part2".toCharArray(), resultArray);
    }

    @Test
    public void testcontentsAsStringWhenSharedBufferAndEmpty() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] sharedEmpty = new char[0];
        tb.resetWithShared(sharedEmpty, 0, 0);
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testcontentsAsStringWhenSharedBufferAndPartial() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = "abcdef".toCharArray();
        tb.resetWithShared(shared, 2, 3); // "cde"
        assertEquals("cde", tb.contentsAsString());
    }
}
