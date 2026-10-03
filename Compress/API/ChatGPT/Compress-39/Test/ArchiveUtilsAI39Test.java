package org.apache.commons.compress.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArchiveUtilsAI39Test {

    @Test
    public void testAsciiConversionAndMatching() {
        byte[] bytes = ArchiveUtils.toAsciiBytes("test");
        assertTrue(ArchiveUtils.matchAsciiBuffer("test", bytes));
        assertEquals("test", ArchiveUtils.toAsciiString(bytes));
        assertEquals("es", ArchiveUtils.toAsciiString(bytes, 1, 2));
    }

    @Test
    public void testIsEqualWithTrailingNulls() {
        byte[] b1 = new byte[] { 'a', 'b', 0, 0 };
        byte[] b2 = new byte[] { 'a', 'b' };
        assertTrue(ArchiveUtils.isEqual(b1, 0, 4, b2, 0, 2, true));
        assertFalse(ArchiveUtils.isEqual(b1, 0, 4, b2, 0, 2, false));
    }

    @Test
    public void testIsArrayZeroAndSanitize() {
        byte[] zeros = new byte[] { 0, 0, 0 };
        assertTrue(ArchiveUtils.isArrayZero(zeros, 3));

        String sanitized = ArchiveUtils.sanitize("hello\nworld");
        assertEquals("hello?world", sanitized);
    }
}
