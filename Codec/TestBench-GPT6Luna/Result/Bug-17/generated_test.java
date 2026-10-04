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
    public void testEqualsNullInputs() throws Exception {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "x"));
        assertFalse(StringUtils.equals("x", null));
    }

    @Test
    public void testEqualsStringComparison() throws Exception {
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsNonStringSequences() throws Exception {
        CharSequence first = new StringBuilder("cat");
        CharSequence same = new StringBuilder("cat");
        assertTrue(StringUtils.equals(first, same));
    }

    @Test
    public void testEqualsEmptySequences() throws Exception {
        assertTrue(StringUtils.equals("", new StringBuilder()));
    }

    @Test
    public void testGetByteBufferUtf8Contents() throws Exception {
        ByteBuffer result = StringUtils.getByteBufferUtf8("A\u00e9");
        assertArrayEquals(new byte[] {65, (byte) 0xc3, (byte) 0xa9}, result.array());
        assertEquals(0, result.position());
        assertEquals(3, result.limit());
    }

    @Test
    public void testGetByteBufferUtf8Null() throws Exception {
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetBytesIso8859OneAndNull() throws Exception {
        assertArrayEquals(new byte[] {65, (byte) 0xe9}, StringUtils.getBytesIso8859_1("A\u00e9"));
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesUncheckedEncodingAndNull() throws Exception {
        assertArrayEquals(new byte[] {(byte) 0xc3, (byte) 0xa9},
                StringUtils.getBytesUnchecked("\u00e9", "UTF-8"));
        assertNull(StringUtils.getBytesUnchecked(null, "not-a-charset"));
    }

    @Test
    public void testGetBytesUncheckedInvalidEncoding() throws Exception {
        try {
            StringUtils.getBytesUnchecked("x", "not-a-charset");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testGetBytesUsAsciiAndNull() throws Exception {
        assertArrayEquals(new byte[] {65, 66}, StringUtils.getBytesUsAscii("AB"));
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUtf16IncludesBom() throws Exception {
        assertArrayEquals(new byte[] {(byte) 0xfe, (byte) 0xff, 0, 65},
                StringUtils.getBytesUtf16("A"));
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
    public void testGetBytesUtf8AsciiAndNull() throws Exception {
        assertArrayEquals(new byte[] {0, 65, 127}, StringUtils.getBytesUtf8("\u0000A\u007f"));
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testNewStringNamedCharsetAndNull() throws Exception {
        assertEquals("A\u00e9", StringUtils.newString(new byte[] {65, (byte) 0xe9}, "ISO-8859-1"));
        assertNull(StringUtils.newString(null, "not-a-charset"));
    }

    @Test
    public void testNewStringInvalidCharset() throws Exception {
        try {
            StringUtils.newString(new byte[] {65}, "not-a-charset");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testNewStringIso8859OneAndNull() throws Exception {
        assertEquals("A\u00e9", StringUtils.newStringIso8859_1(new byte[] {65, (byte) 0xe9}));
        assertNull(StringUtils.newStringIso8859_1(null));
    }

    @Test
    public void testNewStringUsAscii() throws Exception {
        assertEquals("AB", StringUtils.newStringUsAscii(new byte[] {65, 66}));
        assertNull(StringUtils.newStringUsAscii(null));
    }

    @Test
    public void testNewStringUtf16WithBom() throws Exception {
        assertEquals("A", StringUtils.newStringUtf16(new byte[] {(byte) 0xfe, (byte) 0xff, 0, 65}));
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
    public void testNewStringUtf8AndNull() throws Exception {
        assertEquals("\u00e9", StringUtils.newStringUtf8(new byte[] {(byte) 0xc3, (byte) 0xa9}));
        assertNull(StringUtils.newStringUtf8(null));
    }
}
