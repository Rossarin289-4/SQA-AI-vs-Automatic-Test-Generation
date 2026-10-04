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
    @Test
    public void testParseIntDigitsAtOffsetsAndLengthEdges() throws Exception {
        char[] chars = "x123456789y".toCharArray();
        assertEquals(1, NumberInput.parseInt(chars, 1, 1));
        assertEquals(123456789, NumberInput.parseInt(chars, 1, 9));
        assertEquals(123456789, NumberInput.parseInt("123456789".toCharArray(), 0, 9));
    }

    @Test
    public void testParseLongCharArrayAtTenAndEighteenDigits() throws Exception {
        assertEquals(1000000000L, NumberInput.parseLong("1000000000".toCharArray(), 0, 10));
        assertEquals(123456789012345678L,
                NumberInput.parseLong("123456789012345678".toCharArray(), 0, 18));
    }

    @Test
    public void testInLongRangeCharacterArrayBoundaries() throws Exception {
        assertTrue(NumberInput.inLongRange("9223372036854775807".toCharArray(), 0, 19, false));
        assertFalse(NumberInput.inLongRange("9223372036854775808".toCharArray(), 0, 19, false));
        assertTrue(NumberInput.inLongRange("9223372036854775808".toCharArray(), 0, 19, true));
        assertFalse(NumberInput.inLongRange("9223372036854775809".toCharArray(), 0, 19, true));
    }

    @Test
    public void testParseAsIntNullBlankSignAndDefault() throws Exception {
        assertEquals(7, NumberInput.parseAsInt(null, 7));
        assertEquals(7, NumberInput.parseAsInt("  ", 7));
        assertEquals(12, NumberInput.parseAsInt(" +12 ", 7));
        assertEquals(-12, NumberInput.parseAsInt("-12", 7));
    }

    @Test
    public void testParseAsIntIntegerEdgesAndOverflow() throws Exception {
        assertEquals(Integer.MAX_VALUE, NumberInput.parseAsInt("2147483647", 7));
        assertEquals(7, NumberInput.parseAsInt("2147483648", 7));
        assertEquals(Integer.MIN_VALUE, NumberInput.parseAsInt("-2147483648", 7));
        assertEquals(7, NumberInput.parseAsInt("-2147483649", 7));
    }

    @Test
    public void testParseAsIntDecimalCoercionAndInvalidInput() throws Exception {
        assertEquals(12, NumberInput.parseAsInt("12.9", 7));
        assertEquals(7, NumberInput.parseAsInt("nope", 7));
    }

    @Test
    public void testParseAsLongNullBlankAndSignedValues() throws Exception {
        assertEquals(9L, NumberInput.parseAsLong(null, 9L));
        assertEquals(9L, NumberInput.parseAsLong(" ", 9L));
        assertEquals(12L, NumberInput.parseAsLong("+12", 9L));
        assertEquals(-12L, NumberInput.parseAsLong("-12", 9L));
    }

    @Test
    public void testParseAsLongLongEdgesAndOverflow() throws Exception {
        assertEquals(Long.MAX_VALUE, NumberInput.parseAsLong("9223372036854775807", 9L));
        assertEquals(9L, NumberInput.parseAsLong("9223372036854775808", 9L));
        assertEquals(Long.MIN_VALUE, NumberInput.parseAsLong("-9223372036854775808", 9L));
        assertEquals(9L, NumberInput.parseAsLong("-9223372036854775809", 9L));
    }

    @Test
    public void testParseAsLongDecimalCoercionAndInvalidInput() throws Exception {
        assertEquals(12L, NumberInput.parseAsLong("12.9", 9L));
        assertEquals(9L, NumberInput.parseAsLong("nope", 9L));
    }

    @Test
    public void testParseAsDoubleDefaultsAndParsing() throws Exception {
        assertEquals(3.0, NumberInput.parseAsDouble(null, 3.0), 0.0);
        assertEquals(3.0, NumberInput.parseAsDouble(" ", 3.0), 0.0);
        assertEquals(1.25, NumberInput.parseAsDouble(" 1.25 ", 3.0), 0.0);
        assertEquals(3.0, NumberInput.parseAsDouble("bad", 3.0), 0.0);
    }

    @Test
    public void testParseDoubleNastySmallConstantAndOrdinaryValue() throws Exception {
        assertEquals(Double.MIN_VALUE, NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE), 0.0);
        assertEquals(1.5, NumberInput.parseDouble("1.5"), 0.0);
    }

    @Test
    public void testParseBigDecimalStringExactValue() throws Exception {
        assertEquals(new BigDecimal("123.450"), NumberInput.parseBigDecimal("123.450"));
    }

    @Test
    public void testParseBigDecimalInvalidStringThrows() throws Exception {
        try {
            NumberInput.parseBigDecimal("x");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testLongRangeStringEdges() throws Exception {
        assertTrue(NumberInput.inLongRange("9223372036854775807", false));
        assertFalse(NumberInput.inLongRange("9223372036854775808", false));
        assertTrue(NumberInput.inLongRange("9223372036854775808", true));
        assertFalse(NumberInput.inLongRange("9223372036854775809", true));
    }

    @Test
    public void testTextBufferSharedContentsAndOffset() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        char[] input = "xhello!".toCharArray();
        buffer.resetWithShared(input, 1, 5);
        assertEquals(5, buffer.size());
        assertEquals(1, buffer.getTextOffset());
        assertEquals("hello", buffer.contentsAsString());
        assertArrayEquals(input, buffer.getTextBuffer());
    }

    @Test
    public void testTextBufferSharedAppendUnsharesAndPreservesContent() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithShared("ab".toCharArray(), 0, 2);
        buffer.append('c');
        assertEquals("abc", buffer.contentsAsString());
        assertEquals(3, buffer.size());
        assertEquals(0, buffer.getTextOffset());
    }

    @Test
    public void testTextBufferStringAndCharacterAccess() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithString("text");
        assertFalse(buffer.hasTextAsCharacters());
        assertEquals(4, buffer.size());
        assertArrayEquals("text".toCharArray(), buffer.getTextBuffer());
        assertTrue(buffer.hasTextAsCharacters());
    }

    @Test
    public void testTextBufferCopyAppendAndReset() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithCopy("one".toCharArray(), 0, 3);
        buffer.append("two", 0, 3);
        assertEquals("onetwo", buffer.contentsAsString());
        assertEquals(6, buffer.size());
        buffer.resetWithEmpty();
        assertEquals("", buffer.contentsAsString());
        assertEquals(0, buffer.size());
    }

    @Test
    public void testTextBufferArrayDecimalAndDoubleConversions() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithString("12.50");
        assertEquals(new BigDecimal("12.50"), buffer.contentsAsDecimal());
        assertEquals(12.5, buffer.contentsAsDouble(), 0.0);
    }

    @Test
    public void testTextBufferSegmentFinishAndAggregate() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        char[] segment = buffer.emptyAndGetCurrentSegment();
        segment[0] = 'a';
        buffer.setCurrentLength(segment.length);
        char[] next = buffer.finishCurrentSegment();
        next[0] = 'b';
        buffer.setCurrentLength(1);
        assertEquals(1001, buffer.size());
        assertEquals('a', buffer.contentsAsString().charAt(0));
        assertEquals('b', buffer.contentsAsString().charAt(1000));
        assertEquals(1001, buffer.contentsAsArray().length);
    }

    @Test
    public void testTextBufferEnsureNotSharedAndRelease() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithShared("abc".toCharArray(), 0, 3);
        buffer.ensureNotShared();
        assertEquals("abc", buffer.contentsAsString());
        buffer.releaseBuffers();
        assertEquals("", buffer.contentsAsString());
        assertEquals(0, buffer.size());
    }

    @Test
    public void testGetCurrentSegmentInitialAllocation() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        char[] segment = buffer.getCurrentSegment();
        assertEquals(1000, segment.length);
        assertEquals(0, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testGetCurrentSegmentReturnsExistingSegment() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        char[] segment = buffer.emptyAndGetCurrentSegment();
        assertSame(segment, buffer.getCurrentSegment());
        assertEquals(1000, buffer.getCurrentSegment().length);
    }

    @Test
    public void testGetCurrentSegmentExpandsWhenFull() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        char[] segment = buffer.emptyAndGetCurrentSegment();
        segment[0] = 'a';
        buffer.setCurrentLength(segment.length);
        char[] expanded = buffer.getCurrentSegment();
        assertEquals(1500, expanded.length);
        assertEquals(0, buffer.getCurrentSegmentSize());
        assertEquals('a', segment[0]);
    }

    @Test
    public void testCurrentSegmentSizeTracksSetLength() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        buffer.emptyAndGetCurrentSegment();
        buffer.setCurrentLength(1);
        assertEquals(1, buffer.getCurrentSegmentSize());
        buffer.setCurrentLength(0);
        assertEquals(0, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testExpandCurrentSegmentPreservesContentAndGrowsByHalf() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        char[] segment = buffer.emptyAndGetCurrentSegment();
        segment[0] = 'q';
        char[] expanded = buffer.expandCurrentSegment();
        assertEquals(1500, expanded.length);
        assertEquals('q', expanded[0]);
        assertSame(expanded, buffer.getCurrentSegment());
    }

    @Test
    public void testExpandCurrentSegmentGrowsAgain() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        buffer.emptyAndGetCurrentSegment();
        char[] expanded = buffer.expandCurrentSegment();
        assertEquals(1500, expanded.length);
        assertSame(expanded, buffer.getCurrentSegment());
    }

    @Test
    public void testToStringForSharedText() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithShared("xvalue!".toCharArray(), 1, 5);
        assertEquals("value", buffer.toString());
    }

    @Test
    public void testToStringReflectsAppendAfterCachedContents() throws Exception {
        TextBuffer buffer = new TextBuffer(null);
        buffer.resetWithShared("a".toCharArray(), 0, 1);
        assertEquals("a", buffer.toString());
        buffer.append('b');
        assertEquals("ab", buffer.toString());
    }
}
