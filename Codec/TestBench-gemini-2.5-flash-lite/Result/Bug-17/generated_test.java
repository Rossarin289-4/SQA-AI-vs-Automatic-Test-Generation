package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.Charsets;

public class StringUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEquals_Nulls() throws Exception {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEquals_SameString() throws Exception {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEquals_DifferentStrings() throws Exception {
        assertFalse(StringUtils.equals("abc", "ABC"));
        assertFalse(StringUtils.equals("abc", "def"));
    }

    @Test
    public void testEquals_DifferentLengths() throws Exception {
        assertFalse(StringUtils.equals("abc", "abcd"));
        assertFalse(StringUtils.equals("abcd", "abc"));
    }

    @Test
    public void testEquals_EmptyStrings() throws Exception {
        assertTrue(StringUtils.equals("", ""));
        assertFalse(StringUtils.equals("", "abc"));
        assertFalse(StringUtils.equals("abc", ""));
    }

    @Test
    public void testGetBytesIso8859_1_Null() throws Exception {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1_Empty() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesIso8859_1(""));
    }

    @Test
    public void testGetBytesIso8859_1_AsciiChars() throws Exception {
        byte[] expected = {(byte) 0x61, (byte) 0x62, (byte) 0x63}; // "abc"
        assertArrayEquals(expected, StringUtils.getBytesIso8859_1("abc"));
    }

    @Test
    public void testGetBytesIso8859_1_ExtendedChars() throws Exception {
        byte[] expectedIso = {(byte) 0xE9}; // 'é' in ISO-8859-1
        assertArrayEquals(expectedIso, StringUtils.getBytesIso8859_1("é"));
    }

    @Test
    public void testGetBytesUnchecked_Null() throws Exception {
        assertNull(StringUtils.getBytesUnchecked(null, CharEncoding.UTF_8));
    }

    @Test
    public void testGetBytesUnchecked_Empty() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUnchecked("", CharEncoding.UTF_8));
    }

    @Test
    public void testGetBytesUnchecked_ValidCharset() throws Exception {
        byte[] expected = {(byte) 0x61, (byte) 0x62, (byte) 0x63}; // "abc"
        assertArrayEquals(expected, StringUtils.getBytesUnchecked("abc", CharEncoding.US_ASCII));
    }

    @Test
    public void testGetBytesUnchecked_InvalidCharset() throws Exception {
        try {
            StringUtils.getBytesUnchecked("abc", "INVALID_CHARSET");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testGetBytesUsAscii_Null() throws Exception {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAscii_Empty() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUsAscii(""));
    }

    @Test
    public void testGetBytesUsAscii_AsciiChars() throws Exception {
        byte[] expected = {(byte) 0x61, (byte) 0x62, (byte) 0x63}; // "abc"
        assertArrayEquals(expected, StringUtils.getBytesUsAscii("abc"));
    }

    @Test
    public void testGetBytesUtf16_Null() throws Exception {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16_Empty() throws Exception {
        // UTF-16 of empty string is an empty byte array
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUtf16(""));
    }

    @Test
    public void testGetBytesUtf16_Chars() throws Exception {
        // "ab" in UTF-16BE is 00 61 00 62.
        byte[] expected = {(byte) 0x00, (byte) 0x61, (byte) 0x00, (byte) 0x62}; // "ab"
        assertArrayEquals(expected, StringUtils.getBytesUtf16("ab"));
    }

    @Test
    public void testGetBytesUtf16Be_Null() throws Exception {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16Be_Empty() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUtf16Be(""));
    }

    @Test
    public void testGetBytesUtf16Be_Chars() throws Exception {
        byte[] expected = {(byte) 0x00, (byte) 0x61, (byte) 0x00, (byte) 0x62}; // "ab"
        assertArrayEquals(expected, StringUtils.getBytesUtf16Be("ab"));
    }

    @Test
    public void testGetBytesUtf16Le_Null() throws Exception {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16Le_Empty() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUtf16Le(""));
    }

    @Test
    public void testGetBytesUtf16Le_Chars() throws Exception {
        byte[] expected = {(byte) 0x61, (byte) 0x00, (byte) 0x62, (byte) 0x00}; // "ab"
        assertArrayEquals(expected, StringUtils.getBytesUtf16Le("ab"));
    }

    @Test
    public void testGetBytesUtf8_Null() throws Exception {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8_Empty() throws Exception {
        byte[] expected = new byte[0];
        assertArrayEquals(expected, StringUtils.getBytesUtf8(""));
    }

    @Test
    public void testGetBytesUtf8_AsciiChars() throws Exception {
        byte[] expected = {(byte) 0x61, (byte) 0x62, (byte) 0x63}; // "abc"
        assertArrayEquals(expected, StringUtils.getBytesUtf8("abc"));
    }

    @Test
    public void testGetBytesUtf8_ExtendedChars() throws Exception {
        byte[] expected = {(byte) 0xC3, (byte) 0xA9}; // "é" in UTF-8
        assertArrayEquals(expected, StringUtils.getBytesUtf8("é"));
    }

    @Test
    public void testGetByteBufferUtf8_Null() throws Exception {
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetByteBufferUtf8_Empty() throws Exception {
        ByteBuffer expected = ByteBuffer.wrap(new byte[0]);
        // Comparing arrays directly is more robust than comparing their string representations.
        assertArrayEquals(expected.array(), StringUtils.getByteBufferUtf8("").array());
    }

    @Test
    public void testGetByteBufferUtf8_Chars() throws Exception {
        byte[] bytes = {(byte) 0x61, (byte) 0x62, (byte) 0x63}; // "abc"
        ByteBuffer expected = ByteBuffer.wrap(bytes);
        // Comparing arrays directly is more robust than comparing their string representations.
        assertArrayEquals(expected.array(), StringUtils.getByteBufferUtf8("abc").array());
    }

    @Test
    public void testNewString_NullBytes() throws Exception {
        assertNull(StringUtils.newString((byte[]) null, CharEncoding.UTF_8));
    }

    @Test
    public void testNewString_EmptyBytes() throws Exception {
        String expected = "";
        assertEquals(expected, StringUtils.newString(new byte[0], CharEncoding.UTF_8));
    }

    @Test
    public void testNewString_ValidBytesAndCharset() throws Exception {
        byte[] bytes = {(byte) 0x61, (byte) 0x62, (byte) 0x63}; // "abc"
        String expected = "abc";
        assertEquals(expected, StringUtils.newString(bytes, CharEncoding.US_ASCII));
    }

    @Test
    public void testNewString_InvalidCharset() throws Exception {
        byte[] bytes = {(byte) 0x61};
        try {
            StringUtils.newString(bytes, "INVALID_CHARSET");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testNewStringIso8859_1_NullBytes() throws Exception {
        assertNull(StringUtils.newStringIso8859_1(null));
    }

    @Test
    public void testNewStringIso8859_1_EmptyBytes() throws Exception {
        String expected = "";
        assertEquals(expected, StringUtils.newStringIso8859_1(new byte[0]));
    }

    @Test
    public void testNewStringIso8859_1_Bytes() throws Exception {
        byte[] bytes = {(byte) 0xE9}; // 'é' in ISO-8859-1
        String expected = "é";
        assertEquals(expected, StringUtils.newStringIso8859_1(bytes));
    }

    @Test
    public void testNewStringUsAscii_NullBytes() throws Exception {
        assertNull(StringUtils.newStringUsAscii(null));
    }

    @Test
    public void testNewStringUsAscii_EmptyBytes() throws Exception {
        String expected = "";
        assertEquals(expected, StringUtils.newStringUsAscii(new byte[0]));
    }

    @Test
    public void testNewStringUsAscii_Bytes() throws Exception {
        byte[] bytes = {(byte) 0x61, (byte) 0x62, (byte) 0x63}; // "abc"
        String expected = "abc";
        assertEquals(expected, StringUtils.newStringUsAscii(bytes));
    }

    @Test
    public void testNewStringUtf16_NullBytes() throws Exception {
        assertNull(StringUtils.newStringUtf16(null));
    }

    @Test
    public void testNewStringUtf16_EmptyBytes() throws Exception {
        String expected = "";
        assertEquals(expected, StringUtils.newStringUtf16(new byte[0]));
    }

    @Test
    public void testNewStringUtf16_Bytes() throws Exception {
        // UTF-16BE for "ab"
        byte[] bytes = {(byte) 0x00, (byte) 0x61, (byte) 0x00, (byte) 0x62};
        String expected = "ab";
        assertEquals(expected, StringUtils.newStringUtf16(bytes));
    }

    @Test
    public void testNewStringUtf16Be_NullBytes() throws Exception {
        assertNull(StringUtils.newStringUtf16Be(null));
    }

    @Test
    public void testNewStringUtf16Be_EmptyBytes() throws Exception {
        String expected = "";
        assertEquals(expected, StringUtils.newStringUtf16Be(new byte[0]));
    }

    @Test
    public void testNewStringUtf16Be_Bytes() throws Exception {
        byte[] bytes = {(byte) 0x00, (byte) 0x61, (byte) 0x00, (byte) 0x62}; // "ab"
        String expected = "ab";
        assertEquals(expected, StringUtils.newStringUtf16Be(bytes));
    }

    @Test
    public void testNewStringUtf16Le_NullBytes() throws Exception {
        assertNull(StringUtils.newStringUtf16Le(null));
    }

    @Test
    public void testNewStringUtf16Le_EmptyBytes() throws Exception {
        String expected = "";
        assertEquals(expected, StringUtils.newStringUtf16Le(new byte[0]));
    }

    @Test
    public void testNewStringUtf16Le_Bytes() throws Exception {
        byte[] bytes = {(byte) 0x61, (byte) 0x00, (byte) 0x62, (byte) 0x00}; // "ab"
        String expected = "ab";
        assertEquals(expected, StringUtils.newStringUtf16Le(bytes));
    }

    @Test
    public void testNewStringUtf8_NullBytes() throws Exception {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testNewStringUtf8_EmptyBytes() throws Exception {
        String expected = "";
        assertEquals(expected, StringUtils.newStringUtf8(new byte[0]));
    }

    @Test
    public void testNewStringUtf8_Bytes() throws Exception {
        byte[] bytes = {(byte) 0x61, (byte) 0x62, (byte) 0x63}; // "abc"
        String expected = "abc";
        assertEquals(expected, StringUtils.newStringUtf8(bytes));
    }

    @Test
    public void testNewStringUtf8_ExtendedBytes() throws Exception {
        byte[] bytes = {(byte) 0xC3, (byte) 0xA9}; // "é" in UTF-8
        String expected = "é";
        assertEquals(expected, StringUtils.newStringUtf8(bytes));
    }
}
