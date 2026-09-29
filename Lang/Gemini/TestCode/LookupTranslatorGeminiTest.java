package org.apache.commons.lang3.text.translate;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.CharBuffer;

import static org.junit.Assert.assertEquals;

/**
 * Automated test suite for LookupTranslator targeting LANG-882 / Defects4J Lang-4.
 */
public class LookupTranslatorGeminiTest {

    @Test
    public void testBasicStringTranslation() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            { "one", "1" },
            { "two", "2" }
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter out = new StringWriter();

        final int consumed = translator.translate("oneTwo", 0, out);

        assertEquals(3, consumed);
        assertEquals("1", out.toString());
    }

    @Test
    public void testGreedyMatch() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            { "a", "1" },
            { "ab", "2" }
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter out = new StringWriter();

        final int consumed = translator.translate("abc", 0, out);

        assertEquals(2, consumed);
        assertEquals("2", out.toString());
    }

    @Test
    public void testNoMatch() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            { "hello", "world" }
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter out = new StringWriter();

        final int consumed = translator.translate("goodbye", 0, out);

        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslationWithOffsetIndex() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            { "cat", "dog" }
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter out = new StringWriter();

        final int consumed = translator.translate("bobcat", 3, out);

        assertEquals(3, consumed);
        assertEquals("dog", out.toString());
    }

    @Test
    public void testNullLookup() throws IOException {
        final LookupTranslator translator = new LookupTranslator((CharSequence[][]) null);
        final StringWriter out = new StringWriter();

        final int consumed = translator.translate("test", 0, out);

        assertEquals(0, consumed);
        assertEquals("", out.toString());
    }

    @Test
    public void testStringBuilderAsLookupKey() throws IOException {
        final CharSequence key = new StringBuilder("key");
        final CharSequence value = new StringBuilder("value");
        final CharSequence[][] lookup = new CharSequence[][] {
            { key, value }
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter out = new StringWriter();

        final int consumed = translator.translate("key", 0, out);

        assertEquals(3, consumed);
        assertEquals("value", out.toString());
    }

    @Test
    public void testStringBuilderAsInput() throws IOException {
        final CharSequence[][] lookup = new CharSequence[][] {
            { "key", "value" }
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter out = new StringWriter();
        final CharSequence input = new StringBuilder("key");

        final int consumed = translator.translate(input, 0, out);

        assertEquals(3, consumed);
        assertEquals("value", out.toString());
    }

    @Test
    public void testCharBufferAsLookupKey() throws IOException {
        final CharSequence key = CharBuffer.wrap("key");
        final CharSequence value = CharBuffer.wrap("value");
        final CharSequence[][] lookup = new CharSequence[][] {
            { key, value }
        };
        final LookupTranslator translator = new LookupTranslator(lookup);
        final StringWriter out = new StringWriter();

        final int consumed = translator.translate("key", 0, out);

        assertEquals(3, consumed);
        assertEquals("value", out.toString());
    }
}