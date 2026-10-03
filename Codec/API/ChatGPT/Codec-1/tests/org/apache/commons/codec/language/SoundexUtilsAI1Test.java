package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.junit.Assert;
import org.junit.Test;

public class SoundexUtilsAI1Test {

    @Test
    public void cleanReturnsNullForNullInput() {
        Assert.assertNull(SoundexUtils.clean(null));
    }

    @Test
    public void cleanReturnsEmptyStringForEmptyInput() {
        Assert.assertEquals("", SoundexUtils.clean(""));
    }

    @Test
    public void cleanUppercasesStringsContainingOnlyLetters() {
        Assert.assertEquals("ABCXYZ", SoundexUtils.clean("abcXYZ"));
    }

    @Test
    public void cleanRemovesNonLettersAndUppercasesRemainingLetters() {
        Assert.assertEquals("ABCD", SoundexUtils.clean(" a-b2.C!d "));
    }

    @Test
    public void cleanHandlesStringContainingNoLetters() {
        Assert.assertEquals("", SoundexUtils.clean("123-!?"));
    }

    @Test
    public void differenceEncodedReturnsZeroWhenEitherEncodingIsNull() {
        Assert.assertEquals(0, SoundexUtils.differenceEncoded(null, "A123"));
        Assert.assertEquals(0, SoundexUtils.differenceEncoded("A123", null));
        Assert.assertEquals(0, SoundexUtils.differenceEncoded(null, null));
    }

    @Test
    public void differenceEncodedCountsMatchingPositionsOnly() {
        Assert.assertEquals(2, SoundexUtils.differenceEncoded("ABC", "AXC"));
        Assert.assertEquals(1, SoundexUtils.differenceEncoded("ABC", "CBA"));
    }

    @Test
    public void differenceEncodedStopsAtShorterEncoding() {
        Assert.assertEquals(3, SoundexUtils.differenceEncoded("ABCD", "ABCEF"));
        Assert.assertEquals(0, SoundexUtils.differenceEncoded("", "ABC"));
    }

    @Test
    public void differenceUsesEncodedSoundexValues() throws EncoderException {
        StringEncoder encoder = new Soundex();
        Assert.assertEquals(4, SoundexUtils.difference(encoder, "Robert", "Rupert"));
    }

    @Test
    public void differenceCountsMatchingPositionsForDifferentNames() throws EncoderException {
        StringEncoder encoder = new Soundex();
        Assert.assertEquals(1, SoundexUtils.difference(encoder, "Robert", "Ashcraft"));
    }

    @Test
    public void differenceReturnsFullLengthForIdenticalInput() throws EncoderException {
        StringEncoder encoder = new Soundex();
        Assert.assertEquals(4, SoundexUtils.difference(encoder, "Washington", "Washington"));
    }
}
