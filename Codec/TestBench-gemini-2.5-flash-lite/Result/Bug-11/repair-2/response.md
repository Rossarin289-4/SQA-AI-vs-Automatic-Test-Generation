```java
package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

public class QuotedPrintableCodecTest {
    @Test
    public void testEncodeNullByteArray() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode((byte[]) null));
    }

    @Test
    public void testDecodeNullByteArray() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.decode((byte[]) null));
    }

    @Test
    public void testEncodeNullString() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode((String) null));
    }

    @Test
    public void testDecodeNullString() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.decode((String) null));
    }

    @Test
    public void testEncodeNullObject() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode((Object) null));
    }

    @Test
    public void testDecodeNullObject() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.decode((Object) null));
    }

    @Test
    public void testEncodeHelloWorld() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "Hello World";
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        assertEquals("Hello=20World", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeHelloWorld() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "Hello=20World";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        assertEquals("Hello World", new String(decoded, CharEncoding.UTF_8));
    }

    @Test
    public void testEncodeWithSpaces() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "This is a test with spaces.";
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        assertEquals("This=20is=20a=20test=20with=20spaces.", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeWithSpaces() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "This=20is=20a=20test=20with=20spaces.";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        assertEquals("This is a test with spaces.", new String(decoded, CharEncoding.UTF_8));
    }

    @Test
    public void testEncodeWithEqualsSign() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "This string contains an = sign.";
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        assertEquals("This string contains an =3D sign.", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeWithEqualsSign() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "This string contains an =3D sign.";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        assertEquals("This string contains an = sign.", new String(decoded, CharEncoding.UTF_8));
    }

    @Test
    public void testEncodeCarriageReturnAndLineFeed() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "Line1\r\nLine2";
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        // RFC 1521 states CR and LF should be encoded as =0D and =0A
        assertEquals("Line1=0D=0ALine2", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeCarriageReturnAndLineFeed() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "Line1=0D=0ALine2";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        assertEquals("Line1\r\nLine2", new String(decoded, CharEncoding.UTF_8));
    }

    @Test
    public void testEncodeExtendedCharacters() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "This string has extended characters: é, ñ, ü";
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        // UTF-8 encoding: é -> C3 A9, ñ -> C3 B1, ü -> C3 BC
        assertEquals("This string has extended characters: =C3=A9, =C3=B1, =C3=BC", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeExtendedCharacters() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "This string has extended characters: =C3=A9, =C3=B1, =C3=BC";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        assertEquals("This string has extended characters: é, ñ, ü", new String(decoded, CharEncoding.UTF_8));
    }

    @Test
    public void testEncodeBinaryData() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] original = {0x01, 0x02, (byte) 0xFF};
        byte[] encoded = codec.encode(original);
        assertEquals("=01=02=FF", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeBinaryData() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] encoded = {(byte) '=', (byte) '0', (byte) '1', (byte) '=', (byte) '0', (byte) '2', (byte) '=', (byte) 'F', (byte) 'F'};
        byte[] decoded = codec.decode(encoded);
        byte[] expected = {0x01, 0x02, (byte) 0xFF};
        assertArrayEquals(expected, decoded);
    }
    
    @Test
    public void testEncodeEmptyString() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "";
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        assertEquals("", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeEmptyString() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        assertEquals("", new String(decoded, CharEncoding.UTF_8));
    }

    @Test
    public void testEncodeTabAndSpace() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "Tab\tSpace ";
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        assertEquals("Tab=09Space=20", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeTabAndSpace() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "Tab=09Space=20";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        assertEquals("Tab\tSpace ", new String(decoded, CharEncoding.UTF_8));
    }

    @Test
    public void testEncodeWithLineEndingSoft() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        StringBuilder sb = new StringBuilder();
        // Fill with characters that are not whitespace and not special characters
        for (int i = 0; i < QuotedPrintableCodec.SAFE_LENGTH + 5; i++) {
            sb.append("a");
        }
        String original = sb.toString();
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        
        // The reference code uses 'SAFE_LENGTH' for line length. This is a constant in QuotedPrintableCodec.
        // The actual soft line break in RFC 1521 is represented by =0D=0A.
        String expectedPrefix = sb.substring(0, QuotedPrintableCodec.SAFE_LENGTH);
        String expectedSuffix = sb.substring(QuotedPrintableCodec.SAFE_LENGTH, QuotedPrintableCodec.SAFE_LENGTH + 3); // check the break point and next few chars
        String expected = expectedPrefix + "=0D=0A" + expectedSuffix;
        
        assertTrue(StringUtils.newStringUsAscii(encoded).startsWith(expected));
    }
    
    @Test
    public void testDecodeWithLineEndingSoft() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < QuotedPrintableCodec.SAFE_LENGTH + 5; i++) {
            sb.append("a");
        }
        String original = sb.toString();
        byte[] encodedBytes = codec.encode(original.getBytes(CharEncoding.UTF_8));
        byte[] decoded = codec.decode(encodedBytes);
        assertEquals(original, new String(decoded, CharEncoding.UTF_8));
    }

    @Test
    public void testEncodeStringWithSpecificCharset() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("ISO-8859-1");
        String original = "Crème brûlée"; // 'è' and 'û' are in ISO-8859-1
        // The encode(String, String) method requires the string to be encoded and the charset.
        String encodedString = codec.encode(original, "ISO-8859-1");
        assertEquals("Cr=e8me=20br=fblee", encodedString);
    }
    
    @Test
    public void testDecodeStringWithSpecificCharset() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("ISO-8859-1");
        String encoded = "Cr=e8me=20br=fblee";
        String decoded = codec.decode(encoded, "ISO-8859-1");
        assertEquals("Crème brûlée", decoded);
    }

    @Test
    public void testEncodeDecodeObjectByteArray() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] original = {0x01, 0x02, 0x03, 0x04};
        Object encoded = codec.encode((Object) original);
        assertTrue(encoded instanceof byte[]);
        byte[] decoded = (byte[]) codec.decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeDecodeObjectString() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "test string";
        Object encoded = codec.encode((Object) original);
        assertTrue(encoded instanceof String);
        String decoded = (String) codec.decode(encoded);
        assertEquals(original, decoded);
    }

    @Test
    public void testEncodeUnsupportedObject() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Integer value = 123;
        try {
            codec.encode((Object) value);
            fail("Expected EncoderException for unsupported type");
        } catch (EncoderException e) {
            // expected
        }
    }

    @Test
    public void testDecodeUnsupportedObject() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Integer value = 123;
        try {
            codec.decode((Object) value);
            fail("Expected DecoderException for unsupported type");
        } catch (DecoderException e) {
            // expected
        }
    }

    @Test
    public void testDefaultCharsetIsUTF8() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals(CharEncoding.UTF_8, codec.getDefaultCharset());
    }

    @Test
    public void testConstructorWithCharset() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("ISO-8859-1");
        assertEquals("ISO-8859-1", codec.getDefaultCharset());
    }

    @Test
    public void testEncodeWithTrailingWhitespace() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "Trailing space ";
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        assertEquals("Trailing=20space=20", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeWithTrailingWhitespace() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "Trailing=20space=20";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        assertEquals("Trailing space ", new String(decoded, CharEncoding.UTF_8));
    }

    @Test
    public void testEncodeHexChars() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String original = "0123456789ABCDEF";
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        assertEquals("0123456789ABCDEF", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeHexChars() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "0123456789ABCDEF";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        assertEquals("0123456789ABCDEF", new String(decoded, CharEncoding.UTF_8));
    }
    
    @Test
    public void testEncodeDecodeBinaryWithEqualsSign() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] original = {'=', 'a', 'b'};
        byte[] encoded = codec.encode(original);
        assertEquals("=3Dab", StringUtils.newStringUsAscii(encoded));
        byte[] decoded = codec.decode(encoded);
        assertArrayEquals(original, decoded);
    }
    
    @Test
    public void testDecodeInvalidHexSequence() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "=XX";
        try {
            codec.decode(encoded.getBytes(CharEncoding.UTF_8));
            fail("Expected DecoderException for invalid hex sequence");
        } catch (DecoderException e) {
            // expected
        }
    }

    @Test
    public void testDecodeIncompleteHexSequence() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "=A";
        try {
            codec.decode(encoded.getBytes(CharEncoding.UTF_8));
            fail("Expected DecoderException for incomplete hex sequence");
        } catch (DecoderException e) {
            // expected
        }
    }
    
    @Test
    public void testDecodeSoftLineBreakOnly() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "=\r\n";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        assertEquals("", new String(decoded, CharEncoding.UTF_8));
    }
    
    @Test
    public void testEncodeWithNullByte() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] original = {0x00};
        byte[] encoded = codec.encode(original);
        assertEquals("=00", StringUtils.newStringUsAscii(encoded));
    }

    @Test
    public void testDecodeWithNullByte() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = "=00";
        byte[] decoded = codec.decode(encoded.getBytes(CharEncoding.UTF_8));
        byte[] expected = {0x00};
        assertArrayEquals(expected, decoded);
    }
}
```
1. SOURCE CODE ANALYSIS - The tests focus on encoding and decoding byte arrays and strings, handling various characters, including special ones like spaces, equals signs, carriage returns, line feeds, and extended ASCII characters. It also covers edge cases like null inputs, empty strings, and binary data. The `encodeQuotedPrintable` and `decodeQuotedPrintable` static methods are implicitly tested via the public methods.
2. TEST CASE DESIGN -
    - testEncodeNullByteArray: null input, expected null, derived from null check.
    - testDecodeNullByteArray: null input, expected null, derived from null check.
    - testEncodeNullString: null input, expected null, derived from null check.
    - testDecodeNullString: null input, expected null, derived from null check.
    - testEncodeNullObject: null input, expected null, derived from null check.
    - testDecodeNullObject: null input, expected null, derived from null check.
    - testEncodeHelloWorld: "Hello World", expected "Hello=20World", derived from manual encoding.
    - testDecodeHelloWorld: "Hello=20World", expected "Hello World", derived from manual decoding.
    - testEncodeWithSpaces: "This is a test with spaces.", expected "This=20is=20a=20test=20with=20spaces.", derived from manual encoding.
    - testDecodeWithSpaces: "This=20is=20a=20test=20with=20spaces.", expected "This is a test with spaces.", derived from manual decoding.
    - testEncodeWithEqualsSign: "This string contains an = sign.", expected "This string contains an =3D sign.", derived from manual encoding of '='.
    - testDecodeWithEqualsSign: "This string contains an =3D sign.", expected "This string contains an = sign.", derived from manual decoding of '=3D'.
    - testEncodeCarriageReturnAndLineFeed: "Line1\r\nLine2", expected "Line1=0D=0ALine2", derived from manual encoding of CR and LF.
    - testDecodeCarriageReturnAndLineFeed: "Line1=0D=0ALine2", expected "Line1\r\nLine2", derived from manual decoding of '=0D=0A'.
    - testEncodeExtendedCharacters: "This string has extended characters: é, ñ, ü", expected "This string has extended characters: =C3=A9, =C3=B1, =C3=BC", derived from UTF-8 encoding and manual encoding of non-ASCII chars.
    - testDecodeExtendedCharacters: "This string has extended characters: =C3=A9, =C3=B1, =C3=BC", expected "This string has extended characters: é, ñ, ü", derived from manual decoding of UTF-8 encoded chars.
    - testEncodeBinaryData: {0x01, 0x02, (byte) 0xFF}, expected "=01=02=FF", derived from manual encoding of non-printable bytes.
    - testDecodeBinaryData: encoded {=01, =02, =FF}, expected {0x01, 0x02, (byte) 0xFF}, derived from manual decoding.
    - testEncodeEmptyString: "", expected "", derived from encoding empty string.
    - testDecodeEmptyString: "", expected "", derived from decoding empty string.
    - testEncodeTabAndSpace: "Tab\tSpace ", expected "Tab=09Space=20", derived from manual encoding of TAB and SPACE.
    - testDecodeTabAndSpace: "Tab=09Space=20", expected "Tab\tSpace ", derived from manual decoding of '=09' and '=20'.
    - testEncodeWithLineEndingSoft: String of 78 'a's, expected "aaa...aaa=0D=0Aaaa...", derived from checking RFC 1521 soft line break rule around SAFE_LENGTH.
    - testDecodeWithLineEndingSoft: encoded string with soft line breaks, expected original string, derived from decoding.
    - testEncodeStringWithSpecificCharset: "Crème brûlée" with ISO-8859-1, expected "Cr=e8me=20br=fblee", derived from manual encoding with specific charset.
    - testDecodeStringWithSpecificCharset: "Cr=e8me=20br=fblee" with ISO-8859-1, expected "Crème brûlée", derived from manual decoding with specific charset.
    - testEncodeDecodeObjectByteArray: byte array, expected encoded byte array, then decoded back to original, derived from encode/decode object contract.
    - testEncodeDecodeObjectString: string, expected encoded string, then decoded back to original, derived from encode/decode object contract.
    - testEncodeUnsupportedObject: Integer object, expected EncoderException, derived from type check in encode(Object).
    - testDecodeUnsupportedObject: Integer object, expected DecoderException, derived from type check in decode(Object).
    - testDefaultCharsetIsUTF8: default constructor, expected "UTF-8", derived from default constructor logic.
    - testConstructorWithCharset: constructor with "ISO-8859-1", expected "ISO-8859-1", derived from constructor logic.
    - testEncodeWithTrailingWhitespace: "Trailing space ", expected "Trailing=20space=20", derived from manual encoding.
    - testDecodeWithTrailingWhitespace: "Trailing=20space=20", expected "Trailing space ", derived from manual decoding.
    - testEncodeHexChars: "0123456789ABCDEF", expected "0123456789ABCDEF", derived from encoding printable hex chars.
    - testDecodeHexChars: "0123456789ABCDEF", expected "0123456789ABCDEF", derived from decoding printable hex chars.
    - testEncodeDecodeBinaryWithEqualsSign: {=, a, b}, expected "=3Dab", then decoded back to original, derived from manual encoding/decoding of '='.
    - testDecodeInvalidHexSequence: "=XX", expected DecoderException, derived from invalid hex sequence handling.
    - testDecodeIncompleteHexSequence: "=A", expected DecoderException, derived from incomplete hex sequence handling.
    - testDecodeSoftLineBreakOnly: "=\r\n", expected "", derived from specific soft line break decoding rule.
    - testEncodeWithNullByte: {0x00}, expected "=00", derived from manual encoding of null byte.
    - testDecodeWithNullByte: "=00", expected {0x00}, derived from manual decoding of '=00'.
4. DEFECT DETECTION STRATEGY - The tests cover various encoding and decoding scenarios, including edge cases, special characters, and line breaks, aiming to expose deviations from the RFC 1521 specification in handling these situations.
5. SUMMARY - 36 tests.
6. LIMITATIONS - The tests assume the `CharEncoding.UTF_8` and `CharEncoding.ISO_8859_1` constants are correctly defined and used by `StringUtils`. The `SAFE_LENGTH` constant is accessed directly, assuming it's accessible or that the logic around it is tested correctly. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.