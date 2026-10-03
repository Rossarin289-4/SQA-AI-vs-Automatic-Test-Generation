package com.fasterxml.jackson.core;

import org.junit.Assert;
import org.junit.Test;

public class JsonPointerAI6Test {

    @Test
    public void testEmptyPointer() {
        JsonPointer ptr = JsonPointer.compile("");
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.matches());
        Assert.assertEquals("", ptr.toString());
        Assert.assertEquals("", ptr.getMatchingProperty());
        Assert.assertEquals(-1, ptr.getMatchingIndex());
        Assert.assertTrue(ptr.mayMatchProperty());
        Assert.assertFalse(ptr.mayMatchElement());
        Assert.assertNull(ptr.tail());
    }

    @Test
    public void testNullPointer() {
        JsonPointer ptr = JsonPointer.compile(null);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.matches());
        Assert.assertEquals("", ptr.toString());
    }

    @Test
    public void testValueOfAlias() {
        JsonPointer ptr = JsonPointer.valueOf("/abc");
        Assert.assertNotNull(ptr);
        Assert.assertEquals("/abc", ptr.toString());
        Assert.assertEquals("abc", ptr.getMatchingProperty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPointerNoSlash() {
        JsonPointer.compile("abc");
    }

    @Test
    public void testSingleSegmentProperty() {
        JsonPointer ptr = JsonPointer.compile("/property");
        Assert.assertFalse(ptr.matches());
        Assert.assertEquals("/property", ptr.toString());
        Assert.assertEquals("property", ptr.getMatchingProperty());
        Assert.assertEquals(-1, ptr.getMatchingIndex());
        Assert.assertTrue(ptr.mayMatchProperty());
        Assert.assertFalse(ptr.mayMatchElement());

        JsonPointer tail = ptr.tail();
        Assert.assertNotNull(tail);
        Assert.assertTrue(tail.matches());
    }

    @Test
    public void testSingleSegmentIndex() {
        JsonPointer ptr = JsonPointer.compile("/123");
        Assert.assertFalse(ptr.matches());
        Assert.assertEquals("/123", ptr.toString());
        Assert.assertEquals("123", ptr.getMatchingProperty());
        Assert.assertEquals(123, ptr.getMatchingIndex());
        Assert.assertTrue(ptr.mayMatchProperty());
        Assert.assertTrue(ptr.mayMatchElement());
    }

    @Test
    public void testIndexBoundariesAndLeadingZeros() {
        // Zero index is valid
        JsonPointer ptrZero = JsonPointer.compile("/0");
        Assert.assertEquals(0, ptrZero.getMatchingIndex());

        // Leading zero is invalid as an index
        JsonPointer ptrLeadZero = JsonPointer.compile("/01");
        Assert.assertEquals(-1, ptrLeadZero.getMatchingIndex());

        // Negative-looking index
        JsonPointer ptrNeg = JsonPointer.compile("/-1");
        Assert.assertEquals(-1, ptrNeg.getMatchingIndex());

        // Very large index (overflows int)
        JsonPointer ptrHuge = JsonPointer.compile("/3000000000");
        Assert.assertEquals(-1, ptrHuge.getMatchingIndex());
    }

    @Test
    public void testMultipleSegments() {
        JsonPointer ptr = JsonPointer.compile("/store/book/0/title");
        Assert.assertFalse(ptr.matches());
        Assert.assertEquals("store", ptr.getMatchingProperty());

        JsonPointer p2 = ptr.tail();
        Assert.assertEquals("book", p2.getMatchingProperty());

        JsonPointer p3 = p2.tail();
        Assert.assertEquals("0", p3.getMatchingProperty());
        Assert.assertEquals(0, p3.getMatchingIndex());

        JsonPointer p4 = p3.tail();
        Assert.assertEquals("title", p4.getMatchingProperty());
        Assert.assertTrue(p4.tail().matches());
    }

    @Test
    public void testMatchProperty() {
        JsonPointer ptr = JsonPointer.compile("/foo/bar");
        JsonPointer matched = ptr.matchProperty("foo");
        Assert.assertNotNull(matched);
        Assert.assertEquals("bar", matched.getMatchingProperty());

        Assert.assertNull(ptr.matchProperty("not-foo"));
        Assert.assertNull(matched.matchProperty("foo")); // tail doesn't match 'foo' first
    }

    @Test
    public void testMatchElement() {
        JsonPointer ptr = JsonPointer.compile("/5/bar");
        JsonPointer matched = ptr.matchElement(5);
        Assert.assertNotNull(matched);
        Assert.assertEquals("bar", matched.getMatchingProperty());

        Assert.assertNull(ptr.matchElement(4));
        Assert.assertNull(ptr.matchElement(-1));
    }

    @Test
    public void testEscapingTildeAndSlash() {
        // ~0 is ~, ~1 is /
        JsonPointer ptr = JsonPointer.compile("/a~0b/c~1d");
        Assert.assertEquals("a~b", ptr.getMatchingProperty());
        JsonPointer next = ptr.tail();
        Assert.assertEquals("c/d", next.getMatchingProperty());
    }

    @Test
    public void testEqualsAndHashCode() {
        JsonPointer p1 = JsonPointer.compile("/foo/bar");
        JsonPointer p2 = JsonPointer.compile("/foo/bar");
        JsonPointer p3 = JsonPointer.compile("/foo/baz");

        Assert.assertTrue(p1.equals(p2));
        Assert.assertTrue(p2.equals(p1));
        Assert.assertEquals(p1.hashCode(), p2.hashCode());

        Assert.assertFalse(p1.equals(p3));
        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("string"));
        Assert.assertTrue(p1.equals(p1));
    }
}
