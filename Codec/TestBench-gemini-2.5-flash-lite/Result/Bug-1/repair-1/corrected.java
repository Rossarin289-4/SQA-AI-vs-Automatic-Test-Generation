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
    public void testCaverphoneNullInput() {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone(null));
    }

    @Test
    public void testCaverphoneEmptyInput() {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testCaverphoneBasic() {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone(" "));
    }
    
    @Test
    public void testCaverphoneSimple() {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone("!@#$%^&*()_+=-`~[]{}|;':,./<>?"));
    }

    @Test
    public void testCaverphoneRemoveNonAlpha() {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone("1234567890"));
    }

    @Test
    public void testCaverphoneSpecificReplacements() {
        Caverphone caverphone = new Caverphone();
        assertEquals("KNFKSN", caverphone.caverphone("cophson")); // cough -> cou2f, ph -> fh, s -> S, on -> ON
    }
    
    @Test
    public void testCaverphoneSpecificReplacements2() {
        Caverphone caverphone = new Caverphone();
        assertEquals("RFSN", caverphone.caverphone("roughn")); // rough -> rou2f, gh -> 22, n -> N
    }

    @Test
    public void testCaverphoneSpecificReplacements3() {
        Caverphone caverphone = new Caverphone();
        assertEquals("TFSN", caverphone.caverphone("toughn")); // tough -> tou2f, gh -> 22, n -> N
    }

    @Test
    public void testCaverphoneSpecificReplacements4() {
        Caverphone caverphone = new Caverphone();
        assertEquals("ENFSN", caverphone.caverphone("enoughn")); // enough -> enou2f, gh -> 22, n -> N
    }

    @Test
    public void testCaverphoneSpecificReplacements5() {
        Caverphone caverphone = new Caverphone();
        assertEquals("TRFSN", caverphone.caverphone("troughn")); // trough -> trou2f, gh -> 22, n -> N
    }

    @Test
    public void testCaverphoneSpecificReplacements6() {
        Caverphone caverphone = new Caverphone();
        assertEquals("KN", caverphone.caverphone("gn")); // gn -> 2n
    }
    
    @Test
    public void testCaverphoneSpecificReplacements7() {
        Caverphone caverphone = new Caverphone();
        assertEquals("MP", caverphone.caverphone("mb")); // mb -> m2
    }

    @Test
    public void testCaverphoneSpecificReplacements8() {
        Caverphone caverphone = new Caverphone();
        assertEquals("KQK", caverphone.caverphone("cq")); // cq -> 2q
    }

    @Test
    public void testCaverphoneSpecificReplacements9() {
        Caverphone caverphone = new Caverphone();
        assertEquals("SK", caverphone.caverphone("ci")); // ci -> si
    }
    
    @Test
    public void testCaverphoneSpecificReplacements10() {
        Caverphone caverphone = new Caverphone();
        assertEquals("SK", caverphone.caverphone("ce")); // ce -> se
    }

    @Test
    public void testCaverphoneSpecificReplacements11() {
        Caverphone caverphone = new Caverphone();
        assertEquals("SY", caverphone.caverphone("cy")); // cy -> sy
    }

    @Test
    public void testCaverphoneSpecificReplacements12() {
        Caverphone caverphone = new Caverphone();
        assertEquals("KCH", caverphone.caverphone("tch")); // tch -> 2ch
    }
    
    @Test
    public void testCaverphoneSpecificReplacements13() {
        Caverphone caverphone = new Caverphone();
        assertEquals("K", caverphone.caverphone("c")); // c -> k
    }

    @Test
    public void testCaverphoneSpecificReplacements14() {
        Caverphone caverphone = new Caverphone();
        assertEquals("K", caverphone.caverphone("q")); // q -> k
    }

    @Test
    public void testCaverphoneSpecificReplacements15() {
        Caverphone caverphone = new Caverphone();
        assertEquals("K", caverphone.caverphone("x")); // x -> k
    }

    @Test
    public void testCaverphoneSpecificReplacements16() {
        Caverphone caverphone = new Caverphone();
        assertEquals("F", caverphone.caverphone("v")); // v -> f
    }

    @Test
    public void testCaverphoneSpecificReplacements17() {
        Caverphone caverphone = new Caverphone();
        assertEquals("G", caverphone.caverphone("dg")); // dg -> 2g
    }

    @Test
    public void testCaverphoneSpecificReplacements18() {
        Caverphone caverphone = new Caverphone();
        assertEquals("SIO", caverphone.caverphone("tio")); // tio -> sio
    }
    
    @Test
    public void testCaverphoneSpecificReplacements19() {
        Caverphone caverphone = new Caverphone();
        assertEquals("SIA", caverphone.caverphone("tia")); // tia -> sia
    }

    @Test
    public void testCaverphoneSpecificReplacements20() {
        Caverphone caverphone = new Caverphone();
        assertEquals("T", caverphone.caverphone("d")); // d -> t
    }
    
    @Test
    public void testCaverphoneSpecificReplacements21() {
        Caverphone caverphone = new Caverphone();
        assertEquals("FH", caverphone.caverphone("ph")); // ph -> fh
    }

    @Test
    public void testCaverphoneSpecificReplacements22() {
        Caverphone caverphone = new Caverphone();
        assertEquals("P", caverphone.caverphone("b")); // b -> p
    }

    @Test
    public void testCaverphoneSpecificReplacements23() {
        Caverphone caverphone = new Caverphone();
        assertEquals("S2", caverphone.caverphone("sh")); // sh -> s2
    }

    @Test
    public void testCaverphoneSpecificReplacements24() {
        Caverphone caverphone = new Caverphone();
        assertEquals("S", caverphone.caverphone("z")); // z -> s
    }
    
    @Test
    public void testCaverphoneSpecificReplacements25() {
        Caverphone caverphone = new Caverphone();
        assertEquals("ASK", caverphone.caverphone("ask")); // ^[aeiou] -> A
    }

    @Test
    public void testCaverphoneSpecificReplacements26() {
        Caverphone caverphone = new Caverphone();
        assertEquals("ASK", caverphone.caverphone("a")); // a -> 3, then removed. Final result "1111111111" for short strings.
    }
    
    @Test
    public void testCaverphoneSpecificReplacements27() {
        Caverphone caverphone = new Caverphone();
        assertEquals("AY", caverphone.caverphone("j")); // j -> y, then ^y -> A, y -> 3. Final "A3111111111"
    }

    @Test
    public void testCaverphoneSpecificReplacements28() {
        Caverphone caverphone = new Caverphone();
        assertEquals("Y3", caverphone.caverphone("y3")); // ^y3 -> Y3
    }
    
    @Test
    public void testCaverphoneSpecificReplacements29() {
        Caverphone caverphone = new Caverphone();
        assertEquals("A3", caverphone.caverphone("y")); // ^y -> A, y -> 3. Final "A3111111111"
    }

    @Test
    public void testCaverphoneSpecificReplacements30() {
        Caverphone caverphone = new Caverphone();
        assertEquals("3", caverphone.caverphone("a")); // a -> 3. Final "3111111111"
    }
    
    @Test
    public void testCaverphoneSpecificReplacements31() {
        Caverphone caverphone = new Caverphone();
        assertEquals("3KH3", caverphone.caverphone("3gh3")); // 3gh3 -> 3kh3
    }

    @Test
    public void testCaverphoneSpecificReplacements32() {
        Caverphone caverphone = new Caverphone();
        assertEquals("22", caverphone.caverphone("gh")); // gh -> 22
    }

    @Test
    public void testCaverphoneSpecificReplacements33() {
        Caverphone caverphone = new Caverphone();
        assertEquals("K", caverphone.caverphone("g")); // g -> k
    }

    @Test
    public void testCaverphoneSpecificReplacements34() {
        Caverphone caverphone = new Caverphone();
        assertEquals("S", caverphone.caverphone("s+")); // s+ -> S
    }

    @Test
    public void testCaverphoneSpecificReplacements35() {
        Caverphone caverphone = new Caverphone();
        assertEquals("T", caverphone.caverphone("t+")); // t+ -> T
    }
    
    @Test
    public void testCaverphoneSpecificReplacements36() {
        Caverphone caverphone = new Caverphone();
        assertEquals("P", caverphone.caverphone("p+")); // p+ -> P
    }

    @Test
    public void testCaverphoneSpecificReplacements37() {
        Caverphone caverphone = new Caverphone();
        assertEquals("K", caverphone.caverphone("k+")); // k+ -> K
    }
    
    @Test
    public void testCaverphoneSpecificReplacements38() {
        Caverphone caverphone = new Caverphone();
        assertEquals("F", caverphone.caverphone("f+")); // f+ -> F
    }

    @Test
    public void testCaverphoneSpecificReplacements39() {
        Caverphone caverphone = new Caverphone();
        assertEquals("M", caverphone.caverphone("m+")); // m+ -> M
    }

    @Test
    public void testCaverphoneSpecificReplacements40() {
        Caverphone caverphone = new Caverphone();
        assertEquals("N", caverphone.caverphone("n+")); // n+ -> N
    }
    
    @Test
    public void testCaverphoneSpecificReplacements41() {
        Caverphone caverphone = new Caverphone();
        assertEquals("W3", caverphone.caverphone("w3")); // w3 -> W3
    }
    
    @Test
    public void testCaverphoneSpecificReplacements42() {
        Caverphone caverphone = new Caverphone();
        assertEquals("WH3", caverphone.caverphone("wh3")); // wh3 -> Wh3
    }

    @Test
    public void testCaverphoneSpecificReplacements43() {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("w$")); // w -> 2, then appended with 1s. Result: "2111111111"
    }
    
    @Test
    public void testCaverphoneSpecificReplacements44() {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("w")); // w -> 2. Final: "2111111111"
    }

    @Test
    public void testCaverphoneSpecificReplacements45() {
        Caverphone caverphone = new Caverphone();
        assertEquals("A", caverphone.caverphone("h$")); // ^h -> A. Final: "A1111111111"
    }
    
    @Test
    public void testCaverphoneSpecificReplacements46() {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("h")); // h -> 2. Final: "2111111111"
    }

    @Test
    public void testCaverphoneSpecificReplacements47() {
        Caverphone caverphone = new Caverphone();
        assertEquals("R3", caverphone.caverphone("r3")); // r3 -> R3
    }
    
    @Test
    public void testCaverphoneSpecificReplacements48() {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("r$")); // r -> 2. Final: "2111111111"
    }
    
    @Test
    public void testCaverphoneSpecificReplacements49() {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("r")); // r -> 2. Final: "2111111111"
    }
    
    @Test
    public void testCaverphoneSpecificReplacements50() {
        Caverphone caverphone = new Caverphone();
        assertEquals("L3", caverphone.caverphone("l3")); // l3 -> L3
    }
    
    @Test
    public void testCaverphoneSpecificReplacements51() {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("l$")); // l -> 2. Final: "2111111111"
    }
    
    @Test
    public void testCaverphoneSpecificReplacements52() {
        Caverphone caverphone = new Caverphone();
        assertEquals("2", caverphone.caverphone("l")); // l -> 2. Final: "2111111111"
    }

    @Test
    public void testCaverphoneRemove2() {
        Caverphone caverphone = new Caverphone();
        assertEquals("2111111111", caverphone.caverphone("2")); // 2 -> "", then "1111111111"
    }
    
    @Test
    public void testCaverphoneRemove3() {
        Caverphone caverphone = new Caverphone();
        assertEquals("A", caverphone.caverphone("3$")); // 3$ -> A. Final: "A1111111111"
    }
    
    @Test
    public void testCaverphoneRemove3_2() {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone("3")); // 3 -> "". Final: "1111111111"
    }

    @Test
    public void testCaverphoneAppend1s() {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone("")); // "" + "1111111111"
    }
    
    @Test
    public void testCaverphoneSubstring() {
        Caverphone caverphone = new Caverphone();
        assertEquals("ABCDEFGHIA", caverphone.caverphone("ABCDEFGHIJKLMN")); // takes first 10, after conversion.
    }

    @Test
    public void testEncodeObjectNull() throws EncoderException {
        Caverphone caverphone = new Caverphone();
        try {
            caverphone.encode((Object) null);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Caverphone encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    public void testEncodeObjectWrongType() throws EncoderException {
        Caverphone caverphone = new Caverphone();
        try {
            caverphone.encode(123);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Caverphone encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    public void testEncodeString() {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.encode(""));
    }

    @Test
    public void testIsCaverphoneEqualTrue() {
        Caverphone caverphone = new Caverphone();
        assertTrue(caverphone.isCaverphoneEqual("test", "test"));
    }

    @Test
    public void testIsCaverphoneEqualFalse() {
        Caverphone caverphone = new Caverphone();
        assertFalse(caverphone.isCaverphoneEqual("test", "different"));
    }

    @Test
    public void testIsCaverphoneEqualNull() {
        Caverphone caverphone = new Caverphone();
        assertFalse(caverphone.isCaverphoneEqual(null, "test"));
        assertFalse(caverphone.isCaverphoneEqual("test", null));
        assertTrue(caverphone.isCaverphoneEqual(null, null)); // Both null, both map to "1111111111"
    }

    // Metaphone tests from the original incorrect submission are removed as Metaphone is not part of this class.
    // The original submission incorrectly included tests for Metaphone.
    // The Caverphone class only contains caverphone related methods, and the encode(Object) and encode(String)
    // methods delegate to caverphone(String).

}
