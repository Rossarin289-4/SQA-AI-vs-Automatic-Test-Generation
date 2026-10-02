package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class DoubleMetaphoneAI3Test {

    @Test
    public void testNullAndBlankInputReturnsNull() {
        DoubleMetaphone encoder = new DoubleMetaphone();

        Assert.assertNull(encoder.doubleMetaphone(null));
        Assert.assertNull(encoder.doubleMetaphone(""));
        Assert.assertNull(encoder.doubleMetaphone("   "));
    }

    @Test
    public void testInputIsTrimmedAndCaseIndependent() {
        DoubleMetaphone encoder = new DoubleMetaphone();

        Assert.assertEquals("SM0", encoder.doubleMetaphone(" smith "));
        Assert.assertEquals(encoder.doubleMetaphone("smith"),
                encoder.doubleMetaphone("SMITH"));
    }

    @Test
    public void testCommonPrimaryAndAlternateEncodings() {
        DoubleMetaphone encoder = new DoubleMetaphone();

        Assert.assertEquals("SM0", encoder.doubleMetaphone("Smith"));
        Assert.assertEquals("XMT", encoder.doubleMetaphone("Smith", true));
        Assert.assertEquals("RPRT", encoder.doubleMetaphone("Robert"));
        Assert.assertEquals("JNS", encoder.doubleMetaphone("Jones"));
        Assert.assertEquals("ANS", encoder.doubleMetaphone("Jones", true));
    }

    @Test
    public void testSilentStartingLettersAreSkipped() {
        DoubleMetaphone encoder = new DoubleMetaphone();

        Assert.assertEquals("NM", encoder.doubleMetaphone("gnome"));
        Assert.assertEquals("NM", encoder.doubleMetaphone("knome"));
        Assert.assertEquals("RST", encoder.doubleMetaphone("wrist"));
    }

    @Test
    public void testSpecialCharactersAndNonLetters() {
        DoubleMetaphone encoder = new DoubleMetaphone();

        Assert.assertEquals("FST", encoder.doubleMetaphone("façade"));
        Assert.assertEquals("NN", encoder.doubleMetaphone("niño"));
        Assert.assertEquals("", encoder.doubleMetaphone("12345"));
    }

    @Test
    public void testMaximumCodeLengthLimitsBothEncodings() {
        DoubleMetaphone encoder = new DoubleMetaphone();
        encoder.setMaxCodeLen(2);

        Assert.assertEquals(2, encoder.getMaxCodeLen());
        Assert.assertEquals("SM", encoder.doubleMetaphone("Smith"));
        Assert.assertEquals("XM", encoder.doubleMetaphone("Smith", true));

        encoder.setMaxCodeLen(0);
        Assert.assertEquals("", encoder.doubleMetaphone("Smith"));
        Assert.assertEquals("", encoder.doubleMetaphone("Smith", true));
    }

    @Test
    public void testEncodeOverloads() throws EncoderException {
        DoubleMetaphone encoder = new DoubleMetaphone();

        Assert.assertEquals("SM0", encoder.encode("Smith"));
        Assert.assertEquals("SM0", encoder.encode((Object) "Smith"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeRejectsNonStringObjects() throws EncoderException {
        new DoubleMetaphone().encode(Integer.valueOf(42));
    }

    @Test
    public void testDoubleMetaphoneEquality() {
        DoubleMetaphone encoder = new DoubleMetaphone();

        Assert.assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "SMITH"));
        Assert.assertFalse(encoder.isDoubleMetaphoneEqual("Smith", "Jones"));
        Assert.assertTrue(encoder.isDoubleMetaphoneEqual("Smith", "Smith", true));
    }

    @Test
    public void testResultStorageAndCompletion() {
        DoubleMetaphone encoder = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult result =
                encoder.new DoubleMetaphoneResult(3);

        result.append("ABCD");
        Assert.assertEquals("ABC", result.getPrimary());
        Assert.assertEquals("ABC", result.getAlternate());
        Assert.assertTrue(result.isComplete());

        result.append('X', 'Y');
        Assert.assertEquals("ABC", result.getPrimary());
        Assert.assertEquals("ABC", result.getAlternate());
    }

    @Test
    public void testCharacterAndContainsBoundaryHelpers() {
        DoubleMetaphone encoder = new DoubleMetaphone();

        Assert.assertEquals('A', encoder.charAt("ABC", 0));
        Assert.assertEquals(Character.MIN_VALUE, encoder.charAt("ABC", -1));
        Assert.assertEquals(Character.MIN_VALUE, encoder.charAt("ABC", 3));

        Assert.assertTrue(DoubleMetaphone.contains("ABCDE", 1, 3,
                new String[] { "BCD" }));
        Assert.assertFalse(DoubleMetaphone.contains("ABCDE", -1, 2,
                new String[] { "AB" }));
        Assert.assertFalse(DoubleMetaphone.contains("ABCDE", 4, 2,
                new String[] { "E" }));
    }
}
