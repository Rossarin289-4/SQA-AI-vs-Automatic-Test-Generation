package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import java.io.IOException;
import java.io.Writer;
import static org.junit.Assert.assertEquals;

public class CharSequenceTranslatorIndependentTest {

    // Custom translator that returns 0 consumption (forcing fallback write of code point chars)
    private static class DummyZeroConsumerTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    }

    // Custom translator that matches a specific surrogate pair and consumes it
    private static class SpecificSurrogateTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (Character.isSurrogatePair(input.charAt(index), input.charAt(index + 1))) {
                out.write("[SURROGATE]");
                return 2; // consumed 2 code points / units representation handled by contract
            }
            return 0;
        }
    }

    @Test(timeout = 1000)
    public void testSupplementaryCharacterZeroConsumption() {
        // Supplementary character (U+1D400: MATHEMATICAL BOLD CAPITAL A) represented as surrogate pair \uD835 \uDC00
        String input = "\uD835\uDC00";
        CharSequenceTranslator translator = new DummyZeroConsumerTranslator();
        String result = translator.translate(input);
        assertEquals("\uD835\uDC00", result);
    }

    @Test(timeout = 1000)
    public void testSupplementaryCharacterPositiveConsumption() {
        String input = "A\uD835\uDC00B";
        CharSequenceTranslator translator = new SpecificSurrogateTranslator();
        String result = translator.translate(input);
        assertEquals("A[SURROGATE]B", result);
    }

    @Test(timeout = 1000)
    public void testMultipleSupplementaryCharacters() {
        String input = "\uD835\uDC00\uD835\uDC01";
        CharSequenceTranslator translator = new DummyZeroConsumerTranslator();
        String result = translator.translate(input);
        assertEquals("\uD835\uDC00\uD835\uDC01", result);
    }
}
