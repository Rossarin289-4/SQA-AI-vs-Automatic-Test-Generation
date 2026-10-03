package org.apache.commons.lang3.text.translate;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.CharBuffer;

import static org.junit.Assert.assertEquals;

/**
 * Independent defect-oriented tests targeting LANG-882 / Lang-4.
 * Verifies that LookupTranslator correctly translates text when lookup keys
 * or input sequences are represented by non-String CharSequence implementations.
 */
public class LookupTranslatorLang882Test {

    /**
     * Custom CharSequence implementation that mimics basic text wrapping
     * without overriding Object.equals or Object.hashCode to return String-compatible values.
     */
    private static final class CustomCharSequence implements CharSequence {
        private final String data;

        public CustomCharSequence(final String data) {
            this.data = data;
        }

        @Override
        public int length() {
            return data.length();
        }

        @Override
        public char charAt(final int index) {
            return data.charAt(index);
        }

        @Override
        public CharSequence subSequence(final int start, final int end) {
            return new CustomCharSequence(data.substring(start, end));
        }

        @Override
        public String toString() {
            return data;
        }
    }

    @Test
    public void testTranslateWithStringBuilderKeyAndStringInput() throws IOException {
        final CharSequence key = new StringBuilder("alpha");
        final CharSequence value = "123";
        final LookupTranslator translator = new LookupTranslator(new CharSequence[][]{{key, value}});

        final StringWriter writer = new StringWriter();
        final String input = "alpha";
        final int consumed = translator.translate(input, 0, writer);

        assertEquals("Should consume all 5 characters of 'alpha'", 5, consumed);
        assertEquals("Should write translated value '123'", "123", writer.toString());
    }

    @Test
    public void testTranslateWithCharBufferInput() throws IOException {
        final CharSequence key = "beta";
        final CharSequence value = "456";
        final LookupTranslator translator = new LookupTranslator(new CharSequence[][]{{key, value}});

        final StringWriter writer = new StringWriter();
        final CharSequence input = CharBuffer.wrap("beta");
        final int consumed = translator.translate(input, 0, writer);

        assertEquals("Should consume all 4 characters of 'beta'", 4, consumed);
        assertEquals("Should write translated value '456'", "456", writer.toString());
    }

    @Test
    public void testTranslateWithCustomCharSequenceKey() throws IOException {
        final CharSequence key = new CustomCharSequence("gamma");
        final CharSequence value = "789";
        final LookupTranslator translator = new LookupTranslator(new CharSequence[][]{{key, value}});

        final StringWriter writer = new StringWriter();
        final CharSequence input = new StringBuilder("gamma");
        final int consumed = translator.translate(input, 0, writer);

        assertEquals("Should consume all 5 characters of 'gamma'", 5, consumed);
        assertEquals("Should write translated value '789'", "789", writer.toString());
    }

    @Test
    public void testTranslateWithMultipleKeysAndNonZeroIndex() throws IOException {
        final CharSequence key1 = new StringBuilder("ONE");
        final CharSequence value1 = "1";
        final CharSequence key2 = CharBuffer.wrap("TWO");
        final CharSequence value2 = "2";

        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[][]{{key1, value1}, {key2, value2}}
        );

        final StringWriter writer = new StringWriter();
        final String input = "PREFIX_TWO_SUFFIX";
        final int consumed = translator.translate(input, 7, writer);

        assertEquals("Should consume 3 characters starting at index 7 ('TWO')", 3, consumed);
        assertEquals("Should write translated value '2'", "2", writer.toString());
    }
}

