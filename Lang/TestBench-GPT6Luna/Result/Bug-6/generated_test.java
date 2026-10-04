package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

public class CharSequenceTranslatorTest {
    @Test
    public void testNullInputReturnsNull() throws Exception {
        assertNull(new AggregateTranslator().translate((CharSequence) null));
    }

    @Test
    public void testEmptyInputReturnsEmptyString() throws Exception {
        assertEquals("", new AggregateTranslator().translate(""));
    }

    @Test
    public void testUntranslatedInputIsCopied() throws Exception {
        assertEquals("abc", new AggregateTranslator().translate("abc"));
    }

    @Test
    public void testUntranslatedSupplementaryCodePointIsCopied() throws Exception {
        String input = "\uD83D\uDE00";
        assertEquals(input, new AggregateTranslator().translate(input));
    }

    @Test
    public void testNullWriterThrowsIllegalArgumentException() throws Exception {
        try {
            new AggregateTranslator().translate("x", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testNullInputDoesNotWrite() throws Exception {
        StringWriter out = new StringWriter();
        new AggregateTranslator().translate(null, out);
        assertEquals("", out.toString());
    }

    @Test
    public void testWriterReceivesUntranslatedText() throws Exception {
        StringWriter out = new StringWriter();
        new AggregateTranslator().translate("hello", out);
        assertEquals("hello", out.toString());
    }

    @Test
    public void testHexZero() throws Exception {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHexPositiveValueUsesUppercase() throws Exception {
        assertEquals("1A", CharSequenceTranslator.hex(26));
    }

    @Test
    public void testHexNegativeOne() throws Exception {
        assertEquals("FFFFFFFF", CharSequenceTranslator.hex(-1));
    }

    @Test
    public void testHexLargestPositiveInt() throws Exception {
        assertEquals("7FFFFFFF", CharSequenceTranslator.hex(Integer.MAX_VALUE));
    }

    @Test
    public void testHexSmallestNegativeInt() throws Exception {
        assertEquals("80000000", CharSequenceTranslator.hex(Integer.MIN_VALUE));
    }

    @Test
    public void testWithNoAdditionalTranslatorsPreservesText() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator().with();
        assertEquals("plain", translator.translate("plain"));
    }

    @Test
    public void testWithNullTranslatorArrayEntryPreservesText() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator().with((CharSequenceTranslator) null);
        try {
            translator.translate("plain");
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }
}
