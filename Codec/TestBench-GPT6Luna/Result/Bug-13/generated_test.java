package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.language.DoubleMetaphone;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.Charsets;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

public class CharSequenceUtilsTest {
    @Test
    public void testNullAndReferenceEquality() throws Exception {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "x"));
        assertFalse(StringUtils.equals("x", null));
        assertTrue(StringUtils.equals("same", "same"));
    }

    @Test
    public void testCaseSensitiveAndLengthEquality() throws Exception {
        assertFalse(StringUtils.equals("a", "A"));
        assertFalse(StringUtils.equals("ab", "a"));
        assertTrue(StringUtils.equals("", ""));
    }

    @Test
    public void testCharSequenceComparisonBeyondStringFastPath() throws Exception {
        CharSequence left = new StringBuilder("same");
        CharSequence right = new StringBuilder("same");
        assertTrue(StringUtils.equals(left, right));
        assertFalse(StringUtils.equals(new StringBuilder("same"), new StringBuilder("samf")));
    }

    @Test
    public void testIso88591EncodingAndNull() throws Exception {
        assertArrayEquals(new byte[] { 65, (byte) 233 }, StringUtils.getBytesIso8859_1("Aé"));
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testUncheckedEncodingAndInvalidCharset() throws Exception {
        assertArrayEquals(new byte[] { 65, 66 }, StringUtils.getBytesUnchecked("AB", "US-ASCII"));
        assertNull(StringUtils.getBytesUnchecked(null, "not-a-charset"));
        try {
            StringUtils.getBytesUnchecked("x", "not-a-charset");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testAsciiEncoding() throws Exception {
        assertArrayEquals(new byte[] { 65, 66 }, StringUtils.getBytesUsAscii("AB"));
    }

    @Test
    public void testUtf16Encoding() throws Exception {
        assertArrayEquals("A".getBytes("UTF-16"), StringUtils.getBytesUtf16("A"));
    }

    @Test
    public void testUtf16BigEndianEncoding() throws Exception {
        assertArrayEquals(new byte[] { 0, 65 }, StringUtils.getBytesUtf16Be("A"));
    }

    @Test
    public void testUtf16LittleEndianEncoding() throws Exception {
        assertArrayEquals(new byte[] { 65, 0 }, StringUtils.getBytesUtf16Le("A"));
    }

    @Test
    public void testUtf8Encoding() throws Exception {
        assertArrayEquals(new byte[] { 65, (byte) 195, (byte) 169 }, StringUtils.getBytesUtf8("Aé"));
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testNewStringNamedCharsetAndNull() throws Exception {
        assertEquals("AB", StringUtils.newString(new byte[] { 65, 66 }, "US-ASCII"));
        assertNull(StringUtils.newString(null, "not-a-charset"));
        try {
            StringUtils.newString(new byte[] { 65 }, "not-a-charset");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testNewStringIso88591() throws Exception {
        assertEquals("é", StringUtils.newStringIso8859_1(new byte[] { (byte) 233 }));
    }

    @Test
    public void testNewStringAscii() throws Exception {
        assertEquals("AB", StringUtils.newStringUsAscii(new byte[] { 65, 66 }));
    }

    @Test
    public void testNewStringUtf16() throws Exception {
        assertEquals("A", StringUtils.newStringUtf16("A".getBytes("UTF-16")));
    }

    @Test
    public void testNewStringUtf16BigEndian() throws Exception {
        assertEquals("A", StringUtils.newStringUtf16Be(new byte[] { 0, 65 }));
    }

    @Test
    public void testNewStringUtf16LittleEndian() throws Exception {
        assertEquals("A", StringUtils.newStringUtf16Le(new byte[] { 65, 0 }));
    }

    @Test
    public void testNewStringUtf8AndNull() throws Exception {
        assertEquals("é", StringUtils.newStringUtf8(new byte[] { (byte) 195, (byte) 169 }));
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testDoubleMetaphoneNullAndTrimmedEmpty() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertNull(encoder.doubleMetaphone(null));
        assertNull(encoder.doubleMetaphone("  "));
    }

    @Test
    public void testDoubleMetaphoneCodeLimit() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertEquals(4, encoder.getMaxCodeLen());
        assertEquals("SM0", encoder.doubleMetaphone("Smith"));
        encoder.setMaxCodeLen(2);
        assertEquals(2, encoder.getMaxCodeLen());
        assertEquals("SM", encoder.doubleMetaphone("Smith"));
    }

    @Test
    public void testDoubleMetaphoneSilentInitialLetters() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertEquals(encoder.doubleMetaphone("Knight"), encoder.doubleMetaphone("Night"));
    }

    @Test
    public void testDoubleMetaphonePrimaryAndAlternate() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertEquals("SM0", encoder.doubleMetaphone("Smith", false));
        assertEquals("XMT", encoder.doubleMetaphone("Smith", true));
    }

    @Test
    public void testEncodeStringAndObject() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertEquals("SM0", encoder.encode("Smith"));
        assertEquals("SM0", encoder.encode((Object) "Smith"));
    }

    @Test
    public void testEncodeRejectsNonString() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        try {
            encoder.encode((Object) Integer.valueOf(1));
            fail("expected EncoderException");
        } catch (EncoderException expected) { }
    }

    @Test
    public void testMetaphoneEquality() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Smyth"));
        assertFalse(encoder.isDoubleMetaphoneEqual("Smith", "Jones"));
    }

    @Test
    public void testResultAppendCharacterToBothCodes() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(2);
        result.append('A');
        assertEquals("A", result.getPrimary());
        assertEquals("A", result.getAlternate());
        assertFalse(result.isComplete());
    }

    @Test
    public void testResultAppendPrimaryCharacterOnly() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(1);
        result.appendPrimary('P');
        assertEquals("P", result.getPrimary());
        assertEquals("", result.getAlternate());
        assertFalse(result.isComplete());
    }

    @Test
    public void testResultAppendAlternateCharacterOnly() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(1);
        result.appendAlternate('A');
        assertEquals("", result.getPrimary());
        assertEquals("A", result.getAlternate());
        assertFalse(result.isComplete());
    }

    @Test
    public void testResultCompleteOnlyWhenBothReachLimit() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(1);
        result.appendPrimary('P');
        assertFalse(result.isComplete());
        result.appendAlternate('A');
        assertTrue(result.isComplete());
        assertEquals("P", result.getPrimary());
        assertEquals("A", result.getAlternate());
    }

    @Test
    public void testResultCharacterAppendStopsAtMaximumLength() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(2);
        result.append('A');
        result.append('B');
        result.append('C');
        assertEquals("AB", result.getPrimary());
        assertEquals("AB", result.getAlternate());
        assertTrue(result.isComplete());
    }

    @Test
    public void testResultZeroMaximumLength() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(0);
        assertEquals("", result.getPrimary());
        assertEquals("", result.getAlternate());
        assertTrue(result.isComplete());
        result.append('X');
        assertEquals("", result.getPrimary());
        assertEquals("", result.getAlternate());
    }

    @Test
    public void testResultStringAppendTruncatesEachCodeAtLimit() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(2);
        result.append("ABCD");
        assertEquals("AB", result.getPrimary());
        assertEquals("AB", result.getAlternate());
    }

    @Test
    public void testResultDifferentPrimaryAndAlternateStrings() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result = encoder.new DoubleMetaphoneResult(3);
        result.append("PQR", "XYZ");
        assertEquals("PQR", result.getPrimary());
        assertEquals("XYZ", result.getAlternate());
        assertTrue(result.isComplete());
    }
}
