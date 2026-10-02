package org.apache.commons.codec.binary;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CharSequenceUtilsAI13Test {

    @Test
    public void testRegionMatchesString() {
        assertTrue(CharSequenceUtils.regionMatches("hello", false, 1, "el", 0, 2));
        assertFalse(CharSequenceUtils.regionMatches("hello", false, 1, "EL", 0, 2));
        assertTrue(CharSequenceUtils.regionMatches("hello", true, 1, "EL", 0, 2));
    }

    @Test
    public void testRegionMatchesStringBuilder() {
        StringBuilder cs = new StringBuilder("hello");
        StringBuilder sub = new StringBuilder("EL");
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 1, sub, 0, 2));
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 1, sub, 0, 2));
    }

    @Test
    public void testRegionMatchesMismatch() {
        StringBuilder cs = new StringBuilder("hello");
        StringBuilder sub = new StringBuilder("lx");
        assertFalse(CharSequenceUtils.regionMatches(cs, true, 1, sub, 0, 2));
    }
}
