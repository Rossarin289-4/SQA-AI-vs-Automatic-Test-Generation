```java
package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.io.NumberInput;

public class JsonPointerTest {
    @Test
    public void testCompileNullIsEmptyPointer() throws Exception {
        JsonPointer p = JsonPointer.compile(null);
        assertEquals("", p.toString());
        assertTrue(p.matches());
        assertNull(p.tail());
    }

    @Test
    public void testCompileEmptyIsEmptyPointer() throws Exception {
        assertEquals("", JsonPointer.compile("").toString());
    }

    @Test
    public void testCompileRejectsNonSlashInput() throws Exception {
        try { JsonPointer.compile("a"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCompileSingleSegment() throws Exception {
        JsonPointer p = JsonPointer.compile("/name");
        assertEquals("name", p.getMatchingProperty());
        assertEquals("/name", p.toString());
        assertTrue(p.matches());
    }

    @Test
    public void testCompileMultipleSegmentsAndTail() throws Exception {
        JsonPointer p = JsonPointer.compile("/a/b");
        assertEquals("a", p.getMatchingProperty());
        assertEquals("/b", p.tail().toString());
        assertEquals("b", p.tail().getMatchingProperty());
    }

    @Test
    public void testCompileEmptySegment() throws Exception {
        JsonPointer p = JsonPointer.compile("/");
        assertEquals("", p.getMatchingProperty());
        assertEquals("/", p.toString());
        assertTrue(p.matches());
    }

    @Test
    public void testCompileEscapedSlashAndTilde() throws Exception {
        JsonPointer p = JsonPointer.compile("/a~1b~0");
        assertEquals("a/b~", p.getMatchingProperty());
        assertEquals("/a~1b~0", p.toString());
    }

    @Test
    public void testCompileUnrecognizedEscapePreservesTilde() throws Exception {
        assertEquals("a~x", JsonPointer.compile("/a~x").getMatchingProperty());
    }

    @Test
    public void testValueOfAliasesCompile() throws Exception {
        assertEquals(JsonPointer.compile("/a/b"), JsonPointer.valueOf("/a/b"));
    }

    @Test
    public void testIndexZeroMatchesElement() throws Exception {
        JsonPointer p = JsonPointer.compile("/0");
        assertEquals(0, p.getMatchingIndex());
        assertTrue(p.mayMatchElement());
        assertSame(p.tail(), p.matchElement(0));
    }

    @Test
    public void testMaximumIntIndexIsAccepted() throws Exception {
        JsonPointer p = JsonPointer.compile("/2147483647");
        assertEquals(Integer.MAX_VALUE, p.getMatchingIndex());
        assertTrue(p.mayMatchElement());
    }

    @Test
    public void testFirstIndexAboveIntMaximumIsNotAnIndex() throws Exception {
        JsonPointer p = JsonPointer.compile("/2147483648");
        assertEquals(-1, p.getMatchingIndex());
        assertFalse(p.mayMatchElement());
    }

    @Test
    public void testTenDigitIndexAtIntMaximum() throws Exception {
        JsonPointer p = JsonPointer.compile("/999999999");
        assertEquals(999999999, p.getMatchingIndex());
    }

    @Test
    public void testLeadingZeroIndexParsesAsInt() throws Exception {
        assertEquals(1, JsonPointer.compile("/01").getMatchingIndex());
    }

    @Test
    public void testNegativeElementDoesNotMatch() throws Exception {
        JsonPointer p = JsonPointer.compile("/1");
        assertNull(p.matchElement(-1));
        assertSame(p.tail(), p.matchElement(1));
    }

    @Test
    public void testMatchPropertyRequiresNonterminalMatchingName() throws Exception {
        JsonPointer p = JsonPointer.compile("/a/b");
        assertSame(p.tail(), p.matchProperty("a"));
        assertNull(p.matchProperty("b"));
        assertNull(p.matchProperty("x"));
    }

    @Test
    public void testTerminalPointerDoesNotMatchProperty() throws Exception {
        assertNull(JsonPointer.compile("/a").matchProperty("a"));
    }

    @Test
    public void testMayMatchPropertyAndElementForNonNumericSegment() throws Exception {
        JsonPointer p = JsonPointer.compile("/word");
        assertTrue(p.mayMatchProperty());
        assertFalse(p.mayMatchElement());
    }

    @Test
    public void testTenCharacterNonNumericSegmentDoesNotMatchElement() throws Exception {
        assertEquals(-1, JsonPointer.compile("/123456789a").getMatchingIndex());
    }

    @Test
    public void testElevenDigitSegmentDoesNotMatchElement() throws Exception {
        assertEquals(-1, JsonPointer.compile("/12345678901").getMatchingIndex());
    }

    @Test
    public void testEqualityAndHashCodeUsePointerText() throws Exception {
        JsonPointer a = JsonPointer.compile("/a");
        JsonPointer b = JsonPointer.valueOf("/a");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testDifferentPointerTextIsNotEqual() throws Exception {
        assertFalse(JsonPointer.compile("/a").equals(JsonPointer.compile("/b")));
    }
}
```