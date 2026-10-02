package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilsAI13Test {

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
        assertTrue(StringUtils.equals(new StringBuilder("abc"), "abc"));
    }

    @Test
    public void testGetBytesIso8859_1() {
        assertNull(StringUtils.getBytesIso8859_1(null));
        byte[] encoded = StringUtils.getBytesIso8859_1("abc");
        assertArrayEquals(new byte[] { 97, 98, 99 }, encoded);
    }

    @Test
    public void testNewStringUsAscii() {
        assertNull(StringUtils.newStringUsAscii(null));
        String decoded = StringUtils.newStringUsAscii(new byte[] { 97, 98, 99 });
        assertEquals("abc", decoded);
    }
}
