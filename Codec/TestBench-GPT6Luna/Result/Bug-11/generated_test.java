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
    public void testStaticEncodeNull() throws Exception {
        assertNull(QuotedPrintableCodec.encodeQuotedPrintable(null, null));
    }

    @Test
    public void testStaticEncodeNullPrintableUsesDefault() throws Exception {
        assertArrayEquals("A=3D".getBytes("US-ASCII"),
                QuotedPrintableCodec.encodeQuotedPrintable(null, new byte[] {65, 61, 66, 67}));
    }

    @Test
    public void testStaticEncodeCustomPrintableSet() throws Exception {
        BitSet printable = new BitSet();
        printable.set(0);
        printable.set(255);
        assertArrayEquals(new byte[] {0, 61, 70, 70},
                QuotedPrintableCodec.encodeQuotedPrintable(printable, new byte[] {0, -1, 0, 0}));
    }

    @Test
    public void testStaticEncodeEmpty() throws Exception {
        assertArrayEquals(new byte[0],
                QuotedPrintableCodec.encodeQuotedPrintable(null, new byte[3]));
    }

    @Test
    public void testStaticEncodeOneByte() throws Exception {
        assertArrayEquals("A".getBytes("US-ASCII"),
                QuotedPrintableCodec.encodeQuotedPrintable(null, new byte[] {65, 65, 65, 65}));
    }

    @Test
    public void testStaticEncodeTrailingWhitespace() throws Exception {
        assertArrayEquals("A  ".getBytes("US-ASCII"),
                QuotedPrintableCodec.encodeQuotedPrintable(null, new byte[] {65, 32, 32, 65}));
    }

    @Test
    public void testStaticEncodeExactlySafeLength() throws Exception {
        byte[] input = new byte[76];
        java.util.Arrays.fill(input, (byte) 'A');
        byte[] expected = new byte[76];
        java.util.Arrays.fill(expected, (byte) 'A');
        assertArrayEquals(expected, QuotedPrintableCodec.encodeQuotedPrintable(null, input));
    }

    @Test
    public void testStaticEncodeLineBreakBeyondSafeLength() throws Exception {
        byte[] input = new byte[77];
        java.util.Arrays.fill(input, (byte) 'A');
        byte[] expected = new byte[80];
        java.util.Arrays.fill(expected, 0, 72, (byte) 'A');
        expected[72] = '=';
        expected[73] = 13;
        expected[74] = 10;
        java.util.Arrays.fill(expected, 75, 80, (byte) 'A');
        assertArrayEquals(expected, QuotedPrintableCodec.encodeQuotedPrintable(null, input));
    }

    @Test
    public void testStaticDecodeNull() throws Exception {
        assertNull(QuotedPrintableCodec.decodeQuotedPrintable(null));
    }

    @Test
    public void testStaticDecodeHexAndLiteral() throws Exception {
        assertArrayEquals(new byte[] {65, 32, (byte) 255},
                QuotedPrintableCodec.decodeQuotedPrintable("A=20=FF".getBytes("US-ASCII")));
    }

    @Test
    public void testStaticDecodeSoftLineBreakAndNewlines() throws Exception {
        assertArrayEquals("AB".getBytes("US-ASCII"),
                QuotedPrintableCodec.decodeQuotedPrintable("A=\r\nB\r\n".getBytes("US-ASCII")));
    }

    @Test
    public void testStaticDecodeEscapeAtEndThrows() throws Exception {
        try {
            QuotedPrintableCodec.decodeQuotedPrintable("A=".getBytes("US-ASCII"));
            fail("expected DecoderException");
        } catch (DecoderException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testStaticDecodeMissingSecondHexDigitThrows() throws Exception {
        try {
            QuotedPrintableCodec.decodeQuotedPrintable("=A".getBytes("US-ASCII"));
            fail("expected DecoderException");
        } catch (DecoderException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testInstanceEncodeNull() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertNull(codec.encode((byte[]) null));
    }

    @Test
    public void testInstanceEncodeUnsafeByte() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertArrayEquals("=00".getBytes("US-ASCII"), codec.encode(new byte[] {0, 65, 65, 65}));
    }

    @Test
    public void testInstanceDecodeEscapedByte() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertArrayEquals(new byte[] {(byte) 255}, codec.decode("=FF".getBytes("US-ASCII")));
    }

    @Test
    public void testInstanceDecodeLiteralNewlines() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertArrayEquals("AB".getBytes("US-ASCII"), codec.decode("A\r\nB".getBytes("US-ASCII")));
    }

    @Test
    public void testDefaultCharset() throws Exception {
        assertEquals("UTF-8", new QuotedPrintableCodec().getDefaultCharset());
    }

    @Test
    public void testConfiguredCharset() throws Exception {
        assertEquals("US-ASCII", new QuotedPrintableCodec("US-ASCII").getDefaultCharset());
    }
}
