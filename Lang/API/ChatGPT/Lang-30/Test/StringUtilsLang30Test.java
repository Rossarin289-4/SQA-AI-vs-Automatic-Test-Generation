package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsLang30Test {

    @Test
    public void testIndexOfAnyDoesNotMatchHighSurrogateWithWrongLowSurrogate() {
        String actualCharacter = new String(Character.toChars(0x1F600));
        String differentCharacter = new String(Character.toChars(0x1F601));

        char[] searchChars = {
            actualCharacter.charAt(0),
            differentCharacter.charAt(1)
        };

        assertEquals(-1, StringUtils.indexOfAny("A" + actualCharacter + "B", searchChars));
    }

    @Test
    public void testIndexOfAnyDoesNotAcceptPartialSupplementaryCharacterAmongOtherSearchChars() {
        String actualCharacter = new String(Character.toChars(0x1F680));
        String differentCharacter = new String(Character.toChars(0x1F681));

        char[] searchChars = {
            'x',
            actualCharacter.charAt(0),
            differentCharacter.charAt(1),
            'y'
        };

        assertEquals(-1, StringUtils.indexOfAny("ab" + actualCharacter + "cd", searchChars));
    }

    @Test
    public void testIndexOfAnyMatchesCompleteSupplementaryCharacter() {
        String target = new String(Character.toChars(0x1F642));

        char[] searchChars = {
            target.charAt(0),
            target.charAt(1)
        };

        assertEquals(2, StringUtils.indexOfAny("xy" + target + "z", searchChars));
    }

    @Test
    public void testIndexOfAnyRejectsMismatchedSupplementaryCharacterAtLaterPosition() {
        String actualCharacter = new String(Character.toChars(0x1F680));
        String differentCharacter = new String(Character.toChars(0x1F682));

        char[] searchChars = {
            'q',
            'r',
            actualCharacter.charAt(0),
            differentCharacter.charAt(1)
        };

        assertEquals(-1, StringUtils.indexOfAny("hello" + actualCharacter, searchChars));
    }
}
