package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class SoundexTest {
    @Test
    public void testSoundexNull() throws Exception {
        assertEquals(null, new Soundex().soundex(null));
    }

    @Test
    public void testSoundexEmpty() throws Exception {
        assertEquals("", new Soundex().soundex(""));
    }

    @Test
    public void testSoundexOneLetter() throws Exception {
        assertEquals("A000", new Soundex().soundex("A"));
    }

    @Test
    public void testSoundexPadsCode() throws Exception {
        assertEquals("R163", new Soundex().soundex("Robert"));
    }

    @Test
    public void testSoundexIgnoresRepeatedMappedCode() throws Exception {
        assertEquals("B000", new Soundex().soundex("Bbb"));
    }

    @Test
    public void testSoundexZeroCodeSeparatesRepeatedCode() throws Exception {
        assertEquals("B100", new Soundex().soundex("Bab"));
    }

    @Test
    public void testSoundexIgnoresHBetweenSameGroups() throws Exception {
        assertEquals("B000", new Soundex().soundex("Bhb"));
    }

    @Test
    public void testSoundexIgnoresWBetweenSameGroups() throws Exception {
        assertEquals("B000", new Soundex().soundex("Bwb"));
    }

    @Test
    public void testSoundexDoesNotIgnoreHAfterDifferentGroup() throws Exception {
        assertEquals("B300", new Soundex().soundex("Bhd"));
    }

    @Test
    public void testSoundexStopsAtFourCharacters() throws Exception {
        assertEquals("B231", new Soundex().soundex("Bcdfl"));
    }

    @Test
    public void testSoundexCleansPunctuationAndCase() throws Exception {
        assertEquals("R163", new Soundex().soundex("r-obert"));
    }

    @Test
    public void testSoundexRejectsUnmappedLetter() throws Exception {
        try {
            new Soundex(new char[] {'1'}).soundex("B");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testEncodeObjectString() throws Exception {
        assertEquals("R163", new Soundex().encode((Object) "Robert"));
    }

    @Test
    public void testEncodeObjectRejectsNonString() throws Exception {
        try {
            new Soundex().encode((Object) Integer.valueOf(1));
            fail("expected EncoderException");
        } catch (EncoderException expected) {
        }
    }

    @Test
    public void testEncodeObjectRejectsNull() throws Exception {
        try {
            new Soundex().encode((Object) null);
            fail("expected EncoderException");
        } catch (EncoderException expected) {
        }
    }

    @Test
    public void testDifferenceIdenticalCodes() throws Exception {
        assertEquals(4, new Soundex().difference("Robert", "Rupert"));
    }

    @Test
    public void testDifferenceNoMatchingCodeCharacters() throws Exception {
        assertEquals(3, new Soundex().difference("A", "B"));
    }

    @Test
    public void testDifferencePartialMatch() throws Exception {
        assertEquals(2, new Soundex().difference("Bcd", "Bef"));
    }

    @Test
    public void testMaxLengthDefault() throws Exception {
        assertEquals(4, new Soundex().getMaxLength());
    }

    @Test
    public void testSetMaxLengthZero() throws Exception {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(0);
        assertEquals(0, soundex.getMaxLength());
    }

    @Test
    public void testSetMaxLengthDoesNotChangeEncoding() throws Exception {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(1);
        assertEquals("R163", soundex.soundex("Robert"));
    }

    @Test
    public void testCustomStringMapping() throws Exception {
        Soundex soundex = new Soundex("00000000000000000000000000");
        assertEquals("A000", soundex.soundex("AB"));
    }
}
