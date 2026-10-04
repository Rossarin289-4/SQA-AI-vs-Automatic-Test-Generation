package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class DoubleMetaphoneTest {
    @Test
    public void testNullInput() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertNull(encoder.doubleMetaphone(null));
    }

    @Test
    public void testTrimmedEmptyInput() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertNull(encoder.doubleMetaphone("  "));
    }

    @Test
    public void testEncodeStringObject() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertEquals("SM0", encoder.encode((Object) "Smith"));
    }

    @Test
    public void testEncodeRejectsNonString() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        try {
            encoder.encode((Object) Integer.valueOf(1));
            fail("expected EncoderException");
        } catch (EncoderException expected) {
        }
    }

    @Test
    public void testSilentStart() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertEquals("NT", encoder.doubleMetaphone("knight"));
    }

    @Test
    public void testAlternateEncoding() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertEquals("SM0", encoder.doubleMetaphone("Smith", false));
        assertEquals("XMT", encoder.doubleMetaphone("Smith", true));
    }

    @Test
    public void testEqualityUsesEncodedValues() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Smyth"));
    }

    @Test
    public void testDefaultMaximumCodeLength() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertEquals(4, encoder.getMaxCodeLen());
    }

    @Test
    public void testSetMaximumCodeLengthAndEncodingLimit() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        encoder.setMaxCodeLen(2);
        assertEquals(2, encoder.getMaxCodeLen());
        assertEquals("SM", encoder.doubleMetaphone("Smith"));
    }

    @Test
    public void testMaximumCodeLengthOne() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        encoder.setMaxCodeLen(1);
        assertEquals("S", encoder.doubleMetaphone("Smith"));
    }

    @Test
    public void testMaximumCodeLengthZero() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        encoder.setMaxCodeLen(0);
        assertEquals("", encoder.doubleMetaphone("Smith"));
    }

    @Test
    public void testMaximumCodeLengthNegative() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        encoder.setMaxCodeLen(-1);
        assertEquals("", encoder.doubleMetaphone("Smith"));
    }

    @Test
    public void testResultAppendAndCompletion() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result =
                encoder.new DoubleMetaphoneResult(2);
        assertFalse(result.isComplete());
        result.append('A');
        assertEquals("A", result.getPrimary());
        assertEquals("A", result.getAlternate());
        result.append('B');
        assertEquals("AB", result.getPrimary());
        assertEquals("AB", result.getAlternate());
        assertTrue(result.isComplete());
    }

    @Test
    public void testResultAppendStopsAtLengthLimit() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result =
                encoder.new DoubleMetaphoneResult(1);
        result.append('A');
        result.append('B');
        assertEquals("A", result.getPrimary());
        assertEquals("A", result.getAlternate());
    }

    @Test
    public void testResultCanAppendPrimaryIndependently() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result =
                encoder.new DoubleMetaphoneResult(2);
        result.appendPrimary('A');
        assertEquals("A", result.getPrimary());
        assertEquals("", result.getAlternate());
        assertFalse(result.isComplete());
    }

    @Test
    public void testResultCanAppendAlternateIndependently() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result =
                encoder.new DoubleMetaphoneResult(2);
        result.appendAlternate('B');
        assertEquals("", result.getPrimary());
        assertEquals("B", result.getAlternate());
        assertFalse(result.isComplete());
    }

    @Test
    public void testEncodedValueIsLimitedToDefaultLength() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertEquals(4, encoder.doubleMetaphone("Washington").length());
    }

    @Test
    public void testEncodeStringOverload() throws Exception {
        DoubleMetaphone encoder = new DoubleMetaphone();
        assertEquals(encoder.doubleMetaphone("Smith"), encoder.encode("Smith"));
    }
}
