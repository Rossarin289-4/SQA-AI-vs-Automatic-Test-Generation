package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;

public class DocumentTypeTest {
    @Test
    public void testNodeNameForNamedDoctype() throws Exception {
        DocumentType type = new DocumentType("html", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameForEmptyName() throws Exception {
        DocumentType type = new DocumentType("", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameForNullName() throws Exception {
        DocumentType type = new DocumentType("", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameForWhitespaceName() throws Exception {
        DocumentType type = new DocumentType(" \t", "", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithPublicAndSystemIds() throws Exception {
        DocumentType type = new DocumentType("html", "pub", "sys", "base");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithOnlyPublicId() throws Exception {
        DocumentType type = new DocumentType("html", "pub", "", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithOnlySystemId() throws Exception {
        DocumentType type = new DocumentType("html", "", "sys", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameWithWhitespaceIdentifiers() throws Exception {
        DocumentType type = new DocumentType("html", " ", "\n", "");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameIgnoresBaseUri() throws Exception {
        DocumentType type = new DocumentType("html", "", "", "https://example.test");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameAfterChangingAttributes() throws Exception {
        DocumentType type = new DocumentType("html", "", "", "");
        type.attr("name", "svg");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameAfterRemovingNameAttribute() throws Exception {
        DocumentType type = new DocumentType("html", "", "", "");
        type.removeAttr("name");
        assertEquals("#doctype", type.nodeName());
    }

    @Test
    public void testNodeNameAfterChangingPublicAndSystemAttributes() throws Exception {
        DocumentType type = new DocumentType("html", "pub", "sys", "");
        type.attr("publicId", "other");
        type.attr("systemId", "other");
        assertEquals("#doctype", type.nodeName());
    }
}
