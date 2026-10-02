package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CaverphoneAI10Test {

    @Test
    public void testNullAndEmpty() {
        Caverphone caverphone = new Caverphone();
        assertEquals("1111111111", caverphone.caverphone(null));
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testCaverphoneStandard() {
        Caverphone caverphone = new Caverphone();
        assertEquals("A111111111", caverphone.caverphone("A"));
        assertEquals("RKA1111111", caverphone.caverphone("Rough"));
    }

    @Test
    public void testIsCaverphoneEqual() {
        Caverphone caverphone = new Caverphone();
        assertTrue(caverphone.isCaverphoneEqual("Rough", "Rough"));
    }
}
