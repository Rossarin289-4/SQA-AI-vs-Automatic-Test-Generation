package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class MetaphoneAI1Test {

    @Test
    public void testEmptyNullAndSingleCharacterInputs() {
        Metaphone metaphone = new Metaphone();

        Assert.assertEquals("", metaphone.metaphone(null));
        Assert.assertEquals("", metaphone.metaphone(""));
        Assert.assertEquals("A", metaphone.metaphone("a"));
        Assert.assertEquals("X", metaphone.metaphone("x"));
    }

    @Test
    public void testInitialLetterRules() {
        Metaphone metaphone = new Metaphone();

        Assert.assertEquals("NM", metaphone.metaphone("gnome"));
        Assert.assertEquals("NT", metaphone.metaphone("knight"));
        Assert.assertEquals("RT", metaphone.metaphone("wright"));
        Assert.assertEquals("SFR", metaphone.metaphone("xavier"));
        Assert.assertEquals("ON", metaphone.metaphone("one"));
    }

    @Test
    public void testConsonantTransformations() {
        Metaphone metaphone = new Metaphone();

        Assert.assertEquals("FN", metaphone.metaphone("phone"));
        Assert.assertEquals("TM", metaphone.metaphone("dumb"));
        Assert.assertEquals("KS", metaphone.metaphone("quiz"));
        Assert.assertEquals("KT", metaphone.metaphone("chad"));
        Assert.assertEquals("SKMT", metaphone.metaphone("schmidt"));
    }

    @Test
    public void testSpecialCAndDPatterns() {
        Metaphone metaphone = new Metaphone();

        Assert.assertEquals("X", metaphone.metaphone("cia"));
        Assert.assertEquals("SNK", metaphone.metaphone("scenic"));
        Assert.assertEquals("EJ", metaphone.metaphone("edge"));
        Assert.assertEquals("BJ", metaphone.metaphone("badge"));
    }

    @Test
    public void testSpecialSAndTPatterns() {
        Metaphone metaphone = new Metaphone();

        Assert.assertEquals("AX", metaphone.metaphone("asia"));
        Assert.assertEquals("FXN", metaphone.metaphone("vision"));
        Assert.assertEquals("NXN", metaphone.metaphone("nation"));
        Assert.assertEquals("MX", metaphone.metaphone("match"));
        Assert.assertEquals("0NK", metaphone.metaphone("think"));
    }

    @Test
    public void testMaximumCodeLengthIsApplied() {
        Metaphone metaphone = new Metaphone();

        Assert.assertEquals(4, metaphone.getMaxCodeLen());
        Assert.assertEquals("SLFN", metaphone.metaphone("xylophone"));

        metaphone.setMaxCodeLen(2);
        Assert.assertEquals(2, metaphone.getMaxCodeLen());
        Assert.assertEquals("SL", metaphone.metaphone("xylophone"));
    }

    @Test
    public void testZeroMaximumCodeLengthProducesEmptyCode() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(0);

        Assert.assertEquals("", metaphone.metaphone("smith"));
        Assert.assertEquals("", metaphone.encode("anything"));
    }

    @Test
    public void testStringEncodingAndMetaphoneEquality() throws EncoderException {
        Metaphone metaphone = new Metaphone();

        Assert.assertEquals("SM0", metaphone.encode("smith"));
        Assert.assertEquals("SM0", metaphone.encode((Object) "smyth"));
        Assert.assertTrue(metaphone.isMetaphoneEqual("smith", "smyth"));
        Assert.assertFalse(metaphone.isMetaphoneEqual("smith", "jones"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodingNonStringThrowsEncoderException() throws EncoderException {
        Metaphone metaphone = new Metaphone();

        metaphone.encode(Integer.valueOf(42));
    }
}
