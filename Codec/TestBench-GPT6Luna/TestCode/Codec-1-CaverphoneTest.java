package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class CaverphoneTest {
    @Test
    public void testCaverphoneNullAndEmpty() throws Exception {
        Caverphone encoder = new Caverphone();
        assertEquals("1111111111", encoder.caverphone(null));
        assertEquals("1111111111", encoder.caverphone(""));
    }

    @Test
    public void testCaverphoneRemovesNonLettersAndFinalE() throws Exception {
        assertEquals("AP11111111", new Caverphone().caverphone("A-b!e"));
    }

    @Test
    public void testCaverphoneConvertsToEnglishLowercase() throws Exception {
        assertEquals("A111111111", new Caverphone().caverphone("A"));
    }

    @Test
    public void testCaverphoneInitialCoughRule() throws Exception {
        assertEquals("KF11111111", new Caverphone().caverphone("cough"));
    }

    @Test
    public void testCaverphoneInitialEnoughRule() throws Exception {
        assertEquals("ANF1111111", new Caverphone().caverphone("enough"));
    }

    @Test
    public void testCaverphoneInitialTroughRule() throws Exception {
        assertEquals("TRF1111111", new Caverphone().caverphone("trough"));
    }

    @Test
    public void testCaverphoneInitialGnRule() throws Exception {
        assertEquals("NM11111111", new Caverphone().caverphone("gnome"));
    }

    @Test
    public void testCaverphoneInitialMbRule() throws Exception {
        assertEquals("M111111111", new Caverphone().caverphone("mb"));
    }

    @Test
    public void testCaverphoneTenCharacterTruncation() throws Exception {
        assertEquals("STRNKT1111", new Caverphone().caverphone("strength"));
    }

    @Test
    public void testCaverphoneEncodeString() throws Exception {
        assertEquals("A111111111", new Caverphone().encode("A"));
    }

    @Test
    public void testCaverphoneEncodeObject() throws Exception {
        assertEquals("A111111111", new Caverphone().encode((Object) "A"));
    }

    @Test
    public void testCaverphoneEncodeRejectsNonString() throws Exception {
        try {
            new Caverphone().encode((Object) Integer.valueOf(1));
            fail("expected EncoderException");
        } catch (EncoderException expected) {
        }
    }

    @Test
    public void testCaverphoneEquality() throws Exception {
        Caverphone encoder = new Caverphone();
        assertTrue(encoder.isCaverphoneEqual("A", "a"));
        assertFalse(encoder.isCaverphoneEqual("A", "B"));
    }

    @Test
    public void testMetaphoneNullAndEmpty() throws Exception {
        Metaphone encoder = new Metaphone();
        assertEquals("", encoder.metaphone(null));
        assertEquals("", encoder.metaphone(""));
    }

    @Test
    public void testMetaphoneSingleCharacter() throws Exception {
        assertEquals("Q", new Metaphone().metaphone("q"));
    }

    @Test
    public void testMetaphoneInitialKn() throws Exception {
        assertEquals("N", new Metaphone().metaphone("kn"));
    }

    @Test
    public void testMetaphoneInitialWh() throws Exception {
        assertEquals("", new Metaphone().metaphone("wh"));
    }

    @Test
    public void testMetaphoneInitialX() throws Exception {
        assertEquals("X", new Metaphone().metaphone("x"));
    }

    @Test
    public void testMetaphonePhAndCodeLengthLimit() throws Exception {
        assertEquals("FN", new Metaphone().metaphone("phone"));
    }

    @Test
    public void testMetaphoneThAndTiaRules() throws Exception {
        Metaphone encoder = new Metaphone();
        assertEquals("0", encoder.metaphone("th"));
        assertEquals("X", encoder.metaphone("tia"));
    }

    @Test
    public void testMetaphoneEncodeAndEquality() throws Exception {
        Metaphone encoder = new Metaphone();
        assertEquals("SM0", encoder.encode("Smith"));
        assertTrue(encoder.isMetaphoneEqual("Smith", "Smyth"));
        assertFalse(encoder.isMetaphoneEqual("Smith", "Jones"));
    }

    @Test
    public void testMetaphoneMaxCodeLengthSetterAndBoundary() throws Exception {
        Metaphone encoder = new Metaphone();
        assertEquals(4, encoder.getMaxCodeLen());
        encoder.setMaxCodeLen(1);
        assertEquals(1, encoder.getMaxCodeLen());
        assertEquals("S", encoder.metaphone("smith"));
    }

    @Test
    public void testMetaphoneZeroMaxCodeLength() throws Exception {
        Metaphone encoder = new Metaphone();
        encoder.setMaxCodeLen(0);
        assertEquals("", encoder.metaphone("smith"));
    }
}
