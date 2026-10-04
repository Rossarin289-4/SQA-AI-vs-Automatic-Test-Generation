package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.io.NumberInput;

public class JsonPointerTest {
    @Test
    public void testCompileEmptyString() throws Exception {
        JsonPointer ptr = JsonPointer.compile("");
        assertEquals("", ptr.toString());
        assertFalse(ptr.matches()); // EMPTY is not considered a match
        assertEquals("", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileNull() throws Exception {
        JsonPointer ptr = JsonPointer.compile(null);
        assertEquals("", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileRoot() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/");
        assertEquals("/", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileSingleProperty() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo");
        assertEquals("/foo", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("foo", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
    }

    @Test
    public void testCompileSingleElementIndex() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/0");
        assertEquals("/0", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("0", ptr.getMatchingProperty());
        assertEquals(0, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertTrue(ptr.mayMatchElement());
    }

    @Test
    public void testCompileMultipleSegments() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/bar/0/baz");
        assertEquals("/foo/bar/0/baz", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("foo", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileMultipleSegmentsWithTail() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/bar/0/baz");
        JsonPointer tail = ptr.tail();
        assertNotNull(tail);
        assertEquals("/bar/0/baz", tail.toString());
        assertEquals("bar", tail.getMatchingProperty());
        assertEquals(-1, tail.getMatchingIndex());
    }

    @Test
    public void testCompileEscapedTilde() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo~1bar"); // ~1 should be /
        assertEquals("/foo~1bar", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("foo/bar", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileEscapedTildeOnly() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/~0"); // ~0 should be ~
        assertEquals("/~0", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("~", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileEscapedBoth() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a~1b~0c");
        assertEquals("/a~1b~0c", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("a/b~c", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileComplexEscaping() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a~0~0b~1b~0c");
        assertEquals("/a~0~0b~1b~0c", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("a~~b/b~c", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileWithLongIndex() throws Exception {
        // Max int value is 2147483647. 10 chars is the max length for parsing as int.
        JsonPointer ptr = JsonPointer.compile("/1234567890");
        assertEquals("/1234567890", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("1234567890", ptr.getMatchingProperty());
        assertEquals(1234567890, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileIndexExceedingIntMax() throws Exception {
        // Test case for index that exceeds Integer.MAX_VALUE but is <= Long.MAX_VALUE
        // The _parseIndex method checks length > 10 and then NumberInput.parseLong
        // which will handle large numbers up to Long.MAX_VALUE.
        // If it exceeds Integer.MAX_VALUE, it should return -1.
        JsonPointer ptr = JsonPointer.compile("/2147483648");
        assertEquals("/2147483648", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("2147483648", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex()); // Exceeds Integer.MAX_VALUE, so treated as not an index.
    }
    
    @Test
    public void testCompileIndexTooLong() throws Exception {
        // Test case for index that is too long to be an int, even if value fits
        // _parseIndex checks length > 10, and returns -1.
        JsonPointer ptr = JsonPointer.compile("/10000000000");
        assertEquals("/10000000000", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("10000000000", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex()); // Length > 10.
    }

    @Test
    public void testCompileEmptySegmentAfterSlash() throws Exception {
        JsonPointer ptr = JsonPointer.compile("//");
        assertEquals("//", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileEmptySegmentWithTail() throws Exception {
        JsonPointer ptr = JsonPointer.compile("//");
        JsonPointer tail = ptr.tail();
        assertNotNull(tail);
        assertEquals("/", tail.toString());
        assertEquals("", tail.getMatchingProperty());
        assertEquals(-1, tail.getMatchingIndex());
    }

    @Test
    public void testCompileTrailingSlash() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a/");
        assertEquals("/a/", ptr.toString());
        assertFalse(ptr.matches());
        assertEquals("a", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testCompileTrailingSlashWithTail() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a/");
        JsonPointer tail = ptr.tail();
        assertNotNull(tail);
        assertEquals("/", tail.toString());
        assertEquals("", tail.getMatchingProperty());
        assertEquals(-1, tail.getMatchingIndex());
    }

    @Test
    public void testValueOfAlias() throws Exception {
        JsonPointer ptr1 = JsonPointer.compile("/test");
        JsonPointer ptr2 = JsonPointer.valueOf("/test");
        assertEquals(ptr1, ptr2);
        assertEquals(ptr1.hashCode(), ptr2.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a/b/0");
        assertEquals("/a/b/0", ptr.toString());
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a");
        assertTrue(ptr.equals(ptr));
    }

    @Test
    public void testEqualsNull() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a");
        assertFalse(ptr.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a");
        assertFalse(ptr.equals(new Object()));
    }

    @Test
    public void testEqualsSameString() throws Exception {
        JsonPointer ptr1 = JsonPointer.compile("/a/b");
        JsonPointer ptr2 = JsonPointer.compile("/a/b");
        assertEquals(ptr1, ptr2);
        assertEquals(ptr1.hashCode(), ptr2.hashCode());
    }

    @Test
    public void testEqualsDifferentString() throws Exception {
        JsonPointer ptr1 = JsonPointer.compile("/a/b");
        JsonPointer ptr2 = JsonPointer.compile("/a/c");
        assertFalse(ptr1.equals(ptr2));
        assertNotEquals(ptr1.hashCode(), ptr2.hashCode());
    }

    @Test
    public void testHashCode() throws Exception {
        JsonPointer ptr1 = JsonPointer.compile("/a/b");
        JsonPointer ptr2 = JsonPointer.compile("/a/b");
        assertEquals(ptr1.hashCode(), ptr2.hashCode());
    }

    @Test
    public void testMatchPropertySuccess() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/bar");
        JsonPointer next = ptr.matchProperty("foo");
        assertNotNull(next);
        assertEquals("/bar", next.toString());
    }

    @Test
    public void testMatchPropertyFailureWrongName() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/bar");
        assertNull(ptr.matchProperty("baz"));
    }

    @Test
    public void testMatchPropertyFailureOnMatch() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo"); // Matches property
        assertNull(ptr.matchProperty("foo")); // Should return null because no _nextSegment
    }

    @Test
    public void testMatchElementSuccess() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/1/baz");
        JsonPointer next = ptr.matchElement(1);
        assertNotNull(next);
        assertEquals("/baz", next.toString());
    }

    @Test
    public void testMatchElementFailureWrongIndex() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/1/baz");
        assertNull(ptr.matchElement(2));
    }

    @Test
    public void testMatchElementFailureOnMatch() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/1"); // Matches element 1
        assertNull(ptr.matchElement(1)); // Should return null because no _nextSegment
    }

    @Test
    public void testMatchElementFailureNegativeIndex() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/1/baz");
        assertNull(ptr.matchElement(-1));
    }

    @Test
    public void testTailOfEmpty() throws Exception {
        JsonPointer ptr = JsonPointer.compile("");
        assertNull(ptr.tail());
    }

    @Test
    public void testTailOfRoot() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/");
        assertNull(ptr.tail());
    }
    
    @Test
    public void testTailOfSingleSegment() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo");
        assertNull(ptr.tail());
    }

    @Test
    public void testTailOfMultipleSegments() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a/b/c");
        JsonPointer tail = ptr.tail();
        assertNotNull(tail);
        assertEquals("/b/c", tail.toString());
    }

    @Test
    public void testMatchPropertyOnEmptyPointer() throws Exception {
        JsonPointer ptr = JsonPointer.compile("");
        assertNull(ptr.matchProperty("foo"));
    }

    @Test
    public void testMatchElementOnEmptyPointer() throws Exception {
        JsonPointer ptr = JsonPointer.compile("");
        assertNull(ptr.matchElement(0));
    }

    @Test
    public void testGetMatchingPropertyOnEmptyPointer() throws Exception {
        JsonPointer ptr = JsonPointer.compile("");
        assertEquals("", ptr.getMatchingProperty());
    }

    @Test
    public void testGetMatchingIndexOnEmptyPointer() throws Exception {
        JsonPointer ptr = JsonPointer.compile("");
        assertEquals(-1, ptr.getMatchingIndex());
    }

    @Test
    public void testMatchesOnNonEmptyPointer() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a");
        assertFalse(ptr.matches());
    }
    
    @Test
    public void testCompileInvalidStartCharacter() throws Exception {
        try {
            JsonPointer.compile("abc");
            fail("Expected IllegalArgumentException for input not starting with '/'");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }
    
    @Test
    public void testCompileInvalidStartCharacterWithSlash() throws Exception {
        try {
            JsonPointer.compile("a/b");
            fail("Expected IllegalArgumentException for input not starting with '/'");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }
}
