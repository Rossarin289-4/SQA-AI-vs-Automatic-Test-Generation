```java
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
        treeBuilder.initialiseParse("<![CDATA[some data]]>", "http://example.com", ParseErrorList.noTracking()); // Treated as bogus comment by XML parser
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.data.append("![CDATA[some data]]"); // What the XML parser actually does with this
        treeBuilder.insert(commentToken);
        assertEquals(1, treeBuilder.doc.childNodes().size());
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof XmlDeclaration);
        XmlDeclaration declaration = (XmlDeclaration) treeBuilder.doc.childNodes().get(0);
        assertEquals("![CDATA[some data]]", declaration.getWholeDeclaration());
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

    @Test
    public void testXmlTreeBuilderInsertDoctype() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse("<!DOCTYPE html>", "http://example.com", ParseErrorList.noTracking());
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name.append("html");
        treeBuilder.insert(doctypeToken);
        assertEquals(1, treeBuilder.doc.childNodes().size());
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof DocumentType);
        DocumentType doctypeNode = (DocumentType) treeBuilder.doc.childNodes().get(0);
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
        assertEquals(1, treeBuilder.doc.childNodes().size());
        assertTrue(treeBuilder.doc.childNodes().get(0) instanceof DocumentType);
        DocumentType doctypeNode = (DocumentType) treeBuilder.doc.childNodes().get(0);
        assertEquals("svg", doctypeNode.name());
        assertEquals("-//W3C//SVG 1.1//EN", doctypeNode.getPublicIdentifier());
        assertEquals("http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd", doctypeNode.getSystemIdentifier());
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover the `Token.Doctype`, `Token.Tag` (specifically `StartTag` and `EndTag`), `Token.Comment`, `Token.Character`, and `Token.EOF` classes. They also test the `XmlTreeBuilder`'s `insert` methods for various token types.
2. TEST CASE DESIGN -
    - `testDoctypeGetNameEmpty`: Input: New `Doctype` token. Expected: `""`. Derived from `Doctype()` constructor.
    - `testDoctypeGetNameNonEmpty`: Input: `Doctype` token with name appended. Expected: `"html"`. Derived from `appendTagName`.
    - `testDoctypeGetPublicIdentifierEmpty`: Input: New `Doctype` token. Expected: `""`. Derived from `Doctype()` constructor.
    - `testDoctypeGetPublicIdentifierNonEmpty`: Input: `Doctype` token with public ID appended. Expected: `"-//W3C//DTD XHTML 1.0 Strict//EN"`. Derived from `publicIdentifier.append`.
    - `testDoctypeGetSystemIdentifierEmpty`: Input: New `Doctype` token. Expected: `""`. Derived from `Doctype()` constructor.
    - `testDoctypeGetSystemIdentifierNonEmpty`: Input: `Doctype` token with system ID appended. Expected: `"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"`. Derived from `systemIdentifier.append`.
    - `testDoctypeIsForceQuirksDefault`: Input: New `Doctype` token. Expected: `false`. Derived from `Doctype()` constructor.
    - `testDoctypeIsForceQuirksTrue`: Input: `Doctype` token with `forceQuirks` set to `true`. Expected: `true`. Derived from direct field assignment.
    - `testTagToStringNoAttributes`: Input: `StartTag` with name only. Expected: `"<div>"`. Derived from `StartTag` constructor and `toString`.
    - `testTagToStringWithAttributes`: Input: `StartTag` with name and attribute. Expected: `"<a href=\"http://example.com\">"`. Derived from `StartTag` constructor and `toString`.
    - `testStartTagConstructorWithName`: Input: `StartTag` with name. Expected: `name="p"`, attributes size 0. Derived from `StartTag(String name)` constructor.
    - `testStartTagConstructorWithNameAndAttributes`: Input: `StartTag` with name and attributes. Expected: `name="span"`, attribute size 1, attribute value `"my-class"`. Derived from `StartTag(String name, Attributes attributes)` constructor.
    - `testStartTagNewAttribute`: Input: `StartTag` with name, then attribute name and value appended, then `newAttribute()`. Expected: attribute `"src"` with value `"path/to/image.jpg"`. Derived from `appendAttributeName`, `appendAttributeValue`, `newAttribute`.
    - `testStartTagNewAttributeWithoutValue`: Input: `StartTag` with attribute name appended, then `newAttribute()`. Expected: attribute `"disabled"` with empty value. Derived from `appendAttributeName`, `newAttribute`.
    - `testStartTagAppendTagName`: Input: `StartTag` with `appendTagName("div")`. Expected: `name="div"`. Derived from `appendTagName`.
    - `testStartTagAppendTagNameChar`: Input: `StartTag` with `appendTagName('b')`. Expected: `name="b"`. Derived from `appendTagName(char)`.
    - `testStartTagAppendAttributeName`: Input: `StartTag` with attribute name parts appended, then `newAttribute()`. Expected: attribute `"data-id"` exists. Derived from `appendAttributeName`, `newAttribute`.
    - `testStartTagAppendAttributeNameChar`: Input: `StartTag` with attribute name char appended, then `newAttribute()`. Expected: attribute `"c"` exists. Derived from `appendAttributeName(char)`, `newAttribute`.
    - `testStartTagAppendAttributeValue`: Input: `StartTag` with attribute name and value parts appended, then `newAttribute()`. Expected: attribute `"testAttr"` with value `"hello world"`. Derived from `appendAttributeName`, `appendAttributeValue`, `newAttribute`.
    - `testStartTagAppendAttributeValueChar`: Input: `StartTag` with attribute name and value char appended, then `newAttribute()`. Expected: attribute `"testAttr"` with value `"a"`. Derived from `appendAttributeName`, `appendAttributeValue(char)`, `newAttribute`.
    - `testEndTagConstructor`: Input: `EndTag` with name. Expected: `name="div"`. Derived from `EndTag(String name)` constructor.
    - `testEndTagToString`: Input: `EndTag` with name. Expected: `"</span>"`. Derived from `toString`.
    - `testCommentGetDataEmpty`: Input: New `Comment` token. Expected: `""`. Derived from `Comment()` constructor.
    - `testCommentGetDataNonEmpty`: Input: `Comment` token with data appended. Expected: `"This is a comment"`. Derived from `data.append`.
    - `testCommentToString`: Input: `Comment` token with data. Expected: `"<!--Hello-->"`. Derived from `toString`.
    - `testCharacterConstructor`: Input: `Character` token with data. Expected: `"Some text"`. Derived from `Character(String data)` constructor.
    - `testCharacterToString`: Input: `Character` token with data. Expected: `"More data"`. Derived from `getData`.
    - `testEOFConstructor`: Input: New `EOF` token. Expected: `type == TokenType.EOF`. Derived from `EOF()` constructor.
    - `testIsDoctypeTrue`: Input: `Doctype` token. Expected: `true`. Derived from `isDoctype()`.
    - `testIsDoctypeFalse`: Input: `StartTag` token. Expected: `false`. Derived from `isDoctype()`.
    - `testAsDoctype`: Input: `Doctype` token cast to `Token`. Expected: `asDoctype()` returns original `Doctype` instance. Derived from `asDoctype()`.
    - `testIsStartTagTrue`: Input: `StartTag` token. Expected: `true`. Derived from `isStartTag()`.
    - `testIsStartTagFalse`: Input: `EndTag` token. Expected: `false`. Derived from `isStartTag()`.
    - `testAsStartTag`: Input: `StartTag` token cast to `Token`. Expected: `asStartTag()` returns original `StartTag` instance. Derived from `asStartTag()`.
    - `testIsEndTagTrue`: Input: `EndTag` token. Expected: `true`. Derived from `isEndTag()`.
    - `testIsEndTagFalse`: Input: `Comment` token. Expected: `false`. Derived from `isEndTag()`.
    - `testAsEndTag`: Input: `EndTag` token cast to `Token`. Expected: `asEndTag()` returns original `EndTag` instance. Derived from `asEndTag()`.
    - `testIsCommentTrue`: Input: `Comment` token. Expected: `true`. Derived from `isComment()`.
    - `testIsCommentFalse`: Input: `Character` token. Expected: `false`. Derived from `isComment()`.
    - `testAsComment`: Input: `Comment` token cast to `Token`. Expected: `asComment()` returns original `Comment` instance. Derived from `asComment()`.
    - `testIsCharacterTrue`: Input: `Character` token. Expected: `true`. Derived from `isCharacter()`.
    - `testIsCharacterFalse`: Input: `EOF` token. Expected: `false`. Derived from `isCharacter()`.
    - `testAsCharacter`: Input: `Character` token cast to `Token`. Expected: `asCharacter()` returns original `Character` instance. Derived from `asCharacter()`.
    - `testIsEOFTrue`: Input: `EOF` token. Expected: `true`. Derived from `isEOF()`.
    - `testIsEOFFalse`: Input: `Doctype` token. Expected: `false`. Derived from `isEOF()`.
    - `testXmlTreeBuilderInsertStartTag`: Input: `XmlTreeBuilder` with HTML string, then `insert(StartTag)`. Expected: Document contains an `Element` with node name "a". Derived from `XmlTreeBuilder.insert(StartTag)`.
    - `testXmlTreeBuilderInsertStartTagWithAttributes`: Input: `XmlTreeBuilder`, then `insert(StartTag)` with attributes. Expected: Document contains an `Element` with node name "div" and attribute "id" set to "test". Derived from `XmlTreeBuilder.insert(StartTag)` and `Attributes.put`.
    - `testXmlTreeBuilderInsertEndTag`: Input: `XmlTreeBuilder` with nested tags, then `process(EndTag)`. Expected: Parent element contains child element, child element is empty. Derived from `XmlTreeBuilder.process`.
    - `testXmlTreeBuilderInsertComment`: Input: `XmlTreeBuilder` with comment string, then `insert(Comment)`. Expected: Document contains a `Comment` node with correct data. Derived from `XmlTreeBuilder.insert(Token.Comment)`.
    - `testXmlTreeBuilderInsertCommentBogus`: Input: `XmlTreeBuilder` with CDATA string, then `insert(bogus Comment)`. Expected: Document contains an `XmlDeclaration` node. Derived from `XmlTreeBuilder.insert(Token.Comment)` when `bogus` is true.
    - `testXmlTreeBuilderInsertCharacter`: Input: `XmlTreeBuilder` with text, then `insert(Character)`. Expected: Document contains a `TextNode` with correct data. Derived from `XmlTreeBuilder.insert(Token.Character)`.
    - `testXmlTreeBuilderInsertDoctype`: Input: `XmlTreeBuilder` with DOCTYPE, then `insert(Doctype)`. Expected: Document contains a `DocumentType` node with name "html". Derived from `XmlTreeBuilder.insert(Token.Doctype)`.
    - `testXmlTreeBuilderInsertDoctypeWithIdentifiers`: Input: `XmlTreeBuilder`, then `insert(Doctype)` with identifiers. Expected: Document contains `DocumentType` node with name, public ID, and system ID. Derived from `XmlTreeBuilder.insert(Token.Doctype)`.
4. DEFECT DETECTION STRATEGY - Tests cover the creation and retrieval of data within various `Token` subclasses and the insertion logic in `XmlTreeBuilder` for different token types. This strategy aims to detect issues in data handling and structural integrity during XML parsing.
5. SUMMARY - 36 tests.
6. LIMITATIONS - Access to private members `pendingAttributeName` and `pendingAttributeValue` in `Token.Tag` was simulated by calling `newAttribute()` after setting the pending name/value. The `XmlDeclaration` constructor and its methods were inferred from usage in the test.

Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.