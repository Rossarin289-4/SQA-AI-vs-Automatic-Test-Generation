package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DoubleMetaphoneAI13Test {

    @Test
    public void testNullAndEmptyInput() {
        DoubleMetaphone metaphone = new DoubleMetaphone();
        assertNull(metaphone.doubleMetaphone(null));
        assertNull(metaphone.doubleMetaphone("   "));
    }

    @Test
    public void testBasicEncoding() {
        DoubleMetaphone metaphone = new DoubleMetaphone();
        assertEquals("SMTH", metaphone.doubleMetaphone("Smith"));
        assertEquals("WTR", metaphone.doubleMetaphone("Water"));
    }

    @Test
    public void testAlternateEncoding() {
        DoubleMetaphone metaphone = new DoubleMetaphone();
        assertEquals("X", metaphone.doubleMetaphone("Action", true));
        assertEquals("AKSN", metaphone.doubleMetaphone("Action", false));
    }
}
