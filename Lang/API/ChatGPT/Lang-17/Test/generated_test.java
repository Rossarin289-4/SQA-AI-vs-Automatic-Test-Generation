package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharSequenceTranslatorLang17Test {

    private CharSequenceTranslator identityTranslator() {
        return new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index,
                    java.io.Writer out) {
                return 0;
            }
        };
    }

    @Test
    public void testSupplementaryCharacterFollowedBySingleAsciiCharacter() {
        String supplementary = new String(Character.toChars(0x1F642));
        String input = supplementary + "A";

        String result = identityTranslator().translate(input);

        assertEquals(input, result);
    }

    @Test
    public void testSupplementaryCharacterFollowedByMultipleAsciiCharacters() {
        String supplementary = new String(Character.toChars(0x1F642));
        String input = supplementary + "XYZ";

        String result = identityTranslator().translate(input);

        assertEquals(input, result);
    }

    @Test
    public void testTwoConsecutiveSupplementaryCharacters() {
        String first = new String(Character.toChars(0x1F642));
        String second = new String(Character.toChars(0x1F680));
        String input = first + second;

        String result = identityTranslator().translate(input);

        assertEquals(input, result);
    }

    @Test
    public void testSupplementaryCharacterInMiddleOfAsciiText() {
        String supplementary = new String(Character.toChars(0x1F642));
        String input = "AB" + supplementary + "CD";

        String result = identityTranslator().translate(input);

        assertEquals(input, result);
    }
}
