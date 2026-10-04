package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class Base64InputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testRead_EmptyInputStream_Decode() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream bais = new Base64InputStream(in, false);
        assertEquals(-1, bais.read());
    }

    @Test
    public void testRead_EmptyInputStream_Encode() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream bais = new Base64InputStream(in, true);
        assertEquals(-1, bais.read());
    }

    @Test
    public void testRead_SimpleDecode() throws Exception {
        String encoded = "QQ=="; // A
        InputStream in = new ByteArrayInputStream(encoded.getBytes());
        Base64InputStream bais = new Base64InputStream(in, false);
        assertEquals('A', bais.read());
        assertEquals(-1, bais.read());
    }

    @Test
    public void testRead_SimpleEncode() throws Exception {
        byte[] data = {0x41}; // A
        InputStream in = new ByteArrayInputStream(data);
        Base64InputStream bais = new Base64InputStream(in, true);
        // RFC 2045 states line length of 76, default line ending is CRLF.
        // For a single byte, it should produce padding and the line ending.
        byte[] expected = "QQ==\r\n".getBytes(); 
        byte[] actual = new byte[expected.length];
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRead_DecodeWithPadding() throws Exception {
        String encoded = "Zm9vYg=="; // foob
        InputStream in = new ByteArrayInputStream(encoded.getBytes());
        Base64InputStream bais = new Base64InputStream(in, false);
        byte[] expected = "foob".getBytes();
        byte[] actual = new byte[4];
        int bytesRead = bais.read(actual);
        assertEquals(4, bytesRead);
        assertArrayEquals(expected, actual);
        assertEquals(-1, bais.read());
    }

    @Test
    public void testRead_EncodeWithPadding() throws Exception {
        byte[] data = {0x66, 0x6f, 0x6f, 0x62}; // foob
        InputStream in = new ByteArrayInputStream(data);
        Base64InputStream bais = new Base64InputStream(in, true);
        // With default lineLength=76, "foob" should be encoded as "Zm9vYg==" without line breaks.
        byte[] expected = "Zm9vYg==\r\n".getBytes(); 
        byte[] actual = new byte[expected.length];
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRead_DecodeMultipleBytes() throws Exception {
        String encoded = "SGVsbG8gV29ybGQ="; // Hello World
        InputStream in = new ByteArrayInputStream(encoded.getBytes());
        Base64InputStream bais = new Base64InputStream(in, false);
        byte[] expected = "Hello World".getBytes();
        byte[] actual = new byte[expected.length];
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
        assertEquals(-1, bais.read());
    }

    @Test
    public void testRead_EncodeMultipleBytes() throws Exception {
        byte[] data = "Hello World".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        Base64InputStream bais = new Base64InputStream(in, true);
        // Default lineLength=76. "Hello World" is 11 bytes, which is less than 76. No line breaks expected.
        byte[] expected = "SGVsbG8gV29ybGQ=\r\n".getBytes();
        byte[] actual = new byte[expected.length];
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRead_DecodeWithLineBreaks() throws Exception {
        // Original: "QQHB\r\nQkM=\r\n" which decodes to "ABC"
        // "QQHB" is not valid base64. "QQ==" is 'A'.
        // The code skips non-base64 characters. So, it should decode "QQ==" to 'A' and "QkM=" to "BC".
        String encoded = "QQ==\r\nBC\r\n"; 
        InputStream in = new ByteArrayInputStream(encoded.getBytes());
        Base64InputStream bais = new Base64InputStream(in, false);
        byte[] expected = "ABC".getBytes();
        byte[] actual = new byte[3];
        int bytesRead = bais.read(actual);
        assertEquals(3, bytesRead);
        assertArrayEquals(expected, actual);
        assertEquals(-1, bais.read());
    }

    @Test
    public void testRead_EncodeWithLineBreaks() throws Exception {
        byte[] data = "ABC".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        // Line length 4, custom line separator '\n'.
        // "ABC" -> "QUJD"
        // Since lineLength is 4, it should insert a line break after "QUJB".
        Base64InputStream bais = new Base64InputStream(in, true, 4, new byte[]{'\n'}); 
        byte[] expected = "QUJD\n".getBytes(); // "QUJD" is 4 characters, no line break needed before the end.
        byte[] actual = new byte[expected.length];
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRead_DecodeNonBase64Chars() throws Exception {
        String encoded = "QQ== XYZ"; // A with garbage
        InputStream in = new ByteArrayInputStream(encoded.getBytes());
        Base64InputStream bais = new Base64InputStream(in, false);
        assertEquals('A', bais.read());
        // The " XYZ" part should be ignored by the decoder.
        assertEquals(-1, bais.read()); 
    }
    
    @Test
    public void testRead_EncodeNoLineLength() throws Exception {
        byte[] data = "ABC".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        // lineLength <= 0 means encoded data is not divided into lines.
        // Base64.encodeBase64("ABC".getBytes()) -> "QUJD". 
        // The default line ending is applied at the end for non-chunked output.
        Base64InputStream bais = new Base64InputStream(in, true, 0, null); 
        byte[] expected = "QUJD\r\n".getBytes(); 
        byte[] actual = new byte[expected.length];
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRead_EncodeWithCustomLineSeparator() throws Exception {
        byte[] data = "ABC".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        byte[] customSeparator = {0x0A, 0x0D}; // LFCR
        // Line length 3. "ABC" -> "QUJD"
        // First 3 chars "QUJ" followed by custom separator. Then "C" followed by default line ending.
        Base64InputStream bais = new Base64InputStream(in, true, 3, customSeparator); 
        byte[] expected = "QUJ".concat(new String(customSeparator)).concat("C\r\n").getBytes(); 
        byte[] actual = new byte[expected.length];
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRead_DecodeEmptyInputAfterContent() throws Exception {
        String encoded = "QQ=="; // A
        InputStream in = new ByteArrayInputStream(encoded.getBytes());
        Base64InputStream bais = new Base64InputStream(in, false);
        assertEquals('A', bais.read());
        assertEquals(-1, bais.read());
        // Subsequent reads should also return -1
        assertEquals(-1, bais.read());
    }
    
    @Test
    public void testRead_EncodeEmptyInputAfterContent() throws Exception {
        byte[] data = {0x41}; // A
        InputStream in = new ByteArrayInputStream(data);
        Base64InputStream bais = new Base64InputStream(in, true);
        // Default line length is 76. "A" -> "QQ==".
        byte[] expected = "QQ==\r\n".getBytes();
        byte[] actual = new byte[expected.length];
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
        // Subsequent reads should return -1
        assertEquals(-1, bais.read());
    }

    @Test
    public void testMarkSupported_AlwaysFalse() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream bais = new Base64InputStream(in, false);
        assertFalse(bais.markSupported());
    }

    @Test
    public void testRead_DecodeWithMultipleBlocksAndBufferControl() throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) { // Create data that will span multiple Base64 blocks
            sb.append("This is a test string number ").append(i).append(".\r\n");
        }
        String originalString = sb.toString();
        byte[] originalBytes = originalString.getBytes();

        byte[] encodedBytes = Base64.encodeBase64(originalBytes);
        InputStream in = new ByteArrayInputStream(encodedBytes);
        Base64InputStream bais = new Base64InputStream(in, false);

        byte[] buffer = new byte[100]; // Smaller buffer to force multiple read calls
        byte[] decodedBytes = new byte[0];
        int bytesRead;
        while ((bytesRead = bais.read(buffer)) != -1) {
            decodedBytes = Arrays.copyOf(decodedBytes, decodedBytes.length + bytesRead);
            System.arraycopy(buffer, 0, decodedBytes, decodedBytes.length - bytesRead, bytesRead);
        }
        
        assertArrayEquals(originalBytes, decodedBytes);
    }

    @Test
    public void testRead_EncodeWithMultipleBlocksAndBufferControl() throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) { // Create data that will span multiple Base64 blocks
            sb.append("This is a test string number ").append(i).append(".\r\n");
        }
        byte[] originalBytes = sb.toString().getBytes();

        InputStream in = new ByteArrayInputStream(originalBytes);
        Base64InputStream bais = new Base64InputStream(in, true, 76, new byte[]{'\r', '\n'}); // Default MIME settings

        byte[] buffer = new byte[100]; // Smaller buffer to force multiple read calls
        byte[] encodedBytes = new byte[0];
        int bytesRead;
        while ((bytesRead = bais.read(buffer)) != -1) {
            encodedBytes = Arrays.copyOf(encodedBytes, encodedBytes.length + bytesRead);
            System.arraycopy(buffer, 0, encodedBytes, encodedBytes.length - bytesRead, bytesRead);
        }

        byte[] decodedFromGenerated = Base64.decodeBase64(encodedBytes);
        assertArrayEquals(originalBytes, decodedFromGenerated);
    }
    
    @Test
    public void testRead_DecodeZeroLengthBuffer() throws Exception {
        String encoded = "QQ=="; // A
        InputStream in = new ByteArrayInputStream(encoded.getBytes());
        Base64InputStream bais = new Base64InputStream(in, false);
        byte[] buffer = new byte[0];
        // Reading with a zero-length buffer should return 0.
        assertEquals(0, bais.read(buffer, 0, 0));
        // The stream should not be at EOF yet, so subsequent read should return data.
        assertEquals('A', bais.read());
        assertEquals(-1, bais.read()); // Now it should be EOF.
    }
    
    @Test
    public void testRead_EncodeZeroLengthBuffer() throws Exception {
        byte[] data = {0x41}; // A
        InputStream in = new ByteArrayInputStream(data);
        Base64InputStream bais = new Base64InputStream(in, true);
        byte[] buffer = new byte[0];
        // Reading with a zero-length buffer should return 0.
        assertEquals(0, bais.read(buffer, 0, 0));
        // The stream should not be at EOF yet, so subsequent read should return data.
        byte[] actual = new byte[6]; // Enough space for "QQ==\r\n"
        int bytesRead = bais.read(actual);
        assertEquals(6, bytesRead);
        assertArrayEquals("QQ==\r\n".getBytes(), Arrays.copyOf(actual, 6));
    }

    @Test
    public void testRead_DecodeWithInvalidInputThatDoesNotHappenImmediately() throws Exception {
        // Input that has valid base64 chars, then invalid ones, then valid again.
        // The implementation should handle this by skipping invalid chars.
        String encoded = "QQ==InvalidStuffWW=="; // A + garbage + WW
        InputStream in = new ByteArrayInputStream(encoded.getBytes());
        Base64InputStream bais = new Base64InputStream(in, false);
        
        assertEquals('A', bais.read()); // First char decoded from "QQ=="
        
        // "InvalidStuff" should be skipped.
        // "WW==" decodes to bytes corresponding to "WW".
        byte[] expected = "WW".getBytes();
        byte[] actual = new byte[2];
        int bytesRead = bais.read(actual);
        assertEquals(2, bytesRead);
        assertArrayEquals(expected, actual);
        
        assertEquals(-1, bais.read()); // EOF after processing "WW=="
    }
    
    @Test
    public void testRead_EncodeWithSmallLineLength() throws Exception {
        byte[] data = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08}; // 8 bytes
        InputStream in = new ByteArrayInputStream(data);
        // Line length 2, custom line separator '\n'.
        // 010203 -> AQID
        // 040506 -> BQUH
        // 0708   -> BIC=
        // The encoded string is "AQIDBQUHBIC=".
        // With lineLength=2, it should break after "AQ", "ID", "BQ", "UH", "BI", "C=".
        // This results in: AQ\nID\nBQ\nH\nBI\nC=\n
        Base64InputStream bais = new Base64InputStream(in, true, 2, new byte[]{'\n'}); 
        
        byte[] expected = "AQ\nID\nBQ\nH\nBI\nC=\n".getBytes();
        byte[] actual = new byte[expected.length];
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRead_ConstructorWithNegativeLineLength() throws Exception {
        byte[] data = {0x41}; // A
        InputStream in = new ByteArrayInputStream(data);
        // lineLength <= 0 means encoded data is not divided into lines.
        // So it should behave like lineLength = 0 or large value, resulting in "QQ==" followed by default CRLF.
        Base64InputStream bais = new Base64InputStream(in, true, -1, null); 
        byte[] expected = "QQ==\r\n".getBytes(); 
        byte[] actual = new byte[expected.length];
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRead_ReadIntoBufferShorterThanAvailable() throws Exception {
        String encoded = "SGVsbG8gV29ybGQ="; // Hello World
        InputStream in = new ByteArrayInputStream(encoded.getBytes());
        Base64InputStream bais = new Base64InputStream(in, false);
        byte[] expected = "Hello".getBytes();
        byte[] actual = new byte[5]; // Buffer for "Hello"
        int bytesRead = bais.read(actual);
        assertEquals(expected.length, bytesRead);
        assertArrayEquals(expected, actual);
        
        // Read the rest
        byte[] remainingExpected = " World".getBytes();
        byte[] remainingActual = new byte[6];
        bytesRead = bais.read(remainingActual);
        assertEquals(remainingExpected.length, bytesRead);
        assertArrayEquals(remainingExpected, remainingActual);
        assertEquals(-1, bais.read());
    }

    @Test
    public void testRead_NullPointerExceptionOnNullBuffer() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream bais = new Base64InputStream(in, false);
        try {
            bais.read(null, 0, 1);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // Expected
        }
    }

    @Test
    public void testRead_IndexOutOfBoundsExceptionOnNegativeOffset() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream bais = new Base64InputStream(in, false);
        byte[] buffer = new byte[10];
        try {
            bais.read(buffer, -1, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // Expected
        }
    }

    @Test
    public void testRead_IndexOutOfBoundsExceptionOnNegativeLength() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream bais = new Base64InputStream(in, false);
        byte[] buffer = new byte[10];
        try {
            bais.read(buffer, 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // Expected
        }
    }

    @Test
    public void testRead_IndexOutOfBoundsExceptionOnOffsetTooLarge() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream bais = new Base64InputStream(in, false);
        byte[] buffer = new byte[10];
        try {
            bais.read(buffer, 11, 1); // offset > buffer.length
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // Expected
        }
    }

    @Test
    public void testRead_IndexOutOfBoundsExceptionOnOffsetPlusLengthTooLarge() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream bais = new Base64InputStream(in, false);
        byte[] buffer = new byte[10];
        try {
            bais.read(buffer, 5, 6); // offset + len > buffer.length
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // Expected
        }
    }
}
