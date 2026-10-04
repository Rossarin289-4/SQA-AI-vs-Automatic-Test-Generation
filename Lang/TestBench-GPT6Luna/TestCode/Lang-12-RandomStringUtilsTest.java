package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class RandomStringUtilsTest {
    @Test
    public void testRandomZeroLength() throws Exception {
        assertEquals("", RandomStringUtils.random(0));
    }

    @Test
    public void testRandomNegativeLength() throws Exception {
        try { RandomStringUtils.random(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRandomLengthOne() throws Exception {
        assertEquals(1, RandomStringUtils.random(1).length());
    }

    @Test
    public void testRandomAsciiZeroLength() throws Exception {
        assertEquals("", RandomStringUtils.randomAscii(0));
    }

    @Test
    public void testRandomAsciiNegativeLength() throws Exception {
        try { RandomStringUtils.randomAscii(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRandomAsciiCharactersArePrintable() throws Exception {
        String value = RandomStringUtils.randomAscii(24);
        assertEquals(24, value.length());
        for (int i = 0; i < value.length(); i++) {
            assertTrue(value.charAt(i) >= 32 && value.charAt(i) <= 126);
        }
    }

    @Test
    public void testRandomAlphabeticZeroLength() throws Exception {
        assertEquals("", RandomStringUtils.randomAlphabetic(0));
    }

    @Test
    public void testRandomAlphabeticNegativeLength() throws Exception {
        try { RandomStringUtils.randomAlphabetic(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRandomAlphabeticCharactersAreLetters() throws Exception {
        String value = RandomStringUtils.randomAlphabetic(24);
        assertEquals(24, value.length());
        for (int i = 0; i < value.length(); i++) {
            assertTrue(Character.isLetter(value.charAt(i)));
        }
    }

    @Test
    public void testRandomAlphanumericZeroLength() throws Exception {
        assertEquals("", RandomStringUtils.randomAlphanumeric(0));
    }

    @Test
    public void testRandomAlphanumericNegativeLength() throws Exception {
        try { RandomStringUtils.randomAlphanumeric(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRandomAlphanumericCharactersAreLettersOrDigits() throws Exception {
        String value = RandomStringUtils.randomAlphanumeric(24);
        assertEquals(24, value.length());
        for (int i = 0; i < value.length(); i++) {
            assertTrue(Character.isLetterOrDigit(value.charAt(i)));
        }
    }

    @Test
    public void testRandomNumericZeroLength() throws Exception {
        assertEquals("", RandomStringUtils.randomNumeric(0));
    }

    @Test
    public void testRandomNumericNegativeLength() throws Exception {
        try { RandomStringUtils.randomNumeric(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRandomNumericCharactersAreDigits() throws Exception {
        String value = RandomStringUtils.randomNumeric(24);
        assertEquals(24, value.length());
        for (int i = 0; i < value.length(); i++) {
            assertTrue(Character.isDigit(value.charAt(i)));
        }
    }

    @Test
    public void testSeededRandomWithSingleAllowedCharacter() throws Exception {
        String value = RandomStringUtils.random(24, 0, 1, false, false,
                new char[] {'x'}, new Random(1));
        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxx", value);
    }
}
