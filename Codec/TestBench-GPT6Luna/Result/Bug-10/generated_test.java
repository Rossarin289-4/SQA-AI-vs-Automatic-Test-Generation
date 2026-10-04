package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class CaverphoneTest {
    @Test
    public void testNullInput() throws Exception {
        assertEquals("1111111111", new Caverphone().caverphone(null));
    }

    @Test
    public void testEmptyInput() throws Exception {
        assertEquals("1111111111", new Caverphone().caverphone(""));
    }

    @Test
    public void testNonLettersAreRemovedAndCaseIgnored() throws Exception {
        Caverphone encoder = new Caverphone();
        assertEquals(encoder.caverphone("Smith"), encoder.caverphone("S-m!i t h"));
    }

    @Test
    public void testFinalEIsRemoved() throws Exception {
        assertEquals("KK11111111", new Caverphone().caverphone("cake"));
    }

    @Test
    public void testStartingCoughReplacement() throws Exception {
        assertEquals("KF11111111", new Caverphone().caverphone("cough"));
    }

    @Test
    public void testStartingRoughReplacement() throws Exception {
        assertEquals("RF11111111", new Caverphone().caverphone("rough"));
    }

    @Test
    public void testStartingToughReplacement() throws Exception {
        assertEquals("TF11111111", new Caverphone().caverphone("tough"));
    }

    @Test
    public void testStartingEnoughReplacement() throws Exception {
        assertEquals("ANF1111111", new Caverphone().caverphone("enough"));
    }

    @Test
    public void testStartingTroughReplacement() throws Exception {
        assertEquals("TRF1111111", new Caverphone().caverphone("trough"));
    }

    @Test
    public void testStartingGnReplacement() throws Exception {
        assertEquals("N111111111", new Caverphone().caverphone("gn"));
    }

    @Test
    public void testFinalMbReplacement() throws Exception {
        assertEquals("M111111111", new Caverphone().caverphone("mb"));
    }

    @Test
    public void testCqReplacement() throws Exception {
        assertEquals("K111111111", new Caverphone().caverphone("cq"));
    }

    @Test
    public void testTchReplacement() throws Exception {
        assertEquals("K111111111", new Caverphone().caverphone("tch"));
    }

    @Test
    public void testInitialVowelAndVowelRemoval() throws Exception {
        assertEquals("A111111111", new Caverphone().caverphone("a"));
    }

    @Test
    public void testRepeatedConsonantsCollapse() throws Exception {
        assertEquals("S111111111", new Caverphone().caverphone("ssss"));
    }

    @Test
    public void testWAtEndReplacement() throws Exception {
        assertEquals("A111111111", new Caverphone().caverphone("w"));
    }

    @Test
    public void testRAtEndReplacement() throws Exception {
        assertEquals("A111111111", new Caverphone().caverphone("r"));
    }

    @Test
    public void testLAtEndReplacement() throws Exception {
        assertEquals("A111111111", new Caverphone().caverphone("l"));
    }

    @Test
    public void testTenCharacterCodeTruncation() throws Exception {
        assertEquals(10, new Caverphone().caverphone("abcdefghijkl").length());
    }

    @Test
    public void testEncodeStringOverload() throws Exception {
        assertEquals("KK11111111", new Caverphone().encode("cake"));
    }

    @Test
    public void testEncodeObjectString() throws Exception {
        assertEquals("KK11111111", new Caverphone().encode((Object) "cake"));
    }

    @Test
    public void testEncodeObjectRejectsNonString() throws Exception {
        try {
            new Caverphone().encode((Object) Integer.valueOf(1));
            fail("expected EncoderException");
        } catch (EncoderException expected) {
        }
    }

    @Test
    public void testEncodeObjectRejectsNull() throws Exception {
        try {
            new Caverphone().encode((Object) null);
            fail("expected EncoderException");
        } catch (EncoderException expected) {
        }
    }

    @Test
    public void testCaverphoneEqualityForEquivalentInputs() throws Exception {
        assertTrue(new Caverphone().isCaverphoneEqual("Smith", "SMITH"));
    }

    @Test
    public void testCaverphoneEqualityForDifferentCodes() throws Exception {
        assertFalse(new Caverphone().isCaverphoneEqual("a", "b"));
    }
}
