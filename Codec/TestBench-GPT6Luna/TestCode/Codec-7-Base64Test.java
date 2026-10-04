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
    public void testIsBase64AlphabetEdges() throws Exception {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '0'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '-'));
        assertTrue(Base64.isBase64((byte) '_'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) ' '));
        assertFalse(Base64.isBase64((byte) 127));
        assertFalse(Base64.isBase64((byte) -1));
    }

    @Test
    public void testArrayByteBase64AllowsEmptyAndWhitespace() throws Exception {
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
        assertTrue(Base64.isArrayByteBase64("A \r\n\t/".getBytes("US-ASCII")));
    }

    @Test
    public void testArrayByteBase64RejectsNonAlphabet() throws Exception {
        assertFalse(Base64.isArrayByteBase64("A!".getBytes("US-ASCII")));
    }

    @Test
    public void testEncodeBase64BasicAndEmpty() throws Exception {
        assertEquals("Zm9v", new String(Base64.encodeBase64("foo".getBytes("US-ASCII")), "US-ASCII"));
        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
    }

    @Test
    public void testEncodeBase64String() throws Exception {
        assertEquals("Zm8=", Base64.encodeBase64String("fo".getBytes("US-ASCII")));
    }

    @Test
    public void testEncodeBase64UrlSafeAlphabetAndPadding() throws Exception {
        assertEquals("-_8", new String(Base64.encodeBase64URLSafe(new byte[] {(byte) 251, (byte) 255}), "US-ASCII"));
    }

    @Test
    public void testEncodeBase64UrlSafeString() throws Exception {
        assertEquals("-_8", Base64.encodeBase64URLSafeString(new byte[] {(byte) 251, (byte) 255}));
    }

    @Test
    public void testEncodeBase64ChunkedAtMIMEBoundary() throws Exception {
        byte[] input = new byte[57];
        for (int i = 0; i < input.length; i++) {
            input[i] = 'a';
        }
        byte[] output = Base64.encodeBase64Chunked(input);
        assertEquals(78, output.length);
        assertEquals('\r', (char) output[76]);
        assertEquals('\n', (char) output[77]);
    }

    @Test
    public void testDecodeObjectByteArrayAndString() throws Exception {
        Base64 codec = new Base64();
        assertArrayEquals("foo".getBytes("US-ASCII"), (byte[]) codec.decode((Object) "Zm9v"));
        assertArrayEquals("foo".getBytes("US-ASCII"), (byte[]) codec.decode((Object) "Zm9v".getBytes("US-ASCII")));
    }

    @Test
    public void testDecodeObjectRejectsUnsupportedType() throws Exception {
        try {
            new Base64().decode((Object) Integer.valueOf(1));
            fail("expected DecoderException");
        } catch (DecoderException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testDecodeBase64StringIgnoresWhitespace() throws Exception {
        assertArrayEquals("foo".getBytes("US-ASCII"), Base64.decodeBase64(" Zm9v\r\n"));
    }

    @Test
    public void testEncodeObjectAndRejectUnsupportedType() throws Exception {
        Base64 codec = new Base64();
        assertArrayEquals("Zm9v".getBytes("US-ASCII"), (byte[]) codec.encode((Object) "foo".getBytes("US-ASCII")));
        try {
            codec.encode((Object) "foo");
            fail("expected EncoderException");
        } catch (EncoderException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testEncodeToString() throws Exception {
        assertEquals("Zm9v", new Base64().encodeToString("foo".getBytes("US-ASCII")));
    }

    @Test
    public void testDecodeIntegerUnsigned() throws Exception {
        assertEquals(BigInteger.valueOf(255), Base64.decodeInteger(" /w==".trim().getBytes("US-ASCII")));
    }

    @Test
    public void testEncodeIntegerByteAlignedAndNonAligned() throws Exception {
        assertEquals("AQ==", new String(Base64.encodeInteger(BigInteger.ONE), "US-ASCII"));
        assertEquals("gA==", new String(Base64.encodeInteger(BigInteger.valueOf(128)), "US-ASCII"));
    }

    @Test
    public void testEncodeIntegerRejectsNull() throws Exception {
        try {
            Base64.encodeInteger(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testDecodeOptionalPaddingAndUrlAlphabet() throws Exception {
        assertArrayEquals(new byte[] {(byte) 251, (byte) 255}, Base64.decodeBase64("-_8"));
    }

    @Test
    public void testEncodeEmptyAndNullRemainUnchanged() throws Exception {
        assertNull(Base64.encodeBase64(null));
        assertNull(Base64.encodeBase64URLSafe(null));
        assertEquals(0, Base64.encodeBase64Chunked(new byte[0]).length);
    }

    @Test
    public void testConstructorRejectsAlphabetSeparator() throws Exception {
        try {
            new Base64(4, new byte[] {'X'});
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testDecodeEmptyAndNull() throws Exception {
        assertNull(Base64.decodeBase64((byte[]) null));
        assertEquals(0, Base64.decodeBase64(new byte[0]).length);
    }
}
