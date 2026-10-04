package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Base64Test {
    @Test
    public void testUrlSafeModeConstructors() throws Exception {
        assertFalse(new Base64().isUrlSafe());
        assertTrue(new Base64(true).isUrlSafe());
        assertTrue(new Base64(0, new byte[] {'\r', '\n'}, true).isUrlSafe());
    }

    @Test
    public void testIsBase64AlphabetAndPaddingBoundaries() throws Exception {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '-'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '_'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) ' '));
        assertFalse(Base64.isBase64((byte) 127));
        assertFalse(Base64.isBase64((byte) -1));
    }

    @Test
    public void testArrayBase64WhitespaceAndInvalidCharacters() throws Exception {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
        assertTrue(Base64.isArrayByteBase64(new byte[] {'A', ' ', '\t', '\r', '\n', '='}));
        assertFalse(Base64.isArrayByteBase64(new byte[] {'A', '!'}));
    }

    @Test
    public void testStandardEncodingVariants() throws Exception {
        byte[] input = new byte[] {'f'};
        assertArrayEquals(new byte[] {'Z', 'g', '=', '=', '\r', '\n'}, Base64.encodeBase64(input));
        assertEquals("Zg==\r\n", Base64.encodeBase64String(input));
        assertArrayEquals(new byte[] {'Z', 'g', '=', '=', '\r', '\n'}, Base64.encodeBase64(input, false));
        assertArrayEquals(new byte[] {'Z', 'g', '=', '=', '\r', '\n'}, Base64.encodeBase64Chunked(input));
    }

    @Test
    public void testUrlSafeEncodingOmitsPadding() throws Exception {
        assertArrayEquals(new byte[] {'Z', 'g'}, Base64.encodeBase64URLSafe(new byte[] {'f'}));
        assertEquals("Zg", Base64.encodeBase64URLSafeString(new byte[] {'f'}));
    }

    @Test
    public void testEncodingNullAndEmptyInputs() throws Exception {
        assertNull(Base64.encodeBase64((byte[]) null));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
        assertNull(Base64.encodeBase64URLSafe(null));
        assertNull(Base64.encodeBase64Chunked(null));
    }

    @Test
    public void testEncodeWithMaximumResultSizeBoundary() throws Exception {
        assertArrayEquals(new byte[] {'Z', 'g', '=', '=', '\r', '\n'},
                Base64.encodeBase64(new byte[] {'f'}, false, false, 6));
        try {
            Base64.encodeBase64(new byte[] {'f'}, false, false, 5);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testEncodeWithZeroMaximumAllowsOnlyEmptyInput() throws Exception {
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0], false, false, 0));
        try {
            Base64.encodeBase64(new byte[] {'f'}, false, false, 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testDecodeBase64StandardAndUrlSafeForms() throws Exception {
        assertArrayEquals(new byte[] {'f'}, Base64.decodeBase64("Zg=="));
        assertArrayEquals(new byte[] {'f'}, Base64.decodeBase64("Zg"));
        assertArrayEquals(new byte[] {(byte) 0xfb, (byte) 0xff}, Base64.decodeBase64("+/8="));
        assertArrayEquals(new byte[] {(byte) 0xfb, (byte) 0xff}, Base64.decodeBase64("-_8="));
    }

    @Test
    public void testDecodeIgnoresNonAlphabetBytesAndAcceptsEmpty() throws Exception {
        assertArrayEquals(new byte[] {'f'}, Base64.decodeBase64("Z!g=="));
        assertArrayEquals(new byte[0], Base64.decodeBase64(""));
        assertNull(Base64.decodeBase64((byte[]) null));
    }

    @Test
    public void testDecodeObjectAcceptsBytesAndStrings() throws Exception {
        Base64 codec = new Base64();
        assertArrayEquals(new byte[] {'f'}, (byte[]) codec.decode((Object) "Zg=="));
        assertArrayEquals(new byte[] {'f'}, (byte[]) codec.decode((Object) new byte[] {'Z', 'g', '=', '='}));
    }

    @Test
    public void testDecodeObjectRejectsOtherTypes() throws Exception {
        try {
            new Base64().decode((Object) Integer.valueOf(1));
            fail("expected DecoderException");
        } catch (DecoderException expected) {
        }
    }

    @Test
    public void testEncodeToStringAndEncodeObject() throws Exception {
        Base64 codec = new Base64();
        assertEquals("Zm9v", codec.encodeToString(new byte[] {'f', 'o', 'o'}));
        assertArrayEquals(new byte[] {'Z', 'm', '9', 'v'},
                (byte[]) codec.encode((Object) new byte[] {'f', 'o', 'o'}));
    }

    @Test
    public void testEncodeObjectRejectsOtherTypes() throws Exception {
        try {
            new Base64().encode((Object) "text");
            fail("expected EncoderException");
        } catch (EncoderException expected) {
        }
    }

    @Test
    public void testEncodingAndDecodingUnpaddedLengths() throws Exception {
        assertArrayEquals(new byte[] {'Z', 'm', '8', '=', '\r', '\n'}, Base64.encodeBase64(new byte[] {'f', 'o'}));
        assertArrayEquals(new byte[] {'f', 'o'}, Base64.decodeBase64("Zm8="));
        assertArrayEquals(new byte[] {'f', 'o', 'o'}, Base64.decodeBase64("Zm9v"));
    }

    @Test
    public void testIntegerEncodingAndDecodingByteAlignedEdges() throws Exception {
        assertArrayEquals(new byte[] {'A', 'Q', '=', '='}, Base64.encodeInteger(BigInteger.ONE));
        assertEquals(BigInteger.ONE, Base64.decodeInteger(new byte[] {'A', 'Q', '=', '='}));
        assertArrayEquals(new byte[] {'/', 'w', '=', '='}, Base64.encodeInteger(BigInteger.valueOf(255)));
        assertEquals(BigInteger.valueOf(255), Base64.decodeInteger(new byte[] {'/', 'w', '=', '='}));
    }

    @Test
    public void testIntegerEncodingPadsSubByteValues() throws Exception {
        assertArrayEquals(new byte[] {'B', 'A', '=', '='}, Base64.encodeInteger(BigInteger.valueOf(4)));
        assertEquals(BigInteger.valueOf(4), Base64.decodeInteger(new byte[] {'B', 'A', '=', '='}));
    }

    @Test
    public void testEncodingIntegerZeroAndNull() throws Exception {
        assertArrayEquals(new byte[0], Base64.encodeInteger(BigInteger.ZERO));
        try {
            Base64.encodeInteger(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testInputStreamReadDecodesBytesAndReturnsUnsignedValues() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(new byte[] {'/', 'w', '=', '='}));
        assertEquals(255, stream.read());
        assertEquals(-1, stream.read());
        assertFalse(stream.markSupported());
    }

    @Test
    public void testInputStreamCanEncodeAndReadToEnd() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new java.io.ByteArrayInputStream(new byte[] {'f'}), true);
        assertEquals('Z', stream.read());
        assertEquals('g', stream.read());
        assertEquals('=', stream.read());
        assertEquals('=', stream.read());
        assertEquals('\r', stream.read());
        assertEquals('\n', stream.read());
        assertEquals(-1, stream.read());
    }
}
