package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Random;

import org.junit.Test;

public class RandomStringUtilsLang12Test {

    /**
     * Defect test:
     * When a non-empty custom character array is supplied and
     * start/end are both zero, the whole character array should
     * be used as the generation range.
     */
    @Test
    public void testUsesEntireCustomCharacterArrayWhenRangeIsZero() {
        char[] chars = {'A', 'B', 'C', 'D'};

        String result = RandomStringUtils.random(
                20,
                0,
                0,
                false,
                false,
                chars,
                new Random(12345));

        assertEquals(20, result.length());

        for (int i = 0; i < result.length(); i++) {
            char generated = result.charAt(i);

            assertTrue(
                    generated == 'A'
                    || generated == 'B'
                    || generated == 'C'
                    || generated == 'D');
        }
    }

    /**
     * Defect-related validation test:
     * An empty custom character array should be rejected explicitly.
     */
    @Test
    public void testRejectsEmptyCustomCharacterArray() {
        char[] chars = new char[0];

        try {
            RandomStringUtils.random(
                    1,
                    0,
                    0,
                    false,
                    false,
                    chars,
                    new Random(12345));

            fail("Expected IllegalArgumentException for an empty chars array");
        } catch (IllegalArgumentException e) {
            assertEquals(
                    "The chars array must not be empty",
                    e.getMessage());
        }
    }

    /**
     * Regression test:
     * A normal non-zero range over a custom character array should
     * continue to select characters only from that requested range.
     */
    @Test
    public void testGeneratesCharactersFromExplicitCustomRange() {
        char[] chars = {'a', 'b', 'c', 'd', 'e'};

        String result = RandomStringUtils.random(
                20,
                1,
                4,
                false,
                false,
                chars,
                new Random(12345));

        assertEquals(20, result.length());

        for (int i = 0; i < result.length(); i++) {
            char generated = result.charAt(i);

            assertTrue(
                    generated == 'b'
                    || generated == 'c'
                    || generated == 'd');
        }
    }
}
