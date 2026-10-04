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
    public void testConstructorDefault() throws Exception {
        Base64 base64 = new Base64();
        assertNotNull("Base64 object should not be null", base64);
        assertFalse("Default constructor should not be URL-safe", base64.isUrlSafe());
    }

    @Test
    public void testConstructorLineLength() throws Exception {
        int lineLength = 76;
        Base64 base64 = new Base64(lineLength);
        assertNotNull("Base64 object should not be null", base64);
        assertFalse("Constructor with line length should not be URL-safe", base64.isUrlSafe());
    }

    @Test
    public void testConstructorLineLengthAndSeparator() throws Exception {
        int lineLength = 76;
        byte[] separator = {'\n'};
        Base64 base64 = new Base64(lineLength, separator);
        assertNotNull("Base64 object should not be null", base64);
        assertFalse("Constructor with line length and separator should not be URL-safe", base64.isUrlSafe());
    }

    @Test
    public void testConstructorLineLengthSeparatorAndUrlSafe() throws Exception {
        int lineLength = 76;
        byte[] separator = {'\n'};
        boolean urlSafe = true;
        Base64 base64 = new Base64(lineLength, separator, urlSafe);
        assertNotNull("Base64 object should not be null", base64);
        assertTrue("Constructor with line length, separator and urlSafe should be URL-safe", base64.isUrlSafe());
    }

    @Test
    public void testConstructorUrlSafe() throws Exception {
        boolean urlSafe = true;
        Base64 base64 = new Base64(urlSafe);
        assertNotNull("Base64 object should not be null", base64);
        assertTrue("Constructor with urlSafe should be URL-safe", base64.isUrlSafe());
    }

    @Test
    public void testEncodeBase64NullInput() {
        assertNull("Encoding null should return null", Base64.encodeBase64((byte[]) null));
    }

    @Test
    public void testEncodeBase64EmptyInput() {
        byte[] input = new byte[0];
        byte[] expected = new byte[0];
        assertArrayEquals("Encoding empty byte array should return empty byte array", expected, Base64.encodeBase64(input));
    }

    @Test
    public void testEncodeBase64Basic() {
        byte[] input = {1, 2, 3};
        // The result of encoding {1, 2, 3} is [00000001, 00000010, 00000011]
        // This gets converted to 6-bit chunks: [000000, 000000, 100000, 100011] which is 0, 0, 32, 35
        // Looking up in the standard table: 0 -> 'A', 0 -> 'A', 32 -> 'g', 35 -> 'j'
        // So the expected output is "AAgj"
        byte[] expected = {'A', 'A', 'g', 'j'};
        assertArrayEquals("Basic encoding failed", expected, Base64.encodeBase64(input));
    }

    @Test
    public void testEncodeBase64StringBasic() {
        byte[] input = {1, 2, 3};
        // Same logic as testEncodeBase64Basic
        String expected = "AAgj";
        assertEquals("Basic string encoding failed", expected, Base64.encodeBase64String(input));
    }

    @Test
    public void testEncodeBase64URLSafeBasic() {
        byte[] input = {1, 2, 3};
        // Same logic as testEncodeBase64Basic, and since it doesn't involve + or /
        // URL-safe encoding yields the same result.
        byte[] expected = {'A', 'A', 'g', 'j'};
        assertArrayEquals("Basic URL-safe encoding failed", expected, Base64.encodeBase64URLSafe(input));
    }

    @Test
    public void testEncodeBase64URLSafeStringBasic() {
        byte[] input = {1, 2, 3};
        // Same logic as testEncodeBase64URLSafeBasic.
        String expected = "AAgj";
        assertEquals("Basic URL-safe string encoding failed", expected, Base64.encodeBase64URLSafeString(input));
    }

    @Test
    public void testEncodeBase64ChunkedBasic() {
        // Test with a smaller input to avoid excessive test data size,
        // the logic for chunking is what's being tested here.
        // Let's use an input that is exactly 3 bytes to avoid padding issues in the first chunk.
        byte[] input = {1, 2, 3};
        Base64 base64 = new Base64(Base64.MIME_CHUNK_SIZE, Base64.CHUNK_SEPARATOR);
        byte[] encoded = base64.encode(input);
        // The encoded form of {1, 2, 3} is "AAgj". Since the line length is 76, and the input is short, no chunking should occur.
        String encodedString = StringUtils.newStringUtf8(encoded);
        assertEquals("Chunked encoding failed for short input", "AAgj", encodedString);
    }

    @Test
    public void testDecodeBase64NullInput() {
        assertNull("Decoding null should return null", Base64.decodeBase64((String) null));
    }

    @Test
    public void testDecodeBase64EmptyStringInput() {
        String input = "";
        byte[] expected = new byte[0];
        assertArrayEquals("Decoding empty string should return empty byte array", expected, Base64.decodeBase64(input));
    }

    @Test
    public void testDecodeBase64Basic() {
        String input = "AAgj"; // This is the base64 encoding of {1, 2, 3}
        byte[] expected = {1, 2, 3};
        assertArrayEquals("Basic decoding failed", expected, Base64.decodeBase64(input));
    }

    @Test
    public void testDecodeBase64InvalidCharacters() {
        // The decode method is designed to ignore non-base64 characters, including whitespace.
        // "A A G J" should decode to {1, 2, 3}
        String input = "A A G J";
        byte[] expected = {1, 2, 3};
        assertArrayEquals("Decoding with whitespace failed", expected, Base64.decodeBase64(input));
    }

    @Test
    public void testDecodeBase64EncodedInteger() {
        // The integer {1, 2, 3} encoded as base64 is "AAgj"
        byte[] input = {'A', 'A', 'g', 'j'};
        BigInteger expected = new BigInteger(1, new byte[]{1, 2, 3});
        assertEquals("Decoding integer failed", expected, Base64.decodeInteger(input));
    }

    @Test
    public void testEncodeInteger() {
        BigInteger input = new BigInteger(1, new byte[]{1, 2, 3});
        // Encoding the integer {1, 2, 3} should result in "AAgj"
        byte[] expected = {'A', 'A', 'g', 'j'};
        assertArrayEquals("Encoding integer failed", expected, Base64.encodeInteger(input));
    }

    @Test
    public void testIsBase64ValidByte() {
        assertTrue("Byte 'A' should be valid Base64", Base64.isBase64((byte) 'A'));
    }

    @Test
    public void testIsBase64InvalidByte() {
        // Byte 100 is not in the standard Base64 alphabet and is not '='.
        assertFalse("Byte 100 should not be valid Base64", Base64.isBase64((byte) 100));
    }

    @Test
    public void testIsBase64PaddingByte() {
        assertTrue("Padding byte '=' should be valid Base64", Base64.isBase64((byte) '='));
    }

    @Test
    public void testIsArrayByteBase64Valid() {
        byte[] input = "AAgj".getBytes(); // Valid base64 string
        assertTrue("Array 'AAgj' should be valid Base64", Base64.isArrayByteBase64(input));
    }

    @Test
    public void testIsArrayByteBase64Invalid() {
        byte[] input = {1, 2, 3}; // Not a valid base64 string
        assertFalse("Array {1,2,3} should not be valid Base64", Base64.isArrayByteBase64(input));
    }

    @Test
    public void testIsArrayByteBase64Empty() {
        byte[] input = new byte[0];
        assertTrue("Empty array should be valid Base64", Base64.isArrayByteBase64(input));
    }

    @Test
    public void testEncodeAndDecodeRoundtrip() throws Exception {
        // A more representative string
        byte[] original = "foobar".getBytes();
        Base64 base64 = new Base64();
        byte[] encoded = base64.encode(original);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals("Encode/decode roundtrip failed", original, decoded);
    }

    @Test
    public void testEncodeAndDecodeRoundtripURLSafe() throws Exception {
        // A string that might produce '+' or '/' characters in standard encoding
        // For example, the bytes {251, 252, 253} -> {251, 252, 253}
        // In binary: 11111011 11111100 11111101
        // 6-bit chunks: 111110 111111 111100 111101
        // Decimal: 62, 63, 60, 61
        // Standard encoding: +, /, <, =
        // URL-safe encoding: -, _, <, =
        byte[] original = {(byte) 251, (byte) 252, (byte) 253};
        Base64 base64 = new Base64(true); // URL-safe
        byte[] encoded = base64.encode(original);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals("URL-safe encode/decode roundtrip failed", original, decoded);
    }

    @Test
    public void testDecodeObjectByteArray() throws DecoderException {
        byte[] input = {1, 2, 3};
        byte[] expected = {1, 2, 3};
        Object decoded = new Base64().decode((Object) input);
        assertArrayEquals("Decoding byte[] object failed", expected, (byte[]) decoded);
    }

    @Test
    public void testDecodeObjectString() throws DecoderException {
        String input = "AAgj"; // Base64 for {1, 2, 3}
        byte[] expected = {1, 2, 3};
        Object decoded = new Base64().decode((Object) input);
        assertArrayEquals("Decoding String object failed", expected, (byte[]) decoded);
    }

    @Test
    public void testDecodeObjectInvalidType() {
        Object input = Integer.valueOf(123);
        try {
            new Base64().decode(input);
            fail("Expected DecoderException for invalid object type");
        } catch (DecoderException e) {
            // Expected
        }
    }

    @Test
    public void testEncodeObjectByteArray() throws EncoderException {
        byte[] input = {1, 2, 3};
        byte[] expected = {'A', 'A', 'g', 'j'};
        Object encoded = new Base64().encode((Object) input);
        assertArrayEquals("Encoding byte[] object failed", expected, (byte[]) encoded);
    }

    @Test
    public void testEncodeObjectInvalidType() {
        Object input = Integer.valueOf(123);
        try {
            new Base64().encode(input);
            fail("Expected EncoderException for invalid object type");
        } catch (EncoderException e) {
            // Expected
        }
    }

    @Test
    public void testEncodeToString() {
        byte[] input = {1, 2, 3};
        String expected = "AAgj";
        assertEquals("EncodeToString failed", expected, new Base64().encodeToString(input));
    }

    @Test
    public void testLargeDataEncodeDecode() {
        // Use a literal size for the test data to avoid dependency on internal constants.
        // The goal is to test with a reasonably large amount of data.
        byte[] original = new byte[8192 * 2]; // Use a literal size, e.g., 16384 bytes
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) (i % 256);
        }
        Base64 base64 = new Base64();
        byte[] encoded = base64.encode(original);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals("Large data encode/decode roundtrip failed", original, decoded);
    }

    @Test
    public void testPaddingHandlingWhenDecoding() {
        // "ABC=" decodes to {1, 2}
        byte[] encoded = {'A', 'B', 'C', '='};
        byte[] expected = {1, 2};
        assertArrayEquals("Padding handling in decode failed", expected, Base64.decodeBase64(encoded));
    }

    @Test
    public void testNoPaddingHandlingWhenDecoding() {
        // "ABC" (no padding) decodes to {1, 2}
        byte[] encoded = {'A', 'B', 'C'};
        byte[] expected = {1, 2};
        assertArrayEquals("No padding handling in decode failed", expected, Base64.decodeBase64(encoded));
    }

    @Test
    public void testExtraPaddingHandlingWhenDecoding() {
        // "ABC==" should also decode to {1, 2} as extra padding is ignored.
        byte[] encoded = {'A', 'B', 'C', '=', '='};
        byte[] expected = {1, 2};
        assertArrayEquals("Extra padding handling in decode failed", expected, Base64.decodeBase64(encoded));
    }
}
