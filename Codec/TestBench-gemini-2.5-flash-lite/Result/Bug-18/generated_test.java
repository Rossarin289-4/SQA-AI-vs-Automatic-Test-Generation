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
    public void testEquals_BothNull() throws Exception {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEquals_FirstNull() throws Exception {
        assertFalse(StringUtils.equals(null, "abc"));
    }

    @Test
    public void testEquals_SecondNull() throws Exception {
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEquals_SameStringInstance() throws Exception {
        String s = "abc";
        assertTrue(StringUtils.equals(s, s));
    }

    @Test
    public void testEquals_DifferentStringInstancesEqualContent() throws Exception {
        assertTrue(StringUtils.equals("abc", new String("abc")));
    }

    @Test
    public void testEquals_DifferentStringInstancesDifferentContent() throws Exception {
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEquals_DifferentStringInstancesDifferentLength() throws Exception {
        assertFalse(StringUtils.equals("abc", "abcd"));
    }

    @Test
    public void testEquals_CharSequenceDifferentTypes() throws Exception {
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        assertTrue(StringUtils.equals(sb1, sb2));
    }

    @Test
    public void testEquals_CharSequenceDifferentTypesDifferentContent() throws Exception {
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("ABC");
        assertFalse(StringUtils.equals(sb1, sb2));
    }

    @Test
    public void testGetBytesIso8859_1_NullInput() throws Exception {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1_EmptyInput() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesIso8859_1(""));
    }

    @Test
    public void testGetBytesIso8859_1_BasicAscii() throws Exception {
        byte[] expected = {97, 98, 99}; // "abc" in ISO-8859-1
        assertArrayEquals(expected, StringUtils.getBytesIso8859_1("abc"));
    }

    @Test
    public void testGetBytesUsAscii_NullInput() throws Exception {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAscii_EmptyInput() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUsAscii(""));
    }

    @Test
    public void testGetBytesUsAscii_BasicAscii() throws Exception {
        byte[] expected = {97, 98, 99}; // "abc" in US-ASCII
        assertArrayEquals(expected, StringUtils.getBytesUsAscii("abc"));
    }

    @Test
    public void testGetBytesUtf16_NullInput() throws Exception {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16_EmptyInput() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUtf16(""));
    }

    @Test
    public void testGetBytesUtf16_BasicAscii() throws Exception {
        // For "abc", String.getBytes(UTF_16) produces a byte array starting with the BOM for UTF-16,
        // followed by the UTF-16 representation of "abc".
        // The BOM for UTF-16 (big-endian) is 0xFE 0xFF.
        // "a" is 0x0061, "b" is 0x0062, "c" is 0x0063.
        // So, the expected bytes are FE FF 00 61 00 62 00 63.
        byte[] expected = {-2, -1, 0, 97, 0, 98, 0, 99};
        assertArrayEquals(expected, StringUtils.getBytesUtf16("abc"));
    }

    @Test
    public void testGetBytesUtf16Be_NullInput() throws Exception {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16Be_EmptyInput() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUtf16Be(""));
    }

    @Test
    public void testGetBytesUtf16Be_BasicAscii() throws Exception {
        // For "abc" in UTF-16BE, it's 00 61 00 62 00 63.
        byte[] expected = {0, 97, 0, 98, 0, 99};
        assertArrayEquals(expected, StringUtils.getBytesUtf16Be("abc"));
    }

    @Test
    public void testGetBytesUtf16Le_NullInput() throws Exception {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16Le_EmptyInput() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUtf16Le(""));
    }

    @Test
    public void testGetBytesUtf16Le_BasicAscii() throws Exception {
        // For "abc" in UTF-16LE, it's 61 00 62 00 63 00.
        byte[] expected = {97, 0, 98, 0, 99, 0};
        assertArrayEquals(expected, StringUtils.getBytesUtf16Le("abc"));
    }

    @Test
    public void testGetBytesUtf8_NullInput() throws Exception {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8_EmptyInput() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUtf8(""));
    }

    @Test
    public void testGetBytesUtf8_BasicAscii() throws Exception {
        byte[] expected = {97, 98, 99}; // "abc" in UTF-8
        assertArrayEquals(expected, StringUtils.getBytesUtf8("abc"));
    }

    @Test
    public void testGetBytesUnchecked_NullInput() throws Exception {
        assertNull(StringUtils.getBytesUnchecked(null, CharEncoding.UTF_8));
    }

    @Test
    public void testGetBytesUnchecked_EmptyInput() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUnchecked("", CharEncoding.UTF_8));
    }

    @Test
    public void testGetBytesUnchecked_BasicAscii() throws Exception {
        byte[] expected = {97, 98, 99}; // "abc" in UTF-8
        assertArrayEquals(expected, StringUtils.getBytesUnchecked("abc", CharEncoding.UTF_8));
    }

    @Test
    public void testGetBytesUnchecked_UnsupportedCharset() {
        try {
            StringUtils.getBytesUnchecked("abc", "UnsupportedCharset");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testNewStringIso8859_1_NullInput() throws Exception {
        assertNull(StringUtils.newStringIso8859_1(null));
    }

    @Test
    public void testNewStringIso8859_1_EmptyInput() throws Exception {
        assertEquals("", StringUtils.newStringIso8859_1(new byte[0]));
    }

    @Test
    public void testNewStringIso8859_1_BasicAsciiBytes() throws Exception {
        byte[] bytes = {97, 98, 99}; // "abc" in ISO-8859-1
        assertEquals("abc", StringUtils.newStringIso8859_1(bytes));
    }

    @Test
    public void testNewStringUsAscii_NullInput() throws Exception {
        assertNull(StringUtils.newStringUsAscii(null));
    }

    @Test
    public void testNewStringUsAscii_EmptyInput() throws Exception {
        assertEquals("", StringUtils.newStringUsAscii(new byte[0]));
    }

    @Test
    public void testNewStringUsAscii_BasicAsciiBytes() throws Exception {
        byte[] bytes = {97, 98, 99}; // "abc" in US-ASCII
        assertEquals("abc", StringUtils.newStringUsAscii(bytes));
    }

    @Test
    public void testNewStringUtf16_NullInput() throws Exception {
        assertNull(StringUtils.newStringUtf16(null));
    }

    @Test
    public void testNewStringUtf16_EmptyInput() throws Exception {
        assertEquals("", StringUtils.newStringUtf16(new byte[0]));
    }

    @Test
    public void testNewStringUtf16_BasicAsciiBytes() throws Exception {
        // For "abc" in UTF-16, the String constructor expects the BOM if present.
        // If no BOM is present, it defaults to Big Endian.
        // So, bytes FE FF 00 61 00 62 00 63 should decode to "abc".
        byte[] bytes = {-2, -1, 0, 97, 0, 98, 0, 99};
        assertEquals("abc", StringUtils.newStringUtf16(bytes));
    }

    @Test
    public void testNewStringUtf16Be_NullInput() throws Exception {
        assertNull(StringUtils.newStringUtf16Be(null));
    }

    @Test
    public void testNewStringUtf16Be_EmptyInput() throws Exception {
        assertEquals("", StringUtils.newStringUtf16Be(new byte[0]));
    }

    @Test
    public void testNewStringUtf16Be_BasicAsciiBytes() throws Exception {
        // For "abc" in UTF-16BE, the bytes are 00 61 00 62 00 63.
        byte[] bytes = {0, 97, 0, 98, 0, 99};
        assertEquals("abc", StringUtils.newStringUtf16Be(bytes));
    }

    @Test
    public void testNewStringUtf16Le_NullInput() throws Exception {
        assertNull(StringUtils.newStringUtf16Le(null));
    }

    @Test
    public void testNewStringUtf16Le_EmptyInput() throws Exception {
        assertEquals("", StringUtils.newStringUtf16Le(new byte[0]));
    }

    @Test
    public void testNewStringUtf16Le_BasicAsciiBytes() throws Exception {
        // For "abc" in UTF-16LE, the bytes are 61 00 62 00 63 00.
        byte[] bytes = {97, 0, 98, 0, 99, 0};
        assertEquals("abc", StringUtils.newStringUtf16Le(bytes));
    }

    @Test
    public void testNewStringUtf8_NullInput() throws Exception {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testNewStringUtf8_EmptyInput() throws Exception {
        assertEquals("", StringUtils.newStringUtf8(new byte[0]));
    }

    @Test
    public void testNewStringUtf8_BasicAsciiBytes() throws Exception {
        byte[] bytes = {97, 98, 99}; // "abc" in UTF-8
        assertEquals("abc", StringUtils.newStringUtf8(bytes));
    }

    @Test
    public void testNewString_NullInput() throws Exception {
        assertNull(StringUtils.newString(null, CharEncoding.UTF_8));
    }

    @Test
    public void testNewString_EmptyInput() throws Exception {
        assertEquals("", StringUtils.newString(new byte[0], CharEncoding.UTF_8));
    }

    @Test
    public void testNewString_BasicAsciiBytes() throws Exception {
        byte[] bytes = {97, 98, 99}; // "abc" in UTF-8
        assertEquals("abc", StringUtils.newString(bytes, CharEncoding.UTF_8));
    }

    @Test
    public void testNewString_UnsupportedCharset() {
        try {
            StringUtils.newString(new byte[0], "UnsupportedCharset");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testGetByteBufferUtf8_NullInput() throws Exception {
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetByteBufferUtf8_EmptyInput() throws Exception {
        // When creating a ByteBuffer from an empty byte array, the resulting ByteBuffer
        // should have an empty backing array.
        ByteBuffer expected = ByteBuffer.wrap(new byte[0]);
        ByteBuffer actual = StringUtils.getByteBufferUtf8("");
        assertEquals(expected.array().length, actual.array().length);
        assertEquals(0, actual.array().length);
    }

    @Test
    public void testGetByteBufferUtf8_BasicAscii() throws Exception {
        // For "abc" in UTF-8, the bytes are 97, 98, 99.
        ByteBuffer expected = ByteBuffer.wrap(new byte[]{97, 98, 99});
        ByteBuffer actual = StringUtils.getByteBufferUtf8("abc");
        assertArrayEquals(expected.array(), actual.array());
    }
}
