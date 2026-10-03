package org.apache.commons.lang;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Lang44NumberUtilsTest {

    @Test
    public void testSingleLowercaseLongQualifierIsRejectedAsInvalidNumber() {
        try {
            NumberUtils.createNumber("l");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
            // Correct behavior.
        } catch (StringIndexOutOfBoundsException unexpected) {
            fail("Expected NumberFormatException, but got StringIndexOutOfBoundsException");
        }
    }

    @Test
    public void testValidLongWithMultipleDigitsStillReturnsLong() {
        Number result = NumberUtils.createNumber("17l");

        assertEquals(Long.class, result.getClass());
        assertEquals(17L, result.longValue());
    }

    @Test
    public void testValidUppercaseLongWithNumericValueStillReturnsLong() {
        Number result = NumberUtils.createNumber("42L");

        assertEquals(Long.class, result.getClass());
        assertEquals(42L, result.longValue());
    }

    @Test
    public void testSingleNonNumericCharacterIsRejected() {
        try {
            NumberUtils.createNumber("x");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
            // Correct behavior.
        }
    }
}
