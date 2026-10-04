package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import java.util.HashMap;
import java.util.Map;

public class TagTest {
    @Test
    public void testKnownNameIsTrimmedAndLowercased() throws Exception {
        Tag tag = Tag.valueOf("  DIV ");
        assertEquals("div", tag.getName());
        assertEquals("div", tag.toString());
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void testKnownLookupIsCached() throws Exception {
        assertSame(Tag.valueOf("p"), Tag.valueOf("P"));
    }

    @Test
    public void testUnknownLookupIsGenericAndNotRegistered() throws Exception {
        String name = "custom-unique-a";
        Tag tag = Tag.valueOf(name);
        assertEquals(name, tag.getName());
        assertFalse(tag.isBlock());
        assertTrue(tag.isInline());
        assertTrue(tag.canContainBlock());
        assertFalse(tag.isKnownTag());
        assertFalse(Tag.isKnownTag(name));
    }

    @Test
    public void testUnknownTagsCompareByValue() throws Exception {
        assertEquals(Tag.valueOf("custom-unique-b"), Tag.valueOf(" CUSTOM-UNIQUE-B "));
    }

    @Test
    public void testIsKnownTagUsesExactCase() throws Exception {
        assertTrue(Tag.isKnownTag("div"));
        assertFalse(Tag.isKnownTag("DIV"));
    }

    @Test
    public void testBlockTagCapabilities() throws Exception {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
        assertFalse(tag.isInline());
        assertTrue(tag.formatAsBlock());
        assertTrue(tag.canContainBlock());
        assertFalse(tag.isEmpty());
        assertFalse(tag.isSelfClosing());
        assertFalse(tag.isData());
    }

    @Test
    public void testInlineTagCapabilities() throws Exception {
        Tag tag = Tag.valueOf("span");
        assertFalse(tag.isBlock());
        assertTrue(tag.isInline());
        assertFalse(tag.formatAsBlock());
        assertFalse(tag.canContainBlock());
    }

    @Test
    public void testParagraphFormattingDiffersFromBlockCapability() throws Exception {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isBlock());
        assertFalse(tag.formatAsBlock());
        assertTrue(tag.canContainBlock());
    }

    @Test
    public void testEmptyInlineTagIsSelfClosingAndNotData() throws Exception {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
        assertTrue(tag.isSelfClosing());
        assertFalse(tag.canContainBlock());
        assertFalse(tag.isData());
    }

    @Test
    public void testDataTagIsNotEmpty() throws Exception {
        Tag tag = Tag.valueOf("script");
        assertFalse(tag.isEmpty());
        assertTrue(tag.canContainBlock());
        assertFalse(tag.isData());
    }

    @Test
    public void testPreservesWhitespaceForPre() throws Exception {
        assertTrue(Tag.valueOf("pre").preserveWhitespace());
        assertFalse(Tag.valueOf("div").preserveWhitespace());
    }

    @Test
    public void testPreservesWhitespaceForTextarea() throws Exception {
        assertTrue(Tag.valueOf("textarea").preserveWhitespace());
    }

    @Test
    public void testPreservesWhitespaceForPlaintext() throws Exception {
        assertTrue(Tag.valueOf("plaintext").preserveWhitespace());
    }

    @Test
    public void testEqualityRejectsDifferentNames() throws Exception {
        assertFalse(Tag.valueOf("div").equals(Tag.valueOf("span")));
    }

    @Test
    public void testEqualityRejectsDifferentCapabilities() throws Exception {
        assertFalse(Tag.valueOf("div").equals(Tag.valueOf("custom-unique-c")));
    }

    @Test
    public void testEqualTagsHaveEqualHashes() throws Exception {
        Tag first = Tag.valueOf("custom-unique-d");
        Tag second = Tag.valueOf(" CUSTOM-UNIQUE-D ");
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testEqualsNullAndOtherType() throws Exception {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.equals(null));
        assertFalse(tag.equals("div"));
    }

    @Test
    public void testValueOfRejectsNull() throws Exception {
        try {
            Tag.valueOf(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testValueOfRejectsTrimmedEmptyName() throws Exception {
        try {
            Tag.valueOf("   ");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
