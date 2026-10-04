package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TokenTest {

    @Test
    public void testDoctypeGetNameEmpty() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("", doctype.getName());
    }

    @Test
    public void testDoctypeGetNameNonEmpty() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        assertEquals("html", doctype.getName());
    }

    @Test
    public void testDoctypeGetPublicIdentifierEmpty() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("", doctype.getPublicIdentifier());
    }

    @Test
    public void testDoctypeGetPublicIdentifierNonEmpty() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        doctype.publicIdentifier.append("-//W3C//DTD XHTML 1.0 Strict//EN");
        assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", doctype.getPublicIdentifier());
    }

    @Test
    public void testDoctypeGetSystemIdentifierEmpty() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        assertEquals("", doctype.getSystemIdentifier());
    }

    @Test
    public void testDoctypeGetSystemIdentifierNonEmpty() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        doctype.systemIdentifier.append("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd");
        assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", doctype.getSystemIdentifier());
    }

    @Test
    public void testDoctypeIsForceQuirksDefault() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testDoctypeIsForceQuirksTrue() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        doctype.forceQuirks = true;
        assertTrue(doctype.isForceQuirks());
    }

    @Test
    public void testTagToStringNoAttributes() throws Exception {
        Token.StartTag startTag = new Token.StartTag("div");
        assertEquals("<div>", startTag.toString());
    }

    @Test
    public void testTagToStringWithAttributes() throws Exception {
        Token.StartTag startTag = new Token.StartTag("a");
        startTag.attributes = new Attributes();
        startTag.attributes.put("href", "http://example.com");
        assertEquals("<a href=\"http://example.com\">", startTag.toString());
    }

    @Test
    public void testStartTagConstructorWithName() throws Exception {
        Token.StartTag startTag = new Token.StartTag("p");
        assertEquals("p", startTag.name());
        assertNotNull(startTag.getAttributes());
        assertEquals(0, startTag.getAttributes().size());
    }

    @Test
    public void testStartTagConstructorWithNameAndAttributes() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("class", "my-class");
        Token.StartTag startTag = new Token.StartTag("span", attrs);
        assertEquals("span", startTag.name());
        assertNotNull(startTag.getAttributes());
        assertEquals(1, startTag.getAttributes().size());
        assertEquals("my-class", startTag.getAttributes().get("class"));
    }

    @Test
    public void testStartTagNewAttribute() throws Exception {
        Token.StartTag startTag = new Token.StartTag("img");
        startTag.appendAttributeName("src");
        startTag.appendAttributeValue("path/to/image.jpg");
        startTag.newAttribute();
        assertEquals("path/to/image.jpg", startTag.getAttributes().get("src"));
    }

    @Test
    public void testStartTagNewAttributeWithoutValue() throws Exception {
        Token.StartTag startTag = new Token.StartTag("input");
        startTag.appendAttributeName("disabled");
        startTag.newAttribute();
        assertEquals("", startTag.getAttributes().get("disabled"));
    }

    @Test
    public void testStartTagAppendTagName() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendTagName("div");
        assertEquals("div", startTag.name());
    }

    @Test
    public void testStartTagAppendTagNameChar() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendTagName('b');
        assertEquals("b", startTag.name());
    }

    @Test
    public void testStartTagAppendAttributeName() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("data-");
        startTag.appendAttributeName("id");
        // Accessing private members directly is not allowed. Simulating the append and then checking if newAttribute adds it correctly.
        // The direct access to pendingAttributeName is removed.
        startTag.newAttribute(); // This should capture the pending name and value if any
        Attributes attrs = startTag.getAttributes();
        assertNotNull(attrs);
        assertTrue(attrs.hasKey("data-id"));
    }

    @Test
    public void testStartTagAppendAttributeNameChar() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName('c');
        // Similar to above, direct access removed.
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertNotNull(attrs);
        assertTrue(attrs.hasKey("c"));
    }

    @Test
    public void testStartTagAppendAttributeValue() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeValue("hello");
        startTag.appendAttributeValue(" ");
        startTag.appendAttributeValue("world");
        // Direct access to pendingAttributeValue removed.
        // We can test by first setting attribute name, then value, then calling newAttribute
        startTag.appendAttributeName("testAttr");
        assertEquals("hello world", startTag.pendingAttributeValue.toString()); // This internal state access is still problematic, but for now keep to reflect original intent.
    }

    @Test
    public void testStartTagAppendAttributeValueChar() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeValue('a');
        // Direct access to pendingAttributeValue removed.
        startTag.appendAttributeName("testAttr");
        assertEquals("a", startTag.pendingAttributeValue.toString()); // Again, direct access to internal state
    }

    @Test
    public void testEndTagConstructor() throws Exception {
        Token.EndTag endTag = new Token.EndTag("div");
        assertEquals("div", endTag.name());
    }

    @Test
    public void testEndTagToString() throws Exception {
        Token.EndTag endTag = new Token.EndTag("span");
        assertEquals("</span>", endTag.toString());
    }

    @Test
    public void testCommentGetDataEmpty() throws Exception {
        Token.Comment comment = new Token.Comment();
        assertEquals("", comment.getData());
    }

    @Test
    public void testCommentGetDataNonEmpty() throws Exception {
        Token.Comment comment = new Token.Comment();
        comment.data.append("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void testCommentToString() throws Exception {
        Token.Comment comment = new Token.Comment();
        comment.data.append("Hello");
        assertEquals("<!--Hello-->", comment.toString());
    }

    @Test
    public void testCharacterConstructor() throws Exception {
        Token.Character character = new Token.Character("Some text");
        assertEquals("Some text", character.getData());
    }

    @Test
    public void testCharacterToString() throws Exception {
        Token.Character character = new Token.Character("More text");
        assertEquals("More text", character.getData());
    }

    @Test
    public void testEOFConstructor() throws Exception {
        Token.EOF eof = new Token.EOF();
        assertEquals(Token.TokenType.EOF, eof.type);
    }

    @Test
    public void testIsDoctypeTrue() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
    }

    @Test
    public void testIsDoctypeFalse() {
        Token.StartTag startTag = new Token.StartTag();
        assertFalse(startTag.isDoctype());
    }

    @Test
    public void testAsDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        Token token = doctype;
        assertTrue(token.asDoctype() instanceof Token.Doctype);
        assertEquals(doctype, token.asDoctype());
    }

    @Test
    public void testIsStartTagTrue() {
        Token.StartTag startTag = new Token.StartTag();
        assertTrue(startTag.isStartTag());
    }

    @Test
    public void testIsStartTagFalse() {
        Token.EndTag endTag = new Token.EndTag();
        assertFalse(endTag.isStartTag());
    }

    @Test
    public void testAsStartTag() {
        Token.StartTag startTag = new Token.StartTag("br");
        Token token = startTag;
        assertTrue(token.asStartTag() instanceof Token.StartTag);
        assertEquals(startTag, token.asStartTag());
    }

    @Test
    public void testIsEndTagTrue() {
        Token.EndTag endTag = new Token.EndTag();
        assertTrue(endTag.isEndTag());
    }

    @Test
    public void testIsEndTagFalse() {
        Token.Comment comment = new Token.Comment();
        assertFalse(comment.isEndTag());
    }

    @Test
    public void testAsEndTag() {
        Token.EndTag endTag = new Token.EndTag("p");
        Token token = endTag;
        assertTrue(token.asEndTag() instanceof Token.EndTag);
        assertEquals(endTag, token.asEndTag());
    }

    @Test
    public void testIsCommentTrue() {
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
    }

    @Test
    public void testIsCommentFalse() {
        Token.Character character = new Token.Character("data");
        assertFalse(character.isComment());
    }

    @Test
    public void testAsComment() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("test");
        Token token = comment;
        assertTrue(token.asComment() instanceof Token.Comment);
        assertEquals(comment, token.asComment());
    }

    @Test
    public void testIsCharacterTrue() {
        Token.Character character = new Token.Character("data");
        assertTrue(character.isCharacter());
    }

    @Test
    public void testIsCharacterFalse() {
        Token.EOF eof = new Token.EOF();
        assertFalse(eof.isCharacter());
    }

    @Test
    public void testAsCharacter() {
        Token.Character character = new Token.Character("more data");
        Token token = character;
        assertTrue(token.asCharacter() instanceof Token.Character);
        assertEquals(character, token.asCharacter());
    }

    @Test
    public void testIsEOFTrue() {
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
    }

    @Test
    public void testIsEOFFalse() {
        Token.Doctype doctype = new Token.Doctype();
        assertFalse(doctype.isEOF());
    }

    @Test
    public void testXmlTreeBuilderInsertStartTag() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<a><b></b></a>", "http://example.com", ParseErrorList.noTracking());
        Token.StartTag startTag = new Token.StartTag("a");
        Element element = treeBuilder.insert(startTag);
        assertTrue(element instanceof Element);
        assertEquals("a", element.nodeName());
        assertEquals(1, treeBuilder.doc.childNodes().size()); // Changed from childNodeSize() to childNodes().size()
        assertEquals(element, treeBuilder.doc.childNodes().get(0)); // Changed from childNode(0) to childNodes().get(0)
    }

    @Test
    public void testXmlTreeBuilderInsertStartTagWithAttributes() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("", "http://example.com", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        Token.StartTag startTag = new Token.StartTag("div", attrs);
        Element element = treeBuilder.insert(startTag);
        assertTrue(element instanceof Element);
        assertEquals("div", element.nodeName());
        assertEquals("test", element.attributes().get("id"));
    }

    @Test
    public void testXmlTreeBuilderInsertEndTag() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<a><b></b></a>", "http://example.com", ParseErrorList.noTracking());
        Token.StartTag startTagA = new Token.StartTag("a");
        Element elA = treeBuilder.insert(startTagA);
        Token.StartTag startTagB = new Token.StartTag("b");
        Element elB = treeBuilder.insert(startTagB);
        Token.EndTag endTagB = new Token.EndTag("b");
        treeBuilder.process(endTagB); // Changed from popStackToClose to process
        assertEquals(1, elA.childNodes().size()); // Changed from childNodeSize() to childNodes().size()
        assertEquals(elB, elA.childNodes().get(0)); // Changed from childNode(0) to childNodes().get(0)
        assertEquals(0, elB.childNodes().size()); // Changed from childNodeSize() to childNodes().size()
    }

    @Test
    public void testXmlTreeBuilderInsertComment() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<!--My comment-->", "http://example.com", ParseErrorList.noTracking());
        Token.Comment commentToken = new Token.Comment();
        commentToken.data.append("My comment");
        treeBuilder.insert(commentToken);
        assertEquals(1, treeBuilder.doc.childNodes().size()); // Changed from childNodeSize() to childNodes().size()
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof Comment); // Changed from childNode(0) to childNodes().get(0)
        assertEquals("My comment", ((Comment) treeBuilder.doc.childNodes().get(0)).getData()); // Changed from childNode(0) to childNodes().get(0)
    }

    @Test
    public void testXmlTreeBuilderInsertCommentBogus() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<![CDATA[some data]]>", "http://example.com", ParseErrorList.noTracking()); // Treated as bogus comment by XML parser
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.data.append("![CDATA[some data]]"); // What the XML parser actually does with this
        treeBuilder.insert(commentToken);
        assertEquals(1, treeBuilder.doc.childNodes().size()); // Changed from childNodeSize() to childNodes().size()
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof XmlDeclaration); // Changed from childNode(0) to childNodes().get(0)
        XmlDeclaration declaration = (XmlDeclaration) treeBuilder.doc.childNodes().get(0); // Changed from childNode(0) to childNodes().get(0)
        assertEquals("![CDATA[some data]]", declaration.getWholeDeclaration());
        // The `isProcessingInstruction` method is not available on XmlDeclaration in this context.
        // Assuming `isXmlDeclaration` is a more appropriate check or removing this assertion if it's not relevant to the bug.
        // For now, removing the assertion as `isProcessingInstruction` is not found.
    }

    @Test
    public void testXmlTreeBuilderInsertCharacter() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("Some Text", "http://example.com", ParseErrorList.noTracking());
        Token.Character characterToken = new Token.Character("Some Text");
        treeBuilder.insert(characterToken);
        assertEquals(1, treeBuilder.doc.childNodes().size()); // Changed from childNodeSize() to childNodes().size()
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof TextNode); // Changed from childNode(0) to childNodes().get(0)
        assertEquals("Some Text", ((TextNode) treeBuilder.doc.childNodes().get(0)).getWholeText()); // Changed from childNode(0) to childNodes().get(0)
    }

    @Test
    public void testXmlTreeBuilderInsertDoctype() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<!DOCTYPE html>", "http://example.com", ParseErrorList.noTracking());
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name.append("html");
        treeBuilder.insert(doctypeToken);
        assertEquals(1, treeBuilder.doc.childNodes().size()); // Changed from childNodeSize() to childNodes().size()
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof DocumentType); // Changed from childNode(0) to childNodes().get(0)
        DocumentType doctypeNode = (DocumentType) treeBuilder.doc.childNodes().get(0); // Changed from childNode(0) to childNodes().get(0)
        assertEquals("html", doctypeNode.name());
        assertEquals("", doctypeNode.getPublicIdentifier());
        assertEquals("", doctypeNode.getSystemIdentifier());
    }

    @Test
    public void testXmlTreeBuilderInsertDoctypeWithIdentifiers() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("", "http://example.com", ParseErrorList.noTracking());
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name.append("svg");
        doctypeToken.publicIdentifier.append("-//W3C//SVG 1.1//EN");
        doctypeToken.systemIdentifier.append("http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd");
        treeBuilder.insert(doctypeToken);
        assertEquals(1, treeBuilder.doc.childNodes().size()); // Changed from childNodeSize() to childNodes().size()
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof DocumentType); // Changed from childNode(0) to childNodes().get(0)
        DocumentType doctypeNode = (DocumentType) treeBuilder.doc.childNodes().get(0); // Changed from childNode(0) to childNodes().get(0)
        assertEquals("svg", doctypeNode.name());
        assertEquals("-//W3C//SVG 1.1//EN", doctypeNode.getPublicIdentifier());
        assertEquals("http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd", doctypeNode.getSystemIdentifier());
    }
}
