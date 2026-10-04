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
        assertEquals("DOCTYPE", declaration.name());
        // isProcessingInstruction() is not available in the provided API outline for XmlDeclaration
        // assertFalse(declaration.isProcessingInstruction());
    }

    @Test
    public void testAsXmlDeclaration_valid_xml_declaration() throws Exception {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("?xml version=\"1.0\" encoding=\"UTF-8\"?", declaration.getWholeDeclaration());
        // isProcessingInstruction() is not available in the provided API outline for XmlDeclaration
        // assertTrue(declaration.isProcessingInstruction());
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
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration_short_data_question_mark() throws Exception {
        Comment comment = new Comment("?");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration_invalid_xml_structure() throws Exception {
        Comment comment = new Comment("!DOCTYPE html invalid"); // This might not parse correctly as a tag
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration); // It will still try to parse. The key is what `asXmlDeclaration` returns.
        assertEquals("!DOCTYPE html invalid", declaration.getWholeDeclaration());
        // isProcessingInstruction() is not available in the provided API outline for XmlDeclaration
        // assertFalse(declaration.isProcessingInstruction());
    }

    @Test
    public void testAsXmlDeclaration_with_attributes() throws Exception {
        Comment comment = new Comment("!ENTITY foo \"bar\"");
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("!ENTITY foo \"bar\"", declaration.getWholeDeclaration());
        // isProcessingInstruction() is not available in the provided API outline for XmlDeclaration
        // assertFalse(declaration.isProcessingInstruction());
    }

    @Test
    public void testOuterHtmlHead_prettyPrint_true() throws Exception {
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().prettyPrint(true);
        Comment comment = new Comment("content");
        StringBuilder accum = new StringBuilder();
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
        // indentSize(int) is not available in the provided API outline for OutputSettings
        // doc.outputSettings().prettyPrint(true).indentSize(2);
        doc.outputSettings().prettyPrint(true); // Keep pretty print as true
        Comment comment = new Comment("content");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 1, doc.outputSettings());
        // The indentation part is removed due to the removal of indentSize
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
