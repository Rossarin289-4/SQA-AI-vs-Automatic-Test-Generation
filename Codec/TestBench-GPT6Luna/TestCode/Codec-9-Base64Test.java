package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Base64Test {
    @Test
    public void testUrlSafeMode() throws Exception {
        assertFalse(new Base64().isUrlSafe());
        assertTrue(new Base64(true).isUrlSafe());
    }

    @Test
    public void testBase64AlphabetEdges() throws Exception {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '-'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) ':'));
        assertFalse(Base64.isBase64((byte) 127));
        assertFalse(Base64.isBase64((byte) -1));
    }

    @Test
    public void testDeprecatedArrayValidator() throws Exception {
        assertTrue(Base64.isArrayByteBase64(new byte[] {'A', ' ', '\n', '='}));
        assertFalse(Base64.isArrayByteBase64(new byte[] {'A', '!'}));
    }

    @Test
    public void testEncodeBase64() throws Exception {
        assertEquals("AQID", new String(Base64.encodeBase64(new byte[] {1, 2, 3}), "UTF-8"));
    }

    @Test
    public void testEncodeBase64String() throws Exception {
        assertEquals("AQ==", Base64.encodeBase64String(new byte[] {1}));
    }

    @Test
    public void testEncodeUrlSafeBytes() throws Exception {
        assertEquals("-___", new String(Base64.encodeBase64URLSafe(new byte[] {(byte) 251, (byte) 255, (byte) 255}), "UTF-8"));
    }

    @Test
    public void testEncodeUrlSafeString() throws Exception {
        assertEquals("-w", Base64.encodeBase64URLSafeString(new byte[] {(byte) 251}));
    }

    @Test
    public void testEncodeChunkedAtLineBoundary() throws Exception {
        byte[] input = new byte[57];
        byte[] encoded = Base64.encodeBase64Chunked(input);
        assertEquals(78, encoded.length);
        assertEquals('\r', encoded[76]);
        assertEquals('\n', encoded[77]);
    }

    @Test
    public void testDecodeObjectByteArray() throws Exception {
        assertArrayEquals(new byte[] {1, 2, 3}, (byte[]) new Base64().decode((Object) "AQID".getBytes("UTF-8")));
    }

    @Test
    public void testDecodeObjectString() throws Exception {
        assertArrayEquals(new byte[] {1}, (byte[]) new Base64().decode((Object) "AQ=="));
    }

    @Test
    public void testDecodeObjectRejectsOtherType() throws Exception {
        try {
            new Base64().decode((Object) Integer.valueOf(1));
            fail("expected DecoderException");
        } catch (DecoderException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testDecodeBase64StringWithWhitespace() throws Exception {
        assertArrayEquals(new byte[] {1, 2, 3}, Base64.decodeBase64("A Q\nI D"));
    }

    @Test
    public void testEncodeObject() throws Exception {
        assertArrayEquals("AQID".getBytes("UTF-8"), (byte[]) new Base64().encode((Object) new byte[] {1, 2, 3}));
    }

    @Test
    public void testEncodeObjectRejectsOtherType() throws Exception {
        try {
            new Base64().encode((Object) "text");
            fail("expected EncoderException");
        } catch (EncoderException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testEncodeToString() throws Exception {
        assertEquals("AQ==", new Base64().encodeToString(new byte[] {1}));
    }

    @Test
    public void testDecodeInteger() throws Exception {
        assertEquals(BigInteger.valueOf(255), Base64.decodeInteger(" /w==".trim().getBytes("UTF-8")));
    }

    @Test
    public void testEncodeIntegerWithLeadingZeroByte() throws Exception {
        assertArrayEquals("AQ==".getBytes("UTF-8"), Base64.encodeInteger(BigInteger.ONE));
    }

    @Test
    public void testEncodeIntegerNull() throws Exception {
        try {
            Base64.encodeInteger(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertNotNull(expected);
        }
    }
}
