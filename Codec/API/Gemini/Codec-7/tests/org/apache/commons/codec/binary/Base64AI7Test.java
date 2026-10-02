package org.apache.commons.codec.binary;

import java.math.BigInteger;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class Base64AI7Test {

    @Test
    public void testEncodeDecodeEmptyAndNull() {
        Base64 base64 = new Base64();
        Assert.assertNull(base64.encode((byte[]) null));
        Assert.assertNull(base64.decode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], base64.encode(new byte[0]));
        Assert.assertArrayEquals(new byte[0], base64.decode(new byte[0]));
    }

    @Test
    public void testBasicEncodeDecodeStandard() {
        byte[] input = StringUtils.getBytesUtf8("Hello World!");
        String encoded = Base64.encodeBase64String(input);
        Assert.assertEquals("SGVsbG8gV29ybGQh", encoded);

        byte[] decoded = Base64.decodeBase64(encoded);
        Assert.assertEquals("Hello World!", StringUtils.newStringUtf8(decoded));
    }

    @Test
    public void testEncodeUrlSafe() {
        // Data crafted to produce characters with indices 62 ('+') and 63 ('/') in standard Base64
        byte[] input = new byte[]{(byte) 0xfb, (byte) 0xff, (byte) 0xfe};
        byte[] encodedStandard = Base64.encodeBase64(input, false, false);
        byte[] encodedUrlSafe = Base64.encodeBase64URLSafe(input);

        Assert.assertEquals("+//+", StringUtils.newStringUtf8(encodedStandard));
        Assert.assertEquals("-__-", StringUtils.newStringUtf8(encodedUrlSafe));

        // URL-safe decoding handles '-' and '_'
        byte[] decoded = Base64.decodeBase64(encodedUrlSafe);
        Assert.assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncodeChunked() {
        // 60 bytes of data -> 80 bytes in Base64 -> chunked into 76 chars + CRLF + 4 chars + CRLF
        byte[] input = new byte[60];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) 'A';
        }
        byte[] chunked = Base64.encodeBase64Chunked(input);
        String chunkedStr = StringUtils.newStringUtf8(chunked);

        Assert.assertTrue(chunkedStr.contains("\r\n"));
        Assert.assertEquals(76, chunkedStr.indexOf("\r\n"));
        byte[] decoded = Base64.decodeBase64(chunked);
        Assert.assertArrayEquals(input, decoded);
    }

    @Test
    public void testDecodeWithIgnoredCharsAndPaddingVariations() {
        // Base64 of "any carnal pleas" is "YW55IGNhcm5hbCBwbGVhcw=="
        String encodedWithNoise = "YW 55\r\nIGNh\tcm5h\nbCBwbGVhcw==";
        byte[] decoded = Base64.decodeBase64(encodedWithNoise);
        Assert.assertEquals("any carnal pleas", StringUtils.newStringUtf8(decoded));

        // Decoding without optional trailing padding '='
        String noPadding = "YW55IGNhcm5hbCBwbGVhcw";
        byte[] decodedNoPadding = Base64.decodeBase64(noPadding);
        Assert.assertArrayEquals(decoded, decodedNoPadding);
    }

    @Test
    public void testIsArrayByteBase64AndIsBase64() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertFalse(Base64.isBase64((byte) '$'));

        byte[] valid = StringUtils.getBytesUtf8("YW55IGNhcm5hbCBwbGVhcw==\r\n ");
        Assert.assertTrue(Base64.isArrayByteBase64(valid));

        byte[] invalid = StringUtils.getBytesUtf8("YW55IGNhcm5hbCBwbGVhcw$%");
        Assert.assertFalse(Base64.isArrayByteBase64(invalid));
    }

    @Test
    public void testObjectEncodeDecode() throws Exception {
        Base64 base64 = new Base64();

        Object encoded = base64.encode((Object) StringUtils.getBytesUtf8("test"));
        Assert.assertTrue(encoded instanceof byte[]);
        Assert.assertEquals("dGVzdA==", StringUtils.newStringUtf8((byte[]) encoded));

        Object decodedFromBytes = base64.decode(encoded);
        Assert.assertTrue(decodedFromBytes instanceof byte[]);
        Assert.assertEquals("test", StringUtils.newStringUtf8((byte[]) decodedFromBytes));

        Object decodedFromString = base64.decode((Object) "dGVzdA==");
        Assert.assertTrue(decodedFromString instanceof byte[]);
        Assert.assertEquals("test", StringUtils.newStringUtf8((byte[]) decodedFromString));
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncodeInvalidType() throws Exception {
        Base64 base64 = new Base64();
        base64.encode("invalid type");
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecodeInvalidType() throws Exception {
        Base64 base64 = new Base64();
        base64.decode(Integer.valueOf(12345));
    }

    @Test
    public void testBigIntegerEncodeDecode() {
        BigInteger original = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(original);
        BigInteger decoded = Base64.decodeInteger(encoded);
        Assert.assertEquals(original, decoded);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithBase64SeparatorThrows() {
        byte[] invalidSeparator = new byte[]{'A', '\n'};
        new Base64(76, invalidSeparator);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64MaxResultSizeExceeded() {
        byte[] input = new byte[100];
        Base64.encodeBase64(input, false, false, 50);
    }
}
