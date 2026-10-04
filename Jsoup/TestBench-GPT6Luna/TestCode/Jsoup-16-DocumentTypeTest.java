package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;

public class DocumentTypeTest {
    @Test
    public void testNodeName() throws Exception {
        DocumentType type = new DocumentType("html", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithPublicAndSystemIds() throws Exception {
        DocumentType type = new DocumentType("html", "public-id", "system-id", "base");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithWhitespaceIds() throws Exception {
        DocumentType type = new DocumentType("html", " ", "\t", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithNullIds() throws Exception {
        DocumentType type = new DocumentType("html", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithMixedCaseName() throws Exception {
        DocumentType type = new DocumentType("HtMl", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithNumericName() throws Exception {
        DocumentType type = new DocumentType("123", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithPunctuationName() throws Exception {
        DocumentType type = new DocumentType("html!", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithSpacesInName() throws Exception {
        DocumentType type = new DocumentType("html name", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithNonemptyBaseUri() throws Exception {
        DocumentType type = new DocumentType("html", "", "", "https://example.org");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithEmptyName() throws Exception {
        try {
            new DocumentType("", "", "", "");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testNodeNameWithNullName() throws Exception {
        try {
            new DocumentType(null, "", "", "");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testNodeNameIndependentOfPublicId() throws Exception {
        DocumentType first = new DocumentType("html", "public", "", "");
        DocumentType second = new DocumentType("html", "", "", "");
        assertEquals(second.nodeName(), first.nodeName());
    }
}
