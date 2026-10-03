package org.apache.commons.codec.binary;

import java.math.BigInteger;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class Base64AI5Test {

    @Test
    public void testStandardEncodingAndDecoding() {
        byte[] input = "Man".getBytes();
        Assert.assertEquals("TWFu", Base64.encodeBase64String(input));
        Assert.assertArrayEquals(input, Base64.decodeBase64("TWFu"));
    }

    @Test
    public void testEncodingBoundariesAndNullEmptyInputs() {
        Assert.assertEquals("TQ==",
                Base64.encodeBase64String(new byte[] { 'M' }));
        Assert.assertEquals("TWE=",
                Base64.encodeBase64String(new byte[] { 'M', 'a' }));
        Assert.assertEquals("", Base64.encodeBase64String(new byte[0]));
        Assert.assertSame(null, Base64.encodeBase64((byte[]) null));
        Assert.assertSame(null, Base64.decodeBase64((byte[]) null));
    }

    @Test
    public void testUrlSafeEncodingOmitsPaddingAndUsesUrlAlphabet() {
        byte[] input = new byte[] { (byte) 0xfb, (byte) 0xff };
        Assert.assertEquals("+/8=", new String(Base64.encodeBase64(input)));
        Assert.assertEquals("-_8", Base64.encodeBase64URLSafeString(input));
        Assert.assertArrayEquals(input, Base64.decodeBase64("-_8"));
    }

    @Test
    public void testChunkedEncodingUsesMimeLineLength() {
        byte[] input = new byte[57];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) i;
        }

        byte[] encoded = Base64.encodeBase64Chunked(input);
        Assert.assertEquals(78, encoded.length);
        Assert.assertEquals('\r', encoded[76]);
        Assert.assertEquals('\n', encoded[77]);
        Assert.assertArrayEquals(input, Base64.decodeBase64(encoded));
    }

    @Test
    public void testCustomChunkSeparatorAndRoundedLineLength() {
        Base64 codec = new Base64(5, new byte[] { '|' });
        Assert.assertEquals("YWJj|ZGVm|",
                codec.encodeToString("abcdef".getBytes()));
    }

    @Test
    public void testDecoderIgnoresWhitespaceAndOtherNonAlphabetCharacters() {
        Assert.assertArrayEquals("abc".getBytes(),
                Base64.decodeBase64(" YW\nJj\t!!"));
        Assert.assertArrayEquals(new byte[] { 'M' }, Base64.decodeBase64("TQ"));
    }

    @Test
    public void testAlphabetPredicates() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '-'));
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertFalse(Base64.isBase64((byte) '!'));
        Assert.assertFalse(Base64.isBase64((byte) -1));

        Assert.assertTrue(Base64.isArrayByteBase64("T W\nFu".getBytes()));
        Assert.assertTrue(Base64.isArrayByteBase64(new byte[0]));
        Assert.assertFalse(Base64.isArrayByteBase64("TWFu!".getBytes()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsBase64CharacterInSeparator() {
        new Base64(76, new byte[] { '\r', 'A' });
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObjectRejectsUnsupportedType()
            throws DecoderException {
        new Base64().decode(Integer.valueOf(1));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectRejectsUnsupportedType()
            throws EncoderException {
        new Base64().encode("not a byte array");
    }

    @Test
    public void testIntegerEncodingAndDecoding() {
        BigInteger value = new BigInteger("258");
        Assert.assertEquals("AQI=", new String(Base64.encodeInteger(value)));
        Assert.assertEquals(value,
                Base64.decodeInteger("AQI=".getBytes()));
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerRejectsNull() {
        Base64.encodeInteger(null);
    }
}
