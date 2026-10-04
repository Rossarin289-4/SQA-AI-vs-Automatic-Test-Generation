```java
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
        assertFalse(tb.hasTextAsCharacters());
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
        char[] data = new char[1500]; // Larger than MIN_SEGMENT_LEN
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
        for (int i = 0; i < 1500; i++) {
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
        char[] current = tb.getCurrentSegment();
        current[tb.getCurrentSegmentSize()] = 'c'; // Directly modifying for test
        tb.setCurrentLength(tb.getCurrentSegmentSize() + 1);

        char[] finishedSegment = tb.finishCurrentSegment();
        assertEquals(3, tb.size());
        assertEquals(0, tb.getCurrentSegmentSize());
        assertEquals(3, finishedSegment.length);
        assertEquals("abc", tb.contentsAsString());

        // Append to new segment
        tb.append('d');
        assertEquals(4, tb.size());
        assertEquals("abcd", tb.contentsAsString());
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
        tb.append("12345678901234567890.12345678901234567890", 0, 31);
        BigDecimal bd = tb.contentsAsDecimal();
        assertEquals(new BigDecimal("12345678901234567890.12345678901234567890"), bd);
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
        tb.ensureNotShared();
        assertNotSame(shared, tb.getTextBuffer());
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

        // Accessing private members is not allowed. Instead, we test the observable side effects.
        char[] segment = tb.emptyAndGetCurrentSegment();
        assertEquals(0, tb.size());
        assertEquals(0, tb.getCurrentSegmentSize());
        assertNotNull(segment);
        // Ensure that resetWithEmpty logic is reflected in public API
        assertEquals("", tb.contentsAsString());
        assertTrue(tb.hasTextAsCharacters());
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
```
1. SOURCE CODE ANALYSIS - The tests cover methods like `resetWithShared`, `append`, `contentsAsString`, `contentsAsArray`, `contentsAsDecimal`, `contentsAsDouble`, `ensureNotShared`, `getTextBuffer`, `size`, `hasTextAsCharacters`, `expandCurrentSegment`, `emptyAndGetCurrentSegment`. Boundary conditions for segment expansion and string/char array appends are tested.
2. TEST CASE DESIGN -
- testConstructorAndReleaseBuffers: empty buffer, release buffers, size is 0, hasTextAsCharacters is false.
- testResetWithEmpty: append 'a', reset, size is 0, hasTextAsCharacters is true, getTextBuffer is not null.
- testResetWithSharedEmpty: reset with shared empty buffer, size is 0, getTextOffset is 0, hasTextAsCharacters is true, getTextBuffer is the shared array.
- testResetWithSharedNonEmpty: reset with shared buffer "bc", size is 2, getTextOffset is 1, hasTextAsCharacters is true, getTextBuffer is shared array, contentsAsString is "bc".
- testResetWithCopy: reset with copy of "bc", size is 2, getTextOffset is 0, hasTextAsCharacters is true, getTextBuffer is not source array, contentsAsString is "bc".
- testResetWithString: reset with string "hello", size is 5, hasTextAsCharacters is false, contentsAsString is "hello".
- testAppendChar: append 'a', 'b', size is 2, contentsAsString is "ab".
- testAppendCharArray: append {'x', 'y', 'z'}, size is 3, contentsAsString is "xyz".
- testAppendString: append "test", size is 4, contentsAsString is "test".
- testAppendLongCharArray: append char array of 1500 'L's, size is 1500, contentsAsString matches input.
- testAppendLongString: append string of 1500 'L's, size is 1500, contentsAsString matches input.
- testCurrentSegmentExpansion: fill initial segment, append one char, size is initialLen+1, currentSegment size is initialLen+1, new segment length is larger, contentsAsString matches.
- testFinishCurrentSegment: append "ab", add 'c' manually, finish, size is 3, currentSegmentSize is 0, finishedSegment length is 3, contentsAsString is "abc", append 'd', size is 4, contentsAsString is "abcd".
- testContentsAsArray: append 't' and "est", contentsAsArray returns char array of length 4, new String(array) is "test".
- testContentsAsString: append "hello", contentsAsString returns "hello".
- testContentsAsDecimalSimple: append "123.45", contentsAsDecimal returns BigDecimal("123.45").
- testContentsAsDecimalLarge: append long decimal string, contentsAsDecimal returns correct BigDecimal.
- testContentsAsDoubleSimple: append "123.45", contentsAsDouble returns 123.45 with tolerance.
- testContentsAsDoubleScientific: append "1.2345e-6", contentsAsDouble returns 1.2345e-6 with tolerance.
- testEnsureNotSharedAndAppendChar: reset with shared, ensureNotShared, append char, contentsAsString is "sharedd".
- testEnsureNotSharedAndAppendCharArray: reset with shared, ensureNotShared, append char array, contentsAsString is "sharedapp".
- testSizeWhenShared: reset with shared, size returns correct length.
- testSizeWhenCopied: reset with copy, size returns correct length.
- testSizeWhenAppended: append, size returns correct total length.
- testGetTextBufferWhenShared: reset with shared, getTextBuffer returns shared array.
- testGetTextBufferWhenCopied: reset with copy, getTextBuffer returns new array, checks content.
- testGetTextBufferWhenAppended: append, getTextBuffer returns current segment, checks content.
- testToStringWhenCachedString: reset with string, toString returns the string.
- testToStringWhenCachedArray: append, call contentsAsArray, toString returns correct string.
- testToStringWhenNeedsBuilding: append multiple times, toString builds and returns correct string.
- testExpandCurrentSegmentWithSmallSize: append to full segment, expandCurrentSegment(smallSize), new segment length >= smallSize, size unchanged.
- testExpandCurrentSegmentWithLargeSize: append to full segment, expandCurrentSegment(largeSize), new segment length >= largeSize, size unchanged.
- testExpandCurrentSegmentWhenNotFull: append to non-full segment, expandCurrentSegment(currentLen), segment length unchanged, size unchanged.
- testCurrentSegmentSizeAndSet: append, check size, set length, check size, verify segment capacity.
- testEmptyAndGetCurrentSegmentResetsState: append, cache results, call emptyAndGetCurrentSegment, verify reset state via public methods (size, currentSize, contentsAsString, hasTextAsCharacters).
- testSizeAfterResetWithSharedEmpty: append, reset with shared empty, size is 0.
- testSizeAfterResetWithStringEmpty: append, reset with empty string, size is 0.
- testContentsAsDoubleZero: append "0", contentsAsDouble is 0.0.
- testContentsAsDecimalZero: append "0", contentsAsDecimal is BigDecimal.ZERO.
- testContentsAsDecimalNegative: append "-10.5", contentsAsDecimal is BigDecimal("-10.5").
- testContentsAsDoubleNegative: append "-10.5", contentsAsDouble is -10.5.
- testContentsAsDoubleEdgeCaseNaN: append "NaN", contentsAsDouble is NaN.
- testContentsAsDoubleEdgeCasePositiveInfinity: append "Infinity", contentsAsDouble is positive infinity.
- testContentsAsDoubleEdgeCaseNegativeInfinity: append "-Infinity", contentsAsDouble is negative infinity.
- testAppendCharToEmptyBuffer: append char to empty, size 1, contentsAsString is "A".
- testAppendStringEmpty: append empty string, size 0, contentsAsString is "".
- testAppendCharArrayEmpty: append empty char array, size 0, contentsAsString is "".
- testSizeWithZeroLengthSharedBuffer: reset with zero-length shared buffer, size is 0.
- testToStringOnEmptyBuffer: empty buffer, toString returns "".
- testHasTextAsCharactersWhenShared: reset with shared, hasTextAsCharacters is true.
- testHasTextAsCharactersWhenCopied: reset with copy, hasTextAsCharacters is true.
- testHasTextAsCharactersWhenAppended: append, hasTextAsCharacters is true.
- testHasTextAsCharactersWhenStringReset: reset with string, hasTextAsCharacters is false.
4. DEFECT DETECTION STRATEGY - Tests focus on correct handling of shared vs. copied buffers, segment expansion logic, and accurate conversion of buffered text to strings, arrays, BigDecimals, and doubles, including edge cases.
5. SUMMARY - 39 tests.
6. LIMITATIONS - Access to private members was avoided by testing observable behavior. MAX_SEGMENT_LEN was accessed via TextBuffer.MAX_SEGMENT_LEN. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.