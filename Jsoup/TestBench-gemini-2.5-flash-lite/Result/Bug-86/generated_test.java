package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import java.io.IOException;

public class CommentTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testNodeName() throws Exception {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() throws Exception {
        Comment comment = new Comment("This is a comment.");
        assertEquals("This is a comment.", comment.getData());
    }

    @Test
    public void testGetDataEmpty() throws Exception {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void testGetDataWithAngleBrackets() throws Exception {
        Comment comment = new Comment("<!-- nested comment -->");
        assertEquals("<!-- nested comment -->", comment.getData());
    }

    @Test
    public void testToString() throws Exception {
        Comment comment = new Comment("A comment");
        assertEquals("<!--A comment-->", comment.toString());
    }

    @Test
    public void testToStringWithHtmlEntities() throws Exception {
        // The output.toString() method does not escape HTML entities within the comment data.
        Comment comment = new Comment("Comment with &lt; and &gt;");
        assertEquals("<!--Comment with &lt; and &gt;-->", comment.toString());
    }

    @Test
    public void testIsXmlDeclaration_true_exclamation() throws Exception {
        Comment comment = new Comment("!DOCTYPE html");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_true_question_mark() throws Exception {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_false_regular_comment() throws Exception {
        Comment comment = new Comment("This is a regular comment");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testIsXmlDeclaration_false_short_data() throws Exception {
        Comment comment = new Comment("?"); // Needs to be longer than 1 character to be considered a declaration
        assertFalse(comment.isXmlDeclaration());
    }
     @Test
    public void testIsXmlDeclaration_false_empty_data() throws Exception {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration_valid_doctype() throws Exception {
        Comment comment = new Comment("!DOCTYPE html");
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("!DOCTYPE html", declaration.getWholeDeclaration());
        // The asXmlDeclaration method parses the content and creates an XmlDeclaration.
        // The original comment data is used to construct the XmlDeclaration.
        assertEquals("!DOCTYPE", declaration.name());
    }

    @Test
    public void testAsXmlDeclaration_valid_xml_declaration() throws Exception {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("?xml version=\"1.0\" encoding=\"UTF-8\"?", declaration.getWholeDeclaration());
        assertEquals("?xml version=\"1.0\" encoding=\"UTF-8\"?", declaration.name());
    }

    @Test
    public void testAsXmlDeclaration_regular_comment() throws Exception {
        Comment comment = new Comment("This is a regular comment");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration_empty_comment() throws Exception {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration_short_data_exclamation() throws Exception {
        Comment comment = new Comment("!");
        // "!" is not a valid XML declaration or processing instruction start.
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration_short_data_question_mark() throws Exception {
        Comment comment = new Comment("?");
        // "?" alone is not a valid XML declaration or processing instruction start.
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration_invalid_xml_structure() throws Exception {
        Comment comment = new Comment("!DOCTYPE html invalid");
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration);
        // The parsing mechanism for XML declaration might be lenient.
        // Jsoup.parse("<" + data.substring(1, data.length() -1) + ">", ...)
        // For "!DOCTYPE html invalid", data.substring(1, data.length() -1) would be "DOCTYPE html invalid"
        // Jsoup.parse("<DOCTYPE html invalid>", ...) will create an element with tag "DOCTYPE html invalid".
        // The XmlDeclaration constructor uses the original data for getWholeDeclaration.
        assertEquals("!DOCTYPE html invalid", declaration.getWholeDeclaration());
        assertEquals("!DOCTYPE html invalid", declaration.name());
    }

    @Test
    public void testAsXmlDeclaration_with_attributes() throws Exception {
        Comment comment = new Comment("!ENTITY foo \"bar\"");
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("!ENTITY foo \"bar\"", declaration.getWholeDeclaration());
        assertEquals("!ENTITY foo \"bar\"", declaration.name());
    }

    @Test
    public void testOuterHtmlHead_prettyPrint_true() throws Exception {
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().prettyPrint(true);
        Comment comment = new Comment("content");
        StringBuilder accum = new StringBuilder();
        // The outerHtmlHead method does not add indentation if depth is 0.
        comment.outerHtmlHead(accum, 0, doc.outputSettings());
        assertEquals("<!--content-->", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_prettyPrint_false() throws Exception {
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().prettyPrint(false);
        Comment comment = new Comment("content");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, doc.outputSettings());
        assertEquals("<!--content-->", accum.toString());
    }

    @Test
    public void testOuterHtmlHead_with_indentation() throws Exception {
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().prettyPrint(true);
        Comment comment = new Comment("content");
        StringBuilder accum = new StringBuilder();
        // The indent method is called only if out.prettyPrint() is true and depth > 0.
        // In this case, depth is 1. However, indent does not add spaces for depth 0,
        // and the indentation logic for depth > 0 might depend on other settings not visible here.
        // For comments, the indent method is called before appending "<!--".
        // The reference output for depth 1 without explicit indent size set is just the comment itself.
        comment.outerHtmlHead(accum, 1, doc.outputSettings());
        assertEquals("<!--content-->", accum.toString());
    }

    @Test
    public void testOuterHtmlTail_does_nothing() throws Exception {
        Document doc = Document.createShell("http://example.com/");
        Comment comment = new Comment("content");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, doc.outputSettings());
        assertEquals("", accum.toString());
    }

    @Test
    public void testConstructorWithBaseUri() throws Exception {
        Comment comment = new Comment("data", "http://example.com/");
        assertEquals("data", comment.getData());
    }
}
