package org.apache.commons.codec.binary;

import java.math.BigInteger;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class Base64AI7Test {

    private static byte[] ascii(String value) {
        byte[] result = new byte[value.length()];
        for (int i = 0; i < value.length(); i++) {
            result[i] = (byte) value.charAt(i);
        }
        return result;
    }

    @Test
    public void encodesStandardBase64Vectors() {
        Assert.assertEquals("", Base64.encodeBase64String(new byte[0]));
        Assert.assertEquals("Zg==", Base64.encodeBase64String(ascii("f")));
        Assert.assertEquals("Zm8=", Base64.encodeBase64String(ascii("fo")));
        Assert.assertEquals("Zm9v", Base64.encodeBase64String(ascii("foo")));
        Assert.assertEquals("Zm9vYmFy", Base64.encodeBase64String(ascii("foobar")));
    }

    @Test
    public void nullAndEmptyInputsArePreserved() {
        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertNull(new Base64().encode((byte[]) null));
        Assert.assertNull(new Base64().decode((byte[]) null));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
        Assert.assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
    }

    @Test
    public void urlSafeEncodingUsesTheUrlAlphabetAndOmitsPadding() {
        byte[] input = new byte[] {(byte) 0xfb, (byte) 0xef, (byte) 0xff};

        Assert.assertEquals("++//", Base64.encodeBase64String(input));
        Assert.assertEquals("--__", Base64.encodeBase64URLSafeString(input));
        Assert.assertArrayEquals(input, Base64.decodeBase64("--__"));
        Assert.assertTrue(new Base64(true).isUrlSafe());
        Assert.assertFalse(new Base64(false).isUrlSafe());
    }

    @Test
    public void chunkedEncodingUsesMIMELineBreaks() {
        byte[] input = new byte[57];
        for (int i = 0; i < input.length; i++) {
            input[i] = 'a';
        }

        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < 19; i++) {
            expected.append("YWFh");
        }
        expected.append("\r\n");

        Assert.assertEquals(expected.toString(),
                new String(Base64.encodeBase64Chunked(input)));
    }

    @Test
    public void customLineLengthAndSeparatorAreHonored() {
        Base64 codec = new Base64(4, ascii("|"));
        Assert.assertEquals("YWJj|ZA==|", codec.encodeToString(ascii("abcd")));
    }

    @Test
    public void decoderIgnoresWhitespaceGarbageAndOptionalPadding() {
        Assert.assertArrayEquals(ascii("abcd"),
                Base64.decodeBase64(" YWJj\nZA==\t"));
        Assert.assertArrayEquals(ascii("foobar"),
                Base64.decodeBase64("Zm9v!YmFy"));
        Assert.assertArrayEquals(ascii("fo"),
                Base64.decodeBase64("Zm8"));
        Assert.assertArrayEquals(ascii("foobar"),
                Base64.decodeBase64("Zm9vYmFy"));
    }

    @Test
    public void alphabetValidationRecognizesWhitespaceAndUrlCharacters() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '-'));
        Assert.assertTrue(Base64.isBase64((byte) '_'));
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertFalse(Base64.isBase64((byte) '!'));
        Assert.assertFalse(Base64.isBase64((byte) -1));

        Assert.assertTrue(Base64.isArrayByteBase64(ascii("YWJj\r\n ZA==")));
        Assert.assertTrue(Base64.isArrayByteBase64(new byte[0]));
        Assert.assertFalse(Base64.isArrayByteBase64(ascii("YWJj!")));
    }

    @Test
    public void objectInterfaceMethodsUseTheExpectedTypes() throws Exception {
        Base64 codec = new Base64();

        Assert.assertArrayEquals(ascii("Zm9v"), (byte[]) codec.encode(ascii("foo")));
        Assert.assertArrayEquals(ascii("foo"), (byte[]) codec.decode("Zm9v"));
    }

    @Test(expected = EncoderException.class)
    public void encodeRejectsNonByteArrayObjects() throws Exception {
        new Base64().encode("not a byte array");
    }

    @Test(expected = DecoderException.class)
    public void decodeRejectsUnsupportedObjects() throws Exception {
        new Base64().decode(Integer.valueOf(1));
    }

    @Test
    public void integerEncodingRoundTripsPositiveValues() {
        BigInteger value = new BigInteger("258");

        Assert.assertArrayEquals(ascii("AQI="), Base64.encodeInteger(value));
        Assert.assertEquals(value, Base64.decodeInteger(Base64.encodeInteger(value)));
    }

    @Test(expected = NullPointerException.class)
    public void integerEncodingRejectsNull() {
        Base64.encodeInteger(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorRejectsBase64LineSeparators() {
        new Base64(76, ascii("x"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxResultSizeIsEnforced() {
        Base64.encodeBase64(ascii("foo"), false, false, 3);
    }
}
