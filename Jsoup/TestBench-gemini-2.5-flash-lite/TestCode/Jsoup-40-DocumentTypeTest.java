package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;

public class DocumentTypeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testNodeName() throws Exception {
        DocumentType doctype = new DocumentType("html", "", "", "");
        assertEquals("#doctype", doctype.nodeName());
    }

    @Test
    public void testOuterHtmlHead_onlyName() throws Exception {
        DocumentType doctype = new DocumentType("html", "", "", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null); // Assuming null output settings is acceptable for this test
        assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_nameAndPublicId() throws Exception {
        DocumentType doctype = new DocumentType("html", "-//W3C//DTD XHTML 1.0 Strict//EN", "", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_nameAndSystemId() throws Exception {
        DocumentType doctype = new DocumentType("html", "", "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE html \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_namePublicIdAndSystemId() throws Exception {
        DocumentType doctype = new DocumentType("html", "-//W3C//DTD XHTML 1.0 Strict//EN", "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_emptyName() throws Exception {
        DocumentType doctype = new DocumentType("", "PUBLIC", "SYSTEM", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        // Based on the logic, if name is blank, it's not appended. PUBLIC and SYSTEM are not valid names on their own.
        // The current implementation would produce <!DOCTYPE PUBLIC "SYSTEM"> if name is empty and publicId is PUBLIC, systemId is SYSTEM.
        // However, the publicId check is `!StringUtil.isBlank(attr("publicId"))` which will be true for "PUBLIC".
        // So it should be <!DOCTYPE PUBLIC "PUBLIC" "SYSTEM">
        assertEquals("<!DOCTYPE PUBLIC \"PUBLIC\" \"SYSTEM\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_emptyPublicId() throws Exception {
        DocumentType doctype = new DocumentType("html", "", "http://example.com/ DTD", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE html \"http://example.com/ DTD\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_emptySystemId() throws Exception {
        DocumentType doctype = new DocumentType("html", "-//Example//DTD//EN", "", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE html PUBLIC \"-//Example//DTD//EN\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_allEmptyExceptBaseUri() throws Exception {
        DocumentType doctype = new DocumentType("", "", "", "http://example.com");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE>", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_nameWithSpaces() throws Exception {
        // StringUtil.isBlank will consider " " as blank. The source code appends directly.
        // Let's test how it behaves with a blank name.
        DocumentType doctype = new DocumentType(" ", "", "", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE>", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_publicIdWithSpaces() throws Exception {
        DocumentType doctype = new DocumentType("html", " ", "", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_systemIdWithSpaces() throws Exception {
        DocumentType doctype = new DocumentType("html", "", " ", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE html>", accum.toString());
    }
    
    @Test
    public void testOuterHtmlHead_complexPublicId() throws Exception {
        DocumentType doctype = new DocumentType("html", "-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd", "", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        // The publicId here contains a systemId string. The code doesn't parse it, just appends.
        // The publicId is appended directly, not enclosed in quotes by outerHtmlHead itself.
        // So it should be <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_systemIdContainingQuotes() throws Exception {
        DocumentType doctype = new DocumentType("html", "", "system\"id", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE html \"system\"id\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_publicIdContainingQuotes() throws Exception {
        DocumentType doctype = new DocumentType("html", "public\"id", "", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE html PUBLIC \"public\"id\">", accum.toString());
    }
    
    @Test
    public void testOuterHtmlHead_unicodeCharactersInIds() throws Exception {
        DocumentType doctype = new DocumentType("html", "PUBLIC\u1234ID", "SYSTEM\u4567ID", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, null);
        assertEquals("<!DOCTYPE html PUBLIC \"PUBLIC\u1234ID\" \"SYSTEM\u4567ID\">", accum.toString());
    }
}
