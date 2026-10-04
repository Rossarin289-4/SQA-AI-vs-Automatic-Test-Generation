package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Base64Test {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testBase64Encode_EmptyArray() {
        byte[] data = new byte[0];
        byte[] encoded = Base64.encodeBase64(data);
        assertNotNull(encoded);
        assertEquals(0, encoded.length);
    }

    @Test
    public void testBase64Encode_NullArray() {
        byte[] data = null;
        byte[] encoded = Base64.encodeBase64(data);
        assertNull(encoded);
    }

    @Test
    public void testBase64Encode_SimpleArray() {
        byte[] data = {1, 2, 3};
        byte[] encoded = Base64.encodeBase64(data);
        assertArrayEquals("AQID".getBytes(), encoded);
    }

    @Test
    public void testBase64Encode_ArrayWithPadding() {
        byte[] data = {1, 2};
        byte[] encoded = Base64.encodeBase64(data);
        assertArrayEquals("AQI=".getBytes(), encoded);
    }

    @Test
    public void testBase64Encode_LargerArray() {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] encoded = Base64.encodeBase64(data);
        assertArrayEquals("AQIDBAUGBwgK".getBytes(), encoded);
    }

    @Test
    public void testBase64Encode_ArrayWithPaddingAndLineBreak() {
        byte[] data = {1, 2, 3, 4, 5, 6, 7};
        byte[] encoded = Base64.encodeBase64(data, true);
        String expected = "AQIDBAUG\r\n" + "Bw==\r\n";
        assertArrayEquals(expected.getBytes(), encoded);
    }

    @Test
    public void testBase64Encode_URLSafeSimpleArray() {
        byte[] data = {1, 2, 3};
        byte[] encoded = Base64.encodeBase64(data, false, true);
        assertArrayEquals("AQID".getBytes(), encoded);
    }

    @Test
    public void testBase64Encode_URLSafeArrayWithPadding() {
        byte[] data = {1, 2};
        byte[] encoded = Base64.encodeBase64(data, false, true);
        assertArrayEquals("AQI=".getBytes(), encoded);
    }

    @Test
    public void testBase64Encode_URLSafeWithSpecialChars() {
        byte[] data = {(byte) 0xff, (byte) 0xff, (byte) 0xff}; // Should encode to /// or ____
        byte[] encoded = Base64.encodeBase64(data, false, true);
        assertArrayEquals("____".getBytes(), encoded);
    }

    @Test
    public void testBase64Encode_URLSafeChunked() {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] encoded = Base64.encodeBase64(data, true, true);
        String expected = "AQIDBAUG\r\n" + "BwgJ\r\n";
        assertArrayEquals(expected.getBytes(), encoded);
    }

    @Test
    public void testBase64Decode_EmptyArray() throws DecoderException {
        byte[] data = new byte[0];
        byte[] decoded = new Base64().decode(data);
        assertNotNull(decoded);
        assertEquals(0, decoded.length);
    }

    @Test
    public void testBase64Decode_NullArray() throws DecoderException {
        byte[] data = null;
        byte[] decoded = new Base64().decode(data);
        assertNull(decoded);
    }

    @Test
    public void testBase64Decode_SimpleArray() throws DecoderException {
        byte[] data = "AQID".getBytes();
        byte[] decoded = new Base64().decode(data);
        assertArrayEquals(new byte[]{1, 2, 3}, decoded);
    }

    @Test
    public void testBase64Decode_ArrayWithPadding() throws DecoderException {
        byte[] data = "AQI=".getBytes();
        byte[] decoded = new Base64().decode(data);
        assertArrayEquals(new byte[]{1, 2}, decoded);
    }

    @Test
    public void testBase64Decode_ArrayWithDoublePadding() throws DecoderException {
        byte[] data = "AQ==".getBytes();
        byte[] decoded = new Base64().decode(data);
        assertArrayEquals(new byte[]{1}, decoded);
    }

    @Test
    public void testBase64Decode_LargerArray() throws DecoderException {
        byte[] data = "AQIDBAUGBwgK".getBytes();
        byte[] decoded = new Base64().decode(data);
        assertArrayEquals(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, decoded);
    }

    @Test
    public void testBase64Decode_ArrayWithLineBreaks() throws DecoderException {
        byte[] data = "AQIDBAUG\r\nBw==\r\n".getBytes();
        byte[] decoded = new Base64().decode(data);
        assertArrayEquals(new byte[]{1, 2, 3, 4, 5, 6, 7}, decoded);
    }

    @Test
    public void testBase64Decode_URLSafeArray() throws DecoderException {
        byte[] data = "AQID".getBytes();
        Base64 decoder = new Base64(true); // URL-safe decoder
        byte[] decoded = decoder.decode(data);
        assertArrayEquals(new byte[]{1, 2, 3}, decoded);
    }

    @Test
    public void testBase64Decode_URLSafeWithSpecialChars() throws DecoderException {
        byte[] data = "____".getBytes(); // Encoded from \xff\xff\xff
        Base64 decoder = new Base64(true);
        byte[] decoded = decoder.decode(data);
        assertArrayEquals(new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff}, decoded);
    }

    @Test
    public void testBase64Decode_URLSafeWithPadding() throws DecoderException {
        byte[] data = "AQI=".getBytes();
        Base64 decoder = new Base64(true);
        byte[] decoded = decoder.decode(data);
        assertArrayEquals(new byte[]{1, 2}, decoded);
    }

    @Test
    public void testBase64Decode_URLSafeWithDoublePadding() throws DecoderException {
        byte[] data = "AQ==".getBytes();
        Base64 decoder = new Base64(true);
        byte[] decoded = decoder.decode(data);
        assertArrayEquals(new byte[]{1}, decoded);
    }

    @Test
    public void testBase64Decode_StringInput() throws DecoderException {
        String data = "AQID";
        byte[] decoded = new Base64().decode(data);
        assertArrayEquals(new byte[]{1, 2, 3}, decoded);
    }

    @Test
    public void testBase64Decode_StringInputWithPadding() throws DecoderException {
        String data = "AQI=";
        byte[] decoded = new Base64().decode(data);
        assertArrayEquals(new byte[]{1, 2}, decoded);
    }

    @Test
    public void testBase64Decode_StringInputWithDoublePadding() throws DecoderException {
        String data = "AQ==";
        byte[] decoded = new Base64().decode(data);
        assertArrayEquals(new byte[]{1}, decoded);
    }

    @Test
    public void testBase64Decode_StringInputWithLineBreaks() throws DecoderException {
        String data = "AQIDBAUG\r\nBw==\r\n";
        byte[] decoded = new Base64().decode(data);
        assertArrayEquals(new byte[]{1, 2, 3, 4, 5, 6, 7}, decoded);
    }

    @Test
    public void testBase64EncodeToString() {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String encoded = Base64.encodeBase64String(data);
        assertEquals("AQIDBAUGBwgK", encoded);
    }

    @Test
    public void testBase64EncodeToString_Chunked() {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        String encoded = Base64.encodeBase64String(data);
        String expected = "AQIDBAUG\r\n" +
                          "BwgJ\r\n" +
                          "CkpK\r\n" +
                          "TFRQ\r\n" +
                          "VVRX\r\n" +
                          "GF2e\r\n" +
                          "Zg==\r\n";
        assertEquals(expected, encoded);
    }

    @Test
    public void testBase64EncodeToString_URLSafe() {
        byte[] data = {(byte) 0xff, (byte) 0xff, (byte) 0xff};
        String encoded = Base64.encodeBase64URLSafeString(data);
        assertEquals("____", encoded);
    }

    @Test
    public void testBase64DecodeBase64_String() {
        String data = "AQID";
        byte[] decoded = Base64.decodeBase64(data);
        assertArrayEquals(new byte[]{1, 2, 3}, decoded);
    }

    @Test
    public void testBase64DecodeBase64_ByteArray() {
        byte[] data = "AQID".getBytes();
        byte[] decoded = Base64.decodeBase64(data);
        assertArrayEquals(new byte[]{1, 2, 3}, decoded);
    }

    @Test
    public void testBase64DecodeBase64_StringWithPadding() {
        String data = "AQI=";
        byte[] decoded = Base64.decodeBase64(data);
        assertArrayEquals(new byte[]{1, 2}, decoded);
    }

    @Test
    public void testBase64DecodeBase64_ByteArrayWithPadding() {
        byte[] data = "AQI=".getBytes();
        byte[] decoded = Base64.decodeBase64(data);
        assertArrayEquals(new byte[]{1, 2}, decoded);
    }

    @Test
    public void testIsBase64_ValidChars() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '0'));
        assertTrue(Base64.isBase64((byte) '9'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '-')); // URL safe
        assertTrue(Base64.isBase64((byte) '_')); // URL safe
        assertTrue(Base64.isBase64((byte)'=')); // PAD character
    }

    @Test
    public void testIsBase64_InvalidChars() {
        assertFalse(Base64.isBase64((byte) ' '));
        assertFalse(Base64.isBase64((byte) '\n'));
        assertFalse(Base64.isBase64((byte) '\r'));
        assertFalse(Base64.isBase64((byte) '\t'));
        assertFalse(Base64.isBase64((byte) 127)); // Max ASCII value that is not in base64
        assertFalse(Base64.isBase64((byte) -1));
        // The fix for the compiler error: The expression (63 + 1) evaluates to 64,
        // which is then cast to a byte. The original code was trying to cast
        // the result of the addition to a byte before it was used in isBase64.
        // The correct way is to ensure the literal 63 is treated as a byte,
        // and then the addition happens. However, isBase64 takes a byte, so
        // 63+1 will be evaluated as int and then cast to byte.
        // A simpler way to ensure we test the value *after* the valid range for base64,
        // and avoiding potential issues with byte arithmetic for the literal is to
        // use a value known to be outside the valid range. 64 is safe here.
        assertFalse(Base64.isBase64((byte) (63 + 1))); // Value after last valid base64 char
    }

    @Test
    public void testIsArrayByteBase64_Valid() {
        assertTrue(Base64.isArrayByteBase64("".getBytes()));
        assertTrue(Base64.isArrayByteBase64("A".getBytes()));
        assertTrue(Base64.isArrayByteBase64("AQI=".getBytes()));
        assertTrue(Base64.isArrayByteBase64("AQI=\r\n".getBytes())); // Whitespace is ignored for validation
    }

    @Test
    public void testIsArrayByteBase64_Invalid() {
        assertFalse(Base64.isArrayByteBase64("A?".getBytes()));
        assertFalse(Base64.isArrayByteBase64("A?=".getBytes()));
    }

    @Test
    public void testEncodeInteger_Positive() {
        BigInteger bigInt = new BigInteger("12345");
        byte[] encoded = Base64.encodeInteger(bigInt);
        assertArrayEquals("MTIzNDU=".getBytes(), encoded);
    }

    @Test
    public void testEncodeInteger_Zero() {
        BigInteger bigInt = BigInteger.ZERO;
        byte[] encoded = Base64.encodeInteger(bigInt);
        assertArrayEquals("AA==".getBytes(), encoded);
    }

    @Test
    public void testEncodeInteger_Negative() {
        BigInteger bigInt = new BigInteger("-12345");
        byte[] encoded = Base64.encodeInteger(bigInt);
        assertArrayEquals("1v2tKw==".getBytes(), encoded);
    }

    @Test
    public void testDecodeInteger_Positive() throws DecoderException {
        byte[] data = "MTIzNDU=".getBytes();
        BigInteger decoded = Base64.decodeInteger(data);
        assertEquals(new BigInteger("12345"), decoded);
    }

    @Test
    public void testDecodeInteger_Zero() throws DecoderException {
        byte[] data = "AA==".getBytes();
        BigInteger decoded = Base64.decodeInteger(data);
        assertEquals(BigInteger.ZERO, decoded);
    }

    @Test
    public void testDecodeInteger_FromNegativeEncoded() throws DecoderException {
        byte[] data = "1v2tKw==".getBytes();
        BigInteger decoded = Base64.decodeInteger(data);
        assertEquals(new BigInteger("-12345"), decoded);
    }

    @Test
    public void testIsUrlSafe_True() {
        Base64 encoder = new Base64(true);
        assertTrue(encoder.isUrlSafe());
    }

    @Test
    public void testIsUrlSafe_False() {
        Base64 encoder = new Base64(false);
        assertFalse(encoder.isUrlSafe());
    }

    @Test
    public void testEncodeBase64URLSafe_Simple() {
        byte[] data = {1, 2, 3};
        byte[] encoded = Base64.encodeBase64URLSafe(data);
        assertArrayEquals("AQID".getBytes(), encoded);
    }

    @Test
    public void testEncodeBase64URLSafe_WithPadding() {
        byte[] data = {1, 2};
        byte[] encoded = Base64.encodeBase64URLSafe(data);
        assertArrayEquals("AQI=".getBytes(), encoded);
    }

    @Test
    public void testEncodeBase64Chunked_Simple() {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] encoded = Base64.encodeBase64Chunked(data);
        String expected = "AQIDBAUG\r\n" + "BwgK\r\n";
        assertArrayEquals(expected.getBytes(), encoded);
    }
    
    @Test
    public void testEncodeBase64Chunked_WithPadding() {
        byte[] data = {1, 2, 3, 4, 5, 6, 7};
        byte[] encoded = Base64.encodeBase64Chunked(data);
        String expected = "AQIDBAUG\r\n" + "Bw==\r\n";
        assertArrayEquals(expected.getBytes(), encoded);
    }

    @Test
    public void testEncode_ObjectArray() throws EncoderException {
        byte[] data = {1, 2, 3};
        Object encoded = new Base64().encode(data);
        assertTrue(encoded instanceof byte[]);
        assertArrayEquals("AQID".getBytes(), (byte[]) encoded);
    }

    @Test
    public void testEncode_ObjectArray_Null() throws EncoderException {
        Object encoded = new Base64().encode(null);
        assertNull(encoded);
    }

    @Test
    public void testEncodeToString_Simple() {
        byte[] data = {1, 2, 3};
        String encoded = new Base64().encodeToString(data);
        assertEquals("AQID", encoded);
    }

    @Test
    public void testEncodeToString_WithPadding() {
        byte[] data = {1, 2};
        String encoded = new Base64().encodeToString(data);
        assertEquals("AQI=", encoded);
    }

    @Test
    public void testEncodeToString_Chunked() {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String encoded = new Base64(76, null).encodeToString(data); // Using default chunk size and separator
        String expected = "AQIDBAUG\r\n" + "BwgK\r\n";
        assertEquals(expected, encoded);
    }
    
    @Test
    public void testEncodeToString_URLSafe() {
        byte[] data = {(byte) 0xff, (byte) 0xff, (byte) 0xff};
        String encoded = new Base64(true).encodeToString(data);
        assertEquals("____", encoded);
    }
}
