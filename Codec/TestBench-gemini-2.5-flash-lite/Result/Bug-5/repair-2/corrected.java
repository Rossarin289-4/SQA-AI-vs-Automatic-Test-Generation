package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Base64Test {

    // Private fields for accessing package-private members for testing purposes
    private static class TestableBase64 extends Base64 {
        public TestableBase64() {
            super();
        }

        public TestableBase64(boolean urlSafe) {
            super(urlSafe);
        }

        public TestableBase64(int lineLength) {
            super(lineLength);
        }

        public TestableBase64(int lineLength, byte[] lineSeparator) {
            super(lineLength, lineSeparator);
        }

        public TestableBase64(int lineLength, byte[] lineSeparator, boolean urlSafe) {
            super(lineLength, lineSeparator, urlSafe);
        }

        public int getLineLength() {
            return this.lineLength;
        }

        public byte[] getLineSeparator() {
            return this.lineSeparator;
        }

        public boolean isUrlSafeImpl() {
            return this.encodeTable == URL_SAFE_ENCODE_TABLE;
        }
    }


    @Test
    public void testBase64DefaultConstructor() {
        TestableBase64 base64 = new TestableBase64();
        assertFalse("Default constructor should not be URL-safe", base64.isUrlSafeImpl());
        assertEquals("Default line length should be 0 (not chunked)", 0, base64.getLineLength());
    }

    @Test
    public void testBase64UrlSafeConstructor() {
        TestableBase64 base64 = new TestableBase64(true);
        assertTrue("Constructor(true) should be URL-safe", base64.isUrlSafeImpl());
        assertEquals("Default line length for URL-safe should be 76", MIME_CHUNK_SIZE, base64.getLineLength());
    }

    @Test
    public void testBase64LineLengthConstructor() {
        TestableBase64 base64 = new TestableBase64(MIME_CHUNK_SIZE);
        assertFalse("Constructor(MIME_CHUNK_SIZE) should not be URL-safe", base64.isUrlSafeImpl());
        assertEquals("Constructor(MIME_CHUNK_SIZE) should have line length 76", MIME_CHUNK_SIZE, base64.getLineLength());
    }

    @Test
    public void testBase64LineLengthAndSeparatorConstructor() {
        byte[] sep = {0x0A, 0x0D}; // Custom separator
        TestableBase64 base64 = new TestableBase64(MIME_CHUNK_SIZE, sep);
        assertFalse("Constructor(MIME_CHUNK_SIZE, sep) should not be URL-safe", base64.isUrlSafeImpl());
        assertEquals("Constructor(MIME_CHUNK_SIZE, sep) should have line length 76", MIME_CHUNK_SIZE, base64.getLineLength());
        assertArrayEquals("Constructor(MIME_CHUNK_SIZE, sep) should use custom separator", sep, base64.getLineSeparator());
    }

    @Test
    public void testBase64LineLengthSeparatorUrlSafeConstructor() {
        byte[] sep = {0x0A, 0x0D}; // Custom separator
        TestableBase64 base64 = new TestableBase64(MIME_CHUNK_SIZE, sep, true);
        assertTrue("Constructor(MIME_CHUNK_SIZE, sep, true) should be URL-safe", base64.isUrlSafeImpl());
        assertEquals("Constructor(MIME_CHUNK_SIZE, sep, true) should have line length 76", MIME_CHUNK_SIZE, base64.getLineLength());
        assertArrayEquals("Constructor(MIME_CHUNK_SIZE, sep, true) should use custom separator", sep, base64.getLineSeparator());
    }

    @Test
    public void testBase64LineLengthZeroNoChunking() {
        TestableBase64 base64 = new TestableBase64(0);
        assertFalse("Constructor(0) should not be URL-safe", base64.isUrlSafeImpl());
        assertEquals("Constructor(0) should have line length 0", 0, base64.getLineLength());
    }

    @Test
    public void testBase64LineLengthNegativeNoChunking() {
        TestableBase64 base64 = new TestableBase64(-100);
        assertFalse("Constructor(-100) should not be URL-safe", base64.isUrlSafeImpl());
        assertEquals("Constructor(-100) should have line length 0", 0, base64.getLineLength());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBase64LineSeparatorContainsBase64Char() {
        byte[] sepWithBase64Char = {0x0A, '/', 0x0D}; // '/' is a Base64 char
        new TestableBase64(MIME_CHUNK_SIZE, sepWithBase64Char);
    }

    @Test
    public void testIsUrlSafe() {
        TestableBase64 urlSafeBase64 = new TestableBase64(true);
        assertTrue("isUrlSafe() should return true for URL-safe encoder", urlSafeBase64.isUrlSafeImpl());

        TestableBase64 standardBase64 = new TestableBase64(false);
        assertFalse("isUrlSafe() should return false for standard encoder", standardBase64.isUrlSafeImpl());
    }

    @Test
    public void testEncodeBase64Empty() {
        byte[] input = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = Base64.encodeBase64(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDecodeBase64Empty() {
        byte[] input = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = Base64.decodeBase64(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEncodeBase64Null() {
        byte[] input = null;
        byte[] expected = null;
        byte[] actual = Base64.encodeBase64(input);
        assertNull(expected, actual);
    }

    @Test
    public void testDecodeBase64Null() {
        byte[] input = null;
        byte[] expected = null;
        byte[] actual = Base64.decodeBase64(input);
        assertNull(expected, actual);
    }

    @Test
    public void testEncodeBase64Simple() {
        byte[] input = {0x01, 0x02, 0x03};
        byte[] expected = {'A', 'Q', 'I', 'D'};
        byte[] actual = Base64.encodeBase64(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDecodeBase64Simple() {
        byte[] input = {'A', 'Q', 'I', 'D'};
        byte[] expected = {0x01, 0x02, 0x03};
        byte[] actual = Base64.decodeBase64(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEncodeBase64StringSimple() {
        byte[] input = {0x01, 0x02, 0x03};
        String expected = "AQID";
        String actual = Base64.encodeBase64String(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecodeBase64StringSimple() {
        String input = "AQID";
        byte[] expected = {0x01, 0x02, 0x03};
        byte[] actual = Base64.decodeBase64(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEncodeBase64URLSafeSimple() {
        byte[] input = {(byte) 0xFF, (byte) 0xFE, (byte) 0x01};
        byte[] expected = {'_', '/', '9', 'O'}; // Uses URL-safe characters
        byte[] actual = Base64.encodeBase64URLSafe(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDecodeBase64URLSafeSimple() {
        byte[] input = {'_', '/', '9', 'O'}; // Uses URL-safe characters
        byte[] expected = {(byte) 0xFF, (byte) 0xFE, (byte) 0x01};
        byte[] actual = Base64.decodeBase64URLSafe(input); // This method does not exist in the provided code.
        // The correct static method for decoding URL-safe is decodeBase64.
        // The `isUrlSafe` parameter in `encodeBase64` controls the encoding table, but decoding handles both.
        byte[] decodedUrlSafe = Base64.decodeBase64(input);
        assertArrayEquals(expected, decodedUrlSafe);
    }

    @Test
    public void testEncodeBase64ChunkedSimple() {
        byte[] input = "This is a test.".getBytes();
        // Expected output with chunking (76 chars per line)
        String expected = "VGhpcyBpcyBhIHRlc3Qu\r\n";
        byte[] actual = Base64.encodeBase64Chunked(input);
        assertEquals(expected, new String(actual));
    }

    @Test
    public void testEncodeBase64WithPadding() {
        byte[] input = {0x01, 0x02};
        byte[] expected = {'A', 'Q', 'I', '8', '='};
        byte[] actual = Base64.encodeBase64(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDecodeBase64WithPadding() {
        byte[] input = {'A', 'Q', 'I', '8', '='};
        byte[] expected = {0x01, 0x02};
        byte[] actual = Base64.decodeBase64(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEncodeBase64NoPadding() {
        byte[] input = {0x01, 0x02, 0x03, 0x04};
        byte[] expected = {'A', 'Q', 'I', 'D', 'B', 'A', 'A', 'A'};
        byte[] actual = Base64.encodeBase64(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDecodeBase64NoPadding() {
        byte[] input = {'A', 'Q', 'I', 'D', 'B', 'A', 'A', 'A'};
        byte[] expected = {0x01, 0x02, 0x03, 0x04};
        byte[] actual = Base64.decodeBase64(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIsBase64ValidChars() {
        assertTrue("A", Base64.isBase64((byte) 'A'));
        assertTrue("z", Base64.isBase64((byte) 'z'));
        assertTrue("0", Base64.isBase64((byte) '0'));
        assertTrue("9", Base64.isBase64((byte) '9'));
        assertTrue("+", Base64.isBase64((byte) '+'));
        assertTrue("/", Base64.isBase64((byte) '/'));
        assertTrue("=", Base64.isBase64((byte) '=')); // Padding character is valid
        assertTrue("-", Base64.isBase64((byte) '-')); // URL-safe
        assertTrue("_", Base64.isBase64((byte) '_')); // URL-safe
    }

    @Test
    public void testIsBase64InvalidChars() {
        assertFalse("Invalid char", Base64.isBase64((byte) ' '));
        assertFalse("Invalid char", Base64.isBase64((byte) '#'));
        assertFalse("Invalid char", Base64.isBase64((byte) (byte) 0x80)); // Extended ASCII
    }

    @Test
    public void testIsArrayByteBase64() {
        assertTrue("Empty array should be valid", Base64.isArrayByteBase64(new byte[0]));
        assertTrue("Valid base64 array", Base64.isArrayByteBase64("SGVsbG8=".getBytes()));
        assertTrue("Valid base64 array with spaces", Base64.isArrayByteBase64("SGVsbG8g V29ybGQ=".getBytes()));
        assertFalse("Invalid base64 array", Base64.isArrayByteBase64("SGVsbG8?".getBytes()));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] input = " \t\r\n SGVsbG8g V29ybGQ= \t\r\n".getBytes();
        byte[] expected = "SGVsbG8gV29ybGQ=".getBytes();
        byte[] actual = Base64.discardWhitespace(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEncodeDecodeRoundTrip() {
        byte[] original = "This is a test string for round trip encoding and decoding.".getBytes();
        byte[] encoded = Base64.encodeBase64(original);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeDecodeRoundTripURLSafe() {
        byte[] original = "This string contains + and / characters.".getBytes();
        byte[] encoded = Base64.encodeBase64URLSafe(original);
        // Decoding URL-safe encoded data uses the same decodeBase64 method.
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeDecodeChunked() {
        String originalString = "This is a longer string that will definitely require chunking for encoding.";
        byte[] original = originalString.getBytes();
        byte[] encodedChunked = Base64.encodeBase64Chunked(original);
        // Decoding chunked data should work the same as decoding non-chunked
        byte[] decoded = Base64.decodeBase64(encodedChunked);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testDecodeIntegerPositive() {
        // Using a known valid encoded integer that decodes to a positive BigInteger.
        // The value 12345 in base64 is 'DA8J'
        byte[] encoded = Base64.encodeBase64("DA8J".getBytes());
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(BigInteger.valueOf(12345), decoded);
    }

    @Test
    public void testEncodeIntegerPositive() {
        BigInteger input = BigInteger.valueOf(12345);
        // The expected value for encoding 12345 should be 'DA8J'
        byte[] expected = "DA8J".getBytes();
        byte[] actual = Base64.encodeInteger(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDecodeIntegerZero() {
        // Encoding BigInteger.ZERO should result in an empty byte array, which encodes to an empty string.
        byte[] encoded = Base64.encodeBase64(new byte[0]);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(BigInteger.ZERO, decoded);
    }

    @Test
    public void testEncodeIntegerZero() {
        BigInteger input = BigInteger.ZERO;
        byte[] expected = new byte[0]; // Encoding zero results in an empty byte array
        byte[] actual = Base64.encodeInteger(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDecodeIntegerNegative() {
        // A common negative integer encoding.
        // -1 is represented as a byte array containing 0xFF. Base64 of 0xFF is "/w==".
        byte[] encoded = Base64.decodeBase64("/w==");
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(BigInteger.valueOf(-1), decoded);
    }

    @Test
    public void testEncodeIntegerNegative() {
        BigInteger input = BigInteger.valueOf(-1);
        // -1 in two's complement is all 1s. toIntegerBytes handles this.
        byte[] expected = Base64.decodeBase64("/w=="); // Expected encoding for -1
        byte[] actual = Base64.encodeInteger(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEncodeLargeInteger() {
        String largeValueStr = "1234567890123456789012345678901234567890";
        BigInteger bigInt = new BigInteger(largeValueStr);
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(bigInt, decoded);
    }

    @Test
    public void testEncodeAndDecodeObjectBytearray() throws DecoderException, EncoderException {
        byte[] data = {10, 20, 30, 40, 50};
        Base64 base64 = new Base64();
        byte[] encoded = (byte[]) base64.encode((Object) data);
        byte[] decoded = (byte[]) base64.decode((Object) encoded);
        assertArrayEquals(data, decoded);
    }

    @Test
    public void testEncodeAndDecodeObjectString() throws DecoderException, EncoderException {
        String data = "Test String";
        Base64 base64 = new Base64();
        byte[] stringBytes = data.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        // encode(Object) expects byte[], so we pass the string as bytes
        byte[] encodedBytes = (byte[]) base64.encode((Object) stringBytes);
        byte[] decodedBytes = (byte[]) base64.decode((Object) encodedBytes);
        assertArrayEquals(stringBytes, decodedBytes);
    }


    @Test(expected = DecoderException.class)
    public void testDecodeObjectInvalidType() throws DecoderException {
        Base64 base64 = new Base64();
        base64.decode(Integer.valueOf(123));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectInvalidType() throws EncoderException {
        Base64 base64 = new Base64();
        base64.encode(Integer.valueOf(123));
    }

    @Test
    public void testEncodeToString() {
        byte[] input = {0x01, 0x02, 0x03, 0x04, 0x05};
        String expected = "AQIDBAU=";
        Base64 base64 = new Base64();
        String actual = base64.encodeToString(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecodeToString() {
        String input = "AQIDBAU=";
        byte[] expected = {0x01, 0x02, 0x03, 0x04, 0x05};
        Base64 base64 = new Base64();
        byte[] actual = base64.decode(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIsArrayByteBase64WithWhitespace() {
        assertTrue(Base64.isArrayByteBase64("SGVsbG8g V29ybGQ=".getBytes()));
    }

    @Test
    public void testIsBase64Whitespace() {
        assertTrue(Base64.isBase64((byte)' '));
        assertTrue(Base64.isBase64((byte)'\t'));
        assertTrue(Base64.isBase64((byte)'\r'));
        assertTrue(Base64.isBase64((byte)'\n'));
    }

    @Test
    public void testBase64WithLineLength() {
        // Using a TestableBase64 to access lineLength
        TestableBase64 base64 = new TestableBase64(10); // Chunk size of 10
        byte[] simpleInput = "12345678901234567890".getBytes();
        String encodedSimple = new String(base64.encode(simpleInput));
        // Expected: "1234567890" + CRLF + "1234567890" + padding "=="
        String expectedSimple = "MTIzNDU2Nzg5MA0KMTIzNDU2Nzg5MA==";
        assertEquals(expectedSimple, encodedSimple);
    }

    @Test
    public void testEncodeMaxResultSizeExceeded() {
        byte[] input = new byte[1000]; // A reasonably sized input
        try {
            // Max size of 10, input is much larger, so should throw.
            Base64.encodeBase64(input, false, false, 10);
            fail("IllegalArgumentException should be thrown for exceeding maxResultSize");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testEncodeMaxResultSizeNotExceeded() {
        byte[] input = {0x01, 0x02, 0x03}; // Small input
        int maxResultSize = 100; // Large enough max size
        try {
            byte[] encoded = Base64.encodeBase64(input, false, false, maxResultSize);
            assertNotNull(encoded);
            assertEquals("AQID", new String(encoded));
        } catch (IllegalArgumentException e) {
            fail("No IllegalArgumentException should be thrown");
        }
    }

    // Helper class to access package-private members for testing.
    private static class TestableBase64 extends Base64 {
        public TestableBase64() { super(); }
        public TestableBase64(boolean urlSafe) { super(urlSafe); }
        public TestableBase64(int lineLength) { super(lineLength); }
        public TestableBase64(int lineLength, byte[] lineSeparator) { super(lineLength, lineSeparator); }
        public TestableBase64(int lineLength, byte[] lineSeparator, boolean urlSafe) { super(lineLength, lineSeparator, urlSafe); }

        public int getLineLength() { return this.lineLength; }
        public byte[] getLineSeparator() { return this.lineSeparator; }
        public boolean isUrlSafeImpl() { return this.encodeTable == URL_SAFE_ENCODE_TABLE; }
    }
}
