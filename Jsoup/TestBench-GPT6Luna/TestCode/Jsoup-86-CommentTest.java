package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import java.io.IOException;

public class CommentTest {
    @Test
    public void testNodeName() throws Exception {
        assertEquals("#comment", new Comment("text").nodeName());
    }

    @Test
    public void testEmptyData() throws Exception {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
        assertTrue(comment.toString().contains("<!---->"));
    }

    @Test
    public void testSimpleData() throws Exception {
        Comment comment = new Comment("note");
        assertEquals("note", comment.getData());
        assertTrue(comment.toString().contains("<!--note-->"));
    }

    @Test
    public void testDataWithMarkup() throws Exception {
        Comment comment = new Comment("<b>x</b>");
        assertEquals("<b>x</b>", comment.getData());
        assertTrue(comment.toString().contains("<!--<b>x</b>-->"));
    }

    @Test
    public void testDeprecatedConstructorUsesData() throws Exception {
        Comment comment = new Comment("body", "ignored");
        assertEquals("body", comment.getData());
        assertTrue(comment.toString().contains("<!--body-->"));
    }

    @Test
    public void testOneCharacterIsNotXmlDeclaration() throws Exception {
        assertFalse(new Comment("!").isXmlDeclaration());
    }

    @Test
    public void testEmptyIsNotXmlDeclaration() throws Exception {
        assertFalse(new Comment("").isXmlDeclaration());
    }

    @Test
    public void testQuestionMarkOnlyIsNotXmlDeclaration() throws Exception {
        assertFalse(new Comment("?").isXmlDeclaration());
    }

    @Test
    public void testBangPrefixIsXmlDeclaration() throws Exception {
        assertTrue(new Comment("!x").isXmlDeclaration());
    }

    @Test
    public void testQuestionPrefixIsXmlDeclaration() throws Exception {
        assertTrue(new Comment("?x").isXmlDeclaration());
    }

    @Test
    public void testOtherPrefixIsNotXmlDeclaration() throws Exception {
        assertFalse(new Comment("x?").isXmlDeclaration());
    }

    @Test
    public void testDeclarationWithAttributes() throws Exception {
        XmlDeclaration declaration = new Comment("?xml version=\"1.0\"?>").asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("xml", declaration.name());
        assertTrue(declaration.getWholeDeclaration().contains("version=\"1.0\""));
    }

    @Test
    public void testBangDeclaration() throws Exception {
        XmlDeclaration declaration = new Comment("!DOCTYPE html").asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("DOCTYPE", declaration.name());
    }

    @Test
    public void testDeclarationNameIsNormalized() throws Exception {
        XmlDeclaration declaration = new Comment("?XML?>").asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("XML?", declaration.name());
    }

    @Test
    public void testUnparseableDeclarationReturnsNull() throws Exception {
        assertNull(new Comment("!x").asXmlDeclaration());
    }

    @Test
    public void testDeclarationRetainsAttributeValue() throws Exception {
        XmlDeclaration declaration = new Comment("?xml version=\"1.0\"?>").asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("1.0", declaration.attr("version"));
    }

    @Test
    public void testToStringMatchesOuterHtml() throws Exception {
        Comment comment = new Comment("a & b");
        assertEquals(comment.outerHtml(), comment.toString());
    }

    @Test
    public void testDeclarationEndingWithQuestionMark() throws Exception {
        XmlDeclaration declaration = new Comment("?pi?>").asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("pi?", declaration.name());
    }
}
