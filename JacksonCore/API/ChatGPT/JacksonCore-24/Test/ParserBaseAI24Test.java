package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParserBaseAI24Test {

    @Test
    public void testGrowArrayByNull() {
        int[] result = ParserBase.growArrayBy(null, 5);
        assertNotNull(result);
        assertEquals(5, result.length);
    }

    @Test
    public void testGrowArrayByExisting() {
        int[] original = new int[] { 1, 2 };
        int[] result = ParserBase.growArrayBy(original, 3);
        assertNotNull(result);
        assertEquals(5, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(0, result[2]);
    }
}
