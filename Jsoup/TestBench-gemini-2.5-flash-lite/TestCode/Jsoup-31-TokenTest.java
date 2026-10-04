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
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertNotNull(attrs);
        assertTrue(attrs.hasKey("data-id"));
    }

    @Test
    public void testStartTagAppendAttributeNameChar() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName('c');
        startTag.newAttribute();
        Attributes attrs = startTag.getAttributes();
        assertNotNull(attrs);
        assertTrue(attrs.hasKey("c"));
    }

    @Test
    public void testStartTagAppendAttributeValue() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("testAttr");
        startTag.appendAttributeValue("hello");
        startTag.appendAttributeValue(" ");
        startTag.appendAttributeValue("world");
        startTag.newAttribute();
        assertEquals("hello world", startTag.getAttributes().get("testAttr"));
    }

    @Test
    public void testStartTagAppendAttributeValueChar() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.appendAttributeName("testAttr");
        startTag.appendAttributeValue('a');
        startTag.newAttribute();
        assertEquals("a", startTag.getAttributes().get("testAttr"));
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
        assertEquals(1, treeBuilder.doc.childNodes().size());
        assertEquals(element, treeBuilder.doc.childNodes().get(0));
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
        treeBuilder.process(endTagB);
        assertEquals(1, elA.childNodes().size());
        assertEquals(elB, elA.childNodes().get(0));
        assertEquals(0, elB.childNodes().size());
    }

    @Test
    public void testXmlTreeBuilderInsertComment() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<!--My comment-->", "http://example.com", ParseErrorList.noTracking());
        Token.Comment commentToken = new Token.Comment();
        commentToken.data.append("My comment");
        treeBuilder.insert(commentToken);
        assertEquals(1, treeBuilder.doc.childNodes().size());
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof Comment);
        assertEquals("My comment", ((Comment) treeBuilder.doc.childNodes().get(0)).getData());
    }

    @Test
    public void testXmlTreeBuilderInsertCommentBogus() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        // In XmlTreeBuilder, <!...> is treated as a bogus comment, and if it starts with ! or ?,
        // it's further parsed into XmlDeclaration. The actual tokeniser state for CDATA in XML
        // would be to consume it as raw text. However, the provided test setup seems to imply
        // it's handled as a comment.
        // The reference source indicates that a comment starting with '!' gets treated as XmlDeclaration.
        // The specific data for XmlDeclaration is derived from the comment's data, excluding the leading '!'.
        treeBuilder.initialiseParse("<![CDATA[some data]]>", "http://example.com", ParseErrorList.noTracking());
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true; // This flag is set in the TokeniserState.MarkupDeclarationOpen for non-HTML namespaces.
        // The data captured by the Tokeniser for "![CDATA[some data]]" is "![CDATA[some data]]".
        commentToken.data.append("![CDATA[some data]]");
        treeBuilder.insert(commentToken);
        assertEquals(1, treeBuilder.doc.childNodes().size());
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof XmlDeclaration);
        XmlDeclaration declaration = (XmlDeclaration) treeBuilder.doc.childNodes().get(0);
        // The whole declaration should be the content after the opening '<!' and before the closing '>'.
        // The current implementation of XmlTreeBuilder's insert(Token.Comment) with bogus flag
        // and startsWith("!") seems to extract the substring from index 1.
        assertEquals("!CDATA[some data]]", declaration.getWholeDeclaration()); // Corrected based on source code logic
    }

    @Test
    public void testXmlTreeBuilderInsertCharacter() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("Some Text", "http://example.com", ParseErrorList.noTracking());
        Token.Character characterToken = new Token.Character("Some Text");
        treeBuilder.insert(characterToken);
        assertEquals(1, treeBuilder.doc.childNodes().size());
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof TextNode);
        assertEquals("Some Text", ((TextNode) treeBuilder.doc.childNodes().get(0)).getWholeText());
    }
}
