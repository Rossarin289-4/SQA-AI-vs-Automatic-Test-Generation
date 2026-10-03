package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@link Soundex}.
 */
public class SoundexAI15Test {

    @Test
    public void testSoundexBasic() {
        Soundex soundex = new Soundex();
        Assert.assertEquals("A000", soundex.soundex("A"));
        Assert.assertEquals("A416", soundex.soundex("Albert"));
        Assert.assertEquals("R163", soundex.soundex("Robert"));
        Assert.assertEquals("R163", soundex.soundex("Rupert"));
        Assert.assertEquals("A261", soundex.soundex("Ashcraft"));
        Assert.assertEquals("A261", soundex.soundex("Ashcroft"));
    }

    @Test
    public void testSoundexNullAndEmpty() {
        Soundex soundex = new Soundex();
        Assert.assertNull(soundex.soundex(null));
        Assert.assertEquals("", soundex.soundex(""));
        Assert.assertEquals("", soundex.soundex("   "));
        Assert.assertEquals("", soundex.soundex("1234#$!"));
    }

    @Test
    public void testSoundexHAndWRule() {
        Soundex soundex = Soundex.US_ENGLISH;
        // B (1), P (1) separated by H or W should be treated as one code group
        // "Ashcraft": A (0), s (2), h (ignored), c (2) -> c ignored because adjacent to s via h
        Assert.assertEquals("A261", soundex.soundex("Ashcraft"));
        // H and W separating same code group
        Assert.assertEquals("B200", soundex.soundex("Bxh"));
        Assert.assertEquals("B200", soundex.soundex("Bxw"));
        Assert.assertEquals("B200", soundex.soundex("Bxwh"));
        Assert.assertEquals("B200", soundex.soundex("Bxwhz"));
    }

    @Test
    public void testEncodeObject() throws EncoderException {
        Soundex soundex = new Soundex();
        Object result = soundex.encode((Object) "Smith");
        Assert.assertEquals("S530", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeNonStringThrowsException() throws EncoderException {
        Soundex soundex = new Soundex();
        soundex.encode(Integer.valueOf(42));
    }

    @Test
    public void testEncodeString() {
        Soundex soundex = new Soundex();
        Assert.assertEquals("W252", soundex.encode("Washington"));
        Assert.assertEquals("L000", soundex.encode("Lee"));
        Assert.assertEquals("J250", soundex.encode("Jackson"));
    }

    @Test
    public void testDifference() throws EncoderException {
        Soundex soundex = new Soundex();
        Assert.assertEquals(4, soundex.difference("Smith", "Smythe"));
        Assert.assertEquals(4, soundex.difference("Albert", "Albert"));
        Assert.assertEquals(0, soundex.difference("Smith", ""));
        Assert.assertTrue(soundex.difference("Smith", "Jones") < 4);
    }

    @Test
    public void testCustomMappingConstructorArray() {
        // Custom 26-character mapping reversing digits '1'..'6' to '6'..'1'
        char[] customMap = "06540650055322065154060505".toCharArray();
        Soundex soundex = new Soundex(customMap);
        Assert.assertNotNull(soundex.soundex("Testing"));
    }

    @Test
    public void testCustomMappingConstructorString() {
        Soundex soundex = new Soundex(Soundex.US_ENGLISH_MAPPING_STRING);
        Assert.assertEquals("S530", soundex.soundex("Smith"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmappedCharacterThrowsException() {
        // Custom short mapping table that does not cover all 26 letters
        Soundex soundex = new Soundex("0123");
        // 'Z' will exceed bounds of mapping table
        soundex.soundex("Zebra");
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGetSetMaxLength() {
        Soundex soundex = new Soundex();
        Assert.assertEquals(4, soundex.getMaxLength());
        soundex.setMaxLength(6);
        Assert.assertEquals(6, soundex.getMaxLength());
    }
}
