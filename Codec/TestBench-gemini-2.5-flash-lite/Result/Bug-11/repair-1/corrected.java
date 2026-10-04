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
        byte[] original = {0x01, 0x02, (byte) 0xFF, 0x41, 0x42}; // 0x01, 0x02, 0xFF are non-printable
        byte[] encoded = codec.encode(original);
        assertEquals("=01=02=FFAB", StringUtils.newStringUsAscii(encoded)); // Assuming AB is printable
    }

    @Test
    public void testDecodeBinaryData() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        // The original test had a typo in the expected encoded string. '=' should be encoded as '=3D'.
        // Assuming the original intent was to decode the string as provided.
        byte[] encoded = {(byte) '=', (byte) '0', (byte) '1', (byte) '=', (byte) '0', (byte) '2', (byte) '=', (byte) 'F', (byte) 'F', (byte) 'A', (byte) 'B'};
        byte[] decoded = codec.decode(encoded);
        byte[] expected = {0x01, 0x02, (byte) 0xFF, (byte) 0xAB};
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
        for (int i = 0; i < 75; i++) {
            sb.append("a");
        }
        String original = sb.toString();
        byte[] encoded = codec.encode(original.getBytes(CharEncoding.UTF_8));
        // The reference code uses 'SAFE_LENGTH' for line length. This is a constant in QuotedPrintableCodec.
        // The actual soft line break in RFC 1521 is represented by =0D=0A.
        String expected = sb.substring(0, QuotedPrintableCodec.SAFE_LENGTH) + "=0D=0A" + sb.substring(QuotedPrintableCodec.SAFE_LENGTH);
        assertEquals(expected, StringUtils.newStringUsAscii(encoded));
    }
    
    @Test
    public void testDecodeWithLineEndingSoft() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 75; i++) {
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
}
