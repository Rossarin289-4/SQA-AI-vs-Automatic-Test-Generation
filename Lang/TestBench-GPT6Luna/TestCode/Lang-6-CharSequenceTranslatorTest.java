package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

public class CharSequenceTranslatorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testHexZero() throws Exception {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHexPositive() throws Exception {
        assertEquals("1A", CharSequenceTranslator.hex(26));
    }

    @Test
    public void testHexNegativeOne() throws Exception {
        assertEquals("FFFFFFFF", CharSequenceTranslator.hex(-1));
    }

    @Test
    public void testHexMinimumInteger() throws Exception {
        assertEquals("80000000", CharSequenceTranslator.hex(Integer.MIN_VALUE));
    }

    @Test
    public void testHexMaximumInteger() throws Exception {
        assertEquals("7FFFFFFF", CharSequenceTranslator.hex(Integer.MAX_VALUE));
    }

    @Test
    public void testNullInputReturnsNull() throws Exception {
        CharSequenceTranslator translator = new NumericEntityUnescaper();
        assertNull(translator.translate((CharSequence) null));
    }

    @Test
    public void testUnchangedPlainText() throws Exception {
        CharSequenceTranslator translator = new NumericEntityUnescaper();
        assertEquals("plain", translator.translate("plain"));
    }

    @Test
    public void testDecodeDecimalEntity() throws Exception {
        CharSequenceTranslator translator = new NumericEntityUnescaper();
        assertEquals("A", translator.translate("&#65;"));
    }

    @Test
    public void testDecodeHexEntity() throws Exception {
        CharSequenceTranslator translator = new NumericEntityUnescaper();
        assertEquals("A", translator.translate("&#x41;"));
    }

    @Test
    public void testNullWriterIsRejected() throws Exception {
        CharSequenceTranslator translator = new NumericEntityUnescaper();
        try {
            translator.translate("x", (Writer) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testNullInputWritesNothing() throws Exception {
        CharSequenceTranslator translator = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        writer.write("seed");
        translator.translate(null, writer);
        assertEquals("seed", writer.toString());
    }

    @Test
    public void testWriterTranslationDecodesEntity() throws Exception {
        CharSequenceTranslator translator = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        translator.translate("&#65;", writer);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testWithNoAdditionalTranslators() throws Exception {
        CharSequenceTranslator translator = new NumericEntityUnescaper();
        assertEquals("A", translator.with().translate("&#65;"));
    }

    @Test
    public void testWithAdditionalTranslator() throws Exception {
        CharSequenceTranslator translator = new NumericEntityUnescaper();
        CharSequenceTranslator combined = translator.with(new NumericEntityUnescaper());
        assertEquals("A", combined.translate("&#65;"));
    }
}
