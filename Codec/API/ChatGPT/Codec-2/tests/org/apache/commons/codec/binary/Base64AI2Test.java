package org.apache.commons.codec.binary;

import java.math.BigInteger;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class Base64AI2Test {

    private static byte[] ascii(String value) throws Exception {
        return value.getBytes("US-ASCII");
    }

    @Test
    public void testEncodeAndDecodeSimpleText() throws Exception {
        byte[] input = ascii("Man");
        Assert.assertArrayEquals(ascii("TWFu"), Base64.encodeBase64(input));
        Assert.assertArrayEquals(input, Base64.decodeBase64(ascii("TWFu")));
    }

    @Test
    public void testEncodeBoundaryLengthsAndPadding() throws Exception {
        Assert.assertArrayEquals(ascii("Zg=="), Base64.encodeBase64(ascii("f")));
        Assert.assertArrayEquals(ascii("Zm8="), Base64.encodeBase64(ascii("fo")));
        Assert.assertArrayEquals(ascii("Zm9v"), Base64.encodeBase64(ascii("foo")));

        Assert.assertArrayEquals(ascii("f"), Base64.decodeBase64(ascii("Zg==")));
        Assert.assertArrayEquals(ascii("fo"), Base64.decodeBase64(ascii("Zm8=")));
    }

    @Test
    public void testUrlSafeEncodingUsesUrlAlphabetAndOmitsPadding() throws Exception {
        byte[] input = new byte[] { (byte) 251, (byte) 255 };

        Assert.assertArrayEquals(ascii("+/8="), Base64.encodeBase64(input));
        Assert.assertArrayEquals(ascii("-_8"), Base64.encodeBase64URLSafe(input));
        Assert.assertArrayEquals(input, Base64.decodeBase64(ascii("-_8")));
        Assert.assertTrue(new Base64(true).isUrlSafe());
        Assert.assertFalse(new Base64(false).isUrlSafe());
    }

    @Test
    public void testChunkedEncodingAddsLineSeparatorsAndRoundTrips() throws Exception {
        byte[] input = new byte[57];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) i;
        }

        byte[] encoded = Base64.encodeBase64Chunked(input);
        Assert.assertEquals(80, encoded.length);
        Assert.assertEquals('\r', encoded[76]);
        Assert.assertEquals('\n', encoded[77]);
        Assert.assertEquals('\r', encoded[78]);
        Assert.assertEquals('\n', encoded[79]);
        Assert.assertArrayEquals(input, Base64.decodeBase64(encoded));
    }

    @Test
    public void testCustomLineLengthAndSeparator() throws Exception {
        Base64 encoder = new Base64(4, ascii("~~"));
        byte[] input = ascii("abcdef");

        encoder.encode(input, 0, 2);
        encoder.encode(input, 2, 4);
        encoder.encode(input, 0, -1);

        byte[] result = new byte[32];
        int count = encoder.readResults(result, 0, result.length);
        byte[] encoded = new byte[count];
        System.arraycopy(result, 0, encoded, 0, count);

        Assert.assertArrayEquals(ascii("YWJj~~ZGVm~~"), encoded);
        Assert.assertArrayEquals(input, Base64.decodeBase64(encoded));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsBase64CharacterInLineSeparator() {
        new Base64(76, new byte[] { '\r', '=' });
    }

    @Test
    public void testDecoderIgnoresWhitespaceAndNonAlphabetCharacters() throws Exception {
        byte[] encoded = ascii("! T\nW@F\ru#");
        Assert.assertArrayEquals(ascii("Man"), Base64.decodeBase64(encoded));
    }

    @Test
    public void testAlphabetValidation() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '-'));
        Assert.assertTrue(Base64.isBase64((byte) '/'));
        Assert.assertTrue(Base64.isBase64((byte) '_'));
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertFalse(Base64.isBase64((byte) ' '));
        Assert.assertFalse(Base64.isBase64((byte) '!'));

        Assert.assertTrue(Base64.isArrayByteBase64(
                new byte[] { 'A', ' ', '\r', '\n', '=' }));
        Assert.assertTrue(Base64.isArrayByteBase64(new byte[0]));
        Assert.assertFalse(Base64.isArrayByteBase64(new byte[] { 'A', '?' }));
    }

    @Test
    public void testObjectEncoderAndDecoderContracts() throws Exception {
        Base64 base64 = new Base64();

        Assert.assertArrayEquals(ascii("SGVsbG8="),
                (byte[]) base64.encode((Object) ascii("Hello")));
        Assert.assertArrayEquals(ascii("Hello"),
                (byte[]) base64.decode((Object) ascii("SGVsbG8=")));
    }

    @Test(expected = EncoderException.class)
    public void testEncodingNonByteArrayThrowsEncoderException() throws Exception {
        new Base64().encode("not bytes");
    }

    @Test(expected = DecoderException.class)
    public void testDecodingNonByteArrayThrowsDecoderException() throws Exception {
        new Base64().decode("not bytes");
    }

    @Test
    public void testIntegerEncodingUsesUnsignedRepresentation() throws Exception {
        Assert.assertArrayEquals(ascii("fw=="),
                Base64.encodeInteger(BigInteger.valueOf(127)));
        Assert.assertArrayEquals(ascii("gA=="),
                Base64.encodeInteger(BigInteger.valueOf(128)));
        Assert.assertEquals(BigInteger.valueOf(128),
                Base64.decodeInteger(ascii("gA==")));
    }

    @Test(expected = NullPointerException.class)
    public void testEncodingNullIntegerThrowsNullPointerException() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testStreamingEncodeAndReadResults() throws Exception {
        Base64 encoder = new Base64(0);
        byte[] input = ascii("hello");

        encoder.encode(input, 0, 2);
        encoder.encode(input, 2, 3);
        encoder.encode(input, 0, -1);

        byte[] result = new byte[16];
        int count = encoder.readResults(result, 0, result.length);
        Assert.assertEquals(8, count);

        byte[] actual = new byte[count];
        System.arraycopy(result, 0, actual, 0, count);
        Assert.assertArrayEquals(ascii("aGVsbG8="), actual);
        Assert.assertEquals(-1, encoder.readResults(new byte[1], 0, 1));
    }

    @Test
    public void testWhitespaceAndNonBase64DiscardHelpers() throws Exception {
        Assert.assertArrayEquals(ascii("TWFu"),
                Base64.discardWhitespace(ascii(" T\nW\rF\t u")));
        Assert.assertArrayEquals(ascii("TWFu="),
                Base64.discardNonBase64(ascii("!T W@F#u=")));
    }

    @Test
    public void testNullAndEmptyStaticInputsArePreserved() {
        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertNull(Base64.decodeBase64(null));

        byte[] empty = new byte[0];
        Assert.assertSame(empty, Base64.encodeBase64(empty));
        Assert.assertSame(empty, Base64.decodeBase64(empty));
    }
}
