package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharSequenceTranslatorTest {

    @Test
    public void testTranslateSupplementaryCharacterAtBeginning() {
        CharSequenceTranslator translator =
                new LookupTranslator(
                        new CharSequence[][] {
                                { "\uD83D\uDE42", "X" }
                        });

        assertEquals("X", translator.translate("\uD83D\uDE42"));
    }

    @Test
    public void testTranslateSupplementaryCharacterAfterRegularCharacter() {
        CharSequenceTranslator translator =
                new LookupTranslator(
                        new CharSequence[][] {
                                { "\uD83D\uDE42", "X" }
                        });

        assertEquals("AX", translator.translate("A\uD83D\uDE42"));
    }
}
