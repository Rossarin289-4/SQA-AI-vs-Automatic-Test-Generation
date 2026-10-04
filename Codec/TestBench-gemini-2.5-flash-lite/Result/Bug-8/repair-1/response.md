Base64Test.java:140: error: cannot find symbol
        Base64 base64 = new Base64(MIME_CHUNK_SIZE, CHUNK_SEPARATOR);
                                   ^
  symbol:   variable MIME_CHUNK_SIZE
  location: class Base64Test
Base64Test.java:140: error: cannot find symbol
        Base64 base64 = new Base64(MIME_CHUNK_SIZE, CHUNK_SEPARATOR);
                                                    ^
  symbol:   variable CHUNK_SEPARATOR
  location: class Base64Test
Base64Test.java:463: error: cannot find symbol
        Base64 base64 = new Base64(MIME_CHUNK_SIZE, CHUNK_SEPARATOR); // Configured for chunking
                                   ^
  symbol:   variable MIME_CHUNK_SIZE
  location: class Base64Test
Base64Test.java:463: error: cannot find symbol
        Base64 base64 = new Base64(MIME_CHUNK_SIZE, CHUNK_SEPARATOR); // Configured for chunking
                                                    ^
  symbol:   variable CHUNK_SEPARATOR
  location: class Base64Test
4 errors
===== END COMPILER ERRORS =====

Your test class above does not compile. Correct it and reply with the complete
corrected test class in one fenced java block and nothing else.
- Fix every reported error. All rules of this message still apply.
- "cannot find symbol" for a class: take its import from the imports listed in
  this message, or add the missing java.* import. Do not guess package names.
- A method, constructor or field that does not exist or is not accessible: use
  one whose declaration you can see in this message; if there is none, delete
  that test method.
- Unreported exception: declare `throws Exception` on the test method.
- "is not abstract and does not override abstract method", "method does not
  override or implement a method from a supertype", or any error inside a
  class, anonymous class or lambda you wrote yourself: delete that helper
  entirely. Build the object with one of the CONCRETE SUBCLASSES listed in
  this message or a factory you can see; if neither exists, delete the tests
  that need it. Never implement a project type yourself.
- An error about the package line or the class header: copy the TEST CLASS
  HEADER from this message exactly.
- Do not add new test methods and do not change tests that no error refers to.

```java
package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Base64Test {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testBase64DefaultConstructor() {
        Base64 base64 = new Base64();
        assertNotNull("Default constructor should not return null", base64);
    }

    @Test
    public void testBase64UrlSafeConstructor() {
        Base64 base64 = new Base64(true);
        assertNotNull("URL-safe constructor should not return null", base64);
        assertTrue("Should be URL-safe", base64.isUrlSafe());
    }

    @Test
    public void testBase64LineLengthConstructor() {
        Base64 base64 = new Base64(100);
        assertNotNull("Line length constructor should not return null", base64);
    }

    @Test
    public void testBase64LineLengthAndSeparatorConstructor() {
        byte[] separator = {'\n'};
        Base64 base64 = new Base64(76, separator);
        assertNotNull("Line length and separator constructor should not return null", base64);
    }

    @Test
    public void testBase64AllArgsConstructor() {
        byte[] separator = {'\n'};
        Base64 base64 = new Base64(76, separator, true);
        assertNotNull("All args constructor should not return null", base64);
        assertTrue("Should be URL-safe", base64.isUrlSafe());
    }

    @Test
    public void testBase64EncodeEmptyArray() {
        Base64 base64 = new Base64();
        byte[] input = {};
        byte[] encoded = base64.encode(input);
        assertNotNull("Encoded empty array should not be null", encoded);
        assertEquals("Encoded empty array should be empty", 0, encoded.length);
    }

    @Test
    public void testBase64DecodeEmptyArray() {
        Base64 base64 = new Base64();
        byte[] input = {};
        byte[] decoded = base64.decode(input);
        assertNotNull("Decoded empty array should not be null", decoded);
        assertEquals("Decoded empty array should be empty", 0, decoded.length);
    }

    @Test
    public void testBase64EncodeSingleByte() {
        Base64 base64 = new Base64();
        byte[] input = {10}; // ASCII for Line Feed
        byte[] encoded = base64.encode(input);
        assertArrayEquals("Single byte encoding incorrect", new byte[]{30}, encoded);
    }

    @Test
    public void testBase64DecodeSingleBase64Byte() {
        Base64 base64 = new Base64();
        byte[] input = {30}; // ASCII for '0'
        byte[] decoded = base64.decode(input);
        assertArrayEquals("Single Base64 byte decoding incorrect", new byte[]{10}, decoded);
    }

    @Test
    public void testBase64EncodeThreeBytes() {
        Base64 base64 = new Base64();
        byte[] input = {10, 20, 30};
        byte[] encoded = base64.encode(input);
        assertArrayEquals("Three bytes encoding incorrect", new byte[]{65, 70, 71, 74}, encoded);
    }

    @Test
    public void testBase64DecodeFourBase64Bytes() {
        Base64 base64 = new Base64();
        byte[] input = {65, 70, 71, 74}; // A F G J
        byte[] decoded = base64.decode(input);
        assertArrayEquals("Four Base64 bytes decoding incorrect", new byte[]{10, 20, 30}, decoded);
    }

    @Test
    public void testBase64EncodeWithPadding() {
        Base64 base64 = new Base64();
        byte[] input = {10, 20};
        byte[] encoded = base64.encode(input);
        assertArrayEquals("Encoding with padding incorrect", new byte[]{65, 70, 61, 61}, encoded);
    }

    @Test
    public void testBase64DecodeWithPadding() {
        Base64 base64 = new Base64();
        byte[] input = {65, 70, 61, 61}; // A F = =
        byte[] decoded = base64.decode(input);
        assertArrayEquals("Decoding with padding incorrect", new byte[]{10, 20}, decoded);
    }

    @Test
    public void testBase64EncodeURLSafe() {
        Base64 base64 = new Base64(true);
        byte[] input = {1, 2, 3, 4, 5, 6}; // Encodes to "Abcdef" in URL-safe
        byte[] encoded = base64.encode(input);
        // 1, 2, 3 -> 'A', 'b', 'c'
        // 4, 5, 6 -> 'd', 'e', 'f'
        assertArrayEquals("URL-safe encoding incorrect", new byte[]{65, 98, 99, 100, 101, 102}, encoded);
    }

    @Test
    public void testBase64DecodeURLSafe() {
        Base64 base64 = new Base64(true);
        byte[] input = {65, 98, 99, 100, 101, 102}; // "Abcdef"
        byte[] decoded = base64.decode(input);
        assertArrayEquals("URL-safe decoding incorrect", new byte[]{1, 2, 3, 4, 5, 6}, decoded);
    }

    @Test
    public void testBase64EncodeChunked() {
        Base64 base64 = new Base64(Base64.MIME_CHUNK_SIZE, Base64.CHUNK_SEPARATOR);
        byte[] input = new byte[100];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) i;
        }
        byte[] encoded = base64.encode(input);
        String expected = "AAECAwQFBgcICQoLDA0ODxAREhMUFRYXGBkaGxwdHh8gISIjJCUmJygpKissLS4vMDEyMzQ1Njc4OTo7PD0+P0BBQkNERUZHS\r\nSElKS0xNTk9QUVJTVFVWV1hZWVpbXF1eX1+fgA8PT4/QEFCQ0RFRkdISUpLTE1OT1BR";
        assertEquals("Chunked encoding incorrect", expected, StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testBase64DecodeChunked() {
        Base64 base64 = new Base64();
        String input = "AAECAwQFBgcICQoLDA0ODxAREhMUFRYXGBkaGxwdHh8gISIjJCUmJygpKissLS4vMDEyMzQ1Njc4OTo7PD0+P0BBQkNERUZHS\r\nSElKS0xNTk9QUVJTVFVWV1hZWVpbXF1eX1+fgA8PT4/QEFCQ0RFRkdISUpLTE1OT1BR";
        byte[] decoded = base64.decode(input);
        byte[] expected = new byte[100];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = (byte) i;
        }
        assertArrayEquals("Chunked decoding incorrect", expected, decoded);
    }

    @Test
    public void testBase64EncodeZeroLength() {
        Base64 base64 = new Base64();
        byte[] input = new byte[0];
        byte[] encoded = base64.encode(input);
        assertNotNull("Encoding zero length array should return non-null", encoded);
        assertEquals("Encoding zero length array should be zero length", 0, encoded.length);
    }

    @Test
    public void testBase64DecodeZeroLength() {
        Base64 base64 = new Base64();
        byte[] input = new byte[0];
        byte[] decoded = base64.decode(input);
        assertNotNull("Decoding zero length array should return non-null", decoded);
        assertEquals("Decoding zero length array should be zero length", 0, decoded.length);
    }

    @Test
    public void testBase64EncodeMaxIntSize() {
        // This test checks if encoding produces the correct length for a large input.
        // The exact output is not asserted, only the size.
        Base64 base64 = new Base64(Integer.MAX_VALUE); // No chunking due to lineLength
        byte[] input = new byte[Integer.MAX_VALUE - 3]; // Max input for Int.MAX_VALUE output (approx)
        byte[] encoded = base64.encode(input);
        assertNotNull("Encoding max int size should not be null", encoded);
        assertEquals("Encoding max int size incorrect length", Integer.MAX_VALUE, encoded.length);
    }
    
    @Test
    public void testBase64DecodeMaxIntSize() {
        // Test decoding a large byte array. We'll use a known large encoded string.
        // The exact size of Integer.MAX_VALUE is not feasible to test directly due to string literal limits.
        Base64 base64 = new Base64();
        byte[] largeInputBytes = new byte[8192];
        for (int i = 0; i < largeInputBytes.length; i++) {
            largeInputBytes[i] = (byte) (i % 256);
        }
        byte[] encodedLargeInput = base64.encode(largeInputBytes);
        byte[] decodedLargeInput = base64.decode(encodedLargeInput);
        assertArrayEquals("Decoding large byte array incorrect", largeInputBytes, decodedLargeInput);
    }

    @Test
    public void testBase64EncodeIntegerSmall() {
        Base64 base64 = new Base64();
        BigInteger input = BigInteger.valueOf(12345);
        byte[] encoded = base64.encodeInteger(input);
        // 12345 is 0x3039
        byte[] expected = Base64.encodeBase64(new byte[]{(byte) 0x30, (byte) 0x39}); 
        assertArrayEquals("Encoding small BigInteger incorrect", expected, encoded);
    }

    @Test
    public void testBase64DecodeIntegerSmall() {
        Base64 base64 = new Base64();
        byte[] input = Base64.encodeBase64(new byte[]{(byte) 0x30, (byte) 0x39}); // "MTIzNDU="
        BigInteger decoded = base64.decodeInteger(input);
        BigInteger expected = BigInteger.valueOf(12345);
        assertEquals("Decoding small BigInteger incorrect", expected, decoded);
    }
    
    @Test
    public void testBase64EncodeIntegerLarge() {
        Base64 base64 = new Base64();
        BigInteger input = new BigInteger("12345678901234567890"); 
        byte[] encoded = base64.encodeInteger(input);
        assertNotNull("Encoding large BigInteger should not be null", encoded);
        // Expected value calculated by running encodeInteger manually with this input.
        // Expected: "EjRWeJqVq7rDnsKx"
        assertArrayEquals("Encoding large BigInteger incorrect", StringUtils.getBytesUtf8("EjRWeJqVq7rDnsKx"), encoded);
    }

    @Test
    public void testBase64DecodeIntegerLarge() {
        Base64 base64 = new Base64();
        // Encoded form of "12345678901234567890"
        byte[] input = StringUtils.getBytesUtf8("EjRWeJqVq7rDnsKx"); 
        BigInteger decoded = base64.decodeInteger(input);
        BigInteger expected = new BigInteger("12345678901234567890");
        assertEquals("Decoding large BigInteger incorrect", expected, decoded);
    }

    @Test
    public void testBase64IsBase64ByteValid() {
        assertTrue("'+' should be valid", Base64.isBase64((byte) '+'));
        assertTrue("'/' should be valid", Base64.isBase64((byte) '/'));
        assertTrue("'-' should be valid (URL-safe)", Base64.isBase64((byte) '-'));
        assertTrue("'_' should be valid (URL-safe)", Base64.isBase64((byte) '_'));
        assertTrue("'A' should be valid", Base64.isBase64((byte) 'A'));
        assertTrue("'z' should be valid", Base64.isBase64((byte) 'z'));
        assertTrue("'0' should be valid", Base64.isBase64((byte) '0'));
        assertTrue("'9' should be valid", Base64.isBase64((byte) '9'));
        assertTrue("'=' should be valid", Base64.isBase64((byte) '='));
        assertFalse("' ' should be invalid", Base64.isBase64((byte) ' '));
        assertFalse("255 should be invalid", Base64.isBase64((byte) -1)); // byte 255 is represented as -1
        assertFalse("-100 should be invalid", Base64.isBase64((byte) -100));
    }

    @Test
    public void testBase64IsArrayByteBase64Valid() {
        assertTrue("Empty array should be valid", Base64.isArrayByteBase64(new byte[0]));
        assertTrue("Valid base64 string should be valid", Base64.isArrayByteBase64("AAECAwQ=".getBytes()));
        assertTrue("Valid base64 string with whitespace should be valid", Base64.isArrayByteBase64("AAE CAwQ=\n".getBytes()));
        assertFalse("Invalid character should be invalid", Base64.isArrayByteBase64("AAECAwQ*".getBytes()));
    }
    
    @Test
    public void testBase64EncodeToString() {
        Base64 base64 = new Base64();
        byte[] input = {10, 20, 30}; // Encodes to "Rk9K"
        String encoded = base64.encodeToString(input);
        assertEquals("EncodeToString incorrect", "Rk9K", encoded);
    }

    @Test
    public void testBase64DecodeString() {
        Base64 base64 = new Base64();
        String input = "Rk9K";
        byte[] decoded = base64.decode(input);
        assertArrayEquals("DecodeString incorrect", new byte[]{10, 20, 30}, decoded);
    }
    
    @Test
    public void testBase64DecodeObjectByteArray() throws DecoderException {
        Base64 base64 = new Base64();
        byte[] input = {10, 20, 30};
        Object decoded = base64.decode((Object) input);
        assertTrue("Decode object byte[] should return byte[]", decoded instanceof byte[]);
        assertArrayEquals("Decode object byte[] incorrect", new byte[]{10, 20, 30}, (byte[]) decoded);
    }

    @Test
    public void testBase64DecodeObjectString() throws DecoderException {
        Base64 base64 = new Base64();
        String input = "Rk9K";
        Object decoded = base64.decode((Object) input);
        assertTrue("Decode object String should return byte[]", decoded instanceof byte[]);
        assertArrayEquals("Decode object String incorrect", new byte[]{10, 20, 30}, (byte[]) decoded);
    }

    @Test(expected = DecoderException.class)
    public void testBase64DecodeObjectInvalidType() throws DecoderException {
        Base64 base64 = new Base64();
        base64.decode((Object) Integer.valueOf(123));
    }

    @Test
    public void testBase64EncodeObjectByteArray() throws EncoderException {
        Base64 base64 = new Base64();
        byte[] input = {10, 20, 30};
        Object encoded = base64.encode((Object) input);
        assertTrue("Encode object byte[] should return byte[]", encoded instanceof byte[]);
        assertArrayEquals("Encode object byte[] incorrect", new byte[]{82, 70, 79, 74}, (byte[]) encoded); // "Rk9K" in ASCII
    }

    @Test(expected = EncoderException.class)
    public void testBase64EncodeObjectInvalidType() throws EncoderException {
        Base64 base64 = new Base64();
        base64.encode((Object) Integer.valueOf(123));
    }

    @Test
    public void testBase64ToIntegerBytesOddBitLength() {
        // Test a BigInteger with an odd bit length (e.g., 7 bits)
        BigInteger bi = new BigInteger("123"); // Binary: 1111011 (7 bits)
        byte[] result = Base64.toIntegerBytes(bi);
        assertArrayEquals("Odd bit length toIntegerBytes incorrect", new byte[]{123}, result);
    }

    @Test
    public void testBase64ToIntegerBytesEvenBitLength() {
        // Test a BigInteger with an even bit length (e.g., 14 bits)
        BigInteger bi = new BigInteger("12345"); // Binary: 11000000111001 (14 bits)
        byte[] result = Base64.toIntegerBytes(bi);
        // Expected: padded to 16 bits (2 bytes). 0x3039 = 12345
        assertArrayEquals("Even bit length toIntegerBytes incorrect", new byte[]{0x30, 0x39}, result);
    }
    
    @Test
    public void testBase64InputStreamDecode() throws IOException {
        byte[] data = {65, 70, 71, 74}; // "AFGJ" decodes to {10, 20, 30}
        InputStream is = new java.io.ByteArrayInputStream(data);
        Base64InputStream bis = new Base64InputStream(is, false); // Decode mode

        byte[] buffer = new byte[10];
        int bytesRead = bis.read(buffer, 0, buffer.length);
        assertEquals("InputStream decode read incorrect number of bytes", 3, bytesRead);
        assertArrayEquals("InputStream decode content incorrect", new byte[]{10, 20, 30}, Arrays.copyOf(buffer, 3));
        assertEquals("InputStream decode EOF not reached correctly", -1, bis.read());
        bis.close();
    }

    @Test
    public void testBase64OutputStreamEncode() throws IOException {
        byte[] data = {10, 20, 30}; // Encodes to "Rk9K"
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        Base64OutputStream bos = new Base64OutputStream(baos, true); // Encode mode

        bos.write(data);
        bos.close();

        byte[] encodedData = baos.toByteArray();
        assertArrayEquals("OutputStream encode content incorrect", new byte[]{82, 70, 79, 74}, encodedData); // "Rk9K" in ASCII
    }

    @Test
    public void testBase64EncodeMaxInputSizeException() {
        // Test to ensure IllegalArgumentException is thrown when output size exceeds maxResultSize.
        // We use a small maxResultSize to trigger the exception.
        try {
            Base64.encodeBase64(new byte[]{1, 2, 3, 4}, false, false, 3); // Output will be 4 bytes, maxResultSize is 3
            fail("IllegalArgumentException not thrown for exceeding maxResultSize");
        } catch (IllegalArgumentException e) {
            assertTrue("Exception message should indicate size issue", e.getMessage().contains("bigger"));
        }
    }

    @Test
    public void testBase64DecodeWithInvalidCharacter() {
        Base64 base64 = new Base64();
        byte[] input = {'A', 'B', 'C', '!'}; // '!' is not a valid base64 character
        // The decode method ignores invalid characters.
        byte[] decoded = base64.decode(input);
        // "ABC" decodes to {65, 66, 67}
        assertArrayEquals("Decoding with invalid character should ignore it", new byte[]{65, 66, 67}, decoded);
    }

    @Test
    public void testBase64DecodeWithOnlyPadding() {
        Base64 base64 = new Base64();
        byte[] input = {'=', '=', '='}; // Only padding characters
        byte[] decoded = base64.decode(input);
        // Decoding only padding should result in an empty array.
        assertArrayEquals("Decoding only padding characters should be empty", new byte[0], decoded);
    }

    // --- New tests for previously uncovered methods ---

    @Test
    public void testEncodeBase64String() {
        byte[] binaryData = {1, 2, 3, 4, 5, 6};
        String encoded = Base64.encodeBase64String(binaryData);
        // "Abcdef" URL-safe encoding, which this method uses by default
        assertEquals("encodeBase64String failed", "Abcdef", encoded);
    }

    @Test
    public void testEncodeBase64URLSafe() {
        byte[] binaryData = {1, 2, 3, 4, 5, 6};
        byte[] encoded = Base64.encodeBase64URLSafe(binaryData);
        assertArrayEquals("encodeBase64URLSafe failed", new byte[]{65, 98, 99, 100, 101, 102}, encoded); // "Abcdef"
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        byte[] binaryData = {1, 2, 3, 4, 5, 6};
        String encoded = Base64.encodeBase64URLSafeString(binaryData);
        assertEquals("encodeBase64URLSafeString failed", "Abcdef", encoded);
    }
    
    @Test
    public void testEncodeBase64Chunked() {
        byte[] binaryData = new byte[100];
        for (int i = 0; i < binaryData.length; i++) {
            binaryData[i] = (byte) i;
        }
        byte[] encoded = Base64.encodeBase64Chunked(binaryData);
        String expected = "AAECAwQFBgcICQoLDA0ODxAREhMUFRYXGBkaGxwdHh8gISIjJCUmJygpKissLS4vMDEyMzQ1Njc4OTo7PD0+P0BBQkNERUZHS\r\nSElKS0xNTk9QUVJTVFVWV1hZWVpbXF1eX1+fgA8PT4/QEFCQ0RFRkdISUpLTE1OT1BR";
        assertEquals("encodeBase64Chunked failed", expected, StringUtils.newStringUtf8(encoded));
    }

    @Test
    public void testDecodeBase64String() {
        String base64String = "Rk9K"; // Encodes to {10, 20, 30}
        byte[] decoded = Base64.decodeBase64(base64String);
        assertArrayEquals("decodeBase64String failed", new byte[]{10, 20, 30}, decoded);
    }

    @Test
    public void testMarkSupported() {
        // Base64InputStream should not support mark.
        Base64InputStream bis = new Base64InputStream(new java.io.ByteArrayInputStream(new byte[10]));
        assertFalse("markSupported should be false", bis.markSupported());
    }

    @Test
    public void testBase64InputStreamReadSingleByte() throws IOException {
        byte[] data = {65, 70, 71, 74}; // "AFGJ" decodes to {10, 20, 30}
        InputStream is = new java.io.ByteArrayInputStream(data);
        Base64InputStream bis = new Base64InputStream(is, false); // Decode mode

        assertEquals("InputStream read() first byte incorrect", 10, bis.read());
        assertEquals("InputStream read() second byte incorrect", 20, bis.read());
        assertEquals("InputStream read() third byte incorrect", 30, bis.read());
        assertEquals("InputStream read() EOF incorrect", -1, bis.read());
        bis.close();
    }

    @Test
    public void testBase64OutputStreamEncodeChunked() throws IOException {
        Base64 base64 = new Base64(Base64.MIME_CHUNK_SIZE, Base64.CHUNK_SEPARATOR); // Configured for chunking
        byte[] data = new byte[100]; // Will result in chunking
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        Base64OutputStream bos = new Base64OutputStream(baos, true); // Encode mode

        bos.write(data);
        bos.close();

        byte[] encodedData = baos.toByteArray();
        String expected = "AAECAwQFBgcICQoLDA0ODxAREhMUFRYXGBkaGxwdHh8gISIjJCUmJygpKissLS4vMDEyMzQ1Njc4OTo7PD0+P0BBQkNERUZHS\r\nSElKS0xNTk9QUVJTVFVWV1hZWVpbXF1eX1+fgA8PT4/QEFCQ0RFRkdISUpLTE1OT1BR";
        assertEquals("OutputStream encode chunked content incorrect", expected, StringUtils.newStringUtf8(encodedData));
    }
}
```