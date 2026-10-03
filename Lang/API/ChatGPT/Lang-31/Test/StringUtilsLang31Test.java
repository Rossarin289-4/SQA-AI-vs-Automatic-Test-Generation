package org.apache.commons.lang3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilsLang31Test {

    @Test
    public void testContainsAnyCharArrayDoesNotMatchDifferentSupplementaryCharacter() {
        String actualCharacter = new String(Character.toChars(0x1F600));
        String differentCharacter = new String(Character.toChars(0x1F601));

        char[] searchChars = differentCharacter.toCharArray();

        assertFalse(
                StringUtils.containsAny(actualCharacter, searchChars));
    }

    @Test
    public void testContainsAnyStringDoesNotMatchDifferentSupplementaryCharacter() {
        String actualCharacter = new String(Character.toChars(0x1F680));
        String differentCharacter = new String(Character.toChars(0x1F681));

        assertFalse(
                StringUtils.containsAny(actualCharacter, differentCharacter));
    }

    @Test
    public void testContainsAnyCharArrayDoesNotMatchPartialSurrogatePairAfterPrefix() {
        String actualCharacter = new String(Character.toChars(0x1F682));
        String differentCharacter = new String(Character.toChars(0x1F683));

        String input = "prefix" + actualCharacter + "suffix";
        char[] searchChars = {
            'x',
            differentCharacter.charAt(0),
            differentCharacter.charAt(1),
            'y'
        };

        assertFalse(
                StringUtils.containsAny(input, searchChars));
    }

    @Test
    public void testContainsAnyCharArrayMatchesCompleteSupplementaryCharacter() {
        String target = new String(Character.toChars(0x1F642));

        assertTrue(
                StringUtils.containsAny(
                        "before" + target + "after",
                        target.toCharArray()));
    }

    @Test
    public void testContainsAnyStringMatchesCompleteSupplementaryCharacter() {
        String target = new String(Character.toChars(0x1F680));

        assertTrue(
                StringUtils.containsAny(
                        "left" + target + "right",
                        target));
    }
}
