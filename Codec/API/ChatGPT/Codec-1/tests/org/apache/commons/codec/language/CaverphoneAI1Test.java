package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class CaverphoneAI1Test {

    private final Caverphone encoder = new Caverphone();

    @Test
    public void nullAndEmptyInputReturnTheSilentCode() {
        Assert.assertEquals("1111111111", encoder.caverphone(null));
        Assert.assertEquals("1111111111", encoder.caverphone(""));
    }

    @Test
    public void everyNonEmptyResultContainsExactlyTenCharacters() {
        Assert.assertEquals(10, encoder.caverphone("a").length());
        Assert.assertEquals(10, encoder.caverphone("Smith").length());
        Assert.assertEquals(10, encoder.caverphone("cough").length());
        Assert.assertEquals(10, encoder.caverphone("enough").length());
    }

    @Test
    public void inputIsCaseInsensitiveAndNonLettersAreIgnored() {
        Assert.assertEquals(encoder.caverphone("Smith"),
                encoder.caverphone("s!m-i+t+h"));
        Assert.assertEquals(encoder.caverphone("SMYTH"),
                encoder.caverphone("smyth"));
    }

    @Test
    public void initialCoughRuleIsApplied() {
        Assert.assertEquals("cf11111111", encoder.caverphone("cough"));
    }

    @Test
    public void initialEnoughRuleIsApplied() {
        Assert.assertEquals("Anf1111111", encoder.caverphone("enough"));
    }

    @Test
    public void initialGnRuleAndFinalEHandlingAreApplied() {
        Assert.assertEquals("nm11111111", encoder.caverphone("gnome"));
    }

    @Test
    public void vowelProcessingProducesTheExpectedCode() {
        Assert.assertEquals("AA11111111", encoder.caverphone("aeiou"));
    }

    @Test
    public void stringEncodeMatchesTheDedicatedMethod() {
        Assert.assertEquals(encoder.caverphone("Peter"), encoder.encode("Peter"));
    }

    @Test
    public void objectEncodeAcceptsStrings() throws EncoderException {
        Object result = encoder.encode((Object) "Peter");
        Assert.assertEquals(encoder.caverphone("Peter"), result);
    }

    @Test(expected = EncoderException.class)
    public void objectEncodeRejectsNonStrings() throws EncoderException {
        encoder.encode((Object) Integer.valueOf(42));
    }

    @Test
    public void equivalentSpellingsHaveEqualCaverphones() {
        Assert.assertTrue(encoder.isCaverphoneEqual("Smith", "SMYTH"));
        Assert.assertFalse(encoder.isCaverphoneEqual("Smith", "Jones"));
    }
}
