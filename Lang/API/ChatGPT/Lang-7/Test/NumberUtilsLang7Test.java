package org.apache.commons.lang3.math;

import org.junit.Test;

import static org.junit.Assert.fail;

public class NumberUtilsLang7Test {

    /**
     * A string beginning with two minus signs is not a valid integer.
     *
     * The buggy implementation returns null because of its special
     * leading "--" check. The fixed implementation rejects the input
     * with NumberFormatException.
     */
    @Test
    public void testDoubleMinusIntegerIsRejected() {
        try {
            NumberUtils.createNumber("--42");
            fail("Expected NumberFormatException for malformed double-minus integer");
        } catch (NumberFormatException expected) {
            // Expected behavior.
        }
    }

    /**
     * A string beginning with two minus signs is not a valid decimal number.
     *
     * This exercises the decimal parsing path independently of the
     * integer-like case.
     */
    @Test
    public void testDoubleMinusDecimalIsRejected() {
        try {
            NumberUtils.createNumber("--3.75");
            fail("Expected NumberFormatException for malformed double-minus decimal");
        } catch (NumberFormatException expected) {
            // Expected behavior.
        }
    }

    /**
     * A string beginning with two minus signs is not a valid
     * scientific-notation number.
     *
     * The malformed sign must not be silently converted into null.
     */
    @Test
    public void testDoubleMinusScientificNumberIsRejected() {
        try {
            NumberUtils.createNumber("--6E4");
            fail("Expected NumberFormatException for malformed scientific number");
        } catch (NumberFormatException expected) {
            // Expected behavior.
        }
    }

    /**
     * A double-minus prefix must also be rejected when the remainder
     * resembles a hexadecimal literal.
     *
     * The malformed sign combination is invalid independently of the
     * numeric representation that follows it.
     */
    @Test
    public void testDoubleMinusHexadecimalLikeNumberIsRejected() {
        try {
            NumberUtils.createNumber("--0x2A");
            fail("Expected NumberFormatException for malformed hexadecimal number");
        } catch (NumberFormatException expected) {
            // Expected behavior.
        }
    }
}
