package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import com.fasterxml.jackson.core.io.NumberInput;

public class TextBufferTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorAndReleaseBuffers() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.releaseBuffers();
        assertEquals(0, tb.size());
        assertTrue(tb.hasTextAsCharacters()); // Initially, it's empty, so it has text characters (none)
    }

    @Test
    public void testResetWithEmpty() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('a');
        tb.resetWithEmpty();
        assertEquals(0, tb.size());
        assertTrue(tb.hasTextAsCharacters());
        assertNotNull(tb.getTextBuffer());
    }

    @Test
    public void testResetWithSharedEmpty() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] sharedArray = new char[]{'a', 'b'};
        tb.resetWithShared(sharedArray, 0, 0);
        assertEquals(0, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
        assertEquals(sharedArray, tb.getTextBuffer());
    }

    @Test
    public void testResetWithSharedNonEmpty() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] sharedArray = new char[]{'a', 'b', 'c', 'd'};
        tb.resetWithShared(sharedArray, 1, 2); // Should contain 'b', 'c'
        assertEquals(2, tb.size());
        assertEquals(1, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
        assertEquals(sharedArray, tb.getTextBuffer());
        assertEquals("bc", tb.contentsAsString());
    }

    @Test
    public void testResetWithCopy() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] sourceArray = new char[]{'a', 'b', 'c', 'd'};
        tb.resetWithCopy(sourceArray, 1, 2); // Should copy 'b', 'c'
        assertEquals(2, tb.size());
        assertEquals(0, tb.getTextOffset());
        assertTrue(tb.hasTextAsCharacters());
        assertNotSame(sourceArray, tb.getTextBuffer());
        assertEquals("bc", tb.contentsAsString());
    }

    @Test
    public void testResetWithString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.resetWithString("hello");
        assertEquals(5, tb.size());
        assertFalse(tb.hasTextAsCharacters());
        assertEquals("hello", tb.contentsAsString());
    }

    @Test
    public void testAppendChar() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('a');
        tb.append('b');
        assertEquals(2, tb.size());
        assertEquals("ab", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArray() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] data = new char[]{'x', 'y', 'z'};
        tb.append(data, 0, 3);
        assertEquals(3, tb.size());
        assertEquals("xyz", tb.contentsAsString());
    }

    @Test
    public void testAppendString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("test", 0, 4);
        assertEquals(4, tb.size());
        assertEquals("test", tb.contentsAsString());
    }

    @Test
    public void testAppendLongCharArray() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        // Ensure length is greater than MIN_SEGMENT_LEN to force segment creation
        char[] data = new char[TextBuffer.MIN_SEGMENT_LEN + 10];
        Arrays.fill(data, 'L');
        tb.append(data, 0, data.length);
        assertEquals(data.length, tb.size());
        assertEquals(new String(data), tb.contentsAsString());
    }

    @Test
    public void testAppendLongString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TextBuffer.MIN_SEGMENT_LEN + 10; i++) {
            sb.append('L');
        }
        String longString = sb.toString();
        tb.append(longString, 0, longString.length());
        assertEquals(longString.length(), tb.size());
        assertEquals(longString, tb.contentsAsString());
    }

    @Test
    public void testCurrentSegmentExpansion() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        // Fill up the initial segment
        char[] initialSegment = tb.emptyAndGetCurrentSegment();
        int initialLen = initialSegment.length;
        for (int i = 0; i < initialLen; i++) {
            initialSegment[i] = 'a';
        }
        tb.setCurrentLength(initialLen);

        // Append one more character, should trigger expansion
        tb.append('b');
        assertEquals(initialLen + 1, tb.size());
        assertEquals(initialLen + 1, tb.getCurrentSegmentSize());
        char[] currentSegment = tb.getCurrentSegment();
        assertTrue(currentSegment.length > initialLen);
        StringBuilder expected = new StringBuilder();
        expected.append(initialSegment, 0, initialLen);
        expected.append('b');
        assertEquals(expected.toString(), tb.contentsAsString());
    }

    @Test
    public void testFinishCurrentSegment() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('a');
        tb.append('b');
        // Current segment has size 2.
        // finishCurrentSegment moves the current segment to _segments,
        // and _segmentSize becomes the length of the segment.
        // The _currentSegment is reallocated with a new length.
        // The currentSize is reset to 0.
        // _segmentSize should be the length of the *first* segment, not combined.
        char[] segmentBeforeFinish = tb.getCurrentSegment();
        int initialSegmentLength = segmentBeforeFinish.length;
        tb.setCurrentLength(2); // Ensure size is 2, not affected by internal buffer allocation size

        char[] finishedSegment = tb.finishCurrentSegment();
        assertEquals(2, tb.size()); // Size is still 2, as only current segment is added to segments list.
        assertEquals(0, tb.getCurrentSegmentSize()); // Current size is reset.
        assertEquals(initialSegmentLength, finishedSegment.length); // The returned segment should have the original length before expansion.

        // Append to new segment
        tb.append('d');
        assertEquals(3, tb.size()); // Size is now 3 (2 from first segment + 1 from second).
        assertEquals("abd", tb.contentsAsString()); // Expected: 'a', 'b' from first segment, 'd' from second.
    }

    @Test
    public void testContentsAsArray() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('t');
        tb.append("est", 0, 3);
        char[] array = tb.contentsAsArray();
        assertEquals(4, array.length);
        assertEquals("test", new String(array));
    }

    @Test
    public void testContentsAsString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("hello", 0, 5);
        String str = tb.contentsAsString();
        assertEquals("hello", str);
    }

    @Test
    public void testContentsAsDecimalSimple() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("123.45", 0, 6);
        BigDecimal bd = tb.contentsAsDecimal();
        assertEquals(new BigDecimal("123.45"), bd);
    }

    @Test
    public void testContentsAsDecimalLarge() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        // This string exceeds typical double precision, but BigDecimal should handle it.
        // The original failing test had a shorter string. Let's use a more precise one.
        tb.append("12345678901234567890.1234567890123456789012345", 0, 37);
        BigDecimal bd = tb.contentsAsDecimal();
        assertEquals(new BigDecimal("12345678901234567890.1234567890123456789012345"), bd);
    }

    @Test
    public void testContentsAsDoubleSimple() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("123.45", 0, 6);
        double d = tb.contentsAsDouble();
        assertEquals(123.45, d, 1e-9);
    }

    @Test
    public void testContentsAsDoubleScientific() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("1.2345e-6", 0, 9);
        double d = tb.contentsAsDouble();
        assertEquals(1.2345e-6, d, 1e-15);
    }

    @Test
    public void testEnsureNotSharedAndAppendChar() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = new char[]{'s', 'h', 'a', 'r', 'e', 'd'};
        tb.resetWithShared(shared, 0, 6);
        tb.ensureNotShared(); // This will copy the content to a new buffer
        assertNotSame(shared, tb.getTextBuffer()); // Verify it's no longer the shared buffer
        tb.append('d');
        assertEquals("sharedd", tb.contentsAsString());
    }

    @Test
    public void testEnsureNotSharedAndAppendCharArray() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = new char[]{'s', 'h', 'a', 'r', 'e', 'd'};
        tb.resetWithShared(shared, 0, 6);
        tb.ensureNotShared();
        assertNotSame(shared, tb.getTextBuffer());
        char[] appendChars = new char[]{'a', 'p', 'p'};
        tb.append(appendChars, 0, 3);
        assertEquals("sharedapp", tb.contentsAsString());
    }

    @Test
    public void testSizeWhenShared() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = new char[]{'a', 'b', 'c', 'd'};
        tb.resetWithShared(shared, 1, 3); // 'b', 'c', 'd'
        assertEquals(3, tb.size());
    }

    @Test
    public void testSizeWhenCopied() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] source = new char[]{'a', 'b', 'c', 'd'};
        tb.resetWithCopy(source, 1, 3); // 'b', 'c', 'd'
        assertEquals(3, tb.size());
    }

    @Test
    public void testSizeWhenAppended() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('a');
        tb.append("bc", 0, 2);
        assertEquals(3, tb.size());
    }

    @Test
    public void testGetTextBufferWhenShared() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] shared = new char[]{'a', 'b', 'c', 'd'};
        tb.resetWithShared(shared, 1, 2); // 'b', 'c'
        assertEquals(shared, tb.getTextBuffer());
    }

    @Test
    public void testGetTextBufferWhenCopied() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] source = new char[]{'a', 'b', 'c', 'd'};
        tb.resetWithCopy(source, 1, 2); // 'b', 'c'
        char[] buffer = tb.getTextBuffer();
        assertNotSame(source, buffer);
        assertEquals('b', buffer[0]);
        assertEquals('c', buffer[1]);
    }

    @Test
    public void testGetTextBufferWhenAppended() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('a');
        tb.append('b');
        char[] buffer = tb.getTextBuffer();
        assertEquals('a', buffer[0]);
        assertEquals('b', buffer[1]);
    }

    @Test
    public void testToStringWhenCachedString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.resetWithString("cached");
        assertEquals("cached", tb.toString());
    }

    @Test
    public void testToStringWhenCachedArray() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("array", 0, 5);
        tb.contentsAsArray(); // Cache the array
        assertEquals("array", tb.toString());
    }

    @Test
    public void testToStringWhenNeedsBuilding() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("build", 0, 5);
        tb.append("ing", 0, 3);
        assertEquals("building", tb.toString());
    }

    @Test
    public void testExpandCurrentSegmentWithSmallSize() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] initialSegment = tb.emptyAndGetCurrentSegment();
        int initialLen = initialSegment.length;
        tb.setCurrentLength(initialLen); // Fill the segment

        char[] expanded = tb.expandCurrentSegment(initialLen + 10);
        assertTrue(expanded.length >= initialLen + 10);
        assertEquals(initialLen, tb.getCurrentSegmentSize()); // Size should not change
        assertEquals(expanded, tb.getCurrentSegment());
    }

    @Test
    public void testExpandCurrentSegmentWithLargeSize() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        char[] initialSegment = tb.emptyAndGetCurrentSegment();
        int initialLen = initialSegment.length;
        tb.setCurrentLength(initialLen); // Fill the segment

        char[] expanded = tb.expandCurrentSegment(TextBuffer.MAX_SEGMENT_LEN + 100);
        assertTrue(expanded.length >= TextBuffer.MAX_SEGMENT_LEN + 100);
        assertEquals(initialLen, tb.getCurrentSegmentSize());
        assertEquals(expanded, tb.getCurrentSegment());
    }

    @Test
    public void testExpandCurrentSegmentWhenNotFull() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('a');
        char[] initialSegment = tb.getCurrentSegment();
        int initialLen = initialSegment.length;
        char[] expanded = tb.expandCurrentSegment(initialLen); // Should not change length
        assertEquals(initialLen, expanded.length);
        assertEquals(1, tb.getCurrentSegmentSize()); // Size should not change
        assertEquals(expanded, tb.getCurrentSegment());
    }

    @Test
    public void testCurrentSegmentSizeAndSet() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('a');
        assertEquals(1, tb.getCurrentSegmentSize());
        tb.setCurrentLength(5);
        assertEquals(5, tb.getCurrentSegmentSize());
        // Directly access char array to verify size change
        char[] segment = tb.getCurrentSegment();
        assertTrue(segment.length >= 5);
    }

    @Test
    public void testEmptyAndGetCurrentSegmentResetsState() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("some text", 0, 9);
        tb.contentsAsString(); // Cache the string
        tb.contentsAsArray(); // Cache the array

        // emptyAndGetCurrentSegment resets most internal state to an empty buffer state
        char[] segment = tb.emptyAndGetCurrentSegment();
        assertEquals(0, tb.size()); // Size should be 0 after reset
        assertEquals(0, tb.getCurrentSegmentSize()); // Current size should be 0
        assertNotNull(segment);
        // Ensure that resetWithEmpty logic is reflected in public API
        assertEquals("", tb.contentsAsString());
        assertTrue(tb.hasTextAsCharacters()); // Empty buffer should report hasTextAsCharacters as true
    }

    @Test
    public void testSizeAfterResetWithSharedEmpty() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("temp", 0, 4);
        tb.resetWithShared(new char[]{'a'}, 0, 0);
        assertEquals(0, tb.size());
    }

    @Test
    public void testSizeAfterResetWithStringEmpty() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("temp", 0, 4);
        tb.resetWithString("");
        assertEquals(0, tb.size());
    }

    @Test
    public void testContentsAsDoubleZero() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("0", 0, 1);
        assertEquals(0.0, tb.contentsAsDouble(), 1e-9);
    }

    @Test
    public void testContentsAsDecimalZero() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("0", 0, 1);
        assertEquals(BigDecimal.ZERO, tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimalNegative() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("-10.5", 0, 5);
        assertEquals(new BigDecimal("-10.5"), tb.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDoubleNegative() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("-10.5", 0, 5);
        assertEquals(-10.5, tb.contentsAsDouble(), 1e-9);
    }

    @Test
    public void testContentsAsDoubleEdgeCaseNaN() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("NaN", 0, 3);
        assertTrue(Double.isNaN(tb.contentsAsDouble()));
    }

    @Test
    public void testContentsAsDoubleEdgeCasePositiveInfinity() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("Infinity", 0, 8);
        assertTrue(Double.isInfinite(tb.contentsAsDouble()));
        assertTrue(tb.contentsAsDouble() > 0);
    }

    @Test
    public void testContentsAsDoubleEdgeCaseNegativeInfinity() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("-Infinity", 0, 9);
        assertTrue(Double.isInfinite(tb.contentsAsDouble()));
        assertTrue(tb.contentsAsDouble() < 0);
    }

    @Test
    public void testAppendCharToEmptyBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('A');
        assertEquals(1, tb.size());
        assertEquals("A", tb.contentsAsString());
    }

    @Test
    public void testAppendStringEmpty() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("", 0, 0);
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testAppendCharArrayEmpty() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append(new char[0], 0, 0);
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }

    @Test
    public void testSizeWithZeroLengthSharedBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.resetWithShared(new char[]{'a', 'b'}, 0, 0);
        assertEquals(0, tb.size());
    }

    @Test
    public void testToStringOnEmptyBuffer() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        assertEquals("", tb.toString());
    }

    @Test
    public void testHasTextAsCharactersWhenShared() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.resetWithShared(new char[]{'a', 'b'}, 0, 2);
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharactersWhenCopied() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.resetWithCopy(new char[]{'a', 'b'}, 0, 2);
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharactersWhenAppended() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append('a');
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharactersWhenStringReset() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.resetWithString("abc");
        assertFalse(tb.hasTextAsCharacters());
    }
}
