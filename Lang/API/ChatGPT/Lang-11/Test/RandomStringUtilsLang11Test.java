package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Random;

import org.junit.Test;

public class RandomStringUtilsLang11Test {

    @Test
    public void testRejectsZeroWidthCharacterRange() {
        try {
            RandomStringUtils.random(
                    1, 7, 7, false, false, (char[]) null, new Random(1));
        } catch (IllegalArgumentException e) {
            assertEquals(
                    "Parameter end (7) must be greater than start (7)",
                    e.getMessage());
            return;
        }

        org.junit.Assert.fail(
                "Expected IllegalArgumentException for a zero-width range");
    }

    @Test
    public void testRejectsNegativeWidthCharacterRange() {
        try {
            RandomStringUtils.random(
                    1, 9, 4, false, false, (char[]) null, new Random(1));
        } catch (IllegalArgumentException e) {
            assertEquals(
                    "Parameter end (4) must be greater than start (9)",
                    e.getMessage());
            return;
        }

        org.junit.Assert.fail(
                "Expected IllegalArgumentException when end is less than start");
    }

    @Test
    public void testAcceptsSmallestPositiveWidthCharacterRange() {
        String result = RandomStringUtils.random(
                1, 12, 13, false, false, (char[]) null, new Random(1));

        assertNotNull(result);
        assertEquals(1, result.length());
        assertEquals((char) 12, result.charAt(0));
    }
}
