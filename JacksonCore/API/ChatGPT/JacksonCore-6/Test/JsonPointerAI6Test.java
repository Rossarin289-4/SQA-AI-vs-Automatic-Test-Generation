package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class JsonPointerAI6Test {

    @Test
    public void testCompileEmptyAndNull() {
        assertSame(JsonPointer.EMPTY, JsonPointer.compile(null));
        assertSame(JsonPointer.EMPTY, JsonPointer.compile(""));
        assertTrue(JsonPointer.EMPTY.matches());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompileInvalidExpression() {
        JsonPointer.compile("invalid-pointer");
    }

    @Test
    public void testCompileAndMatchValidPointer() {
        JsonPointer pointer = JsonPointer.compile("/foo/0");
        assertFalse(pointer.matches());
        assertEquals("foo", pointer.getMatchingProperty());
        assertEquals(-1, pointer.getMatchingIndex());

        JsonPointer tail = pointer.tail();
        assertNotNull(tail);
        assertEquals("0", tail.getMatchingProperty());
        assertEquals(0, tail.getMatchingIndex());
        assertTrue(tail.mayMatchElement());
        
        JsonPointer next = tail.tail();
        assertSame(JsonPointer.EMPTY, next);
    }
}
