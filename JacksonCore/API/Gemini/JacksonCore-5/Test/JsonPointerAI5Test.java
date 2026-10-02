package com.fasterxml.jackson.core;

import org.junit.Assert;
import org.junit.Test;

public class JsonPointerAI5Test {

    @Test
    public void testCompileEmptyAndNull() {
        JsonPointer p1 = JsonPointer.compile(null);
        JsonPointer p2 = JsonPointer.compile("");
        JsonPointer p3 = JsonPointer.valueOf("");

        Assert.assertNotNull(p1);
        Assert.assertTrue(p1.matches());
        Assert.assertEquals("", p1.toString());

        Assert.assertEquals(p1, p2);
        Assert.assertEquals(p1, p3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompileInvalidNoSlash() {
        JsonPointer.compile("abc");
    }

    @Test
    public void testSimplePropertyPointer() {
        JsonPointer ptr = JsonPointer.compile("/property");
        Assert.assertFalse(ptr.matches());
        Assert.assertEquals("property", ptr.getMatchingProperty());
        Assert.assertEquals(-1, ptr.getMatchingIndex());
        Assert.assertTrue(ptr.mayMatchProperty());
        Assert.assertFalse(ptr.mayMatchElement());
        Assert.assertEquals("/property", ptr.toString());

        JsonPointer tail = ptr.tail();
        Assert.assertNotNull(tail);
        Assert.assertTrue(tail.matches());
    }

    @Test
    public void testElementIndexPointer() {
        JsonPointer ptr = JsonPointer.compile("/123");
        Assert.assertFalse(ptr.matches());
        Assert.assertEquals("123", ptr.getMatchingProperty());
        Assert.assertEquals(123, ptr.getMatchingIndex());
        Assert.assertTrue(ptr.mayMatchProperty());
        Assert.assertTrue(ptr.mayMatchElement());

        JsonPointer matched = ptr.matchElement(123);
        Assert.assertNotNull(matched);
        Assert.assertTrue(matched.matches());

        Assert.assertNull(ptr.matchElement(0));
        Assert.assertNull(ptr.matchElement(-1));
    }

    @Test
    public void testMatchProperty() {
        JsonPointer ptr = JsonPointer.compile("/foo");
        Assert.assertNotNull(ptr.matchProperty("foo"));
        Assert.assertNull(ptr.matchProperty("bar"));

        // matchProperty on a pointer matches the *current* segment, whether it has a tail or not
        JsonPointer multi = JsonPointer.compile("/foo/bar");
        Assert.assertNotNull(multi.matchProperty("foo"));
        Assert.assertEquals("bar", multi.tail().getMatchingProperty());
    }

    @Test
    public void testMultiSegmentPointer() {
        JsonPointer ptr = JsonPointer.compile("/a/b/1");
        Assert.assertFalse(ptr.matches());
        Assert.assertEquals("a", ptr.getMatchingProperty());

        JsonPointer tail1 = ptr.tail();
        Assert.assertNotNull(tail1);
        Assert.assertEquals("b", tail1.getMatchingProperty());

        JsonPointer tail2 = tail1.tail();
        Assert.assertNotNull(tail2);
        Assert.assertEquals(1, tail2.getMatchingIndex());
        Assert.assertTrue(tail2.tail().matches());
    }

    @Test
    public void testEscapedCharacters() {
        // '~0' represents '~', '~1' represents '/'
        JsonPointer ptr = JsonPointer.compile("/a~0b/c~1d");
        Assert.assertEquals("a~b", ptr.getMatchingProperty());
        
        JsonPointer tail = ptr.tail();
        Assert.assertNotNull(tail);
        Assert.assertEquals("c/d", tail.getMatchingProperty());
    }

    @Test
    public void testEqualsAndHashCode() {
        JsonPointer p1 = JsonPointer.compile("/a/b");
        JsonPointer p2 = JsonPointer.compile("/a/b");
        JsonPointer p3 = JsonPointer.compile("/a/c");

        Assert.assertEquals(p1, p2);
        Assert.assertEquals(p1.hashCode(), p2.hashCode());
        Assert.assertFalse(p1.equals(p3));
        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("not-a-pointer"));
    }

    @Test
    public void testIndexBoundaryConditions() {
        // Extremely long index string that exceeds length 10
        JsonPointer pLong = JsonPointer.compile("/1234567890123");
        Assert.assertEquals(-1, pLong.getMatchingIndex());

        // Non-numeric index
        JsonPointer pNonNum = JsonPointer.compile("/123a");
        Assert.assertEquals(-1, pNonNum.getMatchingIndex());
    }
}
