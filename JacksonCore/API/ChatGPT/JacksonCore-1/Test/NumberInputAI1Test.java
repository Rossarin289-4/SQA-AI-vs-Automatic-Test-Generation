package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberInputAI1Test {

    @Test
    public void testParseIntString() {
        assertEquals(123, NumberInput.parseInt("123"));
        assertEquals(-456, NumberInput.parseInt("-456"));
    }

    @Test
    public void testParseDoubleNastySmall() {
        double val = NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE);
        assertEquals(Double.MIN_VALUE, val, 0.0);
    }

    @Test
    public void testParseAsIntDefaults() {
        assertEquals(42, NumberInput.parseAsInt(null, 42));
        assertEquals(100, NumberInput.parseAsInt("invalid", 100));
        assertEquals(123, NumberInput.parseAsInt("123", 42));
    }
}
