package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class SoundexTest {
    @Test
    public void testSoundexOfNull() throws Exception {
        Soundex soundex = new Soundex();
        assertNull(soundex.soundex(null));
    }

    @Test
    public void testSoundexOfEmptyString() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("", soundex.soundex(""));
    }

    @Test
    public void testSoundexOfAshcraft() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("A261", soundex.soundex("Ashcraft"));
    }

    @Test
    public void testSoundexOfRobert() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("R163", soundex.soundex("Robert"));
    }

    @Test
    public void testSoundexOfRupert() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("R163", soundex.soundex("Rupert"));
    }

    @Test
    public void testSoundexOfAshcraftWithDifferentMapping() throws Exception {
        char[] mapping = "01230120022455012623010202".toCharArray();
        Soundex soundex = new Soundex(mapping);
        assertEquals("A261", soundex.soundex("Ashcraft"));
    }

    @Test
    public void testSoundexOfNullWithCustomMapping() throws Exception {
        char[] mapping = "01230120022455012623010202".toCharArray();
        Soundex soundex = new Soundex(mapping);
        assertNull(soundex.soundex(null));
    }

    @Test
    public void testSoundexOfEmptyStringWithCustomMapping() throws Exception {
        char[] mapping = "01230120022455012623010202".toCharArray();
        Soundex soundex = new Soundex(mapping);
        assertEquals("", soundex.soundex(""));
    }

    @Test
    public void testSoundexOfPhone() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("P100", soundex.soundex("Phone"));
    }

    @Test
    public void testSoundexOfExample() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("E251", soundex.soundex("Example"));
    }

    @Test
    public void testSoundexOfKnuth() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("K530", soundex.soundex("Knuth"));
    }

    @Test
    public void testSoundexOfLloyd() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("L300", soundex.soundex("Lloyd"));
    }

    @Test
    public void testSoundexOfLukasiewicz() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("L222", soundex.soundex("Lukasiewicz"));
    }

    @Test
    public void testSoundexOfWheaton() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("W350", soundex.soundex("Wheaton"));
    }

    @Test
    public void testSoundexOfTymczak() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("T522", soundex.soundex("Tymczak"));
    }

    @Test
    public void testSoundexOfPfister() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("P236", soundex.soundex("Pfister"));
    }

    @Test
    public void testSoundexOfHoneyman() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("H555", soundex.soundex("Honeyman"));
    }

    @Test
    public void testSoundexWithRepeatedLetters() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("A200", soundex.soundex("A"));
        assertEquals("A200", soundex.soundex("Aa"));
        assertEquals("A200", soundex.soundex("Aaa"));
    }

    @Test
    public void testSoundexWithHAndW() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("A261", soundex.soundex("Ashcraft")); // A, S=2, C=2(skip-adjacent), R=6, F=1, T=0 -> A261
        assertEquals("A261", soundex.soundex("AshCWraft")); // A, S=2, C=2(skip-HW), R=6, F=1, T=0 -> A261
        assertEquals("A261", soundex.soundex("AshHWraft")); // A, S=2, C=2(skip-HW), R=6, F=1, T=0 -> A261
    }

    @Test
    public void testSoundexWithNonAlphabeticChars() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("R163", soundex.soundex("Robert-"));
        assertEquals("R163", soundex.soundex("Ro.bert"));
        assertEquals("R163", soundex.soundex(" R o b e r t "));
    }

    @Test
    public void testSoundexWithAccentedChars() throws Exception {
        // Soundex is designed for US English. Accented chars are treated as not mapped.
        Soundex soundex = new Soundex();
        try {
            soundex.soundex("Müller");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSoundexWithMappingString() throws Exception {
        Soundex soundex = new Soundex("01230120022455012623010202");
        assertEquals("A261", soundex.soundex("Ashcraft"));
    }

    @Test
    public void testSoundexWithEmptyMappingString() throws Exception {
        Soundex soundex = new Soundex("");
        try {
            soundex.soundex("test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testEncodeObject() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("R163", soundex.encode("Robert"));
    }

    @Test
    public void testEncodeNonStringObject() throws Exception {
        Soundex soundex = new Soundex();
        try {
            soundex.encode(Integer.valueOf(123));
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            // Expected
        }
    }

    @Test
    public void testDifferenceBasic() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals(4, soundex.difference("Robert", "Rupert"));
    }

    @Test
    public void testDifferenceNoMatch() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals(0, soundex.difference("abc", "def"));
    }

    @Test
    public void testDifferenceOneStringNull() throws Exception {
        Soundex soundex = new Soundex();
        try {
            soundex.difference(null, "test");
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            // Expected
        }
    }

    @Test
    public void testDifferenceBothStringsNull() throws Exception {
        Soundex soundex = new Soundex();
        try {
            soundex.difference(null, null);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            // Expected
        }
    }
}
