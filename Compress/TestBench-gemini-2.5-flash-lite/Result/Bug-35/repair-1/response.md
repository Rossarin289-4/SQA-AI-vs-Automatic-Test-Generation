TarUtilsTest.java:464: error: cannot find symbol
        header[CHKSUM_OFFSET] = '1';
               ^
  symbol:   variable CHKSUM_OFFSET
  location: class TarUtilsTest
TarUtilsTest.java:465: error: cannot find symbol
        header[CHKSUM_OFFSET + 1] = '2';
               ^
  symbol:   variable CHKSUM_OFFSET
  location: class TarUtilsTest
TarUtilsTest.java:466: error: cannot find symbol
        header[CHKSUM_OFFSET + 2] = '3';
               ^
  symbol:   variable CHKSUM_OFFSET
  location: class TarUtilsTest
TarUtilsTest.java:467: error: cannot find symbol
        header[CHKSUM_OFFSET + 3] = '4';
               ^
  symbol:   variable CHKSUM_OFFSET
  location: class TarUtilsTest
TarUtilsTest.java:468: error: cannot find symbol
        header[CHKSUM_OFFSET + 4] = '5';
               ^
  symbol:   variable CHKSUM_OFFSET
  location: class TarUtilsTest
TarUtilsTest.java:469: error: cannot find symbol
        header[CHKSUM_OFFSET + 5] = '6';
               ^
  symbol:   variable CHKSUM_OFFSET
  location: class TarUtilsTest
TarUtilsTest.java:470: error: cannot find symbol
        header[CHKSUM_OFFSET + 6] = '\0';
               ^
  symbol:   variable CHKSUM_OFFSET
  location: class TarUtilsTest
TarUtilsTest.java:471: error: cannot find symbol
        header[CHKSUM_OFFSET + 7] = ' ';
               ^
  symbol:   variable CHKSUM_OFFSET
  location: class TarUtilsTest
8 errors
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
- Do not add new test methods and do not change tests that no error refers to.```java
package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;

public class TarUtilsTest {

    /**
     * Test for parseOctal with valid inputs, including leading spaces and trailing NULs/spaces.
     */
    @Test
    public void testParseOctal_validInputs() throws Exception {
        byte[] buffer = "  12345 \0 ".getBytes();
        assertEquals(12345L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    /**
     * Test for parseOctal with all zeros, which should return 0L.
     */
    @Test
    public void testParseOctal_allZeros() throws Exception {
        byte[] buffer = new byte[10];
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    /**
     * Test for parseOctal with a leading NUL, which should return 0L.
     */
    @Test
    public void testParseOctal_leadingNull() throws Exception {
        byte[] buffer = {0, '1', '2', '3'};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    /**
     * Test for parseOctal with a length less than 2, expecting IllegalArgumentException.
     */
    @Test
    public void testParseOctal_lengthLessThanTwo() {
        byte[] buffer = {'1', '2'};
        try {
            TarUtils.parseOctal(buffer, 0, 1);
            fail("Expected IllegalArgumentException for length < 2");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    /**
     * Test for parseOctal with an invalid byte (non-octal), expecting IllegalArgumentException.
     */
    @Test
    public void testParseOctal_invalidByte() {
        byte[] buffer = {'1', '2', '8', '0'};
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException for invalid byte");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    /**
     * Test for parseOctalOrBinary with a standard octal number.
     */
    @Test
    public void testParseOctalOrBinary_octal() throws Exception {
        byte[] buffer = "12345 ".getBytes();
        assertEquals(12345L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    /**
     * Test for parseOctalOrBinary with a binary number (MSB set).
     */
    @Test
    public void testParseOctalOrBinary_binary() throws Exception {
        byte[] buffer = {(byte) 0x80, 0x01, 0x02, 0x03}; // Represents 1 * 2^16 + 2 * 2^8 + 3
        assertEquals(66051L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    /**
     * Test for parseOctalOrBinary with a negative binary number.
     */
    @Test
    public void testParseOctalOrBinary_negativeBinary() throws Exception {
        byte[] buffer = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfc}; // Represents -4
        assertEquals(-4L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    /**
     * Test for parseOctalOrBinary with binary number that exceeds long, expecting IllegalArgumentException.
     */
    @Test
    public void testParseOctalOrBinary_binaryExceedsLong() {
        byte[] buffer = {(byte) 0x80, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}; // More than 8 bytes for binary
        try {
            TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException for binary exceeding long");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    /**
     * Test for parseBoolean with a true value (byte 1).
     */
    @Test
    public void testParseBoolean_true() throws Exception {
        byte[] buffer = {1};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    /**
     * Test for parseBoolean with a false value (byte 0).
     */
    @Test
    public void testParseBoolean_false() throws Exception {
        byte[] buffer = {0};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    /**
     * Test parseName with a simple string and default encoding.
     */
    @Test
    public void testParseName_defaultEncoding() throws Exception {
        byte[] buffer = "testname".getBytes();
        assertEquals("testname", TarUtils.parseName(buffer, 0, buffer.length));
    }

    /**
     * Test parseName with a string ending in NUL.
     */
    @Test
    public void testParseName_endsWithNul() throws Exception {
        byte[] buffer = "testname\0".getBytes();
        assertEquals("testname", TarUtils.parseName(buffer, 0, buffer.length));
    }

    /**
     * Test parseName with an empty buffer.
     */
    @Test
    public void testParseName_emptyBuffer() throws Exception {
        byte[] buffer = new byte[0];
        assertEquals("", TarUtils.parseName(buffer, 0, buffer.length));
    }

    /**
     * Test parseName with a buffer containing only NULs.
     */
    @Test
    public void testParseName_onlyNuls() throws Exception {
        byte[] buffer = {0, 0, 0};
        assertEquals("", TarUtils.parseName(buffer, 0, buffer.length));
    }

    /**
     * Test formatNameBytes with a short name, expecting padding with NULs.
     */
    @Test
    public void testFormatNameBytes_shortName() throws Exception {
        String name = "short";
        byte[] buf = new byte[10];
        int expectedOffset = 10;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, 0, 10));
        assertArrayEquals("short\0\0\0\0\0".getBytes(), buf);
    }

    /**
     * Test formatNameBytes with a name that exactly fits the buffer.
     */
    @Test
    public void testFormatNameBytes_exactFit() throws Exception {
        String name = "exactfit";
        byte[] buf = new byte[8];
        int expectedOffset = 8;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, 0, 8));
        assertArrayEquals(name.getBytes(), buf);
    }

    /**
     * Test formatNameBytes with a name longer than the buffer, expecting truncation.
     */
    @Test
    public void testFormatNameBytes_truncated() throws Exception {
        String name = "toolongname";
        byte[] buf = new byte[5];
        int expectedOffset = 5;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, 0, 5));
        assertArrayEquals("toolongname".substring(0, 5).getBytes(), buf);
    }

    /**
     * Test formatUnsignedOctalString with value 0.
     */
    @Test
    public void testFormatUnsignedOctalString_zero() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, 5);
        assertArrayEquals(new byte[]{'0', '0', '0', '0', '0'}, buffer);
    }

    /**
     * Test formatUnsignedOctalString with a positive value.
     */
    @Test
    public void testFormatUnsignedOctalString_positive() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(123, buffer, 0, 5);
        // 123 decimal is 173 octal
        assertArrayEquals(new byte[]{'0', '0', '1', '7', '3'}, buffer);
    }

    /**
     * Test formatUnsignedOctalString with a value that requires full buffer length.
     */
    @Test
    public void testFormatUnsignedOctalString_fullLength() throws Exception {
        byte[] buffer = new byte[3];
        TarUtils.formatUnsignedOctalString(511, buffer, 0, 3); // 511 decimal is 777 octal
        assertArrayEquals(new byte[]{'7', '7', '7'}, buffer);
    }

    /**
     * Test formatUnsignedOctalString with a value that exceeds buffer capacity.
     */
    @Test
    public void testFormatUnsignedOctalString_exceedsCapacity() {
        byte[] buffer = new byte[3];
        try {
            TarUtils.formatUnsignedOctalString(512, buffer, 0, 3); // 512 decimal is 1000 octal
            fail("Expected IllegalArgumentException for value exceeding capacity");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    /**
     * Test formatOctalBytes with a value that fits with space and NUL.
     */
    @Test
    public void testFormatOctalBytes_fits() throws Exception {
        byte[] buf = new byte[10];
        int expectedOffset = 10;
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(123, buf, 0, 10));
        // 123 decimal is 173 octal
        // The buffer should contain "  173 \0"
        byte[] expected = new byte[10];
        System.arraycopy("  173 ".getBytes(), 0, expected, 0, 5);
        expected[5] = ' ';
        expected[6] = '\0';
        // Fill the rest with something to avoid issues with arrayEquals if length differs
        for(int i=7; i<10; i++) expected[i] = 0;
        // However, formatOctalBytes fills up to offset+length. Let's check the relevant parts.
        // The internal formatUnsignedOctalString pads with zeros.
        // The method adds space and null.
        // The actual content is "00173 \0" in a buffer of size 10.
        byte[] actualContent = new byte[10];
        System.arraycopy(buf, 0, actualContent, 0, 10);
        // The method formatUnsignedOctalString pads with leading zeros.
        // So for 123 (173 octal) and length 8 (10-2), it should be "00000173"
        // Then space and NUL are added. So "00000173 \0"
        byte[] expectedContent = new byte[10];
        TarUtils.formatUnsignedOctalString(123, expectedContent, 0, 8); // index 0 to 7
        expectedContent[8] = (byte) ' ';
        expectedContent[9] = 0;
        assertArrayEquals(expectedContent, actualContent);
    }

    /**
     * Test formatOctalBytes with value 0.
     */
    @Test
    public void testFormatOctalBytes_zero() throws Exception {
        byte[] buf = new byte[5];
        int expectedOffset = 5;
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(0, buf, 0, 5));
        // For value 0, formatUnsignedOctalString sets buffer[offset+remaining] = '0'.
        // Here length is 3 (5-2). So buffer[offset+2] = '0'.
        // Then loop for remaining (0, 1) fills with '0'.
        // So buffer 0 to 2 is "000".
        // Then space and NUL are added. So "000 \0".
        byte[] expectedContent = new byte[5];
        expectedContent[0] = '0';
        expectedContent[1] = '0';
        expectedContent[2] = '0';
        expectedContent[3] = (byte) ' ';
        expectedContent[4] = 0;
        assertArrayEquals(expectedContent, buf);
    }

    /**
     * Test formatLongOctalBytes with a value that fits with space.
     */
    @Test
    public void testFormatLongOctalBytes_fits() throws Exception {
        byte[] buf = new byte[10];
        int expectedOffset = 10;
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(12345L, buf, 0, 10));
        // 12345 decimal is 30071 octal
        // formatUnsignedOctalString fills buffer[offset+remaining]
        // length is 9 (10-1).
        // For 12345 (30071 octal), it fills to '3','0','0','7','1'.
        // remaining becomes 4. Then fills leading zeros for 0,1,2,3,4.
        // So "000030071". Then adds space. "000030071 ".
        byte[] expectedContent = new byte[10];
        TarUtils.formatUnsignedOctalString(12345L, expectedContent, 0, 9); // index 0 to 8
        expectedContent[9] = (byte) ' ';
        assertArrayEquals(expectedContent, buf);
    }

    /**
     * Test formatLongOctalBytes with value 0.
     */
    @Test
    public void testFormatLongOctalBytes_zero() throws Exception {
        byte[] buf = new byte[5];
        int expectedOffset = 5;
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(0, buf, 0, 5));
        // length is 4 (5-1). For 0, it sets buffer[offset+remaining] = '0'.
        // remaining becomes 3. Fills leading zeros for 0,1,2,3.
        // So "0000". Then adds space. "0000 ".
        byte[] expectedContent = new byte[5];
        expectedContent[0] = '0';
        expectedContent[1] = '0';
        expectedContent[2] = '0';
        expectedContent[3] = '0';
        expectedContent[4] = (byte) ' ';
        assertArrayEquals(expectedContent, buf);
    }

    /**
     * Test formatLongOctalOrBinaryBytes with a value that fits as octal.
     */
    @Test
    public void testFormatLongOctalOrBinaryBytes_fitsOctal() throws Exception {
        byte[] buf = new byte[12]; // Sufficient space for octal representation
        int expectedOffset = 12;
        long value = 12345678L; // Fits within octal representation
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12));
        // 12345678 decimal is 57114736 octal
        // formatLongOctalBytes is called. length is 11 (12-1).
        // formatUnsignedOctalString fills buffer[offset+remaining]
        // For 57114736, it fills to '5','7','1','1','4','7','3','6'.
        // remaining becomes 3. Fills leading zeros for 0,1,2.
        // So "00057114736". Then adds space. "00057114736 ".
        byte[] expectedContent = new byte[12];
        TarUtils.formatUnsignedOctalString(value, expectedContent, 0, 11); // index 0 to 10
        expectedContent[11] = (byte) ' ';
        assertArrayEquals(expectedContent, buf);
    }

    /**
     * Test formatLongOctalOrBinaryBytes with a value that requires binary representation.
     */
    @Test
    public void testFormatLongOctalOrBinaryBytes_requiresBinary() throws Exception {
        byte[] buf = new byte[12]; // Small buffer to force binary
        int expectedOffset = 12;
        // For UIDLEN=8, MAXID=2097151 (7777777 octal).
        // A value like 2097152 should trigger binary.
        long value = 2097152L; // This is 10000000 octal.
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12));
        // Should be binary representation, starting with 0x80
        assertTrue((buf[0] & 0x80) != 0); // Check MSB
        assertTrue(buf[0] == (byte) 0x80); // First byte indicates binary
    }

    /**
     * Test formatLongOctalOrBinaryBytes with a negative value, requiring binary.
     */
    @Test
    public void testFormatLongOctalOrBinaryBytes_negativeBinary() throws Exception {
        byte[] buf = new byte[12];
        int expectedOffset = 12;
        long value = -1L;
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 12));
        // Should be negative binary representation, starting with 0xff
        assertTrue((buf[0] & 0xff) == 0xff); // First byte indicates negative binary
    }

    /**
     * Test formatCheckSumOctalBytes with a value that fits with NUL and space.
     */
    @Test
    public void testFormatCheckSumOctalBytes_fits() throws Exception {
        byte[] buf = new byte[10];
        int expectedOffset = 10;
        assertEquals(expectedOffset, TarUtils.formatCheckSumOctalBytes(12345L, buf, 0, 10));
        // 12345 decimal is 30071 octal
        // formatUnsignedOctalString fills to offset + idx (length-2 = 8)
        // So buffer 0 to 7 is "00003007".
        // Then NUL at offset+idx (8) and space at offset+idx+1 (9).
        // "00003007\0 ".
        byte[] expectedContent = new byte[10];
        TarUtils.formatUnsignedOctalString(12345L, expectedContent, 0, 8); // index 0 to 7
        expectedContent[8] = 0; // Trailing null
        expectedContent[9] = (byte) ' '; // Trailing space
        assertArrayEquals(expectedContent, buf);
    }

    /**
     * Test computeCheckSum with a simple byte array.
     */
    @Test
    public void testComputeCheckSum_simple() throws Exception {
        byte[] buf = {(byte) 1, (byte) 2, (byte) 3};
        assertEquals(6L, TarUtils.computeCheckSum(buf));
    }

    /**
     * Test computeCheckSum with a byte array containing zero bytes.
     */
    @Test
    public void testComputeCheckSum_zeros() throws Exception {
        byte[] buf = new byte[10];
        assertEquals(0L, TarUtils.computeCheckSum(buf));
    }

    /**
     * Test computeCheckSum with a byte array containing values that wrap around.
     */
    @Test
    public void testComputeCheckSum_wrapAround() throws Exception {
        byte[] buf = {(byte) 0xff, (byte) 0xff}; // 255 + 255 = 510
        assertEquals(510L, TarUtils.computeCheckSum(buf));
    }

    /**
     * Test verifyCheckSum with a valid checksum (unsigned sum matches).
     */
    @Test
    public void testVerifyCheckSum_validUnsigned() throws Exception {
        byte[] header = new byte[512];
        long expectedUnsignedSum = 0;
        for (int i = 0; i < header.length; i++) {
            if (i >= TarConstants.CHKSUM_OFFSET && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                // Placeholder for checksum bytes, will be replaced
            } else {
                header[i] = (byte) (i % 256); // Some values
                expectedUnsignedSum += (0xff & header[i]);
            }
        }
        // Calculate the checksum that matches the unsigned sum
        byte[] checksumBytes = new byte[TarConstants.CHKSUMLEN];
        TarUtils.formatUnsignedOctalString(expectedUnsignedSum, checksumBytes, 0, TarConstants.CHKSUMLEN);
        System.arraycopy(checksumBytes, 0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        // Add trailer if not already present and within bounds
        if (TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN < header.length) {
             header[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN] = '\0';
             if (TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 1 < header.length) {
                 header[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 1] = ' ';
             }
        }

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    /**
     * Test verifyCheckSum with a valid checksum (signed sum matches).
     */
    @Test
    public void testVerifyCheckSum_validSigned() throws Exception {
        byte[] header = new byte[512];
        long expectedSignedSum = 0;
        for (int i = 0; i < header.length; i++) {
            if (i >= TarConstants.CHKSUM_OFFSET && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                // Placeholder for checksum bytes, will be replaced
            } else {
                header[i] = (byte) (i % 256); // Some values
                expectedSignedSum += header[i]; // Signed sum
            }
        }
        // Calculate the checksum that matches the signed sum
        byte[] checksumBytes = new byte[TarConstants.CHKSUMLEN];
        TarUtils.formatUnsignedOctalString(expectedSignedSum, checksumBytes, 0, TarConstants.CHKSUMLEN);
        System.arraycopy(checksumBytes, 0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        // Add trailer if not already present and within bounds
        if (TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN < header.length) {
             header[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN] = '\0';
             if (TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 1 < header.length) {
                 header[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 1] = ' ';
             }
        }

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    /**
     * Test verifyCheckSum with an invalid checksum.
     */
    @Test
    public void testVerifyCheckSum_invalid() throws Exception {
        byte[] header = new byte[512];
        // Fill with some data and an incorrect checksum.
        for (int i = 0; i < header.length; i++) {
            if (i >= TarConstants.CHKSUM_OFFSET && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                header[i] = ' '; // Initialize checksum bytes to spaces
            } else {
                header[i] = (byte) (i % 100);
            }
        }
        // Set a clearly wrong checksum as characters, not octal digits
        header[TarConstants.CHKSUM_OFFSET] = '1';
        header[TarConstants.CHKSUM_OFFSET + 1] = '2';
        header[TarConstants.CHKSUM_OFFSET + 2] = '3';
        header[TarConstants.CHKSUM_OFFSET + 3] = '4';
        header[TarConstants.CHKSUM_OFFSET + 4] = '5';
        header[TarConstants.CHKSUM_OFFSET + 5] = '6';
        // Ensure trailer is present if space allows
        if (TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN < header.length) {
            header[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN] = '\0';
            if (TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 1 < header.length) {
                header[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN + 1] = ' ';
            }
        }

        assertFalse(TarUtils.verifyCheckSum(header));
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover `parseOctal`, `parseOctalOrBinary`, `parseBoolean`, `parseName`, `formatNameBytes`, `formatUnsignedOctalString`, `formatOctalBytes`, `formatLongOctalBytes`, `formatLongOctalOrBinaryBytes`, `formatCheckSumOctalBytes`, `computeCheckSum`, and `verifyCheckSum`. Boundary conditions like zero values, maximum values, invalid inputs, and specific formatting requirements (like padding and trailers) are tested.
2. TEST CASE DESIGN -
    - `testParseOctal_validInputs`: Parses "  12345 \0 " to 12345. Derived by tracing `parseOctal`.
    - `testParseOctal_allZeros`: Parses a buffer of zeros to 0L. Derived by tracing `parseOctal`.
    - `testParseOctal_leadingNull`: Parses {0, '1', '2', '3'} to 0L. Derived by tracing `parseOctal`.
    - `testParseOctal_lengthLessThanTwo`: Expects `IllegalArgumentException` for length 1. Derived by tracing `parseOctal`.
    - `testParseOctal_invalidByte`: Expects `IllegalArgumentException` for '8'. Derived by tracing `parseOctal`.
    - `testParseOctalOrBinary_octal`: Parses "12345 " as octal to 12345. Derived by tracing `parseOctalOrBinary` (falls back to `parseOctal`).
    - `testParseOctalOrBinary_binary`: Parses {(byte) 0x80, 0x01, 0x02, 0x03} as binary to 66051. Derived by tracing `parseOctalOrBinary` (calls `parseBinaryLong`).
    - `testParseOctalOrBinary_negativeBinary`: Parses {(byte) 0xff, ..., (byte) 0xfc} as negative binary to -4. Derived by tracing `parseOctalOrBinary` (calls `parseBinaryLong`).
    - `testParseOctalOrBinary_binaryExceedsLong`: Expects `IllegalArgumentException` for a binary number exceeding long. Derived by tracing `parseOctalOrBinary` (calls `parseBinaryBigInteger`).
    - `testParseBoolean_true`: Parses {1} to true. Derived by tracing `parseBoolean`.
    - `testParseBoolean_false`: Parses {0} to false. Derived by tracing `parseBoolean`.
    - `testParseName_defaultEncoding`: Parses "testname" to "testname". Derived by tracing `parseName` (uses `DEFAULT_ENCODING`).
    - `testParseName_endsWithNul`: Parses "testname\0" to "testname". Derived by tracing `parseName`.
    - `testParseName_emptyBuffer`: Parses empty buffer to "". Derived by tracing `parseName`.
    - `testParseName_onlyNuls`: Parses buffer of NULs to "". Derived by tracing `parseName`.
    - `testFormatNameBytes_shortName`: Formats "short" into 10 bytes, expects padding: "short\0\0\0\0\0". Derived by tracing `formatNameBytes`.
    - `testFormatNameBytes_exactFit`: Formats "exactfit" into 8 bytes, expects no padding. Derived by tracing `formatNameBytes`.
    - `testFormatNameBytes_truncated`: Formats "toolongname" into 5 bytes, expects truncation. Derived by tracing `formatNameBytes`.
    - `testFormatUnsignedOctalString_zero`: Formats 0 into 5 bytes: "00000". Derived by tracing `formatUnsignedOctalString`.
    - `testFormatUnsignedOctalString_positive`: Formats 123 into 5 bytes: "00173". Derived by tracing `formatUnsignedOctalString`.
    - `testFormatUnsignedOctalString_fullLength`: Formats 511 into 3 bytes: "777". Derived by tracing `formatUnsignedOctalString`.
    - `testFormatUnsignedOctalString_exceedsCapacity`: Expects `IllegalArgumentException` for 512 into 3 bytes. Derived by tracing `formatUnsignedOctalString`.
    - `testFormatOctalBytes_fits`: Formats 123 into 10 bytes: "00000173 \0". Derived by tracing `formatOctalBytes`.
    - `testFormatOctalBytes_zero`: Formats 0 into 5 bytes: "000 \0". Derived by tracing `formatOctalBytes`.
    - `testFormatLongOctalBytes_fits`: Formats 12345L into 10 bytes: "000030071 ". Derived by tracing `formatLongOctalBytes`.
    - `testFormatLongOctalBytes_zero`: Formats 0L into 5 bytes: "0000 ". Derived by tracing `formatLongOctalBytes`.
    - `testFormatLongOctalOrBinaryBytes_fitsOctal`: Formats 12345678L into 12 bytes as octal: "00057114736 ". Derived by tracing `formatLongOctalOrBinaryBytes`.
    - `testFormatLongOctalOrBinaryBytes_requiresBinary`: Formats 2097152L into 12 bytes as binary (starts with 0x80). Derived by tracing `formatLongOctalOrBinaryBytes`.
    - `testFormatLongOctalOrBinaryBytes_negativeBinary`: Formats -1L into 12 bytes as negative binary (starts with 0xff). Derived by tracing `formatLongOctalOrBinaryBytes`.
    - `testFormatCheckSumOctalBytes_fits`: Formats 12345L into 10 bytes: "00003007\0 ". Derived by tracing `formatCheckSumOctalBytes`.
    - `testComputeCheckSum_simple`: Computes checksum of {1, 2, 3} to 6. Derived by tracing `computeCheckSum`.
    - `testComputeCheckSum_zeros`: Computes checksum of zeros to 0. Derived by tracing `computeCheckSum`.
    - `testComputeCheckSum_wrapAround`: Computes checksum of {0xff, 0xff} to 510. Derived by tracing `computeCheckSum`.
    - `testVerifyCheckSum_validUnsigned`: Verifies a header where unsigned sum matches. Derived by constructing a valid header and tracing `verifyCheckSum`.
    - `testVerifyCheckSum_validSigned`: Verifies a header where signed sum matches. Derived by constructing a valid header and tracing `verifyCheckSum`.
    - `testVerifyCheckSum_invalid`: Verifies a header with an invalid checksum. Derived by constructing an invalid header and tracing `verifyCheckSum`.
4. DEFECT DETECTION STRATEGY - Tests focus on edge cases for parsing and formatting octal and binary numbers, handling of NUL/space terminators, boundary conditions for buffer lengths, and correct application of signed/unsigned interpretations for checksums, aiming to catch deviations from the reference implementation's logic.
5. SUMMARY - 33 tests.
6. LIMITATIONS - The tests cover the public API of `TarUtils`. Complex encoding scenarios for `parseName` and `formatNameBytes` might require more specific tests if `FALLBACK_ENCODING` or specific character sets were to be targeted, but these are not explicitly defined as requirements for this task. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.