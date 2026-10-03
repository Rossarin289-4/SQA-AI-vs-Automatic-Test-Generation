package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

public class BooleanUtilsStringFallThroughTest {

    @Test
    public void testToBooleanStringLength3FallThrough() {
        // Test 3-character strings starting with characters other than 'y' or 'Y'
        // Buggy version falls through case 3 into case 4, potentially yielding incorrect evaluations.
        assertFalse(BooleanUtils.toBoolean("foo"));
        assertFalse(BooleanUtils.toBoolean("bar"));
        assertFalse(BooleanUtils.toBoolean("abc"));
        assertFalse(BooleanUtils.toBoolean("not"));
    }

    @Test
    public void testToBooleanStringLength3InvalidSuffix() {
        // Test 3-character strings starting with 'y' or 'Y' but invalid suffixes
        assertFalse(BooleanUtils.toBoolean("yab"));
        assertFalse(BooleanUtils.toBoolean("Y12"));
        assertFalse(BooleanUtils.toBoolean("y_s"));
    }

    @Test
    public void testToBooleanStringLength3Valid() {
        // Ensure valid 3-character true strings still return true correctly
        assertTrue(BooleanUtils.toBoolean("yes"));
        assertTrue(BooleanUtils.toBoolean("YES"));
        assertTrue(BooleanUtils.toBoolean("Yes"));
    }
}
