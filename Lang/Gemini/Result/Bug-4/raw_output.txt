package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import org.junit.Test;
import static org.junit.Assert.*;

public class LookupTranslatorGeneratedTest {

    @Test
    public void testTranslateWithStringBufferKeyAndStringInput() throws IOException {
        CharSequence[][] lookup = new CharSequence[][] {
            { new StringBuffer("alpha"), "1" },
            { new StringBuffer("beta"), "2" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        int consumed = translator.translate("alphaCentauri", 0, writer);

        assertEquals("Should consume 5 characters for 'alpha'", 5, consumed);
        assertEquals("1", writer.toString());
    }

    @Test
    public void testTranslateWithStringBuilderKeyAndStringInput() throws IOException {
        CharSequence[][] lookup = new CharSequence[][] {
            { new StringBuilder("foo"), new StringBuilder("bar") }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        int consumed = translator.translate("foobar", 0, writer);

        assertEquals("Should consume 3 characters for 'foo'", 3, consumed);
        assertEquals("bar", writer.toString());
    }

    @Test
    public void testTranslateWithMultipleNonStringCharSequenceKeys() throws IOException {
        CharSequence[][] lookup = new CharSequence[][] {
            { new StringBuffer("cat"), "feline" },
            { new StringBuilder("dog"), "canine" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);

        StringWriter writerCat = new StringWriter();
        int consumedCat = translator.translate("cat", 0, writerCat);
        assertEquals(3, consumedCat);
        assertEquals("feline", writerCat.toString());

        StringWriter writerDog = new StringWriter();
        int consumedDog = translator.translate("dog", 0, writerDog);
        assertEquals(3, consumedDog);
        assertEquals("canine", writerDog.toString());
    }

    @Test
    public void testTranslateWithGreedyMatchingNonStringKeys() throws IOException {
        CharSequence[][] lookup = new CharSequence[][] {
            { new StringBuffer("test"), "short" },
            { new StringBuilder("testing"), "long" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        int consumed = translator.translate("testing123", 0, writer);

        assertEquals("Should greedily match 'testing' (7 characters)", 7, consumed);
        assertEquals("long", writer.toString());
    }

    @Test
    public void testTranslateWithNonZeroIndexAndStringBufferKey() throws IOException {
        CharSequence[][] lookup = new CharSequence[][] {
            { new StringBuffer("world"), "planet" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        int consumed = translator.translate("hello world", 6, writer);

        assertEquals("Should consume 5 characters for 'world'", 5, consumed);
        assertEquals("planet", writer.toString());
    }

    @Test
    public void testTranslateWithStringKeyAndStringInputRegressionBaseline() throws IOException {
        CharSequence[][] lookup = new CharSequence[][] {
            { "hello", "hi" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        int consumed = translator.translate("hello world", 0, writer);

        assertEquals(5, consumed);
        assertEquals("hi", writer.toString());
    }
}
