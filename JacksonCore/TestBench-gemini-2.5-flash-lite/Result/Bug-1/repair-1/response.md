```java
package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class NumberInputTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseIntCharArrayShortPositive() {
        char[] data = {'1', '2', '3'};
        assertEquals(123, NumberInput.parseInt(data, 0, 3));
    }

    @Test
    public void testParseIntCharArrayShortNegative() {
        char[] data = {'-', '1', '2', '3'};
        assertEquals(-123, NumberInput.parseInt(data, 0, 4));
    }

    @Test
    public void testParseIntCharArrayLongPositive() {
        char[] data = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        assertEquals(123456789, NumberInput.parseInt(data, 0, 9));
    }

    @Test
    public void testParseIntCharArrayLongNegative() {
        char[] data = {'-', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        assertEquals(-123456789, NumberInput.parseInt(data, 0, 10));
    }

    @Test
    public void testParseIntCharArrayBoundaryMax() {
        // Max int is 2147483647
        char[] data = {'2', '1', '4', '7', '4', '8', '3', '6', '4', '7'};
        assertEquals(Integer.MAX_VALUE, NumberInput.parseInt(data, 0, 10));
    }

    @Test
    public void testParseIntCharArrayBoundaryMin() {
        // Min int is -2147483648
        char[] data = {'-', '2', '1', '4', '7', '4', '8', '3', '6', '4', '8'};
        assertEquals(Integer.MIN_VALUE, NumberInput.parseInt(data, 0, 11));
    }

    @Test
    public void testParseIntStringShortPositive() {
        assertEquals(123, NumberInput.parseInt("123"));
    }

    @Test
    public void testParseIntStringShortNegative() {
        assertEquals(-123, NumberInput.parseInt("-123"));
    }

    @Test
    public void testParseIntStringLongPositive() {
        assertEquals(123456789, NumberInput.parseInt("123456789"));
    }

    @Test
    public void testParseIntStringLongNegative() {
        assertEquals(-123456789, NumberInput.parseInt("-123456789"));
    }

    @Test
    public void testParseIntStringBoundaryMax() {
        assertEquals(Integer.MAX_VALUE, NumberInput.parseInt(String.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    public void testParseIntStringBoundaryMin() {
        assertEquals(Integer.MIN_VALUE, NumberInput.parseInt(String.valueOf(Integer.MIN_VALUE)));
    }

    @Test
    public void testParseIntStringTooLong() {
        // Should defer to Integer.parseInt
        assertEquals(Integer.parseInt("1234567890"), NumberInput.parseInt("1234567890"));
    }

    @Test
    public void testParseIntStringTooLongNegative() {
        // Should defer to Integer.parseInt
        assertEquals(Integer.parseInt("-1234567890"), NumberInput.parseInt("-1234567890"));
    }

    @Test
    public void testParseLongCharArrayBoundaryMax() {
        // Max long is 9223372036854775807
        char[] data = {'9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '7'};
        assertEquals(Long.MAX_VALUE, NumberInput.parseLong(data, 0, 19));
    }

    @Test
    public void testParseLongCharArrayBoundaryMin() {
        // Min long is -9223372036854775808
        char[] data = {'-', '9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '8'};
        assertEquals(Long.MIN_VALUE, NumberInput.parseLong(data, 0, 20));
    }

    @Test
    public void testParseLongStringIntRange() {
        assertEquals(12345L, NumberInput.parseLong("12345"));
    }

    @Test
    public void testParseLongStringIntRangeNegative() {
        assertEquals(-12345L, NumberInput.parseLong("-12345"));
    }

    @Test
    public void testParseLongStringBoundaryMax() {
        assertEquals(Long.MAX_VALUE, NumberInput.parseLong(String.valueOf(Long.MAX_VALUE)));
    }

    @Test
    public void testParseLongStringBoundaryMin() {
        assertEquals(Long.MIN_VALUE, NumberInput.parseLong(String.valueOf(Long.MIN_VALUE)));
    }

    @Test
    public void testInLongRangeCharArrayPositiveMax() {
        // Max long is 9223372036854775807
        char[] data = {'9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '7'};
        assertTrue(NumberInput.inLongRange(data, 0, 19, false));
    }

    @Test
    public void testInLongRangeCharArrayPositiveOneOver() {
        // One over max long
        char[] data = {'9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '8'};
        assertFalse(NumberInput.inLongRange(data, 0, 19, false));
    }

    @Test
    public void testInLongRangeCharArrayNegativeMin() {
        // Min long is -9223372036854775808 (positive representation)
        char[] data = {'9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '8'};
        assertTrue(NumberInput.inLongRange(data, 0, 19, true));
    }

    @Test
    public void testInLongRangeCharArrayNegativeOneOver() {
        // One less than min long (positive representation)
        char[] data = {'9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '9'};
        assertFalse(NumberInput.inLongRange(data, 0, 19, true));
    }

    @Test
    public void testInLongRangeStringPositiveMax() {
        assertTrue(NumberInput.inLongRange(String.valueOf(Long.MAX_VALUE), false));
    }

    @Test
    public void testInLongRangeStringPositiveOneOver() {
        assertFalse(NumberInput.inLongRange("9223372036854775808", false));
    }

    @Test
    public void testInLongRangeStringNegativeMin() {
        assertTrue(NumberInput.inLongRange("9223372036854775808", true));
    }

    @Test
    public void testInLongRangeStringNegativeOneOver() {
        assertFalse(NumberInput.inLongRange("9223372036854775809", true));
    }

    @Test
    public void testParseAsIntPositive() {
        assertEquals(123, NumberInput.parseAsInt("123", 0));
    }

    @Test
    public void testParseAsIntNegative() {
        assertEquals(-123, NumberInput.parseAsInt("-123", 0));
    }

    @Test
    public void testParseAsIntNull() {
        assertEquals(0, NumberInput.parseAsInt(null, 0));
    }

    @Test
    public void testParseAsIntEmpty() {
        assertEquals(0, NumberInput.parseAsInt("", 0));
    }

    @Test
    public void testParseAsIntTrimmed() {
        assertEquals(123, NumberInput.parseAsInt("  123  ", 0));
    }

    @Test
    public void testParseAsIntNonNumeric() {
        // Should fallback to parseDouble and cast
        assertEquals((int) 123.45, NumberInput.parseAsInt("123.45", 0));
    }

    @Test
    public void testParseAsIntNonNumericDefault() {
        assertEquals(100, NumberInput.parseAsInt("abc", 100));
    }

    @Test
    public void testParseAsLongPositive() {
        assertEquals(12345L, NumberInput.parseAsLong("12345", 0L));
    }

    @Test
    public void testParseAsLongNegative() {
        assertEquals(-12345L, NumberInput.parseAsLong("-12345", 0L));
    }

    @Test
    public void testParseAsLongNull() {
        assertEquals(0L, NumberInput.parseAsLong(null, 0L));
    }

    @Test
    public void testParseAsLongEmpty() {
        assertEquals(0L, NumberInput.parseAsLong("", 0L));
    }

    @Test
    public void testParseAsLongTrimmed() {
        assertEquals(12345L, NumberInput.parseAsLong("  12345  ", 0L));
    }

    @Test
    public void testParseAsLongNonNumeric() {
        // Should fallback to parseDouble and cast
        assertEquals((long) 123.45, NumberInput.parseAsLong("123.45", 0L));
    }

    @Test
    public void testParseAsLongNonNumericDefault() {
        assertEquals(100L, NumberInput.parseAsLong("abc", 100L));
    }

    @Test
    public void testParseAsDoublePositive() {
        assertEquals(123.45, NumberInput.parseAsDouble("123.45", 0.0), 1e-9);
    }

    @Test
    public void testParseAsDoubleNegative() {
        assertEquals(-123.45, NumberInput.parseAsDouble("-123.45", 0.0), 1e-9);
    }

    @Test
    public void testParseAsDoubleNull() {
        assertEquals(0.0, NumberInput.parseAsDouble(null, 0.0), 1e-9);
    }

    @Test
    public void testParseAsDoubleEmpty() {
        assertEquals(0.0, NumberInput.parseAsDouble("", 0.0), 1e-9);
    }

    @Test
    public void testParseAsDoubleTrimmed() {
        assertEquals(123.45, NumberInput.parseAsDouble("  123.45  ", 0.0), 1e-9);
    }

    @Test
    public void testParseAsDoubleNonNumeric() {
        // Should fallback to parseDouble
        assertEquals(123.45, NumberInput.parseDouble("123.45"), 1e-9);
    }

    @Test
    public void testParseAsDoubleNonNumericDefault() {
        assertEquals(100.0, NumberInput.parseAsDouble("abc", 100.0), 1e-9);
    }

    @Test
    public void testParseDoublePositive() throws Exception {
        assertEquals(123.45, NumberInput.parseDouble("123.45"), 1e-9);
    }

    @Test
    public void testParseDoubleNegative() throws Exception {
        assertEquals(-123.45, NumberInput.parseDouble("-123.45"), 1e-9);
    }

    @Test
    public void testParseDoubleNASTY_SMALL_DOUBLE() throws Exception {
        assertEquals(Double.MIN_VALUE, NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE), 1e-9);
    }

    @Test
    public void testParseDoubleZero() throws Exception {
        assertEquals(0.0, NumberInput.parseDouble("0.0"), 1e-9);
    }

    @Test
    public void testParseDoubleBoundaryPositiveInfinity() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, NumberInput.parseDouble("Infinity"), 1e-9);
    }

    @Test
    public void testParseDoubleBoundaryNegativeInfinity() throws Exception {
        assertEquals(Double.NEGATIVE_INFINITY, NumberInput.parseDouble("-Infinity"), 1e-9);
    }

    @Test
    public void testParseDoubleNaN() throws Exception {
        assertEquals(Double.NaN, NumberInput.parseDouble("NaN"), 1e-9);
    }

    @Test
    public void testParseBigDecimalStringPositive() throws Exception {
        assertEquals(new BigDecimal("123.45"), NumberInput.parseBigDecimal("123.45"));
    }

    @Test
    public void testParseBigDecimalStringNegative() throws Exception {
        assertEquals(new BigDecimal("-123.45"), NumberInput.parseBigDecimal("-123.45"));
    }

    @Test
    public void testParseBigDecimalStringZero() throws Exception {
        assertEquals(BigDecimal.ZERO, NumberInput.parseBigDecimal("0"));
    }

    @Test
    public void testParseBigDecimalCharArrayPositive() throws Exception {
        char[] data = {'1', '2', '3', '.', '4', '5'};
        assertEquals(new BigDecimal("123.45"), NumberInput.parseBigDecimal(data, 0, 6));
    }

    @Test
    public void testParseBigDecimalCharArrayNegative() throws Exception {
        char[] data = {'-', '1', '2', '3', '.', '4', '5'};
        assertEquals(new BigDecimal("-123.45"), NumberInput.parseBigDecimal(data, 0, 7));
    }

    @Test
    public void testParseBigDecimalCharArrayZero() throws Exception {
        char[] data = {'0'};
        assertEquals(BigDecimal.ZERO, NumberInput.parseBigDecimal(data, 0, 1));
    }

    @Test
    public void testParseBigDecimalBadString() {
        try {
            NumberInput.parseBigDecimal("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            assertTrue(e.getMessage().contains("can not be represented as BigDecimal"));
        }
    }

    @Test
    public void testParseBigDecimalBadCharArray() {
        char[] data = {'a', 'b', 'c'};
        try {
            NumberInput.parseBigDecimal(data, 0, 3);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            assertTrue(e.getMessage().contains("can not be represented as BigDecimal"));
        }
    }

    // New tests for TextBuffer methods
    private BufferRecycler recycler = new BufferRecycler();

    @Test
    public void testTextBufferResetWithCopyAndContents() {
        TextBuffer tb = new TextBuffer(recycler);
        char[] data = {'a', 'b', 'c'};
        tb.resetWithCopy(data, 0, 3);
        assertEquals(3, tb.size());
        assertTrue(tb.hasTextAsCharacters());
        assertArrayEquals(data, tb.getTextBuffer());
        assertEquals("abc", tb.contentsAsString());
        assertArrayEquals("abc".toCharArray(), tb.contentsAsArray());
    }

    @Test
    public void testTextBufferAppendCharAndContents() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append('a');
        tb.append('b');
        tb.append('c');
        assertEquals(3, tb.size());
        assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void testTextBufferAppendCharArrayAndContents() {
        TextBuffer tb = new TextBuffer(recycler);
        char[] data = {'a', 'b', 'c'};
        tb.append(data, 0, 3);
        assertEquals(3, tb.size());
        assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void testTextBufferAppendStringAndContents() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append("abc", 0, 3);
        assertEquals(3, tb.size());
        assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void testTextBufferEnsureNotSharedAndAppend() {
        TextBuffer tb = new TextBuffer(recycler);
        char[] sharedBuf = {'a', 'b', 'c'};
        tb.resetWithShared(sharedBuf, 0, 3);
        tb.ensureNotShared();
        tb.append('d');
        assertEquals("abcd", tb.contentsAsString());
        assertNotSame(sharedBuf, tb.getTextBuffer()); // Should be a new buffer
    }

    @Test
    public void testTextBufferExpandCurrentSegment() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append('a');
        char[] segment1 = tb.getCurrentSegment();
        int initialSize = tb.getCurrentSegmentSize();
        
        // Force expansion
        tb.setCurrentLength(segment1.length); // Make it full
        char[] expandedSegment = tb.expandCurrentSegment();

        assertNotSame(segment1, expandedSegment);
        assertTrue(expandedSegment.length > segment1.length);
        assertEquals(0, tb.getCurrentSegmentSize()); // reset size after expansion
    }

    @Test
    public void testTextBufferFinishCurrentSegment() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append('a');
        tb.append('b');
        tb.finishCurrentSegment(); // This moves the current segment to _segments

        tb.append('c');
        tb.append('d');
        tb.finishCurrentSegment(); // This moves the second segment to _segments

        assertEquals("abcd", tb.contentsAsString());
        // Accessing _segments directly is generally discouraged, but for testing it can be necessary.
        // However, since _segments is private, we can't directly access it.
        // We can indirectly test by checking the final contentsAsString.
    }
    
    @Test
    public void testTextBufferToString() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append("hello", 0, 5);
        assertEquals("hello", tb.toString());
    }
    
    @Test
    public void testTextBufferContentsAsDecimal() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append("123.45", 0, 6);
        assertEquals(new BigDecimal("123.45"), tb.contentsAsDecimal());
    }

    @Test
    public void testTextBufferContentsAsDouble() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append("123.45", 0, 6);
        assertEquals(123.45, tb.contentsAsDouble(), 1e-9);
    }
    
    @Test
    public void testTextBufferReleaseBuffers() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append("test", 0, 4);
        tb.releaseBuffers();
        // After release, it should be empty
        assertEquals("", tb.contentsAsString());
        assertEquals(0, tb.size());
    }

    @Test
    public void testTextBufferResetWithEmpty() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append("test", 0, 4);
        tb.resetWithEmpty();
        assertEquals("", tb.contentsAsString());
        assertEquals(0, tb.size());
    }

    @Test
    public void testTextBufferResetWithString() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append("initial", 0, 7);
        tb.resetWithString("newString");
        assertEquals("newString", tb.contentsAsString());
        assertEquals(9, tb.size());
    }

    @Test
    public void testTextBuffer_getTextBuffer_shared() {
        TextBuffer tb = new TextBuffer(recycler);
        char[] shared = "shared".toCharArray();
        tb.resetWithShared(shared, 0, shared.length);
        char[] buf = tb.getTextBuffer();
        assertArrayEquals(shared, buf);
        assertEquals(0, tb.getTextOffset()); // Offset should be 0 for shared buffer from start
    }

    @Test
    public void testTextBuffer_getTextBuffer_from_string() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.resetWithString("stringContent");
        char[] buf = tb.getTextBuffer();
        assertArrayEquals("stringContent".toCharArray(), buf);
    }

    @Test
    public void testTextBuffer_getTextBuffer_from_segments() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.append('a');
        tb.finishCurrentSegment();
        tb.append('b');
        char[] buf = tb.getTextBuffer();
        assertArrayEquals(new char[]{'a', 'b'}, buf);
    }

    @Test
    public void testTextBuffer_hasTextAsCharacters_true_for_array() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.resetWithCopy(new char[]{'a'}, 0, 1);
        assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void testTextBuffer_hasTextAsCharacters_false_for_string() {
        TextBuffer tb = new TextBuffer(recycler);
        tb.resetWithString("a");
        assertFalse(tb.hasTextAsCharacters());
    }
}
```