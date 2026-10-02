package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import org.junit.Test;
import static org.junit.Assert.*;

public class LookupTranslatorGeneratedTest {

    @Test
    public void testStringBufferKeyWithStringInput() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {
                        { new StringBuffer("cat"), "dog" }
                });

        StringWriter out = new StringWriter();
        int consumed = translator.translate("cat", 0, out);

        assertEquals(3, consumed);
        assertEquals("dog", out.toString());
    }

    @Test
    public void testStringBuilderKeyWithStringInput() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {
                        { new StringBuilder("hello"), "hi" }
                });

        StringWriter out = new StringWriter();
        int consumed = translator.translate("hello", 0, out);

        assertEquals(5, consumed);
        assertEquals("hi", out.toString());
    }

    @Test
    public void testMultipleNonStringKeysWithStringInput() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {
                        { new StringBuffer("red"), "R" },
                        { new StringBuilder("green"), "G" },
                        { new StringBuffer("blue"), "B" }
                });

        StringWriter out = new StringWriter();

        int first = translator.translate("red", 0, out);
        int second = translator.translate("green", 0, out);
        int third = translator.translate("blue", 0, out);

        assertEquals(3, first);
        assertEquals(5, second);
        assertEquals(4, third);
        assertEquals("RGB", out.toString());
    }

    @Test
    public void testGreedyMatchingWithStringBuilderKeys() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {
                        { new StringBuilder("ab"), "X" },
                        { new StringBuffer("abcd"), "LONG" },
                        { new StringBuilder("abc"), "MID" }
                });

        StringWriter out = new StringWriter();
        int consumed = translator.translate("abcd", 0, out);

        assertEquals(4, consumed);
        assertEquals("LONG", out.toString());
    }

    @Test
    public void testNonZeroIndexWithStringBufferKey() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {
                        { new StringBuffer("world"), "earth" }
                });

        StringWriter out = new StringWriter();
        int consumed = translator.translate("hello world", 6, out);

        assertEquals(5, consumed);
        assertEquals("earth", out.toString());
    }

    @Test
    public void testStringKeyWithStringInputRegression() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {
                        { "apple", "fruit" }
                });

        StringWriter out = new StringWriter();
        int consumed = translator.translate("apple", 0, out);

        assertEquals(5, consumed);
        assertEquals("fruit", out.toString());
    }
}
