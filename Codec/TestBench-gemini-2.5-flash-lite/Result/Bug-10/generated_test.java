package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class CaverphoneTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testNullInput() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone(null));
    }

    @Test
    public void testEmptyInput() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testRemoveNonAlpha() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("cou2f", caverphone.caverphone("cough123"));
    }

    @Test
    public void testRemoveFinalE() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("steve", caverphone.caverphone("stevee"));
    }

    @Test
    public void testStartCough() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("cou2f", caverphone.caverphone("cough"));
    }

    @Test
    public void testStartRough() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("rou2f", caverphone.caverphone("rough"));
    }

    @Test
    public void testStartTough() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("tou2f", caverphone.caverphone("tough"));
    }

    @Test
    public void testStartEnough() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("enou2f", caverphone.caverphone("enough"));
    }

    @Test
    public void testStartTrough() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("trou2f", caverphone.caverphone("trough"));
    }

    @Test
    public void testStartGn() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("2n", caverphone.caverphone("gn"));
    }

    @Test
    public void testEndMb() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("m2", caverphone.caverphone("mb"));
    }

    @Test
    public void testReplaceCq() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("2q", caverphone.caverphone("cq"));
    }

    @Test
    public void testReplaceCi() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("si", caverphone.caverphone("ci"));
    }

    @Test
    public void testReplaceCe() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("se", caverphone.caverphone("ce"));
    }

    @Test
    public void testReplaceCy() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("sy", caverphone.caverphone("cy"));
    }

    @Test
    public void testReplaceTch() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("2ch", caverphone.caverphone("tch"));
    }

    @Test
    public void testReplaceC() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("k", caverphone.caverphone("c"));
    }

    @Test
    public void testReplaceQ() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("k", caverphone.caverphone("q"));
    }

    @Test
    public void testReplaceX() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("k", caverphone.caverphone("x"));
    }

    @Test
    public void testReplaceV() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("f", caverphone.caverphone("v"));
    }

    @Test
    public void testReplaceDg() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("2g", caverphone.caverphone("dg"));
    }

    @Test
    public void testReplaceTio() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("sio", caverphone.caverphone("tio"));
    }

    @Test
    public void testReplaceTia() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("sia", caverphone.caverphone("tia"));
    }

    @Test
    public void testReplaceD() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("t", caverphone.caverphone("d"));
    }

    @Test
    public void testReplacePh() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("fh", caverphone.caverphone("ph"));
    }

    @Test
    public void testReplaceB() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("p", caverphone.caverphone("b"));
    }

    @Test
    public void testReplaceSh() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("s2", caverphone.caverphone("sh"));
    }

    @Test
    public void testReplaceZ() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("s", caverphone.caverphone("z"));
    }

    @Test
    public void testReplaceStartAeiou() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("A", caverphone.caverphone("a"));
    }

    @Test
    public void testReplaceAeiou() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("3", caverphone.caverphone("e"));
    }

    @Test
    public void testReplaceJ() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("y", caverphone.caverphone("j"));
    }

    @Test
    public void testReplaceStartY3() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("Y3", caverphone.caverphone("y3"));
    }

    @Test
    public void testReplaceStartY() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("A", caverphone.caverphone("y"));
    }

    @Test
    public void testReplaceY() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("3", caverphone.caverphone("y"));
    }

    @Test
    public void testReplace3gh3() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("3kh3", caverphone.caverphone("3gh3"));
    }

    @Test
    public void testReplaceGh() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("22", caverphone.caverphone("gh"));
    }

    @Test
    public void testReplaceG() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("k", caverphone.caverphone("g"));
    }

    @Test
    public void testReplaceSPlus() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("S", caverphone.caverphone("ssss"));
    }

    @Test
    public void testReplaceTPlus() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("T", caverphone.caverphone("tttt"));
    }

    @Test
    public void testReplacePPlus() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("P", caverphone.caverphone("pppp"));
    }

    @Test
    public void testReplaceKPlus() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("K", caverphone.caverphone("kkkk"));
    }

    @Test
    public void testReplaceFPlus() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("F", caverphone.caverphone("ffff"));
    }

    @Test
    public void testReplaceMPlus() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("M", caverphone.caverphone("mmmm"));
    }

    @Test
    public void testReplaceNPlus() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("N", caverphone.caverphone("nnnn"));
    }

    @Test
    public void testReplaceW3() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("W3", caverphone.caverphone("w3"));
    }

    @Test
    public void testReplaceWh3() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("Wh3", caverphone.caverphone("wh3"));
    }

    @Test
    public void testReplaceWEnd3() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("3", caverphone.caverphone("w"));
    }

    @Test
    public void testReplaceW() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("w"));
    }

    @Test
    public void testReplaceStartH() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("A", caverphone.caverphone("h"));
    }

    @Test
    public void testReplaceH() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("h"));
    }

    @Test
    public void testReplaceR3() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("R3", caverphone.caverphone("r3"));
    }

    @Test
    public void testReplaceREnd3() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("3", caverphone.caverphone("r"));
    }

    @Test
    public void testReplaceR() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("r"));
    }

    @Test
    public void testReplaceL3() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("L3", caverphone.caverphone("l3"));
    }

    @Test
    public void testReplaceLEnd3() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("3", caverphone.caverphone("l"));
    }

    @Test
    public void testReplaceL() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("l"));
    }

    @Test
    public void testRemove2() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("", caverphone.caverphone("2"));
    }

    @Test
    public void testRemove3EndA() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("A", caverphone.caverphone("3"));
    }

    @Test
    public void testRemove3() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("", caverphone.caverphone("3"));
    }

    @Test
    public void testAppendOnes() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone("")); // Based on the logic, this will be "1111111111"
    }

    @Test
    public void testSubstring() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("abcdefghij", caverphone.caverphone("abcdefghij"));
    }

    @Test
    public void testEncodeObjectNonNull() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("TEST", caverphone.encode("TEST"));
    }


    @Test
    public void testEncodeObjectWrongType() throws Exception {
        Caverphone caverphone = new Caverphone();
        try {
            caverphone.encode(123);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            // Expected
        }
    }

    @Test
    public void testIsCaverphoneEqualSameString() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertTrue(caverphone.isCaverphoneEqual("test", "test"));
    }

    @Test
    public void testIsCaverphoneEqualDifferentString() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertFalse(caverphone.isCaverphoneEqual("test1", "test2"));
    }
    
    @Test
    public void testLongStringTruncation() throws Exception {
        Caverphone caverphone = new Caverphone();
        // A string that will produce a caverphone code longer than 10 characters before truncation
        assertEquals("cou2f11111", caverphone.caverphone("coughextra"));
    }

    @Test
    public void testEdgeCaseNumericInput() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone("12345"));
    }

    @Test
    public void testComplexSequence() throws Exception {
        Caverphone caverphone = new Caverphone();
        // Example from a common Caverphone test case
        assertEquals("kfr3s", caverphone.caverphone("cffrey"));
    }
    
    @Test
    public void testAnotherComplexSequence() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("kh2kt", caverphone.caverphone("ghgkt"));
    }
    
    @Test
    public void testVowelStartAndEnd() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("A2t3t3A", caverphone.caverphone("aetiete"));
    }

    @Test
    public void testConsecutiveConsonants() throws Exception {
        Caverphone caverphone = new Caverphone();
        assertEquals("STPKSF", caverphone.caverphone("stpkf"));
    }
}

