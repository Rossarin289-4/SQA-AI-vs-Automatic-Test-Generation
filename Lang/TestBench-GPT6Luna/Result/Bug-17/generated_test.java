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
        assertEquals("A", CharSequenceTranslator.hex(10));
    }

    @Test
    public void testHexUppercaseDigits() throws Exception {
        assertEquals("ABCDEF", CharSequenceTranslator.hex(0xABCDEF));
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
    public void testHexNegativeOne() throws Exception {
        assertEquals("FFFFFFFF", CharSequenceTranslator.hex(-1));
    }

    @Test
    public void testTranslateNullReturnsNull() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator();
        assertEquals(null, translator.translate((CharSequence) null));
    }

    @Test
    public void testTranslateNullInputLeavesWriterAlone() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator();
        StringWriter out = new StringWriter();
        out.write("seed");
        translator.translate(null, out);
        assertEquals("seed", out.toString());
    }

    @Test
    public void testTranslateEmptyInput() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator();
        assertEquals("", translator.translate(""));
    }

    @Test
    public void testTranslateUnmatchedTextIsCopied() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator();
        assertEquals("abc", translator.translate("abc"));
    }

    @Test
    public void testTranslateSurrogatePairIsCopied() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator();
        String input = "\uD83D\uDE00";
        assertEquals(input, translator.translate(input));
    }

    @Test
    public void testTranslateNullWriterThrows() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator();
        try {
            translator.translate("x", (Writer) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testWithNoAdditionalTranslators() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator().with();
        assertEquals("plain", translator.translate("plain"));
    }

    @Test
    public void testWithLookupTranslator() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator().with(
            new LookupTranslator(new CharSequence[][] {{"a", "X"}}));
        assertEquals("Xb", translator.translate("ab"));
    }

    @Test
    public void testWithTranslatorsUsesFirstMatchingTranslator() throws Exception {
        CharSequenceTranslator translator = new AggregateTranslator().with(
            new LookupTranslator(new CharSequence[][] {{"a", "first"}}),
            new LookupTranslator(new CharSequence[][] {{"a", "second"}}));
        assertEquals("first", translator.translate("a"));
    }

    @Test
    public void testWithDoesNotChangeOriginalTranslator() throws Exception {
        CharSequenceTranslator original = new AggregateTranslator();
        CharSequenceTranslator combined = original.with(
            new LookupTranslator(new CharSequence[][] {{"a", "X"}}));
        assertEquals("a", original.translate("a"));
        assertEquals("X", combined.translate("a"));
    }
}
