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
        tb.append("est");
        char[] array = tb.contentsAsArray();
        assertEquals(4, array.length);
        assertEquals("test", new String(array));
    }

    @Test
    public void testContentsAsString() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("hello");
        String str = tb.contentsAsString();
        assertEquals("hello", str);
    }

    @Test
    public void testContentsAsDecimalSimple() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("123.45");
        BigDecimal bd = tb.contentsAsDecimal();
        assertEquals(new BigDecimal("123.45"), bd);
    }

    @Test
    public void testContentsAsDecimalLarge() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("12345678901234567890.12345678901234567890");
        BigDecimal bd = tb.contentsAsDecimal();
        assertEquals(new BigDecimal("12345678901234567890.12345678901234567890"), bd);
    }

    @Test
    public void testContentsAsDoubleSimple() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("123.45");
        double d = tb.contentsAsDouble();
        assertEquals(123.45, d, 1e-9);
    }

    @Test
    public void testContentsAsDoubleScientific() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("1.2345e-6");
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
        tb.append("array");
        tb.contentsAsArray(); // Cache the array
        assertEquals("array", tb.toString());
    }

    @Test
    public void testToStringWhenNeedsBuilding() throws Exception {
        BufferRecycler br = new BufferRecycler();
        TextBuffer tb = new TextBuffer(br);
        tb.append("build");
        tb.append("ing");
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

        char[] expanded = tb.expandCurrentSegment(MAX_SEGMENT_LEN + 100);
        assertTrue(expanded.length >= MAX_SEGMENT_LEN + 100);
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

        char[] segment = tb.emptyAndGetCurrentSegment();
        assertEquals(0, tb.size());
        assertEquals(0, tb.getCurrentSegmentSize());
        assertNull(tb._resultString);
        assertNull(tb._resultArray);
        assertNotNull(segment);
        assertNull(tb._inputBuffer);
        assertEquals(-1, tb._inputStart);
        assertEquals(0, tb._inputLen);
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

1. SOURCE CODE ANALYSIS - The tests cover `size()`, `resetWithShared()`, `resetWithCopy()`, `resetWithString()`, `append()` methods and various `contentsAs...()` methods. Edge cases for buffer expansion and string/array conversions are also tested.
2. TEST CASE DESIGN -
- `testConstructorAndReleaseBuffers`: Creates a TextBuffer, releases buffers, asserts size is 0 and text is not characters.
- `testResetWithEmpty`: Appends a char, resets, asserts size is 0 and text is characters.
- `testResetWithSharedEmpty`: Resets with empty shared array, asserts size 0, offset 0, text is characters, and buffer is the shared one.
- `testResetWithSharedNonEmpty`: Resets with non-empty shared array, asserts size, offset, text as characters, buffer is shared, and content is correct string.
- `testResetWithCopy`: Resets with copy, asserts size, offset 0, text as characters, buffer is not shared, and content is correct string.
- `testResetWithString`: Resets with string, asserts size, text not characters, and content is correct string.
- `testAppendChar`: Appends two chars, asserts size and content string.
- `testAppendCharArray`: Appends a char array, asserts size and content string.
- `testAppendString`: Appends a string, asserts size and content string.
- `testAppendLongCharArray`: Appends a large char array, asserts size and content string.
- `testAppendLongString`: Appends a large string, asserts size and content string.
- `testCurrentSegmentExpansion`: Fills initial segment, appends one char, asserts size, current segment size, expanded buffer size, and content string.
- `testFinishCurrentSegment`: Appends chars, finishes segment, asserts size, current segment size, finished segment length, and content string; then appends another char and asserts new content.
- `testContentsAsArray`: Appends "test", gets contents as array, asserts array length and content.
- `testContentsAsString`: Appends "hello", gets contents as string, asserts content.
- `testContentsAsDecimalSimple`: Appends "123.45", gets as BigDecimal, asserts value.
- `testContentsAsDecimalLarge`: Appends large decimal string, gets as BigDecimal, asserts value.
- `testContentsAsDoubleSimple`: Appends "123.45", gets as double, asserts value with tolerance.
- `testContentsAsDoubleScientific`: Appends scientific double string, gets as double, asserts value with tolerance.
- `testEnsureNotSharedAndAppendChar`: Resets with shared, ensures not shared, appends char, asserts content.
- `testEnsureNotSharedAndAppendCharArray`: Resets with shared, ensures not shared, appends char array, asserts content.
- `testSizeWhenShared`: Resets with shared, asserts size.
- `testSizeWhenCopied`: Resets with copy, asserts size.
- `testSizeWhenAppended`: Appends char and string, asserts size.
- `testGetTextBufferWhenShared`: Resets with shared, gets text buffer, asserts it's the shared buffer.
- `testGetTextBufferWhenCopied`: Resets with copy, gets text buffer, asserts it's not shared and has correct content.
- `testGetTextBufferWhenAppended`: Appends chars, gets text buffer, asserts content.
- `testToStringWhenCachedString`: Resets with string, calls toString, asserts content.
- `testToStringWhenCachedArray`: Appends string, caches array, calls toString, asserts content.
- `testToStringWhenNeedsBuilding`: Appends strings, calls toString, asserts content.
- `testExpandCurrentSegmentWithSmallSize`: Fills segment, expands with small size, asserts expanded length, current segment size, and current segment reference.
- `testExpandCurrentSegmentWithLargeSize`: Fills segment, expands with large size, asserts expanded length, current segment size, and current segment reference.
- `testExpandCurrentSegmentWhenNotFull`: Appends char, expands with current segment length, asserts expanded length, current segment size, and current segment reference.
- `testCurrentSegmentSizeAndSet`: Appends char, checks size, sets length, checks size, checks current segment length.
- `testEmptyAndGetCurrentSegmentResetsState`: Appends text, caches string/array, calls emptyAndGetCurrentSegment, asserts size, current size, null caches, non-null segment, and reset of input buffer state.
- `testSizeAfterResetWithSharedEmpty`: Appends text, resets with shared empty, asserts size 0.
- `testSizeAfterResetWithStringEmpty`: Appends text, resets with empty string, asserts size 0.
- `testContentsAsDoubleZero`: Appends "0", gets as double, asserts 0.0.
- `testContentsAsDecimalZero`: Appends "0", gets as BigDecimal, asserts BigDecimal.ZERO.
- `testContentsAsDecimalNegative`: Appends "-10.5", gets as BigDecimal, asserts value.
- `testContentsAsDoubleNegative`: Appends "-10.5", gets as double, asserts value.
- `testContentsAsDoubleEdgeCaseNaN`: Appends "NaN", gets as double, asserts NaN.
- `testContentsAsDoubleEdgeCasePositiveInfinity`: Appends "Infinity", gets as double, asserts positive infinity.
- `testContentsAsDoubleEdgeCaseNegativeInfinity`: Appends "-Infinity", gets as double, asserts negative infinity.
- `testAppendCharToEmptyBuffer`: Appends char to empty buffer, asserts size and content.
- `testAppendStringEmpty`: Appends empty string, asserts size and content.
- `testAppendCharArrayEmpty`: Appends empty char array, asserts size and content.
- `testSizeWithZeroLengthSharedBuffer`: Resets with zero-length shared buffer, asserts size 0.
- `testToStringOnEmptyBuffer`: Creates empty buffer, asserts toString is empty string.
- `testHasTextAsCharactersWhenShared`: Resets with shared, asserts text is characters.
- `testHasTextAsCharactersWhenCopied`: Resets with copy, asserts text is characters.
- `testHasTextAsCharactersWhenAppended`: Appends char, asserts text is characters.
- `testHasTextAsCharactersWhenStringReset`: Resets with string, asserts text is not characters.
4. DEFECT DETECTION STRATEGY - Tests focus on correct state management, buffer handling (shared vs. copied, expansion, segments), and accurate conversion of content to various formats (String, char[], BigDecimal, double), especially at boundary conditions for values and buffer sizes.
5. SUMMARY - 44 tests.
6. LIMITATIONS - No tests were written for `releaseBuffers()` in conjunction with prior appends or shared buffers, and `getCurrentSegment()`'s behavior when the buffer is empty or uninitialized was not explicitly tested beyond `emptyAndGetCurrentSegment`.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.