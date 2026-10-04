package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.Charsets;

public class StringUtilsTest {
    @Test
    public void testEqualsBothNull() throws Exception {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEqualsSameStringAndCaseSensitive() throws Exception {
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsOneNull() throws Exception {
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEqualsDifferentLengths() throws Exception {
        assertFalse(StringUtils.equals("a", "ab"));
    }

    @Test
    public void testEqualsNonStringSequences() throws Exception {
        assertTrue(StringUtils.equals(new StringBuilder("abc"), new StringBuilder("abc")));
        assertFalse(StringUtils.equals(new StringBuilder("abc"), new StringBuilder("abC")));
    }

    @Test
    public void testGetByteBufferUtf8() throws Exception {
        ByteBuffer buffer = StringUtils.getByteBufferUtf8("A\u00e9");
        assertArrayEquals(new byte[] {65, (byte) 0xc3, (byte) 0xa9}, buffer.array());
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetBytesIso88591() throws Exception {
        assertArrayEquals(new byte[] {65, (byte) 0xe9}, StringUtils.getBytesIso8859_1("A\u00e9"));
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesUnchecked() throws Exception {
        assertArrayEquals(new byte[] {65, (byte) 0xc3, (byte) 0xa9},
                StringUtils.getBytesUnchecked("A\u00e9", CharEncoding.UTF_8));
        assertNull(StringUtils.getBytesUnchecked(null, "not-a-charset"));
    }

    @Test
    public void testGetBytesUncheckedUnsupportedCharset() throws Exception {
        try {
            StringUtils.getBytesUnchecked("x", "not-a-charset");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testGetBytesUsAscii() throws Exception {
        assertArrayEquals(new byte[] {65, 66}, StringUtils.getBytesUsAscii("AB"));
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUtf16() throws Exception {
        assertArrayEquals("A".getBytes(Charsets.UTF_16), StringUtils.getBytesUtf16("A"));
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16Be() throws Exception {
        assertArrayEquals(new byte[] {0, 65}, StringUtils.getBytesUtf16Be("A"));
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16Le() throws Exception {
        assertArrayEquals(new byte[] {65, 0}, StringUtils.getBytesUtf16Le("A"));
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf8() throws Exception {
        assertArrayEquals(new byte[] {65, (byte) 0xc3, (byte) 0xa9}, StringUtils.getBytesUtf8("A\u00e9"));
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testNewStringNamedCharset() throws Exception {
        assertEquals("A\u00e9", StringUtils.newString(
                new byte[] {65, (byte) 0xc3, (byte) 0xa9}, CharEncoding.UTF_8));
        assertNull(StringUtils.newString(null, "not-a-charset"));
    }

    @Test
    public void testNewStringNamedCharsetUnsupported() throws Exception {
        try {
            StringUtils.newString(new byte[] {65}, "not-a-charset");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testNewStringIso88591() throws Exception {
        assertEquals("A\u00e9", StringUtils.newStringIso8859_1(new byte[] {65, (byte) 0xe9}));
        assertNull(StringUtils.newStringIso8859_1(null));
    }

    @Test
    public void testNewStringUsAscii() throws Exception {
        assertEquals("AB", StringUtils.newStringUsAscii(new byte[] {65, 66}));
        assertNull(StringUtils.newStringUsAscii(null));
    }

    @Test
    public void testNewStringUtf16() throws Exception {
        byte[] encoded = "A".getBytes(Charsets.UTF_16);
        assertEquals("A", StringUtils.newStringUtf16(encoded));
        assertNull(StringUtils.newStringUtf16(null));
    }

    @Test
    public void testNewStringUtf16Be() throws Exception {
        assertEquals("A", StringUtils.newStringUtf16Be(new byte[] {0, 65}));
        assertNull(StringUtils.newStringUtf16Be(null));
    }

    @Test
    public void testNewStringUtf16Le() throws Exception {
        assertEquals("A", StringUtils.newStringUtf16Le(new byte[] {65, 0}));
        assertNull(StringUtils.newStringUtf16Le(null));
    }

    @Test
    public void testNewStringUtf8() throws Exception {
        assertEquals("A\u00e9", StringUtils.newStringUtf8(new byte[] {65, (byte) 0xc3, (byte) 0xa9}));
        assertNull(StringUtils.newStringUtf8(null));
    }
}
