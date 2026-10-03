package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class JsonPointerAI5Test {

    @Test
    public void testCompileEmptyAndNull() {
        assertSame(JsonPointer.EMPTY, JsonPointer.compile(null));
        assertSame(JsonPointer.EMPTY, JsonPointer.compile(""));
        assertTrue(JsonPointer.EMPTY.matches());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompileInvalidNoSlash() {
        JsonPointer.compile("invalid");
    }

    @Test
    public void testValidPointerAndSegments() {
        JsonPointer ptr = JsonPointer.compile("/foo/0");
        assertFalse(ptr.matches());
        assertEquals("foo", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertFalse(ptr.mayMatchElement());

        JsonPointer tail = ptr.tail();
        assertNotNull(tail);
        assertFalse(tail.matches());
        assertEquals("0", tail.getMatchingProperty());
        assertEquals(0, tail.getMatchingIndex());
        assertTrue(tail.mayMatchElement());

        assertEquals(JsonPointer.EMPTY, tail.tail());
    }
}
