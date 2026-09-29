package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;

import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class LookupTranslatorChatGPTTest {

    /**
     * Simple custom CharSequence used to test interoperability
     * between different CharSequence implementations.
     */
    private static class CustomCharSequence implements CharSequence {

        private final String value;

        CustomCharSequence(String value) {
            this.value = value;
        }

        @Override
        public int length() {
            return value.length();
        }

        @Override
        public char charAt(int index) {
            return value.charAt(index);
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return value.substring(start, end);
        }

        @Override
        public String toString() {
            return value;
        }
    }

    @Test
    public void testExactMatch() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"cat", "dog"}
        );

        Writer out = new StringWriter();

        int result = translator.translate("cat", 0, out);

        assertEquals(3, result);
        assertEquals("dog", out.toString());
    }

    @Test
    public void testGreedyLongestMatch() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"a", "X"},
                new CharSequence[] {"abc", "XYZ"}
        );

        Writer out = new StringWriter();

        int result = translator.translate("abc", 0, out);

        assertEquals(3, result);
        assertEquals("XYZ", out.toString());
    }

    @Test
    public void testInputShorterThanLongestKey() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"abc", "XYZ"}
        );

        Writer out = new StringWriter();

        int result = translator.translate("ab", 0, out);

        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslationAtNonZeroIndex() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"a", "X"}
        );

        Writer out = new StringWriter();

        int result = translator.translate("ba", 1, out);

        assertEquals(1, result);
        assertEquals("X", out.toString());
    }

    @Test
    public void testIndexAtEndOfInput() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"a", "X"}
        );

        Writer out = new StringWriter();

        int result = translator.translate("abc", 3, out);

        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testNoMatchingKey() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"xyz", "XYZ"}
        );

        Writer out = new StringWriter();

        int result = translator.translate("abc", 0, out);

        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    @Test
    public void testSingleCharacterKey() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"a", "X"}
        );

        Writer out = new StringWriter();

        int result = translator.translate("a", 0, out);

        assertEquals(1, result);
        assertEquals("X", out.toString());
    }

    @Test
    public void testDifferentCharSequenceImplementationForLookupKey()
            throws Exception {

        CharSequence key = new CustomCharSequence("abc");

        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {key, "XYZ"}
        );

        Writer out = new StringWriter();

        int result = translator.translate("abc", 0, out);

        assertEquals(3, result);
        assertEquals("XYZ", out.toString());
    }

    @Test
    public void testCustomCharSequenceAsInput() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"abc", "XYZ"}
        );

        CharSequence input = new CustomCharSequence("abc");

        Writer out = new StringWriter();

        int result = translator.translate(input, 0, out);

        assertEquals(3, result);
        assertEquals("XYZ", out.toString());
    }

    @Test
    public void testGreedyMatchWithTwoPossibleLengths() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"a", "A"},
                new CharSequence[] {"ab", "AB"}
        );

        Writer out = new StringWriter();

        int result = translator.translate("ab", 0, out);

        assertEquals(2, result);
        assertEquals("AB", out.toString());
    }

    @Test
    public void testMultipleCharacterMatchAtNonZeroIndex()
            throws Exception {

        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"ab", "AB"},
                new CharSequence[] {"cd", "CD"}
        );

        Writer out = new StringWriter();

        int result = translator.translate("xabcd", 1, out);

        assertEquals(2, result);
        assertEquals("AB", out.toString());
    }
}