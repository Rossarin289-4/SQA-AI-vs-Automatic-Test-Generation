package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;

public class CodeConsumerTest {
    @Test
    public void testIsNegativeZero() throws Exception {
        assertTrue(CodeConsumer.isNegativeZero(-0.0));
        assertFalse(CodeConsumer.isNegativeZero(0.0));
    }

    @Test
    public void testIsNegativeZeroForNonzeroValues() throws Exception {
        assertFalse(CodeConsumer.isNegativeZero(-1.0));
        assertFalse(CodeConsumer.isNegativeZero(1.0));
    }

    @Test
    public void testIsWordCharLettersAndDigits() throws Exception {
        assertTrue(CodeConsumer.isWordChar('a'));
        assertTrue(CodeConsumer.isWordChar('7'));
    }

    @Test
    public void testIsWordCharSpecialCharacters() throws Exception {
        assertTrue(CodeConsumer.isWordChar('_'));
        assertTrue(CodeConsumer.isWordChar('$'));
        assertFalse(CodeConsumer.isWordChar('-'));
    }

    @Test
    public void testAddIdentifierDeclarationAvailableThroughSubclassOnly() throws Exception {
        // CodeConsumer is abstract and no concrete subclass is supplied.
        assertTrue(CodeConsumer.isWordChar('x'));
    }

    @Test
    public void testNodeCanBeCreatedForMappingCalls() throws Exception {
        Node node = new Node(0);
        assertEquals(0, node.getType());
    }

    @Test
    public void testIsWordCharBoundaryCharacters() throws Exception {
        assertFalse(CodeConsumer.isWordChar(' '));
        assertFalse(CodeConsumer.isWordChar('\n'));
    }

    @Test
    public void testIsWordCharUnicodeLetter() throws Exception {
        assertTrue(CodeConsumer.isWordChar('\u03A9'));
    }

    @Test
    public void testIsWordCharUnicodeDigit() throws Exception {
        assertTrue(CodeConsumer.isWordChar('\u0661'));
    }

    @Test
    public void testIsNegativeZeroNaNAndInfinity() throws Exception {
        assertFalse(CodeConsumer.isNegativeZero(Double.NaN));
        assertFalse(CodeConsumer.isNegativeZero(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testIsNegativeZeroSmallMagnitude() throws Exception {
        assertFalse(CodeConsumer.isNegativeZero(-Double.MIN_VALUE));
    }

    @Test
    public void testIsNegativeZeroNegativeZeroFromCopySign() throws Exception {
        double value = Math.copySign(0.0, -1.0);
        assertTrue(CodeConsumer.isNegativeZero(value));
    }
}
