package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import java.io.IOException;
import java.io.Writer;
import static org.junit.Assert.assertEquals;

public class CharSequenceTranslatorIndependantTest {

    /**
     * A custom translator that matches a specific literal string and consumes a given number of characters.
     */
    private static class CustomTestTranslator extends CharSequenceTranslator {
        private final String target;
        private final int consumedCount;
        private final String replacement;

        public CustomTestTranslator(String target, int consumedCount, String replacement) {
            this.target = target;
            this.consumedCount = consumedCount;
            this.replacement = replacement;
        }

        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (subSequenceEquals(input, index, target)) {
                out.write(replacement);
                return consumedCount;
            }
            return 0;
        }

        private boolean subSequenceEquals(CharSequence input, int index, String target) {
            if (index + target.length() > input.length()) {
                return false;
            }
            for (int i = 0; i < target.length(); i++) {
                if (input.charAt(index + i) != target.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    @Test
    public void testTranslateAfterPrefix() {
        // Prefix of length 3 ("abc"), followed by a translatable token ("target" -> "REPLACED")
        CharSequenceTranslator translator = new CustomTestTranslator("target", 6, "REPLACED");
        String input = "abctarget";
        String expected = "abcREPLACED";

        String result = translator.translate(input);
        assertEquals("Translation occurring after prefix failed due to incorrect pos advancement", expected, result);
    }

    @Test
    public void testMultipleConsecutiveTranslations() {
        // Multiple translatable tokens separated by text
        CharSequenceTranslator translator = new CustomTestTranslator("foo", 3, "bar");
        String input = "prefix_foo_middle_foo_suffix";
        String expected = "prefix_bar_middle_bar_suffix";

        String result = translator.translate(input);
        assertEquals("Multiple translations failed due to incorrect pos calculation", expected, result);
    }

    @Test
    public void testCustomTranslatorConsumingMultipleCodeUnits() {
        // Translator that consumes a larger block at an offset index
        CharSequenceTranslator translator = new CustomTestTranslator("12345", 5, "X");
        String input = "abc12345def";
        String expected = "abcXdef";

        String result = translator.translate(input);
        assertEquals("Consuming multiple code units at non-zero index failed", expected, result);
    }
}
