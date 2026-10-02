package org.apache.commons.codec.binary;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class Base64InputStreamAI6Test {

    private static byte[] ascii(String value) throws Exception {
        return value.getBytes("US-ASCII");
    }

    private static byte[] readAll(Base64InputStream stream) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[3];
        int count;
        while ((count = stream.read(buffer, 0, buffer.length)) != -1) {
            output.write(buffer, 0, count);
        }
        return output.toByteArray();
    }

    private static byte[] decode(byte[] encoded) throws IOException {
        return readAll(new Base64InputStream(new ByteArrayInputStream(encoded)));
    }

    private static boolean isBase64Character(byte value) {
        return (value >= 'A' && value <= 'Z')
                || (value >= 'a' && value <= 'z')
                || (value >= '0' && value <= '9')
                || value == '+'
                || value == '/'
                || value == '=';
    }

    @Test
    public void defaultStreamDecodesBase64() throws Exception {
        Base64InputStream stream =
                new Base64InputStream(new ByteArrayInputStream(ascii("SGVsbG8=")));

        Assert.assertArrayEquals(ascii("Hello"), readAll(stream));
    }

    @Test
    public void encodingStreamProducesExpectedBase64() throws Exception {
        Base64InputStream stream =
                new Base64InputStream(new ByteArrayInputStream(ascii("Hello")), true);
        byte[] encoded = readAll(stream);

        Assert.assertArrayEquals(ascii("SGVsbG8="), encoded);
    }

    @Test
    public void readSingleByteReturnsUnsignedValue() throws Exception {
        Base64InputStream stream =
                new Base64InputStream(new ByteArrayInputStream(ascii("/w==")));

        Assert.assertEquals(255, stream.read());
        Assert.assertEquals(-1, stream.read());
    }

    @Test
    public void readWithOffsetPreservesSurroundingBytes() throws Exception {
        Base64InputStream stream =
                new Base64InputStream(new ByteArrayInputStream(ascii("SGVsbG8=")));
        byte[] result = new byte[9];
        result[0] = 11;
        result[8] = 22;

        int count = stream.read(result, 2, 5);

        Assert.assertEquals(5, count);
        Assert.assertEquals(11, result[0]);
        Assert.assertArrayEquals(ascii("Hello"), new byte[] {
                result[2], result[3], result[4], result[5], result[6]
        });
        Assert.assertEquals(22, result[8]);
    }

    @Test
    public void encodingHonorsLineLengthAndSeparator() throws Exception {
        Base64InputStream stream = new Base64InputStream(
                new ByteArrayInputStream(ascii("abcdef")), true, 4, new byte[] { '\n' });
        byte[] encoded = readAll(stream);

        int lineLength = 0;
        boolean sawSeparator = false;
        for (int i = 0; i < encoded.length; i++) {
            if (encoded[i] == '\n') {
                sawSeparator = true;
                Assert.assertTrue(lineLength <= 4);
                lineLength = 0;
            } else {
                Assert.assertTrue(isBase64Character(encoded[i]));
                lineLength++;
            }
        }
        Assert.assertTrue(sawSeparator);
        Assert.assertTrue(lineLength <= 4);
        Assert.assertArrayEquals(ascii("abcdef"), decode(encoded));
    }

    @Test
    public void decoderIgnoresWhitespaceAndNonBase64Characters() throws Exception {
        Base64InputStream stream =
                new Base64InputStream(new ByteArrayInputStream(ascii("SGV!s\nbG8=??")));

        Assert.assertArrayEquals(ascii("Hello"), readAll(stream));
    }

    @Test
    public void emptyInputReturnsEndOfStream() throws Exception {
        Base64InputStream stream =
                new Base64InputStream(new ByteArrayInputStream(new byte[0]));

        Assert.assertEquals(-1, stream.read());
        Assert.assertEquals(-1, stream.read(new byte[4], 0, 4));
    }

    @Test
    public void zeroLengthReadReturnsZero() throws Exception {
        Base64InputStream stream =
                new Base64InputStream(new ByteArrayInputStream(ascii("SGVsbG8=")));

        Assert.assertEquals(0, stream.read(new byte[2], 0, 0));
    }

    @Test(expected = NullPointerException.class)
    public void nullDestinationIsRejected() throws Exception {
        Base64InputStream stream =
                new Base64InputStream(new ByteArrayInputStream(ascii("SGVsbG8=")));

        stream.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void invalidDestinationRangeIsRejected() throws Exception {
        Base64InputStream stream =
                new Base64InputStream(new ByteArrayInputStream(ascii("SGVsbG8=")));

        stream.read(new byte[4], 3, 2);
    }

    @Test
    public void markIsNotSupported() throws Exception {
        Base64InputStream stream =
                new Base64InputStream(new ByteArrayInputStream(ascii("SGVsbG8=")));

        Assert.assertFalse(stream.markSupported());
    }
}
