package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class SoundexAI15Test {

    @Test
    public void testSoundexBasicAndNull() {
        Soundex soundex = new Soundex();
        assertNull(soundex.soundex(null));
        assertEquals("", soundex.soundex(""));
        assertEquals("T600", soundex.soundex("Test"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSoundexInvalidCharacter() {
        Soundex soundex = new Soundex();
        soundex.soundex("T@st");
    }

    @Test
    public void testEncodeObject() throws EncoderException {
        Soundex soundex = new Soundex();
        assertEquals("T600", soundex.encode("Test"));
    }
}
