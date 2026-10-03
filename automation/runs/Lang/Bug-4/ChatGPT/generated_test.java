package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class LookupTranslatorLang882ChatGPTTest {

    /**
     * CharSequence used for lookup keys.
     *
     * Equality is intentionally restricted to the same implementation
     * so that it behaves differently from String-based equality.
     */
    private static final class KeySequence implements CharSequence {

        private final String value;

        KeySequence(String value) {
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
            return new KeySequence(value.substring(start, end));
        }

        @Override
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof KeySequence)) {
                return false;
            }
            return value.equals(((KeySequence) obj).value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }
    }

    /**
     * Different CharSequence implementation used for translator input.
     *
     * Its equality is intentionally restricted to InputSequence objects.
     */
    private static final class InputSequence implements CharSequence {

        private final String value;

        InputSequence(String value) {
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
            return new InputSequence(value.substring(start, end));
        }

        @Override
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof InputSequence)) {
                return false;
            }
            return value.equals(((InputSequence) obj).value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }
    }

    @Test
    public void testDifferentCustomCharSequenceImplementations() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {
                        new KeySequence("alpha"),
                        "A"
                });

        Writer out = new StringWriter();

        int consumed = translator.translate(
                new InputSequence("alpha"),
                0,
                out);

        assertEquals("A", out.toString());
        assertEquals(5, consumed);
    }

    @Test
    public void testStringLookupKeyWithCustomInputSequence() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {
                        "beta",
                        "B"
                });

        Writer out = new StringWriter();

        int consumed = translator.translate(
                new InputSequence("beta"),
                0,
                out);

        assertEquals("B", out.toString());
        assertEquals(4, consumed);
    }

    @Test
    public void testCustomLookupKeyWithStringInput() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {
                        new KeySequence("gamma"),
                        "G"
                });

        Writer out = new StringWriter();

        int consumed = translator.translate(
                "gamma",
                0,
                out);

        assertEquals("G", out.toString());
        assertEquals(5, consumed);
    }

    @Test
    public void testGreedyMatchingWithDifferentCharSequenceImplementation() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {
                        new KeySequence("abc"),
                        "LONG"
                },
                new CharSequence[] {
                        new KeySequence("ab"),
                        "SHORT"
                });

        Writer out = new StringWriter();

        int consumed = translator.translate(
                new InputSequence("abcX"),
                0,
                out);

        assertEquals("LONG", out.toString());
        assertEquals(3, consumed);
    }

    @Test
    public void testDifferentCharSequenceAtNonZeroIndex() throws IOException {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {
                        "delta",
                        "D"
                });

        Writer out = new StringWriter();

        int consumed = translator.translate(
                new InputSequence("xxdelta"),
                2,
                out);

        assertEquals("D", out.toString());
        assertEquals(5, consumed);
    }
}
