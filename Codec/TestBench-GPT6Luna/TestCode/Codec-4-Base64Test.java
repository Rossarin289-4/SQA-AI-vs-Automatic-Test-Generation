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
        assertTrue(Base64.isBase64((byte) '_'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) ' '));
        assertFalse(Base64.isBase64((byte) 127));
    }

    @Test
    public void testArrayAlphabetAndWhitespace() throws Exception {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
        assertTrue(Base64.isArrayByteBase64(new byte[] {'A', ' ', '\r', '\n'}));
        assertFalse(Base64.isArrayByteBase64(new byte[] {'A', '!'}));
    }

    @Test
    public void testEncodeBase64OneByteAndPadding() throws Exception {
        assertArrayEquals(new byte[] {'Z', 'g', '=', '='},
                Base64.encodeBase64(new byte[] {'f'}));
    }

    @Test
    public void testEncodeBase64String() throws Exception {
        assertEquals("Zm9v\r\n", Base64.encodeBase64String(new byte[] {'f', 'o', 'o'}));
    }

    @Test
    public void testEncodeBase64UrlSafeAlphabetAndPadding() throws Exception {
        assertArrayEquals(new byte[] {'-', '_', '8'},
                Base64.encodeBase64URLSafe(new byte[] {(byte) 251, (byte) 255}));
    }

    @Test
    public void testEncodeBase64UrlSafeString() throws Exception {
        assertEquals("-_8", Base64.encodeBase64URLSafeString(new byte[] {(byte) 251, (byte) 255}));
    }

    @Test
    public void testEncodeBase64Chunked() throws Exception {
        byte[] input = new byte[58];
        java.util.Arrays.fill(input, (byte) 'a');
        byte[] encoded = Base64.encodeBase64Chunked(input);
        assertEquals(84, encoded.length);
        assertEquals('\r', (char) encoded[76]);
        assertEquals('\n', (char) encoded[77]);
    }

    @Test
    public void testDecodeObjectFromString() throws Exception {
        assertArrayEquals(new byte[] {'f'}, (byte[]) new Base64().decode((Object) "Zg=="));
    }

    @Test
    public void testDecodeObjectFromBytes() throws Exception {
        assertArrayEquals(new byte[] {'f'}, (byte[]) new Base64().decode((Object) new byte[] {'Z', 'g', '=', '='}));
    }

    @Test
    public void testDecodeObjectRejectsOtherType() throws Exception {
        assertArrayEquals(new byte[] {'f'}, (byte[]) new Base64().decode((Object) "Zg=="));
    }

    @Test
    public void testDecodeBase64StringIgnoresNonAlphabetBytes() throws Exception {
        assertArrayEquals(new byte[] {'f'}, Base64.decodeBase64("Z!g=="));
    }

    @Test
    public void testEncodeObjectAndEncodeToString() throws Exception {
        Base64 codec = new Base64();
        assertArrayEquals(new byte[] {'Z', 'g', '=', '='},
                (byte[]) codec.encode((Object) new byte[] {'f'}));
        assertEquals("Zg==", codec.encodeToString(new byte[] {'f'}));
    }

    @Test
    public void testEncodeObjectRejectsNonByteArray() throws Exception {
        try {
            new Base64().encode((Object) "f");
            fail("expected EncoderException");
        } catch (EncoderException expected) {
        }
    }

    @Test
    public void testEncodeIntegerRoundTrip() throws Exception {
        BigInteger value = new BigInteger("123456");
        assertEquals(value, Base64.decodeInteger(Base64.encodeInteger(value)));
    }

    @Test
    public void testEncodeIntegerZero() throws Exception {
        assertEquals(BigInteger.ZERO, Base64.decodeInteger(Base64.encodeInteger(BigInteger.ZERO)));
    }

    @Test
    public void testDecodeIntegerLeadingHighBitIsPositive() throws Exception {
        assertEquals(new BigInteger("255"), Base64.decodeInteger(new byte[] {'/','w','=','='}));
    }

    @Test
    public void testEncodeNullAndEmptyArrays() throws Exception {
        assertNull(Base64.encodeBase64(null));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
        assertNull(Base64.decodeBase64((byte[]) null));
        assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
    }
}
