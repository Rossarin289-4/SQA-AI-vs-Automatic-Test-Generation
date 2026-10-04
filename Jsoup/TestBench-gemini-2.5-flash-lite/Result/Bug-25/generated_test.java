package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import java.util.HashMap;
import java.util.Map;

public class TagTest {
    @Test
    public void testValueOf_P_ReturnsRegisteredTag() {
        Tag pTag = Tag.valueOf("p");
        assertTrue(pTag.isKnownTag());
        assertEquals("p", pTag.getName());
    }

    @Test
    public void testValueOf_UnknownTag_IsGeneric() {
        Tag unknownTag = Tag.valueOf("foobar");
        assertFalse(unknownTag.isKnownTag());
        assertEquals("foobar", unknownTag.getName());
        assertFalse(unknownTag.isBlock());
        assertTrue(unknownTag.canContainBlock());
    }

    @Test
    public void testValueOf_CaseInsensitive() {
        Tag pTagUpper = Tag.valueOf("P");
        Tag pTagLower = Tag.valueOf("p");
        assertEquals(pTagUpper, pTagLower);
    }

    @Test
    public void testValueOf_TrimsWhitespace() {
        Tag pTag = Tag.valueOf("  p  ");
        assertEquals("p", pTag.getName());
        assertTrue(pTag.isKnownTag());
    }

    @Test
    public void testValueOf_ThrowsOnNull() {
        try {
            Tag.valueOf(null);
            fail("Expected IllegalArgumentException for null tag name");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testValueOf_ThrowsOnEmptyString() {
        try {
            Tag.valueOf("");
            fail("Expected IllegalArgumentException for empty tag name");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            Tag.valueOf("   ");
            fail("Expected IllegalArgumentException for blank tag name");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testGetName() {
        Tag divTag = Tag.valueOf("div");
        assertEquals("div", divTag.getName());
    }

    @Test
    public void testIsBlock_BlockTag() {
        Tag divTag = Tag.valueOf("div");
        assertTrue(divTag.isBlock());
        Tag pTag = Tag.valueOf("p");
        assertTrue(pTag.isBlock());
    }

    @Test
    public void testIsBlock_InlineTag() {
        Tag spanTag = Tag.valueOf("span");
        assertFalse(spanTag.isBlock());
        Tag aTag = Tag.valueOf("a");
        assertFalse(aTag.isBlock());
    }
    
    @Test
    public void testIsBlock_UnknownTag() {
        Tag unknownTag = Tag.valueOf("custom");
        assertFalse(unknownTag.isBlock());
    }

    @Test
    public void testFormatAsBlock_BlockTag() {
        Tag divTag = Tag.valueOf("div");
        assertTrue(divTag.formatAsBlock());
        Tag pTag = Tag.valueOf("p");
        assertTrue(pTag.formatAsBlock());
    }

    @Test
    public void testFormatAsBlock_InlineTagFormattedAsBlock() {
        Tag titleTag = Tag.valueOf("title");
        assertFalse(titleTag.formatAsBlock());
        Tag aTag = Tag.valueOf("a");
        assertFalse(aTag.formatAsBlock());
    }

    @Test
    public void testFormatAsBlock_UnknownTag() {
        Tag unknownTag = Tag.valueOf("custom");
        assertTrue(unknownTag.formatAsBlock());
    }

    @Test
    public void testCanContainBlock_BlockTag() {
        Tag divTag = Tag.valueOf("div");
        assertTrue(divTag.canContainBlock());
        Tag bodyTag = Tag.valueOf("body");
        assertTrue(bodyTag.canContainBlock());
    }

    @Test
    public void testCanContainBlock_InlineTag() {
        Tag spanTag = Tag.valueOf("span");
        assertFalse(spanTag.canContainBlock());
        Tag aTag = Tag.valueOf("a");
        assertFalse(aTag.canContainBlock());
    }
    
    @Test
    public void testCanContainBlock_UnknownTag() {
        Tag unknownTag = Tag.valueOf("custom");
        assertTrue(unknownTag.canContainBlock());
    }

    @Test
    public void testIsInline_BlockTag() {
        Tag divTag = Tag.valueOf("div");
        assertFalse(divTag.isInline());
    }

    @Test
    public void testIsInline_InlineTag() {
        Tag spanTag = Tag.valueOf("span");
        assertTrue(spanTag.isInline());
        Tag aTag = Tag.valueOf("a");
        assertTrue(aTag.isInline());
    }

    @Test
    public void testIsInline_UnknownTag() {
        Tag unknownTag = Tag.valueOf("custom");
        assertTrue(unknownTag.isInline());
    }

    @Test
    public void testIsData_DataTag() {
        Tag objectTag = Tag.valueOf("object");
        assertTrue(objectTag.isData());
        Tag spanTag = Tag.valueOf("span");
        assertTrue(spanTag.isData());
        Tag textareaTag = Tag.valueOf("textarea");
        assertTrue(textareaTag.isData());
    }

    @Test
    public void testIsData_NonDataTag() {
        Tag divTag = Tag.valueOf("div");
        assertFalse(divTag.isData());
        Tag pTag = Tag.valueOf("p");
        assertFalse(pTag.isData());
        Tag imgTag = Tag.valueOf("img"); // img is empty
        assertFalse(imgTag.isData());
    }
    
    @Test
    public void testIsData_UnknownTag() {
        Tag unknownTag = Tag.valueOf("custom");
        assertFalse(unknownTag.isData());
    }

    @Test
    public void testIsEmpty_EmptyTag() {
        Tag imgTag = Tag.valueOf("img");
        assertTrue(imgTag.isEmpty());
        Tag brTag = Tag.valueOf("br");
        assertTrue(brTag.isEmpty());
        Tag inputTag = Tag.valueOf("input");
        assertTrue(inputTag.isEmpty());
    }

    @Test
    public void testIsEmpty_NonEmptyTag() {
        Tag divTag = Tag.valueOf("div");
        assertFalse(divTag.isEmpty());
        Tag pTag = Tag.valueOf("p");
        assertFalse(pTag.isEmpty());
        Tag spanTag = Tag.valueOf("span");
        assertFalse(spanTag.isEmpty());
    }

    @Test
    public void testIsEmpty_UnknownTag() {
        Tag unknownTag = Tag.valueOf("custom");
        assertFalse(unknownTag.isEmpty());
    }

    @Test
    public void testIsSelfClosing_EmptyTag() {
        Tag imgTag = Tag.valueOf("img");
        assertTrue(imgTag.isSelfClosing());
    }

    @Test
    public void testIsSelfClosing_SelfClosingTag() {
        Tag linkTag = Tag.valueOf("link");
        linkTag.setSelfClosing(); // Call the method to set the flag
        assertTrue(linkTag.isSelfClosing());
    }

    @Test
    public void testIsSelfClosing_NonSelfClosingTag() {
        Tag divTag = Tag.valueOf("div");
        assertFalse(divTag.isSelfClosing());
        Tag pTag = Tag.valueOf("p");
        assertFalse(pTag.isSelfClosing());
    }

    @Test
    public void testIsSelfClosing_UnknownTag() {
        Tag unknownTag = Tag.valueOf("custom");
        assertFalse(unknownTag.isSelfClosing());
    }

    @Test
    public void testIsKnownTag_KnownTag() {
        Tag divTag = Tag.valueOf("div");
        assertTrue(divTag.isKnownTag());
        Tag pTag = Tag.valueOf("p");
        assertTrue(pTag.isKnownTag());
    }

    @Test
    public void testIsKnownTag_UnknownTag() {
        Tag unknownTag = Tag.valueOf("foobar");
        assertFalse(unknownTag.isKnownTag());
    }
    
    @Test
    public void testIsKnownTagStatic_KnownTag() {
        assertTrue(Tag.isKnownTag("div"));
        assertTrue(Tag.isKnownTag("p"));
    }

    @Test
    public void testIsKnownTagStatic_UnknownTag() {
        assertFalse(Tag.isKnownTag("foobar"));
    }

    @Test
    public void testPreserveWhitespace_PreserveTag() {
        Tag preTag = Tag.valueOf("pre");
        assertTrue(preTag.preserveWhitespace());
        Tag scriptTag = Tag.valueOf("script");
        assertTrue(scriptTag.preserveWhitespace());
    }

    @Test
    public void testPreserveWhitespace_NonPreserveTag() {
        Tag divTag = Tag.valueOf("div");
        assertFalse(divTag.preserveWhitespace());
        Tag pTag = Tag.valueOf("p");
        assertFalse(pTag.preserveWhitespace());
    }
    
    @Test
    public void testPreserveWhitespace_UnknownTag() {
        Tag unknownTag = Tag.valueOf("custom");
        assertFalse(unknownTag.preserveWhitespace());
    }

    @Test
    public void testEquals_SameInstance() {
        Tag pTag1 = Tag.valueOf("p");
        assertEquals(pTag1, pTag1);
    }

    @Test
    public void testEquals_EqualTags() {
        Tag pTag1 = Tag.valueOf("p");
        Tag pTag2 = Tag.valueOf("p");
        assertEquals(pTag1, pTag2);
    }




    @Test
    public void testHashCode_EqualTags() {
        Tag pTag1 = Tag.valueOf("p");
        Tag pTag2 = Tag.valueOf("p");
        assertEquals(pTag1.hashCode(), pTag2.hashCode());
    }


    @Test
    public void testToString() {
        Tag pTag = Tag.valueOf("p");
        assertEquals("p", pTag.toString());
    }
    
    @Test
    public void testSetSelfClosing() {
        Tag linkTag = Tag.valueOf("link");
        assertFalse(linkTag.isSelfClosing());
        linkTag.setSelfClosing();
        assertTrue(linkTag.isSelfClosing());
    }
}

