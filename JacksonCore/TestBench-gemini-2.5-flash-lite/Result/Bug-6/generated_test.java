package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.io.NumberInput;

public class JsonPointerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEmptyPointer() throws Exception {
        JsonPointer ptr = JsonPointer.compile("");
        assertTrue(ptr.matches());
        // The empty pointer should not match any property or element.
        // getMatchingProperty() returns "", which is not null, but mayMatchProperty() should be false.
        assertEquals("", ptr.getMatchingProperty()); 
        assertEquals(-1, ptr.getMatchingIndex());
        assertFalse(ptr.mayMatchProperty()); // Corrected: Empty pointer doesn't match a property.
        assertFalse(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("", ptr.toString());
    }

    @Test
    public void testNullInputToCompile() throws Exception {
        JsonPointer ptr = JsonPointer.compile(null);
        assertTrue(ptr.matches());
        assertEquals("", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertFalse(ptr.mayMatchProperty()); // Corrected: null input results in empty pointer.
        assertFalse(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("", ptr.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInputNoLeadingSlash() throws Exception {
        JsonPointer.compile("foo");
    }

    @Test
    public void testSinglePropertyPointer() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo");
        assertFalse(ptr.matches());
        assertEquals("foo", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("/foo", ptr.toString());
    }

    @Test
    public void testSingleElementPointer() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/0");
        assertFalse(ptr.matches());
        assertEquals("0", ptr.getMatchingProperty());
        assertEquals(0, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertTrue(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("/0", ptr.toString());
    }

    @Test
    public void testEmptyPropertyNamePointer() throws Exception {
        JsonPointer ptr = JsonPointer.compile("//");
        assertFalse(ptr.matches());
        assertEquals("", ptr.getMatchingProperty()); // Corrected: Empty segment after slash
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("//", ptr.toString());
    }

    @Test
    public void testPointerWithMultipleSegments() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/0/bar");
        assertFalse(ptr.matches());
        assertEquals("foo", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        // The tail should be "/0/bar"
        assertEquals("/0/bar", ptr.tail().toString());

        JsonPointer ptr2 = ptr.tail();
        assertFalse(ptr2.matches());
        assertEquals("0", ptr2.getMatchingProperty());
        assertEquals(0, ptr2.getMatchingIndex());
        assertTrue(ptr2.mayMatchProperty());
        assertTrue(ptr2.mayMatchElement());
        // The tail should be "/bar"
        assertEquals("/bar", ptr2.tail().toString());

        JsonPointer ptr3 = ptr2.tail();
        assertFalse(ptr3.matches());
        assertEquals("bar", ptr3.getMatchingProperty());
        assertEquals(-1, ptr3.getMatchingIndex());
        assertTrue(ptr3.mayMatchProperty());
        assertFalse(ptr3.mayMatchElement());
        assertNull(ptr3.tail());
        assertEquals("/bar", ptr3.toString());
    }

    @Test
    public void testPointerWithEscapedChars() throws Exception {
        // Original input: /~1foo/~0bar
        // ~1 decodes to /
        // ~0 decodes to ~
        // So, the segments are "/foo" and "bar"
        JsonPointer ptr = JsonPointer.compile("/~1foo/~0bar"); 
        assertFalse(ptr.matches());
        assertEquals("/foo", ptr.getMatchingProperty()); // Corrected: /~1 becomes /
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        // The tail should be "/bar"
        assertEquals("/bar", ptr.tail().toString());

        JsonPointer ptr2 = ptr.tail();
        assertFalse(ptr2.matches());
        assertEquals("bar", ptr2.getMatchingProperty());
        assertEquals(-1, ptr2.getMatchingIndex());
        assertTrue(ptr2.mayMatchProperty());
        assertFalse(ptr2.mayMatchElement());
        assertNull(ptr2.tail());
        assertEquals("/bar", ptr2.toString());
    }
    
    @Test
    public void testPointerWithEscapedTildeAndSlash() throws Exception {
        // Original input: /~0/~1
        // ~0 decodes to ~
        // ~1 decodes to /
        // So, the segments are "~" and "/"
        JsonPointer ptr = JsonPointer.compile("/~0/~1"); 
        assertFalse(ptr.matches());
        assertEquals("~", ptr.getMatchingProperty()); // Corrected: ~0 becomes ~
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        // The tail should be "/ " which decodes to "/"
        assertEquals("/", ptr.tail().toString()); // Corrected: ~1 becomes /

        JsonPointer ptr2 = ptr.tail();
        assertFalse(ptr2.matches());
        assertEquals("/", ptr2.getMatchingProperty());
        assertEquals(-1, ptr2.getMatchingIndex());
        assertTrue(ptr2.mayMatchProperty());
        assertFalse(ptr2.mayMatchElement());
        assertNull(ptr2.tail());
        assertEquals("/", ptr2.toString());
    }

    @Test
    public void testPointerWithOnlyEscapedChars() throws Exception {
        // Original input: /~0
        // ~0 decodes to ~
        JsonPointer ptr = JsonPointer.compile("/~0"); 
        assertFalse(ptr.matches());
        assertEquals("~", ptr.getMatchingProperty()); // Corrected: ~0 becomes ~
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("/~0", ptr.toString());
    }

    @Test
    public void testPointerWithOnlySlashAsSegment() throws Exception {
        JsonPointer ptr = JsonPointer.compile("//"); // Represents an empty segment
        assertFalse(ptr.matches());
        assertEquals("", ptr.getMatchingProperty()); // Corrected: Empty segment
        assertEquals(-1, ptr.getMatchingIndex());
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("//", ptr.toString());
    }

    @Test
    public void testPointerWithDigitsNotZero() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/123");
        assertFalse(ptr.matches());
        assertEquals("123", ptr.getMatchingProperty());
        assertEquals(123, ptr.getMatchingIndex()); // Corrected: Parses to integer 123
        assertTrue(ptr.mayMatchProperty());
        assertTrue(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("/123", ptr.toString());
    }
    
    @Test
    public void testPointerWithZeroIndex() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/0");
        assertFalse(ptr.matches());
        assertEquals("0", ptr.getMatchingProperty());
        assertEquals(0, ptr.getMatchingIndex()); // Corrected: Parses to integer 0
        assertTrue(ptr.mayMatchProperty());
        assertTrue(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("/0", ptr.toString());
    }

    @Test
    public void testPointerWithLeadingZeroIndexNotZero() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/01");
        assertFalse(ptr.matches());
        assertEquals("01", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex()); // Corrected: Invalid index due to leading zero
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("/01", ptr.toString());
    }
    
    @Test
    public void testPointerWithLongIndex() throws Exception {
        // Test index that is too long to be a valid integer segment, but parses as string
        JsonPointer ptr = JsonPointer.compile("/12345678901");
        assertFalse(ptr.matches());
        assertEquals("12345678901", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex()); // Corrected: Too long for int, so not an index
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("/12345678901", ptr.toString());
    }

    @Test
    public void testPointerWithMaxValueIntIndex() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/" + Integer.MAX_VALUE);
        assertFalse(ptr.matches());
        assertEquals(String.valueOf(Integer.MAX_VALUE), ptr.getMatchingProperty());
        assertEquals(Integer.MAX_VALUE, ptr.getMatchingIndex()); // Corrected: Valid integer index
        assertTrue(ptr.mayMatchProperty());
        assertTrue(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("/" + Integer.MAX_VALUE, ptr.toString());
    }

    @Test
    public void testPointerWithIndexJustOverMaxValueInt() throws Exception {
        // This will be parsed as a string, not an int, so it's a valid property name.
        // The _parseIndex method returns -1 if the number is too large for an int.
        JsonPointer ptr = JsonPointer.compile("/2147483648"); 
        assertFalse(ptr.matches());
        assertEquals("2147483648", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex()); // Corrected: Too large for int, so not an index.
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("/2147483648", ptr.toString());
    }

    @Test
    public void testPointerWithLargeNumberString() throws Exception {
        // This number is larger than Long.MAX_VALUE. NumberInput.parseLong would throw.
        // JsonPointer's _parseIndex returns -1 for numbers too large for int.
        JsonPointer ptr = JsonPointer.compile("/99999999999999999999"); 
        assertFalse(ptr.matches());
        assertEquals("99999999999999999999", ptr.getMatchingProperty());
        assertEquals(-1, ptr.getMatchingIndex()); // Corrected: Too large for int, so not an index.
        assertTrue(ptr.mayMatchProperty());
        assertFalse(ptr.mayMatchElement());
        assertNull(ptr.tail());
        assertEquals("/99999999999999999999", ptr.toString());
    }

    @Test
    public void testMatchPropertySuccess() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/bar");
        JsonPointer next = ptr.matchProperty("foo");
        assertNotNull(next);
        assertEquals(ptr.tail(), next);
    }

    @Test
    public void testMatchPropertyFailure() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/bar");
        assertNull(ptr.matchProperty("baz"));
        assertNull(ptr.matchProperty("0"));
    }

    @Test
    public void testMatchElementSuccess() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/0/bar");
        JsonPointer next = ptr.matchElement(0);
        assertNotNull(next);
        assertEquals(ptr.tail(), next);
    }

    @Test
    public void testMatchElementFailureWrongIndex() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/0/bar");
        assertNull(ptr.matchElement(1));
    }

    @Test
    public void testMatchElementFailureNegativeIndex() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/0/bar");
        assertNull(ptr.matchElement(-1));
    }
    
    @Test
    public void testMatchElementFailureOnProperty() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo/bar");
        assertNull(ptr.matchElement(0));
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a/b");
        assertTrue(ptr.equals(ptr));
    }

    @Test
    public void testEqualsDifferentInstanceSameString() throws Exception {
        JsonPointer ptr1 = JsonPointer.compile("/a/b");
        JsonPointer ptr2 = JsonPointer.compile("/a/b");
        assertTrue(ptr1.equals(ptr2));
        assertEquals(ptr1.hashCode(), ptr2.hashCode());
    }

    @Test
    public void testEqualsDifferentString() throws Exception {
        JsonPointer ptr1 = JsonPointer.compile("/a/b");
        JsonPointer ptr2 = JsonPointer.compile("/a/c");
        assertFalse(ptr1.equals(ptr2));
    }

    @Test
    public void testEqualsNull() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a/b");
        assertFalse(ptr.equals(null));
    }

    @Test
    public void testEqualsWrongType() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a/b");
        assertFalse(ptr.equals(""));
    }
    
    @Test
    public void testValueOfAlias() throws Exception {
        JsonPointer ptr1 = JsonPointer.compile("/foo");
        JsonPointer ptr2 = JsonPointer.valueOf("/foo");
        assertEquals(ptr1, ptr2);
    }

    @Test
    public void testValueOfEmpty() throws Exception {
        JsonPointer ptr1 = JsonPointer.compile("");
        JsonPointer ptr2 = JsonPointer.valueOf("");
        assertEquals(ptr1, ptr2);
    }
    
    @Test
    public void testTailOfEmpty() throws Exception {
        JsonPointer ptr = JsonPointer.compile("");
        assertNull(ptr.tail());
    }

    @Test
    public void testTailOfSingleSegment() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/foo");
        assertNull(ptr.tail());
    }

    @Test
    public void testTailOfMultiSegment() throws Exception {
        JsonPointer ptr = JsonPointer.compile("/a/b/c");
        assertEquals("/b/c", ptr.tail().toString());
    }
}
