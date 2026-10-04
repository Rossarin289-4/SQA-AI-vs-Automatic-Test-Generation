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
    public void testDefaultModeIsNotUrlSafe() throws Exception {
        assertFalse(new Base64().isUrlSafe());
    }

    @Test
    public void testExplicitUrlSafeMode() throws Exception {
        assertTrue(new Base64(true).isUrlSafe());
    }

    @Test
    public void testAlphabetPaddingAndNonAlphabetEdges() throws Exception {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '0'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '-'));
        assertTrue(Base64.isBase64((byte) '_'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) 0));
        assertFalse(Base64.isBase64((byte) 127));
        assertFalse(Base64.isBase64((byte) -1));
    }

    @Test
    public void testArrayAlphabetAndWhitespace() throws Exception {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
        assertTrue(Base64.isArrayByteBase64(new byte[] {'A', ' ', '\r', '\n', '\t', '='}));
        assertFalse(Base64.isArrayByteBase64(new byte[] {'A', '!'}));
    }

    @Test
    public void testStandardEncoding() throws Exception {
        assertEquals("Zm9v", new String(Base64.encodeBase64(new byte[] {'f', 'o', 'o'}), "UTF-8"));
    }

    @Test
    public void testChunkedEncodingHasTrailingLineSeparatorAtExactChunk() throws Exception {
        byte[] input = new byte[57];
        assertEquals(78, Base64.encodeBase64Chunked(input).length);
        assertEquals('\r', Base64.encodeBase64Chunked(input)[76]);
        assertEquals('\n', Base64.encodeBase64Chunked(input)[77]);
    }

    @Test
    public void testChunkedEncodingDoesNotAddExtraSeparatorBelowChunkLimit() throws Exception {
        byte[] input = new byte[56];
        assertEquals(78, Base64.encodeBase64Chunked(input).length);
    }

    @Test
    public void testStringEncoding() throws Exception {
        assertEquals("Zm9v\r\n", Base64.encodeBase64String(new byte[] {'f', 'o', 'o'}));
    }

    @Test
    public void testUrlSafeEncodingUsesAlternateAlphabetAndOmitsPadding() throws Exception {
        assertEquals("-_8", new String(Base64.encodeBase64URLSafe(new byte[] {(byte) 251, (byte) 255}), "UTF-8"));
        assertEquals("-_8", Base64.encodeBase64URLSafeString(new byte[] {(byte) 251, (byte) 255}));
    }

    @Test
    public void testEmptyEncodingReturnsEmptyArray() throws Exception {
        assertEquals(0, Base64.encodeBase64(new byte[0]).length);
    }

    @Test
    public void testDecodeBase64StringAcceptsWhitespaceAndPadding() throws Exception {
        assertArrayEquals(new byte[] {'f', 'o'}, Base64.decodeBase64(" Zm8= "));
    }

    @Test
    public void testDecodeBase64ArrayAcceptsUrlAlphabetWithoutPadding() throws Exception {
        assertArrayEquals(new byte[] {(byte) 251, (byte) 255},
                Base64.decodeBase64(new byte[] {'-', '_', '8'}));
    }

    @Test
    public void testDecodeObjectStringAndByteArray() throws Exception {
        Base64 codec = new Base64();
        assertArrayEquals(new byte[] {'f'}, (byte[]) codec.decode((Object) "Zg=="));
        assertArrayEquals(new byte[] {'f'}, (byte[]) codec.decode((Object) new byte[] {'Z', 'g', '=', '='}));
    }

    @Test
    public void testDecodeObjectRejectsUnsupportedInput() throws Exception {
        try {
            new Base64().decode((Object) Integer.valueOf(1));
            fail("expected DecoderException");
        } catch (DecoderException expected) {
        }
    }

    @Test
    public void testEncodeObjectAndToString() throws Exception {
        Base64 codec = new Base64();
        assertArrayEquals(new byte[] {'Z', 'g', '=', '='},
                (byte[]) codec.encode((Object) new byte[] {'f'}));
        assertEquals("Zg==", codec.encodeToString(new byte[] {'f'}));
    }

    @Test
    public void testEncodeObjectRejectsUnsupportedInput() throws Exception {
        try {
            new Base64().encode((Object) "f");
            fail("expected EncoderException");
        } catch (EncoderException expected) {
        }
    }

    @Test
    public void testDecodeIntegerPreservesUnsignedValue() throws Exception {
        assertEquals(new BigInteger("255"), Base64.decodeInteger(new byte[] {'/','w','=','='}));
    }

    @Test
    public void testEncodeIntegerRoundTripsPositiveValues() throws Exception {
        BigInteger value = new BigInteger("128");
        assertEquals(value, Base64.decodeInteger(Base64.encodeInteger(value)));
    }

    @Test
    public void testEncodeIntegerZero() throws Exception {
        assertEquals(BigInteger.ZERO, Base64.decodeInteger(Base64.encodeInteger(BigInteger.ZERO)));
    }

    @Test
    public void testEncodeIntegerRejectsNull() throws Exception {
        try {
            Base64.encodeInteger(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }
}
