package org.apache.commons.codec.binary;

import java.math.BigInteger;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class Base64AI4Test {

    @Test
    public void testStandardEncodingVectors() {
        Assert.assertEquals("", Base64.encodeBase64String(new byte[0]));
        Assert.assertEquals("Zg==\r\n", Base64.encodeBase64String(new byte[] { 'f' }));
        Assert.assertEquals("Zm8=\r\n", Base64.encodeBase64String(new byte[] { 'f', 'o' }));
        Assert.assertEquals("Zm9v\r\n", Base64.encodeBase64String(new byte[] { 'f', 'o', 'o' }));
        Assert.assertEquals("Zm9vYg==\r\n",
                Base64.encodeBase64String(new byte[] { 'f', 'o', 'o', 'b' }));
    }

    @Test
    public void testBinaryRoundTripIncludingBoundaryValues() {
        byte[] input = new byte[] {
                0, 1, 2, 3, 127, (byte) 128, (byte) 254, (byte) 255
        };

        byte[] encoded = Base64.encodeBase64(input);
        byte[] decoded = Base64.decodeBase64(encoded);

        Assert.assertArrayEquals(input, decoded);
        Assert.assertEquals("AAECA3+A/v8=", new String(encoded));
    }

    @Test
    public void testUrlSafeEncodingUsesAlternateAlphabetAndDecodesBothForms() {
        byte[] input = new byte[] { (byte) 251, (byte) 255 };

        Assert.assertEquals("+/8=", new String(Base64.encodeBase64(input)));
        Assert.assertEquals("-_8", Base64.encodeBase64URLSafeString(input));
        Assert.assertArrayEquals(input, Base64.decodeBase64("-_8"));
        Assert.assertArrayEquals(input, Base64.decodeBase64("+/8="));
        Assert.assertTrue(new Base64(true).isUrlSafe());
        Assert.assertFalse(new Base64(false).isUrlSafe());
    }

    @Test
    public void testChunkedEncodingRoundsLineLengthAndUsesCrLf() {
        Base64 codec = new Base64(5);
        byte[] encoded = codec.encode(new byte[] { 1, 2, 3, 4, 5, 6 });

        Assert.assertEquals("AQID\r\nBAUG\r\n", new String(encoded));
        Assert.assertArrayEquals(new byte[] { 1, 2, 3, 4, 5, 6 },
                Base64.decodeBase64(encoded));
    }

    @Test
    public void testDecoderIgnoresWhitespaceGarbageAndOptionalPadding() {
        Assert.assertArrayEquals(new byte[] { 'M', 'a', 'n' },
                Base64.decodeBase64(" T W \n F u \t"));
        Assert.assertArrayEquals(new byte[] { 'M', 'a' },
                Base64.decodeBase64("TWE"));
        Assert.assertArrayEquals(new byte[] { 'M', 'a', 'n' },
                Base64.decodeBase64("$T@W#F*u"));
    }

    @Test
    public void testAlphabetPredicates() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '-'));
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertFalse(Base64.isBase64((byte) ' '));
        Assert.assertFalse(Base64.isBase64((byte) '*'));
        Assert.assertFalse(Base64.isBase64((byte) -1));

        Assert.assertTrue(Base64.isArrayByteBase64(
                new byte[] { 'T', 'W', 'E', '=', '\r', '\n' }));
        Assert.assertTrue(Base64.isArrayByteBase64(new byte[0]));
        Assert.assertFalse(Base64.isArrayByteBase64(
                new byte[] { 'T', 'W', 'E', '*' }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsBase64CharacterInLineSeparator() {
        new Base64(76, new byte[] { 'x', 'A' });
    }

    @Test(expected = DecoderException.class)
    public void testDecodeObjectRejectsUnsupportedType() throws DecoderException {
        new Base64().decode(Integer.valueOf(1));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectRejectsUnsupportedType() throws EncoderException {
        new Base64().encode("not bytes");
    }

    @Test
    public void testIntegerEncodingRoundTripAndUnsignedRepresentation() {
        BigInteger value = new BigInteger("65537");
        Assert.assertEquals("AQAB", new String(Base64.encodeInteger(value)));
        Assert.assertEquals(value,
                Base64.decodeInteger(Base64.encodeInteger(value)));

        BigInteger highBit = new BigInteger("128");
        Assert.assertEquals("gA==", new String(Base64.encodeInteger(highBit)));
        Assert.assertEquals(highBit,
                Base64.decodeInteger(Base64.encodeInteger(highBit)));
    }

    @Test
    public void testNullAndMaximumResultSizeBoundaries() {
        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertNull(Base64.decodeBase64((byte[]) null));
        Assert.assertNull(new Base64().encode((byte[]) null));
        Assert.assertNull(new Base64().decode((byte[]) null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodingHonorsMaximumResultSize() {
        Base64.encodeBase64(new byte[] { 1, 2, 3 }, false, false, 3);
    }
}
